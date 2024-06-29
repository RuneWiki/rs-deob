import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class213 extends class6 {

    @OriginalMember(owner = "client!hs", name = "P", descriptor = "I")
    public static int field2891 = 0;

    @OriginalMember(owner = "client!hs", name = "Q", descriptor = "I")
    public static int field2892 = 0;

    @OriginalMember(owner = "client!hs", name = "R", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(BI)Lcr;")
    public static final class403 method1345(byte arg0, int arg1) {
        int var2 = -57 / ((arg0 + 51) / 52);
        field2893++;
        int var3 = arg1 >> 16;
        int var4 = arg1 & 0xFFFF;
        if (class238.field3185[var3] == null || class238.field3185[var3][var4] == null) {
            boolean var5 = class28.method230(var3, 110);
            if (!var5) {
                return null;
            }
        }
        return class238.field3185[var3][var4];
    }
}
