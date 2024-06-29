import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class220 extends InputStream {

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "Ljc;")
    public static class305 field2972 = new class305(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "Lhn;")
    public static class509 field2973 = new class509(4);

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "Ljc;")
    public static class305 field2974 = new class305("K", "T", "K", "K");

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V", line = 3)
    public static void method1387(int arg0) {
        field2974 = null;
        field2972 = null;
        field2973 = null;
        if (arg0 != -2972) {
            field2974 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "read", descriptor = "()I", line = 20)
    public final int read() {
        class316.method1873(30000L, false);
        field2971++;
        return -1;
    }
}
