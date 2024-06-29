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
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class99 extends class106 {

    @OriginalMember(owner = "client!k", name = "t", descriptor = "Ljava/awt/Component;")
    private Component field1948;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method655(int arg0, Graphics arg1, int arg2, int arg3) {
        int var5 = 68 % ((arg3 + 12) / 34);
        arg1.drawImage(this.field2045, arg0, arg2, this.field1948);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public final void method656(int arg0, int arg1, Component arg2, int arg3) {
        this.field2047 = new int[arg0 * arg3 + 1];
        this.field2038 = arg0;
        if (arg1 != 20053) {
            return;
        }
        this.field2035 = arg3;
        DataBufferInt var5 = new DataBufferInt(this.field2047, this.field2047.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2035, this.field2038), var5, null);
        this.field2045 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field1948 = arg2;
        this.method704(-5);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public final void method657(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg2, arg4, arg1, arg5);
        arg3.drawImage(this.field2045, 0, 0, this.field1948);
        int var8 = 127 / ((-arg0 - 40) / 37);
        arg3.setClip(var7);
    }
}
