import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class462 extends class613 implements class49 {

    @OriginalMember(owner = "client!mu", name = "Z", descriptor = "Z")
    private boolean field6576 = false;

    @OriginalMember(owner = "client!mu", name = "R", descriptor = "Lrv;")
    public class312 field6568;

    @OriginalMember(owner = "client!mu", name = "W", descriptor = "Z")
    private boolean field6573;

    @OriginalMember(owner = "client!mu", name = "X", descriptor = "Lsb;")
    public static class305 field6574 = new class305(79, -1);

    @OriginalMember(owner = "client!mu", name = "L", descriptor = "I")
    public static int field6562;

    @OriginalMember(owner = "client!mu", name = "M", descriptor = "I")
    public static int field6563;

    @OriginalMember(owner = "client!mu", name = "N", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!mu", name = "P", descriptor = "I")
    public static int field6566;

    @OriginalMember(owner = "client!mu", name = "Q", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!mu", name = "S", descriptor = "I")
    public static int field6569;

    @OriginalMember(owner = "client!mu", name = "T", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!mu", name = "U", descriptor = "I")
    public static int field6571;

    @OriginalMember(owner = "client!mu", name = "Y", descriptor = "I")
    public static int field6575;

    @OriginalMember(owner = "client!mu", name = "ab", descriptor = "I")
    public static int field6577;

    @OriginalMember(owner = "client!mu", name = "bb", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!mu", name = "cb", descriptor = "I")
    public static int field6579;

    @OriginalMember(owner = "client!mu", name = "db", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!mu", name = "eb", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!mu", name = "fb", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!mu", name = "gb", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!mu", name = "hb", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!mu", name = "ib", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!mu", name = "jb", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!mu", name = "kb", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!mu", name = "V", descriptor = "Lbfa;")
    public static class146 field6572;

    @OriginalMember(owner = "client!mu", name = "O", descriptor = "Llf;")
    private class676 field6565;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V", line = 7)
    public final void method234(int arg0) {
        ++field6562;
        if (arg0 >= -51) {
            this.field6576 = false;
        }
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)I", line = 18)
    public final int method238(int arg0) {
        ++field6583;
        if (arg0 != 6518) {
            this.method180(-7);
        }
        return this.field6568.field3866;
    }

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "(Lr;I)Llf;", line = 29)
    public final class676 method185(class564 arg0, int arg1) {
        ++field6582;
        if (arg1 <= 42) {
            this.method177(114);
        }
        return this.field6565;
    }

    @OriginalMember(owner = "client!mu", name = "h", descriptor = "(I)Z", line = 40)
    public final boolean method180(int arg0) {
        if (arg0 != -1) {
            return true;
        } else {
            ++field6577;
            return false;
        }
    }

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "(B)I", line = 52)
    public final int method175(byte arg0) {
        if (arg0 <= 119) {
            return -107;
        } else {
            ++field6586;
            return this.field6568.method1793(-1);
        }
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lr;Lqp;IIIIIZIIIIIII)V", line = 64)
    public class462(class564 arg0, class638 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field9068 == -2, class32.method167(arg12, arg13, (byte) -54));
        this.field6568 = new class312(arg0, arg1, arg12, arg13, super.field5166, arg3, arg4, arg6, arg7, arg14);
        this.field6573 = arg1.field9035 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIIILrb;Lr;Z)V", line = 73)
    public final void method184(int arg0, int arg1, int arg2, int arg3, class383 arg4, class564 arg5, boolean arg6) {
        ++field6571;
        if (arg2 != 2) {
            this.field6568 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mu", name = "m", descriptor = "(I)V", line = 85)
    public static void method2652(int arg0) {
        field6574 = null;
        if (arg0 != 5) {
            method2652(6);
        }
        field6572 = null;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lr;I)V", line = 96)
    public final void method232(class564 arg0, int arg1) {
        if (arg1 == 6905) {
            this.field6568.method1790((byte) 113, arg0);
            ++field6567;
        }
    }

    @OriginalMember(owner = "client!mu", name = "j", descriptor = "(I)V", line = 108)
    public final void method170(int arg0) {
        if (arg0 < 20) {
            this.field6573 = true;
        }
        ++field6585;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)I", line = 125)
    public final int method241(byte arg0) {
        if (arg0 != 29) {
            this.field6576 = true;
        }
        ++field6566;
        return this.field6568.field3875;
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(B)Z", line = 136)
    public final boolean method236(byte arg0) {
        ++field6570;
        if (arg0 >= -33) {
            this.field6565 = null;
        }
        return this.field6568.method1787(true);
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lr;Z)V", line = 150)
    public final void method172(class564 arg0, boolean arg1) {
        ++field6579;
        class473 var3 = this.field6568.method1786(true, arg0, super.field5176, true, -14283, 262144, super.field5179);
        if (arg1) {
            this.method170(-59);
        }
        if (var3 != null) {
            class490 var4 = arg0.method950();
            var4.method23(super.field5179, super.field5178, super.field5176);
            this.field6568.method1794(false, super.field8635, super.field8627, super.field8634, var4, (byte) -97, var3, super.field8630, arg0);
        }
    }

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "(Lr;I)Lwj;", line = 172)
    public final class315 method182(class564 arg0, int arg1) {
        ++field6587;
        class473 var3 = this.field6568.method1786(true, arg0, super.field5176, false, -14283, 2048, super.field5179);
        if (var3 == null) {
            return null;
        } else {
            class490 var4 = arg0.method950();
            var4.method23(super.field5179, super.field5178, super.field5176);
            class315 var5 = null;
            if (this.field6573) {
                var5 = class419.method2349((byte) 121, 1);
            }
            this.field6568.method1794(true, super.field8635, super.field8627, super.field8634, var4, (byte) -58, var3, super.field8630, arg0);
            if (!class460.field6553) {
                var3.method1914(var4, var5 == null ? null : var5.field3912[0], 0);
            } else {
                var3.method1875(var4, var5 == null ? null : var5.field3912[0], class682.field9623, 0);
            }
            if (this.field6568.field3865 != null) {
                class332 var6 = this.field6568.field3865.method1952();
                if (!class460.field6553) {
                    arg0.method1033(var6);
                } else {
                    arg0.method1048(var6, class682.field9623);
                }
            }
            if (arg1 != 0) {
                return null;
            } else {
                this.field6576 = var3.method1913() || this.field6568.field3865 != null;
                if (this.field6565 != null) {
                    class299.method1742(super.field5178, this.field6565, var3, super.field5176, (byte) -116, super.field5179);
                } else {
                    this.field6565 = class191.method1166(0, super.field5176, var3, super.field5178, super.field5179);
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!mu", name = "i", descriptor = "(I)Z", line = 225)
    public final boolean method177(int arg0) {
        ++field6575;
        if (arg0 > -103) {
            this.method180(35);
        }
        return this.field6576;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Z)I", line = 236)
    public final int method237(boolean arg0) {
        if (arg0) {
            this.field6568 = null;
        }
        ++field6580;
        return this.field6568.field3848;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Lr;III)Z", line = 255)
    public final boolean method173(class564 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            this.field6576 = true;
        }
        ++field6563;
        class473 var5 = this.field6568.method1786(false, arg0, super.field5176, false, -14283, 131072, super.field5179);
        if (var5 == null) {
            return false;
        } else {
            class490 var6 = arg0.method950();
            var6.method23(super.field5179, super.field5178, super.field5176);
            return !class460.field6553 ? var5.method1867(arg1, arg3, var6, false) : var5.method1896(arg1, arg3, var6, false, class682.field9623);
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IIFI[FFIIIII)V", line = 278)
    public static final void method2653(int arg0, int arg1, float arg2, int arg3, float[] arg4, float arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg1 - arg0;
        int var12 = arg3 - arg9;
        ++field6584;
        int var13 = arg7 - arg8;
        float var14 = arg4[2] * (float) var12 + arg4[1] * (float) var13 + arg4[0] * (float) var11;
        float var15 = arg4[5] * (float) var12 + arg4[4] * (float) var13 + arg4[3] * (float) var11;
        if (arg10 < -89) {
            float var16 = arg4[8] * (float) var12 + arg4[6] * (float) var11 + arg4[7] * (float) var13;
            float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
            if (arg2 != 1.0F) {
                var17 = arg2 * var17;
            }
            float var18 = var15 + 0.5F + arg5;
            if (~arg6 == -2) {
                float var19 = var17;
                var17 = -var18;
                var18 = var19;
            } else if (~arg6 == -3) {
                var18 = -var18;
                var17 = -var17;
            } else if (~arg6 == -4) {
                float var20 = var17;
                var17 = var18;
                var18 = -var20;
            }
            class314.field3904 = var18;
            class137.field1504 = var17;
        }
    }

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "(I)I", line = 335)
    public final int method179(int arg0) {
        ++field6581;
        if (arg0 != 3370) {
            this.method232((class564) null, 119);
        }
        return this.field6568.method1791((byte) 68);
    }

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "(B)Z", line = 347)
    public final boolean method183(byte arg0) {
        ++field6578;
        int var2 = 36 % ((arg0 - 12) / 62);
        return false;
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(Lr;I)V", line = 361)
    public final void method230(class564 arg0, int arg1) {
        ++field6564;
        this.field6568.method1795(arg0, -36);
        if (arg1 != 21670) {
            this.method172((class564) null, false);
        }
    }
}
