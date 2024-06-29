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

@OriginalClass("client!se")
public class class108 extends class63 {

    @OriginalMember(owner = "client!se", name = "k", descriptor = "Ljava/awt/Component;")
    private Component field1453;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V", line = 10)
    public final void method514(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        Shape var7 = arg0.getClip();
        arg0.clipRect(arg1, arg5, arg4, arg2);
        arg0.drawImage(this.field921, arg3, 0, this.field1453);
        arg0.setClip(var7);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIILjava/awt/Component;)V", line = 24)
    public final void method513(int arg0, int arg1, int arg2, Component arg3) {
        this.field926 = arg2;
        this.field927 = arg1;
        this.field918 = new int[arg1 * arg2 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field918, this.field918.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        if (arg0 != 2) {
            this.field1453 = (Component) null;
        }
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field926, this.field927), var5, (Point) null);
        this.field921 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field1453 = arg3;
        this.method512(65);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/awt/Graphics;III)V", line = 42)
    public final void method515(Graphics arg0, int arg1, int arg2, int arg3) {
        arg0.drawImage(this.field921, arg1, arg2, this.field1453);
        int var5 = -90 / ((arg3 - 8) / 62);
    }
}
