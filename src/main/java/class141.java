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

@OriginalClass("client!dd")
public class class141 extends class152 {

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "Ljava/awt/Component;")
    private Component field2285;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILjava/awt/Graphics;IZ)V")
    public final void method973(int arg0, Graphics arg1, int arg2, boolean arg3) {
        arg1.drawImage(this.field2430, arg2, arg0, this.field2285);
        if (arg3) {
            this.field2285 = (Component) null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILjava/awt/Component;IB)V")
    public final void method974(int arg0, Component arg1, int arg2, byte arg3) {
        this.field2427 = arg2;
        this.field2437 = arg0;
        this.field2436 = new int[arg0 * arg2 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field2436, this.field2436.length);
        if (arg3 != 115) {
            this.method975(-108, (Graphics) null, -107, -1, 75, -35);
        }
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2427, this.field2437), var5, (Point) null);
        this.field2430 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field2285 = arg1;
        this.method1034((byte) -96);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V")
    public final void method975(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5) {
        Shape var7 = arg1.getClip();
        arg1.clipRect(arg4, arg2, arg0, arg3);
        arg1.drawImage(this.field2430, 0, 0, this.field2285);
        if (arg5 > -101) {
            this.method973(-112, (Graphics) null, -69, true);
        }
        arg1.setClip(var7);
    }
}
