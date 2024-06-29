import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class261 {

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Lmt;")
    public static class517 field3901 = new class517(8);

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Laa;")
    public static class76 field3904 = new class76(76, 7);

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Lfr;")
    public static class497 field3905 = new class497();

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Lfr;")
    public static class497 field3906 = new class497();

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static void method1641(int arg0) {
        field3906 = null;
        field3901 = null;
        if (arg0 > -101) {
            method1641(7);
        }
        field3904 = null;
        field3905 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1642(String arg0, byte arg1) {
        field3903++;
        if (arg0.equals("")) {
            return;
        }
        if (arg1 >= -50) {
            method1641(-92);
        }
        class97.method758(class520.field7622, false);
        class467.field6797++;
        class43.field559.method2754(class521.method3084(arg0, 66), 5574);
        class43.field559.method2731(arg0, (byte) -65);
    }
}
