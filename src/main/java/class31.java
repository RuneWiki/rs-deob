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

@OriginalClass("client!f")
public class class31 extends class110 {

    @OriginalMember(owner = "client!f", name = "B", descriptor = "Ljava/awt/Component;")
    private Component field755;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILjava/awt/Graphics;ZI)V", line = 9)
    public final void method253(int arg0, Graphics arg1, boolean arg2, int arg3) {
        if (arg2) {
            this.method254(90, false, 74, null);
        }
        arg1.drawImage(this.field2756, arg3, arg0, this.field755);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IZILjava/awt/Component;)V", line = 22)
    public final void method254(int arg0, boolean arg1, int arg2, Component arg3) {
        this.field2772 = arg2;
        this.field2770 = arg0;
        this.field2757 = new int[arg0 * arg2 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field2757, this.field2757.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2772, this.field2770), var5, null);
        this.field2756 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field755 = arg3;
        this.method885(-102);
        if (!arg1) {
            this.field755 = null;
        }
    }
}
