import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class136 extends class159 {

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "Z")
    private static boolean field2138 = false;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    private static int field2141;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "I")
    private static int field2146;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "I")
    private int field2150;

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
    private static int field2151;

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "I")
    private int field2154;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
    private int field2155;

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "I")
    private static int field2158;

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
    private int field2159;

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "I")
    private int field2160;

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "I")
    private int field2161;

    @OriginalMember(owner = "client!ca", name = "R", descriptor = "I")
    private int field2170;

    @OriginalMember(owner = "client!ca", name = "S", descriptor = "I")
    private int field2171;

    @OriginalMember(owner = "client!ca", name = "M", descriptor = "Z")
    private boolean field2165;

    @OriginalMember(owner = "client!ca", name = "P", descriptor = "Z")
    private boolean field2168;

    @OriginalMember(owner = "client!ca", name = "N", descriptor = "[B")
    private static byte[] field2166;

    @OriginalMember(owner = "client!ca", name = "Q", descriptor = "[B")
    private byte[] field2169;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "[F")
    private static float[] field2139;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "[F")
    private float[] field2143;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "[F")
    private static float[] field2149;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "[F")
    private static float[] field2152;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "[F")
    private static float[] field2156;

    @OriginalMember(owner = "client!ca", name = "K", descriptor = "[F")
    private static float[] field2163;

    @OriginalMember(owner = "client!ca", name = "L", descriptor = "[F")
    private static float[] field2164;

    @OriginalMember(owner = "client!ca", name = "O", descriptor = "[F")
    private static float[] field2167;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "[I")
    private static int[] field2142;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "[I")
    private static int[] field2145;

    @OriginalMember(owner = "client!ca", name = "J", descriptor = "[I")
    private static int[] field2162;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "[Loa;")
    private static class332[] field2147;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "[Lfm;")
    private static class351[] field2144;

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "[Lnh;")
    private static class359[] field2153;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "[Lsh;")
    public static class36[] field2140;

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "[Z")
    private static boolean[] field2157;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "[[B")
    private byte[][] field2148;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)I", line = 5)
    public static final int method934(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2141) {
            int var3 = 8 - field2141;
            int var4 = (0x1 << var3) - 1;
            var1 += (field2166[field2146] >> field2141 & var4) << var2;
            field2141 = 0;
            field2146++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field2166[field2146] >> field2141 & var5) << var2;
            field2141 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([B)V", line = 39)
    private final void method935(byte[] arg0) {
        class313 var2 = new class313(arg0);
        this.field2154 = var2.method2231((byte) -125);
        this.field2150 = var2.method2231((byte) -128);
        this.field2159 = var2.method2231((byte) -123);
        this.field2160 = var2.method2231((byte) -126);
        if (this.field2160 < 0) {
            this.field2160 = ~this.field2160;
            this.field2168 = true;
        }
        int var3 = var2.method2231((byte) -125);
        this.field2148 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2224(-124);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method2237(var7, 2, 0, var5);
            this.field2148[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lnm;II)Lca;", line = 92)
    public static final class136 method936(class221 arg0, int arg1, int arg2) {
        if (method938(arg0)) {
            byte[] var3 = arg0.method1504(arg2, true, arg1);
            return var3 == null ? null : new class136(var3);
        } else {
            arg0.method1498(arg1, -60, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "(I)F", line = 107)
    public static final float method937(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lnm;)Z", line = 123)
    private static final boolean method938(class221 arg0) {
        if (!field2138) {
            byte[] var1 = arg0.method1504(0, true, 0);
            if (var1 == null) {
                return false;
            }
            method940(var1);
            field2138 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([I)Lpc;", line = 137)
    public final class321 method939(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2169 == null) {
            this.field2155 = 0;
            this.field2143 = new float[field2158];
            this.field2169 = new byte[this.field2150];
            this.field2171 = 0;
            this.field2170 = 0;
        }
        while (this.field2170 < this.field2148.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method941(this.field2170);
            if (var2 != null) {
                int var3 = this.field2171;
                int var4 = var2.length;
                if (var4 > this.field2150 - var3) {
                    var4 = this.field2150 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field2169[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field2171;
                }
                this.field2171 = var3;
            }
            this.field2170++;
        }
        this.field2143 = null;
        byte[] var7 = this.field2169;
        this.field2169 = null;
        return new class321(this.field2154, var7, this.field2159, this.field2160, this.field2168);
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "([B)V", line = 195)
    private static final void method940(byte[] arg0) {
        method944(arg0, 0);
        field2151 = 0x1 << method934(4);
        field2158 = 0x1 << method934(4);
        field2149 = new float[field2158];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field2151 : field2158;
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
            int var13 = class267.method1882(var5 - 1, 0);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class31.method262(var14, 6, var13);
            }
            if (var1 == 0) {
                field2152 = var6;
                field2164 = var8;
                field2163 = var10;
                field2142 = var12;
            } else {
                field2167 = var6;
                field2139 = var8;
                field2156 = var10;
                field2162 = var12;
            }
        }
        int var15 = method934(8) + 1;
        field2140 = new class36[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field2140[var16] = new class36();
        }
        int var17 = method934(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method934(16);
        }
        int var19 = method934(6) + 1;
        field2153 = new class359[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field2153[var20] = new class359();
        }
        int var21 = method934(6) + 1;
        field2147 = new class332[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field2147[var22] = new class332();
        }
        int var23 = method934(6) + 1;
        field2144 = new class351[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field2144[var24] = new class351();
        }
        int var25 = method934(6) + 1;
        field2157 = new boolean[var25];
        field2145 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field2157[var26] = method943() != 0;
            method934(16);
            method934(16);
            field2145[var26] = method934(8);
        }
    }

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "(I)[F", line = 346)
    private final float[] method941(int arg0) {
        method944(this.field2148[arg0], 0);
        method943();
        int var2 = method934(class267.method1882(field2145.length - 1, 0));
        boolean var3 = field2157[var2];
        int var4 = var3 ? field2158 : field2151;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method943() != 0;
            var6 = method943() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2151 >> 2);
            var9 = (field2151 >> 2) + (var4 >> 2);
            var10 = field2151 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2151 >> 2);
            var12 = (field2151 >> 2) + (var4 - (var4 >> 2));
            var13 = field2151 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class351 var14 = field2144[field2145[var2]];
        int var15 = var14.field5600;
        int var16 = var14.field5602[var15];
        boolean var17 = !field2153[var16].method2499();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field5601; var19++) {
            class332 var20 = field2147[var14.field5599[var19]];
            float[] var21 = field2149;
            var20.method2359(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field5600;
            int var23 = var14.field5602[var22];
            field2153[var23].method2495(field2149, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field2149[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field2149;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field2167 : field2152;
            float[] var32 = var3 ? field2139 : field2164;
            float[] var33 = var3 ? field2156 : field2163;
            int[] var34 = var3 ? field2162 : field2142;
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
            int var47 = class267.method1882(var4 - 1, 0);
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
                field2149[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2149[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field2155 > 0) {
            int var91 = this.field2155 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field2165) {
                for (int var92 = 0; var92 < this.field2161; var92++) {
                    int var93 = (this.field2155 >> 1) + var92;
                    var90[var92] += this.field2143[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field2149[var94];
                }
            }
        }
        float[] var96 = this.field2143;
        this.field2143 = field2149;
        field2149 = var96;
        this.field2155 = var4;
        this.field2161 = var12 - (var4 >> 1);
        this.field2165 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "()V", line = 759)
    public static void method942() {
        field2166 = null;
        field2140 = null;
        field2153 = null;
        field2147 = null;
        field2144 = null;
        field2157 = null;
        field2145 = null;
        field2149 = null;
        field2152 = null;
        field2164 = null;
        field2163 = null;
        field2167 = null;
        field2139 = null;
        field2156 = null;
        field2142 = null;
        field2162 = null;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "()I", line = 785)
    public static final int method943() {
        int var0 = field2166[field2146] >> field2141 & 0x1;
        field2141++;
        field2146 += field2141 >> 3;
        field2141 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([BI)V", line = 795)
    private static final void method944(byte[] arg0, int arg1) {
        field2166 = arg0;
        field2146 = arg1;
        field2141 = 0;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "([B)V", line = 802)
    private class136(byte[] arg0) {
        this.method935(arg0);
    }
}
