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

@OriginalClass("client!wn")
public class class219 extends class47 {

    @OriginalMember(owner = "client!wn", name = "n", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3236;

    @OriginalMember(owner = "client!wn", name = "o", descriptor = "Ljava/awt/Image;")
    private Image field3237;

    @OriginalMember(owner = "client!wn", name = "p", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field3238;

    @OriginalMember(owner = "client!wn", name = "q", descriptor = "Ljava/awt/Shape;")
    private Shape field3239;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public final void method243(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        this.field3239 = arg5.getClip();
        this.field3238.x = arg3;
        this.field3238.y = arg1;
        this.field3238.height = arg0;
        this.field3238.width = arg2;
        arg5.setClip(this.field3238);
        if (arg4 == 1) {
            arg5.drawImage(this.field3237, 0, 0, this.field3236);
            arg5.setClip(this.field3239);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method242(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg0 != -14552) {
            this.field3236 = null;
        }
        arg1.drawImage(this.field3237, arg3, arg2, this.field3236);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public final void method240(int arg0, Canvas arg1) {
        this.field3236 = arg1;
        this.field3238 = new Rectangle();
        if (arg0 != 13948) {
            this.method242(27, null, -20, 61);
        }
        this.field554 = this.field3236.getSize().width;
        this.field555 = this.field3236.getSize().height;
        this.field556 = new int[this.field555 * this.field554];
        DataBufferInt var3 = new DataBufferInt(this.field556, this.field556.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field554, this.field555), var3, null);
        this.field3237 = new BufferedImage(var4, var5, false, new Hashtable());
    }
}
