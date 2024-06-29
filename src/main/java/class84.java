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

@OriginalClass("client!rg")
public class class84 extends class152 {

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "Ljava/awt/Component;")
    private Component field1151;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZIILjava/awt/Graphics;I)V")
    public final void method422(int arg0, boolean arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        if (!arg1) {
            Shape var7 = arg4.getClip();
            arg4.clipRect(arg2, arg0, arg3, arg5);
            arg4.drawImage(this.field2459, 0, 0, this.field1151);
            arg4.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method427(int arg0, Graphics arg1, int arg2, int arg3) {
        arg1.drawImage(this.field2459, arg0, arg2, this.field1151);
        if (arg3 != -3621) {
            this.field1151 = (Component) null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/awt/Component;IBI)V")
    public final void method428(Component arg0, int arg1, byte arg2, int arg3) {
        this.field2463 = new int[arg1 * arg3 + 1];
        this.field2454 = arg1;
        if (arg2 < 38) {
            this.field1151 = (Component) null;
        }
        this.field2466 = arg3;
        DataBufferInt var5 = new DataBufferInt(this.field2463, this.field2463.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2454, this.field2466), var5, (Point) null);
        this.field2459 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field1151 = arg0;
        this.method1028(-82);
    }
}
