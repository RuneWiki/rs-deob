import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class117 {

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIZ)Ljava/lang/String;")
    public static final String method787(int arg0, int arg1, int arg2, boolean arg3) {
        field1428++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        } else if (arg1 != -37) {
            return null;
        } else if (arg3 && arg0 >= 0) {
            int var4 = 2;
            for (int var5 = arg0 / arg2; var5 != 0; var5 /= arg2) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg0;
                arg0 /= arg2;
                int var9 = var8 - (arg0 * arg2);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)Z")
    public static final boolean method788(int arg0, int arg1, int arg2) {
        field1426++;
        if (arg1 != 23807) {
            field1425 = -75;
        }
        return (arg0 & 0x100) != 0;
    }
}
