import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class206 {

    @OriginalMember(owner = "client!k", name = "e", descriptor = "[I")
    public static int[] field3650 = new int[200];

    @OriginalMember(owner = "client!k", name = "n", descriptor = "Le;")
    public static class191 field3659 = class54.method368("", 2047);

    @OriginalMember(owner = "client!k", name = "d", descriptor = "Le;")
    public static class191 field3649 = class54.method368("Lade Wordpack )2 ", 2047);

    @OriginalMember(owner = "client!k", name = "x", descriptor = "Le;")
    public static class191 field3669 = class54.method368("<col=ffffff>", 2047);

    @OriginalMember(owner = "client!k", name = "C", descriptor = "Le;")
    public static class191 field3674 = class54.method368("blaugr-Un:", 2047);

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public int field3646;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public int field3647;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public int field3648;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public int field3651;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public int field3654;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    public int field3655;

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public int field3656;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public int field3657;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "I")
    public int field3658;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    public int field3661;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public int field3663;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "I")
    public int field3664;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "I")
    public int field3665;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "I")
    public int field3666;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "I")
    public int field3667;

    @OriginalMember(owner = "client!k", name = "w", descriptor = "I")
    public int field3668;

    @OriginalMember(owner = "client!k", name = "y", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!k", name = "A", descriptor = "I")
    public int field3672;

    @OriginalMember(owner = "client!k", name = "B", descriptor = "I")
    public int field3673;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "Lng;")
    public static class121 field3652;

    @OriginalMember(owner = "client!k", name = "z", descriptor = "Lng;")
    public static class121 field3671;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "Lqk;")
    public static class6 field3660;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public static void method1418(int arg0) {
        field3650 = null;
        field3652 = null;
        field3671 = null;
        field3669 = null;
        if (arg0 >= -104) {
            field3659 = null;
        }
        field3674 = null;
        field3659 = null;
        field3649 = null;
        field3660 = null;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V")
    public static final void method1419(int arg0) {
        field3653++;
        class241.method1689(0);
        if (arg0 != 26642) {
            field3660 = null;
        }
        System.gc();
        class188.method1293(25, arg0 - 56853);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1420(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 >= class37.field678 && arg4 <= class207.field3680 && class242.field4314 <= arg6 && arg5 <= class99.field1584) {
            if (arg0 == 1) {
                class26.method190(arg4, 5360, arg6, arg2, arg5, arg1);
            } else {
                class157.method1071(arg6, arg4, 2, arg2, arg1, arg5, arg0);
            }
        } else if (arg0 == 1) {
            class82.method518(arg2, arg1, (byte) 92, arg5, arg4, arg6);
        } else {
            class128.method872(arg4, arg6, arg5, 92, arg2, arg1, arg0);
        }
        field3662++;
        if (arg3 >= -108) {
            method1420(-1, -45, -77, 87, -86, 82, -6);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IBLeg;IIII)V")
    public static final void method1421(int arg0, byte arg1, class33 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 < 98) {
            method1420(-15, -16, -91, 90, 44, -107, 10);
        }
        field3670++;
        int var7 = arg3 * arg3 + arg5 * arg5;
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg2.field537 / 2, arg2.field561 / 2);
        if (var7 <= (var8 * var8)) {
            class224.method1555(arg6, arg2, class97.field1569[arg4], (byte) -91, arg0, arg3, arg5);
            return;
        }
        var8 -= 10;
        int var9 = class65.field1138 + class137.field2302 & 0x7FF;
        int var10 = class15.field206[var9];
        int var11 = var10 * 256 / (class114.field1886 + 256);
        int var12 = class15.field204[var9];
        int var13 = var12 * 256 / (class114.field1886 + 256);
        int var14 = arg3 * var13 + (arg5 * var11) >> 16;
        int var15 = arg3 * var11 - (arg5 * var13) >> 16;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) (Math.sin(var16) * (double) var8);
        int var19 = (int) ((double) var8 * Math.cos(var16));
        ((class155) class55.field1016[arg4]).method594(arg2.field537 / 2 + var18 + arg0 - 10, arg2.field561 / 2 + arg6 - (var19 + 10), 20, 20, 15, 15, var16, 256);
    }
}
