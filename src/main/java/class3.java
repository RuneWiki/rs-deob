import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class3 extends class61 {

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public int field49;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "Llc;")
    public static class143 field42 = class66.method374("p11_full", -1);

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "Llc;")
    public static class143 field45 = class66.method374(" steht bereits auf Ihrer Freunde)2Liste(Q", -1);

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public static int field41 = 0;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "[I")
    public static int[] field43;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "[Lbc;")
    public static class100[] field46;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)V")
    public static final void method8(boolean arg0) {
        field44++;
        if (class81.field1465.toLowerCase().indexOf("microsoft") == -1) {
            class21.field334[91] = 42;
            class21.field334[46] = 72;
            class21.field334[45] = 26;
            class21.field334[47] = 73;
            class21.field334[44] = 71;
            class21.field334[61] = 27;
            class21.field334[92] = 74;
            class21.field334[59] = 57;
            class21.field334[93] = 43;
            if (class81.field1486 == null) {
                class21.field334[222] = 59;
                class21.field334[192] = 58;
            } else {
                class21.field334[192] = 28;
                class21.field334[520] = 59;
                class21.field334[222] = 58;
            }
        } else {
            class21.field334[221] = 43;
            class21.field334[220] = 74;
            class21.field334[190] = 72;
            class21.field334[191] = 73;
            class21.field334[219] = 42;
            class21.field334[186] = 57;
            class21.field334[189] = 26;
            class21.field334[187] = 27;
            class21.field334[188] = 71;
            class21.field334[192] = 58;
            class21.field334[223] = 28;
            class21.field334[222] = 59;
        }
        if (!arg0) {
            method12(70);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)V")
    public static final void method9(byte arg0, int arg1) {
        field47++;
        class162 var2 = (class162) class143.field2518.method1824((long) arg1, 0);
        if (var2 == null) {
            return;
        }
        int var3 = -13 / ((65 - arg0) / 53);
        for (int var4 = 0; var4 < var2.field2916.length; var4++) {
            var2.field2916[var4] = -1;
            var2.field2911[var4] = 0;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IZ)I")
    public static final int method10(int arg0, boolean arg1) {
        if (class17.field298 != null) {
            class17.field298.method1682(1);
            class17.field298 = null;
        }
        class245.field4394++;
        field40++;
        if (class245.field4394 > 4) {
            class245.field4394 = 0;
            class175.field3134 = 0;
            return arg0;
        }
        if (class80.field1455 == class49.field945) {
            class49.field945 = class57.field1108;
        } else {
            class49.field945 = class80.field1455;
        }
        class175.field3134 = 0;
        return arg1 ? -1 : -125;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V")
    public static final void method11(int arg0) {
        if (arg0 != 5415) {
            field42 = null;
        }
        field48++;
        class243.field4372.method824(arg0 - 5534);
        class229.field4186.method824(-120);
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V")
    public static void method12(int arg0) {
        field45 = null;
        field43 = null;
        field42 = null;
        field46 = null;
        if (arg0 != 72) {
            field41 = 35;
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class3() {
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(I)V")
    public class3(int arg0) {
        this.field49 = arg0;
    }
}
