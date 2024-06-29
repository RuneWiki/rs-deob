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

@OriginalClass("client!jm")
public class class193 extends class48 {

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "Ljava/awt/Component;")
    private Component field3126;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V", line = 10)
    public final void method264(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 56 % ((51 - arg2) / 37);
        Shape var8 = arg0.getClip();
        arg0.clipRect(arg5, arg1, arg4, arg3);
        arg0.drawImage(this.field990, 0, 0, this.field3126);
        arg0.setClip(var8);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILjava/awt/Graphics;IB)V", line = 22)
    public final void method265(int arg0, Graphics arg1, int arg2, byte arg3) {
        if (arg3 != -112) {
            this.method265(-72, (Graphics) null, 89, (byte) 42);
        }
        arg1.drawImage(this.field990, arg2, arg0, this.field3126);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IILjava/awt/Component;B)V", line = 33)
    public final void method269(int arg0, int arg1, Component arg2, byte arg3) {
        this.field995 = arg1;
        this.field1002 = arg0;
        this.field988 = new int[arg0 * arg1 + 1];
        DataBufferInt var5 = new DataBufferInt(this.field988, this.field988.length);
        DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
        WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(this.field995, this.field1002), var5, (Point) null);
        this.field990 = new BufferedImage(var6, var7, false, new Hashtable());
        if (arg3 != -116) {
            this.method269(-35, -12, (Component) null, (byte) -29);
        }
        this.field3126 = arg2;
        this.method369((byte) -19);
    }
}
