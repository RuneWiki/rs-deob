import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class92 extends class287 {

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "Lnd;")
    public static class58 field1432 = new class58();

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "Ltl;")
    public static class59 field1436 = class85.method639("Bitte entfernen Sie ", 9588);

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "Ltl;")
    private static class59 field1437 = class85.method639(" has logged out)3", 9588);

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "Ltl;")
    public static class59 field1435 = field1437;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "B")
    public byte field1431;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public int field1429;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "Ltl;")
    public class59 field1428;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "Ltl;")
    public class59 field1430;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)V", line = 4)
    public static final void method673(int arg0, int arg1, int arg2) {
        field1426++;
        if (class99.field1600 != arg2 && arg0 != -1) {
            class150.method1082(96, false, class149.field2448, arg0, 0, class99.field1600);
            class254.field4219 = true;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(Z)V", line = 26)
    public static void method674(boolean arg0) {
        field1437 = null;
        field1432 = null;
        field1435 = null;
        if (!arg0) {
            field1436 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)I", line = 57)
    public static final int method675(int arg0, int arg1) {
        int var2 = 115 / ((arg1 + 6) / 42);
        field1427++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V", line = 76)
    public static final void method676(byte arg0) {
        class219.field3554++;
        field1434++;
        if (arg0 != -43) {
            field1437 = (class59) null;
        }
        class234.field3888.method1768(true, 125);
        class234.field3888.method1219(class284.method1988((byte) 68), true);
        class234.field3888.method1237(true, class152.field2498);
        class234.field3888.method1237(true, class53.field792);
    }
}
