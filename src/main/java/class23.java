import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class23 {

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "Z")
    public boolean field253 = false;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "Ljava/lang/String;")
    public static String field252 = "Loaded textures";

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public int field255;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public int field262;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "Lwf;")
    public static class333 field260;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)V", line = 5)
    public static final void method151(int arg0, int arg1, int arg2) {
        field264++;
        class78 var3 = class341.method2368(arg2, -9609);
        int var4 = var3.field1003;
        int var5 = var3.field1011;
        int var6 = var3.field1012;
        if (arg0 != 1006) {
            method154(false, 6, false, -60, (String) null, 13, -119, (byte) 48, 12L, false, (String) null);
        }
        int var7 = class137.field1869[var6 - var5];
        if (arg1 < 0 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class254.method1770(var4, (byte) -68, arg1 << var5 & var8 | ~var8 & class360.field5638[var4]);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V", line = 32)
    public static final void method152(int arg0) {
        field261++;
        try {
            int var1 = 64 % ((arg0 - 85) / 38);
            if (class194.field2673 == 1) {
                int var2 = class360.field5630.method1510(false);
                if (var2 > 0 && class360.field5630.method1519((byte) 70)) {
                    int var3 = var2 - class233.field3338;
                    if (var3 < 0) {
                        var3 = 0;
                    }
                    class360.field5630.method1501(128, var3);
                    return;
                }
                class360.field5630.method1523(21229);
                class360.field5630.method1506((byte) 99);
                if (class229.field3287 == null) {
                    class194.field2673 = 0;
                } else {
                    class194.field2673 = 2;
                }
                class172.field2385 = null;
                class100.field1315 = null;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class360.field5630.method1523(21229);
            class172.field2385 = null;
            class229.field3287 = null;
            class100.field1315 = null;
            class194.field2673 = 0;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILfd;II)V", line = 79)
    private final void method153(int arg0, class299 arg1, int arg2, int arg3) {
        if (arg3 == 1) {
            this.field262 = arg1.method2083((byte) -31);
        } else if (arg3 == 2) {
            this.field255 = arg1.method2085((byte) 126);
        } else if (arg3 == 3) {
            this.field253 = true;
        } else if (arg3 == 4) {
            this.field262 = -1;
        }
        if (arg0 <= -115) {
            field254++;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZIZILjava/lang/String;IIBJZLjava/lang/String;)V", line = 113)
    public static final void method154(boolean arg0, int arg1, boolean arg2, int arg3, String arg4, int arg5, int arg6, byte arg7, long arg8, boolean arg9, String arg10) {
        field257++;
        if (arg7 <= 115) {
            return;
        }
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class299 var14 = new class299(128);
        var14.method2048(10, 117);
        var14.method2098(-31, (arg2 ? 1 : 0) | (arg9 ? 2 : 0) | (arg0 ? 4 : 0));
        var14.method2049(-19780, arg8);
        var14.method2084(true, var12[0]);
        var14.method2042(arg10, -65);
        var14.method2084(true, var12[1]);
        var14.method2098(-27, class185.field2522);
        var14.method2048(arg1, 107);
        var14.method2048(arg5, 78);
        var14.method2084(true, var12[2]);
        var14.method2098(-13, arg6);
        var14.method2098(-71, arg3);
        var14.method2084(true, var12[3]);
        var14.method2095(class71.field926, class312.field4586, 0);
        class299 var15 = new class299(350);
        var15.method2042(arg4, -94);
        int var16 = 8 - (class173.method1271((byte) 88, arg4) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method2048((int) (Math.random() * 255.0D), 76);
        }
        var15.method2094(false, var12);
        class251.field3681.field4351 = 0;
        class251.field3681.method2048(22, 63);
        class251.field3681.method2098(-17, var14.field4351 + var15.field4351 + 2);
        class251.field3681.method2098(-53, 550);
        class251.field3681.method2061(0, var14.field4350, var14.field4351, (byte) -59);
        class251.field3681.method2061(0, var15.field4350, var15.field4351, (byte) -81);
        class210.field2970 = -3;
        class226.field3251 = 0;
        class145.field2025 = 0;
        class318.field4688 = 1;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIBI[Lwf;IIIII)V", line = 173)
    public static final void method155(int arg0, int arg1, byte arg2, int arg3, class333[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field259++;
        if (class47.field623) {
            class129.method989(arg9, arg7, arg6, arg5);
        } else {
            class37.method235(arg9, arg7, arg6, arg5);
            class350.method2444();
        }
        int var10 = 0;
        if (arg2 >= -100) {
            return;
        }
        while (var10 < arg4.length) {
            class333 var11 = arg4[var10];
            if (var11 != null && (var11.field5142 == arg1 || arg1 == -1412584499 && class33.field410 == var11)) {
                int var12;
                if (arg3 == -1) {
                    class64.field802[class345.field5370] = var11.field5188 + arg0;
                    class300.field4414[class345.field5370] = var11.field5045 + arg8;
                    class65.field826[class345.field5370] = var11.field5056;
                    class322.field4728[class345.field5370] = var11.field5172;
                    var12 = class345.field5370++;
                } else {
                    var12 = arg3;
                }
                var11.field5077 = class313.field4603;
                var11.field5198 = var12;
                if (!var11.field5154 || !client.method898(var11)) {
                    label1118: {
                        if (var11.field5084 > 0) {
                            class138.method1050(var11, 27);
                        }
                        int var13 = var11.field5083;
                        int var14 = var11.field5045 + arg8;
                        int var15 = var11.field5188 + arg0;
                        if (class40.field503 && (client.method891(var11).field1981 != 0 || var11.field5105 == 0) && var13 > 127) {
                            var13 = 127;
                        }
                        if (class33.field410 == var11) {
                            if (arg1 != -1412584499 && !var11.field5046) {
                                class300.field4411 = arg0;
                                class75.field996 = arg8;
                                class145.field2020 = arg4;
                                break label1118;
                            }
                            if (!var11.field5046) {
                                var13 = 128;
                            }
                            if (class106.field1377 && class75.field988) {
                                int var16 = class80.field1028;
                                int var17 = class105.field1361;
                                int var18 = var16 - client.field1638;
                                int var19 = var17 - class160.field2290;
                                if (class210.field2980 > var18) {
                                    var18 = class210.field2980;
                                }
                                if (var19 < class95.field1244) {
                                    var19 = class95.field1244;
                                }
                                if (var11.field5172 + var18 > class210.field2980 - -class100.field1311.field5172) {
                                    var18 = class210.field2980 - (var11.field5172 - class100.field1311.field5172);
                                }
                                if (class95.field1244 + class100.field1311.field5056 < var11.field5056 + var19) {
                                    var19 = class95.field1244 + class100.field1311.field5056 - var11.field5056;
                                }
                                var15 = var19;
                                var14 = var18;
                            }
                        }
                        int var20;
                        int var21;
                        int var24;
                        int var25;
                        if (var11.field5105 == 2) {
                            var20 = arg7;
                            var25 = arg6;
                            var21 = arg9;
                            var24 = arg5;
                        } else {
                            var20 = arg7 < var14 ? var14 : arg7;
                            var21 = var15 <= arg9 ? arg9 : var15;
                            int var22 = var15 + var11.field5056;
                            int var23 = var14 + var11.field5172;
                            if (var11.field5105 == 9) {
                                var22++;
                                var23++;
                            }
                            var24 = var23 >= arg5 ? arg5 : var23;
                            var25 = var22 >= arg6 ? arg6 : var22;
                        }
                        if (!var11.field5154 || var21 < var25 && var24 > var20) {
                            label1136: {
                                if (var11.field5084 != 0) {
                                    if (var11.field5084 == 1337 || var11.field5084 == 1403) {
                                        class182.field2486 = var15;
                                        class344.field5351 = var11;
                                        class304.field4453 = var14;
                                        class29.method188(0, var15, var11.field5172, var11.field5084 == 1403, var11.field5056, var14);
                                        class229.field3276[var12] = true;
                                        if (class47.field623) {
                                            class129.method989(arg9, arg7, arg6, arg5);
                                        } else {
                                            class37.method235(arg9, arg7, arg6, arg5);
                                        }
                                        break label1136;
                                    }
                                    if (var11.field5084 == 1338) {
                                        if (!var11.method2334(-1)) {
                                            break label1136;
                                        }
                                        class354.method2467(var15, var12, var11, var14, 0);
                                        if (class47.field623) {
                                            class129.method989(arg9, arg7, arg6, arg5);
                                        } else {
                                            class37.method235(arg9, arg7, arg6, arg5);
                                        }
                                        if (class160.field2292 != 0 && class160.field2292 != 3 || class159.field2263 || class73.field971 < var21 || var20 > class302.field4434 || var25 <= class73.field971 || class302.field4434 >= var24) {
                                            break label1136;
                                        }
                                        int var41 = class73.field971 - var15;
                                        int var42 = class302.field4434 - var14;
                                        int var43 = var11.field5195[var42];
                                        if (var43 > var41 || var41 > (var11.field5057[var42] + var43)) {
                                            break label1136;
                                        }
                                        int var44 = var42 - var11.field5172 / 2;
                                        int var45 = (int) class247.field3601 + class354.field5534 & 0x7FF;
                                        int var46 = class350.field5476[var45];
                                        int var47 = var41 - var11.field5056 / 2;
                                        int var48 = (class318.field4690 + 256) * var46 >> 8;
                                        int var49 = class350.field5474[var45];
                                        int var50 = (class318.field4690 + 256) * var49 >> 8;
                                        int var51 = var44 * var48 + (var47 * var50) >> 11;
                                        int var52 = var44 * var50 - (var47 * var48) >> 11;
                                        int var53 = class359.field5616.field4855 + var51 + 64 - class359.field5616.method1699(-1) * 64 >> 7;
                                        int var54 = class359.field5616.field4893 + 64 - (var52 + (class359.field5616.method1699(-1) * 64)) >> 7;
                                        if (class276.field3954 && (class119.field1579 & 0x40) != 0) {
                                            class333 var55 = class283.method1926(class315.field4649, (byte) 82, class71.field936);
                                            if (var55 == null) {
                                                class26.method174((byte) 126);
                                            } else {
                                                class148.method1140(1L, var53, var54, " ->", class351.field5485, (short) 19, class274.field3932, (byte) 26);
                                            }
                                            break label1136;
                                        }
                                        if (class299.field4362 == 1) {
                                            class148.method1140(1L, var53, var54, "", class357.field5589, (short) 47, -1, (byte) -88);
                                        }
                                        class148.method1140(1L, var53, var54, "", class169.field2346, (short) 26, -1, (byte) -90);
                                        break label1136;
                                    }
                                    if (var11.field5084 == 1339) {
                                        if (var11.method2334(-1)) {
                                            class280.method1892(var11, (byte) 12, var14, var12, var15);
                                            if (class47.field623) {
                                                class129.method989(arg9, arg7, arg6, arg5);
                                            } else {
                                                class37.method235(arg9, arg7, arg6, arg5);
                                            }
                                        }
                                        break label1136;
                                    }
                                    if (var11.field5084 == 1400) {
                                        class357.method2479(var11.field5172, (byte) -114, var14, var15, var11.field5056);
                                        class229.field3276[var12] = true;
                                        class185.field2520[var12] = true;
                                        if (class47.field623) {
                                            class129.method989(arg9, arg7, arg6, arg5);
                                        } else {
                                            class37.method235(arg9, arg7, arg6, arg5);
                                        }
                                        break label1136;
                                    }
                                    if (var11.field5084 == 1401) {
                                        class66.method481(var11.field5172, -18418, var11.field5056, var15, var14);
                                        class229.field3276[var12] = true;
                                        class185.field2520[var12] = true;
                                        if (class47.field623) {
                                            class129.method989(arg9, arg7, arg6, arg5);
                                        } else {
                                            class37.method235(arg9, arg7, arg6, arg5);
                                        }
                                        break label1136;
                                    }
                                    if (var11.field5084 == 1402) {
                                        if (!class47.field623) {
                                            class149.method1145(-1, var14, var15);
                                            class229.field3276[var12] = true;
                                            class185.field2520[var12] = true;
                                        }
                                        break label1136;
                                    }
                                    if (var11.field5084 == 1405) {
                                        if (!class234.field3352) {
                                            break label1136;
                                        }
                                        int var26 = var15 + var11.field5056;
                                        int var27 = var14 + 15;
                                        class235.field3374.method1915("Fps:" + class287.field4153, var26, var27, 16776960, -1);
                                        Runtime var28 = Runtime.getRuntime();
                                        int var142 = var27 + 15;
                                        int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                        int var30 = 16776960;
                                        if (var29 > 65536) {
                                            var30 = 16711680;
                                        }
                                        class235.field3374.method1915("Mem:" + var29 + "k", var26, var142, var30, -1);
                                        var27 = var142 + 15;
                                        if (class47.field623) {
                                            int var31 = 16776960;
                                            int var32 = (class298.field4319 + class298.field4318 + class298.field4323) / 1024;
                                            if (var32 > 65536) {
                                                var31 = 16711680;
                                            }
                                            class235.field3374.method1915("Card:" + var32 + "k", var26, var27, var31, -1);
                                            var27 += 15;
                                        }
                                        int var33 = 16776960;
                                        int var34 = 0;
                                        int var35 = 0;
                                        int var36 = 0;
                                        for (int var37 = 0; var37 < 29; var37++) {
                                            var36 += class116.field1513[var37].method1686(0);
                                            var34 += class116.field1513[var37].method1682(true);
                                            var35 += class116.field1513[var37].method1675(1);
                                        }
                                        int var38 = var35 * 100 / var36;
                                        int var39 = var34 * 10000 / var36;
                                        String var40 = "Cache:" + class225.method1630((long) var39, true, -116, 2, 0) + "% (" + var38 + "%)";
                                        class327.field4771.method1915(var40, var26, var27, var33, -1);
                                        var27 += 12;
                                        if (class187.field2569 > 0) {
                                            class327.field4771.method1915("Particles: " + class187.field2572 + " / " + class187.field2569, var26, var27, var33, -1);
                                        }
                                        var27 += 12;
                                        class229.field3276[var12] = true;
                                        class185.field2520[var12] = true;
                                        break label1136;
                                    }
                                    if (var11.field5084 == 1406) {
                                        class306.field4476 = var15;
                                        class82.field1060 = var14;
                                        class322.field4727 = var11;
                                        break label1136;
                                    }
                                }
                                if (!class159.field2263) {
                                    if (var11.field5105 == 0 && var11.field5069 && var21 <= class73.field971 && class302.field4434 >= var20 && class73.field971 < var25 && var24 > class302.field4434 && !class40.field503) {
                                        class156.field2169[0] = 1006;
                                        class185.field2524[0] = class84.field1077;
                                        class328.field4805[0] = "";
                                        class42.field533[0] = class99.field1300;
                                        class66.field853 = 1;
                                    }
                                    if (class73.field971 >= var21 && var20 <= class302.field4434 && class73.field971 < var25 && var24 > class302.field4434) {
                                        class130.method999(var11, 88, class302.field4434 - var14, class73.field971 - var15);
                                    }
                                }
                                if (var11.field5105 == 0) {
                                    if (!var11.field5154 && client.method898(var11) && class204.field2845 != var11) {
                                        break label1136;
                                    }
                                    if (!var11.field5154) {
                                        if (var11.field5044 - var11.field5172 < var11.field5134) {
                                            var11.field5134 = var11.field5044 - var11.field5172;
                                        }
                                        if (var11.field5134 < 0) {
                                            var11.field5134 = 0;
                                        }
                                    }
                                    if (class47.field623 && var11.field5084 == 1407) {
                                        class46.method330(var15, var14, var11.field5056, var11.field5172);
                                    }
                                    method155(var15 - var11.field5136, var11.field5109, (byte) -105, var12, arg4, var24, var25, var20, var14 - var11.field5134, var21);
                                    if (var11.field5187 != null) {
                                        method155(var15 - var11.field5136, var11.field5109, (byte) -108, var12, var11.field5187, var24, var25, var20, var14 - var11.field5134, var21);
                                    }
                                    class74 var56 = (class74) class272.field3900.method2279((long) var11.field5109, -121);
                                    if (var56 != null) {
                                        if (var56.field981 == 0 && !class159.field2263 && class73.field971 >= var21 && class302.field4434 >= var20 && var25 > class73.field971 && class302.field4434 < var24 && !class40.field503) {
                                            class156.field2169[0] = 1006;
                                            class42.field533[0] = class99.field1300;
                                            class185.field2524[0] = class84.field1077;
                                            class328.field4805[0] = "";
                                            class66.field853 = 1;
                                        }
                                        class341.method2372(var56.field982, var20, var14, (byte) -81, var15, var24, var21, var25, var12);
                                    }
                                    if (class47.field623 && var11.field5084 == 1407) {
                                        class46.method336();
                                        class103.field1345 = true;
                                    }
                                    if (class47.field623) {
                                        class129.method989(arg9, arg7, arg6, arg5);
                                    } else {
                                        class37.method235(arg9, arg7, arg6, arg5);
                                        class350.method2444();
                                    }
                                }
                                if (class306.field4485[var12] || class159.field2259 > 1) {
                                    if (var11.field5105 == 0 && !var11.field5154 && var11.field5172 < var11.field5044) {
                                        class125.method926(var11.field5172, (byte) 80, var11.field5056 + var15, var11.field5044, var14, var11.field5134);
                                    }
                                    if (var11.field5105 != 1) {
                                        if (var11.field5105 == 2) {
                                            int var57 = 0;
                                            for (int var58 = 0; var58 < var11.field5173; var58++) {
                                                for (int var59 = 0; var59 < var11.field5127; var59++) {
                                                    int var60 = (var11.field5193 + 32) * var58 + var14;
                                                    int var61 = (var11.field5157 + 32) * var59 + var15;
                                                    if (var57 < 20) {
                                                        var60 += var11.field5096[var57];
                                                        var61 += var11.field5098[var57];
                                                    }
                                                    if (var11.field5088[var57] > 0) {
                                                        boolean var62 = false;
                                                        int var63 = var11.field5088[var57] - 1;
                                                        boolean var64 = false;
                                                        if (var61 + 32 > arg9 && var61 < arg6 && arg7 < (var60 + 32) && var60 < arg5 || class348.field5455 == var11 && class273.field3910 == var57) {
                                                            class158 var65;
                                                            if (class339.field5304 == 1 && class32.field372 == var57 && class104.field1357 == var11.field5109) {
                                                                var65 = class102.method724(var11.field5093[var57], 2, var11.field5065, (byte) -127, (class125) null, var63, 0);
                                                            } else {
                                                                var65 = class102.method724(var11.field5093[var57], 1, var11.field5065, (byte) -94, (class125) null, var63, 3153952);
                                                            }
                                                            if (class350.field5468) {
                                                                class229.field3276[var12] = true;
                                                            }
                                                            if (var65 == null) {
                                                                class142.method1097(45, var11);
                                                            } else if (class348.field5455 == var11 && class273.field3910 == var57) {
                                                                int var66 = class105.field1361 - class154.field2141;
                                                                int var67 = class80.field1028 - class78.field1005;
                                                                if (var66 < 5 && var66 > -5) {
                                                                    var66 = 0;
                                                                }
                                                                if (var67 < 5 && var67 > -5) {
                                                                    var67 = 0;
                                                                }
                                                                if (class227.field3260 < 5) {
                                                                    var67 = 0;
                                                                    var66 = 0;
                                                                }
                                                                var65.method68(var61 + var66, var60 - -var67, 128);
                                                                if (arg1 != -1) {
                                                                    class333 var68 = arg4[arg1 & 0xFFFF];
                                                                    int var69;
                                                                    int var70;
                                                                    if (class47.field623) {
                                                                        var69 = class129.field1762;
                                                                        var70 = class129.field1766;
                                                                    } else {
                                                                        var69 = class37.field453;
                                                                        var70 = class37.field446;
                                                                    }
                                                                    if ((var60 + var67) < var70 && var68.field5134 > 0) {
                                                                        int var71 = (var70 - var67 - var60) * class186.field2551 / 3;
                                                                        if (class186.field2551 * 10 < var71) {
                                                                            var71 = class186.field2551 * 10;
                                                                        }
                                                                        if (var68.field5134 < var71) {
                                                                            var71 = var68.field5134;
                                                                        }
                                                                        class78.field1005 += var71;
                                                                        var68.field5134 -= var71;
                                                                        class142.method1097(29, var68);
                                                                    }
                                                                    if (var69 < (var60 - (-var67 - 32)) && var68.field5134 < (var68.field5044 - var68.field5172)) {
                                                                        int var72 = (var60 + 32 - (-var67 + var69)) * class186.field2551 / 3;
                                                                        if (var72 > class186.field2551 * 10) {
                                                                            var72 = class186.field2551 * 10;
                                                                        }
                                                                        if (var72 > var68.field5044 - var68.field5172 - var68.field5134) {
                                                                            var72 = var68.field5044 - var68.field5172 - var68.field5134;
                                                                        }
                                                                        var68.field5134 += var72;
                                                                        class78.field1005 -= var72;
                                                                        class142.method1097(-125, var68);
                                                                    }
                                                                }
                                                            } else if (class245.field3568 == var11 && class209.field2958 == var57) {
                                                                var65.method68(var61, var60, 128);
                                                            } else {
                                                                var65.method85(var61, var60);
                                                            }
                                                        }
                                                    } else if (var11.field5066 != null && var57 < 20) {
                                                        class158 var73 = var11.method2320((byte) 121, var57);
                                                        if (var73 != null) {
                                                            var73.method85(var61, var60);
                                                        } else if (class276.field3963) {
                                                            class142.method1097(-126, var11);
                                                        }
                                                    }
                                                    var57++;
                                                }
                                            }
                                        } else if (var11.field5105 == 3) {
                                            int var74;
                                            if (class210.method1544(var11, (byte) -121)) {
                                                var74 = var11.field5081;
                                                if (class204.field2845 == var11 && var11.field5204 != 0) {
                                                    var74 = var11.field5204;
                                                }
                                            } else {
                                                var74 = var11.field5138;
                                                if (class204.field2845 == var11 && var11.field5197 != 0) {
                                                    var74 = var11.field5197;
                                                }
                                            }
                                            if (var13 == 0) {
                                                if (var11.field5132) {
                                                    if (class47.field623) {
                                                        class129.method997(var15, var14, var11.field5056, var11.field5172, var74);
                                                    } else {
                                                        class37.method231(var15, var14, var11.field5056, var11.field5172, var74);
                                                    }
                                                } else if (class47.field623) {
                                                    class129.method986(var15, var14, var11.field5056, var11.field5172, var74);
                                                } else {
                                                    class37.method248(var15, var14, var11.field5056, var11.field5172, var74);
                                                }
                                            } else if (var11.field5132) {
                                                if (class47.field623) {
                                                    class129.method987(var15, var14, var11.field5056, var11.field5172, var74, 256 - (var13 & 0xFF));
                                                } else {
                                                    class37.method239(var15, var14, var11.field5056, var11.field5172, var74, 256 - (var13 & 0xFF));
                                                }
                                            } else if (class47.field623) {
                                                class129.method980(var15, var14, var11.field5056, var11.field5172, var74, 256 - (var13 & 0xFF));
                                            } else {
                                                class37.method247(var15, var14, var11.field5056, var11.field5172, var74, 256 - (var13 & 0xFF));
                                            }
                                        } else if (var11.field5105 == 4) {
                                            class281 var75 = var11.method2330((byte) 54, class357.field5584);
                                            if (var75 != null) {
                                                String var76 = var11.field5058;
                                                int var77;
                                                if (class210.method1544(var11, (byte) -105)) {
                                                    var77 = var11.field5081;
                                                    if (class204.field2845 == var11 && var11.field5204 != 0) {
                                                        var77 = var11.field5204;
                                                    }
                                                    if (var11.field5043.length() > 0) {
                                                        var76 = var11.field5043;
                                                    }
                                                } else {
                                                    var77 = var11.field5138;
                                                    if (class204.field2845 == var11 && var11.field5197 != 0) {
                                                        var77 = var11.field5197;
                                                    }
                                                }
                                                if (var11.field5154 && var11.field5143 != -1) {
                                                    class362 var78 = class172.method1265(var11.field5143, (byte) -128);
                                                    var76 = var78.field5674;
                                                    if (var76 == null) {
                                                        var76 = "null";
                                                    }
                                                    if ((var78.field5685 == 1 || var11.field5191 != 1) && var11.field5191 != -1) {
                                                        var76 = "<col=ff9040>" + var76 + "</col> x" + class26.method178((byte) 126, var11.field5191);
                                                    }
                                                }
                                                if (class215.field3038 == var11) {
                                                    var76 = class170.field2361;
                                                    var77 = var11.field5138;
                                                }
                                                if (!var11.field5154) {
                                                    var76 = class344.method2391(var11, 2, var76);
                                                }
                                                var75.method1896(var76, var15, var14, var11.field5056, var11.field5172, var77, var11.field5153 ? 0 : -1, var11.field5123, var11.field5121, var11.field5170);
                                            } else if (class276.field3963) {
                                                class142.method1097(-128, var11);
                                            }
                                        } else if (var11.field5105 == 5) {
                                            if (!var11.field5154) {
                                                class158 var125 = var11.method2325(class210.method1544(var11, (byte) -115), (byte) -18);
                                                if (var125 != null) {
                                                    var125.method85(var15, var14);
                                                } else if (class276.field3963) {
                                                    class142.method1097(15, var11);
                                                }
                                            } else if (var11.field5205 >= 0) {
                                                class324 var141 = var11.method2322(0);
                                                if (class47.field623) {
                                                    var141.method2239(0, var15, var14, var11.field5056, var11.field5172, var11.field5194, var11.field5115, 0);
                                                } else {
                                                    var141.method2238(0, var15, var14, var11.field5056, var11.field5172, var11.field5194, var11.field5115, 0);
                                                }
                                            } else {
                                                class158 var126;
                                                if (var11.field5143 == -1) {
                                                    var126 = var11.method2325(false, (byte) -18);
                                                } else if (var11.field5217 && class359.field5616.field3480 != null) {
                                                    var126 = class102.method724(var11.field5191, var11.field5209, var11.field5065, (byte) -63, class359.field5616.field3480, var11.field5143, var11.field5139);
                                                } else {
                                                    var126 = class102.method724(var11.field5191, var11.field5209, var11.field5065, (byte) -115, (class125) null, var11.field5143, var11.field5139);
                                                }
                                                if (var126 != null) {
                                                    int var127 = var126.field2244;
                                                    int var128 = var126.field2255;
                                                    if (var11.field5112) {
                                                        int var129 = (var11.field5056 + var127 - 1) / var127;
                                                        int var130 = (var11.field5172 - (1 - var128)) / var128;
                                                        if (class47.field623) {
                                                            class129.method988(var15, var14, var11.field5056 + var15, var14 - -var11.field5172);
                                                            boolean var131 = class277.method1876((byte) 91, var126.field2252);
                                                            class361 var132 = (class361) var126;
                                                            boolean var133 = class277.method1876((byte) 96, var126.field2250);
                                                            if (var131 && var133) {
                                                                if (var13 == 0) {
                                                                    var132.method2509(var15, var14, var129, var130);
                                                                } else {
                                                                    var132.method2506(var15, var14, 256 - (var13 & 0xFF), var129, var130);
                                                                }
                                                            } else if (var131) {
                                                                for (int var137 = 0; var137 < var130; var137++) {
                                                                    if (var13 == 0) {
                                                                        var132.method2509(var15, var128 * var137 + var14, var129, 1);
                                                                    } else {
                                                                        var132.method2506(var15, var128 * var137 + var14, -(var13 & 0xFF) + 256, var129, 1);
                                                                    }
                                                                }
                                                            } else if (var133) {
                                                                for (int var136 = 0; var136 < var129; var136++) {
                                                                    if (var13 == 0) {
                                                                        var132.method2509(var15 + (var127 * var136), var14, 1, var130);
                                                                    } else {
                                                                        var132.method2506(var127 * var136 + var15, var14, 256 - (var13 & 0xFF), 1, var130);
                                                                    }
                                                                }
                                                            } else {
                                                                for (int var134 = 0; var134 < var129; var134++) {
                                                                    for (int var135 = 0; var135 < var130; var135++) {
                                                                        if (var13 == 0) {
                                                                            var126.method85(var127 * var134 + var15, var128 * var135 + var14);
                                                                        } else {
                                                                            var126.method68(var127 * var134 + var15, var128 * var135 + var14, 256 - (var13 & 0xFF));
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            class129.method989(arg9, arg7, arg6, arg5);
                                                        } else {
                                                            class37.method246(var15, var14, var11.field5056 + var15, var11.field5172 + var14);
                                                            for (int var138 = 0; var138 < var129; var138++) {
                                                                for (int var139 = 0; var139 < var130; var139++) {
                                                                    if (var11.field5184 != 0) {
                                                                        var126.method1215(var128 / 2 + (var14 + (var128 * var139)), (byte) -99, var11.field5184, var127 * var138 + (var15 + (var127 / 2)), 4096);
                                                                    } else if (var13 == 0) {
                                                                        var126.method85(var15 + (var127 * var138), var128 * var139 + var14);
                                                                    } else {
                                                                        var126.method68(var127 * var138 + var15, var128 * var139 + var14, 256 - (var13 & 0xFF));
                                                                    }
                                                                }
                                                            }
                                                            class37.method235(arg9, arg7, arg6, arg5);
                                                        }
                                                    } else {
                                                        int var140 = var11.field5056 * 4096 / var127;
                                                        if (var11.field5184 != 0) {
                                                            var126.method1215(var11.field5172 / 2 + var14, (byte) -99, var11.field5184, var11.field5056 / 2 + var15, var140);
                                                        } else if (var13 != 0) {
                                                            var126.method86(var15, var14, var11.field5056, var11.field5172, 256 - (var13 & 0xFF));
                                                        } else if (var11.field5056 == var127 && var11.field5172 == var128) {
                                                            var126.method85(var15, var14);
                                                        } else {
                                                            var126.method70(var15, var14, var11.field5056, var11.field5172);
                                                        }
                                                    }
                                                } else if (class276.field3963) {
                                                    class142.method1097(18, var11);
                                                }
                                            }
                                        } else if (var11.field5105 == 6) {
                                            boolean var79 = class210.method1544(var11, (byte) -90);
                                            class81 var80 = null;
                                            int var81;
                                            if (var79) {
                                                var81 = var11.field5100;
                                            } else {
                                                var81 = var11.field5053;
                                            }
                                            int var82 = 0;
                                            if (var11.field5143 != -1) {
                                                class362 var83 = class172.method1265(var11.field5143, (byte) -122);
                                                if (var83 != null) {
                                                    class362 var84 = var83.method2517(true, var11.field5191);
                                                    class314 var85 = var81 == -1 ? null : class207.method1516(var81, 126);
                                                    if (var11.field5217 && class359.field5616.field3480 != null) {
                                                        var80 = var84.method2516(var11.field5054, 1, -115, var11.field5218, class359.field5616.field3480, var85, var11.field5074);
                                                    } else {
                                                        var80 = var84.method2516(var11.field5054, 1, -78, var11.field5218, (class125) null, var85, var11.field5074);
                                                    }
                                                    if (var80 == null) {
                                                        class142.method1097(57, var11);
                                                    } else {
                                                        var82 = -var80.method583() / 2;
                                                    }
                                                }
                                            } else if (var11.field5144 == 5) {
                                                if (var11.field5070 == -1) {
                                                    var80 = class100.field1307.method927((class274[]) null, -1, -1, -1, (class314) null, -1, -7453, false, 0, (class314) null, true, 0);
                                                } else {
                                                    int var87 = var11.field5070 & 0x7FF;
                                                    if (class103.field1333 == var87) {
                                                        var87 = 2047;
                                                    }
                                                    class239 var88 = class311.field4574[var87];
                                                    class314 var89 = var81 == -1 ? null : class207.method1516(var81, 123);
                                                    if (var88 != null && (int) class201.method1476(-121, var88.field3475) << 11 == (var11.field5070 & 0xFFFFF800)) {
                                                        var80 = var88.field3480.method927((class274[]) null, 0, -1, -1, (class314) null, var11.field5054, -7453, false, 0, var89, true, 0);
                                                    }
                                                }
                                            } else if (var81 == -1) {
                                                var80 = var11.method2319((class314) null, class359.field5616.field3480, -1, (byte) -83, -1, 0, var79);
                                                if (var80 == null && class276.field3963) {
                                                    class142.method1097(-122, var11);
                                                }
                                            } else {
                                                class314 var86 = class207.method1516(var81, 122);
                                                var80 = var11.method2319(var86, class359.field5616.field3480, var11.field5218, (byte) -83, var11.field5054, var11.field5074, var79);
                                                if (var80 == null && class276.field3963) {
                                                    class142.method1097(-119, var11);
                                                }
                                            }
                                            if (var80 != null) {
                                                int var90;
                                                if (var11.field5183 <= 0) {
                                                    var90 = 256;
                                                } else {
                                                    var90 = (var11.field5056 << 8) / var11.field5183;
                                                }
                                                int var91;
                                                if (var11.field5119 <= 0) {
                                                    var91 = 256;
                                                } else {
                                                    var91 = (var11.field5172 << 8) / var11.field5119;
                                                }
                                                int var92 = var14 + (var11.field5172 / 2) + (var11.field5120 * var91 >> 8);
                                                int var93 = (var11.field5091 * var90 >> 8) + var11.field5056 / 2 + var15;
                                                if (class47.field623) {
                                                    if (var11.field5159) {
                                                        class47.method355(var93, var92, var11.field5116, var11.field5212, var90, var91);
                                                    } else {
                                                        class47.method356(var93, var92, var90, var91);
                                                        class47.method378((float) var11.field5178, (float) var11.field5212 * 1.5F);
                                                    }
                                                    class47.method375();
                                                    class47.method345(true);
                                                    class47.method350(false);
                                                    class55.method421(class254.field3713, -78);
                                                    if (class103.field1345) {
                                                        class129.method994();
                                                        class47.method360();
                                                        class129.method989(arg9, arg7, arg6, arg5);
                                                        class103.field1345 = false;
                                                    }
                                                    if (var11.field5114) {
                                                        class47.method346();
                                                    }
                                                    int var96 = class350.field5474[var11.field5160] * var11.field5116 >> 16;
                                                    int var97 = class350.field5476[var11.field5160] * var11.field5116 >> 16;
                                                    if (var11.field5154) {
                                                        var80.method579(0, var11.field5210, var11.field5042, var11.field5160, var11.field5192, var82 + var97 + var11.field5087, var11.field5087 + var96, -1L);
                                                    } else {
                                                        var80.method579(0, var11.field5210, 0, var11.field5160, 0, var97, var96, -1L);
                                                    }
                                                    if (var11.field5114) {
                                                        class47.method348();
                                                    }
                                                } else {
                                                    class350.method2439(var93, var92);
                                                    int var94 = class350.field5474[var11.field5160] * var11.field5116 >> 16;
                                                    int var95 = class350.field5476[var11.field5160] * var11.field5116 >> 16;
                                                    if (!var11.field5154) {
                                                        var80.method579(0, var11.field5210, 0, var11.field5160, 0, var95, var94, -1L);
                                                    } else if (var11.field5159) {
                                                        ((class332) var80).method2313(0, var11.field5210, var11.field5042, var11.field5160, var11.field5192, var95 + var82 + var11.field5087, var11.field5087 + var94, var11.field5116);
                                                    } else {
                                                        var80.method579(0, var11.field5210, var11.field5042, var11.field5160, var11.field5192, var82 + var95 + var11.field5087, var94 - -var11.field5087, -1L);
                                                    }
                                                    class350.method2438();
                                                }
                                            }
                                        } else {
                                            if (var11.field5105 == 7) {
                                                class281 var98 = var11.method2330((byte) 54, class357.field5584);
                                                if (var98 == null) {
                                                    if (class276.field3963) {
                                                        class142.method1097(-116, var11);
                                                    }
                                                    break label1136;
                                                }
                                                int var99 = 0;
                                                for (int var100 = 0; var100 < var11.field5173; var100++) {
                                                    for (int var101 = 0; var101 < var11.field5127; var101++) {
                                                        if (var11.field5088[var99] > 0) {
                                                            class362 var102 = class172.method1265(var11.field5088[var99] - 1, (byte) -121);
                                                            String var103;
                                                            if (var102.field5685 != 1 && var11.field5093[var99] == 1) {
                                                                var103 = "<col=ff9040>" + var102.field5674 + "</col>";
                                                            } else {
                                                                var103 = "<col=ff9040>" + var102.field5674 + "</col> x" + class26.method178((byte) 126, var11.field5093[var99]);
                                                            }
                                                            int var104 = (var11.field5157 + 115) * var101 + var15;
                                                            int var105 = (var11.field5193 + 12) * var100 + var14;
                                                            if (var11.field5123 == 0) {
                                                                var98.method1900(var103, var104, var105, var11.field5138, var11.field5153 ? 0 : -1);
                                                            } else if (var11.field5123 == 1) {
                                                                var98.method1911(var103, var104 + 57, var105, var11.field5138, var11.field5153 ? 0 : -1);
                                                            } else {
                                                                var98.method1915(var103, var104 + 114, var105, var11.field5138, var11.field5153 ? 0 : -1);
                                                            }
                                                        }
                                                        var99++;
                                                    }
                                                }
                                            }
                                            if (var11.field5105 == 8 && class353.field5508 == var11 && class86.field1096 == class302.field4422) {
                                                int var106 = 0;
                                                class281 var107 = class235.field3374;
                                                int var108 = 0;
                                                String var109 = var11.field5058;
                                                String var110 = class344.method2391(var11, 2, var109);
                                                while (var110.length() > 0) {
                                                    int var111 = var110.indexOf("<br>");
                                                    String var112;
                                                    if (var111 == -1) {
                                                        var112 = var110;
                                                        var110 = "";
                                                    } else {
                                                        var112 = var110.substring(0, var111);
                                                        var110 = var110.substring(var111 + 4);
                                                    }
                                                    int var113 = var107.method1894(var112);
                                                    if (var113 > var106) {
                                                        var106 = var113;
                                                    }
                                                    var108 += var107.field3999 + 1;
                                                }
                                                var108 += 7;
                                                var106 += 6;
                                                int var114 = var11.field5172 + var14 + 5;
                                                if (arg5 < (var108 + var114)) {
                                                    var114 = arg5 - var108;
                                                }
                                                int var115 = var11.field5056 + var15 - (var106 + 5);
                                                if (var115 < (var15 + 5)) {
                                                    var115 = var15 + 5;
                                                }
                                                if ((var106 + var115) > arg6) {
                                                    var115 = arg6 - var106;
                                                }
                                                if (class47.field623) {
                                                    class129.method997(var115, var114, var106, var108, 16777120);
                                                    class129.method986(var115, var114, var106, var108, 0);
                                                } else {
                                                    class37.method231(var115, var114, var106, var108, 16777120);
                                                    class37.method248(var115, var114, var106, var108, 0);
                                                }
                                                int var116 = var107.field3999 + var114 + 2;
                                                String var117 = var11.field5058;
                                                String var118 = class344.method2391(var11, 2, var117);
                                                while (var118.length() > 0) {
                                                    int var119 = var118.indexOf("<br>");
                                                    String var120;
                                                    if (var119 == -1) {
                                                        var120 = var118;
                                                        var118 = "";
                                                    } else {
                                                        var120 = var118.substring(0, var119);
                                                        var118 = var118.substring(var119 + 4);
                                                    }
                                                    var107.method1900(var120, var115 + 3, var116, 0, -1);
                                                    var116 += var107.field3999 + 1;
                                                }
                                            }
                                            if (var11.field5105 == 9) {
                                                int var121;
                                                int var122;
                                                int var123;
                                                int var124;
                                                if (var11.field5099) {
                                                    var121 = var11.field5056 + var15;
                                                    var122 = var15;
                                                    var123 = var14;
                                                    var124 = var11.field5172 + var14;
                                                } else {
                                                    var122 = var15;
                                                    var121 = var11.field5056 + var15;
                                                    var123 = var11.field5172 + var14;
                                                    var124 = var14;
                                                }
                                                if (var11.field5076 == 1) {
                                                    if (class47.field623) {
                                                        class129.method979(var122, var124, var121, var123, var11.field5138);
                                                    } else {
                                                        class37.method230(var122, var124, var121, var123, var11.field5138);
                                                    }
                                                } else if (class47.field623) {
                                                    class129.method983(var122, var124, var121, var123, var11.field5138, var11.field5076);
                                                } else {
                                                    class37.method241(var122, var124, var121, var123, var11.field5138, var11.field5076);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var10++;
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V", line = 1491)
    public static final void method156(int arg0) {
        if (arg0 != 255) {
            field258 = 57;
        }
        field256++;
        class133.field1806.method2258((byte) 86);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZLfd;)V", line = 1508)
    public final void method157(int arg0, boolean arg1, class299 arg2) {
        field263++;
        while (true) {
            int var4 = arg2.method2096((byte) -122);
            if (var4 == 0) {
                if (arg1) {
                    this.field253 = true;
                }
                return;
            }
            this.method153(-126, arg2, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZI)Lfe;", line = 1540)
    public final class153 method158(int arg0, boolean arg1, int arg2) {
        field265++;
        class153 var4 = (class153) class72.field963.method2265((long) (arg2 << 16 | this.field262 | (arg1 ? 262144 : 0)), (byte) -85);
        if (var4 != null) {
            return var4;
        }
        class310.field4559.method1076(this.field262, 79);
        class153 var5 = class354.method2463(arg0 ^ 0xFFFFFFDF, 0, class310.field4559, this.field262);
        if (var5 != null) {
            var5.method1176(class238.field3443, class273.field3916, class331.field4841);
            var5.field2028 = var5.field2024;
            var5.field2026 = var5.field2029;
            if (arg1) {
                var5.method1177();
            }
            for (int var6 = 0; var6 < arg2; var6++) {
                var5.method1178();
            }
            class72.field963.method2257(-125, var5, (long) (this.field262 | arg2 << 16 | (arg1 ? 262144 : 0)));
        }
        return arg0 == -1 ? var5 : (class153) null;
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)V", line = 1579)
    public static void method159(int arg0) {
        field260 = null;
        field252 = null;
        if (arg0 != 0) {
            field260 = (class333) null;
        }
    }
}
