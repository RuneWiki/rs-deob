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

@OriginalClass("client!cd")
public class class206 extends class141 {

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "Ljava/awt/Component;")
    private Component field3481;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public final void method1014(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg3, arg2, arg4, arg5);
        arg0.drawImage(this.field2484, 0, arg1, this.field3481);
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public final void method1015(int arg0, Component arg1, int arg2, int arg3) {
        this.field2486 = arg2;
        this.field2489 = arg0;
        this.field2487 = new int[arg0 * arg2 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field2487, this.field2487.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2489, this.field2486), var5, (Point) null);
        this.field2484 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field3481 = arg1;
        if (arg3 != 100) {
            this.field3481 = (Component) null;
        }
        this.method1016((byte) 113);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V")
    public final void method1018(int arg0, int arg1, byte arg2, Graphics arg3) {
        int var5 = 108 % ((39 - arg2) / 37);
        arg3.drawImage(this.field2484, arg0, arg1, this.field3481);
    }
}
