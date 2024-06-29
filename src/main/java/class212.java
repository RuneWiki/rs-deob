import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class212 extends class134 {

    @OriginalMember(owner = "client!w", name = "E", descriptor = "Z")
    private static boolean field3575 = false;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    private int field3566;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "I")
    private int field3567;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "I")
    private static int field3569;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "I")
    private int field3571;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "I")
    private int field3577;

    @OriginalMember(owner = "client!w", name = "I", descriptor = "I")
    private static int field3579;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "I")
    private static int field3581;

    @OriginalMember(owner = "client!w", name = "P", descriptor = "I")
    private int field3586;

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "I")
    private int field3587;

    @OriginalMember(owner = "client!w", name = "S", descriptor = "I")
    private static int field3589;

    @OriginalMember(owner = "client!w", name = "U", descriptor = "I")
    private int field3591;

    @OriginalMember(owner = "client!w", name = "V", descriptor = "I")
    private int field3592;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "Z")
    private boolean field3572;

    @OriginalMember(owner = "client!w", name = "M", descriptor = "Z")
    private boolean field3583;

    @OriginalMember(owner = "client!w", name = "H", descriptor = "[B")
    private static byte[] field3578;

    @OriginalMember(owner = "client!w", name = "T", descriptor = "[B")
    private byte[] field3590;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "[F")
    private static float[] field3559;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "[F")
    private static float[] field3560;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "[F")
    private static float[] field3565;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "[F")
    private static float[] field3570;

    @OriginalMember(owner = "client!w", name = "D", descriptor = "[F")
    private static float[] field3574;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "[F")
    private static float[] field3576;

    @OriginalMember(owner = "client!w", name = "N", descriptor = "[F")
    private float[] field3584;

    @OriginalMember(owner = "client!w", name = "O", descriptor = "[F")
    private static float[] field3585;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "[I")
    private static int[] field3564;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "[I")
    private static int[] field3580;

    @OriginalMember(owner = "client!w", name = "R", descriptor = "[I")
    private static int[] field3588;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "[Ln;")
    public static class106[] field3568;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "[Lbl;")
    private static class192[] field3561;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "[Loi;")
    private static class308[] field3563;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "[Lnb;")
    private static class53[] field3573;

    @OriginalMember(owner = "client!w", name = "L", descriptor = "[Z")
    private static boolean[] field3582;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "[[B")
    private byte[][] field3562;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([B)V")
    private final void method1501(byte[] arg0) {
        class249 var2 = new class249(arg0);
        this.field3567 = var2.method1800(114);
        this.field3566 = var2.method1800(110);
        this.field3587 = var2.method1800(-96);
        this.field3577 = var2.method1800(-128);
        if (this.field3577 < 0) {
            this.field3577 = ~this.field3577;
            this.field3572 = true;
        }
        int var3 = var2.method1800(125);
        this.field3562 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1802((byte) -121);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1805((byte) -51, var5, 0, var7);
            this.field3562[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Laj;II)Lw;")
    public static final class212 method1502(class151 arg0, int arg1, int arg2) {
        if (method1508(arg0)) {
            byte[] var3 = arg0.method1149(arg1, (byte) 45, arg2);
            return var3 == null ? null : new class212(var3);
        } else {
            arg0.method1136(arg1, arg2, true);
            return null;
        }
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "(I)[F")
    private final float[] method1503(int arg0) {
        method1506(this.field3562[arg0], 0);
        method1509();
        int var2 = method1505(class123.method932((byte) -23, field3564.length - 1));
        boolean var3 = field3582[var2];
        int var4 = var3 ? field3569 : field3579;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1509() != 0;
            var6 = method1509() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field3579 >> 2);
            var9 = (field3579 >> 2) + (var4 >> 2);
            var10 = field3579 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field3579 >> 2);
            var12 = (field3579 >> 2) + (var4 - (var4 >> 2));
            var13 = field3579 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class53 var14 = field3573[field3564[var2]];
        int var15 = var14.field892;
        int var16 = var14.field895[var15];
        boolean var17 = !field3561[var16].method1380();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field893; var19++) {
            class308 var95 = field3563[var14.field894[var19]];
            float[] var96 = field3560;
            var95.method2079(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field892;
            int var21 = var14.field895[var20];
            field3561[var21].method1381(field3560, var4 >> 1);
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
            float[] var29 = var3 ? field3574 : field3570;
            float[] var30 = var3 ? field3576 : field3565;
            float[] var31 = var3 ? field3585 : field3559;
            int[] var32 = var3 ? field3588 : field3580;
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
            int var35 = class123.method932((byte) -23, var4 - 1);
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
        if (this.field3586 > 0) {
            int var49 = this.field3586 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field3583) {
                for (int var50 = 0; var50 < this.field3571; var50++) {
                    int var51 = (this.field3586 >> 1) + var50;
                    var48[var50] += this.field3584[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field3560[var52];
                }
            }
        }
        float[] var54 = this.field3584;
        this.field3584 = field3560;
        field3560 = var54;
        this.field3586 = var4;
        this.field3571 = var12 - (var4 >> 1);
        this.field3583 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([I)Lti;")
    public final class178 method1504(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field3590 == null) {
            this.field3586 = 0;
            this.field3584 = new float[field3569];
            this.field3590 = new byte[this.field3566];
            this.field3591 = 0;
            this.field3592 = 0;
        }
        while (this.field3592 < this.field3562.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1503(this.field3592);
            if (var3 != null) {
                int var4 = this.field3591;
                int var5 = var3.length;
                if (var5 > this.field3566 - var4) {
                    var5 = this.field3566 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field3590[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field3591;
                }
                this.field3591 = var4;
            }
            this.field3592++;
        }
        this.field3584 = null;
        byte[] var2 = this.field3590;
        this.field3590 = null;
        return new class178(this.field3567, var2, this.field3587, this.field3577, this.field3572);
    }

    @OriginalMember(owner = "client!w", name = "g", descriptor = "(I)I")
    public static final int method1505(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field3589) {
            int var4 = 8 - field3589;
            int var5 = (0x1 << var4) - 1;
            var1 += (field3578[field3581] >> field3589 & var5) << var2;
            field3589 = 0;
            field3581++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field3578[field3581] >> field3589 & var3) << var2;
            field3589 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "([BI)V")
    private static final void method1506(byte[] arg0, int arg1) {
        field3578 = arg0;
        field3581 = arg1;
        field3589 = 0;
    }

    @OriginalMember(owner = "client!w", name = "h", descriptor = "(I)F")
    public static final float method1507(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Laj;)Z")
    private static final boolean method1508(class151 arg0) {
        if (!field3575) {
            byte[] var1 = arg0.method1149(0, (byte) 117, 0);
            if (var1 == null) {
                return false;
            }
            method1510(var1);
            field3575 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "()I")
    public static final int method1509() {
        int var0 = field3578[field3581] >> field3589 & 0x1;
        field3589++;
        field3581 += field3589 >> 3;
        field3589 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "([B)V")
    private static final void method1510(byte[] arg0) {
        method1506(arg0, 0);
        field3579 = 0x1 << method1505(4);
        field3569 = 0x1 << method1505(4);
        field3560 = new float[field3569];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field3579 : field3569;
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
            int var25 = class123.method932((byte) -23, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class43.method256(var26, var25, false);
            }
            if (var1 == 0) {
                field3570 = var18;
                field3565 = var20;
                field3559 = var22;
                field3580 = var24;
            } else {
                field3574 = var18;
                field3576 = var20;
                field3585 = var22;
                field3588 = var24;
            }
        }
        int var2 = method1505(8) + 1;
        field3568 = new class106[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field3568[var3] = new class106();
        }
        int var4 = method1505(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1505(16);
        }
        int var6 = method1505(6) + 1;
        field3561 = new class192[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field3561[var7] = new class192();
        }
        int var8 = method1505(6) + 1;
        field3563 = new class308[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field3563[var9] = new class308();
        }
        int var10 = method1505(6) + 1;
        field3573 = new class53[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field3573[var11] = new class53();
        }
        int var12 = method1505(6) + 1;
        field3582 = new boolean[var12];
        field3564 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field3582[var13] = method1509() != 0;
            method1505(16);
            method1505(16);
            field3564[var13] = method1505(8);
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "()V")
    public static void method1511() {
        field3578 = null;
        field3568 = null;
        field3561 = null;
        field3563 = null;
        field3573 = null;
        field3582 = null;
        field3564 = null;
        field3560 = null;
        field3570 = null;
        field3565 = null;
        field3559 = null;
        field3574 = null;
        field3576 = null;
        field3585 = null;
        field3580 = null;
        field3588 = null;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "([B)V")
    private class212(byte[] arg0) {
        this.method1501(arg0);
    }
}
