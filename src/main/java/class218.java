import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class218 extends class202 {

    @OriginalMember(owner = "client!ql", name = "y", descriptor = "Z")
    private static boolean field3558 = false;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
    private int field3544;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
    private static int field3546;

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "I")
    private int field3552;

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "I")
    private int field3556;

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "I")
    private static int field3557;

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "I")
    private static int field3559;

    @OriginalMember(owner = "client!ql", name = "F", descriptor = "I")
    private int field3565;

    @OriginalMember(owner = "client!ql", name = "I", descriptor = "I")
    private int field3568;

    @OriginalMember(owner = "client!ql", name = "M", descriptor = "I")
    private int field3572;

    @OriginalMember(owner = "client!ql", name = "N", descriptor = "I")
    private static int field3573;

    @OriginalMember(owner = "client!ql", name = "P", descriptor = "I")
    private int field3575;

    @OriginalMember(owner = "client!ql", name = "R", descriptor = "I")
    private int field3577;

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "Z")
    private boolean field3555;

    @OriginalMember(owner = "client!ql", name = "E", descriptor = "Z")
    private boolean field3564;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "[B")
    private static byte[] field3548;

    @OriginalMember(owner = "client!ql", name = "Q", descriptor = "[B")
    private byte[] field3576;

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "[F")
    private static float[] field3549;

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "[F")
    private static float[] field3554;

    @OriginalMember(owner = "client!ql", name = "A", descriptor = "[F")
    private static float[] field3560;

    @OriginalMember(owner = "client!ql", name = "B", descriptor = "[F")
    private static float[] field3561;

    @OriginalMember(owner = "client!ql", name = "C", descriptor = "[F")
    private static float[] field3562;

    @OriginalMember(owner = "client!ql", name = "K", descriptor = "[F")
    private static float[] field3570;

    @OriginalMember(owner = "client!ql", name = "L", descriptor = "[F")
    private static float[] field3571;

    @OriginalMember(owner = "client!ql", name = "O", descriptor = "[F")
    private float[] field3574;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "[I")
    private static int[] field3545;

    @OriginalMember(owner = "client!ql", name = "D", descriptor = "[I")
    private static int[] field3563;

    @OriginalMember(owner = "client!ql", name = "J", descriptor = "[I")
    private static int[] field3569;

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "[Lm;")
    private static class116[] field3551;

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "[Lrb;")
    private static class268[] field3550;

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "[Lrh;")
    private static class46[] field3553;

    @OriginalMember(owner = "client!ql", name = "H", descriptor = "[Lja;")
    public static class59[] field3567;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "[Z")
    private static boolean[] field3547;

    @OriginalMember(owner = "client!ql", name = "G", descriptor = "[[B")
    private byte[][] field3566;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "([B)V")
    private final void method1482(byte[] arg0) {
        class221 var2 = new class221(arg0);
        this.field3544 = var2.method1526(-16777216);
        this.field3552 = var2.method1526(-16777216);
        this.field3556 = var2.method1526(-16777216);
        this.field3568 = var2.method1526(-16777216);
        if (this.field3568 < 0) {
            this.field3568 = ~this.field3568;
            this.field3564 = true;
        }
        int var3 = var2.method1526(-16777216);
        this.field3566 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1517((byte) -96);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1555(18379, var5, 0, var7);
            this.field3566[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "([B)V")
    private static final void method1483(byte[] arg0) {
        method1491(arg0, 0);
        field3559 = 0x1 << method1492(4);
        field3546 = 0x1 << method1492(4);
        field3571 = new float[field3546];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field3559 : field3546;
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
            int var25 = class25.method227(var17 - 1, (byte) -81);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class79.method552(var26, 173328129, var25);
            }
            if (var1 == 0) {
                field3549 = var18;
                field3562 = var20;
                field3554 = var22;
                field3545 = var24;
            } else {
                field3570 = var18;
                field3560 = var20;
                field3561 = var22;
                field3563 = var24;
            }
        }
        int var2 = method1492(8) + 1;
        field3567 = new class59[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field3567[var3] = new class59();
        }
        int var4 = method1492(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1492(16);
        }
        int var6 = method1492(6) + 1;
        field3553 = new class46[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field3553[var7] = new class46();
        }
        int var8 = method1492(6) + 1;
        field3551 = new class116[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field3551[var9] = new class116();
        }
        int var10 = method1492(6) + 1;
        field3550 = new class268[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field3550[var11] = new class268();
        }
        int var12 = method1492(6) + 1;
        field3547 = new boolean[var12];
        field3569 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field3547[var13] = method1489() != 0;
            method1492(16);
            method1492(16);
            field3569[var13] = method1492(8);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lqh;)Z")
    private static final boolean method1484(class201 arg0) {
        if (!field3558) {
            byte[] var1 = arg0.method1357(0, 0, -1);
            if (var1 == null) {
                return false;
            }
            method1483(var1);
            field3558 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)[F")
    private final float[] method1485(int arg0) {
        method1491(this.field3566[arg0], 0);
        method1489();
        int var2 = method1492(class25.method227(field3569.length - 1, (byte) -81));
        boolean var3 = field3547[var2];
        int var4 = var3 ? field3546 : field3559;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1489() != 0;
            var6 = method1489() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field3559 >> 2);
            var9 = (field3559 >> 2) + (var4 >> 2);
            var10 = field3559 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field3559 >> 2);
            var12 = (field3559 >> 2) + (var4 - (var4 >> 2));
            var13 = field3559 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class268 var14 = field3550[field3569[var2]];
        int var15 = var14.field4224;
        int var16 = var14.field4222[var15];
        boolean var17 = !field3553[var16].method375();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field4223; var19++) {
            class116 var95 = field3551[var14.field4221[var19]];
            float[] var96 = field3571;
            var95.method857(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field4224;
            int var21 = var14.field4222[var20];
            field3553[var21].method370(field3571, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field3571[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field3571;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field3570 : field3549;
            float[] var30 = var3 ? field3560 : field3562;
            float[] var31 = var3 ? field3561 : field3554;
            int[] var32 = var3 ? field3563 : field3545;
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
            int var35 = class25.method227(var4 - 1, (byte) -81);
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
                field3571[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field3571[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field3572 > 0) {
            int var49 = this.field3572 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field3555) {
                for (int var50 = 0; var50 < this.field3565; var50++) {
                    int var51 = (this.field3572 >> 1) + var50;
                    var48[var50] += this.field3574[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field3571[var52];
                }
            }
        }
        float[] var54 = this.field3574;
        this.field3574 = field3571;
        field3571 = var54;
        this.field3572 = var4;
        this.field3565 = var12 - (var4 >> 1);
        this.field3555 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "([I)Lcf;")
    public final class93 method1486(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field3576 == null) {
            this.field3572 = 0;
            this.field3574 = new float[field3546];
            this.field3576 = new byte[this.field3552];
            this.field3577 = 0;
            this.field3575 = 0;
        }
        while (this.field3575 < this.field3566.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1485(this.field3575);
            if (var3 != null) {
                int var4 = this.field3577;
                int var5 = var3.length;
                if (var5 > this.field3552 - var4) {
                    var5 = this.field3552 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field3576[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field3577;
                }
                this.field3577 = var4;
            }
            this.field3575++;
        }
        this.field3574 = null;
        byte[] var2 = this.field3576;
        this.field3576 = null;
        return new class93(this.field3544, var2, this.field3556, this.field3568, this.field3564);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "()V")
    public static void method1487() {
        field3548 = null;
        field3567 = null;
        field3553 = null;
        field3551 = null;
        field3550 = null;
        field3547 = null;
        field3569 = null;
        field3571 = null;
        field3549 = null;
        field3562 = null;
        field3554 = null;
        field3570 = null;
        field3560 = null;
        field3561 = null;
        field3545 = null;
        field3563 = null;
    }

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "(I)F")
    public static final float method1488(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "()I")
    public static final int method1489() {
        int var0 = field3548[field3573] >> field3557 & 0x1;
        field3557++;
        field3573 += field3557 >> 3;
        field3557 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lqh;II)Lql;")
    public static final class218 method1490(class201 arg0, int arg1, int arg2) {
        if (method1484(arg0)) {
            byte[] var3 = arg0.method1357(arg2, arg1, -1);
            return var3 == null ? null : new class218(var3);
        } else {
            arg0.method1371((byte) -112, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "([BI)V")
    private static final void method1491(byte[] arg0, int arg1) {
        field3548 = arg0;
        field3573 = arg1;
        field3557 = 0;
    }

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "(I)I")
    public static final int method1492(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field3557) {
            int var4 = 8 - field3557;
            int var5 = (0x1 << var4) - 1;
            var1 += (field3548[field3573] >> field3557 & var5) << var2;
            field3557 = 0;
            field3573++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field3548[field3573] >> field3557 & var3) << var2;
            field3557 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "([B)V")
    private class218(byte[] arg0) {
        this.method1482(arg0);
    }
}
