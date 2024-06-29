import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class97 {

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "B")
    private byte field1512 = 0;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public int field1513 = 0;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "Z")
    public boolean field1509 = false;

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "I")
    private int field1527 = 0;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public int field1501 = -1;

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "Z")
    public boolean field1536 = false;

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "I")
    public int field1535 = -1;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "Z")
    public boolean field1518 = false;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public int field1508 = -1;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "Z")
    public boolean field1524 = true;

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "I")
    public int field1541 = 0;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "S")
    private short field1504 = -1;

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "[I")
    private int[] field1539 = null;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    private int field1505 = -1;

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "I")
    public int field1526 = -1;

    @OriginalMember(owner = "client!ie", name = "V", descriptor = "Z")
    public boolean field1546 = false;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    private int field1499 = 0;

    @OriginalMember(owner = "client!ie", name = "Y", descriptor = "I")
    public int field1549 = 1;

    @OriginalMember(owner = "client!ie", name = "nb", descriptor = "I")
    public int field1564 = 16;

    @OriginalMember(owner = "client!ie", name = "I", descriptor = "[Ljava/lang/String;")
    public String[] field1533 = new String[5];

    @OriginalMember(owner = "client!ie", name = "T", descriptor = "Z")
    public boolean field1544 = true;

    @OriginalMember(owner = "client!ie", name = "tb", descriptor = "I")
    private int field1570 = 0;

    @OriginalMember(owner = "client!ie", name = "gb", descriptor = "I")
    public int field1557 = -1;

    @OriginalMember(owner = "client!ie", name = "ib", descriptor = "I")
    public int field1559 = 1;

    @OriginalMember(owner = "client!ie", name = "xb", descriptor = "I")
    private int field1574 = 0;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    public int field1510 = -1;

    @OriginalMember(owner = "client!ie", name = "rb", descriptor = "I")
    public int field1568 = -1;

    @OriginalMember(owner = "client!ie", name = "fb", descriptor = "Z")
    private boolean field1556 = false;

    @OriginalMember(owner = "client!ie", name = "qb", descriptor = "I")
    public int field1567 = 255;

    @OriginalMember(owner = "client!ie", name = "db", descriptor = "I")
    private int field1554 = 128;

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
    private int field1538 = 0;

    @OriginalMember(owner = "client!ie", name = "Z", descriptor = "Z")
    private boolean field1550 = false;

    @OriginalMember(owner = "client!ie", name = "zb", descriptor = "Z")
    public boolean field1576 = false;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "Z")
    public boolean field1511 = true;

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "I")
    public int field1540 = -1;

    @OriginalMember(owner = "client!ie", name = "W", descriptor = "I")
    public int field1547 = 0;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
    public int field1523 = -1;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public int field1515 = -1;

    @OriginalMember(owner = "client!ie", name = "Ab", descriptor = "I")
    public int field1577 = 0;

    @OriginalMember(owner = "client!ie", name = "ub", descriptor = "I")
    public int field1571 = -1;

    @OriginalMember(owner = "client!ie", name = "Db", descriptor = "I")
    private int field1580 = 0;

    @OriginalMember(owner = "client!ie", name = "yb", descriptor = "I")
    public int field1575 = 2;

    @OriginalMember(owner = "client!ie", name = "Ib", descriptor = "Z")
    public boolean field1585 = false;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    private int field1520 = 128;

    @OriginalMember(owner = "client!ie", name = "Eb", descriptor = "[I")
    public int[] field1581 = null;

    @OriginalMember(owner = "client!ie", name = "Gb", descriptor = "Z")
    public boolean field1583 = false;

    @OriginalMember(owner = "client!ie", name = "Bb", descriptor = "I")
    private int field1578 = 128;

    @OriginalMember(owner = "client!ie", name = "cb", descriptor = "I")
    private int field1553 = -1;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "Z")
    public boolean field1517 = false;

    @OriginalMember(owner = "client!ie", name = "Kb", descriptor = "Z")
    public boolean field1587 = false;

    @OriginalMember(owner = "client!ie", name = "pb", descriptor = "Ljava/lang/String;")
    public String field1566 = "null";

    @OriginalMember(owner = "client!ie", name = "Jb", descriptor = "Z")
    public boolean field1586 = true;

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "Ljava/lang/String;")
    public static String field1542 = "Ok";

    @OriginalMember(owner = "client!ie", name = "S", descriptor = "Lld;")
    public static class136 field1543 = null;

    @OriginalMember(owner = "client!ie", name = "vb", descriptor = "[Z")
    public static boolean[] field1572 = new boolean[112];

    @OriginalMember(owner = "client!ie", name = "ob", descriptor = "I")
    public static int field1565 = -1;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
    public int field1522;

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!ie", name = "H", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!ie", name = "U", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!ie", name = "X", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!ie", name = "bb", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!ie", name = "eb", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!ie", name = "jb", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!ie", name = "lb", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!ie", name = "wb", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!ie", name = "Fb", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!ie", name = "Lb", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "Lcg;")
    public static class49 field1529;

    @OriginalMember(owner = "client!ie", name = "ab", descriptor = "Lcg;")
    public static class49 field1551;

    @OriginalMember(owner = "client!ie", name = "Hb", descriptor = "Lcg;")
    public static class49 field1584;

    @OriginalMember(owner = "client!ie", name = "hb", descriptor = "Ltm;")
    private class79 field1558;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "[B")
    private byte[] field1525;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "[I")
    private int[] field1503;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "[I")
    public int[] field1507;

    @OriginalMember(owner = "client!ie", name = "mb", descriptor = "[I")
    private int[] field1563;

    @OriginalMember(owner = "client!ie", name = "Cb", descriptor = "[I")
    public int[] field1579;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "[S")
    private short[] field1500;

    @OriginalMember(owner = "client!ie", name = "G", descriptor = "[S")
    private short[] field1531;

    @OriginalMember(owner = "client!ie", name = "kb", descriptor = "[S")
    private short[] field1561;

    @OriginalMember(owner = "client!ie", name = "sb", descriptor = "[S")
    private short[] field1569;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILta;Z[[I[[IIIZIII)Lpc;", line = 5)
    public final class102 method823(int arg0, class217 arg1, boolean arg2, int[][] arg3, int[][] arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        field1532++;
        int var12 = 101 / ((arg8 - 60) / 58);
        if (class43.field680) {
            long var18;
            if (this.field1503 == null) {
                var18 = (long) ((this.field1522 << 10) + arg5);
            } else {
                var18 = (long) ((this.field1522 << 10) + arg5 + (arg0 << 3));
            }
            class102 var20 = (class102) class64.field1009.method467(true, var18);
            class183 var21;
            class217 var22;
            if (var20 == null) {
                var21 = this.method828(false, (byte) -125, arg5, arg0);
                if (var21 == null) {
                    class26.field365.field1640 = null;
                    class26.field365.field1643 = null;
                    return class26.field365;
                }
                if (arg0 == 10 && arg5 > 3) {
                    var21.method80(256);
                }
                if (arg2) {
                    var22 = var21.method1394(arg1);
                } else {
                    var22 = null;
                }
                class102 var23 = new class102();
                var23.field1640 = var21;
                var23.field1643 = var22;
                class64.field1009.method465(var23, var18, (byte) 82);
            } else {
                var21 = (class183) var20.field1640;
                var22 = var20.field1643;
            }
            boolean var24 = this.field1550 & arg7;
            class183 var25 = var21.method1393(this.field1512 != 3, this.field1512 == 0, true, true, true, true, !var24, true, true, true, true);
            if (this.field1512 != 0) {
                var25.method1410(this.field1512, this.field1504, var21, arg4, arg3, arg10, arg9, arg6);
            }
            var25.method1413(this.field1571 == 0 && !this.field1576, true, true, true, this.field1571 == 0, true, false);
            class26.field365.field1640 = var25;
            var25.field3083 = var24;
            class26.field365.field1643 = var22;
            return class26.field365;
        }
        long var13;
        if (this.field1503 == null) {
            var13 = (long) ((this.field1522 << 10) + arg5);
        } else {
            var13 = (long) ((this.field1522 << 10) + (arg0 << 3) + arg5);
        }
        boolean var15;
        if (arg7 && this.field1550) {
            var13 |= Long.MIN_VALUE;
            var15 = true;
        } else {
            var15 = false;
        }
        class104 var16 = (class104) class64.field1009.method467(true, var13);
        if (var16 == null) {
            class307 var17 = this.method830(arg0, -91, arg5);
            if (var17 == null) {
                class26.field365.field1640 = null;
                return class26.field365;
            }
            var17.method2103();
            if (arg0 == 10 && arg5 > 3) {
                var17.method2110(256);
            }
            if (var15) {
                var17.field4888 = (short) (this.field1538 + 64);
                var17.field4897 = (short) (this.field1499 * 5 + 768);
                var17.method2124();
                var16 = var17;
            } else {
                var16 = new class103(var17, this.field1538 + 64, this.field1499 * 5 + 768, -50, -10, -50);
            }
            class64.field1009.method465(var16, var13, (byte) 49);
        }
        if (var15) {
            var16 = ((class307) var16).method2105();
        }
        if (this.field1512 != 0) {
            if ((var16 instanceof class103)) {
                var16 = ((class103) var16).method878(this.field1512, this.field1504, arg4, arg3, arg10, arg9, arg6, true);
            } else if (var16 instanceof class307) {
                var16 = ((class307) var16).method2122(this.field1512, this.field1504, arg4, arg3, arg10, arg9, arg6, true, false);
            }
        }
        class26.field365.field1640 = var16;
        return class26.field365;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V", line = 162)
    public static final void method824(int arg0) {
        class346.field5507.method466(-1);
        field1502++;
        if (arg0 != 75) {
            method832((byte) -7);
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)Z", line = 195)
    public final boolean method825(int arg0) {
        field1588++;
        if (this.field1563 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field1563.length; var3++) {
            var2 &= class34.field492.method429(0, this.field1563[var3] & 0xFFFF, 104);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lpi;I)V", line = 226)
    public final void method826(class336 arg0, int arg1) {
        if (arg1 != -1) {
            this.field1525 = (byte[]) null;
        }
        field1548++;
        while (true) {
            int var3 = arg0.method2364(-9069);
            if (var3 == 0) {
                return;
            }
            this.method840(var3, (byte) 16, arg0);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IILwi;III[[IIZI[[ILta;II)Lpc;", line = 247)
    public final class102 method827(int arg0, int arg1, class285 arg2, int arg3, int arg4, int arg5, int[][] arg6, int arg7, boolean arg8, int arg9, int[][] arg10, class217 arg11, int arg12, int arg13) {
        field1530++;
        if (arg0 != -601462749) {
            method837(false);
        }
        if (!class43.field680) {
            long var21;
            if (this.field1503 == null) {
                var21 = (long) ((this.field1522 << 10) + arg3);
            } else {
                var21 = (long) ((this.field1522 << 10) + (arg4 << 3) + arg3);
            }
            class103 var23 = (class103) class286.field4562.method467(true, var21);
            if (var23 == null) {
                class307 var24 = this.method830(arg4, -101, arg3);
                if (var24 == null) {
                    return null;
                }
                var23 = new class103(var24, this.field1538 + 64, this.field1499 * 5 + 768, -50, -10, -50);
                class286.field4562.method465(var23, var21, (byte) 36);
            }
            boolean var25 = false;
            if (arg2 != null) {
                var23 = (class103) arg2.method1949(var23, arg1, true, arg3, arg12, arg5);
                var25 = true;
            }
            if (arg4 == 10 && arg3 > 3) {
                if (!var25) {
                    var25 = true;
                    var23 = (class103) var23.method100(true, true, true);
                }
                var23.method80(256);
            }
            if (this.field1512 != 0) {
                if (!var25) {
                    boolean var26 = true;
                    var23 = (class103) var23.method100(true, true, true);
                }
                var23 = var23.method878(this.field1512, this.field1504, arg6, arg10, arg13, arg9, arg7, false);
            }
            class26.field365.field1640 = var23;
            return class26.field365;
        }
        long var15;
        if (this.field1503 == null) {
            var15 = (long) ((this.field1522 << 10) + arg3);
        } else {
            var15 = (long) ((this.field1522 << 10) + (arg4 << 3) + arg3);
        }
        class183 var17 = (class183) class286.field4562.method467(true, var15);
        if (var17 == null) {
            var17 = this.method828(true, (byte) -122, arg3, arg4);
            if (var17 == null) {
                return null;
            }
            var17.method1408();
            var17.method1413(false, false, false, true, false, false, true);
            class286.field4562.method465(var17, var15, (byte) 118);
        }
        class183 var18 = var17;
        boolean var19 = false;
        if (arg2 != null) {
            var19 = true;
            var18 = (class183) arg2.method1950((byte) -59, arg1, arg3, var17, arg12, arg5);
        }
        if (arg4 == 10 && arg3 > 3) {
            if (!var19) {
                var19 = true;
                var18 = (class183) var18.method100(true, true, true);
            }
            var18.method80(256);
        }
        if (arg8) {
            class26.field365.field1643 = var18.method1394(arg11);
        } else {
            class26.field365.field1643 = null;
        }
        if (this.field1512 != 0) {
            if (!var19) {
                boolean var20 = true;
                var18 = (class183) var18.method100(true, true, true);
            }
            var18.method1410(this.field1512, this.field1504, var18, arg6, arg10, arg13, arg9, arg7);
        }
        class26.field365.field1640 = var18;
        return class26.field365;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZBII)Lmn;", line = 395)
    private final class183 method828(boolean arg0, byte arg1, int arg2, int arg3) {
        field1516++;
        Object var5 = null;
        int var6 = -30 % ((arg1 + 65) / 34);
        int var7 = this.field1538 + 64;
        int var8 = this.field1499 * 5 + 768;
        class183 var12;
        if (this.field1503 == null) {
            if (arg3 != 10) {
                return null;
            }
            if (this.field1563 == null) {
                return null;
            }
            int var14 = this.field1563.length;
            if (var14 == 0) {
                return null;
            }
            long var15 = 0L;
            for (int var17 = 0; var17 < var14; var17++) {
                var15 = var15 * 67783L + ((long) this.field1563[var17]);
            }
            if (arg0) {
                var15 = ~var15;
            }
            var12 = (class183) class293.field4695.method467(true, var15);
            if (var12 == null) {
                class307 var18 = null;
                for (int var19 = 0; var19 < var14; var19++) {
                    var18 = class307.method2127(class34.field492, this.field1563[var19] & 0xFFFF, 0);
                    if (var18 == null) {
                        return null;
                    }
                    if (var14 > 1) {
                        class250.field4055[var19] = var18;
                    }
                }
                if (var14 > 1) {
                    var18 = new class307(class250.field4055, var14);
                }
                var12 = new class183(var18, var7, var8, arg0);
                class293.field4695.method465(var12, var15, (byte) 106);
            }
        } else {
            int var9 = -1;
            for (int var10 = 0; var10 < this.field1503.length; var10++) {
                if (this.field1503[var10] == arg3) {
                    var9 = var10;
                    break;
                }
            }
            if (var9 == -1) {
                return null;
            }
            int var11 = this.field1563[var9];
            if (arg0) {
                var11 += 65536;
            }
            var12 = (class183) class293.field4695.method467(true, (long) var11);
            if (var12 == null) {
                class307 var13 = class307.method2127(class34.field492, var11 & 0xFFFF, 0);
                if (var13 == null) {
                    return null;
                }
                var12 = new class183(var13, var7, var8, arg0);
                class293.field4695.method465(var12, (long) var11, (byte) 126);
            }
        }
        boolean var20 = this.field1556;
        if (arg3 == 2 && arg2 > 3) {
            var20 = !var20;
        }
        boolean var21 = arg2 == 0 && this.field1578 == 128 && this.field1554 == 128 && this.field1527 == 0 && this.field1574 == 0 && !var20;
        boolean var22 = this.field1520 == 128 && this.field1580 == 0;
        class183 var23 = var12.method1393(var21, var22, this.field1569 == null, true, var12.method1396() == var7, arg2 == 0 && !var20, true, var12.method1385() == var8, true, !var20, this.field1561 == null);
        if (var20) {
            var23.method1404();
        }
        if (arg3 == 4 && arg2 > 3) {
            var23.method1382(256);
            var23.method85(45, 0, -45);
        }
        int var24 = arg2 & 0x3;
        if (var24 == 1) {
            var23.method1384();
        } else if (var24 == 2) {
            var23.method1411();
        } else if (var24 == 3) {
            var23.method1398();
        }
        if (this.field1569 != null) {
            for (int var25 = 0; var25 < this.field1569.length; var25++) {
                var23.method1407(this.field1569[var25], this.field1531[var25]);
            }
        }
        if (this.field1561 != null) {
            for (int var26 = 0; var26 < this.field1561.length; var26++) {
                var23.method1397(this.field1561[var26], this.field1500[var26]);
            }
        }
        if (this.field1578 != 128 || this.field1520 != 128 || this.field1554 != 128) {
            var23.method89(this.field1578, this.field1520, this.field1554);
        }
        if (this.field1527 != 0 || this.field1580 != 0 || this.field1574 != 0) {
            var23.method85(this.field1527, this.field1580, this.field1574);
        }
        if (var7 != var23.method1396()) {
            var23.method1399(var7);
        }
        if (var23.method1385() != var8) {
            var23.method1390(var8);
        }
        return var23;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)I", line = 590)
    public final int method829(byte arg0) {
        if (arg0 < 122) {
            this.field1558 = (class79) null;
        }
        field1560++;
        if (this.field1581 == null) {
            return -1;
        }
        int var2 = (int) (Math.random() * (double) this.field1570);
        int var3;
        for (var3 = 0; this.field1539[var3] <= var2; var3++) {
            var2 -= this.field1539[var3];
        }
        return this.field1581[var3];
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)Lud;", line = 649)
    private final class307 method830(int arg0, int arg1, int arg2) {
        field1534++;
        class307 var4 = null;
        boolean var5 = this.field1556;
        if (arg0 == 2 && arg2 > 3) {
            var5 = !var5;
        }
        if (this.field1503 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field1563 == null) {
                return null;
            }
            int var6 = this.field1563.length;
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = this.field1563[var7];
                if (var5) {
                    var8 += 65536;
                }
                var4 = (class307) class293.field4695.method467(true, (long) var8);
                if (var4 == null) {
                    var4 = class307.method2127(class34.field492, var8 & 0xFFFF, 0);
                    if (var4 == null) {
                        return null;
                    }
                    if (var5) {
                        var4.method2129();
                    }
                    class293.field4695.method465(var4, (long) var8, (byte) 111);
                }
                if (var6 > 1) {
                    class250.field4055[var7] = var4;
                }
            }
            if (var6 > 1) {
                var4 = new class307(class250.field4055, var6);
            }
        } else {
            int var9 = -1;
            for (int var10 = 0; var10 < this.field1503.length; var10++) {
                if (this.field1503[var10] == arg0) {
                    var9 = var10;
                    break;
                }
            }
            if (var9 == -1) {
                return null;
            }
            int var11 = this.field1563[var9];
            if (var5) {
                var11 += 65536;
            }
            var4 = (class307) class293.field4695.method467(true, (long) var11);
            if (var4 == null) {
                var4 = class307.method2127(class34.field492, var11 & 0xFFFF, 0);
                if (var4 == null) {
                    return null;
                }
                if (var5) {
                    var4.method2129();
                }
                class293.field4695.method465(var4, (long) var11, (byte) 96);
            }
        }
        if (arg1 >= -66) {
            method842((class137) null, (byte) -110);
        }
        boolean var12;
        if (this.field1578 == 128 && this.field1520 == 128 && this.field1554 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field1527 == 0 && this.field1580 == 0 && this.field1574 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class307 var14 = new class307(var4, arg2 == 0 && !var12 && !var13, this.field1569 == null, this.field1561 == null, true);
        if (arg0 == 4 && arg2 > 3) {
            var14.method2110(256);
            var14.method2109(45, 0, -45);
        }
        int var15 = arg2 & 0x3;
        if (var15 == 1) {
            var14.method2130();
        } else if (var15 == 2) {
            var14.method2107();
        } else if (var15 == 3) {
            var14.method2112();
        }
        if (this.field1569 != null) {
            for (int var16 = 0; var16 < this.field1569.length; var16++) {
                if (this.field1525 == null || this.field1525.length <= var16) {
                    var14.method2108(this.field1569[var16], this.field1531[var16]);
                } else {
                    var14.method2108(this.field1569[var16], class221.field3693[this.field1525[var16] & 0xFF]);
                }
            }
        }
        if (this.field1561 != null) {
            for (int var17 = 0; var17 < this.field1561.length; var17++) {
                var14.method2125(this.field1561[var17], this.field1500[var17]);
            }
        }
        if (var12) {
            var14.method2117(this.field1578, this.field1520, this.field1554);
        }
        if (var13) {
            var14.method2109(this.field1527, this.field1580, this.field1574);
        }
        return var14;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIZ)I", line = 831)
    public final int method831(int arg0, int arg1, boolean arg2) {
        field1537++;
        if (this.field1558 == null) {
            return arg0;
        }
        class142 var4 = (class142) this.field1558.method732((long) arg1, true);
        if (arg2) {
            method838(-50, 124, -126, -53, 40, -89, 94, 50);
        }
        return var4 == null ? arg0 : var4.field2601;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V", line = 857)
    public static void method832(byte arg0) {
        field1542 = null;
        field1584 = null;
        field1572 = null;
        if (arg0 != -67) {
            field1543 = (class136) null;
        }
        field1543 = null;
        field1551 = null;
        field1529 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)Lie;", line = 877)
    public final class97 method833(boolean arg0) {
        int var2 = -1;
        if (arg0) {
            return (class97) null;
        }
        field1514++;
        if (this.field1553 != -1) {
            var2 = class332.method2307(-1, this.field1553);
        } else if (this.field1505 != -1) {
            var2 = class116.field2006[this.field1505];
        }
        if (var2 < 0 || var2 >= this.field1579.length - 1 || this.field1579[var2] == -1) {
            int var3 = this.field1579[this.field1579.length - 1];
            return var3 == -1 ? null : class92.method798((byte) 104, var3);
        } else {
            return class92.method798((byte) 104, this.field1579[var2]);
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)V", line = 916)
    public final void method834(byte arg0) {
        field1562++;
        if (this.field1571 == -1) {
            this.field1571 = 0;
            if (this.field1563 != null && (this.field1503 == null || this.field1503[0] == 10)) {
                this.field1571 = 1;
            }
            for (int var2 = 0; var2 < 5; var2++) {
                if (this.field1533[var2] != null) {
                    this.field1571 = 1;
                    break;
                }
            }
        }
        if (arg0 < 113) {
            method824(-81);
        }
        if (this.field1540 == -1) {
            this.field1540 = this.field1575 == 0 ? 0 : 1;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLjava/lang/String;I)Ljava/lang/String;", line = 954)
    public final String method835(byte arg0, String arg1, int arg2) {
        field1521++;
        if (this.field1558 == null) {
            return arg1;
        }
        if (arg0 < 119) {
            method842((class137) null, (byte) -54);
        }
        class190 var4 = (class190) this.field1558.method732((long) arg2, true);
        return var4 == null ? arg1 : var4.field3186;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)Z", line = 995)
    public final boolean method836(int arg0, int arg1) {
        field1555++;
        if (arg0 != -23248) {
            this.method839(93, (byte) 106);
        }
        if (this.field1503 != null) {
            for (int var5 = 0; var5 < this.field1503.length; var5++) {
                if (this.field1503[var5] == arg1) {
                    return class34.field492.method429(0, this.field1563[var5] & 0xFFFF, 104);
                }
            }
            return true;
        } else if (this.field1563 == null) {
            return true;
        } else if (arg1 == 10) {
            boolean var3 = true;
            for (int var4 = 0; var4 < this.field1563.length; var4++) {
                var3 &= class34.field492.method429(0, this.field1563[var4] & 0xFFFF, arg0 ^ 0xFFFFA558);
            }
            return var3;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Z)I", line = 1047)
    public static final int method837(boolean arg0) {
        field1528++;
        try {
            if (class160.field2826 == 0) {
                if (class243.field3966 > (class306.method2102(-289) - 5000L)) {
                    return 0;
                }
                class356.field5613 = class85.field1369.method541(!arg0, class230.field3840, class133.field2270);
                class42.field632 = class306.method2102(-289);
                class160.field2826 = 1;
            }
            if (class42.field632 + 30000L < class306.method2102(-289)) {
                return class129.method1073((byte) -92, 1000);
            }
            if (class160.field2826 == 1) {
                if (class356.field5613.field709 == 2) {
                    return class129.method1073((byte) 125, 1001);
                }
                if (class356.field5613.field709 != 1) {
                    return -1;
                }
                class279.field4426 = new class17((Socket) class356.field5613.field712, class85.field1369);
                class341.field5443.field5353 = 0;
                int var1 = 0;
                class356.field5613 = null;
                if (class163.field2883) {
                    var1 = class330.field5251;
                }
                class341.field5443.method2370(23, (byte) -20);
                class341.field5443.method2320(-6128, var1);
                class279.field4426.method178(0, class341.field5443.field5353, class341.field5443.field5342, false);
                if (class135.field2362 != null) {
                    class135.field2362.method1281((byte) 111);
                }
                if (class320.field5064 != null) {
                    class320.field5064.method1281((byte) 103);
                }
                int var2 = class279.field4426.method180(0);
                if (class135.field2362 != null) {
                    class135.field2362.method1281((byte) 105);
                }
                if (class320.field5064 != null) {
                    class320.field5064.method1281((byte) 99);
                }
                if (var2 != 0) {
                    return class129.method1073((byte) 51, var2);
                }
                class160.field2826 = 2;
            }
            if (class160.field2826 == 2) {
                if (class279.field4426.method175(-21329) < 2) {
                    return -1;
                }
                class177.field3016 = class279.field4426.method180(0);
                class177.field3016 <<= 0x8;
                class177.field3016 += class279.field4426.method180(0);
                class84.field1349 = 0;
                class199.field3401 = new byte[class177.field3016];
                class160.field2826 = 3;
            }
            if (class160.field2826 != 3) {
                if (!arg0) {
                    field1572 = (boolean[]) null;
                }
                return -1;
            }
            int var3 = class279.field4426.method175(-21329);
            if (var3 < 1) {
                return -1;
            }
            if (var3 > class177.field3016 - class84.field1349) {
                var3 = class177.field3016 - class84.field1349;
            }
            class279.field4426.method179(class199.field3401, class84.field1349, var3, 9395);
            class84.field1349 += var3;
            if (class84.field1349 < class177.field3016) {
                return -1;
            } else if (class77.method706(11, class199.field3401)) {
                class212.field3573 = new class20[class316.field5009];
                int var4 = 0;
                for (int var5 = class75.field1228; var5 <= class295.field4719; var5++) {
                    class20 var6 = class18.method186(2, var5);
                    if (var6 != null) {
                        class212.field3573[var4++] = var6;
                    }
                }
                class279.field4426.method177(false);
                class279.field4426 = null;
                class199.field3401 = null;
                class160.field2826 = 0;
                class351.field5561 = 0;
                class243.field3966 = class306.method2102(-289);
                return 0;
            } else {
                return class129.method1073((byte) 121, 1002);
            }
        } catch (IOException var8) {
            return class129.method1073((byte) -51, 1003);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIII)V", line = 1187)
    public static final void method838(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1552++;
        int var8 = 0;
        int var9 = arg5;
        int var10 = 0;
        int var11 = arg6 - arg1;
        int var12 = arg5 - arg1;
        int var13 = arg5 * arg5;
        int var14 = arg6 * arg6;
        int var15 = var11 * var11;
        if (arg4 <= 125) {
            method832((byte) 103);
        }
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var16 << 1;
        int var19 = var13 << 1;
        int var20 = arg5 << 1;
        int var21 = var15 << 1;
        int var22 = (1 - var20) * var14 + var19;
        int var23 = var12 << 1;
        int var24 = var13 - ((var20 - 1) * var17);
        int var25 = (1 - var23) * var15 + var18;
        int var26 = var14 << 2;
        int var27 = var16 - (var23 - 1) * var21;
        int var28 = var15 << 2;
        int var29 = var16 << 2;
        int var30 = var19 * 3;
        int var31 = var13 << 2;
        int var32 = (var20 - 3) * var17;
        int var33 = var31;
        int var34 = (var23 - 3) * var21;
        int var35 = var18 * 3;
        int var36 = (var12 - 1) * var28;
        int var37 = (arg5 - 1) * var26;
        int var38 = var29;
        int[] var39 = class64.field1007[arg0];
        class317.method2184(arg2 - var11, (byte) 98, var39, arg7, arg2 - arg6);
        class317.method2184(arg2 + var11, (byte) -9, var39, arg3, arg2 - var11);
        class317.method2184(arg2 + arg6, (byte) 89, var39, arg7, arg2 + var11);
        while (var9 > 0) {
            boolean var40 = var9 <= var12;
            if (var22 < 0) {
                while (var22 < 0) {
                    var22 += var30;
                    var24 += var33;
                    var33 += var31;
                    var8++;
                    var30 += var31;
                }
            }
            var9--;
            int var41 = arg0 - var9;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var35;
                        var10++;
                        var27 += var38;
                        var38 += var29;
                        var35 += var29;
                    }
                }
                if (var27 < 0) {
                    var27 += var38;
                    var25 += var35;
                    var10++;
                    var35 += var29;
                    var38 += var29;
                }
                var25 += -var36;
                var27 += -var34;
                var36 -= var28;
                var34 -= var28;
            }
            if (var24 < 0) {
                var24 += var33;
                var33 += var31;
                var8++;
                var22 += var30;
                var30 += var31;
            }
            int var42 = arg0 + var9;
            var24 += -var32;
            var22 += -var37;
            var32 -= var26;
            int var43 = arg2 + var8;
            var37 -= var26;
            int var44 = arg2 - var8;
            if (var40) {
                int var45 = arg2 + var10;
                int var46 = arg2 - var10;
                class317.method2184(var46, (byte) 105, class64.field1007[var41], arg7, var44);
                class317.method2184(var45, (byte) -62, class64.field1007[var41], arg3, var46);
                class317.method2184(var43, (byte) -58, class64.field1007[var41], arg7, var45);
                class317.method2184(var46, (byte) -85, class64.field1007[var42], arg7, var44);
                class317.method2184(var45, (byte) 102, class64.field1007[var42], arg3, var46);
                class317.method2184(var43, (byte) -17, class64.field1007[var42], arg7, var45);
            } else {
                class317.method2184(var43, (byte) -6, class64.field1007[var41], arg7, var44);
                class317.method2184(var43, (byte) -82, class64.field1007[var42], arg7, var44);
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)Z", line = 1375)
    public final boolean method839(int arg0, byte arg1) {
        field1506++;
        if (arg0 == -1) {
            return false;
        } else if (this.field1510 == arg0) {
            return true;
        } else {
            if (this.field1581 != null) {
                for (int var3 = 0; var3 < this.field1581.length; var3++) {
                    if (this.field1581[var3] == arg0) {
                        return true;
                    }
                }
            }
            int var4 = -99 % ((arg1 + 68) / 34);
            return false;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IBLpi;)V", line = 1415)
    private final void method840(int arg0, byte arg1, class336 arg2) {
        if (arg1 != 16) {
            this.field1583 = true;
        }
        if (arg0 == 1) {
            int var26 = arg2.method2364(-9069);
            if (var26 > 0) {
                if (this.field1563 == null || class219.field3651) {
                    this.field1503 = new int[var26];
                    this.field1563 = new int[var26];
                    for (int var27 = 0; var27 < var26; var27++) {
                        this.field1563[var27] = arg2.method2339((byte) -46);
                        this.field1503[var27] = arg2.method2364(-9069);
                    }
                } else {
                    arg2.field5353 += var26 * 3;
                }
            }
        } else if (arg0 == 2) {
            this.field1566 = arg2.method2365(117);
        } else if (arg0 == 5) {
            int var24 = arg2.method2364(-9069);
            if (var24 > 0) {
                if (this.field1563 == null || class219.field3651) {
                    this.field1563 = new int[var24];
                    this.field1503 = null;
                    for (int var25 = 0; var25 < var24; var25++) {
                        this.field1563[var25] = arg2.method2339((byte) -46);
                    }
                } else {
                    arg2.field5353 += var24 * 2;
                }
            }
        } else if (arg0 == 14) {
            this.field1559 = arg2.method2364(-9069);
        } else if (arg0 == 15) {
            this.field1549 = arg2.method2364(-9069);
        } else if (arg0 == 17) {
            this.field1511 = false;
            this.field1575 = 0;
        } else if (arg0 == 18) {
            this.field1511 = false;
        } else if (arg0 == 19) {
            this.field1571 = arg2.method2364(-9069);
        } else if (arg0 == 21) {
            this.field1512 = 1;
        } else if (arg0 == 22) {
            this.field1550 = true;
        } else if (arg0 == 23) {
            this.field1515 = 1;
        } else if (arg0 == 24) {
            this.field1510 = arg2.method2339((byte) -46);
            if (this.field1510 == 65535) {
                this.field1510 = -1;
            }
        } else if (arg0 == 27) {
            this.field1575 = 1;
        } else if (arg0 == 28) {
            this.field1564 = arg2.method2364(-9069);
        } else if (arg0 == 29) {
            this.field1538 = arg2.method2323(-2);
        } else if (arg0 == 39) {
            this.field1499 = arg2.method2323(-32) * 5;
        } else if (arg0 >= 30 && arg0 < 35) {
            this.field1533[arg0 - 30] = arg2.method2365(class289.method1969(arg1, 102));
            if (this.field1533[arg0 - 30].equalsIgnoreCase(class41.field606)) {
                this.field1533[arg0 - 30] = null;
            }
        } else if (arg0 == 40) {
            int var22 = arg2.method2364(-9069);
            this.field1569 = new short[var22];
            this.field1531 = new short[var22];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field1569[var23] = (short) arg2.method2339((byte) -46);
                this.field1531[var23] = (short) arg2.method2339((byte) -46);
            }
        } else if (arg0 == 41) {
            int var4 = arg2.method2364(-9069);
            this.field1500 = new short[var4];
            this.field1561 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1561[var5] = (short) arg2.method2339((byte) -46);
                this.field1500[var5] = (short) arg2.method2339((byte) -46);
            }
        } else if (arg0 == 42) {
            int var6 = arg2.method2364(-9069);
            this.field1525 = new byte[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1525[var7] = arg2.method2323(arg1 - 15);
            }
        } else if (arg0 == 60) {
            this.field1568 = arg2.method2339((byte) -46);
        } else if (arg0 == 62) {
            this.field1556 = true;
        } else if (arg0 == 64) {
            this.field1544 = false;
        } else if (arg0 == 65) {
            this.field1578 = arg2.method2339((byte) -46);
        } else if (arg0 == 66) {
            this.field1520 = arg2.method2339((byte) -46);
        } else if (arg0 == 67) {
            this.field1554 = arg2.method2339((byte) -46);
        } else if (arg0 == 69) {
            arg2.method2364(arg1 ^ 0xFFFFDC83);
        } else if (arg0 == 70) {
            this.field1527 = arg2.method2326(arg1 ^ 0xFFFFFF8A);
        } else if (arg0 == 71) {
            this.field1580 = arg2.method2326(111);
        } else if (arg0 == 72) {
            this.field1574 = arg2.method2326(-116);
        } else if (arg0 == 73) {
            this.field1509 = true;
        } else if (arg0 == 74) {
            this.field1536 = true;
        } else if (arg0 == 75) {
            this.field1540 = arg2.method2364(-9069);
        } else if (arg0 == 77 || arg0 == 92) {
            this.field1553 = arg2.method2339((byte) -46);
            if (this.field1553 == 65535) {
                this.field1553 = -1;
            }
            this.field1505 = arg2.method2339((byte) -46);
            if (this.field1505 == 65535) {
                this.field1505 = -1;
            }
            int var19 = -1;
            if (arg0 == 92) {
                var19 = arg2.method2339((byte) -46);
                if (var19 == 65535) {
                    var19 = -1;
                }
            }
            int var20 = arg2.method2364(-9069);
            this.field1579 = new int[var20 + 2];
            for (int var21 = 0; var21 <= var20; var21++) {
                this.field1579[var21] = arg2.method2339((byte) -46);
                if (this.field1579[var21] == 65535) {
                    this.field1579[var21] = -1;
                }
            }
            this.field1579[var20 + 1] = var19;
        } else if (arg0 == 78) {
            this.field1557 = arg2.method2339((byte) -46);
            this.field1541 = arg2.method2364(-9069);
        } else if (arg0 == 79) {
            this.field1547 = arg2.method2339((byte) -46);
            this.field1577 = arg2.method2339((byte) -46);
            this.field1541 = arg2.method2364(-9069);
            int var8 = arg2.method2364(arg1 - 9085);
            this.field1507 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1507[var9] = arg2.method2339((byte) -46);
            }
        } else if (arg0 == 81) {
            this.field1512 = 2;
            this.field1504 = (short) (arg2.method2364(arg1 ^ 0xFFFFDC83) * 256);
        } else if (arg0 == 82) {
            this.field1585 = true;
        } else if (arg0 == 88) {
            this.field1586 = false;
        } else if (arg0 == 89) {
            this.field1524 = false;
        } else if (arg0 == 90) {
            this.field1583 = true;
        } else if (arg0 == 91) {
            this.field1587 = true;
        } else if (arg0 == 93) {
            this.field1512 = 3;
            this.field1504 = (short) arg2.method2339((byte) -46);
        } else if (arg0 == 94) {
            this.field1512 = 4;
        } else if (arg0 == 95) {
            this.field1512 = 5;
        } else if (arg0 == 96) {
            this.field1518 = true;
        } else if (arg0 == 97) {
            this.field1517 = true;
        } else if (arg0 == 98) {
            this.field1576 = true;
        } else if (arg0 == 99) {
            this.field1526 = arg2.method2364(-9069);
            this.field1501 = arg2.method2339((byte) -46);
        } else if (arg0 == 100) {
            this.field1523 = arg2.method2364(-9069);
            this.field1508 = arg2.method2339((byte) -46);
        } else if (arg0 == 101) {
            this.field1513 = arg2.method2364(arg1 ^ 0xFFFFDC83);
        } else if (arg0 == 102) {
            this.field1535 = arg2.method2339((byte) -46);
        } else if (arg0 == 103) {
            this.field1515 = 0;
        } else if (arg0 == 104) {
            this.field1567 = arg2.method2364(-9069);
        } else if (arg0 == 105) {
            this.field1546 = true;
        } else if (arg0 == 106) {
            int var10 = arg2.method2364(-9069);
            this.field1581 = new int[var10];
            this.field1539 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1581[var11] = arg2.method2339((byte) -46);
                int var12 = arg2.method2364(-9069);
                this.field1539[var11] = var12;
                this.field1570 += var12;
            }
        } else if (arg0 == 249) {
            int var13 = arg2.method2364(-9069);
            if (this.field1558 == null) {
                int var14 = class168.method1318(var13, false);
                this.field1558 = new class79(var14);
            }
            for (int var15 = 0; var15 < var13; var15++) {
                boolean var16 = arg2.method2364(-9069) == 1;
                int var17 = arg2.method2317(21803);
                class320 var18;
                if (var16) {
                    var18 = new class190(arg2.method2365(125));
                } else {
                    var18 = new class142(arg2.method2338((byte) 65));
                }
                this.field1558.method725((long) var17, var18, 1);
            }
        }
        field1573++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 1916)
    public static final int method841(String arg0, byte arg1) {
        if (arg1 != -20) {
            method837(true);
        }
        field1545++;
        return class198.method1494(arg1 ^ 0xFFFFFFBB, arg0, 10, true);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Llg;B)Llg;", line = 1961)
    public static final class137 method842(class137 arg0, byte arg1) {
        if (arg1 != -3) {
            return (class137) null;
        }
        field1582++;
        class137 var2 = client.method1895(arg0);
        if (var2 == null) {
            var2 = arg0.field2388;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)Z", line = 1985)
    public final boolean method843(int arg0) {
        field1519++;
        if (arg0 != -1) {
            return true;
        } else if (this.field1579 == null) {
            return this.field1557 != -1 || this.field1507 != null;
        } else {
            for (int var2 = 0; var2 < this.field1579.length; var2++) {
                if (this.field1579[var2] != -1) {
                    class97 var3 = class92.method798((byte) 104, this.field1579[var2]);
                    if (var3.field1557 != -1 || var3.field1507 != null) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
