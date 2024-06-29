import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class339 {

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field5458 = 0;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "[C")
    public static char[] field5459 = new char[128];

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "Lah;")
    public static class176 field5460;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "Llj;")
    public static class289 field5456;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)Ljava/lang/String;", line = 6)
    public static final String method2389(int arg0) {
        String var1 = "";
        String var2 = "www";
        if (arg0 != 10592) {
            method2390(43);
        }
        if (class290.field4818 != 0) {
            var2 = "www-wtqa";
        }
        if (class219.field3370 != null) {
            var1 = "/p=" + class219.field3370;
        }
        field5461++;
        return "http://" + var2 + ".runescape.com/l=" + class334.field5418 + "/a=" + class289.field4807 + var1 + "/";
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V", line = 29)
    public static void method2390(int arg0) {
        int var1 = -1 % ((arg0 + 62) / 59);
        field5460 = null;
        field5456 = null;
        field5459 = null;
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V", line = 40)
    public static final void method2391(int arg0) {
        if (arg0 <= 57) {
            field5456 = (class289) null;
        }
        class33.field501++;
        field5455++;
    }
}
