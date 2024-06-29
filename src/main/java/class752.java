import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class752 {

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public static int field10419 = 0;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public static int field10416;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    public static int field10420;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "Lm;")
    public class204 field10418;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "[Lfc;")
    public static class273[] field10417;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V")
    public static void method4186(boolean arg0) {
        field10417 = null;
        if (!arg0) {
            method4186(true);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIII)I")
    public static final int method4187(int arg0, int arg1, int arg2, int arg3) {
        field10416++;
        if ((class66.field931[arg3][arg2][arg0] & 0x8) != 0) {
            return 0;
        } else if (arg3 <= 0 || (class66.field931[1][arg2][arg0] & 0x2) == 0) {
            if (arg1 != 2) {
                field10420 = 111;
            }
            return arg3;
        } else {
            return arg3 - 1;
        }
    }
}
