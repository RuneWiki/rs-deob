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

@OriginalClass("client!ga")
public class class38 extends class93 {

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "Ljava/awt/Component;")
    private Component field872;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILjava/awt/Graphics;II)V", line = 9)
    public final void method143(int arg0, Graphics arg1, int arg2, int arg3) {
        if (arg2 != -10166) {
            this.field872 = null;
        }
        arg1.drawImage(this.field2363, arg0, arg3, this.field872);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIILjava/awt/Component;)V", line = 19)
    public final void method142(int arg0, int arg1, int arg2, Component arg3) {
        if (arg2 != 3651) {
            return;
        }
        this.field2353 = new int[arg0 * arg1 + 1];
        this.field2358 = arg0;
        this.field2366 = arg1;
        DataBufferInt var5 = new DataBufferInt(this.field2353, this.field2353.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field2366, this.field2358), var5, null);
        this.field2363 = new BufferedImage(var6, var7, false, new Hashtable());
        this.field872 = arg3;
        this.method747(17);
    }
}
