import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class540 extends class210 implements class526 {

    @OriginalMember(owner = "client!pf", name = "U", descriptor = "Z")
    private boolean field7286 = false;

    @OriginalMember(owner = "client!pf", name = "X", descriptor = "Lvi;")
    public class500 field7289;

    @OriginalMember(owner = "client!pf", name = "bb", descriptor = "Z")
    private boolean field7293;

    @OriginalMember(owner = "client!pf", name = "eb", descriptor = "Z")
    public static boolean field7296 = false;

    @OriginalMember(owner = "client!pf", name = "nb", descriptor = "I")
    public static int field7305 = 0;

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "I")
    public static int field7282;

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "I")
    public static int field7283;

    @OriginalMember(owner = "client!pf", name = "S", descriptor = "I")
    public static int field7284;

    @OriginalMember(owner = "client!pf", name = "V", descriptor = "I")
    public static int field7287;

    @OriginalMember(owner = "client!pf", name = "W", descriptor = "I")
    public static int field7288;

    @OriginalMember(owner = "client!pf", name = "Y", descriptor = "I")
    public static int field7290;

    @OriginalMember(owner = "client!pf", name = "Z", descriptor = "I")
    public static int field7291;

    @OriginalMember(owner = "client!pf", name = "ab", descriptor = "I")
    public static int field7292;

    @OriginalMember(owner = "client!pf", name = "cb", descriptor = "I")
    public static int field7294;

    @OriginalMember(owner = "client!pf", name = "db", descriptor = "I")
    public static int field7295;

    @OriginalMember(owner = "client!pf", name = "fb", descriptor = "I")
    public static int field7297;

    @OriginalMember(owner = "client!pf", name = "gb", descriptor = "I")
    public static int field7298;

    @OriginalMember(owner = "client!pf", name = "hb", descriptor = "I")
    public static int field7299;

    @OriginalMember(owner = "client!pf", name = "ib", descriptor = "I")
    public static int field7300;

    @OriginalMember(owner = "client!pf", name = "jb", descriptor = "I")
    public static int field7301;

    @OriginalMember(owner = "client!pf", name = "kb", descriptor = "I")
    public static int field7302;

    @OriginalMember(owner = "client!pf", name = "lb", descriptor = "I")
    public static int field7303;

    @OriginalMember(owner = "client!pf", name = "ob", descriptor = "I")
    public static int field7306;

    @OriginalMember(owner = "client!pf", name = "T", descriptor = "Lcr;")
    private class533 field7285;

    @OriginalMember(owner = "client!pf", name = "mb", descriptor = "Ljava/lang/Object;")
    public static Object field7304;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)I")
    public final int method211(byte arg0) {
        int var2 = -33 % ((38 - arg0) / 41);
        ++field7297;
        return this.field7289.field6800;
    }

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "(I)Z")
    public final boolean method215(int arg0) {
        if (arg0 < 49) {
            field7305 = -110;
        }
        ++field7288;
        return false;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILr;)Lcr;")
    public final class533 method214(int arg0, class166 arg1) {
        int var3 = -53 % ((arg0 - 81) / 43);
        ++field7302;
        return this.field7285;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lr;Z)V")
    public final void method220(class166 arg0, boolean arg1) {
        ++field7291;
        class55 var3 = this.field7289.method2804(arg1, -63, 262144, arg0, true);
        if (var3 != null) {
            class392 var4 = arg0.method166();
            var4.method689(super.field4042, super.field4052, super.field4047);
            this.field7289.method2803(false, super.field2963, var3, arg0, super.field2973, super.field2972, var4, super.field2969, false);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIILr;)Z")
    public final boolean method224(int arg0, int arg1, int arg2, class166 arg3) {
        ++field7284;
        class55 var5 = this.field7289.method2804(false, -113, 131072, arg3, false);
        if (var5 == null) {
            return false;
        } else {
            class392 var6 = arg3.method166();
            var6.method689(super.field4042, super.field4052, super.field4047);
            if (arg1 != 0) {
                method3050((byte) 70);
            }
            return !class340.field4563 ? var5.method448(arg2, arg0, var6, false) : var5.method419(arg2, arg0, var6, false, class22.field250);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lvv;IIZLr;II)V")
    public final void method223(class295 arg0, int arg1, int arg2, boolean arg3, class166 arg4, int arg5, int arg6) {
        if (arg6 == 0) {
            ++field7294;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "(I)I")
    public final int method217(int arg0) {
        ++field7290;
        if (arg0 < 29) {
            field7305 = -110;
        }
        return this.field7289.method2806(-115);
    }

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "(B)V")
    public static void method3050(byte arg0) {
        field7304 = null;
        int var1 = -69 % ((arg0 - -19) / 49);
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)I")
    public final int method226(int arg0) {
        if (arg0 != 6329) {
            this.method220((class166) null, true);
        }
        ++field7298;
        return this.field7289.method2802(0);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)I")
    public final int method222(boolean arg0) {
        ++field7300;
        if (!arg0) {
            this.method214(96, (class166) null);
        }
        return this.field7289.field6799;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lr;I)V")
    public final void method225(class166 arg0, int arg1) {
        ++field7303;
        this.field7289.method2801(arg0, (byte) -128);
        if (arg1 != -32013) {
            this.method221((class166) null, 116);
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lr;Ljs;IIIIIZIIIIIII)V")
    public class540(class166 arg0, class301 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field4110 == 1, class553.method3101(arg13, arg12, 0));
        this.field7289 = new class500(arg0, arg1, arg12, arg13, super.field4053, arg3, this, arg7, arg14);
        this.field7293 = arg1.field4164 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "(I)V")
    public final void method227(int arg0) {
        ++field7287;
        if (arg0 >= -115) {
            field7296 = true;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(Lr;I)Lbca;")
    public final class614 method221(class166 arg0, int arg1) {
        if (arg1 != -5) {
            return null;
        } else {
            ++field7301;
            class55 var3 = this.field7289.method2804(true, arg1 + -67, 2048, arg0, false);
            if (var3 == null) {
                return null;
            } else {
                class392 var4 = arg0.method166();
                var4.method689(super.field4042, super.field4052, super.field4047);
                class614 var5 = null;
                if (this.field7293) {
                    var5 = class524.method2987(6257, 1);
                }
                this.field7289.method2803(true, super.field2963, var3, arg0, super.field2973, super.field2972, var4, super.field2969, false);
                if (class340.field4563) {
                    var3.method453(var4, var5 != null ? var5.field8572[0] : null, class22.field250, 0);
                } else {
                    var3.method465(var4, var5 != null ? var5.field8572[0] : null, 0);
                }
                if (this.field7289.field6790 != null) {
                    class472 var6 = this.field7289.field6790.method3598();
                    if (!class340.field4563) {
                        arg0.method163(var6);
                    } else {
                        arg0.method167(var6, class22.field250);
                    }
                }
                this.field7286 = var3.method430() || this.field7289.field6790 != null;
                if (this.field7285 == null) {
                    this.field7285 = class333.method1966(super.field4042, 16, super.field4052, var3, super.field4047);
                } else {
                    class222.method1406(this.field7285, super.field4042, super.field4052, false, super.field4047, var3);
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)Z")
    public final boolean method219(int arg0) {
        ++field7292;
        int var2 = 75 / ((arg0 - 28) / 40);
        return this.field7289.method2810(256);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public final void method208(int arg0) {
        if (arg0 != -18279) {
            field7305 = -94;
        }
        ++field7283;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)I")
    public final int method213(byte arg0) {
        if (arg0 < 39) {
            return 41;
        } else {
            ++field7306;
            return this.field7289.field6804;
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(Z)Z")
    public final boolean method216(boolean arg0) {
        ++field7282;
        return !arg0 ? false : false;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLr;)V")
    public final void method210(byte arg0, class166 arg1) {
        if (arg0 == 12) {
            ++field7299;
            this.field7289.method2805(arg1, -106);
        }
    }

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "(B)Z")
    public final boolean method209(byte arg0) {
        int var2 = -51 % ((31 - arg0) / 42);
        ++field7295;
        return this.field7286;
    }
}
