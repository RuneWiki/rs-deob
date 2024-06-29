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

@OriginalClass("client!vb")
public class class90 extends class441 {

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1029;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "Ljava/awt/Image;")
    private Image field1026;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field1027;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "Ljava/awt/Shape;")
    private Shape field1028;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V", line = 9)
    public final void method475(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        this.field1028 = arg4.getClip();
        this.field1027.y = arg2;
        this.field1027.x = arg1;
        this.field1027.width = arg3;
        this.field1027.height = arg0;
        arg4.setClip(this.field1027);
        arg4.drawImage(this.field1026, 0, 0, this.field1029);
        if (arg5 == -14212) {
            arg4.setClip(this.field1028);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 29)
    public final void method479(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg2 != -23932) {
            this.method478((Canvas) null, 44);
        }
        arg1.drawImage(this.field1026, arg0, arg3, this.field1029);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/awt/Canvas;I)V", line = 40)
    public final void method478(Canvas arg0, int arg1) {
        this.field1029 = arg0;
        this.field1027 = new Rectangle();
        this.field6440 = this.field1029.getSize().width;
        this.field6438 = this.field1029.getSize().height;
        this.field6443 = new int[this.field6440 * this.field6438];
        if (arg1 != 2) {
            this.field1026 = (Image) null;
        }
        DataBufferInt var3 = new DataBufferInt(this.field6443, this.field6443.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field6440, this.field6438), var3, (Point) null);
        this.field1026 = new BufferedImage(var4, var5, false, new Hashtable());
    }
}
