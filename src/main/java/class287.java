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

@OriginalClass("client!rk")
public class class287 extends class272 {

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "Ljava/awt/Component;")
    private Component field4499;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
    public final void method1457(int arg0, Graphics arg1, byte arg2, int arg3) {
        arg1.drawImage(this.field4342, arg3, arg0, this.field4499);
        if (arg2 < 84) {
            this.field4499 = (Component) null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public final void method1456(int arg0, int arg1, Component arg2, int arg3) {
        this.field4348 = arg3;
        this.field4350 = new int[arg1 * arg3 + 1];
        if (arg0 <= 45) {
            this.method1456(71, 72, (Component) null, -90);
        }
        this.field4349 = arg1;
        DataBufferInt var5 = new DataBufferInt(this.field4350, this.field4350.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field4349, this.field4348), var5, (Point) null);
        this.field4342 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field4499 = arg2;
        this.method1862(false);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public final void method1460(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg5, arg0, arg3, arg2);
        arg4.drawImage(this.field4342, 0, 0, this.field4499);
        arg4.setClip(var7);
        if (arg1 != -326) {
            this.method1460(96, -75, 16, -31, (Graphics) null, -43);
        }
    }
}
