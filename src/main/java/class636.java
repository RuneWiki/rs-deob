import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class636 {

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "Z")
    public static boolean field9115 = false;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field9116 = -1;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public static int field9117;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lr;ZI)Lgda;", line = 18)
    public static final class50 method3632(class165 arg0, boolean arg1, int arg2) {
        field9117++;
        class431 var3 = class15.method171(17775, arg0, arg2, arg1);
        return var3 == null ? null : var3.field6184;
    }
}
