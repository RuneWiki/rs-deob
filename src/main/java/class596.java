import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public abstract class class596 {

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Llg;")
    public static class32 field8213 = new class32(9, 0, 4, 1);

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "F")
    public static float field8215;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field8214;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field8216;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field8218;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "[Lf;")
    public static class532[] field8217;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V", line = 9)
    public static void method3308(int arg0) {
        field8217 = null;
        field8213 = null;
        if (arg0 <= 97) {
            method3309(null, false);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/String;Z)[B", line = 22)
    public static final byte[] method3309(String arg0, boolean arg1) {
        if (!arg1) {
            method3309(null, true);
        }
        field8218++;
        int var2 = arg0.length();
        if (var2 == 0) {
            return new byte[0];
        }
        int var3 = var2 + 3 & 0xFFFFFFFC;
        int var4 = var3 / 4 * 3;
        if ((var3 - 2) >= var2 || class589.method3258((byte) -128, arg0.charAt(var3 - 2)) == -1) {
            var4 -= 2;
        } else if (var2 <= var3 - 1 || class589.method3258((byte) -107, arg0.charAt(var3 - 1)) == -1) {
            var4--;
        }
        byte[] var5 = new byte[var4];
        class326.method1897(16038, 0, var5, arg0);
        return var5;
    }
}
