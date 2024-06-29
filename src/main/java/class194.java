import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class194 extends class11 {

    @OriginalMember(owner = "client!dga", name = "z", descriptor = "[I")
    private int[] field2837;

    @OriginalMember(owner = "client!dga", name = "E", descriptor = "[I")
    private int[] field2841;

    @OriginalMember(owner = "client!dga", name = "B", descriptor = "Lqp;")
    private class615 field2839;

    @OriginalMember(owner = "client!dga", name = "x", descriptor = "Lqp;")
    private class615 field2835;

    @OriginalMember(owner = "client!dga", name = "F", descriptor = "Lqp;")
    private class615 field2842;

    @OriginalMember(owner = "client!dga", name = "A", descriptor = "[Lqp;")
    private class615[] field2838;

    @OriginalMember(owner = "client!dga", name = "v", descriptor = "Llj;")
    public static class570 field2833 = new class570(10, 2, 2, 0);

    @OriginalMember(owner = "client!dga", name = "t", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!dga", name = "u", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!dga", name = "w", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!dga", name = "y", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!dga", name = "D", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(ILbi;Le;)Z", line = 3)
    public final boolean method1252(int arg0, class449 arg1, class498 arg2) {
        field2832++;
        if (class551.field7338 >= 0) {
            for (int var4 = 0; var4 < this.field2837.length; var4++) {
                if (!arg1.method2538(false, this.field2837[var4], class551.field7338)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field2837.length; var5++) {
                if (!arg1.method2549(this.field2837[var5], 3015)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field2841.length; var6++) {
            if (!arg2.method2759(32700, this.field2841[var6])) {
                return false;
            }
        }
        int var7 = 10 % ((-arg0 - 22) / 35);
        return true;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(I)V", line = 57)
    public static void method1253(int arg0) {
        int var1 = 84 % ((arg0 - 13) / 47);
        field2833 = null;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Le;ZDIILbi;IZ)[I", line = 67)
    public final int[] method1254(class498 arg0, boolean arg1, double arg2, int arg3, int arg4, class449 arg5, int arg6, boolean arg7) {
        class541.field7122 = arg5;
        class570.field7572 = arg0;
        field2834++;
        for (int var10 = 0; var10 < this.field2838.length; var10++) {
            this.field2838[var10].method3145(arg3, -256, arg4);
        }
        class555.method3073(arg6 ^ 0xFF, arg2);
        class665.method3734((byte) 16, arg3, arg4);
        int[] var11 = new int[arg3 * arg4];
        int var12;
        byte var13;
        int var14;
        if (arg7) {
            var12 = arg3 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var13 = 1;
            var12 = 0;
            var14 = arg3;
        }
        int var15 = arg6;
        for (int var16 = 0; var16 < arg4; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field2835.field8118) {
                int[] var22 = this.field2835.method8(var16, (byte) -18);
                var20 = var22;
                var19 = var22;
                var21 = var22;
            } else {
                int[][] var18 = this.field2835.method223(2, var16);
                var19 = var18[2];
                var20 = var18[0];
                var21 = var18[1];
            }
            if (arg1) {
                var15 = var16;
            }
            for (int var23 = var12; var23 != var14; var23 += var13) {
                int var24 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var21[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var19[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = class480.field6400[var25];
                int var28 = class480.field6400[var24];
                int var29 = class480.field6400[var26];
                int var30 = (var28 << 16) + (var27 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg1) {
                    var15 += arg3 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field2838.length; var17++) {
            this.field2838[var17].method3144((byte) 2);
        }
        return var11;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Lbi;DZILe;II)[I", line = 200)
    public final int[] method1255(class449 arg0, double arg1, boolean arg2, int arg3, class498 arg4, int arg5, int arg6) {
        class570.field7572 = arg4;
        class541.field7122 = arg0;
        field2831++;
        for (int var9 = 0; var9 < this.field2838.length; var9++) {
            this.field2838[var9].method3145(arg6, -256, arg5);
        }
        if (arg3 > -94) {
            this.field2839 = null;
        }
        class555.method3073(255, arg1);
        class665.method3734((byte) 16, arg6, arg5);
        int[] var10 = new int[arg5 * 4 * arg6];
        int var11 = 0;
        for (int var12 = 0; var12 < arg5; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field2835.field8118) {
                int[] var14 = this.field2835.method8(var12, (byte) -18);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field2835.method223(2, var12);
                var15 = var18[0];
                var17 = var18[1];
                var16 = var18[2];
            }
            if (arg2) {
                var11 = var12;
            }
            int[] var19;
            if (this.field2842.field8118) {
                var19 = this.field2842.method8(var12, (byte) -18);
            } else {
                var19 = this.field2842.method223(2, var12)[0];
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
                int var24 = class480.field6400[var22];
                int var25 = class480.field6400[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class480.field6400[var23];
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
                if (arg2) {
                    var11 += arg6 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field2838.length; var13++) {
            this.field2838[var13].method3144((byte) 2);
        }
        return var10;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZIIILe;Lbi;)[F", line = 351)
    public final float[] method1256(boolean arg0, int arg1, int arg2, int arg3, class498 arg4, class449 arg5) {
        class570.field7572 = arg4;
        field2836++;
        class541.field7122 = arg5;
        if (arg1 != -636657534) {
            this.method1255(null, 0.6036960320350064D, true, -55, null, -27, 85);
        }
        for (int var7 = 0; var7 < this.field2838.length; var7++) {
            this.field2838[var7].method3145(arg3, -256, arg2);
        }
        class665.method3734((byte) 16, arg3, arg2);
        float[] var8 = new float[arg3 * 4 * arg2];
        int var9 = 0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field2835.field8118) {
                int[] var12 = this.field2835.method8(var10, (byte) -18);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field2835.method223(2, var10);
                var13 = var16[1];
                var14 = var16[0];
                var15 = var16[2];
            }
            int[] var17;
            if (this.field2842.field8118) {
                var17 = this.field2842.method8(var10, (byte) -18);
            } else {
                var17 = this.field2842.method223(2, var10)[0];
            }
            if (arg0) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field2839.field8118) {
                var18 = this.field2839.method8(var10, (byte) -18);
            } else {
                var18 = this.field2839.method223(arg1 + 636657536, var10)[0];
            }
            for (int var19 = arg3 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if ((var20 < 0.0F)) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = var20;
                if (arg0) {
                    var9 += (arg3 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field2838.length; var11++) {
            this.field2838[var11].method3144((byte) 2);
        }
        return var8;
    }

    @OriginalMember(owner = "client!dga", name = "<init>", descriptor = "()V", line = 463)
    public class194() {
        this.field2837 = new int[0];
        this.field2841 = new int[0];
        this.field2839 = new class39(0);
        this.field2839.field8121 = 1;
        this.field2835 = new class39();
        this.field2835.field8121 = 1;
        this.field2842 = new class39();
        this.field2838 = new class615[] { this.field2835, this.field2842, this.field2839 };
        this.field2842.field8121 = 1;
    }

    @OriginalMember(owner = "client!dga", name = "<init>", descriptor = "(Leh;)V", line = 478)
    public class194(class335 arg0) {
        int var2 = arg0.method2034(255);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field2838 = new class615[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class615 var16 = class96.method747(arg0, (byte) -118);
            if (var16.method3365(-1) >= 0) {
                var3++;
            }
            if (var16.method3146((byte) 75) >= 0) {
                var4++;
            }
            int var17 = var16.field8135.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method2034(255);
            }
            this.field2838[var6] = var16;
        }
        this.field2837 = new int[var3];
        int var7 = 0;
        this.field2841 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class615 var11 = this.field2838[var9];
            int var12 = var11.field8135.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field8135[var13] = this.field2838[var5[var9][var13]];
            }
            int var14 = var11.method3365(-1);
            int var15 = var11.method3146((byte) 95);
            if (var14 > 0) {
                this.field2837[var7++] = var14;
            }
            if (var15 > 0) {
                this.field2841[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field2835 = this.field2838[arg0.method2034(255)];
        this.field2842 = this.field2838[arg0.method2034(255)];
        Object var10 = null;
        this.field2839 = this.field2838[arg0.method2034(255)];
    }
}
