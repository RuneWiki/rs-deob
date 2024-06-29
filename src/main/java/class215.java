import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class215 extends RuntimeException {

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2670;

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "Ljava/lang/String;")
    public String field2672;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field2669 = new String[100];

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "[I")
    public static int[] field2671 = new int[2];

    @OriginalMember(owner = "client!mba", name = "e", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Z)V", line = 9)
    public static void method1273(boolean arg0) {
        if (!arg0) {
            field2669 = null;
            field2671 = null;
        }
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 28)
    public class215(Throwable arg0, String arg1) {
        this.field2670 = arg0;
        this.field2672 = arg1;
    }
}
