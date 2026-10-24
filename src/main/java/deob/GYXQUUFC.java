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

@ObfuscatedName("GYXQUUFC")
public final class GYXQUUFC implements ImageProducer, ImageObserver {

	@ObfuscatedName("GYXQUUFC.c")
	public int field709;

	@ObfuscatedName("GYXQUUFC.d")
	public int field710;

	@ObfuscatedName("GYXQUUFC.b")
	public int[] field708;

	@ObfuscatedName("GYXQUUFC.e")
	public ColorModel field711;

	@ObfuscatedName("GYXQUUFC.g")
	public Image field713;

	@ObfuscatedName("GYXQUUFC.f")
	public ImageConsumer field712;

	public GYXQUUFC(int arg0, int arg1, Component arg2) {
		field709 = arg1;
		field710 = arg0;
		field708 = new int[arg0 * arg1];
		field711 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field713 = arg2.createImage(this);
		method247();
		arg2.prepareImage(field713, this);
		method247();
		arg2.prepareImage(field713, this);
		method247();
		arg2.prepareImage(field713, this);
		method245();
	}

	@ObfuscatedName("GYXQUUFC.a(Z)V")
	public void method245() {
		ZLDPKUPX.method592(field708, field709, field710);
	}

	@ObfuscatedName("GYXQUUFC.a(ILjava/awt/Graphics;II)V")
	public void method246(int arg0, Graphics arg1, int arg2) {
		method247();
		arg1.drawImage(field713, arg2, arg0, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field712 = arg0;
		arg0.setDimensions(field709, field710);
		arg0.setProperties(null);
		arg0.setColorModel(field711);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field712 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field712 == arg0) {
			field712 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("GYXQUUFC.a()V")
	public synchronized void method247() {
		if (field712 != null) {
			field712.setPixels(0, 0, field709, field710, field711, field708, 0, field709);
			field712.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
