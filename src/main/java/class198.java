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

@OriginalClass("client!fj")
public class class198 extends class144 {

    @OriginalMember(owner = "client!fj", name = "j", descriptor = "Ljava/awt/Component;")
    private Component field3572;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIBLjava/awt/Graphics;)V")
    public final void method36(int arg0, int arg1, int arg2, int arg3, byte arg4, Graphics arg5) {
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg1, arg2, arg0, arg3);
        arg5.drawImage(this.field2770, 0, 0, this.field3572);
        if (arg4 < 96) {
            this.field3572 = (Component) null;
        }
        arg5.setClip(var7);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIBLjava/awt/Component;)V")
    public final void method33(int arg0, int arg1, byte arg2, Component arg3) {
        this.field2773 = new int[arg0 * arg1 + 1];
        this.field2775 = arg0;
        int var5 = -20 / ((arg2 - 69) / 47);
        this.field2774 = arg1;
        DataBufferInt var6 = new DataBufferInt(this.field2773, this.field2773.length);
        DirectColorModel var7 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var8 = Raster.createWritableRaster(var7.createCompatibleSampleModel(this.field2775, this.field2774), var6, (Point) null);
        this.field2770 = new BufferedImage(var7, var8, false, new Hashtable());
        this.field3572 = arg3;
        this.method1068(false);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public final void method38(Graphics arg0, int arg1, int arg2, int arg3) {
        arg0.drawImage(this.field2770, arg1, arg3, this.field3572);
        if (arg2 >= -88) {
            this.field3572 = (Component) null;
        }
    }
}
