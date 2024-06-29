import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class11 extends class425 {

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "Z")
    private static boolean field135 = false;

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "I")
    private int field137;

    @OriginalMember(owner = "client!kh", name = "s", descriptor = "I")
    private static int field139;

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "I")
    private int field144;

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "I")
    private int field146;

    @OriginalMember(owner = "client!kh", name = "G", descriptor = "I")
    private int field153;

    @OriginalMember(owner = "client!kh", name = "I", descriptor = "I")
    private static int field155;

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "I")
    private static int field156;

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "I")
    private int field158;

    @OriginalMember(owner = "client!kh", name = "M", descriptor = "I")
    private static int field159;

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "I")
    private int field162;

    @OriginalMember(owner = "client!kh", name = "U", descriptor = "I")
    private int field167;

    @OriginalMember(owner = "client!kh", name = "V", descriptor = "I")
    private int field168;

    @OriginalMember(owner = "client!kh", name = "t", descriptor = "Z")
    private boolean field140;

    @OriginalMember(owner = "client!kh", name = "u", descriptor = "Z")
    private boolean field141;

    @OriginalMember(owner = "client!kh", name = "D", descriptor = "[B")
    private static byte[] field150;

    @OriginalMember(owner = "client!kh", name = "T", descriptor = "[B")
    private byte[] field166;

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "[F")
    private static float[] field136;

    @OriginalMember(owner = "client!kh", name = "r", descriptor = "[F")
    private static float[] field138;

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "[F")
    private static float[] field143;

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "[F")
    private static float[] field145;

    @OriginalMember(owner = "client!kh", name = "F", descriptor = "[F")
    private static float[] field152;

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "[F")
    private static float[] field160;

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "[F")
    private static float[] field161;

    @OriginalMember(owner = "client!kh", name = "Q", descriptor = "[F")
    private float[] field163;

    @OriginalMember(owner = "client!kh", name = "A", descriptor = "[I")
    private static int[] field147;

    @OriginalMember(owner = "client!kh", name = "E", descriptor = "[I")
    private static int[] field151;

    @OriginalMember(owner = "client!kh", name = "R", descriptor = "[I")
    private static int[] field164;

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "[Lvc;")
    public static class172[] field157;

    @OriginalMember(owner = "client!kh", name = "H", descriptor = "[Lfo;")
    private static class303[] field154;

    @OriginalMember(owner = "client!kh", name = "B", descriptor = "[Lqi;")
    private static class339[] field148;

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "[Lte;")
    private static class367[] field142;

    @OriginalMember(owner = "client!kh", name = "C", descriptor = "[Z")
    private static boolean[] field149;

    @OriginalMember(owner = "client!kh", name = "S", descriptor = "[[B")
    private byte[][] field165;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "([I)Lbg;")
    public final class272 method55(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field166 == null) {
            this.field153 = 0;
            this.field163 = new float[field155];
            this.field166 = new byte[this.field144];
            this.field167 = 0;
            this.field168 = 0;
        }
        while (this.field168 < this.field165.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method59(this.field168);
            if (var3 != null) {
                int var4 = this.field167;
                int var5 = var3.length;
                if (var5 > this.field144 - var4) {
                    var5 = this.field144 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field166[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field167;
                }
                this.field167 = var4;
            }
            this.field168++;
        }
        this.field163 = null;
        byte[] var2 = this.field166;
        this.field166 = null;
        return new class272(this.field162, var2, this.field137, this.field146, this.field140);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "([B)V")
    private final void method56(byte[] arg0) {
        class130 var2 = new class130(arg0);
        this.field162 = var2.method815(true);
        this.field144 = var2.method815(true);
        this.field137 = var2.method815(true);
        this.field146 = var2.method815(true);
        if (this.field146 < 0) {
            this.field146 = ~this.field146;
            this.field140 = true;
        }
        int var3 = var2.method815(true);
        this.field165 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method837(true);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method853(0, var5, var7, true);
            this.field165[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ltj;)Z")
    private static final boolean method57(class108 arg0) {
        if (!field135) {
            byte[] var1 = arg0.method643(0, 0, true);
            if (var1 == null) {
                return false;
            }
            method61(var1);
            field135 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "()I")
    public static final int method58() {
        int var0 = field150[field139] >> field156 & 0x1;
        field156++;
        field139 += field156 >> 3;
        field156 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)[F")
    private final float[] method59(int arg0) {
        method65(this.field165[arg0], 0);
        method58();
        int var2 = method64(class402.method2519(8, field147.length - 1));
        boolean var3 = field149[var2];
        int var4 = var3 ? field155 : field159;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method58() != 0;
            var6 = method58() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field159 >> 2);
            var9 = (field159 >> 2) + (var4 >> 2);
            var10 = field159 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field159 >> 2);
            var12 = (field159 >> 2) + (var4 - (var4 >> 2));
            var13 = field159 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class367 var14 = field142[field147[var2]];
        int var15 = var14.field5243;
        int var16 = var14.field5245[var15];
        boolean var17 = !field154[var16].method2038();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field5244; var19++) {
            class339 var95 = field148[var14.field5242[var19]];
            float[] var96 = field152;
            var95.method2232(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field5243;
            int var21 = var14.field5245[var20];
            field154[var21].method2044(field152, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field152[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field152;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field143 : field160;
            float[] var30 = var3 ? field161 : field136;
            float[] var31 = var3 ? field138 : field145;
            int[] var32 = var3 ? field164 : field151;
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
            int var35 = class402.method2519(8, var4 - 1);
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
                field152[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field152[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field153 > 0) {
            int var49 = this.field153 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field141) {
                for (int var50 = 0; var50 < this.field158; var50++) {
                    int var51 = (this.field153 >> 1) + var50;
                    var48[var50] += this.field163[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field152[var52];
                }
            }
        }
        float[] var54 = this.field163;
        this.field163 = field152;
        field152 = var54;
        this.field153 = var4;
        this.field158 = var12 - (var4 >> 1);
        this.field141 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)F")
    public static final float method60(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "([B)V")
    private static final void method61(byte[] arg0) {
        method65(arg0, 0);
        field159 = 0x1 << method64(4);
        field155 = 0x1 << method64(4);
        field152 = new float[field155];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field159 : field155;
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
            int var25 = class402.method2519(8, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class294.method1988(var26, var25, 1);
            }
            if (var1 == 0) {
                field160 = var18;
                field136 = var20;
                field145 = var22;
                field151 = var24;
            } else {
                field143 = var18;
                field161 = var20;
                field138 = var22;
                field164 = var24;
            }
        }
        int var2 = method64(8) + 1;
        field157 = new class172[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field157[var3] = new class172();
        }
        int var4 = method64(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method64(16);
        }
        int var6 = method64(6) + 1;
        field154 = new class303[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field154[var7] = new class303();
        }
        int var8 = method64(6) + 1;
        field148 = new class339[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field148[var9] = new class339();
        }
        int var10 = method64(6) + 1;
        field142 = new class367[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field142[var11] = new class367();
        }
        int var12 = method64(6) + 1;
        field149 = new boolean[var12];
        field147 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field149[var13] = method58() != 0;
            method64(16);
            method64(16);
            field147[var13] = method64(8);
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "()V")
    public static void method62() {
        field150 = null;
        field157 = null;
        field154 = null;
        field148 = null;
        field142 = null;
        field149 = null;
        field147 = null;
        field152 = null;
        field160 = null;
        field136 = null;
        field145 = null;
        field143 = null;
        field161 = null;
        field138 = null;
        field151 = null;
        field164 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Ltj;II)Lkh;")
    public static final class11 method63(class108 arg0, int arg1, int arg2) {
        if (method57(arg0)) {
            byte[] var3 = arg0.method643(arg1, arg2, true);
            return var3 == null ? null : new class11(var3);
        } else {
            arg0.method661(arg1, false, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)I")
    public static final int method64(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field156) {
            int var4 = 8 - field156;
            int var5 = (0x1 << var4) - 1;
            var1 += (field150[field139] >> field156 & var5) << var2;
            field156 = 0;
            field139++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field150[field139] >> field156 & var3) << var2;
            field156 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "([BI)V")
    private static final void method65(byte[] arg0, int arg1) {
        field150 = arg0;
        field139 = arg1;
        field156 = 0;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "([B)V")
    private class11(byte[] arg0) {
        this.method56(arg0);
    }
}
