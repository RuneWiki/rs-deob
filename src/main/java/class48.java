import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class48 {

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IZI)Llh;")
    public static final class100 method323(int arg0, boolean arg1, int arg2) {
        field756++;
        if (arg0 == Integer.MIN_VALUE) {
            long var3 = (long) (arg2 | (arg1 ? Integer.MIN_VALUE : 0));
            return (class100) class51.field785.method358((byte) 10, var3);
        } else {
            return null;
        }
    }
}
