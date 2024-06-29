import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class168 extends class311 {

    @OriginalMember(owner = "client!rm", name = "M", descriptor = "Z")
    private static boolean field2373 = false;

    @OriginalMember(owner = "client!rm", name = "x", descriptor = "I")
    private static int field2359;

    @OriginalMember(owner = "client!rm", name = "z", descriptor = "I")
    private static int field2361;

    @OriginalMember(owner = "client!rm", name = "D", descriptor = "I")
    private int field2365;

    @OriginalMember(owner = "client!rm", name = "I", descriptor = "I")
    private int field2369;

    @OriginalMember(owner = "client!rm", name = "L", descriptor = "I")
    private int field2372;

    @OriginalMember(owner = "client!rm", name = "N", descriptor = "I")
    private int field2374;

    @OriginalMember(owner = "client!rm", name = "Q", descriptor = "I")
    private int field2377;

    @OriginalMember(owner = "client!rm", name = "R", descriptor = "I")
    private static int field2378;

    @OriginalMember(owner = "client!rm", name = "T", descriptor = "I")
    private int field2380;

    @OriginalMember(owner = "client!rm", name = "V", descriptor = "I")
    private static int field2382;

    @OriginalMember(owner = "client!rm", name = "X", descriptor = "I")
    private int field2383;

    @OriginalMember(owner = "client!rm", name = "Y", descriptor = "I")
    private int field2384;

    @OriginalMember(owner = "client!rm", name = "y", descriptor = "Z")
    private boolean field2360;

    @OriginalMember(owner = "client!rm", name = "O", descriptor = "Z")
    private boolean field2375;

    @OriginalMember(owner = "client!rm", name = "t", descriptor = "[B")
    private static byte[] field2355;

    @OriginalMember(owner = "client!rm", name = "U", descriptor = "[B")
    private byte[] field2381;

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "[F")
    private static float[] field2351;

    @OriginalMember(owner = "client!rm", name = "q", descriptor = "[F")
    private static float[] field2352;

    @OriginalMember(owner = "client!rm", name = "s", descriptor = "[F")
    private static float[] field2354;

    @OriginalMember(owner = "client!rm", name = "u", descriptor = "[F")
    private float[] field2356;

    @OriginalMember(owner = "client!rm", name = "w", descriptor = "[F")
    private static float[] field2358;

    @OriginalMember(owner = "client!rm", name = "A", descriptor = "[F")
    private static float[] field2362;

    @OriginalMember(owner = "client!rm", name = "H", descriptor = "[F")
    private static float[] field2368;

    @OriginalMember(owner = "client!rm", name = "J", descriptor = "[F")
    private static float[] field2370;

    @OriginalMember(owner = "client!rm", name = "v", descriptor = "[I")
    private static int[] field2357;

    @OriginalMember(owner = "client!rm", name = "K", descriptor = "[I")
    private static int[] field2371;

    @OriginalMember(owner = "client!rm", name = "P", descriptor = "[I")
    private static int[] field2376;

    @OriginalMember(owner = "client!rm", name = "F", descriptor = "[Lkn;")
    private static class16[] field2366;

    @OriginalMember(owner = "client!rm", name = "r", descriptor = "[Lwl;")
    public static class275[] field2353;

    @OriginalMember(owner = "client!rm", name = "B", descriptor = "[Lsl;")
    private static class28[] field2363;

    @OriginalMember(owner = "client!rm", name = "S", descriptor = "[Lsi;")
    private static class322[] field2379;

    @OriginalMember(owner = "client!rm", name = "C", descriptor = "[Z")
    private static boolean[] field2364;

    @OriginalMember(owner = "client!rm", name = "G", descriptor = "[[B")
    private byte[][] field2367;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "([B)V", line = 9)
    private static final void method1193(byte[] arg0) {
        method1195(arg0, 0);
        field2361 = 0x1 << method1201(4);
        field2359 = 0x1 << method1201(4);
        field2351 = new float[field2359];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2361 : field2359;
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
            int var25 = class85.method679((byte) -105, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class54.method430(-24027, var25, var26);
            }
            if (var1 == 0) {
                field2354 = var18;
                field2368 = var20;
                field2358 = var22;
                field2357 = var24;
            } else {
                field2362 = var18;
                field2352 = var20;
                field2370 = var22;
                field2371 = var24;
            }
        }
        int var2 = method1201(8) + 1;
        field2353 = new class275[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2353[var3] = new class275();
        }
        int var4 = method1201(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1201(16);
        }
        int var6 = method1201(6) + 1;
        field2363 = new class28[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2363[var7] = new class28();
        }
        int var8 = method1201(6) + 1;
        field2379 = new class322[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2379[var9] = new class322();
        }
        int var10 = method1201(6) + 1;
        field2366 = new class16[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2366[var11] = new class16();
        }
        int var12 = method1201(6) + 1;
        field2364 = new boolean[var12];
        field2376 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2364[var13] = method1194() != 0;
            method1201(16);
            method1201(16);
            field2376[var13] = method1201(8);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "()I", line = 161)
    public static final int method1194() {
        int var0 = field2355[field2378] >> field2382 & 0x1;
        field2382++;
        field2378 += field2382 >> 3;
        field2382 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "([BI)V", line = 171)
    private static final void method1195(byte[] arg0, int arg1) {
        field2355 = arg0;
        field2378 = arg1;
        field2382 = 0;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "([B)V", line = 184)
    private final void method1196(byte[] arg0) {
        class366 var2 = new class366(arg0);
        this.field2377 = var2.method2258(1177515464);
        this.field2380 = var2.method2258(1177515464);
        this.field2365 = var2.method2258(1177515464);
        this.field2372 = var2.method2258(1177515464);
        if (this.field2372 < 0) {
            this.field2372 = ~this.field2372;
            this.field2360 = true;
        }
        int var3 = var2.method2258(1177515464);
        this.field2367 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2306((byte) 72);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method2249(0, (byte) -110, var5, var7);
            this.field2367[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lij;II)Lrm;", line = 227)
    public static final class168 method1197(class316 arg0, int arg1, int arg2) {
        if (method1202(arg0)) {
            byte[] var3 = arg0.method1926(0, arg2, arg1);
            return var3 == null ? null : new class168(var3);
        } else {
            arg0.method1906(-1, arg2, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)F", line = 244)
    public static final float method1198(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "([I)Ldg;", line = 259)
    public final class224 method1199(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2381 == null) {
            this.field2369 = 0;
            this.field2356 = new float[field2359];
            this.field2381 = new byte[this.field2380];
            this.field2384 = 0;
            this.field2383 = 0;
        }
        while (this.field2383 < this.field2367.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1200(this.field2383);
            if (var3 != null) {
                int var4 = this.field2384;
                int var5 = var3.length;
                if (var5 > this.field2380 - var4) {
                    var5 = this.field2380 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2381[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2384;
                }
                this.field2384 = var4;
            }
            this.field2383++;
        }
        this.field2356 = null;
        byte[] var2 = this.field2381;
        this.field2381 = null;
        return new class224(this.field2377, var2, this.field2365, this.field2372, this.field2360);
    }

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "(I)[F", line = 317)
    private final float[] method1200(int arg0) {
        method1195(this.field2367[arg0], 0);
        method1194();
        int var2 = method1201(class85.method679((byte) -108, field2376.length - 1));
        boolean var3 = field2364[var2];
        int var4 = var3 ? field2359 : field2361;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1194() != 0;
            var6 = method1194() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2361 >> 2);
            var9 = (field2361 >> 2) + (var4 >> 2);
            var10 = field2361 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2361 >> 2);
            var12 = (field2361 >> 2) + (var4 - (var4 >> 2));
            var13 = field2361 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class16 var14 = field2366[field2376[var2]];
        int var15 = var14.field214;
        int var16 = var14.field211[var15];
        boolean var17 = !field2363[var16].method275();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field212; var19++) {
            class322 var95 = field2379[var14.field213[var19]];
            float[] var96 = field2351;
            var95.method1965(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field214;
            int var21 = var14.field211[var20];
            field2363[var21].method270(field2351, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2351[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2351;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2362 : field2354;
            float[] var30 = var3 ? field2352 : field2368;
            float[] var31 = var3 ? field2370 : field2358;
            int[] var32 = var3 ? field2371 : field2357;
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
            int var35 = class85.method679((byte) -98, var4 - 1);
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
                field2351[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2351[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2369 > 0) {
            int var49 = this.field2369 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2375) {
                for (int var50 = 0; var50 < this.field2374; var50++) {
                    int var51 = (this.field2369 >> 1) + var50;
                    var48[var50] += this.field2356[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2351[var52];
                }
            }
        }
        float[] var54 = this.field2356;
        this.field2356 = field2351;
        field2351 = var54;
        this.field2369 = var4;
        this.field2374 = var12 - (var4 >> 1);
        this.field2375 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "(I)I", line = 732)
    public static final int method1201(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2382) {
            int var4 = 8 - field2382;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2355[field2378] >> field2382 & var5) << var2;
            field2382 = 0;
            field2378++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2355[field2378] >> field2382 & var3) << var2;
            field2382 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lij;)Z", line = 764)
    private static final boolean method1202(class316 arg0) {
        if (!field2373) {
            byte[] var1 = arg0.method1926(0, 0, 0);
            if (var1 == null) {
                return false;
            }
            method1193(var1);
            field2373 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "()V", line = 778)
    public static void method1203() {
        field2355 = null;
        field2353 = null;
        field2363 = null;
        field2379 = null;
        field2366 = null;
        field2364 = null;
        field2376 = null;
        field2351 = null;
        field2354 = null;
        field2368 = null;
        field2358 = null;
        field2362 = null;
        field2352 = null;
        field2370 = null;
        field2357 = null;
        field2371 = null;
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "([B)V", line = 802)
    private class168(byte[] arg0) {
        this.method1196(arg0);
    }
}
