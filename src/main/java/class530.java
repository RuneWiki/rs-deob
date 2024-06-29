import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class530 {

    @OriginalMember(owner = "client!gr", name = "j", descriptor = "I")
    private int field7724;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    public int field7716;

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "J")
    public static volatile long field7723 = 0L;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    public static int field7715;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
    public static int field7717;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
    public static int field7718;

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
    public static int field7719;

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "I")
    public static int field7720;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
    public static int field7721;

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "I")
    public static int field7722;

    @OriginalMember(owner = "client!gr", name = "k", descriptor = "I")
    public static int field7725;

    @OriginalMember(owner = "client!gr", name = "l", descriptor = "I")
    public static int field7726;

    @OriginalMember(owner = "client!gr", name = "m", descriptor = "I")
    public static int field7727;

    @OriginalMember(owner = "client!gr", name = "n", descriptor = "I")
    public static int field7728;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIII)I")
    public static final int method3211(int arg0, int arg1, int arg2, int arg3) {
        field7720++;
        if (class95.field1372 == null) {
            return 0;
        } else if (arg1 == 2) {
            int var4 = arg2 >> 9;
            int var5 = arg0 >> 9;
            if (var4 < 0 || var5 < 0 || (class184.field2546 - 1) < var4 || class240.field3555 - 1 < var5) {
                return 0;
            }
            int var6 = arg3;
            if (arg3 < 3 && (class160.field2297[1][var4][var5] & 0x2) != 0) {
                var6 = arg3 + 1;
            }
            return class95.field1372[var6].method2089(26448, arg2, arg0);
        } else {
            return 90;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIZ[Lqk;IIIIII)V")
    public static final void method3212(int arg0, int arg1, int arg2, boolean arg3, class146[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        class211.field3164.method297(arg1, arg2, arg6, arg5);
        field7725++;
        int var11 = 0;
        if (arg7 != 20028) {
            method3212(-1, 36, -89, false, null, 71, 46, 95, 8, 116, 35);
        }
        while (arg4.length > var11) {
            class146 var12 = arg4[var11];
            if (var12 != null && (var12.field2109 == arg10 || arg10 == -1412584499 && class131.field1810 == var12)) {
                int var13 = var12.field2103 + arg8;
                int var14 = var12.field1992 + arg0;
                int var15 = var12.field2016 + var13 + 1;
                int var16 = var12.field1997 + var14 + 1;
                int var17;
                if (arg9 == -1) {
                    class39.field673[class727.field10212].setBounds(var12.field2103 + arg8, var12.field1992 + arg0, var12.field2016, var12.field1997);
                    var17 = class727.field10212++;
                } else {
                    var17 = arg9;
                }
                var12.field2128 = var17;
                var12.field2118 = class703.field9918;
                if (!client.method2735(var12)) {
                    label674: {
                        if (var12.field1990 != 0) {
                            class498.method3027(var12, (byte) -109);
                        }
                        int var18 = var12.field2103 + arg8;
                        int var19 = var12.field1992 + arg0;
                        int var20 = 0;
                        int var21 = 0;
                        if (class416.field5919) {
                            var20 = class352.method2243(99);
                            var21 = class695.method3915((byte) 86);
                        }
                        int var22 = var12.field2052;
                        if (class284.field3960 && (client.method2732(var12).field6793 != 0 || var12.field2112 == 0) && var22 > 127) {
                            var22 = 127;
                        }
                        if (class131.field1810 == var12) {
                            if (arg10 != -1412584499 && (class425.field6148 == var12.field2082 || class738.field10306 == var12.field2082)) {
                                client.field6417 = arg4;
                                class348.field5155 = arg0;
                                class94.field1345 = arg8;
                                break label674;
                            }
                            if (class564.field8175 && class601.field8527) {
                                int var23 = class535.field7789.method2459(-32213) + var20;
                                int var24 = class535.field7789.method2452(-127) + var21;
                                int var25 = var24 - class285.field3968;
                                int var26 = var23 - class416.field5920;
                                if (var26 < class187.field2616) {
                                    var26 = class187.field2616;
                                }
                                if (class187.field2616 + class83.field1211.field2016 < var12.field2016 + var26) {
                                    var26 = class187.field2616 + class83.field1211.field2016 - var12.field2016;
                                }
                                if (class600.field8521 > var25) {
                                    var25 = class600.field8521;
                                }
                                var18 = var26;
                                if (class600.field8521 + class83.field1211.field1997 < var12.field1997 + var25) {
                                    var25 = class600.field8521 + class83.field1211.field1997 - var12.field1997;
                                }
                                var19 = var25;
                            }
                            if (class738.field10306 == var12.field2082) {
                                var22 = 128;
                            }
                        }
                        int var27;
                        int var28;
                        int var29;
                        int var30;
                        if (var12.field2112 == 2) {
                            var27 = arg1;
                            var28 = arg2;
                            var29 = arg6;
                            var30 = arg5;
                        } else {
                            int var31 = var12.field2016 + var18;
                            int var32 = var19 + var12.field1997;
                            var27 = var18 > arg1 ? var18 : arg1;
                            if (var12.field2112 == 9) {
                                var31++;
                                var32++;
                            }
                            var28 = arg2 < var19 ? var19 : arg2;
                            var29 = var31 < arg6 ? var31 : arg6;
                            var30 = arg5 <= var32 ? arg5 : var32;
                        }
                        if (var27 < var29 && var30 > var28) {
                            label699: {
                                if (var12.field1990 != 0) {
                                    if (class543.field7887 == var12.field1990 || class475.field6768 == var12.field1990) {
                                        class512.method3115(var19, var12, var18, false);
                                        if (!class416.field5919) {
                                            class259.method1721(var18, -17748, var19, class475.field6768 == var12.field1990, var12.field2016, var12.field1997);
                                            class211.field3164.method297(arg1, arg2, arg6, arg5);
                                        }
                                        class108.field1545[var17] = true;
                                        break label699;
                                    }
                                    if (class642.field9139 == var12.field1990) {
                                        if (var12.method1030(arg7 ^ 0xFFFFB196, class211.field3164) != null) {
                                            class569.method3387(arg7 ^ 0x4E3C);
                                            class193.method1370((byte) -98, var12, class211.field3164, var18, var19);
                                            class567.field8200[var17] = true;
                                            class211.field3164.method297(arg1, arg2, arg6, arg5);
                                            if (class416.field5919) {
                                                if (arg3) {
                                                    class545.method3277(var13, var14, var15, -93, var16);
                                                } else {
                                                    class588.method3460(var16, var15, var14, var13, 58);
                                                }
                                            }
                                        }
                                        break label699;
                                    }
                                    if (class690.field9794 == var12.field1990) {
                                        if (var12.method1030(-110, class211.field3164) != null) {
                                            class714.method4009(false, var12, var18, var19);
                                            class567.field8200[var17] = true;
                                            class211.field3164.method297(arg1, arg2, arg6, arg5);
                                            if (class416.field5919) {
                                                if (arg3) {
                                                    class545.method3277(var13, var14, var15, -83, var16);
                                                } else {
                                                    class588.method3460(var16, var15, var14, var13, arg7 - 19970);
                                                }
                                            }
                                        }
                                        break label699;
                                    }
                                    if (class451.field6456 == var12.field1990) {
                                        class416.method2511(var12.field2016, var19, class621.field8832, var18, -38, class211.field3164, var12.field1997);
                                        class108.field1545[var17] = true;
                                        class211.field3164.method297(arg1, arg2, arg6, arg5);
                                        break label699;
                                    }
                                    if (class475.field6766 == var12.field1990) {
                                        class333.method2045(var12.field1997, var18, var19, class211.field3164, var12.field2016, -28963);
                                        class108.field1545[var17] = true;
                                        class211.field3164.method297(arg1, arg2, arg6, arg5);
                                        break label699;
                                    }
                                    if (class455.field6489 == var12.field1990) {
                                        if (!class372.field5403 && !class438.field6255) {
                                            break label699;
                                        }
                                        int var33 = var12.field2016 + var18;
                                        int var34 = var19 + 15;
                                        if (class416.field5919) {
                                            if (arg3) {
                                                class545.method3277(var13, var14, var15, -76, var16);
                                            } else {
                                                class588.method3460(var16, var15, var14, var13, 58);
                                            }
                                        }
                                        if (class372.field5403) {
                                            int var35 = -256;
                                            if (class162.field2322 < 20) {
                                                var35 = -65536;
                                            }
                                            class208.field3141.method2427(-1, var33, "Fps:" + class162.field2322, var34, var35, (byte) 63);
                                            var34 += 15;
                                            Runtime var36 = Runtime.getRuntime();
                                            int var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                            int var38 = -256;
                                            if (var37 > 98304) {
                                                if (class265.field3797) {
                                                    class700.method3933(arg7 ^ 0x4E3C);
                                                    for (int var39 = 0; var39 < 10; var39++) {
                                                        System.gc();
                                                    }
                                                    var37 = (int) ((var36.totalMemory() - var36.freeMemory()) / 1024L);
                                                    if (var37 > 65536) {
                                                        class758.method4212(4, 2, "WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
                                                    }
                                                }
                                                var38 = -65536;
                                            }
                                            class208.field3141.method2427(-1, var33, "Mem:" + var37 + "k", var34, var38, (byte) 58);
                                            var34 += 15;
                                            class208.field3141.method2427(-1, var33, "In:" + class322.field4384 + "B/s Out:" + class171.field2402 + "B/s", var34, -256, (byte) 89);
                                            var34 += 15;
                                            int var40 = class211.field3164.method331() / 1024;
                                            class208.field3141.method2427(-1, var33, "Offheap:" + var40 + "k", var34, var40 <= 65536 ? -256 : -65536, (byte) 52);
                                            var34 += 15;
                                            int var41 = 0;
                                            int var42 = 0;
                                            int var43 = 0;
                                            for (int var44 = 0; var44 < 37; var44++) {
                                                if (class59.field983[var44] != null) {
                                                    var41 += class59.field983[var44].method1594(arg7 ^ 0x4E4F);
                                                    var42 += class59.field983[var44].method1596(92);
                                                    var43 += class59.field983[var44].method1602((byte) 57);
                                                }
                                            }
                                            int var45 = var43 * 100 / var41;
                                            int var46 = var42 * 10000 / var41;
                                            String var47 = "Cache:" + class517.method3140(2, (byte) -110, 0, (long) var46, true) + "% (" + var45 + "%)";
                                            class564.field8163.method2427(-1, var33, var47, var34, -256, (byte) 119);
                                            var34 += 12;
                                        }
                                        if (class357.field5266 > 0) {
                                            class564.field8163.method2427(-1, var33, "Particles: " + class460.field6530 + " / " + class357.field5266, var34, -256, (byte) 112);
                                        }
                                        var34 += 12;
                                        if (class438.field6255) {
                                            class564.field8163.method2427(-1, var33, "Polys: " + class211.field3164.method1237() + " Models: " + class211.field3164.method332(), var34, -256, (byte) 71);
                                            var34 += 12;
                                            class564.field8163.method2427(-1, var33, "Ls: " + class65.field1014 + " La: " + class692.field9802 + " NPC: " + class442.field6293 + " Pl: " + class646.field9295, var34, -256, (byte) 45);
                                            var34 += 12;
                                            class604.method3516(111);
                                        }
                                        class108.field1545[var17] = true;
                                        break label699;
                                    }
                                }
                                if (var12.field2112 == 0) {
                                    if (class261.field3712 == var12.field1990 && class211.field3164.method1242()) {
                                        class211.field3164.method1250(var18, var19, var12.field2016, var12.field1997);
                                    }
                                    method3212(var19 - var12.field1970, var27, var28, arg3, arg4, var30, var29, 20028, var18 - var12.field1988, var17, var12.field2079);
                                    if (var12.field2019 != null) {
                                        method3212(var19 - var12.field1970, var27, var28, arg3, var12.field2019, var30, var29, 20028, var18 - var12.field1988, var17, var12.field2079);
                                    }
                                    class182 var48 = (class182) class591.field8410.method4020((long) var12.field2079, (byte) -99);
                                    if (var48 != null) {
                                        class548.method3298(var17, var28, var18, var19, var30, var29, var48.field2505, var27, -864930360);
                                    }
                                    if (class261.field3712 == var12.field1990 && class211.field3164.method1242()) {
                                        class211.field3164.method1244();
                                    }
                                    class211.field3164.method297(arg1, arg2, arg6, arg5);
                                }
                                if (class486.field7003[var17] || class171.field2403 > 1) {
                                    if (var12.field2112 == 3) {
                                        if (var22 == 0) {
                                            if (var12.field2004) {
                                                class211.field3164.method397(var18, var19, var12.field2016, var12.field1997, var12.field2013, 0);
                                            } else {
                                                class211.field3164.method305(var18, var19, var12.field2016, var12.field1997, var12.field2013, 0);
                                            }
                                        } else if (var12.field2004) {
                                            class211.field3164.method397(var18, var19, var12.field2016, var12.field1997, var12.field2013 & 0xFFFFFF | 255 - (var22 & 0xFF) << 24, 1);
                                        } else {
                                            class211.field3164.method305(var18, var19, var12.field2016, var12.field1997, var12.field2013 & 0xFFFFFF | 255 - (var22 & 0xFF) << 24, 1);
                                        }
                                        if (class416.field5919) {
                                            if (arg3) {
                                                class545.method3277(var13, var14, var15, arg7 ^ 0xFFFFB187, var16);
                                            } else {
                                                class588.method3460(var16, var15, var14, var13, 58);
                                            }
                                        }
                                    } else if (var12.field2112 == 4) {
                                        class400 var49 = var12.method1035((byte) 91, class211.field3164);
                                        if (var49 != null) {
                                            int var50 = var12.field2013;
                                            String var51 = var12.field2090;
                                            if (var12.field2131 != -1) {
                                                class424 var52 = class425.field6147.method4144(var12.field2131, 123);
                                                var51 = var52.field6070;
                                                if (var51 == null) {
                                                    var51 = "null";
                                                }
                                                if ((var52.field6064 == 1 || var12.field2020 != 1) && var12.field2020 != -1) {
                                                    var51 = "<col=ff9040>" + var51 + "</col> x" + class167.method1196(var12.field2020, 0);
                                                }
                                            }
                                            if (var12.field2124 != -1) {
                                                var51 = class481.method2931((byte) -114, var12.field2124);
                                                if (var51 == null) {
                                                    var51 = "";
                                                }
                                            }
                                            if (class310.field4186 == var12) {
                                                var51 = class608.field8651.method3543(-24350, class45.field748);
                                                var50 = var12.field2013;
                                            }
                                            if (class247.field3605) {
                                                class211.field3164.method335(var18, var19, var18 + var12.field2016, var12.field1997 + var19);
                                            }
                                            var49.method2430(var18, var12.field2039, var12.field2050 ? 255 - (var22 & 0xFF) << 24 : -1, 0, var51, var12.field1997, false, var12.field2071, null, null, var19, var50 | 255 - (var22 & 0xFF) << 24, 0, var12.field2099, class139.field1899, var12.field2016, var12.field2136);
                                            if (class247.field3605) {
                                                class211.field3164.method297(arg1, arg2, arg6, arg5);
                                            }
                                            if (var51.trim().length() > 0) {
                                                if (!class247.field3605) {
                                                    class502 var53 = class62.method578((byte) -106, class211.field3164, var12.field2002);
                                                    int var54 = var53.method3067(var12.field2016, var51, arg7 - 19904, class139.field1899);
                                                    int var55 = var53.method3065(var12.field2016, class139.field1899, var51, var12.field2099, 0);
                                                    if (class416.field5919) {
                                                        if (arg3) {
                                                            class545.method3277(var18, var19, var18 + var54, -63, var19 + var55);
                                                        } else {
                                                            class588.method3460(var19 + var55, var18 + var54, var19, var18, 58);
                                                        }
                                                    }
                                                } else if (class416.field5919) {
                                                    if (arg3) {
                                                        class545.method3277(var13, var14, var15, -76, var16);
                                                    } else {
                                                        class588.method3460(var16, var15, var14, var13, 58);
                                                    }
                                                }
                                            }
                                        } else if (class59.field985) {
                                            class401.method2439(1723, var12);
                                        }
                                    } else if (var12.field2112 == 5) {
                                        if (var12.field2057 < 0) {
                                            class515 var56;
                                            if (var12.field2131 != -1) {
                                                class132 var57 = var12.field2027 ? class108.field1536.field9081 : null;
                                                var56 = class425.field6147.method4146(-20951, var12.field2053 | -16777216, var12.field2020, var57, var12.field2098, var12.field2023, class211.field3164, var12.field2131);
                                            } else if (var12.field2124 == -1) {
                                                var56 = var12.method1023(true, class211.field3164);
                                            } else {
                                                var56 = class325.method2011(var12.field2124, class211.field3164, (byte) -120);
                                            }
                                            if (var56 != null) {
                                                int var58 = var56.method784();
                                                int var59 = var56.method780();
                                                int var60 = 255 - (var22 & 0xFF) << 24 | (var12.field2013 == 0 ? 16777215 : var12.field2013 & 0xFFFFFF);
                                                if (var12.field2069) {
                                                    class211.field3164.method335(var18, var19, var12.field2016 + var18, var12.field1997 + var19);
                                                    if (var12.field2060 != 0) {
                                                        int var61 = (var58 + var12.field2016 - 1) / var58;
                                                        int var62 = (var12.field1997 + var59 - 1) / var59;
                                                        for (int var63 = 0; var63 < var61; var63++) {
                                                            for (int var64 = 0; var64 < var62; var64++) {
                                                                if (var12.field2013 == 0) {
                                                                    var56.method3134((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field2060);
                                                                } else {
                                                                    var56.method3133((float) var58 / 2.0F + (float) (var58 * var63 + var18), (float) var59 / 2.0F + (float) (var59 * var64 + var19), 4096, var12.field2060, 0, var60, 1);
                                                                }
                                                            }
                                                        }
                                                    } else if (var12.field2013 == 0 && var22 == 0) {
                                                        var56.method3135(var18, var19, var12.field2016, var12.field1997);
                                                    } else {
                                                        var56.method775(var18, var19, var12.field2016, var12.field1997, 0, var60, 1);
                                                    }
                                                    class211.field3164.method297(arg1, arg2, arg6, arg5);
                                                } else if (var12.field2013 == 0 && var22 == 0) {
                                                    if (var12.field2060 != 0) {
                                                        var56.method3134((float) var12.field2016 / 2.0F + (float) var18, (float) var12.field1997 / 2.0F + (float) var19, var12.field2016 * 4096 / var58, var12.field2060);
                                                    } else if (var12.field2016 == var58 && var12.field1997 == var59) {
                                                        var56.method3128(var18, var19);
                                                    } else {
                                                        var56.method3132(var18, var19, var12.field2016, var12.field1997);
                                                    }
                                                } else if (var12.field2060 != 0) {
                                                    var56.method3133((float) var12.field2016 / 2.0F + (float) var18, (float) var12.field1997 / 2.0F + (float) var19, var12.field2016 * 4096 / var58, var12.field2060, 0, var60, 1);
                                                } else if (var12.field2016 == var58 && var12.field1997 == var59) {
                                                    var56.method789(var18, var19, 0, var60, 1);
                                                } else {
                                                    var56.method3130(var18, var19, var12.field2016, var12.field1997, 0, var60, 1);
                                                }
                                            } else if (class59.field985) {
                                                class401.method2439(1723, var12);
                                            }
                                        } else {
                                            var12.method1028(class154.field2237, (byte) -83, class455.field6490).method3377(var12.field2017 << 3, var18, 0, var12.field1997, -3, var12.field2016, var12.field2008 << 3, 0, class211.field3164, var19);
                                        }
                                        if (class416.field5919) {
                                            if (arg3) {
                                                class545.method3277(var13, var14, var15, -61, var16);
                                            } else {
                                                class588.method3460(var16, var15, var14, var13, 58);
                                            }
                                        }
                                    } else if (var12.field2112 == 6) {
                                        class716.method4026(102);
                                        class282 var65 = null;
                                        int var66 = 0;
                                        if (var12.field2131 != -1) {
                                            class424 var67 = class425.field6147.method4144(var12.field2131, 127);
                                            if (var67 != null) {
                                                class424 var68 = var67.method2632(-122, var12.field2020);
                                                class131 var69 = var12.field2062 == -1 ? null : class610.field8698.method2999(var12.field2062, false);
                                                class132 var70 = var12.field2027 ? class108.field1536.field9081 : null;
                                                var65 = var68.method2633(var70, arg7 ^ 0xFFFFB1C3, 2048, var12.field2007, 1, var12.field1986, class211.field3164, var12.field2070, var69);
                                                if (var65 == null) {
                                                    class401.method2439(arg7 ^ 0x4887, var12);
                                                } else {
                                                    var66 = -var65.method511() >> 1;
                                                }
                                            }
                                        } else if (var12.field2015 == 5) {
                                            int var75 = var12.field2125;
                                            if (var75 >= 0 && var75 < 2048) {
                                                class639 var76 = class536.field7796[var75];
                                                class131 var77 = var12.field2062 == -1 ? null : class610.field8698.method2999(var12.field2062, false);
                                                if (var76 != null && (class652.field9348 == var75 || class126.method884(-122, var76.field9056) == var12.field2000)) {
                                                    var65 = var76.field9081.method934(-1, class226.field3372, null, 0, var77, true, class288.field4000, class610.field8698, 0, var12.field2070, class434.field6215, class211.field3164, var12.field1986, var12.field2007, class306.field4169, class425.field6147, null, 2048, 0, null, -111);
                                                }
                                            }
                                        } else if (var12.field2015 == 8 || var12.field2015 == 9) {
                                            class37 var72 = class582.method3429(false, (byte) -126, var12.field2125);
                                            class131 var73 = var12.field2062 == -1 ? null : class610.field8698.method2999(var12.field2062, false);
                                            if (var72 != null) {
                                                class132 var74 = var12.field2027 ? class108.field1536.field9081 : null;
                                                var65 = var72.method193(var12.field2070, var12.field2007, var73, arg7 ^ 0xFFFFB1BD, class211.field3164, var12.field2000, var12.field2015 == 9, var12.field1986, 2048, var74);
                                            }
                                        } else if (var12.field2062 == -1) {
                                            var65 = var12.method1034(class434.field6215, class226.field3372, class211.field3164, class108.field1536.field9081, class306.field4169, class288.field4000, -1, 0, -8, -1, class610.field8698, null, 2048, class425.field6147);
                                            if (var65 == null && class59.field985) {
                                                class401.method2439(1723, var12);
                                            }
                                        } else {
                                            class131 var71 = class610.field8698.method2999(var12.field2062, false);
                                            var65 = var12.method1034(class434.field6215, class226.field3372, class211.field3164, class108.field1536.field9081, class306.field4169, class288.field4000, var12.field1986, var12.field2007, -8, var12.field2070, class610.field8698, var71, 2048, class425.field6147);
                                            if (var65 == null && class59.field985) {
                                                class401.method2439(arg7 - 18305, var12);
                                            }
                                        }
                                        if (var65 != null) {
                                            int var78;
                                            if (var12.field2012 > 0) {
                                                var78 = (var12.field2016 << 9) / var12.field2012;
                                            } else {
                                                var78 = 512;
                                            }
                                            int var79;
                                            if (var12.field2046 > 0) {
                                                var79 = (var12.field1997 << 9) / var12.field2046;
                                            } else {
                                                var79 = 512;
                                            }
                                            int var80 = var12.field2016 / 2 + var18;
                                            int var81 = var12.field1997 / 2 + var19;
                                            if (!var12.field2056) {
                                                var80 += var12.field2084 * var78 >> 9;
                                                var81 += var12.field2138 * var79 >> 9;
                                            }
                                            class182.field2510.method851();
                                            class211.field3164.method364(class182.field2510);
                                            class211.field3164.method398(var80, var81, var78, var79);
                                            class211.field3164.method1235();
                                            if (var12.field2089) {
                                                class211.field3164.method235(false);
                                            }
                                            if (var12.field2056) {
                                                class569.field8215.method842(var12.field2132);
                                                class569.field8215.method852(var12.field2083);
                                                class569.field8215.method857(var12.field2038);
                                                class569.field8215.method849(var12.field2084, var12.field2138, var12.field2115);
                                            } else {
                                                int var82 = (var12.field2105 << 2) * class125.field1736[var12.field2132 << 3] >> 14;
                                                int var83 = (var12.field2105 << 2) * class125.field1729[var12.field2132 << 3] >> 14;
                                                class569.field8215.method858(-var12.field2038 << 3);
                                                class569.field8215.method852(var12.field2083 << 3);
                                                class569.field8215.method849(var12.field1995 << 2, (var12.field2066 << 2) + var82 + var66, var83 - -(var12.field2066 << 2));
                                                class569.field8215.method860(var12.field2132 << 3);
                                            }
                                            var12.method1021(class569.field8215, var65, 1449, class211.field3164, class703.field9918);
                                            if (class247.field3605) {
                                                class211.field3164.method335(var18, var19, var12.field2016 + var18, var12.field1997 + var19);
                                            }
                                            if (var12.field2056) {
                                                if (var12.field2049) {
                                                    var65.method503(class569.field8215, null, var12.field2105, 1);
                                                } else {
                                                    var65.method533(class569.field8215, null, 1);
                                                    if (var12.field1979 != null) {
                                                        class211.field3164.method214(var12.field1979.method123());
                                                    }
                                                }
                                            } else if (var12.field2049) {
                                                var65.method503(class569.field8215, null, var12.field2105 << 2, 1);
                                            } else {
                                                var65.method533(class569.field8215, null, 1);
                                                if (var12.field1979 != null) {
                                                    class211.field3164.method214(var12.field1979.method123());
                                                }
                                            }
                                            if (class247.field3605) {
                                                class211.field3164.method297(arg1, arg2, arg6, arg5);
                                            }
                                            if (var12.field2089) {
                                                class211.field3164.method235(true);
                                            }
                                        }
                                        if (class416.field5919) {
                                            if (arg3) {
                                                class545.method3277(var13, var14, var15, -120, var16);
                                            } else {
                                                class588.method3460(var16, var15, var14, var13, 58);
                                            }
                                        }
                                    } else if (var12.field2112 == 9) {
                                        int var84;
                                        int var85;
                                        int var86;
                                        int var87;
                                        if (var12.field2096) {
                                            var84 = var12.field2016 + var18;
                                            var85 = var18;
                                            var86 = var12.field1997 + var19;
                                            var87 = var19;
                                        } else {
                                            var85 = var18;
                                            var87 = var12.field1997 + var19;
                                            var84 = var12.field2016 + var18;
                                            var86 = var19;
                                        }
                                        if (var12.field2113 == 1) {
                                            class211.field3164.method380(var85, var86, var84, var87, var12.field2013, 0);
                                        } else {
                                            class211.field3164.method229(var85, var86, var84, var87, var12.field2013, var12.field2113, 0);
                                        }
                                        if (class416.field5919) {
                                            if (arg3) {
                                                class545.method3277(var13, var14, var15, -88, var16);
                                            } else {
                                                class588.method3460(var16, var15, var14, var13, 58);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var11++;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IB)Ldj;")
    public static final class703 method3213(int arg0, byte arg1) {
        field7718++;
        class703[] var2 = class587.method3453((byte) 119);
        if (arg1 > -43) {
            field7723 = -102L;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field9909 == arg0) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3214(int arg0, int arg1, byte arg2) {
        field7719++;
        if (arg2 <= 117) {
            field7723 = 118L;
        }
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Z)V")
    public static final void method3215(boolean arg0) {
        field7727++;
        if (arg0 && class533.field7776 != null) {
            class533.field7776.method3266(1);
            class533.field7776 = null;
            class384.field5560 = null;
        }
    }

    @OriginalMember(owner = "client!gr", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7722++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IILcs;)V")
    public static final void method3216(int arg0, int arg1, class335 arg2) {
        field7728++;
        if (arg2.field4564 != null) {
            int var3 = arg2.field4564[arg0 + 1];
            if (arg2.field4545 != var3) {
                arg2.field4616 = 1;
                arg2.field4551 = 0;
                arg2.field4597 = 0;
                arg2.field4641 = arg2.field4637;
                arg2.field4545 = var3;
                arg2.field4605 = 0;
                if (arg2.field4545 != -1) {
                    class701.method3941(arg2.field4605, class610.field8698.method2999(arg2.field4545, false), (byte) 101, arg2);
                }
            }
        }
        if (arg1 != -3587) {
            field7723 = 81L;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)I")
    public final int method3217(int arg0) {
        field7715++;
        if (arg0 <= 31) {
            method3212(21, 32, -19, true, null, -81, -99, 80, 32, 116, -18);
        }
        return this.field7724;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V")
    public static final void method3218(byte arg0) {
        field7717++;
        int var1 = 123 / ((arg0 - 14) / 56);
        if (!class410.field5818) {
            return;
        }
        while (true) {
            while (class614.field8762 < class537.field7803.length) {
                class592 var2 = class537.field7803[class614.field8762];
                if (var2 != null && var2.field8418 == -1) {
                    if (class433.field6212 == null) {
                        class433.field6212 = class601.field8528.method4030((byte) -112, var2.field8412);
                    }
                    int var3 = class433.field6212.field9520;
                    if (var3 == -1) {
                        return;
                    }
                    class614.field8762++;
                    var2.field8418 = var3;
                    class433.field6212 = null;
                } else {
                    class614.field8762++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(II)V")
    public class530(int arg0, int arg1) {
        this.field7724 = arg0;
        this.field7716 = arg1;
    }
}
