import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class105 {

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "Ls;")
    private static class196 field1495 = new class196(16);

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field1496 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
    public static int field1501 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "Lad;")
    public static class342 field1505 = new class342();

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "F")
    public static float field1504;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "F")
    public static float field1506;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!eh", name = "u", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!eh", name = "v", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!eh", name = "y", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!eh", name = "A", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!eh", name = "B", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "Lto;")
    public static class109 field1502;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "Led;")
    public static class281 field1500;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "Lph;")
    public static class361 field1494;

    @OriginalMember(owner = "client!eh", name = "w", descriptor = "[I")
    public static int[] field1516;

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "[[[B")
    public static byte[][][] field1512;

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "[[[B")
    public static byte[][][] field1513;

    @OriginalMember(owner = "client!eh", name = "x", descriptor = "[[[B")
    public static byte[][][] field1517;

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "[[[B")
    public static byte[][][] field1519;

    @OriginalMember(owner = "client!eh", name = "C", descriptor = "[[[B")
    public static byte[][][] field1522;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "[[[I")
    public static int[][][] field1508;

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "[[[I")
    public static int[][][] field1509;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lsb;)V", line = 4)
    public static final void method799(class190 arg0) {
        label83: while (true) {
            if (arg0.field2776 < arg0.field2718.length) {
                boolean var1 = false;
                int var2 = 0;
                int var3 = 0;
                if (arg0.method1319(255) == 1) {
                    var1 = true;
                    var2 = arg0.method1319(255);
                    var3 = arg0.method1319(255);
                }
                int var4 = arg0.method1319(255);
                int var5 = arg0.method1319(255);
                int var6 = var4 * 64 - field1498;
                int var7 = field1503 - (var5 * 64 - field1497) - 1;
                if (var6 >= 0 && var7 - 63 >= 0 && var6 + 63 < field1499 && var7 < field1503) {
                    int var8 = var6 >> 6;
                    int var9 = var7 >> 6;
                    int var10 = 0;
                    while (true) {
                        if (var10 >= 64) {
                            continue label83;
                        }
                        for (int var11 = 0; var11 < 64; var11++) {
                            if (!var1 || var10 >= var2 * 8 && var10 < var2 * 8 + 8 && var11 >= var3 * 8 && var11 < var3 * 8 + 8) {
                                byte var12 = arg0.method1322(9813);
                                if (var12 != 0) {
                                    if (field1517[var8][var9] == null) {
                                        field1517[var8][var9] = new byte[4096];
                                    }
                                    field1517[var8][var9][(63 - var11 << 6) + var10] = var12;
                                    byte var13 = arg0.method1322(9813);
                                    if (field1512[var8][var9] == null) {
                                        field1512[var8][var9] = new byte[4096];
                                    }
                                    field1512[var8][var9][(63 - var11 << 6) + var10] = var13;
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
                    byte var15 = arg0.method1322(9813);
                    if (var15 != 0) {
                        arg0.field2776++;
                    }
                    var14++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V", line = 94)
    public static final void method800(int arg0) {
        field1500 = (class281) field1495.method1405((long) arg0, false);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "()Lbo;", line = 98)
    public static final class16 method801() {
        int var0 = field1510 - field1520;
        int var1 = field1521 - field1507;
        int var2 = (field1518 - field1515 << 16) / var0;
        int var3 = (field1511 - field1514 << 16) / var1;
        return method803(var2, var3, 0, 0);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIII)V", line = 112)
    private static final void method802(int arg0, int arg1, int arg2, int arg3) {
        int var4 = field1510 - field1520;
        int var5 = field1521 - field1507;
        if (field1510 < field1499) {
            var4++;
        }
        if (field1521 < field1503) {
            var5++;
        }
        int var10000;
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = arg0 * var6 + arg2 >> 16;
            int var8 = (var6 + 1) * arg0 + arg2 >> 16;
            int var9 = var8 - var7;
            if (var9 > 0) {
                int var10 = field1520 + var6 >> 6;
                if (var10 >= 0 && var10 <= field1509.length - 1) {
                    int[][] var11 = field1509[var10];
                    byte[][] var12 = field1513[var10];
                    byte[][] var13 = field1522[var10];
                    byte[][] var14 = field1517[var10];
                    byte[][] var15 = field1512[var10];
                    byte[][] var16 = field1519[var10];
                    int var17 = field1515 + var7;
                    int var18 = field1515 + var8;
                    for (int var19 = 0; var19 < var5; var19++) {
                        int var20 = arg1 * var19 + arg3 >> 16;
                        int var21 = (var19 + 1) * arg1 + arg3 >> 16;
                        int var22 = var21 - var20;
                        if (var22 > 0) {
                            int var23 = field1514 + var20;
                            int var24 = field1514 + var21;
                            int var25 = field1507 + var19 >> 6;
                            int var26 = field1507 + var19 & 0x3F;
                            int var27 = field1520 + var6 & 0x3F;
                            int var28 = (var26 << 6) + var27;
                            int var29;
                            if (var25 < 0 || var25 > var11.length - 1 || var11[var25] == null) {
                                if (field1500.field4268 != -1) {
                                    var29 = field1500.field4268;
                                } else if ((field1520 + var6 & 0x4) == (field1507 + var19 & 0x4)) {
                                    var29 = field1516[class186.field2669 + 1];
                                } else {
                                    var29 = 4936552;
                                }
                                if (var25 < 0 || var25 > var11.length - 1) {
                                    if (var29 == 0) {
                                        var29 = 1;
                                    }
                                    class44.method317(var17, var23, var9, var22, var29);
                                    continue;
                                }
                            } else {
                                var29 = var11[var25][var28];
                            }
                            if (var29 == 0) {
                                var29 = 1;
                            }
                            int var30 = var12[var25] == null ? 0 : field1516[var12[var25][var28] & 0xFF];
                            int var31 = var14[var25] == null ? 0 : field1516[var14[var25][var28] & 0xFF];
                            if (var30 == 0 && var31 == 0) {
                                class44.method317(var17, var23, var9, var22, var29);
                            } else {
                                if (var30 != 0) {
                                    if (var30 == -1) {
                                        var30 = 1;
                                    }
                                    byte var32 = var13[var25] == null ? 0 : var13[var25][var28];
                                    int var33 = var32 & 0xFC;
                                    if (var33 == 0 || var9 <= 1 || var22 <= 1) {
                                        class44.method317(var17, var23, var9, var22, var30);
                                    } else {
                                        method806(class44.field624, var17, var23, var29, var30, var9, var22, var33 >> 2, var32 & 0x3, true);
                                    }
                                }
                                if (var31 != 0) {
                                    if (var31 == -1) {
                                        var31 = var29;
                                    }
                                    byte var34 = var15[var25][var28];
                                    int var35 = var34 & 0xFC;
                                    if (var35 == 0 || var9 <= 1 || var22 <= 1) {
                                        class44.method317(var17, var23, var9, var22, var31);
                                    }
                                    method806(class44.field624, var17, var23, 0, var31, var9, var22, var35 >> 2, var34 & 0x3, var30 == 0);
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
                                        class44.method328(var17, var23, var22, var39);
                                    } else if (var36 == 2) {
                                        class44.method339(var17, var23, var9, var39);
                                    } else if (var36 == 3) {
                                        class44.method328(var37, var23, var22, var39);
                                    } else if (var36 == 4) {
                                        class44.method339(var17, var38, var9, var39);
                                    } else if (var36 == 9) {
                                        class44.method328(var17, var23, var22, 16777215);
                                        class44.method339(var17, var23, var9, var39);
                                    } else if (var36 == 10) {
                                        class44.method328(var37, var23, var22, 16777215);
                                        class44.method339(var17, var23, var9, var39);
                                    } else if (var36 == 11) {
                                        class44.method328(var37, var23, var22, 16777215);
                                        class44.method339(var17, var38, var9, var39);
                                    } else if (var36 == 12) {
                                        class44.method328(var17, var23, var22, 16777215);
                                        class44.method339(var17, var38, var9, var39);
                                    } else if (var36 == 17) {
                                        class44.method339(var17, var23, 1, var39);
                                    } else if (var36 == 18) {
                                        class44.method339(var37, var23, 1, var39);
                                    } else if (var36 == 19) {
                                        class44.method339(var37, var38, 1, var39);
                                    } else if (var36 == 20) {
                                        class44.method339(var17, var38, 1, var39);
                                    } else if (var36 == 25) {
                                        for (int var40 = 0; var40 < var22; var40++) {
                                            class44.method339(var17 + var40, var38 - var40, 1, var39);
                                        }
                                    } else if (var36 == 26) {
                                        for (int var41 = 0; var41 < var22; var41++) {
                                            class44.method339(var17 + var41, var23 + var41, 1, var39);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var42 = field1515 + var7;
                    var10000 = field1515 + var8;
                    for (int var44 = 0; var44 < var5; var44++) {
                        int var45 = (arg1 * var44 + arg3 >> 16) + field1514;
                        int var46 = ((var44 + 1) * arg1 + arg3 >> 16) + field1514;
                        int var47 = var46 - var45;
                        int var48;
                        if (field1500.field4268 != -1) {
                            var48 = field1500.field4268;
                        } else if ((field1520 + var6 & 0x4) == (field1507 + var44 & 0x4)) {
                            var48 = field1516[class186.field2669 + 1];
                        } else {
                            var48 = 4936552;
                        }
                        if (var48 == 0) {
                            var48 = 1;
                        }
                        class44.method317(var42, var45, var9, var47, var48);
                    }
                }
            }
        }
        for (int var49 = -2; var49 < var4 + 2; var49++) {
            int var50 = arg0 * var49 + arg2 >> 16;
            int var51 = (var49 + 1) * arg0 + arg2 >> 16;
            int var52 = var51 - var50;
            if (var52 > 0) {
                int var53 = field1515 + var50;
                var10000 = field1515 + var51;
                int var55 = field1520 + var49 >> 6;
                if (var55 >= 0 && var55 <= field1508.length - 1) {
                    int[][] var56 = field1508[var55];
                    for (int var57 = -2; var57 < var5 + 2; var57++) {
                        int var58 = arg1 * var57 + arg3 >> 16;
                        int var59 = (var57 + 1) * arg1 + arg3 >> 16;
                        int var60 = var59 - var58;
                        if (var60 > 0) {
                            int var61 = field1514 + var58;
                            var10000 = field1514 + var59;
                            int var63 = field1507 + var57 >> 6;
                            if (var63 >= 0 && var63 <= var56.length - 1) {
                                int var64 = ((field1507 + var57 & 0x3F) << 6) + (field1520 + var49 & 0x3F);
                                if (var56[var63] != null) {
                                    int var65 = var56[var63][var64];
                                    int var66 = var65 & 0x1FFF;
                                    if (var66 != 0) {
                                        class329 var67 = class259.method1903(var66 - 1, -4576);
                                        int var68 = var65 >> 13 & 0x3;
                                        boolean var69 = (var65 >> 15 & 0x1) == 1;
                                        class234 var70 = var67.method2278(true, var69, var68);
                                        if (var70 != null) {
                                            int var71 = var70.field3715 * var52 / 4;
                                            int var72 = var70.field3716 * var60 / 4;
                                            if (var67.field4945) {
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
                                                if (var67.field4946 == 0) {
                                                    var70.method1737(var53, var61 + var60 - var72, var71, var72);
                                                } else {
                                                    var70.method1743(var53, var61 + var60 - var72, var71, var72, var67.field4946);
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

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(IIII)Lbo;", line = 511)
    private static final class16 method803(int arg0, int arg1, int arg2, int arg3) {
        class16 var4 = new class16();
        for (class287 var5 = (class287) field1505.method2386((byte) -36); var5 != null; var5 = (class287) field1505.method2388((byte) -92)) {
            method816(var5, arg0, arg1, arg2, arg3);
            var4.method106(var5, -127);
        }
        int[] var6 = new int[3];
        for (int var7 = 0; var7 < field1502.field1589; var7++) {
            class287 var8 = field1502.field1576[var7];
            boolean var9 = field1500.method2051(-126, field1502.field1586[var7] >> 14 & 0x3FFF, var6, field1502.field1586[var7] & 0x3FFF, field1502.field1586[var7] >> 28 & 0x3);
            if (var9) {
                var8.field4342 = var6[1] - field1498;
                var8.field4338 = field1503 - (var6[2] - field1497) - 1;
                method816(var8, arg0, arg1, arg2, arg3);
                var4.method106(var8, -128);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V", line = 548)
    public static final void method804(int arg0, int arg1) {
        for (int var2 = 0; var2 < class131.field1922; var2++) {
            class243 var3 = class1.method5(4, var2);
            if (var3 != null) {
                int var4 = var3.field3618;
                if (var4 >= 0 && !class345.field5336.method568(var4, -1826)) {
                    var4 = -1;
                }
                int var8;
                if (var3.field3614 >= 0) {
                    int var5 = var3.field3614;
                    int var6 = (var5 & 0x7F) + arg1;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 127) {
                        var6 = 127;
                    }
                    int var7 = (arg0 + var5 & 0xFC00) + (var5 & 0x380) + var6;
                    var8 = class345.field5349[class322.method2238(96, var7, (byte) -122)];
                } else if (var4 >= 0) {
                    var8 = class345.field5349[class322.method2238(96, class345.field5336.method591(var4, -126), (byte) -122)];
                } else if (var3.field3627 == -1) {
                    var8 = -1;
                } else {
                    int var9 = var3.field3627;
                    int var10 = (var9 & 0x7F) + arg1;
                    if (var10 < 0) {
                        var10 = 0;
                    } else if (var10 > 127) {
                        var10 = 127;
                    }
                    int var11 = (arg0 + var9 & 0xFC00) + (var9 & 0x380) + var10;
                    var8 = class345.field5349[class322.method2238(96, var11, (byte) -122)];
                }
                field1516[var2 + 1] = var8;
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(II)Led;", line = 613)
    public static final class281 method805(int arg0, int arg1) {
        for (class281 var2 = (class281) field1495.method1406(0); var2 != null; var2 = (class281) field1495.method1404(-53)) {
            if (var2.field4278 && var2.method2054(true, arg1, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "([IIIIIIIIIZ)V", line = 626)
    private static final void method806(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        int var10 = arg1;
        if (arg1 >= class44.field617) {
            return;
        }
        if (arg1 < class44.field622) {
            var10 = class44.field622;
        }
        int var11 = arg1 + arg5;
        if (var11 <= class44.field622) {
            return;
        }
        if (var11 > class44.field617) {
            var11 = class44.field617;
        }
        int var12 = arg2;
        if (arg2 >= class44.field621) {
            return;
        }
        if (arg2 < class44.field616) {
            var12 = class44.field616;
        }
        int var13 = arg2 + arg6;
        if (var13 <= class44.field616) {
            return;
        }
        if (var13 > class44.field621) {
            var13 = class44.field621;
        }
        int var14 = class44.field623 * var12 + var10;
        int var15 = class44.field623 + var10 - var11;
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

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(II)Lad;", line = 1764)
    public static final class342 method807(int arg0, int arg1) {
        class342 var2 = new class342();
        for (class281 var3 = (class281) field1495.method1406(0); var3 != null; var3 = (class281) field1495.method1404(-126)) {
            if (var3.field4278 && var3.method2054(true, arg1, arg0)) {
                var2.method2385(var3, 14);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lph;)V", line = 1779)
    public static final void method808(class361 arg0) {
        field1494 = arg0;
        field1495.method1410(-117);
        int var1 = field1494.method2505("details", (byte) 110);
        int[] var2 = field1494.method2508(122, var1);
        for (int var3 = 0; var3 < var2.length; var3++) {
            field1495.method1400((long) var2[var3], 105, class169.method1195(new class190(field1494.method2520(var1, var2[var3], (byte) -25)), -127, var2[var3]));
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIIII)V", line = 1796)
    public static final void method809(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1520 = arg0;
        field1507 = arg1;
        field1510 = arg2;
        field1521 = arg3;
        field1515 = arg4;
        field1514 = arg5;
        field1518 = arg6;
        field1511 = arg7;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lsb;Z)V", line = 1808)
    public static final void method810(class190 arg0, boolean arg1) {
        label125: while (true) {
            if (arg0.field2776 < arg0.field2718.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method1319(255) == 1) {
                    var2 = true;
                    var3 = arg0.method1319(255);
                    var4 = arg0.method1319(255);
                }
                int var5 = arg0.method1319(255);
                int var6 = arg0.method1319(255);
                int var7 = var5 * 64 - field1498;
                int var8 = field1503 - (var6 * 64 - field1497) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && var7 + 63 < field1499 && var8 < field1503) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    int var11 = 0;
                    while (true) {
                        if (var11 >= 64) {
                            continue label125;
                        }
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var3 * 8 && var11 < var3 * 8 + 8 && var12 >= var4 * 8 && var12 < var4 * 8 + 8) {
                                int var13 = arg0.method1319(255);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method1319(255);
                                        if (field1519[var9][var10] == null) {
                                            field1519[var9][var10] = new byte[4096];
                                        }
                                        field1519[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method1312(85);
                                        if (field1508[var9][var10] == null) {
                                            field1508[var9][var10] = new int[4096];
                                        }
                                        field1508[var9][var10][(63 - var12 << 6) + var11] = var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = arg0.method1317((byte) 84);
                                        int var17 = arg0.method1319(255);
                                        int var22 = var16 - 1;
                                        class261 var18 = class30.method212(0, var22);
                                        if (var18.field3895 != null) {
                                            var18 = var18.method1925(88);
                                            if (var18 == null || var18.field3933 == -1) {
                                                continue;
                                            }
                                        }
                                        if ((!var18.field3920 || arg1) && var18.field3933 != -1) {
                                            class287 var19 = new class287();
                                            var19.field4350 = var18.field3933;
                                            var19.field4344 = var17;
                                            var19.field4342 = var9 * 64 + var11;
                                            var19.field4338 = var10 * 64 + (64 - var12);
                                            field1505.method2385(var19, 14);
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
                    int var21 = arg0.method1319(255);
                    if (var21 != 0) {
                        if ((var21 & 0x1) == 1) {
                            arg0.field2776++;
                        }
                        if ((var21 & 0x2) == 2) {
                            arg0.field2776 += 2;
                        }
                        if ((var21 & 0x4) == 4) {
                            arg0.field2776 += 3;
                        }
                    }
                    var20++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "()V", line = 1944)
    public static final void method811() {
        int var0 = field1510 - field1520;
        int var1 = field1521 - field1507;
        int var2 = (field1518 - field1515 << 16) / var0;
        int var3 = (field1511 - field1514 << 16) / var1;
        method802(var2, var3, 0, 0);
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)Led;", line = 1956)
    public static final class281 method812(int arg0) {
        return (class281) field1495.method1405((long) arg0, false);
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "()V", line = 1961)
    public static final void method813() {
        for (int var0 = 0; var0 < field1502.field1589; var0++) {
            if (field1502.field1576[var0] != null) {
                field1505.method2385(field1502.field1576[var0], 14);
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(Lsb;)V", line = 1975)
    public static final void method814(class190 arg0) {
        label83: while (true) {
            if (arg0.field2776 < arg0.field2718.length) {
                boolean var1 = false;
                int var2 = 0;
                int var3 = 0;
                if (arg0.method1319(255) == 1) {
                    var1 = true;
                    var2 = arg0.method1319(255);
                    var3 = arg0.method1319(255);
                }
                int var4 = arg0.method1319(255);
                int var5 = arg0.method1319(255);
                int var6 = var4 * 64 - field1498;
                int var7 = field1503 - (var5 * 64 - field1497) - 1;
                if (var6 >= 0 && var7 - 63 >= 0 && var6 + 63 < field1499 && var7 < field1503) {
                    int var8 = var6 >> 6;
                    int var9 = var7 >> 6;
                    int var10 = 0;
                    while (true) {
                        if (var10 >= 64) {
                            continue label83;
                        }
                        for (int var11 = 0; var11 < 64; var11++) {
                            if (!var1 || var10 >= var2 * 8 && var10 < var2 * 8 + 8 && var11 >= var3 * 8 && var11 < var3 * 8 + 8) {
                                byte var12 = arg0.method1322(9813);
                                if (var12 != 0) {
                                    if (field1513[var8][var9] == null) {
                                        field1513[var8][var9] = new byte[4096];
                                    }
                                    field1513[var8][var9][(63 - var11 << 6) + var10] = var12;
                                    byte var13 = arg0.method1322(9813);
                                    if (field1522[var8][var9] == null) {
                                        field1522[var8][var9] = new byte[4096];
                                    }
                                    field1522[var8][var9][(63 - var11 << 6) + var10] = var13;
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
                    byte var15 = arg0.method1322(9813);
                    if (var15 != 0) {
                        arg0.field2776++;
                    }
                    var14++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "()V", line = 2070)
    public static void method815() {
        field1494 = null;
        field1495 = null;
        field1500 = null;
        field1502 = null;
        field1505 = null;
        field1509 = (int[][][]) null;
        field1513 = (byte[][][]) null;
        field1522 = (byte[][][]) null;
        field1517 = (byte[][][]) null;
        field1512 = (byte[][][]) null;
        field1519 = (byte[][][]) null;
        field1508 = (int[][][]) null;
        field1516 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lgi;IIII)V", line = 2086)
    private static final void method816(class287 arg0, int arg1, int arg2, int arg3, int arg4) {
        arg0.field4341 = ((arg0.field4342 - field1520) * arg1 + arg3 >> 16) + field1515;
        arg0.field4347 = ((arg0.field4338 - field1507) * arg2 + arg4 >> 16) + field1514;
        class200 var5 = class349.method2447(arg0.field4350, (byte) -9);
        if (var5.field2916 != -1) {
            class250 var6 = var5.method1460(false, (byte) -82, true);
            if (var6 != null) {
                if (arg0.field4341 - (var6.field3715 + 1 >> 1) <= field1518 && (var6.field3715 + 1 >> 1) + arg0.field4341 >= field1515 && arg0.field4347 - (var6.field3716 + 1 >> 1) <= field1511 && (var6.field3716 + 1 >> 1) + arg0.field4347 >= field1514) {
                    arg0.field4352 = false;
                } else {
                    arg0.field4352 = true;
                }
                return;
            }
        }
        if (arg0.field4342 >= field1520 && arg0.field4342 <= field1510 && arg0.field4338 >= field1507 && arg0.field4338 <= field1521) {
            arg0.field4352 = false;
        } else {
            arg0.field4352 = true;
        }
    }
}
