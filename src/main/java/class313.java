import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class313 {

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "S")
    public static short field4242 = 256;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field4243;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIZ[B)Ljava/lang/String;", line = 9)
    public static final String method1804(int arg0, int arg1, boolean arg2, byte[] arg3) {
        field4243++;
        if (!arg2) {
            return null;
        }
        char[] var4 = new char[arg0];
        int var5 = 0;
        for (int var6 = 0; var6 < arg0; var6++) {
            int var7 = arg3[arg1 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class224.field3172[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }
}
