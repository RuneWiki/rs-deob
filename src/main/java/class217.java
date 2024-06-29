import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public abstract class class217 {

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "[I")
    public static int[] field2848 = new int[500];

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "Lmv;")
    public static class297 field2849 = new class297(8, 0, 4, 1);

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public int field2851;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "Ljava/lang/String;")
    public String field2847;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)Ljava/net/Socket;", line = 4)
    public final Socket method1385(boolean arg0) throws IOException {
        if (arg0) {
            field2850++;
            return new Socket(this.field2847, this.field2851);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V", line = 18)
    public static void method1387(int arg0) {
        field2848 = null;
        field2849 = null;
        if (arg0 != 4) {
            field2849 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)Ljava/net/Socket;")
    public abstract Socket method1386(byte arg0) throws IOException;
}
