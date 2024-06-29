import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class385 extends class281 {

    @OriginalMember(owner = "client!uv", name = "y", descriptor = "Lo;")
    public class31 field5624;

    @OriginalMember(owner = "client!uv", name = "x", descriptor = "I")
    public static int field5623 = 0;

    @OriginalMember(owner = "client!uv", name = "z", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)V")
    public static final void method2446(int arg0) {
        class723.field10062 = null;
        field5625++;
        if (class130.field1934 && class485.method2816(60) != 1) {
            class526.method3037((byte) 111, 0, class458.field6355 == 3 || class458.field6355 == 7, 0, class610.method3374(true), class90.method728(364409068));
        }
        int var1 = 0;
        int var2 = 0;
        if (arg0 < 65) {
            field5623 = 19;
        }
        if (class130.field1934) {
            var1 = class550.method3117(99);
            var2 = class621.method3410(-2);
        }
        class704.method3942(var2 + class140.field2048, var1, var1 + class593.field8019, 0, -1, class69.field968, var1, var2, var2);
        if (class723.field10062 != null) {
            class367.method2292(class140.field2048 + var2, true, var2, var1, 30720, class593.field8019 + var1, -1412584499, class45.field681, class569.field7578, class613.field8311.field9351, class723.field10062);
            class723.field10062 = null;
        }
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lo;)V")
    public class385(class31 arg0) {
        this.field5624 = arg0;
    }
}
