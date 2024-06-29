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
public class class157 extends class188 {

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "Ljava/awt/Component;")
    private Component field2476;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZLjava/awt/Graphics;IIII)V", line = 10)
    public final void method179(boolean arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5) {
        Shape var7 = arg1.getClip();
        arg1.clipRect(arg2, arg5, arg3, arg4);
        if (arg0) {
            this.method178(-85, 75, (Graphics) null, (byte) -38);
        }
        arg1.drawImage(this.field3060, 0, 0, this.field2476);
        arg1.setClip(var7);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IILjava/awt/Graphics;B)V", line = 24)
    public final void method178(int arg0, int arg1, Graphics arg2, byte arg3) {
        if (arg3 != -117) {
            this.field2476 = (Component) null;
        }
        arg2.drawImage(this.field3060, arg1, arg0, this.field2476);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IBLjava/awt/Component;I)V", line = 36)
    public final void method176(int arg0, byte arg1, Component arg2, int arg3) {
        if (arg1 > -114) {
            this.field2476 = (Component) null;
        }
        this.field3057 = arg0;
        this.field3061 = new int[arg0 * arg3 + 1];
        this.field3056 = arg3;
        DataBufferInt var5 = new DataBufferInt(this.field3061, this.field3061.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field3056, this.field3057), var5, (Point) null);
        this.field3060 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field2476 = arg2;
        this.method1353((byte) -26);
    }
}
