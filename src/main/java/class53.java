import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class53 {

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "Z")
    public static volatile boolean field1088 = true;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "Lbc;")
    public static class11 field1085 = new class11(64);

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "Lpe;")
    public static class109 field1089 = class141.method1120("zur-Uck auf die RuneScape)2Webseite gehen", 0);

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "[I")
    public static int[] field1092 = new int[32];

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "Lpe;")
    private static class109 field1091 = class141.method1120("Please contact customer support)3", 0);

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "Lpe;")
    public static class109 field1090 = field1091;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "[Lbe;")
    public static class13[] field1094;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "Lpe;")
    public static class109 field1097;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "Lpe;")
    public static class109 field1096;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "Lpe;")
    private static class109 field1095;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "Lpe;")
    public static class109 field1102;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "J")
    public static long field1098;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "Lpe;")
    private static class109 field1101;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "Lpe;")
    public static class109 field1100;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "Lpe;")
    public static class109 field1099;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1093;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "[[B")
    public static byte[][] field1103;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
    public static void method433(boolean arg0) {
        field1102 = null;
        field1101 = null;
        field1094 = null;
        if (arg0) {
            return;
        }
        field1085 = null;
        field1100 = null;
        field1103 = null;
        field1092 = null;
        field1095 = null;
        field1091 = null;
        field1090 = null;
        field1089 = null;
        field1097 = null;
        field1096 = null;
        field1093 = null;
        field1099 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BI)Z")
    public static final boolean method434(byte arg0, int arg1) {
        field1087++;
        if (arg0 <= 95) {
            return false;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)V")
    public static final void method435(int arg0, int arg1) {
        int var2 = 123 % ((-arg1 - 45) / 46);
        if (arg0 == -1 && !class120.field2664) {
            class45.method408(-74);
        } else if (arg0 != -1 && class125.field2770 != arg0 && class48.field999 != 0 && !class120.field2664) {
            class128.method1036(false, 0, 2, class48.field999, -1, arg0, class107.field2241);
        }
        field1086++;
        class125.field2770 = arg0;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1092[var1] = var0 - 1;
            var0 += var0;
        }
        field1094 = new class13[2048];
        field1097 = class141.method1120("(U5", 0);
        field1096 = class141.method1120("Texturen geladen)3", 0);
        field1095 = class141.method1120("Please subscribe)1 or use a different world)3", 0);
        field1102 = field1095;
        field1098 = 0L;
        field1101 = class141.method1120("Loading config )2 ", 0);
        field1100 = field1101;
        field1099 = class141.method1120("Die Adresse dieses Computers wurde gesperrt)1", 0);
    }
}
