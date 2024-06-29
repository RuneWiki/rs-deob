import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public class class253 extends class154 {

    @OriginalMember(owner = "client!tea", name = "L", descriptor = "Z")
    private static boolean field3569 = false;

    @OriginalMember(owner = "client!tea", name = "k", descriptor = "I")
    private static int field3542;

    @OriginalMember(owner = "client!tea", name = "l", descriptor = "I")
    private int field3543;

    @OriginalMember(owner = "client!tea", name = "m", descriptor = "I")
    private static int field3544;

    @OriginalMember(owner = "client!tea", name = "n", descriptor = "I")
    private int field3545;

    @OriginalMember(owner = "client!tea", name = "x", descriptor = "I")
    private static int field3555;

    @OriginalMember(owner = "client!tea", name = "A", descriptor = "I")
    private int field3558;

    @OriginalMember(owner = "client!tea", name = "D", descriptor = "I")
    private int field3561;

    @OriginalMember(owner = "client!tea", name = "F", descriptor = "I")
    private static int field3563;

    @OriginalMember(owner = "client!tea", name = "I", descriptor = "I")
    private int field3566;

    @OriginalMember(owner = "client!tea", name = "J", descriptor = "I")
    private int field3567;

    @OriginalMember(owner = "client!tea", name = "N", descriptor = "I")
    private int field3571;

    @OriginalMember(owner = "client!tea", name = "O", descriptor = "I")
    private int field3572;

    @OriginalMember(owner = "client!tea", name = "q", descriptor = "Z")
    private boolean field3548;

    @OriginalMember(owner = "client!tea", name = "v", descriptor = "Z")
    private boolean field3553;

    @OriginalMember(owner = "client!tea", name = "p", descriptor = "[B")
    private static byte[] field3547;

    @OriginalMember(owner = "client!tea", name = "P", descriptor = "[B")
    private byte[] field3573;

    @OriginalMember(owner = "client!tea", name = "r", descriptor = "[F")
    private float[] field3549;

    @OriginalMember(owner = "client!tea", name = "s", descriptor = "[F")
    private static float[] field3550;

    @OriginalMember(owner = "client!tea", name = "y", descriptor = "[F")
    private static float[] field3556;

    @OriginalMember(owner = "client!tea", name = "z", descriptor = "[F")
    private static float[] field3557;

    @OriginalMember(owner = "client!tea", name = "B", descriptor = "[F")
    private static float[] field3559;

    @OriginalMember(owner = "client!tea", name = "G", descriptor = "[F")
    private static float[] field3564;

    @OriginalMember(owner = "client!tea", name = "K", descriptor = "[F")
    private static float[] field3568;

    @OriginalMember(owner = "client!tea", name = "M", descriptor = "[F")
    private static float[] field3570;

    @OriginalMember(owner = "client!tea", name = "i", descriptor = "[I")
    private static int[] field3540;

    @OriginalMember(owner = "client!tea", name = "t", descriptor = "[I")
    private static int[] field3551;

    @OriginalMember(owner = "client!tea", name = "w", descriptor = "[I")
    private static int[] field3554;

    @OriginalMember(owner = "client!tea", name = "E", descriptor = "[Lgf;")
    private static class293[] field3562;

    @OriginalMember(owner = "client!tea", name = "C", descriptor = "[Lsca;")
    private static class50[] field3560;

    @OriginalMember(owner = "client!tea", name = "H", descriptor = "[Lrf;")
    public static class92[] field3565;

    @OriginalMember(owner = "client!tea", name = "j", descriptor = "[Liia;")
    private static class96[] field3541;

    @OriginalMember(owner = "client!tea", name = "o", descriptor = "[Z")
    private static boolean[] field3546;

    @OriginalMember(owner = "client!tea", name = "u", descriptor = "[[B")
    private byte[][] field3552;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lgj;I)Ltea;", line = 5)
    public static final class253 method1660(class662 arg0, int arg1) {
        if (method1667(arg0)) {
            byte[] var2 = arg0.method3742(5, arg1);
            return var2 == null ? null : new class253(var2);
        } else {
            arg0.method3737(arg1, false);
            return null;
        }
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "()I", line = 20)
    public static final int method1661() {
        int var0 = field3547[field3555] >> field3563 & 0x1;
        field3563++;
        field3555 += field3563 >> 3;
        field3563 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "()V", line = 28)
    public static void method1662() {
        field3547 = null;
        field3565 = null;
        field3560 = null;
        field3562 = null;
        field3541 = null;
        field3546 = null;
        field3554 = null;
        field3557 = null;
        field3570 = null;
        field3564 = null;
        field3550 = null;
        field3559 = null;
        field3568 = null;
        field3556 = null;
        field3540 = null;
        field3551 = null;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "([B)V", line = 53)
    private static final void method1663(byte[] arg0) {
        method1670(arg0, 0);
        field3544 = 0x1 << method1666(4);
        field3542 = 0x1 << method1666(4);
        field3557 = new float[field3542];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field3544 : field3542;
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
            int var25 = class750.method4165(255, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class393.method2380(var25, 0, var26);
            }
            if (var1 == 0) {
                field3570 = var18;
                field3564 = var20;
                field3550 = var22;
                field3540 = var24;
            } else {
                field3559 = var18;
                field3568 = var20;
                field3556 = var22;
                field3551 = var24;
            }
        }
        int var2 = method1666(8) + 1;
        field3565 = new class92[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field3565[var3] = new class92();
        }
        int var4 = method1666(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1666(16);
        }
        int var6 = method1666(6) + 1;
        field3560 = new class50[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field3560[var7] = new class50();
        }
        int var8 = method1666(6) + 1;
        field3562 = new class293[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field3562[var9] = new class293();
        }
        int var10 = method1666(6) + 1;
        field3541 = new class96[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field3541[var11] = new class96();
        }
        int var12 = method1666(6) + 1;
        field3546 = new boolean[var12];
        field3554 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field3546[var13] = method1661() != 0;
            method1666(16);
            method1666(16);
            field3554[var13] = method1666(8);
        }
        field3569 = true;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)[F", line = 206)
    private final float[] method1664(int arg0) {
        method1670(this.field3552[arg0], 0);
        method1661();
        int var2 = method1666(class750.method4165(255, field3554.length - 1));
        boolean var3 = field3546[var2];
        int var4 = var3 ? field3542 : field3544;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1661() != 0;
            var6 = method1661() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field3544 >> 2);
            var9 = (field3544 >> 2) + (var4 >> 2);
            var10 = field3544 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field3544 >> 2);
            var12 = (field3544 >> 2) + (var4 - (var4 >> 2));
            var13 = field3544 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class96 var14 = field3541[field3554[var2]];
        int var15 = var14.field1476;
        int var16 = var14.field1474[var15];
        boolean var17 = !field3560[var16].method381();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1477; var19++) {
            class293 var95 = field3562[var14.field1475[var19]];
            float[] var96 = field3557;
            var95.method1859(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field1476;
            int var21 = var14.field1474[var20];
            field3560[var21].method382(field3557, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field3557[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field3557;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field3559 : field3570;
            float[] var30 = var3 ? field3568 : field3564;
            float[] var31 = var3 ? field3556 : field3550;
            int[] var32 = var3 ? field3551 : field3540;
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
            int var35 = class750.method4165(255, var4 - 1);
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
                field3557[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field3557[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field3567 > 0) {
            int var49 = this.field3567 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field3553) {
                for (int var50 = 0; var50 < this.field3561; var50++) {
                    int var51 = (this.field3567 >> 1) + var50;
                    var48[var50] += this.field3549[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field3557[var52];
                }
            }
        }
        float[] var54 = this.field3549;
        this.field3549 = field3557;
        field3557 = var54;
        this.field3567 = var4;
        this.field3561 = var12 - (var4 >> 1);
        this.field3553 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lgj;II)Ltea;", line = 623)
    public static final class253 method1665(class662 arg0, int arg1, int arg2) {
        if (method1667(arg0)) {
            byte[] var3 = arg0.method3732(arg2, 8906, arg1);
            return var3 == null ? null : new class253(var3);
        } else {
            arg0.method3720(arg1, arg2, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "(I)I", line = 640)
    public static final int method1666(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field3563) {
            int var4 = 8 - field3563;
            int var5 = (0x1 << var4) - 1;
            var1 += (field3547[field3555] >> field3563 & var5) << var2;
            field3563 = 0;
            field3555++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field3547[field3555] >> field3563 & var3) << var2;
            field3563 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lgj;)Z", line = 667)
    private static final boolean method1667(class662 arg0) {
        if (!field3569) {
            byte[] var1 = arg0.method3732(0, 8906, 0);
            if (var1 == null) {
                return false;
            }
            method1663(var1);
        }
        return true;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "([I)Lrea;", line = 686)
    public final class221 method1668(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field3573 == null) {
            this.field3567 = 0;
            this.field3549 = new float[field3542];
            this.field3573 = new byte[this.field3566];
            this.field3571 = 0;
            this.field3572 = 0;
        }
        while (this.field3572 < this.field3552.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1664(this.field3572);
            if (var3 != null) {
                int var4 = this.field3571;
                int var5 = var3.length;
                if (var5 > this.field3566 - var4) {
                    var5 = this.field3566 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field3573[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field3571;
                }
                this.field3571 = var4;
            }
            this.field3572++;
        }
        this.field3549 = null;
        byte[] var2 = this.field3573;
        this.field3573 = null;
        return new class221(this.field3545, var2, this.field3543, this.field3558, this.field3548);
    }

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "(I)F", line = 751)
    public static final float method1669(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!tea", name = "<init>", descriptor = "([B)V", line = 762)
    private class253(byte[] arg0) {
        this.method1671(arg0);
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "([BI)V", line = 770)
    private static final void method1670(byte[] arg0, int arg1) {
        field3547 = arg0;
        field3555 = arg1;
        field3563 = 0;
    }

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "([B)V", line = 779)
    private final void method1671(byte[] arg0) {
        class93 var2 = new class93(arg0);
        this.field3545 = var2.method773(3);
        this.field3566 = var2.method773(3);
        this.field3543 = var2.method773(3);
        this.field3558 = var2.method773(3);
        if (this.field3558 < 0) {
            this.field3558 = ~this.field3558;
            this.field3548 = true;
        }
        int var3 = var2.method773(3);
        this.field3552 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method793((byte) 37);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method737(-32768, var7, 0, var5);
            this.field3552[var4] = var7;
        }
    }
}
