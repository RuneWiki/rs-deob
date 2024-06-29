import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class451 {

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "Luea;")
    public static class256 field6498 = new class256("WTI", 5);

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "I")
    public static int field6496;

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "I")
    public static int field6497;

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "I")
    public static int field6499;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(B)V")
    public static final void method2627(byte arg0) {
        field6496++;
        if (arg0 != -30) {
            return;
        }
        class385.method2353((byte) 123, false);
        if (class685.field9736 >= 0 && class685.field9736 != 0) {
            class251.method1604(72, class685.field9736);
            class685.field9736 = -1;
        }
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(B)V")
    public static void method2628(byte arg0) {
        field6498 = null;
        if (arg0 < 22) {
            field6498 = null;
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILjava/lang/String;IZ)Z")
    public static final boolean method2629(int arg0, String arg1, int arg2, boolean arg3) {
        field6497++;
        if (arg2 < arg0 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
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
                if (var9 == '+' && arg3) {
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
            if (var11 >= arg2) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if (var10 / arg2 != var6) {
                return false;
            }
            var5 = true;
            var6 = var10;
        }
        return var5;
    }
}
