import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class174 extends class101 {

    @OriginalMember(owner = "client!ada", name = "o", descriptor = "Lwp;")
    public class192 field2336;

    @OriginalMember(owner = "client!ada", name = "n", descriptor = "I")
    public static int field2335 = 0;

    @OriginalMember(owner = "client!ada", name = "r", descriptor = "[Lvga;")
    public static class93[] field2339 = null;

    @OriginalMember(owner = "client!ada", name = "p", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!ada", name = "q", descriptor = "Z")
    public static boolean field2338;

    @OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(Lwp;)V", line = 8)
    public class174(class192 arg0) {
        this.field2336 = arg0;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)V", line = 17)
    public static void method1239(int arg0) {
        if (arg0 != -28815) {
            method1239(-62);
        }
        field2339 = null;
    }
}
