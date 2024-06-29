import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class163 extends InputStream {

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!bj", name = "read", descriptor = "()I", line = 4)
    public final int read() {
        class434.method2690(10, 30000L);
        field2416++;
        return -1;
    }
}
