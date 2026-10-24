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

@ObfuscatedName("ARAKDHLD")
public final class ARAKDHLD implements ImageProducer, ImageObserver {

	@ObfuscatedName("ARAKDHLD.c")
	public int field12;

	@ObfuscatedName("ARAKDHLD.d")
	public int field13;

	@ObfuscatedName("ARAKDHLD.b")
	public int[] field11;

	@ObfuscatedName("ARAKDHLD.e")
	public ColorModel field14;

	@ObfuscatedName("ARAKDHLD.g")
	public Image field16;

	@ObfuscatedName("ARAKDHLD.f")
	public ImageConsumer field15;

	public ARAKDHLD(int arg0, Component arg1, int arg2) {
		field12 = arg2;
		field13 = arg0;
		field11 = new int[arg0 * arg2];
		field14 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field16 = arg1.createImage(this);
		method15();
		arg1.prepareImage(field16, this);
		method15();
		arg1.prepareImage(field16, this);
		method15();
		arg1.prepareImage(field16, this);
		method13();
	}

	@ObfuscatedName("ARAKDHLD.a(B)V")
	public void method13() {
		ACKHPAZA.method1(field13, field11, field12);
	}

	@ObfuscatedName("ARAKDHLD.a(Ljava/awt/Graphics;III)V")
	public void method14(Graphics arg0, int arg1, int arg2) {
		method15();
		arg0.drawImage(field16, arg1, arg2, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field15 = arg0;
		arg0.setDimensions(field12, field13);
		arg0.setProperties(null);
		arg0.setColorModel(field14);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field15 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field15 == arg0) {
			field15 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("ARAKDHLD.a()V")
	public synchronized void method15() {
		if (field15 != null) {
			field15.setPixels(0, 0, field12, field13, field14, field11, 0, field12);
			field15.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
