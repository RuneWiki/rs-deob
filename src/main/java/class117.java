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
public class class117 extends class18 {

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "Ljava/awt/Component;")
    private Component field2592;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public final void method73(Graphics arg0, int arg1, int arg2, int arg3) {
        arg0.drawImage(this.field449, arg2, arg3, this.field2592);
        int var5 = 65 / ((-arg1 - 43) / 49);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IBLjava/awt/Component;I)V")
    public final void method72(int arg0, byte arg1, Component arg2, int arg3) {
        this.field445 = arg0;
        this.field443 = new int[arg0 * arg3 + 1];
        this.field451 = arg3;
        DataBufferInt var5 = new DataBufferInt(this.field443, this.field443.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        int var7 = -85 % ((61 - arg1) / 61);
        WritableRaster var8 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field451, this.field445), var5, null);
        this.field449 = new BufferedImage(var6, var8, false, new Hashtable());
        this.field2592 = arg2;
        this.method184((byte) 80);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
    public final void method78(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5) {
        if (arg4 != -1) {
            this.method73(null, -25, 16, 31);
        }
        Shape var7 = arg2.getClip();
        arg2.clipRect(arg5, arg1, arg0, arg3);
        arg2.drawImage(this.field449, 0, 0, this.field2592);
        arg2.setClip(var7);
    }
}
