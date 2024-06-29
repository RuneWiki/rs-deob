import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class138 extends class307 {

    @OriginalMember(owner = "client!um", name = "x", descriptor = "Z")
    private static boolean field2313 = false;

    @OriginalMember(owner = "client!um", name = "y", descriptor = "I")
    private int field2314;

    @OriginalMember(owner = "client!um", name = "A", descriptor = "I")
    private int field2316;

    @OriginalMember(owner = "client!um", name = "C", descriptor = "I")
    private int field2318;

    @OriginalMember(owner = "client!um", name = "E", descriptor = "I")
    private static int field2320;

    @OriginalMember(owner = "client!um", name = "H", descriptor = "I")
    private int field2323;

    @OriginalMember(owner = "client!um", name = "J", descriptor = "I")
    private static int field2325;

    @OriginalMember(owner = "client!um", name = "N", descriptor = "I")
    private int field2329;

    @OriginalMember(owner = "client!um", name = "S", descriptor = "I")
    private static int field2334;

    @OriginalMember(owner = "client!um", name = "T", descriptor = "I")
    private int field2335;

    @OriginalMember(owner = "client!um", name = "Z", descriptor = "I")
    private static int field2341;

    @OriginalMember(owner = "client!um", name = "bb", descriptor = "I")
    private int field2343;

    @OriginalMember(owner = "client!um", name = "db", descriptor = "I")
    private int field2345;

    @OriginalMember(owner = "client!um", name = "P", descriptor = "Z")
    private boolean field2331;

    @OriginalMember(owner = "client!um", name = "U", descriptor = "Z")
    private boolean field2336;

    @OriginalMember(owner = "client!um", name = "Q", descriptor = "[B")
    private static byte[] field2332;

    @OriginalMember(owner = "client!um", name = "cb", descriptor = "[B")
    private byte[] field2344;

    @OriginalMember(owner = "client!um", name = "w", descriptor = "[F")
    private static float[] field2312;

    @OriginalMember(owner = "client!um", name = "B", descriptor = "[F")
    private float[] field2317;

    @OriginalMember(owner = "client!um", name = "D", descriptor = "[F")
    private static float[] field2319;

    @OriginalMember(owner = "client!um", name = "G", descriptor = "[F")
    private static float[] field2322;

    @OriginalMember(owner = "client!um", name = "K", descriptor = "[F")
    private static float[] field2326;

    @OriginalMember(owner = "client!um", name = "M", descriptor = "[F")
    private static float[] field2328;

    @OriginalMember(owner = "client!um", name = "O", descriptor = "[F")
    private static float[] field2330;

    @OriginalMember(owner = "client!um", name = "V", descriptor = "[F")
    private static float[] field2337;

    @OriginalMember(owner = "client!um", name = "W", descriptor = "[I")
    private static int[] field2338;

    @OriginalMember(owner = "client!um", name = "X", descriptor = "[I")
    private static int[] field2339;

    @OriginalMember(owner = "client!um", name = "ab", descriptor = "[I")
    private static int[] field2342;

    @OriginalMember(owner = "client!um", name = "Y", descriptor = "[Lml;")
    private static class127[] field2340;

    @OriginalMember(owner = "client!um", name = "z", descriptor = "[Lfj;")
    private static class231[] field2315;

    @OriginalMember(owner = "client!um", name = "R", descriptor = "[Lqc;")
    private static class4[] field2333;

    @OriginalMember(owner = "client!um", name = "L", descriptor = "[Lgg;")
    public static class67[] field2327;

    @OriginalMember(owner = "client!um", name = "I", descriptor = "[Z")
    private static boolean[] field2324;

    @OriginalMember(owner = "client!um", name = "F", descriptor = "[[B")
    private byte[][] field2321;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "()I", line = 9)
    public static final int method1015() {
        int var0 = field2332[field2320] >> field2341 & 0x1;
        field2341++;
        field2320 += field2341 >> 3;
        field2341 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "([I)Lcd;", line = 17)
    public final class64 method1016(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2344 == null) {
            this.field2323 = 0;
            this.field2317 = new float[field2325];
            this.field2344 = new byte[this.field2318];
            this.field2345 = 0;
            this.field2343 = 0;
        }
        while (this.field2343 < this.field2321.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method1021(this.field2343);
            if (var2 != null) {
                int var3 = this.field2345;
                int var4 = var2.length;
                if (var4 > this.field2318 - var3) {
                    var4 = this.field2318 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field2344[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field2345;
                }
                this.field2345 = var3;
            }
            this.field2343++;
        }
        this.field2317 = null;
        byte[] var7 = this.field2344;
        this.field2344 = null;
        return new class64(this.field2335, var7, this.field2329, this.field2316, this.field2336);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "([BI)V", line = 76)
    private static final void method1017(byte[] arg0, int arg1) {
        field2332 = arg0;
        field2320 = arg1;
        field2341 = 0;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lce;)Z", line = 86)
    private static final boolean method1018(class239 arg0) {
        if (!field2313) {
            byte[] var1 = arg0.method1651(0, 0, -1);
            if (var1 == null) {
                return false;
            }
            method1023(var1);
            field2313 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!um", name = "d", descriptor = "(I)F", line = 103)
    public static final float method1019(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "()V", line = 115)
    public static void method1020() {
        field2332 = null;
        field2327 = null;
        field2340 = null;
        field2333 = null;
        field2315 = null;
        field2324 = null;
        field2338 = null;
        field2312 = null;
        field2326 = null;
        field2337 = null;
        field2319 = null;
        field2328 = null;
        field2322 = null;
        field2330 = null;
        field2339 = null;
        field2342 = null;
    }

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(I)[F", line = 134)
    private final float[] method1021(int arg0) {
        method1017(this.field2321[arg0], 0);
        method1015();
        int var2 = method1025(class229.method1603(field2338.length - 1, true));
        boolean var3 = field2324[var2];
        int var4 = var3 ? field2325 : field2334;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1015() != 0;
            var6 = method1015() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2334 >> 2);
            var9 = (field2334 >> 2) + (var4 >> 2);
            var10 = field2334 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2334 >> 2);
            var12 = (field2334 >> 2) + (var4 - (var4 >> 2));
            var13 = field2334 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class231 var14 = field2315[field2338[var2]];
        int var15 = var14.field3798;
        int var16 = var14.field3796[var15];
        boolean var17 = !field2340[var16].method953();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field3795; var19++) {
            class4 var20 = field2333[var14.field3797[var19]];
            float[] var21 = field2312;
            var20.method16(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field3798;
            int var23 = var14.field3796[var22];
            field2340[var23].method954(field2312, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field2312[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field2312;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field2328 : field2326;
            float[] var32 = var3 ? field2322 : field2337;
            float[] var33 = var3 ? field2330 : field2319;
            int[] var34 = var3 ? field2342 : field2339;
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
            int var47 = class229.method1603(var4 - 1, true);
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
                field2312[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2312[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field2323 > 0) {
            int var91 = this.field2323 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field2331) {
                for (int var92 = 0; var92 < this.field2314; var92++) {
                    int var93 = (this.field2323 >> 1) + var92;
                    var90[var92] += this.field2317[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field2312[var94];
                }
            }
        }
        float[] var96 = this.field2317;
        this.field2317 = field2312;
        field2312 = var96;
        this.field2323 = var4;
        this.field2314 = var12 - (var4 >> 1);
        this.field2331 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lce;II)Lum;", line = 546)
    public static final class138 method1022(class239 arg0, int arg1, int arg2) {
        if (method1018(arg0)) {
            byte[] var3 = arg0.method1651(arg1, arg2, -1);
            return var3 == null ? null : new class138(var3);
        } else {
            arg0.method1657(arg1, 0, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "([B)V", line = 562)
    private static final void method1023(byte[] arg0) {
        method1017(arg0, 0);
        field2334 = 0x1 << method1025(4);
        field2325 = 0x1 << method1025(4);
        field2312 = new float[field2325];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field2334 : field2325;
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
            int var13 = class229.method1603(var5 - 1, true);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class40.method343(126, var13, var14);
            }
            if (var1 == 0) {
                field2326 = var6;
                field2337 = var8;
                field2319 = var10;
                field2339 = var12;
            } else {
                field2328 = var6;
                field2322 = var8;
                field2330 = var10;
                field2342 = var12;
            }
        }
        int var15 = method1025(8) + 1;
        field2327 = new class67[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field2327[var16] = new class67();
        }
        int var17 = method1025(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method1025(16);
        }
        int var19 = method1025(6) + 1;
        field2340 = new class127[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field2340[var20] = new class127();
        }
        int var21 = method1025(6) + 1;
        field2333 = new class4[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field2333[var22] = new class4();
        }
        int var23 = method1025(6) + 1;
        field2315 = new class231[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field2315[var24] = new class231();
        }
        int var25 = method1025(6) + 1;
        field2324 = new boolean[var25];
        field2338 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field2324[var26] = method1015() != 0;
            method1025(16);
            method1025(16);
            field2338[var26] = method1025(8);
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "([B)V", line = 724)
    private final void method1024(byte[] arg0) {
        class26 var2 = new class26(arg0);
        this.field2335 = var2.method203(-22066);
        this.field2318 = var2.method203(-22066);
        this.field2329 = var2.method203(-22066);
        this.field2316 = var2.method203(-22066);
        if (this.field2316 < 0) {
            this.field2316 = ~this.field2316;
            this.field2336 = true;
        }
        int var3 = var2.method203(-22066);
        this.field2321 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method226(255);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method207(var7, var5, 1367096328, 0);
            this.field2321[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "([B)V", line = 773)
    private class138(byte[] arg0) {
        this.method1024(arg0);
    }

    @OriginalMember(owner = "client!um", name = "f", descriptor = "(I)I", line = 783)
    public static final int method1025(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2341) {
            int var3 = 8 - field2341;
            int var4 = (0x1 << var3) - 1;
            var1 += (field2332[field2320] >> field2341 & var4) << var2;
            field2341 = 0;
            field2320++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field2332[field2320] >> field2341 & var5) << var2;
            field2341 += arg0;
        }
        return var1;
    }
}
