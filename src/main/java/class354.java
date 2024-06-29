import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class354 extends class323 implements class231 {

    @OriginalMember(owner = "client!uw", name = "P", descriptor = "Lel;")
    public class469 field4827;

    @OriginalMember(owner = "client!uw", name = "L", descriptor = "Z")
    private boolean field4823;

    @OriginalMember(owner = "client!uw", name = "A", descriptor = "Lada;")
    public static class144 field4812 = new class144(72, 12);

    @OriginalMember(owner = "client!uw", name = "Q", descriptor = "I")
    public static int field4828 = 0;

    @OriginalMember(owner = "client!uw", name = "u", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!uw", name = "v", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!uw", name = "w", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!uw", name = "x", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!uw", name = "y", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!uw", name = "z", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!uw", name = "B", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!uw", name = "C", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!uw", name = "D", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!uw", name = "E", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!uw", name = "F", descriptor = "I")
    public static int field4817;

    @OriginalMember(owner = "client!uw", name = "G", descriptor = "I")
    public static int field4818;

    @OriginalMember(owner = "client!uw", name = "H", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!uw", name = "I", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!uw", name = "J", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!uw", name = "K", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!uw", name = "M", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!uw", name = "N", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!uw", name = "O", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!uw", name = "R", descriptor = "I")
    public static int field4829;

    @OriginalMember(owner = "client!uw", name = "S", descriptor = "Lpl;")
    private class558 field4830;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lqa;I)Lpl;", line = 7)
    public final class558 method189(class208 arg0, int arg1) {
        ++field4826;
        if (arg1 != 31733) {
            field4818 = -100;
        }
        return this.field4830;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(ILqa;IB)Z", line = 22)
    public final boolean method171(int arg0, class208 arg1, int arg2, byte arg3) {
        ++field4821;
        class159 var5 = this.field4827.method2828((byte) 44, false, super.field4457, super.field4446, arg1, 131072, false);
        if (var5 == null) {
            return false;
        } else {
            class165 var6 = arg1.method428();
            var6.method353(super.field4448 + super.field4446, super.field4449, super.field4457 - -super.field4447);
            if (arg3 < 44) {
                this.method171(125, (class208) null, 15, (byte) 39);
            }
            return var5.method72(arg2, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lkda;BLqa;)V", line = 42)
    public static final void method2136(class328 arg0, byte arg1, class208 arg2) {
        ++field4819;
        if (!class465.field6546) {
            arg2.method421(0);
            class583.field8560 = arg2.method474(class126.method894(arg0, class507.field7166), true);
            class583.field8560.method316((class165.field2605 + -class583.field8560.method326()) / 2, (class47.field562 + -class583.field8560.method322()) / 2);
            class236.field3412 = arg2.method474(class126.method894(arg0, class87.field1313), true);
            class236.field3412.method316((class165.field2605 - class236.field3412.method326()) / 2, 18);
            class465.field6546 = true;
            int var3 = -41 / ((arg1 - -30) / 62);
        }
    }

    @OriginalMember(owner = "client!uw", name = "e", descriptor = "(B)V", line = 60)
    public static void method2137(byte arg0) {
        field4812 = null;
        if (arg0 != -63) {
            method2140((byte) 108);
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(BILqa;)Lr;", line = 71)
    public final class159 method190(byte arg0, int arg1, class208 arg2) {
        if (arg0 < 40) {
            return null;
        } else {
            ++field4815;
            return this.field4827.method2828((byte) 79, false, 0, 0, arg2, arg1, false);
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(II)I", line = 82)
    public static int method2138(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(I)I", line = 89)
    public final int method170(int arg0) {
        ++field4824;
        if (arg0 > -120) {
            this.field4830 = null;
        }
        return this.field4827.field6595;
    }

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(BLqa;)V", line = 100)
    public final void method178(byte arg0, class208 arg1) {
        ++field4825;
        this.field4827.method2834(arg1, -21701);
        if (arg0 != 115) {
            field4828 = -88;
        }
    }

    @OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(Lqa;Luh;IIIIIZIIIIII)V", line = 117)
    public class354(class208 arg0, class145 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class222.method1438(arg11, (byte) -18, arg12));
        this.field4827 = new class469(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field4823 = ~arg1.field2056 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(BII)Z", line = 127)
    public static final boolean method2139(byte arg0, int arg1, int arg2) {
        ++field4814;
        if (arg0 >= -123) {
            return true;
        } else {
            return ~(1408 & arg2) != -1;
        }
    }

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(B)I", line = 138)
    public final int method173(byte arg0) {
        ++field4810;
        int var2 = 66 / ((-43 - arg0) / 49);
        return this.field4827.field6628;
    }

    @OriginalMember(owner = "client!uw", name = "f", descriptor = "(B)V", line = 149)
    public static final void method2140(byte arg0) {
        for (class618 var1 = (class618) class602.field8984.method2242((byte) 45); var1 != null; var1 = (class618) class602.field8984.method2242((byte) 45)) {
            class208.method1381((byte) -62, var1);
        }
        ++field4807;
        if (arg0 <= -36) {
            int var2;
            int var3;
            if (!class56.field668.method1472(class526.field7533, (byte) 105)) {
                var2 = class447.field6263;
                var3 = class447.field6263;
            } else {
                var3 = 0;
                var2 = 3;
            }
            client.method1608();
            for (int var4 = var3; var4 <= var2; ++var4) {
                client.method1624();
                client.method1610(var4);
                client.method1600(var4);
            }
            client.method1614();
            client.method1622();
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Lkda;IBI)Llo;", line = 194)
    public static final class642 method2141(class328 arg0, int arg1, byte arg2, int arg3) {
        ++field4829;
        class148 var4 = new class148(arg0.method1966(arg1, arg3, true));
        class642 var5 = new class642(arg1, var4.method1023(-29153), var4.method1023(-29153), var4.method1026(-917302120), var4.method1026(-917302120), var4.method1032((byte) -33) == 1, var4.method1032((byte) -33), var4.method1032((byte) -33));
        int var6 = var4.method1032((byte) -33);
        for (int var7 = 0; ~var7 > ~var6; ++var7) {
            var5.field9352.method131(new class278(var4.method1032((byte) -33), var4.method1045(true), var4.method1045(true), var4.method1045(true), var4.method1045(true), var4.method1045(true), var4.method1045(true), var4.method1045(true), var4.method1045(true)), 0);
        }
        var5.method3713(12800);
        if (arg2 <= 42) {
            method2137((byte) 109);
        }
        return var5;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(BLqa;)V", line = 225)
    public final void method174(byte arg0, class208 arg1) {
        this.field4827.method2836(arg1, -120);
        ++field4806;
        if (arg0 > -36) {
            method2139((byte) 16, 4, -49);
        }
    }

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(ILqa;)Lin;", line = 236)
    public final class77 method181(int arg0, class208 arg1) {
        ++field4822;
        class159 var3 = this.field4827.method2828((byte) 101, false, super.field4457, super.field4446, arg1, 2048, true);
        if (var3 == null) {
            return null;
        } else {
            class165 var4 = arg1.method428();
            var4.method353(super.field4448 + super.field4446, super.field4449, super.field4457 + super.field4447);
            class77 var5 = null;
            if (arg0 <= 0) {
                return null;
            } else {
                if (this.field4823) {
                    var5 = class450.method2725(1, 26728);
                }
                if (this.field4827.field6607 != null) {
                    class283 var6 = this.field4827.field6607.method1356();
                    arg1.method511(var3, var6, var4, var5 == null ? null : var5.field1022[0], 0);
                } else {
                    var3.method93(var4, var5 == null ? null : var5.field1022[0], 0);
                }
                if (this.field4830 == null) {
                    this.field4830 = class115.method826(var3, super.field4446, 21979, super.field4457, super.field4449);
                } else {
                    class319.method1931(this.field4830, super.field4457, super.field4446, -124, var3, super.field4449);
                }
                int var7 = super.field4446 >> 7;
                int var8 = super.field4457 >> 7;
                this.field4827.method2829(var8, true, arg1, var8, (byte) 73, var3, var7, var7);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(B)Z", line = 282)
    public final boolean method192(byte arg0) {
        ++field4811;
        return arg0 != -41 ? false : this.field4827.method2831((byte) 104);
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(ILqa;)V", line = 294)
    public final void method194(int arg0, class208 arg1) {
        if (arg0 == 0) {
            ++field4820;
            class159 var3 = this.field4827.method2828((byte) 109, false, super.field4457, super.field4446, arg1, 262144, true);
            if (var3 != null) {
                int var4 = super.field4446 >> 7;
                int var5 = super.field4457 >> 7;
                this.field4827.method2829(var5, false, arg1, var5, (byte) 34, var3, var4, var4);
            }
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)I", line = 318)
    public final int method183(int arg0) {
        ++field4813;
        if (arg0 != -19248) {
            this.field4827 = null;
        }
        return this.field4827.field6615;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Z)I", line = 329)
    public final int method1941(boolean arg0) {
        if (arg0) {
            return -10;
        } else {
            ++field4809;
            return this.field4827.method2826((byte) -105);
        }
    }

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "(I)V", line = 340)
    public final void method172(int arg0) {
        if (arg0 >= 95) {
            ++field4808;
        }
    }
}
