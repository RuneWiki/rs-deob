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

@ObfuscatedName("VOQVBLJN")
public final class VOQVBLJN implements ImageProducer, ImageObserver {

	@ObfuscatedName("VOQVBLJN.c")
	public int field1349;

	@ObfuscatedName("VOQVBLJN.d")
	public int field1350;

	@ObfuscatedName("VOQVBLJN.b")
	public int[] field1348;

	@ObfuscatedName("VOQVBLJN.e")
	public ColorModel field1351;

	@ObfuscatedName("VOQVBLJN.g")
	public Image field1353;

	@ObfuscatedName("VOQVBLJN.f")
	public ImageConsumer field1352;

	public VOQVBLJN(int arg0, int arg1, Component arg2) {
		field1349 = arg1;
		field1350 = arg0;
		field1348 = new int[arg0 * arg1];
		field1351 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field1353 = arg2.createImage(this);
		method537();
		arg2.prepareImage(field1353, this);
		method537();
		arg2.prepareImage(field1353, this);
		method537();
		arg2.prepareImage(field1353, this);
		method535();
	}

	@ObfuscatedName("VOQVBLJN.a(B)V")
	public void method535() {
		NQLGXPRA.method388(field1349, field1348, field1350);
	}

	@ObfuscatedName("VOQVBLJN.a(IIILjava/awt/Graphics;)V")
	public void method536(int arg0, int arg1, Graphics arg2) {
		method537();
		arg2.drawImage(field1353, arg0, arg1, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field1352 = arg0;
		arg0.setDimensions(field1349, field1350);
		arg0.setProperties(null);
		arg0.setColorModel(field1351);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field1352 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field1352 == arg0) {
			field1352 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("VOQVBLJN.a()V")
	public synchronized void method537() {
		if (field1352 != null) {
			field1352.setPixels(0, 0, field1349, field1350, field1351, field1348, 0, field1349);
			field1352.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
