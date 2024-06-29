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

@OriginalClass("client!gj")
public class class76 extends class228 {

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "Ljava/awt/Component;")
    private Component field1365;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIZLjava/awt/Component;)V")
    public final void method243(int arg0, int arg1, boolean arg2, Component arg3) {
        this.field4273 = arg0;
        this.field4271 = new int[arg0 * arg1 + 1];
        this.field4276 = arg1;
        if (!arg2) {
            return;
        }
        DataBufferInt var5 = new DataBufferInt(this.field4271, this.field4271.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field4276, this.field4273), var5, null);
        this.field4274 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field1365 = arg3;
        this.method1523(3739);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BIIIILjava/awt/Graphics;)V")
    public final void method242(byte arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5) {
        Shape var7 = arg5.getClip();
        if (arg0 < 66) {
            this.field1365 = null;
        }
        arg5.clipRect(arg4, arg3, arg2, arg1);
        arg5.drawImage(this.field4274, 0, 0, this.field1365);
        arg5.setClip(var7);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public final void method246(int arg0, int arg1, int arg2, Graphics arg3) {
        if (arg1 != -14013488) {
            this.method246(-50, -94, -81, null);
        }
        arg3.drawImage(this.field4274, arg2, arg0, this.field1365);
    }
}
