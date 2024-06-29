import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class719 {

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "I")
    public static int field9951;

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "I")
    public static int field9952;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(II)Lnd;")
    public static final class138 method4016(int arg0, int arg1) {
        field9952++;
        if (arg1 == 2570) {
            return class223.field3199 && class536.field7421 <= arg0 && arg0 <= class687.field9586 ? class94.field1092[arg0 - class536.field7421] : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hba", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9951++;
        throw new IllegalStateException();
    }
}
