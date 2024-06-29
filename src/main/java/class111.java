import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class111 extends class65 {

    @OriginalMember(owner = "client!kba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1563 = new String[] { method1020(method1019("Z7\u0010Y\\\u0019")), method1020(method1019("J{_Yd")), method1020(method1019("_ \u001d\u001b")) };

    @OriginalMember(owner = "client!kba", name = "i", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "()V", line = 3)
    public static final void method1017() {
        class239.field3687 = class239.field3686;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(BIIIII[B)Z", line = 9)
    public static final boolean method1018(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        try {
            if (arg0 > -66) {
                return false;
            }
            field1562++;
            int var7 = arg2 % arg4;
            int var8;
            if (var7 == 0) {
                var8 = 0;
            } else {
                var8 = arg4 - var7;
            }
            int var9 = -((arg1 - (1 - arg4)) / arg4);
            int var10 = -((arg4 + arg2 - 1) / arg4);
            for (int var11 = var9; var11 < 0; var11++) {
                for (int var12 = var10; var12 < 0; var12++) {
                    if (arg6[arg5] == 0) {
                        return true;
                    }
                    arg5 += arg4;
                }
                arg5 -= var8;
                if (arg6[arg5 - 1] == 0) {
                    return true;
                }
                arg5 += arg3;
            }
            return false;
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field1563[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field1563[2] : field1563[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!kba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1019(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x19);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1020(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 49;
                    break;
                case 1:
                    var10005 = 85;
                    break;
                case 2:
                    var10005 = 113;
                    break;
                case 3:
                    var10005 = 119;
                    break;
                default:
                    var10005 = 25;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
