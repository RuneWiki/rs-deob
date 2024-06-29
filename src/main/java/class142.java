import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class142 extends class222 {

    @OriginalMember(owner = "client!dg", name = "Z", descriptor = "I")
    private int field2505 = 4096;

    @OriginalMember(owner = "client!dg", name = "jb", descriptor = "I")
    private int field2515 = 0;

    @OriginalMember(owner = "client!dg", name = "gb", descriptor = "Lsb;")
    private static class98 field2512 = class47.method368("K", 0);

    @OriginalMember(owner = "client!dg", name = "Y", descriptor = "Lsb;")
    public static class98 field2504 = field2512;

    @OriginalMember(owner = "client!dg", name = "kb", descriptor = "[I")
    public static int[] field2516 = new int[128];

    @OriginalMember(owner = "client!dg", name = "X", descriptor = "Lsb;")
    public static class98 field2503 = field2512;

    @OriginalMember(owner = "client!dg", name = "W", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!dg", name = "ab", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!dg", name = "bb", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!dg", name = "cb", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!dg", name = "db", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!dg", name = "eb", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!dg", name = "fb", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!dg", name = "hb", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!dg", name = "ib", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!dg", name = "lb", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIII)V")
    public static final void method1059(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 - arg1;
        if (arg0 != 0) {
            field2504 = null;
        }
        ++field2509;
        int var7 = -arg3 + arg5;
        if (~var6 != -1) {
            if (~var7 == -1) {
                class102.method784(arg1, ~arg0, arg2, arg3, arg4);
            } else {
                int var8 = (var7 << 12) / var6;
                int var9 = arg3 - (arg1 * var8 >> 12);
                int var10;
                int var11;
                if (~arg1 <= ~class229.field3933) {
                    if (~arg1 >= ~class106.field1899) {
                        var10 = arg1;
                        var11 = arg3;
                    } else {
                        var10 = class106.field1899;
                        var11 = var9 - -(class106.field1899 * var8 >> 12);
                    }
                } else {
                    var11 = var9 - -(class229.field3933 * var8 >> 12);
                    var10 = class229.field3933;
                }
                if (var11 < class116.field2077) {
                    var11 = class116.field2077;
                    var10 = (-var9 + class116.field2077 << 12) / var8;
                } else if (var11 > class215.field3666) {
                    var11 = class215.field3666;
                    var10 = (-var9 + class215.field3666 << 12) / var8;
                }
                int var12;
                int var13;
                if (arg2 >= class229.field3933) {
                    if (~class106.field1899 <= ~arg2) {
                        var12 = arg5;
                        var13 = arg2;
                    } else {
                        var13 = class106.field1899;
                        var12 = (class106.field1899 * var8 >> 12) + var9;
                    }
                } else {
                    var13 = class229.field3933;
                    var12 = (class229.field3933 * var8 >> 12) + var9;
                }
                if (var12 < class116.field2077) {
                    var13 = (-var9 + class116.field2077 << 12) / var8;
                    var12 = class116.field2077;
                } else if (var12 > class215.field3666) {
                    var12 = class215.field3666;
                    var13 = (-var9 + class215.field3666 << 12) / var8;
                }
                class199.method1356(var13, arg4, var11, var10, var12, 89);
            }
        } else {
            if (~var7 != -1) {
                class197.method1346(false, arg3, arg1, arg4, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1060(boolean arg0, int arg1) {
        ++field2514;
        if (arg0) {
            return false;
        } else {
            return ~arg1 == -199 || arg1 == 230 || arg1 == 156 || arg1 == 140 || ~arg1 == -224;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIZIIIIIIIIZ)Z")
    public static final boolean method1061(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        for (int var12 = 0; var12 < 104; ++var12) {
            for (int var31 = 0; var31 < 104; ++var31) {
                class230.field3970[var12][var31] = 0;
                class115.field2068[var12][var31] = 99999999;
            }
        }
        ++field2508;
        class230.field3970[arg4][arg9] = 99;
        class115.field2068[arg4][arg9] = 0;
        int var13 = arg4;
        byte var14 = 0;
        class205.field3508[var14] = arg4;
        int var15 = arg9;
        int var32 = var14 + 1;
        class138.field2462[var14] = arg9;
        int var16 = 0;
        int[][] var17 = class110.field1961[class265.field4640].field1175;
        boolean var18 = arg2;
        while (var32 != var16) {
            var15 = class138.field2462[var16];
            var13 = class205.field3508[var16];
            var16 = 4095 & var16 + 1;
            if (~arg5 == ~var13 && ~arg10 == ~var15) {
                var18 = true;
                break;
            }
            if (arg1 != 0) {
                if ((arg1 < 5 || ~arg1 == -11) && class110.field1961[class265.field4640].method510((byte) 104, var13, arg10, arg6, arg5, var15, 1, arg1 + -1)) {
                    var18 = true;
                    break;
                }
                if (~arg1 > -11 && class110.field1961[class265.field4640].method516(arg1 + -1, var13, var15, arg6, arg2, arg5, arg10, 1)) {
                    var18 = true;
                    break;
                }
            }
            if (~arg8 != -1 && ~arg7 != -1 && class110.field1961[class265.field4640].method500(arg10, var13, arg8, arg5, 8, 1, arg0, var15, arg7)) {
                var18 = true;
                break;
            }
            int var30 = class115.field2068[var13][var15] + 1;
            if (~var13 < -1 && ~class230.field3970[var13 + -1][var15] == -1 && (19661064 & var17[var13 + -1][var15]) == 0) {
                class205.field3508[var32] = var13 - 1;
                class138.field2462[var32] = var15;
                var32 = var32 - -1 & 4095;
                class230.field3970[var13 + -1][var15] = 2;
                class115.field2068[var13 - 1][var15] = var30;
            }
            if (var13 < 103 && ~class230.field3970[var13 + 1][var15] == -1 && (19661184 & var17[var13 + 1][var15]) == 0) {
                class205.field3508[var32] = var13 + 1;
                class138.field2462[var32] = var15;
                var32 = 4095 & var32 + 1;
                class230.field3970[var13 - -1][var15] = 8;
                class115.field2068[var13 + 1][var15] = var30;
            }
            if (~var15 < -1 && ~class230.field3970[var13][var15 + -1] == -1 && (19661058 & var17[var13][var15 - 1]) == 0) {
                class205.field3508[var32] = var13;
                class138.field2462[var32] = var15 + -1;
                class230.field3970[var13][var15 + -1] = 1;
                var32 = var32 + 1 & 4095;
                class115.field2068[var13][var15 + -1] = var30;
            }
            if (var15 < 103 && class230.field3970[var13][var15 + 1] == 0 && ~(19661088 & var17[var13][var15 - -1]) == -1) {
                class205.field3508[var32] = var13;
                class138.field2462[var32] = var15 - -1;
                class230.field3970[var13][var15 + 1] = 4;
                class115.field2068[var13][var15 + 1] = var30;
                var32 = var32 + 1 & 4095;
            }
            if (~var13 < -1 && var15 > 0 && ~class230.field3970[var13 + -1][var15 + -1] == -1 && ~(var17[var13 + -1][var15 + -1] & 19661070) == -1 && ~(19661064 & var17[var13 + -1][var15]) == -1 && ~(19661058 & var17[var13][var15 + -1]) == -1) {
                class205.field3508[var32] = var13 + -1;
                class138.field2462[var32] = var15 + -1;
                var32 = var32 - -1 & 4095;
                class230.field3970[var13 + -1][var15 + -1] = 3;
                class115.field2068[var13 + -1][var15 + -1] = var30;
            }
            if (~var13 > -104 && ~var15 < -1 && class230.field3970[var13 + 1][var15 - 1] == 0 && (var17[var13 - -1][var15 + -1] & 19661187) == 0 && ~(var17[var13 + 1][var15] & 19661184) == -1 && (19661058 & var17[var13][var15 + -1]) == 0) {
                class205.field3508[var32] = var13 + 1;
                class138.field2462[var32] = var15 + -1;
                var32 = var32 + 1 & 4095;
                class230.field3970[var13 + 1][var15 + -1] = 9;
                class115.field2068[var13 + 1][var15 + -1] = var30;
            }
            if (var13 > 0 && ~var15 > -104 && class230.field3970[var13 - 1][var15 - -1] == 0 && (19661112 & var17[var13 + -1][var15 + 1]) == 0 && ~(var17[var13 - 1][var15] & 19661064) == -1 && (19661088 & var17[var13][var15 - -1]) == 0) {
                class205.field3508[var32] = var13 + -1;
                class138.field2462[var32] = var15 + 1;
                class230.field3970[var13 - 1][var15 + 1] = 6;
                class115.field2068[var13 + -1][var15 + 1] = var30;
                var32 = var32 + 1 & 4095;
            }
            if (var13 < 103 && ~var15 > -104 && class230.field3970[var13 - -1][var15 + 1] == 0 && ~(var17[var13 + 1][var15 - -1] & 19661280) == -1 && (var17[var13 - -1][var15] & 19661184) == 0 && ~(19661088 & var17[var13][var15 + 1]) == -1) {
                class205.field3508[var32] = var13 + 1;
                class138.field2462[var32] = var15 + 1;
                class230.field3970[var13 - -1][var15 + 1] = 12;
                class115.field2068[var13 - -1][var15 + 1] = var30;
                var32 = var32 + 1 & 4095;
            }
        }
        class76.field1334 = 0;
        if (!var18) {
            if (!arg11) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = arg5 - var21; ~(arg5 - -var21) <= ~var22; ++var22) {
                for (int var23 = -var21 + arg10; var23 <= arg10 + var21; ++var23) {
                    if (~var22 <= -1 && ~var23 <= -1 && var22 < 104 && ~var23 > -105 && class115.field2068[var22][var23] < 100) {
                        int var24 = 0;
                        int var25 = 0;
                        if (var23 >= arg10) {
                            if (var23 > arg10 - 1 + arg7) {
                                var25 = var23 - (arg7 + arg10 + -1);
                            }
                        } else {
                            var25 = -var23 + arg10;
                        }
                        if (~var22 > ~arg5) {
                            var24 = arg5 - var22;
                        } else if (~var22 < ~(arg8 + -1 + arg5)) {
                            var24 = var22 - arg8 - (arg5 - 1);
                        }
                        int var26 = var24 * var24 - -(var25 * var25);
                        if (var19 > var26 || var19 == var26 && ~class115.field2068[var22][var23] > ~var20) {
                            var13 = var22;
                            var15 = var23;
                            var20 = class115.field2068[var22][var23];
                            var19 = var26;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg4 == var13 && arg9 == var15) {
                return false;
            }
            class76.field1334 = 1;
        }
        byte var27 = 0;
        class205.field3508[var27] = var13;
        int var33 = var27 + 1;
        class138.field2462[var27] = var15;
        int var28;
        int var29 = var28 = class230.field3970[var13][var15];
        while (~arg4 != ~var13 || arg9 != var15) {
            if (var28 != var29) {
                class205.field3508[var33] = var13;
                class138.field2462[var33++] = var15;
                var28 = var29;
            }
            if (~(var29 & 2) != -1) {
                ++var13;
            } else if (~(var29 & 8) != -1) {
                --var13;
            }
            if ((1 & var29) != 0) {
                ++var15;
            } else if ((var29 & 4) != 0) {
                --var15;
            }
            var29 = class230.field3970[var13][var15];
        }
        if (~var33 < -1) {
            class194.method1337(var33, arg3, 10615);
            return true;
        } else if (~arg3 == -2) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        ++field2511;
        int[] var3 = super.field3844.method22(0, arg1);
        if (super.field3844.field61) {
            int[] var4 = this.method1537((byte) 66, 0, arg1);
            for (int var5 = 0; var5 < class13.field253; ++var5) {
                int var6 = var4[var5];
                if (~this.field2515 >= ~var6) {
                    if (~var6 >= ~this.field2505) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field2505;
                    }
                } else {
                    var3[var5] = this.field2515;
                }
            }
        }
        if (arg0 < 35) {
            method1063((byte) 16, -49);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)V")
    public static final void method1062(int arg0) {
        ++field2506;
        for (int var1 = 0; var1 < class104.field1855; ++var1) {
            int var2 = class244.field4240[var1];
            class108 var3 = class180.field3109[var2];
            int var4 = class144.field2536.method1446(arg0 ^ 5579);
            if ((2 & var4) != 0) {
                var3.field4464 = class144.field2536.method1478(arg0 ^ -326);
                if (var3.field4464 == 65535) {
                    var3.field4464 = -1;
                }
            }
            if (~(4 & var4) != -1) {
                var3.field4526 = class144.field2536.method1445(-3);
                var3.field4504 = 100;
            }
            if (~(var4 & 1) != -1) {
                var3.field4506 = class144.field2536.method1441(2);
                var3.field4472 = class144.field2536.method1478(-87);
            }
            if (~(var4 & 64) != -1) {
                int var5 = class144.field2536.method1443(arg0 + -297);
                int var6 = class144.field2536.method1480(-114);
                var3.method1761(var5, var6, class236.field4071, arg0 + -301);
                var3.field4499 = class236.field4071 + 300;
                var3.field4484 = class144.field2536.method1443(4);
            }
            if ((var4 & 32) != 0) {
                if (var3.field1928.method893(-9737)) {
                    class2.method10(var3, arg0 ^ -765);
                }
                var3.field1928 = class210.method1414(class144.field2536.method1441(2), (byte) 111);
                var3.field4486 = var3.field1928.field2165;
                var3.field4508 = var3.field1928.field2169;
                var3.field4510 = var3.field1928.field2176;
                var3.field4497 = var3.field1928.field2192;
                var3.field4512 = var3.field1928.field2188;
                var3.field4462 = var3.field1928.field2179;
                var3.field4517 = var3.field1928.field2155;
                var3.field4463 = var3.field1928.field2202;
                var3.field4521 = var3.field1928.field2213;
                if (var3.field1928.method893(-9737)) {
                    class205.method1382(var3.field4501[0], (class21) null, (class192) null, var3.field4491[0], var3, 0, true, class265.field4640);
                }
            }
            if (~(16 & var4) != -1) {
                int var7 = class144.field2536.method1480(arg0 ^ -338);
                int var8 = class144.field2536.method1443(4);
                var3.method1761(var7, var8, class236.field4071, arg0 + -301);
            }
            if ((8 & var4) != 0) {
                int var9 = class144.field2536.method1487(72);
                int var10 = class144.field2536.method1480(-128);
                if (var9 == 65535) {
                    var9 = -1;
                }
                class71.method495(var3, 0, var9, var10);
            }
            if (~(var4 & 128) != -1) {
                var3.field4461 = class144.field2536.method1487(arg0 ^ 279);
                int var11 = class144.field2536.method1442(-1330139880);
                if (var3.field4461 == 65535) {
                    var3.field4461 = -1;
                }
                var3.field4519 = var11 >> 16;
                var3.field4520 = 0;
                var3.field4485 = 0;
                var3.field4465 = (65535 & var11) + class236.field4071;
                if (var3.field4465 > class236.field4071) {
                    var3.field4485 = -1;
                }
                if (~var3.field4461 != 0 && class236.field4071 == var3.field4465) {
                    int var12 = class49.method385(var3.field4461, 0).field3464;
                    if (~var12 != 0) {
                        class138 var13 = class16.method144(1, var12);
                        if (var13 != null && var13.field2454 != null) {
                            class114.method850(false, var3.field4492, var3.field4466, 0, var13, 4096);
                        }
                    }
                }
            }
        }
        if (arg0 != 301) {
            field2504 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(BI)V")
    public static final void method1063(byte arg0, int arg1) {
        if (class256.field4534 == null || arg1 > class256.field4534.length) {
            class256.field4534 = new int[arg1];
        }
        if (arg0 != -124) {
            method1060(true, 71);
        }
        ++field2513;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
    public class142() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "(I)V")
    public static void method1064(int arg0) {
        field2512 = null;
        field2503 = null;
        field2516 = null;
        if (arg0 != -1) {
            method1063((byte) -86, 57);
        }
        field2504 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field3842 = arg0.method1446(5350) == 1;
                }
            } else {
                this.field2505 = arg0.method1487(66);
            }
        } else {
            this.field2515 = arg0.method1487(105);
        }
        ++field2510;
        if (arg1) {
            method1065((Color) null, true, -8, (class98) null, (byte) 111);
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(II)[[I")
    public final int[][] method4(int arg0, int arg1) {
        ++field2507;
        if (arg1 != 1) {
            method1063((byte) 90, -21);
        }
        int[][] var3 = super.field3834.method627(arg1 + 4102, arg0);
        if (super.field3834.field1486) {
            int[][] var4 = this.method1531(arg0, 0, 122);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class13.field253 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var8[var11];
                if (~var12 > ~this.field2515) {
                    var7[var11] = this.field2515;
                } else if (this.field2505 < var12) {
                    var7[var11] = this.field2505;
                } else {
                    var7[var11] = var12;
                }
                if (var13 < this.field2515) {
                    var9[var11] = this.field2515;
                } else if (var13 <= this.field2505) {
                    var9[var11] = var13;
                } else {
                    var9[var11] = this.field2505;
                }
                if (~var14 > ~this.field2515) {
                    var10[var11] = this.field2515;
                } else if (~var14 >= ~this.field2505) {
                    var10[var11] = var14;
                } else {
                    var10[var11] = this.field2505;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljava/awt/Color;ZILsb;B)V")
    public static final void method1065(Color arg0, boolean arg1, int arg2, class98 arg3, byte arg4) {
        try {
            Graphics var5 = class85.field1504.getGraphics();
            if (class34.field588 == null) {
                class34.field588 = new Font("Helvetica", 1, 13);
                class198.field3410 = class85.field1504.getFontMetrics(class34.field588);
            }
            if (arg1) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class121.field2227, class180.field3111);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (class170.field2994 == null) {
                    class170.field2994 = class85.field1504.createImage(304, 34);
                }
                Graphics var6 = class170.field2994.getGraphics();
                var6.setColor(arg0);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg2 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg2 * 3 + 2, 2, -(arg2 * 3) + 300, 30);
                var6.setFont(class34.field588);
                var6.setColor(Color.white);
                arg3.method738(22, var6, 125, (304 + -arg3.method728(33, class198.field3410)) / 2);
                var5.drawImage(class170.field2994, class121.field2227 / 2 + -152, class180.field3111 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class121.field2227 / 2 + -152;
                int var8 = class180.field3111 / 2 + -18;
                var5.setColor(arg0);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 + 2, arg2 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 + 1, 301, 31);
                var5.fillRect(arg2 * 3 + 2 + var7, var8 + 2, 300 - arg2 * 3, 30);
                var5.setFont(class34.field588);
                var5.setColor(Color.white);
                arg3.method738(var8 + 22, var5, 127, var7 - -((-arg3.method728(33, class198.field3410) + 304) / 2));
            }
            if (arg4 != 99) {
                field2503 = null;
            }
            if (class252.field4415 != null) {
                var5.setFont(class34.field588);
                var5.setColor(Color.white);
                class252.field4415.method738(class180.field3111 / 2 + -26, var5, 122, class121.field2227 / 2 + -(class252.field4415.method728(33, class198.field3410) / 2));
            }
        } catch (Exception var10) {
            class85.field1504.repaint();
        }
        ++field2502;
    }
}
