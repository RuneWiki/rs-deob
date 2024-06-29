import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class147 {

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "I")
    public int field2303;

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "Z")
    public static boolean field2307 = false;

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!bu", name = "d", descriptor = "Lla;")
    public static class422 field2306;

    @OriginalMember(owner = "client!bu", name = "c", descriptor = "[Lls;")
    public static class566[] field2305;

    @OriginalMember(owner = "client!bu", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field2308++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V", line = 11)
    public static final void method1124(int arg0) throws class556 {
        field2304++;
        if (arg0 <= 97) {
            return;
        }
        if (class554.field7897 == 1) {
            class13.field119.method1261(class26.field268, class560.field7941);
        } else {
            class13.field119.method1261(0, 0);
        }
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(I)V", line = 28)
    public static void method1125(int arg0) {
        if (arg0 == 0) {
            field2306 = null;
            field2305 = null;
        }
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(I)V", line = 39)
    public class147(int arg0) {
        this.field2303 = arg0;
    }
}
