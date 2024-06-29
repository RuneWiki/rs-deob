import java.awt.Component;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class39 extends class72 {

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "Ljava/awt/Component;")
    private Component field1049;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public final void method286(int arg0, int arg1, Component arg2, int arg3) {
        this.field1795 = arg0;
        this.field1800 = arg1;
        this.field1794 = new int[arg0 * arg1 + arg3];
        DataBufferInt var5 = new DataBufferInt(this.field1794, this.field1794.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1800, this.field1795), var5, null);
        this.field1810 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field1049 = arg2;
        this.method546(27);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/awt/Graphics;ZII)V")
    public final void method287(Graphics arg0, boolean arg1, int arg2, int arg3) {
        arg0.drawImage(this.field1810, arg3, arg2, this.field1049);
        if (!arg1) {
            this.method286(33, 4, null, 15);
        }
    }
}
