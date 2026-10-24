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

@ObfuscatedName("CPJIVKZX")
public final class CPJIVKZX implements ImageProducer, ImageObserver {

	@ObfuscatedName("CPJIVKZX.c")
	public int field540;

	@ObfuscatedName("CPJIVKZX.d")
	public int field541;

	@ObfuscatedName("CPJIVKZX.b")
	public int[] field539;

	@ObfuscatedName("CPJIVKZX.e")
	public ColorModel field542;

	@ObfuscatedName("CPJIVKZX.g")
	public Image field544;

	@ObfuscatedName("CPJIVKZX.f")
	public ImageConsumer field543;

	public CPJIVKZX(int arg0, int arg1, Component arg2) {
		field540 = arg0;
		field541 = arg1;
		field539 = new int[arg0 * arg1];
		field542 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field544 = arg2.createImage(this);
		method174();
		arg2.prepareImage(field544, this);
		method174();
		arg2.prepareImage(field544, this);
		method174();
		arg2.prepareImage(field544, this);
		method172();
	}

	@ObfuscatedName("CPJIVKZX.a(I)V")
	public void method172() {
		JJCVVTJN.method253(field541, field540, field539);
	}

	@ObfuscatedName("CPJIVKZX.a(Ljava/awt/Graphics;ZII)V")
	public void method173(Graphics arg0, int arg1, int arg2) {
		method174();
		arg0.drawImage(field544, arg1, arg2, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field543 = arg0;
		arg0.setDimensions(field540, field541);
		arg0.setProperties(null);
		arg0.setColorModel(field542);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field543 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field543 == arg0) {
			field543 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("CPJIVKZX.a()V")
	public synchronized void method174() {
		if (field543 != null) {
			field543.setPixels(0, 0, field540, field541, field542, field539, 0, field540);
			field543.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
