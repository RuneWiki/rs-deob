import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class335 {

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "I")
    public static int field4669 = 0;

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "Lvh;")
    public static class125 field4672 = new class125(72, -1);

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "Lla;")
    public static class395 field4670;

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "Ljava/lang/Object;")
    public static Object field4673;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)V")
    public static void method1994(byte arg0) {
        field4670 = null;
        if (arg0 == 52) {
            field4673 = null;
            field4672 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4671++;
        throw new IllegalStateException();
    }
}
