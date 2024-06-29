import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class101 extends class134 {

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "Ljava/awt/Component;")
    private Component field2561;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 9)
    public final void method102(int arg0, int arg1, Graphics arg2, int arg3) {
        if (arg0 == 0) {
            arg2.drawImage(this.field3295, arg1, arg3, this.field2561);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILjava/awt/Component;I)V", line = 19)
    public final void method107(int arg0, int arg1, Component arg2, int arg3) {
        this.field3289 = arg1;
        if (arg0 <= 4) {
            return;
        }
        this.field3291 = new int[arg1 * arg3 + 1];
        this.field3287 = arg3;
        DataBufferInt var5 = new DataBufferInt(this.field3291, this.field3291.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field3289, this.field3287), var5, null);
        this.field3295 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field2561 = arg2;
        this.method1057((byte) 90);
    }
}
