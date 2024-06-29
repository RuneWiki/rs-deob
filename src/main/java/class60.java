import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class60 extends class45 {

    @OriginalMember(owner = "client!id", name = "W", descriptor = "Lkd;")
    private static class73 field1569 = class126.method1070((byte) -66, "Error loading your profile)3");

    @OriginalMember(owner = "client!id", name = "mb", descriptor = "Lkd;")
    public static class73 field1585 = class126.method1070((byte) -66, "(Y");

    @OriginalMember(owner = "client!id", name = "T", descriptor = "Lkd;")
    private static class73 field1566 = class126.method1070((byte) -66, "green:");

    @OriginalMember(owner = "client!id", name = "lb", descriptor = "Lkd;")
    public static class73 field1584 = class126.method1070((byte) -66, "Fehler beim Laden Ihres Spielcharakters)3");

    @OriginalMember(owner = "client!id", name = "ab", descriptor = "Lkd;")
    public static class73 field1573 = class126.method1070((byte) -66, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!id", name = "hb", descriptor = "[[I")
    public static int[][] field1580 = new int[5][5000];

    @OriginalMember(owner = "client!id", name = "fb", descriptor = "Lkd;")
    public static class73 field1578 = class126.method1070((byte) -66, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!id", name = "qb", descriptor = "Lkd;")
    public static class73 field1589 = class126.method1070((byte) -66, "mapdots");

    @OriginalMember(owner = "client!id", name = "db", descriptor = "Lkd;")
    public static class73 field1576 = class126.method1070((byte) -66, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!id", name = "S", descriptor = "Lkd;")
    public static class73 field1565 = field1569;

    @OriginalMember(owner = "client!id", name = "bb", descriptor = "Lkd;")
    public static class73 field1574 = field1566;

    @OriginalMember(owner = "client!id", name = "U", descriptor = "Lkd;")
    public static class73 field1567 = field1566;

    @OriginalMember(owner = "client!id", name = "pb", descriptor = "Lkd;")
    public static class73 field1588 = class126.method1070((byte) -66, "Benutzen Sie die (WPasswort -=ndern(W Option");

    @OriginalMember(owner = "client!id", name = "V", descriptor = "I")
    public int field1568;

    @OriginalMember(owner = "client!id", name = "X", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!id", name = "Z", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!id", name = "cb", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!id", name = "eb", descriptor = "I")
    public int field1577;

    @OriginalMember(owner = "client!id", name = "gb", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!id", name = "ib", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!id", name = "jb", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!id", name = "nb", descriptor = "I")
    public int field1586;

    @OriginalMember(owner = "client!id", name = "rb", descriptor = "I")
    public int field1590;

    @OriginalMember(owner = "client!id", name = "kb", descriptor = "Ljc;")
    public static class65 field1583;

    @OriginalMember(owner = "client!id", name = "R", descriptor = "[I")
    public int[] field1564;

    @OriginalMember(owner = "client!id", name = "Y", descriptor = "[I")
    public int[] field1571;

    @OriginalMember(owner = "client!id", name = "ob", descriptor = "[Lkd;")
    public class73[] field1587;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(IB)I")
    public static final int method503(int arg0, byte arg1) {
        if (arg1 == 32) {
            field1579++;
            return arg0 >> 11 & 0x3F;
        } else {
            return 34;
        }
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V")
    public static void method504(int arg0) {
        field1566 = null;
        field1569 = null;
        field1574 = null;
        field1583 = null;
        field1580 = null;
        field1573 = null;
        field1585 = null;
        if (arg0 != 5000) {
            field1585 = null;
        }
        field1565 = null;
        field1584 = null;
        field1588 = null;
        field1578 = null;
        field1589 = null;
        field1576 = null;
        field1567 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZ)Lja;")
    public static final class63 method505(int arg0, boolean arg1) {
        field1572++;
        if (!arg1) {
            method507(-46);
        }
        class63 var2 = (class63) class110.field2693.method538(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class140.field3487.method898((byte) -67, arg0, 3);
        class63 var4 = new class63();
        if (var3 != null) {
            var4.method525(new class114(var3), 0);
        }
        class110.field2693.method542(var4, -901, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "([IZIBI)V")
    public static final void method506(int[] arg0, boolean arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != 106) {
            method503(-3, (byte) 7);
        }
        class92.field2377.method100(true);
        class84.field2138.method208(0, 0);
        field1570++;
        if (arg1) {
            if (arg0[arg4] != -1) {
                if (arg4 == 0) {
                    class22.field635.method208(22, 10);
                }
                if (arg4 == 1) {
                    class116.field2978.method208(54, 8);
                }
                if (arg4 == 2) {
                    class116.field2978.method208(82, 8);
                }
                if (arg4 == 3) {
                    class89.field2252.method208(110, 8);
                }
                if (arg4 == 4) {
                    class39.field1064.method208(153, 8);
                }
                if (arg4 == 5) {
                    class39.field1064.method208(181, 8);
                }
                if (arg4 == 6) {
                    class81.field2038.method208(209, 9);
                }
            }
            if (arg0[0] != -1 && arg2 != 0) {
                class11.field358[0].method208(29, 13);
            }
            if (arg0[1] != -1 && arg2 != 1) {
                class11.field358[1].method208(53, 11);
            }
            if (arg0[2] != -1 && arg2 != 2) {
                class11.field358[2].method208(82, 11);
            }
            if (arg0[3] != -1 && arg2 != 3) {
                class11.field358[3].method208(115, 12);
            }
            if (arg0[4] != -1 && arg2 != 4) {
                class11.field358[4].method208(153, 13);
            }
            if (arg0[5] != -1 && arg2 != 5) {
                class11.field358[5].method208(180, 11);
            }
            if (arg0[6] != -1 && arg2 != 6) {
                class11.field358[6].method208(208, 13);
            }
        }
        class151.field3747.method100(true);
        class151.field3749.method208(0, 0);
        if (arg1) {
            if (arg0[arg4] != -1) {
                if (arg4 == 7) {
                    class55.field1480.method208(42, 0);
                }
                if (arg4 == 8) {
                    class86.field2184.method208(74, 0);
                }
                if (arg4 == 9) {
                    class86.field2184.method208(102, 0);
                }
                if (arg4 == 10) {
                    class38.field1045.method208(130, 1);
                }
                if (arg4 == 11) {
                    class115.field2887.method208(173, 0);
                }
                if (arg4 == 12) {
                    class115.field2887.method208(201, 0);
                }
                if (arg4 == 13) {
                    class99.field2491.method208(229, 0);
                }
            }
            if (arg0[8] != -1 && arg2 != 8) {
                class11.field358[7].method208(74, 2);
            }
            if (arg0[9] != -1 && arg2 != 9) {
                class11.field358[8].method208(102, 3);
            }
            if (arg0[10] != -1 && arg2 != 10) {
                class11.field358[9].method208(137, 4);
            }
            if (arg0[11] != -1 && arg2 != 11) {
                class11.field358[10].method208(174, 2);
            }
            if (arg0[12] != -1 && arg2 != 12) {
                class11.field358[11].method208(201, 2);
            }
            if (arg0[13] != -1 && arg2 != 13) {
                class11.field358[12].method208(226, 2);
            }
        }
        try {
            Graphics var5 = class18.field519.getGraphics();
            class92.field2377.method98(516, 160, -16961, var5);
            class151.field3747.method98(496, 466, arg3 ^ 0xFFFFBDD5, var5);
        } catch (Exception var6) {
            class18.field519.repaint();
        }
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V")
    public static final void method507(int arg0) {
        if (arg0 >= -35) {
            field1588 = null;
        }
        field1575++;
        while (true) {
            class61 var1 = class1.field67;
            class3 var2;
            synchronized (class1.field67) {
                var2 = (class3) class104.field2587.method513(0);
            }
            if (var2 == null) {
                return;
            }
            var2.field167.method1120(var2.field166, (int) var2.field3522, 255, false, var2.field158);
        }
    }
}
