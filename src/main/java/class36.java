import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class36 {

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "Lvm;")
    public static class687 field518 = new class687();

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field519 = 0;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 3)
    public static final boolean method294(int arg0, String arg1) {
        field517++;
        int var2 = -42 / ((71 - arg0) / 49);
        if (arg1 == null) {
            return false;
        }
        for (int var3 = 0; var3 < class543.field7184; var3++) {
            if (arg1.equalsIgnoreCase(class310.field4452[var3])) {
                return true;
            }
            if (arg1.equalsIgnoreCase(class316.field4506[var3])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V", line = 35)
    public static void method295(byte arg0) {
        if (arg0 >= 92) {
            field518 = null;
        }
    }
}
