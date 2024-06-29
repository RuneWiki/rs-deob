import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class612 extends class747 {

    @OriginalMember(owner = "client!ca", name = "M", descriptor = "Lmaa;")
    public static class508 field8231 = new class508(13, -1);

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "F")
    public static float field8224;

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "I")
    public static int field8223;

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
    public static int field8225;

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "I")
    public static int field8226;

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "I")
    public static int field8227;

    @OriginalMember(owner = "client!ca", name = "J", descriptor = "I")
    public static int field8228;

    @OriginalMember(owner = "client!ca", name = "K", descriptor = "I")
    public static int field8229;

    @OriginalMember(owner = "client!ca", name = "L", descriptor = "I")
    public static int field8230;

    @OriginalMember(owner = "client!ca", name = "N", descriptor = "I")
    public static int field8232;

    @OriginalMember(owner = "client!ca", name = "O", descriptor = "I")
    public static int field8233;

    @OriginalMember(owner = "client!ca", name = "P", descriptor = "I")
    public static int field8234;

    @OriginalMember(owner = "client!ca", name = "Q", descriptor = "[Luea;")
    private class243[] field8235;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILdw;IIII)Lgv;")
    public static final class702 method3468(int arg0, class664 arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field8234;
        if (arg0 != -13011) {
            return null;
        } else if (!arg1.field9071 && (!class88.method611(arg3, 2) || !class88.method611(arg5, arg0 ^ -13009))) {
            return !arg1.field9057 ? new class702(arg1, arg2, arg4, arg3, arg5, class606.method3450(arg3, (byte) -25), class606.method3450(arg5, (byte) -25), true) : new class702(arg1, 34037, arg2, arg4, arg3, arg5, true);
        } else {
            return new class702(arg1, 3553, arg2, arg4, arg3, arg5, true);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)[I")
    public final int[] method182(int arg0, int arg1) {
        ++field8227;
        if (arg1 >= -89) {
            method3468(-36, (class664) null, 9, -82, 66, 29);
        }
        int[] var3 = super.field10279.method3479(true, arg0);
        if (super.field10279.field8263) {
            this.method3475(super.field10279.method3480(0), 70);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IBIZII)V")
    public static final void method3469(int arg0, byte arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg0 < 1) {
            arg0 = 1;
        }
        ++field8230;
        if (~arg2 > -2) {
            arg2 = 1;
        }
        int var6 = arg0 + -334;
        if (~var6 <= -1) {
            if (~var6 < -101) {
                var6 = 100;
            }
        } else {
            var6 = 0;
        }
        int var7 = class459.field6369 - -((class687.field9561 - class459.field6369) * var6 / 100);
        if (var7 >= class516.field7212) {
            if (class388.field5602 < var7) {
                var7 = class388.field5602;
            }
        } else {
            var7 = class516.field7212;
        }
        int var8 = arg0 * 512 * var7 / (arg2 * 334);
        if (class518.field7228 > var8) {
            short var9 = class518.field7228;
            var7 = arg2 * var9 * 334 / (arg0 * 512);
            if (~class388.field5602 > ~var7) {
                var7 = class388.field5602;
                int var10 = arg0 * 512 * var7 / (var9 * 334);
                int var11 = (-var10 + arg2) / 2;
                if (arg3) {
                    class129.field1802.method1437();
                    class129.field1802.method3249(arg4, 35, arg0, var11, -16777216, arg5);
                    class129.field1802.method3249(arg2 + arg4 - var11, 123, arg0, var11, -16777216, arg5);
                }
                arg4 += var11;
                arg2 -= var11 * 2;
            }
        } else if (class27.field348 < var8) {
            short var12 = class27.field348;
            var7 = var12 * 334 * arg2 / (arg0 * 512);
            if (var7 < class516.field7212) {
                var7 = class516.field7212;
                int var13 = var12 * 334 * arg2 / (var7 * 512);
                int var14 = (-var13 + arg0) / 2;
                if (arg3) {
                    class129.field1802.method1437();
                    class129.field1802.method3249(arg4, -28, var14, arg2, -16777216, arg5);
                    class129.field1802.method3249(arg4, 125, var14, arg2, -16777216, arg0 + arg5 + -var14);
                }
                arg0 -= var14 * 2;
                arg5 += var14;
            }
        }
        if (arg1 > -113) {
            method3469(55, (byte) 107, 101, false, 119, -100);
        }
        class6.field54 = (short) arg0;
        class54.field783 = arg4;
        class473.field6558 = arg5;
        class220.field2976 = (short) arg2;
        class487.field6813 = arg0 * var7 / 334;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZZB)V")
    public static final void method3470(boolean arg0, boolean arg1, byte arg2) {
        ++field8228;
        if (arg1) {
            ++class371.field5239;
            class457.method2795(true);
        }
        if (arg2 <= -17) {
            if (arg0) {
                ++class462.field6422;
                class456.method2789((byte) 121);
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "()V")
    public static final void method3471() {
        if (class320.field4443 != null) {
            for (int var0 = 0; var0 < class320.field4443.length; ++var0) {
                for (int var1 = 0; var1 < class61.field877; ++var1) {
                    for (int var2 = 0; var2 < class713.field9959; ++var2) {
                        if (class320.field4443[var0][var1][var2] != null) {
                            class320.field4443[var0][var1][var2].method1799(0);
                        }
                        class320.field4443[var0][var1][var2] = null;
                    }
                }
            }
        }
        class320.field4443 = null;
        class550.field7649 = null;
        if (class319.field4435 != null) {
            for (int var3 = 0; var3 < class319.field4435.length; ++var3) {
                for (int var4 = 0; var4 < class61.field877; ++var4) {
                    for (int var5 = 0; var5 < class713.field9959; ++var5) {
                        if (class319.field4435[var3][var4][var5] != null) {
                            class319.field4435[var3][var4][var5].method1799(0);
                        }
                        class319.field4435[var3][var4][var5] = null;
                    }
                }
            }
        }
        class319.field4435 = null;
        class371.field5240 = null;
        class137.field1948 = null;
        class433.field6043 = null;
        class417.field5900 = null;
        class679.field9426 = null;
        class391.field5626 = null;
        class172.field2387 = null;
        class507.field7051 = null;
        class541.method3202(false);
        if (class529.field7337 != null) {
            for (int var6 = 0; var6 < class323.field4472; ++var6) {
                class529.field7337[var6] = null;
            }
            class323.field4472 = 0;
        }
        class234.field3474 = null;
        class333.field4710 = null;
        class204.field2694 = null;
        if (class324.field4481 != null) {
            for (int var7 = 0; var7 < class324.field4481.length; ++var7) {
                class324.field4481[var7] = null;
            }
            class450.field6246 = 0;
        }
        if (class274.field3967 != null) {
            for (int var8 = 0; var8 < class274.field3967.length; ++var8) {
                class274.field3967[var8] = null;
            }
            class477.field6643 = 0;
        }
        if (class532.field7385 != null) {
            for (int var9 = 0; var9 < class486.field6796; ++var9) {
                class532.field7385[var9] = null;
            }
            for (int var10 = 0; var10 < class370.field5229; ++var10) {
                for (int var11 = 0; var11 < class61.field877; ++var11) {
                    for (int var12 = 0; var12 < class713.field9959; ++var12) {
                        class142.field2015[var10][var11][var12] = 0L;
                    }
                }
            }
            class486.field6796 = 0;
        }
        class607.method3452(80);
        class269.field3931 = class269.field3929;
        class269.field3931.method2473((byte) 22);
        class151.field2085 = null;
        class644.field8632 = null;
        class680.field9452 = null;
        if (class280.field4069 != null) {
            class122.method760();
            class441.field6132.method1521(1);
            class441.field6132.method1540(0);
        }
        if (class690.field9610 != null) {
            class690.field9610 = null;
        }
        class441.field6132 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BII)V")
    public static final void method3472(byte arg0, int arg1, int arg2) {
        if (arg0 >= 54) {
            ++field8233;
            class346 var3 = class299.method1976(0, 14, arg1);
            var3.method2209(255);
            var3.field4926 = arg2;
        }
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
    public static void method3473(int arg0) {
        field8231 = null;
        if (arg0 != 16711680) {
            field8224 = -1.1293077F;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ldc;II)V")
    public final void method183(class63 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field10281 = ~arg0.method505((byte) -119) == -2;
            }
        } else {
            this.field8235 = new class243[arg0.method505((byte) -119)];
            for (int var4 = 0; var4 < this.field8235.length; ++var4) {
                int var5 = arg0.method505((byte) -119);
                if (var5 != 0) {
                    if (var5 != 1) {
                        if (~var5 != -3) {
                            if (~var5 == -4) {
                                this.field8235[var4] = class415.method2584(arg0, 6965);
                            }
                        } else {
                            this.field8235[var4] = class343.method2196(arg0, 75);
                        }
                    } else {
                        this.field8235[var4] = class498.method3013(arg0, class134.method848(arg1, -2278));
                    }
                } else {
                    this.field8235[var4] = class284.method1888(arg0, 122);
                }
            }
        }
        if (arg1 != 11608) {
            field8231 = null;
        }
        ++field8229;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
    public class612() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIZ)V")
    public static final void method3474(int arg0, int arg1, boolean arg2) {
        ++field8223;
        if (arg1 != 0) {
            method3474(46, -13, false);
        }
        if (arg2) {
            class583 var3 = class54.method400(class213.field2800, (byte) -79, class367.field5199);
            var3.field7963.method492(arg1 ^ -2, arg0);
            class463.method2838(var3, (byte) 127);
        } else {
            class546.method3226(class76.field1116, arg0, -1);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([[II)V")
    private final void method3475(int[][] arg0, int arg1) {
        ++field8225;
        int var3 = class73.field1095;
        int var4 = class414.field5865;
        int var5 = 99 % ((-52 - arg1) / 37);
        class486.method2952(arg0, -30320);
        class562.method3303(class73.field1097, -1169633886, 0, class415.field5878, 0);
        if (this.field8235 != null) {
            for (int var6 = 0; ~var6 > ~this.field8235.length; ++var6) {
                class243 var7 = this.field8235[var6];
                int var8 = var7.field3614;
                int var9 = var7.field3610;
                if (var8 >= 0) {
                    if (var9 < 0) {
                        var7.method90(var3, var4, 10893);
                    } else {
                        var7.method87(var4, var3, (byte) 94);
                    }
                } else if (var9 >= 0) {
                    var7.method92(var4, 34, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(II)[[I")
    public final int[][] method688(int arg0, int arg1) {
        int var3 = -3 % ((35 - arg0) / 58);
        ++field8226;
        int[][] var4 = super.field10289.method2200(0, arg1);
        if (super.field10289.field4906) {
            int var5 = class73.field1095;
            int var6 = class414.field5865;
            int[][] var7 = new int[var6][var5];
            int[][][] var8 = super.field10289.method2201(0);
            this.method3475(var7, -126);
            for (int var9 = 0; class414.field5865 > var9; ++var9) {
                int[] var10 = var7[var9];
                int[][] var11 = var8[var9];
                int[] var12 = var11[0];
                int[] var13 = var11[1];
                int[] var14 = var11[2];
                for (int var15 = 0; ~class73.field1095 < ~var15; ++var15) {
                    int var16 = var10[var15];
                    var14[var15] = class665.method3759(255, var16) << 4;
                    var13[var15] = class665.method3759(var16, 65280) >> 4;
                    var12[var15] = class665.method3759(var16, 16711680) >> 12;
                }
            }
        }
        return var4;
    }
}
