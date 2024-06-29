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

@OriginalClass("client!lf")
public class class125 extends class274 {

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "Ljava/awt/Component;")
    private Component field2108;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BIILjava/awt/Component;)V", line = 10)
    public final void method263(byte arg0, int arg1, int arg2, Component arg3) {
        this.field4819 = arg2;
        this.field4810 = arg1;
        this.field4811 = new int[arg1 * arg2 + 1];
        int var5 = -36 % ((arg0 - 63) / 57);
        DataBufferInt var6 = new DataBufferInt(this.field4811, this.field4811.length);
        DirectColorModel var7 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var8 = Raster.createWritableRaster(var7.createCompatibleSampleModel(this.field4819, this.field4810), var6, (Point) null);
        this.field4816 = new BufferedImage(var7, var8, false, new Hashtable());
        this.field2108 = arg3;
        this.method1978((byte) -105);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 29)
    public final void method262(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg2 != -8278) {
            this.field2108 = (Component) null;
        }
        arg1.drawImage(this.field4816, arg3, arg0, this.field2108);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V", line = 40)
    public final void method257(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg3, arg4, arg1, arg5);
        if (arg2 != 1) {
            this.field2108 = (Component) null;
        }
        arg0.drawImage(this.field4816, 0, 0, this.field2108);
        arg0.setClip(var7);
    }
}
