import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dfa")
public class class163 extends class189 {

    @OriginalMember(owner = "client!dfa", name = "x", descriptor = "Z")
    private static boolean field2228 = false;

    @OriginalMember(owner = "client!dfa", name = "l", descriptor = "I")
    private static int field2216;

    @OriginalMember(owner = "client!dfa", name = "n", descriptor = "I")
    private int field2218;

    @OriginalMember(owner = "client!dfa", name = "o", descriptor = "I")
    private int field2219;

    @OriginalMember(owner = "client!dfa", name = "p", descriptor = "I")
    private int field2220;

    @OriginalMember(owner = "client!dfa", name = "t", descriptor = "I")
    private int field2224;

    @OriginalMember(owner = "client!dfa", name = "y", descriptor = "I")
    private int field2229;

    @OriginalMember(owner = "client!dfa", name = "A", descriptor = "I")
    private int field2231;

    @OriginalMember(owner = "client!dfa", name = "F", descriptor = "I")
    private static int field2236;

    @OriginalMember(owner = "client!dfa", name = "K", descriptor = "I")
    private static int field2241;

    @OriginalMember(owner = "client!dfa", name = "N", descriptor = "I")
    private static int field2244;

    @OriginalMember(owner = "client!dfa", name = "O", descriptor = "I")
    private int field2245;

    @OriginalMember(owner = "client!dfa", name = "Q", descriptor = "I")
    private int field2247;

    @OriginalMember(owner = "client!dfa", name = "k", descriptor = "Z")
    private boolean field2215;

    @OriginalMember(owner = "client!dfa", name = "E", descriptor = "Z")
    private boolean field2235;

    @OriginalMember(owner = "client!dfa", name = "G", descriptor = "[B")
    private static byte[] field2237;

    @OriginalMember(owner = "client!dfa", name = "P", descriptor = "[B")
    private byte[] field2246;

    @OriginalMember(owner = "client!dfa", name = "j", descriptor = "[F")
    private static float[] field2214;

    @OriginalMember(owner = "client!dfa", name = "q", descriptor = "[F")
    private static float[] field2221;

    @OriginalMember(owner = "client!dfa", name = "s", descriptor = "[F")
    private float[] field2223;

    @OriginalMember(owner = "client!dfa", name = "z", descriptor = "[F")
    private static float[] field2230;

    @OriginalMember(owner = "client!dfa", name = "C", descriptor = "[F")
    private static float[] field2233;

    @OriginalMember(owner = "client!dfa", name = "H", descriptor = "[F")
    private static float[] field2238;

    @OriginalMember(owner = "client!dfa", name = "I", descriptor = "[F")
    private static float[] field2239;

    @OriginalMember(owner = "client!dfa", name = "L", descriptor = "[F")
    private static float[] field2242;

    @OriginalMember(owner = "client!dfa", name = "r", descriptor = "[I")
    private static int[] field2222;

    @OriginalMember(owner = "client!dfa", name = "D", descriptor = "[I")
    private static int[] field2234;

    @OriginalMember(owner = "client!dfa", name = "M", descriptor = "[I")
    private static int[] field2243;

    @OriginalMember(owner = "client!dfa", name = "u", descriptor = "[Lej;")
    private static class121[] field2225;

    @OriginalMember(owner = "client!dfa", name = "v", descriptor = "[Lwb;")
    public static class329[] field2226;

    @OriginalMember(owner = "client!dfa", name = "w", descriptor = "[Lom;")
    private static class372[] field2227;

    @OriginalMember(owner = "client!dfa", name = "m", descriptor = "[Lhl;")
    private static class528[] field2217;

    @OriginalMember(owner = "client!dfa", name = "B", descriptor = "[Z")
    private static boolean[] field2232;

