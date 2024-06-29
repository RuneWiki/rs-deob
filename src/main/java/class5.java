import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 extends class44 {

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "Z")
    private static boolean field77 = false;

    @OriginalMember(owner = "client!ad", name = "R", descriptor = "I")
    private int field104;

    @OriginalMember(owner = "client!ad", name = "S", descriptor = "I")
    private int field105;

    @OriginalMember(owner = "client!ad", name = "T", descriptor = "I")
    private int field106;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
    private int field74;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    private int field76;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    private static int field79;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
    private static int field80;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "I")
    private int field84;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "I")
    private static int field91;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "I")
    private static int field92;

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "I")
    private int field94;

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
    private int field99;

    @OriginalMember(owner = "client!ad", name = "Q", descriptor = "Z")
    private boolean field103;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "Z")
    private boolean field78;

    @OriginalMember(owner = "client!ad", name = "U", descriptor = "[B")
    private byte[] field107;

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "[B")
    private static byte[] field86;

    @OriginalMember(owner = "client!ad", name = "N", descriptor = "[F")
    private static float[] field100;

    @OriginalMember(owner = "client!ad", name = "O", descriptor = "[F")
    private static float[] field101;

    @OriginalMember(owner = "client!ad", name = "P", descriptor = "[F")
    private static float[] field102;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "[F")
    private static float[] field81;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "[F")
    private static float[] field82;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "[F")
    private static float[] field88;

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "[F")
    private float[] field90;

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "[F")
    private static float[] field96;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "[I")
    private static int[] field75;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "[I")
    private static int[] field85;

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "[I")
    private static int[] field97;

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "[Lm;")
    private static class109[] field95;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "[Lvf;")
    public static class196[] field83;

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "[Ldh;")
    private static class38[] field89;

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "[Lkc;")
    private static class94[] field98;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "[Z")
    private static boolean[] field93;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "[[B")
    private byte[][] field87;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "()I")
    public static final int method24() {
        int var0 = field86[field80] >> field79 & 0x1;
        field79++;
        field80 += field79 >> 3;
        field79 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([B)V")
    private static final void method25(byte[] arg0) {
        method33(arg0, 0);
        field92 = 0x1 << method26(4);
        field91 = 0x1 << method26(4);
        field96 = new float[field91];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field92 : field91;
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
            int var25 = class128.method725(0, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class1.method5(var26, -18367, var25);
            }
            if (var1 == 0) {
                field82 = var18;
                field88 = var20;
                field81 = var22;
                field85 = var24;
            } else {
                field101 = var18;
                field102 = var20;
                field100 = var22;
                field75 = var24;
            }
        }
        int var2 = method26(8) + 1;
        field83 = new class196[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field83[var3] = new class196();
        }
        int var4 = method26(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method26(16);
        }
        int var6 = method26(6) + 1;
        field98 = new class94[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field98[var7] = new class94();
        }
        int var8 = method26(6) + 1;
        field89 = new class38[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field89[var9] = new class38();
        }
        int var10 = method26(6) + 1;
        field95 = new class109[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field95[var11] = new class109();
        }
        int var12 = method26(6) + 1;
        field93 = new boolean[var12];
        field97 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field93[var13] = method24() != 0;
            method26(16);
            method26(16);
            field97[var13] = method26(8);
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)I")
    public static final int method26(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field79) {
            int var4 = 8 - field79;
            int var5 = (0x1 << var4) - 1;
            var1 += (field86[field80] >> field79 & var5) << var2;
            field79 = 0;
            field80++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field86[field80] >> field79 & var3) << var2;
            field79 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "()V")
    public static void method27() {
        field86 = null;
        field83 = null;
        field98 = null;
        field89 = null;
        field95 = null;
        field93 = null;
        field97 = null;
        field96 = null;
        field82 = null;
        field88 = null;
        field81 = null;
        field101 = null;
        field102 = null;
        field100 = null;
        field85 = null;
        field75 = null;
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)F")
    public static final float method28(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([I)Lwc;")
    public final class202 method29(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field107 == null) {
            this.field99 = 0;
            this.field90 = new float[field91];
            this.field107 = new byte[this.field74];
            this.field106 = 0;
            this.field105 = 0;
        }
        while (this.field105 < this.field87.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method32(this.field105);
            if (var3 != null) {
                int var4 = this.field106;
                int var5 = var3.length;
                if (var5 > this.field74 - var4) {
                    var5 = this.field74 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field107[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field106;
                }
                this.field106 = var4;
            }
            this.field105++;
        }
        this.field90 = null;
        byte[] var2 = this.field107;
        this.field107 = null;
        return new class202(this.field94, var2, this.field104, this.field76, this.field78);
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "([B)V")
    private final void method30(byte[] arg0) {
        class158 var2 = new class158(arg0);
        this.field94 = var2.method1076(24277);
        this.field74 = var2.method1076(24277);
        this.field104 = var2.method1076(24277);
        this.field76 = var2.method1076(24277);
        if (this.field76 < 0) {
            this.field76 = ~this.field76;
            this.field78 = true;
        }
        int var3 = var2.method1076(24277);
        this.field87 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1054(128);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1041(0, var5, var7, 107);
            this.field87[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljg;)Z")
    private static final boolean method31(class89 arg0) {
        if (!field77) {
            byte[] var1 = arg0.method461(0, (byte) 81, 0);
            if (var1 == null) {
                return false;
            }
            method25(var1);
            field77 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)[F")
    private final float[] method32(int arg0) {
        method33(this.field87[arg0], 0);
        method24();
        int var2 = method26(class128.method725(0, field97.length - 1));
        boolean var3 = field93[var2];
        int var4 = var3 ? field91 : field92;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method24() != 0;
            var6 = method24() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field92 >> 2);
            var9 = (field92 >> 2) + (var4 >> 2);
            var10 = field92 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field92 >> 2);
            var12 = (field92 >> 2) + (var4 - (var4 >> 2));
            var13 = field92 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class109 var14 = field95[field97[var2]];
        int var15 = var14.field1971;
        int var16 = var14.field1973[var15];
        boolean var17 = !field98[var16].method528();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1974; var19++) {
            class38 var95 = field89[var14.field1972[var19]];
            float[] var96 = field96;
            var95.method210(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field1971;
            int var21 = var14.field1973[var20];
            field98[var21].method531(field96, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field96[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field96;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field101 : field82;
            float[] var30 = var3 ? field102 : field88;
            float[] var31 = var3 ? field100 : field81;
            int[] var32 = var3 ? field75 : field85;
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
            int var35 = class128.method725(0, var4 - 1);
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
                field96[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field96[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field99 > 0) {
            int var49 = this.field99 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field103) {
                for (int var50 = 0; var50 < this.field84; var50++) {
                    int var51 = (this.field99 >> 1) + var50;
                    var48[var50] += this.field90[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field96[var52];
                }
            }
        }
        float[] var54 = this.field90;
        this.field90 = field96;
        field96 = var54;
        this.field99 = var4;
        this.field84 = var12 - (var4 >> 1);
        this.field103 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "([BI)V")
    private static final void method33(byte[] arg0, int arg1) {
        field86 = arg0;
        field80 = arg1;
        field79 = 0;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljg;II)Lad;")
    public static final class5 method34(class89 arg0, int arg1, int arg2) {
        if (method31(arg0)) {
            byte[] var3 = arg0.method461(arg1, (byte) 105, arg2);
            return var3 == null ? null : new class5(var3);
        } else {
            arg0.method455(arg2, arg1, -19312);
            return null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "([B)V")
    private class5(byte[] arg0) {
        this.method30(arg0);
    }
}
