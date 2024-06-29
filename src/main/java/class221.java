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

@OriginalClass("client!ti")
public class class221 extends class170 {

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "Ljava/awt/Component;")
    private Component field3511;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 10)
    public final void method1030(int arg0, int arg1, Graphics arg2, int arg3) {
        if (arg3 == 0) {
            arg2.drawImage(this.field2663, arg0, arg1, this.field3511);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZILjava/awt/Component;)V", line = 22)
    public final void method1031(int arg0, boolean arg1, int arg2, Component arg3) {
        this.field2661 = new int[arg0 * arg2 + 1];
        this.field2665 = arg0;
        this.field2667 = arg2;
        DataBufferInt var5 = new DataBufferInt(this.field2661, this.field2661.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2667, this.field2665), var5, (Point) null);
        this.field2663 = new BufferedImage(var6, var7, arg1, new Hashtable());
        this.field3511 = arg3;
        this.method1172(0);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V", line = 41)
    public final void method1026(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        Shape var7 = arg4.getClip();
        if (arg2 != 6260) {
            this.field3511 = (Component) null;
        }
        arg4.clipRect(arg1, arg5, arg0, arg3);
        arg4.drawImage(this.field2663, 0, 0, this.field3511);
        arg4.setClip(var7);
    }
}
