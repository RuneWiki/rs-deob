import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class663 extends class366 {

    @OriginalMember(owner = "client!lu", name = "l", descriptor = "[[I")
    public static int[][] field9230 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!lu", name = "h", descriptor = "I")
    public static int field9226;

    @OriginalMember(owner = "client!lu", name = "i", descriptor = "I")
    public static int field9227;

    @OriginalMember(owner = "client!lu", name = "j", descriptor = "I")
    public static int field9228;

    @OriginalMember(owner = "client!lu", name = "k", descriptor = "I")
    public static int field9229;

    @OriginalMember(owner = "client!lu", name = "m", descriptor = "I")
    public static int field9231;

    @OriginalMember(owner = "client!lu", name = "o", descriptor = "I")
    public static int field9233;

    @OriginalMember(owner = "client!lu", name = "p", descriptor = "I")
    public static int field9234;

    @OriginalMember(owner = "client!lu", name = "q", descriptor = "I")
    public static int field9235;

    @OriginalMember(owner = "client!lu", name = "r", descriptor = "I")
    public static int field9236;

    @OriginalMember(owner = "client!lu", name = "s", descriptor = "I")
    public static int field9237;

    @OriginalMember(owner = "client!lu", name = "n", descriptor = "Lri;")
    public static class97 field9232;

    @OriginalMember(owner = "client!lu", name = "g", descriptor = "[I")
    public static int[] field9225;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(CI)Z")
    public static final boolean method3799(char arg0, int arg1) {
        ++field9229;
        if (arg0 >= ' ' && ~arg0 >= -127) {
            return true;
        } else if (~arg0 <= -161 && ~arg0 >= -256) {
            return true;
        } else if (~arg0 != -8365 && ~arg0 != -339 && ~arg0 != -8213 && arg0 != 339 && arg0 != 376) {
            int var2 = -62 % ((-18 - arg1) / 63);
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lu", name = "c", descriptor = "(I)Lrda;")
    public static final class614 method3800(int arg0) {
        if (arg0 >= -103) {
            method3804(-116, 69, -114, 100, -113, 76, -42, -29, 85);
        }
        ++field9228;
        return class432.method2744(1, 8);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Z)Z")
    public final boolean method1137(boolean arg0) {
        ++field9226;
        return !arg0;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZI)V")
    public final void method1133(boolean arg0, int arg1) {
        super.field5742.method870((byte) -101, true);
        if (arg1 == 0) {
            ++field9235;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZZ)V")
    public final void method1131(boolean arg0, boolean arg1) {
        if (!arg1) {
            field9232 = null;
        }
        ++field9227;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(ILep;I)V")
    public final void method1130(int arg0, class386 arg1, int arg2) {
        super.field5742.method856(false, arg1);
        if (arg0 != 1) {
            method3802(-113, -126, false, -63, -51, -32, 25);
        }
        ++field9237;
        super.field5742.method816(arg2, -119);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V")
    public final void method1132(int arg0) {
        ++field9234;
        if (arg0 == 0) {
            super.field5742.method870((byte) -111, false);
        }
    }

    @OriginalMember(owner = "client!lu", name = "b", descriptor = "(Z)V")
    public static void method3801(boolean arg0) {
        field9230 = null;
        if (!arg0) {
            field9232 = null;
            field9225 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIZIIII)V")
    public static final void method3802(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field9233;
        class515[] var7 = class472.field6987;
        for (int var8 = 0; ~var7.length < ~var8; ++var8) {
            class515 var9 = var7[var8];
            if (var9 != null && ~var9.field7483 == -3) {
                method3804(93, var9.field7489 * 2, arg1 >> 1, var9.field7492, var9.field7488, var9.field7486, arg4, arg5 >> 1, arg0);
                if (~class321.field5031[0] < 0 && ~(class562.field8084 % 20) > -11) {
                    class487.field7143[var9.field7480].method3960(class321.field5031[0] + arg6 - 12, arg3 + -28 + class321.field5031[1]);
                }
            }
        }
        if (arg2) {
            method3800(66);
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(III)V")
    public final void method1136(int arg0, int arg1, int arg2) {
        ++field9236;
        if (arg0 != -6561) {
            field9230 = null;
        }
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Ler;)V")
    public class663(class92 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(Liaa;Z)V")
    public static final void method3803(class459 arg0, boolean arg1) {
        for (int var2 = arg0.field6865; var2 <= arg0.field6870; ++var2) {
            for (int var3 = arg0.field6869; var3 <= arg0.field6871; ++var3) {
                class252 var4 = class454.field6818[arg0.field9695][var2][var3];
                if (var4 != null) {
                    class531 var5 = var4.field4026;
                    class531 var6 = null;
                    while (var5 != null) {
                        if (var5.field7739 == arg0) {
                            if (var6 != null) {
                                var6.field7736 = var5.field7736;
                            } else {
                                var4.field4026 = var5.field7736;
                            }
                            var5.method3214(false);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field7736;
                    }
                }
            }
        }
        if (!arg1) {
            class200.method1554(arg0);
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method3804(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg0 < 82) {
            field9230 = null;
        }
        ++field9231;
        class466.method2906(arg2, arg6, arg5, (byte) -29, arg8, arg4, arg3, arg7, 0, arg1);
    }
}
