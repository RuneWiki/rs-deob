import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class188 {

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "[[I")
    public static int[][] field2670 = new int[104][104];

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "S")
    public static short field2677 = 32767;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
    public static int field2678 = 50;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "[I")
    public static int[] field2667 = new int[field2678];

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "[I")
    public static int[] field2674 = new int[field2678];

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "[I")
    public static int[] field2675 = new int[field2678];

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "[I")
    public static int[] field2676 = new int[field2678];

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field2669 = new String[field2678];

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "[I")
    public static int[] field2672 = new int[field2678];

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "[I")
    public static int[] field2671 = new int[field2678];

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "[I")
    public static int[] field2668 = new int[field2678];

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field2673;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
    public static void method1209(int arg0) {
        int var1 = 97 % ((26 - arg0) / 61);
        field2672 = null;
        field2674 = null;
        field2667 = null;
        field2669 = null;
        field2670 = null;
        field2675 = null;
        field2671 = null;
        field2668 = null;
        field2676 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BZ)C")
    public static final char method1210(byte arg0, boolean arg1) {
        field2673++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (arg1) {
            method1210((byte) -95, false);
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class233.field3485[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }
}
