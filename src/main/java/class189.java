import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class189 {

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field2445 = 0;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field2446 = 0;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field2447 = 0;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!be", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2444++;
        throw new IllegalStateException();
    }
}
