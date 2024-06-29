import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class354 extends class144 implements class57 {

    @OriginalMember(owner = "client!uw", name = "H", descriptor = "Ltj;")
    public class170 field5035;

    @OriginalMember(owner = "client!uw", name = "I", descriptor = "Z")
    private boolean field5036;

    @OriginalMember(owner = "client!uw", name = "C", descriptor = "Lfh;")
    public static class567 field5031 = new class567();

    @OriginalMember(owner = "client!uw", name = "N", descriptor = "Lea;")
    public static class474 field5041 = new class474("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!uw", name = "z", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!uw", name = "B", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!uw", name = "D", descriptor = "I")
    public static int field5032;

    @OriginalMember(owner = "client!uw", name = "E", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!uw", name = "G", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!uw", name = "J", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!uw", name = "K", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!uw", name = "L", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!uw", name = "M", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!uw", name = "O", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!uw", name = "P", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!uw", name = "Q", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!uw", name = "R", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!uw", name = "T", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!uw", name = "U", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!uw", name = "V", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!uw", name = "A", descriptor = "Lew;")
    private class425 field5029;

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(I)I", line = 6)
    public final int method89(int arg0) {
        int var2 = -93 / ((11 - arg0) / 51);
        ++field5033;
        return this.field5035.field2079;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Loa;I)V", line = 16)
    public final void method90(class605 arg0, int arg1) {
        ++field5040;
        class327 var3 = this.field5035.method981(super.field1764, true, super.field1768, 126, 262144, arg0, true);
        if (arg1 != -5) {
            field5041 = null;
        }
        if (var3 != null) {
            class364 var4 = arg0.method342();
            var4.method2014(super.field1764, super.field1769, super.field1768);
            this.field5035.method976(var4, (byte) 96, var3, super.field1773, false, super.field1761, super.field1762, arg0, super.field1758);
        }
    }

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(B)V", line = 37)
    public final void method96(byte arg0) {
        if (arg0 == -76) {
            ++field5043;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "(I)V", line = 53)
    public final void method87(int arg0) {
        if (arg0 != 7511) {
            this.method96((byte) 122);
        }
        ++field5047;
    }

    @OriginalMember(owner = "client!uw", name = "h", descriptor = "(I)V", line = 64)
    public static void method2236(int arg0) {
        field5031 = null;
        if (arg0 <= 40) {
            method2236(-18);
        }
        field5041 = null;
    }

    @OriginalMember(owner = "client!uw", name = "d", descriptor = "(I)I", line = 75)
    public final int method95(int arg0) {
        int var2 = -85 % ((arg0 - 14) / 33);
        ++field5045;
        return this.field5035.field2098;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(BLoa;)V", line = 85)
    public final void method102(byte arg0, class605 arg1) {
        this.field5035.method975(262144, arg1);
        ++field5046;
        if (arg0 > -54) {
            field5041 = null;
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IILoa;I)Z", line = 96)
    public final boolean method91(int arg0, int arg1, class605 arg2, int arg3) {
        ++field5048;
        class327 var5 = this.field5035.method981(super.field1764, false, super.field1768, 111, 131072, arg2, false);
        if (var5 == null) {
            return false;
        } else {
            if (arg0 != -10503) {
                this.field5035 = null;
            }
            class364 var6 = arg2.method342();
            var6.method2014(super.field1764, super.field1769, super.field1768);
            return var5.method1381(arg1, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!uw", name = "f", descriptor = "(I)Z", line = 115)
    public final boolean method84(int arg0) {
        if (arg0 != 1630) {
            this.field5029 = null;
        }
        ++field5034;
        return false;
    }

    @OriginalMember(owner = "client!uw", name = "e", descriptor = "(I)I", line = 127)
    public final int method92(int arg0) {
        if (arg0 != 9812) {
            return -97;
        } else {
            ++field5042;
            return this.field5035.field2087;
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)Z", line = 139)
    public final boolean method93(int arg0) {
        if (arg0 != -23445) {
            field5041 = null;
        }
        ++field5037;
        return this.field5035.method979(arg0 + 25042);
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(ILoa;)V", line = 156)
    public final void method98(int arg0, class605 arg1) {
        ++field5032;
        if (arg0 != 16343) {
            this.field5035 = null;
        }
        this.field5035.method972(arg1, -22979);
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIILva;Loa;ZI)V", line = 167)
    public final void method86(int arg0, int arg1, int arg2, class429 arg3, class605 arg4, boolean arg5, int arg6) {
        if (arg0 == 7) {
            ++field5038;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Loa;B)Laca;", line = 178)
    public final class630 method88(class605 arg0, byte arg1) {
        ++field5028;
        class327 var3 = this.field5035.method981(super.field1764, true, super.field1768, 120, 2048, arg0, false);
        if (var3 == null) {
            return null;
        } else {
            class364 var4 = arg0.method342();
            if (arg1 >= -127) {
                return null;
            } else {
                var4.method2014(super.field1764, super.field1769, super.field1768);
                class630 var5 = null;
                if (this.field5036) {
                    var5 = class471.method2882(-128, 1);
                }
                this.field5035.method976(var4, (byte) 127, var3, super.field1773, true, super.field1761, super.field1762, arg0, super.field1758);
                if (this.field5035.field2075 != null) {
                    class33 var6 = this.field5035.field2075.method1334();
                    arg0.method307(var3, var6, var4, var5 != null ? var5.field9084[0] : null, 0);
                } else {
                    var3.method1380(var4, var5 == null ? null : var5.field9084[0], 0);
                }
                if (this.field5029 == null) {
                    this.field5029 = class645.method3676(super.field1768, super.field1769, (byte) -15, super.field1764, var3);
                } else {
                    class27.method158(super.field1768, this.field5029, (byte) 83, var3, super.field1764, super.field1769);
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!uw", name = "e", descriptor = "(B)I", line = 219)
    public final int method413(byte arg0) {
        if (arg0 != 58) {
            field5031 = null;
        }
        ++field5044;
        return this.field5035.method978(26895);
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IZLoa;)Lba;", line = 235)
    public final class327 method94(int arg0, boolean arg1, class605 arg2) {
        if (arg1) {
            this.method413((byte) -112);
        }
        ++field5030;
        return this.field5035.method981(0, false, 0, 111, arg0, arg2, false);
    }

    @OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(Loa;Lqd;IIIIIZIIIIIII)V", line = 249)
    public class354(class605 arg0, class385 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field5800 == -2, class529.method3103(-121, arg12, arg13));
        this.field5035 = new class170(arg0, arg1, arg12, arg13, super.field1757, arg3, arg4, arg6, arg7, arg14);
        this.field5036 = ~arg1.field5806 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(Loa;I)Lew;", line = 258)
    public final class425 method100(class605 arg0, int arg1) {
        if (arg1 != 28286) {
            this.method98(110, (class605) null);
        }
        ++field5039;
        return this.field5029;
    }
}
