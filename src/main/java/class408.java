import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class408 extends class426 {

    @OriginalMember(owner = "client!ij", name = "W", descriptor = "[I")
    private int[] field6080;

    @OriginalMember(owner = "client!ij", name = "N", descriptor = "[I")
    private int[] field6071;

    @OriginalMember(owner = "client!ij", name = "O", descriptor = "Lcj;")
    private class118 field6072;

    @OriginalMember(owner = "client!ij", name = "X", descriptor = "Lcj;")
    private class118 field6081;

    @OriginalMember(owner = "client!ij", name = "M", descriptor = "Lcj;")
    private class118 field6070;

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "[Lcj;")
    private class118[] field6068;

    @OriginalMember(owner = "client!ij", name = "P", descriptor = "Lwl;")
    public static class452 field6073 = new class452(73, -2);

    @OriginalMember(owner = "client!ij", name = "U", descriptor = "I")
    public static int field6078 = 1;

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "I")
    public static int field6069;

    @OriginalMember(owner = "client!ij", name = "Q", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!ij", name = "R", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!ij", name = "T", descriptor = "I")
    public static int field6077;

    @OriginalMember(owner = "client!ij", name = "V", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!ij", name = "S", descriptor = "Lam;")
    public static class466 field6076;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lec;Liq;I)Z")
    public final boolean method2560(class96 arg0, class134 arg1, int arg2) {
        field6077++;
        if (arg2 != -1857) {
            return true;
        }
        if (class164.field2293 < 0) {
            for (int var4 = 0; var4 < this.field6071.length; var4++) {
                if (!arg1.method822(arg2 ^ 0x71F, this.field6071[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field6071.length; var5++) {
                if (!arg1.method839(class164.field2293, this.field6071[var5], arg2 ^ 0x70C7)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field6080.length; var6++) {
            if (!arg0.method178(false, this.field6080[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "(I)V")
    public static void method2561(int arg0) {
        field6076 = null;
        if (arg0 == 2) {
            field6073 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lec;IIZDZLiq;I)[I")
    public final int[] method2562(class96 arg0, int arg1, int arg2, boolean arg3, double arg4, boolean arg5, class134 arg6, int arg7) {
        class25.field324 = arg6;
        field6079++;
        class185.field2791 = arg0;
        for (int var10 = 0; var10 < this.field6068.length; var10++) {
            this.field6068[var10].method702(arg1, 72, arg2);
        }
        class188.method1142(116, arg4);
        class377.method2271(arg2, 2016454732, arg1);
        int[] var11 = new int[arg1 * arg2];
        int var12;
        int var13;
        byte var14;
        if (arg3) {
            var12 = arg1 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var12 = 0;
            var13 = arg1;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg2; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field6081.field1552) {
                int[] var22 = this.field6081.method20(arg7 + 1, var16);
                var20 = var22;
                var21 = var22;
                var19 = var22;
            } else {
                int[][] var18 = this.field6081.method195(false, var16);
                var19 = var18[1];
                var20 = var18[0];
                var21 = var18[2];
            }
            if (arg5) {
                var15 = var16;
            }
            for (int var23 = var12; var23 != var13; var23 += var14) {
                int var24 = var20[var23] >> 4;
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
                int var26 = var21[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class221.field3363[var24];
                int var28 = class221.field3363[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class221.field3363[var26];
                int var30 = (var27 << 16) + (var28 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg5) {
                    var15 += arg1 - 1;
                }
            }
        }
        for (int var17 = arg7; var17 < this.field6068.length; var17++) {
            this.field6068[var17].method706(arg7 ^ 0x3668);
        }
        return var11;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(CB)Z")
    public static final boolean method2563(char arg0, byte arg1) {
        field6075++;
        if (Character.isISOControl(arg0)) {
            return false;
        }
        if (arg1 != 102) {
            field6073 = null;
        }
        if (class56.method320(-1, arg0)) {
            return true;
        }
        char[] var2 = class375.field5475;
        for (int var3 = 0; var3 < var2.length; var3++) {
            char var7 = var2[var3];
            if (arg0 == var7) {
                return true;
            }
        }
        char[] var4 = class412.field6132;
        for (int var5 = 0; var5 < var4.length; var5++) {
            char var6 = var4[var5];
            if (arg0 == var6) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILec;ZLiq;I)[F")
    public final float[] method2564(int arg0, int arg1, class96 arg2, boolean arg3, class134 arg4, int arg5) {
        class25.field324 = arg4;
        field6069++;
        class185.field2791 = arg2;
        for (int var7 = 0; var7 < this.field6068.length; var7++) {
            this.field6068[var7].method702(arg1, 118, arg5);
        }
        class377.method2271(arg5, 2016454732, arg1);
        float[] var8 = new float[arg1 * arg5 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg5; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field6081.field1552) {
                int[] var16 = this.field6081.method20(1, var10);
                var14 = var16;
                var13 = var16;
                var15 = var16;
            } else {
                int[][] var12 = this.field6081.method195(false, var10);
                var13 = var12[2];
                var14 = var12[1];
                var15 = var12[0];
            }
            int[] var17;
            if (this.field6070.field1552) {
                var17 = this.field6070.method20(1, var10);
            } else {
                var17 = this.field6070.method195(false, var10)[0];
            }
            int[] var18;
            if (this.field6072.field1552) {
                var18 = this.field6072.method20(1, var10);
            } else {
                var18 = this.field6072.method195(false, var10)[0];
            }
            if (arg3) {
                var9 = var10 << 2;
            }
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if ((var20 < 0.0F)) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = var20;
                if (arg3) {
                    var9 += (arg1 << 2) - 4;
                }
            }
        }
        int var11 = 0;
        if (arg0 < 43) {
            return null;
        }
        while (this.field6068.length > var11) {
            this.field6068[var11].method706(13928);
            var11++;
        }
        return var8;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILiq;DIZLec;)[I")
    public final int[] method2565(int arg0, int arg1, class134 arg2, double arg3, int arg4, boolean arg5, class96 arg6) {
        if (arg0 >= -66) {
            this.field6081 = null;
        }
        field6074++;
        class185.field2791 = arg6;
        class25.field324 = arg2;
        for (int var9 = 0; var9 < this.field6068.length; var9++) {
            this.field6068[var9].method702(arg4, 72, arg1);
        }
        class188.method1142(114, arg3);
        class377.method2271(arg1, 2016454732, arg4);
        int[] var10 = new int[arg1 * 4 * arg4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field6081.field1552) {
                int[] var18 = this.field6081.method20(1, var12);
                var17 = var18;
                var15 = var18;
                var16 = var18;
            } else {
                int[][] var14 = this.field6081.method195(false, var12);
                var15 = var14[0];
                var16 = var14[1];
                var17 = var14[2];
            }
            int[] var19;
            if (this.field6070.field1552) {
                var19 = this.field6070.method20(1, var12);
            } else {
                var19 = this.field6070.method195(false, var12)[0];
            }
            if (arg5) {
                var11 = var12;
            }
            for (int var20 = arg4 - 1; var20 >= 0; var20--) {
                int var21 = var15[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var16[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var17[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class221.field3363[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class221.field3363[var22];
                int var26 = class221.field3363[var23];
                int var27;
                if (var24 == 0 && var25 == 0 && var26 == 0) {
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
                var10[var11++] = (var25 << 8) + (var24 << 16) + (var27 << 24) + var26;
                if (arg5) {
                    var11 += arg4 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field6068.length; var13++) {
            this.field6068[var13].method706(13928);
        }
        return var10;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
    public class408() {
        this.field6080 = new int[0];
        this.field6071 = new int[0];
        this.field6072 = new class108(0);
        this.field6072.field1551 = 1;
        this.field6081 = new class108();
        this.field6081.field1551 = 1;
        this.field6070 = new class108();
        this.field6068 = new class118[] { this.field6081, this.field6070, this.field6072 };
        this.field6070.field1551 = 1;
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lef;)V")
    public class408(class385 arg0) {
        int var2 = arg0.method2343(255);
        int var3 = 0;
        int var4 = 0;
        this.field6068 = new class118[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class118 var16 = class97.method623(arg0, -101);
            if (var16.method704((byte) -92) >= 0) {
                var3++;
            }
            if (var16.method707(false) >= 0) {
                var4++;
            }
            int var17 = var16.field1541.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method2343(255);
            }
            this.field6068[var6] = var16;
        }
        this.field6071 = new int[var3];
        this.field6080 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class118 var11 = this.field6068[var9];
            int var12 = var11.field1541.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field1541[var13] = this.field6068[var5[var9][var13]];
            }
            int var14 = var11.method704((byte) -92);
            int var15 = var11.method707(false);
            if (var14 > 0) {
                this.field6071[var7++] = var14;
            }
            if (var15 > 0) {
                this.field6080[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field6081 = this.field6068[arg0.method2343(255)];
        this.field6070 = this.field6068[arg0.method2343(255)];
        Object var10 = null;
        this.field6072 = this.field6068[arg0.method2343(255)];
    }
}
