import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class742 {

    @OriginalMember(owner = "client!ega", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10925 = new String[] { method5408(method5407("\u00120\u0011kk\u0018\u0004\u00047v\u00190X")), method5408(method5407("\u00120\u0011k^_")) };

    @OriginalMember(owner = "client!ega", name = "d", descriptor = "I")
    public static int field10920;

    @OriginalMember(owner = "client!ega", name = "c", descriptor = "I")
    public static int field10921;

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "I")
    public static int field10922;

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "I")
    public static int field10923;

    @OriginalMember(owner = "client!ega", name = "e", descriptor = "I")
    public static int field10924;

    @OriginalMember(owner = "client!ega", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field10921++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field10925[0] + ')');
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(BC)C")
    public static final char method5406(byte arg0, char arg1) {
        try {
            if (arg0 != 114) {
                field10924 = 99;
            }
            field10923++;
            if (arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-') {
                return '_';
            } else if (arg1 == '[' || arg1 == ']' || arg1 == '#') {
                return arg1;
            } else if (arg1 == 'à' || arg1 == 'á' || arg1 == 'â' || arg1 == 'ä' || arg1 == 'ã' || arg1 == 'À' || arg1 == 'Á' || arg1 == 'Â' || arg1 == 'Ä' || arg1 == 'Ã') {
                return 'a';
            } else if (arg1 == 'è' || arg1 == 'é' || arg1 == 'ê' || arg1 == 'ë' || arg1 == 'È' || arg1 == 'É' || arg1 == 'Ê' || arg1 == 'Ë') {
                return 'e';
            } else if (arg1 == 'í' || arg1 == 'î' || arg1 == 'ï' || arg1 == 'Í' || arg1 == 'Î' || arg1 == 'Ï') {
                return 'i';
            } else if (arg1 == 'ò' || arg1 == 'ó' || arg1 == 'ô' || arg1 == 'ö' || arg1 == 'õ' || arg1 == 'Ò' || arg1 == 'Ó' || arg1 == 'Ô' || arg1 == 'Ö' || arg1 == 'Õ') {
                return 'o';
            } else if (arg1 == 'ù' || arg1 == 'ú' || arg1 == 'û' || arg1 == 'ü' || arg1 == 'Ù' || arg1 == 'Ú' || arg1 == 'Û' || arg1 == 'Ü') {
                return 'u';
            } else if (arg1 == 'ç' || arg1 == 'Ç') {
                return 'c';
            } else if (arg1 == 'ÿ' || arg1 == 'Ÿ') {
                return 'y';
            } else if (arg1 == 'ñ' || arg1 == 'Ñ') {
                return 'n';
            } else if (arg1 == 'ß') {
                return 'b';
            } else {
                return Character.toLowerCase(arg1);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10925[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ega", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5407(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1F);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ega", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5408(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 119;
                    break;
                case 1:
                    var10005 = 87;
                    break;
                case 2:
                    var10005 = 112;
                    break;
                case 3:
                    var10005 = 69;
                    break;
                default:
                    var10005 = 31;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
