import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class88 {

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "Lpg;")
    private class333 field1427;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "J")
    public long field1425;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "[[I")
    public static int[][] field1422 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "Lhi;")
    public static class45 field1424 = new class45(3, -1);

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "Ltp;")
    public static class141 field1429 = new class141(14, 1);

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "Ltp;")
    public static class141 field1430 = new class141(15, 4);

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "Ltp;")
    public static class141 field1431 = new class141(16, -2);

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "Ltp;")
    public static class141 field1432 = new class141(17, 0);

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "Ltp;")
    public static class141 field1433 = new class141(18, -2);

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "Ltp;")
    public static class141 field1434 = new class141(19, -2);

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "Ltp;")
    public static class141 field1435 = new class141(20, 6);

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "Ltp;")
    public static class141 field1436 = new class141(21, 9);

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "Ltp;")
    public static class141 field1437 = new class141(22, -2);

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "Ltp;")
    public static class141 field1438 = new class141(23, 4);

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "Ltp;")
    public static class141 field1439 = new class141(24, -1);

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "Ltp;")
    public static class141 field1440 = new class141(25, -2);

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "[Ltp;")
    private static class141[] field1441 = new class141[32];

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field1428;

    static {
        class141[] var0 = class326.method1933(true);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field1441[var0[var1].field2102] = var0[var1];
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V", line = 10)
    public static void method734(int arg0) {
        field1433 = null;
        field1435 = null;
        field1429 = null;
        if (arg0 != 6) {
            field1435 = null;
        }
        field1438 = null;
        field1432 = null;
        field1431 = null;
        field1439 = null;
        field1436 = null;
        field1437 = null;
        field1422 = null;
        field1424 = null;
        field1430 = null;
        field1441 = null;
        field1440 = null;
        field1434 = null;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)I", line = 42)
    public static final int method735(int arg0) {
        int var1 = 59 % ((arg0 + 56) / 46);
        field1428++;
        return 16;
    }

    @OriginalMember(owner = "client!ie", name = "finalize", descriptor = "()V", line = 52)
    protected final void finalize() throws Throwable {
        field1423++;
        this.field1427.method2014(0, this.field1425);
        super.finalize();
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lpg;J[Lbc;)V", line = 60)
    public class88(class333 arg0, long arg1, class508[] arg2) {
        this.field1427 = arg0;
        this.field1425 = arg1;
    }
}
