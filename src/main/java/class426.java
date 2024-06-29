import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hja")
public class class426 {

    @OriginalMember(owner = "client!hja", name = "b", descriptor = "I")
    public static int field6202 = 0;

    @OriginalMember(owner = "client!hja", name = "d", descriptor = "Lkw;")
    public static class263 field6204 = null;

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!hja", name = "c", descriptor = "I")
    public static int field6203;

    @OriginalMember(owner = "client!hja", name = "toString", descriptor = "()Ljava/lang/String;", line = 12)
    public final String toString() {
        field6201++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hja", name = "a", descriptor = "(B)V", line = 20)
    public static void method2574(byte arg0) {
        field6204 = null;
        if (arg0 != 99) {
            field6202 = 94;
        }
    }
}
