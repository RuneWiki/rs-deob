import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class218 extends InputStream {

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3287 = null;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field3288 = 0;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "[Lam;")
    public static class181[] field3291;

    @OriginalMember(owner = "client!lf", name = "read", descriptor = "()I")
    public final int read() {
        field3286++;
        class28.method182(30000L, 121);
        return -1;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public static void method1411(int arg0) {
        field3291 = null;
        if (arg0 != 13518) {
            method1411(68);
        }
        field3287 = null;
    }
}
