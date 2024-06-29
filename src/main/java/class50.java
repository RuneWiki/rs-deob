import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class50 extends class305 {

    @OriginalMember(owner = "client!wba", name = "i", descriptor = "[Z")
    public static boolean[] field715 = new boolean[100];

    @OriginalMember(owner = "client!wba", name = "m", descriptor = "I")
    public static int field719 = 0;

    @OriginalMember(owner = "client!wba", name = "j", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!wba", name = "k", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!wba", name = "l", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!wba", name = "n", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!wba", name = "o", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!wba", name = "p", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!wba", name = "q", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "(II)I")
    public final int method306(int arg0, int arg1) {
        ++field720;
        if (arg0 != 31401) {
            field715 = null;
        }
        return 3;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(ZILns;)V")
    public static final void method365(boolean arg0, int arg1, class405 arg2) {
        ++field717;
        class264 var3 = arg2.method2577(arg1 ^ -23468);
        if (arg2.field6130 == 0) {
            class164.field2591 = -1;
            arg2.field6132 = 0;
            class13.field177 = 0;
        } else {
            if (arg2.field6094 != -1 && ~arg2.field6056 == -1) {
                class288 var4 = class742.field10404.method2663(0, arg2.field6094);
                if (arg2.field6134 > 0 && ~var4.field4083 == -1) {
                    class13.field177 = 0;
                    ++arg2.field6132;
                    class164.field2591 = -1;
                    return;
                }
                if (arg2.field6134 <= 0 && ~var4.field4111 == -1) {
                    ++arg2.field6132;
                    class13.field177 = 0;
                    class164.field2591 = -1;
                    return;
                }
            }
            if (arg2.field6061 != -1 && class357.field5189 >= arg2.field6102) {
                class321 var5 = class499.field7100.method172(arg2.field6061, 3128);
                if (var5.field4543 && var5.field4528 != -1) {
                    class288 var6 = class742.field10404.method2663(0, var5.field4528);
                    if (~arg2.field6134 < -1 && ~var6.field4083 == -1) {
                        ++arg2.field6132;
                        class13.field177 = 0;
                        class164.field2591 = -1;
                        return;
                    }
                    if (~arg2.field6134 >= -1 && ~var6.field4111 == -1) {
                        ++arg2.field6132;
                        class13.field177 = 0;
                        class164.field2591 = -1;
                        return;
                    }
                }
            }
            if (arg2.field6061 != -1 && class357.field5189 >= arg2.field6102) {
                class321 var7 = class499.field7100.method172(arg2.field6061, 3128);
                if (var7.field4543 && ~var7.field4528 != 0) {
                    class288 var8 = class742.field10404.method2663(0, var7.field4528);
                    if (arg2.field6134 > 0 && ~var8.field4083 == -1) {
                        ++arg2.field6132;
                        class13.field177 = 0;
                        class164.field2591 = -1;
                        return;
                    }
                    if (~arg2.field6134 >= -1 && ~var8.field4111 == -1) {
                        class164.field2591 = -1;
                        class13.field177 = 0;
                        ++arg2.field6132;
                        return;
                    }
                }
            }
            if (arg1 != 23467) {
                field715 = null;
            }
            int var9 = arg2.field8423;
            int var10 = arg2.field8428;
            int var11 = arg2.field6133[arg2.field6130 + -1] * 512 + arg2.method2579(false) * 256;
            int var12 = arg2.field6139[arg2.field6130 + -1] * 512 + arg2.method2579(false) * 256;
            if (var11 > var9) {
                if (var10 < var12) {
                    arg2.method2584(10240, (byte) -121);
                } else if (~var12 <= ~var10) {
                    arg2.method2584(12288, (byte) -115);
                } else {
                    arg2.method2584(14336, (byte) -114);
                }
            } else if (var9 <= var11) {
                if (~var12 < ~var10) {
                    arg2.method2584(8192, (byte) -102);
                } else if (var10 > var12) {
                    arg2.method2584(0, (byte) -98);
                }
            } else if (var12 > var10) {
                arg2.method2584(6144, (byte) -99);
            } else if (var10 <= var12) {
                arg2.method2584(4096, (byte) -126);
            } else {
                arg2.method2584(2048, (byte) -123);
            }
            byte var13 = arg2.field6131[arg2.field6130 + -1];
            if (arg0 || -var9 + var11 <= 1024 && ~(var11 - var9) <= 1023 && -var10 + var12 <= 1024 && -var10 + var12 >= -1024) {
                int var14 = 16;
                boolean var15 = true;
                if (arg2 instanceof class282) {
                    var15 = ((class282) arg2).field4008.field5022;
                }
                if (var15) {
                    int var16 = -arg2.field6110.field1382 + arg2.field6085;
                    if (var16 != 0 && arg2.field6125 == -1 && ~arg2.field6088 != -1) {
                        var14 = 8;
                    }
                    if (!arg0 && arg2.field6130 > 2) {
                        var14 = 24;
                    }
                    if (!arg0 && ~arg2.field6130 < -4) {
                        var14 = 32;
                    }
                } else {
                    if (!arg0 && arg2.field6130 > 1) {
                        var14 = 24;
                    }
                    if (!arg0 && arg2.field6130 > 2) {
                        var14 = 32;
                    }
                }
                if (arg2.field6132 > 0 && arg2.field6130 > 1) {
                    var14 = 32;
                    --arg2.field6132;
                }
                if (~var13 == -3) {
                    var14 <<= 1;
                } else if (~var13 == -1) {
                    var14 >>= 1;
                }
                class13.field177 = 0;
                if (~var3.field3758 != 0) {
                    int var17 = var14 << 9;
                    if (arg2.field6130 == 1) {
                        int var18 = arg2.field6135 * arg2.field6135;
                        int var19 = (var11 < arg2.field8423 ? -var11 + arg2.field8423 : -arg2.field8423 + var11) << 9;
                        int var20 = (arg2.field8428 <= var12 ? var12 - arg2.field8428 : arg2.field8428 - var12) << 9;
                        int var21 = ~var20 > ~var19 ? var19 : var20;
                        int var22 = var3.field3758 * 2 * var21;
                        if (~var18 >= ~var22) {
                            if (~var21 > ~(var18 / 2)) {
                                arg2.field6135 -= var3.field3758;
                                if (~arg2.field6135 > -1) {
                                    arg2.field6135 = 0;
                                }
                            } else if (arg2.field6135 < var17) {
                                arg2.field6135 += var3.field3758;
                                if (var17 < arg2.field6135) {
                                    arg2.field6135 = var17;
                                }
                            }
                        } else {
                            arg2.field6135 /= 2;
                        }
                    } else if (~var17 >= ~arg2.field6135) {
                        if (arg2.field6135 > 0) {
                            arg2.field6135 -= var3.field3758;
                            if (~arg2.field6135 > -1) {
                                arg2.field6135 = 0;
                            }
                        }
                    } else {
                        arg2.field6135 += var3.field3758;
                        if (var17 < arg2.field6135) {
                            arg2.field6135 = var17;
                        }
                    }
                    var14 = arg2.field6135 >> 9;
                    if (var14 < 1) {
                        var14 = 1;
                    }
                }
                if (~var9 == ~var11 && ~var10 == ~var12) {
                    class164.field2591 = -1;
                } else {
                    if (var9 < var11) {
                        class13.field177 |= 4;
                        arg2.field8423 += var14;
                        if (arg2.field8423 > var11) {
                            arg2.field8423 = var11;
                        }
                    } else if (~var9 < ~var11) {
                        arg2.field8423 -= var14;
                        class13.field177 |= 8;
                        if (~var11 < ~arg2.field8423) {
                            arg2.field8423 = var11;
                        }
                    }
                    if (var12 <= var10) {
                        if (~var12 > ~var10) {
                            arg2.field8428 -= var14;
                            class13.field177 |= 2;
                            if (~var12 < ~arg2.field8428) {
                                arg2.field8428 = var12;
                            }
                        }
                    } else {
                        class13.field177 |= 1;
                        arg2.field8428 += var14;
                        if (var12 < arg2.field8428) {
                            arg2.field8428 = var12;
                        }
                    }
                    if (var14 >= 32) {
                        class164.field2591 = 2;
                    } else {
                        class164.field2591 = var13;
                    }
                }
                if (~arg2.field8423 == ~var11 && arg2.field8428 == var12) {
                    if (~arg2.field6134 < -1) {
                        --arg2.field6134;
                    }
                    --arg2.field6130;
                }
            } else {
                arg2.field8428 = var12;
                arg2.field8423 = var11;
                arg2.method2585(false, arg2.field6085, (byte) 17);
                --arg2.field6130;
                class164.field2591 = -1;
                if (~arg2.field6134 < -1) {
                    --arg2.field6134;
                }
                class13.field177 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "(B)Z")
    public static final boolean method366(byte arg0) {
        if (arg0 >= -79) {
            return true;
        } else {
            ++field716;
            try {
                if (class152.field2350 == 2) {
                    if (class533.field7670 == null) {
                        class533.field7670 = class652.method3780(class354.field5152, class581.field8257, class347.field5018);
                        if (class533.field7670 == null) {
                            return false;
                        }
                    }
                    if (class470.field6861 == null) {
                        class470.field6861 = new class727(class187.field2853, class631.field8828);
                    }
                    class336 var1 = class520.field7449;
                    if (class2.field18 != null) {
                        var1 = class2.field18;
                    }
                    if (var1.method2142(class9.field143, class533.field7670, 0, 22050, class470.field6861)) {
                        class520.field7449 = var1;
                        class520.field7449.method2120(70);
                        if (~class183.field2803 >= -1) {
                            class152.field2350 = 0;
                            class520.field7449.method2127(class758.field10600, true);
                            for (int var2 = 0; ~class30.field306.length < ~var2; ++var2) {
                                class520.field7449.method2124(var2, class30.field306[var2], 20983);
                                class30.field306[var2] = 255;
                            }
                        } else {
                            class152.field2350 = 3;
                            class520.field7449.method2127(class758.field10600 >= class183.field2803 ? class183.field2803 : class758.field10600, true);
                            for (int var3 = 0; var3 < class30.field306.length; ++var3) {
                                class520.field7449.method2124(var3, class30.field306[var3], 20983);
                                class30.field306[var3] = 255;
                            }
                        }
                        if (class2.field18 == null) {
                            if (class622.field8727 > 0L) {
                                class520.field7449.method2132(true, class533.field7670, true, class622.field8727, class706.field9945);
                            } else {
                                class520.field7449.method2147(class533.field7670, class706.field9945, (byte) -14);
                            }
                        }
                        if (class515.field7305 != null) {
                            class515.field7305.method1975((byte) 37, class520.field7449);
                        }
                        class470.field6861 = null;
                        class622.field8727 = 0L;
                        class354.field5152 = null;
                        class2.field18 = null;
                        class533.field7670 = null;
                        return true;
                    }
                }
            } catch (Exception var5) {
                var5.printStackTrace();
                class520.field7449.method2150((byte) -41);
                class354.field5152 = null;
                class152.field2350 = 0;
                class2.field18 = null;
                class470.field6861 = null;
                class533.field7670 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(II)V")
    public final void method303(int arg0, int arg1) {
        if (arg0 != -27751) {
            field719 = 120;
        }
        ++field722;
        super.field4320 = arg1;
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(ILhb;)V")
    public class50(int arg0, class728 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(I)V")
    public static void method367(int arg0) {
        if (arg0 == -1) {
            field715 = null;
        }
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lhb;)V")
    public class50(class728 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(B)V")
    public final void method308(byte arg0) {
        super.field4320 = this.method305((byte) 68);
        ++field723;
        if (arg0 >= -40) {
            this.method305((byte) 57);
        }
    }

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "(I)I")
    public final int method368(int arg0) {
        if (arg0 != 17503) {
            this.method305((byte) 83);
        }
        ++field721;
        return super.field4320;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)I")
    public final int method305(byte arg0) {
        ++field718;
        if (arg0 != 68) {
            field715 = null;
        }
        return super.field4323.method4107(true) == class555.field7936 && super.field4323.method4110(-22215) ? 0 : 1;
    }
}
