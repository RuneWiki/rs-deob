import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class760 implements class35 {

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public int field11011;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "[F")
    public float[] field11009;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public int field11012;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "Ljava/lang/String;")
    private static final String field11013 = method5504(method5503("hsl \\ey6\"\u001d"));

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field11010 = -1;

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(II)V")
    public class760(int arg0, int arg1) {
        try {
            this.field11011 = arg1;
            this.field11009 = new float[arg0 * arg1];
            this.field11012 = arg0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field11013 + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5503(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x35);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5504(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 11;
                    break;
                case 1:
                    var10005 = 16;
                    break;
                case 2:
                    var10005 = 66;
                    break;
                case 3:
                    var10005 = 28;
                    break;
                default:
                    var10005 = 53;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
