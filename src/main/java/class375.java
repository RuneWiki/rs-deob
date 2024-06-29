import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class375 {

    @OriginalMember(owner = "client!iu", name = "n", descriptor = "Z")
    public boolean field5406;

    @OriginalMember(owner = "client!iu", name = "l", descriptor = "Lkl;")
    private class51 field5404;

    @OriginalMember(owner = "client!iu", name = "j", descriptor = "Lsc;")
    private class211 field5402;

    @OriginalMember(owner = "client!iu", name = "A", descriptor = "I")
    public int field5419;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
    public int field5393;

    @OriginalMember(owner = "client!iu", name = "t", descriptor = "I")
    public int field5412;

    @OriginalMember(owner = "client!iu", name = "r", descriptor = "[[[B")
    private byte[][][] field5410;

    @OriginalMember(owner = "client!iu", name = "z", descriptor = "[[[B")
    public byte[][][] field5418;

    @OriginalMember(owner = "client!iu", name = "u", descriptor = "[[[B")
    private byte[][][] field5413;

    @OriginalMember(owner = "client!iu", name = "o", descriptor = "[[[I")
    public int[][][] field5407;

    @OriginalMember(owner = "client!iu", name = "m", descriptor = "[[[B")
    private byte[][][] field5405;

    @OriginalMember(owner = "client!iu", name = "y", descriptor = "[[[B")
    private byte[][][] field5417;

    @OriginalMember(owner = "client!iu", name = "q", descriptor = "[[I")
    private static int[][] field5409 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!iu", name = "w", descriptor = "I")
    public static int field5415 = 1407;

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!iu", name = "g", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!iu", name = "h", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!iu", name = "i", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!iu", name = "k", descriptor = "I")
    public static int field5403;

    @OriginalMember(owner = "client!iu", name = "p", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!iu", name = "s", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!iu", name = "v", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!iu", name = "x", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "[Ltr;")
    public static class176[] field5397;

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "[[[B")
    public byte[][][] field5395;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lpl;[[IBLnp;Lpl;Lpl;I)V")
    private final void method2282(class426 arg0, int[][] arg1, byte arg2, class313 arg3, class426 arg4, class426 arg5, int arg6) {
        if (arg2 != 59) {
            field5397 = null;
        }
        for (int var8 = 0; var8 < this.field5393; var8++) {
            for (int var9 = 0; var9 < this.field5419; var9++) {
                if (class419.field5850 == -1 || class212.method1376(class419.field5850, var9, true, arg6, var8)) {
                    byte var10 = this.field5413[arg6][var8][var9];
                    byte var11 = this.field5417[arg6][var8][var9];
                    int var12 = this.field5405[arg6][var8][var9] & 0xFF;
                    int var13 = this.field5410[arg6][var8][var9] & 0xFF;
                    class84 var14 = var12 == 0 ? null : this.field5404.method331(18990, var12 - 1);
                    class382 var15 = var13 == 0 ? null : this.field5402.method1371(var13 - 1, 97);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var17 = var14 == null ? 0 : class92.field1160[var10];
                        var16 = var15 == null ? 0 : class2.field29[var10];
                    } else if (var14 != null) {
                        var17 = class92.field1160[var10];
                    } else if (var15 != null) {
                        var16 = class92.field1160[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field1027 == -1 && var14.field1025 == -1 && var14.field1035 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg3.method655() ? var14.field1035 : var14.field1038;
                            if (class459.field6437) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field1021;
                                if (var14.field1027 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field1027;
                                }
                                if (var14.field1025 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var21[var19] = var14.field1025;
                                    var24 = true;
                                }
                                var19++;
                            }
                            if (!this.field5406 && arg6 == 0) {
                                class128.method810(var8, var9, var14.field1028, var14.field1024 * 8, var14.field1033);
                            }
                        }
                        if (!var24) {
                            var21 = null;
                        }
                        if (var15 == null) {
                            for (int var28 = 0; var28 < var16; var28++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var29 = var15.field5448;
                            if (class459.field6437) {
                                var29 = -1;
                            }
                            for (int var30 = 0; var30 < var16; var30++) {
                                var22[var19] = var29;
                                var23[var19] = var15.field5443;
                                var20[var19] = arg1[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = class148.field2180.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg0 == null ? null : new int[var31];
                        int[] var35 = arg0 == null && arg5 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = class148.field2180[var36];
                            int var46 = class135.field1787[var36];
                            if (var11 == 0) {
                                var32[var36] = var45;
                                var33[var36] = var46;
                            } else if (var11 == 1) {
                                var32[var36] = var46;
                                var33[var36] = 128 - var45;
                            } else if (var11 == 2) {
                                var32[var36] = 128 - var45;
                                var33[var36] = 128 - var46;
                            } else if (var11 == 3) {
                                var32[var36] = 128 - var46;
                                var33[var36] = var45;
                            }
                            if (var34 != null && class22.field286[var10][var36]) {
                                int var49 = (var8 << 7) + var45;
                                int var50 = (var9 << 7) + var45;
                                var34[var36] = arg0.method1209(var49, var50) - arg4.method1209(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg0 != null && !class22.field286[var10][var36]) {
                                    int var51 = (var8 << 7) + var45;
                                    int var52 = (var9 << 7) + var45;
                                    var35[var36] = arg4.method1209(var51, var52) - arg0.method1209(var51, var52);
                                } else if (arg5 != null && !class286.field4167[var10][var36]) {
                                    int var53 = (var8 << 7) + var45;
                                    int var54 = (var9 << 7) + var45;
                                    var35[var36] = arg5.method1209(var53, var54) - arg4.method1209(var53, var54);
                                }
                            }
                        }
                        int var37 = arg4.method1218(var8, var9);
                        int var38 = arg4.method1218(var8 + 1, var9);
                        int var39 = arg4.method1218(var8 + 1, var9 + 1);
                        int var40 = arg4.method1218(var8, var9 + 1);
                        if (arg6 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field1034) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field5418[arg6][var8][var9] = (byte) class248.method1549(this.field5418[arg6][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field5406) {
                            var42 = class401.method2391(var8, var9);
                            var43 = class347.method2171(var8, var9);
                            var44 = class289.method1808(var8, var9);
                        }
                        arg4.method1220(var8, var9, var32, var34, var33, var35, class252.field3715[var10], class349.field5051[var10], class334.field4856[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class448.method2614(arg6, var8, var9);
                    }
                }
            }
        }
        field5411++;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lnp;Lpl;Lpl;I)V")
    public final void method2283(class313 arg0, class426 arg1, class426 arg2, int arg3) {
        field5414++;
        if (class93.field1183 == null || class93.field1183.length != this.field5419) {
            class330.field4777 = new int[this.field5419];
            class338.field4934 = new int[this.field5419];
            class144.field1905 = new int[this.field5419];
            class93.field1183 = new int[this.field5419];
            class104.field1330 = new int[this.field5419];
        }
        int[][] var5 = new int[this.field5393][this.field5419];
        if (arg3 < 73) {
            this.field5395 = null;
        }
        for (int var6 = 0; var6 < this.field5412; var6++) {
            for (int var8 = 0; var8 < this.field5419; var8++) {
                class93.field1183[var8] = 0;
                class330.field4777[var8] = 0;
                class144.field1905[var8] = 0;
                class338.field4934[var8] = 0;
                class104.field1330[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field5393; var9++) {
                for (int var10 = 0; var10 < this.field5419; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (var19 < this.field5393) {
                        int var20 = this.field5410[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class382 var21 = this.field5402.method1371(var20 - 1, 44);
                            class93.field1183[var10] += var21.field5453;
                            class330.field4777[var10] += var21.field5450;
                            class144.field1905[var10] += var21.field5459;
                            class338.field4934[var10] += var21.field5457;
                            var10002 = class104.field1330[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field5410[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class382 var24 = this.field5402.method1371(var23 - 1, 57);
                            class93.field1183[var10] -= var24.field5453;
                            class330.field4777[var10] -= var24.field5450;
                            class144.field1905[var10] -= var24.field5459;
                            class338.field4934[var10] -= var24.field5457;
                            var10002 = class104.field1330[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field5419; var16++) {
                        int var17 = var16 + 5;
                        if (this.field5419 > var17) {
                            var11 += class93.field1183[var17];
                            var12 += class330.field4777[var17];
                            var15 += class104.field1330[var17];
                            var14 += class338.field4934[var17];
                            var13 += class144.field1905[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var14 -= class338.field4934[var18];
                            var12 -= class330.field4777[var18];
                            var15 -= class104.field1330[var18];
                            var13 -= class144.field1905[var18];
                            var11 -= class93.field1183[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class394.method2355(var13 / var15, var11 * 256 / var14, true, var12 / var15);
                        }
                    }
                }
            }
            if (class185.field2744) {
                this.method2292(var6 == 0 ? arg1 : null, arg0, var6 == 0 ? arg2 : null, class53.field725[var6], var6, var5, (byte) -81);
            } else {
                this.method2282(var6 == 0 ? arg2 : null, var5, (byte) 59, arg0, class53.field725[var6], var6 == 0 ? arg1 : null, var6);
            }
            this.field5410[var6] = null;
            this.field5405[var6] = null;
            this.field5413[var6] = null;
            this.field5417[var6] = null;
        }
        if (!this.field5406) {
            if (class438.field6090 != 0) {
                class69.method411();
            }
            if (class45.field646) {
                class275.method1686();
            }
        }
        for (int var7 = 0; var7 < this.field5412; var7++) {
            class53.field725[var7].method1222();
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIIIIZIZLrp;I)V")
    private final void method2284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8, class276 arg9, int arg10) {
        if (arg3 == 1) {
            arg5 = 1;
        } else if (arg3 == 2) {
            arg5 = 1;
            arg10 = 1;
        } else if (arg3 == 3) {
            arg10 = 1;
        }
        field5396++;
        if (!arg8) {
            this.field5418 = null;
        }
        if (arg7 < 0 || this.field5393 <= arg7 || arg2 < 0 || this.field5419 <= arg2) {
            while (true) {
                int var14 = arg9.method1701(-23121);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg9.method1701(-23121);
                    return;
                }
                if (var14 <= 49) {
                    arg9.method1701(-23121);
                }
            }
        }
        if (!this.field5406 && !arg6) {
            class413.field5813[arg4][arg7][arg2] = 0;
        }
        while (true) {
            int var12 = arg9.method1701(-23121);
            if (var12 == 0) {
                if (this.field5406) {
                    this.field5407[0][arg7 + arg10][arg2 + arg5] = 0;
                    return;
                } else if (arg4 == 0) {
                    this.field5407[0][arg7 + arg10][arg2 + arg5] = -class451.method2633(arg1 + 556238, arg0 + 932731, (byte) 88) * 8;
                    return;
                } else {
                    this.field5407[arg4][arg7 + arg10][arg2 + arg5] = this.field5407[arg4 - 1][arg7 + arg10][arg2 + arg5] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg9.method1701(-23121);
                if (!this.field5406) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg4 == 0) {
                        this.field5407[0][arg7 + arg10][arg2 + arg5] = -var13 * 8;
                        return;
                    }
                    this.field5407[arg4][arg7 + arg10][arg2 + arg5] = this.field5407[arg4 - 1][arg7 + arg10][arg2 + arg5] - var13 * 8;
                    return;
                }
                this.field5407[0][arg7 + arg10][arg2 + arg5] = var13 * 8;
                return;
            }
            if (var12 <= 49) {
                if (arg6) {
                    arg9.method1701(-23121);
                } else {
                    this.field5405[arg4][arg7][arg2] = arg9.method1715((byte) -75);
                    this.field5413[arg4][arg7][arg2] = (byte) ((var12 - 2) / 4);
                    this.field5417[arg4][arg7][arg2] = (byte) class367.method2256(var12 + arg3 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!this.field5406 && !arg6) {
                    class413.field5813[arg4][arg7][arg2] = (byte) (var12 - 49);
                }
            } else if (!arg6) {
                this.field5410[arg4][arg7][arg2] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIIII)V")
    public final void method2285(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5394++;
        for (int var7 = arg1; var7 < (arg1 + arg2); var7++) {
            for (int var10 = arg3; var10 < (arg0 + arg3); var10++) {
                if (var10 >= 0 && this.field5393 > var10 && var7 >= 0 && this.field5419 > var7) {
                    this.field5407[arg5][var10][var7] = arg5 <= 0 ? 0 : this.field5407[arg5 - 1][var10][var7] - 240;
                }
            }
        }
        if (arg3 > 0 && arg3 < this.field5393) {
            for (int var8 = arg1 + 1; var8 < arg1 + arg2; var8++) {
                if (var8 >= 0 && this.field5419 > var8) {
                    this.field5407[arg5][arg3][var8] = this.field5407[arg5][arg3 - 1][var8];
                }
            }
        }
        if (arg1 > arg4 && this.field5419 > arg1) {
            for (int var9 = arg3 + 1; var9 < (arg0 + arg3); var9++) {
                if (var9 >= 0 && this.field5393 > var9) {
                    this.field5407[arg5][var9][arg1] = this.field5407[arg5][var9][arg1 - 1];
                }
            }
        }
        if (arg3 < 0 || arg1 < 0 || this.field5393 <= arg3 || this.field5419 <= arg1) {
            return;
        }
        if (arg5 == 0) {
            if (arg3 <= 0 || this.field5407[arg5][arg3 - 1][arg1] == 0) {
                if (arg1 > 0 && this.field5407[arg5][arg3][arg1 - 1] != 0) {
                    this.field5407[arg5][arg3][arg1] = this.field5407[arg5][arg3][arg1 - 1];
                    return;
                }
                if (arg3 > 0 && arg1 > 0 && this.field5407[arg5][arg3 - 1][arg1 - 1] != 0) {
                    this.field5407[arg5][arg3][arg1] = this.field5407[arg5][arg3 - 1][arg1 - 1];
                    return;
                }
                return;
            }
            this.field5407[arg5][arg3][arg1] = this.field5407[arg5][arg3 - 1][arg1];
        } else if (arg3 <= 0 || this.field5407[arg5][arg3 - 1][arg1] == this.field5407[arg5 - 1][arg3 - 1][arg1]) {
            if (arg1 > 0 && this.field5407[arg5 - 1][arg3][arg1 - 1] != this.field5407[arg5][arg3][arg1 - 1]) {
                this.field5407[arg5][arg3][arg1] = this.field5407[arg5][arg3][arg1 - 1];
                return;
            }
            if (arg3 > 0 && arg1 > 0 && this.field5407[arg5 - 1][arg3 - 1][arg1 - 1] != this.field5407[arg5][arg3 - 1][arg1 - 1]) {
                this.field5407[arg5][arg3][arg1] = this.field5407[arg5][arg3 - 1][arg1 - 1];
                return;
            }
        } else {
            this.field5407[arg5][arg3][arg1] = this.field5407[arg5][arg3 - 1][arg1];
            return;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "([ZB[[BLhc;ILlk;IIILnp;[[B[[BII)V")
    private final void method2286(boolean[] arg0, byte arg1, byte[][] arg2, class84 arg3, int arg4, class382 arg5, int arg6, int arg7, int arg8, class313 arg9, byte[][] arg10, byte[][] arg11, int arg12, int arg13) {
        if (arg3 != null && arg5 != null || arg5 != null && arg6 == 12 || arg3 != null && arg6 == 0) {
            boolean[] var15 = arg3 != null && arg3.field1037 ? class125.field1624[arg6] : class346.field5019[arg6];
            if (arg13 > 0) {
                if (arg12 > 0) {
                    int var16 = arg10[arg12 - 1][arg13 - 1] & 0xFF;
                    if (var16 > 0) {
                        class84 var17 = this.field5404.method331(18990, var16 - 1);
                        if (var17.field1027 != -1 && var17.field1037) {
                            byte var18 = arg2[arg12 - 1][arg13 - 1];
                            int var19 = arg11[arg12 - 1][arg13 - 1] * 2 + 4 & 0x7;
                            int var20 = class110.method708(var17, (byte) -118, arg9);
                            if (class22.field286[var18][var19]) {
                                class255.field3737[0] = var17.field1027;
                                class276.field4031[0] = var20;
                                class156.field2317[0] = arg9.method655() ? var17.field1035 : var17.field1038;
                                class124.field1561[0] = var17.field1021;
                                class438.field6091[0] = var17.field1023;
                                class313.field4428[0] = 256;
                            }
                        }
                    }
                }
                if (arg8 - 1 > arg12) {
                    int var21 = arg10[arg12 + 1][arg13 - 1] & 0xFF;
                    if (var21 > 0) {
                        class84 var22 = this.field5404.method331(18990, var21 - 1);
                        if (var22.field1027 != -1 && var22.field1037) {
                            byte var23 = arg2[arg12 + 1][arg13 - 1];
                            int var24 = arg11[arg12 + 1][arg13 - 1] * 2 + 6 & 0x7;
                            int var25 = class110.method708(var22, (byte) -118, arg9);
                            if (class22.field286[var23][var24]) {
                                class255.field3737[2] = var22.field1027;
                                class276.field4031[2] = var25;
                                class156.field2317[2] = arg9.method655() ? var22.field1035 : var22.field1038;
                                class124.field1561[2] = var22.field1021;
                                class438.field6091[2] = var22.field1023;
                                class313.field4428[2] = 512;
                            }
                        }
                    }
                }
            }
            if (arg4 - 1 > arg13) {
                if (arg12 > 0) {
                    int var26 = arg10[arg12 - 1][arg13 + 1] & 0xFF;
                    if (var26 > 0) {
                        class84 var27 = this.field5404.method331(18990, var26 - 1);
                        if (var27.field1027 != -1 && var27.field1037) {
                            byte var28 = arg2[arg12 - 1][arg13 + 1];
                            int var29 = arg11[arg12 - 1][arg13 + 1] * 2 + 2 & 0x7;
                            int var30 = class110.method708(var27, (byte) -118, arg9);
                            if (class22.field286[var28][var29]) {
                                class255.field3737[6] = var27.field1027;
                                class276.field4031[6] = var30;
                                class156.field2317[6] = arg9.method655() ? var27.field1035 : var27.field1038;
                                class124.field1561[6] = var27.field1021;
                                class438.field6091[6] = var27.field1023;
                                class313.field4428[6] = 64;
                            }
                        }
                    }
                }
                if (arg12 < (arg8 - 1)) {
                    int var31 = arg10[arg12 + 1][arg13 + 1] & 0xFF;
                    if (var31 > 0) {
                        class84 var32 = this.field5404.method331(18990, var31 - 1);
                        if (var32.field1027 != -1 && var32.field1037) {
                            byte var33 = arg2[arg12 + 1][arg13 + 1];
                            int var34 = arg11[arg12 + 1][arg13 + 1] * 2 & 0x7;
                            int var35 = class110.method708(var32, (byte) -118, arg9);
                            if (class22.field286[var33][var34]) {
                                class255.field3737[4] = var32.field1027;
                                class276.field4031[4] = var35;
                                class156.field2317[4] = arg9.method655() ? var32.field1035 : var32.field1038;
                                class124.field1561[4] = var32.field1021;
                                class438.field6091[4] = var32.field1023;
                                class313.field4428[4] = 128;
                            }
                        }
                    }
                }
            }
            if (arg13 > 0) {
                int var36 = arg10[arg12][arg13 - 1] & 0xFF;
                if (var36 > 0) {
                    class84 var37 = this.field5404.method331(18990, var36 - 1);
                    if (var37.field1027 != -1) {
                        byte var38 = arg2[arg12][arg13 - 1];
                        byte var39 = arg11[arg12][arg13 - 1];
                        if (var37.field1037) {
                            int var40 = 2;
                            int var41 = var39 * 2 + 4;
                            int var42 = class110.method708(var37, (byte) -118, arg9);
                            for (int var43 = 0; var43 < 3; var43++) {
                                var41 &= 0x7;
                                var40 &= 0x7;
                                if (class22.field286[var38][var41] && class438.field6091[var40] <= var37.field1023) {
                                    class255.field3737[var40] = var37.field1027;
                                    class276.field4031[var40] = var42;
                                    class156.field2317[var40] = arg9.method655() ? var37.field1035 : var37.field1038;
                                    class124.field1561[var40] = var37.field1021;
                                    if (class438.field6091[var40] == var37.field1023) {
                                        class313.field4428[var40] = class248.method1549(class313.field4428[var40], 32);
                                    } else {
                                        class313.field4428[var40] = 32;
                                    }
                                    class438.field6091[var40] = var37.field1023;
                                }
                                var41++;
                                var40--;
                            }
                            if (!var15[arg7 & 0x3]) {
                                arg0[0] = class125.field1624[var38][class367.method2256(3, var39 + 2)];
                            }
                        } else if (!var15[-(-arg7) & 0x3]) {
                            arg0[0] = class346.field5019[var38][class367.method2256(3, var39 + 2)];
                        }
                    }
                }
            }
            if (arg4 - 1 > arg13) {
                int var44 = arg10[arg12][arg13 + 1] & 0xFF;
                if (var44 > 0) {
                    class84 var45 = this.field5404.method331(arg1 + 19032, var44 - 1);
                    if (var45.field1027 != -1) {
                        byte var46 = arg2[arg12][arg13 + 1];
                        byte var47 = arg11[arg12][arg13 + 1];
                        if (var45.field1037) {
                            int var48 = 4;
                            int var49 = var47 * 2 + 2;
                            int var50 = class110.method708(var45, (byte) -118, arg9);
                            for (int var51 = 0; var51 < 3; var51++) {
                                var48 &= 0x7;
                                var49 &= 0x7;
                                if (class22.field286[var46][var49] && var45.field1023 >= class438.field6091[var48]) {
                                    class255.field3737[var48] = var45.field1027;
                                    class276.field4031[var48] = var50;
                                    class156.field2317[var48] = arg9.method655() ? var45.field1035 : var45.field1038;
                                    class124.field1561[var48] = var45.field1021;
                                    if (class438.field6091[var48] == var45.field1023) {
                                        class313.field4428[var48] = class248.method1549(class313.field4428[var48], 16);
                                    } else {
                                        class313.field4428[var48] = 16;
                                    }
                                    class438.field6091[var48] = var45.field1023;
                                }
                                var48++;
                                var49--;
                            }
                            if (!var15[arg7 + 2 & 0x3]) {
                                arg0[2] = class125.field1624[var46][class367.method2256(3, var47)];
                            }
                        } else if (!var15[arg7 + 2 & 0x3]) {
                            arg0[2] = class346.field5019[var46][class367.method2256(3, var47)];
                        }
                    }
                }
            }
            if (arg12 > 0) {
                int var52 = arg10[arg12 - 1][arg13] & 0xFF;
                if (var52 > 0) {
                    class84 var53 = this.field5404.method331(arg1 + 19032, var52 - 1);
                    if (var53.field1027 != -1) {
                        byte var54 = arg2[arg12 - 1][arg13];
                        byte var55 = arg11[arg12 - 1][arg13];
                        if (var53.field1037) {
                            int var56 = 6;
                            int var57 = (var55 * 2) + 4;
                            int var58 = class110.method708(var53, (byte) -118, arg9);
                            for (int var59 = 0; var59 < 3; var59++) {
                                var56 &= 0x7;
                                var57 &= 0x7;
                                if (class22.field286[var54][var57] && var53.field1023 >= class438.field6091[var56]) {
                                    class255.field3737[var56] = var53.field1027;
                                    class276.field4031[var56] = var58;
                                    class156.field2317[var56] = arg9.method655() ? var53.field1035 : var53.field1038;
                                    class124.field1561[var56] = var53.field1021;
                                    if (class438.field6091[var56] == var53.field1023) {
                                        class313.field4428[var56] = class248.method1549(class313.field4428[var56], 8);
                                    } else {
                                        class313.field4428[var56] = 8;
                                    }
                                    class438.field6091[var56] = var53.field1023;
                                }
                                var57--;
                                var56++;
                            }
                            if (!var15[arg7 + 3 & 0x3]) {
                                arg0[3] = class125.field1624[var54][class367.method2256(var55 + 1, 3)];
                            }
                        } else if (!var15[arg7 + 3 & 0x3]) {
                            arg0[3] = class346.field5019[var54][class367.method2256(3, var55 + 1)];
                        }
                    }
                }
            }
            if ((arg8 - 1) > arg12) {
                int var60 = arg10[arg12 + 1][arg13] & 0xFF;
                if (var60 > 0) {
                    class84 var61 = this.field5404.method331(18990, var60 - 1);
                    if (var61.field1027 != -1) {
                        byte var62 = arg2[arg12 + 1][arg13];
                        byte var63 = arg11[arg12 + 1][arg13];
                        if (var61.field1037) {
                            int var64 = 4;
                            int var65 = (var63 * 2) + 6;
                            int var66 = class110.method708(var61, (byte) -118, arg9);
                            for (int var67 = 0; var67 < 3; var67++) {
                                var65 &= 0x7;
                                var64 &= 0x7;
                                if (class22.field286[var62][var65] && var61.field1023 >= class438.field6091[var64]) {
                                    class255.field3737[var64] = var61.field1027;
                                    class276.field4031[var64] = var66;
                                    class156.field2317[var64] = arg9.method655() ? var61.field1035 : var61.field1038;
                                    class124.field1561[var64] = var61.field1021;
                                    if (class438.field6091[var64] == var61.field1023) {
                                        class313.field4428[var64] = class248.method1549(class313.field4428[var64], 4);
                                    } else {
                                        class313.field4428[var64] = 4;
                                    }
                                    class438.field6091[var64] = var61.field1023;
                                }
                                var64--;
                                var65++;
                            }
                            if (!var15[arg7 + 1 & 0x3]) {
                                arg0[1] = class125.field1624[var62][class367.method2256(var63 + 3, 3)];
                            }
                        } else if (!var15[arg7 + 1 & 0x3]) {
                            arg0[1] = class346.field5019[var62][class367.method2256(var63 + 3, 3)];
                        }
                    }
                }
            }
        }
        if (arg1 != -42) {
            return;
        }
        field5399++;
        if (arg3 == null) {
            return;
        }
        int var68 = class110.method708(arg3, (byte) -118, arg9);
        if (!arg3.field1037) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - arg7 * 2 & 0x7;
            if (class22.field286[arg6][var69] && class438.field6091[var70] <= arg3.field1023) {
                class255.field3737[var70] = arg3.field1027;
                class276.field4031[var70] = var68;
                class156.field2317[var70] = arg9.method655() ? arg3.field1035 : arg3.field1038;
                class124.field1561[var70] = arg3.field1021;
                if (class438.field6091[var70] == arg3.field1023) {
                    class313.field4428[var70] = class248.method1549(class313.field4428[var70], 2);
                } else {
                    class313.field4428[var70] = 2;
                }
                class438.field6091[var70] = arg3.field1023;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lnp;[Lee;[[[II)V")
    public final void method2287(class313 arg0, class441[] arg1, int[][][] arg2, int arg3) {
        if (!this.field5406) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field5393; var6++) {
                    for (int var7 = 0; var7 < this.field5419; var7++) {
                        if ((class413.field5813[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class413.field5813[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg1[var8].method2582(var7, 22879, var6);
                            }
                        }
                    }
                }
            }
        }
        field5398++;
        for (int var9 = 0; var9 < this.field5412; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field5406) {
                if (class45.field646) {
                    var10 |= 0x2;
                }
                if (class177.field2543) {
                    var11 |= 0x8;
                }
                if (class438.field6090 != 0) {
                    if (class145.field2071 | var9 == 0) {
                        var11 |= 0x10;
                    }
                    var10 |= 0x1;
                }
            }
            if (class45.field646) {
                var11 |= 0x7;
            }
            int[][] var12 = arg2 == null || var9 >= arg2.length ? this.field5407[var9] : arg2[var9];
            class76.method445(var9, arg0.method636(this.field5393, this.field5419, this.field5407[var9], var12, 128, var10, var11));
        }
        if (arg3 <= 102) {
            this.method2283((class313) null, (class426) null, (class426) null, 49);
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "([Lee;IBIILrp;I)V")
    public final void method2288(class441[] arg0, int arg1, byte arg2, int arg3, int arg4, class276 arg5, int arg6) {
        field5416++;
        if (!this.field5406) {
            for (int var8 = 0; var8 < 4; var8++) {
                class441 var9 = arg0[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg4 + var10;
                        int var13 = arg6 + var11;
                        if (var12 >= 0 && this.field5393 > var12 && var13 >= 0 && this.field5419 > var13) {
                            var9.method2593(var12, var13, -2097153);
                        }
                    }
                }
            }
        }
        int var14 = arg3 + arg4;
        int var15 = arg1 + arg6;
        if (arg2 != 114) {
            this.method2292((class426) null, (class313) null, (class426) null, (class426) null, 15, (int[][]) null, (byte) -37);
        }
        for (int var16 = 0; var16 < this.field5412; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method2284(var14 + var17, var15 - -var18, arg6 + var18, 0, var16, 0, false, arg4 + var17, true, arg5, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "([Lee;IBIILrp;IIII)V")
    public final void method2289(class441[] arg0, int arg1, byte arg2, int arg3, int arg4, class276 arg5, int arg6, int arg7, int arg8, int arg9) {
        field5408++;
        int var11 = (arg1 & 0x7) * 8;
        if (!this.field5406) {
            class441 var12 = arg0[arg7];
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = class279.method1764(var13 & 0x7, true, var14 & 0x7, arg8) + arg9;
                    int var16 = class113.method718(var13 & 0x7, arg8, var14 & 0x7, (byte) 108) + arg4;
                    if (var15 > 0 && var15 < this.field5393 - 1 && var16 > 0 && var16 < (this.field5419 - 1)) {
                        var12.method2593(var15, var16, -2097153);
                    }
                }
            }
        }
        int var17 = (arg6 & 0x7) * 8;
        int var18 = (arg1 & 0xFFFFFFF8) << 3;
        int var19 = (arg6 & 0xFFFFFFF8) << 3;
        if (arg2 > -36) {
            this.field5406 = false;
        }
        byte var20 = 0;
        byte var21 = 0;
        if (arg8 == 1) {
            var21 = 1;
        } else if (arg8 == 2) {
            var20 = 1;
            var21 = 1;
        } else if (arg8 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field5412; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg3 != var22 || var23 < var11 || (var11 + 8) < var23 || var17 > var24 || var24 > (var17 + 8)) {
                        this.method2284(0, 0, -1, 0, 0, 0, false, -1, true, arg5, 0);
                    } else if ((var11 + 8) == var23 || (var17 + 8) == var24) {
                        int var31;
                        int var32;
                        if (arg8 == 0) {
                            var31 = arg4 + var24 - var17;
                            var32 = var23 + arg9 - var11;
                        } else if (arg8 == 1) {
                            var32 = var24 + arg9 - var17;
                            var31 = var11 + arg4 + 8 - var23;
                        } else if (arg8 == 2) {
                            var32 = var11 - (var23 - arg9 - 8);
                            var31 = var17 + arg4 + 8 - var24;
                        } else {
                            var31 = arg4 + var23 - var11;
                            var32 = arg9 + var17 + 8 - var24;
                        }
                        this.method2284(var18 + var23, var19 + var24, var31, 0, arg7, 0, true, var32, true, arg5, 0);
                    } else {
                        int var25 = class279.method1764(var23 & 0x7, true, var24 & 0x7, arg8) + arg9;
                        int var26 = class113.method718(var23 & 0x7, arg8, var24 & 0x7, (byte) 110) + arg4;
                        this.method2284(var18 + var23, var19 + var24, var26, arg8, arg7, var21, false, var25, true, arg5, var20);
                        if (var23 == 63 || var24 == 63) {
                            int var27 = var23 == 63 ? 64 : var23;
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29;
                            int var30;
                            if (arg8 == 0) {
                                var29 = var28 + arg4 - var17;
                                var30 = arg9 + var27 - var11;
                            } else if (arg8 == 1) {
                                var29 = var11 + arg4 + 8 - var27;
                                var30 = arg9 + var28 - var17;
                            } else if (arg8 == 2) {
                                var30 = var11 + arg9 + 8 - var27;
                                var29 = arg4 + var17 + 8 - var28;
                            } else {
                                var30 = arg9 + var17 + 8 - var28;
                                var29 = var27 + arg4 - var11;
                            }
                            if (var30 >= 0 && var30 < this.field5393 && var29 >= 0 && this.field5419 > var29) {
                                this.field5407[arg7][var30][var29] = this.field5407[arg7][var20 + var25][var21 + var26];
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIII)V")
    public final void method2290(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5401++;
        for (int var6 = 0; var6 < this.field5412; var6++) {
            this.method2285(arg3, arg0, arg2, arg1, 0, var6);
        }
        int var7 = 121 / ((arg4 + 15) / 43);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(II[[I)V")
    public final void method2291(int arg0, int arg1, int[][] arg2) {
        field5400++;
        int[][] var4 = this.field5407[arg0];
        for (int var5 = 0; var5 < this.field5393 + 1; var5++) {
            for (int var6 = 0; var6 < (this.field5419 + 1); var6++) {
                var4[var5][var6] += arg2[var5][var6];
            }
        }
        if (arg1 != -30672) {
            this.method2286((boolean[]) null, (byte) 95, (byte[][]) null, (class84) null, -98, (class382) null, -8, 42, 63, (class313) null, (byte[][]) null, (byte[][]) null, -77, 58);
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lpl;Lnp;Lpl;Lpl;I[[IB)V")
    private final void method2292(class426 arg0, class313 arg1, class426 arg2, class426 arg3, int arg4, int[][] arg5, byte arg6) {
        field5403++;
        byte[][] var8 = this.field5413[arg4];
        byte[][] var9 = this.field5417[arg4];
        byte[][] var10 = this.field5410[arg4];
        byte[][] var11 = this.field5405[arg4];
        int var12 = 0;
        if (arg6 > -72) {
            return;
        }
        while (this.field5393 > var12) {
            int var13 = this.field5393 - 1 > var12 ? var12 + 1 : var12;
            for (int var14 = 0; var14 < this.field5419; var14++) {
                int var15 = var14 >= this.field5419 - 1 ? var14 : var14 + 1;
                if (class419.field5850 == -1 || class212.method1376(class419.field5850, var14, true, arg4, var12)) {
                    boolean var16 = false;
                    boolean var17 = false;
                    boolean[] var18 = new boolean[4];
                    int var19 = var8[var12][var14];
                    int var20 = var9[var12][var14];
                    int var21 = var11[var12][var14] & 0xFF;
                    int var22 = var10[var12][var14] & 0xFF;
                    int var23 = var10[var12][var15] & 0xFF;
                    int var24 = var10[var13][var15] & 0xFF;
                    int var25 = var10[var13][var14] & 0xFF;
                    if (var21 != 0 || var22 != 0) {
                        class84 var26 = var21 == 0 ? null : this.field5404.method331(18990, var21 - 1);
                        class382 var27 = var22 == 0 ? null : this.field5402.method1371(var22 - 1, 113);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class84 var28 = var26;
                        if (var26 != null) {
                            if (var26.field1027 == -1 && var26.field1025 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field1037;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field5393 > var12 && var14 < this.field5419) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var33 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            int var34 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            byte var35 = 0;
                            int var36 = var35 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var32++;
                                var34++;
                            } else {
                                var34--;
                                var32--;
                            }
                            if (var10[var13][var14] == var22) {
                                var32++;
                                var33++;
                            } else {
                                var32--;
                                var33--;
                            }
                            if (var10[var12][var15] == var22) {
                                var36++;
                                var33++;
                            } else {
                                var36--;
                                var33--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var36++;
                                var34++;
                            } else {
                                var34--;
                                var36--;
                            }
                            int var37 = var34 - var33;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var32 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg3.method1218(var12, var14) - arg3.method1218(var13, var15);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg3.method1218(var13, var14) - arg3.method1218(var12, var15);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var37 < var38 ? 1 : 0;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class438.field6091[var39] = -1;
                            class313.field4428[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field1037 ? class125.field1624[var19] : class346.field5019[var19];
                        this.method2286(var18, (byte) -42, var8, var26, this.field5419, var27, var19, var20, this.field5393, arg1, var11, var9, var12, var14);
                        boolean var41 = var26 != null && var26.field1027 != var26.field1025;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class438.field6091[var42] >= 0 && class276.field4031[var42] != class255.field3737[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class156.method974(var18[1], class367.method2256(class313.field4428[4], class313.field4428[2]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class156.method974(var18[3], class367.method2256(class313.field4428[0], class313.field4428[6]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class156.method974(var18[0], class367.method2256(class313.field4428[2], class313.field4428[0]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class156.method974(var18[2], class367.method2256(class313.field4428[4], class313.field4428[6]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var20 = 0;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[3] = false;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var18[0] = var18[1] = false;
                                var20 = 3;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var18[1] = var18[2] = false;
                                var20 = 2;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var20 = 1;
                                var18[2] = var18[3] = false;
                                var19 = var19 == 0 ? 13 : 14;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int[] var45;
                        int var46;
                        int var47;
                        int[] var48;
                        int[] var49;
                        if (var43) {
                            var49 = class334.field4856[var19];
                            var46 = var26 == null ? 0 : class92.field1160[var19];
                            var48 = class349.field5051[var19];
                            var45 = class252.field3715[var19];
                            var47 = var27 == null ? 0 : class2.field29[var19];
                        } else if (var17) {
                            var49 = class394.field5590[var19];
                            var46 = var26 == null ? 0 : class476.field6691[var19];
                            var47 = var27 == null ? 0 : class27.field371[var19];
                            var48 = class281.field4136[var19];
                            var45 = class291.field4247[var19];
                            var44 = class266.field3891[var19];
                        } else {
                            var45 = class224.field3392[var19];
                            var46 = var26 == null ? 0 : class166.field2439[var19];
                            var47 = var27 == null ? 0 : class264.field3856[var19];
                            var44 = class104.field1331[var19];
                            var48 = field5409[var19];
                            var49 = class1.field9[var19];
                        }
                        int var50 = var46 + var47;
                        if (var50 <= 0) {
                            class448.method2614(arg4, var12, var14);
                        } else {
                            if (var18[0]) {
                                var50++;
                            }
                            if (var18[2]) {
                                var50++;
                            }
                            if (var18[1]) {
                                var50++;
                            }
                            if (var18[3]) {
                                var50++;
                            }
                            int var51 = 0;
                            int var52 = 0;
                            int var53 = var50 * 3;
                            int[] var54 = var41 ? new int[var53] : null;
                            int[] var55 = new int[var53];
                            int[] var56 = new int[var53];
                            int[] var57 = new int[var53];
                            int[] var58 = new int[var53];
                            int[] var59 = new int[var53];
                            int[] var60 = arg2 == null ? null : new int[var53];
                            int[] var61 = arg2 == null && arg0 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var62 = var26.field1027;
                                var63 = arg1.method655() ? var26.field1035 : var26.field1038;
                                var64 = var26.field1021;
                                int var65 = class110.method708(var26, (byte) -118, arg1);
                                for (int var66 = 0; var66 < var46; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class92.field1173[0] = var45[var51];
                                        class92.field1173[1] = 1;
                                        class92.field1173[2] = var49[var51];
                                        class92.field1173[3] = 1;
                                        class92.field1173[4] = var48[var51];
                                        class92.field1173[5] = var49[var51];
                                        var68 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class92.field1173[0] = var45[var51];
                                        class92.field1173[1] = 5;
                                        class92.field1173[2] = var49[var51];
                                        class92.field1173[3] = 5;
                                        class92.field1173[4] = var48[var51];
                                        class92.field1173[5] = var49[var51];
                                        var68 = 6;
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class92.field1173[0] = var45[var51];
                                        class92.field1173[1] = 3;
                                        class92.field1173[2] = var49[var51];
                                        class92.field1173[3] = 3;
                                        class92.field1173[4] = var48[var51];
                                        class92.field1173[5] = var49[var51];
                                        var68 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class92.field1173[0] = var45[var51];
                                        class92.field1173[1] = 7;
                                        class92.field1173[2] = var49[var51];
                                        class92.field1173[3] = 7;
                                        class92.field1173[4] = var48[var51];
                                        class92.field1173[5] = var49[var51];
                                        var68 = 6;
                                    } else {
                                        class92.field1173[0] = var45[var51];
                                        class92.field1173[1] = var48[var51];
                                        var68 = 3;
                                        class92.field1173[2] = var49[var51];
                                    }
                                    var51++;
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class92.field1173[var69];
                                        int var71 = var70 - (var20 * 2) & 0x7;
                                        int var72 = class148.field2180[var70];
                                        int var73 = class135.field1787[var70];
                                        int var74;
                                        int var75;
                                        if (var20 == 1) {
                                            var74 = var73;
                                            var75 = 128 - var72;
                                        } else if (var20 == 2) {
                                            var75 = 128 - var73;
                                            var74 = 128 - var72;
                                        } else if (var20 == 3) {
                                            var74 = 128 - var73;
                                            var75 = var72;
                                        } else {
                                            var75 = var73;
                                            var74 = var72;
                                        }
                                        var55[var52] = var74;
                                        var56[var52] = var75;
                                        if (var60 != null && class22.field286[var19][var70]) {
                                            int var76 = (var12 << 7) + var74;
                                            int var77 = (var14 << 7) + var75;
                                            var60[var52] = arg2.method1209(var76, var77) - arg3.method1209(var76, var77);
                                        }
                                        if (var61 != null) {
                                            if (arg2 != null && !class22.field286[var19][var70]) {
                                                int var78 = (var12 << 7) + var74;
                                                int var79 = (var14 << 7) + var75;
                                                var61[var52] = arg3.method1209(var78, var79) - arg2.method1209(var78, var79);
                                            } else if (arg0 != null && !class286.field4167[var19][var70]) {
                                                int var80 = (var12 << 7) + var74;
                                                int var81 = (var14 << 7) + var75;
                                                var61[var52] = arg0.method1209(var80, var81) - arg3.method1209(var80, var81);
                                            }
                                        }
                                        if (var70 < 8 && class438.field6091[var71] > var26.field1023) {
                                            if (var54 != null) {
                                                var54[var52] = class276.field4031[var71];
                                            }
                                            var59[var52] = class124.field1561[var71];
                                            var58[var52] = class156.field2317[var71];
                                            var57[var52] = class255.field3737[var71];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = arg1.method655() ? var26.field1035 : var26.field1038;
                                            var59[var52] = var26.field1021;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field5406 && arg4 == 0) {
                                    class128.method810(var12, var14, var26.field1028, var26.field1024 * 8, var26.field1033);
                                }
                                if (var19 != 12 && var26.field1027 != -1 && var26.field1020) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class92.field1160[var19];
                            } else if (var17) {
                                var51 += class476.field6691[var19];
                            } else {
                                var51 += class166.field2439[var19];
                            }
                            if (var27 != null) {
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                class382 var82 = this.field5402.method1371(var22 - 1, 77);
                                class382 var83 = this.field5402.method1371(var23 - 1, 75);
                                class382 var84 = this.field5402.method1371(var24 - 1, 80);
                                class382 var85 = this.field5402.method1371(var25 - 1, 59);
                                for (int var86 = 0; var86 < var47; var86++) {
                                    boolean var87 = false;
                                    byte var88;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class92.field1173[0] = var45[var51];
                                        class92.field1173[1] = 1;
                                        class92.field1173[2] = var49[var51];
                                        class92.field1173[3] = 1;
                                        class92.field1173[4] = var48[var51];
                                        class92.field1173[5] = var49[var51];
                                        var88 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class92.field1173[0] = var45[var51];
                                        class92.field1173[1] = 5;
                                        class92.field1173[2] = var49[var51];
                                        class92.field1173[3] = 5;
                                        class92.field1173[4] = var48[var51];
                                        var88 = 6;
                                        class92.field1173[5] = var49[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class92.field1173[0] = var45[var51];
                                        class92.field1173[1] = 3;
                                        class92.field1173[2] = var49[var51];
                                        class92.field1173[3] = 3;
                                        class92.field1173[4] = var48[var51];
                                        class92.field1173[5] = var49[var51];
                                        var88 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class92.field1173[0] = var45[var51];
                                        class92.field1173[1] = 7;
                                        class92.field1173[2] = var49[var51];
                                        class92.field1173[3] = 7;
                                        class92.field1173[4] = var48[var51];
                                        class92.field1173[5] = var49[var51];
                                        var88 = 6;
                                    } else {
                                        class92.field1173[0] = var45[var51];
                                        class92.field1173[1] = var48[var51];
                                        var88 = 3;
                                        class92.field1173[2] = var49[var51];
                                    }
                                    var51++;
                                    for (int var89 = 0; var89 < var88; var89++) {
                                        int var90 = class92.field1173[var89];
                                        int var91 = var90 - (var20 * 2) & 0x7;
                                        int var92 = class148.field2180[var90];
                                        int var93 = class135.field1787[var90];
                                        int var94;
                                        int var95;
                                        if (var20 == 1) {
                                            var94 = 128 - var92;
                                            var95 = var93;
                                        } else if (var20 == 2) {
                                            var94 = 128 - var93;
                                            var95 = 128 - var92;
                                        } else if (var20 == 3) {
                                            var94 = var92;
                                            var95 = 128 - var93;
                                        } else {
                                            var95 = var92;
                                            var94 = var93;
                                        }
                                        var55[var52] = var95;
                                        var56[var52] = var94;
                                        if (var60 != null && class22.field286[var19][var90]) {
                                            int var96 = (var12 << 7) + var95;
                                            int var97 = (var14 << 7) + var94;
                                            var60[var52] = arg2.method1209(var96, var97) - arg3.method1209(var96, var97);
                                        }
                                        if (var61 != null) {
                                            if (arg2 != null && !class22.field286[var19][var90]) {
                                                int var98 = (var12 << 7) + var95;
                                                int var99 = (var14 << 7) + var94;
                                                var61[var52] = arg3.method1209(var98, var99) - arg2.method1209(var98, var99);
                                            } else if (arg0 != null && !class286.field4167[var19][var90]) {
                                                int var100 = (var12 << 7) + var95;
                                                int var101 = (var14 << 7) + var94;
                                                var61[var52] = arg0.method1209(var100, var101) - arg3.method1209(var100, var101);
                                            }
                                        }
                                        if (var90 < 8 && class438.field6091[var91] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class276.field4031[var91];
                                            }
                                            var59[var52] = class124.field1561[var91];
                                            var58[var52] = class156.field2317[var91];
                                            var57[var52] = class255.field3737[var91];
                                        } else {
                                            if (var17 && class22.field286[var19][var90]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var95 == 0 && var94 == 0) {
                                                var57[var52] = arg5[var12][var14];
                                                var58[var52] = var82.field5448;
                                                var59[var52] = var82.field5443;
                                            } else if (var95 == 0 && var94 == 128) {
                                                var57[var52] = arg5[var12][var15];
                                                var58[var52] = var83.field5448;
                                                var59[var52] = var83.field5443;
                                            } else if (var95 == 128 && var94 == 128) {
                                                var57[var52] = arg5[var13][var15];
                                                var58[var52] = var84.field5448;
                                                var59[var52] = var84.field5443;
                                            } else if (var95 == 128 && var94 == 0) {
                                                var57[var52] = arg5[var13][var14];
                                                var58[var52] = var85.field5448;
                                                var59[var52] = var85.field5443;
                                            } else {
                                                if (var95 < 64) {
                                                    if (var94 < 64) {
                                                        var58[var52] = var82.field5448;
                                                        var59[var52] = var82.field5443;
                                                    } else {
                                                        var58[var52] = var83.field5448;
                                                        var59[var52] = var83.field5443;
                                                    }
                                                } else if (var94 < 64) {
                                                    var58[var52] = var85.field5448;
                                                    var59[var52] = var85.field5443;
                                                } else {
                                                    var58[var52] = var84.field5448;
                                                    var59[var52] = var84.field5443;
                                                }
                                                int var102 = class386.method2327(var95 << 7 >> 7, arg5[var12][var14], 896, arg5[var13][var14]);
                                                int var103 = class386.method2327(var95 << 7 >> 7, arg5[var12][var15], 896, arg5[var13][var15]);
                                                var57[var52] = class386.method2327(var94 << 7 >> 7, var102, 896, var103);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                }
                                if (var19 != 0 && var27.field5446) {
                                    var16 = true;
                                }
                            }
                            int var104 = arg3.method1218(var12, var14);
                            int var105 = arg3.method1218(var13, var14);
                            int var106 = arg3.method1218(var13, var15);
                            int var107 = arg3.method1218(var12, var15);
                            if (arg4 > 0) {
                                boolean var108 = true;
                                if (var22 == 0 && var19 != 0) {
                                    var108 = false;
                                }
                                if (var21 > 0 && var28 != null && !var28.field1034) {
                                    var108 = false;
                                }
                                if (var108 && var104 == var105 && var104 == var106 && var104 == var107) {
                                    this.field5418[arg4][var12][var14] = (byte) class248.method1549(this.field5418[arg4][var12][var14], 4);
                                }
                            }
                            int var109 = 0;
                            int var110 = 0;
                            int var111 = 0;
                            if (this.field5406) {
                                var109 = class401.method2391(var12, var14);
                                var110 = class347.method2171(var12, var14);
                                var111 = class289.method1808(var12, var14);
                            }
                            arg3.method1206(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var109, var110, var111, var16);
                            class448.method2614(arg4, var12, var14);
                        }
                    }
                }
            }
            var12++;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V")
    public static void method2293(int arg0) {
        field5409 = null;
        if (arg0 == 0) {
            field5397 = null;
        }
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(IIIZLkl;Lsc;)V")
    public class375(int arg0, int arg1, int arg2, boolean arg3, class51 arg4, class211 arg5) {
        this.field5406 = arg3;
        this.field5404 = arg4;
        this.field5402 = arg5;
        this.field5419 = arg2;
        this.field5393 = arg1;
        this.field5412 = arg0;
        this.field5410 = new byte[this.field5412][this.field5393][this.field5419];
        this.field5418 = new byte[this.field5412][this.field5393 + 1][this.field5419 + 1];
        this.field5413 = new byte[this.field5412][this.field5393][this.field5419];
        this.field5407 = new int[this.field5412][this.field5393 + 1][this.field5419 + 1];
        this.field5405 = new byte[this.field5412][this.field5393][this.field5419];
        this.field5417 = new byte[this.field5412][this.field5393][this.field5419];
    }
}
