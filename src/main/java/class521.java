import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public class class521 extends class478 {

    @OriginalMember(owner = "client!hha", name = "I", descriptor = "I")
    public int field7458;

    @OriginalMember(owner = "client!hha", name = "F", descriptor = "I")
    public static int field7455 = 0;

    @OriginalMember(owner = "client!hha", name = "G", descriptor = "Lmia;")
    public static class63 field7456 = new class63(80, -1);

    @OriginalMember(owner = "client!hha", name = "E", descriptor = "I")
    public static int field7454;

    @OriginalMember(owner = "client!hha", name = "H", descriptor = "I")
    public static int field7457;

    @OriginalMember(owner = "client!hha", name = "J", descriptor = "I")
    public static int field7459;

    @OriginalMember(owner = "client!hha", name = "K", descriptor = "[Z")
    public static boolean[] field7460;

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(ZIIII)V")
    public static final void method3069(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field7459++;
        class497.field7073 = arg1;
        class432.field6446 = arg4;
        class391.field5895 = arg3;
        class166.field2622 = arg2;
        if (arg0) {
            field7454 = 102;
        }
    }

    @OriginalMember(owner = "client!hha", name = "<init>", descriptor = "(Log;Lega;IIIIIIIIIIIIII)V")
    public class521(class651 arg0, class713 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field7458 = arg15;
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(B)Lio;")
    public final class439 method69(byte arg0) {
        field7457++;
        int var2 = 114 / ((-arg0 - 69) / 39);
        return class45.field500;
    }

    @OriginalMember(owner = "client!hha", name = "d", descriptor = "(B)V")
    public static void method3070(byte arg0) {
        field7460 = null;
        if (arg0 == -23) {
            field7456 = null;
        }
    }
}
