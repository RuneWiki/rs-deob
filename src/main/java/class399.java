import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class399 extends InputStream {

    @OriginalMember(owner = "client!at", name = "d", descriptor = "I")
    public static int field5508 = 0;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "[I")
    public static int[] field5505 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!at", name = "c", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!at", name = "b", descriptor = "Lcba;")
    public static class577 field5506;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V")
    public static void method2399(int arg0) {
        if (arg0 == -1) {
            field5505 = null;
            field5506 = null;
        }
    }

    @OriginalMember(owner = "client!at", name = "read", descriptor = "()I")
    public final int read() {
        field5507++;
        class643.method3577(30000L, 0);
        return -1;
    }
}
