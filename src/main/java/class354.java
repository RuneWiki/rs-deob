import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class354 extends class238 {

    @OriginalMember(owner = "client!el", name = "y", descriptor = "Z")
    private static boolean field5116 = false;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    private static int field5105;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "I")
    private int field5107;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    private static int field5109;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    private int field5110;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "I")
    private int field5112;

    @OriginalMember(owner = "client!el", name = "z", descriptor = "I")
    private static int field5117;

    @OriginalMember(owner = "client!el", name = "G", descriptor = "I")
    private static int field5124;

    @OriginalMember(owner = "client!el", name = "I", descriptor = "I")
    private int field5126;

    @OriginalMember(owner = "client!el", name = "L", descriptor = "I")
    private int field5129;

    @OriginalMember(owner = "client!el", name = "M", descriptor = "I")
    private int field5130;

    @OriginalMember(owner = "client!el", name = "R", descriptor = "I")
    private int field5135;

    @OriginalMember(owner = "client!el", name = "S", descriptor = "I")
    private int field5136;

    @OriginalMember(owner = "client!el", name = "F", descriptor = "Z")
    private boolean field5123;

    @OriginalMember(owner = "client!el", name = "P", descriptor = "Z")
    private boolean field5133;

    @OriginalMember(owner = "client!el", name = "E", descriptor = "[B")
    private static byte[] field5122;

    @OriginalMember(owner = "client!el", name = "Q", descriptor = "[B")
    private byte[] field5134;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "[F")
    private static float[] field5103;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "[F")
    private static float[] field5104;

    @OriginalMember(owner = "client!el", name = "B", descriptor = "[F")
    private static float[] field5119;

    @OriginalMember(owner = "client!el", name = "D", descriptor = "[F")
    private static float[] field5121;

    @OriginalMember(owner = "client!el", name = "J", descriptor = "[F")
    private float[] field5127;

    @OriginalMember(owner = "client!el", name = "K", descriptor = "[F")
    private static float[] field5128;

    @OriginalMember(owner = "client!el", name = "N", descriptor = "[F")
    private static float[] field5131;

    @OriginalMember(owner = "client!el", name = "O", descriptor = "[F")
    private static float[] field5132;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "[I")
    private static int[] field5106;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "[I")
    private static int[] field5108;

    @OriginalMember(owner = "client!el", name = "w", descriptor = "[I")
    private static int[] field5114;

    @OriginalMember(owner = "client!el", name = "v", descriptor = "[Loc;")
    public static class123[] field5113;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "[Lrb;")
    private static class215[] field5111;

    @OriginalMember(owner = "client!el", name = "x", descriptor = "[Lat;")
    private static class233[] field5115;

    @OriginalMember(owner = "client!el", name = "H", descriptor = "[Lgo;")
    private static class409[] field5125;

    @OriginalMember(owner = "client!el", name = "A", descriptor = "[Z")
    private static boolean[] field5118;

    @OriginalMember(owner = "client!el", name = "C", descriptor = "[[B")
    private byte[][] field5120;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)F")
    public static final float method2202(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([BI)V")
    private static final void method2203(byte[] arg0, int arg1) {
        field5122 = arg0;
        field5117 = arg1;
        field5124 = 0;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)[F")
    private final float[] method2204(int arg0) {
        method2203(this.field5120[arg0], 0);
        method2205();
        int var2 = method2207(class28.method200(field5106.length - 1, false));
        boolean var3 = field5118[var2];
        int var4 = var3 ? field5109 : field5105;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2205() != 0;
            var6 = method2205() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field5105 >> 2);
            var9 = (field5105 >> 2) + (var4 >> 2);
            var10 = field5105 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field5105 >> 2);
            var12 = (field5105 >> 2) + (var4 - (var4 >> 2));
            var13 = field5105 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class215 var14 = field5111[field5106[var2]];
        int var15 = var14.field3223;
        int var16 = var14.field3222[var15];
        boolean var17 = !field5115[var16].method1490();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field3224; var19++) {
            class409 var95 = field5125[var14.field3221[var19]];
            float[] var96 = field5103;
            var95.method2423(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field3223;
            int var21 = var14.field3222[var20];
            field5115[var21].method1487(field5103, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field5103[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field5103;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field5121 : field5128;
            float[] var30 = var3 ? field5131 : field5119;
            float[] var31 = var3 ? field5104 : field5132;
            int[] var32 = var3 ? field5114 : field5108;
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
            int var35 = class28.method200(var4 - 1, false);
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
                field5103[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field5103[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field5110 > 0) {
            int var49 = this.field5110 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field5133) {
                for (int var50 = 0; var50 < this.field5112; var50++) {
                    int var51 = (this.field5110 >> 1) + var50;
                    var48[var50] += this.field5127[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field5103[var52];
                }
            }
        }
        float[] var54 = this.field5127;
        this.field5127 = field5103;
        field5103 = var54;
        this.field5110 = var4;
        this.field5112 = var12 - (var4 >> 1);
        this.field5133 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "()I")
    public static final int method2205() {
        int var0 = field5122[field5117] >> field5124 & 0x1;
        field5124++;
        field5117 += field5124 >> 3;
        field5124 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lb;)Z")
    private static final boolean method2206(class201 arg0) {
        if (!field5116) {
            byte[] var1 = arg0.method1257(0, 0, 24558);
            if (var1 == null) {
                return false;
            }
            method2211(var1);
            field5116 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(I)I")
    public static final int method2207(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field5124) {
            int var4 = 8 - field5124;
            int var5 = (0x1 << var4) - 1;
            var1 += (field5122[field5117] >> field5124 & var5) << var2;
            field5124 = 0;
            field5117++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field5122[field5117] >> field5124 & var3) << var2;
            field5124 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lb;II)Lel;")
    public static final class354 method2208(class201 arg0, int arg1, int arg2) {
        if (method2206(arg0)) {
            byte[] var3 = arg0.method1257(arg2, arg1, 24558);
            return var3 == null ? null : new class354(var3);
        } else {
            arg0.method1237(arg1, 0, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([I)Lnd;")
    public final class352 method2209(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field5134 == null) {
            this.field5110 = 0;
            this.field5127 = new float[field5109];
            this.field5134 = new byte[this.field5130];
            this.field5135 = 0;
            this.field5136 = 0;
        }
        while (this.field5136 < this.field5120.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method2204(this.field5136);
            if (var3 != null) {
                int var4 = this.field5135;
                int var5 = var3.length;
                if (var5 > this.field5130 - var4) {
                    var5 = this.field5130 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field5134[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field5135;
                }
                this.field5135 = var4;
            }
            this.field5136++;
        }
        this.field5127 = null;
        byte[] var2 = this.field5134;
        this.field5134 = null;
        return new class352(this.field5107, var2, this.field5129, this.field5126, this.field5123);
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "()V")
    public static void method2210() {
        field5122 = null;
        field5113 = null;
        field5115 = null;
        field5125 = null;
        field5111 = null;
        field5118 = null;
        field5106 = null;
        field5103 = null;
        field5128 = null;
        field5119 = null;
        field5132 = null;
        field5121 = null;
        field5131 = null;
        field5104 = null;
        field5108 = null;
        field5114 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([B)V")
    private static final void method2211(byte[] arg0) {
        method2203(arg0, 0);
        field5105 = 0x1 << method2207(4);
        field5109 = 0x1 << method2207(4);
        field5103 = new float[field5109];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field5105 : field5109;
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
            int var25 = class28.method200(var17 - 1, false);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class61.method382(var25, var26, (byte) 81);
            }
            if (var1 == 0) {
                field5128 = var18;
                field5119 = var20;
                field5132 = var22;
                field5108 = var24;
            } else {
                field5121 = var18;
                field5131 = var20;
                field5104 = var22;
                field5114 = var24;
            }
        }
        int var2 = method2207(8) + 1;
        field5113 = new class123[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field5113[var3] = new class123();
        }
        int var4 = method2207(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method2207(16);
        }
        int var6 = method2207(6) + 1;
        field5115 = new class233[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field5115[var7] = new class233();
        }
        int var8 = method2207(6) + 1;
        field5125 = new class409[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field5125[var9] = new class409();
        }
        int var10 = method2207(6) + 1;
        field5111 = new class215[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field5111[var11] = new class215();
        }
        int var12 = method2207(6) + 1;
        field5118 = new boolean[var12];
        field5106 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field5118[var13] = method2205() != 0;
            method2207(16);
            method2207(16);
            field5106[var13] = method2207(8);
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "([B)V")
    private final void method2212(byte[] arg0) {
        class276 var2 = new class276(arg0);
        this.field5107 = var2.method1688(20402);
        this.field5130 = var2.method1688(20402);
        this.field5129 = var2.method1688(20402);
        this.field5126 = var2.method1688(20402);
        if (this.field5126 < 0) {
            this.field5126 = ~this.field5126;
            this.field5123 = true;
        }
        int var3 = var2.method1688(20402);
        this.field5120 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1701(-23121);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1706(var7, 0, -104, var5);
            this.field5120[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "([B)V")
    private class354(byte[] arg0) {
        this.method2212(arg0);
    }
}
