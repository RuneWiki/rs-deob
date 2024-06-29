import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class275 extends InputStream {

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "Lup;")
    public static class249 field3476 = new class249();

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "Lxa;")
    public static class458 field3478;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "[Ld;")
    public static class137[] field3477;

    @OriginalMember(owner = "client!ca", name = "read", descriptor = "()I")
    public final int read() {
        field3475++;
        class370.method2025(-1, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static void method1564(int arg0) {
        if (arg0 != -1) {
            method1564(61);
        }
        field3476 = null;
        field3477 = null;
        field3478 = null;
    }
}
