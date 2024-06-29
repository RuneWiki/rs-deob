import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class79 {

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "Lgga;")
    public class267 field999 = new class267();

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "I")
    public static int field997 = 1;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(BII)Z", line = 3)
    public static final boolean method765(byte arg0, int arg1, int arg2) {
        field998++;
        int var3 = 45 % ((-arg0 - 27) / 42);
        return (arg1 & 0x800) != 0;
    }
}
