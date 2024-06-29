import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class44 extends class418 {

    @OriginalMember(owner = "client!fo", name = "r", descriptor = "Z")
    private static boolean field647 = false;

    @OriginalMember(owner = "client!fo", name = "n", descriptor = "I")
    private static int field643;

    @OriginalMember(owner = "client!fo", name = "s", descriptor = "I")
    private int field648;

    @OriginalMember(owner = "client!fo", name = "w", descriptor = "I")
    private int field652;

    @OriginalMember(owner = "client!fo", name = "x", descriptor = "I")
    private int field653;

    @OriginalMember(owner = "client!fo", name = "C", descriptor = "I")
    private static int field658;

    @OriginalMember(owner = "client!fo", name = "E", descriptor = "I")
    private int field660;

    @OriginalMember(owner = "client!fo", name = "G", descriptor = "I")
    private static int field662;

    @OriginalMember(owner = "client!fo", name = "H", descriptor = "I")
    private int field663;

    @OriginalMember(owner = "client!fo", name = "M", descriptor = "I")
    private int field667;

    @OriginalMember(owner = "client!fo", name = "P", descriptor = "I")
    private int field670;

    @OriginalMember(owner = "client!fo", name = "Q", descriptor = "I")
    private static int field671;

    @OriginalMember(owner = "client!fo", name = "S", descriptor = "I")
    private int field673;

    @OriginalMember(owner = "client!fo", name = "p", descriptor = "Z")
    private boolean field645;

    @OriginalMember(owner = "client!fo", name = "D", descriptor = "Z")
    private boolean field659;

    @OriginalMember(owner = "client!fo", name = "I", descriptor = "[B")
    private static byte[] field664;

    @OriginalMember(owner = "client!fo", name = "R", descriptor = "[B")
    private byte[] field672;

    @OriginalMember(owner = "client!fo", name = "m", descriptor = "[F")
    private static float[] field642;

    @OriginalMember(owner = "client!fo", name = "o", descriptor = "[F")
    private static float[] field644;

    @OriginalMember(owner = "client!fo", name = "t", descriptor = "[F")
    private static float[] field649;

    @OriginalMember(owner = "client!fo", name = "v", descriptor = "[F")
    private static float[] field651;

    @OriginalMember(owner = "client!fo", name = "z", descriptor = "[F")
    private float[] field655;

    @OriginalMember(owner = "client!fo", name = "A", descriptor = "[F")
    private static float[] field656;

    @OriginalMember(owner = "client!fo", name = "J", descriptor = "[F")
    private static float[] field665;

    @OriginalMember(owner = "client!fo", name = "L", descriptor = "[F")
    private static float[] field666;

    @OriginalMember(owner = "client!fo", name = "k", descriptor = "[I")
    private static int[] field640;

    @OriginalMember(owner = "client!fo", name = "u", descriptor = "[I")
    private static int[] field650;

    @OriginalMember(owner = "client!fo", name = "O", descriptor = "[I")
    private static int[] field669;

    @OriginalMember(owner = "client!fo", name = "y", descriptor = "[Lwb;")
    private static class172[] field654;

    @OriginalMember(owner = "client!fo", name = "B", descriptor = "[Lj;")
    private static class339[] field657;

    @OriginalMember(owner = "client!fo", name = "F", descriptor = "[Lwm;")
    public static class371[] field661;

    @OriginalMember(owner = "client!fo", name = "q", descriptor = "[Lbp;")
    private static class434[] field646;

    @OriginalMember(owner = "client!fo", name = "l", descriptor = "[Z")
    private static boolean[] field641;

    @OriginalMember(owner = "client!fo", name = "N", descriptor = "[[B")
    private byte[][] field668;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "()I", line = 7)
    public static final int method311() {
        int var0 = field664[field662] >> field671 & 0x1;
        field671++;
        field662 += field671 >> 3;
        field671 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "()V", line = 17)
    public static void method312() {
        field664 = null;
        field661 = null;
        field646 = null;
        field657 = null;
        field654 = null;
        field641 = null;
        field669 = null;
        field642 = null;
        field665 = null;
        field656 = null;
        field644 = null;
        field666 = null;
        field649 = null;
        field651 = null;
        field640 = null;
        field650 = null;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lir;)Z", line = 36)
    private static final boolean method313(class185 arg0) {
        if (!field647) {
            byte[] var1 = arg0.method1235(0, false, 0);
            if (var1 == null) {
                return false;
            }
            method316(var1);
            field647 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "([BI)V", line = 50)
    private static final void method314(byte[] arg0, int arg1) {
        field664 = arg0;
        field662 = arg1;
        field671 = 0;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lir;II)Lfo;", line = 57)
    public static final class44 method315(class185 arg0, int arg1, int arg2) {
        if (method313(arg0)) {
            byte[] var3 = arg0.method1235(arg1, false, arg2);
            return var3 == null ? null : new class44(var3);
        } else {
            arg0.method1214((byte) -111, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "([B)V", line = 73)
    private static final void method316(byte[] arg0) {
        method314(arg0, 0);
        field658 = 0x1 << method321(4);
        field643 = 0x1 << method321(4);
        field642 = new float[field643];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field658 : field643;
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
            int var25 = class430.method2686(83, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class3.method17(122, var26, var25);
            }
            if (var1 == 0) {
                field665 = var18;
                field656 = var20;
                field644 = var22;
                field640 = var24;
            } else {
                field666 = var18;
                field649 = var20;
                field651 = var22;
                field650 = var24;
            }
        }
        int var2 = method321(8) + 1;
        field661 = new class371[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field661[var3] = new class371();
        }
        int var4 = method321(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method321(16);
        }
        int var6 = method321(6) + 1;
        field646 = new class434[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field646[var7] = new class434();
        }
        int var8 = method321(6) + 1;
        field657 = new class339[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field657[var9] = new class339();
        }
        int var10 = method321(6) + 1;
        field654 = new class172[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field654[var11] = new class172();
        }
        int var12 = method321(6) + 1;
        field641 = new boolean[var12];
        field669 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field641[var13] = method311() != 0;
            method321(16);
            method321(16);
            field669[var13] = method321(8);
        }
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)[F", line = 227)
    private final float[] method317(int arg0) {
        method314(this.field668[arg0], 0);
        method311();
        int var2 = method321(class430.method2686(84, field669.length - 1));
        boolean var3 = field641[var2];
        int var4 = var3 ? field643 : field658;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method311() != 0;
            var6 = method311() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field658 >> 2);
            var9 = (field658 >> 2) + (var4 >> 2);
            var10 = field658 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field658 >> 2);
            var12 = (field658 >> 2) + (var4 - (var4 >> 2));
            var13 = field658 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class172 var14 = field654[field669[var2]];
        int var15 = var14.field2347;
        int var16 = var14.field2348[var15];
        boolean var17 = !field646[var16].method2710();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2346; var19++) {
            class339 var95 = field657[var14.field2349[var19]];
            float[] var96 = field642;
            var95.method2202(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2347;
            int var21 = var14.field2348[var20];
            field646[var21].method2708(field642, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field642[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field642;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field666 : field665;
            float[] var30 = var3 ? field649 : field656;
            float[] var31 = var3 ? field651 : field644;
            int[] var32 = var3 ? field650 : field640;
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
            int var35 = class430.method2686(108, var4 - 1);
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
                field642[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field642[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field653 > 0) {
            int var49 = this.field653 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field645) {
                for (int var50 = 0; var50 < this.field660; var50++) {
                    int var51 = (this.field653 >> 1) + var50;
                    var48[var50] += this.field655[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field642[var52];
                }
            }
        }
        float[] var54 = this.field655;
        this.field655 = field642;
        field642 = var54;
        this.field653 = var4;
        this.field660 = var12 - (var4 >> 1);
        this.field645 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "([B)V", line = 641)
    private final void method318(byte[] arg0) {
        class341 var2 = new class341(arg0);
        this.field648 = var2.method2232(-46);
        this.field652 = var2.method2232(-5);
        this.field663 = var2.method2232(113);
        this.field667 = var2.method2232(-104);
        if (this.field667 < 0) {
            this.field667 = ~this.field667;
            this.field659 = true;
        }
        int var3 = var2.method2232(-11);
        this.field668 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2233((byte) 104);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method2210(false, var5, var7, 0);
            this.field668[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "([I)Lhh;", line = 699)
    public final class151 method319(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field672 == null) {
            this.field653 = 0;
            this.field655 = new float[field643];
            this.field672 = new byte[this.field652];
            this.field673 = 0;
            this.field670 = 0;
        }
        while (this.field670 < this.field668.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method317(this.field670);
            if (var3 != null) {
                int var4 = this.field673;
                int var5 = var3.length;
                if (var5 > this.field652 - var4) {
                    var5 = this.field652 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field672[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field673;
                }
                this.field673 = var4;
            }
            this.field670++;
        }
        this.field655 = null;
        byte[] var2 = this.field672;
        this.field672 = null;
        return new class151(this.field648, var2, this.field663, this.field667, this.field659);
    }

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "(I)F", line = 759)
    public static final float method320(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "(I)I", line = 773)
    public static final int method321(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field671) {
            int var4 = 8 - field671;
            int var5 = (0x1 << var4) - 1;
            var1 += (field664[field662] >> field671 & var5) << var2;
            field671 = 0;
            field662++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field664[field662] >> field671 & var3) << var2;
            field671 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "([B)V", line = 801)
    private class44(byte[] arg0) {
        this.method318(arg0);
    }
}
