import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class52 {

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "Luw;")
    public static class208 field666 = new class208(77, -2);

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(B)V", line = 3)
    public static void method327(byte arg0) {
        if (arg0 > -119) {
            method328((byte) -37, null);
        }
        field666 = null;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(BLhd;)Lbj;", line = 13)
    public static final class569 method328(byte arg0, class620 arg1) {
        field664++;
        class569 var2;
        if (class207.field2845 == null) {
            var2 = new class569();
        } else {
            var2 = class207.field2845;
            class207.field2845 = class207.field2845.field7189;
            class511.field6525--;
            var2.field7189 = null;
        }
        var2.field7193 = arg1;
        if (arg0 != -36) {
            field666 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(IZIII)V", line = 36)
    public static final void method329(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class243.method1597(2);
        field665++;
        class536.field6775 = arg4;
        int var5 = class400.method2313((byte) -101);
        if (arg2 == 3 || var5 == 3) {
            arg1 = true;
        }
        if (!class576.field7320.method965()) {
            arg1 = true;
        }
        class500.method2778(arg1, arg2, arg3, var5, arg0, -117);
    }
}
