import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class694 extends InputStream {

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "[I")
    public static int[] field9789 = new int[6];

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field9790;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V", line = 11)
    public static void method3909(byte arg0) {
        field9789 = null;
        if (arg0 != -11) {
            field9789 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "read", descriptor = "()I", line = 24)
    public final int read() {
        class687.method3846(30000L, 84);
        field9790++;
        return -1;
    }
}
