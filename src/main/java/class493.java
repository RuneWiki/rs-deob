import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class493 {

    @OriginalMember(owner = "client!td", name = "c", descriptor = "Leda;")
    public static class116 field7073 = new class116(102, 8);

    @OriginalMember(owner = "client!td", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field7075 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!td", name = "f", descriptor = "[Z")
    public static boolean[] field7076 = new boolean[8];

    @OriginalMember(owner = "client!td", name = "g", descriptor = "Lvn;")
    public static class186 field7077 = new class186();

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field7071;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field7072;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Lwv;")
    public static class705 field7074;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V", line = 5)
    public static void method2885(int arg0) {
        field7075 = null;
        int var1 = 81 / ((-arg0 - 75) / 45);
        field7073 = null;
        field7074 = null;
        field7077 = null;
        field7076 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V", line = 20)
    public static final void method2886(boolean arg0) {
        field7072++;
        for (class693 var1 = (class693) class33.field477.method3905(-124); var1 != null; var1 = (class693) class33.field477.method3899(0)) {
            if (var1.field9828) {
                var1.method3908(61);
            }
        }
        if (!arg0) {
            field7075 = null;
        }
        for (class693 var2 = (class693) class522.field7687.method3905(-125); var2 != null; var2 = (class693) class522.field7687.method3899(0)) {
            if (var2.field9828) {
                var2.method3908(50);
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V", line = 54)
    public static final void method2887(int arg0) {
        if (arg0 < -86) {
            field7071++;
            class624.field8898.method2821(1);
        }
    }
}
