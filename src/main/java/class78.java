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

@OriginalClass("client!ne")
public class class78 extends class24 {

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "Ljava/awt/Component;")
    private Component field933;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public final void method145(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg3, arg2, arg0, arg4);
        if (arg1 == 21) {
            arg5.drawImage(this.field295, 0, 0, this.field933);
            arg5.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public final void method150(int arg0, int arg1, Component arg2, int arg3) {
        this.field288 = new int[arg0 * arg1 + 1];
        this.field287 = arg1;
        this.field296 = arg0;
        if (arg3 != 10572) {
            return;
        }
        DataBufferInt var5 = new DataBufferInt(this.field288, this.field288.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field287, this.field296), var5, (Point) null);
        this.field295 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field933 = arg2;
        this.method147(-118);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method149(int arg0, int arg1, Graphics arg2, int arg3) {
        arg2.drawImage(this.field295, arg1, arg0, this.field933);
        if (arg3 > -15) {
            this.method149(121, -111, (Graphics) null, -113);
        }
    }
}
