import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class217 {

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "[I")
    public static int[] field3852 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "Lqk;")
    public static class207 field3849 = class24.method212(255, "weiss:");

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "[I")
    public static int[] field3855 = new int[1000];

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "[I")
    public static int[] field3850;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "[[Z")
    public static boolean[][] field3853;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V")
    public static void method1550(int arg0) {
        field3852 = null;
        field3853 = null;
        field3850 = null;
        field3855 = null;
        if (arg0 != 1) {
            field3849 = null;
        }
        field3849 = null;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V")
    public static final void method1551(byte arg0) {
        if (arg0 != 45) {
            field3849 = null;
        }
        field3851++;
        if (!class212.method1512(-57) && class93.field1645 != class141.field2446) {
            class154.method1105(class199.field3500, (byte) 14, class93.field1645, class89.field1602, class202.field3565.field5074[0], class202.field3565.field5022[0], false);
        } else if (class93.field1645 != class78.field1429 && class13.method72(class93.field1645, 111)) {
            class78.field1429 = class93.field1645;
            class191.method1330(-98);
        }
    }
}
