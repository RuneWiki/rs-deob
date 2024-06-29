import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class237 extends class452 {

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "[I")
    private int[] field3799;

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "[I")
    private int[] field3806;

    @OriginalMember(owner = "client!rb", name = "K", descriptor = "Leu;")
    private class337 field3811;

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "Leu;")
    private class337 field3807;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "Leu;")
    private class337 field3797;

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "[Leu;")
    private class337[] field3808;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "Lhn;")
    public static class509 field3798 = new class509(33, 6);

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "Lkh;")
    public static class13 field3805 = new class13(8);

    @OriginalMember(owner = "client!rb", name = "L", descriptor = "[J")
    public static long[] field3812 = new long[32];

    @OriginalMember(owner = "client!rb", name = "I", descriptor = "[[I")
    public static int[][] field3810 = new int[128][128];

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lul;ILga;)Z")
    public final boolean method1640(class406 arg0, int arg1, class279 arg2) {
        field3803++;
        if (class213.field3477 < 0) {
            for (int var4 = 0; var4 < this.field3806.length; var4++) {
                if (!arg0.method2556((byte) 21, this.field3806[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field3806.length; var5++) {
                if (!arg0.method2549(this.field3806[var5], true, class213.field3477)) {
                    return false;
                }
            }
        }
        if (arg1 > -10) {
            method1643(-41, -55, 51, -15);
        }
        for (int var6 = 0; var6 < this.field3799.length; var6++) {
            if (!arg2.method579(this.field3799[var6], true)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZDLga;IILul;IZ)[I")
    public final int[] method1641(boolean arg0, double arg1, class279 arg2, int arg3, int arg4, class406 arg5, int arg6, boolean arg7) {
        class503.field7264 = arg2;
        class172.field2557 = arg5;
        field3801++;
        for (int var10 = 0; var10 < this.field3808.length; var10++) {
            this.field3808[var10].method1121(arg6, 7, arg4);
        }
        class12.method78(arg1, -121);
        class344.method2149(0, arg4, arg6);
        int[] var11 = new int[arg4 * arg6];
        byte var12;
        int var13;
        int var14;
        if (arg7) {
            var13 = arg4 - 1;
            var14 = -1;
            var12 = -1;
        } else {
            var12 = 1;
            var13 = 0;
            var14 = arg4;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg6; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field3807.field5019) {
                int[] var18 = this.field3807.method179(var16, (byte) -11);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field3807.method673(var16, 126);
                var20 = var22[2];
                var19 = var22[0];
                var21 = var22[1];
            }
            if (arg0) {
                var15 = var16;
            }
            for (int var23 = var13; var23 != var14; var23 += var12) {
                int var24 = var19[var23] >> 4;
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
                int var26 = var20[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class111.field1559[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class111.field1559[var25];
                int var29 = class111.field1559[var26];
                int var30 = (var27 << 16) + (var28 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg0) {
                    var15 += arg4 - 1;
                }
            }
        }
        if (arg3 > -86) {
            method1644(false);
        }
        for (int var17 = 0; var17 < this.field3808.length; var17++) {
            this.field3808[var17].method1124(17165);
        }
        return var11;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(DILga;Lul;IZI)[I")
    public final int[] method1642(double arg0, int arg1, class279 arg2, class406 arg3, int arg4, boolean arg5, int arg6) {
        class503.field7264 = arg2;
        class172.field2557 = arg3;
        field3804++;
        for (int var9 = 0; var9 < this.field3808.length; var9++) {
            this.field3808[var9].method1121(arg1, 7, arg6);
        }
        class12.method78(arg0, -124);
        class344.method2149(0, arg6, arg1);
        int[] var10 = new int[arg1 * arg6 * 4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            int[] var16;
            int[] var17;
            int[] var18;
            if (this.field3807.field5019) {
                int[] var15 = this.field3807.method179(var12, (byte) -11);
                var16 = var15;
                var17 = var15;
                var18 = var15;
            } else {
                int[][] var19 = this.field3807.method673(var12, 79);
                var17 = var19[0];
                var18 = var19[1];
                var16 = var19[2];
            }
            if (arg5) {
                var11 = var12;
            }
            int[] var20;
            if (this.field3797.field5019) {
                var20 = this.field3797.method179(var12, (byte) -11);
            } else {
                var20 = this.field3797.method673(var12, -122)[0];
            }
            for (int var21 = arg6 - 1; var21 >= 0; var21--) {
                int var22 = var17[var21] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var18[var21] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = var16[var21] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                int var25 = class111.field1559[var22];
                if (var24 < 0) {
                    var24 = 0;
                }
                int var26 = class111.field1559[var23];
                int var27 = class111.field1559[var24];
                int var28;
                if (var25 == 0 && var26 == 0 && var27 == 0) {
                    var28 = 0;
                } else {
                    var28 = var20[var21] >> 4;
                    if (var28 > 255) {
                        var28 = 255;
                    }
                    if (var28 < 0) {
                        var28 = 0;
                    }
                }
                var10[var11++] = (var28 << 24) + (var25 << 16) - (-(var26 << 8) + -var27);
                if (arg5) {
                    var11 += arg6 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field3808.length; var13++) {
            this.field3808[var13].method1124(17165);
        }
        int var14 = -64 % ((arg4 - 52) / 48);
        return var10;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIII)V")
    public static final void method1643(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 << 3;
        int var5 = arg0 << 3;
        int var6 = arg3 << 3;
        field3802++;
        class181.field2711 = var5;
        class473.field6830 = var6;
        if (class176.field2611 == arg2) {
            class364.field5380 = var4;
            class419.field6263 = var5;
            class396.field5932 = var6;
        }
        class171.method1146(true);
        class471.field6814 = true;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
    public static void method1644(boolean arg0) {
        if (!arg0) {
            field3805 = null;
            field3810 = null;
            field3812 = null;
            field3798 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIZBLga;Lul;)[F")
    public final float[] method1645(int arg0, int arg1, boolean arg2, byte arg3, class279 arg4, class406 arg5) {
        field3800++;
        class503.field7264 = arg4;
        class172.field2557 = arg5;
        for (int var7 = 0; var7 < this.field3808.length; var7++) {
            this.field3808[var7].method1121(arg0, 7, arg1);
        }
        class344.method2149(0, arg1, arg0);
        if (arg3 != -51) {
            this.method1645(-22, 88, true, (byte) 119, null, null);
        }
        float[] var8 = new float[arg0 * 4 * arg1];
        int var9 = 0;
        for (int var10 = 0; var10 < arg0; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field3807.field5019) {
                int[] var16 = this.field3807.method179(var10, (byte) -11);
                var14 = var16;
                var13 = var16;
                var15 = var16;
            } else {
                int[][] var12 = this.field3807.method673(var10, 94);
                var13 = var12[0];
                var14 = var12[1];
                var15 = var12[2];
            }
            int[] var17;
            if (this.field3797.field5019) {
                var17 = this.field3797.method179(var10, (byte) -11);
            } else {
                var17 = this.field3797.method673(var10, arg3 + 136)[0];
            }
            if (arg2) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field3811.field5019) {
                var18 = this.field3811.method179(var10, (byte) -11);
            } else {
                var18 = this.field3811.method673(var10, -106)[0];
            }
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = var20;
                if (arg2) {
                    var9 += (arg1 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field3808.length; var11++) {
            this.field3808[var11].method1124(17165);
        }
        return var8;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
    public class237() {
        this.field3799 = new int[0];
        this.field3806 = new int[0];
        this.field3811 = new class448(0);
        this.field3811.field5012 = 1;
        this.field3807 = new class448();
        this.field3807.field5012 = 1;
        this.field3797 = new class448();
        this.field3797.field5012 = 1;
        this.field3808 = new class337[] { this.field3807, this.field3797, this.field3811 };
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lhp;)V")
    public class237(class217 arg0) {
        int var2 = arg0.method1515((byte) 122);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field3808 = new class337[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class337 var16 = class18.method149((byte) -118, arg0);
            if (var16.method2122(0) >= 0) {
                var3++;
            }
            if (var16.method1123((byte) -101) >= 0) {
                var4++;
            }
            int var17 = var16.field5015.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1515((byte) 121);
            }
            this.field3808[var6] = var16;
        }
        this.field3806 = new int[var3];
        int var7 = 0;
        this.field3799 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class337 var11 = this.field3808[var9];
            int var12 = var11.field5015.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field5015[var13] = this.field3808[var5[var9][var13]];
            }
            int var14 = var11.method2122(0);
            int var15 = var11.method1123((byte) -101);
            if (var14 > 0) {
                this.field3806[var7++] = var14;
            }
            if (var15 > 0) {
                this.field3799[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field3807 = this.field3808[arg0.method1515((byte) 122)];
        this.field3797 = this.field3808[arg0.method1515((byte) 121)];
        this.field3811 = this.field3808[arg0.method1515((byte) 127)];
        Object var10 = null;
    }
}
