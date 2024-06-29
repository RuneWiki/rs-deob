import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hia")
public class class197 extends class578 {

    @OriginalMember(owner = "client!hia", name = "j", descriptor = "I")
    public int field2926;

    @OriginalMember(owner = "client!hia", name = "i", descriptor = "I")
    public int field2925;

    @OriginalMember(owner = "client!hia", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field2927 = method1709(method1708(").c};()k'9i"));

    @OriginalMember(owner = "client!hia", name = "<init>", descriptor = "(II)V")
    public class197(int arg0, int arg1) {
        try {
            this.field2926 = arg0;
            this.field2925 = arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field2927 + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1708(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1709(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 65;
                    break;
                case 1:
                    var10005 = 71;
                    break;
                case 2:
                    var10005 = 2;
                    break;
                case 3:
                    var10005 = 83;
                    break;
                default:
                    var10005 = 7;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
