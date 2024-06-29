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

@OriginalClass("client!sk")
public class class439 extends class195 {

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "Ljava/awt/Canvas;")
    private Canvas field6397;

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "Ljava/awt/Image;")
    private Image field6399;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field6398;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "Ljava/awt/Shape;")
    private Shape field6396;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
    public final void method31(Canvas arg0, byte arg1) {
        this.field6397 = arg0;
        this.field6398 = new Rectangle();
        this.field2786 = this.field6397.getSize().width;
        this.field2783 = this.field6397.getSize().height;
        this.field2782 = new int[this.field2786 * this.field2783];
        if (arg1 != 36) {
            this.field6397 = null;
        }
        DataBufferInt var3 = new DataBufferInt(this.field2782, this.field2782.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field2786, this.field2783), var3, null);
        this.field6399 = new BufferedImage(var4, var5, false, new Hashtable());
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method26(int arg0, Graphics arg1, int arg2, int arg3) {
        arg1.drawImage(this.field6399, arg2, arg3, this.field6397);
        if (arg0 != 28229) {
            this.field6396 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public final void method28(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6396 = arg0.getClip();
        this.field6398.x = arg3;
        this.field6398.width = arg4;
        this.field6398.y = arg2;
        this.field6398.height = arg1;
        arg0.setClip(this.field6398);
        arg0.drawImage(this.field6399, arg5, 0, this.field6397);
        arg0.setClip(this.field6396);
    }
}
