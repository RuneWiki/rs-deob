import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class307 extends class71 {

    @OriginalMember(owner = "client!hi", name = "T", descriptor = "Z")
    private static boolean field4806 = false;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    private static int field4780;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "I")
    private int field4781;

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "I")
    private static int field4784;

    @OriginalMember(owner = "client!hi", name = "F", descriptor = "I")
    private static int field4792;

    @OriginalMember(owner = "client!hi", name = "H", descriptor = "I")
    private int field4794;

    @OriginalMember(owner = "client!hi", name = "I", descriptor = "I")
    private int field4795;

    @OriginalMember(owner = "client!hi", name = "L", descriptor = "I")
    private int field4798;

    @OriginalMember(owner = "client!hi", name = "Q", descriptor = "I")
    private static int field4803;

    @OriginalMember(owner = "client!hi", name = "R", descriptor = "I")
    private int field4804;

    @OriginalMember(owner = "client!hi", name = "W", descriptor = "I")
    private int field4809;

    @OriginalMember(owner = "client!hi", name = "X", descriptor = "I")
    private int field4810;

    @OriginalMember(owner = "client!hi", name = "Y", descriptor = "I")
    private int field4811;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "Z")
    private boolean field4779;

    @OriginalMember(owner = "client!hi", name = "B", descriptor = "Z")
    private boolean field4788;

    @OriginalMember(owner = "client!hi", name = "O", descriptor = "[B")
    private static byte[] field4801;

    @OriginalMember(owner = "client!hi", name = "Z", descriptor = "[B")
    private byte[] field4812;

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "[F")
    private static float[] field4782;

    @OriginalMember(owner = "client!hi", name = "C", descriptor = "[F")
    private static float[] field4789;

    @OriginalMember(owner = "client!hi", name = "G", descriptor = "[F")
    private static float[] field4793;

    @OriginalMember(owner = "client!hi", name = "J", descriptor = "[F")
    private float[] field4796;

    @OriginalMember(owner = "client!hi", name = "K", descriptor = "[F")
    private static float[] field4797;

    @OriginalMember(owner = "client!hi", name = "M", descriptor = "[F")
    private static float[] field4799;

    @OriginalMember(owner = "client!hi", name = "N", descriptor = "[F")
    private static float[] field4800;

    @OriginalMember(owner = "client!hi", name = "U", descriptor = "[F")
    private static float[] field4807;

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "[I")
    private static int[] field4786;

    @OriginalMember(owner = "client!hi", name = "E", descriptor = "[I")
    private static int[] field4791;

    @OriginalMember(owner = "client!hi", name = "P", descriptor = "[I")
    private static int[] field4802;

    @OriginalMember(owner = "client!hi", name = "V", descriptor = "[Lpj;")
    public static class195[] field4808;

    @OriginalMember(owner = "client!hi", name = "A", descriptor = "[Lob;")
    private static class306[] field4787;

    @OriginalMember(owner = "client!hi", name = "D", descriptor = "[Lqi;")
    private static class317[] field4790;

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "[Ltg;")
    private static class328[] field4783;

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "[Z")
    private static boolean[] field4785;

    @OriginalMember(owner = "client!hi", name = "S", descriptor = "[[B")
    private byte[][] field4805;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "([B)V", line = 16)
    private static final void method2147(byte[] arg0) {
        method2150(arg0, 0);
        field4803 = 0x1 << method2154(4);
        field4784 = 0x1 << method2154(4);
        field4789 = new float[field4784];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field4803 : field4784;
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
            int var13 = class148.method1033(var5 - 1, (byte) -19);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class56.method394(true, var14, var13);
            }
            if (var1 == 0) {
                field4793 = var6;
                field4797 = var8;
                field4799 = var10;
                field4802 = var12;
            } else {
                field4800 = var6;
                field4782 = var8;
                field4807 = var10;
                field4791 = var12;
            }
        }
        int var15 = method2154(8) + 1;
        field4808 = new class195[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field4808[var16] = new class195();
        }
        int var17 = method2154(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method2154(16);
        }
        int var19 = method2154(6) + 1;
        field4787 = new class306[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field4787[var20] = new class306();
        }
        int var21 = method2154(6) + 1;
        field4783 = new class328[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field4783[var22] = new class328();
        }
        int var23 = method2154(6) + 1;
        field4790 = new class317[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field4790[var24] = new class317();
        }
        int var25 = method2154(6) + 1;
        field4785 = new boolean[var25];
        field4786 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field4785[var26] = method2153() != 0;
            method2154(16);
            method2154(16);
            field4786[var26] = method2154(8);
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)F", line = 172)
    public static final float method2148(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "()V", line = 183)
    public static void method2149() {
        field4801 = null;
        field4808 = null;
        field4787 = null;
        field4783 = null;
        field4790 = null;
        field4785 = null;
        field4786 = null;
        field4789 = null;
        field4793 = null;
        field4797 = null;
        field4799 = null;
        field4800 = null;
        field4782 = null;
        field4807 = null;
        field4802 = null;
        field4791 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "([BI)V", line = 202)
    private static final void method2150(byte[] arg0, int arg1) {
        field4801 = arg0;
        field4780 = arg1;
        field4792 = 0;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lkb;II)Lhi;", line = 208)
    public static final class307 method2151(class39 arg0, int arg1, int arg2) {
        if (method2157(arg0)) {
            byte[] var3 = arg0.method250(true, arg1, arg2);
            return var3 == null ? null : new class307(var3);
        } else {
            arg0.method243(arg2, false, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "([I)Lqj;", line = 222)
    public final class267 method2152(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field4812 == null) {
            this.field4809 = 0;
            this.field4796 = new float[field4784];
            this.field4812 = new byte[this.field4804];
            this.field4811 = 0;
            this.field4810 = 0;
        }
        while (this.field4810 < this.field4805.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method2155(this.field4810);
            if (var2 != null) {
                int var3 = this.field4811;
                int var4 = var2.length;
                if (var4 > this.field4804 - var3) {
                    var4 = this.field4804 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field4812[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field4811;
                }
                this.field4811 = var3;
            }
            this.field4810++;
        }
        this.field4796 = null;
        byte[] var7 = this.field4812;
        this.field4812 = null;
        return new class267(this.field4795, var7, this.field4781, this.field4798, this.field4788);
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "()I", line = 283)
    public static final int method2153() {
        int var0 = field4801[field4780] >> field4792 & 0x1;
        field4792++;
        field4780 += field4792 >> 3;
        field4792 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "(I)I", line = 292)
    public static final int method2154(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field4792) {
            int var3 = 8 - field4792;
            int var4 = (0x1 << var3) - 1;
            var1 += (field4801[field4780] >> field4792 & var4) << var2;
            field4792 = 0;
            field4780++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field4801[field4780] >> field4792 & var5) << var2;
            field4792 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "(I)[F", line = 322)
    private final float[] method2155(int arg0) {
        method2150(this.field4805[arg0], 0);
        method2153();
        int var2 = method2154(class148.method1033(field4786.length - 1, (byte) -19));
        boolean var3 = field4785[var2];
        int var4 = var3 ? field4784 : field4803;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2153() != 0;
            var6 = method2153() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field4803 >> 2);
            var9 = (field4803 >> 2) + (var4 >> 2);
            var10 = field4803 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field4803 >> 2);
            var12 = (field4803 >> 2) + (var4 - (var4 >> 2));
            var13 = field4803 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class317 var14 = field4790[field4786[var2]];
        int var15 = var14.field4923;
        int var16 = var14.field4922[var15];
        boolean var17 = !field4787[var16].method2142();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field4925; var19++) {
            class328 var20 = field4783[var14.field4924[var19]];
            float[] var21 = field4789;
            var20.method2271(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field4923;
            int var23 = var14.field4922[var22];
            field4787[var23].method2139(field4789, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field4789[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field4789;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field4800 : field4793;
            float[] var32 = var3 ? field4782 : field4797;
            float[] var33 = var3 ? field4807 : field4799;
            int[] var34 = var3 ? field4791 : field4802;
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
            int var47 = class148.method1033(var4 - 1, (byte) -19);
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
                field4789[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field4789[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field4809 > 0) {
            int var91 = this.field4809 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field4779) {
                for (int var92 = 0; var92 < this.field4794; var92++) {
                    int var93 = (this.field4809 >> 1) + var92;
                    var90[var92] += this.field4796[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field4789[var94];
                }
            }
        }
        float[] var96 = this.field4796;
        this.field4796 = field4789;
        field4789 = var96;
        this.field4809 = var4;
        this.field4794 = var12 - (var4 >> 1);
        this.field4779 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "([B)V", line = 741)
    private final void method2156(byte[] arg0) {
        class192 var2 = new class192(arg0);
        this.field4795 = var2.method1354((byte) 75);
        this.field4804 = var2.method1354((byte) 108);
        this.field4781 = var2.method1354((byte) 53);
        this.field4798 = var2.method1354((byte) -115);
        if (this.field4798 < 0) {
            this.field4798 = ~this.field4798;
            this.field4788 = true;
        }
        int var3 = var2.method1354((byte) 71);
        this.field4805 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1399(-1172389784);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1409((byte) 67, var7, var5, 0);
            this.field4805[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lkb;)Z", line = 783)
    private static final boolean method2157(class39 arg0) {
        if (!field4806) {
            byte[] var1 = arg0.method250(true, 0, 0);
            if (var1 == null) {
                return false;
            }
            method2147(var1);
            field4806 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "([B)V", line = 800)
    private class307(byte[] arg0) {
        this.method2156(arg0);
    }
}
