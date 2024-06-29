import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class616 extends class212 {

    @OriginalMember(owner = "client!mfa", name = "o", descriptor = "I")
    public static int field8405;

    @OriginalMember(owner = "client!mfa", name = "p", descriptor = "I")
    public static int field8406;

    @OriginalMember(owner = "client!mfa", name = "q", descriptor = "I")
    public static int field8407;

    @OriginalMember(owner = "client!mfa", name = "r", descriptor = "I")
    public static int field8408;

    @OriginalMember(owner = "client!mfa", name = "s", descriptor = "I")
    public static int field8409;

    @OriginalMember(owner = "client!mfa", name = "t", descriptor = "I")
    public static int field8410;

    @OriginalMember(owner = "client!mfa", name = "u", descriptor = "I")
    public static int field8411;

    @OriginalMember(owner = "client!mfa", name = "v", descriptor = "I")
    public static int field8412;

    @OriginalMember(owner = "client!mfa", name = "w", descriptor = "I")
    public static int field8413;

    @OriginalMember(owner = "client!mfa", name = "x", descriptor = "I")
    public static int field8414;

    @OriginalMember(owner = "client!mfa", name = "z", descriptor = "I")
    public static int field8416;

    @OriginalMember(owner = "client!mfa", name = "A", descriptor = "I")
    public static int field8417;

    @OriginalMember(owner = "client!mfa", name = "B", descriptor = "I")
    public static int field8418;

    @OriginalMember(owner = "client!mfa", name = "y", descriptor = "[[I")
    public static int[][] field8415;

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Lmf;Lmf;ZIB)I")
    public static final int method3493(class420 arg0, class420 arg1, boolean arg2, int arg3, byte arg4) {
        ++field8410;
        if (arg3 == 1) {
            int var5 = arg0.field2398;
            int var6 = arg1.field2398;
            if (!arg2) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return -var6 + var5;
        } else if (~arg3 == -3) {
            return class339.method2141(9152, arg1.method2579(false).field5197, class607.field8336, arg0.method2579(false).field5197);
        } else if (arg3 == 3) {
            if (!arg0.field6067.equals("-")) {
                if (arg1.field6067.equals("-")) {
                    return !arg2 ? -1 : 1;
                } else {
                    return class339.method2141(9152, arg1.field6067, class607.field8336, arg0.field6067);
                }
            } else if (arg1.field6067.equals("-")) {
                return 0;
            } else {
                return arg2 ? -1 : 1;
            }
        } else if (arg3 == 4) {
            if (!arg0.method1141(-85)) {
                return !arg1.method1141(101) ? 0 : -1;
            } else {
                return arg1.method1141(70) ? 0 : 1;
            }
        } else if (arg3 == 5) {
            if (arg0.method1144((byte) -35)) {
                return !arg1.method1144((byte) -35) ? 1 : 0;
            } else {
                return !arg1.method1144((byte) -35) ? 0 : -1;
            }
        } else if (~arg3 == -7) {
            if (arg0.method1139(arg4 ^ -98)) {
                return arg1.method1139(-105) ? 0 : 1;
            } else {
                return arg1.method1139(arg4 ^ -97) ? -1 : 0;
            }
        } else if (arg4 != -30) {
            return 63;
        } else if (arg3 == 7) {
            if (arg0.method1137(true)) {
                return !arg1.method1137(true) ? 1 : 0;
            } else {
                return arg1.method1137(true) ? -1 : 0;
            }
        } else if (~arg3 == -9) {
            int var7 = arg0.field6068;
            int var8 = arg1.field6068;
            if (!arg2) {
                if (~var8 == 0) {
                    var8 = 1000;
                }
                if (~var7 == 0) {
                    var7 = 1000;
                }
            } else {
                if (var8 == 1000) {
                    var8 = -1;
                }
                if (~var7 == -1001) {
                    var7 = -1;
                }
            }
            return -var8 + var7;
        } else {
            return -arg1.field6066 + arg0.field6066;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "(I)I")
    public final int method422(int arg0) {
        if (arg0 != 20014) {
            method3493((class420) null, (class420) null, false, 94, (byte) -39);
        }
        ++field8408;
        return super.field3004.method2064((byte) -80).method3095((byte) 111) ? 3 : 2;
    }

    @OriginalMember(owner = "client!mfa", name = "d", descriptor = "(II)V")
    public static final void method3494(int arg0, int arg1) {
        ++field8406;
        class506.field7037 = arg1;
        class601.field8260.method999(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!mfa", name = "d", descriptor = "(I)I")
    public final int method3495(int arg0) {
        ++field8411;
        if (arg0 != -32350) {
            field8405 = 114;
        }
        return super.field3006;
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(Ldh;)V")
    public class616(class322 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "(ILdh;)V")
    public class616(int arg0, class322 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(II)V")
    public final void method419(int arg0, int arg1) {
        int var3 = -87 / ((arg0 - 82) / 35);
        ++field8409;
        super.field3006 = arg1;
    }

    @OriginalMember(owner = "client!mfa", name = "b", descriptor = "(II)I")
    public final int method417(int arg0, int arg1) {
        if (arg0 != 3) {
            field8405 = 95;
        }
        ++field8417;
        return 1;
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(III)V")
    public static final void method3496(int arg0, int arg1, int arg2) {
        class241.field3512 = arg2;
        ++field8416;
        class368.field5247 = arg1;
        if (arg0 == -1) {
            if (class215.field3119 == 0) {
                class218.field3157 = class147.field2462 * 2 + class368.field5247;
                class225.field3209 = class2.field20 * 2 + class241.field3512;
            } else if (class215.field3119 == 1) {
                class589.field8025 = class241.field3512 / class273.field3847 + class640.field8795 - -2;
                class391.field5761 = class368.field5247 / class386.field5603 + class192.field2852 - -2;
                class225.field3209 = class589.field8025 * class273.field3847;
                class218.field3157 = class391.field5761 * class386.field5603;
                class2.field20 = -class241.field3512 + class225.field3209 >> 1;
                class147.field2462 = class218.field3157 - class368.field5247 >> 1;
            } else if (~class215.field3119 == -3) {
                class225.field3209 = class241.field3512;
                class218.field3157 = class368.field5247;
            }
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(ILat;)Ljava/lang/String;")
    public static final String method3497(int arg0, class378 arg1) {
        ++field8418;
        if (~client.method1975(arg1).method2105(116) == -1) {
            return null;
        } else if (arg1.field5456 != null && arg1.field5456.trim().length() != 0) {
            return arg0 != 0 ? null : arg1.field5456;
        } else {
            return class319.field4396 ? "Hidden-use" : null;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Z)V")
    public final void method418(boolean arg0) {
        ++field8407;
        if (~super.field3006 > -2 || ~super.field3006 < -4) {
            super.field3006 = this.method422(20014);
        }
        if (arg0) {
            field8415 = null;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "(ZIII)I")
    public static final int method3498(boolean arg0, int arg1, int arg2, int arg3) {
        ++field8414;
        if (~class362.field5203 > -101) {
            return -2;
        } else {
            if (!arg0) {
                method3498(false, 115, 112, -104);
            }
            int var4 = -2;
            int var5 = Integer.MAX_VALUE;
            int var6 = arg2 - class489.field6788;
            int var7 = arg3 - class489.field6785;
            for (class710 var8 = (class710) class489.field6776.method1269(4); var8 != null; var8 = (class710) class489.field6776.method1264((byte) 113)) {
                if (var8.field9629 == arg1) {
                    int var9 = var8.field9634;
                    int var10 = var8.field9633;
                    int var11 = var10 - -class489.field6785 | class489.field6788 + var9 << 14;
                    int var12 = (var6 - var9) * (-var9 + var6) + (-var10 + var7) * (-var10 + var7);
                    if (~var4 > -1 || ~var12 > ~var5) {
                        var5 = var12;
                        var4 = var11;
                    }
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!mfa", name = "e", descriptor = "(I)V")
    public static void method3499(int arg0) {
        field8415 = null;
        if (arg0 != 1) {
            method3493((class420) null, (class420) null, false, -43, (byte) 102);
        }
    }

    @OriginalMember(owner = "client!mfa", name = "a", descriptor = "([BIII[[B[[B[I[I)I")
    public static final int method3500(byte[] arg0, int arg1, int arg2, int arg3, byte[][] arg4, byte[][] arg5, int[] arg6, int[] arg7) {
        ++field8412;
        int var8 = -19 % ((arg1 - 64) / 39);
        int var9 = arg6[arg3];
        int var10 = arg7[arg3] + var9;
        int var11 = arg6[arg2];
        int var12 = arg7[arg2] + var11;
        int var13 = var9;
        if (~var11 < ~var9) {
            var13 = var11;
        }
        int var14 = var10;
        if (var12 < var10) {
            var14 = var12;
        }
        int var15 = 255 & arg0[arg3];
        if (var15 > (arg0[arg2] & 255)) {
            var15 = 255 & arg0[arg2];
        }
        byte[] var16 = arg5[arg3];
        byte[] var17 = arg4[arg2];
        int var18 = -var9 + var13;
        int var19 = -var11 + var13;
        for (int var20 = var13; var14 > var20; ++var20) {
            int var21 = var17[var19++] + var16[var18++];
            if (~var15 < ~var21) {
                var15 = var21;
            }
        }
        return -var15;
    }
}
