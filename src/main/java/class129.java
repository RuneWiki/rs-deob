import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class129 {

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "[J")
    public static long[] field2030 = new long[100];

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field2031 = 0;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V", line = 9)
    public static void method933(byte arg0) {
        if (arg0 != 73) {
            method935((byte) -65, -18, -91, false);
        }
        field2030 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V", line = 21)
    public static final void method934(int arg0, int arg1) {
        class320.field4994.method2175(arg0, -1401253017);
        int var2 = 92 % ((64 - arg1) / 36);
        field2032++;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BIIZ)Ljava/lang/String;", line = 34)
    public static final String method935(byte arg0, int arg1, int arg2, boolean arg3) {
        field2028++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        } else if (arg3 && arg2 >= 0) {
            int var4 = 2;
            int var5 = arg2 / arg1;
            while (var5 != 0) {
                var5 /= arg1;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            if (arg0 > -33) {
                method933((byte) 93);
            }
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg2;
                arg2 /= arg1;
                int var9 = var8 - arg1 * arg2;
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg2, arg1);
        }
    }
}
