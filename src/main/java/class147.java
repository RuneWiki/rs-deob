import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class147 extends class129 {

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "Lbd;")
    private class37 field2301 = new class37();

    @OriginalMember(owner = "client!kg", name = "z", descriptor = "Lsq;")
    public class96 field2307;

    @OriginalMember(owner = "client!kg", name = "B", descriptor = "[[I")
    private int[][] field2309;

    @OriginalMember(owner = "client!kg", name = "K", descriptor = "[[I")
    private int[][] field2318;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
    public int field2293;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
    public int field2298;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
    public int field2297;

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "[[[I")
    private int[][][] field2303;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "[[[Lvn;")
    private class168[][][] field2290;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "[[[I")
    public int[][][] field2291;

    @OriginalMember(owner = "client!kg", name = "A", descriptor = "[[[I")
    public int[][][] field2308;

    @OriginalMember(owner = "client!kg", name = "C", descriptor = "[[[I")
    private int[][][] field2310;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "[[[I")
    private int[][][] field2296;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "[[S")
    public short[][] field2292;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "[[B")
    private byte[][] field2295;

    @OriginalMember(owner = "client!kg", name = "O", descriptor = "[[B")
    private byte[][] field2322;

    @OriginalMember(owner = "client!kg", name = "N", descriptor = "[[F")
    private float[][] field2321;

    @OriginalMember(owner = "client!kg", name = "Q", descriptor = "[[F")
    private float[][] field2324;

    @OriginalMember(owner = "client!kg", name = "R", descriptor = "[[F")
    private float[][] field2325;

    @OriginalMember(owner = "client!kg", name = "P", descriptor = "Lbn;")
    private class256 field2323;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "Llb;")
    private class320 field2294;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "Ljg;")
    public static class186 field2302 = new class186(1);

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "[I")
    private static int[] field2304 = new int[1];

    @OriginalMember(owner = "client!kg", name = "y", descriptor = "[F")
    private static float[] field2306 = new float[16];

    @OriginalMember(owner = "client!kg", name = "D", descriptor = "[I")
    private static int[] field2311 = new int[1];

    @OriginalMember(owner = "client!kg", name = "E", descriptor = "[I")
    private static int[] field2312 = new int[1];

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
    private int field2299;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
    private int field2300;

    @OriginalMember(owner = "client!kg", name = "x", descriptor = "I")
    private static int field2305;

    @OriginalMember(owner = "client!kg", name = "F", descriptor = "I")
    private int field2313;

    @OriginalMember(owner = "client!kg", name = "J", descriptor = "I")
    private int field2317;

    @OriginalMember(owner = "client!kg", name = "H", descriptor = "Lqd;")
    public class259 field2315;

    @OriginalMember(owner = "client!kg", name = "I", descriptor = "Lqd;")
    public class259 field2316;

    @OriginalMember(owner = "client!kg", name = "L", descriptor = "Lqd;")
    private class259 field2319;

    @OriginalMember(owner = "client!kg", name = "M", descriptor = "Lqd;")
    public class259 field2320;

    @OriginalMember(owner = "client!kg", name = "G", descriptor = "Leb;")
    private class371 field2314;

    @OriginalMember(owner = "client!kg", name = "S", descriptor = "[Lvn;")
    private class168[] field2326;

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lsq;IIII[[I[[II)V", line = 6)
    public class147(class96 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field2307 = arg0;
        this.field2309 = arg5;
        this.field2318 = arg6;
        this.field2293 = arg2;
        while (arg7 > 1) {
            this.field2298++;
            arg7 >>= 0x1;
        }
        this.field2297 = 0x1 << this.field2298;
        this.field2303 = new int[arg3][arg4][];
        this.field2290 = new class168[arg3][arg4][];
        this.field2291 = new int[arg3][arg4][];
        this.field2308 = new int[arg3][arg4][];
        this.field2310 = new int[arg3][arg4][];
        this.field2296 = new int[arg3][arg4][];
        this.field2292 = new short[arg3 * arg4][];
        this.field2295 = new byte[arg3][arg4];
        this.field2322 = new byte[arg3 + 1][arg4 + 1];
        this.field2321 = new float[arg3 + 1][arg4 + 1];
        this.field2324 = new float[arg3 + 1][arg4 + 1];
        this.field2325 = new float[arg3 + 1][arg4 + 1];
        for (int var9 = 1; var9 < arg4; var9++) {
            for (int var10 = 1; var10 < arg3; var10++) {
                int var11 = this.field2309[var10 + 1][var9] - this.field2309[var10 - 1][var9];
                int var12 = this.field2309[var10][var9 + 1] - this.field2309[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var11 * var11 + 65536)));
                this.field2321[var10][var9] = (float) var11 * var13;
                this.field2324[var10][var9] = var13 * -256.0F;
                this.field2325[var10][var9] = (float) var12 * var13;
            }
        }
        this.field2323 = new class256(128);
        if ((this.field2293 & 0x10) != 0) {
            this.field2294 = new class320(this.field2307, this);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V", line = 71)
    public final void method776(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14) {
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
        this.method768(arg0, arg1, var17, var23, var18, var19, var20, var21, var22, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)I", line = 137)
    public final int method771(int arg0, int arg1) {
        int var3 = arg0 >> this.field2298;
        int var4 = arg1 >> this.field2298;
        if (var3 < 0 || var4 < 0 || var3 > this.field2036 - 1 || var4 > this.field2040 - 1) {
            return 0;
        }
        int var5 = arg0 & this.field2297 - 1;
        int var6 = arg1 & this.field2297 - 1;
        int var7 = (this.field2297 - var5) * this.field2309[var3][var4] + this.field2309[var3 + 1][var4] * var5 >> this.field2298;
        int var8 = (this.field2297 - var5) * this.field2309[var3][var4 + 1] + this.field2309[var3 + 1][var4 + 1] * var5 >> this.field2298;
        return (this.field2297 - var6) * var7 + var6 * var8 >> this.field2298;
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(II)I", line = 154)
    public final int method779(int arg0, int arg1) {
        return this.field2309[arg0][arg1];
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIII[[Z)V", line = 157)
    public final void method769(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        if (this.field2313 <= 0) {
            return;
        }
        opengl var9 = this.field2307.field1156;
        this.field2307.method716();
        this.field2307.method722(false);
        this.field2307.method667(false);
        this.field2307.method656(false);
        this.field2307.method592(false);
        this.field2307.method699(0);
        this.field2307.method633(-2);
        this.field2307.method688((class293) null);
        field2306[0] = (float) arg2 / ((float) this.field2297 * 128.0F * (float) this.field2307.field1168);
        field2306[1] = 0.0F;
        field2306[2] = 0.0F;
        field2306[3] = 0.0F;
        field2306[4] = 0.0F;
        field2306[5] = (float) arg2 / ((float) this.field2297 * 128.0F * (float) this.field2307.field1177);
        field2306[6] = 0.0F;
        field2306[7] = 0.0F;
        field2306[8] = 0.0F;
        field2306[9] = 0.0F;
        field2306[10] = 0.0F;
        field2306[11] = 0.0F;
        field2306[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field2307.field1168;
        field2306[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field2307.field1177;
        field2306[14] = 0.0F;
        field2306[15] = 1.0F;
        var9.glMatrixMode(5889);
        var9.glLoadMatrixf(field2306, 0);
        field2306[0] = 1.0F;
        field2306[1] = 0.0F;
        field2306[2] = 0.0F;
        field2306[3] = 0.0F;
        field2306[4] = 0.0F;
        field2306[5] = 0.0F;
        field2306[6] = 1.0F;
        field2306[7] = 0.0F;
        field2306[8] = 0.0F;
        field2306[9] = 1.0F;
        field2306[10] = 0.0F;
        field2306[11] = 0.0F;
        field2306[12] = 0.0F;
        field2306[13] = 0.0F;
        field2306[14] = 0.0F;
        field2306[15] = 1.0F;
        var9.glMatrixMode(5888);
        var9.glLoadMatrixf(field2306, 0);
        if ((this.field2293 & 0x7) == 0) {
            this.field2307.method667(false);
        } else {
            this.field2307.method667(true);
            this.field2307.method640();
        }
        this.field2307.method607(this.field2315, this.field2320, this.field2319, this.field2316);
        if (field2302.field3066.length < this.field2299 * 2) {
            field2302 = new class186(this.field2299 * 2);
        } else {
            field2302.field3044 = 0;
        }
        int var10 = 0;
        if (this.field2307.field1280) {
            for (int var11 = arg4; var11 < arg6; var11++) {
                int var12 = this.field2036 * var11 + arg3;
                for (int var13 = arg3; var13 < arg5; var13++) {
                    if (arg7[var13 - arg3][var11 - arg4]) {
                        short[] var14 = this.field2292[var12];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field2302.method1283(8, var14[var15] & 0xFFFF);
                                var10++;
                            }
                        }
                    }
                    var12++;
                }
            }
        } else {
            for (int var16 = arg4; var16 < arg6; var16++) {
                int var17 = this.field2036 * var16 + arg3;
                for (int var18 = arg3; var18 < arg5; var18++) {
                    if (arg7[var18 - arg3][var16 - arg4]) {
                        short[] var19 = this.field2292[var17];
                        if (var19 != null) {
                            for (int var20 = 0; var20 < var19.length; var20++) {
                                field2302.method1319(-122, var19[var20] & 0xFFFF);
                                var10++;
                            }
                        }
                    }
                    var17++;
                }
            }
        }
        if (var10 > 0) {
            class274 var21 = new class274(this.field2307, 5123, field2302.field3066, field2302.field3044);
            this.field2307.method646(var21, 4, 0, var10);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lej;[I)V", line = 322)
    public final void method772(class62 arg0, int[] arg1) {
        this.field2301.method245(500, new class10(this.field2307, this, arg0, arg1));
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IILas;)Las;", line = 326)
    public final class84 method777(int arg0, int arg1, class84 arg2) {
        if ((this.field2295[arg0][arg1] & 0x1) == 0) {
            return null;
        }
        int var4 = this.field2297 >> this.field2307.field1171;
        class15 var5 = (class15) arg2;
        class15 var6;
        if (var5 != null && var5.method127(var4, -123, var4)) {
            var6 = var5;
            var5.method130((byte) 11);
        } else {
            var6 = new class15(this.field2307, var4, var4);
        }
        var6.method129(-247965552, var4, var4, 0, 0);
        this.method1053(var6, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)V", line = 350)
    public final void method786(int arg0, int arg1, int arg2) {
        if ((this.field2322[arg0][arg1] & 0xFF) < arg2) {
            this.field2322[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lub;II)V", line = 356)
    private final void method1053(class15 arg0, int arg1, int arg2) {
        int[] var4 = this.field2291[arg1][arg2];
        int[] var5 = this.field2308[arg1][arg2];
        int var6 = var4.length;
        if (field2304.length < var6) {
            field2304 = new int[var6];
            field2312 = new int[var6];
        }
        for (int var7 = 0; var7 < var6; var7++) {
            field2304[var7] = (var4[var7] & 0xFF) >> this.field2307.field1171;
            field2312[var7] = (var5[var7] & 0xFF) >> this.field2307.field1171;
        }
        int var8 = 0;
        while (var8 < var6) {
            int var9 = field2304[var8];
            int var10 = field2312[var8++];
            int var11 = field2304[var8];
            int var12 = field2312[var8++];
            int var13 = field2304[var8];
            int var14 = field2312[var8++];
            if ((var9 - var11) * (var12 - var14) - (var12 - var10) * (var13 - var11) > 0) {
                arg0.method131(var12, var9, var11, var13, var14, 0, var10);
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)V", line = 404)
    public final void method770(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V", line = 409)
    public final void method768(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11) {
        this.field2303[arg0][arg1] = arg3;
        this.field2291[arg0][arg1] = arg2;
        this.field2308[arg0][arg1] = arg4;
        this.field2310[arg0][arg1] = arg5;
        this.field2296[arg0][arg1] = arg6;
        class168[] var13 = this.field2290[arg0][arg1] = new class168[arg5.length];
        for (int var14 = 0; var14 < arg5.length; var14++) {
            long var15 = (long) arg10 << 48 | (long) arg9 << 32 | (long) (arg7[var14] << 16) | (long) arg8[var14];
            class161 var17 = this.field2323.method1770(-880, var15);
            if (var17 == null) {
                var13[var14] = new class168(this, arg7[var14], arg8[var14], arg9, arg10);
                this.field2323.method1766(var15, var13[var14], -123);
            } else {
                var13[var14] = (class168) var17;
            }
        }
        if (arg11) {
            this.field2295[arg0][arg1] = (byte) (this.field2295[arg0][arg1] | 0x1);
        }
        if (arg5.length > this.field2317) {
            this.field2317 = arg5.length;
        }
        this.field2313 += arg5.length;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Las;IIIIZ)Z", line = 445)
    public final boolean method782(class84 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field2294 == null || arg0 == null) {
            return false;
        } else {
            int var7 = arg1 - (this.field2307.field1277 * arg2 >> 8) >> 3;
            int var8 = arg3 - (this.field2307.field1221 * arg2 >> 8) >> 3;
            return this.field2294.method2124(arg0, 1, var8, var7);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(III[[ZZ)V", line = 462)
    public final void method784(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        if (this.field2326 == null) {
            return;
        }
        float var6 = this.field2307.field1207;
        float var7 = this.field2307.field1205;
        int var8 = arg2 + arg2 + 1;
        int var9 = var8 * var8;
        if (field2311.length < var9) {
            field2311 = new int[var9];
        }
        if (field2302.field3066.length < this.field2299 * 2) {
            field2302 = new class186(this.field2299 * 2);
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
        if (var14 > this.field2036 - 1) {
            var14 = this.field2036 - 1;
        }
        int var15 = arg1 + arg2;
        if (var15 > this.field2040 - 1) {
            var15 = this.field2040 - 1;
        }
        field2305 = 0;
        for (int var16 = var10; var16 <= var14; var16++) {
            boolean[] var17 = arg3[var16 - var11];
            for (int var18 = var12; var18 <= var15; var18++) {
                if (var17[var18 - var13]) {
                    field2311[field2305++] = this.field2036 * var18 + var16;
                }
            }
        }
        this.field2307.method669();
        this.field2307.method667((this.field2293 & 0x7) != 0);
        for (int var19 = 0; var19 < this.field2326.length; var19++) {
            this.field2326[var19].method1174(field2311, field2305, false);
        }
        if (!this.field2301.method246((byte) 75)) {
            int var20 = this.field2307.field1199;
            int var21 = this.field2307.field1209;
            this.field2307.method692(0, var21);
            this.field2307.method619(var7, var6 - 4.0F);
            this.field2307.method667(false);
            this.field2307.method592(false);
            this.field2307.method699(130);
            this.field2307.method633(-2);
            this.field2307.method688(this.field2307.field1276);
            this.field2307.method680(8448, 7681);
            this.field2307.method712(0, 34166, 770);
            this.field2307.method658(0, 34167, 770);
            for (class161 var22 = this.field2301.method253((byte) -6); var22 != null; var22 = this.field2301.method247((byte) 80)) {
                class10 var23 = (class10) var22;
                var23.method103(arg3, arg1, -31, arg0, arg2);
            }
            this.field2307.method712(0, 5890, 768);
            this.field2307.method658(0, 5890, 770);
            this.field2307.method688((class293) null);
            this.field2307.method692(var20, var21);
        }
        if (this.field2294 != null) {
            this.field2307.method619(var7, var6 - 8.0F);
            this.field2307.method669();
            this.field2307.method607(this.field2315, (class259) null, (class259) null, this.field2316);
            this.field2294.method2120(arg0, 0, arg4, arg2, arg1, arg3);
        }
        this.field2307.method619(var7, var6);
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(Las;IIIIZ)V", line = 603)
    public final void method787(class84 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field2294 != null && arg0 != null) {
            int var7 = arg1 - (this.field2307.field1277 * arg2 >> 8) >> this.field2307.field1171;
            int var8 = arg3 - (this.field2307.field1221 * arg2 >> 8) >> this.field2307.field1171;
            this.field2294.method2122(arg0, var7, var8, false);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "()V", line = 617)
    public final void method780() {
        if (this.field2313 > 0) {
            byte[][] var1 = new byte[this.field2036 + 1][this.field2040 + 1];
            for (int var2 = 1; var2 < this.field2036; var2++) {
                for (int var3 = 1; var3 < this.field2040; var3++) {
                    var1[var2][var3] = (byte) ((this.field2322[var2][var3] >> 1) + (this.field2322[var2][var3 + 1] >> 3) + (this.field2322[var2][var3 - 1] >> 2) + (this.field2322[var2 - 1][var3] >> 2) + (this.field2322[var2 + 1][var3] >> 3));
                }
            }
            this.field2326 = new class168[this.field2323.method1778(0)];
            this.field2323.method1772((byte) 127, this.field2326);
            for (int var4 = 0; var4 < this.field2326.length; var4++) {
                this.field2326[var4].method1175(this.field2313, (byte) 123);
            }
            int var5 = 24;
            if (this.field2318 != null) {
                var5 += 4;
            }
            if ((this.field2293 & 0x7) != 0) {
                var5 += 12;
            }
            ByteBuffer var6 = ByteBuffer.allocateDirect(this.field2313 * var5).order(ByteOrder.nativeOrder());
            class168[] var7 = new class168[this.field2313];
            class256 var8 = new class256(class410.method2573(this.field2313, (byte) -102));
            class168[] var9 = new class168[this.field2317];
            for (int var10 = 0; var10 < this.field2036; var10++) {
                for (int var11 = 0; var11 < this.field2040; var11++) {
                    if (this.field2310[var10][var11] != null) {
                        class168[] var12 = this.field2290[var10][var11];
                        int[] var13 = this.field2303[var10][var11];
                        int[] var14 = this.field2291[var10][var11];
                        int[] var15 = this.field2308[var10][var11];
                        int[] var16 = this.field2296[var10][var11];
                        int[] var17 = this.field2310[var10][var11];
                        if (var16 == null) {
                            var16 = var17;
                        }
                        float var18 = this.field2321[var10][var11];
                        float var19 = this.field2324[var10][var11];
                        float var20 = this.field2325[var10][var11];
                        float var21 = this.field2321[var10][var11 + 1];
                        float var22 = this.field2324[var10][var11 + 1];
                        float var23 = this.field2325[var10][var11 + 1];
                        float var24 = this.field2321[var10 + 1][var11 + 1];
                        float var25 = this.field2324[var10 + 1][var11 + 1];
                        float var26 = this.field2325[var10 + 1][var11 + 1];
                        float var27 = this.field2321[var10 + 1][var11];
                        float var28 = this.field2324[var10 + 1][var11];
                        float var29 = this.field2325[var10 + 1][var11];
                        int var30 = var1[var10][var11] & 0xFF;
                        int var31 = var1[var10][var11 + 1] & 0xFF;
                        int var32 = var1[var10 + 1][var11 + 1] & 0xFF;
                        int var33 = var1[var10 + 1][var11] & 0xFF;
                        float var34;
                        float var35;
                        float var36;
                        float var37;
                        if (this.field2318 == null) {
                            var37 = 0.0F;
                            var36 = 0.0F;
                            var35 = 0.0F;
                            var34 = 0.0F;
                        } else {
                            var34 = (float) this.field2318[var10][var11];
                            var35 = (float) this.field2318[var10][var11 + 1];
                            var36 = (float) this.field2318[var10 + 1][var11 + 1];
                            var37 = (float) this.field2318[var10 + 1][var11];
                        }
                        int var38 = 0;
                        label304: for (int var39 = 0; var39 < var17.length; var39++) {
                            class168 var40 = var12[var39];
                            for (int var41 = 0; var41 < var38; var41++) {
                                if (var9[var41] == var40) {
                                    continue label304;
                                }
                            }
                            var9[var38++] = var40;
                        }
                        short[] var42 = this.field2292[this.field2036 * var11 + var10] = new short[var17.length];
                        for (int var43 = 0; var43 < var17.length; var43++) {
                            int var44 = (var10 << this.field2298) + var14[var43];
                            int var45 = (var11 << this.field2298) + var15[var43];
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
                            } else if (var51 == 0 && this.field2297 == var52) {
                                var56 = var21;
                                var57 = var22;
                                var58 = var23;
                                var59 = var35;
                                var60 = var53 - var31;
                            } else if (this.field2297 == var51 && this.field2297 == var52) {
                                var56 = var24;
                                var57 = var25;
                                var58 = var26;
                                var59 = var36;
                                var60 = var53 - var32;
                            } else if (this.field2297 == var51 && var52 == 0) {
                                var56 = var27;
                                var57 = var28;
                                var58 = var29;
                                var59 = var37;
                                var60 = var53 - var33;
                            } else {
                                float var61 = (float) var51 / (float) this.field2297;
                                float var62 = (float) var52 / (float) this.field2297;
                                float var63 = (var27 - var18) * var61 + var18;
                                float var64 = (var28 - var19) * var61 + var19;
                                float var65 = (var29 - var20) * var61 + var20;
                                float var66 = (var24 - var21) * var61 + var21;
                                float var67 = (var25 - var22) * var61 + var22;
                                float var68 = (var26 - var23) * var61 + var23;
                                var56 = (var66 - var63) * var62 + var63;
                                var57 = (var67 - var64) * var62 + var64;
                                var58 = (var68 - var65) * var62 + var65;
                                int var69 = ((var33 - var30) * var51 >> this.field2298) + var30;
                                int var70 = ((var32 - var31) * var51 >> this.field2298) + var31;
                                var60 = var53 - (((var70 - var69) * var52 >> this.field2298) + var69);
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
                                var54 = class36.field441[var46 & 0xFF80 | var73];
                                if ((this.field2293 & 0x7) == 0) {
                                    float var74 = this.field2307.field1235[2] * var58 + this.field2307.field1235[0] * var56 + this.field2307.field1235[1] * var57;
                                    var55 = this.field2307.field1246 + var74 * (var74 > 0.0F ? this.field2307.field1225 : this.field2307.field1234);
                                }
                            }
                            class161 var75 = var8.method1770(-880, var49);
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
                                    var77 = class36.field441[var47 & 0xFF80 | var76];
                                    if ((this.field2293 & 0x7) == 0) {
                                        float var78 = this.field2307.field1235[2] * var58 + this.field2307.field1235[0] * var56 + this.field2307.field1235[1] * var57;
                                        float var79 = this.field2307.field1246 + var55 * (var55 > 0.0F ? this.field2307.field1225 : this.field2307.field1234);
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
                                var6.putFloat((float) (this.method771(var44, var45) + var48));
                                var6.putFloat((float) var45);
                                var6.put((byte) (var77 >> 16));
                                var6.put((byte) (var77 >> 8));
                                var6.put((byte) var77);
                                var6.put((byte) -1);
                                var6.putFloat((float) var44);
                                var6.putFloat((float) var45);
                                if (this.field2318 != null) {
                                    var6.putFloat((float) var48 + var59);
                                }
                                if ((this.field2293 & 0x7) != 0) {
                                    var6.putFloat(var56);
                                    var6.putFloat(var57);
                                    var6.putFloat(var58);
                                }
                                var86 = this.field2300++;
                                var42[var43] = (short) var86;
                                if (var46 != -1) {
                                    var7[var86] = var12[var43];
                                }
                                var8.method1766(var49, new class43(var42[var43]), 86);
                            } else {
                                var42[var43] = ((class43) var75).field537;
                                var86 = var42[var43] & 0xFFFF;
                                if (var46 != -1 && var12[var43].field2539 < var7[var86].field2539) {
                                    var7[var86] = var12[var43];
                                }
                            }
                            for (int var87 = 0; var87 < var38; var87++) {
                                var9[var87].method1177(var54, var55, var86, (byte) 105, var60);
                            }
                            this.field2299++;
                        }
                    }
                }
            }
            for (int var88 = 0; var88 < this.field2300; var88++) {
                class168 var89 = var7[var88];
                if (var89 != null) {
                    var89.method1173((byte) 89, var88);
                }
            }
            for (int var90 = 0; var90 < this.field2036; var90++) {
                for (int var91 = 0; var91 < this.field2040; var91++) {
                    short[] var92 = this.field2292[this.field2036 * var91 + var90];
                    if (var92 != null) {
                        int var93 = 0;
                        int var94 = 0;
                        while (var94 < var92.length) {
                            int var95 = var92[var94++] & 0xFFFF;
                            int var96 = var92[var94++] & 0xFFFF;
                            int var97 = var92[var94++] & 0xFFFF;
                            class168 var98 = var7[var95];
                            class168 var99 = var7[var96];
                            class168 var100 = var7[var97];
                            class168 var101 = null;
                            if (var98 != null) {
                                var98.method1178(var90, var91, var93, true);
                                var101 = var98;
                            }
                            if (var99 != null) {
                                var99.method1178(var90, var91, var93, true);
                                if (var101 == null || var99.field2539 < var101.field2539) {
                                    var101 = var99;
                                }
                            }
                            if (var100 != null) {
                                var100.method1178(var90, var91, var93, true);
                                if (var101 == null || var100.field2539 < var101.field2539) {
                                    var101 = var100;
                                }
                            }
                            if (var101 != null) {
                                if (var98 != null) {
                                    var101.method1173((byte) 89, var95);
                                }
                                if (var99 != null) {
                                    var101.method1173((byte) 89, var96);
                                }
                                if (var100 != null) {
                                    var101.method1173((byte) 89, var97);
                                }
                                var101.method1178(var90, var91, var93, true);
                            }
                            var93++;
                        }
                    }
                }
            }
            var6.flip();
            this.field2314 = this.field2307.method564(var5, var6, false);
            this.field2315 = new class259(this.field2307, this.field2314, 5126, 3, 0);
            this.field2319 = new class259(this.field2307, this.field2314, 5121, 4, 12);
            byte var102;
            if (this.field2318 == null) {
                this.field2316 = new class259(this.field2307, this.field2314, 5126, 2, 16);
                var102 = 24;
            } else {
                this.field2316 = new class259(this.field2307, this.field2314, 5126, 3, 16);
                var102 = 28;
            }
            if ((this.field2293 & 0x7) != 0) {
                this.field2320 = new class259(this.field2307, this.field2314, 5126, 3, var102);
                int var106 = var102 + 12;
            }
            long[] var103 = new long[this.field2326.length];
            for (int var104 = 0; var104 < this.field2326.length; var104++) {
                class168 var105 = this.field2326[var104];
                var103[var104] = var105.field2539;
                var105.method1176(this.field2300, 4);
            }
            class368.method2363(this.field2326, var103, (byte) -117);
            if (this.field2294 != null) {
                this.field2294.method2125((byte) -117);
            }
        } else {
            this.field2294 = null;
        }
        this.field2291 = this.field2308 = (int[][][]) null;
        this.field2296 = (int[][][]) null;
        this.field2303 = (int[][][]) null;
        this.field2290 = (class168[][][]) null;
        this.field2310 = (int[][][]) null;
        this.field2322 = (byte[][]) null;
        this.field2323 = null;
        this.field2318 = (int[][]) null;
        this.field2321 = this.field2324 = this.field2325 = (float[][]) null;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(Las;IIIIZ)V", line = 1154)
    public final void method778(class84 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field2294 != null && arg0 != null) {
            int var7 = arg1 - (this.field2307.field1277 * arg2 >> 8) >> this.field2307.field1171;
            int var8 = arg3 - (this.field2307.field1221 * arg2 >> 8) >> this.field2307.field1171;
            this.field2294.method2119((byte) -14, var7, arg0, var8);
        }
    }
}
