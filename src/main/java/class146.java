import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class146 extends class381 {

    @OriginalMember(owner = "client!la", name = "E", descriptor = "Z")
    private static boolean field2242 = false;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    private static int field2224;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    private static int field2227;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    private int field2228;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    private int field2231;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    private int field2232;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    private int field2233;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    private int field2234;

    @OriginalMember(owner = "client!la", name = "H", descriptor = "I")
    private int field2245;

    @OriginalMember(owner = "client!la", name = "I", descriptor = "I")
    private static int field2246;

    @OriginalMember(owner = "client!la", name = "M", descriptor = "I")
    private static int field2250;

    @OriginalMember(owner = "client!la", name = "O", descriptor = "I")
    private int field2252;

    @OriginalMember(owner = "client!la", name = "R", descriptor = "I")
    private int field2255;

    @OriginalMember(owner = "client!la", name = "K", descriptor = "Z")
    private boolean field2248;

    @OriginalMember(owner = "client!la", name = "L", descriptor = "Z")
    private boolean field2249;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "[B")
    private static byte[] field2225;

    @OriginalMember(owner = "client!la", name = "Q", descriptor = "[B")
    private byte[] field2254;

    @OriginalMember(owner = "client!la", name = "y", descriptor = "[F")
    private static float[] field2237;

    @OriginalMember(owner = "client!la", name = "z", descriptor = "[F")
    private float[] field2238;

    @OriginalMember(owner = "client!la", name = "B", descriptor = "[F")
    private static float[] field2239;

    @OriginalMember(owner = "client!la", name = "D", descriptor = "[F")
    private static float[] field2241;

    @OriginalMember(owner = "client!la", name = "F", descriptor = "[F")
    private static float[] field2243;

    @OriginalMember(owner = "client!la", name = "G", descriptor = "[F")
    private static float[] field2244;

    @OriginalMember(owner = "client!la", name = "J", descriptor = "[F")
    private static float[] field2247;

    @OriginalMember(owner = "client!la", name = "P", descriptor = "[F")
    private static float[] field2253;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "[I")
    private static int[] field2229;

    @OriginalMember(owner = "client!la", name = "T", descriptor = "[I")
    private static int[] field2256;

    @OriginalMember(owner = "client!la", name = "U", descriptor = "[I")
    private static int[] field2257;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "[Lsm;")
    private static class159[] field2230;

    @OriginalMember(owner = "client!la", name = "C", descriptor = "[Lin;")
    private static class182[] field2240;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "[Lhi;")
    public static class354[] field2226;

    @OriginalMember(owner = "client!la", name = "N", descriptor = "[Lbq;")
    private static class51[] field2251;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "[Z")
    private static boolean[] field2235;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "[[B")
    private byte[][] field2236;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lrk;)Z", line = 8)
    private static final boolean method1123(class427 arg0) {
        if (!field2242) {
            byte[] var1 = arg0.method2633(0, -1, 0);
            if (var1 == null) {
                return false;
            }
            method1132(var1);
            field2242 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "()I", line = 24)
    public static final int method1124() {
        int var0 = field2225[field2246] >> field2227 & 0x1;
        field2227++;
        field2246 += field2227 >> 3;
        field2227 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([B)V", line = 33)
    private final void method1125(byte[] arg0) {
        class289 var2 = new class289(arg0);
        this.field2228 = var2.method1856((byte) 22);
        this.field2232 = var2.method1856((byte) 51);
        this.field2233 = var2.method1856((byte) 115);
        this.field2234 = var2.method1856((byte) 106);
        if (this.field2234 < 0) {
            this.field2234 = ~this.field2234;
            this.field2249 = true;
        }
        int var3 = var2.method1856((byte) 101);
        this.field2236 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1861((byte) -72);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1882(-128, var5, 0, var7);
            this.field2236[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([BI)V", line = 75)
    private static final void method1126(byte[] arg0, int arg1) {
        field2225 = arg0;
        field2246 = arg1;
        field2227 = 0;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "()V", line = 91)
    public static void method1127() {
        field2225 = null;
        field2226 = null;
        field2240 = null;
        field2251 = null;
        field2230 = null;
        field2235 = null;
        field2257 = null;
        field2239 = null;
        field2247 = null;
        field2241 = null;
        field2237 = null;
        field2243 = null;
        field2244 = null;
        field2253 = null;
        field2229 = null;
        field2256 = null;
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)F", line = 114)
    public static final float method1128(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(I)I", line = 134)
    public static final int method1129(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2227) {
            int var4 = 8 - field2227;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2225[field2246] >> field2227 & var5) << var2;
            field2227 = 0;
            field2246++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2225[field2246] >> field2227 & var3) << var2;
            field2227 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lrk;II)Lla;", line = 161)
    public static final class146 method1130(class427 arg0, int arg1, int arg2) {
        if (method1123(arg0)) {
            byte[] var3 = arg0.method2633(arg2, -1, arg1);
            return var3 == null ? null : new class146(var3);
        } else {
            arg0.method2628((byte) 114, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "([B)V", line = 176)
    private class146(byte[] arg0) {
        this.method1125(arg0);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([I)Lkf;", line = 181)
    public final class294 method1131(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2254 == null) {
            this.field2245 = 0;
            this.field2238 = new float[field2224];
            this.field2254 = new byte[this.field2232];
            this.field2255 = 0;
            this.field2252 = 0;
        }
        while (this.field2252 < this.field2236.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1133(this.field2252);
            if (var3 != null) {
                int var4 = this.field2255;
                int var5 = var3.length;
                if (var5 > this.field2232 - var4) {
                    var5 = this.field2232 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2254[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2255;
                }
                this.field2255 = var4;
            }
            this.field2252++;
        }
        this.field2238 = null;
        byte[] var2 = this.field2254;
        this.field2254 = null;
        return new class294(this.field2228, var2, this.field2233, this.field2234, this.field2249);
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "([B)V", line = 242)
    private static final void method1132(byte[] arg0) {
        method1126(arg0, 0);
        field2250 = 0x1 << method1129(4);
        field2224 = 0x1 << method1129(4);
        field2239 = new float[field2224];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2250 : field2224;
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
            int var25 = class130.method1013(var17 - 1, 8);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class323.method2057(1, var25, var26);
            }
            if (var1 == 0) {
                field2247 = var18;
                field2241 = var20;
                field2237 = var22;
                field2229 = var24;
            } else {
                field2243 = var18;
                field2244 = var20;
                field2253 = var22;
                field2256 = var24;
            }
        }
        int var2 = method1129(8) + 1;
        field2226 = new class354[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2226[var3] = new class354();
        }
        int var4 = method1129(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1129(16);
        }
        int var6 = method1129(6) + 1;
        field2240 = new class182[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2240[var7] = new class182();
        }
        int var8 = method1129(6) + 1;
        field2251 = new class51[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2251[var9] = new class51();
        }
        int var10 = method1129(6) + 1;
        field2230 = new class159[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2230[var11] = new class159();
        }
        int var12 = method1129(6) + 1;
        field2235 = new boolean[var12];
        field2257 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2235[var13] = method1124() != 0;
            method1129(16);
            method1129(16);
            field2257[var13] = method1129(8);
        }
    }

    @OriginalMember(owner = "client!la", name = "e", descriptor = "(I)[F", line = 396)
    private final float[] method1133(int arg0) {
        method1126(this.field2236[arg0], 0);
        method1124();
        int var2 = method1129(class130.method1013(field2257.length - 1, 8));
        boolean var3 = field2235[var2];
        int var4 = var3 ? field2224 : field2250;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1124() != 0;
            var6 = method1124() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2250 >> 2);
            var9 = (field2250 >> 2) + (var4 >> 2);
            var10 = field2250 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2250 >> 2);
            var12 = (field2250 >> 2) + (var4 - (var4 >> 2));
            var13 = field2250 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class159 var14 = field2230[field2257[var2]];
        int var15 = var14.field2377;
        int var16 = var14.field2379[var15];
        boolean var17 = !field2240[var16].method1338();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2376; var19++) {
            class51 var95 = field2251[var14.field2378[var19]];
            float[] var96 = field2239;
            var95.method497(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2377;
            int var21 = var14.field2379[var20];
            field2240[var21].method1333(field2239, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2239[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2239;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2243 : field2247;
            float[] var30 = var3 ? field2244 : field2241;
            float[] var31 = var3 ? field2253 : field2237;
            int[] var32 = var3 ? field2256 : field2229;
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
            int var35 = class130.method1013(var4 - 1, 8);
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
                field2239[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2239[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2245 > 0) {
            int var49 = this.field2245 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2248) {
                for (int var50 = 0; var50 < this.field2231; var50++) {
                    int var51 = (this.field2245 >> 1) + var50;
                    var48[var50] += this.field2238[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2239[var52];
                }
            }
        }
        float[] var54 = this.field2238;
        this.field2238 = field2239;
        field2239 = var54;
        this.field2245 = var4;
        this.field2231 = var12 - (var4 >> 1);
        this.field2248 = var17;
        return var48;
    }
}
