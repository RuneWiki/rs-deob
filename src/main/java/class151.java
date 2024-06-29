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

@OriginalClass("client!qh")
public class class151 extends class314 {

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "Ljava/awt/Component;")
    private Component field2458;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Ljava/awt/Component;III)V", line = 9)
    public final void method1100(Component arg0, int arg1, int arg2, int arg3) {
        this.field5349 = arg3;
        this.field5344 = new int[arg2 * arg3 + arg1];
        this.field5354 = arg2;
        DataBufferInt var5 = new DataBufferInt(this.field5344, this.field5344.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field5349, this.field5354), var5, (Point) null);
        this.field5341 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field2458 = arg0;
        this.method2131((byte) 40);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V", line = 28)
    public final void method1101(Graphics arg0, byte arg1, int arg2, int arg3) {
        if (arg1 == 79) {
            arg0.drawImage(this.field5341, arg3, arg2, this.field2458);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILjava/awt/Graphics;IIBI)V", line = 41)
    public final void method1102(int arg0, Graphics arg1, int arg2, int arg3, byte arg4, int arg5) {
        Shape var7 = arg1.getClip();
        if (arg4 <= 48) {
            this.method1102(82, (Graphics) null, -127, -95, (byte) 29, 63);
        }
        arg1.clipRect(arg2, arg5, arg0, arg3);
        arg1.drawImage(this.field5341, 0, 0, this.field2458);
        arg1.setClip(var7);
    }
}
