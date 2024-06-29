import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class15 {

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field186 = new String[] { method108(method107("3\u0015K{f")), method108(method107("+\f\tV")), method108(method107(">WK\u00143")) };

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public static final int method106(boolean arg0, String arg1) {
        try {
            field185++;
            int var2 = arg1.length();
            int var3 = 0;
            if (arg0) {
                for (int var4 = 0; var4 < var2; var4++) {
                    var3 = class513.method3867(7635, arg1.charAt(var4)) + (var3 << 5) - var3;
                }
                return var3;
            } else {
                return 36;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field186[0] + arg0 + ',' + (arg1 == null ? field186[1] : field186[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method107(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method108(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 69;
                    break;
                case 1:
                    var10005 = 121;
                    break;
                case 2:
                    var10005 = 101;
                    break;
                case 3:
                    var10005 = 58;
                    break;
                default:
                    var10005 = 78;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
