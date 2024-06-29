import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class50 {

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public int field663;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "Lnn;")
    public static class446 field666 = new class446(4, 4);

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "Lu;")
    public static class69 field664;

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "Ljava/lang/String;")
    public static String field667;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V")
    public static void method289(int arg0) {
        field667 = null;
        field664 = null;
        if (arg0 != 2287) {
            field667 = null;
        }
        field666 = null;
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(I)V")
    public class50(int arg0) {
        this.field663 = arg0;
    }

    @OriginalMember(owner = "client!nl", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field665++;
        throw new IllegalStateException();
    }
}
