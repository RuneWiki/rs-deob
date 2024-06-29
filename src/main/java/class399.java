import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class399 {

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5968 = new String[] { method3147(method3146("@\u001ek\u000b#")), method3147(method3146("UE)I")), method3147(method3146("TZkgv")), method3147(method3146("TZkdv")) };

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
    public int field5952;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field5953;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field5954;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
    public int field5955;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    public int field5956;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public int field5957;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public int field5958;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public int field5959;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field5960;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
    public int field5961;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    public int field5962;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public int field5963;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public int field5964;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public int field5965;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public int field5966;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field5967;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILoj;)Z", line = 19)
    public final boolean method3144(int arg0, class399 arg1) {
        try {
            field5967++;
            if (this.field5957 == arg1.field5957 && this.field5962 == arg1.field5962 && this.field5963 == arg1.field5963) {
                return true;
            } else {
                if (arg0 != 26732) {
                    this.field5964 = -25;
                }
                return false;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5968[2] + arg0 + ',' + (arg1 == null ? field5968[1] : field5968[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V", line = 33)
    public static final void method3145(int arg0) {
        try {
            if (arg0 == 11966) {
                field5954++;
                class370.field5641.method1559(0);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5968[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3146(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3147(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 59;
                    break;
                case 1:
                    var10005 = 48;
                    break;
                case 2:
                    var10005 = 69;
                    break;
                case 3:
                    var10005 = 37;
                    break;
                default:
                    var10005 = 94;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
