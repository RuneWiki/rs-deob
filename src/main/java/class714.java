import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class714 {

    @OriginalMember(owner = "client!vm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10341 = new String[] { method5202(method5201("H\u0005)z")), method5202(method5201("]^k8E")), method5202(method5201("P\u001dkW\u0010")) };

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public static int field10339 = -1;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field10340;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lcn;B)Lcn;")
    public static final class541 method5200(class541 arg0, byte arg1) {
        try {
            if (arg1 != 123) {
                method5200(null, (byte) -108);
            }
            field10340++;
            class541 var2 = client.method2672(arg0);
            if (var2 == null) {
                var2 = arg0.field8058;
            }
            return var2;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10341[2] + (arg0 == null ? field10341[0] : field10341[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5201(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x38);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5202(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 38;
                    break;
                case 1:
                    var10005 = 112;
                    break;
                case 2:
                    var10005 = 69;
                    break;
                case 3:
                    var10005 = 22;
                    break;
                default:
                    var10005 = 56;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
