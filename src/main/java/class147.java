import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class147 extends class97 {

    @OriginalMember(owner = "client!dt", name = "q", descriptor = "F")
    public float field2036;

    @OriginalMember(owner = "client!dt", name = "n", descriptor = "I")
    public int field2033;

    @OriginalMember(owner = "client!dt", name = "o", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!dt", name = "p", descriptor = "I")
    public int field2035;

    @OriginalMember(owner = "client!dt", name = "r", descriptor = "I")
    public int field2037;

    @OriginalMember(owner = "client!dt", name = "s", descriptor = "I")
    public int field2038;

    @OriginalMember(owner = "client!dt", name = "t", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!dt", name = "u", descriptor = "I")
    public int field2040;

    @OriginalMember(owner = "client!dt", name = "v", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZIZ)V")
    public static final void method917(boolean arg0, int arg1, boolean arg2) {
        field2041++;
        if (arg1 != -1) {
            return;
        }
        if (arg0) {
            class44.field548--;
            if (class44.field548 == 0) {
                class150.field2070 = null;
            }
        }
        if (!arg2) {
            return;
        }
        class387.field5727--;
        if (class387.field5727 == 0) {
            class328.field4929 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(B)V")
    public static final void method918(byte arg0) {
        if (arg0 > 55) {
            field2034++;
            class302.field4570.method1485(-22032);
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILjava/lang/String;C)I")
    public static final int method919(int arg0, String arg1, char arg2) {
        field2039++;
        int var3 = 0;
        int var4 = arg1.length();
        if (arg0 != 29478) {
            method917(true, 7, false);
        }
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg2 == arg1.charAt(var5)) {
                var3++;
            }
        }
        return var3;
    }
}
