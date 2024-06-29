import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class78 extends class70 {

    @OriginalMember(owner = "client!lb", name = "E", descriptor = "[I")
    public int[] field1757 = new int[1];

    @OriginalMember(owner = "client!lb", name = "J", descriptor = "[I")
    public int[] field1762 = new int[] { -1 };

    @OriginalMember(owner = "client!lb", name = "F", descriptor = "Lqf;")
    private static class117 field1758 = class72.method514(101, "Offline");

    @OriginalMember(owner = "client!lb", name = "N", descriptor = "Lqf;")
    public static class117 field1766 = class72.method514(102, "me");

    @OriginalMember(owner = "client!lb", name = "R", descriptor = "Lqf;")
    public static class117 field1770 = class72.method514(118, "Freund hinzuf-Ugen");

    @OriginalMember(owner = "client!lb", name = "T", descriptor = "Lqf;")
    public static class117 field1772 = class72.method514(114, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!lb", name = "Y", descriptor = "[[B")
    public static byte[][] field1777 = new byte[250][];

    @OriginalMember(owner = "client!lb", name = "L", descriptor = "Lqf;")
    public static class117 field1764 = class72.method514(99, "Hier klicken)1 um fortzufahren)3)3)3");

    @OriginalMember(owner = "client!lb", name = "I", descriptor = "Lqf;")
    public static class117 field1761 = field1758;

    @OriginalMember(owner = "client!lb", name = "M", descriptor = "I")
    public static int field1765 = 0;

    @OriginalMember(owner = "client!lb", name = "bb", descriptor = "Lqf;")
    public static class117 field1780 = class72.method514(107, "oder ung-Ultiges Passwort)3");

    @OriginalMember(owner = "client!lb", name = "G", descriptor = "Lqf;")
    private static class117 field1759 = class72.method514(107, "Please remove ");

    @OriginalMember(owner = "client!lb", name = "S", descriptor = "Lqf;")
    public static class117 field1771 = class72.method514(115, "mapdots");

    @OriginalMember(owner = "client!lb", name = "K", descriptor = "Lqf;")
    public static class117 field1763 = field1759;

    @OriginalMember(owner = "client!lb", name = "W", descriptor = "Lqf;")
    public static class117 field1775 = field1759;

    @OriginalMember(owner = "client!lb", name = "X", descriptor = "Lwd;")
    public static class153 field1776 = new class153(4096);

    @OriginalMember(owner = "client!lb", name = "H", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!lb", name = "O", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!lb", name = "Q", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!lb", name = "U", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!lb", name = "Z", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!lb", name = "cb", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!lb", name = "V", descriptor = "Lha;")
    public static class50 field1774;

    @OriginalMember(owner = "client!lb", name = "ab", descriptor = "Ljb;")
    public static class64 field1779;

    @OriginalMember(owner = "client!lb", name = "P", descriptor = "Laf;")
    public static class7 field1768;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V")
    public static final void method607(byte arg0) {
        field1781++;
        if (class42.field823) {
            class120.method964(1);
            class42.field823 = false;
            class60.method422(14);
            class103.field2498 = true;
            class87.field1993 = true;
            class139.field3310 = true;
            class55.field1144 = true;
        }
        class110.method828(-32768);
        if (class81.field1864 && class24.field468 == 1) {
            class139.field3310 = true;
        }
        if (class140.field3343 != -1) {
            boolean var1 = class129.method1006(class140.field3343, 2047);
            if (var1) {
                class139.field3310 = true;
            }
        }
        if (arg0 > -118) {
            return;
        }
        if (class34.field713 == 2) {
            class139.field3310 = true;
        }
        if (class121.field2891 == 2) {
            class139.field3310 = true;
        }
        if (class139.field3310) {
            class139.field3310 = false;
            class18.method151(-17537);
        }
        if (class95.field2288 == -1) {
            class103.field2492.field2043 = class125.field2949 - class68.field1423 - 77;
            if (class143.field3504 > 17 && class143.field3504 < 560 && class18.field274 > 332) {
                class48.method343((byte) 125, 0, 463, class18.field274 - 357, class143.field3504 + -17, class103.field2492, 77, -1, class125.field2949);
            }
            int var2 = class125.field2949 - class103.field2492.field2043 - 77;
            if (var2 < 0) {
                var2 = 0;
            }
            if (var2 > class125.field2949 - 77) {
                var2 = class125.field2949 - 77;
            }
            if (class68.field1423 != var2) {
                class68.field1423 = var2;
                class87.field1993 = true;
            }
        }
        if (class95.field2288 == -1 && class124.field2924 == 3) {
            class103.field2492.field2043 = class68.field1418;
            int var3 = class21.field345 * 14 + 7;
            if (class143.field3504 > 17 && class143.field3504 < 560 && class18.field274 > 332) {
                class48.method343((byte) 124, 0, 463, class18.field274 - 357, class143.field3504 + -17, class103.field2492, 77, -1, var3);
            }
            int var4 = class103.field2492.field2043;
            if (var4 < 0) {
                var4 = 0;
            }
            if (var4 > var3 - 77) {
                var4 = var3 - 77;
            }
            if (class68.field1418 != var4) {
                class87.field1993 = true;
                class68.field1418 = var4;
            }
        }
        if (class95.field2288 != -1) {
            boolean var5 = class129.method1006(class95.field2288, 2047);
            if (var5) {
                class87.field1993 = true;
            }
        }
        if (class34.field713 == 3) {
            class87.field1993 = true;
        }
        if (class121.field2891 == 3) {
            class87.field1993 = true;
        }
        if (class149.field3694 != null) {
            class87.field1993 = true;
        }
        if (class81.field1864 && class24.field468 == 2) {
            class87.field1993 = true;
        }
        if (class87.field1993) {
            class87.field1993 = false;
            class60.method418(103);
        }
        class138.method1079((byte) -125);
        if (class41.field821 != -1) {
            class55.field1144 = true;
        }
        if (class55.field1144) {
            if (class41.field821 != -1 && class64.field1281 == class41.field821) {
                class69.field1452++;
                class41.field821 = -1;
                class99.field2373.method961(152, -1198);
                class99.field2373.method571(class64.field1281, -11124);
            }
            class55.field1144 = false;
            class125.field2963 = true;
            class5.method18((byte) -81, class43.field856 % 20 >= 10 ? class41.field821 : -1, class140.field3343 == -1, class64.field1281, class27.field529);
        }
        if (class103.field2498) {
            class103.field2498 = false;
            class125.field2963 = true;
            class79.method624(class75.field1646, class32.field695, (byte) -73, class25.field501, class70.field1475);
        }
        class3.method6(120, class141.field3395.field1960, class141.field3395.field1998, class83.field1911, class140.field3344);
        class83.field1911 = 0;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZ)V")
    public static final void method608(int arg0, boolean arg1) {
        field1760++;
        class147.method1174(13);
        int var2 = class116.method903(arg0, 1).field2238;
        if (var2 == 0) {
            return;
        }
        if (!arg1) {
            field1767 = 23;
        }
        int var3 = class23.field461[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class12.method93(0.9D);
                ((class71) class12.field179).method501(-13, 0.9D);
            }
            if (var3 == 2) {
                class12.method93(0.8D);
                ((class71) class12.field179).method501(57, 0.8D);
            }
            if (var3 == 3) {
                class12.method93(0.7D);
                ((class71) class12.field179).method501(119, 0.7D);
            }
            if (var3 == 4) {
                class12.method93(0.6D);
                ((class71) class12.field179).method501(-125, 0.6D);
            }
            class45.method311(77);
            class42.field823 = true;
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class43.field861 != var4) {
                if (class43.field861 == 0 && class65.field1359 != -1) {
                    class141.method1100(class50.field1040, -120, 0, false, var4, class65.field1359);
                    class40.field796 = false;
                } else if (var4 == 0) {
                    class147.method1179(3);
                    class40.field796 = false;
                } else {
                    class22.method177(var4, (byte) 106);
                }
                class43.field861 = var4;
            }
        }
        if (var2 == 5) {
            class45.field889 = var3;
        }
        if (var2 == 9) {
            class130.field3080 = var3;
        }
        if (var2 == 6) {
            class71.field1531 = var3;
        }
        if (var2 == 8) {
            class87.field1993 = true;
            class45.field898 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class27.field527 = 127;
            }
            if (var3 == 1) {
                class27.field527 = 96;
            }
            if (var3 == 2) {
                class27.field527 = 64;
            }
            if (var3 == 3) {
                class27.field527 = 32;
            }
            if (var3 == 4) {
                class27.field527 = 0;
            }
        }
        if (var2 != 4) {
            return;
        }
        if (var3 == 0) {
            class71.field1526 = 127;
        }
        if (var3 == 1) {
            class71.field1526 = 96;
        }
        if (var3 == 2) {
            class71.field1526 = 64;
        }
        if (var3 == 3) {
            class71.field1526 = 32;
        }
        if (var3 == 4) {
            class71.field1526 = 0;
            return;
        }
    }

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "(I)V")
    public static void method609(int arg0) {
        if (arg0 != 18485) {
            method607((byte) -70);
        }
        field1777 = null;
        field1771 = null;
        field1772 = null;
        field1779 = null;
        field1780 = null;
        field1770 = null;
        field1758 = null;
        field1766 = null;
        field1775 = null;
        field1776 = null;
        field1774 = null;
        field1763 = null;
        field1759 = null;
        field1768 = null;
        field1761 = null;
        field1764 = null;
    }
}
