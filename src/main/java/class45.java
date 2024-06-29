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

@OriginalClass("client!ef")
public class class45 extends class147 {

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "Ljava/awt/Component;")
    private Component field886;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public final void method277(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg2, arg5, arg4, arg1);
        if (arg3 > -9) {
            this.method278(null, 121, 83, 25);
        }
        arg0.drawImage(this.field3004, 0, 0, this.field886);
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public final void method278(Graphics arg0, int arg1, int arg2, int arg3) {
        int var5 = 121 % ((arg1 + 81) / 36);
        arg0.drawImage(this.field3004, arg3, arg2, this.field886);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public final void method279(int arg0, int arg1, Component arg2, int arg3) {
        this.field3005 = arg3;
        this.field3002 = arg0;
        this.field3007 = new int[arg0 * arg3 + 1];
        if (arg1 != 0) {
            return;
        }
        DataBufferInt var5 = new DataBufferInt(this.field3007, this.field3007.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field3005, this.field3002), var5, null);
        this.field3004 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field886 = arg2;
        this.method921((byte) 94);
    }
}
