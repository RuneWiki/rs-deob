import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class56 extends class75 {

    @OriginalMember(owner = "client!i", name = "Ic", descriptor = "I")
    public static int field1193 = 0;

    @OriginalMember(owner = "client!i", name = "Jc", descriptor = "[I")
    public static int[] field1194 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!i", name = "Nc", descriptor = "[I")
    public static int[] field1198 = new int[500];

    @OriginalMember(owner = "client!i", name = "Mc", descriptor = "Lvc;")
    public static class137 field1197 = class45.method325(": ", -46);

    @OriginalMember(owner = "client!i", name = "Qc", descriptor = "I")
    public static int field1201 = -1;

    @OriginalMember(owner = "client!i", name = "Hc", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!i", name = "Kc", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!i", name = "Lc", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!i", name = "Oc", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!i", name = "Pc", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!i", name = "Rc", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!i", name = "Sc", descriptor = "Lve;")
    public class139 field1203;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "(B)Z")
    public final boolean method384(byte arg0) {
        ++field1200;
        if (this.field1203 == null) {
            return false;
        } else {
            return arg0 > -3 ? true : true;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZZB)I")
    public static final int method385(boolean arg0, boolean arg1, byte arg2) {
        ++field1192;
        int var3 = 0;
        if (arg2 < 101) {
            return -71;
        } else {
            if (arg1) {
                var3 += class137.field3136 + class127.field2997;
            }
            if (arg0) {
                var3 += class77.field1706 + class11.field237;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(Z)Lbf;")
    public final class14 method38(boolean arg0) {
        ++field1202;
        if (this.field1203 == null) {
            return null;
        } else {
            class143 var2 = super.field1654 != -1 && ~super.field1669 == -1 ? class68.method481(0, super.field1654) : null;
            class143 var3 = ~super.field1668 == 0 || super.field1688 == super.field1668 && var2 != null ? null : class68.method481(0, super.field1668);
            class14 var4 = this.field1203.method1062(var3, super.field1680, var2, super.field1637, 1);
            if (var4 == null) {
                return null;
            } else {
                var4.method91();
                super.field1643 = var4.field2395;
                if (~super.field1655 != 0 && ~super.field1660 != 0) {
                    class14 var5 = class128.method957(super.field1655, 13).method790((byte) -75, super.field1660);
                    if (var5 != null) {
                        var5.method108(0, -super.field1620, 0);
                        class14[] var6 = new class14[] { var4, var5 };
                        var4 = new class14(var6, 2);
                    }
                }
                if (this.field1203.field3243 == 1) {
                    var4.field308 = true;
                }
                if (!arg0) {
                    this.method38(false);
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(II)Ldb;")
    public static final class24 method386(int arg0, int arg1) {
        ++field1196;
        class24 var2 = (class24) class58.field1239.method758((long) arg0, (byte) -119);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class6.field108.method668(arg0, -214, 0);
            if (var3 == null) {
                return null;
            } else {
                class24 var4 = new class24();
                class109 var5 = new class109(var3);
                var5.field2583 = var5.field2547.length - 12;
                int var6 = var5.method832(14722);
                var4.field565 = var5.method835(2);
                var4.field564 = var5.method835(2);
                var4.field576 = var5.method835(arg1 ^ 2675);
                var4.field577 = var5.method835(2);
                if (arg1 != 2673) {
                    method388(117);
                }
                var5.field2583 = 0;
                var4.field578 = new int[var6];
                int var7 = 0;
                var4.field570 = new int[var6];
                var4.field571 = new class137[var6];
                while (var5.field2583 < var5.field2547.length + -12) {
                    int var8 = var5.method835(arg1 ^ 2675);
                    if (var8 == 3) {
                        var4.field571[var7] = var5.method833(-1);
                    } else if (~var8 > -101 && ~var8 != -22 && ~var8 != -39 && ~var8 != -40) {
                        var4.field570[var7] = var5.method832(14722);
                    } else {
                        var4.field570[var7] = var5.method838(class77.method571(arg1, 2702));
                    }
                    var4.field578[var7++] = var8;
                }
                class58.field1239.method760(var4, 0, (long) arg0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "g", descriptor = "(B)V")
    public static void method387(byte arg0) {
        field1197 = null;
        if (arg0 != -117) {
            field1193 = -44;
        }
        field1194 = null;
        field1198 = null;
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "(I)V")
    public static final void method388(int arg0) {
        if (arg0 != -1) {
            method385(false, true, (byte) 10);
        }
        ++field1195;
        for (class73 var1 = (class73) class2.field44.method726(~arg0); var1 != null; var1 = (class73) class2.field44.method731((byte) -117)) {
            if (~var1.field1550 < -1) {
                --var1.field1550;
            }
            if (~var1.field1550 != -1) {
                if (~var1.field1541 < -1) {
                    --var1.field1541;
                }
                if (~var1.field1541 == -1 && var1.field1548 >= 1 && ~var1.field1558 <= -2 && var1.field1548 <= 102 && ~var1.field1558 >= -103 && (var1.field1554 < 0 || class137.method996(var1.field1557, arg0 ^ -17414, var1.field1554))) {
                    class19.method168(var1.field1548, var1.field1546, var1.field1554, var1.field1557, var1.field1549, -104, var1.field1545, var1.field1558);
                    var1.field1541 = -1;
                    if (~var1.field1554 == ~var1.field1553 && ~var1.field1553 == 0) {
                        var1.method776(0);
                    } else if (var1.field1554 == var1.field1553 && var1.field1549 == var1.field1539 && ~var1.field1557 == ~var1.field1552) {
                        var1.method776(0);
                    }
                }
            } else if (var1.field1553 < 0 || class137.method996(var1.field1552, 17413, var1.field1553)) {
                class19.method168(var1.field1548, var1.field1546, var1.field1553, var1.field1552, var1.field1539, -104, var1.field1545, var1.field1558);
                var1.method776(0);
            }
        }
    }
}
