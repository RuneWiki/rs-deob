import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class243 extends class34 {

    @OriginalMember(owner = "client!rn", name = "C", descriptor = "I")
    private int field3331 = 409;

    @OriginalMember(owner = "client!rn", name = "F", descriptor = "I")
    private int field3334 = 4096;

    @OriginalMember(owner = "client!rn", name = "J", descriptor = "I")
    private int field3338 = 4096;

    @OriginalMember(owner = "client!rn", name = "L", descriptor = "I")
    private int field3340 = 4096;

    @OriginalMember(owner = "client!rn", name = "I", descriptor = "[I")
    private int[] field3337 = new int[3];

    @OriginalMember(owner = "client!rn", name = "E", descriptor = "Lhi;")
    public static class45 field3333 = new class45(70, 8);

    @OriginalMember(owner = "client!rn", name = "M", descriptor = "S")
    public static short field3341 = 205;

    @OriginalMember(owner = "client!rn", name = "D", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!rn", name = "G", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!rn", name = "H", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!rn", name = "K", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IZI)V", line = 4)
    public static final void method1471(int arg0, boolean arg1, int arg2) {
        ++field3339;
        if (!arg1) {
            method1472(-9, -76, 65, -119, -74, -45, -43, -19, -109, (class466) null, -10, 108);
        }
        class314 var3 = class177.method1213(false, 13, arg2);
        var3.method1808(-7412);
        var3.field4253 = arg0;
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V", line = 197)
    public class243() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BI)[[I", line = 25)
    public final int[][] method66(byte arg0, int arg1) {
        ++field3335;
        int[][] var3 = super.field536.method337(arg1, (byte) 75);
        if (arg0 != -11) {
            return null;
        } else {
            if (super.field536.field726) {
                int[][] var4 = this.method254(arg0 ^ -11, 0, arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class383.field5502 > var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = -this.field3337[0] + var12;
                    if (~var13 > -1) {
                        var13 = -var13;
                    }
                    if (this.field3331 < var13) {
                        var8[var11] = var12;
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    } else {
                        int var14 = var6[var11];
                        int var15 = -this.field3337[1] + var14;
                        if (var15 < 0) {
                            var15 = -var15;
                        }
                        if (var15 > this.field3331) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var7[var11];
                        } else {
                            int var16 = var7[var11];
                            int var17 = -this.field3337[2] + var16;
                            if (var17 < 0) {
                                var17 = -var17;
                            }
                            if (this.field3331 < var17) {
                                var8[var11] = var12;
                                var9[var11] = var14;
                                var10[var11] = var16;
                            } else {
                                var8[var11] = this.field3338 * var12 >> 12;
                                var9[var11] = this.field3340 * var14 >> 12;
                                var10[var11] = this.field3334 * var16 >> 12;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lsv;II)V", line = 119)
    public final void method69(class319 arg0, int arg1, int arg2) {
        if (arg1 <= 16) {
            field3341 = -112;
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 == -5) {
                            int var5 = arg0.method1852(1086280488);
                            this.field3337[1] = class375.method2245(var5, 65280) >> 4;
                            this.field3337[2] = class375.method2245(255, var5) >> 12;
                            this.field3337[0] = class375.method2245(var5, 16711680) << 4;
                        }
                    } else {
                        this.field3338 = arg0.method1844(-114);
                    }
                } else {
                    this.field3340 = arg0.method1844(-118);
                }
            } else {
                this.field3334 = arg0.method1844(-123);
            }
        } else {
            this.field3331 = arg0.method1844(-109);
        }
        ++field3336;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIIIIIIILet;II)Z", line = 200)
    public static final boolean method1472(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class466 arg9, int arg10, int arg11) {
        ++field3332;
        int var12 = arg1;
        int var13 = arg0;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = -var14 + arg1;
        class338.field4911[var14][var15] = 99;
        int var17 = -var15 + arg0;
        class75.field1059[var14][var15] = 0;
        byte var18 = 0;
        class126.field1966[var18] = arg1;
        int var19 = 0;
        int var35 = var18 + 1;
        class3.field37[var18] = arg0;
        if (arg11 != -1) {
            field3341 = -75;
        }
        int[][] var20 = arg9.field6737;
        while (true) {
            label286: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label263: do {
                                if (~var35 == ~var19) {
                                    class211.field3012 = var13;
                                    class32.field490 = var12;
                                    return false;
                                }
                                var12 = class126.field1966[var19];
                                var13 = class3.field37[var19];
                                var21 = -var17 + var13;
                                var19 = 4095 & var19 - -1;
                                var22 = -var16 + var12;
                                var23 = -arg9.field6745 + var12;
                                var24 = -arg9.field6739 + var13;
                                if (arg8 != -4) {
                                    if (~arg8 != 2) {
                                        if (~arg8 != 1) {
                                            if (arg8 != -1) {
                                                if (~arg8 != -1 && arg8 != 1 && ~arg8 != -3 && arg8 != 3 && arg8 != 9) {
                                                    if (arg9.method2704(arg5, arg2, arg8, var12, arg6, arg3, var13, (byte) -115)) {
                                                        class32.field490 = var12;
                                                        class211.field3012 = var13;
                                                        return true;
                                                    }
                                                } else if (arg9.method2707(arg5, var13, arg2, arg6, var12, arg8, arg3, -2)) {
                                                    class32.field490 = var12;
                                                    class211.field3012 = var13;
                                                    return true;
                                                }
                                            } else if (arg9.method2712(arg3, var12, arg5, 126, var13, arg10, arg4, arg6, arg7)) {
                                                class32.field490 = var12;
                                                class211.field3012 = var13;
                                                return true;
                                            }
                                        } else if (arg9.method2705(var13, arg5, arg6, 58, var12, arg10, arg7, arg3, arg6, arg4)) {
                                            class211.field3012 = var13;
                                            class32.field490 = var12;
                                            return true;
                                        }
                                    } else if (class247.method1479(arg6, arg5, arg4, var12, true, arg6, arg3, arg7, var13)) {
                                        class32.field490 = var12;
                                        class211.field3012 = var13;
                                        return true;
                                    }
                                } else if (arg3 == var12 && arg5 == var13) {
                                    class32.field490 = var12;
                                    class211.field3012 = var13;
                                    return true;
                                }
                                var26 = class75.field1059[var22][var21] - -1;
                                if (~var22 < -1 && ~class338.field4911[var22 + -1][var21] == -1 && (var20[var23 + -1][var24] & 1134821376) == 0 && ~(1310982144 & var20[var23 + -1][arg6 + var24 + -1]) == -1) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= arg6 + -1) {
                                            class126.field1966[var35] = var12 + -1;
                                            class3.field37[var35] = var13;
                                            var35 = var35 + 1 & 4095;
                                            class338.field4911[var22 + -1][var21] = 2;
                                            class75.field1059[var22 + -1][var21] = var26;
                                            break;
                                        }
                                        if ((1336147968 & var20[var23 + -1][var24 + var27]) != 0) {
                                            break;
                                        }
                                        ++var27;
                                    }
                                }
                                if (~var22 > ~(-arg6 + 128) && class338.field4911[var22 - -1][var21] == 0 && (1625554944 & var20[arg6 + var23][var24]) == 0 && ~(var20[arg6 + var23][arg6 + -1 + var24] & 2015625216) == -1) {
                                    int var28 = 1;
                                    while (true) {
                                        if (arg6 + -1 <= var28) {
                                            class126.field1966[var35] = var12 + 1;
                                            class3.field37[var35] = var13;
                                            var35 = 4095 & var35 - -1;
                                            class338.field4911[var22 - -1][var21] = 8;
                                            class75.field1059[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[arg6 + var23][var24 + var28] & 2028208128) != 0) {
                                            break;
                                        }
                                        ++var28;
                                    }
                                }
                                if (~var21 < -1 && class338.field4911[var22][var21 + -1] == 0 && (var20[var23][var24 + -1] & 1134821376) == 0 && (var20[var23 - -arg6 + -1][var24 - 1] & 1625554944) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= arg6 + -1) {
                                            class126.field1966[var35] = var12;
                                            class3.field37[var35] = var13 + -1;
                                            var35 = 4095 & var35 + 1;
                                            class338.field4911[var22][var21 + -1] = 1;
                                            class75.field1059[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if (~(var20[var23 + var29][var24 + -1] & 1675886592) != -1) {
                                            break;
                                        }
                                        ++var29;
                                    }
                                }
                                if (~var21 > ~(-arg6 + 128) && class338.field4911[var22][var21 + 1] == 0 && (1310982144 & var20[var23][var24 - -arg6]) == 0 && ~(var20[var23 - -arg6 + -1][arg6 + var24] & 2015625216) == -1) {
                                    int var30 = 1;
                                    while (true) {
                                        if (arg6 - 1 <= var30) {
                                            class126.field1966[var35] = var12;
                                            class3.field37[var35] = var13 + 1;
                                            var35 = var35 + 1 & 4095;
                                            class338.field4911[var22][var21 + 1] = 4;
                                            class75.field1059[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if (~(var20[var23 - -var30][arg6 + var24] & 2116288512) != -1) {
                                            break;
                                        }
                                        ++var30;
                                    }
                                }
                                if (~var22 < -1 && ~var21 < -1 && ~class338.field4911[var22 + -1][var21 - 1] == -1 && (1134821376 & var20[var23 - 1][var24 + -1]) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg6 <= var31) {
                                            class126.field1966[var35] = var12 + -1;
                                            class3.field37[var35] = var13 + -1;
                                            class338.field4911[var22 - 1][var21 + -1] = 3;
                                            var35 = var35 - -1 & 4095;
                                            class75.field1059[var22 + -1][var21 + -1] = var26;
                                            break;
                                        }
                                        if (~(1336147968 & var20[var23 - 1][var24 + -1 + var31]) != -1 || ~(1675886592 & var20[var23 + var31 + -1][var24 - 1]) != -1) {
                                            break;
                                        }
                                        ++var31;
                                    }
                                }
                                if (var22 < -arg6 + 128 && ~var21 < -1 && ~class338.field4911[var22 + 1][var21 - 1] == -1 && (var20[arg6 + var23][var24 + -1] & 1625554944) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (~var32 <= ~arg6) {
                                            class126.field1966[var35] = var12 + 1;
                                            class3.field37[var35] = var13 + -1;
                                            class338.field4911[var22 - -1][var21 + -1] = 9;
                                            var35 = 4095 & var35 + 1;
                                            class75.field1059[var22 + 1][var21 + -1] = var26;
                                            break;
                                        }
                                        if ((var20[arg6 + var23][var24 + -1 + var32] & 2028208128) != 0 || (var20[var23 + var32][var24 - 1] & 1675886592) != 0) {
                                            break;
                                        }
                                        ++var32;
                                    }
                                }
                                if (var22 > 0 && ~var21 > ~(-arg6 + 128) && class338.field4911[var22 + -1][var21 + 1] == 0 && (1310982144 & var20[var23 - 1][arg6 + var24]) == 0) {
                                    for (int var33 = 1; var33 < arg6; ++var33) {
                                        if ((var20[var23 + -1][var24 - -var33] & 1336147968) != 0 || ~(var20[var23 + -1 + var33][arg6 + var24] & 2116288512) != -1) {
                                            continue label263;
                                        }
                                    }
                                    class126.field1966[var35] = var12 + -1;
                                    class3.field37[var35] = var13 - -1;
                                    class338.field4911[var22 + -1][var21 + 1] = 6;
                                    var35 = 4095 & var35 - -1;
                                    class75.field1059[var22 + -1][var21 - -1] = var26;
                                }
                            } while (~(-arg6 + 128) >= ~var22);
                        } while (~var21 <= ~(-arg6 + 128));
                    } while (class338.field4911[var22 + 1][var21 + 1] != 0);
                } while ((var20[arg6 + var23][var24 - -arg6] & 2015625216) != 0);
                for (int var34 = 1; ~arg6 < ~var34; ++var34) {
                    if ((var20[var23 + var34][arg6 + var24] & 2116288512) != 0 || ~(var20[arg6 + var23][var24 + var34] & 2028208128) != -1) {
                        continue label286;
                    }
                }
                class126.field1966[var35] = var12 + 1;
                class3.field37[var35] = var13 + 1;
                class338.field4911[var22 + 1][var21 + 1] = 12;
                var35 = var35 + 1 & 4095;
                class75.field1059[var22 + 1][var21 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "(I)V", line = 640)
    public static void method1473(int arg0) {
        field3333 = null;
        if (arg0 != 8) {
            method1473(-64);
        }
    }
}
