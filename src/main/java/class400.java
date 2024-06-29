import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class400 {

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "Lbn;")
    private static class256 field5951 = new class256(16);

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "[S")
    private static short[] field5955 = new short[1];

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "[B")
    private static byte[] field5958 = new byte[1];

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field5960 = (int) (Math.random() * 11.0D) - 5;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public static int field5959 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Lbd;")
    public static class37 field5952 = new class37();

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "F")
    public static float field5953;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "F")
    public static float field5957;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
    public static int field5961;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    public static int field5962;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public static int field5963;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public static int field5964;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public static int field5965;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
    public static int field5967;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
    public static int field5969;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
    public static int field5970;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
    public static int field5973;

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
    public static int field5974;

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
    public static int field5975;

    @OriginalMember(owner = "client!pc", name = "F", descriptor = "I")
    public static int field5980;

    @OriginalMember(owner = "client!pc", name = "G", descriptor = "I")
    public static int field5981;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "Lo;")
    public static class21 field5950;

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "Lbn;")
    private static class256 field5978;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "Lpe;")
    public static class362 field5954;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "Lmo;")
    public static class447 field5949;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "[B")
    private static byte[] field5966;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "[B")
    private static byte[] field5968;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "[B")
    private static byte[] field5971;

    @OriginalMember(owner = "client!pc", name = "H", descriptor = "[B")
    private static byte[] field5982;

    @OriginalMember(owner = "client!pc", name = "I", descriptor = "[B")
    private static byte[] field5983;

    @OriginalMember(owner = "client!pc", name = "C", descriptor = "[I")
    private static int[] field5977;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "[S")
    private static short[] field5972;

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "[S")
    private static short[] field5979;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "[[[B")
    public static byte[][][] field5956;

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "[[[Llc;")
    private static class385[][][] field5976;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "()V", line = 4)
    public static final void method2503() {
        field5966 = new byte[field5981 * field5967];
        field5968 = new byte[field5981 * field5967];
        field5983 = new byte[field5981 * field5967];
        field5979 = new short[field5981 * field5967];
        field5971 = new byte[field5981 * field5967];
        field5978 = new class256(1024);
        field5976 = new class385[3][field5981 >> 6][field5967 >> 6];
        field5977 = new int[class413.field6112 + 1];
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V", line = 14)
    public static final void method2504(int arg0) {
        field5950 = (class21) field5951.method1770(-880, (long) arg0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lah;II)V", line = 19)
    public static final void method2505(class215 arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class413.field6112; var3++) {
            field5977[var3 + 1] = method2516(arg0, var3, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Le;IIII[S[B)V", line = 28)
    private static final void method2506(class312 arg0, int arg1, int arg2, int arg3, int arg4, short[] arg5, byte[] arg6) {
        if (arg5 == null) {
            return;
        }
        for (int var7 = 0; var7 < arg5.length; var7++) {
            class127 var8 = class137.method1003(arg5[var7] & 0xFFFF, -30796);
            int var9 = var8.field2011;
            if (var9 != -1) {
                class138 var10 = class94.method551(6635, var9);
                class356 var11 = var10.method1008(var8.field1996 ? var8.field1999 : false, var8.field1986 ? arg6[var7] >> 6 & 0x3 : 0, (byte) -72, arg0);
                if (var11 != null) {
                    int var12 = arg3 * var11.method2318() >> 2;
                    int var13 = arg4 * var11.method2315() >> 2;
                    if (var10.field2152) {
                        int var14 = var8.field2014;
                        int var15 = var8.field1944;
                        if ((arg6[var7] >> 6 & 0x1) == 1) {
                            int var16 = var14;
                            var14 = var15;
                            var15 = var16;
                        }
                        var12 = arg3 * var14;
                        var13 = arg4 * var15;
                    }
                    if (var12 != 0 && var13 != 0) {
                        if (var10.field2153 == 0) {
                            var11.method2320(arg1, arg2 + arg4 - var13, var12, var13);
                        } else {
                            var11.method420(arg1, arg2 + arg4 - var13, var12, var13, 1, var10.field2153 | 0xFF000000, 1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Le;Ljg;IIII[I[I)V", line = 87)
    private static final void method2507(class312 arg0, class186 arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
        int var8 = arg1.method1322(false);
        if ((var8 & 0x1) == 0) {
            boolean var9 = (var8 & 0x2) == 0;
            int var10 = var8 >> 2 & 0x3F;
            if (var10 != 62) {
                int var11;
                if (var10 == 63) {
                    var11 = arg1.method1322(false);
                } else if (var9) {
                    var11 = arg6[var10];
                } else {
                    var11 = arg7[var10];
                }
                if (var9) {
                    field5966[field5981 * arg5 + arg4] = (byte) var11;
                    field5968[field5981 * arg5 + arg4] = 0;
                } else {
                    field5968[field5981 * arg5 + arg4] = (byte) var11;
                    field5983[field5981 * arg5 + arg4] = 0;
                    field5966[field5981 * arg5 + arg4] = arg1.method1327((byte) -123);
                }
            }
            return;
        }
        int var12 = (var8 >> 1 & 0x3) + 1;
        boolean var13 = (var8 & 0x8) != 0;
        boolean var14 = (var8 & 0x10) != 0;
        for (int var15 = 0; var15 < var12; var15++) {
            int var16 = arg1.method1322(false);
            int var17 = 0;
            int var18 = 0;
            if (var13) {
                var17 = arg1.method1322(false);
                var18 = arg1.method1322(false);
            }
            int var19 = 0;
            if (var14) {
                var19 = arg1.method1322(false);
            }
            if (var15 == 0) {
                field5966[field5981 * arg5 + arg4] = (byte) var16;
                field5968[field5981 * arg5 + arg4] = (byte) var17;
                field5983[field5981 * arg5 + arg4] = (byte) var18;
                if (var19 == 1) {
                    field5979[field5981 * arg5 + arg4] = (short) (arg1.method1272((byte) -106) + 1);
                    field5971[field5981 * arg5 + arg4] = arg1.method1327((byte) -108);
                } else if (var19 > 1) {
                    field5979[field5981 * arg5 + arg4] = -1;
                    short[] var20 = new short[var19];
                    byte[] var21 = new byte[var19];
                    for (int var22 = 0; var22 < var19; var22++) {
                        var20[var22] = (short) arg1.method1272((byte) -64);
                        var21[var22] = arg1.method1327((byte) -105);
                    }
                    field5978.method1766((long) (arg4 << 16 | arg5), new class55(var20, var21), 89);
                }
            } else {
                short[] var23 = null;
                byte[] var24 = null;
                if (var19 > 0) {
                    var23 = new short[var19];
                    var24 = new byte[var19];
                    for (int var25 = 0; var25 < var19; var25++) {
                        var23[var25] = (short) arg1.method1272((byte) -107);
                        var24[var25] = arg1.method1327((byte) -89);
                    }
                }
                if (field5976[var15 - 1][arg2 - (field5973 >> 6)][arg3 - (field5974 >> 6)] == null) {
                    field5976[var15 - 1][arg2 - (field5973 >> 6)][arg3 - (field5974 >> 6)] = new class385();
                }
                class289 var26 = new class289(arg4 & 0x3F, arg5 & 0x3F, var16, var17, var18, var23, var24);
                field5976[var15 - 1][arg2 - (field5973 >> 6)][arg3 - (field5974 >> 6)].method2442(var26, (byte) 120);
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "()V", line = 224)
    public static final void method2508() {
        int[] var0 = new int[3];
        for (int var1 = 0; var1 < field5954.field5531; var1++) {
            boolean var2 = field5950.method152(field5954.field5523[var1] >> 28 & 0x3, field5954.field5523[var1] >> 14 & 0x3FFF, field5954.field5523[var1] & 0x3FFF, (byte) -90, var0);
            if (var2) {
                class222 var3 = new class222(field5954.field5522[var1]);
                var3.field3699 = var0[1] - field5973;
                var3.field3691 = var0[2] - field5974;
                field5952.method245(500, var3);
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "()V", line = 245)
    public static final void method2509() {
        field5966 = null;
        field5982 = null;
        field5972 = null;
        field5968 = null;
        field5983 = null;
        field5979 = null;
        field5971 = null;
        field5978 = null;
        field5976 = null;
        field5977 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Le;Lbr;IIII)V", line = 257)
    private static final void method2510(class312 arg0, class222 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.field3693 = ((arg1.field3699 - field5963) * arg2 + arg4 >> 16) + field5965;
        arg1.field3685 = field5975 - ((arg1.field3691 - field5962) * arg3 + arg5 >> 16);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Le;IIIIIII[S[BZ)V", line = 261)
    private static final void method2511(class312 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, short[] arg8, byte[] arg9, boolean arg10) {
        if (arg10 || arg5 != 0 || arg6 > 0) {
            if (arg6 == 0) {
                arg0.method563(arg1, arg2, arg3, arg4, arg5, 0);
            } else {
                int var11 = arg7 & 0x3F;
                if (var11 == 0 || arg3 <= 1 || arg4 <= 1) {
                    int var13 = field5977[arg6];
                    if (arg10 || var13 != 0) {
                        arg0.method563(arg1, arg2, arg3, arg4, var13, 0);
                    }
                } else {
                    int var12 = arg10 ? 0 : 1;
                    class12.method120(arg3, var12, arg2, arg5, arg4, field5977[arg6], field5961, arg1, arg0, var11, field5956, true, arg7 >> 6 & 0x3);
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
                class127 var18 = class137.method1003(arg8[var16] & 0xFFFF, -30796);
                if (var18.field2011 == -1) {
                    int var19 = -3355444;
                    if (var18.field2021 == 1) {
                        var19 = -3407872;
                    }
                    int var20 = arg9[var16] >> 6 & 0x3;
                    if (var17 == 0) {
                        if (var20 == 0) {
                            arg0.method560(arg1, arg2, arg4, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method684(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method560(var14, arg2, arg4, var19, 0);
                        } else {
                            arg0.method684(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 2) {
                        if (var20 == 0) {
                            arg0.method560(arg1, arg2, arg4, -1, 0);
                            arg0.method684(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method560(var14, arg2, arg4, -1, 0);
                            arg0.method684(arg1, arg2, arg3, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method560(var14, arg2, arg4, -1, 0);
                            arg0.method684(arg1, var15, arg3, var19, 0);
                        } else {
                            arg0.method560(arg1, arg2, arg4, -1, 0);
                            arg0.method684(arg1, var15, arg3, var19, 0);
                        }
                    } else if (var17 == 3) {
                        if (var20 == 0) {
                            arg0.method684(arg1, arg2, 1, var19, 0);
                        } else if (var20 == 1) {
                            arg0.method684(var14, arg2, 1, var19, 0);
                        } else if (var20 == 2) {
                            arg0.method684(var14, var15, 1, var19, 0);
                        } else {
                            arg0.method684(arg1, var15, 1, var19, 0);
                        }
                    } else if (var17 == 9) {
                        if (var20 == 0 || var20 == 2) {
                            for (int var22 = 0; var22 < arg4; var22++) {
                                arg0.method684(arg1 + var22, var15 - var22, 1, var19, 0);
                            }
                        } else {
                            for (int var21 = 0; var21 < arg4; var21++) {
                                arg0.method684(arg1 + var21, arg2 + var21, 1, var19, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Ler;", line = 423)
    public static final class54 method2512(int arg0, int arg1) {
        class54 var2 = new class54();
        for (class21 var3 = (class21) field5951.method1776(true); var3 != null; var3 = (class21) field5951.method1773(-1)) {
            if (var3.field278 && var3.method157(12800, arg1, arg0)) {
                var2.method363(true, var3);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Le;)V", line = 442)
    public static final void method2513(class312 arg0) {
        int var1 = field5980 - field5963;
        int var2 = field5969 - field5962;
        int var3 = (field5970 - field5965 << 16) / var1;
        int var4 = (field5975 - field5964 << 16) / var2;
        method2515(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lmo;)V", line = 455)
    public static final void method2514(class447 arg0) {
        field5949 = arg0;
        field5951.method1764(83);
        int var1 = field5949.method2791((byte) 102, "details");
        int[] var2 = field5949.method2764(var1, (byte) -126);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class21 var4 = class257.method1779(field5949, var2[var3], -14296, var1);
            field5951.method1766((long) var4.field279, var4, 75);
        }
        class213.method1498(0, false, true);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Le;IIII)V", line = 476)
    private static final void method2515(class312 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = field5980 - field5963;
        int var6 = field5969 - field5962;
        if (field5980 < field5981) {
            var5++;
        }
        if (field5969 < field5967) {
            var6++;
        }
        for (int var7 = 0; var7 < var5; var7++) {
            int var49 = (arg1 * var7 + arg3 >> 16) + field5965;
            int var50 = ((var7 + 1) * arg1 + arg3 >> 16) + field5965;
            int var51 = var50 - var49;
            if (var51 > 0) {
                int var52 = field5963 + var7;
                if (var52 >= 0 && var52 < field5981) {
                    for (int var53 = 0; var53 < var6; var53++) {
                        int var54 = field5975 - ((var53 + 1) * arg2 + arg4 >> 16);
                        int var55 = field5975 - (arg2 * var53 + arg4 >> 16);
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = field5962 + var53;
                            int var58 = field5981 * var57 + var52;
                            int var59 = 0;
                            int var60 = 0;
                            int var61 = 0;
                            if (var57 >= 0 && var57 < field5967) {
                                var59 = (field5982[var58] & 0xFF) << 16 | field5972[var58] & 0xFFFF;
                                if (var59 != 0) {
                                    var59 |= 0xFF000000;
                                }
                                var60 = field5968[var58] & 0xFF;
                                var61 = field5979[var58] & 0xFFFF;
                            }
                            if (var59 == 0 && var60 == 0 && var61 == 0) {
                                int var62;
                                if (field5950.field266 != -1) {
                                    var62 = field5950.field266 | 0xFF000000;
                                } else if ((field5969 + var53 & 0x4) == (field5963 + var7 & 0x4)) {
                                    var62 = field5977[class105.field1469 + 1];
                                } else {
                                    var62 = -11840664;
                                }
                                if (var62 == 0) {
                                    var62 = -16777216;
                                }
                                arg0.method563(var49, var54, var51, var56, var62, 0);
                            } else if (var61 <= 0) {
                                method2511(arg0, var49, var54, var51, var56, var59, var60, field5983[var58], (short[]) null, (byte[]) null, true);
                            } else if (var61 == 65535) {
                                class55 var63 = (class55) field5978.method1770(-880, (long) (var52 << 16 | var57));
                                if (var63 != null) {
                                    method2511(arg0, var49, var54, var51, var56, var59, var60, field5983[var58], var63.field686, var63.field687, true);
                                }
                            } else {
                                field5955[0] = (short) (var61 - 1);
                                field5958[0] = field5971[var58];
                                method2511(arg0, var49, var54, var51, var56, var59, var60, field5983[var58], field5955, field5958, true);
                            }
                        }
                    }
                } else {
                    for (int var64 = 0; var64 < var6; var64++) {
                        int var65 = field5975 - ((var64 + 1) * arg2 + arg4 >> 16);
                        int var66 = field5975 - (arg2 * var64 + arg4 >> 16);
                        int var67 = var66 - var65;
                        int var68;
                        if (field5950.field266 != -1) {
                            var68 = field5950.field266 | 0xFF000000;
                        } else if ((field5969 + var64 & 0x4) == (field5963 + var7 & 0x4)) {
                            var68 = field5977[class105.field1469 + 1];
                        } else {
                            var68 = -11840664;
                        }
                        if (var68 == 0) {
                            var68 = -16777216;
                        }
                        arg0.method563(var49, var65, var51, var67, var68, 0);
                    }
                }
            }
        }
        for (int var8 = -16; var8 < var5 + 16; var8++) {
            int var38 = (arg1 * var8 + arg3 >> 16) + field5965;
            int var39 = ((var8 + 1) * arg1 + arg3 >> 16) + field5965;
            int var40 = var39 - var38;
            if (var40 > 0) {
                int var41 = field5963 + var8;
                if (var41 >= 0 && var41 < field5981) {
                    for (int var42 = -16; var42 < var6 + 16; var42++) {
                        int var43 = field5975 - ((var42 + 1) * arg2 + arg4 >> 16);
                        int var44 = field5975 - (arg2 * var42 + arg4 >> 16);
                        int var45 = var44 - var43;
                        if (var45 > 0) {
                            int var46 = field5962 + var42;
                            if (var46 >= 0 && var46 < field5967) {
                                int var47 = field5979[field5981 * var46 + var41] & 0xFFFF;
                                if (var47 <= 0) {
                                    method2506(arg0, var38, var43, var40, var45, (short[]) null, (byte[]) null);
                                } else if (var47 == 65535) {
                                    class55 var48 = (class55) field5978.method1770(-880, (long) (var41 << 16 | var46));
                                    if (var48 != null) {
                                        method2506(arg0, var38, var43, var40, var45, var48.field686, var48.field687);
                                    }
                                } else {
                                    field5955[0] = (short) (var47 - 1);
                                    field5958[0] = field5971[field5981 * var46 + var41];
                                    method2506(arg0, var38, var43, var40, var45, field5955, field5958);
                                }
                            }
                        }
                    }
                }
            }
        }
        int var9 = field5963 >> 6;
        int var10 = field5962 >> 6;
        if (var9 < 0) {
            var9 = 0;
        }
        if (var10 < 0) {
            var10 = 0;
        }
        int var11 = field5980 >> 6;
        int var12 = field5969 >> 6;
        if (var11 >= field5976[0].length) {
            var11 = field5976[0].length - 1;
        }
        if (var12 >= field5976[0][0].length) {
            var12 = field5976[0][0].length - 1;
        }
        for (int var13 = 0; var13 < 3; var13++) {
            for (int var14 = var9; var14 <= var11; var14++) {
                for (int var27 = var10; var27 <= var12; var27++) {
                    class385 var28 = field5976[var13][var14][var27];
                    if (var28 != null) {
                        int var29 = ((field5973 >> 6) + var14) * 64;
                        int var30 = ((field5974 >> 6) + var27) * 64;
                        for (class289 var31 = (class289) var28.method2430(67); var31 != null; var31 = (class289) var28.method2435(-224)) {
                            int var32 = var31.field4627 + var29 - field5973 - field5963;
                            int var33 = var31.field4626 + var30 - field5974 - field5962;
                            int var34 = (arg1 * var32 + arg3 >> 16) + field5965;
                            int var35 = ((var32 + 1) * arg1 + arg3 >> 16) + field5965;
                            int var36 = field5975 - ((var33 + 1) * arg2 + arg4 >> 16);
                            int var37 = field5975 - (arg2 * var33 + arg4 >> 16);
                            method2511(arg0, var34, var36, var35 - var34, var37 - var36, var31.field4625, var31.field4629 & 0xFF, var31.field4623, var31.field4628, var31.field4624, false);
                        }
                    }
                }
            }
            for (int var15 = var9; var15 <= var11; var15++) {
                for (int var16 = var10; var16 <= var12; var16++) {
                    class385 var17 = field5976[var13][var15][var16];
                    if (var17 != null) {
                        int var18 = ((field5973 >> 6) + var15) * 64;
                        int var19 = ((field5974 >> 6) + var16) * 64;
                        for (class289 var20 = (class289) var17.method2430(67); var20 != null; var20 = (class289) var17.method2435(-224)) {
                            int var21 = var20.field4627 + var18 - field5973 - field5963;
                            int var22 = var20.field4626 + var19 - field5974 - field5962;
                            int var23 = (arg1 * var21 + arg3 >> 16) + field5965;
                            int var24 = ((var21 + 1) * arg1 + arg3 >> 16) + field5965;
                            int var25 = field5975 - ((var22 + 1) * arg2 + arg4 >> 16);
                            int var26 = field5975 - (arg2 * var22 + arg4 >> 16);
                            method2506(arg0, var23, var25, var24 - var23, var26 - var25, var20.field4628, var20.field4624);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lah;III)I", line = 820)
    private static final int method2516(class215 arg0, int arg1, int arg2, int arg3) {
        class235 var4 = class345.method2257(arg1, true);
        if (var4 == null) {
            return 0;
        }
        int var5 = var4.field3921;
        if (var5 >= 0 && arg0.method989(var5, (byte) 44).field4269) {
            var5 = -1;
        }
        int var9;
        if (var4.field3931 >= 0) {
            int var6 = var4.field3931;
            int var7 = (var6 & 0x7F) + arg3;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 127) {
                var7 = 127;
            }
            int var8 = (arg2 + var6 & 0xFC00) + (var6 & 0x380) + var7;
            var9 = class62.field814[class99.method747(class72.method456(var8, false, 96), -9560) & 0xFFFF] | 0xFF000000;
        } else if (var5 >= 0) {
            var9 = class62.field814[class99.method747(class72.method456(arg0.method989(var5, (byte) 109).field4284, false, 96), -9560) & 0xFFFF] | 0xFF000000;
        } else if (var4.field3935 == -1) {
            var9 = 0;
        } else {
            int var10 = var4.field3935;
            int var11 = (var10 & 0x7F) + arg3;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 127) {
                var11 = 127;
            }
            int var12 = (arg2 + var10 & 0xFC00) + (var10 & 0x380) + var11;
            var9 = class62.field814[class99.method747(class72.method456(var12, false, 96), -9560) & 0xFFFF] | 0xFF000000;
        }
        return var9;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(Le;IIII)Lbd;", line = 886)
    private static final class37 method2517(class312 arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class222 var5 = (class222) field5952.method253((byte) -6); var5 != null; var5 = (class222) field5952.method247((byte) 109)) {
            method2510(arg0, var5, arg1, arg2, arg3, arg4);
        }
        return field5952;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(Le;)Lbd;", line = 897)
    public static final class37 method2518(class312 arg0) {
        int var1 = field5980 - field5963;
        int var2 = field5969 - field5962;
        int var3 = (field5970 - field5965 << 16) / var1;
        int var4 = (field5975 - field5964 << 16) / var2;
        return method2517(arg0, var3, var4, 0, 0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Le;II)V", line = 908)
    public static final void method2519(class312 arg0, int arg1, int arg2) {
        class186 var3 = new class186(field5949.method2772(true, field5950.field273, "area"));
        int var4 = var3.method1322(false);
        int[] var5 = new int[var4];
        for (int var6 = 0; var6 < var4; var6++) {
            var5[var6] = var3.method1322(false);
        }
        int var7 = var3.method1322(false);
        int[] var8 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1322(false);
        }
        while (true) {
            while (var3.field3044 < var3.field3066.length) {
                if (var3.method1322(false) == 0) {
                    int var22 = var3.method1322(false);
                    int var23 = var3.method1322(false);
                    for (int var24 = 0; var24 < 64; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            int var26 = var22 * 64 + var24 - field5973;
                            int var27 = var23 * 64 + var25 - field5974;
                            method2507(arg0, var3, var22, var23, var26, var27, var5, var8);
                        }
                    }
                } else {
                    int var28 = var3.method1322(false);
                    int var29 = var3.method1322(false);
                    int var30 = var3.method1322(false);
                    int var31 = var3.method1322(false);
                    for (int var32 = 0; var32 < 8; var32++) {
                        for (int var33 = 0; var33 < 8; var33++) {
                            int var34 = var28 * 64 + var30 * 8 + var32 - field5973;
                            int var35 = var29 * 64 + var31 * 8 + var33 - field5974;
                            method2507(arg0, var3, var28, var29, var34, var35, var5, var8);
                        }
                    }
                }
            }
            Object var10 = null;
            field5982 = new byte[field5981 * field5967];
            field5972 = new short[field5981 * field5967];
            for (int var11 = 0; var11 < 3; var11++) {
                byte[] var12 = new byte[field5981 * field5967];
                for (int var13 = 0; var13 < field5976[var11].length; var13++) {
                    for (int var19 = 0; var19 < field5976[var11][0].length; var19++) {
                        class385 var20 = field5976[var11][var13][var19];
                        if (var20 != null) {
                            for (class289 var21 = (class289) var20.method2430(67); var21 != null; var21 = (class289) var20.method2435(-224)) {
                                var12[(var19 * 64 + var21.field4626) * field5981 + var13 * 64 + var21.field4627] = (byte) var21.field4625;
                            }
                        }
                    }
                }
                method2522(var12, field5982, field5972, arg1, arg2);
                for (int var14 = 0; var14 < field5976[var11].length; var14++) {
                    for (int var15 = 0; var15 < field5976[var11][0].length; var15++) {
                        class385 var16 = field5976[var11][var14][var15];
                        if (var16 != null) {
                            for (class289 var17 = (class289) var16.method2430(67); var17 != null; var17 = (class289) var16.method2435(-224)) {
                                int var18 = (var15 * 64 + var17.field4626) * field5981 + var14 * 64 + var17.field4627;
                                var17.field4625 = (field5982[var18] & 0xFF) << 16 | field5972[var18] & 0xFFFF;
                                if (var17.field4625 != 0) {
                                    var17.field4625 |= 0xFF000000;
                                }
                            }
                        }
                    }
                }
            }
            method2522(field5966, field5982, field5972, arg1, arg2);
            field5966 = null;
            method2523();
            return;
        }
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "()V", line = 1090)
    public static void method2520() {
        field5950 = null;
        field5949 = null;
        field5951 = null;
        field5956 = null;
        field5955 = null;
        field5958 = null;
        field5954 = null;
        field5952 = null;
        field5977 = null;
        field5966 = null;
        field5982 = null;
        field5972 = null;
        field5968 = null;
        field5983 = null;
        field5979 = null;
        field5971 = null;
        field5978 = null;
        field5976 = null;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)Lo;", line = 1112)
    public static final class21 method2521(int arg0, int arg1) {
        for (class21 var2 = (class21) field5951.method1776(true); var2 != null; var2 = (class21) field5951.method1773(-1)) {
            if (var2.field278 && var2.method157(12800, arg1, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([B[B[SII)V", line = 1127)
    private static final void method2522(byte[] arg0, byte[] arg1, short[] arg2, int arg3, int arg4) {
        int[] var5 = new int[field5967];
        int[] var6 = new int[field5967];
        int[] var7 = new int[field5967];
        int[] var8 = new int[field5967];
        int[] var9 = new int[field5967];
        for (int var10 = -5; var10 < field5981; var10++) {
            int var11 = var10 + 5;
            int var12 = var10 - 5;
            for (int var13 = 0; var13 < field5967; var13++) {
                int var10002;
                if (var11 < field5981) {
                    int var28 = arg0[field5981 * var13 + var11] & 0xFF;
                    if (var28 > 0) {
                        class402 var29 = class92.method545(var28 - 1, (byte) 115);
                        var5[var13] += var29.field5999;
                        var6[var13] += var29.field6008;
                        var7[var13] += var29.field6006;
                        var8[var13] += var29.field5991;
                        var10002 = var9[var13]++;
                    }
                }
                if (var12 >= 0) {
                    int var30 = arg0[field5981 * var13 + var12] & 0xFF;
                    if (var30 > 0) {
                        class402 var31 = class92.method545(var30 - 1, (byte) 38);
                        var5[var13] -= var31.field5999;
                        var6[var13] -= var31.field6008;
                        var7[var13] -= var31.field6006;
                        var8[var13] -= var31.field5991;
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
                for (int var19 = -5; var19 < field5967; var19++) {
                    int var20 = var19 + 5;
                    if (var20 < field5967) {
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
                        if ((arg0[field5981 * var19 + var10] & 0xFF) == 0) {
                            int var22 = field5981 * var19 + var10;
                            arg1[var22] = 0;
                            arg2[var22] = 0;
                        } else {
                            int var23 = var17 == 0 ? 0 : class141.method1031(var14 * 256 / var17, var16 / var18, var15 / var18, (byte) 38);
                            int var24 = (var23 & 0x7F) + arg4;
                            if (var24 < 0) {
                                var24 = 0;
                            } else if (var24 > 127) {
                                var24 = 127;
                            }
                            int var25 = (arg3 + var23 & 0xFC00) + (var23 & 0x380) + var24;
                            int var26 = field5981 * var19 + var10;
                            int var27 = class62.field814[class99.method747(class27.method177(96, var25, 126748167), -9560) & 0xFFFF];
                            arg1[var26] = (byte) (var27 >> 16 & 0xFF);
                            arg2[var26] = (short) (var27 & 0xFFFF);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "()V", line = 1272)
    private static final void method2523() {
        for (int var0 = 0; var0 < field5981; var0++) {
            for (int var11 = 0; var11 < field5967; var11++) {
                int var12 = field5979[field5981 * var11 + var0] & 0xFFFF;
                if (var12 != 0) {
                    if (var12 == 65535) {
                        class55 var13 = (class55) field5978.method1770(-880, (long) (var0 << 16 | var11));
                        if (var13 != null) {
                            for (int var14 = 0; var14 < var13.field686.length; var14++) {
                                class127 var15 = class137.method1003(var13.field686[var14] & 0xFFFF, -30796);
                                int var16 = var15.field2003;
                                if (var15.field1984 != null) {
                                    class127 var17 = var15.method948((byte) -56);
                                    if (var17 != null) {
                                        var16 = var17.field2003;
                                    }
                                }
                                if (var16 != -1) {
                                    class222 var18 = new class222(var16);
                                    var18.field3699 = var0;
                                    var18.field3691 = var11;
                                    field5952.method245(500, var18);
                                }
                            }
                        }
                    } else {
                        class127 var19 = class137.method1003(var12 - 1, -30796);
                        int var20 = var19.field2003;
                        if (var19.field1984 != null) {
                            class127 var21 = var19.method948((byte) -127);
                            if (var21 != null) {
                                var20 = var21.field2003;
                            }
                        }
                        if (var20 != -1) {
                            class222 var22 = new class222(var20);
                            var22.field3699 = var0;
                            var22.field3691 = var11;
                            field5952.method245(500, var22);
                        }
                    }
                }
            }
        }
        for (int var1 = 0; var1 < 3; var1++) {
            for (int var2 = 0; var2 < field5976[0].length; var2++) {
                for (int var3 = 0; var3 < field5976[0][0].length; var3++) {
                    class385 var4 = field5976[var1][var2][var3];
                    if (var4 != null) {
                        for (class289 var5 = (class289) var4.method2430(67); var5 != null; var5 = (class289) var4.method2435(-224)) {
                            if (var5.field4628 != null) {
                                for (int var6 = 0; var6 < var5.field4628.length; var6++) {
                                    class127 var7 = class137.method1003(var5.field4628[var6] & 0xFFFF, -30796);
                                    int var8 = var7.field2003;
                                    if (var7.field1984 != null) {
                                        class127 var9 = var7.method948((byte) -126);
                                        if (var9 != null) {
                                            var8 = var9.field2003;
                                        }
                                    }
                                    if (var8 != -1) {
                                        class222 var10 = new class222(var8);
                                        var10.field3699 = ((field5973 >> 6) + var2) * 64 + var5.field4627 - field5973;
                                        var10.field3691 = ((field5974 >> 6) + var3) * 64 + var5.field4626 - field5974;
                                        field5952.method245(500, var10);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)Lo;", line = 1432)
    public static final class21 method2524(int arg0) {
        return (class21) field5951.method1770(-880, (long) arg0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIIII)V", line = 1442)
    public static final void method2525(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5963 = arg0 - field5973;
        field5969 = arg1 - field5974;
        field5980 = arg2 - field5973;
        field5962 = arg3 - field5974;
        field5965 = arg4;
        field5964 = arg5;
        field5970 = arg6;
        field5975 = arg7;
    }
}
