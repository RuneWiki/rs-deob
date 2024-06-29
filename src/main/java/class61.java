import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class61 extends class134 {

    @OriginalMember(owner = "client!ie", name = "S", descriptor = "I")
    public int field1536 = 0;

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "I")
    private int field1535 = 0;

    @OriginalMember(owner = "client!ie", name = "ab", descriptor = "I")
    public int field1544 = 0;

    @OriginalMember(owner = "client!ie", name = "fb", descriptor = "I")
    public int field1549 = 0;

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "I")
    private int field1534 = 0;

    @OriginalMember(owner = "client!ie", name = "db", descriptor = "I")
    public int field1547 = -1;

    @OriginalMember(owner = "client!ie", name = "Kb", descriptor = "I")
    public int field1580 = -1;

    @OriginalMember(owner = "client!ie", name = "Lb", descriptor = "I")
    public int field1581 = 2;

    @OriginalMember(owner = "client!ie", name = "yb", descriptor = "I")
    public int field1568 = -1;

    @OriginalMember(owner = "client!ie", name = "U", descriptor = "I")
    private int field1538 = 0;

    @OriginalMember(owner = "client!ie", name = "Gb", descriptor = "Z")
    public boolean field1576 = false;

    @OriginalMember(owner = "client!ie", name = "gb", descriptor = "Z")
    public boolean field1550 = false;

    @OriginalMember(owner = "client!ie", name = "vb", descriptor = "I")
    private int field1565 = -1;

    @OriginalMember(owner = "client!ie", name = "Nb", descriptor = "I")
    public int field1583 = -1;

    @OriginalMember(owner = "client!ie", name = "Fb", descriptor = "I")
    private int field1575 = 0;

    @OriginalMember(owner = "client!ie", name = "lb", descriptor = "Z")
    public boolean field1555 = false;

    @OriginalMember(owner = "client!ie", name = "Sb", descriptor = "Z")
    private boolean field1588 = false;

    @OriginalMember(owner = "client!ie", name = "Bb", descriptor = "I")
    public int field1571 = 1;

    @OriginalMember(owner = "client!ie", name = "Yb", descriptor = "I")
    private int field1594 = 0;

    @OriginalMember(owner = "client!ie", name = "zb", descriptor = "[Lwd;")
    public class150[] field1569 = new class150[5];

    @OriginalMember(owner = "client!ie", name = "ac", descriptor = "I")
    public int field1596 = -1;

    @OriginalMember(owner = "client!ie", name = "eb", descriptor = "I")
    private int field1548 = 128;

    @OriginalMember(owner = "client!ie", name = "Hb", descriptor = "Z")
    public boolean field1577 = false;

    @OriginalMember(owner = "client!ie", name = "Pb", descriptor = "I")
    public int field1585 = 0;

    @OriginalMember(owner = "client!ie", name = "Ub", descriptor = "I")
    private int field1590 = 128;

    @OriginalMember(owner = "client!ie", name = "tb", descriptor = "I")
    public int field1563 = 1;

    @OriginalMember(owner = "client!ie", name = "dc", descriptor = "I")
    private int field1599 = 128;

    @OriginalMember(owner = "client!ie", name = "xb", descriptor = "Z")
    public boolean field1567 = true;

    @OriginalMember(owner = "client!ie", name = "fc", descriptor = "Z")
    private boolean field1601 = false;

    @OriginalMember(owner = "client!ie", name = "Tb", descriptor = "I")
    public int field1589 = 16;

    @OriginalMember(owner = "client!ie", name = "Db", descriptor = "I")
    private int field1573 = -1;

    @OriginalMember(owner = "client!ie", name = "Ob", descriptor = "Z")
    public boolean field1584 = true;

    @OriginalMember(owner = "client!ie", name = "jc", descriptor = "Lwd;")
    public class150 field1605 = class14.field371;

    @OriginalMember(owner = "client!ie", name = "gc", descriptor = "I")
    public int field1602 = -1;

    @OriginalMember(owner = "client!ie", name = "bb", descriptor = "Lwd;")
    public static class150 field1545 = class2.method9(true, "Sprites geladen)3");

    @OriginalMember(owner = "client!ie", name = "X", descriptor = "Lwd;")
    public static class150 field1541 = class2.method9(true, " )2> @lre@");

    @OriginalMember(owner = "client!ie", name = "hb", descriptor = "Z")
    public static boolean field1551 = false;

    @OriginalMember(owner = "client!ie", name = "W", descriptor = "I")
    public static int field1540 = -1;

    @OriginalMember(owner = "client!ie", name = "ib", descriptor = "Lwd;")
    private static class150 field1552 = class2.method9(true, "Prepared visibility map");

    @OriginalMember(owner = "client!ie", name = "Eb", descriptor = "[I")
    public static int[] field1574 = new int[2048];

    @OriginalMember(owner = "client!ie", name = "Wb", descriptor = "Lwd;")
    private static class150 field1592 = class2.method9(true, "Create a free account");

    @OriginalMember(owner = "client!ie", name = "Rb", descriptor = "Lwd;")
    public static class150 field1587 = field1592;

    @OriginalMember(owner = "client!ie", name = "kb", descriptor = "Lwd;")
    public static class150 field1554 = class2.method9(true, "mapmarker");

    @OriginalMember(owner = "client!ie", name = "cc", descriptor = "Lwd;")
    public static class150 field1598 = class2.method9(true, "::noclip");

    @OriginalMember(owner = "client!ie", name = "Xb", descriptor = "Lwd;")
    public static class150 field1593 = field1552;

    @OriginalMember(owner = "client!ie", name = "Ab", descriptor = "Lwd;")
    public static class150 field1570 = class2.method9(true, "T");

    @OriginalMember(owner = "client!ie", name = "T", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!ie", name = "V", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!ie", name = "Y", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!ie", name = "Z", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!ie", name = "nb", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!ie", name = "ob", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!ie", name = "pb", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!ie", name = "rb", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!ie", name = "sb", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!ie", name = "wb", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!ie", name = "Cb", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!ie", name = "Ib", descriptor = "I")
    public int field1578;

    @OriginalMember(owner = "client!ie", name = "Jb", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!ie", name = "Qb", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!ie", name = "Vb", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!ie", name = "Zb", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!ie", name = "bc", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!ie", name = "hc", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!ie", name = "ub", descriptor = "Loc;")
    public static class100 field1564;

    @OriginalMember(owner = "client!ie", name = "jb", descriptor = "[I")
    private int[] field1553;

    @OriginalMember(owner = "client!ie", name = "qb", descriptor = "[I")
    public int[] field1560;

    @OriginalMember(owner = "client!ie", name = "Mb", descriptor = "[I")
    private int[] field1582;

    @OriginalMember(owner = "client!ie", name = "ec", descriptor = "[I")
    public int[] field1600;

    @OriginalMember(owner = "client!ie", name = "mb", descriptor = "[Lhb;")
    public static class51[] field1556;

    @OriginalMember(owner = "client!ie", name = "cb", descriptor = "[S")
    private short[] field1546;

    @OriginalMember(owner = "client!ie", name = "ic", descriptor = "[S")
    private short[] field1604;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Throwable;)V")
    public static final void method467(String arg0, byte arg1, Throwable arg2) {
        field1597++;
        try {
            if (arg1 > -53) {
                field1554 = null;
            }
            String var3 = "";
            if (arg2 != null) {
                var3 = class29.method242(27313, arg2);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class20.field507.field3255 != null) {
                class100 var8 = class20.field507.method1030(-11251, new URL(class20.field507.field3255.getCodeBase(), "clienterror.ws?c=" + class8.field192 + "&u=" + class31.field926 + "&v1=" + class139.field3249 + "&v2=" + class139.field3259 + "&e=" + var7));
                while (var8.field2281 == 0) {
                    class72.method548(-66, 1L);
                }
                if (var8.field2281 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field2282;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V")
    public static final void method468(int arg0) {
        field1572++;
        for (int var1 = arg0; var1 < class109.field2533; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = field1574[var1];
            }
            class111 var6 = class137.field3217[var5];
            if (var6 != null && var6.field2946 > 0) {
                var6.field2946--;
                if (var6.field2946 == 0) {
                    var6.field3015 = null;
                }
            }
        }
        for (int var2 = 0; var2 < class133.field3128; var2++) {
            int var3 = class101.field2309[var2];
            class18 var4 = class37.field1013[var3];
            if (var4 != null && var4.field2946 > 0) {
                var4.field2946--;
                if (var4.field2946 == 0) {
                    var4.field3015 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)Z")
    public final boolean method469(int arg0, byte arg1) {
        if (arg1 <= 61) {
            field1545 = null;
        }
        field1562++;
        if (this.field1553 != null) {
            for (int var3 = 0; var3 < this.field1553.length; var3++) {
                if (this.field1553[var3] == arg0) {
                    return class104.field2363.method316(0, 0, this.field1582[var3] & 0xFFFF);
                }
            }
            return true;
        } else if (this.field1582 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var4 = true;
            for (int var5 = 0; var5 < this.field1582.length; var5++) {
                var4 &= class104.field2363.method316(0, 0, this.field1582[var5] & 0xFFFF);
            }
            return var4;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)Lde;")
    private final class27 method470(int arg0, int arg1, int arg2) {
        field1561++;
        class27 var4 = null;
        if (this.field1553 == null) {
            if (arg2 != 10) {
                return null;
            }
            if (this.field1582 == null) {
                return null;
            }
            int var9 = this.field1582.length;
            boolean var10 = this.field1601 ^ arg0 > 3;
            for (int var11 = 0; var11 < var9; var11++) {
                int var17 = this.field1582[var11];
                if (var10) {
                    var17 += 65536;
                }
                var4 = (class27) class26.field798.method440((long) var17, 26976);
                if (var4 == null) {
                    var4 = class27.method215(class104.field2363, var17 & 0xFFFF, 0);
                    if (var4 == null) {
                        return null;
                    }
                    if (var10) {
                        var4.method229();
                    }
                    class26.field798.method433(var4, (long) var17, (byte) -122);
                }
                if (var9 > 1) {
                    class74.field1857[var11] = var4;
                }
            }
            if (var9 > 1) {
                var4 = new class27(class74.field1857, var9);
            }
        } else {
            int var5 = -1;
            for (int var6 = 0; var6 < this.field1553.length; var6++) {
                if (this.field1553[var6] == arg2) {
                    var5 = var6;
                    break;
                }
            }
            if (var5 == -1) {
                return null;
            }
            boolean var7 = this.field1601 ^ arg0 > 3;
            int var8 = this.field1582[var5];
            if (var7) {
                var8 += 65536;
            }
            var4 = (class27) class26.field798.method440((long) var8, arg1 ^ 0xFFFF969F);
            if (var4 == null) {
                var4 = class27.method215(class104.field2363, var8 & 0xFFFF, 0);
                if (var4 == null) {
                    return null;
                }
                if (var7) {
                    var4.method229();
                }
                class26.field798.method433(var4, (long) var8, (byte) -122);
            }
        }
        boolean var12;
        if (this.field1594 == 0 && this.field1535 == 0 && this.field1575 == 0) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field1599 == 128 && this.field1548 == 128 && this.field1590 == 128) {
            var13 = false;
        } else {
            var13 = true;
        }
        class27 var14 = new class27(var4, ~arg0 == arg1 && !var13 && !var12, this.field1546 == null, true);
        int var15 = arg0 & 0x3;
        if (var15 == 1) {
            var14.method224();
        } else if (var15 == 2) {
            var14.method225();
        } else if (var15 == 3) {
            var14.method227();
        }
        if (this.field1546 != null) {
            for (int var16 = 0; var16 < this.field1546.length; var16++) {
                var14.method234(this.field1546[var16], this.field1604[var16]);
            }
        }
        if (var13) {
            var14.method217(this.field1599, this.field1548, this.field1590);
        }
        if (var12) {
            var14.method220(this.field1594, this.field1535, this.field1575);
        }
        return var14;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lwb;I)V")
    public final void method471(class148 arg0, int arg1) {
        if (arg1 != -1) {
            this.field1600 = null;
        }
        field1557++;
        while (true) {
            int var3 = arg0.method1137(255);
            if (var3 == 0) {
                return;
            }
            this.method478(var3, -79, arg0);
        }
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(B)Z")
    public final boolean method472(byte arg0) {
        field1539++;
        if (arg0 != 86) {
            field1552 = null;
        }
        if (this.field1582 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field1582.length; var3++) {
            var2 &= class104.field2363.method316(arg0 - 86, 0, this.field1582[var3] & 0xFFFF);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIII)Lbe;")
    public final class13 method473(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1559++;
        long var8;
        if (this.field1553 == null) {
            var8 = (this.field1578 << 10) + arg0;
        } else {
            var8 = (this.field1578 << 10) + (arg4 << 3) + arg0;
        }
        if (arg1 != -10) {
            field1564 = null;
        }
        class13 var10 = (class13) class78.field1920.method440(var8, 26976);
        if (var10 == null) {
            class27 var11 = this.method470(arg0, -1, arg4);
            if (var11 == null) {
                return null;
            }
            var10 = var11.method223(this.field1538 + 64, this.field1534 * 5 + 768, -50, -10, -50);
            class78.field1920.method433(var10, var8, (byte) -122);
        }
        if (this.field1577) {
            var10 = var10.method105(arg2, arg5, arg6, arg3, true);
        }
        return var10;
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)V")
    public static void method474(int arg0) {
        field1587 = null;
        field1564 = null;
        field1592 = null;
        field1552 = null;
        field1545 = null;
        field1556 = null;
        field1593 = null;
        field1570 = null;
        field1554 = null;
        field1574 = null;
        field1541 = null;
        if (arg0 != -11098) {
            method467(null, (byte) 61, null);
        }
        field1598 = null;
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)V")
    public final void method475(int arg0) {
        if (this.field1602 == -1) {
            this.field1602 = 0;
            if (this.field1582 != null && (this.field1553 == null || this.field1553[0] == 10)) {
                this.field1602 = 1;
            }
            for (int var2 = 0; var2 < 5; var2++) {
                if (this.field1569[var2] != null) {
                    this.field1602 = 1;
                }
            }
        }
        if (this.field1547 == -1) {
            this.field1547 = this.field1581 == 0 ? 0 : 1;
        }
        if (arg0 == -28916) {
            field1558++;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIILh;II)Lbe;")
    public final class13 method476(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class49 arg6, int arg7, int arg8) {
        long var10;
        if (this.field1553 == null) {
            var10 = (this.field1578 << 10) + arg0;
        } else {
            var10 = (this.field1578 << 10) + (arg2 << 3) + arg0;
        }
        class13 var12 = (class13) class78.field1920.method440(var10, 26976);
        field1543++;
        if (var12 == null) {
            class27 var13 = this.method470(arg0, -1, arg2);
            if (var13 == null) {
                return null;
            }
            var12 = var13.method223(this.field1538 + 64, this.field1534 * 5 + 768, -50, -10, -50);
            class78.field1920.method433(var12, var10, (byte) -122);
        }
        if (arg6 == null && !this.field1577) {
            return var12;
        }
        class13 var14;
        if (arg6 == null) {
            var14 = var12.method94(true);
        } else {
            var14 = arg6.method361(var12, 104, arg0, arg5);
        }
        if (this.field1577) {
            var14.method105(arg1, arg7, arg3, arg8, false);
        }
        if (arg4 != -31086) {
            method482(-38, null, false);
        }
        return var14;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(IIIIIII)Le;")
    public final class29 method477(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1603++;
        if (arg5 >= -95) {
            return null;
        }
        long var8;
        if (this.field1553 == null) {
            var8 = (this.field1578 << 10) + arg4;
        } else {
            var8 = (this.field1578 << 10) + (arg1 << 3) + arg4;
        }
        class29 var10 = (class29) class66.field1664.method440(var8, 26976);
        if (var10 == null) {
            class27 var11 = this.method470(arg4, -1, arg1);
            if (var11 == null) {
                return null;
            }
            if (this.field1588) {
                var11.field808 = (short) (this.field1538 + 64);
                var10 = var11;
                var11.field807 = (short) (this.field1534 * 5 + 768);
                var11.method231();
            } else {
                var10 = var11.method223(this.field1538 + 64, this.field1534 * 5 + 768, -50, -10, -50);
            }
            class66.field1664.method433(var10, var8, (byte) -122);
        }
        if (this.field1588) {
            var10 = ((class27) var10).method216();
        }
        if (this.field1577) {
            if (var10 instanceof class13) {
                var10 = ((class13) var10).method105(arg2, arg6, arg3, arg0, true);
            } else if (var10 instanceof class27) {
                var10 = ((class27) var10).method232(arg2, arg6, arg3, arg0, true);
            }
        }
        return var10;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IILwb;)V")
    private final void method478(int arg0, int arg1, class148 arg2) {
        int var4 = -120 % (-arg1 / 49);
        if (arg0 == 1) {
            int var5 = arg2.method1137(255);
            if (var5 > 0) {
                if (this.field1582 == null || class68.field1723) {
                    this.field1582 = new int[var5];
                    this.field1553 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1582[var6] = arg2.method1140(-1);
                        this.field1553[var6] = arg2.method1137(255);
                    }
                } else {
                    arg2.field3601 += var5 * 3;
                }
            }
        } else if (arg0 == 2) {
            this.field1605 = arg2.method1154((byte) 90);
        } else if (arg0 == 5) {
            int var13 = arg2.method1137(255);
            if (var13 > 0) {
                if (this.field1582 == null || class68.field1723) {
                    this.field1553 = null;
                    this.field1582 = new int[var13];
                    for (int var14 = 0; var14 < var13; var14++) {
                        this.field1582[var14] = arg2.method1140(-1);
                    }
                } else {
                    arg2.field3601 += var13 * 2;
                }
            }
        } else if (arg0 == 14) {
            this.field1571 = arg2.method1137(255);
        } else if (arg0 == 15) {
            this.field1563 = arg2.method1137(255);
        } else if (arg0 == 17) {
            this.field1567 = false;
            this.field1581 = 0;
        } else if (arg0 == 18) {
            this.field1567 = false;
        } else if (arg0 == 19) {
            this.field1602 = arg2.method1137(255);
        } else if (arg0 == 21) {
            this.field1577 = true;
        } else if (arg0 == 22) {
            this.field1588 = true;
        } else if (arg0 == 23) {
            this.field1555 = true;
        } else if (arg0 == 24) {
            this.field1596 = arg2.method1140(-1);
            if (this.field1596 == 65535) {
                this.field1596 = -1;
            }
        } else if (arg0 == 27) {
            this.field1581 = 1;
        } else if (arg0 == 28) {
            this.field1589 = arg2.method1137(255);
        } else if (arg0 == 29) {
            this.field1538 = arg2.method1124(8);
        } else if (arg0 == 39) {
            this.field1534 = arg2.method1124(8) * 5;
        } else if (arg0 >= 30 && arg0 < 35) {
            this.field1569[arg0 - 30] = arg2.method1154((byte) -105);
            if (this.field1569[arg0 - 30].method1181(true, class124.field2869)) {
                this.field1569[arg0 - 30] = null;
            }
        } else if (arg0 == 40) {
            int var7 = arg2.method1137(255);
            this.field1546 = new short[var7];
            this.field1604 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1546[var8] = (short) arg2.method1140(-1);
                this.field1604[var8] = (short) arg2.method1140(-1);
            }
        } else if (arg0 == 60) {
            this.field1568 = arg2.method1140(-1);
        } else if (arg0 == 62) {
            this.field1601 = true;
        } else if (arg0 == 64) {
            this.field1584 = false;
        } else if (arg0 == 65) {
            this.field1599 = arg2.method1140(-1);
        } else if (arg0 == 66) {
            this.field1548 = arg2.method1140(-1);
        } else if (arg0 == 67) {
            this.field1590 = arg2.method1140(-1);
        } else if (arg0 == 68) {
            this.field1583 = arg2.method1140(-1);
        } else if (arg0 == 69) {
            this.field1544 = arg2.method1137(255);
        } else if (arg0 == 70) {
            this.field1594 = arg2.method1141((byte) -6);
        } else if (arg0 == 71) {
            this.field1535 = arg2.method1141((byte) -6);
        } else if (arg0 == 72) {
            this.field1575 = arg2.method1141((byte) -6);
        } else if (arg0 == 73) {
            this.field1576 = true;
        } else if (arg0 == 74) {
            this.field1550 = true;
        } else if (arg0 == 75) {
            this.field1547 = arg2.method1137(255);
        } else if (arg0 == 77) {
            this.field1573 = arg2.method1140(-1);
            if (this.field1573 == 65535) {
                this.field1573 = -1;
            }
            this.field1565 = arg2.method1140(-1);
            if (this.field1565 == 65535) {
                this.field1565 = -1;
            }
            int var11 = arg2.method1137(255);
            this.field1560 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field1560[var12] = arg2.method1140(-1);
                if (this.field1560[var12] == 65535) {
                    this.field1560[var12] = -1;
                }
            }
        } else if (arg0 == 78) {
            this.field1580 = arg2.method1140(-1);
            this.field1536 = arg2.method1137(255);
        } else if (arg0 == 79) {
            this.field1549 = arg2.method1140(-1);
            this.field1585 = arg2.method1140(-1);
            this.field1536 = arg2.method1137(255);
            int var9 = arg2.method1137(255);
            this.field1600 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1600[var10] = arg2.method1140(-1);
            }
        }
        field1579++;
    }

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "(B)Lie;")
    public final class61 method479(byte arg0) {
        field1595++;
        int var2 = -1;
        if (this.field1573 != -1) {
            var2 = class86.method618(10, this.field1573);
        } else if (this.field1565 != -1) {
            var2 = class16.field423[this.field1565];
        }
        int var3 = -52 % ((-arg0 - 10) / 36);
        return var2 < 0 || var2 >= this.field1560.length || this.field1560[var2] == -1 ? null : class20.method145(this.field1560[var2], (byte) -84);
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Z)V")
    public static final void method480(boolean arg0) {
        if (!arg0) {
            return;
        }
        field1586++;
        while (class121.field2783.method973(5618, class76.field1870) >= 11) {
            int var1 = class121.field2783.method967(11, false);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class137.field3217[var1] == null) {
                var2 = true;
                class137.field3217[var1] = new class111();
                if (class107.field2419[var1] != null) {
                    class137.field3217[var1].method787(-1, class107.field2419[var1]);
                }
            }
            field1574[class109.field2533++] = var1;
            class111 var3 = class137.field3217[var1];
            var3.field2965 = class11.field280;
            int var4 = class9.field221[class121.field2783.method967(3, false)];
            if (var2) {
                var3.field2971 = var4;
            }
            int var5 = class121.field2783.method967(5, !arg0);
            int var6 = class121.field2783.method967(1, false);
            if (var5 > 15) {
                var5 -= 32;
            }
            if (var6 == 1) {
                class17.field468[class111.field2577++] = var1;
            }
            int var7 = class121.field2783.method967(1, false);
            int var8 = class121.field2783.method967(5, !arg0);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method957(class46.field1244.field2963[0] + var8, 82, class46.field1244.field2934[0] + var5, var7 == 1);
        }
        class121.field2783.method972(-4);
    }

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "(I)Z")
    public final boolean method481(int arg0) {
        field1566++;
        if (this.field1560 == null) {
            return this.field1580 != -1 || this.field1600 != null;
        }
        for (int var2 = arg0; var2 < this.field1560.length; var2++) {
            if (this.field1560[var2] != -1) {
                class61 var3 = class20.method145(this.field1560[var2], (byte) -40);
                if (var3.field1580 != -1 || var3.field1600 != null) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILff;Z)Z")
    public static final boolean method482(int arg0, class42 arg1, boolean arg2) {
        field1542++;
        byte[] var3 = arg1.method304(arg0, arg2);
        if (var3 == null) {
            return false;
        } else {
            class42.method307(var3, (byte) -103);
            return true;
        }
    }
}
