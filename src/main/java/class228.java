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

@OriginalClass("client!le")
public class class228 extends class144 {

    @OriginalMember(owner = "client!le", name = "u", descriptor = "Ljava/awt/Component;")
    private Component field4073;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public final void method208(int arg0, int arg1, Component arg2, int arg3) {
        this.field2212 = new int[arg0 * arg1 + 1];
        this.field2217 = arg0;
        this.field2213 = arg1;
        if (arg3 != 8) {
            this.field4073 = null;
        }
        DataBufferInt var5 = new DataBufferInt(this.field2212, this.field2212.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2217, this.field2213), var5, null);
        this.field2216 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field4073 = arg2;
        this.method896((byte) -63);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZLjava/awt/Graphics;II)V")
    public final void method202(boolean arg0, Graphics arg1, int arg2, int arg3) {
        arg1.drawImage(this.field2216, arg3, arg2, this.field4073);
        if (arg0) {
            this.field4073 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public final void method206(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        Shape var7 = arg0.getClip();
        if (arg3 != 63) {
            this.method208(-30, 49, null, 66);
        }
        arg0.clipRect(arg4, arg5, arg2, arg1);
        arg0.drawImage(this.field2216, 0, 0, this.field4073);
        arg0.setClip(var7);
    }
}
