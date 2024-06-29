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

@OriginalClass("client!ui")
public class class113 extends class188 {

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "Ljava/awt/Component;")
    private Component field2090;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILjava/awt/Component;BI)V")
    public final void method717(int arg0, Component arg1, byte arg2, int arg3) {
        this.field3201 = arg3;
        this.field3202 = new int[arg0 * arg3 + 1];
        this.field3210 = arg0;
        int var5 = 1 / ((-arg2) / 37);
        DataBufferInt var6 = new DataBufferInt(this.field3202, this.field3202.length);
        DirectColorModel var7 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var8 = Raster.createWritableRaster(var7.createCompatibleSampleModel(this.field3201, this.field3210), var6, (Point) null);
        this.field3199 = new BufferedImage(var7, var8, false, new Hashtable());
        this.field2090 = arg1;
        this.method1203(-1);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILjava/awt/Graphics;BIII)V")
    public final void method718(int arg0, Graphics arg1, byte arg2, int arg3, int arg4, int arg5) {
        Shape var7 = arg1.getClip();
        arg1.clipRect(arg0, arg4, arg5, arg3);
        arg1.drawImage(this.field3199, 0, 0, this.field2090);
        if (arg2 != -52) {
            this.method719(38, -9, (Graphics) null, -107);
        }
        arg1.setClip(var7);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method719(int arg0, int arg1, Graphics arg2, int arg3) {
        arg2.drawImage(this.field3199, arg0, arg1, this.field2090);
        if (arg3 != 3108) {
            this.field2090 = (Component) null;
        }
    }
}
