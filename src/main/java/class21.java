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

@OriginalClass("client!uf")
public class class21 extends class165 {

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "Ljava/awt/Component;")
    private Component field542;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 10)
    public final void method148(int arg0, int arg1, int arg2, Graphics arg3) {
        arg3.drawImage(this.field2840, arg2, arg0, this.field542);
        if (arg1 != 128) {
            this.field542 = (Component) null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V", line = 21)
    public final void method149(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg2, arg0, arg3, arg1);
        if (arg4 != 1) {
            this.method148(-117, -8, -125, (Graphics) null);
        }
        arg5.drawImage(this.field2840, 0, 0, this.field542);
        arg5.setClip(var7);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZILjava/awt/Component;I)V", line = 35)
    public final void method150(boolean arg0, int arg1, Component arg2, int arg3) {
        this.field2834 = arg1;
        this.field2833 = arg3;
        this.field2832 = new int[arg1 * arg3 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field2832, this.field2832.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2834, this.field2833), var5, (Point) null);
        this.field2840 = new BufferedImage(var6, var7, arg0, new Hashtable());
        this.field542 = arg2;
        this.method1083(128);
    }
}
