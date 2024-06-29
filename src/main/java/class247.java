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

@OriginalClass("client!wg")
public class class247 extends class252 {

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "Ljava/awt/Component;")
    private Component field4399;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/awt/Graphics;IIBII)V")
    public final void method281(Graphics arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        Shape var7 = arg0.getClip();
        if (arg3 >= -26) {
            this.method281((Graphics) null, 43, 105, (byte) 22, 86, 73);
        }
        arg0.clipRect(arg5, arg4, arg1, arg2);
        arg0.drawImage(this.field4480, 0, 0, this.field4399);
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public final void method276(int arg0, Component arg1, int arg2, int arg3) {
        this.field4486 = new int[arg0 * arg3 + 1];
        this.field4485 = arg0;
        this.field4488 = arg3;
        if (arg2 != -3) {
            return;
        }
        DataBufferInt var5 = new DataBufferInt(this.field4486, this.field4486.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field4488, this.field4485), var5, (Point) null);
        this.field4480 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field4399 = arg1;
        this.method1710(false);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method274(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg0 != 957) {
            this.field4399 = (Component) null;
        }
        arg1.drawImage(this.field4480, arg2, arg3, this.field4399);
    }
}
