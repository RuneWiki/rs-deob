import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class180 extends class189 {

    @OriginalMember(owner = "client!u", name = "jb", descriptor = "I")
    private int field3654;

    @OriginalMember(owner = "client!u", name = "ob", descriptor = "[I")
    public static int[] field3659 = new int[32];

    @OriginalMember(owner = "client!u", name = "hb", descriptor = "Lgg;")
    private static class63 field3652 = class116.method911(43, "Press (Wrecover a locked account(W on front page)3");

    @OriginalMember(owner = "client!u", name = "nb", descriptor = "Lgg;")
    public static class63 field3658 = field3652;

    @OriginalMember(owner = "client!u", name = "rb", descriptor = "Lgg;")
    public static class63 field3662;

    @OriginalMember(owner = "client!u", name = "sb", descriptor = "Lgg;")
    private static class63 field3663;

    @OriginalMember(owner = "client!u", name = "ub", descriptor = "Lgg;")
    public static class63 field3665;

    @OriginalMember(owner = "client!u", name = "gb", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!u", name = "ib", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!u", name = "kb", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!u", name = "lb", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!u", name = "mb", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!u", name = "pb", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!u", name = "qb", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!u", name = "vb", descriptor = "Lbc;")
    public static class14 field3666;

    @OriginalMember(owner = "client!u", name = "tb", descriptor = "[Lrc;")
    public static class156[] field3664;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
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

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V")
    public static final void method1195(int arg0) {
        class117.field2609.method282((byte) -66);
        int var1 = 5 / ((18 - arg0) / 52);
        ++field3660;
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(I)V")
    public static void method1196(int arg0) {
        field3652 = null;
        field3659 = null;
        field3664 = null;
        field3665 = null;
        field3666 = null;
        if (arg0 != 547) {
            method1195(121);
        }
        field3662 = null;
        field3663 = null;
        field3658 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IBLab;)V")
    public final void method77(int arg0, byte arg1, class3 arg2) {
        if (arg1 > 32) {
            ++field3655;
            if (~arg0 == -1) {
                this.field3654 = (arg2.method64(31790) << 12) / 255;
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
    public class180() {
        this(4096);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field3656;
        if (arg0 != 0) {
            return null;
        } else {
            int[] var3 = super.field3825.method681(arg1, (byte) -88);
            if (super.field3825.field1840) {
                class102.method850(var3, 0, class54.field1430, this.field3654);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIII)I")
    public static final int method1197(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3657;
        int var5 = -class25.field576[arg3 * 1024 / arg2] + 65536 >> 1;
        if (arg0 != 0) {
            field3652 = null;
        }
        return ((65536 - var5) * arg1 >> 16) + (arg4 * var5 >> 16);
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(BI)Lgg;")
    public static final class63 method1198(byte arg0, int arg1) {
        ++field3653;
        int var2 = -6 % ((-78 - arg0) / 41);
        class63 var3 = class175.method1162((byte) -126, arg1);
        for (int var4 = var3.method582(-74) + -3; var4 > 0; var4 -= 3) {
            var3 = class89.method772((byte) 106, new class63[] { var3.method596(0, var4, -63), class177.field3639, var3.method592(false, var4) });
        }
        if (var3.method582(-76) > 9) {
            return class89.method772((byte) 81, new class63[] { class64.field1639, var3.method596(0, var3.method582(-62) - 8, -81), class142.field3050, class150.field3152, var3, class153.field3208 });
        } else {
            return ~var3.method582(-56) < -7 ? class89.method772((byte) 105, new class63[] { class80.field1939, var3.method596(0, var3.method582(-111) - 4, -111), class129.field2825, class150.field3152, var3, class153.field3208 }) : class89.method772((byte) 85, new class63[] { class23.field532, var3, class17.field413 });
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 == 0) {
            ++field3651;
            if (class144.method1026((byte) -128, arg8)) {
                class150.field3162 = null;
                class186.method1225(arg2, class23.field539[arg8], -1, arg1, 765, arg6, arg5, arg0, arg3, arg7);
                if (class150.field3162 != null) {
                    class186.method1225(arg2, class150.field3162, -1412584499, arg1, 765, class116.field2606, arg5, arg0, arg3, field3661);
                    class150.field3162 = null;
                }
            } else if (arg3 != -1) {
                class135.field2927[arg3] = true;
            } else {
                for (int var9 = 0; ~var9 > -101; ++var9) {
                    class135.field2927[var9] = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "c", descriptor = "(II)I")
    public static int method1200(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(I)V")
    private class180(int arg0) {
        super(0, true);
        this.field3654 = 4096;
        this.field3654 = arg0;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; ~var1 > -33; ++var1) {
            field3659[var1] = var0 + -1;
            var0 += var0;
        }
        field3662 = class116.method911(43, "Bitte wenden Sie sich an den Kundendienst)3");
        field3663 = class116.method911(43, "Login server offline)3");
        field3665 = field3663;
    }
}
