import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class366 {

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "Llc;")
    public static class435 field5359 = new class435(28, -1);

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "J")
    public static long field5361;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IZZII)V", line = 13)
    public static final void method2303(int arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        field5358++;
        if (class416.method2507(arg3, -2113733296)) {
            if (arg1) {
                field5359 = null;
            }
            class175.method1262(-1, arg2, arg4, true, class600.field8524[arg3], arg0);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V", line = 30)
    public static void method2304(int arg0) {
        field5359 = null;
        if (arg0 != -1) {
            method2303(107, true, true, 87, 69);
        }
    }
}
