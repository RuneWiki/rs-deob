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

@OriginalClass("client!pg")
public class class143 extends class163 {

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "Ljava/awt/Component;")
    private Component field2692;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public final void method967(int arg0, Component arg1, int arg2, int arg3) {
        this.field3120 = arg2;
        this.field3122 = new int[arg2 * arg3 + arg0];
        this.field3116 = arg3;
        DataBufferInt var5 = new DataBufferInt(this.field3122, this.field3122.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field3116, this.field3120), var5, null);
        this.field3127 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field2692 = arg1;
        this.method1079(103);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public final void method968(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg5, arg3, arg1, arg2);
        arg0.drawImage(this.field3127, arg4, 0, this.field2692);
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method969(int arg0, Graphics arg1, int arg2, int arg3) {
        arg1.drawImage(this.field3127, arg0, arg3, this.field2692);
        if (arg2 != 13) {
            this.method969(92, null, 28, 34);
        }
    }
}
