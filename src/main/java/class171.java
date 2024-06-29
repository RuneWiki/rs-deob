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

@OriginalClass("client!cda")
public class class171 extends class115 {

    @OriginalMember(owner = "client!cda", name = "s", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1984;

    @OriginalMember(owner = "client!cda", name = "q", descriptor = "Ljava/awt/Image;")
    private Image field1982;

    @OriginalMember(owner = "client!cda", name = "t", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field1985;

    @OriginalMember(owner = "client!cda", name = "r", descriptor = "Ljava/awt/Shape;")
    private Shape field1983;

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Ljava/awt/Canvas;IZI)V")
    public final void method760(Canvas arg0, int arg1, boolean arg2, int arg3) {
        this.field1984 = arg0;
        this.field1985 = new Rectangle();
        this.field1201 = arg1;
        this.field1200 = arg3;
        this.field1205 = new int[this.field1201 * this.field1200];
        DataBufferInt var5 = new DataBufferInt(this.field1205, this.field1205.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1201, this.field1200), var5, null);
        this.field1982 = new BufferedImage(var6, var7, false, new Hashtable());
        if (!arg2) {
            this.field1982 = null;
        }
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(Ljava/awt/Graphics;IIIIIII)V")
    public final void method763(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1983 = arg0.getClip();
        this.field1985.x = arg4;
        this.field1985.y = arg6;
        this.field1985.width = arg2;
        if (arg3 != 10000) {
            this.method763(null, 68, -95, 40, -33, -12, 126, -47);
        }
        this.field1985.height = arg5;
        arg0.setClip(this.field1985);
        arg0.drawImage(this.field1982, arg4 - arg7, -arg1 + arg6, this.field1984);
        arg0.setClip(this.field1983);
    }
}
