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

@ObfuscatedName("DRNBRPSO")
public final class DRNBRPSO implements ImageProducer, ImageObserver {

	@ObfuscatedName("DRNBRPSO.c")
	public int field591;

	@ObfuscatedName("DRNBRPSO.d")
	public int field592;

	@ObfuscatedName("DRNBRPSO.b")
	public int[] field590;

	@ObfuscatedName("DRNBRPSO.e")
	public ColorModel field593;

	@ObfuscatedName("DRNBRPSO.g")
	public Image field595;

	@ObfuscatedName("DRNBRPSO.f")
	public ImageConsumer field594;

	public DRNBRPSO(int arg0, int arg1, Component arg2) {
		field591 = arg1;
		field592 = arg0;
		field590 = new int[arg0 * arg1];
		field593 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field595 = arg2.createImage(this);
		method188();
		arg2.prepareImage(field595, this);
		method188();
		arg2.prepareImage(field595, this);
		method188();
		arg2.prepareImage(field595, this);
		method186();
	}

	@ObfuscatedName("DRNBRPSO.a(I)V")
	public void method186() {
		NBXZFIDS.method286(field592, field591, field590);
	}

	@ObfuscatedName("DRNBRPSO.a(IILjava/awt/Graphics;I)V")
	public void method187(int arg0, Graphics arg1, int arg2) {
		method188();
		arg1.drawImage(field595, arg0, arg2, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field594 = arg0;
		arg0.setDimensions(field591, field592);
		arg0.setProperties(null);
		arg0.setColorModel(field593);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field594 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field594 == arg0) {
			field594 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("DRNBRPSO.a()V")
	public synchronized void method188() {
		if (field594 != null) {
			field594.setPixels(0, 0, field591, field592, field593, field590, 0, field591);
			field594.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
