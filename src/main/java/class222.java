import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class222 extends InputStream {

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!hm", name = "read", descriptor = "()I")
    public final int read() {
        field3161++;
        class226.method1447((byte) -124, 30000L);
        return -1;
    }
}
