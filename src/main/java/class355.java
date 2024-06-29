import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class355 {

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "Ljava/lang/String;")
    public static String field5655 = "glow2:";

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "[I")
    public static int[] field5656 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field5650;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "I")
    public static int field5658;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "Lho;")
    public static class215 field5652;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "Lrg;")
    public static class342 field5654;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V", line = 12)
    public static final void method2493(int arg0) {
        class122.field1945 = 0;
        class203.field3150 = -1;
        class174.field2764 = 0;
        class6.field89 = false;
        class353.field5642 = -1;
        class66.field1006 = 0;
        class279.field4302 = -1;
        class123.field1966 = -1;
        field5653++;
        class206.field3175 = 0;
        class99.field1491.field397 = 0;
        class244.field3803.field397 = arg0;
        class154.method1264(true);
        for (int var1 = 0; var1 < class177.field2795.length; var1++) {
            if (class177.field2795[var1] != null) {
                class177.field2795[var1].field1364 = -1;
            }
        }
        for (int var2 = 0; var2 < class110.field1683.length; var2++) {
            if (class110.field1683[var2] != null) {
                class110.field1683[var2].field1364 = -1;
            }
        }
        class177.method1379(-124);
        class314.field4858 = 1;
        class175.method1370(30, (byte) -83);
        for (int var3 = 0; var3 < 100; var3++) {
            class227.field3540[var3] = true;
        }
        class256.method1893(19);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIIZIII[Lrg;)V", line = 70)
    public static final void method2494(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, class342[] arg9) {
        field5649++;
        if (class240.field3737) {
            class213.method1595(arg7, arg6, arg8, arg1);
        } else {
            class60.method598(arg7, arg6, arg8, arg1);
            class107.method923();
        }
        int var10 = 0;
        if (!arg5) {
            field5652 = (class215) null;
        }
        while (arg9.length > var10) {
            class342 var11 = arg9[var10];
            if (var11 != null && (var11.field5296 == arg2 || arg2 == -1412584499 && class256.field3937 == var11)) {
                int var12;
                if (arg0 == -1) {
                    class188.field2958[class362.field5732] = var11.field5350 + arg3;
                    class212.field3299[class362.field5732] = var11.field5300 + arg4;
                    class236.field3677[class362.field5732] = var11.field5374;
                    class91.field1390[class362.field5732] = var11.field5339;
                    var12 = class362.field5732++;
                } else {
                    var12 = arg0;
                }
                var11.field5271 = var12;
                var11.field5306 = class360.field5718;
                if (!var11.field5340 || !client.method1043(var11)) {
                    label1149: {
                        if (var11.field5427 > 0) {
                            class236.method1760(var11, (byte) -113);
                        }
                        int var13 = var11.field5350 + arg3;
                        int var14 = var11.field5300 + arg4;
                        int var15 = var11.field5352;
                        if (class18.field290 && (client.method1022(var11).field3544 != 0 || var11.field5279 == 0) && var15 > 127) {
                            var15 = 127;
                        }
                        if (class256.field3937 == var11) {
                            if (arg2 != -1412584499 && !var11.field5403) {
                                class249.field3857 = arg9;
                                class23.field352 = arg3;
                                class170.field2685 = arg4;
                                break label1149;
                            }
                            if (class123.field1973 && class62.field955) {
                                int var16 = class78.field1129;
                                int var17 = class268.field4137;
                                int var18 = var16 - class210.field3243;
                                if (class81.field1185 > var18) {
                                    var18 = class81.field1185;
                                }
                                if (var11.field5339 + var18 > class81.field1185 + class348.field5523.field5339) {
                                    var18 = class81.field1185 + class348.field5523.field5339 - var11.field5339;
                                }
                                int var19 = var17 - class66.field994;
                                if (class67.field1030 > var19) {
                                    var19 = class67.field1030;
                                }
                                if ((class67.field1030 + class348.field5523.field5374) < (var19 + var11.field5374)) {
                                    var19 = class67.field1030 - (var11.field5374 - class348.field5523.field5374);
                                }
                                var13 = var19;
                                var14 = var18;
                            }
                            if (!var11.field5403) {
                                var15 = 128;
                            }
                        }
                        int var20;
                        int var21;
                        int var22;
                        int var23;
                        if (var11.field5279 == 2) {
                            var20 = arg1;
                            var21 = arg8;
                            var22 = arg7;
                            var23 = arg6;
                        } else {
                            var23 = arg6 >= var14 ? arg6 : var14;
                            int var24 = var11.field5339 + var14;
                            var22 = arg7 >= var13 ? arg7 : var13;
                            int var25 = var11.field5374 + var13;
                            if (var11.field5279 == 9) {
                                var25++;
                                var24++;
                            }
                            var20 = var24 < arg1 ? var24 : arg1;
                            var21 = arg8 <= var25 ? arg8 : var25;
                        }
                        if (!var11.field5340 || var22 < var21 && var20 > var23) {
                            label1162: {
                                if (var11.field5427 != 0) {
                                    if (var11.field5427 == 1337 || var11.field5427 == 1403) {
                                        class150.field2458 = var13;
                                        class85.field1220 = var11;
                                        class82.field1193 = var14;
                                        class290.method2104(var11.field5427 == 1403, 0, var11.field5339, var13, var14, var11.field5374);
                                        class227.field3540[var12] = true;
                                        if (class240.field3737) {
                                            class213.method1595(arg7, arg6, arg8, arg1);
                                        } else {
                                            class60.method598(arg7, arg6, arg8, arg1);
                                        }
                                        break label1162;
                                    }
                                    if (var11.field5427 == 1338) {
                                        if (!var11.method2404(55)) {
                                            break label1162;
                                        }
                                        class162.method1297(var13, var11, var12, (byte) 59, var14);
                                        if (class240.field3737) {
                                            class213.method1595(arg7, arg6, arg8, arg1);
                                        } else {
                                            class60.method598(arg7, arg6, arg8, arg1);
                                        }
                                        if (class151.field2462 != 0 && class151.field2462 != 3 || class6.field89 || var22 > class344.field5479 || var23 > class191.field3003 || var21 <= class344.field5479 || var20 <= class191.field3003) {
                                            break label1162;
                                        }
                                        int var41 = class191.field3003 - var14;
                                        int var42 = var11.field5272[var41];
                                        int var43 = class344.field5479 - var13;
                                        if (var43 < var42 || (var11.field5428[var41] + var42) < var43) {
                                            break label1162;
                                        }
                                        int var44;
                                        if (class314.field4858 == 4) {
                                            var44 = (int) class313.field4846 & 0x7FF;
                                        } else {
                                            var44 = (int) class313.field4846 + class290.field4513 & 0x7FF;
                                        }
                                        int var45 = var41 - var11.field5339 / 2;
                                        int var46 = var43 - var11.field5374 / 2;
                                        int var47 = class107.field1604[var44];
                                        int var48 = class107.field1605[var44];
                                        if (class314.field4858 != 4) {
                                            var48 = (class236.field3676 + 256) * var48 >> 8;
                                            var47 = (class236.field3676 + 256) * var47 >> 8;
                                        }
                                        int var49 = var45 * var47 + var46 * var48 >> 11;
                                        int var50 = var45 * var48 - (var46 * var47) >> 11;
                                        int var51;
                                        int var52;
                                        if (class314.field4858 == 4) {
                                            var52 = class62.field950 - var50 >> 7;
                                            var51 = class64.field979 + var49 >> 7;
                                        } else {
                                            var51 = var49 + (class173.field2746.field1359 - (class173.field2746.method808(81) - 1) * 64) >> 7;
                                            var52 = class173.field2746.field1286 + 64 - var50 - (class173.field2746.method808(-83) * 64) >> 7;
                                        }
                                        if (class210.field3237 && (class209.field3214 & 0x40) != 0) {
                                            class342 var53 = class320.method2259(class270.field4155, class259.field3969, 0);
                                            if (var53 == null) {
                                                class326.method2306((byte) 31);
                                            } else {
                                                class268.method1963((short) 32, " ->", var52, class281.field4355, class202.field3130, 1L, -25900, var51);
                                            }
                                            break label1162;
                                        }
                                        if (class165.field2629 == 1) {
                                            class268.method1963((short) 33, "", var52, -1, class79.field1146, 1L, -25900, var51);
                                        }
                                        class268.method1963((short) 49, "", var52, -1, class204.field3157, 1L, -25900, var51);
                                        break label1162;
                                    }
                                    if (var11.field5427 == 1339) {
                                        if (var11.method2404(92)) {
                                            class139.method1156(var11, -81, var12, var13, var14);
                                            if (class240.field3737) {
                                                class213.method1595(arg7, arg6, arg8, arg1);
                                            } else {
                                                class60.method598(arg7, arg6, arg8, arg1);
                                            }
                                        }
                                        break label1162;
                                    }
                                    if (var11.field5427 == 1400) {
                                        class254.method1885((byte) -123, var11.field5374, var11.field5339, var13, var14);
                                        class227.field3540[var12] = true;
                                        class349.field5544[var12] = true;
                                        if (class240.field3737) {
                                            class213.method1595(arg7, arg6, arg8, arg1);
                                        } else {
                                            class60.method598(arg7, arg6, arg8, arg1);
                                        }
                                        break label1162;
                                    }
                                    if (var11.field5427 == 1401) {
                                        class232.method1737(var13, var11.field5374, var14, (byte) 107, var11.field5339);
                                        class227.field3540[var12] = true;
                                        class349.field5544[var12] = true;
                                        if (class240.field3737) {
                                            class213.method1595(arg7, arg6, arg8, arg1);
                                        } else {
                                            class60.method598(arg7, arg6, arg8, arg1);
                                        }
                                        break label1162;
                                    }
                                    if (var11.field5427 == 1402) {
                                        if (!class240.field3737) {
                                            class288.method2080(var13, 86, var14);
                                            class227.field3540[var12] = true;
                                            class349.field5544[var12] = true;
                                        }
                                        break label1162;
                                    }
                                    if (var11.field5427 == 1405) {
                                        if (!class116.field1783) {
                                            break label1162;
                                        }
                                        int var26 = var11.field5374 + var13;
                                        int var27 = var14 + 15;
                                        class346.field5506.method1203("Fps:" + class101.field1522, var26, var27, 16776960, -1);
                                        int var140 = var27 + 15;
                                        Runtime var28 = Runtime.getRuntime();
                                        int var29 = 16776960;
                                        int var30 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                        if (var30 > 65536) {
                                            var29 = 16711680;
                                        }
                                        class346.field5506.method1203("Mem:" + var30 + "k", var26, var140, var29, -1);
                                        var27 = var140 + 15;
                                        if (class240.field3737) {
                                            int var31 = 16776960;
                                            int var32 = (class28.field458 + class28.field454 + class28.field459) / 1024;
                                            if (var32 > 65536) {
                                                var31 = 16711680;
                                            }
                                            class346.field5506.method1203("Card:" + var32 + "k", var26, var27, var31, -1);
                                            var27 += 15;
                                        }
                                        int var33 = 0;
                                        int var34 = 0;
                                        int var35 = 16776960;
                                        int var36 = 0;
                                        for (int var37 = 0; var37 < 29; var37++) {
                                            var33 += class90.field1280[var37].method1234(63);
                                            var34 += class90.field1280[var37].method1230(false);
                                            var36 += class90.field1280[var37].method1228(-2);
                                        }
                                        int var38 = var36 * 100 / var33;
                                        int var39 = var34 * 10000 / var33;
                                        String var40 = "Cache:" + class287.method2077((byte) 25, 0, (long) var39, 2, true) + "% (" + var38 + "%)";
                                        class314.field4853.method1203(var40, var26, var27, var35, -1);
                                        var27 += 12;
                                        if (class273.field4216 > 0) {
                                            class314.field4853.method1203("Particles: " + class273.field4215 + " / " + class273.field4216, var26, var27, var35, -1);
                                        }
                                        var27 += 12;
                                        class227.field3540[var12] = true;
                                        class349.field5544[var12] = true;
                                        break label1162;
                                    }
                                    if (var11.field5427 == 1406) {
                                        class280.field4330 = var13;
                                        class170.field2687 = var14;
                                        class91.field1346 = var11;
                                        break label1162;
                                    }
                                }
                                if (!class6.field89) {
                                    if (var11.field5279 == 0 && var11.field5329 && var22 <= class344.field5479 && var23 <= class191.field3003 && var21 > class344.field5479 && var20 > class191.field3003 && !class18.field290) {
                                        class78.field1134[0] = class174.field2761;
                                        class66.field1006 = 1;
                                        class356.field5670[0] = 1011;
                                        class212.field3328[0] = class123.field1979;
                                        class318.field4904[0] = "";
                                    }
                                    if (var22 <= class344.field5479 && class191.field3003 >= var23 && var21 > class344.field5479 && class191.field3003 < var20) {
                                        class86.method775((byte) -121, class344.field5479 - var13, var11, class191.field3003 - var14);
                                    }
                                }
                                if (var11.field5279 == 0) {
                                    if (!var11.field5340 && client.method1043(var11) && class53.field804 != var11) {
                                        break label1162;
                                    }
                                    if (!var11.field5340) {
                                        if ((var11.field5264 - var11.field5339) < var11.field5334) {
                                            var11.field5334 = var11.field5264 - var11.field5339;
                                        }
                                        if (var11.field5334 < 0) {
                                            var11.field5334 = 0;
                                        }
                                    }
                                    if (class240.field3737 && var11.field5427 == 1407) {
                                        class357.method2509(var13, var14, var11.field5374, var11.field5339);
                                    }
                                    method2494(var12, var20, var11.field5433, var13 - var11.field5351, var14 - var11.field5334, true, var23, var22, var21, arg9);
                                    if (var11.field5312 != null) {
                                        method2494(var12, var20, var11.field5433, var13 - var11.field5351, var14 - var11.field5334, true, var23, var22, var21, var11.field5312);
                                    }
                                    class36 var54 = (class36) class135.field2251.method370((byte) -120, (long) var11.field5433);
                                    if (var54 != null) {
                                        if (var54.field543 == 0 && !class6.field89 && var22 <= class344.field5479 && class191.field3003 >= var23 && class344.field5479 < var21 && class191.field3003 < var20 && !class18.field290) {
                                            class356.field5670[0] = 1011;
                                            class66.field1006 = 1;
                                            class78.field1134[0] = class174.field2761;
                                            class212.field3328[0] = class123.field1979;
                                            class318.field4904[0] = "";
                                        }
                                        class131.method1130(var13, var22, var23, false, var14, var54.field540, var12, var20, var21);
                                    }
                                    if (class240.field3737 && var11.field5427 == 1407) {
                                        class357.method2505();
                                        class9.field130 = true;
                                    }
                                    if (class240.field3737) {
                                        class213.method1595(arg7, arg6, arg8, arg1);
                                    } else {
                                        class60.method598(arg7, arg6, arg8, arg1);
                                        class107.method923();
                                    }
                                }
                                if (class231.field3605[var12] || class284.field4398 > 1) {
                                    if (var11.field5279 == 0 && !var11.field5340 && var11.field5264 > var11.field5339) {
                                        class166.method1324(var11.field5334, var14, -1, var11.field5339, var11.field5374 + var13, var11.field5264);
                                    }
                                    if (var11.field5279 != 1) {
                                        if (var11.field5279 == 2) {
                                            int var55 = 0;
                                            for (int var56 = 0; var56 < var11.field5413; var56++) {
                                                for (int var57 = 0; var57 < var11.field5355; var57++) {
                                                    int var58 = (var11.field5286 + 32) * var57 + var13;
                                                    int var59 = (var11.field5370 + 32) * var56 + var14;
                                                    if (var55 < 20) {
                                                        var58 += var11.field5319[var55];
                                                        var59 += var11.field5322[var55];
                                                    }
                                                    if (var11.field5280[var55] > 0) {
                                                        int var61 = var11.field5280[var55] - 1;
                                                        boolean var62 = false;
                                                        boolean var63 = false;
                                                        if ((var58 + 32) > arg7 && arg8 > var58 && arg6 < (var59 + 32) && var59 < arg1 || class212.field3283 == var11 && class42.field664 == var55) {
                                                            class215 var64;
                                                            if (class78.field1136 == 1 && class33.field506 == var55 && class45.field719 == var11.field5433) {
                                                                var64 = class161.method1294(var11.field5344[var55], var61, 0, 2, var11.field5327, (byte) 93, (class207) null);
                                                            } else {
                                                                var64 = class161.method1294(var11.field5344[var55], var61, 3153952, 1, var11.field5327, (byte) 69, (class207) null);
                                                            }
                                                            if (class107.field1612) {
                                                                class227.field3540[var12] = true;
                                                            }
                                                            if (var64 == null) {
                                                                class339.method2380(var11, 115);
                                                            } else if (class212.field3283 == var11 && class42.field664 == var55) {
                                                                int var65 = class268.field4137 - class283.field4383;
                                                                if (var65 < 5 && var65 > -5) {
                                                                    var65 = 0;
                                                                }
                                                                int var66 = class78.field1129 - class115.field1770;
                                                                if (var66 < 5 && var66 > -5) {
                                                                    var66 = 0;
                                                                }
                                                                if (class31.field490 < 5) {
                                                                    var66 = 0;
                                                                    var65 = 0;
                                                                }
                                                                var64.method5(var58 + var65, var59 + var66, 128);
                                                                if (arg2 != -1) {
                                                                    class342 var67 = arg9[arg2 & 0xFFFF];
                                                                    int var68;
                                                                    int var69;
                                                                    if (class240.field3737) {
                                                                        var68 = class213.field3344;
                                                                        var69 = class213.field3341;
                                                                    } else {
                                                                        var68 = class60.field934;
                                                                        var69 = class60.field931;
                                                                    }
                                                                    if ((var59 + var66) < var68 && var67.field5334 > 0) {
                                                                        int var70 = (var68 - var66 - var59) * class247.field3840 / 3;
                                                                        if ((class247.field3840 * 10) < var70) {
                                                                            var70 = class247.field3840 * 10;
                                                                        }
                                                                        if (var70 > var67.field5334) {
                                                                            var70 = var67.field5334;
                                                                        }
                                                                        var67.field5334 -= var70;
                                                                        class115.field1770 += var70;
                                                                        class339.method2380(var67, 124);
                                                                    }
                                                                    if (var69 < var59 + var66 + 32 && var67.field5334 < var67.field5264 - var67.field5339) {
                                                                        int var71 = (var59 + var66 - (-32 - -var69)) * class247.field3840 / 3;
                                                                        if (var71 > class247.field3840 * 10) {
                                                                            var71 = class247.field3840 * 10;
                                                                        }
                                                                        if (var67.field5264 - var67.field5339 - var67.field5334 < var71) {
                                                                            var71 = var67.field5264 - var67.field5339 - var67.field5334;
                                                                        }
                                                                        class115.field1770 -= var71;
                                                                        var67.field5334 += var71;
                                                                        class339.method2380(var67, 116);
                                                                    }
                                                                }
                                                            } else if (class128.field2134 == var11 && class316.field4876 == var55) {
                                                                var64.method5(var58, var59, 128);
                                                            } else {
                                                                var64.method17(var58, var59);
                                                            }
                                                        }
                                                    } else if (var11.field5391 != null && var55 < 20) {
                                                        class215 var60 = var11.method2400(0, var55);
                                                        if (var60 != null) {
                                                            var60.method17(var58, var59);
                                                        } else if (class227.field3551) {
                                                            class339.method2380(var11, 111);
                                                        }
                                                    }
                                                    var55++;
                                                }
                                            }
                                        } else if (var11.field5279 == 3) {
                                            int var139;
                                            if (class170.method1342(var11, (byte) 126)) {
                                                var139 = var11.field5421;
                                                if (class53.field804 == var11 && var11.field5341 != 0) {
                                                    var139 = var11.field5341;
                                                }
                                            } else {
                                                var139 = var11.field5277;
                                                if (class53.field804 == var11 && var11.field5343 != 0) {
                                                    var139 = var11.field5343;
                                                }
                                            }
                                            if (var15 == 0) {
                                                if (var11.field5369) {
                                                    if (class240.field3737) {
                                                        class213.method1593(var13, var14, var11.field5374, var11.field5339, var139);
                                                    } else {
                                                        class60.method611(var13, var14, var11.field5374, var11.field5339, var139);
                                                    }
                                                } else if (class240.field3737) {
                                                    class213.method1599(var13, var14, var11.field5374, var11.field5339, var139);
                                                } else {
                                                    class60.method604(var13, var14, var11.field5374, var11.field5339, var139);
                                                }
                                            } else if (var11.field5369) {
                                                if (class240.field3737) {
                                                    class213.method1594(var13, var14, var11.field5374, var11.field5339, var139, 256 - (var15 & 0xFF));
                                                } else {
                                                    class60.method601(var13, var14, var11.field5374, var11.field5339, var139, 256 - (var15 & 0xFF));
                                                }
                                            } else if (class240.field3737) {
                                                class213.method1592(var13, var14, var11.field5374, var11.field5339, var139, 256 - (var15 & 0xFF));
                                            } else {
                                                class60.method594(var13, var14, var11.field5374, var11.field5339, var139, 256 - (var15 & 0xFF));
                                            }
                                        } else if (var11.field5279 == 4) {
                                            class145 var72 = var11.method2413(class334.field5114, false);
                                            if (var72 != null) {
                                                String var73 = var11.field5265;
                                                int var74;
                                                if (class170.method1342(var11, (byte) 124)) {
                                                    var74 = var11.field5421;
                                                    if (class53.field804 == var11 && var11.field5341 != 0) {
                                                        var74 = var11.field5341;
                                                    }
                                                    if (var11.field5270.length() > 0) {
                                                        var73 = var11.field5270;
                                                    }
                                                } else {
                                                    var74 = var11.field5277;
                                                    if (class53.field804 == var11 && var11.field5343 != 0) {
                                                        var74 = var11.field5343;
                                                    }
                                                }
                                                if (var11.field5340 && var11.field5399 != -1) {
                                                    class263 var75 = class48.method469(10, var11.field5399);
                                                    var73 = var75.field4058;
                                                    if (var73 == null) {
                                                        var73 = "null";
                                                    }
                                                    if ((var75.field4030 == 1 || var11.field5425 != 1) && var11.field5425 != -1) {
                                                        var73 = "<col=ff9040>" + var73 + "</col> x" + class18.method195(var11.field5425, -1);
                                                    }
                                                }
                                                if (class356.field5672 == var11) {
                                                    var74 = var11.field5277;
                                                    var73 = class46.field737;
                                                }
                                                if (!var11.field5340) {
                                                    var73 = class6.method45(true, var73, var11);
                                                }
                                                var72.method1198(var73, var13, var14, var11.field5374, var11.field5339, var74, var11.field5285 ? 0 : -1, var11.field5437, var11.field5398, var11.field5362);
                                            } else if (class227.field3551) {
                                                class339.method2380(var11, 125);
                                            }
                                        } else if (var11.field5279 == 5) {
                                            if (!var11.field5340) {
                                                class215 var138 = var11.method2399(class170.method1342(var11, (byte) 127), 0);
                                                if (var138 != null) {
                                                    var138.method17(var13, var14);
                                                } else if (class227.field3551) {
                                                    class339.method2380(var11, 102);
                                                }
                                            } else if (var11.field5366 >= 0) {
                                                class229 var137 = var11.method2414((byte) 99);
                                                if (class240.field3737) {
                                                    var137.method1723(0, var13, var14, var11.field5374, var11.field5339, var11.field5387, var11.field5346, 0);
                                                } else {
                                                    var137.method1722(0, var13, var14, var11.field5374, var11.field5339, var11.field5387, var11.field5346, 0);
                                                }
                                            } else {
                                                class215 var122;
                                                if (var11.field5399 == -1) {
                                                    var122 = var11.method2399(false, 0);
                                                } else if (var11.field5314 && class173.field2746.field2730 != null) {
                                                    var122 = class161.method1294(var11.field5425, var11.field5399, var11.field5417, var11.field5397, var11.field5327, (byte) 126, class173.field2746.field2730);
                                                } else {
                                                    var122 = class161.method1294(var11.field5425, var11.field5399, var11.field5417, var11.field5397, var11.field5327, (byte) 123, (class207) null);
                                                }
                                                if (var122 != null) {
                                                    int var123 = var122.field3360;
                                                    int var124 = var122.field3369;
                                                    if (var11.field5378) {
                                                        int var126 = (var11.field5374 - (1 - var123)) / var123;
                                                        int var127 = (var11.field5339 - (1 - var124)) / var124;
                                                        if (class240.field3737) {
                                                            class213.method1600(var13, var14, var13 + var11.field5374, var11.field5339 + var14);
                                                            boolean var130 = class199.method1499(var122.field3366, (byte) 115);
                                                            boolean var131 = class199.method1499(var122.field3367, (byte) -70);
                                                            class2 var132 = (class2) var122;
                                                            if (var130 && var131) {
                                                                if (var15 == 0) {
                                                                    var132.method11(var13, var14, var126, var127);
                                                                } else {
                                                                    var132.method10(var13, var14, 256 - (var15 & 0xFF), var126, var127);
                                                                }
                                                            } else if (var130) {
                                                                for (int var136 = 0; var136 < var127; var136++) {
                                                                    if (var15 == 0) {
                                                                        var132.method11(var13, var124 * var136 + var14, var126, 1);
                                                                    } else {
                                                                        var132.method10(var13, var124 * var136 + var14, -(var15 & 0xFF) + 256, var126, 1);
                                                                    }
                                                                }
                                                            } else if (var131) {
                                                                for (int var135 = 0; var135 < var126; var135++) {
                                                                    if (var15 == 0) {
                                                                        var132.method11(var123 * var135 + var13, var14, 1, var127);
                                                                    } else {
                                                                        var132.method10(var123 * var135 + var13, var14, 256 - (var15 & 0xFF), 1, var127);
                                                                    }
                                                                }
                                                            } else {
                                                                for (int var133 = 0; var133 < var126; var133++) {
                                                                    for (int var134 = 0; var134 < var127; var134++) {
                                                                        if (var15 == 0) {
                                                                            var122.method17(var123 * var133 + var13, var14 - -(var124 * var134));
                                                                        } else {
                                                                            var122.method5(var123 * var133 + var13, var124 * var134 + var14, 256 - (var15 & 0xFF));
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            class213.method1595(arg7, arg6, arg8, arg1);
                                                        } else {
                                                            class60.method589(var13, var14, var13 + var11.field5374, var14 - -var11.field5339);
                                                            int var128 = 0;
                                                            while (true) {
                                                                if (var126 <= var128) {
                                                                    class60.method598(arg7, arg6, arg8, arg1);
                                                                    break;
                                                                }
                                                                for (int var129 = 0; var129 < var127; var129++) {
                                                                    if (var11.field5328 != 0) {
                                                                        var122.method1610(4096, var11.field5328, var124 * var129 + var124 / 2 + var14, var123 * var128 + (var13 - -(var123 / 2)), (byte) -33);
                                                                    } else if (var15 == 0) {
                                                                        var122.method17(var123 * var128 + var13, var124 * var129 + var14);
                                                                    } else {
                                                                        var122.method5(var123 * var128 + var13, var14 - -(var124 * var129), 256 - (var15 & 0xFF));
                                                                    }
                                                                }
                                                                var128++;
                                                            }
                                                        }
                                                    } else {
                                                        int var125 = var11.field5374 * 4096 / var123;
                                                        if (var11.field5328 != 0) {
                                                            var122.method1610(var125, var11.field5328, var11.field5339 / 2 + var14, var13 - -(var11.field5374 / 2), (byte) -33);
                                                        } else if (var15 != 0) {
                                                            var122.method12(var13, var14, var11.field5374, var11.field5339, 256 - (var15 & 0xFF));
                                                        } else if (var11.field5374 == var123 && var11.field5339 == var124) {
                                                            var122.method17(var13, var14);
                                                        } else {
                                                            var122.method13(var13, var14, var11.field5374, var11.field5339);
                                                        }
                                                    }
                                                } else if (class227.field3551) {
                                                    class339.method2380(var11, 119);
                                                }
                                            }
                                        } else if (var11.field5279 == 6) {
                                            class52 var76 = null;
                                            boolean var77 = class170.method1342(var11, (byte) 126);
                                            int var78;
                                            if (var77) {
                                                var78 = var11.field5275;
                                            } else {
                                                var78 = var11.field5440;
                                            }
                                            int var79 = 0;
                                            if (var11.field5399 != -1) {
                                                class263 var84 = class48.method469(10, var11.field5399);
                                                if (var84 != null) {
                                                    class263 var85 = var84.method1934(20116, var11.field5425);
                                                    class93 var86 = var78 == -1 ? null : class126.method1091((byte) 48, var78);
                                                    if (var11.field5314 && class173.field2746.field2730 != null) {
                                                        var76 = var85.method1936(var11.field5364, var11.field5310, 1, var86, 19239, class173.field2746.field2730, var11.field5361);
                                                    } else {
                                                        var76 = var85.method1936(var11.field5364, var11.field5310, 1, var86, 19239, (class207) null, var11.field5361);
                                                    }
                                                    if (var76 == null) {
                                                        class339.method2380(var11, 102);
                                                    } else {
                                                        var79 = -var76.method21() / 2;
                                                    }
                                                }
                                            } else if (var11.field5311 == 5) {
                                                if (var11.field5441 == -1) {
                                                    var76 = class37.field560.method1535((class93) null, false, (class93) null, true, (class349[]) null, -1, -1, 0, 0, 32, -1, -1);
                                                } else {
                                                    int var80 = var11.field5441;
                                                    class171 var81;
                                                    if (class118.field1813 == var80) {
                                                        var81 = class173.field2746;
                                                    } else {
                                                        var81 = class177.field2795[var80];
                                                    }
                                                    class93 var82 = var78 == -1 ? null : class126.method1091((byte) 94, var78);
                                                    if (var81 != null && (var80 == 2047 || class15.method164((byte) 86, var81.field2706) == var11.field5363)) {
                                                        var76 = var81.field2730.method1535((class93) null, false, var82, true, (class349[]) null, -1, -1, 0, 0, 119, var11.field5361, 0);
                                                    }
                                                }
                                            } else if (var78 == -1) {
                                                var76 = var11.method2411(-1, 0, (class93) null, class173.field2746.field2730, -104, -1, var77);
                                                if (var76 == null && class227.field3551) {
                                                    class339.method2380(var11, 103);
                                                }
                                            } else {
                                                class93 var83 = class126.method1091((byte) 64, var78);
                                                var76 = var11.method2411(var11.field5361, var11.field5310, var83, class173.field2746.field2730, -60, var11.field5364, var77);
                                                if (var76 == null && class227.field3551) {
                                                    class339.method2380(var11, 112);
                                                }
                                            }
                                            if (var76 != null) {
                                                int var87;
                                                if (var11.field5443 > 0) {
                                                    var87 = (var11.field5374 << 8) / var11.field5443;
                                                } else {
                                                    var87 = 256;
                                                }
                                                int var88 = (var11.field5411 * var87 >> 8) + (var13 + (var11.field5374 / 2));
                                                int var89;
                                                if (var11.field5308 > 0) {
                                                    var89 = (var11.field5339 << 8) / var11.field5308;
                                                } else {
                                                    var89 = 256;
                                                }
                                                int var90 = (var11.field5282 * var89 >> 8) + var11.field5339 / 2 + var14;
                                                if (class240.field3737) {
                                                    if (var11.field5313) {
                                                        class240.method1789(var88, var90, var11.field5288, var11.field5260, var87, var89);
                                                    } else {
                                                        class240.method1785(var88, var90, var87, var89);
                                                        class240.method1778((float) var11.field5293, (float) var11.field5260 * 1.5F);
                                                    }
                                                    class240.method1812();
                                                    class240.method1807(true);
                                                    class240.method1815(false);
                                                    class151.method1252(class139.field2321, 81);
                                                    if (class9.field130) {
                                                        class213.method1596();
                                                        class240.method1796();
                                                        class213.method1595(arg7, arg6, arg8, arg1);
                                                        class9.field130 = false;
                                                    }
                                                    if (var11.field5404) {
                                                        class240.method1791();
                                                    }
                                                    int var91 = class107.field1605[var11.field5299] * var11.field5288 >> 16;
                                                    int var92 = class107.field1604[var11.field5299] * var11.field5288 >> 16;
                                                    if (var11.field5340) {
                                                        var76.method490(0, var11.field5435, var11.field5381, var11.field5299, var11.field5289, var92 + var79 + var11.field5303, var11.field5303 + var91, -1L);
                                                    } else {
                                                        var76.method490(0, var11.field5435, 0, var11.field5299, 0, var92, var91, -1L);
                                                    }
                                                    if (var11.field5404) {
                                                        class240.method1803();
                                                    }
                                                } else {
                                                    class107.method920(var88, var90);
                                                    int var93 = class107.field1604[var11.field5299] * var11.field5288 >> 16;
                                                    int var94 = class107.field1605[var11.field5299] * var11.field5288 >> 16;
                                                    if (!var11.field5340) {
                                                        var76.method490(0, var11.field5435, 0, var11.field5299, 0, var93, var94, -1L);
                                                    } else if (var11.field5313) {
                                                        ((class124) var76).method1080(0, var11.field5435, var11.field5381, var11.field5299, var11.field5289, var11.field5303 + var93 + var79, var11.field5303 + var94, var11.field5288);
                                                    } else {
                                                        var76.method490(0, var11.field5435, var11.field5381, var11.field5299, var11.field5289, var11.field5303 + var93 + var79, var94 - -var11.field5303, -1L);
                                                    }
                                                    class107.method927();
                                                }
                                            }
                                        } else {
                                            label1140: {
                                                if (var11.field5279 == 7) {
                                                    class145 var95 = var11.method2413(class334.field5114, !arg5);
                                                    if (var95 == null) {
                                                        if (class227.field3551) {
                                                            class339.method2380(var11, 111);
                                                        }
                                                        break label1140;
                                                    }
                                                    int var96 = 0;
                                                    for (int var97 = 0; var97 < var11.field5413; var97++) {
                                                        for (int var98 = 0; var98 < var11.field5355; var98++) {
                                                            if (var11.field5280[var96] > 0) {
                                                                class263 var99 = class48.method469(10, var11.field5280[var96] - 1);
                                                                String var100;
                                                                if (var99.field4030 != 1 && var11.field5344[var96] == 1) {
                                                                    var100 = "<col=ff9040>" + var99.field4058 + "</col>";
                                                                } else {
                                                                    var100 = "<col=ff9040>" + var99.field4058 + "</col> x" + class18.method195(var11.field5344[var96], -1);
                                                                }
                                                                int var101 = (var11.field5286 + 115) * var98 + var13;
                                                                int var102 = (var11.field5370 + 12) * var97 + var14;
                                                                if (var11.field5437 == 0) {
                                                                    var95.method1190(var100, var101, var102, var11.field5277, var11.field5285 ? 0 : -1);
                                                                } else if (var11.field5437 == 1) {
                                                                    var95.method1189(var100, var101 + 57, var102, var11.field5277, var11.field5285 ? 0 : -1);
                                                                } else {
                                                                    var95.method1203(var100, var101 + 114, var102, var11.field5277, var11.field5285 ? 0 : -1);
                                                                }
                                                            }
                                                            var96++;
                                                        }
                                                    }
                                                }
                                                if (var11.field5279 == 8 && field5654 == var11 && class210.field3241 == class199.field3093) {
                                                    int var103 = 0;
                                                    class145 var104 = class346.field5506;
                                                    int var105 = 0;
                                                    String var106 = var11.field5265;
                                                    String var107 = class6.method45(arg5, var106, var11);
                                                    while (var107.length() > 0) {
                                                        int var108 = var107.indexOf("<br>");
                                                        String var109;
                                                        if (var108 == -1) {
                                                            var109 = var107;
                                                            var107 = "";
                                                        } else {
                                                            var109 = var107.substring(0, var108);
                                                            var107 = var107.substring(var108 + 4);
                                                        }
                                                        int var110 = var104.method1194(var109);
                                                        var103 += var104.field2366 + 1;
                                                        if (var110 > var105) {
                                                            var105 = var110;
                                                        }
                                                    }
                                                    var105 += 6;
                                                    var103 += 7;
                                                    int var111 = var11.field5374 + var13 - var105 - 5;
                                                    if (var111 < var13 + 5) {
                                                        var111 = var13 + 5;
                                                    }
                                                    int var112 = var14 - (-var11.field5339 - 5);
                                                    if (arg1 < (var112 + var103)) {
                                                        var112 = arg1 - var103;
                                                    }
                                                    if (var105 + var111 > arg8) {
                                                        var111 = arg8 - var105;
                                                    }
                                                    if (class240.field3737) {
                                                        class213.method1593(var111, var112, var105, var103, 16777120);
                                                        class213.method1599(var111, var112, var105, var103, 0);
                                                    } else {
                                                        class60.method611(var111, var112, var105, var103, 16777120);
                                                        class60.method604(var111, var112, var105, var103, 0);
                                                    }
                                                    int var113 = var112 + var104.field2366 + 2;
                                                    String var114 = var11.field5265;
                                                    String var115 = class6.method45(true, var114, var11);
                                                    while (var115.length() > 0) {
                                                        int var116 = var115.indexOf("<br>");
                                                        String var117;
                                                        if (var116 == -1) {
                                                            var117 = var115;
                                                            var115 = "";
                                                        } else {
                                                            var117 = var115.substring(0, var116);
                                                            var115 = var115.substring(var116 + 4);
                                                        }
                                                        var104.method1190(var117, var111 + 3, var113, 0, -1);
                                                        var113 += var104.field2366 + 1;
                                                    }
                                                }
                                                if (var11.field5279 == 9) {
                                                    int var118;
                                                    int var119;
                                                    int var120;
                                                    int var121;
                                                    if (var11.field5415) {
                                                        var118 = var13;
                                                        var120 = var13 + var11.field5374;
                                                        var119 = var14;
                                                        var121 = var11.field5339 + var14;
                                                    } else {
                                                        var118 = var13;
                                                        var119 = var11.field5339 + var14;
                                                        var120 = var11.field5374 + var13;
                                                        var121 = var14;
                                                    }
                                                    if (var11.field5295 == 1) {
                                                        if (class240.field3737) {
                                                            class213.method1585(var118, var121, var120, var119, var11.field5277);
                                                        } else {
                                                            class60.method610(var118, var121, var120, var119, var11.field5277);
                                                        }
                                                    } else if (class240.field3737) {
                                                        class213.method1590(var118, var121, var120, var119, var11.field5277, var11.field5295);
                                                    } else {
                                                        class60.method606(var118, var121, var120, var119, var11.field5277, var11.field5295);
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
            }
            var10++;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)V", line = 1417)
    public static final void method2495(int arg0, int arg1, int arg2) {
        field5657++;
        class138 var3 = class149.method1242(arg1, arg0, 1);
        var3.method1153((byte) 50);
        var3.field2282 = arg2;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z)V", line = 1442)
    public static void method2496(boolean arg0) {
        field5656 = null;
        field5652 = null;
        if (arg0) {
            field5652 = (class215) null;
        }
        field5655 = null;
        field5654 = null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)Lrg;", line = 1458)
    public static final class342 method2497(int arg0, int arg1) {
        field5651++;
        int var2 = arg1 >> 16;
        if (arg0 != 0) {
            field5654 = (class342) null;
        }
        int var3 = arg1 & 0xFFFF;
        if (class334.field5108[var2] == null || class334.field5108[var2][var3] == null) {
            boolean var4 = class328.method2321(arg0, var2);
            if (!var4) {
                return null;
            }
        }
        return class334.field5108[var2][var3];
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)V", line = 1487)
    public static final void method2498(int arg0) {
        field5658++;
        int var1 = 55 / ((-arg0 - 73) / 34);
        for (class160 var2 = (class160) class188.field2954.method2244((byte) -127); var2 != null; var2 = (class160) class188.field2954.method2241(-1)) {
            if (var2.field2542) {
                var2.method1292(-123);
            }
        }
        for (class160 var3 = (class160) class210.field3232.method2244((byte) -127); var3 != null; var3 = (class160) class210.field3232.method2241(-1)) {
            if (var3.field2542) {
                var3.method1292(-119);
            }
        }
    }
}
