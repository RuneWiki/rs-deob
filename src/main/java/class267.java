import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class267 extends class59 {

    @OriginalMember(owner = "client!ge", name = "H", descriptor = "Z")
    private static boolean field4249 = false;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
    private int field4237;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
    private int field4239;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "I")
    private static int field4241;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
    private static int field4243;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "I")
    private int field4253;

    @OriginalMember(owner = "client!ge", name = "S", descriptor = "I")
    private static int field4259;

    @OriginalMember(owner = "client!ge", name = "U", descriptor = "I")
    private static int field4261;

    @OriginalMember(owner = "client!ge", name = "V", descriptor = "I")
    private int field4262;

    @OriginalMember(owner = "client!ge", name = "Y", descriptor = "I")
    private int field4265;

    @OriginalMember(owner = "client!ge", name = "Z", descriptor = "I")
    private int field4266;

    @OriginalMember(owner = "client!ge", name = "cb", descriptor = "I")
    private int field4269;

    @OriginalMember(owner = "client!ge", name = "db", descriptor = "I")
    private int field4270;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "Z")
    private boolean field4240;

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "Z")
    private boolean field4247;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "[B")
    private static byte[] field4238;

    @OriginalMember(owner = "client!ge", name = "bb", descriptor = "[B")
    private byte[] field4268;

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "[F")
    private static float[] field4244;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "[F")
    private static float[] field4245;

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "[F")
    private static float[] field4246;

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "[F")
    private static float[] field4251;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "[F")
    private static float[] field4254;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "[F")
    private float[] field4255;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "[F")
    private static float[] field4256;

    @OriginalMember(owner = "client!ge", name = "ab", descriptor = "[F")
    private static float[] field4267;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "[I")
    private static int[] field4242;

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "[I")
    private static int[] field4258;

    @OriginalMember(owner = "client!ge", name = "X", descriptor = "[I")
    private static int[] field4264;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "[Llg;")
    private static class12[] field4248;

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "[Lle;")
    public static class197[] field4252;

    @OriginalMember(owner = "client!ge", name = "W", descriptor = "[Lmf;")
    private static class29[] field4263;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "[Lcb;")
    private static class34[] field4250;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "[Z")
    private static boolean[] field4257;

    @OriginalMember(owner = "client!ge", name = "T", descriptor = "[[B")
    private byte[][] field4260;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)I", line = 12)
    public static final int method1889(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field4243) {
            int var3 = 8 - field4243;
            int var4 = (0x1 << var3) - 1;
            var1 += (field4238[field4241] >> field4243 & var4) << var2;
            field4243 = 0;
            field4241++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field4238[field4241] >> field4243 & var5) << var2;
            field4243 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)F", line = 41)
    public static final float method1890(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([I)Lgi;", line = 52)
    public final class291 method1891(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field4268 == null) {
            this.field4239 = 0;
            this.field4255 = new float[field4261];
            this.field4268 = new byte[this.field4265];
            this.field4270 = 0;
            this.field4269 = 0;
        }
        while (this.field4269 < this.field4260.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method1899(this.field4269);
            if (var2 != null) {
                int var3 = this.field4270;
                int var4 = var2.length;
                if (var4 > this.field4265 - var3) {
                    var4 = this.field4265 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field4268[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field4270;
                }
                this.field4270 = var3;
            }
            this.field4269++;
        }
        this.field4255 = null;
        byte[] var7 = this.field4268;
        this.field4268 = null;
        return new class291(this.field4253, var7, this.field4266, this.field4262, this.field4240);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([B)V", line = 111)
    private static final void method1892(byte[] arg0) {
        method1895(arg0, 0);
        field4259 = 0x1 << method1889(4);
        field4261 = 0x1 << method1889(4);
        field4246 = new float[field4261];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field4259 : field4261;
            int var3 = var2 >> 1;
            int var4 = var2 >> 2;
            int var5 = var2 >> 3;
            float[] var6 = new float[var3];
            for (int var7 = 0; var7 < var4; var7++) {
                var6[var7 * 2] = (float) Math.cos((double) (var7 * 4) * 3.141592653589793D / (double) var2);
                var6[var7 * 2 + 1] = -((float) Math.sin((double) (var7 * 4) * 3.141592653589793D / (double) var2));
            }
            float[] var8 = new float[var3];
            for (int var9 = 0; var9 < var4; var9++) {
                var8[var9 * 2] = (float) Math.cos((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
                var8[var9 * 2 + 1] = (float) Math.sin((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
            }
            float[] var10 = new float[var4];
            for (int var11 = 0; var11 < var5; var11++) {
                var10[var11 * 2] = (float) Math.cos((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2);
                var10[var11 * 2 + 1] = -((float) Math.sin((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2));
            }
            int[] var12 = new int[var5];
            int var13 = class33.method231(var5 - 1, 8);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class241.method1725(true, var14, var13);
            }
            if (var1 == 0) {
                field4245 = var6;
                field4256 = var8;
                field4251 = var10;
                field4258 = var12;
            } else {
                field4244 = var6;
                field4267 = var8;
                field4254 = var10;
                field4242 = var12;
            }
        }
        int var15 = method1889(8) + 1;
        field4252 = new class197[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field4252[var16] = new class197();
        }
        int var17 = method1889(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method1889(16);
        }
        int var19 = method1889(6) + 1;
        field4248 = new class12[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field4248[var20] = new class12();
        }
        int var21 = method1889(6) + 1;
        field4250 = new class34[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field4250[var22] = new class34();
        }
        int var23 = method1889(6) + 1;
        field4263 = new class29[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field4263[var24] = new class29();
        }
        int var25 = method1889(6) + 1;
        field4257 = new boolean[var25];
        field4264 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field4257[var26] = method1898() != 0;
            method1889(16);
            method1889(16);
            field4264[var26] = method1889(8);
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "([B)V", line = 264)
    private final void method1893(byte[] arg0) {
        class112 var2 = new class112(arg0);
        this.field4253 = var2.method779(-27100);
        this.field4265 = var2.method779(-27100);
        this.field4266 = var2.method779(-27100);
        this.field4262 = var2.method779(-27100);
        if (this.field4262 < 0) {
            this.field4262 = ~this.field4262;
            this.field4240 = true;
        }
        int var3 = var2.method779(-27100);
        this.field4260 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method792(2);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method807(var5, var7, (byte) 106, 0);
            this.field4260[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lmh;)Z", line = 309)
    private static final boolean method1894(class65 arg0) {
        if (!field4249) {
            byte[] var1 = arg0.method454(0, 0, 0);
            if (var1 == null) {
                return false;
            }
            method1892(var1);
            field4249 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([BI)V", line = 323)
    private static final void method1895(byte[] arg0, int arg1) {
        field4238 = arg0;
        field4241 = arg1;
        field4243 = 0;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "()V", line = 329)
    public static void method1896() {
        field4238 = null;
        field4252 = null;
        field4248 = null;
        field4250 = null;
        field4263 = null;
        field4257 = null;
        field4264 = null;
        field4246 = null;
        field4245 = null;
        field4256 = null;
        field4251 = null;
        field4244 = null;
        field4267 = null;
        field4254 = null;
        field4258 = null;
        field4242 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lmh;II)Lge;", line = 360)
    public static final class267 method1897(class65 arg0, int arg1, int arg2) {
        if (method1894(arg0)) {
            byte[] var3 = arg0.method454(arg1, 0, arg2);
            return var3 == null ? null : new class267(var3);
        } else {
            arg0.method471(arg2, arg1, (byte) -126);
            return null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "()I", line = 375)
    public static final int method1898() {
        int var0 = field4238[field4241] >> field4243 & 0x1;
        field4243++;
        field4241 += field4243 >> 3;
        field4243 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(I)[F", line = 383)
    private final float[] method1899(int arg0) {
        method1895(this.field4260[arg0], 0);
        method1898();
        int var2 = method1889(class33.method231(field4264.length - 1, 8));
        boolean var3 = field4257[var2];
        int var4 = var3 ? field4261 : field4259;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1898() != 0;
            var6 = method1898() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field4259 >> 2);
            var9 = (field4259 >> 2) + (var4 >> 2);
            var10 = field4259 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field4259 >> 2);
            var12 = (field4259 >> 2) + (var4 - (var4 >> 2));
            var13 = field4259 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class29 var14 = field4263[field4264[var2]];
        int var15 = var14.field425;
        int var16 = var14.field427[var15];
        boolean var17 = !field4248[var16].method47();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field426; var19++) {
            class34 var20 = field4250[var14.field428[var19]];
            float[] var21 = field4246;
            var20.method232(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field425;
            int var23 = var14.field427[var22];
            field4248[var23].method46(field4246, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field4246[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field4246;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field4244 : field4245;
            float[] var32 = var3 ? field4267 : field4256;
            float[] var33 = var3 ? field4254 : field4251;
            int[] var34 = var3 ? field4242 : field4258;
            for (int var35 = 0; var35 < var26; var35++) {
                float var36 = var28[var35 * 4] - var28[var4 - var35 * 4 - 1];
                float var37 = var28[var35 * 4 + 2] - var28[var4 - var35 * 4 - 3];
                float var38 = var31[var35 * 2];
                float var39 = var31[var35 * 2 + 1];
                var28[var4 - var35 * 4 - 1] = var36 * var38 - var37 * var39;
                var28[var4 - var35 * 4 - 3] = var36 * var39 + var37 * var38;
            }
            for (int var40 = 0; var40 < var27; var40++) {
                float var41 = var28[var40 * 4 + var25 + 3];
                float var42 = var28[var40 * 4 + var25 + 1];
                float var43 = var28[var40 * 4 + 3];
                float var44 = var28[var40 * 4 + 1];
                var28[var40 * 4 + var25 + 3] = var41 + var43;
                var28[var40 * 4 + var25 + 1] = var42 + var44;
                float var45 = var31[var25 - var40 * 4 - 4];
                float var46 = var31[var25 - var40 * 4 - 3];
                var28[var40 * 4 + 3] = (var41 - var43) * var45 - (var42 - var44) * var46;
                var28[var40 * 4 + 1] = (var41 - var43) * var46 + (var42 - var44) * var45;
            }
            int var47 = class33.method231(var4 - 1, 8);
            for (int var48 = 0; var48 < var47 - 3; var48++) {
                int var49 = var4 >> var48 + 2;
                int var50 = 0x8 << var48;
                for (int var51 = 0; var51 < 0x2 << var48; var51++) {
                    int var52 = var4 - var49 * 2 * var51;
                    int var53 = var4 - (var51 * 2 + 1) * var49;
                    for (int var54 = 0; var54 < var4 >> var48 + 4; var54++) {
                        int var55 = var54 * 4;
                        float var56 = var28[var52 - var55 - 1];
                        float var57 = var28[var52 - var55 - 3];
                        float var58 = var28[var53 - var55 - 1];
                        float var59 = var28[var53 - var55 - 3];
                        var28[var52 - var55 - 1] = var56 + var58;
                        var28[var52 - var55 - 3] = var57 + var59;
                        float var60 = var31[var50 * var54];
                        float var61 = var31[var50 * var54 + 1];
                        var28[var53 - var55 - 1] = (var56 - var58) * var60 - (var57 - var59) * var61;
                        var28[var53 - var55 - 3] = (var56 - var58) * var61 + (var57 - var59) * var60;
                    }
                }
            }
            for (int var62 = 1; var62 < var27 - 1; var62++) {
                int var63 = var34[var62];
                if (var62 < var63) {
                    int var64 = var62 * 8;
                    int var65 = var63 * 8;
                    float var66 = var28[var64 + 1];
                    var28[var64 + 1] = var28[var65 + 1];
                    var28[var65 + 1] = var66;
                    float var67 = var28[var64 + 3];
                    var28[var64 + 3] = var28[var65 + 3];
                    var28[var65 + 3] = var67;
                    float var68 = var28[var64 + 5];
                    var28[var64 + 5] = var28[var65 + 5];
                    var28[var65 + 5] = var68;
                    float var69 = var28[var64 + 7];
                    var28[var64 + 7] = var28[var65 + 7];
                    var28[var65 + 7] = var69;
                }
            }
            for (int var70 = 0; var70 < var25; var70++) {
                var28[var70] = var28[var70 * 2 + 1];
            }
            for (int var71 = 0; var71 < var27; var71++) {
                var28[var4 - var71 * 2 - 1] = var28[var71 * 4];
                var28[var4 - var71 * 2 - 2] = var28[var71 * 4 + 1];
                var28[var4 - var26 - var71 * 2 - 1] = var28[var71 * 4 + 2];
                var28[var4 - var26 - var71 * 2 - 2] = var28[var71 * 4 + 3];
            }
            for (int var72 = 0; var72 < var27; var72++) {
                float var73 = var33[var72 * 2];
                float var74 = var33[var72 * 2 + 1];
                float var75 = var28[var72 * 2 + var25];
                float var76 = var28[var72 * 2 + var25 + 1];
                float var77 = var28[var4 - var72 * 2 - 2];
                float var78 = var28[var4 - var72 * 2 - 1];
                float var79 = (var75 - var77) * var74 + (var76 + var78) * var73;
                var28[var72 * 2 + var25] = (var75 + var77 + var79) * 0.5F;
                var28[var4 - var72 * 2 - 2] = (var75 + var77 - var79) * 0.5F;
                float var80 = (var76 + var78) * var74 - (var75 - var77) * var73;
                var28[var72 * 2 + var25 + 1] = (var76 + var80 - var78) * 0.5F;
                var28[var4 - var72 * 2 - 1] = (var78 + var80 - var76) * 0.5F;
            }
            for (int var81 = 0; var81 < var26; var81++) {
                var28[var81] = var32[var81 * 2] * var28[var81 * 2 + var25] + var32[var81 * 2 + 1] * var28[var81 * 2 + var25 + 1];
                var28[var25 - var81 - 1] = var28[var81 * 2 + var25] * var32[var81 * 2 + 1] - var32[var81 * 2] * var28[var81 * 2 + var25 + 1];
            }
            for (int var82 = 0; var82 < var26; var82++) {
                var28[var4 + var82 - var26] = -var28[var82];
            }
            for (int var83 = 0; var83 < var26; var83++) {
                var28[var83] = var28[var26 + var83];
            }
            for (int var84 = 0; var84 < var26; var84++) {
                var28[var26 + var84] = -var28[var26 - var84 - 1];
            }
            for (int var85 = 0; var85 < var26; var85++) {
                var28[var25 + var85] = var28[var4 - var85 - 1];
            }
            for (int var86 = var8; var86 < var9; var86++) {
                float var87 = (float) Math.sin(((double) (var86 - var8) + 0.5D) / (double) var10 * 0.5D * 3.141592653589793D);
                field4246[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field4246[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field4239 > 0) {
            int var91 = this.field4239 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field4247) {
                for (int var92 = 0; var92 < this.field4237; var92++) {
                    int var93 = (this.field4239 >> 1) + var92;
                    var90[var92] += this.field4255[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field4246[var94];
                }
            }
        }
        float[] var96 = this.field4255;
        this.field4255 = field4246;
        field4246 = var96;
        this.field4239 = var4;
        this.field4237 = var12 - (var4 >> 1);
        this.field4247 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "([B)V", line = 803)
    private class267(byte[] arg0) {
        this.method1893(arg0);
    }
}
