import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qfa")
public class class385 {

    @OriginalMember(owner = "client!qfa", name = "b", descriptor = "Ljn;")
    public static class134 field5504 = new class134(57, 6);

    @OriginalMember(owner = "client!qfa", name = "d", descriptor = "I")
    public static int field5506 = -1;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!qfa", name = "c", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(BII)Z", line = 7)
    public static final boolean method2391(byte arg0, int arg1, int arg2) {
        field5503++;
        int var3 = -93 / ((arg0 - 5) / 42);
        return (arg2 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!qfa", name = "a", descriptor = "(I)V", line = 19)
    public static void method2392(int arg0) {
        field5504 = null;
        if (arg0 >= -57) {
            field5505 = -46;
        }
    }
}
