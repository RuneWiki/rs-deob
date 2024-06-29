import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class732 {

    @OriginalMember(owner = "client!wba", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field10453 = method5330(method5329(".\n\u0006%~q"));

    @OriginalMember(owner = "client!wba", name = "c", descriptor = "Lsb;")
    public static class261 field10449 = new class261(56, -2);

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "Lrl;")
    public static class343 field10450;

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "Ltb;")
    public static class392 field10451;

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "Lng;")
    public static class429 field10452;

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)V", line = 3)
    public static void method5327(int arg0) {
        try {
            field10452 = null;
            int var1 = 48 % ((arg0 - 26) / 49);
            field10451 = null;
            field10449 = null;
            field10450 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10453 + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(III)Lfu;", line = 23)
    public static final class219 method5328(int arg0, int arg1, int arg2) {
        class621 var3 = class608.field8715[arg0][arg1][arg2];
        return var3 == null ? null : var3.field8841;
    }

    @OriginalMember(owner = "client!wba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5329(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5330(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 89;
                    break;
                case 1:
                    var10005 = 104;
                    break;
                case 2:
                    var10005 = 103;
                    break;
                case 3:
                    var10005 = 11;
                    break;
                default:
                    var10005 = 60;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
