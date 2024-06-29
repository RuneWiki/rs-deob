import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class675 {

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field9410;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3840(int arg0, byte arg1, int arg2) {
        field9410++;
        int var3 = 98 / ((14 - arg1) / 34);
        return (arg2 & 0x800) != 0;
    }
}
