import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class525 extends class42 {

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "Lqv;")
    public static class316 field7657 = new class316(62, 1);

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "[[F")
    public static float[][] field7668 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "Lqv;")
    public static class316 field7667 = new class316(39, 6);

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
    public static int field7663;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    public static int field7664;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
    public static int field7665;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
    public static int field7666;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "J")
    public long field7659;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "Lpg;")
    public class525 field7660;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "Lpg;")
    public class525 field7662;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "[Laa;")
    public static class343[] field7661;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)V")
    public static final void method3110(int arg0, byte arg1) {
        class288.field4266 = 3;
        class238.field3599 = -1;
        class356.field5183 = arg0;
        if (arg1 <= -45) {
            field7665++;
            class446.field6368 = 100;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIII[Ltf;IIIII)V")
    public static final void method3111(int arg0, int arg1, int arg2, int arg3, class198[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field7663++;
        class76.field1256.method345(arg1, arg8, arg5, arg3);
        for (int var10 = arg2; var10 < arg4.length; var10++) {
            class198 var11 = arg4[var10];
            if (var11 != null && (var11.field3033 == arg6 || arg6 == -1412584499 && class290.field4312 == var11)) {
                int var12;
                if (arg7 == -1) {
                    class184.field2724[class7.field52].setBounds(var11.field2924 + arg0, var11.field2957 + arg9, var11.field3008, var11.field2988);
                    var12 = class7.field52++;
                } else {
                    var12 = arg7;
                }
                var11.field2891 = class24.field349;
                var11.field2895 = var12;
                if (!client.method1378(var11)) {
                    if (var11.field2966 != 0) {
                        class510.method2976(var11, 11028);
                    }
                    int var13 = var11.field2924 + arg0;
                    int var14 = var11.field2957 + arg9;
                    int var15 = var11.field2888;
                    if (class65.field1107 && (client.method1395(var11).field4366 != 0 || var11.field2941 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class290.field4312 == var11) {
                        if (arg6 != -1412584499 && (class26.field371 == var11.field2936 || class45.field884 == var11.field2936)) {
                            class354.field5154 = arg0;
                            class260.field3843 = arg9;
                            class316.field4702 = arg4;
                            continue;
                        }
                        if (class142.field2186 && class477.field6949) {
                            int var16 = class49.field909.method639((byte) 74);
                            int var17 = class49.field909.method644(101);
                            int var18 = var16 - class201.field3082;
                            int var19 = var17 - class505.field7298;
                            if (var18 < class97.field1533) {
                                var18 = class97.field1533;
                            }
                            if (class97.field1533 + class77.field1271.field3008 < var11.field3008 + var18) {
                                var18 = class97.field1533 + class77.field1271.field3008 - var11.field3008;
                            }
                            if (class299.field4462 > var19) {
                                var19 = class299.field4462;
                            }
                            if ((class299.field4462 + class77.field1271.field2988) < (var19 + var11.field2988)) {
                                var19 = class299.field4462 + class77.field1271.field2988 - var11.field2988;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (class45.field884 == var11.field2936) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var11.field2941 == 2) {
                        var20 = arg8;
                        var21 = arg5;
                        var22 = arg3;
                        var23 = arg1;
                    } else {
                        int var24 = var11.field3008 + var13;
                        int var25 = var14 + var11.field2988;
                        var20 = var14 > arg8 ? var14 : arg8;
                        if (var11.field2941 == 9) {
                            var25++;
                            var24++;
                        }
                        var23 = var13 <= arg1 ? arg1 : var13;
                        var21 = arg5 > var24 ? var24 : arg5;
                        var22 = var25 < arg3 ? var25 : arg3;
                    }
                    if (var21 > var23 && var20 < var22) {
                        if (var11.field2966 != 0) {
                            if (class213.field3224 == var11.field2966 || class244.field3649 == var11.field2966) {
                                class102.method750((byte) 37, class244.field3649 == var11.field2966, var11.field3008, var11.field2988, var13, var14);
                                class25.field361[var12] = true;
                                class76.field1256.method345(arg1, arg8, arg5, arg3);
                                continue;
                            }
                            if (class195.field2853 == var11.field2966) {
                                if (var11.method1335(class76.field1256, (byte) 63) != null) {
                                    class259.method1668(arg2 + 8101);
                                    class459.method2726(arg2 - 30000, var11, var14, class76.field1256, var13);
                                    class130.field2043[var12] = true;
                                    class76.field1256.method345(arg1, arg8, arg5, arg3);
                                }
                                continue;
                            }
                            if (class530.field7818 == var11.field2966) {
                                if (var11.method1335(class76.field1256, (byte) 123) != null) {
                                    class192.method1309(var14, -126, var13, var11);
                                    class130.field2043[var12] = true;
                                    class76.field1256.method345(arg1, arg8, arg5, arg3);
                                }
                                continue;
                            }
                            if (class141.field2182 == var11.field2966) {
                                class304.method1942(var11.field3008, class2.field1, class76.field1256, var11.field2988, var13, var14, (byte) 89);
                                class25.field361[var12] = true;
                                class76.field1256.method345(arg1, arg8, arg5, arg3);
                                continue;
                            }
                            if (class87.field1413 == var11.field2966) {
                                class419.method2496(true, class76.field1256, var13, var11.field3008, var11.field2988, var14);
                                class25.field361[var12] = true;
                                class76.field1256.method345(arg1, arg8, arg5, arg3);
                                continue;
                            }
                            if (class58.field1050 == var11.field2966) {
                                if (!class350.field5134 && !class523.field7651) {
                                    continue;
                                }
                                int var26 = var11.field3008 + var13;
                                int var27 = var14 + 15;
                                if (class350.field5134) {
                                    int var28 = -256;
                                    if (class264.field3984 < 20) {
                                        var28 = -65536;
                                    }
                                    class406.field5775.method1733("Fps:" + class264.field3984, -1, (byte) 114, var27, var28, var26);
                                    var27 += 15;
                                    Runtime var29 = Runtime.getRuntime();
                                    int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                    int var31 = -256;
                                    if (var30 > 65536) {
                                        var31 = -65536;
                                        if (class8.field59) {
                                            class138.method1012(7576);
                                            for (int var32 = 0; var32 < 10; var32++) {
                                                System.gc();
                                            }
                                            var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                            if (var30 > 65536) {
                                                class171.method1208((byte) 82, "WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
                                            }
                                        }
                                    }
                                    class406.field5775.method1733("Mem:" + var30 + "k", -1, (byte) 114, var27, var31, var26);
                                    var27 += 15;
                                    class406.field5775.method1733("In:" + class505.field7303 + "B/s Out:" + class271.field4077 + "B/s", -1, (byte) 114, var27, -256, var26);
                                    var27 += 15;
                                    int var33 = class76.field1256.method358() / 1024;
                                    class406.field5775.method1733("Offheap:" + var33 + "k", -1, (byte) 114, var27, var33 <= 65536 ? -256 : -65536, var26);
                                    var27 += 15;
                                    int var34 = 0;
                                    int var35 = 0;
                                    int var36 = 0;
                                    for (int var37 = 0; var37 < 30; var37++) {
                                        var34 += class425.field6008[var37].method1006((byte) 125);
                                        var35 += class425.field6008[var37].method1001(123);
                                        var36 += class425.field6008[var37].method1008((byte) 120);
                                    }
                                    int var38 = var36 * 100 / var34;
                                    int var39 = var35 * 10000 / var34;
                                    String var40 = "Cache:" + class261.method1689(125, 2, (long) var39, true, 0) + "% (" + var38 + "%)";
                                    class521.field7593.method1733(var40, -1, (byte) 114, var27, -256, var26);
                                    var27 += 12;
                                }
                                if (class196.field2870 > 0) {
                                    class521.field7593.method1733("Particles: " + class485.field7028 + " / " + class196.field2870, -1, (byte) 114, var27, -256, var26);
                                }
                                var27 += 12;
                                if (class523.field7651) {
                                    class521.field7593.method1733("Polys: " + class76.field1256.method338() + " Models: " + class76.field1256.method360(), -1, (byte) 114, var27, -256, var26);
                                    var27 += 12;
                                    class521.field7593.method1733("Ls: " + class238.field3597 + " La: " + class289.field4292 + " NPC: " + class220.field3372 + " Pl: " + class513.field7461, -1, (byte) 114, var27, -256, var26);
                                    var27 += 12;
                                    class405.method2417(arg2 + 99);
                                }
                                class25.field361[var12] = true;
                                continue;
                            }
                        }
                        if (var11.field2941 == 0) {
                            if (class259.field3832 == var11.field2966 && class76.field1256.method292()) {
                                class76.field1256.method251(var13, var14, var11.field3008, var11.field2988);
                            }
                            method3111(var13 - var11.field2997, var23, 0, var22, arg4, var21, var11.field3016, var12, var20, var14 - var11.field2898);
                            if (var11.field3013 != null) {
                                method3111(var13 - var11.field2997, var23, arg2, var22, var11.field3013, var21, var11.field3016, var12, var20, var14 - var11.field2898);
                            }
                            class541 var41 = (class541) class220.field3370.method2284(true, (long) var11.field3016);
                            if (var41 != null) {
                                class472.method2798(4, var14, var21, var41.field7955, var23, var13, var12, var22, var20);
                            }
                            if (class259.field3832 == var11.field2966 && class76.field1256.method292()) {
                                class76.field1256.method316();
                                class241.field3614 = true;
                            }
                            class76.field1256.method345(arg1, arg8, arg5, arg3);
                        }
                        if (class283.field4212[var12] || class166.field2492 > 1) {
                            if (var11.field2941 == 3) {
                                if (var15 == 0) {
                                    if (var11.field2964) {
                                        class76.field1256.method215(var13, var14, var11.field3008, var11.field2988, var11.field2967, 0);
                                    } else {
                                        class76.field1256.method327(var13, var14, var11.field3008, var11.field2988, var11.field2967, 0);
                                    }
                                } else if (var11.field2964) {
                                    class76.field1256.method215(var13, var14, var11.field3008, var11.field2988, 255 - (var15 & 0xFF) << 24 | var11.field2967 & 0xFFFFFF, 1);
                                } else {
                                    class76.field1256.method327(var13, var14, var11.field3008, var11.field2988, 255 - (var15 & 0xFF) << 24 | var11.field2967 & 0xFFFFFF, 1);
                                }
                            } else if (var11.field2941 == 4) {
                                class269 var42 = var11.method1349(class76.field1256, -742);
                                if (var42 != null) {
                                    int var43 = var11.field2967;
                                    String var44 = var11.field2993;
                                    if (var11.field2952 != -1) {
                                        class116 var45 = class58.field1052.method1646(21708, var11.field2952);
                                        var44 = var45.field1780;
                                        if (var44 == null) {
                                            var44 = "null";
                                        }
                                        if ((var45.field1742 == 1 || var11.field2961 != 1) && var11.field2961 != -1) {
                                            var44 = "<col=ff9040>" + var44 + "</col> x" + class440.method2592(var11.field2961, (byte) 92);
                                        }
                                    }
                                    if (class65.field1112 == var11) {
                                        var44 = class37.field794.method426(class503.field7255, 127);
                                        var43 = var11.field2967;
                                    }
                                    if (class528.field7721) {
                                        class76.field1256.method185(var13, var14, var13 + var11.field3008, var14 - -var11.field2988);
                                    }
                                    var42.method1747(var11.field2905, 255 - (var15 & 0xFF) << 24 | var43, arg2, var11.field3029, var11.field2988, null, null, var11.field2955, var11.field2976 ? 255 - (var15 & 0xFF) << 24 : -1, var44, 0, var14, var13, var11.field3008, 0, field7661, var11.field2953);
                                    if (class528.field7721) {
                                        class76.field1256.method345(arg1, arg8, arg5, arg3);
                                    }
                                } else if (class479.field6976) {
                                    class284.method1832(-17067, var11);
                                }
                            } else if (var11.field2941 == 5) {
                                if (var11.field3043 < 0) {
                                    class343 var46;
                                    if (var11.field2952 == -1) {
                                        var46 = var11.method1352(class76.field1256, 1);
                                    } else {
                                        class58 var47 = var11.field2992 ? class364.field5293.field7403 : null;
                                        var46 = class58.field1052.method1651(var11.field2916, var47, var11.field3031, var11.field2910 | 0xFF000000, var11.field2961, var11.field2952, (byte) 123, class76.field1256);
                                    }
                                    if (var46 != null) {
                                        int var48 = var46.method376();
                                        int var49 = var46.method374();
                                        int var50 = 255 - (var15 & 0xFF) << 24 | (var11.field2967 == 0 ? 16777215 : var11.field2967 & 0xFFFFFF);
                                        if (var11.field2979) {
                                            class76.field1256.method185(var13, var14, var11.field3008 + var13, var11.field2988 + var14);
                                            if (var11.field3050 != 0) {
                                                int var51 = (var11.field3008 + var48 - 1) / var48;
                                                int var52 = (-(-var49 - var11.field2988) - 1) / var49;
                                                for (int var53 = 0; var53 < var51; var53++) {
                                                    for (int var54 = 0; var54 < var52; var54++) {
                                                        if (var11.field2967 == 0) {
                                                            var46.method2174((float) var48 / 2.0F + (float) (var48 * var53 + var13), (float) var49 / 2.0F + (float) (var49 * var54 + var14), 4096, var11.field3050);
                                                        } else {
                                                            var46.method2173((float) var48 / 2.0F + (float) (var13 + (var48 * var53)), (float) var49 / 2.0F + (float) (var14 - -(var49 * var54)), 4096, var11.field3050, 0, var50, 1);
                                                        }
                                                    }
                                                }
                                            } else if (var11.field2967 == 0 && var15 == 0) {
                                                var46.method2172(var13, var14, var11.field3008, var11.field2988);
                                            } else {
                                                var46.method380(var13, var14, var11.field3008, var11.field2988, 0, var50, 1);
                                            }
                                            class76.field1256.method345(arg1, arg8, arg5, arg3);
                                        } else if (var11.field2967 == 0 && var15 == 0) {
                                            if (var11.field3050 != 0) {
                                                var46.method2174((float) var11.field3008 / 2.0F + (float) var13, (float) var11.field2988 / 2.0F + (float) var14, var11.field3008 * 4096 / var48, var11.field3050);
                                            } else if (var11.field3008 == var48 && var11.field2988 == var49) {
                                                var46.method2175(var13, var14);
                                            } else {
                                                var46.method2169(var13, var14, var11.field3008, var11.field2988);
                                            }
                                        } else if (var11.field3050 != 0) {
                                            var46.method2173((float) var11.field3008 / 2.0F + (float) var13, (float) var11.field2988 / 2.0F + (float) var14, var11.field3008 * 4096 / var48, var11.field3050, 0, var50, 1);
                                        } else if (var11.field3008 == var48 && var11.field2988 == var49) {
                                            var46.method370(var13, var14, 0, var50, 1);
                                        } else {
                                            var46.method372(var13, var14, var11.field3008, var11.field2988, 0, var50, 1);
                                        }
                                    } else if (class479.field6976) {
                                        class284.method1832(-17067, var11);
                                    }
                                } else {
                                    var11.method1334(class59.field1057, class175.field2614, (byte) -19).method2074(var11.field3009 << 3, -4096, 0, 0, var11.field2911 << 3, var13, class76.field1256, var11.field2988, var11.field3008, var14);
                                }
                            } else if (var11.field2941 == 6) {
                                class245.method1609(2048);
                                class336 var55 = null;
                                int var56 = 0;
                                if (var11.field2952 != -1) {
                                    class116 var57 = class58.field1052.method1646(21708, var11.field2952);
                                    if (var57 != null) {
                                        class116 var58 = var57.method829((byte) -122, var11.field2961);
                                        class183 var59 = var11.field2920 == -1 ? null : class96.field1526.method2717(-122, var11.field2920);
                                        class58 var60 = var11.field2992 ? class364.field5293.field7403 : null;
                                        var55 = var58.method831(var11.field2935, arg2, var60, 2048, 1, var11.field2900, class76.field1256, var59, var11.field2975);
                                        if (var55 == null) {
                                            class284.method1832(-17067, var11);
                                        } else {
                                            var56 = -var55.method1130() >> 1;
                                        }
                                    }
                                } else if (var11.field2959 == 5) {
                                    int var61 = var11.field3005;
                                    if (var61 >= 0 && var61 < 2048) {
                                        class510 var62 = class494.field7143[var61];
                                        class183 var63 = var11.field2920 == -1 ? null : class96.field1526.method2717(-116, var11.field2920);
                                        if (var62 != null && (class497.field7188 == var61 || class501.method2924((byte) 119, var62.field7363) == var11.field2937)) {
                                            var55 = var62.field7403.method489(32768, var63, 0, class76.field1256, class147.field2266, -1, true, class303.field4490, 0, class96.field1526, var11.field2935, class84.field1335, 2048, var11.field2975, class117.field1812, null, null, var11.field2900, class58.field1052);
                                        }
                                    }
                                } else if (var11.field2959 == 8 || var11.field2959 == 9) {
                                    class304 var65 = class75.method579(false, true, var11.field3005);
                                    class183 var66 = var11.field2920 == -1 ? null : class96.field1526.method2717(-109, var11.field2920);
                                    if (var65 != null) {
                                        class58 var67 = var11.field2992 ? class364.field5293.field7403 : null;
                                        var55 = var65.method1940(var11.field2937, var11.field2975, var11.field2959 == 9, var11.field2900, var66, 2048, var11.field2935, (byte) 124, class76.field1256, var67);
                                    }
                                } else if (var11.field2920 == -1) {
                                    var55 = var11.method1339(true, class364.field5293.field7403, class84.field1335, class96.field1526, null, class76.field1256, -1, class303.field4490, -1, 0, 2048, class58.field1052, class147.field2266, class117.field1812);
                                    if (var55 == null && class479.field6976) {
                                        class284.method1832(-17067, var11);
                                    }
                                } else {
                                    class183 var64 = class96.field1526.method2717(-93, var11.field2920);
                                    var55 = var11.method1339(true, class364.field5293.field7403, class84.field1335, class96.field1526, var64, class76.field1256, var11.field2900, class303.field4490, var11.field2935, var11.field2975, 2048, class58.field1052, class147.field2266, class117.field1812);
                                    if (var55 == null && class479.field6976) {
                                        class284.method1832(-17067, var11);
                                    }
                                }
                                if (var55 != null) {
                                    int var68;
                                    if (var11.field2892 <= 0) {
                                        var68 = 512;
                                    } else {
                                        var68 = (var11.field3008 << 9) / var11.field2892;
                                    }
                                    int var69;
                                    if (var11.field2994 > 0) {
                                        var69 = (var11.field2988 << 9) / var11.field2994;
                                    } else {
                                        var69 = 512;
                                    }
                                    int var70 = var11.field3008 / 2 + (var11.field2938 * var68 >> 9) + var13;
                                    int var71 = (var11.field3000 * var69 >> 9) + (var14 + (var11.field2988 / 2));
                                    class289.field4283.method34();
                                    class76.field1256.method209(class289.field4283);
                                    class76.field1256.method325(var70, var71, var68, var69);
                                    class76.field1256.method221((float) (var11.field2915 << 0), var11.field2946 ? (float) (var11.field2923 << 0) : (float) (var11.field2923 << 0) * 1.5F);
                                    if (arg6 == -1412584499 || class241.field3614) {
                                        class76.field1256.method179();
                                        class76.field1256.method268();
                                        class76.field1256.method345(arg1, arg8, arg5, arg3);
                                        class241.field3614 = false;
                                    }
                                    if (var11.field2945) {
                                        class76.field1256.method273(false);
                                    }
                                    int var72 = (var11.field2906 << 0) * class358.field5204[var11.field2948 << 3] >> 15;
                                    int var73 = (var11.field2906 << 0) * class358.field5203[var11.field2948 << 3] >> 15;
                                    class94.field1503.method46(-var11.field3006 << 3);
                                    class94.field1503.method36(var11.field2972 << 3);
                                    class94.field1503.method37(var11.field2904 << 0, var72 + (var11.field3021 << 0) + var56, var73 - -(var11.field3021 << 0));
                                    class94.field1503.method39(var11.field2948 << 3);
                                    if (class528.field7721) {
                                        class76.field1256.method185(var13, var14, var13 + var11.field3008, var11.field2988 + var14);
                                    }
                                    if (var11.field2946) {
                                        var55.method1153(class94.field1503, null, var11.field2906 << 0, 1);
                                    } else {
                                        var55.method1142(class94.field1503, null, 1);
                                    }
                                    if (class528.field7721) {
                                        class76.field1256.method345(arg1, arg8, arg5, arg3);
                                    }
                                    if (var11.field2945) {
                                        class76.field1256.method273(true);
                                    }
                                    class76.field1256.method221(0.0F, 0.0F);
                                }
                            } else if (var11.field2941 == 9) {
                                int var74;
                                int var75;
                                int var76;
                                int var77;
                                if (var11.field2908) {
                                    var75 = var11.field2988 + var14;
                                    var74 = var14;
                                    var76 = var11.field3008 + var13;
                                    var77 = var13;
                                } else {
                                    var74 = var11.field2988 + var14;
                                    var75 = var14;
                                    var76 = var11.field3008 + var13;
                                    var77 = var13;
                                }
                                if (var11.field3003 == 1) {
                                    class76.field1256.method242(var77, var75, var76, var74, var11.field2967, 0);
                                } else {
                                    class76.field1256.method211(var77, var75, var76, var74, var11.field2967, var11.field3003, 0);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)Z")
    public final boolean method3112(int arg0) {
        if (arg0 != 20416) {
            this.field7659 = -88L;
        }
        field7658++;
        return this.field7662 != null;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
    public static void method3113(int arg0) {
        field7661 = null;
        field7657 = null;
        field7668 = null;
        field7667 = null;
        if (arg0 != 0) {
            field7661 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIBIIZ)V")
    public static final void method3114(int arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5) {
        field7666++;
        long var6 = (long) (arg1 | (arg5 ? Integer.MIN_VALUE : 0));
        if (arg2 != -60) {
            return;
        }
        class304 var8 = (class304) class183.field2696.method2284(true, var6);
        if (var8 == null) {
            var8 = new class304();
            class183.field2696.method2292(var6, var8, (byte) -128);
        }
        if (arg0 >= var8.field4506.length) {
            int[] var9 = new int[arg0 + 1];
            int[] var10 = new int[arg0 + 1];
            for (int var11 = 0; var11 < var8.field4506.length; var11++) {
                var9[var11] = var8.field4506[var11];
                var10[var11] = var8.field4510[var11];
            }
            for (int var12 = var8.field4506.length; var12 < arg0; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field4510 = var10;
            var8.field4506 = var9;
        }
        var8.field4506[arg0] = arg3;
        var8.field4510[arg0] = arg4;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V")
    public final void method3115(byte arg0) {
        field7664++;
        if (this.field7662 == null) {
            return;
        }
        this.field7662.field7660 = this.field7660;
        if (arg0 != 103) {
            field7661 = null;
        }
        this.field7660.field7662 = this.field7662;
        this.field7662 = null;
        this.field7660 = null;
    }

    static {
        new class44("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
    }
}
