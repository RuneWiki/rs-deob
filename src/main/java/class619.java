import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class619 extends IOException {

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "Ljava/lang/String;")
    public static String field8613 = null;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "I")
    public static int field8611;

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "[Lf;")
    public static class702[] field8612;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(B)V", line = 3)
    public static void method3445(byte arg0) {
        field8612 = null;
        if (arg0 != 106) {
            field8613 = null;
        }
        field8613 = null;
    }

    @OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 18)
    public class619(String arg0) {
        super(arg0);
    }
}
