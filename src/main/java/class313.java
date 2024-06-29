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

@OriginalClass("client!e")
public class class313 extends class392 {

    @OriginalMember(owner = "client!e", name = "s", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4464;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "Ljava/awt/Image;")
    private Image field4462;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field4463;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "Ljava/awt/Shape;")
    private Shape field4465;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public final void method1958(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        this.field4465 = arg3.getClip();
        this.field4463.y = arg4;
        this.field4463.width = arg2;
        this.field4463.x = arg0;
        this.field4463.height = arg1;
        if (arg5 != 128) {
            this.field4462 = (Image) null;
        }
        arg3.setClip(this.field4463);
        arg3.drawImage(this.field4462, 0, 0, this.field4464);
        arg3.setClip(this.field4465);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/awt/Graphics;IBI)V")
    public final void method1959(Graphics arg0, int arg1, byte arg2, int arg3) {
        arg0.drawImage(this.field4462, arg3, arg1, this.field4464);
        if (arg2 > -41) {
            this.field4462 = (Image) null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
    public final void method1960(Canvas arg0, byte arg1) {
        this.field4464 = arg0;
        this.field4463 = new Rectangle();
        this.field5732 = this.field4464.getSize().width;
        this.field5728 = this.field4464.getSize().height;
        this.field5731 = new int[this.field5732 * this.field5728];
        DataBufferInt var3 = new DataBufferInt(this.field5731, this.field5731.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        int var5 = -37 % ((arg1 - 3) / 57);
        WritableRaster var6 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field5732, this.field5728), var3, (Point) null);
        this.field4462 = new BufferedImage(var4, var6, false, new Hashtable());
    }
}
