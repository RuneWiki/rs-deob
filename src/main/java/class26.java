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

@OriginalClass("client!fk")
public class class26 extends class200 {

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "Ljava/awt/Canvas;")
    private Canvas field354;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "Ljava/awt/Image;")
    private Image field355;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field357;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "Ljava/awt/Shape;")
    private Shape field356;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 15)
    public final void method145(int arg0, int arg1, int arg2, Graphics arg3) {
        arg3.drawImage(this.field355, arg0, arg2, this.field354);
        if (arg1 != 27578) {
            this.field357 = (Rectangle) null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILjava/awt/Canvas;)V", line = 25)
    public final void method146(int arg0, Canvas arg1) {
        this.field354 = arg1;
        this.field357 = new Rectangle();
        this.field2773 = this.field354.getSize().width;
        this.field2780 = this.field354.getSize().height;
        this.field2775 = new int[this.field2780 * this.field2773];
        DataBufferInt var3 = new DataBufferInt(this.field2775, this.field2775.length);
        if (arg0 != 0) {
            this.method147(27, -122, 106, -6, (Graphics) null, 119);
        }
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field2773, this.field2780), var3, (Point) null);
        this.field355 = new BufferedImage(var4, var5, false, new Hashtable());
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V", line = 46)
    public final void method147(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        this.field356 = arg4.getClip();
        this.field357.x = arg3;
        this.field357.width = arg1;
        this.field357.height = arg2;
        this.field357.y = arg5;
        arg4.setClip(this.field357);
        arg4.drawImage(this.field355, 0, arg0, this.field354);
        arg4.setClip(this.field356);
    }
}
