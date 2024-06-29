import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class413 extends class168 {

    @OriginalMember(owner = "client!rm", name = "y", descriptor = "Z")
    private static boolean field5262 = false;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
    private int field5248;

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "I")
    private static int field5252;

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "I")
    private int field5253;

    @OriginalMember(owner = "client!rm", name = "r", descriptor = "I")
    private int field5255;

    @OriginalMember(owner = "client!rm", name = "v", descriptor = "I")
    private int field5259;

    @OriginalMember(owner = "client!rm", name = "A", descriptor = "I")
    private int field5264;

    @OriginalMember(owner = "client!rm", name = "D", descriptor = "I")
    private static int field5267;

    @OriginalMember(owner = "client!rm", name = "H", descriptor = "I")
    private static int field5271;

    @OriginalMember(owner = "client!rm", name = "I", descriptor = "I")
    private static int field5272;

    @OriginalMember(owner = "client!rm", name = "J", descriptor = "I")
    private int field5273;

    @OriginalMember(owner = "client!rm", name = "N", descriptor = "I")
    private int field5277;

    @OriginalMember(owner = "client!rm", name = "P", descriptor = "I")
    private int field5279;

    @OriginalMember(owner = "client!rm", name = "t", descriptor = "Z")
    private boolean field5257;

    @OriginalMember(owner = "client!rm", name = "L", descriptor = "Z")
    private boolean field5275;

    @OriginalMember(owner = "client!rm", name = "z", descriptor = "[B")
    private static byte[] field5263;

    @OriginalMember(owner = "client!rm", name = "O", descriptor = "[B")
    private byte[] field5278;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "[F")
    private static float[] field5249;

    @OriginalMember(owner = "client!rm", name = "s", descriptor = "[F")
    private static float[] field5256;

    @OriginalMember(owner = "client!rm", name = "x", descriptor = "[F")
    private static float[] field5261;

    @OriginalMember(owner = "client!rm", name = "B", descriptor = "[F")
    private static float[] field5265;

    @OriginalMember(owner = "client!rm", name = "C", descriptor = "[F")
    private float[] field5266;

    @OriginalMember(owner = "client!rm", name = "E", descriptor = "[F")
    private static float[] field5268;

    @OriginalMember(owner = "client!rm", name = "F", descriptor = "[F")
    private static float[] field5269;

    @OriginalMember(owner = "client!rm", name = "K", descriptor = "[F")
    private static float[] field5274;

    @OriginalMember(owner = "client!rm", name = "u", descriptor = "[I")
    private static int[] field5258;

    @OriginalMember(owner = "client!rm", name = "w", descriptor = "[I")
    private static int[] field5260;

    @OriginalMember(owner = "client!rm", name = "G", descriptor = "[I")
    private static int[] field5270;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "[Lbc;")
    private static class369[] field5247;

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "[Lnv;")
    private static class420[] field5251;

    @OriginalMember(owner = "client!rm", name = "Q", descriptor = "[Lsj;")
    public static class462[] field5280;

    @OriginalMember(owner = "client!rm", name = "q", descriptor = "[Llu;")
    private static class715[] field5254;

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "[Z")
    private static boolean[] field5250;

    @OriginalMember(owner = "client!rm", name = "M", descriptor = "[[B")
    private byte[][] field5276;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "([B)V")
    private final void method2310(byte[] arg0) {
        class461 var2 = new class461(arg0);
        this.field5255 = var2.method2622(-539564808);
        this.field5259 = var2.method2622(-539564808);
        this.field5273 = var2.method2622(-539564808);
        this.field5248 = var2.method2622(-539564808);
        if (this.field5248 < 0) {
            this.field5248 = ~this.field5248;
            this.field5257 = true;
        }
        int var3 = var2.method2622(-539564808);
        this.field5276 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2600((byte) -128);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method2573(var7, (byte) -77, var5, 0);
            this.field5276[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "([BI)V")
    private static final void method2311(byte[] arg0, int arg1) {
        field5263 = arg0;
        field5267 = arg1;
        field5252 = 0;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "([I)Lct;")
    public final class148 method2312(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field5278 == null) {
            this.field5264 = 0;
            this.field5266 = new float[field5271];
            this.field5278 = new byte[this.field5259];
            this.field5277 = 0;
            this.field5279 = 0;
        }
        while (this.field5279 < this.field5276.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method2315(this.field5279);
            if (var3 != null) {
                int var4 = this.field5277;
                int var5 = var3.length;
                if (var5 > this.field5259 - var4) {
                    var5 = this.field5259 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field5278[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field5277;
                }
                this.field5277 = var4;
            }
            this.field5279++;
        }
        this.field5266 = null;
        byte[] var2 = this.field5278;
        this.field5278 = null;
        return new class148(this.field5255, var2, this.field5273, this.field5248, this.field5257);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lnd;)Z")
    private static final boolean method2313(class547 arg0) {
        if (!field5262) {
            byte[] var1 = arg0.method3153(0, 0, 0);
            if (var1 == null) {
                return false;
            }
            method2316(var1);
        }
        return true;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lnd;I)Lrm;")
    public static final class413 method2314(class547 arg0, int arg1) {
        if (method2313(arg0)) {
            byte[] var2 = arg0.method3166((byte) 125, arg1);
            return var2 == null ? null : new class413(var2);
        } else {
            arg0.method3154(arg1, (byte) 98);
            return null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)[F")
    private final float[] method2315(int arg0) {
        method2311(this.field5276[arg0], 0);
        method2321();
        int var2 = method2319(class423.method2356(field5258.length - 1, 1));
        boolean var3 = field5250[var2];
        int var4 = var3 ? field5271 : field5272;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2321() != 0;
            var6 = method2321() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field5272 >> 2);
            var9 = (field5272 >> 2) + (var4 >> 2);
            var10 = field5272 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field5272 >> 2);
            var12 = (field5272 >> 2) + (var4 - (var4 >> 2));
            var13 = field5272 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class369 var14 = field5247[field5258[var2]];
        int var15 = var14.field4763;
        int var16 = var14.field4761[var15];
        boolean var17 = !field5254[var16].method4001();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field4762; var19++) {
            class420 var95 = field5251[var14.field4760[var19]];
            float[] var96 = field5274;
            var95.method2345(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field4763;
            int var21 = var14.field4761[var20];
            field5254[var21].method4006(field5274, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field5274[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field5274;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field5265 : field5249;
            float[] var30 = var3 ? field5268 : field5261;
            float[] var31 = var3 ? field5256 : field5269;
            int[] var32 = var3 ? field5260 : field5270;
            for (int var33 = 0; var33 < var24; var33++) {
                float var91 = var26[var33 * 4] - var26[var4 - var33 * 4 - 1];
                float var92 = var26[var33 * 4 + 2] - var26[var4 - var33 * 4 - 3];
                float var93 = var29[var33 * 2];
                float var94 = var29[var33 * 2 + 1];
                var26[var4 - var33 * 4 - 1] = var91 * var93 - var92 * var94;
                var26[var4 - var33 * 4 - 3] = var91 * var94 + var92 * var93;
            }
            for (int var34 = 0; var34 < var25; var34++) {
                float var85 = var26[var34 * 4 + var23 + 3];
                float var86 = var26[var34 * 4 + var23 + 1];
                float var87 = var26[var34 * 4 + 3];
                float var88 = var26[var34 * 4 + 1];
                var26[var34 * 4 + var23 + 3] = var85 + var87;
                var26[var34 * 4 + var23 + 1] = var86 + var88;
                float var89 = var29[var23 - var34 * 4 - 4];
                float var90 = var29[var23 - var34 * 4 - 3];
                var26[var34 * 4 + 3] = (var85 - var87) * var89 - (var86 - var88) * var90;
                var26[var34 * 4 + 1] = (var85 - var87) * var90 + (var86 - var88) * var89;
            }
            int var35 = class423.method2356(var4 - 1, 1);
            for (int var36 = 0; var36 < var35 - 3; var36++) {
                int var72 = var4 >> var36 + 2;
                int var73 = 0x8 << var36;
                for (int var74 = 0; var74 < 0x2 << var36; var74++) {
                    int var75 = var4 - var72 * 2 * var74;
                    int var76 = var4 - (var74 * 2 + 1) * var72;
                    for (int var77 = 0; var77 < var4 >> var36 + 4; var77++) {
                        int var78 = var77 * 4;
                        float var79 = var26[var75 - var78 - 1];
                        float var80 = var26[var75 - var78 - 3];
                        float var81 = var26[var76 - var78 - 1];
                        float var82 = var26[var76 - var78 - 3];
                        var26[var75 - var78 - 1] = var79 + var81;
                        var26[var75 - var78 - 3] = var80 + var82;
                        float var83 = var29[var73 * var77];
                        float var84 = var29[var73 * var77 + 1];
                        var26[var76 - var78 - 1] = (var79 - var81) * var83 - (var80 - var82) * var84;
                        var26[var76 - var78 - 3] = (var79 - var81) * var84 + (var80 - var82) * var83;
                    }
                }
            }
            for (int var37 = 1; var37 < var25 - 1; var37++) {
                int var65 = var32[var37];
                if (var37 < var65) {
                    int var66 = var37 * 8;
                    int var67 = var65 * 8;
                    float var68 = var26[var66 + 1];
                    var26[var66 + 1] = var26[var67 + 1];
                    var26[var67 + 1] = var68;
                    float var69 = var26[var66 + 3];
                    var26[var66 + 3] = var26[var67 + 3];
                    var26[var67 + 3] = var69;
                    float var70 = var26[var66 + 5];
                    var26[var66 + 5] = var26[var67 + 5];
                    var26[var67 + 5] = var70;
                    float var71 = var26[var66 + 7];
                    var26[var66 + 7] = var26[var67 + 7];
                    var26[var67 + 7] = var71;
                }
            }
            for (int var38 = 0; var38 < var23; var38++) {
                var26[var38] = var26[var38 * 2 + 1];
            }
            for (int var39 = 0; var39 < var25; var39++) {
                var26[var4 - var39 * 2 - 1] = var26[var39 * 4];
                var26[var4 - var39 * 2 - 2] = var26[var39 * 4 + 1];
                var26[var4 - var24 - var39 * 2 - 1] = var26[var39 * 4 + 2];
                var26[var4 - var24 - var39 * 2 - 2] = var26[var39 * 4 + 3];
            }
            for (int var40 = 0; var40 < var25; var40++) {
                float var57 = var31[var40 * 2];
                float var58 = var31[var40 * 2 + 1];
                float var59 = var26[var40 * 2 + var23];
                float var60 = var26[var40 * 2 + var23 + 1];
                float var61 = var26[var4 - var40 * 2 - 2];
                float var62 = var26[var4 - var40 * 2 - 1];
                float var63 = (var59 - var61) * var58 + (var60 + var62) * var57;
                var26[var40 * 2 + var23] = (var59 + var61 + var63) * 0.5F;
                var26[var4 - var40 * 2 - 2] = (var59 + var61 - var63) * 0.5F;
                float var64 = (var60 + var62) * var58 - (var59 - var61) * var57;
                var26[var40 * 2 + var23 + 1] = (var60 + var64 - var62) * 0.5F;
                var26[var4 - var40 * 2 - 1] = (var62 + var64 - var60) * 0.5F;
            }
            for (int var41 = 0; var41 < var24; var41++) {
                var26[var41] = var30[var41 * 2] * var26[var41 * 2 + var23] + var30[var41 * 2 + 1] * var26[var41 * 2 + var23 + 1];
                var26[var23 - var41 - 1] = var26[var41 * 2 + var23] * var30[var41 * 2 + 1] - var30[var41 * 2] * var26[var41 * 2 + var23 + 1];
            }
            for (int var42 = 0; var42 < var24; var42++) {
                var26[var4 + var42 - var24] = -var26[var42];
            }
            for (int var43 = 0; var43 < var24; var43++) {
                var26[var43] = var26[var24 + var43];
            }
            for (int var44 = 0; var44 < var24; var44++) {
                var26[var24 + var44] = -var26[var24 - var44 - 1];
            }
            for (int var45 = 0; var45 < var24; var45++) {
                var26[var23 + var45] = var26[var4 - var45 - 1];
            }
            for (int var46 = var8; var46 < var9; var46++) {
                float var56 = (float) Math.sin(((double) (var46 - var8) + 0.5D) / (double) var10 * 0.5D * 3.141592653589793D);
                field5274[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field5274[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field5264 > 0) {
            int var49 = this.field5264 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field5275) {
                for (int var50 = 0; var50 < this.field5253; var50++) {
                    int var51 = (this.field5264 >> 1) + var50;
                    var48[var50] += this.field5266[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field5274[var52];
                }
            }
        }
        float[] var54 = this.field5266;
        this.field5266 = field5274;
        field5274 = var54;
        this.field5264 = var4;
        this.field5253 = var12 - (var4 >> 1);
        this.field5275 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "([B)V")
    private static final void method2316(byte[] arg0) {
        method2311(arg0, 0);
        field5272 = 0x1 << method2319(4);
        field5271 = 0x1 << method2319(4);
        field5274 = new float[field5271];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field5272 : field5271;
            int var15 = var14 >> 1;
            int var16 = var14 >> 2;
            int var17 = var14 >> 3;
            float[] var18 = new float[var15];
            for (int var19 = 0; var19 < var16; var19++) {
                var18[var19 * 2] = (float) Math.cos((double) (var19 * 4) * 3.141592653589793D / (double) var14);
                var18[var19 * 2 + 1] = -((float) Math.sin((double) (var19 * 4) * 3.141592653589793D / (double) var14));
            }
            float[] var20 = new float[var15];
            for (int var21 = 0; var21 < var16; var21++) {
                var20[var21 * 2] = (float) Math.cos((double) (var21 * 2 + 1) * 3.141592653589793D / (double) (var14 * 2));
                var20[var21 * 2 + 1] = (float) Math.sin((double) (var21 * 2 + 1) * 3.141592653589793D / (double) (var14 * 2));
            }
            float[] var22 = new float[var16];
            for (int var23 = 0; var23 < var17; var23++) {
                var22[var23 * 2] = (float) Math.cos((double) (var23 * 4 + 2) * 3.141592653589793D / (double) var14);
                var22[var23 * 2 + 1] = -((float) Math.sin((double) (var23 * 4 + 2) * 3.141592653589793D / (double) var14));
            }
            int[] var24 = new int[var17];
            int var25 = class423.method2356(var17 - 1, 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class761.method4229(false, var25, var26);
            }
            if (var1 == 0) {
                field5249 = var18;
                field5261 = var20;
                field5269 = var22;
                field5270 = var24;
            } else {
                field5265 = var18;
                field5268 = var20;
                field5256 = var22;
                field5260 = var24;
            }
        }
        int var2 = method2319(8) + 1;
        field5280 = new class462[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field5280[var3] = new class462();
        }
        int var4 = method2319(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method2319(16);
        }
        int var6 = method2319(6) + 1;
        field5254 = new class715[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field5254[var7] = new class715();
        }
        int var8 = method2319(6) + 1;
        field5251 = new class420[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field5251[var9] = new class420();
        }
        int var10 = method2319(6) + 1;
        field5247 = new class369[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field5247[var11] = new class369();
        }
        int var12 = method2319(6) + 1;
        field5250 = new boolean[var12];
        field5258 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field5250[var13] = method2321() != 0;
            method2319(16);
            method2319(16);
            field5258[var13] = method2319(8);
        }
        field5262 = true;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)F")
    public static final float method2317(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lnd;II)Lrm;")
    public static final class413 method2318(class547 arg0, int arg1, int arg2) {
        if (method2313(arg0)) {
            byte[] var3 = arg0.method3153(arg2, 0, arg1);
            return var3 == null ? null : new class413(var3);
        } else {
            arg0.method3157(arg2, 0, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)I")
    public static final int method2319(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field5252) {
            int var4 = 8 - field5252;
            int var5 = (0x1 << var4) - 1;
            var1 += (field5263[field5267] >> field5252 & var5) << var2;
            field5252 = 0;
            field5267++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field5263[field5267] >> field5252 & var3) << var2;
            field5252 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "()V")
    public static void method2320() {
        field5263 = null;
        field5280 = null;
        field5254 = null;
        field5251 = null;
        field5247 = null;
        field5250 = null;
        field5258 = null;
        field5274 = null;
        field5249 = null;
        field5261 = null;
        field5269 = null;
        field5265 = null;
        field5268 = null;
        field5256 = null;
        field5270 = null;
        field5260 = null;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "()I")
    public static final int method2321() {
        int var0 = field5263[field5267] >> field5252 & 0x1;
        field5252++;
        field5267 += field5252 >> 3;
        field5252 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "([B)V")
    private class413(byte[] arg0) {
        this.method2310(arg0);
    }
}
