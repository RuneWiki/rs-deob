import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class261 {

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field4243 = 0;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field4245 = 0;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field4247 = 0;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field4242 = 0;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "[I")
    public static int[] field4248 = new int[4096];

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Z")
    public static boolean field4244;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ljava/lang/String;IC)[Ljava/lang/String;")
    public static final String[] method1840(String arg0, int arg1, char arg2) {
        field4246++;
        int var3 = class231.method1627(arg0, arg2, false);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        if (arg1 != -32227) {
            return null;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg2 != arg0.charAt(var8); var8++) {
            }
            var4[var5++] = arg0.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg0.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static void method1841(int arg0) {
        field4248 = null;
        if (arg0 <= 90) {
            field4245 = -94;
        }
    }
}
