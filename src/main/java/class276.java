import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class276 {

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4423 = new String[] { method2371(method2370("?\u007fb/U")), method2371(method2370("?\u007fb.U")), method2371(method2370("?\u007fb,U")), method2371(method2370("69bC\u0000")), method2371(method2370("#b \u0001")) };

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "[Lot;")
    public static class617[] field4421 = new class617[16];

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field4418 = -1;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)V", line = 5)
    public static void method2367(boolean arg0) {
        try {
            if (!arg0) {
                field4418 = -104;
            }
            field4421 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field4423[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ZII)I", line = 20)
    public static final int method2368(boolean arg0, int arg1, int arg2) {
        try {
            field4420++;
            int var3 = arg1 >>> 24;
            if (!arg0) {
                method2368(true, 88, -58);
            }
            int var4 = 255 - var3;
            int var7 = ((arg1 & 0xFF00FF) * var3 & 0xFF00FF00 | (arg1 & 0xFF00) * var3 & 0xFF0000) >>> 8;
            return (((arg2 & 0xFF00) * var4 & 0xFF0000 | (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8) + var7;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4423[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IILrga;IBII)Z", line = 38)
    public static final boolean method2369(int arg0, int arg1, class250 arg2, int arg3, byte arg4, int arg5, int arg6) {
        try {
            field4422++;
            if (!class382.field6142 || !class147.field2062) {
                return false;
            } else if (class74.field1066 < 100) {
                return false;
            } else if (arg3 != arg5 || arg1 != arg6) {
                if (arg4 < 1) {
                    method2368(true, -23, -90);
                }
                for (int var7 = arg3; var7 <= arg5; var7++) {
                    for (int var8 = arg1; var8 <= arg6; var8++) {
                        if (class319.field5200[arg0][var7][var8] == (-class326.field5362)) {
                            return false;
                        }
                    }
                }
                if (class223.method1961(arg2, 21)) {
                    class77.field1189++;
                    return true;
                } else {
                    return false;
                }
            } else if (!class527.method3934(48, arg3, arg0, arg1)) {
                return false;
            } else if (class223.method1961(arg2, 18)) {
                class77.field1189++;
                return true;
            } else {
                return false;
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field4423[2] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field4423[4] : field4423[3]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2370(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2371(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 77;
                    break;
                case 1:
                    var10005 = 23;
                    break;
                case 2:
                    var10005 = 76;
                    break;
                case 3:
                    var10005 = 109;
                    break;
                default:
                    var10005 = 125;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
