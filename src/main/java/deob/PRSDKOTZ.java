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

@ObfuscatedName("PRSDKOTZ")
public final class PRSDKOTZ implements ImageProducer, ImageObserver {

	@ObfuscatedName("PRSDKOTZ.c")
	public int field961;

	@ObfuscatedName("PRSDKOTZ.d")
	public int field962;

	@ObfuscatedName("PRSDKOTZ.b")
	public int[] field960;

	@ObfuscatedName("PRSDKOTZ.e")
	public ColorModel field963;

	@ObfuscatedName("PRSDKOTZ.g")
	public Image field965;

	@ObfuscatedName("PRSDKOTZ.f")
	public ImageConsumer field964;

	public PRSDKOTZ(int arg0, int arg1, Component arg2) {
		field961 = arg1;
		field962 = arg0;
		field960 = new int[arg0 * arg1];
		field963 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field965 = arg2.createImage(this);
		method353();
		arg2.prepareImage(field965, this);
		method353();
		arg2.prepareImage(field965, this);
		method353();
		arg2.prepareImage(field965, this);
		method351();
	}

	@ObfuscatedName("PRSDKOTZ.a(I)V")
	public void method351() {
		PGTLMTYR.method339(field961, field962, field960);
	}

	@ObfuscatedName("PRSDKOTZ.a(IILjava/awt/Graphics;B)V")
	public void method352(int arg0, int arg1, Graphics arg2) {
		method353();
		arg2.drawImage(field965, arg0, arg1, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field964 = arg0;
		arg0.setDimensions(field961, field962);
		arg0.setProperties(null);
		arg0.setColorModel(field963);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field964 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field964 == arg0) {
			field964 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("PRSDKOTZ.a()V")
	public synchronized void method353() {
		if (field964 != null) {
			field964.setPixels(0, 0, field961, field962, field963, field960, 0, field961);
			field964.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
