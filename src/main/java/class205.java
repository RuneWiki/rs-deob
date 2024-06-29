import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class205 extends class41 {

    @OriginalMember(owner = "client!mg", name = "ab", descriptor = "Z")
    private static boolean field3540 = false;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "I")
    private int field3511;

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "I")
    private static int field3515;

    @OriginalMember(owner = "client!mg", name = "C", descriptor = "I")
    private static int field3517;

    @OriginalMember(owner = "client!mg", name = "I", descriptor = "I")
    private int field3523;

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "I")
    private int field3525;

    @OriginalMember(owner = "client!mg", name = "M", descriptor = "I")
    private int field3527;

    @OriginalMember(owner = "client!mg", name = "O", descriptor = "I")
    private int field3529;

    @OriginalMember(owner = "client!mg", name = "Q", descriptor = "I")
    private int field3531;

    @OriginalMember(owner = "client!mg", name = "T", descriptor = "I")
    private static int field3534;

    @OriginalMember(owner = "client!mg", name = "W", descriptor = "I")
    private static int field3536;

    @OriginalMember(owner = "client!mg", name = "bb", descriptor = "I")
    private int field3541;

    @OriginalMember(owner = "client!mg", name = "cb", descriptor = "I")
    private int field3542;

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "Z")
    private boolean field3512;

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "Z")
    private boolean field3524;

    @OriginalMember(owner = "client!mg", name = "N", descriptor = "[B")
    private static byte[] field3528;

    @OriginalMember(owner = "client!mg", name = "db", descriptor = "[B")
    private byte[] field3543;

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "[F")
    private static float[] field3514;

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "[F")
    private float[] field3516;

    @OriginalMember(owner = "client!mg", name = "D", descriptor = "[F")
    private static float[] field3518;

    @OriginalMember(owner = "client!mg", name = "F", descriptor = "[F")
    private static float[] field3520;

    @OriginalMember(owner = "client!mg", name = "H", descriptor = "[F")
    private static float[] field3522;

    @OriginalMember(owner = "client!mg", name = "P", descriptor = "[F")
    private static float[] field3530;

    @OriginalMember(owner = "client!mg", name = "R", descriptor = "[F")
    private static float[] field3532;

    @OriginalMember(owner = "client!mg", name = "Y", descriptor = "[F")
    private static float[] field3538;

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "[I")
    private static int[] field3513;

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "[I")
    private static int[] field3526;

    @OriginalMember(owner = "client!mg", name = "U", descriptor = "[I")
    private static int[] field3535;

    @OriginalMember(owner = "client!mg", name = "Z", descriptor = "[Lvh;")
    public static class112[] field3539;

    @OriginalMember(owner = "client!mg", name = "S", descriptor = "[Lha;")
    private static class158[] field3533;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "[Lpc;")
    private static class226[] field3510;

    @OriginalMember(owner = "client!mg", name = "E", descriptor = "[Ldj;")
    private static class54[] field3519;

    @OriginalMember(owner = "client!mg", name = "G", descriptor = "[Z")
    private static boolean[] field3521;

    @OriginalMember(owner = "client!mg", name = "X", descriptor = "[[B")
    private byte[][] field3537;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "([I)Lee;")
    public final class150 method1363(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field3543 == null) {
            this.field3523 = 0;
            this.field3516 = new float[field3515];
            this.field3543 = new byte[this.field3527];
            this.field3541 = 0;
            this.field3542 = 0;
        }
        while (this.field3542 < this.field3537.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1373(this.field3542);
            if (var3 != null) {
                int var4 = this.field3541;
                int var5 = var3.length;
                if (var5 > this.field3527 - var4) {
                    var5 = this.field3527 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field3543[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field3541;
                }
                this.field3541 = var4;
            }
            this.field3542++;
        }
        this.field3516 = null;
        byte[] var2 = this.field3543;
        this.field3543 = null;
        return new class150(this.field3525, var2, this.field3511, this.field3531, this.field3512);
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)I")
    public static final int method1364(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field3517) {
            int var4 = 8 - field3517;
            int var5 = (0x1 << var4) - 1;
            var1 += (field3528[field3534] >> field3517 & var5) << var2;
            field3517 = 0;
            field3534++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field3528[field3534] >> field3517 & var3) << var2;
            field3517 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljb;II)Lmg;")
    public static final class205 method1365(class11 arg0, int arg1, int arg2) {
        if (method1367(arg0)) {
            byte[] var3 = arg0.method89(arg2, arg1, 112);
            return var3 == null ? null : new class205(var3);
        } else {
            arg0.method111(arg1, arg2, (byte) -79);
            return null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "()I")
    public static final int method1366() {
        int var0 = field3528[field3534] >> field3517 & 0x1;
        field3517++;
        field3534 += field3517 >> 3;
        field3517 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljb;)Z")
    private static final boolean method1367(class11 arg0) {
        if (!field3540) {
            byte[] var1 = arg0.method89(0, 0, 123);
            if (var1 == null) {
                return false;
            }
            method1368(var1);
            field3540 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "([B)V")
    private static final void method1368(byte[] arg0) {
        method1369(arg0, 0);
        field3536 = 0x1 << method1364(4);
        field3515 = 0x1 << method1364(4);
        field3520 = new float[field3515];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field3536 : field3515;
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
            int var25 = class212.method1407(var17 - 1, (byte) 118);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class19.method183(-122, var26, var25);
            }
            if (var1 == 0) {
                field3514 = var18;
                field3522 = var20;
                field3532 = var22;
                field3513 = var24;
            } else {
                field3530 = var18;
                field3538 = var20;
                field3518 = var22;
                field3535 = var24;
            }
        }
        int var2 = method1364(8) + 1;
        field3539 = new class112[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field3539[var3] = new class112();
        }
        int var4 = method1364(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1364(16);
        }
        int var6 = method1364(6) + 1;
        field3519 = new class54[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field3519[var7] = new class54();
        }
        int var8 = method1364(6) + 1;
        field3533 = new class158[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field3533[var9] = new class158();
        }
        int var10 = method1364(6) + 1;
        field3510 = new class226[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field3510[var11] = new class226();
        }
        int var12 = method1364(6) + 1;
        field3521 = new boolean[var12];
        field3526 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field3521[var13] = method1366() != 0;
            method1364(16);
            method1364(16);
            field3526[var13] = method1364(8);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "([BI)V")
    private static final void method1369(byte[] arg0, int arg1) {
        field3528 = arg0;
        field3534 = arg1;
        field3517 = 0;
    }

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "(I)F")
    public static final float method1370(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "()V")
    public static void method1371() {
        field3528 = null;
        field3539 = null;
        field3519 = null;
        field3533 = null;
        field3510 = null;
        field3521 = null;
        field3526 = null;
        field3520 = null;
        field3514 = null;
        field3522 = null;
        field3532 = null;
        field3530 = null;
        field3538 = null;
        field3518 = null;
        field3513 = null;
        field3535 = null;
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "([B)V")
    private final void method1372(byte[] arg0) {
        class230 var2 = new class230(arg0);
        this.field3525 = var2.method1529(-32494);
        this.field3527 = var2.method1529(-32494);
        this.field3511 = var2.method1529(-32494);
        this.field3531 = var2.method1529(-32494);
        if (this.field3531 < 0) {
            this.field3531 = ~this.field3531;
            this.field3512 = true;
        }
        int var3 = var2.method1529(-32494);
        this.field3537 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1516((byte) 82);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1530(0, -103, var7, var5);
            this.field3537[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "(I)[F")
    private final float[] method1373(int arg0) {
        method1369(this.field3537[arg0], 0);
        method1366();
        int var2 = method1364(class212.method1407(field3526.length - 1, (byte) 106));
        boolean var3 = field3521[var2];
        int var4 = var3 ? field3515 : field3536;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1366() != 0;
            var6 = method1366() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field3536 >> 2);
            var9 = (field3536 >> 2) + (var4 >> 2);
            var10 = field3536 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field3536 >> 2);
            var12 = (field3536 >> 2) + (var4 - (var4 >> 2));
            var13 = field3536 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class226 var14 = field3510[field3526[var2]];
        int var15 = var14.field3889;
        int var16 = var14.field3888[var15];
        boolean var17 = !field3519[var16].method401();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field3887; var19++) {
            class158 var95 = field3533[var14.field3890[var19]];
            float[] var96 = field3520;
            var95.method1063(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field3889;
            int var21 = var14.field3888[var20];
            field3519[var21].method397(field3520, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field3520[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field3520;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field3530 : field3514;
            float[] var30 = var3 ? field3538 : field3522;
            float[] var31 = var3 ? field3518 : field3532;
            int[] var32 = var3 ? field3535 : field3513;
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
            int var35 = class212.method1407(var4 - 1, (byte) 85);
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
                field3520[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field3520[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field3523 > 0) {
            int var49 = this.field3523 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field3524) {
                for (int var50 = 0; var50 < this.field3529; var50++) {
                    int var51 = (this.field3523 >> 1) + var50;
                    var48[var50] += this.field3516[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field3520[var52];
                }
            }
        }
        float[] var54 = this.field3516;
        this.field3516 = field3520;
        field3520 = var54;
        this.field3523 = var4;
        this.field3529 = var12 - (var4 >> 1);
        this.field3524 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "([B)V")
    private class205(byte[] arg0) {
        this.method1372(arg0);
    }
}
