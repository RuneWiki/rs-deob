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

@OriginalClass("client!ic")
public class class227 extends class34 {

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "Ljava/awt/Canvas;")
    private Canvas field3329;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "Ljava/awt/Image;")
    private Image field3332;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field3331;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "Ljava/awt/Shape;")
    private Shape field3330;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
    public final void method246(Canvas arg0, byte arg1) {
        if (arg1 != -40) {
            this.method247(22, -104, 24, (Graphics) null);
        }
        this.field3329 = arg0;
        this.field3331 = new Rectangle();
        this.field495 = this.field3329.getSize().width;
        this.field492 = this.field3329.getSize().height;
        this.field489 = new int[this.field495 * this.field492];
        DataBufferInt var3 = new DataBufferInt(this.field489, this.field489.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field495, this.field492), var3, (Point) null);
        this.field3332 = new BufferedImage(var4, var5, false, new Hashtable());
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method247(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg0 < 26) {
            this.method247(105, -119, 101, (Graphics) null);
        }
        arg3.drawImage(this.field3332, arg2, arg1, this.field3329);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public final void method250(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3330 = arg1.getClip();
        this.field3331.y = arg2;
        int var7 = 90 / ((arg0 - 70) / 42);
        this.field3331.width = arg5;
        this.field3331.height = arg4;
        this.field3331.x = arg3;
        arg1.setClip(this.field3331);
        arg1.drawImage(this.field3332, 0, 0, this.field3329);
        arg1.setClip(this.field3330);
    }
}
