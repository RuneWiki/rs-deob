import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class53 extends class253 {

    @OriginalMember(owner = "client!df", name = "N", descriptor = "Z")
    private static boolean field925 = false;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "I")
    private static int field904;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    private int field905;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    private int field906;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "I")
    private int field913;

    @OriginalMember(owner = "client!df", name = "C", descriptor = "I")
    private int field914;

    @OriginalMember(owner = "client!df", name = "D", descriptor = "I")
    private int field915;

    @OriginalMember(owner = "client!df", name = "I", descriptor = "I")
    private static int field920;

    @OriginalMember(owner = "client!df", name = "J", descriptor = "I")
    private int field921;

    @OriginalMember(owner = "client!df", name = "L", descriptor = "I")
    private static int field923;

    @OriginalMember(owner = "client!df", name = "R", descriptor = "I")
    private static int field929;

    @OriginalMember(owner = "client!df", name = "W", descriptor = "I")
    private int field934;

    @OriginalMember(owner = "client!df", name = "Y", descriptor = "I")
    private int field936;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "Z")
    private boolean field911;

    @OriginalMember(owner = "client!df", name = "O", descriptor = "Z")
    private boolean field926;

    @OriginalMember(owner = "client!df", name = "A", descriptor = "[B")
    private static byte[] field912;

    @OriginalMember(owner = "client!df", name = "Z", descriptor = "[B")
    private byte[] field937;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "[F")
    private static float[] field907;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "[F")
    private static float[] field910;

    @OriginalMember(owner = "client!df", name = "F", descriptor = "[F")
    private static float[] field917;

    @OriginalMember(owner = "client!df", name = "G", descriptor = "[F")
    private static float[] field918;

    @OriginalMember(owner = "client!df", name = "M", descriptor = "[F")
    private static float[] field924;

    @OriginalMember(owner = "client!df", name = "P", descriptor = "[F")
    private float[] field927;

    @OriginalMember(owner = "client!df", name = "Q", descriptor = "[F")
    private static float[] field928;

    @OriginalMember(owner = "client!df", name = "U", descriptor = "[F")
    private static float[] field932;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "[I")
    private static int[] field908;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "[I")
    private static int[] field909;

    @OriginalMember(owner = "client!df", name = "H", descriptor = "[I")
    private static int[] field919;

    @OriginalMember(owner = "client!df", name = "S", descriptor = "[Lwh;")
    private static class188[] field930;

    @OriginalMember(owner = "client!df", name = "T", descriptor = "[Lsi;")
    private static class192[] field931;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "[Lh;")
    public static class257[] field916;

    @OriginalMember(owner = "client!df", name = "X", descriptor = "[Ltj;")
    private static class258[] field935;

    @OriginalMember(owner = "client!df", name = "V", descriptor = "[Z")
    private static boolean[] field933;

    @OriginalMember(owner = "client!df", name = "K", descriptor = "[[B")
    private byte[][] field922;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lge;)Z")
    private static final boolean method347(class68 arg0) {
        if (!field925) {
            byte[] var1 = arg0.method464(-1, 0, 0);
            if (var1 == null) {
                return false;
            }
            method357(var1);
            field925 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([B)V")
    private final void method348(byte[] arg0) {
        class247 var2 = new class247(arg0);
        this.field906 = var2.method1712(6357);
        this.field921 = var2.method1712(6357);
        this.field905 = var2.method1712(6357);
        this.field913 = var2.method1712(6357);
        if (this.field913 < 0) {
            this.field913 = ~this.field913;
            this.field926 = true;
        }
        int var3 = var2.method1712(6357);
        this.field922 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method1711((byte) -67);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method1686(var5, 0, (byte) -110, var7);
            this.field922[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)I")
    public static final int method349(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field904) {
            int var4 = 8 - field904;
            int var5 = (0x1 << var4) - 1;
            var1 += (field912[field929] >> field904 & var5) << var2;
            field904 = 0;
            field929++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field912[field929] >> field904 & var3) << var2;
            field904 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(I)F")
    public static final float method350(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lge;II)Ldf;")
    public static final class53 method351(class68 arg0, int arg1, int arg2) {
        if (method347(arg0)) {
            byte[] var3 = arg0.method464(-1, arg1, arg2);
            return var3 == null ? null : new class53(var3);
        } else {
            arg0.method469(arg1, arg2, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([BI)V")
    private static final void method352(byte[] arg0, int arg1) {
        field912 = arg0;
        field929 = arg1;
        field904 = 0;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([I)Llb;")
    public final class126 method353(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field937 == null) {
            this.field915 = 0;
            this.field927 = new float[field923];
            this.field937 = new byte[this.field921];
            this.field936 = 0;
            this.field934 = 0;
        }
        while (this.field934 < this.field922.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method356(this.field934);
            if (var3 != null) {
                int var4 = this.field936;
                int var5 = var3.length;
                if (var5 > this.field921 - var4) {
                    var5 = this.field921 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field937[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field936;
                }
                this.field936 = var4;
            }
            this.field934++;
        }
        this.field927 = null;
        byte[] var2 = this.field937;
        this.field937 = null;
        return new class126(this.field906, var2, this.field905, this.field913, this.field926);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()I")
    public static final int method354() {
        int var0 = field912[field929] >> field904 & 0x1;
        field904++;
        field929 += field904 >> 3;
        field904 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "()V")
    public static void method355() {
        field912 = null;
        field916 = null;
        field930 = null;
        field931 = null;
        field935 = null;
        field933 = null;
        field909 = null;
        field917 = null;
        field907 = null;
        field910 = null;
        field932 = null;
        field924 = null;
        field918 = null;
        field928 = null;
        field919 = null;
        field908 = null;
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "(I)[F")
    private final float[] method356(int arg0) {
        method352(this.field922[arg0], 0);
        method354();
        int var2 = method349(class79.method548(field909.length - 1, (byte) 83));
        boolean var3 = field933[var2];
        int var4 = var3 ? field923 : field920;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method354() != 0;
            var6 = method354() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field920 >> 2);
            var9 = (field920 >> 2) + (var4 >> 2);
            var10 = field920 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field920 >> 2);
            var12 = (field920 >> 2) + (var4 - (var4 >> 2));
            var13 = field920 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class258 var14 = field935[field909[var2]];
        int var15 = var14.field4582;
        int var16 = var14.field4581[var15];
        boolean var17 = !field930[var16].method1292();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field4580; var19++) {
            class192 var95 = field931[var14.field4579[var19]];
            float[] var96 = field917;
            var95.method1318(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field4582;
            int var21 = var14.field4581[var20];
            field930[var21].method1294(field917, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field917[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field917;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field924 : field907;
            float[] var30 = var3 ? field918 : field910;
            float[] var31 = var3 ? field928 : field932;
            int[] var32 = var3 ? field908 : field919;
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
            int var35 = class79.method548(var4 - 1, (byte) 28);
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
                field917[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field917[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field915 > 0) {
            int var49 = this.field915 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field911) {
                for (int var50 = 0; var50 < this.field914; var50++) {
                    int var51 = (this.field915 >> 1) + var50;
                    var48[var50] += this.field927[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field917[var52];
                }
            }
        }
        float[] var54 = this.field927;
        this.field927 = field917;
        field917 = var54;
        this.field915 = var4;
        this.field914 = var12 - (var4 >> 1);
        this.field911 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "([B)V")
    private static final void method357(byte[] arg0) {
        method352(arg0, 0);
        field920 = 0x1 << method349(4);
        field923 = 0x1 << method349(4);
        field917 = new float[field923];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field920 : field923;
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
            int var25 = class79.method548(var17 - 1, (byte) 44);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class191.method1313(-117, var25, var26);
            }
            if (var1 == 0) {
                field907 = var18;
                field910 = var20;
                field932 = var22;
                field919 = var24;
            } else {
                field924 = var18;
                field918 = var20;
                field928 = var22;
                field908 = var24;
            }
        }
        int var2 = method349(8) + 1;
        field916 = new class257[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field916[var3] = new class257();
        }
        int var4 = method349(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method349(16);
        }
        int var6 = method349(6) + 1;
        field930 = new class188[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field930[var7] = new class188();
        }
        int var8 = method349(6) + 1;
        field931 = new class192[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field931[var9] = new class192();
        }
        int var10 = method349(6) + 1;
        field935 = new class258[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field935[var11] = new class258();
        }
        int var12 = method349(6) + 1;
        field933 = new boolean[var12];
        field909 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field933[var13] = method354() != 0;
            method349(16);
            method349(16);
            field909[var13] = method349(8);
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "([B)V")
    private class53(byte[] arg0) {
        this.method348(arg0);
    }
}
