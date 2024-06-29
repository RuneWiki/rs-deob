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

@OriginalClass("client!wp")
public class class154 extends class558 {

    @OriginalMember(owner = "client!wp", name = "t", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1888;

    @OriginalMember(owner = "client!wp", name = "v", descriptor = "Ljava/awt/Image;")
    private Image field1890;

    @OriginalMember(owner = "client!wp", name = "w", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field1891;

    @OriginalMember(owner = "client!wp", name = "u", descriptor = "Ljava/awt/Shape;")
    private Shape field1889;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IILjava/awt/Graphics;B)V")
    public final void method226(int arg0, int arg1, Graphics arg2, byte arg3) {
        arg2.drawImage(this.field1890, arg0, arg1, this.field1888);
        if (arg3 < 106) {
            this.field1891 = null;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IILjava/awt/Graphics;IBI)V")
    public final void method227(int arg0, int arg1, Graphics arg2, int arg3, byte arg4, int arg5) {
        this.field1889 = arg2.getClip();
        this.field1891.x = arg5;
        this.field1891.width = arg0;
        this.field1891.y = arg3;
        this.field1891.height = arg1;
        arg2.setClip(this.field1891);
        arg2.drawImage(this.field1890, 0, 0, this.field1888);
        arg2.setClip(this.field1889);
        if (arg4 != 7) {
            this.method227(49, -51, null, 39, (byte) 27, 77);
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZLjava/awt/Canvas;)V")
    public final void method229(boolean arg0, Canvas arg1) {
        this.field1888 = arg1;
        this.field1891 = new Rectangle();
        this.field8218 = this.field1888.getSize().width;
        this.field8219 = this.field1888.getSize().height;
        this.field8221 = new int[this.field8219 * this.field8218];
        DataBufferInt var3 = new DataBufferInt(this.field8221, this.field8221.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        if (!arg0) {
            this.field1889 = null;
        }
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field8218, this.field8219), var3, null);
        this.field1890 = new BufferedImage(var4, var5, false, new Hashtable());
    }
}
