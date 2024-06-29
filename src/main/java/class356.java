import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class356 {

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZI)Lcb;", line = 7)
    public static final class304 method2281(int arg0, boolean arg1, int arg2) {
        if (arg2 == 0) {
            field4872++;
            long var3 = (long) ((arg1 ? Integer.MIN_VALUE : 0) | arg0);
            return (class304) class205.field2825.method886(var3, 25651);
        } else {
            return null;
        }
    }
}
