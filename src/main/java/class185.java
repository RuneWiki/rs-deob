import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class185 extends class279 implements class448 {

    @OriginalMember(owner = "client!mm", name = "T", descriptor = "Lpm;")
    public class415 field2412;

    @OriginalMember(owner = "client!mm", name = "W", descriptor = "Z")
    private boolean field2415;

    @OriginalMember(owner = "client!mm", name = "J", descriptor = "Lho;")
    public static class103 field2402 = new class103(29, 3);

    @OriginalMember(owner = "client!mm", name = "Q", descriptor = "[I")
    public static int[] field2409 = new int[13];

    @OriginalMember(owner = "client!mm", name = "Z", descriptor = "Lwq;")
    public static class115 field2418 = new class115(10, 18);

    @OriginalMember(owner = "client!mm", name = "ab", descriptor = "[Ljava/lang/String;")
    public static String[] field2419 = new String[8];

    @OriginalMember(owner = "client!mm", name = "G", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!mm", name = "H", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!mm", name = "I", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!mm", name = "K", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!mm", name = "L", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!mm", name = "M", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!mm", name = "N", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!mm", name = "O", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!mm", name = "P", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!mm", name = "R", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!mm", name = "S", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!mm", name = "U", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!mm", name = "V", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!mm", name = "X", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!mm", name = "Y", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(B)Z")
    public final boolean method38(byte arg0) {
        ++field2414;
        return arg0 != -89 ? true : this.field2412.method2545(11802);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)I")
    public final int method48(byte arg0) {
        ++field2399;
        return arg0 != -70 ? 72 : this.field2412.field5977;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BLza;)V")
    public final void method49(byte arg0, class287 arg1) {
        if (arg0 != -56) {
            this.method38((byte) -120);
        }
        ++field2403;
        this.field2412.method2534((byte) -13, arg1);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILza;)V")
    public final void method44(int arg0, class287 arg1) {
        this.field2412.method2549(1, arg1);
        ++field2411;
        if (arg0 <= 122) {
            this.method42((byte) 63);
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)I")
    public final int method47(int arg0) {
        ++field2413;
        if (arg0 != -15774) {
            field2418 = null;
        }
        return this.field2412.field5949;
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(B)Z")
    public final boolean method41(byte arg0) {
        ++field2416;
        if (arg0 != -62) {
            this.method50((byte) 76, (class287) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(Z)V")
    public static void method1076(boolean arg0) {
        field2409 = null;
        field2418 = null;
        field2419 = null;
        if (!arg0) {
            method1076(false);
        }
        field2402 = null;
    }

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "(I)I")
    public final int method132(int arg0) {
        if (arg0 >= -103) {
            this.method36((byte) 21, (class287) null);
        }
        ++field2417;
        return this.field2412.method2535((byte) 127);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
    public final void method45(int arg0) {
        if (arg0 != 9479) {
            method1076(true);
        }
        ++field2404;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IBLza;)Le;")
    public final class373 method39(int arg0, byte arg1, class287 arg2) {
        if (arg1 != -54) {
            field2419 = null;
        }
        ++field2407;
        return this.field2412.method2544(0, 0, arg2, false, (byte) 6, false, arg0);
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lza;Ler;IIIIIZIIIIIII)V")
    public class185(class287 arg0, class70 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field836 == 1, class262.method1614(arg13, arg12, (byte) 71));
        this.field2412 = new class415(arg0, arg1, arg12, arg13, super.field3695, arg3, arg4, arg6, arg7, arg14);
        this.field2415 = ~arg1.field886 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIZILot;Lza;)V")
    public final void method40(int arg0, int arg1, int arg2, boolean arg3, int arg4, class419 arg5, class287 arg6) {
        ++field2401;
        int var8 = -47 % ((arg0 - 61) / 47);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(BLza;)Luc;")
    public final class23 method50(byte arg0, class287 arg1) {
        ++field2406;
        class373 var3 = this.field2412.method2544(super.field3694, super.field3704, arg1, true, (byte) 6, false, 2048);
        if (var3 == null) {
            return null;
        } else {
            class124 var4 = arg1.method1183();
            var4.method743(super.field3704, super.field3700, super.field3694);
            class23 var5 = null;
            if (this.field2415) {
                var5 = class117.method703(1, 31);
            }
            if (this.field2412.field5954 != null) {
                class336 var6 = this.field2412.field5954.method257();
                arg1.method1203(var3, var6, var4, var5 == null ? null : var5.field226[0], 0);
            } else {
                var3.method2051(var4, var5 != null ? var5.field226[0] : null, 0);
            }
            this.field2412.method2536(var3, super.field3697, false, super.field3698, super.field3691, arg1, super.field3688, true);
            if (arg0 != -112) {
                this.method36((byte) -103, (class287) null);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "(B)V")
    public final void method42(byte arg0) {
        ++field2405;
        if (arg0 == 92) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(BLza;)V")
    public final void method36(byte arg0, class287 arg1) {
        if (arg0 <= -120) {
            ++field2410;
            class373 var3 = this.field2412.method2544(super.field3694, super.field3704, arg1, true, (byte) 6, true, 262144);
            if (var3 != null) {
                this.field2412.method2536(var3, super.field3697, false, super.field3698, super.field3691, arg1, super.field3688, false);
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILza;BI)Z")
    public final boolean method37(int arg0, class287 arg1, byte arg2, int arg3) {
        ++field2408;
        class373 var5 = this.field2412.method2544(super.field3694, super.field3704, arg1, false, (byte) 6, false, 131072);
        if (var5 == null) {
            return false;
        } else {
            if (arg2 > -64) {
                this.method45(-47);
            }
            class124 var6 = arg1.method1183();
            var6.method743(super.field3704, super.field3700, super.field3694);
            return var5.method2026(arg3, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)I")
    public final int method46(int arg0) {
        int var2 = -23 % ((-18 - arg0) / 42);
        ++field2400;
        return this.field2412.field5938;
    }
}
