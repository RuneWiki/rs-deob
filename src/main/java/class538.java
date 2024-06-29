import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class538 extends class81 {

    @OriginalMember(owner = "client!ku", name = "l", descriptor = "[Leda;")
    public class563[] field7227;

    @OriginalMember(owner = "client!ku", name = "g", descriptor = "Lwp;")
    public static class453 field7222 = new class453(100, -2);

    @OriginalMember(owner = "client!ku", name = "j", descriptor = "Lbaa;")
    public static class593 field7225 = new class593(7, 0, 1, 1);

    @OriginalMember(owner = "client!ku", name = "k", descriptor = "Lnw;")
    public static class347 field7226 = new class347();

    @OriginalMember(owner = "client!ku", name = "f", descriptor = "I")
    public static int field7221;

    @OriginalMember(owner = "client!ku", name = "h", descriptor = "I")
    public static int field7223;

    @OriginalMember(owner = "client!ku", name = "i", descriptor = "I")
    public static int field7224;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2918(int arg0, byte arg1, int arg2) {
        if (arg1 < 104) {
            return false;
        } else {
            field7224++;
            return (arg0 & 0x800) != 0 | class395.method2123(arg0, arg2, (byte) 104) || class512.method2762(arg0, 55, arg2);
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Z)V")
    public static final void method2919(boolean arg0) {
        class598.field8405.method1316(32);
        field7223++;
        class316.field4061 = null;
        if (arg0) {
            class235.field2946 = 1;
        }
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)V")
    public static void method2920(int arg0) {
        field7222 = null;
        field7225 = null;
        field7226 = null;
        if (arg0 != -1) {
            field7226 = null;
        }
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "([Leda;)V")
    public class538(class563[] arg0) {
        this.field7227 = arg0;
    }
}
