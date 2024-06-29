import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class102 extends class66 {

    @OriginalMember(owner = "client!uaa", name = "w", descriptor = "[I")
    public static int[] field1690 = new int[1024];

    @OriginalMember(owner = "client!uaa", name = "u", descriptor = "Lnaa;")
    public static class64 field1688 = new class64();

    @OriginalMember(owner = "client!uaa", name = "x", descriptor = "I")
    public static int field1691 = -1;

    @OriginalMember(owner = "client!uaa", name = "q", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!uaa", name = "r", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!uaa", name = "s", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!uaa", name = "t", descriptor = "I")
    public int field1687;

    @OriginalMember(owner = "client!uaa", name = "v", descriptor = "I")
    public int field1689;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)V")
    public static void method982(int arg0) {
        field1688 = null;
        if (arg0 >= 9) {
            field1690 = null;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BILjava/lang/String;Z)Z")
    public static final boolean method983(byte arg0, int arg1, String arg2, boolean arg3) {
        field1685++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg2.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
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
            if (arg1 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg1 * var6 + var11;
            if (var10 / arg1 != var6) {
                return false;
            }
            var5 = true;
            var6 = var10;
        }
        if (arg0 != 92) {
            field1686 = 37;
        }
        return var5;
    }
}
