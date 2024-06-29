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

@OriginalClass("client!fi")
public class class65 extends class10 {

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "Ljava/awt/Component;")
    private Component field1193;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/awt/Graphics;IBI)V")
    public final void method97(Graphics arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 119) {
            this.method93(-78, null, -30, -101);
        }
        arg0.drawImage(this.field207, arg3, arg1, this.field1193);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public final void method95(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 == -30673) {
            Shape var7 = arg0.getClip();
            arg0.clipRect(arg1, arg5, arg4, arg2);
            arg0.drawImage(this.field207, 0, 0, this.field1193);
            arg0.setClip(var7);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public final void method93(int arg0, Component arg1, int arg2, int arg3) {
        this.field210 = new int[arg0 * arg3 + 1];
        this.field213 = arg0;
        this.field205 = arg3;
        DataBufferInt var5 = new DataBufferInt(this.field210, this.field210.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field205, this.field213), var5, null);
        this.field207 = new BufferedImage(var6, var7, false, new Hashtable());
        if (arg2 != 13685) {
            this.method97(null, 111, (byte) -9, -47);
        }
        this.field1193 = arg1;
        this.method96((byte) -40);
    }
}
