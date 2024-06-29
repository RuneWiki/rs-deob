import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class177 {

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
    private int field3220;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
    private int field3223;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "[[I")
    private int[][] field3214;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "J")
    public static long field3211 = 0L;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "Lhe;")
    public static class94 field3222 = new class94(64);

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
    public static int field3225 = 0;

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "[[I")
    public static int[][] field3227 = new int[5][5000];

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "Lhe;")
    public static class94 field3226 = new class94(5);

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IB)I", line = 7)
    public static final int method1247(int arg0, byte arg1) {
        int var2 = -32 % ((8 - arg1) / 32);
        int var3 = (arg0 & 0xCA) >> 6;
        field3219++;
        int var4 = arg0 & 0x3F;
        if (var4 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var4 == 19 || var4 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BI)I", line = 61)
    public final int method1248(byte arg0, int arg1) {
        if (this.field3214 != null) {
            arg1 = ((int) ((long) this.field3220 * (long) arg1 / (long) this.field3223)) + 6;
        }
        field3218++;
        if (arg0 != -116) {
            method1256(80);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIZII)V", line = 84)
    public static final void method1249(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field3212++;
        if (arg5) {
            return;
        }
        if (arg3 == arg6) {
            class81.method548(arg2, arg4, (byte) 96, arg6, arg1, arg7, arg0);
        } else if (class260.field4593 <= arg2 - arg6 && class79.field1202 >= (arg2 + arg6) && class266.field4677 <= (arg7 - arg3) && class166.field2984 >= arg3 + arg7) {
            class268.method1943(arg6, arg0, arg2, arg3, arg7, arg4, (byte) -74, arg1);
        } else {
            class197.method1399(arg3, arg7, 769014469, arg0, arg6, arg2, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V", line = 117)
    public static void method1250(int arg0) {
        field3226 = null;
        field3227 = (int[][]) null;
        if (arg0 != 19029) {
            method1250(82);
        }
        field3222 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)Lia;", line = 132)
    public static final class212 method1251(int arg0, int arg1) {
        field3217++;
        class212 var2 = (class212) class322.field5516.method642((long) arg1, (byte) -126);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class172.field3141.method1868(arg0 + 12236, 16, arg1);
        if (arg0 != 0) {
            return (class212) null;
        }
        class212 var4 = new class212();
        if (var3 != null) {
            var4.method1461(-943, new class249(var3));
        }
        class322.field5516.method643((byte) -49, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V", line = 157)
    public static final void method1252(int arg0) {
        field3221++;
        class163 var1 = (class163) class326.field5565.method13(0);
        if (arg0 >= -84) {
            method1252(12);
        }
        while (var1 != null) {
            if (var1.field2918 > 0) {
                var1.field2918--;
            }
            if (var1.field2918 != 0) {
                if (var1.field2924 > 0) {
                    var1.field2924--;
                }
                if (var1.field2924 == 0 && var1.field2929 >= 1 && var1.field2908 >= 1 && var1.field2929 <= 102 && var1.field2908 <= 102 && (var1.field2911 < 0 || class211.method1459((byte) 65, var1.field2911, var1.field2917))) {
                    class47.method333(var1.field2917, var1.field2908, var1.field2928, var1.field2909, -6662, var1.field2926, var1.field2929, var1.field2911);
                    var1.field2924 = -1;
                    if (var1.field2920 == var1.field2911 && var1.field2920 == -1) {
                        var1.method1325(0);
                    } else if (var1.field2920 == var1.field2911 && var1.field2928 == var1.field2912 && var1.field2917 == var1.field2913) {
                        var1.method1325(0);
                    }
                }
            } else if (var1.field2920 < 0 || class211.method1459((byte) 65, var1.field2920, var1.field2913)) {
                class47.method333(var1.field2913, var1.field2908, var1.field2912, var1.field2909, -6662, var1.field2926, var1.field2929, var1.field2920);
                var1.method1325(0);
            }
            var1 = (class163) class326.field5565.method15((byte) 47);
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BI[Loj;IZI[BI)V", line = 213)
    public static final void method1253(byte arg0, int arg1, class328[] arg2, int arg3, boolean arg4, int arg5, byte[] arg6, int arg7) {
        field3209++;
        byte var8;
        if (arg4) {
            var8 = 1;
        } else {
            var8 = 4;
        }
        if (!arg4) {
            for (int var9 = 0; var9 < 4; var9++) {
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if ((arg1 + var10) > 0 && arg1 + var10 < 103 && arg3 + var11 > 0 && arg3 + var11 < 103) {
                            arg2[var9].field5605[arg1 + var10][arg3 + var11] = class162.method1118(arg2[var9].field5605[arg1 + var10][arg3 + var11], -16777217);
                        }
                    }
                }
            }
        }
        class249 var12 = new class249(arg6);
        if (arg0 <= 37) {
            method1253((byte) 126, -85, (class328[]) null, -127, false, -103, (byte[]) null, -26);
        }
        for (int var13 = 0; var13 < var8; var13++) {
            for (int var14 = 0; var14 < 64; var14++) {
                for (int var15 = 0; var15 < 64; var15++) {
                    class195.method1392(arg4, (byte) -124, arg7, var13, arg3 + var15, var14 - -arg1, 0, arg5, var12);
                }
            }
        }
        boolean var16 = false;
        while (var12.field4314 < var12.field4338.length) {
            int var17 = var12.method1731(true);
            if (var17 != 129) {
                var12.field4314--;
                break;
            }
            for (int var18 = 0; var18 < 4; var18++) {
                byte var19 = var12.method1721((byte) 107);
                if (var19 == 0) {
                    int var29 = arg1 + 64;
                    int var30 = arg3;
                    int var31 = arg1;
                    if (var29 < 0) {
                        var29 = 0;
                    } else if (var29 >= 104) {
                        var29 = 104;
                    }
                    int var32 = arg3 + 64;
                    if (var32 < 0) {
                        var32 = 0;
                    } else if (var32 >= 104) {
                        var32 = 104;
                    }
                    if (arg3 < 0) {
                        var30 = 0;
                    } else if (arg3 >= 104) {
                        var30 = 104;
                    }
                    if (arg1 < 0) {
                        var31 = 0;
                    } else if (arg1 >= 104) {
                        var31 = 104;
                    }
                    while (var31 < var29) {
                        while (var30 < var32) {
                            class311.field5382[var18][var31][var30] = 0;
                            var30++;
                        }
                        var31++;
                    }
                } else if (var19 == 1) {
                    for (int var20 = 0; var20 < 64; var20 += 4) {
                        for (int var21 = 0; var21 < 64; var21 += 4) {
                            byte var22 = var12.method1721((byte) 87);
                            for (int var23 = var20 + arg1; var23 < arg1 + var20 + 4; var23++) {
                                for (int var24 = arg3 + var21; var24 < arg3 + var21 + 4; var24++) {
                                    if (var23 >= 0 && var23 < 104 && var24 >= 0 && var24 < 104) {
                                        class311.field5382[var18][var23][var24] = var22;
                                    }
                                }
                            }
                        }
                    }
                } else if (var19 == 2 && var18 > 0) {
                    int var25 = arg1;
                    if (arg1 < 0) {
                        var25 = 0;
                    } else if (arg1 >= 104) {
                        var25 = 104;
                    }
                    int var26 = arg1 + 64;
                    if (var26 < 0) {
                        var26 = 0;
                    } else if (var26 >= 104) {
                        var26 = 104;
                    }
                    int var27 = arg3;
                    if (arg3 < 0) {
                        var27 = 0;
                    } else if (arg3 >= 104) {
                        var27 = 104;
                    }
                    int var28 = arg3 + 64;
                    if (var28 < 0) {
                        var28 = 0;
                    } else if (var28 >= 104) {
                        var28 = 104;
                    }
                    while (var25 < var26) {
                        while (var27 < var28) {
                            class311.field5382[var18][var25][var27] = class311.field5382[var18 - 1][var25][var27];
                            var27++;
                        }
                        var25++;
                    }
                }
            }
            var16 = true;
        }
        if (class231.field4051 && !arg4) {
            class186 var33 = null;
            label265: while (true) {
                int var35;
                label258: do {
                    while (var12.field4338.length > var12.field4314) {
                        int var34 = var12.method1731(true);
                        if (var34 != 0) {
                            if (var34 != 1) {
                                throw new IllegalStateException();
                            }
                            var35 = var12.method1731(true);
                            continue label258;
                        }
                        var33 = new class186(var12);
                    }
                    if (var33 == null) {
                        var33 = new class186();
                    }
                    for (int var40 = 0; var40 < 8; var40++) {
                        for (int var41 = 0; var41 < 8; var41++) {
                            int var42 = (arg3 >> 3) + var41;
                            int var43 = (arg1 >> 3) + var40;
                            if (var43 >= 0 && var43 < 13 && var42 >= 0 && var42 < 13) {
                                class123.field2094[var43][var42] = var33;
                            }
                        }
                    }
                    break label265;
                } while (var35 <= 0);
                for (int var36 = 0; var36 < var35; var36++) {
                    class46 var37 = new class46(var12);
                    var37.field674 += arg3 << 7;
                    var37.field678 += arg1 << 7;
                    int var38 = var37.field678 >> 7;
                    int var39 = var37.field674 >> 7;
                    if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) {
                        var37.field683 = class278.field4883[var37.field671][var38][var39] - var37.field683;
                        class267.method1929(var37);
                    }
                }
            }
        }
        if (var16) {
            return;
        }
        for (int var44 = 0; var44 < 4; var44++) {
            for (int var45 = 0; var45 < 16; var45++) {
                for (int var46 = 0; var46 < 16; var46++) {
                    int var47 = (arg1 >> 2) + var45;
                    int var48 = (arg3 >> 2) + var46;
                    if (var47 >= 0 && var47 < 26 && var48 >= 0 && var48 < 26) {
                        class311.field5382[var44][var47][var48] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(BI)I", line = 597)
    public final int method1254(byte arg0, int arg1) {
        if (arg0 != -1) {
            this.method1255(124, (byte[]) null);
        }
        if (this.field3214 != null) {
            arg1 = (int) ((long) this.field3220 * (long) arg1 / (long) this.field3223);
        }
        field3210++;
        return arg1;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I[B)[B", line = 614)
    public final byte[] method1255(int arg0, byte[] arg1) {
        int var3 = -104 % ((arg0 + 30) / 36);
        field3215++;
        if (this.field3214 != null) {
            int var4 = (int) ((long) arg1.length * (long) this.field3220 / (long) this.field3223) + 14;
            int[] var5 = new int[var4];
            int var6 = 0;
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.length; var8++) {
                int[] var9 = this.field3214[var7];
                byte var10 = arg1[var8];
                for (int var11 = 0; var11 < 14; var11++) {
                    var5[var6 + var11] += var9[var11] * var10;
                }
                int var12 = this.field3220 + var7;
                int var13 = var12 / this.field3223;
                var6 += var13;
                var7 = var12 - this.field3223 * var13;
            }
            arg1 = new byte[var4];
            for (int var14 = 0; var14 < var4; var14++) {
                int var15 = var5[var14] + 32768 >> 16;
                if (var15 < -128) {
                    arg1[var14] = -128;
                } else if (var15 > 127) {
                    arg1[var14] = 127;
                } else {
                    arg1[var14] = (byte) var15;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)V", line = 685)
    public static final void method1256(int arg0) {
        class185.field3406 = class144.field2540;
        class327.field5583 = class181.field3328;
        class47.field701 = class237.field4150;
        class220.field3906 = class299.field5195;
        class182.field3345 = class288.field5030;
        class92.field1453 = class100.field1768;
        if (arg0 != -6105) {
            return;
        }
        class9.field110 = class287.field5023;
        class201.field3642 = class13.field154;
        class216.field3844 = class78.field1175;
        class94.field1511 = class86.field1371;
        class123.field2097 = class224.field3959;
        class288.field5045 = class83.field1283;
        class242.field4220 = class132.field2267;
        class172.field3139 = class92.field1476;
        class19.field286 = class115.field1987;
        class328.field5603 = class167.field2997;
        class207.field3711 = class273.field4804;
        class301.field5241 = class142.field2497;
        class277.field4871 = class129.field2206;
        class104.field1811 = class106.field1836;
        class156.field2811 = client.field4531;
        class210.field3745 = class307.field5342;
        class328.field5610 = class167.field2997;
        class64.field1032 = class29.field443;
        class9.field108 = class161.field2887;
        class87.field1373 = class90.field1421;
        class72.field1101 = class171.field3066;
        class116.field2006 = class170.field3044;
        class117.field2035 = class202.field3651;
        class15.field190 = class203.field3663;
        class62.field998 = class180.field3263;
        class198.field3565 = class57.field834;
        class288.field5026 = class303.field5265;
        class151.field2738 = class46.field690;
        class55.field807 = class227.field3983;
        class135.field2327 = class91.field1430;
        class184.field3390 = class247.field4275;
        class301.field5236 = class311.field5376;
        class24.field368 = class126.field2131;
        class131.field2255 = class166.field2979;
        class144.field2545 = class134.field2312;
        class13.field151 = class54.field794;
        class1.field21 = class305.field5310;
        class326.field5547 = class114.field1974;
        class209.field3737 = class122.field2082;
        class305.field5320 = class298.field5187;
        class180.field3282 = class284.field4972;
        class162.field2891 = class326.field5577;
        class185.field3391 = class7.field85;
        class329.field5626 = class86.field1369;
        class149.field2725 = class330.field5635;
        class17.field209 = class86.field1360;
        class25.field394 = class25.field395;
        class91.field1441 = class14.field165;
        class157.field2828 = class110.field1929;
        class25.field390 = class326.field5555;
        class286.field5012 = class13.field149;
        class218.field3889 = class187.field3434;
        class293.field5125 = class61.field970;
        class196.field3551 = class123.field2092;
        class301.field5240 = class199.field3569;
        class72.field1097 = class171.field3066;
        class173.field3167 = class135.field2331;
        class276.field4829 = class119.field2047;
        class166.field2992 = class180.field3275;
        class46.field688 = class154.field2779;
        field3216++;
        class322.field5514 = class311.field5371;
        class256.field4461 = class197.field3557;
        class201.field3639 = class270.field4727;
        class325.field5534 = class142.field2495;
        class331.field5656 = class247.field4283;
        class258.field4558 = class58.field855;
        class87.field1374 = class232.field4109;
        class132.field2268 = class284.field4973;
        class156.field2815 = class43.field565;
        class121.field2076 = class252.field4398;
        class129.field2203 = class2.field48;
        class149.field2710 = class294.field5133;
        class13.field148 = class54.field794;
        class211.field3764 = class305.field5302;
        class8.field99 = class315.field5431;
        class285.field4980 = class221.field3925;
        class255.field4442 = class247.field4286;
        class268.field4703 = class62.field990;
        class252.field4393 = class2.field44;
        class201.field3629 = class74.field1143;
        class75.field1148 = class212.field3774;
        class215.field3809 = class43.field568;
        class255.field4438 = class266.field4678;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILsf;BILsf;Lsf;)V", line = 1020)
    public static final void method1257(int arg0, class108 arg1, byte arg2, int arg3, class108 arg4, class108 arg5) {
        field3213++;
        if (arg2 >= -61) {
            field3222 = (class94) null;
        }
        for (int var6 = 99; var6 > 0; var6--) {
            class95.field1517[var6] = class95.field1517[var6 - 1];
            class74.field1112[var6] = class74.field1112[var6 - 1];
            class212.field3784[var6] = class212.field3784[var6 - 1];
            class280.field4912[var6] = class280.field4912[var6 - 1];
            class154.field2766[var6] = class154.field2766[var6 - 1];
        }
        class172.field3142 = class242.field4217;
        class74.field1112[0] = arg5;
        class212.field3784[0] = arg4;
        class280.field4912[0] = arg1;
        class130.field2225++;
        class95.field1517[0] = arg3;
        class154.field2766[0] = arg0;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BLsf;)Z", line = 1053)
    public static final boolean method1258(byte arg0, class108 arg1) {
        field3224++;
        if (arg0 != -37) {
            method1249(91, 60, -120, 43, 5, false, -94, 55);
        }
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class176.field3205; var2++) {
            if (arg1.method781(class51.field752[var2], arg0 - 26284)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(II)V", line = 1080)
    public class177(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class265.method1917(arg1, (byte) 71, arg0);
            int var4 = arg1 / var3;
            this.field3220 = var4;
            int var5 = arg0 / var3;
            this.field3223 = var5;
            this.field3214 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field3214[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                if (var10 < 0) {
                    var10 = 0;
                }
                double var12 = (double) var4 / (double) var5;
                while (var11 > var10) {
                    double var14 = var12;
                    double var16 = ((double) var10 - var8) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var12 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
