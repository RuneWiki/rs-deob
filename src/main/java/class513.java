import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class513 {

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "[I")
    public static int[] field7207 = new int[4];

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field7205;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "Lqu;")
    public static class99 field7206;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IZII)Ljava/lang/String;")
    public static final String method2989(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg3 != 16913) {
            return null;
        }
        field7205++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        } else if (arg1 && arg0 >= 0) {
            int var4 = 2;
            int var5 = arg0 / arg2;
            while (var5 != 0) {
                var5 /= arg2;
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

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public static void method2990(int arg0) {
        field7207 = null;
        int var1 = -78 / ((81 - arg0) / 35);
        field7206 = null;
    }
}
