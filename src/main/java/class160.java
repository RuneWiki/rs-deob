import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class160 extends class307 {

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "Lph;")
    private static class229 field2587 = class266.method1858("Started 3d Library", 0);

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "Lph;")
    public static class229 field2591 = field2587;

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "[Loi;")
    public static class108[] field2592 = new class108[4];

    @OriginalMember(owner = "client!lm", name = "w", descriptor = "Z")
    public static boolean field2594 = false;

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "J")
    public static long field2593 = 0L;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "Llm;")
    public class160 field2586;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "Llm;")
    public class160 field2588;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "Lsi;")
    public static class66 field2589;

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "Ljava/awt/Frame;")
    public static Frame field2590;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)V", line = 6)
    public final void method1132(int arg0) {
        field2585++;
        if (this.field2586 == null) {
            return;
        }
        this.field2586.field2588 = this.field2588;
        this.field2588.field2586 = this.field2586;
        this.field2586 = null;
        if (arg0 != 4) {
            method1133(-112);
        }
        this.field2588 = null;
    }

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "(I)V", line = 30)
    public static void method1133(int arg0) {
        if (arg0 != 4) {
            return;
        }
        field2590 = null;
        field2587 = null;
        field2589 = null;
        field2591 = null;
        field2592 = null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)Z", line = 57)
    public static final boolean method1134(int arg0, int arg1) {
        if (arg1 != 0) {
            field2587 = (class229) null;
        }
        field2595++;
        return arg0 >= 0 && arg0 < class328.field5596.length ? class328.field5596[arg0] : false;
    }
}
