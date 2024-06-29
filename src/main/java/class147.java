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

@OriginalClass("client!pj")
public class class147 extends class255 {

    @OriginalMember(owner = "client!pj", name = "B", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1950;

    @OriginalMember(owner = "client!pj", name = "A", descriptor = "Ljava/awt/Image;")
    private Image field1949;

    @OriginalMember(owner = "client!pj", name = "E", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field1952;

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "Ljava/awt/Shape;")
    private Shape field1951;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILjava/awt/Canvas;I)V")
    public final void method1018(int arg0, int arg1, Canvas arg2, int arg3) {
        this.field1950 = arg2;
        this.field1952 = new Rectangle();
        this.field3658 = arg1;
        this.field3660 = arg0;
        this.field3661 = new int[this.field3660 * this.field3658];
        DataBufferInt var5 = new DataBufferInt(this.field3661, this.field3661.length);
        if (arg3 == 2) {
            DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
            WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field3658, this.field3660), var5, null);
            this.field1949 = new BufferedImage(var6, var7, false, new Hashtable());
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIILjava/awt/Graphics;III)V")
    public final void method1019(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5, int arg6, int arg7) {
        this.field1951 = arg4.getClip();
        this.field1952.x = arg5;
        this.field1952.height = arg1;
        this.field1952.width = arg0;
        this.field1952.y = arg2;
        arg4.setClip(this.field1952);
        arg4.drawImage(this.field1949, arg5 - arg6, -arg3 + arg2, this.field1950);
        arg4.setClip(this.field1951);
        if (arg7 <= 104) {
            this.field1952 = null;
        }
    }
}
