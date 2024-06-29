import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public abstract class class434 extends class65 {

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public int field6340;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public int field6343;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "[I")
    public int[] field6344;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "[[[B")
    public static byte[][][] field6341;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V", line = 14)
    public static void method2686(boolean arg0) {
        if (!arg0) {
            field6341 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(Z)V", line = 26)
    public static final void method2687(boolean arg0) {
        class657.field9351.method3517(-121);
        field6342++;
        class696.field9872.method3773((byte) -95);
        if (arg0) {
            method2687(true);
        }
        class718.field10075.method3773((byte) 73);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)Z", line = 39)
    public static final boolean method2688(byte arg0) {
        field6345++;
        if (arg0 == 51) {
            return class521.field7529 >= 1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILjava/awt/Graphics;IIIIII)V")
    public abstract void method520(int arg0, Graphics arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILjava/awt/Canvas;I)V")
    public abstract void method517(int arg0, int arg1, Canvas arg2, int arg3);
}
