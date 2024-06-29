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

@OriginalClass("client!mf")
public class class10 extends class238 {

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "Ljava/awt/Component;")
    private Component field136;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public final void method44(int arg0, Component arg1, int arg2, int arg3) {
        this.field4262 = new int[arg0 * arg3 + 1];
        this.field4263 = arg3;
        this.field4260 = arg0;
        DataBufferInt var5 = new DataBufferInt(this.field4262, this.field4262.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg2 != 0) {
            this.method45(-34, -38, -81, 72, (Graphics) null, 50);
        }
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field4260, this.field4263), var5, (Point) null);
        this.field4256 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field136 = arg1;
        this.method1623(arg2 + 61);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public final void method45(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg0, arg1, arg3, arg2);
        arg4.drawImage(this.field4256, 0, arg5, this.field136);
        arg4.setClip(var7);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method46(int arg0, int arg1, int arg2, Graphics arg3) {
        arg3.drawImage(this.field4256, arg1, arg0, this.field136);
        if (arg2 != 23) {
            this.field136 = (Component) null;
        }
    }
}
