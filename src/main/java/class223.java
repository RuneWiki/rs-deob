import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class223 extends class269 {

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "Lsm;")
    private class249 field3144 = new class249();

    @OriginalMember(owner = "client!ch", name = "A", descriptor = "Lqi;")
    public class458 field3158;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "[[I")
    private int[][] field3138;

    @OriginalMember(owner = "client!ch", name = "x", descriptor = "I")
    public int field3155;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    public int field3142;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public int field3149;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "[[[I")
    private int[][][] field3146;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "[[[Ltt;")
    private class111[][][] field3136;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "[[[I")
    public int[][][] field3148;

    @OriginalMember(owner = "client!ch", name = "B", descriptor = "[[[I")
    public int[][][] field3159;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "[[[I")
    private int[][][] field3140;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "[[[I")
    private int[][][] field3152;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "[[S")
    public short[][] field3141;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "[[B")
    private byte[][] field3143;

    @OriginalMember(owner = "client!ch", name = "C", descriptor = "[[B")
    private byte[][] field3160;

    @OriginalMember(owner = "client!ch", name = "E", descriptor = "[[F")
    private float[][] field3162;

    @OriginalMember(owner = "client!ch", name = "G", descriptor = "[[F")
    private float[][] field3164;

    @OriginalMember(owner = "client!ch", name = "J", descriptor = "[[F")
    private float[][] field3167;

    @OriginalMember(owner = "client!ch", name = "N", descriptor = "Lsq;")
    private class454 field3171;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "Lc;")
    private class461 field3139;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "Llk;")
    public static class425 field3137 = new class425(1);

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "[I")
    private static int[] field3154 = new int[1];

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "[I")
    private static int[] field3151 = new int[1];

    @OriginalMember(owner = "client!ch", name = "z", descriptor = "[I")
    private static int[] field3157 = new int[1];

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "[F")
    private static float[] field3153 = new float[16];

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
    private static int field3145;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
    private int field3147;

    @OriginalMember(owner = "client!ch", name = "y", descriptor = "I")
    private int field3156;

    @OriginalMember(owner = "client!ch", name = "L", descriptor = "I")
    private int field3169;

    @OriginalMember(owner = "client!ch", name = "M", descriptor = "I")
    private int field3170;

    @OriginalMember(owner = "client!ch", name = "F", descriptor = "Luk;")
    private class143 field3163;

    @OriginalMember(owner = "client!ch", name = "I", descriptor = "Luk;")
    public class143 field3166;

    @OriginalMember(owner = "client!ch", name = "K", descriptor = "Luk;")
    public class143 field3168;

    @OriginalMember(owner = "client!ch", name = "O", descriptor = "Luk;")
    public class143 field3172;

    @OriginalMember(owner = "client!ch", name = "H", descriptor = "Lla;")
    private class220 field3165;

    @OriginalMember(owner = "client!ch", name = "D", descriptor = "[Ltt;")
    private class111[] field3161;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "[[[I")
    private int[][][] field3150;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(Lmr;IIIIZ)V")
    public final void method717(class173 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field3139 != null && arg0 != null) {
            int var7 = arg1 - (this.field3158.field6442 * arg2 >> 8) >> this.field3158.field6336;
            int var8 = arg3 - (this.field3158.field6428 * arg2 >> 8) >> this.field3158.field6336;
            this.field3139.method2726(arg0, var7, true, var8);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method715(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        int var18 = arg9.length;
        int[] var19 = new int[var18 * 3];
        int[] var20 = new int[var18 * 3];
        int[] var21 = new int[var18 * 3];
        int[] var22 = new int[var18 * 3];
        int[] var23 = new int[var18 * 3];
        int[] var24 = new int[var18 * 3];
        int[] var25 = arg3 == null ? null : new int[var18 * 3];
        int[] var26 = arg5 == null ? null : new int[var18 * 3];
        int var27 = 0;
        for (int var28 = 0; var28 < var18; var28++) {
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
            var27++;
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
            var27++;
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
            var27++;
        }
        this.method708(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method708(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg5 != null && this.field3150 == null) {
            this.field3150 = new int[this.field3729][this.field3728][];
        }
        if (arg3 != null && this.field3146 == null) {
            this.field3146 = new int[this.field3729][this.field3728][];
        }
        this.field3148[arg0][arg1] = arg2;
        this.field3159[arg0][arg1] = arg4;
        this.field3140[arg0][arg1] = arg6;
        this.field3152[arg0][arg1] = arg7;
        if (this.field3150 != null) {
            this.field3150[arg0][arg1] = arg5;
        }
        if (this.field3146 != null) {
            this.field3146[arg0][arg1] = arg3;
        }
        class111[] var15 = this.field3136[arg0][arg1] = new class111[arg6.length];
        for (int var16 = 0; var16 < arg6.length; var16++) {
            long var17 = (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) (arg9[var16] << 14) | (long) arg8[var16];
            class180 var19;
            for (var19 = this.field3171.method2614(var17, 88); var19 != null; var19 = this.field3171.method2616(false)) {
                class111 var20 = (class111) var19;
                if (arg8[var16] == var20.field1564 && (float) arg9[var16] == var20.field1562 && var20.field1569 == arg10 && var20.field1567 == arg11 && var20.field1561 == arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class111(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field3171.method2620(var17, var15[var16], false);
            } else {
                var15[var16] = (class111) var19;
            }
        }
        if (arg13) {
            this.field3143[arg0][arg1] = (byte) (this.field3143[arg0][arg1] | 0x1);
        }
        if (arg6.length > this.field3169) {
            this.field3169 = arg6.length;
        }
        this.field3170 += arg6.length;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)V")
    public final void method704(int arg0, int arg1, int arg2) {
        if ((this.field3160[arg0][arg1] & 0xFF) < arg2) {
            this.field3160[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILmr;)Lmr;")
    public final class173 method702(int arg0, int arg1, class173 arg2) {
        if ((this.field3143[arg0][arg1] & 0x1) == 0) {
            return null;
        }
        int var4 = this.field3149 >> this.field3158.field6336;
        class324 var5 = (class324) arg2;
        class324 var6;
        if (var5 != null && var5.method1949(-26403, var4, var4)) {
            var6 = var5;
            var5.method1952(41);
        } else {
            var6 = new class324(this.field3158, var4, var4);
        }
        var6.method1950(var4, 0, var4, 0, (byte) 86);
        this.method1408(var6, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lmr;IIIIZ)V")
    public final void method705(class173 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field3139 != null && arg0 != null) {
            int var7 = arg1 - (this.field3158.field6442 * arg2 >> 8) >> this.field3158.field6336;
            int var8 = arg3 - (this.field3158.field6428 * arg2 >> 8) >> this.field3158.field6336;
            this.field3139.method2727(var7, arg0, var8, -19505);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lia;II)V")
    private final void method1408(class324 arg0, int arg1, int arg2) {
        int[] var4 = this.field3148[arg1][arg2];
        int[] var5 = this.field3159[arg1][arg2];
        int var6 = var4.length;
        if (field3157.length < var6) {
            field3157 = new int[var6];
            field3154 = new int[var6];
        }
        for (int var7 = 0; var7 < var6; var7++) {
            field3157[var7] = (var4[var7] & 0xFF) >> this.field3158.field6336;
            field3154[var7] = (var5[var7] & 0xFF) >> this.field3158.field6336;
        }
        int var8 = 0;
        while (var8 < var6) {
            int var9 = field3157[var8];
            int var10 = field3154[var8++];
            int var11 = field3157[var8];
            int var12 = field3154[var8++];
            int var13 = field3157[var8];
            int var14 = field3154[var8++];
            if ((var9 - var11) * (var12 - var14) - (var12 - var10) * (var13 - var11) > 0) {
                arg0.method1951(var13, var9, var11, 3482, var14, var12, var10);
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)I")
    public final int method701(int arg0, int arg1) {
        int var3 = arg0 >> this.field3142;
        int var4 = arg1 >> this.field3142;
        if (var3 < 0 || var4 < 0 || var3 > this.field3729 - 1 || var4 > this.field3728 - 1) {
            return 0;
        }
        int var5 = arg0 & this.field3149 - 1;
        int var6 = arg1 & this.field3149 - 1;
        int var7 = (this.field3149 - var5) * this.field3138[var3][var4] + this.field3138[var3 + 1][var4] * var5 >> this.field3142;
        int var8 = (this.field3149 - var5) * this.field3138[var3][var4 + 1] + this.field3138[var3 + 1][var4 + 1] * var5 >> this.field3142;
        return (this.field3149 - var6) * var7 + var6 * var8 >> this.field3142;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)I")
    public final int method710(int arg0, int arg1) {
        return this.field3138[arg0][arg1];
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(Lmr;IIIIZ)Z")
    public final boolean method700(class173 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field3139 == null || arg0 == null) {
            return false;
        } else {
            int var7 = arg1 - (this.field3158.field6442 * arg2 >> 8) >> 3;
            int var8 = arg3 - (this.field3158.field6428 * arg2 >> 8) >> 3;
            return this.field3139.method2728(var8, var7, -1, arg0);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lrc;[I)V")
    public final void method713(class488 arg0, int[] arg1) {
        this.field3144.method1553((byte) -110, new class322(this.field3158, this, arg0, arg1));
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Lqi;IIII[[I[[II)V")
    public class223(class458 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field3158 = arg0;
        this.field3138 = arg5;
        this.field3155 = arg2;
        while (arg7 > 1) {
            this.field3142++;
            arg7 >>= 0x1;
        }
        this.field3149 = 0x1 << this.field3142;
        this.field3146 = new int[arg3][arg4][];
        this.field3136 = new class111[arg3][arg4][];
        this.field3148 = new int[arg3][arg4][];
        this.field3159 = new int[arg3][arg4][];
        this.field3140 = new int[arg3][arg4][];
        this.field3152 = new int[arg3][arg4][];
        this.field3141 = new short[arg3 * arg4][];
        this.field3143 = new byte[arg3][arg4];
        this.field3160 = new byte[arg3 + 1][arg4 + 1];
        this.field3162 = new float[this.field3729 + 1][this.field3728 + 1];
        this.field3164 = new float[this.field3729 + 1][this.field3728 + 1];
        this.field3167 = new float[this.field3729 + 1][this.field3728 + 1];
        for (int var9 = 1; var9 < this.field3728; var9++) {
            for (int var10 = 1; var10 < this.field3729; var10++) {
                int var11 = arg6[var10 + 1][var9] - arg6[var10 - 1][var9];
                int var12 = arg6[var10][var9 + 1] - arg6[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var11 * var11 + 65536)));
                this.field3162[var10][var9] = (float) var11 * var13;
                this.field3164[var10][var9] = var13 * -256.0F;
                this.field3167[var10][var9] = (float) var12 * var13;
            }
        }
        this.field3171 = new class454(128);
        if ((this.field3155 & 0x10) != 0) {
            this.field3139 = new class461(this.field3158, this);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method714(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        if (this.field3170 <= 0) {
            return;
        }
        opengl var9 = this.field3158.field6330;
        this.field3158.method2668();
        this.field3158.method2694(false);
        this.field3158.method2652(false);
        this.field3158.method2663(false);
        this.field3158.method2651(false);
        this.field3158.method2653(0);
        this.field3158.method2647(-2);
        this.field3158.method2692((class179) null);
        field3153[0] = (float) arg2 / ((float) this.field3149 * 128.0F * (float) this.field3158.field6335);
        field3153[1] = 0.0F;
        field3153[2] = 0.0F;
        field3153[3] = 0.0F;
        field3153[4] = 0.0F;
        field3153[5] = (float) arg2 / ((float) this.field3149 * 128.0F * (float) this.field3158.field6346);
        field3153[6] = 0.0F;
        field3153[7] = 0.0F;
        field3153[8] = 0.0F;
        field3153[9] = 0.0F;
        field3153[10] = 0.0F;
        field3153[11] = 0.0F;
        field3153[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field3158.field6335;
        field3153[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field3158.field6346;
        field3153[14] = 0.0F;
        field3153[15] = 1.0F;
        var9.glMatrixMode(5889);
        var9.glLoadMatrixf(field3153, 0);
        field3153[0] = 1.0F;
        field3153[1] = 0.0F;
        field3153[2] = 0.0F;
        field3153[3] = 0.0F;
        field3153[4] = 0.0F;
        field3153[5] = 0.0F;
        field3153[6] = 1.0F;
        field3153[7] = 0.0F;
        field3153[8] = 0.0F;
        field3153[9] = 1.0F;
        field3153[10] = 0.0F;
        field3153[11] = 0.0F;
        field3153[12] = 0.0F;
        field3153[13] = 0.0F;
        field3153[14] = 0.0F;
        field3153[15] = 1.0F;
        var9.glMatrixMode(5888);
        var9.glLoadMatrixf(field3153, 0);
        if ((this.field3155 & 0x7) == 0) {
            this.field3158.method2652(false);
        } else {
            this.field3158.method2652(true);
            this.field3158.method2640();
        }
        this.field3158.method2658(this.field3172, this.field3166, this.field3163, this.field3168);
        if (field3137.field5886.length < this.field3147 * 2) {
            field3137 = new class425(this.field3147 * 2);
        } else {
            field3137.field5830 = 0;
        }
        int var10 = 0;
        if (this.field3158.field6400) {
            for (int var11 = arg4; var11 < arg6; var11++) {
                int var12 = this.field3729 * var11 + arg3;
                for (int var13 = arg3; var13 < arg5; var13++) {
                    if (arg7[var13 - arg3][var11 - arg4]) {
                        short[] var14 = this.field3141[var12];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field3137.method2462(var14[var15] & 0xFFFF, (byte) -123);
                                var10++;
                            }
                        }
                    }
                    var12++;
                }
            }
        } else {
            for (int var16 = arg4; var16 < arg6; var16++) {
                int var17 = this.field3729 * var16 + arg3;
                for (int var18 = arg3; var18 < arg5; var18++) {
                    if (arg7[var18 - arg3][var16 - arg4]) {
                        short[] var19 = this.field3141[var17];
                        if (var19 != null) {
                            for (int var20 = 0; var20 < var19.length; var20++) {
                                field3137.method2506(var19[var20] & 0xFFFF, (byte) 99);
                                var10++;
                            }
                        }
                    }
                    var17++;
                }
            }
        }
        if (var10 > 0) {
            class57 var21 = new class57(this.field3158, 5123, field3137.field5886, field3137.field5830);
            this.field3158.method2673(var21, 4, 0, var10);
        }
    }

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "(II)V")
    public final void method698(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III[[ZZ)V")
    public final void method703(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        if (this.field3161 == null) {
            return;
        }
        float var6 = this.field3158.field6427;
        float var7 = this.field3158.field6448;
        int var8 = arg2 + arg2 + 1;
        int var9 = var8 * var8;
        if (field3151.length < var9) {
            field3151 = new int[var9];
        }
        if (field3137.field5886.length < this.field3147 * 2) {
            field3137 = new class425(this.field3147 * 2);
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
        if (var14 > this.field3729 - 1) {
            var14 = this.field3729 - 1;
        }
        int var15 = arg1 + arg2;
        if (var15 > this.field3728 - 1) {
            var15 = this.field3728 - 1;
        }
        field3145 = 0;
        for (int var16 = var10; var16 <= var14; var16++) {
            boolean[] var17 = arg3[var16 - var11];
            for (int var18 = var12; var18 <= var15; var18++) {
                if (var17[var18 - var13]) {
                    field3151[field3145++] = this.field3729 * var18 + var16;
                }
            }
        }
        this.field3158.method2642();
        this.field3158.method2652((this.field3155 & 0x7) != 0);
        for (int var19 = 0; var19 < this.field3161.length; var19++) {
            this.field3161[var19].method692(field3145, field3151, (byte) -87);
        }
        if (!this.field3144.method1549(2)) {
            int var20 = this.field3158.field6460;
            int var21 = this.field3158.field6449;
            this.field3158.method1138(0, var21);
            this.field3158.method1144(var7, var6 - 4.0F);
            this.field3158.method2652(false);
            this.field3158.method2651(false);
            this.field3158.method2653(130);
            this.field3158.method2647(-2);
            this.field3158.method2692(this.field3158.field6379);
            this.field3158.method2702(8448, 7681);
            this.field3158.method2670(0, 34166, 770);
            this.field3158.method2709(0, 34167, 770);
            for (class180 var22 = this.field3144.method1544(-96); var22 != null; var22 = this.field3144.method1546((byte) -42)) {
                class322 var23 = (class322) var22;
                var23.method1942(arg1, arg2, arg3, arg0, (byte) -75);
            }
            this.field3158.method2670(0, 5890, 768);
            this.field3158.method2709(0, 5890, 770);
            this.field3158.method2692((class179) null);
            this.field3158.method1138(var20, var21);
        }
        if (this.field3139 != null) {
            this.field3158.method1144(var7, var6 - 8.0F);
            this.field3158.method2642();
            this.field3158.method2658(this.field3172, (class143) null, (class143) null, this.field3168);
            this.field3139.method2724(arg2, arg4, (byte) 51, arg3, arg1, arg0);
        }
        this.field3158.method1144(var7, var6);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "()V")
    public final void method707() {
        if (this.field3170 > 0) {
            byte[][] var1 = new byte[this.field3729 + 1][this.field3728 + 1];
            for (int var2 = 1; var2 < this.field3729; var2++) {
                for (int var3 = 1; var3 < this.field3728; var3++) {
                    var1[var2][var3] = (byte) ((this.field3160[var2][var3] >> 1) + (this.field3160[var2][var3 + 1] >> 3) + (this.field3160[var2][var3 - 1] >> 2) + (this.field3160[var2 - 1][var3] >> 2) + (this.field3160[var2 + 1][var3] >> 3));
                }
            }
            this.field3161 = new class111[this.field3171.method2621(-1)];
            this.field3171.method2618(this.field3161, -1);
            for (int var4 = 0; var4 < this.field3161.length; var4++) {
                this.field3161[var4].method693(this.field3170, -25645);
            }
            int var5 = 24;
            if (this.field3150 != null) {
                var5 += 4;
            }
            if ((this.field3155 & 0x7) != 0) {
                var5 += 12;
            }
            ByteBuffer var6 = ByteBuffer.allocateDirect(this.field3170 * var5).order(ByteOrder.nativeOrder());
            class111[] var7 = new class111[this.field3170];
            class454 var8 = new class454(class166.method1019(-20703, this.field3170));
            class111[] var9 = new class111[this.field3169];
            for (int var10 = 0; var10 < this.field3729; var10++) {
                for (int var11 = 0; var11 < this.field3728; var11++) {
                    if (this.field3140[var10][var11] != null) {
                        class111[] var12 = this.field3136[var10][var11];
                        int[] var13 = this.field3148[var10][var11];
                        int[] var14 = this.field3159[var10][var11];
                        int[] var15 = this.field3152[var10][var11];
                        int[] var16 = this.field3140[var10][var11];
                        int[] var17 = this.field3146 == null ? null : this.field3146[var10][var11];
                        int[] var18 = this.field3150 == null ? null : this.field3150[var10][var11];
                        if (var15 == null) {
                            var15 = var16;
                        }
                        float var19 = this.field3162[var10][var11];
                        float var20 = this.field3164[var10][var11];
                        float var21 = this.field3167[var10][var11];
                        float var22 = this.field3162[var10][var11 + 1];
                        float var23 = this.field3164[var10][var11 + 1];
                        float var24 = this.field3167[var10][var11 + 1];
                        float var25 = this.field3162[var10 + 1][var11 + 1];
                        float var26 = this.field3164[var10 + 1][var11 + 1];
                        float var27 = this.field3167[var10 + 1][var11 + 1];
                        float var28 = this.field3162[var10 + 1][var11];
                        float var29 = this.field3164[var10 + 1][var11];
                        float var30 = this.field3167[var10 + 1][var11];
                        int var31 = var1[var10][var11] & 0xFF;
                        int var32 = var1[var10][var11 + 1] & 0xFF;
                        int var33 = var1[var10 + 1][var11 + 1] & 0xFF;
                        int var34 = var1[var10 + 1][var11] & 0xFF;
                        int var35 = 0;
                        label314: for (int var36 = 0; var36 < var16.length; var36++) {
                            class111 var37 = var12[var36];
                            for (int var38 = 0; var38 < var35; var38++) {
                                if (var9[var38] == var37) {
                                    continue label314;
                                }
                            }
                            var9[var35++] = var37;
                        }
                        short[] var39 = this.field3141[this.field3729 * var11 + var10] = new short[var16.length];
                        for (int var40 = 0; var40 < var16.length; var40++) {
                            int var41 = (var10 << this.field3142) + var13[var40];
                            int var42 = (var11 << this.field3142) + var14[var40];
                            int var43 = var16[var40];
                            int var44 = var15[var40];
                            int var45 = var17 == null ? 0 : var17[var40];
                            long var46 = (long) var44 << 48 | (long) var43 << 32 | (long) (var41 << 16) | (long) var42;
                            int var48 = var13[var40];
                            int var49 = var14[var40];
                            byte var50 = 74;
                            int var51 = 0;
                            float var52 = 1.0F;
                            float var53;
                            float var54;
                            float var55;
                            int var56;
                            if (var48 == 0 && var49 == 0) {
                                var53 = var19;
                                var54 = var20;
                                var55 = var21;
                                var56 = var50 - var31;
                            } else if (var48 == 0 && this.field3149 == var49) {
                                var53 = var22;
                                var54 = var23;
                                var55 = var24;
                                var56 = var50 - var32;
                            } else if (this.field3149 == var48 && this.field3149 == var49) {
                                var53 = var25;
                                var54 = var26;
                                var55 = var27;
                                var56 = var50 - var33;
                            } else if (this.field3149 == var48 && var49 == 0) {
                                var53 = var28;
                                var54 = var29;
                                var55 = var30;
                                var56 = var50 - var34;
                            } else {
                                float var57 = (float) var48 / (float) this.field3149;
                                float var58 = (float) var49 / (float) this.field3149;
                                float var59 = (var28 - var19) * var57 + var19;
                                float var60 = (var29 - var20) * var57 + var20;
                                float var61 = (var30 - var21) * var57 + var21;
                                float var62 = (var25 - var22) * var57 + var22;
                                float var63 = (var26 - var23) * var57 + var23;
                                float var64 = (var27 - var24) * var57 + var24;
                                var53 = (var62 - var59) * var58 + var59;
                                var54 = (var63 - var60) * var58 + var60;
                                var55 = (var64 - var61) * var58 + var61;
                                int var65 = ((var34 - var31) * var48 >> this.field3142) + var31;
                                int var66 = ((var33 - var32) * var48 >> this.field3142) + var32;
                                var56 = var50 - (((var66 - var65) * var49 >> this.field3142) + var65);
                            }
                            if (var43 != -1) {
                                int var67 = (var43 & 0x7F) * var56 >> 7;
                                if (var67 < 2) {
                                    var67 = 2;
                                } else if (var67 > 126) {
                                    var67 = 126;
                                }
                                var51 = class479.field6783[var43 & 0xFF80 | var67];
                                if ((this.field3155 & 0x7) == 0) {
                                    float var68 = this.field3158.field6416[2] * var55 + this.field3158.field6416[0] * var53 + this.field3158.field6416[1] * var54;
                                    var52 = this.field3158.field6422 + var68 * (var68 > 0.0F ? this.field3158.field6408 : this.field3158.field6381);
                                }
                            }
                            class180 var69 = var8.method2614(var46, -105);
                            int var80;
                            if (var69 == null) {
                                int var71;
                                if (var43 == var44) {
                                    var71 = var51;
                                } else {
                                    int var70 = (var44 & 0x7F) * var56 >> 7;
                                    if (var70 < 2) {
                                        var70 = 2;
                                    } else if (var70 > 126) {
                                        var70 = 126;
                                    }
                                    var71 = class479.field6783[var44 & 0xFF80 | var70];
                                    if ((this.field3155 & 0x7) == 0) {
                                        float var72 = this.field3158.field6416[2] * var55 + this.field3158.field6416[0] * var53 + this.field3158.field6416[1] * var54;
                                        float var73 = this.field3158.field6422 + var52 * (var52 > 0.0F ? this.field3158.field6408 : this.field3158.field6381);
                                        int var74 = var71 >> 16 & 0xFF;
                                        int var75 = var71 >> 8 & 0xFF;
                                        int var76 = var71 & 0xFF;
                                        int var77 = (int) ((float) var74 * var73);
                                        if (var77 < 0) {
                                            var77 = 0;
                                        } else if (var77 > 255) {
                                            var77 = 255;
                                        }
                                        int var78 = (int) ((float) var75 * var73);
                                        if (var78 < 0) {
                                            var78 = 0;
                                        } else if (var78 > 255) {
                                            var78 = 255;
                                        }
                                        int var79 = (int) ((float) var76 * var73);
                                        if (var79 < 0) {
                                            var79 = 0;
                                        } else if (var79 > 255) {
                                            var79 = 255;
                                        }
                                        var71 = var77 << 16 | var78 << 8 | var79;
                                    }
                                }
                                var6.putFloat((float) var41);
                                var6.putFloat((float) (this.method701(var41, var42) + var45));
                                var6.putFloat((float) var42);
                                var6.put((byte) (var71 >> 16));
                                var6.put((byte) (var71 >> 8));
                                var6.put((byte) var71);
                                var6.put((byte) -1);
                                var6.putFloat((float) var41);
                                var6.putFloat((float) var42);
                                if (this.field3150 != null) {
                                    var6.putFloat(var18 == null ? 0.0F : (float) var18[var40]);
                                }
                                if ((this.field3155 & 0x7) != 0) {
                                    var6.putFloat(var53);
                                    var6.putFloat(var54);
                                    var6.putFloat(var55);
                                }
                                var80 = this.field3156++;
                                var39[var40] = (short) var80;
                                if (var43 != -1) {
                                    var7[var80] = var12[var40];
                                }
                                var8.method2620(var46, new class476(var39[var40]), false);
                            } else {
                                var39[var40] = ((class476) var69).field6734;
                                var80 = var39[var40] & 0xFFFF;
                                if (var43 != -1 && var12[var40].field2608 < var7[var80].field2608) {
                                    var7[var80] = var12[var40];
                                }
                            }
                            for (int var81 = 0; var81 < var35; var81++) {
                                var9[var81].method689(var51, 98, var56, var80, var52);
                            }
                            this.field3147++;
                        }
                    }
                }
            }
            for (int var82 = 0; var82 < this.field3156; var82++) {
                class111 var83 = var7[var82];
                if (var83 != null) {
                    var83.method694(4, var82);
                }
            }
            for (int var84 = 0; var84 < this.field3729; var84++) {
                for (int var85 = 0; var85 < this.field3728; var85++) {
                    short[] var86 = this.field3141[this.field3729 * var85 + var84];
                    if (var86 != null) {
                        int var87 = 0;
                        int var88 = 0;
                        while (var88 < var86.length) {
                            int var89 = var86[var88++] & 0xFFFF;
                            int var90 = var86[var88++] & 0xFFFF;
                            int var91 = var86[var88++] & 0xFFFF;
                            class111 var92 = var7[var89];
                            class111 var93 = var7[var90];
                            class111 var94 = var7[var91];
                            class111 var95 = null;
                            if (var92 != null) {
                                var92.method690(var87, 76, var85, var84);
                                var95 = var92;
                            }
                            if (var93 != null) {
                                var93.method690(var87, 82, var85, var84);
                                if (var95 == null || var93.field2608 < var95.field2608) {
                                    var95 = var93;
                                }
                            }
                            if (var94 != null) {
                                var94.method690(var87, 97, var85, var84);
                                if (var95 == null || var94.field2608 < var95.field2608) {
                                    var95 = var94;
                                }
                            }
                            if (var95 != null) {
                                if (var92 != null) {
                                    var95.method694(4, var89);
                                }
                                if (var93 != null) {
                                    var95.method694(4, var90);
                                }
                                if (var94 != null) {
                                    var95.method694(4, var91);
                                }
                                var95.method690(var87, 73, var85, var84);
                            }
                            var87++;
                        }
                    }
                }
            }
            var6.flip();
            this.field3165 = this.field3158.method2679(var5, var6, false);
            this.field3172 = new class143(this.field3158, this.field3165, 5126, 3, 0);
            this.field3163 = new class143(this.field3158, this.field3165, 5121, 4, 12);
            byte var96;
            if (this.field3150 == null) {
                this.field3168 = new class143(this.field3158, this.field3165, 5126, 2, 16);
                var96 = 24;
            } else {
                this.field3168 = new class143(this.field3158, this.field3165, 5126, 3, 16);
                var96 = 28;
            }
            if ((this.field3155 & 0x7) != 0) {
                this.field3166 = new class143(this.field3158, this.field3165, 5126, 3, var96);
            }
            long[] var97 = new long[this.field3161.length];
            for (int var98 = 0; var98 < this.field3161.length; var98++) {
                class111 var99 = this.field3161[var98];
                var97[var98] = var99.field2608;
                var99.method691(true, this.field3156);
            }
            class105.method669(123, this.field3161, var97);
            if (this.field3139 != null) {
                this.field3139.method2725(90);
            }
        } else {
            this.field3139 = null;
        }
        this.field3148 = this.field3159 = (int[][][]) null;
        this.field3150 = (int[][][]) null;
        this.field3152 = (int[][][]) null;
        this.field3146 = (int[][][]) null;
        this.field3136 = (class111[][][]) null;
        this.field3140 = (int[][][]) null;
        this.field3160 = (byte[][]) null;
        this.field3171 = null;
        this.field3162 = this.field3164 = this.field3167 = (float[][]) null;
    }
}
