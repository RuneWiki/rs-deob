import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class192 {

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    private int field3023 = -1;

    @OriginalMember(owner = "client!gg", name = "t", descriptor = "I")
    private int field3040 = 0;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "Lrh;")
    private class46 field3031 = new class46();

    @OriginalMember(owner = "client!gg", name = "v", descriptor = "Z")
    public boolean field3042 = false;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    private int field3026;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    private int field3028;

    @OriginalMember(owner = "client!gg", name = "r", descriptor = "[Lh;")
    private class271[] field3038;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "[[[I")
    private int[][][] field3025;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "[C")
    public static char[] field3022 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!gg", name = "u", descriptor = "I")
    public static int field3041 = 0;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!gg", name = "q", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "Ldl;")
    public static class123 field3024;

    @OriginalMember(owner = "client!gg", name = "s", descriptor = "Lkf;")
    public static class180 field3039;

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "Z")
    public static boolean field3036;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)I")
    public static final int method1340(int arg0, int arg1) {
        field3037++;
        if (arg1 != -26779) {
            field3036 = true;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method1341(boolean arg0, int arg1) {
        field3035++;
        if (arg0) {
            return null;
        } else if (this.field3028 == this.field3026) {
            this.field3042 = this.field3038[arg1] == null;
            this.field3038[arg1] = class94.field1459;
            return this.field3025[arg1];
        } else if (this.field3028 == 1) {
            this.field3042 = this.field3023 != arg1;
            this.field3023 = arg1;
            return this.field3025[0];
        } else {
            class271 var3 = this.field3038[arg1];
            if (var3 == null) {
                this.field3042 = true;
                if (this.field3028 > this.field3040) {
                    var3 = new class271(arg1, this.field3040);
                    this.field3040++;
                } else {
                    class271 var4 = (class271) this.field3031.method354((byte) -105);
                    var3 = new class271(arg1, var4.field4310);
                    this.field3038[var4.field4307] = null;
                    var4.method784(false);
                }
                this.field3038[arg1] = var3;
            } else {
                this.field3042 = false;
            }
            this.field3031.method351(var3, 25);
            return this.field3025[var3.field4310];
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIII[Lef;III)V")
    public static final void method1342(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class214[] arg6, int arg7, int arg8, int arg9) {
        field3032++;
        class127.method861(arg7, arg8, arg2, arg0);
        if (arg3 < 107) {
            method1345(-103, false);
        }
        class171.method1209();
        for (int var10 = 0; var10 < arg6.length; var10++) {
            class214 var11 = arg6[var10];
            if (var11 != null && (var11.field3477 == arg5 || arg5 == -1412584499 && class243.field3885 == var11)) {
                int var12;
                if (arg4 == -1) {
                    class149.field2229[class146.field2154] = var11.field3373 + arg9;
                    class272.field4336[class146.field2154] = var11.field3418 + arg1;
                    class283.field4485[class146.field2154] = var11.field3473;
                    class155.field2306[class146.field2154] = var11.field3369;
                    var12 = class146.field2154++;
                } else {
                    var12 = arg4;
                }
                var11.field3389 = var12;
                var11.field3495 = class111.field1684;
                if (!var11.field3360 || !client.method1041(var11)) {
                    if (var11.field3390 > 0) {
                        class139.method933(-28661, var11);
                    }
                    int var13 = var11.field3401;
                    int var14 = var11.field3373 + arg9;
                    int var15 = var11.field3418 + arg1;
                    if (class22.field270 && (client.method1038(var11).field1029 != 0 || var11.field3447 == 0) && var13 > 127) {
                        var13 = 127;
                    }
                    if (class243.field3885 == var11) {
                        if (arg5 != -1412584499 && !var11.field3336) {
                            class37.field497 = arg6;
                            class50.field699 = arg1;
                            class92.field1405 = arg9;
                            continue;
                        }
                        if (class91.field1390 && class154.field2293) {
                            int var16 = class31.field416;
                            int var17 = var16 - class1.field5;
                            if (var17 < class3.field40) {
                                var17 = class3.field40;
                            }
                            if (var17 + var11.field3473 > class3.field40 + class105.field1622.field3473) {
                                var17 = class105.field1622.field3473 + class3.field40 - var11.field3473;
                            }
                            var14 = var17;
                            int var18 = class141.field2074;
                            int var19 = var18 - class1.field12;
                            if (var19 < class17.field196) {
                                var19 = class17.field196;
                            }
                            if ((class17.field196 + class105.field1622.field3369) < (var11.field3369 + var19)) {
                                var19 = class17.field196 + class105.field1622.field3369 - var11.field3369;
                            }
                            var15 = var19;
                        }
                        if (!var11.field3336) {
                            var13 = 128;
                        }
                    }
                    int var21;
                    int var22;
                    int var24;
                    int var25;
                    if (var11.field3447 == 2) {
                        var24 = arg2;
                        var22 = arg7;
                        var21 = arg8;
                        var25 = arg0;
                    } else {
                        int var20 = var11.field3473 + var14;
                        var21 = arg8 >= var15 ? arg8 : var15;
                        var22 = var14 <= arg7 ? arg7 : var14;
                        int var23 = var11.field3369 + var15;
                        if (var11.field3447 == 9) {
                            var23++;
                            var20++;
                        }
                        var24 = var20 >= arg2 ? arg2 : var20;
                        var25 = arg0 > var23 ? var23 : arg0;
                    }
                    if (!var11.field3360 || var24 > var22 && var21 < var25) {
                        if (var11.field3390 != 0) {
                            if (var11.field3390 == 1337) {
                                class262.field4225 = var15;
                                class175.field2732 = var11;
                                class73.field1037 = var14;
                                class134.method911(var11.field3473, var14, var15, 104, var11.field3390 == 1403, var11.field3369);
                                class127.method861(arg7, arg8, arg2, arg0);
                                continue;
                            }
                            if (var11.field3390 == 1338) {
                                if (!var11.method1450(-119)) {
                                    continue;
                                }
                                class135.method913(var14, var15, (byte) -79, var11, var12);
                                class127.method861(arg7, arg8, arg2, arg0);
                                if (class10.field138 != 0 && class10.field138 != 3 || class286.field4542 || var22 > class106.field1634 || var21 > class236.field3780 || class106.field1634 >= var24 || var25 <= class236.field3780) {
                                    continue;
                                }
                                int var26 = class236.field3780 - var15;
                                int var27 = class106.field1634 - var14;
                                int var28 = var11.field3394[var26];
                                if (var28 > var27 || var27 > (var28 + var11.field3496[var26])) {
                                    continue;
                                }
                                int var29 = var26 - var11.field3369 / 2;
                                int var30 = class68.field957 + class29.field392 & 0x7FF;
                                int var31 = var27 - var11.field3473 / 2;
                                int var32 = class171.field2675[var30];
                                int var33 = class171.field2680[var30];
                                int var34 = (class116.field1721 + 256) * var32 >> 8;
                                int var35 = (class116.field1721 + 256) * var33 >> 8;
                                int var36 = var29 * var34 + var31 * var35 >> 11;
                                int var37 = var29 * var35 - (var31 * var34) >> 11;
                                int var38 = class149.field2227.field1226 + var36 >> 7;
                                int var39 = class149.field2227.field1273 - var37 >> 7;
                                if (class45.field572 && (class207.field3238 & 0x40) != 0) {
                                    class214 var40 = class136.method918(class50.field668, -21154, class154.field2296);
                                    if (var40 == null) {
                                        class163.method1123((byte) 82);
                                    } else {
                                        class244.method1647(class30.field399, 0, var39, class23.field291, var38, 1L, (short) 33, " ->");
                                    }
                                    continue;
                                }
                                if (class80.field1151 == 1) {
                                    class244.method1647(class84.field1313, 0, var39, -1, var38, 1L, (short) 19, "");
                                }
                                class244.method1647(class36.field465, 0, var39, -1, var38, 1L, (short) 49, "");
                                continue;
                            }
                            if (var11.field3390 == 1339) {
                                if (var11.method1450(-113)) {
                                    class207.method1411(var15, (byte) -56, var12, var14, var11);
                                    class127.method861(arg7, arg8, arg2, arg0);
                                }
                                continue;
                            }
                            if (var11.field3390 == 1400) {
                                class284.method1899(var11.field3369, var14, var15, var11.field3473, 30);
                                class110.field1675[var12] = true;
                                class80.field1162[var12] = true;
                                class127.method861(arg7, arg8, arg2, arg0);
                                continue;
                            }
                            if (var11.field3390 == 1401) {
                                class142.method949(-73, var11.field3369, var11.field3473, var15, var14);
                                class110.field1675[var12] = true;
                                class80.field1162[var12] = true;
                                class127.method861(arg7, arg8, arg2, arg0);
                                continue;
                            }
                            if (var11.field3390 == 1402) {
                                class40.method314(var14, var15, 18);
                                class110.field1675[var12] = true;
                                class80.field1162[var12] = true;
                                continue;
                            }
                            if (var11.field3390 == 1405) {
                                if (!class248.field3966) {
                                    continue;
                                }
                                int var41 = var11.field3473 + var14;
                                int var42 = var15 + 15;
                                class279.field4433.method1321("Fps:" + class19.field222, var41, var42, 16776960, -1);
                                int var130 = var42 + 15;
                                int var43 = 16776960;
                                Runtime var44 = Runtime.getRuntime();
                                int var45 = (int) ((var44.totalMemory() - var44.freeMemory()) / 1024L);
                                if (var45 > 65536) {
                                    var43 = 16711680;
                                }
                                class279.field4433.method1321("Mem:" + var45 + "k", var41, var130, var43, -1);
                                int var46 = 16776960;
                                var42 = var130 + 15;
                                int var47 = 0;
                                int var48 = 0;
                                int var49 = 0;
                                for (int var50 = 0; var50 < 28; var50++) {
                                    var47 += class175.field2742[var50].method803((byte) 104);
                                    var48 += class175.field2742[var50].method804((byte) -68);
                                    var49 += class175.field2742[var50].method798((byte) 9);
                                }
                                int var51 = var48 * 10000 / var47;
                                int var52 = var49 * 100 / var47;
                                String var53 = "Cache:" + class59.method423(true, 2, (long) var51, (byte) 27, 0) + "% (" + var52 + "%)";
                                class144.field2118.method1321(var53, var41, var42, var46, -1);
                                class110.field1675[var12] = true;
                                class80.field1162[var12] = true;
                                var42 += 12;
                                continue;
                            }
                            if (var11.field3390 == 1406) {
                                class264.field4264 = var11;
                                class31.field421 = var14;
                                class102.field1593 = var15;
                                continue;
                            }
                        }
                        if (!class286.field4542) {
                            if (var11.field3447 == 0 && var11.field3335 && var22 <= class106.field1634 && var21 <= class236.field3780 && class106.field1634 < var24 && class236.field3780 < var25 && !class22.field270) {
                                class2.field21[0] = 1005;
                                class245.field3920 = 1;
                                class96.field1491[0] = class290.field4581;
                                class19.field225[0] = "";
                                client.field2330[0] = class191.field3019;
                            }
                            if (class106.field1634 >= var22 && var21 <= class236.field3780 && class106.field1634 < var24 && class236.field3780 < var25) {
                                class27.method234(var11, class106.field1634 - var14, -var15 + class236.field3780, 20707);
                            }
                        }
                        if (var11.field3447 == 0) {
                            if (!var11.field3360 && client.method1041(var11) && class56.field787 != var11) {
                                continue;
                            }
                            if (!var11.field3360) {
                                if (var11.field3378 - var11.field3369 < var11.field3455) {
                                    var11.field3455 = var11.field3378 - var11.field3369;
                                }
                                if (var11.field3455 < 0) {
                                    var11.field3455 = 0;
                                }
                            }
                            method1342(var25, var15 - var11.field3455, var24, 125, var12, var11.field3474, arg6, var22, var21, var14 - var11.field3448);
                            if (var11.field3357 != null) {
                                method1342(var25, var15 - var11.field3455, var24, 116, var12, var11.field3474, var11.field3357, var22, var21, var14 - var11.field3448);
                            }
                            class35 var54 = (class35) class2.field22.method665((byte) -87, (long) var11.field3474);
                            if (var54 != null) {
                                if (var54.field445 == 0 && !class286.field4542 && var22 <= class106.field1634 && var21 <= class236.field3780 && class106.field1634 < var24 && class236.field3780 < var25 && !class22.field270) {
                                    class245.field3920 = 1;
                                    class2.field21[0] = 1005;
                                    class96.field1491[0] = class290.field4581;
                                    client.field2330[0] = class191.field3019;
                                    class19.field225[0] = "";
                                }
                                class200.method1379(var15, false, var22, var12, var54.field456, var21, var14, var25, var24);
                            }
                            class127.method861(arg7, arg8, arg2, arg0);
                            class171.method1209();
                        }
                        if (class236.field3788[var12] || class4.field56 > 1) {
                            if (var11.field3447 == 0 && !var11.field3360 && var11.field3378 > var11.field3369) {
                                class1.method3(var11.field3369, var11.field3455, var15, var11.field3378, var11.field3473 + var14, 52);
                            }
                            if (var11.field3447 != 1) {
                                if (var11.field3447 == 2) {
                                    int var55 = 0;
                                    for (int var56 = 0; var56 < var11.field3486; var56++) {
                                        for (int var57 = 0; var57 < var11.field3426; var57++) {
                                            int var58 = (var11.field3402 + 32) * var56 + var15;
                                            int var59 = var14 + ((var11.field3354 + 32) * var57);
                                            if (var55 < 20) {
                                                var59 += var11.field3466[var55];
                                                var58 += var11.field3476[var55];
                                            }
                                            if (var11.field3341[var55] > 0) {
                                                boolean var60 = false;
                                                boolean var61 = false;
                                                int var62 = var11.field3341[var55] - 1;
                                                if (arg7 < (var59 + 32) && arg2 > var59 && var58 + 32 > arg8 && arg0 > var58 || class251.field4016 == var11 && class251.field4020 == var55) {
                                                    class229 var63;
                                                    if (class66.field921 == 1 && class63.field872 == var55 && class252.field4028 == var11.field3474) {
                                                        var63 = class22.method154(2, var62, var11.field3441[var55], 0, true, var11.field3464);
                                                    } else {
                                                        var63 = class22.method154(1, var62, var11.field3441[var55], 3153952, true, var11.field3464);
                                                    }
                                                    if (class171.field2690) {
                                                        class110.field1675[var12] = true;
                                                    }
                                                    if (var63 == null) {
                                                        class55.method397(0, var11);
                                                    } else if (class251.field4016 == var11 && class251.field4020 == var55) {
                                                        int var64 = class141.field2074 - class62.field852;
                                                        int var65 = class31.field416 - class153.field2278;
                                                        if (var65 < 5 && var65 > -5) {
                                                            var65 = 0;
                                                        }
                                                        if (var64 < 5 && var64 > -5) {
                                                            var64 = 0;
                                                        }
                                                        if (class73.field1034 < 5) {
                                                            var65 = 0;
                                                            var64 = 0;
                                                        }
                                                        var63.method86(var59 + var65, var58 + var64, 128);
                                                        if (arg5 != -1) {
                                                            class214 var66 = arg6[arg5 & 0xFFFF];
                                                            int var67 = class127.field1877;
                                                            int var68 = class127.field1881;
                                                            if (var67 > var58 + var64 && var66.field3455 > 0) {
                                                                int var69 = (var67 - var58 - var64) * class80.field1166 / 3;
                                                                if (var69 > (class80.field1166 * 10)) {
                                                                    var69 = class80.field1166 * 10;
                                                                }
                                                                if (var69 > var66.field3455) {
                                                                    var69 = var66.field3455;
                                                                }
                                                                class62.field852 += var69;
                                                                var66.field3455 -= var69;
                                                                class55.method397(0, var66);
                                                            }
                                                            if (var68 < (var64 + var58 + 32) && var66.field3455 < (var66.field3378 - var66.field3369)) {
                                                                int var70 = (var58 + var64 + 32 - var68) * class80.field1166 / 3;
                                                                if ((class80.field1166 * 10) < var70) {
                                                                    var70 = class80.field1166 * 10;
                                                                }
                                                                if (var66.field3378 - (var66.field3369 + var66.field3455) < var70) {
                                                                    var70 = var66.field3378 - var66.field3455 - var66.field3369;
                                                                }
                                                                class62.field852 -= var70;
                                                                var66.field3455 += var70;
                                                                class55.method397(0, var66);
                                                            }
                                                        }
                                                    } else if (class262.field4229 == var11 && class75.field1067 == var55) {
                                                        var63.method86(var59, var58, 128);
                                                    } else {
                                                        var63.method71(var59, var58);
                                                    }
                                                }
                                            } else if (var11.field3485 != null && var55 < 20) {
                                                class229 var71 = var11.method1443((byte) 108, var55);
                                                if (var71 != null) {
                                                    var71.method71(var59, var58);
                                                } else if (class101.field1570) {
                                                    class55.method397(0, var11);
                                                }
                                            }
                                            var55++;
                                        }
                                    }
                                } else if (var11.field3447 == 3) {
                                    int var72;
                                    if (class38.method298((byte) -113, var11)) {
                                        var72 = var11.field3451;
                                        if (class56.field787 == var11 && var11.field3350 != 0) {
                                            var72 = var11.field3350;
                                        }
                                    } else {
                                        var72 = var11.field3374;
                                        if (class56.field787 == var11 && var11.field3502 != 0) {
                                            var72 = var11.field3502;
                                        }
                                    }
                                    if (var13 == 0) {
                                        if (var11.field3424) {
                                            class127.method876(var14, var15, var11.field3473, var11.field3369, var72);
                                        } else {
                                            class127.method855(var14, var15, var11.field3473, var11.field3369, var72);
                                        }
                                    } else if (var11.field3424) {
                                        class127.method860(var14, var15, var11.field3473, var11.field3369, var72, 256 - (var13 & 0xFF));
                                    } else {
                                        class127.method859(var14, var15, var11.field3473, var11.field3369, var72, 256 - (var13 & 0xFF));
                                    }
                                } else if (var11.field3447 == 4) {
                                    class188 var73 = var11.method1447(class68.field952, -105);
                                    if (var73 != null) {
                                        String var74 = var11.field3343;
                                        int var75;
                                        if (class38.method298((byte) -113, var11)) {
                                            var75 = var11.field3451;
                                            if (class56.field787 == var11 && var11.field3350 != 0) {
                                                var75 = var11.field3350;
                                            }
                                            if (var11.field3407.length() > 0) {
                                                var74 = var11.field3407;
                                            }
                                        } else {
                                            var75 = var11.field3374;
                                            if (class56.field787 == var11 && var11.field3502 != 0) {
                                                var75 = var11.field3502;
                                            }
                                        }
                                        if (var11.field3360 && var11.field3491 != -1) {
                                            class253 var76 = class162.method1112(var11.field3491, (byte) 107);
                                            var74 = var76.field4035;
                                            if (var74 == null) {
                                                var74 = "null";
                                            }
                                            if ((var76.field4072 == 1 || var11.field3398 != 1) && var11.field3398 != -1) {
                                                var74 = "<col=ff9040>" + var74 + "</col> x" + class242.method1637(0, var11.field3398);
                                            }
                                        }
                                        if (class249.field3995 == var11) {
                                            var75 = var11.field3374;
                                            var74 = class58.field813;
                                        }
                                        if (!var11.field3360) {
                                            var74 = class235.method1597(var74, var11, -122);
                                        }
                                        var73.method1323(var74, var14, var15, var11.field3473, var11.field3369, var75, var11.field3493 ? 0 : -1, var11.field3458, var11.field3332, var11.field3365);
                                    } else if (class101.field1570) {
                                        class55.method397(0, var11);
                                    }
                                } else if (var11.field3447 == 5) {
                                    if (var11.field3360) {
                                        class229 var78;
                                        if (var11.field3491 == -1) {
                                            var78 = var11.method1448(false, 111);
                                        } else {
                                            var78 = class22.method154(var11.field3472, var11.field3491, var11.field3398, var11.field3443, true, var11.field3464);
                                        }
                                        if (var78 != null) {
                                            int var79 = var78.field3714;
                                            int var80 = var78.field3707;
                                            if (var11.field3393) {
                                                int var82 = (var79 + var11.field3473 - 1) / var79;
                                                int var83 = (var80 + var11.field3369 - 1) / var80;
                                                class127.method866(var14, var15, var14 + var11.field3473, var11.field3369 + var15);
                                                for (int var84 = 0; var84 < var82; var84++) {
                                                    for (int var85 = 0; var85 < var83; var85++) {
                                                        if (var11.field3440 != 0) {
                                                            var78.method1565(true, var11.field3440, 4096, var80 / 2 + var80 * var85 + var15, var79 / 2 + (var14 - -(var79 * var84)));
                                                        } else if (var13 == 0) {
                                                            var78.method71(var79 * var84 + var14, var15 - -(var80 * var85));
                                                        } else {
                                                            var78.method86(var79 * var84 + var14, var80 * var85 + var15, 256 - (var13 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class127.method861(arg7, arg8, arg2, arg0);
                                            } else {
                                                int var81 = var11.field3473 * 4096 / var79;
                                                if (var11.field3440 != 0) {
                                                    var78.method1565(true, var11.field3440, var81, var11.field3369 / 2 + var15, var11.field3473 / 2 + var14);
                                                } else if (var13 != 0) {
                                                    var78.method81(var14, var15, var11.field3473, var11.field3369, 256 - (var13 & 0xFF));
                                                } else if (var11.field3473 == var79 && var11.field3369 == var80) {
                                                    var78.method71(var14, var15);
                                                } else {
                                                    var78.method91(var14, var15, var11.field3473, var11.field3369);
                                                }
                                            }
                                        } else if (class101.field1570) {
                                            class55.method397(0, var11);
                                        }
                                    } else {
                                        class229 var77 = var11.method1448(class38.method298((byte) -113, var11), 113);
                                        if (var77 != null) {
                                            var77.method71(var14, var15);
                                        } else if (class101.field1570) {
                                            class55.method397(0, var11);
                                        }
                                    }
                                } else if (var11.field3447 == 6) {
                                    class114 var86 = null;
                                    boolean var87 = class38.method298((byte) -113, var11);
                                    int var88;
                                    if (var87) {
                                        var88 = var11.field3419;
                                    } else {
                                        var88 = var11.field3501;
                                    }
                                    int var89 = 0;
                                    if (var11.field3491 != -1) {
                                        class253 var90 = class162.method1112(var11.field3491, (byte) 114);
                                        if (var90 != null) {
                                            class253 var91 = var90.method1707(var11.field3398, (byte) -87);
                                            class198 var92 = var88 == -1 ? null : class104.method688(var88, 30091);
                                            var86 = var91.method1703(1, var11.field3376, var11.field3408, var11.field3498, var92, (byte) -81);
                                            if (var86 == null) {
                                                class55.method397(0, var11);
                                            } else {
                                                var89 = -var86.method363() / 2;
                                            }
                                        }
                                    } else if (var11.field3404 == 5) {
                                        if (var11.field3366 == -1) {
                                            var86 = class29.field393.method1673(-1, -119, (class198) null, 0, (class205[]) null, -1, -1, -1, 0, true, (class198) null);
                                        } else {
                                            int var93 = var11.field3366 & 0x7FF;
                                            if (class45.field574 == var93) {
                                                var93 = 2047;
                                            }
                                            class186 var94 = class153.field2277[var93];
                                            class198 var95 = var88 == -1 ? null : class104.method688(var88, 30091);
                                            if (var94 != null && (int) class162.method1116(var94.field2912, (byte) 125) << 11 == (var11.field3366 & 0xFFFFF800)) {
                                                var86 = var94.field2941.method1673(-1, 104, (class198) null, 0, (class205[]) null, var11.field3408, 0, -1, 0, true, var95);
                                            }
                                        }
                                    } else if (var88 == -1) {
                                        var86 = var11.method1440((class198) null, class149.field2227.field2941, -1, var87, -1, 0, 0);
                                        if (var86 == null && class101.field1570) {
                                            class55.method397(0, var11);
                                        }
                                    } else {
                                        class198 var96 = class104.method688(var88, 30091);
                                        var86 = var11.method1440(var96, class149.field2227.field2941, var11.field3498, var87, var11.field3408, var11.field3376, 0);
                                        if (var86 == null && class101.field1570) {
                                            class55.method397(0, var11);
                                        }
                                    }
                                    if (var86 != null) {
                                        int var97;
                                        if (var11.field3497 <= 0) {
                                            var97 = 256;
                                        } else {
                                            var97 = (var11.field3473 << 8) / var11.field3497;
                                        }
                                        int var98;
                                        if (var11.field3434 > 0) {
                                            var98 = (var11.field3369 << 8) / var11.field3434;
                                        } else {
                                            var98 = 256;
                                        }
                                        int var99 = var11.field3473 / 2 + (var14 + (var11.field3489 * var97 >> 8));
                                        int var100 = var11.field3369 / 2 + (var11.field3344 * var98 >> 8) + var15;
                                        class171.method1198(var99, var100);
                                        int var101 = class171.field2675[var11.field3400] * var11.field3483 >> 16;
                                        int var102 = class171.field2680[var11.field3400] * var11.field3483 >> 16;
                                        if (!var11.field3360) {
                                            var86.method735(0, var11.field3442, 0, var11.field3400, 0, var101, var102, -1L);
                                        } else if (var11.field3413) {
                                            ((class156) var86).method1057(0, var11.field3442, var11.field3387, var11.field3400, var11.field3406, var11.field3427 + var89 + var101, var102 - -var11.field3427, var11.field3483);
                                        } else {
                                            var86.method735(0, var11.field3442, var11.field3387, var11.field3400, var11.field3406, var101 + var89 + var11.field3427, var102 - -var11.field3427, -1L);
                                        }
                                        class171.method1197();
                                    }
                                } else {
                                    if (var11.field3447 == 7) {
                                        class188 var103 = var11.method1447(class68.field952, -80);
                                        if (var103 == null) {
                                            if (class101.field1570) {
                                                class55.method397(0, var11);
                                            }
                                            continue;
                                        }
                                        int var104 = 0;
                                        for (int var105 = 0; var105 < var11.field3486; var105++) {
                                            for (int var106 = 0; var106 < var11.field3426; var106++) {
                                                if (var11.field3341[var104] > 0) {
                                                    class253 var107 = class162.method1112(var11.field3341[var104] - 1, (byte) 104);
                                                    String var108;
                                                    if (var107.field4072 != 1 && var11.field3441[var104] == 1) {
                                                        var108 = "<col=ff9040>" + var107.field4035 + "</col>";
                                                    } else {
                                                        var108 = "<col=ff9040>" + var107.field4035 + "</col> x" + class242.method1637(0, var11.field3441[var104]);
                                                    }
                                                    int var109 = (var11.field3354 + 115) * var106 + var14;
                                                    int var110 = (var11.field3402 + 12) * var105 + var15;
                                                    if (var11.field3458 == 0) {
                                                        var103.method1325(var108, var109, var110, var11.field3374, var11.field3493 ? 0 : -1);
                                                    } else if (var11.field3458 == 1) {
                                                        var103.method1315(var108, var109 + 57, var110, var11.field3374, var11.field3493 ? 0 : -1);
                                                    } else {
                                                        var103.method1321(var108, var109 + 115 - 1, var110, var11.field3374, var11.field3493 ? 0 : -1);
                                                    }
                                                }
                                                var104++;
                                            }
                                        }
                                    }
                                    if (var11.field3447 == 8 && class257.field4149 == var11 && class82.field1218 == class136.field1968) {
                                        int var111 = 0;
                                        class188 var112 = class279.field4433;
                                        int var113 = 0;
                                        String var114 = var11.field3343;
                                        String var115 = class235.method1597(var114, var11, -123);
                                        while (var115.length() > 0) {
                                            int var123 = var115.indexOf("<br>");
                                            String var124;
                                            if (var123 == -1) {
                                                var124 = var115;
                                                var115 = "";
                                            } else {
                                                var124 = var115.substring(0, var123);
                                                var115 = var115.substring(var123 + 4);
                                            }
                                            int var125 = var112.method1309(var124);
                                            if (var111 < var125) {
                                                var111 = var125;
                                            }
                                            var113 += var112.field2956 + 1;
                                        }
                                        var113 += 7;
                                        var111 += 6;
                                        int var116 = var11.field3473 + var14 - var111 - 5;
                                        if (var116 < (var14 + 5)) {
                                            var116 = var14 + 5;
                                        }
                                        if (arg2 < var111 + var116) {
                                            var116 = arg2 - var111;
                                        }
                                        int var117 = var11.field3369 + var15 + 5;
                                        if ((var113 + var117) > arg0) {
                                            var117 = arg0 - var113;
                                        }
                                        class127.method876(var116, var117, var111, var113, 16777120);
                                        class127.method855(var116, var117, var111, var113, 0);
                                        int var118 = var117 + var112.field2956 + 2;
                                        String var119 = var11.field3343;
                                        String var120 = class235.method1597(var119, var11, -124);
                                        while (var120.length() > 0) {
                                            int var121 = var120.indexOf("<br>");
                                            String var122;
                                            if (var121 == -1) {
                                                var122 = var120;
                                                var120 = "";
                                            } else {
                                                var122 = var120.substring(0, var121);
                                                var120 = var120.substring(var121 + 4);
                                            }
                                            var112.method1325(var122, var116 + 3, var118, 0, -1);
                                            var118 += var112.field2956 + 1;
                                        }
                                    }
                                    if (var11.field3447 == 9) {
                                        int var126;
                                        int var127;
                                        int var128;
                                        int var129;
                                        if (var11.field3494) {
                                            var126 = var15;
                                            var127 = var11.field3473 + var14;
                                            var128 = var14;
                                            var129 = var11.field3369 + var15;
                                        } else {
                                            var126 = var11.field3369 + var15;
                                            var128 = var14;
                                            var129 = var15;
                                            var127 = var11.field3473 + var14;
                                        }
                                        if (var11.field3391 == 1) {
                                            class127.method869(var128, var129, var127, var126, var11.field3374);
                                        } else {
                                            class127.method857(var128, var129, var127, var126, var11.field3374, var11.field3391);
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

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method1343(int arg0) {
        field3029++;
        if (this.field3028 != this.field3026) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 < 64) {
            return null;
        } else {
            for (int var2 = 0; var2 < this.field3028; var2++) {
                this.field3038[var2] = class94.field1459;
            }
            return this.field3025;
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)I")
    public static final int method1344(int arg0, int arg1) {
        if (arg1 == -8847) {
            field3021++;
            return arg0 == 16711935 ? -1 : class155.method1030(arg0, -105);
        } else {
            return -56;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IZ)V")
    public static final void method1345(int arg0, boolean arg1) {
        field3030++;
        for (class190 var2 = (class190) class205.field3207.method350(8240); var2 != null; var2 = (class190) class205.field3207.method353((byte) -127)) {
            if (var2.field2986 != null) {
                class130.field1907.method716(var2.field2986);
                var2.field2986 = null;
            }
            if (var2.field2989 != null) {
                class130.field1907.method716(var2.field2989);
                var2.field2989 = null;
            }
            var2.method784(false);
        }
        if (arg0 != 17621) {
            field3024 = null;
        }
        if (!arg1) {
            return;
        }
        for (class190 var3 = (class190) class54.field743.method350(8240); var3 != null; var3 = (class190) class54.field743.method353((byte) -128)) {
            if (var3.field2986 != null) {
                class130.field1907.method716(var3.field2986);
                var3.field2986 = null;
            }
            var3.method784(false);
        }
        for (class190 var4 = (class190) class290.field4573.method671(0); var4 != null; var4 = (class190) class290.field4573.method666(-121)) {
            if (var4.field2986 != null) {
                class130.field1907.method716(var4.field2986);
                var4.field2986 = null;
            }
            var4.method784(false);
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
    public static void method1346(int arg0) {
        field3024 = null;
        if (arg0 == -5753) {
            field3022 = null;
            field3039 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)V")
    public final void method1347(int arg0) {
        field3034++;
        if (arg0 != 1) {
            this.field3026 = 83;
        }
        for (int var2 = 0; var2 < this.field3028; var2++) {
            this.field3025[var2][0] = null;
            this.field3025[var2][1] = null;
            this.field3025[var2][2] = null;
            this.field3025[var2] = null;
        }
        this.field3025 = null;
        this.field3038 = null;
        this.field3031.method346(true);
        this.field3031 = null;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(III)V")
    public class192(int arg0, int arg1, int arg2) {
        this.field3026 = arg1;
        this.field3028 = arg0;
        this.field3038 = new class271[this.field3026];
        this.field3025 = new int[this.field3028][3][arg2];
    }
}
