import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class212 extends class465 implements class49 {

    @OriginalMember(owner = "client!uea", name = "T", descriptor = "Z")
    private boolean field2568 = false;

    @OriginalMember(owner = "client!uea", name = "N", descriptor = "Lrv;")
    public class312 field2562;

    @OriginalMember(owner = "client!uea", name = "ab", descriptor = "Z")
    private boolean field2575;

    @OriginalMember(owner = "client!uea", name = "U", descriptor = "I")
    public static int field2569 = 0;

    @OriginalMember(owner = "client!uea", name = "V", descriptor = "F")
    public static float field2570;

    @OriginalMember(owner = "client!uea", name = "H", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!uea", name = "I", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!uea", name = "J", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!uea", name = "K", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!uea", name = "L", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!uea", name = "M", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!uea", name = "O", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!uea", name = "P", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!uea", name = "Q", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!uea", name = "R", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!uea", name = "S", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!uea", name = "W", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!uea", name = "X", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!uea", name = "Y", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!uea", name = "cb", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!uea", name = "db", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!uea", name = "fb", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!uea", name = "gb", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!uea", name = "hb", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!uea", name = "ib", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!uea", name = "eb", descriptor = "Llf;")
    private class676 field2579;

    @OriginalMember(owner = "client!uea", name = "bb", descriptor = "[I")
    public static int[] field2576;

    @OriginalMember(owner = "client!uea", name = "Z", descriptor = "[Ljo;")
    public static class504[] field2574;

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "(B)Z")
    public final boolean method236(byte arg0) {
        ++field2573;
        if (arg0 > -33) {
            this.method234(65);
        }
        return this.field2562.method1787(true);
    }

    @OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(Lr;Lqp;IIIIIZIII)V")
    public class212(class564 arg0, class638 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class533.method2992(arg9, false, arg8));
        this.field2562 = new class312(arg0, arg1, arg8, arg9, super.field5166, arg3, super.field5179, super.field5176, arg7, arg10);
        this.field2575 = ~arg1.field9035 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!uea", name = "d", descriptor = "(Lr;I)Llf;")
    public final class676 method185(class564 arg0, int arg1) {
        ++field2566;
        if (arg1 < 42) {
            field2569 = 24;
        }
        return this.field2579;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIIILrb;Lr;Z)V")
    public final void method184(int arg0, int arg1, int arg2, int arg3, class383 arg4, class564 arg5, boolean arg6) {
        if (arg2 == 2) {
            ++field2565;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(Z)I")
    public final int method237(boolean arg0) {
        ++field2578;
        if (arg0) {
            field2570 = 1.9474219F;
        }
        return this.field2562.field3848;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lr;I)V")
    public final void method232(class564 arg0, int arg1) {
        this.field2562.method1790((byte) 107, arg0);
        if (arg1 == 6905) {
            ++field2580;
        }
    }

    @OriginalMember(owner = "client!uea", name = "h", descriptor = "(I)Z")
    public final boolean method180(int arg0) {
        if (arg0 != -1) {
            this.field2562 = null;
        }
        ++field2560;
        return false;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(BI)V")
    public static final void method1258(byte arg0, int arg1) {
        ++field2558;
        class599.field8437 = -1;
        class254.field3190 = arg1;
        if (arg0 != -61) {
            field2574 = null;
        }
        class348.field4660 = 100;
        class269.field3346 = 3;
    }

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "(I)I")
    public final int method238(int arg0) {
        ++field2581;
        if (arg0 != 6518) {
            this.method184(52, 119, 96, -31, (class383) null, (class564) null, false);
        }
        return this.field2562.field3866;
    }

    @OriginalMember(owner = "client!uea", name = "i", descriptor = "(I)Z")
    public final boolean method177(int arg0) {
        if (arg0 >= -103) {
            this.method236((byte) -58);
        }
        ++field2571;
        return this.field2568;
    }

    @OriginalMember(owner = "client!uea", name = "c", descriptor = "(Lr;I)Lwj;")
    public final class315 method182(class564 arg0, int arg1) {
        ++field2577;
        if (arg1 != 0) {
            this.method177(104);
        }
        class473 var3 = this.field2562.method1786(true, arg0, super.field5176, false, -14283, 2048, super.field5179);
        if (var3 == null) {
            return null;
        } else {
            class490 var4 = arg0.method950();
            var4.method23(super.field5179, super.field5178, super.field5176);
            class315 var5 = null;
            if (this.field2575) {
                var5 = class419.method2349((byte) 124, 1);
            }
            int var6 = super.field5179 >> 9;
            int var7 = super.field5176 >> 9;
            this.field2562.method1794(true, var6, var7, var6, var4, (byte) -82, var3, var7, arg0);
            if (class460.field6553) {
                var3.method1875(var4, var5 != null ? var5.field3912[0] : null, class682.field9623, 0);
            } else {
                var3.method1914(var4, var5 == null ? null : var5.field3912[0], 0);
            }
            if (this.field2562.field3865 != null) {
                class332 var8 = this.field2562.field3865.method1952();
                if (class460.field6553) {
                    arg0.method1048(var8, class682.field9623);
                } else {
                    arg0.method1033(var8);
                }
            }
            this.field2568 = var3.method1913() || this.field2562.field3865 != null;
            if (this.field2579 == null) {
                this.field2579 = class191.method1166(0, super.field5176, var3, super.field5178, super.field5179);
            } else {
                class299.method1742(super.field5178, this.field2579, var3, super.field5176, (byte) -116, super.field5179);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!uea", name = "g", descriptor = "(I)I")
    public final int method179(int arg0) {
        if (arg0 != 3370) {
            return -108;
        } else {
            ++field2572;
            return this.field2562.method1791((byte) 68);
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lr;Z)V")
    public final void method172(class564 arg0, boolean arg1) {
        ++field2563;
        if (arg1) {
            method1259((byte) 109);
        }
        class473 var3 = this.field2562.method1786(true, arg0, super.field5176, true, -14283, 262144, super.field5179);
        if (var3 != null) {
            int var4 = super.field5179 >> 9;
            int var5 = super.field5176 >> 9;
            class490 var6 = arg0.method950();
            var6.method23(super.field5179, super.field5178, super.field5176);
            this.field2562.method1794(false, var4, var5, var4, var6, (byte) -93, var3, var5, arg0);
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lr;III)Z")
    public final boolean method173(class564 arg0, int arg1, int arg2, int arg3) {
        ++field2559;
        if (arg2 != 0) {
            this.field2575 = true;
        }
        class473 var5 = this.field2562.method1786(false, arg0, super.field5176, false, -14283, 131072, super.field5179);
        if (var5 == null) {
            return false;
        } else {
            class490 var6 = arg0.method950();
            var6.method23(super.field5179, super.field5178, super.field5176);
            return !class460.field6553 ? var5.method1867(arg1, arg3, var6, false) : var5.method1896(arg1, arg3, var6, false, class682.field9623);
        }
    }

    @OriginalMember(owner = "client!uea", name = "f", descriptor = "(B)V")
    public static void method1259(byte arg0) {
        field2574 = null;
        if (arg0 != 102) {
            field2574 = null;
        }
        field2576 = null;
    }

    @OriginalMember(owner = "client!uea", name = "c", descriptor = "(B)Z")
    public final boolean method183(byte arg0) {
        ++field2582;
        int var2 = -83 / ((arg0 - 12) / 62);
        return false;
    }

    @OriginalMember(owner = "client!uea", name = "b", descriptor = "(Lr;I)V")
    public final void method230(class564 arg0, int arg1) {
        this.field2562.method1795(arg0, arg1 ^ -21662);
        if (arg1 == 21670) {
            ++field2557;
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(I)V")
    public final void method234(int arg0) {
        ++field2564;
        if (arg0 > -51) {
            field2574 = null;
        }
    }

    @OriginalMember(owner = "client!uea", name = "j", descriptor = "(I)V")
    public final void method170(int arg0) {
        if (arg0 >= 20) {
            ++field2583;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(B)I")
    public final int method241(byte arg0) {
        if (arg0 != 29) {
            return -11;
        } else {
            ++field2561;
            return this.field2562.field3875;
        }
    }

    @OriginalMember(owner = "client!uea", name = "c", descriptor = "(Z)V")
    public static final void method1260(boolean arg0) {
        class113.method602(arg0);
        if (arg0) {
            method1259((byte) -124);
        }
        ++field2567;
    }

    @OriginalMember(owner = "client!uea", name = "e", descriptor = "(B)I")
    public final int method175(byte arg0) {
        ++field2556;
        if (arg0 <= 119) {
            this.method238(-68);
        }
        return this.field2562.method1793(-1);
    }
}
