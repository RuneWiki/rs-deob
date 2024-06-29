import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class38 {

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "Lic;")
    private static class329 field455 = new class329(16);

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public static int field464 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    public static int field466 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "Luk;")
    public static class105 field457 = new class105();

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "F")
    public static float field463;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "F")
    public static float field465;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "Lpo;")
    public static class10 field460;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "Lfh;")
    public static class140 field456;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "Lwg;")
    public static class310 field458;

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "[I")
    public static int[] field482;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "[[[B")
    public static byte[][][] field470;

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "[[[B")
    public static byte[][][] field473;

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "[[[B")
    public static byte[][][] field474;

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "[[[B")
    public static byte[][][] field477;

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "[[[B")
    public static byte[][][] field478;

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "[[[I")
    public static int[][][] field469;

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "[[[I")
    public static int[][][] field480;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lfh;)V", line = 3)
    public static final void method258(class140 arg0) {
        field456 = arg0;
        field455.method2282((byte) -94);
        int var1 = field456.method1079(false, "details");
        int[] var2 = field456.method1080(true, var1);
        for (int var3 = 0; var3 < var2.length; var3++) {
            field455.method2275(class165.method1238(var2[var3], 2951, new class299(field456.method1089(var1, (byte) 119, var2[var3]))), 90, (long) var2[var3]);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)Lwg;", line = 22)
    public static final class310 method259(int arg0, int arg1) {
        for (class310 var2 = (class310) field455.method2277(13292); var2 != null; var2 = (class310) field455.method2278((byte) -101)) {
            if (var2.field4556 && var2.method2155(-129, arg0, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)Luk;", line = 35)
    public static final class105 method260(int arg0, int arg1) {
        class105 var2 = new class105();
        for (class310 var3 = (class310) field455.method2277(13292); var3 != null; var3 = (class310) field455.method2278((byte) -66)) {
            if (var3.field4556 && var3.method2155(-129, arg0, arg1)) {
                var2.method740(-122, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIII)V", line = 51)
    private static final void method261(int arg0, int arg1, int arg2, int arg3) {
        int var4 = field481 - field483;
        int var5 = field468 - field471;
        if (field481 < field467) {
            var4++;
        }
        if (field468 < field459) {
            var5++;
        }
        int var10000;
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = arg0 * var6 + arg2 >> 16;
            int var8 = (var6 + 1) * arg0 + arg2 >> 16;
            int var9 = var8 - var7;
            if (var9 > 0) {
                int var10 = field483 + var6 >> 6;
                if (var10 >= 0 && var10 <= field480.length - 1) {
                    int[][] var11 = field480[var10];
                    byte[][] var12 = field478[var10];
                    byte[][] var13 = field477[var10];
                    byte[][] var14 = field470[var10];
                    byte[][] var15 = field473[var10];
                    byte[][] var16 = field474[var10];
                    int var17 = field475 + var7;
                    int var18 = field475 + var8;
                    for (int var19 = 0; var19 < var5; var19++) {
                        int var20 = arg1 * var19 + arg3 >> 16;
                        int var21 = (var19 + 1) * arg1 + arg3 >> 16;
                        int var22 = var21 - var20;
                        if (var22 > 0) {
                            int var23 = field472 + var20;
                            int var24 = field472 + var21;
                            int var25 = field471 + var19 >> 6;
                            int var26 = field471 + var19 & 0x3F;
                            int var27 = field483 + var6 & 0x3F;
                            int var28 = (var26 << 6) + var27;
                            int var29;
                            if (var25 < 0 || var25 > var11.length - 1 || var11[var25] == null) {
                                if (field458.field4550 != -1) {
                                    var29 = field458.field4550;
                                } else if ((field483 + var6 & 0x4) == (field471 + var19 & 0x4)) {
                                    var29 = field482[class154.field2144 + 1];
                                } else {
                                    var29 = 4936552;
                                }
                                if (var25 < 0 || var25 > var11.length - 1) {
                                    if (var29 == 0) {
                                        var29 = 1;
                                    }
                                    class37.method231(var17, var23, var9, var22, var29);
                                    continue;
                                }
                            } else {
                                var29 = var11[var25][var28];
                            }
                            if (var29 == 0) {
                                var29 = 1;
                            }
                            int var30 = var12[var25] == null ? 0 : field482[var12[var25][var28] & 0xFF];
                            int var31 = var14[var25] == null ? 0 : field482[var14[var25][var28] & 0xFF];
                            if (var30 == 0 && var31 == 0) {
                                class37.method231(var17, var23, var9, var22, var29);
                            } else {
                                if (var30 != 0) {
                                    if (var30 == -1) {
                                        var30 = 1;
                                    }
                                    byte var32 = var13[var25] == null ? 0 : var13[var25][var28];
                                    int var33 = var32 & 0xFC;
                                    if (var33 == 0 || var9 <= 1 || var22 <= 1) {
                                        class37.method231(var17, var23, var9, var22, var30);
                                    } else {
                                        method274(class37.field452, var17, var23, var29, var30, var9, var22, var33 >> 2, var32 & 0x3, true);
                                    }
                                }
                                if (var31 != 0) {
                                    if (var31 == -1) {
                                        var31 = var29;
                                    }
                                    byte var34 = var15[var25][var28];
                                    int var35 = var34 & 0xFC;
                                    if (var35 == 0 || var9 <= 1 || var22 <= 1) {
                                        class37.method231(var17, var23, var9, var22, var31);
                                    }
                                    method274(class37.field452, var17, var23, 0, var31, var9, var22, var35 >> 2, var34 & 0x3, var30 == 0);
                                }
                            }
                            if (var16[var25] != null) {
                                int var36 = var16[var25][var28] & 0xFF;
                                if (var36 != 0) {
                                    int var37;
                                    if (var9 == 1) {
                                        var37 = var17;
                                    } else {
                                        var37 = var18 - 1;
                                    }
                                    int var38;
                                    if (var22 == 1) {
                                        var38 = var23;
                                    } else {
                                        var38 = var24 - 1;
                                    }
                                    int var39 = 13421772;
                                    if (var36 >= 5 && var36 <= 8 || var36 >= 13 && var36 <= 16 || var36 >= 21 && var36 <= 24 || var36 == 27 || var36 == 28) {
                                        var39 = 13369344;
                                        var36 -= 4;
                                    }
                                    if (var36 == 1) {
                                        class37.method238(var17, var23, var22, var39);
                                    } else if (var36 == 2) {
                                        class37.method240(var17, var23, var9, var39);
                                    } else if (var36 == 3) {
                                        class37.method238(var37, var23, var22, var39);
                                    } else if (var36 == 4) {
                                        class37.method240(var17, var38, var9, var39);
                                    } else if (var36 == 9) {
                                        class37.method238(var17, var23, var22, 16777215);
                                        class37.method240(var17, var23, var9, var39);
                                    } else if (var36 == 10) {
                                        class37.method238(var37, var23, var22, 16777215);
                                        class37.method240(var17, var23, var9, var39);
                                    } else if (var36 == 11) {
                                        class37.method238(var37, var23, var22, 16777215);
                                        class37.method240(var17, var38, var9, var39);
                                    } else if (var36 == 12) {
                                        class37.method238(var17, var23, var22, 16777215);
                                        class37.method240(var17, var38, var9, var39);
                                    } else if (var36 == 17) {
                                        class37.method240(var17, var23, 1, var39);
                                    } else if (var36 == 18) {
                                        class37.method240(var37, var23, 1, var39);
                                    } else if (var36 == 19) {
                                        class37.method240(var37, var38, 1, var39);
                                    } else if (var36 == 20) {
                                        class37.method240(var17, var38, 1, var39);
                                    } else if (var36 == 25) {
                                        for (int var40 = 0; var40 < var22; var40++) {
                                            class37.method240(var17 + var40, var38 - var40, 1, var39);
                                        }
                                    } else if (var36 == 26) {
                                        for (int var41 = 0; var41 < var22; var41++) {
                                            class37.method240(var17 + var41, var23 + var41, 1, var39);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var42 = field475 + var7;
                    var10000 = field475 + var8;
                    for (int var44 = 0; var44 < var5; var44++) {
                        int var45 = (arg1 * var44 + arg3 >> 16) + field472;
                        int var46 = ((var44 + 1) * arg1 + arg3 >> 16) + field472;
                        int var47 = var46 - var45;
                        int var48;
                        if (field458.field4550 != -1) {
                            var48 = field458.field4550;
                        } else if ((field483 + var6 & 0x4) == (field471 + var44 & 0x4)) {
                            var48 = field482[class154.field2144 + 1];
                        } else {
                            var48 = 4936552;
                        }
                        if (var48 == 0) {
                            var48 = 1;
                        }
                        class37.method231(var42, var45, var9, var47, var48);
                    }
                }
            }
        }
        for (int var49 = -2; var49 < var4 + 2; var49++) {
            int var50 = arg0 * var49 + arg2 >> 16;
            int var51 = (var49 + 1) * arg0 + arg2 >> 16;
            int var52 = var51 - var50;
            if (var52 > 0) {
                int var53 = field475 + var50;
                var10000 = field475 + var51;
                int var55 = field483 + var49 >> 6;
                if (var55 >= 0 && var55 <= field469.length - 1) {
                    int[][] var56 = field469[var55];
                    for (int var57 = -2; var57 < var5 + 2; var57++) {
                        int var58 = arg1 * var57 + arg3 >> 16;
                        int var59 = (var57 + 1) * arg1 + arg3 >> 16;
                        int var60 = var59 - var58;
                        if (var60 > 0) {
                            int var61 = field472 + var58;
                            var10000 = field472 + var59;
                            int var63 = field471 + var57 >> 6;
                            if (var63 >= 0 && var63 <= var56.length - 1) {
                                int var64 = ((field471 + var57 & 0x3F) << 6) + (field483 + var49 & 0x3F);
                                if (var56[var63] != null) {
                                    int var65 = var56[var63][var64];
                                    int var66 = var65 & 0x1FFF;
                                    if (var66 != 0) {
                                        class23 var67 = class198.method1452((byte) 1, var66 - 1);
                                        int var68 = var65 >> 13 & 0x3;
                                        boolean var69 = (var65 >> 15 & 0x1) == 1;
                                        class153 var70 = var67.method158(-1, var69, var68);
                                        if (var70 != null) {
                                            int var71 = var70.field2024 * var52 / 4;
                                            int var72 = var70.field2029 * var60 / 4;
                                            if (var67.field253) {
                                                int var73 = var65 >> 16 & 0xF;
                                                int var74 = var65 >> 20 & 0xF;
                                                if ((var68 & 0x1) == 1) {
                                                    int var75 = var73;
                                                    var73 = var74;
                                                    var74 = var75;
                                                }
                                                var71 = var52 * var73;
                                                var72 = var60 * var74;
                                            }
                                            if (var71 != 0 && var72 != 0) {
                                                if (var67.field255 == 0) {
                                                    var70.method1180(var53, var61 + var60 - var72, var71, var72);
                                                } else {
                                                    var70.method1181(var53, var61 + var60 - var72, var71, var72, var67.field255);
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
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "()Lll;", line = 452)
    public static final class54 method262() {
        int var0 = field481 - field483;
        int var1 = field468 - field471;
        int var2 = (field476 - field475 << 16) / var0;
        int var3 = (field479 - field472 << 16) / var1;
        return method275(var2, var3, 0, 0);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lfd;)V", line = 463)
    public static final void method263(class299 arg0) {
        label83: while (true) {
            if (arg0.field4351 < arg0.field4350.length) {
                boolean var1 = false;
                int var2 = 0;
                int var3 = 0;
                if (arg0.method2096((byte) -122) == 1) {
                    var1 = true;
                    var2 = arg0.method2096((byte) -122);
                    var3 = arg0.method2096((byte) -122);
                }
                int var4 = arg0.method2096((byte) -122);
                int var5 = arg0.method2096((byte) -122);
                int var6 = var4 * 64 - field462;
                int var7 = field459 - (var5 * 64 - field461) - 1;
                if (var6 >= 0 && var7 - 63 >= 0 && var6 + 63 < field467 && var7 < field459) {
                    int var8 = var6 >> 6;
                    int var9 = var7 >> 6;
                    int var10 = 0;
                    while (true) {
                        if (var10 >= 64) {
                            continue label83;
                        }
                        for (int var11 = 0; var11 < 64; var11++) {
                            if (!var1 || var10 >= var2 * 8 && var10 < var2 * 8 + 8 && var11 >= var3 * 8 && var11 < var3 * 8 + 8) {
                                byte var12 = arg0.method2104(117);
                                if (var12 != 0) {
                                    if (field478[var8][var9] == null) {
                                        field478[var8][var9] = new byte[4096];
                                    }
                                    field478[var8][var9][(63 - var11 << 6) + var10] = var12;
                                    byte var13 = arg0.method2104(118);
                                    if (field477[var8][var9] == null) {
                                        field477[var8][var9] = new byte[4096];
                                    }
                                    field477[var8][var9][(63 - var11 << 6) + var10] = var13;
                                }
                            }
                        }
                        var10++;
                    }
                }
                int var14 = 0;
                while (true) {
                    if (var14 >= (var1 ? 64 : 4096)) {
                        continue label83;
                    }
                    byte var15 = arg0.method2104(121);
                    if (var15 != 0) {
                        arg0.field4351++;
                    }
                    var14++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "()V", line = 547)
    public static void method264() {
        field456 = null;
        field455 = null;
        field458 = null;
        field460 = null;
        field457 = null;
        field480 = (int[][][]) null;
        field478 = (byte[][][]) null;
        field477 = (byte[][][]) null;
        field470 = (byte[][][]) null;
        field473 = (byte[][][]) null;
        field474 = (byte[][][]) null;
        field469 = (int[][][]) null;
        field482 = null;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "()V", line = 569)
    public static final void method265() {
        for (int var0 = 0; var0 < field460.field122; var0++) {
            if (field460.field121[var0] != null) {
                field457.method740(-121, field460.field121[var0]);
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIIIIII)V", line = 582)
    public static final void method266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field483 = arg0;
        field471 = arg1;
        field481 = arg2;
        field468 = arg3;
        field475 = arg4;
        field472 = arg5;
        field476 = arg6;
        field479 = arg7;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V", line = 594)
    public static final void method267(int arg0) {
        field458 = (class310) field455.method2279((long) arg0, -118);
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "()V", line = 599)
    public static final void method268() {
        int var0 = field481 - field483;
        int var1 = field468 - field471;
        int var2 = (field476 - field475 << 16) / var0;
        int var3 = (field479 - field472 << 16) / var1;
        method261(var2, var3, 0, 0);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lfg;IIII)V", line = 609)
    private static final void method269(class352 arg0, int arg1, int arg2, int arg3, int arg4) {
        arg0.field5501 = ((arg0.field5503 - field483) * arg1 + arg3 >> 16) + field475;
        arg0.field5497 = ((arg0.field5504 - field471) * arg2 + arg4 >> 16) + field472;
        class287 var5 = class282.method1924(true, arg0.field5493);
        if (var5.field4129 != -1) {
            class145 var6 = var5.method1969(false, false, true);
            if (var6 != null) {
                if (arg0.field5501 - (var6.field2024 + 1 >> 1) <= field476 && (var6.field2024 + 1 >> 1) + arg0.field5501 >= field475 && arg0.field5497 - (var6.field2029 + 1 >> 1) <= field479 && (var6.field2029 + 1 >> 1) + arg0.field5497 >= field472) {
                    arg0.field5498 = false;
                } else {
                    arg0.field5498 = true;
                }
                return;
            }
        }
        if (arg0.field5503 >= field483 && arg0.field5503 <= field481 && arg0.field5504 >= field471 && arg0.field5504 <= field468) {
            arg0.field5498 = false;
        } else {
            arg0.field5498 = true;
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)Lwg;", line = 637)
    public static final class310 method270(int arg0) {
        return (class310) field455.method2279((long) arg0, -29);
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(Lfd;)V", line = 642)
    public static final void method271(class299 arg0) {
        label83: while (true) {
            if (arg0.field4351 < arg0.field4350.length) {
                boolean var1 = false;
                int var2 = 0;
                int var3 = 0;
                if (arg0.method2096((byte) -122) == 1) {
                    var1 = true;
                    var2 = arg0.method2096((byte) -122);
                    var3 = arg0.method2096((byte) -122);
                }
                int var4 = arg0.method2096((byte) -122);
                int var5 = arg0.method2096((byte) -122);
                int var6 = var4 * 64 - field462;
                int var7 = field459 - (var5 * 64 - field461) - 1;
                if (var6 >= 0 && var7 - 63 >= 0 && var6 + 63 < field467 && var7 < field459) {
                    int var8 = var6 >> 6;
                    int var9 = var7 >> 6;
                    int var10 = 0;
                    while (true) {
                        if (var10 >= 64) {
                            continue label83;
                        }
                        for (int var11 = 0; var11 < 64; var11++) {
                            if (!var1 || var10 >= var2 * 8 && var10 < var2 * 8 + 8 && var11 >= var3 * 8 && var11 < var3 * 8 + 8) {
                                byte var12 = arg0.method2104(116);
                                if (var12 != 0) {
                                    if (field470[var8][var9] == null) {
                                        field470[var8][var9] = new byte[4096];
                                    }
                                    field470[var8][var9][(63 - var11 << 6) + var10] = var12;
                                    byte var13 = arg0.method2104(109);
                                    if (field473[var8][var9] == null) {
                                        field473[var8][var9] = new byte[4096];
                                    }
                                    field473[var8][var9][(63 - var11 << 6) + var10] = var13;
                                }
                            }
                        }
                        var10++;
                    }
                }
                int var14 = 0;
                while (true) {
                    if (var14 >= (var1 ? 64 : 4096)) {
                        continue label83;
                    }
                    byte var15 = arg0.method2104(97);
                    if (var15 != 0) {
                        arg0.field4351++;
                    }
                    var14++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lfd;Z)V", line = 734)
    public static final void method272(class299 arg0, boolean arg1) {
        label125: while (true) {
            if (arg0.field4351 < arg0.field4350.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method2096((byte) -122) == 1) {
                    var2 = true;
                    var3 = arg0.method2096((byte) -122);
                    var4 = arg0.method2096((byte) -122);
                }
                int var5 = arg0.method2096((byte) -122);
                int var6 = arg0.method2096((byte) -122);
                int var7 = var5 * 64 - field462;
                int var8 = field459 - (var6 * 64 - field461) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && var7 + 63 < field467 && var8 < field459) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    int var11 = 0;
                    while (true) {
                        if (var11 >= 64) {
                            continue label125;
                        }
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var3 * 8 && var11 < var3 * 8 + 8 && var12 >= var4 * 8 && var12 < var4 * 8 + 8) {
                                int var13 = arg0.method2096((byte) -122);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method2096((byte) -122);
                                        if (field474[var9][var10] == null) {
                                            field474[var9][var10] = new byte[4096];
                                        }
                                        field474[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method2085((byte) 66);
                                        if (field469[var9][var10] == null) {
                                            field469[var9][var10] = new int[4096];
                                        }
                                        field469[var9][var10][(63 - var12 << 6) + var11] = var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = arg0.method2083((byte) -16);
                                        int var17 = arg0.method2096((byte) -122);
                                        int var22 = var16 - 1;
                                        class219 var18 = class345.method2392(var22, 0);
                                        if (var18.field3125 != null) {
                                            var18 = var18.method1589(0);
                                            if (var18 == null || var18.field3111 == -1) {
                                                continue;
                                            }
                                        }
                                        if ((!var18.field3124 || arg1) && var18.field3111 != -1) {
                                            class352 var19 = new class352();
                                            var19.field5493 = var18.field3111;
                                            var19.field5496 = var17;
                                            var19.field5503 = var9 * 64 + var11;
                                            var19.field5504 = var10 * 64 + (64 - var12);
                                            field457.method740(-111, var19);
                                        }
                                    }
                                }
                            }
                        }
                        var11++;
                    }
                }
                int var20 = 0;
                while (true) {
                    if (var20 >= (var2 ? 64 : 4096)) {
                        continue label125;
                    }
                    int var21 = arg0.method2096((byte) -122);
                    if (var21 != 0) {
                        if ((var21 & 0x1) == 1) {
                            arg0.field4351++;
                        }
                        if ((var21 & 0x2) == 2) {
                            arg0.field4351 += 2;
                        }
                        if ((var21 & 0x4) == 4) {
                            arg0.field4351 += 3;
                        }
                    }
                    var20++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(II)V", line = 871)
    public static final void method273(int arg0, int arg1) {
        for (int var2 = 0; var2 < class299.field4358; var2++) {
            class216 var3 = class311.method2165((byte) -127, var2);
            if (var3 != null) {
                int var4 = var3.field3059;
                if (var4 >= 0 && !class350.field5467.method902(var4, 0)) {
                    var4 = -1;
                }
                int var8;
                if (var3.field3051 >= 0) {
                    int var5 = var3.field3051;
                    int var6 = (var5 & 0x7F) + arg1;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 127) {
                        var6 = 127;
                    }
                    int var7 = (arg0 + var5 & 0xFC00) + (var5 & 0x380) + var6;
                    var8 = class350.field5463[class308.method2151((byte) -77, var7, 96)];
                } else if (var4 >= 0) {
                    var8 = class350.field5463[class308.method2151((byte) -77, class350.field5467.method907(var4, 65535), 96)];
                } else if (var3.field3050 == -1) {
                    var8 = -1;
                } else {
                    int var9 = var3.field3050;
                    int var10 = (var9 & 0x7F) + arg1;
                    if (var10 < 0) {
                        var10 = 0;
                    } else if (var10 > 127) {
                        var10 = 127;
                    }
                    int var11 = (arg0 + var9 & 0xFC00) + (var9 & 0x380) + var10;
                    var8 = class350.field5463[class308.method2151((byte) -77, var11, 96)];
                }
                field482[var2 + 1] = var8;
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([IIIIIIIIIZ)V", line = 943)
    private static final void method274(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        int var10 = arg1;
        if (arg1 >= class37.field451) {
            return;
        }
        if (arg1 < class37.field450) {
            var10 = class37.field450;
        }
        int var11 = arg1 + arg5;
        if (var11 <= class37.field450) {
            return;
        }
        if (var11 > class37.field451) {
            var11 = class37.field451;
        }
        int var12 = arg2;
        if (arg2 >= class37.field453) {
            return;
        }
        if (arg2 < class37.field446) {
            var12 = class37.field446;
        }
        int var13 = arg2 + arg6;
        if (var13 <= class37.field446) {
            return;
        }
        if (var13 > class37.field453) {
            var13 = class37.field453;
        }
        int var14 = class37.field454 * var12 + var10;
        int var15 = class37.field454 + var10 - var11;
        int var16 = var10 - arg1;
        int var17 = var11 - arg1;
        int var18 = var12 - arg2;
        int var19 = var13 - arg2;
        int var20 = arg5 - var17;
        int var21 = arg5 - var16;
        int var22 = arg6 - var19;
        int var23 = arg6 - var18;
        if (arg7 == 9) {
            arg7 = 1;
            arg8 = arg8 + 1 & 0x3;
        }
        if (arg7 == 10) {
            arg7 = 1;
            arg8 = arg8 + 3 & 0x3;
        }
        if (arg7 == 11) {
            arg7 = 8;
            arg8 = arg8 + 3 & 0x3;
        }
        if (arg7 == 1) {
            if (arg8 == 0) {
                for (int var24 = var18; var24 < var19; var24++) {
                    for (int var25 = var16; var25 < var17; var25++) {
                        if (var25 <= var24) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 1) {
                for (int var26 = var23 - 1; var26 >= var22; var26--) {
                    for (int var27 = var16; var27 < var17; var27++) {
                        if (var27 <= var26) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 2) {
                for (int var28 = var18; var28 < var19; var28++) {
                    for (int var29 = var16; var29 < var17; var29++) {
                        if (var29 >= var28) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 3) {
                for (int var30 = var23 - 1; var30 >= var22; var30--) {
                    for (int var31 = var16; var31 < var17; var31++) {
                        if (var31 >= var30) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            }
        } else if (arg7 == 2) {
            if (arg8 == 0) {
                for (int var32 = var23 - 1; var32 >= var22; var32--) {
                    for (int var33 = var16; var33 < var17; var33++) {
                        if (var33 <= var32 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 1) {
                for (int var34 = var18; var34 < var19; var34++) {
                    for (int var35 = var16; var35 < var17; var35++) {
                        if (var14 >= 0 && var14 < arg0.length) {
                            if (var35 >= var34 << 1) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        } else {
                            var14++;
                        }
                    }
                    var14 += var15;
                }
            } else if (arg8 == 2) {
                for (int var36 = var18; var36 < var19; var36++) {
                    for (int var37 = var21 - 1; var37 >= var20; var37--) {
                        if (var37 <= var36 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 3) {
                for (int var38 = var23 - 1; var38 >= var22; var38--) {
                    for (int var39 = var21 - 1; var39 >= var20; var39--) {
                        if (var39 >= var38 << 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            }
        } else if (arg7 == 3) {
            if (arg8 == 0) {
                for (int var40 = var23 - 1; var40 >= var22; var40--) {
                    for (int var41 = var21 - 1; var41 >= var20; var41--) {
                        if (var41 <= var40 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 1) {
                for (int var42 = var23 - 1; var42 >= var22; var42--) {
                    for (int var43 = var16; var43 < var17; var43++) {
                        if (var43 >= var42 << 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 2) {
                for (int var44 = var18; var44 < var19; var44++) {
                    for (int var45 = var16; var45 < var17; var45++) {
                        if (var45 <= var44 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 3) {
                for (int var46 = var18; var46 < var19; var46++) {
                    for (int var47 = var21 - 1; var47 >= var20; var47--) {
                        if (var47 >= var46 << 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            }
        } else if (arg7 == 4) {
            if (arg8 == 0) {
                for (int var48 = var23 - 1; var48 >= var22; var48--) {
                    for (int var49 = var16; var49 < var17; var49++) {
                        if (var49 >= var48 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 1) {
                for (int var50 = var18; var50 < var19; var50++) {
                    for (int var51 = var16; var51 < var17; var51++) {
                        if (var51 <= var50 << 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 2) {
                for (int var52 = var18; var52 < var19; var52++) {
                    for (int var53 = var21 - 1; var53 >= var20; var53--) {
                        if (var53 >= var52 >> 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            } else if (arg8 == 3) {
                for (int var54 = var23 - 1; var54 >= var22; var54--) {
                    for (int var55 = var21 - 1; var55 >= var20; var55--) {
                        if (var55 <= var54 << 1) {
                            arg0[var14] = arg4;
                        } else if (arg9) {
                            arg0[var14] = arg3;
                        }
                        var14++;
                    }
                    var14 += var15;
                }
            }
        } else if (arg7 != 5) {
            if (arg7 == 6) {
                if (arg8 == 0) {
                    for (int var64 = var18; var64 < var19; var64++) {
                        for (int var65 = var16; var65 < var17; var65++) {
                            if (var65 <= arg5 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var66 = var18; var66 < var19; var66++) {
                        for (int var67 = var16; var67 < var17; var67++) {
                            if (var66 <= arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var68 = var18; var68 < var19; var68++) {
                        for (int var69 = var16; var69 < var17; var69++) {
                            if (var69 >= arg5 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var70 = var18; var70 < var19; var70++) {
                        for (int var71 = var16; var71 < var17; var71++) {
                            if (var70 >= arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
            }
            if (arg7 == 7) {
                if (arg8 == 0) {
                    for (int var72 = var18; var72 < var19; var72++) {
                        for (int var73 = var16; var73 < var17; var73++) {
                            if (var73 <= var72 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var74 = var23 - 1; var74 >= var22; var74--) {
                        for (int var75 = var16; var75 < var17; var75++) {
                            if (var75 <= var74 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var76 = var23 - 1; var76 >= var22; var76--) {
                        for (int var77 = var21 - 1; var77 >= var20; var77--) {
                            if (var77 <= var76 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var78 = var18; var78 < var19; var78++) {
                        for (int var79 = var21 - 1; var79 >= var20; var79--) {
                            if (var79 <= var78 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
            }
            if (arg7 == 8) {
                if (arg8 == 0) {
                    for (int var80 = var18; var80 < var19; var80++) {
                        for (int var81 = var16; var81 < var17; var81++) {
                            if (var81 >= var80 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 1) {
                    for (int var82 = var23 - 1; var82 >= var22; var82--) {
                        for (int var83 = var16; var83 < var17; var83++) {
                            if (var83 >= var82 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 2) {
                    for (int var84 = var23 - 1; var84 >= var22; var84--) {
                        for (int var85 = var21 - 1; var85 >= var20; var85--) {
                            if (var85 >= var84 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
                if (arg8 == 3) {
                    for (int var86 = var18; var86 < var19; var86++) {
                        for (int var87 = var21 - 1; var87 >= var20; var87--) {
                            if (var87 >= var86 - arg6 / 2) {
                                arg0[var14] = arg4;
                            } else if (arg9) {
                                arg0[var14] = arg3;
                            }
                            var14++;
                        }
                        var14 += var15;
                    }
                    return;
                }
            }
        } else if (arg8 == 0) {
            for (int var56 = var23 - 1; var56 >= var22; var56--) {
                for (int var57 = var21 - 1; var57 >= var20; var57--) {
                    if (var57 >= var56 >> 1) {
                        arg0[var14] = arg4;
                    } else if (arg9) {
                        arg0[var14] = arg3;
                    }
                    var14++;
                }
                var14 += var15;
            }
        } else if (arg8 == 1) {
            for (int var58 = var23 - 1; var58 >= var22; var58--) {
                for (int var59 = var16; var59 < var17; var59++) {
                    if (var59 <= var58 << 1) {
                        arg0[var14] = arg4;
                    } else if (arg9) {
                        arg0[var14] = arg3;
                    }
                    var14++;
                }
                var14 += var15;
            }
        } else if (arg8 == 2) {
            for (int var60 = var18; var60 < var19; var60++) {
                for (int var61 = var16; var61 < var17; var61++) {
                    if (var61 >= var60 >> 1) {
                        arg0[var14] = arg4;
                    } else if (arg9) {
                        arg0[var14] = arg3;
                    }
                    var14++;
                }
                var14 += var15;
            }
        } else if (arg8 == 3) {
            for (int var62 = var18; var62 < var19; var62++) {
                for (int var63 = var21 - 1; var63 >= var20; var63--) {
                    if (var63 <= var62 << 1) {
                        arg0[var14] = arg4;
                    } else if (arg9) {
                        arg0[var14] = arg3;
                    }
                    var14++;
                }
                var14 += var15;
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(IIII)Lll;", line = 2081)
    private static final class54 method275(int arg0, int arg1, int arg2, int arg3) {
        class54 var4 = new class54();
        for (class352 var5 = (class352) field457.method739((byte) 53); var5 != null; var5 = (class352) field457.method747(1)) {
            method269(var5, arg0, arg1, arg2, arg3);
            var4.method415((byte) 117, var5);
        }
        int[] var6 = new int[3];
        for (int var7 = 0; var7 < field460.field122; var7++) {
            class352 var8 = field460.field121[var7];
            boolean var9 = field458.method2154(field460.field117[var7] & 0x3FFF, -1, field460.field117[var7] >> 28 & 0x3, var6, field460.field117[var7] >> 14 & 0x3FFF);
            if (var9) {
                var8.field5503 = var6[1] - field462;
                var8.field5504 = field459 - (var6[2] - field461) - 1;
                method269(var8, arg0, arg1, arg2, arg3);
                var4.method415((byte) -118, var8);
            }
        }
        return var4;
    }
}
