import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class652 {

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public int field8953;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field8954;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field8955;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field8956;

    @OriginalMember(owner = "client!fh", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8954++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public static final void method3686(int arg0) {
        if (arg0 <= 35) {
            method3686(98);
        }
        field8955++;
        class278.field3921.method999(0);
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class652(String arg0, int arg1) {
        this.field8953 = arg1;
    }
}
