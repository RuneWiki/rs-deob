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

@OriginalClass("client!ep")
public class class292 extends class346 {

    @OriginalMember(owner = "client!ep", name = "v", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4445;

    @OriginalMember(owner = "client!ep", name = "w", descriptor = "Ljava/awt/Image;")
    private Image field4446;

    @OriginalMember(owner = "client!ep", name = "u", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field4444;

    @OriginalMember(owner = "client!ep", name = "x", descriptor = "Ljava/awt/Shape;")
    private Shape field4447;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
    public final void method1903(Canvas arg0, boolean arg1) {
        this.field4445 = arg0;
        this.field4444 = new Rectangle();
        this.field5118 = this.field4445.getSize().width;
        this.field5117 = this.field4445.getSize().height;
        this.field5114 = new int[this.field5118 * this.field5117];
        DataBufferInt var3 = new DataBufferInt(this.field5114, this.field5114.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field5118, this.field5117), var3, null);
        this.field4446 = new BufferedImage(var4, var5, arg1, new Hashtable());
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
    public final void method1904(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5) {
        this.field4447 = arg2.getClip();
        this.field4444.y = arg3;
        if (arg4 != 54) {
            this.method1903(null, true);
        }
        this.field4444.x = arg1;
        this.field4444.width = arg5;
        this.field4444.height = arg0;
        arg2.setClip(this.field4444);
        arg2.drawImage(this.field4446, 0, 0, this.field4445);
        arg2.setClip(this.field4447);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method1905(int arg0, Graphics arg1, int arg2, int arg3) {
        int var5 = 97 % ((arg3 - 51) / 61);
        arg1.drawImage(this.field4446, arg2, arg0, this.field4445);
    }
}
