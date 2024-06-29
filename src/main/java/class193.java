import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class193 extends class416 {

    @OriginalMember(owner = "client!m", name = "M", descriptor = "[I")
    private int[] field2921;

    @OriginalMember(owner = "client!m", name = "C", descriptor = "[I")
    private int[] field2911;

    @OriginalMember(owner = "client!m", name = "E", descriptor = "Lgl;")
    private class601 field2913;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "Lgl;")
    private class601 field2922;

    @OriginalMember(owner = "client!m", name = "A", descriptor = "Lgl;")
    private class601 field2909;

    @OriginalMember(owner = "client!m", name = "H", descriptor = "[Lgl;")
    private class601[] field2916;

    @OriginalMember(owner = "client!m", name = "F", descriptor = "Lu;")
    public static class74 field2914 = null;

    @OriginalMember(owner = "client!m", name = "G", descriptor = "I")
    public static int field2915 = 0;

    @OriginalMember(owner = "client!m", name = "x", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!m", name = "y", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!m", name = "z", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!m", name = "B", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!m", name = "I", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!m", name = "J", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!m", name = "K", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!m", name = "D", descriptor = "Ltea;")
    public static class241 field2912;

    @OriginalMember(owner = "client!m", name = "L", descriptor = "Lwu;")
    public static class376 field2920;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BLd;ILwu;DIZ)[I")
    public final int[] method1320(byte arg0, class152 arg1, int arg2, class376 arg3, double arg4, int arg5, boolean arg6) {
        field2910++;
        class15.field211 = arg3;
        class293.field4204 = arg1;
        for (int var9 = 0; var9 < this.field2916.length; var9++) {
            this.field2916[var9].method2403(arg2, (byte) 124, arg5);
        }
        if (arg0 <= 20) {
            return null;
        }
        class294.method1817(arg4, false);
        class626.method3443(arg5, false, arg2);
        int[] var10 = new int[arg2 * arg5];
        int var11 = 0;
        for (int var12 = 0; var12 < arg5; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field2922.field7897) {
                int[] var18 = this.field2922.method5((byte) -40, var12);
                var16 = var18;
                var15 = var18;
                var17 = var18;
            } else {
                int[][] var14 = this.field2922.method7(var12, true);
                var15 = var14[1];
                var16 = var14[2];
                var17 = var14[0];
            }
            int[] var19;
            if (this.field2909.field7897) {
                var19 = this.field2909.method5((byte) -40, var12);
            } else {
                var19 = this.field2909.method7(var12, true)[0];
            }
            if (arg6) {
                var11 = var12;
            }
            for (int var20 = arg2 - 1; var20 >= 0; var20--) {
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
                int var24 = class730.field10133[var22];
                int var25 = class730.field10133[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class730.field10133[var23];
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
                var10[var11++] = (var24 << 8) + ((var27 << 24) - (-(var25 << 16) - var26));
                if (arg6) {
                    var11 += arg2 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field2916.length; var13++) {
            this.field2916[var13].method1986(true);
        }
        return var10;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZBILd;Lwu;I)[F")
    public final float[] method1321(boolean arg0, byte arg1, int arg2, class152 arg3, class376 arg4, int arg5) {
        class293.field4204 = arg3;
        if (arg1 > -72) {
            field2912 = null;
        }
        class15.field211 = arg4;
        field2908++;
        for (int var7 = 0; var7 < this.field2916.length; var7++) {
            this.field2916[var7].method2403(arg5, (byte) -80, arg2);
        }
        class626.method3443(arg2, false, arg5);
        float[] var8 = new float[arg2 * 4 * arg5];
        int var9 = 0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field2922.field7897) {
                int[] var12 = this.field2922.method5((byte) -40, var10);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field2922.method7(var10, true);
                var13 = var16[0];
                var15 = var16[2];
                var14 = var16[1];
            }
            int[] var17;
            if (this.field2909.field7897) {
                var17 = this.field2909.method5((byte) -40, var10);
            } else {
                var17 = this.field2909.method7(var10, true)[0];
            }
            if (arg0) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field2913.field7897) {
                var18 = this.field2913.method5((byte) -40, var10);
            } else {
                var18 = this.field2913.method7(var10, true)[0];
            }
            for (int var19 = arg5 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = var20;
                if (arg0) {
                    var9 += (arg5 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field2916.length; var11++) {
            this.field2916[var11].method1986(true);
        }
        return var8;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ld;Lwu;Z)Z")
    public final boolean method1322(class152 arg0, class376 arg1, boolean arg2) {
        field2917++;
        if (class360.field5067 < 0) {
            for (int var4 = 0; var4 < this.field2911.length; var4++) {
                if (!arg1.method2216(this.field2911[var4], -55)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field2911.length; var5++) {
                if (!arg1.method2211(44, this.field2911[var5], class360.field5067)) {
                    return false;
                }
            }
        }
        if (!arg2) {
            this.field2916 = null;
        }
        for (int var6 = 0; var6 < this.field2921.length; var6++) {
            if (!arg0.method85(this.field2921[var6], -32345)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIBII)V")
    public static final void method1323(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field2919++;
        if (arg4 == 8 || arg4 == 16) {
            for (int var6 = 0; var6 < class383.field5368; var6++) {
                class177 var7 = class247.field3434[var6];
                if (var7.field2663 == arg4 && var7.field2661 == arg3 && var7.field2673 == arg1 || var7.field2669 == arg3 && var7.field2673 == arg1) {
                    if (class383.field5368 != var6) {
                        class335.method2017(class247.field3434, var6 + 1, class247.field3434, var6, class247.field3434.length - var6 - 1);
                    }
                    class383.field5368--;
                    return;
                }
            }
        } else {
            class701 var5 = class660.field8718[arg0][arg3][arg1];
            if (var5 != null) {
                if (arg4 == 1) {
                    var5.field9731 = 0;
                } else if (arg4 == 2) {
                    var5.field9732 = 0;
                }
            }
            class485.method2737(true);
        }
        if (arg2 < 32) {
            field2912 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IBZDLwu;Ld;IZ)[I")
    public final int[] method1324(int arg0, byte arg1, boolean arg2, double arg3, class376 arg4, class152 arg5, int arg6, boolean arg7) {
        field2918++;
        class15.field211 = arg4;
        class293.field4204 = arg5;
        for (int var10 = 0; var10 < this.field2916.length; var10++) {
            this.field2916[var10].method2403(arg6, (byte) 88, arg0);
        }
        if (arg1 != -107) {
            this.field2913 = null;
        }
        class294.method1817(arg3, false);
        class626.method3443(arg0, false, arg6);
        int[] var11 = new int[arg0 * arg6];
        int var12;
        int var13;
        byte var14;
        if (arg2) {
            var12 = -1;
            var13 = arg6 - 1;
            var14 = -1;
        } else {
            var13 = 0;
            var12 = arg6;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg0; var16++) {
            if (arg7) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field2922.field7897) {
                int[] var18 = this.field2922.method5((byte) -40, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field2922.method7(var16, true);
                var20 = var22[1];
                var21 = var22[2];
                var19 = var22[0];
            }
            for (int var23 = var13; var23 != var12; var23 += var14) {
                int var24 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var20[var23] >> 4;
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
                int var27 = class730.field10133[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class730.field10133[var24];
                int var29 = class730.field10133[var26];
                int var30 = (var27 << 8) + (var28 << 16) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg7) {
                    var15 += arg6 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field2916.length; var17++) {
            this.field2916[var17].method1986(true);
        }
        return var11;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public static void method1325(int arg0) {
        field2920 = null;
        if (arg0 == -879071864) {
            field2912 = null;
            field2914 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
    public class193() {
        this.field2921 = new int[0];
        this.field2911 = new int[0];
        this.field2913 = new class167(0);
        this.field2913.field7898 = 1;
        this.field2922 = new class167();
        this.field2922.field7898 = 1;
        this.field2909 = new class167();
        this.field2909.field7898 = 1;
        this.field2916 = new class601[] { this.field2922, this.field2909, this.field2913 };
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lee;)V")
    public class193(class677 arg0) {
        int var2 = arg0.method3821((byte) -86);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field2916 = new class601[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class601 var16 = class44.method318((byte) 114, arg0);
            if (var16.method1984(-1) >= 0) {
                var3++;
            }
            if (var16.method2401(99) >= 0) {
                var4++;
            }
            int var17 = var16.field7893.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method3821((byte) 99);
            }
            this.field2916[var6] = var16;
        }
        this.field2911 = new int[var3];
        this.field2921 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class601 var11 = this.field2916[var9];
            int var12 = var11.field7893.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field7893[var13] = this.field2916[var5[var9][var13]];
            }
            int var14 = var11.method1984(-1);
            int var15 = var11.method2401(94);
            if (var14 > 0) {
                this.field2911[var7++] = var14;
            }
            if (var15 > 0) {
                this.field2921[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field2922 = this.field2916[arg0.method3821((byte) -75)];
        this.field2909 = this.field2916[arg0.method3821((byte) -40)];
        Object var10 = null;
        this.field2913 = this.field2916[arg0.method3821((byte) -34)];
    }
}
