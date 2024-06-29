import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class168 {

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "Z")
    public static boolean field2530 = false;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "[I")
    public static int[] field2529 = new int[2500];

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "Lfg;")
    public static class12 field2528;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public static void method1215(int arg0) {
        field2528 = null;
        if (arg0 != 2) {
            field2529 = null;
        }
        field2529 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZII)Ljava/lang/String;")
    public static final String method1216(int arg0, boolean arg1, int arg2, int arg3) {
        field2526++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        } else if (arg1 && arg3 >= 0) {
            int var4 = 2;
            int var5 = arg3 / arg0;
            while (var5 != 0) {
                var5 /= arg0;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg3;
                arg3 /= arg0;
                int var9 = var8 - (arg0 * arg3);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            if (arg2 < 66) {
                method1216(-92, false, -57, 86);
            }
            return new String(var6);
        } else {
            return Integer.toString(arg3, arg0);
        }
    }
}
