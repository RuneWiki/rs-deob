import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class256 extends class418 {

    @OriginalMember(owner = "client!ko", name = "s", descriptor = "I")
    public static int field3733 = 50;

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "[I")
    public static int[] field3727 = new int[field3733];

    @OriginalMember(owner = "client!ko", name = "E", descriptor = "I")
    public static int field3745 = 0;

    @OriginalMember(owner = "client!ko", name = "F", descriptor = "[I")
    public static int[] field3746 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!ko", name = "z", descriptor = "Z")
    public static boolean field3740 = false;

    @OriginalMember(owner = "client!ko", name = "G", descriptor = "Z")
    public static boolean field3747 = false;

    @OriginalMember(owner = "client!ko", name = "N", descriptor = "[Ljava/lang/String;")
    public static String[] field3754 = new String[field3733];

    @OriginalMember(owner = "client!ko", name = "M", descriptor = "[I")
    public static int[] field3753 = new int[field3733];

    @OriginalMember(owner = "client!ko", name = "O", descriptor = "[I")
    public static int[] field3755 = new int[field3733];

    @OriginalMember(owner = "client!ko", name = "A", descriptor = "I")
    public static int field3741 = 0;

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "[I")
    public static int[] field3728 = new int[field3733];

    @OriginalMember(owner = "client!ko", name = "T", descriptor = "[I")
    public static int[] field3760 = new int[field3733];

    @OriginalMember(owner = "client!ko", name = "V", descriptor = "[I")
    public static int[] field3762 = new int[field3733];

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "I")
    public int field3725;

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "I")
    public int field3726;

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "I")
    public int field3729;

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "I")
    public int field3731;

    @OriginalMember(owner = "client!ko", name = "t", descriptor = "I")
    public int field3734;

    @OriginalMember(owner = "client!ko", name = "u", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!ko", name = "v", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!ko", name = "x", descriptor = "I")
    public int field3738;

    @OriginalMember(owner = "client!ko", name = "y", descriptor = "I")
    public int field3739;

    @OriginalMember(owner = "client!ko", name = "B", descriptor = "I")
    public int field3742;

    @OriginalMember(owner = "client!ko", name = "C", descriptor = "I")
    public int field3743;

    @OriginalMember(owner = "client!ko", name = "D", descriptor = "I")
    public int field3744;

    @OriginalMember(owner = "client!ko", name = "H", descriptor = "I")
    public int field3748;

    @OriginalMember(owner = "client!ko", name = "I", descriptor = "I")
    public int field3749;

    @OriginalMember(owner = "client!ko", name = "J", descriptor = "I")
    public int field3750;

    @OriginalMember(owner = "client!ko", name = "K", descriptor = "I")
    public int field3751;

    @OriginalMember(owner = "client!ko", name = "L", descriptor = "I")
    public int field3752;

    @OriginalMember(owner = "client!ko", name = "P", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!ko", name = "Q", descriptor = "I")
    public int field3757;

    @OriginalMember(owner = "client!ko", name = "S", descriptor = "I")
    public int field3759;

    @OriginalMember(owner = "client!ko", name = "U", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!ko", name = "R", descriptor = "Lbm;")
    public class101 field3758;

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "Lhh;")
    public class151 field3730;

    @OriginalMember(owner = "client!ko", name = "r", descriptor = "Lkk;")
    public class260 field3732;

    @OriginalMember(owner = "client!ko", name = "w", descriptor = "Lbe;")
    public class354 field3737;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V", line = 12)
    public final void method1652(byte arg0) {
        this.field3737 = null;
        this.field3758 = null;
        this.field3730 = null;
        if (arg0 == -36) {
            field3761++;
            this.field3732 = null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)V", line = 34)
    public static void method1653(byte arg0) {
        field3727 = null;
        field3754 = null;
        field3728 = null;
        field3746 = null;
        if (arg0 != -45) {
            method1653((byte) -58);
        }
        field3762 = null;
        field3760 = null;
        field3753 = null;
        field3755 = null;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIILsj;IBII)V", line = 61)
    public static final void method1654(int arg0, int arg1, int arg2, class248 arg3, int arg4, byte arg5, int arg6, int arg7) {
        field3756++;
        if (class420.field6110) {
            class346.field5150 = 32;
        } else {
            class346.field5150 = 0;
        }
        class420.field6110 = false;
        if (class21.field388 != 0) {
            if (arg0 <= arg2 && (arg0 + 16) > arg2 && arg1 <= arg6 && arg1 + 16 > arg6) {
                arg3.field3499 -= 4;
                class92.method744(20491, arg3);
            } else if (arg2 >= arg0 && (arg0 + 16) > arg2 && arg6 >= arg4 + arg1 - 16 && arg6 < (arg1 + arg4)) {
                arg3.field3499 += 4;
                class92.method744(20491, arg3);
            } else if ((arg0 - class346.field5150) <= arg2 && arg2 < arg0 - (-class346.field5150 - 16) && arg1 + 16 <= arg6 && (arg4 + arg1 - 16) > arg6) {
                int var8 = (arg4 - 32) * arg4 / arg7;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg6 - (arg1 + 16) - (var8 / 2);
                int var10 = arg4 - var8 - 32;
                arg3.field3499 = (arg7 - arg4) * var9 / var10;
                class92.method744(20491, arg3);
                class420.field6110 = true;
            }
        }
        if (class240.field3366 != 0) {
            int var11 = arg3.field3531;
            if (arg2 >= (arg0 - var11) && arg6 >= arg1 && arg0 + 16 > arg2 && arg1 + arg4 >= arg6) {
                arg3.field3499 += class240.field3366 * 45;
                class92.method744(20491, arg3);
            }
        }
        if (arg5 <= 67) {
            method1655(false, -73);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZI)V", line = 170)
    public static final void method1655(boolean arg0, int arg1) {
        field3735++;
        class387 var2 = (class387) class67.field982.method2826(!arg0, (long) arg1);
        if (var2 != null) {
            var2.method2632(arg0);
        }
    }
}
