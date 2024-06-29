import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class82 {

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "Liba;")
    public static class211 field1317 = new class211(54, 15);

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "Lpb;")
    public static class2 field1320 = new class2(9, 7);

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)V", line = 6)
    public static void method473(byte arg0) {
        if (arg0 <= -33) {
            field1320 = null;
            field1317 = null;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(BIZI)Ljava/lang/String;", line = 21)
    public static final String method474(byte arg0, int arg1, boolean arg2, int arg3) {
        field1318++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        } else if (arg2 && arg1 >= 0) {
            int var4 = 2;
            for (int var5 = arg1 / arg3; var5 != 0; var5 /= arg3) {
                var4++;
            }
            if (arg0 <= 6) {
                field1321 = -97;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg1;
                arg1 /= arg3;
                int var9 = var8 - (arg1 * arg3);
                if (var9 < 10) {
                    var6[var7] = (char) (var9 + 48);
                } else {
                    var6[var7] = (char) (var9 + 87);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg1, arg3);
        }
    }
}
