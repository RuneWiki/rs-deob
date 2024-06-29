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

@OriginalClass("client!as")
public class class134 extends class437 {

    @OriginalMember(owner = "client!as", name = "t", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1675;

    @OriginalMember(owner = "client!as", name = "v", descriptor = "Ljava/awt/Image;")
    private Image field1677;

    @OriginalMember(owner = "client!as", name = "u", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field1676;

    @OriginalMember(owner = "client!as", name = "s", descriptor = "Ljava/awt/Shape;")
    private Shape field1674;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ZIIIILjava/awt/Graphics;)V")
    public final void method821(boolean arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        this.field1674 = arg5.getClip();
        if (!arg0) {
            this.field1677 = null;
        }
        this.field1676.y = arg4;
        this.field1676.height = arg1;
        this.field1676.width = arg2;
        this.field1676.x = arg3;
        arg5.setClip(this.field1676);
        arg5.drawImage(this.field1677, 0, 0, this.field1675);
        arg5.setClip(this.field1674);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public final void method822(int arg0, Canvas arg1) {
        this.field1675 = arg1;
        this.field1676 = new Rectangle();
        this.field6506 = this.field1675.getSize().width;
        this.field6501 = this.field1675.getSize().height;
        this.field6504 = new int[this.field6506 * this.field6501];
        DataBufferInt var3 = new DataBufferInt(this.field6504, this.field6504.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg0 > -18) {
            this.method821(true, 55, -7, 18, 115, null);
        }
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field6506, this.field6501), var3, null);
        this.field1677 = new BufferedImage(var4, var5, false, new Hashtable());
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(IILjava/awt/Graphics;Z)V")
    public final void method823(int arg0, int arg1, Graphics arg2, boolean arg3) {
        arg2.drawImage(this.field1677, arg1, arg0, this.field1675);
        if (!arg3) {
            this.method822(80, null);
        }
    }
}
