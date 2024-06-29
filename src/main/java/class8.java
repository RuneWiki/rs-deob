import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class8 extends RuntimeException {

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "Ljava/lang/String;")
    public String field107;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field101;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "Luf;")
    private static class168 field103 = class148.method1019(-1720, "Sat");

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "Luf;")
    private static class168 field97 = class148.method1019(-1720, "Tue");

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field104 = 0;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "Luf;")
    private static class168 field106 = class148.method1019(-1720, "Fri");

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "Luf;")
    private static class168 field102 = class148.method1019(-1720, "Sun");

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "Z")
    public static boolean field105 = false;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "Luf;")
    private static class168 field108 = class148.method1019(-1720, "Wed");

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "Luf;")
    private static class168 field110 = class148.method1019(-1720, "Thu");

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "Luf;")
    private static class168 field111 = class148.method1019(-1720, "Mon");

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "[Luf;")
    public static class168[] field109 = new class168[] { field102, field111, field97, field108, field110, field106, field103 };

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "Lkb;")
    public static class80 field99;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "Ljava/awt/Frame;")
    public static Frame field98;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "[Lwa;")
    public static class284[] field100;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIII)V", line = 20)
    public static final void method32(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class148.field2293 = -1;
        field96++;
        if (arg2 <= -112) {
            class238.field3846 = -1;
            class291.field4895 = class140.field2161 * arg4 / arg0;
            class274.field4602 = class172.field2801 * arg3 / arg1;
            class162.method1145((byte) -110);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V", line = 50)
    public static void method33(byte arg0) {
        field100 = null;
        if (arg0 <= 97) {
            method32(47, 96, -2, -49, -70);
        }
        field97 = null;
        field106 = null;
        field111 = null;
        field98 = null;
        field108 = null;
        field103 = null;
        field99 = null;
        field102 = null;
        field109 = null;
        field110 = null;
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 93)
    public class8(Throwable arg0, String arg1) {
        this.field107 = arg1;
        this.field101 = arg0;
    }
}
