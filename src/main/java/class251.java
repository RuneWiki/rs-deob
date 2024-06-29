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

@OriginalClass("client!wc")
public class class251 extends class19 {

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "Ljava/awt/Component;")
    private Component field3988;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public final void method115(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        Shape var7 = arg3.getClip();
        if (arg2 == -1) {
            arg3.clipRect(arg5, arg4, arg0, arg1);
            arg3.drawImage(this.field261, 0, 0, this.field3988);
            arg3.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
    public final void method116(Graphics arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != 77) {
            this.method116((Graphics) null, -118, -63, (byte) -122);
        }
        arg0.drawImage(this.field261, arg1, arg2, this.field3988);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public final void method114(int arg0, int arg1, Component arg2, int arg3) {
        this.field259 = arg1;
        this.field266 = arg0;
        this.field265 = new int[arg0 * arg1 + 1];
        if (arg3 < 118) {
            this.method116((Graphics) null, -101, 90, (byte) 98);
        }
        DataBufferInt var5 = new DataBufferInt(this.field265, this.field265.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field259, this.field266), var5, (Point) null);
        this.field261 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field3988 = arg2;
        this.method118(127);
    }
}
