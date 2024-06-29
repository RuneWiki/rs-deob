import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class355 extends class499 {

    @OriginalMember(owner = "client!gq", name = "o", descriptor = "Z")
    private static boolean field4832 = false;

    @OriginalMember(owner = "client!gq", name = "p", descriptor = "I")
    private static int field4833;

    @OriginalMember(owner = "client!gq", name = "v", descriptor = "I")
    private int field4839;

    @OriginalMember(owner = "client!gq", name = "y", descriptor = "I")
    private int field4842;

    @OriginalMember(owner = "client!gq", name = "z", descriptor = "I")
    private int field4843;

    @OriginalMember(owner = "client!gq", name = "H", descriptor = "I")
    private static int field4851;

    @OriginalMember(owner = "client!gq", name = "I", descriptor = "I")
    private static int field4852;

    @OriginalMember(owner = "client!gq", name = "L", descriptor = "I")
    private int field4855;

    @OriginalMember(owner = "client!gq", name = "M", descriptor = "I")
    private static int field4856;

    @OriginalMember(owner = "client!gq", name = "N", descriptor = "I")
    private int field4857;

    @OriginalMember(owner = "client!gq", name = "O", descriptor = "I")
    private int field4858;

    @OriginalMember(owner = "client!gq", name = "R", descriptor = "I")
    private int field4861;

    @OriginalMember(owner = "client!gq", name = "T", descriptor = "I")
    private int field4863;

    @OriginalMember(owner = "client!gq", name = "D", descriptor = "Z")
    private boolean field4847;

    @OriginalMember(owner = "client!gq", name = "G", descriptor = "Z")
    private boolean field4850;

    @OriginalMember(owner = "client!gq", name = "q", descriptor = "[B")
    private static byte[] field4834;

    @OriginalMember(owner = "client!gq", name = "U", descriptor = "[B")
    private byte[] field4864;

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "[F")
    private static float[] field4831;

    @OriginalMember(owner = "client!gq", name = "r", descriptor = "[F")
    private static float[] field4835;

    @OriginalMember(owner = "client!gq", name = "s", descriptor = "[F")
    private float[] field4836;

    @OriginalMember(owner = "client!gq", name = "u", descriptor = "[F")
    private static float[] field4838;

    @OriginalMember(owner = "client!gq", name = "x", descriptor = "[F")
    private static float[] field4841;

    @OriginalMember(owner = "client!gq", name = "A", descriptor = "[F")
    private static float[] field4844;

    @OriginalMember(owner = "client!gq", name = "J", descriptor = "[F")
    private static float[] field4853;

    @OriginalMember(owner = "client!gq", name = "Q", descriptor = "[F")
    private static float[] field4860;

    @OriginalMember(owner = "client!gq", name = "w", descriptor = "[I")
    private static int[] field4840;

    @OriginalMember(owner = "client!gq", name = "B", descriptor = "[I")
    private static int[] field4845;

    @OriginalMember(owner = "client!gq", name = "P", descriptor = "[I")
    private static int[] field4859;

    @OriginalMember(owner = "client!gq", name = "S", descriptor = "[Lvl;")
    private static class11[] field4862;

    @OriginalMember(owner = "client!gq", name = "F", descriptor = "[Lfo;")
    public static class358[] field4849;

    @OriginalMember(owner = "client!gq", name = "t", descriptor = "[Lnf;")
    private static class406[] field4837;

    @OriginalMember(owner = "client!gq", name = "K", descriptor = "[Ltq;")
    private static class443[] field4854;

    @OriginalMember(owner = "client!gq", name = "C", descriptor = "[Z")
    private static boolean[] field4846;

    @OriginalMember(owner = "client!gq", name = "E", descriptor = "[[B")
    private byte[][] field4848;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "()I", line = 4)
    public static final int method1964() {
        int var0 = field4834[field4851] >> field4856 & 0x1;
        field4856++;
        field4851 += field4856 >> 3;
        field4856 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "([I)Lnv;", line = 16)
    public final class286 method1965(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field4864 == null) {
            this.field4843 = 0;
            this.field4836 = new float[field4852];
            this.field4864 = new byte[this.field4858];
            this.field4861 = 0;
            this.field4863 = 0;
        }
        while (this.field4863 < this.field4848.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1972(this.field4863);
            if (var3 != null) {
                int var4 = this.field4861;
                int var5 = var3.length;
                if (var5 > this.field4858 - var4) {
                    var5 = this.field4858 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field4864[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field4861;
                }
                this.field4861 = var4;
            }
            this.field4863++;
        }
        this.field4836 = null;
        byte[] var2 = this.field4864;
        this.field4864 = null;
        return new class286(this.field4842, var2, this.field4857, this.field4839, this.field4850);
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "()V", line = 78)
    public static void method1966() {
        field4834 = null;
        field4849 = null;
        field4862 = null;
        field4837 = null;
        field4854 = null;
        field4846 = null;
        field4859 = null;
        field4838 = null;
        field4831 = null;
        field4844 = null;
        field4853 = null;
        field4860 = null;
        field4841 = null;
        field4835 = null;
        field4845 = null;
        field4840 = null;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "([B)V", line = 102)
    private final void method1967(byte[] arg0) {
        class365 var2 = new class365(arg0);
        this.field4842 = var2.method2056((byte) -5);
        this.field4858 = var2.method2056((byte) -101);
        this.field4857 = var2.method2056((byte) 112);
        this.field4839 = var2.method2056((byte) 68);
        if (this.field4839 < 0) {
            this.field4839 = ~this.field4839;
            this.field4850 = true;
        }
        int var3 = var2.method2056((byte) -83);
        this.field4848 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method2099(255);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method2071(var7, var5, 0, -713458872);
            this.field4848[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lvh;)Z", line = 153)
    private static final boolean method1968(class240 arg0) {
        if (!field4832) {
            byte[] var1 = arg0.method1411(true, 0, 0);
            if (var1 == null) {
                return false;
            }
            method1974(var1);
            field4832 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)F", line = 168)
    public static final float method1969(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lvh;II)Lgq;", line = 179)
    public static final class355 method1970(class240 arg0, int arg1, int arg2) {
        if (method1968(arg0)) {
            byte[] var3 = arg0.method1411(true, arg2, arg1);
            return var3 == null ? null : new class355(var3);
        } else {
            arg0.method1404(arg1, arg2, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "(I)I", line = 197)
    public static final int method1971(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field4856) {
            int var4 = 8 - field4856;
            int var5 = (0x1 << var4) - 1;
            var1 += (field4834[field4851] >> field4856 & var5) << var2;
            field4856 = 0;
            field4851++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field4834[field4851] >> field4856 & var3) << var2;
            field4856 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "(I)[F", line = 225)
    private final float[] method1972(int arg0) {
        method1973(this.field4848[arg0], 0);
        method1964();
        int var2 = method1971(class108.method697(field4859.length - 1, true));
        boolean var3 = field4846[var2];
        int var4 = var3 ? field4852 : field4833;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1964() != 0;
            var6 = method1964() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field4833 >> 2);
            var9 = (field4833 >> 2) + (var4 >> 2);
            var10 = field4833 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field4833 >> 2);
            var12 = (field4833 >> 2) + (var4 - (var4 >> 2));
            var13 = field4833 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class443 var14 = field4854[field4859[var2]];
        int var15 = var14.field6438;
        int var16 = var14.field6437[var15];
        boolean var17 = !field4862[var16].method98();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field6436; var19++) {
            class406 var95 = field4837[var14.field6439[var19]];
            float[] var96 = field4838;
            var95.method2348(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field6438;
            int var21 = var14.field6437[var20];
            field4862[var21].method94(field4838, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field4838[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field4838;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field4860 : field4831;
            float[] var30 = var3 ? field4841 : field4844;
            float[] var31 = var3 ? field4835 : field4853;
            int[] var32 = var3 ? field4840 : field4845;
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
            int var35 = class108.method697(var4 - 1, true);
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
                field4838[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field4838[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field4843 > 0) {
            int var49 = this.field4843 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field4847) {
                for (int var50 = 0; var50 < this.field4855; var50++) {
                    int var51 = (this.field4843 >> 1) + var50;
                    var48[var50] += this.field4836[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field4838[var52];
                }
            }
        }
        float[] var54 = this.field4836;
        this.field4836 = field4838;
        field4838 = var54;
        this.field4843 = var4;
        this.field4855 = var12 - (var4 >> 1);
        this.field4847 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "([BI)V", line = 638)
    private static final void method1973(byte[] arg0, int arg1) {
        field4834 = arg0;
        field4851 = arg1;
        field4856 = 0;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "([B)V", line = 647)
    private static final void method1974(byte[] arg0) {
        method1973(arg0, 0);
        field4833 = 0x1 << method1971(4);
        field4852 = 0x1 << method1971(4);
        field4838 = new float[field4852];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field4833 : field4852;
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
            int var25 = class108.method697(var17 - 1, true);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class403.method2338(126, var25, var26);
            }
            if (var1 == 0) {
                field4831 = var18;
                field4844 = var20;
                field4853 = var22;
                field4845 = var24;
            } else {
                field4860 = var18;
                field4841 = var20;
                field4835 = var22;
                field4840 = var24;
            }
        }
        int var2 = method1971(8) + 1;
        field4849 = new class358[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field4849[var3] = new class358();
        }
        int var4 = method1971(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1971(16);
        }
        int var6 = method1971(6) + 1;
        field4862 = new class11[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field4862[var7] = new class11();
        }
        int var8 = method1971(6) + 1;
        field4837 = new class406[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field4837[var9] = new class406();
        }
        int var10 = method1971(6) + 1;
        field4854 = new class443[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field4854[var11] = new class443();
        }
        int var12 = method1971(6) + 1;
        field4846 = new boolean[var12];
        field4859 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field4846[var13] = method1964() != 0;
            method1971(16);
            method1971(16);
            field4859[var13] = method1971(8);
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lvh;I)Lgq;", line = 802)
    public static final class355 method1975(class240 arg0, int arg1) {
        if (method1968(arg0)) {
            byte[] var2 = arg0.method1388(arg1, (byte) -109);
            return var2 == null ? null : new class355(var2);
        } else {
            arg0.method1412(arg1, 1);
            return null;
        }
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "([B)V", line = 815)
    private class355(byte[] arg0) {
        this.method1967(arg0);
    }
}
