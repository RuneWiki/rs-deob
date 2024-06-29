import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class429 {

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field6373 = 0;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "Lhn;")
    public static class509 field6374 = new class509(42, 3);

    @OriginalMember(owner = "client!re", name = "d", descriptor = "Lhn;")
    public static class509 field6376 = new class509(86, 10);

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIZLjava/lang/String;)I")
    public static final int method2671(int arg0, int arg1, boolean arg2, String arg3) {
        field6375++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg3.length();
        if (arg0 != 90) {
            method2671(91, -67, false, null);
        }
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg3.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg2) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var11 >= arg1) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg1 * var6 + var11;
            if (var10 / arg1 != var6) {
                throw new NumberFormatException();
            }
            var6 = var10;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
    public static void method2672(byte arg0) {
        field6374 = null;
        field6376 = null;
        if (arg0 != -62) {
            field6374 = null;
        }
    }
}
