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

@OriginalClass("client!ib")
public class class58 extends class93 {

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "Ljava/awt/Component;")
    private Component field1350;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZIILjava/awt/Component;)V")
    public final void method154(boolean arg0, int arg1, int arg2, Component arg3) {
        this.field1997 = arg2;
        this.field1990 = new int[arg1 * arg2 + 1];
        this.field1992 = arg1;
        DataBufferInt var5 = new DataBufferInt(this.field1990, this.field1990.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field1992, this.field1997), var5, null);
        this.field1995 = new BufferedImage(var6, var7, arg0, new Hashtable());
        this.field1350 = arg3;
        this.method647(-120);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public final void method153(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg5, arg1, arg4, arg0);
        arg3.drawImage(this.field1995, 0, 0, this.field1350);
        arg3.setClip(var7);
        if (arg2 != 524287) {
            this.method153(93, -18, -93, null, -51, 68);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/awt/Graphics;III)V")
    public final void method156(Graphics arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            arg0.drawImage(this.field1995, arg1, arg3, this.field1350);
        }
    }
}
