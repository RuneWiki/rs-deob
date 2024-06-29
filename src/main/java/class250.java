import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class250 extends class26 {

    @OriginalMember(owner = "client!qn", name = "G", descriptor = "Z")
    private static boolean field3656 = false;

    @OriginalMember(owner = "client!qn", name = "o", descriptor = "I")
    private static int field3639;

    @OriginalMember(owner = "client!qn", name = "r", descriptor = "I")
    private int field3642;

    @OriginalMember(owner = "client!qn", name = "w", descriptor = "I")
    private static int field3647;

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "I")
    private int field3650;

    @OriginalMember(owner = "client!qn", name = "A", descriptor = "I")
    private int field3651;

    @OriginalMember(owner = "client!qn", name = "H", descriptor = "I")
    private static int field3657;

    @OriginalMember(owner = "client!qn", name = "I", descriptor = "I")
    private int field3658;

    @OriginalMember(owner = "client!qn", name = "J", descriptor = "I")
    private int field3659;

    @OriginalMember(owner = "client!qn", name = "K", descriptor = "I")
    private static int field3660;

    @OriginalMember(owner = "client!qn", name = "T", descriptor = "I")
    private int field3669;

    @OriginalMember(owner = "client!qn", name = "U", descriptor = "I")
    private int field3670;

    @OriginalMember(owner = "client!qn", name = "W", descriptor = "I")
    private int field3672;

    @OriginalMember(owner = "client!qn", name = "x", descriptor = "Z")
    private boolean field3648;

    @OriginalMember(owner = "client!qn", name = "S", descriptor = "Z")
    private boolean field3668;

    @OriginalMember(owner = "client!qn", name = "t", descriptor = "[B")
    private static byte[] field3644;

    @OriginalMember(owner = "client!qn", name = "V", descriptor = "[B")
    private byte[] field3671;

    @OriginalMember(owner = "client!qn", name = "p", descriptor = "[F")
    private static float[] field3640;

    @OriginalMember(owner = "client!qn", name = "u", descriptor = "[F")
    private static float[] field3645;

    @OriginalMember(owner = "client!qn", name = "v", descriptor = "[F")
    private static float[] field3646;

    @OriginalMember(owner = "client!qn", name = "y", descriptor = "[F")
    private static float[] field3649;

    @OriginalMember(owner = "client!qn", name = "B", descriptor = "[F")
    private static float[] field3652;

    @OriginalMember(owner = "client!qn", name = "D", descriptor = "[F")
    private static float[] field3654;

    @OriginalMember(owner = "client!qn", name = "N", descriptor = "[F")
    private static float[] field3663;

    @OriginalMember(owner = "client!qn", name = "P", descriptor = "[F")
    private float[] field3665;

    @OriginalMember(owner = "client!qn", name = "q", descriptor = "[I")
    private static int[] field3641;

    @OriginalMember(owner = "client!qn", name = "C", descriptor = "[I")
    private static int[] field3653;

    @OriginalMember(owner = "client!qn", name = "Q", descriptor = "[I")
    private static int[] field3666;

    @OriginalMember(owner = "client!qn", name = "s", descriptor = "[Lsf;")
    private static class12[] field3643;

    @OriginalMember(owner = "client!qn", name = "R", descriptor = "[Lpd;")
    public static class203[] field3667;

    @OriginalMember(owner = "client!qn", name = "F", descriptor = "[Lrd;")
    private static class256[] field3655;

    @OriginalMember(owner = "client!qn", name = "O", descriptor = "[Lbf;")
    private static class36[] field3664;

    @OriginalMember(owner = "client!qn", name = "M", descriptor = "[Z")
    private static boolean[] field3662;

    @OriginalMember(owner = "client!qn", name = "L", descriptor = "[[B")
    private byte[][] field3661;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)[F", line = 6)
    private final float[] method1750(int arg0) {
        method1752(this.field3661[arg0], 0);
        method1755();
        int var2 = method1760(class195.method1411(field3641.length - 1, -90));
        boolean var3 = field3662[var2];
        int var4 = var3 ? field3647 : field3639;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1755() != 0;
            var6 = method1755() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field3639 >> 2);
            var9 = (field3639 >> 2) + (var4 >> 2);
            var10 = field3639 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field3639 >> 2);
            var12 = (field3639 >> 2) + (var4 - (var4 >> 2));
            var13 = field3639 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class256 var14 = field3655[field3641[var2]];
        int var15 = var14.field3741;
        int var16 = var14.field3743[var15];
        boolean var17 = !field3664[var16].method226();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field3742; var19++) {
            class12 var20 = field3643[var14.field3744[var19]];
            float[] var21 = field3654;
            var20.method92(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field3741;
            int var23 = var14.field3743[var22];
            field3664[var23].method223(field3654, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field3654[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field3654;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field3649 : field3645;
            float[] var32 = var3 ? field3663 : field3652;
            float[] var33 = var3 ? field3640 : field3646;
            int[] var34 = var3 ? field3666 : field3653;
            for (int var35 = 0; var35 < var26; var35++) {
                float var36 = var28[var35 * 4] - var28[var4 - var35 * 4 - 1];
                float var37 = var28[var35 * 4 + 2] - var28[var4 - var35 * 4 - 3];
                float var38 = var31[var35 * 2];
                float var39 = var31[var35 * 2 + 1];
                var28[var4 - var35 * 4 - 1] = var36 * var38 - var37 * var39;
                var28[var4 - var35 * 4 - 3] = var36 * var39 + var37 * var38;
            }
            for (int var40 = 0; var40 < var27; var40++) {
                float var41 = var28[var40 * 4 + var25 + 3];
                float var42 = var28[var40 * 4 + var25 + 1];
                float var43 = var28[var40 * 4 + 3];
                float var44 = var28[var40 * 4 + 1];
                var28[var40 * 4 + var25 + 3] = var41 + var43;
                var28[var40 * 4 + var25 + 1] = var42 + var44;
                float var45 = var31[var25 - var40 * 4 - 4];
                float var46 = var31[var25 - var40 * 4 - 3];
                var28[var40 * 4 + 3] = (var41 - var43) * var45 - (var42 - var44) * var46;
                var28[var40 * 4 + 1] = (var41 - var43) * var46 + (var42 - var44) * var45;
            }
            int var47 = class195.method1411(var4 - 1, -91);
            for (int var48 = 0; var48 < var47 - 3; var48++) {
                int var49 = var4 >> var48 + 2;
                int var50 = 0x8 << var48;
                for (int var51 = 0; var51 < 0x2 << var48; var51++) {
                    int var52 = var4 - var49 * 2 * var51;
                    int var53 = var4 - (var51 * 2 + 1) * var49;
                    for (int var54 = 0; var54 < var4 >> var48 + 4; var54++) {
                        int var55 = var54 * 4;
                        float var56 = var28[var52 - var55 - 1];
                        float var57 = var28[var52 - var55 - 3];
                        float var58 = var28[var53 - var55 - 1];
                        float var59 = var28[var53 - var55 - 3];
                        var28[var52 - var55 - 1] = var56 + var58;
                        var28[var52 - var55 - 3] = var57 + var59;
                        float var60 = var31[var50 * var54];
                        float var61 = var31[var50 * var54 + 1];
                        var28[var53 - var55 - 1] = (var56 - var58) * var60 - (var57 - var59) * var61;
                        var28[var53 - var55 - 3] = (var56 - var58) * var61 + (var57 - var59) * var60;
                    }
                }
            }
            for (int var62 = 1; var62 < var27 - 1; var62++) {
                int var63 = var34[var62];
                if (var62 < var63) {
                    int var64 = var62 * 8;
                    int var65 = var63 * 8;
                    float var66 = var28[var64 + 1];
                    var28[var64 + 1] = var28[var65 + 1];
                    var28[var65 + 1] = var66;
                    float var67 = var28[var64 + 3];
                    var28[var64 + 3] = var28[var65 + 3];
                    var28[var65 + 3] = var67;
                    float var68 = var28[var64 + 5];
                    var28[var64 + 5] = var28[var65 + 5];
                    var28[var65 + 5] = var68;
                    float var69 = var28[var64 + 7];
                    var28[var64 + 7] = var28[var65 + 7];
                    var28[var65 + 7] = var69;
                }
            }
            for (int var70 = 0; var70 < var25; var70++) {
                var28[var70] = var28[var70 * 2 + 1];
            }
            for (int var71 = 0; var71 < var27; var71++) {
                var28[var4 - var71 * 2 - 1] = var28[var71 * 4];
                var28[var4 - var71 * 2 - 2] = var28[var71 * 4 + 1];
                var28[var4 - var26 - var71 * 2 - 1] = var28[var71 * 4 + 2];
                var28[var4 - var26 - var71 * 2 - 2] = var28[var71 * 4 + 3];
            }
            for (int var72 = 0; var72 < var27; var72++) {
                float var73 = var33[var72 * 2];
                float var74 = var33[var72 * 2 + 1];
                float var75 = var28[var72 * 2 + var25];
                float var76 = var28[var72 * 2 + var25 + 1];
                float var77 = var28[var4 - var72 * 2 - 2];
                float var78 = var28[var4 - var72 * 2 - 1];
                float var79 = (var75 - var77) * var74 + (var76 + var78) * var73;
                var28[var72 * 2 + var25] = (var75 + var77 + var79) * 0.5F;
                var28[var4 - var72 * 2 - 2] = (var75 + var77 - var79) * 0.5F;
                float var80 = (var76 + var78) * var74 - (var75 - var77) * var73;
                var28[var72 * 2 + var25 + 1] = (var76 + var80 - var78) * 0.5F;
                var28[var4 - var72 * 2 - 1] = (var78 + var80 - var76) * 0.5F;
            }
            for (int var81 = 0; var81 < var26; var81++) {
                var28[var81] = var32[var81 * 2] * var28[var81 * 2 + var25] + var32[var81 * 2 + 1] * var28[var81 * 2 + var25 + 1];
                var28[var25 - var81 - 1] = var28[var81 * 2 + var25] * var32[var81 * 2 + 1] - var32[var81 * 2] * var28[var81 * 2 + var25 + 1];
            }
            for (int var82 = 0; var82 < var26; var82++) {
                var28[var4 + var82 - var26] = -var28[var82];
            }
            for (int var83 = 0; var83 < var26; var83++) {
                var28[var83] = var28[var26 + var83];
            }
            for (int var84 = 0; var84 < var26; var84++) {
                var28[var26 + var84] = -var28[var26 - var84 - 1];
            }
            for (int var85 = 0; var85 < var26; var85++) {
                var28[var25 + var85] = var28[var4 - var85 - 1];
            }
            for (int var86 = var8; var86 < var9; var86++) {
                float var87 = (float) Math.sin(((double) (var86 - var8) + 0.5D) / (double) var10 * 0.5D * 3.141592653589793D);
                field3654[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field3654[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field3669 > 0) {
            int var91 = this.field3669 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field3648) {
                for (int var92 = 0; var92 < this.field3650; var92++) {
                    int var93 = (this.field3669 >> 1) + var92;
                    var90[var92] += this.field3665[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field3654[var94];
                }
            }
        }
        float[] var96 = this.field3665;
        this.field3665 = field3654;
        field3654 = var96;
        this.field3669 = var4;
        this.field3650 = var12 - (var4 >> 1);
        this.field3648 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lfh;)Z", line = 425)
    private static final boolean method1751(class140 arg0) {
        if (!field3656) {
            byte[] var1 = arg0.method1089(0, (byte) 118, 0);
            if (var1 == null) {
                return false;
            }
            method1753(var1);
            field3656 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "([BI)V", line = 451)
    private static final void method1752(byte[] arg0, int arg1) {
        field3644 = arg0;
        field3657 = arg1;
        field3660 = 0;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "([B)V", line = 457)
    private static final void method1753(byte[] arg0) {
        method1752(arg0, 0);
        field3639 = 0x1 << method1760(4);
        field3647 = 0x1 << method1760(4);
        field3654 = new float[field3647];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field3639 : field3647;
            int var3 = var2 >> 1;
            int var4 = var2 >> 2;
            int var5 = var2 >> 3;
            float[] var6 = new float[var3];
            for (int var7 = 0; var7 < var4; var7++) {
                var6[var7 * 2] = (float) Math.cos((double) (var7 * 4) * 3.141592653589793D / (double) var2);
                var6[var7 * 2 + 1] = -((float) Math.sin((double) (var7 * 4) * 3.141592653589793D / (double) var2));
            }
            float[] var8 = new float[var3];
            for (int var9 = 0; var9 < var4; var9++) {
                var8[var9 * 2] = (float) Math.cos((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
                var8[var9 * 2 + 1] = (float) Math.sin((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
            }
            float[] var10 = new float[var4];
            for (int var11 = 0; var11 < var5; var11++) {
                var10[var11 * 2] = (float) Math.cos((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2);
                var10[var11 * 2 + 1] = -((float) Math.sin((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2));
            }
            int[] var12 = new int[var5];
            int var13 = class195.method1411(var5 - 1, -67);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class283.method1927(var14, false, var13);
            }
            if (var1 == 0) {
                field3645 = var6;
                field3652 = var8;
                field3646 = var10;
                field3653 = var12;
            } else {
                field3649 = var6;
                field3663 = var8;
                field3640 = var10;
                field3666 = var12;
            }
        }
        int var15 = method1760(8) + 1;
        field3667 = new class203[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field3667[var16] = new class203();
        }
        int var17 = method1760(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method1760(16);
        }
        int var19 = method1760(6) + 1;
        field3664 = new class36[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field3664[var20] = new class36();
        }
        int var21 = method1760(6) + 1;
        field3643 = new class12[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field3643[var22] = new class12();
        }
        int var23 = method1760(6) + 1;
        field3655 = new class256[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field3655[var24] = new class256();
        }
        int var25 = method1760(6) + 1;
        field3662 = new boolean[var25];
        field3641 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field3662[var26] = method1755() != 0;
            method1760(16);
            method1760(16);
            field3641[var26] = method1760(8);
        }
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "([B)V", line = 610)
    private final void method1754(byte[] arg0) {
        class299 var2 = new class299(arg0);
        this.field3651 = var2.method2062(-25795);
        this.field3642 = var2.method2062(-25795);
        this.field3658 = var2.method2062(-25795);
        this.field3659 = var2.method2062(-25795);
        if (this.field3659 < 0) {
            this.field3659 = ~this.field3659;
            this.field3668 = true;
        }
        int var3 = var2.method2062(-25795);
        this.field3661 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2096((byte) -122);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method2079(123, 0, var5, var7);
            this.field3661[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "()I", line = 653)
    public static final int method1755() {
        int var0 = field3644[field3657] >> field3660 & 0x1;
        field3660++;
        field3657 += field3660 >> 3;
        field3660 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "()V", line = 663)
    public static void method1756() {
        field3644 = null;
        field3667 = null;
        field3664 = null;
        field3643 = null;
        field3655 = null;
        field3662 = null;
        field3641 = null;
        field3654 = null;
        field3645 = null;
        field3652 = null;
        field3646 = null;
        field3649 = null;
        field3663 = null;
        field3640 = null;
        field3653 = null;
        field3666 = null;
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)F", line = 682)
    public static final float method1757(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "([I)Lpb;", line = 696)
    public final class168 method1758(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field3671 == null) {
            this.field3669 = 0;
            this.field3665 = new float[field3647];
            this.field3671 = new byte[this.field3642];
            this.field3672 = 0;
            this.field3670 = 0;
        }
        while (this.field3670 < this.field3661.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method1750(this.field3670);
            if (var2 != null) {
                int var3 = this.field3672;
                int var4 = var2.length;
                if (var4 > this.field3642 - var3) {
                    var4 = this.field3642 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field3671[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field3672;
                }
                this.field3672 = var3;
            }
            this.field3670++;
        }
        this.field3665 = null;
        byte[] var7 = this.field3671;
        this.field3671 = null;
        return new class168(this.field3651, var7, this.field3658, this.field3659, this.field3668);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lfh;II)Lqn;", line = 758)
    public static final class250 method1759(class140 arg0, int arg1, int arg2) {
        if (method1751(arg0)) {
            byte[] var3 = arg0.method1089(arg1, (byte) 125, arg2);
            return var3 == null ? null : new class250(var3);
        } else {
            arg0.method1087(arg1, true, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "(I)I", line = 776)
    public static final int method1760(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field3660) {
            int var3 = 8 - field3660;
            int var4 = (0x1 << var3) - 1;
            var1 += (field3644[field3657] >> field3660 & var4) << var2;
            field3660 = 0;
            field3657++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field3644[field3657] >> field3660 & var5) << var2;
            field3660 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "([B)V", line = 803)
    private class250(byte[] arg0) {
        this.method1754(arg0);
    }
}
