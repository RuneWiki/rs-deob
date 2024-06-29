import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class70 {

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public int field948;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "Z")
    public static boolean field945 = true;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "Lln;")
    public static class237 field946;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "Lbh;")
    public static class429 field950;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "Lse;")
    public static class5 field951;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public static void method527(int arg0) {
        if (arg0 == -25864) {
            field951 = null;
            field950 = null;
            field946 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field949++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public class70(String arg0, String arg1, String arg2, int arg3) {
        this.field948 = arg3;
    }
}
