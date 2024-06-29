import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class733 extends IOException {

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "[B")
    public static byte[] field10222 = new byte[520];

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public static int field10223 = -1;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)V", line = 9)
    public static void method4104(boolean arg0) {
        if (!arg0) {
            method4104(true);
        }
        field10222 = null;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 23)
    public class733(String arg0) {
        super(arg0);
    }
}
