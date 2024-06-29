import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class186 {

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2564 = new String[] { method1623(method1622("z<0d\u001b")), method1623(method1622("s.rI")), method1623(method1622("z<0f\u001b")), method1623(method1622("fu0\u000bN")) };

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "Lel;")
    public static class573 field2561 = new class573(131, -1);

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "[Lui;")
    public static class241[] field2563;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILiu;ZIIZLiu;)I", line = 4)
    public static final int method1619(int arg0, class604 arg1, boolean arg2, int arg3, int arg4, boolean arg5, class604 arg6) {
        try {
            field2562++;
            int var7 = class293.method2401(arg3, arg2, arg6, (byte) 103, arg1);
            if (arg4 != var7) {
                return arg2 ? -var7 : var7;
            } else if (arg0 == -1) {
                return 0;
            } else {
                int var8 = class293.method2401(arg0, arg5, arg6, (byte) 38, arg1);
                return arg5 ? -var8 : var8;
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field2564[2] + arg0 + ',' + (arg1 == null ? field2564[1] : field2564[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field2564[1] : field2564[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V", line = 33)
    public static void method1620(boolean arg0) {
        try {
            field2563 = null;
            field2561 = null;
            if (!arg0) {
                method1619(-33, null, false, 83, 1, true, null);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field2564[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)Lpb;", line = 48)
    public static final class681 method1621(int arg0, int arg1, int arg2) {
        class96 var3 = class734.field10683[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1085;
    }

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1622(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x33);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1623(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 29;
                    break;
                case 1:
                    var10005 = 91;
                    break;
                case 2:
                    var10005 = 30;
                    break;
                case 3:
                    var10005 = 37;
                    break;
                default:
                    var10005 = 51;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
