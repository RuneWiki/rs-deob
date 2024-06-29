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

@OriginalClass("client!uc")
public class class38 extends class224 {

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "Ljava/awt/Component;")
    private Component field724;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public final void method336(Component arg0, int arg1, int arg2, int arg3) {
        this.field3703 = new int[arg1 * arg2 + 1];
        this.field3702 = arg2;
        this.field3708 = arg1;
        DataBufferInt var5 = new DataBufferInt(this.field3703, this.field3703.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field3702, this.field3708), var5, (Point) null);
        this.field3715 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field724 = arg0;
        if (arg3 > -90) {
            this.field724 = (Component) null;
        }
        this.method1580(16043);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public final void method337(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5) {
        Shape var7 = arg1.getClip();
        arg1.clipRect(arg4, arg5, arg2, arg3);
        int var8 = -37 / ((arg0 - 34) / 54);
        arg1.drawImage(this.field3715, 0, 0, this.field724);
        arg1.setClip(var7);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public final void method338(Graphics arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -15816) {
            this.method336((Component) null, 101, 67, 60);
        }
        arg0.drawImage(this.field3715, arg2, arg3, this.field724);
    }
}
