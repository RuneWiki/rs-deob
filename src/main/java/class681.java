import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public class class681 {

    @OriginalMember(owner = "client!wia", name = "c", descriptor = "Llga;")
    private class47 field9569;

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "I")
    public int field9570;

    @OriginalMember(owner = "client!wia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9572 = new String[] { method4891(method4890("a?\"\u000e")), method4891(method4890("x#/Ljf$'\u0016h'")), method4891(method4890("td`L+")) };

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "I")
    public static int field9571 = 0;

    @OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(Lfs;ILlga;)V")
    public class681(class796 arg0, int arg1, class47 arg2) {
        new class251(64);
        try {
            this.field9569 = arg2;
            this.field9570 = this.field9569.method509(true, 15);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field9572[1] + (arg0 == null ? field9572[0] : field9572[2]) + ',' + arg1 + ',' + (arg2 == null ? field9572[0] : field9572[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!wia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4890(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x56);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4891(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 15;
                    break;
                case 1:
                    var10005 = 74;
                    break;
                case 2:
                    var10005 = 78;
                    break;
                case 3:
                    var10005 = 98;
                    break;
                default:
                    var10005 = 86;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
