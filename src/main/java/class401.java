import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class401 extends class86 {

    @OriginalMember(owner = "client!nu", name = "w", descriptor = "Z")
    private static boolean field5897 = false;

    @OriginalMember(owner = "client!nu", name = "p", descriptor = "I")
    private int field5890;

    @OriginalMember(owner = "client!nu", name = "z", descriptor = "I")
    private static int field5900;

    @OriginalMember(owner = "client!nu", name = "A", descriptor = "I")
    private int field5901;

    @OriginalMember(owner = "client!nu", name = "B", descriptor = "I")
    private int field5902;

    @OriginalMember(owner = "client!nu", name = "H", descriptor = "I")
    private static int field5908;

    @OriginalMember(owner = "client!nu", name = "L", descriptor = "I")
    private static int field5911;

    @OriginalMember(owner = "client!nu", name = "N", descriptor = "I")
    private int field5913;

    @OriginalMember(owner = "client!nu", name = "O", descriptor = "I")
    private static int field5914;

    @OriginalMember(owner = "client!nu", name = "S", descriptor = "I")
    private int field5918;

    @OriginalMember(owner = "client!nu", name = "T", descriptor = "I")
    private int field5919;

    @OriginalMember(owner = "client!nu", name = "V", descriptor = "I")
    private int field5921;

    @OriginalMember(owner = "client!nu", name = "W", descriptor = "I")
    private int field5922;

    @OriginalMember(owner = "client!nu", name = "y", descriptor = "Z")
    private boolean field5899;

    @OriginalMember(owner = "client!nu", name = "R", descriptor = "Z")
    private boolean field5917;

    @OriginalMember(owner = "client!nu", name = "F", descriptor = "[B")
    private static byte[] field5906;

    @OriginalMember(owner = "client!nu", name = "U", descriptor = "[B")
    private byte[] field5920;

    @OriginalMember(owner = "client!nu", name = "s", descriptor = "[F")
    private static float[] field5893;

    @OriginalMember(owner = "client!nu", name = "v", descriptor = "[F")
    private static float[] field5896;

    @OriginalMember(owner = "client!nu", name = "C", descriptor = "[F")
    private static float[] field5903;

    @OriginalMember(owner = "client!nu", name = "D", descriptor = "[F")
    private float[] field5904;

    @OriginalMember(owner = "client!nu", name = "G", descriptor = "[F")
    private static float[] field5907;

    @OriginalMember(owner = "client!nu", name = "K", descriptor = "[F")
    private static float[] field5910;

    @OriginalMember(owner = "client!nu", name = "P", descriptor = "[F")
    private static float[] field5915;

    @OriginalMember(owner = "client!nu", name = "Q", descriptor = "[F")
    private static float[] field5916;

    @OriginalMember(owner = "client!nu", name = "o", descriptor = "[I")
    private static int[] field5889;

    @OriginalMember(owner = "client!nu", name = "x", descriptor = "[I")
    private static int[] field5898;

    @OriginalMember(owner = "client!nu", name = "M", descriptor = "[I")
    private static int[] field5912;

    @OriginalMember(owner = "client!nu", name = "r", descriptor = "[Lsb;")
    private static class182[] field5892;

    @OriginalMember(owner = "client!nu", name = "E", descriptor = "[Len;")
    private static class200[] field5905;

    @OriginalMember(owner = "client!nu", name = "t", descriptor = "[Lgt;")
    private static class301[] field5894;

    @OriginalMember(owner = "client!nu", name = "I", descriptor = "[Lfk;")
    public static class446[] field5909;

    @OriginalMember(owner = "client!nu", name = "q", descriptor = "[Z")
    private static boolean[] field5891;

    @OriginalMember(owner = "client!nu", name = "u", descriptor = "[[B")
    private byte[][] field5895;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)[F", line = 11)
    private final float[] method2389(int arg0) {
        method2397(this.field5895[arg0], 0);
        method2396();
        int var2 = method2399(class20.method146(true, field5912.length - 1));
        boolean var3 = field5891[var2];
        int var4 = var3 ? field5911 : field5914;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method2396() != 0;
            var6 = method2396() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field5914 >> 2);
            var9 = (field5914 >> 2) + (var4 >> 2);
            var10 = field5914 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field5914 >> 2);
            var12 = (field5914 >> 2) + (var4 - (var4 >> 2));
            var13 = field5914 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class182 var14 = field5892[field5912[var2]];
        int var15 = var14.field2598;
        int var16 = var14.field2595[var15];
        boolean var17 = !field5894[var16].method1820();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2597; var19++) {
            class200 var95 = field5905[var14.field2596[var19]];
            float[] var96 = field5916;
            var95.method1239(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2598;
            int var21 = var14.field2595[var20];
            field5894[var21].method1815(field5916, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field5916[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field5916;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field5903 : field5915;
            float[] var30 = var3 ? field5896 : field5907;
            float[] var31 = var3 ? field5910 : field5893;
            int[] var32 = var3 ? field5889 : field5898;
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
            int var35 = class20.method146(true, var4 - 1);
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
                field5916[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field5916[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field5901 > 0) {
            int var49 = this.field5901 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field5899) {
                for (int var50 = 0; var50 < this.field5919; var50++) {
                    int var51 = (this.field5901 >> 1) + var50;
                    var48[var50] += this.field5904[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field5916[var52];
                }
            }
        }
        float[] var54 = this.field5904;
        this.field5904 = field5916;
        field5916 = var54;
        this.field5901 = var4;
        this.field5919 = var12 - (var4 >> 1);
        this.field5899 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "([B)V", line = 426)
    private final void method2390(byte[] arg0) {
        class156 var2 = new class156(arg0);
        this.field5890 = var2.method950(186);
        this.field5902 = var2.method950(186);
        this.field5918 = var2.method950(186);
        this.field5913 = var2.method950(186);
        if (this.field5913 < 0) {
            this.field5913 = ~this.field5913;
            this.field5917 = true;
        }
        int var3 = var2.method950(186);
        this.field5895 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method941((byte) 123);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method942(var7, -5403, var5, 0);
            this.field5895[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "([I)Lhh;", line = 468)
    public final class80 method2391(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field5920 == null) {
            this.field5901 = 0;
            this.field5904 = new float[field5911];
            this.field5920 = new byte[this.field5902];
            this.field5922 = 0;
            this.field5921 = 0;
        }
        while (this.field5921 < this.field5895.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method2389(this.field5921);
            if (var3 != null) {
                int var4 = this.field5922;
                int var5 = var3.length;
                if (var5 > this.field5902 - var4) {
                    var5 = this.field5902 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field5920[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field5922;
                }
                this.field5922 = var4;
            }
            this.field5921++;
        }
        this.field5904 = null;
        byte[] var2 = this.field5920;
        this.field5920 = null;
        return new class80(this.field5890, var2, this.field5918, this.field5913, this.field5917);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lhe;)Z", line = 527)
    private static final boolean method2392(class239 arg0) {
        if (!field5897) {
            byte[] var1 = arg0.method1470(4, 0, 0);
            if (var1 == null) {
                return false;
            }
            method2398(var1);
            field5897 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lhe;I)Lnu;", line = 543)
    public static final class401 method2393(class239 arg0, int arg1) {
        if (method2392(arg0)) {
            byte[] var2 = arg0.method1465(0, arg1);
            return var2 == null ? null : new class401(var2);
        } else {
            arg0.method1442(arg1, (byte) -119);
            return null;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(Lhe;II)Lnu;", line = 557)
    public static final class401 method2394(class239 arg0, int arg1, int arg2) {
        if (method2392(arg0)) {
            byte[] var3 = arg0.method1470(4, arg2, arg1);
            return var3 == null ? null : new class401(var3);
        } else {
            arg0.method1445(46, arg2, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "(I)F", line = 572)
    public static final float method2395(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "()I", line = 588)
    public static final int method2396() {
        int var0 = field5906[field5908] >> field5900 & 0x1;
        field5900++;
        field5908 += field5900 >> 3;
        field5900 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "([BI)V", line = 606)
    private static final void method2397(byte[] arg0, int arg1) {
        field5906 = arg0;
        field5908 = arg1;
        field5900 = 0;
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "([B)V", line = 615)
    private static final void method2398(byte[] arg0) {
        method2397(arg0, 0);
        field5914 = 0x1 << method2399(4);
        field5911 = 0x1 << method2399(4);
        field5916 = new float[field5911];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field5914 : field5911;
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
            int var25 = class20.method146(true, var17 - 1);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class157.method1009((byte) 40, var25, var26);
            }
            if (var1 == 0) {
                field5915 = var18;
                field5907 = var20;
                field5893 = var22;
                field5898 = var24;
            } else {
                field5903 = var18;
                field5896 = var20;
                field5910 = var22;
                field5889 = var24;
            }
        }
        int var2 = method2399(8) + 1;
        field5909 = new class446[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field5909[var3] = new class446();
        }
        int var4 = method2399(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method2399(16);
        }
        int var6 = method2399(6) + 1;
        field5894 = new class301[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field5894[var7] = new class301();
        }
        int var8 = method2399(6) + 1;
        field5905 = new class200[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field5905[var9] = new class200();
        }
        int var10 = method2399(6) + 1;
        field5892 = new class182[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field5892[var11] = new class182();
        }
        int var12 = method2399(6) + 1;
        field5891 = new boolean[var12];
        field5912 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field5891[var13] = method2396() != 0;
            method2399(16);
            method2399(16);
            field5912[var13] = method2399(8);
        }
    }

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "(I)I", line = 771)
    public static final int method2399(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field5900) {
            int var4 = 8 - field5900;
            int var5 = (0x1 << var4) - 1;
            var1 += (field5906[field5908] >> field5900 & var5) << var2;
            field5900 = 0;
            field5908++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field5906[field5908] >> field5900 & var3) << var2;
            field5900 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "([B)V", line = 798)
    private class401(byte[] arg0) {
        this.method2390(arg0);
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "()V", line = 804)
    public static void method2400() {
        field5906 = null;
        field5909 = null;
        field5894 = null;
        field5905 = null;
        field5892 = null;
        field5891 = null;
        field5912 = null;
        field5916 = null;
        field5915 = null;
        field5907 = null;
        field5893 = null;
        field5903 = null;
        field5896 = null;
        field5910 = null;
        field5898 = null;
        field5889 = null;
    }
}
