import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 {

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(CI)Z", line = 11)
    public static final boolean method9(char arg0, int arg1) {
        if (arg1 == 48) {
            field15++;
            return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        } else {
            return true;
        }
    }
}
