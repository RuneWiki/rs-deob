import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class236 extends class184 {

    @OriginalMember(owner = "client!qm", name = "z", descriptor = "I")
    public int field4144;

    @OriginalMember(owner = "client!qm", name = "w", descriptor = "I")
    public static int field4141 = 0;

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!qm", name = "y", descriptor = "Lsf;")
    public static class108 field4143;

    @OriginalMember(owner = "client!qm", name = "A", descriptor = "Lvc;")
    public static class193 field4145;

    @OriginalMember(owner = "client!qm", name = "x", descriptor = "[Z")
    public static boolean[] field4142;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIII)V", line = 8)
    public static final void method1634(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class260.field4593 <= arg0 && arg1 <= class79.field1202 && class266.field4677 <= arg3 && class166.field2984 >= arg2) {
            class191.method1353(arg0, arg4 + 74, arg1, arg2, arg3, arg5);
        } else {
            class272.method1971(true, arg2, arg0, arg5, arg1, arg3);
        }
        field4140++;
        if (arg4 != 0) {
            field4141 = -110;
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(B)V", line = 26)
    public static void method1635(byte arg0) {
        field4145 = null;
        field4142 = null;
        field4143 = null;
        if (arg0 != 42) {
            field4141 = 18;
        }
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V", line = 51)
    public class236() {
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(I)V", line = 53)
    public class236(int arg0) {
        this.field4144 = arg0;
    }
}
