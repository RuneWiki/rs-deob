import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class302 extends class206 {

    @OriginalMember(owner = "client!nh", name = "V", descriptor = "Z")
    private static boolean field5218 = false;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
    private int field5190;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
    private static int field5191;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
    private int field5192;

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "I")
    private static int field5206;

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "I")
    private int field5208;

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "I")
    private int field5212;

    @OriginalMember(owner = "client!nh", name = "Q", descriptor = "I")
    private static int field5213;

    @OriginalMember(owner = "client!nh", name = "S", descriptor = "I")
    private static int field5215;

    @OriginalMember(owner = "client!nh", name = "U", descriptor = "I")
    private int field5217;

    @OriginalMember(owner = "client!nh", name = "W", descriptor = "I")
    private int field5219;

    @OriginalMember(owner = "client!nh", name = "Y", descriptor = "I")
    private int field5221;

    @OriginalMember(owner = "client!nh", name = "Z", descriptor = "I")
    private int field5222;

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "Z")
    private boolean field5198;

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "Z")
    private boolean field5202;

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "[B")
    private static byte[] field5200;

    @OriginalMember(owner = "client!nh", name = "ab", descriptor = "[B")
    private byte[] field5223;

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "[F")
    private static float[] field5199;

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "[F")
    private static float[] field5201;

    @OriginalMember(owner = "client!nh", name = "G", descriptor = "[F")
    private static float[] field5203;

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "[F")
    private static float[] field5204;

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "[F")
    private static float[] field5207;

    @OriginalMember(owner = "client!nh", name = "M", descriptor = "[F")
    private float[] field5209;

    @OriginalMember(owner = "client!nh", name = "N", descriptor = "[F")
    private static float[] field5210;

    @OriginalMember(owner = "client!nh", name = "O", descriptor = "[F")
    private static float[] field5211;

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "[I")
    private static int[] field5193;

    @OriginalMember(owner = "client!nh", name = "I", descriptor = "[I")
    private static int[] field5205;

    @OriginalMember(owner = "client!nh", name = "X", descriptor = "[I")
    private static int[] field5220;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "[Lqh;")
    private static class139[] field5194;

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "[Lfk;")
    private static class51[] field5197;

    @OriginalMember(owner = "client!nh", name = "T", descriptor = "[Lkk;")
    private static class65[] field5216;

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "[Ldj;")
    public static class88[] field5195;

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "[Z")
    private static boolean[] field5196;

    @OriginalMember(owner = "client!nh", name = "R", descriptor = "[[B")
    private byte[][] field5214;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "()I", line = 4)
    public static final int method2067() {
        int var0 = field5200[field5215] >> field5213 & 0x1;
        field5213++;
        field5215 += field5213 >> 3;
        field5213 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)[F", line = 13)
    private final float[] method2068(int arg0) {
        method2072(this.field5214[arg0], 0);
        method2067();
        int var2 = method2070(class125.method948(field5205.length - 1, 2));
        boolean var3 = field5196[var2];
        int var4 = var3 ? field5206 : field5191;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2067() != 0;
            var6 = method2067() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field5191 >> 2);
            var9 = (field5191 >> 2) + (var4 >> 2);
            var10 = field5191 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field5191 >> 2);
            var12 = (field5191 >> 2) + (var4 - (var4 >> 2));
            var13 = field5191 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class51 var14 = field5197[field5205[var2]];
        int var15 = var14.field735;
        int var16 = var14.field734[var15];
        boolean var17 = !field5216[var16].method465();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field736; var19++) {
            class139 var20 = field5194[var14.field733[var19]];
            float[] var21 = field5203;
            var20.method1044(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field735;
            int var23 = var14.field734[var22];
            field5216[var23].method469(field5203, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field5203[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field5203;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field5204 : field5210;
            float[] var32 = var3 ? field5207 : field5211;
            float[] var33 = var3 ? field5201 : field5199;
            int[] var34 = var3 ? field5193 : field5220;
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
            int var47 = class125.method948(var4 - 1, 2);
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
                field5203[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field5203[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field5217 > 0) {
            int var91 = this.field5217 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field5202) {
                for (int var92 = 0; var92 < this.field5192; var92++) {
                    int var93 = (this.field5217 >> 1) + var92;
                    var90[var92] += this.field5209[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field5203[var94];
                }
            }
        }
        float[] var96 = this.field5209;
        this.field5209 = field5203;
        field5203 = var96;
        this.field5217 = var4;
        this.field5192 = var12 - (var4 >> 1);
        this.field5202 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lhi;)Z", line = 426)
    private static final boolean method2069(class26 arg0) {
        if (!field5218) {
            byte[] var1 = arg0.method157(0, 0, (byte) 19);
            if (var1 == null) {
                return false;
            }
            method2071(var1);
            field5218 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)I", line = 442)
    public static final int method2070(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field5213) {
            int var3 = 8 - field5213;
            int var4 = (0x1 << var3) - 1;
            var1 += (field5200[field5215] >> field5213 & var4) << var2;
            field5213 = 0;
            field5215++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field5200[field5215] >> field5213 & var5) << var2;
            field5213 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([B)V", line = 483)
    private static final void method2071(byte[] arg0) {
        method2072(arg0, 0);
        field5191 = 0x1 << method2070(4);
        field5206 = 0x1 << method2070(4);
        field5203 = new float[field5206];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field5191 : field5206;
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
            int var13 = class125.method948(var5 - 1, 2);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class170.method1221(var14, var13, (byte) -98);
            }
            if (var1 == 0) {
                field5210 = var6;
                field5211 = var8;
                field5199 = var10;
                field5220 = var12;
            } else {
                field5204 = var6;
                field5207 = var8;
                field5201 = var10;
                field5193 = var12;
            }
        }
        int var15 = method2070(8) + 1;
        field5195 = new class88[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field5195[var16] = new class88();
        }
        int var17 = method2070(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method2070(16);
        }
        int var19 = method2070(6) + 1;
        field5216 = new class65[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field5216[var20] = new class65();
        }
        int var21 = method2070(6) + 1;
        field5194 = new class139[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field5194[var22] = new class139();
        }
        int var23 = method2070(6) + 1;
        field5197 = new class51[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field5197[var24] = new class51();
        }
        int var25 = method2070(6) + 1;
        field5196 = new boolean[var25];
        field5205 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field5196[var26] = method2067() != 0;
            method2070(16);
            method2070(16);
            field5205[var26] = method2070(8);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([BI)V", line = 635)
    private static final void method2072(byte[] arg0, int arg1) {
        field5200 = arg0;
        field5215 = arg1;
        field5213 = 0;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "()V", line = 641)
    public static void method2073() {
        field5200 = null;
        field5195 = null;
        field5216 = null;
        field5194 = null;
        field5197 = null;
        field5196 = null;
        field5205 = null;
        field5203 = null;
        field5210 = null;
        field5211 = null;
        field5199 = null;
        field5204 = null;
        field5207 = null;
        field5201 = null;
        field5220 = null;
        field5193 = null;
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)F", line = 665)
    public static final float method2074(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([I)Ljf;", line = 683)
    public final class9 method2075(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field5223 == null) {
            this.field5217 = 0;
            this.field5209 = new float[field5206];
            this.field5223 = new byte[this.field5212];
            this.field5221 = 0;
            this.field5222 = 0;
        }
        while (this.field5222 < this.field5214.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method2068(this.field5222);
            if (var2 != null) {
                int var3 = this.field5221;
                int var4 = var2.length;
                if (var4 > this.field5212 - var3) {
                    var4 = this.field5212 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field5223[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field5221;
                }
                this.field5221 = var3;
            }
            this.field5222++;
        }
        this.field5209 = null;
        byte[] var7 = this.field5223;
        this.field5223 = null;
        return new class9(this.field5190, var7, this.field5208, this.field5219, this.field5198);
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "([B)V", line = 742)
    private class302(byte[] arg0) {
        this.method2076(arg0);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "([B)V", line = 748)
    private final void method2076(byte[] arg0) {
        class92 var2 = new class92(arg0);
        this.field5190 = var2.method704(1509947792);
        this.field5212 = var2.method704(1509947792);
        this.field5208 = var2.method704(1509947792);
        this.field5219 = var2.method704(1509947792);
        if (this.field5219 < 0) {
            this.field5219 = ~this.field5219;
            this.field5198 = true;
        }
        int var3 = var2.method704(1509947792);
        this.field5214 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method702(-1);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method740(var5, 0, var7, true);
            this.field5214[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lhi;II)Lnh;", line = 794)
    public static final class302 method2077(class26 arg0, int arg1, int arg2) {
        if (method2069(arg0)) {
            byte[] var3 = arg0.method157(arg2, arg1, (byte) 19);
            return var3 == null ? null : new class302(var3);
        } else {
            arg0.method152(true, arg2, arg1);
            return null;
        }
    }
}
