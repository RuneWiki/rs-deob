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

@OriginalClass("client!ef")
public class class308 extends class264 {

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "Ljava/awt/Component;")
    private Component field4965;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIZLjava/awt/Graphics;II)V")
    public final void method68(int arg0, int arg1, boolean arg2, Graphics arg3, int arg4, int arg5) {
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg5, arg0, arg4, arg1);
        arg3.drawImage(this.field4291, 0, 0, this.field4965);
        arg3.setClip(var7);
        if (!arg2) {
            this.field4965 = (Component) null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BLjava/awt/Graphics;II)V")
    public final void method64(byte arg0, Graphics arg1, int arg2, int arg3) {
        arg1.drawImage(this.field4291, arg3, arg2, this.field4965);
        if (arg0 >= -32) {
            this.field4965 = (Component) null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
    public final void method65(int arg0, int arg1, boolean arg2, Component arg3) {
        this.field4293 = new int[arg0 * arg1 + 1];
        this.field4285 = arg0;
        this.field4292 = arg1;
        DataBufferInt var5 = new DataBufferInt(this.field4293, this.field4293.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field4292, this.field4285), var5, (Point) null);
        this.field4291 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field4965 = arg3;
        this.method1849(arg2);
    }
}
