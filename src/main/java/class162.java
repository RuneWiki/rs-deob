import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pha")
public class class162 {

    @OriginalMember(owner = "client!pha", name = "d", descriptor = "Lqfa;")
    public static class98 field2212 = new class98(114, -2);

    @OriginalMember(owner = "client!pha", name = "e", descriptor = "Lgda;")
    public static class53 field2213 = new class53(80, 3);

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!pha", name = "b", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!pha", name = "c", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method1064(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class71.field960 <= arg7 && arg3 <= class549.field7665 && arg4 >= class143.field2050 && class461.field6495 >= arg2) {
            class638.method3541(arg6, arg4, arg7, arg2, arg0, arg3, arg5, 18397);
        } else {
            class322.method2074(arg4, arg3, arg5, 8222, arg0, arg7, arg6, arg2);
        }
        if (arg1 < 78) {
            field2213 = null;
        }
        field2209++;
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(Z)V")
    public static final void method1065(boolean arg0) {
        field2211++;
        if (class3.field27) {
            return;
        }
        class652.method3592(class656.field8999, 0);
        if (class480.field6790 != null) {
            class652.method3592(class480.field6790, 0);
        }
        class3.field27 = true;
        if (arg0) {
            field2212 = null;
        }
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(BLm;Lm;)V")
    public static final void method1066(byte arg0, class189 arg1, class189 arg2) {
        if (arg0 != -102) {
            return;
        }
        if (arg2.field2545 != null) {
            arg2.method1185(-46);
        }
        field2210++;
        arg2.field2545 = arg1.field2545;
        arg2.field2543 = arg1;
        arg2.field2545.field2543 = arg2;
        arg2.field2543.field2545 = arg2;
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(B)V")
    public static void method1067(byte arg0) {
        int var1 = -116 % ((arg0 - 49) / 62);
        field2213 = null;
        field2212 = null;
    }
}
