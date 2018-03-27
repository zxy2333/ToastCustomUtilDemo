package com.why.project.toastcustomutildemo.util;


import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

import com.why.project.toastcustomutildemo.MyApplication;
import com.why.project.toastcustomutildemo.views.ToastCustom;

/**
 * Create By HaiyuKing
 * Used 简单的Toast封装类,自定义Toast的显示风格
 */
public class ToastCustomUtil {

	private static ToastCustom toast;//实现不管我们触发多少次Toast调用，都只会持续一次Toast显示的时长

	/**
	 * 短时间显示Toast【居下】
	 * @param msg 显示的内容-字符串*/
	public static void showShortToast(String msg) {
		if(MyApplication.getAppContext() != null){
			if (toast == null) {
				toast = ToastCustom.makeText(MyApplication.getAppContext(), msg, Toast.LENGTH_SHORT);
			} else {
				toast.setText(msg);
			}
			//1、setGravity方法必须放到这里，否则会出现toast始终按照第一次显示的位置进行显示（比如第一次是在底部显示，那么即使设置setGravity在中间，也不管用）
			//2、虽然默认是在底部显示，但是，因为这个工具类实现了中间显示，所以需要还原，还原方式如下：
			toast.setGravity(Gravity.BOTTOM, 0, dip2px(MyApplication.getAppContext(),64));
			toast.show();
		}
	}
	/**
	 * 短时间显示Toast【居中】
	 * @param msg 显示的内容-字符串*/
	public static void showShortToastCenter(String msg){
		if(MyApplication.getAppContext() != null) {
			if (toast == null) {
				toast = ToastCustom.makeText(MyApplication.getAppContext(), msg, Toast.LENGTH_SHORT);
			} else {
				toast.setText(msg);
			}
			toast.setGravity(Gravity.CENTER, 0, 0);
			toast.show();
		}
	}

	/**
	 * 短时间显示Toast【居上】
	 * @param msg 显示的内容-字符串*/
	public static void showShortToastTop(String msg){
		if(MyApplication.getAppContext() != null) {
			if (toast == null) {
				toast = ToastCustom.makeText(MyApplication.getAppContext(), msg, Toast.LENGTH_SHORT);
			} else {
				toast.setText(msg);
			}
			toast.setGravity(Gravity.TOP, 0, 0);
			toast.show();
		}
	}

	/**
	 * 长时间显示Toast【居下】
	 * @param msg 显示的内容-字符串*/
	public static void showLongToast(String msg) {
		if(MyApplication.getAppContext() != null) {
			if (toast == null) {
				toast = ToastCustom.makeText(MyApplication.getAppContext(), msg, Toast.LENGTH_LONG);
			} else {
				toast.setText(msg);
			}
			toast.setGravity(Gravity.BOTTOM, 0, dip2px(MyApplication.getAppContext(),64));
			toast.show();
		}
	}
	/**
	 * 长时间显示Toast【居中】
	 * @param msg 显示的内容-字符串*/
	public static void showLongToastCenter(String msg){
		if(MyApplication.getAppContext() != null) {
			if (toast == null) {
				toast = ToastCustom.makeText(MyApplication.getAppContext(), msg, Toast.LENGTH_LONG);
			} else {
				toast.setText(msg);
			}
			toast.setGravity(Gravity.CENTER, 0, 0);
			toast.show();
		}
	}
	/**
	 * 长时间显示Toast【居上】
	 * @param msg 显示的内容-字符串*/
	public static void showLongToastTop(String msg){
		if(MyApplication.getAppContext() != null) {
			if (toast == null) {
				toast = ToastCustom.makeText(MyApplication.getAppContext(), msg, Toast.LENGTH_LONG);
			} else {
				toast.setText(msg);
			}
			toast.setGravity(Gravity.TOP, 0, 0);
			toast.show();
		}
	}

	/*=================================常用公共方法============================*/
	public static int dip2px(Context context, float dpValue) {
		final float scale = context.getResources().getDisplayMetrics().density;
		return (int) (dpValue * scale + 0.5f);
	}
}