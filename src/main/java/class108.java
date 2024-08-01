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

@OriginalClass("le")
public class class108 extends class48 {

    @OriginalMember(owner = "le", name = "l", descriptor = "Ljava/awt/Component;")
    private Component field2131;

    @OriginalMember(owner = "le", name = "a", descriptor = "(IIILjava/awt/Graphics;II)V")
    public final void method329(int arg0, int arg1, int arg2, Graphics arg3, int arg4, int arg5) {
        Shape var7 = arg3.getClip();
        arg3.clipRect(arg5, arg4, arg1, arg0);
        arg3.drawImage(this.field991, arg2, 0, this.field2131);
        arg3.setClip(var7);
    }

    @OriginalMember(owner = "le", name = "a", descriptor = "(IILjava/awt/Component;I)V")
    public final void method327(int arg0, int arg1, Component arg2, int arg3) {
        this.field986 = new int[arg1 * arg3 + 1];
        this.field992 = arg1;
        this.field987 = arg3;
        DataBufferInt var5 = new DataBufferInt(this.field986, this.field986.length);
        int var6 = -7 / ((82 - arg0) / 42);
        DirectColorModel var7 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var8 = Raster.createWritableRaster(var7.createCompatibleSampleModel(this.field992, this.field987), var5, null);
        this.field991 = new BufferedImage(var7, var8, false, new Hashtable());
        this.field2131 = arg2;
        this.method325((byte) 10);
    }

    @OriginalMember(owner = "le", name = "a", descriptor = "(IBLjava/awt/Graphics;I)V")
    public final void method328(int arg0, byte arg1, Graphics arg2, int arg3) {
        arg2.drawImage(this.field991, arg0, arg3, this.field2131);
        if (arg1 >= -21) {
            this.method327(-30, 11, null, 119);
        }
    }
}
