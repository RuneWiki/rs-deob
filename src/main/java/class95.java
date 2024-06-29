import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class95 {

    @OriginalMember(owner = "client!me", name = "r", descriptor = "[I")
    private int[] field1269 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!me", name = "m", descriptor = "[I")
    private int[] field1264 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public int field1255;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "Z")
    public boolean field1257;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "Ldd;")
    private class166 field1258;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "Ltc;")
    private class552 field1253;

    @OriginalMember(owner = "client!me", name = "B", descriptor = "I")
    public int field1279;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "I")
    public int field1271;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "[[[B")
    private byte[][][] field1272;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "[[[B")
    private byte[][][] field1265;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "[[[B")
    private byte[][][] field1267;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "[[[B")
    private byte[][][] field1266;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "[[[I")
    public int[][][] field1277;

    @OriginalMember(owner = "client!me", name = "s", descriptor = "[[[B")
    public byte[][][] field1270;

    @OriginalMember(owner = "client!me", name = "x", descriptor = "Lvt;")
    public static class344 field1275 = new class344("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!me", name = "C", descriptor = "Lbv;")
    public static class568 field1280 = new class568();

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!me", name = "y", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!me", name = "A", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!me", name = "D", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!me", name = "G", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!me", name = "E", descriptor = "Lra;")
    public static class262 field1282;

    @OriginalMember(owner = "client!me", name = "F", descriptor = "[[[B")
    public byte[][][] field1283;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lge;ZIIIIIIIII)V")
    private final void method516(class551 arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg5 != -12492) {
            return;
        }
        if (arg4 == 1) {
            arg7 = 1;
        } else if (arg4 == 2) {
            arg7 = 1;
            arg3 = 1;
        } else if (arg4 == 3) {
            arg3 = 1;
        }
        field1261++;
        if (arg8 < 0 || arg8 >= this.field1255 || arg9 < 0 || arg9 >= this.field1279) {
            while (true) {
                int var14 = arg0.method3045(arg5 ^ 0x30B7);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg0.method3045(-128);
                    return;
                }
                if (var14 <= 49) {
                    arg0.method3045(arg5 + 12364);
                }
            }
        }
        if (!this.field1257 && !arg1) {
            class310.field3971[arg2][arg8][arg9] = 0;
        }
        while (true) {
            int var12 = arg0.method3045(-128);
            if (var12 == 0) {
                if (this.field1257) {
                    this.field1277[0][arg3 + arg8][arg7 + arg9] = 0;
                    return;
                } else if (arg2 == 0) {
                    this.field1277[0][arg3 + arg8][arg7 + arg9] = -class157.method863(arg10 + 932731, 125, arg6 + 556238) * 8 << 2;
                    return;
                } else {
                    this.field1277[arg2][arg3 + arg8][arg7 + arg9] = this.field1277[arg2 - 1][arg3 + arg8][arg7 + arg9] - 960;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg0.method3045(-127);
                if (!this.field1257) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg2 != 0) {
                        this.field1277[arg2][arg3 + arg8][arg7 + arg9] = this.field1277[arg2 - 1][arg3 + arg8][arg7 + arg9] - (var13 * 8 << 2);
                        return;
                    }
                    this.field1277[0][arg8 + arg3][arg7 + arg9] = -var13 * 8 << 2;
                    return;
                }
                this.field1277[0][arg8 + arg3][arg9 + arg7] = var13 * 8 << 2;
                return;
            }
            if (var12 <= 49) {
                if (arg1) {
                    arg0.method3045(-128);
                } else {
                    this.field1265[arg2][arg8][arg9] = arg0.method3051((byte) 106);
                    this.field1267[arg2][arg8][arg9] = (byte) ((var12 - 2) / 4);
                    this.field1266[arg2][arg8][arg9] = (byte) class143.method783(3, arg4 + var12 - 2);
                }
            } else if (var12 <= 81) {
                if (!this.field1257 && !arg1) {
                    class310.field3971[arg2][arg8][arg9] = (byte) (var12 - 49);
                }
            } else if (!arg1) {
                this.field1272[arg2][arg8][arg9] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIZ)V")
    private final void method517(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var7 = arg4;
        if (arg5) {
            this.field1257 = true;
        }
        while ((arg2 + arg4) > var7) {
            for (int var10 = arg3; var10 < (arg3 + arg1); var10++) {
                if (var10 >= 0 && var10 < this.field1255 && var7 >= 0 && var7 < this.field1279) {
                    this.field1277[arg0][var10][var7] = arg0 <= 0 ? 0 : this.field1277[arg0 - 1][var10][var7] - 960;
                }
            }
            var7++;
        }
        field1252++;
        if (arg3 > 0 && this.field1255 > arg3) {
            for (int var8 = arg4 + 1; var8 < arg2 + arg4; var8++) {
                if (var8 >= 0 && this.field1279 > var8) {
                    this.field1277[arg0][arg3][var8] = this.field1277[arg0][arg3 - 1][var8];
                }
            }
        }
        if (arg4 > 0 && this.field1279 > arg4) {
            for (int var9 = arg3 + 1; var9 < (arg1 + arg3); var9++) {
                if (var9 >= 0 && this.field1255 > var9) {
                    this.field1277[arg0][var9][arg4] = this.field1277[arg0][var9][arg4 - 1];
                }
            }
        }
        if (arg3 < 0 || arg4 < 0 || this.field1255 <= arg3 || this.field1279 <= arg4) {
            return;
        }
        if (arg0 == 0) {
            if (arg3 > 0 && this.field1277[arg0][arg3 - 1][arg4] != 0) {
                this.field1277[arg0][arg3][arg4] = this.field1277[arg0][arg3 - 1][arg4];
                return;
            }
            if (arg4 > 0 && this.field1277[arg0][arg3][arg4 - 1] != 0) {
                this.field1277[arg0][arg3][arg4] = this.field1277[arg0][arg3][arg4 - 1];
                return;
            }
            if (arg3 > 0 && arg4 > 0 && this.field1277[arg0][arg3 - 1][arg4 - 1] != 0) {
                this.field1277[arg0][arg3][arg4] = this.field1277[arg0][arg3 - 1][arg4 - 1];
                return;
            }
        } else if (arg3 <= 0 || this.field1277[arg0 - 1][arg3 - 1][arg4] == this.field1277[arg0][arg3 - 1][arg4]) {
            if (arg4 > 0 && this.field1277[arg0 - 1][arg3][arg4 - 1] != this.field1277[arg0][arg3][arg4 - 1]) {
                this.field1277[arg0][arg3][arg4] = this.field1277[arg0][arg3][arg4 - 1];
                return;
            }
            if (arg3 > 0 && arg4 > 0 && this.field1277[arg0][arg3 - 1][arg4 - 1] != this.field1277[arg0 - 1][arg3 - 1][arg4 - 1]) {
                this.field1277[arg0][arg3][arg4] = this.field1277[arg0][arg3 - 1][arg4 - 1];
                return;
            }
            return;
        } else {
            this.field1277[arg0][arg3][arg4] = this.field1277[arg0][arg3 - 1][arg4];
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([[[ILqa;[Lfd;Z)V")
    public final void method518(int[][][] arg0, class167 arg1, class143[] arg2, boolean arg3) {
        if (!this.field1257) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field1255; var6++) {
                    for (int var7 = 0; var7 < this.field1279; var7++) {
                        if ((class310.field3971[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class310.field3971[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg2[var8].method771(25949, var7, var6);
                            }
                        }
                    }
                }
            }
        }
        field1268++;
        if (arg3) {
            this.method516(null, true, 38, 45, -21, -83, 99, -1, -89, 2, 120);
        }
        for (int var9 = 0; var9 < this.field1271; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field1257) {
                if (class344.field4773) {
                    var10 |= 0x2;
                }
                if (class286.field3748) {
                    var11 |= 0x8;
                }
                if (class190.field2458 != 0) {
                    if (class443.field6125 | var9 == 0) {
                        var11 |= 0x10;
                    }
                    var10 |= 0x1;
                }
            }
            if (class344.field4773) {
                var11 |= 0x7;
            }
            if (!class244.field3087) {
                var11 |= 0x20;
            }
            int[][] var12 = arg0 == null || var9 >= arg0.length ? this.field1277[var9] : arg0[var9];
            class179.method1103(var9, arg1.method200(this.field1255, this.field1279, this.field1277[var9], var12, 512, var10, var11));
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lsa;Lsa;Lsa;Lqa;I[[IB)V")
    private final void method519(class544 arg0, class544 arg1, class544 arg2, class167 arg3, int arg4, int[][] arg5, byte arg6) {
        field1254++;
        int var8 = 0;
        if (arg6 >= -41) {
            field1282 = null;
        }
        while (this.field1255 > var8) {
            for (int var9 = 0; var9 < this.field1279; var9++) {
                if (class96.field1293 == -1 || class68.method387(arg4, var9, var8, 0, class96.field1293)) {
                    byte var10 = this.field1267[arg4][var8][var9];
                    byte var11 = this.field1266[arg4][var8][var9];
                    int var12 = this.field1265[arg4][var8][var9] & 0xFF;
                    int var13 = this.field1272[arg4][var8][var9] & 0xFF;
                    class335 var14 = var12 == 0 ? null : this.field1253.method3101(false, var12 - 1);
                    class355 var15 = var13 == 0 ? null : this.field1258.method903(var13 - 1, -50);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var17 = var14 == null ? 0 : class257.field3189[var10];
                        var16 = var15 == null ? 0 : class623.field8999[var10];
                    } else if (var14 != null) {
                        var17 = class257.field3189[var10];
                    } else if (var15 != null) {
                        var16 = class257.field3189[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field4674 == -1 && var14.field4693 == -1 && var14.field4683 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg3.method195() ? var14.field4683 : var14.field4682;
                            if (class265.field3393) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field4692;
                                if (var14.field4674 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field4674;
                                }
                                if (var14.field4693 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var24 = true;
                                    var21[var19] = var14.field4693;
                                }
                                var19++;
                            }
                            if (!this.field1257 && arg4 == 0) {
                                class227.method1434(var8, var9, var14.field4680, var14.field4676 * 8, var14.field4690);
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
                            int var29 = var15.field4966;
                            if (class265.field3393) {
                                var29 = -1;
                            }
                            for (int var30 = 0; var30 < var16; var30++) {
                                var22[var19] = var29;
                                var23[var19] = var15.field4962;
                                var20[var19] = arg5[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field1264.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg1 == null ? null : new int[var31];
                        int[] var35 = arg1 == null && arg0 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = this.field1264[var36];
                            int var46 = this.field1269[var36];
                            if (var11 == 0) {
                                var32[var36] = var45;
                                var33[var36] = var46;
                            } else if (var11 == 1) {
                                var32[var36] = var46;
                                var33[var36] = 512 - var45;
                            } else if (var11 == 2) {
                                var32[var36] = 512 - var45;
                                var33[var36] = 512 - var46;
                            } else if (var11 == 3) {
                                var32[var36] = 512 - var46;
                                var33[var36] = var45;
                            }
                            if (var34 != null && class260.field3209[var10][var36]) {
                                int var49 = (var8 << 9) + var45;
                                int var50 = (var9 << 9) + var45;
                                var34[var36] = arg1.method1040(var49, var50) - arg2.method1040(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg1 != null && !class260.field3209[var10][var36]) {
                                    int var51 = (var8 << 9) + var45;
                                    int var52 = (var9 << 9) + var45;
                                    var35[var36] = arg2.method1040(var51, var52) - arg1.method1040(var51, var52);
                                } else if (arg0 != null && !class206.field2681[var10][var36]) {
                                    int var53 = (var8 << 9) + var45;
                                    int var54 = (var9 << 9) + var45;
                                    var35[var36] = arg0.method1040(var53, var54) - arg2.method1040(var53, var54);
                                }
                            }
                        }
                        int var37 = arg2.method1031(var8, var9);
                        int var38 = arg2.method1031(var8 + 1, var9);
                        int var39 = arg2.method1031(var8 + 1, var9 + 1);
                        int var40 = arg2.method1031(var8, var9 + 1);
                        if (arg4 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field4678) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field1270[arg4][var8][var9] = (byte) class292.method1790(this.field1270[arg4][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field1257) {
                            var42 = class98.method542(var8, var9);
                            var43 = class502.method2801(var8, var9);
                            var44 = class459.method2661(var8, var9);
                        }
                        arg2.method1047(var8, var9, var32, var34, var33, var35, class53.field720[var10], class536.field7476[var10], class548.field7626[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class590.method3402(arg4, var8, var9);
                    }
                }
            }
            var8++;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIILjg;[[BI[[B[[BLqa;III[ZLiv;)V")
    private final void method520(int arg0, int arg1, int arg2, class335 arg3, byte[][] arg4, int arg5, byte[][] arg6, byte[][] arg7, class167 arg8, int arg9, int arg10, int arg11, boolean[] arg12, class355 arg13) {
        field1273++;
        boolean[] var15 = arg3 != null && arg3.field4685 ? class183.field2350[arg9] : class184.field2352[arg9];
        if (arg2 > 0) {
            if (arg0 > 0) {
                int var16 = arg7[arg0 - 1][arg2 - 1] & 0xFF;
                if (var16 > 0) {
                    class335 var17 = this.field1253.method3101(false, var16 - 1);
                    if (var17.field4674 != -1 && var17.field4685) {
                        byte var18 = arg6[arg0 - 1][arg2 - 1];
                        int var19 = (arg4[arg0 - 1][arg2 - 1] * 2) + 4 & 0x7;
                        int var20 = class99.method555(arg8, var17, arg10 - 4);
                        if (class260.field3209[var18][var19]) {
                            class324.field4452[0] = var17.field4674;
                            class304.field3931[0] = var20;
                            class77.field1056[0] = arg8.method195() ? var17.field4683 : var17.field4682;
                            class455.field6444[0] = var17.field4692;
                            class144.field1877[0] = var17.field4687;
                            class170.field2161[0] = 256;
                        }
                    }
                }
            }
            if (arg1 - 1 > arg0) {
                int var21 = arg7[arg0 + 1][arg2 - 1] & 0xFF;
                if (var21 > 0) {
                    class335 var22 = this.field1253.method3101(false, var21 - 1);
                    if (var22.field4674 != -1 && var22.field4685) {
                        byte var23 = arg6[arg0 + 1][arg2 - 1];
                        int var24 = (arg4[arg0 + 1][arg2 - 1] * 2) + 6 & 0x7;
                        int var25 = class99.method555(arg8, var22, -1);
                        if (class260.field3209[var23][var24]) {
                            class324.field4452[2] = var22.field4674;
                            class304.field3931[2] = var25;
                            class77.field1056[2] = arg8.method195() ? var22.field4683 : var22.field4682;
                            class455.field6444[2] = var22.field4692;
                            class144.field1877[2] = var22.field4687;
                            class170.field2161[2] = 512;
                        }
                    }
                }
            }
        }
        if ((arg11 - 1) > arg2) {
            if (arg0 > 0) {
                int var26 = arg7[arg0 - 1][arg2 + 1] & 0xFF;
                if (var26 > 0) {
                    class335 var27 = this.field1253.method3101(false, var26 - 1);
                    if (var27.field4674 != -1 && var27.field4685) {
                        byte var28 = arg6[arg0 - 1][arg2 + 1];
                        int var29 = arg4[arg0 - 1][arg2 + 1] * 2 + 2 & 0x7;
                        int var30 = class99.method555(arg8, var27, -1);
                        if (class260.field3209[var28][var29]) {
                            class324.field4452[6] = var27.field4674;
                            class304.field3931[6] = var30;
                            class77.field1056[6] = arg8.method195() ? var27.field4683 : var27.field4682;
                            class455.field6444[6] = var27.field4692;
                            class144.field1877[6] = var27.field4687;
                            class170.field2161[6] = 64;
                        }
                    }
                }
            }
            if (arg0 < arg1 - 1) {
                int var31 = arg7[arg0 + 1][arg2 + 1] & 0xFF;
                if (var31 > 0) {
                    class335 var32 = this.field1253.method3101(false, var31 - 1);
                    if (var32.field4674 != -1 && var32.field4685) {
                        byte var33 = arg6[arg0 + 1][arg2 + 1];
                        int var34 = -(-(arg4[arg0 + 1][arg2 + 1] * 2)) & 0x7;
                        int var35 = class99.method555(arg8, var32, -1);
                        if (class260.field3209[var33][var34]) {
                            class324.field4452[4] = var32.field4674;
                            class304.field3931[4] = var35;
                            class77.field1056[4] = arg8.method195() ? var32.field4683 : var32.field4682;
                            class455.field6444[4] = var32.field4692;
                            class144.field1877[4] = var32.field4687;
                            class170.field2161[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg2 > 0) {
            int var36 = arg7[arg0][arg2 - 1] & 0xFF;
            if (var36 > 0) {
                class335 var37 = this.field1253.method3101(false, var36 - 1);
                if (var37.field4674 != -1) {
                    byte var38 = arg6[arg0][arg2 - 1];
                    byte var39 = arg4[arg0][arg2 - 1];
                    if (var37.field4685) {
                        int var40 = 2;
                        int var41 = var39 * 2 + 4;
                        int var42 = class99.method555(arg8, var37, arg10 - 4);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var40 &= 0x7;
                            var41 &= 0x7;
                            if (class260.field3209[var38][var41] && class144.field1877[var40] <= var37.field4687) {
                                class324.field4452[var40] = var37.field4674;
                                class304.field3931[var40] = var42;
                                class77.field1056[var40] = arg8.method195() ? var37.field4683 : var37.field4682;
                                class455.field6444[var40] = var37.field4692;
                                if (class144.field1877[var40] == var37.field4687) {
                                    class170.field2161[var40] = class292.method1790(class170.field2161[var40], 32);
                                } else {
                                    class170.field2161[var40] = 32;
                                }
                                class144.field1877[var40] = var37.field4687;
                            }
                            var40--;
                            var41++;
                        }
                        if (!var15[arg5 & 0x3]) {
                            arg12[0] = class183.field2350[var38][class143.method783(3, var39 + 2)];
                        }
                    } else if (!var15[-(-arg5) & 0x3]) {
                        arg12[0] = class184.field2352[var38][class143.method783(3, var39 + 2)];
                    }
                }
            }
        }
        if (arg10 != 3) {
            return;
        }
        if ((arg11 - 1) > arg2) {
            int var44 = arg7[arg0][arg2 + 1] & 0xFF;
            if (var44 > 0) {
                class335 var45 = this.field1253.method3101(false, var44 - 1);
                if (var45.field4674 != -1) {
                    byte var46 = arg6[arg0][arg2 + 1];
                    byte var47 = arg4[arg0][arg2 + 1];
                    if (var45.field4685) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class99.method555(arg8, var45, arg10 ^ 0xFFFFFFFC);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var48 &= 0x7;
                            var49 &= 0x7;
                            if (class260.field3209[var46][var49] && var45.field4687 >= class144.field1877[var48]) {
                                class324.field4452[var48] = var45.field4674;
                                class304.field3931[var48] = var50;
                                class77.field1056[var48] = arg8.method195() ? var45.field4683 : var45.field4682;
                                class455.field6444[var48] = var45.field4692;
                                if (class144.field1877[var48] == var45.field4687) {
                                    class170.field2161[var48] = class292.method1790(class170.field2161[var48], 16);
                                } else {
                                    class170.field2161[var48] = 16;
                                }
                                class144.field1877[var48] = var45.field4687;
                            }
                            var48++;
                            var49--;
                        }
                        if (!var15[arg5 + 2 & 0x3]) {
                            arg12[2] = class183.field2350[var46][class143.method783(3, var47)];
                        }
                    } else if (!var15[arg5 + 2 & 0x3]) {
                        arg12[2] = class184.field2352[var46][class143.method783(3, var47)];
                    }
                }
            }
        }
        if (arg0 > 0) {
            int var52 = arg7[arg0 - 1][arg2] & 0xFF;
            if (var52 > 0) {
                class335 var53 = this.field1253.method3101(false, var52 - 1);
                if (var53.field4674 != -1) {
                    byte var54 = arg6[arg0 - 1][arg2];
                    byte var55 = arg4[arg0 - 1][arg2];
                    if (var53.field4685) {
                        int var56 = 6;
                        int var57 = (var55 * 2) + 4;
                        int var58 = class99.method555(arg8, var53, -1);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var57 &= 0x7;
                            var56 &= 0x7;
                            if (class260.field3209[var54][var57] && var53.field4687 >= class144.field1877[var56]) {
                                class324.field4452[var56] = var53.field4674;
                                class304.field3931[var56] = var58;
                                class77.field1056[var56] = arg8.method195() ? var53.field4683 : var53.field4682;
                                class455.field6444[var56] = var53.field4692;
                                if (class144.field1877[var56] == var53.field4687) {
                                    class170.field2161[var56] = class292.method1790(class170.field2161[var56], 8);
                                } else {
                                    class170.field2161[var56] = 8;
                                }
                                class144.field1877[var56] = var53.field4687;
                            }
                            var57--;
                            var56++;
                        }
                        if (!var15[arg5 + 3 & 0x3]) {
                            arg12[3] = class183.field2350[var54][class143.method783(3, var55 + 1)];
                        }
                    } else if (!var15[arg5 + 3 & 0x3]) {
                        arg12[3] = class184.field2352[var54][class143.method783(var55 + 1, 3)];
                    }
                }
            }
        }
        if (arg0 < arg1 - 1) {
            int var60 = arg7[arg0 + 1][arg2] & 0xFF;
            if (var60 > 0) {
                class335 var61 = this.field1253.method3101(false, var60 - 1);
                if (var61.field4674 != -1) {
                    byte var62 = arg6[arg0 + 1][arg2];
                    byte var63 = arg4[arg0 + 1][arg2];
                    if (var61.field4685) {
                        int var64 = 4;
                        int var65 = (var63 * 2) + 6;
                        int var66 = class99.method555(arg8, var61, arg10 ^ 0xFFFFFFFC);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var65 &= 0x7;
                            var64 &= 0x7;
                            if (class260.field3209[var62][var65] && var61.field4687 >= class144.field1877[var64]) {
                                class324.field4452[var64] = var61.field4674;
                                class304.field3931[var64] = var66;
                                class77.field1056[var64] = arg8.method195() ? var61.field4683 : var61.field4682;
                                class455.field6444[var64] = var61.field4692;
                                if (class144.field1877[var64] == var61.field4687) {
                                    class170.field2161[var64] = class292.method1790(class170.field2161[var64], 4);
                                } else {
                                    class170.field2161[var64] = 4;
                                }
                                class144.field1877[var64] = var61.field4687;
                            }
                            var65++;
                            var64--;
                        }
                        if (!var15[arg5 + 1 & 0x3]) {
                            arg12[1] = class183.field2350[var62][class143.method783(3, var63 + 3)];
                        }
                    } else if (!var15[arg5 + 1 & 0x3]) {
                        arg12[1] = class184.field2352[var62][class143.method783(var63 + 3, 3)];
                    }
                }
            }
        }
        if (arg3 == null) {
            return;
        }
        int var68 = class99.method555(arg8, arg3, -1);
        if (!arg3.field4685) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg5 * 2) & 0x7;
            if (class260.field3209[arg9][var69] && class144.field1877[var70] <= arg3.field4687) {
                class324.field4452[var70] = arg3.field4674;
                class304.field3931[var70] = var68;
                class77.field1056[var70] = arg8.method195() ? arg3.field4683 : arg3.field4682;
                class455.field6444[var70] = arg3.field4692;
                if (class144.field1877[var70] == arg3.field4687) {
                    class170.field2161[var70] = class292.method1790(class170.field2161[var70], 2);
                } else {
                    class170.field2161[var70] = 2;
                }
                class144.field1877[var70] = arg3.field4687;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(FLj;FIFFBIIIF)[B")
    public static final byte[] method521(float arg0, class323 arg1, float arg2, int arg3, float arg4, float arg5, byte arg6, int arg7, int arg8, int arg9, float arg10) {
        if (arg6 >= -29) {
            return null;
        } else {
            field1276++;
            byte[] var11 = new byte[arg7 * arg9 * arg8];
            class214.method1393(arg1, arg3, arg5, 0, arg8, arg10, arg9, var11, (byte) 12, arg0, arg4, arg7, arg2);
            return var11;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
    public static void method522(byte arg0) {
        if (arg0 >= -2) {
            field1282 = null;
        }
        field1280 = null;
        field1275 = null;
        field1282 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIII[Lfd;BIIILge;)V")
    public final void method523(int arg0, int arg1, int arg2, int arg3, class143[] arg4, byte arg5, int arg6, int arg7, int arg8, class551 arg9) {
        if (arg5 != -55) {
            return;
        }
        field1278++;
        int var11 = (arg2 & 0x7) * 8;
        int var12 = (arg6 & 0x7) * 8;
        if (!this.field1257) {
            class143 var13 = arg4[arg3];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = arg7 + class449.method2618(-100, arg1, var15 & 0x7, var14 & 0x7);
                    int var17 = class506.method2833((byte) 75, var15 & 0x7, var14 & 0x7, arg1) + arg8;
                    if (var16 > 0 && var16 < this.field1255 - 1 && var17 > 0 && var17 < (this.field1279 - 1)) {
                        var13.method778(var17, var16, (byte) 107);
                    }
                }
            }
        }
        int var18 = arg2 & 0x1FFFFFF8 << 3;
        int var19 = (arg6 & 0xFFFFFFF8) << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg1 == 1) {
            var21 = 1;
        } else if (arg1 == 2) {
            var20 = 1;
            var21 = 1;
        } else if (arg1 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field1271; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg0 == var22 && var11 <= var23 && var23 <= (var11 + 8) && var24 >= var12 && var12 + 8 >= var24) {
                        int var25;
                        int var26;
                        if ((var11 + 8) == var23 || (var12 + 8) == var24) {
                            if (arg1 == 0) {
                                var25 = var23 + arg7 - var11;
                                var26 = arg8 + var24 - var12;
                            } else if (arg1 == 1) {
                                var25 = arg7 + var24 - var12;
                                var26 = var11 - (var23 - arg8 - 8);
                            } else if (arg1 == 2) {
                                var26 = arg8 + var12 + 8 - var24;
                                var25 = arg7 + var11 + 8 - var23;
                            } else {
                                var25 = arg7 + 8 - (-var12 + var24);
                                var26 = var23 + arg8 - var11;
                            }
                            this.method516(arg9, true, arg3, 0, 0, arg5 ^ 0x30FD, var19 + var24, 0, var25, var26, var18 + var23);
                        } else {
                            var25 = arg7 + class449.method2618(-69, arg1, var24 & 0x7, var23 & 0x7);
                            var26 = class506.method2833((byte) 115, var24 & 0x7, var23 & 0x7, arg1) + arg8;
                            this.method516(arg9, false, arg3, var20, arg1, -12492, var19 + var24, var21, var25, var26, var18 + var23);
                        }
                        if (var23 == 63 || var24 == 63) {
                            byte var27 = 1;
                            if (var23 == 63 && var24 == 63) {
                                var27 = 3;
                            }
                            for (int var28 = 0; var28 < var27; var28++) {
                                int var29 = var23;
                                int var30 = var24;
                                if (var28 == 0) {
                                    var29 = var23 == 63 ? 64 : var23;
                                    var30 = var24 == 63 ? 64 : var24;
                                } else if (var28 == 1) {
                                    var29 = 64;
                                } else if (var28 == 2) {
                                    var30 = 64;
                                }
                                int var31;
                                int var32;
                                if (arg1 == 0) {
                                    var31 = arg8 + var30 - var12;
                                    var32 = arg7 + var29 - var11;
                                } else if (arg1 == 1) {
                                    var32 = var30 + arg7 - var12;
                                    var31 = arg8 - (var29 - var11 - 8);
                                } else if (arg1 == 2) {
                                    var31 = arg8 + 8 - (var30 - var12);
                                    var32 = arg7 + var11 + 8 - var29;
                                } else {
                                    var32 = var12 + arg7 + 8 - var30;
                                    var31 = arg8 + var29 - var11;
                                }
                                if (var32 >= 0 && this.field1255 > var32 && var31 >= 0 && this.field1279 > var31) {
                                    this.field1277[arg3][var32][var31] = this.field1277[arg3][var20 + var25][var21 + var26];
                                }
                            }
                        }
                    } else {
                        this.method516(arg9, false, 0, 0, 0, -12492, 0, 0, -1, -1, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZIIII)V")
    public final void method524(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!arg0) {
            this.field1269 = null;
        }
        for (int var6 = 0; var6 < this.field1271; var6++) {
            this.method517(var6, arg1, arg4, arg2, arg3, false);
        }
        field1263++;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lsa;[[ILsa;Lqa;IILsa;)V")
    private final void method525(class544 arg0, int[][] arg1, class544 arg2, class167 arg3, int arg4, int arg5, class544 arg6) {
        field1274++;
        byte[][] var8 = this.field1267[arg5];
        int var9 = -28 / ((arg4 - 14) / 49);
        byte[][] var10 = this.field1266[arg5];
        byte[][] var11 = this.field1272[arg5];
        byte[][] var12 = this.field1265[arg5];
        for (int var13 = 0; var13 < this.field1255; var13++) {
            int var14 = var13 < (this.field1255 - 1) ? var13 + 1 : var13;
            for (int var15 = 0; var15 < this.field1279; var15++) {
                int var16 = (this.field1279 - 1) > var15 ? var15 + 1 : var15;
                if (class96.field1293 == -1 || class68.method387(arg5, var15, var13, 0, class96.field1293)) {
                    boolean var17 = false;
                    boolean var18 = false;
                    boolean[] var19 = new boolean[4];
                    int var20 = var8[var13][var15];
                    int var21 = var10[var13][var15];
                    int var22 = var12[var13][var15] & 0xFF;
                    int var23 = var11[var13][var15] & 0xFF;
                    int var24 = var11[var13][var16] & 0xFF;
                    int var25 = var11[var14][var16] & 0xFF;
                    int var26 = var11[var14][var15] & 0xFF;
                    if (var22 != 0 || var23 != 0) {
                        class335 var27 = var22 == 0 ? null : this.field1253.method3101(false, var22 - 1);
                        if (var20 == 0 && var27 == null) {
                            var20 = 12;
                        }
                        class355 var28 = var23 == 0 ? null : this.field1258.method903(var23 - 1, -18);
                        class335 var29 = var27;
                        if (var27 != null) {
                            if (var27.field4674 == -1 && var27.field4693 == -1) {
                                var29 = var27;
                                var27 = null;
                            } else if (var28 != null && var20 != 0) {
                                var18 = var27.field4685;
                            }
                        }
                        if ((var20 == 0 || var20 == 12) && var13 > 0 && var15 > 0 && this.field1255 > var13 && var15 < this.field1279) {
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            int var33 = var30 + (var11[var13 - 1][var15 - 1] == var23 ? 1 : -1);
                            byte var34 = 0;
                            int var35 = var32 + (var11[var14][var16] == var23 ? 1 : -1);
                            int var36 = var31 + (var11[var14][var15 - 1] == var23 ? 1 : -1);
                            if (var11[var13][var15 - 1] == var23) {
                                var36++;
                                var33++;
                            } else {
                                var36--;
                                var33--;
                            }
                            int var37 = var34 + (var11[var13 - 1][var16] == var23 ? 1 : -1);
                            if (var11[var14][var15] == var23) {
                                var35++;
                                var36++;
                            } else {
                                var35--;
                                var36--;
                            }
                            if (var11[var13][var16] == var23) {
                                var37++;
                                var35++;
                            } else {
                                var35--;
                                var37--;
                            }
                            if (var11[var13 - 1][var15] == var23) {
                                var37++;
                                var33++;
                            } else {
                                var33--;
                                var37--;
                            }
                            int var38 = var33 - var35;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            int var39 = var36 - var37;
                            if (var39 < 0) {
                                var39 = -var39;
                            }
                            if (var38 == var39) {
                                var38 = arg2.method1031(var13, var15) - arg2.method1031(var14, var16);
                                var39 = arg2.method1031(var14, var15) - arg2.method1031(var13, var16);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                                if (var39 < 0) {
                                    var39 = -var39;
                                }
                            }
                            var21 = var39 <= var38 ? 0 : 1;
                        }
                        for (int var40 = 0; var40 < 13; var40++) {
                            class144.field1877[var40] = -1;
                            class170.field2161[var40] = 1;
                        }
                        boolean[] var41 = var27 != null && var27.field4685 ? class183.field2350[var20] : class184.field2352[var20];
                        this.method520(var13, this.field1255, var15, var27, var10, var21, var8, var12, arg3, var20, 3, this.field1279, var19, var28);
                        boolean var42 = var27 != null && var27.field4693 != var27.field4674;
                        if (!var42) {
                            for (int var43 = 0; var43 < 8; var43++) {
                                if (class144.field1877[var43] >= 0 && class324.field4452[var43] != class304.field3931[var43]) {
                                    var42 = true;
                                    break;
                                }
                            }
                        }
                        if (!var41[var21 + 1 & 0x3]) {
                            var19[1] = class104.method574(var19[1], class143.method783(class170.field2161[4], class170.field2161[2]) == 0);
                        }
                        if (!var41[var21 + 3 & 0x3]) {
                            var19[3] = class104.method574(var19[3], class143.method783(class170.field2161[6], class170.field2161[0]) == 0);
                        }
                        if (!var41[var21 & 0x3]) {
                            var19[0] = class104.method574(var19[0], class143.method783(class170.field2161[0], class170.field2161[2]) == 0);
                        }
                        if (!var41[var21 + 2 & 0x3]) {
                            var19[2] = class104.method574(var19[2], class143.method783(class170.field2161[6], class170.field2161[4]) == 0);
                        }
                        if (!var18 && (var20 == 0 || var20 == 12)) {
                            if (var19[0] && !var19[1] && !var19[2] && var19[3]) {
                                var20 = var20 == 0 ? 13 : 14;
                                var21 = 0;
                                var19[0] = var19[3] = false;
                            } else if (var19[0] && var19[1] && !var19[2] && !var19[3]) {
                                var21 = 3;
                                var19[0] = var19[1] = false;
                                var20 = var20 == 0 ? 13 : 14;
                            } else if (!var19[0] && var19[1] && var19[2] && !var19[3]) {
                                var20 = var20 == 0 ? 13 : 14;
                                var19[1] = var19[2] = false;
                                var21 = 2;
                            } else if (!var19[0] && !var19[1] && var19[2] && var19[3]) {
                                var21 = 1;
                                var20 = var20 == 0 ? 13 : 14;
                                var19[2] = var19[3] = false;
                            }
                        }
                        boolean var44 = !var18 && !var19[0] && !var19[2] && !var19[1] && !var19[3];
                        int[] var45 = null;
                        int[] var46;
                        int[] var47;
                        int var48;
                        int[] var49;
                        int var50;
                        if (var44) {
                            var46 = class548.field7626[var20];
                            var47 = class536.field7476[var20];
                            var48 = var27 == null ? 0 : class257.field3189[var20];
                            var49 = class53.field720[var20];
                            var50 = var28 == null ? 0 : class623.field8999[var20];
                        } else if (var18) {
                            var49 = class239.field3054[var20];
                            var47 = class452.field6397[var20];
                            var45 = class90.field1221[var20];
                            var50 = var28 == null ? 0 : class164.field2083[var20];
                            var48 = var27 == null ? 0 : class474.field6691[var20];
                            var46 = class26.field452[var20];
                        } else {
                            var47 = class28.field462[var20];
                            var45 = class457.field6528[var20];
                            var49 = class630.field9186[var20];
                            var46 = class643.field9334[var20];
                            var48 = var27 == null ? 0 : class370.field5160[var20];
                            var50 = var28 == null ? 0 : class273.field3464[var20];
                        }
                        int var51 = var48 + var50;
                        if (var51 <= 0) {
                            class590.method3402(arg5, var13, var15);
                        } else {
                            if (var19[0]) {
                                var51++;
                            }
                            if (var19[2]) {
                                var51++;
                            }
                            if (var19[1]) {
                                var51++;
                            }
                            if (var19[3]) {
                                var51++;
                            }
                            int var52 = 0;
                            int var53 = 0;
                            int var54 = var51 * 3;
                            int[] var55 = var42 ? new int[var54] : null;
                            int[] var56 = new int[var54];
                            int[] var57 = new int[var54];
                            int[] var58 = new int[var54];
                            int[] var59 = new int[var54];
                            int[] var60 = new int[var54];
                            int[] var61 = arg6 == null ? null : new int[var54];
                            int[] var62 = arg6 == null && arg0 == null ? null : new int[var54];
                            int var63 = -1;
                            int var64 = -1;
                            int var65 = 256;
                            if (var27 != null) {
                                var63 = var27.field4674;
                                var64 = arg3.method195() ? var27.field4683 : var27.field4682;
                                var65 = var27.field4692;
                                int var66 = class99.method555(arg3, var27, -1);
                                for (int var67 = 0; var67 < var48; var67++) {
                                    boolean var98 = false;
                                    byte var99;
                                    if (var19[-var21 & 0x3] && var45[0] == var52) {
                                        class100.field1334[0] = var49[var52];
                                        class100.field1334[1] = 1;
                                        class100.field1334[2] = var46[var52];
                                        class100.field1334[3] = 1;
                                        class100.field1334[4] = var47[var52];
                                        var99 = 6;
                                        class100.field1334[5] = var46[var52];
                                    } else if (var19[2 - var21 & 0x3] && var45[2] == var52) {
                                        class100.field1334[0] = var49[var52];
                                        class100.field1334[1] = 5;
                                        class100.field1334[2] = var46[var52];
                                        class100.field1334[3] = 5;
                                        class100.field1334[4] = var47[var52];
                                        class100.field1334[5] = var46[var52];
                                        var99 = 6;
                                    } else if (var19[1 - var21 & 0x3] && var45[1] == var52) {
                                        class100.field1334[0] = var49[var52];
                                        class100.field1334[1] = 3;
                                        class100.field1334[2] = var46[var52];
                                        class100.field1334[3] = 3;
                                        class100.field1334[4] = var47[var52];
                                        var99 = 6;
                                        class100.field1334[5] = var46[var52];
                                    } else if (var19[3 - var21 & 0x3] && var45[3] == var52) {
                                        class100.field1334[0] = var49[var52];
                                        class100.field1334[1] = 7;
                                        class100.field1334[2] = var46[var52];
                                        class100.field1334[3] = 7;
                                        class100.field1334[4] = var47[var52];
                                        class100.field1334[5] = var46[var52];
                                        var99 = 6;
                                    } else {
                                        class100.field1334[0] = var49[var52];
                                        class100.field1334[1] = var47[var52];
                                        var99 = 3;
                                        class100.field1334[2] = var46[var52];
                                    }
                                    for (int var100 = 0; var100 < var99; var100++) {
                                        int var101 = class100.field1334[var100];
                                        int var102 = var101 - (var21 * 2) & 0x7;
                                        int var103 = this.field1264[var101];
                                        int var104 = this.field1269[var101];
                                        int var105;
                                        int var106;
                                        if (var21 == 1) {
                                            var105 = var104;
                                            var106 = 512 - var103;
                                        } else if (var21 == 2) {
                                            var106 = 512 - var104;
                                            var105 = 512 - var103;
                                        } else if (var21 == 3) {
                                            var106 = var103;
                                            var105 = 512 - var104;
                                        } else {
                                            var105 = var103;
                                            var106 = var104;
                                        }
                                        var56[var53] = var105;
                                        var57[var53] = var106;
                                        if (var61 != null && class260.field3209[var20][var101]) {
                                            int var107 = (var13 << 9) + var105;
                                            int var108 = (var15 << 9) + var106;
                                            var61[var53] = arg6.method1040(var107, var108) - arg2.method1040(var107, var108);
                                        }
                                        if (var62 != null) {
                                            if (arg6 != null && !class260.field3209[var20][var101]) {
                                                int var109 = (var13 << 9) + var105;
                                                int var110 = (var15 << 9) + var106;
                                                var62[var53] = arg2.method1040(var109, var110) - arg6.method1040(var109, var110);
                                            } else if (arg0 != null && !class206.field2681[var20][var101]) {
                                                int var111 = (var13 << 9) + var105;
                                                int var112 = (var15 << 9) + var106;
                                                var62[var53] = arg0.method1040(var111, var112) - arg2.method1040(var111, var112);
                                            }
                                        }
                                        if (var101 < 8 && class144.field1877[var102] > var27.field4687) {
                                            if (var55 != null) {
                                                var55[var53] = class304.field3931[var102];
                                            }
                                            var60[var53] = class455.field6444[var102];
                                            var59[var53] = class77.field1056[var102];
                                            var58[var53] = class324.field4452[var102];
                                        } else {
                                            if (var55 != null) {
                                                var55[var53] = var66;
                                            }
                                            var59[var53] = arg3.method195() ? var27.field4683 : var27.field4682;
                                            var60[var53] = var27.field4692;
                                            var58[var53] = var63;
                                        }
                                        var53++;
                                    }
                                    var52++;
                                }
                                if (!this.field1257 && arg5 == 0) {
                                    class227.method1434(var13, var15, var27.field4680, var27.field4676 * 8, var27.field4690);
                                }
                                if (var20 != 12 && var27.field4674 != -1 && var27.field4675) {
                                    var17 = true;
                                }
                            } else if (var44) {
                                var52 += class257.field3189[var20];
                            } else if (var18) {
                                var52 += class474.field6691[var20];
                            } else {
                                var52 += class370.field5160[var20];
                            }
                            if (var28 != null) {
                                if (var26 == 0) {
                                    var26 = var23;
                                }
                                if (var25 == 0) {
                                    var25 = var23;
                                }
                                if (var24 == 0) {
                                    var24 = var23;
                                }
                                class355 var68 = this.field1258.method903(var23 - 1, -123);
                                class355 var69 = this.field1258.method903(var24 - 1, -80);
                                class355 var70 = this.field1258.method903(var25 - 1, -101);
                                class355 var71 = this.field1258.method903(var26 - 1, -19);
                                for (int var72 = 0; var72 < var50; var72++) {
                                    boolean var73 = false;
                                    byte var74;
                                    if (var19[-var21 & 0x3] && var45[0] == var52) {
                                        class100.field1334[0] = var49[var52];
                                        class100.field1334[1] = 1;
                                        class100.field1334[2] = var46[var52];
                                        class100.field1334[3] = 1;
                                        class100.field1334[4] = var47[var52];
                                        var74 = 6;
                                        class100.field1334[5] = var46[var52];
                                    } else if (var19[2 - var21 & 0x3] && var45[2] == var52) {
                                        class100.field1334[0] = var49[var52];
                                        class100.field1334[1] = 5;
                                        class100.field1334[2] = var46[var52];
                                        class100.field1334[3] = 5;
                                        class100.field1334[4] = var47[var52];
                                        class100.field1334[5] = var46[var52];
                                        var74 = 6;
                                    } else if (var19[1 - var21 & 0x3] && var45[1] == var52) {
                                        class100.field1334[0] = var49[var52];
                                        class100.field1334[1] = 3;
                                        class100.field1334[2] = var46[var52];
                                        class100.field1334[3] = 3;
                                        class100.field1334[4] = var47[var52];
                                        class100.field1334[5] = var46[var52];
                                        var74 = 6;
                                    } else if (var19[3 - var21 & 0x3] && var45[3] == var52) {
                                        class100.field1334[0] = var49[var52];
                                        class100.field1334[1] = 7;
                                        class100.field1334[2] = var46[var52];
                                        class100.field1334[3] = 7;
                                        class100.field1334[4] = var47[var52];
                                        var74 = 6;
                                        class100.field1334[5] = var46[var52];
                                    } else {
                                        class100.field1334[0] = var49[var52];
                                        class100.field1334[1] = var47[var52];
                                        var74 = 3;
                                        class100.field1334[2] = var46[var52];
                                    }
                                    for (int var75 = 0; var75 < var74; var75++) {
                                        int var76 = class100.field1334[var75];
                                        int var77 = var76 - (var21 * 2) & 0x7;
                                        int var78 = this.field1264[var76];
                                        int var79 = this.field1269[var76];
                                        int var80;
                                        int var81;
                                        if (var21 == 1) {
                                            var80 = var79;
                                            var81 = 512 - var78;
                                        } else if (var21 == 2) {
                                            var80 = 512 - var78;
                                            var81 = 512 - var79;
                                        } else if (var21 == 3) {
                                            var80 = 512 - var79;
                                            var81 = var78;
                                        } else {
                                            var80 = var78;
                                            var81 = var79;
                                        }
                                        var56[var53] = var80;
                                        var57[var53] = var81;
                                        if (var61 != null && class260.field3209[var20][var76]) {
                                            int var82 = (var13 << 9) + var80;
                                            int var83 = (var15 << 9) + var81;
                                            var61[var53] = arg6.method1040(var82, var83) - arg2.method1040(var82, var83);
                                        }
                                        if (var62 != null) {
                                            if (arg6 != null && !class260.field3209[var20][var76]) {
                                                int var84 = (var13 << 9) + var80;
                                                int var85 = (var15 << 9) + var81;
                                                var62[var53] = arg2.method1040(var84, var85) - arg6.method1040(var84, var85);
                                            } else if (arg0 != null && !class206.field2681[var20][var76]) {
                                                int var86 = (var13 << 9) + var80;
                                                int var87 = (var15 << 9) + var81;
                                                var62[var53] = arg0.method1040(var86, var87) - arg2.method1040(var86, var87);
                                            }
                                        }
                                        if (var76 < 8 && class144.field1877[var77] >= 0) {
                                            if (var55 != null) {
                                                var55[var53] = class304.field3931[var77];
                                            }
                                            var60[var53] = class455.field6444[var77];
                                            var59[var53] = class77.field1056[var77];
                                            var58[var53] = class324.field4452[var77];
                                        } else {
                                            if (var18 && class260.field3209[var20][var76]) {
                                                var59[var53] = var64;
                                                var60[var53] = var65;
                                                var58[var53] = var63;
                                            } else if (var80 == 0 && var81 == 0) {
                                                var58[var53] = arg1[var13][var15];
                                                var59[var53] = var68.field4966;
                                                var60[var53] = var68.field4962;
                                            } else if (var80 == 0 && var81 == 512) {
                                                var58[var53] = arg1[var13][var16];
                                                var59[var53] = var69.field4966;
                                                var60[var53] = var69.field4962;
                                            } else if (var80 == 512 && var81 == 512) {
                                                var58[var53] = arg1[var14][var16];
                                                var59[var53] = var70.field4966;
                                                var60[var53] = var70.field4962;
                                            } else if (var80 == 512 && var81 == 0) {
                                                var58[var53] = arg1[var14][var15];
                                                var59[var53] = var71.field4966;
                                                var60[var53] = var71.field4962;
                                            } else {
                                                if (var80 < 256) {
                                                    if (var81 >= 256) {
                                                        var59[var53] = var69.field4966;
                                                        var60[var53] = var69.field4962;
                                                    } else {
                                                        var59[var53] = var68.field4966;
                                                        var60[var53] = var68.field4962;
                                                    }
                                                } else if (var81 < 256) {
                                                    var59[var53] = var71.field4966;
                                                    var60[var53] = var71.field4962;
                                                } else {
                                                    var59[var53] = var70.field4966;
                                                    var60[var53] = var70.field4962;
                                                }
                                                int var88 = class183.method1123(arg1[var13][var15], var80 << 7 >> 9, (byte) -122, arg1[var14][var15]);
                                                int var89 = class183.method1123(arg1[var13][var16], var80 << 7 >> 9, (byte) 113, arg1[var14][var16]);
                                                var58[var53] = class183.method1123(var88, var81 << 7 >> 9, (byte) 121, var89);
                                            }
                                            if (var55 != null) {
                                                var55[var53] = var58[var53];
                                            }
                                        }
                                        var53++;
                                    }
                                    var52++;
                                }
                                if (var20 != 0 && var28.field4970) {
                                    var17 = true;
                                }
                            }
                            int var90 = arg2.method1031(var13, var15);
                            int var91 = arg2.method1031(var14, var15);
                            int var92 = arg2.method1031(var14, var16);
                            int var93 = arg2.method1031(var13, var16);
                            if (arg5 > 0) {
                                boolean var94 = true;
                                if (var23 == 0 && var20 != 0) {
                                    var94 = false;
                                }
                                if (var22 > 0 && var29 != null && !var29.field4678) {
                                    var94 = false;
                                }
                                if (var94 && var90 == var91 && var90 == var92 && var90 == var93) {
                                    this.field1270[arg5][var13][var15] = (byte) class292.method1790(this.field1270[arg5][var13][var15], 4);
                                }
                            }
                            int var95 = 0;
                            int var96 = 0;
                            int var97 = 0;
                            if (this.field1257) {
                                var95 = class98.method542(var13, var15);
                                var96 = class502.method2801(var13, var15);
                                var97 = class459.method2661(var13, var15);
                            }
                            arg2.method1043(var13, var15, var56, var61, var57, var62, var58, var55, var59, var60, var95, var96, var97, var17);
                            class590.method3402(arg5, var13, var15);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I[[II)V")
    public final void method526(int arg0, int[][] arg1, int arg2) {
        field1260++;
        int[][] var4 = this.field1277[arg2];
        int var5 = 0;
        int var6 = 88 / ((arg0 + 24) / 60);
        while (this.field1255 + 1 > var5) {
            for (int var7 = 0; var7 < this.field1279 + 1; var7++) {
                var4[var5][var7] += arg1[var5][var7];
            }
            var5++;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IILge;II[Lfd;B)V")
    public final void method527(int arg0, int arg1, class551 arg2, int arg3, int arg4, class143[] arg5, byte arg6) {
        field1256++;
        if (!this.field1257) {
            for (int var8 = 0; var8 < 4; var8++) {
                class143 var9 = arg5[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg4 + var10;
                        int var13 = arg3 + var11;
                        if (var12 >= 0 && this.field1255 > var12 && var13 >= 0 && this.field1279 > var13) {
                            var9.method778(var13, var12, (byte) 107);
                        }
                    }
                }
            }
        }
        if (arg6 > -66) {
            return;
        }
        int var14 = arg0 + arg4;
        int var15 = arg1 + arg3;
        for (int var16 = 0; var16 < this.field1271; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method516(arg2, false, var16, 0, 0, -12492, var15 + var18, 0, var17 + arg4, arg3 + var18, var14 + var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILqa;Lsa;Lsa;)V")
    public final void method528(int arg0, class167 arg1, class544 arg2, class544 arg3) {
        field1262++;
        int[][] var5 = new int[this.field1255][this.field1279];
        if (class624.field9030 == null || class624.field9030.length != this.field1279) {
            class364.field5091 = new int[this.field1279];
            class82.field1118 = new int[this.field1279];
            class526.field7326 = new int[this.field1279];
            class624.field9030 = new int[this.field1279];
            class523.field7291 = new int[this.field1279];
        }
        for (int var6 = 0; var6 < this.field1271; var6++) {
            for (int var8 = 0; var8 < this.field1279; var8++) {
                class624.field9030[var8] = 0;
                class523.field7291[var8] = 0;
                class82.field1118[var8] = 0;
                class364.field5091[var8] = 0;
                class526.field7326[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field1255; var9++) {
                for (int var10 = 0; var10 < this.field1279; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (this.field1255 > var19) {
                        int var20 = this.field1272[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class355 var21 = this.field1258.method903(var20 - 1, arg0 ^ 0x3FB5);
                            class624.field9030[var10] += var21.field4964;
                            class523.field7291[var10] += var21.field4969;
                            class82.field1118[var10] += var21.field4973;
                            class364.field5091[var10] += var21.field4967;
                            var10002 = class526.field7326[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field1272[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class355 var24 = this.field1258.method903(var23 - 1, arg0 + 16356);
                            class624.field9030[var10] -= var24.field4964;
                            class523.field7291[var10] -= var24.field4969;
                            class82.field1118[var10] -= var24.field4973;
                            class364.field5091[var10] -= var24.field4967;
                            var10002 = class526.field7326[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field1279; var16++) {
                        int var17 = var16 + 5;
                        if (var17 < this.field1279) {
                            var11 += class624.field9030[var17];
                            var13 += class82.field1118[var17];
                            var14 += class364.field5091[var17];
                            var12 += class523.field7291[var17];
                            var15 += class526.field7326[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var13 -= class82.field1118[var18];
                            var14 -= class364.field5091[var18];
                            var12 -= class523.field7291[var18];
                            var11 -= class624.field9030[var18];
                            var15 -= class526.field7326[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class539.method2998(var12 / var15, var13 / var15, var11 * 256 / var14, 255);
                        }
                    }
                }
            }
            if (class486.field6790) {
                this.method525(var6 == 0 ? arg3 : null, var5, class501.field6947[var6], arg1, arg0 + 16322, var6, var6 == 0 ? arg2 : null);
            } else {
                this.method519(var6 == 0 ? arg3 : null, var6 == 0 ? arg2 : null, class501.field6947[var6], arg1, var6, var5, (byte) -77);
            }
            this.field1272[var6] = null;
            this.field1265[var6] = null;
            this.field1267[var6] = null;
            this.field1266[var6] = null;
        }
        if (!this.field1257) {
            if (class190.field2458 != 0) {
                class152.method830();
            }
            if (class344.field4773) {
                class14.method67();
            }
        }
        if (arg0 == -16373) {
            for (int var7 = 0; var7 < this.field1271; var7++) {
                class501.field6947[var7].method1046();
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/lang/String;CB)I")
    public static final int method529(String arg0, char arg1, byte arg2) {
        field1259++;
        int var3 = 0;
        if (arg2 < 74) {
            field1282 = null;
        }
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg0.charAt(var5) == arg1) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(IIIZLtc;Ldd;)V")
    public class95(int arg0, int arg1, int arg2, boolean arg3, class552 arg4, class166 arg5) {
        this.field1255 = arg1;
        this.field1257 = arg3;
        this.field1258 = arg5;
        this.field1253 = arg4;
        this.field1279 = arg2;
        this.field1271 = arg0;
        this.field1272 = new byte[this.field1271][this.field1255][this.field1279];
        this.field1265 = new byte[this.field1271][this.field1255][this.field1279];
        this.field1267 = new byte[this.field1271][this.field1255][this.field1279];
        this.field1266 = new byte[this.field1271][this.field1255][this.field1279];
        this.field1277 = new int[this.field1271][this.field1255 + 1][this.field1279 + 1];
        this.field1270 = new byte[this.field1271][this.field1255 + 1][this.field1279 + 1];
    }
}
