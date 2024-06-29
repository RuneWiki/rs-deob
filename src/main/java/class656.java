import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class656 {

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "[I")
    public static int[] field9160 = new int[32];

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "I")
    public static int field9158;

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "I")
    public static int field9159;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(BIZIILri;Lqk;)V")
    public static final void method3774(byte arg0, int arg1, boolean arg2, int arg3, int arg4, class97 arg5, class16 arg6) {
        if (arg0 != -111) {
            field9160 = null;
        }
        field9158++;
        class143.method1216(arg3, arg5, arg1, (byte) 111, arg2, arg4);
        class474.field7018 = arg6;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(I)V")
    public static void method3775(int arg0) {
        if (arg0 != -9884) {
            field9160 = null;
        }
        field9160 = null;
    }

    @OriginalMember(owner = "client!pw", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9159++;
        throw new IllegalStateException();
    }
}
