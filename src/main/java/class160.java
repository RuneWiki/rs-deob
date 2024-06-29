import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class160 {

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field2028 = 0;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 3)
    public static final void method1091(int arg0) {
        field2030++;
        if (!class72.field935.method1861(class161.field2038, -115) && class432.field5993 != field2028) {
            class286.method1717(false, -127, class179.field2235, 11, class690.field9747);
            return;
        }
        class640.method3483(0, class9.field103);
        int var1 = -12 % ((arg0 + 30) / 36);
        if (class476.field6439 != class432.field5993) {
            class430.method2478((byte) -124);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 22)
    public static final void method1092(int arg0, String arg1, int arg2) {
        class389.method2326((byte) 118, class360.field5196);
        class237.field3085++;
        field2029++;
        class253.field3491.method951((byte) -82, class500.method2820(1, arg1) + 1);
        if (arg0 != 360) {
            method1091(-53);
        }
        class253.field3491.method956((byte) 116, arg2);
        class253.field3491.method905(arg1, -127);
    }
}
