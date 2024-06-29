import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class481 {

    @OriginalMember(owner = "client!rca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7322 = new String[] { method3674(method3673(" vR66z")), method3674(method3673(" vR63z")), method3674(method3673("<`_t")), method3674(method3673("\u001b{Ey\u001b;q\u0013j\u00166|K\"")), method3674(method3673(");\u001d6\n")), method3674(method3673(" vR62z")), method3674(method3673(" vR65z")), method3674(method3673(" vR64z")) };

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "Z")
    public static boolean field7319 = false;

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "Lhd;")
    public static class776 field7315 = new class776();

    @OriginalMember(owner = "client!rca", name = "f", descriptor = "Lhl;")
    public static class556 field7321 = new class556(18, -1);

    @OriginalMember(owner = "client!rca", name = "e", descriptor = "I")
    public static int field7316;

    @OriginalMember(owner = "client!rca", name = "g", descriptor = "I")
    public static int field7317;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "I")
    public static int field7318;

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "I")
    public static int field7320;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Ljava/lang/String;IIZ)Z")
    public static final boolean method3668(String arg0, int arg1, int arg2, boolean arg3) {
        try {
            field7320++;
            if (arg1 < 2 || arg1 > 36) {
                throw new IllegalArgumentException(field7322[3] + arg1);
            }
            boolean var4 = false;
            if (arg2 <= 125) {
                method3672(21, -96, -57, true, 10, -91);
            }
            boolean var5 = false;
            int var6 = 0;
            int var7 = arg0.length();
            for (int var8 = 0; var8 < var7; var8++) {
                char var9 = arg0.charAt(var8);
                if (var8 == 0) {
                    if (var9 == '-') {
                        var4 = true;
                        continue;
                    }
                    if (var9 == '+' && arg3) {
                        continue;
                    }
                }
                int var13;
                if (var9 >= '0' && var9 <= '9') {
                    var13 = var9 - '0';
                } else if (var9 >= 'A' && var9 <= 'Z') {
                    var13 = var9 - '7';
                } else if (var9 >= 'a' && var9 <= 'z') {
                    var13 = var9 - 'W';
                } else {
                    return false;
                }
                if (var13 >= arg1) {
                    return false;
                }
                if (var4) {
                    var13 = -var13;
                }
                int var10 = arg1 * var6 + var13;
                if (var10 / arg1 != var6) {
                    return false;
                }
                var6 = var10;
                var5 = true;
            }
            return var5;
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field7322[5] + (arg0 == null ? field7322[2] : field7322[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IIIII)V")
    public static final void method3669(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            for (int var5 = arg4; var5 < class313.field5119; var5++) {
                Rectangle var6 = class784.field11455[var5];
                if (var6.x + var6.width > arg2 && (arg2 + arg3) > var6.x && arg0 < (var6.y + var6.height) && (arg0 + arg1) > var6.y) {
                    class178.field2871[var5] = true;
                }
            }
            field7318++;
            class458.method3552(arg0, arg2 + arg3, arg0 + arg1, arg2, -75);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field7322[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IZI)Z")
    public static final boolean method3670(int arg0, boolean arg1, int arg2) {
        try {
            field7316++;
            if (arg1) {
                field7315 = null;
            }
            return (arg0 & 0x10000) != 0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7322[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(B)V")
    public static void method3671(byte arg0) {
        try {
            field7321 = null;
            if (arg0 < 116) {
                field7319 = false;
            }
            field7315 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7322[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IIIZII)V")
    public static final void method3672(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        try {
            field7317++;
            int var11 = arg2 + 1;
            class545.method4051(arg5, arg0, arg4, class193.field3047[arg2], -115);
            int var10 = arg1 - 1;
            class545.method4051(arg5, arg0, arg4, class193.field3047[arg1], -127);
            if (!arg3) {
                method3672(91, -69, 39, false, -20, 42);
            }
            for (int var6 = var11; var6 <= var10; var6++) {
                int[] var7 = class193.field3047[var6];
                var7[arg5] = var7[arg4] = arg0;
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field7322[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!rca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3673(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x77);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3674(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 82;
                    break;
                case 1:
                    var10005 = 21;
                    break;
                case 2:
                    var10005 = 51;
                    break;
                case 3:
                    var10005 = 24;
                    break;
                default:
                    var10005 = 119;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
