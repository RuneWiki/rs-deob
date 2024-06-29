import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class296 extends class147 {

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "Z")
    private static boolean field4938 = false;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    private int field4922;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
    private int field4923;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
    private static int field4929;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
    private int field4930;

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "I")
    private int field4934;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
    private static int field4935;

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
    private static int field4937;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
    private int field4941;

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "I")
    private int field4945;

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
    private static int field4947;

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "I")
    private int field4951;

    @OriginalMember(owner = "client!jc", name = "V", descriptor = "I")
    private int field4952;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "Z")
    private boolean field4928;

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "Z")
    private boolean field4944;

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "[B")
    private byte[] field4948;

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "[B")
    private static byte[] field4950;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "[F")
    private static float[] field4920;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "[F")
    private static float[] field4921;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "[F")
    private float[] field4927;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "[F")
    private static float[] field4932;

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "[F")
    private static float[] field4933;

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "[F")
    private static float[] field4936;

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "[F")
    private static float[] field4946;

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "[F")
    private static float[] field4949;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "[I")
    private static int[] field4924;

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "[I")
    private static int[] field4942;

    @OriginalMember(owner = "client!jc", name = "W", descriptor = "[I")
    private static int[] field4953;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "[Lji;")
    public static class106[] field4939;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "[Lvb;")
    private static class54[] field4925;

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "[Lie;")
    private static class87[] field4940;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "[Luk;")
    private static class93[] field4931;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "[Z")
    private static boolean[] field4926;

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "[[B")
    private byte[][] field4943;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)F", line = 4)
    public static final float method2077(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([I)Lkj;", line = 21)
    public final class176 method2078(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field4948 == null) {
            this.field4922 = 0;
            this.field4927 = new float[field4929];
            this.field4948 = new byte[this.field4923];
            this.field4952 = 0;
            this.field4951 = 0;
        }
        while (this.field4951 < this.field4943.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method2085(this.field4951);
            if (var2 != null) {
                int var3 = this.field4952;
                int var4 = var2.length;
                if (var4 > this.field4923 - var3) {
                    var4 = this.field4923 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field4948[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field4952;
                }
                this.field4952 = var3;
            }
            this.field4951++;
        }
        this.field4927 = null;
        byte[] var7 = this.field4948;
        this.field4948 = null;
        return new class176(this.field4941, var7, this.field4930, this.field4934, this.field4928);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([B)V", line = 80)
    private final void method2079(byte[] arg0) {
        class82 var2 = new class82(arg0);
        this.field4941 = var2.method587(-502942936);
        this.field4923 = var2.method587(-502942936);
        this.field4930 = var2.method587(-502942936);
        this.field4934 = var2.method587(-502942936);
        if (this.field4934 < 0) {
            this.field4934 = ~this.field4934;
            this.field4928 = true;
        }
        int var3 = var2.method587(-502942936);
        this.field4943 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method642((byte) -48);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method603(0, var5, var7, (byte) 93);
            this.field4943[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "()V", line = 127)
    public static void method2080() {
        field4950 = null;
        field4939 = null;
        field4940 = null;
        field4925 = null;
        field4931 = null;
        field4926 = null;
        field4953 = null;
        field4936 = null;
        field4933 = null;
        field4946 = null;
        field4949 = null;
        field4932 = null;
        field4920 = null;
        field4921 = null;
        field4924 = null;
        field4942 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lve;)Z", line = 154)
    private static final boolean method2081(class266 arg0) {
        if (!field4938) {
            byte[] var1 = arg0.method1889(0, (byte) -122, 0);
            if (var1 == null) {
                return false;
            }
            method2086(var1);
            field4938 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lve;II)Ljc;", line = 175)
    public static final class296 method2082(class266 arg0, int arg1, int arg2) {
        if (method2081(arg0)) {
            byte[] var3 = arg0.method1889(arg1, (byte) -122, arg2);
            return var3 == null ? null : new class296(var3);
        } else {
            arg0.method1885((byte) 95, arg2, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "()I", line = 191)
    public static final int method2083() {
        int var0 = field4950[field4937] >> field4947 & 0x1;
        field4947++;
        field4937 += field4947 >> 3;
        field4947 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([BI)V", line = 198)
    private static final void method2084(byte[] arg0, int arg1) {
        field4950 = arg0;
        field4937 = arg1;
        field4947 = 0;
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)[F", line = 203)
    private final float[] method2085(int arg0) {
        method2084(this.field4943[arg0], 0);
        method2083();
        int var2 = method2087(class301.method2118(field4953.length - 1, 4));
        boolean var3 = field4926[var2];
        int var4 = var3 ? field4929 : field4935;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2083() != 0;
            var6 = method2083() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field4935 >> 2);
            var9 = (field4935 >> 2) + (var4 >> 2);
            var10 = field4935 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field4935 >> 2);
            var12 = (field4935 >> 2) + (var4 - (var4 >> 2));
            var13 = field4935 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class93 var14 = field4931[field4953[var2]];
        int var15 = var14.field1528;
        int var16 = var14.field1529[var15];
        boolean var17 = !field4940[var16].method687();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1531; var19++) {
            class54 var20 = field4925[var14.field1530[var19]];
            float[] var21 = field4936;
            var20.method400(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field1528;
            int var23 = var14.field1529[var22];
            field4940[var23].method684(field4936, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field4936[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field4936;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field4932 : field4933;
            float[] var32 = var3 ? field4920 : field4946;
            float[] var33 = var3 ? field4921 : field4949;
            int[] var34 = var3 ? field4942 : field4924;
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
            int var47 = class301.method2118(var4 - 1, 4);
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
                field4936[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field4936[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field4922 > 0) {
            int var91 = this.field4922 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field4944) {
                for (int var92 = 0; var92 < this.field4945; var92++) {
                    int var93 = (this.field4922 >> 1) + var92;
                    var90[var92] += this.field4927[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field4936[var94];
                }
            }
        }
        float[] var96 = this.field4927;
        this.field4927 = field4936;
        field4936 = var96;
        this.field4922 = var4;
        this.field4945 = var12 - (var4 >> 1);
        this.field4944 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "([B)V", line = 618)
    private static final void method2086(byte[] arg0) {
        method2084(arg0, 0);
        field4935 = 0x1 << method2087(4);
        field4929 = 0x1 << method2087(4);
        field4936 = new float[field4929];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field4935 : field4929;
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
            int var13 = class301.method2118(var5 - 1, 4);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class66.method492(var13, -14314, var14);
            }
            if (var1 == 0) {
                field4933 = var6;
                field4946 = var8;
                field4949 = var10;
                field4924 = var12;
            } else {
                field4932 = var6;
                field4920 = var8;
                field4921 = var10;
                field4942 = var12;
            }
        }
        int var15 = method2087(8) + 1;
        field4939 = new class106[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field4939[var16] = new class106();
        }
        int var17 = method2087(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method2087(16);
        }
        int var19 = method2087(6) + 1;
        field4940 = new class87[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field4940[var20] = new class87();
        }
        int var21 = method2087(6) + 1;
        field4925 = new class54[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field4925[var22] = new class54();
        }
        int var23 = method2087(6) + 1;
        field4931 = new class93[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field4931[var24] = new class93();
        }
        int var25 = method2087(6) + 1;
        field4926 = new boolean[var25];
        field4953 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field4926[var26] = method2083() != 0;
            method2087(16);
            method2087(16);
            field4953[var26] = method2087(8);
        }
    }

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)I", line = 771)
    public static final int method2087(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field4947) {
            int var3 = 8 - field4947;
            int var4 = (0x1 << var3) - 1;
            var1 += (field4950[field4937] >> field4947 & var4) << var2;
            field4947 = 0;
            field4937++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field4950[field4937] >> field4947 & var5) << var2;
            field4947 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "([B)V", line = 799)
    private class296(byte[] arg0) {
        this.method2079(arg0);
    }
}
