import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class153 {

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IB)V", line = 5)
    public static final void method967(int arg0, byte arg1) {
        if (arg1 > -79) {
            field2104 = 75;
        }
        if (class217.field2826 == 0) {
            class149.field2066.method1786(arg0, 106);
        } else {
            class517.field7221 = arg0;
        }
        field2103++;
    }
}
