import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class444 {

    @OriginalMember(owner = "client!os", name = "a", descriptor = "I")
    public static int field6175;

    @OriginalMember(owner = "client!os", name = "b", descriptor = "I")
    public static int field6176;

    @OriginalMember(owner = "client!os", name = "c", descriptor = "I")
    public static int field6177;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V", line = 12)
    public static final void method2492(byte arg0) {
        if (arg0 != 111) {
            method2493(96);
        }
        class425.method2432(255, -1, arg0 - 111);
        field6176++;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V", line = 24)
    public static final void method2493(int arg0) {
        class536.method2952(true);
        field6177++;
        class587.method3267(2, 22050, class11.field68.field5504.method3760((byte) 127) == 1, (byte) 124);
        class566.field7989 = class256.method1521(22050, 0, (byte) -126, class287.field3823, class725.field10121);
        class561.method3168(class253.method1509(126, null), true, 28643);
        if (arg0 >= 96) {
            class188.field2264 = class256.method1521(2048, 1, (byte) -126, class287.field3823, class725.field10121);
            class188.field2264.method498(0, class143.field1851);
        }
    }
}
