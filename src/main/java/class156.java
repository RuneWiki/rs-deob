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

@OriginalClass("client!vda")
public class class156 extends class316 {

    @OriginalMember(owner = "client!vda", name = "y", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2321;

    @OriginalMember(owner = "client!vda", name = "v", descriptor = "Ljava/awt/Image;")
    private Image field2318;

    @OriginalMember(owner = "client!vda", name = "x", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field2320;

    @OriginalMember(owner = "client!vda", name = "w", descriptor = "Ljava/awt/Shape;")
    private Shape field2319;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public final void method1008(int arg0, Canvas arg1) {
        this.field2321 = arg1;
        this.field2320 = new Rectangle();
        this.field4243 = this.field2321.getSize().width;
        this.field4248 = this.field2321.getSize().height;
        this.field4242 = new int[this.field4248 * this.field4243];
        DataBufferInt var3 = new DataBufferInt(this.field4242, this.field4242.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field4243, this.field4248), var3, null);
        if (arg0 <= 76) {
            this.field2318 = null;
        }
        this.field2318 = new BufferedImage(var4, var5, false, new Hashtable());
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(Ljava/awt/Graphics;IIZII)V")
    public final void method1009(Graphics arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        this.field2319 = arg0.getClip();
        this.field2320.width = arg1;
        this.field2320.y = arg2;
        this.field2320.x = arg5;
        if (!arg3) {
            this.field2320.height = arg4;
            arg0.setClip(this.field2320);
            arg0.drawImage(this.field2318, 0, 0, this.field2321);
            arg0.setClip(this.field2319);
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
    public final void method1010(int arg0, int arg1, Graphics arg2, byte arg3) {
        int var5 = -118 / ((arg3 - 39) / 40);
        arg2.drawImage(this.field2318, arg1, arg0, this.field2321);
    }
}
