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

@OriginalClass("client!sf")
public class class93 extends class17 {

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "Ljava/awt/Component;")
    private Component field1670;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public final void method154(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg0, arg2, arg1, arg4);
        arg5.drawImage(this.field299, 0, 0, this.field1670);
        arg5.setClip(var7);
        int var8 = 25 % ((arg3 + 60) / 41);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public final void method152(Graphics arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -4547) {
            this.field1670 = (Component) null;
        }
        arg0.drawImage(this.field299, arg2, arg3, this.field1670);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ljava/awt/Component;IBI)V")
    public final void method155(Component arg0, int arg1, byte arg2, int arg3) {
        this.field295 = arg3;
        this.field294 = arg1;
        this.field300 = new int[arg1 * arg3 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field300, this.field300.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field295, this.field294), var5, (Point) null);
        this.field299 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field1670 = arg0;
        if (arg2 != 16) {
            this.field1670 = (Component) null;
        }
        this.method153(arg2 + 84);
    }
}
