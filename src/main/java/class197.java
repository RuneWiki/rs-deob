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

@OriginalClass("client!se")
public class class197 extends class453 {

    @OriginalMember(owner = "client!se", name = "s", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2816;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "Ljava/awt/Image;")
    private Image field2815;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field2814;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "Ljava/awt/Shape;")
    private Shape field2813;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BLjava/awt/Canvas;)V", line = 11)
    public final void method1289(byte arg0, Canvas arg1) {
        this.field2816 = arg1;
        this.field2814 = new Rectangle();
        this.field6565 = this.field2816.getSize().width;
        this.field6566 = this.field2816.getSize().height;
        this.field6564 = new int[this.field6566 * this.field6565];
        if (arg0 != -72) {
            this.field2815 = null;
        }
        DataBufferInt var3 = new DataBufferInt(this.field6564, this.field6564.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field6565, this.field6566), var3, null);
        this.field2815 = new BufferedImage(var4, var5, false, new Hashtable());
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V", line = 33)
    public final void method1290(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        if (arg3 != -9600) {
            this.field2813 = null;
        }
        this.field2813 = arg4.getClip();
        this.field2814.height = arg5;
        this.field2814.x = arg2;
        this.field2814.y = arg0;
        this.field2814.width = arg1;
        arg4.setClip(this.field2814);
        arg4.drawImage(this.field2815, 0, 0, this.field2816);
        arg4.setClip(this.field2813);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 51)
    public final void method1291(int arg0, Graphics arg1, int arg2, int arg3) {
        arg1.drawImage(this.field2815, arg3, arg0, this.field2816);
        if (arg2 != 26356) {
            this.method1289((byte) 51, null);
        }
    }
}
