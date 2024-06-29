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
public class class10 extends class26 {

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "Ljava/awt/Component;")
    private Component field304;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBLjava/awt/Graphics;III)V")
    public final void method80(int arg0, byte arg1, Graphics arg2, int arg3, int arg4, int arg5) {
        Shape var7 = arg2.getClip();
        arg2.clipRect(arg3, arg5, arg0, arg4);
        arg2.drawImage(this.field699, 0, 0, this.field304);
        int var8 = -118 % ((47 - arg1) / 40);
        arg2.setClip(var7);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/awt/Graphics;IIZ)V")
    public final void method81(Graphics arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            arg0.drawImage(this.field699, arg1, arg2, this.field304);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public final void method82(Component arg0, int arg1, int arg2, int arg3) {
        this.field705 = new int[arg1 * arg3 + 1];
        this.field692 = arg1;
        this.field697 = arg3;
        DataBufferInt var5 = new DataBufferInt(this.field705, this.field705.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field697, this.field692), var5, null);
        if (arg2 <= -63) {
            this.field699 = new BufferedImage(var6, var7, false, new Hashtable());
            this.field304 = arg0;
            this.method204(27);
        }
    }
}
