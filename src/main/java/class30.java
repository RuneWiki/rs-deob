import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class30 {

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "Lja;")
    public static class62 field737 = method243(43, " Sekunde(Xn(Y -Ubertragen)3");

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Lja;")
    public static class62 field741 = method243(43, "Freie Welt");

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field744 = 0;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "Lja;")
    private static class62 field748 = method243(43, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "Lja;")
    private static class62 field742 = method243(43, "flash3:");

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "Lja;")
    private static class62 field749 = method243(43, "Please wait )2 attempting to reestablish");

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "Lja;")
    public static class62 field743 = field749;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Lja;")
    public static class62 field746 = field748;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "Lja;")
    public static class62 field750 = field742;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "Lja;")
    public static class62 field736 = field742;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "[I")
    public static int[] field738;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILjava/lang/String;)Lja;")
    public static final class62 method243(int arg0, String arg1) {
        if (arg0 != 43) {
            method243(18, null);
        }
        field745++;
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        int var4 = 0;
        class62 var5 = new class62();
        var5.field1504 = new byte[var3];
        while (var3 > var4) {
            int var6 = var2[var4++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var4 >= var3) {
                    break;
                }
                int var7 = var2[var4++] & 0xFF;
                var5.field1504[var5.field1538++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var5.field1504[var5.field1538++] = (byte) var6;
            }
        }
        var5.method437((byte) 84);
        return var5.method455(arg0 - 48);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
    public static void method244(boolean arg0) {
        field749 = null;
        field743 = null;
        if (arg0) {
            field749 = null;
        }
        field748 = null;
        field742 = null;
        field750 = null;
        field741 = null;
        field738 = null;
        field736 = null;
        field746 = null;
        field737 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method245(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field739++;
        if (class29.method241(arg7, arg2 ^ 0xFFFFFFA6)) {
            if (arg2 != 89) {
                method246(-57, (byte) -46, -10);
            }
            class13.method99(arg0, arg3, class131.field2990[arg7], arg1, -1, (byte) 127, arg6, arg4, arg5);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IBI)V")
    public static final void method246(int arg0, byte arg1, int arg2) {
        field747++;
        if (class116.field2676 != 2) {
            return;
        }
        if (arg1 >= -61) {
            method245(-127, 79, (byte) -87, 15, 93, -53, 32, -18);
        }
        class79.method628((class82.field1978 - class40.field926 << 7) + class48.field1119, (byte) 69, class150.field3527 * 2, (class144.field3356 - class27.field673 << 7) + class124.field2818);
        if (class119.field2729 > -1 && class86.field2060 % 20 < 10) {
            class115.field2644[0].method417(class119.field2729 + arg2 - 12, class68.field1688 + arg0 + -28);
        }
    }
}
