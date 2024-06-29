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

@OriginalClass("client!di")
public class class99 extends class130 {

    @OriginalMember(owner = "client!di", name = "l", descriptor = "Ljava/awt/Component;")
    private Component field1513;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public final void method744(int arg0, int arg1, Graphics arg2, int arg3) {
        arg2.drawImage(this.field2155, arg3, arg1, this.field1513);
        if (arg0 != 1152) {
            this.method744(-124, -65, (Graphics) null, -88);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public final void method745(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        Shape var7 = arg5.getClip();
        arg5.clipRect(arg1, arg4, arg3, arg0);
        if (arg2 == -46) {
            arg5.drawImage(this.field2155, 0, 0, this.field1513);
            arg5.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Ljava/awt/Component;IIZ)V")
    public final void method746(Component arg0, int arg1, int arg2, boolean arg3) {
        this.field2156 = new int[arg1 * arg2 + 1];
        this.field2158 = arg1;
        if (!arg3) {
            this.method746((Component) null, -91, -10, false);
        }
        this.field2163 = arg2;
        DataBufferInt var5 = new DataBufferInt(this.field2156, this.field2156.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2158, this.field2163), var5, (Point) null);
        this.field2155 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field1513 = arg0;
        this.method943(128);
    }
}
