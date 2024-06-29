import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class193 {

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "I")
    public static int field2511 = 0;

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "Log;")
    public static class673 field2513 = new class673();

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "I")
    public int field2509;

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "I")
    public int field2510;

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!cw", name = "f", descriptor = "I")
    public int field2514;

    @OriginalMember(owner = "client!cw", name = "g", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!cw", name = "h", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V", line = 4)
    public static void method1277(int arg0) {
        field2513 = null;
        if (arg0 != -2) {
            field2513 = null;
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IBIIII)V", line = 16)
    public static final void method1278(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != -87) {
            return;
        }
        field2516++;
        if (arg3 >= class297.field4199 && class45.field472 >= arg4 && arg0 >= class291.field4156 && class233.field3099 >= arg5) {
            class259.method1760(arg5, arg2, false, arg4, arg3, arg0);
        } else {
            class596.method3337(arg3, false, arg0, arg4, arg5, arg2);
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(II)V", line = 35)
    public static final void method1279(int arg0, int arg1) {
        field2515++;
        if (arg1 == -6746) {
            class778 var2 = class389.method2406(53, (long) arg0, 11);
            var2.method4276(0);
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIIIBLjca;)V", line = 49)
    public static final void method1280(int arg0, int arg1, int arg2, int arg3, byte arg4, class711 arg5) {
        if (arg4 >= -12) {
            return;
        }
        field2512++;
        if (arg1 < 1 || arg3 < 1 || arg1 > class102.field1467 - 2 || arg3 > class393.field5663 - 2) {
            return;
        }
        if (class443.field6387 == null) {
            return;
        }
        class602 var6 = class131.field1803.method4179(arg1, 7, arg3, arg2, arg0);
        if (var6 == null) {
            return;
        }
        if (var6 instanceof class344) {
            ((class344) var6).method2181((byte) -65, arg5);
            return;
        }
        if ((var6 instanceof class618)) {
            ((class618) var6).method3427(arg5, (byte) -118);
        } else if (var6 instanceof class515) {
            ((class515) var6).method3009(arg5, true);
            return;
        } else if (var6 instanceof class372) {
            ((class372) var6).method2335(false, arg5);
            return;
        }
        return;
    }
}
