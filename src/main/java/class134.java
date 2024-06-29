import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class134 {

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "[[I")
    public static int[][] field2536 = new int[5][5000];

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public static volatile int field2542 = 0;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field2539 = -1;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public int field2534;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public int field2537;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public int field2540;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    public int field2544;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public int field2545;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public int field2546;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public int field2547;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "Lqc;")
    public static class162 field2548;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "[B")
    public byte[] field2541;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "[B")
    public byte[] field2543;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V")
    public static void method849(boolean arg0) {
        field2548 = null;
        if (!arg0) {
            method851(null, true);
        }
        field2536 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method850(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public static final void method851(Component arg0, boolean arg1) {
        field2538++;
        arg0.addMouseListener(class205.field4011);
        arg0.addMouseMotionListener(class205.field4011);
        arg0.addFocusListener(class205.field4011);
        if (arg1) {
            method851(null, true);
        }
    }
}
