import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class235 extends OutputStream {

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field3699 = 0;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field3702 = 0;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "Lai;")
    public static class126 field3698;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 19)
    public static final String method1684(String arg0, byte arg1) {
        String var2 = class259.method1835((byte) 127, class36.method281(107, arg0));
        if (var2 == null) {
            var2 = "";
        }
        if (arg1 <= 34) {
            field3698 = (class126) null;
        }
        field3700++;
        return var2;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V", line = 37)
    public static void method1685(int arg0) {
        field3698 = null;
        if (arg0 >= -96) {
            field3698 = (class126) null;
        }
    }

    @OriginalMember(owner = "client!k", name = "write", descriptor = "(I)V", line = 47)
    public final void write(int arg0) throws IOException {
        field3701++;
        throw new IOException();
    }
}
