import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class155 extends class5 {

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "Z")
    private static boolean field2343 = false;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
    private int field2342;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "I")
    private int field2344;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
    private static int field2350;

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
    private int field2351;

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
    private static int field2355;

    @OriginalMember(owner = "client!rb", name = "N", descriptor = "I")
    private int field2362;

    @OriginalMember(owner = "client!rb", name = "P", descriptor = "I")
    private int field2364;

    @OriginalMember(owner = "client!rb", name = "Q", descriptor = "I")
    private int field2365;

    @OriginalMember(owner = "client!rb", name = "V", descriptor = "I")
    private int field2370;

    @OriginalMember(owner = "client!rb", name = "X", descriptor = "I")
    private static int field2372;

    @OriginalMember(owner = "client!rb", name = "Z", descriptor = "I")
    private static int field2374;

    @OriginalMember(owner = "client!rb", name = "ab", descriptor = "I")
    private int field2375;

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "Z")
    private boolean field2353;

    @OriginalMember(owner = "client!rb", name = "K", descriptor = "Z")
    private boolean field2359;

    @OriginalMember(owner = "client!rb", name = "T", descriptor = "[B")
    private byte[] field2368;

    @OriginalMember(owner = "client!rb", name = "Y", descriptor = "[B")
    private static byte[] field2373;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "[F")
    private float[] field2345;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "[F")
    private static float[] field2348;

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "[F")
    private static float[] field2354;

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "[F")
    private static float[] field2356;

    @OriginalMember(owner = "client!rb", name = "I", descriptor = "[F")
    private static float[] field2357;

    @OriginalMember(owner = "client!rb", name = "L", descriptor = "[F")
    private static float[] field2360;

    @OriginalMember(owner = "client!rb", name = "M", descriptor = "[F")
    private static float[] field2361;

    @OriginalMember(owner = "client!rb", name = "W", descriptor = "[F")
    private static float[] field2371;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "[I")
    private static int[] field2347;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "[I")
    private static int[] field2349;

    @OriginalMember(owner = "client!rb", name = "U", descriptor = "[I")
    private static int[] field2369;

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "[Lub;")
    private static class11[] field2346;

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "[Lbh;")
    public static class18[] field2352;

    @OriginalMember(owner = "client!rb", name = "O", descriptor = "[Lql;")
    private static class337[] field2363;

    @OriginalMember(owner = "client!rb", name = "S", descriptor = "[Lcg;")
    private static class57[] field2367;

    @OriginalMember(owner = "client!rb", name = "R", descriptor = "[Z")
    private static boolean[] field2366;

    @OriginalMember(owner = "client!rb", name = "J", descriptor = "[[B")
    private byte[][] field2358;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)I", line = 5)
    public static final int method1163(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2372) {
            int var3 = 8 - field2372;
            int var4 = (0x1 << var3) - 1;
            var1 += (field2373[field2350] >> field2372 & var4) << var2;
            field2372 = 0;
            field2350++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field2373[field2350] >> field2372 & var5) << var2;
            field2372 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([BI)V", line = 33)
    private static final void method1164(byte[] arg0, int arg1) {
        field2373 = arg0;
        field2350 = arg1;
        field2372 = 0;
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)[F", line = 38)
    private final float[] method1165(int arg0) {
        method1164(this.field2358[arg0], 0);
        method1170();
        int var2 = method1163(class36.method273(16, field2369.length - 1));
        boolean var3 = field2366[var2];
        int var4 = var3 ? field2374 : field2355;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1170() != 0;
            var6 = method1170() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2355 >> 2);
            var9 = (field2355 >> 2) + (var4 >> 2);
            var10 = field2355 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2355 >> 2);
            var12 = (field2355 >> 2) + (var4 - (var4 >> 2));
            var13 = field2355 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class11 var14 = field2346[field2369[var2]];
        int var15 = var14.field148;
        int var16 = var14.field149[var15];
        boolean var17 = !field2363[var16].method2349();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field147; var19++) {
            class57 var20 = field2367[var14.field150[var19]];
            float[] var21 = field2348;
            var20.method407(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field148;
            int var23 = var14.field149[var22];
            field2363[var23].method2353(field2348, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field2348[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field2348;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field2360 : field2354;
            float[] var32 = var3 ? field2371 : field2357;
            float[] var33 = var3 ? field2356 : field2361;
            int[] var34 = var3 ? field2349 : field2347;
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
            int var47 = class36.method273(16, var4 - 1);
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
                field2348[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2348[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field2344 > 0) {
            int var91 = this.field2344 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field2353) {
                for (int var92 = 0; var92 < this.field2342; var92++) {
                    int var93 = (this.field2344 >> 1) + var92;
                    var90[var92] += this.field2345[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field2348[var94];
                }
            }
        }
        float[] var96 = this.field2345;
        this.field2345 = field2348;
        field2348 = var96;
        this.field2344 = var4;
        this.field2342 = var12 - (var4 >> 1);
        this.field2353 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)F", line = 451)
    public static final float method1166(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljd;)Z", line = 464)
    private static final boolean method1167(class95 arg0) {
        if (!field2343) {
            byte[] var1 = arg0.method696(0, (byte) 126, 0);
            if (var1 == null) {
                return false;
            }
            method1168(var1);
            field2343 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([B)V", line = 479)
    private static final void method1168(byte[] arg0) {
        method1164(arg0, 0);
        field2355 = 0x1 << method1163(4);
        field2374 = 0x1 << method1163(4);
        field2348 = new float[field2374];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field2355 : field2374;
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
            int var13 = class36.method273(16, var5 - 1);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class8.method78(var13, 84, var14);
            }
            if (var1 == 0) {
                field2354 = var6;
                field2357 = var8;
                field2361 = var10;
                field2347 = var12;
            } else {
                field2360 = var6;
                field2371 = var8;
                field2356 = var10;
                field2349 = var12;
            }
        }
        int var15 = method1163(8) + 1;
        field2352 = new class18[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field2352[var16] = new class18();
        }
        int var17 = method1163(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method1163(16);
        }
        int var19 = method1163(6) + 1;
        field2363 = new class337[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field2363[var20] = new class337();
        }
        int var21 = method1163(6) + 1;
        field2367 = new class57[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field2367[var22] = new class57();
        }
        int var23 = method1163(6) + 1;
        field2346 = new class11[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field2346[var24] = new class11();
        }
        int var25 = method1163(6) + 1;
        field2366 = new boolean[var25];
        field2369 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field2366[var26] = method1170() != 0;
            method1163(16);
            method1163(16);
            field2369[var26] = method1163(8);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "([I)Lid;", line = 634)
    public final class266 method1169(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2368 == null) {
            this.field2344 = 0;
            this.field2345 = new float[field2374];
            this.field2368 = new byte[this.field2364];
            this.field2370 = 0;
            this.field2375 = 0;
        }
        while (this.field2375 < this.field2358.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method1165(this.field2375);
            if (var2 != null) {
                int var3 = this.field2370;
                int var4 = var2.length;
                if (var4 > this.field2364 - var3) {
                    var4 = this.field2364 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field2368[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field2370;
                }
                this.field2370 = var3;
            }
            this.field2375++;
        }
        this.field2345 = null;
        byte[] var7 = this.field2368;
        this.field2368 = null;
        return new class266(this.field2365, var7, this.field2362, this.field2351, this.field2359);
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "()I", line = 693)
    public static final int method1170() {
        int var0 = field2373[field2350] >> field2372 & 0x1;
        field2372++;
        field2350 += field2372 >> 3;
        field2372 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljd;II)Lrb;", line = 714)
    public static final class155 method1171(class95 arg0, int arg1, int arg2) {
        if (method1167(arg0)) {
            byte[] var3 = arg0.method696(arg2, (byte) 127, arg1);
            return var3 == null ? null : new class155(var3);
        } else {
            arg0.method716(arg2, 15177, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "()V", line = 734)
    public static void method1172() {
        field2373 = null;
        field2352 = null;
        field2363 = null;
        field2367 = null;
        field2346 = null;
        field2366 = null;
        field2369 = null;
        field2348 = null;
        field2354 = null;
        field2357 = null;
        field2361 = null;
        field2360 = null;
        field2371 = null;
        field2356 = null;
        field2347 = null;
        field2349 = null;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "([B)V", line = 755)
    private class155(byte[] arg0) {
        this.method1173(arg0);
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "([B)V", line = 768)
    private final void method1173(byte[] arg0) {
        class254 var2 = new class254(arg0);
        this.field2365 = var2.method1741(-32769);
        this.field2364 = var2.method1741(-32769);
        this.field2362 = var2.method1741(-32769);
        this.field2351 = var2.method1741(-32769);
        if (this.field2351 < 0) {
            this.field2351 = ~this.field2351;
            this.field2359 = true;
        }
        int var3 = var2.method1741(-32769);
        this.field2358 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1774((byte) -128);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1739(var7, 0, -12687, var5);
            this.field2358[var4] = var7;
        }
    }
}
