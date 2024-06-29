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

@OriginalClass("client!tc")
public class class105 extends class428 {

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1368;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "Ljava/awt/Image;")
    private Image field1367;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field1366;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "Ljava/awt/Shape;")
    private Shape field1365;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V", line = 12)
    public final void method797(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        this.field1365 = arg4.getClip();
        this.field1366.height = arg3;
        this.field1366.y = arg2;
        this.field1366.width = arg0;
        this.field1366.x = arg1;
        arg4.setClip(this.field1366);
        arg4.drawImage(this.field1367, 0, 0, this.field1368);
        if (arg5 == 10) {
            arg4.setClip(this.field1365);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/awt/Graphics;BII)V", line = 29)
    public final void method798(Graphics arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -26) {
            this.field1365 = (Shape) null;
        }
        arg0.drawImage(this.field1367, arg2, arg3, this.field1368);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/awt/Canvas;I)V", line = 39)
    public final void method799(Canvas arg0, int arg1) {
        this.field1368 = arg0;
        this.field1366 = new Rectangle();
        this.field6219 = this.field1368.getSize().width;
        this.field6224 = this.field1368.getSize().height;
        if (arg1 != -5709) {
            this.method797(0, -99, 23, 93, (Graphics) null, -93);
        }
        this.field6225 = new int[this.field6224 * this.field6219];
        DataBufferInt var3 = new DataBufferInt(this.field6225, this.field6225.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field6219, this.field6224), var3, (Point) null);
        this.field1367 = new BufferedImage(var4, var5, false, new Hashtable());
    }
}
