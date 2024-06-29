import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class109 {

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public int field1559 = 0;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public int field1557 = -1;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public int field1565 = 0;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public int field1562 = 0;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public int field1549 = 0;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    private int field1568 = 0;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "I")
    private int field1574 = 128;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
    private int field1572 = -1;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    private int field1550 = 0;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    private int field1560 = 0;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "I")
    private int field1571 = -1;

    @OriginalMember(owner = "client!ae", name = "T", descriptor = "I")
    public int field1592 = -1;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    private int field1570 = -1;

    @OriginalMember(owner = "client!ae", name = "Y", descriptor = "I")
    public int field1597 = -1;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "I")
    public int field1589 = -1;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public int field1558 = 1;

    @OriginalMember(owner = "client!ae", name = "ab", descriptor = "I")
    private int field1599 = -1;

    @OriginalMember(owner = "client!ae", name = "X", descriptor = "Ljava/lang/String;")
    public String field1596 = "null";

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "I")
    public int field1579 = 0;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    private int field1561 = 0;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    private int field1564 = -1;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "I")
    public int field1580 = -1;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "I")
    public int field1575 = 0;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    private int field1563 = -1;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public int field1552 = 0;

    @OriginalMember(owner = "client!ae", name = "kb", descriptor = "I")
    private int field1609 = 0;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "I")
    public int field1578 = 0;

    @OriginalMember(owner = "client!ae", name = "cb", descriptor = "Z")
    public boolean field1601 = false;

    @OriginalMember(owner = "client!ae", name = "U", descriptor = "I")
    private int field1593 = 128;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
    public int field1567 = -1;

    @OriginalMember(owner = "client!ae", name = "bb", descriptor = "I")
    public int field1600 = -1;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "[Ljava/lang/String;")
    public String[] field1569 = new String[] { null, null, null, null, class353.field5622 };

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public int field1555 = -1;

    @OriginalMember(owner = "client!ae", name = "jb", descriptor = "I")
    private int field1608 = -1;

    @OriginalMember(owner = "client!ae", name = "lb", descriptor = "I")
    public int field1610 = 2000;

    @OriginalMember(owner = "client!ae", name = "vb", descriptor = "I")
    public int field1620 = -1;

    @OriginalMember(owner = "client!ae", name = "wb", descriptor = "I")
    private int field1621 = 0;

    @OriginalMember(owner = "client!ae", name = "hb", descriptor = "I")
    private int field1606 = 0;

    @OriginalMember(owner = "client!ae", name = "P", descriptor = "I")
    private int field1588 = -1;

    @OriginalMember(owner = "client!ae", name = "yb", descriptor = "I")
    public int field1623 = -1;

    @OriginalMember(owner = "client!ae", name = "sb", descriptor = "I")
    private int field1617 = 0;

    @OriginalMember(owner = "client!ae", name = "Ab", descriptor = "[Ljava/lang/String;")
    public String[] field1625 = new String[] { null, null, class76.field1142, null, null };

    @OriginalMember(owner = "client!ae", name = "ib", descriptor = "Z")
    public boolean field1607 = false;

    @OriginalMember(owner = "client!ae", name = "gb", descriptor = "I")
    private int field1605 = 128;

    @OriginalMember(owner = "client!ae", name = "N", descriptor = "Lil;")
    public static class4 field1586 = new class4(16);

    @OriginalMember(owner = "client!ae", name = "mb", descriptor = "I")
    public static int field1611 = 0;

    @OriginalMember(owner = "client!ae", name = "ub", descriptor = "Lsi;")
    public static class264 field1619 = null;

    @OriginalMember(owner = "client!ae", name = "xb", descriptor = "[I")
    public static int[] field1622 = new int[500];

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public int field1551;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!ae", name = "M", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!ae", name = "V", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!ae", name = "Z", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!ae", name = "db", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!ae", name = "eb", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!ae", name = "nb", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!ae", name = "ob", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!ae", name = "rb", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!ae", name = "tb", descriptor = "I")
    private int field1618;

    @OriginalMember(owner = "client!ae", name = "zb", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "Lil;")
    public class4 field1554;

    @OriginalMember(owner = "client!ae", name = "W", descriptor = "[B")
    private byte[] field1595;

    @OriginalMember(owner = "client!ae", name = "O", descriptor = "[I")
    public int[] field1587;

    @OriginalMember(owner = "client!ae", name = "fb", descriptor = "[I")
    public int[] field1604;

    @OriginalMember(owner = "client!ae", name = "qb", descriptor = "[I")
    public static int[] field1615;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "[S")
    private short[] field1547;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "[S")
    private short[] field1573;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "[S")
    private short[] field1581;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "[S")
    private short[] field1583;

    @OriginalMember(owner = "client!ae", name = "pb", descriptor = "[[[I")
    public static int[][][] field1614;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/String;BI)Ljava/lang/String;", line = 10)
    public final String method712(String arg0, byte arg1, int arg2) {
        field1624++;
        if (arg1 != 97) {
            this.method726((byte) 81);
        }
        if (this.field1554 == null) {
            return arg0;
        } else {
            class182 var4 = (class182) this.field1554.method29((long) arg2, 103);
            return var4 == null ? arg0 : var4.field2826;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZZ)Lnb;", line = 34)
    public final class135 method713(boolean arg0, boolean arg1) {
        int var3 = this.field1571;
        int var4 = this.field1563;
        field1613++;
        if (!arg0) {
            this.field1599 = 103;
        }
        if (arg1) {
            var3 = this.field1599;
            var4 = this.field1572;
        }
        if (var4 == -1) {
            return null;
        }
        class135 var5 = class135.method925(class246.field3902, var4, 0);
        if (var3 != -1) {
            class135 var6 = class135.method925(class246.field3902, var3, 0);
            class135[] var7 = new class135[] { var5, var6 };
            var5 = new class135(var7, 2);
        }
        if (this.field1573 != null) {
            for (int var8 = 0; var8 < this.field1573.length; var8++) {
                var5.method904(this.field1573[var8], this.field1581[var8]);
            }
        }
        if (this.field1547 != null) {
            for (int var9 = 0; var9 < this.field1547.length; var9++) {
                var5.method930(this.field1547[var9], this.field1583[var9]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZLfh;)V", line = 98)
    public final void method714(boolean arg0, class313 arg1) {
        while (true) {
            int var3 = arg1.method2224(-122);
            if (var3 == 0) {
                field1598++;
                if (arg0) {
                    this.method721((class340) null, 27);
                }
                return;
            }
            this.method729(arg1, var3, 83);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIII)I", line = 117)
    public static final int method715(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 65536 - class272.field4480[arg0 * 1024 / arg4] >> 1;
        int var6 = 93 % ((57 - arg3) / 32);
        field1594++;
        return ((65536 - var5) * arg2 >> 16) + (arg1 * var5 >> 16);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lae;BLae;)V", line = 134)
    public final void method716(class109 arg0, byte arg1, class109 arg2) {
        this.field1578 = arg0.field1578;
        this.field1558 = arg2.field1558;
        this.field1596 = arg2.field1596;
        this.field1579 = arg0.field1579;
        this.field1595 = arg0.field1595;
        this.field1559 = arg0.field1559;
        if (arg1 != -13) {
            this.field1595 = (byte[]) null;
        }
        this.field1562 = arg0.field1562;
        this.field1549 = arg0.field1549;
        this.field1610 = arg0.field1610;
        this.field1565 = 1;
        this.field1581 = arg0.field1581;
        this.field1601 = arg2.field1601;
        this.field1618 = arg0.field1618;
        this.field1547 = arg0.field1547;
        this.field1573 = arg0.field1573;
        this.field1583 = arg0.field1583;
        field1576++;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILae;Lae;)V", line = 162)
    public final void method717(int arg0, class109 arg1, class109 arg2) {
        this.field1558 = arg0;
        this.field1550 = arg2.field1550;
        this.field1588 = arg2.field1588;
        this.field1581 = arg2.field1581;
        this.field1609 = arg2.field1609;
        this.field1608 = arg2.field1608;
        this.field1601 = arg2.field1601;
        this.field1578 = arg1.field1578;
        this.field1549 = arg1.field1549;
        this.field1547 = arg2.field1547;
        this.field1606 = arg2.field1606;
        this.field1575 = arg2.field1575;
        this.field1573 = arg2.field1573;
        this.field1572 = arg2.field1572;
        this.field1570 = arg2.field1570;
        this.field1597 = arg2.field1597;
        this.field1621 = arg2.field1621;
        this.field1562 = arg1.field1562;
        this.field1568 = arg2.field1568;
        this.field1583 = arg2.field1583;
        this.field1599 = arg2.field1599;
        this.field1625 = arg2.field1625;
        this.field1617 = arg2.field1617;
        this.field1610 = arg1.field1610;
        this.field1564 = arg2.field1564;
        this.field1596 = arg2.field1596;
        this.field1595 = arg2.field1595;
        this.field1563 = arg2.field1563;
        this.field1554 = arg2.field1554;
        this.field1571 = arg2.field1571;
        this.field1569 = new String[5];
        this.field1559 = arg1.field1559;
        field1591++;
        this.field1623 = arg2.field1623;
        this.field1618 = arg1.field1618;
        this.field1579 = arg1.field1579;
        if (arg2.field1569 != null) {
            for (int var4 = 0; var4 < 4; var4++) {
                this.field1569[var4] = arg2.field1569[var4];
            }
        }
        this.field1569[4] = class113.field1660;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZ)Z", line = 223)
    public final boolean method718(int arg0, boolean arg1) {
        if (arg0 != -26846) {
            this.field1571 = -37;
        }
        int var3 = this.field1597;
        field1577++;
        int var4 = this.field1564;
        int var5 = this.field1608;
        if (arg1) {
            var3 = this.field1623;
            var5 = this.field1588;
            var4 = this.field1570;
        }
        if (var3 == -1) {
            return true;
        }
        boolean var6 = true;
        if (!class246.field3902.method1498(var3, arg0 ^ 0x68FD, 0)) {
            var6 = false;
        }
        if (var4 != -1 && !class246.field3902.method1498(var4, -49, 0)) {
            var6 = false;
        }
        if (var5 != -1 && !class246.field3902.method1498(var5, 124, 0)) {
            var6 = false;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBI)I", line = 289)
    public final int method719(int arg0, byte arg1, int arg2) {
        field1612++;
        if (this.field1554 == null) {
            return arg2;
        }
        if (arg1 != 51) {
            this.method718(117, false);
        }
        class94 var4 = (class94) this.field1554.method29((long) arg0, 103);
        return var4 == null ? arg2 : var4.field1373;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V", line = 327)
    public static final void method720(int arg0) {
        field1566++;
        if (class291.field4825 == 0 || class291.field4825 == 5) {
            return;
        }
        try {
            if (++class2.field11 > 2000) {
                if (class346.field5545 != null) {
                    class346.field5545.method674((byte) -83);
                    class346.field5545 = null;
                }
                if (class328.field5369 >= 1) {
                    class291.field4825 = 0;
                    class15.field202 = -5;
                    return;
                }
                class328.field5369++;
                class2.field11 = 0;
                class291.field4825 = 1;
                if (class285.field4669 == class21.field248) {
                    class285.field4669 = class273.field4500;
                } else {
                    class285.field4669 = class21.field248;
                }
            }
            if (class291.field4825 == 1) {
                class218.field3366 = class96.field1382.method1950(class242.field3811, class285.field4669, arg0 ^ 0xFFFFC491);
                class291.field4825 = 2;
            }
            if (class291.field4825 == 2) {
                if (class218.field3366.field2542 == 2) {
                    throw new IOException();
                }
                if (class218.field3366.field2542 != 1) {
                    return;
                }
                class346.field5545 = new class102((Socket) class218.field3366.field2538, class96.field1382);
                class218.field3366 = null;
                long var1 = class65.field960 = class265.method1872(class203.field3116, 81);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class195.field2992.field5137 = 0;
                class195.field2992.method2193(14, false);
                class195.field2992.method2193(var3, false);
                class346.field5545.method669(0, class195.field2992.field5124, 2, (byte) -104);
                if (class291.field4828 != null) {
                    class291.field4828.method1096(false);
                }
                if (class15.field199 != null) {
                    class15.field199.method1096(false);
                }
                int var4 = class346.field5545.method668(0);
                if (class291.field4828 != null) {
                    class291.field4828.method1096(false);
                }
                if (class15.field199 != null) {
                    class15.field199.method1096(false);
                }
                if (var4 != 0) {
                    class15.field202 = var4;
                    class291.field4825 = 0;
                    class346.field5545.method674((byte) -83);
                    class346.field5545 = null;
                    return;
                }
                class291.field4825 = 3;
            }
            if (class291.field4825 == 3) {
                if (class346.field5545.method667(true) < 8) {
                    return;
                }
                int[] var5 = new int[4];
                class346.field5545.method670(0, class159.field2552.field5124, (byte) 18, 8);
                class159.field2552.field5137 = 0;
                class190.field2942 = class159.field2552.method2204(true);
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                class195.field2992.field5137 = 0;
                var5[3] = (int) class190.field2942;
                var5[2] = (int) (class190.field2942 >> 32);
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                class195.field2992.method2193(10, false);
                class195.field2992.method2222(var5[0], 255);
                class195.field2992.method2222(var5[1], arg0 ^ 0xFFFFC431);
                class195.field2992.method2222(var5[2], 255);
                class195.field2992.method2222(var5[3], arg0 + 15409);
                class195.field2992.method2228(class265.method1872(class203.field3116, 54), true);
                class195.field2992.method2223(arg0 + 15154, class356.field5643);
                class195.field2992.method2225(class251.field4006, class132.field2022, (byte) 1);
                class86.field1232.field5137 = 0;
                if (class346.field5553 == 40) {
                    class86.field1232.method2193(18, false);
                } else {
                    class86.field1232.method2193(16, false);
                }
                class86.field1232.method2206(class195.field2992.field5137 + (class26.method223(1, class219.field3370) + 163), (byte) -122);
                class86.field1232.method2222(548, 255);
                class86.field1232.method2193(class183.field2844, false);
                class86.field1232.method2193(class219.field3371 ? 1 : 0, false);
                class86.field1232.method2193(1, false);
                class86.field1232.method2193(class84.method552(arg0 + 15154), false);
                class86.field1232.method2206(class233.field3712, (byte) -87);
                class86.field1232.method2206(class243.field3838, (byte) -59);
                class86.field1232.method2193(class306.field4997, false);
                class81.method544(class86.field1232, true);
                class86.field1232.method2223(0, class219.field3370);
                class86.field1232.method2222(class289.field4807, 255);
                class86.field1232.method2222(class355.method2477(1), 255);
                class81.field1187 = true;
                class86.field1232.method2206(class92.field1356, (byte) -55);
                class86.field1232.method2222(class157.field2522.method1501(0), 255);
                class86.field1232.method2222(class270.field4457.method1501(arg0 + 15154), 255);
                class86.field1232.method2222(class165.field2601.method1501(0), arg0 + 15409);
                class86.field1232.method2222(class141.field2269.method1501(0), arg0 ^ 0xFFFFC431);
                class86.field1232.method2222(class99.field1433.method1501(0), arg0 + 15409);
                class86.field1232.method2222(class97.field1406.method1501(0), 255);
                class86.field1232.method2222(class310.field5042.method1501(arg0 ^ 0xFFFFC4CE), 255);
                class86.field1232.method2222(class248.field3951.method1501(0), arg0 ^ 0xFFFFC431);
                class86.field1232.method2222(class69.field1073.method1501(0), 255);
                class86.field1232.method2222(class319.field5247.method1501(0), 255);
                class86.field1232.method2222(class253.field4020.method1501(0), 255);
                class86.field1232.method2222(class132.field2031.method1501(0), 255);
                class86.field1232.method2222(class249.field3959.method1501(0), arg0 + 15409);
                class86.field1232.method2222(class71.field1099.method1501(arg0 ^ 0xFFFFC4CE), 255);
                class86.field1232.method2222(class102.field1470.method1501(arg0 ^ 0xFFFFC4CE), 255);
                class86.field1232.method2222(class307.field5002.method1501(arg0 ^ 0xFFFFC4CE), 255);
                class86.field1232.method2222(class105.field1525.method1501(0), 255);
                class86.field1232.method2222(class202.field3109.method1501(arg0 + 15154), 255);
                class86.field1232.method2222(class310.field5043.method1501(0), 255);
                class86.field1232.method2222(class278.field4582.method1501(0), arg0 + 15409);
                class86.field1232.method2222(class166.field2608.method1501(0), arg0 ^ 0xFFFFC431);
                class86.field1232.method2222(class276.field4550.method1501(0), arg0 + 15409);
                class86.field1232.method2222(class266.field4369.method1501(0), 255);
                class86.field1232.method2222(class55.field833.method1501(arg0 + 15154), 255);
                class86.field1232.method2222(class102.field1473.method1501(0), 255);
                class86.field1232.method2222(class116.field1697.method1501(0), 255);
                class86.field1232.method2222(class58.field883.method1501(0), arg0 + 15409);
                class86.field1232.method2222(class350.field5598.method1501(arg0 ^ 0xFFFFC4CE), 255);
                class86.field1232.method2222(class268.field4406.method1501(0), 255);
                class86.field1232.method2235((byte) 22, class195.field2992.field5124, 0, class195.field2992.field5137);
                class346.field5545.method669(0, class86.field1232.field5124, class86.field1232.field5137, (byte) -113);
                class195.field2992.method252(var5, arg0 + 15148);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class159.field2552.method252(var5, -6);
                class291.field4825 = 4;
            }
            if (class291.field4825 == 4) {
                if (class346.field5545.method667(true) < 1) {
                    return;
                }
                int var7 = class346.field5545.method668(0);
                if (var7 == 21) {
                    class291.field4825 = 7;
                } else if (var7 == 29) {
                    class291.field4825 = 10;
                } else if (var7 == 1) {
                    class291.field4825 = 5;
                    class15.field202 = var7;
                    return;
                } else if (var7 == 2) {
                    class291.field4825 = 8;
                } else if (var7 == 15) {
                    class15.field202 = var7;
                    class291.field4825 = 0;
                    return;
                } else if (var7 == 23 && class328.field5369 < 1) {
                    class328.field5369++;
                    class2.field11 = 0;
                    class291.field4825 = 1;
                    class346.field5545.method674((byte) -83);
                    class346.field5545 = null;
                    return;
                } else {
                    class15.field202 = var7;
                    class291.field4825 = 0;
                    class346.field5545.method674((byte) -83);
                    class346.field5545 = null;
                    return;
                }
            }
            if (class291.field4825 == 6) {
                class195.field2992.field5137 = 0;
                class195.field2992.method250(21066, 17);
                class346.field5545.method669(0, class195.field2992.field5124, class195.field2992.field5137, (byte) -100);
                class291.field4825 = 4;
                return;
            }
            if (class291.field4825 == 7) {
                if (class346.field5545.method667(true) >= 1) {
                    class202.field3106 = class346.field5545.method668(arg0 ^ 0xFFFFC4CE) * 60 + 180;
                    class291.field4825 = 0;
                    class15.field202 = 21;
                    class346.field5545.method674((byte) -83);
                    class346.field5545 = null;
                    return;
                }
                return;
            }
            if (class291.field4825 == 10) {
                if (class346.field5545.method667(true) >= 1) {
                    class350.field5597 = class346.field5545.method668(0);
                    class15.field202 = 29;
                    class291.field4825 = 0;
                    class346.field5545.method674((byte) -83);
                    class346.field5545 = null;
                    return;
                }
                return;
            }
            if (class291.field4825 == 8) {
                if (class346.field5545.method667(true) < 14) {
                    return;
                }
                class346.field5545.method670(0, class159.field2552.field5124, (byte) 18, 14);
                class159.field2552.field5137 = 0;
                class121.field1804 = class159.field2552.method2224(-125);
                class9.field111 = class159.field2552.method2224(-127);
                class273.field4486 = class159.field2552.method2224(-123) == 1;
                class142.field2288 = class159.field2552.method2224(-125) == 1;
                class300.field4959 = class159.field2552.method2224(-120) == 1;
                class263.field4161 = class159.field2552.method2224(-127) == 1;
                class126.field1950 = class159.field2552.method2224(-123) == 1;
                class102.field1490 = class159.field2552.method2250(-1613178296);
                class59.field900 = class159.field2552.method2224(arg0 + 15027) == 1;
                class312.field5106 = class159.field2552.method2224(-128) == 1;
                class337.method2387(19248, class312.field5106);
                class280.method1990(true, class312.field5106);
                class132.method860(class312.field5106, 55);
                if (!class219.field3371) {
                    if ((!class273.field4486 || class300.field4959) && !class59.field900) {
                        try {
                            class73.method499(26, "unzap", class96.field1382.field4515);
                        } catch (Throwable var14) {
                        }
                    } else {
                        try {
                            class73.method499(34, "zap", class96.field1382.field4515);
                        } catch (Throwable var13) {
                        }
                    }
                }
                try {
                    class73.method499(63, "loggedin", class96.field1382.field4515);
                } catch (Throwable var12) {
                }
                class185.field2867 = class159.field2552.method251(false);
                class201.field3091 = class159.field2552.method2250(-1613178296);
                class291.field4825 = 9;
            }
            if (arg0 != -15154) {
                method728(-39, 94);
            }
            if (class291.field4825 == 9) {
                if (class346.field5545.method667(true) >= class201.field3091) {
                    class159.field2552.field5137 = 0;
                    class346.field5545.method670(0, class159.field2552.field5124, (byte) 18, class201.field3091);
                    class15.field202 = 2;
                    class291.field4825 = 0;
                    class233.method1607(arg0 ^ 0xFFFFD8A3);
                    class50.field749 = -1;
                    class181.method1262(-24903, false);
                    class185.field2867 = -1;
                    return;
                }
                return;
            }
        } catch (IOException var15) {
            if (class346.field5545 != null) {
                class346.field5545.method674((byte) -83);
                class346.field5545 = null;
            }
            if (class328.field5369 < 1) {
                class328.field5369++;
                class2.field11 = 0;
                class291.field4825 = 1;
                if (class285.field4669 == class21.field248) {
                    class285.field4669 = class273.field4500;
                } else {
                    class285.field4669 = class21.field248;
                }
            } else {
                class15.field202 = -4;
                class291.field4825 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lge;I)Lmg;", line = 743)
    public final class67 method721(class340 arg0, int arg1) {
        class135 var3 = class135.method925(class246.field3902, this.field1618, 0);
        field1602++;
        if (var3 == null) {
            return null;
        }
        if (this.field1573 != null) {
            for (int var4 = 0; var4 < this.field1573.length; var4++) {
                if (this.field1595 == null || this.field1595.length <= var4) {
                    var3.method904(this.field1573[var4], this.field1581[var4]);
                } else {
                    var3.method904(this.field1573[var4], class213.field3259[this.field1595[var4] & 0xFF]);
                }
            }
        }
        if (this.field1547 != null) {
            for (int var5 = 0; var5 < this.field1547.length; var5++) {
                var3.method930(this.field1547[var5], this.field1583[var5]);
            }
        }
        if (arg0 != null) {
            for (int var6 = 0; var6 < 5; var6++) {
                if (class96.field1387[var6].length > arg0.field5482[var6]) {
                    var3.method904(class210.field3201[var6], class96.field1387[var6][arg0.field5482[var6]]);
                }
                if (arg0.field5482[var6] < class32.field484[var6].length) {
                    var3.method904(class83.field1198[var6], class32.field484[var6][arg0.field5482[var6]]);
                }
            }
        }
        class67 var7 = var3.method915(this.field1561 + 64, 768 - -this.field1560, -50, -10, -50);
        if (this.field1574 != 128 || this.field1593 != 128 || this.field1605 != 128) {
            var7.method169(this.field1574, this.field1593, this.field1605);
        }
        if (arg1 != 16870) {
            this.method723((byte) 124, true);
        }
        return var7;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(IIIII)V", line = 839)
    public static final void method722(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 12420) {
            method720(-31);
        }
        class33.field505 = arg3;
        field1556++;
        class196.field3001 = arg1;
        class341.field5494 = arg2;
        class278.field4586 = arg4;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BZ)Z", line = 859)
    public final boolean method723(byte arg0, boolean arg1) {
        field1585++;
        int var3 = this.field1571;
        if (arg0 != -114) {
            field1586 = (class4) null;
        }
        int var4 = this.field1563;
        if (arg1) {
            var4 = this.field1572;
            var3 = this.field1599;
        }
        if (var4 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!class246.field3902.method1498(var4, -86, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !class246.field3902.method1498(var3, -98, 0)) {
            var5 = false;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(ZZ)Lnb;", line = 907)
    public final class135 method724(boolean arg0, boolean arg1) {
        field1616++;
        int var3 = this.field1597;
        int var4 = this.field1564;
        int var5 = this.field1608;
        if (arg0) {
            var3 = this.field1623;
            var5 = this.field1588;
            var4 = this.field1570;
        }
        if (var3 == -1) {
            return null;
        }
        if (arg1) {
            this.method730(97, 72);
        }
        class135 var6 = class135.method925(class246.field3902, var3, 0);
        if (var4 != -1) {
            class135 var7 = class135.method925(class246.field3902, var4, 0);
            if (var5 == -1) {
                class135[] var8 = new class135[] { var6, var7 };
                var6 = new class135(var8, 2);
            } else {
                class135 var9 = class135.method925(class246.field3902, var5, 0);
                class135[] var10 = new class135[] { var6, var7, var9 };
                var6 = new class135(var10, 3);
            }
        }
        if (!arg0 && (this.field1609 != 0 || this.field1550 != 0 || this.field1568 != 0)) {
            var6.method914(this.field1609, this.field1550, this.field1568);
        }
        if (arg0 && (this.field1617 != 0 || this.field1606 != 0 || this.field1621 != 0)) {
            var6.method914(this.field1617, this.field1606, this.field1621);
        }
        if (this.field1573 != null) {
            for (int var11 = 0; var11 < this.field1573.length; var11++) {
                var6.method904(this.field1573[var11], this.field1581[var11]);
            }
        }
        if (this.field1547 != null) {
            for (int var12 = 0; var12 < this.field1547.length; var12++) {
                var6.method930(this.field1547[var12], this.field1583[var12]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILge;IILsb;I)Lsm;", line = 991)
    public final class128 method725(int arg0, int arg1, class340 arg2, int arg3, int arg4, class131 arg5, int arg6) {
        field1603++;
        if (this.field1587 != null && arg0 > 1) {
            int var8 = -1;
            for (int var9 = 0; var9 < 10; var9++) {
                if (this.field1604[var9] <= arg0 && this.field1604[var9] != 0) {
                    var8 = this.field1587[var9];
                }
            }
            if (var8 != -1) {
                return class322.method2311(var8, -121).method725(1, arg1, arg2, arg3, arg4, arg5, -97);
            }
        }
        int var10 = 3 % ((arg6 + 63) / 32);
        class128 var11 = (class128) class216.field3325.method652((long) this.field1551, false);
        if (var11 == null) {
            class135 var12 = class135.method925(class246.field3902, this.field1618, 0);
            if (var12 == null) {
                return null;
            }
            if (this.field1573 != null) {
                for (int var13 = 0; var13 < this.field1573.length; var13++) {
                    if (this.field1595 == null || this.field1595.length <= var13) {
                        var12.method904(this.field1573[var13], this.field1581[var13]);
                    } else {
                        var12.method904(this.field1573[var13], class213.field3259[this.field1595[var13] & 0xFF]);
                    }
                }
            }
            if (this.field1547 != null) {
                for (int var14 = 0; var14 < this.field1547.length; var14++) {
                    var12.method930(this.field1547[var14], this.field1583[var14]);
                }
            }
            if (arg2 != null) {
                for (int var15 = 0; var15 < 5; var15++) {
                    if (arg2.field5482[var15] < class96.field1387[var15].length) {
                        var12.method904(class210.field3201[var15], class96.field1387[var15][arg2.field5482[var15]]);
                    }
                    if (class32.field484[var15].length > arg2.field5482[var15]) {
                        var12.method904(class83.field1198[var15], class32.field484[var15][arg2.field5482[var15]]);
                    }
                }
            }
            var11 = var12.method906(this.field1561 + 64, this.field1560 + 768, -50, -10, -50);
            if (this.field1574 != 128 || this.field1593 != 128 || this.field1605 != 128) {
                var11.method169(this.field1574, this.field1593, this.field1605);
            }
            var11.field1966 = true;
            if (class245.field3886) {
                ((class22) var11).method139(false, false, false, true, false, false, true);
            }
            class216.field3325.method642(var11, (long) this.field1551, -89);
        }
        if (arg5 != null) {
            var11 = arg5.method851(arg4, var11, 115, arg3, arg1);
        }
        return var11;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V", line = 1149)
    public final void method726(byte arg0) {
        if (arg0 != 123) {
            this.field1588 = -120;
        }
        field1584++;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V", line = 1163)
    public static void method727(byte arg0) {
        field1619 = null;
        field1622 = null;
        field1615 = null;
        field1586 = null;
        if (arg0 <= 96) {
            method722(-43, 55, 24, 48, 31);
        }
        field1614 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)I", line = 1181)
    public static final int method728(int arg0, int arg1) {
        if (arg1 > -36) {
            field1615 = (int[]) null;
        }
        field1582++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lfh;II)V", line = 1206)
    private final void method729(class313 arg0, int arg1, int arg2) {
        field1590++;
        int var4 = 55 % ((1 - arg2) / 36);
        if (arg1 == 1) {
            this.field1618 = arg0.method2250(-1613178296);
        } else if (arg1 == 2) {
            this.field1596 = arg0.method2198(-430);
        } else if (arg1 == 4) {
            this.field1610 = arg0.method2250(-1613178296);
        } else if (arg1 == 5) {
            this.field1562 = arg0.method2250(-1613178296);
        } else if (arg1 == 6) {
            this.field1579 = arg0.method2250(-1613178296);
        } else if (arg1 == 7) {
            this.field1559 = arg0.method2250(-1613178296);
            if (this.field1559 > 32767) {
                this.field1559 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field1578 = arg0.method2250(-1613178296);
            if (this.field1578 > 32767) {
                this.field1578 -= 65536;
            }
        } else if (arg1 == 11) {
            this.field1565 = 1;
        } else if (arg1 == 12) {
            this.field1558 = arg0.method2231((byte) -127);
        } else if (arg1 == 16) {
            this.field1601 = true;
        } else if (arg1 == 23) {
            this.field1597 = arg0.method2250(-1613178296);
        } else if (arg1 == 24) {
            this.field1564 = arg0.method2250(-1613178296);
        } else if (arg1 == 25) {
            this.field1623 = arg0.method2250(-1613178296);
        } else if (arg1 == 26) {
            this.field1570 = arg0.method2250(-1613178296);
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field1625[arg1 - 30] = arg0.method2198(-430);
            if (this.field1625[arg1 - 30].equalsIgnoreCase(class31.field477)) {
                this.field1625[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field1569[arg1 - 35] = arg0.method2198(-430);
        } else if (arg1 == 40) {
            int var15 = arg0.method2224(-123);
            this.field1581 = new short[var15];
            this.field1573 = new short[var15];
            for (int var16 = 0; var16 < var15; var16++) {
                this.field1573[var16] = (short) arg0.method2250(-1613178296);
                this.field1581[var16] = (short) arg0.method2250(-1613178296);
            }
        } else if (arg1 == 41) {
            int var13 = arg0.method2224(-124);
            this.field1547 = new short[var13];
            this.field1583 = new short[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1547[var14] = (short) arg0.method2250(-1613178296);
                this.field1583[var14] = (short) arg0.method2250(-1613178296);
            }
        } else if (arg1 == 42) {
            int var11 = arg0.method2224(-126);
            this.field1595 = new byte[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1595[var12] = arg0.method2200(87);
            }
        } else if (arg1 == 65) {
            this.field1607 = true;
        } else if (arg1 == 78) {
            this.field1608 = arg0.method2250(-1613178296);
        } else if (arg1 == 79) {
            this.field1588 = arg0.method2250(-1613178296);
        } else if (arg1 == 90) {
            this.field1563 = arg0.method2250(-1613178296);
        } else if (arg1 == 91) {
            this.field1572 = arg0.method2250(-1613178296);
        } else if (arg1 == 92) {
            this.field1571 = arg0.method2250(-1613178296);
        } else if (arg1 == 93) {
            this.field1599 = arg0.method2250(-1613178296);
        } else if (arg1 == 95) {
            this.field1549 = arg0.method2250(-1613178296);
        } else if (arg1 == 96) {
            this.field1552 = arg0.method2224(-128);
        } else if (arg1 == 97) {
            this.field1580 = arg0.method2250(-1613178296);
        } else if (arg1 == 98) {
            this.field1555 = arg0.method2250(-1613178296);
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field1587 == null) {
                this.field1604 = new int[10];
                this.field1587 = new int[10];
            }
            this.field1587[arg1 - 100] = arg0.method2250(-1613178296);
            this.field1604[arg1 - 100] = arg0.method2250(-1613178296);
        } else if (arg1 == 110) {
            this.field1574 = arg0.method2250(-1613178296);
        } else if (arg1 == 111) {
            this.field1593 = arg0.method2250(-1613178296);
        } else if (arg1 == 112) {
            this.field1605 = arg0.method2250(-1613178296);
        } else if (arg1 == 113) {
            this.field1561 = arg0.method2200(125);
        } else if (arg1 == 114) {
            this.field1560 = arg0.method2200(79) * 5;
        } else if (arg1 == 115) {
            this.field1575 = arg0.method2224(-127);
        } else if (arg1 == 121) {
            this.field1567 = arg0.method2250(-1613178296);
        } else if (arg1 == 122) {
            this.field1557 = arg0.method2250(-1613178296);
        } else if (arg1 == 125) {
            this.field1609 = arg0.method2200(67);
            this.field1550 = arg0.method2200(47);
            this.field1568 = arg0.method2200(67);
        } else if (arg1 == 126) {
            this.field1617 = arg0.method2200(-87);
            this.field1606 = arg0.method2200(-95);
            this.field1621 = arg0.method2200(-118);
        } else if (arg1 == 127) {
            this.field1620 = arg0.method2224(-123);
            this.field1592 = arg0.method2250(-1613178296);
        } else if (arg1 == 128) {
            this.field1589 = arg0.method2224(-123);
            this.field1600 = arg0.method2250(-1613178296);
        } else if (arg1 == 129) {
            arg0.method2224(-122);
            arg0.method2250(-1613178296);
        } else if (arg1 == 130) {
            arg0.method2224(-125);
            arg0.method2250(-1613178296);
        } else if (arg1 == 249) {
            int var5 = arg0.method2224(-127);
            if (this.field1554 == null) {
                int var6 = class329.method2347(var5, (byte) -96);
                this.field1554 = new class4(var6);
            }
            for (int var7 = 0; var7 < var5; var7++) {
                boolean var8 = arg0.method2224(-123) == 1;
                int var9 = arg0.method2249(-79);
                class159 var10;
                if (var8) {
                    var10 = new class182(arg0.method2198(-430));
                } else {
                    var10 = new class94(arg0.method2231((byte) -128));
                }
                this.field1554.method37(false, var10, (long) var9);
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)Lae;", line = 1550)
    public final class109 method730(int arg0, int arg1) {
        if (arg0 != 17551) {
            method727((byte) -15);
        }
        field1553++;
        if (this.field1587 != null && arg1 > 1) {
            int var3 = -1;
            for (int var4 = 0; var4 < 10; var4++) {
                if (this.field1604[var4] <= arg1 && this.field1604[var4] != 0) {
                    var3 = this.field1587[var4];
                }
            }
            if (var3 != -1) {
                return class322.method2311(var3, -110);
            }
        }
        return this;
    }
}
