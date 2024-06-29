import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class120 extends IOException {

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "Laf;")
    public static class33 field1550;

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 3)
    public class120(String arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V", line = 8)
    public static void method899(int arg0) {
        field1550 = null;
        if (arg0 < 49) {
            method899(90);
        }
    }
}
