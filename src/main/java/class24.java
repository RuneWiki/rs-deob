import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class24 extends class90 {

    @OriginalMember(owner = "client!cc", name = "X", descriptor = "Z")
    private static boolean field437 = false;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
    private static int field409;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
    private int field410;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
    private static int field413;

    @OriginalMember(owner = "client!cc", name = "J", descriptor = "I")
    private int field423;

    @OriginalMember(owner = "client!cc", name = "K", descriptor = "I")
    private static int field424;

    @OriginalMember(owner = "client!cc", name = "L", descriptor = "I")
    private int field425;

    @OriginalMember(owner = "client!cc", name = "N", descriptor = "I")
    private int field427;

    @OriginalMember(owner = "client!cc", name = "P", descriptor = "I")
    private static int field429;

    @OriginalMember(owner = "client!cc", name = "S", descriptor = "I")
    private int field432;

    @OriginalMember(owner = "client!cc", name = "Y", descriptor = "I")
    private int field438;

    @OriginalMember(owner = "client!cc", name = "ab", descriptor = "I")
    private int field440;

    @OriginalMember(owner = "client!cc", name = "cb", descriptor = "I")
    private int field442;

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "Z")
    private boolean field419;

    @OriginalMember(owner = "client!cc", name = "T", descriptor = "Z")
    private boolean field433;

    @OriginalMember(owner = "client!cc", name = "I", descriptor = "[B")
    private static byte[] field422;

    @OriginalMember(owner = "client!cc", name = "bb", descriptor = "[B")
    private byte[] field441;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "[F")
    private static float[] field411;

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "[F")
    private static float[] field414;

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "[F")
    private static float[] field417;

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "[F")
    private static float[] field418;

    @OriginalMember(owner = "client!cc", name = "M", descriptor = "[F")
    private static float[] field426;

    @OriginalMember(owner = "client!cc", name = "V", descriptor = "[F")
    private float[] field435;

    @OriginalMember(owner = "client!cc", name = "W", descriptor = "[F")
    private static float[] field436;

    @OriginalMember(owner = "client!cc", name = "Z", descriptor = "[F")
    private static float[] field439;

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "[I")
    private static int[] field416;

    @OriginalMember(owner = "client!cc", name = "G", descriptor = "[I")
    private static int[] field420;

    @OriginalMember(owner = "client!cc", name = "H", descriptor = "[I")
    private static int[] field421;

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "[Ll;")
    private static class104[] field415;

    @OriginalMember(owner = "client!cc", name = "U", descriptor = "[Lrc;")
    private static class160[] field434;

    @OriginalMember(owner = "client!cc", name = "Q", descriptor = "[Lwe;")
    public static class207[] field430;

    @OriginalMember(owner = "client!cc", name = "O", descriptor = "[Lgf;")
    private static class66[] field428;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "[Z")
    private static boolean[] field412;

    @OriginalMember(owner = "client!cc", name = "R", descriptor = "[[B")
    private byte[][] field431;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)F")
    public static final float method140(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)I")
    public static final int method141(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field424) {
            int var4 = 8 - field424;
            int var5 = (0x1 << var4) - 1;
            var1 += (field422[field429] >> field424 & var5) << var2;
            field424 = 0;
            field429++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field422[field429] >> field424 & var3) << var2;
            field424 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lu;)Z")
    private static final boolean method142(class184 arg0) {
        if (!field437) {
            byte[] var1 = arg0.method1235(0, (byte) -64, 0);
            if (var1 == null) {
                return false;
            }
            method150(var1);
            field437 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "()V")
    public static void method143() {
        field422 = null;
        field430 = null;
        field415 = null;
        field428 = null;
        field434 = null;
        field412 = null;
        field416 = null;
        field414 = null;
        field426 = null;
        field418 = null;
        field436 = null;
        field411 = null;
        field417 = null;
        field439 = null;
        field420 = null;
        field421 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([B)V")
    private final void method144(byte[] arg0) {
        class52 var2 = new class52(arg0);
        this.field427 = var2.method383(57);
        this.field410 = var2.method383(34);
        this.field425 = var2.method383(79);
        this.field432 = var2.method383(23);
        if (this.field432 < 0) {
            this.field432 = ~this.field432;
            this.field433 = true;
        }
        int var3 = var2.method383(84);
        this.field431 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method344(255);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method351(var7, 413058320, var5, 0);
            this.field431[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([BI)V")
    private static final void method145(byte[] arg0, int arg1) {
        field422 = arg0;
        field429 = arg1;
        field424 = 0;
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)[F")
    private final float[] method146(int arg0) {
        method145(this.field431[arg0], 0);
        method149();
        int var2 = method141(class131.method876(field416.length - 1, false));
        boolean var3 = field412[var2];
        int var4 = var3 ? field413 : field409;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method149() != 0;
            var6 = method149() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field409 >> 2);
            var9 = (field409 >> 2) + (var4 >> 2);
            var10 = field409 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field409 >> 2);
            var12 = (field409 >> 2) + (var4 - (var4 >> 2));
            var13 = field409 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class160 var14 = field434[field416[var2]];
        int var15 = var14.field3248;
        int var16 = var14.field3247[var15];
        boolean var17 = !field415[var16].method710();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field3249; var19++) {
            class66 var95 = field428[var14.field3246[var19]];
            float[] var96 = field414;
            var95.method472(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field3248;
            int var21 = var14.field3247[var20];
            field415[var21].method708(field414, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field414[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field414;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field411 : field426;
            float[] var30 = var3 ? field417 : field418;
            float[] var31 = var3 ? field439 : field436;
            int[] var32 = var3 ? field421 : field420;
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
            int var35 = class131.method876(var4 - 1, false);
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
                field414[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field414[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field438 > 0) {
            int var49 = this.field438 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field419) {
                for (int var50 = 0; var50 < this.field423; var50++) {
                    int var51 = (this.field438 >> 1) + var50;
                    var48[var50] += this.field435[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field414[var52];
                }
            }
        }
        float[] var54 = this.field435;
        this.field435 = field414;
        field414 = var54;
        this.field438 = var4;
        this.field423 = var12 - (var4 >> 1);
        this.field419 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([I)Lqe;")
    public final class153 method147(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field441 == null) {
            this.field438 = 0;
            this.field435 = new float[field413];
            this.field441 = new byte[this.field410];
            this.field442 = 0;
            this.field440 = 0;
        }
        while (this.field440 < this.field431.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method146(this.field440);
            if (var3 != null) {
                int var4 = this.field442;
                int var5 = var3.length;
                if (var5 > this.field410 - var4) {
                    var5 = this.field410 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field441[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field442;
                }
                this.field442 = var4;
            }
            this.field440++;
        }
        this.field435 = null;
        byte[] var2 = this.field441;
        this.field441 = null;
        return new class153(this.field427, var2, this.field425, this.field432, this.field433);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lu;II)Lcc;")
    public static final class24 method148(class184 arg0, int arg1, int arg2) {
        if (method142(arg0)) {
            byte[] var3 = arg0.method1235(arg2, (byte) -64, arg1);
            return var3 == null ? null : new class24(var3);
        } else {
            arg0.method1248(arg1, arg2, 104);
            return null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "()I")
    public static final int method149() {
        int var0 = field422[field429] >> field424 & 0x1;
        field424++;
        field429 += field424 >> 3;
        field424 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "([B)V")
    private static final void method150(byte[] arg0) {
        method145(arg0, 0);
        field409 = 0x1 << method141(4);
        field413 = 0x1 << method141(4);
        field414 = new float[field413];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field409 : field413;
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
            int var25 = class131.method876(var17 - 1, false);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class135.method891((byte) -15, var25, var26);
            }
            if (var1 == 0) {
                field426 = var18;
                field418 = var20;
                field436 = var22;
                field420 = var24;
            } else {
                field411 = var18;
                field417 = var20;
                field439 = var22;
                field421 = var24;
            }
        }
        int var2 = method141(8) + 1;
        field430 = new class207[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field430[var3] = new class207();
        }
        int var4 = method141(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method141(16);
        }
        int var6 = method141(6) + 1;
        field415 = new class104[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field415[var7] = new class104();
        }
        int var8 = method141(6) + 1;
        field428 = new class66[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field428[var9] = new class66();
        }
        int var10 = method141(6) + 1;
        field434 = new class160[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field434[var11] = new class160();
        }
        int var12 = method141(6) + 1;
        field412 = new boolean[var12];
        field416 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field412[var13] = method149() != 0;
            method141(16);
            method141(16);
            field416[var13] = method141(8);
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "([B)V")
    private class24(byte[] arg0) {
        this.method144(arg0);
    }
}
