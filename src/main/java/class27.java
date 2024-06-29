import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class27 {

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "Z")
    public static boolean field350 = true;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field352 = 0;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "Lsk;")
    public static class423 field349 = new class423("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "[I")
    public static int[] field351;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V", line = 12)
    public static void method137(byte arg0) {
        field351 = null;
        if (arg0 != -24) {
            method138(-114, (byte) 95, -29);
        }
        field349 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBI)I", line = 23)
    public static final int method138(int arg0, byte arg1, int arg2) {
        field348++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg0 & 0x7F) * arg2 >> 7;
            if (arg1 != 56) {
                field349 = null;
            }
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }
}
