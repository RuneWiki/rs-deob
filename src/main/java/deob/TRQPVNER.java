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

@ObfuscatedName("TRQPVNER")
public final class TRQPVNER implements ImageProducer, ImageObserver {

	@ObfuscatedName("TRQPVNER.e")
	public int field1268;

	@ObfuscatedName("TRQPVNER.f")
	public int field1269;

	@ObfuscatedName("TRQPVNER.d")
	public int[] field1267;

	@ObfuscatedName("TRQPVNER.g")
	public ColorModel field1270;

	@ObfuscatedName("TRQPVNER.i")
	public Image field1272;

	@ObfuscatedName("TRQPVNER.h")
	public ImageConsumer field1271;

	public TRQPVNER(int arg0, Component arg1, int arg2) {
		field1268 = arg0;
		field1269 = arg2;
		field1267 = new int[arg0 * arg2];
		field1270 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field1272 = arg1.createImage(this);
		method457();
		arg1.prepareImage(field1272, this);
		method457();
		arg1.prepareImage(field1272, this);
		method457();
		arg1.prepareImage(field1272, this);
		method455();
	}

	@ObfuscatedName("TRQPVNER.a(I)V")
	public void method455() {
		VDGJUQAS.method512(field1267, field1269, field1268);
	}

	@ObfuscatedName("TRQPVNER.a(IILjava/awt/Graphics;I)V")
	public void method456(int arg0, Graphics arg1, int arg2) {
		method457();
		arg1.drawImage(field1272, arg0, arg2, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field1271 = arg0;
		arg0.setDimensions(field1268, field1269);
		arg0.setProperties(null);
		arg0.setColorModel(field1270);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field1271 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field1271 == arg0) {
			field1271 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("TRQPVNER.a()V")
	public synchronized void method457() {
		if (field1271 != null) {
			field1271.setPixels(0, 0, field1268, field1269, field1270, field1267, 0, field1268);
			field1271.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
