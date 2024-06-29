import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class475 extends class272 {

    @OriginalMember(owner = "client!pg", name = "D", descriptor = "[I")
    private int[] field6672;

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "[I")
    private int[] field6678;

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "Ljd;")
    private class139 field6677;

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "Ljd;")
    private class139 field6667;

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "Ljd;")
    private class139 field6668;

    @OriginalMember(owner = "client!pg", name = "H", descriptor = "[Ljd;")
    private class139[] field6676;

    @OriginalMember(owner = "client!pg", name = "A", descriptor = "I")
    public static int field6669 = 0;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
    public static int field6666;

    @OriginalMember(owner = "client!pg", name = "B", descriptor = "I")
    public static int field6670;

    @OriginalMember(owner = "client!pg", name = "C", descriptor = "I")
    public static int field6671;

    @OriginalMember(owner = "client!pg", name = "E", descriptor = "I")
    public static int field6673;

    @OriginalMember(owner = "client!pg", name = "F", descriptor = "I")
    public static int field6674;

    @OriginalMember(owner = "client!pg", name = "G", descriptor = "I")
    public static int field6675;

    @OriginalMember(owner = "client!pg", name = "L", descriptor = "I")
    public static int field6679;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method2781(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class177.field2542[arg0][var8][var14] == -class258.field3772) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class216.field3242) + 1;
            int var10 = (arg3 << class216.field3242) + 2;
            int var11 = class53.field725[arg0].method1218(arg1, arg3) + arg5;
            if (!class459.method2688(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << class216.field3242) - 1;
            if (!class459.method2688(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << class216.field3242) - 1;
            if (!class459.method2688(var9, var11, var13)) {
                return false;
            } else if (class459.method2688(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class320.method2050(arg0, arg1, arg3)) {
            int var6 = arg1 << class216.field3242;
            int var7 = arg3 << class216.field3242;
            return class459.method2688(var6 + 1, class53.field725[arg0].method1218(arg1, arg3) + arg5, var7 + 1) && class459.method2688(class418.field5845 + var6 - 1, class53.field725[arg0].method1218(arg1 + 1, arg3) + arg5, var7 + 1) && class459.method2688(class418.field5845 + var6 - 1, class53.field725[arg0].method1218(arg1 + 1, arg3 + 1) + arg5, class418.field5845 + var7 - 1) && class459.method2688(var6 + 1, class53.field725[arg0].method1218(arg1, arg3 + 1) + arg5, class418.field5845 + var7 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZILb;ILwp;IZD)[I")
    public final int[] method2782(boolean arg0, int arg1, class201 arg2, int arg3, class109 arg4, int arg5, boolean arg6, double arg7) {
        class168.field2454 = arg4;
        field6673++;
        class452.field6300 = arg2;
        for (int var10 = 0; var10 < this.field6676.length; var10++) {
            this.field6676[var10].method877(-256, arg3, arg1);
        }
        class9.method36(arg7, arg5 ^ arg5);
        class488.method2860(arg3, -1, arg1);
        int[] var11 = new int[arg1 * arg3];
        byte var12;
        int var13;
        int var14;
        if (arg6) {
            var12 = -1;
            var14 = -1;
            var13 = arg3 - 1;
        } else {
            var12 = 1;
            var13 = 0;
            var14 = arg3;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg1; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field6667.field1841) {
                int[] var18 = this.field6667.method22(var16, 27782);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field6667.method33(arg5 + 5395, var16);
                var20 = var22[2];
                var21 = var22[0];
                var19 = var22[1];
            }
            if (arg0) {
                var15 = var16;
            }
            for (int var23 = var13; var23 != var14; var23 += var12) {
                int var24 = var21[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var19[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var20[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class87.field1060[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class87.field1060[var25];
                int var29 = class87.field1060[var26];
                int var30 = (var27 << 16) + (var28 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg0) {
                    var15 += arg3 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field6676.length; var17++) {
            this.field6676[var17].method876(arg5 ^ 0xE7A);
        }
        return var11;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IILb;ILwp;DZ)[I")
    public final int[] method2783(int arg0, int arg1, class201 arg2, int arg3, class109 arg4, double arg5, boolean arg6) {
        field6679++;
        class168.field2454 = arg4;
        class452.field6300 = arg2;
        for (int var9 = 0; var9 < this.field6676.length; var9++) {
            this.field6676[var9].method877(-256, arg0, arg1);
        }
        class9.method36(arg5, 0);
        class488.method2860(arg0, -1, arg1);
        int[] var10 = new int[arg0 * arg1 * 4];
        if (arg3 != -19146) {
            this.method2782(false, -99, (class201) null, 63, (class109) null, 20, false, -0.1812362957771413D);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field6667.field1841) {
                int[] var18 = this.field6667.method22(var12, 27782);
                var16 = var18;
                var15 = var18;
                var17 = var18;
            } else {
                int[][] var14 = this.field6667.method33(-87, var12);
                var15 = var14[1];
                var16 = var14[2];
                var17 = var14[0];
            }
            int[] var19;
            if (this.field6668.field1841) {
                var19 = this.field6668.method22(var12, 27782);
            } else {
                var19 = this.field6668.method33(-93, var12)[0];
            }
            if (arg6) {
                var11 = var12;
            }
            for (int var20 = arg0 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var15[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var16[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class87.field1060[var22];
                int var25 = class87.field1060[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class87.field1060[var23];
                int var27;
                if (var25 == 0 && var24 == 0 && var26 == 0) {
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
                var10[var11++] = (var27 << 24) + (var25 << 16) + var26 + (var24 << 8);
                if (arg6) {
                    var11 += arg0 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field6676.length; var13++) {
            this.field6676[var13].method876(-7155);
        }
        return var10;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZLb;Lwp;)Z")
    public final boolean method2784(boolean arg0, class201 arg1, class109 arg2) {
        if (arg0) {
            this.field6678 = null;
        }
        field6670++;
        if (class260.field3813 >= 0) {
            for (int var4 = 0; var4 < this.field6678.length; var4++) {
                if (!arg1.method1237(class260.field3813, 0, this.field6678[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field6678.length; var5++) {
                if (!arg1.method1230(94, this.field6678[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field6672.length; var6++) {
            if (!arg2.method702(this.field6672[var6], 37)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V")
    public static final void method2785(int arg0) {
        field6675++;
        if (arg0 != -12231) {
            method2781(110, 104, -20, 13, 89, 54);
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class238.field3570[var1] = false;
        }
        class311.field4399 = 0;
        class161.field2380 = -1;
        class262.field3839 = 0;
        class203.field3017 = -1;
        class136.field1807 = 1;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILb;Lwp;IIZ)[F")
    public final float[] method2786(int arg0, class201 arg1, class109 arg2, int arg3, int arg4, boolean arg5) {
        class452.field6300 = arg1;
        class168.field2454 = arg2;
        field6671++;
        for (int var7 = 0; var7 < this.field6676.length; var7++) {
            this.field6676[var7].method877(-256, arg3, arg0);
        }
        class488.method2860(arg3, ~arg4, arg0);
        float[] var8 = new float[arg0 * arg3 * 4];
        int var9 = 0;
        for (int var10 = arg4; var10 < arg0; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field6667.field1841) {
                int[] var16 = this.field6667.method22(var10, 27782);
                var14 = var16;
                var13 = var16;
                var15 = var16;
            } else {
                int[][] var12 = this.field6667.method33(-86, var10);
                var13 = var12[1];
                var14 = var12[2];
                var15 = var12[0];
            }
            int[] var17;
            if (this.field6668.field1841) {
                var17 = this.field6668.method22(var10, 27782);
            } else {
                var17 = this.field6668.method33(-92, var10)[0];
            }
            if (arg5) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field6677.field1841) {
                var18 = this.field6677.method22(var10, 27782);
            } else {
                var18 = this.field6677.method33(-103, var10)[0];
            }
            for (int var19 = arg3 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if ((var20 < 0.0F)) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = var20;
                if (arg5) {
                    var9 += (arg3 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field6676.length; var11++) {
            this.field6676[var11].method876(-7155);
        }
        return var8;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZ)Z")
    public static final boolean method2787(int arg0, boolean arg1) {
        field6674++;
        if (arg0 != 24827) {
            field6666 = 5;
        }
        boolean var2 = class141.field1878.method666();
        if (arg1 == var2) {
            return true;
        }
        if (!arg1) {
            class141.field1878.method643();
        } else if (!class141.field1878.method616()) {
            arg1 = false;
        }
        if (arg1 == var2) {
            return false;
        } else {
            class314.field4438.field5793 = arg1;
            class314.field4438.method1177(class252.field3718, (byte) 104);
            return true;
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V")
    public class475() {
        this.field6672 = new int[0];
        this.field6678 = new int[0];
        this.field6677 = new class255(0);
        this.field6677.field1849 = 1;
        this.field6667 = new class255();
        this.field6667.field1849 = 1;
        this.field6668 = new class255();
        this.field6676 = new class139[] { this.field6667, this.field6668, this.field6677 };
        this.field6668.field1849 = 1;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lrp;)V")
    public class475(class276 arg0) {
        int var2 = arg0.method1701(-23121);
        int var3 = 0;
        int var4 = 0;
        this.field6676 = new class139[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class139 var16 = class61.method376(arg0, 1602968994);
            if (var16.method883((byte) 72) >= 0) {
                var3++;
            }
            if (var16.method875((byte) -99) >= 0) {
                var4++;
            }
            int var17 = var16.field1848.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1701(-23121);
            }
            this.field6676[var6] = var16;
        }
        this.field6678 = new int[var3];
        this.field6672 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class139 var11 = this.field6676[var9];
            int var12 = var11.field1848.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field1848[var13] = this.field6676[var5[var9][var13]];
            }
            int var14 = var11.method883((byte) 116);
            int var15 = var11.method875((byte) -86);
            if (var14 > 0) {
                this.field6678[var7++] = var14;
            }
            if (var15 > 0) {
                this.field6672[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field6667 = this.field6676[arg0.method1701(-23121)];
        this.field6668 = this.field6676[arg0.method1701(-23121)];
        Object var10 = null;
        this.field6677 = this.field6676[arg0.method1701(-23121)];
    }
}
