import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class553 extends class159 {

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "Ljava/lang/String;")
    public String field7630;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "Led;")
    public static class732 field7634 = new class732(2, 4, 4, 0);

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "Lfga;")
    public static class269 field7635 = new class269();

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field7631;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public static int field7632;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public static int field7633;

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
    public class553() {
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class553(String arg0) {
        this.field7630 = arg0;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
    public static void method3180(boolean arg0) {
        field7634 = null;
        if (arg0) {
            field7635 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public static final void method3181(int arg0) {
        if (class158.field2124 != null) {
            class158.field2124.method464((byte) -128);
            class158.field2124 = null;
            class158.field2130 = null;
        }
        if (arg0 != -9038) {
            field7635 = null;
        }
        field7632++;
    }
}
