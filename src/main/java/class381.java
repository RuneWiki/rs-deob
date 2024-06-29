import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class381 {

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "I")
    public static int field5773;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "I")
    public static int field5774;

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "I")
    public static int field5775;

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
    public static int field5776;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IC)I")
    public static final int method2446(int arg0, char arg1) {
        field5773++;
        return arg0 >= ~arg1 && class585.field8405.length > arg1 ? class585.field8405[arg1] : -1;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2447(int arg0, byte arg1, int arg2) {
        field5776++;
        int var3 = -41 % ((-arg1 - 42) / 56);
        return (arg0 & 0x400) != 0;
    }
}
