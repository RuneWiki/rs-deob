import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class122 {

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "Z")
    public static boolean field1830 = false;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "[S")
    public static short[] field1832 = new short[256];

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static void method924(int arg0) {
        if (arg0 == 5) {
            field1832 = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method925(boolean arg0, String[] arg1) {
        field1829++;
        String[] var2 = new String[5];
        if (arg0) {
            field1830 = false;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }
}
