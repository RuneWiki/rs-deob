import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class114 {

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "Lsg;")
    public static class169 field2077 = class165.method1060("und Ihr Passwort ein)3", 1536);

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "Lsg;")
    private static class169 field2076 = class165.method1060("Please remove ", 1536);

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "Lsg;")
    public static class169 field2080 = field2076;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "Lsg;")
    public static class169 field2071 = field2076;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "Lsg;")
    public static class169 field2085 = class165.method1060("Fallen lassen", 1536);

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "Lua;")
    public static class181 field2084 = new class181(64);

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public static int field2086 = -1;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public int field2072;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public int field2075;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public int field2078;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public int field2079;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public int field2083;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "Lac;")
    public class4 field2073;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "Lac;")
    public class4 field2074;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "Lac;")
    public class4 field2082;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "Lhg;")
    public static class71 field2087;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public static void method698(int arg0) {
        field2085 = null;
        field2084 = null;
        field2076 = null;
        field2071 = null;
        if (arg0 != 0) {
            method698(118);
        }
        field2077 = null;
        field2080 = null;
        field2087 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
    public static final void method699(byte arg0) {
        class174.field3374.method265(-127);
        for (int var1 = 0; var1 < 32; var1++) {
            class125.field2289[var1] = 0L;
        }
        if (arg0 != -103) {
            field2085 = null;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class26.field533[var2] = 0L;
        }
        class81.field1492 = 0;
        field2081++;
    }
}
