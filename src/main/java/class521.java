import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class521 {

    @OriginalMember(owner = "client!k", name = "b", descriptor = "Lwt;")
    public static class509 field7221 = class103.method556(255);

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field7220;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field7224;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field7225;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "[Lxa;")
    public static class424[] field7222;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "[Z")
    public static boolean[] field7223;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public static void method2976(int arg0) {
        field7221 = null;
        field7223 = null;
        field7222 = null;
        if (arg0 != 22278) {
            method2977((byte) -82);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
    public static final void method2977(byte arg0) {
        field7224++;
        if (arg0 == -9) {
            class147.field1855.method2510(-1);
            class45.field608.method2510(arg0 ^ 0x8);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)Z")
    public static final boolean method2978(int arg0, int arg1) {
        field7225++;
        if (arg0 == 0) {
            return arg1 == 22 || arg1 == 48 || arg1 == 1009 || arg1 == 4 || arg1 == 5;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(II)V")
    public static final void method2979(int arg0, int arg1) {
        field7220++;
        class19 var2 = class364.method2236(arg1 ^ 0x4A64BFA9, arg0, arg1);
        var2.method104(10);
    }
}
