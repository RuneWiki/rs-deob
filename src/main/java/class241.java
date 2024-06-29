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

@OriginalClass("client!rf")
public class class241 extends class145 {

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "Ljava/awt/Component;")
    private Component field4346;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method322(int arg0, int arg1, int arg2, Component arg3) {
        this.field2604 = arg0;
        this.field2608 = arg2;
        this.field2606 = new int[arg0 * arg2 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field2606, this.field2606.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg1 <= 21) {
            this.field4346 = (Component) null;
        }
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2608, this.field2604), var5, (Point) null);
        this.field2601 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field4346 = arg3;
        this.method923((byte) -59);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public final void method323(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5) {
        Shape var7 = arg1.getClip();
        arg1.clipRect(arg0, arg3, arg2, arg5);
        arg1.drawImage(this.field2601, 0, 0, this.field4346);
        arg1.setClip(var7);
        if (arg4 != 2500) {
            this.method323(51, (Graphics) null, -56, 63, 22, 57);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method321(int arg0, int arg1, Graphics arg2, int arg3) {
        arg2.drawImage(this.field2601, arg0, arg3, this.field4346);
        if (arg1 != 0) {
            this.field4346 = (Component) null;
        }
    }
}
