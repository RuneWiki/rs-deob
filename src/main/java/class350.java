import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class350 {

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "[Lnf;")
    public static class604[] field4695;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BII)I", line = 10)
    public static final int method2155(byte arg0, int arg1, int arg2) {
        if (arg0 <= 14) {
            field4695 = null;
        }
        field4696++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V", line = 35)
    public static void method2156(boolean arg0) {
        field4695 = null;
        if (arg0) {
            field4695 = null;
        }
    }
}
