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

@OriginalClass("client!kf")
public class class185 extends class296 {

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "Ljava/awt/Component;")
    private Component field2558;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIBLjava/awt/Graphics;)V")
    public final void method662(int arg0, int arg1, byte arg2, Graphics arg3) {
        if (arg2 != -69) {
            this.method662(-65, 63, (byte) -11, (Graphics) null);
        }
        arg3.drawImage(this.field4655, arg0, arg1, this.field2558);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public final void method661(int arg0, int arg1, Component arg2, int arg3) {
        this.field4660 = new int[arg0 * arg1 + 1];
        this.field4656 = arg1;
        this.field4661 = arg0;
        DataBufferInt var5 = new DataBufferInt(this.field4660, this.field4660.length);
        if (arg3 != -45301402) {
            this.field2558 = (Component) null;
        }
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field4661, this.field4656), var5, (Point) null);
        this.field4655 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field2558 = arg2;
        this.method1979((byte) -122);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
    public final void method663(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 100) {
            this.method662(-21, -39, (byte) -91, (Graphics) null);
        }
        Shape var7 = arg2.getClip();
        arg2.clipRect(arg5, arg4, arg0, arg3);
        arg2.drawImage(this.field4655, 0, 0, this.field2558);
        arg2.setClip(var7);
    }
}
