import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class533 {

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "[F")
    public static float[] field7396 = new float[2];

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "Ltca;")
    public static class184 field7395 = new class184(16);

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field7397;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field7399;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "[I")
    public static int[] field7398;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZLjava/lang/String;BI)Z")
    public static final boolean method3096(boolean arg0, String arg1, byte arg2, int arg3) {
        field7399++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
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
                return false;
            }
            if (var11 >= arg3) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg3 * var6 + var11;
            if ((var10 / arg3) != var6) {
                return false;
            }
            var6 = var10;
            var5 = true;
        }
        if (arg2 > -11) {
            return true;
        } else {
            return var5;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
    public static void method3097(int arg0) {
        field7398 = null;
        field7396 = null;
        field7395 = null;
        if (arg0 != -46) {
            field7395 = null;
        }
    }
}
