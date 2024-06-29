import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class92 {

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field1425 = 0;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1422 = "Discard";

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "Z")
    public static boolean field1427 = true;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
    public static int field1428 = 0;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "[[S")
    public static short[][] field1426;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIII)V", line = 4)
    public static final void method665(int arg0, int arg1, int arg2, int arg3) {
        class116.method808(false, 4);
        class340.field5297 = arg3;
        if (arg2 == -28128) {
            class185.field2969 = arg0;
            client.method1910(1, arg1);
            field1421++;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lok;III)V", line = 20)
    public static final void method666(class160 arg0, int arg1, int arg2, int arg3) {
        field1420++;
        if (arg0.field2502 == 1) {
            class314.field4883++;
            class22.method142(-1, (short) 28, 0, -5, arg0.field2446, "", arg0.field2539, 0L);
        }
        if (arg0.field2502 == 2 && !class313.field4874) {
            String var4 = class93.method673(0, arg0);
            if (var4 != null) {
                class248.field3940++;
                class22.method142(-1, (short) 59, -1, arg2 - 155, arg0.field2446, "<col=00ff00>" + arg0.field2547, var4, 0L);
            }
        }
        if (arg0.field2502 == 3) {
            class22.method142(-1, (short) 22, 0, 111, arg0.field2446, "", class93.field1436, 0L);
            class35.field464++;
        }
        if (arg0.field2502 == 4) {
            class22.method142(-1, (short) 60, 0, -2, arg0.field2446, "", arg0.field2539, 0L);
            class237.field3745++;
        }
        if (arg2 != 32) {
            field1427 = true;
        }
        if (arg0.field2502 == 5) {
            class187.field3030++;
            class22.method142(-1, (short) 30, 0, 103, arg0.field2446, "", arg0.field2539, 0L);
        }
        if (arg0.field2502 == 6 && class10.field109 == null) {
            class260.field4145++;
            class22.method142(-1, (short) 31, -1, 48, arg0.field2446, "", arg0.field2539, 0L);
        }
        if (arg0.field2608 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field2552; var6++) {
                for (int var7 = 0; var7 < arg0.field2448; var7++) {
                    int var8 = (arg0.field2604 + 32) * var7;
                    int var9 = (arg0.field2610 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg0.field2570[var5];
                        var8 += arg0.field2583[var5];
                    }
                    if (arg3 >= var8 && arg1 >= var9 && (var8 + 32) > arg3 && arg1 < var9 + 32) {
                        class290.field4576 = arg0;
                        class286.field4523 = var5;
                        if (arg0.field2615[var5] > 0) {
                            class170 var10 = client.method1913(arg0);
                            class74 var11 = class31.method198(false, arg0.field2615[var5] - 1);
                            if (class49.field676 == 1 && var10.method1164(1)) {
                                if (class18.field255 != arg0.field2446 || class105.field1597 != var5) {
                                    class22.method142(-1, (short) 11, var5, 91, arg0.field2446, class318.field4930 + " -> <col=ff9040>" + var11.field996, class138.field2068, (long) var11.field968);
                                    class277.field4379++;
                                }
                            } else if (class313.field4874 && var10.method1164(arg2 ^ 0x21)) {
                                class191 var12 = class297.field4656 == -1 ? null : class189.method1332(1178651532, class297.field4656);
                                if ((class26.field374 & 0x10) != 0 && (var12 == null || var11.method475(class297.field4656, var12.field3096, -13510) != var12.field3096)) {
                                    class4.field37++;
                                    class22.method142(class24.field344, (short) 4, var5, -127, arg0.field2446, class315.field4903 + " -> <col=ff9040>" + var11.field996, class282.field4458, (long) var11.field968);
                                }
                            } else {
                                class161.field2638++;
                                String[] var13 = var11.field943;
                                if (class208.field3408) {
                                    var13 = class152.method1063(var13, 5);
                                }
                                if (var10.method1164(1)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            class208.field3404++;
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 7;
                                            } else {
                                                var15 = 46;
                                            }
                                            class22.method142(-1, var15, var5, 106, arg0.field2446, "<col=ff9040>" + var11.field996, var13[var14], (long) var11.field968);
                                        }
                                    }
                                }
                                if (var10.method1169((byte) 103)) {
                                    class289.field4553++;
                                    class22.method142(class198.field3248, (short) 33, var5, 87, arg0.field2446, "<col=ff9040>" + var11.field996, class138.field2068, (long) var11.field968);
                                }
                                if (var10.method1164(1) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            class181.field2917++;
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 38;
                                            }
                                            if (var16 == 1) {
                                                var17 = 3;
                                            }
                                            if (var16 == 2) {
                                                var17 = 10;
                                            }
                                            class22.method142(-1, var17, var5, 84, arg0.field2446, "<col=ff9040>" + var11.field996, var13[var16], (long) var11.field968);
                                        }
                                    }
                                }
                                String[] var18 = arg0.field2444;
                                if (class208.field3408) {
                                    var18 = class152.method1063(var18, 5);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            class38.field509++;
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 21;
                                            }
                                            if (var19 == 1) {
                                                var20 = 35;
                                            }
                                            if (var19 == 2) {
                                                var20 = 5;
                                            }
                                            if (var19 == 3) {
                                                var20 = 47;
                                            }
                                            if (var19 == 4) {
                                                var20 = 20;
                                            }
                                            class22.method142(-1, var20, var5, 44, arg0.field2446, "<col=ff9040>" + var11.field996, var18[var19], (long) var11.field968);
                                        }
                                    }
                                }
                                class22.method142(class86.field1311, (short) 1002, var5, arg2 ^ 0xFFFFFFAD, arg0.field2446, "<col=ff9040>" + var11.field996, class173.field2768, (long) var11.field968);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field2551) {
            return;
        }
        if (!class313.field4874) {
            for (int var21 = 9; var21 >= 5; var21--) {
                String var22 = class283.method2003(arg0, -3262, var21);
                if (var22 != null) {
                    class154.field2357++;
                    class22.method142(class290.method2034(arg0, arg2 + 95, var21), (short) 1006, arg0.field2456, arg2 ^ 0x3C, arg0.field2446, arg0.field2525, var22, (long) (var21 + 1));
                }
            }
            String var23 = class93.method673(arg2 - 32, arg0);
            if (var23 != null) {
                class248.field3940++;
                class22.method142(-1, (short) 59, arg0.field2456, 63, arg0.field2446, arg0.field2525, var23, 0L);
            }
            for (int var24 = 4; var24 >= 0; var24--) {
                String var25 = class283.method2003(arg0, -3262, var24);
                if (var25 != null) {
                    class22.method142(class290.method2034(arg0, 126, var24), (short) 2, arg0.field2456, arg2 + 70, arg0.field2446, arg0.field2525, var25, (long) (var24 + 1));
                    class154.field2357++;
                }
            }
            if (client.method1913(arg0).method1160(-77)) {
                if (arg0.field2489 == null) {
                    class22.method142(-1, (short) 31, arg0.field2456, -127, arg0.field2446, "", class226.field3597, 0L);
                } else {
                    class22.method142(-1, (short) 31, arg0.field2456, -2, arg0.field2446, "", arg0.field2489, 0L);
                }
                class260.field4145++;
            }
        } else if (client.method1913(arg0).method1163(4626) && (class26.field374 & 0x20) != 0) {
            class22.method142(class24.field344, (short) 19, arg0.field2456, 7, arg0.field2446, class315.field4903 + " -> " + arg0.field2525, class282.field4458, 0L);
            class102.field1560++;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V", line = 335)
    public static void method667(byte arg0) {
        field1426 = (short[][]) null;
        if (arg0 != -7) {
            method665(-97, 68, -78, -76);
        }
        field1422 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 350)
    public static final void method668(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class4.field43 * 128) {
            arg0 = class4.field43 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class64.field844 * 128) {
            arg2 = class64.field844 * 128 - 1;
        }
        class312.field4861 = class25.field355[arg3];
        class148.field2213 = class25.field359[arg3];
        class251.field4001 = class25.field355[arg4];
        class10.field108 = class25.field359[arg4];
        class88.field1347 = arg0;
        class189.field3081 = arg1;
        class2.field15 = arg2;
        class185.field2979 = arg0 / 128;
        class313.field4870 = arg2 / 128;
        class95.field1461 = class185.field2979 - class214.field3473;
        if (class95.field1461 < 0) {
            class95.field1461 = 0;
        }
        class239.field3782 = class313.field4870 - class214.field3473;
        if (class239.field3782 < 0) {
            class239.field3782 = 0;
        }
        class160.field2486 = class214.field3473 + class185.field2979;
        if (class160.field2486 > class4.field43) {
            class160.field2486 = class4.field43;
        }
        class127.field1901 = class313.field4870 + class214.field3473;
        if (class127.field1901 > class64.field844) {
            class127.field1901 = class64.field844;
        }
        short var15;
        if (class186.field2991) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class214.field3473 + class214.field3473 + 2; var16++) {
            for (int var17 = 0; var17 < class214.field3473 + class214.field3473 + 2; var17++) {
                int var18 = (var16 - class214.field3473 << 7) - (class88.field1347 & 0x7F);
                int var19 = (var17 - class214.field3473 << 7) - (class2.field15 & 0x7F);
                int var20 = class185.field2979 + var16 - class214.field3473;
                int var21 = class313.field4870 + var17 - class214.field3473;
                if (var20 >= 0 && var21 >= 0 && var20 < class4.field43 && var21 < class64.field844) {
                    int var22;
                    if (class163.field2656 == null) {
                        var22 = class94.field1450[0][var20][var21] + 128 - class189.field3081;
                    } else {
                        var22 = class163.field2656[0][var20][var21] + 128 - class189.field3081;
                    }
                    int var23 = class94.field1450[3][var20][var21] - class189.field3081 - 1000;
                    class15.field182[var16][var17] = class10.method56(var18, var23, var22, var19, var15);
                } else {
                    class15.field182[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class214.field3473 + class214.field3473 + 1; var24++) {
            for (int var25 = 0; var25 < class214.field3473 + class214.field3473 + 1; var25++) {
                class197.field3221[var24][var25] = class15.field182[var24][var25] || class15.field182[var24 + 1][var25] || class15.field182[var24][var25 + 1] || class15.field182[var24 + 1][var25 + 1];
            }
        }
        class41.field571 = arg6;
        class187.field3035 = arg7;
        class245.field3892 = arg8;
        class2.field11 = arg9;
        class58.field752 = arg10;
        class295.method2057();
        if (class339.field5270 != null) {
            class225.method1646(true);
            class225.method1645(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class186.field2991) {
                class2.field6 = false;
                class188.method1328(0, 0, (byte) 113);
                class109.method749((float[]) null);
                class47.method320();
            }
            class225.method1646(false);
        }
        class225.method1645(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }
}
