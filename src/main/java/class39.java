import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class39 extends class316 implements class18 {

    @OriginalMember(owner = "client!mn", name = "z", descriptor = "Lop;")
    public class262 field482;

    @OriginalMember(owner = "client!mn", name = "K", descriptor = "Z")
    private boolean field492;

    @OriginalMember(owner = "client!mn", name = "u", descriptor = "Z")
    public static boolean field477 = true;

    @OriginalMember(owner = "client!mn", name = "w", descriptor = "Lwl;")
    public static class452 field479 = new class452(53, -1);

    @OriginalMember(owner = "client!mn", name = "O", descriptor = "Lwl;")
    public static class452 field496 = new class452(99, 0);

    @OriginalMember(owner = "client!mn", name = "P", descriptor = "I")
    public static int field497 = 100;

    @OriginalMember(owner = "client!mn", name = "t", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!mn", name = "v", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!mn", name = "x", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!mn", name = "y", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!mn", name = "A", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!mn", name = "B", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!mn", name = "C", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!mn", name = "D", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!mn", name = "E", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!mn", name = "F", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!mn", name = "G", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!mn", name = "H", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!mn", name = "J", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!mn", name = "L", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!mn", name = "M", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!mn", name = "N", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!mn", name = "Q", descriptor = "[I")
    public static int[] field498;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Ldr;IB)Lwp;")
    public final class292 method12(class261 arg0, int arg1, byte arg2) {
        int var4 = 100 / ((46 - arg2) / 47);
        ++field487;
        return this.field482.method1630(0, false, false, arg0, 87, arg1, 0);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IILdr;I)Z")
    public final boolean method4(int arg0, int arg1, class261 arg2, int arg3) {
        ++field483;
        class292 var5 = this.field482.method1630(super.field4785, false, false, arg2, 95, 65536, super.field4778);
        if (arg3 != 2) {
            this.method12((class261) null, -25, (byte) 33);
        }
        if (var5 == null) {
            return false;
        } else {
            class361 var6 = arg2.method434();
            var6.method611(super.field4778, super.field4780, super.field4785);
            return var5.method1297(arg0, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "(I)V")
    public static void method223(int arg0) {
        if (arg0 != 99) {
            field497 = -65;
        }
        field498 = null;
        field496 = null;
        field479 = null;
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(Ldr;I)V")
    public final void method15(class261 arg0, int arg1) {
        ++field489;
        class292 var3 = this.field482.method1630(super.field4785, true, true, arg0, 102, 131072, super.field4778);
        if (arg1 < 114) {
            this.method3((byte) -41);
        }
        if (var3 != null) {
            this.field482.method1623(super.field4778 >> 7, super.field4778 >> 7, super.field4785 >> 7, var3, (byte) 105, super.field4785 >> 7, arg0, false);
        }
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Ldr;Lfq;IIIIIIZI)V")
    public class39(class261 arg0, class85 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        super(arg5, arg6, arg7, arg1.field1198, arg1.field1164);
        this.field482 = new class262(arg0, arg1, 22, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
        this.field492 = ~arg1.field1184 != -1 && !arg8;
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)V")
    public final void method11(int arg0) {
        if (arg0 == -21910) {
            ++field494;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IZ)V")
    public static final void method224(int arg0, boolean arg1) {
        if (arg0 < 30) {
            method223(114);
        }
        class423.method2609(class161.field2232, arg1, class6.field69, 2109192076, class221.field3368);
        ++field481;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)I")
    public final int method7(boolean arg0) {
        if (!arg0) {
            return -27;
        } else {
            ++field490;
            return this.field482.field3998;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)Z")
    public final boolean method1(int arg0) {
        int var2 = -124 / ((arg0 - -1) / 46);
        ++field485;
        return this.field482.method1626(-27318);
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(Z)Z")
    public final boolean method112(boolean arg0) {
        ++field493;
        if (!arg0) {
            this.method2((byte) 22, (class261) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)I")
    public final int method9(int arg0) {
        ++field476;
        if (arg0 <= 26) {
            field497 = 36;
        }
        return this.field482.field3985;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZILla;IIILdr;)V")
    public final void method117(boolean arg0, int arg1, class269 arg2, int arg3, int arg4, int arg5, class261 arg6) {
        ++field484;
        if (arg1 == 0) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "(Ldr;I)Lkq;")
    public final class70 method10(class261 arg0, int arg1) {
        ++field478;
        class292 var3 = this.field482.method1630(super.field4785, false, true, arg0, 116, 1024, super.field4778);
        if (arg1 != 7) {
            return null;
        } else if (var3 == null) {
            return null;
        } else {
            class361 var4 = arg0.method434();
            var4.method611(super.field4778, super.field4780, super.field4785);
            class70 var5 = null;
            if (this.field492) {
                var5 = class383.method2309(-120, 1);
            }
            if (this.field482.field3989 == null) {
                var3.method1282(var4, var5 == null ? null : var5.field899[0], 0);
            } else {
                class439 var6 = this.field482.field3989.method2050();
                arg0.method369(var3, var6, var4, var5 == null ? null : var5.field899[0], 0);
            }
            this.field482.method1623(super.field4778 >> 7, super.field4778 >> 7, super.field4785 >> 7, var3, (byte) 6, super.field4785 >> 7, arg0, true);
            return var5;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Ldr;I)V")
    public final void method6(class261 arg0, int arg1) {
        ++field488;
        this.field482.method1633(true, arg0);
        if (arg1 > -68) {
            method223(-80);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(BLdr;)V")
    public final void method2(byte arg0, class261 arg1) {
        ++field495;
        if (arg0 != 76) {
            method224(-119, false);
        }
        this.field482.method1628(arg1, (byte) 113);
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(B)V")
    public final void method116(byte arg0) {
        ++field480;
        if (arg0 >= -45) {
            this.method2((byte) -107, (class261) null);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)I")
    public final int method3(byte arg0) {
        ++field486;
        if (arg0 > -3) {
            field479 = null;
        }
        return this.field482.field4005;
    }

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "(B)V")
    public static final void method225(byte arg0) {
        class311.field4685.method1579((byte) 127);
        ++field491;
        class162.field2247 = null;
        if (arg0 == -125) {
            class360.field5320 = 1;
        }
    }
}
