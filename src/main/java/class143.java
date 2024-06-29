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

@OriginalClass("client!bb")
public class class143 extends class218 {

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "Ljava/awt/Component;")
    private Component field2191;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBIILjava/awt/Graphics;I)V", line = 10)
    public final void method1089(int arg0, byte arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg5, arg0, arg2, arg3);
        if (arg1 > 76) {
            arg4.drawImage(this.field3331, 0, 0, this.field2191);
            arg4.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBLjava/awt/Component;I)V", line = 24)
    public final void method1090(int arg0, byte arg1, Component arg2, int arg3) {
        this.field3336 = arg3;
        this.field3339 = arg0;
        int var5 = 2 / ((arg1 - 90) / 32);
        this.field3337 = new int[arg0 * arg3 + 1];
        DataBufferInt var6 = new DataBufferInt(this.field3337, this.field3337.length);
        DirectColorModel var7 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var8 = Raster.createWritableRaster(var7.createCompatibleSampleModel(this.field3336, this.field3339), var6, (Point) null);
        this.field3331 = new BufferedImage(var7, var8, false, new Hashtable());
        this.field2191 = arg2;
        this.method1554(9969);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 44)
    public final void method1091(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg0 != -24418) {
            this.method1091(-101, (Graphics) null, 94, -47);
        }
        arg1.drawImage(this.field3331, arg2, arg3, this.field2191);
    }
}
