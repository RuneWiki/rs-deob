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

@OriginalClass("client!hf")
public class class75 extends class129 {

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "Ljava/awt/Component;")
    private Component field1391;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method440(int arg0, int arg1, Graphics arg2, int arg3) {
        arg2.drawImage(this.field2332, arg3, arg1, this.field1391);
        if (arg0 != 99) {
            this.method441(null, -116, 43, -55, -39, -81);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public final void method441(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg5, arg3, arg2, arg4);
        arg0.drawImage(this.field2332, 0, 0, this.field1391);
        arg0.setClip(var7);
        if (arg1 != 3289) {
            this.method442(73, null, 112, 6);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public final void method442(int arg0, Component arg1, int arg2, int arg3) {
        this.field2328 = arg0;
        this.field2339 = arg2;
        this.field2337 = new int[arg0 * arg2 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field2337, this.field2337.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2328, this.field2339), var5, null);
        this.field2332 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field1391 = arg1;
        this.method787(arg3);
    }
}
