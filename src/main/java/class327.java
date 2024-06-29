import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class327 extends class117 {

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "Z")
    private static boolean field4910 = false;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    private static int field4902;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
    private int field4903;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    private int field4905;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "I")
    private static int field4909;

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "I")
    private static int field4912;

    @OriginalMember(owner = "client!ci", name = "E", descriptor = "I")
    private int field4920;

    @OriginalMember(owner = "client!ci", name = "K", descriptor = "I")
    private int field4924;

    @OriginalMember(owner = "client!ci", name = "L", descriptor = "I")
    private static int field4925;

    @OriginalMember(owner = "client!ci", name = "N", descriptor = "I")
    private int field4927;

    @OriginalMember(owner = "client!ci", name = "Q", descriptor = "I")
    private int field4930;

    @OriginalMember(owner = "client!ci", name = "S", descriptor = "I")
    private int field4932;

    @OriginalMember(owner = "client!ci", name = "V", descriptor = "I")
    private int field4935;

    @OriginalMember(owner = "client!ci", name = "I", descriptor = "Z")
    private boolean field4923;

    @OriginalMember(owner = "client!ci", name = "O", descriptor = "Z")
    private boolean field4928;

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "[B")
    private static byte[] field4915;

    @OriginalMember(owner = "client!ci", name = "U", descriptor = "[B")
    private byte[] field4934;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "[F")
    private static float[] field4904;

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "[F")
    private static float[] field4907;

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "[F")
    private static float[] field4908;

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "[F")
    private float[] field4914;

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "[F")
    private static float[] field4916;

    @OriginalMember(owner = "client!ci", name = "A", descriptor = "[F")
    private static float[] field4917;

    @OriginalMember(owner = "client!ci", name = "F", descriptor = "[F")
    private static float[] field4921;

    @OriginalMember(owner = "client!ci", name = "H", descriptor = "[F")
    private static float[] field4922;

    @OriginalMember(owner = "client!ci", name = "B", descriptor = "[I")
    private static int[] field4918;

    @OriginalMember(owner = "client!ci", name = "D", descriptor = "[I")
    private static int[] field4919;

    @OriginalMember(owner = "client!ci", name = "P", descriptor = "[I")
    private static int[] field4929;

    @OriginalMember(owner = "client!ci", name = "M", descriptor = "[Luk;")
    private static class140[] field4926;

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "[Lng;")
    private static class187[] field4913;

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "[Lu;")
    private static class26[] field4911;

    @OriginalMember(owner = "client!ci", name = "T", descriptor = "[Lbk;")
    public static class53[] field4933;

    @OriginalMember(owner = "client!ci", name = "R", descriptor = "[Z")
    private static boolean[] field4931;

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "[[B")
    private byte[][] field4906;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "([B)V", line = 5)
    private final void method2256(byte[] arg0) {
        class190 var2 = new class190(arg0);
        this.field4920 = var2.method1371(-4);
        this.field4905 = var2.method1371(-4);
        this.field4930 = var2.method1371(-4);
        this.field4927 = var2.method1371(-4);
        if (this.field4927 < 0) {
            this.field4927 = ~this.field4927;
            this.field4928 = true;
        }
        int var3 = var2.method1371(-4);
        this.field4906 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1319(255);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1309(var5, 0, var7, -21941);
            this.field4906[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "()V", line = 52)
    public static void method2257() {
        field4915 = null;
        field4933 = null;
        field4913 = null;
        field4911 = null;
        field4926 = null;
        field4931 = null;
        field4919 = null;
        field4904 = null;
        field4908 = null;
        field4921 = null;
        field4922 = null;
        field4916 = null;
        field4907 = null;
        field4917 = null;
        field4918 = null;
        field4929 = null;
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)I", line = 71)
    public static final int method2258(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field4912) {
            int var3 = 8 - field4912;
            int var4 = (0x1 << var3) - 1;
            var1 += (field4915[field4909] >> field4912 & var4) << var2;
            field4912 = 0;
            field4909++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field4915[field4909] >> field4912 & var5) << var2;
            field4912 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "(I)F", line = 103)
    public static final float method2259(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "([B)V", line = 114)
    private static final void method2260(byte[] arg0) {
        method2262(arg0, 0);
        field4902 = 0x1 << method2258(4);
        field4925 = 0x1 << method2258(4);
        field4904 = new float[field4925];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field4902 : field4925;
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
            int var13 = class232.method1721(true, var5 - 1);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class158.method1140(var13, -4033, var14);
            }
            if (var1 == 0) {
                field4908 = var6;
                field4921 = var8;
                field4922 = var10;
                field4918 = var12;
            } else {
                field4916 = var6;
                field4907 = var8;
                field4917 = var10;
                field4929 = var12;
            }
        }
        int var15 = method2258(8) + 1;
        field4933 = new class53[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field4933[var16] = new class53();
        }
        int var17 = method2258(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method2258(16);
        }
        int var19 = method2258(6) + 1;
        field4913 = new class187[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field4913[var20] = new class187();
        }
        int var21 = method2258(6) + 1;
        field4911 = new class26[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field4911[var22] = new class26();
        }
        int var23 = method2258(6) + 1;
        field4926 = new class140[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field4926[var24] = new class140();
        }
        int var25 = method2258(6) + 1;
        field4931 = new boolean[var25];
        field4919 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field4931[var26] = method2266() != 0;
            method2258(16);
            method2258(16);
            field4919[var26] = method2258(8);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lph;)Z", line = 268)
    private static final boolean method2261(class361 arg0) {
        if (!field4910) {
            byte[] var1 = arg0.method2520(0, 0, (byte) -25);
            if (var1 == null) {
                return false;
            }
            method2260(var1);
            field4910 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "([BI)V", line = 282)
    private static final void method2262(byte[] arg0, int arg1) {
        field4915 = arg0;
        field4909 = arg1;
        field4912 = 0;
    }

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "(I)[F", line = 293)
    private final float[] method2263(int arg0) {
        method2262(this.field4906[arg0], 0);
        method2266();
        int var2 = method2258(class232.method1721(true, field4919.length - 1));
        boolean var3 = field4931[var2];
        int var4 = var3 ? field4925 : field4902;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2266() != 0;
            var6 = method2266() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field4902 >> 2);
            var9 = (field4902 >> 2) + (var4 >> 2);
            var10 = field4902 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field4902 >> 2);
            var12 = (field4902 >> 2) + (var4 - (var4 >> 2));
            var13 = field4902 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class140 var14 = field4926[field4919[var2]];
        int var15 = var14.field2007;
        int var16 = var14.field2005[var15];
        boolean var17 = !field4913[var16].method1293();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2008; var19++) {
            class26 var20 = field4911[var14.field2006[var19]];
            float[] var21 = field4904;
            var20.method163(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field2007;
            int var23 = var14.field2005[var22];
            field4913[var23].method1298(field4904, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field4904[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field4904;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field4916 : field4908;
            float[] var32 = var3 ? field4907 : field4921;
            float[] var33 = var3 ? field4917 : field4922;
            int[] var34 = var3 ? field4929 : field4918;
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
            int var47 = class232.method1721(true, var4 - 1);
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
                field4904[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field4904[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field4924 > 0) {
            int var91 = this.field4924 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field4923) {
                for (int var92 = 0; var92 < this.field4903; var92++) {
                    int var93 = (this.field4924 >> 1) + var92;
                    var90[var92] += this.field4914[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field4904[var94];
                }
            }
        }
        float[] var96 = this.field4914;
        this.field4914 = field4904;
        field4904 = var96;
        this.field4924 = var4;
        this.field4903 = var12 - (var4 >> 1);
        this.field4923 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lph;II)Lci;", line = 713)
    public static final class327 method2264(class361 arg0, int arg1, int arg2) {
        if (method2261(arg0)) {
            byte[] var3 = arg0.method2520(arg1, arg2, (byte) -25);
            return var3 == null ? null : new class327(var3);
        } else {
            arg0.method2536(-19052, arg2, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "([B)V", line = 735)
    private class327(byte[] arg0) {
        this.method2256(arg0);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "([I)Ld;", line = 740)
    public final class43 method2265(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field4934 == null) {
            this.field4924 = 0;
            this.field4914 = new float[field4925];
            this.field4934 = new byte[this.field4905];
            this.field4932 = 0;
            this.field4935 = 0;
        }
        while (this.field4935 < this.field4906.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method2263(this.field4935);
            if (var2 != null) {
                int var3 = this.field4932;
                int var4 = var2.length;
                if (var4 > this.field4905 - var3) {
                    var4 = this.field4905 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field4934[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field4932;
                }
                this.field4932 = var3;
            }
            this.field4935++;
        }
        this.field4914 = null;
        byte[] var7 = this.field4934;
        this.field4934 = null;
        return new class43(this.field4920, var7, this.field4930, this.field4927, this.field4928);
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "()I", line = 802)
    public static final int method2266() {
        int var0 = field4915[field4909] >> field4912 & 0x1;
        field4912++;
        field4909 += field4912 >> 3;
        field4912 &= 0x7;
        return var0;
    }
}
