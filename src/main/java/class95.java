import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class95 {

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "Z")
    private static boolean field2169 = false;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    private static int field2156;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    private int field2159;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    private static int field2160;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    private int field2164;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    private int field2165;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    private static int field2166;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    private static int field2171;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
    private static int field2174;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
    private static int field2176;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "I")
    private int field2185;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "Z")
    private boolean field2178;

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "Z")
    private static boolean field2183;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "[B")
    private static byte[] field2161;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "[F")
    private static float[] field2155;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "[F")
    private static float[] field2157;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "[F")
    private static float[] field2163;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "[F")
    private static float[] field2168;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "[F")
    private static float[] field2173;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "[F")
    private static float[] field2175;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "[F")
    private static float[] field2177;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "[F")
    private static float[] field2179;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "[I")
    private static int[] field2162;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "[I")
    private static int[] field2167;

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "[I")
    private static int[] field2181;

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "[Lvd;")
    public static class144[] field2184;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "[Lfd;")
    private static class40[] field2182;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "[Lk;")
    private static class69[] field2158;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "[Lmf;")
    private static class89[] field2172;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "[Z")
    private static boolean[] field2180;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "[[B")
    private byte[][] field2170;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "()Lr;")
    public final class116 method755() {
        field2174 = 0;
        byte[] var1 = new byte[this.field2164];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2170.length; var3++) {
            float[] var4 = this.method764(var3);
            if (var4 != null) {
                int var5 = var4.length;
                if (var5 > this.field2164 - var2) {
                    var5 = this.field2164 - var2;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var4[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    var1[var2++] = (byte) (var7 - 128);
                }
            }
        }
        return new class116(this.field2185, var1, this.field2165, this.field2159, this.field2178);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([BI)V")
    private static final void method756(byte[] arg0, int arg1) {
        field2161 = arg0;
        field2156 = arg1;
        field2160 = 0;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "()V")
    public static void method757() {
        field2161 = null;
        field2184 = null;
        field2172 = null;
        field2182 = null;
        field2158 = null;
        field2180 = null;
        field2167 = null;
        field2175 = null;
        field2157 = null;
        field2168 = null;
        field2163 = null;
        field2179 = null;
        field2155 = null;
        field2173 = null;
        field2177 = null;
        field2181 = null;
        field2162 = null;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "()I")
    public static final int method758() {
        int var0 = field2161[field2156] >> field2160 & 0x1;
        field2160++;
        field2156 += field2160 >> 3;
        field2160 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ltb;)Z")
    private static final boolean method759(class130 arg0) {
        if (!field2169) {
            byte[] var1 = arg0.method1058(0, 92, 0);
            if (var1 == null) {
                return false;
            }
            method765(var1);
            field2169 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)F")
    public static final float method760(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)I")
    public static final int method761(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2160) {
            int var4 = 8 - field2160;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2161[field2156] >> field2160 & var5) << var2;
            field2160 = 0;
            field2156++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2161[field2156] >> field2160 & var3) << var2;
            field2160 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([B)V")
    private final void method762(byte[] arg0) {
        class8 var2 = new class8(arg0);
        this.field2185 = var2.method70(false);
        this.field2164 = var2.method70(false);
        this.field2165 = var2.method70(false);
        this.field2159 = var2.method70(false);
        if (this.field2159 < 0) {
            this.field2159 = ~this.field2159;
            this.field2178 = true;
        }
        int var3 = var2.method70(false);
        this.field2170 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method62((byte) 84);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method97(-46, 0, var7, var5);
            this.field2170[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ltb;I)Lne;")
    public static final class95 method763(class130 arg0, int arg1) {
        if (method759(arg0)) {
            byte[] var2 = arg0.method1066(118, arg1);
            return var2 == null ? null : new class95(var2);
        } else {
            arg0.method1070(-123, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)[F")
    private final float[] method764(int arg0) {
        method756(this.field2170[arg0], 0);
        method758();
        int var2 = method761(class129.method1032(0, field2167.length - 1));
        boolean var3 = field2180[var2];
        int var4 = var3 ? field2171 : field2166;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method758() != 0;
            var6 = method758() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2166 >> 2);
            var9 = (field2166 >> 2) + (var4 >> 2);
            var10 = field2166 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2166 >> 2);
            var12 = (field2166 >> 2) + (var4 - (var4 >> 2));
            var13 = field2166 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class69 var14 = field2158[field2167[var2]];
        int var15 = var14.field1438;
        int var16 = var14.field1439[var15];
        boolean var17 = !field2172[var16].method728();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1437; var19++) {
            class40 var95 = field2182[var14.field1436[var19]];
            float[] var96 = field2157;
            var95.method354(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field1438;
            int var21 = var14.field1439[var20];
            field2172[var21].method726(field2157, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2157[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2157;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2155 : field2168;
            float[] var30 = var3 ? field2173 : field2163;
            float[] var31 = var3 ? field2177 : field2179;
            int[] var32 = var3 ? field2162 : field2181;
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
            int var35 = class129.method1032(0, var4 - 1);
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
                field2157[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2157[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (field2174 > 0) {
            int var49 = field2174 + var4 >> 2;
            var48 = new float[var49];
            if (!field2183) {
                for (int var50 = 0; var50 < field2176; var50++) {
                    int var51 = (field2174 >> 1) + var50;
                    var48[var50] += field2175[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2157[var52];
                }
            }
        }
        float[] var54 = field2175;
        field2175 = field2157;
        field2157 = var54;
        field2174 = var4;
        field2176 = var12 - (var4 >> 1);
        field2183 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([B)V")
    private class95(byte[] arg0) {
        this.method762(arg0);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "([B)V")
    private static final void method765(byte[] arg0) {
        method756(arg0, 0);
        field2166 = 0x1 << method761(4);
        field2171 = 0x1 << method761(4);
        field2157 = new float[field2171];
        field2175 = new float[field2171];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2166 : field2171;
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
            int var25 = class129.method1032(0, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class105.method884((byte) -110, var25, var26);
            }
            if (var1 == 0) {
                field2168 = var18;
                field2163 = var20;
                field2179 = var22;
                field2181 = var24;
            } else {
                field2155 = var18;
                field2173 = var20;
                field2177 = var22;
                field2162 = var24;
            }
        }
        int var2 = method761(8) + 1;
        field2184 = new class144[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2184[var3] = new class144();
        }
        int var4 = method761(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method761(16);
        }
        int var6 = method761(6) + 1;
        field2172 = new class89[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2172[var7] = new class89();
        }
        int var8 = method761(6) + 1;
        field2182 = new class40[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2182[var9] = new class40();
        }
        int var10 = method761(6) + 1;
        field2158 = new class69[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2158[var11] = new class69();
        }
        int var12 = method761(6) + 1;
        field2180 = new boolean[var12];
        field2167 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2180[var13] = method758() != 0;
            method761(16);
            method761(16);
            field2167[var13] = method761(8);
        }
    }
}
