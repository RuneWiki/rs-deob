import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class352 {

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "Lkca;")
    public static class76 field4811;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BIIIILvj;I)V", line = 8)
    public static final void method2098(byte arg0, int arg1, int arg2, int arg3, int arg4, class411 arg5, int arg6) {
        class188.method1234(arg5.field8609, arg5.field8620, arg2, (byte) 109, 0, arg6, arg5.field8612, arg4, arg1, arg3);
        field4812++;
        if (arg0 != 42) {
            method2098((byte) -105, 68, 16, -44, -91, null, 33);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 21)
    public static void method2099(int arg0) {
        if (arg0 != 23696) {
            method2099(45);
        }
        field4811 = null;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V", line = 33)
    public static final void method2100(int arg0) {
        if (arg0 != -2) {
            return;
        }
        if (class10.field197.method430()) {
            class10.field197.method420(class443.field6072);
            class193.method1250(3);
            class10.field197.method375(class443.field6072);
            class10.field197.method370(class443.field6072);
        } else {
            class405.method2326(class571.field7587, -86);
        }
        field4810++;
        class449.method2540((byte) -77);
    }
}
