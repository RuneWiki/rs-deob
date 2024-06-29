import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class768 extends class320 {

    @OriginalMember(owner = "client!ql", name = "F", descriptor = "Ljava/lang/Object;")
    private Object field10591;

    @OriginalMember(owner = "client!ql", name = "E", descriptor = "Z")
    public static volatile boolean field10590 = false;

    @OriginalMember(owner = "client!ql", name = "H", descriptor = "Laca;")
    public static class758 field10593 = new class758(4, 1);

    @OriginalMember(owner = "client!ql", name = "D", descriptor = "I")
    public static int field10589;

    @OriginalMember(owner = "client!ql", name = "G", descriptor = "I")
    public static int field10592;

    @OriginalMember(owner = "client!ql", name = "I", descriptor = "I")
    public static int field10594;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)V")
    public static final void method4227(int arg0, int arg1) {
        field10589++;
        if (arg0 != -18974) {
            method4228(true);
        }
        class430 var2 = (class430) class524.field7128.method337((long) arg1, 1);
        if (var2 != null) {
            var2.field5868.method702(arg0 + 14047);
            class567.method3276(-1, var2.field5866, var2.field5867);
            var2.method1207(90);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1512(byte arg0) {
        int var2 = -78 % ((-arg0 - 62) / 51);
        field10594++;
        return this.field10591;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(Z)V")
    public static void method4228(boolean arg0) {
        if (arg0) {
            method4227(-126, -69);
        }
        field10593 = null;
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class768(Object arg0, int arg1) {
        super(arg1);
        this.field10591 = arg0;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)Z")
    public final boolean method1511(int arg0) {
        field10592++;
        if (arg0 != 32404) {
            field10590 = true;
        }
        return false;
    }
}
