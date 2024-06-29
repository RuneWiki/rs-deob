import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class443 extends class6 {

    @OriginalMember(owner = "client!hv", name = "v", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5903;

    @OriginalMember(owner = "client!hv", name = "u", descriptor = "Ljava/awt/Image;")
    private Image field5902;

    @OriginalMember(owner = "client!hv", name = "s", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field5900;

    @OriginalMember(owner = "client!hv", name = "t", descriptor = "Ljava/awt/Shape;")
    private Shape field5901;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIILjava/awt/Graphics;IB)V", line = 9)
    public final void method16(int arg0, int arg1, int arg2, Graphics arg3, int arg4, byte arg5) {
        this.field5901 = arg3.getClip();
        this.field5900.height = arg2;
        this.field5900.width = arg4;
        this.field5900.x = arg0;
        this.field5900.y = arg1;
        if (arg5 != -46) {
            this.method19(null, 49);
        }
        arg3.setClip(this.field5900);
        arg3.drawImage(this.field5902, 0, 0, this.field5903);
        arg3.setClip(this.field5901);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(IBILjava/awt/Graphics;)V", line = 28)
    public final void method17(int arg0, byte arg1, int arg2, Graphics arg3) {
        int var5 = 53 / ((arg1 - 49) / 42);
        arg3.drawImage(this.field5902, arg2, arg0, this.field5903);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Ljava/awt/Canvas;I)V", line = 39)
    public final void method19(Canvas arg0, int arg1) {
        this.field5903 = arg0;
        this.field5900 = new Rectangle();
        this.field48 = this.field5903.getSize().width;
        this.field50 = this.field5903.getSize().height;
        this.field54 = new int[this.field50 * this.field48];
        DataBufferInt var3 = new DataBufferInt(this.field54, this.field54.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg1 == 7) {
            WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field48, this.field50), var3, null);
            this.field5902 = new BufferedImage(var4, var5, false, new Hashtable());
        }
    }
}
