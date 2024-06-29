import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class150 {

    @OriginalMember(owner = "client!db", name = "c", descriptor = "Lrb;")
    public static class352 field1927 = new class352(4, 1, 1, 1);

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field1930 = 0;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "Lbj;")
    public static class440 field1925;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "[I")
    public static int[] field1929;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III)Z", line = 16)
    public static final boolean method879(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            field1929 = null;
        }
        field1926++;
        return (arg2 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lps;B)V", line = 31)
    public static final void method880(class428 arg0, byte arg1) {
        field1928++;
        int var2 = 0;
        if (arg1 != 0) {
            return;
        }
        while (class156.field1992 > var2) {
            int var3 = arg0.method2573(-14319);
            int var4 = arg0.method2620(103);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class392.field5710[var3] != null) {
                class392.field5710[var3].field5312 = var4;
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V", line = 59)
    public static void method881(boolean arg0) {
        field1925 = null;
        field1927 = null;
        if (arg0) {
            field1929 = null;
        }
    }
}
