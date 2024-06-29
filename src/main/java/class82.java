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

@OriginalClass("client!gg")
public class class82 extends class10 {

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "Ljava/awt/Component;")
    private Component field1074;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIZILjava/awt/Graphics;I)V", line = 10)
    public final void method64(int arg0, int arg1, boolean arg2, int arg3, Graphics arg4, int arg5) {
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg3, arg0, arg5, arg1);
        if (arg2) {
            this.field1074 = (Component) null;
        }
        arg4.drawImage(this.field109, 0, 0, this.field1074);
        arg4.setClip(var7);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BLjava/awt/Component;II)V", line = 23)
    public final void method65(byte arg0, Component arg1, int arg2, int arg3) {
        this.field100 = arg3;
        this.field112 = arg2;
        this.field102 = new int[arg2 * arg3 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field102, this.field102.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg0 != 111) {
            this.method64(-16, -94, false, 40, (Graphics) null, 26);
        }
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field100, this.field112), var5, (Point) null);
        this.field109 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field1074 = arg1;
        this.method59(0);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 45)
    public final void method58(int arg0, int arg1, int arg2, Graphics arg3) {
        arg3.drawImage(this.field109, arg0, arg2, this.field1074);
        if (arg1 != -113) {
            this.field1074 = (Component) null;
        }
    }
}
