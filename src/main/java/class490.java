import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class490 extends class682 implements class484 {

    @OriginalMember(owner = "client!wi", name = "cb", descriptor = "Z")
    private boolean field6948;

    @OriginalMember(owner = "client!wi", name = "X", descriptor = "Z")
    private boolean field6943;

    @OriginalMember(owner = "client!wi", name = "kb", descriptor = "S")
    private short field6956;

    @OriginalMember(owner = "client!wi", name = "Z", descriptor = "B")
    private byte field6945;

    @OriginalMember(owner = "client!wi", name = "ob", descriptor = "B")
    private byte field6960;

    @OriginalMember(owner = "client!wi", name = "lb", descriptor = "Z")
    private boolean field6957;

    @OriginalMember(owner = "client!wi", name = "R", descriptor = "Lr;")
    private class194 field6937;

    @OriginalMember(owner = "client!wi", name = "Q", descriptor = "Lka;")
    private class496 field6936;

    @OriginalMember(owner = "client!wi", name = "bb", descriptor = "J")
    public static long field6947 = -1L;

    @OriginalMember(owner = "client!wi", name = "L", descriptor = "I")
    public static int field6931;

    @OriginalMember(owner = "client!wi", name = "M", descriptor = "I")
    public static int field6932;

    @OriginalMember(owner = "client!wi", name = "N", descriptor = "I")
    public static int field6933;

    @OriginalMember(owner = "client!wi", name = "O", descriptor = "I")
    public static int field6934;

    @OriginalMember(owner = "client!wi", name = "P", descriptor = "I")
    public static int field6935;

    @OriginalMember(owner = "client!wi", name = "S", descriptor = "I")
    public static int field6938;

    @OriginalMember(owner = "client!wi", name = "T", descriptor = "I")
    public static int field6939;

    @OriginalMember(owner = "client!wi", name = "U", descriptor = "I")
    public static int field6940;

    @OriginalMember(owner = "client!wi", name = "W", descriptor = "I")
    public static int field6942;

    @OriginalMember(owner = "client!wi", name = "Y", descriptor = "I")
    public static int field6944;

    @OriginalMember(owner = "client!wi", name = "ab", descriptor = "I")
    public static int field6946;

    @OriginalMember(owner = "client!wi", name = "db", descriptor = "I")
    public static int field6949;

    @OriginalMember(owner = "client!wi", name = "eb", descriptor = "I")
    public static int field6950;

    @OriginalMember(owner = "client!wi", name = "fb", descriptor = "I")
    public static int field6951;

    @OriginalMember(owner = "client!wi", name = "gb", descriptor = "I")
    public static int field6952;

    @OriginalMember(owner = "client!wi", name = "hb", descriptor = "I")
    public static int field6953;

    @OriginalMember(owner = "client!wi", name = "ib", descriptor = "I")
    public static int field6954;

    @OriginalMember(owner = "client!wi", name = "mb", descriptor = "I")
    public static int field6958;

    @OriginalMember(owner = "client!wi", name = "nb", descriptor = "I")
    public static int field6959;

    @OriginalMember(owner = "client!wi", name = "pb", descriptor = "I")
    public static int field6961;

    @OriginalMember(owner = "client!wi", name = "V", descriptor = "Lrn;")
    private class281 field6941;

    @OriginalMember(owner = "client!wi", name = "jb", descriptor = "[I")
    public static int[] field6955;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "(B)V")
    public static void method2920(byte arg0) {
        field6955 = null;
        if (arg0 != -106) {
            method2920((byte) -99);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILha;)V")
    public final void method1487(int arg0, class65 arg1) {
        ++field6958;
        Object var3 = null;
        class194 var5;
        if (this.field6937 == null && this.field6957) {
            class547 var4 = this.method2924(262144, (byte) -29, arg1, true);
            var5 = var4 == null ? null : var4.field7863;
        } else {
            var5 = this.field6937;
            this.field6937 = null;
        }
        if (var5 != null) {
            class46.method336(var5, super.field5749, super.field5742, super.field5746, (boolean[]) null);
        }
        int var6 = 9 / ((arg0 - 4) / 39);
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V")
    public final void method1484(int arg0) {
        ++field6939;
        if (arg0 > -107) {
            this.method1482(true);
        }
        if (this.field6936 != null) {
            this.field6936.method107();
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)Z")
    public final boolean method1488(byte arg0) {
        int var2 = -124 / ((arg0 - -7) / 60);
        ++field6933;
        return this.field6957;
    }

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "(I)Z")
    public final boolean method906(int arg0) {
        ++field6940;
        int var2 = -40 / ((11 - arg0) / 35);
        return this.field6936 != null ? this.field6936.method121() : false;
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lha;Lkv;IIIIIZIIII)V")
    public class490(class65 arg0, class282 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        super.field5742 = arg4;
        this.field6948 = arg7;
        this.field6943 = ~arg1.field4149 != -1 && !arg7;
        this.field6956 = (short) arg1.field4100;
        this.field6945 = (byte) arg11;
        this.field6960 = (byte) arg10;
        super.field5746 = arg6;
        this.field6957 = arg0.method483() && arg1.field4115 && !this.field6948 && class21.field353.field10062.method4001(-19) != 0;
        class547 var13 = this.method2924(2048, (byte) -29, arg0, this.field6957);
        if (var13 != null) {
            this.field6937 = var13.field7863;
            this.field6936 = var13.field7866;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIILha;)Z")
    public final boolean method902(int arg0, int arg1, int arg2, class65 arg3) {
        ++field6946;
        class496 var5 = this.method2921(arg3, 131072, (byte) 39);
        if (arg1 != -17458) {
            this.field6960 = 106;
        }
        if (var5 != null) {
            class326 var6 = arg3.method514();
            var6.method1869(super.field5742, super.field5741, super.field5746);
            return !class576.field8120 ? var5.method95(arg0, arg2, var6, false, 0) : var5.method77(arg0, arg2, var6, false, 0, class740.field10205);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(Z)I")
    public final int method916(boolean arg0) {
        ++field6938;
        if (!arg0) {
            this.field6956 = 81;
        }
        return this.field6936 != null ? this.field6936.method118() : 0;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lha;I)Lmaa;")
    public final class495 method918(class65 arg0, int arg1) {
        ++field6932;
        if (this.field6936 == null) {
            return null;
        } else {
            class326 var3 = arg0.method514();
            var3.method1869(super.field5742 - -super.field9454, super.field5741, super.field9459 + super.field5746);
            class495 var4 = class86.method652(this.field6943, 0, 1);
            if (arg1 != -30514) {
                this.field6937 = null;
            }
            if (class576.field8120) {
                this.field6936.method106(var3, var4.field7067[0], class740.field10205, 0);
            } else {
                this.field6936.method88(var3, var4.field7067[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lha;IB)Lka;")
    private final class496 method2921(class65 arg0, int arg1, byte arg2) {
        ++field6944;
        if (this.field6936 != null && arg0.method512(this.field6936.method68(), arg1) == 0) {
            return this.field6936;
        } else {
            if (arg2 <= 32) {
                this.field6936 = null;
            }
            class547 var4 = this.method2924(arg1, (byte) -29, arg0, false);
            return var4 != null ? var4.field7866 : null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BILka;II)Lrn;")
    public static final class281 method2922(byte arg0, int arg1, class496 arg2, int arg3, int arg4) {
        ++field6950;
        if (arg2 == null) {
            return null;
        } else {
            if (arg0 <= 112) {
                field6955 = null;
            }
            return new class281(arg1, arg4, arg3, arg2.method100(), arg2.method116(), arg2.method69(), arg2.method118(), arg2.method102(), arg2.method113(), arg2.method120());
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BII)V")
    public static final void method2923(byte arg0, int arg1, int arg2) {
        ++field6934;
        if (arg0 == 24) {
            ++class437.field5893;
            class312 var3 = class353.method2245(class87.field971, class407.field5547, (byte) 23);
            var3.field4445.method2957(arg2, 1267307848);
            var3.field4445.method2945(-21971, arg1);
            class208.method1440(var3, 103);
        }
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(ILha;)V")
    public final void method912(int arg0, class65 arg1) {
        ++field6949;
        if (arg0 <= 52) {
            this.method2924(124, (byte) -43, (class65) null, false);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IBLha;Z)Lbaa;")
    private final class547 method2924(int arg0, byte arg1, class65 arg2, boolean arg3) {
        ++field6961;
        class282 var5 = class277.field4038.method3919(true, this.field6956 & 65535);
        if (arg1 != -29) {
            return null;
        } else {
            class294 var6;
            class294 var7;
            if (!this.field6948) {
                if (super.field5749 < 3) {
                    var6 = class411.field5572[super.field5749 + 1];
                } else {
                    var6 = null;
                }
                var7 = class411.field5572[super.field5749];
            } else {
                var7 = class774.field10642[super.field5749];
                var6 = class411.field5572[0];
            }
            return var5.method1827((byte) 104, this.field6960, arg0, (class520) null, arg2, var6, var7, arg3, super.field5742, super.field5741, super.field5746, this.field6945);
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(Lha;I)Lrn;")
    public final class281 method901(class65 arg0, int arg1) {
        if (this.field6941 == null) {
            this.field6941 = method2922((byte) 119, super.field5742, this.method2921(arg0, 0, (byte) 37), super.field5746, super.field5741);
        }
        ++field6952;
        if (arg1 <= 50) {
            this.method1479((byte) 2, (class65) null);
        }
        return this.field6941;
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(Z)Z")
    public final boolean method909(boolean arg0) {
        ++field6954;
        if (arg0) {
            this.method2921((class65) null, -78, (byte) 5);
        }
        if (this.field6936 == null) {
            return true;
        } else {
            return !this.field6936.method72();
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IZI)V")
    public static final void method2925(int arg0, boolean arg1, int arg2) {
        ++field6935;
        if (arg1) {
            class313 var3 = class312.method1998((long) arg2, 16, -1);
            var3.method2001((byte) -68);
            var3.field4464 = arg0;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lit;Z)Z")
    public static final boolean method2926(class672 arg0, boolean arg1) {
        boolean var2 = class774.field10642 == class208.field3219;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method913(-13764);
        if (arg0.field9368 >= 0 && arg0.field9364 >= 0 && arg0.field9371 < class81.field902 && arg0.field9360 < class48.field615) {
            short var6 = 0;
            for (int var7 = arg0.field9368; var7 <= arg0.field9371; ++var7) {
                for (int var11 = arg0.field9364; var11 <= arg0.field9360; ++var11) {
                    class46 var12 = class704.method3985(arg0.field5755, var7, var11);
                    if (var12 != null) {
                        class48 var13 = class721.method4033(-127, arg0);
                        class48 var14 = var12.field586;
                        if (var14 == null) {
                            var12.field586 = var13;
                        } else {
                            while (var14.field611 != null) {
                                var14 = var14.field611;
                            }
                            var14.field611 = var13;
                        }
                        if (var2 && (class392.field5398[var7][var11] & -16777216) != 0) {
                            var3 = class392.field5398[var7][var11];
                            var4 = class721.field9985[var7][var11];
                            var5 = class190.field2943[var7][var11];
                        }
                        if (!arg1 && var12.field587 != null && var12.field587.field5479 > var6) {
                            var6 = var12.field587.field5479;
                        }
                    }
                }
            }
            if (var2 && (var3 & -16777216) != 0) {
                for (int var8 = arg0.field9368; var8 <= arg0.field9371; ++var8) {
                    for (int var9 = arg0.field9364; var9 <= arg0.field9360; ++var9) {
                        if ((class392.field5398[var8][var9] & -16777216) == 0) {
                            class392.field5398[var8][var9] = var3;
                            class721.field9985[var8][var9] = var4;
                            class190.field2943[var8][var9] = var5;
                        }
                    }
                }
            }
            if (arg1) {
                class184.field2830[class309.field4423++] = arg0;
            } else {
                int var10 = class774.field10642 == class208.field3219 ? 1 : 0;
                if (arg0.method909(false)) {
                    if (arg0.method906(-87)) {
                        arg0.field5747 = class338.field4733[var10];
                        class338.field4733[var10] = arg0;
                    } else {
                        arg0.field5747 = class745.field10328[var10];
                        class745.field10328[var10] = arg0;
                        class98.field1115 = true;
                    }
                } else {
                    arg0.field5747 = class695.field9711[var10];
                    class695.field9711[var10] = arg0;
                }
            }
            if (arg1) {
                arg0.field5741 -= var6;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)I")
    public final int method1483(int arg0) {
        if (arg0 != 24853) {
            this.method901((class65) null, 56);
        }
        ++field6931;
        return this.field6956 & 65535;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)I")
    public final int method1482(boolean arg0) {
        if (!arg0) {
            return 117;
        } else {
            ++field6951;
            return this.field6960;
        }
    }

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "(I)I")
    public final int method917(int arg0) {
        if (arg0 != -1760267218) {
            this.method1487(69, (class65) null);
        }
        ++field6953;
        return this.field6936 == null ? 0 : this.field6936.method75();
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)I")
    public final int method1478(byte arg0) {
        if (arg0 <= 108) {
            this.method1482(false);
        }
        ++field6942;
        return this.field6945;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(BLha;)V")
    public final void method1479(byte arg0, class65 arg1) {
        ++field6959;
        Object var3 = null;
        int var4 = -75 / ((-19 - arg0) / 48);
        class194 var6;
        if (this.field6937 == null && this.field6957) {
            class547 var5 = this.method2924(262144, (byte) -29, arg1, true);
            var6 = var5 != null ? var5.field7863 : null;
        } else {
            var6 = this.field6937;
            this.field6937 = null;
        }
        if (var6 != null) {
            class759.method4223(var6, super.field5749, super.field5742, super.field5746, (boolean[]) null);
        }
    }
}
