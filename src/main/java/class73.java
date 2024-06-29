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

@OriginalClass("client!qv")
public class class73 extends class161 {

    @OriginalMember(owner = "client!qv", name = "q", descriptor = "Ljava/awt/Canvas;")
    private Canvas field1038;

    @OriginalMember(owner = "client!qv", name = "t", descriptor = "Ljava/awt/Image;")
    private Image field1041;

    @OriginalMember(owner = "client!qv", name = "s", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field1040;

    @OriginalMember(owner = "client!qv", name = "r", descriptor = "Ljava/awt/Shape;")
    private Shape field1039;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public final void method575(int arg0, Canvas arg1) {
        this.field1038 = arg1;
        this.field1040 = new Rectangle();
        if (arg0 < 13) {
            return;
        }
        this.field2434 = this.field1038.getSize().width;
        this.field2432 = this.field1038.getSize().height;
        this.field2431 = new int[this.field2434 * this.field2432];
        DataBufferInt var3 = new DataBufferInt(this.field2431, this.field2431.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field2434, this.field2432), var3, null);
        this.field1041 = new BufferedImage(var4, var5, false, new Hashtable());
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public final void method576(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        this.field1039 = arg5.getClip();
        this.field1040.height = arg2;
        this.field1040.y = arg3;
        this.field1040.width = arg1;
        int var7 = 97 / ((25 - arg4) / 54);
        this.field1040.x = arg0;
        arg5.setClip(this.field1040);
        arg5.drawImage(this.field1041, 0, 0, this.field1038);
        arg5.setClip(this.field1039);
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method577(int arg0, Graphics arg1, int arg2, int arg3) {
        arg1.drawImage(this.field1041, arg0, arg2, this.field1038);
        if (arg3 != 8479) {
            this.method577(68, null, 64, 3);
        }
    }
}
