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

@OriginalClass("client!eb")
public class class231 extends class39 {

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "Ljava/awt/Component;")
    private Component field4136;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIBLjava/awt/Component;)V")
    public final void method157(int arg0, int arg1, byte arg2, Component arg3) {
        this.field699 = new int[arg0 * arg1 + 1];
        this.field696 = arg0;
        this.field698 = arg1;
        if (arg2 > -17) {
            this.field4136 = (Component) null;
        }
        DataBufferInt var5 = new DataBufferInt(this.field699, this.field699.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field696, this.field698), var5, (Point) null);
        this.field702 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field4136 = arg3;
        this.method261(90);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZIILjava/awt/Graphics;)V")
    public final void method156(boolean arg0, int arg1, int arg2, Graphics arg3) {
        arg3.drawImage(this.field702, arg2, arg1, this.field4136);
        if (!arg0) {
            this.field4136 = (Component) null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public final void method155(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg4, arg5, arg2, arg3);
        arg0.drawImage(this.field702, 0, 0, this.field4136);
        arg0.setClip(var7);
        if (arg1 != 32767) {
            this.method155((Graphics) null, 125, 1, 56, -117, 77);
        }
    }
}
