import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public abstract class class254 extends class85 {

    @OriginalMember(owner = "client!j", name = "z", descriptor = "Lgp;")
    public static class459 field3205 = new class459(3, 5);

    @OriginalMember(owner = "client!j", name = "G", descriptor = "I")
    public static int field3212 = 0;

    @OriginalMember(owner = "client!j", name = "D", descriptor = "I")
    public static int field3209 = 0;

    @OriginalMember(owner = "client!j", name = "E", descriptor = "I")
    public static int field3210 = -2;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!j", name = "A", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!j", name = "C", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!j", name = "F", descriptor = "Loa;")
    public static class167 field3211;

    @OriginalMember(owner = "client!j", name = "B", descriptor = "Lfr;")
    public static class493 field3207;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "H", descriptor = "Ljava/lang/Class;")
    public static Class field3213;

    // $FF: synthetic method
    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1588(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I[IZIII[ILbm;IIIIIII)I", line = 5)
    public static final int method1584(int arg0, int[] arg1, boolean arg2, int arg3, int arg4, int arg5, int[] arg6, class215 arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var36 = 0; var36 < 128; var36++) {
                class374.field4867[var15][var36] = 0;
                class258.field3262[var15][var36] = 99999999;
            }
        }
        field3208++;
        boolean var16;
        if (arg0 == 1) {
            var16 = class215.method1382(arg11, arg9, arg14, arg7, arg3, arg13, arg5, arg10, arg8, true, arg12);
        } else if (arg0 == 2) {
            var16 = class28.method187(arg12, arg9, arg5, (byte) -67, arg14, arg3, arg7, arg10, arg11, arg13, arg8);
        } else {
            var16 = class112.method734(arg5, arg12, arg3, arg8, (byte) -102, arg10, arg9, arg14, arg13, arg0, arg11, arg7);
        }
        int var17 = arg5 - 64;
        int var18 = arg10 - 64;
        int var19 = class482.field7025;
        int var20 = class328.field4213;
        if (!var16) {
            if (!arg2) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg3 - var23; var24 <= arg3 + var23; var24++) {
                for (int var25 = arg13 - var23; var25 <= arg13 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class258.field3262[var26][var27] < 100) {
                        int var28 = 0;
                        if (var24 < arg3) {
                            var28 = arg3 - var24;
                        } else if (var24 > arg3 + arg11 - 1) {
                            var28 = -arg11 - arg3 - (-1 - var24);
                        }
                        int var29 = 0;
                        if (var25 < arg13) {
                            var29 = arg13 - var25;
                        } else if (var25 > arg12 + arg13 - 1) {
                            var29 = var25 + 1 - arg12 - arg13;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var21 > var30 || var21 == var30 && var22 > class258.field3262[var26][var27]) {
                            var20 = var25;
                            var22 = class258.field3262[var26][var27];
                            var19 = var24;
                            var21 = var30;
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg5 == var19 && arg10 == var20) {
            return 0;
        }
        byte var31 = 0;
        class460.field6423[var31] = var19;
        int var38 = var31 + 1;
        class394.field5145[var31] = var20;
        int var32;
        int var33 = var32 = class374.field4867[var19 - var17][var20 - var18];
        while (arg5 != var19 || arg10 != var20) {
            if (var32 != var33) {
                var32 = var33;
                class460.field6423[var38] = var19;
                class394.field5145[var38++] = var20;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            var33 = class374.field4867[var19 - var17][var20 - var18];
        }
        int var34 = -50 / ((arg4 - 60) / 47);
        int var35 = 0;
        while (var38-- > 0) {
            arg1[var35] = class460.field6423[var38];
            arg6[var35++] = class394.field5145[var38];
            if (arg1.length <= var35) {
                break;
            }
        }
        return var35;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lqa;ZI)Z", line = 181)
    public static final boolean method1585(class129 arg0, boolean arg1, int arg2) {
        field3206++;
        int var3 = (class200.field2594 - 104) / 2;
        int var4 = (class118.field1647 - 104) / 2;
        boolean var5 = true;
        if (arg1) {
            return true;
        }
        for (int var6 = var3; var6 < (var3 + 104); var6++) {
            for (int var51 = var4; var51 < var4 + 104; var51++) {
                for (int var52 = arg2; var52 <= 3; var52++) {
                    if (class303.method1818(var51, arg2, -19236, var6, var52)) {
                        int var53 = var52;
                        if (class402.method2389((byte) 104, var51, var6)) {
                            var53 = var52 - 1;
                        }
                        if (var53 >= 0) {
                            var5 &= class513.method3054(19, var53, var51, var6);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class198.field2557 = arg0.method921(var7, 0, 512, 512, 512);
        class345.method2027((byte) -111);
        int var9 = (int) (Math.random() * 20.0D) + ((((int) (Math.random() * 20.0D)) + 238) - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 + -10 << 8) + 238 - 10 | 0xFF000000;
        int var10 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0x97CFF00) << 16;
        int var11 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
        boolean[][] var12 = new boolean[class453.field6331][class453.field6331];
        for (int var13 = var3; var13 < var3 + 104; var13 += class453.field6331) {
            for (int var36 = var4; var36 < (var4 + 104); var36 += class453.field6331) {
                arg0.method925(0, 0, class453.field6331 * 4, class453.field6331 * 4);
                arg0.method900(-16777216);
                for (int var37 = arg2; var37 <= 3; var37++) {
                    for (int var44 = 0; var44 < class453.field6331; var44++) {
                        for (int var50 = 0; var50 < class453.field6331; var50++) {
                            var12[var44][var50] = class303.method1818(var36 + var50, arg2, -19236, var13 + var44, var37);
                        }
                    }
                    class405.field5436[var37].method1178(0, 0, 1024, var13, var36, var13 + class453.field6331, class453.field6331 + var36, var12);
                    if (!class75.field947) {
                        for (int var45 = -4; var45 < class453.field6331; var45++) {
                            for (int var46 = -4; var46 < class453.field6331; var46++) {
                                int var47 = var13 + var45;
                                int var48 = var36 + var46;
                                if (var3 <= var47 && var48 >= var4 && class303.method1818(var48, arg2, -19236, var47, var37)) {
                                    int var49 = var37;
                                    if (class402.method2389((byte) 55, var48, var47)) {
                                        var49 = var37 - 1;
                                    }
                                    if (var49 >= 0) {
                                        class281.method1720(var47, var9, 0, arg0, var49, var45 * 4, (class453.field6331 - var46) * 4 - 4, var10, var48);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class75.field947) {
                    class215 var38 = class171.field2215[arg2];
                    for (int var39 = 0; var39 < class453.field6331; var39++) {
                        for (int var40 = 0; var40 < class453.field6331; var40++) {
                            int var41 = var13 + var39;
                            int var42 = var36 + var40;
                            int var43 = var38.field2742[var41 - var38.field2751][var42 - var38.field2754];
                            if ((var43 & 0x40240000) != 0) {
                                arg0.method866(4, -5152, var39 * 4, 4, (class453.field6331 - var40) * 4 - 4, -1713569622);
                            } else if ((var43 & 0x800000) != 0) {
                                arg0.method920(1, var39 * 4, (class453.field6331 - var40) * 4 - 4, -1713569622, 4);
                            } else if ((var43 & 0x2000000) != 0) {
                                arg0.method826(-1713569622, 4, (class453.field6331 - var40) * 4 - 4, (byte) 53, var39 * 4 + 3);
                            } else if ((var43 & 0x8000000) != 0) {
                                arg0.method920(1, var39 * 4, (class453.field6331 - var40) * 4 + 3 - 4, -1713569622, 4);
                            } else if ((var43 & 0x20000000) != 0) {
                                arg0.method826(-1713569622, 4, (class453.field6331 - var40) * 4 - 4, (byte) 53, var39 * 4);
                            }
                        }
                    }
                }
                arg0.method861(0, 0, class453.field6331 * 4, class453.field6331 * 4, var11, 2);
                class198.field2557.method354((var13 - var3) * 4 + 48, -((-var4 + var36) * 4) + 464 + -(class453.field6331 * 4), class453.field6331 * 4, class453.field6331 * 4, 0, 0);
            }
        }
        arg0.method865();
        arg0.method900(-16777215);
        class218.method1396((byte) 110);
        class201.field2633 = 0;
        class74.field930.method47(0);
        if (!class75.field947) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < var4 + 104; var20++) {
                    for (int var21 = arg2; var21 <= (arg2 + 1) && var21 <= 3; var21++) {
                        if (class303.method1818(var20, arg2, -19236, var14, var21)) {
                            class323 var22 = (class323) class205.method1342(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class323) class346.method2038(var21, var14, var20, field3213 == null ? (field3213 = method1588("wk")) : field3213);
                            }
                            if (var22 == null) {
                                var22 = (class323) class67.method384(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class323) class301.method1806(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class402 var23 = class52.field715.method1164(var22.method413(-30502), 0);
                                if (!var23.field5373 || class459.field6421) {
                                    int var24 = var23.field5335;
                                    if (var23.field5419 != null) {
                                        for (int var25 = 0; var25 < var23.field5419.length; var25++) {
                                            if (var23.field5419[var25] != -1) {
                                                class402 var26 = class52.field715.method1164(var23.field5419[var25], 0);
                                                if (var26.field5335 >= 0) {
                                                    var24 = var26.field5335;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class429 var28 = class117.field1643.method1093(var24, -73);
                                            if (var28 != null && var28.field5891) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class171.field2215[var21].field2742;
                                            int var32 = class171.field2215[var21].field2751;
                                            int var33 = class171.field2215[var21].field2754;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var3 < var29 && (var14 - 3) < var29 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var3 + 104 - 1 > var29 && var29 < (var14 + 3) && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var4 < var30 && (var20 - 3) < var30 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var30 < var4 + 104 - 1 && var30 < (var20 + 3) && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class6.field55[class201.field2633] = var23.field5377;
                                        class298.field3866[class201.field2633] = var29;
                                        class371.field4825[class201.field2633] = var30;
                                        class201.field2633++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class28.field475 != null) {
                class523.field7751.field2617 = 1;
                class117.field1643.method1089(64, -10, 1024);
                for (int var15 = 0; var15 < class28.field475.field832; var15++) {
                    int var16 = class28.field475.field835[var15];
                    if ((var16 >> 28) == class37.field573.field6220) {
                        int var17 = ((var16 & 0xFFFE931) >> 14) - class35.field545;
                        int var18 = (var16 & 0x3FFF) - class336.field4299;
                        if (var17 >= 0 && var17 < class200.field2594 && var18 >= 0 && class118.field1647 > var18) {
                            class74.field930.method42(new class206(var15), 0);
                        } else {
                            class429 var19 = class117.field1643.method1093(class28.field475.field833[var15], -99);
                            if (var19.field5901 != null && (var19.field5908 + var17) >= 0 && var19.field5895 + var17 < class200.field2594 && (var18 + var19.field5921) >= 0 && var19.field5915 + var18 < class118.field1647) {
                                class74.field930.method42(new class206(var15), 0);
                            }
                        }
                    }
                }
                class117.field1643.method1089(64, 122, 128);
                class523.field7751.field2617 = 2;
                class523.field7751.method1319(123);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V", line = 600)
    public static void method1586(int arg0) {
        field3205 = null;
        field3207 = null;
        if (arg0 == 4) {
            field3211 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lbt;Z)V", line = 618)
    public static final void method1587(class88 arg0, boolean arg1) {
        field3204++;
        int var2 = arg0.method604(-9338);
        class174.field2239 = new class174[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class174.field2239[var3] = new class174();
            class174.field2239[var3].field2243 = arg0.method604(-9338);
            class174.field2239[var3].field2241 = arg0.method585(!arg1);
        }
        class166.field2152 = arg0.method604(-9338);
        class116.field1632 = arg0.method604(-9338);
        class67.field831 = arg0.method604(-9338);
        class301.field3902 = new class311[class116.field1632 + 1 - class166.field2152];
        for (int var4 = 0; var4 < class67.field831; var4++) {
            int var5 = arg0.method604(-9338);
            class311 var6 = class301.field3902[var5] = new class311();
            var6.field633 = arg0.method617(2);
            var6.field634 = arg0.method578(126);
            var6.field4008 = class166.field2152 + var5;
            var6.field4009 = arg0.method585(false);
            var6.field4012 = arg0.method585(false);
        }
        class188.field2467 = arg0.method578(94);
        class503.field7399 = arg1;
    }
}
