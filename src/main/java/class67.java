import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class67 {

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "Z")
    public static boolean field1474 = false;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "Lae;")
    private static class6 field1480 = class64.method474(117, "K");

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "Lae;")
    public static class6 field1484 = field1480;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "Lae;")
    public static class6 field1486 = field1480;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "Lbd;")
    public static class12 field1476 = new class12(50);

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "Lae;")
    public static class6 field1488 = class64.method474(104, "@cr1@");

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    public static int field1489 = 1;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "Lbf;")
    public static class14 field1481;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "Lda;")
    public static class21 field1491;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILae;Lae;Lae;)V", line = 4)
    public static final void method486(int arg0, class6 arg1, class6 arg2, class6 arg3) {
        class102.field2389 = arg1;
        class102.field2414 = arg3;
        field1487++;
        if (arg0 != 8845) {
            method486(126, null, null, null);
        }
        class102.field2392 = arg2;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V", line = 19)
    public static void method487(int arg0) {
        if (arg0 <= 76) {
            method488(-79, -45, 65);
        }
        field1491 = null;
        field1476 = null;
        field1484 = null;
        field1488 = null;
        field1486 = null;
        field1480 = null;
        field1481 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)V", line = 35)
    public static final void method488(int arg0, int arg1, int arg2) {
        field1477++;
        if (arg0 != 1) {
            field1490 = -95;
        }
        if (class76.field1795 != 0 && arg2 != -1) {
            class70.method510(87, 0, 1, false, class62.field1368, class76.field1795, arg2);
            class21.field519 = arg1;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)Z", line = 57)
    public static final boolean method489(byte arg0, int arg1) {
        if (arg0 != 56) {
            method486(-83, null, null, null);
        }
        field1478++;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(BI)Lte;", line = 79)
    public static final class121 method490(byte arg0, int arg1) {
        field1483++;
        if (arg0 <= 4) {
            method491((byte) -80);
        }
        int var2 = arg1 & 0xFFFF;
        int var3 = arg1 >> 16;
        if (class35.field828[var3] == null || class35.field828[var3][var2] == null) {
            boolean var4 = class21.method208(0, var3);
            if (!var4) {
                return null;
            }
        }
        return class35.field828[var3][var2];
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V", line = 145)
    public static final void method491(byte arg0) {
        field1482++;
        if (class32.field775 > 0) {
            class117.method964(7641);
            return;
        }
        class139.method1122((byte) 40, 40);
        class107.field2531 = field1491;
        if (arg0 >= 33) {
            field1491 = null;
        }
    }
}
