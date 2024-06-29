import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class93 extends class146 {

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "Z")
    private static boolean field2149 = false;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    private int field2129;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "I")
    private int field2132;

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "I")
    private int field2139;

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "I")
    private int field2140;

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "I")
    private int field2141;

    @OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
    private static int field2145;

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "I")
    private int field2146;

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "I")
    private static int field2148;

    @OriginalMember(owner = "client!nc", name = "R", descriptor = "I")
    private int field2154;

    @OriginalMember(owner = "client!nc", name = "S", descriptor = "I")
    private static int field2155;

    @OriginalMember(owner = "client!nc", name = "T", descriptor = "I")
    private int field2156;

    @OriginalMember(owner = "client!nc", name = "Y", descriptor = "I")
    private static int field2161;

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "Z")
    private boolean field2135;

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "Z")
    private boolean field2137;

    @OriginalMember(owner = "client!nc", name = "U", descriptor = "[B")
    private static byte[] field2157;

    @OriginalMember(owner = "client!nc", name = "W", descriptor = "[B")
    private byte[] field2159;

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "[F")
    private static float[] field2133;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "[F")
    private float[] field2138;

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "[F")
    private static float[] field2142;

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "[F")
    private static float[] field2143;

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "[F")
    private static float[] field2144;

    @OriginalMember(owner = "client!nc", name = "O", descriptor = "[F")
    private static float[] field2151;

    @OriginalMember(owner = "client!nc", name = "P", descriptor = "[F")
    private static float[] field2152;

    @OriginalMember(owner = "client!nc", name = "X", descriptor = "[F")
    private static float[] field2160;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "[I")
    private static int[] field2131;

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "[I")
    private static int[] field2136;

    @OriginalMember(owner = "client!nc", name = "V", descriptor = "[I")
    private static int[] field2158;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "[Ltf;")
    private static class138[] field2134;

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "[Lwb;")
    private static class155[] field2147;

    @OriginalMember(owner = "client!nc", name = "N", descriptor = "[Lef;")
    public static class35[] field2150;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "[Ll;")
    private static class76[] field2130;

    @OriginalMember(owner = "client!nc", name = "Q", descriptor = "[Z")
    private static boolean[] field2153;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "[[B")
    private byte[][] field2128;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([B)V")
    private final void method730(byte[] arg0) {
        class66 var2 = new class66(arg0);
        this.field2129 = var2.method539(true);
        this.field2140 = var2.method539(true);
        this.field2141 = var2.method539(true);
        this.field2146 = var2.method539(true);
        if (this.field2146 < 0) {
            this.field2146 = ~this.field2146;
            this.field2135 = true;
        }
        int var3 = var2.method539(true);
        this.field2128 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method533(255);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method558(var5, 0, false, var7);
            this.field2128[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "([B)V")
    private static final void method731(byte[] arg0) {
        method737(arg0, 0);
        field2155 = 0x1 << method740(4);
        field2148 = 0x1 << method740(4);
        field2142 = new float[field2148];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2155 : field2148;
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
            int var25 = class147.method1101((byte) 110, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class23.method168(111, var26, var25);
            }
            if (var1 == 0) {
                field2133 = var18;
                field2143 = var20;
                field2152 = var22;
                field2136 = var24;
            } else {
                field2144 = var18;
                field2160 = var20;
                field2151 = var22;
                field2131 = var24;
            }
        }
        int var2 = method740(8) + 1;
        field2150 = new class35[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2150[var3] = new class35();
        }
        int var4 = method740(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method740(16);
        }
        int var6 = method740(6) + 1;
        field2130 = new class76[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2130[var7] = new class76();
        }
        int var8 = method740(6) + 1;
        field2134 = new class138[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2134[var9] = new class138();
        }
        int var10 = method740(6) + 1;
        field2147 = new class155[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2147[var11] = new class155();
        }
        int var12 = method740(6) + 1;
        field2153 = new boolean[var12];
        field2158 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2153[var13] = method733() != 0;
            method740(16);
            method740(16);
            field2158[var13] = method740(8);
        }
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)[F")
    private final float[] method732(int arg0) {
        method737(this.field2128[arg0], 0);
        method733();
        int var2 = method740(class147.method1101((byte) -48, field2158.length - 1));
        boolean var3 = field2153[var2];
        int var4 = var3 ? field2148 : field2155;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method733() != 0;
            var6 = method733() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2155 >> 2);
            var9 = (field2155 >> 2) + (var4 >> 2);
            var10 = field2155 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2155 >> 2);
            var12 = (field2155 >> 2) + (var4 - (var4 >> 2));
            var13 = field2155 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class155 var14 = field2147[field2158[var2]];
        int var15 = var14.field3556;
        int var16 = var14.field3555[var15];
        boolean var17 = !field2130[var16].method614();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field3554; var19++) {
            class138 var95 = field2134[var14.field3553[var19]];
            float[] var96 = field2142;
            var95.method1044(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field3556;
            int var21 = var14.field3555[var20];
            field2130[var21].method607(field2142, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2142[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2142;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2144 : field2133;
            float[] var30 = var3 ? field2160 : field2143;
            float[] var31 = var3 ? field2151 : field2152;
            int[] var32 = var3 ? field2131 : field2136;
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
            int var35 = class147.method1101((byte) -83, var4 - 1);
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
                field2142[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2142[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2139 > 0) {
            int var49 = this.field2139 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2137) {
                for (int var50 = 0; var50 < this.field2132; var50++) {
                    int var51 = (this.field2139 >> 1) + var50;
                    var48[var50] += this.field2138[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2142[var52];
                }
            }
        }
        float[] var54 = this.field2138;
        this.field2138 = field2142;
        field2142 = var54;
        this.field2139 = var4;
        this.field2132 = var12 - (var4 >> 1);
        this.field2137 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "()I")
    public static final int method733() {
        int var0 = field2157[field2145] >> field2161 & 0x1;
        field2161++;
        field2145 += field2161 >> 3;
        field2161 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([I)Lib;")
    public final class58 method734(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2159 == null) {
            this.field2139 = 0;
            this.field2138 = new float[field2148];
            this.field2159 = new byte[this.field2140];
            this.field2154 = 0;
            this.field2156 = 0;
        }
        while (this.field2156 < this.field2128.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method732(this.field2156);
            if (var3 != null) {
                int var4 = this.field2154;
                int var5 = var3.length;
                if (var5 > this.field2140 - var4) {
                    var5 = this.field2140 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2159[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2154;
                }
                this.field2154 = var4;
            }
            this.field2156++;
        }
        this.field2138 = null;
        byte[] var2 = this.field2159;
        this.field2159 = null;
        return new class58(this.field2129, var2, this.field2141, this.field2146, this.field2135);
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "()V")
    public static void method735() {
        field2157 = null;
        field2150 = null;
        field2130 = null;
        field2134 = null;
        field2147 = null;
        field2153 = null;
        field2158 = null;
        field2142 = null;
        field2133 = null;
        field2143 = null;
        field2152 = null;
        field2144 = null;
        field2160 = null;
        field2151 = null;
        field2136 = null;
        field2131 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lea;)Z")
    private static final boolean method736(class30 arg0) {
        if (!field2149) {
            byte[] var1 = arg0.method206(0, 0, -109);
            if (var1 == null) {
                return false;
            }
            method731(var1);
            field2149 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([BI)V")
    private static final void method737(byte[] arg0, int arg1) {
        field2157 = arg0;
        field2145 = arg1;
        field2161 = 0;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lea;II)Lnc;")
    public static final class93 method738(class30 arg0, int arg1, int arg2) {
        if (method736(arg0)) {
            byte[] var3 = arg0.method206(arg1, arg2, -87);
            return var3 == null ? null : new class93(var3);
        } else {
            arg0.method213(arg1, true, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)F")
    public static final float method739(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)I")
    public static final int method740(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2161) {
            int var4 = 8 - field2161;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2157[field2145] >> field2161 & var5) << var2;
            field2161 = 0;
            field2145++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2157[field2145] >> field2161 & var3) << var2;
            field2161 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "([B)V")
    private class93(byte[] arg0) {
        this.method730(arg0);
    }
}
