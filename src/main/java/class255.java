import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class255 extends class353 implements class526 {

    @OriginalMember(owner = "client!kd", name = "U", descriptor = "Z")
    private boolean field3474 = false;

    @OriginalMember(owner = "client!kd", name = "cb", descriptor = "Lvi;")
    public class500 field3482;

    @OriginalMember(owner = "client!kd", name = "jb", descriptor = "Z")
    private boolean field3489;

    @OriginalMember(owner = "client!kd", name = "hb", descriptor = "Lem;")
    public static class206 field3487 = new class206(85, -1);

    @OriginalMember(owner = "client!kd", name = "kb", descriptor = "I")
    public static int field3490 = -1;

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!kd", name = "T", descriptor = "I")
    public static int field3473;

    @OriginalMember(owner = "client!kd", name = "V", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!kd", name = "W", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!kd", name = "X", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!kd", name = "Y", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!kd", name = "Z", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!kd", name = "ab", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!kd", name = "bb", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!kd", name = "db", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!kd", name = "eb", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!kd", name = "fb", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!kd", name = "gb", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!kd", name = "ib", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!kd", name = "lb", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!kd", name = "mb", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "Lcr;")
    private class533 field3469;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "(I)V")
    public static final void method1570(int arg0) {
        if (arg0 == 569692233) {
            ++field3475;
            if (!class14.field147) {
                class518.method2952((byte) 48, class468.field6438);
                if (class310.field4290 != null) {
                    class518.method2952((byte) 48, class310.field4290);
                }
                class14.field147 = true;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "(B)V")
    public static void method1571(byte arg0) {
        if (arg0 != 8) {
            field3487 = null;
        }
        field3487 = null;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Lr;I)Lbca;")
    public final class614 method221(class166 arg0, int arg1) {
        ++field3477;
        if (arg1 != -5) {
            this.method220((class166) null, true);
        }
        class55 var3 = this.field3482.method2804(true, arg1 + 124, 2048, arg0, false);
        if (var3 == null) {
            return null;
        } else {
            class392 var4 = arg0.method166();
            var4.method689(super.field4697 + super.field4042, super.field4052, super.field4696 + super.field4047);
            class614 var5 = null;
            if (this.field3489) {
                var5 = class524.method2987(6257, 1);
            }
            int var6 = super.field4042 >> 9;
            int var7 = super.field4047 >> 9;
            this.field3482.method2803(true, var7, var3, arg0, var6, var6, var4, var7, false);
            if (class340.field4563) {
                var3.method453(var4, var5 != null ? var5.field8572[0] : null, class22.field250, 0);
            } else {
                var3.method465(var4, var5 != null ? var5.field8572[0] : null, 0);
            }
            if (this.field3482.field6790 != null) {
                class472 var8 = this.field3482.field6790.method3598();
                if (!class340.field4563) {
                    arg0.method163(var8);
                } else {
                    arg0.method167(var8, class22.field250);
                }
            }
            this.field3474 = var3.method430() || this.field3482.field6790 != null;
            if (this.field3469 != null) {
                class222.method1406(this.field3469, super.field4042, super.field4052, false, super.field4047, var3);
            } else {
                this.field3469 = class333.method1966(super.field4042, 16, super.field4052, var3, super.field4047);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)Z")
    public final boolean method219(int arg0) {
        ++field3481;
        int var2 = -103 / ((arg0 - 28) / 40);
        return this.field3482.method2810(256);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILr;)Lcr;")
    public final class533 method214(int arg0, class166 arg1) {
        ++field3470;
        int var3 = 105 / ((81 - arg0) / 43);
        return this.field3469;
    }

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "(B)V")
    public static final void method1572(byte arg0) {
        ++field3480;
        if (arg0 != -32) {
            field3490 = -3;
        }
        class110.method792();
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)I")
    public final int method213(byte arg0) {
        if (arg0 < 39) {
            this.method219(8);
        }
        ++field3479;
        return this.field3482.field6804;
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(B)Z")
    public final boolean method209(byte arg0) {
        ++field3488;
        int var2 = -17 % ((arg0 - 31) / 42);
        return this.field3474;
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)I")
    public final int method217(int arg0) {
        if (arg0 <= 29) {
            return 96;
        } else {
            ++field3484;
            return this.field3482.method2806(-107);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIILr;)Z")
    public final boolean method224(int arg0, int arg1, int arg2, class166 arg3) {
        ++field3476;
        class55 var5 = this.field3482.method2804(false, -57, 131072, arg3, false);
        if (var5 == null) {
            return false;
        } else {
            if (arg1 != 0) {
                this.field3482 = null;
            }
            class392 var6 = arg3.method166();
            var6.method689(super.field4697 + super.field4042, super.field4052, super.field4696 + super.field4047);
            return class340.field4563 ? var5.method419(arg2, arg0, var6, false, class22.field250) : var5.method448(arg2, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)I")
    public final int method226(int arg0) {
        ++field3486;
        if (arg0 != 6329) {
            this.field3469 = null;
        }
        return this.field3482.method2802(0);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)I")
    public final int method222(boolean arg0) {
        if (!arg0) {
            return 51;
        } else {
            ++field3478;
            return this.field3482.field6799;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lr;I)V")
    public final void method225(class166 arg0, int arg1) {
        this.field3482.method2801(arg0, (byte) -121);
        ++field3492;
        if (arg1 != -32013) {
            this.field3489 = false;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lr;Z)V")
    public final void method220(class166 arg0, boolean arg1) {
        ++field3471;
        class55 var3 = this.field3482.method2804(arg1, -41, 262144, arg0, false);
        if (var3 != null) {
            int var4 = super.field4042 >> 9;
            int var5 = super.field4047 >> 9;
            class392 var6 = arg0.method166();
            var6.method689(super.field4042, super.field4052, super.field4047);
            this.field3482.method2803(false, var5, var3, arg0, var4, var4, var6, var5, !arg1);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLr;)V")
    public final void method210(byte arg0, class166 arg1) {
        ++field3491;
        this.field3482.method2805(arg1, -110);
        if (arg0 != 12) {
            this.method216(false);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1573(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field3485;
        if (~arg6 <= -513 && ~arg4 <= -513 && arg6 <= (class401.field5620 - 2) * 512 && (class257.field3508 + -2) * 512 >= arg4) {
            int var10 = class249.method1533(arg0, arg4, arg6, 122) - arg2;
            class250.field3403.method687(arg5, arg7, 0);
            class334.field4506.method93(class250.field3403);
            class334.field4506.method155(arg6, var10, arg4, class431.field6023);
            class250.field3403.method687(-arg5, 0, 0);
            class334.field4506.method93(class250.field3403);
        } else {
            class431.field6023[0] = class431.field6023[1] = -1;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public final void method208(int arg0) {
        if (arg0 != -18279) {
            method1573(29, 41, -111, -15, -11, 9, -71, -2, 91, -28);
        }
        ++field3483;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lr;Ljs;IIIIIZIIIII)V")
    public class255(class166 arg0, class301 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field3482 = new class500(arg0, arg1, arg10, arg11, super.field4053, arg3, this, arg7, arg12);
        this.field3489 = ~arg1.field4164 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)I")
    public final int method211(byte arg0) {
        int var2 = -9 % ((arg0 - 38) / 41);
        ++field3473;
        return this.field3482.field6800;
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Z)Z")
    public final boolean method216(boolean arg0) {
        if (!arg0) {
            field3490 = -46;
        }
        ++field3472;
        return false;
    }
}
