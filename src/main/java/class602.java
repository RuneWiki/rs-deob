import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class602 {

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "B")
    public byte field8829;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "B")
    public byte field8827;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "Lml;")
    public class407 field8831;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "S")
    public short field8830;

    @OriginalMember(owner = "client!uo", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8832 = new String[] { method4472(method4471("ZyM\u0011_")), method4472(method4471("O\"\u000fS")), method4472(method4471("T8M\u0003KO>\u0017\u0001\n")) };

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "I")
    public static int field8828;

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(Lml;III)V", line = 12)
    public class602(class407 arg0, int arg1, int arg2, int arg3) {
        try {
            this.field8829 = (byte) arg2;
            this.field8827 = (byte) arg3;
            this.field8831 = arg0;
            this.field8830 = (short) arg1;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field8832[2] + (arg0 == null ? field8832[1] : field8832[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!uo", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4471(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x22);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uo", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4472(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 33;
                    break;
                case 1:
                    var10005 = 87;
                    break;
                case 2:
                    var10005 = 99;
                    break;
                case 3:
                    var10005 = 63;
                    break;
                default:
                    var10005 = 34;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
