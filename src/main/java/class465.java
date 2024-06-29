import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class465 extends class659 {

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
    public int field6590 = 0;

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "Ljb;")
    public static class519 field6591 = new class519(129, -2);

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "Lqj;")
    public static class535 field6593 = new class535(5);

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "Z")
    public static volatile boolean field6594 = true;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "I")
    public static int field6589;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
    public static int field6592;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ldt;I)V", line = 11)
    public final void method2736(class254 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1731((byte) 64);
            if (var3 == 0) {
                if (arg1 >= -43) {
                    return;
                }
                field6589++;
                return;
            }
            this.method2737(arg0, 0, var3);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ldt;II)V", line = 32)
    private final void method2737(class254 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            field6592++;
            if (arg2 == 2) {
                this.field6590 = arg0.method1728((byte) 46);
            }
        }
    }

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "(B)V", line = 48)
    public static void method2738(byte arg0) {
        field6591 = null;
        field6593 = null;
        if (arg0 >= -44) {
            field6593 = null;
        }
    }
}
