import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class156 extends class143 {

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "Lsf;")
    private class398 field2162 = new class398();

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "Lcg;")
    public class393 field2171;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "[[I")
    private int[][] field2165;

    @OriginalMember(owner = "client!pj", name = "N", descriptor = "[[I")
    private int[][] field2192;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
    public int field2172;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "I")
    public int field2173;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public int field2168;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "[[[I")
    private int[][][] field2167;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "[[[Lpr;")
    private class215[][][] field2166;

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "[[[I")
    public int[][][] field2177;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "[[[I")
    public int[][][] field2170;

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "[[[I")
    private int[][][] field2178;

    @OriginalMember(owner = "client!pj", name = "F", descriptor = "[[[I")
    private int[][][] field2184;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "[[S")
    public short[][] field2164;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "[[B")
    private byte[][] field2163;

    @OriginalMember(owner = "client!pj", name = "I", descriptor = "[[B")
    private byte[][] field2187;

    @OriginalMember(owner = "client!pj", name = "T", descriptor = "[[F")
    private float[][] field2197;

    @OriginalMember(owner = "client!pj", name = "J", descriptor = "[[F")
    private float[][] field2188;

    @OriginalMember(owner = "client!pj", name = "G", descriptor = "[[F")
    private float[][] field2185;

    @OriginalMember(owner = "client!pj", name = "H", descriptor = "Lcm;")
    private class382 field2186;

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "Lpg;")
    private class293 field2174;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "Lef;")
    public static class385 field2169 = new class385(1);

    @OriginalMember(owner = "client!pj", name = "B", descriptor = "[I")
    private static int[] field2180 = new int[1];

    @OriginalMember(owner = "client!pj", name = "D", descriptor = "[I")
    private static int[] field2182 = new int[1];

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "[F")
    private static float[] field2181 = new float[16];

    @OriginalMember(owner = "client!pj", name = "E", descriptor = "[I")
    private static int[] field2183 = new int[1];

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
    private int field2175;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "I")
    private int field2176;

    @OriginalMember(owner = "client!pj", name = "A", descriptor = "I")
    private static int field2179;

    @OriginalMember(owner = "client!pj", name = "O", descriptor = "I")
    private int field2193;

    @OriginalMember(owner = "client!pj", name = "S", descriptor = "I")
    private int field2196;

    @OriginalMember(owner = "client!pj", name = "U", descriptor = "Lna;")
    private class226 field2198;

    @OriginalMember(owner = "client!pj", name = "L", descriptor = "Ltf;")
    public class464 field2190;

    @OriginalMember(owner = "client!pj", name = "M", descriptor = "Ltf;")
    private class464 field2191;

    @OriginalMember(owner = "client!pj", name = "P", descriptor = "Ltf;")
    public class464 field2194;

    @OriginalMember(owner = "client!pj", name = "R", descriptor = "Ltf;")
    public class464 field2195;

    @OriginalMember(owner = "client!pj", name = "K", descriptor = "[Lpr;")
    private class215[] field2189;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lne;II)V")
    private final void method966(class123 arg0, int arg1, int arg2) {
        int[] var4 = this.field2177[arg1][arg2];
        int[] var5 = this.field2170[arg1][arg2];
        int var6 = var4.length;
        if (field2182.length < var6) {
            field2182 = new int[var6];
            field2180 = new int[var6];
        }
        for (int var7 = 0; var7 < var6; var7++) {
            field2182[var7] = (var4[var7] & 0xFF) >> this.field2171.field5797;
            field2180[var7] = (var5[var7] & 0xFF) >> this.field2171.field5797;
        }
        int var8 = 0;
        while (var8 < var6) {
            int var9 = field2182[var8];
            int var10 = field2180[var8++];
            int var11 = field2182[var8];
            int var12 = field2180[var8++];
            int var13 = field2182[var8];
            int var14 = field2180[var8++];
            if ((var9 - var11) * (var12 - var14) - (var12 - var10) * (var13 - var11) > 0) {
                arg0.method733(var9, var10, var11, var13, var12, (byte) -86, var14);
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lcg;IIII[[I[[II)V")
    public class156(class393 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field2171 = arg0;
        this.field2165 = arg5;
        this.field2192 = arg6;
        this.field2172 = arg2;
        while (arg7 > 1) {
            this.field2173++;
            arg7 >>= 0x1;
        }
        this.field2168 = 0x1 << this.field2173;
        this.field2167 = new int[arg3][arg4][];
        this.field2166 = new class215[arg3][arg4][];
        this.field2177 = new int[arg3][arg4][];
        this.field2170 = new int[arg3][arg4][];
        this.field2178 = new int[arg3][arg4][];
        this.field2184 = new int[arg3][arg4][];
        this.field2164 = new short[arg3 * arg4][];
        this.field2163 = new byte[arg3][arg4];
        this.field2187 = new byte[arg3 + 1][arg4 + 1];
        this.field2197 = new float[arg3 + 1][arg4 + 1];
        this.field2188 = new float[arg3 + 1][arg4 + 1];
        this.field2185 = new float[arg3 + 1][arg4 + 1];
        for (int var9 = 1; var9 < arg4; var9++) {
            for (int var10 = 1; var10 < arg3; var10++) {
                int var11 = this.field2165[var10 + 1][var9] - this.field2165[var10 - 1][var9];
                int var12 = this.field2165[var10][var9 + 1] - this.field2165[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var11 * var11 + 65536)));
                this.field2197[var10][var9] = (float) var11 * var13;
                this.field2188[var10][var9] = var13 * -256.0F;
                this.field2185[var10][var9] = (float) var12 * var13;
            }
        }
        this.field2186 = new class382(128);
        if ((this.field2172 & 0x10) != 0) {
            this.field2174 = new class293(this.field2171, this);
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(Lqn;IIIIZ)Z")
    public final boolean method99(class380 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field2174 == null || arg0 == null) {
            return false;
        } else {
            int var7 = arg1 - (this.field2171.field5852 * arg2 >> 8) >> 3;
            int var8 = arg3 - (this.field2171.field5837 * arg2 >> 8) >> 3;
            return this.field2174.method1828(arg0, var7, var8, 1);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lqn;IIIIZ)V")
    public final void method94(class380 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field2174 != null && arg0 != null) {
            int var7 = arg1 - (this.field2171.field5852 * arg2 >> 8) >> this.field2171.field5797;
            int var8 = arg3 - (this.field2171.field5837 * arg2 >> 8) >> this.field2171.field5797;
            this.field2174.method1824(1, var8, arg0, var7);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILqn;)Lqn;")
    public final class380 method110(int arg0, int arg1, class380 arg2) {
        if ((this.field2163[arg0][arg1] & 0x1) == 0) {
            return null;
        }
        int var4 = this.field2168 >> this.field2171.field5797;
        class123 var5 = (class123) arg2;
        class123 var6;
        if (var5 != null && var5.method736(var4, true, var4)) {
            var6 = var5;
            var5.method735(1012568080);
        } else {
            var6 = new class123(this.field2171, var4, var4);
        }
        var6.method732(var4, 0, var4, false, 0);
        this.method966(var6, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        if (this.field2193 <= 0) {
            return;
        }
        opengl var9 = this.field2171.field5783;
        this.field2171.method2466();
        this.field2171.method2481(false);
        this.field2171.method2486(false);
        this.field2171.method2483(false);
        this.field2171.method2465(false);
        this.field2171.method2424(0);
        this.field2171.method2474(-2);
        this.field2171.method2460((class325) null);
        field2181[0] = (float) arg2 / ((float) this.field2168 * 128.0F * (float) this.field2171.field5791);
        field2181[1] = 0.0F;
        field2181[2] = 0.0F;
        field2181[3] = 0.0F;
        field2181[4] = 0.0F;
        field2181[5] = (float) arg2 / ((float) this.field2168 * 128.0F * (float) this.field2171.field5793);
        field2181[6] = 0.0F;
        field2181[7] = 0.0F;
        field2181[8] = 0.0F;
        field2181[9] = 0.0F;
        field2181[10] = 0.0F;
        field2181[11] = 0.0F;
        field2181[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field2171.field5791;
        field2181[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field2171.field5793;
        field2181[14] = 0.0F;
        field2181[15] = 1.0F;
        var9.glMatrixMode(5889);
        var9.glLoadMatrixf(field2181, 0);
        field2181[0] = 1.0F;
        field2181[1] = 0.0F;
        field2181[2] = 0.0F;
        field2181[3] = 0.0F;
        field2181[4] = 0.0F;
        field2181[5] = 0.0F;
        field2181[6] = 1.0F;
        field2181[7] = 0.0F;
        field2181[8] = 0.0F;
        field2181[9] = 1.0F;
        field2181[10] = 0.0F;
        field2181[11] = 0.0F;
        field2181[12] = 0.0F;
        field2181[13] = 0.0F;
        field2181[14] = 0.0F;
        field2181[15] = 1.0F;
        var9.glMatrixMode(5888);
        var9.glLoadMatrixf(field2181, 0);
        if ((this.field2172 & 0x7) == 0) {
            this.field2171.method2486(false);
        } else {
            this.field2171.method2486(true);
            this.field2171.method2454();
        }
        this.field2171.method2430(this.field2190, this.field2194, this.field2191, this.field2195);
        if (field2169.field5685.length < this.field2175 * 2) {
            field2169 = new class385(this.field2175 * 2);
        } else {
            field2169.field5666 = 0;
        }
        int var10 = 0;
        if (this.field2171.field5879) {
            for (int var11 = arg4; var11 < arg6; var11++) {
                int var12 = this.field1906 * var11 + arg3;
                for (int var13 = arg3; var13 < arg5; var13++) {
                    if (arg7[var13 - arg3][var11 - arg4]) {
                        short[] var14 = this.field2164[var12];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field2169.method2377(var14[var15] & 0xFFFF, -98);
                                var10++;
                            }
                        }
                    }
                    var12++;
                }
            }
        } else {
            for (int var16 = arg4; var16 < arg6; var16++) {
                int var17 = this.field1906 * var16 + arg3;
                for (int var18 = arg3; var18 < arg5; var18++) {
                    if (arg7[var18 - arg3][var16 - arg4]) {
                        short[] var19 = this.field2164[var17];
                        if (var19 != null) {
                            for (int var20 = 0; var20 < var19.length; var20++) {
                                field2169.method2329(var19[var20] & 0xFFFF, -94);
                                var10++;
                            }
                        }
                    }
                    var17++;
                }
            }
        }
        if (var10 > 0) {
            class237 var21 = new class237(this.field2171, 5123, field2169.field5685, field2169.field5666);
            this.field2171.method2458(var21, 4, 0, var10);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "()V")
    public final void method101() {
        if (this.field2193 > 0) {
            byte[][] var1 = new byte[this.field1906 + 1][this.field1908 + 1];
            for (int var2 = 1; var2 < this.field1906; var2++) {
                for (int var3 = 1; var3 < this.field1908; var3++) {
                    var1[var2][var3] = (byte) ((this.field2187[var2][var3] >> 1) + (this.field2187[var2][var3 + 1] >> 3) + (this.field2187[var2][var3 - 1] >> 2) + (this.field2187[var2 - 1][var3] >> 2) + (this.field2187[var2 + 1][var3] >> 3));
                }
            }
            this.field2189 = new class215[this.field2186.method2305(94)];
            this.field2186.method2300(this.field2189, true);
            for (int var4 = 0; var4 < this.field2189.length; var4++) {
                this.field2189[var4].method1308((byte) -93, this.field2193);
            }
            int var5 = 24;
            if (this.field2192 != null) {
                var5 += 4;
            }
            if ((this.field2172 & 0x7) != 0) {
                var5 += 12;
            }
            ByteBuffer var6 = ByteBuffer.allocateDirect(this.field2193 * var5).order(ByteOrder.nativeOrder());
            class215[] var7 = new class215[this.field2193];
            class382 var8 = new class382(class275.method1708(this.field2193, true));
            class215[] var9 = new class215[this.field2196];
            for (int var10 = 0; var10 < this.field1906; var10++) {
                for (int var11 = 0; var11 < this.field1908; var11++) {
                    if (this.field2178[var10][var11] != null) {
                        class215[] var12 = this.field2166[var10][var11];
                        int[] var13 = this.field2167[var10][var11];
                        int[] var14 = this.field2177[var10][var11];
                        int[] var15 = this.field2170[var10][var11];
                        int[] var16 = this.field2184[var10][var11];
                        int[] var17 = this.field2178[var10][var11];
                        if (var16 == null) {
                            var16 = var17;
                        }
                        float var18 = this.field2197[var10][var11];
                        float var19 = this.field2188[var10][var11];
                        float var20 = this.field2185[var10][var11];
                        float var21 = this.field2197[var10][var11 + 1];
                        float var22 = this.field2188[var10][var11 + 1];
                        float var23 = this.field2185[var10][var11 + 1];
                        float var24 = this.field2197[var10 + 1][var11 + 1];
                        float var25 = this.field2188[var10 + 1][var11 + 1];
                        float var26 = this.field2185[var10 + 1][var11 + 1];
                        float var27 = this.field2197[var10 + 1][var11];
                        float var28 = this.field2188[var10 + 1][var11];
                        float var29 = this.field2185[var10 + 1][var11];
                        int var30 = var1[var10][var11] & 0xFF;
                        int var31 = var1[var10][var11 + 1] & 0xFF;
                        int var32 = var1[var10 + 1][var11 + 1] & 0xFF;
                        int var33 = var1[var10 + 1][var11] & 0xFF;
                        float var34;
                        float var35;
                        float var36;
                        float var37;
                        if (this.field2192 == null) {
                            var37 = 0.0F;
                            var36 = 0.0F;
                            var35 = 0.0F;
                            var34 = 0.0F;
                        } else {
                            var34 = (float) this.field2192[var10][var11];
                            var35 = (float) this.field2192[var10][var11 + 1];
                            var36 = (float) this.field2192[var10 + 1][var11 + 1];
                            var37 = (float) this.field2192[var10 + 1][var11];
                        }
                        int var38 = 0;
                        label304: for (int var39 = 0; var39 < var17.length; var39++) {
                            class215 var40 = var12[var39];
                            for (int var41 = 0; var41 < var38; var41++) {
                                if (var9[var41] == var40) {
                                    continue label304;
                                }
                            }
                            var9[var38++] = var40;
                        }
                        short[] var42 = this.field2164[this.field1906 * var11 + var10] = new short[var17.length];
                        for (int var43 = 0; var43 < var17.length; var43++) {
                            int var44 = (var10 << this.field2173) + var14[var43];
                            int var45 = (var11 << this.field2173) + var15[var43];
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
                            } else if (var51 == 0 && this.field2168 == var52) {
                                var56 = var21;
                                var57 = var22;
                                var58 = var23;
                                var59 = var35;
                                var60 = var53 - var31;
                            } else if (this.field2168 == var51 && this.field2168 == var52) {
                                var56 = var24;
                                var57 = var25;
                                var58 = var26;
                                var59 = var36;
                                var60 = var53 - var32;
                            } else if (this.field2168 == var51 && var52 == 0) {
                                var56 = var27;
                                var57 = var28;
                                var58 = var29;
                                var59 = var37;
                                var60 = var53 - var33;
                            } else {
                                float var61 = (float) var51 / (float) this.field2168;
                                float var62 = (float) var52 / (float) this.field2168;
                                float var63 = (var27 - var18) * var61 + var18;
                                float var64 = (var28 - var19) * var61 + var19;
                                float var65 = (var29 - var20) * var61 + var20;
                                float var66 = (var24 - var21) * var61 + var21;
                                float var67 = (var25 - var22) * var61 + var22;
                                float var68 = (var26 - var23) * var61 + var23;
                                var56 = (var66 - var63) * var62 + var63;
                                var57 = (var67 - var64) * var62 + var64;
                                var58 = (var68 - var65) * var62 + var65;
                                int var69 = ((var33 - var30) * var51 >> this.field2173) + var30;
                                int var70 = ((var32 - var31) * var51 >> this.field2173) + var31;
                                var60 = var53 - (((var70 - var69) * var52 >> this.field2173) + var69);
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
                                var54 = class328.field4929[var46 & 0xFF80 | var73];
                                if ((this.field2172 & 0x7) == 0) {
                                    float var74 = this.field2171.field5838[2] * var58 + this.field2171.field5838[0] * var56 + this.field2171.field5838[1] * var57;
                                    var55 = this.field2171.field5899 + var74 * (var74 > 0.0F ? this.field2171.field5890 : this.field2171.field5885);
                                }
                            }
                            class97 var75 = var8.method2302(var49, 23576);
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
                                    var77 = class328.field4929[var47 & 0xFF80 | var76];
                                    if ((this.field2172 & 0x7) == 0) {
                                        float var78 = this.field2171.field5838[2] * var58 + this.field2171.field5838[0] * var56 + this.field2171.field5838[1] * var57;
                                        float var79 = this.field2171.field5899 + var55 * (var55 > 0.0F ? this.field2171.field5890 : this.field2171.field5885);
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
                                var6.putFloat((float) (this.method100(var44, var45) + var48));
                                var6.putFloat((float) var45);
                                var6.put((byte) (var77 >> 16));
                                var6.put((byte) (var77 >> 8));
                                var6.put((byte) var77);
                                var6.put((byte) -1);
                                var6.putFloat((float) var44);
                                var6.putFloat((float) var45);
                                if (this.field2192 != null) {
                                    var6.putFloat((float) var48 + var59);
                                }
                                if ((this.field2172 & 0x7) != 0) {
                                    var6.putFloat(var56);
                                    var6.putFloat(var57);
                                    var6.putFloat(var58);
                                }
                                var86 = this.field2176++;
                                var42[var43] = (short) var86;
                                if (var46 != -1) {
                                    var7[var86] = var12[var43];
                                }
                                var8.method2301(27, new class114(var42[var43]), var49);
                            } else {
                                var42[var43] = ((class114) var75).field1507;
                                var86 = var42[var43] & 0xFFFF;
                                if (var46 != -1 && var12[var43].field1339 < var7[var86].field1339) {
                                    var7[var86] = var12[var43];
                                }
                            }
                            for (int var87 = 0; var87 < var38; var87++) {
                                var9[var87].method1312(var54, 17, var86, var60, var55);
                            }
                            this.field2175++;
                        }
                    }
                }
            }
            for (int var88 = 0; var88 < this.field2176; var88++) {
                class215 var89 = var7[var88];
                if (var89 != null) {
                    var89.method1307(var88, -42);
                }
            }
            for (int var90 = 0; var90 < this.field1906; var90++) {
                for (int var91 = 0; var91 < this.field1908; var91++) {
                    short[] var92 = this.field2164[this.field1906 * var91 + var90];
                    if (var92 != null) {
                        int var93 = 0;
                        int var94 = 0;
                        while (var94 < var92.length) {
                            int var95 = var92[var94++] & 0xFFFF;
                            int var96 = var92[var94++] & 0xFFFF;
                            int var97 = var92[var94++] & 0xFFFF;
                            class215 var98 = var7[var95];
                            class215 var99 = var7[var96];
                            class215 var100 = var7[var97];
                            class215 var101 = null;
                            if (var98 != null) {
                                var98.method1311(1, var93, var90, var91);
                                var101 = var98;
                            }
                            if (var99 != null) {
                                var99.method1311(1, var93, var90, var91);
                                if (var101 == null || var99.field1339 < var101.field1339) {
                                    var101 = var99;
                                }
                            }
                            if (var100 != null) {
                                var100.method1311(1, var93, var90, var91);
                                if (var101 == null || var100.field1339 < var101.field1339) {
                                    var101 = var100;
                                }
                            }
                            if (var101 != null) {
                                if (var98 != null) {
                                    var101.method1307(var95, -127);
                                }
                                if (var99 != null) {
                                    var101.method1307(var96, -58);
                                }
                                if (var100 != null) {
                                    var101.method1307(var97, -97);
                                }
                                var101.method1311(1, var93, var90, var91);
                            }
                            var93++;
                        }
                    }
                }
            }
            var6.flip();
            this.field2198 = this.field2171.method2453(var5, var6, false);
            this.field2190 = new class464(this.field2171, this.field2198, 5126, 3, 0);
            this.field2191 = new class464(this.field2171, this.field2198, 5121, 4, 12);
            byte var102;
            if (this.field2192 == null) {
                this.field2195 = new class464(this.field2171, this.field2198, 5126, 2, 16);
                var102 = 24;
            } else {
                this.field2195 = new class464(this.field2171, this.field2198, 5126, 3, 16);
                var102 = 28;
            }
            if ((this.field2172 & 0x7) != 0) {
                this.field2194 = new class464(this.field2171, this.field2198, 5126, 3, var102);
                int var106 = var102 + 12;
            }
            long[] var103 = new long[this.field2189.length];
            for (int var104 = 0; var104 < this.field2189.length; var104++) {
                class215 var105 = this.field2189[var104];
                var103[var104] = var105.field1339;
                var105.method1310(this.field2176, true);
            }
            class458.method2844(var103, (byte) -106, this.field2189);
            if (this.field2174 != null) {
                this.field2174.method1825((byte) 125);
            }
        } else {
            this.field2174 = null;
        }
        this.field2177 = this.field2170 = (int[][][]) null;
        this.field2184 = (int[][][]) null;
        this.field2167 = (int[][][]) null;
        this.field2166 = (class215[][][]) null;
        this.field2178 = (int[][][]) null;
        this.field2187 = (byte[][]) null;
        this.field2186 = null;
        this.field2192 = (int[][]) null;
        this.field2197 = this.field2188 = this.field2185 = (float[][]) null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III[[ZZ)V")
    public final void method107(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        if (this.field2189 == null) {
            return;
        }
        float var6 = this.field2171.field5824;
        float var7 = this.field2171.field5907;
        int var8 = arg2 + arg2 + 1;
        int var9 = var8 * var8;
        if (field2183.length < var9) {
            field2183 = new int[var9];
        }
        if (field2169.field5685.length < this.field2175 * 2) {
            field2169 = new class385(this.field2175 * 2);
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
        if (var14 > this.field1906 - 1) {
            var14 = this.field1906 - 1;
        }
        int var15 = arg1 + arg2;
        if (var15 > this.field1908 - 1) {
            var15 = this.field1908 - 1;
        }
        field2179 = 0;
        for (int var16 = var10; var16 <= var14; var16++) {
            boolean[] var17 = arg3[var16 - var11];
            for (int var18 = var12; var18 <= var15; var18++) {
                if (var17[var18 - var13]) {
                    field2183[field2179++] = this.field1906 * var18 + var16;
                }
            }
        }
        this.field2171.method2444();
        this.field2171.method2486((this.field2172 & 0x7) != 0);
        for (int var19 = 0; var19 < this.field2189.length; var19++) {
            this.field2189[var19].method1309(field2183, field2179, -118);
        }
        if (!this.field2162.method2506(false)) {
            int var20 = this.field2171.field5818;
            int var21 = this.field2171.field5833;
            this.field2171.method344(0, var21);
            this.field2171.method423(var7, var6 - 4.0F);
            this.field2171.method2486(false);
            this.field2171.method2465(false);
            this.field2171.method2424(130);
            this.field2171.method2474(-2);
            this.field2171.method2460(this.field2171.field5874);
            this.field2171.method2428(8448, 7681);
            this.field2171.method2425(0, 34166, 770);
            this.field2171.method2462(0, 34167, 770);
            for (class97 var22 = this.field2162.method2514((byte) 61); var22 != null; var22 = this.field2162.method2511(-123)) {
                class203 var23 = (class203) var22;
                var23.method1204(arg1, arg0, arg2, arg3, false);
            }
            this.field2171.method2425(0, 5890, 768);
            this.field2171.method2462(0, 5890, 770);
            this.field2171.method2460((class325) null);
            this.field2171.method344(var20, var21);
        }
        if (this.field2174 != null) {
            this.field2171.method423(var7, var6 - 8.0F);
            this.field2171.method2444();
            this.field2171.method2430(this.field2190, (class464) null, (class464) null, this.field2195);
            this.field2174.method1821(arg3, arg4, arg0, arg1, (byte) -97, arg2);
        }
        this.field2171.method423(var7, var6);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
    public final void method108(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14) {
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
        this.method97(arg0, arg1, var17, var23, var18, var19, var20, var21, var22, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(II)I")
    public final int method100(int arg0, int arg1) {
        int var3 = arg0 >> this.field2173;
        int var4 = arg1 >> this.field2173;
        if (var3 < 0 || var4 < 0 || var3 > this.field1906 - 1 || var4 > this.field1908 - 1) {
            return 0;
        }
        int var5 = arg0 & this.field2168 - 1;
        int var6 = arg1 & this.field2168 - 1;
        int var7 = (this.field2168 - var5) * this.field2165[var3][var4] + this.field2165[var3 + 1][var4] * var5 >> this.field2173;
        int var8 = (this.field2168 - var5) * this.field2165[var3][var4 + 1] + this.field2165[var3 + 1][var4 + 1] * var5 >> this.field2173;
        return (this.field2168 - var6) * var7 + var6 * var8 >> this.field2173;
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(II)I")
    public final int method92(int arg0, int arg1) {
        return this.field2165[arg0][arg1];
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(Lqn;IIIIZ)V")
    public final void method95(class380 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field2174 != null && arg0 != null) {
            int var7 = arg1 - (this.field2171.field5852 * arg2 >> 8) >> this.field2171.field5797;
            int var8 = arg3 - (this.field2171.field5837 * arg2 >> 8) >> this.field2171.field5797;
            this.field2174.method1823(arg0, true, var8, var7);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)V")
    public final void method104(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ldt;[I)V")
    public final void method105(class147 arg0, int[] arg1) {
        this.field2162.method2504(42, new class203(this.field2171, this, arg0, arg1));
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)V")
    public final void method106(int arg0, int arg1, int arg2) {
        if ((this.field2187[arg0][arg1] & 0xFF) < arg2) {
            this.field2187[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
    public final void method97(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11) {
        this.field2167[arg0][arg1] = arg3;
        this.field2177[arg0][arg1] = arg2;
        this.field2170[arg0][arg1] = arg4;
        this.field2178[arg0][arg1] = arg5;
        this.field2184[arg0][arg1] = arg6;
        class215[] var13 = this.field2166[arg0][arg1] = new class215[arg5.length];
        for (int var14 = 0; var14 < arg5.length; var14++) {
            long var15 = (long) arg10 << 48 | (long) arg9 << 32 | (long) (arg7[var14] << 16) | (long) arg8[var14];
            class97 var17 = this.field2186.method2302(var15, 23576);
            if (var17 == null) {
                var13[var14] = new class215(this, arg7[var14], arg8[var14], arg9, arg10);
                this.field2186.method2301(105, var13[var14], var15);
            } else {
                var13[var14] = (class215) var17;
            }
        }
        if (arg11) {
            this.field2163[arg0][arg1] = (byte) (this.field2163[arg0][arg1] | 0x1);
        }
        if (arg5.length > this.field2196) {
            this.field2196 = arg5.length;
        }
        this.field2193 += arg5.length;
    }
}
