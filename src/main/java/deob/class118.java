package deob;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

@ObfuscatedName("dt")
public final class class118 extends class40 {

    @ObfuscatedName("dt.k")
    public Component field1561;

    @ObfuscatedName("dt.t(IILjava/awt/Component;B)V")
    public final void method527(int arg0, int arg1, Component arg2) {
        this.field535 = arg0;
        this.field534 = arg1;
        this.field533 = new int[arg0 * arg1 + 1];
        DataBufferInt var4 = new DataBufferInt(this.field533, this.field533.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field535, this.field534), var4, (Point) null);
        this.field536 = new BufferedImage(var5, var6, false, new Hashtable());
        this.field1561 = arg2;
        this.method528();
    }

    @ObfuscatedName("dt.h(Ljava/awt/Graphics;III)V")
    public final void method526(Graphics arg0, int arg1, int arg2) {
        arg0.drawImage(this.field536, arg1, arg2, this.field1561);
    }

    @ObfuscatedName("dt.k(Ljava/awt/Graphics;IIIII)V")
    public final void method530(Graphics arg0, int arg1, int arg2, int arg3, int arg4) {
        Shape var6 = arg0.getClip();
        arg0.clipRect(arg1, arg2, arg3, arg4);
        arg0.drawImage(this.field536, 0, 0, this.field1561);
        arg0.setClip(var6);
    }
}
