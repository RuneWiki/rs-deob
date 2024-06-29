import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class238 extends class177 {

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "Lld;")
    private class105 field3147 = new class105();

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "Lbf;")
    public class344 field3139;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "[[I")
    private int[][] field3134;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    public int field3138;

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "I")
    public int field3146;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "I")
    public int field3143;

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "[[[I")
    private int[][][] field3145;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "[[[Lt;")
    private class436[][][] field3144;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "[[[I")
    public int[][][] field3141;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "[[[I")
    public int[][][] field3140;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "[[[I")
    private int[][][] field3133;

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "[[[I")
    private int[][][] field3149;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "[[S")
    public short[][] field3130;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "[[B")
    private byte[][] field3142;

    @OriginalMember(owner = "client!ah", name = "R", descriptor = "[[B")
    private byte[][] field3164;

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "[[F")
    private float[][] field3152;

    @OriginalMember(owner = "client!ah", name = "O", descriptor = "[[F")
    private float[][] field3161;

    @OriginalMember(owner = "client!ah", name = "G", descriptor = "[[F")
    private float[][] field3153;

    @OriginalMember(owner = "client!ah", name = "L", descriptor = "Lad;")
    private class268 field3158;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "Lic;")
    private class454 field3137;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "Lbt;")
    public static class32 field3135 = new class32(1);

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "[I")
    private static int[] field3150 = new int[1];

    @OriginalMember(owner = "client!ah", name = "Q", descriptor = "[F")
    private static float[] field3163 = new float[16];

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "[I")
    private static int[] field3151 = new int[1];

    @OriginalMember(owner = "client!ah", name = "T", descriptor = "[I")
    private static int[] field3166 = new int[1];

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    private int field3131;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    private int field3132;

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "I")
    private static int field3148;

    @OriginalMember(owner = "client!ah", name = "H", descriptor = "I")
    private int field3154;

    @OriginalMember(owner = "client!ah", name = "I", descriptor = "I")
    private int field3155;

    @OriginalMember(owner = "client!ah", name = "J", descriptor = "Lkj;")
    public class366 field3156;

    @OriginalMember(owner = "client!ah", name = "M", descriptor = "Lkj;")
    public class366 field3159;

    @OriginalMember(owner = "client!ah", name = "N", descriptor = "Lkj;")
    private class366 field3160;

    @OriginalMember(owner = "client!ah", name = "S", descriptor = "Lkj;")
    public class366 field3165;

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "Lfg;")
    private class74 field3157;

    @OriginalMember(owner = "client!ah", name = "P", descriptor = "[Lt;")
    private class436[] field3162;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "[[[I")
    private int[][][] field3136;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method382(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
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
        this.method381(arg0, arg1, var19, var25, var20, var26, var21, var22, var23, var24, arg13, arg14, arg15, arg16);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public final void method381(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (arg5 != null && this.field3136 == null) {
            this.field3136 = new int[this.field2410][this.field2409][];
        }
        if (arg3 != null && this.field3145 == null) {
            this.field3145 = new int[this.field2410][this.field2409][];
        }
        this.field3141[arg0][arg1] = arg2;
        this.field3140[arg0][arg1] = arg4;
        this.field3133[arg0][arg1] = arg6;
        this.field3149[arg0][arg1] = arg7;
        if (this.field3136 != null) {
            this.field3136[arg0][arg1] = arg5;
        }
        if (this.field3145 != null) {
            this.field3145[arg0][arg1] = arg3;
        }
        class436[] var15 = this.field3144[arg0][arg1] = new class436[arg6.length];
        for (int var16 = 0; var16 < arg6.length; var16++) {
            long var17 = (long) arg12 << 48 | (long) arg11 << 42 | (long) arg10 << 28 | (long) (arg9[var16] << 14) | (long) arg8[var16];
            class445 var19;
            for (var19 = this.field3158.method1528(var17, 81); var19 != null; var19 = this.field3158.method1520((byte) 53)) {
                class436 var20 = (class436) var19;
                if (arg8[var16] == var20.field5916 && (float) arg9[var16] == var20.field5920 && var20.field5919 == arg10 && var20.field5918 == arg11 && var20.field5924 == arg12) {
                    break;
                }
            }
            if (var19 == null) {
                var15[var16] = new class436(this, arg8[var16], arg9[var16], arg10, arg11, arg12);
                this.field3158.method1525((byte) 19, var15[var16], var17);
            } else {
                var15[var16] = (class436) var19;
            }
        }
        if (arg13) {
            this.field3142[arg0][arg1] = (byte) (this.field3142[arg0][arg1] | 0x1);
        }
        if (arg6.length > this.field3155) {
            this.field3155 = arg6.length;
        }
        this.field3154 += arg6.length;
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(Lkb;IIIIZ)Z")
    public final boolean method373(class449 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field3137 == null || arg0 == null) {
            return false;
        } else {
            int var7 = arg1 - (this.field3139.field4651 * arg2 >> 8) >> 3;
            int var8 = arg3 - (this.field3139.field4669 * arg2 >> 8) >> 3;
            return this.field3137.method2668(var8, -1, arg0, var7);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)I")
    public final int method371(int arg0, int arg1) {
        return this.field3134[arg0][arg1];
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(Lkb;IIIIZ)V")
    public final void method372(class449 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field3137 != null && arg0 != null) {
            int var7 = arg1 - (this.field3139.field4651 * arg2 >> 8) >> this.field3139.field4623;
            int var8 = arg3 - (this.field3139.field4669 * arg2 >> 8) >> this.field3139.field4623;
            this.field3137.method2665(arg0, var8, var7, (byte) -96);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(III[[ZZ)V")
    public final void method383(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        if (this.field3162 == null) {
            return;
        }
        float var6 = this.field3139.field4725;
        float var7 = this.field3139.field4686;
        int var8 = arg2 + arg2 + 1;
        int var9 = var8 * var8;
        if (field3151.length < var9) {
            field3151 = new int[var9];
        }
        if (field3135.field472.length < this.field3132 * 2) {
            field3135 = new class32(this.field3132 * 2);
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
        if (var14 > this.field2410 - 1) {
            var14 = this.field2410 - 1;
        }
        int var15 = arg1 + arg2;
        if (var15 > this.field2409 - 1) {
            var15 = this.field2409 - 1;
        }
        field3148 = 0;
        for (int var16 = var10; var16 <= var14; var16++) {
            boolean[] var17 = arg3[var16 - var11];
            for (int var18 = var12; var18 <= var15; var18++) {
                if (var17[var18 - var13]) {
                    field3151[field3148++] = this.field2410 * var18 + var16;
                }
            }
        }
        this.field3139.method2114();
        this.field3139.method1961((this.field3138 & 0x7) != 0);
        for (int var19 = 0; var19 < this.field3162.length; var19++) {
            this.field3162[var19].method2574(field3151, false, field3148);
        }
        if (!this.field3147.method651((byte) -119)) {
            int var20 = this.field3139.field4723;
            int var21 = this.field3139.field4673;
            this.field3139.method2108(0, var21);
            this.field3139.method1997(var7, var6 - 4.0F);
            this.field3139.method1961(false);
            this.field3139.method2040(false);
            this.field3139.method1957(130);
            this.field3139.method1963(-2);
            this.field3139.method2106(this.field3139.field4674);
            this.field3139.method1994(8448, 7681);
            this.field3139.method1990(0, 34166, 770);
            this.field3139.method2068(0, 34167, 770);
            for (class445 var22 = this.field3147.method652((byte) 37); var22 != null; var22 = this.field3147.method653(59)) {
                class350 var23 = (class350) var22;
                var23.method2168(arg2, arg0, 277784720, arg3, arg1);
            }
            this.field3139.method1990(0, 5890, 768);
            this.field3139.method2068(0, 5890, 770);
            this.field3139.method2106((class386) null);
            this.field3139.method2108(var20, var21);
        }
        if (this.field3137 != null) {
            this.field3139.method1997(var7, var6 - 8.0F);
            this.field3139.method2114();
            this.field3139.method1980(this.field3156, (class366) null, (class366) null, this.field3159);
            this.field3137.method2671(arg3, arg2, arg4, arg1, arg0, 95);
        }
        this.field3139.method1997(var7, var6);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lcs;II)V")
    private final void method1320(class207 arg0, int arg1, int arg2) {
        int[] var4 = this.field3141[arg1][arg2];
        int[] var5 = this.field3140[arg1][arg2];
        int var6 = var4.length;
        if (field3166.length < var6) {
            field3166 = new int[var6];
            field3150 = new int[var6];
        }
        for (int var7 = 0; var7 < var6; var7++) {
            field3166[var7] = (var4[var7] & 0xFF) >> this.field3139.field4623;
            field3150[var7] = (var5[var7] & 0xFF) >> this.field3139.field4623;
        }
        int var8 = 0;
        while (var8 < var6) {
            int var9 = field3166[var8];
            int var10 = field3150[var8++];
            int var11 = field3166[var8];
            int var12 = field3150[var8++];
            int var13 = field3166[var8];
            int var14 = field3150[var8++];
            if ((var9 - var11) * (var12 - var14) - (var12 - var10) * (var13 - var11) > 0) {
                arg0.method1179(var9, 1824314256, var12, var13, var14, var10, var11);
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(II)I")
    public final int method368(int arg0, int arg1) {
        int var3 = arg0 >> this.field3146;
        int var4 = arg1 >> this.field3146;
        if (var3 < 0 || var4 < 0 || var3 > this.field2410 - 1 || var4 > this.field2409 - 1) {
            return 0;
        }
        int var5 = arg0 & this.field3143 - 1;
        int var6 = arg1 & this.field3143 - 1;
        int var7 = (this.field3143 - var5) * this.field3134[var3][var4] + this.field3134[var3 + 1][var4] * var5 >> this.field3146;
        int var8 = (this.field3143 - var5) * this.field3134[var3][var4 + 1] + this.field3134[var3 + 1][var4 + 1] * var5 >> this.field3146;
        return (this.field3143 - var6) * var7 + var6 * var8 >> this.field3146;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)V")
    public final void method374(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)V")
    public final void method365(int arg0, int arg1, int arg2) {
        if ((this.field3164[arg0][arg1] & 0xFF) < arg2) {
            this.field3164[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "()V")
    public final void method366() {
        if (this.field3154 > 0) {
            byte[][] var1 = new byte[this.field2410 + 1][this.field2409 + 1];
            for (int var2 = 1; var2 < this.field2410; var2++) {
                for (int var3 = 1; var3 < this.field2409; var3++) {
                    var1[var2][var3] = (byte) ((this.field3164[var2][var3] >> 1) + (this.field3164[var2][var3 + 1] >> 3) + (this.field3164[var2][var3 - 1] >> 2) + (this.field3164[var2 - 1][var3] >> 2) + (this.field3164[var2 + 1][var3] >> 3));
                }
            }
            this.field3162 = new class436[this.field3158.method1521((byte) -116)];
            this.field3158.method1522(this.field3162, 0);
            for (int var4 = 0; var4 < this.field3162.length; var4++) {
                this.field3162[var4].method2570(this.field3154, (byte) -103);
            }
            int var5 = 24;
            if (this.field3136 != null) {
                var5 += 4;
            }
            if ((this.field3138 & 0x7) != 0) {
                var5 += 12;
            }
            ByteBuffer var6 = ByteBuffer.allocateDirect(this.field3154 * var5).order(ByteOrder.nativeOrder());
            class436[] var7 = new class436[this.field3154];
            class268 var8 = new class268(class363.method2210(this.field3154, (byte) 34));
            class436[] var9 = new class436[this.field3155];
            for (int var10 = 0; var10 < this.field2410; var10++) {
                for (int var11 = 0; var11 < this.field2409; var11++) {
                    if (this.field3133[var10][var11] != null) {
                        class436[] var12 = this.field3144[var10][var11];
                        int[] var13 = this.field3141[var10][var11];
                        int[] var14 = this.field3140[var10][var11];
                        int[] var15 = this.field3149[var10][var11];
                        int[] var16 = this.field3133[var10][var11];
                        int[] var17 = this.field3145 == null ? null : this.field3145[var10][var11];
                        int[] var18 = this.field3136 == null ? null : this.field3136[var10][var11];
                        if (var15 == null) {
                            var15 = var16;
                        }
                        float var19 = this.field3152[var10][var11];
                        float var20 = this.field3161[var10][var11];
                        float var21 = this.field3153[var10][var11];
                        float var22 = this.field3152[var10][var11 + 1];
                        float var23 = this.field3161[var10][var11 + 1];
                        float var24 = this.field3153[var10][var11 + 1];
                        float var25 = this.field3152[var10 + 1][var11 + 1];
                        float var26 = this.field3161[var10 + 1][var11 + 1];
                        float var27 = this.field3153[var10 + 1][var11 + 1];
                        float var28 = this.field3152[var10 + 1][var11];
                        float var29 = this.field3161[var10 + 1][var11];
                        float var30 = this.field3153[var10 + 1][var11];
                        int var31 = var1[var10][var11] & 0xFF;
                        int var32 = var1[var10][var11 + 1] & 0xFF;
                        int var33 = var1[var10 + 1][var11 + 1] & 0xFF;
                        int var34 = var1[var10 + 1][var11] & 0xFF;
                        int var35 = 0;
                        label314: for (int var36 = 0; var36 < var16.length; var36++) {
                            class436 var37 = var12[var36];
                            for (int var38 = 0; var38 < var35; var38++) {
                                if (var9[var38] == var37) {
                                    continue label314;
                                }
                            }
                            var9[var35++] = var37;
                        }
                        short[] var39 = this.field3130[this.field2410 * var11 + var10] = new short[var16.length];
                        for (int var40 = 0; var40 < var16.length; var40++) {
                            int var41 = (var10 << this.field3146) + var13[var40];
                            int var42 = (var11 << this.field3146) + var14[var40];
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
                            } else if (var48 == 0 && this.field3143 == var49) {
                                var53 = var22;
                                var54 = var23;
                                var55 = var24;
                                var56 = var50 - var32;
                            } else if (this.field3143 == var48 && this.field3143 == var49) {
                                var53 = var25;
                                var54 = var26;
                                var55 = var27;
                                var56 = var50 - var33;
                            } else if (this.field3143 == var48 && var49 == 0) {
                                var53 = var28;
                                var54 = var29;
                                var55 = var30;
                                var56 = var50 - var34;
                            } else {
                                float var57 = (float) var48 / (float) this.field3143;
                                float var58 = (float) var49 / (float) this.field3143;
                                float var59 = (var28 - var19) * var57 + var19;
                                float var60 = (var29 - var20) * var57 + var20;
                                float var61 = (var30 - var21) * var57 + var21;
                                float var62 = (var25 - var22) * var57 + var22;
                                float var63 = (var26 - var23) * var57 + var23;
                                float var64 = (var27 - var24) * var57 + var24;
                                var53 = (var62 - var59) * var58 + var59;
                                var54 = (var63 - var60) * var58 + var60;
                                var55 = (var64 - var61) * var58 + var61;
                                int var65 = ((var34 - var31) * var48 >> this.field3146) + var31;
                                int var66 = ((var33 - var32) * var48 >> this.field3146) + var32;
                                var56 = var50 - (((var66 - var65) * var49 >> this.field3146) + var65);
                            }
                            if (var43 != -1) {
                                int var67 = (var43 & 0x7F) * var56 >> 7;
                                if (var67 < 2) {
                                    var67 = 2;
                                } else if (var67 > 126) {
                                    var67 = 126;
                                }
                                var51 = class193.field2616[var43 & 0xFF80 | var67];
                                if ((this.field3138 & 0x7) == 0) {
                                    float var68 = this.field3139.field4637[2] * var55 + this.field3139.field4637[0] * var53 + this.field3139.field4637[1] * var54;
                                    var52 = this.field3139.field4641 + var68 * (var68 > 0.0F ? this.field3139.field4661 : this.field3139.field4701);
                                }
                            }
                            class445 var69 = var8.method1528(var46, 56);
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
                                    var71 = class193.field2616[var44 & 0xFF80 | var70];
                                    if ((this.field3138 & 0x7) == 0) {
                                        float var72 = this.field3139.field4637[2] * var55 + this.field3139.field4637[0] * var53 + this.field3139.field4637[1] * var54;
                                        float var73 = this.field3139.field4641 + var52 * (var52 > 0.0F ? this.field3139.field4661 : this.field3139.field4701);
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
                                var6.putFloat((float) (this.method368(var41, var42) + var45));
                                var6.putFloat((float) var42);
                                var6.put((byte) (var71 >> 16));
                                var6.put((byte) (var71 >> 8));
                                var6.put((byte) var71);
                                var6.put((byte) -1);
                                var6.putFloat((float) var41);
                                var6.putFloat((float) var42);
                                if (this.field3136 != null) {
                                    var6.putFloat(var18 == null ? 0.0F : (float) var18[var40]);
                                }
                                if ((this.field3138 & 0x7) != 0) {
                                    var6.putFloat(var53);
                                    var6.putFloat(var54);
                                    var6.putFloat(var55);
                                }
                                var80 = this.field3131++;
                                var39[var40] = (short) var80;
                                if (var43 != -1) {
                                    var7[var80] = var12[var40];
                                }
                                var8.method1525((byte) 19, new class311(var39[var40]), var46);
                            } else {
                                var39[var40] = ((class311) var69).field4101;
                                var80 = var39[var40] & 0xFFFF;
                                if (var43 != -1 && var12[var40].field6047 < var7[var80].field6047) {
                                    var7[var80] = var12[var40];
                                }
                            }
                            for (int var81 = 0; var81 < var35; var81++) {
                                var9[var81].method2569(var52, var56, var51, var80, 65535);
                            }
                            this.field3132++;
                        }
                    }
                }
            }
            for (int var82 = 0; var82 < this.field3131; var82++) {
                class436 var83 = var7[var82];
                if (var83 != null) {
                    var83.method2573(var82, false);
                }
            }
            for (int var84 = 0; var84 < this.field2410; var84++) {
                for (int var85 = 0; var85 < this.field2409; var85++) {
                    short[] var86 = this.field3130[this.field2410 * var85 + var84];
                    if (var86 != null) {
                        int var87 = 0;
                        int var88 = 0;
                        while (var88 < var86.length) {
                            int var89 = var86[var88++] & 0xFFFF;
                            int var90 = var86[var88++] & 0xFFFF;
                            int var91 = var86[var88++] & 0xFFFF;
                            class436 var92 = var7[var89];
                            class436 var93 = var7[var90];
                            class436 var94 = var7[var91];
                            class436 var95 = null;
                            if (var92 != null) {
                                var92.method2572(var87, 22039, var84, var85);
                                var95 = var92;
                            }
                            if (var93 != null) {
                                var93.method2572(var87, 22039, var84, var85);
                                if (var95 == null || var93.field6047 < var95.field6047) {
                                    var95 = var93;
                                }
                            }
                            if (var94 != null) {
                                var94.method2572(var87, 22039, var84, var85);
                                if (var95 == null || var94.field6047 < var95.field6047) {
                                    var95 = var94;
                                }
                            }
                            if (var95 != null) {
                                if (var92 != null) {
                                    var95.method2573(var89, false);
                                }
                                if (var93 != null) {
                                    var95.method2573(var90, false);
                                }
                                if (var94 != null) {
                                    var95.method2573(var91, false);
                                }
                                var95.method2572(var87, 22039, var84, var85);
                            }
                            var87++;
                        }
                    }
                }
            }
            var6.flip();
            this.field3157 = this.field3139.method2018(var5, var6, false);
            this.field3156 = new class366(this.field3139, this.field3157, 5126, 3, 0);
            this.field3160 = new class366(this.field3139, this.field3157, 5121, 4, 12);
            byte var96;
            if (this.field3136 == null) {
                this.field3159 = new class366(this.field3139, this.field3157, 5126, 2, 16);
                var96 = 24;
            } else {
                this.field3159 = new class366(this.field3139, this.field3157, 5126, 3, 16);
                var96 = 28;
            }
            if ((this.field3138 & 0x7) != 0) {
                this.field3165 = new class366(this.field3139, this.field3157, 5126, 3, var96);
            }
            long[] var97 = new long[this.field3162.length];
            for (int var98 = 0; var98 < this.field3162.length; var98++) {
                class436 var99 = this.field3162[var98];
                var97[var98] = var99.field6047;
                var99.method2571(this.field3131, 91);
            }
            class281.method1586(this.field3162, var97, (byte) -113);
            if (this.field3137 != null) {
                this.field3137.method2664((byte) -27);
            }
        } else {
            this.field3137 = null;
        }
        this.field3141 = this.field3140 = (int[][][]) null;
        this.field3136 = (int[][][]) null;
        this.field3149 = (int[][][]) null;
        this.field3145 = (int[][][]) null;
        this.field3144 = (class436[][][]) null;
        this.field3133 = (int[][][]) null;
        this.field3164 = (byte[][]) null;
        this.field3158 = null;
        this.field3152 = this.field3161 = this.field3153 = (float[][]) null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lof;[I)V")
    public final void method380(class404 arg0, int[] arg1) {
        this.field3147.method641(new class350(this.field3139, this, arg0, arg1), (byte) -93);
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lbf;IIII[[I[[II)V")
    public class238(class344 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field3139 = arg0;
        this.field3134 = arg5;
        this.field3138 = arg2;
        while (arg7 > 1) {
            this.field3146++;
            arg7 >>= 0x1;
        }
        this.field3143 = 0x1 << this.field3146;
        this.field3145 = new int[arg3][arg4][];
        this.field3144 = new class436[arg3][arg4][];
        this.field3141 = new int[arg3][arg4][];
        this.field3140 = new int[arg3][arg4][];
        this.field3133 = new int[arg3][arg4][];
        this.field3149 = new int[arg3][arg4][];
        this.field3130 = new short[arg3 * arg4][];
        this.field3142 = new byte[arg3][arg4];
        this.field3164 = new byte[arg3 + 1][arg4 + 1];
        this.field3152 = new float[this.field2410 + 1][this.field2409 + 1];
        this.field3161 = new float[this.field2410 + 1][this.field2409 + 1];
        this.field3153 = new float[this.field2410 + 1][this.field2409 + 1];
        for (int var9 = 1; var9 < this.field2409; var9++) {
            for (int var10 = 1; var10 < this.field2410; var10++) {
                int var11 = arg6[var10 + 1][var9] - arg6[var10 - 1][var9];
                int var12 = arg6[var10][var9 + 1] - arg6[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var11 * var11 + 65536)));
                this.field3152[var10][var9] = (float) var11 * var13;
                this.field3161[var10][var9] = var13 * -256.0F;
                this.field3153[var10][var9] = (float) var12 * var13;
            }
        }
        this.field3158 = new class268(128);
        if ((this.field3138 & 0x10) != 0) {
            this.field3137 = new class454(this.field3139, this);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IILkb;)Lkb;")
    public final class449 method369(int arg0, int arg1, class449 arg2) {
        if ((this.field3142[arg0][arg1] & 0x1) == 0) {
            return null;
        }
        int var4 = this.field3143 >> this.field3139.field4623;
        class207 var5 = (class207) arg2;
        class207 var6;
        if (var5 != null && var5.method1180(var4, var4, true)) {
            var6 = var5;
            var5.method1181((byte) 105);
        } else {
            var6 = new class207(this.field3139, var4, var4);
        }
        var6.method1177(var4, false, 0, var4, 0);
        this.method1320(var6, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method377(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        if (this.field3154 <= 0) {
            return;
        }
        opengl var9 = this.field3139.field4604;
        this.field3139.method2025();
        this.field3139.method1971(false);
        this.field3139.method1961(false);
        this.field3139.method2035(false);
        this.field3139.method2040(false);
        this.field3139.method1957(0);
        this.field3139.method1963(-2);
        this.field3139.method2106((class386) null);
        field3163[0] = (float) arg2 / ((float) this.field3143 * 128.0F * (float) this.field3139.field4622);
        field3163[1] = 0.0F;
        field3163[2] = 0.0F;
        field3163[3] = 0.0F;
        field3163[4] = 0.0F;
        field3163[5] = (float) arg2 / ((float) this.field3143 * 128.0F * (float) this.field3139.field4628);
        field3163[6] = 0.0F;
        field3163[7] = 0.0F;
        field3163[8] = 0.0F;
        field3163[9] = 0.0F;
        field3163[10] = 0.0F;
        field3163[11] = 0.0F;
        field3163[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field3139.field4622;
        field3163[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field3139.field4628;
        field3163[14] = 0.0F;
        field3163[15] = 1.0F;
        var9.glMatrixMode(5889);
        var9.glLoadMatrixf(field3163, 0);
        field3163[0] = 1.0F;
        field3163[1] = 0.0F;
        field3163[2] = 0.0F;
        field3163[3] = 0.0F;
        field3163[4] = 0.0F;
        field3163[5] = 0.0F;
        field3163[6] = 1.0F;
        field3163[7] = 0.0F;
        field3163[8] = 0.0F;
        field3163[9] = 1.0F;
        field3163[10] = 0.0F;
        field3163[11] = 0.0F;
        field3163[12] = 0.0F;
        field3163[13] = 0.0F;
        field3163[14] = 0.0F;
        field3163[15] = 1.0F;
        var9.glMatrixMode(5888);
        var9.glLoadMatrixf(field3163, 0);
        if ((this.field3138 & 0x7) == 0) {
            this.field3139.method1961(false);
        } else {
            this.field3139.method1961(true);
            this.field3139.method2036();
        }
        this.field3139.method1980(this.field3156, this.field3165, this.field3160, this.field3159);
        if (field3135.field472.length < this.field3132 * 2) {
            field3135 = new class32(this.field3132 * 2);
        } else {
            field3135.field456 = 0;
        }
        int var10 = 0;
        if (this.field3139.field4721) {
            for (int var11 = arg4; var11 < arg6; var11++) {
                int var12 = this.field2410 * var11 + arg3;
                for (int var13 = arg3; var13 < arg5; var13++) {
                    if (arg7[var13 - arg3][var11 - arg4]) {
                        short[] var14 = this.field3130[var12];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field3135.method229(var14[var15] & 0xFFFF, 1309449544);
                                var10++;
                            }
                        }
                    }
                    var12++;
                }
            }
        } else {
            for (int var16 = arg4; var16 < arg6; var16++) {
                int var17 = this.field2410 * var16 + arg3;
                for (int var18 = arg3; var18 < arg5; var18++) {
                    if (arg7[var18 - arg3][var16 - arg4]) {
                        short[] var19 = this.field3130[var17];
                        if (var19 != null) {
                            for (int var20 = 0; var20 < var19.length; var20++) {
                                field3135.method231(107, var19[var20] & 0xFFFF);
                                var10++;
                            }
                        }
                    }
                    var17++;
                }
            }
        }
        if (var10 > 0) {
            class319 var21 = new class319(this.field3139, 5123, field3135.field472, field3135.field456);
            this.field3139.method2033(var21, 4, 0, var10);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lkb;IIIIZ)V")
    public final void method379(class449 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field3137 != null && arg0 != null) {
            int var7 = arg1 - (this.field3139.field4651 * arg2 >> 8) >> this.field3139.field4623;
            int var8 = arg3 - (this.field3139.field4669 * arg2 >> 8) >> this.field3139.field4623;
            this.field3137.method2670(var8, arg0, var7, 22);
        }
    }
}
