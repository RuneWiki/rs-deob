import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class602 extends class425 implements class115 {

    @OriginalMember(owner = "client!waa", name = "T", descriptor = "Z")
    private boolean field8687;

    @OriginalMember(owner = "client!waa", name = "ab", descriptor = "B")
    private byte field8693;

    @OriginalMember(owner = "client!waa", name = "G", descriptor = "B")
    private byte field8675;

    @OriginalMember(owner = "client!waa", name = "z", descriptor = "Z")
    private boolean field8668;

    @OriginalMember(owner = "client!waa", name = "gb", descriptor = "Z")
    private boolean field8699;

    @OriginalMember(owner = "client!waa", name = "K", descriptor = "B")
    private byte field8679;

    @OriginalMember(owner = "client!waa", name = "D", descriptor = "S")
    private short field8672;

    @OriginalMember(owner = "client!waa", name = "L", descriptor = "Z")
    private boolean field8680;

    @OriginalMember(owner = "client!waa", name = "I", descriptor = "Lr;")
    public class157 field8677;

    @OriginalMember(owner = "client!waa", name = "A", descriptor = "Lk;")
    private class485 field8669;

    @OriginalMember(owner = "client!waa", name = "y", descriptor = "I")
    public static int field8667;

    @OriginalMember(owner = "client!waa", name = "B", descriptor = "I")
    public static int field8670;

    @OriginalMember(owner = "client!waa", name = "C", descriptor = "I")
    public static int field8671;

    @OriginalMember(owner = "client!waa", name = "E", descriptor = "I")
    public static int field8673;

    @OriginalMember(owner = "client!waa", name = "F", descriptor = "I")
    public static int field8674;

    @OriginalMember(owner = "client!waa", name = "H", descriptor = "I")
    public static int field8676;

    @OriginalMember(owner = "client!waa", name = "J", descriptor = "I")
    public static int field8678;

    @OriginalMember(owner = "client!waa", name = "M", descriptor = "I")
    public static int field8681;

    @OriginalMember(owner = "client!waa", name = "O", descriptor = "I")
    public static int field8682;

    @OriginalMember(owner = "client!waa", name = "P", descriptor = "I")
    public static int field8683;

    @OriginalMember(owner = "client!waa", name = "Q", descriptor = "I")
    public static int field8684;

    @OriginalMember(owner = "client!waa", name = "R", descriptor = "I")
    public static int field8685;

    @OriginalMember(owner = "client!waa", name = "S", descriptor = "I")
    public static int field8686;

    @OriginalMember(owner = "client!waa", name = "U", descriptor = "I")
    public static int field8688;

    @OriginalMember(owner = "client!waa", name = "W", descriptor = "I")
    public static int field8689;

    @OriginalMember(owner = "client!waa", name = "X", descriptor = "I")
    public static int field8690;

    @OriginalMember(owner = "client!waa", name = "Y", descriptor = "I")
    public static int field8691;

    @OriginalMember(owner = "client!waa", name = "Z", descriptor = "I")
    public static int field8692;

    @OriginalMember(owner = "client!waa", name = "cb", descriptor = "I")
    public static int field8695;

    @OriginalMember(owner = "client!waa", name = "db", descriptor = "I")
    public static int field8696;

    @OriginalMember(owner = "client!waa", name = "fb", descriptor = "I")
    public static int field8698;

    @OriginalMember(owner = "client!waa", name = "hb", descriptor = "I")
    public static int field8700;

    @OriginalMember(owner = "client!waa", name = "ib", descriptor = "I")
    public static int field8701;

    @OriginalMember(owner = "client!waa", name = "eb", descriptor = "Ljc;")
    public static class372 field8697;

    @OriginalMember(owner = "client!waa", name = "bb", descriptor = "Lnk;")
    private class611 field8694;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(ILqa;I)Lr;")
    private final class157 method3548(int arg0, class207 arg1, int arg2) {
        if (arg0 > -93) {
            return null;
        } else {
            ++field8690;
            if (this.field8677 != null && arg1.method1357(this.field8677.method166(), arg2) == 0) {
                return this.field8677;
            } else {
                class105 var4 = this.method3554(false, arg2, arg1, (byte) -59);
                return var4 == null ? null : var4.field1580;
            }
        }
    }

    @OriginalMember(owner = "client!waa", name = "f", descriptor = "(I)V")
    public final void method262(int arg0) {
        ++field8667;
        this.field8699 = false;
        if (arg0 != 1) {
            this.field8675 = -26;
        }
        if (this.field8677 != null) {
            this.field8677.method138(this.field8677.method166() & -65537);
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(ILqa;)V")
    public final void method751(int arg0, class207 arg1) {
        ++field8673;
        Object var3 = null;
        if (arg0 >= 0) {
            this.field8679 = 26;
        }
        class485 var5;
        if (this.field8669 == null && this.field8680) {
            class105 var4 = this.method3554(true, 262144, arg1, (byte) -118);
            var5 = var4 != null ? var4.field1585 : null;
        } else {
            var5 = this.field8669;
            this.field8669 = null;
        }
        if (var5 != null) {
            class294.method1888(var5, this.field8693, super.field6037, super.field6029, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!waa", name = "h", descriptor = "(I)I")
    public final int method492(int arg0) {
        ++field8684;
        if (arg0 != 0) {
            return 68;
        } else {
            return this.field8677 == null ? 0 : this.field8677.method133();
        }
    }

    @OriginalMember(owner = "client!waa", name = "k", descriptor = "(I)I")
    public final int method3549(int arg0) {
        int var2 = -99 % ((-34 - arg0) / 39);
        ++field8689;
        return this.field8677 == null ? 15 : this.field8677.method150() / 4;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(IZIILjt;ILqa;)V")
    public final void method258(int arg0, boolean arg1, int arg2, int arg3, class87 arg4, int arg5, class207 arg6) {
        ++field8674;
        if (arg2 <= 79) {
            this.method490(false, (class207) null);
        }
        if (!(arg4 instanceof class397)) {
            if (arg4 instanceof class602) {
                class602 var8 = (class602) arg4;
                if (this.field8677 != null && var8.field8677 != null) {
                    this.field8677.method147(var8.field8677, arg5, arg3, arg0, arg1);
                    return;
                }
            }
        } else {
            class397 var9 = (class397) arg4;
            if (this.field8677 == null || var9.field5631 == null) {
                return;
            }
            this.field8677.method147(var9.field5631, arg5, arg3, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
    public static final void method3550(String arg0, boolean arg1, byte arg2) {
        ++field8683;
        if (arg0 != null) {
            if (~class536.field7488 <= -101) {
                class176.method1116(class317.field4308.method739(class173.field2491, 95), true);
            } else if (arg2 > 22) {
                String var3 = class366.method2198(arg0, -126);
                if (var3 != null) {
                    for (int var4 = 0; var4 < class536.field7488; ++var4) {
                        String var8 = class366.method2198(class645.field9370[var4], -127);
                        if (var8 != null && var8.equals(var3)) {
                            class176.method1116(arg0 + class200.field2815.method739(class173.field2491, -127), true);
                            return;
                        }
                        if (class634.field9272[var4] != null) {
                            String var9 = class366.method2198(class634.field9272[var4], -126);
                            if (var9 != null && var9.equals(var3)) {
                                class176.method1116(arg0 + class200.field2815.method739(class173.field2491, 103), true);
                                return;
                            }
                        }
                    }
                    for (int var5 = 0; ~class367.field4989 < ~var5; ++var5) {
                        String var6 = class366.method2198(class474.field6677[var5], -127);
                        if (var6 != null && var6.equals(var3)) {
                            class176.method1116(class217.field3086.method739(class173.field2491, 106) + arg0 + class152.field2299.method739(class173.field2491, -87), true);
                            return;
                        }
                        if (class326.field4381[var5] != null) {
                            String var7 = class366.method2198(class326.field4381[var5], -127);
                            if (var7 != null && var7.equals(var3)) {
                                class176.method1116(class217.field3086.method739(class173.field2491, 58) + arg0 + class152.field2299.method739(class173.field2491, 93), true);
                                return;
                            }
                        }
                    }
                    if (class366.method2198(class645.field9372.field2630, -126).equals(var3)) {
                        class176.method1116(class20.field241.method739(class173.field2491, 126), true);
                    } else {
                        ++class177.field2540;
                        class351.method2108(class310.field4178, -10511);
                        class479.field6754.method108((byte) -128, class452.method2655(-108, arg0) - -1);
                        class479.field6754.method74(arg0, 0);
                        class479.field6754.method108((byte) -128, !arg1 ? 0 : 1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(BLqa;I)Lr;")
    public final class157 method744(byte arg0, class207 arg1, int arg2) {
        ++field8682;
        int var4 = 38 / ((arg0 - -54) / 60);
        return this.method3548(-100, arg1, arg2);
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Z)I")
    public final int method748(boolean arg0) {
        if (arg0) {
            method3552((byte) 59);
        }
        ++field8698;
        return 65535 & this.field8672;
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(ZLqa;)Lvw;")
    public final class254 method483(boolean arg0, class207 arg1) {
        ++field8695;
        if (this.field8677 == null) {
            return null;
        } else {
            class163 var3 = arg1.method1344();
            var3.method1054(super.field6037, super.field6042, super.field6029);
            class254 var4 = null;
            if (this.field8687) {
                var4 = class110.method772(1, 1);
            }
            this.field8677.method154(var3, var4 != null ? var4.field3525[0] : null, 0);
            if (!arg0) {
                this.field8675 = -80;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lqa;Lss;IIIIIZIIIIIIZ)V")
    public class602(class207 arg0, class364 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field4900 == -2, class28.method304(-92, arg13, arg12));
        this.field8687 = arg1.field4881 != 0 && !arg7;
        this.field8693 = (byte) arg3;
        this.field8675 = (byte) arg13;
        this.field8668 = arg7;
        this.field8699 = arg14;
        this.field8679 = (byte) arg12;
        this.field8672 = (short) arg1.field4944;
        this.field8680 = arg0.method1345() && arg1.field4913 && !this.field8668 && ~class491.field6875.method1507(class103.field1570, (byte) 64) != -1;
        int var16 = 2048;
        if (this.field8699) {
            var16 |= 65536;
        }
        class105 var17 = this.method3554(this.field8680, var16, arg0, (byte) 121);
        if (var17 != null) {
            this.field8677 = var17.field1580;
            this.field8669 = var17.field1585;
            if (this.field8699) {
                this.field8677 = this.field8677.method163((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(BLqa;)V")
    public final void method746(byte arg0, class207 arg1) {
        ++field8686;
        if (arg0 > -50) {
            this.method258(-122, true, 57, 16, (class87) null, -34, (class207) null);
        }
        Object var3 = null;
        class485 var5;
        if (this.field8669 == null && this.field8680) {
            class105 var4 = this.method3554(true, 262144, arg1, (byte) -51);
            var5 = var4 == null ? null : var4.field1585;
        } else {
            var5 = this.field8669;
            this.field8669 = null;
        }
        if (var5 != null) {
            class104.method734(var5, this.field8693, super.field6037, super.field6029, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "(I)Z")
    public final boolean method747(int arg0) {
        ++field8681;
        if (arg0 != -23611) {
            field8697 = null;
        }
        return this.field8680;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)V")
    public final void method750(int arg0) {
        if (this.field8677 != null) {
            this.field8677.method156();
        }
        ++field8692;
        if (arg0 <= 88) {
            this.method258(-35, true, -51, 47, (class87) null, -50, (class207) null);
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(ZLqa;)Lnk;")
    public final class611 method490(boolean arg0, class207 arg1) {
        if (this.field8694 == null) {
            this.field8694 = class563.method3213(super.field6042, this.method3548(-116, arg1, 0), super.field6037, super.field6029, true);
        }
        ++field8685;
        if (arg0) {
            this.field8672 = 56;
        }
        return this.field8694;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lqa;III)Z")
    public final boolean method488(class207 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 1) {
            this.method258(23, true, -64, -68, (class87) null, 25, (class207) null);
        }
        ++field8670;
        class157 var5 = this.method3548(-110, arg0, 131072);
        if (var5 != null) {
            class163 var6 = arg0.method1344();
            var6.method1054(super.field6037, super.field6042, super.field6029);
            return var5.method143(arg1, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!waa", name = "d", descriptor = "(I)Z")
    public final boolean method264(int arg0) {
        if (arg0 != 1) {
            this.method744((byte) -40, (class207) null, 114);
        }
        ++field8691;
        return this.field8699;
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(B)V")
    public static void method3551(byte arg0) {
        field8697 = null;
        if (arg0 > -12) {
            field8697 = null;
        }
    }

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "(B)V")
    public static final void method3552(byte arg0) {
        ++field8688;
        class403.method2407(class137.field2159, -9130);
        ++class337.field4554;
        if (class480.field6766 && class604.field8712) {
            int var1 = field8697.method2153((byte) 77);
            int var2 = field8697.method2152(0);
            int var3 = var1 - class376.field5059;
            int var4 = var2 - class94.field1453;
            if (var3 < class131.field2099) {
                var3 = class131.field2099;
            }
            if (~(class137.field2159.field1853 + var3) < ~(class131.field2099 + class638.field9294.field1853)) {
                var3 = -class137.field2159.field1853 + class638.field9294.field1853 + class131.field2099;
            }
            if (var4 < class185.field2600) {
                var4 = class185.field2600;
            }
            if (class185.field2600 - -class638.field9294.field1769 < class137.field2159.field1769 + var4) {
                var4 = -class137.field2159.field1769 + class638.field9294.field1769 + class185.field2600;
            }
            if (arg0 != 78) {
                field8697 = null;
            }
            int var5 = -class131.field2099 + var3 + class638.field9294.field1800;
            int var6 = -class185.field2600 + var4 + class638.field9294.field1904;
            if (!field8697.method2217((byte) -127)) {
                if (class457.field6442) {
                    class339.method2057((byte) -116);
                    if (class137.field2159.field1808 != null) {
                        class224 var7 = new class224();
                        var7.field3204 = class63.field1092;
                        var7.field3202 = var5;
                        var7.field3207 = class137.field2159.field1808;
                        var7.field3211 = var6;
                        var7.field3210 = class137.field2159;
                        class123.method862(var7);
                    }
                    if (class63.field1092 != null && client.method1540(class137.field2159) != null) {
                        class104.method740(1, class63.field1092, class137.field2159);
                    }
                } else if ((~class384.field5143 == -2 || class553.method3138((byte) -62)) && ~class210.field2958 < -3) {
                    class31.method322(class376.field5059 + class244.field3403, class94.field1453 + class14.field193, false);
                } else if (class164.method1056(arg0 + 33959)) {
                    class31.method322(class376.field5059 + class244.field3403, class94.field1453 + class14.field193, false);
                }
                class137.field2159 = null;
            } else {
                if (class137.field2159.field1847 < class337.field4554) {
                    int var8 = -class244.field3403 + var3;
                    int var9 = var4 - class14.field193;
                    if (var8 > class137.field2159.field1879 || ~(-class137.field2159.field1879) < ~var8 || var9 > class137.field2159.field1879 || var9 < -class137.field2159.field1879) {
                        class457.field6442 = true;
                    }
                }
                if (class137.field2159.field1770 != null && class457.field6442) {
                    class224 var10 = new class224();
                    var10.field3211 = var6;
                    var10.field3202 = var5;
                    var10.field3207 = class137.field2159.field1770;
                    var10.field3210 = class137.field2159;
                    class123.method862(var10);
                }
            }
        } else {
            if (~class337.field4554 < -2) {
                class137.field2159 = null;
            }
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lqa;B)V")
    public final void method487(class207 arg0, byte arg1) {
        ++field8678;
        if (arg1 != 21) {
            this.field8668 = false;
        }
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(I)I")
    public final int method749(int arg0) {
        if (arg0 != 24194) {
            return -97;
        } else {
            ++field8676;
            return this.field8675;
        }
    }

    @OriginalMember(owner = "client!waa", name = "l", descriptor = "(I)V")
    public static final void method3553(int arg0) {
        if (arg0 == 262144) {
            class422.method2520(-21760);
            ++field8696;
            class494.field6919 = null;
            class634.field9271 = null;
            class1.field10 = null;
            class300.field4116 = null;
            class597.field8632 = null;
        }
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(Z)I")
    public final int method752(boolean arg0) {
        if (!arg0) {
            this.method490(true, (class207) null);
        }
        ++field8700;
        return this.field8679;
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(ZILqa;B)Lgm;")
    private final class105 method3554(boolean arg0, int arg1, class207 arg2, byte arg3) {
        ++field8701;
        class364 var5 = class18.field227.method1201((byte) -122, 65535 & this.field8672);
        class174 var6;
        class174 var7;
        if (!this.field8668) {
            if (this.field8693 >= 3) {
                var6 = null;
            } else {
                var6 = class608.field8767[this.field8693 - -1];
            }
            var7 = class608.field8767[this.field8693];
        } else {
            var6 = class608.field8767[0];
            var7 = client.field3472[this.field8693];
        }
        int var8 = -55 / ((18 - arg3) / 60);
        return var5.method2176(this.field8679 == 11 ? 10 : this.field8679, arg2, super.field6037, var7, ~this.field8679 != -12 ? this.field8675 : this.field8675 + 4, arg0, super.field6029, var6, -333, super.field6042, arg1);
    }
}
