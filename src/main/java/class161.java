import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class161 {

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2569 = "green:";

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V", line = 6)
    public static void method1293(int arg0) {
        if (arg0 != -1) {
            field2569 = (String) null;
        }
        field2569 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIZBLoj;)Lho;", line = 18)
    public static final class215 method1294(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, class207 arg6) {
        field2568++;
        int var7 = (arg2 << 19) + arg1 - (-(arg4 ? 65536 : 0) - (arg3 << 17));
        long var9 = (long) arg0 * 3147483667L + ((long) var7 * 3849834839L);
        class215 var11 = (class215) class184.field2891.method654(106, var9);
        if (var11 != null) {
            return var11;
        }
        class107.field1612 = false;
        class215 var12 = class59.method585(false, arg6, arg4, arg1, false, arg0, arg3, arg2, (byte) -104);
        if (arg5 <= 52) {
            return (class215) null;
        } else {
            if (var12 != null && !class107.field1612) {
                class184.field2891.method652(100, var12, var9);
            }
            return var12;
        }
    }
}
