import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class104 {

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field1541 = 0;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field1545 = 0;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "Lpg;")
    public static class175 field1543;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
    public static final void method691(boolean arg0) {
        if (class83.field1279.toLowerCase().indexOf("microsoft") == -1) {
            class204.field2955[47] = 73;
            class204.field2955[91] = 42;
            class204.field2955[44] = 71;
            class204.field2955[61] = 27;
            class204.field2955[59] = 57;
            class204.field2955[92] = 74;
            class204.field2955[93] = 43;
            class204.field2955[46] = 72;
            if (class83.field1290 == null) {
                class204.field2955[192] = 58;
                class204.field2955[222] = 59;
            } else {
                class204.field2955[192] = 28;
                class204.field2955[520] = 59;
                class204.field2955[222] = 58;
            }
            class204.field2955[45] = 26;
        } else {
            class204.field2955[187] = 27;
            class204.field2955[188] = 71;
            class204.field2955[223] = 28;
            class204.field2955[219] = 42;
            class204.field2955[189] = 26;
            class204.field2955[190] = 72;
            class204.field2955[220] = 74;
            class204.field2955[221] = 43;
            class204.field2955[192] = 58;
            class204.field2955[191] = 73;
            class204.field2955[222] = 59;
            class204.field2955[186] = 57;
        }
        if (arg0) {
            method692(-45);
        }
        field1542++;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public static void method692(int arg0) {
        field1543 = null;
        if (arg0 != 74) {
            field1545 = -33;
        }
    }
}
