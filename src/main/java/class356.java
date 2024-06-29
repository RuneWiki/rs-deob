import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class356 {

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public static int field4969 = 0;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIILii;Lii;)V", line = 9)
    public static final void method2148(int arg0, int arg1, int arg2, class386 arg3, class386 arg4) {
        class148 var5 = class453.method2729(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field2079 = arg3;
            var5.field2085 = arg4;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 18)
    public static final int method2149(String arg0, int arg1) {
        field4970++;
        int var2 = 0;
        if (arg1 > -28) {
            method2148(-63, 45, -31, null, null);
        }
        while (var2 < class21.field240.length) {
            if (class21.field240[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIII)V", line = 44)
    public static final void method2150(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class394.field5789 != null) {
            class394.field5789[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class506.field7486 != null) {
            class506.field7486[arg0][arg1] = (byte) (arg3 >> 3);
        }
        if (class453.field6667 != null) {
            class453.field6667[arg0][arg1] = (byte) arg4;
        }
    }
}
