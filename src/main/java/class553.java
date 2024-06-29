import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public abstract class class553 extends class11 {

    @OriginalMember(owner = "client!vs", name = "u", descriptor = "Lhg;")
    public class648 field7348;

    @OriginalMember(owner = "client!vs", name = "v", descriptor = "I")
    public int field7349;

    @OriginalMember(owner = "client!vs", name = "t", descriptor = "I")
    public static int field7347;

    @OriginalMember(owner = "client!vs", name = "w", descriptor = "I")
    public static int field7350;

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lhg;I)V", line = 7)
    public class553(class648 arg0, int arg1) {
        this.field7348 = arg0;
        this.field7349 = arg1;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIIIIII)V", line = 17)
    public static final void method3064(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 26 / ((56 - arg0) / 44);
        if (class600.field7959 <= (arg4 - arg6) && (arg4 + arg6) <= class366.field4956 && (arg5 - arg6) >= class310.field4279 && (arg5 + arg6) <= class442.field6058) {
            class41.method303(arg5, arg3, arg6, -1, arg2, arg1, arg4);
        } else {
            class396.method2273(arg6, arg5, arg1, arg3, 0, arg4, arg2);
        }
        field7347++;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)Z")
    public abstract boolean method118(int arg0);

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method117(int arg0);
}
