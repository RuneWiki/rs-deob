import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class207 {

    @OriginalMember(owner = "client!h", name = "b", descriptor = "Lac;")
    private static class153 field3236 = new class153(16);

    @OriginalMember(owner = "client!h", name = "i", descriptor = "I")
    public static int field3243 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "I")
    public static int field3246 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "Laf;")
    public static class168 field3238 = new class168();

    @OriginalMember(owner = "client!h", name = "j", descriptor = "F")
    public static float field3244;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "F")
    public static float field3245;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!h", name = "y", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!h", name = "z", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "Lai;")
    public static class118 field3239;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "Lvh;")
    public static class49 field3240;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "Lvl;")
    public static class73 field3235;

    @OriginalMember(owner = "client!h", name = "B", descriptor = "[I")
    public static int[] field3262;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "[[[B")
    public static byte[][][] field3253;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "[[[B")
    public static byte[][][] field3254;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "[[[B")
    public static byte[][][] field3255;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "[[[B")
    public static byte[][][] field3256;

    @OriginalMember(owner = "client!h", name = "C", descriptor = "[[[B")
    public static byte[][][] field3263;

    @OriginalMember(owner = "client!h", name = "x", descriptor = "[[[I")
    public static int[][][] field3258;

    @OriginalMember(owner = "client!h", name = "A", descriptor = "[[[I")
    public static int[][][] field3261;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lim;)V")
    public static final void method1425(class170 arg0) {
        while (arg0.field2676 < arg0.field2650.length) {
            boolean var1 = false;
            int var2 = 0;
            int var3 = 0;
            if (arg0.method1218(82) == 1) {
                var1 = true;
                var2 = arg0.method1218(68);
                var3 = arg0.method1218(102);
            }
            int var4 = arg0.method1218(-126);
            int var5 = arg0.method1218(90);
            int var6 = var4 * 64 - field3241;
            int var7 = field3247 - (var5 * 64 - field3237) - 1;
            if (var6 >= 0 && var7 - 63 >= 0 && var6 + 63 < field3242 && var7 < field3247) {
                int var8 = var6 >> 6;
                int var9 = var7 >> 6;
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (!var1 || var10 >= var2 * 8 && var10 < var2 * 8 + 8 && var11 >= var3 * 8 && var11 < var3 * 8 + 8) {
                            byte var12 = arg0.method1215(128);
                            if (var12 != 0) {
                                if (field3263[var8][var9] == null) {
                                    field3263[var8][var9] = new byte[4096];
                                }
                                field3263[var8][var9][(63 - var11 << 6) + var10] = var12;
                                byte var13 = arg0.method1215(128);
                                if (field3254[var8][var9] == null) {
                                    field3254[var8][var9] = new byte[4096];
                                }
                                field3254[var8][var9][(63 - var11 << 6) + var10] = var13;
                            }
                        }
                    }
                }
            } else {
                for (int var14 = 0; var14 < (var1 ? 64 : 4096); var14++) {
                    byte var15 = arg0.method1215(128);
                    if (var15 != 0) {
                        arg0.field2676++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lva;IIII)V")
    private static final void method1426(class138 arg0, int arg1, int arg2, int arg3, int arg4) {
        arg0.field1991 = ((arg0.field1996 - field3252) * arg1 + arg3 >> 16) + field3260;
        arg0.field1989 = ((arg0.field1986 - field3248) * arg2 + arg4 >> 16) + field3259;
        class152 var5 = class136.method863(arg0.field1987, 0);
        if (var5.field2241 != -1) {
            class189 var6 = var5.method1052(-28744, false, true);
            if (var6 != null) {
                if (arg0.field1991 - (var6.field2946 + 1 >> 1) <= field3249 && (var6.field2946 + 1 >> 1) + arg0.field1991 >= field3260 && arg0.field1989 - (var6.field2952 + 1 >> 1) <= field3257 && (var6.field2952 + 1 >> 1) + arg0.field1989 >= field3259) {
                    arg0.field1993 = false;
                    return;
                }
                arg0.field1993 = true;
                return;
            }
        }
        if (arg0.field1996 >= field3252 && arg0.field1996 <= field3250 && arg0.field1986 >= field3248 && arg0.field1986 <= field3251) {
            arg0.field1993 = false;
        } else {
            arg0.field1993 = true;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)Lvh;")
    public static final class49 method1427(int arg0) {
        return (class49) field3236.method1064(-1, (long) arg0);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lim;Z)V")
    public static final void method1428(class170 arg0, boolean arg1) {
        while (arg0.field2676 < arg0.field2650.length) {
            boolean var2 = false;
            int var3 = 0;
            int var4 = 0;
            if (arg0.method1218(112) == 1) {
                var2 = true;
                var3 = arg0.method1218(-35);
                var4 = arg0.method1218(115);
            }
            int var5 = arg0.method1218(122);
            int var6 = arg0.method1218(-66);
            int var7 = var5 * 64 - field3241;
            int var8 = field3247 - (var6 * 64 - field3237) - 1;
            if (var7 >= 0 && var8 - 63 >= 0 && var7 + 63 < field3242 && var8 < field3247) {
                int var9 = var7 >> 6;
                int var10 = var8 >> 6;
                for (int var11 = 0; var11 < 64; var11++) {
                    for (int var12 = 0; var12 < 64; var12++) {
                        if (!var2 || var11 >= var3 * 8 && var11 < var3 * 8 + 8 && var12 >= var4 * 8 && var12 < var4 * 8 + 8) {
                            int var13 = arg0.method1218(63);
                            if (var13 != 0) {
                                if ((var13 & 0x1) == 1) {
                                    int var14 = arg0.method1218(-125);
                                    if (field3253[var9][var10] == null) {
                                        field3253[var9][var10] = new byte[4096];
                                    }
                                    field3253[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                }
                                if ((var13 & 0x2) == 2) {
                                    int var15 = arg0.method1212(460736848);
                                    if (field3258[var9][var10] == null) {
                                        field3258[var9][var10] = new int[4096];
                                    }
                                    field3258[var9][var10][(63 - var12 << 6) + var11] = var15;
                                }
                                if ((var13 & 0x4) == 4) {
                                    int var16 = arg0.method1186((byte) -39);
                                    int var17 = arg0.method1218(91);
                                    int var22 = var16 - 1;
                                    class191 var18 = class128.method822(var22, (byte) 110);
                                    if (var18.field2963 != null) {
                                        var18 = var18.method1340(0);
                                        if (var18 == null || var18.field2970 == -1) {
                                            continue;
                                        }
                                    }
                                    if ((!var18.field2977 || arg1) && var18.field2970 != -1) {
                                        class138 var19 = new class138();
                                        var19.field1987 = var18.field2970;
                                        var19.field1978 = var17;
                                        var19.field1996 = var9 * 64 + var11;
                                        var19.field1986 = var10 * 64 + (64 - var12);
                                        field3238.method1149(4336, var19);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < (var2 ? 64 : 4096); var20++) {
                    int var21 = arg0.method1218(-109);
                    if (var21 != 0) {
                        if ((var21 & 0x1) == 1) {
                            arg0.field2676++;
                        }
                        if ((var21 & 0x2) == 2) {
                            arg0.field2676 += 2;
                        }
                        if ((var21 & 0x4) == 4) {
                            arg0.field2676 += 3;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIII)V")
    private static final void method1429(int arg0, int arg1, int arg2, int arg3) {
        int var4 = field3250 - field3252;
        int var5 = field3251 - field3248;
        if (field3250 < field3242) {
            var4++;
        }
        if (field3251 < field3247) {
            var5++;
        }
        int var10000;
        for (int var6 = 0; var6 < var4; var6++) {
            int var34 = arg0 * var6 + arg2 >> 16;
            int var35 = (var6 + 1) * arg0 + arg2 >> 16;
            int var36 = var35 - var34;
            if (var36 > 0) {
                int var37 = field3252 + var6 >> 6;
                if (var37 >= 0 && var37 <= field3261.length - 1) {
                    int[][] var38 = field3261[var37];
                    byte[][] var39 = field3256[var37];
                    byte[][] var40 = field3255[var37];
                    byte[][] var41 = field3263[var37];
                    byte[][] var42 = field3254[var37];
                    byte[][] var43 = field3253[var37];
                    int var44 = field3260 + var34;
                    int var45 = field3260 + var35;
                    for (int var46 = 0; var46 < var5; var46++) {
                        int var47 = arg1 * var46 + arg3 >> 16;
                        int var48 = (var46 + 1) * arg1 + arg3 >> 16;
                        int var49 = var48 - var47;
                        if (var49 > 0) {
                            int var50 = field3259 + var47;
                            int var51 = field3259 + var48;
                            int var52 = field3248 + var46 >> 6;
                            int var53 = field3248 + var46 & 0x3F;
                            int var54 = field3252 + var6 & 0x3F;
                            int var55 = (var53 << 6) + var54;
                            int var56;
                            if (var52 < 0 || var52 > var38.length - 1 || var38[var52] == null) {
                                if (field3240.field608 != -1) {
                                    var56 = field3240.field608;
                                } else if ((field3252 + var6 & 0x4) == (field3248 + var46 & 0x4)) {
                                    var56 = field3262[class95.field1424 + 1];
                                } else {
                                    var56 = 4936552;
                                }
                                if (var52 < 0 || var52 > var38.length - 1) {
                                    if (var56 == 0) {
                                        var56 = 1;
                                    }
                                    class151.method1026(var44, var50, var36, var49, var56);
                                    continue;
                                }
                            } else {
                                var56 = var38[var52][var55];
                            }
                            if (var56 == 0) {
                                var56 = 1;
                            }
                            int var57 = var39[var52] == null ? 0 : field3262[var39[var52][var55] & 0xFF];
                            int var58 = var41[var52] == null ? 0 : field3262[var41[var52][var55] & 0xFF];
                            if (var57 == 0 && var58 == 0) {
                                class151.method1026(var44, var50, var36, var49, var56);
                            } else {
                                if (var57 != 0) {
                                    if (var57 == -1) {
                                        var57 = 1;
                                    }
                                    byte var59 = var40[var52] == null ? 0 : var40[var52][var55];
                                    int var60 = var59 & 0xFC;
                                    if (var60 == 0 || var36 <= 1 || var49 <= 1) {
                                        class151.method1026(var44, var50, var36, var49, var57);
                                    } else {
                                        method1438(class151.field2226, var44, var50, var56, var57, var36, var49, var60 >> 2, var59 & 0x3, true);
                                    }
                                }
                                if (var58 != 0) {
                                    if (var58 == -1) {
                                        var58 = var56;
                                    }
                                    byte var61 = var42[var52][var55];
                                    int var62 = var61 & 0xFC;
                                    if (var62 == 0 || var36 <= 1 || var49 <= 1) {
                                        class151.method1026(var44, var50, var36, var49, var58);
                                    }
                                    method1438(class151.field2226, var44, var50, 0, var58, var36, var49, var62 >> 2, var61 & 0x3, var57 == 0);
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
                                        class151.method1021(var44, var50, var49, var66);
                                    } else if (var63 == 2) {
                                        class151.method1027(var44, var50, var36, var66);
                                    } else if (var63 == 3) {
                                        class151.method1021(var64, var50, var49, var66);
                                    } else if (var63 == 4) {
                                        class151.method1027(var44, var65, var36, var66);
                                    } else if (var63 == 9) {
                                        class151.method1021(var44, var50, var49, 16777215);
                                        class151.method1027(var44, var50, var36, var66);
                                    } else if (var63 == 10) {
                                        class151.method1021(var64, var50, var49, 16777215);
                                        class151.method1027(var44, var50, var36, var66);
                                    } else if (var63 == 11) {
                                        class151.method1021(var64, var50, var49, 16777215);
                                        class151.method1027(var44, var65, var36, var66);
                                    } else if (var63 == 12) {
                                        class151.method1021(var44, var50, var49, 16777215);
                                        class151.method1027(var44, var65, var36, var66);
                                    } else if (var63 == 17) {
                                        class151.method1027(var44, var50, 1, var66);
                                    } else if (var63 == 18) {
                                        class151.method1027(var64, var50, 1, var66);
                                    } else if (var63 == 19) {
                                        class151.method1027(var64, var65, 1, var66);
                                    } else if (var63 == 20) {
                                        class151.method1027(var44, var65, 1, var66);
                                    } else if (var63 == 25) {
                                        for (int var67 = 0; var67 < var49; var67++) {
                                            class151.method1027(var44 + var67, var65 - var67, 1, var66);
                                        }
                                    } else if (var63 == 26) {
                                        for (int var68 = 0; var68 < var49; var68++) {
                                            class151.method1027(var44 + var68, var50 + var68, 1, var66);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var69 = field3260 + var34;
                    var10000 = field3260 + var35;
                    for (int var71 = 0; var71 < var5; var71++) {
                        int var72 = (arg1 * var71 + arg3 >> 16) + field3259;
                        int var73 = ((var71 + 1) * arg1 + arg3 >> 16) + field3259;
                        int var74 = var73 - var72;
                        int var75;
                        if (field3240.field608 != -1) {
                            var75 = field3240.field608;
                        } else if ((field3252 + var6 & 0x4) == (field3248 + var71 & 0x4)) {
                            var75 = field3262[class95.field1424 + 1];
                        } else {
                            var75 = 4936552;
                        }
                        if (var75 == 0) {
                            var75 = 1;
                        }
                        class151.method1026(var69, var72, var36, var74, var75);
                    }
                }
            }
        }
        for (int var7 = -2; var7 < var4 + 2; var7++) {
            int var8 = arg0 * var7 + arg2 >> 16;
            int var9 = (var7 + 1) * arg0 + arg2 >> 16;
            int var10 = var9 - var8;
            if (var10 > 0) {
                int var11 = field3260 + var8;
                var10000 = field3260 + var9;
                int var13 = field3252 + var7 >> 6;
                if (var13 >= 0 && var13 <= field3258.length - 1) {
                    int[][] var14 = field3258[var13];
                    for (int var15 = -2; var15 < var5 + 2; var15++) {
                        int var16 = arg1 * var15 + arg3 >> 16;
                        int var17 = (var15 + 1) * arg1 + arg3 >> 16;
                        int var18 = var17 - var16;
                        if (var18 > 0) {
                            int var19 = field3259 + var16;
                            var10000 = field3259 + var17;
                            int var21 = field3248 + var15 >> 6;
                            if (var21 >= 0 && var21 <= var14.length - 1) {
                                int var22 = ((field3248 + var15 & 0x3F) << 6) + (field3252 + var7 & 0x3F);
                                if (var14[var21] != null) {
                                    int var23 = var14[var21][var22];
                                    int var24 = var23 & 0x1FFF;
                                    if (var24 != 0) {
                                        class299 var25 = class29.method160(var24 - 1, (byte) -52);
                                        int var26 = var23 >> 13 & 0x3;
                                        boolean var27 = (var23 >> 15 & 0x1) == 1;
                                        class91 var28 = var25.method2012(var26, true, var27);
                                        if (var28 != null) {
                                            int var29 = var28.field2946 * var10 / 4;
                                            int var30 = var28.field2952 * var18 / 4;
                                            if (var25.field4767) {
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
                                                if (var25.field4766 == 0) {
                                                    var28.method623(var11, var19 + var18 - var30, var29, var30);
                                                } else {
                                                    var28.method615(var11, var19 + var18 - var30, var29, var30, var25.field4766);
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

    @OriginalMember(owner = "client!h", name = "a", descriptor = "()V")
    public static final void method1430() {
        int var0 = field3250 - field3252;
        int var1 = field3251 - field3248;
        int var2 = (field3249 - field3260 << 16) / var0;
        int var3 = (field3257 - field3259 << 16) / var1;
        method1429(var2, var3, 0, 0);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lvl;)V")
    public static final void method1431(class73 arg0) {
        field3235 = arg0;
        field3236.method1057(111);
        int var1 = field3235.method498(0, "details");
        int[] var2 = field3235.method480(0, var1);
        for (int var3 = 0; var3 < var2.length; var3++) {
            field3236.method1054(-3510, class27.method138(var2[var3], -8668, new class170(field3235.method501(-2, var2[var3], var1))), (long) var2[var3]);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Laf;")
    public static final class168 method1432(int arg0, int arg1) {
        class168 var2 = new class168();
        for (class49 var3 = (class49) field3236.method1065((byte) -59); var3 != null; var3 = (class49) field3236.method1066(-123)) {
            if (var3.field611 && var3.method305(true, arg1, arg0)) {
                var2.method1149(4336, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(II)Lvh;")
    public static final class49 method1433(int arg0, int arg1) {
        for (class49 var2 = (class49) field3236.method1065((byte) -59); var2 != null; var2 = (class49) field3236.method1066(-123)) {
            if (var2.field611 && var2.method305(true, arg1, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(II)V")
    public static final void method1434(int arg0, int arg1) {
        for (int var2 = 0; var2 < class181.field2859; var2++) {
            class108 var3 = class139.method879((byte) 57, var2);
            if (var3 != null) {
                int var4 = var3.field1565;
                if (var4 >= 0 && !class221.field3464.method579(127, var4)) {
                    var4 = -1;
                }
                int var8;
                if (var3.field1571 >= 0) {
                    int var5 = var3.field1571;
                    int var6 = (var5 & 0x7F) + arg1;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 127) {
                        var6 = 127;
                    }
                    int var7 = (arg0 + var5 & 0xFC00) + (var5 & 0x380) + var6;
                    var8 = class221.field3467[class271.method1889(96, 255, var7)];
                } else if (var4 >= 0) {
                    var8 = class221.field3467[class271.method1889(96, 255, class221.field3464.method577((byte) 127, var4))];
                } else if (var3.field1572 == -1) {
                    var8 = -1;
                } else {
                    int var9 = var3.field1572;
                    int var10 = (var9 & 0x7F) + arg1;
                    if (var10 < 0) {
                        var10 = 0;
                    } else if (var10 > 127) {
                        var10 = 127;
                    }
                    int var11 = (arg0 + var9 & 0xFC00) + (var9 & 0x380) + var10;
                    var8 = class221.field3467[class271.method1889(96, 255, var11)];
                }
                field3262[var2 + 1] = var8;
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1435(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3252 = arg0;
        field3248 = arg1;
        field3250 = arg2;
        field3251 = arg3;
        field3260 = arg4;
        field3259 = arg5;
        field3249 = arg6;
        field3257 = arg7;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(Lim;)V")
    public static final void method1436(class170 arg0) {
        while (arg0.field2676 < arg0.field2650.length) {
            boolean var1 = false;
            int var2 = 0;
            int var3 = 0;
            if (arg0.method1218(-79) == 1) {
                var1 = true;
                var2 = arg0.method1218(121);
                var3 = arg0.method1218(-76);
            }
            int var4 = arg0.method1218(-95);
            int var5 = arg0.method1218(-68);
            int var6 = var4 * 64 - field3241;
            int var7 = field3247 - (var5 * 64 - field3237) - 1;
            if (var6 >= 0 && var7 - 63 >= 0 && var6 + 63 < field3242 && var7 < field3247) {
                int var8 = var6 >> 6;
                int var9 = var7 >> 6;
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (!var1 || var10 >= var2 * 8 && var10 < var2 * 8 + 8 && var11 >= var3 * 8 && var11 < var3 * 8 + 8) {
                            byte var12 = arg0.method1215(128);
                            if (var12 != 0) {
                                if (field3256[var8][var9] == null) {
                                    field3256[var8][var9] = new byte[4096];
                                }
                                field3256[var8][var9][(63 - var11 << 6) + var10] = var12;
                                byte var13 = arg0.method1215(128);
                                if (field3255[var8][var9] == null) {
                                    field3255[var8][var9] = new byte[4096];
                                }
                                field3255[var8][var9][(63 - var11 << 6) + var10] = var13;
                            }
                        }
                    }
                }
            } else {
                for (int var14 = 0; var14 < (var1 ? 64 : 4096); var14++) {
                    byte var15 = arg0.method1215(128);
                    if (var15 != 0) {
                        arg0.field2676++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "()V")
    public static final void method1437() {
        for (int var0 = 0; var0 < field3239.field1698; var0++) {
            if (field3239.field1711[var0] != null) {
                field3238.method1149(4336, field3239.field1711[var0]);
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([IIIIIIIIIZ)V")
    private static final void method1438(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        int var10 = arg1;
        if (arg1 >= class151.field2228) {
            return;
        }
        if (arg1 < class151.field2227) {
            var10 = class151.field2227;
        }
        int var11 = arg1 + arg5;
        if (var11 <= class151.field2227) {
            return;
        }
        if (var11 > class151.field2228) {
            var11 = class151.field2228;
        }
        int var12 = arg2;
        if (arg2 >= class151.field2229) {
            return;
        }
        if (arg2 < class151.field2230) {
            var12 = class151.field2230;
        }
        int var13 = arg2 + arg6;
        if (var13 <= class151.field2230) {
            return;
        }
        if (var13 > class151.field2229) {
            var13 = class151.field2229;
        }
        int var14 = class151.field2225 * var12 + var10;
        int var15 = class151.field2225 + var10 - var11;
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

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(IIII)Lol;")
    private static final class220 method1439(int arg0, int arg1, int arg2, int arg3) {
        class220 var4 = new class220();
        for (class138 var5 = (class138) field3238.method1146(-13); var5 != null; var5 = (class138) field3238.method1148((byte) 113)) {
            method1426(var5, arg0, arg1, arg2, arg3);
            var4.method1540(var5, (byte) -85);
        }
        int[] var6 = new int[3];
        for (int var7 = 0; var7 < field3239.field1698; var7++) {
            class138 var8 = field3239.field1711[var7];
            boolean var9 = field3240.method300(field3239.field1700[var7] >> 14 & 0x3FFF, field3239.field1700[var7] & 0x3FFF, (byte) -52, field3239.field1700[var7] >> 28 & 0x3, var6);
            if (var9) {
                var8.field1996 = var6[1] - field3241;
                var8.field1986 = field3247 - (var6[2] - field3237) - 1;
                method1426(var8, arg0, arg1, arg2, arg3);
                var4.method1540(var8, (byte) -50);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "()V")
    public static void method1440() {
        field3235 = null;
        field3236 = null;
        field3240 = null;
        field3239 = null;
        field3238 = null;
        field3261 = null;
        field3256 = null;
        field3255 = null;
        field3263 = null;
        field3254 = null;
        field3253 = null;
        field3258 = null;
        field3262 = null;
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "()Lol;")
    public static final class220 method1441() {
        int var0 = field3250 - field3252;
        int var1 = field3251 - field3248;
        int var2 = (field3249 - field3260 << 16) / var0;
        int var3 = (field3257 - field3259 << 16) / var1;
        return method1439(var2, var3, 0, 0);
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V")
    public static final void method1442(int arg0) {
        field3240 = (class49) field3236.method1064(-1, (long) arg0);
    }
}
