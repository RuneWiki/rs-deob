import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class89 {

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "[I")
    private int[] field1252 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "[I")
    private int[] field1239 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "Lcp;")
    private class684 field1247;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "Z")
    public boolean field1238;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public int field1253;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
    public int field1255;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "Ljf;")
    private class28 field1257;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "I")
    public int field1265;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "[[[B")
    private byte[][][] field1246;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "[[[B")
    private byte[][][] field1240;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "[[[B")
    private byte[][][] field1248;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "[[[B")
    public byte[][][] field1258;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "[[[B")
    private byte[][][] field1244;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "[[[I")
    public int[][][] field1245;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field1237 = 0;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "Lfh;")
    public static class266 field1249 = new class266(11, 2);

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "F")
    public static float field1263;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "Ljm;")
    public static class287 field1261;

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "[[[B")
    public byte[][][] field1259;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI[[I)V", line = 3)
    public final void method505(byte arg0, int arg1, int[][] arg2) {
        field1264++;
        int[][] var4 = this.field1245[arg1];
        if (arg0 >= -56) {
            this.method514(-64, -80, -42, -36, false, 104);
        }
        for (int var5 = 0; var5 < this.field1253 + 1; var5++) {
            for (int var6 = 0; var6 < this.field1265 + 1; var6++) {
                var4[var5][var6] += arg2[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIILes;I[Lwd;)V", line = 36)
    public final void method506(int arg0, int arg1, int arg2, int arg3, class630 arg4, int arg5, class356[] arg6) {
        if (!this.field1238) {
            for (int var8 = 0; var8 < 4; var8++) {
                class356 var9 = arg6[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg1 + var10;
                        int var13 = arg0 + var11;
                        if (var12 >= 0 && var12 < this.field1253 && var13 >= 0 && this.field1265 > var13) {
                            var9.method1959(var13, (byte) -121, var12);
                        }
                    }
                }
            }
        }
        field1241++;
        int var14 = arg1 + arg2;
        int var15 = arg0 + arg5;
        int var16 = 37 % ((62 - arg3) / 47);
        for (int var17 = 0; var17 < this.field1255; var17++) {
            for (int var18 = 0; var18 < 64; var18++) {
                for (int var19 = 0; var19 < 64; var19++) {
                    this.method507(0, 0, arg1 + var18, var15 + var19, false, arg0 + var19, 0, var14 + var18, var17, arg4, (byte) 27);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIZIIIILes;B)V", line = 112)
    private final void method507(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, class630 arg9, byte arg10) {
        if (arg10 != 27) {
            return;
        }
        field1260++;
        if (arg1 == 1) {
            arg6 = 1;
        } else if (arg1 == 2) {
            arg6 = 1;
            arg0 = 1;
        } else if (arg1 == 3) {
            arg0 = 1;
        }
        if (arg2 < 0 || this.field1253 <= arg2 || arg5 < 0 || arg5 >= this.field1265) {
            while (true) {
                int var14 = arg9.method3501(arg10 ^ 0xFFFFDBD7);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg9.method3501(arg10 ^ 0xFFFFDBD7);
                    return;
                }
                if (var14 <= 49) {
                    arg9.method3501(-9268);
                }
            }
        }
        if (!this.field1238 && !arg4) {
            class10.field190[arg8][arg2][arg5] = 0;
        }
        while (true) {
            int var12 = arg9.method3501(-9268);
            if (var12 == 0) {
                if (this.field1238) {
                    this.field1245[0][arg0 + arg2][arg5 + arg6] = 0;
                    return;
                } else if (arg8 == 0) {
                    this.field1245[0][arg0 + arg2][arg5 + arg6] = -class657.method3692(arg3 + 556238, arg7 + 932731, 45365) * 8 << 2;
                    return;
                } else {
                    this.field1245[arg8][arg0 + arg2][arg5 + arg6] = this.field1245[arg8 - 1][arg0 + arg2][arg5 + arg6] - 960;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg9.method3501(-9268);
                if (!this.field1238) {
                    if (var13 == 1) {
                        var13 = 0;
                    }
                    if (arg8 != 0) {
                        this.field1245[arg8][arg2 + arg0][arg5 + arg6] = this.field1245[arg8 - 1][arg2 + arg0][arg5 + arg6] - (var13 * 8 << 2);
                        return;
                    }
                    this.field1245[0][arg0 + arg2][arg5 + arg6] = -var13 * 8 << 2;
                    return;
                }
                this.field1245[0][arg0 + arg2][arg5 + arg6] = var13 * 8 << 2;
                return;
            }
            if (var12 <= 49) {
                if (arg4) {
                    arg9.method3501(-9268);
                } else {
                    this.field1246[arg8][arg2][arg5] = arg9.method3480(-20933);
                    this.field1244[arg8][arg2][arg5] = (byte) ((var12 - 2) / 4);
                    this.field1240[arg8][arg2][arg5] = (byte) class695.method3921(arg1 + var12 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!this.field1238 && !arg4) {
                    class10.field190[arg8][arg2][arg5] = (byte) (var12 - 49);
                }
            } else if (!arg4) {
                this.field1248[arg8][arg2][arg5] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIBII)V", line = 245)
    public final void method508(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1262++;
        int var6 = 0;
        if (arg2 != 89) {
            this.field1238 = true;
        }
        while (var6 < this.field1255) {
            this.method514(arg1, arg0, arg3, arg4, true, var6);
            var6++;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([[[I[Lwd;Lr;B)V", line = 273)
    public final void method509(int[][][] arg0, class356[] arg1, class566 arg2, byte arg3) {
        field1266++;
        if (!this.field1238) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field1253; var6++) {
                    for (int var7 = 0; var7 < this.field1265; var7++) {
                        if ((class10.field190[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class10.field190[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg1[var8].method1960((byte) 116, var7, var6);
                            }
                        }
                    }
                }
            }
        }
        for (int var9 = 0; var9 < this.field1255; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field1238) {
                if (class135.field1753) {
                    var11 |= 0x8;
                }
                if (class388.field4897) {
                    var10 |= 0x2;
                }
                if (class507.field6870 != 0) {
                    var10 |= 0x1;
                    if (class324.field4168 | var9 == 0) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class388.field4897) {
                var11 |= 0x7;
            }
            if (!class222.field2717) {
                var11 |= 0x20;
            }
            int[][] var12 = arg0 == null || arg0.length <= var9 ? this.field1245[var9] : arg0[var9];
            class366.method2006(var9, arg2.method1008(this.field1253, this.field1265, this.field1245[var9], var12, 512, var10, var11));
        }
        if (arg3 != 20) {
            this.field1246 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I[Lwd;Les;IIIIIZI)V", line = 371)
    public final void method510(int arg0, class356[] arg1, class630 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        field1256++;
        int var11 = (arg5 & 0x7) * 8;
        if (!this.field1238) {
            class356 var12 = arg1[arg0];
            for (int var13 = 0; var13 < 8; var13++) {
                for (int var14 = 0; var14 < 8; var14++) {
                    int var15 = class18.method118(var14 & 0x7, arg3, 66, var13 & 0x7) + arg7;
                    int var16 = arg6 + class277.method1576(var13 & 0x7, arg3, -101, var14 & 0x7);
                    if (var15 > 0 && (this.field1253 - 1) > var15 && var16 > 0 && (this.field1265 - 1) > var16) {
                        var12.method1959(var16, (byte) -117, var15);
                    }
                }
            }
        }
        int var17 = (arg9 & 0x7) * 8;
        int var18 = (arg5 & 0xFFFFFFF8) << 3;
        if (!arg8) {
            this.method513(104, (byte) -98, null, null, null, null, null);
        }
        int var19 = (arg9 & 0xFFFFFFF8) << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg3 == 1) {
            var21 = 1;
        } else if (arg3 == 2) {
            var20 = 1;
            var21 = 1;
        } else if (arg3 == 3) {
            var20 = 1;
        }
        for (int var22 = 0; var22 < this.field1255; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg4 == var22 && var23 >= var11 && var11 + 8 >= var23 && var17 <= var24 && var17 + 8 >= var24) {
                        int var25;
                        int var26;
                        if (var11 + 8 == var23 || var17 + 8 == var24) {
                            if (arg3 == 0) {
                                var26 = var24 - (var17 - arg6);
                                var25 = arg7 + var23 - var11;
                            } else if (arg3 == 1) {
                                var25 = var24 + arg7 - var17;
                                var26 = var11 - (var23 - (arg6 + 8));
                            } else if (arg3 == 2) {
                                var25 = var11 + arg7 + 8 - var23;
                                var26 = arg6 + var17 + 8 - var24;
                            } else {
                                var26 = var23 + arg6 - var11;
                                var25 = var17 + arg7 + 8 - var24;
                            }
                            this.method507(0, 0, var25, var19 + var24, true, var26, 0, var18 + var23, arg0, arg2, (byte) 27);
                        } else {
                            var25 = class18.method118(var24 & 0x7, arg3, -69, var23 & 0x7) + arg7;
                            var26 = arg6 + class277.method1576(var23 & 0x7, arg3, -104, var24 & 0x7);
                            this.method507(var20, arg3, var25, var19 + var24, false, var26, var21, var18 + var23, arg0, arg2, (byte) 27);
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
                                if (arg3 == 0) {
                                    var31 = var29 + arg7 - var11;
                                    var32 = arg6 + var30 - var17;
                                } else if (arg3 == 1) {
                                    var31 = var30 + arg7 - var17;
                                    var32 = arg6 + var11 + 8 - var29;
                                } else if (arg3 == 2) {
                                    var32 = var17 + arg6 + 8 - var30;
                                    var31 = var11 + arg7 + 8 - var29;
                                } else {
                                    var32 = arg6 + var29 - var11;
                                    var31 = arg7 + var17 + 8 - var30;
                                }
                                if (var31 >= 0 && var31 < this.field1253 && var32 >= 0 && this.field1265 > var32) {
                                    this.field1245[arg0][var31][var32] = this.field1245[arg0][var25 + var20][var26 + var21];
                                }
                            }
                        }
                    } else {
                        this.method507(0, 0, -1, 0, false, -1, 0, 0, 0, arg2, (byte) 27);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILgda;Lr;[[B[[BI[[BLng;IIII[Z)V", line = 572)
    private final void method511(int arg0, int arg1, class48 arg2, class566 arg3, byte[][] arg4, byte[][] arg5, int arg6, byte[][] arg7, class221 arg8, int arg9, int arg10, int arg11, int arg12, boolean[] arg13) {
        field1243++;
        boolean[] var15 = arg8 != null && arg8.field2710 ? class629.field8769[arg1] : class223.field2789[arg1];
        if (arg0 > 0) {
            if (arg6 > 0) {
                int var16 = arg4[arg6 - 1][arg0 - 1] & 0xFF;
                if (var16 > 0) {
                    class221 var17 = this.field1247.method3849(var16 - 1, (byte) 19);
                    if (var17.field2696 != -1 && var17.field2710) {
                        byte var18 = arg7[arg6 - 1][arg0 - 1];
                        int var19 = arg5[arg6 - 1][arg0 - 1] * 2 + 4 & 0x7;
                        int var20 = class239.method1433(arg3, var17, 125);
                        if (class686.field9641[var18][var19]) {
                            class509.field6892[0] = var17.field2696;
                            class456.field5830[0] = var20;
                            class549.field7643[0] = var17.field2709;
                            class245.field3048[0] = var17.field2695;
                            class506.field6698[0] = var17.field2699;
                            class255.field3116[0] = 256;
                        }
                    }
                }
            }
            if ((arg9 - 1) > arg6) {
                int var21 = arg4[arg6 + 1][arg0 - 1] & 0xFF;
                if (var21 > 0) {
                    class221 var22 = this.field1247.method3849(var21 - 1, (byte) 19);
                    if (var22.field2696 != -1 && var22.field2710) {
                        byte var23 = arg7[arg6 + 1][arg0 - 1];
                        int var24 = arg5[arg6 + 1][arg0 - 1] * 2 + 6 & 0x7;
                        int var25 = class239.method1433(arg3, var22, 127);
                        if (class686.field9641[var23][var24]) {
                            class509.field6892[2] = var22.field2696;
                            class456.field5830[2] = var25;
                            class549.field7643[2] = var22.field2709;
                            class245.field3048[2] = var22.field2695;
                            class506.field6698[2] = var22.field2699;
                            class255.field3116[2] = 512;
                        }
                    }
                }
            }
        }
        if (arg12 - 1 > arg0) {
            if (arg6 > 0) {
                int var26 = arg4[arg6 - 1][arg0 + 1] & 0xFF;
                if (var26 > 0) {
                    class221 var27 = this.field1247.method3849(var26 - 1, (byte) 19);
                    if (var27.field2696 != -1 && var27.field2710) {
                        byte var28 = arg7[arg6 - 1][arg0 + 1];
                        int var29 = arg5[arg6 - 1][arg0 + 1] * 2 + 2 & 0x7;
                        int var30 = class239.method1433(arg3, var27, 127);
                        if (class686.field9641[var28][var29]) {
                            class509.field6892[6] = var27.field2696;
                            class456.field5830[6] = var30;
                            class549.field7643[6] = var27.field2709;
                            class245.field3048[6] = var27.field2695;
                            class506.field6698[6] = var27.field2699;
                            class255.field3116[6] = 64;
                        }
                    }
                }
            }
            if (arg9 - 1 > arg6) {
                int var31 = arg4[arg6 + 1][arg0 + 1] & 0xFF;
                if (var31 > 0) {
                    class221 var32 = this.field1247.method3849(var31 - 1, (byte) 19);
                    if (var32.field2696 != -1 && var32.field2710) {
                        byte var33 = arg7[arg6 + 1][arg0 + 1];
                        int var34 = arg5[arg6 + 1][arg0 + 1] * 2 & 0x7;
                        int var35 = class239.method1433(arg3, var32, arg10 - 11632);
                        if (class686.field9641[var33][var34]) {
                            class509.field6892[4] = var32.field2696;
                            class456.field5830[4] = var35;
                            class549.field7643[4] = var32.field2709;
                            class245.field3048[4] = var32.field2695;
                            class506.field6698[4] = var32.field2699;
                            class255.field3116[4] = 128;
                        }
                    }
                }
            }
        }
        if (arg0 > 0) {
            int var36 = arg4[arg6][arg0 - 1] & 0xFF;
            if (var36 > 0) {
                class221 var37 = this.field1247.method3849(var36 - 1, (byte) 19);
                if (var37.field2696 != -1) {
                    byte var38 = arg7[arg6][arg0 - 1];
                    byte var39 = arg5[arg6][arg0 - 1];
                    if (var37.field2710) {
                        int var40 = 2;
                        int var41 = var39 * 2 + 4;
                        int var42 = class239.method1433(arg3, var37, 121);
                        for (int var43 = 0; var43 < 3; var43++) {
                            var40 &= 0x7;
                            var41 &= 0x7;
                            if (class686.field9641[var38][var41] && var37.field2699 >= class506.field6698[var40]) {
                                class509.field6892[var40] = var37.field2696;
                                class456.field5830[var40] = var42;
                                class549.field7643[var40] = var37.field2709;
                                class245.field3048[var40] = var37.field2695;
                                if (class506.field6698[var40] == var37.field2699) {
                                    class255.field3116[var40] = class444.method2376(class255.field3116[var40], 32);
                                } else {
                                    class255.field3116[var40] = 32;
                                }
                                class506.field6698[var40] = var37.field2699;
                            }
                            var41++;
                            var40--;
                        }
                        if (!var15[arg11 & 0x3]) {
                            arg13[0] = class629.field8769[var38][class695.method3921(var39 + 2, 3)];
                        }
                    } else if (!var15[arg11 & 0x3]) {
                        arg13[0] = class223.field2789[var38][class695.method3921(3, var39 + 2)];
                    }
                }
            }
        }
        if (arg0 < arg12 - 1) {
            int var44 = arg4[arg6][arg0 + 1] & 0xFF;
            if (var44 > 0) {
                class221 var45 = this.field1247.method3849(var44 - 1, (byte) 19);
                if (var45.field2696 != -1) {
                    byte var46 = arg7[arg6][arg0 + 1];
                    byte var47 = arg5[arg6][arg0 + 1];
                    if (var45.field2710) {
                        int var48 = 4;
                        int var49 = var47 * 2 + 2;
                        int var50 = class239.method1433(arg3, var45, 125);
                        for (int var51 = 0; var51 < 3; var51++) {
                            var49 &= 0x7;
                            var48 &= 0x7;
                            if (class686.field9641[var46][var49] && var45.field2699 >= class506.field6698[var48]) {
                                class509.field6892[var48] = var45.field2696;
                                class456.field5830[var48] = var50;
                                class549.field7643[var48] = var45.field2709;
                                class245.field3048[var48] = var45.field2695;
                                if (class506.field6698[var48] == var45.field2699) {
                                    class255.field3116[var48] = class444.method2376(class255.field3116[var48], 16);
                                } else {
                                    class255.field3116[var48] = 16;
                                }
                                class506.field6698[var48] = var45.field2699;
                            }
                            var48++;
                            var49--;
                        }
                        if (!var15[arg11 + 2 & 0x3]) {
                            arg13[2] = class629.field8769[var46][class695.method3921(3, -(-var47))];
                        }
                    } else if (!var15[arg11 + 2 & 0x3]) {
                        arg13[2] = class223.field2789[var46][class695.method3921(3, var47)];
                    }
                }
            }
        }
        if (arg6 > 0) {
            int var52 = arg4[arg6 - 1][arg0] & 0xFF;
            if (var52 > 0) {
                class221 var53 = this.field1247.method3849(var52 - 1, (byte) 19);
                if (var53.field2696 != -1) {
                    byte var54 = arg7[arg6 - 1][arg0];
                    byte var55 = arg5[arg6 - 1][arg0];
                    if (var53.field2710) {
                        int var56 = 6;
                        int var57 = var55 * 2 + 4;
                        int var58 = class239.method1433(arg3, var53, 124);
                        for (int var59 = 0; var59 < 3; var59++) {
                            var57 &= 0x7;
                            var56 &= 0x7;
                            if (class686.field9641[var54][var57] && class506.field6698[var56] <= var53.field2699) {
                                class509.field6892[var56] = var53.field2696;
                                class456.field5830[var56] = var58;
                                class549.field7643[var56] = var53.field2709;
                                class245.field3048[var56] = var53.field2695;
                                if (class506.field6698[var56] == var53.field2699) {
                                    class255.field3116[var56] = class444.method2376(class255.field3116[var56], 8);
                                } else {
                                    class255.field3116[var56] = 8;
                                }
                                class506.field6698[var56] = var53.field2699;
                            }
                            var56++;
                            var57--;
                        }
                        if (!var15[arg11 + 3 & 0x3]) {
                            arg13[3] = class629.field8769[var54][class695.method3921(var55 + 1, 3)];
                        }
                    } else if (!var15[arg11 + 3 & 0x3]) {
                        arg13[3] = class223.field2789[var54][class695.method3921(var55 + 1, 3)];
                    }
                }
            }
        }
        if (arg10 != 11756) {
            this.method514(112, 30, -96, -96, false, 60);
        }
        if (arg6 < arg9 - 1) {
            int var60 = arg4[arg6 + 1][arg0] & 0xFF;
            if (var60 > 0) {
                class221 var61 = this.field1247.method3849(var60 - 1, (byte) 19);
                if (var61.field2696 != -1) {
                    byte var62 = arg7[arg6 + 1][arg0];
                    byte var63 = arg5[arg6 + 1][arg0];
                    if (var61.field2710) {
                        int var64 = 4;
                        int var65 = var63 * 2 + 6;
                        int var66 = class239.method1433(arg3, var61, arg10 ^ 0x2D9B);
                        for (int var67 = 0; var67 < 3; var67++) {
                            var65 &= 0x7;
                            var64 &= 0x7;
                            if (class686.field9641[var62][var65] && class506.field6698[var64] <= var61.field2699) {
                                class509.field6892[var64] = var61.field2696;
                                class456.field5830[var64] = var66;
                                class549.field7643[var64] = var61.field2709;
                                class245.field3048[var64] = var61.field2695;
                                if (class506.field6698[var64] == var61.field2699) {
                                    class255.field3116[var64] = class444.method2376(class255.field3116[var64], 4);
                                } else {
                                    class255.field3116[var64] = 4;
                                }
                                class506.field6698[var64] = var61.field2699;
                            }
                            var65++;
                            var64--;
                        }
                        if (!var15[arg11 + 1 & 0x3]) {
                            arg13[1] = class629.field8769[var62][class695.method3921(var63 + 3, 3)];
                        }
                    } else if (!var15[arg11 + 1 & 0x3]) {
                        arg13[1] = class223.field2789[var62][class695.method3921(var63 + 3, 3)];
                    }
                }
            }
        }
        if (arg8 == null) {
            return;
        }
        int var68 = class239.method1433(arg3, arg8, 127);
        if (!arg8.field2710) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - arg11 * 2 & 0x7;
            if (class686.field9641[arg1][var69] && class506.field6698[var70] <= arg8.field2699) {
                class509.field6892[var70] = arg8.field2696;
                class456.field5830[var70] = var68;
                class549.field7643[var70] = arg8.field2709;
                class245.field3048[var70] = arg8.field2695;
                if (class506.field6698[var70] == arg8.field2699) {
                    class255.field3116[var70] = class444.method2376(class255.field3116[var70], 2);
                } else {
                    class255.field3116[var70] = 2;
                }
                class506.field6698[var70] = arg8.field2699;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(IIIZLcp;Ljf;)V", line = 2546)
    public class89(int arg0, int arg1, int arg2, boolean arg3, class684 arg4, class28 arg5) {
        this.field1247 = arg4;
        this.field1238 = arg3;
        this.field1253 = arg1;
        this.field1255 = arg0;
        this.field1257 = arg5;
        this.field1265 = arg2;
        this.field1246 = new byte[this.field1255][this.field1253][this.field1265];
        this.field1240 = new byte[this.field1255][this.field1253][this.field1265];
        this.field1248 = new byte[this.field1255][this.field1253][this.field1265];
        this.field1258 = new byte[this.field1255][this.field1253 + 1][this.field1265 + 1];
        this.field1244 = new byte[this.field1255][this.field1253][this.field1265];
        this.field1245 = new int[this.field1255][this.field1253 + 1][this.field1265 + 1];
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lr;Li;Li;Z[[IILi;)V", line = 1041)
    private final void method512(class566 arg0, class272 arg1, class272 arg2, boolean arg3, int[][] arg4, int arg5, class272 arg6) {
        if (!arg3) {
            this.field1258 = null;
        }
        for (int var8 = 0; var8 < this.field1253; var8++) {
            for (int var9 = 0; var9 < this.field1265; var9++) {
                if (class232.field2895 == -1 || class367.method2011(arg5, class232.field2895, var8, (byte) 108, var9)) {
                    byte var10 = this.field1244[arg5][var8][var9];
                    byte var11 = this.field1240[arg5][var8][var9];
                    int var12 = this.field1246[arg5][var8][var9] & 0xFF;
                    int var13 = this.field1248[arg5][var8][var9] & 0xFF;
                    class221 var14 = var12 == 0 ? null : this.field1247.method3849(var12 - 1, (byte) 19);
                    class48 var15 = var13 == 0 ? null : this.field1257.method192(false, var13 - 1);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var17 = var14 == null ? 0 : class318.field4069[var10];
                        var16 = var15 == null ? 0 : class297.field3665[var10];
                    } else if (var14 != null) {
                        var17 = class318.field4069[var10];
                    } else if (var15 != null) {
                        var16 = class318.field4069[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int var20;
                        if (class119.field1528) {
                            var20 = var14 == null ? -1 : var14.field2709;
                        } else {
                            var20 = -1;
                        }
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        int[] var24 = new int[var18];
                        boolean var25 = false;
                        if (var14 != null && (var14.field2696 != -1 || var14.field2702 != -1 || var20 != -1)) {
                            for (int var26 = 0; var26 < var17; var26++) {
                                var23[var19] = var20;
                                var24[var19] = var14.field2695;
                                if (var14.field2696 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var21[var19] = var14.field2696;
                                }
                                if (var14.field2702 == -1) {
                                    var22[var19] = -1;
                                } else {
                                    var22[var19] = var14.field2702;
                                    var25 = true;
                                }
                                var19++;
                            }
                            if (!this.field1238 && arg5 == 0) {
                                class305.method1749(var8, var9, var14.field2706, var14.field2705 * 8, var14.field2693);
                            }
                        } else {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var21[var19] = -1;
                                var19++;
                            }
                        }
                        if (!var25) {
                            var22 = null;
                        }
                        if (var15 == null) {
                            for (int var30 = 0; var30 < var16; var30++) {
                                var21[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var28 = var15.field680;
                            if (class119.field1528) {
                                var28 = -1;
                            }
                            for (int var29 = 0; var29 < var16; var29++) {
                                var23[var19] = var28;
                                var24[var19] = var15.field682;
                                var21[var19] = arg4[var8][var9];
                                if (var22 != null) {
                                    var22[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = this.field1252.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg1 == null ? null : new int[var31];
                        int[] var35 = arg1 == null && arg6 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var46 = this.field1252[var36];
                            int var47 = this.field1239[var36];
                            if (var11 == 0) {
                                var32[var36] = var46;
                                var33[var36] = var47;
                            } else if (var11 == 1) {
                                var32[var36] = var47;
                                var33[var36] = 512 - var46;
                            } else if (var11 == 2) {
                                var32[var36] = 512 - var46;
                                var33[var36] = 512 - var47;
                            } else if (var11 == 3) {
                                var32[var36] = 512 - var47;
                                var33[var36] = var46;
                            }
                            if (var34 != null && class686.field9641[var10][var36]) {
                                int var50 = (var8 << 9) + var46;
                                int var51 = (var9 << 9) + var46;
                                var34[var36] = arg1.method1565(var51, var50, arg3) - arg2.method1565(var51, var50, true);
                            }
                            if (var35 != null) {
                                if (arg1 != null && !class686.field9641[var10][var36]) {
                                    int var52 = (var8 << 9) + var46;
                                    int var53 = (var9 << 9) + var46;
                                    var35[var36] = arg2.method1565(var53, var52, true) - arg1.method1565(var53, var52, true);
                                } else if (arg6 != null && !class71.field953[var10][var36]) {
                                    int var54 = (var8 << 9) + var46;
                                    int var55 = (var9 << 9) + var46;
                                    var35[var36] = arg6.method1565(var55, var54, true) - arg2.method1565(var55, var54, true);
                                }
                            }
                        }
                        int var37 = arg2.method1562(var9, (byte) 51, var8);
                        int var38 = arg2.method1562(var9, (byte) 51, var8 + 1);
                        int var39 = arg2.method1562(var9 + 1, (byte) 51, var8 + 1);
                        int var40 = arg2.method1562(var9 + 1, (byte) 51, var8);
                        boolean var41 = class3.method22(var9, var8, 5706);
                        if (var41 && arg5 > 1 || !var41 && arg5 > 0) {
                            boolean var42 = true;
                            if (var15 != null && !var15.field673) {
                                var42 = false;
                            } else if (var13 == 0 && var10 != 0) {
                                var42 = false;
                            } else if (var12 > 0 && var14 != null && !var14.field2708) {
                                var42 = false;
                            }
                            if (var42 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field1258[arg5][var8][var9] = (byte) class444.method2376(this.field1258[arg5][var8][var9], 4);
                            }
                        }
                        int var43 = 0;
                        int var44 = 0;
                        int var45 = 0;
                        if (this.field1238) {
                            var43 = class385.method2073(var8, var9);
                            var44 = class686.method3858(var8, var9);
                            var45 = class228.method1364(var8, var9);
                        }
                        arg2.method1276(var8, var9, var32, var34, var33, var35, class558.field7748[var10], class683.field9598[var10], class455.field5824[var10], var21, var22, var23, var24, var43, var44, var45, false);
                        class182.method1135(arg5, var8, var9);
                    }
                }
            }
        }
        field1250++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBLi;Lr;[[ILi;Li;)V", line = 1372)
    private final void method513(int arg0, byte arg1, class272 arg2, class566 arg3, int[][] arg4, class272 arg5, class272 arg6) {
        field1254++;
        byte[][] var8 = this.field1244[arg0];
        byte[][] var9 = this.field1240[arg0];
        byte[][] var10 = this.field1248[arg0];
        if (arg1 != -121) {
            this.method511(104, 126, null, null, null, null, 47, null, null, 89, 16, 100, 85, null);
        }
        byte[][] var11 = this.field1246[arg0];
        for (int var12 = 0; var12 < this.field1253; var12++) {
            int var13 = (this.field1253 - 1) <= var12 ? var12 : var12 + 1;
            for (int var14 = 0; var14 < this.field1265; var14++) {
                int var15 = (this.field1265 - 1) <= var14 ? var14 : var14 + 1;
                if (class232.field2895 == -1 || class367.method2011(arg0, class232.field2895, var12, (byte) 108, var14)) {
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
                        class221 var26 = var21 == 0 ? null : this.field1247.method3849(var21 - 1, (byte) 19);
                        class48 var27 = var22 == 0 ? null : this.field1257.method192(false, var22 - 1);
                        if (var19 == 0 && var26 == null) {
                            var19 = 12;
                        }
                        class221 var28 = var26;
                        if (var26 != null) {
                            if (var26.field2696 == -1 && var26.field2702 == -1) {
                                var28 = var26;
                                var26 = null;
                            } else if (var27 != null && var19 != 0) {
                                var17 = var26.field2710;
                            }
                        }
                        if ((var19 == 0 || var19 == 12) && var12 > 0 && var14 > 0 && this.field1253 > var12 && var14 < this.field1265) {
                            byte var29 = 0;
                            byte var30 = 0;
                            byte var31 = 0;
                            int var32 = var30 + (var10[var13][var14 - 1] == var22 ? 1 : -1);
                            int var33 = var31 + (var10[var13][var15] == var22 ? 1 : -1);
                            byte var34 = 0;
                            int var35 = var29 + (var10[var12 - 1][var14 - 1] == var22 ? 1 : -1);
                            if (var10[var12][var14 - 1] == var22) {
                                var35++;
                                var32++;
                            } else {
                                var35--;
                                var32--;
                            }
                            int var36 = var34 + (var10[var12 - 1][var15] == var22 ? 1 : -1);
                            if (var10[var13][var14] == var22) {
                                var33++;
                                var32++;
                            } else {
                                var33--;
                                var32--;
                            }
                            if (var10[var12][var15] == var22) {
                                var33++;
                                var36++;
                            } else {
                                var36--;
                                var33--;
                            }
                            if (var10[var12 - 1][var14] == var22) {
                                var36++;
                                var35++;
                            } else {
                                var35--;
                                var36--;
                            }
                            int var37 = var35 - var33;
                            if (var37 < 0) {
                                var37 = -var37;
                            }
                            int var38 = var32 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            if (var37 == var38) {
                                var37 = arg2.method1562(var14, (byte) 51, var12) - arg2.method1562(var15, (byte) 51, var13);
                                if (var37 < 0) {
                                    var37 = -var37;
                                }
                                var38 = arg2.method1562(var14, (byte) 51, var13) - arg2.method1562(var15, (byte) 51, var12);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                            }
                            var20 = var38 <= var37 ? 0 : 1;
                        }
                        for (int var39 = 0; var39 < 13; var39++) {
                            class506.field6698[var39] = -1;
                            class255.field3116[var39] = 1;
                        }
                        boolean[] var40 = var26 != null && var26.field2710 ? class629.field8769[var19] : class223.field2789[var19];
                        this.method511(var14, var19, var27, arg3, var11, var9, var12, var8, var26, this.field1253, arg1 ^ 0xFFFFD26B, var20, this.field1265, var18);
                        boolean var41 = var26 != null && var26.field2702 != var26.field2696;
                        if (!var41) {
                            for (int var42 = 0; var42 < 8; var42++) {
                                if (class506.field6698[var42] >= 0 && class509.field6892[var42] != class456.field5830[var42]) {
                                    var41 = true;
                                    break;
                                }
                            }
                        }
                        if (!var40[var20 + 1 & 0x3]) {
                            var18[1] = class451.method2420(var18[1], class695.method3921(class255.field3116[4], class255.field3116[2]) == 0);
                        }
                        if (!var40[var20 + 3 & 0x3]) {
                            var18[3] = class451.method2420(var18[3], class695.method3921(class255.field3116[0], class255.field3116[6]) == 0);
                        }
                        if (!var40[var20 & 0x3]) {
                            var18[0] = class451.method2420(var18[0], class695.method3921(class255.field3116[0], class255.field3116[2]) == 0);
                        }
                        if (!var40[var20 + 2 & 0x3]) {
                            var18[2] = class451.method2420(var18[2], class695.method3921(class255.field3116[6], class255.field3116[4]) == 0);
                        }
                        if (!var17 && (var19 == 0 || var19 == 12)) {
                            if (var18[0] && !var18[1] && !var18[2] && var18[3]) {
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[3] = false;
                                var20 = 0;
                            } else if (var18[0] && var18[1] && !var18[2] && !var18[3]) {
                                var20 = 3;
                                var19 = var19 == 0 ? 13 : 14;
                                var18[0] = var18[1] = false;
                            } else if (!var18[0] && var18[1] && var18[2] && !var18[3]) {
                                var18[1] = var18[2] = false;
                                var20 = 2;
                                var19 = var19 == 0 ? 13 : 14;
                            } else if (!var18[0] && !var18[1] && var18[2] && var18[3]) {
                                var18[2] = var18[3] = false;
                                var20 = 1;
                                var19 = var19 == 0 ? 13 : 14;
                            }
                        }
                        boolean var43 = !var17 && !var18[0] && !var18[2] && !var18[1] && !var18[3];
                        int[] var44 = null;
                        int[] var45;
                        int var46;
                        int[] var47;
                        int[] var48;
                        int var49;
                        if (var43) {
                            var45 = class683.field9598[var19];
                            var46 = var27 == null ? 0 : class297.field3665[var19];
                            var47 = class558.field7748[var19];
                            var48 = class455.field5824[var19];
                            var49 = var26 == null ? 0 : class318.field4069[var19];
                        } else if (var17) {
                            var49 = var26 == null ? 0 : class128.field1607[var19];
                            var48 = class181.field2325[var19];
                            var45 = class686.field9648[var19];
                            var44 = class35.field478[var19];
                            var46 = var27 == null ? 0 : class655.field9232[var19];
                            var47 = class612.field8606[var19];
                        } else {
                            var49 = var26 == null ? 0 : class534.field7196[var19];
                            var44 = class626.field8735[var19];
                            var47 = class677.field9504[var19];
                            var45 = class390.field4916[var19];
                            var46 = var27 == null ? 0 : class304.field3731[var19];
                            var48 = class368.field4676[var19];
                        }
                        int var50 = var46 + var49;
                        if (var50 <= 0) {
                            class182.method1135(arg0, var12, var14);
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
                            int[] var60 = arg6 == null ? null : new int[var53];
                            int[] var61 = arg6 == null && arg5 == null ? null : new int[var53];
                            int var62 = -1;
                            int var63 = -1;
                            int var64 = 256;
                            if (var26 != null) {
                                var64 = var26.field2695;
                                var63 = var26.field2709;
                                var62 = var26.field2696;
                                int var65 = class239.method1433(arg3, var26, 119);
                                for (int var66 = 0; var66 < var49; var66++) {
                                    boolean var67 = false;
                                    byte var68;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class670.field9440[0] = var47[var51];
                                        class670.field9440[1] = 1;
                                        class670.field9440[2] = var48[var51];
                                        class670.field9440[3] = 1;
                                        class670.field9440[4] = var45[var51];
                                        class670.field9440[5] = var48[var51];
                                        var68 = 6;
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class670.field9440[0] = var47[var51];
                                        class670.field9440[1] = 5;
                                        class670.field9440[2] = var48[var51];
                                        class670.field9440[3] = 5;
                                        class670.field9440[4] = var45[var51];
                                        var68 = 6;
                                        class670.field9440[5] = var48[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class670.field9440[0] = var47[var51];
                                        class670.field9440[1] = 3;
                                        class670.field9440[2] = var48[var51];
                                        class670.field9440[3] = 3;
                                        class670.field9440[4] = var45[var51];
                                        var68 = 6;
                                        class670.field9440[5] = var48[var51];
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class670.field9440[0] = var47[var51];
                                        class670.field9440[1] = 7;
                                        class670.field9440[2] = var48[var51];
                                        class670.field9440[3] = 7;
                                        class670.field9440[4] = var45[var51];
                                        class670.field9440[5] = var48[var51];
                                        var68 = 6;
                                    } else {
                                        class670.field9440[0] = var47[var51];
                                        class670.field9440[1] = var45[var51];
                                        var68 = 3;
                                        class670.field9440[2] = var48[var51];
                                    }
                                    var51++;
                                    for (int var69 = 0; var69 < var68; var69++) {
                                        int var70 = class670.field9440[var69];
                                        int var71 = var70 - (var20 * 2) & 0x7;
                                        int var72 = this.field1252[var70];
                                        int var73 = this.field1239[var70];
                                        int var74;
                                        int var75;
                                        if (var20 == 1) {
                                            var75 = 512 - var72;
                                            var74 = var73;
                                        } else if (var20 == 2) {
                                            var74 = 512 - var72;
                                            var75 = 512 - var73;
                                        } else if (var20 == 3) {
                                            var74 = 512 - var73;
                                            var75 = var72;
                                        } else {
                                            var74 = var72;
                                            var75 = var73;
                                        }
                                        var55[var52] = var74;
                                        var56[var52] = var75;
                                        if (var60 != null && class686.field9641[var19][var70]) {
                                            int var76 = (var12 << 9) + var74;
                                            int var77 = (var14 << 9) + var75;
                                            var60[var52] = arg6.method1565(var77, var76, true) - arg2.method1565(var77, var76, true);
                                        }
                                        if (var61 != null) {
                                            if (arg6 != null && !class686.field9641[var19][var70]) {
                                                int var78 = (var12 << 9) + var74;
                                                int var79 = (var14 << 9) + var75;
                                                var61[var52] = arg2.method1565(var79, var78, true) - arg6.method1565(var79, var78, true);
                                            } else if (arg5 != null && !class71.field953[var19][var70]) {
                                                int var80 = (var12 << 9) + var74;
                                                int var81 = (var14 << 9) + var75;
                                                var61[var52] = arg5.method1565(var81, var80, true) - arg2.method1565(var81, var80, true);
                                            }
                                        }
                                        if (var70 < 8 && class506.field6698[var71] > var26.field2699) {
                                            if (var54 != null) {
                                                var54[var52] = class456.field5830[var71];
                                            }
                                            var59[var52] = class245.field3048[var71];
                                            var58[var52] = class549.field7643[var71];
                                            var57[var52] = class509.field6892[var71];
                                        } else {
                                            if (var54 != null) {
                                                var54[var52] = var65;
                                            }
                                            var58[var52] = var26.field2709;
                                            var59[var52] = var26.field2695;
                                            var57[var52] = var62;
                                        }
                                        var52++;
                                    }
                                }
                                if (!this.field1238 && arg0 == 0) {
                                    class305.method1749(var12, var14, var26.field2706, var26.field2705 * 8, var26.field2693);
                                }
                                if (var19 != 12 && var26.field2696 != -1 && var26.field2698) {
                                    var16 = true;
                                }
                            } else if (var43) {
                                var51 += class318.field4069[var19];
                            } else if (var17) {
                                var51 += class128.field1607[var19];
                            } else {
                                var51 += class534.field7196[var19];
                            }
                            if (var27 != null) {
                                if (var23 == 0) {
                                    var23 = var22;
                                }
                                if (var25 == 0) {
                                    var25 = var22;
                                }
                                if (var24 == 0) {
                                    var24 = var22;
                                }
                                class48 var82 = this.field1257.method192(false, var22 - 1);
                                class48 var83 = this.field1257.method192(false, var23 - 1);
                                class48 var84 = this.field1257.method192(false, var24 - 1);
                                class48 var85 = this.field1257.method192(false, var25 - 1);
                                for (int var86 = 0; var86 < var46; var86++) {
                                    boolean var87 = false;
                                    byte var88;
                                    if (var18[-var20 & 0x3] && var44[0] == var51) {
                                        class670.field9440[0] = var47[var51];
                                        class670.field9440[1] = 1;
                                        class670.field9440[2] = var48[var51];
                                        class670.field9440[3] = 1;
                                        class670.field9440[4] = var45[var51];
                                        var88 = 6;
                                        class670.field9440[5] = var48[var51];
                                    } else if (var18[2 - var20 & 0x3] && var44[2] == var51) {
                                        class670.field9440[0] = var47[var51];
                                        class670.field9440[1] = 5;
                                        class670.field9440[2] = var48[var51];
                                        class670.field9440[3] = 5;
                                        class670.field9440[4] = var45[var51];
                                        var88 = 6;
                                        class670.field9440[5] = var48[var51];
                                    } else if (var18[1 - var20 & 0x3] && var44[1] == var51) {
                                        class670.field9440[0] = var47[var51];
                                        class670.field9440[1] = 3;
                                        class670.field9440[2] = var48[var51];
                                        class670.field9440[3] = 3;
                                        class670.field9440[4] = var45[var51];
                                        class670.field9440[5] = var48[var51];
                                        var88 = 6;
                                    } else if (var18[3 - var20 & 0x3] && var44[3] == var51) {
                                        class670.field9440[0] = var47[var51];
                                        class670.field9440[1] = 7;
                                        class670.field9440[2] = var48[var51];
                                        class670.field9440[3] = 7;
                                        class670.field9440[4] = var45[var51];
                                        class670.field9440[5] = var48[var51];
                                        var88 = 6;
                                    } else {
                                        class670.field9440[0] = var47[var51];
                                        class670.field9440[1] = var45[var51];
                                        var88 = 3;
                                        class670.field9440[2] = var48[var51];
                                    }
                                    for (int var89 = 0; var89 < var88; var89++) {
                                        int var90 = class670.field9440[var89];
                                        int var91 = var90 - (var20 * 2) & 0x7;
                                        int var92 = this.field1252[var90];
                                        int var93 = this.field1239[var90];
                                        int var94;
                                        int var95;
                                        if (var20 == 1) {
                                            var94 = var93;
                                            var95 = 512 - var92;
                                        } else if (var20 == 2) {
                                            var94 = 512 - var92;
                                            var95 = 512 - var93;
                                        } else if (var20 == 3) {
                                            var95 = var92;
                                            var94 = 512 - var93;
                                        } else {
                                            var94 = var92;
                                            var95 = var93;
                                        }
                                        var55[var52] = var94;
                                        var56[var52] = var95;
                                        if (var60 != null && class686.field9641[var19][var90]) {
                                            int var96 = (var12 << 9) + var94;
                                            int var97 = (var14 << 9) + var95;
                                            var60[var52] = arg6.method1565(var97, var96, true) - arg2.method1565(var97, var96, true);
                                        }
                                        if (var61 != null) {
                                            if (arg6 != null && !class686.field9641[var19][var90]) {
                                                int var98 = (var12 << 9) + var94;
                                                int var99 = (var14 << 9) + var95;
                                                var61[var52] = arg2.method1565(var99, var98, true) - arg6.method1565(var99, var98, true);
                                            } else if (arg5 != null && !class71.field953[var19][var90]) {
                                                int var100 = (var12 << 9) + var94;
                                                int var101 = (var14 << 9) + var95;
                                                var61[var52] = arg5.method1565(var101, var100, true) - arg2.method1565(var101, var100, true);
                                            }
                                        }
                                        if (var90 < 8 && class506.field6698[var91] >= 0) {
                                            if (var54 != null) {
                                                var54[var52] = class456.field5830[var91];
                                            }
                                            var59[var52] = class245.field3048[var91];
                                            var58[var52] = class549.field7643[var91];
                                            var57[var52] = class509.field6892[var91];
                                        } else {
                                            if (var17 && class686.field9641[var19][var90]) {
                                                var58[var52] = var63;
                                                var59[var52] = var64;
                                                var57[var52] = var62;
                                            } else if (var94 == 0 && var95 == 0) {
                                                var57[var52] = arg4[var12][var14];
                                                var58[var52] = var82.field680;
                                                var59[var52] = var82.field682;
                                            } else if (var94 == 0 && var95 == 512) {
                                                var57[var52] = arg4[var12][var15];
                                                var58[var52] = var83.field680;
                                                var59[var52] = var83.field682;
                                            } else if (var94 == 512 && var95 == 512) {
                                                var57[var52] = arg4[var13][var15];
                                                var58[var52] = var84.field680;
                                                var59[var52] = var84.field682;
                                            } else if (var94 == 512 && var95 == 0) {
                                                var57[var52] = arg4[var13][var14];
                                                var58[var52] = var85.field680;
                                                var59[var52] = var85.field682;
                                            } else {
                                                if (var94 < 256) {
                                                    if (var95 >= 256) {
                                                        var58[var52] = var83.field680;
                                                        var59[var52] = var83.field682;
                                                    } else {
                                                        var58[var52] = var82.field680;
                                                        var59[var52] = var82.field682;
                                                    }
                                                } else if (var95 < 256) {
                                                    var58[var52] = var85.field680;
                                                    var59[var52] = var85.field682;
                                                } else {
                                                    var58[var52] = var84.field680;
                                                    var59[var52] = var84.field682;
                                                }
                                                int var102 = class75.method446(arg4[var12][var14], arg4[var13][var14], var94 << 7 >> 9, (byte) 99);
                                                int var103 = class75.method446(arg4[var12][var15], arg4[var13][var15], var94 << 7 >> 9, (byte) 99);
                                                var57[var52] = class75.method446(var102, var103, var95 << 7 >> 9, (byte) 99);
                                            }
                                            if (var54 != null) {
                                                var54[var52] = var57[var52];
                                            }
                                        }
                                        var52++;
                                    }
                                    var51++;
                                }
                                if (var19 != 0 && var27.field669) {
                                    var16 = true;
                                }
                            }
                            int var104 = arg2.method1562(var14, (byte) 51, var12);
                            int var105 = arg2.method1562(var14, (byte) 51, var13);
                            int var106 = arg2.method1562(var15, (byte) 51, var13);
                            int var107 = arg2.method1562(var15, (byte) 51, var12);
                            boolean var108 = class3.method22(var14, var12, 5706);
                            if (var108 && arg0 > 1 || !var108 && arg0 > 0) {
                                boolean var109 = true;
                                if (var27 != null && !var27.field673) {
                                    var109 = false;
                                } else if (var22 == 0 && var19 != 0) {
                                    var109 = false;
                                } else if (var21 > 0 && var28 != null && !var28.field2708) {
                                    var109 = false;
                                }
                                if (var109 && var104 == var105 && var104 == var106 && var104 == var107) {
                                    this.field1258[arg0][var12][var14] = (byte) class444.method2376(this.field1258[arg0][var12][var14], 4);
                                }
                            }
                            int var110 = 0;
                            int var111 = 0;
                            int var112 = 0;
                            if (this.field1238) {
                                var110 = class385.method2073(var12, var14);
                                var111 = class686.method3858(var12, var14);
                                var112 = class228.method1364(var12, var14);
                            }
                            arg2.method1275(var12, var14, var55, var60, var56, var61, var57, var54, var58, var59, var110, var111, var112, var16);
                            class182.method1135(arg0, var12, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIIZI)V", line = 2257)
    private final void method514(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (!arg4) {
            this.method509(null, null, null, (byte) 51);
        }
        for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
            for (int var10 = arg2; var10 < arg0 + arg2; var10++) {
                if (var10 >= 0 && var10 < this.field1253 && var7 >= 0 && var7 < this.field1265) {
                    this.field1245[arg5][var10][var7] = arg5 > 0 ? this.field1245[arg5 - 1][var10][var7] - 960 : 0;
                }
            }
        }
        field1242++;
        if (arg2 > 0 && arg2 < this.field1253) {
            for (int var8 = arg1 + 1; var8 < (arg1 + arg3); var8++) {
                if (var8 >= 0 && this.field1265 > var8) {
                    this.field1245[arg5][arg2][var8] = this.field1245[arg5][arg2 - 1][var8];
                }
            }
        }
        if (arg1 > 0 && arg1 < this.field1265) {
            for (int var9 = arg2 + 1; var9 < arg0 + arg2; var9++) {
                if (var9 >= 0 && var9 < this.field1253) {
                    this.field1245[arg5][var9][arg1] = this.field1245[arg5][var9][arg1 - 1];
                }
            }
        }
        if (arg2 < 0 || arg1 < 0 || this.field1253 <= arg2 || this.field1265 <= arg1) {
            return;
        }
        if (arg5 == 0) {
            if (arg2 > 0 && this.field1245[arg5][arg2 - 1][arg1] != 0) {
                this.field1245[arg5][arg2][arg1] = this.field1245[arg5][arg2 - 1][arg1];
                return;
            }
            if (arg1 <= 0 || this.field1245[arg5][arg2][arg1 - 1] == 0) {
                if (arg2 > 0 && arg1 > 0 && this.field1245[arg5][arg2 - 1][arg1 - 1] != 0) {
                    this.field1245[arg5][arg2][arg1] = this.field1245[arg5][arg2 - 1][arg1 - 1];
                    return;
                }
                return;
            }
            this.field1245[arg5][arg2][arg1] = this.field1245[arg5][arg2][arg1 - 1];
        } else if (arg2 <= 0 || this.field1245[arg5 - 1][arg2 - 1][arg1] == this.field1245[arg5][arg2 - 1][arg1]) {
            if (arg1 > 0 && this.field1245[arg5][arg2][arg1 - 1] != this.field1245[arg5 - 1][arg2][arg1 - 1]) {
                this.field1245[arg5][arg2][arg1] = this.field1245[arg5][arg2][arg1 - 1];
                return;
            }
            if (arg2 > 0 && arg1 > 0 && this.field1245[arg5 - 1][arg2 - 1][arg1 - 1] != this.field1245[arg5][arg2 - 1][arg1 - 1]) {
                this.field1245[arg5][arg2][arg1] = this.field1245[arg5][arg2 - 1][arg1 - 1];
                return;
            }
        } else {
            this.field1245[arg5][arg2][arg1] = this.field1245[arg5][arg2 - 1][arg1];
            return;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 2352)
    public static void method515(int arg0) {
        field1261 = null;
        if (arg0 != 9964) {
            method515(80);
        }
        field1249 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Li;Li;ILr;)V", line = 2366)
    public final void method516(class272 arg0, class272 arg1, int arg2, class566 arg3) {
        field1251++;
        int[][] var5 = new int[this.field1253][this.field1265];
        if (class460.field5850 == null || class460.field5850.length != this.field1265) {
            class207.field2621 = new int[this.field1265];
            class460.field5850 = new int[this.field1265];
            class169.field2208 = new int[this.field1265];
            class395.field4987 = new int[this.field1265];
            class705.field9941 = new int[this.field1265];
        }
        int var6 = 86 % ((arg2 - 52) / 48);
        for (int var7 = 0; var7 < this.field1255; var7++) {
            for (int var9 = 0; var9 < this.field1265; var9++) {
                class460.field5850[var9] = 0;
                class705.field9941[var9] = 0;
                class169.field2208[var9] = 0;
                class395.field4987[var9] = 0;
                class207.field2621[var9] = 0;
            }
            for (int var10 = -5; var10 < this.field1253; var10++) {
                for (int var11 = 0; var11 < this.field1265; var11++) {
                    int var20 = var10 + 5;
                    int var10002;
                    if (var20 < this.field1253) {
                        int var21 = this.field1248[var7][var20][var11] & 0xFF;
                        if (var21 > 0) {
                            class48 var22 = this.field1257.method192(false, var21 - 1);
                            class460.field5850[var11] += var22.field670;
                            class705.field9941[var11] += var22.field678;
                            class169.field2208[var11] += var22.field676;
                            class395.field4987[var11] += var22.field674;
                            var10002 = class207.field2621[var11]++;
                        }
                    }
                    int var23 = var10 - 5;
                    if (var23 >= 0) {
                        int var24 = this.field1248[var7][var23][var11] & 0xFF;
                        if (var24 > 0) {
                            class48 var25 = this.field1257.method192(false, var24 - 1);
                            class460.field5850[var11] -= var25.field670;
                            class705.field9941[var11] -= var25.field678;
                            class169.field2208[var11] -= var25.field676;
                            class395.field4987[var11] -= var25.field674;
                            var10002 = class207.field2621[var11]--;
                        }
                    }
                }
                if (var10 >= 0) {
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = 0;
                    for (int var17 = -5; var17 < this.field1265; var17++) {
                        int var18 = var17 + 5;
                        if (this.field1265 > var18) {
                            var14 += class169.field2208[var18];
                            var15 += class395.field4987[var18];
                            var16 += class207.field2621[var18];
                            var12 += class460.field5850[var18];
                            var13 += class705.field9941[var18];
                        }
                        int var19 = var17 - 5;
                        if (var19 >= 0) {
                            var14 -= class169.field2208[var19];
                            var15 -= class395.field4987[var19];
                            var12 -= class460.field5850[var19];
                            var16 -= class207.field2621[var19];
                            var13 -= class705.field9941[var19];
                        }
                        if (var17 >= 0 && var15 > 0 && var16 > 0) {
                            var5[var10][var17] = class589.method3241(217, var12 * 256 / var15, var14 / var16, var13 / var16);
                        }
                    }
                }
            }
            if (class349.field4463) {
                this.method513(var7, (byte) -121, class491.field6485[var7], arg3, var5, var7 == 0 ? arg0 : null, var7 == 0 ? arg1 : null);
            } else {
                this.method512(arg3, var7 == 0 ? arg1 : null, class491.field6485[var7], true, var5, var7, var7 == 0 ? arg0 : null);
            }
            this.field1248[var7] = null;
            this.field1246[var7] = null;
            this.field1244[var7] = null;
            this.field1240[var7] = null;
        }
        if (!this.field1238) {
            if (class507.field6870 != 0) {
                class688.method3880();
            }
            if (class388.field4897) {
                class318.method1830();
            }
        }
        for (int var8 = 0; var8 < this.field1255; var8++) {
            class491.field6485[var8].method1288();
        }
    }
}
