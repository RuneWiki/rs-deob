import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class139 extends class105 {

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "Leb;")
    public static class230 field2477 = class68.method589(0, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "Z")
    public static boolean field2479 = true;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2478 = new CRC32();

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "Leb;")
    public static class230 field2486 = class68.method589(0, ")2");

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "Leb;")
    public static class230 field2485 = class68.method589(0, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    public static int field2487 = 0;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "[Lec;")
    public static class23[] field2484;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "[[[B")
    public static byte[][][] field2482;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
    public static void method1067(int arg0) {
        field2477 = null;
        field2478 = null;
        field2482 = null;
        field2485 = null;
        field2484 = null;
        if (arg0 > -105) {
            field2479 = true;
        }
        field2486 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ltj;III)V")
    public static final void method1068(class260 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field2303 == arg2 && arg2 != -1) {
            class249 var4 = class237.method1667(arg2, 59);
            int var5 = var4.field4428;
            if (var5 == 1) {
                arg0.field2297 = 0;
                arg0.field2247 = 0;
                arg0.field2273 = 0;
                arg0.field2246 = arg1;
                class27.method263(var4, arg0.field2300, true, arg0.field2274, class56.field1033 == arg0, arg0.field2273);
            }
            if (var5 == 2) {
                arg0.field2297 = 0;
            }
        } else if (arg2 == -1 || arg0.field2303 == -1 || class237.method1667(arg2, 16).field4429 >= class237.method1667(arg0.field2303, 1).field4429) {
            arg0.field2247 = 0;
            arg0.field2273 = 0;
            arg0.field2246 = arg1;
            arg0.field2297 = 0;
            arg0.field2299 = arg0.field2287;
            arg0.field2303 = arg2;
            if (arg0.field2303 != -1) {
                class27.method263(class237.method1667(arg0.field2303, -17), arg0.field2300, true, arg0.field2274, class56.field1033 == arg0, arg0.field2273);
            }
        }
        field2481++;
        if (arg3 <= 33) {
            method1070(-98, -34, 127, (class245[]) null, -105, -15, -14, -7, (byte) -15, 11);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)Lwd;")
    public static final class22 method1069(byte arg0) {
        int var1 = -128 / ((5 - arg0) / 58);
        field2483++;
        try {
            return (class22) Class.forName("hk").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III[Lka;IIIIBI)V")
    public static final void method1070(int arg0, int arg1, int arg2, class245[] arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        field2480++;
        class87.method698(arg4, arg6, arg1, arg2);
        if (arg8 > -62) {
            method1069((byte) 9);
        }
        class3.method33();
        for (int var10 = 0; var10 < arg3.length; var10++) {
            class245 var11 = arg3[var10];
            if (var11 != null && (var11.field4245 == arg7 || arg7 == -1412584499 && class229.field3940 == var11)) {
                int var12;
                if (arg5 == -1) {
                    class76.field1375[class72.field1318] = var11.field4252 + arg9;
                    class153.field2731[class72.field1318] = var11.field4223 + arg0;
                    class177.field3115[class72.field1318] = var11.field4325;
                    class172.field3039[class72.field1318] = var11.field4307;
                    var12 = class72.field1318++;
                } else {
                    var12 = arg5;
                }
                var11.field4267 = class259.field4584;
                var11.field4204 = var12;
                if (!var11.field4216 || !client.method1161(var11)) {
                    if (var11.field4226 > 0) {
                        class58.method493(-20694, var11);
                    }
                    int var13 = var11.field4223 + arg0;
                    int var14 = var11.field4252 + arg9;
                    int var15 = var11.field4199;
                    if (class271.field4786 && (client.method1167(var11) != 0 || var11.field4306 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class229.field3940 == var11) {
                        if (arg7 != -1412584499 && !var11.field4249) {
                            class176.field3084 = arg0;
                            class213.field3692 = arg9;
                            class275.field4828 = arg3;
                            continue;
                        }
                        if (!var11.field4249) {
                            var15 = 128;
                        }
                        if (class177.field3104 && class30.field546) {
                            int var16 = class34.field620;
                            int var17 = var16 - class49.field869;
                            if (var17 < class35.field668) {
                                var17 = class35.field668;
                            }
                            if (class35.field668 + class138.field2473.field4325 < var11.field4325 + var17) {
                                var17 = class35.field668 + class138.field2473.field4325 - var11.field4325;
                            }
                            var14 = var17;
                            int var18 = class251.field4497;
                            int var19 = var18 - class28.field511;
                            if (class130.field2334 > var19) {
                                var19 = class130.field2334;
                            }
                            if ((var11.field4307 + var19) > (class130.field2334 + class138.field2473.field4307)) {
                                var19 = class130.field2334 + class138.field2473.field4307 - var11.field4307;
                            }
                            var13 = var19;
                        }
                    }
                    int var20;
                    int var21;
                    int var24;
                    int var25;
                    if (var11.field4306 == 2) {
                        var20 = arg4;
                        var24 = arg1;
                        var21 = arg6;
                        var25 = arg2;
                    } else {
                        var20 = arg4 >= var14 ? arg4 : var14;
                        var21 = var13 <= arg6 ? arg6 : var13;
                        int var22 = var11.field4325 + var14;
                        int var23 = var11.field4307 + var13;
                        if (var11.field4306 == 9) {
                            var22++;
                            var23++;
                        }
                        var24 = var22 < arg1 ? var22 : arg1;
                        var25 = arg2 <= var23 ? arg2 : var23;
                    }
                    if (!var11.field4216 || var24 > var20 && var25 > var21) {
                        if (var11.field4226 != 0) {
                            if (var11.field4226 == 1337) {
                                class203.field3575 = var11;
                                class177.field3116 = var13;
                                class37.field701 = var14;
                                class36.method329(var11.field4325, var14, var11.field4226 == 1403, var11.field4307, -128, var13);
                                class87.method698(arg4, arg6, arg1, arg2);
                                continue;
                            }
                            if (var11.field4226 == 1338) {
                                if (var11.method1717(0)) {
                                    class209.method1455(var12, var11, (byte) -38, var13, var14);
                                    class87.method698(arg4, arg6, arg1, arg2);
                                }
                                continue;
                            }
                            if (var11.field4226 == 1339) {
                                if (var11.method1717(0)) {
                                    class161.method1211(14005, var13, var11, var14, var12);
                                    class87.method698(arg4, arg6, arg1, arg2);
                                }
                                continue;
                            }
                            if (var11.field4226 == 1400) {
                                class252.method1779(var11.field4307, -19, var11.field4325, var14, var13);
                                class71.field1300[var12] = true;
                                class125.field2198[var12] = true;
                                class87.method698(arg4, arg6, arg1, arg2);
                                continue;
                            }
                            if (var11.field4226 == 1401) {
                                class226.method1559(6823, var14, var11.field4307, var13, var11.field4325);
                                class71.field1300[var12] = true;
                                class125.field2198[var12] = true;
                                class87.method698(arg4, arg6, arg1, arg2);
                                continue;
                            }
                            if (var11.field4226 == 1402) {
                                class251.method1775(16823, var13, var14);
                                class71.field1300[var12] = true;
                                class125.field2198[var12] = true;
                                continue;
                            }
                            if (var11.field4226 == 1405) {
                                if (!class22.field432) {
                                    continue;
                                }
                                int var26 = var11.field4325 + var14;
                                int var27 = var13 + 15;
                                class180.field3151.method790(class173.method1267((byte) 59, new class230[] { class67.field1266, class37.method340(class160.field2862, (byte) -26) }), var26, var27, 16776960, -1);
                                int var115 = var27 + 15;
                                int var28 = 16776960;
                                Runtime var29 = Runtime.getRuntime();
                                int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                if (var30 > 65536) {
                                    var28 = 16711680;
                                }
                                int var31 = 0;
                                class180.field3151.method790(class173.method1267((byte) 59, new class230[] { class261.field4633, class37.method340(var30, (byte) -26), class183.field3217 }), var26, var115, var28, -1);
                                var27 = var115 + 15;
                                int var32 = 0;
                                int var33 = 16776960;
                                int var34 = 0;
                                for (int var35 = 0; var35 < 27; var35++) {
                                    var34 += class138.field2474[var35].method477(2777);
                                    var31 += class138.field2474[var35].method481(false);
                                    var32 += class138.field2474[var35].method480((byte) 100);
                                }
                                int var36 = var32 * 100 / var34;
                                int var37 = var31 * 10000 / var34;
                                class230 var38 = class173.method1267((byte) 59, new class230[] { class52.field899, class18.method225(0, true, 2, 0, (long) var37), class49.field868, class37.method340(var36, (byte) -26), class162.field2880 });
                                class104.field1904.method790(var38, var26, var27, var33, -1);
                                var27 += 12;
                                class71.field1300[var12] = true;
                                class125.field2198[var12] = true;
                                continue;
                            }
                        }
                        if (!class243.field4188) {
                            if (var11.field4306 == 0 && var11.field4284 && class246.field4375 >= var20 && class61.field1178 >= var21 && var24 > class246.field4375 && class61.field1178 < var25 && !class271.field4786) {
                                class225.field3890[0] = 1007;
                                class186.field3266 = 1;
                                class149.field2667[0] = class9.field158;
                                class192.field3388[0] = class89.field1580;
                            }
                            if (var20 <= class246.field4375 && class61.field1178 >= var21 && class246.field4375 < var24 && var25 > class61.field1178) {
                                class134.method1043((byte) -46, class246.field4375 - var14, var11, class61.field1178 - var13);
                            }
                        }
                        if (var11.field4306 == 0) {
                            if (!var11.field4216 && client.method1161(var11) && class206.field3629 != var11) {
                                continue;
                            }
                            if (!var11.field4216) {
                                if ((var11.field4339 - var11.field4307) < var11.field4351) {
                                    var11.field4351 = var11.field4339 - var11.field4307;
                                }
                                if (var11.field4351 < 0) {
                                    var11.field4351 = 0;
                                }
                            }
                            method1070(var13 - var11.field4351, var24, var25, arg3, var20, var12, var21, var11.field4362, (byte) -103, var14 - var11.field4332);
                            if (var11.field4318 != null) {
                                method1070(var13 - var11.field4351, var24, var25, var11.field4318, var20, var12, var21, var11.field4362, (byte) -115, var14 - var11.field4332);
                            }
                            class150 var39 = (class150) client.field2708.method394((long) var11.field4362, -21083);
                            if (var39 != null) {
                                if (var39.field2678 == 0 && !class243.field4188 && class246.field4375 >= var20 && var21 <= class61.field1178 && class246.field4375 < var24 && var25 > class61.field1178 && !class271.field4786) {
                                    class186.field3266 = 1;
                                    class149.field2667[0] = class9.field158;
                                    class225.field3890[0] = 1007;
                                    class192.field3388[0] = class89.field1580;
                                }
                                class223.method1547(var20, var24, var13, var14, var39.field2681, var21, var12, -1, var25);
                            }
                            class87.method698(arg4, arg6, arg1, arg2);
                            class3.method33();
                        }
                        if (class29.field531[var12] || class21.field428 > 1) {
                            if (var11.field4306 == 0 && !var11.field4216 && var11.field4339 > var11.field4307) {
                                class155.method1179(true, var11.field4339, var11.field4351, var14 + var11.field4325, var11.field4307, var13);
                            }
                            if (var11.field4306 != 1) {
                                if (var11.field4306 == 2) {
                                    int var40 = 0;
                                    for (int var41 = 0; var41 < var11.field4266; var41++) {
                                        for (int var42 = 0; var42 < var11.field4251; var42++) {
                                            int var43 = var14 + ((var11.field4344 + 32) * var42);
                                            int var44 = var13 + ((var11.field4367 + 32) * var41);
                                            if (var40 < 20) {
                                                var43 += var11.field4255[var40];
                                                var44 += var11.field4292[var40];
                                            }
                                            if (var11.field4331[var40] > 0) {
                                                boolean var45 = false;
                                                boolean var46 = false;
                                                int var47 = var11.field4331[var40] - 1;
                                                if (arg4 < var43 + 32 && arg1 > var43 && var44 + 32 > arg6 && arg2 > var44 || class37.field703 == var11 && class39.field718 == var40) {
                                                    class80 var48;
                                                    if (class196.field3513 == 1 && class225.field3891 == var40 && class35.field659 == var11.field4362) {
                                                        var48 = class120.method945(var11.field4215[var40], 2, var47, 250, 0, var11.field4239);
                                                    } else {
                                                        var48 = class120.method945(var11.field4215[var40], 1, var47, 250, 3153952, var11.field4239);
                                                    }
                                                    if (class3.field22) {
                                                        class71.field1300[var12] = true;
                                                    }
                                                    if (var48 == null) {
                                                        class92.method777((byte) -65, var11);
                                                    } else if (class37.field703 == var11 && class39.field718 == var40) {
                                                        int var49 = class34.field620 - class61.field1176;
                                                        int var50 = class251.field4497 - class25.field475;
                                                        if (var49 < 5 && var49 > -5) {
                                                            var49 = 0;
                                                        }
                                                        if (var50 < 5 && var50 > -5) {
                                                            var50 = 0;
                                                        }
                                                        if (class232.field4026 < 5) {
                                                            var50 = 0;
                                                            var49 = 0;
                                                        }
                                                        var48.method98(var43 + var49, var44 - -var50, 128);
                                                        if (arg7 != -1) {
                                                            class245 var51 = arg3[arg7 & 0xFFFF];
                                                            int var52 = class87.field1522;
                                                            int var53 = class87.field1518;
                                                            if (var53 > (var44 + var50) && var51.field4351 > 0) {
                                                                int var54 = (var53 - var44 - var50) * class219.field3771 / 3;
                                                                if (var54 > (class219.field3771 * 10)) {
                                                                    var54 = class219.field3771 * 10;
                                                                }
                                                                if (var54 > var51.field4351) {
                                                                    var54 = var51.field4351;
                                                                }
                                                                class25.field475 += var54;
                                                                var51.field4351 -= var54;
                                                                class92.method777((byte) -65, var51);
                                                            }
                                                            if ((var50 + var44 + 32) > var52 && var51.field4351 < var51.field4339 - var51.field4307) {
                                                                int var55 = (var44 + var50 + 32 - var52) * class219.field3771 / 3;
                                                                if ((class219.field3771 * 10) < var55) {
                                                                    var55 = class219.field3771 * 10;
                                                                }
                                                                if (var51.field4339 - var51.field4307 - var51.field4351 < var55) {
                                                                    var55 = var51.field4339 - var51.field4307 - var51.field4351;
                                                                }
                                                                var51.field4351 += var55;
                                                                class25.field475 -= var55;
                                                                class92.method777((byte) -65, var51);
                                                            }
                                                        }
                                                    } else if (class190.field3350 == var11 && class36.field681 == var40) {
                                                        var48.method98(var43, var44, 128);
                                                    } else {
                                                        var48.method106(var43, var44);
                                                    }
                                                }
                                            } else if (var11.field4265 != null && var40 < 20) {
                                                class80 var56 = var11.method1706((byte) 125, var40);
                                                if (var56 != null) {
                                                    var56.method106(var43, var44);
                                                } else if (class14.field313) {
                                                    class92.method777((byte) -65, var11);
                                                }
                                            }
                                            var40++;
                                        }
                                    }
                                } else if (var11.field4306 == 3) {
                                    int var57;
                                    if (class145.method1104(var11, (byte) 123)) {
                                        var57 = var11.field4282;
                                        if (class206.field3629 == var11 && var11.field4296 != 0) {
                                            var57 = var11.field4296;
                                        }
                                    } else {
                                        var57 = var11.field4305;
                                        if (class206.field3629 == var11 && var11.field4270 != 0) {
                                            var57 = var11.field4270;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field4235) {
                                            class87.method705(var14, var13, var11.field4325, var11.field4307, var57);
                                        } else {
                                            class87.method713(var14, var13, var11.field4325, var11.field4307, var57);
                                        }
                                    } else if (var11.field4235) {
                                        class87.method701(var14, var13, var11.field4325, var11.field4307, var57, 256 - (var15 & 0xFF));
                                    } else {
                                        class87.method712(var14, var13, var11.field4325, var11.field4307, var57, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field4306 == 4) {
                                    class93 var58 = var11.method1713((byte) 74, class175.field3072);
                                    if (var58 != null) {
                                        class230 var59 = var11.field4203;
                                        int var60;
                                        if (class145.method1104(var11, (byte) 123)) {
                                            var60 = var11.field4282;
                                            if (class206.field3629 == var11 && var11.field4296 != 0) {
                                                var60 = var11.field4296;
                                            }
                                            if (var11.field4286.method1635(-118) > 0) {
                                                var59 = var11.field4286;
                                            }
                                        } else {
                                            var60 = var11.field4305;
                                            if (class206.field3629 == var11 && var11.field4270 != 0) {
                                                var60 = var11.field4270;
                                            }
                                        }
                                        if (var11.field4216 && var11.field4260 != -1) {
                                            class12 var61 = class214.method1484(var11.field4260, -1);
                                            var59 = var61.field191;
                                            if (var59 == null) {
                                                var59 = class171.field3034;
                                            }
                                            if ((var61.field213 == 1 || var11.field4311 != 1) && var11.field4311 != -1) {
                                                var59 = class173.method1267((byte) 59, new class230[] { class88.field1542, var59, class215.field3724, class209.method1454(var11.field4311, 14879) });
                                            }
                                        }
                                        if (class265.field4706 == var11) {
                                            var59 = class169.field2995;
                                            var60 = var11.field4305;
                                        }
                                        if (!var11.field4216) {
                                            var59 = class61.method517(var11, var59, (byte) -79);
                                        }
                                        var58.method798(var59, var14, var13, var11.field4325, var11.field4307, var60, var11.field4210 ? 0 : -1, var11.field4287, var11.field4269, var11.field4253);
                                    } else if (class14.field313) {
                                        class92.method777((byte) -65, var11);
                                    }
                                } else if (var11.field4306 == 5) {
                                    if (var11.field4216) {
                                        class80 var63;
                                        if (var11.field4260 == -1) {
                                            var63 = var11.method1709(5, false);
                                        } else {
                                            var63 = class120.method945(var11.field4311, var11.field4238, var11.field4260, 250, var11.field4229, var11.field4239);
                                        }
                                        if (var63 != null) {
                                            int var64 = var63.field1450;
                                            int var65 = var63.field1451;
                                            if (var11.field4257) {
                                                int var67 = (var64 - (1 - var11.field4325)) / var64;
                                                int var68 = (var65 + var11.field4307 - 1) / var65;
                                                class87.method694(var14, var13, var11.field4325 + var14, var11.field4307 + var13);
                                                for (int var69 = 0; var69 < var67; var69++) {
                                                    for (int var70 = 0; var70 < var68; var70++) {
                                                        if (var11.field4341 != 0) {
                                                            var63.method658(var65 / 2 + var65 * var70 + var13, var64 / 2 + (var14 - -(var64 * var69)), var11.field4341, 4096, (byte) -109);
                                                        } else if (var15 == 0) {
                                                            var63.method106(var14 + (var64 * var69), var65 * var70 + var13);
                                                        } else {
                                                            var63.method98(var14 + (var64 * var69), var65 * var70 + var13, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class87.method698(arg4, arg6, arg1, arg2);
                                            } else {
                                                int var66 = var11.field4325 * 4096 / var64;
                                                if (var11.field4341 != 0) {
                                                    var63.method658(var11.field4307 / 2 + var13, var11.field4325 / 2 + var14, var11.field4341, var66, (byte) -59);
                                                } else if (var15 != 0) {
                                                    var63.method105(var14, var13, var11.field4325, var11.field4307, 256 - (var15 & 0xFF));
                                                } else if (var11.field4325 == var64 && var11.field4307 == var65) {
                                                    var63.method106(var14, var13);
                                                } else {
                                                    var63.method113(var14, var13, var11.field4325, var11.field4307);
                                                }
                                            }
                                        } else if (class14.field313) {
                                            class92.method777((byte) -65, var11);
                                        }
                                    } else {
                                        class80 var62 = var11.method1709(5, class145.method1104(var11, (byte) 123));
                                        if (var62 != null) {
                                            var62.method106(var14, var13);
                                        } else if (class14.field313) {
                                            class92.method777((byte) -65, var11);
                                        }
                                    }
                                } else if (var11.field4306 == 6) {
                                    boolean var71 = class145.method1104(var11, (byte) 123);
                                    int var72;
                                    if (var71) {
                                        var72 = var11.field4355;
                                    } else {
                                        var72 = var11.field4233;
                                    }
                                    int var73 = 0;
                                    class257 var74 = null;
                                    if (var11.field4260 != -1) {
                                        class12 var75 = class214.method1484(var11.field4260, -1);
                                        if (var75 != null) {
                                            class12 var76 = var75.method120(var11.field4311, -82);
                                            class249 var77 = var72 == -1 ? null : class237.method1667(var72, -118);
                                            var74 = var76.method124((byte) 109, 1, var11.field4368, var77);
                                            if (var74 == null) {
                                                class92.method777((byte) -65, var11);
                                            } else {
                                                var73 = -var74.method496() / 2;
                                            }
                                        }
                                    } else if (var11.field4205 == 5) {
                                        if (var11.field4264 == -1) {
                                            var74 = class258.field4556.method137(-1, -1, (class249) null, (byte) -75, (class249) null);
                                        } else {
                                            int var79 = var11.field4264 & 0x7FF;
                                            if (class33.field615 == var79) {
                                                var79 = 2047;
                                            }
                                            class260 var80 = class230.field4011[var79];
                                            class249 var81 = var72 == -1 ? null : class237.method1667(var72, -120);
                                            if (var80 != null && ((int) var80.field4620.method1587(90) << 11) == (var11.field4264 & 0xFFFFF800)) {
                                                var74 = var80.field4626.method137(0, var11.field4368, var81, (byte) -125, (class249) null);
                                            }
                                        }
                                    } else if (var72 == -1) {
                                        var74 = var11.method1712((byte) -76, -1, (class249) null, var71, class56.field1033.field4626);
                                        if (var74 == null && class14.field313) {
                                            class92.method777((byte) -65, var11);
                                        }
                                    } else {
                                        class249 var78 = class237.method1667(var72, 17);
                                        var74 = var11.method1712((byte) -69, var11.field4368, var78, var71, class56.field1033.field4626);
                                        if (var74 == null && class14.field313) {
                                            class92.method777((byte) -65, var11);
                                        }
                                    }
                                    if (var74 != null) {
                                        int var82;
                                        if (var11.field4247 <= 0) {
                                            var82 = 256;
                                        } else {
                                            var82 = (var11.field4325 << 8) / var11.field4247;
                                        }
                                        int var83;
                                        if (var11.field4218 <= 0) {
                                            var83 = 256;
                                        } else {
                                            var83 = (var11.field4307 << 8) / var11.field4218;
                                        }
                                        int var84 = (var11.field4340 * var83 >> 8) + var11.field4307 / 2 + var13;
                                        int var85 = var11.field4325 / 2 + var14 + (var11.field4358 * var82 >> 8);
                                        class3.method24(var85, var84);
                                        int var86 = class3.field24[var11.field4206] * var11.field4290 >> 16;
                                        int var87 = class3.field21[var11.field4206] * var11.field4290 >> 16;
                                        if (!var11.field4216) {
                                            var74.method752(0, var11.field4256, 0, var11.field4206, 0, var87, var86);
                                        } else if (var11.field4268) {
                                            ((class90) var74).method766(0, var11.field4256, var11.field4354, var11.field4206, var11.field4353, var73 + var87 + var11.field4244, var11.field4244 + var86, var11.field4290);
                                        } else {
                                            var74.method752(0, var11.field4256, var11.field4354, var11.field4206, var11.field4353, var73 + var87 + var11.field4244, var11.field4244 + var86);
                                        }
                                        class3.method28();
                                    }
                                } else {
                                    if (var11.field4306 == 7) {
                                        class93 var88 = var11.method1713((byte) 74, class175.field3072);
                                        if (var88 == null) {
                                            if (class14.field313) {
                                                class92.method777((byte) -65, var11);
                                            }
                                            continue;
                                        }
                                        int var89 = 0;
                                        for (int var90 = 0; var90 < var11.field4266; var90++) {
                                            for (int var91 = 0; var91 < var11.field4251; var91++) {
                                                if (var11.field4331[var89] > 0) {
                                                    class12 var92 = class214.method1484(var11.field4331[var89] - 1, -1);
                                                    class230 var93;
                                                    if (var92.field213 != 1 && var11.field4215[var89] == 1) {
                                                        var93 = class173.method1267((byte) 59, new class230[] { class88.field1542, var92.field191, class36.field674 });
                                                    } else {
                                                        var93 = class173.method1267((byte) 59, new class230[] { class88.field1542, var92.field191, class215.field3724, class209.method1454(var11.field4215[var89], 14879) });
                                                    }
                                                    int var94 = (var11.field4367 + 12) * var90 + var13;
                                                    int var95 = (var11.field4344 + 115) * var91 + var14;
                                                    if (var11.field4287 == 0) {
                                                        var88.method800(var93, var95, var94, var11.field4305, var11.field4210 ? 0 : -1);
                                                    } else if (var11.field4287 == 1) {
                                                        var88.method784(var93, var95 + 57, var94, var11.field4305, var11.field4210 ? 0 : -1);
                                                    } else {
                                                        var88.method790(var93, var95 + 115 - 1, var94, var11.field4305, var11.field4210 ? 0 : -1);
                                                    }
                                                }
                                                var89++;
                                            }
                                        }
                                    }
                                    if (var11.field4306 == 8 && class229.field3941 == var11 && class245.field4347 == class244.field4190) {
                                        int var96 = 0;
                                        int var97 = 0;
                                        class93 var98 = class180.field3151;
                                        class230 var99 = var11.field4203;
                                        class230 var100 = class61.method517(var11, var99, (byte) -101);
                                        while (var100.method1635(-53) > 0) {
                                            int var108 = var100.method1624(class212.field3681, true);
                                            class230 var109;
                                            if (var108 == -1) {
                                                var109 = var100;
                                                var100 = class89.field1580;
                                            } else {
                                                var109 = var100.method1597(0, 0, var108);
                                                var100 = var100.method1619(-126, var108 + 4);
                                            }
                                            int var110 = var98.method783(var109);
                                            if (var96 < var110) {
                                                var96 = var110;
                                            }
                                            var97 += var98.field1667 + 1;
                                        }
                                        var96 += 6;
                                        int var101 = var11.field4325 + var14 - var96 - 5;
                                        var97 += 7;
                                        if (var14 + 5 > var101) {
                                            var101 = var14 + 5;
                                        }
                                        int var102 = var11.field4307 + var13 + 5;
                                        if (var96 + var101 > arg1) {
                                            var101 = arg1 - var96;
                                        }
                                        if (arg2 < var102 + var97) {
                                            var102 = arg2 - var97;
                                        }
                                        class87.method705(var101, var102, var96, var97, 16777120);
                                        class87.method713(var101, var102, var96, var97, 0);
                                        class230 var103 = var11.field4203;
                                        int var104 = var102 + var98.field1667 + 2;
                                        class230 var105 = class61.method517(var11, var103, (byte) 112);
                                        while (var105.method1635(-48) > 0) {
                                            int var106 = var105.method1624(class212.field3681, true);
                                            class230 var107;
                                            if (var106 == -1) {
                                                var107 = var105;
                                                var105 = class89.field1580;
                                            } else {
                                                var107 = var105.method1597(0, 0, var106);
                                                var105 = var105.method1619(-115, var106 + 4);
                                            }
                                            var98.method800(var107, var101 + 3, var104, 0, -1);
                                            var104 += var98.field1667 + 1;
                                        }
                                    }
                                    if (var11.field4306 == 9) {
                                        int var111;
                                        int var112;
                                        int var113;
                                        int var114;
                                        if (var11.field4213) {
                                            var114 = var13 + var11.field4307;
                                            var113 = var14;
                                            var112 = var11.field4325 + var14;
                                            var111 = var13;
                                        } else {
                                            var111 = var11.field4307 + var13;
                                            var112 = var11.field4325 + var14;
                                            var113 = var14;
                                            var114 = var13;
                                        }
                                        if (var11.field4201 == 1) {
                                            class87.method715(var113, var114, var112, var111, var11.field4305);
                                        } else {
                                            class87.method699(var113, var114, var112, var111, var11.field4305, var11.field4201);
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
