import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class671 extends class418 {

    @OriginalMember(owner = "client!aga", name = "G", descriptor = "F")
    private float field9405 = Float.MAX_VALUE;

    @OriginalMember(owner = "client!aga", name = "W", descriptor = "F")
    private float field9420 = -3.4028235E38F;

    @OriginalMember(owner = "client!aga", name = "T", descriptor = "Lv;")
    private class165 field9418 = new class165();

    @OriginalMember(owner = "client!aga", name = "x", descriptor = "Llba;")
    public class223 field9396;

    @OriginalMember(owner = "client!aga", name = "K", descriptor = "I")
    private int field9409;

    @OriginalMember(owner = "client!aga", name = "I", descriptor = "[[[Lnk;")
    private class478[][][] field9407;

    @OriginalMember(owner = "client!aga", name = "eb", descriptor = "[[B")
    private byte[][] field9428;

    @OriginalMember(owner = "client!aga", name = "s", descriptor = "[[[I")
    public int[][][] field9391;

    @OriginalMember(owner = "client!aga", name = "p", descriptor = "[[B")
    private byte[][] field9388;

    @OriginalMember(owner = "client!aga", name = "S", descriptor = "I")
    public int field9417;

    @OriginalMember(owner = "client!aga", name = "bb", descriptor = "[[F")
    private float[][] field9425;

    @OriginalMember(owner = "client!aga", name = "C", descriptor = "[[S")
    public short[][] field9401;

    @OriginalMember(owner = "client!aga", name = "H", descriptor = "I")
    private int field9406;

    @OriginalMember(owner = "client!aga", name = "L", descriptor = "[[[I")
    private int[][][] field9410;

    @OriginalMember(owner = "client!aga", name = "cb", descriptor = "[[F")
    private float[][] field9426;

    @OriginalMember(owner = "client!aga", name = "J", descriptor = "[[[I")
    private int[][][] field9408;

    @OriginalMember(owner = "client!aga", name = "fb", descriptor = "[[F")
    private float[][] field9429;

    @OriginalMember(owner = "client!aga", name = "B", descriptor = "[[[I")
    public int[][][] field9400;

    @OriginalMember(owner = "client!aga", name = "Q", descriptor = "[[[I")
    public int[][][] field9415;

    @OriginalMember(owner = "client!aga", name = "db", descriptor = "Llk;")
    private class638 field9427;

    @OriginalMember(owner = "client!aga", name = "D", descriptor = "Lbha;")
    private class273 field9402;

    @OriginalMember(owner = "client!aga", name = "M", descriptor = "Ljn;")
    public static class134 field9411 = new class134(130, 0);

    @OriginalMember(owner = "client!aga", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field9423 = "";

    @OriginalMember(owner = "client!aga", name = "m", descriptor = "I")
    public static int field9385;

    @OriginalMember(owner = "client!aga", name = "n", descriptor = "I")
    public static int field9386;

    @OriginalMember(owner = "client!aga", name = "o", descriptor = "I")
    public static int field9387;

    @OriginalMember(owner = "client!aga", name = "q", descriptor = "I")
    public static int field9389;

    @OriginalMember(owner = "client!aga", name = "r", descriptor = "I")
    public static int field9390;

    @OriginalMember(owner = "client!aga", name = "t", descriptor = "I")
    public static int field9392;

    @OriginalMember(owner = "client!aga", name = "u", descriptor = "I")
    public static int field9393;

    @OriginalMember(owner = "client!aga", name = "w", descriptor = "I")
    private int field9395;

    @OriginalMember(owner = "client!aga", name = "y", descriptor = "I")
    public static int field9397;

    @OriginalMember(owner = "client!aga", name = "z", descriptor = "I")
    public static int field9398;

    @OriginalMember(owner = "client!aga", name = "A", descriptor = "I")
    public static int field9399;

    @OriginalMember(owner = "client!aga", name = "E", descriptor = "I")
    public static int field9403;

    @OriginalMember(owner = "client!aga", name = "F", descriptor = "I")
    public static int field9404;

    @OriginalMember(owner = "client!aga", name = "N", descriptor = "I")
    public static int field9412;

    @OriginalMember(owner = "client!aga", name = "O", descriptor = "I")
    private int field9413;

    @OriginalMember(owner = "client!aga", name = "P", descriptor = "I")
    public static int field9414;

    @OriginalMember(owner = "client!aga", name = "R", descriptor = "I")
    public static int field9416;

    @OriginalMember(owner = "client!aga", name = "X", descriptor = "I")
    public static int field9421;

    @OriginalMember(owner = "client!aga", name = "Y", descriptor = "I")
    public static int field9422;

    @OriginalMember(owner = "client!aga", name = "gb", descriptor = "I")
    private int field9430;

    @OriginalMember(owner = "client!aga", name = "ib", descriptor = "I")
    private int field9432;

    @OriginalMember(owner = "client!aga", name = "kb", descriptor = "Lbfa;")
    public class262 field9434;

    @OriginalMember(owner = "client!aga", name = "U", descriptor = "Lvfa;")
    public static class484 field9419;

    @OriginalMember(owner = "client!aga", name = "hb", descriptor = "Lfw;")
    private class716 field9431;

    @OriginalMember(owner = "client!aga", name = "jb", descriptor = "Lfw;")
    private class716 field9433;

    @OriginalMember(owner = "client!aga", name = "ab", descriptor = "[Lnk;")
    private class478[] field9424;

    @OriginalMember(owner = "client!aga", name = "v", descriptor = "[[[I")
    private int[][][] field9394;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(III[[ZZI)V")
    public final void method1374(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5) {
        ++field9399;
        this.method3829(arg2, -1, arg3, arg5, arg4, arg0, arg1, -20445);
    }

    @OriginalMember(owner = "client!aga", name = "ka", descriptor = "(III)V")
    public final void method1376(int arg0, int arg1, int arg2) {
        ++field9404;
        if (~(this.field9428[arg0][arg1] & 255) > ~arg2) {
            this.field9428[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Llba;IIII[[I[[II)V")
    public class671(class223 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7, arg5);
        this.field9396 = arg0;
        this.field9409 = super.field5825 + -2;
        this.field9407 = new class478[arg3][arg4][];
        this.field9428 = new byte[arg3 - -1][arg4 + 1];
        this.field9391 = new int[arg3][arg4][];
        this.field9388 = new byte[arg3][arg4];
        this.field9417 = arg2;
        this.field9425 = new float[super.field5827 + 1][super.field5826 + 1];
        this.field9401 = new short[arg3 * arg4][];
        this.field9406 = 1 << this.field9409;
        this.field9410 = new int[arg3][arg4][];
        this.field9426 = new float[super.field5827 + 1][super.field5826 + 1];
        this.field9408 = new int[arg3][arg4][];
        this.field9429 = new float[super.field5827 + 1][super.field5826 - -1];
        this.field9400 = new int[arg3][arg4][];
        this.field9415 = new int[arg3][arg4][];
        for (int var9 = 0; ~super.field5826 <= ~var9; ++var9) {
            for (int var10 = 0; var10 <= super.field5827; ++var10) {
                int var11 = super.field5823[var10][var9];
                if (this.field9405 > (float) var11) {
                    this.field9405 = (float) var11;
                }
                if (this.field9420 < (float) var11) {
                    this.field9420 = (float) var11;
                }
                if (~var10 < -1 && var9 > 0 && super.field5827 > var10 && ~super.field5826 < ~var9) {
                    int var12 = arg6[var10 + 1][var9] + -arg6[var10 + -1][var9];
                    int var13 = arg6[var10][var9 + 1] + -arg6[var10][var9 + -1];
                    float var14 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * 4 * arg7 + var13 * var13)));
                    this.field9429[var10][var9] = (float) var12 * var14;
                    this.field9425[var10][var9] = (float) (-arg7 * 2) * var14;
                    this.field9426[var10][var9] = (float) var13 * var14;
                }
            }
        }
        ++this.field9420;
        --this.field9405;
        this.field9427 = new class638(128);
        if ((this.field9417 & 16) != 0) {
            this.field9402 = new class273(this.field9396, this);
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1363(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field9421;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 != null ? new int[var18 * 3] : null;
        int[] var26 = arg5 == null ? null : new int[var18 * 3];
        int var27 = 0;
        for (int var28 = 0; var28 < var18; ++var28) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var29];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var29];
            }
            ++var27;
            var19[var27] = arg2[var30];
            var20[var27] = arg4[var30];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 != null ? arg10[var28] : arg9[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var30];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var30];
            }
            ++var27;
            var19[var27] = arg2[var31];
            var20[var27] = arg4[var31];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            var22[var27] = arg10 == null ? arg9[var28] : arg10[var28];
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method1371(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public final boolean method1365(class113 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field9397;
        if (this.field9402 != null && arg0 != null) {
            int var7 = -(this.field9396.field3286 * arg2 >> 8) + arg1 >> this.field9396.field3284;
            int var8 = -(this.field9396.field3324 * arg2 >> 8) + arg3 >> this.field9396.field3284;
            return this.field9402.method1777(arg0, 88, var8, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIBLua;)V")
    private final void method3827(int arg0, int arg1, byte arg2, class662 arg3) {
        ++field9386;
        int[] var5 = this.field9415[arg1][arg0];
        int[] var6 = this.field9391[arg1][arg0];
        int var7 = var5.length;
        if (var7 > class275.field3976.length) {
            class275.field3976 = new int[var7];
            class258.field3794 = new int[var7];
        }
        for (int var8 = 0; ~var7 < ~var8; ++var8) {
            class275.field3976[var8] = var5[var8] >> this.field9396.field3284;
            class258.field3794[var8] = var6[var8] >> this.field9396.field3284;
        }
        if (arg2 == 47) {
            int var9 = 0;
            while (var9 < var7) {
                int var10 = class275.field3976[var9];
                int var11 = class258.field3794[var9++];
                int var12 = class275.field3976[var9];
                int var13 = class258.field3794[var9++];
                int var14 = class275.field3976[var9];
                int var15 = class258.field3794[var9++];
                if ((var10 - var12) * (var13 - var15) + -((var14 - var12) * (-var11 + var13)) > 0) {
                    arg3.method3779(var12, var13, var14, var10, var11, var15, 871193392);
                }
            }
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lsca;[I)V")
    public final void method1362(class251 arg0, int[] arg1) {
        this.field9418.method1039(new class161(this.field9396, this, arg0, arg1), 0);
        ++field9392;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(III[[ZZII)V")
    public final void method1373(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6) {
        this.method3829(arg2, arg5, arg3, arg6, arg4, arg0, arg1, -20445);
        ++field9403;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Z)V")
    public static void method3828(boolean arg0) {
        field9411 = null;
        if (arg0) {
            field9423 = null;
            field9419 = null;
        }
    }

    @OriginalMember(owner = "client!aga", name = "fa", descriptor = "(IILr;)Lr;")
    public final class113 method1367(int arg0, int arg1, class113 arg2) {
        ++field9398;
        if (~(this.field9388[arg0][arg1] & 1) == -1) {
            return null;
        } else {
            int var4 = super.field5818 >> this.field9396.field3284;
            class662 var5 = (class662) arg2;
            class662 var6;
            if (var5 != null && var5.method3778(var4, var4, 0)) {
                var6 = var5;
                var5.method3777(16);
            } else {
                var6 = new class662(this.field9396, var4, var4);
            }
            var6.method3783(0, 0, var4, var4, true);
            this.method3827(arg1, arg0, (byte) 47, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!aga", name = "YA", descriptor = "()V")
    public final void method1369() {
        ++field9422;
        if (~this.field9432 < -1) {
            byte[][] var1 = new byte[super.field5827 + 1][super.field5826 + 1];
            for (int var2 = 1; ~var2 > ~super.field5827; ++var2) {
                for (int var107 = 1; super.field5826 > var107; ++var107) {
                    var1[var2][var107] = (byte) ((this.field9428[var2 + -1][var107] >> 2) + (this.field9428[var2][var107 + -1] >> 2) + (this.field9428[var2 + 1][var107] >> 3) + (this.field9428[var2][var107 + 1] >> 3) + (this.field9428[var2][var107] >> 1));
                }
            }
            class478[] var3 = new class478[this.field9427.method3664(0)];
            this.field9427.method3663(var3, false);
            for (int var4 = 0; ~var3.length < ~var4; ++var4) {
                var3[var4].method2845((byte) -104, this.field9432);
            }
            int var5 = 20;
            if (this.field9394 != null) {
                var5 += 4;
            }
            if ((7 & this.field9417) != 0) {
                var5 += 12;
            }
            NativeHeapBuffer var6 = this.field9396.field3140.method2333(this.field9432 * 4, false);
            NativeHeapBuffer var7 = this.field9396.field3140.method2333(this.field9432 * var5, false);
            Stream var8 = new Stream(var7);
            Stream var9 = new Stream(var6);
            class478[] var10 = new class478[this.field9432];
            int var11 = class47.method385(this.field9432 / 4, 24);
            if (var11 < 1) {
                var11 = 1;
            }
            class638 var12 = new class638(var11);
            class478[] var13 = new class478[this.field9430];
            for (int var14 = 0; super.field5827 > var14; ++var14) {
                for (int var34 = 0; ~var34 > ~super.field5826; ++var34) {
                    if (this.field9400[var14][var34] != null) {
                        class478[] var35 = this.field9407[var14][var34];
                        int[] var36 = this.field9415[var14][var34];
                        int[] var37 = this.field9391[var14][var34];
                        int[] var38 = this.field9410[var14][var34];
                        int[] var39 = this.field9400[var14][var34];
                        int[] var40 = this.field9408 != null ? this.field9408[var14][var34] : null;
                        if (var38 == null) {
                            var38 = var39;
                        }
                        int[] var41 = this.field9394 == null ? null : this.field9394[var14][var34];
                        float var42 = this.field9429[var14][var34];
                        float var43 = this.field9425[var14][var34];
                        float var44 = this.field9426[var14][var34];
                        float var45 = this.field9429[var14][var34 + 1];
                        float var46 = this.field9425[var14][var34 + 1];
                        float var47 = this.field9426[var14][var34 + 1];
                        float var48 = this.field9429[var14 - -1][var34 + 1];
                        float var49 = this.field9425[var14 + 1][var34 - -1];
                        float var50 = this.field9426[var14 + 1][var34 + 1];
                        float var51 = this.field9429[var14 + 1][var34];
                        float var52 = this.field9425[var14 + 1][var34];
                        float var53 = this.field9426[var14 + 1][var34];
                        int var54 = var1[var14][var34] & 255;
                        int var55 = 255 & var1[var14][var34 + 1];
                        int var56 = var1[var14 - -1][var34 + 1] & 255;
                        int var57 = 255 & var1[var14 + 1][var34];
                        int var58 = 0;
                        label359: for (int var59 = 0; var39.length > var59; ++var59) {
                            class478 var105 = var35[var59];
                            for (int var106 = 0; var106 < var58; ++var106) {
                                if (var13[var106] == var105) {
                                    continue label359;
                                }
                            }
                            var13[var58++] = var105;
                        }
                        short[] var60 = this.field9401[super.field5827 * var34 + var14] = new short[var39.length];
                        for (int var61 = 0; ~var39.length < ~var61; ++var61) {
                            int var62 = (var14 << super.field5825) + var36[var61];
                            int var63 = (var34 << super.field5825) - -var37[var61];
                            int var64 = var62 >> this.field9409;
                            int var65 = var63 >> this.field9409;
                            int var66 = var39[var61];
                            int var67 = var38[var61];
                            int var68 = var40 != null ? var40[var61] : 0;
                            long var69 = (long) var66 << 32 | (long) var67 << 48 | (long) (var64 << 16) | (long) var65;
                            int var71 = var36[var61];
                            int var72 = var37[var61];
                            byte var73 = 74;
                            int var74 = 0;
                            int var75;
                            float var76;
                            float var77;
                            float var78;
                            if (~var71 == -1 && ~var72 == -1) {
                                var75 = var73 - var54;
                                var76 = var42;
                                var77 = var43;
                                var78 = var44;
                            } else if (~var71 == -1 && ~super.field5818 == ~var72) {
                                var78 = var47;
                                var75 = var73 - var55;
                                var76 = var45;
                                var77 = var46;
                            } else if (super.field5818 == var71 && ~super.field5818 == ~var72) {
                                var75 = var73 - var56;
                                var78 = var50;
                                var76 = var48;
                                var77 = var49;
                            } else if (~super.field5818 == ~var71 && var72 == 0) {
                                var78 = var53;
                                var76 = var51;
                                var77 = var52;
                                var75 = var73 - var57;
                            } else {
                                float var79 = (float) var71 / (float) super.field5818;
                                float var80 = (float) var72 / (float) super.field5818;
                                float var81 = (-var42 + var51) * var79 + var42;
                                float var82 = (var52 - var43) * var79 + var43;
                                float var83 = (var53 - var44) * var79 + var44;
                                float var84 = (-var45 + var48) * var79 + var45;
                                float var85 = (-var46 + var49) * var79 + var46;
                                float var86 = (var50 - var47) * var79 + var47;
                                var77 = (var85 - var82) * var80 + var82;
                                var76 = (var84 - var81) * var80 + var81;
                                var78 = (-var83 + var86) * var80 + var83;
                                int var87 = ((-var54 + var57) * var71 >> super.field5825) + var54;
                                int var88 = ((-var55 + var56) * var71 >> super.field5825) + var55;
                                var75 = var73 - (((-var87 + var88) * var72 >> super.field5825) + var87);
                            }
                            float var89 = 1.0F;
                            if (~var66 != 0) {
                                int var90 = (127 & var66) * var75 >> 7;
                                if (~var90 <= -3) {
                                    if (~var90 < -127) {
                                        var90 = 126;
                                    }
                                } else {
                                    var90 = 2;
                                }
                                var74 = class109.field1323[var90 | var66 & 65408];
                                if (~(this.field9417 & 7) == -1) {
                                    float var91 = this.field9396.field3314[2] * var78 + this.field9396.field3314[0] * var76 + this.field9396.field3314[1] * var77;
                                    var89 = this.field9396.field3359 + var91 * (!(var91 > 0.0F) ? this.field9396.field3309 : this.field9396.field3358);
                                }
                            }
                            class69 var92 = null;
                            if ((var62 & this.field9406 + -1) == 0 && (var63 & this.field9406 + -1) == 0) {
                                var92 = var12.method3669(false, var69);
                            }
                            int var103;
                            if (var92 == null) {
                                int var93;
                                if (~var66 == ~var67) {
                                    var93 = var74;
                                } else {
                                    int var94 = (127 & var67) * var75 >> 7;
                                    if (~var94 > -3) {
                                        var94 = 2;
                                    } else if (~var94 < -127) {
                                        var94 = 126;
                                    }
                                    var93 = class109.field1323[var67 & 65408 | var94];
                                    if (~(this.field9417 & 7) == -1) {
                                        float var95 = this.field9396.field3314[2] * var78 + this.field9396.field3314[1] * var77 + this.field9396.field3314[0] * var76;
                                        float var96 = this.field9396.field3359 + (!(var89 > 0.0F) ? this.field9396.field3309 : this.field9396.field3358) * var89;
                                        int var97 = 255 & var93 >> 16;
                                        int var98 = var93 >> 8 & 255;
                                        int var99 = (int) ((float) var97 * var96);
                                        int var100 = 255 & var93;
                                        if (~var99 > -1) {
                                            var99 = 0;
                                        } else if (~var99 < -256) {
                                            var99 = 255;
                                        }
                                        int var101 = (int) ((float) var98 * var96);
                                        int var102 = (int) ((float) var100 * var96);
                                        if (var101 >= 0) {
                                            if (var101 > 255) {
                                                var101 = 255;
                                            }
                                        } else {
                                            var101 = 0;
                                        }
                                        if (var102 < 0) {
                                            var102 = 0;
                                        } else if (~var102 < -256) {
                                            var102 = 255;
                                        }
                                        var93 = var99 << 16 | var101 << 8 | var102;
                                    }
                                }
                                if (!Stream.method2346()) {
                                    var8.method2350((float) var62);
                                    var8.method2350((float) (var68 + this.method2529(var63, var62, (byte) -128)));
                                    var8.method2350((float) var63);
                                    var8.method2350((float) var62);
                                    var8.method2350((float) var63);
                                    if (this.field9394 != null) {
                                        var8.method2350((float) (var41 != null ? var41[var61] + -1 : 0));
                                    }
                                    if (~(this.field9417 & 7) != -1) {
                                        var8.method2350(var76);
                                        var8.method2350(var77);
                                        var8.method2350(var78);
                                    }
                                } else {
                                    var8.method2340((float) var62);
                                    var8.method2340((float) (var68 + this.method2529(var63, var62, (byte) -128)));
                                    var8.method2340((float) var63);
                                    var8.method2340((float) var62);
                                    var8.method2340((float) var63);
                                    if (this.field9394 != null) {
                                        var8.method2340((float) (var41 != null ? var41[var61] - 1 : 0));
                                    }
                                    if (~(7 & this.field9417) != -1) {
                                        var8.method2340(var76);
                                        var8.method2340(var77);
                                        var8.method2340(var78);
                                    }
                                }
                                if (~this.field9396.field3326 != -1) {
                                    var9.method2348(var93 | -16777216);
                                } else {
                                    var9.method2349(-16777216 | var93);
                                }
                                var103 = this.field9413++;
                                var60[var61] = (short) var103;
                                if (var66 != -1) {
                                    var10[var103] = var35[var61];
                                }
                                var12.method3666((byte) 65, var69, new class463(var60[var61]));
                            } else {
                                var60[var61] = ((class463) var92).field6465;
                                var103 = var60[var61] & 65535;
                                if (~var66 != 0 && ~var10[var103].field762 < ~var35[var61].field762) {
                                    var10[var103] = var35[var61];
                                }
                            }
                            for (int var104 = 0; var58 > var104; ++var104) {
                                var13[var104].method2850(var103, var75, var74, var89, 0);
                            }
                            ++this.field9395;
                        }
                    }
                }
            }
            for (int var15 = 0; this.field9413 > var15; ++var15) {
                class478 var33 = var10[var15];
                if (var33 != null) {
                    var33.method2846(var15, 24103);
                }
            }
            for (int var16 = 0; ~var16 > ~super.field5827; ++var16) {
                for (int var22 = 0; super.field5826 > var22; ++var22) {
                    short[] var23 = this.field9401[super.field5827 * var22 + var16];
                    if (var23 != null) {
                        int var24 = 0;
                        int var25 = 0;
                        while (~var25 > ~var23.length) {
                            int var26 = var23[var25++] & 65535;
                            int var27 = 65535 & var23[var25++];
                            int var28 = var23[var25++] & 65535;
                            class478 var29 = var10[var26];
                            class478 var30 = var10[var27];
                            class478 var31 = var10[var28];
                            class478 var32 = null;
                            if (var29 != null) {
                                var29.method2848(1, var24, var16, var22);
                                var32 = var29;
                            }
                            if (var30 != null) {
                                var30.method2848(1, var24, var16, var22);
                                if (var32 == null || ~var30.field762 > ~var32.field762) {
                                    var32 = var30;
                                }
                            }
                            if (var31 != null) {
                                var31.method2848(1, var24, var16, var22);
                                if (var32 == null || ~var31.field762 > ~var32.field762) {
                                    var32 = var31;
                                }
                            }
                            if (var32 != null) {
                                if (var29 != null) {
                                    var32.method2846(var26, 24103);
                                }
                                if (var30 != null) {
                                    var32.method2846(var27, 24103);
                                }
                                if (var31 != null) {
                                    var32.method2846(var28, 24103);
                                }
                                var32.method2848(1, var24, var16, var22);
                            }
                            ++var24;
                        }
                    }
                }
            }
            var8.method2351();
            var9.method2351();
            this.field9431 = this.field9396.method1421(false, true);
            this.field9431.method2280((byte) 122, 4, var6, this.field9413 * 4);
            this.field9433 = this.field9396.method1421(false, true);
            this.field9433.method2280((byte) 38, var5, var7, this.field9413 * var5);
            if (~(this.field9417 & 7) != -1) {
                if (this.field9394 != null) {
                    this.field9434 = this.field9396.method1406((byte) 6, new class435[] { new class435(new class382[] { class382.field5466, class382.field5477, class382.field5476, class382.field5473 }), new class435(class382.field5475) });
                } else {
                    this.field9434 = this.field9396.method1406((byte) 6, new class435[] { new class435(new class382[] { class382.field5466, class382.field5477, class382.field5473 }), new class435(class382.field5475) });
                }
            } else if (this.field9394 == null) {
                this.field9434 = this.field9396.method1406((byte) 6, new class435[] { new class435(new class382[] { class382.field5466, class382.field5477 }), new class435(class382.field5475) });
            } else {
                this.field9434 = this.field9396.method1406((byte) 6, new class435[] { new class435(new class382[] { class382.field5466, class382.field5477, class382.field5476 }), new class435(class382.field5475) });
            }
            int var17 = 0;
            for (int var18 = 0; ~var18 > ~var3.length; ++var18) {
                if (var3[var18].field6641 > 0) {
                    var3[var17++] = var3[var18];
                }
            }
            this.field9424 = new class478[var17];
            long[] var19 = new long[var17];
            for (int var20 = 0; var20 < var17; ++var20) {
                class478 var21 = var3[var20];
                var19[var20] = var21.field762;
                this.field9424[var20] = var21;
                var21.method2847(false, this.field9413);
            }
            class678.method3857((byte) -58, var19, this.field9424);
            if (this.field9402 != null) {
                this.field9402.method1775(0);
            }
        } else {
            this.field9402 = null;
        }
        this.field9415 = this.field9391 = null;
        this.field9410 = null;
        this.field9429 = this.field9425 = this.field9426 = null;
        this.field9428 = null;
        this.field9407 = null;
        this.field9427 = null;
        this.field9408 = null;
        this.field9394 = null;
        this.field9400 = null;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(II)V")
    public final void method1368(int arg0, int arg1) {
        ++field9412;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(II[[ZIZIII)V")
    private final void method3829(int arg0, int arg1, boolean[][] arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        ++field9393;
        if (this.field9424 != null) {
            int var9 = arg0 + arg0 + 1;
            int var10 = var9 * var9;
            if (~class486.field6717.length > ~var10) {
                class486.field6717 = new int[var10];
            }
            int var11 = -arg0 + arg5;
            int var12 = var11;
            if (~var11 > -1) {
                var11 = 0;
            }
            int var13 = -arg0 + arg6;
            int var14 = var13;
            if (var13 < 0) {
                var13 = 0;
            }
            int var15 = arg0 + arg5;
            if (~(super.field5827 - 1) > ~var15) {
                var15 = super.field5827 - 1;
            }
            int var16 = arg6 - -arg0;
            if (super.field5826 - 1 < var16) {
                var16 = super.field5826 + -1;
            }
            class95.field1103 = 0;
            for (int var17 = var11; var15 >= var17; ++var17) {
                boolean[] var24 = arg2[var17 - var12];
                for (int var25 = var13; ~var16 <= ~var25; ++var25) {
                    if (var24[-var14 + var25]) {
                        class486.field6717[class95.field1103++] = super.field5827 * var25 - -var17;
                    }
                }
            }
            if (~arg1 != 0) {
                this.field9396.method1414(false, (float) arg1);
                this.field9396.method1458(126);
            } else {
                this.field9396.method1388(-81);
            }
            this.field9396.method1498(true);
            this.field9396.method1393(~(this.field9417 & 7) != -1, 0);
            this.field9396.method1467(false, false, -1, (byte) -49);
            this.field9396.method1386((byte) -122, this.field9433, 0);
            for (int var18 = 0; this.field9424.length > var18; ++var18) {
                this.field9424[var18].method2849(class486.field6717, 32767, class95.field1103);
            }
            class517 var19 = this.field9396.method1466(true);
            var19.method50(0, -1, 0);
            this.field9396.method1428(0);
            if (!this.field9418.method1044(21972)) {
                int var20 = this.field9396.field3334;
                int var21 = this.field9396.field3377;
                this.field9396.method255(0, var21, this.field9396.field3328);
                this.field9396.method1393(false, 0);
                this.field9396.method1479(false, 7);
                this.field9396.method1404((byte) -124, 128);
                this.field9396.method1467(false, false, -2, (byte) 110);
                this.field9396.method1492(this.field9396.field3346, 2);
                this.field9396.method1494(class785.field10763, 775, class92.field1073);
                this.field9396.method1409(class41.field423, 0, -106);
                this.field9396.method1455(0, -3, class656.field9260);
                for (class69 var22 = this.field9418.method1041(arg7 ^ -1068765); var22 != null; var22 = this.field9418.method1033(-1)) {
                    class161 var23 = (class161) var22;
                    var23.method1028(arg6, arg0, arg2, arg5, 10517);
                }
                this.field9396.method1409(class157.field2039, 0, -122);
                this.field9396.method1455(0, -3, class157.field2039);
                this.field9396.method1492((class34) null, arg7 ^ -20447);
                this.field9396.method255(var20, var21, this.field9396.field3328);
            }
            if (this.field9402 != null) {
                this.field9396.method1386((byte) -128, this.field9433, 0);
                this.field9396.method1386((byte) -113, this.field9431, 1);
                this.field9396.method1485(this.field9434, 32);
                this.field9402.method1780(arg4, arg2, arg0, arg5, arg6, 110);
            }
        }
        if (arg7 != -20445) {
            this.method1376(55, -80, -106);
        }
    }

    @OriginalMember(owner = "client!aga", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public final void method1370(class113 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field9387;
        if (this.field9402 != null && arg0 != null) {
            int var7 = -(this.field9396.field3286 * arg2 >> 8) + arg1 >> this.field9396.field3284;
            int var8 = -(this.field9396.field3324 * arg2 >> 8) + arg3 >> this.field9396.field3284;
            this.field9402.method1773(var7, var8, arg0, 19252);
        }
    }

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "(I)I")
    public static final int method3830(int arg0) {
        ++field9390;
        if (arg0 >= -68) {
            method3830(-8);
        }
        return class500.field6848;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lae;ZII)Lwia;")
    public static final class305 method3831(class283 arg0, boolean arg1, int arg2, int arg3) {
        ++field9389;
        class511 var4 = new class511(arg0.method1849(arg2, (byte) -108, arg3));
        class305 var5 = new class305(arg2, var4.method2993((byte) -56), var4.method2993((byte) -23), var4.method3008(64), var4.method3008(64), ~var4.method3013(39) == -2, var4.method3013(-105), var4.method3013(75));
        int var6 = var4.method3013(33);
        for (int var7 = 0; ~var7 > ~var6; ++var7) {
            var5.field4424.method1039(new class650(var4.method3013(-109), var4.method3002(-1), var4.method3002(-1), var4.method3002(-1), var4.method3002(-1), var4.method3002(-1), var4.method3002(-1), var4.method3002(-1), var4.method3002(-1)), 0);
        }
        if (arg1) {
            return null;
        } else {
            var5.method1985(26);
            return var5;
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1375(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field9416;
        if (this.field9432 > 0) {
            class614 var9 = this.field9396.method1463(this.field9395, 86);
            int var10 = 0;
            int var11 = 32767;
            int var12 = -32768;
            for (int var13 = 0; var13 < 4; ++var13) {
                var10 = 0;
                Buffer var14 = var9.method1126(true, (byte) 124);
                if (var14 != null) {
                    Stream var15 = this.field9396.method1449(14, var14);
                    if (Stream.method2346()) {
                        for (int var16 = arg4; arg6 > var16; ++var16) {
                            int var17 = super.field5827 * var16 + arg3;
                            for (int var18 = arg3; arg5 > var18; ++var18) {
                                if (arg7[-arg3 + var18][-arg4 + var16]) {
                                    short[] var19 = this.field9401[var17];
                                    if (var19 != null) {
                                        for (int var20 = 0; var19.length > var20; ++var20) {
                                            int var21 = var19[var20] & 65535;
                                            ++var10;
                                            if (var11 > var21) {
                                                var11 = var21;
                                            }
                                            var15.method2339(var21);
                                            if (var21 > var12) {
                                                var12 = var21;
                                            }
                                        }
                                    }
                                }
                                ++var17;
                            }
                        }
                    } else {
                        for (int var22 = arg4; ~arg6 < ~var22; ++var22) {
                            int var25 = super.field5827 * var22 + arg3;
                            for (int var26 = arg3; var26 < arg5; ++var26) {
                                if (arg7[-arg3 + var26][-arg4 + var22]) {
                                    short[] var27 = this.field9401[var25];
                                    if (var27 != null) {
                                        for (int var28 = 0; var27.length > var28; ++var28) {
                                            int var29 = 65535 & var27[var28];
                                            if (var29 > var12) {
                                                var12 = var29;
                                            }
                                            var15.method2343(var29);
                                            if (~var29 > ~var11) {
                                                var11 = var29;
                                            }
                                            ++var10;
                                        }
                                    }
                                }
                                ++var25;
                            }
                        }
                    }
                    var15.method2351();
                    if (var9.method1121(3104)) {
                        break;
                    }
                }
            }
            if (~var10 < -1) {
                this.field9396.method1397(-128);
                this.field9396.method1499(false, 3);
                this.field9396.method1393(false, 0);
                this.field9396.method1480(73, false);
                this.field9396.method1479(false, 7);
                this.field9396.method1404((byte) -116, 0);
                this.field9396.method1467(false, false, -2, (byte) -117);
                this.field9396.method1492((class34) null, 2);
                class517 var23 = this.field9396.method1466(true);
                float[] var24 = this.field9396.method1444(-1);
                var24[10] = 1.0F / (-this.field9405 + this.field9420);
                var24[7] = 0.0F;
                var24[9] = 0.0F;
                var24[11] = 0.0F;
                var24[4] = 0.0F;
                var24[8] = 0.0F;
                var24[14] = -this.field9405 / (-this.field9405 + this.field9420);
                var24[1] = 0.0F;
                var24[6] = 0.0F;
                var24[5] = (float) arg2 / ((float) super.field5818 * 128.0F * (float) this.field9396.field3201);
                var24[3] = 0.0F;
                var24[2] = 0.0F;
                var24[12] = -(((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field9396.field3232) + -1.0F;
                var24[0] = (float) arg2 / ((float) super.field5818 * 128.0F * (float) this.field9396.field3232);
                var24[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field9396.field3201) + 1.0F;
                var24[15] = 1.0F;
                var23.method3079(113, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F);
                this.field9396.method1472(0);
                this.field9396.method1428(0);
                if ((7 & this.field9417) == 0) {
                    this.field9396.method1393(false, 0);
                } else {
                    this.field9396.method1393(true, 0);
                    this.field9396.method1437(12093);
                }
                this.field9396.method1441((byte) -123, false);
                this.field9396.method1386((byte) -125, this.field9433, 0);
                this.field9396.method1386((byte) -111, this.field9431, 1);
                this.field9396.method1485(this.field9434, 32);
                this.field9396.method1430((byte) -115, 0, class625.field8750, var9, var10 / 3, var11, -var11 + 1 + var12);
                this.field9396.method1441((byte) -84, true);
            }
        }
    }

    @OriginalMember(owner = "client!aga", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public final void method1364(class113 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field9414;
        if (this.field9402 != null && arg0 != null) {
            int var7 = -(this.field9396.field3286 * arg2 >> 8) + arg1 >> this.field9396.field3284;
            int var8 = -(this.field9396.field3324 * arg2 >> 8) + arg3 >> this.field9396.field3284;
            this.field9402.method1779(var8, 0, var7, arg0);
        }
    }

    @OriginalMember(owner = "client!aga", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method1371(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field9385;
        class101 var15 = this.field9396.field6556;
        if (arg5 != null && this.field9394 == null) {
            this.field9394 = new int[super.field5827][super.field5826][];
        }
        if (arg3 != null && this.field9408 == null) {
            this.field9408 = new int[super.field5827][super.field5826][];
        }
        this.field9415[arg0][arg1] = arg2;
        this.field9391[arg0][arg1] = arg4;
        this.field9400[arg0][arg1] = arg6;
        this.field9410[arg0][arg1] = arg7;
        if (this.field9394 != null) {
            this.field9394[arg0][arg1] = arg5;
        }
        if (this.field9408 != null) {
            this.field9408[arg0][arg1] = arg3;
        }
        class478[] var16 = this.field9407[arg0][arg1] = new class478[arg6.length];
        for (int var17 = 0; var17 < arg6.length; ++var17) {
            int var18 = arg8[var17];
            int var19 = arg9[var17];
            if (~(32 & this.field9417) != -1 && var18 != -1 && var15.method581(-21732, var18).field10264) {
                var18 = -1;
                var19 = 128;
            }
            long var20 = (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) (var19 << 14) | (long) var18;
            class69 var22;
            for (var22 = this.field9427.method3669(false, var20); var22 != null; var22 = this.field9427.method3673(-97)) {
                class478 var23 = (class478) var22;
                if (~var23.field6632 == ~var18 && (float) var19 == var23.field6627 && var23.field6642 == arg10 && ~var23.field6638 == ~arg11 && var23.field6636 == arg12) {
                    break;
                }
            }
            if (var22 == null) {
                var16[var17] = new class478(this, var18, var19, arg10, arg11, arg12);
                this.field9427.method3666((byte) 65, var20, var16[var17]);
            } else {
                var16[var17] = (class478) var22;
            }
        }
        if (arg13) {
            this.field9388[arg0][arg1] = (byte) class613.method3544(this.field9388[arg0][arg1], 1);
        }
        if (arg6.length > this.field9430) {
            this.field9430 = arg6.length;
        }
        this.field9432 += arg6.length;
    }
}
