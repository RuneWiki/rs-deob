import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class64 extends class84 {

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "I")
    public static int field949 = 0;

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "I")
    public static int field950 = -2;

    @OriginalMember(owner = "client!qc", name = "X", descriptor = "[I")
    public static int[] field959 = new int[128];

    @OriginalMember(owner = "client!qc", name = "ab", descriptor = "S")
    public static short field962 = 256;

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!qc", name = "R", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!qc", name = "S", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!qc", name = "T", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!qc", name = "U", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!qc", name = "V", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!qc", name = "Y", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!qc", name = "Z", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!qc", name = "bb", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!qc", name = "W", descriptor = "[S")
    public static short[] field958;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)I")
    public static final int method464(int arg0, int arg1) {
        if (arg0 != 256) {
            return -67;
        } else {
            ++field961;
            return arg1 & 255;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)[I")
    public final int[] method91(byte arg0, int arg1) {
        int[] var3 = super.field1228.method1627(-1, arg1);
        if (arg0 > -125) {
            field962 = 80;
        }
        if (super.field1228.field3651) {
            int[] var4 = this.method612(0, arg1, false);
            int[] var5 = this.method612(1, arg1, false);
            int[] var6 = this.method612(2, arg1, false);
            for (int var7 = 0; ~var7 > ~class20.field221; ++var7) {
                int var8 = var6[var7];
                if (var8 != 4096) {
                    if (~var8 != -1) {
                        var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                    } else {
                        var3[var7] = var5[var7];
                    }
                } else {
                    var3[var7] = var4[var7];
                }
            }
        }
        ++field956;
        return var3;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        if (arg1 != -18) {
            method468((byte) 42, -66);
        }
        ++field955;
        int[][] var3 = super.field1211.method193((byte) -17, arg0);
        if (super.field1211.field321) {
            int[] var4 = this.method612(2, arg0, false);
            int[][] var5 = this.method611(0, (byte) -55, arg0);
            int[][] var6 = this.method611(1, (byte) -46, arg0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var6[0];
            int[] var13 = var6[2];
            int[] var14 = var5[2];
            int[] var15 = var6[1];
            for (int var16 = 0; ~var16 > ~class20.field221; ++var16) {
                int var17 = var4[var16];
                if (~var17 != -4097) {
                    if (var17 == 0) {
                        var7[var16] = var12[var16];
                        var8[var16] = var15[var16];
                        var9[var16] = var13[var16];
                    } else {
                        int var18 = -var17 + 4096;
                        var7[var16] = var10[var16] * var17 - -(var12[var16] * var18) >> 12;
                        var8[var16] = var11[var16] * var17 + var15[var16] * var18 >> 12;
                        var9[var16] = var14[var16] * var17 - -(var13[var16] * var18) >> 12;
                    }
                } else {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var14[var16];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
    public class64() {
        super(3, false);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZIIII)V")
    public static final void method465(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field954;
        ++class230.field3707;
        class283.method1931(-22278);
        if (arg1) {
            class161.method1199(false, 64, false, 0);
        } else {
            class3.method11(0, -3905);
            class161.method1199(false, 64, true, 0);
            if (~class114.field1649 == -1) {
                for (int var6 = 1; ~var6 >= -6; ++var6) {
                    class161.method1199(false, 64, false, var6);
                    class161.method1199(true, 64, false, var6);
                    class3.method11(var6, -3905);
                }
            } else {
                for (int var7 = 1; ~var7 >= -6; ++var7) {
                    class3.method11(var7, -3905);
                    class161.method1199(false, 64, false, var7);
                    class161.method1199(true, 64, false, var7);
                }
            }
        }
        if (!arg1) {
            class174.method1311((byte) -82);
        }
        class97.method753(-3830);
        if (class176.field2853 == 1) {
            int var8 = (int) class123.field1799;
            if (~var8 > ~(class177.field2866 / 256)) {
                var8 = class177.field2866 / 256;
            }
            if (class156.field2574[4] && ~var8 > ~(class45.field648[4] + 128)) {
                var8 = class45.field648[4] - -128;
            }
            int var9 = (int) class190.field3068 - -class296.field4679 & 2047;
            class276.method1910(class210.field3370, arg3, class129.method930(class186.field2993.field1910, class186.field2993.field1979, 92, class58.field826) + -50, false, var8, var9, class25.field290, 600 - -(var8 * 3));
        } else if (~class176.field2853 == -6) {
            class274.method1897(1000, arg3);
        }
        int var10 = class185.field2986;
        int var11 = class50.field736;
        int var12 = class196.field3177;
        int var13 = class67.field988;
        int var14 = class218.field3485;
        for (int var15 = 0; var15 < 5; ++var15) {
            if (class156.field2574[var15]) {
                int var22 = (int) (Math.random() * (double) (class196.field3186[var15] * 2 - -1) - (double) class196.field3186[var15] + Math.sin((double) class11.field120[var15] / 100.0D * (double) class150.field2445[var15]) * (double) class45.field648[var15]);
                if (~var15 == -3) {
                    class196.field3177 += var22;
                }
                if (var15 == 0) {
                    class50.field736 += var22;
                }
                if (~var15 == -2) {
                    class185.field2986 += var22;
                }
                if (~var15 == -5) {
                    class67.field988 += var22;
                    if (class67.field988 < 128) {
                        class67.field988 = 128;
                    }
                    if (~class67.field988 < -384) {
                        class67.field988 = 383;
                    }
                }
                if (var15 == 3) {
                    class218.field3485 = class218.field3485 + var22 & 2047;
                }
            }
        }
        class138.method983(18224);
        class70.method500(arg5, arg0, arg2 + arg5, arg0 + arg3);
        class47.method357();
        if (class57.field820 < 0) {
            class70.method508(arg5, arg0, arg2, arg3, 0);
        } else {
            class219 var16 = class241.method1684(class57.field820, class131.field2029, (byte) -5, class229.field3701, class287.field4562);
            var16.method1573(class277.field4443, arg5, arg0, arg2, arg3, class67.field988, class218.field3485, 0);
        }
        if (!class206.field3315 && class272.field4378 >= arg5 && class272.field4378 < arg2 + arg5 && class52.field767 >= arg0 && ~(arg0 + arg3) < ~class52.field767) {
            class228.field3671 = 0;
            class253.field4179 = true;
            int var17 = class123.field1800;
            int var18 = class179.field2892;
            int var19 = class126.field1857;
            int var20 = class260.field4253;
            class297.field4691 = (-arg0 + class52.field767) * (-var20 + var17) / arg3 + var20;
            class5.field41 = (-arg5 + class272.field4378) * (-var19 + var18) / arg2 + var19;
        } else {
            class253.field4179 = false;
            class228.field3671 = 0;
        }
        class126.method908(121);
        byte var21 = ~class267.method1856((byte) 85) != -3 ? 1 : (byte) class230.field3707;
        class293.method1985(class50.field736, class185.field2986, class196.field3177, class67.field988, class218.field3485, class105.field1533, class241.field3848, class220.field3530, class174.field2832, class159.field2604, class3.field32, class58.field826 + 1, var21, class186.field2993.field1979 >> 7, class186.field2993.field1910 >> 7);
        class126.method908(-116);
        class6.method33();
        class171.method1274(arg2, arg5, arg0, (byte) 116, arg3, 256, 256);
        class73.method535(arg5, arg0, arg2, 256, arg3, 256, 0);
        ((class32) class47.field689).method235(class161.field2628, 50);
        class143.method1025(arg5, arg0, arg2, false, arg3);
        class67.field988 = var13;
        class185.field2986 = var10;
        class50.field736 = var11;
        if (arg4 < -41) {
            class196.field3177 = var12;
            class218.field3485 = var14;
            if (class188.field3022 && class280.field4465.method1501(-94) == 0) {
                class188.field3022 = false;
            }
            if (class188.field3022) {
                class70.method508(arg5, arg0, arg2, arg3, 0);
                class12.method94(class132.field2182, 250, false);
            }
            if (!arg1 && !class188.field3022 && !class206.field3315 && arg5 <= class272.field4378 && arg2 + arg5 > class272.field4378 && ~arg0 >= ~class52.field767 && ~(arg0 + arg3) < ~class52.field767) {
                class177.method1320(class272.field4378, -128, arg0, arg5, class52.field767, arg2, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)[Lvd;")
    public static final class4[] method466(byte arg0) {
        ++field952;
        class4[] var1 = new class4[class143.field2318];
        for (int var2 = 0; var2 < class143.field2318; ++var2) {
            var1[var2] = new class4(class262.field4258, class62.field912, class217.field3457[var2], class272.field4377[var2], class19.field214[var2], class201.field3220[var2], class152.field2505[var2], class101.field1476);
        }
        if (arg0 != 26) {
            field949 = -77;
        }
        class188.method1398((byte) 102);
        return var1;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        if (~arg2 == -1) {
            super.field1217 = arg0.method1111(255) == 1;
        }
        if (arg1 < 87) {
            method470(false, 19, false, 111, 54);
        }
        ++field957;
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(B)Lhb;")
    public static final class222 method467(byte arg0) {
        ++field953;
        return arg0 != 21 ? null : class222.field3551;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(BI)Z")
    public static final boolean method468(byte arg0, int arg1) {
        if (arg0 != 101) {
            return true;
        } else {
            ++field951;
            return ~(-arg1 & arg1) == ~arg1;
        }
    }

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "(I)V")
    public static void method469(int arg0) {
        field959 = null;
        field958 = null;
        if (arg0 != 2) {
            method467((byte) -33);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZIZII)V")
    public static final void method470(boolean arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field960;
        if (!arg2) {
            field959 = null;
        }
        if (class184.method1364(arg3, (byte) 61)) {
            class17.method120(-118, -1, arg4, class113.field1631[arg3], arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)Lrd;")
    public static final class273 method471(int arg0, int arg1) {
        ++field963;
        int var2 = 116 / ((arg1 - 46) / 46);
        class273 var3 = (class273) class129.field1983.method1553((long) arg0, (byte) -112);
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class291.field4614.method643(arg0, 33, false);
            class273 var5 = new class273();
            if (var4 != null) {
                var5.method1895(arg0, new class152(var4), -1);
            }
            class129.field1983.method1551(var5, 0, (long) arg0);
            return var5;
        }
    }
}
