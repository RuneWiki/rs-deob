import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public abstract class class276 {

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "Llc;")
    public static class143 field4883 = class66.method374("T", -1);

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "Llc;")
    public static class143 field4884 = class66.method374(")4a=", -1);

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "Llc;")
    public static class143 field4882 = class66.method374("<img=0>", -1);

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "Llc;")
    public static class143 field4885 = class66.method374("Veuillez patienter)3)3)3", -1);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z[B)V")
    public abstract void method6(boolean arg0, byte[] arg1);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public static void method1816(int arg0) {
        field4883 = null;
        field4884 = null;
        field4885 = null;
        field4882 = null;
        if (arg0 != -58) {
            field4883 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)[B")
    public abstract byte[] method7(byte arg0);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1817(boolean arg0, int arg1) {
        if (!arg0) {
            field4882 = null;
        }
        field4881++;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }
}
