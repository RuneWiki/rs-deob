import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class127 extends class184 {

    @OriginalMember(owner = "client!sk", name = "S", descriptor = "Z")
    private static boolean field2170 = false;

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "I")
    private static int field2149;

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "I")
    private static int field2151;

    @OriginalMember(owner = "client!sk", name = "D", descriptor = "I")
    private static int field2156;

    @OriginalMember(owner = "client!sk", name = "F", descriptor = "I")
    private int field2158;

    @OriginalMember(owner = "client!sk", name = "G", descriptor = "I")
    private int field2159;

    @OriginalMember(owner = "client!sk", name = "I", descriptor = "I")
    private static int field2161;

    @OriginalMember(owner = "client!sk", name = "N", descriptor = "I")
    private int field2166;

    @OriginalMember(owner = "client!sk", name = "Q", descriptor = "I")
    private int field2169;

    @OriginalMember(owner = "client!sk", name = "U", descriptor = "I")
    private int field2172;

    @OriginalMember(owner = "client!sk", name = "ab", descriptor = "I")
    private int field2178;

    @OriginalMember(owner = "client!sk", name = "cb", descriptor = "I")
    private int field2180;

    @OriginalMember(owner = "client!sk", name = "db", descriptor = "I")
    private int field2181;

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "Z")
    private boolean field2152;

    @OriginalMember(owner = "client!sk", name = "C", descriptor = "Z")
    private boolean field2155;

    @OriginalMember(owner = "client!sk", name = "V", descriptor = "[B")
    private static byte[] field2173;

    @OriginalMember(owner = "client!sk", name = "bb", descriptor = "[B")
    private byte[] field2179;

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "[F")
    private static float[] field2148;

    @OriginalMember(owner = "client!sk", name = "H", descriptor = "[F")
    private float[] field2160;

    @OriginalMember(owner = "client!sk", name = "J", descriptor = "[F")
    private static float[] field2162;

    @OriginalMember(owner = "client!sk", name = "M", descriptor = "[F")
    private static float[] field2165;

    @OriginalMember(owner = "client!sk", name = "O", descriptor = "[F")
    private static float[] field2167;

    @OriginalMember(owner = "client!sk", name = "P", descriptor = "[F")
    private static float[] field2168;

    @OriginalMember(owner = "client!sk", name = "T", descriptor = "[F")
    private static float[] field2171;

    @OriginalMember(owner = "client!sk", name = "X", descriptor = "[F")
    private static float[] field2175;

    @OriginalMember(owner = "client!sk", name = "B", descriptor = "[I")
    private static int[] field2154;

    @OriginalMember(owner = "client!sk", name = "W", descriptor = "[I")
    private static int[] field2174;

    @OriginalMember(owner = "client!sk", name = "Z", descriptor = "[I")
    private static int[] field2177;

    @OriginalMember(owner = "client!sk", name = "L", descriptor = "[Ll;")
    public static class300[] field2164;

    @OriginalMember(owner = "client!sk", name = "Y", descriptor = "[Lkc;")
    private static class37[] field2176;

    @OriginalMember(owner = "client!sk", name = "E", descriptor = "[Lbj;")
    private static class56[] field2157;

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "[Lwl;")
    private static class89[] field2150;

    @OriginalMember(owner = "client!sk", name = "K", descriptor = "[Z")
    private static boolean[] field2163;

    @OriginalMember(owner = "client!sk", name = "A", descriptor = "[[B")
    private byte[][] field2153;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)F", line = 7)
    public static final float method872(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "([I)Ltd;", line = 19)
    public final class244 method873(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2179 == null) {
            this.field2166 = 0;
            this.field2160 = new float[field2151];
            this.field2179 = new byte[this.field2172];
            this.field2181 = 0;
            this.field2180 = 0;
        }
        while (this.field2180 < this.field2153.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method879(this.field2180);
            if (var2 != null) {
                int var3 = this.field2181;
                int var4 = var2.length;
                if (var4 > this.field2172 - var3) {
                    var4 = this.field2172 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field2179[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field2181;
                }
                this.field2181 = var3;
            }
            this.field2180++;
        }
        this.field2160 = null;
        byte[] var7 = this.field2179;
        this.field2179 = null;
        return new class244(this.field2178, var7, this.field2159, this.field2158, this.field2155);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "()V", line = 80)
    public static void method874() {
        field2173 = null;
        field2164 = null;
        field2157 = null;
        field2176 = null;
        field2150 = null;
        field2163 = null;
        field2174 = null;
        field2162 = null;
        field2171 = null;
        field2175 = null;
        field2148 = null;
        field2165 = null;
        field2168 = null;
        field2167 = null;
        field2154 = null;
        field2177 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lik;)Z", line = 99)
    private static final boolean method875(class262 arg0) {
        if (!field2170) {
            byte[] var1 = arg0.method1868(12236, 0, 0);
            if (var1 == null) {
                return false;
            }
            method877(var1);
            field2170 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "()I", line = 120)
    public static final int method876() {
        int var0 = field2173[field2161] >> field2149 & 0x1;
        field2149++;
        field2161 += field2149 >> 3;
        field2149 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "([B)V", line = 134)
    private static final void method877(byte[] arg0) {
        method878(arg0, 0);
        field2156 = 0x1 << method880(4);
        field2151 = 0x1 << method880(4);
        field2162 = new float[field2151];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field2156 : field2151;
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
            int var13 = class55.method382(-31, var5 - 1);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class94.method641(14620, var14, var13);
            }
            if (var1 == 0) {
                field2171 = var6;
                field2175 = var8;
                field2148 = var10;
                field2154 = var12;
            } else {
                field2165 = var6;
                field2168 = var8;
                field2167 = var10;
                field2177 = var12;
            }
        }
        int var15 = method880(8) + 1;
        field2164 = new class300[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field2164[var16] = new class300();
        }
        int var17 = method880(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method880(16);
        }
        int var19 = method880(6) + 1;
        field2157 = new class56[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field2157[var20] = new class56();
        }
        int var21 = method880(6) + 1;
        field2176 = new class37[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field2176[var22] = new class37();
        }
        int var23 = method880(6) + 1;
        field2150 = new class89[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field2150[var24] = new class89();
        }
        int var25 = method880(6) + 1;
        field2163 = new boolean[var25];
        field2174 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field2163[var26] = method876() != 0;
            method880(16);
            method880(16);
            field2174[var26] = method880(8);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "([BI)V", line = 289)
    private static final void method878(byte[] arg0, int arg1) {
        field2173 = arg0;
        field2161 = arg1;
        field2149 = 0;
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)[F", line = 294)
    private final float[] method879(int arg0) {
        method878(this.field2153[arg0], 0);
        method876();
        int var2 = method880(class55.method382(-9, field2174.length - 1));
        boolean var3 = field2163[var2];
        int var4 = var3 ? field2151 : field2156;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method876() != 0;
            var6 = method876() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2156 >> 2);
            var9 = (field2156 >> 2) + (var4 >> 2);
            var10 = field2156 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2156 >> 2);
            var12 = (field2156 >> 2) + (var4 - (var4 >> 2));
            var13 = field2156 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class89 var14 = field2150[field2174[var2]];
        int var15 = var14.field1413;
        int var16 = var14.field1412[var15];
        boolean var17 = !field2157[var16].method390();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1411; var19++) {
            class37 var20 = field2176[var14.field1410[var19]];
            float[] var21 = field2162;
            var20.method254(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field1413;
            int var23 = var14.field1412[var22];
            field2157[var23].method388(field2162, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field2162[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field2162;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field2165 : field2171;
            float[] var32 = var3 ? field2168 : field2175;
            float[] var33 = var3 ? field2167 : field2148;
            int[] var34 = var3 ? field2177 : field2154;
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
            int var47 = class55.method382(-66, var4 - 1);
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
                field2162[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2162[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field2166 > 0) {
            int var91 = this.field2166 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field2152) {
                for (int var92 = 0; var92 < this.field2169; var92++) {
                    int var93 = (this.field2166 >> 1) + var92;
                    var90[var92] += this.field2160[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field2162[var94];
                }
            }
        }
        float[] var96 = this.field2160;
        this.field2160 = field2162;
        field2162 = var96;
        this.field2166 = var4;
        this.field2169 = var12 - (var4 >> 1);
        this.field2152 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)I", line = 711)
    public static final int method880(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2149) {
            int var3 = 8 - field2149;
            int var4 = (0x1 << var3) - 1;
            var1 += (field2173[field2161] >> field2149 & var4) << var2;
            field2149 = 0;
            field2161++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field2173[field2161] >> field2149 & var5) << var2;
            field2149 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "([B)V", line = 743)
    private final void method881(byte[] arg0) {
        class249 var2 = new class249(arg0);
        this.field2178 = var2.method1738(-1756395344);
        this.field2172 = var2.method1738(-1756395344);
        this.field2159 = var2.method1738(-1756395344);
        this.field2158 = var2.method1738(-1756395344);
        if (this.field2158 < 0) {
            this.field2158 = ~this.field2158;
            this.field2155 = true;
        }
        int var3 = var2.method1738(-1756395344);
        this.field2153 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1731(true);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1711(0, var7, var5, 108);
            this.field2153[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lik;II)Lsk;", line = 787)
    public static final class127 method882(class262 arg0, int arg1, int arg2) {
        if (method875(arg0)) {
            byte[] var3 = arg0.method1868(12236, arg1, arg2);
            return var3 == null ? null : new class127(var3);
        } else {
            arg0.method1885(arg2, (byte) 124, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "([B)V", line = 803)
    private class127(byte[] arg0) {
        this.method881(arg0);
    }
}
