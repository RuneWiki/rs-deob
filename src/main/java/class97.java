import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class97 {

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "Lue;")
    private static class222 field1395 = new class222(16);

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field1399 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field1402 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Lsc;")
    public static class166 field1398 = new class166();

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "F")
    public static float field1401;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "F")
    public static float field1407;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "Lcc;")
    public static class208 field1403;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "Lc;")
    public static class301 field1404;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "Lnh;")
    public static class305 field1396;

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "[I")
    public static int[] field1417;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "[[[B")
    public static byte[][][] field1408;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "[[[B")
    public static byte[][][] field1411;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "[[[B")
    public static byte[][][] field1413;

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "[[[B")
    public static byte[][][] field1416;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "[[[B")
    public static byte[][][] field1418;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "[[[I")
    public static int[][][] field1409;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "[[[I")
    public static int[][][] field1415;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIII)Llh;")
    private static final class58 method618(int arg0, int arg1, int arg2, int arg3) {
        class58 var4 = new class58();
        for (class238 var5 = (class238) field1398.method1059((byte) -106); var5 != null; var5 = (class238) field1398.method1064((byte) -52)) {
            method631(var5, arg0, arg1, arg2, arg3);
            var4.method370((byte) -22, var5);
        }
        int[] var6 = new int[3];
        for (int var7 = 0; var7 < field1403.field3098; var7++) {
            class238 var8 = field1403.field3089[var7];
            boolean var9 = field1404.method2016(field1403.field3088[var7] & 0x3FFF, field1403.field3088[var7] >> 28 & 0x3, var6, field1403.field3088[var7] >> 14 & 0x3FFF, (byte) -112);
            if (var9) {
                var8.field3689 = var6[1] - field1400;
                var8.field3691 = field1406 - (var6[2] - field1397) - 1;
                method631(var8, arg0, arg1, arg2, arg3);
                var4.method370((byte) -22, var8);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)Lc;")
    public static final class301 method619(int arg0, int arg1) {
        for (class301 var2 = (class301) field1395.method1458(0); var2 != null; var2 = (class301) field1395.method1462(-10000001)) {
            if (var2.field4793 && var2.method2017(arg0, 0, arg1)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "()V")
    public static final void method620() {
        for (int var0 = 0; var0 < field1403.field3098; var0++) {
            if (field1403.field3089[var0] != null) {
                field1398.method1068(field1403.field3089[var0], (byte) -45);
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static final void method621(int arg0) {
        field1404 = (class301) field1395.method1453(true, (long) arg0);
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "()Llh;")
    public static final class58 method622() {
        int var0 = field1422 - field1423;
        int var1 = field1414 - field1410;
        int var2 = (field1421 - field1419 << 16) / var0;
        int var3 = (field1420 - field1412 << 16) / var1;
        return method618(var2, var3, 0, 0);
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(II)V")
    public static final void method623(int arg0, int arg1) {
        for (int var2 = 0; var2 < class306.field4923; var2++) {
            class159 var3 = class272.method1771(4, var2);
            if (var3 != null) {
                int var4 = var3.field2204;
                if (var4 >= 0 && !class118.field1696.method564(127, var4)) {
                    var4 = -1;
                }
                int var8;
                if (var3.field2210 >= 0) {
                    int var5 = var3.field2210;
                    int var6 = (var5 & 0x7F) + arg1;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 127) {
                        var6 = 127;
                    }
                    int var7 = (arg0 + var5 & 0xFC00) + (var5 & 0x380) + var6;
                    var8 = class118.field1695[class142.method893(var7, 96, false)];
                } else if (var4 >= 0) {
                    var8 = class118.field1695[class142.method893(class118.field1696.method560(var4, 65535), 96, false)];
                } else if (var3.field2217 == -1) {
                    var8 = -1;
                } else {
                    int var9 = var3.field2217;
                    int var10 = (var9 & 0x7F) + arg1;
                    if (var10 < 0) {
                        var10 = 0;
                    } else if (var10 > 127) {
                        var10 = 127;
                    }
                    int var11 = (arg0 + var9 & 0xFC00) + (var9 & 0x380) + var10;
                    var8 = class118.field1695[class142.method893(var11, 96, false)];
                }
                field1417[var2 + 1] = var8;
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method624(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1423 = arg0;
        field1410 = arg1;
        field1422 = arg2;
        field1414 = arg3;
        field1419 = arg4;
        field1412 = arg5;
        field1421 = arg6;
        field1420 = arg7;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lbj;Z)V")
    public static final void method625(class215 arg0, boolean arg1) {
        while (arg0.field3280 < arg0.field3287.length) {
            boolean var2 = false;
            int var3 = 0;
            int var4 = 0;
            if (arg0.method1374((byte) -60) == 1) {
                var2 = true;
                var3 = arg0.method1374((byte) -60);
                var4 = arg0.method1374((byte) -60);
            }
            int var5 = arg0.method1374((byte) -60);
            int var6 = arg0.method1374((byte) -60);
            int var7 = var5 * 64 - field1400;
            int var8 = field1406 - (var6 * 64 - field1397) - 1;
            if (var7 >= 0 && var8 - 63 >= 0 && var7 + 63 < field1405 && var8 < field1406) {
                int var9 = var7 >> 6;
                int var10 = var8 >> 6;
                for (int var11 = 0; var11 < 64; var11++) {
                    for (int var12 = 0; var12 < 64; var12++) {
                        if (!var2 || var11 >= var3 * 8 && var11 < var3 * 8 + 8 && var12 >= var4 * 8 && var12 < var4 * 8 + 8) {
                            int var13 = arg0.method1374((byte) -60);
                            if (var13 != 0) {
                                if ((var13 & 0x1) == 1) {
                                    int var14 = arg0.method1374((byte) -60);
                                    if (field1416[var9][var10] == null) {
                                        field1416[var9][var10] = new byte[4096];
                                    }
                                    field1416[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                }
                                if ((var13 & 0x2) == 2) {
                                    int var15 = arg0.method1403(6591);
                                    if (field1415[var9][var10] == null) {
                                        field1415[var9][var10] = new int[4096];
                                    }
                                    field1415[var9][var10][(63 - var12 << 6) + var11] = var15;
                                }
                                if ((var13 & 0x4) == 4) {
                                    int var16 = arg0.method1379(-91);
                                    int var17 = arg0.method1374((byte) -60);
                                    int var22 = var16 - 1;
                                    class240 var18 = class265.method1717(-109, var22);
                                    if (var18.field3766 != null) {
                                        var18 = var18.method1567(-1);
                                        if (var18 == null || var18.field3758 == -1) {
                                            continue;
                                        }
                                    }
                                    if ((!var18.field3726 || arg1) && var18.field3758 != -1) {
                                        class238 var19 = new class238();
                                        var19.field3688 = var18.field3758;
                                        var19.field3692 = var17;
                                        var19.field3689 = var9 * 64 + var11;
                                        var19.field3691 = var10 * 64 + (64 - var12);
                                        field1398.method1068(var19, (byte) -45);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < (var2 ? 64 : 4096); var20++) {
                    int var21 = arg0.method1374((byte) -60);
                    if (var21 != 0) {
                        if ((var21 & 0x1) == 1) {
                            arg0.field3280++;
                        }
                        if ((var21 & 0x2) == 2) {
                            arg0.field3280 += 2;
                        }
                        if ((var21 & 0x4) == 4) {
                            arg0.field3280 += 3;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lbj;)V")
    public static final void method626(class215 arg0) {
        while (arg0.field3280 < arg0.field3287.length) {
            boolean var1 = false;
            int var2 = 0;
            int var3 = 0;
            if (arg0.method1374((byte) -60) == 1) {
                var1 = true;
                var2 = arg0.method1374((byte) -60);
                var3 = arg0.method1374((byte) -60);
            }
            int var4 = arg0.method1374((byte) -60);
            int var5 = arg0.method1374((byte) -60);
            int var6 = var4 * 64 - field1400;
            int var7 = field1406 - (var5 * 64 - field1397) - 1;
            if (var6 >= 0 && var7 - 63 >= 0 && var6 + 63 < field1405 && var7 < field1406) {
                int var8 = var6 >> 6;
                int var9 = var7 >> 6;
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (!var1 || var10 >= var2 * 8 && var10 < var2 * 8 + 8 && var11 >= var3 * 8 && var11 < var3 * 8 + 8) {
                            byte var12 = arg0.method1350((byte) -20);
                            if (var12 != 0) {
                                if (field1408[var8][var9] == null) {
                                    field1408[var8][var9] = new byte[4096];
                                }
                                field1408[var8][var9][(63 - var11 << 6) + var10] = var12;
                                byte var13 = arg0.method1350((byte) -22);
                                if (field1418[var8][var9] == null) {
                                    field1418[var8][var9] = new byte[4096];
                                }
                                field1418[var8][var9][(63 - var11 << 6) + var10] = var13;
                            }
                        }
                    }
                }
            } else {
                for (int var14 = 0; var14 < (var1 ? 64 : 4096); var14++) {
                    byte var15 = arg0.method1350((byte) -34);
                    if (var15 != 0) {
                        arg0.field3280++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)Lc;")
    public static final class301 method627(int arg0) {
        return (class301) field1395.method1453(true, (long) arg0);
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(IIII)V")
    private static final void method628(int arg0, int arg1, int arg2, int arg3) {
        int var4 = field1422 - field1423;
        int var5 = field1414 - field1410;
        if (field1422 < field1405) {
            var4++;
        }
        if (field1414 < field1406) {
            var5++;
        }
        int var10000;
        for (int var6 = 0; var6 < var4; var6++) {
            int var34 = arg0 * var6 + arg2 >> 16;
            int var35 = (var6 + 1) * arg0 + arg2 >> 16;
            int var36 = var35 - var34;
            if (var36 > 0) {
                int var37 = field1423 + var6 >> 6;
                if (var37 >= 0 && var37 <= field1409.length - 1) {
                    int[][] var38 = field1409[var37];
                    byte[][] var39 = field1413[var37];
                    byte[][] var40 = field1411[var37];
                    byte[][] var41 = field1408[var37];
                    byte[][] var42 = field1418[var37];
                    byte[][] var43 = field1416[var37];
                    int var44 = field1419 + var34;
                    int var45 = field1419 + var35;
                    for (int var46 = 0; var46 < var5; var46++) {
                        int var47 = arg1 * var46 + arg3 >> 16;
                        int var48 = (var46 + 1) * arg1 + arg3 >> 16;
                        int var49 = var48 - var47;
                        if (var49 > 0) {
                            int var50 = field1412 + var47;
                            int var51 = field1412 + var48;
                            int var52 = field1410 + var46 >> 6;
                            int var53 = field1410 + var46 & 0x3F;
                            int var54 = field1423 + var6 & 0x3F;
                            int var55 = (var53 << 6) + var54;
                            int var56;
                            if (var52 < 0 || var52 > var38.length - 1 || var38[var52] == null) {
                                if (field1404.field4797 != -1) {
                                    var56 = field1404.field4797;
                                } else if ((field1423 + var6 & 0x4) == (field1410 + var46 & 0x4)) {
                                    var56 = field1417[class175.field2473 + 1];
                                } else {
                                    var56 = 4936552;
                                }
                                if (var52 < 0 || var52 > var38.length - 1) {
                                    if (var56 == 0) {
                                        var56 = 1;
                                    }
                                    class266.method1730(var44, var50, var36, var49, var56);
                                    continue;
                                }
                            } else {
                                var56 = var38[var52][var55];
                            }
                            if (var56 == 0) {
                                var56 = 1;
                            }
                            int var57 = var39[var52] == null ? 0 : field1417[var39[var52][var55] & 0xFF];
                            int var58 = var41[var52] == null ? 0 : field1417[var41[var52][var55] & 0xFF];
                            if (var57 == 0 && var58 == 0) {
                                class266.method1730(var44, var50, var36, var49, var56);
                            } else {
                                if (var57 != 0) {
                                    if (var57 == -1) {
                                        var57 = 1;
                                    }
                                    byte var59 = var40[var52] == null ? 0 : var40[var52][var55];
                                    int var60 = var59 & 0xFC;
                                    if (var60 == 0 || var36 <= 1 || var49 <= 1) {
                                        class266.method1730(var44, var50, var36, var49, var57);
                                    } else {
                                        method630(class266.field4282, var44, var50, var56, var57, var36, var49, var60 >> 2, var59 & 0x3, true);
                                    }
                                }
                                if (var58 != 0) {
                                    if (var58 == -1) {
                                        var58 = var56;
                                    }
                                    byte var61 = var42[var52][var55];
                                    int var62 = var61 & 0xFC;
                                    if (var62 == 0 || var36 <= 1 || var49 <= 1) {
                                        class266.method1730(var44, var50, var36, var49, var58);
                                    }
                                    method630(class266.field4282, var44, var50, 0, var58, var36, var49, var62 >> 2, var61 & 0x3, var57 == 0);
                                }
                            }
                            if (var43[var52] != null) {
                                int var63 = var43[var52][var55] & 0xFF;
                                if (var63 != 0) {
                                    int var64;
                                    if (var36 == 1) {
                                        var64 = var44;
                                    } else {
                                        var64 = var45 - 1;
                                    }
                                    int var65;
                                    if (var49 == 1) {
                                        var65 = var50;
                                    } else {
                                        var65 = var51 - 1;
                                    }
                                    int var66 = 13421772;
                                    if (var63 >= 5 && var63 <= 8 || var63 >= 13 && var63 <= 16 || var63 >= 21 && var63 <= 24 || var63 == 27 || var63 == 28) {
                                        var66 = 13369344;
                                        var63 -= 4;
                                    }
                                    if (var63 == 1) {
                                        class266.method1729(var44, var50, var49, var66);
                                    } else if (var63 == 2) {
                                        class266.method1742(var44, var50, var36, var66);
                                    } else if (var63 == 3) {
                                        class266.method1729(var64, var50, var49, var66);
                                    } else if (var63 == 4) {
                                        class266.method1742(var44, var65, var36, var66);
                                    } else if (var63 == 9) {
                                        class266.method1729(var44, var50, var49, 16777215);
                                        class266.method1742(var44, var50, var36, var66);
                                    } else if (var63 == 10) {
                                        class266.method1729(var64, var50, var49, 16777215);
                                        class266.method1742(var44, var50, var36, var66);
                                    } else if (var63 == 11) {
                                        class266.method1729(var64, var50, var49, 16777215);
                                        class266.method1742(var44, var65, var36, var66);
                                    } else if (var63 == 12) {
                                        class266.method1729(var44, var50, var49, 16777215);
                                        class266.method1742(var44, var65, var36, var66);
                                    } else if (var63 == 17) {
                                        class266.method1742(var44, var50, 1, var66);
                                    } else if (var63 == 18) {
                                        class266.method1742(var64, var50, 1, var66);
                                    } else if (var63 == 19) {
                                        class266.method1742(var64, var65, 1, var66);
                                    } else if (var63 == 20) {
                                        class266.method1742(var44, var65, 1, var66);
                                    } else if (var63 == 25) {
                                        for (int var67 = 0; var67 < var49; var67++) {
                                            class266.method1742(var44 + var67, var65 - var67, 1, var66);
                                        }
                                    } else if (var63 == 26) {
                                        for (int var68 = 0; var68 < var49; var68++) {
                                            class266.method1742(var44 + var68, var50 + var68, 1, var66);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var69 = field1419 + var34;
                    var10000 = field1419 + var35;
                    for (int var71 = 0; var71 < var5; var71++) {
                        int var72 = (arg1 * var71 + arg3 >> 16) + field1412;
                        int var73 = ((var71 + 1) * arg1 + arg3 >> 16) + field1412;
                        int var74 = var73 - var72;
                        int var75;
                        if (field1404.field4797 != -1) {
                            var75 = field1404.field4797;
                        } else if ((field1423 + var6 & 0x4) == (field1410 + var71 & 0x4)) {
                            var75 = field1417[class175.field2473 + 1];
                        } else {
                            var75 = 4936552;
                        }
                        if (var75 == 0) {
                            var75 = 1;
                        }
                        class266.method1730(var69, var72, var36, var74, var75);
                    }
                }
            }
        }
        for (int var7 = -2; var7 < var4 + 2; var7++) {
            int var8 = arg0 * var7 + arg2 >> 16;
            int var9 = (var7 + 1) * arg0 + arg2 >> 16;
            int var10 = var9 - var8;
            if (var10 > 0) {
                int var11 = field1419 + var8;
                var10000 = field1419 + var9;
                int var13 = field1423 + var7 >> 6;
                if (var13 >= 0 && var13 <= field1415.length - 1) {
                    int[][] var14 = field1415[var13];
                    for (int var15 = -2; var15 < var5 + 2; var15++) {
                        int var16 = arg1 * var15 + arg3 >> 16;
                        int var17 = (var15 + 1) * arg1 + arg3 >> 16;
                        int var18 = var17 - var16;
                        if (var18 > 0) {
                            int var19 = field1412 + var16;
                            var10000 = field1412 + var17;
                            int var21 = field1410 + var15 >> 6;
                            if (var21 >= 0 && var21 <= var14.length - 1) {
                                int var22 = ((field1410 + var15 & 0x3F) << 6) + (field1423 + var7 & 0x3F);
                                if (var14[var21] != null) {
                                    int var23 = var14[var21][var22];
                                    int var24 = var23 & 0x1FFF;
                                    if (var24 != 0) {
                                        class242 var25 = class292.method1962(var24 - 1, 19423);
                                        int var26 = var23 >> 13 & 0x3;
                                        boolean var27 = (var23 >> 15 & 0x1) == 1;
                                        class74 var28 = var25.method1592(var26, 0, var27);
                                        if (var28 != null) {
                                            int var29 = var28.field4566 * var10 / 4;
                                            int var30 = var28.field4557 * var18 / 4;
                                            if (var25.field3796) {
                                                int var31 = var23 >> 16 & 0xF;
                                                int var32 = var23 >> 20 & 0xF;
                                                if ((var26 & 0x1) == 1) {
                                                    int var33 = var31;
                                                    var31 = var32;
                                                    var32 = var33;
                                                }
                                                var29 = var10 * var31;
                                                var30 = var18 * var32;
                                            }
                                            if (var29 != 0 && var30 != 0) {
                                                if (var25.field3801 == 0) {
                                                    var28.method481(var11, var19 + var18 - var30, var29, var30);
                                                } else {
                                                    var28.method488(var11, var19 + var18 - var30, var29, var30, var25.field3801);
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

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(II)Lsc;")
    public static final class166 method629(int arg0, int arg1) {
        class166 var2 = new class166();
        for (class301 var3 = (class301) field1395.method1458(0); var3 != null; var3 = (class301) field1395.method1462(-10000001)) {
            if (var3.field4793 && var3.method2017(arg0, 0, arg1)) {
                var2.method1068(var3, (byte) -45);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "([IIIIIIIIIZ)V")
    private static final void method630(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        int var10 = arg1;
        if (arg1 >= class266.field4278) {
            return;
        }
        if (arg1 < class266.field4279) {
            var10 = class266.field4279;
        }
        int var11 = arg1 + arg5;
        if (var11 <= class266.field4279) {
            return;
        }
        if (var11 > class266.field4278) {
            var11 = class266.field4278;
        }
        int var12 = arg2;
        if (arg2 >= class266.field4280) {
            return;
        }
        if (arg2 < class266.field4281) {
            var12 = class266.field4281;
        }
        int var13 = arg2 + arg6;
        if (var13 <= class266.field4281) {
            return;
        }
        if (var13 > class266.field4280) {
            var13 = class266.field4280;
        }
        int var14 = class266.field4275 * var12 + var10;
        int var15 = class266.field4275 + var10 - var11;
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

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lfa;IIII)V")
    private static final void method631(class238 arg0, int arg1, int arg2, int arg3, int arg4) {
        arg0.field3687 = ((arg0.field3689 - field1423) * arg1 + arg3 >> 16) + field1419;
        arg0.field3686 = ((arg0.field3691 - field1410) * arg2 + arg4 >> 16) + field1412;
        class149 var5 = class121.method784(-66, arg0.field3688);
        if (var5.field2072 != -1) {
            class284 var6 = var5.method932((byte) 108, false, true);
            if (var6 != null) {
                if (arg0.field3687 - (var6.field4566 + 1 >> 1) <= field1421 && (var6.field4566 + 1 >> 1) + arg0.field3687 >= field1419 && arg0.field3686 - (var6.field4557 + 1 >> 1) <= field1420 && (var6.field4557 + 1 >> 1) + arg0.field3686 >= field1412) {
                    arg0.field3684 = false;
                    return;
                }
                arg0.field3684 = true;
                return;
            }
        }
        if (arg0.field3689 >= field1423 && arg0.field3689 <= field1422 && arg0.field3691 >= field1410 && arg0.field3691 <= field1414) {
            arg0.field3684 = false;
        } else {
            arg0.field3684 = true;
        }
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "()V")
    public static final void method632() {
        int var0 = field1422 - field1423;
        int var1 = field1414 - field1410;
        int var2 = (field1421 - field1419 << 16) / var0;
        int var3 = (field1420 - field1412 << 16) / var1;
        method628(var2, var3, 0, 0);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lnh;)V")
    public static final void method633(class305 arg0) {
        field1396 = arg0;
        field1395.method1456(0);
        int var1 = field1396.method2081(-128, "details");
        int[] var2 = field1396.method2071(4846, var1);
        for (int var3 = 0; var3 < var2.length; var3++) {
            field1395.method1452((long) var2[var3], class171.method1094(new class215(field1396.method2050(110, var1, var2[var3])), (byte) -125, var2[var3]), 0);
        }
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "()V")
    public static void method634() {
        field1396 = null;
        field1395 = null;
        field1404 = null;
        field1403 = null;
        field1398 = null;
        field1409 = null;
        field1413 = null;
        field1411 = null;
        field1408 = null;
        field1418 = null;
        field1416 = null;
        field1415 = null;
        field1417 = null;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(Lbj;)V")
    public static final void method635(class215 arg0) {
        while (arg0.field3280 < arg0.field3287.length) {
            boolean var1 = false;
            int var2 = 0;
            int var3 = 0;
            if (arg0.method1374((byte) -60) == 1) {
                var1 = true;
                var2 = arg0.method1374((byte) -60);
                var3 = arg0.method1374((byte) -60);
            }
            int var4 = arg0.method1374((byte) -60);
            int var5 = arg0.method1374((byte) -60);
            int var6 = var4 * 64 - field1400;
            int var7 = field1406 - (var5 * 64 - field1397) - 1;
            if (var6 >= 0 && var7 - 63 >= 0 && var6 + 63 < field1405 && var7 < field1406) {
                int var8 = var6 >> 6;
                int var9 = var7 >> 6;
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (!var1 || var10 >= var2 * 8 && var10 < var2 * 8 + 8 && var11 >= var3 * 8 && var11 < var3 * 8 + 8) {
                            byte var12 = arg0.method1350((byte) 89);
                            if (var12 != 0) {
                                if (field1413[var8][var9] == null) {
                                    field1413[var8][var9] = new byte[4096];
                                }
                                field1413[var8][var9][(63 - var11 << 6) + var10] = var12;
                                byte var13 = arg0.method1350((byte) -119);
                                if (field1411[var8][var9] == null) {
                                    field1411[var8][var9] = new byte[4096];
                                }
                                field1411[var8][var9][(63 - var11 << 6) + var10] = var13;
                            }
                        }
                    }
                }
            } else {
                for (int var14 = 0; var14 < (var1 ? 64 : 4096); var14++) {
                    byte var15 = arg0.method1350((byte) 97);
                    if (var15 != 0) {
                        arg0.field3280++;
                    }
                }
            }
        }
    }
}
