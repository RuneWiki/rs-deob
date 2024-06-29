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

@OriginalClass("client!ji")
public class class399 extends class44 {

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5657;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "Ljava/awt/Image;")
    private Image field5655;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field5654;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "Ljava/awt/Shape;")
    private Shape field5656;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IBILjava/awt/Graphics;)V")
    public final void method295(int arg0, byte arg1, int arg2, Graphics arg3) {
        int var5 = 102 / ((arg1 - 22) / 43);
        arg3.drawImage(this.field5655, arg2, arg0, this.field5657);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public final void method294(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        this.field5656 = arg5.getClip();
        this.field5654.width = arg3;
        this.field5654.x = arg0;
        this.field5654.y = arg4;
        this.field5654.height = arg2;
        arg5.setClip(this.field5654);
        arg5.drawImage(this.field5655, 0, 0, this.field5657);
        if (arg1 >= -58) {
            this.method291(-108, (Canvas) null);
        }
        arg5.setClip(this.field5656);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public final void method291(int arg0, Canvas arg1) {
        this.field5657 = arg1;
        this.field5654 = new Rectangle();
        this.field634 = this.field5657.getSize().width;
        this.field638 = this.field5657.getSize().height;
        this.field635 = new int[this.field638 * this.field634];
        DataBufferInt var3 = new DataBufferInt(this.field635, this.field635.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg0 > 72) {
            WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field634, this.field638), var3, (Point) null);
            this.field5655 = new BufferedImage(var4, var5, false, new Hashtable());
        }
    }
}
