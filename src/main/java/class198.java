import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class198 extends class540 {

    @OriginalMember(owner = "client!vp", name = "G", descriptor = "Z")
    private static boolean field2910 = false;

    @OriginalMember(owner = "client!vp", name = "i", descriptor = "I")
    private int field2886;

    @OriginalMember(owner = "client!vp", name = "n", descriptor = "I")
    private static int field2891;

    @OriginalMember(owner = "client!vp", name = "o", descriptor = "I")
    private int field2892;

    @OriginalMember(owner = "client!vp", name = "q", descriptor = "I")
    private int field2894;

    @OriginalMember(owner = "client!vp", name = "s", descriptor = "I")
    private static int field2896;

    @OriginalMember(owner = "client!vp", name = "w", descriptor = "I")
    private int field2900;

    @OriginalMember(owner = "client!vp", name = "z", descriptor = "I")
    private static int field2903;

    @OriginalMember(owner = "client!vp", name = "A", descriptor = "I")
    private int field2904;

    @OriginalMember(owner = "client!vp", name = "B", descriptor = "I")
    private int field2905;

    @OriginalMember(owner = "client!vp", name = "E", descriptor = "I")
    private static int field2908;

    @OriginalMember(owner = "client!vp", name = "J", descriptor = "I")
    private int field2913;

    @OriginalMember(owner = "client!vp", name = "K", descriptor = "I")
    private int field2914;

    @OriginalMember(owner = "client!vp", name = "C", descriptor = "Z")
    private boolean field2906;

    @OriginalMember(owner = "client!vp", name = "F", descriptor = "Z")
    private boolean field2909;

    @OriginalMember(owner = "client!vp", name = "M", descriptor = "[B")
    private byte[] field2916;

    @OriginalMember(owner = "client!vp", name = "O", descriptor = "[B")
    private static byte[] field2918;

    @OriginalMember(owner = "client!vp", name = "j", descriptor = "[F")
    private static float[] field2887;

    @OriginalMember(owner = "client!vp", name = "k", descriptor = "[F")
    private static float[] field2888;

    @OriginalMember(owner = "client!vp", name = "t", descriptor = "[F")
    private static float[] field2897;

    @OriginalMember(owner = "client!vp", name = "u", descriptor = "[F")
    private float[] field2898;

    @OriginalMember(owner = "client!vp", name = "v", descriptor = "[F")
    private static float[] field2899;

    @OriginalMember(owner = "client!vp", name = "x", descriptor = "[F")
    private static float[] field2901;

    @OriginalMember(owner = "client!vp", name = "L", descriptor = "[F")
    private static float[] field2915;

    @OriginalMember(owner = "client!vp", name = "N", descriptor = "[F")
    private static float[] field2917;

    @OriginalMember(owner = "client!vp", name = "m", descriptor = "[I")
    private static int[] field2890;

    @OriginalMember(owner = "client!vp", name = "r", descriptor = "[I")
    private static int[] field2895;

    @OriginalMember(owner = "client!vp", name = "D", descriptor = "[I")
    private static int[] field2907;

    @OriginalMember(owner = "client!vp", name = "l", descriptor = "[Ljh;")
    private static class168[] field2889;

    @OriginalMember(owner = "client!vp", name = "P", descriptor = "[Ldh;")
    private static class337[] field2919;

    @OriginalMember(owner = "client!vp", name = "p", descriptor = "[Lud;")
    private static class39[] field2893;

    @OriginalMember(owner = "client!vp", name = "y", descriptor = "[Lvga;")
    public static class94[] field2902;

    @OriginalMember(owner = "client!vp", name = "H", descriptor = "[Z")
    private static boolean[] field2911;

    @OriginalMember(owner = "client!vp", name = "I", descriptor = "[[B")
    private byte[][] field2912;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lcb;II)Lvp;", line = 3)
    public static final class198 method1428(class544 arg0, int arg1, int arg2) {
        if (method1432(arg0)) {
            byte[] var3 = arg0.method3150(arg2, -89, arg1);
            return var3 == null ? null : new class198(var3);
        } else {
            arg0.method3135(-1, arg2, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "([BI)V", line = 20)
    private static final void method1429(byte[] arg0, int arg1) {
        field2918 = arg0;
        field2896 = arg1;
        field2908 = 0;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "()I", line = 27)
    public static final int method1430() {
        int var0 = field2918[field2896] >> field2908 & 0x1;
        field2908++;
        field2896 += field2908 >> 3;
        field2908 &= 0x7;
        return var0;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "([B)V", line = 36)
    private final void method1431(byte[] arg0) {
        class120 var2 = new class120(arg0);
        this.field2892 = var2.method871(23995);
        this.field2905 = var2.method871(23995);
        this.field2904 = var2.method871(23995);
        this.field2894 = var2.method871(23995);
        if (this.field2894 < 0) {
            this.field2894 = ~this.field2894;
            this.field2906 = true;
        }
        int var3 = var2.method871(23995);
        this.field2912 = new byte[var3][];
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = 0;
            int var6;
            do {
                var6 = var2.method842(2384);
                var5 += var6;
            } while (var6 >= 255);
            byte[] var7 = new byte[var5];
            var2.method850(255, 0, var5, var7);
            this.field2912[var4] = var7;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lcb;)Z", line = 80)
    private static final boolean method1432(class544 arg0) {
        if (!field2910) {
            byte[] var1 = arg0.method3150(0, 28, 0);
            if (var1 == null) {
                return false;
            }
            method1437(var1);
        }
        return true;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)[F", line = 94)
    private final float[] method1433(int arg0) {
        method1429(this.field2912[arg0], 0);
        method1430();
        int var2 = method1434(class305.method2009(field2890.length - 1, (byte) 63));
        boolean var3 = field2911[var2];
        int var4 = var3 ? field2903 : field2891;
        boolean var5 = false;
        boolean var6 = false;
        if (var3) {
            var5 = method1430() != 0;
            var6 = method1430() != 0;
        }
        int var7 = var4 >> 1;
        int var8;
        int var9;
        int var10;
        if (var3 && !var5) {
            var8 = (var4 >> 2) - (field2891 >> 2);
            var9 = (field2891 >> 2) + (var4 >> 2);
            var10 = field2891 >> 1;
        } else {
            var8 = 0;
            var9 = var7;
            var10 = var4 >> 1;
        }
        int var11;
        int var12;
        int var13;
        if (var3 && !var6) {
            var11 = var4 - (var4 >> 2) - (field2891 >> 2);
            var12 = (field2891 >> 2) + (var4 - (var4 >> 2));
            var13 = field2891 >> 1;
        } else {
            var11 = var7;
            var12 = var4;
            var13 = var4 >> 1;
        }
        class168 var14 = field2889[field2890[var2]];
        int var15 = var14.field2432;
        int var16 = var14.field2429[var15];
        boolean var17 = !field2893[var16].method278();
        boolean var18 = var17;
        for (int var19 = 0; var19 < var14.field2430; var19++) {
            class337 var95 = field2919[var14.field2431[var19]];
            float[] var96 = field2888;
            var95.method2166(var96, var4 >> 1, var18);
        }
        if (!var17) {
            int var20 = var14.field2432;
            int var21 = var14.field2429[var20];
            field2893[var21].method281(field2888, var4 >> 1);
        }
        if (var17) {
            for (int var22 = var4 >> 1; var22 < var4; var22++) {
                field2888[var22] = 0.0F;
            }
        } else {
            int var23 = var4 >> 1;
            int var24 = var4 >> 2;
            int var25 = var4 >> 3;
            float[] var26 = field2888;
            for (int var27 = 0; var27 < var23; var27++) {
                var26[var27] *= 0.5F;
            }
            for (int var28 = var23; var28 < var4; var28++) {
                var26[var28] = -var26[var4 - var28 - 1];
            }
            float[] var29 = var3 ? field2897 : field2915;
            float[] var30 = var3 ? field2887 : field2899;
            float[] var31 = var3 ? field2901 : field2917;
            int[] var32 = var3 ? field2907 : field2895;
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
            int var35 = class305.method2009(var4 - 1, (byte) 63);
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
                field2888[var46] *= (float) Math.sin((double) var56 * 1.5707963267948966D * (double) var56);
            }
            for (int var47 = var11; var47 < var12; var47++) {
                float var55 = (float) Math.sin(((double) (var47 - var11) + 0.5D) / (double) var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
                field2888[var47] *= (float) Math.sin((double) var55 * 1.5707963267948966D * (double) var55);
            }
        }
        float[] var48 = null;
        if (this.field2886 > 0) {
            int var49 = this.field2886 + var4 >> 2;
            var48 = new float[var49];
            if (!this.field2909) {
                for (int var50 = 0; var50 < this.field2900; var50++) {
                    int var51 = (this.field2886 >> 1) + var50;
                    var48[var50] += this.field2898[var51];
                }
            }
            if (!var17) {
                for (int var52 = var8; var52 < var4 >> 1; var52++) {
                    int var53 = var48.length + var52 - (var4 >> 1);
                    var48[var53] += field2888[var52];
                }
            }
        }
        float[] var54 = this.field2898;
        this.field2898 = field2888;
        field2888 = var54;
        this.field2886 = var4;
        this.field2900 = var12 - (var4 >> 1);
        this.field2909 = var17;
        return var48;
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)I", line = 518)
    public static final int method1434(int arg0) {
        int var1 = 0;
        int var2 = 0;
        while (arg0 >= 8 - field2908) {
            int var4 = 8 - field2908;
            int var5 = (0x1 << var4) - 1;
            var1 += (field2918[field2896] >> field2908 & var5) << var2;
            field2908 = 0;
            field2896++;
            var2 += var4;
            arg0 -= var4;
        }
        if (arg0 > 0) {
            int var3 = (0x1 << arg0) - 1;
            var1 += (field2918[field2896] >> field2908 & var3) << var2;
            field2908 += arg0;
        }
        return var1;
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "()V", line = 551)
    public static void method1435() {
        field2918 = null;
        field2902 = null;
        field2893 = null;
        field2919 = null;
        field2889 = null;
        field2911 = null;
        field2890 = null;
        field2888 = null;
        field2915 = null;
        field2899 = null;
        field2917 = null;
        field2897 = null;
        field2887 = null;
        field2901 = null;
        field2895 = null;
        field2907 = null;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lcb;I)Lvp;", line = 571)
    public static final class198 method1436(class544 arg0, int arg1) {
        if (method1432(arg0)) {
            byte[] var2 = arg0.method3149(arg1, -107);
            return var2 == null ? null : new class198(var2);
        } else {
            arg0.method3131(-123, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "([B)V", line = 585)
    private static final void method1437(byte[] arg0) {
        method1429(arg0, 0);
        field2891 = 0x1 << method1434(4);
        field2903 = 0x1 << method1434(4);
        field2888 = new float[field2903];
        for (int var1 = 0; var1 < 2; var1++) {
            int var14 = var1 == 0 ? field2891 : field2903;
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
            int var25 = class305.method2009(var17 - 1, (byte) 63);
            for (int var26 = 0; var26 < var17; var26++) {
                var24[var26] = class328.method2125(-95, var26, var25);
            }
            if (var1 == 0) {
                field2915 = var18;
                field2899 = var20;
                field2917 = var22;
                field2895 = var24;
            } else {
                field2897 = var18;
                field2887 = var20;
                field2901 = var22;
                field2907 = var24;
            }
        }
        int var2 = method1434(8) + 1;
        field2902 = new class94[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            field2902[var3] = new class94();
        }
        int var4 = method1434(6) + 1;
        for (int var5 = 0; var5 < var4; var5++) {
            method1434(16);
        }
        int var6 = method1434(6) + 1;
        field2893 = new class39[var6];
        for (int var7 = 0; var7 < var6; var7++) {
            field2893[var7] = new class39();
        }
        int var8 = method1434(6) + 1;
        field2919 = new class337[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            field2919[var9] = new class337();
        }
        int var10 = method1434(6) + 1;
        field2889 = new class168[var10];
        for (int var11 = 0; var11 < var10; var11++) {
            field2889[var11] = new class168();
        }
        int var12 = method1434(6) + 1;
        field2911 = new boolean[var12];
        field2890 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            field2911[var13] = method1430() != 0;
            method1434(16);
            method1434(16);
            field2890[var13] = method1434(8);
        }
        field2910 = true;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "([I)Lbc;", line = 741)
    public final class383 method1438(int[] arg0) {
        if (arg0 != null && arg0[0] <= 0) {
            return null;
        }
        if (this.field2916 == null) {
            this.field2886 = 0;
            this.field2898 = new float[field2903];
            this.field2916 = new byte[this.field2905];
            this.field2913 = 0;
            this.field2914 = 0;
        }
        while (this.field2914 < this.field2912.length) {
            if (arg0 != null && arg0[0] <= 0) {
                return null;
            }
            float[] var3 = this.method1433(this.field2914);
            if (var3 != null) {
                int var4 = this.field2913;
                int var5 = var3.length;
                if (var5 > this.field2905 - var4) {
                    var5 = this.field2905 - var4;
                }
                for (int var6 = 0; var6 < var5; var6++) {
                    int var7 = (int) (var3[var6] * 128.0F + 128.0F);
                    if ((var7 & 0xFFFFFF00) != 0) {
                        var7 = ~var7 >> 31;
                    }
                    this.field2916[var4++] = (byte) (var7 - 128);
                }
                if (arg0 != null) {
                    arg0[0] -= var4 - this.field2913;
                }
                this.field2913 = var4;
            }
            this.field2914++;
        }
        this.field2898 = null;
        byte[] var2 = this.field2916;
        this.field2916 = null;
        return new class383(this.field2892, var2, this.field2904, this.field2894, this.field2906);
    }

    @OriginalMember(owner = "client!vp", name = "<init>", descriptor = "([B)V", line = 801)
    private class198(byte[] arg0) {
        this.method1431(arg0);
    }

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "(I)F", line = 811)
    public static final float method1439(int arg0) {
        int var1 = arg0 & 0x1FFFFF;
        int var2 = arg0 & Integer.MIN_VALUE;
        int var3 = (arg0 & 0x7FE00000) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
    }
}
