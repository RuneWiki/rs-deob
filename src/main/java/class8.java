import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 {

    @OriginalMember(owner = "client!to", name = "c", descriptor = "I")
    public static int field188 = 0;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "I")
    public int field187;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "I")
    public int field190;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "I")
    public int field191;

    @OriginalMember(owner = "client!to", name = "g", descriptor = "Lfg;")
    public static class117 field192;

    @OriginalMember(owner = "client!to", name = "d", descriptor = "Z")
    public boolean field189;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)V")
    public static void method119(boolean arg0) {
        field192 = null;
        if (!arg0) {
            field188 = 52;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IZII)I")
    public static final int method120(int arg0, boolean arg1, int arg2, int arg3) {
        field186++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg2;
        } else {
            if (!arg1) {
                field188 = -123;
            }
            return var4 == 2 ? 4095 - arg3 : 4095 - arg2;
        }
    }
}
