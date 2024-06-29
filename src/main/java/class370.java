import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class370 {

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field5201 = 0;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "Lnq;")
    public static class268 field5203;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ZILjava/lang/String;I)Z")
    public static final boolean method2375(boolean arg0, int arg1, String arg2, int arg3) {
        field5202++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        boolean var5 = false;
        if (arg3 != 97) {
            method2376((byte) 91, (class76) null, 51, -22);
        }
        int var6 = 0;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
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
            if (var11 >= arg1) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg1 * var6 + var11;
            if (var10 / arg1 != var6) {
                return false;
            }
            var6 = var10;
            var5 = true;
        }
        return var5;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BLwk;II)V")
    public static final void method2376(byte arg0, class76 arg1, int arg2, int arg3) {
        class222.field3099[arg2][arg3] = arg1;
        field5204++;
        if (arg0 < 77) {
            field5201 = -16;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static void method2377(int arg0) {
        if (arg0 != 90) {
            method2377(86);
        }
        field5203 = null;
    }
}
