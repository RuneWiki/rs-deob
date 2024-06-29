import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class277 extends class73 {

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "Z")
    private static boolean field4927 = false;

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "I")
    private static int field4917;

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "I")
    private int field4920;

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "I")
    private int field4922;

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "I")
    private static int field4923;

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "I")
    private static int field4926;

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "I")
    private int field4928;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
    private int field4929;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "I")
    private static int field4930;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "I")
    private int field4931;

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "I")
    private int field4934;

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "I")
    private int field4936;

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "I")
    private int field4937;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "Z")
    private boolean field4913;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "Z")
    private boolean field4932;

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "[B")
    private static byte[] field4924;

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "[B")
    private byte[] field4938;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "[F")
    private static float[] field4905;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "[F")
    private float[] field4906;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "[F")
    private static float[] field4908;

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "[F")
    private static float[] field4918;

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "[F")
    private static float[] field4919;

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "[F")
    private static float[] field4921;

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "[F")
    private static float[] field4925;

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "[F")
    private static float[] field4933;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "[I")
    private static int[] field4909;

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "[I")
    private static int[] field4916;

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "[I")
    private static int[] field4935;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "[Lik;")
    private static class218[] field4907;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "[Lkg;")
    private static class61[] field4915;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "[Lij;")
    public static class67[] field4912;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "[Lpc;")
    private static class74[] field4911;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "[Z")
    private static boolean[] field4914;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "[[B")
    private byte[][] field4910;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()I")
    public static final int method1895() {
        int var0 = field4924[field4926] >> field4923 & 0x1;
        field4923++;
        field4926 += field4923 >> 3;
        field4923 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)I")
    public static final int method1896(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field4923) {
            int var4 = 8 - field4923;
            int var5 = (0x1 << var4) - 1;
            var1 += (field4924[field4926] >> field4923 & var5) << var2;
            field4923 = 0;
            field4926++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field4924[field4926] >> field4923 & var3) << var2;
            field4923 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lhi;)Z")
    private static final boolean method1897(class250 arg0) {
        if (!field4927) {
            byte[] var1 = arg0.method1688(0, 0, 0);
            if (var1 == null) {
                return false;
            }
            method1901(var1);
            field4927 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([I)Lsa;")
    public final class91 method1898(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field4938 == null) {
            this.field4934 = 0;
            this.field4906 = new float[field4917];
            this.field4938 = new byte[this.field4928];
            this.field4936 = 0;
            this.field4937 = 0;
        }
        while (this.field4937 < this.field4910.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1905(this.field4937);
            if (var3 != null) {
                int var4 = this.field4936;
                int var5 = var3.length;
                if (var5 > this.field4928 - var4) {
                    var5 = this.field4928 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field4938[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field4936;
                }
                this.field4936 = var4;
            }
            this.field4937++;
        }
        this.field4906 = null;
        byte[] var2 = this.field4938;
        this.field4938 = null;
        return new class91(this.field4929, var2, this.field4922, this.field4931, this.field4913);
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)F")
    public static final float method1899(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([BI)V")
    private static final void method1900(byte[] arg0, int arg1) {
        field4924 = arg0;
        field4926 = arg1;
        field4923 = 0;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([B)V")
    private static final void method1901(byte[] arg0) {
        method1900(arg0, 0);
        field4930 = 0x1 << method1896(4);
        field4917 = 0x1 << method1896(4);
        field4925 = new float[field4917];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field4930 : field4917;
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
            int var25 = class187.method1351(false, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class36.method229(9016, var26, var25);
            }
            if (var1 == 0) {
                field4905 = var18;
                field4918 = var20;
                field4919 = var22;
                field4909 = var24;
            } else {
                field4933 = var18;
                field4921 = var20;
                field4908 = var22;
                field4916 = var24;
            }
        }
        int var2 = method1896(8) + 1;
        field4912 = new class67[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field4912[var3] = new class67();
        }
        int var4 = method1896(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1896(16);
        }
        int var6 = method1896(6) + 1;
        field4911 = new class74[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field4911[var7] = new class74();
        }
        int var8 = method1896(6) + 1;
        field4915 = new class61[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field4915[var9] = new class61();
        }
        int var10 = method1896(6) + 1;
        field4907 = new class218[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field4907[var11] = new class218();
        }
        int var12 = method1896(6) + 1;
        field4914 = new boolean[var12];
        field4935 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field4914[var13] = method1895() != 0;
            method1896(16);
            method1896(16);
            field4935[var13] = method1896(8);
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "([B)V")
    private final void method1902(byte[] arg0) {
        class118 var2 = new class118(arg0);
        this.field4929 = var2.method875((byte) 106);
        this.field4928 = var2.method875((byte) 72);
        this.field4922 = var2.method875((byte) 15);
        this.field4931 = var2.method875((byte) 79);
        if (this.field4931 < 0) {
            this.field4931 = ~this.field4931;
            this.field4913 = true;
        }
        int var3 = var2.method875((byte) 113);
        this.field4910 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method867(false);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method828(var5, 0, var7, -29518);
            this.field4910[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "()V")
    public static void method1903() {
        field4924 = null;
        field4912 = null;
        field4911 = null;
        field4915 = null;
        field4907 = null;
        field4914 = null;
        field4935 = null;
        field4925 = null;
        field4905 = null;
        field4918 = null;
        field4919 = null;
        field4933 = null;
        field4921 = null;
        field4908 = null;
        field4909 = null;
        field4916 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lhi;II)Lra;")
    public static final class277 method1904(class250 arg0, int arg1, int arg2) {
        if (method1897(arg0)) {
            byte[] var3 = arg0.method1688(0, arg2, arg1);
            return var3 == null ? null : new class277(var3);
        } else {
            arg0.method1687(5, arg2, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)[F")
    private final float[] method1905(int arg0) {
        method1900(this.field4910[arg0], 0);
        method1895();
        int var2 = method1896(class187.method1351(false, field4935.length - 1));
        boolean var3 = field4914[var2];
        int var4 = var3 ? field4917 : field4930;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1895() != 0;
            var6 = method1895() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field4930 >> 2);
            var9 = (field4930 >> 2) + (var4 >> 2);
            var10 = field4930 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field4930 >> 2);
            var12 = (field4930 >> 2) + (var4 - (var4 >> 2));
            var13 = field4930 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class218 var14 = field4907[field4935[var2]];
        int var15 = var14.field3983;
        int var16 = var14.field3982[var15];
        boolean var17 = !field4911[var16].method484();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field3981; var19++) {
            class61 var95 = field4915[var14.field3980[var19]];
            float[] var96 = field4925;
            var95.method424(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field3983;
            int var21 = var14.field3982[var20];
            field4911[var21].method482(field4925, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field4925[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field4925;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field4933 : field4905;
            float[] var30 = var3 ? field4921 : field4918;
            float[] var31 = var3 ? field4908 : field4919;
            int[] var32 = var3 ? field4916 : field4909;
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
            int var35 = class187.method1351(false, var4 - 1);
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
                field4925[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field4925[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field4934 > 0) {
            int var49 = this.field4934 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field4932) {
                for (int var50 = 0; var50 < this.field4920; var50++) {
                    int var51 = (this.field4934 >> 1) + var50;
                    var48[var50] += this.field4906[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field4925[var52];
                }
            }
        }
        float[] var54 = this.field4906;
        this.field4906 = field4925;
        field4925 = var54;
        this.field4934 = var4;
        this.field4920 = var12 - (var4 >> 1);
        this.field4932 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "([B)V")
    private class277(byte[] arg0) {
        this.method1902(arg0);
    }
}
