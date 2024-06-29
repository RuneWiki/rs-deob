import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class297 extends class183 implements class116 {

    @OriginalMember(owner = "client!wl", name = "M", descriptor = "S")
    private short field4420;

    @OriginalMember(owner = "client!wl", name = "I", descriptor = "B")
    private byte field4416;

    @OriginalMember(owner = "client!wl", name = "H", descriptor = "Z")
    private boolean field4415;

    @OriginalMember(owner = "client!wl", name = "U", descriptor = "Z")
    private boolean field4428;

    @OriginalMember(owner = "client!wl", name = "D", descriptor = "B")
    private byte field4411;

    @OriginalMember(owner = "client!wl", name = "T", descriptor = "B")
    private byte field4427;

    @OriginalMember(owner = "client!wl", name = "z", descriptor = "Z")
    private boolean field4407;

    @OriginalMember(owner = "client!wl", name = "W", descriptor = "Lqh;")
    private class352 field4430;

    @OriginalMember(owner = "client!wl", name = "P", descriptor = "Lph;")
    private class125 field4423;

    @OriginalMember(owner = "client!wl", name = "N", descriptor = "I")
    public static int field4421 = 10;

    @OriginalMember(owner = "client!wl", name = "G", descriptor = "Lpn;")
    public static class72 field4414 = new class72(59, -1);

    @OriginalMember(owner = "client!wl", name = "bb", descriptor = "I")
    public static int field4435 = -1;

    @OriginalMember(owner = "client!wl", name = "ab", descriptor = "[I")
    public static int[] field4434 = new int[25];

    @OriginalMember(owner = "client!wl", name = "db", descriptor = "Lsd;")
    public static class74 field4437 = new class74(102, 3);

    @OriginalMember(owner = "client!wl", name = "eb", descriptor = "Z")
    public static boolean field4438 = true;

    @OriginalMember(owner = "client!wl", name = "y", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!wl", name = "A", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!wl", name = "B", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!wl", name = "C", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!wl", name = "E", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!wl", name = "F", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!wl", name = "J", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!wl", name = "K", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!wl", name = "L", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!wl", name = "O", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!wl", name = "Q", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!wl", name = "R", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!wl", name = "S", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!wl", name = "V", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!wl", name = "X", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!wl", name = "Y", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!wl", name = "cb", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!wl", name = "Z", descriptor = "[I")
    public static int[] field4433;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
    public final void method24(int arg0) {
        ++field4406;
        if (arg0 <= 41) {
            field4433 = null;
        }
        if (this.field4430 != null) {
            this.field4430.method1722();
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(B)I")
    public final int method31(byte arg0) {
        ++field4432;
        int var2 = -89 % ((arg0 - -23) / 35);
        return this.field4427;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Z)I")
    public final int method16(boolean arg0) {
        ++field4408;
        return arg0 ? 20 : 65535 & this.field4420;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILoj;II)Z")
    public final boolean method28(int arg0, class280 arg1, int arg2, int arg3) {
        if (arg3 != -6085) {
            this.method16(false);
        }
        ++field4419;
        class352 var5 = this.method1873(65536, arg1, arg3 ^ -6022);
        if (var5 != null) {
            class327 var6 = arg1.method1456();
            var6.method553(super.field2355, super.field2352, super.field2360);
            return var5.method1695(arg0, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(B)V")
    public static void method1872(byte arg0) {
        field4434 = null;
        if (arg0 > -12) {
            field4436 = 23;
        }
        field4433 = null;
        field4437 = null;
        field4414 = null;
    }

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "(I)I")
    public final int method126(int arg0) {
        ++field4417;
        if (arg0 >= -99) {
            return 45;
        } else {
            return this.field4430 == null ? 0 : this.field4430.method1733();
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILoj;B)Lqh;")
    public final class352 method21(int arg0, class280 arg1, byte arg2) {
        if (arg2 != -98) {
            field4437 = null;
        }
        ++field4424;
        return this.method1873(arg0, arg1, arg2 ^ 110);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)I")
    public final int method26(byte arg0) {
        if (arg0 != 73) {
            field4436 = 115;
        }
        ++field4413;
        return this.field4416;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILoj;I)Lqh;")
    private final class352 method1873(int arg0, class280 arg1, int arg2) {
        ++field4412;
        if (this.field4430 != null && arg1.method1473(this.field4430.method1719(), arg0) == 0) {
            return this.field4430;
        } else {
            int var4 = 15 / ((23 - arg2) / 38);
            class324 var5 = this.method1874(false, arg1, false, arg0);
            return var5 == null ? null : var5.field4681;
        }
    }

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "(ILoj;)V")
    public final void method27(int arg0, class280 arg1) {
        if (arg0 != 0) {
            this.field4411 = -74;
        }
        ++field4429;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZLoj;ZI)Lpr;")
    private final class324 method1874(boolean arg0, class280 arg1, boolean arg2, int arg3) {
        ++field4410;
        class415 var5 = class173.field2084.method2297(50, 65535 & this.field4420);
        class443 var6;
        class443 var7;
        if (this.field4428) {
            var6 = class361.field5208[this.field4411];
            var7 = class443.field6329[0];
        } else {
            if (~this.field4411 <= -4) {
                var7 = null;
            } else {
                var7 = class443.field6329[this.field4411 - -1];
            }
            var6 = class443.field6329[this.field4411];
        }
        if (arg0) {
            field4436 = -126;
        }
        return var5.method2466(var6, var7, this.field4416, arg2, this.field4427, super.field2355, (byte) 99, super.field2352, super.field2360, arg1, arg3);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILoj;)V")
    public final void method20(int arg0, class280 arg1) {
        if (arg0 != 5744) {
            this.method22(-1);
        }
        ++field4409;
        Object var3 = null;
        class125 var5;
        if (this.field4423 == null && this.field4407) {
            class324 var4 = this.method1874(false, arg1, true, 131072);
            var5 = var4 == null ? null : var4.field4676;
        } else {
            var5 = this.field4423;
            this.field4423 = null;
        }
        if (var5 != null) {
            class47.method249(var5, this.field4411, super.field2355, super.field2360, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)Z")
    public final boolean method22(int arg0) {
        if (arg0 > -32) {
            this.method22(-60);
        }
        ++field4426;
        return this.field4407;
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(ILoj;)Lmg;")
    public final class451 method19(int arg0, class280 arg1) {
        ++field4425;
        if (this.field4430 == null) {
            return null;
        } else {
            if (arg0 <= 95) {
                this.field4415 = false;
            }
            class327 var3 = arg1.method1456();
            var3.method553(super.field2355 + super.field2354, super.field2352, super.field2360 - -super.field2359);
            class451 var4 = null;
            if (this.field4415) {
                var4 = class134.method638(762096108, 1);
            }
            this.field4430.method1716(var3, var4 == null ? null : var4.field6379[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "(I)V")
    public static final void method1875(int arg0) {
        ++field4431;
        class344.field4922.method813(0);
        for (class158 var1 = (class158) class485.field6882.method802((byte) 99); var1 != null; var1 = (class158) class485.field6882.method806((byte) 104)) {
            if (var1.field1889 < 1000) {
                var1.method702((byte) -114);
                class344.field4922.method803(var1, 50);
            }
        }
        class344.field4922.method809(-6283, class485.field6882);
        int var2 = -1;
        int var3 = -77 / ((arg0 - 36) / 58);
        if (class361.field5205 != null) {
            var2 = class361.field5205.method488((byte) 66);
        }
        if (class385.field5517) {
            if (~var2 == 0) {
                int var4 = class278.field3966.method837(-1);
                int var5 = class278.field3966.method838(124);
                if (var4 < class150.field1822 + -10 || var4 > class150.field1822 - -class345.field4933 + 10 || ~var5 > ~(class274.field3913 - 10) || ~(class77.field925 + 10 + class274.field3913) > ~var5) {
                    class385.field5517 = false;
                    class343.method2084(true, class150.field1822, class345.field4933, class274.field3913, class77.field925);
                }
            }
            if (var2 == 0) {
                int var6 = class150.field1822;
                int var7 = class274.field3913;
                int var8 = class345.field4933;
                int var9 = class361.field5205.method490(0);
                int var10 = class361.field5205.method487((byte) 96);
                int var11 = -1;
                for (int var12 = 0; ~class223.field3099 < ~var12; ++var12) {
                    if (!class371.field5311) {
                        int var16 = (class223.field3099 + -1 + -var12) * 16 + var7 + 31;
                        if (var6 < var9 && var6 + var8 > var9 && ~var10 < ~(var16 + -13) && var16 + 3 > var10) {
                            var11 = var12;
                        }
                    } else {
                        int var17 = (-1 - var12 + class223.field3099) * 16 + var7 + 33;
                        if (var6 < var9 && var9 < var6 + var8 && ~(var17 + -13) > ~var10 && ~(var17 + 4) < ~var10) {
                            var11 = var12;
                        }
                    }
                }
                if (var11 != -1) {
                    int var13 = 0;
                    class432 var14 = new class432(class485.field6882);
                    for (class158 var15 = (class158) var14.method2583(0); var15 != null; var15 = (class158) var14.method2582((byte) -127)) {
                        if (~var11 == ~var13) {
                            class115.method565(var9, 98, var15, var10);
                        }
                        ++var13;
                    }
                }
                class385.field5517 = false;
                class343.method2084(true, class150.field1822, class345.field4933, class274.field3913, class77.field925);
                return;
            }
        } else {
            if (var2 == 0 && (~class381.field5402 == -2 && ~class223.field3099 < -3 || class312.method1932(-1011))) {
                var2 = 2;
            }
            if (~var2 == -3 && ~class223.field3099 < -1 && class361.field5205 != null) {
                if (class484.field6868 == null && class318.field4628 == 0) {
                    class144.method680(class361.field5205.method490(0), -21571, class361.field5205.method487((byte) 96));
                } else {
                    class15.field198 = 2;
                }
            }
            if (~var2 == -1 && ~class223.field3099 < -1) {
                class422.method2516(false);
            }
            if (class484.field6868 != null || class318.field4628 != 0) {
                return;
            }
            class210.field2906 = null;
            class15.field198 = 0;
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(ILoj;)V")
    public final void method18(int arg0, class280 arg1) {
        int var3 = 92 % ((62 - arg0) / 63);
        ++field4422;
        Object var4 = null;
        class125 var6;
        if (this.field4423 == null && this.field4407) {
            class324 var5 = this.method1874(false, arg1, true, 131072);
            var6 = var5 == null ? null : var5.field4676;
        } else {
            var6 = this.field4423;
            this.field4423 = null;
        }
        if (var6 != null) {
            class200.method1098(var6, this.field4411, super.field2355, super.field2360, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Loj;Lcu;IIIIZIIIII)V")
    public class297(class280 arg0, class415 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class84.method428(arg10, arg11, -5));
        this.field4420 = (short) arg1.field5918;
        super.field2355 = (short) arg3;
        this.field4416 = (byte) arg10;
        this.field4415 = arg1.field5990 != 0 && !arg6;
        this.field4428 = arg6;
        this.field4411 = (byte) arg2;
        this.field4427 = (byte) arg11;
        super.field2360 = (short) arg5;
        this.field4407 = arg0.method1474() && arg1.field5960 && !this.field4428 && class427.field6166 != 0;
        class324 var13 = this.method1874(false, arg0, this.field4407, 1024);
        if (var13 != null) {
            this.field4430 = var13.field4681;
            this.field4423 = var13.field4676;
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ILgn;)V")
    public static final void method1876(int arg0, class187 arg1) {
        ++field4418;
        int var2 = -class204.field2796 + arg1.field2509;
        int var3 = arg1.field2462 * 128 - -(64 * arg1.method1012(false));
        int var4 = arg1.field2479 * 128 + 64 * arg1.method1012(false);
        arg1.field1008 += (-arg1.field1008 + var3) / var2;
        arg1.field2530 = 0;
        arg1.field1005 += (-arg1.field1005 + var4) / var2;
        if (arg0 == 7462) {
            if (arg1.field2460 == 0) {
                arg1.method1013(8192, (byte) 102);
            }
            if (arg1.field2460 == 1) {
                arg1.method1013(12288, (byte) 102);
            }
            if (arg1.field2460 == 2) {
                arg1.method1013(0, (byte) 102);
            }
            if (arg1.field2460 == 3) {
                arg1.method1013(4096, (byte) 102);
            }
        }
    }
}
