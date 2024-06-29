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

@OriginalClass("client!fc")
public class class113 extends class23 {

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "Ljava/awt/Component;")
    private Component field1919;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZLjava/awt/Graphics;II)V")
    public final void method122(boolean arg0, Graphics arg1, int arg2, int arg3) {
        if (!arg0) {
            this.method121(-111, 21, -18, -73, (byte) -72, (Graphics) null);
        }
        arg1.drawImage(this.field345, arg3, arg2, this.field1919);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIBLjava/awt/Graphics;)V")
    public final void method121(int arg0, int arg1, int arg2, int arg3, byte arg4, Graphics arg5) {
        if (arg4 == 107) {
            Shape var7 = arg5.getClip();
            arg5.clipRect(arg1, arg0, arg3, arg2);
            arg5.drawImage(this.field345, 0, 0, this.field1919);
            arg5.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method127(int arg0, int arg1, int arg2, Component arg3) {
        if (arg1 != -22254) {
            this.field1919 = (Component) null;
        }
        this.field351 = new int[arg0 * arg2 + 1];
        this.field344 = arg2;
        this.field353 = arg0;
        DataBufferInt var5 = new DataBufferInt(this.field351, this.field351.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field353, this.field344), var5, (Point) null);
        this.field345 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field1919 = arg3;
        this.method126(124);
    }
}
