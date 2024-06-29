import java.io.IOException;
import java.io.OutputStream;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class722 extends OutputStream {

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
    public static int field9956 = 0;

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field9959 = new Hashtable();

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "I")
    public static int field9961 = 2;

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "Liga;")
    public static class91 field9960 = new class91(12, 2);

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
    public static int field9954;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
    public static int field9955;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "I")
    public static int field9957;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "I")
    public static int field9958;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(BI)Z")
    public static final boolean method4017(byte arg0, int arg1) {
        field9954++;
        int var2 = 30 % ((-arg0 - 49) / 62);
        return arg1 == 3 || arg1 == 5 || arg1 == 6;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)V")
    public static void method4018(boolean arg0) {
        if (!arg0) {
            field9960 = null;
            field9959 = null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field9957++;
        throw new IOException();
    }
}
