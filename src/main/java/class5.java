import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!d")
public class class5 {

    @OriginalMember(owner = "mapview!d", name = "b", descriptor = "I")
    public static int field39 = 0;

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "Lda;")
    public static class6 field38 = new class6();

    @OriginalMember(owner = "mapview!d", name = "c", descriptor = "Ll;")
    public static class21 field40 = class28.method185(-20839, "(U");

    @OriginalMember(owner = "mapview!d", name = "f", descriptor = "Ll;")
    public static class21 field43 = class28.method185(-20839, "");

    @OriginalMember(owner = "mapview!d", name = "g", descriptor = "Ll;")
    public static class21 field44 = class28.method185(-20839, "loc)3dat");

    @OriginalMember(owner = "mapview!d", name = "e", descriptor = "Ll;")
    public static class21 field42 = class28.method185(-20839, "37(U");

    @OriginalMember(owner = "mapview!d", name = "d", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(I)V", line = 25)
    public static void method13(int arg0) {
        field44 = null;
        field38 = null;
        field40 = null;
        field42 = null;
        if (arg0 != 0) {
            method13(61);
        }
        field43 = null;
    }

    @OriginalMember(owner = "mapview!d", name = "a", descriptor = "(B)Lo;", line = 42)
    public static final class26 method14(byte arg0) {
        try {
            if (arg0 <= 74) {
                method13(-26);
            }
            return (class26) Class.forName("ca").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class11();
        }
    }
}
