import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class599 {

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "F")
    public static float field8831;

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "I")
    public static int field8832;

    @OriginalMember(owner = "client!qq", name = "toString", descriptor = "()Ljava/lang/String;", line = 9)
    public final String toString() {
        field8832++;
        throw new IllegalStateException();
    }
}
