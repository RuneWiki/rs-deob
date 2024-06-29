import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gha")
public class class366 {

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "F")
    public static float field4543;

    @OriginalMember(owner = "client!gha", name = "b", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!gha", name = "c", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!gha", name = "d", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!gha", name = "toString", descriptor = "()Ljava/lang/String;", line = 13)
    public final String toString() {
        field4546++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gha", name = "a", descriptor = "(III)Z", line = 22)
    public static final boolean method2133(int arg0, int arg1, int arg2) {
        int var3 = -104 % ((arg2 + 23) / 56);
        field4545++;
        return (arg0 & 0x10000) != 0;
    }
}
