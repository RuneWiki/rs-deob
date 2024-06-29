import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class99 {

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field1437 = 1;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "Z")
    public static boolean field1438 = false;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "[[S")
    public static short[][] field1433 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "[I")
    public static int[] field1434;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "[Lbf;")
    public static class108[] field1435;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V")
    public static void method639(byte arg0) {
        field1434 = null;
        field1433 = null;
        field1435 = null;
        int var1 = 13 % ((arg0 + 42) / 49);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIILnh;)[Lta;")
    public static final class203[] method640(int arg0, int arg1, int arg2, class305 arg3) {
        field1432++;
        if (arg0 <= 95) {
            method642((class305) null, (class305) null, -61);
        }
        return class131.method832(arg1, arg2, -124, arg3) ? class222.method1457(true) : null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)V")
    public static final void method641(int arg0, int arg1, int arg2) {
        class123.field1743 = (float) arg0;
        field1436++;
        if (class12.field203 == 2) {
            class277.field4407 = arg2;
            class246.field3870 = arg0;
        }
        if (arg1 != -1506) {
            field1433 = null;
        }
        class160.field2239 = (float) arg2;
        class17.method115(1);
        class115.field1653 = true;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lnh;Lnh;I)V")
    public static final void method642(class305 arg0, class305 arg1, int arg2) {
        int var3 = 36 / ((arg2 + 12) / 50);
        class153.field2130 = arg0;
        field1439++;
        class59.field824 = arg1;
    }
}
