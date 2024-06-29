import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class414 extends class321 {

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "[I")
    private int[] field6130;

    @OriginalMember(owner = "client!nj", name = "B", descriptor = "[I")
    private int[] field6134;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "Leo;")
    private class642 field6126;

    @OriginalMember(owner = "client!nj", name = "C", descriptor = "Leo;")
    private class642 field6135;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "Leo;")
    private class642 field6127;

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "[Leo;")
    private class642[] field6132;

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "Lwb;")
    public static class515 field6131 = new class515(0, 0);

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "I")
    public static int field6128;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "I")
    public static int field6129;

    @OriginalMember(owner = "client!nj", name = "A", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!nj", name = "D", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!nj", name = "E", descriptor = "I")
    public static int field6137;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lmv;IZBLfa;I)[F")
    public final float[] method2523(class295 arg0, int arg1, boolean arg2, byte arg3, class615 arg4, int arg5) {
        field6137++;
        class564.field8243 = arg4;
        class81.field1315 = arg0;
        for (int var7 = 0; var7 < this.field6132.length; var7++) {
            this.field6132[var7].method502(arg1, (byte) 7, arg5);
        }
        class435.method2586(0, arg1, arg5);
        float[] var8 = new float[arg1 * arg5 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg5; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field6135.field9207) {
                int[] var12 = this.field6135.method3(var10, -9);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field6135.method138(21402, var10);
                var13 = var16[2];
                var15 = var16[0];
                var14 = var16[1];
            }
            int[] var17;
            if (this.field6127.field9207) {
                var17 = this.field6127.method3(var10, -9);
            } else {
                var17 = this.field6127.method138(21402, var10)[0];
            }
            int[] var18;
            if (this.field6126.field9207) {
                var18 = this.field6126.method3(var10, -9);
            } else {
                var18 = this.field6126.method138(21402, var10)[0];
            }
            if (arg2) {
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
                if (arg2) {
                    var9 += (arg1 << 2) - 4;
                }
            }
        }
        if (arg3 > -17) {
            this.method2524(35, (byte) 124, false, 45, false, 1.3693669263637567D, null, null);
        }
        for (int var11 = 0; var11 < this.field6132.length; var11++) {
            this.field6132[var11].method503(30929);
        }
        return var8;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IBZIZDLmv;Lfa;)[I")
    public final int[] method2524(int arg0, byte arg1, boolean arg2, int arg3, boolean arg4, double arg5, class295 arg6, class615 arg7) {
        field6128++;
        class81.field1315 = arg6;
        class564.field8243 = arg7;
        for (int var10 = 0; var10 < this.field6132.length; var10++) {
            this.field6132[var10].method502(arg0, (byte) 7, arg3);
        }
        class46.method262(arg5, (byte) 102);
        class435.method2586(arg1 ^ 0x59, arg0, arg3);
        if (arg1 != 89) {
            return null;
        }
        int[] var11 = new int[arg0 * arg3];
        int var12;
        byte var13;
        int var14;
        if (arg4) {
            var12 = arg0 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var14 = arg0;
            var12 = 0;
            var13 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg3; var16++) {
            if (arg2) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field6135.field9207) {
                int[] var18 = this.field6135.method3(var16, -9);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field6135.method138(21402, var16);
                var19 = var22[1];
                var20 = var22[2];
                var21 = var22[0];
            }
            for (int var23 = var12; var23 != var14; var23 += var13) {
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
                int var27 = class251.field3292[var25];
                int var28 = class251.field3292[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class251.field3292[var26];
                int var30 = (var27 << 8) + ((var28 << 16) + var29);
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg2) {
                    var15 += arg0 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field6132.length; var17++) {
            this.field6132[var17].method503(30929);
        }
        return var11;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZLfa;Lmv;IDI)[I")
    public final int[] method2525(int arg0, boolean arg1, class615 arg2, class295 arg3, int arg4, double arg5, int arg6) {
        class564.field8243 = arg2;
        class81.field1315 = arg3;
        field6129++;
        for (int var9 = 0; var9 < this.field6132.length; var9++) {
            this.field6132[var9].method502(arg6, (byte) 7, arg0);
        }
        class46.method262(arg5, (byte) 80);
        class435.method2586(arg4, arg6, arg0);
        int[] var10 = new int[arg0 * arg6 * 4];
        int var11 = arg4;
        for (int var12 = 0; var12 < arg0; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field6135.field9207) {
                int[] var18 = this.field6135.method3(var12, -9);
                var16 = var18;
                var17 = var18;
                var15 = var18;
            } else {
                int[][] var14 = this.field6135.method138(21402, var12);
                var15 = var14[0];
                var16 = var14[2];
                var17 = var14[1];
            }
            int[] var19;
            if (this.field6127.field9207) {
                var19 = this.field6127.method3(var12, -9);
            } else {
                var19 = this.field6127.method138(arg4 + 21402, var12)[0];
            }
            if (arg1) {
                var11 = var12;
            }
            for (int var20 = arg6 - 1; var20 >= 0; var20--) {
                int var21 = var15[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var17[var20] >> 4;
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
                int var24 = class251.field3292[var22];
                int var25 = class251.field3292[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class251.field3292[var23];
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
                var10[var11++] = (var24 << 8) + var26 + (var25 << 16) + (var27 << 24);
                if (arg1) {
                    var11 += arg6 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field6132.length; var13++) {
            this.field6132[var13].method503(30929);
        }
        return var10;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
    public static void method2526(byte arg0) {
        int var1 = 28 % ((-arg0 - 18) / 54);
        field6131 = null;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
    public class414() {
        this.field6130 = new int[0];
        this.field6134 = new int[0];
        this.field6126 = new class360(0);
        this.field6126.field9206 = 1;
        this.field6135 = new class360();
        this.field6135.field9206 = 1;
        this.field6127 = new class360();
        this.field6132 = new class642[] { this.field6135, this.field6127, this.field6126 };
        this.field6127.field9206 = 1;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lmv;Lfa;B)Z")
    public final boolean method2527(class295 arg0, class615 arg1, byte arg2) {
        field6136++;
        if (class112.field1704 < 0) {
            for (int var4 = 0; var4 < this.field6134.length; var4++) {
                if (!arg0.method1818(this.field6134[var4], 4)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field6134.length; var5++) {
                if (!arg0.method1843((byte) 119, class112.field1704, this.field6134[var5])) {
                    return false;
                }
            }
        }
        int var6 = -106 / ((33 - arg2) / 42);
        for (int var7 = 0; var7 < this.field6130.length; var7++) {
            if (!arg1.method956(this.field6130[var7], 15925)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(Lgk;)V")
    public class414(class540 arg0) {
        int var2 = arg0.method3115(29871);
        int var3 = 0;
        int var4 = 0;
        this.field6132 = new class642[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class642 var16 = class476.method2734(arg0, 113);
            if (var16.method1250((byte) 44) >= 0) {
                var3++;
            }
            if (var16.method504(-120) >= 0) {
                var4++;
            }
            int var17 = var16.field9210.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method3115(29871);
            }
            this.field6132[var6] = var16;
        }
        this.field6134 = new int[var3];
        this.field6130 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class642 var11 = this.field6132[var9];
            int var12 = var11.field9210.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field9210[var13] = this.field6132[var5[var9][var13]];
            }
            int var14 = var11.method1250((byte) 44);
            int var15 = var11.method504(-128);
            if (var14 > 0) {
                this.field6134[var7++] = var14;
            }
            if (var15 > 0) {
                this.field6130[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field6135 = this.field6132[arg0.method3115(29871)];
        this.field6127 = this.field6132[arg0.method3115(29871)];
        this.field6126 = this.field6132[arg0.method3115(29871)];
        Object var10 = null;
    }
}
