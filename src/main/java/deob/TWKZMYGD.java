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

@ObfuscatedName("TWKZMYGD")
public final class TWKZMYGD implements ImageProducer, ImageObserver {

	@ObfuscatedName("TWKZMYGD.d")
	public int field1137;

	@ObfuscatedName("TWKZMYGD.e")
	public int field1138;

	@ObfuscatedName("TWKZMYGD.c")
	public int[] field1136;

	@ObfuscatedName("TWKZMYGD.f")
	public ColorModel field1139;

	@ObfuscatedName("TWKZMYGD.h")
	public Image field1141;

	@ObfuscatedName("TWKZMYGD.g")
	public ImageConsumer field1140;

	public TWKZMYGD(int arg0, int arg1, Component arg2) {
		field1137 = arg1;
		field1138 = arg0;
		field1136 = new int[arg0 * arg1];
		field1139 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field1141 = arg2.createImage(this);
		method531();
		arg2.prepareImage(field1141, this);
		method531();
		arg2.prepareImage(field1141, this);
		method531();
		arg2.prepareImage(field1141, this);
		method529();
	}

	@ObfuscatedName("TWKZMYGD.a(Z)V")
	public void method529() {
		SXFSGYHA.method516(field1137, field1136, field1138);
	}

	@ObfuscatedName("TWKZMYGD.a(BIILjava/awt/Graphics;)V")
	public void method530(int arg0, int arg1, Graphics arg2) {
		method531();
		arg2.drawImage(field1141, arg1, arg0, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field1140 = arg0;
		arg0.setDimensions(field1137, field1138);
		arg0.setProperties(null);
		arg0.setColorModel(field1139);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field1140 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field1140 == arg0) {
			field1140 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("TWKZMYGD.a()V")
	public synchronized void method531() {
		if (field1140 != null) {
			field1140.setPixels(0, 0, field1137, field1138, field1139, field1136, 0, field1137);
			field1140.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
