import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class44 {

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "[I")
    public static int[] field594 = new int[14];

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "J")
    public static long field602 = 0L;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "Ljava/lang/String;")
    public static String field598 = "Loaded wordpack";

    @OriginalMember(owner = "client!nn", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field605 = null;

    @OriginalMember(owner = "client!nn", name = "k", descriptor = "I")
    public static int field604 = 0;

    @OriginalMember(owner = "client!nn", name = "n", descriptor = "Ljava/lang/String;")
    public static String field607 = "slide:";

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "I")
    public int field596;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "I")
    public int field597;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "I")
    public int field599;

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!nn", name = "o", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!nn", name = "j", descriptor = "Ldm;")
    public static class300 field603;

    @OriginalMember(owner = "client!nn", name = "m", descriptor = "Lkb;")
    public static class39 field606;

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "[Ln;")
    public static class298[] field601;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V", line = 18)
    public static void method296(int arg0) {
        field598 = null;
        field605 = null;
        field594 = null;
        field603 = null;
        field607 = null;
        field601 = null;
        if (arg0 <= 32) {
            field607 = (String) null;
        }
        field606 = null;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIIIII)V", line = 34)
    public static final void method297(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field608++;
        if (class49.field676 == 0) {
            int var7 = class131.field1931;
            int var8 = class338.field5244;
            int var9 = class287.field4527;
            int var10 = class204.field3334;
            int var11 = (arg4 - arg1) * (var9 - var10) / arg0 + var10;
            int var12 = (arg6 - arg5) * (var7 - var8) / arg3 + var8;
            if (class313.field4874 && (class26.field374 & 0x40) != 0) {
                class160 var13 = class241.method1709(class288.field4531, -61, class131.field1933);
                if (var13 == null) {
                    class10.method58((byte) 40);
                } else {
                    class22.method142(class24.field344, (short) 24, var12, 114, var11, " ->", class282.field4458, 0L);
                }
            } else {
                class320.field4998++;
                if (class20.field290 == 1) {
                    class22.method142(-1, (short) 9, var12, 96, var11, "", class17.field226, 0L);
                }
                class22.method142(-1, (short) 29, var12, 40, var11, "", class10.field113, 0L);
            }
        }
        if (arg2 < 96) {
            return;
        }
        long var14 = -1L;
        for (int var16 = 0; var16 < class283.field4470; var16++) {
            long var17 = class250.field3974[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = (int) var17 >> 7 & 0x7F;
            int var21 = ((int) var17 & 0x617091C0) >> 29;
            int var22 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            if (var14 != var17) {
                var14 = var17;
                if (var21 == 2 && class99.method704(class148.field2209, var19, var20, var17)) {
                    class149 var23 = class291.method2043(var22, 23006);
                    if (var23.field2223 != null) {
                        var23 = var23.method1052(true);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class49.field676 == 1) {
                        class224.field3565++;
                        class22.method142(class198.field3248, (short) 16, var19, 53, var20, class318.field4930 + " -> <col=00ffff>" + var23.field2297, class138.field2068, var17);
                    } else if (class313.field4874) {
                        class191 var24 = class297.field4656 == -1 ? null : class189.method1332(1178651532, class297.field4656);
                        if ((class26.field374 & 0x4) != 0 && (var24 == null || var23.method1050(var24.field3096, class297.field4656, -2) != var24.field3096)) {
                            class22.method142(class24.field344, (short) 36, var19, -110, var20, class315.field4903 + " -> <col=00ffff>" + var23.field2297, class282.field4458, var17);
                            class127.field1894++;
                        }
                    } else {
                        String[] var25 = var23.field2263;
                        if (class208.field3408) {
                            var25 = class152.method1063(var25, 5);
                        }
                        class229.field3660++;
                        if (var25 != null) {
                            for (int var26 = 4; var26 >= 0; var26--) {
                                if (var25[var26] != null) {
                                    class172.field2739++;
                                    int var27 = -1;
                                    short var28 = 0;
                                    if (var26 == 0) {
                                        var28 = 37;
                                    }
                                    if (var26 == 1) {
                                        var28 = 48;
                                    }
                                    if (var23.field2238 == var26) {
                                        var27 = var23.field2245;
                                    }
                                    if (var26 == 2) {
                                        var28 = 57;
                                    }
                                    if (var23.field2273 == var26) {
                                        var27 = var23.field2260;
                                    }
                                    if (var26 == 3) {
                                        var28 = 51;
                                    }
                                    if (var26 == 4) {
                                        var28 = 1005;
                                    }
                                    class22.method142(var27, var28, var19, 92, var20, "<col=00ffff>" + var23.field2297, var25[var26], var17);
                                }
                            }
                        }
                        class22.method142(class86.field1311, (short) 1007, var19, 73, var20, "<col=00ffff>" + var23.field2297, class173.field2768, (long) var23.field2299);
                    }
                }
                if (var21 == 1) {
                    class196 var29 = class297.field4657[var22];
                    if ((var29.field3210.field1808 & 0x1) == 0 && (var29.field1980 & 0x7F) == 0 && (var29.field1944 & 0x7F) == 0 || (var29.field3210.field1808 & 0x1) == 1 && (var29.field1980 & 0x7F) == 64 && (var29.field1944 & 0x7F) == 64) {
                        int var30 = var29.field1980 - ((var29.field3210.field1808 - 1) * 64);
                        int var31 = var29.field1944 + 64 - (var29.field3210.field1808 * 64);
                        for (int var32 = 0; var32 < class176.field2875; var32++) {
                            class196 var33 = class297.field4657[class128.field1906[var32]];
                            if (var33 != null && !var33.field2014 && var29 != var33 && var33.field2017) {
                                int var34 = var33.field1980 - ((var33.field3210.field1808 - 1) * 64);
                                int var35 = var33.field1944 + 64 - var33.field3210.field1808 * 64;
                                if (var34 >= var30 && (var29.field3210.field1808 - (var34 - var30 >> 7)) >= var33.field3210.field1808 && var31 <= var35 && var33.field3210.field1808 <= (var29.field3210.field1808 - (var35 - var31 >> 7))) {
                                    class284.method2009(var19, var20, class128.field1906[var32], var33.field3210, -1);
                                    var33.field2014 = true;
                                }
                            }
                        }
                        for (int var36 = 0; var36 < class24.field350; var36++) {
                            class320 var37 = class100.field1523[class103.field1575[var36]];
                            if (var37 != null && !var37.field2014 && var37.field2017) {
                                int var38 = var37.field1980 - (var37.method910(-1) * 64 - 64);
                                int var39 = var37.field1944 - (var37.method910(-1) * 64 - 64);
                                if (var30 <= var38 && var37.method910(-1) <= var29.field3210.field1808 - (var38 - var30 >> 7) && var31 <= var39 && var37.method910(-1) <= var29.field3210.field1808 - (var39 - var31 >> 7)) {
                                    class63.method424(690, var20, class103.field1575[var36], var37, var19);
                                    var37.field2014 = true;
                                }
                            }
                        }
                    }
                    if (var29.field2014) {
                        continue;
                    }
                    class284.method2009(var19, var20, var22, var29.field3210, -1);
                    var29.field2014 = true;
                }
                if (var21 == 0) {
                    class320 var40 = class100.field1523[var22];
                    if ((var40.field1980 & 0x7F) == 64 && (var40.field1944 & 0x7F) == 64) {
                        int var41 = var40.field1980 - (var40.method910(-1) - 1) * 64;
                        int var42 = var40.field1944 - (var40.method910(-1) - 1) * 64;
                        for (int var43 = 0; var43 < class176.field2875; var43++) {
                            class196 var44 = class297.field4657[class128.field1906[var43]];
                            if (var44 != null && !var44.field2014 && var44.field2017) {
                                int var45 = var44.field1980 + 64 - (var44.field3210.field1808 * 64);
                                int var46 = var44.field1944 - (var44.field3210.field1808 * 64 - 64);
                                if (var41 <= var45 && var44.field3210.field1808 <= (var40.method910(-1) - (var45 - var41 >> 7)) && var46 >= var42 && var44.field3210.field1808 <= (var40.method910(-1) - (var46 - var42 >> 7))) {
                                    class284.method2009(var19, var20, class128.field1906[var43], var44.field3210, -1);
                                    var44.field2014 = true;
                                }
                            }
                        }
                        for (int var47 = 0; var47 < class24.field350; var47++) {
                            class320 var48 = class100.field1523[class103.field1575[var47]];
                            if (var48 != null && !var48.field2014 && var40 != var48 && var48.field2017) {
                                int var49 = var48.field1980 - (var48.method910(-1) * 64 - 64);
                                int var50 = var48.field1944 - (var48.method910(-1) - 1) * 64;
                                if (var49 >= var41 && var48.method910(-1) <= (var40.method910(-1) - (var49 - var41 >> 7)) && var50 >= var42 && var48.method910(-1) <= var40.method910(-1) - (var50 - var42 >> 7)) {
                                    class63.method424(690, var20, class103.field1575[var47], var48, var19);
                                    var48.field2014 = true;
                                }
                            }
                        }
                    }
                    if (var40.field2014) {
                        continue;
                    }
                    class63.method424(690, var20, var22, var40, var19);
                    var40.field2014 = true;
                }
                if (var21 == 3) {
                    class256 var51 = class116.field1745[class148.field2209][var19][var20];
                    if (var51 != null) {
                        for (class209 var52 = (class209) var51.method1802(2838); var52 != null; var52 = (class209) var51.method1801(-1)) {
                            int var53 = var52.field3414.field342;
                            class74 var54 = class31.method198(false, var53);
                            if (class49.field676 == 1) {
                                class22.method142(class198.field3248, (short) 1, var19, -107, var20, class318.field4930 + " -> <col=ff9040>" + var54.field996, class138.field2068, (long) var53);
                                client.field4219++;
                            } else if (class313.field4874) {
                                class191 var55 = class297.field4656 == -1 ? null : class189.method1332(1178651532, class297.field4656);
                                if ((class26.field374 & 0x1) != 0 && (var55 == null || var54.method475(class297.field4656, var55.field3096, -13510) != var55.field3096)) {
                                    class192.field3137++;
                                    class22.method142(class24.field344, (short) 6, var19, -114, var20, class315.field4903 + " -> <col=ff9040>" + var54.field996, class282.field4458, (long) var53);
                                }
                            } else {
                                class204.field3331++;
                                String[] var56 = var54.field971;
                                if (class208.field3408) {
                                    var56 = class152.method1063(var56, 5);
                                }
                                for (int var57 = 4; var57 >= 0; var57--) {
                                    if (var56 != null && var56[var57] != null) {
                                        int var58 = -1;
                                        class19.field267++;
                                        byte var59 = 0;
                                        if (var54.field932 == var57) {
                                            var58 = var54.field955;
                                        }
                                        if (var57 == 0) {
                                            var59 = 41;
                                        }
                                        if (var57 == 1) {
                                            var59 = 8;
                                        }
                                        if (var57 == 2) {
                                            var59 = 23;
                                        }
                                        if (var54.field944 == var57) {
                                            var58 = var54.field988;
                                        }
                                        if (var57 == 3) {
                                            var59 = 50;
                                        }
                                        if (var57 == 4) {
                                            var59 = 58;
                                        }
                                        class22.method142(var58, var59, var19, -8, var20, "<col=ff9040>" + var54.field996, var56[var57], (long) var53);
                                    }
                                }
                                class22.method142(class86.field1311, (short) 1001, var19, -99, var20, "<col=ff9040>" + var54.field996, class173.field2768, (long) var53);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIBIIII)V", line = 438)
    public static final void method298(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field600++;
        int var8 = -37 / ((arg3 + 82) / 36);
        if (class204.method1498((byte) -128, arg4)) {
            client.method1904(class21.field309[arg4], -1, arg0, arg1, arg6, arg2, arg7, arg5);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIIIIBIII)V", line = 465)
    public static final void method299(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        field595++;
        if (arg0 == arg1 && arg4 == arg9 && arg2 == arg8 && arg3 == arg7) {
            class145.method1020(arg9, -1, arg0, arg3, arg2, arg5);
        } else {
            int var10 = arg9;
            int var11 = arg0;
            int var12 = arg9 * 3;
            int var13 = arg1 * 3;
            int var14 = arg4 * 3;
            int var15 = arg0 * 3;
            int var16 = arg7 * 3;
            int var17 = arg8 * 3;
            int var18 = var13 + arg2 - var17 - arg0;
            int var19 = arg3 + var14 - var16 - arg9;
            int var20 = var14 - var12;
            int var21 = var17 + var15 - var13 - var13;
            int var22 = var13 - var15;
            int var23 = var16 + var12 - var14 - var14;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var22 * var24;
                int var30 = var23 * var25;
                int var31 = var20 * var24;
                int var32 = var21 * var25;
                int var33 = arg9 + (var30 + var31 + var28 >> 12);
                int var34 = (var27 + var29 + var32 >> 12) + arg0;
                class145.method1020(var10, -1, var11, var33, var34, arg5);
                var11 = var34;
                var10 = var33;
            }
        }
        if (arg6 != 73) {
            method296(78);
        }
    }
}
