import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class89 {

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field1663 = 0;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
    public static final void method526(byte arg0) {
        field1664++;
        if (arg0 != 0) {
            return;
        }
        while (true) {
            class69 var1 = class157.field2806;
            class15 var2;
            synchronized (class157.field2806) {
                var2 = (class15) class117.field2113.method411((byte) -48);
            }
            if (var2 == null) {
                return;
            }
            var2.field285.method1213((int) var2.field2393, var2.field289, var2.field281, false, (byte) 74);
        }
    }
}
