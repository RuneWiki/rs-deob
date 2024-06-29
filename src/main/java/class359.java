import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class359 extends class665 {

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "Z")
    private static boolean field5140 = false;

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
    private static int field5135;

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "I")
    private int field5144;

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "I")
    private int field5146;

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "I")
    private int field5148;

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "I")
    private static int field5149;

    @OriginalMember(owner = "client!wj", name = "A", descriptor = "I")
    private static int field5150;

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "I")
    private static int field5151;

    @OriginalMember(owner = "client!wj", name = "D", descriptor = "I")
    private int field5153;

    @OriginalMember(owner = "client!wj", name = "L", descriptor = "I")
    private int field5161;

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "I")
    private int field5163;

    @OriginalMember(owner = "client!wj", name = "P", descriptor = "I")
    private int field5165;

    @OriginalMember(owner = "client!wj", name = "Q", descriptor = "I")
    private int field5166;

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "Z")
    private boolean field5143;

    @OriginalMember(owner = "client!wj", name = "H", descriptor = "Z")
    private boolean field5157;

    @OriginalMember(owner = "client!wj", name = "J", descriptor = "[B")
    private static byte[] field5159;

    @OriginalMember(owner = "client!wj", name = "R", descriptor = "[B")
    private byte[] field5167;

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "[F")
    private static float[] field5136;

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "[F")
    private static float[] field5141;

    @OriginalMember(owner = "client!wj", name = "x", descriptor = "[F")
    private float[] field5147;

    @OriginalMember(owner = "client!wj", name = "C", descriptor = "[F")
    private static float[] field5152;

    @OriginalMember(owner = "client!wj", name = "E", descriptor = "[F")
    private static float[] field5154;

    @OriginalMember(owner = "client!wj", name = "G", descriptor = "[F")
    private static float[] field5156;

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "[F")
    private static float[] field5160;

    @OriginalMember(owner = "client!wj", name = "M", descriptor = "[F")
    private static float[] field5162;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "[I")
    private static int[] field5134;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "[I")
    private static int[] field5137;

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "[I")
    private static int[] field5145;

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "[Lst;")
    public static class397[] field5142;

    @OriginalMember(owner = "client!wj", name = "F", descriptor = "[Ldr;")
    private static class670[] field5155;

    @OriginalMember(owner = "client!wj", name = "O", descriptor = "[Llr;")
    private static class698[] field5164;

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "[Leg;")
    private static class92[] field5139;

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "[Z")
    private static boolean[] field5138;

    @OriginalMember(owner = "client!wj", name = "I", descriptor = "[[B")
    private byte[][] field5158;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)[F", line = 6)
    private final float[] method2185(int arg0) {
        method2193(this.field5158[arg0], 0);
        method2196();
        int var2 = method2186(class608.method3411((byte) -128, field5137.length - 1));
        boolean var3 = field5138[var2];
        int var4 = var3 ? field5150 : field5135;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2196() != 0;
            var6 = method2196() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field5135 >> 2);
            var9 = (field5135 >> 2) + (var4 >> 2);
            var10 = field5135 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field5135 >> 2);
            var12 = (field5135 >> 2) + (var4 - (var4 >> 2));
            var13 = field5135 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class92 var14 = field5139[field5137[var2]];
        int var15 = var14.field1495;
        int var16 = var14.field1494[var15];
        boolean var17 = !field5155[var16].method3717();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1492; var19++) {
            class698 var95 = field5164[var14.field1493[var19]];
            float[] var96 = field5154;
            var95.method3895(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field1495;
            int var21 = var14.field1494[var20];
            field5155[var21].method3715(field5154, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field5154[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field5154;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field5160 : field5156;
            float[] var30 = var3 ? field5162 : field5136;
            float[] var31 = var3 ? field5152 : field5141;
            int[] var32 = var3 ? field5145 : field5134;
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
            int var35 = class608.method3411((byte) -113, var4 - 1);
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
                field5154[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field5154[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field5161 > 0) {
            int var49 = this.field5161 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field5143) {
                for (int var50 = 0; var50 < this.field5153; var50++) {
                    int var51 = (this.field5161 >> 1) + var50;
                    var48[var50] += this.field5147[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field5154[var52];
                }
            }
        }
        float[] var54 = this.field5147;
        this.field5147 = field5154;
        field5154 = var54;
        this.field5161 = var4;
        this.field5153 = var12 - (var4 >> 1);
        this.field5143 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)I", line = 421)
    public static final int method2186(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field5149) {
            int var4 = 8 - field5149;
            int var5 = (0x1 << var4) - 1;
            var1 += (field5159[field5151] >> field5149 & var5) << var2;
            field5149 = 0;
            field5151++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field5159[field5151] >> field5149 & var3) << var2;
            field5149 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "([B)V", line = 453)
    private final void method2187(byte[] arg0) {
        class695 var2 = new class695(arg0);
        this.field5148 = var2.method3880(8);
        this.field5144 = var2.method3880(8);
        this.field5146 = var2.method3880(8);
        this.field5163 = var2.method3880(8);
        if (this.field5163 < 0) {
            this.field5163 = ~this.field5163;
            this.field5157 = true;
        }
        int var3 = var2.method3880(8);
        this.field5158 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method3826(false);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method3876((byte) 127, var7, 0, var5);
            this.field5158[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "([I)Lmm;", line = 495)
    public final class250 method2188(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field5167 == null) {
            this.field5161 = 0;
            this.field5147 = new float[field5150];
            this.field5167 = new byte[this.field5144];
            this.field5166 = 0;
            this.field5165 = 0;
        }
        while (this.field5165 < this.field5158.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method2185(this.field5165);
            if (var3 != null) {
                int var4 = this.field5166;
                int var5 = var3.length;
                if (var5 > this.field5144 - var4) {
                    var5 = this.field5144 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field5167[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field5166;
                }
                this.field5166 = var4;
            }
            this.field5165++;
        }
        this.field5147 = null;
        byte[] var2 = this.field5167;
        this.field5167 = null;
        return new class250(this.field5148, var2, this.field5146, this.field5163, this.field5157);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lpu;I)Lwj;", line = 553)
    public static final class359 method2189(class522 arg0, int arg1) {
        if (method2191(arg0)) {
            byte[] var2 = arg0.method2994(arg1, (byte) 93);
            return var2 == null ? null : new class359(var2);
        } else {
            arg0.method2997((byte) -95, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lpu;II)Lwj;", line = 569)
    public static final class359 method2190(class522 arg0, int arg1, int arg2) {
        if (method2191(arg0)) {
            byte[] var3 = arg0.method3007(arg1, arg2, 5);
            return var3 == null ? null : new class359(var3);
        } else {
            arg0.method2991(arg1, arg2, (byte) 102);
            return null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lpu;)Z", line = 596)
    private static final boolean method2191(class522 arg0) {
        if (!field5140) {
            byte[] var1 = arg0.method3007(0, 0, 5);
            if (var1 == null) {
                return false;
            }
            method2192(var1);
            field5140 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "([B)V", line = 610)
    private static final void method2192(byte[] arg0) {
        method2193(arg0, 0);
        field5135 = 0x1 << method2186(4);
        field5150 = 0x1 << method2186(4);
        field5154 = new float[field5150];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field5135 : field5150;
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
            int var25 = class608.method3411((byte) -117, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class700.method3901(var25, 26, var26);
            }
            if (var1 == 0) {
                field5156 = var18;
                field5136 = var20;
                field5141 = var22;
                field5134 = var24;
            } else {
                field5160 = var18;
                field5162 = var20;
                field5152 = var22;
                field5145 = var24;
            }
        }
        int var2 = method2186(8) + 1;
        field5142 = new class397[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field5142[var3] = new class397();
        }
        int var4 = method2186(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method2186(16);
        }
        int var6 = method2186(6) + 1;
        field5155 = new class670[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field5155[var7] = new class670();
        }
        int var8 = method2186(6) + 1;
        field5164 = new class698[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field5164[var9] = new class698();
        }
        int var10 = method2186(6) + 1;
        field5139 = new class92[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field5139[var11] = new class92();
        }
        int var12 = method2186(6) + 1;
        field5138 = new boolean[var12];
        field5137 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field5138[var13] = method2196() != 0;
            method2186(16);
            method2186(16);
            field5137[var13] = method2186(8);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "([BI)V", line = 770)
    private static final void method2193(byte[] arg0, int arg1) {
        field5159 = arg0;
        field5151 = arg1;
        field5149 = 0;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "()V", line = 775)
    public static void method2194() {
        field5159 = null;
        field5142 = null;
        field5155 = null;
        field5164 = null;
        field5139 = null;
        field5138 = null;
        field5137 = null;
        field5154 = null;
        field5156 = null;
        field5136 = null;
        field5141 = null;
        field5160 = null;
        field5162 = null;
        field5152 = null;
        field5134 = null;
        field5145 = null;
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)F", line = 797)
    public static final float method2195(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "()I", line = 810)
    public static final int method2196() {
        int var0 = field5159[field5151] >> field5149 & 0x1;
        field5149++;
        field5151 += field5149 >> 3;
        field5149 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "([B)V", line = 816)
    private class359(byte[] arg0) {
        this.method2187(arg0);
    }
}
