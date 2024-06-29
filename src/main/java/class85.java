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

@OriginalClass("client!ai")
public class class85 extends class21 {

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "Ljava/awt/Component;")
    private Component field1647;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILjava/awt/Graphics;IZ)V")
    public final void method158(int arg0, Graphics arg1, int arg2, boolean arg3) {
        arg1.drawImage(this.field542, arg0, arg2, this.field1647);
        if (arg3) {
            this.field1647 = (Component) null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IILjava/awt/Graphics;IBI)V")
    public final void method159(int arg0, int arg1, Graphics arg2, int arg3, byte arg4, int arg5) {
        if (arg4 > -62) {
            this.field1647 = (Component) null;
        }
        Shape var7 = arg2.getClip();
        arg2.clipRect(arg3, arg5, arg1, arg0);
        arg2.drawImage(this.field542, 0, 0, this.field1647);
        arg2.setClip(var7);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public final void method160(Component arg0, int arg1, int arg2, int arg3) {
        this.field549 = arg2;
        this.field546 = arg3;
        this.field539 = new int[arg2 * arg3 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field539, this.field539.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field546, this.field549), var5, (Point) null);
        this.field542 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field1647 = arg0;
        this.method157(true);
        if (arg1 != 0) {
            this.field1647 = (Component) null;
        }
    }
}
