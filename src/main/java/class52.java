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

@OriginalClass("client!hc")
public class class52 extends class122 {

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "Ljava/awt/Component;")
    private Component field1037;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BILjava/awt/Graphics;I)V")
    public final void method66(byte arg0, int arg1, Graphics arg2, int arg3) {
        if (arg0 == 85) {
            arg2.drawImage(this.field2781, arg1, arg3, this.field1037);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/awt/Graphics;ZIIII)V")
    public final void method71(Graphics arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1) {
            Shape var7 = arg0.getClip();
            arg0.clipRect(arg3, arg4, arg2, arg5);
            arg0.drawImage(this.field2781, 0, 0, this.field1037);
            arg0.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZLjava/awt/Component;I)V")
    public final void method67(int arg0, boolean arg1, Component arg2, int arg3) {
        this.field2776 = arg3;
        this.field2780 = new int[arg0 * arg3 + 1];
        this.field2783 = arg0;
        DataBufferInt var5 = new DataBufferInt(this.field2780, this.field2780.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2776, this.field2783), var5, null);
        this.field2781 = new BufferedImage(var6, var7, arg1, new Hashtable());
        this.field1037 = arg2;
        this.method938(0);
    }
}
