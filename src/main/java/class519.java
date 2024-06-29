import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class519 {

    @OriginalMember(owner = "client!si", name = "b", descriptor = "Lnea;")
    public static class664 field7317 = new class664(18, 12);

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field7319 = 1;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "Ldg;")
    public static class376 field7318 = new class376(37, -1);

    @OriginalMember(owner = "client!si", name = "e", descriptor = "Z")
    public static boolean field7320 = false;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field7316;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V", line = 4)
    public static void method2964(boolean arg0) {
        if (arg0) {
            method2964(false);
        }
        field7318 = null;
        field7317 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILrda;IB)J", line = 18)
    public static final long method2965(int arg0, class614 arg1, int arg2, byte arg3) {
        field7316++;
        long var4 = 4194304L;
        if (arg3 >= -90) {
            return 54L;
        }
        long var6 = Long.MIN_VALUE;
        class550 var8 = class101.field1572.method2617((byte) -119, arg1.method1179(true));
        long var9 = (long) (arg1.method1186(-9960) | 0x10000 << 14 | arg0 << 7 | arg2 | arg1.method1175(24563) << 20);
        if (var8.field7746 == 0) {
            var9 |= var6;
        }
        if (var8.field7812 == 1) {
            var9 |= var4;
        }
        return var9 | (long) arg1.method1179(true) << 32;
    }
}
