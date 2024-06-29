import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class82 extends class106 {

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
    public int field1563;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
    public int field1560;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "Loc;")
    public static class151 field1561 = class137.method873(2, "mod_icons");

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "J")
    public static long field1562;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
    public static void method520(boolean arg0) {
        if (arg0) {
            method520(true);
        }
        field1561 = null;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(II)V")
    public class82(int arg0, int arg1) {
        this.field1563 = arg0;
        this.field1560 = arg1;
    }
}
