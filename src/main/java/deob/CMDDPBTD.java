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

@ObfuscatedName("CMDDPBTD")
public final class CMDDPBTD implements ImageProducer, ImageObserver {

	@ObfuscatedName("CMDDPBTD.d")
	public int field478;

	@ObfuscatedName("CMDDPBTD.e")
	public int field479;

	@ObfuscatedName("CMDDPBTD.c")
	public int[] field477;

	@ObfuscatedName("CMDDPBTD.f")
	public ColorModel field480;

	@ObfuscatedName("CMDDPBTD.h")
	public Image field482;

	@ObfuscatedName("CMDDPBTD.g")
	public ImageConsumer field481;

	public CMDDPBTD(int arg0, Component arg1, int arg2) {
		field478 = arg2;
		field479 = arg0;
		field477 = new int[arg0 * arg2];
		field480 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field482 = arg1.createImage(this);
		method178();
		arg1.prepareImage(field482, this);
		method178();
		arg1.prepareImage(field482, this);
		method178();
		arg1.prepareImage(field482, this);
		method176();
	}

	@ObfuscatedName("CMDDPBTD.a(I)V")
	public void method176() {
		IIPNJDNO.method317(field477, field479, field478);
	}

	@ObfuscatedName("CMDDPBTD.a(IZLjava/awt/Graphics;I)V")
	public void method177(int arg0, Graphics arg1, int arg2) {
		method178();
		arg1.drawImage(field482, arg2, arg0, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field481 = arg0;
		arg0.setDimensions(field478, field479);
		arg0.setProperties(null);
		arg0.setColorModel(field480);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field481 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field481 == arg0) {
			field481 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("CMDDPBTD.a()V")
	public synchronized void method178() {
		if (field481 != null) {
			field481.setPixels(0, 0, field478, field479, field480, field477, 0, field478);
			field481.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
