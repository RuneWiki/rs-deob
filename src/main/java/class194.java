import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class194 extends class128 {

    @OriginalMember(owner = "client!kj", name = "E", descriptor = "[I")
    private int[] field3246;

    @OriginalMember(owner = "client!kj", name = "B", descriptor = "[I")
    private int[] field3243;

    @OriginalMember(owner = "client!kj", name = "I", descriptor = "Loa;")
    private class313 field3250;

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "Loa;")
    private class313 field3241;

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "Loa;")
    private class313 field3240;

    @OriginalMember(owner = "client!kj", name = "M", descriptor = "[Loa;")
    private class313[] field3254;

    @OriginalMember(owner = "client!kj", name = "C", descriptor = "[Ljava/lang/String;")
    public static String[] field3244 = new String[100];

    @OriginalMember(owner = "client!kj", name = "L", descriptor = "I")
    public static int field3253 = 0;

    @OriginalMember(owner = "client!kj", name = "J", descriptor = "I")
    public static int field3251 = 0;

    @OriginalMember(owner = "client!kj", name = "K", descriptor = "[Lre;")
    public static class303[] field3252 = new class303[8];

    @OriginalMember(owner = "client!kj", name = "A", descriptor = "F")
    public static float field3242;

    @OriginalMember(owner = "client!kj", name = "D", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!kj", name = "F", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!kj", name = "G", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!kj", name = "H", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!kj", name = "O", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!kj", name = "P", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!kj", name = "Q", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!kj", name = "S", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILcg;Lmh;)Z", line = 4)
    public final boolean method1454(int arg0, class49 arg1, class150 arg2) {
        field3245++;
        if (class38.field568 > 0) {
            for (int var4 = 0; var4 < this.field3246.length; var4++) {
                if (!arg1.method429(this.field3246[var4], class38.field568, 104)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field3246.length; var5++) {
                if (!arg1.method432(this.field3246[var5], false)) {
                    return false;
                }
            }
        }
        int var6 = -94 % ((arg0 - 32) / 55);
        for (int var7 = 0; var7 < this.field3243.length; var7++) {
            if (!arg2.method713(false, this.field3243[var7])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lmh;IZIDLcg;I)Ln;", line = 63)
    public final class309 method1455(class150 arg0, int arg1, boolean arg2, int arg3, double arg4, class49 arg5, int arg6) {
        field3249++;
        class112.method961(arg4, 20526);
        if (arg3 != 15109) {
            field3244 = (String[]) null;
        }
        class7.field89 = arg5;
        class133.field2275 = arg0;
        class74.method694(102, arg1, arg6);
        class309 var9 = new class309(arg1, arg6);
        for (int var10 = 0; var10 < this.field3254.length; var10++) {
            this.field3254[var10].method2155(arg6, arg3 - 15108, arg1);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg6; var12++) {
            if (arg2) {
                var11 = var12;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field3241.field4968) {
                int[] var13 = this.field3241.method111(4, var12);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field3241.method299(var12, 2);
                var14 = var17[1];
                var16 = var17[2];
                var15 = var17[0];
            }
            for (int var18 = 0; var18 != arg1; var18++) {
                int var19 = var15[var18] >> 4;
                if (var19 > 255) {
                    var19 = 255;
                }
                if (var19 < 0) {
                    var19 = 0;
                }
                int var20 = var16[var18] >> 4;
                int var21 = class298.field4757[var19];
                if (var20 > 255) {
                    var20 = 255;
                }
                int var22 = var14[var18] >> 4;
                if (var20 < 0) {
                    var20 = 0;
                }
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = class298.field4757[var20];
                int var24 = class298.field4757[var22];
                var9.field4907[var11++] = (var21 << 16) + (var24 << 8) + var23;
                if (arg2) {
                    var11 += arg1 - 1;
                }
            }
        }
        for (int var25 = 0; var25 < this.field3254.length; var25++) {
            this.field3254[var25].method806(127);
        }
        return var9;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IBI)Lqh;", line = 178)
    public static final class325 method1456(int arg0, byte arg1, int arg2) {
        field3247++;
        if (arg1 > -22) {
            method1461(4);
        }
        for (class325 var3 = (class325) class137.field2370.method736(2); var3 != null; var3 = (class325) class137.field2370.method727((byte) -110)) {
            if (var3.field5189 && var3.method2256(arg2, true, arg0)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(DIZLmh;ZBILcg;)[I", line = 201)
    public final int[] method1457(double arg0, int arg1, boolean arg2, class150 arg3, boolean arg4, byte arg5, int arg6, class49 arg7) {
        field3256++;
        class112.method961(arg0, 20526);
        class7.field89 = arg7;
        int[] var10 = new int[arg1 * arg6];
        class133.field2275 = arg3;
        class74.method694(arg5 - 94, arg1, arg6);
        for (int var11 = 0; var11 < this.field3254.length; var11++) {
            this.field3254[var11].method2155(arg6, 1, arg1);
        }
        byte var12;
        int var13;
        int var14;
        if (arg2) {
            var12 = -1;
            var13 = arg1 - 1;
            var14 = -1;
        } else {
            var12 = 1;
            var14 = arg1;
            var13 = 0;
        }
        int var15 = 0;
        if (arg5 != 31) {
            this.field3240 = (class313) null;
        }
        for (int var16 = 0; var16 < arg6; var16++) {
            if (arg4) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field3241.field4968) {
                int[] var21 = this.field3241.method111(4, var16);
                var19 = var21;
                var18 = var21;
                var20 = var21;
            } else {
                int[][] var17 = this.field3241.method299(var16, 2);
                var18 = var17[2];
                var19 = var17[1];
                var20 = var17[0];
            }
            for (int var22 = var13; var22 != var14; var22 += var12) {
                int var23 = var20[var22] >> 4;
                int var24 = var19[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var25 = var18[var22] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class298.field4757[var25];
                int var27 = class298.field4757[var23];
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var28 = class298.field4757[var24];
                var10[var15++] = (var28 << 8) + (var27 << 16) + var26;
                if (arg4) {
                    var15 += arg1 - 1;
                }
            }
        }
        for (int var29 = 0; var29 < this.field3254.length; var29++) {
            this.field3254[var29].method806(arg5 + 96);
        }
        return var10;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lmh;ILcg;IIZ)[F", line = 333)
    public final float[] method1458(class150 arg0, int arg1, class49 arg2, int arg3, int arg4, boolean arg5) {
        class7.field89 = arg2;
        class133.field2275 = arg0;
        float[] var7 = new float[arg3 * 4 * arg1];
        class74.method694(-51, arg1, arg3);
        field3248++;
        if (arg4 <= 54) {
            method1461(35);
        }
        for (int var8 = 0; var8 < this.field3254.length; var8++) {
            this.field3254[var8].method2155(arg3, 1, arg1);
        }
        int var9 = 0;
        for (int var10 = 0; var10 < arg3; var10++) {
            if (arg5) {
                var9 = var10 << 2;
            }
            int[] var12;
            int[] var13;
            int[] var14;
            if (this.field3241.field4968) {
                int[] var15 = this.field3241.method111(4, var10);
                var14 = var15;
                var13 = var15;
                var12 = var15;
            } else {
                int[][] var11 = this.field3241.method299(var10, 2);
                var12 = var11[1];
                var13 = var11[0];
                var14 = var11[2];
            }
            int[] var16;
            if (this.field3240.field4968) {
                var16 = this.field3240.method111(4, var10);
            } else {
                var16 = this.field3240.method299(var10, 2)[0];
            }
            int[] var17;
            if (this.field3250.field4968) {
                var17 = this.field3250.method111(4, var10);
            } else {
                var17 = this.field3250.method299(var10, 2)[0];
            }
            for (int var18 = arg1 - 1; var18 >= 0; var18--) {
                float var19 = (float) var16[var18] / 4096.0F;
                float var20 = ((float) var17[var18] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var7[var9++] = (float) var13[var18] * var20;
                var7[var9++] = (float) var12[var18] * var20;
                var7[var9++] = (float) var14[var18] * var20;
                if ((var19 < 0.0F)) {
                    var19 = 0.0F;
                } else if (var19 > 1.0F) {
                    var19 = 1.0F;
                }
                var7[var9++] = var19;
                if (arg5) {
                    var9 += (arg1 << 2) - 4;
                }
            }
        }
        for (int var21 = 0; var21 < this.field3254.length; var21++) {
            this.field3254[var21].method806(127);
        }
        return var7;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IILmh;Lcg;ZID)Ltk;", line = 457)
    public final class273 method1459(int arg0, int arg1, class150 arg2, class49 arg3, boolean arg4, int arg5, double arg6) {
        field3255++;
        class112.method961(arg6, 20526);
        class7.field89 = arg3;
        class133.field2275 = arg2;
        class74.method694(-45, arg1, arg0);
        class273 var9 = new class273(arg1, arg0);
        if (arg5 != 13661) {
            return (class273) null;
        }
        for (int var10 = 0; var10 < this.field3254.length; var10++) {
            this.field3254[var10].method2155(arg0, 1, arg1);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg0; var12++) {
            if (arg4) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field3241.field4968) {
                int[] var13 = this.field3241.method111(4, var12);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field3241.method299(var12, 2);
                var16 = var17[1];
                var15 = var17[2];
                var14 = var17[0];
            }
            int[] var18;
            if (this.field3240.field4968) {
                var18 = this.field3240.method111(4, var12);
            } else {
                var18 = this.field3240.method299(var12, 2)[0];
            }
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                int var20 = var16[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var21 = var15[var19] >> 4;
                if (var20 < 0) {
                    var20 = 0;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                int var22 = class298.field4757[var20];
                int var23 = var14[var19] >> 4;
                if (var21 < 0) {
                    var21 = 0;
                }
                int var24 = class298.field4757[var21];
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class298.field4757[var23];
                int var26;
                if (var25 == 0 && var22 == 0 && var24 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9.field4907[var11++] = (var22 << 8) + (var26 << 24) + (var25 << 16) + var24;
                if (arg4) {
                    var11 += (arg1 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field3254.length; var27++) {
            this.field3254[var27].method806(127);
        }
        return var9;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IZLcg;Lmh;IDI)[I", line = 594)
    public final int[] method1460(int arg0, boolean arg1, class49 arg2, class150 arg3, int arg4, double arg5, int arg6) {
        class112.method961(arg5, 20526);
        field3258++;
        class7.field89 = arg2;
        class133.field2275 = arg3;
        class74.method694(47, arg6, arg4);
        int[] var9 = new int[arg4 * 4 * arg6];
        for (int var10 = 0; var10 < this.field3254.length; var10++) {
            this.field3254[var10].method2155(arg4, 1, arg6);
        }
        int var11 = 0;
        int var12 = 0;
        int var13 = -75 / ((arg0 - 6) / 52);
        while (arg4 > var12) {
            if (arg1) {
                var11 = var12;
            }
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field3241.field4968) {
                int[] var14 = this.field3241.method111(4, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field3241.method299(var12, 2);
                var17 = var18[2];
                var16 = var18[1];
                var15 = var18[0];
            }
            int[] var19;
            if (this.field3240.field4968) {
                var19 = this.field3240.method111(4, var12);
            } else {
                var19 = this.field3240.method299(var12, 2)[0];
            }
            for (int var20 = arg6 - 1; var20 >= 0; var20--) {
                int var21 = var15[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = class298.field4757[var21];
                int var23 = var16[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = var17[var20] >> 4;
                int var25 = class298.field4757[var23];
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var26 = class298.field4757[var24];
                int var27;
                if (var22 == 0 && var25 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var9[var11++] = (var25 << 8) + (var22 << 16) + (var27 << 24) + var26;
                if (arg1) {
                    var11 += arg6 - 1;
                }
            }
            var12++;
        }
        for (int var28 = 0; var28 < this.field3254.length; var28++) {
            this.field3254[var28].method806(127);
        }
        return var9;
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(I)V", line = 729)
    public static void method1461(int arg0) {
        field3244 = null;
        field3252 = null;
        if (arg0 > -11) {
            method1461(65);
        }
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V", line = 746)
    public class194() {
        this.field3246 = new int[0];
        this.field3243 = new int[0];
        this.field3250 = new class328(0);
        this.field3250.field4963 = 1;
        this.field3241 = new class328();
        this.field3241.field4963 = 1;
        this.field3240 = new class328();
        this.field3254 = new class313[] { this.field3241, this.field3240, this.field3250 };
        this.field3240.field4963 = 1;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lpi;)V", line = 764)
    public class194(class336 arg0) {
        int var2 = arg0.method2364(-9069);
        this.field3254 = new class313[var2];
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class313 var7 = class53.method483((byte) 12, arg0);
            if (var7.method807((byte) -84) >= 0) {
                var3++;
            }
            if (var7.method1725((byte) 44) >= 0) {
                var4++;
            }
            int var8 = var7.field4951.length;
            var5[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var5[var6][var9] = arg0.method2364(-9069);
            }
            this.field3254[var6] = var7;
        }
        this.field3243 = new int[var4];
        int var10 = 0;
        this.field3246 = new int[var3];
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class313 var13 = this.field3254[var12];
            int var14 = var13.field4951.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field4951[var15] = this.field3254[var5[var12][var15]];
            }
            int var16 = var13.method807((byte) -84);
            int var17 = var13.method1725((byte) 124);
            if (var16 > 0) {
                this.field3246[var11++] = var16;
            }
            if (var17 > 0) {
                this.field3243[var10++] = var17;
            }
            var5[var12] = null;
        }
        int[][] var18 = (int[][]) null;
        this.field3241 = this.field3254[arg0.method2364(-9069)];
        this.field3240 = this.field3254[arg0.method2364(-9069)];
        this.field3250 = this.field3254[arg0.method2364(-9069)];
    }
}
