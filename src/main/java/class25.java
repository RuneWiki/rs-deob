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

@OriginalClass("client!as")
public class class25 extends class179 {

    @OriginalMember(owner = "client!as", name = "x", descriptor = "Ljava/awt/Canvas;")
    private Canvas field439;

    @OriginalMember(owner = "client!as", name = "v", descriptor = "Ljava/awt/Image;")
    private Image field437;

    @OriginalMember(owner = "client!as", name = "y", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field440;

    @OriginalMember(owner = "client!as", name = "w", descriptor = "Ljava/awt/Shape;")
    private Shape field438;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method153(int arg0, int arg1, Graphics arg2, int arg3) {
        if (arg0 != 29235) {
            this.field437 = null;
        }
        arg2.drawImage(this.field437, arg3, arg1, this.field439);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public final void method154(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        this.field438 = arg3.getClip();
        this.field440.x = arg1;
        this.field440.y = arg2;
        this.field440.width = arg4;
        this.field440.height = arg0;
        arg3.setClip(this.field440);
        arg3.drawImage(this.field437, 0, 0, this.field439);
        if (arg5 == 2) {
            arg3.setClip(this.field438);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ZLjava/awt/Canvas;)V")
    public final void method155(boolean arg0, Canvas arg1) {
        this.field439 = arg1;
        this.field440 = new Rectangle();
        this.field2302 = this.field439.getSize().width;
        this.field2303 = this.field439.getSize().height;
        this.field2308 = new int[this.field2303 * this.field2302];
        DataBufferInt var3 = new DataBufferInt(this.field2308, this.field2308.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field2302, this.field2303), var3, null);
        this.field437 = new BufferedImage(var4, var5, arg0, new Hashtable());
    }
}
