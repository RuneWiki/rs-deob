import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class156 extends class128 {

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "Z")
    private static boolean field3561 = false;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    private int field3553;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
    private int field3557;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "I")
    private static int field3558;

    @OriginalMember(owner = "client!wc", name = "J", descriptor = "I")
    private static int field3565;

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
    private int field3566;

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "I")
    private int field3568;

    @OriginalMember(owner = "client!wc", name = "N", descriptor = "I")
    private static int field3569;

    @OriginalMember(owner = "client!wc", name = "T", descriptor = "I")
    private int field3575;

    @OriginalMember(owner = "client!wc", name = "U", descriptor = "I")
    private int field3576;

    @OriginalMember(owner = "client!wc", name = "Y", descriptor = "I")
    private static int field3580;

    @OriginalMember(owner = "client!wc", name = "Z", descriptor = "I")
    private int field3581;

    @OriginalMember(owner = "client!wc", name = "bb", descriptor = "I")
    private int field3583;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "Z")
    private boolean field3560;

    @OriginalMember(owner = "client!wc", name = "I", descriptor = "Z")
    private boolean field3564;

    @OriginalMember(owner = "client!wc", name = "P", descriptor = "[B")
    private static byte[] field3571;

    @OriginalMember(owner = "client!wc", name = "ab", descriptor = "[B")
    private byte[] field3582;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "[F")
    private float[] field3550;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "[F")
    private static float[] field3554;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "[F")
    private static float[] field3555;

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "[F")
    private static float[] field3562;

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "[F")
    private static float[] field3567;

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "[F")
    private static float[] field3570;

    @OriginalMember(owner = "client!wc", name = "Q", descriptor = "[F")
    private static float[] field3572;

    @OriginalMember(owner = "client!wc", name = "S", descriptor = "[F")
    private static float[] field3574;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "[I")
    private static int[] field3552;

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "[I")
    private static int[] field3556;

    @OriginalMember(owner = "client!wc", name = "W", descriptor = "[I")
    private static int[] field3578;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "[Lpd;")
    public static class108[] field3559;

    @OriginalMember(owner = "client!wc", name = "R", descriptor = "[Lra;")
    private static class119[] field3573;

    @OriginalMember(owner = "client!wc", name = "V", descriptor = "[Lva;")
    private static class147[] field3577;

    @OriginalMember(owner = "client!wc", name = "X", descriptor = "[Lib;")
    private static class58[] field3579;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "[Z")
    private static boolean[] field3551;

    @OriginalMember(owner = "client!wc", name = "H", descriptor = "[[B")
    private byte[][] field3563;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lie;II)Lwc;")
    public static final class156 method1193(class61 arg0, int arg1, int arg2) {
        if (method1203(arg0)) {
            byte[] var3 = arg0.method473((byte) 123, arg1, arg2);
            return var3 == null ? null : new class156(var3);
        } else {
            arg0.method461(arg2, arg1, (byte) -123);
            return null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([B)V")
    private static final void method1194(byte[] arg0) {
        method1195(arg0, 0);
        field3580 = 0x1 << method1196(4);
        field3569 = 0x1 << method1196(4);
        field3555 = new float[field3569];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field3580 : field3569;
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
            int var25 = class141.method1098(0, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class129.method1013(0, var26, var25);
            }
            if (var1 == 0) {
                field3562 = var18;
                field3567 = var20;
                field3574 = var22;
                field3552 = var24;
            } else {
                field3554 = var18;
                field3572 = var20;
                field3570 = var22;
                field3556 = var24;
            }
        }
        int var2 = method1196(8) + 1;
        field3559 = new class108[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field3559[var3] = new class108();
        }
        int var4 = method1196(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1196(16);
        }
        int var6 = method1196(6) + 1;
        field3579 = new class58[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field3579[var7] = new class58();
        }
        int var8 = method1196(6) + 1;
        field3573 = new class119[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field3573[var9] = new class119();
        }
        int var10 = method1196(6) + 1;
        field3577 = new class147[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field3577[var11] = new class147();
        }
        int var12 = method1196(6) + 1;
        field3551 = new boolean[var12];
        field3578 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field3551[var13] = method1197() != 0;
            method1196(16);
            method1196(16);
            field3578[var13] = method1196(8);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([BI)V")
    private static final void method1195(byte[] arg0, int arg1) {
        field3571 = arg0;
        field3558 = arg1;
        field3565 = 0;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)I")
    public static final int method1196(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field3565) {
            int var4 = 8 - field3565;
            int var5 = (0x1 << var4) - 1;
            var1 += (field3571[field3558] >> field3565 & var5) << var2;
            field3565 = 0;
            field3558++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field3571[field3558] >> field3565 & var3) << var2;
            field3565 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "()I")
    public static final int method1197() {
        int var0 = field3571[field3558] >> field3565 & 0x1;
        field3565++;
        field3558 += field3565 >> 3;
        field3565 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "()V")
    public static void method1198() {
        field3571 = null;
        field3559 = null;
        field3579 = null;
        field3573 = null;
        field3577 = null;
        field3551 = null;
        field3578 = null;
        field3555 = null;
        field3562 = null;
        field3567 = null;
        field3574 = null;
        field3554 = null;
        field3572 = null;
        field3570 = null;
        field3552 = null;
        field3556 = null;
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)[F")
    private final float[] method1199(int arg0) {
        method1195(this.field3563[arg0], 0);
        method1197();
        int var2 = method1196(class141.method1098(0, field3578.length - 1));
        boolean var3 = field3551[var2];
        int var4 = var3 ? field3569 : field3580;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1197() != 0;
            var6 = method1197() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field3580 >> 2);
            var9 = (field3580 >> 2) + (var4 >> 2);
            var10 = field3580 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field3580 >> 2);
            var12 = (field3580 >> 2) + (var4 - (var4 >> 2));
            var13 = field3580 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class147 var14 = field3577[field3578[var2]];
        int var15 = var14.field3304;
        int var16 = var14.field3301[var15];
        boolean var17 = !field3579[var16].method412();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field3303; var19++) {
            class119 var95 = field3573[var14.field3302[var19]];
            float[] var96 = field3555;
            var95.method932(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field3304;
            int var21 = var14.field3301[var20];
            field3579[var21].method406(field3555, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field3555[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field3555;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field3554 : field3562;
            float[] var30 = var3 ? field3572 : field3567;
            float[] var31 = var3 ? field3570 : field3574;
            int[] var32 = var3 ? field3556 : field3552;
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
            int var35 = class141.method1098(0, var4 - 1);
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
                field3555[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field3555[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field3568 > 0) {
            int var49 = this.field3568 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field3564) {
                for (int var50 = 0; var50 < this.field3575; var50++) {
                    int var51 = (this.field3568 >> 1) + var50;
                    var48[var50] += this.field3550[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field3555[var52];
                }
            }
        }
        float[] var54 = this.field3550;
        this.field3550 = field3555;
        field3555 = var54;
        this.field3568 = var4;
        this.field3575 = var12 - (var4 >> 1);
        this.field3564 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "([B)V")
    private final void method1200(byte[] arg0) {
        class103 var2 = new class103(arg0);
        this.field3576 = var2.method803(false);
        this.field3566 = var2.method803(false);
        this.field3557 = var2.method803(false);
        this.field3553 = var2.method803(false);
        if (this.field3553 < 0) {
            this.field3553 = ~this.field3553;
            this.field3560 = true;
        }
        int var3 = var2.method803(false);
        this.field3563 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method829((byte) -107);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method825(var5, var7, 0, 271632);
            this.field3563[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)F")
    public static final float method1201(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([I)Lm;")
    public final class83 method1202(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field3582 == null) {
            this.field3568 = 0;
            this.field3550 = new float[field3569];
            this.field3582 = new byte[this.field3566];
            this.field3583 = 0;
            this.field3581 = 0;
        }
        while (this.field3581 < this.field3563.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1199(this.field3581);
            if (var3 != null) {
                int var4 = this.field3583;
                int var5 = var3.length;
                if (var5 > this.field3566 - var4) {
                    var5 = this.field3566 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field3582[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field3583;
                }
                this.field3583 = var4;
            }
            this.field3581++;
        }
        this.field3550 = null;
        byte[] var2 = this.field3582;
        this.field3582 = null;
        return new class83(this.field3576, var2, this.field3557, this.field3553, this.field3560);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lie;)Z")
    private static final boolean method1203(class61 arg0) {
        if (!field3561) {
            byte[] var1 = arg0.method473((byte) 109, 0, 0);
            if (var1 == null) {
                return false;
            }
            method1194(var1);
            field3561 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "([B)V")
    private class156(byte[] arg0) {
        this.method1200(arg0);
    }
}
