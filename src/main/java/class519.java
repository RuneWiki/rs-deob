import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class519 {

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "I")
    public int field7212;

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "I")
    public static int field7213 = 0;

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "I")
    public static int field7214;

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "I")
    public static int field7215;

    @OriginalMember(owner = "client!hv", name = "toString", descriptor = "()Ljava/lang/String;", line = 6)
    public final String toString() {
        field7214++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(II)V", line = 22)
    public class519(int arg0, int arg1) {
        this.field7212 = arg0;
    }
}
