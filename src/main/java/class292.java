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

@OriginalClass("client!wg")
public class class292 extends class472 {

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4185;

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "Ljava/awt/Image;")
    private Image field4182;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field4184;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "Ljava/awt/Shape;")
    private Shape field4183;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLjava/awt/Graphics;II)V")
    public final void method964(byte arg0, Graphics arg1, int arg2, int arg3) {
        arg1.drawImage(this.field4182, arg2, arg3, this.field4185);
        if (arg0 >= -92) {
            this.field4184 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/awt/Graphics;BIIII)V")
    public final void method963(Graphics arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4183 = arg0.getClip();
        this.field4184.y = arg5;
        this.field4184.width = arg4;
        if (arg1 < 40) {
            return;
        }
        this.field4184.x = arg3;
        this.field4184.height = arg2;
        arg0.setClip(this.field4184);
        arg0.drawImage(this.field4182, 0, 0, this.field4185);
        arg0.setClip(this.field4183);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/awt/Canvas;Z)V")
    public final void method960(Canvas arg0, boolean arg1) {
        this.field4185 = arg0;
        this.field4184 = new Rectangle();
        this.field6952 = this.field4185.getSize().width;
        this.field6953 = this.field4185.getSize().height;
        this.field6950 = new int[this.field6953 * this.field6952];
        DataBufferInt var3 = new DataBufferInt(this.field6950, this.field6950.length);
        if (!arg1) {
            this.field4185 = null;
        }
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field6952, this.field6953), var3, null);
        this.field4182 = new BufferedImage(var4, var5, false, new Hashtable());
    }
}
