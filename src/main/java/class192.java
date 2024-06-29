import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class192 {

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "[I")
    public static int[] field2652 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2651 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
    public static void method1228(byte arg0) {
        field2651 = null;
        int var1 = -27 / ((arg0 - 60) / 53);
        field2652 = null;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "([BIII)I")
    public static final int method1229(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= -119) {
            field2652 = null;
        }
        int var4 = -1;
        for (int var5 = arg1; var5 < arg2; var5++) {
            var4 = var4 >>> 8 ^ class205.field2861[(arg0[var5] ^ var4) & 0xFF];
        }
        field2653++;
        return ~var4;
    }
}
