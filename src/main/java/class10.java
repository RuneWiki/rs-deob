import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class10 extends class498 {

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "S")
    public short field141;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field140 = 0;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
    public static int field143 = -1;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I[Lhm;IIIIIIII)V")
    public static final void method58(int arg0, class150[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class385.field5414.method301(arg9, arg7, arg8, arg6);
        field139++;
        int var10 = 0;
        if (arg4 != -31200) {
            return;
        }
        while (var10 < arg1.length) {
            class150 var11 = arg1[var10];
            if (var11 != null && (var11.field2071 == arg3 || arg3 == -1412584499 && class471.field6573 == var11)) {
                int var12;
                if (arg0 == -1) {
                    class95.field1226[class449.field6257].setBounds(var11.field2015 + arg2, var11.field2058 + arg5, var11.field2113, var11.field2033);
                    var12 = class449.field6257++;
                } else {
                    var12 = arg0;
                }
                var11.field1987 = class390.field5481;
                var11.field2145 = var12;
                if (!client.method1288(var11)) {
                    label575: {
                        if (var11.field2006 != 0) {
                            class169.method1065(var11, arg4 ^ 0xFFFF8620);
                        }
                        int var13 = var11.field2015 + arg2;
                        int var14 = var11.field2058 + arg5;
                        int var15 = var11.field2129;
                        if (class126.field1700 && (client.method1291(var11).field7033 != 0 || var11.field2022 == 0) && var15 > 127) {
                            var15 = 127;
                        }
                        if (class471.field6573 == var11) {
                            if (arg3 != -1412584499 && (class214.field3090 == var11.field2119 || class212.field3064 == var11.field2119)) {
                                class434.field6108 = arg1;
                                class131.field1728 = arg5;
                                class288.field4206 = arg2;
                                break label575;
                            }
                            if (class172.field2487 && class532.field7810) {
                                int var16 = class22.field277.method1192(true);
                                int var17 = class22.field277.method1194(36);
                                int var18 = var17 - class403.field5714;
                                int var19 = var16 - class454.field6370;
                                if (class536.field7848 > var19) {
                                    var19 = class536.field7848;
                                }
                                if (class413.field5842 > var18) {
                                    var18 = class413.field5842;
                                }
                                if (var11.field2113 + var19 > class536.field7848 - -class147.field1965.field2113) {
                                    var19 = class536.field7848 + class147.field1965.field2113 - var11.field2113;
                                }
                                var13 = var19;
                                if (var11.field2033 + var18 > class413.field5842 + class147.field1965.field2033) {
                                    var18 = class413.field5842 + class147.field1965.field2033 - var11.field2033;
                                }
                                var14 = var18;
                            }
                            if (class212.field3064 == var11.field2119) {
                                var15 = 128;
                            }
                        }
                        int var22;
                        int var23;
                        int var24;
                        int var25;
                        if (var11.field2022 == 2) {
                            var23 = arg9;
                            var24 = arg6;
                            var22 = arg7;
                            var25 = arg8;
                        } else {
                            int var20 = var11.field2113 + var13;
                            int var21 = var11.field2033 + var14;
                            var22 = var14 > arg7 ? var14 : arg7;
                            if (var11.field2022 == 9) {
                                var21++;
                                var20++;
                            }
                            var23 = arg9 < var13 ? var13 : arg9;
                            var24 = var21 < arg6 ? var21 : arg6;
                            var25 = arg8 <= var20 ? arg8 : var20;
                        }
                        if (var23 < var25 && var24 > var22) {
                            label577: {
                                if (var11.field2006 != 0) {
                                    if (class325.field4746 == var11.field2006 || class170.field2478 == var11.field2006) {
                                        class143.method890((byte) -9, class170.field2478 == var11.field2006, var14, var13, var11.field2113, var11.field2033);
                                        class306.field4450[var12] = true;
                                        class385.field5414.method301(arg9, arg7, arg8, arg6);
                                        break label577;
                                    }
                                    if (class144.field1909 == var11.field2006) {
                                        if (var11.method944(class385.field5414, -1) != null) {
                                            class322.method1949(14);
                                            class178.method1111(var11, class385.field5414, var14, arg4 + 47402, var13);
                                            class531.field7773[var12] = true;
                                            class385.field5414.method301(arg9, arg7, arg8, arg6);
                                        }
                                        break label577;
                                    }
                                    if (class33.field379 == var11.field2006) {
                                        if (var11.method944(class385.field5414, -1) != null) {
                                            class346.method2054(false, var11, var13, var14);
                                            class531.field7773[var12] = true;
                                            class385.field5414.method301(arg9, arg7, arg8, arg6);
                                        }
                                        break label577;
                                    }
                                    if (class453.field6357 == var11.field2006) {
                                        class413.method2448(class171.field2485, var11.field2113, class385.field5414, var14, var11.field2033, var13, arg4 + 31312);
                                        class306.field4450[var12] = true;
                                        class385.field5414.method301(arg9, arg7, arg8, arg6);
                                        break label577;
                                    }
                                    if (class440.field6149 == var11.field2006) {
                                        class187.method1187(var11.field2113, arg4 ^ 0xFFFF93EA, var14, var11.field2033, var13, class385.field5414);
                                        class306.field4450[var12] = true;
                                        class385.field5414.method301(arg9, arg7, arg8, arg6);
                                        break label577;
                                    }
                                    if (class521.field7676 == var11.field2006) {
                                        if (!class496.field7035 && !class225.field3238) {
                                            break label577;
                                        }
                                        int var26 = var13 + var11.field2113;
                                        int var27 = var14 + 15;
                                        if (class496.field7035) {
                                            int var28 = -256;
                                            if (class530.field7764 < 20) {
                                                var28 = -65536;
                                            }
                                            class38.field415.method1921(var27, var26, "Fps:" + class530.field7764, var28, 126, -1);
                                            var27 += 15;
                                            Runtime var29 = Runtime.getRuntime();
                                            int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                            int var31 = -256;
                                            if (var30 > 65536) {
                                                var31 = -65536;
                                            }
                                            class38.field415.method1921(var27, var26, "Mem:" + var30 + "k", var31, arg4 ^ 0xFFFF861C, -1);
                                            var27 += 15;
                                            class38.field415.method1921(var27, var26, "In:" + class113.field1535 + "B/s Out:" + class419.field5907 + "B/s", -256, arg4 + 31253, -1);
                                            var27 += 15;
                                            int var32 = class385.field5414.method304() / 1024;
                                            class38.field415.method1921(var27, var26, "Offheap:" + var32 + "k", var32 <= 65536 ? -256 : -65536, arg4 + 31293, -1);
                                            var27 += 15;
                                            int var33 = 0;
                                            int var34 = 0;
                                            int var35 = 0;
                                            for (int var36 = 0; var36 < 30; var36++) {
                                                var33 += class485.field6769[var36].method746(112);
                                                var34 += class485.field6769[var36].method739(arg4 + 31300);
                                                var35 += class485.field6769[var36].method735(false);
                                            }
                                            int var37 = var35 * 100 / var33;
                                            int var38 = var34 * 10000 / var33;
                                            String var39 = "Cache:" + class52.method413(false, 2, 0, true, (long) var38) + "% (" + var37 + "%)";
                                            class53.field682.method1921(var27, var26, var39, -256, 99, -1);
                                            var27 += 12;
                                        }
                                        if (class369.field5271 > 0) {
                                            class53.field682.method1921(var27, var26, "Particles: " + class27.field329 + " / " + class369.field5271, -256, arg4 + 31290, -1);
                                        }
                                        var27 += 12;
                                        if (class225.field3238) {
                                            class53.field682.method1921(var27, var26, "Polys: " + class385.field5414.method392() + " Models: " + class385.field5414.method378(), -256, 122, -1);
                                            var27 += 12;
                                            class53.field682.method1921(var27, var26, "Ls: " + class167.field2435 + " La: " + class414.field5849 + " NPC: " + class479.field6682 + " Pl: " + class61.field763, -256, 99, -1);
                                            var27 += 12;
                                            class143.method887((byte) 113);
                                        }
                                        class306.field4450[var12] = true;
                                        break label577;
                                    }
                                }
                                if (var11.field2022 == 0) {
                                    if (class454.field6360 == var11.field2006 && class385.field5414.method327()) {
                                        class385.field5414.method366(var13, var14, var11.field2113, var11.field2033);
                                    }
                                    method58(var12, arg1, var13 - var11.field2141, var11.field2134, -31200, var14 - var11.field2111, var24, var22, var25, var23);
                                    if (var11.field2110 != null) {
                                        method58(var12, var11.field2110, var13 - var11.field2141, var11.field2134, -31200, var14 - var11.field2111, var24, var22, var25, var23);
                                    }
                                    class489 var40 = (class489) class255.field3763.method2405((long) var11.field2134, -32);
                                    if (var40 != null) {
                                        class343.method2042(arg4 ^ 0x79BB, var25, var14, var40.field6840, var22, var23, var24, var13, var12);
                                    }
                                    if (class454.field6360 == var11.field2006 && class385.field5414.method327()) {
                                        class385.field5414.method374();
                                        class307.field4466 = true;
                                    }
                                    class385.field5414.method301(arg9, arg7, arg8, arg6);
                                }
                                if (class498.field7053[var12] || class361.field5165 > 1) {
                                    if (var11.field2022 == 3) {
                                        if (var15 == 0) {
                                            if (var11.field2074) {
                                                class385.field5414.method325(var13, var14, var11.field2113, var11.field2033, var11.field1992, 0);
                                            } else {
                                                class385.field5414.method288(var13, var14, var11.field2113, var11.field2033, var11.field1992, 0);
                                            }
                                        } else if (var11.field2074) {
                                            class385.field5414.method325(var13, var14, var11.field2113, var11.field2033, var11.field1992 & 0xFFFFFF | 255 - (var15 & 0xFF) << 24, 1);
                                        } else {
                                            class385.field5414.method288(var13, var14, var11.field2113, var11.field2033, 255 - (var15 & 0xFF) << 24 | var11.field1992 & 0xFFFFFF, 1);
                                        }
                                    } else if (var11.field2022 == 4) {
                                        class319 var41 = var11.method931(21118, class385.field5414);
                                        if (var41 != null) {
                                            int var42 = var11.field1992;
                                            String var43 = var11.field2150;
                                            if (var11.field2089 != -1) {
                                                class395 var44 = class344.field5000.method993(var11.field2089, true);
                                                var43 = var44.field5587;
                                                if (var43 == null) {
                                                    var43 = "null";
                                                }
                                                if ((var44.field5554 == 1 || var11.field1995 != 1) && var11.field1995 != -1) {
                                                    var43 = "<col=ff9040>" + var43 + "</col> x" + class344.method2049(var11.field1995, -114);
                                                }
                                            }
                                            if (class411.field5809 == var11) {
                                                var43 = class95.field1240.method3116(class149.field1979, (byte) 103);
                                                var42 = var11.field1992;
                                            }
                                            if (class472.field6575) {
                                                class385.field5414.method346(var13, var14, var11.field2113 + var13, var11.field2033 + var14);
                                            }
                                            var41.method1920(class90.field1122, var11.field2056, var11.field2013, -1, var42 | 255 - (var15 & 0xFF) << 24, var11.field2033, var13, var11.field1999 ? 255 - (var15 & 0xFF) << 24 : -1, null, 0, 0, var11.field2113, var11.field2148, var11.field2132, var43, null, var14);
                                            if (class472.field6575) {
                                                class385.field5414.method301(arg9, arg7, arg8, arg6);
                                            }
                                        } else if (class208.field3020) {
                                            class187.method1190(var11, 113);
                                        }
                                    } else if (var11.field2022 == 5) {
                                        if (var11.field2090 >= 0) {
                                            var11.method938(class361.field5163, false, class39.field423).method2479(0, class385.field5414, var11.field2033, 0, arg4 ^ 0x7986, var14, var11.field2010 << 3, var13, var11.field2113, var11.field2044 << 3);
                                        } else {
                                            class24 var45;
                                            if (var11.field2089 == -1) {
                                                var45 = var11.method939(class385.field5414, (byte) 104);
                                            } else {
                                                class181 var46 = var11.field2067 ? class246.field3587.field288 : null;
                                                var45 = class344.field5000.method992(var11.field1995, var11.field2109, class385.field5414, var11.field2089, var11.field2103 | 0xFF000000, arg4 + 31284, var46, var11.field1996);
                                            }
                                            if (var45 != null) {
                                                int var47 = var45.method145();
                                                int var48 = var45.method157();
                                                int var49 = 255 - (var15 & 0xFF) << 24 | (var11.field1992 == 0 ? 16777215 : var11.field1992 & 0xFFFFFF);
                                                if (var11.field2034) {
                                                    class385.field5414.method346(var13, var14, var11.field2113 + var13, var11.field2033 + var14);
                                                    if (var11.field2099 != 0) {
                                                        int var50 = (var47 + var11.field2113 - 1) / var47;
                                                        int var51 = (var48 + var11.field2033 - 1) / var48;
                                                        for (int var52 = 0; var52 < var50; var52++) {
                                                            for (int var53 = 0; var53 < var51; var53++) {
                                                                if (var11.field1992 == 0) {
                                                                    var45.method142((float) var47 / 2.0F + (float) (var47 * var52 + var13), (float) var48 / 2.0F + (float) (var14 - -(var48 * var53)), 4096, var11.field2099);
                                                                } else {
                                                                    var45.method153((float) var47 / 2.0F + (float) (var13 + (var47 * var52)), (float) var48 / 2.0F + (float) (var48 * var53 + var14), 4096, var11.field2099, 0, var49, 1);
                                                                }
                                                            }
                                                        }
                                                    } else if (var11.field1992 == 0 && var15 == 0) {
                                                        var45.method161(var13, var14, var11.field2113, var11.field2033);
                                                    } else {
                                                        var45.method159(var13, var14, var11.field2113, var11.field2033, 0, var49, 1);
                                                    }
                                                    class385.field5414.method301(arg9, arg7, arg8, arg6);
                                                } else if (var11.field1992 == 0 && var15 == 0) {
                                                    if (var11.field2099 != 0) {
                                                        var45.method142((float) var11.field2113 / 2.0F + (float) var13, (float) var11.field2033 / 2.0F + (float) var14, var11.field2113 * 4096 / var47, var11.field2099);
                                                    } else if (var11.field2113 == var47 && var11.field2033 == var48) {
                                                        var45.method151(var13, var14);
                                                    } else {
                                                        var45.method150(var13, var14, var11.field2113, var11.field2033);
                                                    }
                                                } else if (var11.field2099 != 0) {
                                                    var45.method153((float) var11.field2113 / 2.0F + (float) var13, (float) var11.field2033 / 2.0F + (float) var14, var11.field2113 * 4096 / var47, var11.field2099, 0, var49, 1);
                                                } else if (var11.field2113 == var47 && var11.field2033 == var48) {
                                                    var45.method144(var13, var14, 0, var49, 1);
                                                } else {
                                                    var45.method162(var13, var14, var11.field2113, var11.field2033, 0, var49, 1);
                                                }
                                            } else if (class208.field3020) {
                                                class187.method1190(var11, 124);
                                            }
                                        }
                                    } else if (var11.field2022 == 6) {
                                        class482.method2776((byte) 90);
                                        class377 var54 = null;
                                        int var55 = 0;
                                        if (var11.field2089 != -1) {
                                            class395 var63 = class344.field5000.method993(var11.field2089, true);
                                            if (var63 != null) {
                                                class395 var64 = var63.method2301(var11.field1995, (byte) 127);
                                                class449 var65 = var11.field2112 == -1 ? null : class62.field784.method2566(var11.field2112, -19);
                                                class181 var66 = var11.field2067 ? class246.field3587.field288 : null;
                                                var54 = var64.method2283(var11.field2140, 1, 850, var66, var11.field2009, class385.field5414, var65, var11.field2060, 2048);
                                                if (var54 == null) {
                                                    class187.method1190(var11, arg4 + 31316);
                                                } else {
                                                    var55 = -var54.method1568() >> 1;
                                                }
                                            }
                                        } else if (var11.field2053 == 5) {
                                            int var56 = var11.field2018;
                                            if (var56 >= 0 && var56 < 2048) {
                                                class22 var57 = class378.field5355[var56];
                                                class449 var58 = var11.field2112 == -1 ? null : class62.field784.method2566(var11.field2112, -19);
                                                if (var57 != null && (class343.field4982 == var56 || class169.method1062(var57.field256, arg4 ^ 0x79B2) == var11.field2120)) {
                                                    var54 = var57.field288.method1132(class106.field1400, class385.field5414, class539.field7885, true, class163.field2413, var11.field2009, 0, null, null, var11.field2140, class498.field7049, class62.field784, -1, arg4 ^ -10935, var58, 0, var11.field2060, class344.field5000, 2048);
                                                }
                                            }
                                        } else if (var11.field2053 == 8 || var11.field2053 == 9) {
                                            class167 var60 = class119.method803(false, var11.field2018, 0);
                                            class449 var61 = var11.field2112 == -1 ? null : class62.field784.method2566(var11.field2112, -19);
                                            if (var60 != null) {
                                                class181 var62 = var11.field2067 ? class246.field3587.field288 : null;
                                                var54 = var60.method1053(2048, var62, var11.field2120, var11.field2060, class385.field5414, arg4 ^ 0xFFFF8335, var61, var11.field2009, var11.field2140, var11.field2053 == 9);
                                            }
                                        } else if (var11.field2112 == -1) {
                                            var54 = var11.method934(-1, class163.field2413, class62.field784, class498.field7049, -121, class246.field3587.field288, class344.field5000, 0, null, class385.field5414, class106.field1400, class539.field7885, 2048, -1);
                                            if (var54 == null && class208.field3020) {
                                                class187.method1190(var11, 111);
                                            }
                                        } else {
                                            class449 var59 = class62.field784.method2566(var11.field2112, -19);
                                            var54 = var11.method934(var11.field2009, class163.field2413, class62.field784, class498.field7049, -62, class246.field3587.field288, class344.field5000, var11.field2060, var59, class385.field5414, class106.field1400, class539.field7885, 2048, var11.field2140);
                                            if (var54 == null && class208.field3020) {
                                                class187.method1190(var11, arg4 ^ 0xFFFF8658);
                                            }
                                        }
                                        if (var54 != null) {
                                            int var67;
                                            if (var11.field2027 <= 0) {
                                                var67 = 512;
                                            } else {
                                                var67 = (var11.field2113 << 9) / var11.field2027;
                                            }
                                            int var68;
                                            if (var11.field2054 > 0) {
                                                var68 = (var11.field2033 << 9) / var11.field2054;
                                            } else {
                                                var68 = 512;
                                            }
                                            int var69 = (var11.field2079 * var67 >> 9) + (var13 + (var11.field2113 / 2));
                                            int var70 = (var11.field2047 * var68 >> 9) + var11.field2033 / 2 + var14;
                                            class375.field5329.method826();
                                            class385.field5414.method367(class375.field5329);
                                            class385.field5414.method390(var69, var70, var67, var68);
                                            class385.field5414.method365((float) (var11.field2092 << 0), var11.field2065 ? (float) (var11.field2031 << 0) : (float) (var11.field2031 << 0) * 1.5F);
                                            if (arg3 == -1412584499 || class307.field4466) {
                                                class385.field5414.method295();
                                                class385.field5414.method341();
                                                class385.field5414.method301(arg9, arg7, arg8, arg6);
                                                class307.field4466 = false;
                                            }
                                            if (var11.field2026) {
                                                class385.field5414.method297(false);
                                            }
                                            int var71 = (var11.field2011 << 0) * class95.field1242[var11.field2023 << 3] >> 15;
                                            int var72 = (var11.field2011 << 0) * class95.field1241[var11.field2023 << 3] >> 15;
                                            class260.field3846.method821(-var11.field2108 << 3);
                                            class260.field3846.method823(var11.field2133 << 3);
                                            class260.field3846.method824(var11.field2042 << 0, (var11.field2082 << 0) + var71 + var55, (var11.field2082 << 0) + var72);
                                            class260.field3846.method832(var11.field2023 << 3);
                                            if (class472.field6575) {
                                                class385.field5414.method346(var13, var14, var11.field2113 + var13, var11.field2033 + var14);
                                            }
                                            if (var11.field2065) {
                                                var54.method1598(class260.field3846, null, var11.field2011 << 0, 1);
                                            } else {
                                                var54.method1566(class260.field3846, null, 1);
                                            }
                                            if (class472.field6575) {
                                                class385.field5414.method301(arg9, arg7, arg8, arg6);
                                            }
                                            if (var11.field2026) {
                                                class385.field5414.method297(true);
                                            }
                                            class385.field5414.method365(0.0F, 0.0F);
                                        }
                                    } else if (var11.field2022 == 9) {
                                        int var73;
                                        int var74;
                                        int var75;
                                        int var76;
                                        if (var11.field2127) {
                                            var73 = var11.field2033 + var14;
                                            var76 = var13;
                                            var75 = var11.field2113 + var13;
                                            var74 = var14;
                                        } else {
                                            var73 = var14;
                                            var74 = var11.field2033 + var14;
                                            var75 = var11.field2113 + var13;
                                            var76 = var13;
                                        }
                                        if (var11.field2091 == 1) {
                                            class385.field5414.method340(var76, var73, var75, var74, var11.field1992, 0);
                                        } else {
                                            class385.field5414.method331(var76, var73, var75, var74, var11.field1992, var11.field2091, 0);
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

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BII)V")
    public static final void method59(byte arg0, int arg1, int arg2) {
        field138++;
        int var3 = 75 % ((-arg0 - 56) / 55);
        class45 var4 = class354.method2094(arg2, (byte) -31, 7);
        var4.method260(9188);
        var4.field504 = arg1;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
    public class10() {
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(S)V")
    public class10(short arg0) {
        this.field141 = arg0;
    }
}
