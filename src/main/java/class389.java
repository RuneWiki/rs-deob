import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class389 {

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "Lqp;")
    public static class715 field5608 = new class715(64);

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "Lmr;")
    public static class611 field5612 = new class611();

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)I", line = 6)
    public static final int method2387(int arg0, int arg1, int arg2) {
        if (arg2 < 3) {
            method2387(-26, 97, 30);
        }
        field5607++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg1 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V", line = 50)
    public static void method2388(int arg0) {
        field5612 = null;
        if (arg0 == -1) {
            field5608 = null;
        }
    }
}
