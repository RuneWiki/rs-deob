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

@OriginalClass("client!cc")
public class class18 extends class66 {

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "Ljava/awt/Component;")
    private Component field389;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public final void method122(Graphics arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 0) {
            arg0.drawImage(this.field1622, arg1, arg2, this.field389);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method123(int arg0, int arg1, int arg2, Component arg3) {
        this.field1623 = new int[arg0 * arg1 + 1];
        this.field1641 = arg1;
        int var5 = -56 % ((-arg2 - 35) / 63);
        this.field1632 = arg0;
        DataBufferInt var6 = new DataBufferInt(this.field1623, this.field1623.length);
        DirectColorModel var7 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var8 = Raster.createWritableRaster(var7.createCompatibleSampleModel(this.field1641, this.field1632), var6, null);
        this.field1622 = new BufferedImage(var7, var8, false, new Hashtable());
        this.field389 = arg3;
        this.method599(-118);
    }
}
