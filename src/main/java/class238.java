import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class238 {

    @OriginalMember(owner = "client!og", name = "h", descriptor = "[I")
    public static int[] field3933 = new int[256];

    @OriginalMember(owner = "client!og", name = "g", descriptor = "Z")
    public static boolean field3932 = false;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "Lth;")
    public static class57 field3926;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "Z")
    public static boolean field3927;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "[Lml;")
    public static class17[] field3928;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V", line = 6)
    public static void method1816(byte arg0) {
        field3933 = null;
        field3928 = null;
        if (arg0 >= -97) {
            field3932 = true;
        }
        field3926 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BD)V", line = 21)
    public static final void method1817(byte arg0, double arg1) {
        if (arg0 < 24) {
            method1818(110, -6);
        }
        field3930++;
        if (class353.field5595 == arg1) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
            field3933[var3] = var4 <= 255 ? var4 : 255;
        }
        class353.field5595 = arg1;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)Ljava/lang/String;", line = 52)
    public static final String method1818(int arg0, int arg1) {
        field3929++;
        if (arg1 < 69) {
            field3932 = true;
        }
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }
}
