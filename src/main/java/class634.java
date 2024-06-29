import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class634 extends class56 {

    @OriginalMember(owner = "client!raa", name = "L", descriptor = "I")
    private int field8659 = 3072;

    @OriginalMember(owner = "client!raa", name = "H", descriptor = "I")
    private int field8656 = 1024;

    @OriginalMember(owner = "client!raa", name = "D", descriptor = "I")
    private int field8652 = 2048;

    @OriginalMember(owner = "client!raa", name = "F", descriptor = "Lkq;")
    public static class620 field8654 = null;

    @OriginalMember(owner = "client!raa", name = "N", descriptor = "[I")
    public static int[] field8661 = new int[64];

    @OriginalMember(owner = "client!raa", name = "E", descriptor = "I")
    public static int field8653;

    @OriginalMember(owner = "client!raa", name = "G", descriptor = "I")
    public static int field8655;

    @OriginalMember(owner = "client!raa", name = "I", descriptor = "I")
    public static int field8657;

    @OriginalMember(owner = "client!raa", name = "J", descriptor = "I")
    public static int field8658;

    @OriginalMember(owner = "client!raa", name = "M", descriptor = "I")
    public static int field8660;

    @OriginalMember(owner = "client!raa", name = "O", descriptor = "I")
    public static int field8662;

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(B)V", line = 4)
    public final void method493(byte arg0) {
        this.field8652 = -this.field8656 + this.field8659;
        ++field8655;
        int var2 = 78 / ((37 - arg0) / 62);
    }

    @OriginalMember(owner = "client!raa", name = "<init>", descriptor = "()V", line = 15)
    public class634() {
        super(1, false);
    }

    @OriginalMember(owner = "client!raa", name = "c", descriptor = "(I)V", line = 18)
    public static final void method3576(int arg0) {
        ++field8660;
        for (class154 var1 = (class154) class216.field2545.method2440(-33); var1 != null; var1 = (class154) class216.field2545.method2440(arg0 ^ -104)) {
            class588.method3373(67, var1);
        }
        int var2;
        int var3;
        if (arg0 != class118.field1503.field10632.method3881(0)) {
            var2 = class500.field7013;
            var3 = class500.field7013;
        } else {
            var2 = 3;
            var3 = 0;
        }
        client.method1881();
        for (int var4 = var3; var4 <= var2; ++var4) {
            client.method1890();
            client.method1883(var4);
            client.method1884(var4);
        }
        client.method1893();
        client.method1880();
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(BILes;)V", line = 60)
    public final void method144(byte arg0, int arg1, class403 arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field762 = ~arg2.method2396((byte) 79) == -2;
                }
            } else {
                this.field8659 = arg2.method2390((byte) 20);
            }
        } else {
            this.field8656 = arg2.method2390((byte) -4);
        }
        ++field8653;
        if (arg0 >= -44) {
            method3576(37);
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(BI)[[I", line = 104)
    public final int[][] method187(byte arg0, int arg1) {
        ++field8658;
        int[][] var3 = super.field759.method220(arg1, (byte) -91);
        if (super.field759.field341) {
            int[][] var4 = this.method495(99, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class642.field8759; ++var11) {
                var8[var11] = (var5[var11] * this.field8652 >> 12) + this.field8656;
                var9[var11] = this.field8656 - -(var6[var11] * this.field8652 >> 12);
                var10[var11] = this.field8656 - -(var7[var11] * this.field8652 >> 12);
            }
        }
        if (arg0 < 35) {
            field8661 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!raa", name = "b", descriptor = "(B)V", line = 151)
    public static void method3577(byte arg0) {
        field8654 = null;
        if (arg0 > -17) {
            field8661 = null;
        }
        field8661 = null;
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(IZLkg;)V", line = 166)
    public static final void method3578(int arg0, boolean arg1, class287 arg2) {
        ++field8662;
        if (arg0 >= -36) {
            field8654 = null;
        }
        class15 var3 = arg2.method1676(0);
        if (~arg2.field3458 == -1) {
            class413.field5396 = 0;
            class683.field9353 = -1;
            arg2.field3457 = 0;
        } else {
            if (~arg2.field3420 != 0 && arg2.field3359 == 0) {
                class582 var4 = class362.field4504.method3600(-49, arg2.field3420);
                if (~arg2.field3456 < -1 && var4.field7943 == 0) {
                    ++arg2.field3457;
                    class683.field9353 = -1;
                    class413.field5396 = 0;
                    return;
                }
                if (arg2.field3456 <= 0 && var4.field7950 == 0) {
                    class683.field9353 = -1;
                    ++arg2.field3457;
                    class413.field5396 = 0;
                    return;
                }
            }
            for (int var5 = 0; var5 < arg2.field3439.length; ++var5) {
                if (~arg2.field3439[var5].field9372 != 0 && class228.field2707 >= arg2.field3439[var5].field9369) {
                    class308 var20 = class740.field10303.method1473(-55, arg2.field3439[var5].field9372);
                    if (var20.field3804 && ~var20.field3824 != 0) {
                        class582 var21 = class362.field4504.method3600(-68, var20.field3824);
                        if (~arg2.field3456 < -1 && ~var21.field7943 == -1) {
                            class413.field5396 = 0;
                            ++arg2.field3457;
                            class683.field9353 = -1;
                            return;
                        }
                        if (~arg2.field3456 >= -1 && ~var21.field7950 == -1) {
                            class683.field9353 = -1;
                            ++arg2.field3457;
                            class413.field5396 = 0;
                            return;
                        }
                    }
                }
            }
            int var6 = arg2.field823;
            int var7 = arg2.field813;
            int var8 = arg2.field3453[arg2.field3458 + -1] * 512 - -(256 * arg2.method1665(1720746760));
            int var9 = arg2.field3455[arg2.field3458 + -1] * 512 + arg2.method1665(1720746760) * 256;
            if (~var8 >= ~var6) {
                if (~var6 >= ~var8) {
                    if (var9 <= var7) {
                        if (~var9 > ~var7) {
                            arg2.method1675((byte) -8, 0);
                        }
                    } else {
                        arg2.method1675((byte) -8, 8192);
                    }
                } else if (~var9 < ~var7) {
                    arg2.method1675((byte) -8, 6144);
                } else if (~var7 >= ~var9) {
                    arg2.method1675((byte) -8, 4096);
                } else {
                    arg2.method1675((byte) -8, 2048);
                }
            } else if (var9 <= var7) {
                if (var9 >= var7) {
                    arg2.method1675((byte) -8, 12288);
                } else {
                    arg2.method1675((byte) -8, 14336);
                }
            } else {
                arg2.method1675((byte) -8, 10240);
            }
            byte var10 = arg2.field3459[arg2.field3458 - 1];
            if (!arg1 && (-var6 + var8 > 1024 || -var6 + var8 < -1024 || var9 - var7 > 1024 || -var7 + var9 < -1024)) {
                arg2.field823 = var8;
                arg2.field813 = var9;
                arg2.method1677(arg2.field3380, false, 116);
                class683.field9353 = -1;
                if (~arg2.field3456 < -1) {
                    --arg2.field3456;
                }
                --arg2.field3458;
                class413.field5396 = 0;
            } else {
                int var11 = 16;
                boolean var12 = true;
                if (arg2 instanceof class388) {
                    var12 = ((class388) arg2).field5003.field6641;
                }
                if (!var12) {
                    if (!arg1 && arg2.field3458 > 1) {
                        var11 = 24;
                    }
                    if (!arg1 && ~arg2.field3458 < -3) {
                        var11 = 32;
                    }
                } else {
                    int var13 = -arg2.field3434.field1922 + arg2.field3380;
                    if (var13 != 0 && arg2.field3377 == -1 && arg2.field3413 != 0) {
                        var11 = 8;
                    }
                    if (!arg1 && arg2.field3458 > 2) {
                        var11 = 24;
                    }
                    if (!arg1 && arg2.field3458 > 3) {
                        var11 = 32;
                    }
                }
                if (~arg2.field3457 < -1 && ~arg2.field3458 < -2) {
                    var11 = 32;
                    --arg2.field3457;
                }
                if (var10 != 2) {
                    if (var10 == 0) {
                        var11 >>= 1;
                    }
                } else {
                    var11 <<= 1;
                }
                if (var3.field266 != -1) {
                    int var14 = var11 << 9;
                    if (~arg2.field3458 != -2) {
                        if (~arg2.field3450 > ~var14) {
                            arg2.field3450 += var3.field266;
                            if (~arg2.field3450 < ~var14) {
                                arg2.field3450 = var14;
                            }
                        } else if (arg2.field3450 > 0) {
                            arg2.field3450 -= var3.field266;
                            if (~arg2.field3450 > -1) {
                                arg2.field3450 = 0;
                            }
                        }
                    } else {
                        int var15 = arg2.field3450 * arg2.field3450;
                        int var16 = (arg2.field823 > var8 ? -var8 + arg2.field823 : -arg2.field823 + var8) << 9;
                        int var17 = (arg2.field813 <= var9 ? var9 - arg2.field813 : -var9 + arg2.field813) << 9;
                        int var18 = ~var17 > ~var16 ? var16 : var17;
                        int var19 = var3.field266 * var18 * 2;
                        if (~var15 >= ~var19) {
                            if (~var18 > ~(var15 / 2)) {
                                arg2.field3450 -= var3.field266;
                                if (~arg2.field3450 > -1) {
                                    arg2.field3450 = 0;
                                }
                            } else if (var14 > arg2.field3450) {
                                arg2.field3450 += var3.field266;
                                if (~var14 > ~arg2.field3450) {
                                    arg2.field3450 = var14;
                                }
                            }
                        } else {
                            arg2.field3450 /= 2;
                        }
                    }
                    var11 = arg2.field3450 >> 9;
                    if (var11 < 1) {
                        var11 = 1;
                    }
                }
                class413.field5396 = 0;
                if (~var6 == ~var8 && var7 == var9) {
                    class683.field9353 = -1;
                } else {
                    if (var8 > var6) {
                        arg2.field823 += var11;
                        class413.field5396 |= 4;
                        if (var8 < arg2.field823) {
                            arg2.field823 = var8;
                        }
                    } else if (~var8 > ~var6) {
                        arg2.field823 -= var11;
                        class413.field5396 |= 8;
                        if (var8 > arg2.field823) {
                            arg2.field823 = var8;
                        }
                    }
                    if (~var7 <= ~var9) {
                        if (var9 < var7) {
                            arg2.field813 -= var11;
                            class413.field5396 |= 2;
                            if (~arg2.field813 > ~var9) {
                                arg2.field813 = var9;
                            }
                        }
                    } else {
                        class413.field5396 |= 1;
                        arg2.field813 += var11;
                        if (arg2.field813 > var9) {
                            arg2.field813 = var9;
                        }
                    }
                    if (~var11 <= -33) {
                        class683.field9353 = 2;
                    } else {
                        class683.field9353 = var10;
                    }
                }
                if (~arg2.field823 == ~var8 && ~arg2.field813 == ~var9) {
                    if (~arg2.field3456 < -1) {
                        --arg2.field3456;
                    }
                    --arg2.field3458;
                }
            }
        }
    }

    @OriginalMember(owner = "client!raa", name = "a", descriptor = "(II)[I", line = 495)
    public final int[] method145(int arg0, int arg1) {
        ++field8657;
        int[] var3 = super.field752.method1308(false, arg1);
        if (super.field752.field2441) {
            int[] var4 = this.method492(0, arg1, (byte) 107);
            for (int var5 = 0; class642.field8759 > var5; ++var5) {
                var3[var5] = (var4[var5] * this.field8652 >> 12) + this.field8656;
            }
        }
        return arg0 != 0 ? null : var3;
    }
}
