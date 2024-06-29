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

@OriginalClass("client!bk")
public class class155 extends class29 {

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "Ljava/awt/Component;")
    private Component field2811;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILjava/awt/Component;II)V", line = 9)
    public final void method133(int arg0, Component arg1, int arg2, int arg3) {
        this.field397 = arg3;
        this.field403 = new int[arg2 * arg3 + 1];
        this.field405 = arg2;
        if (arg0 != 128) {
            return;
        }
        DataBufferInt var5 = new DataBufferInt(this.field403, this.field403.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field405, this.field397), var5, (Point) null);
        this.field407 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field2811 = arg1;
        this.method137((byte) -126);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V", line = 31)
    public final void method139(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        if (arg2 != 977463824) {
            this.method133(90, (Component) null, -107, -28);
        }
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg0, arg3, arg1, arg4);
        arg5.drawImage(this.field407, 0, 0, this.field2811);
        arg5.setClip(var7);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V", line = 47)
    public final void method135(int arg0, int arg1, byte arg2, Graphics arg3) {
        arg3.drawImage(this.field407, arg1, arg0, this.field2811);
        if (arg2 <= 87) {
            this.method133(82, (Component) null, 89, -99);
        }
    }
}
