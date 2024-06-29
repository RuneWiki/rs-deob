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

@OriginalClass("client!rl")
public class class195 extends class206 {

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "Ljava/awt/Component;")
    private Component field3095;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BIILjava/awt/Component;)V", line = 9)
    public final void method617(byte arg0, int arg1, int arg2, Component arg3) {
        this.field3261 = arg1;
        this.field3255 = arg2;
        if (arg0 != -123) {
            this.method619(-88, -7, 44, -8, (Graphics) null, -114);
        }
        this.field3257 = new int[arg1 * arg2 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field3257, this.field3257.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field3261, this.field3255), var5, (Point) null);
        this.field3262 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field3095 = arg3;
        this.method1474((byte) -105);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V", line = 31)
    public final void method619(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg2, arg5, arg3, arg0);
        arg4.drawImage(this.field3262, 0, arg1, this.field3095);
        arg4.setClip(var7);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 44)
    public final void method623(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg3 >= -89) {
            this.method617((byte) -103, 44, 122, (Component) null);
        }
        arg1.drawImage(this.field3262, arg0, arg2, this.field3095);
    }
}
