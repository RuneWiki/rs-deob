import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class627 extends class656 {

    @OriginalMember(owner = "client!oo", name = "J", descriptor = "Z")
    private static boolean field8337 = false;

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "I")
    private static int field8312;

    @OriginalMember(owner = "client!oo", name = "q", descriptor = "I")
    private int field8318;

    @OriginalMember(owner = "client!oo", name = "r", descriptor = "I")
    private int field8319;

    @OriginalMember(owner = "client!oo", name = "t", descriptor = "I")
    private int field8321;

    @OriginalMember(owner = "client!oo", name = "u", descriptor = "I")
    private int field8322;

    @OriginalMember(owner = "client!oo", name = "x", descriptor = "I")
    private int field8325;

    @OriginalMember(owner = "client!oo", name = "A", descriptor = "I")
    private static int field8328;

    @OriginalMember(owner = "client!oo", name = "B", descriptor = "I")
    private static int field8329;

    @OriginalMember(owner = "client!oo", name = "D", descriptor = "I")
    private int field8331;

    @OriginalMember(owner = "client!oo", name = "E", descriptor = "I")
    private static int field8332;

    @OriginalMember(owner = "client!oo", name = "O", descriptor = "I")
    private int field8342;

    @OriginalMember(owner = "client!oo", name = "P", descriptor = "I")
    private int field8343;

    @OriginalMember(owner = "client!oo", name = "l", descriptor = "Z")
    private boolean field8313;

    @OriginalMember(owner = "client!oo", name = "C", descriptor = "Z")
    private boolean field8330;

    @OriginalMember(owner = "client!oo", name = "G", descriptor = "[B")
    private static byte[] field8334;

    @OriginalMember(owner = "client!oo", name = "N", descriptor = "[B")
    private byte[] field8341;

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "[F")
    private static float[] field8310;

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "[F")
    private static float[] field8311;

    @OriginalMember(owner = "client!oo", name = "o", descriptor = "[F")
    private static float[] field8316;

    @OriginalMember(owner = "client!oo", name = "p", descriptor = "[F")
    private static float[] field8317;

    @OriginalMember(owner = "client!oo", name = "v", descriptor = "[F")
    private static float[] field8323;

    @OriginalMember(owner = "client!oo", name = "w", descriptor = "[F")
    private static float[] field8324;

    @OriginalMember(owner = "client!oo", name = "F", descriptor = "[F")
    private static float[] field8333;

    @OriginalMember(owner = "client!oo", name = "M", descriptor = "[F")
    private float[] field8340;

    @OriginalMember(owner = "client!oo", name = "n", descriptor = "[I")
    private static int[] field8315;

    @OriginalMember(owner = "client!oo", name = "y", descriptor = "[I")
    private static int[] field8326;

    @OriginalMember(owner = "client!oo", name = "z", descriptor = "[I")
    private static int[] field8327;

    @OriginalMember(owner = "client!oo", name = "I", descriptor = "[Ldda;")
    private static class386[] field8336;

    @OriginalMember(owner = "client!oo", name = "K", descriptor = "[Lrp;")
    public static class441[] field8338;

    @OriginalMember(owner = "client!oo", name = "s", descriptor = "[Lmd;")
    private static class544[] field8320;

    @OriginalMember(owner = "client!oo", name = "m", descriptor = "[Lfia;")
    private static class576[] field8314;

    @OriginalMember(owner = "client!oo", name = "H", descriptor = "[Z")
    private static boolean[] field8335;

    @OriginalMember(owner = "client!oo", name = "L", descriptor = "[[B")
    private byte[][] field8339;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lwu;I)Loo;")
    public static final class627 method3445(class376 arg0, int arg1) {
        if (method3451(arg0)) {
            byte[] var2 = arg0.method2226(-1, arg1);
            return var2 == null ? null : new class627(var2);
        } else {
            arg0.method2216(arg1, 122);
            return null;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)F")
    public static final float method3446(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)I")
    public static final int method3447(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field8332) {
            int var4 = 8 - field8332;
            int var5 = (0x1 << var4) - 1;
            var1 += (field8334[field8312] >> field8332 & var5) << var2;
            field8332 = 0;
            field8312++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field8334[field8312] >> field8332 & var3) << var2;
            field8332 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "()I")
    public static final int method3448() {
        int var0 = field8334[field8312] >> field8332 & 0x1;
        field8332++;
        field8312 += field8332 >> 3;
        field8332 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "([B)V")
    private final void method3449(byte[] arg0) {
        class677 var2 = new class677(arg0);
        this.field8318 = var2.method3799(false);
        this.field8321 = var2.method3799(false);
        this.field8331 = var2.method3799(false);
        this.field8319 = var2.method3799(false);
        if (this.field8319 < 0) {
            this.field8319 = ~this.field8319;
            this.field8330 = true;
        }
        int var3 = var2.method3799(false);
        this.field8339 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method3821((byte) 124);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method3801(var7, 0, var5, 95);
            this.field8339[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "([I)Lct;")
    public final class147 method3450(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field8341 == null) {
            this.field8322 = 0;
            this.field8340 = new float[field8329];
            this.field8341 = new byte[this.field8321];
            this.field8343 = 0;
            this.field8342 = 0;
        }
        while (this.field8342 < this.field8339.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method3452(this.field8342);
            if (var3 != null) {
                int var4 = this.field8343;
                int var5 = var3.length;
                if (var5 > this.field8321 - var4) {
                    var5 = this.field8321 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field8341[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field8343;
                }
                this.field8343 = var4;
            }
            this.field8342++;
        }
        this.field8340 = null;
        byte[] var2 = this.field8341;
        this.field8341 = null;
        return new class147(this.field8318, var2, this.field8331, this.field8319, this.field8330);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lwu;)Z")
    private static final boolean method3451(class376 arg0) {
        if (!field8337) {
            byte[] var1 = arg0.method2218((byte) 121, 0, 0);
            if (var1 == null) {
                return false;
            }
            method3455(var1);
        }
        return true;
    }

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "(I)[F")
    private final float[] method3452(int arg0) {
        method3454(this.field8339[arg0], 0);
        method3448();
        int var2 = method3447(class384.method2276(89, field8327.length - 1));
        boolean var3 = field8335[var2];
        int var4 = var3 ? field8329 : field8328;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method3448() != 0;
            var6 = method3448() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field8328 >> 2);
            var9 = (field8328 >> 2) + (var4 >> 2);
            var10 = field8328 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field8328 >> 2);
            var12 = (field8328 >> 2) + (var4 - (var4 >> 2));
            var13 = field8328 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class544 var14 = field8320[field8327[var2]];
        int var15 = var14.field7197;
        int var16 = var14.field7196[var15];
        boolean var17 = !field8336[var16].method2294();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field7195; var19++) {
            class576 var95 = field8314[var14.field7194[var19]];
            float[] var96 = field8323;
            var95.method3165(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field7197;
            int var21 = var14.field7196[var20];
            field8336[var21].method2289(field8323, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field8323[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field8323;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field8324 : field8310;
            float[] var30 = var3 ? field8333 : field8317;
            float[] var31 = var3 ? field8311 : field8316;
            int[] var32 = var3 ? field8315 : field8326;
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
            int var35 = class384.method2276(115, var4 - 1);
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
                field8323[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field8323[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field8322 > 0) {
            int var49 = this.field8322 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field8313) {
                for (int var50 = 0; var50 < this.field8325; var50++) {
                    int var51 = (this.field8322 >> 1) + var50;
                    var48[var50] += this.field8340[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field8323[var52];
                }
            }
        }
        float[] var54 = this.field8340;
        this.field8340 = field8323;
        field8323 = var54;
        this.field8322 = var4;
        this.field8325 = var12 - (var4 >> 1);
        this.field8313 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lwu;II)Loo;")
    public static final class627 method3453(class376 arg0, int arg1, int arg2) {
        if (method3451(arg0)) {
            byte[] var3 = arg0.method2218((byte) 124, arg1, arg2);
            return var3 == null ? null : new class627(var3);
        } else {
            arg0.method2211(93, arg2, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "([BI)V")
    private static final void method3454(byte[] arg0, int arg1) {
        field8334 = arg0;
        field8312 = arg1;
        field8332 = 0;
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "([B)V")
    private static final void method3455(byte[] arg0) {
        method3454(arg0, 0);
        field8328 = 0x1 << method3447(4);
        field8329 = 0x1 << method3447(4);
        field8323 = new float[field8329];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field8328 : field8329;
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
            int var25 = class384.method2276(110, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class675.method3760(var26, var25, 85);
            }
            if (var1 == 0) {
                field8310 = var18;
                field8317 = var20;
                field8316 = var22;
                field8326 = var24;
            } else {
                field8324 = var18;
                field8333 = var20;
                field8311 = var22;
                field8315 = var24;
            }
        }
        int var2 = method3447(8) + 1;
        field8338 = new class441[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field8338[var3] = new class441();
        }
        int var4 = method3447(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method3447(16);
        }
        int var6 = method3447(6) + 1;
        field8336 = new class386[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field8336[var7] = new class386();
        }
        int var8 = method3447(6) + 1;
        field8314 = new class576[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field8314[var9] = new class576();
        }
        int var10 = method3447(6) + 1;
        field8320 = new class544[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field8320[var11] = new class544();
        }
        int var12 = method3447(6) + 1;
        field8335 = new boolean[var12];
        field8327 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field8335[var13] = method3448() != 0;
            method3447(16);
            method3447(16);
            field8327[var13] = method3447(8);
        }
        field8337 = true;
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "()V")
    public static void method3456() {
        field8334 = null;
        field8338 = null;
        field8336 = null;
        field8314 = null;
        field8320 = null;
        field8335 = null;
        field8327 = null;
        field8323 = null;
        field8310 = null;
        field8317 = null;
        field8316 = null;
        field8324 = null;
        field8333 = null;
        field8311 = null;
        field8326 = null;
        field8315 = null;
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "([B)V")
    private class627(byte[] arg0) {
        this.method3449(arg0);
    }
}
