import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class78 extends class206 {

    @OriginalMember(owner = "client!pv", name = "j", descriptor = "Ljava/lang/String;")
    public String field893;

    @OriginalMember(owner = "client!pv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field894 = new String[] { method691(method690("\u00110\u001bkN\u000f/Ai\u000f")), method691(method690("\u000f3Y;")), method691(method690("\u001ah\u001byZ")) };

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "()V")
    public class78() {
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class78(String arg0) {
        try {
            this.field893 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field894[0] + (arg0 == null ? field894[1] : field894[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!pv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method690(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x27);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method691(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 97;
                    break;
                case 1:
                    var10005 = 70;
                    break;
                case 2:
                    var10005 = 53;
                    break;
                case 3:
                    var10005 = 87;
                    break;
                default:
                    var10005 = 39;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
