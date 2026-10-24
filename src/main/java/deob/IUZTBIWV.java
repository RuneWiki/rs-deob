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

@ObfuscatedName("IUZTBIWV")
public final class IUZTBIWV implements ImageProducer, ImageObserver {

	@ObfuscatedName("IUZTBIWV.c")
	public int field787;

	@ObfuscatedName("IUZTBIWV.d")
	public int field788;

	@ObfuscatedName("IUZTBIWV.b")
	public int[] field786;

	@ObfuscatedName("IUZTBIWV.e")
	public ColorModel field789;

	@ObfuscatedName("IUZTBIWV.g")
	public Image field791;

	@ObfuscatedName("IUZTBIWV.f")
	public ImageConsumer field790;

	public IUZTBIWV(Component arg0, int arg1, int arg2) {
		field787 = arg1;
		field788 = arg2;
		field786 = new int[arg1 * arg2];
		field789 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field791 = arg0.createImage(this);
		method329();
		arg0.prepareImage(field791, this);
		method329();
		arg0.prepareImage(field791, this);
		method329();
		arg0.prepareImage(field791, this);
		method327();
	}

	@ObfuscatedName("IUZTBIWV.a(B)V")
	public void method327() {
		BAXODNVH.method17(field787, field786, field788);
	}

	@ObfuscatedName("IUZTBIWV.a(IILjava/awt/Graphics;I)V")
	public void method328(int arg0, int arg1, Graphics arg2) {
		method329();
		arg2.drawImage(field791, arg0, arg1, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field790 = arg0;
		arg0.setDimensions(field787, field788);
		arg0.setProperties(null);
		arg0.setColorModel(field789);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field790 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field790 == arg0) {
			field790 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("IUZTBIWV.a()V")
	public synchronized void method329() {
		if (field790 != null) {
			field790.setPixels(0, 0, field787, field788, field789, field786, 0, field787);
			field790.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
