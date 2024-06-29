import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class560 {

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
    public static int field8076;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
    public static int field8077;

    @OriginalMember(owner = "client!qs", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8077++;
        throw new IllegalStateException();
    }
}
