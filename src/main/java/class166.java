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

@OriginalClass("client!df")
public class class166 extends class206 {

    @OriginalMember(owner = "client!df", name = "m", descriptor = "Ljava/awt/Component;")
    private Component field2566;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILjava/awt/Component;II)V", line = 9)
    public final void method1215(int arg0, Component arg1, int arg2, int arg3) {
        this.field3258 = arg2;
        this.field3257 = arg0;
        this.field3264 = new int[arg0 * arg2 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field3264, this.field3264.length);
        if (arg3 != 31980) {
            this.field2566 = (Component) null;
        }
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field3257, this.field3258), var5, (Point) null);
        this.field3265 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field2566 = arg1;
        this.method1503(32);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIILjava/awt/Graphics;)V", line = 30)
    public final void method1216(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg2 != 0) {
            this.method1217(76, -43, -65, -22, (Graphics) null, 92);
        }
        arg3.drawImage(this.field3265, arg0, arg1, this.field2566);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V", line = 41)
    public final void method1217(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg1, arg2, arg5, arg3);
        arg4.drawImage(this.field3265, 0, 0, this.field2566);
        arg4.setClip(var7);
        if (arg0 > -76) {
            this.field2566 = (Component) null;
        }
    }
}
