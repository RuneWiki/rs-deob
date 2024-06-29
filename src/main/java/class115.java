import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class115 extends class212 {

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
    private final int field2153;

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "I")
    private final int field2151;

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
    private final int field2152;

    @OriginalMember(owner = "client!hh", name = "D", descriptor = "I")
    private final int field2161;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "Loh;")
    public static class263 field2147 = class253.method1681(-117, "details");

    @OriginalMember(owner = "client!hh", name = "C", descriptor = "I")
    public static int field2160 = 0;

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "[I")
    public static int[] field2155 = new int[100];

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "Loh;")
    public static class263 field2156 = class253.method1681(-124, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "I")
    public static int field2154;

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!hh", name = "B", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIZ)V")
    public final void method531(int arg0, int arg1, boolean arg2) {
        ++field2150;
        int var4 = this.field2151 * arg1 >> 12;
        int var5 = this.field2153 * arg1 >> 12;
        int var6 = this.field2161 * arg0 >> 12;
        if (!arg2) {
            this.method531(-7, -56, true);
        }
        int var7 = this.field2152 * arg0 >> 12;
        class40.method252(var7, var6, var5, var4, (byte) 124, super.field3793);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZIIIIIIIIIII)Z")
    public static final boolean method753(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if (arg6 != -1) {
            field2156 = null;
        }
        for (int var12 = 0; ~var12 > -105; ++var12) {
            for (int var31 = 0; var31 < 104; ++var31) {
                class176.field3173[var12][var31] = 0;
                class178.field3266[var12][var31] = 99999999;
            }
        }
        ++field2148;
        class176.field3173[arg7][arg3] = 99;
        class178.field3266[arg7][arg3] = 0;
        byte var13 = 0;
        int var14 = 0;
        int var15 = arg3;
        int var16 = arg7;
        class251.field4364[var13] = arg7;
        boolean var17 = false;
        int var32 = var13 + 1;
        class212.field3789[var13] = arg3;
        int[][] var18 = class103.field1954[class12.field321].field1527;
        while (var32 != var14) {
            var16 = class251.field4364[var14];
            var15 = class212.field3789[var14];
            var14 = 4095 & var14 + 1;
            if (~arg10 == ~var16 && ~arg1 == ~var15) {
                var17 = true;
                break;
            }
            if (arg11 != 0) {
                if ((arg11 < 5 || ~arg11 == -11) && class103.field1954[class12.field321].method483(arg10, 1, var16, arg1, arg2, 65536, arg11 + -1, var15)) {
                    var17 = true;
                    break;
                }
                if (arg11 < 10 && class103.field1954[class12.field321].method485(var16, 1, arg10, arg11 + -1, arg2, arg1, -117, var15)) {
                    var17 = true;
                    break;
                }
            }
            if (~arg8 != -1 && ~arg9 != -1 && class103.field1954[class12.field321].method486(var15, 1, arg8, arg9, arg1, arg5, var16, arg10, (byte) 120)) {
                var17 = true;
                break;
            }
            int var30 = class178.field3266[var16][var15] + 1;
            if (var16 > 0 && ~class176.field3173[var16 + -1][var15] == -1 && (19661064 & var18[var16 + -1][var15]) == 0) {
                class251.field4364[var32] = var16 + -1;
                class212.field3789[var32] = var15;
                class176.field3173[var16 + -1][var15] = 2;
                var32 = var32 - -1 & 4095;
                class178.field3266[var16 + -1][var15] = var30;
            }
            if (~var16 > -104 && class176.field3173[var16 + 1][var15] == 0 && (var18[var16 - -1][var15] & 19661184) == 0) {
                class251.field4364[var32] = var16 + 1;
                class212.field3789[var32] = var15;
                var32 = var32 + 1 & 4095;
                class176.field3173[var16 + 1][var15] = 8;
                class178.field3266[var16 - -1][var15] = var30;
            }
            if (var15 > 0 && class176.field3173[var16][var15 - 1] == 0 && (19661058 & var18[var16][var15 - 1]) == 0) {
                class251.field4364[var32] = var16;
                class212.field3789[var32] = var15 + -1;
                var32 = 4095 & var32 - -1;
                class176.field3173[var16][var15 + -1] = 1;
                class178.field3266[var16][var15 + -1] = var30;
            }
            if (~var15 > -104 && ~class176.field3173[var16][var15 + 1] == -1 && (19661088 & var18[var16][var15 + 1]) == 0) {
                class251.field4364[var32] = var16;
                class212.field3789[var32] = var15 + 1;
                var32 = 4095 & var32 + 1;
                class176.field3173[var16][var15 + 1] = 4;
                class178.field3266[var16][var15 + 1] = var30;
            }
            if (var16 > 0 && var15 > 0 && class176.field3173[var16 - 1][var15 - 1] == 0 && (var18[var16 + -1][var15 + -1] & 19661070) == 0 && ~(19661064 & var18[var16 + -1][var15]) == -1 && ~(var18[var16][var15 + -1] & 19661058) == -1) {
                class251.field4364[var32] = var16 + -1;
                class212.field3789[var32] = var15 - 1;
                var32 = 4095 & var32 + 1;
                class176.field3173[var16 + -1][var15 + -1] = 3;
                class178.field3266[var16 + -1][var15 + -1] = var30;
            }
            if (var16 < 103 && ~var15 < -1 && ~class176.field3173[var16 + 1][var15 - 1] == -1 && ~(19661187 & var18[var16 + 1][var15 + -1]) == -1 && ~(19661184 & var18[var16 + 1][var15]) == -1 && ~(var18[var16][var15 - 1] & 19661058) == -1) {
                class251.field4364[var32] = var16 - -1;
                class212.field3789[var32] = var15 + -1;
                var32 = var32 + 1 & 4095;
                class176.field3173[var16 + 1][var15 + -1] = 9;
                class178.field3266[var16 + 1][var15 - 1] = var30;
            }
            if (var16 > 0 && var15 < 103 && class176.field3173[var16 + -1][var15 + 1] == 0 && ~(var18[var16 + -1][var15 + 1] & 19661112) == -1 && ~(19661064 & var18[var16 - 1][var15]) == -1 && (var18[var16][var15 + 1] & 19661088) == 0) {
                class251.field4364[var32] = var16 + -1;
                class212.field3789[var32] = var15 + 1;
                class176.field3173[var16 + -1][var15 + 1] = 6;
                class178.field3266[var16 + -1][var15 + 1] = var30;
                var32 = 4095 & var32 + 1;
            }
            if (~var16 > -104 && var15 < 103 && class176.field3173[var16 + 1][var15 + 1] == 0 && ~(19661280 & var18[var16 + 1][var15 + 1]) == -1 && (var18[var16 + 1][var15] & 19661184) == 0 && (19661088 & var18[var16][var15 + 1]) == 0) {
                class251.field4364[var32] = var16 + 1;
                class212.field3789[var32] = var15 - -1;
                class176.field3173[var16 - -1][var15 + 1] = 12;
                var32 = var32 - -1 & 4095;
                class178.field3266[var16 - -1][var15 + 1] = var30;
            }
        }
        class209.field3774 = 0;
        if (!var17) {
            if (!arg0) {
                return false;
            }
            int var19 = 100;
            int var20 = 1000;
            byte var21 = 10;
            for (int var22 = arg10 - var21; ~var22 >= ~(arg10 + var21); ++var22) {
                for (int var23 = arg1 - var21; ~var23 >= ~(arg1 + var21); ++var23) {
                    if (var22 >= 0 && ~var23 <= -1 && ~var22 > -105 && ~var23 > -105 && class178.field3266[var22][var23] < 100) {
                        int var24 = 0;
                        int var25 = 0;
                        if (~var23 <= ~arg1) {
                            if (~(arg1 + -1 + arg9) > ~var23) {
                                var25 = -arg9 - arg1 - (-1 - var23);
                            }
                        } else {
                            var25 = -var23 + arg1;
                        }
                        if (~arg10 < ~var22) {
                            var24 = arg10 - var22;
                        } else if (arg10 + -1 - -arg8 < var22) {
                            var24 = var22 - arg10 - (arg8 + -1);
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (~var26 > ~var20 || var20 == var26 && ~class178.field3266[var22][var23] > ~var19) {
                            var19 = class178.field3266[var22][var23];
                            var16 = var22;
                            var20 = var26;
                            var15 = var23;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (~arg7 == ~var16 && arg3 == var15) {
                return false;
            }
            class209.field3774 = 1;
        }
        byte var27 = 0;
        class251.field4364[var27] = var16;
        int var33 = var27 + 1;
        class212.field3789[var27] = var15;
        int var28;
        int var29 = var28 = class176.field3173[var16][var15];
        while (arg7 != var16 || arg3 != var15) {
            if (~var28 != ~var29) {
                class251.field4364[var33] = var16;
                var28 = var29;
                class212.field3789[var33++] = var15;
            }
            if (~(var29 & 2) == -1) {
                if (~(8 & var29) != -1) {
                    --var16;
                }
            } else {
                ++var16;
            }
            if (~(var29 & 1) == -1) {
                if (~(var29 & 4) != -1) {
                    --var15;
                }
            } else {
                ++var15;
            }
            var29 = class176.field3173[var16][var15];
        }
        if (var33 > 0) {
            class269.method1818(-116, var33, arg4);
            return true;
        } else if (arg4 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BII)V")
    public final void method528(byte arg0, int arg1, int arg2) {
        ++field2158;
        int var4 = -102 % ((arg0 - -6) / 53);
        int var5 = this.field2161 * arg2 >> 12;
        int var6 = this.field2152 * arg2 >> 12;
        int var7 = this.field2151 * arg1 >> 12;
        int var8 = this.field2153 * arg1 >> 12;
        class251.method1674(var6, var8, super.field3784, super.field3793, var5, -73, var7, super.field3788);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZIIIIIIII)V")
    public static final void method754(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field2149;
        class173 var10 = null;
        for (class173 var11 = (class173) class189.field3408.method1878(arg1); var11 != null; var11 = (class173) class189.field3408.method1881(-27)) {
            if (~var11.field3151 == ~arg5 && ~var11.field3149 == ~arg7 && ~var11.field3140 == ~arg3 && var11.field3153 == arg4) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class173();
            var10.field3140 = arg3;
            var10.field3153 = arg4;
            var10.field3151 = arg5;
            var10.field3149 = arg7;
            class191.method1254((byte) -91, var10);
            class189.field3408.method1883(var10, (byte) -3);
        }
        var10.field3145 = arg6;
        var10.field3142 = arg0;
        var10.field3137 = arg8;
        var10.field3147 = arg9;
        var10.field3144 = arg2;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lue;B)I")
    public static final int method755(class86 arg0, byte arg1) {
        ++field2154;
        int var2 = 0;
        if (arg0.method602(class50.field1078, 0)) {
            ++var2;
        }
        if (arg0.method602(class75.field1557, 0)) {
            ++var2;
        }
        if (arg0.method602(class169.field3103, 0)) {
            ++var2;
        }
        if (arg1 <= 102) {
            field2160 = 95;
        }
        if (arg0.method602(class15.field366, 0)) {
            ++var2;
        }
        if (arg0.method602(class136.field2494, 0)) {
            ++var2;
        }
        if (arg0.method602(class91.field1788, 0)) {
            ++var2;
        }
        if (arg0.method602(class189.field3409, 0)) {
            ++var2;
        }
        if (arg0.method602(class128.field2379, 0)) {
            ++var2;
        }
        if (arg0.method602(class207.field3747, 0)) {
            ++var2;
        }
        if (arg0.method602(class185.field3341, 0)) {
            ++var2;
        }
        if (arg0.method602(class156.field2810, 0)) {
            ++var2;
        }
        if (arg0.method602(class103.field1952, 0)) {
            ++var2;
        }
        if (arg0.method602(class90.field1782, 0)) {
            ++var2;
        }
        if (arg0.method602(class269.field4744, 0)) {
            ++var2;
        }
        if (arg0.method602(class24.field690, 0)) {
            ++var2;
        }
        if (arg0.method602(class119.field2212, 0)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lue;I)V")
    public static final void method756(class86 arg0, int arg1) {
        if (arg1 != -616) {
            field2160 = -49;
        }
        class81.field1609 = arg0;
        class118.field2199 = class81.field1609.method587((byte) 115, 4);
        ++field2159;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(IIIIIII)V")
    public class115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field2153 = arg3;
        this.field2151 = arg1;
        this.field2152 = arg0;
        this.field2161 = arg2;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)V")
    public final void method522(int arg0, int arg1, int arg2) {
        ++field2157;
        int var4 = this.field2152 * arg2 >> 12;
        int var5 = this.field2161 * arg2 >> 12;
        if (arg1 >= -18) {
            field2147 = null;
        }
        int var6 = this.field2153 * arg0 >> 12;
        int var7 = this.field2151 * arg0 >> 12;
        class114.method750(var7, (byte) -113, var5, var6, super.field3784, var4, super.field3788);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)Lf;")
    public static final class36 method757(int arg0, int arg1) {
        if (arg0 != 1) {
            method754(88, false, 40, -76, -37, -17, -117, 56, 48, -42);
        }
        ++field2146;
        class36 var2 = (class36) class151.field2724.method1464((byte) 41, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class160.field2921.method596(21, class148.method971(arg0 + -16794, arg1), class269.method1817(arg1, -92));
            class36 var4 = new class36();
            if (var3 != null) {
                var4.method228(0, new class194(var3));
            }
            class151.field2724.method1472((byte) -29, (long) arg1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public static void method758(byte arg0) {
        field2147 = null;
        field2156 = null;
        if (arg0 <= 118) {
            method758((byte) -13);
        }
        field2155 = null;
    }
}
