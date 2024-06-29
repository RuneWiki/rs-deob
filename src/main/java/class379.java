import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class379 {

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "Lsq;")
    private static class454 field5357 = new class454(16);

    @OriginalMember(owner = "client!qt", name = "n", descriptor = "I")
    public static int field5367 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!qt", name = "j", descriptor = "[B")
    private static byte[] field5363 = new byte[1];

    @OriginalMember(owner = "client!qt", name = "k", descriptor = "I")
    public static int field5364 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!qt", name = "r", descriptor = "[S")
    private static short[] field5371 = new short[1];

    @OriginalMember(owner = "client!qt", name = "m", descriptor = "Lsm;")
    public static class249 field5366 = new class249();

    @OriginalMember(owner = "client!qt", name = "l", descriptor = "F")
    public static float field5365;

    @OriginalMember(owner = "client!qt", name = "s", descriptor = "F")
    public static float field5372;

    @OriginalMember(owner = "client!qt", name = "q", descriptor = "I")
    public static int field5370;

    @OriginalMember(owner = "client!qt", name = "x", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!qt", name = "z", descriptor = "I")
    public static int field5379;

    @OriginalMember(owner = "client!qt", name = "C", descriptor = "I")
    public static int field5382;

    @OriginalMember(owner = "client!qt", name = "E", descriptor = "I")
    public static int field5384;

    @OriginalMember(owner = "client!qt", name = "F", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!qt", name = "H", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!qt", name = "I", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!qt", name = "J", descriptor = "I")
    public static int field5389;

    @OriginalMember(owner = "client!qt", name = "L", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!qt", name = "M", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!qt", name = "N", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!qt", name = "O", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!qt", name = "p", descriptor = "Lnf;")
    public static class107 field5369;

    @OriginalMember(owner = "client!qt", name = "f", descriptor = "Lwt;")
    public static class200 field5359;

    @OriginalMember(owner = "client!qt", name = "g", descriptor = "Lfh;")
    public static class311 field5360;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "Li;")
    private static class332 field5354;

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "Lfc;")
    public static class343 field5356;

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "Ljf;")
    public static class347 field5355;

    @OriginalMember(owner = "client!qt", name = "h", descriptor = "Lwg;")
    private static class441 field5361;

    @OriginalMember(owner = "client!qt", name = "D", descriptor = "Lsq;")
    private static class454 field5383;

    @OriginalMember(owner = "client!qt", name = "i", descriptor = "Lpp;")
    public static class48 field5362;

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "Lsn;")
    public static class7 field5358;

    @OriginalMember(owner = "client!qt", name = "t", descriptor = "[B")
    private static byte[] field5373;

    @OriginalMember(owner = "client!qt", name = "u", descriptor = "[B")
    private static byte[] field5374;

    @OriginalMember(owner = "client!qt", name = "v", descriptor = "[B")
    private static byte[] field5375;

    @OriginalMember(owner = "client!qt", name = "y", descriptor = "[B")
    private static byte[] field5378;

    @OriginalMember(owner = "client!qt", name = "G", descriptor = "[B")
    private static byte[] field5386;

    @OriginalMember(owner = "client!qt", name = "w", descriptor = "[I")
    private static int[] field5376;

    @OriginalMember(owner = "client!qt", name = "A", descriptor = "[S")
    private static short[] field5380;

    @OriginalMember(owner = "client!qt", name = "B", descriptor = "[S")
    private static short[] field5381;

    @OriginalMember(owner = "client!qt", name = "o", descriptor = "[[[B")
    public static byte[][][] field5368;

    @OriginalMember(owner = "client!qt", name = "K", descriptor = "[[[Ldu;")
    private static class479[][][] field5390;

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lkm;IIII)V")
    private static final void method2257(class487 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field5377 - field5392;
        int var6 = field5382 - field5387;
        if (field5377 < field5389) {
            var5++;
        }
        if (field5382 < field5384) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field5391;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field5391;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field5392 + var7;
                if (var52 >= 0 && var52 < field5389) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field5385 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field5385 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field5387 + var53;
                            int var58 = field5389 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field5384) {
                                var59 = (field5373[var58] & 0xFF) << 16 | field5380[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field5374[var58] & 0xFF;
                                var61 = field5381[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field5359.field2867 != -1) {
                                    var62 = field5359.field2867 | 0xFF000000;
                                } else if ((field5392 + var7 & 0x4) == (field5382 + var53 & 0x4)) {
                                    var62 = field5376[field5361.field6058 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method1107(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method2260(arg0, var49, var54, var51, var56, var59, var60, field5386[var58], (short[]) null, (byte[]) null, true);
                            } else if (var61 == 65535) {
                                class463 var63 = (class463) field5383.method2614((long) (var52 << 16 | var57), 118);
                                if (var63 != null) {
                                    method2260(arg0, var49, var54, var51, var56, var59, var60, field5386[var58], var63.field6518, var63.field6517, true);
                                }
                            } else {
                                field5371[0] = (short) (var61 - 1);
                                field5363[0] = field5378[var58];
                                method2260(arg0, var49, var54, var51, var56, var59, var60, field5386[var58], field5371, field5363, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field5385 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field5385 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field5359.field2867 != -1) {
                            var68 = field5359.field2867 | 0xFF000000;
                        } else if ((field5392 + var7 & 0x4) == (field5382 + var64 & 0x4)) {
                            var68 = field5376[field5361.field6058 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method1107(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field5391;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field5391;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field5392 + var8;
                if (var41 >= 0 && var41 < field5389) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field5385 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field5385 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field5387 + var42;
                            if (var46 >= 0 && var46 < field5384) {
                                int var47 = field5381[field5389 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method2267(arg0, var38, var43, var40, var45, (short[]) null, (byte[]) null);
                                } else if (var47 == 65535) {
                                    class463 var48 = (class463) field5383.method2614((long) (var41 << 16 | var46), -102);
                                    if (var48 != null) {
                                        method2267(arg0, var38, var43, var40, var45, var48.field6518, var48.field6517);
                                    }
                                } else {
                                    field5371[0] = (short) (var47 - 1);
                                    field5363[0] = field5378[field5389 * var46 + var41];
                                    method2267(arg0, var38, var43, var40, var45, field5371, field5363);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field5392 >> 6;
        int var10 = field5387 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field5377 >> 6;
        int var12 = field5382 >> 6;
        if (var11 >= field5390[0].length) {
            var11 = field5390[0].length - 1;
        }
        if (var12 >= field5390[0][0].length) {
            var12 = field5390[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class479 var28 = field5390[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field5393 >> 6) + var14) * 64;
                        int var30 = ((field5379 >> 6) + var27) * 64;
                        for (class433 var31 = (class433) var28.method2823(115); var31 != null; var31 = (class433) var28.method2818(0)) {
                            int var32 = var31.field5958 + var29 - field5393 - field5392;
                            int var33 = var31.field5962 + var30 - field5379 - field5387;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field5391;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field5391;
                            int var36 = field5385 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field5385 - (arg2 * var33 + arg4 >> 16);
                            method2260(arg0, var34, var36, var35 - var34, var37 - var36, var31.field5961, var31.field5964 & 0xFF, var31.field5959, var31.field5963, var31.field5960, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class479 var17 = field5390[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field5393 >> 6) + var15) * 64;
                        int var19 = ((field5379 >> 6) + var16) * 64;
                        for (class433 var20 = (class433) var17.method2823(68); var20 != null; var20 = (class433) var17.method2818(0)) {
                            int var21 = var20.field5958 + var18 - field5393 - field5392;
                            int var22 = var20.field5962 + var19 - field5379 - field5387;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field5391;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field5391;
                            int var25 = field5385 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field5385 - (arg2 * var22 + arg4 >> 16);
                            method2267(arg0, var23, var25, var24 - var23, var26 - var25, var20.field5963, var20.field5960);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(Lkm;IIII)Lsm;")
    private static final class249 method2258(class487 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class163 var5 = (class163) field5366.method1544(-105); var5 != null; var5 = (class163) field5366.method1546((byte) -42)) {
            method2271(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field5366;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)V")
    public static final void method2259(int arg0) {
        field5359 = (class200) field5357.method2614((long) arg0, 101);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lkm;IIIIIII[S[BZ)V")
    private static final void method2260(class487 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method1107(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field5376[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method1107(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class161.method974(arg7 >> 6 & 0x3, arg4, arg1, arg3, field5368, arg2, var12, var11, (byte) 86, field5376[arg6], arg5, field5370, arg0);
                }
            }
        }
        if (arg8 == null) {
            return;
        }
        int var14;
        if (arg3 == 1) {
            var14 = arg1;
        } else {
            var14 = arg1 + arg3 - 1;
        }
        int var15;
        if (arg4 == 1) {
            var15 = arg2;
        } else {
            var15 = arg2 + arg4 - 1;
        }
        for (int var16 = 0; var16 < arg8.length; var16++) {
            int var17 = arg9[var16] & 0x3F;
            if (var17 == 0 || var17 == 2 || var17 == 3 || var17 == 9) {
                class475 var18 = field5355.method2075(arg8[var16] & 0xFFFF, false);
                if (var18.field6702 == -1) {
                    int var19 = -3355444;
                    if (var18.field6681 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method1118(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method1130(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method1118(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method1130(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method1118(arg1, arg2, arg4, -1, 0);
                            arg0.method1130(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method1118(var14, arg2, arg4, -1, 0);
                            arg0.method1130(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method1118(var14, arg2, arg4, -1, 0);
                            arg0.method1130(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method1118(arg1, arg2, arg4, -1, 0);
                            arg0.method1130(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method1130(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method1130(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method1130(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method1130(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method1130(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method1130(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)Lwt;")
    public static final class200 method2261(int arg0, int arg1) {
        for (class200 var2 = (class200) field5357.method2615((byte) -18); var2 != null; var2 = (class200) field5357.method2619((byte) -98)) {
            if (var2.field2865 && var2.method1267(7027, arg1, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)Lwt;")
    public static final class200 method2262(int arg0) {
        return (class200) field5357.method2614((long) arg0, -82);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2263(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5392 = arg0 - field5393;
        field5382 = arg1 - field5379;
        field5377 = arg2 - field5393;
        field5387 = arg3 - field5379;
        field5391 = arg4;
        field5388 = arg5;
        field5394 = arg6;
        field5385 = arg7;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "()V")
    public static void method2264() {
        field5361 = null;
        field5354 = null;
        field5355 = null;
        field5358 = null;
        field5362 = null;
        field5360 = null;
        field5359 = null;
        field5356 = null;
        field5357 = null;
        field5368 = null;
        field5371 = null;
        field5363 = null;
        field5369 = null;
        field5366 = null;
        field5376 = null;
        field5375 = null;
        field5373 = null;
        field5380 = null;
        field5374 = null;
        field5386 = null;
        field5381 = null;
        field5378 = null;
        field5383 = null;
        field5390 = null;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lbc;II)V")
    public static final void method2265(class187 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field5361.field6051; var3++) {
            field5376[var3 + 1] = method2276(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lkm;)V")
    public static final void method2266(class487 arg0) {
        int var1 = field5377 - field5392;
        int var2 = field5382 - field5387;
        int var3 = (field5394 - field5391 << 16) / var1;
        int var4 = (field5385 - field5388 << 16) / var2;
        method2257(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lkm;IIII[S[B)V")
    private static final void method2267(class487 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class475 var8 = field5355.method2075(arg5[var7] & 0xFFFF, false);
            int var9 = var8.field6702;
            if (var9 != -1) {
                class78 var10 = field5362.method377((byte) 61, var9);
                class385 var11 = var10.method537(68, var8.field6646 ? arg6[var7] >> 6 & 0x3 : 0, var8.field6664 ? var8.field6689 : false, arg0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method382() >> 2;
                    int var13 = arg4 * var11.method389() >> 2;
                    if (var10.field1176) {
                        int var14 = var8.field6708;
                        int var15 = var8.field6714;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field1178 == 0) {
                            var11.method2297(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method384(arg1, arg2 + arg4 - var13, var12, var13, 1, var10.field1178 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "()V")
    public static final void method2268() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field5369.field1533; var1++) {
            boolean var2 = field5359.method1270(field5369.field1531[var1] & 0x3FFF, var0, 104, field5369.field1531[var1] >> 28 & 0x3, field5369.field1531[var1] >> 14 & 0x3FFF);
            if (var2) {
                class163 var3 = new class163(field5369.field1532[var1]);
                var3.field2339 = var0[1] - field5393;
                var3.field2343 = var0[2] - field5379;
                field5366.method1553((byte) -116, var3);
            }
        }
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(Lkm;)Lsm;")
    public static final class249 method2269(class487 arg0) {
        int var1 = field5377 - field5392;
        int var2 = field5382 - field5387;
        int var3 = (field5394 - field5391 << 16) / var1;
        int var4 = (field5385 - field5388 << 16) / var2;
        return method2258(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lkm;Llk;IIII[I[I)V")
    private static final void method2270(class487 arg0, class425 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method2503(true);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method2503(true);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field5375[field5389 * arg5 + arg4] = (byte) var11;
                    field5374[field5389 * arg5 + arg4] = 0;
                } else {
                    field5374[field5389 * arg5 + arg4] = (byte) var11;
                    field5386[field5389 * arg5 + arg4] = 0;
                    field5375[field5389 * arg5 + arg4] = arg1.method2480(-8315);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method2503(true);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method2503(true);
                var18 = arg1.method2503(true);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method2503(true);
            }
            if (var15 == 0) {
                field5375[field5389 * arg5 + arg4] = (byte) var16;
                field5374[field5389 * arg5 + arg4] = (byte) var17;
                field5386[field5389 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field5381[field5389 * arg5 + arg4] = (short) (arg1.method2508(true) + 1);
                    field5378[field5389 * arg5 + arg4] = arg1.method2480(-8315);
                } else if (var19 > 1) {
                    field5381[field5389 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method2508(true);
                        var21[var22] = arg1.method2480(-8315);
                    }
                    field5383.method2620((long) (arg4 << 16 | arg5), new class463(var20, var21), false);
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method2508(true);
                        var24[var25] = arg1.method2480(-8315);
                    }
                }
                if (field5390[var15 - 1][arg2 - (field5393 >> 6)][arg3 - (field5379 >> 6)] == null) {
                    field5390[var15 - 1][arg2 - (field5393 >> 6)][arg3 - (field5379 >> 6)] = new class479();
                }
                class433 var26 = new class433(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field5390[var15 - 1][arg2 - (field5393 >> 6)][arg3 - (field5379 >> 6)].method2817(false, var26);
            }
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lkm;Lji;IIII)V")
    private static final void method2271(class487 arg0, class163 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field2334 = ((arg1.field2339 - field5392) * arg2 + arg4 >> 16) + field5391;
        arg1.field2346 = field5385 - ((arg1.field2343 - field5387) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "()V")
    public static final void method2272() {
        field5375 = new byte[field5389 * field5384];
        field5374 = new byte[field5389 * field5384];
        field5386 = new byte[field5389 * field5384];
        field5381 = new short[field5389 * field5384];
        field5378 = new byte[field5389 * field5384];
        field5383 = new class454(1024);
        field5390 = new class479[3][field5389 >> 6][field5384 >> 6];
        field5376 = new int[field5361.field6051 + 1];
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lfc;Lwg;Li;Ljf;Lsn;Lpp;Lfh;)V")
    public static final void method2273(class343 arg0, class441 arg1, class332 arg2, class347 arg3, class7 arg4, class48 arg5, class311 arg6) {
        field5356 = arg0;
        field5361 = arg1;
        field5354 = arg2;
        field5355 = arg3;
        field5358 = arg4;
        field5362 = arg5;
        field5360 = arg6;
        field5357.method2623((byte) -99);
        int var7 = field5356.method2042(100, "details");
        int[] var8 = field5356.method2026(var7, -126);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class200 var10 = class225.method1419(var8[var9], 20965, var7, field5356);
            field5357.method2620((long) var10.field2878, var10, false);
        }
        class476.method2799(22226, true, false);
    }

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "()V")
    public static final void method2274() {
        field5375 = null;
        field5373 = null;
        field5380 = null;
        field5374 = null;
        field5386 = null;
        field5381 = null;
        field5378 = null;
        field5383 = null;
        field5390 = null;
        field5376 = null;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lkm;II)V")
    public static final void method2275(class487 arg0, int arg1, int arg2) {
        class425 var3 = new class425(field5356.method2024("area", field5359.field2876, 0));
        int var4 = var3.method2503(true);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method2503(true);
        }
        int var7 = var3.method2503(true);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method2503(true);
        }
        while (true) {
            while (var3.field5830 < var3.field5886.length) {
                if (var3.method2503(true) == 0) {
                    int var22 = var3.method2503(true);
                    int var23 = var3.method2503(true);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field5393;
                            int var27 = var23 * 64 + var25 - field5379;
                            method2270(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method2503(true);
                    int var29 = var3.method2503(true);
                    int var30 = var3.method2503(true);
                    int var31 = var3.method2503(true);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field5393;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field5379;
                            method2270(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field5373 = new byte[field5389 * field5384];
            field5380 = new short[field5389 * field5384];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field5389 * field5384];
                for (int var13 = 0; var13 < field5390[var11].length; var13++) {
                    for (int var19 = 0; var19 < field5390[var11][0].length; var19++) {
                        class479 var20 = field5390[var11][var13][var19];
                        if (var20 != null) {
                            for (class433 var21 = (class433) var20.method2823(59); var21 != null; var21 = (class433) var20.method2818(0)) {
                                var12[(var19 * 64 + var21.field5962) * field5389 + var13 * 64 + var21.field5958] = (byte) var21.field5961;
                            }
                        }
                    }
                }
                method2279(var12, field5373, field5380, arg1, arg2);
                for (int var14 = 0; var14 < field5390[var11].length; var14++) {
                    for (int var15 = 0; var15 < field5390[var11][0].length; var15++) {
                        class479 var16 = field5390[var11][var14][var15];
                        if (var16 != null) {
                            for (class433 var17 = (class433) var16.method2823(72); var17 != null; var17 = (class433) var16.method2818(0)) {
                                int var18 = (var15 * 64 + var17.field5962) * field5389 + var14 * 64 + var17.field5958;
                                var17.field5961 = (field5373[var18] & 0xFF) << 16 | field5380[var18] & 0xFFFF;
                                if (var17.field5961 != 0) {
                                    var17.field5961 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method2279(field5375, field5373, field5380, arg1, arg2);
            field5375 = null;
            method2278();
            return;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lbc;III)I")
    private static final int method2276(class187 arg0, int arg1, int arg2, int arg3) {
        class277 var4 = field5361.method2556(92, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field3831;
        if (var5 >= 0 && arg0.method1218(var5, false).field2739) {
            var5 = -1;
        }
        int var9;
        if (var4.field3836 >= 0) {
            int var6 = var4.field3836;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class197.field2807[class314.method1897(-1433933209, class2.method10(var8, 119, 96)) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class197.field2807[class314.method1897(-1433933209, class2.method10(arg0.method1218(var5, false).field2732, 120, 96)) & 0xFFFF] | 0xFF000000;
        } else if (var4.field3826 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field3826;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class197.field2807[class314.method1897(-1433933209, class2.method10(var12, 127, 96)) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(II)Lot;")
    public static final class255 method2277(int arg0, int arg1) {
        class255 var2 = new class255();
        for (class200 var3 = (class200) field5357.method2615((byte) -18); var3 != null; var3 = (class200) field5357.method2619((byte) -98)) {
            if (var3.field2865 && var3.method1267(7027, arg1, arg0)) {
                var2.method1584(100, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qt", name = "e", descriptor = "()V")
    private static final void method2278() {
        for (int var0 = 0; var0 < field5389; var0++) {
            for (int var11 = 0; var11 < field5384; var11++) {
                int var12 = field5381[field5389 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class463 var13 = (class463) field5383.method2614((long) (var0 << 16 | var11), -92);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field6518.length; var14++) {
                                class475 var15 = field5355.method2075(var13.field6518[var14] & 0xFFFF, false);
                                int var16 = var15.field6665;
                                if (var15.field6690 != null) {
                                    class475 var17 = var15.method2797(field5360, -125);
                                    if (var17 != null) {
                                        var16 = var17.field6665;
                                    }
                                }
                                if (var16 != -1) {
                                    class163 var18 = new class163(var16);
                                    var18.field2339 = var0;
                                    var18.field2343 = var11;
                                    field5366.method1553((byte) -110, var18);
                                }
                            }
                        }
                    } else {
                        class475 var19 = field5355.method2075(var12 - 1, false);
                        int var20 = var19.field6665;
                        if (var19.field6690 != null) {
                            class475 var21 = var19.method2797(field5360, -124);
                            if (var21 != null) {
                                var20 = var21.field6665;
                            }
                        }
                        if (var20 != -1) {
                            class163 var22 = new class163(var20);
                            var22.field2339 = var0;
                            var22.field2343 = var11;
                            field5366.method1553((byte) -121, var22);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field5390[0].length; var2++) {
                for (int var3 = 0; var3 < field5390[0][0].length; var3++) {
                    class479 var4 = field5390[var1][var2][var3];
                    if (var4 != null) {
                        for (class433 var5 = (class433) var4.method2823(66); var5 != null; var5 = (class433) var4.method2818(0)) {
                            if (var5.field5963 != null) {
                                for (int var6 = 0; var6 < var5.field5963.length; var6++) {
                                    class475 var7 = field5355.method2075(var5.field5963[var6] & 0xFFFF, false);
                                    int var8 = var7.field6665;
                                    if (var7.field6690 != null) {
                                        class475 var9 = var7.method2797(field5360, -124);
                                        if (var9 != null) {
                                            var8 = var9.field6665;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class163 var10 = new class163(var8);
                                        var10.field2339 = ((field5393 >> 6) + var2) * 64 + var5.field5958 - field5393;
                                        var10.field2343 = ((field5379 >> 6) + var3) * 64 + var5.field5962 - field5379;
                                        field5366.method1553((byte) -98, var10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "([B[B[SII)V")
    private static final void method2279(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field5384];
        int[] var6 = new int[field5384];
        int[] var7 = new int[field5384];
        int[] var8 = new int[field5384];
        int[] var9 = new int[field5384];
        for (int var10 = -5; var10 < field5389; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field5384; var13++) {
                int var10002;
                if (var11 < field5389) {
                    int var28 = arg0[field5389 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class228 var29 = field5354.method1979(var28 - 1, 18926);
                        var5[var13] += var29.field3221;
                        var6[var13] += var29.field3223;
                        var7[var13] += var29.field3217;
                        var8[var13] += var29.field3216;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field5389 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class228 var31 = field5354.method1979(var30 - 1, 18926);
                        var5[var13] -= var31.field3221;
                        var6[var13] -= var31.field3223;
                        var7[var13] -= var31.field3217;
                        var8[var13] -= var31.field3216;
                        var10002 = var9[var13]--;
                    }
                }
            }
            if (var10 >= 0) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                for (int var19 = -5; var19 < field5384; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field5384) {
                        var14 += var5[var20];
                        var15 += var6[var20];
                        var16 += var7[var20];
                        var17 += var8[var20];
                        var18 += var9[var20];
                    }
                    int var21 = var19 - 5;
                    if (var21 >= 0) {
                        var14 -= var5[var21];
                        var15 -= var6[var21];
                        var16 -= var7[var21];
                        var17 -= var8[var21];
                        var18 -= var9[var21];
                    }
                    if (var19 >= 0 && var18 > 0) {
                        if ((arg0[field5389 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field5389 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class56.method429(var15 / var18, var14 * 256 / var17, (byte) 100, var16 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field5389 * var19 + var10;
                            int var27 = class197.field2807[class314.method1897(-1433933209, class27.method229(var25, 96, false)) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }
}
