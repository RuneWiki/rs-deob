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

@OriginalClass("client!ja")
public class class98 extends class193 {

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "Ljava/awt/Component;")
    private Component field1778;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILjava/awt/Component;B)V")
    public final void method522(int arg0, int arg1, Component arg2, byte arg3) {
        this.field3460 = arg0;
        this.field3452 = arg1;
        this.field3451 = new int[arg0 * arg1 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field3451, this.field3451.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field3452, this.field3460), var5, null);
        int var8 = 95 / ((arg3 + 3) / 63);
        this.field3453 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field1778 = arg2;
        this.method1217((byte) 102);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
    public final void method524(int arg0, int arg1, int arg2, int arg3, Graphics arg4, int arg5) {
        Shape var7 = arg4.getClip();
        arg4.clipRect(arg3, arg0, arg5, arg2);
        arg4.drawImage(this.field3453, arg1, 0, this.field1778);
        arg4.setClip(var7);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public final void method523(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            this.method524(-79, -46, 36, -90, null, 79);
        }
        arg1.drawImage(this.field3453, arg3, arg2, this.field1778);
    }
}
