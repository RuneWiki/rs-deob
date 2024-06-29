import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class622 extends class69 {

    @OriginalMember(owner = "client!qw", name = "C", descriptor = "Z")
    private static boolean field8716 = false;

    @OriginalMember(owner = "client!qw", name = "n", descriptor = "I")
    private static int field8701;

    @OriginalMember(owner = "client!qw", name = "p", descriptor = "I")
    private int field8703;

    @OriginalMember(owner = "client!qw", name = "x", descriptor = "I")
    private int field8711;

    @OriginalMember(owner = "client!qw", name = "y", descriptor = "I")
    private static int field8712;

    @OriginalMember(owner = "client!qw", name = "B", descriptor = "I")
    private int field8715;

    @OriginalMember(owner = "client!qw", name = "D", descriptor = "I")
    private int field8717;

    @OriginalMember(owner = "client!qw", name = "J", descriptor = "I")
    private int field8723;

    @OriginalMember(owner = "client!qw", name = "K", descriptor = "I")
    private static int field8724;

    @OriginalMember(owner = "client!qw", name = "M", descriptor = "I")
    private int field8726;

    @OriginalMember(owner = "client!qw", name = "N", descriptor = "I")
    private int field8727;

    @OriginalMember(owner = "client!qw", name = "O", descriptor = "I")
    private int field8728;

    @OriginalMember(owner = "client!qw", name = "Q", descriptor = "I")
    private static int field8730;

    @OriginalMember(owner = "client!qw", name = "m", descriptor = "Z")
    private boolean field8700;

    @OriginalMember(owner = "client!qw", name = "E", descriptor = "Z")
    private boolean field8718;

    @OriginalMember(owner = "client!qw", name = "l", descriptor = "[B")
    private static byte[] field8699;

    @OriginalMember(owner = "client!qw", name = "P", descriptor = "[B")
    private byte[] field8729;

    @OriginalMember(owner = "client!qw", name = "q", descriptor = "[F")
    private static float[] field8704;

    @OriginalMember(owner = "client!qw", name = "r", descriptor = "[F")
    private float[] field8705;

    @OriginalMember(owner = "client!qw", name = "s", descriptor = "[F")
    private static float[] field8706;

    @OriginalMember(owner = "client!qw", name = "t", descriptor = "[F")
    private static float[] field8707;

    @OriginalMember(owner = "client!qw", name = "A", descriptor = "[F")
    private static float[] field8714;

    @OriginalMember(owner = "client!qw", name = "F", descriptor = "[F")
    private static float[] field8719;

    @OriginalMember(owner = "client!qw", name = "G", descriptor = "[F")
    private static float[] field8720;

    @OriginalMember(owner = "client!qw", name = "L", descriptor = "[F")
    private static float[] field8725;

    @OriginalMember(owner = "client!qw", name = "k", descriptor = "[I")
    private static int[] field8698;

    @OriginalMember(owner = "client!qw", name = "z", descriptor = "[I")
    private static int[] field8713;

    @OriginalMember(owner = "client!qw", name = "H", descriptor = "[I")
    private static int[] field8721;

    @OriginalMember(owner = "client!qw", name = "I", descriptor = "[Lega;")
    private static class209[] field8722;

    @OriginalMember(owner = "client!qw", name = "w", descriptor = "[Ldga;")
    private static class257[] field8710;

    @OriginalMember(owner = "client!qw", name = "v", descriptor = "[Lvg;")
    private static class698[] field8709;

    @OriginalMember(owner = "client!qw", name = "o", descriptor = "[Lrda;")
    public static class89[] field8702;

    @OriginalMember(owner = "client!qw", name = "u", descriptor = "[Z")
    private static boolean[] field8708;

    @OriginalMember(owner = "client!qw", name = "j", descriptor = "[[B")
    private byte[][] field8697;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lae;)Z", line = 4)
    private static final boolean method3571(class283 arg0) {
        if (!field8716) {
            byte[] var1 = arg0.method1849(0, (byte) -120, 0);
            if (var1 == null) {
                return false;
            }
            method3581(var1);
        }
        return true;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(I)F", line = 18)
    public static final float method3572(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "()V", line = 31)
    public static void method3573() {
        field8699 = null;
        field8702 = null;
        field8709 = null;
        field8722 = null;
        field8710 = null;
        field8708 = null;
        field8721 = null;
        field8719 = null;
        field8725 = null;
        field8714 = null;
        field8707 = null;
        field8720 = null;
        field8706 = null;
        field8704 = null;
        field8713 = null;
        field8698 = null;
    }

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "()I", line = 50)
    public static final int method3574() {
        int var0 = field8699[field8712] >> field8701 & 0x1;
        field8701++;
        field8712 += field8701 >> 3;
        field8701 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "(I)[F", line = 59)
    private final float[] method3575(int arg0) {
        method3576(this.field8697[arg0], 0);
        method3574();
        int var2 = method3577(class550.method3249(field8721.length - 1, 6520));
        boolean var3 = field8708[var2];
        int var4 = var3 ? field8730 : field8724;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method3574() != 0;
            var6 = method3574() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field8724 >> 2);
            var9 = (field8724 >> 2) + (var4 >> 2);
            var10 = field8724 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field8724 >> 2);
            var12 = (field8724 >> 2) + (var4 - (var4 >> 2));
            var13 = field8724 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class257 var14 = field8710[field8721[var2]];
        int var15 = var14.field3789;
        int var16 = var14.field3787[var15];
        boolean var17 = !field8709[var16].method3942();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field3788; var19++) {
            class209 var95 = field8722[var14.field3786[var19]];
            float[] var96 = field8719;
            var95.method1327(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field3789;
            int var21 = var14.field3787[var20];
            field8709[var21].method3940(field8719, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field8719[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field8719;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field8720 : field8725;
            float[] var30 = var3 ? field8706 : field8714;
            float[] var31 = var3 ? field8704 : field8707;
            int[] var32 = var3 ? field8698 : field8713;
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
            int var35 = class550.method3249(var4 - 1, 6520);
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
                field8719[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field8719[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field8723 > 0) {
            int var49 = this.field8723 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field8718) {
                for (int var50 = 0; var50 < this.field8726; var50++) {
                    int var51 = (this.field8723 >> 1) + var50;
                    var48[var50] += this.field8705[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field8719[var52];
                }
            }
        }
        float[] var54 = this.field8705;
        this.field8705 = field8719;
        field8719 = var54;
        this.field8723 = var4;
        this.field8726 = var12 - (var4 >> 1);
        this.field8718 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "([BI)V", line = 476)
    private static final void method3576(byte[] arg0, int arg1) {
        field8699 = arg0;
        field8712 = arg1;
        field8701 = 0;
    }

    @OriginalMember(owner = "client!qw", name = "c", descriptor = "(I)I", line = 483)
    public static final int method3577(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field8701) {
            int var4 = 8 - field8701;
            int var5 = (0x1 << var4) - 1;
            var1 += (field8699[field8712] >> field8701 & var5) << var2;
            field8701 = 0;
            field8712++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field8699[field8712] >> field8701 & var3) << var2;
            field8701 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lae;II)Lqw;", line = 510)
    public static final class622 method3578(class283 arg0, int arg1, int arg2) {
        if (method3571(arg0)) {
            byte[] var3 = arg0.method1849(arg2, (byte) -21, arg1);
            return var3 == null ? null : new class622(var3);
        } else {
            arg0.method1862(126, arg2, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "([B)V", line = 540)
    private final void method3579(byte[] arg0) {
        class511 var2 = new class511(arg0);
        this.field8711 = var2.method3008(64);
        this.field8703 = var2.method3008(64);
        this.field8715 = var2.method3008(64);
        this.field8717 = var2.method3008(64);
        if (this.field8717 < 0) {
            this.field8717 = ~this.field8717;
            this.field8700 = true;
        }
        int var3 = var2.method3008(64);
        this.field8697 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method3013(7);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method3014(var5, var7, 75212712, 0);
            this.field8697[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lae;I)Lqw;", line = 588)
    public static final class622 method3580(class283 arg0, int arg1) {
        if (method3571(arg0)) {
            byte[] var2 = arg0.method1854(0, arg1);
            return var2 == null ? null : new class622(var2);
        } else {
            arg0.method1860(arg1, (byte) 124);
            return null;
        }
    }

    @OriginalMember(owner = "client!qw", name = "b", descriptor = "([B)V", line = 604)
    private static final void method3581(byte[] arg0) {
        method3576(arg0, 0);
        field8724 = 0x1 << method3577(4);
        field8730 = 0x1 << method3577(4);
        field8719 = new float[field8730];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field8724 : field8730;
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
            int var25 = class550.method3249(var17 - 1, 6520);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class620.method3570(1, var25, var26);
            }
            if (var1 == 0) {
                field8725 = var18;
                field8714 = var20;
                field8707 = var22;
                field8713 = var24;
            } else {
                field8720 = var18;
                field8706 = var20;
                field8704 = var22;
                field8698 = var24;
            }
        }
        int var2 = method3577(8) + 1;
        field8702 = new class89[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field8702[var3] = new class89();
        }
        int var4 = method3577(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method3577(16);
        }
        int var6 = method3577(6) + 1;
        field8709 = new class698[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field8709[var7] = new class698();
        }
        int var8 = method3577(6) + 1;
        field8722 = new class209[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field8722[var9] = new class209();
        }
        int var10 = method3577(6) + 1;
        field8710 = new class257[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field8710[var11] = new class257();
        }
        int var12 = method3577(6) + 1;
        field8708 = new boolean[var12];
        field8721 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field8708[var13] = method3574() != 0;
            method3577(16);
            method3577(16);
            field8721[var13] = method3577(8);
        }
        field8716 = true;
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "([I)Lfk;", line = 759)
    public final class348 method3582(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field8729 == null) {
            this.field8723 = 0;
            this.field8705 = new float[field8730];
            this.field8729 = new byte[this.field8703];
            this.field8727 = 0;
            this.field8728 = 0;
        }
        while (this.field8728 < this.field8697.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method3575(this.field8728);
            if (var3 != null) {
                int var4 = this.field8727;
                int var5 = var3.length;
                if (var5 > this.field8703 - var4) {
                    var5 = this.field8703 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field8729[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field8727;
                }
                this.field8727 = var4;
            }
            this.field8728++;
        }
        this.field8705 = null;
        byte[] var2 = this.field8729;
        this.field8729 = null;
        return new class348(this.field8711, var2, this.field8715, this.field8717, this.field8700);
    }

    @OriginalMember(owner = "client!qw", name = "<init>", descriptor = "([B)V", line = 816)
    private class622(byte[] arg0) {
        this.method3579(arg0);
    }
}
