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

@OriginalClass("client!jf")
public class class148 extends class20 {

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2275;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "Ljava/awt/Image;")
    private Image field2272;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field2273;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "Ljava/awt/Shape;")
    private Shape field2274;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIBILjava/awt/Graphics;)V", line = 10)
    public final void method110(int arg0, int arg1, int arg2, byte arg3, int arg4, Graphics arg5) {
        this.field2274 = arg5.getClip();
        this.field2273.x = arg1;
        this.field2273.width = arg4;
        this.field2273.y = arg2;
        this.field2273.height = arg0;
        arg5.setClip(this.field2273);
        arg5.drawImage(this.field2272, 0, 0, this.field2275);
        int var7 = -108 / ((-arg3 - 2) / 63);
        arg5.setClip(this.field2274);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BIILjava/awt/Graphics;)V", line = 26)
    public final void method113(byte arg0, int arg1, int arg2, Graphics arg3) {
        arg3.drawImage(this.field2272, arg2, arg1, this.field2275);
        int var5 = 5 / ((arg0 - 70) / 32);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLjava/awt/Canvas;)V", line = 37)
    public final void method111(byte arg0, Canvas arg1) {
        this.field2275 = arg1;
        this.field2273 = new Rectangle();
        this.field219 = this.field2275.getSize().width;
        this.field214 = this.field2275.getSize().height;
        this.field216 = new int[this.field219 * this.field214];
        if (arg0 <= 119) {
            this.field2272 = null;
        }
        DataBufferInt var3 = new DataBufferInt(this.field216, this.field216.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field219, this.field214), var3, null);
        this.field2272 = new BufferedImage(var4, var5, false, new Hashtable());
    }
}
