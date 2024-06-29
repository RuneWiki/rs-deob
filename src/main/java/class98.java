import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class98 extends class362 {

    @OriginalMember(owner = "client!jl", name = "Q", descriptor = "Ld;")
    public static class242 field1525 = new class242(260);

    @OriginalMember(owner = "client!jl", name = "S", descriptor = "Ljp;")
    public static class55 field1527 = new class55(69, -2);

    @OriginalMember(owner = "client!jl", name = "T", descriptor = "I")
    public static int field1528 = 1338;

    @OriginalMember(owner = "client!jl", name = "P", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!jl", name = "R", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V", line = 4)
    public static final void method811(int arg0) {
        class491.field7199 = false;
        field1526++;
        if (arg0 != 69) {
            return;
        }
        class86.field1394 = null;
        class100.field1533 = null;
        class407.field6028 = null;
        class228.field3449 = null;
        class370.field5511 = null;
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)V", line = 28)
    public static void method812(int arg0) {
        if (arg0 != 17245) {
            method813(-115, (byte) 14, null, -91, null, true);
        }
        field1525 = null;
        field1527 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IBLtt;I[IZ)Lf;", line = 42)
    public static final class412 method813(int arg0, byte arg1, class249 arg2, int arg3, int[] arg4, boolean arg5) {
        field1524++;
        if (arg1 >= -30) {
            method813(-40, (byte) -1, null, 30, null, false);
        }
        if (!arg2.field3967 && (!class380.method2416(-1, arg0) || !class380.method2416(-1, arg3))) {
            return arg2.field3987 ? new class412(arg2, 34037, arg0, arg3, arg5, arg4) : new class412(arg2, arg0, arg3, class46.method307((byte) -125, arg0), class46.method307((byte) 115, arg3), arg4);
        } else {
            return new class412(arg2, 3553, arg0, arg3, arg5, arg4);
        }
    }
}
