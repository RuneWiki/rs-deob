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

@OriginalClass("client!fc")
public class class119 extends class175 {

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "Ljava/awt/Component;")
    private Component field2112;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
    public final void method362(int arg0, int arg1, boolean arg2, Component arg3) {
        this.field3073 = new int[arg0 * arg1 + 1];
        this.field3075 = arg1;
        this.field3081 = arg0;
        DataBufferInt var5 = new DataBufferInt(this.field3073, this.field3073.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field3081, this.field3075), var5, (Point) null);
        this.field3077 = new BufferedImage(var6, var7, arg2, new Hashtable());
        this.field2112 = arg3;
        this.method1281(19116);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method361(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg3 != -7295) {
            this.method362(-46, -15, true, (Component) null);
        }
        arg1.drawImage(this.field3077, arg0, arg2, this.field2112);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILjava/awt/Graphics;IZI)V")
    public final void method360(int arg0, int arg1, Graphics arg2, int arg3, boolean arg4, int arg5) {
        if (arg4) {
            this.method361(-12, (Graphics) null, -6, 10);
        }
        Shape var7 = arg2.getClip();
        arg2.clipRect(arg5, arg1, arg0, arg3);
        arg2.drawImage(this.field3077, 0, 0, this.field2112);
        arg2.setClip(var7);
    }
}
