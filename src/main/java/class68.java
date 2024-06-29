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

@OriginalClass("client!fk")
public class class68 extends class160 {

    @OriginalMember(owner = "client!fk", name = "A", descriptor = "Ljava/awt/Component;")
    private Component field870;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/awt/Component;IIB)V", line = 9)
    public final void method325(Component arg0, int arg1, int arg2, byte arg3) {
        this.field2285 = arg1;
        this.field2284 = arg2;
        if (arg3 != 0) {
            this.field870 = (Component) null;
        }
        this.field2283 = new int[arg1 * arg2 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field2283, this.field2283.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2285, this.field2284), var5, (Point) null);
        this.field2279 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field870 = arg0;
        this.method1224(84167136);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZIIILjava/awt/Graphics;I)V", line = 32)
    public final void method316(boolean arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        if (arg0) {
            Shape var7 = arg4.getClip();
            arg4.clipRect(arg5, arg2, arg1, arg3);
            arg4.drawImage(this.field2279, 0, 0, this.field870);
            arg4.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V", line = 45)
    public final void method320(int arg0, Graphics arg1, byte arg2, int arg3) {
        if (arg2 >= -122) {
            this.field870 = (Component) null;
        }
        arg1.drawImage(this.field2279, arg0, arg3, this.field870);
    }
}
