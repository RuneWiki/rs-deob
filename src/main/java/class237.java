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

@OriginalClass("client!oe")
public class class237 extends class304 {

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "Ljava/awt/Component;")
    private Component field3679;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V", line = 9)
    public final void method976(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        if (arg0 != 8) {
            this.method973((Component) null, -48, -7, 5);
        }
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg3, arg1, arg4, arg2);
        arg5.drawImage(this.field4736, 0, 0, this.field3679);
        arg5.setClip(var7);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/awt/Component;III)V", line = 23)
    public final void method973(Component arg0, int arg1, int arg2, int arg3) {
        this.field4733 = arg1;
        this.field4737 = new int[arg1 * arg3 + 1];
        if (arg2 != 6195) {
            return;
        }
        this.field4730 = arg3;
        DataBufferInt var5 = new DataBufferInt(this.field4737, this.field4737.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field4730, this.field4733), var5, (Point) null);
        this.field4736 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field3679 = arg0;
        this.method2190(arg2 - 6194);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V", line = 44)
    public final void method970(int arg0, int arg1, byte arg2, Graphics arg3) {
        arg3.drawImage(this.field4736, arg0, arg1, this.field3679);
        int var5 = -37 % ((arg2 - 76) / 38);
    }
}
