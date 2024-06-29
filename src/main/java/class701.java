import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class701 {

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "[Lgga;")
    public static class332[] field9910 = new class332[8];

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public int field9909;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public int field9911;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public int field9912;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field9913;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public static void method3935(int arg0) {
        field9910 = null;
        if (arg0 >= -34) {
            field9910 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIB)I")
    public static final int method3936(int arg0, int arg1, byte arg2) {
        field9913++;
        if (arg1 == -2) {
            return 12345678;
        }
        if (arg2 != -10) {
            field9910 = null;
        }
        if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        }
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }
}
