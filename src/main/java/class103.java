import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class103 extends class12 {

    @OriginalMember(owner = "client!of", name = "V", descriptor = "Z")
    private static boolean field2180 = false;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    private static int field2154;

    @OriginalMember(owner = "client!of", name = "x", descriptor = "I")
    private static int field2157;

    @OriginalMember(owner = "client!of", name = "A", descriptor = "I")
    private int field2160;

    @OriginalMember(owner = "client!of", name = "B", descriptor = "I")
    private int field2161;

    @OriginalMember(owner = "client!of", name = "H", descriptor = "I")
    private int field2166;

    @OriginalMember(owner = "client!of", name = "J", descriptor = "I")
    private int field2168;

    @OriginalMember(owner = "client!of", name = "N", descriptor = "I")
    private int field2172;

    @OriginalMember(owner = "client!of", name = "R", descriptor = "I")
    private static int field2176;

    @OriginalMember(owner = "client!of", name = "S", descriptor = "I")
    private int field2177;

    @OriginalMember(owner = "client!of", name = "T", descriptor = "I")
    private static int field2178;

    @OriginalMember(owner = "client!of", name = "Y", descriptor = "I")
    private int field2183;

    @OriginalMember(owner = "client!of", name = "ab", descriptor = "I")
    private int field2185;

    @OriginalMember(owner = "client!of", name = "v", descriptor = "Z")
    private boolean field2155;

    @OriginalMember(owner = "client!of", name = "U", descriptor = "Z")
    private boolean field2179;

    @OriginalMember(owner = "client!of", name = "y", descriptor = "[B")
    private static byte[] field2158;

    @OriginalMember(owner = "client!of", name = "Z", descriptor = "[B")
    private byte[] field2184;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "[F")
    private static float[] field2153;

    @OriginalMember(owner = "client!of", name = "z", descriptor = "[F")
    private static float[] field2159;

    @OriginalMember(owner = "client!of", name = "F", descriptor = "[F")
    private static float[] field2165;

    @OriginalMember(owner = "client!of", name = "I", descriptor = "[F")
    private static float[] field2167;

    @OriginalMember(owner = "client!of", name = "L", descriptor = "[F")
    private static float[] field2170;

    @OriginalMember(owner = "client!of", name = "O", descriptor = "[F")
    private float[] field2173;

    @OriginalMember(owner = "client!of", name = "Q", descriptor = "[F")
    private static float[] field2175;

    @OriginalMember(owner = "client!of", name = "W", descriptor = "[F")
    private static float[] field2181;

    @OriginalMember(owner = "client!of", name = "D", descriptor = "[I")
    private static int[] field2163;

    @OriginalMember(owner = "client!of", name = "K", descriptor = "[I")
    private static int[] field2169;

    @OriginalMember(owner = "client!of", name = "P", descriptor = "[I")
    private static int[] field2174;

    @OriginalMember(owner = "client!of", name = "M", descriptor = "[Lsd;")
    private static class129[] field2171;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "[Lfd;")
    private static class40[] field2152;

    @OriginalMember(owner = "client!of", name = "X", descriptor = "[Lhe;")
    private static class54[] field2182;

    @OriginalMember(owner = "client!of", name = "E", descriptor = "[Li;")
    public static class56[] field2164;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "[Z")
    private static boolean[] field2156;

    @OriginalMember(owner = "client!of", name = "C", descriptor = "[[B")
    private byte[][] field2162;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lna;II)Lof;")
    public static final class103 method824(class91 arg0, int arg1, int arg2) {
        if (method826(arg0)) {
            byte[] var3 = arg0.method742(arg2, -15, arg1);
            return var3 == null ? null : new class103(var3);
        } else {
            arg0.method746(0, arg1, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "([BI)V")
    private static final void method825(byte[] arg0, int arg1) {
        field2158 = arg0;
        field2176 = arg1;
        field2154 = 0;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lna;)Z")
    private static final boolean method826(class91 arg0) {
        if (!field2180) {
            byte[] var1 = arg0.method742(0, -36, 0);
            if (var1 == null) {
                return false;
            }
            method833(var1);
            field2180 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "([I)Lhb;")
    public final class51 method827(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2184 == null) {
            this.field2161 = 0;
            this.field2173 = new float[field2157];
            this.field2184 = new byte[this.field2160];
            this.field2185 = 0;
            this.field2183 = 0;
        }
        while (this.field2183 < this.field2162.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method829(this.field2183);
            if (var3 != null) {
                int var4 = this.field2185;
                int var5 = var3.length;
                if (var5 > this.field2160 - var4) {
                    var5 = this.field2160 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2184[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2185;
                }
                this.field2185 = var4;
            }
            this.field2183++;
        }
        this.field2173 = null;
        byte[] var2 = this.field2184;
        this.field2184 = null;
        return new class51(this.field2177, var2, this.field2166, this.field2168, this.field2155);
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)F")
    public static final float method828(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)[F")
    private final float[] method829(int arg0) {
        method825(this.field2162[arg0], 0);
        method832();
        int var2 = method830(class124.method1009(17613, field2174.length - 1));
        boolean var3 = field2156[var2];
        int var4 = var3 ? field2157 : field2178;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method832() != 0;
            var6 = method832() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2178 >> 2);
            var9 = (field2178 >> 2) + (var4 >> 2);
            var10 = field2178 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2178 >> 2);
            var12 = (field2178 >> 2) + (var4 - (var4 >> 2));
            var13 = field2178 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class40 var14 = field2152[field2174[var2]];
        int var15 = var14.field841;
        int var16 = var14.field842[var15];
        boolean var17 = !field2171[var16].method1042();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field843; var19++) {
            class54 var95 = field2182[var14.field840[var19]];
            float[] var96 = field2175;
            var95.method436(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field841;
            int var21 = var14.field842[var20];
            field2171[var21].method1044(field2175, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2175[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2175;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2181 : field2159;
            float[] var30 = var3 ? field2167 : field2170;
            float[] var31 = var3 ? field2165 : field2153;
            int[] var32 = var3 ? field2169 : field2163;
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
            int var35 = class124.method1009(17613, var4 - 1);
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
                field2175[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2175[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2161 > 0) {
            int var49 = this.field2161 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2179) {
                for (int var50 = 0; var50 < this.field2172; var50++) {
                    int var51 = (this.field2161 >> 1) + var50;
                    var48[var50] += this.field2173[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2175[var52];
                }
            }
        }
        float[] var54 = this.field2173;
        this.field2173 = field2175;
        field2175 = var54;
        this.field2161 = var4;
        this.field2172 = var12 - (var4 >> 1);
        this.field2179 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(I)I")
    public static final int method830(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2154) {
            int var4 = 8 - field2154;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2158[field2176] >> field2154 & var5) << var2;
            field2154 = 0;
            field2176++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2158[field2176] >> field2154 & var3) << var2;
            field2154 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "()V")
    public static void method831() {
        field2158 = null;
        field2164 = null;
        field2171 = null;
        field2182 = null;
        field2152 = null;
        field2156 = null;
        field2174 = null;
        field2175 = null;
        field2159 = null;
        field2170 = null;
        field2153 = null;
        field2181 = null;
        field2167 = null;
        field2165 = null;
        field2163 = null;
        field2169 = null;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "()I")
    public static final int method832() {
        int var0 = field2158[field2176] >> field2154 & 0x1;
        field2154++;
        field2176 += field2154 >> 3;
        field2154 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "([B)V")
    private static final void method833(byte[] arg0) {
        method825(arg0, 0);
        field2178 = 0x1 << method830(4);
        field2157 = 0x1 << method830(4);
        field2175 = new float[field2157];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2178 : field2157;
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
            int var25 = class124.method1009(17613, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class4.method29((byte) 8, var25, var26);
            }
            if (var1 == 0) {
                field2159 = var18;
                field2170 = var20;
                field2153 = var22;
                field2163 = var24;
            } else {
                field2181 = var18;
                field2167 = var20;
                field2165 = var22;
                field2169 = var24;
            }
        }
        int var2 = method830(8) + 1;
        field2164 = new class56[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2164[var3] = new class56();
        }
        int var4 = method830(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method830(16);
        }
        int var6 = method830(6) + 1;
        field2171 = new class129[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2171[var7] = new class129();
        }
        int var8 = method830(6) + 1;
        field2182 = new class54[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2182[var9] = new class54();
        }
        int var10 = method830(6) + 1;
        field2152 = new class40[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2152[var11] = new class40();
        }
        int var12 = method830(6) + 1;
        field2156 = new boolean[var12];
        field2174 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2156[var13] = method832() != 0;
            method830(16);
            method830(16);
            field2174[var13] = method830(8);
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "([B)V")
    private class103(byte[] arg0) {
        this.method834(arg0);
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "([B)V")
    private final void method834(byte[] arg0) {
        class13 var2 = new class13(arg0);
        this.field2177 = var2.method112(false);
        this.field2160 = var2.method112(false);
        this.field2166 = var2.method112(false);
        this.field2168 = var2.method112(false);
        if (this.field2168 < 0) {
            this.field2168 = ~this.field2168;
            this.field2155 = true;
        }
        int var3 = var2.method112(false);
        this.field2162 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method142(27467);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method119(var7, (byte) 69, var5, 0);
            this.field2162[var4] = var7;
        }
    }
}
