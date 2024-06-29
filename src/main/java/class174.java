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

@OriginalClass("client!en")
public class class174 extends class35 {

    @OriginalMember(owner = "client!en", name = "j", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2387;

    @OriginalMember(owner = "client!en", name = "m", descriptor = "Ljava/awt/Image;")
    private Image field2390;

    @OriginalMember(owner = "client!en", name = "k", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field2388;

    @OriginalMember(owner = "client!en", name = "l", descriptor = "Ljava/awt/Shape;")
    private Shape field2389;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIILjava/awt/Graphics;IB)V", line = 10)
    public final void method342(int arg0, int arg1, int arg2, Graphics arg3, int arg4, byte arg5) {
        this.field2389 = arg3.getClip();
        if (arg5 != 0) {
            return;
        }
        this.field2388.width = arg2;
        this.field2388.height = arg0;
        this.field2388.y = arg4;
        this.field2388.x = arg1;
        arg3.setClip(this.field2388);
        arg3.drawImage(this.field2390, 0, 0, this.field2387);
        arg3.setClip(this.field2389);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 29)
    public final void method339(int arg0, int arg1, Graphics arg2, int arg3) {
        if (arg0 != 13) {
            this.method341(-7, (Canvas) null);
        }
        arg2.drawImage(this.field2390, arg1, arg3, this.field2387);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILjava/awt/Canvas;)V", line = 39)
    public final void method341(int arg0, Canvas arg1) {
        this.field2387 = arg1;
        this.field2388 = new Rectangle();
        this.field541 = this.field2387.getSize().width;
        this.field537 = this.field2387.getSize().height;
        this.field540 = new int[this.field541 * this.field537];
        if (arg0 < -49) {
            DataBufferInt var3 = new DataBufferInt(this.field540, this.field540.length);
            DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
            WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field541, this.field537), var3, (Point) null);
            this.field2390 = new BufferedImage(var4, var5, false, new Hashtable());
        }
    }
}
