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

@ObfuscatedName("XBLPPVAP")
public final class XBLPPVAP implements ImageProducer, ImageObserver {

	@ObfuscatedName("XBLPPVAP.b")
	public int field1317;

	@ObfuscatedName("XBLPPVAP.c")
	public int field1318;

	@ObfuscatedName("XBLPPVAP.a")
	public int[] field1316;

	@ObfuscatedName("XBLPPVAP.d")
	public ColorModel field1319;

	@ObfuscatedName("XBLPPVAP.f")
	public Image field1321;

	@ObfuscatedName("XBLPPVAP.e")
	public ImageConsumer field1320;

	public XBLPPVAP(Component arg0, int arg1, int arg2) {
		field1317 = arg1;
		field1318 = arg2;
		field1316 = new int[arg1 * arg2];
		field1319 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field1321 = arg0.createImage(this);
		method479();
		arg0.prepareImage(field1321, this);
		method479();
		arg0.prepareImage(field1321, this);
		method479();
		arg0.prepareImage(field1321, this);
		method477();
	}

	@ObfuscatedName("XBLPPVAP.a(I)V")
	public void method477() {
		ANTOHTCU.method12(field1317, field1318, field1316);
	}

	@ObfuscatedName("XBLPPVAP.a(IILjava/awt/Graphics;Z)V")
	public void method478(int arg0, int arg1, Graphics arg2) {
		method479();
		arg2.drawImage(field1321, arg1, arg0, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field1320 = arg0;
		arg0.setDimensions(field1317, field1318);
		arg0.setProperties(null);
		arg0.setColorModel(field1319);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field1320 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field1320 == arg0) {
			field1320 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("XBLPPVAP.a()V")
	public synchronized void method479() {
		if (field1320 != null) {
			field1320.setPixels(0, 0, field1317, field1318, field1319, field1316, 0, field1317);
			field1320.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
