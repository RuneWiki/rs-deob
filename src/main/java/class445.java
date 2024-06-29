import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class445 {

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field6399 = 2;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field6400 = 0;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "[I")
    public static int[] field6401 = new int[32];

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "F")
    public static float field6403;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field6397;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field6402;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZII)V")
    public static final void method2752(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            method2753(-62);
        }
        field6398++;
        class450 var3 = class59.method540(1, arg2, 1000);
        var3.method2800(256);
        var3.field6498 = arg1;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
    public static void method2753(int arg0) {
        if (arg0 == 1) {
            field6401 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILap;)Liq;")
    public static final class223 method2754(int arg0, class289 arg1) {
        field6397++;
        int var2 = 77 % ((-arg0 - 43) / 45);
        return new class223(arg1.method1833(41), arg1.method1833(49), arg1.method1833(100), arg1.method1833(58), arg1.method1833(126), arg1.method1833(50), arg1.method1833(79), arg1.method1833(48), arg1.method1880((byte) 105), arg1.method1861((byte) -72));
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V")
    public static final void method2755(boolean arg0) {
        class410 var1 = class243.field3362;
        synchronized (class243.field3362) {
            class243.field3362.method2533(0);
        }
        field6396++;
        class410 var2 = class373.field5245;
        synchronized (class373.field5245) {
            class373.field5245.method2533(0);
        }
        class410 var3 = class418.field5861;
        synchronized (class418.field5861) {
            class418.field5861.method2533(0);
        }
        if (arg0) {
            field6403 = 0.6298804F;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIILbi;III)V")
    public static final void method2756(int arg0, int arg1, int arg2, int arg3, class139 arg4, int arg5, int arg6, int arg7) {
        field6402++;
        if (class373.field5248) {
            class57.field909 = 32;
        } else {
            class57.field909 = 0;
        }
        if (arg1 != 16) {
            return;
        }
        class373.field5248 = false;
        if (class262.field3525 != 0) {
            if (arg0 >= arg3 && arg0 < arg3 + 16 && arg2 <= arg5 && arg2 + 16 > arg5) {
                arg4.field1983 -= 4;
                class10.method52(arg4, (byte) -89);
            } else if (arg3 <= arg0 && arg3 + 16 > arg0 && arg7 + arg2 - 16 <= arg5 && arg2 + arg7 > arg5) {
                arg4.field1983 += 4;
                class10.method52(arg4, (byte) -89);
            } else if (arg0 >= (arg3 - class57.field909) && (arg3 + class57.field909 + 16) > arg0 && (arg2 + 16) <= arg5 && arg2 + arg7 - 16 > arg5) {
                int var8 = (arg7 - 32) * arg7 / arg6;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg5 - ((var8 / 2) + 16) - arg2;
                int var10 = arg7 - var8 - 32;
                arg4.field1983 = (arg6 - arg7) * var9 / var10;
                class10.method52(arg4, (byte) -89);
                class373.field5248 = true;
            }
        }
        if (class428.field6080 == 0) {
            return;
        }
        int var11 = arg4.field2027;
        if (arg3 - var11 <= arg0 && arg2 <= arg5 && arg0 < arg3 + 16 && (arg2 + arg7) >= arg5) {
            arg4.field1983 += class428.field6080 * 45;
            class10.method52(arg4, (byte) -89);
            return;
        }
    }
}
