import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class658 {

    @OriginalMember(owner = "client!pda", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9413 = new String[] { method4791(method4790("|@\u0018+U")), method4791(method4790("w\nW+i/")), method4791(method4790("i\u001bZi")), method4791(method4790("w\nW+j/")) };

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field9409 = new String[] { method4791(method4790("T\u001bX")), method4791(method4790("J\u0001X")), method4791(method4790("S\u001bS")), method4791(method4790("P\u000bR")), method4791(method4790("S\u0006C")), method4791(method4790("A\u001c_")), method4791(method4790("T\u000fB")) };

    @OriginalMember(owner = "client!pda", name = "e", descriptor = "I")
    public static int field9411 = -1;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "Z")
    public static boolean field9412 = false;

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "I")
    public static int field9407;

    @OriginalMember(owner = "client!pda", name = "f", descriptor = "I")
    public static int field9408;

    @OriginalMember(owner = "client!pda", name = "d", descriptor = "I")
    public static int field9410;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Z[B)[B", line = 16)
    public static final byte[] method4788(boolean arg0, byte[] arg1) {
        try {
            field9408++;
            if (arg1 == null) {
                return null;
            } else if (arg0) {
                return null;
            } else {
                byte[] var2 = new byte[arg1.length];
                class405.method3259(arg1, 0, var2, 0, arg1.length);
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9413[1] + arg0 + ',' + (arg1 == null ? field9413[2] : field9413[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)V", line = 42)
    public static void method4789(int arg0) {
        try {
            if (arg0 == 31756) {
                field9409 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9413[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pda", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4790(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x28);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pda", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4791(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 7;
                    break;
                case 1:
                    var10005 = 110;
                    break;
                case 2:
                    var10005 = 54;
                    break;
                case 3:
                    var10005 = 5;
                    break;
                default:
                    var10005 = 40;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
