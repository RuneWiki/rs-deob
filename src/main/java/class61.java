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

@OriginalClass("client!oc")
public class class61 extends class75 {

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "Ljava/awt/Component;")
    private Component field849;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZILjava/awt/Graphics;I)V")
    public final void method295(boolean arg0, int arg1, Graphics arg2, int arg3) {
        arg2.drawImage(this.field1069, arg1, arg3, this.field849);
        if (!arg0) {
            this.method291((Component) null, 74, -40, -65);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZLjava/awt/Graphics;III)V")
    public final void method292(int arg0, boolean arg1, Graphics arg2, int arg3, int arg4, int arg5) {
        Shape var7 = arg2.getClip();
        arg2.clipRect(arg3, arg0, arg4, arg5);
        arg2.drawImage(this.field1069, 0, 0, this.field849);
        arg2.setClip(var7);
        if (!arg1) {
            this.field849 = (Component) null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public final void method291(Component arg0, int arg1, int arg2, int arg3) {
        this.field1068 = arg2;
        this.field1065 = arg3;
        if (arg1 != 1) {
            this.method291((Component) null, -91, 123, 45);
        }
        this.field1060 = new int[arg2 * arg3 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field1060, this.field1060.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1065, this.field1068), var5, (Point) null);
        this.field1069 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field849 = arg0;
        this.method513(-3);
    }
}
