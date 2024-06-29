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

@OriginalClass("client!le")
public class class81 extends class44 {

    @OriginalMember(owner = "client!le", name = "u", descriptor = "Ljava/awt/Component;")
    private Component field2145;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method485(int arg0, int arg1, int arg2, Graphics arg3) {
        arg3.drawImage(this.field1247, arg1, arg0, this.field2145);
        if (arg2 != -6898) {
            this.method486(-67, (byte) -19, null, -35);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IBLjava/awt/Component;I)V")
    public final void method486(int arg0, byte arg1, Component arg2, int arg3) {
        this.field1250 = new int[arg0 * arg3 + 1];
        this.field1246 = arg0;
        this.field1245 = arg3;
        DataBufferInt var5 = new DataBufferInt(this.field1250, this.field1250.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1245, this.field1246), var5, null);
        this.field1247 = new BufferedImage(var6, var7, false, new Hashtable());
        int var8 = 101 / ((60 - arg1) / 61);
        this.field2145 = arg2;
        this.method488(-7913);
    }
}
