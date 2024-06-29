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

@OriginalClass("client!jk")
public class class489 extends class165 {

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6904;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "Ljava/awt/Image;")
    private Image field6907;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field6905;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "Ljava/awt/Shape;")
    private Shape field6906;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILjava/awt/Graphics;IIBI)V")
    public final void method964(int arg0, Graphics arg1, int arg2, int arg3, byte arg4, int arg5) {
        this.field6906 = arg1.getClip();
        this.field6905.x = arg2;
        this.field6905.y = arg0;
        this.field6905.height = arg5;
        this.field6905.width = arg3;
        arg1.setClip(this.field6905);
        arg1.drawImage(this.field6907, 0, 0, this.field6904);
        arg1.setClip(this.field6906);
        if (arg4 <= 43) {
            this.field6906 = (Shape) null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method966(int arg0, int arg1, int arg2, Graphics arg3) {
        arg3.drawImage(this.field6907, arg1, arg0, this.field6904);
        if (arg2 != 5) {
            this.method966(122, -3, -112, (Graphics) null);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public final void method962(int arg0, Canvas arg1) {
        this.field6904 = arg1;
        this.field6905 = new Rectangle();
        this.field2401 = this.field6904.getSize().width;
        this.field2398 = this.field6904.getSize().height;
        this.field2400 = new int[this.field2401 * this.field2398];
        DataBufferInt var3 = new DataBufferInt(this.field2400, this.field2400.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg0 < -47) {
            WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field2401, this.field2398), var3, (Point) null);
            this.field6907 = new BufferedImage(var4, var5, false, new Hashtable());
        }
    }
}
