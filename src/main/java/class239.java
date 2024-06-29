import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class239 {

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "Ljc;")
    public static class303 field3506;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z)V", line = 4)
    public static void method1589(boolean arg0) {
        if (!arg0) {
            method1591(79, -22, (byte) 97, 86, -35);
        }
        field3506 = null;
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(Z)V", line = 22)
    public static final void method1590(boolean arg0) {
        field3507++;
        class97.field1301.method1105(arg0);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIBII)V", line = 30)
    public static final void method1591(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class126.field1842 = arg1;
        if (arg2 <= -62) {
            class401.field5947 = arg3;
            class72.field992 = arg4;
            field3508++;
            class471.field6963 = arg0;
        }
    }
}
