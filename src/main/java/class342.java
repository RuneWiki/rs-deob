import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class342 extends class306 implements class143 {

    @OriginalMember(owner = "client!im", name = "T", descriptor = "Lwg;")
    public class245 field4957;

    @OriginalMember(owner = "client!im", name = "L", descriptor = "Z")
    private boolean field4949;

    @OriginalMember(owner = "client!im", name = "R", descriptor = "Lkn;")
    public static class442 field4955 = new class442();

    @OriginalMember(owner = "client!im", name = "U", descriptor = "[I")
    public static int[] field4958 = new int[500];

    @OriginalMember(owner = "client!im", name = "X", descriptor = "[Lqf;")
    public static class406[] field4961 = new class406[4];

    @OriginalMember(owner = "client!im", name = "B", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!im", name = "C", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!im", name = "D", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!im", name = "E", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!im", name = "F", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!im", name = "G", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!im", name = "H", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!im", name = "I", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!im", name = "J", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!im", name = "K", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!im", name = "M", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!im", name = "N", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!im", name = "O", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!im", name = "P", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!im", name = "Q", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!im", name = "S", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!im", name = "V", descriptor = "I")
    public static int field4959;

    @OriginalMember(owner = "client!im", name = "W", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II)Ljg;", line = 12)
    public static final class187 method2242(int arg0, int arg1) {
        if (arg1 > -24) {
            method2243((byte) -114);
        }
        ++field4940;
        class187 var2 = (class187) class96.field1224.method1972((long) arg0, 0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3;
            if (arg0 >= 32768) {
                var3 = class199.field2839.method643(0, arg0 & 32767, true);
            } else {
                var3 = class154.field2286.method643(0, arg0, true);
            }
            class187 var4 = new class187();
            if (var3 != null) {
                var4.method1338(10, new class130(var3));
            }
            if (~arg0 <= -32769) {
                var4.method1343(103);
            }
            class96.field1224.method1975(var4, (long) arg0, false);
            return var4;
        }
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lvq;Lbi;IIIIIIIZIIIII)V", line = 44)
    public class342(class269 arg0, class282 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg4, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg1.field4109 == 1, class59.method382((byte) 70, arg2, arg3));
        this.field4957 = new class245(arg0, arg1, arg2, arg3, super.field4464, arg5, arg6, arg8, arg9, arg14);
        this.field4949 = ~arg1.field4036 != -1 && !arg9;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lvq;I)V", line = 53)
    public final void method604(class269 arg0, int arg1) {
        this.field4957.method1708(arg0, true);
        ++field4950;
        int var3 = -70 / ((87 - arg1) / 34);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IILvq;)Lni;", line = 63)
    public final class305 method614(int arg0, int arg1, class269 arg2) {
        if (arg0 >= -19) {
            return null;
        } else {
            ++field4947;
            return this.field4957.method1714(0, false, 0, arg2, 92, false, arg1);
        }
    }

    @OriginalMember(owner = "client!im", name = "e", descriptor = "(B)V", line = 75)
    public static final void method2243(byte arg0) {
        int var1 = 0;
        if (arg0 != 49) {
            field4961 = null;
        }
        while (~var1 > ~class148.field2215.length) {
            for (int var2 = 0; var2 < class148.field2215[var1].length; ++var2) {
                class148.field2215[var1][var2] = class2.field8;
            }
            ++var1;
        }
        ++field4952;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)I", line = 102)
    public final int method602(byte arg0) {
        if (arg0 >= -33) {
            return -17;
        } else {
            ++field4943;
            return this.field4957.field3653;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lvq;ZLkm;IIBI)V", line = 114)
    public final void method611(class269 arg0, boolean arg1, class198 arg2, int arg3, int arg4, byte arg5, int arg6) {
        ++field4944;
        int var8 = 74 % ((arg5 - 12) / 40);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lvq;IIB)Z", line = 125)
    public final boolean method16(class269 arg0, int arg1, int arg2, byte arg3) {
        ++field4942;
        class305 var5 = this.field4957.method1714(super.field4466, false, super.field4463, arg0, -106, false, 65536);
        if (var5 == null) {
            return false;
        } else {
            class154 var6 = arg0.method884();
            int var7 = 70 % ((19 - arg3) / 45);
            var6.method1133(super.field4463, super.field4457, super.field4466);
            return var5.method209(arg1, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILvq;)V", line = 144)
    public final void method605(int arg0, class269 arg1) {
        ++field4960;
        if (arg0 != 29929) {
            this.field4949 = false;
        }
        this.field4957.method1703((byte) -38, arg1);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Z)Z", line = 156)
    public final boolean method608(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            ++field4945;
            return this.field4957.method1706(43);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V", line = 170)
    public final void method600(int arg0) {
        if (arg0 < -62) {
            ++field4951;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BLvq;)Lbf;", line = 184)
    public final class316 method15(byte arg0, class269 arg1) {
        ++field4948;
        int var3 = 69 / ((arg0 - -8) / 51);
        class305 var4 = this.field4957.method1714(super.field4466, false, super.field4463, arg1, -107, true, 1024);
        if (var4 == null) {
            return null;
        } else {
            class154 var5 = arg1.method884();
            var5.method1133(super.field4463, super.field4457, super.field4466);
            class316 var6 = null;
            if (this.field4949) {
                var6 = class105.method616(-15465, 1);
            }
            if (this.field4957.field3652 == null) {
                var4.method230(var5, var6 == null ? null : var6.field4631[0], 0);
            } else {
                class235 var7 = this.field4957.field3652.method2152();
                arg1.method1013(var4, var7, var5, var6 != null ? var6.field4631[0] : null, 0);
            }
            this.field4957.method1705(true, super.field4462, super.field4460, super.field4471, arg1, super.field4465, var4, 7215);
            return var6;
        }
    }

    @OriginalMember(owner = "client!im", name = "d", descriptor = "(I)Z", line = 220)
    public final boolean method610(int arg0) {
        if (arg0 != -439) {
            field4961 = null;
        }
        ++field4953;
        return false;
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(B)I", line = 231)
    public final int method603(byte arg0) {
        ++field4946;
        return arg0 != -62 ? -112 : this.field4957.field3640;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lvq;B)V", line = 244)
    public final void method22(class269 arg0, byte arg1) {
        if (arg1 < 11) {
            field4959 = 24;
        }
        ++field4954;
        class305 var3 = this.field4957.method1714(super.field4466, true, super.field4463, arg0, -103, true, 131072);
        if (var3 != null) {
            this.field4957.method1705(false, super.field4462, super.field4460, super.field4471, arg0, super.field4465, var3, 7215);
        }
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(I)I", line = 261)
    public final int method599(int arg0) {
        ++field4941;
        if (arg0 != -10450) {
            this.method775(-70);
        }
        return this.field4957.field3651;
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(B)V", line = 276)
    public final void method613(byte arg0) {
        ++field4956;
        if (arg0 >= -56) {
            field4958 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!im", name = "e", descriptor = "(I)I", line = 289)
    public final int method775(int arg0) {
        ++field4939;
        if (arg0 != 3) {
            this.method602((byte) -35);
        }
        return this.field4957.method1707((byte) 61);
    }

    @OriginalMember(owner = "client!im", name = "f", descriptor = "(I)V", line = 304)
    public static void method2244(int arg0) {
        field4961 = null;
        field4958 = null;
        field4955 = null;
        int var1 = -30 / ((arg0 - -28) / 56);
    }
}
