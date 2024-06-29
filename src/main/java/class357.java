import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class357 {

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I[BII)[B", line = 8)
    public static final byte[] method1969(int arg0, byte[] arg1, int arg2, int arg3) {
        field4561++;
        byte[] var4;
        if (arg3 > 0) {
            var4 = new byte[arg0];
            for (int var5 = 0; var5 < arg0; var5++) {
                var4[var5] = arg1[arg3 + var5];
            }
        } else {
            var4 = arg1;
        }
        class313 var6 = new class313();
        int var7 = -18 % ((arg2 - 90) / 34);
        var6.method1812(8);
        var6.method1814(var4, (long) (arg0 * 8), -30);
        byte[] var8 = new byte[64];
        var6.method1816(var8, 0, 256);
        return var8;
    }
}
