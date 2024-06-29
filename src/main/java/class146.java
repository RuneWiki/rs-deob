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

@OriginalClass("client!wb")
public class class146 extends class102 {

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "Ljava/awt/Component;")
    private Component field3639;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method109(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg2 != 0) {
            this.method109(31, 25, 114, null);
        }
        arg3.drawImage(this.field2479, arg0, arg1, this.field3639);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public final void method107(int arg0, int arg1, Component arg2, int arg3) {
        this.field2478 = new int[arg1 * arg3 + 1];
        this.field2491 = arg1;
        this.field2486 = arg3;
        DataBufferInt var5 = new DataBufferInt(this.field2478, this.field2478.length);
        if (arg0 != 0) {
            this.field3639 = null;
        }
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2486, this.field2491), var5, null);
        this.field2479 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field3639 = arg2;
        this.method874((byte) 38);
    }
}
