import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class386 extends class436 {

    @OriginalMember(owner = "client!og", name = "H", descriptor = "[I")
    public static int[] field5621 = new int[] { 0, 0, 0, -2, 0, 0, 15, 0, 15, 8, -1, 2, 0, 0, 10, 0, 6, 0, 0, 12, 0, 20, 7, 0, 0, 2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 10, 0, 6, 14, 0, 0, 0, 0, -1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 12, 0, -1, 0, 0, 0, 3, -1, 0, 2, 0, 0, 0, 0, 0, 6, 0, 0, 1, 5, 0, 7, 8, 0, 0, 0, 0, 0, 0, 0, 8, 8, 0, 8, 6, 0, 8, 0, 0, 0, 2, -2, 0, 0, 6, 3, 0, 0, 0, -2, -1, 0, 1, 0, 6, 0, -2, -1, -1, 0, -2, 0, 8, 0, 6, 0, 0, 0, 0, 3, 7, 0, 4, 0, 12, 0, 0, 0, 0, 0, 0, 3, 0, 3, 5, 0, 12, 0, 8, 0, 0, 2, 7, 0, 1, 0, 0, 0, -2, 0, 5, 0, 2, 6, 28, -2, 0, 0, -1, 0, 8, 10, 0, 0, 6, 5, 0, -1, 0, -2, 0, 0, 0, 0, 2, 4, 0, -2, 17, 0, 0, -2, 9, -1, 4, 0, 0, -1, 0, 0, 0, 0, 0, 1, 0, 6, 0, 4, -2, -1, 1, -2, 0, 0, 0, 0, 0, 14, 0, 0, 0, 6, 0, -1, 11, 3, 0, 0, 0, 0, 0, 0, -2, -1, 6, 0, -1, -1, 0, 0, 0, 0, 0, 0, 2, 0, 3, 12, 0, 0, 0, 0, -1, 0, 10 };

    @OriginalMember(owner = "client!og", name = "N", descriptor = "[I")
    public static int[] field5627 = new int[100];

    @OriginalMember(owner = "client!og", name = "I", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!og", name = "J", descriptor = "I")
    public static int field5623;

    @OriginalMember(owner = "client!og", name = "K", descriptor = "I")
    public static int field5624;

    @OriginalMember(owner = "client!og", name = "L", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!og", name = "M", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!og", name = "O", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "I")
    public static int field5630;

    @OriginalMember(owner = "client!og", name = "R", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!og", name = "T", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "(I)V", line = 3)
    public static void method2521(int arg0) {
        field5627 = null;
        if (arg0 != 511) {
            field5625 = 105;
        }
        field5621 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)[I", line = 15)
    public final int[] method14(int arg0, int arg1) {
        ++field5632;
        int[] var3 = super.field6258.method2688((byte) -58, arg0);
        if (super.field6258.field6138) {
            int[] var4 = this.method2729(0, arg1 + -18338, arg0);
            int[] var5 = this.method2729(1, 0, arg0);
            int[] var6 = this.method2729(2, arg1 ^ 18338, arg0);
            for (int var7 = 0; var7 < class43.field653; ++var7) {
                int var8 = var6[var7];
                if (var8 != 4096) {
                    if (~var8 != -1) {
                        var3[var7] = var4[var7] * var8 - -((-var8 + 4096) * var5[var7]) >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        if (arg1 != 18338) {
            method2523(119, 96, (class437) null, 82, -65, (class369) null, -58, (class354) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIZIIBIIIII)Z", line = 67)
    public static final boolean method2522(int arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = 108 / ((arg5 - 22) / 41);
        ++field5624;
        int var12 = class237.method1493(class333.field4502, arg9, class24.field326[class265.field3617], arg4, arg1, arg2, class307.field4211.method410((byte) 45), class66.field1039, arg3, arg10, arg7, 0, arg8, arg6, arg0);
        if (~var12 > -2) {
            return false;
        } else {
            class394.field5764 = class66.field1039[var12 + -1];
            class184.field2575 = class333.field4502[var12 + -1];
            class46.field714 = false;
            class77.method548(43);
            return true;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IILql;IILsk;ILke;)V", line = 87)
    public static final void method2523(int arg0, int arg1, class437 arg2, int arg3, int arg4, class369 arg5, int arg6, class354 arg7) {
        ++field5623;
        class398 var8 = new class398();
        var8.field5819 = arg3;
        if (arg1 != -30107) {
            method2523(-102, 1, (class437) null, -18, 127, (class369) null, -60, (class354) null);
        }
        var8.field5823 = arg6 * 128;
        var8.field5796 = arg0 * 128;
        if (arg5 == null) {
            if (arg2 != null) {
                var8.field5811 = arg2;
                class221 var11 = arg2.field6290;
                if (var11.field2959 != null) {
                    var8.field5815 = true;
                    var11 = var11.method1407(arg1 + 30000);
                }
                if (var11 != null) {
                    var8.field5814 = (arg6 - -var11.field2958) * 128;
                    var8.field5813 = (var11.field2958 + arg0) * 128;
                    var8.field5817 = class323.method2042(-44, arg2);
                    var8.field5807 = var11.field2938 * 128;
                    var8.field5797 = var11.field2971;
                }
                class286.field3939.method1301(50, var8);
            } else if (arg7 != null) {
                var8.field5806 = arg7;
                var8.field5814 = 128 * (arg6 + arg7.method410((byte) 111));
                var8.field5813 = 128 * (arg0 - -arg7.method410((byte) 86));
                var8.field5817 = class232.method1463(arg1 + 8590, arg7);
                var8.field5807 = arg7.field4963 * 128;
                var8.field5797 = arg7.field5004;
                class307.field4212.method1419((long) arg7.field862, 100, var8);
            }
        } else {
            var8.field5803 = arg5;
            int var9 = arg5.field5215;
            int var10 = arg5.field5200;
            if (~arg4 == -2 || arg4 == 3) {
                var10 = arg5.field5215;
                var9 = arg5.field5200;
            }
            var8.field5821 = arg5.field5186;
            var8.field5805 = arg5.field5201;
            var8.field5809 = arg5.field5168;
            var8.field5807 = arg5.field5205 * 128;
            var8.field5813 = (arg0 - -var10) * 128;
            var8.field5817 = arg5.field5229;
            var8.field5797 = arg5.field5185;
            var8.field5814 = (arg6 - -var9) * 128;
            if (arg5.field5202 != null) {
                var8.field5815 = true;
                var8.method2572(-16449);
            }
            if (var8.field5809 != null) {
                var8.field5795 = (int) (Math.random() * (double) (-var8.field5805 + var8.field5821)) + var8.field5805;
            }
            class140.field1993.method1301(50, var8);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIZII)V", line = 184)
    public static final void method2524(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        ++field5630;
        int var6 = 0;
        int var7 = arg2;
        int var8 = arg0 * arg0;
        int var9 = arg2 * arg2;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg2 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = -((var12 - 1) * var11) + var9;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg2 << 1) + -3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg2 + -1) * var15;
        class73.method486(-arg0 + arg4, class84.field1286[arg5], arg1, 104, arg0 + arg4);
        if (arg3) {
            field5627 = null;
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var17 += var16;
                    ++var6;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                ++var6;
                var19 += var16;
                var17 += var16;
            }
            var13 += -var20;
            var14 += -var18;
            --var7;
            var20 -= var15;
            var18 -= var15;
            int var21 = -var7 + arg5;
            int var22 = arg5 - -var7;
            int var23 = arg4 - -var6;
            int var24 = arg4 - var6;
            class73.method486(var24, class84.field1286[var21], arg1, 79, var23);
            class73.method486(var24, class84.field1286[var22], arg1, 124, var23);
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V", line = 272)
    public class386() {
        super(3, false);
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(II)[[I", line = 276)
    public final int[][] method85(int arg0, int arg1) {
        ++field5628;
        int[][] var3 = super.field6259.method1848((byte) 63, arg1);
        if (arg0 != -13348) {
            method2526(-57, 87, -32, true, 89);
        }
        if (super.field6259.field3950) {
            int[] var4 = this.method2729(2, 0, arg1);
            int[][] var5 = this.method2731(arg1, false, 0);
            int[][] var6 = this.method2731(arg1, false, 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; ~var16 > ~class43.field653; ++var16) {
                int var17 = var4[var16];
                if (~var17 != -4097) {
                    if (var17 == 0) {
                        var7[var16] = var13[var16];
                        var8[var16] = var14[var16];
                        var9[var16] = var15[var16];
                    } else {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 - -(var13[var16] * var18) >> 12;
                        var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                        var9[var16] = var12[var16] * var17 - -(var15[var16] * var18) >> 12;
                    }
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IILeb;)V", line = 358)
    public final void method18(int arg0, int arg1, class371 arg2) {
        if (~arg1 == -1) {
            super.field6256 = arg2.method2429(0) == 1;
        }
        ++field5631;
        if (arg0 != 34) {
            method2526(18, -61, 9, false, -88);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I[B)[B", line = 374)
    public static final byte[] method2525(int arg0, byte[] arg1) {
        ++field5626;
        class371 var2 = new class371(arg1);
        int var3 = var2.method2429(0);
        if (arg0 != -3) {
            field5629 = -16;
        }
        int var4 = var2.method2413((byte) -30);
        if (~var4 > -1 || ~class156.field2211 != -1 && ~var4 < ~class156.field2211) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method2427(var7, 0, 0, var4);
            return var7;
        } else {
            int var5 = var2.method2413((byte) -30);
            if (~var5 <= -1 && (class156.field2211 == 0 || ~var5 >= ~class156.field2211)) {
                byte[] var6 = new byte[var5];
                if (~var3 == -2) {
                    class380.method2481(var6, var5, arg1, var4, 9);
                } else {
                    class350.field4885.method74(var2, var6, 113);
                }
                return var6;
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIZI)V", line = 428)
    public static final void method2526(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg4 == 23503) {
            if (~class16.field205 != -1) {
                class340.field4751 = class16.field205;
                class99.method702(-17666, 0);
            } else {
                class142.method968(false, -46);
            }
            ++field5622;
            class308.field4217 = arg3;
            class222.field2978 = arg2;
            class223.field3012 = arg1;
            class42.method309(arg0);
        }
    }
}
