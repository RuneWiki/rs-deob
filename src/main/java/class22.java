import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class22 extends InputStream {

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "Z")
    public static boolean field393 = false;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field394 = 0;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field396 = 0;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!uf", name = "read", descriptor = "()I", line = 18)
    public final int read() {
        class279.method1991(117, 30000L);
        field395++;
        return -1;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)I", line = 33)
    public static final int method161(int arg0, int arg1) {
        field392++;
        return arg0 == -1 ? arg1 >>> 8 : 13;
    }
}
