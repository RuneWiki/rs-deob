import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class527 extends class455 implements class141 {

    @OriginalMember(owner = "client!pt", name = "J", descriptor = "Z")
    private boolean field7479 = false;

    @OriginalMember(owner = "client!pt", name = "O", descriptor = "Lfc;")
    public class258 field7483;

    @OriginalMember(owner = "client!pt", name = "R", descriptor = "Z")
    private boolean field7486;

    @OriginalMember(owner = "client!pt", name = "cb", descriptor = "I")
    public static int field7496 = 0;

    @OriginalMember(owner = "client!pt", name = "Q", descriptor = "Lqe;")
    public static class465 field7485 = new class465(52, -2);

    @OriginalMember(owner = "client!pt", name = "I", descriptor = "I")
    public static int field7478;

    @OriginalMember(owner = "client!pt", name = "L", descriptor = "I")
    public static int field7480;

    @OriginalMember(owner = "client!pt", name = "M", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!pt", name = "N", descriptor = "I")
    public static int field7482;

    @OriginalMember(owner = "client!pt", name = "P", descriptor = "I")
    public static int field7484;

    @OriginalMember(owner = "client!pt", name = "S", descriptor = "I")
    public static int field7487;

    @OriginalMember(owner = "client!pt", name = "T", descriptor = "I")
    public static int field7488;

    @OriginalMember(owner = "client!pt", name = "U", descriptor = "I")
    public static int field7489;

    @OriginalMember(owner = "client!pt", name = "V", descriptor = "I")
    public static int field7490;

    @OriginalMember(owner = "client!pt", name = "X", descriptor = "I")
    public static int field7491;

    @OriginalMember(owner = "client!pt", name = "Y", descriptor = "I")
    public static int field7492;

    @OriginalMember(owner = "client!pt", name = "Z", descriptor = "I")
    public static int field7493;

    @OriginalMember(owner = "client!pt", name = "bb", descriptor = "I")
    public static int field7495;

    @OriginalMember(owner = "client!pt", name = "db", descriptor = "I")
    public static int field7497;

    @OriginalMember(owner = "client!pt", name = "eb", descriptor = "I")
    public static int field7498;

    @OriginalMember(owner = "client!pt", name = "fb", descriptor = "I")
    public static int field7499;

    @OriginalMember(owner = "client!pt", name = "gb", descriptor = "I")
    public static int field7500;

    @OriginalMember(owner = "client!pt", name = "hb", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!pt", name = "ab", descriptor = "Ltb;")
    private class397 field7494;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BILha;Lgs;ZII)V", line = 3)
    public final void method405(byte arg0, int arg1, class58 arg2, class43 arg3, boolean arg4, int arg5, int arg6) {
        if (arg0 >= -5) {
            this.method393((byte) 26);
        }
        ++field7500;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lha;Luw;IIIIIZIII)V", line = 15)
    public class527(class58 arg0, class414 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class376.method2362(arg8, arg9, 3));
        this.field7483 = new class258(arg0, arg1, arg8, arg9, super.field649, arg3, this, arg7, arg10);
        this.field7486 = ~arg1.field5737 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "(B)Z", line = 25)
    public final boolean method402(byte arg0) {
        ++field7478;
        return arg0 <= 28;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lha;I)V", line = 36)
    public final void method1108(class58 arg0, int arg1) {
        this.field7483.method1752(arg0, (byte) -45);
        ++field7492;
        int var3 = -81 / ((44 - arg1) / 49);
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)I", line = 49)
    public final int method1109(byte arg0) {
        ++field7487;
        int var2 = -117 % ((-45 - arg0) / 39);
        return this.field7483.field3764;
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(I)V", line = 59)
    public final void method1114(int arg0) {
        if (arg0 >= 63) {
            ++field7497;
        }
    }

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "(I)I", line = 70)
    public final int method404(int arg0) {
        if (arg0 != 65535) {
            return 87;
        } else {
            ++field7499;
            return this.field7483.method1755(1709088134);
        }
    }

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "(I)V", line = 88)
    public final void method400(int arg0) {
        if (arg0 >= 33) {
            ++field7490;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "(B)Z", line = 103)
    public final boolean method399(byte arg0) {
        if (arg0 != 38) {
            this.field7486 = false;
        }
        ++field7480;
        return this.field7479;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Z)I", line = 114)
    public final int method1111(boolean arg0) {
        ++field7495;
        return arg0 ? -16 : this.field7483.field3755;
    }

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "(B)I", line = 125)
    public final int method393(byte arg0) {
        ++field7491;
        if (arg0 != -83) {
            field7485 = null;
        }
        return this.field7483.method1757(false);
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lha;Z)Ltb;", line = 140)
    public final class397 method397(class58 arg0, boolean arg1) {
        ++field7489;
        return arg1 ? null : this.field7494;
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(BLha;)Lvw;", line = 153)
    public final class304 method396(byte arg0, class58 arg1) {
        ++field7482;
        class469 var3 = this.field7483.method1747(2048, -1, arg1, true, false);
        if (var3 == null) {
            return null;
        } else {
            class280 var4 = arg1.method530();
            if (arg0 <= 3) {
                return null;
            } else {
                var4.method157(super.field644, super.field651, super.field648);
                class304 var5 = class359.method2239(1, this.field7486, (byte) 122);
                int var6 = super.field644 >> 9;
                int var7 = super.field648 >> 9;
                this.field7483.method1754(var7, arg1, -193, var4, true, var7, var6, var3, var6);
                if (!class339.field4781) {
                    var3.method329(var4, var5.field4298[0], 0);
                } else {
                    var3.method343(var4, var5.field4298[0], class220.field3129, 0);
                }
                if (this.field7483.field3736 != null) {
                    class624 var8 = this.field7483.field3736.method4185();
                    if (!class339.field4781) {
                        arg1.method593(var8);
                    } else {
                        arg1.method643(var8, class220.field3129);
                    }
                }
                this.field7479 = var3.method332() || this.field7483.field3736 != null;
                if (this.field7494 == null) {
                    this.field7494 = class719.method4012(super.field644, super.field648, var3, super.field651, (byte) -108);
                } else {
                    class715.method3982(-24762, super.field648, super.field651, this.field7494, var3, super.field644);
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(BLha;)V", line = 204)
    public final void method1110(byte arg0, class58 arg1) {
        this.field7483.method1751(arg1, true);
        ++field7493;
        if (arg0 <= 9) {
            this.field7486 = false;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lha;IZI)Z", line = 216)
    public final boolean method390(class58 arg0, int arg1, boolean arg2, int arg3) {
        ++field7488;
        class469 var5 = this.field7483.method1747(131072, -1, arg0, false, false);
        if (var5 == null) {
            return false;
        } else {
            class280 var6 = arg0.method530();
            var6.method157(super.field644, super.field651, super.field648);
            if (!arg2) {
                return true;
            } else {
                return class339.field4781 ? var5.method318(arg3, arg1, var6, false, 0, class220.field3129) : var5.method348(arg3, arg1, var6, false, 0);
            }
        }
    }

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "(I)V", line = 238)
    public static void method3119(int arg0) {
        field7485 = null;
        int var1 = -13 / ((arg0 - -81) / 42);
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(B)I", line = 251)
    public final int method1112(byte arg0) {
        ++field7484;
        int var2 = -56 % ((-75 - arg0) / 34);
        return this.field7483.field3757;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)Z", line = 261)
    public final boolean method1113(int arg0) {
        ++field7501;
        if (arg0 != -24333) {
            this.field7494 = null;
        }
        return this.field7483.method1753(false);
    }

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "(BLha;)V", line = 276)
    public final void method401(byte arg0, class58 arg1) {
        ++field7498;
        class469 var3 = this.field7483.method1747(262144, -1, arg1, true, true);
        if (var3 != null) {
            int var4 = super.field644 >> 9;
            int var5 = super.field648 >> 9;
            class280 var6 = arg1.method530();
            var6.method157(super.field644, super.field651, super.field648);
            this.field7483.method1754(var5, arg1, -193, var6, false, var5, var4, var3, var4);
        }
        if (arg0 != -39) {
            this.method1110((byte) -79, (class58) null);
        }
    }

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "(B)Z", line = 301)
    public final boolean method395(byte arg0) {
        ++field7481;
        if (arg0 != 84) {
            this.method1111(false);
        }
        return false;
    }
}
