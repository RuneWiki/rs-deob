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

@ObfuscatedName("NUXCAHZM")
public final class NUXCAHZM implements ImageProducer, ImageObserver {

	@ObfuscatedName("NUXCAHZM.c")
	public int field930;

	@ObfuscatedName("NUXCAHZM.d")
	public int field931;

	@ObfuscatedName("NUXCAHZM.b")
	public int[] field929;

	@ObfuscatedName("NUXCAHZM.e")
	public ColorModel field932;

	@ObfuscatedName("NUXCAHZM.g")
	public Image field934;

	@ObfuscatedName("NUXCAHZM.f")
	public ImageConsumer field933;

	public NUXCAHZM(int arg0, int arg1, Component arg2) {
		field930 = arg1;
		field931 = arg0;
		field929 = new int[arg0 * arg1];
		field932 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field934 = arg2.createImage(this);
		method395();
		arg2.prepareImage(field934, this);
		method395();
		arg2.prepareImage(field934, this);
		method395();
		arg2.prepareImage(field934, this);
		method393();
	}

	@ObfuscatedName("NUXCAHZM.a(I)V")
	public void method393() {
		TQHEKXXC.method473(field931, field930, field929);
	}

	@ObfuscatedName("NUXCAHZM.a(Ljava/awt/Graphics;III)V")
	public void method394(Graphics arg0, int arg1, int arg2) {
		method395();
		arg0.drawImage(field934, arg1, arg2, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field933 = arg0;
		arg0.setDimensions(field930, field931);
		arg0.setProperties(null);
		arg0.setColorModel(field932);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field933 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field933 == arg0) {
			field933 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("NUXCAHZM.a()V")
	public synchronized void method395() {
		if (field933 != null) {
			field933.setPixels(0, 0, field930, field931, field932, field929, 0, field930);
			field933.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
