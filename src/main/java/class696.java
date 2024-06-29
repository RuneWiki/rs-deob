import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class696 {

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "Z")
    public static boolean field9755 = false;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "I")
    public static int field9754;

    @OriginalMember(owner = "client!aga", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field9754++;
        throw new IllegalStateException();
    }
}
