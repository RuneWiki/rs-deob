import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class94 {

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Lmh;")
    public static class128 field1582 = class22.method156(124, "mapscene");

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Lmh;")
    public static class128 field1584 = class22.method156(127, "http:)4)4");

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "Lr;")
    public static class259 field1591 = new class259();

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "I")
    public static int field1597 = 0;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public int field1592;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "Ldj;")
    public static class314 field1585;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "Lwe;")
    public class47 field1590;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "[I")
    public static int[] field1593;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "[I")
    public int[] field1595;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "[Lrf;")
    public static class264[] field1596;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V", line = 8)
    public static final void method587(boolean arg0) {
        field1583++;
        if (class270.field4685.toLowerCase().indexOf("microsoft") == -1) {
            class147.field2513[47] = 73;
            class147.field2513[44] = 71;
            class147.field2513[46] = 72;
            class147.field2513[45] = 26;
            class147.field2513[59] = 57;
            class147.field2513[93] = 43;
            if (class270.field4688 == null) {
                class147.field2513[222] = 59;
                class147.field2513[192] = 58;
            } else {
                class147.field2513[192] = 28;
                class147.field2513[222] = 58;
                class147.field2513[520] = 59;
            }
            class147.field2513[61] = 27;
            class147.field2513[91] = 42;
            class147.field2513[92] = 74;
        } else {
            class147.field2513[192] = 58;
            class147.field2513[188] = 71;
            class147.field2513[220] = 74;
            class147.field2513[221] = 43;
            class147.field2513[190] = 72;
            class147.field2513[186] = 57;
            class147.field2513[223] = 28;
            class147.field2513[222] = 59;
            class147.field2513[187] = 27;
            class147.field2513[189] = 26;
            class147.field2513[191] = 73;
            class147.field2513[219] = 42;
        }
        if (arg0) {
            field1582 = (class128) null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lmh;ILmh;Lmh;I)V", line = 82)
    public static final void method588(class128 arg0, int arg1, class128 arg2, class128 arg3, int arg4) {
        class107.method657(false, arg0, arg3, -1, arg1, arg2);
        field1588++;
        if (arg4 != 59) {
            field1585 = (class314) null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(Z)V", line = 94)
    public static void method589(boolean arg0) {
        field1582 = null;
        field1585 = null;
        field1596 = null;
        field1584 = null;
        if (!arg0) {
            field1591 = (class259) null;
        }
        field1591 = null;
        field1593 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZLmh;)I", line = 115)
    public static final int method590(boolean arg0, class128 arg1) {
        field1587++;
        if (arg1 == null) {
            return -1;
        } else if (arg0) {
            for (int var2 = 0; var2 < class214.field3779; var2++) {
                if (arg1.method861(10362, class313.field5284[var2])) {
                    return var2;
                }
            }
            return -1;
        } else {
            return 69;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V", line = 141)
    public static final void method591(byte arg0) {
        class294.field5028.method1834(17);
        class222.field3897.method1834(17);
        class223.field3907.method1834(17);
        if (arg0 <= -34) {
            field1586++;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIII)V", line = 155)
    public static final void method592(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class71.field1320.field3380 = 0;
        class71.field1320.method1352(7528, 4);
        if (arg2 != 6520) {
            field1585 = (class314) null;
        }
        field1589++;
        class71.field1320.method1352(7528, arg3);
        class71.field1320.method1352(7528, arg4);
        class71.field1320.method1324(arg0, 15803);
        class71.field1320.method1324(arg1, 15803);
        class4.field75 = 1;
        class211.field3740 = 0;
        class192.field3330 = -3;
        class176.field3103 = 0;
    }
}
