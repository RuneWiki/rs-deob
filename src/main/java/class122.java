import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class122 {

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "Z")
    public static boolean field1615 = false;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field1614 = -1;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field1620 = 0;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "Lae;")
    public static class283 field1617;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "Lvt;")
    public static class768 field1621;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZLsha;III)V")
    public static final void method859(boolean arg0, class115 arg1, int arg2, int arg3, int arg4) {
        field1618++;
        int var5 = arg1.field1560;
        int var6 = -53 / ((arg3 - 50) / 61);
        if (arg1.field1513 == 0) {
            arg1.field1560 = arg1.field1532;
        } else if (arg1.field1513 == 1) {
            arg1.field1560 = arg2 - arg1.field1532;
        } else if (arg1.field1513 == 2) {
            arg1.field1560 = arg1.field1532 * arg2 >> 14;
        }
        int var7 = arg1.field1517;
        if (arg1.field1568 == 0) {
            arg1.field1517 = arg1.field1470;
        } else if (arg1.field1568 == 1) {
            arg1.field1517 = arg4 - arg1.field1470;
        } else if (arg1.field1568 == 2) {
            arg1.field1517 = arg1.field1470 * arg4 >> 14;
        }
        if (arg1.field1513 == 4) {
            arg1.field1560 = arg1.field1517 * arg1.field1467 / arg1.field1415;
        }
        if (arg1.field1568 == 4) {
            arg1.field1517 = arg1.field1560 * arg1.field1415 / arg1.field1467;
        }
        if (class635.field8860 && (client.method779(arg1).field2201 != 0 || arg1.field1564 == 0)) {
            if (arg1.field1517 < 5 && arg1.field1560 < 5) {
                arg1.field1560 = 5;
                arg1.field1517 = 5;
            } else {
                if (arg1.field1560 <= 0) {
                    arg1.field1560 = 5;
                }
                if (arg1.field1517 <= 0) {
                    arg1.field1517 = 5;
                }
            }
        }
        if (class166.field2124 == arg1.field1553) {
            class53.field643 = arg1;
        }
        if (arg0 && arg1.field1492 != null && arg1.field1560 != var5 || arg1.field1517 != var7) {
            class114 var8 = new class114();
            var8.field1384 = arg1.field1492;
            var8.field1378 = arg1;
            class495.field6812.method1039(var8, 0);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIILha;II)V")
    public static final void method860(int arg0, int arg1, int arg2, int arg3, int arg4, class473 arg5, int arg6, int arg7) {
        field1616++;
        arg5.method2822(arg7, arg0, arg4, 1, arg1, arg3);
        arg5.method2822(16, arg0 - 2, arg4 + 1, 1, arg1 - arg6, arg2);
        arg5.method2818(arg2, arg0 - 2, arg4 + 1, (byte) -55, arg1 + 18, arg7 + -19);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
    public static final void method861(int arg0) {
        class447.method2710(-20466);
        field1613++;
        int var1 = class688.field9602.field8545.method4143((byte) -98);
        if (var1 == 2) {
            class234.method1601(class249.field3700, (byte) -54, 100, class111.field1332, class742.field10226, 100);
        } else if (var1 == 3) {
            class275.method1791(-31504, class49.field588, class249.field3700, 2, class111.field1332, 2, class742.field10226, class424.field5895);
        }
        if (arg0 < 13) {
            method860(86, 98, 34, -45, 96, null, 47, 87);
        }
        if (class688.field9602.field8545.method4144((byte) 21)) {
            class664.method3787((byte) -81, class749.field10341);
        }
        if (class111.field1332 != null) {
            class305.method1988((byte) -27);
        }
        class529.field7284 = class688.field9602.field8545.method4143((byte) -98) != 0;
        class55.field651 = class688.field9602.field8545.method4144((byte) -8);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)V")
    public static void method862(boolean arg0) {
        field1617 = null;
        if (arg0) {
            method861(50);
        }
        field1621 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IBZ)Lrk;")
    public static final class289 method863(int arg0, byte arg1, boolean arg2) {
        field1619++;
        class519[] var3 = class187.field2329;
        synchronized (class187.field2329) {
            class289 var4;
            if (class187.field2329.length <= arg0 || class187.field2329[arg0].method3102((byte) 81)) {
                var4 = new class289();
                var4.field4255 = new class21[arg0];
                for (int var5 = 0; var5 < arg0; var5++) {
                    var4.field4255[var5] = new class21();
                }
            } else {
                var4 = (class289) class187.field2329[arg0].method3101((byte) 59);
                var4.method2773(5);
                int var10002 = class718.field9948[arg0]--;
            }
            var4.field4257 = arg2;
            return arg1 < 75 ? null : var4;
        }
    }
}
