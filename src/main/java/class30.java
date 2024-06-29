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

@OriginalClass("client!ch")
public class class30 extends class230 {

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "Ljava/awt/Component;")
    private Component field647;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZILjava/awt/Graphics;I)V")
    public final void method250(boolean arg0, int arg1, Graphics arg2, int arg3) {
        if (!arg0) {
            this.field647 = null;
        }
        arg2.drawImage(this.field4323, arg1, arg3, this.field647);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public final void method251(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg2, arg5, arg0, arg3);
        arg4.drawImage(this.field4323, 0, 0, this.field647);
        if (arg1 != -1) {
            this.method252(-64, -83, null, -125);
        }
        arg4.setClip(var7);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public final void method252(int arg0, int arg1, Component arg2, int arg3) {
        this.field4328 = new int[arg0 * arg3 + 1];
        this.field4320 = arg0;
        this.field4325 = arg3;
        DataBufferInt var5 = new DataBufferInt(this.field4328, this.field4328.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field4325, this.field4320), var5, null);
        this.field4323 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field647 = arg2;
        this.method1511(false);
        if (arg1 != -1) {
            this.method252(-49, 64, null, -43);
        }
    }
}
