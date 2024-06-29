import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class124 {

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public int field1591;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public int field1593;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public int field1594;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public int field1596;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public int field1598;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public int field1599;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public int field1600;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "Ljava/lang/Object;")
    public static Object field1597;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "[B")
    public byte[] field1590;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "[B")
    public byte[] field1592;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZII)Z", line = 5)
    public static final boolean method860(int arg0, boolean arg1, int arg2, int arg3) {
        field1595++;
        if (!class186.field2276) {
            return false;
        } else if (class86.field1213 < 100) {
            return false;
        } else {
            int var4 = class395.field5587[arg2][arg3][arg0];
            if ((-class128.field1633) == var4) {
                return false;
            } else if (class128.field1633 == var4) {
                return true;
            } else if (class340.field4500 == class155.field1899) {
                return false;
            } else {
                if (arg1) {
                    method861(-30);
                }
                int var5 = arg3 << class295.field3981;
                int var6 = arg0 << class295.field3981;
                if (class201.method1227(class155.field1899[arg2].method437(101, arg0 + 1, arg3), class155.field1899[arg2].method437(125, arg0 + 1, arg3 + 1), var6 + class454.field6392 - 1, var5 + 1, class454.field6392 + var6 - 1, 4637, class155.field1899[arg2].method437(111, arg0, arg3), var5 + 1, var6 + 1, class454.field6392 + var5 - 1) && class201.method1227(class155.field1899[arg2].method437(119, arg0 + 1, arg3 + 1), class155.field1899[arg2].method437(117, arg0, arg3 + 1), var6 + 1, var5 - -1, class454.field6392 + var6 - 1, 4637, class155.field1899[arg2].method437(103, arg0, arg3), var5 + class454.field6392 - 1, var6 + 1, class454.field6392 + var5 - 1)) {
                    class577.field8430++;
                    class395.field5587[arg2][arg3][arg0] = class128.field1633;
                    return true;
                } else {
                    class395.field5587[arg2][arg3][arg0] = -class128.field1633;
                    return false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 58)
    public static void method861(int arg0) {
        field1597 = null;
        if (arg0 != 5) {
            field1597 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V", line = 70)
    public static final void method862(int arg0) {
        class534.field7800.method1498((byte) -66, 5);
        field1601++;
        class176.field2178.method2189((byte) -124, 5);
        class616.field8848.method3438(5, 2);
        class37.field703.method808(0, 5);
        class206.field2477.method1950(5, false);
        class65.field1021.method184(5, (byte) 70);
        class195.field2367.method3271(5, (byte) -96);
        class276.field3774.method134(true, 5);
        class342.field4519.method2678(5, -1);
        class193.field2350.method686((byte) 67, 5);
        class332.field4418.method729(5, (byte) 67);
        class455.field6408.method3817(-114, 5);
        class308.field4085.method560(5, arg0 ^ 0xFFFFFF88);
        class582.field8483.method2538(5, (byte) -49);
        class496.field6935.method1779((byte) 94, arg0);
        class415.field5873.method2757(5, -1);
        class32.field653.method2510(105, 5);
        class39.field731.method1392(5, (byte) 47);
        class404.field5708.method2760(5, arg0 - 5);
        class468.field6543.method1824(3157, 5);
        class222.method1353(5, true);
        class588.method3406(50, arg0 ^ 0x76);
        class564.method3301(arg0 - 6, 50);
        class70.method629(5, false);
        class5.method33(5, (byte) 91);
        class89.field1252.method2777(5, 96);
        class72.field1088.method2777(5, 48);
        class48.field814.method2777(5, 34);
        class514.field7541.method2777(5, arg0 + 42);
        class545.field7926.method2777(5, 69);
    }
}
