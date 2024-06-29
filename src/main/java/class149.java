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

@OriginalClass("client!uk")
public class class149 extends class97 {

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1967;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "Ljava/awt/Image;")
    private Image field1966;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field1965;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "Ljava/awt/Shape;")
    private Shape field1968;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIBLjava/awt/Graphics;II)V")
    public final void method636(int arg0, int arg1, byte arg2, Graphics arg3, int arg4, int arg5) {
        this.field1968 = arg3.getClip();
        this.field1965.height = arg0;
        this.field1965.y = arg5;
        this.field1965.x = arg4;
        this.field1965.width = arg1;
        if (arg2 != -100) {
            this.method637((Canvas) null, -34);
        }
        arg3.setClip(this.field1965);
        arg3.drawImage(this.field1966, 0, 0, this.field1967);
        arg3.setClip(this.field1968);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public final void method637(Canvas arg0, int arg1) {
        this.field1967 = arg0;
        this.field1965 = new Rectangle();
        this.field1327 = this.field1967.getSize().width;
        this.field1325 = this.field1967.getSize().height;
        this.field1321 = new int[this.field1327 * this.field1325];
        DataBufferInt var3 = new DataBufferInt(this.field1321, this.field1321.length);
        int var4 = 69 / ((arg1 - 26) / 48);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field1327, this.field1325), var3, (Point) null);
        this.field1966 = new BufferedImage(var5, var6, false, new Hashtable());
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method634(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg2 == 32) {
            arg3.drawImage(this.field1966, arg0, arg1, this.field1967);
        }
    }
}
