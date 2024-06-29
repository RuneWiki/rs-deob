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

@OriginalClass("client!b")
public class class11 extends class83 {

    @OriginalMember(owner = "client!b", name = "B", descriptor = "Ljava/awt/Component;")
    private Component field259;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public final void method82(int arg0, int arg1, Component arg2, int arg3) {
        this.field2011 = arg3;
        this.field2009 = arg1;
        this.field2008 = new int[arg1 * arg3 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field2008, this.field2008.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2009, this.field2011), var5, null);
        this.field2002 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field259 = arg2;
        this.method651((byte) 114);
        if (arg0 != -2) {
            this.method84(35, -24, -49, 73, -64, null);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
    public final void method83(int arg0, byte arg1, Graphics arg2, int arg3) {
        if (arg1 != -119) {
            this.field259 = null;
        }
        arg2.drawImage(this.field2002, arg0, arg3, this.field259);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public final void method84(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        if (arg2 == -16711936) {
            Shape var7 = arg5.getClip();
            arg5.clipRect(arg0, arg1, arg3, arg4);
            arg5.drawImage(this.field2002, 0, 0, this.field259);
            arg5.setClip(var7);
        }
    }
}
