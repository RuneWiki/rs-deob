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

@OriginalClass("client!rj")
public class class229 extends class197 {

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "Ljava/awt/Component;")
    private Component field3932;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLjava/awt/Graphics;II)V")
    public final void method920(byte arg0, Graphics arg1, int arg2, int arg3) {
        if (arg0 != -113) {
            this.method930(-39, (Component) null, -38, true);
        }
        arg1.drawImage(this.field3356, arg2, arg3, this.field3932);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/awt/Component;IZ)V")
    public final void method930(int arg0, Component arg1, int arg2, boolean arg3) {
        this.field3352 = arg0;
        this.field3355 = arg2;
        this.field3345 = new int[arg0 * arg2 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field3345, this.field3345.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field3355, this.field3352), var5, (Point) null);
        this.field3356 = new BufferedImage(var6, var7, arg3, new Hashtable());
        this.field3932 = arg1;
        this.method1368(-102);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IILjava/awt/Graphics;IBI)V")
    public final void method927(int arg0, int arg1, Graphics arg2, int arg3, byte arg4, int arg5) {
        if (arg4 < -102) {
            Shape var7 = arg2.getClip();
            arg2.clipRect(arg3, arg5, arg1, arg0);
            arg2.drawImage(this.field3356, 0, 0, this.field3932);
            arg2.setClip(var7);
        }
    }
}
