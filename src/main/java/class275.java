import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class275 {

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "Lhb;")
    private static class155 field4406 = new class155(16);

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    public static int field4414 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public static int field4415 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "Loe;")
    public static class57 field4411 = new class57();

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "F")
    public static float field4409;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "F")
    public static float field4418;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!gk", name = "C", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "Ldk;")
    public static class251 field4407;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "Lem;")
    public static class292 field4410;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "Ldd;")
    public static class77 field4417;

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "[I")
    public static int[] field4431;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "[[[B")
    public static byte[][][] field4419;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "[[[B")
    public static byte[][][] field4421;

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "[[[B")
    public static byte[][][] field4426;

    @OriginalMember(owner = "client!gk", name = "A", descriptor = "[[[B")
    public static byte[][][] field4432;

    @OriginalMember(owner = "client!gk", name = "B", descriptor = "[[[B")
    public static byte[][][] field4433;

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "[[[I")
    public static int[][][] field4429;

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "[[[I")
    public static int[][][] field4430;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "()V")
    public static void method1839() {
        field4407 = null;
        field4406 = null;
        field4417 = null;
        field4410 = null;
        field4411 = null;
        field4430 = null;
        field4426 = null;
        field4432 = null;
        field4419 = null;
        field4433 = null;
        field4421 = null;
        field4429 = null;
        field4431 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIII)Loj;")
    private static final class246 method1840(int arg0, int arg1, int arg2, int arg3) {
        class246 var4 = new class246();
        for (class269 var5 = (class269) field4411.method389(0); var5 != null; var5 = (class269) field4411.method396(0)) {
            method1849(var5, arg0, arg1, arg2, arg3);
            var4.method1646(true, var5);
        }
        int[] var6 = new int[3];
        for (int var7 = 0; var7 < field4410.field4681; var7++) {
            class269 var8 = field4410.field4686[var7];
            boolean var9 = field4417.method520(var6, field4410.field4685[var7] >> 28 & 0x3, field4410.field4685[var7] >> 14 & 0x3FFF, 113, field4410.field4685[var7] & 0x3FFF);
            if (var9) {
                var8.field4334 = var6[1] - field4412;
                var8.field4328 = field4416 - (var6[2] - field4413) - 1;
                method1849(var8, arg0, arg1, arg2, arg3);
                var4.method1646(true, var8);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)Ldd;")
    public static final class77 method1841(int arg0, int arg1) {
        for (class77 var2 = (class77) field4406.method1063(-106); var2 != null; var2 = (class77) field4406.method1055(18178)) {
            if (var2.field1285 && var2.method525((byte) -24, arg1, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(IIII)V")
    private static final void method1842(int arg0, int arg1, int arg2, int arg3) {
        int var4 = field4422 - field4427;
        int var5 = field4425 - field4428;
        if (field4422 < field4408) {
            var4++;
        }
        if (field4425 < field4416) {
            var5++;
        }
        int var10000;
        for (int var6 = 0; var6 < var4; var6++) {
            int var34 = arg0 * var6 + arg2 >> 16;
            int var35 = (var6 + 1) * arg0 + arg2 >> 16;
            int var36 = var35 - var34;
            if (var36 > 0) {
                int var37 = field4427 + var6 >> 6;
                if (var37 >= 0 && var37 <= field4430.length - 1) {
                    int[][] var38 = field4430[var37];
                    byte[][] var39 = field4426[var37];
                    byte[][] var40 = field4432[var37];
                    byte[][] var41 = field4419[var37];
                    byte[][] var42 = field4433[var37];
                    byte[][] var43 = field4421[var37];
                    int var44 = field4420 + var34;
                    int var45 = field4420 + var35;
                    for (int var46 = 0; var46 < var5; var46++) {
                        int var47 = arg1 * var46 + arg3 >> 16;
                        int var48 = (var46 + 1) * arg1 + arg3 >> 16;
                        int var49 = var48 - var47;
                        if (var49 > 0) {
                            int var50 = field4424 + var47;
                            int var51 = field4424 + var48;
                            int var52 = field4428 + var46 >> 6;
                            int var53 = field4428 + var46 & 0x3F;
                            int var54 = field4427 + var6 & 0x3F;
                            int var55 = (var53 << 6) + var54;
                            int var56;
                            if (var52 < 0 || var52 > var38.length - 1 || var38[var52] == null) {
                                if (field4417.field1269 != -1) {
                                    var56 = field4417.field1269;
                                } else if ((field4428 + var46 & 0x4) == (field4427 + var6 & 0x4)) {
                                    var56 = field4431[class173.field2832 + 1];
                                } else {
                                    var56 = 4936552;
                                }
                                if (var52 < 0 || var52 > var38.length - 1) {
                                    if (var56 == 0) {
                                        var56 = 1;
                                    }
                                    class127.method886(var44, var50, var36, var49, var56);
                                    continue;
                                }
                            } else {
                                var56 = var38[var52][var55];
                            }
                            if (var56 == 0) {
                                var56 = 1;
                            }
                            int var57 = var39[var52] == null ? 0 : field4431[var39[var52][var55] & 0xFF];
                            int var58 = var41[var52] == null ? 0 : field4431[var41[var52][var55] & 0xFF];
                            if (var57 == 0 && var58 == 0) {
                                class127.method886(var44, var50, var36, var49, var56);
                            } else {
                                if (var57 != 0) {
                                    if (var57 == -1) {
                                        var57 = 1;
                                    }
                                    byte var59 = var40[var52] == null ? 0 : var40[var52][var55];
                                    int var60 = var59 & 0xFC;
                                    if (var60 == 0 || var36 <= 1 || var49 <= 1) {
                                        class127.method886(var44, var50, var36, var49, var57);
                                    } else {
                                        method1846(class127.field2007, var44, var50, var56, var57, var36, var49, var60 >> 2, var59 & 0x3, true);
                                    }
                                }
                                if (var58 != 0) {
                                    if (var58 == -1) {
                                        var58 = var56;
                                    }
                                    byte var61 = var42[var52][var55];
                                    int var62 = var61 & 0xFC;
                                    if (var62 == 0 || var36 <= 1 || var49 <= 1) {
                                        class127.method886(var44, var50, var36, var49, var58);
                                    }
                                    method1846(class127.field2007, var44, var50, 0, var58, var36, var49, var62 >> 2, var61 & 0x3, var57 == 0);
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
                                        class127.method900(var44, var50, var49, var66);
                                    } else if (var63 == 2) {
                                        class127.method905(var44, var50, var36, var66);
                                    } else if (var63 == 3) {
                                        class127.method900(var64, var50, var49, var66);
                                    } else if (var63 == 4) {
                                        class127.method905(var44, var65, var36, var66);
                                    } else if (var63 == 9) {
                                        class127.method900(var44, var50, var49, 16777215);
                                        class127.method905(var44, var50, var36, var66);
                                    } else if (var63 == 10) {
                                        class127.method900(var64, var50, var49, 16777215);
                                        class127.method905(var44, var50, var36, var66);
                                    } else if (var63 == 11) {
                                        class127.method900(var64, var50, var49, 16777215);
                                        class127.method905(var44, var65, var36, var66);
                                    } else if (var63 == 12) {
                                        class127.method900(var44, var50, var49, 16777215);
                                        class127.method905(var44, var65, var36, var66);
                                    } else if (var63 == 17) {
                                        class127.method905(var44, var50, 1, var66);
                                    } else if (var63 == 18) {
                                        class127.method905(var64, var50, 1, var66);
                                    } else if (var63 == 19) {
                                        class127.method905(var64, var65, 1, var66);
                                    } else if (var63 == 20) {
                                        class127.method905(var44, var65, 1, var66);
                                    } else if (var63 == 25) {
                                        for (int var67 = 0; var67 < var49; var67++) {
                                            class127.method905(var44 + var67, var65 - var67, 1, var66);
                                        }
                                    } else if (var63 == 26) {
                                        for (int var68 = 0; var68 < var49; var68++) {
                                            class127.method905(var44 + var68, var50 + var68, 1, var66);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var69 = field4420 + var34;
                    var10000 = field4420 + var35;
                    for (int var71 = 0; var71 < var5; var71++) {
                        int var72 = (arg1 * var71 + arg3 >> 16) + field4424;
                        int var73 = ((var71 + 1) * arg1 + arg3 >> 16) + field4424;
                        int var74 = var73 - var72;
                        int var75;
                        if (field4417.field1269 != -1) {
                            var75 = field4417.field1269;
                        } else if ((field4428 + var71 & 0x4) == (field4427 + var6 & 0x4)) {
                            var75 = field4431[class173.field2832 + 1];
                        } else {
                            var75 = 4936552;
                        }
                        if (var75 == 0) {
                            var75 = 1;
                        }
                        class127.method886(var69, var72, var36, var74, var75);
                    }
                }
            }
        }
        for (int var7 = -2; var7 < var4 + 2; var7++) {
            int var8 = arg0 * var7 + arg2 >> 16;
            int var9 = (var7 + 1) * arg0 + arg2 >> 16;
            int var10 = var9 - var8;
            if (var10 > 0) {
                int var11 = field4420 + var8;
                var10000 = field4420 + var9;
                int var13 = field4427 + var7 >> 6;
                if (var13 >= 0 && var13 <= field4429.length - 1) {
                    int[][] var14 = field4429[var13];
                    for (int var15 = -2; var15 < var5 + 2; var15++) {
                        int var16 = arg1 * var15 + arg3 >> 16;
                        int var17 = (var15 + 1) * arg1 + arg3 >> 16;
                        int var18 = var17 - var16;
                        if (var18 > 0) {
                            int var19 = field4424 + var16;
                            var10000 = field4424 + var17;
                            int var21 = field4428 + var15 >> 6;
                            if (var21 >= 0 && var21 <= var14.length - 1) {
                                int var22 = ((field4428 + var15 & 0x3F) << 6) + (field4427 + var7 & 0x3F);
                                if (var14[var21] != null) {
                                    int var23 = var14[var21][var22];
                                    int var24 = var23 & 0x1FFF;
                                    if (var24 != 0) {
                                        class285 var25 = class268.method1804(34, var24 - 1);
                                        int var26 = var23 >> 13 & 0x3;
                                        boolean var27 = (var23 >> 15 & 0x1) == 1;
                                        class260 var28 = var25.method1900(460066352, var26, var27);
                                        if (var28 != null) {
                                            int var29 = var28.field3603 * var10 / 4;
                                            int var30 = var28.field3605 * var18 / 4;
                                            if (var25.field4518) {
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
                                                if (var25.field4522 == 0) {
                                                    var28.method1746(var11, var19 + var18 - var30, var29, var30);
                                                } else {
                                                    var28.method1744(var11, var19 + var18 - var30, var29, var30, var25.field4522);
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

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)Loe;")
    public static final class57 method1843(int arg0, int arg1) {
        class57 var2 = new class57();
        for (class77 var3 = (class77) field4406.method1063(-101); var3 != null; var3 = (class77) field4406.method1055(18178)) {
            if (var3.field1285 && var3.method525((byte) -24, arg1, arg0)) {
                var2.method395(30985, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "()V")
    public static final void method1844() {
        int var0 = field4422 - field4427;
        int var1 = field4425 - field4428;
        int var2 = (field4423 - field4420 << 16) / var0;
        int var3 = (field4434 - field4424 << 16) / var1;
        method1842(var2, var3, 0, 0);
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(II)V")
    public static final void method1845(int arg0, int arg1) {
        for (int var2 = 0; var2 < class156.field2442; var2++) {
            class205 var3 = class26.method149((byte) 65, var2);
            if (var3 != null) {
                int var4 = var3.field3263;
                if (var4 >= 0 && !class302.field4828.method107(97, var4)) {
                    var4 = -1;
                }
                int var8;
                if (var3.field3268 >= 0) {
                    int var5 = var3.field3268;
                    int var6 = (var5 & 0x7F) + arg1;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 127) {
                        var6 = 127;
                    }
                    int var7 = (arg0 + var5 & 0xFC00) + (var5 & 0x380) + var6;
                    var8 = class302.field4819[class41.method271(96, var7, -110)];
                } else if (var4 >= 0) {
                    var8 = class302.field4819[class41.method271(96, class302.field4828.method113(var4, (byte) -120), -114)];
                } else if (var3.field3259 == -1) {
                    var8 = -1;
                } else {
                    int var9 = var3.field3259;
                    int var10 = (var9 & 0x7F) + arg1;
                    if (var10 < 0) {
                        var10 = 0;
                    } else if (var10 > 127) {
                        var10 = 127;
                    }
                    int var11 = (arg0 + var9 & 0xFC00) + (var9 & 0x380) + var10;
                    var8 = class302.field4819[class41.method271(96, var11, -91)];
                }
                field4431[var2 + 1] = var8;
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([IIIIIIIIIZ)V")
    private static final void method1846(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        int var10 = arg1;
        if (arg1 >= class127.field2009) {
            return;
        }
        if (arg1 < class127.field2004) {
            var10 = class127.field2004;
        }
        int var11 = arg1 + arg5;
        if (var11 <= class127.field2004) {
            return;
        }
        if (var11 > class127.field2009) {
            var11 = class127.field2009;
        }
        int var12 = arg2;
        if (arg2 >= class127.field2008) {
            return;
        }
        if (arg2 < class127.field2003) {
            var12 = class127.field2003;
        }
        int var13 = arg2 + arg6;
        if (var13 <= class127.field2003) {
            return;
        }
        if (var13 > class127.field2008) {
            var13 = class127.field2008;
        }
        int var14 = class127.field2006 * var12 + var10;
        int var15 = class127.field2006 + var10 - var11;
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

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "()V")
    public static final void method1847() {
        for (int var0 = 0; var0 < field4410.field4681; var0++) {
            if (field4410.field4686[var0] != null) {
                field4411.method395(30985, field4410.field4686[var0]);
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1848(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4427 = arg0;
        field4428 = arg1;
        field4422 = arg2;
        field4425 = arg3;
        field4420 = arg4;
        field4424 = arg5;
        field4423 = arg6;
        field4434 = arg7;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljh;IIII)V")
    private static final void method1849(class269 arg0, int arg1, int arg2, int arg3, int arg4) {
        arg0.field4327 = ((arg0.field4334 - field4427) * arg1 + arg3 >> 16) + field4420;
        arg0.field4335 = ((arg0.field4328 - field4428) * arg2 + arg4 >> 16) + field4424;
        class50 var5 = class49.method346(arg0.field4333, (byte) 112);
        if (var5.field831 != -1) {
            class220 var6 = var5.method351(true, false, 101);
            if (var6 != null) {
                if (arg0.field4327 - (var6.field3603 + 1 >> 1) <= field4423 && (var6.field3603 + 1 >> 1) + arg0.field4327 >= field4420 && arg0.field4335 - (var6.field3605 + 1 >> 1) <= field4434 && (var6.field3605 + 1 >> 1) + arg0.field4335 >= field4424) {
                    arg0.field4331 = false;
                    return;
                }
                arg0.field4331 = true;
                return;
            }
        }
        if (arg0.field4334 >= field4427 && arg0.field4334 <= field4422 && arg0.field4328 >= field4428 && arg0.field4328 <= field4425) {
            arg0.field4331 = false;
        } else {
            arg0.field4331 = true;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lwd;Z)V")
    public static final void method1850(class162 arg0, boolean arg1) {
        while (arg0.field2568 < arg0.field2573.length) {
            boolean var2 = false;
            int var3 = 0;
            int var4 = 0;
            if (arg0.method1133((byte) 53) == 1) {
                var2 = true;
                var3 = arg0.method1133((byte) 53);
                var4 = arg0.method1133((byte) 53);
            }
            int var5 = arg0.method1133((byte) 53);
            int var6 = arg0.method1133((byte) 53);
            int var7 = var5 * 64 - field4412;
            int var8 = field4416 - (var6 * 64 - field4413) - 1;
            if (var7 >= 0 && var8 - 63 >= 0 && var7 + 63 < field4408 && var8 < field4416) {
                int var9 = var7 >> 6;
                int var10 = var8 >> 6;
                for (int var11 = 0; var11 < 64; var11++) {
                    for (int var12 = 0; var12 < 64; var12++) {
                        if (!var2 || var11 >= var3 * 8 && var11 < var3 * 8 + 8 && var12 >= var4 * 8 && var12 < var4 * 8 + 8) {
                            int var13 = arg0.method1133((byte) 53);
                            if (var13 != 0) {
                                if ((var13 & 0x1) == 1) {
                                    int var14 = arg0.method1133((byte) 53);
                                    if (field4421[var9][var10] == null) {
                                        field4421[var9][var10] = new byte[4096];
                                    }
                                    field4421[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                }
                                if ((var13 & 0x2) == 2) {
                                    int var15 = arg0.method1137(31155);
                                    if (field4429[var9][var10] == null) {
                                        field4429[var9][var10] = new int[4096];
                                    }
                                    field4429[var9][var10][(63 - var12 << 6) + var11] = var15;
                                }
                                if ((var13 & 0x4) == 4) {
                                    int var16 = arg0.method1142(-18970);
                                    int var17 = arg0.method1133((byte) 53);
                                    int var22 = var16 - 1;
                                    class158 var18 = class5.method29(var22, true);
                                    if (var18.field2448 != null) {
                                        var18 = var18.method1077(-6291);
                                        if (var18 == null || var18.field2509 == -1) {
                                            continue;
                                        }
                                    }
                                    if ((!var18.field2479 || arg1) && var18.field2509 != -1) {
                                        class269 var19 = new class269();
                                        var19.field4333 = var18.field2509;
                                        var19.field4337 = var17;
                                        var19.field4334 = var9 * 64 + var11;
                                        var19.field4328 = var10 * 64 + (64 - var12);
                                        field4411.method395(30985, var19);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < (var2 ? 64 : 4096); var20++) {
                    int var21 = arg0.method1133((byte) 53);
                    if (var21 != 0) {
                        if ((var21 & 0x1) == 1) {
                            arg0.field2568++;
                        }
                        if ((var21 & 0x2) == 2) {
                            arg0.field2568 += 2;
                        }
                        if ((var21 & 0x4) == 4) {
                            arg0.field2568 += 3;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "()Loj;")
    public static final class246 method1851() {
        int var0 = field4422 - field4427;
        int var1 = field4425 - field4428;
        int var2 = (field4423 - field4420 << 16) / var0;
        int var3 = (field4434 - field4424 << 16) / var1;
        return method1840(var2, var3, 0, 0);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ldk;)V")
    public static final void method1852(class251 arg0) {
        field4407 = arg0;
        field4406.method1056(-87);
        int var1 = field4407.method1699(0, "details");
        int[] var2 = field4407.method1688(true, var1);
        for (int var3 = 0; var3 < var2.length; var3++) {
            field4406.method1052((long) var2[var3], (byte) -65, class305.method2038(119, var2[var3], new class162(field4407.method1680(var2[var3], var1, -127))));
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    public static final void method1853(int arg0) {
        field4417 = (class77) field4406.method1059(0, (long) arg0);
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)Ldd;")
    public static final class77 method1854(int arg0) {
        return (class77) field4406.method1059(0, (long) arg0);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lwd;)V")
    public static final void method1855(class162 arg0) {
        while (arg0.field2568 < arg0.field2573.length) {
            boolean var1 = false;
            int var2 = 0;
            int var3 = 0;
            if (arg0.method1133((byte) 53) == 1) {
                var1 = true;
                var2 = arg0.method1133((byte) 53);
                var3 = arg0.method1133((byte) 53);
            }
            int var4 = arg0.method1133((byte) 53);
            int var5 = arg0.method1133((byte) 53);
            int var6 = var4 * 64 - field4412;
            int var7 = field4416 - (var5 * 64 - field4413) - 1;
            if (var6 >= 0 && var7 - 63 >= 0 && var6 + 63 < field4408 && var7 < field4416) {
                int var8 = var6 >> 6;
                int var9 = var7 >> 6;
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (!var1 || var10 >= var2 * 8 && var10 < var2 * 8 + 8 && var11 >= var3 * 8 && var11 < var3 * 8 + 8) {
                            byte var12 = arg0.method1107((byte) -92);
                            if (var12 != 0) {
                                if (field4419[var8][var9] == null) {
                                    field4419[var8][var9] = new byte[4096];
                                }
                                field4419[var8][var9][(63 - var11 << 6) + var10] = var12;
                                byte var13 = arg0.method1107((byte) -91);
                                if (field4433[var8][var9] == null) {
                                    field4433[var8][var9] = new byte[4096];
                                }
                                field4433[var8][var9][(63 - var11 << 6) + var10] = var13;
                            }
                        }
                    }
                }
            } else {
                for (int var14 = 0; var14 < (var1 ? 64 : 4096); var14++) {
                    byte var15 = arg0.method1107((byte) -84);
                    if (var15 != 0) {
                        arg0.field2568++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(Lwd;)V")
    public static final void method1856(class162 arg0) {
        while (arg0.field2568 < arg0.field2573.length) {
            boolean var1 = false;
            int var2 = 0;
            int var3 = 0;
            if (arg0.method1133((byte) 53) == 1) {
                var1 = true;
                var2 = arg0.method1133((byte) 53);
                var3 = arg0.method1133((byte) 53);
            }
            int var4 = arg0.method1133((byte) 53);
            int var5 = arg0.method1133((byte) 53);
            int var6 = var4 * 64 - field4412;
            int var7 = field4416 - (var5 * 64 - field4413) - 1;
            if (var6 >= 0 && var7 - 63 >= 0 && var6 + 63 < field4408 && var7 < field4416) {
                int var8 = var6 >> 6;
                int var9 = var7 >> 6;
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (!var1 || var10 >= var2 * 8 && var10 < var2 * 8 + 8 && var11 >= var3 * 8 && var11 < var3 * 8 + 8) {
                            byte var12 = arg0.method1107((byte) -78);
                            if (var12 != 0) {
                                if (field4426[var8][var9] == null) {
                                    field4426[var8][var9] = new byte[4096];
                                }
                                field4426[var8][var9][(63 - var11 << 6) + var10] = var12;
                                byte var13 = arg0.method1107((byte) -75);
                                if (field4432[var8][var9] == null) {
                                    field4432[var8][var9] = new byte[4096];
                                }
                                field4432[var8][var9][(63 - var11 << 6) + var10] = var13;
                            }
                        }
                    }
                }
            } else {
                for (int var14 = 0; var14 < (var1 ? 64 : 4096); var14++) {
                    byte var15 = arg0.method1107((byte) -103);
                    if (var15 != 0) {
                        arg0.field2568++;
                    }
                }
            }
        }
    }
}
