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

@OriginalClass("client!bfa")
public class class337 extends class333 {

    @OriginalMember(owner = "client!bfa", name = "u", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4525;

    @OriginalMember(owner = "client!bfa", name = "t", descriptor = "Ljava/awt/Image;")
    private Image field4524;

    @OriginalMember(owner = "client!bfa", name = "v", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field4526;

    @OriginalMember(owner = "client!bfa", name = "w", descriptor = "Ljava/awt/Shape;")
    private Shape field4527;

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Ljava/awt/Graphics;ZII)V", line = 9)
    public final void method862(Graphics arg0, boolean arg1, int arg2, int arg3) {
        arg0.drawImage(this.field4524, arg2, arg3, this.field4525);
        if (!arg1) {
            this.method860(-55, 103, null, -114, 108, -55);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ILjava/awt/Canvas;)V", line = 20)
    public final void method864(int arg0, Canvas arg1) {
        this.field4525 = arg1;
        this.field4526 = new Rectangle();
        this.field4487 = this.field4525.getSize().width;
        this.field4493 = this.field4525.getSize().height;
        if (arg0 != 0) {
            this.field4525 = null;
        }
        this.field4492 = new int[this.field4493 * this.field4487];
        DataBufferInt var3 = new DataBufferInt(this.field4492, this.field4492.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field4487, this.field4493), var3, null);
        this.field4524 = new BufferedImage(var4, var5, false, new Hashtable());
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IILjava/awt/Graphics;III)V", line = 42)
    public final void method860(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5) {
        this.field4527 = arg2.getClip();
        this.field4526.y = arg0;
        this.field4526.x = arg4;
        this.field4526.height = arg5;
        this.field4526.width = arg1;
        arg2.setClip(this.field4526);
        if (arg3 != 16) {
            this.method862(null, false, 86, -54);
        }
        arg2.drawImage(this.field4524, 0, 0, this.field4525);
        arg2.setClip(this.field4527);
    }
}
