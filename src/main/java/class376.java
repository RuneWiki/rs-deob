import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class376 extends InputStream {

    @OriginalMember(owner = "client!oq", name = "b", descriptor = "Lta;")
    public static class221 field5412 = new class221();

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!oq", name = "c", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!oq", name = "d", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)V")
    public static void method2328(int arg0) {
        field5412 = null;
        if (arg0 != 22649) {
            field5412 = null;
        }
    }

    @OriginalMember(owner = "client!oq", name = "read", descriptor = "()I")
    public final int read() {
        field5414++;
        class117.method820(false, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(BLcb;)V")
    public static final void method2329(byte arg0, class544 arg1) {
        class484.field6865 = arg1;
        field5411++;
        int var2 = 21 / ((72 - arg0) / 53);
    }
}
