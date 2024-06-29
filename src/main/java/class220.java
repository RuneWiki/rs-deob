import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class220 extends class222 {

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3452 = null;

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "[I")
    public static int[] field3458 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    public int field3456;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "Llb;")
    public static class211 field3451;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "Ljava/lang/String;")
    public String field3450;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "Ljava/lang/String;")
    public String field3453;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "(I)Lvl;", line = 6)
    public final class80 method1571(int arg0) {
        int var2 = -14 % ((-arg0 - 67) / 48);
        field3454++;
        return class20.field220[this.field3474];
    }

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)V", line = 26)
    public static void method1572(int arg0) {
        if (arg0 != 222) {
            field3452 = (String) null;
        }
        field3452 = null;
        field3451 = null;
        field3458 = null;
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)V", line = 39)
    public static final void method1573(byte arg0) {
        if (arg0 < 73) {
            field3458 = (int[]) null;
        }
        if (class26.field297.toLowerCase().indexOf("microsoft") == -1) {
            class305.field4780[47] = 73;
            class305.field4780[91] = 42;
            class305.field4780[92] = 74;
            if (class26.field300 == null) {
                class305.field4780[192] = 58;
                class305.field4780[222] = 59;
            } else {
                class305.field4780[192] = 28;
                class305.field4780[222] = 58;
                class305.field4780[520] = 59;
            }
            class305.field4780[93] = 43;
            class305.field4780[59] = 57;
            class305.field4780[46] = 72;
            class305.field4780[45] = 26;
            class305.field4780[61] = 27;
            class305.field4780[44] = 71;
        } else {
            class305.field4780[219] = 42;
            class305.field4780[192] = 58;
            class305.field4780[191] = 73;
            class305.field4780[186] = 57;
            class305.field4780[221] = 43;
            class305.field4780[222] = 59;
            class305.field4780[220] = 74;
            class305.field4780[188] = 71;
            class305.field4780[223] = 28;
            class305.field4780[189] = 26;
            class305.field4780[190] = 72;
            class305.field4780[187] = 27;
        }
        field3457++;
    }
}
