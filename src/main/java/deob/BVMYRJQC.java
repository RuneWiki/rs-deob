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

@ObfuscatedName("BVMYRJQC")
public final class BVMYRJQC implements ImageProducer, ImageObserver {

	@ObfuscatedName("BVMYRJQC.d")
	public int field129;

	@ObfuscatedName("BVMYRJQC.e")
	public int field130;

	@ObfuscatedName("BVMYRJQC.c")
	public int[] field128;

	@ObfuscatedName("BVMYRJQC.f")
	public ColorModel field131;

	@ObfuscatedName("BVMYRJQC.h")
	public Image field133;

	@ObfuscatedName("BVMYRJQC.g")
	public ImageConsumer field132;

	public BVMYRJQC(int arg0, Component arg1, int arg2) {
		field129 = arg2;
		field130 = arg0;
		field128 = new int[arg0 * arg2];
		field131 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field133 = arg1.createImage(this);
		method36();
		arg1.prepareImage(field133, this);
		method36();
		arg1.prepareImage(field133, this);
		method36();
		arg1.prepareImage(field133, this);
		method34();
	}

	@ObfuscatedName("BVMYRJQC.a(I)V")
	public void method34() {
		IGZZCJOU.method240(field128, field129, field130);
	}

	@ObfuscatedName("BVMYRJQC.a(Ljava/awt/Graphics;III)V")
	public void method35(Graphics arg0, int arg1, int arg2) {
		method36();
		arg0.drawImage(field133, arg1, arg2, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field132 = arg0;
		arg0.setDimensions(field129, field130);
		arg0.setProperties(null);
		arg0.setColorModel(field131);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field132 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field132 == arg0) {
			field132 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("BVMYRJQC.a()V")
	public synchronized void method36() {
		if (field132 != null) {
			field132.setPixels(0, 0, field129, field130, field131, field128, 0, field129);
			field132.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
