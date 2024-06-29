import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class526 {

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public int field7739;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "Leh;")
    public static class246 field7738 = new class246(37, 8);

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public static int field7740 = 0;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public static int field7736;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public static int field7737;

    @OriginalMember(owner = "client!ql", name = "toString", descriptor = "()Ljava/lang/String;", line = 6)
    public final String toString() {
        field7736++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V", line = 14)
    public static void method3108(int arg0) {
        if (arg0 == 0) {
            field7738 = null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lwm;II)Ljava/lang/String;", line = 26)
    public static final String method3109(class403 arg0, int arg1, int arg2) {
        field7737++;
        try {
            int var3 = arg0.method2325(true);
            if (var3 > arg1) {
                var3 = arg1;
            }
            if (arg2 != 26702) {
                method3109(null, 30, -47);
            }
            byte[] var4 = new byte[var3];
            arg0.field5665 += class256.field3814.method1533(0, arg0.field5663, arg0.field5665, var3, var4, 0);
            return class538.method3165((byte) 64, var3, 0, var4);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(II)V", line = 59)
    public class526(int arg0, int arg1) {
        this.field7739 = arg0;
    }
}
