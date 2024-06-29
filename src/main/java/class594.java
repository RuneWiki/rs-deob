import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class594 {

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field8624 = 0;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field8622;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field8623;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field8625;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field8626;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method3446(int arg0, int arg1, int arg2) {
        field8626++;
        if (arg0 == 0) {
            return (arg1 & 0x34) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 19)
    public static final int method3447(String arg0, int arg1) {
        field8622++;
        if (arg0 == null) {
            return -1;
        }
        int var2 = 0;
        if (arg1 != -1) {
            return -26;
        }
        while (class389.field5147 > var2) {
            if (arg0.equalsIgnoreCase(class436.field5911[var2])) {
                return var2;
            }
            var2++;
        }
        return -1;
    }
}
