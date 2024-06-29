import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class195 extends class67 {

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "Z")
    private static boolean field3725 = false;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
    private static int field3718;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "I")
    private int field3719;

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "I")
    private static int field3722;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
    private static int field3729;

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "I")
    private int field3731;

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "I")
    private int field3732;

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
    private int field3737;

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "I")
    private int field3738;

    @OriginalMember(owner = "client!rj", name = "T", descriptor = "I")
    private int field3743;

    @OriginalMember(owner = "client!rj", name = "X", descriptor = "I")
    private static int field3747;

    @OriginalMember(owner = "client!rj", name = "Z", descriptor = "I")
    private int field3749;

    @OriginalMember(owner = "client!rj", name = "bb", descriptor = "I")
    private int field3751;

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "Z")
    private boolean field3740;

    @OriginalMember(owner = "client!rj", name = "U", descriptor = "Z")
    private boolean field3744;

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "[B")
    private static byte[] field3739;

    @OriginalMember(owner = "client!rj", name = "ab", descriptor = "[B")
    private byte[] field3750;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "[F")
    private static float[] field3720;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "[F")
    private float[] field3723;

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "[F")
    private static float[] field3724;

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "[F")
    private static float[] field3728;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "[F")
    private static float[] field3733;

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "[F")
    private static float[] field3741;

    @OriginalMember(owner = "client!rj", name = "W", descriptor = "[F")
    private static float[] field3746;

    @OriginalMember(owner = "client!rj", name = "Y", descriptor = "[F")
    private static float[] field3748;

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "[I")
    private static int[] field3721;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "[I")
    private static int[] field3736;

    @OriginalMember(owner = "client!rj", name = "S", descriptor = "[I")
    private static int[] field3742;

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "[Ljb;")
    private static class100[] field3727;

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "[Lbg;")
    public static class19[] field3726;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "[Lad;")
    private static class5[] field3730;

    @OriginalMember(owner = "client!rj", name = "V", descriptor = "[Lhf;")
    private static class83[] field3745;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "[Z")
    private static boolean[] field3734;

    @OriginalMember(owner = "client!rj", name = "L", descriptor = "[[B")
    private byte[][] field3735;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "([B)V")
    private final void method1348(byte[] arg0) {
        class46 var2 = new class46(arg0);
        this.field3719 = var2.method323((byte) -53);
        this.field3731 = var2.method323((byte) -52);
        this.field3738 = var2.method323((byte) -36);
        this.field3732 = var2.method323((byte) -49);
        if (this.field3732 < 0) {
            this.field3732 = ~this.field3732;
            this.field3740 = true;
        }
        int var3 = var2.method323((byte) -34);
        this.field3735 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method347(26119);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method307(false, var5, var7, 0);
            this.field3735[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "()V")
    public static void method1349() {
        field3739 = null;
        field3726 = null;
        field3727 = null;
        field3730 = null;
        field3745 = null;
        field3734 = null;
        field3736 = null;
        field3748 = null;
        field3746 = null;
        field3720 = null;
        field3728 = null;
        field3733 = null;
        field3724 = null;
        field3741 = null;
        field3721 = null;
        field3742 = null;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "()I")
    public static final int method1350() {
        int var0 = field3739[field3718] >> field3722 & 0x1;
        field3722++;
        field3718 += field3722 >> 3;
        field3722 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "([B)V")
    private static final void method1351(byte[] arg0) {
        method1352(arg0, 0);
        field3747 = 0x1 << method1355(4);
        field3729 = 0x1 << method1355(4);
        field3748 = new float[field3729];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field3747 : field3729;
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
            int var25 = class55.method407(var17 - 1, -13816);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class228.method1526(var26, (byte) -77, var25);
            }
            if (var1 == 0) {
                field3746 = var18;
                field3720 = var20;
                field3728 = var22;
                field3721 = var24;
            } else {
                field3733 = var18;
                field3724 = var20;
                field3741 = var22;
                field3742 = var24;
            }
        }
        int var2 = method1355(8) + 1;
        field3726 = new class19[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field3726[var3] = new class19();
        }
        int var4 = method1355(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1355(16);
        }
        int var6 = method1355(6) + 1;
        field3727 = new class100[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field3727[var7] = new class100();
        }
        int var8 = method1355(6) + 1;
        field3730 = new class5[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field3730[var9] = new class5();
        }
        int var10 = method1355(6) + 1;
        field3745 = new class83[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field3745[var11] = new class83();
        }
        int var12 = method1355(6) + 1;
        field3734 = new boolean[var12];
        field3736 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field3734[var13] = method1350() != 0;
            method1355(16);
            method1355(16);
            field3736[var13] = method1355(8);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "([BI)V")
    private static final void method1352(byte[] arg0, int arg1) {
        field3739 = arg0;
        field3718 = arg1;
        field3722 = 0;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)F")
    public static final float method1353(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lnb;)Z")
    private static final boolean method1354(class144 arg0) {
        if (!field3725) {
            byte[] var1 = arg0.method941((byte) 56, 0, 0);
            if (var1 == null) {
                return false;
            }
            method1351(var1);
            field3725 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)I")
    public static final int method1355(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field3722) {
            int var4 = 8 - field3722;
            int var5 = (0x1 << var4) - 1;
            var1 += (field3739[field3718] >> field3722 & var5) << var2;
            field3722 = 0;
            field3718++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field3739[field3718] >> field3722 & var3) << var2;
            field3722 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lnb;II)Lrj;")
    public static final class195 method1356(class144 arg0, int arg1, int arg2) {
        if (method1354(arg0)) {
            byte[] var3 = arg0.method941((byte) 56, arg2, arg1);
            return var3 == null ? null : new class195(var3);
        } else {
            arg0.method961(arg1, arg2, (byte) 62);
            return null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "([I)Ltf;")
    public final class213 method1357(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field3750 == null) {
            this.field3743 = 0;
            this.field3723 = new float[field3729];
            this.field3750 = new byte[this.field3731];
            this.field3749 = 0;
            this.field3751 = 0;
        }
        while (this.field3751 < this.field3735.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1358(this.field3751);
            if (var3 != null) {
                int var4 = this.field3749;
                int var5 = var3.length;
                if (var5 > this.field3731 - var4) {
                    var5 = this.field3731 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field3750[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field3749;
                }
                this.field3749 = var4;
            }
            this.field3751++;
        }
        this.field3723 = null;
        byte[] var2 = this.field3750;
        this.field3750 = null;
        return new class213(this.field3719, var2, this.field3738, this.field3732, this.field3740);
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(I)[F")
    private final float[] method1358(int arg0) {
        method1352(this.field3735[arg0], 0);
        method1350();
        int var2 = method1355(class55.method407(field3736.length - 1, -13816));
        boolean var3 = field3734[var2];
        int var4 = var3 ? field3729 : field3747;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1350() != 0;
            var6 = method1350() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field3747 >> 2);
            var9 = (field3747 >> 2) + (var4 >> 2);
            var10 = field3747 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field3747 >> 2);
            var12 = (field3747 >> 2) + (var4 - (var4 >> 2));
            var13 = field3747 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class83 var14 = field3745[field3736[var2]];
        int var15 = var14.field1524;
        int var16 = var14.field1526[var15];
        boolean var17 = !field3727[var16].method701();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1525; var19++) {
            class5 var95 = field3730[var14.field1527[var19]];
            float[] var96 = field3748;
            var95.method25(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field1524;
            int var21 = var14.field1526[var20];
            field3727[var21].method696(field3748, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field3748[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field3748;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field3733 : field3746;
            float[] var30 = var3 ? field3724 : field3720;
            float[] var31 = var3 ? field3741 : field3728;
            int[] var32 = var3 ? field3742 : field3721;
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
            int var35 = class55.method407(var4 - 1, -13816);
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
                field3748[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field3748[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field3743 > 0) {
            int var49 = this.field3743 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field3744) {
                for (int var50 = 0; var50 < this.field3737; var50++) {
                    int var51 = (this.field3743 >> 1) + var50;
                    var48[var50] += this.field3723[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field3748[var52];
                }
            }
        }
        float[] var54 = this.field3723;
        this.field3723 = field3748;
        field3748 = var54;
        this.field3743 = var4;
        this.field3737 = var12 - (var4 >> 1);
        this.field3744 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "([B)V")
    private class195(byte[] arg0) {
        this.method1348(arg0);
    }
}
