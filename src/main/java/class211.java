import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class211 extends class116 {

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "Ljava/awt/Component;")
    private Component field3764;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public final void method799(int arg0, Component arg1, int arg2, int arg3) {
        if (arg2 != -257) {
            return;
        }
        this.field2008 = arg0;
        this.field2009 = new int[arg0 * arg3 + 1];
        this.field2012 = arg3;
        DataBufferInt var5 = new DataBufferInt(this.field2009, this.field2009.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2012, this.field2008), var5, (Point) null);
        this.field2010 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field3764 = arg1;
        this.method818((byte) 79);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public final void method801(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg0, arg5, arg2, arg4);
        if (arg1 == 3) {
            arg3.drawImage(this.field2010, 0, 0, this.field3764);
            arg3.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method804(int arg0, Graphics arg1, int arg2, int arg3) {
        arg1.drawImage(this.field2010, arg3, arg0, this.field3764);
        if (arg2 != -26806) {
            this.field3764 = (Component) null;
        }
    }
}
