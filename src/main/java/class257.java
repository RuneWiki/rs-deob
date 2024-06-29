import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class257 extends class69 {

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public static int field3521 = 0;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "Lmha;")
    public static class419 field3523 = new class419(3, 2);

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "[I")
    public static int[] field3524 = new int[3];

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "J")
    public static long field3525;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)V", line = 10)
    public static void method1562(boolean arg0) {
        field3524 = null;
        field3523 = null;
        if (!arg0) {
            field3525 = 73L;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILs;)V", line = 34)
    public static final void method1563(int arg0, class282 arg1) {
        class507.field6771[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIB)I", line = 45)
    public static final int method1564(int arg0, int arg1, byte arg2) {
        field3519++;
        if (arg2 != 80) {
            method1564(26, -80, (byte) 11);
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
