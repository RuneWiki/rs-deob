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

@OriginalClass("client!vm")
public class class337 extends class4 {

    @OriginalMember(owner = "client!vm", name = "r", descriptor = "Ljava/awt/Component;")
    private Component field5224;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V", line = 10)
    public final void method28(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg2, arg3, arg0, arg1);
        arg5.drawImage(this.field51, 0, 0, this.field5224);
        arg5.setClip(var7);
        if (arg4 != 1) {
            this.field5224 = (Component) null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BLjava/awt/Component;II)V", line = 23)
    public final void method30(byte arg0, Component arg1, int arg2, int arg3) {
        this.field48 = arg2;
        this.field47 = new int[arg2 * arg3 + 1];
        this.field56 = arg3;
        if (arg0 != -98) {
            this.method28(-108, -89, 99, 67, -32, (Graphics) null);
        }
        DataBufferInt var5 = new DataBufferInt(this.field47, this.field47.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field56, this.field48), var5, (Point) null);
        this.field51 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field5224 = arg1;
        this.method27(arg0 ^ 0x29AC);
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 47)
    public final void method29(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg3 != 30365) {
            this.method30((byte) -59, (Component) null, -111, 78);
        }
        arg1.drawImage(this.field51, arg0, arg2, this.field5224);
    }
}
