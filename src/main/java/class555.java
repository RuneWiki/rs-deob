import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class555 extends class212 {

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "I")
    public static int field7663;

    @OriginalMember(owner = "client!fs", name = "p", descriptor = "I")
    public static int field7664;

    @OriginalMember(owner = "client!fs", name = "q", descriptor = "I")
    public static int field7665;

    @OriginalMember(owner = "client!fs", name = "r", descriptor = "I")
    public static int field7666;

    @OriginalMember(owner = "client!fs", name = "s", descriptor = "I")
    public static int field7667;

    @OriginalMember(owner = "client!fs", name = "t", descriptor = "I")
    public static int field7668;

    @OriginalMember(owner = "client!fs", name = "u", descriptor = "I")
    public static int field7669;

    @OriginalMember(owner = "client!fs", name = "v", descriptor = "I")
    public static int field7670;

    @OriginalMember(owner = "client!fs", name = "w", descriptor = "I")
    public static int field7671;

    @OriginalMember(owner = "client!fs", name = "x", descriptor = "I")
    public static int field7672;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIIIIIII)Z")
    public static final boolean method3192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field7663;
        if (arg2 != -1) {
            return false;
        } else if (~(arg0 + arg6) < ~arg4 && ~arg6 > ~(arg4 - -arg7)) {
            return ~arg5 > ~(arg1 + arg8) && ~(arg3 + arg5) < ~arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IILat;ZI)V")
    public static final void method3193(int arg0, int arg1, class378 arg2, boolean arg3, int arg4) {
        ++field7664;
        if (arg1 != -326) {
            method3194(32, -33, false, 1, false, 64, -83);
        }
        int var5 = arg2.field5385;
        int var6 = arg2.field5465;
        if (arg2.field5454 == 0) {
            arg2.field5385 = arg2.field5518;
        } else if (arg2.field5454 != 1) {
            if (arg2.field5454 == 2) {
                arg2.field5385 = arg2.field5518 * arg0 >> 14;
            }
        } else {
            arg2.field5385 = -arg2.field5518 + arg0;
        }
        if (arg2.field5400 != 0) {
            if (arg2.field5400 != 1) {
                if (arg2.field5400 == 2) {
                    arg2.field5465 = arg2.field5404 * arg4 >> 14;
                }
            } else {
                arg2.field5465 = arg4 - arg2.field5404;
            }
        } else {
            arg2.field5465 = arg2.field5404;
        }
        if (~arg2.field5454 == -5) {
            arg2.field5385 = arg2.field5465 * arg2.field5386 / arg2.field5451;
        }
        if (~arg2.field5400 == -5) {
            arg2.field5465 = arg2.field5451 * arg2.field5385 / arg2.field5386;
        }
        if (class319.field4396 && (client.method1975(arg2).field4628 != 0 || ~arg2.field5450 == -1)) {
            if (arg2.field5465 < 5 && arg2.field5385 < 5) {
                arg2.field5465 = 5;
                arg2.field5385 = 5;
            } else {
                if (~arg2.field5465 >= -1) {
                    arg2.field5465 = 5;
                }
                if (~arg2.field5385 >= -1) {
                    arg2.field5385 = 5;
                }
            }
        }
        if (~class507.field7055 == ~arg2.field5441) {
            class669.field9132 = arg2;
        }
        if (arg3 && arg2.field5403 != null) {
            if (~arg2.field5385 != ~var5 || ~arg2.field5465 != ~var6) {
                class33 var7 = new class33();
                var7.field847 = arg2;
                var7.field845 = arg2.field5403;
                class208.field2975.method1273(var7, -20180);
            }
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIZIZII)V")
    public static final void method3194(int arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class500.field6984 = arg3;
        class197.field2897 = arg6;
        if (!arg4) {
            class314.field4348 = arg0;
            ++field7665;
            class113.field1950 = arg1;
            class429.field6154 = arg5;
            if (arg2 && class429.field6154 >= 100) {
                class275.field3870 = class197.field2897 * 512 + 256;
                class108.field1896 = class113.field1950 * 512 + 256;
                class458.field6444 = class197.method1403(class108.field1896, class382.field5551, 11219, class275.field3870) + -class500.field6984;
            }
            class438.field6252 = 2;
            class705.field9558 = -1;
            class44.field978 = -1;
        }
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Ldh;)V")
    public class555(class322 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(II)I")
    public final int method417(int arg0, int arg1) {
        if (arg0 != 3) {
            this.method419(-55, 59);
        }
        ++field7668;
        return 1;
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(ILdh;)V")
    public class555(int arg0, class322 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)V")
    public final void method418(boolean arg0) {
        if (arg0) {
            method3197((String[]) null, 64);
        }
        ++field7671;
        if (~super.field3006 != -2 && super.field3006 != 0) {
            super.field3006 = this.method422(20014);
        }
    }

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)I")
    public final int method422(int arg0) {
        if (arg0 != 20014) {
            return 52;
        } else {
            ++field7667;
            return 1;
        }
    }

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "(I)I")
    public final int method3195(int arg0) {
        ++field7670;
        return arg0 != -32350 ? -127 : super.field3006;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(III)Z")
    public static final boolean method3196(int arg0, int arg1, int arg2) {
        if (arg2 <= 42) {
            return true;
        } else {
            ++field7672;
            return class183.method1337(arg1, -126, arg0) | (262144 & arg1) != 0 || class418.method2576(arg1, 122, arg0);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method3197(String[] arg0, int arg1) {
        ++field7669;
        String[] var2 = new String[5];
        for (int var3 = arg1; var3 < 5; ++var3) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)V")
    public final void method419(int arg0, int arg1) {
        int var3 = -89 / ((82 - arg0) / 35);
        ++field7666;
        super.field3006 = arg1;
    }
}
