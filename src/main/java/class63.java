import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class63 {

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "Ljava/lang/String;")
    public static String field918 = "Examine";

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "Lmd;")
    public static class331 field917 = new class331();

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "F")
    public static float field919;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V", line = 5)
    public static void method427(int arg0) {
        field918 = null;
        field917 = null;
        if (arg0 <= 25) {
            method428(13, (String) null, false, -78);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILjava/lang/String;ZI)Z", line = 21)
    public static final boolean method428(int arg0, String arg1, boolean arg2, int arg3) {
        field916++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        if (arg3 != 43) {
            method428(20, (String) null, true, -61);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = arg1.length();
        int var7 = 0;
        for (int var8 = 0; var8 < var6; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var5 = true;
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
                return false;
            }
            if (arg0 <= var11) {
                return false;
            }
            if (var5) {
                var11 = -var11;
            }
            int var10 = arg0 * var7 + var11;
            if (var10 / arg0 != var7) {
                return false;
            }
            var7 = var10;
            var4 = true;
        }
        return var4;
    }
}
