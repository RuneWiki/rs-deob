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

@OriginalClass("client!gf")
public class class48 extends class14 {

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "Ljava/awt/Component;")
    private Component field936;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZILjava/awt/Graphics;I)V")
    public final void method102(boolean arg0, int arg1, Graphics arg2, int arg3) {
        arg2.drawImage(this.field245, arg3, arg1, this.field936);
        if (!arg0) {
            this.method100(-98, -98, 85, null);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/awt/Graphics;ZIIII)V")
    public final void method97(Graphics arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        Shape var7 = arg0.getClip();
        if (!arg1) {
            this.field936 = null;
        }
        arg0.clipRect(arg2, arg3, arg4, arg5);
        arg0.drawImage(this.field245, 0, 0, this.field936);
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public final void method100(int arg0, int arg1, int arg2, Component arg3) {
        this.field252 = arg2;
        this.field256 = new int[arg0 * arg2 + 1];
        this.field257 = arg0;
        DataBufferInt var5 = new DataBufferInt(this.field256, this.field256.length);
        if (arg1 != -1847869520) {
            this.field936 = null;
        }
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field257, this.field252), var5, null);
        this.field245 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field936 = arg3;
        this.method103((byte) 126);
    }
}
