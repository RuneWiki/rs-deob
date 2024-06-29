import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class88 {

    @OriginalMember(owner = "client!o", name = "e", descriptor = "Lkc;")
    private static class67 field2025 = class19.method144("Loaded title screen", 98);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field2021 = 0;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field2031 = 0;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "Lkc;")
    public static class67 field2029 = field2025;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "Lbb;")
    public static class10 field2026 = new class10();

    @OriginalMember(owner = "client!o", name = "l", descriptor = "Lkc;")
    private static class67 field2032 = class19.method144("The server is being updated)3", 100);

    @OriginalMember(owner = "client!o", name = "m", descriptor = "Lkc;")
    public static class67 field2033 = field2032;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "Z")
    public static boolean field2034 = false;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "I")
    public static volatile int field2035 = 0;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BI)Led;", line = 3)
    public static final class33 method685(byte arg0, int arg1) {
        field2030++;
        if (arg0 >= -92) {
            return null;
        }
        int var2 = arg1 & 0xFFFF;
        int var3 = arg1 >> 16;
        if (class54.field1305[var3] == null || class54.field1305[var3][var2] == null) {
            boolean var4 = class42.method365(86, var3);
            if (!var4) {
                return null;
            }
        }
        return class54.field1305[var3][var2];
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(BI)V", line = 37)
    public static final void method686(byte arg0, int arg1) {
        field2028++;
        class101.method773(1, arg1);
        class109.method831(121, arg1);
        if (arg0 != 2) {
            method685((byte) 47, 13);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIB)I", line = 64)
    public static final int method687(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 < 62) {
            return 52;
        }
        field2027++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V", line = 101)
    public static void method688(int arg0) {
        field2033 = null;
        field2026 = null;
        field2025 = null;
        if (arg0 == -27768) {
            field2029 = null;
            field2032 = null;
        }
    }
}
