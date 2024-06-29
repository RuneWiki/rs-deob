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

@OriginalClass("client!vl")
public class class74 extends class135 {

    @OriginalMember(owner = "client!vl", name = "n", descriptor = "Ljava/awt/Component;")
    private Component field1296;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIILjava/awt/Component;)V", line = 10)
    public final void method547(int arg0, int arg1, int arg2, Component arg3) {
        this.field2291 = new int[arg1 * arg2 + 1];
        this.field2293 = arg1;
        this.field2297 = arg2;
        DataBufferInt var5 = new DataBufferInt(this.field2291, this.field2291.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2293, this.field2297), var5, (Point) null);
        if (arg0 == 16369) {
            this.field2287 = new BufferedImage(var6, var7, false, new Hashtable());
            this.field1296 = arg3;
            this.method997(9101);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 30)
    public final void method548(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg1 != 0) {
            this.field1296 = (Component) null;
        }
        arg3.drawImage(this.field2287, arg2, arg0, this.field1296);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V", line = 41)
    public final void method549(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5) {
        Shape var7 = arg1.getClip();
        arg1.clipRect(arg2, arg4, arg0, arg3);
        arg1.drawImage(this.field2287, 0, arg5, this.field1296);
        arg1.setClip(var7);
    }
}
