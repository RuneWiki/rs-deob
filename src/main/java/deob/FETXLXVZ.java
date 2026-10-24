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

@ObfuscatedName("FETXLXVZ")
public final class FETXLXVZ implements ImageProducer, ImageObserver {

	@ObfuscatedName("FETXLXVZ.e")
	public int field731;

	@ObfuscatedName("FETXLXVZ.f")
	public int field732;

	@ObfuscatedName("FETXLXVZ.d")
	public int[] field730;

	@ObfuscatedName("FETXLXVZ.g")
	public ColorModel field733;

	@ObfuscatedName("FETXLXVZ.i")
	public Image field735;

	@ObfuscatedName("FETXLXVZ.h")
	public ImageConsumer field734;

	public FETXLXVZ(Component arg0, int arg1, int arg2) {
		field731 = arg1;
		field732 = arg2;
		field730 = new int[arg1 * arg2];
		field733 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field735 = arg0.createImage(this);
		method291();
		arg0.prepareImage(field735, this);
		method291();
		arg0.prepareImage(field735, this);
		method291();
		arg0.prepareImage(field735, this);
		method289();
	}

	@ObfuscatedName("FETXLXVZ.a(Z)V")
	public void method289() {
		JJXDTORW.method412(field732, field731, field730);
	}

	@ObfuscatedName("FETXLXVZ.a(IIILjava/awt/Graphics;)V")
	public void method290(int arg0, int arg1, Graphics arg2) {
		method291();
		arg2.drawImage(field735, arg1, arg0, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field734 = arg0;
		arg0.setDimensions(field731, field732);
		arg0.setProperties(null);
		arg0.setColorModel(field733);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field734 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field734 == arg0) {
			field734 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("FETXLXVZ.a()V")
	public synchronized void method291() {
		if (field734 != null) {
			field734.setPixels(0, 0, field731, field732, field733, field730, 0, field731);
			field734.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
