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

@OriginalClass("client!be")
public class class12 extends class85 {

    @OriginalMember(owner = "client!be", name = "p", descriptor = "Ljava/awt/Component;")
    private Component field240;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method68(int arg0, int arg1, int arg2, Component arg3) {
        this.field1895 = arg1;
        this.field1905 = arg2;
        if (arg0 != -13942) {
            this.method68(-116, 26, -125, null);
        }
        this.field1907 = new int[arg1 * arg2 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field1907, this.field1907.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1895, this.field1905), var5, null);
        this.field1903 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field240 = arg3;
        this.method606(-2);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/awt/Graphics;IZI)V")
    public final void method69(Graphics arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            arg0.drawImage(this.field1903, arg3, arg1, this.field240);
        }
    }
}
