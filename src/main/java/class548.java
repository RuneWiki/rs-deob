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

@OriginalClass("client!pm")
public class class548 extends class552 {

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "Ljava/awt/Canvas;")
    private Canvas field8072;

    @OriginalMember(owner = "client!pm", name = "t", descriptor = "Ljava/awt/Image;")
    private Image field8075;

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "Ljava/awt/Rectangle;")
    private Rectangle field8073;

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "Ljava/awt/Shape;")
    private Shape field8074;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILjava/awt/Graphics;IB)V")
    public final void method2017(int arg0, Graphics arg1, int arg2, byte arg3) {
        arg1.drawImage(this.field8075, arg0, arg2, this.field8072);
        if (arg3 != 43) {
            this.method2017(-98, null, 10, (byte) -107);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Ljava/awt/Canvas;B)V")
    public final void method2012(Canvas arg0, byte arg1) {
        this.field8072 = arg0;
        this.field8073 = new Rectangle();
        this.field8122 = this.field8072.getSize().width;
        if (arg1 < 91) {
            this.field8075 = null;
        }
        this.field8123 = this.field8072.getSize().height;
        this.field8119 = new int[this.field8123 * this.field8122];
        DataBufferInt var3 = new DataBufferInt(this.field8119, this.field8119.length);
        DirectColorModel var4 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var5 = Raster.createWritableRaster(var4.createCompatibleSampleModel(this.field8122, this.field8123), var3, null);
        this.field8075 = new BufferedImage(var4, var5, false, new Hashtable());
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
    public final void method2013(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5) {
        if (arg1 >= 0) {
            return;
        }
        this.field8074 = arg2.getClip();
        this.field8073.height = arg3;
        this.field8073.y = arg5;
        this.field8073.width = arg4;
        this.field8073.x = arg0;
        arg2.setClip(this.field8073);
        arg2.drawImage(this.field8075, 0, 0, this.field8072);
        arg2.setClip(this.field8074);
    }
}
