import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class373 {

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IC)Z")
    public static final boolean method2157(int arg0, char arg1) {
        field5215++;
        if (arg0 > -50) {
            return true;
        } else {
            return arg1 >= '0' && arg1 <= '9';
        }
    }
}
