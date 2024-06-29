import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public abstract class class564 extends class369 {

    @OriginalMember(owner = "client!ov", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8247 = new String[] { method4220(method4219("O9Hz_")), method4220(method4219("N:\nT")), method4220(method4219("i!\u0010Y\u001bI+FJ\u0016D&\u001e\u0002")), method4220(method4219("[aH\u0016\n")), method4220(method4219("O9Hy_")) };

    @OriginalMember(owner = "client!ov", name = "l", descriptor = "S")
    public static short field8244 = 32767;

    @OriginalMember(owner = "client!ov", name = "j", descriptor = "Lhj;")
    public static class671 field8246 = new class671(14, 0, 4, 1);

    @OriginalMember(owner = "client!ov", name = "k", descriptor = "I")
    public static int field8245;

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)Lnm;")
    public abstract class361 method1219(byte arg0);

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Z)V")
    public static void method4217(boolean arg0) {
        try {
            if (arg0) {
                field8244 = -22;
            }
            field8246 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field8247[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(ZIBLjava/lang/String;)I")
    public static final int method4218(boolean arg0, int arg1, byte arg2, String arg3) {
        try {
            field8245++;
            if (arg1 < 2 || arg1 > 36) {
                throw new IllegalArgumentException(field8247[2] + arg1);
            }
            boolean var4 = false;
            boolean var5 = false;
            int var6 = 0;
            if (arg2 != -102) {
                return 124;
            }
            int var7 = arg3.length();
            for (int var8 = 0; var8 < var7; var8++) {
                char var9 = arg3.charAt(var8);
                if (var8 == 0) {
                    if (var9 == '-') {
                        var4 = true;
                        continue;
                    }
                    if (var9 == '+' && arg0) {
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
                if (arg1 <= var13) {
                    throw new NumberFormatException();
                }
                if (var4) {
                    var13 = -var13;
                }
                int var10 = arg1 * var6 + var13;
                if ((var10 / arg1) != var6) {
                    throw new NumberFormatException();
                }
                var5 = true;
                var6 = var10;
            }
            if (!var5) {
                throw new NumberFormatException();
            }
            return var6;
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field8247[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field8247[1] : field8247[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!ov", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4219(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x77);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ov", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4220(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 32;
                    break;
                case 1:
                    var10005 = 79;
                    break;
                case 2:
                    var10005 = 102;
                    break;
                case 3:
                    var10005 = 56;
                    break;
                default:
                    var10005 = 119;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
