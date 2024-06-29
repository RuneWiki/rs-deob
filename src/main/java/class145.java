import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class145 extends class86 {

    @OriginalMember(owner = "client!w", name = "s", descriptor = "Ljava/lang/String;")
    public String field2257;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "[Z")
    public static boolean[] field2256 = new boolean[112];

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public static int field2254 = 0;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "Lba;")
    public static class169 field2255;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)I")
    public static final int method998(int arg0) {
        if (arg0 == 6) {
            field2253++;
            return 6;
        } else {
            return 75;
        }
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V")
    public static void method999(int arg0) {
        field2256 = null;
        if (arg0 != 0) {
            method998(10);
        }
        field2255 = null;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
    public class145() {
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class145(String arg0) {
        this.field2257 = arg0;
    }
}
