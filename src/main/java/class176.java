import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class176 {

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
    public int field2617;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    public static int field2619 = 0;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!pq", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        field2618++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(II)V", line = 20)
    public class176(int arg0, int arg1) {
        this.field2617 = arg0;
    }
}
