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

@OriginalClass("client!of")
public class class208 extends class173 {

    @OriginalMember(owner = "client!of", name = "p", descriptor = "Ljava/awt/Component;")
    private Component field3005;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIBILjava/awt/Graphics;I)V")
    public final void method206(int arg0, int arg1, byte arg2, int arg3, Graphics arg4, int arg5) {
        Shape var7 = arg4.getClip();
        if (arg2 >= -49) {
            this.method204(-107, 37, -1, (Component) null);
        }
        arg4.clipRect(arg5, arg3, arg0, arg1);
        arg4.drawImage(this.field2472, 0, 0, this.field3005);
        arg4.setClip(var7);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BLjava/awt/Graphics;II)V")
    public final void method201(byte arg0, Graphics arg1, int arg2, int arg3) {
        arg1.drawImage(this.field2472, arg3, arg2, this.field3005);
        if (arg0 >= -78) {
            this.method201((byte) 92, (Graphics) null, -73, -122);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method204(int arg0, int arg1, int arg2, Component arg3) {
        this.field2476 = new int[arg0 * arg2 + 1];
        this.field2477 = arg0;
        this.field2482 = arg2;
        DataBufferInt var5 = new DataBufferInt(this.field2476, this.field2476.length);
        if (arg1 > -24) {
            return;
        }
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2482, this.field2477), var5, (Point) null);
        this.field2472 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field3005 = arg3;
        this.method1142(25);
    }
}
