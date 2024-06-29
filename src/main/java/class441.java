import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class441 extends class550 {

    @OriginalMember(owner = "client!gk", name = "R", descriptor = "Ln;")
    public static class17 field6296 = null;

    @OriginalMember(owner = "client!gk", name = "Q", descriptor = "I")
    public static int field6295 = 0;

    @OriginalMember(owner = "client!gk", name = "N", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V", line = 3)
    public static void method2621(boolean arg0) {
        if (!arg0) {
            field6296 = null;
        }
        field6296 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V", line = 22)
    public static final void method2622(byte arg0) {
        for (int var1 = 0; var1 < class562.field8128.length; var1++) {
            for (int var2 = 0; var2 < class562.field8128[var1].length; var2++) {
                class562.field8128[var1][var2] = class214.field2719;
            }
        }
        if (arg0 != 51) {
            field6295 = 100;
        }
        field6294++;
    }
}
