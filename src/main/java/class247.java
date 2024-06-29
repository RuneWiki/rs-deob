import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class247 extends class134 {

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "[B")
    public byte[] field3921;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
    public static int field3929 = 0;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "Lag;")
    public static class192 field3923 = new class192(64);

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "[Z")
    public static boolean[] field3933 = new boolean[100];

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "F")
    public static float field3932;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "[[Z")
    public static boolean[][] field3926;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "[[[B")
    public static byte[][][] field3927;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lub;Lub;I)V")
    public static final void method1670(class92 arg0, class92 arg1, int arg2) {
        field3924++;
        class260.field4121 = arg1;
        if (arg2 < 120) {
            return;
        }
        int var3 = (int) (Math.random() * 21.0D) - 10;
        class264.field4182 = arg0;
        class264.field4182.method700((byte) -112, 34);
        int var4 = (int) (Math.random() * 21.0D) - 10;
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 41.0D) - 20;
        class284.field4474 = var3 + var6;
        class134.field2015 = var5 + var6;
        class155.field2317 = var4 + var6;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V")
    public static final void method1671(int arg0, String arg1, int arg2, String arg3) {
        class296.method1972(arg1, arg2, (String) null, -128, arg0, arg3);
        field3928++;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(III[Lcc;IIIIII)V")
    public static final void method1672(int arg0, int arg1, int arg2, class222[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class66.method524(arg7, arg1, arg5, arg9);
        class224.method1543();
        field3922++;
        for (int var10 = 0; var10 < arg3.length; var10++) {
            class222 var12 = arg3[var10];
            if (var12 != null && (var12.field3392 == arg8 || arg8 == -1412584499 && class113.field1747 == var12)) {
                int var13;
                if (arg4 == -1) {
                    class86.field1281[class126.field1895] = var12.field3515 + arg2;
                    class108.field1680[class126.field1895] = var12.field3401 + arg6;
                    class185.field2917[class126.field1895] = var12.field3408;
                    class281.field4437[class126.field1895] = var12.field3561;
                    var13 = class126.field1895++;
                } else {
                    var13 = arg4;
                }
                var12.field3492 = var13;
                var12.field3467 = class41.field686;
                if (!var12.field3441 || !client.method1146(var12)) {
                    if (var12.field3388 > 0) {
                        class272.method1863(-121, var12);
                    }
                    int var14 = var12.field3525;
                    int var15 = var12.field3515 + arg2;
                    int var16 = var12.field3401 + arg6;
                    if (class136.field2057 && (client.method1159(var12).field477 != 0 || var12.field3552 == 0) && var14 > 127) {
                        var14 = 127;
                    }
                    if (class113.field1747 == var12) {
                        if (arg8 != -1412584499 && !var12.field3497) {
                            class234.field3700 = arg3;
                            class167.field2523 = arg6;
                            class44.field732 = arg2;
                            continue;
                        }
                        if (!var12.field3497) {
                            var14 = 128;
                        }
                        if (class168.field2530 && class91.field1425) {
                            int var17 = class157.field2340;
                            int var18 = class171.field2587;
                            int var19 = var18 - class171.field2586;
                            if (var19 < class82.field1238) {
                                var19 = class82.field1238;
                            }
                            if ((var19 + var12.field3408) > (class82.field1238 + class244.field3894.field3408)) {
                                var19 = class82.field1238 + class244.field3894.field3408 - var12.field3408;
                            }
                            var15 = var19;
                            int var20 = var17 - class237.field3748;
                            if (var20 < class8.field129) {
                                var20 = class8.field129;
                            }
                            if ((var20 + var12.field3561) > (class8.field129 + class244.field3894.field3561)) {
                                var20 = class8.field129 + class244.field3894.field3561 - var12.field3561;
                            }
                            var16 = var20;
                        }
                    }
                    int var21;
                    int var22;
                    int var23;
                    int var24;
                    if (var12.field3552 == 2) {
                        var21 = arg1;
                        var22 = arg9;
                        var23 = arg5;
                        var24 = arg7;
                    } else {
                        var24 = var15 > arg7 ? var15 : arg7;
                        var21 = arg1 < var16 ? var16 : arg1;
                        int var25 = var15 + var12.field3408;
                        int var26 = var12.field3561 + var16;
                        if (var12.field3552 == 9) {
                            var26++;
                            var25++;
                        }
                        var23 = var25 >= arg5 ? arg5 : var25;
                        var22 = arg9 <= var26 ? arg9 : var26;
                    }
                    if (!var12.field3441 || var23 > var24 && var21 < var22) {
                        if (var12.field3388 != 0) {
                            if (var12.field3388 == 1337 || var12.field3388 == 1403) {
                                class15.field180 = var15;
                                class85.field1270 = var16;
                                class308.field4938 = var12;
                                class134.method999(var16, var15, var12.field3408, var12.field3561, 256, var12.field3388 == 1403);
                                field3933[var13] = true;
                                class66.method524(arg7, arg1, arg5, arg9);
                                continue;
                            }
                            if (var12.field3388 == 1338) {
                                if (!var12.method1518(-30)) {
                                    continue;
                                }
                                class197.method1403(var13, var16, var12, var15, (byte) -124);
                                class66.method524(arg7, arg1, arg5, arg9);
                                if (class52.field824 != 0 && class52.field824 != 3 || class207.field3185 || class121.field1831 < var24 || var21 > class9.field156 || class121.field1831 >= var23 || class9.field156 >= var22) {
                                    continue;
                                }
                                int var27 = class121.field1831 - var15;
                                int var28 = class9.field156 - var16;
                                int var29 = var12.field3452[var28];
                                if (var27 < var29 || var27 > var12.field3523[var28] + var29) {
                                    continue;
                                }
                                int var30 = var28 - var12.field3561 / 2;
                                int var31 = (int) class50.field818 + class67.field1057 & 0x7FF;
                                int var32 = class224.field3597[var31];
                                int var33 = var27 - var12.field3408 / 2;
                                int var34 = (class285.field4487 + 256) * var32 >> 8;
                                int var35 = class224.field3601[var31];
                                int var36 = (class285.field4487 + 256) * var35 >> 8;
                                int var37 = var30 * var34 - (var33 * var36) >> 11;
                                int var38 = var30 * var36 + var33 * var34 >> 11;
                                int var39 = class263.field4168.field4725 + var38 - ((class263.field4168.method1013(0) + -1) * 64) >> 7;
                                int var40 = class263.field4168.field4709 + 64 - var37 - (class263.field4168.method1013(0) * 64) >> 7;
                                if (class162.field2438 && (class28.field486 & 0x40) != 0) {
                                    class222 var41 = class77.method605(class305.field4894, class84.field1258, (byte) -32);
                                    if (var41 == null) {
                                        class184.method1316((byte) 126);
                                    } else {
                                        class41.method365((short) 25, class203.field3131, (byte) -89, 1L, " ->", class201.field3104, var40, var39);
                                    }
                                    continue;
                                }
                                if (class152.field2248 == 1) {
                                    class41.method365((short) 12, -1, (byte) -89, 1L, "", class161.field2420, var40, var39);
                                }
                                class41.method365((short) 5, -1, (byte) -89, 1L, "", class54.field852, var40, var39);
                                continue;
                            }
                            if (var12.field3388 == 1339) {
                                if (var12.method1518(-53)) {
                                    class226.method1558(var13, var15, -115, var16, var12);
                                    class66.method524(arg7, arg1, arg5, arg9);
                                }
                                continue;
                            }
                            if (var12.field3388 == 1400) {
                                class48.method403(var15, (byte) 34, var12.field3408, var12.field3561, var16);
                                field3933[var13] = true;
                                class112.field1729[var13] = true;
                                class66.method524(arg7, arg1, arg5, arg9);
                                continue;
                            }
                            if (var12.field3388 == 1401) {
                                class216.method1493(var12.field3408, var15, -101, var12.field3561, var16);
                                field3933[var13] = true;
                                class112.field1729[var13] = true;
                                class66.method524(arg7, arg1, arg5, arg9);
                                continue;
                            }
                            if (var12.field3388 == 1402) {
                                class303.method2030(var15, 65280, var16);
                                field3933[var13] = true;
                                class112.field1729[var13] = true;
                                continue;
                            }
                            if (var12.field3388 == 1405) {
                                if (!class86.field1276) {
                                    continue;
                                }
                                int var42 = var16 + 15;
                                int var43 = var12.field3408 + var15;
                                class276.field4391.method1794("Fps:" + class202.field3124, var43, var42, 16776960, -1);
                                Runtime var44 = Runtime.getRuntime();
                                int var45 = (int) ((var44.totalMemory() - var44.freeMemory()) / 1024L);
                                int var46 = 16776960;
                                int var132 = var42 + 15;
                                int var47 = 0;
                                if (var45 > 65536) {
                                    var46 = 16711680;
                                }
                                class276.field4391.method1794("Mem:" + var45 + "k", var43, var132, var46, -1);
                                int var48 = 16776960;
                                var42 = var132 + 15;
                                int var49 = 0;
                                int var50 = 0;
                                for (int var51 = 0; var51 < 29; var51++) {
                                    var47 += class94.field1478[var51].method1757(108);
                                    var49 += class94.field1478[var51].method1754(-26902);
                                    var50 += class94.field1478[var51].method1753((byte) -122);
                                }
                                int var52 = var50 * 100 / var47;
                                int var53 = var49 * 10000 / var47;
                                String var54 = "Cache:" + class206.method1440(0, 2, (long) var53, 0, true) + "% (" + var52 + "%)";
                                class117.field1786.method1794(var54, var43, var42, var48, -1);
                                var42 += 12;
                                if (class249.field3972 > 0) {
                                    class117.field1786.method1794("Particles: " + class249.field3960 + " / " + class249.field3972, var43, var42, var48, -1);
                                }
                                var42 += 12;
                                field3933[var13] = true;
                                class112.field1729[var13] = true;
                                continue;
                            }
                            if (var12.field3388 == 1406) {
                                class107.field1672 = var12;
                                class170.field2573 = var15;
                                class123.field1858 = var16;
                                continue;
                            }
                        }
                        if (!class207.field3185) {
                            if (var12.field3552 == 0 && var12.field3469 && var24 <= class121.field1831 && var21 <= class9.field156 && var23 > class121.field1831 && class9.field156 < var22 && !class136.field2057) {
                                class68.field1082[0] = class291.field4522;
                                class14.field174 = 1;
                                class148.field2196[0] = "";
                                class166.field2518[0] = class114.field1755;
                                class86.field1282[0] = 1005;
                            }
                            if (var24 <= class121.field1831 && var21 <= class9.field156 && class121.field1831 < var23 && var22 > class9.field156) {
                                class270.method1826(31737, class121.field1831 - var15, class9.field156 - var16, var12);
                            }
                        }
                        if (var12.field3552 == 0) {
                            if (!var12.field3441 && client.method1146(var12) && class43.field729 != var12) {
                                continue;
                            }
                            if (!var12.field3441) {
                                if ((var12.field3460 - var12.field3561) < var12.field3569) {
                                    var12.field3569 = var12.field3460 - var12.field3561;
                                }
                                if (var12.field3569 < 0) {
                                    var12.field3569 = 0;
                                }
                            }
                            method1672(-25, var21, var15 - var12.field3563, arg3, var13, var23, var16 - var12.field3569, var24, var12.field3554, var22);
                            if (var12.field3526 != null) {
                                method1672(94, var21, var15 - var12.field3563, var12.field3526, var13, var23, var16 - var12.field3569, var24, var12.field3554, var22);
                            }
                            class288 var55 = (class288) class48.field787.method2043((long) var12.field3554, -1);
                            if (var55 != null) {
                                if (var55.field4506 == 0 && !class207.field3185 && var24 <= class121.field1831 && class9.field156 >= var21 && var23 > class121.field1831 && class9.field156 < var22 && !class136.field2057) {
                                    class86.field1282[0] = 1005;
                                    class166.field2518[0] = class114.field1755;
                                    class68.field1082[0] = class291.field4522;
                                    class148.field2196[0] = "";
                                    class14.field174 = 1;
                                }
                                class268.method1815(var16, var24, var55.field4505, var21, (byte) -46, var13, var15, var22, var23);
                            }
                            class66.method524(arg7, arg1, arg5, arg9);
                            class224.method1543();
                        }
                        if (class186.field2926[var13] || class5.field79 > 1) {
                            if (var12.field3552 == 0 && !var12.field3441 && var12.field3561 < var12.field3460) {
                                class193.method1371(var12.field3460, var12.field3569, var16, true, var15 + var12.field3408, var12.field3561);
                            }
                            if (var12.field3552 != 1) {
                                if (var12.field3552 == 2) {
                                    int var56 = 0;
                                    for (int var57 = 0; var57 < var12.field3479; var57++) {
                                        for (int var58 = 0; var58 < var12.field3487; var58++) {
                                            int var59 = (var12.field3547 + 32) * var58 + var15;
                                            int var60 = (var12.field3410 + 32) * var57 + var16;
                                            if (var56 < 20) {
                                                var59 += var12.field3431[var56];
                                                var60 += var12.field3555[var56];
                                            }
                                            if (var12.field3407[var56] > 0) {
                                                boolean var61 = false;
                                                int var62 = var12.field3407[var56] - 1;
                                                boolean var63 = false;
                                                if ((var59 + 32) > arg7 && var59 < arg5 && arg1 < (var60 + 32) && var60 < arg9 || class106.field1666 == var12 && class183.field2881 == var56) {
                                                    class213 var64;
                                                    if (class173.field2658 == 1 && class116.field1779 == var56 && class268.field4249 == var12.field3554) {
                                                        var64 = class135.method1001(false, var12.field3567[var56], var62, var12.field3529, (class186) null, 0, 2);
                                                    } else {
                                                        var64 = class135.method1001(false, var12.field3567[var56], var62, var12.field3529, (class186) null, 3153952, 1);
                                                    }
                                                    if (class224.field3603) {
                                                        field3933[var13] = true;
                                                    }
                                                    if (var64 == null) {
                                                        class80.method628((byte) -74, var12);
                                                    } else if (class106.field1666 == var12 && class183.field2881 == var56) {
                                                        int var65 = class157.field2340 - class163.field2451;
                                                        if (var65 < 5 && var65 > -5) {
                                                            var65 = 0;
                                                        }
                                                        int var66 = class171.field2587 - class127.field1909;
                                                        if (var66 < 5 && var66 > -5) {
                                                            var66 = 0;
                                                        }
                                                        if (class297.field4781 < 5) {
                                                            var65 = 0;
                                                            var66 = 0;
                                                        }
                                                        var64.method426(var59 + var66, var60 + var65, 128);
                                                        if (arg8 != -1) {
                                                            class222 var67 = arg3[arg8 & 0xFFFF];
                                                            int var68 = class66.field1033;
                                                            int var69 = class66.field1029;
                                                            if (var68 > var60 + var65 && var67.field3569 > 0) {
                                                                int var70 = (var68 - var60 - var65) * class209.field3230 / 3;
                                                                if (class209.field3230 * 10 < var70) {
                                                                    var70 = class209.field3230 * 10;
                                                                }
                                                                if (var67.field3569 < var70) {
                                                                    var70 = var67.field3569;
                                                                }
                                                                class163.field2451 += var70;
                                                                var67.field3569 -= var70;
                                                                class80.method628((byte) -120, var67);
                                                            }
                                                            if ((var60 + var65 + 32) > var69 && (var67.field3460 - var67.field3561) > var67.field3569) {
                                                                int var71 = (var60 + var65 + 32 - var69) * class209.field3230 / 3;
                                                                if (var71 > (class209.field3230 * 10)) {
                                                                    var71 = class209.field3230 * 10;
                                                                }
                                                                if (var71 > var67.field3460 - var67.field3569 - var67.field3561) {
                                                                    var71 = var67.field3460 - var67.field3561 - var67.field3569;
                                                                }
                                                                class163.field2451 -= var71;
                                                                var67.field3569 += var71;
                                                                class80.method628((byte) -71, var67);
                                                            }
                                                        }
                                                    } else if (class149.field2217 == var12 && class9.field163 == var56) {
                                                        var64.method426(var59, var60, 128);
                                                    } else {
                                                        var64.method425(var59, var60);
                                                    }
                                                }
                                            } else if (var12.field3433 != null && var56 < 20) {
                                                class213 var72 = var12.method1513(65, var56);
                                                if (var72 != null) {
                                                    var72.method425(var59, var60);
                                                } else if (class222.field3570) {
                                                    class80.method628((byte) -114, var12);
                                                }
                                            }
                                            var56++;
                                        }
                                    }
                                } else if (var12.field3552 == 3) {
                                    int var73;
                                    if (class106.method805(var12, 20574)) {
                                        var73 = var12.field3402;
                                        if (class43.field729 == var12 && var12.field3476 != 0) {
                                            var73 = var12.field3476;
                                        }
                                    } else {
                                        var73 = var12.field3522;
                                        if (class43.field729 == var12 && var12.field3540 != 0) {
                                            var73 = var12.field3540;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var12.field3499) {
                                            class66.method532(var15, var16, var12.field3408, var12.field3561, var73);
                                        } else {
                                            class66.method533(var15, var16, var12.field3408, var12.field3561, var73);
                                        }
                                    } else if (var12.field3499) {
                                        class66.method520(var15, var16, var12.field3408, var12.field3561, var73, 256 - (var14 & 0xFF));
                                    } else {
                                        class66.method514(var15, var16, var12.field3408, var12.field3561, var73, 256 - (var14 & 0xFF));
                                    }
                                } else if (var12.field3552 == 4) {
                                    class267 var74 = var12.method1516(class54.field863, 2434);
                                    if (var74 != null) {
                                        String var75 = var12.field3544;
                                        int var76;
                                        if (class106.method805(var12, 20574)) {
                                            var76 = var12.field3402;
                                            if (class43.field729 == var12 && var12.field3476 != 0) {
                                                var76 = var12.field3476;
                                            }
                                            if (var12.field3430.length() > 0) {
                                                var75 = var12.field3430;
                                            }
                                        } else {
                                            var76 = var12.field3522;
                                            if (class43.field729 == var12 && var12.field3540 != 0) {
                                                var76 = var12.field3540;
                                            }
                                        }
                                        if (var12.field3441 && var12.field3391 != -1) {
                                            class179 var77 = class123.method929(22497, var12.field3391);
                                            var75 = var77.field2778;
                                            if (var75 == null) {
                                                var75 = "null";
                                            }
                                            if ((var77.field2795 == 1 || var12.field3551 != 1) && var12.field3551 != -1) {
                                                var75 = "<col=ff9040>" + var75 + "</col> x" + class237.method1625(0, var12.field3551);
                                            }
                                        }
                                        if (class260.field4115 == var12) {
                                            var75 = class23.field398;
                                            var76 = var12.field3522;
                                        }
                                        if (!var12.field3441) {
                                            var75 = class254.method1717(var12, (byte) -82, var75);
                                        }
                                        var74.method1789(var75, var15, var16, var12.field3408, var12.field3561, var76, var12.field3520 ? 0 : -1, var12.field3562, var12.field3473, var12.field3468);
                                    } else if (class222.field3570) {
                                        class80.method628((byte) -87, var12);
                                    }
                                } else if (var12.field3552 == 5) {
                                    if (!var12.field3441) {
                                        class213 var87 = var12.method1519(class106.method805(var12, 20574), -1);
                                        if (var87 != null) {
                                            var87.method425(var15, var16);
                                        } else if (class222.field3570) {
                                            class80.method628((byte) -80, var12);
                                        }
                                    } else if (var12.field3527 >= 0) {
                                        class146 var78 = var12.method1529((byte) 126);
                                        var78.method1056(0, var15, var16, var12.field3408, var12.field3561, var12.field3465, var12.field3534, 0);
                                    } else {
                                        class213 var79;
                                        if (var12.field3391 == -1) {
                                            var79 = var12.method1519(false, -1);
                                        } else if (var12.field3463 && class263.field4168.field2044 != null) {
                                            var79 = class135.method1001(false, var12.field3551, var12.field3391, var12.field3529, class263.field4168.field2044, var12.field3423, var12.field3559);
                                        } else {
                                            var79 = class135.method1001(false, var12.field3551, var12.field3391, var12.field3529, (class186) null, var12.field3423, var12.field3559);
                                        }
                                        if (var79 != null) {
                                            int var80 = var79.field3272;
                                            int var81 = var79.field3267;
                                            if (var12.field3409) {
                                                int var83 = (-(-var80 - var12.field3408) - 1) / var80;
                                                int var84 = (var12.field3561 + var81 - 1) / var81;
                                                class66.method523(var15, var16, var12.field3408 + var15, var12.field3561 + var16);
                                                for (int var85 = 0; var85 < var83; var85++) {
                                                    for (int var86 = 0; var86 < var84; var86++) {
                                                        if (var12.field3493 != 0) {
                                                            var79.method1473(var12.field3493, var81 / 2 + var16 + (var81 * var86), 15, 4096, var80 / 2 + var80 * var85 + var15);
                                                        } else if (var14 == 0) {
                                                            var79.method425(var80 * var85 + var15, var81 * var86 + var16);
                                                        } else {
                                                            var79.method426(var15 + (var80 * var85), var81 * var86 + var16, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class66.method524(arg7, arg1, arg5, arg9);
                                            } else {
                                                int var82 = var12.field3408 * 4096 / var80;
                                                if (var12.field3493 != 0) {
                                                    var79.method1473(var12.field3493, var12.field3561 / 2 + var16, 15, var82, var12.field3408 / 2 + var15);
                                                } else if (var14 != 0) {
                                                    var79.method419(var15, var16, var12.field3408, var12.field3561, 256 - (var14 & 0xFF));
                                                } else if (var12.field3408 == var80 && var12.field3561 == var81) {
                                                    var79.method425(var15, var16);
                                                } else {
                                                    var79.method431(var15, var16, var12.field3408, var12.field3561);
                                                }
                                            }
                                        } else if (class222.field3570) {
                                            class80.method628((byte) -86, var12);
                                        }
                                    }
                                } else if (var12.field3552 == 6) {
                                    boolean var88 = class106.method805(var12, 20574);
                                    int var89;
                                    if (var88) {
                                        var89 = var12.field3397;
                                    } else {
                                        var89 = var12.field3462;
                                    }
                                    class11 var90 = null;
                                    int var91 = 0;
                                    if (var12.field3391 != -1) {
                                        class179 var92 = class123.method929(22497, var12.field3391);
                                        if (var92 != null) {
                                            class179 var93 = var92.method1276(false, var12.field3551);
                                            class103 var94 = var89 == -1 ? null : class250.method1700(var89, -39);
                                            if (var12.field3463 && class263.field4168.field2044 != null) {
                                                var90 = var93.method1279(var12.field3498, var12.field3470, 1, var12.field3442, 5036, var94, class263.field4168.field2044);
                                            } else {
                                                var90 = var93.method1279(var12.field3498, var12.field3470, 1, var12.field3442, 5036, var94, (class186) null);
                                            }
                                            if (var90 == null) {
                                                class80.method628((byte) -80, var12);
                                            } else {
                                                var91 = -var90.method82() / 2;
                                            }
                                        }
                                    } else if (var12.field3432 == 5) {
                                        if (var12.field3524 == -1) {
                                            var90 = class176.field2718.method1329((class103) null, -1, -1, (class103) null, 0, (class234[]) null, -1, -1, 5, true, 0);
                                        } else {
                                            int var95 = var12.field3524 & 0x7FF;
                                            if (class107.field1677 == var95) {
                                                var95 = 2047;
                                            }
                                            class136 var96 = class233.field3682[var95];
                                            class103 var97 = var89 == -1 ? null : class250.method1700(var89, -77);
                                            if (var96 != null && (int) class170.method1223(true, var96.field2064) << 11 == (var12.field3524 & 0xFFFFF800)) {
                                                var90 = var96.field2044.method1329((class103) null, -1, 0, var97, 0, (class234[]) null, -1, var12.field3442, 5, true, 0);
                                            }
                                        }
                                    } else if (var89 == -1) {
                                        var90 = var12.method1515(-1, 82, -1, class263.field4168.field2044, 0, (class103) null, var88);
                                        if (var90 == null && class222.field3570) {
                                            class80.method628((byte) -96, var12);
                                        }
                                    } else {
                                        class103 var98 = class250.method1700(var89, -97);
                                        var90 = var12.method1515(var12.field3470, 124, var12.field3442, class263.field4168.field2044, var12.field3498, var98, var88);
                                        if (var90 == null && class222.field3570) {
                                            class80.method628((byte) -120, var12);
                                        }
                                    }
                                    if (var90 != null) {
                                        int var99;
                                        if (var12.field3458 <= 0) {
                                            var99 = 256;
                                        } else {
                                            var99 = (var12.field3408 << 8) / var12.field3458;
                                        }
                                        int var100;
                                        if (var12.field3449 > 0) {
                                            var100 = (var12.field3561 << 8) / var12.field3449;
                                        } else {
                                            var100 = 256;
                                        }
                                        int var101 = (var12.field3532 * var99 >> 8) + var15 + (var12.field3408 / 2);
                                        int var102 = var12.field3561 / 2 + var16 + (var12.field3457 * var100 >> 8);
                                        class224.method1554(var101, var102);
                                        int var103 = class224.field3601[var12.field3406] * var12.field3450 >> 16;
                                        int var104 = class224.field3597[var12.field3406] * var12.field3450 >> 16;
                                        if (!var12.field3441) {
                                            var90.method94(0, var12.field3448, 0, var12.field3406, 0, var103, var104, -1L);
                                        } else if (var12.field3399) {
                                            ((class87) var90).method665(0, var12.field3448, var12.field3456, var12.field3406, var12.field3414, var12.field3386 + var103 + var91, var12.field3386 + var104, var12.field3450);
                                        } else {
                                            var90.method94(0, var12.field3448, var12.field3456, var12.field3406, var12.field3414, var103 - (-var91 - var12.field3386), var12.field3386 + var104, -1L);
                                        }
                                        class224.method1546();
                                    }
                                } else {
                                    if (var12.field3552 == 7) {
                                        class267 var105 = var12.method1516(class54.field863, 2434);
                                        if (var105 == null) {
                                            if (class222.field3570) {
                                                class80.method628((byte) -103, var12);
                                            }
                                            continue;
                                        }
                                        int var106 = 0;
                                        for (int var107 = 0; var107 < var12.field3479; var107++) {
                                            for (int var108 = 0; var108 < var12.field3487; var108++) {
                                                if (var12.field3407[var106] > 0) {
                                                    class179 var109 = class123.method929(22497, var12.field3407[var106] - 1);
                                                    String var110;
                                                    if (var109.field2795 != 1 && var12.field3567[var106] == 1) {
                                                        var110 = "<col=ff9040>" + var109.field2778 + "</col>";
                                                    } else {
                                                        var110 = "<col=ff9040>" + var109.field2778 + "</col> x" + class237.method1625(0, var12.field3567[var106]);
                                                    }
                                                    int var111 = var16 + ((var12.field3410 + 12) * var107);
                                                    int var112 = var15 + ((var12.field3547 + 115) * var108);
                                                    if (var12.field3562 == 0) {
                                                        var105.method1810(var110, var112, var111, var12.field3522, var12.field3520 ? 0 : -1);
                                                    } else if (var12.field3562 == 1) {
                                                        var105.method1808(var110, var112 + 57, var111, var12.field3522, var12.field3520 ? 0 : -1);
                                                    } else {
                                                        var105.method1794(var110, var112 + 114, var111, var12.field3522, var12.field3520 ? 0 : -1);
                                                    }
                                                }
                                                var106++;
                                            }
                                        }
                                    }
                                    if (var12.field3552 == 8 && class101.field1581 == var12 && class222.field3436 == class199.field3096) {
                                        int var113 = 0;
                                        int var114 = 0;
                                        class267 var115 = class276.field4391;
                                        String var116 = var12.field3544;
                                        String var117 = class254.method1717(var12, (byte) 80, var116);
                                        while (var117.length() > 0) {
                                            int var125 = var117.indexOf("<br>");
                                            String var126;
                                            if (var125 == -1) {
                                                var126 = var117;
                                                var117 = "";
                                            } else {
                                                var126 = var117.substring(0, var125);
                                                var117 = var117.substring(var125 + 4);
                                            }
                                            int var127 = var115.method1788(var126);
                                            if (var127 > var113) {
                                                var113 = var127;
                                            }
                                            var114 += var115.field4230 + 1;
                                        }
                                        var114 += 7;
                                        var113 += 6;
                                        int var118 = var12.field3408 + var15 - var113 - 5;
                                        int var119 = var12.field3561 + var16 + 5;
                                        if ((var119 + var114) > arg9) {
                                            var119 = arg9 - var114;
                                        }
                                        if (var118 < (var15 + 5)) {
                                            var118 = var15 + 5;
                                        }
                                        if (var113 + var118 > arg5) {
                                            var118 = arg5 - var113;
                                        }
                                        class66.method532(var118, var119, var113, var114, 16777120);
                                        class66.method533(var118, var119, var113, var114, 0);
                                        String var120 = var12.field3544;
                                        int var121 = var119 + var115.field4230 + 2;
                                        String var122 = class254.method1717(var12, (byte) -103, var120);
                                        while (var122.length() > 0) {
                                            int var123 = var122.indexOf("<br>");
                                            String var124;
                                            if (var123 == -1) {
                                                var124 = var122;
                                                var122 = "";
                                            } else {
                                                var124 = var122.substring(0, var123);
                                                var122 = var122.substring(var123 + 4);
                                            }
                                            var115.method1810(var124, var118 + 3, var121, 0, -1);
                                            var121 += var115.field4230 + 1;
                                        }
                                    }
                                    if (var12.field3552 == 9) {
                                        int var128;
                                        int var129;
                                        int var130;
                                        int var131;
                                        if (var12.field3488) {
                                            var131 = var15;
                                            var130 = var16;
                                            var129 = var12.field3561 + var16;
                                            var128 = var15 + var12.field3408;
                                        } else {
                                            var128 = var12.field3408 + var15;
                                            var129 = var16;
                                            var130 = var16 + var12.field3561;
                                            var131 = var15;
                                        }
                                        if (var12.field3405 == 1) {
                                            class66.method535(var131, var129, var128, var130, var12.field3522);
                                        } else {
                                            class66.method519(var131, var129, var128, var130, var12.field3522, var12.field3405);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int var11 = -113 / ((arg0 - 51) / 41);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1673(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = -3 / ((arg3 - 75) / 34);
        field3925++;
        if (class184.field2914 <= arg4 && arg4 <= class2.field42 && arg6 >= class184.field2914 && arg6 <= class2.field42 && class184.field2914 <= arg5 && arg5 <= class2.field42 && arg0 >= class184.field2914 && arg0 <= class2.field42 && class112.field1727 <= arg1 && arg1 <= class278.field4410 && class112.field1727 <= arg9 && class278.field4410 >= arg9 && arg7 >= class112.field1727 && arg7 <= class278.field4410 && class112.field1727 <= arg8 && class278.field4410 >= arg8) {
            class129.method956(arg9, arg6, arg0, arg8, arg4, -2105451988, arg2, arg7, arg1, arg5);
        } else {
            class257.method1734(arg8, arg0, arg2, arg1, arg4, -58, arg9, arg6, arg5, arg7);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILub;B)Lel;")
    public static final class213 method1674(int arg0, int arg1, class92 arg2, byte arg3) {
        if (arg3 != -56) {
            method1672(78, -9, -88, (class222[]) null, -97, 118, -36, 113, 68, -110);
        }
        field3930++;
        return class246.method1668(arg1, arg2, arg0, arg3 + 55) ? class30.method252(arg3 + 100) : null;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "([B)V")
    public class247(byte[] arg0) {
        this.field3921 = arg0;
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(B)V")
    public static void method1675(byte arg0) {
        if (arg0 > -69) {
            method1674(114, 46, (class92) null, (byte) -126);
        }
        field3923 = null;
        field3933 = null;
        field3927 = null;
        field3926 = null;
    }
}
