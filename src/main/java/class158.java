import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class158 extends class202 {

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    private int field2170 = -1;

    @OriginalMember(owner = "client!j", name = "s", descriptor = "Z")
    private boolean field2179 = false;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "I")
    private int field2184 = -1;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "Lee;")
    private class74 field2172 = null;

    @OriginalMember(owner = "client!j", name = "D", descriptor = "Z")
    private boolean field2190 = false;

    @OriginalMember(owner = "client!j", name = "O", descriptor = "I")
    private int field2200 = -32768;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "I")
    private int field2185;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "I")
    private int field2182;

    @OriginalMember(owner = "client!j", name = "G", descriptor = "I")
    private int field2192;

    @OriginalMember(owner = "client!j", name = "K", descriptor = "I")
    private int field2196;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "I")
    private int field2186;

    @OriginalMember(owner = "client!j", name = "B", descriptor = "I")
    private int field2188;

    @OriginalMember(owner = "client!j", name = "I", descriptor = "I")
    private int field2194;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "I")
    private int field2178;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "Lwk;")
    private class195 field2183;

    @OriginalMember(owner = "client!j", name = "A", descriptor = "I")
    private int field2187;

    @OriginalMember(owner = "client!j", name = "J", descriptor = "I")
    private int field2195;

    @OriginalMember(owner = "client!j", name = "H", descriptor = "Z")
    public static boolean field2193 = false;

    @OriginalMember(owner = "client!j", name = "E", descriptor = "B")
    public static byte field2191;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!j", name = "u", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!j", name = "C", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!j", name = "L", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!j", name = "M", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!j", name = "N", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!j", name = "P", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!j", name = "R", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "Lte;")
    private class220 field2171;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IZ)Lsk;")
    private final class202 method977(int arg0, boolean arg1) {
        field2176++;
        boolean var3 = class2.field7 != class185.field2812;
        class240 var4 = class265.method1717(114, this.field2185);
        if (var4.field3766 != null) {
            var4 = var4.method1567(-1);
        }
        if (var4 == null) {
            this.field2170 = this.field2194;
            this.field2184 = -1;
            return null;
        }
        if (!this.field2179 && this.field2184 != var4.field3710) {
            this.method987(-1, 123);
        }
        int var5 = this.field2192 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field3760;
            var7 = var4.field3713;
        } else {
            var6 = var4.field3713;
            var7 = var4.field3760;
        }
        int var8 = (var7 + 1 >> 1) + this.field2196;
        int var9 = (var6 >> 1) + this.field2186;
        int var10 = (var7 >> 1) + this.field2196;
        int var11 = (var6 + 1 >> 1) + this.field2186;
        this.method986(114, var10 * 128, var9 * 128);
        boolean var12 = !var3 && var4.field3761 && (this.field2184 != var4.field3710 || (this.field2194 != this.field2170 || this.field2183 != null && (this.field2183.field2975 || class199.field3035) && this.field2194 != this.field2178) && class56.field782 >= 2);
        if (arg1 && !var12) {
            this.field2184 = var4.field3710;
            this.field2170 = this.field2194;
            return null;
        }
        int[][] var13 = class185.field2812[this.field2188];
        int var14 = var13[var9][var10] + var13[var11][var10] + var13[var9][var8] + var13[var11][var8] >> 2;
        int var15 = (this.field2186 << 7) + (var6 << 6);
        int var16 = (this.field2196 << 7) + (var7 << 6);
        int[][] var17 = null;
        if (var3) {
            var17 = class2.field7[0];
        } else if (this.field2188 < 3) {
            var17 = class185.field2812[this.field2188 + 1];
        }
        if (arg0 >= -52) {
            return null;
        }
        boolean var18 = this.field2172 == null;
        class16 var19;
        if (this.field2183 == null) {
            var19 = var4.method1571(this.field2192, var14, false, var18 ? class312.field5026 : this.field2172, var17, var16, var13, this.field2182, (byte) 23, var15, var12);
        } else {
            var19 = var4.method1580(this.field2187, this.field2194, this.field2178, var15, var13, this.field2192, var18 ? class312.field5026 : this.field2172, var16, this.field2183, this.field2182, var14, (byte) 4, var17, var12);
        }
        if (var19 == null) {
            this.field2184 = var4.field3710;
            this.field2170 = this.field2194;
            return null;
        } else {
            this.field2170 = this.field2194;
            this.field2184 = var4.field3710;
            return var19.field289;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(JJ)J")
    public static long method978(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()I")
    public final int method9() {
        field2202++;
        return this.field2200;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V")
    public final void method7(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2197++;
        this.method986(116, arg4, arg3);
        class202 var6 = null;
        if (!this.field2190) {
            if (var6 == null) {
                var6 = this.method983(24230);
            }
            if (var6 == null) {
                return;
            }
            this.method980(var6, -3);
        }
        if (this.field2171 != null) {
            this.field2171.method1442(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILnh;II)[Lbf;")
    public static final class108[] method979(int arg0, class305 arg1, int arg2, int arg3) {
        field2177++;
        if (arg3 >= -118) {
            field2191 = 29;
        }
        return class131.method832(arg2, arg0, -109, arg1) ? class177.method1120(-115) : null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lsk;I)V")
    private final void method980(class202 arg0, int arg1) {
        if (arg1 != -3) {
            return;
        }
        class66 var3 = (class66) arg0;
        if ((this.field2171 == null || this.field2171.field3413) && (var3.field884 != null || var3.field885 != null)) {
            class240 var4 = class265.method1717(14, this.field2185);
            if (var4.field3766 != null) {
                var4 = var4.method1567(-1);
            }
            if (var4 != null) {
                this.field2171 = new class220(class35.field533, var4.field3713, var4.field3760);
            }
        }
        if (this.field2171 != null) {
            this.field2171.method1443(var3.field884, var3.field885, false, var3.field872, var3.field901, var3.field903);
        }
        field2173++;
        this.field2190 = true;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljava/lang/String;Lim;B)Ljava/lang/String;")
    public static final String method981(String arg0, class178 arg1, byte arg2) {
        if (arg0.indexOf("%") != -1) {
            label56: while (true) {
                int var3 = arg0.indexOf("%1");
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg0.indexOf("%2");
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg0.indexOf("%3");
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg0.indexOf("%4");
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg0.indexOf("%5");
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg0.indexOf("%dns");
                                                        if (var8 == -1) {
                                                            break label56;
                                                        }
                                                        String var9 = "";
                                                        if (class2.field16 != null) {
                                                            if (class2.field16.field4567 == null) {
                                                                var9 = class59.method374(class2.field16.field4569, true);
                                                            } else {
                                                                var9 = (String) class2.field16.field4567;
                                                            }
                                                        }
                                                        arg0 = arg0.substring(0, var8) + var9 + arg0.substring(var8 + 4);
                                                    }
                                                }
                                                arg0 = arg0.substring(0, var7) + class24.method155(class34.method231(4, arg1, false), (byte) -115) + arg0.substring(var7 + 2);
                                            }
                                        }
                                        arg0 = arg0.substring(0, var6) + class24.method155(class34.method231(3, arg1, false), (byte) -115) + arg0.substring(var6 + 2);
                                    }
                                }
                                arg0 = arg0.substring(0, var5) + class24.method155(class34.method231(2, arg1, false), (byte) -115) + arg0.substring(var5 + 2);
                            }
                        }
                        arg0 = arg0.substring(0, var4) + class24.method155(class34.method231(1, arg1, false), (byte) -115) + arg0.substring(var4 + 2);
                    }
                }
                arg0 = arg0.substring(0, var3) + class24.method155(class34.method231(0, arg1, false), (byte) -115) + arg0.substring(var3 + 2);
            }
        }
        if (arg2 < 75) {
            field2191 = 51;
        }
        field2180++;
        return arg0;
    }

    @OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field2198++;
        if (this.field2171 != null) {
            this.field2171.method1444();
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)I")
    public static final int method982(boolean arg0) {
        field2181++;
        if (!arg0) {
            field2193 = true;
        }
        return class192.field2940 && class233.field3651[81] && class179.field2721 > 2 ? class84.field1186[class179.field2721 - 2] : class84.field1186[class179.field2721 - 1];
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)Lsk;")
    public final class202 method983(int arg0) {
        field2199++;
        if (arg0 != 24230) {
            field2191 = 10;
        }
        return this.method977(-60, false);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BI)Ldg;")
    public static final class6 method984(byte arg0, int arg1) {
        field2201++;
        class6 var2 = (class6) class277.field4404.method1486((long) arg1, arg0 ^ 0x4B36);
        if (arg0 != -62) {
            field2193 = false;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class65.field861.method2050(117, 1, arg1 & 0x7FFF);
        } else {
            var3 = class295.field4718.method2050(107, 1, arg1);
        }
        class6 var4 = new class6();
        if (var3 != null) {
            var4.method28((byte) -33, new class215(var3));
        }
        if (arg1 >= 32768) {
            var4.method33((byte) 64);
        }
        class277.field4404.method1489((long) arg1, 115, var4);
        return var4;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZLim;III)V")
    public static final void method985(boolean arg0, class178 arg1, int arg2, int arg3, int arg4) {
        field2203++;
        class8.method45(4087);
        class266.method1747(arg4, arg3, arg4 + arg1.field2529, arg1.field2571 + arg3);
        if (class249.field3897 == 2 || class249.field3897 == 5 || class200.field3039 == null) {
            class266.method1750(arg4, arg3, 0, arg1.field2528, arg1.field2631);
        } else {
            int var5;
            int var6;
            int var7;
            int var8;
            if (class12.field203 == 4) {
                var7 = class249.field3894;
                var6 = 256;
                var5 = (int) class123.field1743 & 0x7FF;
                var8 = class50.field711;
            } else {
                var5 = (int) class123.field1743 + class179.field2712 & 0x7FF;
                var6 = class42.field627 + 256;
                var7 = class250.field3905.field4081;
                var8 = class250.field3905.field4140;
            }
            int var9 = 464 - (var8 / 32);
            int var10 = var7 / 32 + 48;
            ((class203) class200.field3039).method1278(arg4, arg3, arg1.field2529, arg1.field2571, var10, var9, var5, var6, arg1.field2528, arg1.field2631);
            if (class139.field1925 != null) {
                for (int var11 = 0; var11 < class139.field1925.field3098; var11++) {
                    if (class139.field1925.field3089[var11] != null && class139.field1925.field3088[var11] >> 28 == class166.field2364) {
                        int var12 = (class139.field1925.field3088[var11] >> 14 & 0x3FFF) - class228.field3570;
                        int var13 = (class139.field1925.field3088[var11] & 0x3FFF) - class170.field2421;
                        if (var12 >= 0 && var12 < 104 && var13 >= 0 && var13 < 104) {
                            int var14 = var12 * 4 + 2 - (var7 / 32);
                            int var15 = var13 * 4 + 2 - (var8 / 32);
                            class238.method1560(arg4, var14, (byte) -126, arg3, class139.field1925.field3089[var11].field3688, var15, arg1);
                        }
                    }
                }
            }
            for (int var16 = 0; var16 < class221.field3436; var16++) {
                int var51 = class227.field3553[var16] * 4 + 2 - (var8 / 32);
                int var52 = class96.field1394[var16] * 4 + 2 - var7 / 32;
                class240 var53 = class265.method1717(45, class47.field678[var16]);
                if (var53.field3766 != null) {
                    var53 = var53.method1567(-1);
                    if (var53 == null || var53.field3758 == -1) {
                        continue;
                    }
                }
                class238.method1560(arg4, var52, (byte) -128, arg3, var53.field3758, var51, arg1);
            }
            for (int var17 = 0; var17 < 104; var17++) {
                for (int var47 = 0; var47 < 104; var47++) {
                    class58 var48 = class78.field1088[class166.field2364][var17][var47];
                    if (var48 != null) {
                        int var49 = var17 * 4 + 2 - (var7 / 32);
                        int var50 = var47 * 4 + 2 - var8 / 32;
                        class247.method1614(var50, class154.field2140[0], var49, arg4, arg1, 2, arg3);
                    }
                }
            }
            for (int var18 = 0; var18 < class306.field4921; var18++) {
                class310 var43 = class88.field1274[class131.field1834[var18]];
                if (var43 != null && var43.method1679((byte) -127)) {
                    class211 var44 = var43.field4993;
                    if (var44 != null && var44.field3173 != null) {
                        var44 = var44.method1316((byte) -106);
                    }
                    if (var44 != null && var44.field3192 && var44.field3140) {
                        int var45 = var43.field4081 / 32 - (var7 / 32);
                        int var46 = var43.field4140 / 32 - (var8 / 32);
                        if (var44.field3159 == -1) {
                            class247.method1614(var46, class154.field2140[1], var45, arg4, arg1, 2, arg3);
                        } else {
                            class238.method1560(arg4, var45, (byte) -126, arg3, var44.field3159, var46, arg1);
                        }
                    }
                }
            }
            for (int var19 = 0; var19 < class171.field2437; var19++) {
                class314 var35 = class48.field689[class160.field2235[var19]];
                if (var35 != null && var35.method1679((byte) -127)) {
                    int var36 = var35.field4081 / 32 - (var7 / 32);
                    int var37 = var35.field4140 / 32 - (var8 / 32);
                    boolean var38 = false;
                    for (int var39 = 0; var39 < class43.field643; var39++) {
                        if (var35.field5053.equals(class206.field3081[var39]) && class188.field2846[var39] != 0) {
                            var38 = true;
                            break;
                        }
                    }
                    boolean var40 = false;
                    for (int var41 = 0; var41 < class193.field2948; var41++) {
                        if (var35.field5053.equals(class290.field4633[var41].field4466)) {
                            var40 = true;
                            break;
                        }
                    }
                    boolean var42 = false;
                    if (class250.field3905.field5054 != 0 && var35.field5054 != 0 && class250.field3905.field5054 == var35.field5054) {
                        var42 = true;
                    }
                    if (var38) {
                        class247.method1614(var37, class154.field2140[3], var36, arg4, arg1, 2, arg3);
                    } else if (var40) {
                        class247.method1614(var37, class154.field2140[5], var36, arg4, arg1, 2, arg3);
                    } else if (var42) {
                        class247.method1614(var37, class154.field2140[4], var36, arg4, arg1, 2, arg3);
                    } else {
                        class247.method1614(var37, class154.field2140[2], var36, arg4, arg1, 2, arg3);
                    }
                }
            }
            int var20 = 0;
            class193[] var21 = class267.field4286;
            while (var21.length > var20) {
                class193 var24 = var21[var20];
                if (var24 != null && var24.field2944 != 0 && (class35.field533 % 20) < 10) {
                    if (var24.field2944 == 1 && var24.field2943 >= 0 && class88.field1274.length > var24.field2943) {
                        class310 var25 = class88.field1274[var24.field2943];
                        if (var25 != null) {
                            int var26 = var25.field4081 / 32 - (var7 / 32);
                            int var27 = var25.field4140 / 32 - (var8 / 32);
                            class49.method304(arg1, var27, var26, arg4, 360000, arg3, var24.field2946, true);
                        }
                    }
                    if (var24.field2944 == 2) {
                        int var28 = (var24.field2947 - class170.field2421) * 4 - (var8 / 32 - 2);
                        int var29 = var24.field2953 * 4;
                        int var30 = (var24.field2942 - class228.field3570) * 4 + 2 - (var7 / 32);
                        int var31 = var29 * var29;
                        class49.method304(arg1, var28, var30, arg4, var31, arg3, var24.field2946, arg0);
                    }
                    if (var24.field2944 == 10 && var24.field2943 >= 0 && class48.field689.length > var24.field2943) {
                        class314 var32 = class48.field689[var24.field2943];
                        if (var32 != null) {
                            int var33 = var32.field4140 / 32 - var8 / 32;
                            int var34 = var32.field4081 / 32 - var7 / 32;
                            class49.method304(arg1, var33, var34, arg4, 360000, arg3, var24.field2946, true);
                        }
                    }
                }
                var20++;
            }
            if (class12.field203 != 4) {
                if (class141.field1939 != 0) {
                    int var22 = class141.field1939 * 4 + class250.field3905.method1683(-124) * 2 + 2 - (var7 / 32) - 2;
                    int var23 = class274.field4354 * 4 + (((class250.field3905.method1683(-65) * 2) - (var8 / 32)) + 2 - 2);
                    class247.method1614(var23, class11.field187[class176.field2485 ? 1 : 0], var22, arg4, arg1, 2, arg3);
                }
                class266.method1730(arg4 - (1 - (arg1.field2529 / 2)), arg1.field2571 / 2 + arg3 + -1, 3, 3, 16777215);
            }
        }
        class30.field459[arg2] = arg0;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(III)V")
    private final void method986(int arg0, int arg1, int arg2) {
        field2189++;
        if (arg0 <= 59) {
            method982(true);
        }
        label90: while (true) {
            if (this.field2183 == null) {
                if (this.field2179) {
                    return;
                }
                this.method987(-1, 115);
                if (this.field2183 == null) {
                    return;
                }
            }
            int var4 = class35.field533 - this.field2195;
            if (var4 > 100 && this.field2183.field2984 > 0) {
                int var5 = this.field2183.field2989.length - this.field2183.field2984;
                while (var5 > this.field2194 && var4 > this.field2183.field2966[this.field2194]) {
                    var4 -= this.field2183.field2966[this.field2194];
                    this.field2194++;
                }
                if (var5 <= this.field2194) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field2183.field2989.length; var7++) {
                        var6 += this.field2183.field2966[var7];
                    }
                    var4 %= var6;
                }
                this.field2178 = this.field2194 + 1;
                if (this.field2178 >= this.field2183.field2989.length) {
                    this.field2178 -= this.field2183.field2984;
                    if (this.field2178 < 0 || this.field2183.field2989.length <= this.field2178) {
                        this.field2178 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var4 <= this.field2183.field2966[this.field2194]) {
                            this.field2187 = var4;
                            this.field2195 = class35.field533 - var4;
                            return;
                        }
                        class181.method1152(false, arg2, this.field2194, arg1, false, this.field2183);
                        var4 -= this.field2183.field2966[this.field2194];
                        this.field2194++;
                        if (this.field2183.field2989.length <= this.field2194) {
                            this.field2194 -= this.field2183.field2984;
                            if (this.field2194 < 0 || this.field2194 >= this.field2183.field2989.length) {
                                this.field2183 = null;
                                continue label90;
                            }
                        }
                        this.field2178 = this.field2194 + 1;
                    } while (this.field2183.field2989.length > this.field2178);
                    this.field2178 -= this.field2183.field2984;
                } while (this.field2178 >= 0 && this.field2183.field2989.length > this.field2178);
                this.field2178 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(II)V")
    private final void method987(int arg0, int arg1) {
        field2174++;
        boolean var3 = false;
        int var4 = arg0;
        if (arg0 == -1) {
            class240 var5 = class265.method1717(-83, this.field2185);
            class240 var6 = var5;
            if (var5.field3766 != null) {
                var5 = var5.method1567(-1);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field3738 != null) {
                if (this.field2183 != null && var5.method1572(this.field2183.field2987, true)) {
                    return;
                }
                var4 = var5.method1568(false);
                if (this.field2184 != var5.field3710) {
                    var3 = var5.field3729;
                }
            } else if (var5.field3747 == -1) {
                if (var6 != null && var6.field3738 != null) {
                    if (this.field2183 != null && var6.method1572(this.field2183.field2987, true)) {
                        return;
                    }
                    var4 = var6.method1568(false);
                    if (this.field2184 != var6.field3710) {
                        var3 = var6.field3729;
                    }
                } else if (var6 != null && var6.field3747 != -1 && this.field2184 != var6.field3710) {
                    var4 = var6.field3747;
                    var3 = var6.field3729;
                }
            } else if (this.field2184 != var5.field3710) {
                var4 = var5.field3747;
                var3 = var5.field3729;
            }
        }
        if (arg1 <= 103) {
            this.field2194 = 30;
        }
        if (var4 == -1) {
            this.field2183 = null;
            return;
        }
        if (this.field2183 == null || this.field2183.field2987 != var4) {
            this.field2183 = class280.method1815(var4, 116);
        } else if (this.field2183.field2967 == 0) {
            return;
        }
        if (var3) {
            this.field2194 = (int) ((double) this.field2183.field2989.length * Math.random());
            this.field2187 = (int) (Math.random() * (double) this.field2183.field2966[this.field2194]) + 1;
        } else {
            this.field2187 = 1;
            this.field2194 = 0;
        }
        this.field2178 = this.field2194 + 1;
        if (this.field2178 < 0 || this.field2183.field2989.length <= this.field2178) {
            this.field2178 = -1;
        }
        this.field2195 = class35.field533 - this.field2187;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIIIIJILte;)V")
    public final void method11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class220 arg10) {
        field2175++;
        class202 var13 = this.method983(24230);
        if (var13 != null) {
            this.method980(var13, -3);
            var13.method11(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field2171);
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(IIIIIIIZLsk;)V")
    public class158(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class202 arg8) {
        this.field2185 = arg0;
        this.field2182 = arg1;
        this.field2192 = arg2;
        this.field2196 = arg5;
        this.field2186 = arg4;
        this.field2188 = arg3;
        if (arg8 != null) {
            this.field2179 = true;
            if (arg8 instanceof class158) {
                class158 var10 = (class158) arg8;
                this.field2194 = var10.field2194;
                this.field2178 = var10.field2178;
                this.field2183 = var10.field2183;
                this.field2187 = var10.field2187;
                this.field2195 = var10.field2195;
            }
        }
        if (this.field2179) {
            this.method987(arg6, 110);
        }
    }
}