    @OriginalMember(owner = "client!dfa", name = "J", descriptor = "[[B")
    private byte[][] field2240;

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lfp;I)Ldfa;", line = 4)
    public static final class163 method1068(class323 arg0, int arg1) {
        if (method1074(arg0)) {
            byte[] var2 = arg0.method2108(arg1, 0);
            return var2 == null ? null : new class163(var2);
        } else {
            arg0.method2088(arg1, -36);
            return null;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(I)F", line = 22)
    public static final float method1069(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "()I", line = 34)
    public static final int method1070() {
        int var0 = field2237[field2216] >> field2244 & 0x1;
        field2244++;
        field2216 += field2244 >> 3;
        field2244 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "([BI)V", line = 42)
    private static final void method1071(byte[] arg0, int arg1) {
        field2237 = arg0;
        field2216 = arg1;
        field2244 = 0;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "([B)V", line = 49)
    private final void method1072(byte[] arg0) {
        class675 var2 = new class675(arg0);
        this.field2224 = var2.method3703(102);
        this.field2219 = var2.method3703(106);
        this.field2218 = var2.method3703(92);
        this.field2231 = var2.method3703(109);
        if (this.field2231 < 0) {
            this.field2231 = ~this.field2231;
            this.field2235 = true;
        }
        int var3 = var2.method3703(107);
        this.field2240 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method3750((byte) 35);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method3723(var7, 4, var5, 0);
            this.field2240[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "(I)[F", line = 92)
    private final float[] method1073(int arg0) {
        method1071(this.field2240[arg0], 0);
        method1070();
        int var2 = method1077(class378.method2374((byte) 111, field2243.length - 1));
        boolean var3 = field2232[var2];
        int var4 = var3 ? field2236 : field2241;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1070() != 0;
            var6 = method1070() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2241 >> 2);
            var9 = (field2241 >> 2) + (var4 >> 2);
            var10 = field2241 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2241 >> 2);
            var12 = (field2241 >> 2) + (var4 - (var4 >> 2));
            var13 = field2241 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class372 var14 = field2227[field2243[var2]];
        int var15 = var14.field5225;
        int var16 = var14.field5226[var15];
        boolean var17 = !field2217[var16].method3075();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field5227; var19++) {
            class121 var95 = field2225[var14.field5224[var19]];
            float[] var96 = field2242;
            var95.method829(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field5225;
            int var21 = var14.field5226[var20];
            field2217[var21].method3073(field2242, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2242[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2242;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2221 : field2214;
            float[] var30 = var3 ? field2230 : field2233;
            float[] var31 = var3 ? field2239 : field2238;
            int[] var32 = var3 ? field2222 : field2234;
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
            int var35 = class378.method2374((byte) 102, var4 - 1);
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
                field2242[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2242[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2220 > 0) {
            int var49 = this.field2220 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2215) {
                for (int var50 = 0; var50 < this.field2229; var50++) {
                    int var51 = (this.field2220 >> 1) + var50;
                    var48[var50] += this.field2223[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2242[var52];
                }
            }
        }
        float[] var54 = this.field2223;
        this.field2223 = field2242;
        field2242 = var54;
        this.field2220 = var4;
        this.field2229 = var12 - (var4 >> 1);
        this.field2215 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lfp;)Z", line = 504)
    private static final boolean method1074(class323 arg0) {
        if (!field2228) {
            byte[] var1 = arg0.method2100(0, (byte) 112, 0);
            if (var1 == null) {
                return false;
            }
            method1079(var1);
        }
        return true;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lfp;II)Ldfa;", line = 517)
    public static final class163 method1075(class323 arg0, int arg1, int arg2) {
        if (method1074(arg0)) {
            byte[] var3 = arg0.method2100(arg2, (byte) 112, arg1);
            return var3 == null ? null : new class163(var3);
        } else {
            arg0.method2097((byte) -107, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "()V", line = 542)
    public static void method1076() {
        field2237 = null;
        field2226 = null;
        field2217 = null;
        field2225 = null;
        field2227 = null;
        field2232 = null;
        field2243 = null;
        field2242 = null;
        field2214 = null;
        field2233 = null;
        field2238 = null;
        field2221 = null;
        field2230 = null;
        field2239 = null;
        field2234 = null;
        field2222 = null;
    }

    @OriginalMember(owner = "client!dfa", name = "c", descriptor = "(I)I", line = 561)
    public static final int method1077(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2244) {
            int var4 = 8 - field2244;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2237[field2216] >> field2244 & var5) << var2;
            field2244 = 0;
            field2216++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2237[field2216] >> field2244 & var3) << var2;
            field2244 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!dfa", name = "a", descriptor = "([I)Lnp;", line = 593)
    public final class490 method1078(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2246 == null) {
            this.field2220 = 0;
            this.field2223 = new float[field2236];
            this.field2246 = new byte[this.field2219];
            this.field2247 = 0;
            this.field2245 = 0;
        }
        while (this.field2245 < this.field2240.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1073(this.field2245);
            if (var3 != null) {
                int var4 = this.field2247;
                int var5 = var3.length;
                if (var5 > this.field2219 - var4) {
                    var5 = this.field2219 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2246[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2247;
                }
                this.field2247 = var4;
            }
            this.field2245++;
        }
        this.field2223 = null;
        byte[] var2 = this.field2246;
        this.field2246 = null;
        return new class490(this.field2224, var2, this.field2218, this.field2231, this.field2235);
    }

    @OriginalMember(owner = "client!dfa", name = "b", descriptor = "([B)V", line = 655)
    private static final void method1079(byte[] arg0) {
        method1071(arg0, 0);
        field2241 = 0x1 << method1077(4);
        field2236 = 0x1 << method1077(4);
        field2242 = new float[field2236];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2241 : field2236;
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
            int var25 = class378.method2374((byte) 71, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class723.method4058((byte) 61, var25, var26);
            }
            if (var1 == 0) {
                field2214 = var18;
                field2233 = var20;
                field2238 = var22;
                field2234 = var24;
            } else {
                field2221 = var18;
                field2230 = var20;
                field2239 = var22;
                field2222 = var24;
            }
        }
        int var2 = method1077(8) + 1;
        field2226 = new class329[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2226[var3] = new class329();
        }
        int var4 = method1077(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1077(16);
        }
        int var6 = method1077(6) + 1;
        field2217 = new class528[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2217[var7] = new class528();
        }
        int var8 = method1077(6) + 1;
        field2225 = new class121[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2225[var9] = new class121();
        }
        int var10 = method1077(6) + 1;
        field2227 = new class372[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2227[var11] = new class372();
        }
        int var12 = method1077(6) + 1;
        field2232 = new boolean[var12];
        field2243 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2232[var13] = method1070() != 0;
            method1077(16);
            method1077(16);
            field2243[var13] = method1077(8);
        }
        field2228 = true;
    }

    @OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "([B)V", line = 817)
    private class163(byte[] arg0) {
        this.method1072(arg0);
    }
}
