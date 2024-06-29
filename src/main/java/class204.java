import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class204 extends class243 {

    @OriginalMember(owner = "client!rg", name = "cb", descriptor = "[I")
    public static int[] field3477 = new int[100];

    @OriginalMember(owner = "client!rg", name = "kb", descriptor = "Lub;")
    public static class227 field3485 = class257.method1749(" )2> <col=00ffff>", 17263);

    @OriginalMember(owner = "client!rg", name = "Y", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!rg", name = "Z", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!rg", name = "ab", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!rg", name = "db", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!rg", name = "eb", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!rg", name = "fb", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!rg", name = "gb", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!rg", name = "hb", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!rg", name = "ib", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!rg", name = "jb", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!rg", name = "bb", descriptor = "[I")
    public static int[] field3476;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(II)Lub;")
    public static final class227 method1303(int arg0, int arg1) {
        ++field3481;
        return arg1 != 1 ? null : class249.method1667(10, arg0, false, arg1 + -106);
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(III)Z")
    public static final boolean method1304(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class115.field2108; ++var3) {
            class116 var4 = class122.field2203[var3];
            if (var4.field2138 == 1) {
                int var5 = var4.field2125 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field2124 * var5 >> 8) + var4.field2115;
                    int var7 = (var4.field2119 * var5 >> 8) + var4.field2123;
                    int var8 = (var4.field2120 * var5 >> 8) + var4.field2121;
                    int var9 = (var4.field2136 * var5 >> 8) + var4.field2141;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field2138 == 2) {
                int var10 = arg0 - var4.field2125;
                if (var10 > 0) {
                    int var11 = (var4.field2124 * var10 >> 8) + var4.field2115;
                    int var12 = (var4.field2119 * var10 >> 8) + var4.field2123;
                    int var13 = (var4.field2120 * var10 >> 8) + var4.field2121;
                    int var14 = (var4.field2136 * var10 >> 8) + var4.field2141;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field2138 == 3) {
                int var15 = var4.field2115 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field2127 * var15 >> 8) + var4.field2125;
                    int var17 = (var4.field2118 * var15 >> 8) + var4.field2116;
                    int var18 = (var4.field2120 * var15 >> 8) + var4.field2121;
                    int var19 = (var4.field2136 * var15 >> 8) + var4.field2141;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field2138 == 4) {
                int var20 = arg2 - var4.field2115;
                if (var20 > 0) {
                    int var21 = (var4.field2127 * var20 >> 8) + var4.field2125;
                    int var22 = (var4.field2118 * var20 >> 8) + var4.field2116;
                    int var23 = (var4.field2120 * var20 >> 8) + var4.field2121;
                    int var24 = (var4.field2136 * var20 >> 8) + var4.field2141;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field2138 == 5) {
                int var25 = arg1 - var4.field2121;
                if (var25 > 0) {
                    int var26 = (var4.field2127 * var25 >> 8) + var4.field2125;
                    int var27 = (var4.field2118 * var25 >> 8) + var4.field2116;
                    int var28 = (var4.field2124 * var25 >> 8) + var4.field2115;
                    int var29 = (var4.field2119 * var25 >> 8) + var4.field2123;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        ++field3484;
        int[][] var3 = super.field4213.method1406(arg1, 0);
        if (arg0 != 230) {
            this.method1307(59, 59, (byte) -90);
        }
        if (super.field4213.field3771) {
            int[] var4 = var3[1];
            int[] var5 = var3[2];
            int[] var6 = var3[0];
            for (int var7 = 0; class212.field3586 > var7; ++var7) {
                this.method1307(arg1, var7, (byte) 127);
                int[][] var8 = this.method1616(arg0 + -231, class241.field4193, 0);
                var6[var7] = var8[0][class221.field3745];
                var4[var7] = var8[1][class221.field3745];
                var5[var7] = var8[2][class221.field3745];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)[I")
    public final int[] method77(int arg0, int arg1) {
        int var3 = 85 % ((arg0 - -15) / 51);
        ++field3473;
        int[] var4 = super.field4215.method984(arg1, 0);
        if (super.field4215.field2707) {
            for (int var5 = 0; var5 < class212.field3586; ++var5) {
                this.method1307(arg1, var5, (byte) 99);
                int[] var6 = this.method1614(0, class241.field4193, 98);
                var4[var5] = var6[class221.field3745];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(II)Leg;")
    public static final class64 method1305(int arg0, int arg1) {
        ++field3479;
        class64 var2 = (class64) class168.field2806.method1735((long) arg1, (byte) -69);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class252.field4367.method884(arg1, arg0 + -95, arg0);
            class64 var4 = new class64();
            if (var3 != null) {
                var4.method408(new class226(var3), 0);
            }
            class168.field2806.method1730(var4, (long) arg1, (byte) -79);
            return var4;
        }
    }

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "(I)V")
    public static void method1306(int arg0) {
        field3485 = null;
        field3476 = null;
        if (arg0 != 28551) {
            field3485 = null;
        }
        field3477 = null;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
    public class204() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIB)V")
    private final void method1307(int arg0, int arg1, byte arg2) {
        ++field3475;
        int var4 = class212.field3585[arg1];
        int var5 = class148.field2582[arg0];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class221.field3745 = arg1;
            class241.field4193 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class221.field3745 = arg0;
            class241.field4193 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class221.field3745 = -arg0 + class212.field3586;
            class241.field4193 = arg1;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class241.field4193 = -arg0 + class193.field3280;
            class221.field3745 = arg1;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class241.field4193 = -arg0 + class193.field3280;
            class221.field3745 = -arg1 + class212.field3586;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class221.field3745 = -arg0 + class212.field3586;
            class241.field4193 = -arg1 + class193.field3280;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class221.field3745 = arg0;
            class241.field4193 = -arg1 + class193.field3280;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class221.field3745 = -arg1 + class212.field3586;
            class241.field4193 = arg0;
        }
        class241.field4193 &= class254.field4469;
        int var7 = -31 % ((arg2 - 39) / 56);
        class221.field3745 &= class179.field3062;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(IBI)V")
    public static final void method1308(int arg0, byte arg1, int arg2) {
        ++field3480;
        class139.field2416[arg0] = arg2;
        class94 var3 = (class94) class177.field2942.method1298(arg1 ^ -89, (long) arg0);
        if (arg1 != 45) {
            method1305(-102, 94);
        }
        if (var3 != null) {
            var3.field1640 = 500L + class12.method57(-117);
        } else {
            class94 var4 = new class94(class12.method57(-101) - -500L);
            class177.field2942.method1300(var4, (long) arg0, -2875);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIIIIIZIIII)Z")
    public static final boolean method1309(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11, int arg12) {
        for (int var13 = 0; ~var13 > -105; ++var13) {
            for (int var41 = 0; ~var41 > -105; ++var41) {
                class41.field674[var13][var41] = 0;
                class45.field777[var13][var41] = 99999999;
            }
        }
        class41.field674[arg12][arg4] = 99;
        class45.field777[arg12][arg4] = 0;
        byte var14 = 0;
        int var15 = arg4;
        ++field3474;
        int var16 = arg12;
        boolean var17 = false;
        class40.field659[var14] = arg12;
        int var42 = var14 + 1;
        class120.field2188[var14] = arg4;
        int var18 = 0;
        int[][] var19 = class78.field1370[class64.field1171].field2338;
        label368: while (~var42 != ~var18) {
            var15 = class120.field2188[var18];
            var16 = class40.field659[var18];
            var18 = 4095 & var18 + 1;
            if (arg9 == var16 && ~arg1 == ~var15) {
                var17 = true;
                break;
            }
            if (~arg0 != -1) {
                if ((~arg0 > -6 || arg0 == 10) && class78.field1370[class64.field1171].method831(arg7, 127, arg9, arg1, arg10, var16, var15, arg0 + -1)) {
                    var17 = true;
                    break;
                }
                if (~arg0 > -11 && class78.field1370[class64.field1171].method818(var16, arg9, arg7, arg10, var15, arg0 + -1, arg1, (byte) -77)) {
                    var17 = true;
                    break;
                }
            }
            if (~arg2 != -1 && ~arg3 != -1 && class78.field1370[class64.field1171].method825(arg5, var16, var15, arg9, 0, arg1, arg2, arg10, arg3)) {
                var17 = true;
                break;
            }
            int var32 = class45.field777[var16][var15] + 1;
            if (var16 > 0 && class41.field674[var16 + -1][var15] == 0 && (19661070 & var19[var16 + -1][var15]) == 0 && (var19[var16 + -1][arg10 + var15 + -1] & 19661112) == 0) {
                int var33 = 1;
                while (true) {
                    if (~var33 <= ~(arg10 - 1)) {
                        class40.field659[var42] = var16 + -1;
                        class120.field2188[var42] = var15;
                        class41.field674[var16 - 1][var15] = 2;
                        class45.field777[var16 + -1][var15] = var32;
                        var42 = 4095 & var42 + 1;
                        break;
                    }
                    if (~(19661118 & var19[var16 + -1][var15 - -var33]) != -1) {
                        break;
                    }
                    ++var33;
                }
            }
            if (~var16 > -103 && ~class41.field674[var16 + 1][var15] == -1 && (19661187 & var19[var16 - -arg10][var15]) == 0 && (var19[var16 - -arg10][var15 + -1 + arg10] & 19661280) == 0) {
                int var34 = 1;
                while (true) {
                    if (arg10 - 1 <= var34) {
                        class40.field659[var42] = var16 + 1;
                        class120.field2188[var42] = var15;
                        class41.field674[var16 + 1][var15] = 8;
                        var42 = var42 + 1 & 4095;
                        class45.field777[var16 + 1][var15] = var32;
                        break;
                    }
                    if ((19661283 & var19[var16 - -arg10][var15 + var34]) != 0) {
                        break;
                    }
                    ++var34;
                }
            }
            if (var15 > 0 && ~class41.field674[var16][var15 - 1] == -1 && (var19[var16][var15 + -1] & 19661070) == 0 && (19661187 & var19[arg10 + var16 + -1][var15 + -1]) == 0) {
                int var35 = 1;
                while (true) {
                    if (~(arg10 - 1) >= ~var35) {
                        class40.field659[var42] = var16;
                        class120.field2188[var42] = var15 + -1;
                        class41.field674[var16][var15 + -1] = 1;
                        class45.field777[var16][var15 - 1] = var32;
                        var42 = 4095 & var42 + 1;
                        break;
                    }
                    if ((var19[var16 + var35][var15 + -1] & 19661199) != 0) {
                        break;
                    }
                    ++var35;
                }
            }
            if (var15 < 102 && class41.field674[var16][var15 + 1] == 0 && ~(19661112 & var19[var16][var15 - -arg10]) == -1 && ~(19661280 & var19[var16 + -1 + arg10][arg10 + var15]) == -1) {
                int var36 = 1;
                while (true) {
                    if (arg10 - 1 <= var36) {
                        class40.field659[var42] = var16;
                        class120.field2188[var42] = var15 + 1;
                        var42 = var42 + 1 & 4095;
                        class41.field674[var16][var15 + 1] = 4;
                        class45.field777[var16][var15 - -1] = var32;
                        break;
                    }
                    if ((19661304 & var19[var16 + var36][var15 - -arg10]) != 0) {
                        break;
                    }
                    ++var36;
                }
            }
            if (var16 > 0 && var15 > 0 && class41.field674[var16 - 1][var15 + -1] == 0 && (var19[var16 - 1][arg10 + -1 + var15 + -1] & 19661112) == 0 && (19661070 & var19[var16 - 1][var15 + -1]) == 0 && ~(var19[arg10 + -1 + -1 + var16][var15 + -1] & 19661187) == -1) {
                int var37 = 1;
                while (true) {
                    if (var37 >= arg10 + -1) {
                        class40.field659[var42] = var16 - 1;
                        class120.field2188[var42] = var15 + -1;
                        var42 = 4095 & var42 - -1;
                        class41.field674[var16 + -1][var15 + -1] = 3;
                        class45.field777[var16 + -1][var15 + -1] = var32;
                        break;
                    }
                    if ((19661118 & var19[var16 + -1][-1 - -var37 + var15]) != 0 || ~(19661199 & var19[var16 + -1 - -var37][var15 + -1]) != -1) {
                        break;
                    }
                    ++var37;
                }
            }
            if (~var16 > -103 && var15 > 0 && class41.field674[var16 + 1][var15 + -1] == 0 && ~(var19[var16 + 1][var15 + -1] & 19661070) == -1 && ~(19661187 & var19[arg10 + var16][var15 - 1]) == -1 && ~(19661280 & var19[arg10 + var16][arg10 + -1 + -1 + var15]) == -1) {
                int var38 = 1;
                while (true) {
                    if (arg10 + -1 <= var38) {
                        class40.field659[var42] = var16 + 1;
                        class120.field2188[var42] = var15 + -1;
                        class41.field674[var16 - -1][var15 - 1] = 9;
                        class45.field777[var16 - -1][var15 + -1] = var32;
                        var42 = var42 + 1 & 4095;
                        break;
                    }
                    if (~(19661283 & var19[arg10 + var16][var15 - 1 + var38]) != -1 || ~(19661199 & var19[var16 + var38 - -1][var15 + -1]) != -1) {
                        break;
                    }
                    ++var38;
                }
            }
            if (var16 > 0 && var15 < 102 && class41.field674[var16 + -1][var15 + 1] == 0 && ~(19661070 & var19[var16 + -1][var15 - -1]) == -1 && ~(var19[var16 - 1][arg10 + var15] & 19661112) == -1 && (19661280 & var19[var16][var15 - -arg10]) == 0) {
                int var39 = 1;
                while (true) {
                    if (var39 >= arg10 + -1) {
                        class40.field659[var42] = var16 + -1;
                        class120.field2188[var42] = var15 + 1;
                        class41.field674[var16 + -1][var15 - -1] = 6;
                        class45.field777[var16 + -1][var15 + 1] = var32;
                        var42 = var42 + 1 & 4095;
                        break;
                    }
                    if (~(var19[var16 + -1][var15 - (-1 - var39)] & 19661118) != -1 || ~(19661304 & var19[var16 + var39 + -1][arg10 + var15]) != -1) {
                        break;
                    }
                    ++var39;
                }
            }
            if (~var16 > -103 && var15 < 102 && class41.field674[var16 + 1][var15 + 1] == 0 && ~(19661112 & var19[var16 - -1][var15 - -arg10]) == -1 && ~(19661280 & var19[arg10 + var16][arg10 + var15]) == -1 && (19661187 & var19[arg10 + var16][var15 + 1]) == 0) {
                for (int var40 = 1; ~(arg10 - 1) < ~var40; ++var40) {
                    if (~(19661304 & var19[var40 + 1 + var16][arg10 + var15]) != -1 || (19661283 & var19[var16 - -arg10][var15 + 1 + var40]) != 0) {
                        continue label368;
                    }
                }
                class40.field659[var42] = var16 + 1;
                class120.field2188[var42] = var15 + 1;
                class41.field674[var16 + 1][var15 + 1] = 12;
                class45.field777[var16 + 1][var15 - -1] = var32;
                var42 = 4095 & var42 - -1;
            }
        }
        class193.field3295 = 0;
        if (!var17) {
            if (!arg8) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = -var22 + arg9; arg9 + var22 >= var23; ++var23) {
                for (int var24 = -var22 + arg1; var24 <= arg1 - -var22; ++var24) {
                    if (~var23 <= -1 && var24 >= 0 && var23 < 104 && ~var24 > -105 && ~class45.field777[var23][var24] > -101) {
                        int var25 = 0;
                        if (arg1 <= var24) {
                            if (~(arg1 + arg3 - 1) > ~var24) {
                                var25 = -arg1 + -arg3 + 1 + var24;
                            }
                        } else {
                            var25 = arg1 - var24;
                        }
                        int var26 = 0;
                        if (arg9 > var23) {
                            var26 = -var23 + arg9;
                        } else if (var23 > arg2 + -1 + arg9) {
                            var26 = var23 - (arg9 + -1 + arg2);
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (~var20 < ~var27 || ~var20 == ~var27 && var21 > class45.field777[var23][var24]) {
                            var15 = var24;
                            var20 = var27;
                            var21 = class45.field777[var23][var24];
                            var16 = var23;
                        }
                    }
                }
            }
            if (~var20 == -1001) {
                return false;
            }
            if (~arg12 == ~var16 && arg4 == var15) {
                return false;
            }
            class193.field3295 = 1;
        }
        byte var28 = 0;
        class40.field659[var28] = var16;
        int var43 = var28 + 1;
        class120.field2188[var28] = var15;
        int var29;
        int var30 = var29 = class41.field674[var16][var15];
        while (~arg12 != ~var16 || arg4 != var15) {
            if (var29 != var30) {
                var29 = var30;
                class40.field659[var43] = var16;
                class120.field2188[var43++] = var15;
            }
            if ((var30 & 2) != 0) {
                ++var16;
            } else if ((var30 & 8) != 0) {
                --var16;
            }
            if ((1 & var30) == 0) {
                if ((var30 & 4) != 0) {
                    --var15;
                }
            } else {
                ++var15;
            }
            var30 = class41.field674[var16][var15];
        }
        if (~var43 < -1) {
            class252.method1681(1, arg11, var43);
            return true;
        } else {
            int var31 = 112 / ((-48 - arg6) / 50);
            if (~arg11 == -2) {
                return false;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(IB)I")
    public static final int method1310(int arg0, byte arg1) {
        ++field3478;
        int var2 = 64 / ((80 - arg1) / 40);
        return (1028101 & arg0) >> 17;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        ++field3483;
        if (~arg2 == -1) {
            super.field4230 = arg0.method1471(255) == 1;
        }
        if (arg1) {
            field3477 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(III)I")
    public static final int method1311(int arg0, int arg1, int arg2) {
        int var3 = arg0;
        ++field3482;
        while (~arg2 < -2) {
            if ((1 & arg2) != 0) {
                var3 = arg1 * var3;
            }
            arg1 *= arg1;
            arg2 >>= 1;
        }
        if (~arg2 == -2) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }
}
