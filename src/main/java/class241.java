import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uea")
public class class241 extends class430 {

    @OriginalMember(owner = "client!uea", name = "g", descriptor = "I")
    public int field3562 = -1;

    @OriginalMember(owner = "client!uea", name = "o", descriptor = "Z")
    public boolean field3570 = false;

    @OriginalMember(owner = "client!uea", name = "h", descriptor = "Lrf;")
    public static class749 field3563 = new class749();

    @OriginalMember(owner = "client!uea", name = "k", descriptor = "[Lsn;")
    public static class159[] field3566 = new class159[100];

    @OriginalMember(owner = "client!uea", name = "i", descriptor = "I")
    public int field3564;

    @OriginalMember(owner = "client!uea", name = "j", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!uea", name = "m", descriptor = "I")
    public int field3568;

    @OriginalMember(owner = "client!uea", name = "n", descriptor = "I")
    public int field3569;

    @OriginalMember(owner = "client!uea", name = "p", descriptor = "I")
    public int field3571;

    @OriginalMember(owner = "client!uea", name = "q", descriptor = "I")
    public int field3572;

    @OriginalMember(owner = "client!uea", name = "l", descriptor = "Lbga;")
    public static class169 field3567;

    @OriginalMember(owner = "client!uea", name = "r", descriptor = "Lla;")
    public static class423 field3573;

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(B)V", line = 9)
    public static void method1660(byte arg0) {
        field3566 = null;
        field3563 = null;
        if (arg0 > -48) {
            method1661(-54);
        }
        field3567 = null;
        field3573 = null;
    }

    @OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(I)V", line = 59)
    public class241(int arg0) {
        this.field3562 = arg0;
    }

    @OriginalMember(owner = "client!uea", name = "a", descriptor = "(I)Z", line = 37)
    public static final boolean method1661(int arg0) {
        field3565++;
        if (arg0 != -1) {
            field3573 = null;
        }
        if (class525.field7640) {
            try {
                if ((Boolean) class665.method3803(class486.field6999, "showingVideoAd", (byte) 113)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }
}
