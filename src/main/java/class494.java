import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class494 extends class263 {

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "Z")
    private static boolean field6172 = false;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    private static int field6153;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    private static int field6155;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    private int field6160;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
    private int field6164;

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
    private static int field6166;

    @OriginalMember(owner = "client!hl", name = "y", descriptor = "I")
    private int field6171;

    @OriginalMember(owner = "client!hl", name = "B", descriptor = "I")
    private static int field6173;

    @OriginalMember(owner = "client!hl", name = "C", descriptor = "I")
    private int field6174;

    @OriginalMember(owner = "client!hl", name = "D", descriptor = "I")
    private int field6175;

    @OriginalMember(owner = "client!hl", name = "L", descriptor = "I")
    private int field6182;

    @OriginalMember(owner = "client!hl", name = "M", descriptor = "I")
    private int field6183;

    @OriginalMember(owner = "client!hl", name = "N", descriptor = "I")
    private int field6184;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "Z")
    private boolean field6156;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "Z")
    private boolean field6163;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "[B")
    private static byte[] field6159;

    @OriginalMember(owner = "client!hl", name = "O", descriptor = "[B")
    private byte[] field6185;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "[F")
    private static float[] field6157;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "[F")
    private static float[] field6158;

    @OriginalMember(owner = "client!hl", name = "w", descriptor = "[F")
    private static float[] field6169;

    @OriginalMember(owner = "client!hl", name = "x", descriptor = "[F")
    private float[] field6170;

    @OriginalMember(owner = "client!hl", name = "E", descriptor = "[F")
    private static float[] field6176;

    @OriginalMember(owner = "client!hl", name = "H", descriptor = "[F")
    private static float[] field6178;

    @OriginalMember(owner = "client!hl", name = "K", descriptor = "[F")
    private static float[] field6181;

    @OriginalMember(owner = "client!hl", name = "P", descriptor = "[F")
    private static float[] field6186;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "[I")
    private static int[] field6161;

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "[I")
    private static int[] field6165;

    @OriginalMember(owner = "client!hl", name = "v", descriptor = "[I")
    private static int[] field6168;

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "[Lne;")
    private static class297[] field6167;

    @OriginalMember(owner = "client!hl", name = "I", descriptor = "[Lwe;")
    public static class378[] field6179;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "[Lnq;")
    private static class429[] field6154;

    @OriginalMember(owner = "client!hl", name = "F", descriptor = "[Lcj;")
    private static class649[] field6177;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "[Z")
    private static boolean[] field6162;

    @OriginalMember(owner = "client!hl", name = "J", descriptor = "[[B")
    private byte[][] field6180;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "([B)V", line = 4)
    private static final void method2674(byte[] arg0) {
        method2685(arg0, 0);
        field6153 = 0x1 << method2679(4);
        field6173 = 0x1 << method2679(4);
        field6181 = new float[field6173];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field6153 : field6173;
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
            int var25 = class505.method2756(var17 - 1, -65537);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class384.method2207(var26, 1, var25);
            }
            if (var1 == 0) {
                field6157 = var18;
                field6176 = var20;
                field6186 = var22;
                field6165 = var24;
            } else {
                field6158 = var18;
                field6178 = var20;
                field6169 = var22;
                field6168 = var24;
            }
        }
        int var2 = method2679(8) + 1;
        field6179 = new class378[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field6179[var3] = new class378();
        }
        int var4 = method2679(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method2679(16);
        }
        int var6 = method2679(6) + 1;
        field6177 = new class649[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field6177[var7] = new class649();
        }
        int var8 = method2679(6) + 1;
        field6154 = new class429[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field6154[var9] = new class429();
        }
        int var10 = method2679(6) + 1;
        field6167 = new class297[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field6167[var11] = new class297();
        }
        int var12 = method2679(6) + 1;
        field6162 = new boolean[var12];
        field6161 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field6162[var13] = method2680() != 0;
            method2679(16);
            method2679(16);
            field6161[var13] = method2679(8);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "([I)Lft;", line = 156)
    public final class4 method2675(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field6185 == null) {
            this.field6171 = 0;
            this.field6170 = new float[field6173];
            this.field6185 = new byte[this.field6160];
            this.field6183 = 0;
            this.field6184 = 0;
        }
        while (this.field6184 < this.field6180.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method2681(this.field6184);
            if (var3 != null) {
                int var4 = this.field6183;
                int var5 = var3.length;
                if (var5 > this.field6160 - var4) {
                    var5 = this.field6160 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field6185[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field6183;
                }
                this.field6183 = var4;
            }
            this.field6184++;
        }
        this.field6170 = null;
        byte[] var2 = this.field6185;
        this.field6185 = null;
        return new class4(this.field6182, var2, this.field6174, this.field6175, this.field6156);
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "([B)V", line = 217)
    private final void method2676(byte[] arg0) {
        class572 var2 = new class572(arg0);
        this.field6182 = var2.method3064(-2031091464);
        this.field6160 = var2.method3064(-2031091464);
        this.field6174 = var2.method3064(-2031091464);
        this.field6175 = var2.method3064(-2031091464);
        if (this.field6175 < 0) {
            this.field6175 = ~this.field6175;
            this.field6156 = true;
        }
        int var3 = var2.method3064(-2031091464);
        this.field6180 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method3097((byte) 12);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method3081(var5, -24643, var7, 0);
            this.field6180[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "()V", line = 264)
    public static void method2677() {
        field6159 = null;
        field6179 = null;
        field6177 = null;
        field6154 = null;
        field6167 = null;
        field6162 = null;
        field6161 = null;
        field6181 = null;
        field6157 = null;
        field6176 = null;
        field6186 = null;
        field6158 = null;
        field6178 = null;
        field6169 = null;
        field6165 = null;
        field6168 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lpfa;II)Lhl;", line = 287)
    public static final class494 method2678(class275 arg0, int arg1, int arg2) {
        if (method2682(arg0)) {
            byte[] var3 = arg0.method1659(108, arg2, arg1);
            return var3 == null ? null : new class494(var3);
        } else {
            arg0.method1667(arg2, arg1, 80);
            return null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)I", line = 309)
    public static final int method2679(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field6166) {
            int var4 = 8 - field6166;
            int var5 = (0x1 << var4) - 1;
            var1 += (field6159[field6155] >> field6166 & var5) << var2;
            field6166 = 0;
            field6155++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field6159[field6155] >> field6166 & var3) << var2;
            field6166 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "()I", line = 337)
    public static final int method2680() {
        int var0 = field6159[field6155] >> field6166 & 0x1;
        field6166++;
        field6155 += field6166 >> 3;
        field6166 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)[F", line = 344)
    private final float[] method2681(int arg0) {
        method2685(this.field6180[arg0], 0);
        method2680();
        int var2 = method2679(class505.method2756(field6161.length - 1, -65537));
        boolean var3 = field6162[var2];
        int var4 = var3 ? field6173 : field6153;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2680() != 0;
            var6 = method2680() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field6153 >> 2);
            var9 = (field6153 >> 2) + (var4 >> 2);
            var10 = field6153 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field6153 >> 2);
            var12 = (field6153 >> 2) + (var4 - (var4 >> 2));
            var13 = field6153 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class297 var14 = field6167[field6161[var2]];
        int var15 = var14.field3797;
        int var16 = var14.field3795[var15];
        boolean var17 = !field6177[var16].method3618();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field3796; var19++) {
            class429 var95 = field6154[var14.field3798[var19]];
            float[] var96 = field6181;
            var95.method2364(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field3797;
            int var21 = var14.field3795[var20];
            field6177[var21].method3621(field6181, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field6181[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field6181;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field6158 : field6157;
            float[] var30 = var3 ? field6178 : field6176;
            float[] var31 = var3 ? field6169 : field6186;
            int[] var32 = var3 ? field6168 : field6165;
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
            int var35 = class505.method2756(var4 - 1, -65537);
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
                field6181[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field6181[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field6171 > 0) {
            int var49 = this.field6171 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field6163) {
                for (int var50 = 0; var50 < this.field6164; var50++) {
                    int var51 = (this.field6171 >> 1) + var50;
                    var48[var50] += this.field6170[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field6181[var52];
                }
            }
        }
        float[] var54 = this.field6170;
        this.field6170 = field6181;
        field6181 = var54;
        this.field6171 = var4;
        this.field6164 = var12 - (var4 >> 1);
        this.field6163 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lpfa;)Z", line = 758)
    private static final boolean method2682(class275 arg0) {
        if (!field6172) {
            byte[] var1 = arg0.method1659(113, 0, 0);
            if (var1 == null) {
                return false;
            }
            method2674(var1);
            field6172 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lpfa;I)Lhl;", line = 776)
    public static final class494 method2683(class275 arg0, int arg1) {
        if (method2682(arg0)) {
            byte[] var2 = arg0.method1648(125, arg1);
            return var2 == null ? null : new class494(var2);
        } else {
            arg0.method1669((byte) 114, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)F", line = 791)
    public static final float method2684(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "([BI)V", line = 804)
    private static final void method2685(byte[] arg0, int arg1) {
        field6159 = arg0;
        field6155 = arg1;
        field6166 = 0;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "([B)V", line = 815)
    private class494(byte[] arg0) {
        this.method2676(arg0);
    }
}
