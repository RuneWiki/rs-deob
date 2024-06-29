import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class110 {

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "I")
    private int field1583 = 0;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
    public int field1581;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "[Lgl;")
    public class237[] field1566;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "Lwb;")
    public static class123 field1556 = null;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field1557 = new String[5];

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "[Lpd;")
    public static class96[] field1568 = new class96[2048];

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "[I")
    public static int[] field1576 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "[I")
    public static int[] field1575 = new int[14];

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "[I")
    public static int[] field1572 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field1570 = 0;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "J")
    private long field1564;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Lgl;")
    private class237 field1558;

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "Lgl;")
    private class237 field1582;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "[I")
    public static int[] field1565;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static void method700(int arg0) {
        field1575 = null;
        field1568 = null;
        field1576 = null;
        field1565 = null;
        if (arg0 >= -18) {
            method712((byte) 48);
        }
        field1557 = null;
        field1556 = null;
        field1572 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public static final void method701(int arg0, int arg1, String arg2, String arg3, String arg4) {
        field1560++;
        class121.method786(arg1, arg0, false, arg2, arg4, arg3);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)Lgl;")
    public final class237 method702(byte arg0) {
        field1561++;
        int var2 = 109 % ((-arg0 - 32) / 52);
        if (this.field1558 == null) {
            return null;
        }
        class237 var3 = this.field1566[(int) (this.field1564 & (long) (this.field1581 - 1))];
        while (this.field1558 != var3) {
            if (this.field1558.field3923 == this.field1564) {
                class237 var4 = this.field1558;
                this.field1558 = this.field1558.field3914;
                return var4;
            }
            this.field1558 = this.field1558.field3914;
        }
        this.field1558 = null;
        return null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)I")
    public final int method703(boolean arg0) {
        field1577++;
        if (arg0) {
            return 126;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < this.field1581; var3++) {
            class237 var4 = this.field1566[var3];
            for (class237 var5 = var4.field3914; var5 != var4; var5 = var5.field3914) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)I")
    public final int method704(byte arg0) {
        field1559++;
        int var2 = 44 % ((arg0 - 73) / 36);
        return this.field1581;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILjava/lang/String;B)V")
    public static final void method705(int arg0, String arg1, byte arg2) {
        class4.field57.method1932(false, 133);
        if (arg2 < 104) {
            method700(-63);
        }
        class96.field1280++;
        field1567++;
        class4.field57.method580((byte) 93, arg0);
        class4.field57.method571((byte) -63, class185.method1296((byte) -103, arg1));
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V")
    public static final void method706(int arg0, int arg1) {
        field1571++;
        class233 var2 = class114.method746(arg0, 1228126432, arg1);
        var2.method1653(false);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(JLgl;B)V")
    public final void method707(long arg0, class237 arg1, byte arg2) {
        field1573++;
        if (arg1.field3922 != null) {
            arg1.method1673(14510);
        }
        class237 var5 = this.field1566[(int) (arg0 & (long) (this.field1581 - 1))];
        arg1.field3914 = var5;
        arg1.field3922 = var5.field3922;
        if (arg2 != 120) {
            this.field1583 = -63;
        }
        arg1.field3923 = arg0;
        arg1.field3922.field3914 = arg1;
        arg1.field3914.field3922 = arg1;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(JI)Lgl;")
    public final class237 method708(long arg0, int arg1) {
        this.field1564 = arg0;
        field1578++;
        class237 var4 = this.field1566[(int) ((long) (this.field1581 - 1) & arg0)];
        int var5 = 107 % ((arg1 - 87) / 33);
        for (this.field1558 = var4.field3914; this.field1558 != var4; this.field1558 = this.field1558.field3914) {
            if (this.field1558.field3923 == arg0) {
                class237 var6 = this.field1558;
                this.field1558 = this.field1558.field3914;
                return var6;
            }
        }
        this.field1558 = null;
        return null;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(Z)Lgl;")
    public final class237 method709(boolean arg0) {
        field1562++;
        if (this.field1583 > 0 && this.field1566[this.field1583 - 1] != this.field1582) {
            class237 var2 = this.field1582;
            this.field1582 = var2.field3914;
            return var2;
        }
        while (this.field1581 > this.field1583) {
            class237 var3 = this.field1566[this.field1583++].field3914;
            if (this.field1566[this.field1583 - 1] != var3) {
                this.field1582 = var3.field3914;
                return var3;
            }
        }
        if (arg0) {
            field1576 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)Lgl;")
    public final class237 method710(byte arg0) {
        this.field1583 = 0;
        if (arg0 > -10) {
            method712((byte) -21);
        }
        field1580++;
        return this.method709(false);
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(Z)V")
    public final void method711(boolean arg0) {
        if (!arg0) {
            return;
        }
        field1569++;
        for (int var2 = 0; var2 < this.field1581; var2++) {
            class237 var3 = this.field1566[var2];
            while (true) {
                class237 var4 = var3.field3914;
                if (var3 == var4) {
                    break;
                }
                var4.method1673(14510);
            }
        }
        this.field1558 = null;
        this.field1582 = null;
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(B)[Lwj;")
    public static final class149[] method712(byte arg0) {
        if (arg0 != 95) {
            method712((byte) -37);
        }
        field1574++;
        class149[] var1 = new class149[class154.field2407];
        for (int var2 = 0; var2 < class154.field2407; var2++) {
            var1[var2] = new class149(class286.field4562, class245.field4018, class40.field493[var2], class129.field2072[var2], class103.field1387[var2], class172.field2726[var2], class293.field4645[var2], class172.field2729);
        }
        class24.method135(arg0 - 213);
        return var1;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIII)V")
    public static final void method713(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class132.field2105 = arg2;
        field1563++;
        class116.field1653 = arg0;
        class114.field1634 = arg4;
        if (arg3 != 0) {
            field1576 = null;
        }
        class117.field1656 = arg1;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(I)V")
    public class110(int arg0) {
        this.field1581 = arg0;
        this.field1566 = new class237[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class237 var3 = this.field1566[var2] = new class237();
            var3.field3922 = var3;
            var3.field3914 = var3;
        }
    }
}
