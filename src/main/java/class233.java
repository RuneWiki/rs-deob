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

@OriginalClass("client!to")
public class class233 extends class239 {

    @OriginalMember(owner = "client!to", name = "q", descriptor = "Ljava/awt/Canvas;")
    private Canvas field2864;

    @OriginalMember(owner = "client!to", name = "t", descriptor = "Ljava/awt/Image;")
    private Image field2867;

    @OriginalMember(owner = "client!to", name = "s", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field2866;

    @OriginalMember(owner = "client!to", name = "r", descriptor = "Ljava/awt/Shape;")
    private Shape field2865;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
    public final void method1369(Canvas arg0, byte arg1) {
        int var3 = 98 % ((57 - arg1) / 51);
        this.field2864 = arg0;
        this.field2866 = new Rectangle();
        this.field2966 = this.field2864.getSize().width;
        this.field2964 = this.field2864.getSize().height;
        this.field2968 = new int[this.field2966 * this.field2964];
        DataBufferInt var4 = new DataBufferInt(this.field2968, this.field2968.length);
        DirectColorModel var5 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var6 = Raster.createWritableRaster(var5.createCompatibleSampleModel(this.field2966, this.field2964), var4, null);
        this.field2867 = new BufferedImage(var5, var6, false, new Hashtable());
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILjava/awt/Graphics;IZ)V")
    public final void method1366(int arg0, Graphics arg1, int arg2, boolean arg3) {
        arg1.drawImage(this.field2867, arg2, arg0, this.field2864);
        if (!arg3) {
            this.method1366(-99, null, 84, false);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IILjava/awt/Graphics;IBI)V")
    public final void method1368(int arg0, int arg1, Graphics arg2, int arg3, byte arg4, int arg5) {
        int var7 = -30 / ((-arg4 - 25) / 44);
        this.field2865 = arg2.getClip();
        this.field2866.x = arg1;
        this.field2866.height = arg3;
        this.field2866.width = arg5;
        this.field2866.y = arg0;
        arg2.setClip(this.field2866);
        arg2.drawImage(this.field2867, 0, 0, this.field2864);
        arg2.setClip(this.field2865);
    }
}
