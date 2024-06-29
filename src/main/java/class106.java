import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class106 {

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "Lbk;")
    private class59 field1547 = new class59();

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "Laf;")
    private class168 field1552 = new class168();

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    private int field1553;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    private int field1554;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "Lac;")
    private class153 field1551;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "[Z")
    public static boolean[] field1539 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "Z")
    public static volatile boolean field1543 = true;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    public static int field1549 = 0;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "[Lqk;")
    public static class57[] field1544 = new class57[14];

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)Lid;")
    public final class247 method705(int arg0) {
        field1540++;
        if (arg0 != -9491) {
            this.field1547 = null;
        }
        return this.field1551.method1066(-123);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V")
    public static void method706(boolean arg0) {
        field1539 = null;
        if (arg0) {
            field1539 = null;
        }
        field1544 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(JB)Lbk;")
    public final class59 method707(long arg0, byte arg1) {
        int var4 = 66 / ((arg1 + 25) / 39);
        field1542++;
        class59 var5 = (class59) this.field1551.method1064(-1, arg0);
        if (var5 != null) {
            this.field1552.method1149(4336, var5);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(Z)V")
    public final void method708(boolean arg0) {
        this.field1552.method1147(110);
        field1546++;
        this.field1551.method1057(89);
        this.field1547 = new class59();
        this.field1553 = this.field1554;
        if (arg0) {
            this.method705(-85);
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(Z)V")
    public static final void method709(boolean arg0) {
        class49.field626.method1511((byte) 107);
        field1545++;
        if (!arg0) {
            field1549 = -66;
        }
        class58.field857.method1511((byte) 92);
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)Lid;")
    public final class247 method710(int arg0) {
        field1541++;
        if (arg0 != 32029) {
            field1543 = true;
        }
        return this.field1551.method1065((byte) -59);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)Lea;")
    public static final class192 method711(int arg0, int arg1) {
        class192 var2 = (class192) class175.field2756.method1517((long) arg0, (byte) -125);
        field1548++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class250.field4050.method501(-2, arg0, 29);
        class192 var4 = new class192();
        if (arg1 != 6199) {
            field1539 = null;
        }
        if (var3 != null) {
            var4.method1351(arg0, new class170(var3), (byte) -59);
        }
        class175.field2756.method1518(var4, (long) arg0, (byte) 75);
        return var4;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZLbk;J)V")
    public final void method712(boolean arg0, class59 arg1, long arg2) {
        field1550++;
        if (this.field1553 == 0) {
            class59 var5 = this.field1552.method1145(false);
            var5.method1764(64);
            var5.method378((byte) -122);
            if (this.field1547 == var5) {
                class59 var6 = this.field1552.method1145(false);
                var6.method1764(64);
                var6.method378((byte) -127);
            }
        } else {
            this.field1553--;
        }
        if (arg0) {
            field1539 = null;
        }
        this.field1551.method1054(-3510, arg1, arg2);
        this.field1552.method1149(4336, arg1);
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I)V")
    public class106(int arg0) {
        this.field1553 = arg0;
        this.field1554 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field1551 = new class153(var2);
    }
}
