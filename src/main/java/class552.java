import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class552 extends class184 {

    @OriginalMember(owner = "client!cba", name = "v", descriptor = "Z")
    private static boolean field7871 = false;

    @OriginalMember(owner = "client!cba", name = "p", descriptor = "I")
    private int field7865;

    @OriginalMember(owner = "client!cba", name = "q", descriptor = "I")
    private int field7866;

    @OriginalMember(owner = "client!cba", name = "r", descriptor = "I")
    private static int field7867;

    @OriginalMember(owner = "client!cba", name = "z", descriptor = "I")
    private static int field7875;

    @OriginalMember(owner = "client!cba", name = "A", descriptor = "I")
    private int field7876;

    @OriginalMember(owner = "client!cba", name = "D", descriptor = "I")
    private int field7879;

    @OriginalMember(owner = "client!cba", name = "F", descriptor = "I")
    private static int field7881;

    @OriginalMember(owner = "client!cba", name = "H", descriptor = "I")
    private int field7883;

    @OriginalMember(owner = "client!cba", name = "I", descriptor = "I")
    private int field7884;

    @OriginalMember(owner = "client!cba", name = "N", descriptor = "I")
    private static int field7888;

    @OriginalMember(owner = "client!cba", name = "S", descriptor = "I")
    private int field7893;

    @OriginalMember(owner = "client!cba", name = "T", descriptor = "I")
    private int field7894;

    @OriginalMember(owner = "client!cba", name = "w", descriptor = "Z")
    private boolean field7872;

    @OriginalMember(owner = "client!cba", name = "B", descriptor = "Z")
    private boolean field7877;

    @OriginalMember(owner = "client!cba", name = "G", descriptor = "[B")
    private static byte[] field7882;

    @OriginalMember(owner = "client!cba", name = "U", descriptor = "[B")
    private byte[] field7895;

    @OriginalMember(owner = "client!cba", name = "m", descriptor = "[F")
    private static float[] field7862;

    @OriginalMember(owner = "client!cba", name = "s", descriptor = "[F")
    private static float[] field7868;

    @OriginalMember(owner = "client!cba", name = "x", descriptor = "[F")
    private static float[] field7873;

    @OriginalMember(owner = "client!cba", name = "C", descriptor = "[F")
    private float[] field7878;

    @OriginalMember(owner = "client!cba", name = "E", descriptor = "[F")
    private static float[] field7880;

    @OriginalMember(owner = "client!cba", name = "M", descriptor = "[F")
    private static float[] field7887;

    @OriginalMember(owner = "client!cba", name = "Q", descriptor = "[F")
    private static float[] field7891;

    @OriginalMember(owner = "client!cba", name = "R", descriptor = "[F")
    private static float[] field7892;

    @OriginalMember(owner = "client!cba", name = "n", descriptor = "[I")
    private static int[] field7863;

    @OriginalMember(owner = "client!cba", name = "t", descriptor = "[I")
    private static int[] field7869;

    @OriginalMember(owner = "client!cba", name = "O", descriptor = "[I")
    private static int[] field7889;

    @OriginalMember(owner = "client!cba", name = "u", descriptor = "[Lal;")
    private static class101[] field7870;

    @OriginalMember(owner = "client!cba", name = "P", descriptor = "[Lfha;")
    private static class380[] field7890;

    @OriginalMember(owner = "client!cba", name = "K", descriptor = "[Lufa;")
    private static class682[] field7885;

    @OriginalMember(owner = "client!cba", name = "y", descriptor = "[Lwo;")
    public static class746[] field7874;

    @OriginalMember(owner = "client!cba", name = "o", descriptor = "[Z")
    private static boolean[] field7864;

    @OriginalMember(owner = "client!cba", name = "L", descriptor = "[[B")
    private byte[][] field7886;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "()V", line = 7)
    public static void method3217() {
        field7882 = null;
        field7874 = null;
        field7890 = null;
        field7885 = null;
        field7870 = null;
        field7864 = null;
        field7889 = null;
        field7868 = null;
        field7862 = null;
        field7892 = null;
        field7880 = null;
        field7873 = null;
        field7887 = null;
        field7891 = null;
        field7863 = null;
        field7869 = null;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "([B)V", line = 25)
    private static final void method3218(byte[] arg0) {
        method3223(arg0, 0);
        field7875 = 0x1 << method3227(4);
        field7867 = 0x1 << method3227(4);
        field7868 = new float[field7867];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field7875 : field7867;
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
            int var25 = class181.method1280(var17 - 1, 98);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class228.method1539(100, var25, var26);
            }
            if (var1 == 0) {
                field7862 = var18;
                field7892 = var20;
                field7880 = var22;
                field7863 = var24;
            } else {
                field7873 = var18;
                field7887 = var20;
                field7891 = var22;
                field7869 = var24;
            }
        }
        int var2 = method3227(8) + 1;
        field7874 = new class746[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field7874[var3] = new class746();
        }
        int var4 = method3227(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method3227(16);
        }
        int var6 = method3227(6) + 1;
        field7890 = new class380[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field7890[var7] = new class380();
        }
        int var8 = method3227(6) + 1;
        field7885 = new class682[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field7885[var9] = new class682();
        }
        int var10 = method3227(6) + 1;
        field7870 = new class101[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field7870[var11] = new class101();
        }
        int var12 = method3227(6) + 1;
        field7864 = new boolean[var12];
        field7889 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field7864[var13] = method3220() != 0;
            method3227(16);
            method3227(16);
            field7889[var13] = method3227(8);
        }
        field7871 = true;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)[F", line = 184)
    private final float[] method3219(int arg0) {
        method3223(this.field7886[arg0], 0);
        method3220();
        int var2 = method3227(class181.method1280(field7889.length - 1, 94));
        boolean var3 = field7864[var2];
        int var4 = var3 ? field7867 : field7875;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method3220() != 0;
            var6 = method3220() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field7875 >> 2);
            var9 = (field7875 >> 2) + (var4 >> 2);
            var10 = field7875 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field7875 >> 2);
            var12 = (field7875 >> 2) + (var4 - (var4 >> 2));
            var13 = field7875 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class101 var14 = field7870[field7889[var2]];
        int var15 = var14.field1428;
        int var16 = var14.field1425[var15];
        boolean var17 = !field7890[var16].method2455();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field1426; var19++) {
            class682 var95 = field7885[var14.field1427[var19]];
            float[] var96 = field7868;
            var95.method3902(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field1428;
            int var21 = var14.field1425[var20];
            field7890[var21].method2451(field7868, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field7868[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field7868;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field7873 : field7862;
            float[] var30 = var3 ? field7887 : field7892;
            float[] var31 = var3 ? field7891 : field7880;
            int[] var32 = var3 ? field7869 : field7863;
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
            int var35 = class181.method1280(var4 - 1, 119);
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
                field7868[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field7868[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field7865 > 0) {
            int var49 = this.field7865 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field7877) {
                for (int var50 = 0; var50 < this.field7866; var50++) {
                    int var51 = (this.field7865 >> 1) + var50;
                    var48[var50] += this.field7878[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field7868[var52];
                }
            }
        }
        float[] var54 = this.field7878;
        this.field7878 = field7868;
        field7868 = var54;
        this.field7865 = var4;
        this.field7866 = var12 - (var4 >> 1);
        this.field7877 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "()I", line = 601)
    public static final int method3220() {
        int var0 = field7882[field7888] >> field7881 & 0x1;
        field7881++;
        field7888 += field7881 >> 3;
        field7881 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "([B)V", line = 611)
    private final void method3221(byte[] arg0) {
        class645 var2 = new class645(arg0);
        this.field7879 = var2.method3720(-19541);
        this.field7884 = var2.method3720(-19541);
        this.field7876 = var2.method3720(-19541);
        this.field7883 = var2.method3720(-19541);
        if (this.field7883 < 0) {
            this.field7883 = ~this.field7883;
            this.field7872 = true;
        }
        int var3 = var2.method3720(-19541);
        this.field7886 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method3745(-6314);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method3736(118, var7, var5, 0);
            this.field7886[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lvd;II)Lcba;", line = 653)
    public static final class552 method3222(class39 arg0, int arg1, int arg2) {
        if (method3228(arg0)) {
            byte[] var3 = arg0.method211(true, arg1, arg2);
            return var3 == null ? null : new class552(var3);
        } else {
            arg0.method214(arg2, arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "([BI)V", line = 671)
    private static final void method3223(byte[] arg0, int arg1) {
        field7882 = arg0;
        field7888 = arg1;
        field7881 = 0;
    }

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)F", line = 680)
    public static final float method3224(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "([I)Lut;", line = 698)
    public final class125 method3225(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field7895 == null) {
            this.field7865 = 0;
            this.field7878 = new float[field7867];
            this.field7895 = new byte[this.field7884];
            this.field7893 = 0;
            this.field7894 = 0;
        }
        while (this.field7894 < this.field7886.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method3219(this.field7894);
            if (var3 != null) {
                int var4 = this.field7893;
                int var5 = var3.length;
                if (var5 > this.field7884 - var4) {
                    var5 = this.field7884 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field7895[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field7893;
                }
                this.field7893 = var4;
            }
            this.field7894++;
        }
        this.field7878 = null;
        byte[] var2 = this.field7895;
        this.field7895 = null;
        return new class125(this.field7879, var2, this.field7876, this.field7883, this.field7872);
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lvd;I)Lcba;", line = 756)
    public static final class552 method3226(class39 arg0, int arg1) {
        if (method3228(arg0)) {
            byte[] var2 = arg0.method226(59, arg1);
            return var2 == null ? null : new class552(var2);
        } else {
            arg0.method208(arg1, (byte) 70);
            return null;
        }
    }

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "(I)I", line = 772)
    public static final int method3227(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field7881) {
            int var4 = 8 - field7881;
            int var5 = (0x1 << var4) - 1;
            var1 += (field7882[field7888] >> field7881 & var5) << var2;
            field7881 = 0;
            field7888++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field7882[field7888] >> field7881 & var3) << var2;
            field7881 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lvd;)Z", line = 805)
    private static final boolean method3228(class39 arg0) {
        if (!field7871) {
            byte[] var1 = arg0.method211(true, 0, 0);
            if (var1 == null) {
                return false;
            }
            method3218(var1);
        }
        return true;
    }

    @OriginalMember(owner = "client!cba", name = "<init>", descriptor = "([B)V", line = 817)
    private class552(byte[] arg0) {
        this.method3221(arg0);
    }
}
