import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class76 {

    @OriginalMember(owner = "client!l", name = "b", descriptor = "Ltd;")
    private static class136 field1708 = class145.method1172("Bad session id)3", 45);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Ltd;")
    public static class136 field1707 = field1708;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "Ltd;")
    public static class136 field1710 = class145.method1172("p11_full", 45);

    @OriginalMember(owner = "client!l", name = "f", descriptor = "[I")
    public static int[] field1712 = new int[32];

    @OriginalMember(owner = "client!l", name = "g", descriptor = "Ltd;")
    public static class136 field1713;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public static volatile int field1715;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "Ltd;")
    public static class136 field1718;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "[I")
    public static int[] field1719;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)Z")
    public static final boolean method552(byte arg0, int arg1) {
        field1711++;
        if (arg0 <= 53) {
            field1713 = null;
        }
        return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V")
    public static final void method553(int arg0) {
        field1709++;
        class19.field401.method346(-724);
        for (int var1 = 0; var1 < 32; var1++) {
            class93.field2198[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class63.field1353[var2] = 0L;
        }
        class121.field2814 = 0;
        if (arg0 >= -39) {
            method554(-113);
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V")
    public static void method554(int arg0) {
        field1719 = null;
        field1710 = null;
        field1713 = null;
        field1707 = null;
        field1712 = null;
        if (arg0 == -29971) {
            field1708 = null;
            field1718 = null;
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1712[var1] = var0 - 1;
            var0 += var0;
        }
        field1713 = class145.method1172("<img=1>", 45);
        field1715 = -1;
        field1718 = class145.method1172("", 45);
        field1714 = 99;
        field1719 = new int[128];
    }
}
