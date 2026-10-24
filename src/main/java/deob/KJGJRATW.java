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

@ObfuscatedName("KJGJRATW")
public final class KJGJRATW implements ImageProducer, ImageObserver {

	@ObfuscatedName("KJGJRATW.c")
	public int field819;

	@ObfuscatedName("KJGJRATW.d")
	public int field820;

	@ObfuscatedName("KJGJRATW.b")
	public int[] field818;

	@ObfuscatedName("KJGJRATW.e")
	public ColorModel field821;

	@ObfuscatedName("KJGJRATW.g")
	public Image field823;

	@ObfuscatedName("KJGJRATW.f")
	public ImageConsumer field822;

	public KJGJRATW(Component arg0, int arg1, int arg2) {
		field819 = arg1;
		field820 = arg2;
		field818 = new int[arg1 * arg2];
		field821 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field823 = arg0.createImage(this);
		method318();
		arg0.prepareImage(field823, this);
		method318();
		arg0.prepareImage(field823, this);
		method318();
		arg0.prepareImage(field823, this);
		method316();
	}

	@ObfuscatedName("KJGJRATW.a(I)V")
	public void method316() {
		DEVPLWNC.method159(field818, field819, field820);
	}

	@ObfuscatedName("KJGJRATW.a(IIILjava/awt/Graphics;)V")
	public void method317(int arg0, int arg1, Graphics arg2) {
		method318();
		arg2.drawImage(field823, arg1, arg0, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field822 = arg0;
		arg0.setDimensions(field819, field820);
		arg0.setProperties(null);
		arg0.setColorModel(field821);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field822 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field822 == arg0) {
			field822 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("KJGJRATW.a()V")
	public synchronized void method318() {
		if (field822 != null) {
			field822.setPixels(0, 0, field819, field820, field821, field818, 0, field819);
			field822.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
