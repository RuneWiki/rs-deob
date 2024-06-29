import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class13 {

    @OriginalMember(owner = "client!be", name = "i", descriptor = "Z")
    private static boolean field299 = false;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    private static int field292;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    private int field293;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    private static int field294;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    private static int field295;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    private static int field300;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    private static int field307;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "I")
    private int field309;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    private int field311;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "I")
    private int field314;

    @OriginalMember(owner = "client!be", name = "A", descriptor = "I")
    private static int field317;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "Z")
    private boolean field310;

    @OriginalMember(owner = "client!be", name = "C", descriptor = "Z")
    private static boolean field319;

    @OriginalMember(owner = "client!be", name = "E", descriptor = "[B")
    private static byte[] field321;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "[F")
    private static float[] field296;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "[F")
    private static float[] field297;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "[F")
    private static float[] field298;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "[F")
    private static float[] field302;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "[F")
    private static float[] field312;

    @OriginalMember(owner = "client!be", name = "y", descriptor = "[F")
    private static float[] field315;

    @OriginalMember(owner = "client!be", name = "B", descriptor = "[F")
    private static float[] field318;

    @OriginalMember(owner = "client!be", name = "D", descriptor = "[F")
    private static float[] field320;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "[I")
    private static int[] field291;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "[I")
    private static int[] field303;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "[I")
    private static int[] field306;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "[Lp;")
    public static class106[] field304;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "[Lbc;")
    private static class10[] field313;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "[Ltd;")
    private static class131[] field308;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "[Lda;")
    private static class22[] field301;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "[Z")
    private static boolean[] field316;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "[[B")
    private byte[][] field305;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([B)V")
    private static final void method131(byte[] arg0) {
        method140(arg0, 0);
        field307 = 0x1 << method132(4);
        field317 = 0x1 << method132(4);
        field296 = new float[field317];
        field302 = new float[field317];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field307 : field317;
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
            int var25 = class132.method1065(var17 - 1, (byte) -35);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class12.method128(var25, 0, var26);
            }
            if (var1 == 0) {
                field298 = var18;
                field315 = var20;
                field320 = var22;
                field291 = var24;
            } else {
                field297 = var18;
                field312 = var20;
                field318 = var22;
                field306 = var24;
            }
        }
        int var2 = method132(8) + 1;
        field304 = new class106[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field304[var3] = new class106();
        }
        int var4 = method132(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method132(16);
        }
        int var6 = method132(6) + 1;
        field313 = new class10[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field313[var7] = new class10();
        }
        int var8 = method132(6) + 1;
        field301 = new class22[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field301[var9] = new class22();
        }
        int var10 = method132(6) + 1;
        field308 = new class131[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field308[var11] = new class131();
        }
        int var12 = method132(6) + 1;
        field316 = new boolean[var12];
        field303 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field316[var13] = method139() != 0;
            method132(16);
            method132(16);
            field303[var13] = method132(8);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)I")
    public static final int method132(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field300) {
            int var4 = 8 - field300;
            int var5 = (0x1 << var4) - 1;
            var1 += (field321[field295] >> field300 & var5) << var2;
            field300 = 0;
            field295++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field321[field295] >> field300 & var3) << var2;
            field300 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)F")
    public static final float method133(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)[F")
    private final float[] method134(int arg0) {
        method140(this.field305[arg0], 0);
        method139();
        int var2 = method132(class132.method1065(field303.length - 1, (byte) -35));
        boolean var3 = field316[var2];
        int var4 = var3 ? field317 : field307;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method139() != 0;
            var6 = method139() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field307 >> 2);
            var9 = (field307 >> 2) + (var4 >> 2);
            var10 = field307 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field307 >> 2);
            var12 = (field307 >> 2) + (var4 - (var4 >> 2));
            var13 = field307 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class131 var14 = field308[field303[var2]];
        int var15 = var14.field3207;
        int var16 = var14.field3206[var15];
        boolean var17 = !field313[var16].method116();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field3204; var19++) {
            class22 var95 = field301[var14.field3205[var19]];
            float[] var96 = field296;
            var95.method206(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field3207;
            int var21 = var14.field3206[var20];
            field313[var21].method113(field296, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field296[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field296;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field297 : field298;
            float[] var30 = var3 ? field312 : field315;
            float[] var31 = var3 ? field318 : field320;
            int[] var32 = var3 ? field306 : field291;
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
            int var35 = class132.method1065(var4 - 1, (byte) -35);
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
                field296[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field296[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (field292 > 0) {
            int var49 = field292 + var4 >> 2;
            var48 = new float[var49];
            if (!field319) {
                for (int var50 = 0; var50 < field294; var50++) {
                    int var51 = (field292 >> 1) + var50;
                    var48[var50] += field302[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field296[var52];
                }
            }
        }
        float[] var54 = field302;
        field302 = field296;
        field296 = var54;
        field292 = var4;
        field294 = var12 - (var4 >> 1);
        field319 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "([B)V")
    private final void method135(byte[] arg0) {
        class57 var2 = new class57(arg0);
        this.field309 = var2.method495(16711680);
        this.field314 = var2.method495(16711680);
        this.field293 = var2.method495(16711680);
        this.field311 = var2.method495(16711680);
        if (this.field311 < 0) {
            this.field311 = ~this.field311;
            this.field310 = true;
        }
        int var3 = var2.method495(16711680);
        this.field305 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method510(-120);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method493(0, var7, false, var5);
            this.field305[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "()Lfc;")
    public final class38 method136() {
        field292 = 0;
        byte[] var1 = new byte[this.field314];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field305.length; var3++) {
            float[] var4 = this.method134(var3);
            if (var4 != null) {
                int var5 = var4.length;
                if (var5 > this.field314 - var2) {
                    var5 = this.field314 - var2;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var4[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    var1[var2++] = (byte) (var7 - 128);
                }
            }
        }
        return new class38(this.field309, var1, this.field293, this.field311, this.field310);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lpc;)Z")
    private static final boolean method137(class105 arg0) {
        if (!field299) {
            byte[] var1 = arg0.method903(0, (byte) -128, 0);
            if (var1 == null) {
                return false;
            }
            method131(var1);
            field299 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lpc;I)Lbe;")
    public static final class13 method138(class105 arg0, int arg1) {
        if (method137(arg0)) {
            byte[] var2 = arg0.method897(arg1, 0);
            return var2 == null ? null : new class13(var2);
        } else {
            arg0.method888(arg1, -102);
            return null;
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "()I")
    public static final int method139() {
        int var0 = field321[field295] >> field300 & 0x1;
        field300++;
        field295 += field300 >> 3;
        field300 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([BI)V")
    private static final void method140(byte[] arg0, int arg1) {
        field321 = arg0;
        field295 = arg1;
        field300 = 0;
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "()V")
    public static void method141() {
        field321 = null;
        field304 = null;
        field313 = null;
        field301 = null;
        field308 = null;
        field316 = null;
        field303 = null;
        field302 = null;
        field296 = null;
        field298 = null;
        field315 = null;
        field320 = null;
        field297 = null;
        field312 = null;
        field318 = null;
        field291 = null;
        field306 = null;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "([B)V")
    private class13(byte[] arg0) {
        this.method135(arg0);
    }
}
