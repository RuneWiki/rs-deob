import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class504 {

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "[I")
    public static int[] field7296 = new int[16];

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "I")
    public static int field7298 = 0;

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "Lig;")
    public static class206 field7297 = new class206(34, 8);

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "I")
    public static int field7299;

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "I")
    public static int field7300;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZI)V")
    public static final void method3002(boolean arg0, int arg1) {
        if (!arg0) {
            field7298 = -99;
        }
        field7300++;
        class467 var2 = class541.method3144(arg1, (byte) -122, 12);
        var2.method2852(0);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(BII)Z")
    public static final boolean method3003(byte arg0, int arg1, int arg2) {
        int var3 = 38 % ((-arg0 - 10) / 38);
        field7299++;
        return false;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)V")
    public static void method3004(boolean arg0) {
        field7296 = null;
        field7297 = null;
        if (!arg0) {
            field7298 = -122;
        }
    }
}
