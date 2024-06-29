import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class332 {

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "[B")
    public static byte[] field4257 = new byte[2048];

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BCLjava/lang/String;)[Ljava/lang/String;", line = 10)
    public static final String[] method1978(byte arg0, char arg1, String arg2) {
        field4256++;
        int var3 = class265.method1649(0, arg2, arg1);
        String[] var4 = new String[var3 + 1];
        if (arg0 >= -42) {
            method1979((byte) -94);
        }
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg2.charAt(var8) != arg1; var8++) {
            }
            var4[var5++] = arg2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg2.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V", line = 45)
    public static void method1979(byte arg0) {
        field4257 = null;
        if (arg0 != -122) {
            method1978((byte) 122, '=', null);
        }
    }
}
