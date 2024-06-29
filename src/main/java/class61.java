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

@OriginalClass("client!qk")
public class class61 extends class64 {

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "Ljava/awt/Component;")
    private Component field1269;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Ljava/awt/Graphics;III)V", line = 10)
    public final void method541(Graphics arg0, int arg1, int arg2, int arg3) {
        arg0.drawImage(this.field1316, arg3, arg2, this.field1269);
        if (arg1 >= -6) {
            this.method542(4, (byte) 122, 38, (Component) null);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBILjava/awt/Component;)V", line = 24)
    public final void method542(int arg0, byte arg1, int arg2, Component arg3) {
        this.field1315 = arg0;
        this.field1309 = arg2;
        this.field1313 = new int[arg0 * arg2 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field1313, this.field1313.length);
        if (arg1 != -44) {
            this.field1269 = (Component) null;
        }
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1315, this.field1309), var5, (Point) null);
        this.field1316 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field1269 = arg3;
        this.method562(32);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V", line = 44)
    public final void method543(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        Shape var7 = arg3.getClip();
        if (arg5 != 27588) {
            this.field1269 = (Component) null;
        }
        arg3.clipRect(arg2, arg0, arg4, arg1);
        arg3.drawImage(this.field1316, 0, 0, this.field1269);
        arg3.setClip(var7);
    }
}
