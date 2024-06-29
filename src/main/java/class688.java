import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jka")
public class class688 {

    @OriginalMember(owner = "client!jka", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9980 = new String[] { method5043(method5042("&)TE")), method5043(method5042("\"7Y\u0007b`")), method5043(method5042("3r\u0016\u0007^")) };

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "I")
    public static int field9979;

    @OriginalMember(owner = "client!jka", name = "a", descriptor = "(B[BLrda;I)Lde;", line = 7)
    public static final class557 method5041(byte arg0, byte[] arg1, class690 arg2, int arg3) {
        try {
            field9979++;
            if (arg1 == null) {
                return null;
            }
            int var4 = OpenGL.glGenProgramARB();
            if (arg0 < 60) {
                return null;
            }
            OpenGL.glBindProgramARB(arg3, var4);
            OpenGL.glProgramRawARB(arg3, 34933, arg1);
            OpenGL.glGetIntegerv(34379, class440.field6488, 0);
            if (class440.field6488[0] == -1) {
                OpenGL.glBindProgramARB(arg3, 0);
                return new class557(arg2, arg3, var4);
            } else {
                OpenGL.glBindProgramARB(arg3, 0);
                return null;
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field9980[1] + arg0 + ',' + (arg1 == null ? field9980[0] : field9980[2]) + ',' + (arg2 == null ? field9980[0] : field9980[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!jka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5042(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x23);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5043(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 72;
                    break;
                case 1:
                    var10005 = 92;
                    break;
                case 2:
                    var10005 = 56;
                    break;
                case 3:
                    var10005 = 41;
                    break;
                default:
                    var10005 = 35;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
