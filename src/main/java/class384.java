import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class384 extends class323 {

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "Ljm;")
    private class162 field5275 = new class162();

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "Lmm;")
    public class357 field5277;

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "[[I")
    private int[][] field5292;

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "[[I")
    private int[][] field5295;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
    public int field5278;

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "I")
    public int field5282;

    @OriginalMember(owner = "client!eb", name = "B", descriptor = "I")
    public int field5285;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "[[[I")
    private int[][][] field5274;

    @OriginalMember(owner = "client!eb", name = "C", descriptor = "[[[Lqi;")
    private class209[][][] field5286;

    @OriginalMember(owner = "client!eb", name = "E", descriptor = "[[[I")
    public int[][][] field5288;

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "[[[I")
    public int[][][] field5283;

    @OriginalMember(owner = "client!eb", name = "A", descriptor = "[[[I")
    private int[][][] field5284;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "[[[I")
    private int[][][] field5276;

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "[[S")
    public short[][] field5281;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "[[B")
    private byte[][] field5273;

    @OriginalMember(owner = "client!eb", name = "Z", descriptor = "[[B")
    private byte[][] field5309;

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "[[F")
    private float[][] field5302;

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "[[F")
    private float[][] field5301;

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "[[F")
    private float[][] field5306;

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "Ltn;")
    private class109 field5305;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "Llo;")
    private class421 field5280;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "Lrg;")
    public static class366 field5279 = new class366(1);

    @OriginalMember(owner = "client!eb", name = "F", descriptor = "[I")
    private static int[] field5289 = new int[1];

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "[I")
    private static int[] field5293 = new int[1];

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "[I")
    private static int[] field5304 = new int[1];

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "[F")
    private static float[] field5294 = new float[16];

    @OriginalMember(owner = "client!eb", name = "D", descriptor = "I")
    private int field5287;

    @OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
    private int field5290;

    @OriginalMember(owner = "client!eb", name = "H", descriptor = "I")
    private static int field5291;

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "I")
    private int field5299;

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "I")
    private int field5303;

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "Lq;")
    private class205 field5298;

    @OriginalMember(owner = "client!eb", name = "N", descriptor = "Lvl;")
    public class376 field5297;

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "Lvl;")
    public class376 field5300;

    @OriginalMember(owner = "client!eb", name = "X", descriptor = "Lvl;")
    private class376 field5307;

    @OriginalMember(owner = "client!eb", name = "Y", descriptor = "Lvl;")
    public class376 field5308;

    @OriginalMember(owner = "client!eb", name = "M", descriptor = "[Lqi;")
    private class209[] field5296;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)V", line = 6)
    public final void method337(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(Llb;IIIIZ)Z", line = 13)
    public final boolean method336(class210 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field5280 == null || arg0 == null) {
            return false;
        } else {
            int var7 = arg1 - (this.field5277.field4887 * arg2 >> 8) >> 3;
            int var8 = arg3 - (this.field5277.field4846 * arg2 >> 8) >> 3;
            return this.field5280.method2597(9113, arg0, var8, var7);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V", line = 28)
    public final void method335(int arg0, int arg1, int arg2) {
        if ((this.field5309[arg0][arg1] & 0xFF) < arg2) {
            this.field5309[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III[[ZZ)V", line = 35)
    public final void method338(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        if (this.field5296 == null) {
            return;
        }
        float var6 = this.field5277.field4848;
        float var7 = this.field5277.field4905;
        int var8 = arg2 + arg2 + 1;
        int var9 = var8 * var8;
        if (field5304.length < var9) {
            field5304 = new int[var9];
        }
        if (field5279.field5076.length < this.field5287 * 2) {
            field5279 = new class366(this.field5287 * 2);
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
        if (var14 > this.field4384 - 1) {
            var14 = this.field4384 - 1;
        }
        int var15 = arg1 + arg2;
        if (var15 > this.field4382 - 1) {
            var15 = this.field4382 - 1;
        }
        field5291 = 0;
        for (int var16 = var10; var16 <= var14; var16++) {
            boolean[] var17 = arg3[var16 - var11];
            for (int var18 = var12; var18 <= var15; var18++) {
                if (var17[var18 - var13]) {
                    field5304[field5291++] = this.field4384 * var18 + var16;
                }
            }
        }
        this.field5277.method2210();
        this.field5277.method2198((this.field5278 & 0x7) != 0);
        for (int var19 = 0; var19 < this.field5296.length; var19++) {
            this.field5296[var19].method1406(16711935, field5291, field5304);
        }
        if (!this.field5275.method1167(-127)) {
            int var20 = this.field5277.field4863;
            int var21 = this.field5277.field4915;
            this.field5277.method176(0, var21);
            this.field5277.method180(var7, var6 - 4.0F);
            this.field5277.method2198(false);
            this.field5277.method2174(false);
            this.field5277.method2195(130);
            this.field5277.method2169(-2);
            this.field5277.method2180(this.field5277.field4880);
            this.field5277.method2212(8448, 7681);
            this.field5277.method2187(0, 34166, 770);
            this.field5277.method2192(0, 34167, 770);
            for (class311 var22 = this.field5275.method1173(0); var22 != null; var22 = this.field5275.method1165(true)) {
                class307 var23 = (class307) var22;
                var23.method1848(30463, arg1, arg3, arg2, arg0);
            }
            this.field5277.method2187(0, 5890, 768);
            this.field5277.method2192(0, 5890, 770);
            this.field5277.method2180((class321) null);
            this.field5277.method176(var20, var21);
        }
        if (this.field5280 != null) {
            this.field5277.method180(var7, var6 - 8.0F);
            this.field5277.method2210();
            this.field5277.method2143(this.field5300, (class376) null, (class376) null, this.field5297);
            this.field5280.method2603(arg2, arg0, arg4, arg1, 5945, arg3);
        }
        this.field5277.method180(var7, var6);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Llb;IIIIZ)V", line = 163)
    public final void method324(class210 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field5280 != null && arg0 != null) {
            int var7 = arg1 - (this.field5277.field4887 * arg2 >> 8) >> this.field5277.field4806;
            int var8 = arg3 - (this.field5277.field4846 * arg2 >> 8) >> this.field5277.field4806;
            this.field5280.method2596(var8, arg0, true, var7);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V", line = 178)
    public final void method326(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11) {
        this.field5274[arg0][arg1] = arg3;
        this.field5288[arg0][arg1] = arg2;
        this.field5283[arg0][arg1] = arg4;
        this.field5284[arg0][arg1] = arg5;
        this.field5276[arg0][arg1] = arg6;
        class209[] var13 = this.field5286[arg0][arg1] = new class209[arg5.length];
        for (int var14 = 0; var14 < arg5.length; var14++) {
            long var15 = (long) arg10 << 48 | (long) arg9 << 32 | (long) (arg7[var14] << 16) | (long) arg8[var14];
            class311 var17 = this.field5305.method837((byte) -72, var15);
            if (var17 == null) {
                var13[var14] = new class209(this, arg7[var14], arg8[var14], arg9, arg10);
                this.field5305.method835(4, var13[var14], var15);
            } else {
                var13[var14] = (class209) var17;
            }
        }
        if (arg11) {
            this.field5273[arg0][arg1] = (byte) (this.field5273[arg0][arg1] | 0x1);
        }
        if (arg5.length > this.field5303) {
            this.field5303 = arg5.length;
        }
        this.field5299 += arg5.length;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lj;II)V", line = 215)
    private final void method2370(class270 arg0, int arg1, int arg2) {
        int[] var4 = this.field5288[arg1][arg2];
        int[] var5 = this.field5283[arg1][arg2];
        int var6 = var4.length;
        if (field5293.length < var6) {
            field5293 = new int[var6];
            field5289 = new int[var6];
        }
        for (int var7 = 0; var7 < var6; var7++) {
            field5293[var7] = (var4[var7] & 0xFF) >> this.field5277.field4806;
            field5289[var7] = (var5[var7] & 0xFF) >> this.field5277.field4806;
        }
        int var8 = 0;
        while (var8 < var6) {
            int var9 = field5293[var8];
            int var10 = field5289[var8++];
            int var11 = field5293[var8];
            int var12 = field5289[var8++];
            int var13 = field5293[var8];
            int var14 = field5289[var8++];
            if ((var9 - var11) * (var12 - var14) - (var12 - var10) * (var13 - var11) > 0) {
                arg0.method1716(var9, true, var10, var11, var13, var12, var14);
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V", line = 264)
    public final void method333(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14) {
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
        this.method326(arg0, arg1, var17, var23, var18, var19, var20, var21, var22, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILlb;)Llb;", line = 330)
    public final class210 method341(int arg0, int arg1, class210 arg2) {
        if ((this.field5273[arg0][arg1] & 0x1) == 0) {
            return null;
        }
        int var4 = this.field5285 >> this.field5277.field4806;
        class270 var5 = (class270) arg2;
        class270 var6;
        if (var5 != null && var5.method1717(var4, var4, -65)) {
            var6 = var5;
            var5.method1715((byte) 97);
        } else {
            var6 = new class270(this.field5277, var4, var4);
        }
        var6.method1718(var4, var4, (byte) -69, 0, 0);
        this.method2370(var6, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "()V", line = 362)
    public final void method325() {
        if (this.field5299 > 0) {
            byte[][] var1 = new byte[this.field4384 + 1][this.field4382 + 1];
            for (int var2 = 1; var2 < this.field4384; var2++) {
                for (int var3 = 1; var3 < this.field4382; var3++) {
                    var1[var2][var3] = (byte) ((this.field5309[var2][var3] >> 1) + (this.field5309[var2][var3 + 1] >> 3) + (this.field5309[var2][var3 - 1] >> 2) + (this.field5309[var2 - 1][var3] >> 2) + (this.field5309[var2 + 1][var3] >> 3));
                }
            }
            this.field5296 = new class209[this.field5305.method844((byte) -86)];
            this.field5305.method832(29264, this.field5296);
            for (int var4 = 0; var4 < this.field5296.length; var4++) {
                this.field5296[var4].method1405(this.field5299, 4);
            }
            int var5 = 24;
            if (this.field5295 != null) {
                var5 += 4;
            }
            if ((this.field5278 & 0x7) != 0) {
                var5 += 12;
            }
            ByteBuffer var6 = ByteBuffer.allocateDirect(this.field5299 * var5).order(ByteOrder.nativeOrder());
            class209[] var7 = new class209[this.field5299];
            class109 var8 = new class109(class268.method1705(this.field5299, false));
            class209[] var9 = new class209[this.field5303];
            for (int var10 = 0; var10 < this.field4384; var10++) {
                for (int var11 = 0; var11 < this.field4382; var11++) {
                    if (this.field5284[var10][var11] != null) {
                        class209[] var12 = this.field5286[var10][var11];
                        int[] var13 = this.field5274[var10][var11];
                        int[] var14 = this.field5288[var10][var11];
                        int[] var15 = this.field5283[var10][var11];
                        int[] var16 = this.field5276[var10][var11];
                        int[] var17 = this.field5284[var10][var11];
                        if (var16 == null) {
                            var16 = var17;
                        }
                        float var18 = this.field5302[var10][var11];
                        float var19 = this.field5301[var10][var11];
                        float var20 = this.field5306[var10][var11];
                        float var21 = this.field5302[var10][var11 + 1];
                        float var22 = this.field5301[var10][var11 + 1];
                        float var23 = this.field5306[var10][var11 + 1];
                        float var24 = this.field5302[var10 + 1][var11 + 1];
                        float var25 = this.field5301[var10 + 1][var11 + 1];
                        float var26 = this.field5306[var10 + 1][var11 + 1];
                        float var27 = this.field5302[var10 + 1][var11];
                        float var28 = this.field5301[var10 + 1][var11];
                        float var29 = this.field5306[var10 + 1][var11];
                        int var30 = var1[var10][var11] & 0xFF;
                        int var31 = var1[var10][var11 + 1] & 0xFF;
                        int var32 = var1[var10 + 1][var11 + 1] & 0xFF;
                        int var33 = var1[var10 + 1][var11] & 0xFF;
                        float var34;
                        float var35;
                        float var36;
                        float var37;
                        if (this.field5295 == null) {
                            var37 = 0.0F;
                            var36 = 0.0F;
                            var35 = 0.0F;
                            var34 = 0.0F;
                        } else {
                            var34 = (float) this.field5295[var10][var11];
                            var35 = (float) this.field5295[var10][var11 + 1];
                            var36 = (float) this.field5295[var10 + 1][var11 + 1];
                            var37 = (float) this.field5295[var10 + 1][var11];
                        }
                        int var38 = 0;
                        label304: for (int var39 = 0; var39 < var17.length; var39++) {
                            class209 var40 = var12[var39];
                            for (int var41 = 0; var41 < var38; var41++) {
                                if (var9[var41] == var40) {
                                    continue label304;
                                }
                            }
                            var9[var38++] = var40;
                        }
                        short[] var42 = this.field5281[this.field4384 * var11 + var10] = new short[var17.length];
                        for (int var43 = 0; var43 < var17.length; var43++) {
                            int var44 = (var10 << this.field5282) + var14[var43];
                            int var45 = (var11 << this.field5282) + var15[var43];
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
                            } else if (var51 == 0 && this.field5285 == var52) {
                                var56 = var21;
                                var57 = var22;
                                var58 = var23;
                                var59 = var35;
                                var60 = var53 - var31;
                            } else if (this.field5285 == var51 && this.field5285 == var52) {
                                var56 = var24;
                                var57 = var25;
                                var58 = var26;
                                var59 = var36;
                                var60 = var53 - var32;
                            } else if (this.field5285 == var51 && var52 == 0) {
                                var56 = var27;
                                var57 = var28;
                                var58 = var29;
                                var59 = var37;
                                var60 = var53 - var33;
                            } else {
                                float var61 = (float) var51 / (float) this.field5285;
                                float var62 = (float) var52 / (float) this.field5285;
                                float var63 = (var27 - var18) * var61 + var18;
                                float var64 = (var28 - var19) * var61 + var19;
                                float var65 = (var29 - var20) * var61 + var20;
                                float var66 = (var24 - var21) * var61 + var21;
                                float var67 = (var25 - var22) * var61 + var22;
                                float var68 = (var26 - var23) * var61 + var23;
                                var56 = (var66 - var63) * var62 + var63;
                                var57 = (var67 - var64) * var62 + var64;
                                var58 = (var68 - var65) * var62 + var65;
                                int var69 = ((var33 - var30) * var51 >> this.field5282) + var30;
                                int var70 = ((var32 - var31) * var51 >> this.field5282) + var31;
                                var60 = var53 - (((var70 - var69) * var52 >> this.field5282) + var69);
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
                                var54 = class21.field273[var46 & 0xFF80 | var73];
                                if ((this.field5278 & 0x7) == 0) {
                                    float var74 = this.field5277.field4828[2] * var58 + this.field5277.field4828[0] * var56 + this.field5277.field4828[1] * var57;
                                    var55 = this.field5277.field4900 + var74 * (var74 > 0.0F ? this.field5277.field4852 : this.field5277.field4910);
                                }
                            }
                            class311 var75 = var8.method837((byte) -72, var49);
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
                                    var77 = class21.field273[var47 & 0xFF80 | var76];
                                    if ((this.field5278 & 0x7) == 0) {
                                        float var78 = this.field5277.field4828[2] * var58 + this.field5277.field4828[0] * var56 + this.field5277.field4828[1] * var57;
                                        float var79 = this.field5277.field4900 + var55 * (var55 > 0.0F ? this.field5277.field4852 : this.field5277.field4910);
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
                                var6.putFloat((float) (this.method331(var44, var45) + var48));
                                var6.putFloat((float) var45);
                                var6.put((byte) (var77 >> 16));
                                var6.put((byte) (var77 >> 8));
                                var6.put((byte) var77);
                                var6.put((byte) -1);
                                var6.putFloat((float) var44);
                                var6.putFloat((float) var45);
                                if (this.field5295 != null) {
                                    var6.putFloat((float) var48 + var59);
                                }
                                if ((this.field5278 & 0x7) != 0) {
                                    var6.putFloat(var56);
                                    var6.putFloat(var57);
                                    var6.putFloat(var58);
                                }
                                var86 = this.field5290++;
                                var42[var43] = (short) var86;
                                if (var46 != -1) {
                                    var7[var86] = var12[var43];
                                }
                                var8.method835(4, new class102(var42[var43]), var49);
                            } else {
                                var42[var43] = ((class102) var75).field1410;
                                var86 = var42[var43] & 0xFFFF;
                                if (var46 != -1 && var12[var43].field4226 < var7[var86].field4226) {
                                    var7[var86] = var12[var43];
                                }
                            }
                            for (int var87 = 0; var87 < var38; var87++) {
                                var9[var87].method1407(var86, var60, (byte) -72, var55, var54);
                            }
                            this.field5287++;
                        }
                    }
                }
            }
            for (int var88 = 0; var88 < this.field5290; var88++) {
                class209 var89 = var7[var88];
                if (var89 != null) {
                    var89.method1404(var88, 4);
                }
            }
            for (int var90 = 0; var90 < this.field4384; var90++) {
                for (int var91 = 0; var91 < this.field4382; var91++) {
                    short[] var92 = this.field5281[this.field4384 * var91 + var90];
                    if (var92 != null) {
                        int var93 = 0;
                        int var94 = 0;
                        while (var94 < var92.length) {
                            int var95 = var92[var94++] & 0xFFFF;
                            int var96 = var92[var94++] & 0xFFFF;
                            int var97 = var92[var94++] & 0xFFFF;
                            class209 var98 = var7[var95];
                            class209 var99 = var7[var96];
                            class209 var100 = var7[var97];
                            class209 var101 = null;
                            if (var98 != null) {
                                var98.method1408(var91, var93, 65535, var90);
                                var101 = var98;
                            }
                            if (var99 != null) {
                                var99.method1408(var91, var93, 65535, var90);
                                if (var101 == null || var99.field4226 < var101.field4226) {
                                    var101 = var99;
                                }
                            }
                            if (var100 != null) {
                                var100.method1408(var91, var93, 65535, var90);
                                if (var101 == null || var100.field4226 < var101.field4226) {
                                    var101 = var100;
                                }
                            }
                            if (var101 != null) {
                                if (var98 != null) {
                                    var101.method1404(var95, 4);
                                }
                                if (var99 != null) {
                                    var101.method1404(var96, 4);
                                }
                                if (var100 != null) {
                                    var101.method1404(var97, 4);
                                }
                                var101.method1408(var91, var93, 65535, var90);
                            }
                            var93++;
                        }
                    }
                }
            }
            var6.flip();
            this.field5298 = this.field5277.method2150(var5, var6, false);
            this.field5300 = new class376(this.field5277, this.field5298, 5126, 3, 0);
            this.field5307 = new class376(this.field5277, this.field5298, 5121, 4, 12);
            byte var102;
            if (this.field5295 == null) {
                this.field5297 = new class376(this.field5277, this.field5298, 5126, 2, 16);
                var102 = 24;
            } else {
                this.field5297 = new class376(this.field5277, this.field5298, 5126, 3, 16);
                var102 = 28;
            }
            if ((this.field5278 & 0x7) != 0) {
                this.field5308 = new class376(this.field5277, this.field5298, 5126, 3, var102);
                int var106 = var102 + 12;
            }
            long[] var103 = new long[this.field5296.length];
            for (int var104 = 0; var104 < this.field5296.length; var104++) {
                class209 var105 = this.field5296[var104];
                var103[var104] = var105.field4226;
                var105.method1403(this.field5290, 65280);
            }
            class296.method1816((byte) 68, var103, this.field5296);
            if (this.field5280 != null) {
                this.field5280.method2602((byte) -113);
            }
        } else {
            this.field5280 = null;
        }
        this.field5288 = this.field5283 = (int[][][]) null;
        this.field5276 = (int[][][]) null;
        this.field5274 = (int[][][]) null;
        this.field5286 = (class209[][][]) null;
        this.field5284 = (int[][][]) null;
        this.field5309 = (byte[][]) null;
        this.field5305 = null;
        this.field5295 = (int[][]) null;
        this.field5302 = this.field5301 = this.field5306 = (float[][]) null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIIII[[Z)V", line = 900)
    public final void method330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        if (this.field5299 <= 0) {
            return;
        }
        opengl var9 = this.field5277.field4794;
        this.field5277.method2159();
        this.field5277.method2141(false);
        this.field5277.method2198(false);
        this.field5277.method2204(false);
        this.field5277.method2174(false);
        this.field5277.method2195(0);
        this.field5277.method2169(-2);
        this.field5277.method2180((class321) null);
        field5294[0] = (float) arg2 / ((float) this.field5285 * 128.0F * (float) this.field5277.field4813);
        field5294[1] = 0.0F;
        field5294[2] = 0.0F;
        field5294[3] = 0.0F;
        field5294[4] = 0.0F;
        field5294[5] = (float) arg2 / ((float) this.field5285 * 128.0F * (float) this.field5277.field4814);
        field5294[6] = 0.0F;
        field5294[7] = 0.0F;
        field5294[8] = 0.0F;
        field5294[9] = 0.0F;
        field5294[10] = 0.0F;
        field5294[11] = 0.0F;
        field5294[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field5277.field4813;
        field5294[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field5277.field4814;
        field5294[14] = 0.0F;
        field5294[15] = 1.0F;
        var9.glMatrixMode(5889);
        var9.glLoadMatrixf(field5294, 0);
        field5294[0] = 1.0F;
        field5294[1] = 0.0F;
        field5294[2] = 0.0F;
        field5294[3] = 0.0F;
        field5294[4] = 0.0F;
        field5294[5] = 0.0F;
        field5294[6] = 1.0F;
        field5294[7] = 0.0F;
        field5294[8] = 0.0F;
        field5294[9] = 1.0F;
        field5294[10] = 0.0F;
        field5294[11] = 0.0F;
        field5294[12] = 0.0F;
        field5294[13] = 0.0F;
        field5294[14] = 0.0F;
        field5294[15] = 1.0F;
        var9.glMatrixMode(5888);
        var9.glLoadMatrixf(field5294, 0);
        if ((this.field5278 & 0x7) == 0) {
            this.field5277.method2198(false);
        } else {
            this.field5277.method2198(true);
            this.field5277.method2152();
        }
        this.field5277.method2143(this.field5300, this.field5308, this.field5307, this.field5297);
        if (field5279.field5076.length < this.field5287 * 2) {
            field5279 = new class366(this.field5287 * 2);
        } else {
            field5279.field5048 = 0;
        }
        int var10 = 0;
        if (this.field5277.field4829) {
            for (int var11 = arg4; var11 < arg6; var11++) {
                int var12 = this.field4384 * var11 + arg3;
                for (int var13 = arg3; var13 < arg5; var13++) {
                    if (arg7[var13 - arg3][var11 - arg4]) {
                        short[] var14 = this.field5281[var12];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field5279.method2275(125, var14[var15] & 0xFFFF);
                                var10++;
                            }
                        }
                    }
                    var12++;
                }
            }
        } else {
            for (int var16 = arg4; var16 < arg6; var16++) {
                int var17 = this.field4384 * var16 + arg3;
                for (int var18 = arg3; var18 < arg5; var18++) {
                    if (arg7[var18 - arg3][var16 - arg4]) {
                        short[] var19 = this.field5281[var17];
                        if (var19 != null) {
                            for (int var20 = 0; var20 < var19.length; var20++) {
                                field5279.method2271(-116, var19[var20] & 0xFFFF);
                                var10++;
                            }
                        }
                    }
                    var17++;
                }
            }
        }
        if (var10 > 0) {
            class234 var21 = new class234(this.field5277, 5123, field5279.field5076, field5279.field5048);
            this.field5277.method2176(var21, 4, 0, var10);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lbn;[I)V", line = 1063)
    public final void method328(class155 arg0, int[] arg1) {
        this.field5275.method1162(126, new class307(this.field5277, this, arg0, arg1));
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lmm;IIII[[I[[II)V", line = 1068)
    public class384(class357 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field5277 = arg0;
        this.field5292 = arg5;
        this.field5295 = arg6;
        this.field5278 = arg2;
        while (arg7 > 1) {
            this.field5282++;
            arg7 >>= 0x1;
        }
        this.field5285 = 0x1 << this.field5282;
        this.field5274 = new int[arg3][arg4][];
        this.field5286 = new class209[arg3][arg4][];
        this.field5288 = new int[arg3][arg4][];
        this.field5283 = new int[arg3][arg4][];
        this.field5284 = new int[arg3][arg4][];
        this.field5276 = new int[arg3][arg4][];
        this.field5281 = new short[arg3 * arg4][];
        this.field5273 = new byte[arg3][arg4];
        this.field5309 = new byte[arg3 + 1][arg4 + 1];
        this.field5302 = new float[arg3 + 1][arg4 + 1];
        this.field5301 = new float[arg3 + 1][arg4 + 1];
        this.field5306 = new float[arg3 + 1][arg4 + 1];
        for (int var9 = 1; var9 < arg4; var9++) {
            for (int var10 = 1; var10 < arg3; var10++) {
                int var11 = this.field5292[var10 + 1][var9] - this.field5292[var10 - 1][var9];
                int var12 = this.field5292[var10][var9 + 1] - this.field5292[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var11 * var11 + 65536)));
                this.field5302[var10][var9] = (float) var11 * var13;
                this.field5301[var10][var9] = var13 * -256.0F;
                this.field5306[var10][var9] = (float) var12 * var13;
            }
        }
        this.field5305 = new class109(128);
        if ((this.field5278 & 0x10) != 0) {
            this.field5280 = new class421(this.field5277, this);
        }
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(Llb;IIIIZ)V", line = 1127)
    public final void method332(class210 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field5280 != null && arg0 != null) {
            int var7 = arg1 - (this.field5277.field4887 * arg2 >> 8) >> this.field5277.field4806;
            int var8 = arg3 - (this.field5277.field4846 * arg2 >> 8) >> this.field5277.field4806;
            this.field5280.method2598(var7, var8, arg0, (byte) 41);
        }
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(II)I", line = 1143)
    public final int method329(int arg0, int arg1) {
        return this.field5292[arg0][arg1];
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)I", line = 1150)
    public final int method331(int arg0, int arg1) {
        int var3 = arg0 >> this.field5282;
        int var4 = arg1 >> this.field5282;
        if (var3 < 0 || var4 < 0 || var3 > this.field4384 - 1 || var4 > this.field4382 - 1) {
            return 0;
        }
        int var5 = arg0 & this.field5285 - 1;
        int var6 = arg1 & this.field5285 - 1;
        int var7 = (this.field5285 - var5) * this.field5292[var3][var4] + this.field5292[var3 + 1][var4] * var5 >> this.field5282;
        int var8 = (this.field5285 - var5) * this.field5292[var3][var4 + 1] + this.field5292[var3 + 1][var4 + 1] * var5 >> this.field5282;
        return (this.field5285 - var6) * var7 + var6 * var8 >> this.field5282;
    }
}
