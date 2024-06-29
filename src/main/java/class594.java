import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class594 extends InputStream {

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "Leba;")
    public static class550 field8194 = new class550(45, 8);

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "I")
    public static int field8195;

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "I")
    public static int field8196;

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "I")
    public static int field8197;

    @OriginalMember(owner = "client!ou", name = "read", descriptor = "()I")
    public final int read() {
        class588.method3253(0, 30000L);
        field8197++;
        return -1;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method3299(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field8195++;
        class464 var10 = null;
        for (class464 var11 = (class464) class467.field6131.method2506(68); var11 != null; var11 = (class464) class467.field6131.method2505(-127)) {
            if (var11.field6074 == arg3 && var11.field6082 == arg4 && var11.field6080 == arg7 && var11.field6085 == arg9) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class464();
            var10.field6080 = arg7;
            var10.field6085 = arg9;
            var10.field6074 = arg3;
            var10.field6082 = arg4;
            if (arg4 >= 0 && arg7 >= 0 && class703.field9886 > arg4 && arg7 < class431.field5789) {
                class407.method2310(var10, -10868);
            }
            class467.field6131.method2507(var10, (byte) -124);
        }
        var10.field6073 = arg8;
        var10.field6079 = arg1;
        var10.field6083 = arg0;
        var10.field6071 = arg5;
        var10.field6072 = arg6;
        if (arg2 != 8) {
            field8194 = null;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V")
    public static void method3300(int arg0) {
        if (arg0 != -20402) {
            field8194 = null;
        }
        field8194 = null;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(BI)Z")
    public static final boolean method3301(byte arg0, int arg1) {
        field8196++;
        if (arg0 != 33) {
            method3301((byte) -45, 90);
        }
        return arg1 == 3 || arg1 == 4 || arg1 == 5 || arg1 == 6;
    }
}
