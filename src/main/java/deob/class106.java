package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Hashtable;

@ObfuscatedName("cb")
public final class class106 extends class140 implements ImageProducer, ImageObserver {

    @ObfuscatedName("cb.b")
    public ColorModel field1465;

    @ObfuscatedName("cb.h")
    public ImageConsumer field1464;

    public void requestTopDownLeftRightResend(ImageConsumer arg0) {
    }

    @ObfuscatedName("cb.b(IILjava/awt/Component;I)V")
    public final void method1464(int arg0, int arg1, Component arg2) {
        this.field2145 = arg0;
        this.field2151 = arg1;
        this.field2149 = new int[arg0 * arg1 + 1];
        this.field1465 = new DirectColorModel(32, 16711680, 65280, 255);
        this.field2148 = arg2.createImage(this);
        this.method1471();
        arg2.prepareImage(this.field2148, this);
        this.method1471();
        arg2.prepareImage(this.field2148, this);
        this.method1471();
        arg2.prepareImage(this.field2148, this);
        this.method2374();
    }

    public synchronized boolean isConsumer(ImageConsumer arg0) {
        return this.field1464 == arg0;
    }

    public synchronized void removeConsumer(ImageConsumer arg0) {
        if (this.field1464 == arg0) {
            this.field1464 = null;
        }
    }

    public void startProduction(ImageConsumer arg0) {
        this.addConsumer(arg0);
    }

    @ObfuscatedName("cb.t(IIIII)V")
    public synchronized void method1470(int arg0, int arg1, int arg2, int arg3) {
        if (this.field1464 != null) {
            this.field1464.setPixels(arg0, arg1, arg2, arg3, this.field1465, this.field2149, this.field2145 * arg1 + arg0, this.field2145);
            this.field1464.imageComplete(2);
        }
    }

    @ObfuscatedName("cb.w(B)V")
    public synchronized void method1471() {
        if (this.field1464 != null) {
            this.field1464.setPixels(0, 0, this.field2145, this.field2151, this.field1465, this.field2149, 0, this.field2145);
            this.field1464.imageComplete(2);
        }
    }

    public synchronized void addConsumer(ImageConsumer arg0) {
        this.field1464 = arg0;
        arg0.setDimensions(this.field2145, this.field2151);
        arg0.setProperties((Hashtable) null);
        arg0.setColorModel(this.field1465);
        arg0.setHints(14);
    }

    @ObfuscatedName("cb.h(Ljava/awt/Graphics;IIB)V")
    public final void method1475(Graphics arg0, int arg1, int arg2) {
        this.method1471();
        arg0.drawImage(this.field2148, arg1, arg2, this);
    }

    public boolean imageUpdate(Image arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return true;
    }

    @ObfuscatedName("cb.k(Ljava/awt/Graphics;IIIII)V")
    public final void method1496(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1470(arg1, arg2, arg3, arg4);
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field2148, 0, 0, this);
        arg0.setClip(var6);
    }
}
