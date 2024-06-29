import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class228 extends class327 {

    @OriginalMember(owner = "client!je", name = "r", descriptor = "Lwq;")
    private class92 field3196 = new class92();

    @OriginalMember(owner = "client!je", name = "L", descriptor = "Lao;")
    public class157 field3216;

    @OriginalMember(owner = "client!je", name = "F", descriptor = "[[I")
    private int[][] field3210;

    @OriginalMember(owner = "client!je", name = "Y", descriptor = "[[I")
    private int[][] field3229;

    @OriginalMember(owner = "client!je", name = "E", descriptor = "I")
    public int field3209;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "I")
    public int field3201;

    @OriginalMember(owner = "client!je", name = "H", descriptor = "I")
    public int field3212;

    @OriginalMember(owner = "client!je", name = "B", descriptor = "[[[I")
    private int[][][] field3206;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "[[[Lpo;")
    private class333[][][] field3194;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "[[[I")
    public int[][][] field3198;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "[[[I")
    public int[][][] field3203;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "[[[I")
    private int[][][] field3199;

    @OriginalMember(owner = "client!je", name = "D", descriptor = "[[[I")
    private int[][][] field3208;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "[[S")
    public short[][] field3200;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "[[B")
    private byte[][] field3195;

    @OriginalMember(owner = "client!je", name = "Q", descriptor = "[[B")
    private byte[][] field3221;

    @OriginalMember(owner = "client!je", name = "R", descriptor = "[[F")
    private float[][] field3222;

    @OriginalMember(owner = "client!je", name = "X", descriptor = "[[F")
    private float[][] field3228;

    @OriginalMember(owner = "client!je", name = "O", descriptor = "[[F")
    private float[][] field3219;

    @OriginalMember(owner = "client!je", name = "V", descriptor = "Lva;")
    private class288 field3226;

    @OriginalMember(owner = "client!je", name = "C", descriptor = "Lps;")
    private class51 field3207;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "Ldg;")
    public static class236 field3197 = new class236(1);

    @OriginalMember(owner = "client!je", name = "A", descriptor = "[I")
    private static int[] field3205 = new int[1];

    @OriginalMember(owner = "client!je", name = "z", descriptor = "[F")
    private static float[] field3204 = new float[16];

    @OriginalMember(owner = "client!je", name = "J", descriptor = "[I")
    private static int[] field3214 = new int[1];

    @OriginalMember(owner = "client!je", name = "I", descriptor = "[I")
    private static int[] field3213 = new int[1];

    @OriginalMember(owner = "client!je", name = "x", descriptor = "I")
    private int field3202;

    @OriginalMember(owner = "client!je", name = "G", descriptor = "I")
    private static int field3211;

    @OriginalMember(owner = "client!je", name = "K", descriptor = "I")
    private int field3215;

    @OriginalMember(owner = "client!je", name = "P", descriptor = "I")
    private int field3220;

    @OriginalMember(owner = "client!je", name = "Z", descriptor = "I")
    private int field3230;

    @OriginalMember(owner = "client!je", name = "M", descriptor = "Lhf;")
    public class224 field3217;

    @OriginalMember(owner = "client!je", name = "N", descriptor = "Lhf;")
    private class224 field3218;

    @OriginalMember(owner = "client!je", name = "S", descriptor = "Lhf;")
    public class224 field3223;

    @OriginalMember(owner = "client!je", name = "U", descriptor = "Lhf;")
    public class224 field3225;

    @OriginalMember(owner = "client!je", name = "W", descriptor = "Lum;")
    private class307 field3227;

    @OriginalMember(owner = "client!je", name = "T", descriptor = "[Lpo;")
    private class333[] field3224;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lqp;[I)V")
    public final void method331(class397 arg0, int[] arg1) {
        this.field3196.method509((byte) 123, new class195(this.field3216, this, arg0, arg1));
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lkg;II)V")
    private final void method1525(class147 arg0, int arg1, int arg2) {
        int[] var4 = this.field3198[arg1][arg2];
        int[] var5 = this.field3203[arg1][arg2];
        int var6 = var4.length;
        if (field3205.length < var6) {
            field3205 = new int[var6];
            field3213 = new int[var6];
        }
        for (int var7 = 0; var7 < var6; var7++) {
            field3205[var7] = (var4[var7] & 0xFF) >> this.field3216.field1934;
            field3213[var7] = (var5[var7] & 0xFF) >> this.field3216.field1934;
        }
        int var8 = 0;
        while (var8 < var6) {
            int var9 = field3205[var8];
            int var10 = field3213[var8++];
            int var11 = field3205[var8];
            int var12 = field3213[var8++];
            int var13 = field3205[var8];
            int var14 = field3213[var8++];
            if ((var9 - var11) * (var12 - var14) - (var12 - var10) * (var13 - var11) > 0) {
                arg0.method891(var10, var9, var12, (byte) 82, var14, var13, var11);
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method343(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        if (this.field3220 <= 0) {
            return;
        }
        opengl var9 = this.field3216.field1927;
        this.field3216.method984();
        this.field3216.method948(false);
        this.field3216.method969(false);
        this.field3216.method1009(false);
        this.field3216.method959(false);
        this.field3216.method973(0);
        this.field3216.method979(-2);
        this.field3216.method1003((class220) null);
        field3204[0] = (float) arg2 / ((float) this.field3212 * 128.0F * (float) this.field3216.field1942);
        field3204[1] = 0.0F;
        field3204[2] = 0.0F;
        field3204[3] = 0.0F;
        field3204[4] = 0.0F;
        field3204[5] = (float) arg2 / ((float) this.field3212 * 128.0F * (float) this.field3216.field1938);
        field3204[6] = 0.0F;
        field3204[7] = 0.0F;
        field3204[8] = 0.0F;
        field3204[9] = 0.0F;
        field3204[10] = 0.0F;
        field3204[11] = 0.0F;
        field3204[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field3216.field1942;
        field3204[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field3216.field1938;
        field3204[14] = 0.0F;
        field3204[15] = 1.0F;
        var9.glMatrixMode(5889);
        var9.glLoadMatrixf(field3204, 0);
        field3204[0] = 1.0F;
        field3204[1] = 0.0F;
        field3204[2] = 0.0F;
        field3204[3] = 0.0F;
        field3204[4] = 0.0F;
        field3204[5] = 0.0F;
        field3204[6] = 1.0F;
        field3204[7] = 0.0F;
        field3204[8] = 0.0F;
        field3204[9] = 1.0F;
        field3204[10] = 0.0F;
        field3204[11] = 0.0F;
        field3204[12] = 0.0F;
        field3204[13] = 0.0F;
        field3204[14] = 0.0F;
        field3204[15] = 1.0F;
        var9.glMatrixMode(5888);
        var9.glLoadMatrixf(field3204, 0);
        if ((this.field3209 & 0x7) == 0) {
            this.field3216.method969(false);
        } else {
            this.field3216.method969(true);
            this.field3216.method955();
        }
        this.field3216.method985(this.field3217, this.field3225, this.field3218, this.field3223);
        if (field3197.field3364.length < this.field3215 * 2) {
            field3197 = new class236(this.field3215 * 2);
        } else {
            field3197.field3320 = 0;
        }
        int var10 = 0;
        if (this.field3216.field1976) {
            for (int var11 = arg4; var11 < arg6; var11++) {
                int var12 = this.field4635 * var11 + arg3;
                for (int var13 = arg3; var13 < arg5; var13++) {
                    if (arg7[var13 - arg3][var11 - arg4]) {
                        short[] var14 = this.field3200[var12];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field3197.method1605(var14[var15] & 0xFFFF, false);
                                var10++;
                            }
                        }
                    }
                    var12++;
                }
            }
        } else {
            for (int var16 = arg4; var16 < arg6; var16++) {
                int var17 = this.field4635 * var16 + arg3;
                for (int var18 = arg3; var18 < arg5; var18++) {
                    if (arg7[var18 - arg3][var16 - arg4]) {
                        short[] var19 = this.field3200[var17];
                        if (var19 != null) {
                            for (int var20 = 0; var20 < var19.length; var20++) {
                                field3197.method1609(var19[var20] & 0xFFFF, 5544);
                                var10++;
                            }
                        }
                    }
                    var17++;
                }
            }
        }
        if (var10 > 0) {
            class283 var21 = new class283(this.field3216, 5123, field3197.field3364, field3197.field3320);
            this.field3216.method968(var21, 4, 0, var10);
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(Lmm;IIIIZ)V")
    public final void method330(class152 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field3207 != null && arg0 != null) {
            int var7 = arg1 - (this.field3216.field2022 * arg2 >> 8) >> this.field3216.field1934;
            int var8 = arg3 - (this.field3216.field2039 * arg2 >> 8) >> this.field3216.field1934;
            this.field3207.method298((byte) -115, arg0, var8, var7);
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(Lmm;IIIIZ)V")
    public final void method339(class152 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field3207 != null && arg0 != null) {
            int var7 = arg1 - (this.field3216.field2022 * arg2 >> 8) >> this.field3216.field1934;
            int var8 = arg3 - (this.field3216.field2039 * arg2 >> 8) >> this.field3216.field1934;
            this.field3207.method294(var7, arg0, var8, 12586);
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(II)I")
    public final int method342(int arg0, int arg1) {
        int var3 = arg0 >> this.field3201;
        int var4 = arg1 >> this.field3201;
        if (var3 < 0 || var4 < 0 || var3 > this.field4635 - 1 || var4 > this.field4642 - 1) {
            return 0;
        }
        int var5 = arg0 & this.field3212 - 1;
        int var6 = arg1 & this.field3212 - 1;
        int var7 = (this.field3212 - var5) * this.field3210[var3][var4] + this.field3210[var3 + 1][var4] * var5 >> this.field3201;
        int var8 = (this.field3212 - var5) * this.field3210[var3][var4 + 1] + this.field3210[var3 + 1][var4 + 1] * var5 >> this.field3201;
        return (this.field3212 - var6) * var7 + var6 * var8 >> this.field3201;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(III)V")
    public final void method341(int arg0, int arg1, int arg2) {
        if ((this.field3221[arg0][arg1] & 0xFF) < arg2) {
            this.field3221[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
    public final void method346(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11) {
        this.field3206[arg0][arg1] = arg3;
        this.field3198[arg0][arg1] = arg2;
        this.field3203[arg0][arg1] = arg4;
        this.field3199[arg0][arg1] = arg5;
        this.field3208[arg0][arg1] = arg6;
        class333[] var13 = this.field3194[arg0][arg1] = new class333[arg5.length];
        for (int var14 = 0; var14 < arg5.length; var14++) {
            long var15 = (long) arg10 << 48 | (long) arg9 << 32 | (long) (arg7[var14] << 16) | (long) arg8[var14];
            class406 var17 = this.field3226.method1888(var15, (byte) -30);
            if (var17 == null) {
                var13[var14] = new class333(this, arg7[var14], arg8[var14], arg9, arg10);
                this.field3226.method1886(var13[var14], var15, 1);
            } else {
                var13[var14] = (class333) var17;
            }
        }
        if (arg11) {
            this.field3195[arg0][arg1] = (byte) (this.field3195[arg0][arg1] | 0x1);
        }
        if (arg5.length > this.field3230) {
            this.field3230 = arg5.length;
        }
        this.field3220 += arg5.length;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lao;IIII[[I[[II)V")
    public class228(class157 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field3216 = arg0;
        this.field3210 = arg5;
        this.field3229 = arg6;
        this.field3209 = arg2;
        while (arg7 > 1) {
            this.field3201++;
            arg7 >>= 0x1;
        }
        this.field3212 = 0x1 << this.field3201;
        this.field3206 = new int[arg3][arg4][];
        this.field3194 = new class333[arg3][arg4][];
        this.field3198 = new int[arg3][arg4][];
        this.field3203 = new int[arg3][arg4][];
        this.field3199 = new int[arg3][arg4][];
        this.field3208 = new int[arg3][arg4][];
        this.field3200 = new short[arg3 * arg4][];
        this.field3195 = new byte[arg3][arg4];
        this.field3221 = new byte[arg3 + 1][arg4 + 1];
        this.field3222 = new float[arg3 + 1][arg4 + 1];
        this.field3228 = new float[arg3 + 1][arg4 + 1];
        this.field3219 = new float[arg3 + 1][arg4 + 1];
        for (int var9 = 1; var9 < arg4; var9++) {
            for (int var10 = 1; var10 < arg3; var10++) {
                int var11 = this.field3210[var10 + 1][var9] - this.field3210[var10 - 1][var9];
                int var12 = this.field3210[var10][var9 + 1] - this.field3210[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var11 * var11 + 65536)));
                this.field3222[var10][var9] = (float) var11 * var13;
                this.field3228[var10][var9] = var13 * -256.0F;
                this.field3219[var10][var9] = (float) var12 * var13;
            }
        }
        this.field3226 = new class288(128);
        if ((this.field3209 & 0x10) != 0) {
            this.field3207 = new class51(this.field3216, this);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lmm;IIIIZ)Z")
    public final boolean method333(class152 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field3207 == null || arg0 == null) {
            return false;
        } else {
            int var7 = arg1 - (this.field3216.field2022 * arg2 >> 8) >> 3;
            int var8 = arg3 - (this.field3216.field2039 * arg2 >> 8) >> 3;
            return this.field3207.method300(var8, arg0, -21716, var7);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
    public final void method336(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14) {
        int var16 = arg8.length;
        int[] var17 = new int[var16 * 3];
        int[] var18 = new int[var16 * 3];
        int[] var19 = new int[var16 * 3];
        int[] var20 = new int[var16 * 3];
        int[] var21 = new int[var16 * 3];
        int[] var22 = new int[var16 * 3];
        int[] var23 = arg3 == null ? null : new int[var16 * 3];
        int var24 = 0;
        for (int var25 = 0; var25 < var16; var25++) {
            int var26 = arg5[var25];
            int var27 = arg6[var25];
            int var28 = arg7[var25];
            var17[var24] = arg2[var26];
            var18[var24] = arg4[var26];
            var19[var24] = arg8[var25];
            var20[var24] = arg9[var25];
            var21[var24] = arg10[var25];
            var22[var24] = arg11[var25];
            if (arg3 != null) {
                var23[var24] = arg3[var26];
            }
            var24++;
            var17[var24] = arg2[var27];
            var18[var24] = arg4[var27];
            var19[var24] = arg8[var25];
            var20[var24] = arg9[var25];
            var21[var24] = arg10[var25];
            var22[var24] = arg11[var25];
            if (arg3 != null) {
                var23[var24] = arg3[var27];
            }
            var24++;
            var17[var24] = arg2[var28];
            var18[var24] = arg4[var28];
            var19[var24] = arg8[var25];
            var20[var24] = arg9[var25];
            var21[var24] = arg10[var25];
            var22[var24] = arg11[var25];
            if (arg3 != null) {
                var23[var24] = arg3[var28];
            }
            var24++;
        }
        this.method346(arg0, arg1, var17, var23, var18, var19, var20, var21, var22, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)I")
    public final int method328(int arg0, int arg1) {
        return this.field3210[arg0][arg1];
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III[[ZZ)V")
    public final void method335(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        if (this.field3224 == null) {
            return;
        }
        float var6 = this.field3216.field1954;
        float var7 = this.field3216.field2028;
        int var8 = arg2 + arg2 + 1;
        int var9 = var8 * var8;
        if (field3214.length < var9) {
            field3214 = new int[var9];
        }
        if (field3197.field3364.length < this.field3215 * 2) {
            field3197 = new class236(this.field3215 * 2);
        }
        int var10 = arg0 - arg2;
        int var11 = var10;
        if (var10 < 0) {
            var10 = 0;
        }
        int var12 = arg1 - arg2;
        int var13 = var12;
        if (var12 < 0) {
            var12 = 0;
        }
        int var14 = arg0 + arg2;
        if (var14 > this.field4635 - 1) {
            var14 = this.field4635 - 1;
        }
        int var15 = arg1 + arg2;
        if (var15 > this.field4642 - 1) {
            var15 = this.field4642 - 1;
        }
        field3211 = 0;
        for (int var16 = var10; var16 <= var14; var16++) {
            boolean[] var17 = arg3[var16 - var11];
            for (int var18 = var12; var18 <= var15; var18++) {
                if (var17[var18 - var13]) {
                    field3214[field3211++] = this.field4635 * var18 + var16;
                }
            }
        }
        this.field3216.method982();
        this.field3216.method969((this.field3209 & 0x7) != 0);
        for (int var19 = 0; var19 < this.field3224.length; var19++) {
            this.field3224[var19].method2158(-109, field3211, field3214);
        }
        if (!this.field3196.method504(false)) {
            int var20 = this.field3216.field1970;
            int var21 = this.field3216.field2010;
            this.field3216.method627(0, var21);
            this.field3216.method691(var7, var6 - 4.0F);
            this.field3216.method969(false);
            this.field3216.method959(false);
            this.field3216.method973(130);
            this.field3216.method979(-2);
            this.field3216.method1003(this.field3216.field1958);
            this.field3216.method981(8448, 7681);
            this.field3216.method991(0, 34166, 770);
            this.field3216.method989(0, 34167, 770);
            for (class406 var22 = this.field3196.method506((byte) -128); var22 != null; var22 = this.field3196.method514(true)) {
                class195 var23 = (class195) var22;
                var23.method1314(arg3, arg1, (byte) -127, arg0, arg2);
            }
            this.field3216.method991(0, 5890, 768);
            this.field3216.method989(0, 5890, 770);
            this.field3216.method1003((class220) null);
            this.field3216.method627(var20, var21);
        }
        if (this.field3207 != null) {
            this.field3216.method691(var7, var6 - 8.0F);
            this.field3216.method982();
            this.field3216.method985(this.field3217, (class224) null, (class224) null, this.field3223);
            this.field3207.method296(arg2, 14107, arg3, arg4, arg0, arg1);
        }
        this.field3216.method691(var7, var6);
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(II)V")
    public final void method347(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "()V")
    public final void method332() {
        if (this.field3220 > 0) {
            byte[][] var1 = new byte[this.field4635 + 1][this.field4642 + 1];
            for (int var2 = 1; var2 < this.field4635; var2++) {
                for (int var3 = 1; var3 < this.field4642; var3++) {
                    var1[var2][var3] = (byte) ((this.field3221[var2][var3] >> 1) + (this.field3221[var2][var3 + 1] >> 3) + (this.field3221[var2][var3 - 1] >> 2) + (this.field3221[var2 - 1][var3] >> 2) + (this.field3221[var2 + 1][var3] >> 3));
                }
            }
            this.field3224 = new class333[this.field3226.method1892(false)];
            this.field3226.method1882((byte) -109, this.field3224);
            for (int var4 = 0; var4 < this.field3224.length; var4++) {
                this.field3224[var4].method2156(this.field3220, 26519);
            }
            int var5 = 24;
            if (this.field3229 != null) {
                var5 += 4;
            }
            if ((this.field3209 & 0x7) != 0) {
                var5 += 12;
            }
            ByteBuffer var6 = ByteBuffer.allocateDirect(this.field3220 * var5).order(ByteOrder.nativeOrder());
            class333[] var7 = new class333[this.field3220];
            class288 var8 = new class288(class292.method1933(-583426143, this.field3220));
            class333[] var9 = new class333[this.field3230];
            for (int var10 = 0; var10 < this.field4635; var10++) {
                for (int var11 = 0; var11 < this.field4642; var11++) {
                    if (this.field3199[var10][var11] != null) {
                        class333[] var12 = this.field3194[var10][var11];
                        int[] var13 = this.field3206[var10][var11];
                        int[] var14 = this.field3198[var10][var11];
                        int[] var15 = this.field3203[var10][var11];
                        int[] var16 = this.field3208[var10][var11];
                        int[] var17 = this.field3199[var10][var11];
                        if (var16 == null) {
                            var16 = var17;
                        }
                        float var18 = this.field3222[var10][var11];
                        float var19 = this.field3228[var10][var11];
                        float var20 = this.field3219[var10][var11];
                        float var21 = this.field3222[var10][var11 + 1];
                        float var22 = this.field3228[var10][var11 + 1];
                        float var23 = this.field3219[var10][var11 + 1];
                        float var24 = this.field3222[var10 + 1][var11 + 1];
                        float var25 = this.field3228[var10 + 1][var11 + 1];
                        float var26 = this.field3219[var10 + 1][var11 + 1];
                        float var27 = this.field3222[var10 + 1][var11];
                        float var28 = this.field3228[var10 + 1][var11];
                        float var29 = this.field3219[var10 + 1][var11];
                        int var30 = var1[var10][var11] & 0xFF;
                        int var31 = var1[var10][var11 + 1] & 0xFF;
                        int var32 = var1[var10 + 1][var11 + 1] & 0xFF;
                        int var33 = var1[var10 + 1][var11] & 0xFF;
                        float var34;
                        float var35;
                        float var36;
                        float var37;
                        if (this.field3229 == null) {
                            var37 = 0.0F;
                            var36 = 0.0F;
                            var35 = 0.0F;
                            var34 = 0.0F;
                        } else {
                            var34 = (float) this.field3229[var10][var11];
                            var35 = (float) this.field3229[var10][var11 + 1];
                            var36 = (float) this.field3229[var10 + 1][var11 + 1];
                            var37 = (float) this.field3229[var10 + 1][var11];
                        }
                        int var38 = 0;
                        label304: for (int var39 = 0; var39 < var17.length; var39++) {
                            class333 var40 = var12[var39];
                            for (int var41 = 0; var41 < var38; var41++) {
                                if (var9[var41] == var40) {
                                    continue label304;
                                }
                            }
                            var9[var38++] = var40;
                        }
                        short[] var42 = this.field3200[this.field4635 * var11 + var10] = new short[var17.length];
                        for (int var43 = 0; var43 < var17.length; var43++) {
                            int var44 = (var10 << this.field3201) + var14[var43];
                            int var45 = (var11 << this.field3201) + var15[var43];
                            int var46 = var17[var43];
                            int var47 = var16[var43];
                            int var48 = var13 == null ? 0 : var13[var43];
                            long var49 = (long) var47 << 48 | (long) var46 << 32 | (long) (var44 << 16) | (long) var45;
                            int var51 = var14[var43];
                            int var52 = var15[var43];
                            byte var53 = 74;
                            int var54 = 0;
                            float var55 = 1.0F;
                            float var56;
                            float var57;
                            float var58;
                            float var59;
                            int var60;
                            if (var51 == 0 && var52 == 0) {
                                var56 = var18;
                                var57 = var19;
                                var58 = var20;
                                var59 = var34;
                                var60 = var53 - var30;
                            } else if (var51 == 0 && this.field3212 == var52) {
                                var56 = var21;
                                var57 = var22;
                                var58 = var23;
                                var59 = var35;
                                var60 = var53 - var31;
                            } else if (this.field3212 == var51 && this.field3212 == var52) {
                                var56 = var24;
                                var57 = var25;
                                var58 = var26;
                                var59 = var36;
                                var60 = var53 - var32;
                            } else if (this.field3212 == var51 && var52 == 0) {
                                var56 = var27;
                                var57 = var28;
                                var58 = var29;
                                var59 = var37;
                                var60 = var53 - var33;
                            } else {
                                float var61 = (float) var51 / (float) this.field3212;
                                float var62 = (float) var52 / (float) this.field3212;
                                float var63 = (var27 - var18) * var61 + var18;
                                float var64 = (var28 - var19) * var61 + var19;
                                float var65 = (var29 - var20) * var61 + var20;
                                float var66 = (var24 - var21) * var61 + var21;
                                float var67 = (var25 - var22) * var61 + var22;
                                float var68 = (var26 - var23) * var61 + var23;
                                var56 = (var66 - var63) * var62 + var63;
                                var57 = (var67 - var64) * var62 + var64;
                                var58 = (var68 - var65) * var62 + var65;
                                int var69 = ((var33 - var30) * var51 >> this.field3201) + var30;
                                int var70 = ((var32 - var31) * var51 >> this.field3201) + var31;
                                var60 = var53 - (((var70 - var69) * var52 >> this.field3201) + var69);
                                float var71 = (var37 - var34) * var61 + var34;
                                float var72 = (var36 - var35) * var61 + var35;
                                var59 = (var72 - var71) * var62 + var71;
                            }
                            if (var46 != -1) {
                                int var73 = (var46 & 0x7F) * var60 >> 7;
                                if (var73 < 2) {
                                    var73 = 2;
                                } else if (var73 > 126) {
                                    var73 = 126;
                                }
                                var54 = class318.field4509[var46 & 0xFF80 | var73];
                                if ((this.field3209 & 0x7) == 0) {
                                    float var74 = this.field3216.field2020[2] * var58 + this.field3216.field2020[0] * var56 + this.field3216.field2020[1] * var57;
                                    var55 = this.field3216.field2032 + var74 * (var74 > 0.0F ? this.field3216.field2003 : this.field3216.field2052);
                                }
                            }
                            class406 var75 = var8.method1888(var49, (byte) -30);
                            int var86;
                            if (var75 == null) {
                                int var77;
                                if (var46 == var47) {
                                    var77 = var54;
                                } else {
                                    int var76 = (var47 & 0x7F) * var60 >> 7;
                                    if (var76 < 2) {
                                        var76 = 2;
                                    } else if (var76 > 126) {
                                        var76 = 126;
                                    }
                                    var77 = class318.field4509[var47 & 0xFF80 | var76];
                                    if ((this.field3209 & 0x7) == 0) {
                                        float var78 = this.field3216.field2020[2] * var58 + this.field3216.field2020[0] * var56 + this.field3216.field2020[1] * var57;
                                        float var79 = this.field3216.field2032 + var55 * (var55 > 0.0F ? this.field3216.field2003 : this.field3216.field2052);
                                        int var80 = var77 >> 16 & 0xFF;
                                        int var81 = var77 >> 8 & 0xFF;
                                        int var82 = var77 & 0xFF;
                                        int var83 = (int) ((float) var80 * var79);
                                        if (var83 < 0) {
                                            var83 = 0;
                                        } else if (var83 > 255) {
                                            var83 = 255;
                                        }
                                        int var84 = (int) ((float) var81 * var79);
                                        if (var84 < 0) {
                                            var84 = 0;
                                        } else if (var84 > 255) {
                                            var84 = 255;
                                        }
                                        int var85 = (int) ((float) var82 * var79);
                                        if (var85 < 0) {
                                            var85 = 0;
                                        } else if (var85 > 255) {
                                            var85 = 255;
                                        }
                                        var77 = var83 << 16 | var84 << 8 | var85;
                                    }
                                }
                                var6.putFloat((float) var44);
                                var6.putFloat((float) (this.method342(var44, var45) + var48));
                                var6.putFloat((float) var45);
                                var6.put((byte) (var77 >> 16));
                                var6.put((byte) (var77 >> 8));
                                var6.put((byte) var77);
                                var6.put((byte) -1);
                                var6.putFloat((float) var44);
                                var6.putFloat((float) var45);
                                if (this.field3229 != null) {
                                    var6.putFloat((float) var48 + var59);
                                }
                                if ((this.field3209 & 0x7) != 0) {
                                    var6.putFloat(var56);
                                    var6.putFloat(var57);
                                    var6.putFloat(var58);
                                }
                                var86 = this.field3202++;
                                var42[var43] = (short) var86;
                                if (var46 != -1) {
                                    var7[var86] = var12[var43];
                                }
                                var8.method1886(new class325(var42[var43]), var49, 1);
                            } else {
                                var42[var43] = ((class325) var75).field4623;
                                var86 = var42[var43] & 0xFFFF;
                                if (var46 != -1 && var12[var43].field5855 < var7[var86].field5855) {
                                    var7[var86] = var12[var43];
                                }
                            }
                            for (int var87 = 0; var87 < var38; var87++) {
                                var9[var87].method2155((byte) 44, var55, var60, var86, var54);
                            }
                            this.field3215++;
                        }
                    }
                }
            }
            for (int var88 = 0; var88 < this.field3202; var88++) {
                class333 var89 = var7[var88];
                if (var89 != null) {
                    var89.method2157((byte) -126, var88);
                }
            }
            for (int var90 = 0; var90 < this.field4635; var90++) {
                for (int var91 = 0; var91 < this.field4642; var91++) {
                    short[] var92 = this.field3200[this.field4635 * var91 + var90];
                    if (var92 != null) {
                        int var93 = 0;
                        int var94 = 0;
                        while (var94 < var92.length) {
                            int var95 = var92[var94++] & 0xFFFF;
                            int var96 = var92[var94++] & 0xFFFF;
                            int var97 = var92[var94++] & 0xFFFF;
                            class333 var98 = var7[var95];
                            class333 var99 = var7[var96];
                            class333 var100 = var7[var97];
                            class333 var101 = null;
                            if (var98 != null) {
                                var98.method2153(var90, false, var93, var91);
                                var101 = var98;
                            }
                            if (var99 != null) {
                                var99.method2153(var90, false, var93, var91);
                                if (var101 == null || var99.field5855 < var101.field5855) {
                                    var101 = var99;
                                }
                            }
                            if (var100 != null) {
                                var100.method2153(var90, false, var93, var91);
                                if (var101 == null || var100.field5855 < var101.field5855) {
                                    var101 = var100;
                                }
                            }
                            if (var101 != null) {
                                if (var98 != null) {
                                    var101.method2157((byte) -63, var95);
                                }
                                if (var99 != null) {
                                    var101.method2157((byte) -121, var96);
                                }
                                if (var100 != null) {
                                    var101.method2157((byte) -78, var97);
                                }
                                var101.method2153(var90, false, var93, var91);
                            }
                            var93++;
                        }
                    }
                }
            }
            var6.flip();
            this.field3227 = this.field3216.method938(var5, var6, false);
            this.field3217 = new class224(this.field3216, this.field3227, 5126, 3, 0);
            this.field3218 = new class224(this.field3216, this.field3227, 5121, 4, 12);
            byte var102;
            if (this.field3229 == null) {
                this.field3223 = new class224(this.field3216, this.field3227, 5126, 2, 16);
                var102 = 24;
            } else {
                this.field3223 = new class224(this.field3216, this.field3227, 5126, 3, 16);
                var102 = 28;
            }
            if ((this.field3209 & 0x7) != 0) {
                this.field3225 = new class224(this.field3216, this.field3227, 5126, 3, var102);
                int var106 = var102 + 12;
            }
            long[] var103 = new long[this.field3224.length];
            for (int var104 = 0; var104 < this.field3224.length; var104++) {
                class333 var105 = this.field3224[var104];
                var103[var104] = var105.field5855;
                var105.method2154(this.field3202, 0);
            }
            class21.method156(87, this.field3224, var103);
            if (this.field3207 != null) {
                this.field3207.method299(30004);
            }
        } else {
            this.field3207 = null;
        }
        this.field3198 = this.field3203 = (int[][][]) null;
        this.field3208 = (int[][][]) null;
        this.field3206 = (int[][][]) null;
        this.field3194 = (class333[][][]) null;
        this.field3199 = (int[][][]) null;
        this.field3221 = (byte[][]) null;
        this.field3226 = null;
        this.field3229 = (int[][]) null;
        this.field3222 = this.field3228 = this.field3219 = (float[][]) null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IILmm;)Lmm;")
    public final class152 method329(int arg0, int arg1, class152 arg2) {
        if ((this.field3195[arg0][arg1] & 0x1) == 0) {
            return null;
        }
        int var4 = this.field3212 >> this.field3216.field1934;
        class147 var5 = (class147) arg2;
        class147 var6;
        if (var5 != null && var5.method889(var4, var4, (byte) -83)) {
            var6 = var5;
            var5.method892(-7838);
        } else {
            var6 = new class147(this.field3216, var4, var4);
        }
        var6.method890(0, -1615387824, var4, var4, 0);
        this.method1525(var6, arg0, arg1);
        return var6;
    }
}
