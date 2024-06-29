import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class391 extends class274 {

    @OriginalMember(owner = "client!dfa", name = "H", descriptor = "I")
    private int field5312 = -1;

    @OriginalMember(owner = "client!dfa", name = "u", descriptor = "Lcc;")
    private class468 field5299;

    @OriginalMember(owner = "client!dfa", name = "x", descriptor = "I")
    private int field5302;

    @OriginalMember(owner = "client!dfa", name = "z", descriptor = "[[B")
    private byte[][] field5304;

    @OriginalMember(owner = "client!dfa", name = "B", descriptor = "[[B")
    private byte[][] field5306;

    @OriginalMember(owner = "client!dfa", name = "n", descriptor = "F")
    private float field5292;

    @OriginalMember(owner = "client!dfa", name = "o", descriptor = "F")
    private float field5293;

    @OriginalMember(owner = "client!dfa", name = "p", descriptor = "F")
    private float field5294;

    @OriginalMember(owner = "client!dfa", name = "q", descriptor = "F")
    private float field5295;

    @OriginalMember(owner = "client!dfa", name = "r", descriptor = "F")
    private float field5296;

    @OriginalMember(owner = "client!dfa", name = "t", descriptor = "F")
    private float field5298;

    @OriginalMember(owner = "client!dfa", name = "w", descriptor = "F")
    private float field5301;

    @OriginalMember(owner = "client!dfa", name = "y", descriptor = "F")
    private float field5303;

    @OriginalMember(owner = "client!dfa", name = "A", descriptor = "F")
    private float field5305;

    @OriginalMember(owner = "client!dfa", name = "C", descriptor = "F")
    private float field5307;

    @OriginalMember(owner = "client!dfa", name = "E", descriptor = "F")
    private float field5309;

    @OriginalMember(owner = "client!dfa", name = "G", descriptor = "F")
    private float field5311;

    @OriginalMember(owner = "client!dfa", name = "s", descriptor = "[[Lfk;")
    private class121[][] field5297;

    @OriginalMember(owner = "client!dfa", name = "F", descriptor = "[[Lpfa;")
    private class283[][] field5310;

    @OriginalMember(owner = "client!dfa", name = "v", descriptor = "[[Lit;")
    private class515[][] field5300;

    @OriginalMember(owner = "client!dfa", name = "D", descriptor = "[[Liga;")
    private class643[][] field5308;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Leq;[I)V")
    public final void method381(class670 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIIIIII[[ZLnw;Ltfa;[I[I)V")
    private final void method2223(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class348 arg8, class292 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field4656;
        this.field5299.method955(false);
        arg9.field3651 = false;
        arg9.field3653 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field5297[var18][var19] != null) {
                        class121 var20 = this.field5297[var18][var19];
                        if (var20.field1354 != -1 && (var20.field1349 & 2) == 0 && var20.field1353 == 0) {
                            int var21 = this.field5299.method2702(var20.field1354);
                            arg9.method1702(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class100.method544((byte) 15, var21, var20.field1352), class100.method544((byte) 81, var21, var20.field1351), class100.method544((byte) 96, var21, var20.field1344));
                            arg9.method1702(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class100.method544((byte) -60, var21, var20.field1350), class100.method544((byte) 108, var21, var20.field1344), class100.method544((byte) -71, var21, var20.field1351));
                        } else if (var20.field1353 == 0) {
                            arg9.method1701(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var20.field1352, var20.field1351, var20.field1344);
                            arg9.method1701(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var20.field1350, var20.field1344, var20.field1351);
                        } else {
                            int var22 = var20.field1353;
                            arg9.method1701(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class410.method2297(-2045314824, var20.field1352 & -16777216, var22), class410.method2297(-2045314824, var20.field1351 & -16777216, var22), class410.method2297(-2045314824, var20.field1344 & -16777216, var22));
                            arg9.method1701(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class410.method2297(-2045314824, var20.field1350 & -16777216, var22), class410.method2297(-2045314824, var20.field1344 & -16777216, var22), class410.method2297(-2045314824, var20.field1351 & -16777216, var22));
                        }
                    } else if (this.field5310[var18][var19] != null) {
                        class283 var23 = this.field5310[var18][var19];
                        for (int var24 = 0; var24 < var23.field3544; ++var24) {
                            arg10[var24] = var23.field3545[var24] * var14 / super.field3424 + var16;
                            arg11[var24] = var17 - var23.field3549[var24] * var14 / super.field3424;
                        }
                        for (int var25 = 0; var25 < var23.field3548; ++var25) {
                            int var26 = var25 * 3;
                            int var27 = var26 + 1;
                            int var28 = var27 + 1;
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field3547 != null && var23.field3547[var25] != 0 && (var23.field3540 == null || var23.field3540 != null && var23.field3540[var25] == -1)) {
                                int var35 = var23.field3547[var25];
                                arg9.method1701(var32, var33, var34, var29, var30, var31, 100, 100, 100, class410.method2297(-2045314824, -16777216 - (var23.field3541[var26] & -16777216), var35), class410.method2297(-2045314824, -16777216 - (var23.field3541[var27] & -16777216), var35), class410.method2297(-2045314824, -16777216 - (var23.field3541[var28] & -16777216), var35));
                            } else if (var23.field3540 != null && var23.field3540[var25] != -1) {
                                int var36 = this.field5299.method2702(var23.field3540[var25]);
                                arg9.method1702(var32, var33, var34, var29, var30, var31, 100, 100, 100, var36, var36, var36);
                            } else {
                                arg9.method1701(var32, var33, var34, var29, var30, var31, 100, 100, 100, var23.field3541[var26], var23.field3541[var27], var23.field3541[var28]);
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field3651 = true;
        this.field5299.method955(var15);
    }

    @OriginalMember(owner = "client!dfa", name = "BA", descriptor = "()V")
    public final void method392() {
        this.field5304 = null;
        this.field5306 = null;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lha;IIIIZ)Z")
    public final boolean method389(class120 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(II)V")
    public final void method383(int arg0, int arg1) {
        class348 var3 = this.field5299.method2699(Thread.currentThread());
        var3.field4680.field3649 = 0;
        if (this.field5297 != null) {
            this.method2227(arg0, arg1, var3.field4670, var3, var3.field4680, var3.field4701, var3.field4686, var3.field4702, var3.field4700);
        } else {
            if (this.field5300 != null) {
                this.method2226(arg0, arg1, var3.field4680, var3.field4701, var3.field4686, var3.field4702, var3.field4700);
            }
        }
    }

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "(I)Z")
    private final boolean method2224(int arg0) {
        if ((this.field5302 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "(II)I")
    private static final int method2225(int arg0, int arg1) {
        int var2 = (arg0 & 16711680) * arg1 >> 23;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 253) {
            var2 = 253;
        }
        int var3 = (arg0 & 65280) * arg1 >> 15;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 253) {
            var3 = 253;
        }
        int var4 = (arg0 & 255) * arg1 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 253) {
            var4 = 253;
        }
        return var2 << 16 | var3 << 8 | var4;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(III[[ZZI)V")
    public final void method380(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        class3 var7 = this.field5299.field6696;
        this.field5312 = arg5;
        this.field5295 = var7.field33;
        this.field5298 = var7.field41;
        this.field5296 = var7.field29;
        this.field5307 = var7.field22;
        this.field5292 = var7.field43;
        this.field5301 = var7.field21;
        this.field5305 = var7.field30;
        this.field5311 = var7.field36;
        this.field5293 = var7.field24;
        this.field5294 = var7.field28;
        this.field5309 = var7.field17;
        this.field5303 = var7.field44;
        for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
            for (int var9 = 0; var9 < arg2 + arg2; ++var9) {
                if (arg3[var8][var9]) {
                    int var10 = arg0 - arg2 + var8;
                    int var11 = arg1 - arg2 + var9;
                    if (var10 >= 0 && var10 < super.field3428 && var11 >= 0 && var11 < super.field3426) {
                        this.method383(var10, var11);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class348 var9 = this.field5299.method2699(Thread.currentThread());
        class292 var10 = var9.field4680;
        var10.field3649 = 0;
        var10.field3661 = false;
        this.field5299.method969();
        if (this.field5297 != null) {
            this.method2223(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field4701, var9.field4686);
        } else {
            if (this.field5300 != null) {
                this.method2228(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var9, var10, var9.field4701, var9.field4686);
            }
        }
    }

    @OriginalMember(owner = "client!dfa", name = "DA", descriptor = "(Lha;IIIIZ)V")
    public final void method385(class120 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IILtfa;[I[I[I[I)V")
    private final void method2226(int arg0, int arg1, class292 arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6) {
        class515 var8 = this.field5300[arg0][arg1];
        if (var8 != null) {
            if ((var8.field7355 & 2) == 0) {
                int var9 = super.field3424 * arg0;
                int var10 = super.field3424 + var9;
                int var11 = super.field3424 * arg1;
                int var12 = super.field3424 + var11;
                float var15;
                float var16;
                float var17;
                float var18;
                float var21;
                int var22;
                float var23;
                int var24;
                float var25;
                int var26;
                float var27;
                int var28;
                int var30;
                int var32;
                float var33;
                int var34;
                float var35;
                int var36;
                if ((var8.field7355 & 1) != 0) {
                    int var13 = super.field3423[arg0][arg1];
                    float var14 = (float) var13 * this.field5294;
                    if (this.field5312 == -1) {
                        var15 = (float) var11 * this.field5309 + (float) var9 * this.field5293 + var14 + this.field5303;
                        if (var15 <= (float) this.field5299.field6687) {
                            return;
                        }
                        var16 = (float) var11 * this.field5309 + (float) var10 * this.field5293 + var14 + this.field5303;
                        if (var16 <= (float) this.field5299.field6687) {
                            return;
                        }
                        var17 = (float) var12 * this.field5309 + (float) var10 * this.field5293 + var14 + this.field5303;
                        if (var17 <= (float) this.field5299.field6687) {
                            return;
                        }
                        var18 = (float) var12 * this.field5309 + (float) var9 * this.field5293 + var14 + this.field5303;
                        if (var18 <= (float) this.field5299.field6687) {
                            return;
                        }
                    } else {
                        var15 = (float) var11 * this.field5309 + (float) var9 * this.field5293 + var14 + this.field5303;
                        var16 = (float) var11 * this.field5309 + (float) var10 * this.field5293 + var14 + this.field5303;
                        var17 = (float) var12 * this.field5309 + (float) var10 * this.field5293 + var14 + this.field5303;
                        var18 = (float) var12 * this.field5309 + (float) var9 * this.field5293 + var14 + this.field5303;
                    }
                    float var19 = (float) var13 * this.field5298;
                    float var20 = (float) var13 * this.field5301;
                    if (this.field5312 == -1) {
                        var21 = (float) var11 * this.field5296 + (float) var9 * this.field5295 + var19 + this.field5307;
                        var22 = (int) ((float) this.field5299.field6672 * var21 / var15) + arg2.field3644;
                        var23 = (float) var11 * this.field5305 + (float) var9 * this.field5292 + var20 + this.field5311;
                        var24 = (int) ((float) this.field5299.field6681 * var23 / var15) + arg2.field3656;
                        var25 = (float) var11 * this.field5296 + (float) var10 * this.field5295 + var19 + this.field5307;
                        var26 = (int) ((float) this.field5299.field6672 * var25 / var16) + arg2.field3644;
                        var27 = (float) var11 * this.field5305 + (float) var10 * this.field5292 + var20 + this.field5311;
                        var28 = (int) ((float) this.field5299.field6681 * var27 / var16) + arg2.field3656;
                        float var29 = (float) var12 * this.field5296 + (float) var10 * this.field5295 + var19 + this.field5307;
                        var30 = (int) ((float) this.field5299.field6672 * var29 / var17) + arg2.field3644;
                        float var31 = (float) var12 * this.field5305 + (float) var10 * this.field5292 + var20 + this.field5311;
                        var32 = (int) ((float) this.field5299.field6681 * var31 / var17) + arg2.field3656;
                        var33 = (float) var12 * this.field5296 + (float) var9 * this.field5295 + var19 + this.field5307;
                        var34 = (int) ((float) this.field5299.field6672 * var33 / var18) + arg2.field3644;
                        var35 = (float) var12 * this.field5305 + (float) var9 * this.field5292 + var20 + this.field5311;
                        var36 = (int) ((float) this.field5299.field6681 * var35 / var18) + arg2.field3656;
                    } else {
                        var21 = (float) var11 * this.field5296 + (float) var9 * this.field5295 + var19 + this.field5307;
                        var22 = (int) ((float) this.field5299.field6672 * var21 / (float) this.field5312) + arg2.field3644;
                        var23 = (float) var11 * this.field5305 + (float) var9 * this.field5292 + var20 + this.field5311;
                        var24 = (int) ((float) this.field5299.field6681 * var23 / (float) this.field5312) + arg2.field3656;
                        var25 = (float) var11 * this.field5296 + (float) var10 * this.field5295 + var19 + this.field5307;
                        var26 = (int) ((float) this.field5299.field6672 * var25 / (float) this.field5312) + arg2.field3644;
                        var27 = (float) var11 * this.field5305 + (float) var10 * this.field5292 + var20 + this.field5311;
                        var28 = (int) ((float) this.field5299.field6681 * var27 / (float) this.field5312) + arg2.field3656;
                        float var37 = (float) var12 * this.field5296 + (float) var10 * this.field5295 + var19 + this.field5307;
                        var30 = (int) ((float) this.field5299.field6672 * var37 / (float) this.field5312) + arg2.field3644;
                        float var38 = (float) var12 * this.field5305 + (float) var10 * this.field5292 + var20 + this.field5311;
                        var32 = (int) ((float) this.field5299.field6681 * var38 / (float) this.field5312) + arg2.field3656;
                        var33 = (float) var12 * this.field5296 + (float) var9 * this.field5295 + var19 + this.field5307;
                        var34 = (int) ((float) this.field5299.field6672 * var33 / (float) this.field5312) + arg2.field3644;
                        var35 = (float) var12 * this.field5305 + (float) var9 * this.field5292 + var20 + this.field5311;
                        var36 = (int) ((float) this.field5299.field6681 * var35 / (float) this.field5312) + arg2.field3656;
                    }
                } else {
                    int var39 = super.field3423[arg0][arg1];
                    int var40 = super.field3423[arg0 + 1][arg1];
                    int var41 = super.field3423[arg0 + 1][arg1 + 1];
                    int var42 = super.field3423[arg0][arg1 + 1];
                    if (this.field5312 == -1) {
                        var15 = (float) var11 * this.field5309 + (float) var9 * this.field5293 + (float) var39 * this.field5294 + this.field5303;
                        if (var15 <= (float) this.field5299.field6687) {
                            return;
                        }
                        var16 = (float) var11 * this.field5309 + (float) var10 * this.field5293 + (float) var40 * this.field5294 + this.field5303;
                        if (var16 <= (float) this.field5299.field6687) {
                            return;
                        }
                        var17 = (float) var12 * this.field5309 + (float) var10 * this.field5293 + (float) var41 * this.field5294 + this.field5303;
                        if (var17 <= (float) this.field5299.field6687) {
                            return;
                        }
                        var18 = (float) var12 * this.field5309 + (float) var9 * this.field5293 + (float) var42 * this.field5294 + this.field5303;
                        if (var18 <= (float) this.field5299.field6687) {
                            return;
                        }
                        var21 = (float) var11 * this.field5296 + (float) var9 * this.field5295 + (float) var39 * this.field5298 + this.field5307;
                        var22 = (int) ((float) this.field5299.field6672 * var21 / var15) + arg2.field3644;
                        var23 = (float) var11 * this.field5305 + (float) var9 * this.field5292 + (float) var39 * this.field5301 + this.field5311;
                        var24 = (int) ((float) this.field5299.field6681 * var23 / var15) + arg2.field3656;
                        var25 = (float) var11 * this.field5296 + (float) var10 * this.field5295 + (float) var40 * this.field5298 + this.field5307;
                        var26 = (int) ((float) this.field5299.field6672 * var25 / var16) + arg2.field3644;
                        var27 = (float) var11 * this.field5305 + (float) var10 * this.field5292 + (float) var40 * this.field5301 + this.field5311;
                        var28 = (int) ((float) this.field5299.field6681 * var27 / var16) + arg2.field3656;
                        float var43 = (float) var12 * this.field5296 + (float) var10 * this.field5295 + (float) var41 * this.field5298 + this.field5307;
                        var30 = (int) ((float) this.field5299.field6672 * var43 / var17) + arg2.field3644;
                        float var44 = (float) var12 * this.field5305 + (float) var10 * this.field5292 + (float) var41 * this.field5301 + this.field5311;
                        var32 = (int) ((float) this.field5299.field6681 * var44 / var17) + arg2.field3656;
                        var33 = (float) var12 * this.field5296 + (float) var9 * this.field5295 + (float) var42 * this.field5298 + this.field5307;
                        var34 = (int) ((float) this.field5299.field6672 * var33 / var18) + arg2.field3644;
                        var35 = (float) var12 * this.field5305 + (float) var9 * this.field5292 + (float) var42 * this.field5301 + this.field5311;
                        var36 = (int) ((float) this.field5299.field6681 * var35 / var18) + arg2.field3656;
                    } else {
                        var15 = (float) var11 * this.field5309 + (float) var9 * this.field5293 + (float) var39 * this.field5294 + this.field5303;
                        var16 = (float) var11 * this.field5309 + (float) var10 * this.field5293 + (float) var40 * this.field5294 + this.field5303;
                        var17 = (float) var12 * this.field5309 + (float) var10 * this.field5293 + (float) var41 * this.field5294 + this.field5303;
                        var18 = (float) var12 * this.field5309 + (float) var9 * this.field5293 + (float) var42 * this.field5294 + this.field5303;
                        var21 = (float) var11 * this.field5296 + (float) var9 * this.field5295 + (float) var39 * this.field5298 + this.field5307;
                        var22 = (int) ((float) this.field5299.field6672 * var21 / (float) this.field5312) + arg2.field3644;
                        var23 = (float) var11 * this.field5305 + (float) var9 * this.field5292 + (float) var39 * this.field5301 + this.field5311;
                        var24 = (int) ((float) this.field5299.field6681 * var23 / (float) this.field5312) + arg2.field3656;
                        var25 = (float) var11 * this.field5296 + (float) var10 * this.field5295 + (float) var40 * this.field5298 + this.field5307;
                        var26 = (int) ((float) this.field5299.field6672 * var25 / (float) this.field5312) + arg2.field3644;
                        var27 = (float) var11 * this.field5305 + (float) var10 * this.field5292 + (float) var40 * this.field5301 + this.field5311;
                        var28 = (int) ((float) this.field5299.field6681 * var27 / (float) this.field5312) + arg2.field3656;
                        float var45 = (float) var12 * this.field5296 + (float) var10 * this.field5295 + (float) var41 * this.field5298 + this.field5307;
                        var30 = (int) ((float) this.field5299.field6672 * var45 / (float) this.field5312) + arg2.field3644;
                        float var46 = (float) var12 * this.field5305 + (float) var10 * this.field5292 + (float) var41 * this.field5301 + this.field5311;
                        var32 = (int) ((float) this.field5299.field6681 * var46 / (float) this.field5312) + arg2.field3656;
                        var33 = (float) var12 * this.field5296 + (float) var9 * this.field5295 + (float) var42 * this.field5298 + this.field5307;
                        var34 = (int) ((float) this.field5299.field6672 * var33 / (float) this.field5312) + arg2.field3644;
                        var35 = (float) var12 * this.field5305 + (float) var9 * this.field5292 + (float) var42 * this.field5301 + this.field5311;
                        var36 = (int) ((float) this.field5299.field6681 * var35 / (float) this.field5312) + arg2.field3656;
                    }
                }
                if (this.field5312 == -1) {
                    if ((var28 - var36) * (var30 - var34) - (var26 - var34) * (var32 - var36) > 0) {
                        arg2.field3661 = var30 < 0 || var34 < 0 || var26 < 0 || var30 > arg2.field3657 || var34 > arg2.field3657 || var26 > arg2.field3657;
                        if (var8.field7352 >= 0) {
                            if (this.method2224(this.field5299.field8050.method140(var8.field7352, 862).field3669)) {
                                arg2.field3649 = 100;
                            }
                            arg2.method1716(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field7356 & 65535, var8.field7357 & 65535, var8.field7353 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, (int) var15, (int) var16, (int) var18, var8.field7352);
                            arg2.field3649 = 0;
                        } else {
                            arg2.method1702(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field7356 & 65535, var8.field7357 & 65535, var8.field7353 & 65535);
                        }
                    }
                    if ((var22 - var26) * (var36 - var28) - (var24 - var28) * (var34 - var26) > 0) {
                        arg2.field3661 = var22 < 0 || var26 < 0 || var34 < 0 || var22 > arg2.field3657 || var26 > arg2.field3657 || var34 > arg2.field3657;
                        if (var8.field7352 >= 0) {
                            if (this.method2224(this.field5299.field8050.method140(var8.field7352, 862).field3669)) {
                                arg2.field3649 = 100;
                            }
                            arg2.method1716(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field7351 & 65535, var8.field7353 & 65535, var8.field7357 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, (int) var15, (int) var16, (int) var18, var8.field7352);
                            arg2.field3649 = 0;
                            return;
                        }
                        arg2.method1702(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field7351 & 65535, var8.field7353 & 65535, var8.field7357 & 65535);
                        return;
                    }
                } else {
                    if ((var28 - var36) * (var30 - var34) - (var26 - var34) * (var32 - var36) > 0) {
                        arg2.field3661 = var30 < 0 || var34 < 0 || var26 < 0 || var30 > arg2.field3657 || var34 > arg2.field3657 || var26 > arg2.field3657;
                        if (var8.field7352 >= 0) {
                            if (this.method2224(this.field5299.field8050.method140(var8.field7352, 862).field3669)) {
                                arg2.field3649 = 100;
                            }
                            arg2.method1716(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field7356 & 65535, var8.field7357 & 65535, var8.field7353 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, this.field5312, this.field5312, this.field5312, var8.field7352);
                            arg2.field3649 = 0;
                        } else {
                            arg2.method1702(var32, var36, var28, var30, var34, var26, (int) var17, (int) var18, (int) var16, var8.field7356 & 65535, var8.field7357 & 65535, var8.field7353 & 65535);
                        }
                    }
                    if ((var22 - var26) * (var36 - var28) - (var24 - var28) * (var34 - var26) > 0) {
                        arg2.field3661 = var22 < 0 || var26 < 0 || var34 < 0 || var22 > arg2.field3657 || var26 > arg2.field3657 || var34 > arg2.field3657;
                        if (var8.field7352 >= 0) {
                            if (this.method2224(this.field5299.field8050.method140(var8.field7352, 862).field3669)) {
                                arg2.field3649 = 100;
                            }
                            arg2.method1716(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field7351 & 65535, var8.field7353 & 65535, var8.field7357 & 65535, (int) var21, (int) var25, (int) var33, (int) var23, (int) var27, (int) var35, this.field5312, this.field5312, this.field5312, var8.field7352);
                            arg2.field3649 = 0;
                            return;
                        }
                        arg2.method1702(var24, var28, var36, var22, var26, var34, (int) var15, (int) var16, (int) var18, var8.field7351 & 65535, var8.field7353 & 65535, var8.field7357 & 65535);
                    }
                }
            }
        } else {
            class643 var47 = this.field5308[arg0][arg1];
            if (var47 != null) {
                if (this.field5312 == -1) {
                    for (int var48 = 0; var48 < var47.field9091; ++var48) {
                        int var49 = (arg0 << super.field3430) + var47.field9095[var48];
                        short var50 = var47.field9092[var48];
                        int var51 = (arg1 << super.field3430) + var47.field9089[var48];
                        float var52 = (float) var51 * this.field5309 + (float) var49 * this.field5293 + (float) var50 * this.field5294 + this.field5303;
                        if (var52 <= (float) this.field5299.field6687) {
                            return;
                        }
                        float var53 = (float) var51 * this.field5296 + (float) var49 * this.field5295 + (float) var50 * this.field5298 + this.field5307;
                        float var54 = (float) var51 * this.field5305 + (float) var49 * this.field5292 + (float) var50 * this.field5301 + this.field5311;
                        arg3[var48] = (int) ((float) this.field5299.field6672 * var53 / var52) + arg2.field3644;
                        arg4[var48] = (int) ((float) this.field5299.field6681 * var54 / var52) + arg2.field3656;
                        arg5[var48] = (int) var52;
                    }
                } else {
                    for (int var55 = 0; var55 < var47.field9091; ++var55) {
                        int var107 = (arg0 << super.field3430) + var47.field9095[var55];
                        short var108 = var47.field9092[var55];
                        int var109 = (arg1 << super.field3430) + var47.field9089[var55];
                        float var110 = (float) var109 * this.field5309 + (float) var107 * this.field5293 + (float) var108 * this.field5294 + this.field5303;
                        float var111 = (float) var109 * this.field5296 + (float) var107 * this.field5295 + (float) var108 * this.field5298 + this.field5307;
                        float var112 = (float) var109 * this.field5305 + (float) var107 * this.field5292 + (float) var108 * this.field5301 + this.field5311;
                        arg3[var55] = (int) ((float) this.field5299.field6672 * var111 / (float) this.field5312) + arg2.field3644;
                        arg4[var55] = (int) ((float) this.field5299.field6681 * var112 / (float) this.field5312) + arg2.field3656;
                        arg5[var55] = (int) var110;
                    }
                }
                if (var47.field9093 != null) {
                    int var56 = super.field3423[arg0][arg1];
                    int var57 = super.field3423[arg0 + 1][arg1];
                    int var58 = super.field3423[arg0][arg1 + 1];
                    int var59 = super.field3424 * arg0;
                    int var60 = super.field3424 + var59;
                    int var61 = super.field3424 * arg1;
                    int var62 = super.field3424 + var61;
                    float var63 = (float) var61 * this.field5296 + (float) var56 * this.field5298 + (float) var59 * this.field5295 + this.field5307;
                    float var64 = (float) var61 * this.field5305 + (float) var56 * this.field5301 + (float) var59 * this.field5292 + this.field5311;
                    float var65 = (float) var61 * this.field5309 + (float) var56 * this.field5294 + (float) var59 * this.field5293 + this.field5303;
                    float var66 = (float) var61 * this.field5296 + (float) var57 * this.field5298 + (float) var60 * this.field5295 + this.field5307;
                    float var67 = (float) var61 * this.field5305 + (float) var57 * this.field5301 + (float) var60 * this.field5292 + this.field5311;
                    float var68 = (float) var61 * this.field5309 + (float) var57 * this.field5294 + (float) var60 * this.field5293 + this.field5303;
                    float var69 = (float) var62 * this.field5296 + (float) var58 * this.field5298 + (float) var59 * this.field5295 + this.field5307;
                    float var70 = (float) var62 * this.field5305 + (float) var58 * this.field5301 + (float) var59 * this.field5292 + this.field5311;
                    float var71 = (float) var62 * this.field5309 + (float) var58 * this.field5294 + (float) var59 * this.field5293 + this.field5303;
                    if (this.field5312 == -1) {
                        for (int var72 = 0; var72 < var47.field9090; ++var72) {
                            short var73 = var47.field9085[var72];
                            short var74 = var47.field9086[var72];
                            short var75 = var47.field9096[var72];
                            int var76 = arg3[var73];
                            int var77 = arg3[var74];
                            int var78 = arg3[var75];
                            int var79 = arg4[var73];
                            int var80 = arg4[var74];
                            int var81 = arg4[var75];
                            if ((var76 - var77) * (var81 - var80) - (var78 - var77) * (var79 - var80) > 0) {
                                arg2.field3661 = var76 < 0 || var77 < 0 || var78 < 0 || var76 > arg2.field3657 || var77 > arg2.field3657 || var78 > arg2.field3657;
                                short var82 = var47.field9093[var72];
                                if (var82 != -1) {
                                    if (this.method2224(this.field5299.field8050.method140(var82, 862).field3669)) {
                                        arg2.field3649 = 100;
                                    }
                                    arg2.method1716(var79, var80, var81, var76, var77, var78, arg5[var73], arg5[var74], arg5[var75], var47.field9087[var73], var47.field9087[var74], var47.field9087[var75], (int) var63, (int) var66, (int) var69, (int) var64, (int) var67, (int) var70, (int) var65, (int) var68, (int) var71, var82);
                                    arg2.field3649 = 0;
                                } else {
                                    int var83 = var47.field9088[var72];
                                    if (var83 != -1) {
                                        arg2.method1702(var79, var80, var81, var76, var77, var78, arg5[var73], arg5[var74], arg5[var75], class100.method544((byte) -94, var83, var47.field9087[var73]), class100.method544((byte) -63, var83, var47.field9087[var74]), class100.method544((byte) -70, var83, var47.field9087[var75]));
                                    }
                                }
                            }
                        }
                        return;
                    }
                    for (int var84 = 0; var84 < var47.field9090; ++var84) {
                        short var85 = var47.field9085[var84];
                        short var86 = var47.field9086[var84];
                        short var87 = var47.field9096[var84];
                        int var88 = arg3[var85];
                        int var89 = arg3[var86];
                        int var90 = arg3[var87];
                        int var91 = arg4[var85];
                        int var92 = arg4[var86];
                        int var93 = arg4[var87];
                        if ((var88 - var89) * (var93 - var92) - (var90 - var89) * (var91 - var92) > 0) {
                            arg2.field3661 = var88 < 0 || var89 < 0 || var90 < 0 || var88 > arg2.field3657 || var89 > arg2.field3657 || var90 > arg2.field3657;
                            short var94 = var47.field9093[var84];
                            if (var94 != -1) {
                                if (this.method2224(this.field5299.field8050.method140(var94, 862).field3669)) {
                                    arg2.field3649 = 100;
                                }
                                arg2.method1716(var91, var92, var93, var88, var89, var90, arg5[var85], arg5[var86], arg5[var87], var47.field9087[var85], var47.field9087[var86], var47.field9087[var87], (int) var63, (int) var66, (int) var69, (int) var64, (int) var67, (int) var70, this.field5312, this.field5312, this.field5312, var94);
                                arg2.field3649 = 0;
                            } else {
                                int var95 = var47.field9088[var84];
                                if (var95 != -1) {
                                    arg2.method1702(var91, var92, var93, var88, var89, var90, arg5[var85], arg5[var86], arg5[var87], class100.method544((byte) 90, var95, var47.field9087[var85]), class100.method544((byte) -77, var95, var47.field9087[var86]), class100.method544((byte) 49, var95, var47.field9087[var87]));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var96 = 0; var96 < var47.field9090; ++var96) {
                    short var97 = var47.field9085[var96];
                    short var98 = var47.field9086[var96];
                    short var99 = var47.field9096[var96];
                    int var100 = arg3[var97];
                    int var101 = arg3[var98];
                    int var102 = arg3[var99];
                    int var103 = arg4[var97];
                    int var104 = arg4[var98];
                    int var105 = arg4[var99];
                    if ((var100 - var101) * (var105 - var104) - (var102 - var101) * (var103 - var104) > 0) {
                        int var106 = var47.field9088[var96];
                        if (var106 != -1) {
                            arg2.field3661 = var100 < 0 || var101 < 0 || var102 < 0 || var100 > arg2.field3657 || var101 > arg2.field3657 || var102 > arg2.field3657;
                            arg2.method1702(var103, var104, var105, var100, var101, var102, arg5[var97], arg5[var98], arg5[var99], class100.method544((byte) 50, var106, var47.field9087[var97]), class100.method544((byte) 16, var106, var47.field9087[var98]), class100.method544((byte) 46, var106, var47.field9087[var99]));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(III[[ZZ)V")
    public final void method376(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class3 var6 = this.field5299.field6696;
        this.field5312 = -1;
        this.field5295 = var6.field33;
        this.field5298 = var6.field41;
        this.field5296 = var6.field29;
        this.field5307 = var6.field22;
        this.field5292 = var6.field43;
        this.field5301 = var6.field21;
        this.field5305 = var6.field30;
        this.field5311 = var6.field36;
        this.field5293 = var6.field24;
        this.field5294 = var6.field28;
        this.field5309 = var6.field17;
        this.field5303 = var6.field44;
        for (int var7 = 0; var7 < arg2 + arg2; ++var7) {
            for (int var8 = 0; var8 < arg2 + arg2; ++var8) {
                if (arg3[var7][var8]) {
                    int var9 = arg0 - arg2 + var7;
                    int var10 = arg1 - arg2 + var8;
                    if (var9 >= 0 && var9 < super.field3428 && var10 >= 0 && var10 < super.field3426) {
                        this.method383(var9, var10);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dfa", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method387(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field5297 == null) {
            this.field5297 = new class121[super.field3428][super.field3426];
            this.field5310 = new class283[super.field3428][super.field3426];
        } else if (this.field5300 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class655.field9213[class316.method1815(arg6[var15], -22553) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class655.field9213[class316.method1815(arg7[var16], -22553) & 65535] << 8 | 255;
                    }
                }
            }
            boolean var17 = true;
            int var18 = -1;
            int var19 = -1;
            int var20 = -1;
            int var21 = -1;
            if (arg2.length == 6) {
                for (int var22 = 0; var22 < 6; ++var22) {
                    if (arg2[var22] == 0 && arg4[var22] == 0) {
                        if (var18 != -1 && arg6[var18] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var18 = var22;
                    } else if (arg2[var22] == super.field3424 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field3424 && arg4[var22] == super.field3424) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field3424) {
                        if (var21 != -1 && arg6[var21] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var21 = var22;
                    }
                }
                if (var18 == -1 || var19 == -1 || var20 == -1 || var21 == -1) {
                    var17 = false;
                }
                if (var17) {
                    if (arg3 != null) {
                        for (int var23 = 0; var23 < 4; ++var23) {
                            if (arg3[var23] != 0) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                    if (var17) {
                        for (int var24 = 1; var24 < 4; ++var24) {
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field3424 != arg2[var24] && arg2[0] - super.field3424 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field3424 != arg4[var24] && arg4[0] - super.field3424 != arg4[var24]) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                }
            } else {
                var17 = false;
            }
            if (var17) {
                class121 var25 = new class121();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field1353 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field1349 = (byte) (var25.field1349 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (super.field3423[arg0 + 1][arg1] == super.field3423[arg0][arg1] && super.field3423[arg0 + 1][arg1 + 1] == super.field3423[arg0][arg1] && super.field3423[arg0][arg1 + 1] == super.field3423[arg0][arg1]) {
                    var25.field1349 = (byte) (var25.field1349 | 1);
                }
                if (var27 != -1 && (var25.field1349 & 2) == 0 && !this.field5299.field8050.method140(var27, 862).field3674) {
                    var25.field1350 = this.field5304[arg0][arg1] - this.field5306[arg0][arg1];
                    var25.field1344 = this.field5304[arg0 + 1][arg1] - this.field5306[arg0 + 1][arg1];
                    var25.field1352 = this.field5304[arg0 + 1][arg1 + 1] - this.field5306[arg0 + 1][arg1 + 1];
                    var25.field1351 = this.field5304[arg0][arg1 + 1] - this.field5306[arg0][arg1 + 1];
                    var25.field1354 = (short) var27;
                } else {
                    int var28;
                    if (arg5 != null && arg11 != 0) {
                        var28 = arg5[var18] * 255 / arg11;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 > 255) {
                            var28 = 255;
                        }
                    } else {
                        var28 = 0;
                    }
                    var25.field1350 = class180.method1096(arg10, var28, 16711935, method2225(arg6[var18] >> 8, this.field5304[arg0][arg1] - this.field5306[arg0][arg1]));
                    if (var25.field1353 != 0) {
                        var25.field1350 |= 255 - (this.field5304[arg0][arg1] - this.field5306[arg0][arg1]) << 25;
                    }
                    int var29;
                    if (arg5 != null && arg11 != 0) {
                        var29 = arg5[var19] * 255 / arg11;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 > 255) {
                            var29 = 255;
                        }
                    } else {
                        var29 = 0;
                    }
                    var25.field1344 = class180.method1096(arg10, var29, 16711935, method2225(arg6[var19] >> 8, this.field5304[arg0 + 1][arg1] - this.field5306[arg0 + 1][arg1]));
                    if (var25.field1353 != 0) {
                        var25.field1344 |= 255 - (this.field5304[arg0 + 1][arg1] - this.field5306[arg0 + 1][arg1]) << 25;
                    }
                    int var30;
                    if (arg5 != null && arg11 != 0) {
                        var30 = arg5[var20] * 255 / arg11;
                        if (var30 < 0) {
                            var30 = 0;
                        } else if (var30 > 255) {
                            var30 = 255;
                        }
                    } else {
                        var30 = 0;
                    }
                    var25.field1352 = class180.method1096(arg10, var30, 16711935, method2225(arg6[var20] >> 8, this.field5304[arg0 + 1][arg1 + 1] - this.field5306[arg0 + 1][arg1 + 1]));
                    if (var25.field1353 != 0) {
                        var25.field1352 |= 255 - (this.field5304[arg0 + 1][arg1 + 1] - this.field5306[arg0 + 1][arg1 + 1]) << 25;
                    }
                    int var31;
                    if (arg5 != null && arg11 != 0) {
                        var31 = arg5[var21] * 255 / arg11;
                        if (var31 < 0) {
                            var31 = 0;
                        } else if (var31 > 255) {
                            var31 = 255;
                        }
                    } else {
                        var31 = 0;
                    }
                    var25.field1351 = class180.method1096(arg10, var31, 16711935, method2225(arg6[var21] >> 8, this.field5304[arg0][arg1 + 1] - this.field5306[arg0][arg1 + 1]));
                    if (var25.field1353 != 0) {
                        var25.field1351 |= 255 - (this.field5304[arg0][arg1 + 1] - this.field5306[arg0][arg1 + 1]) << 25;
                    }
                    var25.field1354 = -1;
                }
                if (arg5 != null) {
                    var25.field1347 = (short) arg5[var20];
                    var25.field1345 = (short) arg5[var21];
                    var25.field1346 = (short) arg5[var19];
                    var25.field1348 = (short) arg5[var18];
                }
                this.field5297[arg0][arg1] = var25;
            } else {
                class283 var32 = new class283();
                var32.field3544 = (short) arg2.length;
                var32.field3548 = (short) (arg2.length / 3);
                var32.field3545 = new short[var32.field3544];
                var32.field3543 = new short[var32.field3544];
                var32.field3549 = new short[var32.field3544];
                var32.field3541 = new int[var32.field3544];
                if (arg5 != null) {
                    var32.field3542 = new short[var32.field3544];
                }
                for (int var33 = 0; var33 < var32.field3544; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field5304[arg0][arg1] - this.field5306[arg0][arg1];
                    } else if (var48 == 0 && super.field3424 == var49) {
                        var51 = this.field5304[arg0][arg1 + 1] - this.field5306[arg0][arg1 + 1];
                    } else if (super.field3424 == var48 && super.field3424 == var49) {
                        var51 = this.field5304[arg0 + 1][arg1 + 1] - this.field5306[arg0 + 1][arg1 + 1];
                    } else if (super.field3424 == var48 && var49 == 0) {
                        var51 = this.field5304[arg0 + 1][arg1] - this.field5306[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field5304[arg0 + 1][arg1] - this.field5306[arg0 + 1][arg1]) * var48 + (this.field5304[arg0][arg1] - this.field5306[arg0][arg1]) * (super.field3424 - var48);
                        int var53 = (this.field5304[arg0 + 1][arg1 + 1] - this.field5306[arg0 + 1][arg1 + 1]) * var48 + (this.field5304[arg0][arg1 + 1] - this.field5306[arg0][arg1 + 1]) * (super.field3424 - var48);
                        var51 = (super.field3424 - var49) * var52 + var49 * var53 >> super.field3430 * 2;
                    }
                    int var54 = (arg0 << super.field3430) + var48;
                    int var55 = (arg1 << super.field3430) + var49;
                    var32.field3545[var33] = (short) var48;
                    var32.field3549[var33] = (short) var49;
                    var32.field3543[var33] = (short) (this.method1610(var54, 108, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field5299.field8050.method140(arg8[var33], 862).field3674) {
                        var32.field3541[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field3541[var33] = var51 << 25;
                        } else {
                            var32.field3541[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field3542[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field3541[var33] = class180.method1096(arg10, var56, 16711935, method2225(arg6[var33] >> 8, var51));
                        if (arg7 != null) {
                            var32.field3541[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field3548; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field5299.field8050.method140(arg8[var35 * 3], 862).field3674) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field3547 = new int[var32.field3548];
                }
                if (var34) {
                    var32.field3540 = new short[var32.field3548];
                    var32.field3546 = new short[var32.field3548];
                }
                for (int var36 = 0; var36 < var32.field3548; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field3547[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field5299.field8050.method140(var42, 862).field3674) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field5299.field8050.method140(var43, 862).field3674) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field5299.field8050.method140(var44, 862).field3674) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field3540[var36] = (short) var44;
                            var32.field3546[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field5299.field8050.method140(var45, 862).field3674) {
                                    var32.field3541[var37] = class655.field9213[class316.method1815(this.field5299.field8050.method140(var45, 862).field3683 & 65535, -22553) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field5299.field8050.method140(var46, 862).field3674) {
                                    var32.field3541[var38] = class655.field9213[class316.method1815(this.field5299.field8050.method140(var46, 862).field3683 & 65535, -22553) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field5299.field8050.method140(var47, 862).field3674) {
                                    var32.field3541[var39] = class655.field9213[class316.method1815(this.field5299.field8050.method140(var47, 862).field3683 & 65535, -22553) & 65535];
                                }
                            }
                            var32.field3540[var36] = -1;
                        }
                    }
                }
                this.field5310[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!dfa", name = "E", descriptor = "(Lha;IIIIZ)V")
    public final void method390(class120 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(IIZLnw;Ltfa;[I[I[I[I)V")
    private final void method2227(int arg0, int arg1, boolean arg2, class348 arg3, class292 arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8) {
        class121 var10 = this.field5297[arg0][arg1];
        if (var10 != null) {
            if ((var10.field1349 & 2) == 0) {
                int var11 = super.field3424 * arg0;
                int var12 = super.field3424 + var11;
                int var13 = super.field3424 * arg1;
                int var14 = super.field3424 + var13;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                float var21;
                float var22;
                float var23;
                float var24;
                float var31;
                int var32;
                float var33;
                int var34;
                float var35;
                int var36;
                float var37;
                int var38;
                float var39;
                int var40;
                float var41;
                int var42;
                float var43;
                int var44;
                float var45;
                int var46;
                if ((var10.field1349 & 1) != 0 && !arg2) {
                    int var19 = super.field3423[arg0][arg1];
                    float var20 = (float) var19 * this.field5294;
                    if (this.field5312 == -1) {
                        var21 = (float) var13 * this.field5309 + (float) var11 * this.field5293 + var20 + this.field5303;
                        if (var21 <= (float) this.field5299.field6687) {
                            return;
                        }
                        var22 = (float) var13 * this.field5309 + (float) var12 * this.field5293 + var20 + this.field5303;
                        if (var22 <= (float) this.field5299.field6687) {
                            return;
                        }
                        var23 = (float) var14 * this.field5309 + (float) var12 * this.field5293 + var20 + this.field5303;
                        if (var23 <= (float) this.field5299.field6687) {
                            return;
                        }
                        var24 = (float) var14 * this.field5309 + (float) var11 * this.field5293 + var20 + this.field5303;
                        if (var24 <= (float) this.field5299.field6687) {
                            return;
                        }
                    } else {
                        var21 = (float) var13 * this.field5309 + (float) var11 * this.field5293 + var20 + this.field5303;
                        var22 = (float) var13 * this.field5309 + (float) var12 * this.field5293 + var20 + this.field5303;
                        var23 = (float) var14 * this.field5309 + (float) var12 * this.field5293 + var20 + this.field5303;
                        var24 = (float) var14 * this.field5309 + (float) var11 * this.field5293 + var20 + this.field5303;
                    }
                    if (arg3.field4669) {
                        int var25 = (int) (var21 - (float) arg3.field4659);
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = (int) (var22 - (float) arg3.field4659);
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                        int var27 = (int) (var23 - (float) arg3.field4659);
                        if (var27 > 0) {
                            var17 = var27;
                            if (var27 > 255) {
                                var17 = 255;
                            }
                        }
                        int var28 = (int) (var24 - (float) arg3.field4659);
                        if (var28 > 0) {
                            var18 = var28;
                            if (var28 > 255) {
                                var18 = 255;
                            }
                        }
                    }
                    float var29 = (float) var19 * this.field5298;
                    float var30 = (float) var19 * this.field5301;
                    if (this.field5312 == -1) {
                        var31 = (float) var13 * this.field5296 + (float) var11 * this.field5295 + var29 + this.field5307;
                        var32 = (int) ((float) this.field5299.field6672 * var31 / var21) + arg4.field3644;
                        var33 = (float) var13 * this.field5305 + (float) var11 * this.field5292 + var30 + this.field5311;
                        var34 = (int) ((float) this.field5299.field6681 * var33 / var21) + arg4.field3656;
                        var35 = (float) var13 * this.field5296 + (float) var12 * this.field5295 + var29 + this.field5307;
                        var36 = (int) ((float) this.field5299.field6672 * var35 / var22) + arg4.field3644;
                        var37 = (float) var13 * this.field5305 + (float) var12 * this.field5292 + var30 + this.field5311;
                        var38 = (int) ((float) this.field5299.field6681 * var37 / var22) + arg4.field3656;
                        var39 = (float) var14 * this.field5296 + (float) var12 * this.field5295 + var29 + this.field5307;
                        var40 = (int) ((float) this.field5299.field6672 * var39 / var23) + arg4.field3644;
                        var41 = (float) var14 * this.field5305 + (float) var12 * this.field5292 + var30 + this.field5311;
                        var42 = (int) ((float) this.field5299.field6681 * var41 / var23) + arg4.field3656;
                        var43 = (float) var14 * this.field5296 + (float) var11 * this.field5295 + var29 + this.field5307;
                        var44 = (int) ((float) this.field5299.field6672 * var43 / var24) + arg4.field3644;
                        var45 = (float) var14 * this.field5305 + (float) var11 * this.field5292 + var30 + this.field5311;
                        var46 = (int) ((float) this.field5299.field6681 * var45 / var24) + arg4.field3656;
                    } else {
                        var31 = (float) var13 * this.field5296 + (float) var11 * this.field5295 + var29 + this.field5307;
                        var32 = (int) ((float) this.field5299.field6672 * var31 / (float) this.field5312) + arg4.field3644;
                        var33 = (float) var13 * this.field5305 + (float) var11 * this.field5292 + var30 + this.field5311;
                        var34 = (int) ((float) this.field5299.field6681 * var33 / (float) this.field5312) + arg4.field3656;
                        var35 = (float) var13 * this.field5296 + (float) var12 * this.field5295 + var29 + this.field5307;
                        var36 = (int) ((float) this.field5299.field6672 * var35 / (float) this.field5312) + arg4.field3644;
                        var37 = (float) var13 * this.field5305 + (float) var12 * this.field5292 + var30 + this.field5311;
                        var38 = (int) ((float) this.field5299.field6681 * var37 / (float) this.field5312) + arg4.field3656;
                        var39 = (float) var14 * this.field5296 + (float) var12 * this.field5295 + var29 + this.field5307;
                        var40 = (int) ((float) this.field5299.field6672 * var39 / (float) this.field5312) + arg4.field3644;
                        var41 = (float) var14 * this.field5305 + (float) var12 * this.field5292 + var30 + this.field5311;
                        var42 = (int) ((float) this.field5299.field6681 * var41 / (float) this.field5312) + arg4.field3656;
                        var43 = (float) var14 * this.field5296 + (float) var11 * this.field5295 + var29 + this.field5307;
                        var44 = (int) ((float) this.field5299.field6672 * var43 / (float) this.field5312) + arg4.field3644;
                        var45 = (float) var14 * this.field5305 + (float) var11 * this.field5292 + var30 + this.field5311;
                        var46 = (int) ((float) this.field5299.field6681 * var45 / (float) this.field5312) + arg4.field3656;
                    }
                } else {
                    int var47 = super.field3423[arg0][arg1];
                    int var48 = super.field3423[arg0 + 1][arg1];
                    int var49 = super.field3423[arg0 + 1][arg1 + 1];
                    int var50 = super.field3423[arg0][arg1 + 1];
                    if (this.field5312 == -1) {
                        var21 = (float) var13 * this.field5309 + (float) var11 * this.field5293 + (float) var47 * this.field5294 + this.field5303;
                        if (var21 <= (float) this.field5299.field6687) {
                            return;
                        }
                        var22 = (float) var13 * this.field5309 + (float) var12 * this.field5293 + (float) var48 * this.field5294 + this.field5303;
                        if (var22 <= (float) this.field5299.field6687) {
                            return;
                        }
                        var23 = (float) var14 * this.field5309 + (float) var12 * this.field5293 + (float) var49 * this.field5294 + this.field5303;
                        if (var23 <= (float) this.field5299.field6687) {
                            return;
                        }
                        var24 = (float) var14 * this.field5309 + (float) var11 * this.field5293 + (float) var50 * this.field5294 + this.field5303;
                        if (var24 <= (float) this.field5299.field6687) {
                            return;
                        }
                    } else {
                        var21 = (float) var13 * this.field5309 + (float) var11 * this.field5293 + (float) var47 * this.field5294 + this.field5303;
                        var22 = (float) var13 * this.field5309 + (float) var12 * this.field5293 + (float) var48 * this.field5294 + this.field5303;
                        var23 = (float) var14 * this.field5309 + (float) var12 * this.field5293 + (float) var49 * this.field5294 + this.field5303;
                        var24 = (float) var14 * this.field5309 + (float) var11 * this.field5293 + (float) var50 * this.field5294 + this.field5303;
                    }
                    if (arg2) {
                        int var51 = (int) (var21 - (float) arg3.field4659);
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var15 = var51;
                            int var52 = var10.field1348 * var51 / 255;
                            if (var52 > 0) {
                                var47 -= var52;
                            }
                        }
                        int var53 = (int) (var22 - (float) arg3.field4659);
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var16 = var53;
                            int var54 = var10.field1346 * var53 / 255;
                            if (var54 > 0) {
                                var48 -= var54;
                            }
                        }
                        int var55 = (int) (var23 - (float) arg3.field4659);
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var17 = var55;
                            int var56 = var10.field1347 * var55 / 255;
                            if (var56 > 0) {
                                var49 -= var56;
                            }
                        }
                        int var57 = (int) (var24 - (float) arg3.field4659);
                        if (var57 > 255) {
                            var57 = 255;
                        }
                        if (var57 > 0) {
                            var18 = var57;
                            int var58 = var10.field1345 * var57 / 255;
                            if (var58 > 0) {
                                var50 -= var58;
                            }
                        }
                    } else if (arg3.field4669) {
                        int var59 = (int) (var21 - (float) arg3.field4659);
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = (int) (var22 - (float) arg3.field4659);
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                        int var61 = (int) (var23 - (float) arg3.field4659);
                        if (var61 > 0) {
                            var17 = var61;
                            if (var61 > 255) {
                                var17 = 255;
                            }
                        }
                        int var62 = (int) (var24 - (float) arg3.field4659);
                        if (var62 > 0) {
                            var18 = var62;
                            if (var62 > 255) {
                                var18 = 255;
                            }
                        }
                    }
                    if (this.field5312 == -1) {
                        var31 = (float) var13 * this.field5296 + (float) var11 * this.field5295 + (float) var47 * this.field5298 + this.field5307;
                        var32 = (int) ((float) this.field5299.field6672 * var31 / var21) + arg4.field3644;
                        var33 = (float) var13 * this.field5305 + (float) var11 * this.field5292 + (float) var47 * this.field5301 + this.field5311;
                        var34 = (int) ((float) this.field5299.field6681 * var33 / var21) + arg4.field3656;
                        var35 = (float) var13 * this.field5296 + (float) var12 * this.field5295 + (float) var48 * this.field5298 + this.field5307;
                        var36 = (int) ((float) this.field5299.field6672 * var35 / var22) + arg4.field3644;
                        var37 = (float) var13 * this.field5305 + (float) var12 * this.field5292 + (float) var48 * this.field5301 + this.field5311;
                        var38 = (int) ((float) this.field5299.field6681 * var37 / var22) + arg4.field3656;
                        var39 = (float) var14 * this.field5296 + (float) var12 * this.field5295 + (float) var49 * this.field5298 + this.field5307;
                        var40 = (int) ((float) this.field5299.field6672 * var39 / var23) + arg4.field3644;
                        var41 = (float) var14 * this.field5305 + (float) var12 * this.field5292 + (float) var49 * this.field5301 + this.field5311;
                        var42 = (int) ((float) this.field5299.field6681 * var41 / var23) + arg4.field3656;
                        var43 = (float) var14 * this.field5296 + (float) var11 * this.field5295 + (float) var50 * this.field5298 + this.field5307;
                        var44 = (int) ((float) this.field5299.field6672 * var43 / var24) + arg4.field3644;
                        var45 = (float) var14 * this.field5305 + (float) var11 * this.field5292 + (float) var50 * this.field5301 + this.field5311;
                        var46 = (int) ((float) this.field5299.field6681 * var45 / var24) + arg4.field3656;
                    } else {
                        var31 = (float) var13 * this.field5296 + (float) var11 * this.field5295 + (float) var47 * this.field5298 + this.field5307;
                        var32 = (int) ((float) this.field5299.field6672 * var31 / (float) this.field5312) + arg4.field3644;
                        var33 = (float) var13 * this.field5305 + (float) var11 * this.field5292 + (float) var47 * this.field5301 + this.field5311;
                        var34 = (int) ((float) this.field5299.field6681 * var33 / (float) this.field5312) + arg4.field3656;
                        var35 = (float) var13 * this.field5296 + (float) var12 * this.field5295 + (float) var48 * this.field5298 + this.field5307;
                        var36 = (int) ((float) this.field5299.field6672 * var35 / (float) this.field5312) + arg4.field3644;
                        var37 = (float) var13 * this.field5305 + (float) var12 * this.field5292 + (float) var48 * this.field5301 + this.field5311;
                        var38 = (int) ((float) this.field5299.field6681 * var37 / (float) this.field5312) + arg4.field3656;
                        var39 = (float) var14 * this.field5296 + (float) var12 * this.field5295 + (float) var49 * this.field5298 + this.field5307;
                        var40 = (int) ((float) this.field5299.field6672 * var39 / (float) this.field5312) + arg4.field3644;
                        var41 = (float) var14 * this.field5305 + (float) var12 * this.field5292 + (float) var49 * this.field5301 + this.field5311;
                        var42 = (int) ((float) this.field5299.field6681 * var41 / (float) this.field5312) + arg4.field3656;
                        var43 = (float) var14 * this.field5296 + (float) var11 * this.field5295 + (float) var50 * this.field5298 + this.field5307;
                        var44 = (int) ((float) this.field5299.field6672 * var43 / (float) this.field5312) + arg4.field3644;
                        var45 = (float) var14 * this.field5305 + (float) var11 * this.field5292 + (float) var50 * this.field5301 + this.field5311;
                        var46 = (int) ((float) this.field5299.field6681 * var45 / (float) this.field5312) + arg4.field3656;
                    }
                }
                boolean var63 = var10.field1354 != -1 && this.method2224(this.field5299.field8050.method140(var10.field1354, 862).field3669);
                if (this.field5312 == -1) {
                    int var64 = var16 + var17 + var18;
                    if ((var38 - var46) * (var40 - var44) - (var36 - var44) * (var42 - var46) > 0) {
                        arg4.field3661 = var40 < 0 || var44 < 0 || var36 < 0 || var40 > arg4.field3657 || var44 > arg4.field3657 || var36 > arg4.field3657;
                        if (var64 < 765) {
                            if (var63) {
                                arg4.field3649 = 100;
                            }
                            if (var64 > 0) {
                                if (var10.field1354 >= 0) {
                                    arg4.method1709(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field4662, var17, var18, var16, var10.field1352, var10.field1351, var10.field1344, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, (int) var23, (int) var24, (int) var22, var10.field1354);
                                } else {
                                    arg4.method1701(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, class410.method2297(-2045314824, var17 << 24 | arg3.field4662, var10.field1352), class410.method2297(-2045314824, var18 << 24 | arg3.field4662, var10.field1351), class410.method2297(-2045314824, var16 << 24 | arg3.field4662, var10.field1344));
                                }
                            } else if (var10.field1354 >= 0) {
                                arg4.method1716(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field1352, var10.field1351, var10.field1344, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, (int) var23, (int) var24, (int) var22, var10.field1354);
                            } else {
                                arg4.method1701(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field1352, var10.field1351, var10.field1344);
                            }
                            arg4.field3649 = 0;
                        } else {
                            arg4.method1706(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field4662);
                        }
                    }
                    int var65 = var15 + var16 + var18;
                    if ((var32 - var36) * (var46 - var38) - (var34 - var38) * (var44 - var36) > 0) {
                        arg4.field3661 = var32 < 0 || var36 < 0 || var44 < 0 || var32 > arg4.field3657 || var36 > arg4.field3657 || var44 > arg4.field3657;
                        if (var65 < 765) {
                            if (var63) {
                                arg4.field3649 = 100;
                            }
                            if (var65 > 0) {
                                if (var10.field1354 >= 0) {
                                    arg4.method1709(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field4662, var15, var16, var18, var10.field1350, var10.field1344, var10.field1351, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, (int) var21, (int) var22, (int) var24, var10.field1354);
                                } else {
                                    arg4.method1701(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, class410.method2297(-2045314824, var15 << 24 | arg3.field4662, var10.field1350), class410.method2297(-2045314824, var16 << 24 | arg3.field4662, var10.field1344), class410.method2297(-2045314824, var18 << 24 | arg3.field4662, var10.field1351));
                                }
                            } else if (var10.field1354 >= 0) {
                                arg4.method1716(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field1350, var10.field1344, var10.field1351, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, (int) var21, (int) var22, (int) var24, var10.field1354);
                            } else {
                                arg4.method1701(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field1350, var10.field1344, var10.field1351);
                            }
                            arg4.field3649 = 0;
                            return;
                        }
                        arg4.method1706(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field4662);
                        return;
                    }
                } else {
                    int var66 = var16 + var17 + var18;
                    if ((var38 - var46) * (var40 - var44) - (var36 - var44) * (var42 - var46) > 0) {
                        arg4.field3661 = var40 < 0 || var44 < 0 || var36 < 0 || var40 > arg4.field3657 || var44 > arg4.field3657 || var36 > arg4.field3657;
                        if (var66 < 765) {
                            if (var63) {
                                arg4.field3649 = 100;
                            }
                            if (var66 > 0) {
                                if (var10.field1354 >= 0) {
                                    arg4.method1709(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field4662, var17, var18, var16, var10.field1352, var10.field1351, var10.field1344, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, this.field5312, this.field5312, this.field5312, var10.field1354);
                                } else {
                                    arg4.method1701(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, class410.method2297(-2045314824, var17 << 24 | arg3.field4662, var10.field1352), class410.method2297(-2045314824, var18 << 24 | arg3.field4662, var10.field1351), class410.method2297(-2045314824, var16 << 24 | arg3.field4662, var10.field1344));
                                }
                            } else if (var10.field1354 >= 0) {
                                arg4.method1716(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field1352, var10.field1351, var10.field1344, (int) var39, (int) var43, (int) var35, (int) var41, (int) var45, (int) var37, this.field5312, this.field5312, this.field5312, var10.field1354);
                            } else {
                                arg4.method1701(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, var10.field1352, var10.field1351, var10.field1344);
                            }
                            arg4.field3649 = 0;
                        } else {
                            arg4.method1706(var42, var46, var38, var40, var44, var36, (int) var23, (int) var24, (int) var22, arg3.field4662);
                        }
                    }
                    int var67 = var15 + var16 + var18;
                    if ((var32 - var36) * (var46 - var38) - (var34 - var38) * (var44 - var36) > 0) {
                        arg4.field3661 = var32 < 0 || var36 < 0 || var44 < 0 || var32 > arg4.field3657 || var36 > arg4.field3657 || var44 > arg4.field3657;
                        if (var67 < 765) {
                            if (var63) {
                                arg4.field3649 = 100;
                            }
                            if (var67 > 0) {
                                if (var10.field1354 >= 0) {
                                    arg4.method1709(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field4662, var15, var16, var18, var10.field1350, var10.field1344, var10.field1351, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, this.field5312, this.field5312, this.field5312, var10.field1354);
                                } else {
                                    arg4.method1701(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, class410.method2297(-2045314824, var15 << 24 | arg3.field4662, var10.field1350), class410.method2297(-2045314824, var16 << 24 | arg3.field4662, var10.field1344), class410.method2297(-2045314824, var18 << 24 | arg3.field4662, var10.field1351));
                                }
                            } else if (var10.field1354 >= 0) {
                                arg4.method1716(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field1350, var10.field1344, var10.field1351, (int) var31, (int) var35, (int) var43, (int) var33, (int) var37, (int) var45, this.field5312, this.field5312, this.field5312, var10.field1354);
                            } else {
                                arg4.method1701(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, var10.field1350, var10.field1344, var10.field1351);
                            }
                            arg4.field3649 = 0;
                            return;
                        }
                        arg4.method1706(var34, var38, var46, var32, var36, var44, (int) var21, (int) var22, (int) var24, arg3.field4662);
                    }
                }
            }
        } else {
            class283 var68 = this.field5310[arg0][arg1];
            if (var68 != null) {
                if (this.field5312 == -1) {
                    for (int var69 = 0; var69 < var68.field3544; ++var69) {
                        int var70 = (arg0 << super.field3430) + var68.field3545[var69];
                        int var71 = var68.field3543[var69];
                        int var72 = (arg1 << super.field3430) + var68.field3549[var69];
                        float var73 = (float) var72 * this.field5309 + (float) var70 * this.field5293 + (float) var71 * this.field5294 + this.field5303;
                        if (var73 <= (float) this.field5299.field6687) {
                            return;
                        }
                        arg8[var69] = 0;
                        if (arg2) {
                            int var74 = (int) (var73 - (float) arg3.field4659);
                            if (var74 > 255) {
                                var74 = 255;
                            }
                            if (var74 > 0) {
                                arg8[var69] = var74;
                                int var75 = var68.field3542[var69] * var74 / 255;
                                if (var75 > 0) {
                                    var71 -= var75;
                                }
                            }
                        } else if (arg3.field4669) {
                            int var76 = (int) (var73 - (float) arg3.field4659);
                            if (var76 > 0) {
                                arg8[var69] = var76;
                                if (arg8[var69] > 255) {
                                    arg8[var69] = 255;
                                }
                            }
                        }
                        float var77 = (float) var72 * this.field5296 + (float) var70 * this.field5295 + (float) var71 * this.field5298 + this.field5307;
                        float var78 = (float) var72 * this.field5305 + (float) var70 * this.field5292 + (float) var71 * this.field5301 + this.field5311;
                        arg5[var69] = (int) ((float) this.field5299.field6672 * var77 / var73) + arg4.field3644;
                        arg6[var69] = (int) ((float) this.field5299.field6681 * var78 / var73) + arg4.field3656;
                        arg7[var69] = (int) var73;
                    }
                } else {
                    for (int var79 = 0; var79 < var68.field3544; ++var79) {
                        int var131 = (arg0 << super.field3430) + var68.field3545[var79];
                        int var132 = var68.field3543[var79];
                        int var133 = (arg1 << super.field3430) + var68.field3549[var79];
                        float var134 = (float) var133 * this.field5309 + (float) var131 * this.field5293 + (float) var132 * this.field5294 + this.field5303;
                        arg8[var79] = 0;
                        if (arg2) {
                            int var135 = this.field5312 - arg3.field4659;
                            if (var135 > 255) {
                                var135 = 255;
                            }
                            if (var135 > 0) {
                                arg8[var79] = var135;
                                int var136 = var68.field3542[var79] * var135 / 255;
                                if (var136 > 0) {
                                    var132 -= var136;
                                }
                            }
                        } else if (arg3.field4669) {
                            int var137 = this.field5312 - arg3.field4659;
                            if (var137 > 0) {
                                arg8[var79] = var137;
                                if (arg8[var79] > 255) {
                                    arg8[var79] = 255;
                                }
                            }
                        }
                        float var138 = (float) var133 * this.field5296 + (float) var131 * this.field5295 + (float) var132 * this.field5298 + this.field5307;
                        float var139 = (float) var133 * this.field5305 + (float) var131 * this.field5292 + (float) var132 * this.field5301 + this.field5311;
                        arg5[var79] = (int) ((float) this.field5299.field6672 * var138 / (float) this.field5312) + arg4.field3644;
                        arg6[var79] = (int) ((float) this.field5299.field6681 * var139 / (float) this.field5312) + arg4.field3656;
                        arg7[var79] = (int) var134;
                    }
                }
                if (var68.field3540 != null) {
                    int var80 = super.field3423[arg0][arg1];
                    int var81 = super.field3423[arg0 + 1][arg1];
                    int var82 = super.field3423[arg0][arg1 + 1];
                    int var83 = super.field3424 * arg0;
                    int var84 = super.field3424 + var83;
                    int var85 = super.field3424 * arg1;
                    int var86 = super.field3424 + var85;
                    float var87 = (float) var85 * this.field5296 + (float) var80 * this.field5298 + (float) var83 * this.field5295 + this.field5307;
                    float var88 = (float) var85 * this.field5305 + (float) var80 * this.field5301 + (float) var83 * this.field5292 + this.field5311;
                    float var89 = (float) var85 * this.field5309 + (float) var80 * this.field5294 + (float) var83 * this.field5293 + this.field5303;
                    float var90 = (float) var85 * this.field5296 + (float) var81 * this.field5298 + (float) var84 * this.field5295 + this.field5307;
                    float var91 = (float) var85 * this.field5305 + (float) var81 * this.field5301 + (float) var84 * this.field5292 + this.field5311;
                    float var92 = (float) var85 * this.field5309 + (float) var81 * this.field5294 + (float) var84 * this.field5293 + this.field5303;
                    float var93 = (float) var86 * this.field5296 + (float) var82 * this.field5298 + (float) var83 * this.field5295 + this.field5307;
                    float var94 = (float) var86 * this.field5305 + (float) var82 * this.field5301 + (float) var83 * this.field5292 + this.field5311;
                    float var95 = (float) var86 * this.field5309 + (float) var82 * this.field5294 + (float) var83 * this.field5293 + this.field5303;
                    if (this.field5312 == -1) {
                        for (int var96 = 0; var96 < var68.field3548; ++var96) {
                            int var97 = var96 * 3;
                            int var98 = var97 + 1;
                            int var99 = var98 + 1;
                            int var100 = arg5[var97];
                            int var101 = arg5[var98];
                            int var102 = arg5[var99];
                            int var103 = arg6[var97];
                            int var104 = arg6[var98];
                            int var105 = arg6[var99];
                            int var106 = arg8[var97] + arg8[var98] + arg8[var99];
                            if ((var100 - var101) * (var105 - var104) - (var102 - var101) * (var103 - var104) > 0) {
                                arg4.field3661 = var100 < 0 || var101 < 0 || var102 < 0 || var100 > arg4.field3657 || var101 > arg4.field3657 || var102 > arg4.field3657;
                                short var107 = var68.field3540[var96];
                                if (var106 < 765) {
                                    if (var107 != -1 && this.method2224(this.field5299.field8050.method140(var107, 862).field3669)) {
                                        arg4.field3649 = 100;
                                    }
                                    if (var106 > 0) {
                                        if (var107 != -1) {
                                            arg4.method1709(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], arg3.field4662, arg8[var97], arg8[var98], arg8[var99], var68.field3541[var97], var68.field3541[var98], var68.field3541[var99], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, (int) var89, (int) var92, (int) var95, var107);
                                        } else if ((var68.field3541[var97] & 16777215) != 0) {
                                            arg4.method1701(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], class410.method2297(-2045314824, arg8[var97] << 24 | arg3.field4662, var68.field3541[var97]), class410.method2297(-2045314824, arg8[var98] << 24 | arg3.field4662, var68.field3541[var98]), class410.method2297(-2045314824, arg8[var99] << 24 | arg3.field4662, var68.field3541[var99]));
                                        }
                                    } else if (var107 != -1) {
                                        arg4.method1716(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], var68.field3541[var97], var68.field3541[var98], var68.field3541[var99], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, (int) var89, (int) var92, (int) var95, var107);
                                    } else if ((var68.field3541[var97] & 16777215) != 0) {
                                        arg4.method1701(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], var68.field3541[var97], var68.field3541[var98], var68.field3541[var99]);
                                    }
                                    arg4.field3649 = 0;
                                } else {
                                    arg4.method1706(var103, var104, var105, var100, var101, var102, arg7[var97], arg7[var98], arg7[var99], arg3.field4662);
                                }
                            }
                        }
                        return;
                    }
                    for (int var108 = 0; var108 < var68.field3548; ++var108) {
                        int var109 = var108 * 3;
                        int var110 = var109 + 1;
                        int var111 = var110 + 1;
                        int var112 = arg5[var109];
                        int var113 = arg5[var110];
                        int var114 = arg5[var111];
                        int var115 = arg6[var109];
                        int var116 = arg6[var110];
                        int var117 = arg6[var111];
                        int var118 = arg8[var109] + arg8[var110] + arg8[var111];
                        if ((var112 - var113) * (var117 - var116) - (var114 - var113) * (var115 - var116) > 0) {
                            arg4.field3661 = var112 < 0 || var113 < 0 || var114 < 0 || var112 > arg4.field3657 || var113 > arg4.field3657 || var114 > arg4.field3657;
                            short var119 = var68.field3540[var108];
                            if (var118 < 765) {
                                if (var119 != -1 && this.method2224(this.field5299.field8050.method140(var119, 862).field3669)) {
                                    arg4.field3649 = 100;
                                }
                                if (var118 > 0) {
                                    if (var119 != -1) {
                                        arg4.method1709(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], arg3.field4662, arg8[var109], arg8[var110], arg8[var111], var68.field3541[var109], var68.field3541[var110], var68.field3541[var111], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, this.field5312, this.field5312, this.field5312, var119);
                                    } else if ((var68.field3541[var109] & 16777215) != 0) {
                                        arg4.method1701(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], class410.method2297(-2045314824, arg8[var109] << 24 | arg3.field4662, var68.field3541[var109]), class410.method2297(-2045314824, arg8[var110] << 24 | arg3.field4662, var68.field3541[var110]), class410.method2297(-2045314824, arg8[var111] << 24 | arg3.field4662, var68.field3541[var111]));
                                    }
                                } else if (var119 != -1) {
                                    arg4.method1716(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], var68.field3541[var109], var68.field3541[var110], var68.field3541[var111], (int) var87, (int) var90, (int) var93, (int) var88, (int) var91, (int) var94, this.field5312, this.field5312, this.field5312, var119);
                                } else if ((var68.field3541[var109] & 16777215) != 0) {
                                    arg4.method1701(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], var68.field3541[var109], var68.field3541[var110], var68.field3541[var111]);
                                }
                                arg4.field3649 = 0;
                            } else {
                                arg4.method1706(var115, var116, var117, var112, var113, var114, arg7[var109], arg7[var110], arg7[var111], arg3.field4662);
                            }
                        }
                    }
                    return;
                }
                for (int var120 = 0; var120 < var68.field3548; ++var120) {
                    int var121 = var120 * 3;
                    int var122 = var121 + 1;
                    int var123 = var122 + 1;
                    int var124 = arg5[var121];
                    int var125 = arg5[var122];
                    int var126 = arg5[var123];
                    int var127 = arg6[var121];
                    int var128 = arg6[var122];
                    int var129 = arg6[var123];
                    int var130 = arg8[var121] + arg8[var122] + arg8[var123];
                    if ((var124 - var125) * (var129 - var128) - (var126 - var125) * (var127 - var128) > 0) {
                        arg4.field3661 = var124 < 0 || var125 < 0 || var126 < 0 || var124 > arg4.field3657 || var125 > arg4.field3657 || var126 > arg4.field3657;
                        if (var130 < 765) {
                            if (var130 > 0) {
                                if ((var68.field3541[var121] & 16777215) != 0) {
                                    arg4.method1701(var127, var128, var129, var124, var125, var126, arg7[var121], arg7[var122], arg7[var123], class180.method1096(arg3.field4662, arg8[var121], 16711935, var68.field3541[var121]), class180.method1096(arg3.field4662, arg8[var122], 16711935, var68.field3541[var122]), class180.method1096(arg3.field4662, arg8[var123], 16711935, var68.field3541[var123]));
                                }
                            } else if ((var68.field3541[var121] & 16777215) != 0) {
                                arg4.method1701(var127, var128, var129, var124, var125, var126, arg7[var121], arg7[var122], arg7[var123], var68.field3541[var121], var68.field3541[var122], var68.field3541[var123]);
                            }
                        } else {
                            arg4.method1706(var127, var128, var129, var124, var125, var126, arg7[var121], arg7[var122], arg7[var123], arg3.field4662);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(Lcc;IIII[[I[[II)V")
    public class391(class468 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field5299 = arg0;
        this.field5302 = arg2;
        this.field5304 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field5299.field6680 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field5299.field6700 * var18 + this.field5299.field6697 * var16 + this.field5299.field6684 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field5304[var11][var10] = (byte) var20;
            }
        }
        this.field5306 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "(IIIIIII[[ZLnw;Ltfa;[I[I)V")
    private final void method2228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class348 arg8, class292 arg9, int[] arg10, int[] arg11) {
        int var13 = (arg6 - arg4) * arg2 / 256;
        int var14 = arg2 >> 8;
        boolean var15 = arg8.field4656;
        this.field5299.method955(false);
        arg9.field3651 = false;
        arg9.field3653 = false;
        int var16 = arg0;
        int var17 = arg1 + var13;
        for (int var18 = arg3; var18 < arg5; ++var18) {
            for (int var19 = arg4; var19 < arg6; ++var19) {
                if (arg7[var18 - arg3][var19 - arg4]) {
                    if (this.field5300[var18][var19] != null) {
                        class515 var20 = this.field5300[var18][var19];
                        if (var20.field7352 != -1 && (var20.field7355 & 2) == 0 && var20.field7354 == -1) {
                            int var21 = this.field5299.method2702(var20.field7352);
                            arg9.method1702(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, class100.method544((byte) -121, var21, var20.field7356 & 65535), class100.method544((byte) -81, var21, var20.field7357 & 65535), class100.method544((byte) 19, var21, var20.field7353 & 65535));
                            arg9.method1702(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, class100.method544((byte) 79, var21, var20.field7351 & 65535), class100.method544((byte) 24, var21, var20.field7353 & 65535), class100.method544((byte) -83, var21, var20.field7357 & 65535));
                        } else if (var20.field7354 == -1) {
                            arg9.method1702(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var20.field7356 & 65535, var20.field7357 & 65535, var20.field7353 & 65535);
                            arg9.method1702(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var20.field7351 & 65535, var20.field7353 & 65535, var20.field7357 & 65535);
                        } else {
                            int var22 = var20.field7354;
                            arg9.method1702(var17 - var14, var17 - var14, var17, var14 + var16, var16, var14 + var16, 100, 100, 100, var22, var22, var22);
                            arg9.method1702(var17, var17, var17 - var14, var16, var14 + var16, var16, 100, 100, 100, var22, var22, var22);
                        }
                    } else if (this.field5308[var18][var19] != null) {
                        class643 var23 = this.field5308[var18][var19];
                        for (int var24 = 0; var24 < var23.field9091; ++var24) {
                            arg10[var24] = var23.field9095[var24] * var14 / super.field3424 + var16;
                            arg11[var24] = var17 - var23.field9089[var24] * var14 / super.field3424;
                        }
                        for (int var25 = 0; var25 < var23.field9090; ++var25) {
                            short var26 = var23.field9085[var25];
                            short var27 = var23.field9086[var25];
                            short var28 = var23.field9096[var25];
                            int var29 = arg10[var26];
                            int var30 = arg10[var27];
                            int var31 = arg10[var28];
                            int var32 = arg11[var26];
                            int var33 = arg11[var27];
                            int var34 = arg11[var28];
                            if (var23.field9084 != null && var23.field9084[var25] != -1) {
                                int var35 = var23.field9084[var25];
                                arg9.method1702(var32, var33, var34, var29, var30, var31, 100, 100, 100, class100.method544((byte) 77, var35, var23.field9087[var26]), class100.method544((byte) 30, var35, var23.field9087[var27]), class100.method544((byte) 93, var35, var23.field9087[var28]));
                            } else if (var23.field9093 != null && var23.field9093[var25] != -1) {
                                int var36 = this.field5299.method2702(var23.field9093[var25]);
                                arg9.method1702(var32, var33, var34, var29, var30, var31, 100, 100, 100, class100.method544((byte) -76, var36, var23.field9087[var26]), class100.method544((byte) -98, var36, var23.field9087[var27]), class100.method544((byte) 81, var36, var23.field9087[var28]));
                            } else {
                                int var37 = var23.field9088[var25];
                                arg9.method1702(var32, var33, var34, var29, var30, var31, 100, 100, 100, class100.method544((byte) -123, var37, var23.field9087[var26]), class100.method544((byte) -61, var37, var23.field9087[var27]), class100.method544((byte) 97, var37, var23.field9087[var28]));
                            }
                        }
                    }
                }
                var17 -= var14;
            }
            var17 = arg1 + var13;
            var16 += var14;
        }
        arg9.field3651 = true;
        this.field5299.method955(var15);
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method391(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field5300 == null) {
            this.field5300 = new class515[super.field3428][super.field3426];
            this.field5308 = new class643[super.field3428][super.field3426];
        } else if (this.field5297 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field3424 != var20 || var21 != 0 && super.field3424 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class643 var22 = new class643();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field9091 = var23;
            var22.field9087 = new short[var23];
            var22.field9095 = new short[var23];
            var22.field9092 = new short[var23];
            var22.field9089 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field9087[var25] = (short) (this.field5304[arg0][arg1] - this.field5306[arg0][arg1]);
                } else if (var30 == 0 && super.field3424 == var31) {
                    var22.field9087[var25] = (short) (this.field5304[arg0][arg1 + 1] - this.field5306[arg0][arg1 + 1]);
                } else if (super.field3424 == var30 && super.field3424 == var31) {
                    var22.field9087[var25] = (short) (this.field5304[arg0 + 1][arg1 + 1] - this.field5306[arg0 + 1][arg1 + 1]);
                } else if (super.field3424 == var30 && var31 == 0) {
                    var22.field9087[var25] = (short) (this.field5304[arg0 + 1][arg1] - this.field5306[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field5304[arg0 + 1][arg1] - this.field5306[arg0 + 1][arg1]) * var30 + (this.field5304[arg0][arg1] - this.field5306[arg0][arg1]) * (super.field3424 - var30);
                    int var33 = (this.field5304[arg0 + 1][arg1 + 1] - this.field5306[arg0 + 1][arg1 + 1]) * var30 + (this.field5304[arg0][arg1 + 1] - this.field5306[arg0][arg1 + 1]) * (super.field3424 - var30);
                    var22.field9087[var25] = (short) ((super.field3424 - var31) * var32 + var31 * var33 >> super.field3430 * 2);
                }
                int var34 = (arg0 << super.field3430) + var30;
                int var35 = (arg1 << super.field3430) + var31;
                var22.field9095[var25] = (short) var30;
                var22.field9089[var25] = (short) var31;
                var22.field9092[var25] = (short) (this.method1610(var34, 112, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field9087[var25] < 2) {
                    var22.field9087[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field5299.field8050.method140(arg11[var28], 862).field3674) {
                    var26 = true;
                }
            }
            var22.field9088 = new int[var27];
            if (arg10 != null) {
                var22.field9084 = new int[var27];
            }
            var22.field9085 = new short[var27];
            var22.field9086 = new short[var27];
            var22.field9096 = new short[var27];
            if (var26) {
                var22.field9093 = new short[var27];
                var22.field9094 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field9088[var22.field9090] = class316.method1815(arg9[var29], -22553);
                    } else {
                        var22.field9088[var22.field9090] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field9084[var22.field9090] = class316.method1815(arg10[var29], -22553);
                        } else {
                            var22.field9084[var22.field9090] = -1;
                        }
                    }
                    var22.field9085[var22.field9090] = (short) arg6[var29];
                    var22.field9086[var22.field9090] = (short) arg7[var29];
                    var22.field9096[var22.field9090] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field5299.field8050.method140(arg11[var29], 862).field3674) {
                            var22.field9093[var22.field9090] = (short) arg11[var29];
                            var22.field9094[var22.field9090] = (short) arg12[var29];
                        } else {
                            var22.field9093[var22.field9090] = -1;
                        }
                    }
                    ++var22.field9090;
                }
            }
            this.field5308[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class515 var36 = new class515();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field7354 = class100.method544((byte) 18, class316.method1815(arg10[0], -22553), this.field5304[arg0][arg1] - this.field5306[arg0][arg1]);
                    if (var37 == -1) {
                        var36.field7355 = (byte) (var36.field7355 | 2);
                    }
                }
                if (super.field3423[arg0 + 1][arg1] == super.field3423[arg0][arg1] && super.field3423[arg0 + 1][arg1 + 1] == super.field3423[arg0][arg1] && super.field3423[arg0][arg1 + 1] == super.field3423[arg0][arg1]) {
                    var36.field7355 = (byte) (var36.field7355 | 1);
                }
                if (var38 != -1 && (var36.field7355 & 2) == 0 && !this.field5299.field8050.method140(var38, 862).field3674) {
                    var36.field7351 = (short) (this.field5304[arg0][arg1] - this.field5306[arg0][arg1]);
                    var36.field7353 = (short) (this.field5304[arg0 + 1][arg1] - this.field5306[arg0 + 1][arg1]);
                    var36.field7356 = (short) (this.field5304[arg0 + 1][arg1 + 1] - this.field5306[arg0 + 1][arg1 + 1]);
                    var36.field7357 = (short) (this.field5304[arg0][arg1 + 1] - this.field5306[arg0][arg1 + 1]);
                    var36.field7352 = (short) var38;
                } else {
                    short var39 = class316.method1815(var37, -22553);
                    var36.field7351 = (short) class100.method544((byte) -67, var39, this.field5304[arg0][arg1] - this.field5306[arg0][arg1]);
                    var36.field7353 = (short) class100.method544((byte) -127, var39, this.field5304[arg0 + 1][arg1] - this.field5306[arg0 + 1][arg1]);
                    var36.field7356 = (short) class100.method544((byte) -124, var39, this.field5304[arg0 + 1][arg1 + 1] - this.field5306[arg0 + 1][arg1 + 1]);
                    var36.field7357 = (short) class100.method544((byte) 59, var39, this.field5304[arg0][arg1 + 1] - this.field5306[arg0][arg1 + 1]);
                    var36.field7352 = -1;
                }
                this.field5300[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!dfa", name = "v", descriptor = "(IILha;)Lha;")
    public final class120 method388(int arg0, int arg1, class120 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(III)V")
    public final void method379(int arg0, int arg1, int arg2) {
        if (this.field5306[arg0][arg1] < arg2) {
            this.field5306[arg0][arg1] = (byte) arg2;
        }
    }
}
