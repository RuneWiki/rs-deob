import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class266 {

    @OriginalMember(owner = "client!mda", name = "f", descriptor = "Llh;")
    public class526 field3774 = new class526();

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "[[I")
    public static int[][] field3771 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "I")
    public static int field3770 = 0;

    @OriginalMember(owner = "client!mda", name = "d", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!mda", name = "e", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!mda", name = "g", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!mda", name = "h", descriptor = "I")
    public static int field3776;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "Lma;")
    public static class12 field3769;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIB)Z", line = 3)
    public static final boolean method1766(int arg0, int arg1, byte arg2) {
        if (arg2 != -127) {
            field3771 = null;
        }
        field3772++;
        return class144.method1133((byte) 126, arg0, arg1) || class601.method3424((byte) -107, arg1, arg0);
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Ljava/lang/String;I)[B", line = 20)
    public static final byte[] method1767(String arg0, int arg1) {
        field3776++;
        int var2 = arg0.length();
        if (var2 == 0) {
            return new byte[0];
        }
        int var3 = var2 + 3 & 0xFFFFFFFC;
        int var4 = var3 / 4 * 3;
        if (var3 - 2 >= var2 || class453.method2695(7, arg0.charAt(var3 - 2)) == -1) {
            var4 -= 2;
        } else if (var2 <= var3 - 1 || class453.method2695(7, arg0.charAt(var3 - 1)) == -1) {
            var4--;
        }
        if (arg1 > -92) {
            method1766(-51, -45, (byte) -74);
        }
        byte[] var5 = new byte[var4];
        class42.method537(var5, (byte) 0, arg0, 0);
        return var5;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)V", line = 68)
    public static void method1768(int arg0) {
        field3769 = null;
        if (arg0 > 67) {
            field3771 = null;
        }
    }
}
