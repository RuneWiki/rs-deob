import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class226 extends class100 implements class448 {

    @OriginalMember(owner = "client!jg", name = "D", descriptor = "Lpm;")
    public class415 field3031;

    @OriginalMember(owner = "client!jg", name = "I", descriptor = "Z")
    private boolean field3036;

    @OriginalMember(owner = "client!jg", name = "J", descriptor = "Lhn;")
    public static class509 field3037 = new class509(200);

    @OriginalMember(owner = "client!jg", name = "O", descriptor = "I")
    public static int field3041 = 0;

    @OriginalMember(owner = "client!jg", name = "U", descriptor = "Lwc;")
    public static class49 field3047 = new class49();

    @OriginalMember(owner = "client!jg", name = "E", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!jg", name = "F", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!jg", name = "G", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!jg", name = "H", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!jg", name = "K", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!jg", name = "L", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!jg", name = "M", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!jg", name = "P", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!jg", name = "Q", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!jg", name = "R", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!jg", name = "T", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!jg", name = "V", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!jg", name = "W", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)I")
    public final int method46(int arg0) {
        int var2 = 27 / ((arg0 - -18) / 42);
        ++field3039;
        return this.field3031.field5938;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Lza;Ler;IIIIIZIIIIII)V")
    public class226(class287 arg0, class70 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class337.method1965(55, arg11, arg12));
        this.field3031 = new class415(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field3036 = arg1.field886 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILza;BI)Z")
    public final boolean method37(int arg0, class287 arg1, byte arg2, int arg3) {
        ++field3043;
        class373 var5 = this.field3031.method2544(super.field1370, super.field1366, arg1, false, (byte) 6, false, 131072);
        if (var5 == null) {
            return false;
        } else {
            class124 var6 = arg1.method1183();
            if (arg2 > -64) {
                field3041 = 120;
            }
            var6.method743(super.field1375 + super.field1366, super.field1371, super.field1370 + super.field1368);
            return var5.method2026(arg3, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(BLza;)V")
    public final void method36(byte arg0, class287 arg1) {
        if (arg0 <= -120) {
            ++field3042;
            class373 var3 = this.field3031.method2544(super.field1370, super.field1366, arg1, true, (byte) 6, false, 262144);
            if (var3 != null) {
                int var4 = super.field1366 >> 7;
                int var5 = super.field1370 >> 7;
                this.field3031.method2536(var3, var4, false, var4, var5, arg1, var5, false);
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ljk;III)V")
    public static final void method1448(class450 arg0, int arg1, int arg2, int arg3) {
        ++field3048;
        if (arg0 != null) {
            if (arg0.field6593 != null) {
                class293 var4 = new class293();
                var4.field3866 = arg0.field6593;
                var4.field3877 = arg0;
                class432.method2657(var4);
            }
            class519.field7656 = arg0.field6558;
            class273.field3644 = arg0.field6661;
            class207.field2724 = arg0.field6614;
            class324.field4307 = arg3;
            class41.field448 = arg2;
            class323.field4302 = true;
            class256.field3403 = arg0.field6650;
            class235.field3143 = arg0.field6703;
            if (arg1 < 67) {
                method1448((class450) null, 24, 65, -45);
            }
            class413.method2521(arg0, false);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILza;)V")
    public final void method44(int arg0, class287 arg1) {
        this.field3031.method2549(1, arg1);
        if (arg0 < 122) {
            field3047 = null;
        }
        ++field3038;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)I")
    public final int method48(byte arg0) {
        ++field3046;
        return arg0 != -70 ? -71 : this.field3031.field5977;
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(Z)V")
    public static void method1449(boolean arg0) {
        field3047 = null;
        field3037 = null;
        if (arg0) {
            field3037 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public final void method45(int arg0) {
        if (arg0 != 9479) {
            this.method48((byte) -73);
        }
        ++field3035;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)Z")
    public final boolean method38(byte arg0) {
        if (arg0 != -89) {
            this.method44(63, (class287) null);
        }
        ++field3040;
        return this.field3031.method2545(11802);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZIII)V")
    public static final void method1450(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        ++field3045;
        for (class325 var5 = (class325) class282.field3740.method970(12); var5 != null; var5 = (class325) class282.field3740.method976((byte) 100)) {
            class431.method2645(arg2, arg0, -127, arg4, arg3, var5);
        }
        for (class325 var6 = (class325) class193.field2491.method970(12); var6 != null; var6 = (class325) class193.field2491.method976((byte) -28)) {
            byte var11 = 1;
            class306 var12 = var6.field4312.method547((byte) 117);
            if (!var6.field4312.field1176) {
                if (var6.field4312.field1216 != var12.field4083 && var6.field4312.field1216 != var12.field4076 && ~var6.field4312.field1216 != ~var12.field4100 && ~var6.field4312.field1216 != ~var12.field4068) {
                    if (var6.field4312.field1216 == var12.field4093 || var6.field4312.field1216 == var12.field4071 || var6.field4312.field1216 == var12.field4056 || ~var6.field4312.field1216 == ~var12.field4087) {
                        var11 = 3;
                    }
                } else {
                    var11 = 2;
                }
            } else {
                var11 = 0;
            }
            if (var6.field4322 != var11) {
                int var13 = class294.method1769(var6.field4312, true);
                if (~var6.field4320 != ~var13) {
                    if (var6.field4314 != null) {
                        class465.field6928.method1114(var6.field4314);
                        var6.field4314 = null;
                    }
                    var6.field4320 = var13;
                }
                var6.field4322 = var11;
            }
            var6.field4313 = var6.field4312.field3704;
            var6.field4308 = var6.field4312.field3704 + (var6.field4312.method546(24273) << 6);
            var6.field4309 = var6.field4312.field3694;
            var6.field4327 = var6.field4312.field3694 - -(var6.field4312.method546(24273) << 6);
            class431.method2645(arg2, arg0, -123, arg4, arg3, var6);
        }
        for (class325 var7 = (class325) class264.field3548.method300((byte) -94); var7 != null; var7 = (class325) class264.field3548.method301(-126)) {
            byte var8 = 1;
            class306 var9 = var7.field4326.method547((byte) 117);
            if (var7.field4326.field1176) {
                var8 = 0;
            } else if (var7.field4326.field1216 != var9.field4083 && ~var7.field4326.field1216 != ~var9.field4076 && var7.field4326.field1216 != var9.field4100 && ~var7.field4326.field1216 != ~var9.field4068) {
                if (~var7.field4326.field1216 == ~var9.field4093 || var7.field4326.field1216 == var9.field4071 || var7.field4326.field1216 == var9.field4056 || var7.field4326.field1216 == var9.field4087) {
                    var8 = 3;
                }
            } else {
                var8 = 2;
            }
            if (~var7.field4322 != ~var8) {
                int var10 = class98.method566(124, var7.field4326);
                if (~var7.field4320 != ~var10) {
                    if (var7.field4314 != null) {
                        class465.field6928.method1114(var7.field4314);
                        var7.field4314 = null;
                    }
                    var7.field4320 = var10;
                }
                var7.field4322 = var8;
            }
            var7.field4313 = var7.field4326.field3704;
            var7.field4308 = var7.field4326.field3704 + (var7.field4326.method546(24273) << 6);
            var7.field4309 = var7.field4326.field3694;
            var7.field4327 = var7.field4326.field3694 - -(var7.field4326.method546(24273) << 6);
            class431.method2645(arg2, arg0, -127, arg4, arg3, var7);
        }
        if (!arg1) {
            method1448((class450) null, -36, 76, 9);
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)I")
    public final int method47(int arg0) {
        if (arg0 != -15774) {
            return 33;
        } else {
            ++field3044;
            return this.field3031.field5949;
        }
    }

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "(I)I")
    public final int method614(int arg0) {
        if (arg0 < 54) {
            field3037 = null;
        }
        ++field3033;
        return this.field3031.method2535((byte) 126);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBLza;)Le;")
    public final class373 method39(int arg0, byte arg1, class287 arg2) {
        ++field3032;
        return arg1 != -54 ? null : this.field3031.method2544(0, 0, arg2, false, (byte) 6, false, arg0);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLza;)V")
    public final void method49(byte arg0, class287 arg1) {
        ++field3034;
        this.field3031.method2534((byte) 124, arg1);
        if (arg0 != -56) {
            field3041 = -127;
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(BLza;)Luc;")
    public final class23 method50(byte arg0, class287 arg1) {
        ++field3049;
        class373 var3 = this.field3031.method2544(super.field1370, super.field1366, arg1, true, (byte) 6, false, 2048);
        if (var3 == null) {
            return null;
        } else {
            class124 var4 = arg1.method1183();
            var4.method743(super.field1375 + super.field1366, super.field1371, super.field1370 + super.field1368);
            class23 var5 = null;
            if (this.field3036) {
                var5 = class117.method703(1, 56);
            }
            if (this.field3031.field5954 != null) {
                class336 var6 = this.field3031.field5954.method257();
                arg1.method1203(var3, var6, var4, var5 == null ? null : var5.field226[0], 0);
            } else {
                var3.method2051(var4, var5 == null ? null : var5.field226[0], 0);
            }
            int var7 = super.field1366 >> 7;
            if (arg0 != -112) {
                return null;
            } else {
                int var8 = super.field1370 >> 7;
                this.field3031.method2536(var3, var7, false, var7, var8, arg1, var8, true);
                return var5;
            }
        }
    }
}
