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

@OriginalClass("client!eea")
public class class119 extends class309 {

    @OriginalMember(owner = "client!eea", name = "x", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1359;

    @OriginalMember(owner = "client!eea", name = "v", descriptor = "Ljava/awt/Image;")
    private Image field1357;

    @OriginalMember(owner = "client!eea", name = "w", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field1358;

    @OriginalMember(owner = "client!eea", name = "y", descriptor = "Ljava/awt/Shape;")
    private Shape field1360;

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(ILjava/awt/Graphics;IIIB)V")
    public final void method709(int arg0, Graphics arg1, int arg2, int arg3, int arg4, byte arg5) {
        this.field1360 = arg1.getClip();
        this.field1358.height = arg4;
        this.field1358.y = arg0;
        this.field1358.width = arg2;
        this.field1358.x = arg3;
        if (arg5 == -118) {
            arg1.setClip(this.field1358);
            arg1.drawImage(this.field1357, 0, 0, this.field1359);
            arg1.setClip(this.field1360);
        }
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method710(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg2 != -28340) {
            this.field1359 = null;
        }
        arg1.drawImage(this.field1357, arg3, arg0, this.field1359);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public final void method711(int arg0, Canvas arg1) {
        this.field1359 = arg1;
        this.field1358 = new Rectangle();
        if (arg0 != -1849369271) {
            return;
        }
        this.field4012 = this.field1359.getSize().width;
        this.field4013 = this.field1359.getSize().height;
        this.field4007 = new int[this.field4013 * this.field4012];
        DataBufferInt var3 = new DataBufferInt(this.field4007, this.field4007.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field4012, this.field4013), var3, null);
        this.field1357 = new BufferedImage(var4, var5, false, new Hashtable());
    }
}
