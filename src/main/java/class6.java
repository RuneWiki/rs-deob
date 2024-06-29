import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 extends class59 {

    @OriginalMember(owner = "client!ae", name = "ab", descriptor = "Lsd;")
    public static class166 field127 = class135.method935("Zu viele Anmelde)2Versuche von Ihrer Adresse", 0);

    @OriginalMember(owner = "client!ae", name = "X", descriptor = "Ld;")
    public static class29 field124 = new class29(4096);

    @OriginalMember(owner = "client!ae", name = "db", descriptor = "[[B")
    public static byte[][] field130 = new byte[50][];

    @OriginalMember(owner = "client!ae", name = "eb", descriptor = "I")
    public static int field131 = 0;

    @OriginalMember(owner = "client!ae", name = "fb", descriptor = "Lsd;")
    private static class166 field132 = class135.method935("cyan:", 0);

    @OriginalMember(owner = "client!ae", name = "hb", descriptor = "Lsd;")
    public static class166 field134 = class135.method935("Regeln versto-8en hat)3", 0);

    @OriginalMember(owner = "client!ae", name = "ib", descriptor = "Lsd;")
    public static class166 field135 = field132;

    @OriginalMember(owner = "client!ae", name = "gb", descriptor = "Lsd;")
    public static class166 field133 = class135.method935("welle:", 0);

    @OriginalMember(owner = "client!ae", name = "jb", descriptor = "Lsd;")
    public static class166 field136 = field132;

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!ae", name = "T", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!ae", name = "U", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!ae", name = "V", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!ae", name = "W", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!ae", name = "Y", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!ae", name = "Z", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!ae", name = "bb", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!ae", name = "cb", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(IB)[I")
    public final int[] method36(int arg0, byte arg1) {
        int[] var3 = super.field1219.method721(arg0, -125);
        if (arg1 > -124) {
            field135 = null;
        }
        if (super.field1219.field1816) {
            int[] var4 = this.method499(0, arg0, 0);
            for (int var5 = 0; ~class98.field1879 < ~var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        ++field122;
        return var3;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method37(boolean arg0, int arg1) {
        int[][] var3 = super.field1207.method528(78, arg1);
        if (super.field1207.field1320) {
            int[][] var4 = this.method498(arg1, 0, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class98.field1879; ++var11) {
                var8[var11] = -var7[var11] + 4096;
                var10[var11] = -var5[var11] + 4096;
                var9[var11] = 4096 - var6[var11];
            }
        }
        ++field120;
        if (!arg0) {
            field136 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lsd;Lsd;Lf;I)Lre;")
    public static final class158 method38(class166 arg0, class166 arg1, class47 arg2, int arg3) {
        ++field125;
        if (arg3 != -1) {
            field131 = -91;
        }
        int var4 = arg2.method363(arg0, 0);
        int var5 = arg2.method362(var4, arg1, -27);
        return class112.method825(var4, arg2, ~arg3, var5);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIBIZIIIII)Z")
    public static final boolean method39(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field119;
        for (int var12 = 0; ~var12 > -105; ++var12) {
            for (int var37 = 0; var37 < 104; ++var37) {
                class121.field2376[var12][var37] = 0;
                class189.field3616[var12][var37] = 99999999;
            }
        }
        class121.field2376[arg10][arg0] = 99;
        int var13 = arg10;
        int var14 = arg0;
        class189.field3616[arg10][arg0] = 0;
        byte var15 = 0;
        class189.field3589[var15] = arg10;
        int var38 = var15 + 1;
        class81.field1653[var15] = arg0;
        int var16 = class189.field3589.length;
        boolean var17 = false;
        int var18 = 0;
        int var19 = 84 % ((-41 - arg4) / 60);
        int[][] var20 = class46.field822[class165.field3130].field2748;
        while (~var38 != ~var18) {
            var14 = class81.field1653[var18];
            var13 = class189.field3589[var18];
            var18 = (var18 - -1) % var16;
            if (arg7 == var13 && ~arg5 == ~var14) {
                var17 = true;
                break;
            }
            if (~arg1 != -1) {
                if ((~arg1 > -6 || ~arg1 == -11) && class46.field822[class165.field3130].method963(arg1 + -1, 1, arg11, arg7, arg5, var14, var13)) {
                    var17 = true;
                    break;
                }
                if (~arg1 > -11 && class46.field822[class165.field3130].method971(var13, (byte) 91, arg7, var14, arg11, arg1 - 1, arg5)) {
                    var17 = true;
                    break;
                }
            }
            if (arg3 != 0 && ~arg2 != -1 && class46.field822[class165.field3130].method967(arg8, (byte) 3, arg5, arg2, var14, var13, arg3, arg7)) {
                var17 = true;
                break;
            }
            int var36 = class189.field3616[var13][var14] + 1;
            if (var13 > 0 && class121.field2376[var13 + -1][var14] == 0 && (19661064 & var20[var13 - 1][var14]) == 0) {
                class189.field3589[var38] = var13 + -1;
                class81.field1653[var38] = var14;
                var38 = (var38 + 1) % var16;
                class121.field2376[var13 + -1][var14] = 2;
                class189.field3616[var13 + -1][var14] = var36;
            }
            if (~var13 > -104 && ~class121.field2376[var13 + 1][var14] == -1 && ~(var20[var13 + 1][var14] & 19661184) == -1) {
                class189.field3589[var38] = var13 + 1;
                class81.field1653[var38] = var14;
                class121.field2376[var13 - -1][var14] = 8;
                class189.field3616[var13 - -1][var14] = var36;
                var38 = (var38 - -1) % var16;
            }
            if (var14 > 0 && class121.field2376[var13][var14 + -1] == 0 && ~(var20[var13][var14 - 1] & 19661058) == -1) {
                class189.field3589[var38] = var13;
                class81.field1653[var38] = var14 + -1;
                var38 = (var38 + 1) % var16;
                class121.field2376[var13][var14 + -1] = 1;
                class189.field3616[var13][var14 + -1] = var36;
            }
            if (~var14 > -104 && ~class121.field2376[var13][var14 - -1] == -1 && ~(19661088 & var20[var13][var14 + 1]) == -1) {
                class189.field3589[var38] = var13;
                class81.field1653[var38] = var14 + 1;
                class121.field2376[var13][var14 + 1] = 4;
                var38 = (var38 - -1) % var16;
                class189.field3616[var13][var14 + 1] = var36;
            }
            if (~var13 < -1 && ~var14 < -1 && ~class121.field2376[var13 - 1][var14 + -1] == -1 && (var20[var13 + -1][var14 + -1] & 19661070) == 0 && ~(var20[var13 + -1][var14] & 19661064) == -1 && ~(19661058 & var20[var13][var14 + -1]) == -1) {
                class189.field3589[var38] = var13 + -1;
                class81.field1653[var38] = var14 + -1;
                class121.field2376[var13 + -1][var14 + -1] = 3;
                var38 = (var38 - -1) % var16;
                class189.field3616[var13 + -1][var14 + -1] = var36;
            }
            if (var13 < 103 && var14 > 0 && class121.field2376[var13 + 1][var14 + -1] == 0 && ~(19661187 & var20[var13 - -1][var14 + -1]) == -1 && ~(var20[var13 + 1][var14] & 19661184) == -1 && (var20[var13][var14 + -1] & 19661058) == 0) {
                class189.field3589[var38] = var13 + 1;
                class81.field1653[var38] = var14 + -1;
                var38 = (var38 - -1) % var16;
                class121.field2376[var13 + 1][var14 + -1] = 9;
                class189.field3616[var13 + 1][var14 + -1] = var36;
            }
            if (~var13 < -1 && var14 < 103 && ~class121.field2376[var13 - 1][var14 - -1] == -1 && ~(19661112 & var20[var13 + -1][var14 + 1]) == -1 && (var20[var13 - 1][var14] & 19661064) == 0 && (19661088 & var20[var13][var14 + 1]) == 0) {
                class189.field3589[var38] = var13 + -1;
                class81.field1653[var38] = var14 - -1;
                class121.field2376[var13 + -1][var14 + 1] = 6;
                class189.field3616[var13 - 1][var14 + 1] = var36;
                var38 = (var38 + 1) % var16;
            }
            if (~var13 > -104 && ~var14 > -104 && class121.field2376[var13 - -1][var14 + 1] == 0 && (var20[var13 + 1][var14 + 1] & 19661280) == 0 && ~(19661184 & var20[var13 + 1][var14]) == -1 && ~(var20[var13][var14 - -1] & 19661088) == -1) {
                class189.field3589[var38] = var13 - -1;
                class81.field1653[var38] = var14 + 1;
                var38 = (var38 + 1) % var16;
                class121.field2376[var13 - -1][var14 + 1] = 12;
                class189.field3616[var13 - -1][var14 - -1] = var36;
            }
        }
        class203.field4002 = 0;
        if (!var17) {
            if (!arg6) {
                return false;
            }
            int var21 = 1000;
            byte var22 = 10;
            int var23 = 100;
            for (int var24 = -var22 + arg7; arg7 - -var22 >= var24; ++var24) {
                for (int var25 = arg5 - var22; ~(arg5 + var22) <= ~var25; ++var25) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && ~var25 > -105 && class189.field3616[var24][var25] < 100) {
                        int var26 = 0;
                        int var27 = 0;
                        if (~arg5 >= ~var25) {
                            if (~(arg5 - -arg2 + -1) > ~var25) {
                                var27 = -arg2 - arg5 - -1 + var25;
                            }
                        } else {
                            var27 = -var25 + arg5;
                        }
                        if (~arg7 < ~var24) {
                            var26 = -var24 + arg7;
                        } else if (~var24 < ~(arg3 + arg7 - 1)) {
                            var26 = -arg3 + -arg7 + var24 + 1;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (~var21 < ~var28 || var21 == var28 && ~class189.field3616[var24][var25] > ~var23) {
                            var21 = var28;
                            var13 = var24;
                            var14 = var25;
                            var23 = class189.field3616[var24][var25];
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg10 == var13 && arg0 == var14) {
                return false;
            }
            class203.field4002 = 1;
        }
        byte var29 = 0;
        class189.field3589[var29] = var13;
        int var39 = var29 + 1;
        class81.field1653[var29] = var14;
        int var30;
        int var31 = var30 = class121.field2376[var13][var14];
        while (arg10 != var13 || ~arg0 != ~var14) {
            if (var30 != var31) {
                var30 = var31;
                class189.field3589[var39] = var13;
                class81.field1653[var39++] = var14;
            }
            if ((2 & var31) == 0) {
                if (~(8 & var31) != -1) {
                    --var13;
                }
            } else {
                ++var13;
            }
            if (~(var31 & 1) == -1) {
                if (~(4 & var31) != -1) {
                    --var14;
                }
            } else {
                ++var14;
            }
            var31 = class121.field2376[var13][var14];
        }
        if (~var39 >= -1) {
            if (arg9 == 1) {
                return false;
            } else {
                return true;
            }
        } else {
            int var32 = var39--;
            int var33 = class81.field1653[var39];
            if (var32 > 25) {
                var32 = 25;
            }
            int var34 = class189.field3589[var39];
            if (arg9 == 0) {
                ++class154.field2973;
                class156.field2989.method705(193, (byte) 9);
                class156.field2989.method429(var32 + 3 + var32, (byte) 86);
            }
            if (arg9 == 1) {
                class156.field2989.method705(136, (byte) 9);
                class156.field2989.method429(var32 - -3 + var32 + 14, (byte) 93);
                ++class203.field4011;
            }
            if (arg9 == 2) {
                ++class31.field581;
                class156.field2989.method705(133, (byte) 9);
                class156.field2989.method429(var32 + var32 + 3, (byte) 104);
            }
            class156.field2989.method409((byte) -30, class170.field3279 + var34);
            class156.field2989.method404(!class195.field3859[82] ? 0 : 1, true);
            class156.field2989.method407((byte) -120, class147.field2901 + var33);
            class16.field276 = class189.field3589[0];
            class32.field595 = class81.field1653[0];
            for (int var35 = 1; ~var35 > ~var32; ++var35) {
                --var39;
                class156.field2989.method417(3604, class189.field3589[var39] + -var34);
                class156.field2989.method429(class81.field1653[var39] + -var33, (byte) 96);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)Z")
    public static final boolean method40(int arg0, int arg1) {
        ++field129;
        if (arg0 != -28168) {
            return false;
        } else {
            return ~((505423227 & arg1) >> 28) != -1;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lff;BI)V")
    public final void method41(class53 arg0, byte arg1, int arg2) {
        if (arg1 >= 18) {
            if (~arg2 == -1) {
                super.field1216 = ~arg0.method400(255) == -2;
            }
            ++field121;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)I")
    public static int method42(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "(I)V")
    public static void method43(int arg0) {
        field124 = null;
        field130 = null;
        field134 = null;
        field135 = null;
        field133 = null;
        if (arg0 != 1) {
            method40(8, 23);
        }
        field132 = null;
        field127 = null;
        field136 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILcb;BLje;)V")
    public static final void method44(int arg0, class22 arg1, byte arg2, class86 arg3) {
        if (arg2 < -66) {
            byte[] var4 = null;
            class165 var5 = class137.field2671;
            synchronized (class137.field2671) {
                for (class153 var6 = (class153) class137.field2671.method1109((byte) -87); var6 != null; var6 = (class153) class137.field2671.method1115((byte) 104)) {
                    if (~((long) arg0) == ~var6.field2541 && var6.field2948 == arg3 && var6.field2946 == 0) {
                        var4 = var6.field2953;
                        break;
                    }
                }
            }
            ++field126;
            if (var4 != null) {
                arg1.method149(3673, true, arg3, var4, arg0);
            } else {
                byte[] var7 = arg3.method689(arg0, 255);
                arg1.method149(3673, true, arg3, var7, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
    public class6() {
        super(1, false);
    }
}
