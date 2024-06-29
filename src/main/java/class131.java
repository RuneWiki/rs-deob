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

@OriginalClass("client!m")
public class class131 extends class130 {

    @OriginalMember(owner = "client!m", name = "o", descriptor = "Ljava/awt/Component;")
    private Component field2398;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
    public final void method35(boolean arg0, int arg1, int arg2, Component arg3) {
        this.field2389 = arg2;
        if (!arg0) {
            return;
        }
        this.field2388 = new int[arg1 * arg2 + 1];
        this.field2390 = arg1;
        DataBufferInt var5 = new DataBufferInt(this.field2388, this.field2388.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2389, this.field2390), var5, null);
        this.field2394 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field2398 = arg3;
        this.method884((byte) -93);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public final void method41(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        if (arg4 <= 28) {
            this.field2398 = null;
        }
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg2, arg0, arg1, arg3);
        arg5.drawImage(this.field2394, 0, 0, this.field2398);
        arg5.setClip(var7);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
    public final void method36(int arg0, Graphics arg1, byte arg2, int arg3) {
        if (arg2 != -94) {
            this.field2398 = null;
        }
        arg1.drawImage(this.field2394, arg3, arg0, this.field2398);
    }
}
