import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class122 extends InputStream {

    @OriginalMember(owner = "client!co", name = "a", descriptor = "I")
    public static int field1762 = 0;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "F")
    public static float field1763;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!co", name = "e", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!co", name = "read", descriptor = "()I", line = 8)
    public final int read() {
        class149.method1052(30000L, true);
        field1764++;
        return -1;
    }
}
