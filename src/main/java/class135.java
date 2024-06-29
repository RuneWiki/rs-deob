import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class135 extends class149 implements class559 {

    @OriginalMember(owner = "client!ig", name = "ib", descriptor = "Z")
    private boolean field1612 = false;

    @OriginalMember(owner = "client!ig", name = "X", descriptor = "Lvt;")
    public class736 field1601;

    @OriginalMember(owner = "client!ig", name = "eb", descriptor = "Z")
    private boolean field1608;

    @OriginalMember(owner = "client!ig", name = "N", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!ig", name = "O", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!ig", name = "Q", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!ig", name = "R", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!ig", name = "S", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!ig", name = "T", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!ig", name = "U", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!ig", name = "V", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!ig", name = "W", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!ig", name = "Y", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!ig", name = "Z", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!ig", name = "ab", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!ig", name = "bb", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!ig", name = "cb", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!ig", name = "db", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!ig", name = "fb", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!ig", name = "gb", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!ig", name = "hb", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!ig", name = "kb", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!ig", name = "jb", descriptor = "Lufa;")
    private class152 field1613;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lha;B)V", line = 3)
    public final void method740(class454 arg0, byte arg1) {
        ++field1595;
        this.field1601.method4128(18119, arg0);
        if (arg1 < 16) {
            this.method256((byte) 15);
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)Z", line = 14)
    public final boolean method739(byte arg0) {
        ++field1594;
        int var2 = 127 / (-arg0 / 32);
        return this.field1601.method4123((byte) -38);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILgaa;I)V", line = 28)
    public static final void method847(int arg0, int arg1, class460 arg2, int arg3) {
        ++field1603;
        if (class85.field1090 == null && !class322.field4113) {
            if (arg2 != null && class364.method2248(arg2, arg3 + 1) != null) {
                class85.field1090 = arg2;
                class333.field4299 = class364.method2248(arg2, arg3 ^ 1);
                class563.field7885 = false;
                class175.field2276 = arg0;
                class539.field7595 = arg1;
                class295.field3840 = arg3;
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "(I)I", line = 48)
    public final int method247(int arg0) {
        ++field1605;
        if (arg0 != 0) {
            this.field1601 = null;
        }
        return this.field1601.method4127((byte) -125);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lha;I)Lie;", line = 61)
    public final class607 method509(class454 arg0, int arg1) {
        ++field1602;
        class219 var3 = this.field1601.method4126(true, arg0, 2048, false, (byte) -125);
        if (var3 == null) {
            return null;
        } else {
            class376 var4 = arg0.method114();
            var4.method1963(super.field1810 + super.field5790, super.field5791, super.field5784 - -super.field1805);
            class607 var5 = class311.method1814(53, 1, this.field1608);
            int var6 = super.field5790 >> 9;
            int var7 = super.field5784 >> 9;
            if (arg1 != -8964) {
                this.method269((byte) -27);
            }
            this.field1601.method4122(arg0, var6, var7, var7, true, var3, var4, var6, false);
            if (!class306.field3936) {
                var3.method1351(var4, var5.field8425[0], 0);
            } else {
                var3.method1375(var4, var5.field8425[0], class468.field6738, 0);
            }
            if (this.field1601.field10289 != null) {
                class603 var8 = this.field1601.field10289.method2540();
                if (class306.field3936) {
                    arg0.method155(var8, class468.field6738);
                } else {
                    arg0.method102(var8);
                }
            }
            this.field1612 = var3.method1338() || this.field1601.field10289 != null;
            if (this.field1613 == null) {
                this.field1613 = class517.method2966(super.field5790, var3, super.field5784, arg1 ^ -9072, super.field5791);
            } else {
                class465.method2750(super.field5791, this.field1613, super.field5790, var3, (byte) -123, super.field5784);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(Lha;B)Lufa;", line = 112)
    public final class152 method520(class454 arg0, byte arg1) {
        if (arg1 <= 114) {
            return null;
        } else {
            ++field1610;
            return this.field1613;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)I", line = 125)
    public final int method735(int arg0) {
        ++field1597;
        if (arg0 != 24123) {
            this.field1612 = true;
        }
        return this.field1601.field10297;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZLha;)V", line = 136)
    public final void method522(boolean arg0, class454 arg1) {
        ++field1598;
        class219 var3 = this.field1601.method4126(true, arg1, 262144, arg0, (byte) -120);
        if (var3 != null) {
            int var4 = super.field5790 >> 9;
            int var5 = super.field5784 >> 9;
            class376 var6 = arg1.method114();
            var6.method1963(super.field5790, super.field5791, super.field5784);
            this.field1601.method4122(arg1, var4, var5, var5, false, var3, var6, var4, false);
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Lha;Lqg;IIIIIZIIIII)V", line = 160)
    public class135(class454 arg0, class290 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field1601 = new class736(arg0, arg1, arg10, arg11, super.field5779, arg3, this, arg7, arg12);
        this.field1608 = ~arg1.field3738 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IBI)Z", line = 169)
    public static final boolean method848(int arg0, byte arg1, int arg2) {
        if (arg1 <= 73) {
            return true;
        } else {
            ++field1596;
            return ~(32768 & arg2) != -1;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(III)Z", line = 182)
    public static final boolean method849(int arg0, int arg1, int arg2) {
        ++field1611;
        if (arg0 != 0) {
            method847(114, 34, (class460) null, -72);
        }
        return (2048 & arg2) != 0 && (55 & arg1) != 0;
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(B)Z", line = 195)
    public final boolean method265(byte arg0) {
        int var2 = 56 % ((61 - arg0) / 45);
        ++field1600;
        return false;
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)I", line = 208)
    public final int method741(int arg0) {
        ++field1614;
        if (arg0 < 65) {
            this.method741(-125);
        }
        return this.field1601.field10318;
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(B)I", line = 220)
    public final int method269(byte arg0) {
        ++field1609;
        return arg0 != 30 ? -12 : this.field1601.method4124((byte) 103);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V", line = 232)
    public final void method736(byte arg0) {
        ++field1593;
        if (arg0 > -123) {
            this.field1608 = false;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIBLha;)Z", line = 243)
    public final boolean method512(int arg0, int arg1, byte arg2, class454 arg3) {
        ++field1599;
        class219 var5 = this.field1601.method4126(false, arg3, 131072, false, (byte) -113);
        if (var5 == null) {
            return false;
        } else {
            if (arg2 != -4) {
                this.method269((byte) -77);
            }
            class376 var6 = arg3.method114();
            var6.method1963(super.field1810 + super.field5790, super.field5791, super.field1805 + super.field5784);
            return !class306.field3936 ? var5.method1378(arg0, arg1, var6, false, 0) : var5.method1357(arg0, arg1, var6, false, 0, class468.field6738);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)I", line = 266)
    public final int method731(int arg0) {
        ++field1607;
        int var2 = 107 % ((arg0 - 36) / 42);
        return this.field1601.field10296;
    }

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "(B)Z", line = 280)
    public final boolean method256(byte arg0) {
        ++field1604;
        int var2 = 54 / ((arg0 - -1) / 36);
        return this.field1612;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILha;)V", line = 290)
    public final void method732(int arg0, class454 arg1) {
        ++field1606;
        this.field1601.method4125(arg0 ^ -273035, arg1);
        if (arg0 != -10891) {
            this.field1613 = null;
        }
    }
}
