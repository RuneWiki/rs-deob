import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public abstract class class47 extends class363 {

    @OriginalMember(owner = "client!aea", name = "t", descriptor = "I")
    public int field631;

    @OriginalMember(owner = "client!aea", name = "v", descriptor = "[I")
    public static int[] field633 = new int[5];

    @OriginalMember(owner = "client!aea", name = "u", descriptor = "Lra;")
    public static class98 field632 = new class98();

    @OriginalMember(owner = "client!aea", name = "x", descriptor = "I")
    public static int field635 = 0;

    @OriginalMember(owner = "client!aea", name = "w", descriptor = "Z")
    public static boolean field634 = true;

    @OriginalMember(owner = "client!aea", name = "s", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(ZIIZB)Lpfa;", line = 6)
    public static final class275 method286(boolean arg0, int arg1, int arg2, boolean arg3, byte arg4) {
        field630++;
        if (arg4 < 49) {
            return null;
        }
        class237 var5 = null;
        if (class20.field223 != null) {
            var5 = new class237(arg1, class20.field223, class432.field5456[arg1], 1000000);
        }
        class304.field3854[arg1] = class186.field2195.method676(class657.field8935, arg1, 25505, var5);
        if (arg0) {
            class304.field3854[arg1].method3307(-66);
        }
        return new class275(class304.field3854[arg1], arg3, arg2);
    }

    @OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(I)V", line = 30)
    public class47(int arg0) {
        this.field631 = arg0;
    }

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "(I)V", line = 48)
    public static void method288(int arg0) {
        field633 = null;
        field632 = null;
        if (arg0 != 5) {
            field633 = null;
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method285(byte arg0);

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "(I)Z")
    public abstract boolean method287(int arg0);
}
