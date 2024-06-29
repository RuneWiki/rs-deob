import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class490 {

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "S")
    public static short field6698 = 32767;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "I")
    public static int field6697;

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "I")
    public static int field6699;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Ljava/lang/String;CZ)[Ljava/lang/String;")
    public static final String[] method2753(String arg0, char arg1, boolean arg2) {
        field6697++;
        int var3 = class299.method1795(arg0, 72, arg1);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg1 != arg0.charAt(var8); var8++) {
            }
            var4[var5++] = arg0.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg0.substring(var6);
        if (arg2) {
            field6699 = 105;
        }
        return var4;
    }
}
