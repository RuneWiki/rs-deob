import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class262 {

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "Li;")
    private static class58 field4267 = new class58(16);

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
    public static int field4274 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field4271 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "Lja;")
    public static class61 field4272 = new class61();

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "F")
    public static float field4269;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "F")
    public static float field4270;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
    public static int field4290;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "Lgi;")
    public static class164 field4266;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "Lnf;")
    public static class166 field4273;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "Lda;")
    public static class198 field4268;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "[I")
    public static int[] field4284;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "[[[B")
    public static byte[][][] field4283;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "[[[B")
    public static byte[][][] field4287;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "[[[B")
    public static byte[][][] field4288;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "[[[B")
    public static byte[][][] field4289;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "[[[B")
    public static byte[][][] field4292;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "[[[I")
    public static int[][][] field4282;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "[[[I")
    public static int[][][] field4286;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "()V")
    public static final void method1752() {
        for (int var0 = 0; var0 < field4268.field3189; var0++) {
            if (field4268.field3187[var0] != null) {
                field4272.method388(field4268.field3187[var0], false);
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "()Lnb;")
    public static final class223 method1753() {
        int var0 = field4280 - field4290;
        int var1 = field4281 - field4294;
        int var2 = (field4293 - field4285 << 16) / var0;
        int var3 = (field4279 - field4291 << 16) / var1;
        return method1757(var2, var3, 0, 0);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)V")
    private static final void method1754(int arg0, int arg1, int arg2, int arg3) {
        int var4 = field4280 - field4290;
        int var5 = field4281 - field4294;
        if (field4280 < field4277) {
            var4++;
        }
        if (field4281 < field4278) {
            var5++;
        }
        int var10000;
        for (int var6 = 0; var6 < var4; var6++) {
            int var34 = arg0 * var6 + arg2 >> 16;
            int var35 = (var6 + 1) * arg0 + arg2 >> 16;
            int var36 = var35 - var34;
            if (var36 > 0) {
                int var37 = field4290 + var6 >> 6;
                if (var37 >= 0 && var37 <= field4286.length - 1) {
                    int[][] var38 = field4286[var37];
                    byte[][] var39 = field4292[var37];
                    byte[][] var40 = field4283[var37];
                    byte[][] var41 = field4287[var37];
                    byte[][] var42 = field4289[var37];
                    byte[][] var43 = field4288[var37];
                    int var44 = field4285 + var34;
                    int var45 = field4285 + var35;
                    for (int var46 = 0; var46 < var5; var46++) {
                        int var47 = arg1 * var46 + arg3 >> 16;
                        int var48 = (var46 + 1) * arg1 + arg3 >> 16;
                        int var49 = var48 - var47;
                        if (var49 > 0) {
                            int var50 = field4291 + var47;
                            int var51 = field4291 + var48;
                            int var52 = field4294 + var46 >> 6;
                            int var53 = field4294 + var46 & 0x3F;
                            int var54 = field4290 + var6 & 0x3F;
                            int var55 = (var53 << 6) + var54;
                            int var56;
                            if (var52 < 0 || var52 > var38.length - 1 || var38[var52] == null) {
                                if (field4273.field2742 != -1) {
                                    var56 = field4273.field2742;
                                } else if ((field4294 + var46 & 0x4) == (field4290 + var6 & 0x4)) {
                                    var56 = field4284[class195.field3160 + 1];
                                } else {
                                    var56 = 4936552;
                                }
                                if (var52 < 0 || var52 > var38.length - 1) {
                                    if (var56 == 0) {
                                        var56 = 1;
                                    }
                                    class94.method660(var44, var50, var36, var49, var56);
                                    continue;
                                }
                            } else {
                                var56 = var38[var52][var55];
                            }
                            if (var56 == 0) {
                                var56 = 1;
                            }
                            int var57 = var39[var52] == null ? 0 : field4284[var39[var52][var55] & 0xFF];
                            int var58 = var41[var52] == null ? 0 : field4284[var41[var52][var55] & 0xFF];
                            if (var57 == 0 && var58 == 0) {
                                class94.method660(var44, var50, var36, var49, var56);
                            } else {
                                if (var57 != 0) {
                                    if (var57 == -1) {
                                        var57 = 1;
                                    }
                                    byte var59 = var40[var52] == null ? 0 : var40[var52][var55];
                                    int var60 = var59 & 0xFC;
                                    if (var60 == 0 || var36 <= 1 || var49 <= 1) {
                                        class94.method660(var44, var50, var36, var49, var57);
                                    } else {
                                        method1761(class94.field1495, var44, var50, var56, var57, var36, var49, var60 >> 2, var59 & 0x3, true);
                                    }
                                }
                                if (var58 != 0) {
                                    if (var58 == -1) {
                                        var58 = var56;
                                    }
                                    byte var61 = var42[var52][var55];
                                    int var62 = var61 & 0xFC;
                                    if (var62 == 0 || var36 <= 1 || var49 <= 1) {
                                        class94.method660(var44, var50, var36, var49, var58);
                                    }
                                    method1761(class94.field1495, var44, var50, 0, var58, var36, var49, var62 >> 2, var61 & 0x3, var57 == 0);
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
                                        class94.method663(var44, var50, var49, var66);
                                    } else if (var63 == 2) {
                                        class94.method675(var44, var50, var36, var66);
                                    } else if (var63 == 3) {
                                        class94.method663(var64, var50, var49, var66);
                                    } else if (var63 == 4) {
                                        class94.method675(var44, var65, var36, var66);
                                    } else if (var63 == 9) {
                                        class94.method663(var44, var50, var49, 16777215);
                                        class94.method675(var44, var50, var36, var66);
                                    } else if (var63 == 10) {
                                        class94.method663(var64, var50, var49, 16777215);
                                        class94.method675(var44, var50, var36, var66);
                                    } else if (var63 == 11) {
                                        class94.method663(var64, var50, var49, 16777215);
                                        class94.method675(var44, var65, var36, var66);
                                    } else if (var63 == 12) {
                                        class94.method663(var44, var50, var49, 16777215);
                                        class94.method675(var44, var65, var36, var66);
                                    } else if (var63 == 17) {
                                        class94.method675(var44, var50, 1, var66);
                                    } else if (var63 == 18) {
                                        class94.method675(var64, var50, 1, var66);
                                    } else if (var63 == 19) {
                                        class94.method675(var64, var65, 1, var66);
                                    } else if (var63 == 20) {
                                        class94.method675(var44, var65, 1, var66);
                                    } else if (var63 == 25) {
                                        for (int var67 = 0; var67 < var49; var67++) {
                                            class94.method675(var44 + var67, var65 - var67, 1, var66);
                                        }
                                    } else if (var63 == 26) {
                                        for (int var68 = 0; var68 < var49; var68++) {
                                            class94.method675(var44 + var68, var50 + var68, 1, var66);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    int var69 = field4285 + var34;
                    var10000 = field4285 + var35;
                    for (int var71 = 0; var71 < var5; var71++) {
                        int var72 = (arg1 * var71 + arg3 >> 16) + field4291;
                        int var73 = ((var71 + 1) * arg1 + arg3 >> 16) + field4291;
                        int var74 = var73 - var72;
                        int var75;
                        if (field4273.field2742 != -1) {
                            var75 = field4273.field2742;
                        } else if ((field4294 + var71 & 0x4) == (field4290 + var6 & 0x4)) {
                            var75 = field4284[class195.field3160 + 1];
                        } else {
                            var75 = 4936552;
                        }
                        if (var75 == 0) {
                            var75 = 1;
                        }
                        class94.method660(var69, var72, var36, var74, var75);
                    }
                }
            }
        }
        for (int var7 = -2; var7 < var4 + 2; var7++) {
            int var8 = arg0 * var7 + arg2 >> 16;
            int var9 = (var7 + 1) * arg0 + arg2 >> 16;
            int var10 = var9 - var8;
            if (var10 > 0) {
                int var11 = field4285 + var8;
                var10000 = field4285 + var9;
                int var13 = field4290 + var7 >> 6;
                if (var13 >= 0 && var13 <= field4282.length - 1) {
                    int[][] var14 = field4282[var13];
                    for (int var15 = -2; var15 < var5 + 2; var15++) {
                        int var16 = arg1 * var15 + arg3 >> 16;
                        int var17 = (var15 + 1) * arg1 + arg3 >> 16;
                        int var18 = var17 - var16;
                        if (var18 > 0) {
                            int var19 = field4291 + var16;
                            var10000 = field4291 + var17;
                            int var21 = field4294 + var15 >> 6;
                            if (var21 >= 0 && var21 <= var14.length - 1) {
                                int var22 = ((field4294 + var15 & 0x3F) << 6) + (field4290 + var7 & 0x3F);
                                if (var14[var21] != null) {
                                    int var23 = var14[var21][var22];
                                    int var24 = var23 & 0x1FFF;
                                    if (var24 != 0) {
                                        class159 var25 = class274.method1819(var24 - 1, -20535);
                                        int var26 = var23 >> 13 & 0x3;
                                        boolean var27 = (var23 >> 15 & 0x1) == 1;
                                        class2 var28 = var25.method1087(1265215536, var26, var27);
                                        if (var28 != null) {
                                            int var29 = var28.field3179 * var10 / 4;
                                            int var30 = var28.field3181 * var18 / 4;
                                            if (var25.field2606) {
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
                                                if (var25.field2595 == 0) {
                                                    var28.method8(var11, var19 + var18 - var30, var29, var30);
                                                } else {
                                                    var28.method12(var11, var19 + var18 - var30, var29, var30, var25.field2595);
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

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lfj;)V")
    public static final void method1755(class274 arg0) {
        while (arg0.field4458 < arg0.field4441.length) {
            boolean var1 = false;
            int var2 = 0;
            int var3 = 0;
            if (arg0.method1849(255) == 1) {
                var1 = true;
                var2 = arg0.method1849(255);
                var3 = arg0.method1849(255);
            }
            int var4 = arg0.method1849(255);
            int var5 = arg0.method1849(255);
            int var6 = var4 * 64 - field4275;
            int var7 = field4278 - (var5 * 64 - field4276) - 1;
            if (var6 >= 0 && var7 - 63 >= 0 && var6 + 63 < field4277 && var7 < field4278) {
                int var8 = var6 >> 6;
                int var9 = var7 >> 6;
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (!var1 || var10 >= var2 * 8 && var10 < var2 * 8 + 8 && var11 >= var3 * 8 && var11 < var3 * 8 + 8) {
                            byte var12 = arg0.method1830((byte) -60);
                            if (var12 != 0) {
                                if (field4287[var8][var9] == null) {
                                    field4287[var8][var9] = new byte[4096];
                                }
                                field4287[var8][var9][(63 - var11 << 6) + var10] = var12;
                                byte var13 = arg0.method1830((byte) -102);
                                if (field4289[var8][var9] == null) {
                                    field4289[var8][var9] = new byte[4096];
                                }
                                field4289[var8][var9][(63 - var11 << 6) + var10] = var13;
                            }
                        }
                    }
                }
            } else {
                for (int var14 = 0; var14 < (var1 ? 64 : 4096); var14++) {
                    byte var15 = arg0.method1830((byte) 119);
                    if (var15 != 0) {
                        arg0.field4458++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(Lfj;)V")
    public static final void method1756(class274 arg0) {
        while (arg0.field4458 < arg0.field4441.length) {
            boolean var1 = false;
            int var2 = 0;
            int var3 = 0;
            if (arg0.method1849(255) == 1) {
                var1 = true;
                var2 = arg0.method1849(255);
                var3 = arg0.method1849(255);
            }
            int var4 = arg0.method1849(255);
            int var5 = arg0.method1849(255);
            int var6 = var4 * 64 - field4275;
            int var7 = field4278 - (var5 * 64 - field4276) - 1;
            if (var6 >= 0 && var7 - 63 >= 0 && var6 + 63 < field4277 && var7 < field4278) {
                int var8 = var6 >> 6;
                int var9 = var7 >> 6;
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        if (!var1 || var10 >= var2 * 8 && var10 < var2 * 8 + 8 && var11 >= var3 * 8 && var11 < var3 * 8 + 8) {
                            byte var12 = arg0.method1830((byte) 92);
                            if (var12 != 0) {
                                if (field4292[var8][var9] == null) {
                                    field4292[var8][var9] = new byte[4096];
                                }
                                field4292[var8][var9][(63 - var11 << 6) + var10] = var12;
                                byte var13 = arg0.method1830((byte) -91);
                                if (field4283[var8][var9] == null) {
                                    field4283[var8][var9] = new byte[4096];
                                }
                                field4283[var8][var9][(63 - var11 << 6) + var10] = var13;
                            }
                        }
                    }
                }
            } else {
                for (int var14 = 0; var14 < (var1 ? 64 : 4096); var14++) {
                    byte var15 = arg0.method1830((byte) 96);
                    if (var15 != 0) {
                        arg0.field4458++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(IIII)Lnb;")
    private static final class223 method1757(int arg0, int arg1, int arg2, int arg3) {
        class223 var4 = new class223();
        for (class119 var5 = (class119) field4272.method391((byte) 88); var5 != null; var5 = (class119) field4272.method394((byte) 57)) {
            method1763(var5, arg0, arg1, arg2, arg3);
            var4.method1554(5257, var5);
        }
        int[] var6 = new int[3];
        for (int var7 = 0; var7 < field4268.field3189; var7++) {
            class119 var8 = field4268.field3187[var7];
            boolean var9 = field4273.method1186(field4268.field3185[var7] & 0x3FFF, field4268.field3185[var7] >> 28 & 0x3, 2048, var6, field4268.field3185[var7] >> 14 & 0x3FFF);
            if (var9) {
                var8.field1883 = var6[1] - field4275;
                var8.field1886 = field4278 - (var6[2] - field4276) - 1;
                method1763(var8, arg0, arg1, arg2, arg3);
                var4.method1554(5257, var8);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)V")
    public static final void method1758(int arg0, int arg1) {
        for (int var2 = 0; var2 < class307.field4986; var2++) {
            class114 var3 = class251.method1705(var2, (byte) 50);
            if (var3 != null) {
                int var4 = var3.field1741;
                if (var4 >= 0 && !class136.field2196.method1025((byte) -123, var4)) {
                    var4 = -1;
                }
                int var8;
                if (var3.field1739 >= 0) {
                    int var5 = var3.field1739;
                    int var6 = (var5 & 0x7F) + arg1;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 127) {
                        var6 = 127;
                    }
                    int var7 = (arg0 + var5 & 0xFC00) + (var5 & 0x380) + var6;
                    var8 = class136.field2192[class24.method197(var7, 98, 96)];
                } else if (var4 >= 0) {
                    var8 = class136.field2192[class24.method197(class136.field2196.method1027((byte) 75, var4), 84, 96)];
                } else if (var3.field1738 == -1) {
                    var8 = -1;
                } else {
                    int var9 = var3.field1738;
                    int var10 = (var9 & 0x7F) + arg1;
                    if (var10 < 0) {
                        var10 = 0;
                    } else if (var10 > 127) {
                        var10 = 127;
                    }
                    int var11 = (arg0 + var9 & 0xFC00) + (var9 & 0x380) + var10;
                    var8 = class136.field2192[class24.method197(var11, 95, 96)];
                }
                field4284[var2 + 1] = var8;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lgi;)V")
    public static final void method1759(class164 arg0) {
        field4266 = arg0;
        field4267.method377((byte) -1);
        int var1 = field4266.method1160("details", -1);
        int[] var2 = field4266.method1162(0, var1);
        for (int var3 = 0; var3 < var2.length; var3++) {
            field4267.method368((long) var2[var3], class296.method2028(255, var2[var3], new class274(field4266.method1156(var1, var2[var3], (byte) -16))), -121);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lfj;Z)V")
    public static final void method1760(class274 arg0, boolean arg1) {
        while (arg0.field4458 < arg0.field4441.length) {
            boolean var2 = false;
            int var3 = 0;
            int var4 = 0;
            if (arg0.method1849(255) == 1) {
                var2 = true;
                var3 = arg0.method1849(255);
                var4 = arg0.method1849(255);
            }
            int var5 = arg0.method1849(255);
            int var6 = arg0.method1849(255);
            int var7 = var5 * 64 - field4275;
            int var8 = field4278 - (var6 * 64 - field4276) - 1;
            if (var7 >= 0 && var8 - 63 >= 0 && var7 + 63 < field4277 && var8 < field4278) {
                int var9 = var7 >> 6;
                int var10 = var8 >> 6;
                for (int var11 = 0; var11 < 64; var11++) {
                    for (int var12 = 0; var12 < 64; var12++) {
                        if (!var2 || var11 >= var3 * 8 && var11 < var3 * 8 + 8 && var12 >= var4 * 8 && var12 < var4 * 8 + 8) {
                            int var13 = arg0.method1849(255);
                            if (var13 != 0) {
                                if ((var13 & 0x1) == 1) {
                                    int var14 = arg0.method1849(255);
                                    if (field4288[var9][var10] == null) {
                                        field4288[var9][var10] = new byte[4096];
                                    }
                                    field4288[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                }
                                if ((var13 & 0x2) == 2) {
                                    int var15 = arg0.method1812(true);
                                    if (field4282[var9][var10] == null) {
                                        field4282[var9][var10] = new int[4096];
                                    }
                                    field4282[var9][var10][(63 - var12 << 6) + var11] = var15;
                                }
                                if ((var13 & 0x4) == 4) {
                                    int var16 = arg0.method1837(252);
                                    int var17 = arg0.method1849(255);
                                    int var22 = var16 - 1;
                                    class172 var18 = class49.method319(var22, 0);
                                    if (var18.field2846 != null) {
                                        var18 = var18.method1214(-77);
                                        if (var18 == null || var18.field2866 == -1) {
                                            continue;
                                        }
                                    }
                                    if ((!var18.field2871 || arg1) && var18.field2866 != -1) {
                                        class119 var19 = new class119();
                                        var19.field1877 = var18.field2866;
                                        var19.field1882 = var17;
                                        var19.field1883 = var9 * 64 + var11;
                                        var19.field1886 = var10 * 64 + (64 - var12);
                                        field4272.method388(var19, false);
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < (var2 ? 64 : 4096); var20++) {
                    int var21 = arg0.method1849(255);
                    if (var21 != 0) {
                        if ((var21 & 0x1) == 1) {
                            arg0.field4458++;
                        }
                        if ((var21 & 0x2) == 2) {
                            arg0.field4458 += 2;
                        }
                        if ((var21 & 0x4) == 4) {
                            arg0.field4458 += 3;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([IIIIIIIIIZ)V")
    private static final void method1761(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        int var10 = arg1;
        if (arg1 >= class94.field1499) {
            return;
        }
        if (arg1 < class94.field1500) {
            var10 = class94.field1500;
        }
        int var11 = arg1 + arg5;
        if (var11 <= class94.field1500) {
            return;
        }
        if (var11 > class94.field1499) {
            var11 = class94.field1499;
        }
        int var12 = arg2;
        if (arg2 >= class94.field1494) {
            return;
        }
        if (arg2 < class94.field1501) {
            var12 = class94.field1501;
        }
        int var13 = arg2 + arg6;
        if (var13 <= class94.field1501) {
            return;
        }
        if (var13 > class94.field1494) {
            var13 = class94.field1494;
        }
        int var14 = class94.field1496 * var12 + var10;
        int var15 = class94.field1496 + var10 - var11;
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

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "()V")
    public static void method1762() {
        field4266 = null;
        field4267 = null;
        field4273 = null;
        field4268 = null;
        field4272 = null;
        field4286 = null;
        field4292 = null;
        field4283 = null;
        field4287 = null;
        field4289 = null;
        field4288 = null;
        field4282 = null;
        field4284 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lth;IIII)V")
    private static final void method1763(class119 arg0, int arg1, int arg2, int arg3, int arg4) {
        arg0.field1876 = ((arg0.field1883 - field4290) * arg1 + arg3 >> 16) + field4285;
        arg0.field1875 = ((arg0.field1886 - field4294) * arg2 + arg4 >> 16) + field4291;
        class125 var5 = class223.method1550((byte) -81, arg0.field1877);
        if (var5.field1982 != -1) {
            class197 var6 = var5.method864(115, false, true);
            if (var6 != null) {
                if (arg0.field1876 - (var6.field3179 + 1 >> 1) <= field4293 && (var6.field3179 + 1 >> 1) + arg0.field1876 >= field4285 && arg0.field1875 - (var6.field3181 + 1 >> 1) <= field4279 && (var6.field3181 + 1 >> 1) + arg0.field1875 >= field4291) {
                    arg0.field1884 = false;
                    return;
                }
                arg0.field1884 = true;
                return;
            }
        }
        if (arg0.field1883 >= field4290 && arg0.field1883 <= field4280 && arg0.field1886 >= field4294 && arg0.field1886 <= field4281) {
            arg0.field1884 = false;
        } else {
            arg0.field1884 = true;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(II)Lnf;")
    public static final class166 method1764(int arg0, int arg1) {
        for (class166 var2 = (class166) field4267.method379(-21146); var2 != null; var2 = (class166) field4267.method369(true)) {
            if (var2.field2749 && var2.method1180(12800, arg1, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)Lnf;")
    public static final class166 method1765(int arg0) {
        return (class166) field4267.method371(-101, (long) arg0);
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "()V")
    public static final void method1766() {
        int var0 = field4280 - field4290;
        int var1 = field4281 - field4294;
        int var2 = (field4293 - field4285 << 16) / var0;
        int var3 = (field4279 - field4291 << 16) / var1;
        method1754(var2, var3, 0, 0);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1767(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4290 = arg0;
        field4294 = arg1;
        field4280 = arg2;
        field4281 = arg3;
        field4285 = arg4;
        field4291 = arg5;
        field4293 = arg6;
        field4279 = arg7;
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(II)Lja;")
    public static final class61 method1768(int arg0, int arg1) {
        class61 var2 = new class61();
        for (class166 var3 = (class166) field4267.method379(-21146); var3 != null; var3 = (class166) field4267.method369(true)) {
            if (var3.field2749 && var3.method1180(12800, arg1, arg0)) {
                var2.method388(var3, false);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
    public static final void method1769(int arg0) {
        field4273 = (class166) field4267.method371(-101, (long) arg0);
    }
}
