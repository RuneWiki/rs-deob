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

@ObfuscatedName("MVSFNVJP")
public final class MVSFNVJP implements ImageProducer, ImageObserver {

	@ObfuscatedName("MVSFNVJP.d")
	public int field952;

	@ObfuscatedName("MVSFNVJP.e")
	public int field953;

	@ObfuscatedName("MVSFNVJP.c")
	public int[] field951;

	@ObfuscatedName("MVSFNVJP.f")
	public ColorModel field954;

	@ObfuscatedName("MVSFNVJP.h")
	public Image field956;

	@ObfuscatedName("MVSFNVJP.g")
	public ImageConsumer field955;

	public MVSFNVJP(Component arg0, int arg1, int arg2) {
		field952 = arg2;
		field953 = arg1;
		field951 = new int[arg1 * arg2];
		field954 = new DirectColorModel(32, 0xFF0000, 0xFF00, 255);
		field956 = arg0.createImage(this);
		method379();
		arg0.prepareImage(field956, this);
		method379();
		arg0.prepareImage(field956, this);
		method379();
		arg0.prepareImage(field956, this);
		method377();
	}

	@ObfuscatedName("MVSFNVJP.a(Z)V")
	public void method377() {
		YYTDUXDR.method576(field951, field953, field952);
	}

	@ObfuscatedName("MVSFNVJP.a(IIILjava/awt/Graphics;)V")
	public void method378(int arg0, int arg1, Graphics arg2) {
		method379();
		arg2.drawImage(field956, arg0, arg1, this);
	}

	public synchronized void addConsumer(ImageConsumer arg0) {
		field955 = arg0;
		arg0.setDimensions(field952, field953);
		arg0.setProperties(null);
		arg0.setColorModel(field954);
		arg0.setHints(14);
	}

	public synchronized boolean isConsumer(ImageConsumer arg0) {
		if (field955 == arg0) {
			return true;
		}

		return false;
	}

	public synchronized void removeConsumer(ImageConsumer arg0) {
		if (field955 == arg0) {
			field955 = null;
		}
	}

	public void startProduction(ImageConsumer arg0) {
		addConsumer(arg0);
	}

	public void requestTopDownLeftRightResend(ImageConsumer arg0) {
		System.out.println("TDLR");
	}

	@ObfuscatedName("MVSFNVJP.a()V")
	public synchronized void method379() {
		if (field955 != null) {
			field955.setPixels(0, 0, field952, field953, field954, field951, 0, field952);
			field955.imageComplete(2);
		}
	}

	public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		return true;
	}
}
