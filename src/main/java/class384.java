import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class384 extends InputStream {

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field5785 = 0;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "Lig;")
    public static class206 field5786;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "Z")
    public static boolean field5788;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field5787;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field5789;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field5790;

    static {
        new class572("", 76);
        field5786 = new class206(37, -1);
        field5788 = false;
        field5787 = -1;
    }

    @OriginalMember(owner = "client!uf", name = "read", descriptor = "()I", line = 8)
    public final int read() {
        field5789++;
        class646.method3696(1, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V", line = 20)
    public static void method2450(boolean arg0) {
        if (!arg0) {
            method2450(true);
        }
        field5786 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BI)Z", line = 38)
    public static final boolean method2451(byte arg0, int arg1) {
        field5790++;
        if (arg0 != -55) {
            method2451((byte) -101, -70);
        }
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }
}
