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

@OriginalClass("client!lc")
public class class84 extends class38 {

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "Ljava/awt/Component;")
    private Component field1388;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/awt/Graphics;IIIIB)V")
    public final void method302(Graphics arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg2, arg1, arg4, arg3);
        arg0.drawImage(this.field677, 0, 0, this.field1388);
        if (arg5 != -16) {
            this.field1388 = (Component) null;
        }
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method300(int arg0, int arg1, Graphics arg2, int arg3) {
        if (arg0 != -14412) {
            this.method300(-105, -99, (Graphics) null, 113);
        }
        arg2.drawImage(this.field677, arg1, arg3, this.field1388);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/awt/Component;IIZ)V")
    public final void method301(Component arg0, int arg1, int arg2, boolean arg3) {
        this.field681 = arg2;
        if (!arg3) {
            return;
        }
        this.field672 = arg1;
        this.field671 = new int[arg1 * arg2 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field671, this.field671.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field672, this.field681), var5, (Point) null);
        this.field677 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field1388 = arg0;
        this.method299(30);
    }
}
