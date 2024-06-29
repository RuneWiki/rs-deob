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

@OriginalClass("client!hw")
public class class120 extends class348 {

    @OriginalMember(owner = "client!hw", name = "u", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1475;

    @OriginalMember(owner = "client!hw", name = "r", descriptor = "Ljava/awt/Image;")
    private Image field1472;

    @OriginalMember(owner = "client!hw", name = "s", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field1473;

    @OriginalMember(owner = "client!hw", name = "t", descriptor = "Ljava/awt/Shape;")
    private Shape field1474;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
    public final void method795(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5) {
        this.field1474 = arg2.getClip();
        this.field1473.y = arg3;
        this.field1473.width = arg1;
        this.field1473.height = arg4;
        this.field1473.x = arg0;
        arg2.setClip(this.field1473);
        arg2.drawImage(this.field1472, 0, 0, this.field1475);
        arg2.setClip(this.field1474);
        int var7 = 80 % ((arg5 - 27) / 40);
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
    public final void method796(Canvas arg0, byte arg1) {
        this.field1475 = arg0;
        this.field1473 = new Rectangle();
        this.field4469 = this.field1475.getSize().width;
        this.field4473 = this.field1475.getSize().height;
        this.field4472 = new int[this.field4473 * this.field4469];
        DataBufferInt var3 = new DataBufferInt(this.field4472, this.field4472.length);
        if (arg1 != 46) {
            this.field1475 = null;
        }
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field4469, this.field4473), var3, null);
        this.field1472 = new BufferedImage(var4, var5, false, new Hashtable());
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(ILjava/awt/Graphics;BI)V")
    public final void method797(int arg0, Graphics arg1, byte arg2, int arg3) {
        arg1.drawImage(this.field1472, arg3, arg0, this.field1475);
        if (arg2 != -119) {
            this.method797(33, null, (byte) 5, -61);
        }
    }
}
