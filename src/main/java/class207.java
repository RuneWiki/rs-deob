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

@OriginalClass("client!el")
public class class207 extends class19 {

    @OriginalMember(owner = "client!el", name = "o", descriptor = "Ljava/awt/Component;")
    private Component field3230;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILjava/awt/Component;IZ)V")
    public final void method180(int arg0, Component arg1, int arg2, boolean arg3) {
        this.field292 = new int[arg0 * arg2 + 1];
        this.field290 = arg2;
        this.field282 = arg0;
        DataBufferInt var5 = new DataBufferInt(this.field292, this.field292.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field290, this.field282), var5, (Point) null);
        this.field284 = new BufferedImage(var6, var7, arg3, new Hashtable());
        this.field3230 = arg1;
        this.method176((byte) 64);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method182(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg0 != -11104) {
            this.method182(1, 51, -78, (Graphics) null);
        }
        arg3.drawImage(this.field284, arg2, arg1, this.field3230);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public final void method177(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg2, arg4, arg1, arg5);
        if (arg3 == 8) {
            arg0.drawImage(this.field284, 0, 0, this.field3230);
            arg0.setClip(var7);
        }
    }
}
