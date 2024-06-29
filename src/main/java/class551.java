import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class551 {

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "I")
    public int field7726;

    @OriginalMember(owner = "client!jw", name = "b", descriptor = "I")
    public static int field7727;

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "I")
    public static int field7728;

    @OriginalMember(owner = "client!jw", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7727++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jw", name = "<init>", descriptor = "(II)V")
    public class551(int arg0, int arg1) {
        this.field7726 = arg1;
    }
}
