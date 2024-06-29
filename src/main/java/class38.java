import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class38 {

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field1029 = 0;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "[I")
    public static int[] field1032 = new int[50];

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "Lkd;")
    private static class73 field1033 = class126.method1070((byte) -66, "System update in: ");

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field1034 = 0;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "Z")
    public static boolean field1028 = false;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "Lkd;")
    public static class73 field1031 = class126.method1070((byte) -66, "Bitte geben Sie Ihr Passwort ein)3");

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field1037 = 0;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "Lkd;")
    private static class73 field1038 = class126.method1070((byte) -66, "M");

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "Lkd;")
    public static class73 field1036 = class126.method1070((byte) -66, "hitmarks");

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "Lkd;")
    public static class73 field1039 = field1033;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "Lkd;")
    public static class73 field1035 = field1038;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "Lta;")
    public static class131 field1040 = new class131(32);

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "Lkd;")
    public static class73 field1042 = class126.method1070((byte) -66, "(U4");

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "[Lqc;")
    public static class114[] field1046 = new class114[2048];

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "Lkd;")
    public static class73 field1047 = class126.method1070((byte) -66, "p11_full");

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "Lkd;")
    private static class73 field1048 = class126.method1070((byte) -66, "Press (Wrecover a locked account(W on front page)3");

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "Lkd;")
    public static class73 field1043 = field1048;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "Lbc;")
    public static class11 field1030;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "Lua;")
    public static class137 field1027;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "Lde;")
    public static class27 field1045;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "[[B")
    public static byte[][] field1044;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)I")
    public static final int method300(int arg0, int arg1, int arg2) {
        field1026++;
        int var3 = arg2;
        while (arg1 > 0) {
            arg1--;
            var3 = arg0 & 0x1 | var3 << 1;
            arg0 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public static void method301(int arg0) {
        field1046 = null;
        field1038 = null;
        field1043 = null;
        field1040 = null;
        field1036 = null;
        field1031 = null;
        field1042 = null;
        field1033 = null;
        field1047 = null;
        field1035 = null;
        field1048 = null;
        field1044 = null;
        field1030 = null;
        field1027 = null;
        field1039 = null;
        field1045 = null;
        if (arg0 != 32) {
            method301(122);
        }
        field1032 = null;
    }
}
