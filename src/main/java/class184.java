import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class184 {

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2934 = new String[] { method1734(method1733("f0'<\f")), method1734(method1733("H9\u007f\u001cHh3)\u000fEe>qG")), method1734(method1733("f0'?\f")), method1734(method1733("zy'SY")), method1734(method1733("o\"e\u0011")) };

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "[F")
    public static float[] field2925 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "Lhl;")
    public static class556 field2928 = new class556(2, 4);

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field2930 = new String[200];

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "Lpe;")
    public static class636 field2932 = new class636(13, 0, 1, 0);

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public int field2924;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public int field2926;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public int field2927;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public int field2929;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public static void method1731(int arg0) {
        try {
            if (arg0 == -30692) {
                field2932 = null;
                field2925 = null;
                field2930 = null;
                field2928 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2934[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILjava/lang/String;IZ)I")
    public static final int method1732(int arg0, String arg1, int arg2, boolean arg3) {
        try {
            field2923++;
            if (arg0 < 2 || arg0 > 36) {
                throw new IllegalArgumentException(field2934[1] + arg0);
            }
            boolean var4 = false;
            boolean var5 = false;
            if (arg2 <= 3) {
                field2925 = null;
            }
            int var6 = 0;
            int var7 = arg1.length();
            for (int var8 = 0; var8 < var7; var8++) {
                char var9 = arg1.charAt(var8);
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
                    throw new NumberFormatException();
                }
                if (var13 >= arg0) {
                    throw new NumberFormatException();
                }
                if (var4) {
                    var13 = -var13;
                }
                int var10 = arg0 * var6 + var13;
                if ((var10 / arg0) != var6) {
                    throw new NumberFormatException();
                }
                var6 = var10;
                var5 = true;
            }
            if (!var5) {
                throw new NumberFormatException();
            }
            return var6;
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field2934[2] + arg0 + ',' + (arg1 == null ? field2934[4] : field2934[3]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1733(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x24);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1734(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 1;
                    break;
                case 1:
                    var10005 = 87;
                    break;
                case 2:
                    var10005 = 9;
                    break;
                case 3:
                    var10005 = 125;
                    break;
                default:
                    var10005 = 36;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
