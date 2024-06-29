import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class178 {

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public int field3053 = 0;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field3052 = 0;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lofa;ZI)V", line = 4)
    private final void method1385(class301 arg0, boolean arg1, int arg2) {
        field3049++;
        if (arg2 == 5) {
            this.field3053 = arg0.method1989((byte) -74);
        }
        if (arg1) {
            this.method1385(null, true, -48);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lofa;I)V", line = 24)
    public final void method1386(class301 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1987(-62);
            if (var3 == 0) {
                if (arg1 != -30427) {
                    return;
                }
                field3050++;
                return;
            }
            this.method1385(arg0, false, var3);
        }
    }
}
