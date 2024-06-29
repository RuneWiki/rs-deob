import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class83 {

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public int field2031 = 0;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public int field2040 = 0;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Lmb;")
    private static class84 field2026 = class79.method672(true, "Enter name of player to delete from list");

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "Lmb;")
    private static class84 field2027 = class79.method672(true, "Error loading your profile)3");

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Lmb;")
    private static class84 field2024 = class79.method672(true, "Invalid loginserver requested)3");

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "Lmb;")
    public static class84 field2032 = field2027;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Lmb;")
    public static class84 field2023 = field2026;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public static int field2034 = 0;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "Z")
    public static boolean field2036 = false;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field2038 = -1;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "Lmb;")
    public static class84 field2039 = field2024;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "Lmb;")
    public static class84 field2043 = class79.method672(true, "backvmid1");

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "Lsa;")
    public static class119 field2028 = new class119(200);

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "Z")
    public static boolean field2045 = false;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "I")
    public static int field2048 = 0;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "I")
    public static volatile int field2046 = -1;

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "Lmb;")
    public static class84 field2044 = class79.method672(true, "Hidden)2");

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "Lmb;")
    private static class84 field2047 = class79.method672(true, "We suspect someone knows your password)3");

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "Lmb;")
    public static class84 field2049 = field2047;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public int field2030;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public int field2033;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public int field2035;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public int field2037;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
    public int field2041;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "Ljf;")
    public class68 field2029;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "Ljf;")
    public class68 field2042;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public static void method692(int arg0) {
        field2043 = null;
        if (arg0 != 20516) {
            field2038 = 84;
        }
        field2044 = null;
        field2026 = null;
        field2047 = null;
        field2032 = null;
        field2028 = null;
        field2027 = null;
        field2039 = null;
        field2049 = null;
        field2023 = null;
        field2024 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IBLwc;)V")
    public static final void method693(int arg0, byte arg1, class145 arg2) {
        if (arg1 <= 71) {
            field2034 = -100;
        }
        class80.method681(arg0, arg2.field3535, 0, arg2.field3549);
        field2025++;
    }
}
