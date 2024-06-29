import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class146 {

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "Z")
    private static boolean field3565 = false;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    private static int field3558;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    private static int field3559;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    private int field3567;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    private static int field3568;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    private static int field3569;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    private int field3570;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    private static int field3571;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
    private int field3576;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    private static int field3577;

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
    private int field3580;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "Z")
    private static boolean field3555;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "Z")
    private boolean field3556;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "[B")
    private static byte[] field3575;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "[F")
    private static float[] field3554;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "[F")
    private static float[] field3560;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "[F")
    private static float[] field3562;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "[F")
    private static float[] field3563;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "[F")
    private static float[] field3566;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "[F")
    private static float[] field3574;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "[F")
    private static float[] field3581;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "[F")
    private static float[] field3583;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "[I")
    private static int[] field3557;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "[I")
    private static int[] field3582;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "[I")
    private static int[] field3584;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "[Lhf;")
    public static class55[] field3564;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "[Lka;")
    private static class70[] field3573;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "[Llf;")
    private static class82[] field3561;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "[Lme;")
    private static class88[] field3579;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "[Z")
    private static boolean[] field3578;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "[[B")
    private byte[][] field3572;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lge;I)Lwc;")
    public static final class146 method1172(class47 arg0, int arg1) {
        if (method1174(arg0)) {
            byte[] var2 = arg0.method533(arg1, (byte) 25);
            return var2 == null ? null : new class146(var2);
        } else {
            arg0.method531(true, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([B)V")
    private static final void method1173(byte[] arg0) {
        method1175(arg0, 0);
        field3571 = 0x1 << method1178(4);
        field3568 = 0x1 << method1178(4);
        field3560 = new float[field3568];
        field3566 = new float[field3568];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field3571 : field3568;
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
            int var25 = class61.method622(false, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class132.method1085(var25, var26, (byte) 48);
            }
            if (var1 == 0) {
                field3563 = var18;
                field3562 = var20;
                field3554 = var22;
                field3582 = var24;
            } else {
                field3581 = var18;
                field3574 = var20;
                field3583 = var22;
                field3557 = var24;
            }
        }
        int var2 = method1178(8) + 1;
        field3564 = new class55[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field3564[var3] = new class55();
        }
        int var4 = method1178(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1178(16);
        }
        int var6 = method1178(6) + 1;
        field3573 = new class70[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field3573[var7] = new class70();
        }
        int var8 = method1178(6) + 1;
        field3561 = new class82[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field3561[var9] = new class82();
        }
        int var10 = method1178(6) + 1;
        field3579 = new class88[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field3579[var11] = new class88();
        }
        int var12 = method1178(6) + 1;
        field3578 = new boolean[var12];
        field3584 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field3578[var13] = method1179() != 0;
            method1178(16);
            method1178(16);
            field3584[var13] = method1178(8);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lge;)Z")
    private static final boolean method1174(class47 arg0) {
        if (!field3565) {
            byte[] var1 = arg0.method526((byte) 125, 0, 0);
            if (var1 == null) {
                return false;
            }
            method1173(var1);
            field3565 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([BI)V")
    private static final void method1175(byte[] arg0, int arg1) {
        field3575 = arg0;
        field3558 = arg1;
        field3577 = 0;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "()V")
    public static void method1176() {
        field3575 = null;
        field3564 = null;
        field3573 = null;
        field3561 = null;
        field3579 = null;
        field3578 = null;
        field3584 = null;
        field3566 = null;
        field3560 = null;
        field3563 = null;
        field3562 = null;
        field3554 = null;
        field3581 = null;
        field3574 = null;
        field3583 = null;
        field3582 = null;
        field3557 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)[F")
    private final float[] method1177(int arg0) {
        method1175(this.field3572[arg0], 0);
        method1179();
        int var2 = method1178(class61.method622(false, field3584.length - 1));
        boolean var3 = field3578[var2];
        int var4 = var3 ? field3568 : field3571;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1179() != 0;
            var6 = method1179() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field3571 >> 2);
            var9 = (field3571 >> 2) + (var4 >> 2);
            var10 = field3571 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field3571 >> 2);
            var12 = (field3571 >> 2) + (var4 - (var4 >> 2));
            var13 = field3571 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class88 var14 = field3579[field3584[var2]];
        int var15 = var14.field2281;
        int var16 = var14.field2284[var15];
        boolean var17 = !field3573[var16].method681();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2282; var19++) {
            class82 var95 = field3561[var14.field2283[var19]];
            float[] var96 = field3560;
            var95.method750(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2281;
            int var21 = var14.field2284[var20];
            field3573[var21].method676(field3560, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field3560[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field3560;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field3581 : field3563;
            float[] var30 = var3 ? field3574 : field3562;
            float[] var31 = var3 ? field3583 : field3554;
            int[] var32 = var3 ? field3557 : field3582;
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
            int var35 = class61.method622(false, var4 - 1);
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
                field3560[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field3560[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (field3559 > 0) {
            int var49 = field3559 + var4 >> 2;
            var48 = new float[var49];
            if (!field3555) {
                for (int var50 = 0; var50 < field3569; var50++) {
                    int var51 = (field3559 >> 1) + var50;
                    var48[var50] += field3566[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field3560[var52];
                }
            }
        }
        float[] var54 = field3566;
        field3566 = field3560;
        field3560 = var54;
        field3559 = var4;
        field3569 = var12 - (var4 >> 1);
        field3555 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)I")
    public static final int method1178(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field3577) {
            int var4 = 8 - field3577;
            int var5 = (0x1 << var4) - 1;
            var1 += (field3575[field3558] >> field3577 & var5) << var2;
            field3577 = 0;
            field3558++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field3575[field3558] >> field3577 & var3) << var2;
            field3577 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "()I")
    public static final int method1179() {
        int var0 = field3575[field3558] >> field3577 & 0x1;
        field3577++;
        field3558 += field3577 >> 3;
        field3577 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "()Lta;")
    public final class126 method1180() {
        field3559 = 0;
        byte[] var1 = new byte[this.field3576];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field3572.length; var3++) {
            float[] var4 = this.method1177(var3);
            if (var4 != null) {
                int var5 = var4.length;
                if (var5 > this.field3576 - var2) {
                    var5 = this.field3576 - var2;
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
        return new class126(this.field3570, var1, this.field3580, this.field3567, this.field3556);
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)F")
    public static final float method1181(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "([B)V")
    private final void method1182(byte[] arg0) {
        class14 var2 = new class14(arg0);
        this.field3570 = var2.method121((byte) 88);
        this.field3576 = var2.method121((byte) -127);
        this.field3580 = var2.method121((byte) -111);
        this.field3567 = var2.method121((byte) -128);
        if (this.field3567 < 0) {
            this.field3567 = ~this.field3567;
            this.field3556 = true;
        }
        int var3 = var2.method121((byte) 107);
        this.field3572 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method153(true);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method139(255, var7, var5, 0);
            this.field3572[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "([B)V")
    private class146(byte[] arg0) {
        this.method1182(arg0);
    }
}
