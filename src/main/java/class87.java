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

@OriginalClass("client!ni")
public class class87 extends class424 {

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1476;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "Ljava/awt/Image;")
    private Image field1479;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field1478;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "Ljava/awt/Shape;")
    private Shape field1477;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V", line = 10)
    public final void method617(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        this.field1477 = arg3.getClip();
        this.field1478.y = arg4;
        this.field1478.width = arg1;
        this.field1478.x = arg5;
        if (arg2 != 1) {
            this.field1478 = null;
        }
        this.field1478.height = arg0;
        arg3.setClip(this.field1478);
        arg3.drawImage(this.field1479, 0, 0, this.field1476);
        arg3.setClip(this.field1477);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIZLjava/awt/Graphics;)V", line = 27)
    public final void method618(int arg0, int arg1, boolean arg2, Graphics arg3) {
        arg3.drawImage(this.field1479, arg1, arg0, this.field1476);
        if (arg2) {
            this.field1479 = null;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILjava/awt/Canvas;)V", line = 39)
    public final void method619(int arg0, Canvas arg1) {
        this.field1476 = arg1;
        this.field1478 = new Rectangle();
        if (arg0 != 1400) {
            this.method618(112, 88, false, null);
        }
        this.field6391 = this.field1476.getSize().width;
        this.field6388 = this.field1476.getSize().height;
        this.field6394 = new int[this.field6391 * this.field6388];
        DataBufferInt var3 = new DataBufferInt(this.field6394, this.field6394.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field6391, this.field6388), var3, null);
        this.field1479 = new BufferedImage(var4, var5, false, new Hashtable());
    }
}
