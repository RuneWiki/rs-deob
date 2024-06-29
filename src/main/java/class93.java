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

@OriginalClass("client!ck")
public class class93 extends class249 {

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "Ljava/awt/Component;")
    private Component field1393;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IBILjava/awt/Component;)V")
    public final void method694(int arg0, byte arg1, int arg2, Component arg3) {
        this.field3863 = arg0;
        this.field3861 = new int[arg0 * arg2 + 1];
        this.field3856 = arg2;
        int var5 = 48 / ((arg1 - 46) / 55);
        DataBufferInt var6 = new DataBufferInt(this.field3861, this.field3861.length);
        DirectColorModel var7 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var8 = Raster.createWritableRaster(var7.createCompatibleSampleModel(this.field3863, this.field3856), var6, (Point) null);
        this.field3858 = new BufferedImage(var7, var8, false, new Hashtable());
        this.field1393 = arg3;
        this.method1703(5061);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IILjava/awt/Graphics;IBI)V")
    public final void method695(int arg0, int arg1, Graphics arg2, int arg3, byte arg4, int arg5) {
        Shape var7 = arg2.getClip();
        arg2.clipRect(arg0, arg3, arg1, arg5);
        arg2.drawImage(this.field3858, 0, 0, this.field1393);
        arg2.setClip(var7);
        if (arg4 <= 9) {
            this.method694(-116, (byte) -39, -66, (Component) null);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IILjava/awt/Graphics;Z)V")
    public final void method696(int arg0, int arg1, Graphics arg2, boolean arg3) {
        arg2.drawImage(this.field3858, arg0, arg1, this.field1393);
        if (!arg3) {
            this.method696(-19, -44, (Graphics) null, false);
        }
    }
}
