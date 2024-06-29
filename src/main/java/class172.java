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

@OriginalClass("client!oh")
public class class172 extends class280 {

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "Ljava/awt/Component;")
    private Component field2966;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V", line = 10)
    public final void method1214(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5) {
        Shape var7 = arg1.getClip();
        arg1.clipRect(arg5, arg4, arg2, arg3);
        arg1.drawImage(this.field4706, 0, 0, this.field2966);
        int var8 = -122 % ((-arg0 - 36) / 63);
        arg1.setClip(var7);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILjava/awt/Graphics;IZ)V", line = 22)
    public final void method1215(int arg0, Graphics arg1, int arg2, boolean arg3) {
        if (arg3) {
            this.field2966 = (Component) null;
        }
        arg1.drawImage(this.field4706, arg2, arg0, this.field2966);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILjava/awt/Component;II)V", line = 33)
    public final void method1216(int arg0, Component arg1, int arg2, int arg3) {
        this.field4713 = arg0;
        this.field4705 = arg3;
        if (arg2 != 1) {
            this.field2966 = (Component) null;
        }
        this.field4714 = new int[arg0 * arg3 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field4714, this.field4714.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field4713, this.field4705), var5, (Point) null);
        this.field4706 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field2966 = arg1;
        this.method1954(21155);
    }
}
