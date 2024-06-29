import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class26 extends class38 {

    @OriginalMember(owner = "client!wv", name = "u", descriptor = "Lmf;")
    private class291 field398 = new class291();

    @OriginalMember(owner = "client!wv", name = "P", descriptor = "[[I")
    private int[][] field419;

    @OriginalMember(owner = "client!wv", name = "G", descriptor = "Lda;")
    public class44 field410;

    @OriginalMember(owner = "client!wv", name = "j", descriptor = "I")
    private int field387;

    @OriginalMember(owner = "client!wv", name = "r", descriptor = "[[S")
    public short[][] field395;

    @OriginalMember(owner = "client!wv", name = "O", descriptor = "[[[I")
    public int[][][] field418;

    @OriginalMember(owner = "client!wv", name = "H", descriptor = "[[B")
    private byte[][] field411;

    @OriginalMember(owner = "client!wv", name = "n", descriptor = "[[[Lhv;")
    private class363[][][] field391;

    @OriginalMember(owner = "client!wv", name = "Z", descriptor = "[[F")
    private float[][] field429;

    @OriginalMember(owner = "client!wv", name = "Q", descriptor = "[[[I")
    private int[][][] field420;

    @OriginalMember(owner = "client!wv", name = "N", descriptor = "[[[I")
    private int[][][] field417;

    @OriginalMember(owner = "client!wv", name = "s", descriptor = "I")
    public int field396;

    @OriginalMember(owner = "client!wv", name = "v", descriptor = "I")
    private int field399;

    @OriginalMember(owner = "client!wv", name = "bb", descriptor = "[[F")
    private float[][] field431;

    @OriginalMember(owner = "client!wv", name = "db", descriptor = "[[F")
    private float[][] field433;

    @OriginalMember(owner = "client!wv", name = "W", descriptor = "[[B")
    private byte[][] field426;

    @OriginalMember(owner = "client!wv", name = "F", descriptor = "[[[I")
    public int[][][] field409;

    @OriginalMember(owner = "client!wv", name = "k", descriptor = "[[[I")
    private int[][][] field388;

    @OriginalMember(owner = "client!wv", name = "U", descriptor = "Lmn;")
    private class249 field424;

    @OriginalMember(owner = "client!wv", name = "m", descriptor = "Ldr;")
    private class509 field390;

    @OriginalMember(owner = "client!wv", name = "l", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!wv", name = "o", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!wv", name = "p", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!wv", name = "q", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!wv", name = "t", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!wv", name = "w", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!wv", name = "x", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!wv", name = "y", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!wv", name = "z", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!wv", name = "A", descriptor = "I")
    private int field404;

    @OriginalMember(owner = "client!wv", name = "B", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!wv", name = "C", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!wv", name = "D", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!wv", name = "E", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!wv", name = "I", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!wv", name = "K", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!wv", name = "L", descriptor = "I")
    private int field415;

    @OriginalMember(owner = "client!wv", name = "M", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!wv", name = "R", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!wv", name = "T", descriptor = "I")
    private int field423;

    @OriginalMember(owner = "client!wv", name = "V", descriptor = "I")
    private int field425;

    @OriginalMember(owner = "client!wv", name = "X", descriptor = "Lgg;")
    private class118 field427;

    @OriginalMember(owner = "client!wv", name = "S", descriptor = "Ler;")
    public class70 field422;

    @OriginalMember(owner = "client!wv", name = "Y", descriptor = "Ler;")
    public class70 field428;

    @OriginalMember(owner = "client!wv", name = "ab", descriptor = "Ler;")
    private class70 field430;

    @OriginalMember(owner = "client!wv", name = "eb", descriptor = "Ler;")
    public class70 field434;

    @OriginalMember(owner = "client!wv", name = "cb", descriptor = "[Lhv;")
    private class363[] field432;

    @OriginalMember(owner = "client!wv", name = "J", descriptor = "[[[I")
    private int[][][] field413;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(III[[ZZ)V")
    public final void method176(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        this.method183(arg1, arg0, -1, arg4, 8825, arg2, arg3);
        ++field416;
    }

    @OriginalMember(owner = "client!wv", name = "ua", descriptor = "(II)I")
    public final int method177(int arg0, int arg1) {
        ++field403;
        return this.field419[arg0][arg1];
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lbk;[I)V")
    public final void method178(class256 arg0, int[] arg1) {
        ++field414;
        this.field398.method1885(false, new class262(this.field410, this, arg0, arg1));
    }

    @OriginalMember(owner = "client!wv", name = "qa", descriptor = "(III)V")
    public final void method179(int arg0, int arg1, int arg2) {
        ++field421;
        if (~(this.field426[arg0][arg1] & 255) > ~arg2) {
            this.field426[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!wv", name = "H", descriptor = "(Li;IIIIZ)V")
    public final void method180(class31 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field401;
        if (this.field390 != null && arg0 != null) {
            int var7 = -(this.field410.field881 * arg2 >> 8) + arg1 >> this.field410.field807;
            int var8 = arg3 - (this.field410.field900 * arg2 >> 8) >> this.field410.field807;
            this.field390.method3051(arg0, var8, -27641, var7);
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IILtj;Z)V")
    private final void method181(int arg0, int arg1, class134 arg2, boolean arg3) {
        ++field389;
        int[] var5 = this.field409[arg0][arg1];
        int[] var6 = this.field418[arg0][arg1];
        if (arg3) {
            this.method190(-85, 99);
        }
        int var7 = var5.length;
        if (this.field410.field947.length < var7) {
            this.field410.field947 = new int[var7];
            this.field410.field951 = new int[var7];
        }
        int[] var8 = this.field410.field947;
        int[] var9 = this.field410.field951;
        for (int var10 = 0; var7 > var10; ++var10) {
            var8[var10] = class490.method2960(255, var5[var10]) >> this.field410.field807;
            var9[var10] = class490.method2960(255, var6[var10]) >> this.field410.field807;
        }
        int var11 = 0;
        while (~var11 > ~var7) {
            int var12 = var8[var11];
            int var13 = var9[var11++];
            int var14 = var8[var11];
            int var15 = var9[var11++];
            int var16 = var8[var11];
            int var17 = var9[var11++];
            if ((-var14 + var12) * (-var17 + var15) + -((-var13 + var15) * (-var14 + var16)) > 0) {
                arg2.method1022(var13, (byte) 11, var15, var14, var16, var12, var17);
            }
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Li;IIIIZ)Z")
    public final boolean method182(class31 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field406;
        if (this.field390 != null && arg0 != null) {
            int var7 = -(this.field410.field881 * arg2 >> 8) + arg1 >> this.field410.field807;
            int var8 = -(this.field410.field900 * arg2 >> 8) + arg3 >> this.field410.field807;
            return this.field390.method3050(var7, var8, arg0, (byte) -99);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIZII[[Z)V")
    private final void method183(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, boolean[][] arg6) {
        if (arg4 != 8825) {
            this.field399 = 114;
        }
        ++field408;
        if (this.field432 != null) {
            float var8 = this.field410.field899;
            float var9 = this.field410.field941;
            int var10 = arg5 + 1 + arg5;
            int var11 = var10 * var10;
            if (this.field410.field946.length < var11) {
                this.field410.field946 = new int[var11];
            }
            if (~this.field410.field934.field4408.length > ~(this.field415 * 2)) {
                this.field410.field934 = new class364(this.field415 * 2);
            }
            int var12 = arg1 - arg5;
            int var13 = var12;
            if (~var12 > -1) {
                var12 = 0;
            }
            int var14 = arg0 - arg5;
            int var15 = var14;
            if (~var14 > -1) {
                var14 = 0;
            }
            int var16 = arg1 + arg5;
            if (var16 > super.field551 + -1) {
                var16 = super.field551 - 1;
            }
            int var17 = arg0 + arg5;
            if (~var17 < ~(super.field554 + -1)) {
                var17 = super.field554 - 1;
            }
            int var18 = 0;
            int[] var19 = this.field410.field946;
            for (int var20 = var12; var20 <= var16; ++var20) {
                boolean[] var26 = arg6[var20 - var13];
                for (int var27 = var14; ~var27 >= ~var17; ++var27) {
                    if (var26[-var15 + var27]) {
                        var19[var18++] = super.field551 * var27 - -var20;
                    }
                }
            }
            if (~arg2 != 0) {
                this.field410.method378((float) arg2, arg4 ^ 21932);
                this.field410.method443((byte) 112);
            } else {
                this.field410.method304((byte) 124);
            }
            this.field410.method386((this.field396 & 7) != 0, -8);
            for (int var21 = 0; var21 < this.field432.length; ++var21) {
                this.field432[var21].method2230(var19, var18, 5888);
            }
            if (!this.field398.method1889((byte) -120)) {
                int var22 = this.field410.field874;
                int var23 = this.field410.field877;
                this.field410.method448(0, var23, this.field410.field841);
                this.field410.method385(var9, var8 - 4.0F);
                this.field410.method386(false, -8);
                this.field410.method447((byte) 46, false);
                this.field410.method340((byte) 108, 128);
                this.field410.method430(-2, (byte) -63);
                this.field410.method381((byte) 28, this.field410.field923);
                this.field410.method426(8448, 7681, -24610);
                this.field410.method412(0, 34166, 770, -32);
                this.field410.method325(34167, 5126, 770, 0);
                for (class261 var24 = this.field398.method1892(104); var24 != null; var24 = this.field398.method1893((byte) -2)) {
                    class262 var25 = (class262) var24;
                    var25.method1678(arg0, arg1, arg5, arg6, true);
                }
                this.field410.method412(0, 5890, 768, 90);
                this.field410.method325(5890, 5126, 770, 0);
                this.field410.method381((byte) 28, (class381) null);
                this.field410.method448(var22, var23, this.field410.field841);
            }
            if (this.field390 != null) {
                this.field410.method385(var9, var8 + -8.0F);
                this.field410.method304((byte) 124);
                this.field410.method352(-123, this.field434, this.field422, (class70) null, (class70) null);
                this.field390.method3046(arg1, arg3, arg6, (byte) 27, arg5, arg0);
            }
            this.field410.method385(var9, var8);
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        ++field400;
        if (this.field425 > 0) {
            this.field410.method437(-120);
            this.field410.method322(false, (byte) 127);
            this.field410.method386(false, -8);
            this.field410.method379(-28710, false);
            this.field410.method447((byte) 46, false);
            this.field410.method340((byte) -63, 0);
            this.field410.method430(-2, (byte) -88);
            this.field410.method381((byte) 28, (class381) null);
            class507.field7389[4] = 0.0F;
            class507.field7389[0] = (float) arg2 / ((float) super.field552 * 128.0F * (float) this.field410.field790);
            class507.field7389[2] = 0.0F;
            class507.field7389[10] = 0.0F;
            class507.field7389[6] = 0.0F;
            class507.field7389[15] = 1.0F;
            class507.field7389[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F + (float) (-(arg0 * 2))) / (float) this.field410.field790;
            class507.field7389[3] = 0.0F;
            class507.field7389[11] = 0.0F;
            class507.field7389[9] = 0.0F;
            class507.field7389[7] = 0.0F;
            class507.field7389[1] = 0.0F;
            class507.field7389[5] = (float) arg2 / ((float) super.field552 * 128.0F * (float) this.field410.field725);
            class507.field7389[13] = -(((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field410.field725) + 1.0F;
            class507.field7389[14] = 0.0F;
            class507.field7389[8] = 0.0F;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(class507.field7389, 0);
            class507.field7389[8] = 0.0F;
            class507.field7389[9] = 1.0F;
            class507.field7389[13] = 0.0F;
            class507.field7389[2] = 0.0F;
            class507.field7389[1] = 0.0F;
            class507.field7389[7] = 0.0F;
            class507.field7389[11] = 0.0F;
            class507.field7389[14] = 0.0F;
            class507.field7389[12] = 0.0F;
            class507.field7389[0] = 1.0F;
            class507.field7389[6] = 1.0F;
            class507.field7389[4] = 0.0F;
            class507.field7389[15] = 1.0F;
            class507.field7389[3] = 0.0F;
            class507.field7389[10] = 0.0F;
            class507.field7389[5] = 0.0F;
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadMatrixf(class507.field7389, 0);
            if (~(7 & this.field396) != -1) {
                this.field410.method386(true, -8);
                this.field410.method442(true);
            } else {
                this.field410.method386(false, -8);
            }
            this.field410.method352(-123, this.field434, this.field422, this.field428, this.field430);
            if (~this.field410.field934.field4408.length > ~(this.field415 * 2)) {
                this.field410.field934 = new class364(this.field415 * 2);
            } else {
                this.field410.field934.field4399 = 0;
            }
            int var9 = 0;
            class364 var10 = this.field410.field934;
            if (!this.field410.field924) {
                for (int var11 = arg4; ~arg6 < ~var11; ++var11) {
                    int var12 = super.field551 * var11 - -arg3;
                    for (int var13 = arg3; var13 < arg5; ++var13) {
                        if (arg7[var13 - arg3][var11 - arg4]) {
                            short[] var14 = this.field395[var12];
                            if (var14 != null) {
                                for (int var15 = 0; var15 < var14.length; ++var15) {
                                    ++var9;
                                    var10.method1852(91, 65535 & var14[var15]);
                                }
                            }
                        }
                        ++var12;
                    }
                }
            } else {
                for (int var16 = arg4; arg6 > var16; ++var16) {
                    int var18 = super.field551 * var16 - -arg3;
                    for (int var19 = arg3; arg5 > var19; ++var19) {
                        if (arg7[var19 - arg3][-arg4 + var16]) {
                            short[] var20 = this.field395[var18];
                            if (var20 != null) {
                                for (int var21 = 0; var21 < var20.length; ++var21) {
                                    var10.method1865(65535 & var20[var21], 812856296);
                                    ++var9;
                                }
                            }
                        }
                        ++var18;
                    }
                }
            }
            if (~var9 < -1) {
                class338 var17 = new class338(this.field410, 5123, var10.field4408, var10.field4399);
                this.field410.method370(var9, 4, -119, 0, var17);
            }
        }
    }

    @OriginalMember(owner = "client!wv", name = "ba", descriptor = "(Li;IIIIZ)V")
    public final void method185(class31 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field397;
        if (this.field390 != null && arg0 != null) {
            int var7 = -(this.field410.field881 * arg2 >> 8) + arg1 >> this.field410.field807;
            int var8 = arg3 - (this.field410.field900 * arg2 >> 8) >> this.field410.field807;
            this.field390.method3054(-26970, arg0, var7, var8);
        }
    }

    @OriginalMember(owner = "client!wv", name = "ca", descriptor = "(II)I")
    public final int method186(int arg0, int arg1) {
        ++field412;
        int var3 = arg0 >> super.field558;
        int var4 = arg1 >> super.field558;
        if (~var3 <= -1 && ~var4 <= -1 && var3 <= super.field551 + -1 && ~(super.field554 + -1) <= ~var4) {
            int var5 = arg0 & super.field552 + -1;
            int var6 = arg1 & super.field552 + -1;
            int var7 = (-var5 + super.field552) * this.field419[var3][var4] + this.field419[var3 + 1][var4] * var5 >> super.field558;
            int var8 = (-var5 + super.field552) * this.field419[var3][var4 + 1] + this.field419[var3 - -1][var4 + 1] * var5 >> super.field558;
            return (-var6 + super.field552) * var7 + var6 * var8 >> super.field558;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!wv", name = "aa", descriptor = "()V")
    public final void method187() {
        if (~this.field425 >= -1) {
            this.field390 = null;
        } else {
            byte[][] var1 = new byte[super.field551 + 1][super.field554 + 1];
            for (int var2 = 1; ~super.field551 < ~var2; ++var2) {
                for (int var103 = 1; var103 < super.field554; ++var103) {
                    var1[var2][var103] = (byte) ((this.field426[var2][var103 + 1] >> 3) + (this.field426[var2 + 1][var103] >> 3) + (this.field426[var2 + -1][var103] >> 2) + (this.field426[var2][var103 + -1] >> 2) + (this.field426[var2][var103] >> 1));
                }
            }
            this.field432 = new class363[this.field424.method1611((byte) -21)];
            this.field424.method1616(-32437, this.field432);
            for (int var3 = 0; ~var3 > ~this.field432.length; ++var3) {
                this.field432[var3].method2227(-96, this.field425);
            }
            int var4 = 24;
            if (this.field413 != null) {
                var4 += 4;
            }
            if ((7 & this.field396) != 0) {
                var4 += 12;
            }
            NativeBuffer var5 = this.field410.field809.method2653(this.field425 * var4);
            NativeStream var6 = new NativeStream(var5);
            class363[] var7 = new class363[this.field425];
            int var8 = class5.method34((byte) 107, this.field425 / 4);
            if (~var8 > -2) {
                var8 = 1;
            }
            class249 var9 = new class249(var8);
            class363[] var10 = new class363[this.field423];
            for (int var11 = 0; ~super.field551 < ~var11; ++var11) {
                for (int var30 = 0; ~super.field554 < ~var30; ++var30) {
                    if (this.field388[var11][var30] != null) {
                        class363[] var31 = this.field391[var11][var30];
                        int[] var32 = this.field409[var11][var30];
                        int[] var33 = this.field418[var11][var30];
                        int[] var34 = this.field417[var11][var30];
                        int[] var35 = this.field388[var11][var30];
                        int[] var36 = this.field420 != null ? this.field420[var11][var30] : null;
                        int[] var37 = this.field413 != null ? this.field413[var11][var30] : null;
                        if (var34 == null) {
                            var34 = var35;
                        }
                        float var38 = this.field433[var11][var30];
                        float var39 = this.field431[var11][var30];
                        float var40 = this.field429[var11][var30];
                        float var41 = this.field433[var11][var30 + 1];
                        float var42 = this.field431[var11][var30 + 1];
                        float var43 = this.field429[var11][var30 + 1];
                        float var44 = this.field433[var11 - -1][var30 + 1];
                        float var45 = this.field431[var11 + 1][var30 + 1];
                        float var46 = this.field429[var11 + 1][var30 + 1];
                        float var47 = this.field433[var11 + 1][var30];
                        float var48 = this.field431[var11 + 1][var30];
                        float var49 = this.field429[var11 - -1][var30];
                        int var50 = 255 & var1[var11][var30];
                        int var51 = 255 & var1[var11][var30 + 1];
                        int var52 = var1[var11 + 1][var30 + 1] & 255;
                        int var53 = var1[var11 - -1][var30] & 255;
                        int var54 = 0;
                        label341: for (int var55 = 0; var35.length > var55; ++var55) {
                            class363 var101 = var31[var55];
                            for (int var102 = 0; ~var54 < ~var102; ++var102) {
                                if (var10[var102] == var101) {
                                    continue label341;
                                }
                            }
                            var10[var54++] = var101;
                        }
                        short[] var56 = this.field395[super.field551 * var30 + var11] = new short[var35.length];
                        for (int var57 = 0; var35.length > var57; ++var57) {
                            int var58 = (var11 << super.field558) + var32[var57];
                            int var59 = (var30 << super.field558) + var33[var57];
                            int var60 = var58 >> this.field387;
                            int var61 = var59 >> this.field387;
                            int var62 = var35[var57];
                            int var63 = var34[var57];
                            int var64 = var36 == null ? 0 : var36[var57];
                            long var65 = (long) var61 | (long) (var60 << 16) | (long) var63 << 48 | (long) var62 << 32;
                            int var67 = var32[var57];
                            int var68 = var33[var57];
                            byte var69 = 74;
                            int var70 = 0;
                            float var71 = 1.0F;
                            float var72;
                            float var73;
                            float var74;
                            int var75;
                            if (var67 == 0 && var68 == 0) {
                                var72 = var40;
                                var73 = var38;
                                var74 = var39;
                                var75 = var69 - var50;
                            } else if (~var67 == -1 && super.field552 == var68) {
                                var73 = var41;
                                var74 = var42;
                                var72 = var43;
                                var75 = var69 - var51;
                            } else if (~super.field552 == ~var67 && ~super.field552 == ~var68) {
                                var73 = var44;
                                var72 = var46;
                                var75 = var69 - var52;
                                var74 = var45;
                            } else if (~super.field552 == ~var67 && var68 == 0) {
                                var74 = var48;
                                var72 = var49;
                                var75 = var69 - var53;
                                var73 = var47;
                            } else {
                                float var76 = (float) var67 / (float) super.field552;
                                float var77 = (float) var68 / (float) super.field552;
                                float var78 = (var47 - var38) * var76 + var38;
                                float var79 = (-var39 + var48) * var76 + var39;
                                float var80 = (-var40 + var49) * var76 + var40;
                                float var81 = (var44 - var41) * var76 + var41;
                                float var82 = (var45 - var42) * var76 + var42;
                                float var83 = (var46 - var43) * var76 + var43;
                                var74 = (var82 - var79) * var77 + var79;
                                var73 = (var81 - var78) * var77 + var78;
                                var72 = (var83 - var80) * var77 + var80;
                                int var84 = ((-var50 + var53) * var67 >> super.field558) + var50;
                                int var85 = ((var52 - var51) * var67 >> super.field558) + var51;
                                var75 = var69 - (((-var84 + var85) * var68 >> super.field558) + var84);
                            }
                            if (var62 != -1) {
                                int var86 = (127 & var62) * var75 >> 7;
                                if (var86 >= 2) {
                                    if (~var86 < -127) {
                                        var86 = 126;
                                    }
                                } else {
                                    var86 = 2;
                                }
                                if (~(this.field396 & 7) == -1) {
                                    float var87 = this.field410.field863[2] * var72 + this.field410.field863[1] * var74 + this.field410.field863[0] * var73;
                                    var71 = var87 * (var87 > 0.0F ? this.field410.field938 : this.field410.field905) + this.field410.field937;
                                }
                                var70 = class97.field1892[65408 & var62 | var86];
                            }
                            class261 var88 = null;
                            if (~(var58 & this.field399 + -1) == -1 && ~(var59 & this.field399 - 1) == -1) {
                                var88 = var9.method1622(var65, -103);
                            }
                            int var89;
                            if (var88 != null) {
                                var56[var57] = ((class490) var88).field7188;
                                var89 = var56[var57] & 65535;
                                if (var62 != -1 && var31[var57].field3977 < var7[var89].field3977) {
                                    var7[var89] = var31[var57];
                                }
                            } else {
                                int var90;
                                if (var62 == var63) {
                                    var90 = var70;
                                } else {
                                    int var91 = (127 & var63) * var75 >> 7;
                                    if (var91 >= 2) {
                                        if (var91 > 126) {
                                            var91 = 126;
                                        }
                                    } else {
                                        var91 = 2;
                                    }
                                    var90 = class97.field1892[var63 & 65408 | var91];
                                    if ((this.field396 & 7) == 0) {
                                        float var92 = this.field410.field863[2] * var72 + this.field410.field863[1] * var74 + this.field410.field863[0] * var73;
                                        float var93 = (!(var71 > 0.0F) ? this.field410.field905 : this.field410.field938) * var71 + this.field410.field937;
                                        int var94 = 255 & var90 >> 16;
                                        int var95 = (var90 & 65526) >> 8;
                                        int var96 = (int) ((float) var94 * var93);
                                        int var97 = 255 & var90;
                                        if (~var96 > -1) {
                                            var96 = 0;
                                        } else if (var96 > 255) {
                                            var96 = 255;
                                        }
                                        int var98 = (int) ((float) var95 * var93);
                                        if (var98 < 0) {
                                            var98 = 0;
                                        } else if (~var98 < -256) {
                                            var98 = 255;
                                        }
                                        int var99 = (int) ((float) var97 * var93);
                                        if (var99 >= 0) {
                                            if (~var99 < -256) {
                                                var99 = 255;
                                            }
                                        } else {
                                            var99 = 0;
                                        }
                                        var90 = var98 << 8 | var96 << 16 | var99;
                                    }
                                }
                                if (!this.field410.field924) {
                                    var6.method2651((float) var58);
                                    var6.method2651((float) (this.method186(var58, var59) - -var64));
                                    var6.method2651((float) var59);
                                    var6.method2645((byte) (var90 >> 16));
                                    var6.method2645((byte) (var90 >> 8));
                                    var6.method2645((byte) var90);
                                    var6.method2645(-1);
                                    var6.method2651((float) var58);
                                    var6.method2651((float) var59);
                                    if (this.field413 != null) {
                                        var6.method2651((float) (var37 == null ? 0 : var37[var57] - 1));
                                    }
                                    if (~(this.field396 & 7) != -1) {
                                        var6.method2651(var73);
                                        var6.method2651(var74);
                                        var6.method2651(var72);
                                    }
                                } else {
                                    var6.method2650((float) var58);
                                    var6.method2650((float) (var64 + this.method186(var58, var59)));
                                    var6.method2650((float) var59);
                                    var6.method2645((byte) (var90 >> 16));
                                    var6.method2645((byte) (var90 >> 8));
                                    var6.method2645((byte) var90);
                                    var6.method2645(-1);
                                    var6.method2650((float) var58);
                                    var6.method2650((float) var59);
                                    if (this.field413 != null) {
                                        var6.method2650((float) (var37 != null ? var37[var57] + -1 : 0));
                                    }
                                    if (~(7 & this.field396) != -1) {
                                        var6.method2650(var73);
                                        var6.method2650(var74);
                                        var6.method2650(var72);
                                    }
                                }
                                var89 = this.field404++;
                                var56[var57] = (short) var89;
                                if (~var62 != 0) {
                                    var7[var89] = var31[var57];
                                }
                                var9.method1618(new class490(var56[var57]), var65, -1);
                            }
                            for (int var100 = 0; ~var100 > ~var54; ++var100) {
                                var10[var100].method2225(16145, var70, var75, var89, var71);
                            }
                            ++this.field415;
                        }
                    }
                }
            }
            for (int var12 = 0; var12 < this.field404; ++var12) {
                class363 var29 = var7[var12];
                if (var29 != null) {
                    var29.method2223(var12, -29920);
                }
            }
            for (int var13 = 0; ~var13 > ~super.field551; ++var13) {
                for (int var18 = 0; ~super.field554 < ~var18; ++var18) {
                    short[] var19 = this.field395[super.field551 * var18 - -var13];
                    if (var19 != null) {
                        int var20 = 0;
                        int var21 = 0;
                        while (var19.length > var21) {
                            int var22 = 65535 & var19[var21++];
                            int var23 = var19[var21++] & 65535;
                            int var24 = var19[var21++] & 65535;
                            class363 var25 = var7[var22];
                            class363 var26 = var7[var23];
                            class363 var27 = var7[var24];
                            class363 var28 = null;
                            if (var25 != null) {
                                var28 = var25;
                                var25.method2231(var13, (byte) 68, var20, var18);
                            }
                            if (var26 != null) {
                                var26.method2231(var13, (byte) -123, var20, var18);
                                if (var28 == null || var26.field3977 < var28.field3977) {
                                    var28 = var26;
                                }
                            }
                            if (var27 != null) {
                                var27.method2231(var13, (byte) 123, var20, var18);
                                if (var28 == null || var28.field3977 > var27.field3977) {
                                    var28 = var27;
                                }
                            }
                            if (var28 != null) {
                                if (var25 != null) {
                                    var28.method2223(var22, -29920);
                                }
                                if (var26 != null) {
                                    var28.method2223(var23, -29920);
                                }
                                if (var27 != null) {
                                    var28.method2223(var24, -29920);
                                }
                                var28.method2231(var13, (byte) -69, var20, var18);
                            }
                            ++var20;
                        }
                    }
                }
            }
            var6.method2647();
            this.field427 = this.field410.method400(var6.method2649(), false, var5, var4, 127);
            this.field434 = new class70(this.field427, 5126, 3, 0);
            this.field430 = new class70(this.field427, 5121, 4, 12);
            byte var14;
            if (this.field413 == null) {
                this.field422 = new class70(this.field427, 5126, 2, 16);
                var14 = 24;
            } else {
                var14 = 28;
                this.field422 = new class70(this.field427, 5126, 3, 16);
            }
            if (~(7 & this.field396) != -1) {
                this.field428 = new class70(this.field427, 5126, 3, var14);
            }
            long[] var15 = new long[this.field432.length];
            for (int var16 = 0; this.field432.length > var16; ++var16) {
                class363 var17 = this.field432[var16];
                var15[var16] = var17.field3977;
                var17.method2224(this.field404, true);
            }
            class460.method2769(this.field432, var15, 115);
            if (this.field390 != null) {
                this.field390.method3049(true);
            }
        }
        ++field402;
        this.field417 = null;
        this.field391 = null;
        this.field388 = null;
        this.field413 = null;
        this.field433 = this.field431 = this.field429 = null;
        this.field420 = null;
        this.field409 = this.field418 = null;
        this.field424 = null;
        this.field426 = null;
    }

    @OriginalMember(owner = "client!wv", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method188(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg3 != null && this.field420 == null) {
            this.field420 = new int[super.field551][super.field554][];
        }
        ++field407;
        if (arg5 != null && this.field413 == null) {
            this.field413 = new int[super.field551][super.field554][];
        }
        this.field409[arg0][arg1] = arg2;
        this.field418[arg0][arg1] = arg4;
        this.field388[arg0][arg1] = arg6;
        this.field417[arg0][arg1] = arg7;
        if (this.field413 != null) {
            this.field413[arg0][arg1] = arg5;
        }
        if (this.field420 != null) {
            this.field420[arg0][arg1] = arg3;
        }
        class363[] var15 = this.field391[arg0][arg1] = new class363[arg6.length];
        for (int var16 = 0; arg6.length > var16; ++var16) {
            long var17 = (long) arg8[var16] | (long) arg10 << 28 | (long) arg12 << 48 | (long) arg11 << 42 | (long) (arg9[var16] << 14);
            class261 var19;
            for (var19 = this.field424.method1622(var17, -117); var19 != null; var19 = this.field424.method1620(-91)) {
                class363 var20 = (class363) var19;
                if (arg8[var16] == var20.field5314 && (float) arg9[var16] == var20.field5324 && ~var20.field5308 == ~arg10 && var20.field5301 == arg11 && ~var20.field5322 == ~arg12) {
                    break;
                }
            }
            if (var19 != null) {
                var15[var16] = (class363) var19;
            } else {
                var15[var16] = new class363(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field424.method1618(var15[var16], var17, -1);
            }
        }
        if (arg13) {
            this.field411[arg0][arg1] = (byte) class418.method2558(this.field411[arg0][arg1], 1);
        }
        if (~this.field423 > ~arg6.length) {
            this.field423 = arg6.length;
        }
        this.field425 += arg6.length;
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lda;IIII[[I[[II)V")
    public class26(class44 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field419 = arg5;
        this.field410 = arg0;
        this.field387 = super.field558 - 2;
        this.field395 = new short[arg3 * arg4][];
        this.field418 = new int[arg3][arg4][];
        this.field411 = new byte[arg3][arg4];
        this.field391 = new class363[arg3][arg4][];
        this.field429 = new float[super.field551 + 1][super.field554 - -1];
        this.field420 = new int[arg3][arg4][];
        this.field417 = new int[arg3][arg4][];
        this.field396 = arg2;
        this.field399 = 1 << this.field387;
        this.field431 = new float[super.field551 + 1][super.field554 + 1];
        this.field433 = new float[super.field551 + 1][super.field554 + 1];
        this.field426 = new byte[arg3 + 1][arg4 + 1];
        this.field409 = new int[arg3][arg4][];
        this.field388 = new int[arg3][arg4][];
        for (int var9 = 1; var9 < super.field554; ++var9) {
            for (int var10 = 1; super.field551 > var10; ++var10) {
                int var11 = arg6[var10 + 1][var9] - arg6[var10 + -1][var9];
                int var12 = arg6[var10][var9 - -1] + -arg6[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + arg7 * 4 * arg7 + var11 * var11)));
                this.field433[var10][var9] = (float) var11 * var13;
                this.field431[var10][var9] = (float) (-arg7 * 2) * var13;
                this.field429[var10][var9] = (float) var12 * var13;
            }
        }
        this.field424 = new class249(128);
        if ((this.field396 & 16) != 0) {
            this.field390 = new class509(this.field410, this);
        }
    }

    @OriginalMember(owner = "client!wv", name = "OA", descriptor = "(IILi;)Li;")
    public final class31 method189(int arg0, int arg1, class31 arg2) {
        ++field405;
        if (~(this.field411[arg0][arg1] & 1) == -1) {
            return null;
        } else {
            int var4 = super.field552 >> this.field410.field807;
            class134 var5 = (class134) arg2;
            class134 var6;
            if (var5 != null && var5.method1023(var4, var4, false)) {
                var6 = var5;
                var5.method1025(0);
            } else {
                var6 = new class134(this.field410, var4, var4);
            }
            var6.method1020(var4, 0, 0, var4, 4);
            this.method181(arg0, arg1, var6, false);
            return var6;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(II)V")
    public final void method190(int arg0, int arg1) {
        ++field392;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method191(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        ++field393;
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 == null ? null : new int[var18 * 3];
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
        this.method188(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }
}
