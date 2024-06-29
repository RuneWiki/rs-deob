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

@OriginalClass("client!rg")
public class class420 extends class176 {

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5701;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "Ljava/awt/Image;")
    private Image field5703;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field5702;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "Ljava/awt/Shape;")
    private Shape field5704;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/awt/Canvas;B)V", line = 10)
    public final void method1009(Canvas arg0, byte arg1) {
        this.field5701 = arg0;
        this.field5702 = new Rectangle();
        int var3 = -48 % ((arg1 - 44) / 42);
        this.field2393 = this.field5701.getSize().width;
        this.field2401 = this.field5701.getSize().height;
        this.field2397 = new int[this.field2401 * this.field2393];
        DataBufferInt var4 = new DataBufferInt(this.field2397, this.field2397.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field2393, this.field2401), var4, (Point) null);
        this.field5703 = new BufferedImage(var5, var6, false, new Hashtable());
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/awt/Graphics;III)V", line = 33)
    public final void method1011(Graphics arg0, int arg1, int arg2, int arg3) {
        arg0.drawImage(this.field5703, arg3, arg1, this.field5701);
        if (arg2 != 0) {
            this.field5704 = (Shape) null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V", line = 45)
    public final void method1010(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        this.field5704 = arg4.getClip();
        this.field5702.width = arg5;
        this.field5702.x = arg1;
        if (arg3 != 7) {
            this.field5703 = (Image) null;
        }
        this.field5702.y = arg2;
        this.field5702.height = arg0;
        arg4.setClip(this.field5702);
        arg4.drawImage(this.field5703, 0, 0, this.field5701);
        arg4.setClip(this.field5704);
    }
}
