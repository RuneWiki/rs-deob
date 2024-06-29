import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class75 extends class55 {

    @OriginalMember(owner = "client!mc", name = "W", descriptor = "Z")
    public boolean field1563 = false;

    @OriginalMember(owner = "client!mc", name = "hb", descriptor = "I")
    public int field1574 = 0;

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "I")
    public int field1556 = 0;

    @OriginalMember(owner = "client!mc", name = "U", descriptor = "I")
    public int field1561 = 0;

    @OriginalMember(owner = "client!mc", name = "Db", descriptor = "I")
    public int field1596 = 0;

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "Lo;")
    public static class84 field1557 = class15.method124("null", 255);

    @OriginalMember(owner = "client!mc", name = "eb", descriptor = "[I")
    public static int[] field1571 = new int[16384];

    @OriginalMember(owner = "client!mc", name = "nb", descriptor = "Lo;")
    public static class84 field1580 = class15.method124("Loaded sprites", 255);

    @OriginalMember(owner = "client!mc", name = "T", descriptor = "I")
    public static int field1560 = 0;

    @OriginalMember(owner = "client!mc", name = "Eb", descriptor = "[Lo;")
    public static class84[] field1597 = new class84[100];

    @OriginalMember(owner = "client!mc", name = "Pb", descriptor = "Lo;")
    public static class84 field1608 = class15.method124("Loaded config", 255);

    @OriginalMember(owner = "client!mc", name = "kc", descriptor = "Lo;")
    public static class84 field1629 = class15.method124("wave:", 255);

    @OriginalMember(owner = "client!mc", name = "fb", descriptor = "Lo;")
    public static class84 field1572 = class15.method124("title)3jpg", 255);

    @OriginalMember(owner = "client!mc", name = "hc", descriptor = "I")
    public static int field1626 = 0;

    @OriginalMember(owner = "client!mc", name = "ac", descriptor = "Lo;")
    public static class84 field1619 = class15.method124("Loaded wordpack", 255);

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "I")
    public int field1555;

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!mc", name = "X", descriptor = "I")
    public int field1564;

    @OriginalMember(owner = "client!mc", name = "Y", descriptor = "I")
    public int field1565;

    @OriginalMember(owner = "client!mc", name = "Z", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!mc", name = "bb", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!mc", name = "cb", descriptor = "I")
    public int field1569;

    @OriginalMember(owner = "client!mc", name = "db", descriptor = "I")
    private int field1570;

    @OriginalMember(owner = "client!mc", name = "gb", descriptor = "I")
    public int field1573;

    @OriginalMember(owner = "client!mc", name = "kb", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!mc", name = "mb", descriptor = "I")
    public int field1579;

    @OriginalMember(owner = "client!mc", name = "pb", descriptor = "I")
    public int field1582;

    @OriginalMember(owner = "client!mc", name = "qb", descriptor = "I")
    public int field1583;

    @OriginalMember(owner = "client!mc", name = "tb", descriptor = "I")
    public int field1586;

    @OriginalMember(owner = "client!mc", name = "ub", descriptor = "I")
    public int field1587;

    @OriginalMember(owner = "client!mc", name = "vb", descriptor = "I")
    public int field1588;

    @OriginalMember(owner = "client!mc", name = "wb", descriptor = "I")
    public int field1589;

    @OriginalMember(owner = "client!mc", name = "xb", descriptor = "I")
    public int field1590;

    @OriginalMember(owner = "client!mc", name = "yb", descriptor = "I")
    private int field1591;

    @OriginalMember(owner = "client!mc", name = "zb", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!mc", name = "Ab", descriptor = "I")
    public int field1593;

    @OriginalMember(owner = "client!mc", name = "Fb", descriptor = "I")
    public int field1598;

    @OriginalMember(owner = "client!mc", name = "Gb", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!mc", name = "Hb", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!mc", name = "Kb", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!mc", name = "Lb", descriptor = "I")
    public int field1604;

    @OriginalMember(owner = "client!mc", name = "Mb", descriptor = "I")
    public int field1605;

    @OriginalMember(owner = "client!mc", name = "Ob", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!mc", name = "Qb", descriptor = "I")
    public int field1609;

    @OriginalMember(owner = "client!mc", name = "Rb", descriptor = "I")
    public int field1610;

    @OriginalMember(owner = "client!mc", name = "Sb", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!mc", name = "Tb", descriptor = "I")
    public int field1612;

    @OriginalMember(owner = "client!mc", name = "Ub", descriptor = "I")
    public int field1613;

    @OriginalMember(owner = "client!mc", name = "Xb", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!mc", name = "Yb", descriptor = "I")
    public int field1617;

    @OriginalMember(owner = "client!mc", name = "cc", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!mc", name = "ec", descriptor = "I")
    public int field1623;

    @OriginalMember(owner = "client!mc", name = "fc", descriptor = "I")
    public int field1624;

    @OriginalMember(owner = "client!mc", name = "gc", descriptor = "I")
    public int field1625;

    @OriginalMember(owner = "client!mc", name = "ic", descriptor = "I")
    public int field1627;

    @OriginalMember(owner = "client!mc", name = "jc", descriptor = "I")
    public int field1628;

    @OriginalMember(owner = "client!mc", name = "nc", descriptor = "I")
    public int field1632;

    @OriginalMember(owner = "client!mc", name = "oc", descriptor = "I")
    public int field1633;

    @OriginalMember(owner = "client!mc", name = "pc", descriptor = "I")
    public int field1634;

    @OriginalMember(owner = "client!mc", name = "qc", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!mc", name = "ib", descriptor = "Lo;")
    public class84 field1575;

    @OriginalMember(owner = "client!mc", name = "sb", descriptor = "Lo;")
    public class84 field1585;

    @OriginalMember(owner = "client!mc", name = "Cb", descriptor = "Lo;")
    public class84 field1595;

    @OriginalMember(owner = "client!mc", name = "Jb", descriptor = "Lo;")
    public class84 field1602;

    @OriginalMember(owner = "client!mc", name = "dc", descriptor = "Lo;")
    public class84 field1622;

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "Z")
    public boolean field1558;

    @OriginalMember(owner = "client!mc", name = "V", descriptor = "Z")
    public boolean field1562;

    @OriginalMember(owner = "client!mc", name = "ab", descriptor = "Z")
    public boolean field1567;

    @OriginalMember(owner = "client!mc", name = "Ib", descriptor = "Z")
    public boolean field1601;

    @OriginalMember(owner = "client!mc", name = "Wb", descriptor = "Z")
    private boolean field1615;

    @OriginalMember(owner = "client!mc", name = "lc", descriptor = "Z")
    public boolean field1630;

    @OriginalMember(owner = "client!mc", name = "mc", descriptor = "Z")
    public boolean field1631;

    @OriginalMember(owner = "client!mc", name = "jb", descriptor = "[I")
    public int[] field1576;

    @OriginalMember(owner = "client!mc", name = "ob", descriptor = "[I")
    public int[] field1581;

    @OriginalMember(owner = "client!mc", name = "rb", descriptor = "[I")
    public int[] field1584;

    @OriginalMember(owner = "client!mc", name = "Nb", descriptor = "[I")
    public int[] field1606;

    @OriginalMember(owner = "client!mc", name = "Vb", descriptor = "[I")
    public int[] field1614;

    @OriginalMember(owner = "client!mc", name = "Zb", descriptor = "[I")
    public int[] field1618;

    @OriginalMember(owner = "client!mc", name = "bc", descriptor = "[I")
    public int[] field1620;

    @OriginalMember(owner = "client!mc", name = "Bb", descriptor = "[Lo;")
    public class84[] field1594;

    @OriginalMember(owner = "client!mc", name = "lb", descriptor = "[[I")
    public int[][] field1578;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Leb;I)V", line = 26)
    public final void method556(class27 arg0, int arg1) {
        field1611++;
        this.field1627 = arg0.method231(255);
        this.field1569 = arg0.method231(255);
        this.field1624 = arg0.method227(127);
        this.field1564 = this.field1579 = arg0.method224((byte) -126);
        this.field1633 = this.field1589 = arg0.method224((byte) -125);
        this.field1613 = arg0.method227(arg1 ^ 0x7CD8);
        this.field1623 = arg0.method227(127);
        this.field1612 = arg0.method231(255);
        this.field1625 = arg0.method227(127);
        if (this.field1625 == 65535) {
            this.field1625 = -1;
        }
        this.field1598 = arg0.method227(127);
        if (this.field1598 == 65535) {
            this.field1598 = -1;
        }
        int var3 = arg0.method231(255);
        if (var3 > 0) {
            this.field1618 = new int[var3];
            this.field1620 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1618[var4] = arg0.method231(255);
                this.field1620[var4] = arg0.method227(127);
            }
        }
        int var5 = arg0.method231(arg1 ^ 0x7C58);
        if (var5 > 0) {
            this.field1578 = new int[var5][];
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = arg0.method227(arg1 - 31784);
                this.field1578[var6] = new int[var7];
                for (int var8 = 0; var8 < var7; var8++) {
                    this.field1578[var6][var8] = arg0.method227(arg1 - 31784);
                    if (this.field1578[var6][var8] == 65535) {
                        this.field1578[var6][var8] = -1;
                    }
                }
            }
        }
        if (this.field1627 == 0) {
            this.field1609 = arg0.method227(127);
            this.field1562 = arg0.method231(255) == 1;
        }
        if (arg1 != 31911) {
            method563(-100);
        }
        if (this.field1627 == 1) {
            arg0.method227(127);
            arg0.method231(255);
        }
        if (this.field1627 == 2) {
            this.field1576 = new int[this.field1623 * this.field1613];
            this.field1614 = new int[this.field1623 * this.field1613];
            this.field1615 = arg0.method231(255) == 1;
            this.field1601 = arg0.method231(255) == 1;
            this.field1630 = arg0.method231(arg1 - 31656) == 1;
            this.field1563 = arg0.method231(255) == 1;
            this.field1561 = arg0.method231(255);
            this.field1574 = arg0.method231(arg1 - 31656);
            this.field1581 = new int[20];
            this.field1584 = new int[20];
            this.field1606 = new int[20];
            for (int var9 = 0; var9 < 20; var9++) {
                int var11 = arg0.method231(255);
                if (var11 == 1) {
                    this.field1581[var9] = arg0.method224((byte) -121);
                    this.field1606[var9] = arg0.method224((byte) -124);
                    this.field1584[var9] = arg0.method251((byte) 105);
                } else {
                    this.field1584[var9] = -1;
                }
            }
            this.field1594 = new class84[5];
            for (int var10 = 0; var10 < 5; var10++) {
                this.field1594[var10] = arg0.method244((byte) 127);
                if (this.field1594[var10].method639(127) == 0) {
                    this.field1594[var10] = null;
                }
            }
        }
        if (this.field1627 == 3) {
            this.field1631 = arg0.method231(255) == 1;
        }
        if (this.field1627 == 4 || this.field1627 == 1) {
            this.field1558 = arg0.method231(255) == 1;
            this.field1555 = arg0.method231(arg1 ^ 0x7C58);
            this.field1567 = arg0.method231(255) == 1;
        }
        if (this.field1627 == 4) {
            this.field1585 = arg0.method244((byte) 127);
            this.field1602 = arg0.method244((byte) 127);
        }
        if (this.field1627 == 1 || this.field1627 == 3 || this.field1627 == 4) {
            this.field1583 = arg0.method251((byte) 105);
        }
        if (this.field1627 == 3 || this.field1627 == 4) {
            this.field1590 = arg0.method251((byte) 105);
            this.field1632 = arg0.method251((byte) 105);
            this.field1582 = arg0.method251((byte) 105);
        }
        if (this.field1627 == 5) {
            this.field1586 = arg0.method251((byte) 105);
            this.field1604 = arg0.method251((byte) 105);
        }
        if (this.field1627 == 6) {
            this.field1617 = 1;
            this.field1610 = arg0.method227(127);
            this.field1591 = 1;
            if (this.field1610 == 65535) {
                this.field1610 = -1;
            }
            this.field1570 = arg0.method227(127);
            if (this.field1570 == 65535) {
                this.field1570 = -1;
            }
            this.field1565 = arg0.method227(arg1 ^ 0x7CD8);
            if (this.field1565 == 65535) {
                this.field1565 = -1;
            }
            this.field1593 = arg0.method227(arg1 - 31784);
            if (this.field1593 == 65535) {
                this.field1593 = -1;
            }
            this.field1587 = arg0.method227(127);
            this.field1573 = arg0.method227(127);
            this.field1628 = arg0.method227(127);
        }
        if (this.field1627 == 7) {
            this.field1576 = new int[this.field1623 * this.field1613];
            this.field1614 = new int[this.field1623 * this.field1613];
            this.field1558 = arg0.method231(255) == 1;
            this.field1555 = arg0.method231(255);
            this.field1567 = arg0.method231(arg1 ^ 0x7C58) == 1;
            this.field1583 = arg0.method251((byte) 105);
            this.field1561 = arg0.method224((byte) -127);
            this.field1574 = arg0.method224((byte) -121);
            this.field1601 = arg0.method231(255) == 1;
            this.field1594 = new class84[5];
            for (int var12 = 0; var12 < 5; var12++) {
                this.field1594[var12] = arg0.method244((byte) 127);
                if (this.field1594[var12].method639(119) == 0) {
                    this.field1594[var12] = null;
                }
            }
        }
        if (this.field1627 == 8) {
            this.field1585 = arg0.method244((byte) 127);
        }
        if (this.field1569 == 2 || this.field1627 == 2) {
            this.field1622 = arg0.method244((byte) 127);
            this.field1575 = arg0.method244((byte) 127);
            this.field1605 = arg0.method227(127);
        }
        if (this.field1569 != 1 && this.field1569 != 4 && this.field1569 != 5 && this.field1569 != 6) {
            return;
        }
        this.field1595 = arg0.method244((byte) 127);
        if (this.field1595.method639(124) != 0) {
            return;
        }
        if (this.field1569 == 1) {
            this.field1595 = class111.field2393;
        }
        if (this.field1569 == 4) {
            this.field1595 = class107.field2279;
        }
        if (this.field1569 == 5) {
            this.field1595 = class107.field2279;
        }
        if (this.field1569 == 6) {
            this.field1595 = class79.field1679;
            return;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZI)V", line = 313)
    public final void method557(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method558((byte) -92);
        }
        int var4 = this.field1614[arg2];
        this.field1614[arg2] = this.field1614[arg0];
        field1566++;
        this.field1614[arg0] = var4;
        int var5 = this.field1576[arg2];
        this.field1576[arg2] = this.field1576[arg0];
        this.field1576[arg0] = var5;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)V", line = 330)
    public static final void method558(byte arg0) {
        if (arg0 != 35) {
            field1557 = null;
        }
        class85.method679(false, 0, 0, null);
        field1635++;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lad;Lcb;ZI)V", line = 351)
    public static final void method559(class5 arg0, class15 arg1, boolean arg2, int arg3) {
        field1616++;
        byte[] var4 = null;
        class88 var5 = class25.field421;
        synchronized (class25.field421) {
            for (class62 var6 = (class62) class25.field421.method695((byte) -113); var6 != null; var6 = (class62) class25.field421.method702(0)) {
                if ((long) arg3 == var6.field731 && var6.field1292 == arg1 && var6.field1289 == 0) {
                    var4 = var6.field1285;
                    break;
                }
            }
        }
        if (var4 != null) {
            arg0.method33(arg1, arg3, var4, (byte) 2, true);
            return;
        }
        if (!arg2) {
            field1572 = null;
        }
        byte[] var7 = arg1.method128(arg3, 87);
        arg0.method33(arg1, arg3, var7, (byte) 2, true);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILf;ZLle;I)Lne;", line = 410)
    public final class83 method560(int arg0, class31 arg1, boolean arg2, class71 arg3, int arg4) {
        if (arg0 < 103) {
            this.field1613 = -29;
        }
        field1607++;
        class63.field1310 = false;
        int var6;
        int var7;
        if (arg2) {
            var6 = this.field1591;
            var7 = this.field1570;
        } else {
            var6 = this.field1617;
            var7 = this.field1610;
        }
        if (var6 == 0) {
            return null;
        } else if (var6 == 1 && var7 == -1) {
            return null;
        } else {
            class83 var8 = (class83) class109.field2374.method737((long) ((var6 << 16) + var7), (byte) -122);
            if (var8 == null) {
                if (var6 == 1) {
                    var8 = class83.method633(class100.field2132, var7, 0);
                    if (var8 == null) {
                        class63.field1310 = true;
                        return null;
                    }
                    var8.method630();
                    var8.method623(64, 768, -50, -10, -50, true);
                }
                if (var6 == 2) {
                    var8 = class42.method366(106, var7).method351(-2);
                    if (var8 == null) {
                        class63.field1310 = true;
                        return null;
                    }
                    var8.method630();
                    var8.method623(64, 768, -50, -10, -50, true);
                }
                if (var6 == 3) {
                    if (arg3 == null) {
                        return null;
                    }
                    var8 = arg3.method524(-1);
                    if (var8 == null) {
                        class63.field1310 = true;
                        return null;
                    }
                    var8.method630();
                    var8.method623(64, 768, -50, -10, -50, true);
                }
                if (var6 == 4) {
                    class44 var9 = class126.method970(-35, var7);
                    var8 = var9.method378(-10, 10, false);
                    if (var8 == null) {
                        class63.field1310 = true;
                        return null;
                    }
                    var8.method630();
                    var8.method623(var9.field908 + 64, 768 - -var9.field906, -50, -10, -50, true);
                }
                class109.field2374.method744(-120, (long) ((var6 << 16) + var7), var8);
            }
            if (arg1 != null) {
                var8 = arg1.method270(arg4, 65535, var8);
            }
            return var8;
        }
    }

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "(I)V", line = 522)
    public static void method561(int arg0) {
        field1572 = null;
        field1597 = null;
        field1571 = null;
        field1608 = null;
        field1557 = null;
        field1619 = null;
        field1629 = null;
        field1580 = null;
        if (arg0 != 3) {
            field1629 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;", line = 543)
    public static final String method562(Throwable arg0, byte arg1) throws IOException {
        String var3;
        if (arg0 instanceof class16) {
            class16 var2 = (class16) arg0;
            arg0 = var2.field284;
            var3 = var2.field287 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        field1600++;
        arg0.printStackTrace(var5);
        if (arg1 >= -50) {
            return null;
        }
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var3 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var3 = var3 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var3 = var3 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "(I)V", line = 626)
    public static final void method563(int arg0) {
        field1599++;
        if (class107.field2268 != 0) {
            return;
        }
        if (arg0 != -24) {
            field1571 = null;
        }
        int var1 = class105.field2225;
        if (class30.field601 == 1 && class128.field2820 >= 516 && class109.field2367 >= 160 && class128.field2820 <= 765 && class109.field2367 <= 205) {
            var1 = 0;
        }
        if (!class116.field2529) {
            if (var1 == 1 && class40.field805 > 0) {
                int var2 = class63.field1306[class40.field805 - 1];
                if (var2 == 52 || var2 == 55 || var2 == 47 || var2 == 39 || var2 == 26 || var2 == 4 || var2 == 27 || var2 == 46 || var2 == 53 || var2 == 23 || var2 == 1 || var2 == 1002) {
                    int var3 = class41.field835[class40.field805 - 1];
                    int var4 = class42.field864[class40.field805 - 1];
                    class75 var5 = class99.method752(var4, 694);
                    if (var5.field1615 || var5.field1563) {
                        class15.field281 = class128.field2820;
                        class1.field20 = 0;
                        class107.field2268 = 2;
                        if (var4 >> 16 == class27.field528) {
                            class107.field2268 = 1;
                        }
                        if (var4 >> 16 == class104.field2202) {
                            class107.field2268 = 3;
                        }
                        field1560 = class109.field2367;
                        class114.field2488 = var3;
                        class97.field2064 = var4;
                        class84.field1880 = false;
                        return;
                    }
                }
            }
            if (var1 == 1 && (class11.field224 == 1 || class41.method360(class40.field805 - 1, (byte) -7)) && class40.field805 > 2) {
                var1 = 2;
            }
            if (var1 == 1 && class40.field805 > 0) {
                class115.method883((byte) 101, class40.field805 - 1);
            }
            if (var1 == 2 && class40.field805 > 0) {
                class35.method328(false);
                return;
            }
            return;
        }
        if (var1 != 1) {
            int var6 = class38.field748;
            int var7 = class119.field2644;
            if (class1.field24 == 0) {
                var6 -= 4;
                var7 -= 4;
            }
            if (class1.field24 == 1) {
                var7 -= 205;
                var6 -= 553;
            }
            if (class1.field24 == 2) {
                var6 -= 17;
                var7 -= 357;
            }
            if (var6 < class57.field1170 - 10 || var6 > class57.field1170 + class17.field301 + 10 || class128.field2816 - 10 > var7 || var7 > class118.field2628 + class128.field2816 + 10) {
                if (class1.field24 == 1) {
                    class39.field798 = true;
                }
                class116.field2529 = false;
                if (class1.field24 == 2) {
                    class85.field1927 = true;
                }
            }
        }
        if (var1 != 1) {
            return;
        }
        int var8 = class57.field1170;
        int var9 = class128.field2816;
        int var10 = class17.field301;
        int var11 = class109.field2367;
        int var12 = class128.field2820;
        if (class1.field24 == 0) {
            var11 -= 4;
            var12 -= 4;
        }
        int var13 = -1;
        if (class1.field24 == 1) {
            var12 -= 553;
            var11 -= 205;
        }
        if (class1.field24 == 2) {
            var11 -= 357;
            var12 -= 17;
        }
        for (int var14 = 0; var14 < class40.field805; var14++) {
            int var15 = (class40.field805 - var14 - 1) * 15 + var9 + 31;
            if (var12 > var8 && var8 + var10 > var12 && var11 > var15 - 13 && var11 < var15 + 3) {
                var13 = var14;
            }
        }
        if (var13 != -1) {
            class115.method883((byte) 85, var13);
        }
        if (class1.field24 == 2) {
            class85.field1927 = true;
        }
        class116.field2529 = false;
        if (class1.field24 != 1) {
            return;
        }
        class39.field798 = true;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI)Lvb;", line = 806)
    public final class121 method564(boolean arg0, int arg1) {
        field1603++;
        int var3;
        if (arg0) {
            var3 = this.field1604;
        } else {
            var3 = this.field1586;
        }
        class63.field1310 = false;
        if (arg1 == var3) {
            return null;
        }
        class121 var4 = (class121) class39.field772.method737((long) var3, (byte) -103);
        if (var4 != null) {
            return var4;
        }
        class121 var5 = class45.method397((byte) -128, class69.field1482, var3, 0);
        if (var5 == null) {
            class63.field1310 = true;
        } else {
            class39.field772.method744(-128, (long) var3, var5);
        }
        return var5;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(JI)V", line = 846)
    public static final void method565(long arg0, int arg1) {
        field1577++;
        if (arg0 == 0L) {
            return;
        }
        if (class27.field537 >= 100 && class44.field886 != 1) {
            class67.method514(0, class73.field1524, class127.field2798, true);
        } else if (class27.field537 >= 200) {
            class67.method514(0, class73.field1524, class127.field2798, true);
        } else {
            class84 var3 = class57.method463(arg0, (byte) 122).method637(true);
            for (int var4 = 0; var4 < class27.field537; var4++) {
                if (class26.field442[var4] == arg0) {
                    class67.method514(0, class73.field1524, class97.method746(0, new class84[] { var3, class117.field2556 }), true);
                    return;
                }
            }
            for (int var5 = 0; var5 < class118.field2629; var5++) {
                if (class103.field2166[var5] == arg0) {
                    class67.method514(0, class73.field1524, class97.method746(0, new class84[] { class60.field1258, var3, class26.field451 }), true);
                    return;
                }
            }
            if (!var3.method654(-10, class107.field2271.field1312)) {
                class86.field1963++;
                class60.field1256[class27.field537] = var3;
                class26.field442[class27.field537] = arg0;
                class74.field1547[class27.field537] = 0;
                class39.field798 = true;
                if (arg1 > -77) {
                    method565(-46L, 6);
                }
                class27.field537++;
                class97.field2070.method979(1, 98);
                class97.field2070.method203(-24628, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZ)Lvb;", line = 919)
    public final class121 method566(int arg0, boolean arg1) {
        field1559++;
        class63.field1310 = arg1;
        if (arg0 < 0 || arg0 >= this.field1584.length) {
            return null;
        }
        int var3 = this.field1584[arg0];
        if (var3 == -1) {
            return null;
        }
        class121 var4 = (class121) class39.field772.method737((long) var3, (byte) -91);
        if (var4 != null) {
            return var4;
        }
        class121 var5 = class45.method397((byte) -128, class69.field1482, var3, 0);
        if (var5 == null) {
            class63.field1310 = true;
        } else {
            class39.field772.method744(-127, (long) var3, var5);
        }
        return var5;
    }
}
