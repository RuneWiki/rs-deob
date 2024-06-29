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

@OriginalClass("client!ea")
public class class45 extends class173 {

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "Ljava/awt/Component;")
    private Component field952;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/awt/Component;III)V")
    public final void method392(Component arg0, int arg1, int arg2, int arg3) {
        this.field3297 = arg1;
        this.field3300 = new int[arg1 * arg2 + 1];
        this.field3299 = arg2;
        if (arg3 != 0) {
            this.field952 = null;
        }
        DataBufferInt var5 = new DataBufferInt(this.field3300, this.field3300.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field3299, this.field3297), var5, null);
        this.field3298 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field952 = arg0;
        this.method1169((byte) -80);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIBILjava/awt/Graphics;I)V")
    public final void method393(int arg0, int arg1, byte arg2, int arg3, Graphics arg4, int arg5) {
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg1, arg3, arg0, arg5);
        arg4.drawImage(this.field3298, 0, 0, this.field952);
        if (arg2 < 89) {
            this.method394(16, null, 33, -65);
        }
        arg4.setClip(var7);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method394(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg0 != 3) {
            this.field952 = null;
        }
        arg1.drawImage(this.field3298, arg3, arg2, this.field952);
    }
}
