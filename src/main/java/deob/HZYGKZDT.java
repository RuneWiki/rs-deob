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

@ObfuscatedName("HZYGKZDT")
public final class HZYGKZDT implements ImageProducer, ImageObserver {

	@ObfuscatedName("HZYGKZDT.b")
	public int field584;

	@ObfuscatedName("HZYGKZDT.c")
	public int field585;

	@ObfuscatedName("HZYGKZDT.a")
	public int[] field583;

	@ObfuscatedName("HZYGKZDT.d")
	public ColorModel field586;

	@ObfuscatedName("HZYGKZDT.f")
	public Image field588;

	@ObfuscatedName("HZYGKZDT.e")
	public ImageConsumer field587;

	public HZYGKZDT(Component arg0, int arg1, int arg2) {
		field584 = arg1;
		field585 = arg2;
		field583 = new int[arg1 * arg2];
		field586 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field588 = arg0.createImage(this);
		method296();
		arg0.prepareImage(field588, this);
		method296();
		arg0.prepareImage(field588, this);
		method296();
		arg0.prepareImage(field588, this);
		method294();
	}

	@ObfuscatedName("HZYGKZDT.a(I)V")
	public void method294() {
		CBERHIHM.method28(field583, field585, field584);
	}

	@ObfuscatedName("HZYGKZDT.a(IILjava/awt/Graphics;I)V")
	public void method295(int arg0, Graphics arg1, int arg2) {
		method296();
		arg1.drawImage(field588, arg2, arg0, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field587 = arg0;
		arg0.setDimensions(field584, field585);
		arg0.setProperties(null);
		arg0.setColorModel(field586);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field587 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field587 == arg0) {
			field587 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("HZYGKZDT.a()V")
	public synchronized void method296() {
		if (field587 != null) {
			field587.setPixels(0, 0, field584, field585, field586, field583, 0, field584);
			field587.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
