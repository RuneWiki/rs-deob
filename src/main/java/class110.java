import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class110 {

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)V", line = 6)
    public static final void method718(int arg0) {
        field1482++;
        class230.method1365(true);
        int var1 = class332.field4707.field4777.method677(~arg0);
        if (var1 == 2) {
            class140.method922(arg0, 100, class118.field1561, class553.field7716, 100, class129.field1802);
        } else if (var1 == 3) {
            class304.method1998(class319.field4440, class118.field1561, 2, class129.field1802, class726.field10065, 21121, class553.field7716, 2);
        }
        if (arg0 != -1) {
            return;
        }
        if (class332.field4707.field4777.method679((byte) -78)) {
            class252.method1725(class570.field7875, 2228);
        }
        if (class129.field1802 != null) {
            class166.method1035((byte) 97);
        }
        class301.field4261 = class332.field4707.field4777.method677(0) != 0;
        class222.field3009 = class332.field4707.field4777.method679((byte) -76);
    }
}
