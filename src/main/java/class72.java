import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class72 extends class93 {

    @OriginalMember(owner = "client!hb", name = "T", descriptor = "Z")
    public static boolean field1524 = false;

    @OriginalMember(owner = "client!hb", name = "Y", descriptor = "Ljd;")
    public static class92 field1529 = class202.method1325((byte) 90, "Zu viele Anmelde)2Versuche von Ihrer Adresse");

    @OriginalMember(owner = "client!hb", name = "X", descriptor = "Ljd;")
    private static class92 field1528 = class202.method1325((byte) 90, " is already on your friend list)3");

    @OriginalMember(owner = "client!hb", name = "S", descriptor = "Ljd;")
    public static class92 field1523 = class202.method1325((byte) 90, " )2> ");

    @OriginalMember(owner = "client!hb", name = "ab", descriptor = "Z")
    public static boolean field1531 = false;

    @OriginalMember(owner = "client!hb", name = "db", descriptor = "Ljd;")
    public static class92 field1534 = field1528;

    @OriginalMember(owner = "client!hb", name = "bb", descriptor = "I")
    public static int field1532 = 0;

    @OriginalMember(owner = "client!hb", name = "V", descriptor = "I")
    public static int field1526 = -1;

    @OriginalMember(owner = "client!hb", name = "cb", descriptor = "Ljd;")
    private static class92 field1533 = class202.method1325((byte) 90, "Please wait 1 minute and try again)3");

    @OriginalMember(owner = "client!hb", name = "W", descriptor = "Ljd;")
    public static class92 field1527 = field1533;

    @OriginalMember(owner = "client!hb", name = "Z", descriptor = "Ljd;")
    public static class92 field1530 = field1533;

    @OriginalMember(owner = "client!hb", name = "U", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!hb", name = "eb", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field1535;

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
    public class72() {
        super(1, true);
    }

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "(B)V")
    public static void method509(byte arg0) {
        field1529 = null;
        if (arg0 == -11) {
            field1523 = null;
            field1535 = null;
            field1527 = null;
            field1528 = null;
            field1534 = null;
            field1530 = null;
            field1533 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        ++field1525;
        int[] var3 = super.field1887.method916(arg0, -15);
        int var4 = -127 % ((67 - arg1) / 42);
        if (super.field1887.field2757) {
            int[][] var5 = this.method649(0, true, arg0);
            int[] var6 = var5[0];
            int[] var7 = var5[2];
            int[] var8 = var5[1];
            for (int var9 = 0; var9 < class150.field2985; ++var9) {
                var3[var9] = (var6[var9] - (-var8[var9] - var7[var9])) / 3;
            }
        }
        return var3;
    }
}
