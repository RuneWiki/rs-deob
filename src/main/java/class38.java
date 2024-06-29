import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uja")
public abstract class class38 {

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "Lke;")
    public static class622 field631 = new class622(21, 1);

    @OriginalMember(owner = "client!uja", name = "b", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!uja", name = "c", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(Z)V", line = 5)
    public static void method272(boolean arg0) {
        field631 = null;
        if (!arg0) {
            field633 = 29;
        }
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(II)I", line = 22)
    public static final int method273(int arg0, int arg1) {
        field632++;
        int var2 = arg1 & 0x3F;
        int var3 = arg1 >> 6 & arg0;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(B)J")
    public abstract long method274(byte arg0);
}
