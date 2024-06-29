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

@OriginalClass("client!ob")
public class class285 extends class20 {

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "Ljava/awt/Component;")
    private Component field4858;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILjava/awt/Graphics;IIII)V", line = 9)
    public final void method148(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 > -57) {
            this.method145(-40, (Component) null, 73, false);
        }
        Shape var7 = arg1.getClip();
        arg1.clipRect(arg0, arg4, arg2, arg3);
        arg1.drawImage(this.field391, 0, 0, this.field4858);
        arg1.setClip(var7);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILjava/awt/Component;IZ)V", line = 25)
    public final void method145(int arg0, Component arg1, int arg2, boolean arg3) {
        this.field388 = arg2;
        this.field385 = new int[arg0 * arg2 + 1];
        if (!arg3) {
            this.field4858 = (Component) null;
        }
        this.field381 = arg0;
        DataBufferInt var5 = new DataBufferInt(this.field385, this.field385.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field388, this.field381), var5, (Point) null);
        this.field391 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field4858 = arg1;
        this.method146(20200);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 46)
    public final void method147(int arg0, int arg1, Graphics arg2, int arg3) {
        int var5 = -39 / ((arg3 + 54) / 41);
        arg2.drawImage(this.field391, arg0, arg1, this.field4858);
    }
}
