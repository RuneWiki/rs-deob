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

@OriginalClass("client!va")
public class class122 extends class90 {

    @OriginalMember(owner = "client!va", name = "q", descriptor = "Ljava/awt/Component;")
    private Component field2988;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIILjava/awt/Component;)V", line = 9)
    public final void method789(int arg0, int arg1, int arg2, Component arg3) {
        this.field2387 = arg2;
        if (arg0 != 23124) {
            this.field2988 = null;
        }
        this.field2382 = arg1;
        this.field2385 = new int[arg1 * arg2 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field2385, this.field2385.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2387, this.field2382), var5, null);
        this.field2389 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field2988 = arg3;
        this.method793(arg0 ^ 0xFFFFA5C5);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 35)
    public final void method790(int arg0, int arg1, Graphics arg2, int arg3) {
        int var5 = 29 % ((25 - arg3) / 61);
        arg2.drawImage(this.field2389, arg0, arg1, this.field2988);
    }
}
