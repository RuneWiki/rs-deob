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

@OriginalClass("client!ca")
public class class271 extends class174 {

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "Ljava/awt/Component;")
    private Component field4086;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public final void method1072(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg4, arg3, arg2, arg0);
        arg5.drawImage(this.field2654, 0, 0, this.field4086);
        if (arg1 <= 72) {
            this.method1074(89, -43, (Graphics) null, (byte) -59);
        }
        arg5.setClip(var7);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IBILjava/awt/Component;)V")
    public final void method1078(int arg0, byte arg1, int arg2, Component arg3) {
        this.field2647 = new int[arg0 * arg2 + 1];
        this.field2656 = arg0;
        this.field2650 = arg2;
        DataBufferInt var5 = new DataBufferInt(this.field2647, this.field2647.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2656, this.field2650), var5, (Point) null);
        this.field2654 = new BufferedImage(var6, var7, false, new Hashtable());
        if (arg1 < -122) {
            this.field4086 = arg3;
            this.method1077(-92);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
    public final void method1074(int arg0, int arg1, Graphics arg2, byte arg3) {
        arg2.drawImage(this.field2654, arg1, arg0, this.field4086);
        if (arg3 > -48) {
            this.field4086 = (Component) null;
        }
    }
}
