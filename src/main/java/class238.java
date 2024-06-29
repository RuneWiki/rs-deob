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

@OriginalClass("client!ab")
public class class238 extends class367 {

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3383;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "Ljava/awt/Image;")
    private Image field3382;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field3381;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "Ljava/awt/Shape;")
    private Shape field3384;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 9)
    public final void method414(int arg0, int arg1, Graphics arg2, int arg3) {
        if (arg3 != 100) {
            this.method413(42, -76, -29, -53, (Graphics) null, (byte) -100);
        }
        arg2.drawImage(this.field3382, arg1, arg0, this.field3383);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BLjava/awt/Canvas;)V", line = 19)
    public final void method416(byte arg0, Canvas arg1) {
        this.field3383 = arg1;
        this.field3381 = new Rectangle();
        this.field5092 = this.field3383.getSize().width;
        this.field5088 = this.field3383.getSize().height;
        this.field5087 = new int[this.field5092 * this.field5088];
        if (arg0 != -12) {
            this.method413(-46, -86, 97, 88, (Graphics) null, (byte) 74);
        }
        DataBufferInt var3 = new DataBufferInt(this.field5087, this.field5087.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field5092, this.field5088), var3, (Point) null);
        this.field3382 = new BufferedImage(var4, var5, false, new Hashtable());
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIILjava/awt/Graphics;B)V", line = 40)
    public final void method413(int arg0, int arg1, int arg2, int arg3, Graphics arg4, byte arg5) {
        this.field3384 = arg4.getClip();
        this.field3381.y = arg1;
        if (arg5 <= 20) {
            return;
        }
        this.field3381.x = arg3;
        this.field3381.height = arg2;
        this.field3381.width = arg0;
        arg4.setClip(this.field3381);
        arg4.drawImage(this.field3382, 0, 0, this.field3383);
        arg4.setClip(this.field3384);
    }
}
