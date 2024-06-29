import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class30 extends class140 {

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "Lws;")
    private class333 field357 = new class333();

    @OriginalMember(owner = "client!rk", name = "P", descriptor = "Ljaa;")
    public class576 field386;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "[[I")
    private int[][] field353;

    @OriginalMember(owner = "client!rk", name = "y", descriptor = "I")
    private int field369;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public int field354;

    @OriginalMember(owner = "client!rk", name = "H", descriptor = "[[[I")
    private int[][][] field378;

    @OriginalMember(owner = "client!rk", name = "R", descriptor = "[[S")
    public short[][] field388;

    @OriginalMember(owner = "client!rk", name = "N", descriptor = "[[[I")
    public int[][][] field384;

    @OriginalMember(owner = "client!rk", name = "O", descriptor = "[[[I")
    private int[][][] field385;

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "[[[I")
    public int[][][] field365;

    @OriginalMember(owner = "client!rk", name = "Z", descriptor = "[[F")
    private float[][] field396;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "[[[I")
    public int[][][] field356;

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "[[B")
    private byte[][] field370;

    @OriginalMember(owner = "client!rk", name = "T", descriptor = "[[F")
    private float[][] field390;

    @OriginalMember(owner = "client!rk", name = "v", descriptor = "I")
    private int field366;

    @OriginalMember(owner = "client!rk", name = "L", descriptor = "[[[Lwm;")
    private class529[][][] field382;

    @OriginalMember(owner = "client!rk", name = "bb", descriptor = "[[B")
    private byte[][] field398;

    @OriginalMember(owner = "client!rk", name = "S", descriptor = "[[F")
    private float[][] field389;

    @OriginalMember(owner = "client!rk", name = "W", descriptor = "Lhd;")
    private class694 field393;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "Lk;")
    private class530 field352;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "[I")
    public static int[] field351 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
    private int field355;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    private int field359;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!rk", name = "A", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!rk", name = "B", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!rk", name = "C", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!rk", name = "D", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!rk", name = "E", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!rk", name = "F", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!rk", name = "G", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!rk", name = "I", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!rk", name = "J", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!rk", name = "K", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!rk", name = "Q", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!rk", name = "U", descriptor = "I")
    private int field391;

    @OriginalMember(owner = "client!rk", name = "cb", descriptor = "I")
    private int field399;

    @OriginalMember(owner = "client!rk", name = "X", descriptor = "Lce;")
    public class288 field394;

    @OriginalMember(owner = "client!rk", name = "Y", descriptor = "Lce;")
    private class288 field395;

    @OriginalMember(owner = "client!rk", name = "ab", descriptor = "Lce;")
    public class288 field397;

    @OriginalMember(owner = "client!rk", name = "eb", descriptor = "Lce;")
    public class288 field401;

    @OriginalMember(owner = "client!rk", name = "db", descriptor = "Lad;")
    private class393 field400;

    @OriginalMember(owner = "client!rk", name = "V", descriptor = "[Lwm;")
    private class529[] field392;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "[[I")
    public static int[][] field364;

    @OriginalMember(owner = "client!rk", name = "M", descriptor = "[[[I")
    private int[][][] field383;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)V")
    public final void method186(int arg0, int arg1) {
        ++field360;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lw;IIIIZ)Z")
    public final boolean method187(class279 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field374;
        if (this.field352 != null && arg0 != null) {
            int var7 = -(this.field386.field7673 * arg2 >> 8) + arg1 >> this.field386.field7592;
            int var8 = arg3 - (this.field386.field7710 * arg2 >> 8) >> this.field386.field7592;
            return this.field352.method2864(var7, arg0, var8, -116);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V")
    public static void method188(int arg0) {
        if (arg0 == -22943) {
            field364 = null;
            field351 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field350;
        if (this.field391 > 0) {
            this.field386.method3192(false);
            this.field386.method3154(-4221, false);
            this.field386.method3130(3156, false);
            this.field386.method3168(-19170, false);
            this.field386.method3174(false, -32);
            this.field386.method3146(7261, 0);
            this.field386.method3171(117, -2);
            this.field386.method3194((byte) 75, (class185) null);
            class643.field8729[1] = 0.0F;
            class643.field8729[6] = 0.0F;
            class643.field8729[8] = 0.0F;
            class643.field8729[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field386.field7403) + 1.0F;
            class643.field8729[3] = 0.0F;
            class643.field8729[15] = 1.0F;
            class643.field8729[14] = 0.0F;
            class643.field8729[10] = 0.0F;
            class643.field8729[4] = 0.0F;
            class643.field8729[2] = 0.0F;
            class643.field8729[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field386.field7466;
            class643.field8729[7] = 0.0F;
            class643.field8729[5] = (float) arg2 / ((float) super.field1686 * 128.0F * (float) this.field386.field7403);
            class643.field8729[0] = (float) arg2 / ((float) super.field1686 * 128.0F * (float) this.field386.field7466);
            class643.field8729[11] = 0.0F;
            class643.field8729[9] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class643.field8729, 0);
            class643.field8729[9] = 1.0F;
            class643.field8729[5] = 0.0F;
            class643.field8729[14] = 0.0F;
            class643.field8729[11] = 0.0F;
            class643.field8729[1] = 0.0F;
            class643.field8729[15] = 1.0F;
            class643.field8729[3] = 0.0F;
            class643.field8729[4] = 0.0F;
            class643.field8729[12] = 0.0F;
            class643.field8729[13] = 0.0F;
            class643.field8729[7] = 0.0F;
            class643.field8729[0] = 1.0F;
            class643.field8729[8] = 0.0F;
            class643.field8729[6] = 1.0F;
            class643.field8729[10] = 0.0F;
            class643.field8729[2] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class643.field8729, 0);
            if (~(7 & this.field354) != -1) {
                this.field386.method3130(3156, true);
                this.field386.method3128(true);
            } else {
                this.field386.method3130(3156, false);
            }
            this.field386.method3190(this.field397, 32885, this.field395, this.field401, this.field394);
            if (this.field355 * 2 <= this.field386.field7738.field7318.length) {
                this.field386.field7738.field7313 = 0;
            } else {
                this.field386.field7738 = new class113(this.field355 * 2);
            }
            int var9 = 0;
            class113 var10 = this.field386.field7738;
            if (this.field386.field7643) {
                for (int var11 = arg4; arg6 > var11; ++var11) {
                    int var12 = super.field1685 * var11 + arg3;
                    for (int var13 = arg3; ~var13 > ~arg5; ++var13) {
                        if (arg7[var13 - arg3][-arg4 + var11]) {
                            short[] var14 = this.field388[var12];
                            if (var14 != null) {
                                for (int var15 = 0; ~var14.length < ~var15; ++var15) {
                                    var10.method3080((byte) -74, 65535 & var14[var15]);
                                    ++var9;
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; var16 < arg6; ++var16) {
                    int var18 = super.field1685 * var16 + arg3;
                    for (int var19 = arg3; arg5 > var19; ++var19) {
                        if (arg7[-arg3 + var19][-arg4 + var16]) {
                            short[] var20 = this.field388[var18];
                            if (var20 != null) {
                                for (int var21 = 0; ~var20.length < ~var21; ++var21) {
                                    ++var9;
                                    var10.method3060(-32768, 65535 & var20[var21]);
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (var9 > 0) {
                class512 var17 = new class512(this.field386, 5123, var10.field7318, var10.field7313);
                this.field386.method3129(var17, -98, 0, var9, 4);
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Ljaa;IIII[[I[[II)V")
    public class30(class576 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field386 = arg0;
        this.field353 = arg5;
        this.field369 = super.field1683 + -2;
        this.field354 = arg2;
        this.field378 = new int[arg3][arg4][];
        this.field388 = new short[arg3 * arg4][];
        this.field384 = new int[arg3][arg4][];
        this.field385 = new int[arg3][arg4][];
        this.field365 = new int[arg3][arg4][];
        this.field396 = new float[super.field1685 - -1][super.field1684 + 1];
        this.field356 = new int[arg3][arg4][];
        this.field370 = new byte[arg3][arg4];
        this.field390 = new float[super.field1685 - -1][super.field1684 + 1];
        this.field366 = 1 << this.field369;
        this.field382 = new class529[arg3][arg4][];
        this.field398 = new byte[arg3 + 1][arg4 + 1];
        this.field389 = new float[super.field1685 + 1][super.field1684 + 1];
        for (int var9 = 1; ~var9 > ~super.field1684; ++var9) {
            for (int var10 = 1; super.field1685 > var10; ++var10) {
                int var11 = arg6[var10 - -1][var9] + -arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 + 1] + -arg6[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var11 * var11 - -(arg7 * 4 * arg7) - -(var12 * var12))));
                this.field390[var10][var9] = (float) var11 * var13;
                this.field396[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field389[var10][var9] = (float) var12 * var13;
            }
        }
        this.field393 = new class694(128);
        if (~(16 & this.field354) != -1) {
            this.field352 = new class530(this.field386, this);
        }
    }

    @OriginalMember(owner = "client!rk", name = "FA", descriptor = "(Lw;IIIIZ)V")
    public final void method190(class279 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field368;
        if (this.field352 != null && arg0 != null) {
            int var7 = -(this.field386.field7673 * arg2 >> 8) + arg1 >> this.field386.field7592;
            int var8 = arg3 - (this.field386.field7710 * arg2 >> 8) >> this.field386.field7592;
            this.field352.method2857(var7, var8, arg0, (byte) -91);
        }
    }

    @OriginalMember(owner = "client!rk", name = "ba", descriptor = "()V")
    public final void method191() {
        if (this.field391 > 0) {
            byte[][] var1 = new byte[super.field1685 + 1][super.field1684 + 1];
            for (int var2 = 1; ~var2 > ~super.field1685; ++var2) {
                for (int var103 = 1; var103 < super.field1684; ++var103) {
                    var1[var2][var103] = (byte) ((this.field398[var2 - 1][var103] >> 2) + (this.field398[var2][var103] >> 1) + (this.field398[var2 + 1][var103] >> 3) + (this.field398[var2][var103 + 1] >> 3) + (this.field398[var2][var103 + -1] >> 2));
                }
            }
            this.field392 = new class529[this.field393.method3833(0)];
            this.field393.method3836(this.field392, (byte) 84);
            for (int var3 = 0; ~var3 > ~this.field392.length; ++var3) {
                this.field392[var3].method2852(this.field391, -96);
            }
            int var4 = 24;
            if (this.field383 != null) {
                var4 += 4;
            }
            if ((this.field354 & 7) != 0) {
                var4 += 12;
            }
            NativeHeapBuffer var5 = this.field386.field7591.method3516(this.field391 * var4, false);
            Stream var6 = new Stream(var5);
            class529[] var7 = new class529[this.field391];
            int var8 = class217.method1256((byte) -64, this.field391 / 4);
            if (~var8 > -2) {
                var8 = 1;
            }
            class694 var9 = new class694(var8);
            class529[] var10 = new class529[this.field399];
            for (int var11 = 0; ~var11 > ~super.field1685; ++var11) {
                for (int var30 = 0; super.field1684 > var30; ++var30) {
                    if (this.field356[var11][var30] != null) {
                        class529[] var31 = this.field382[var11][var30];
                        int[] var32 = this.field384[var11][var30];
                        int[] var33 = this.field365[var11][var30];
                        int[] var34 = this.field378[var11][var30];
                        int[] var35 = this.field356[var11][var30];
                        int[] var36 = this.field385 != null ? this.field385[var11][var30] : null;
                        int[] var37 = this.field383 != null ? this.field383[var11][var30] : null;
                        if (var34 == null) {
                            var34 = var35;
                        }
                        float var38 = this.field390[var11][var30];
                        float var39 = this.field396[var11][var30];
                        float var40 = this.field389[var11][var30];
                        float var41 = this.field390[var11][var30 + 1];
                        float var42 = this.field396[var11][var30 + 1];
                        float var43 = this.field389[var11][var30 + 1];
                        float var44 = this.field390[var11 + 1][var30 - -1];
                        float var45 = this.field396[var11 + 1][var30 - -1];
                        float var46 = this.field389[var11 + 1][var30 - -1];
                        float var47 = this.field390[var11 + 1][var30];
                        float var48 = this.field396[var11 + 1][var30];
                        float var49 = this.field389[var11 - -1][var30];
                        int var50 = var1[var11][var30] & 255;
                        int var51 = 255 & var1[var11][var30 + 1];
                        int var52 = var1[var11 + 1][var30 - -1] & 255;
                        int var53 = 255 & var1[var11 + 1][var30];
                        int var54 = 0;
                        label339: for (int var55 = 0; var55 < var35.length; ++var55) {
                            class529 var101 = var31[var55];
                            for (int var102 = 0; ~var102 > ~var54; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label339;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field388[super.field1685 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; ~var57 > ~var35.length; ++var57) {
                            int var58 = (var11 << super.field1683) + var32[var57];
                            int var59 = (var30 << super.field1683) - -var33[var57];
                            int var60 = var58 >> this.field369;
                            int var61 = var59 >> this.field369;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 == null ? 0 : var36[var57];
                            long var65 = (long) (var60 << 16) | (long) var63 << 48 | (long) var62 << 32 | (long) var61;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71 = 1.0F;
                            int var72;
                            float var73;
                            float var74;
                            float var75;
                            if (var67 == 0 && ~var68 == -1) {
                                var72 = var69 - var50;
                                var73 = var40;
                                var74 = var38;
                                var75 = var39;
                            } else if (var67 == 0 && ~super.field1686 == ~var68) {
                                var72 = var69 - var51;
                                var74 = var41;
                                var75 = var42;
                                var73 = var43;
                            } else if (super.field1686 == var67 && super.field1686 == var68) {
                                var72 = var69 - var52;
                                var75 = var45;
                                var73 = var46;
                                var74 = var44;
                            } else if (~super.field1686 == ~var67 && var68 == 0) {
                                var74 = var47;
                                var73 = var49;
                                var72 = var69 - var53;
                                var75 = var48;
                            } else {
                                float var76 = (float) var67 / (float) super.field1686;
                                float var77 = (float) var68 / (float) super.field1686;
                                float var78 = (-var38 + var47) * var76 + var38;
                                float var79 = (-var39 + var48) * var76 + var39;
                                float var80 = (var49 - var40) * var76 + var40;
                                float var81 = (-var41 + var44) * var76 + var41;
                                float var82 = (var45 - var42) * var76 + var42;
                                float var83 = (var46 - var43) * var76 + var43;
                                var74 = (var81 - var78) * var77 + var78;
                                var75 = (var82 - var79) * var77 + var79;
                                var73 = (var83 - var80) * var77 + var80;
                                int var84 = ((var53 - var50) * var67 >> super.field1683) + var50;
                                int var85 = ((-var51 + var52) * var67 >> super.field1683) + var51;
                                var72 = var69 - (((-var84 + var85) * var68 >> super.field1683) + var84);
                            }
                            if (var62 != -1) {
                                int var86 = (var62 & 127) * var72 >> 7;
                                if (var86 >= 2) {
                                    if (var86 > 126) {
                                        var86 = 126;
                                    }
                                } else {
                                    var86 = 2;
                                }
                                var70 = class76.field999[65408 & var62 | var86];
                                if (~(this.field354 & 7) == -1) {
                                    float var87 = this.field386.field7624[2] * var73 + this.field386.field7624[0] * var74 + this.field386.field7624[1] * var75;
                                    var71 = this.field386.field7644 + var87 * (!(var87 > 0.0F) ? this.field386.field7729 : this.field386.field7728);
                                }
                            }
                            class263 var88 = null;
                            if (~(var58 & this.field366 + -1) == -1 && (var59 & this.field366 + -1) == 0) {
                                var88 = var9.method3828(var65, (byte) -91);
                            }
                            int var99;
                            if (var88 == null) {
                                int var89;
                                if (~var62 == ~var63) {
                                    var89 = var70;
                                } else {
                                    int var90 = (127 & var63) * var72 >> 7;
                                    if (var90 >= 2) {
                                        if (~var90 < -127) {
                                            var90 = 126;
                                        }
                                    } else {
                                        var90 = 2;
                                    }
                                    var89 = class76.field999[65408 & var63 | var90];
                                    if ((7 & this.field354) == 0) {
                                        float var91 = this.field386.field7624[2] * var73 + this.field386.field7624[1] * var75 + this.field386.field7624[0] * var74;
                                        float var92 = this.field386.field7644 + var71 * (!(var71 > 0.0F) ? this.field386.field7729 : this.field386.field7728);
                                        int var93 = 255 & var89 >> 16;
                                        int var94 = (65361 & var89) >> 8;
                                        int var95 = (int) ((float) var93 * var92);
                                        int var96 = var89 & 255;
                                        int var97 = (int) ((float) var94 * var92);
                                        if (var95 < 0) {
                                            var95 = 0;
                                        } else if (var95 > 255) {
                                            var95 = 255;
                                        }
                                        int var98 = (int) ((float) var96 * var92);
                                        if (~var97 > -1) {
                                            var97 = 0;
                                        } else if (~var97 < -256) {
                                            var97 = 255;
                                        }
                                        if (~var98 <= -1) {
                                            if (var98 > 255) {
                                                var98 = 255;
                                            }
                                        } else {
                                            var98 = 0;
                                        }
                                        var89 = var97 << 8 | var95 << 16 | var98;
                                    }
                                }
                                if (this.field386.field7643) {
                                    var6.method3517((float) var58);
                                    var6.method3517((float) (this.method194(var58, var59) + var64));
                                    var6.method3517((float) var59);
                                    var6.method3521((byte) (var89 >> 16));
                                    var6.method3521((byte) (var89 >> 8));
                                    var6.method3521((byte) var89);
                                    var6.method3521(-1);
                                    var6.method3517((float) var58);
                                    var6.method3517((float) var59);
                                    if (this.field383 != null) {
                                        var6.method3517((float) (var37 == null ? 0 : var37[var57] + -1));
                                    }
                                    if ((this.field354 & 7) != 0) {
                                        var6.method3517(var74);
                                        var6.method3517(var75);
                                        var6.method3517(var73);
                                    }
                                } else {
                                    var6.method3527((float) var58);
                                    var6.method3527((float) (var64 + this.method194(var58, var59)));
                                    var6.method3527((float) var59);
                                    var6.method3521((byte) (var89 >> 16));
                                    var6.method3521((byte) (var89 >> 8));
                                    var6.method3521((byte) var89);
                                    var6.method3521(-1);
                                    var6.method3527((float) var58);
                                    var6.method3527((float) var59);
                                    if (this.field383 != null) {
                                        var6.method3527((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if (~(this.field354 & 7) != -1) {
                                        var6.method3527(var74);
                                        var6.method3527(var75);
                                        var6.method3527(var73);
                                    }
                                }
                                var99 = this.field359++;
                                var56[var57] = (short) var99;
                                if (~var62 != 0) {
                                    var7[var99] = var31[var57];
                                }
                                var9.method3832(new class517(var56[var57]), var65, 79);
                            } else {
                                var56[var57] = ((class517) var88).field6544;
                                var99 = var56[var57] & 65535;
                                if (var62 != -1 && ~var7[var99].field3321 < ~var31[var57].field3321) {
                                    var7[var99] = var31[var57];
                                }
                            }
                            for (int var100 = 0; var54 > var100; ++var100) {
                                var10[var100].method2856(var70, true, var99, var72, var71);
                            }
                            ++this.field355;
                        }
                    }
                }
            }
            for (int var12 = 0; ~var12 > ~this.field359; ++var12) {
                class529 var29 = var7[var12];
                if (var29 != null) {
                    var29.method2851(0, var12);
                }
            }
            for (int var13 = 0; ~var13 > ~super.field1685; ++var13) {
                for (int var18 = 0; ~super.field1684 < ~var18; ++var18) {
                    short[] var19 = this.field388[super.field1685 * var18 + var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (var21 < var19.length) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = var19[var21++] & 65535;
                            int var24 = var19[var21++] & 65535;
                            class529 var25 = var7[var22];
                            class529 var26 = var7[var23];
                            class529 var27 = var7[var24];
                            class529 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method2855(var20, var18, var13, -12788);
                            }
                            if (var26 != null) {
                                var26.method2855(var20, var18, var13, -12788);
                                if (var28 == null || ~var26.field3321 > ~var28.field3321) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method2855(var20, var18, var13, -12788);
                                if (var28 == null || var28.field3321 > var27.field3321) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method2851(0, var22);
                                }
                                if (var26 != null) {
                                    var28.method2851(0, var23);
                                }
                                if (var27 != null) {
                                    var28.method2851(0, var24);
                                }
                                var28.method2855(var20, var18, var13, -12788);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method3530();
            this.field400 = this.field386.method3145(-4, var4, var6.method3523(), false, var5);
            this.field401 = new class288(this.field400, 5126, 3, 0);
            this.field395 = new class288(this.field400, 5121, 4, 12);
            byte var14;
            if (this.field383 == null) {
                this.field397 = new class288(this.field400, 5126, 2, 16);
                var14 = 24;
            } else {
                var14 = 28;
                this.field397 = new class288(this.field400, 5126, 3, 16);
            }
            if ((this.field354 & 7) != 0) {
                this.field394 = new class288(this.field400, 5126, 3, var14);
            }
            long[] var15 = new long[this.field392.length];
            for (int var16 = 0; ~this.field392.length < ~var16; ++var16) {
                class529 var17 = this.field392[var16];
                var15[var16] = var17.field3321;
                var17.method2853(-5, this.field359);
            }
            class591.method3276(var15, this.field392, (byte) 72);
            if (this.field352 != null) {
                this.field352.method2859(-52);
            }
        } else {
            this.field352 = null;
        }
        ++field362;
        this.field393 = null;
        this.field390 = this.field396 = this.field389 = null;
        this.field385 = null;
        this.field398 = null;
        this.field356 = null;
        this.field384 = this.field365 = null;
        this.field378 = null;
        this.field383 = null;
        this.field382 = null;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIB)I")
    public static final int method192(int arg0, int arg1, int arg2, byte arg3) {
        ++field363;
        if (~arg0 == ~arg1) {
            return arg1;
        } else {
            int var4 = -arg2 + 128;
            int var5 = (127 & arg0) * arg2 + (arg1 & 127) * var4 >> 7;
            int var6 = (896 & arg0) * arg2 + (arg1 & 896) * var4 >> 7;
            int var7 = (arg0 & 64512) * arg2 + (64512 & arg1) * var4 >> 7;
            int var8 = 121 / ((-80 - arg3) / 34);
            return var5 & 127 | 896 & var6 | 64512 & var7;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIZB)I")
    public static final int method193(int arg0, int arg1, boolean arg2, byte arg3) {
        ++field372;
        class36 var4 = class354.method2029(arg0, Integer.MIN_VALUE, arg2);
        if (var4 == null) {
            return -1;
        } else {
            if (arg3 < 63) {
                method204(-96, (byte) 46, (int[]) null, (class576) null, (int[]) null, -7);
            }
            return ~arg1 <= -1 && arg1 < var4.field541.length ? var4.field541[arg1] : -1;
        }
    }

    @OriginalMember(owner = "client!rk", name = "sa", descriptor = "(II)I")
    public final int method194(int arg0, int arg1) {
        ++field358;
        int var3 = arg0 >> super.field1683;
        int var4 = arg1 >> super.field1683;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field1685 + -1 && var4 <= super.field1684 + -1) {
            int var5 = super.field1686 - 1 & arg0;
            int var6 = super.field1686 + -1 & arg1;
            int var7 = (-var5 + super.field1686) * this.field353[var3][var4] + this.field353[var3 + 1][var4] * var5 >> super.field1683;
            int var8 = (-var5 + super.field1686) * this.field353[var3][var4 + 1] - -(this.field353[var3 + 1][var4 + 1] * var5) >> super.field1683;
            return (-var6 + super.field1686) * var7 + var6 * var8 >> super.field1683;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III[[ZZ)V")
    public final void method195(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method200(arg3, arg2, arg0, arg1, true, -1, arg4);
        ++field371;
    }

    @OriginalMember(owner = "client!rk", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method196(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        ++field387;
        if (arg3 != null && this.field385 == null) {
            this.field385 = new int[super.field1685][super.field1684][];
        }
        if (arg5 != null && this.field383 == null) {
            this.field383 = new int[super.field1685][super.field1684][];
        }
        this.field384[arg0][arg1] = arg2;
        this.field365[arg0][arg1] = arg4;
        this.field356[arg0][arg1] = arg6;
        this.field378[arg0][arg1] = arg7;
        if (this.field383 != null) {
            this.field383[arg0][arg1] = arg5;
        }
        if (this.field385 != null) {
            this.field385[arg0][arg1] = arg3;
        }
        class529[] var15 = this.field382[arg0][arg1] = new class529[arg6.length];
        for (int var16 = 0; arg6.length > var16; ++var16) {
            long var17 = (long) arg8[var16] | (long) arg10 << 28 | (long) arg11 << 42 | (long) arg12 << 48 | (long) (arg9[var16] << 14);
            class263 var19;
            for (var19 = this.field393.method3828(var17, (byte) -91); var19 != null; var19 = this.field393.method3829((byte) 54)) {
                class529 var20 = (class529) var19;
                if (arg8[var16] == var20.field6670 && (float) arg9[var16] == var20.field6668 && var20.field6674 == arg10 && ~var20.field6667 == ~arg11 && ~var20.field6675 == ~arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class529(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field393.method3832(var15[var16], var17, 59);
            } else {
                var15[var16] = (class529) var19;
            }
        }
        if (arg13) {
            this.field370[arg0][arg1] = (byte) class364.method2113(this.field370[arg0][arg1], 1);
        }
        if (this.field399 < arg6.length) {
            this.field399 = arg6.length;
        }
        this.field391 += arg6.length;
    }

    @OriginalMember(owner = "client!rk", name = "aa", descriptor = "(Lw;IIIIZ)V")
    public final void method197(class279 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field379;
        if (this.field352 != null && arg0 != null) {
            int var7 = -(this.field386.field7673 * arg2 >> 8) + arg1 >> this.field386.field7592;
            int var8 = arg3 - (this.field386.field7710 * arg2 >> 8) >> this.field386.field7592;
            this.field352.method2862(var8, (byte) 36, var7, arg0);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lbj;[I)V")
    public final void method198(class227 arg0, int[] arg1) {
        ++field381;
        this.field357.method1904(new class697(this.field386, this, arg0, arg1), -9);
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(IILw;)Lw;")
    public final class279 method199(int arg0, int arg1, class279 arg2) {
        ++field361;
        if (~(this.field370[arg0][arg1] & 1) == -1) {
            return null;
        } else {
            int var4 = super.field1686 >> this.field386.field7592;
            class266 var5 = (class266) arg2;
            class266 var6;
            if (var5 != null && var5.method1583(var4, var4, 866628848)) {
                var6 = var5;
                var5.method1581((byte) 39);
            } else {
                var6 = new class266(this.field386, var4, var4);
            }
            var6.method1580(var4, 0, var4, 0, (byte) 122);
            this.method205(arg1, arg0, -25472, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "([[ZIIIZIZ)V")
    private final void method200(boolean[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        if (!arg4) {
            this.field390 = null;
        }
        if (this.field392 != null) {
            int var8 = arg1 + arg1 - -1;
            int var9 = var8 * var8;
            if (this.field386.field7746.length < var9) {
                this.field386.field7746 = new int[var9];
            }
            if (this.field386.field7738.field7318.length < this.field355 * 2) {
                this.field386.field7738 = new class113(this.field355 * 2);
            }
            int var10 = arg2 - arg1;
            int var11 = var10;
            if (var10 < 0) {
                var10 = 0;
            }
            int var12 = -arg1 + arg3;
            int var13 = var12;
            if (var12 < 0) {
                var12 = 0;
            }
            int var14 = arg1 + arg2;
            if (~var14 < ~(super.field1685 + -1)) {
                var14 = super.field1685 + -1;
            }
            int var15 = arg1 + arg3;
            if (~var15 < ~(super.field1684 + -1)) {
                var15 = super.field1684 + -1;
            }
            int var16 = 0;
            int[] var17 = this.field386.field7746;
            for (int var18 = var10; ~var14 <= ~var18; ++var18) {
                boolean[] var24 = arg0[-var11 + var18];
                for (int var25 = var12; var25 <= var15; ++var25) {
                    if (var24[-var13 + var25]) {
                        var17[var16++] = super.field1685 * var25 - -var18;
                    }
                }
            }
            if (arg5 != -1) {
                this.field386.method3159(-4189, (float) arg5);
                this.field386.method3117((byte) 27);
            } else {
                this.field386.method3122(122);
            }
            this.field386.method3130(3156, (this.field354 & 7) != 0);
            for (int var19 = 0; this.field392.length > var19; ++var19) {
                this.field392[var19].method2854(Integer.MAX_VALUE, var17, var16);
            }
            if (!this.field357.method1908((byte) -125)) {
                int var20 = this.field386.field7664;
                int var21 = this.field386.field7701;
                this.field386.method418(0, var21, this.field386.field7697);
                this.field386.method3130(3156, false);
                this.field386.method3174(false, -32);
                this.field386.method3146(7261, 128);
                this.field386.method3171(123, -2);
                this.field386.method3194((byte) 75, this.field386.field7648);
                this.field386.method3185(8448, 7681, (byte) -125);
                this.field386.method3175(34166, 1, 0, 770);
                this.field386.method3127(0, 770, 34167, 17111);
                for (class263 var22 = this.field357.method1909(arg4); var22 != null; var22 = this.field357.method1916((byte) 95)) {
                    class697 var23 = (class697) var22;
                    var23.method3857(arg3, arg0, arg2, (byte) 110, arg1);
                }
                this.field386.method3175(5890, 1, 0, 768);
                this.field386.method3127(0, 770, 5890, 17111);
                this.field386.method3194((byte) 75, (class185) null);
                this.field386.method418(var20, var21, this.field386.field7697);
            }
            if (this.field352 != null) {
                this.field386.method3190(this.field397, 32885, (class288) null, this.field401, (class288) null);
                this.field352.method2861(arg6, arg3, arg0, arg1, 1, arg2);
            }
        }
        ++field380;
    }

    @OriginalMember(owner = "client!rk", name = "JA", descriptor = "(II)I")
    public final int method201(int arg0, int arg1) {
        ++field376;
        return this.field353[arg0][arg1];
    }

    @OriginalMember(owner = "client!rk", name = "EA", descriptor = "(III)V")
    public final void method202(int arg0, int arg1, int arg2) {
        ++field377;
        if (~arg2 < ~(255 & this.field398[arg0][arg1])) {
            this.field398[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method203(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field373;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 != null ? new int[var18 * 3] : null;
        int[] var26 = arg5 != null ? new int[var18 * 3] : null;
        int var27 = 0;
        for (int var28 = 0; var18 > var28; ++var28) {
            int var29 = arg6[var28];
            int var30 = arg7[var28];
            int var31 = arg8[var28];
            var19[var27] = arg2[var29];
            var20[var27] = arg4[var29];
            var21[var27] = arg9[var28];
            var23[var27] = arg11[var28];
            var24[var27] = arg12[var28];
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
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
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
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
            if (arg10 != null) {
                var22[var27] = arg10[var28];
            }
            if (arg3 != null) {
                var25[var27] = arg3[var31];
            }
            if (arg5 != null) {
                var26[var27] = arg5[var31];
            }
            ++var27;
        }
        this.method196(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB[ILjaa;[II)Lup;")
    public static final class257 method204(int arg0, byte arg1, int[] arg2, class576 arg3, int[] arg4, int arg5) {
        ++field375;
        byte[] var6 = new byte[arg0 * arg5];
        int var7 = 0;
        if (arg1 != 22) {
            return null;
        } else {
            while (~var7 > ~arg0) {
                int var8 = arg5 * var7 - -arg4[var7];
                for (int var9 = 0; arg2[var7] > var9; ++var9) {
                    var6[var8++] = -1;
                }
                ++var7;
            }
            return new class257(arg3, arg5, arg0, var6);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIILuu;)V")
    private final void method205(int arg0, int arg1, int arg2, class266 arg3) {
        ++field367;
        int[] var5 = this.field384[arg1][arg0];
        int[] var6 = this.field365[arg1][arg0];
        int var7 = var5.length;
        if (arg2 == -25472) {
            if (~var7 < ~this.field386.field7741.length) {
                this.field386.field7741 = new int[var7];
                this.field386.field7745 = new int[var7];
            }
            int[] var8 = this.field386.field7741;
            int[] var9 = this.field386.field7745;
            for (int var10 = 0; var10 < var7; ++var10) {
                var8[var10] = var5[var10] >> this.field386.field7592;
                var9[var10] = var6[var10] >> this.field386.field7592;
            }
            int var11 = 0;
            while (~var11 > ~var7) {
                int var12 = var8[var11];
                int var13 = var9[var11++];
                int var14 = var8[var11];
                int var15 = var9[var11++];
                int var16 = var8[var11];
                int var17 = var9[var11++];
                if (~((-var14 + var12) * (-var17 + var15) + -((var16 - var14) * (-var13 + var15))) < -1) {
                    arg3.method1582(943665136, var15, var16, var14, var12, var13, var17);
                }
            }
        }
    }
}
