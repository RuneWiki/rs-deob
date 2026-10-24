package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;

@ObfuscatedName("AKBGAGNS")
public final class AKBGAGNS implements ImageProducer, ImageObserver {

	@ObfuscatedName("AKBGAGNS.e")
	public int field2;

	@ObfuscatedName("AKBGAGNS.f")
	public int field3;

	@ObfuscatedName("AKBGAGNS.d")
	public int[] field1;

	@ObfuscatedName("AKBGAGNS.g")
	public ColorModel field4;

	@ObfuscatedName("AKBGAGNS.i")
	public Image field6;

	@ObfuscatedName("AKBGAGNS.h")
	public ImageConsumer field5;

	public AKBGAGNS(int arg0, Component arg1, int arg2) {
		field2 = arg2;
		field3 = arg0;
		field1 = new int[arg0 * arg2];
		field4 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field6 = arg1.createImage(this);
		method3();
		arg1.prepareImage(field6, this);
		method3();
		arg1.prepareImage(field6, this);
		method3();
		arg1.prepareImage(field6, this);
		method1();
	}

	@ObfuscatedName("AKBGAGNS.a(B)V")
	public void method1() {
		IBBQNXJX.method251(field1, field2, field3);
	}

	@ObfuscatedName("AKBGAGNS.a(IIBLjava/awt/Graphics;)V")
	public void method2(int arg0, int arg1, Graphics arg2) {
		method3();
		arg2.drawImage(field6, arg1, arg0, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field5 = arg0;
		arg0.setDimensions(field2, field3);
		arg0.setProperties(null);
		arg0.setColorModel(field4);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field5 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field5 == arg0) {
			field5 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("AKBGAGNS.a()V")
	public synchronized void method3() {
		if (field5 != null) {
			field5.setPixels(0, 0, field2, field3, field4, field1, 0, field2);
			field5.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
