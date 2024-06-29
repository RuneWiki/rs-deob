import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class304 {

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "[Ljava/lang/String;")
    private String[] field4002;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "[I")
    public static int[] field4005 = new int[13];

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "Lqe;")
    public static class326 field4004;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "Lf;")
    public static class529 field4003;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V", line = 49)
    public static void method1763(int arg0) {
        if (arg0 < 18) {
            method1763(-102);
        }
        field4003 = null;
        field4005 = null;
        field4004 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IZ)Ljava/lang/String;", line = 82)
    public final String method1764(int arg0, boolean arg1) {
        field4006++;
        return arg1 ? null : this.field4002[arg0];
    }

    @OriginalMember(owner = "client!vj", name = "toString", descriptor = "()Ljava/lang/String;", line = 117)
    public final String toString() {
        field4007++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 139)
    public class304(String arg0, String arg1, String arg2, String arg3) {
        this.field4002 = new String[] { arg0, arg1, arg2, arg3 };
    }
}
