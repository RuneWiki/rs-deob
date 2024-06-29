import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class293 extends InputStream {

    @OriginalMember(owner = "client!db", name = "c", descriptor = "Llga;")
    public static class663 field4024 = new class663(3000000, 200);

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field4025;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 5)
    public static void method1793(int arg0) {
        field4025 = null;
        field4024 = null;
        if (arg0 > -24) {
            method1793(60);
        }
    }

    @OriginalMember(owner = "client!db", name = "read", descriptor = "()I", line = 19)
    public final int read() {
        field4023++;
        class519.method2960(110, 30000L);
        return -1;
    }
}
