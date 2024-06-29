import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class223 extends class389 implements class164 {

    @OriginalMember(owner = "client!on", name = "R", descriptor = "Lgp;")
    public class36 field3663;

    @OriginalMember(owner = "client!on", name = "K", descriptor = "Z")
    private boolean field3657;

    @OriginalMember(owner = "client!on", name = "I", descriptor = "Lob;")
    public static class521 field3655 = new class521(36, 3);

    @OriginalMember(owner = "client!on", name = "u", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!on", name = "v", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!on", name = "w", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!on", name = "x", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!on", name = "y", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!on", name = "z", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!on", name = "A", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!on", name = "B", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!on", name = "C", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!on", name = "D", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!on", name = "E", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!on", name = "F", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!on", name = "G", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!on", name = "H", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!on", name = "J", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!on", name = "L", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!on", name = "M", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!on", name = "N", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!on", name = "O", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!on", name = "Q", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lga;BLul;)V", line = 12)
    public static final void method1593(class279 arg0, byte arg1, class406 arg2) {
        class172.field2560 = arg0;
        ++field3650;
        if (arg1 != -17) {
            method1593((class279) null, (byte) 75, (class406) null);
        }
        class224.field3665 = arg2;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)V", line = 24)
    public final void method21(boolean arg0) {
        if (arg0) {
            this.method614(-2);
        }
        ++field3654;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!on", name = "f", descriptor = "(I)Z", line = 36)
    public final boolean method17(int arg0) {
        ++field3662;
        return arg0 != 13651334 ? false : false;
    }

    @OriginalMember(owner = "client!on", name = "d", descriptor = "(I)Z", line = 47)
    public final boolean method614(int arg0) {
        ++field3652;
        if (arg0 != -1086) {
            this.field3663 = null;
        }
        return this.field3663.method240(13227);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)I", line = 58)
    public final int method621(int arg0) {
        if (arg0 != 3021) {
            this.method619(true, (class38) null);
        }
        ++field3645;
        return this.field3663.field416;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(B)I", line = 72)
    public final int method624(byte arg0) {
        ++field3646;
        return arg0 >= -119 ? 77 : this.field3663.field405;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ZLya;)V", line = 83)
    public final void method619(boolean arg0, class38 arg1) {
        ++field3647;
        this.field3663.method245(arg1, 53);
        if (!arg0) {
            this.method614(-64);
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V", line = 94)
    public final void method616(int arg0) {
        ++field3659;
        if (arg0 != 23504) {
            this.method621(-128);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(III)V", line = 104)
    public static final void method1594(int arg0, int arg1, int arg2) {
        ++field3643;
        class211 var3 = class452.method2749(arg1, 127, arg0);
        var3.method1463(0);
        var3.field3441 = arg2;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ILya;)V", line = 116)
    public final void method623(int arg0, class38 arg1) {
        this.field3663.method251(arg1, 1);
        if (arg0 > 125) {
            ++field3656;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(BLya;II)Z", line = 130)
    public final boolean method27(byte arg0, class38 arg1, int arg2, int arg3) {
        if (arg0 >= -119) {
            this.method17(66);
        }
        ++field3641;
        class475 var5 = this.field3663.method249(super.field5837, super.field5833, 131072, false, arg1, (byte) -120, false);
        if (var5 == null) {
            return false;
        } else {
            class125 var6 = arg1.method296();
            var6.method206(super.field5837, super.field5831, super.field5833);
            return var5.method440(arg3, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!on", name = "g", descriptor = "(I)I", line = 149)
    public final int method24(int arg0) {
        if (arg0 != -867749273) {
            this.method624((byte) -126);
        }
        ++field3658;
        return this.field3663.method242((byte) 78);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lya;I)Lag;", line = 160)
    public final class484 method29(class38 arg0, int arg1) {
        if (arg1 <= 22) {
            this.method23(65, -92, (class38) null, -13, (class455) null, 89, false);
        }
        ++field3642;
        class475 var3 = this.field3663.method249(super.field5837, super.field5833, 2048, true, arg0, (byte) -77, false);
        if (var3 == null) {
            return null;
        } else {
            class125 var4 = arg0.method296();
            var4.method206(super.field5837, super.field5831, super.field5833);
            class484 var5 = null;
            if (this.field3657) {
                var5 = class133.method971(1, 0);
            }
            if (this.field3663.field406 == null) {
                var3.method439(var4, var5 == null ? null : var5.field6964[0], 0);
            } else {
                class341 var6 = this.field3663.field406.method2221();
                arg0.method311(var3, var6, var4, var5 == null ? null : var5.field6964[0], 0);
            }
            this.field3663.method243(arg0, super.field5827, super.field5829, var3, true, super.field5836, -23689, super.field5830);
            return var5;
        }
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lya;Ljt;IIIIIZIIIIIII)V", line = 197)
    public class223(class38 arg0, class69 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field953 == -2, class95.method772(arg12, (byte) -61, arg13));
        this.field3663 = new class36(arg0, arg1, arg12, arg13, super.field5826, arg3, arg4, arg6, arg7, arg14);
        this.field3657 = arg1.field922 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!on", name = "h", descriptor = "(I)V", line = 207)
    public static void method1595(int arg0) {
        if (arg0 != 1) {
            field3661 = -119;
        }
        field3655 = null;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IILya;ILor;IZ)V", line = 217)
    public final void method23(int arg0, int arg1, class38 arg2, int arg3, class455 arg4, int arg5, boolean arg6) {
        ++field3653;
        if (arg0 == 3) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lya;Z)V", line = 233)
    public final void method25(class38 arg0, boolean arg1) {
        ++field3660;
        class475 var3 = this.field3663.method249(super.field5837, super.field5833, 262144, true, arg0, (byte) -82, true);
        if (arg1) {
            method1595(-90);
        }
        if (var3 != null) {
            this.field3663.method243(arg0, super.field5827, super.field5829, var3, false, super.field5836, -23689, super.field5830);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(FFFZ)I", line = 248)
    public static final int method1596(float arg0, float arg1, float arg2, boolean arg3) {
        ++field3644;
        float var4 = !(arg2 < 0.0F) ? arg2 : -arg2;
        float var5 = arg0 < 0.0F ? -arg0 : arg0;
        float var6 = !(arg1 < 0.0F) ? arg1 : -arg1;
        if (arg3) {
            field3661 = -50;
        }
        if (var5 > var4 && var5 > var6) {
            return arg0 > 0.0F ? 0 : 1;
        } else if (var4 < var6 && var6 > var5) {
            return arg1 > 0.0F ? 2 : 3;
        } else {
            return arg2 > 0.0F ? 4 : 5;
        }
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(I)I", line = 291)
    public final int method627(int arg0) {
        if (arg0 != 23326) {
            method1594(-84, 38, 101);
        }
        ++field3649;
        return this.field3663.field427;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Lya;ZI)Lt;", line = 304)
    public final class475 method615(class38 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method619(true, (class38) null);
        }
        ++field3648;
        return this.field3663.method249(0, 0, arg2, false, arg0, (byte) -59, false);
    }
}
