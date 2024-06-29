import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class68 {

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "Lkh;")
    private static class117 field1302 = class224.method1450((byte) 127, " ");

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "[[S")
    public static short[][] field1303 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "[S")
    public static short[] field1304 = new short[256];

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "Lkh;")
    public static class117 field1300 = field1302;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "[Lkh;")
    public static class117[] field1301 = new class117[200];

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public static void method478(int arg0) {
        field1301 = null;
        field1302 = null;
        field1304 = null;
        field1300 = null;
        if (arg0 >= -36) {
            method479(31, -113);
        }
        field1303 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)I")
    public static final int method479(int arg0, int arg1) {
        int var7 = arg0 - 1;
        field1306++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        if (arg1 < 20) {
            field1304 = null;
        }
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lnc;I)Lih;")
    public static final class95 method480(class145 arg0, int arg1) {
        field1307++;
        if (arg1 != 11146) {
            method478(66);
        }
        class95 var2 = new class95();
        var2.field1745 = arg0.method1049((byte) 95);
        var2.field1741 = class172.method1204((byte) -94, var2.field1745);
        return var2;
    }
}
