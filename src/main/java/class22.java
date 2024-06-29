import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class22 extends class514 {

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "Lah;")
    public class406 field214;

    @OriginalMember(owner = "client!qo", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field218 = new String[] { method145(method144("i\u0010\rGH")), method145(method144("cQ\rU\\|WWW\u001d")), method145(method144("|KO\u0005")), method145(method144("cQ\r(\u001d")), method145(method144("ZWG\rP|\u0013")) };

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
    public static int field216 = 0;

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lgca;II[B)V")
    public class22(class261 arg0, int arg1, int arg2, byte[] arg3) {
        try {
            this.field214 = arg0.method2246(arg3, arg2, class335.field5466, arg1, -125, false);
            this.field214.method3166(false, 8095, false);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field218[1] + (arg0 == null ? field218[2] : field218[0]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field218[2] : field218[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lmj;II)Ljava/lang/String;")
    public static final String method143(class683 arg0, int arg1, int arg2) {
        try {
            if (arg1 != 0) {
                method143(null, 108, -121);
            }
            field217++;
            if (!client.method2695(arg0).method3479(-3979, arg2) && arg0.field9859 == null) {
                return null;
            } else if (arg0.field9757 == null || arg0.field9757.length <= arg2 || arg0.field9757[arg2] == null || arg0.field9757[arg2].trim().length() == 0) {
                return class531.field7804 ? field218[4] + arg2 : null;
            } else {
                return arg0.field9757[arg2];
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field218[3] + (arg0 == null ? field218[2] : field218[0]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lgca;II[I)V")
    public class22(class261 arg0, int arg1, int arg2, int[] arg3) {
        try {
            this.field214 = arg0.method2206(1826, false, arg1, arg3, arg2);
            this.field214.method3166(false, 8095, false);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field218[1] + (arg0 == null ? field218[2] : field218[0]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field218[2] : field218[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!qo", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method144(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x35);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qo", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method145(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 18;
                    break;
                case 1:
                    var10005 = 62;
                    break;
                case 2:
                    var10005 = 35;
                    break;
                case 3:
                    var10005 = 105;
                    break;
                default:
                    var10005 = 53;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
