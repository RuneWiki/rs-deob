import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class297 extends InputStream {

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!gaa", name = "read", descriptor = "()I")
    public final int read() {
        field3692++;
        class524.method3076(1, 30000L);
        return -1;
    }
}
