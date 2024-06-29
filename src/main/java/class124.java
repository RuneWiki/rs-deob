import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class124 extends class151 {

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "Z")
    private static boolean field2241 = false;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    private int field2243;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    private static int field2244;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
    private static int field2249;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "I")
    private int field2251;

    @OriginalMember(owner = "client!gd", name = "D", descriptor = "I")
    private int field2252;

    @OriginalMember(owner = "client!gd", name = "F", descriptor = "I")
    private int field2254;

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "I")
    private static int field2257;

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "I")
    private static int field2258;

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "I")
    private int field2260;

    @OriginalMember(owner = "client!gd", name = "T", descriptor = "I")
    private int field2268;

    @OriginalMember(owner = "client!gd", name = "X", descriptor = "I")
    private int field2272;

    @OriginalMember(owner = "client!gd", name = "Z", descriptor = "I")
    private int field2274;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "Z")
    private boolean field2250;

    @OriginalMember(owner = "client!gd", name = "V", descriptor = "Z")
    private boolean field2270;

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "[B")
    private static byte[] field2248;

    @OriginalMember(owner = "client!gd", name = "Y", descriptor = "[B")
    private byte[] field2273;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "[F")
    private static float[] field2242;

    @OriginalMember(owner = "client!gd", name = "H", descriptor = "[F")
    private static float[] field2256;

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "[F")
    private static float[] field2259;

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "[F")
    private static float[] field2261;

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "[F")
    private float[] field2264;

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "[F")
    private static float[] field2265;

    @OriginalMember(owner = "client!gd", name = "U", descriptor = "[F")
    private static float[] field2269;

    @OriginalMember(owner = "client!gd", name = "W", descriptor = "[F")
    private static float[] field2271;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "[I")
    private static int[] field2245;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "[I")
    private static int[] field2247;

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "[I")
    private static int[] field2262;

    @OriginalMember(owner = "client!gd", name = "G", descriptor = "[Lsl;")
    private static class107[] field2255;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "[Lji;")
    private static class174[] field2246;

    @OriginalMember(owner = "client!gd", name = "E", descriptor = "[Lpk;")
    private static class21[] field2253;

    @OriginalMember(owner = "client!gd", name = "R", descriptor = "[Lih;")
    public static class5[] field2266;

    @OriginalMember(owner = "client!gd", name = "S", descriptor = "[Z")
    private static boolean[] field2267;

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "[[B")
    private byte[][] field2263;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([I)Ls;", line = 6)
    public final class310 method999(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2273 == null) {
            this.field2268 = 0;
            this.field2264 = new float[field2258];
            this.field2273 = new byte[this.field2260];
            this.field2274 = 0;
            this.field2272 = 0;
        }
        while (this.field2272 < this.field2263.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method1003(this.field2272);
            if (var2 != null) {
                int var3 = this.field2274;
                int var4 = var2.length;
                if (var4 > this.field2260 - var3) {
                    var4 = this.field2260 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field2273[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field2274;
                }
                this.field2274 = var3;
            }
            this.field2272++;
        }
        this.field2264 = null;
        byte[] var7 = this.field2273;
        this.field2273 = null;
        return new class310(this.field2243, var7, this.field2254, this.field2251, this.field2250);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([B)V", line = 67)
    private static final void method1000(byte[] arg0) {
        method1004(arg0, 0);
        field2249 = 0x1 << method1008(4);
        field2258 = 0x1 << method1008(4);
        field2269 = new float[field2258];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field2249 : field2258;
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
            int var13 = class64.method440(6367, var5 - 1);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class19.method177(var14, var13, 30);
            }
            if (var1 == 0) {
                field2259 = var6;
                field2242 = var8;
                field2271 = var10;
                field2262 = var12;
            } else {
                field2261 = var6;
                field2256 = var8;
                field2265 = var10;
                field2247 = var12;
            }
        }
        int var15 = method1008(8) + 1;
        field2266 = new class5[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field2266[var16] = new class5();
        }
        int var17 = method1008(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method1008(16);
        }
        int var19 = method1008(6) + 1;
        field2246 = new class174[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field2246[var20] = new class174();
        }
        int var21 = method1008(6) + 1;
        field2255 = new class107[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field2255[var22] = new class107();
        }
        int var23 = method1008(6) + 1;
        field2253 = new class21[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field2253[var24] = new class21();
        }
        int var25 = method1008(6) + 1;
        field2267 = new boolean[var25];
        field2245 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field2267[var26] = method1001() != 0;
            method1008(16);
            method1008(16);
            field2245[var26] = method1008(8);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "()I", line = 220)
    public static final int method1001() {
        int var0 = field2248[field2244] >> field2257 & 0x1;
        field2257++;
        field2244 += field2257 >> 3;
        field2257 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lda;II)Lgd;", line = 228)
    public static final class124 method1002(class143 arg0, int arg1, int arg2) {
        if (method1009(arg0)) {
            byte[] var3 = arg0.method1128(arg2, 0, arg1);
            return var3 == null ? null : new class124(var3);
        } else {
            arg0.method1125(arg1, arg2, (byte) -112);
            return null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)[F", line = 242)
    private final float[] method1003(int arg0) {
        method1004(this.field2263[arg0], 0);
        method1001();
        int var2 = method1008(class64.method440(6367, field2245.length - 1));
        boolean var3 = field2267[var2];
        int var4 = var3 ? field2258 : field2249;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1001() != 0;
            var6 = method1001() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2249 >> 2);
            var9 = (field2249 >> 2) + (var4 >> 2);
            var10 = field2249 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2249 >> 2);
            var12 = (field2249 >> 2) + (var4 - (var4 >> 2));
            var13 = field2249 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class21 var14 = field2253[field2245[var2]];
        int var15 = var14.field332;
        int var16 = var14.field330[var15];
        boolean var17 = !field2246[var16].method1332();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field333; var19++) {
            class107 var20 = field2255[var14.field331[var19]];
            float[] var21 = field2269;
            var20.method870(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field332;
            int var23 = var14.field330[var22];
            field2246[var23].method1335(field2269, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field2269[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field2269;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field2261 : field2259;
            float[] var32 = var3 ? field2256 : field2242;
            float[] var33 = var3 ? field2265 : field2271;
            int[] var34 = var3 ? field2247 : field2262;
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
            int var47 = class64.method440(6367, var4 - 1);
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
                field2269[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2269[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field2268 > 0) {
            int var91 = this.field2268 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field2270) {
                for (int var92 = 0; var92 < this.field2252; var92++) {
                    int var93 = (this.field2268 >> 1) + var92;
                    var90[var92] += this.field2264[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field2269[var94];
                }
            }
        }
        float[] var96 = this.field2264;
        this.field2264 = field2269;
        field2269 = var96;
        this.field2268 = var4;
        this.field2252 = var12 - (var4 >> 1);
        this.field2270 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([BI)V", line = 660)
    private static final void method1004(byte[] arg0, int arg1) {
        field2248 = arg0;
        field2244 = arg1;
        field2257 = 0;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "([B)V", line = 667)
    private final void method1005(byte[] arg0) {
        class94 var2 = new class94(arg0);
        this.field2243 = var2.method747(false);
        this.field2260 = var2.method747(false);
        this.field2254 = var2.method747(false);
        this.field2251 = var2.method747(false);
        if (this.field2251 < 0) {
            this.field2251 = ~this.field2251;
            this.field2250 = true;
        }
        int var3 = var2.method747(false);
        this.field2263 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method756(915905888);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method726(-31267, var7, 0, var5);
            this.field2263[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)F", line = 710)
    public static final float method1006(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "()V", line = 734)
    public static void method1007() {
        field2248 = null;
        field2266 = null;
        field2246 = null;
        field2255 = null;
        field2253 = null;
        field2267 = null;
        field2245 = null;
        field2269 = null;
        field2259 = null;
        field2242 = null;
        field2271 = null;
        field2261 = null;
        field2256 = null;
        field2265 = null;
        field2262 = null;
        field2247 = null;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)I", line = 758)
    public static final int method1008(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2257) {
            int var3 = 8 - field2257;
            int var4 = (0x1 << var3) - 1;
            var1 += (field2248[field2244] >> field2257 & var4) << var2;
            field2257 = 0;
            field2244++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field2248[field2244] >> field2257 & var5) << var2;
            field2257 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lda;)Z", line = 786)
    private static final boolean method1009(class143 arg0) {
        if (!field2241) {
            byte[] var1 = arg0.method1128(0, 0, 0);
            if (var1 == null) {
                return false;
            }
            method1000(var1);
            field2241 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "([B)V", line = 803)
    private class124(byte[] arg0) {
        this.method1005(arg0);
    }
}
