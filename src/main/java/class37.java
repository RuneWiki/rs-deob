import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class37 extends class146 {

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    public static int field880 = 0;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "Lec;")
    private static class32 field883 = class73.method594("Please enter your username)3", true);

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "Lec;")
    private static class32 field879 = class73.method594("Password: ", true);

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "Lec;")
    public static class32 field878 = class73.method594("Anmelde)2Zeitlimit -Uberschritten)3", true);

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "Lec;")
    public static class32 field890 = field879;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "Z")
    public static boolean field889 = false;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
    public static int field892 = -1;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "I")
    public static int field884 = 1;

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "Lec;")
    public static class32 field893 = field883;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "Lja;")
    public static class63 field887 = new class63(64);

    @OriginalMember(owner = "client!fa", name = "M", descriptor = "Lec;")
    public static class32 field896 = class73.method594("Benutzername: ", true);

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "Lec;")
    private static class32 field898 = class73.method594("Login", true);

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "Lec;")
    public static class32 field894 = field898;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "B")
    public byte field881;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "I")
    public int field888;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!fa", name = "N", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "Lqe;")
    public static class116 field882;

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "Lec;")
    public class32 field886;

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "[I")
    public static int[] field895;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V")
    public static void method314(byte arg0) {
        field898 = null;
        field879 = null;
        field882 = null;
        field894 = null;
        field883 = null;
        field893 = null;
        if (arg0 < 115) {
            field898 = null;
        }
        field895 = null;
        field887 = null;
        field896 = null;
        field890 = null;
        field878 = null;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)Luf;")
    public static final class145 method315(byte arg0) {
        field891++;
        if (arg0 != -4) {
            field882 = null;
        }
        try {
            return (class145) Class.forName("ic").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }
}
