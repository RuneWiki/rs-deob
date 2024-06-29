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

@OriginalClass("client!g")
public class class67 extends class342 {

    @OriginalMember(owner = "client!g", name = "p", descriptor = "Ljava/awt/Component;")
    private Component field1179;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/awt/Graphics;IIIIB)V", line = 10)
    public final void method571(Graphics arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg5 != -84) {
            this.method573((Component) null, 66, -58, -60);
        }
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg2, arg1, arg3, arg4);
        arg0.drawImage(this.field5456, 0, 0, this.field1179);
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V", line = 26)
    public final void method572(int arg0, int arg1, byte arg2, Graphics arg3) {
        if (arg2 > -120) {
            this.method571((Graphics) null, 26, -109, -91, 114, (byte) 18);
        }
        arg3.drawImage(this.field5456, arg0, arg1, this.field1179);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/awt/Component;III)V", line = 38)
    public final void method573(Component arg0, int arg1, int arg2, int arg3) {
        int var5 = -117 % ((62 - arg1) / 58);
        this.field5457 = arg2;
        this.field5447 = new int[arg2 * arg3 + 1];
        this.field5453 = arg3;
        DataBufferInt var6 = new DataBufferInt(this.field5447, this.field5447.length);
        DirectColorModel var7 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var8 = Raster.createWritableRaster(var7.createCompatibleSampleModel(this.field5453, this.field5457), var6, (Point) null);
        this.field5456 = new BufferedImage(var7, var8, false, new Hashtable());
        this.field1179 = arg0;
        this.method2415(-1);
    }
}
