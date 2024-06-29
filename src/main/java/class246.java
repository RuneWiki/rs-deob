import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class246 extends class617 {

    @OriginalMember(owner = "client!eh", name = "y", descriptor = "[I")
    private int[] field3032;

    @OriginalMember(owner = "client!eh", name = "E", descriptor = "[I")
    private int[] field3038;

    @OriginalMember(owner = "client!eh", name = "M", descriptor = "Lcu;")
    private class478 field3046;

    @OriginalMember(owner = "client!eh", name = "A", descriptor = "Lcu;")
    private class478 field3034;

    @OriginalMember(owner = "client!eh", name = "D", descriptor = "Lcu;")
    private class478 field3037;

    @OriginalMember(owner = "client!eh", name = "J", descriptor = "[Lcu;")
    private class478[] field3043;

    @OriginalMember(owner = "client!eh", name = "x", descriptor = "Lqh;")
    public static class320 field3031 = null;

    @OriginalMember(owner = "client!eh", name = "B", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!eh", name = "C", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!eh", name = "F", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!eh", name = "G", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!eh", name = "I", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!eh", name = "K", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!eh", name = "L", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!eh", name = "N", descriptor = "Ltf;")
    public static class701 field3047;

    @OriginalMember(owner = "client!eh", name = "H", descriptor = "Z")
    public static boolean field3041;

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "[Lsf;")
    public static class603[] field3033;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IILtf;Lfa;ZBD)[I", line = 4)
    public final int[] method1447(int arg0, int arg1, class701 arg2, class524 arg3, boolean arg4, byte arg5, double arg6) {
        class50.field504 = arg3;
        class407.field5434 = arg2;
        field3042++;
        for (int var9 = 0; var9 < this.field3043.length; var9++) {
            this.field3043[var9].method2749(1033, arg0, arg1);
        }
        class327.method1840(arg6, false);
        class611.method3405(arg1, false, arg0);
        int[] var10 = new int[arg1 * 4 * arg0];
        int var11 = 0;
        if (arg5 >= -77) {
            this.method1447(58, -102, null, null, false, (byte) -24, 0.3190987560372417D);
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field3034.field6881) {
                int[] var14 = this.field3034.method35(var12, -11323);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field3034.method104(true, var12);
                var16 = var18[1];
                var17 = var18[2];
                var15 = var18[0];
            }
            if (arg4) {
                var11 = var12;
            }
            int[] var19;
            if (this.field3037.field6881) {
                var19 = this.field3037.method35(var12, -11323);
            } else {
                var19 = this.field3037.method104(true, var12)[0];
            }
            for (int var20 = arg1 - 1; var20 >= 0; var20--) {
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
                int var24 = class494.field7159[var21];
                int var25 = class494.field7159[var22];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class494.field7159[var23];
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
                var10[var11++] = (var24 << 16) + (var25 << 8) + (var27 << 24) + var26;
                if (arg4) {
                    var11 += arg1 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field3043.length; var13++) {
            this.field3043[var13].method107(true);
        }
        return var10;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V", line = 143)
    public static final void method1448(int arg0) {
        field3036++;
        class359.field4830.method3438(arg0 - 4867);
        class530.field7470 = 0;
        if (arg0 != 4883) {
            method1450((byte) -61);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZDIIZLfa;ILtf;)[I", line = 167)
    public final int[] method1449(boolean arg0, double arg1, int arg2, int arg3, boolean arg4, class524 arg5, int arg6, class701 arg7) {
        class50.field504 = arg5;
        class407.field5434 = arg7;
        field3040++;
        for (int var10 = 0; var10 < this.field3043.length; var10++) {
            this.field3043[var10].method2749(1033, arg2, arg6);
        }
        class327.method1840(arg1, false);
        class611.method3405(arg6, false, arg2);
        int[] var11 = new int[arg2 * arg6];
        int var12;
        int var13;
        byte var14;
        if (arg0) {
            var12 = arg6 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var12 = 0;
            var13 = arg6;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg2; var16++) {
            if (arg4) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field3034.field6881) {
                int[] var18 = this.field3034.method35(var16, -11323);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field3034.method104(true, var16);
                var20 = var22[2];
                var19 = var22[1];
                var21 = var22[0];
            }
            for (int var23 = var12; var23 != var13; var23 += var14) {
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
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = class494.field7159[var24];
                int var28 = class494.field7159[var25];
                int var29 = class494.field7159[var26];
                int var30 = (var27 << 16) + (var28 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg4) {
                    var15 += arg6 - 1;
                }
            }
        }
        if (arg3 != -8339) {
            field3031 = null;
        }
        for (int var17 = 0; var17 < this.field3043.length; var17++) {
            this.field3043[var17].method107(true);
        }
        return var11;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)V", line = 311)
    public static void method1450(byte arg0) {
        field3031 = null;
        if (arg0 < 38) {
            method1450((byte) -26);
        }
        field3033 = null;
        field3047 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLtf;Lfa;)Z", line = 326)
    public final boolean method1451(byte arg0, class701 arg1, class524 arg2) {
        field3044++;
        if (class16.field127 < 0) {
            for (int var4 = 0; var4 < this.field3038.length; var4++) {
                if (!arg1.method3849(this.field3038[var4], false)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field3038.length; var5++) {
                if (!arg1.method3860(this.field3038[var5], (byte) -99, class16.field127)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field3032.length; var6++) {
            if (!arg2.method144(8649, this.field3032[var6])) {
                return false;
            }
        }
        if (arg0 <= 42) {
            field3039 = -70;
        }
        return true;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V", line = 381)
    public class246() {
        this.field3032 = new int[0];
        this.field3038 = new int[0];
        this.field3046 = new class208(0);
        this.field3046.field6887 = 1;
        this.field3034 = new class208();
        this.field3034.field6887 = 1;
        this.field3037 = new class208();
        this.field3043 = new class478[] { this.field3034, this.field3037, this.field3046 };
        this.field3037.field6887 = 1;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lnp;)V", line = 396)
    public class246(class115 arg0) {
        int var2 = arg0.method620((byte) 85);
        int var3 = 0;
        int var4 = 0;
        this.field3043 = new class478[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class478 var16 = class351.method2078(127, arg0);
            if (var16.method109(-1) >= 0) {
                var3++;
            }
            if (var16.method2750(false) >= 0) {
                var4++;
            }
            int var17 = var16.field6888.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method620((byte) -126);
            }
            this.field3043[var6] = var16;
        }
        this.field3038 = new int[var3];
        int var7 = 0;
        this.field3032 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class478 var11 = this.field3043[var9];
            int var12 = var11.field6888.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field6888[var13] = this.field3043[var5[var9][var13]];
            }
            int var14 = var11.method109(-1);
            int var15 = var11.method2750(false);
            if (var14 > 0) {
                this.field3038[var7++] = var14;
            }
            if (var15 > 0) {
                this.field3032[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field3034 = this.field3043[arg0.method620((byte) -127)];
        this.field3037 = this.field3043[arg0.method620((byte) -126)];
        this.field3046 = this.field3043[arg0.method620((byte) -18)];
        Object var10 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lfa;IBLtf;ZI)[F", line = 483)
    public final float[] method1452(class524 arg0, int arg1, byte arg2, class701 arg3, boolean arg4, int arg5) {
        class407.field5434 = arg3;
        class50.field504 = arg0;
        field3045++;
        if (arg2 != -50) {
            return null;
        }
        for (int var7 = 0; var7 < this.field3043.length; var7++) {
            this.field3043[var7].method2749(1033, arg1, arg5);
        }
        class611.method3405(arg5, false, arg1);
        float[] var8 = new float[arg1 * arg5 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field3034.field6881) {
                int[] var16 = this.field3034.method35(var10, -11323);
                var15 = var16;
                var13 = var16;
                var14 = var16;
            } else {
                int[][] var12 = this.field3034.method104(true, var10);
                var13 = var12[1];
                var14 = var12[0];
                var15 = var12[2];
            }
            int[] var17;
            if (this.field3037.field6881) {
                var17 = this.field3037.method35(var10, -11323);
            } else {
                var17 = this.field3037.method104(true, var10)[0];
            }
            if (arg4) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field3046.field6881) {
                var18 = this.field3046.method35(var10, -11323);
            } else {
                var18 = this.field3046.method104(true, var10)[0];
            }
            for (int var19 = arg5 - 1; var19 >= 0; var19--) {
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
                if (arg4) {
                    var9 += (arg5 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field3043.length; var11++) {
            this.field3043[var11].method107(true);
        }
        return var8;
    }
}
