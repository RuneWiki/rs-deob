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

@OriginalClass("client!gq")
public class class315 extends class411 {

    @OriginalMember(owner = "client!gq", name = "p", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4266;

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "Ljava/awt/Image;")
    private Image field4264;

    @OriginalMember(owner = "client!gq", name = "o", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field4265;

    @OriginalMember(owner = "client!gq", name = "q", descriptor = "Ljava/awt/Shape;")
    private Shape field4267;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ZLjava/awt/Canvas;)V", line = 11)
    public final void method1619(boolean arg0, Canvas arg1) {
        this.field4266 = arg1;
        this.field4265 = new Rectangle();
        this.field5694 = this.field4266.getSize().width;
        this.field5702 = this.field4266.getSize().height;
        this.field5701 = new int[this.field5702 * this.field5694];
        DataBufferInt var3 = new DataBufferInt(this.field5701, this.field5701.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field5694, this.field5702), var3, (Point) null);
        this.field4264 = new BufferedImage(var4, var5, arg0, new Hashtable());
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IILjava/awt/Graphics;III)V", line = 30)
    public final void method1615(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 512) {
            this.field4264 = (Image) null;
        }
        this.field4267 = arg2.getClip();
        this.field4265.height = arg4;
        this.field4265.y = arg3;
        this.field4265.width = arg1;
        this.field4265.x = arg5;
        arg2.setClip(this.field4265);
        arg2.drawImage(this.field4264, 0, 0, this.field4266);
        arg2.setClip(this.field4267);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 50)
    public final void method1611(int arg0, Graphics arg1, int arg2, int arg3) {
        arg1.drawImage(this.field4264, arg3, arg0, this.field4266);
        if (arg2 != 100) {
            this.method1611(-103, (Graphics) null, -125, 54);
        }
    }
}
