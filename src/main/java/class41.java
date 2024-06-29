import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class41 {

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!be", name = "toString", descriptor = "()Ljava/lang/String;", line = 6)
    public final String toString() {
        field647++;
        throw new IllegalStateException();
    }
}
