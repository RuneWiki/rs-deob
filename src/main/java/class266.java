import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class266 extends class33 implements class55 {

    @OriginalMember(owner = "client!lp", name = "eb", descriptor = "B")
    private byte field3657;

    @OriginalMember(owner = "client!lp", name = "P", descriptor = "Z")
    private boolean field3642;

    @OriginalMember(owner = "client!lp", name = "D", descriptor = "S")
    private short field3630;

    @OriginalMember(owner = "client!lp", name = "y", descriptor = "Z")
    private boolean field3625;

    @OriginalMember(owner = "client!lp", name = "B", descriptor = "Z")
    private boolean field3628;

    @OriginalMember(owner = "client!lp", name = "H", descriptor = "B")
    private byte field3634;

    @OriginalMember(owner = "client!lp", name = "db", descriptor = "B")
    private byte field3656;

    @OriginalMember(owner = "client!lp", name = "F", descriptor = "Z")
    private boolean field3632;

    @OriginalMember(owner = "client!lp", name = "M", descriptor = "Lj;")
    private class378 field3639;

    @OriginalMember(owner = "client!lp", name = "W", descriptor = "Lc;")
    public class121 field3649;

    @OriginalMember(owner = "client!lp", name = "A", descriptor = "Lvg;")
    public static class38 field3627 = new class38(8);

    @OriginalMember(owner = "client!lp", name = "Z", descriptor = "Z")
    public static boolean field3652 = false;

    @OriginalMember(owner = "client!lp", name = "x", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!lp", name = "z", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!lp", name = "C", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!lp", name = "E", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!lp", name = "G", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!lp", name = "I", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!lp", name = "J", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!lp", name = "K", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!lp", name = "L", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!lp", name = "N", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!lp", name = "O", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!lp", name = "Q", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!lp", name = "R", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!lp", name = "T", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!lp", name = "U", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!lp", name = "V", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!lp", name = "X", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!lp", name = "Y", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!lp", name = "ab", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!lp", name = "bb", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!lp", name = "cb", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!lp", name = "S", descriptor = "Lvh;")
    public static class240 field3645;

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "(I)V")
    public static final void method1532(int arg0) {
        class321.field4438.method67(-95);
        int var1 = 107 / ((arg0 - -22) / 47);
        ++field3637;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IILco;ILqa;ZZ)V")
    public final void method394(int arg0, int arg1, class76 arg2, int arg3, class162 arg4, boolean arg5, boolean arg6) {
        if (!(arg2 instanceof class334)) {
            if (arg2 instanceof class266) {
                class266 var8 = (class266) arg2;
                if (this.field3649 != null && var8.field3649 != null) {
                    this.field3649.method800(var8.field3649, arg3, arg1, arg0, arg5);
                }
            }
        } else {
            class334 var9 = (class334) arg2;
            if (this.field3649 != null && var9.field4550 != null) {
                this.field3649.method800(var9.field4550, arg3, arg1, arg0, arg5);
            }
        }
        if (!arg6) {
            this.method359((byte) 27);
        }
        ++field3629;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IILqa;)Lc;")
    public final class121 method358(int arg0, int arg1, class162 arg2) {
        if (arg0 != 4586) {
            this.method359((byte) 72);
        }
        ++field3638;
        return this.method1537(-14671, arg1, arg2);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILqa;)V")
    public final void method356(int arg0, class162 arg1) {
        if (arg0 > 100) {
            ++field3647;
            Object var3 = null;
            class378 var5;
            if (this.field3639 == null && this.field3632) {
                class60 var4 = this.method1533(arg1, 262144, 4, true);
                var5 = var4 == null ? null : var4.field801;
            } else {
                var5 = this.field3639;
                this.field3639 = null;
            }
            if (var5 != null) {
                class174.method1075(var5, this.field3656, super.field466, super.field461, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lqa;III)Z")
    public final boolean method403(class162 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 24130) {
            this.method357(-54, (class162) null);
        }
        ++field3654;
        class121 var5 = this.method1537(-14671, 131072, arg0);
        if (var5 != null) {
            class415 var6 = arg0.method539();
            var6.method340(super.field466, super.field457, super.field461);
            return var5.method777(arg1, arg3, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "(I)I")
    public final int method215(int arg0) {
        ++field3636;
        if (arg0 != 0) {
            return -13;
        } else {
            return this.field3649 == null ? 0 : this.field3649.method771();
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lqa;IIZ)Ltt;")
    private final class60 method1533(class162 arg0, int arg1, int arg2, boolean arg3) {
        ++field3648;
        class132 var5 = class82.field1154.method2121(65535 & this.field3630, true);
        if (arg2 != 4) {
            this.field3630 = -37;
        }
        class35 var6;
        class35 var7;
        if (this.field3628) {
            var6 = class364.field5058[this.field3656];
            var7 = class19.field195[0];
        } else {
            var6 = class19.field195[this.field3656];
            if (~this.field3656 > -4) {
                var7 = class19.field195[this.field3656 + 1];
            } else {
                var7 = null;
            }
        }
        return var5.method860(super.field466, var6, super.field457, this.field3634 != 11 ? this.field3634 : 10, arg0, this.field3634 != 11 ? this.field3657 : this.field3657 + 4, 7, arg3, super.field461, var7, arg1);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Z)Z")
    public final boolean method399(boolean arg0) {
        if (arg0) {
            this.field3649 = null;
        }
        ++field3651;
        return this.field3625;
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(B)I")
    public final int method359(byte arg0) {
        if (arg0 != -8) {
            this.field3639 = null;
        }
        ++field3641;
        return this.field3657;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)I")
    public final int method354(byte arg0) {
        int var2 = 12 % ((arg0 - 61) / 53);
        ++field3635;
        return this.field3630 & 65535;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lqa;I)Lip;")
    public final class498 method402(class162 arg0, int arg1) {
        ++field3631;
        if (this.field3649 == null) {
            return null;
        } else {
            if (arg1 != 16562) {
                this.method361(120);
            }
            class415 var3 = arg0.method539();
            var3.method340(super.field466, super.field457, super.field461);
            class498 var4 = null;
            if (this.field3642) {
                var4 = class227.method1338(arg1 ^ 16562, 1);
            }
            this.field3649.method781(var3, var4 != null ? var4.field7332[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(ILqa;)V")
    public final void method400(int arg0, class162 arg1) {
        int var3 = -78 / ((arg0 - -29) / 33);
        ++field3640;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)I")
    public final int method355(int arg0) {
        ++field3626;
        if (arg0 != 13599) {
            this.method400(-71, (class162) null);
        }
        return this.field3634;
    }

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(B)I")
    public final int method1534(byte arg0) {
        if (arg0 != 110) {
            this.field3632 = false;
        }
        ++field3643;
        return this.field3649 == null ? 15 : this.field3649.method807() / 4;
    }

    @OriginalMember(owner = "client!lp", name = "j", descriptor = "(I)V")
    public static void method1535(int arg0) {
        int var1 = 5 % ((6 - arg0) / 55);
        field3645 = null;
        field3627 = null;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIIIBIII)V")
    public static final void method1536(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        class239.method1384(arg1, 0, (byte) 127, arg7, arg6, arg8, arg2, arg3, arg0, arg4);
        ++field3655;
        if (arg5 > -37) {
            field3627 = null;
        }
    }

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(I)V")
    public final void method361(int arg0) {
        ++field3650;
        int var2 = 58 / ((arg0 - -36) / 36);
        if (this.field3649 != null) {
            this.field3649.method796();
        }
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lqa;Lpk;IIIIIZIIIIIIZ)V")
    public class266(class162 arg0, class132 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field1853 == -2, class287.method1639(-4588, arg13, arg12));
        this.field3657 = (byte) arg13;
        this.field3642 = arg1.field1850 != 0 && !arg7;
        this.field3630 = (short) arg1.field1866;
        this.field3625 = arg14;
        this.field3628 = arg7;
        this.field3634 = (byte) arg12;
        this.field3656 = (byte) arg3;
        this.field3632 = arg0.method485() && arg1.field1891 && !this.field3628 && ~class437.field6374.method1765(class278.field3761, (byte) -101) != -1;
        int var16 = 2048;
        if (this.field3625) {
            var16 |= 65536;
        }
        class60 var17 = this.method1533(arg0, var16, 4, this.field3632);
        if (var17 != null) {
            this.field3639 = var17.field801;
            this.field3649 = var17.field803;
            if (this.field3625) {
                this.field3649 = this.field3649.method761((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "(I)V")
    public final void method398(int arg0) {
        this.field3625 = false;
        ++field3646;
        if (arg0 < 74) {
            this.method359((byte) 36);
        }
        if (this.field3649 != null) {
            this.field3649.method787(-65537 & this.field3649.method775());
        }
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(ILqa;)V")
    public final void method357(int arg0, class162 arg1) {
        if (arg0 <= 41) {
            this.method354((byte) -86);
        }
        ++field3624;
        Object var3 = null;
        class378 var5;
        if (this.field3639 == null && this.field3632) {
            class60 var4 = this.method1533(arg1, 262144, 4, true);
            var5 = var4 != null ? var4.field801 : null;
        } else {
            var5 = this.field3639;
            this.field3639 = null;
        }
        if (var5 != null) {
            class114.method731(var5, this.field3656, super.field466, super.field461, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)Z")
    public final boolean method360(int arg0) {
        if (arg0 <= 34) {
            return true;
        } else {
            ++field3633;
            return this.field3632;
        }
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(IILqa;)Lc;")
    private final class121 method1537(int arg0, int arg1, class162 arg2) {
        if (arg0 != -14671) {
            return null;
        } else {
            ++field3653;
            if (this.field3649 != null && arg2.method472(this.field3649.method775(), arg1) == 0) {
                return this.field3649;
            } else {
                class60 var4 = this.method1533(arg2, arg1, 4, false);
                return var4 != null ? var4.field803 : null;
            }
        }
    }
}
