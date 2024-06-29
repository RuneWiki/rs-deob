import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class53 extends class242 {

    @OriginalMember(owner = "client!vh", name = "B", descriptor = "Z")
    private static boolean field937 = false;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    private int field925;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "I")
    private int field931;

    @OriginalMember(owner = "client!vh", name = "x", descriptor = "I")
    private int field933;

    @OriginalMember(owner = "client!vh", name = "y", descriptor = "I")
    private int field934;

    @OriginalMember(owner = "client!vh", name = "A", descriptor = "I")
    private static int field936;

    @OriginalMember(owner = "client!vh", name = "D", descriptor = "I")
    private int field939;

    @OriginalMember(owner = "client!vh", name = "E", descriptor = "I")
    private int field940;

    @OriginalMember(owner = "client!vh", name = "G", descriptor = "I")
    private static int field942;

    @OriginalMember(owner = "client!vh", name = "J", descriptor = "I")
    private static int field945;

    @OriginalMember(owner = "client!vh", name = "R", descriptor = "I")
    private static int field952;

    @OriginalMember(owner = "client!vh", name = "U", descriptor = "I")
    private int field955;

    @OriginalMember(owner = "client!vh", name = "W", descriptor = "I")
    private int field956;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "Z")
    private boolean field924;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "Z")
    private boolean field928;

    @OriginalMember(owner = "client!vh", name = "C", descriptor = "[B")
    private static byte[] field938;

    @OriginalMember(owner = "client!vh", name = "X", descriptor = "[B")
    private byte[] field957;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "[F")
    private static float[] field927;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "[F")
    private static float[] field929;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "[F")
    private static float[] field930;

    @OriginalMember(owner = "client!vh", name = "F", descriptor = "[F")
    private static float[] field941;

    @OriginalMember(owner = "client!vh", name = "L", descriptor = "[F")
    private static float[] field947;

    @OriginalMember(owner = "client!vh", name = "N", descriptor = "[F")
    private static float[] field948;

    @OriginalMember(owner = "client!vh", name = "S", descriptor = "[F")
    private float[] field953;

    @OriginalMember(owner = "client!vh", name = "T", descriptor = "[F")
    private static float[] field954;

    @OriginalMember(owner = "client!vh", name = "I", descriptor = "[I")
    private static int[] field944;

    @OriginalMember(owner = "client!vh", name = "K", descriptor = "[I")
    private static int[] field946;

    @OriginalMember(owner = "client!vh", name = "O", descriptor = "[I")
    private static int[] field949;

    @OriginalMember(owner = "client!vh", name = "P", descriptor = "[Lpg;")
    private static class204[] field950;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "[Lqj;")
    private static class255[] field926;

    @OriginalMember(owner = "client!vh", name = "Q", descriptor = "[Lwi;")
    public static class265[] field951;

    @OriginalMember(owner = "client!vh", name = "w", descriptor = "[Lvb;")
    private static class54[] field932;

    @OriginalMember(owner = "client!vh", name = "H", descriptor = "[Z")
    private static boolean[] field943;

    @OriginalMember(owner = "client!vh", name = "z", descriptor = "[[B")
    private byte[][] field935;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)F", line = 4)
    public static final float method420(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "()I", line = 20)
    public static final int method421() {
        int var0 = field938[field942] >> field945 & 0x1;
        field945++;
        field942 += field945 >> 3;
        field945 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)[F", line = 30)
    private final float[] method422(int arg0) {
        method425(this.field935[arg0], 0);
        method421();
        int var2 = method424(class27.method239(field944.length - 1, (byte) -110));
        boolean var3 = field943[var2];
        int var4 = var3 ? field952 : field936;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method421() != 0;
            var6 = method421() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field936 >> 2);
            var9 = (field936 >> 2) + (var4 >> 2);
            var10 = field936 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field936 >> 2);
            var12 = (field936 >> 2) + (var4 - (var4 >> 2));
            var13 = field936 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class54 var14 = field932[field944[var2]];
        int var15 = var14.field959;
        int var16 = var14.field958[var15];
        boolean var17 = !field926[var16].method1816();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field960; var19++) {
            class204 var20 = field950[var14.field961[var19]];
            float[] var21 = field954;
            var20.method1425(var21, var4 >> 1, var18);
        }
        if (!var17) {
            int var22 = var14.field959;
            int var23 = var14.field958[var22];
            field926[var23].method1810(field954, var4 >> 1);
        }
        if (var17) {
            for (int var24 = var4 >> 1; var24 < var4; var24++) {
                field954[var24] = 0.0F;
            }
        } else {
            int var25 = var4 >> 1;
            int var26 = var4 >> 2;
            int var27 = var4 >> 3;
            float[] var28 = field954;
            for (int var29 = 0; var29 < var25; var29++) {
                var28[var29] *= 0.5F;
            }
            for (int var30 = var25; var30 < var4; var30++) {
                var28[var30] = -var28[var4 - var30 - 1];
            }
            float[] var31 = var3 ? field948 : field929;
            float[] var32 = var3 ? field947 : field927;
            float[] var33 = var3 ? field941 : field930;
            int[] var34 = var3 ? field949 : field946;
            for (int var35 = 0; var35 < var26; var35++) {
                float var36 = var28[var35 * 4] - var28[var4 - var35 * 4 - 1];
                float var37 = var28[var35 * 4 + 2] - var28[var4 - var35 * 4 - 3];
                float var38 = var31[var35 * 2];
                float var39 = var31[var35 * 2 + 1];
                var28[var4 - var35 * 4 - 1] = var36 * var38 - var37 * var39;
                var28[var4 - var35 * 4 - 3] = var36 * var39 + var37 * var38;
            }
            for (int var40 = 0; var40 < var27; var40++) {
                float var41 = var28[var40 * 4 + var25 + 3];
                float var42 = var28[var40 * 4 + var25 + 1];
                float var43 = var28[var40 * 4 + 3];
                float var44 = var28[var40 * 4 + 1];
                var28[var40 * 4 + var25 + 3] = var41 + var43;
                var28[var40 * 4 + var25 + 1] = var42 + var44;
                float var45 = var31[var25 - var40 * 4 - 4];
                float var46 = var31[var25 - var40 * 4 - 3];
                var28[var40 * 4 + 3] = (var41 - var43) * var45 - (var42 - var44) * var46;
                var28[var40 * 4 + 1] = (var41 - var43) * var46 + (var42 - var44) * var45;
            }
            int var47 = class27.method239(var4 - 1, (byte) -63);
            for (int var48 = 0; var48 < var47 - 3; var48++) {
                int var49 = var4 >> var48 + 2;
                int var50 = 0x8 << var48;
                for (int var51 = 0; var51 < 0x2 << var48; var51++) {
                    int var52 = var4 - var49 * 2 * var51;
                    int var53 = var4 - (var51 * 2 + 1) * var49;
                    for (int var54 = 0; var54 < var4 >> var48 + 4; var54++) {
                        int var55 = var54 * 4;
                        float var56 = var28[var52 - var55 - 1];
                        float var57 = var28[var52 - var55 - 3];
                        float var58 = var28[var53 - var55 - 1];
                        float var59 = var28[var53 - var55 - 3];
                        var28[var52 - var55 - 1] = var56 + var58;
                        var28[var52 - var55 - 3] = var57 + var59;
                        float var60 = var31[var50 * var54];
                        float var61 = var31[var50 * var54 + 1];
                        var28[var53 - var55 - 1] = (var56 - var58) * var60 - (var57 - var59) * var61;
                        var28[var53 - var55 - 3] = (var56 - var58) * var61 + (var57 - var59) * var60;
                    }
                }
            }
            for (int var62 = 1; var62 < var27 - 1; var62++) {
                int var63 = var34[var62];
                if (var62 < var63) {
                    int var64 = var62 * 8;
                    int var65 = var63 * 8;
                    float var66 = var28[var64 + 1];
                    var28[var64 + 1] = var28[var65 + 1];
                    var28[var65 + 1] = var66;
                    float var67 = var28[var64 + 3];
                    var28[var64 + 3] = var28[var65 + 3];
                    var28[var65 + 3] = var67;
                    float var68 = var28[var64 + 5];
                    var28[var64 + 5] = var28[var65 + 5];
                    var28[var65 + 5] = var68;
                    float var69 = var28[var64 + 7];
                    var28[var64 + 7] = var28[var65 + 7];
                    var28[var65 + 7] = var69;
                }
            }
            for (int var70 = 0; var70 < var25; var70++) {
                var28[var70] = var28[var70 * 2 + 1];
            }
            for (int var71 = 0; var71 < var27; var71++) {
                var28[var4 - var71 * 2 - 1] = var28[var71 * 4];
                var28[var4 - var71 * 2 - 2] = var28[var71 * 4 + 1];
                var28[var4 - var26 - var71 * 2 - 1] = var28[var71 * 4 + 2];
                var28[var4 - var26 - var71 * 2 - 2] = var28[var71 * 4 + 3];
            }
            for (int var72 = 0; var72 < var27; var72++) {
                float var73 = var33[var72 * 2];
                float var74 = var33[var72 * 2 + 1];
                float var75 = var28[var72 * 2 + var25];
                float var76 = var28[var72 * 2 + var25 + 1];
                float var77 = var28[var4 - var72 * 2 - 2];
                float var78 = var28[var4 - var72 * 2 - 1];
                float var79 = (var75 - var77) * var74 + (var76 + var78) * var73;
                var28[var72 * 2 + var25] = (var75 + var77 + var79) * 0.5F;
                var28[var4 - var72 * 2 - 2] = (var75 + var77 - var79) * 0.5F;
                float var80 = (var76 + var78) * var74 - (var75 - var77) * var73;
                var28[var72 * 2 + var25 + 1] = (var76 + var80 - var78) * 0.5F;
                var28[var4 - var72 * 2 - 1] = (var78 + var80 - var76) * 0.5F;
            }
            for (int var81 = 0; var81 < var26; var81++) {
                var28[var81] = var32[var81 * 2] * var28[var81 * 2 + var25] + var32[var81 * 2 + 1] * var28[var81 * 2 + var25 + 1];
                var28[var25 - var81 - 1] = var28[var81 * 2 + var25] * var32[var81 * 2 + 1] - var32[var81 * 2] * var28[var81 * 2 + var25 + 1];
            }
            for (int var82 = 0; var82 < var26; var82++) {
                var28[var4 + var82 - var26] = -var28[var82];
            }
            for (int var83 = 0; var83 < var26; var83++) {
                var28[var83] = var28[var26 + var83];
            }
            for (int var84 = 0; var84 < var26; var84++) {
                var28[var26 + var84] = -var28[var26 - var84 - 1];
            }
            for (int var85 = 0; var85 < var26; var85++) {
                var28[var25 + var85] = var28[var4 - var85 - 1];
            }
            for (int var86 = var8; var86 < var9; var86++) {
                float var87 = (float) Math.sin(((double) (var86 - var8) + 0.5D) / (double) var10 * 0.5D * 3.141592653589793D);
                field954[var86] *= (float) Math.sin((double) var87 * 1.5707963267948966D * (double) var87);
            }
            for (int var88 = var11; var88 < var12; var88++) {
                float var89 = (float) Math.sin(((double) (var88 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field954[var88] *= (float) Math.sin((double) var89 * 1.5707963267948966D * (double) var89);
            }
        }
        float[] var90 = null;
        if (this.field939 > 0) {
            int var91 = this.field939 + var4 >> 2;
            var90 = new float[var91];
            if (!this.field924) {
                for (int var92 = 0; var92 < this.field940; var92++) {
                    int var93 = (this.field939 >> 1) + var92;
                    var90[var92] += this.field953[var93];
                }
            }
            if (!var17) {
                for (int var94 = var8; var94 < var4 >> 1; var94++) {
                    int var95 = var90.length + var94 - (var4 >> 1);
                    var90[var95] += field954[var94];
                }
            }
        }
        float[] var96 = this.field953;
        this.field953 = field954;
        field954 = var96;
        this.field939 = var4;
        this.field940 = var12 - (var4 >> 1);
        this.field924 = var17;
        return var90;
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "()V", line = 442)
    public static void method423() {
        field938 = null;
        field951 = null;
        field926 = null;
        field950 = null;
        field932 = null;
        field943 = null;
        field944 = null;
        field954 = null;
        field929 = null;
        field927 = null;
        field930 = null;
        field948 = null;
        field947 = null;
        field941 = null;
        field946 = null;
        field949 = null;
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)I", line = 464)
    public static final int method424(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field945) {
            int var3 = 8 - field945;
            int var4 = (0x1 << var3) - 1;
            var1 += (field938[field942] >> field945 & var4) << var2;
            field945 = 0;
            field942++;
            var2 += var3;
            arg0 -= var3;
        }
        if (arg0 > 0) {
            int var5 = (0x1 << arg0) - 1;
            var1 += (field938[field942] >> field945 & var5) << var2;
            field945 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([BI)V", line = 491)
    private static final void method425(byte[] arg0, int arg1) {
        field938 = arg0;
        field942 = arg1;
        field945 = 0;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lek;II)Lvh;", line = 503)
    public static final class53 method426(class185 arg0, int arg1, int arg2) {
        if (method430(arg0)) {
            byte[] var3 = arg0.method1275(arg2, arg1, -5211);
            return var3 == null ? null : new class53(var3);
        } else {
            arg0.method1276(arg2, -25658, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([B)V", line = 523)
    private static final void method427(byte[] arg0) {
        method425(arg0, 0);
        field936 = 0x1 << method424(4);
        field952 = 0x1 << method424(4);
        field954 = new float[field952];
        for (int var1 = 0; var1 < 2; var1++) {
            int var2 = var1 == 0 ? field936 : field952;
            int var3 = var2 >> 1;
            int var4 = var2 >> 2;
            int var5 = var2 >> 3;
            float[] var6 = new float[var3];
            for (int var7 = 0; var7 < var4; var7++) {
                var6[var7 * 2] = (float) Math.cos((double) (var7 * 4) * 3.141592653589793D / (double) var2);
                var6[var7 * 2 + 1] = -((float) Math.sin((double) (var7 * 4) * 3.141592653589793D / (double) var2));
            }
            float[] var8 = new float[var3];
            for (int var9 = 0; var9 < var4; var9++) {
                var8[var9 * 2] = (float) Math.cos((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
                var8[var9 * 2 + 1] = (float) Math.sin((double) (var9 * 2 + 1) * 3.141592653589793D / (double) (var2 * 2));
            }
            float[] var10 = new float[var4];
            for (int var11 = 0; var11 < var5; var11++) {
                var10[var11 * 2] = (float) Math.cos((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2);
                var10[var11 * 2 + 1] = -((float) Math.sin((double) (var11 * 4 + 2) * 3.141592653589793D / (double) var2));
            }
            int[] var12 = new int[var5];
            int var13 = class27.method239(var5 - 1, (byte) -119);
            for (int var14 = 0; var14 < var5; var14++) {
                var12[var14] = class60.method457((byte) -123, var13, var14);
            }
            if (var1 == 0) {
                field929 = var6;
                field927 = var8;
                field930 = var10;
                field946 = var12;
            } else {
                field948 = var6;
                field947 = var8;
                field941 = var10;
                field949 = var12;
            }
        }
        int var15 = method424(8) + 1;
        field951 = new class265[var15];
        for (int var16 = 0; var16 < var15; var16++) {
            field951[var16] = new class265();
        }
        int var17 = method424(6) + 1;
        for (int var18 = 0; var18 < var17; var18++) {
            method424(16);
        }
        int var19 = method424(6) + 1;
        field926 = new class255[var19];
        for (int var20 = 0; var20 < var19; var20++) {
            field926[var20] = new class255();
        }
        int var21 = method424(6) + 1;
        field950 = new class204[var21];
        for (int var22 = 0; var22 < var21; var22++) {
            field950[var22] = new class204();
        }
        int var23 = method424(6) + 1;
        field932 = new class54[var23];
        for (int var24 = 0; var24 < var23; var24++) {
            field932[var24] = new class54();
        }
        int var25 = method424(6) + 1;
        field943 = new boolean[var25];
        field944 = new int[var25];
        for (int var26 = 0; var26 < var25; var26++) {
            field943[var26] = method421() != 0;
            method424(16);
            method424(16);
            field944[var26] = method424(8);
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "([B)V", line = 684)
    private final void method428(byte[] arg0) {
        class14 var2 = new class14(arg0);
        this.field934 = var2.method128((byte) 4);
        this.field931 = var2.method128((byte) 4);
        this.field933 = var2.method128((byte) 4);
        this.field925 = var2.method128((byte) 4);
        if (this.field925 < 0) {
            this.field925 = ~this.field925;
            this.field928 = true;
        }
        int var3 = var2.method128((byte) 4);
        this.field935 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method93(false);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method101(-31322, 0, var7, var5);
            this.field935[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([I)Ltg;", line = 729)
    public final class316 method429(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field957 == null) {
            this.field939 = 0;
            this.field953 = new float[field952];
            this.field957 = new byte[this.field931];
            this.field955 = 0;
            this.field956 = 0;
        }
        while (this.field956 < this.field935.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var2 = this.method422(this.field956);
            if (var2 != null) {
                int var3 = this.field955;
                int var4 = var2.length;
                if (var4 > this.field931 - var3) {
                    var4 = this.field931 - var3;
                }
                for (int var5 = 0; var5 < var4; var5++) {
                    int var6 = (int) (var2[var5] * 128.0F + 128.0F);
                    if ((var6 & 0xFFFFFF00) != 0) {
                        var6 = ~var6 >> 31;
                    }
                    this.field957[var3++] = (byte) (var6 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var3 - this.field955;
                }
                this.field955 = var3;
            }
            this.field956++;
        }
        this.field953 = null;
        byte[] var7 = this.field957;
        this.field957 = null;
        return new class316(this.field934, var7, this.field933, this.field925, this.field928);
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "([B)V", line = 789)
    private class53(byte[] arg0) {
        this.method428(arg0);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lek;)Z", line = 796)
    private static final boolean method430(class185 arg0) {
        if (!field937) {
            byte[] var1 = arg0.method1275(0, 0, -5211);
            if (var1 == null) {
                return false;
            }
            method427(var1);
            field937 = true;
        }
        return true;
    }
}
