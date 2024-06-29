import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class136 extends InputStream {

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "Lo;")
    public static class332 field1963 = new class332("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZ)I")
    public static final int method955(int arg0, boolean arg1) {
        if (!arg1) {
            field1963 = null;
        }
        field1964++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!qf", name = "read", descriptor = "()I")
    public final int read() {
        field1967++;
        class325.method2005(true, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIIIIIIBI)V")
    public static final void method956(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        if (arg8 != -41) {
            field1963 = null;
        }
        if (class293.field4420 <= arg2 && arg2 <= class119.field1643 && arg7 >= class293.field4420 && arg7 <= class119.field1643 && class293.field4420 <= arg0 && arg0 <= class119.field1643 && arg4 >= class293.field4420 && arg4 <= class119.field1643 && class176.field2503 <= arg5 && class296.field4443 >= arg5 && arg6 >= class176.field2503 && class296.field4443 >= arg6 && arg1 >= class176.field2503 && class296.field4443 >= arg1 && arg3 >= class176.field2503 && arg3 <= class296.field4443) {
            class25.method220(arg2, arg5, arg4, 4483, arg0, arg9, arg1, arg6, arg3, arg7);
        } else {
            class38.method293(arg6, arg4, arg7, arg3, arg5, arg2, false, arg1, arg9, arg0);
        }
        field1965++;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BI)I")
    public static final int method957(byte arg0, int arg1) {
        if (arg0 >= -38) {
            method958(2);
        }
        field1966++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public static void method958(int arg0) {
        if (arg0 != 30000) {
            field1963 = null;
        }
        field1963 = null;
    }
}
