import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class229 extends class570 {

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "Lsb;")
    public class89 field3704;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "Lwk;")
    public static class430 field3701 = new class430(8, 4);

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "Lro;")
    public static class522 field3703;

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "[Z")
    public static boolean[] field3705;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)Z")
    public static final boolean method1597(int arg0) {
        if (arg0 < 55) {
            method1597(-15);
        }
        class115.field1786 = true;
        field3702++;
        class110.field1714++;
        return true;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V")
    public static void method1598(byte arg0) {
        if (arg0 < 60) {
            field3701 = null;
        }
        field3701 = null;
        field3703 = null;
        field3705 = null;
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lrs;II[B)V")
    public class229(class166 arg0, int arg1, int arg2, byte[] arg3) {
        this.field3704 = class582.method3357(arg2, 6406, 6406, arg0, 0, arg3, arg1, false);
        this.field3704.method3862(false, false, -29630);
    }
}
