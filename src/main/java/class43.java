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

@OriginalClass("client!pk")
public class class43 extends class28 {

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "Ljava/awt/Component;")
    private Component field626;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIBLjava/awt/Graphics;I)V")
    public final void method184(int arg0, int arg1, int arg2, byte arg3, Graphics arg4, int arg5) {
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg2, arg0, arg5, arg1);
        arg4.drawImage(this.field424, 0, 0, this.field626);
        if (arg3 <= 37) {
            this.method187(82, (Graphics) null, 84, -59);
        }
        arg4.setClip(var7);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method187(int arg0, Graphics arg1, int arg2, int arg3) {
        arg1.drawImage(this.field424, arg0, arg3, this.field626);
        if (arg2 > -122) {
            this.field626 = (Component) null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILjava/awt/Component;IZ)V")
    public final void method190(int arg0, Component arg1, int arg2, boolean arg3) {
        this.field418 = arg0;
        this.field425 = arg2;
        this.field420 = new int[arg0 * arg2 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field420, this.field420.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field425, this.field418), var5, (Point) null);
        this.field424 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field626 = arg1;
        this.method186(109);
        if (!arg3) {
            this.field626 = (Component) null;
        }
    }
}
