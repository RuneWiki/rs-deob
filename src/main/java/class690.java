import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class690 {

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "S")
    public static short field9708 = 1;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field9710;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field9711;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "[I")
    public static int[] field9709;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLjava/lang/String;ZI)I")
    public static final int method3798(boolean arg0, String arg1, boolean arg2, int arg3) {
        field9710++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        if (!arg2) {
            method3799(-38);
        }
        int var7 = arg1.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg0) {
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
            if (arg3 <= var11) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg3 * var6 + var11;
            if (var10 / arg3 != var6) {
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

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public static void method3799(int arg0) {
        field9709 = null;
        if (arg0 != 87) {
            method3798(false, null, true, -126);
        }
    }
}
