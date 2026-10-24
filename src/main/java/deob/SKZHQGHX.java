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

@ObfuscatedName("SKZHQGHX")
public final class SKZHQGHX implements ImageProducer, ImageObserver {

	@ObfuscatedName("SKZHQGHX.c")
	public int field1128;

	@ObfuscatedName("SKZHQGHX.d")
	public int field1129;

	@ObfuscatedName("SKZHQGHX.b")
	public int[] field1127;

	@ObfuscatedName("SKZHQGHX.e")
	public ColorModel field1130;

	@ObfuscatedName("SKZHQGHX.g")
	public Image field1132;

	@ObfuscatedName("SKZHQGHX.f")
	public ImageConsumer field1131;

	public SKZHQGHX(int arg0, int arg1, Component arg2) {
		field1128 = arg1;
		field1129 = arg0;
		field1127 = new int[arg0 * arg1];
		field1130 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field1132 = arg2.createImage(this);
		method457();
		arg2.prepareImage(field1132, this);
		method457();
		arg2.prepareImage(field1132, this);
		method457();
		arg2.prepareImage(field1132, this);
		method455();
	}

	@ObfuscatedName("SKZHQGHX.a(I)V")
	public void method455() {
		DSAVPBJG.method191(field1127, field1128, field1129);
	}

	@ObfuscatedName("SKZHQGHX.a(IIILjava/awt/Graphics;)V")
	public void method456(int arg0, int arg1, Graphics arg2) {
		method457();
		arg2.drawImage(field1132, arg0, arg1, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field1131 = arg0;
		arg0.setDimensions(field1128, field1129);
		arg0.setProperties(null);
		arg0.setColorModel(field1130);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field1131 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field1131 == arg0) {
			field1131 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("SKZHQGHX.a()V")
	public synchronized void method457() {
		if (field1131 != null) {
			field1131.setPixels(0, 0, field1128, field1129, field1130, field1127, 0, field1128);
			field1131.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
