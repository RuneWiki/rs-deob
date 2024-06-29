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

@OriginalClass("client!qf")
public class class251 extends class16 {

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "Ljava/awt/Component;")
    private Component field4158;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
    public final void method116(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5) {
        Shape var7 = arg2.getClip();
        arg2.clipRect(arg3, arg5, arg0, arg1);
        arg2.drawImage(this.field180, 0, 0, this.field4158);
        int var8 = 46 % ((-arg4 - 69) / 54);
        arg2.setClip(var7);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method114(int arg0, int arg1, Graphics arg2, int arg3) {
        if (arg0 == -2377) {
            arg2.drawImage(this.field180, arg3, arg1, this.field4158);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method117(int arg0, int arg1, int arg2, Component arg3) {
        this.field175 = arg0;
        if (arg1 != 3) {
            this.field4158 = (Component) null;
        }
        this.field179 = arg2;
        this.field181 = new int[arg0 * arg2 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field181, this.field181.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field175, this.field179), var5, (Point) null);
        this.field180 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field4158 = arg3;
        this.method111((byte) 50);
    }
}
