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

@OriginalClass("client!eu")
public class class339 extends class426 {

    @OriginalMember(owner = "client!eu", name = "C", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4891;

    @OriginalMember(owner = "client!eu", name = "D", descriptor = "Ljava/awt/Image;")
    private Image field4892;

    @OriginalMember(owner = "client!eu", name = "B", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field4890;

    @OriginalMember(owner = "client!eu", name = "E", descriptor = "Ljava/awt/Shape;")
    private Shape field4893;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public final void method495(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 79 % ((55 - arg4) / 45);
        this.field4893 = arg0.getClip();
        this.field4890.width = arg1;
        this.field4890.x = arg2;
        this.field4890.height = arg5;
        this.field4890.y = arg3;
        arg0.setClip(this.field4890);
        arg0.drawImage(this.field4892, 0, 0, this.field4891);
        arg0.setClip(this.field4893);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public final void method492(Canvas arg0, int arg1) {
        this.field4891 = arg0;
        this.field4890 = new Rectangle();
        this.field5986 = this.field4891.getSize().width;
        this.field5983 = this.field4891.getSize().height;
        this.field5981 = new int[this.field5986 * this.field5983];
        DataBufferInt var3 = new DataBufferInt(this.field5981, this.field5981.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field5986, this.field5983), var3, null);
        this.field4892 = new BufferedImage(var4, var5, false, new Hashtable());
        if (arg1 != -4) {
            this.field4892 = null;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Ljava/awt/Graphics;ZII)V")
    public final void method497(Graphics arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            this.method497(null, false, -63, 74);
        }
        arg0.drawImage(this.field4892, arg3, arg2, this.field4891);
    }
}
