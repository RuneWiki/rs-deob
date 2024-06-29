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

@OriginalClass("client!oi")
public class class10 extends class3 {

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "Ljava/awt/Component;")
    private Component field110;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method17(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg0 == 5) {
            arg1.drawImage(this.field31, arg3, arg2, this.field110);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public final void method18(int arg0, Component arg1, int arg2, int arg3) {
        this.field29 = arg3;
        this.field37 = new int[arg2 * arg3 + 1];
        this.field27 = arg2;
        DataBufferInt var5 = new DataBufferInt(this.field37, this.field37.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        int var7 = -31 % ((15 - arg0) / 50);
        WritableRaster var8 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field27, this.field29), var5, null);
        this.field31 = new BufferedImage(var6, var8, false, new Hashtable());
        this.field110 = arg1;
        this.method22(-72);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljava/awt/Graphics;IIBII)V")
    public final void method21(Graphics arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        Shape var7 = arg0.getClip();
        if (arg3 < 53) {
            this.method17(-10, null, 79, 30);
        }
        arg0.clipRect(arg5, arg1, arg4, arg2);
        arg0.drawImage(this.field31, 0, 0, this.field110);
        arg0.setClip(var7);
    }
}
