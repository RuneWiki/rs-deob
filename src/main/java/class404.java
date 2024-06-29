import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class404 {

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "J")
    public static long field6098 = -1L;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "B")
    public static byte field6099;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIII)Z", line = 47)
    public static final boolean method2516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6097++;
        for (int var6 = arg2; var6 <= arg1; var6++) {
            for (int var7 = arg4; var7 <= arg5; var7++) {
                if (class316.field4800[var6][var7] == arg3 && class56.field1188[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        if (arg0 == 25428) {
            return false;
        } else {
            return true;
        }
    }
}
