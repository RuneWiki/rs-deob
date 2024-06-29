import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class87 {

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method792(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1588++;
        if (class543.method3045(arg6, -29039)) {
            if (class44.field610[arg6] == null) {
                class421.method2536(arg8, arg2, arg4, arg7, -1, arg5, arg0, arg3, (byte) -5, class177.field2593[arg6]);
            } else {
                class421.method2536(arg8, arg2, arg4, arg7, -1, arg5, arg0, arg3, (byte) 125, class44.field610[arg6]);
            }
            if (arg1 != 10211) {
                method793(10, -42);
            }
        } else if (arg0 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class509.field7067[var9] = true;
            }
        } else {
            class509.field7067[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(II)I")
    public static final int method793(int arg0, int arg1) {
        field1585++;
        return arg0 <= 25 ? -25 : arg1 >>> 8;
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(II)Z")
    public static final boolean method794(int arg0, int arg1) {
        field1586++;
        if (arg0 == -101) {
            return arg1 == 3 || arg1 == 4;
        } else {
            return true;
        }
    }
}
