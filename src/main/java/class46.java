import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public abstract class class46 extends class320 {

    @OriginalMember(owner = "client!qr", name = "l", descriptor = "I")
    public int field855;

    @OriginalMember(owner = "client!qr", name = "n", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!qr", name = "p", descriptor = "I")
    public int field859;

    @OriginalMember(owner = "client!qr", name = "m", descriptor = "Lf;")
    public static class529 field856;

    @OriginalMember(owner = "client!qr", name = "o", descriptor = "[I")
    public int[] field858;

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "(I)V", line = 9)
    public static void method443(int arg0) {
        field856 = null;
        if (arg0 != 12438) {
            field856 = null;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public abstract void method440(int arg0, Canvas arg1);

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method441(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public abstract void method442(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5);
}
