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

@OriginalClass("client!nq")
public class class128 extends class136 {

    @OriginalMember(owner = "client!nq", name = "t", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1688;

    @OriginalMember(owner = "client!nq", name = "s", descriptor = "Ljava/awt/Image;")
    private Image field1687;

    @OriginalMember(owner = "client!nq", name = "r", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field1686;

    @OriginalMember(owner = "client!nq", name = "u", descriptor = "Ljava/awt/Shape;")
    private Shape field1689;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public final void method858(Canvas arg0, int arg1) {
        this.field1688 = arg0;
        this.field1686 = new Rectangle();
        this.field1863 = this.field1688.getSize().width;
        this.field1856 = this.field1688.getSize().height;
        this.field1857 = new int[this.field1863 * this.field1856];
        DataBufferInt var3 = new DataBufferInt(this.field1857, this.field1857.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field1863, this.field1856), var3, (Point) null);
        if (arg1 == 16628) {
            this.field1687 = new BufferedImage(var4, var5, false, new Hashtable());
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIBILjava/awt/Graphics;I)V")
    public final void method859(int arg0, int arg1, byte arg2, int arg3, Graphics arg4, int arg5) {
        this.field1689 = arg4.getClip();
        this.field1686.x = arg3;
        this.field1686.y = arg0;
        this.field1686.width = arg1;
        this.field1686.height = arg5;
        if (arg2 <= 126) {
            this.field1689 = (Shape) null;
        }
        arg4.setClip(this.field1686);
        arg4.drawImage(this.field1687, 0, 0, this.field1688);
        arg4.setClip(this.field1689);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILjava/awt/Graphics;IB)V")
    public final void method860(int arg0, Graphics arg1, int arg2, byte arg3) {
        arg1.drawImage(this.field1687, arg2, arg0, this.field1688);
        if (arg3 >= -74) {
            this.field1689 = (Shape) null;
        }
    }
}
