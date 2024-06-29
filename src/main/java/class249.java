import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class249 extends class97 {

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "Z")
    private static boolean field3718 = false;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    private int field3713;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    private int field3714;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    private static int field3715;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
    private int field3723;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "I")
    private static int field3729;

    @OriginalMember(owner = "client!qd", name = "F", descriptor = "I")
    private int field3730;

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "I")
    private static int field3734;

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "I")
    private int field3736;

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "I")
    private static int field3737;

    @OriginalMember(owner = "client!qd", name = "P", descriptor = "I")
    private int field3740;

    @OriginalMember(owner = "client!qd", name = "S", descriptor = "I")
    private int field3743;

    @OriginalMember(owner = "client!qd", name = "T", descriptor = "I")
    private int field3744;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "Z")
    private boolean field3717;

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "Z")
    private boolean field3724;

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "[B")
    private static byte[] field3733;

    @OriginalMember(owner = "client!qd", name = "R", descriptor = "[B")
    private byte[] field3742;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "[F")
    private float[] field3716;

    @OriginalMember(owner = "client!qd", name = "u", descriptor = "[F")
    private static float[] field3719;

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "[F")
    private static float[] field3720;

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "[F")
    private static float[] field3725;

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "[F")
    private static float[] field3731;

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "[F")
    private static float[] field3732;

    @OriginalMember(owner = "client!qd", name = "N", descriptor = "[F")
    private static float[] field3738;

    @OriginalMember(owner = "client!qd", name = "U", descriptor = "[F")
    private static float[] field3745;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "[I")
    private static int[] field3721;

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "[I")
    private static int[] field3735;

    @OriginalMember(owner = "client!qd", name = "Q", descriptor = "[I")
    private static int[] field3741;

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "[Lhk;")
    private static class242[] field3728;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "[Lct;")
    private static class270[] field3712;

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "[Ltq;")
    public static class61[] field3722;

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "[Lha;")
    private static class83[] field3726;

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "[Z")
    private static boolean[] field3739;

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "[[B")
    private byte[][] field3727;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([B)V")
    private final void method1511(byte[] arg0) {
        class385 var2 = new class385(arg0);
        this.field3730 = var2.method2354(255);
        this.field3723 = var2.method2354(255);
        this.field3740 = var2.method2354(255);
        this.field3736 = var2.method2354(255);
        if (this.field3736 < 0) {
            this.field3736 = ~this.field3736;
            this.field3724 = true;
        }
        int var3 = var2.method2354(255);
        this.field3727 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2343(255);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method2356((byte) -122, var7, var5, 0);
            this.field3727[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Liq;II)Lqd;")
    public static final class249 method1512(class134 arg0, int arg1, int arg2) {
        if (method1520(arg0)) {
            byte[] var3 = arg0.method823(arg1, -20334, arg2);
            return var3 == null ? null : new class249(var3);
        } else {
            arg0.method839(arg1, arg2, -30600);
            return null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "()I")
    public static final int method1513() {
        int var0 = field3733[field3737] >> field3734 & 0x1;
        field3734++;
        field3737 += field3734 >> 3;
        field3734 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([BI)V")
    private static final void method1514(byte[] arg0, int arg1) {
        field3733 = arg0;
        field3737 = arg1;
        field3734 = 0;
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)[F")
    private final float[] method1515(int arg0) {
        method1514(this.field3727[arg0], 0);
        method1513();
        int var2 = method1517(class402.method2531(field3741.length - 1, -17));
        boolean var3 = field3739[var2];
        int var4 = var3 ? field3729 : field3715;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1513() != 0;
            var6 = method1513() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field3715 >> 2);
            var9 = (field3715 >> 2) + (var4 >> 2);
            var10 = field3715 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field3715 >> 2);
            var12 = (field3715 >> 2) + (var4 - (var4 >> 2));
            var13 = field3715 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class270 var14 = field3712[field3741[var2]];
        int var15 = var14.field4090;
        int var16 = var14.field4091[var15];
        boolean var17 = !field3726[var16].method536();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field4092; var19++) {
            class242 var95 = field3728[var14.field4093[var19]];
            float[] var96 = field3738;
            var95.method1493(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field4090;
            int var21 = var14.field4091[var20];
            field3726[var21].method537(field3738, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field3738[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field3738;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field3720 : field3719;
            float[] var30 = var3 ? field3725 : field3732;
            float[] var31 = var3 ? field3731 : field3745;
            int[] var32 = var3 ? field3721 : field3735;
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
            int var35 = class402.method2531(var4 - 1, -17);
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
                field3738[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field3738[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field3714 > 0) {
            int var49 = this.field3714 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field3717) {
                for (int var50 = 0; var50 < this.field3713; var50++) {
                    int var51 = (this.field3714 >> 1) + var50;
                    var48[var50] += this.field3716[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field3738[var52];
                }
            }
        }
        float[] var54 = this.field3716;
        this.field3716 = field3738;
        field3738 = var54;
        this.field3714 = var4;
        this.field3713 = var12 - (var4 >> 1);
        this.field3717 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "([B)V")
    private static final void method1516(byte[] arg0) {
        method1514(arg0, 0);
        field3715 = 0x1 << method1517(4);
        field3729 = 0x1 << method1517(4);
        field3738 = new float[field3729];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field3715 : field3729;
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
            int var25 = class402.method2531(var17 - 1, -17);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class1.method8(var25, var26, (byte) -121);
            }
            if (var1 == 0) {
                field3719 = var18;
                field3732 = var20;
                field3745 = var22;
                field3735 = var24;
            } else {
                field3720 = var18;
                field3725 = var20;
                field3731 = var22;
                field3721 = var24;
            }
        }
        int var2 = method1517(8) + 1;
        field3722 = new class61[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field3722[var3] = new class61();
        }
        int var4 = method1517(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1517(16);
        }
        int var6 = method1517(6) + 1;
        field3726 = new class83[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field3726[var7] = new class83();
        }
        int var8 = method1517(6) + 1;
        field3728 = new class242[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field3728[var9] = new class242();
        }
        int var10 = method1517(6) + 1;
        field3712 = new class270[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field3712[var11] = new class270();
        }
        int var12 = method1517(6) + 1;
        field3739 = new boolean[var12];
        field3741 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field3739[var13] = method1513() != 0;
            method1517(16);
            method1517(16);
            field3741[var13] = method1517(8);
        }
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)I")
    public static final int method1517(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field3734) {
            int var4 = 8 - field3734;
            int var5 = (0x1 << var4) - 1;
            var1 += (field3733[field3737] >> field3734 & var5) << var2;
            field3734 = 0;
            field3737++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field3733[field3737] >> field3734 & var3) << var2;
            field3734 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([I)Lar;")
    public final class2 method1518(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field3742 == null) {
            this.field3714 = 0;
            this.field3716 = new float[field3729];
            this.field3742 = new byte[this.field3723];
            this.field3744 = 0;
            this.field3743 = 0;
        }
        while (this.field3743 < this.field3727.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1515(this.field3743);
            if (var3 != null) {
                int var4 = this.field3744;
                int var5 = var3.length;
                if (var5 > this.field3723 - var4) {
                    var5 = this.field3723 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field3742[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field3744;
                }
                this.field3744 = var4;
            }
            this.field3743++;
        }
        this.field3716 = null;
        byte[] var2 = this.field3742;
        this.field3742 = null;
        return new class2(this.field3730, var2, this.field3740, this.field3736, this.field3724);
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "()V")
    public static void method1519() {
        field3733 = null;
        field3722 = null;
        field3726 = null;
        field3728 = null;
        field3712 = null;
        field3739 = null;
        field3741 = null;
        field3738 = null;
        field3719 = null;
        field3732 = null;
        field3745 = null;
        field3720 = null;
        field3725 = null;
        field3731 = null;
        field3735 = null;
        field3721 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Liq;)Z")
    private static final boolean method1520(class134 arg0) {
        if (!field3718) {
            byte[] var1 = arg0.method823(0, -20334, 0);
            if (var1 == null) {
                return false;
            }
            method1516(var1);
            field3718 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "([B)V")
    private class249(byte[] arg0) {
        this.method1511(arg0);
    }

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)F")
    public static final float method1521(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }
}
