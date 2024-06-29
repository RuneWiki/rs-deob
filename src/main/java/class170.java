import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class170 {

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "Z")
    public static boolean field2503 = false;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "Lki;")
    public static class158 field2499;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "Lpk;")
    public static class237 field2497;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "Lpk;")
    public static class237 field2501;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= class196.field2961 && arg7 <= class84.field1287 && arg1 >= class175.field2557 && class91.field1381 >= arg4) {
            class107.method778(arg6, arg0, arg7, arg2, arg4, arg3, true, arg1);
        } else {
            class180.method1185(arg6, arg0, arg1, arg2, arg4, (byte) -69, arg7, arg3);
        }
        field2502++;
        if (arg5 >= -109) {
            field2497 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)V")
    public static void method1141(boolean arg0) {
        field2499 = null;
        field2501 = null;
        if (arg0) {
            field2497 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
    public static final void method1142(int arg0) {
        class278.field4281.method940(94);
        field2498++;
        class275.field4239.method940(86);
        if (arg0 != 26700) {
            field2497 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method1143(int arg0, int arg1) {
        field2500++;
        if (arg0 == -24448) {
            return class280.field4297[arg1].length() <= 0 ? class179.field2614[arg1] : class179.field2614[arg1] + class246.field3837 + class280.field4297[arg1];
        } else {
            return null;
        }
    }
}
