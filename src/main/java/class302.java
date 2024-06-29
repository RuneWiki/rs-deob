import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class302 extends class172 {

    @OriginalMember(owner = "client!rl", name = "D", descriptor = "Z")
    private static boolean field4700 = false;

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "I")
    private int field4684;

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "I")
    private int field4686;

    @OriginalMember(owner = "client!rl", name = "r", descriptor = "I")
    private static int field4688;

    @OriginalMember(owner = "client!rl", name = "A", descriptor = "I")
    private static int field4697;

    @OriginalMember(owner = "client!rl", name = "E", descriptor = "I")
    private int field4701;

    @OriginalMember(owner = "client!rl", name = "F", descriptor = "I")
    private static int field4702;

    @OriginalMember(owner = "client!rl", name = "H", descriptor = "I")
    private int field4704;

    @OriginalMember(owner = "client!rl", name = "M", descriptor = "I")
    private int field4709;

    @OriginalMember(owner = "client!rl", name = "P", descriptor = "I")
    private int field4712;

    @OriginalMember(owner = "client!rl", name = "R", descriptor = "I")
    private static int field4714;

    @OriginalMember(owner = "client!rl", name = "S", descriptor = "I")
    private int field4715;

    @OriginalMember(owner = "client!rl", name = "U", descriptor = "I")
    private int field4717;

    @OriginalMember(owner = "client!rl", name = "w", descriptor = "Z")
    private boolean field4693;

    @OriginalMember(owner = "client!rl", name = "x", descriptor = "Z")
    private boolean field4694;

    @OriginalMember(owner = "client!rl", name = "u", descriptor = "[B")
    private static byte[] field4691;

    @OriginalMember(owner = "client!rl", name = "Q", descriptor = "[B")
    private byte[] field4713;

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "[F")
    private static float[] field4685;

    @OriginalMember(owner = "client!rl", name = "t", descriptor = "[F")
    private static float[] field4690;

    @OriginalMember(owner = "client!rl", name = "y", descriptor = "[F")
    private static float[] field4695;

    @OriginalMember(owner = "client!rl", name = "I", descriptor = "[F")
    private static float[] field4705;

    @OriginalMember(owner = "client!rl", name = "J", descriptor = "[F")
    private static float[] field4706;

    @OriginalMember(owner = "client!rl", name = "K", descriptor = "[F")
    private float[] field4707;

    @OriginalMember(owner = "client!rl", name = "L", descriptor = "[F")
    private static float[] field4708;

    @OriginalMember(owner = "client!rl", name = "N", descriptor = "[F")
    private static float[] field4710;

    @OriginalMember(owner = "client!rl", name = "s", descriptor = "[I")
    private static int[] field4689;

    @OriginalMember(owner = "client!rl", name = "B", descriptor = "[I")
    private static int[] field4698;

    @OriginalMember(owner = "client!rl", name = "O", descriptor = "[I")
    private static int[] field4711;

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "[Lln;")
    private static class216[] field4687;

    @OriginalMember(owner = "client!rl", name = "z", descriptor = "[Lma;")
    public static class257[] field4696;

    @OriginalMember(owner = "client!rl", name = "C", descriptor = "[Lte;")
    private static class322[] field4699;

    @OriginalMember(owner = "client!rl", name = "T", descriptor = "[Lgh;")
    private static class325[] field4716;

    @OriginalMember(owner = "client!rl", name = "G", descriptor = "[Z")
    private static boolean[] field4703;

    @OriginalMember(owner = "client!rl", name = "v", descriptor = "[[B")
    private byte[][] field4692;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)I", line = 5)
    public static final int method2173(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field4702) {
            int var3 = 8 - field4702;
            int var4 = (0x1 << var3) - 1;
            var1 += (field4691[field4714] >> field4702 & var4) << var2;
            field4702 = 0;
            field4714++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field4691[field4714] >> field4702 & var5) << var2;
            field4702 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([B)V", line = 33)
    private final void method2174(byte[] arg0) {
        class25 var2 = new class25(arg0);
        this.field4701 = var2.method262((byte) 75);
        this.field4686 = var2.method262((byte) 96);
        this.field4704 = var2.method262((byte) 30);
        this.field4709 = var2.method262((byte) 113);
        if (this.field4709 < 0) {
            this.field4709 = ~this.field4709;
            this.field4693 = true;
        }
        int var3 = var2.method262((byte) 70);
        this.field4692 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method281(3);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method301((byte) -60, var5, var7, 0);
            this.field4692[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "(I)F", line = 76)
    public static final float method2175(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "()I", line = 88)
    public static final int method2176() {
        int var0 = field4691[field4714] >> field4702 & 0x1;
        field4702++;
        field4714 += field4702 >> 3;
        field4702 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "([B)V", line = 104)
    private static final void method2177(byte[] arg0) {
        method2181(arg0, 0);
        field4688 = 0x1 << method2173(4);
        field4697 = 0x1 << method2173(4);
        field4706 = new float[field4697];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field4688 : field4697;
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
            int var13 = class72.method684(4, var5 - 1);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class313.method2216(true, var14, var13);
            }
            if (var1 == 0) {
                field4705 = var6;
                field4710 = var8;
                field4695 = var10;
                field4711 = var12;
            } else {
                field4708 = var6;
                field4685 = var8;
                field4690 = var10;
                field4698 = var12;
            }
        }
        int var15 = method2173(8) + 1;
        field4696 = new class257[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field4696[var16] = new class257();
        }
        int var17 = method2173(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method2173(16);
        }
        int var19 = method2173(6) + 1;
        field4687 = new class216[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field4687[var20] = new class216();
        }
        int var21 = method2173(6) + 1;
        field4716 = new class325[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field4716[var22] = new class325();
        }
        int var23 = method2173(6) + 1;
        field4699 = new class322[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field4699[var24] = new class322();
        }
        int var25 = method2173(6) + 1;
        field4703 = new boolean[var25];
        field4689 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field4703[var26] = method2176() != 0;
            method2173(16);
            method2173(16);
            field4689[var26] = method2173(8);
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "()V", line = 280)
    public static void method2178() {
        field4691 = null;
        field4696 = null;
        field4687 = null;
        field4716 = null;
        field4699 = null;
        field4703 = null;
        field4689 = null;
        field4706 = null;
        field4705 = null;
        field4710 = null;
        field4695 = null;
        field4708 = null;
        field4685 = null;
        field4690 = null;
        field4711 = null;
        field4698 = null;
    }

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "(I)[F", line = 299)
    private final float[] method2179(int arg0) {
        method2181(this.field4692[arg0], 0);
        method2176();
        int var2 = method2173(class72.method684(4, field4689.length - 1));
        boolean var3 = field4703[var2];
        int var4 = var3 ? field4697 : field4688;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2176() != 0;
            var6 = method2176() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field4688 >> 2);
            var9 = (field4688 >> 2) + (var4 >> 2);
            var10 = field4688 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field4688 >> 2);
            var12 = (field4688 >> 2) + (var4 - (var4 >> 2));
            var13 = field4688 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class322 var14 = field4699[field4689[var2]];
        int var15 = var14.field4957;
        int var16 = var14.field4956[var15];
        boolean var17 = !field4687[var16].method1619();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field4955; var19++) {
            class325 var20 = field4716[var14.field4958[var19]];
            float[] var21 = field4706;
            var20.method2299(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field4957;
            int var23 = var14.field4956[var22];
            field4687[var23].method1612(field4706, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field4706[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field4706;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field4708 : field4705;
            float[] var32 = var3 ? field4685 : field4710;
            float[] var33 = var3 ? field4690 : field4695;
            int[] var34 = var3 ? field4698 : field4711;
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
            int var47 = class72.method684(4, var4 - 1);
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
                field4706[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field4706[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field4684 > 0) {
            int var91 = this.field4684 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field4694) {
                for (int var92 = 0; var92 < this.field4712; var92++) {
                    int var93 = (this.field4684 >> 1) + var92;
                    var90[var92] += this.field4707[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field4706[var94];
                }
            }
        }
        float[] var96 = this.field4707;
        this.field4707 = field4706;
        field4706 = var96;
        this.field4684 = var4;
        this.field4712 = var12 - (var4 >> 1);
        this.field4694 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "([B)V", line = 710)
    private class302(byte[] arg0) {
        this.method2174(arg0);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lrn;II)Lrl;", line = 715)
    public static final class302 method2180(class18 arg0, int arg1, int arg2) {
        if (method2182(arg0)) {
            byte[] var3 = arg0.method187(arg1, arg2, -1);
            return var3 == null ? null : new class302(var3);
        } else {
            arg0.method210(arg2, true, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([BI)V", line = 729)
    private static final void method2181(byte[] arg0, int arg1) {
        field4691 = arg0;
        field4714 = arg1;
        field4702 = 0;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lrn;)Z", line = 738)
    private static final boolean method2182(class18 arg0) {
        if (!field4700) {
            byte[] var1 = arg0.method187(0, 0, -1);
            if (var1 == null) {
                return false;
            }
            method2177(var1);
            field4700 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([I)Lqj;", line = 752)
    public final class225 method2183(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field4713 == null) {
            this.field4684 = 0;
            this.field4707 = new float[field4697];
            this.field4713 = new byte[this.field4686];
            this.field4717 = 0;
            this.field4715 = 0;
        }
        while (this.field4715 < this.field4692.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method2179(this.field4715);
            if (var2 != null) {
                int var3 = this.field4717;
                int var4 = var2.length;
                if (var4 > this.field4686 - var3) {
                    var4 = this.field4686 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field4713[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field4717;
                }
                this.field4717 = var3;
            }
            this.field4715++;
        }
        this.field4707 = null;
        byte[] var7 = this.field4713;
        this.field4713 = null;
        return new class225(this.field4701, var7, this.field4704, this.field4709, this.field4693);
    }
}
