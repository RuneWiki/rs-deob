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

@OriginalClass("client!wp")
public class class449 extends class348 {

    @OriginalMember(owner = "client!wp", name = "s", descriptor = "Ljava/awt/Canvas;")
    private Canvas field5939;

    @OriginalMember(owner = "client!wp", name = "r", descriptor = "Ljava/awt/Image;")
    private Image field5938;

    @OriginalMember(owner = "client!wp", name = "q", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field5937;

    @OriginalMember(owner = "client!wp", name = "t", descriptor = "Ljava/awt/Shape;")
    private Shape field5940;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(BLjava/awt/Canvas;)V")
    public final void method554(byte arg0, Canvas arg1) {
        this.field5939 = arg1;
        this.field5937 = new Rectangle();
        this.field4635 = this.field5939.getSize().width;
        this.field4640 = this.field5939.getSize().height;
        this.field4639 = new int[this.field4640 * this.field4635];
        DataBufferInt var3 = new DataBufferInt(this.field4639, this.field4639.length);
        if (arg0 <= -42) {
            DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
            WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field4635, this.field4640), var3, null);
            this.field5938 = new BufferedImage(var4, var5, false, new Hashtable());
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public final void method553(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5940 = arg1.getClip();
        this.field5937.width = arg5;
        this.field5937.y = arg4;
        this.field5937.x = arg0;
        this.field5937.height = arg3;
        if (arg2 != 9) {
            this.method554((byte) 42, null);
        }
        arg1.setClip(this.field5937);
        arg1.drawImage(this.field5938, 0, 0, this.field5939);
        arg1.setClip(this.field5940);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method552(int arg0, int arg1, Graphics arg2, int arg3) {
        arg2.drawImage(this.field5938, arg0, arg3, this.field5939);
        if (arg1 != -23197) {
            this.method553(74, null, 43, -21, 59, 6);
        }
    }
}
