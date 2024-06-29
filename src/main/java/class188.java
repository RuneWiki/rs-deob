import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class188 extends class61 {

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "Z")
    private static boolean field3287 = false;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
    private int field3280;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
    private int field3281;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
    private int field3282;

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "I")
    private int field3289;

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "I")
    private static int field3290;

    @OriginalMember(owner = "client!wh", name = "O", descriptor = "I")
    private int field3299;

    @OriginalMember(owner = "client!wh", name = "T", descriptor = "I")
    private static int field3304;

    @OriginalMember(owner = "client!wh", name = "V", descriptor = "I")
    private int field3306;

    @OriginalMember(owner = "client!wh", name = "X", descriptor = "I")
    private static int field3308;

    @OriginalMember(owner = "client!wh", name = "Z", descriptor = "I")
    private static int field3310;

    @OriginalMember(owner = "client!wh", name = "ab", descriptor = "I")
    private int field3311;

    @OriginalMember(owner = "client!wh", name = "bb", descriptor = "I")
    private int field3312;

    @OriginalMember(owner = "client!wh", name = "J", descriptor = "Z")
    private boolean field3294;

    @OriginalMember(owner = "client!wh", name = "U", descriptor = "Z")
    private boolean field3305;

    @OriginalMember(owner = "client!wh", name = "R", descriptor = "[B")
    private static byte[] field3302;

    @OriginalMember(owner = "client!wh", name = "cb", descriptor = "[B")
    private byte[] field3313;

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "[F")
    private static float[] field3284;

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "[F")
    private static float[] field3288;

    @OriginalMember(owner = "client!wh", name = "G", descriptor = "[F")
    private static float[] field3291;

    @OriginalMember(owner = "client!wh", name = "H", descriptor = "[F")
    private static float[] field3292;

    @OriginalMember(owner = "client!wh", name = "I", descriptor = "[F")
    private static float[] field3293;

    @OriginalMember(owner = "client!wh", name = "K", descriptor = "[F")
    private static float[] field3295;

    @OriginalMember(owner = "client!wh", name = "L", descriptor = "[F")
    private static float[] field3296;

    @OriginalMember(owner = "client!wh", name = "Y", descriptor = "[F")
    private float[] field3309;

    @OriginalMember(owner = "client!wh", name = "M", descriptor = "[I")
    private static int[] field3297;

    @OriginalMember(owner = "client!wh", name = "P", descriptor = "[I")
    private static int[] field3300;

    @OriginalMember(owner = "client!wh", name = "S", descriptor = "[I")
    private static int[] field3303;

    @OriginalMember(owner = "client!wh", name = "N", descriptor = "[Lab;")
    public static class143[] field3298;

    @OriginalMember(owner = "client!wh", name = "W", descriptor = "[Lk;")
    private static class174[] field3307;

    @OriginalMember(owner = "client!wh", name = "Q", descriptor = "[Lqh;")
    private static class195[] field3301;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "[Lne;")
    private static class50[] field3283;

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "[Z")
    private static boolean[] field3285;

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "[[B")
    private byte[][] field3286;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([B)V")
    private final void method1337(byte[] arg0) {
        class14 var2 = new class14(arg0);
        this.field3282 = var2.method187((byte) 61);
        this.field3281 = var2.method187((byte) 61);
        this.field3280 = var2.method187((byte) 61);
        this.field3289 = var2.method187((byte) 61);
        if (this.field3289 < 0) {
            this.field3289 = ~this.field3289;
            this.field3294 = true;
        }
        int var3 = var2.method187((byte) 61);
        this.field3286 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method200(255);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method157(var7, 2, 0, var5);
            this.field3286[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lkk;)Z")
    private static final boolean method1338(class223 arg0) {
        if (!field3287) {
            byte[] var1 = arg0.method1546(0, (byte) -100, 0);
            if (var1 == null) {
                return false;
            }
            method1345(var1);
            field3287 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([I)Lqa;")
    public final class148 method1339(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field3313 == null) {
            this.field3299 = 0;
            this.field3309 = new float[field3290];
            this.field3313 = new byte[this.field3281];
            this.field3312 = 0;
            this.field3311 = 0;
        }
        while (this.field3311 < this.field3286.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1346(this.field3311);
            if (var3 != null) {
                int var4 = this.field3312;
                int var5 = var3.length;
                if (var5 > this.field3281 - var4) {
                    var5 = this.field3281 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field3313[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field3312;
                }
                this.field3312 = var4;
            }
            this.field3311++;
        }
        this.field3309 = null;
        byte[] var2 = this.field3313;
        this.field3313 = null;
        return new class148(this.field3282, var2, this.field3280, this.field3289, this.field3294);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([BI)V")
    private static final void method1340(byte[] arg0, int arg1) {
        field3302 = arg0;
        field3308 = arg1;
        field3304 = 0;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "()I")
    public static final int method1341() {
        int var0 = field3302[field3308] >> field3304 & 0x1;
        field3304++;
        field3308 += field3304 >> 3;
        field3304 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)I")
    public static final int method1342(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field3304) {
            int var4 = 8 - field3304;
            int var5 = (0x1 << var4) - 1;
            var1 += (field3302[field3308] >> field3304 & var5) << var2;
            field3304 = 0;
            field3308++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field3302[field3308] >> field3304 & var3) << var2;
            field3304 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)F")
    public static final float method1343(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lkk;II)Lwh;")
    public static final class188 method1344(class223 arg0, int arg1, int arg2) {
        if (method1338(arg0)) {
            byte[] var3 = arg0.method1546(arg2, (byte) -100, arg1);
            return var3 == null ? null : new class188(var3);
        } else {
            arg0.method1537((byte) -118, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "([B)V")
    private static final void method1345(byte[] arg0) {
        method1340(arg0, 0);
        field3310 = 0x1 << method1342(4);
        field3290 = 0x1 << method1342(4);
        field3296 = new float[field3290];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field3310 : field3290;
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
            int var25 = class9.method85(var17 - 1, 127);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class275.method1867(var26, var25, 1);
            }
            if (var1 == 0) {
                field3288 = var18;
                field3293 = var20;
                field3292 = var22;
                field3303 = var24;
            } else {
                field3291 = var18;
                field3284 = var20;
                field3295 = var22;
                field3297 = var24;
            }
        }
        int var2 = method1342(8) + 1;
        field3298 = new class143[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field3298[var3] = new class143();
        }
        int var4 = method1342(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1342(16);
        }
        int var6 = method1342(6) + 1;
        field3307 = new class174[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field3307[var7] = new class174();
        }
        int var8 = method1342(6) + 1;
        field3301 = new class195[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field3301[var9] = new class195();
        }
        int var10 = method1342(6) + 1;
        field3283 = new class50[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field3283[var11] = new class50();
        }
        int var12 = method1342(6) + 1;
        field3285 = new boolean[var12];
        field3300 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field3285[var13] = method1341() != 0;
            method1342(16);
            method1342(16);
            field3300[var13] = method1342(8);
        }
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)[F")
    private final float[] method1346(int arg0) {
        method1340(this.field3286[arg0], 0);
        method1341();
        int var2 = method1342(class9.method85(field3300.length - 1, 126));
        boolean var3 = field3285[var2];
        int var4 = var3 ? field3290 : field3310;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1341() != 0;
            var6 = method1341() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field3310 >> 2);
            var9 = (field3310 >> 2) + (var4 >> 2);
            var10 = field3310 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field3310 >> 2);
            var12 = (field3310 >> 2) + (var4 - (var4 >> 2));
            var13 = field3310 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class50 var14 = field3283[field3300[var2]];
        int var15 = var14.field873;
        int var16 = var14.field874[var15];
        boolean var17 = !field3307[var16].method1274();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field875; var19++) {
            class195 var95 = field3301[var14.field872[var19]];
            float[] var96 = field3296;
            var95.method1392(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field873;
            int var21 = var14.field874[var20];
            field3307[var21].method1272(field3296, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field3296[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field3296;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field3291 : field3288;
            float[] var30 = var3 ? field3284 : field3293;
            float[] var31 = var3 ? field3295 : field3292;
            int[] var32 = var3 ? field3297 : field3303;
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
            int var35 = class9.method85(var4 - 1, 126);
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
                field3296[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field3296[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field3299 > 0) {
            int var49 = this.field3299 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field3305) {
                for (int var50 = 0; var50 < this.field3306; var50++) {
                    int var51 = (this.field3299 >> 1) + var50;
                    var48[var50] += this.field3309[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field3296[var52];
                }
            }
        }
        float[] var54 = this.field3309;
        this.field3309 = field3296;
        field3296 = var54;
        this.field3299 = var4;
        this.field3306 = var12 - (var4 >> 1);
        this.field3305 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "()V")
    public static void method1347() {
        field3302 = null;
        field3298 = null;
        field3307 = null;
        field3301 = null;
        field3283 = null;
        field3285 = null;
        field3300 = null;
        field3296 = null;
        field3288 = null;
        field3293 = null;
        field3292 = null;
        field3291 = null;
        field3284 = null;
        field3295 = null;
        field3303 = null;
        field3297 = null;
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "([B)V")
    private class188(byte[] arg0) {
        this.method1337(arg0);
    }
}
