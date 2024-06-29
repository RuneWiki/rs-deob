import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public class class73 {

    @OriginalMember(owner = "client!sga", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1026 = new String[] { method769(method768("o_ zt")), method769(method768("z\u0004b8")), method769(method768("g\u0016ozO<")), method769(method768("g\u0016ozH<")), method769(method768("g\u0016ozL<")), method769(method768("g\u0016ozJ<")), method769(method768("g\u0016ozM<")), method769(method768("g\u0016ozK<")) };

    @OriginalMember(owner = "client!sga", name = "f", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!sga", name = "d", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!sga", name = "e", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!sga", name = "g", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!sga", name = "c", descriptor = "Lcka;")
    public static class183 field1020;

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method762(int arg0, String arg1) {
        try {
            field1019++;
            if (arg0 == -71) {
                System.exit(1);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1026[2] + arg0 + ',' + (arg1 == null ? field1026[1] : field1026[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method763(int arg0, String arg1) {
        try {
            field1021++;
            StringBuffer var2 = new StringBuffer();
            if (arg0 != -2) {
                field1020 = null;
            }
            int var3 = arg1.length();
            for (int var4 = 0; var4 < var3; var4++) {
                char var5 = arg1.charAt(var4);
                if (var5 == '%' && (var4 + 2) < var3) {
                    char var6 = arg1.charAt(var4 + 1);
                    boolean var7 = false;
                    int var8;
                    if (var6 >= '0' && var6 <= '9') {
                        var8 = var6 - 48;
                    } else if (var6 >= 'a' && var6 <= 'f') {
                        var8 = var6 - 87;
                    } else {
                        if (var6 < 'A' || var6 > 'F') {
                            var2.append('%');
                            continue;
                        }
                        var8 = var6 - 55;
                    }
                    char var9 = arg1.charAt(var4 + 2);
                    int var10 = var8 * 16;
                    int var11;
                    if (var9 >= '0' && var9 <= '9') {
                        var11 = var9 + var10 - 48;
                    } else if (var9 >= 'a' && var9 <= 'f') {
                        var11 = var9 + var10 - 87;
                    } else {
                        if (var9 < 'A' || var9 > 'F') {
                            var2.append('%');
                            continue;
                        }
                        var11 = var9 + var10 + '\n' - 65;
                    }
                    var4 += 2;
                    if (var11 != 0 && class401.method3236((byte) -95, (byte) var11)) {
                        var2.append(class423.method3359(-6826, (byte) var11));
                    }
                } else if (var5 == '+') {
                    var2.append(' ');
                } else {
                    var2.append(var5);
                }
            }
            return var2.toString();
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field1026[6] + arg0 + ',' + (arg1 == null ? field1026[1] : field1026[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(B)Z")
    public static final boolean method764(byte arg0) {
        try {
            field1025++;
            if (arg0 == -15) {
                return class9.field104 != 0;
            } else {
                return false;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1026[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)V")
    public static void method765(int arg0) {
        try {
            field1020 = null;
            int var1 = 20 % ((-arg0 - 1) / 49);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1026[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(III[B)[B")
    public static final byte[] method766(int arg0, int arg1, int arg2, byte[] arg3) {
        try {
            field1023++;
            byte[] var4 = new byte[arg1];
            class405.method3259(arg3, arg2, var4, arg0, arg1);
            return var4;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field1026[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field1026[1] : field1026[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Lwq;B)Lm;")
    public static final class201 method767(class176 arg0, byte arg1) {
        try {
            field1022++;
            int var2 = 17 % ((47 - arg1) / 50);
            return new class201(arg0.method1657(82), arg0.method1657(122), arg0.method1657(76), arg0.method1657(115), arg0.method1685(false), arg0.method1645((byte) -95));
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field1026[3] + (arg0 == null ? field1026[1] : field1026[0]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method768(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x9);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method769(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 20;
                    break;
                case 1:
                    var10005 = 113;
                    break;
                case 2:
                    var10005 = 14;
                    break;
                case 3:
                    var10005 = 84;
                    break;
                default:
                    var10005 = 9;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
