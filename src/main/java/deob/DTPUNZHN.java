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

@ObfuscatedName("DTPUNZHN")
public final class DTPUNZHN implements ImageProducer, ImageObserver {

	@ObfuscatedName("DTPUNZHN.b")
	public int field603;

	@ObfuscatedName("DTPUNZHN.c")
	public int field604;

	@ObfuscatedName("DTPUNZHN.a")
	public int[] field602;

	@ObfuscatedName("DTPUNZHN.d")
	public ColorModel field605;

	@ObfuscatedName("DTPUNZHN.f")
	public Image field607;

	@ObfuscatedName("DTPUNZHN.e")
	public ImageConsumer field606;

	public DTPUNZHN(int arg0, int arg1, Component arg2) {
		field603 = arg1;
		field604 = arg0;
		field602 = new int[arg0 * arg1];
		field605 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field607 = arg2.createImage(this);
		method207();
		arg2.prepareImage(field607, this);
		method207();
		arg2.prepareImage(field607, this);
		method207();
		arg2.prepareImage(field607, this);
		method205();
	}

	@ObfuscatedName("DTPUNZHN.a(I)V")
	public void method205() {
		TIJYBGAE.method487(field603, field604, field602);
	}

	@ObfuscatedName("DTPUNZHN.a(ILjava/awt/Graphics;II)V")
	public void method206(int arg0, Graphics arg1, int arg2) {
		method207();
		arg1.drawImage(field607, arg0, arg2, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field606 = arg0;
		arg0.setDimensions(field603, field604);
		arg0.setProperties(null);
		arg0.setColorModel(field605);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field606 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field606 == arg0) {
			field606 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("DTPUNZHN.a()V")
	public synchronized void method207() {
		if (field606 != null) {
			field606.setPixels(0, 0, field603, field604, field605, field602, 0, field603);
			field606.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
