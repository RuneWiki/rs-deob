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

@ObfuscatedName("SBWJLPSR")
public final class SBWJLPSR implements ImageProducer, ImageObserver {

	@ObfuscatedName("SBWJLPSR.e")
	public int field1103;

	@ObfuscatedName("SBWJLPSR.f")
	public int field1104;

	@ObfuscatedName("SBWJLPSR.d")
	public int[] field1102;

	@ObfuscatedName("SBWJLPSR.g")
	public ColorModel field1105;

	@ObfuscatedName("SBWJLPSR.i")
	public Image field1107;

	@ObfuscatedName("SBWJLPSR.h")
	public ImageConsumer field1106;

	public SBWJLPSR(int arg0, int arg1, Component arg2) {
		field1103 = arg1;
		field1104 = arg0;
		field1102 = new int[arg0 * arg1];
		field1105 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field1107 = arg2.createImage(this);
		method396();
		arg2.prepareImage(field1107, this);
		method396();
		arg2.prepareImage(field1107, this);
		method396();
		arg2.prepareImage(field1107, this);
		method394();
	}

	@ObfuscatedName("SBWJLPSR.a(Z)V")
	public void method394() {
		KVJNUKIT.method339(field1104, field1103, field1102);
	}

	@ObfuscatedName("SBWJLPSR.a(ILjava/awt/Graphics;II)V")
	public void method395(Graphics arg0, int arg1, int arg2) {
		method396();
		arg0.drawImage(field1107, arg2, arg1, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field1106 = arg0;
		arg0.setDimensions(field1103, field1104);
		arg0.setProperties(null);
		arg0.setColorModel(field1105);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field1106 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field1106 == arg0) {
			field1106 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("SBWJLPSR.a()V")
	public synchronized void method396() {
		if (field1106 != null) {
			field1106.setPixels(0, 0, field1103, field1104, field1105, field1102, 0, field1103);
			field1106.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
