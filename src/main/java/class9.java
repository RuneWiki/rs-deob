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

@OriginalClass("client!oo")
public class class9 extends class213 {

    @OriginalMember(owner = "client!oo", name = "u", descriptor = "Ljava/awt/Canvas;")
    private Canvas field125;

    @OriginalMember(owner = "client!oo", name = "v", descriptor = "Ljava/awt/Image;")
    private Image field126;

    @OriginalMember(owner = "client!oo", name = "x", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field128;

    @OriginalMember(owner = "client!oo", name = "w", descriptor = "Ljava/awt/Shape;")
    private Shape field127;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(BILjava/awt/Graphics;I)V", line = 11)
    public final void method77(byte arg0, int arg1, Graphics arg2, int arg3) {
        if (arg0 > -76) {
            this.method77((byte) -8, -74, null, -7);
        }
        arg2.drawImage(this.field126, arg3, arg1, this.field125);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Ljava/awt/Graphics;IIIIB)V", line = 21)
    public final void method78(Graphics arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        this.field127 = arg0.getClip();
        this.field128.width = arg4;
        this.field128.y = arg1;
        this.field128.x = arg3;
        if (arg5 != -92) {
            this.field126 = null;
        }
        this.field128.height = arg2;
        arg0.setClip(this.field128);
        arg0.drawImage(this.field126, 0, 0, this.field125);
        arg0.setClip(this.field127);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZLjava/awt/Canvas;)V", line = 39)
    public final void method79(boolean arg0, Canvas arg1) {
        this.field125 = arg1;
        this.field128 = new Rectangle();
        this.field2978 = this.field125.getSize().width;
        this.field2977 = this.field125.getSize().height;
        this.field2982 = new int[this.field2978 * this.field2977];
        DataBufferInt var3 = new DataBufferInt(this.field2982, this.field2982.length);
        if (!arg0) {
            this.method77((byte) 19, 39, null, -76);
        }
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field2978, this.field2977), var3, null);
        this.field126 = new BufferedImage(var4, var5, false, new Hashtable());
    }
}
