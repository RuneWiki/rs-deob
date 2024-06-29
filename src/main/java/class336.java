import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class336 {

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "Lqb;")
    private static class117 field5344 = new class117(16);

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "I")
    public static int field5348 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    public static int field5355 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "Ltg;")
    public static class345 field5352 = new class345();

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "F")
    public static float field5349;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "F")
    public static float field5351;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "I")
    public static int field5365;

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "I")
    public static int field5367;

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "I")
    public static int field5368;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "Lnk;")
    public static class16 field5345;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "Luc;")
    public static class212 field5347;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "Lr;")
    public static class301 field5353;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "[I")
    public static int[] field5361;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "[[[B")
    public static byte[][][] field5357;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "[[[B")
    public static byte[][][] field5364;

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "[[[B")
    public static byte[][][] field5369;

    @OriginalMember(owner = "client!hk", name = "B", descriptor = "[[[B")
    public static byte[][][] field5371;

    @OriginalMember(owner = "client!hk", name = "C", descriptor = "[[[B")
    public static byte[][][] field5372;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "[[[I")
    public static int[][][] field5363;

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "[[[I")
    public static int[][][] field5370;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)Luc;", line = 6)
    public static final class212 method2309(int arg0, int arg1) {
        for (class212 var2 = (class212) field5344.method761(111); var2 != null; var2 = (class212) field5344.method757(-1)) {
            if (var2.field3221 && var2.method1486(arg1, (byte) 50, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "()V", line = 19)
    public static final void method2310() {
        int var0 = field5362 - field5366;
        int var1 = field5368 - field5360;
        int var2 = (field5365 - field5367 << 16) / var0;
        int var3 = (field5359 - field5358 << 16) / var1;
        method2313(var2, var3, 0, 0);
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(II)V", line = 33)
    public static final void method2311(int arg0, int arg1) {
        for (int var2 = 0; var2 < class234.field3575; var2++) {
            class146 var3 = class348.method2412(true, var2);
            if (var3 != null) {
                int var4 = var3.field2323;
                if (var4 >= 0 && !class104.field1438.method880(var4, (byte) -101)) {
                    var4 = -1;
                }
                int var8;
                if (var3.field2325 >= 0) {
                    int var5 = var3.field2325;
                    int var6 = (var5 & 0x7F) + arg1;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 127) {
                        var6 = 127;
                    }
                    int var7 = (arg0 + var5 & 0xFC00) + (var5 & 0x380) + var6;
                    var8 = class104.field1440[class13.method76(-10845, var7, 96)];
                } else if (var4 >= 0) {
                    var8 = class104.field1440[class13.method76(-10845, class104.field1438.method878(-61, var4), 96)];
                } else if (var3.field2328 == -1) {
                    var8 = -1;
                } else {
                    int var9 = var3.field2328;
                    int var10 = (var9 & 0x7F) + arg1;
                    if (var10 < 0) {
                        var10 = 0;
                    } else if (var10 > 127) {
                        var10 = 127;
                    }
                    int var11 = (arg0 + var9 & 0xFC00) + (var9 & 0x380) + var10;
                    var8 = class104.field1440[class13.method76(-10845, var11, 96)];
                }
                field5361[var2 + 1] = var8;
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V", line = 96)
    public static final void method2312(int arg0) {
        field5347 = (class212) field5344.method770((long) arg0, 82);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIII)V", line = 100)
    private static final void method2313(int arg0, int arg1, int arg2, int arg3) {
        int var4 = field5362 - field5366;
        int var5 = field5368 - field5360;
        if (field5362 < field5356) {
            var4++;
        }
        if (field5368 < field5350) {
            var5++;
        }
        int var10000;
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = arg0 * var6 + arg2 >> 16;
            int var8 = (var6 + 1) * arg0 + arg2 >> 16;
            int var9 = var8 - var7;
            if (var9 > 0) {
                int var10 = field5366 + var6 >> 6;
                if (var10 >= 0 && var10 <= field5363.length - 1) {
                    int[][] var11 = field5363[var10];
                    byte[][] var12 = field5371[var10];
                    byte[][] var13 = field5369[var10];
                    byte[][] var14 = field5372[var10];
                    byte[][] var15 = field5364[var10];
                    byte[][] var16 = field5357[var10];
                    int var17 = field5367 + var7;
                    int var18 = field5367 + var8;
                    for (int var19 = 0; var19 < var5; var19++) {
                        int var20 = arg1 * var19 + arg3 >> 16;
                        int var21 = (var19 + 1) * arg1 + arg3 >> 16;
                        int var22 = var21 - var20;
                        if (var22 > 0) {
                            int var23 = field5358 + var20;
                            int var24 = field5358 + var21;
                            int var25 = field5360 + var19 >> 6;
                            int var26 = field5360 + var19 & 0x3F;
                            int var27 = field5366 + var6 & 0x3F;
                            int var28 = (var26 << 6) + var27;
                            int var29;
                            if (var25 < 0 || var25 > var11.length - 1 || var11[var25] == null) {
                                if (field5347.field3231 != -1) {
                                    var29 = field5347.field3231;
                                } else if ((field5366 + var6 & 0x4) == (field5360 + var19 & 0x4)) {
                                    var29 = field5361[class182.field2741 + 1];
                                } else {
                                    var29 = 4936552;
                                }
                                if (var25 < 0 || var25 > var11.length - 1) {
                                    if (var29 == 0) {
                                        var29 = 1;
                                    }
                                    class343.method2352(var17, var23, var9, var22, var29);
                                    continue;
                                }
                            } else {
                                var29 = var11[var25][var28];
                            }
                            if (var29 == 0) {
                                var29 = 1;
                            }
                            int var30 = var12[var25] == null ? 0 : field5361[var12[var25][var28] & 0xFF];
                            int var31 = var14[var25] == null ? 0 : field5361[var14[var25][var28] & 0xFF];
                            if (var30 == 0 && var31 == 0) {
                                class343.method2352(var17, var23, var9, var22, var29);
                            } else {
                                if (var30 != 0) {
                                    if (var30 == -1) {
                                        var30 = 1;
                                    }
                                    byte var32 = var13[var25] == null ? 0 : var13[var25][var28];
                                    int var33 = var32 & 0xFC;
                                    if (var33 == 0 || var9 <= 1 || var22 <= 1) {
                                        class343.method2352(var17, var23, var9, var22, var30);
                                    } else {
                                        method2315(class343.field5439, var17, var23, var29, var30, var9, var22, var33 >> 2, var32 & 0x3, true);
                                    }
                                }
                                if (var31 != 0) {
                                    if (var31 == -1) {
                                        var31 = var29;
                                    }
                                    byte var34 = var15[var25][var28];
                                    int var35 = var34 & 0xFC;
                                    if (var35 == 0 || var9 <= 1 || var22 <= 1) {
                                        class343.method2352(var17, var23, var9, var22, var31);
                                    }
                                    method2315(class343.field5439, var17, var23, 0, var31, var9, var22, var35 >> 2, var34 & 0x3, var30 == 0);
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
                                        class343.method2376(var17, var23, var22, var39);
                                    } else if (var36 == 2) {
                                        class343.method2365(var17, var23, var9, var39);
                                    } else if (var36 == 3) {
                                        class343.method2376(var37, var23, var22, var39);
                                    } else if (var36 == 4) {
                                        class343.method2365(var17, var38, var9, var39);
                                    } else if (var36 == 9) {
                                        class343.method2376(var17, var23, var22, 16777215);
                                        class343.method2365(var17, var23, var9, var39);
                                    } else if (var36 == 10) {
                                        class343.method2376(var37, var23, var22, 16777215);
                                        class343.method2365(var17, var23, var9, var39);
                                    } else if (var36 == 11) {
                                        class343.method2376(var37, var23, var22, 16777215);
                                        class343.method2365(var17, var38, var9, var39);
                                    } else if (var36 == 12) {
                                        class343.method2376(var17, var23, var22, 16777215);
                                        class343.method2365(var17, var38, var9, var39);
                                    } else if (var36 == 17) {
                                        class343.method2365(var17, var23, 1, var39);
                                    } else if (var36 == 18) {
                                        class343.method2365(var37, var23, 1, var39);
                                    } else if (var36 == 19) {
                                        class343.method2365(var37, var38, 1, var39);
                                    } else if (var36 == 20) {
                                        class343.method2365(var17, var38, 1, var39);
                                    } else if (var36 == 25) {
                                        for (int var40 = 0; var40 < var22; var40++) {
                                            class343.method2365(var17 + var40, var38 - var40, 1, var39);
                                        }
                                    } else if (var36 == 26) {
                                        for (int var41 = 0; var41 < var22; var41++) {
                                            class343.method2365(var17 + var41, var23 + var41, 1, var39);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var42 = field5367 + var7;
                    var10000 = field5367 + var8;
                    for (int var44 = 0; var44 < var5; var44++) {
                        int var45 = (arg1 * var44 + arg3 >> 16) + field5358;
                        int var46 = ((var44 + 1) * arg1 + arg3 >> 16) + field5358;
                        int var47 = var46 - var45;
                        int var48;
                        if (field5347.field3231 != -1) {
                            var48 = field5347.field3231;
                        } else if ((field5366 + var6 & 0x4) == (field5360 + var44 & 0x4)) {
                            var48 = field5361[class182.field2741 + 1];
                        } else {
                            var48 = 4936552;
                        }
                        if (var48 == 0) {
                            var48 = 1;
                        }
                        class343.method2352(var42, var45, var9, var47, var48);
                    }
                }
            }
        }
        for (int var49 = -2; var49 < var4 + 2; var49++) {
            int var50 = arg0 * var49 + arg2 >> 16;
            int var51 = (var49 + 1) * arg0 + arg2 >> 16;
            int var52 = var51 - var50;
            if (var52 > 0) {
                int var53 = field5367 + var50;
                var10000 = field5367 + var51;
                int var55 = field5366 + var49 >> 6;
                if (var55 >= 0 && var55 <= field5370.length - 1) {
                    int[][] var56 = field5370[var55];
                    for (int var57 = -2; var57 < var5 + 2; var57++) {
                        int var58 = arg1 * var57 + arg3 >> 16;
                        int var59 = (var57 + 1) * arg1 + arg3 >> 16;
                        int var60 = var59 - var58;
                        if (var60 > 0) {
                            int var61 = field5358 + var58;
                            var10000 = field5358 + var59;
                            int var63 = field5360 + var57 >> 6;
                            if (var63 >= 0 && var63 <= var56.length - 1) {
                                int var64 = ((field5360 + var57 & 0x3F) << 6) + (field5366 + var49 & 0x3F);
                                if (var56[var63] != null) {
                                    int var65 = var56[var63][var64];
                                    int var66 = var65 & 0x1FFF;
                                    if (var66 != 0) {
                                        class313 var67 = class93.method606(34, var66 - 1);
                                        int var68 = var65 >> 13 & 0x3;
                                        boolean var69 = (var65 >> 15 & 0x1) == 1;
                                        class270 var70 = var67.method2209(var69, (byte) -127, var68);
                                        if (var70 != null) {
                                            int var71 = var70.field2366 * var52 / 4;
                                            int var72 = var70.field2361 * var60 / 4;
                                            if (var67.field4906) {
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
                                                if (var67.field4896 == 0) {
                                                    var70.method1908(var53, var61 + var60 - var72, var71, var72);
                                                } else {
                                                    var70.method1913(var53, var61 + var60 - var72, var71, var72, var67.field4896);
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

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(II)Ltg;", line = 499)
    public static final class345 method2314(int arg0, int arg1) {
        class345 var2 = new class345();
        for (class212 var3 = (class212) field5344.method761(64); var3 != null; var3 = (class212) field5344.method757(-1)) {
            if (var3.field3221 && var3.method1486(arg1, (byte) 50, arg0)) {
                var2.method2395(16218, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "([IIIIIIIIIZ)V", line = 515)
    private static final void method2315(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        int var10 = arg1;
        if (arg1 >= class343.field5440) {
            return;
        }
        if (arg1 < class343.field5434) {
            var10 = class343.field5434;
        }
        int var11 = arg1 + arg5;
        if (var11 <= class343.field5434) {
            return;
        }
        if (var11 > class343.field5440) {
            var11 = class343.field5440;
        }
        int var12 = arg2;
        if (arg2 >= class343.field5435) {
            return;
        }
        if (arg2 < class343.field5433) {
            var12 = class343.field5433;
        }
        int var13 = arg2 + arg6;
        if (var13 <= class343.field5433) {
            return;
        }
        if (var13 > class343.field5435) {
            var13 = class343.field5435;
        }
        int var14 = class343.field5437 * var12 + var10;
        int var15 = class343.field5437 + var10 - var11;
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

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "()V", line = 1651)
    public static final void method2316() {
        for (int var0 = 0; var0 < field5353.field4701; var0++) {
            if (field5353.field4697[var0] != null) {
                field5352.method2395(16218, field5353.field4697[var0]);
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Llf;)V", line = 1671)
    public static final void method2317(class143 arg0) {
        label83: while (true) {
            if (arg0.field2295 < arg0.field2260.length) {
                boolean var1 = false;
                int var2 = 0;
                int var3 = 0;
                if (arg0.method1043(true) == 1) {
                    var1 = true;
                    var2 = arg0.method1043(true);
                    var3 = arg0.method1043(true);
                }
                int var4 = arg0.method1043(true);
                int var5 = arg0.method1043(true);
                int var6 = var4 * 64 - field5346;
                int var7 = field5350 - (var5 * 64 - field5354) - 1;
                if (var6 >= 0 && var7 - 63 >= 0 && var6 + 63 < field5356 && var7 < field5350) {
                    int var8 = var6 >> 6;
                    int var9 = var7 >> 6;
                    int var10 = 0;
                    while (true) {
                        if (var10 >= 64) {
                            continue label83;
                        }
                        for (int var11 = 0; var11 < 64; var11++) {
                            if (!var1 || var10 >= var2 * 8 && var10 < var2 * 8 + 8 && var11 >= var3 * 8 && var11 < var3 * 8 + 8) {
                                byte var12 = arg0.method1028(79030408);
                                if (var12 != 0) {
                                    if (field5372[var8][var9] == null) {
                                        field5372[var8][var9] = new byte[4096];
                                    }
                                    field5372[var8][var9][(63 - var11 << 6) + var10] = var12;
                                    byte var13 = arg0.method1028(79030408);
                                    if (field5364[var8][var9] == null) {
                                        field5364[var8][var9] = new byte[4096];
                                    }
                                    field5364[var8][var9][(63 - var11 << 6) + var10] = var13;
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
                    byte var15 = arg0.method1028(79030408);
                    if (var15 != 0) {
                        arg0.field2295++;
                    }
                    var14++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lnk;)V", line = 1766)
    public static final void method2318(class16 arg0) {
        field5345 = arg0;
        field5344.method769(64);
        int var1 = field5345.method93(-111, "details");
        int[] var2 = field5345.method120(var1, (byte) -127);
        for (int var3 = 0; var3 < var2.length; var3++) {
            field5344.method764(24369, class300.method2116((byte) -124, new class143(field5345.method100(var1, var2[var3], (byte) -107)), var2[var3]), (long) var2[var3]);
        }
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "()Lgj;", line = 1784)
    public static final class257 method2319() {
        int var0 = field5362 - field5366;
        int var1 = field5368 - field5360;
        int var2 = (field5365 - field5367 << 16) / var0;
        int var3 = (field5359 - field5358 << 16) / var1;
        return method2325(var2, var3, 0, 0);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Llf;Z)V", line = 1798)
    public static final void method2320(class143 arg0, boolean arg1) {
        label125: while (true) {
            if (arg0.field2295 < arg0.field2260.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method1043(true) == 1) {
                    var2 = true;
                    var3 = arg0.method1043(true);
                    var4 = arg0.method1043(true);
                }
                int var5 = arg0.method1043(true);
                int var6 = arg0.method1043(true);
                int var7 = var5 * 64 - field5346;
                int var8 = field5350 - (var6 * 64 - field5354) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && var7 + 63 < field5356 && var8 < field5350) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    int var11 = 0;
                    while (true) {
                        if (var11 >= 64) {
                            continue label125;
                        }
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var3 * 8 && var11 < var3 * 8 + 8 && var12 >= var4 * 8 && var12 < var4 * 8 + 8) {
                                int var13 = arg0.method1043(true);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method1043(true);
                                        if (field5357[var9][var10] == null) {
                                            field5357[var9][var10] = new byte[4096];
                                        }
                                        field5357[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method1017((byte) 101);
                                        if (field5370[var9][var10] == null) {
                                            field5370[var9][var10] = new int[4096];
                                        }
                                        field5370[var9][var10][(63 - var12 << 6) + var11] = var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = arg0.method1051(1);
                                        int var17 = arg0.method1043(true);
                                        int var22 = var16 - 1;
                                        class234 var18 = class123.method795(0, var22);
                                        if (var18.field3588 != null) {
                                            var18 = var18.method1624(true);
                                            if (var18 == null || var18.field3547 == -1) {
                                                continue;
                                            }
                                        }
                                        if ((!var18.field3534 || arg1) && var18.field3547 != -1) {
                                            class182 var19 = new class182();
                                            var19.field2735 = var18.field3547;
                                            var19.field2751 = var17;
                                            var19.field2746 = var9 * 64 + var11;
                                            var19.field2740 = var10 * 64 + (64 - var12);
                                            field5352.method2395(16218, var19);
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
                    int var21 = arg0.method1043(true);
                    if (var21 != 0) {
                        if ((var21 & 0x1) == 1) {
                            arg0.field2295++;
                        }
                        if ((var21 & 0x2) == 2) {
                            arg0.field2295 += 2;
                        }
                        if ((var21 & 0x4) == 4) {
                            arg0.field2295 += 3;
                        }
                    }
                    var20++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lng;IIII)V", line = 1933)
    private static final void method2321(class182 arg0, int arg1, int arg2, int arg3, int arg4) {
        arg0.field2747 = ((arg0.field2746 - field5366) * arg1 + arg3 >> 16) + field5367;
        arg0.field2750 = ((arg0.field2740 - field5360) * arg2 + arg4 >> 16) + field5358;
        class103 var5 = class79.method521(arg0.field2735, -113);
        if (var5.field1421 != -1) {
            class149 var6 = var5.method656(true, (byte) 32, false);
            if (var6 != null) {
                if (arg0.field2747 - (var6.field2366 + 1 >> 1) <= field5365 && (var6.field2366 + 1 >> 1) + arg0.field2747 >= field5367 && arg0.field2750 - (var6.field2361 + 1 >> 1) <= field5359 && (var6.field2361 + 1 >> 1) + arg0.field2750 >= field5358) {
                    arg0.field2738 = false;
                } else {
                    arg0.field2738 = true;
                }
                return;
            }
        }
        if (arg0.field2746 >= field5366 && arg0.field2746 <= field5362 && arg0.field2740 >= field5360 && arg0.field2740 <= field5368) {
            arg0.field2738 = false;
        } else {
            arg0.field2738 = true;
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(Llf;)V", line = 1967)
    public static final void method2322(class143 arg0) {
        label83: while (true) {
            if (arg0.field2295 < arg0.field2260.length) {
                boolean var1 = false;
                int var2 = 0;
                int var3 = 0;
                if (arg0.method1043(true) == 1) {
                    var1 = true;
                    var2 = arg0.method1043(true);
                    var3 = arg0.method1043(true);
                }
                int var4 = arg0.method1043(true);
                int var5 = arg0.method1043(true);
                int var6 = var4 * 64 - field5346;
                int var7 = field5350 - (var5 * 64 - field5354) - 1;
                if (var6 >= 0 && var7 - 63 >= 0 && var6 + 63 < field5356 && var7 < field5350) {
                    int var8 = var6 >> 6;
                    int var9 = var7 >> 6;
                    int var10 = 0;
                    while (true) {
                        if (var10 >= 64) {
                            continue label83;
                        }
                        for (int var11 = 0; var11 < 64; var11++) {
                            if (!var1 || var10 >= var2 * 8 && var10 < var2 * 8 + 8 && var11 >= var3 * 8 && var11 < var3 * 8 + 8) {
                                byte var12 = arg0.method1028(79030408);
                                if (var12 != 0) {
                                    if (field5371[var8][var9] == null) {
                                        field5371[var8][var9] = new byte[4096];
                                    }
                                    field5371[var8][var9][(63 - var11 << 6) + var10] = var12;
                                    byte var13 = arg0.method1028(79030408);
                                    if (field5369[var8][var9] == null) {
                                        field5369[var8][var9] = new byte[4096];
                                    }
                                    field5369[var8][var9][(63 - var11 << 6) + var10] = var13;
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
                    byte var15 = arg0.method1028(79030408);
                    if (var15 != 0) {
                        arg0.field2295++;
                    }
                    var14++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)Luc;", line = 2053)
    public static final class212 method2323(int arg0) {
        return (class212) field5344.method770((long) arg0, 56);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIIIII)V", line = 2056)
    public static final void method2324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5366 = arg0;
        field5360 = arg1;
        field5362 = arg2;
        field5368 = arg3;
        field5367 = arg4;
        field5358 = arg5;
        field5365 = arg6;
        field5359 = arg7;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(IIII)Lgj;", line = 2071)
    private static final class257 method2325(int arg0, int arg1, int arg2, int arg3) {
        class257 var4 = new class257();
        for (class182 var5 = (class182) field5352.method2397((byte) 35); var5 != null; var5 = (class182) field5352.method2392((byte) -22)) {
            method2321(var5, arg0, arg1, arg2, arg3);
            var4.method1814(var5, true);
        }
        int[] var6 = new int[3];
        for (int var7 = 0; var7 < field5353.field4701; var7++) {
            class182 var8 = field5353.field4697[var7];
            boolean var9 = field5347.method1479(field5353.field4693[var7] >> 28 & 0x3, field5353.field4693[var7] & 0x3FFF, (byte) -106, var6, field5353.field4693[var7] >> 14 & 0x3FFF);
            if (var9) {
                var8.field2746 = var6[1] - field5346;
                var8.field2740 = field5350 - (var6[2] - field5354) - 1;
                method2321(var8, arg0, arg1, arg2, arg3);
                var4.method1814(var8, true);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "()V", line = 2111)
    public static void method2326() {
        field5345 = null;
        field5344 = null;
        field5347 = null;
        field5353 = null;
        field5352 = null;
        field5363 = (int[][][]) null;
        field5371 = (byte[][][]) null;
        field5369 = (byte[][][]) null;
        field5372 = (byte[][][]) null;
        field5364 = (byte[][][]) null;
        field5357 = (byte[][][]) null;
        field5370 = (int[][][]) null;
        field5361 = null;
    }
}
