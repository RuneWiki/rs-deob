import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class399 {

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "Lib;")
    private static class106 field5890 = new class106(16);

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    public static int field5898 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "[S")
    private static short[] field5904 = new short[1];

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "I")
    public static int field5907 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "[B")
    private static byte[] field5906 = new byte[1];

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "Lpk;")
    public static class133 field5903 = new class133();

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "F")
    public static float field5902;

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "F")
    public static float field5905;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
    public static int field5899;

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "I")
    public static int field5908;

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "I")
    public static int field5909;

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!hj", name = "B", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!hj", name = "D", descriptor = "I")
    public static int field5918;

    @OriginalMember(owner = "client!hj", name = "G", descriptor = "I")
    public static int field5921;

    @OriginalMember(owner = "client!hj", name = "I", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "I")
    public static int field5924;

    @OriginalMember(owner = "client!hj", name = "L", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!hj", name = "M", descriptor = "I")
    public static int field5926;

    @OriginalMember(owner = "client!hj", name = "N", descriptor = "I")
    public static int field5927;

    @OriginalMember(owner = "client!hj", name = "A", descriptor = "Lib;")
    private static class106 field5915;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "Lqk;")
    public static class14 field5900;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "Lqd;")
    private static class312 field5895;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "Lwi;")
    public static class325 field5893;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "Lcn;")
    public static class355 field5889;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "Lfs;")
    public static class387 field5892;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "Lvs;")
    public static class416 field5894;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "Lkb;")
    private static class485 field5896;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "Lwf;")
    public static class89 field5897;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "Lpj;")
    public static class99 field5891;

    @OriginalMember(owner = "client!hj", name = "y", descriptor = "[B")
    private static byte[] field5913;

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "[B")
    private static byte[] field5914;

    @OriginalMember(owner = "client!hj", name = "E", descriptor = "[B")
    private static byte[] field5919;

    @OriginalMember(owner = "client!hj", name = "F", descriptor = "[B")
    private static byte[] field5920;

    @OriginalMember(owner = "client!hj", name = "H", descriptor = "[B")
    private static byte[] field5922;

    @OriginalMember(owner = "client!hj", name = "x", descriptor = "[I")
    private static int[] field5912;

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "[S")
    private static short[] field5911;

    @OriginalMember(owner = "client!hj", name = "O", descriptor = "[S")
    private static short[] field5928;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "[[[B")
    public static byte[][][] field5901;

    @OriginalMember(owner = "client!hj", name = "P", descriptor = "[[[Lgn;")
    private static class493[][][] field5929;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
    public static final void method2439(int arg0) {
        field5889 = (class355) field5890.method875((long) arg0, 127);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lya;IIII)V")
    private static final void method2440(class38 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field5921 - field5917;
        int var6 = field5908 - field5916;
        if (field5921 < field5923) {
            var5++;
        }
        if (field5908 < field5927) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field5909;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field5909;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field5917 + var7;
                if (var52 >= 0 && var52 < field5923) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field5924 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field5924 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field5916 + var53;
                            int var58 = field5923 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field5927) {
                                var59 = (field5920[var58] & 0xFF) << 16 | field5928[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field5914[var58] & 0xFF;
                                var61 = field5911[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field5889.field4959 != -1) {
                                    var62 = field5889.field4959 | 0xFF000000;
                                } else if ((field5917 + var7 & 0x4) == (field5908 + var53 & 0x4)) {
                                    var62 = field5912[field5896.field7132 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method386(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method2444(arg0, var49, var54, var51, var56, var59, var60, field5919[var58], null, null, true);
                            } else if (var61 == 65535) {
                                class115 var63 = (class115) field5915.method875((long) (var52 << 16 | var57), 124);
                                if (var63 != null) {
                                    method2444(arg0, var49, var54, var51, var56, var59, var60, field5919[var58], var63.field1616, var63.field1615, true);
                                }
                            } else {
                                field5904[0] = (short) (var61 - 1);
                                field5906[0] = field5922[var58];
                                method2444(arg0, var49, var54, var51, var56, var59, var60, field5919[var58], field5904, field5906, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field5924 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field5924 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field5889.field4959 != -1) {
                            var68 = field5889.field4959 | 0xFF000000;
                        } else if ((field5917 + var7 & 0x4) == (field5908 + var64 & 0x4)) {
                            var68 = field5912[field5896.field7132 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method386(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field5909;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field5909;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field5917 + var8;
                if (var41 >= 0 && var41 < field5923) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field5924 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field5924 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field5916 + var42;
                            if (var46 >= 0 && var46 < field5927) {
                                int var47 = field5911[field5923 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method2451(arg0, var38, var43, var40, var45, null, null);
                                } else if (var47 == 65535) {
                                    class115 var48 = (class115) field5915.method875((long) (var41 << 16 | var46), 125);
                                    if (var48 != null) {
                                        method2451(arg0, var38, var43, var40, var45, var48.field1616, var48.field1615);
                                    }
                                } else {
                                    field5904[0] = (short) (var47 - 1);
                                    field5906[0] = field5922[field5923 * var46 + var41];
                                    method2451(arg0, var38, var43, var40, var45, field5904, field5906);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field5917 >> 6;
        int var10 = field5916 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field5921 >> 6;
        int var12 = field5908 >> 6;
        if (var11 >= field5929[0].length) {
            var11 = field5929[0].length - 1;
        }
        if (var12 >= field5929[0][0].length) {
            var12 = field5929[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class493 var28 = field5929[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field5926 >> 6) + var14) * 64;
                        int var30 = ((field5910 >> 6) + var27) * 64;
                        for (class18 var31 = (class18) var28.method2955(62); var31 != null; var31 = (class18) var28.method2952((byte) -66)) {
                            int var32 = var31.field203 + var29 - field5926 - field5917;
                            int var33 = var31.field202 + var30 - field5910 - field5916;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field5909;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field5909;
                            int var36 = field5924 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field5924 - (arg2 * var33 + arg4 >> 16);
                            method2444(arg0, var34, var36, var35 - var34, var37 - var36, var31.field208, var31.field204 & 0xFF, var31.field206, var31.field205, var31.field207, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class493 var17 = field5929[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field5926 >> 6) + var15) * 64;
                        int var19 = ((field5910 >> 6) + var16) * 64;
                        for (class18 var20 = (class18) var17.method2955(62); var20 != null; var20 = (class18) var17.method2952((byte) -69)) {
                            int var21 = var20.field203 + var18 - field5926 - field5917;
                            int var22 = var20.field202 + var19 - field5910 - field5916;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field5909;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field5909;
                            int var25 = field5924 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field5924 - (arg2 * var22 + arg4 >> 16);
                            method2451(arg0, var23, var25, var24 - var23, var26 - var25, var20.field205, var20.field207);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)Lcn;")
    public static final class355 method2441(int arg0, int arg1) {
        for (class355 var2 = (class355) field5890.method880((byte) -23); var2 != null; var2 = (class355) field5890.method879((byte) -20)) {
            if (var2.field4948 && var2.method2143(-92, arg1, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "([B[B[SII)V")
    private static final void method2442(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field5927];
        int[] var6 = new int[field5927];
        int[] var7 = new int[field5927];
        int[] var8 = new int[field5927];
        int[] var9 = new int[field5927];
        for (int var10 = -5; var10 < field5923; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field5927; var13++) {
                int var10002;
                if (var11 < field5923) {
                    int var28 = arg0[field5923 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class165 var29 = field5895.method1942(-18411, var28 - 1);
                        var5[var13] += var29.field2342;
                        var6[var13] += var29.field2334;
                        var7[var13] += var29.field2336;
                        var8[var13] += var29.field2335;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field5923 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class165 var31 = field5895.method1942(-18411, var30 - 1);
                        var5[var13] -= var31.field2342;
                        var6[var13] -= var31.field2334;
                        var7[var13] -= var31.field2336;
                        var8[var13] -= var31.field2335;
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
                for (int var19 = -5; var19 < field5927; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field5927) {
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
                        if ((arg0[field5923 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field5923 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class117.method925(var15 / var18, var14 * 256 / var17, 2, var16 / var18);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field5923 * var19 + var10;
                            int var27 = class121.field1717[class369.method2281(127, class391.method2398(var25, 96, -1669)) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "()V")
    public static void method2443() {
        field5896 = null;
        field5895 = null;
        field5897 = null;
        field5891 = null;
        field5893 = null;
        field5894 = null;
        field5889 = null;
        field5892 = null;
        field5890 = null;
        field5901 = null;
        field5904 = null;
        field5906 = null;
        field5900 = null;
        field5903 = null;
        field5912 = null;
        field5913 = null;
        field5920 = null;
        field5928 = null;
        field5914 = null;
        field5919 = null;
        field5911 = null;
        field5922 = null;
        field5915 = null;
        field5929 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lya;IIIIIII[S[BZ)V")
    private static final void method2444(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method386(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field5912[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method386(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class89.method789(arg7 >> 6 & 0x3, field5899, arg0, 6, arg5, arg3, arg4, var12, arg1, arg2, var11, field5912[arg6], field5901);
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
                class222 var18 = field5897.method786(arg8[var16] & 0xFFFF, 0);
                if (var18.field3182 == -1) {
                    int var19 = -3355444;
                    if (var18.field3200 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method310(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method391(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method310(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method391(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method310(arg1, arg2, arg4, -1, 0);
                            arg0.method391(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method310(var14, arg2, arg4, -1, 0);
                            arg0.method391(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method310(var14, arg2, arg4, -1, 0);
                            arg0.method391(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method310(arg1, arg2, arg4, -1, 0);
                            arg0.method391(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method391(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method391(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method391(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method391(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method391(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method391(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lya;II)V")
    public static final void method2445(class38 arg0, int arg1, int arg2) {
        class65 var3 = new class65(field5892.method2368(field5889.field4964, false, "area"));
        int var4 = var3.method577(255);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method577(255);
        }
        int var7 = var3.method577(255);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method577(255);
        }
        while (true) {
            while (var3.field827 < var3.field783.length) {
                if (var3.method577(255) == 0) {
                    int var22 = var3.method577(255);
                    int var23 = var3.method577(255);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field5926;
                            int var27 = var23 * 64 + var25 - field5910;
                            method2447(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method577(255);
                    int var29 = var3.method577(255);
                    int var30 = var3.method577(255);
                    int var31 = var3.method577(255);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field5926;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field5910;
                            method2447(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field5920 = new byte[field5927 * field5923];
            field5928 = new short[field5927 * field5923];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field5927 * field5923];
                for (int var13 = 0; var13 < field5929[var11].length; var13++) {
                    for (int var19 = 0; var19 < field5929[var11][0].length; var19++) {
                        class493 var20 = field5929[var11][var13][var19];
                        if (var20 != null) {
                            for (class18 var21 = (class18) var20.method2955(62); var21 != null; var21 = (class18) var20.method2952((byte) -64)) {
                                var12[(var19 * 64 + var21.field202) * field5923 + var13 * 64 + var21.field203] = (byte) var21.field208;
                            }
                        }
                    }
                }
                method2442(var12, field5920, field5928, arg1, arg2);
                for (int var14 = 0; var14 < field5929[var11].length; var14++) {
                    for (int var15 = 0; var15 < field5929[var11][0].length; var15++) {
                        class493 var16 = field5929[var11][var14][var15];
                        if (var16 != null) {
                            for (class18 var17 = (class18) var16.method2955(62); var17 != null; var17 = (class18) var16.method2952((byte) -64)) {
                                int var18 = (var15 * 64 + var17.field202) * field5923 + var14 * 64 + var17.field203;
                                var17.field208 = (field5920[var18] & 0xFF) << 16 | field5928[var18] & 0xFFFF;
                                if (var17.field208 != 0) {
                                    var17.field208 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method2442(field5913, field5920, field5928, arg1, arg2);
            field5913 = null;
            method2452();
            return;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lya;Laq;IIII)V")
    private static final void method2446(class38 arg0, class111 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field1569 = ((arg1.field1566 - field5917) * arg2 + arg4 >> 16) + field5909;
        arg1.field1564 = field5924 - ((arg1.field1560 - field5916) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lya;Liv;IIII[I[I)V")
    private static final void method2447(class38 arg0, class65 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method577(255);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method577(255);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field5913[field5923 * arg5 + arg4] = (byte) var11;
                    field5914[field5923 * arg5 + arg4] = 0;
                } else {
                    field5914[field5923 * arg5 + arg4] = (byte) var11;
                    field5919[field5923 * arg5 + arg4] = 0;
                    field5913[field5923 * arg5 + arg4] = arg1.method629(false);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method577(255);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method577(255);
                var18 = arg1.method577(255);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method577(255);
            }
            if (var15 == 0) {
                field5913[field5923 * arg5 + arg4] = (byte) var16;
                field5914[field5923 * arg5 + arg4] = (byte) var17;
                field5919[field5923 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field5911[field5923 * arg5 + arg4] = (short) (arg1.method623((byte) 107) + 1);
                    field5922[field5923 * arg5 + arg4] = arg1.method629(false);
                } else if (var19 > 1) {
                    field5911[field5923 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method623((byte) -106);
                        var21[var22] = arg1.method629(false);
                    }
                    field5915.method878((long) (arg4 << 16 | arg5), -2301, new class115(var20, var21));
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method623((byte) 107);
                        var24[var25] = arg1.method629(false);
                    }
                }
                if (field5929[var15 - 1][arg2 - (field5926 >> 6)][arg3 - (field5910 >> 6)] == null) {
                    field5929[var15 - 1][arg2 - (field5926 >> 6)][arg3 - (field5910 >> 6)] = new class493();
                }
                class18 var26 = new class18(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field5929[var15 - 1][arg2 - (field5926 >> 6)][arg3 - (field5910 >> 6)].method2948(51, var26);
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lya;)Lpk;")
    public static final class133 method2448(class38 arg0) {
        int var1 = field5921 - field5917;
        int var2 = field5908 - field5916;
        int var3 = (field5925 - field5909 << 16) / var1;
        int var4 = (field5924 - field5918 << 16) / var2;
        return method2454(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "()V")
    public static final void method2449() {
        field5913 = new byte[field5927 * field5923];
        field5914 = new byte[field5927 * field5923];
        field5919 = new byte[field5927 * field5923];
        field5911 = new short[field5927 * field5923];
        field5922 = new byte[field5927 * field5923];
        field5915 = new class106(1024);
        field5929 = new class493[3][field5923 >> 6][field5927 >> 6];
        field5912 = new int[field5896.field7126 + 1];
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "()V")
    public static final void method2450() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field5900.field165; var1++) {
            boolean var2 = field5889.method2146(false, var0, field5900.field166[var1] >> 28 & 0x3, field5900.field166[var1] & 0x3FFF, field5900.field166[var1] >> 14 & 0x3FFF);
            if (var2) {
                class111 var3 = new class111(field5900.field160[var1]);
                var3.field1566 = var0[1] - field5926;
                var3.field1560 = var0[2] - field5910;
                field5903.method1015(false, var3);
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lya;IIII[S[B)V")
    private static final void method2451(class38 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class222 var8 = field5897.method786(arg5[var7] & 0xFFFF, 0);
            int var9 = var8.field3182;
            if (var9 != -1) {
                class77 var10 = field5893.method2005(1409, var9);
                class16 var11 = var10.method713(var8.field3214 ? var8.field3237 : false, arg0, var8.field3229 ? arg6[var7] >> 6 & 0x3 : 0, 16306);
                if (var11 != null) {
                    int var12 = arg3 * var11.method125() >> 2;
                    int var13 = arg4 * var11.method117() >> 2;
                    if (var10.field1048) {
                        int var14 = var8.field3206;
                        int var15 = var8.field3180;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field1045 == 0) {
                            var11.method120(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method121(arg1, arg2 + arg4 - var13, var12, var13, 0, var10.field1045 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "()V")
    private static final void method2452() {
        for (int var0 = 0; var0 < field5923; var0++) {
            for (int var11 = 0; var11 < field5927; var11++) {
                int var12 = field5911[field5923 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class115 var13 = (class115) field5915.method875((long) (var0 << 16 | var11), 125);
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field1616.length; var14++) {
                                class222 var15 = field5897.method786(var13.field1616[var14] & 0xFFFF, 0);
                                int var16 = var15.field3189;
                                if (var15.field3233 != null) {
                                    class222 var17 = var15.method1509(field5894, (byte) -84);
                                    if (var17 != null) {
                                        var16 = var17.field3189;
                                    }
                                }
                                if (var16 != -1) {
                                    class111 var18 = new class111(var16);
                                    var18.field1566 = var0;
                                    var18.field1560 = var11;
                                    field5903.method1015(false, var18);
                                }
                            }
                        }
                    } else {
                        class222 var19 = field5897.method786(var12 - 1, 0);
                        int var20 = var19.field3189;
                        if (var19.field3233 != null) {
                            class222 var21 = var19.method1509(field5894, (byte) 97);
                            if (var21 != null) {
                                var20 = var21.field3189;
                            }
                        }
                        if (var20 != -1) {
                            class111 var22 = new class111(var20);
                            var22.field1566 = var0;
                            var22.field1560 = var11;
                            field5903.method1015(false, var22);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field5929[0].length; var2++) {
                for (int var3 = 0; var3 < field5929[0][0].length; var3++) {
                    class493 var4 = field5929[var1][var2][var3];
                    if (var4 != null) {
                        for (class18 var5 = (class18) var4.method2955(62); var5 != null; var5 = (class18) var4.method2952((byte) -121)) {
                            if (var5.field205 != null) {
                                for (int var6 = 0; var6 < var5.field205.length; var6++) {
                                    class222 var7 = field5897.method786(var5.field205[var6] & 0xFFFF, 0);
                                    int var8 = var7.field3189;
                                    if (var7.field3233 != null) {
                                        class222 var9 = var7.method1509(field5894, (byte) -10);
                                        if (var9 != null) {
                                            var8 = var9.field3189;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class111 var10 = new class111(var8);
                                        var10.field1566 = ((field5926 >> 6) + var2) * 64 + var5.field203 - field5926;
                                        var10.field1560 = ((field5910 >> 6) + var3) * 64 + var5.field202 - field5910;
                                        field5903.method1015(false, var10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(II)Ltn;")
    public static final class59 method2453(int arg0, int arg1) {
        class59 var2 = new class59();
        for (class355 var3 = (class355) field5890.method880((byte) -23); var3 != null; var3 = (class355) field5890.method879((byte) -20)) {
            if (var3.field4948 && var3.method2143(-85, arg1, arg0)) {
                var2.method536(-126, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(Lya;IIII)Lpk;")
    private static final class133 method2454(class38 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class111 var5 = (class111) field5903.method1018(97); var5 != null; var5 = (class111) field5903.method1022((byte) -112)) {
            method2446(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field5903;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(Lya;)V")
    public static final void method2455(class38 arg0) {
        int var1 = field5921 - field5917;
        int var2 = field5908 - field5916;
        int var3 = (field5925 - field5909 << 16) / var1;
        int var4 = (field5924 - field5918 << 16) / var2;
        method2440(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lga;III)I")
    private static final int method2456(class277 arg0, int arg1, int arg2, int arg3) {
        class345 var4 = field5896.method2918(4, arg1);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field4786;
        if (var5 >= 0 && arg0.method1780(-31305, var5).field1439) {
            var5 = -1;
        }
        int var9;
        if (var4.field4778 >= 0) {
            int var6 = var4.field4778;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class121.field1717[class369.method2281(127, class20.method185(96, (byte) 66, var8)) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class121.field1717[class369.method2281(125, class20.method185(96, (byte) 66, arg0.method1780(-31305, var5).field1454)) & 0xFFFF] | 0xFF000000;
        } else if (var4.field4791 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field4791;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class121.field1717[class369.method2281(-52, class20.method185(96, (byte) 66, var12)) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "()V")
    public static final void method2457() {
        field5913 = null;
        field5920 = null;
        field5928 = null;
        field5914 = null;
        field5919 = null;
        field5911 = null;
        field5922 = null;
        field5915 = null;
        field5929 = null;
        field5912 = null;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)Lcn;")
    public static final class355 method2458(int arg0) {
        return (class355) field5890.method875((long) arg0, 124);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lga;II)V")
    public static final void method2459(class277 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < field5896.field7126; var3++) {
            field5912[var3 + 1] = method2456(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2460(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5917 = arg0 - field5926;
        field5908 = arg1 - field5910;
        field5921 = arg2 - field5926;
        field5916 = arg3 - field5910;
        field5909 = arg4;
        field5918 = arg5;
        field5925 = arg6;
        field5924 = arg7;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lfs;Lkb;Lqd;Lwf;Lpj;Lwi;Lvs;)V")
    public static final void method2461(class387 arg0, class485 arg1, class312 arg2, class89 arg3, class99 arg4, class325 arg5, class416 arg6) {
        field5892 = arg0;
        field5896 = arg1;
        field5895 = arg2;
        field5897 = arg3;
        field5891 = arg4;
        field5893 = arg5;
        field5894 = arg6;
        field5890.method874(0);
        int var7 = field5892.method2358("details", (byte) 40);
        int[] var8 = field5892.method2383(16947, var7);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class355 var10 = class349.method2106(var7, var8[var9], field5892, 0);
            field5890.method878((long) var10.field4954, -2301, var10);
        }
        class281.method1798(true, false, false);
    }
}
