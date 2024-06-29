import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class646 {

    @OriginalMember(owner = "client!w", name = "a", descriptor = "Lkfa;")
    public static class407 field8899 = new class407();

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field8901;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public static int field8902;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field8904;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "I")
    public static int field8906;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "Ltba;")
    public static class56 field8900;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "Lnaa;")
    public static class93 field8903;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "Z")
    public static boolean field8905;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IZI)Z")
    public static final boolean method3499(int arg0, boolean arg1, int arg2) {
        field8906++;
        if (!arg1) {
            method3500((byte) -47);
        }
        return class135.method849(0, arg0, arg2) & ((arg2 & 0x2000) != 0 | class327.method1934(arg2, arg0, -90) | class552.method3142(arg0, arg2, 65536));
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
    public static void method3500(byte arg0) {
        field8899 = null;
        field8903 = null;
        field8900 = null;
        if (arg0 < 31) {
            field8902 = 24;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lnga;ILkha;)V")
    public static final void method3501(class256 arg0, int arg1, class687 arg2) {
        field8901++;
        class395.field5507 = "";
        class304.field3906 = arg0;
        class514.field7245 = arg2;
        if (class525.field7419.startsWith("win")) {
            class395.field5507 = class395.field5507 + "windows/";
        } else if (class525.field7419.startsWith("linux")) {
            class395.field5507 = class395.field5507 + "linux/";
        } else if (class525.field7419.startsWith("mac")) {
            class395.field5507 = class395.field5507 + "macos/";
        }
        if (class304.field3906.field3240) {
            class395.field5507 = class395.field5507 + "msjava/";
        } else if (class525.field7420.startsWith("amd64") || class525.field7420.startsWith("x86_64")) {
            class395.field5507 = class395.field5507 + "x86_64/";
        } else if (class525.field7420.startsWith("i386") || class525.field7420.startsWith("i486") || class525.field7420.startsWith("i586") || class525.field7420.startsWith("x86")) {
            class395.field5507 = class395.field5507 + "x86/";
        } else if (class525.field7420.startsWith("ppc")) {
            class395.field5507 = class395.field5507 + "ppc/";
        } else {
            class395.field5507 = class395.field5507 + "universal/";
        }
        int var3 = 47 % ((arg1 - 82) / 38);
    }
}
