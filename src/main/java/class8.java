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

@OriginalClass("client!rj")
public class class8 extends class17 {

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "Ljava/awt/Component;")
    private Component field65;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method63(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg2 != -22828) {
            this.field65 = (Component) null;
        }
        arg1.drawImage(this.field177, arg0, arg3, this.field65);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBLjava/awt/Component;I)V")
    public final void method64(int arg0, byte arg1, Component arg2, int arg3) {
        this.field174 = arg3;
        this.field176 = new int[arg0 * arg3 + 1];
        this.field171 = arg0;
        DataBufferInt var5 = new DataBufferInt(this.field176, this.field176.length);
        if (arg1 < 53) {
            return;
        }
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field174, this.field171), var5, (Point) null);
        this.field177 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field65 = arg2;
        this.method105(31894);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIBLjava/awt/Graphics;I)V")
    public final void method65(int arg0, int arg1, int arg2, byte arg3, Graphics arg4, int arg5) {
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg5, arg0, arg1, arg2);
        int var8 = -14 / ((arg3 - 20) / 58);
        arg4.drawImage(this.field177, 0, 0, this.field65);
        arg4.setClip(var7);
    }
}
