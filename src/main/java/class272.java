import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uia")
public class class272 {

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "Lgr;")
    public static class530 field3853 = new class530(16, 6);

    @OriginalMember(owner = "client!uia", name = "e", descriptor = "Laf;")
    public static class13 field3857 = new class13();

    @OriginalMember(owner = "client!uia", name = "b", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!uia", name = "c", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!uia", name = "d", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(IC)Z", line = 3)
    public static final boolean method1773(int arg0, char arg1) {
        if (arg0 != -66) {
            field3855 = -40;
        }
        field3854++;
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!uia", name = "a", descriptor = "(I)V", line = 15)
    public static void method1774(int arg0) {
        field3857 = null;
        if (arg0 == 122) {
            field3853 = null;
        }
    }

    @OriginalMember(owner = "client!uia", name = "toString", descriptor = "()Ljava/lang/String;", line = 39)
    public final String toString() {
        field3856++;
        throw new IllegalStateException();
    }
}
