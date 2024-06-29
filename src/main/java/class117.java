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

@OriginalClass("client!dh")
public class class117 extends class76 {

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "Ljava/awt/Component;")
    private Component field2225;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public final void method46(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 1) {
            this.field2225 = (Component) null;
        }
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg1, arg5, arg4, arg2);
        arg0.drawImage(this.field1486, 0, 0, this.field2225);
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method49(int arg0, int arg1, int arg2, Component arg3) {
        this.field1487 = new int[arg0 * arg2 + 1];
        this.field1489 = arg0;
        this.field1477 = arg2;
        if (arg1 != 26480) {
            this.method46((Graphics) null, -60, -125, 124, -99, 9);
        }
        DataBufferInt var5 = new DataBufferInt(this.field1487, this.field1487.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1477, this.field1489), var5, (Point) null);
        this.field1486 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field2225 = arg3;
        this.method550(-124);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method51(int arg0, int arg1, int arg2, Graphics arg3) {
        arg3.drawImage(this.field1486, arg0, arg1, this.field2225);
        if (arg2 != -3) {
            this.field2225 = (Component) null;
        }
    }
}
