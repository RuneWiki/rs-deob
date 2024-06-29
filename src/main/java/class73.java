import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class73 extends class201 implements class526 {

    @OriginalMember(owner = "client!gv", name = "R", descriptor = "Z")
    private boolean field966 = false;

    @OriginalMember(owner = "client!gv", name = "Y", descriptor = "Lvi;")
    public class500 field973;

    @OriginalMember(owner = "client!gv", name = "bb", descriptor = "Z")
    private boolean field976;

    @OriginalMember(owner = "client!gv", name = "H", descriptor = "I")
    public static int field959 = 0;

    @OriginalMember(owner = "client!gv", name = "hb", descriptor = "I")
    public static int field982 = 0;

    @OriginalMember(owner = "client!gv", name = "L", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!gv", name = "M", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!gv", name = "N", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!gv", name = "O", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!gv", name = "P", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!gv", name = "Q", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!gv", name = "S", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!gv", name = "T", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!gv", name = "U", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!gv", name = "V", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!gv", name = "W", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!gv", name = "X", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!gv", name = "Z", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!gv", name = "ab", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!gv", name = "cb", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!gv", name = "db", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!gv", name = "eb", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!gv", name = "fb", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!gv", name = "gb", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!gv", name = "ib", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!gv", name = "jb", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!gv", name = "D", descriptor = "Lcr;")
    private class533 field958;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)Z")
    public final boolean method219(int arg0) {
        int var2 = -2 / ((arg0 - 28) / 40);
        ++field963;
        return this.field973.method2810(256);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lr;I)V")
    public final void method225(class166 arg0, int arg1) {
        if (arg1 != -32013) {
            this.field976 = false;
        }
        ++field979;
        this.field973.method2801(arg0, (byte) -125);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Z)I")
    public final int method222(boolean arg0) {
        if (!arg0) {
            this.field976 = true;
        }
        ++field961;
        return this.field973.field6799;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V")
    public final void method208(int arg0) {
        if (arg0 != -18279) {
            this.method222(true);
        }
        ++field965;
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(Lr;I)Lbca;")
    public final class614 method221(class166 arg0, int arg1) {
        ++field983;
        class55 var3 = this.field973.method2804(true, -92, 2048, arg0, false);
        if (arg1 != -5) {
            this.field958 = null;
        }
        if (var3 == null) {
            return null;
        } else {
            class392 var4 = arg0.method166();
            var4.method689(super.field4042, super.field4052, super.field4047);
            class614 var5 = null;
            if (this.field976) {
                var5 = class524.method2987(6257, 1);
            }
            int var6 = super.field4042 >> 9;
            int var7 = super.field4047 >> 9;
            this.field973.method2803(true, var7, var3, arg0, var6, var6, var4, var7, false);
            if (!class340.field4563) {
                var3.method465(var4, var5 != null ? var5.field8572[0] : null, 0);
            } else {
                var3.method453(var4, var5 != null ? var5.field8572[0] : null, class22.field250, 0);
            }
            if (this.field973.field6790 != null) {
                class472 var8 = this.field973.field6790.method3598();
                if (class340.field4563) {
                    arg0.method167(var8, class22.field250);
                } else {
                    arg0.method163(var8);
                }
            }
            this.field966 = var3.method430() || this.field973.field6790 != null;
            if (this.field958 != null) {
                class222.method1406(this.field958, super.field4042, super.field4052, false, super.field4047, var3);
            } else {
                this.field958 = class333.method1966(super.field4042, arg1 + 21, super.field4052, var3, super.field4047);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(Z)Z")
    public final boolean method216(boolean arg0) {
        if (!arg0) {
            this.method226(-53);
        }
        ++field962;
        return false;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lr;Z)V")
    public final void method220(class166 arg0, boolean arg1) {
        ++field970;
        class55 var3 = this.field973.method2804(true, 38, 262144, arg0, arg1);
        if (var3 != null) {
            int var4 = super.field4042 >> 9;
            int var5 = super.field4047 >> 9;
            class392 var6 = arg0.method166();
            var6.method689(super.field4042, super.field4052, super.field4047);
            this.field973.method2803(false, var5, var3, arg0, var4, var4, var6, var5, !arg1);
        }
    }

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "(I)I")
    public final int method226(int arg0) {
        ++field984;
        return arg0 != 6329 ? -107 : this.field973.method2802(0);
    }

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "(I)V")
    public final void method227(int arg0) {
        if (arg0 < -115) {
            ++field968;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lvv;IIZLr;II)V")
    public final void method223(class295 arg0, int arg1, int arg2, boolean arg3, class166 arg4, int arg5, int arg6) {
        ++field980;
        if (arg6 == 0) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(CB)Z")
    public static final boolean method579(char arg0, byte arg1) {
        ++field978;
        if (arg1 <= 23) {
            return true;
        } else {
            return arg0 >= '0' && arg0 <= '9' || ~arg0 <= -66 && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        }
    }

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "(I)I")
    public final int method217(int arg0) {
        if (arg0 < 29) {
            field959 = -3;
        }
        ++field974;
        return this.field973.method2806(-114);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(BLr;)V")
    public final void method210(byte arg0, class166 arg1) {
        this.field973.method2805(arg1, -113);
        if (arg0 != 12) {
            field959 = 8;
        }
        ++field967;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)I")
    public final int method213(byte arg0) {
        ++field977;
        return arg0 <= 39 ? 2 : this.field973.field6804;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILr;)Lcr;")
    public final class533 method214(int arg0, class166 arg1) {
        int var3 = -95 / ((arg0 - 81) / 43);
        ++field972;
        return this.field958;
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lr;Ljs;IIIIIZIII)V")
    public class73(class166 arg0, class301 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class338.method1981(arg8, (byte) -115, arg9));
        this.field973 = new class500(arg0, arg1, arg8, arg9, super.field4053, arg3, this, arg7, arg10);
        this.field976 = arg1.field4164 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(BII)Z")
    public static final boolean method580(byte arg0, int arg1, int arg2) {
        if (arg0 < 40) {
            method580((byte) -14, 35, -112);
        }
        ++field964;
        return ~(arg1 & 458752) != -1 | class340.method1990(0, arg1, arg2) || class639.method3564(arg2, arg1, 121);
    }

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "(I)Z")
    public final boolean method215(int arg0) {
        ++field969;
        if (arg0 <= 49) {
            field959 = -98;
        }
        return false;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIILr;)Z")
    public final boolean method224(int arg0, int arg1, int arg2, class166 arg3) {
        ++field960;
        if (arg1 != 0) {
            return false;
        } else {
            class55 var5 = this.field973.method2804(false, 22, 131072, arg3, false);
            if (var5 == null) {
                return false;
            } else {
                class392 var6 = arg3.method166();
                var6.method689(super.field4042, super.field4052, super.field4047);
                return class340.field4563 ? var5.method419(arg2, arg0, var6, false, class22.field250) : var5.method448(arg2, arg0, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(B)I")
    public final int method211(byte arg0) {
        int var2 = 14 / ((arg0 - 38) / 41);
        ++field981;
        return this.field973.field6800;
    }

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "(B)Lqea;")
    public static final class112 method581(byte arg0) {
        if (arg0 < 88) {
            return null;
        } else {
            ++field975;
            return class510.field6979;
        }
    }

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "(B)Z")
    public final boolean method209(byte arg0) {
        ++field971;
        int var2 = 41 / ((arg0 - 31) / 42);
        return this.field966;
    }
}
