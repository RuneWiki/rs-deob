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

@ObfuscatedName("EDCVNWGU")
public final class EDCVNWGU implements ImageProducer, ImageObserver {

	@ObfuscatedName("EDCVNWGU.f")
	public int field550;

	@ObfuscatedName("EDCVNWGU.g")
	public int field551;

	@ObfuscatedName("EDCVNWGU.e")
	public int[] field549;

	@ObfuscatedName("EDCVNWGU.h")
	public ColorModel field552;

	@ObfuscatedName("EDCVNWGU.j")
	public Image field554;

	@ObfuscatedName("EDCVNWGU.i")
	public ImageConsumer field553;

	public EDCVNWGU(Component arg0, int arg1, int arg2) {
		field550 = arg2;
		field551 = arg1;
		field549 = new int[arg1 * arg2];
		field552 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field554 = arg0.createImage(this);
		method266();
		arg0.prepareImage(field554, this);
		method266();
		arg0.prepareImage(field554, this);
		method266();
		arg0.prepareImage(field554, this);
		method264();
	}

	@ObfuscatedName("EDCVNWGU.a(I)V")
	public void method264() {
		OKWPDMPE.method431(field550, field551, field549);
	}

	@ObfuscatedName("EDCVNWGU.a(IILjava/awt/Graphics;I)V")
	public void method265(int arg0, int arg1, Graphics arg2) {
		method266();
		arg2.drawImage(field554, arg1, arg0, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field553 = arg0;
		arg0.setDimensions(field550, field551);
		arg0.setProperties(null);
		arg0.setColorModel(field552);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field553 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field553 == arg0) {
			field553 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("EDCVNWGU.a()V")
	public synchronized void method266() {
		if (field553 != null) {
			field553.setPixels(0, 0, field550, field551, field552, field549, 0, field550);
			field553.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
