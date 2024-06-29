import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class738 extends class384 {

    @OriginalMember(owner = "client!ega", name = "p", descriptor = "I")
    public int field10734;

    @OriginalMember(owner = "client!ega", name = "r", descriptor = "I")
    public int field10733;

    @OriginalMember(owner = "client!ega", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10738 = new String[] { method5388(method5387("7\u0018\u00055i")), method5388(method5387(")QJ5(%XBo*d")), method5388(method5387("\"CGw")), method5388(method5387(")QJ5Ud")) };

    @OriginalMember(owner = "client!ega", name = "q", descriptor = "I")
    public static int field10735;

    @OriginalMember(owner = "client!ega", name = "s", descriptor = "I")
    public static int field10736;

    @OriginalMember(owner = "client!ega", name = "o", descriptor = "I")
    public static int field10737;

    @OriginalMember(owner = "client!ega", name = "<init>", descriptor = "(Llk;Lvea;IIIIIIIII)V")
    public class738(class613 arg0, class288 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        try {
            this.field10734 = arg9;
            this.field10733 = arg10;
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field10738[1] + (arg0 == null ? field10738[2] : field10738[0]) + ',' + (arg1 == null ? field10738[2] : field10738[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
        }
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)Lvaa;")
    public final class494 method1226(int arg0) {
        try {
            field10735++;
            int var2 = -73 / ((57 - arg0) / 61);
            return class417.field6138;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10738[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ega", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5387(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x14);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ega", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5388(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 76;
                    break;
                case 1:
                    var10005 = 54;
                    break;
                case 2:
                    var10005 = 43;
                    break;
                case 3:
                    var10005 = 27;
                    break;
                default:
                    var10005 = 20;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
