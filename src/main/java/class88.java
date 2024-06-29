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

@OriginalClass("client!hq")
public class class88 extends class57 {

    @OriginalMember(owner = "client!hq", name = "l", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1345;

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "Ljava/awt/Image;")
    private Image field1344;

    @OriginalMember(owner = "client!hq", name = "m", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field1346;

    @OriginalMember(owner = "client!hq", name = "n", descriptor = "Ljava/awt/Shape;")
    private Shape field1347;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
    public final void method382(Canvas arg0, byte arg1) {
        this.field1345 = arg0;
        this.field1346 = new Rectangle();
        this.field816 = this.field1345.getSize().width;
        this.field820 = this.field1345.getSize().height;
        this.field819 = new int[this.field820 * this.field816];
        DataBufferInt var3 = new DataBufferInt(this.field819, this.field819.length);
        if (arg1 != -75) {
            this.field1346 = (Rectangle) null;
        }
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field816, this.field820), var3, (Point) null);
        this.field1344 = new BufferedImage(var4, var5, false, new Hashtable());
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public final void method380(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        int var7 = -25 % ((arg1 + 32) / 51);
        this.field1347 = arg4.getClip();
        this.field1346.x = arg2;
        this.field1346.y = arg5;
        this.field1346.width = arg3;
        this.field1346.height = arg0;
        arg4.setClip(this.field1346);
        arg4.drawImage(this.field1344, 0, 0, this.field1345);
        arg4.setClip(this.field1347);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
    public final void method375(int arg0, byte arg1, Graphics arg2, int arg3) {
        arg2.drawImage(this.field1344, arg0, arg3, this.field1345);
        int var5 = 45 % ((-arg1 - 53) / 49);
    }
}
