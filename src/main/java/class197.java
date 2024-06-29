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

@OriginalClass("client!vt")
public class class197 extends class312 {

    @OriginalMember(owner = "client!vt", name = "u", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2753;

    @OriginalMember(owner = "client!vt", name = "w", descriptor = "Ljava/awt/Image;")
    private Image field2755;

    @OriginalMember(owner = "client!vt", name = "x", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field2756;

    @OriginalMember(owner = "client!vt", name = "v", descriptor = "Ljava/awt/Shape;")
    private Shape field2754;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 10)
    public final void method415(int arg0, int arg1, int arg2, Graphics arg3) {
        arg3.drawImage(this.field2755, arg1, arg2, this.field2753);
        if (arg0 != 16705) {
            this.method413(null, -123, 24, -38, 10, -84);
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V", line = 22)
    public final void method413(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2754 = arg0.getClip();
        this.field2756.x = arg2;
        this.field2756.height = arg3;
        this.field2756.width = arg4;
        this.field2756.y = arg1;
        arg0.setClip(this.field2756);
        if (arg5 < -112) {
            arg0.drawImage(this.field2755, 0, 0, this.field2753);
            arg0.setClip(this.field2754);
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(ILjava/awt/Canvas;)V", line = 39)
    public final void method411(int arg0, Canvas arg1) {
        this.field2753 = arg1;
        int var3 = 41 / ((-arg0 - 44) / 36);
        this.field2756 = new Rectangle();
        this.field4107 = this.field2753.getSize().width;
        this.field4104 = this.field2753.getSize().height;
        this.field4108 = new int[this.field4107 * this.field4104];
        DataBufferInt var4 = new DataBufferInt(this.field4108, this.field4108.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field4107, this.field4104), var4, null);
        this.field2755 = new BufferedImage(var5, var6, false, new Hashtable());
    }
}
