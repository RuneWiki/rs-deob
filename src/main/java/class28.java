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

@OriginalClass("client!dl")
public class class28 extends class49 {

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "Ljava/awt/Component;")
    private Component field303;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method178(int arg0, Graphics arg1, int arg2, int arg3) {
        arg1.drawImage(this.field674, arg0, arg3, this.field303);
        if (arg2 > -127) {
            this.field303 = (Component) null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public final void method179(int arg0, Component arg1, int arg2, int arg3) {
        this.field682 = arg0;
        this.field677 = new int[arg0 * arg2 + 1];
        this.field680 = arg2;
        DataBufferInt var5 = new DataBufferInt(this.field677, this.field677.length);
        int var6 = 98 / ((-arg3 - 54) / 55);
        DirectColorModel var7 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var8 = Raster.createWritableRaster(var7.createCompatibleSampleModel(this.field682, this.field680), var5, (Point) null);
        this.field674 = new BufferedImage(var7, var8, false, new Hashtable());
        this.field303 = arg1;
        this.method299(0);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public final void method180(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        if (arg3 != 24259) {
            this.field303 = (Component) null;
        }
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg4, arg1, arg2, arg0);
        arg5.drawImage(this.field674, 0, 0, this.field303);
        arg5.setClip(var7);
    }
}
