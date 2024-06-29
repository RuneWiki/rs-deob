import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class706 extends class570 implements class49 {

    @OriginalMember(owner = "client!jba", name = "X", descriptor = "Z")
    private boolean field9939 = false;

    @OriginalMember(owner = "client!jba", name = "I", descriptor = "Lrv;")
    public class312 field9924;

    @OriginalMember(owner = "client!jba", name = "R", descriptor = "Z")
    private boolean field9933;

    @OriginalMember(owner = "client!jba", name = "C", descriptor = "I")
    public static int field9919;

    @OriginalMember(owner = "client!jba", name = "E", descriptor = "I")
    public static int field9921;

    @OriginalMember(owner = "client!jba", name = "F", descriptor = "I")
    public static int field9922;

    @OriginalMember(owner = "client!jba", name = "G", descriptor = "I")
    public static int field9923;

    @OriginalMember(owner = "client!jba", name = "J", descriptor = "I")
    public static int field9925;

    @OriginalMember(owner = "client!jba", name = "K", descriptor = "I")
    public static int field9926;

    @OriginalMember(owner = "client!jba", name = "L", descriptor = "I")
    public static int field9927;

    @OriginalMember(owner = "client!jba", name = "M", descriptor = "I")
    public static int field9928;

    @OriginalMember(owner = "client!jba", name = "N", descriptor = "I")
    public static int field9929;

    @OriginalMember(owner = "client!jba", name = "O", descriptor = "I")
    public static int field9930;

    @OriginalMember(owner = "client!jba", name = "P", descriptor = "I")
    public static int field9931;

    @OriginalMember(owner = "client!jba", name = "Q", descriptor = "I")
    public static int field9932;

    @OriginalMember(owner = "client!jba", name = "S", descriptor = "I")
    public static int field9934;

    @OriginalMember(owner = "client!jba", name = "T", descriptor = "I")
    public static int field9935;

    @OriginalMember(owner = "client!jba", name = "U", descriptor = "I")
    public static int field9936;

    @OriginalMember(owner = "client!jba", name = "V", descriptor = "I")
    public static int field9937;

    @OriginalMember(owner = "client!jba", name = "W", descriptor = "I")
    public static int field9938;

    @OriginalMember(owner = "client!jba", name = "Y", descriptor = "I")
    public static int field9940;

    @OriginalMember(owner = "client!jba", name = "Z", descriptor = "I")
    public static int field9941;

    @OriginalMember(owner = "client!jba", name = "D", descriptor = "Llf;")
    private class676 field9920;

    @OriginalMember(owner = "client!jba", name = "i", descriptor = "(I)Z", line = 3)
    public final boolean method177(int arg0) {
        if (arg0 > -103) {
            this.field9933 = false;
        }
        ++field9941;
        return this.field9939;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIIIIII)V", line = 16)
    public static final void method3941(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field9928;
        if (arg2 != -3870) {
            method3941(-51, 29, -54, -30, -74, -37, -51);
        }
        int var7 = class266.method1567(class93.field949, true, class360.field4834, arg3);
        int var8 = class266.method1567(class93.field949, true, class360.field4834, arg5);
        int var9 = class266.method1567(class412.field5526, true, class72.field740, arg1);
        int var10 = class266.method1567(class412.field5526, true, class72.field740, arg0);
        int var11 = class266.method1567(class93.field949, true, class360.field4834, arg3 + arg4);
        int var12 = class266.method1567(class93.field949, true, class360.field4834, -arg4 + arg5);
        for (int var13 = var7; ~var11 < ~var13; ++var13) {
            class315.method1809(class557.field7954[var13], arg6, -128, var9, var10);
        }
        for (int var14 = var8; ~var14 < ~var12; --var14) {
            class315.method1809(class557.field7954[var14], arg6, arg2 + 3742, var9, var10);
        }
        int var15 = class266.method1567(class412.field5526, true, class72.field740, arg1 - -arg4);
        int var16 = class266.method1567(class412.field5526, true, class72.field740, -arg4 + arg0);
        for (int var17 = var11; ~var17 >= ~var12; ++var17) {
            int[] var18 = class557.field7954[var17];
            class315.method1809(var18, arg6, -128, var9, var15);
            class315.method1809(var18, arg6, -128, var16, var10);
        }
    }

    @OriginalMember(owner = "client!jba", name = "e", descriptor = "(B)I", line = 68)
    public final int method175(byte arg0) {
        ++field9930;
        if (arg0 <= 119) {
            this.method237(true);
        }
        return this.field9924.method1793(-1);
    }

    @OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Lr;Lqp;IIIIIZII)V", line = 80)
    public class706(class564 arg0, class638 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field9036);
        this.field9924 = new class312(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field9933 = arg1.field9035 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)V", line = 90)
    public final void method234(int arg0) {
        ++field9919;
        if (arg0 > -51) {
            this.method232((class564) null, -68);
        }
    }

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "(Lr;I)Lwj;", line = 100)
    public final class315 method182(class564 arg0, int arg1) {
        ++field9932;
        class473 var3 = this.field9924.method1786(true, arg0, super.field5176, false, -14283, 2048, super.field5179);
        if (arg1 != 0) {
            this.field9924 = null;
        }
        if (var3 == null) {
            return null;
        } else {
            class490 var4 = arg0.method950();
            var4.method23(super.field5179, super.field5178, super.field5176);
            class315 var5 = null;
            if (this.field9933) {
                var5 = class419.method2349((byte) 124, 1);
            }
            int var6 = super.field5179 >> 9;
            int var7 = super.field5176 >> 9;
            this.field9924.method1794(true, var6, var7, var6, var4, (byte) -121, var3, var7, arg0);
            if (!class460.field6553) {
                var3.method1914(var4, var5 != null ? var5.field3912[0] : null, 0);
            } else {
                var3.method1875(var4, var5 != null ? var5.field3912[0] : null, class682.field9623, 0);
            }
            if (this.field9924.field3865 != null) {
                class332 var8 = this.field9924.field3865.method1952();
                if (!class460.field6553) {
                    arg0.method1033(var8);
                } else {
                    arg0.method1048(var8, class682.field9623);
                }
            }
            this.field9939 = var3.method1913() || this.field9924.field3865 != null;
            if (this.field9920 != null) {
                class299.method1742(super.field5178, this.field9920, var3, super.field5176, (byte) -116, super.field5179);
            } else {
                this.field9920 = class191.method1166(0, super.field5176, var3, super.field5178, super.field5179);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lr;III)Z", line = 155)
    public final boolean method173(class564 arg0, int arg1, int arg2, int arg3) {
        ++field9926;
        class473 var5 = this.field9924.method1786(false, arg0, super.field5176, false, -14283, 131072, super.field5179);
        if (arg2 != 0) {
            this.field9924 = null;
        }
        if (var5 == null) {
            return false;
        } else {
            class490 var6 = arg0.method950();
            var6.method23(super.field5179, super.field5178, super.field5176);
            return class460.field6553 ? var5.method1896(arg1, arg3, var6, false, class682.field9623) : var5.method1867(arg1, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lr;Z)V", line = 175)
    public final void method172(class564 arg0, boolean arg1) {
        if (arg1) {
            this.field9924 = null;
        }
        ++field9931;
        class473 var3 = this.field9924.method1786(true, arg0, super.field5176, true, -14283, 262144, super.field5179);
        if (var3 != null) {
            int var4 = super.field5179 >> 9;
            int var5 = super.field5176 >> 9;
            class490 var6 = arg0.method950();
            var6.method23(super.field5179, super.field5178, super.field5176);
            this.field9924.method1794(false, var4, var5, var4, var6, (byte) 110, var3, var5, arg0);
        }
    }

    @OriginalMember(owner = "client!jba", name = "j", descriptor = "(I)V", line = 199)
    public final void method170(int arg0) {
        ++field9925;
        if (arg0 <= 20) {
            this.field9933 = false;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(B)Z", line = 212)
    public final boolean method236(byte arg0) {
        ++field9940;
        if (arg0 >= -33) {
            this.method180(44);
        }
        return this.field9924.method1787(true);
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIIILrb;Lr;Z)V", line = 225)
    public final void method184(int arg0, int arg1, int arg2, int arg3, class383 arg4, class564 arg5, boolean arg6) {
        if (arg2 != 2) {
            this.field9924 = null;
        }
        ++field9929;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "(Lr;I)Llf;", line = 238)
    public final class676 method185(class564 arg0, int arg1) {
        if (arg1 < 42) {
            return null;
        } else {
            ++field9938;
            return this.field9920;
        }
    }

    @OriginalMember(owner = "client!jba", name = "g", descriptor = "(I)I", line = 251)
    public final int method179(int arg0) {
        if (arg0 != 3370) {
            return 113;
        } else {
            ++field9936;
            return this.field9924.method1791((byte) 68);
        }
    }

    @OriginalMember(owner = "client!jba", name = "h", descriptor = "(I)Z", line = 264)
    public final boolean method180(int arg0) {
        ++field9937;
        return arg0 != -1;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Z)I", line = 275)
    public final int method237(boolean arg0) {
        if (arg0) {
            return -78;
        } else {
            ++field9935;
            return this.field9924.field3848;
        }
    }

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "(B)Z", line = 287)
    public final boolean method183(byte arg0) {
        ++field9922;
        int var2 = 15 / ((arg0 - 12) / 62);
        return false;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(Lr;I)V", line = 297)
    public final void method232(class564 arg0, int arg1) {
        if (arg1 != 6905) {
            this.method177(-111);
        }
        this.field9924.method1790((byte) 56, arg0);
        ++field9934;
    }

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(Lr;I)V", line = 311)
    public final void method230(class564 arg0, int arg1) {
        ++field9921;
        this.field9924.method1795(arg0, arg1 + -21558);
        if (arg1 != 21670) {
            this.field9920 = null;
        }
    }

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(I)I", line = 325)
    public final int method238(int arg0) {
        if (arg0 != 6518) {
            this.method241((byte) -14);
        }
        ++field9923;
        return this.field9924.field3866;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(B)I", line = 336)
    public final int method241(byte arg0) {
        ++field9927;
        return arg0 != 29 ? 89 : this.field9924.field3875;
    }
}
