import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class314 extends class217 implements class649 {

    @OriginalMember(owner = "client!qca", name = "R", descriptor = "Z")
    private boolean field4041 = false;

    @OriginalMember(owner = "client!qca", name = "M", descriptor = "Lmt;")
    public class410 field4036;

    @OriginalMember(owner = "client!qca", name = "fb", descriptor = "Z")
    private boolean field4053;

    @OriginalMember(owner = "client!qca", name = "cb", descriptor = "I")
    public static int field4050 = 1;

    @OriginalMember(owner = "client!qca", name = "kb", descriptor = "I")
    public static int field4058 = -1;

    @OriginalMember(owner = "client!qca", name = "ib", descriptor = "I")
    public static int field4056 = 0;

    @OriginalMember(owner = "client!qca", name = "J", descriptor = "Ldm;")
    public static class98 field4033 = new class98();

    @OriginalMember(owner = "client!qca", name = "K", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!qca", name = "L", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!qca", name = "N", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!qca", name = "O", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!qca", name = "P", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!qca", name = "Q", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!qca", name = "T", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!qca", name = "V", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!qca", name = "X", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!qca", name = "Y", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!qca", name = "Z", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!qca", name = "ab", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!qca", name = "bb", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!qca", name = "db", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!qca", name = "eb", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!qca", name = "gb", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!qca", name = "hb", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!qca", name = "jb", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!qca", name = "lb", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!qca", name = "mb", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!qca", name = "W", descriptor = "Lgp;")
    private class551 field4044;

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "(I)I")
    public final int method275(int arg0) {
        ++field4046;
        if (arg0 != 24263) {
            this.method268(-27);
        }
        return this.field4036.field5711;
    }

    @OriginalMember(owner = "client!qca", name = "e", descriptor = "(B)V")
    public final void method380(byte arg0) {
        int var2 = 112 / ((-45 - arg0) / 42);
        ++field4034;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "(I)I")
    public final int method276(int arg0) {
        if (arg0 != -25963) {
            return -53;
        } else {
            ++field4040;
            return this.field4036.field5709;
        }
    }

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "(ILha;)V")
    public final void method271(int arg0, class545 arg1) {
        ++field4038;
        class283 var3 = this.field4036.method2500(262144, true, true, (byte) -28, arg1);
        if (var3 != null) {
            int var4 = super.field9490 >> 9;
            int var5 = super.field9489 >> 9;
            class723 var6 = arg1.method2087();
            var6.method848(super.field9490, super.field9502, super.field9489);
            this.field4036.method2505(var4, var3, (byte) 14, var4, false, var5, var5, arg1, var6);
        }
        int var7 = 61 % ((-15 - arg0) / 57);
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Lha;III)Z")
    public final boolean method273(class545 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -1) {
            return true;
        } else {
            ++field4052;
            class283 var5 = this.field4036.method2500(131072, false, false, (byte) -28, arg0);
            if (var5 == null) {
                return false;
            } else {
                class723 var6 = arg0.method2087();
                var6.method848(super.field9490, super.field9502, super.field9489);
                return !class286.field3774 ? var5.method1155(arg1, arg2, var6, false, 0) : var5.method1151(arg1, arg2, var6, false, 0, class527.field7375);
            }
        }
    }

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "(ILha;)Lgp;")
    public final class551 method274(int arg0, class545 arg1) {
        if (arg0 != 0) {
            this.field4036 = null;
        }
        ++field4043;
        return this.field4044;
    }

    @OriginalMember(owner = "client!qca", name = "g", descriptor = "(I)I")
    public final int method282(int arg0) {
        if (arg0 != -1) {
            this.field4044 = null;
        }
        ++field4054;
        return this.field4036.method2498((byte) -67);
    }

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "(Lha;I)Ljl;")
    public final class596 method278(class545 arg0, int arg1) {
        ++field4035;
        class283 var3 = this.field4036.method2500(2048, true, false, (byte) -28, arg0);
        if (var3 == null) {
            return null;
        } else {
            class723 var4 = arg0.method2087();
            var4.method848(super.field9490, super.field9502, super.field9489);
            class596 var5 = class589.method3502(1, this.field4053, 0);
            int var6 = super.field9490 >> 9;
            int var7 = super.field9489 >> 9;
            this.field4036.method2505(var6, var3, (byte) 14, var6, true, var7, var7, arg0, var4);
            if (!class286.field3774) {
                var3.method1168(var4, var5.field8579[0], 0);
            } else {
                var3.method1164(var4, var5.field8579[0], class527.field7375, 0);
            }
            if (arg1 != 2274) {
                this.field4041 = false;
            }
            if (this.field4036.field5705 != null) {
                class347 var8 = this.field4036.field5705.method1347();
                if (class286.field3774) {
                    arg0.method2112(var8, class527.field7375);
                } else {
                    arg0.method2122(var8);
                }
            }
            this.field4041 = var3.method1130() || this.field4036.field5705 != null;
            if (this.field4044 == null) {
                this.field4044 = class477.method2821(-1, super.field9489, var3, super.field9502, super.field9490);
            } else {
                class111.method747(34165, var3, super.field9489, super.field9502, super.field9490, this.field4044);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!qca", name = "m", descriptor = "(I)V")
    public static void method1826(int arg0) {
        if (arg0 < 57) {
            field4033 = null;
        }
        field4033 = null;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Z)Z")
    public final boolean method281(boolean arg0) {
        if (!arg0) {
            this.field4041 = true;
        }
        ++field4057;
        return this.field4036.method2508(true);
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Lha;I)V")
    public final void method270(class545 arg0, int arg1) {
        ++field4042;
        this.field4036.method2507(arg1 ^ -26414, arg0);
        if (arg1 != -6060) {
            field4033 = null;
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(ILha;)V")
    public final void method272(int arg0, class545 arg1) {
        this.field4036.method2504(arg1, -112);
        ++field4048;
        if (arg0 != 24139) {
            this.method268(7);
        }
    }

    @OriginalMember(owner = "client!qca", name = "j", descriptor = "(I)Z")
    public final boolean method277(int arg0) {
        ++field4039;
        return arg0 != 3;
    }

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "(B)Z")
    public final boolean method373(byte arg0) {
        ++field4047;
        return arg0 != -57;
    }

    @OriginalMember(owner = "client!qca", name = "f", descriptor = "(I)I")
    public final int method268(int arg0) {
        if (arg0 != -1) {
            this.method283((byte) -36);
        }
        ++field4055;
        return this.field4036.method2509(107);
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(B)V")
    public final void method279(byte arg0) {
        ++field4051;
        if (arg0 >= -4) {
            this.field4053 = false;
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)I")
    public final int method269(int arg0) {
        ++field4037;
        if (arg0 != -17174) {
            this.field4036 = null;
        }
        return this.field4036.field5722;
    }

    @OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Lha;Lkha;IIIIIZIII)V")
    public class314(class545 arg0, class30 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class753.method4172(arg8, -2, arg9));
        this.field4036 = new class410(arg0, arg1, arg8, arg9, super.field9501, arg3, this, arg7, arg10);
        this.field4053 = ~arg1.field467 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!qca", name = "n", descriptor = "(I)V")
    public static final void method1827(int arg0) {
        ++field4045;
        if (class175.field2390 != null) {
            if (~class175.field2390.field5975 == -2) {
                class175.field2390 = null;
                return;
            }
            if (class175.field2390.field5975 == 2) {
                class550.method3289(arg0 + 2, 2, class599.field8599, class670.field9425);
                class175.field2390 = null;
                return;
            }
        }
        if (arg0 != -2) {
            field4059 = 58;
        }
    }

    @OriginalMember(owner = "client!qca", name = "d", descriptor = "(B)Z")
    public final boolean method283(byte arg0) {
        ++field4049;
        if (arg0 > -33) {
            this.method268(54);
        }
        return this.field4041;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(IBZILha;ILig;)V")
    public final void method365(int arg0, byte arg1, boolean arg2, int arg3, class545 arg4, int arg5, class674 arg6) {
        ++field4060;
        if (arg1 > 76) {
            throw new IllegalStateException();
        }
    }
}
