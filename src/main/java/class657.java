import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class657 {

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field9290;

    @OriginalMember(owner = "client!tb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9290++;
        throw new IllegalStateException();
    }
}
