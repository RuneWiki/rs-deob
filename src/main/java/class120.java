import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class120 extends class568 {

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
    public int field1731;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "I")
    public int field1730;

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1735 = new String[] { method1177(method1176("jK51,fOo3m")), method1177(method1176("jK5Lm")) };

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "[Z")
    public static boolean[] field1732 = new boolean[8];

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "Ljca;")
    public static class715 field1729 = new class715(2);

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "[C")
    public static char[] field1733 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "Lha;")
    public static class63 field1734;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)V")
    public static void method1175(byte arg0) {
        try {
            field1729 = null;
            field1733 = null;
            if (arg0 != 124) {
                field1733 = null;
            }
            field1734 = null;
            field1732 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1735[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(II)V")
    public class120(int arg0, int arg1) {
        try {
            this.field1731 = arg0;
            this.field1730 = arg1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1735[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1176(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x45);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1177(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 8;
                    break;
                case 1:
                    var10005 = 38;
                    break;
                case 2:
                    var10005 = 27;
                    break;
                case 3:
                    var10005 = 13;
                    break;
                default:
                    var10005 = 69;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
