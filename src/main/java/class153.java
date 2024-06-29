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

@OriginalClass("client!eh")
public class class153 extends class116 {

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "Ljava/awt/Component;")
    private Component field2687;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IZIIILjava/awt/Graphics;)V")
    public final void method824(int arg0, boolean arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        if (!arg1) {
            Shape var7 = arg5.getClip();
            arg5.clipRect(arg3, arg2, arg0, arg4);
            arg5.drawImage(this.field2090, 0, 0, this.field2687);
            arg5.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method830(int arg0, int arg1, int arg2, Graphics arg3) {
        arg3.drawImage(this.field2090, arg0, arg2, this.field2687);
        if (arg1 != -1097334752) {
            this.field2687 = (Component) null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IILjava/awt/Component;Z)V")
    public final void method825(int arg0, int arg1, Component arg2, boolean arg3) {
        this.field2091 = arg0;
        this.field2087 = arg1;
        this.field2084 = new int[arg0 * arg1 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field2084, this.field2084.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2091, this.field2087), var5, (Point) null);
        this.field2090 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field2687 = arg2;
        this.method827((byte) -124);
        if (!arg3) {
            this.method824(88, false, 70, 13, 101, (Graphics) null);
        }
    }
}
