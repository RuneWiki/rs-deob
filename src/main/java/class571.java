import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class571 extends class134 {

    @OriginalMember(owner = "client!cr", name = "D", descriptor = "Z")
    private static boolean field8118 = false;

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
    private int field8098;

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
    private static int field8099;

    @OriginalMember(owner = "client!cr", name = "r", descriptor = "I")
    private static int field8106;

    @OriginalMember(owner = "client!cr", name = "y", descriptor = "I")
    private int field8113;

    @OriginalMember(owner = "client!cr", name = "z", descriptor = "I")
    private int field8114;

    @OriginalMember(owner = "client!cr", name = "B", descriptor = "I")
    private int field8116;

    @OriginalMember(owner = "client!cr", name = "I", descriptor = "I")
    private static int field8122;

    @OriginalMember(owner = "client!cr", name = "J", descriptor = "I")
    private static int field8123;

    @OriginalMember(owner = "client!cr", name = "L", descriptor = "I")
    private int field8125;

    @OriginalMember(owner = "client!cr", name = "O", descriptor = "I")
    private int field8128;

    @OriginalMember(owner = "client!cr", name = "R", descriptor = "I")
    private int field8130;

    @OriginalMember(owner = "client!cr", name = "S", descriptor = "I")
    private int field8131;

    @OriginalMember(owner = "client!cr", name = "p", descriptor = "Z")
    private boolean field8104;

    @OriginalMember(owner = "client!cr", name = "N", descriptor = "Z")
    private boolean field8127;

    @OriginalMember(owner = "client!cr", name = "t", descriptor = "[B")
    private static byte[] field8108;

    @OriginalMember(owner = "client!cr", name = "P", descriptor = "[B")
    private byte[] field8129;

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "[F")
    private static float[] field8101;

    @OriginalMember(owner = "client!cr", name = "q", descriptor = "[F")
    private static float[] field8105;

    @OriginalMember(owner = "client!cr", name = "u", descriptor = "[F")
    private static float[] field8109;

    @OriginalMember(owner = "client!cr", name = "x", descriptor = "[F")
    private float[] field8112;

    @OriginalMember(owner = "client!cr", name = "A", descriptor = "[F")
    private static float[] field8115;

    @OriginalMember(owner = "client!cr", name = "C", descriptor = "[F")
    private static float[] field8117;

    @OriginalMember(owner = "client!cr", name = "K", descriptor = "[F")
    private static float[] field8124;

    @OriginalMember(owner = "client!cr", name = "M", descriptor = "[F")
    private static float[] field8126;

    @OriginalMember(owner = "client!cr", name = "n", descriptor = "[I")
    private static int[] field8102;

    @OriginalMember(owner = "client!cr", name = "w", descriptor = "[I")
    private static int[] field8111;

    @OriginalMember(owner = "client!cr", name = "G", descriptor = "[I")
    private static int[] field8120;

    @OriginalMember(owner = "client!cr", name = "v", descriptor = "[Ll;")
    private static class18[] field8110;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "[Ltj;")
    private static class196[] field8100;

    @OriginalMember(owner = "client!cr", name = "F", descriptor = "[Lad;")
    public static class423[] field8119;

    @OriginalMember(owner = "client!cr", name = "H", descriptor = "[Lrf;")
    private static class83[] field8121;

    @OriginalMember(owner = "client!cr", name = "o", descriptor = "[Z")
    private static boolean[] field8103;

    @OriginalMember(owner = "client!cr", name = "s", descriptor = "[[B")
    private byte[][] field8107;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Loh;I)Lcr;", line = 3)
    public static final class571 method3311(class404 arg0, int arg1) {
        if (method3313(arg0)) {
            byte[] var2 = arg0.method2472(false, arg1);
            return var2 == null ? null : new class571(var2);
        } else {
            arg0.method2463((byte) 106, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "([B)V", line = 19)
    private final void method3312(byte[] arg0) {
        class244 var2 = new class244(arg0);
        this.field8113 = var2.method1438(112);
        this.field8116 = var2.method1438(89);
        this.field8125 = var2.method1438(89);
        this.field8114 = var2.method1438(119);
        if (this.field8114 < 0) {
            this.field8114 = ~this.field8114;
            this.field8104 = true;
        }
        int var3 = var2.method1438(103);
        this.field8107 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1423(-126);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1461(824, 0, var7, var5);
            this.field8107[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Loh;)Z", line = 65)
    private static final boolean method3313(class404 arg0) {
        if (!field8118) {
            byte[] var1 = arg0.method2481(0, 0, (byte) 116);
            if (var1 == null) {
                return false;
            }
            method3322(var1);
        }
        return true;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)[F", line = 79)
    private final float[] method3314(int arg0) {
        method3316(this.field8107[arg0], 0);
        method3318();
        int var2 = method3319(class544.method3197(field8120.length - 1, (byte) -84));
        boolean var3 = field8103[var2];
        int var4 = var3 ? field8099 : field8106;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method3318() != 0;
            var6 = method3318() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field8106 >> 2);
            var9 = (field8106 >> 2) + (var4 >> 2);
            var10 = field8106 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field8106 >> 2);
            var12 = (field8106 >> 2) + (var4 - (var4 >> 2));
            var13 = field8106 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class196 var14 = field8100[field8120[var2]];
        int var15 = var14.field2281;
        int var16 = var14.field2280[var15];
        boolean var17 = !field8121[var16].method577();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2282; var19++) {
            class18 var95 = field8110[var14.field2279[var19]];
            float[] var96 = field8101;
            var95.method85(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2281;
            int var21 = var14.field2280[var20];
            field8121[var21].method580(field8101, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field8101[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field8101;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field8126 : field8109;
            float[] var30 = var3 ? field8124 : field8117;
            float[] var31 = var3 ? field8115 : field8105;
            int[] var32 = var3 ? field8111 : field8102;
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
            int var35 = class544.method3197(var4 - 1, (byte) -106);
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
                field8101[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field8101[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field8098 > 0) {
            int var49 = this.field8098 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field8127) {
                for (int var50 = 0; var50 < this.field8128; var50++) {
                    int var51 = (this.field8098 >> 1) + var50;
                    var48[var50] += this.field8112[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field8101[var52];
                }
            }
        }
        float[] var54 = this.field8112;
        this.field8112 = field8101;
        field8101 = var54;
        this.field8098 = var4;
        this.field8128 = var12 - (var4 >> 1);
        this.field8127 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(I)F", line = 492)
    public static final float method3315(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "([BI)V", line = 511)
    private static final void method3316(byte[] arg0, int arg1) {
        field8108 = arg0;
        field8123 = arg1;
        field8122 = 0;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Loh;II)Lcr;", line = 518)
    public static final class571 method3317(class404 arg0, int arg1, int arg2) {
        if (method3313(arg0)) {
            byte[] var3 = arg0.method2481(arg1, arg2, (byte) 106);
            return var3 == null ? null : new class571(var3);
        } else {
            arg0.method2493(arg1, arg2, (byte) -109);
            return null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "()I", line = 550)
    public static final int method3318() {
        int var0 = field8108[field8123] >> field8122 & 0x1;
        field8122++;
        field8123 += field8122 >> 3;
        field8122 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "(I)I", line = 558)
    public static final int method3319(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field8122) {
            int var4 = 8 - field8122;
            int var5 = (0x1 << var4) - 1;
            var1 += (field8108[field8123] >> field8122 & var5) << var2;
            field8122 = 0;
            field8123++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field8108[field8123] >> field8122 & var3) << var2;
            field8122 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "()V", line = 586)
    public static void method3320() {
        field8108 = null;
        field8119 = null;
        field8121 = null;
        field8110 = null;
        field8100 = null;
        field8103 = null;
        field8120 = null;
        field8101 = null;
        field8109 = null;
        field8117 = null;
        field8105 = null;
        field8126 = null;
        field8124 = null;
        field8115 = null;
        field8102 = null;
        field8111 = null;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "([I)Lcba;", line = 604)
    public final class548 method3321(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field8129 == null) {
            this.field8098 = 0;
            this.field8112 = new float[field8099];
            this.field8129 = new byte[this.field8116];
            this.field8130 = 0;
            this.field8131 = 0;
        }
        while (this.field8131 < this.field8107.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method3314(this.field8131);
            if (var3 != null) {
                int var4 = this.field8130;
                int var5 = var3.length;
                if (var5 > this.field8116 - var4) {
                    var5 = this.field8116 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field8129[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field8130;
                }
                this.field8130 = var4;
            }
            this.field8131++;
        }
        this.field8112 = null;
        byte[] var2 = this.field8129;
        this.field8129 = null;
        return new class548(this.field8113, var2, this.field8125, this.field8114, this.field8104);
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "([B)V", line = 662)
    private static final void method3322(byte[] arg0) {
        method3316(arg0, 0);
        field8106 = 0x1 << method3319(4);
        field8099 = 0x1 << method3319(4);
        field8101 = new float[field8099];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field8106 : field8099;
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
            int var25 = class544.method3197(var17 - 1, (byte) -88);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class331.method1984(true, var26, var25);
            }
            if (var1 == 0) {
                field8109 = var18;
                field8117 = var20;
                field8105 = var22;
                field8102 = var24;
            } else {
                field8126 = var18;
                field8124 = var20;
                field8115 = var22;
                field8111 = var24;
            }
        }
        int var2 = method3319(8) + 1;
        field8119 = new class423[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field8119[var3] = new class423();
        }
        int var4 = method3319(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method3319(16);
        }
        int var6 = method3319(6) + 1;
        field8121 = new class83[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field8121[var7] = new class83();
        }
        int var8 = method3319(6) + 1;
        field8110 = new class18[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field8110[var9] = new class18();
        }
        int var10 = method3319(6) + 1;
        field8100 = new class196[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field8100[var11] = new class196();
        }
        int var12 = method3319(6) + 1;
        field8103 = new boolean[var12];
        field8120 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field8103[var13] = method3318() != 0;
            method3319(16);
            method3319(16);
            field8120[var13] = method3319(8);
        }
        field8118 = true;
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "([B)V", line = 817)
    private class571(byte[] arg0) {
        this.method3312(arg0);
    }
}
