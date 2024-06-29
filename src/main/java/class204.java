import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class204 extends class69 {

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "Z")
    private static boolean field3640 = false;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
    private int field3642;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "I")
    private int field3645;

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "I")
    private static int field3646;

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "I")
    private static int field3650;

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "I")
    private int field3651;

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "I")
    private int field3652;

    @OriginalMember(owner = "client!qi", name = "E", descriptor = "I")
    private int field3657;

    @OriginalMember(owner = "client!qi", name = "H", descriptor = "I")
    private static int field3659;

    @OriginalMember(owner = "client!qi", name = "Q", descriptor = "I")
    private int field3668;

    @OriginalMember(owner = "client!qi", name = "R", descriptor = "I")
    private static int field3669;

    @OriginalMember(owner = "client!qi", name = "U", descriptor = "I")
    private int field3672;

    @OriginalMember(owner = "client!qi", name = "V", descriptor = "I")
    private int field3673;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "Z")
    private boolean field3644;

    @OriginalMember(owner = "client!qi", name = "I", descriptor = "Z")
    private boolean field3660;

    @OriginalMember(owner = "client!qi", name = "J", descriptor = "[B")
    private static byte[] field3661;

    @OriginalMember(owner = "client!qi", name = "S", descriptor = "[B")
    private byte[] field3670;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "[F")
    private static float[] field3641;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "[F")
    private static float[] field3643;

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "[F")
    private static float[] field3649;

    @OriginalMember(owner = "client!qi", name = "A", descriptor = "[F")
    private static float[] field3653;

    @OriginalMember(owner = "client!qi", name = "B", descriptor = "[F")
    private static float[] field3654;

    @OriginalMember(owner = "client!qi", name = "M", descriptor = "[F")
    private float[] field3664;

    @OriginalMember(owner = "client!qi", name = "N", descriptor = "[F")
    private static float[] field3665;

    @OriginalMember(owner = "client!qi", name = "O", descriptor = "[F")
    private static float[] field3666;

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "[I")
    private static int[] field3648;

    @OriginalMember(owner = "client!qi", name = "P", descriptor = "[I")
    private static int[] field3667;

    @OriginalMember(owner = "client!qi", name = "T", descriptor = "[I")
    private static int[] field3671;

    @OriginalMember(owner = "client!qi", name = "C", descriptor = "[Lvb;")
    public static class123[] field3655;

    @OriginalMember(owner = "client!qi", name = "G", descriptor = "[Lqh;")
    private static class125[] field3658;

    @OriginalMember(owner = "client!qi", name = "D", descriptor = "[Lrb;")
    private static class153[] field3656;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "[Lik;")
    private static class276[] field3647;

    @OriginalMember(owner = "client!qi", name = "K", descriptor = "[Z")
    private static boolean[] field3662;

    @OriginalMember(owner = "client!qi", name = "L", descriptor = "[[B")
    private byte[][] field3663;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "([B)V")
    private static final void method1439(byte[] arg0) {
        method1445(arg0, 0);
        field3659 = 0x1 << method1446(4);
        field3669 = 0x1 << method1446(4);
        field3643 = new float[field3669];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field3659 : field3669;
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
            int var25 = class118.method946(var17 - 1, false);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class238.method1639(0, var25, var26);
            }
            if (var1 == 0) {
                field3665 = var18;
                field3641 = var20;
                field3649 = var22;
                field3671 = var24;
            } else {
                field3654 = var18;
                field3653 = var20;
                field3666 = var22;
                field3648 = var24;
            }
        }
        int var2 = method1446(8) + 1;
        field3655 = new class123[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field3655[var3] = new class123();
        }
        int var4 = method1446(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1446(16);
        }
        int var6 = method1446(6) + 1;
        field3658 = new class125[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field3658[var7] = new class125();
        }
        int var8 = method1446(6) + 1;
        field3647 = new class276[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field3647[var9] = new class276();
        }
        int var10 = method1446(6) + 1;
        field3656 = new class153[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field3656[var11] = new class153();
        }
        int var12 = method1446(6) + 1;
        field3662 = new boolean[var12];
        field3667 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field3662[var13] = method1444() != 0;
            method1446(16);
            method1446(16);
            field3667[var13] = method1446(8);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "([I)Ldk;")
    public final class224 method1440(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field3670 == null) {
            this.field3668 = 0;
            this.field3664 = new float[field3669];
            this.field3670 = new byte[this.field3657];
            this.field3673 = 0;
            this.field3672 = 0;
        }
        while (this.field3672 < this.field3663.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1447(this.field3672);
            if (var3 != null) {
                int var4 = this.field3673;
                int var5 = var3.length;
                if (var5 > this.field3657 - var4) {
                    var5 = this.field3657 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field3670[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field3673;
                }
                this.field3673 = var4;
            }
            this.field3672++;
        }
        this.field3664 = null;
        byte[] var2 = this.field3670;
        this.field3670 = null;
        return new class224(this.field3651, var2, this.field3642, this.field3652, this.field3644);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lpi;II)Lqi;")
    public static final class204 method1441(class181 arg0, int arg1, int arg2) {
        if (method1442(arg0)) {
            byte[] var3 = arg0.method1293(arg2, arg1, (byte) 68);
            return var3 == null ? null : new class204(var3);
        } else {
            arg0.method1321(arg2, (byte) 61, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lpi;)Z")
    private static final boolean method1442(class181 arg0) {
        if (!field3640) {
            byte[] var1 = arg0.method1293(0, 0, (byte) -97);
            if (var1 == null) {
                return false;
            }
            method1439(var1);
            field3640 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "()V")
    public static void method1443() {
        field3661 = null;
        field3655 = null;
        field3658 = null;
        field3647 = null;
        field3656 = null;
        field3662 = null;
        field3667 = null;
        field3643 = null;
        field3665 = null;
        field3641 = null;
        field3649 = null;
        field3654 = null;
        field3653 = null;
        field3666 = null;
        field3671 = null;
        field3648 = null;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "()I")
    public static final int method1444() {
        int var0 = field3661[field3650] >> field3646 & 0x1;
        field3646++;
        field3650 += field3646 >> 3;
        field3646 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "([BI)V")
    private static final void method1445(byte[] arg0, int arg1) {
        field3661 = arg0;
        field3650 = arg1;
        field3646 = 0;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)I")
    public static final int method1446(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field3646) {
            int var4 = 8 - field3646;
            int var5 = (0x1 << var4) - 1;
            var1 += (field3661[field3650] >> field3646 & var5) << var2;
            field3646 = 0;
            field3650++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field3661[field3650] >> field3646 & var3) << var2;
            field3646 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)[F")
    private final float[] method1447(int arg0) {
        method1445(this.field3663[arg0], 0);
        method1444();
        int var2 = method1446(class118.method946(field3667.length - 1, false));
        boolean var3 = field3662[var2];
        int var4 = var3 ? field3669 : field3659;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1444() != 0;
            var6 = method1444() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field3659 >> 2);
            var9 = (field3659 >> 2) + (var4 >> 2);
            var10 = field3659 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field3659 >> 2);
            var12 = (field3659 >> 2) + (var4 - (var4 >> 2));
            var13 = field3659 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class153 var14 = field3656[field3667[var2]];
        int var15 = var14.field2705;
        int var16 = var14.field2706[var15];
        boolean var17 = !field3658[var16].method976();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2707; var19++) {
            class276 var95 = field3647[var14.field2704[var19]];
            float[] var96 = field3643;
            var95.method1860(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2705;
            int var21 = var14.field2706[var20];
            field3658[var21].method975(field3643, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field3643[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field3643;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field3654 : field3665;
            float[] var30 = var3 ? field3653 : field3641;
            float[] var31 = var3 ? field3666 : field3649;
            int[] var32 = var3 ? field3648 : field3671;
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
            int var35 = class118.method946(var4 - 1, false);
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
                field3643[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field3643[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field3668 > 0) {
            int var49 = this.field3668 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field3660) {
                for (int var50 = 0; var50 < this.field3645; var50++) {
                    int var51 = (this.field3668 >> 1) + var50;
                    var48[var50] += this.field3664[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field3643[var52];
                }
            }
        }
        float[] var54 = this.field3664;
        this.field3664 = field3643;
        field3643 = var54;
        this.field3668 = var4;
        this.field3645 = var12 - (var4 >> 1);
        this.field3660 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "([B)V")
    private final void method1448(byte[] arg0) {
        class75 var2 = new class75(arg0);
        this.field3651 = var2.method562((byte) -71);
        this.field3657 = var2.method562((byte) -71);
        this.field3642 = var2.method562((byte) -71);
        this.field3652 = var2.method562((byte) -71);
        if (this.field3652 < 0) {
            this.field3652 = ~this.field3652;
            this.field3644 = true;
        }
        int var3 = var2.method562((byte) -71);
        this.field3663 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method558(1);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method553(-1, var5, var7, 0);
            this.field3663[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "([B)V")
    private class204(byte[] arg0) {
        this.method1448(arg0);
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(I)F")
    public static final float method1449(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }
}
