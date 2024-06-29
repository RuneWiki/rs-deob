import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class111 {

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "I")
    public int field2008;

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "Lkl;")
    public static class70 field2009 = new class70(128);

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!ju", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2007++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V")
    public static void method1005(int arg0) {
        if (arg0 >= 84) {
            field2009 = null;
        }
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class111(String arg0, int arg1) {
        this.field2008 = arg1;
    }
}
