import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class87 implements Runnable {

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    private int field1581 = 0;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "Z")
    private boolean field1590 = false;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    private int field1591 = 0;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "Z")
    private boolean field1596 = false;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "Ljava/net/Socket;")
    private Socket field1582;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "Lpf;")
    private class147 field1588;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "Ljava/io/InputStream;")
    private InputStream field1583;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1605;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "Lmb;")
    public static class116 field1593 = new class116(0, 0);

    @OriginalMember(owner = "client!j", name = "r", descriptor = "I")
    public static int field1598 = 0;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "Ltg;")
    private static class184 field1602 = class135.method812("Loaded title screen", 3);

    @OriginalMember(owner = "client!j", name = "s", descriptor = "[I")
    public static int[] field1599 = new int[100];

    @OriginalMember(owner = "client!j", name = "A", descriptor = "Ltg;")
    public static class184 field1607 = field1602;

    @OriginalMember(owner = "client!j", name = "E", descriptor = "I")
    public static int field1610 = 0;

    @OriginalMember(owner = "client!j", name = "D", descriptor = "Ltg;")
    private static class184 field1609 = class135.method812("Loaded fonts", 3);

    @OriginalMember(owner = "client!j", name = "t", descriptor = "Ltg;")
    public static class184 field1600 = field1609;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "Ltg;")
    public static class184 field1606 = class135.method812("compass", 3);

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field1586;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!j", name = "u", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!j", name = "B", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "Lk;")
    private class96 field1592;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field1611;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "G", descriptor = "Ljava/lang/Class;")
    public static Class field1612;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "H", descriptor = "Ljava/lang/Class;")
    public static Class field1613;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "I", descriptor = "Ljava/lang/Class;")
    public static Class field1614;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "J", descriptor = "Ljava/lang/Class;")
    public static Class field1615;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "K", descriptor = "Ljava/lang/Class;")
    public static Class field1616;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "L", descriptor = "Ljava/lang/Class;")
    public static Class field1617;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "M", descriptor = "Ljava/lang/Class;")
    public static Class field1618;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field1619;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field1620;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field1621;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field1622;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field1623;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field1624;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field1625;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "U", descriptor = "Ljava/lang/Class;")
    public static Class field1626;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "V", descriptor = "Ljava/lang/Class;")
    public static Class field1627;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "W", descriptor = "Ljava/lang/Class;")
    public static Class field1628;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "X", descriptor = "Ljava/lang/Class;")
    public static Class field1629;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "Y", descriptor = "Ljava/lang/Class;")
    public static Class field1630;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "Z", descriptor = "Ljava/lang/Class;")
    public static Class field1631;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "ab", descriptor = "Ljava/lang/Class;")
    public static Class field1632;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "bb", descriptor = "Ljava/lang/Class;")
    public static Class field1633;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "cb", descriptor = "Ljava/lang/Class;")
    public static Class field1634;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "db", descriptor = "Ljava/lang/Class;")
    public static Class field1635;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "eb", descriptor = "Ljava/lang/Class;")
    public static Class field1636;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "fb", descriptor = "Ljava/lang/Class;")
    public static Class field1637;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "gb", descriptor = "Ljava/lang/Class;")
    public static Class field1638;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "hb", descriptor = "Ljava/lang/Class;")
    public static Class field1639;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "ib", descriptor = "Ljava/lang/Class;")
    public static Class field1640;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "jb", descriptor = "Ljava/lang/Class;")
    public static Class field1641;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "kb", descriptor = "Ljava/lang/Class;")
    public static Class field1642;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "lb", descriptor = "Ljava/lang/Class;")
    public static Class field1643;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "mb", descriptor = "Ljava/lang/Class;")
    public static Class field1644;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "nb", descriptor = "Ljava/lang/Class;")
    public static Class field1645;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "ob", descriptor = "Ljava/lang/Class;")
    public static Class field1646;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "pb", descriptor = "Ljava/lang/Class;")
    public static Class field1647;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "qb", descriptor = "Ljava/lang/Class;")
    public static Class field1648;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "rb", descriptor = "Ljava/lang/Class;")
    public static Class field1649;

    // $FF: synthetic field
    @OriginalMember(owner = "client!j", name = "sb", descriptor = "Ljava/lang/Class;")
    public static Class field1650;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "[B")
    private byte[] field1587;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II[BI)V")
    public final void method514(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg3 != -23422) {
            this.run();
        }
        field1594++;
        if (this.field1596) {
            return;
        }
        if (this.field1590) {
            this.field1590 = false;
            throw new IOException();
        }
        if (this.field1587 == null) {
            this.field1587 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg0; var6++) {
                this.field1587[this.field1581] = arg2[arg1 + var6];
                this.field1581 = (this.field1581 + 1) % 5000;
                if ((this.field1591 + 4900) % 5000 == this.field1581) {
                    throw new IOException();
                }
            }
            if (this.field1592 == null) {
                this.field1592 = this.field1588.method903(3, arg3 + 23527, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public final void method515(int arg0) {
        field1585++;
        int var2 = -109 % ((arg0 + 56) / 59);
        if (this.field1596) {
            return;
        }
        synchronized (this) {
            this.field1596 = true;
            this.notifyAll();
        }
        if (this.field1592 != null) {
            while (this.field1592.field1765 == 0) {
                class151.method926((byte) 101, 1L);
            }
            if (this.field1592.field1765 == 1) {
                try {
                    ((Thread) this.field1592.field1767).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field1592 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)Ljava/lang/Class;")
    public static final Class method516(int arg0, int arg1) {
        field1601++;
        if (arg0 == 0) {
            return field1611 == null ? (field1611 = method522("kc")) : field1611;
        } else if (arg0 == 1) {
            return field1612 == null ? (field1612 = method522("rb")) : field1612;
        } else if (arg0 == 2) {
            return field1613 == null ? (field1613 = method522("ua")) : field1613;
        } else if (arg0 == 3) {
            return field1614 == null ? (field1614 = method522("je")) : field1614;
        } else if (arg0 == 4) {
            return field1615 == null ? (field1615 = method522("ng")) : field1615;
        } else if (arg0 == 5) {
            return field1616 == null ? (field1616 = method522("oc")) : field1616;
        } else if (arg0 == 6) {
            return field1617 == null ? (field1617 = method522("md")) : field1617;
        } else if (arg0 == 7) {
            return field1618 == null ? (field1618 = method522("gb")) : field1618;
        } else if (arg0 == 8) {
            return field1619 == null ? (field1619 = method522("se")) : field1619;
        } else if (arg0 == 9) {
            return field1620 == null ? (field1620 = method522("ec")) : field1620;
        } else if (arg0 == 10) {
            return field1621 == null ? (field1621 = method522("fe")) : field1621;
        } else if (arg0 == 11) {
            return field1622 == null ? (field1622 = method522("sd")) : field1622;
        } else if (arg0 == 12) {
            return field1623 == null ? (field1623 = method522("ma")) : field1623;
        } else if (arg0 == 13) {
            return field1624 == null ? (field1624 = method522("ei")) : field1624;
        } else if (arg0 == 14) {
            return field1625 == null ? (field1625 = method522("qe")) : field1625;
        } else if (arg0 == 15) {
            return field1626 == null ? (field1626 = method522("sa")) : field1626;
        } else if (arg0 == 16) {
            return field1627 == null ? (field1627 = method522("hc")) : field1627;
        } else if (arg0 == 17) {
            return field1628 == null ? (field1628 = method522("rc")) : field1628;
        } else if (arg0 == 18) {
            return field1629 == null ? (field1629 = method522("l")) : field1629;
        } else if (arg0 == 19) {
            return field1630 == null ? (field1630 = method522("ld")) : field1630;
        } else if (arg0 == 20) {
            return field1631 == null ? (field1631 = method522("v")) : field1631;
        } else if (arg0 == 21) {
            return field1632 == null ? (field1632 = method522("mf")) : field1632;
        } else if (arg0 == 22) {
            return field1633 == null ? (field1633 = method522("me")) : field1633;
        } else if (arg0 == 23) {
            return field1634 == null ? (field1634 = method522("pe")) : field1634;
        } else if (arg0 == 24) {
            return field1635 == null ? (field1635 = method522("ne")) : field1635;
        } else if (arg0 == 25) {
            return field1636 == null ? (field1636 = method522("sg")) : field1636;
        } else if (arg0 == 26) {
            return field1637 == null ? (field1637 = method522("wh")) : field1637;
        } else if (arg0 == 27) {
            return field1638 == null ? (field1638 = method522("dd")) : field1638;
        } else if (arg0 == 28) {
            return field1639 == null ? (field1639 = method522("qd")) : field1639;
        } else if (arg0 == 29) {
            return field1640 == null ? (field1640 = method522("ce")) : field1640;
        } else if (arg0 == 30) {
            return field1641 == null ? (field1641 = method522("od")) : field1641;
        } else if (arg0 == 31) {
            return field1642 == null ? (field1642 = method522("ai")) : field1642;
        } else if (arg0 == 32) {
            return field1643 == null ? (field1643 = method522("dg")) : field1643;
        } else if (arg0 == 33) {
            return field1644 == null ? (field1644 = method522("pd")) : field1644;
        } else if (arg0 == 34) {
            return field1645 == null ? (field1645 = method522("db")) : field1645;
        } else if (arg0 == 35) {
            return field1646 == null ? (field1646 = method522("cf")) : field1646;
        } else if (arg0 == 36) {
            return field1647 == null ? (field1647 = method522("wb")) : field1647;
        } else if (arg0 == 37) {
            return field1648 == null ? (field1648 = method522("sf")) : field1648;
        } else if (arg0 == 38) {
            return field1649 == null ? (field1649 = method522("gg")) : field1649;
        } else if (arg0 == 39) {
            return field1650 == null ? (field1650 = method522("qc")) : field1650;
        } else {
            if (arg1 != 14204) {
                field1606 = null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!j", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field1586++;
        this.method515(-122);
    }

    @OriginalMember(owner = "client!j", name = "run", descriptor = "()V")
    public final void run() {
        field1589++;
        try {
            while (true) {
                int var2;
                int var3;
                synchronized (this) {
                    if (this.field1591 == this.field1581) {
                        if (this.field1596) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var10) {
                        }
                    }
                    var2 = this.field1591;
                    if (this.field1591 > this.field1581) {
                        var3 = 5000 - this.field1591;
                    } else {
                        var3 = this.field1581 - this.field1591;
                    }
                }
                if (var3 > 0) {
                    try {
                        this.field1605.write(this.field1587, var2, var3);
                    } catch (IOException var9) {
                        this.field1590 = true;
                    }
                    this.field1591 = (this.field1591 + var3) % 5000;
                    try {
                        if (this.field1591 == this.field1581) {
                            this.field1605.flush();
                        }
                    } catch (IOException var8) {
                        this.field1590 = true;
                    }
                }
            }
            try {
                if (this.field1583 != null) {
                    this.field1583.close();
                }
                if (this.field1605 != null) {
                    this.field1605.close();
                }
                if (this.field1582 != null) {
                    this.field1582.close();
                }
            } catch (IOException var7) {
            }
            this.field1587 = null;
        } catch (Exception var12) {
            class5.method38((byte) -73, null, var12);
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
    public static void method517(int arg0) {
        field1599 = null;
        if (arg0 != -2450) {
            return;
        }
        field1593 = null;
        field1609 = null;
        field1602 = null;
        field1607 = null;
        field1600 = null;
        field1606 = null;
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)I")
    public final int method518(int arg0) throws IOException {
        field1603++;
        if (this.field1596) {
            return 0;
        } else if (arg0 == 0) {
            return this.field1583.read();
        } else {
            return -54;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)I")
    public final int method519(byte arg0) throws IOException {
        field1595++;
        if (arg0 != -99) {
            method521(-28, null);
        }
        return this.field1596 ? 0 : this.field1583.available();
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III[B)V")
    public final void method520(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1584++;
        if (this.field1596) {
            return;
        }
        while (arg0 > 0) {
            int var5 = this.field1583.read(arg3, arg1, arg0);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg0 -= var5;
        }
        if (arg2 != -1) {
            this.field1591 = 58;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILvb;)V")
    public static final void method521(int arg0, class197 arg1) {
        class21.field398 = arg1;
        field1604++;
        if (arg0 != -7) {
            field1598 = -9;
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Ljava/net/Socket;Lpf;)V")
    public class87(Socket arg0, class147 arg1) throws IOException {
        this.field1582 = arg0;
        this.field1588 = arg1;
        this.field1582.setSoTimeout(30000);
        this.field1582.setTcpNoDelay(true);
        this.field1583 = this.field1582.getInputStream();
        this.field1605 = this.field1582.getOutputStream();
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method522(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
