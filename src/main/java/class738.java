import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class738 extends InputStream {

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "I")
    public static int field10235;

    @OriginalMember(owner = "client!nda", name = "read", descriptor = "()I")
    public final int read() {
        class579.method3405(30000L, 10);
        field10235++;
        return -1;
    }
}
