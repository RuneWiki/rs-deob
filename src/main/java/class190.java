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

@OriginalClass("client!tj")
public class class190 extends class136 {

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "Ljava/awt/Component;")
    private Component field2718;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIZLjava/awt/Graphics;II)V", line = 11)
    public final void method906(int arg0, int arg1, boolean arg2, Graphics arg3, int arg4, int arg5) {
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg0, arg5, arg4, arg1);
        arg3.drawImage(this.field1887, 0, 0, this.field2718);
        arg3.setClip(var7);
        if (arg2) {
            this.field2718 = (Component) null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILjava/awt/Component;II)V", line = 24)
    public final void method905(int arg0, Component arg1, int arg2, int arg3) {
        this.field1889 = arg3;
        this.field1883 = new int[arg0 * arg3 + arg2];
        this.field1885 = arg0;
        DataBufferInt var5 = new DataBufferInt(this.field1883, this.field1883.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1889, this.field1885), var5, (Point) null);
        this.field1887 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field2718 = arg1;
        this.method904((byte) -28);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V", line = 42)
    public final void method909(Graphics arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 71) {
            this.method905(-30, (Component) null, 51, 77);
        }
        arg0.drawImage(this.field1887, arg1, arg2, this.field2718);
    }
}
