import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class266 {

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field4132 = 0;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "F")
    public static float field4130;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!qg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4131++;
        throw new IllegalStateException();
    }
}
