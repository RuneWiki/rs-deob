import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class36 {

    @OriginalMember(owner = "client!f", name = "b", descriptor = "Z")
    private static boolean field894 = false;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    private static int field898;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    private static int field901;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "I")
    private static int field903;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    private static int field906;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "I")
    private static int field907;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "I")
    private static int field912;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "I")
    private int field913;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "I")
    private int field914;

    @OriginalMember(owner = "client!f", name = "A", descriptor = "I")
    private int field919;

    @OriginalMember(owner = "client!f", name = "C", descriptor = "I")
    private int field921;

    @OriginalMember(owner = "client!f", name = "s", descriptor = "Z")
    private static boolean field911;

    @OriginalMember(owner = "client!f", name = "w", descriptor = "Z")
    private boolean field915;

    @OriginalMember(owner = "client!f", name = "B", descriptor = "[B")
    private static byte[] field920;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "[F")
    private static float[] field893;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "[F")
    private static float[] field896;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "[F")
    private static float[] field902;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "[F")
    private static float[] field904;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "[F")
    private static float[] field905;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "[F")
    private static float[] field909;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "[F")
    private static float[] field916;

    @OriginalMember(owner = "client!f", name = "D", descriptor = "[F")
    private static float[] field922;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "[I")
    private static int[] field900;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "[I")
    private static int[] field910;

    @OriginalMember(owner = "client!f", name = "z", descriptor = "[I")
    private static int[] field918;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "[Lp;")
    private static class104[] field908;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "[Lqa;")
    public static class112[] field917;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "[Lqf;")
    private static class117[] field895;

    @OriginalMember(owner = "client!f", name = "E", descriptor = "[Ll;")
    private static class76[] field923;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "[Z")
    private static boolean[] field899;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "[[B")
    private byte[][] field897;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()I")
    public static final int method316() {
        int var0 = field920[field912] >> field906 & 0x1;
        field906++;
        field912 += field906 >> 3;
        field906 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([BI)V")
    private static final void method317(byte[] arg0, int arg1) {
        field920 = arg0;
        field912 = arg1;
        field906 = 0;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([B)V")
    private static final void method318(byte[] arg0) {
        method317(arg0, 0);
        field898 = 0x1 << method323(4);
        field907 = 0x1 << method323(4);
        field902 = new float[field907];
        field896 = new float[field907];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field898 : field907;
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
            int var25 = class28.method251(var17 - 1, -19287);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class74.method634((byte) -122, var25, var26);
            }
            if (var1 == 0) {
                field905 = var18;
                field922 = var20;
                field916 = var22;
                field918 = var24;
            } else {
                field893 = var18;
                field904 = var20;
                field909 = var22;
                field900 = var24;
            }
        }
        int var2 = method323(8) + 1;
        field917 = new class112[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field917[var3] = new class112();
        }
        int var4 = method323(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method323(16);
        }
        int var6 = method323(6) + 1;
        field923 = new class76[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field923[var7] = new class76();
        }
        int var8 = method323(6) + 1;
        field908 = new class104[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field908[var9] = new class104();
        }
        int var10 = method323(6) + 1;
        field895 = new class117[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field895[var11] = new class117();
        }
        int var12 = method323(6) + 1;
        field899 = new boolean[var12];
        field910 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field899[var13] = method316() != 0;
            method323(16);
            method323(16);
            field910[var13] = method323(8);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)F")
    public static final float method319(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = arg0 >> 21 & 0x3FF;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "([B)V")
    private final void method320(byte[] arg0) {
        class122 var2 = new class122(arg0);
        this.field919 = var2.method972(-98);
        this.field914 = var2.method972(96);
        this.field921 = var2.method972(122);
        this.field913 = var2.method972(-82);
        if (this.field913 < 0) {
            this.field913 = ~this.field913;
            this.field915 = true;
        }
        int var3 = var2.method972(-114);
        this.field897 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method931((byte) 124);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method955(true, var5, 0, var7);
            this.field897[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)[F")
    private final float[] method321(int arg0) {
        method317(this.field897[arg0], 0);
        method316();
        int var2 = method323(class28.method251(field910.length - 1, -19287));
        boolean var3 = field899[var2];
        int var4 = var3 ? field907 : field898;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method316() != 0;
            var6 = method316() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field898 >> 2);
            var9 = (field898 >> 2) + (var4 >> 2);
            var10 = field898 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field898 >> 2);
            var12 = (field898 >> 2) + (var4 - (var4 >> 2));
            var13 = field898 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class117 var14 = field895[field910[var2]];
        int var15 = var14.field2774;
        int var16 = var14.field2775[var15];
        boolean var17 = !field923[var16].method653();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2776; var19++) {
            class104 var95 = field908[var14.field2777[var19]];
            float[] var96 = field902;
            var95.method849(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2774;
            int var21 = var14.field2775[var20];
            field923[var21].method655(field902, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field902[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field902;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field893 : field905;
            float[] var30 = var3 ? field904 : field922;
            float[] var31 = var3 ? field909 : field916;
            int[] var32 = var3 ? field900 : field918;
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
            int var35 = class28.method251(var4 - 1, -19287);
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
                field902[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field902[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (field903 > 0) {
            int var49 = field903 + var4 >> 2;
            var48 = new float[var49];
            if (!field911) {
                for (int var50 = 0; var50 < field901; var50++) {
                    int var51 = (field903 >> 1) + var50;
                    var48[var50] += field896[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field902[var52];
                }
            }
        }
        float[] var54 = field896;
        field896 = field902;
        field902 = var54;
        field903 = var4;
        field901 = var12 - (var4 >> 1);
        field911 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lkb;II)Lf;")
    public static final class36 method322(class71 arg0, int arg1, int arg2) {
        if (method325(arg0)) {
            byte[] var3 = arg0.method572(arg1, false, arg2);
            return var3 == null ? null : new class36(var3);
        } else {
            arg0.method584(arg1, (byte) 69, arg2);
            return null;
        }
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)I")
    public static final int method323(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field906) {
            int var4 = 8 - field906;
            int var5 = (0x1 << var4) - 1;
            var1 += (field920[field912] >> field906 & var5) << var2;
            field906 = 0;
            field912++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field920[field912] >> field906 & var3) << var2;
            field906 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "()V")
    public static void method324() {
        field920 = null;
        field917 = null;
        field923 = null;
        field908 = null;
        field895 = null;
        field899 = null;
        field910 = null;
        field896 = null;
        field902 = null;
        field905 = null;
        field922 = null;
        field916 = null;
        field893 = null;
        field904 = null;
        field909 = null;
        field918 = null;
        field900 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lkb;)Z")
    private static final boolean method325(class71 arg0) {
        if (!field894) {
            byte[] var1 = arg0.method572(0, false, 0);
            if (var1 == null) {
                return false;
            }
            method318(var1);
            field894 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "([B)V")
    private class36(byte[] arg0) {
        this.method320(arg0);
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "()Lvb;")
    public final class146 method326() {
        field903 = 0;
        byte[] var1 = new byte[this.field914];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field897.length; var3++) {
            float[] var4 = this.method321(var3);
            if (var4 != null) {
                int var5 = var4.length;
                if (var5 > this.field914 - var2) {
                    var5 = this.field914 - var2;
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
        return new class146(this.field919, var1, this.field921, this.field913, this.field915);
    }
}
