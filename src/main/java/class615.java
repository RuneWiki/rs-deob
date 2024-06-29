import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class615 extends InputStream {

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
    public static int field8346;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
    public static int field8347;

    @OriginalMember(owner = "client!qp", name = "read", descriptor = "()I", line = 7)
    public final int read() {
        field8346++;
        class700.method3867(29279, 30000L);
        return -1;
    }
}
