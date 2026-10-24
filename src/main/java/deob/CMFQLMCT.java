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

@ObfuscatedName("CMFQLMCT")
public final class CMFQLMCT implements ImageProducer, ImageObserver {

	@ObfuscatedName("CMFQLMCT.c")
	public int field522;

	@ObfuscatedName("CMFQLMCT.d")
	public int field523;

	@ObfuscatedName("CMFQLMCT.b")
	public int[] field521;

	@ObfuscatedName("CMFQLMCT.e")
	public ColorModel field524;

	@ObfuscatedName("CMFQLMCT.g")
	public Image field526;

	@ObfuscatedName("CMFQLMCT.f")
	public ImageConsumer field525;

	public CMFQLMCT(int arg0, Component arg1, int arg2) {
		field522 = arg0;
		field523 = arg2;
		field521 = new int[arg0 * arg2];
		field524 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field526 = arg1.createImage(this);
		method198();
		arg1.prepareImage(field526, this);
		method198();
		arg1.prepareImage(field526, this);
		method198();
		arg1.prepareImage(field526, this);
		method196();
	}

	@ObfuscatedName("CMFQLMCT.a(Z)V")
	public void method196() {
		FBOVVAQK.method230(field521, field522, field523);
	}

	@ObfuscatedName("CMFQLMCT.a(Ljava/awt/Graphics;IZI)V")
	public void method197(Graphics arg0, int arg1, int arg2) {
		method198();
		arg0.drawImage(field526, arg2, arg1, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field525 = arg0;
		arg0.setDimensions(field522, field523);
		arg0.setProperties(null);
		arg0.setColorModel(field524);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field525 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field525 == arg0) {
			field525 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("CMFQLMCT.a()V")
	public synchronized void method198() {
		if (field525 != null) {
			field525.setPixels(0, 0, field522, field523, field524, field521, 0, field522);
			field525.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
