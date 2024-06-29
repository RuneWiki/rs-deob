import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class714 {

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "Ljo;")
    public static class351 field10073 = new class351(32, 7);

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "D")
    public static double field10071;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
    public int field10072;

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
    public int field10074;

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "I")
    public int field10075;

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "I")
    public int field10076;

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "I")
    public static int field10077;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V", line = 5)
    public static void method4040(int arg0) {
        int var1 = 28 % ((14 - arg0) / 36);
        field10073 = null;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IBI)Z", line = 20)
    public static final boolean method4041(int arg0, byte arg1, int arg2) {
        if (arg1 <= 31) {
            field10073 = null;
        }
        field10077++;
        return (arg2 & 0x18) != 0 | (arg2 & 0x220) == 544;
    }
}
