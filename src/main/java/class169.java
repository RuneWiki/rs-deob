import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class169 extends class50 {

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "I")
    public static int field2585 = 0;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "I")
    public static volatile int field2587 = 0;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "[Z")
    public static boolean[] field2582 = new boolean[200];

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "Lnk;")
    public static class16 field2583;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)V", line = 11)
    public static void method1195(int arg0) {
        field2582 = null;
        if (arg0 == 0) {
            field2583 = null;
        }
    }
}
