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

@OriginalClass("client!nk")
public class class257 extends class239 {

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "Ljava/awt/Component;")
    private Component field4547;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public final void method244(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg4, arg2, arg1, arg5);
        if (arg0 > -50) {
            this.field4547 = (Component) null;
        }
        arg3.drawImage(this.field4118, 0, 0, this.field4547);
        arg3.setClip(var7);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZLjava/awt/Graphics;II)V")
    public final void method241(boolean arg0, Graphics arg1, int arg2, int arg3) {
        arg1.drawImage(this.field4118, arg2, arg3, this.field4547);
        if (arg0) {
            this.method241(true, (Graphics) null, 90, 42);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IBLjava/awt/Component;I)V")
    public final void method250(int arg0, byte arg1, Component arg2, int arg3) {
        this.field4116 = arg0;
        this.field4121 = arg3;
        this.field4107 = new int[arg0 * arg3 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field4107, this.field4107.length);
        if (arg1 >= 0) {
            return;
        }
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field4121, this.field4116), var5, (Point) null);
        this.field4118 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field4547 = arg2;
        this.method1631(0);
    }
}
