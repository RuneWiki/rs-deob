import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class292 extends class280 {

    @OriginalMember(owner = "client!p", name = "w", descriptor = "Z")
    private static boolean field4624 = false;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    private int field4616;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    private static int field4617;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    private static int field4620;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "I")
    private int field4622;

    @OriginalMember(owner = "client!p", name = "B", descriptor = "I")
    private int field4629;

    @OriginalMember(owner = "client!p", name = "H", descriptor = "I")
    private int field4635;

    @OriginalMember(owner = "client!p", name = "N", descriptor = "I")
    private static int field4641;

    @OriginalMember(owner = "client!p", name = "O", descriptor = "I")
    private int field4642;

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "I")
    private int field4644;

    @OriginalMember(owner = "client!p", name = "S", descriptor = "I")
    private int field4646;

    @OriginalMember(owner = "client!p", name = "T", descriptor = "I")
    private int field4647;

    @OriginalMember(owner = "client!p", name = "U", descriptor = "I")
    private static int field4648;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "Z")
    private boolean field4621;

    @OriginalMember(owner = "client!p", name = "L", descriptor = "Z")
    private boolean field4639;

    @OriginalMember(owner = "client!p", name = "y", descriptor = "[B")
    private static byte[] field4626;

    @OriginalMember(owner = "client!p", name = "V", descriptor = "[B")
    private byte[] field4649;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "[F")
    private static float[] field4623;

    @OriginalMember(owner = "client!p", name = "z", descriptor = "[F")
    private static float[] field4627;

    @OriginalMember(owner = "client!p", name = "C", descriptor = "[F")
    private static float[] field4630;

    @OriginalMember(owner = "client!p", name = "E", descriptor = "[F")
    private static float[] field4632;

    @OriginalMember(owner = "client!p", name = "G", descriptor = "[F")
    private static float[] field4634;

    @OriginalMember(owner = "client!p", name = "J", descriptor = "[F")
    private static float[] field4637;

    @OriginalMember(owner = "client!p", name = "P", descriptor = "[F")
    private static float[] field4643;

    @OriginalMember(owner = "client!p", name = "R", descriptor = "[F")
    private float[] field4645;

    @OriginalMember(owner = "client!p", name = "x", descriptor = "[I")
    private static int[] field4625;

    @OriginalMember(owner = "client!p", name = "I", descriptor = "[I")
    private static int[] field4636;

    @OriginalMember(owner = "client!p", name = "M", descriptor = "[I")
    private static int[] field4640;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "[Lkj;")
    private static class147[] field4618;

    @OriginalMember(owner = "client!p", name = "F", descriptor = "[Lca;")
    public static class271[] field4633;

    @OriginalMember(owner = "client!p", name = "K", descriptor = "[Lha;")
    private static class31[] field4638;

    @OriginalMember(owner = "client!p", name = "A", descriptor = "[Lte;")
    private static class79[] field4628;

    @OriginalMember(owner = "client!p", name = "D", descriptor = "[Z")
    private static boolean[] field4631;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "[[B")
    private byte[][] field4619;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Llc;II)Lp;")
    public static final class292 method1974(class86 arg0, int arg1, int arg2) {
        if (method1984(arg0)) {
            byte[] var3 = arg0.method643(arg2, arg1, false);
            return var3 == null ? null : new class292(var3);
        } else {
            arg0.method650(arg2, arg1, -89);
            return null;
        }
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(I)I")
    public static final int method1975(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field4617) {
            int var4 = 8 - field4617;
            int var5 = (0x1 << var4) - 1;
            var1 += (field4626[field4641] >> field4617 & var5) << var2;
            field4617 = 0;
            field4641++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field4626[field4641] >> field4617 & var3) << var2;
            field4617 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(I)F")
    public static final float method1976(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()V")
    public static void method1977() {
        field4626 = null;
        field4633 = null;
        field4628 = null;
        field4618 = null;
        field4638 = null;
        field4631 = null;
        field4636 = null;
        field4627 = null;
        field4632 = null;
        field4623 = null;
        field4637 = null;
        field4643 = null;
        field4630 = null;
        field4634 = null;
        field4640 = null;
        field4625 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([B)V")
    private final void method1978(byte[] arg0) {
        class152 var2 = new class152(arg0);
        this.field4616 = var2.method1097(126);
        this.field4629 = var2.method1097(127);
        this.field4644 = var2.method1097(127);
        this.field4622 = var2.method1097(126);
        if (this.field4622 < 0) {
            this.field4622 = ~this.field4622;
            this.field4621 = true;
        }
        int var3 = var2.method1097(126);
        this.field4619 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1111(255);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1093(var7, (byte) 49, var5, 0);
            this.field4619[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!p", name = "f", descriptor = "(I)[F")
    private final float[] method1979(int arg0) {
        method1983(this.field4619[arg0], 0);
        method1981();
        int var2 = method1975(class138.method982(field4636.length - 1, -25030));
        boolean var3 = field4631[var2];
        int var4 = var3 ? field4620 : field4648;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1981() != 0;
            var6 = method1981() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field4648 >> 2);
            var9 = (field4648 >> 2) + (var4 >> 2);
            var10 = field4648 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field4648 >> 2);
            var12 = (field4648 >> 2) + (var4 - (var4 >> 2));
            var13 = field4648 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class31 var14 = field4638[field4636[var2]];
        int var15 = var14.field380;
        int var16 = var14.field379[var15];
        boolean var17 = !field4628[var16].method573();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field378; var19++) {
            class147 var95 = field4618[var14.field377[var19]];
            float[] var96 = field4627;
            var95.method1049(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field380;
            int var21 = var14.field379[var20];
            field4628[var21].method576(field4627, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field4627[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field4627;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field4643 : field4632;
            float[] var30 = var3 ? field4630 : field4623;
            float[] var31 = var3 ? field4634 : field4637;
            int[] var32 = var3 ? field4625 : field4640;
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
            int var35 = class138.method982(var4 - 1, -25030);
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
                field4627[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field4627[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field4635 > 0) {
            int var49 = this.field4635 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field4639) {
                for (int var50 = 0; var50 < this.field4642; var50++) {
                    int var51 = (this.field4635 >> 1) + var50;
                    var48[var50] += this.field4645[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field4627[var52];
                }
            }
        }
        float[] var54 = this.field4645;
        this.field4645 = field4627;
        field4627 = var54;
        this.field4635 = var4;
        this.field4642 = var12 - (var4 >> 1);
        this.field4639 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([I)Lwe;")
    public final class15 method1980(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field4649 == null) {
            this.field4635 = 0;
            this.field4645 = new float[field4620];
            this.field4649 = new byte[this.field4629];
            this.field4647 = 0;
            this.field4646 = 0;
        }
        while (this.field4646 < this.field4619.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1979(this.field4646);
            if (var3 != null) {
                int var4 = this.field4647;
                int var5 = var3.length;
                if (var5 > this.field4629 - var4) {
                    var5 = this.field4629 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field4649[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field4647;
                }
                this.field4647 = var4;
            }
            this.field4646++;
        }
        this.field4645 = null;
        byte[] var2 = this.field4649;
        this.field4649 = null;
        return new class15(this.field4616, var2, this.field4644, this.field4622, this.field4621);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "()I")
    public static final int method1981() {
        int var0 = field4626[field4641] >> field4617 & 0x1;
        field4617++;
        field4641 += field4617 >> 3;
        field4617 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "([B)V")
    private static final void method1982(byte[] arg0) {
        method1983(arg0, 0);
        field4648 = 0x1 << method1975(4);
        field4620 = 0x1 << method1975(4);
        field4627 = new float[field4620];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field4648 : field4620;
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
            int var25 = class138.method982(var17 - 1, -25030);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class114.method843(true, var25, var26);
            }
            if (var1 == 0) {
                field4632 = var18;
                field4623 = var20;
                field4637 = var22;
                field4640 = var24;
            } else {
                field4643 = var18;
                field4630 = var20;
                field4634 = var22;
                field4625 = var24;
            }
        }
        int var2 = method1975(8) + 1;
        field4633 = new class271[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field4633[var3] = new class271();
        }
        int var4 = method1975(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1975(16);
        }
        int var6 = method1975(6) + 1;
        field4628 = new class79[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field4628[var7] = new class79();
        }
        int var8 = method1975(6) + 1;
        field4618 = new class147[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field4618[var9] = new class147();
        }
        int var10 = method1975(6) + 1;
        field4638 = new class31[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field4638[var11] = new class31();
        }
        int var12 = method1975(6) + 1;
        field4631 = new boolean[var12];
        field4636 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field4631[var13] = method1981() != 0;
            method1975(16);
            method1975(16);
            field4636[var13] = method1975(8);
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "([B)V")
    private class292(byte[] arg0) {
        this.method1978(arg0);
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([BI)V")
    private static final void method1983(byte[] arg0, int arg1) {
        field4626 = arg0;
        field4641 = arg1;
        field4617 = 0;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Llc;)Z")
    private static final boolean method1984(class86 arg0) {
        if (!field4624) {
            byte[] var1 = arg0.method643(0, 0, false);
            if (var1 == null) {
                return false;
            }
            method1982(var1);
            field4624 = true;
        }
        return true;
    }
}
