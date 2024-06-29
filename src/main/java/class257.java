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

@OriginalClass("client!dea")
public class class257 extends class782 {

    @OriginalMember(owner = "client!dea", name = "x", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3899;

    @OriginalMember(owner = "client!dea", name = "w", descriptor = "Ljava/awt/Image;")
    private Image field3900;

    @OriginalMember(owner = "client!dea", name = "y", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field3902;

    @OriginalMember(owner = "client!dea", name = "v", descriptor = "Ljava/awt/Shape;")
    private Shape field3901;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(ILjava/awt/Graphics;IBIIII)V")
    public final void method2166(int arg0, Graphics arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field3901 = arg1.getClip();
        this.field3902.height = arg5;
        this.field3902.width = arg7;
        this.field3902.y = arg4;
        this.field3902.x = arg0;
        arg1.setClip(this.field3902);
        arg1.drawImage(this.field3900, arg0 - arg6, -arg2 + arg4, this.field3899);
        if (arg3 <= 59) {
            this.field3900 = null;
        }
        arg1.setClip(this.field3901);
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(ILjava/awt/Canvas;II)V")
    public final void method2167(int arg0, Canvas arg1, int arg2, int arg3) {
        this.field3899 = arg1;
        this.field3902 = new Rectangle();
        this.field11418 = arg0;
        this.field11415 = arg3;
        this.field11412 = new int[this.field11418 * this.field11415];
        DataBufferInt var5 = new DataBufferInt(this.field11412, this.field11412.length);
        if (arg2 != 0) {
            this.field3899 = null;
        }
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field11415, this.field11418), var5, null);
        this.field3900 = new BufferedImage(var6, var7, false, new Hashtable());
    }
}
