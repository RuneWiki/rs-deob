import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class335 extends class14 {

    @OriginalMember(owner = "client!aa", name = "O", descriptor = "Z")
    private boolean field4392 = true;

    @OriginalMember(owner = "client!aa", name = "P", descriptor = "I")
    private int field4393 = 4096;

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "[S")
    public static short[] field4387 = new short[] { 8, 11, 23, 60, 19, 45, 15, 17 };

    @OriginalMember(owner = "client!aa", name = "R", descriptor = "[Ltp;")
    public static class370[] field4395 = new class370[8];

    @OriginalMember(owner = "client!aa", name = "K", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "I")
    public static int field4394;

    // $FF: synthetic field
    @OriginalMember(owner = "client!aa", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field4396;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lqa;II)Z")
    public static final boolean method1916(class162 arg0, int arg1, int arg2) {
        ++field4389;
        int var3 = (class12.field251 + -104) / 2;
        int var4 = (class289.field3782 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; ~var6 > ~(var3 + 104); ++var6) {
            for (int var51 = var4; var4 + 104 > var51; ++var51) {
                for (int var52 = arg2; var52 <= 3; ++var52) {
                    if (class63.method436(var52, var51, var6, arg2, -2860)) {
                        int var53 = var52;
                        if (class401.method2330(var51, var6, 2)) {
                            var53 = var52 - 1;
                        }
                        if (var53 >= 0) {
                            var5 &= class351.method2050(var6, var51, var53, 86);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        } else {
            int[] var7 = new int[262144];
            for (int var8 = 0; var7.length > var8; ++var8) {
                var7[var8] = -16777216;
            }
            client.field2740 = arg0.method598(var7, arg1, 512, 512, 512);
            class252.method1520(-123);
            int var9 = (238 - -((int) (Math.random() * 20.0D)) + -10 << 8) + ((-10 + (int) (20.0D * Math.random()) + 238 << 16) - (-((int) (Math.random() * 20.0D)) + -238)) - 10 | -16777216;
            int var10 = (-10 + (int) (Math.random() * 20.0D) + 238 | -1877541120) << 16;
            int var11 = (int) (Math.random() * 8.0D) << 8 | (int) (8.0D * Math.random()) << 16 | (int) (Math.random() * 8.0D);
            boolean[][] var12 = new boolean[class460.field6346][class460.field6346];
            for (int var13 = var3; ~var13 > ~(var3 - -104); var13 += class460.field6346) {
                for (int var36 = var4; ~(var4 - -104) < ~var36; var36 += class460.field6346) {
                    arg0.method572(0, 0, class460.field6346 * 4, class460.field6346 * 4);
                    arg0.method550(-16777216);
                    for (int var37 = arg2; var37 <= 3; ++var37) {
                        for (int var44 = 0; ~class460.field6346 < ~var44; ++var44) {
                            for (int var50 = 0; ~var50 > ~class460.field6346; ++var50) {
                                var12[var44][var50] = class63.method436(var37, var36 + var50, var13 - -var44, arg2, -2860);
                            }
                        }
                        class209.field2868[var37].method278(0, 0, 1024, var13, var36, class460.field6346 + var13, class460.field6346 + var36, var12);
                        if (!class441.field6048) {
                            for (int var45 = -4; class460.field6346 > var45; ++var45) {
                                for (int var46 = -4; ~var46 > ~class460.field6346; ++var46) {
                                    int var47 = var13 - -var45;
                                    int var48 = var36 + var46;
                                    if (~var47 <= ~var3 && ~var48 <= ~var4 && class63.method436(var37, var48, var47, arg2, -2860)) {
                                        int var49 = var37;
                                        if (class401.method2330(var48, var47, arg1 ^ 2)) {
                                            var49 = var37 - 1;
                                        }
                                        if (~var49 <= -1) {
                                            class45.method321((class460.field6346 - var46) * 4 - 4, var45 * 4, (byte) -81, var10, var47, var9, var48, var49, arg0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class441.field6048) {
                        class173 var38 = class120.field1754[arg2];
                        for (int var39 = 0; var39 < class460.field6346; ++var39) {
                            for (int var40 = 0; class460.field6346 > var40; ++var40) {
                                int var41 = var13 - -var39;
                                int var42 = var36 + var40;
                                int var43 = var38.field2519[var41 - var38.field2512][-var38.field2522 + var42];
                                if ((var43 & 1076101120) == 0) {
                                    if ((8388608 & var43) == 0) {
                                        if (~(var43 & 33554432) == -1) {
                                            if (~(var43 & 134217728) == -1) {
                                                if (~(536870912 & var43) != -1) {
                                                    arg0.method1098(-14183, (-var40 + class460.field6346) * 4 + -4, -1713569622, 4, var39 * 4);
                                                }
                                            } else {
                                                arg0.method1092(-1713569622, -19380, 4, (-var40 + class460.field6346) * 4 + -4 + 3, var39 * 4);
                                            }
                                        } else {
                                            arg0.method1098(-14183, (-var40 + class460.field6346) * 4 + -4, -1713569622, 4, var39 * 4 + 3);
                                        }
                                    } else {
                                        arg0.method1092(-1713569622, -19380, 4, (-var40 + class460.field6346) * 4 + -4, var39 * 4);
                                    }
                                } else {
                                    arg0.method1093(4, var39 * 4, (-var40 + class460.field6346) * 4 + -4, 3, 4, -1713569622);
                                }
                            }
                        }
                    }
                    arg0.method585(0, 0, class460.field6346 * 4, class460.field6346 * 4, var11, 2);
                    client.field2740.method163((-var3 + var13) * 4 + 48, -((-var4 + var36) * 4) + -(class460.field6346 * 4) + 464, class460.field6346 * 4, class460.field6346 * 4, 0, 0);
                }
            }
            arg0.method539();
            arg0.method550(-16777215);
            class260.method1570(121);
            class108.field1574 = 0;
            class166.field2411.method1670((byte) -104);
            if (!class441.field6048) {
                for (int var14 = var3; ~(var3 + 104) < ~var14; ++var14) {
                    for (int var20 = var4; ~var20 > ~(var4 + 104); ++var20) {
                        for (int var21 = arg2; ~var21 >= ~(arg2 + 1) && var21 <= 3; ++var21) {
                            if (class63.method436(var21, var20, var14, arg2, -2860)) {
                                class338 var22 = (class338) class466.method2648(var21, var14, var20);
                                if (var22 == null) {
                                    var22 = (class338) class504.method2874(var21, var14, var20, field4396 != null ? field4396 : (field4396 = method1921("np")));
                                }
                                if (var22 == null) {
                                    var22 = (class338) class234.method1453(var21, var14, var20);
                                }
                                if (var22 == null) {
                                    var22 = (class338) class463.method2642(var21, var14, var20);
                                }
                                if (var22 != null) {
                                    class1 var23 = class402.field5388.method1994(-17294, var22.method347((byte) -87));
                                    if (!var23.field5 || class5.field151) {
                                        int var24 = var23.field92;
                                        if (var23.field58 != null) {
                                            for (int var25 = 0; var23.field58.length > var25; ++var25) {
                                                if (~var23.field58[var25] != 0) {
                                                    class1 var26 = class402.field5388.method1994(-17294, var23.field58[var25]);
                                                    if (~var26.field92 <= -1) {
                                                        var24 = var26.field92;
                                                    }
                                                }
                                            }
                                        }
                                        if (var24 >= 0) {
                                            boolean var27 = false;
                                            if (var24 >= 0) {
                                                class460 var28 = class267.field3522.method1014(var24, -22947);
                                                if (var28 != null && var28.field6362) {
                                                    var27 = true;
                                                }
                                            }
                                            int var29 = var14;
                                            int var30 = var20;
                                            if (var27) {
                                                int[][] var31 = class120.field1754[var21].field2519;
                                                int var32 = class120.field1754[var21].field2512;
                                                int var33 = class120.field1754[var21].field2522;
                                                for (int var34 = 0; var34 < 10; ++var34) {
                                                    int var35 = (int) (4.0D * Math.random());
                                                    if (var35 == 0 && var3 < var29 && ~(var14 + -3) > ~var29 && (2883848 & var31[-var32 + -1 + var29][-var33 + var30]) == 0) {
                                                        --var29;
                                                    }
                                                    if (~var35 == -2 && var29 < var3 - -104 - 1 && var29 < var14 - -3 && ~(2883968 & var31[var29 - (var32 + -1)][-var33 + var30]) == -1) {
                                                        ++var29;
                                                    }
                                                    if (var35 == 2 && var4 < var30 && var30 > var20 + -3 && (2883842 & var31[-var32 + var29][-1 - var33 + var30]) == 0) {
                                                        --var30;
                                                    }
                                                    if (~var35 == -4 && var4 + -1 - -104 > var30 && ~(var20 + 3) < ~var30 && (var31[-var32 + var29][var30 + 1 + -var33] & 2883872) == 0) {
                                                        ++var30;
                                                    }
                                                }
                                            }
                                            class167.field2427[class108.field1574] = var23.field33;
                                            class457.field6300[class108.field1574] = var29;
                                            class409.field5617[class108.field1574] = var30;
                                            ++class108.field1574;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (class277.field3629 != null) {
                    class258.field3420.field6535 = 1;
                    class267.field3522.method1009(1024, 64, false);
                    for (int var15 = 0; ~var15 > ~class277.field3629.field5356; ++var15) {
                        int var16 = class277.field3629.field5354[var15];
                        if (var16 >> 28 == class385.field5232.field573) {
                            int var17 = (16383 & var16 >> 14) + -class401.field5382;
                            int var18 = (var16 & 16383) + -class421.field5762;
                            if (~var17 <= -1 && var17 < class12.field251 && ~var18 <= -1 && ~class289.field3782 < ~var18) {
                                class166.field2411.method1666((byte) 101, new class387(var15));
                            } else {
                                class460 var19 = class267.field3522.method1014(class277.field3629.field5357[var15], -22947);
                                if (var19.field6330 != null && var19.field6357 + var17 >= 0 && ~(var17 - -var19.field6320) > ~class12.field251 && var19.field6335 + var18 >= 0 && ~class289.field3782 < ~(var18 - -var19.field6323)) {
                                    class166.field2411.method1666((byte) -56, new class387(var15));
                                }
                            }
                        }
                    }
                    class267.field3522.method1009(128, 64, false);
                    class258.field3420.field6535 = 2;
                    class258.field3420.method2718(arg1 + 100);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(III)Lgv;")
    public static final class56 method1917(int arg0, int arg1, int arg2) {
        class409 var3 = class497.field6886[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5607;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)[[I")
    public final int[][] method141(int arg0, int arg1) {
        ++field4394;
        int[][] var3 = super.field268.method2561(arg1, 0);
        if (arg0 != -30909) {
            this.method147(32, (byte) 48, (class379) null);
        }
        if (super.field268.field6091) {
            int[] var4 = this.method145(arg1 - 1 & class511.field7361, 0, arg0 ^ 12319);
            int[] var5 = this.method145(arg1, 0, -18596);
            int[] var6 = this.method145(arg1 + 1 & class511.field7361, 0, -18596);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; class115.field1637 > var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field4393;
                int var12 = (var5[class305.field4023 & var10 + 1] + -var5[class305.field4023 & var10 + -1]) * this.field4393;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 - -var16 + 4096) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 != -1) {
                    var18 = var11 / var17;
                    var19 = 16777216 / var17;
                    var20 = var12 / var17;
                } else {
                    var19 = 0;
                    var20 = 0;
                    var18 = 0;
                }
                if (this.field4392) {
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var7[var10] = var20;
                var8[var10] = var18;
                var9[var10] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)V")
    public static void method1918(int arg0) {
        field4395 = null;
        int var1 = -40 / ((arg0 - 68) / 36);
        field4387 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1919(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg5 & 3;
        ++field4391;
        if (~(arg1 & 1) == -2) {
            int var8 = arg0;
            arg0 = arg3;
            arg3 = var8;
        }
        if (arg6 != 1059) {
            return 68;
        } else if (var7 == 0) {
            return arg2;
        } else if (~var7 == -2) {
            return -arg0 - -1 + -arg4 + 7;
        } else {
            return ~var7 == -3 ? -arg2 + 7 - -1 - arg3 : arg4;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILqa;IIB)V")
    public static final void method1920(int arg0, int arg1, class162 arg2, int arg3, int arg4, byte arg5) {
        ++field4388;
        arg2.method572(arg1, arg3, arg1 - -arg4, arg3 - -arg0);
        arg2.method1093(arg0, arg1, arg3, arg5 ^ 121, arg4, -16777216);
        if (~class320.field4194 <= -101) {
            float var6 = (float) class6.field174 / (float) class6.field189;
            int var7 = arg4;
            int var8 = arg0;
            if (var6 < 1.0F) {
                var8 = (int) ((float) arg4 * var6);
            } else {
                var7 = (int) ((float) arg0 / var6);
            }
            int var9 = (-var8 + arg0) / 2 + arg3;
            int var10 = (-var7 + arg4) / 2 + arg1;
            if (class286.field3736 == null || ~arg4 != ~class286.field3736.method154() || class286.field3736.method161() != arg0) {
                class6.method33(class6.field175, class6.field174 + class6.field172, class6.field189 + class6.field175, class6.field172, var10, var9, var7 + var10, var9 - -var8);
                class6.method53(arg2);
                class286.field3736 = arg2.method618(var10, var9, var7, var8, false);
            }
            class286.field3736.method3109(var10, var9);
            int var11 = class483.field6724 * var7 / class6.field189;
            int var12 = class256.field3381 * var8 / class6.field174;
            int var13 = var10 - -(class265.field3494 * var7 / class6.field189);
            int var14 = var8 + var9 - (class347.field4633 * var8 / class6.field174 - -var12);
            int var15 = -1996554240;
            if (class191.field2691 == class155.field2265) {
                var15 = -1996488705;
            }
            if (arg5 == 122) {
                arg2.method585(var13, var14, var11, var12, var15, 1);
                arg2.method614(var13, var14, var11, var12, var15, 0);
                if (class497.field6891 > 0) {
                    int var16;
                    if (~class389.field5277 >= -51) {
                        var16 = class389.field5277 * 5;
                    } else {
                        var16 = (-class389.field5277 + 100) * 5;
                    }
                    for (class228 var17 = (class228) class6.field163.method1672((byte) -91); var17 != null; var17 = (class228) class6.field163.method1668(-1)) {
                        class460 var18 = class6.field160.method1014(var17.field3078, -22947);
                        if (class248.method1501(arg5 + -123, var18)) {
                            if (class392.field5309 != var17.field3078) {
                                if (class491.field6838 != -1 && class491.field6838 == var18.field6329) {
                                    int var19 = var10 - -(var17.field3073 * var7 / class6.field189);
                                    int var20 = var9 - -((class6.field174 - var17.field3065) * var8 / class6.field174);
                                    arg2.method1093(4, var19 + -2, var20 + -2, 3, 4, 16776960 | var16 << 24);
                                }
                            } else {
                                int var21 = var10 - -(var17.field3073 * var7 / class6.field189);
                                int var22 = (-var17.field3065 + class6.field174) * var8 / class6.field174 + var9;
                                arg2.method1093(4, var21 + -2, var22 + -2, 3, 4, 16776960 | var16 << 24);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
    public class335() {
        super(1, false);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IBLmd;)V")
    public final void method147(int arg0, byte arg1, class379 arg2) {
        int var4 = -22 % ((-51 - arg1) / 37);
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field4392 = ~arg2.method2238(255) == -2;
            }
        } else {
            this.field4393 = arg2.method2212((byte) 83);
        }
        ++field4390;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1921(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
