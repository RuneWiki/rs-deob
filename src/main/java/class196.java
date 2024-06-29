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

@OriginalClass("client!le")
public class class196 extends class241 {

    @OriginalMember(owner = "client!le", name = "m", descriptor = "Ljava/awt/Component;")
    private Component field3001;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IILjava/awt/Graphics;III)V")
    public final void method179(int arg0, int arg1, Graphics arg2, int arg3, int arg4, int arg5) {
        Shape var7 = arg2.getClip();
        arg2.clipRect(arg1, arg5, arg4, arg3);
        arg2.drawImage(this.field3790, 0, arg0, this.field3001);
        arg2.setClip(var7);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BLjava/awt/Component;II)V")
    public final void method176(byte arg0, Component arg1, int arg2, int arg3) {
        this.field3784 = arg2;
        if (arg0 < 16) {
            return;
        }
        this.field3788 = arg3;
        this.field3793 = new int[arg2 * arg3 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field3793, this.field3793.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field3784, this.field3788), var5, (Point) null);
        this.field3790 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field3001 = arg1;
        this.method1586((byte) 87);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/awt/Graphics;IZI)V")
    public final void method180(Graphics arg0, int arg1, boolean arg2, int arg3) {
        arg0.drawImage(this.field3790, arg1, arg3, this.field3001);
        if (arg2) {
            this.method180((Graphics) null, -34, false, 105);
        }
    }
}
