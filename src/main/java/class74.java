import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class74 {

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Lgd;")
    public static class40 field1715 = class14.method90(false, "und haben es deaktiviert)3 Benutzen Sie die");

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "Lgd;")
    private static class40 field1720 = class14.method90(false, "K");

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "Lgd;")
    public static class40 field1714 = field1720;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field1713 = 0;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field1722 = -1;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "Lgd;")
    public static class40 field1729 = class14.method90(false, "Name eingeben:");

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "Z")
    public static boolean field1728 = false;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "Lgd;")
    public static class40 field1723 = class14.method90(false, "(X");

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "Lgd;")
    public static class40 field1725 = class14.method90(false, "Regelversto-8 melden");

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "I")
    public static int field1733 = 0;

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "I")
    public static int field1727 = 0;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "Lgd;")
    public static class40 field1721 = field1720;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "Ljava/awt/Frame;")
    public static Frame field1717;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "[[[B")
    public static byte[][][] field1724;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V", line = 10)
    public static void method501(boolean arg0) {
        field1725 = null;
        field1721 = null;
        field1729 = null;
        field1724 = null;
        field1715 = null;
        field1717 = null;
        field1720 = null;
        field1723 = null;
        field1714 = null;
        if (arg0) {
            field1727 = -28;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V", line = 36)
    public static final void method502(int arg0) {
        Object var1 = class76.field1736;
        synchronized (class76.field1736) {
            if (class12.field299 == 0) {
                class30.field737.method725((byte) -67, 5, new class70());
            }
            class12.field299 = 600;
        }
        field1726++;
        int var2 = -28 / ((-arg0 - 31) / 44);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lrb;ILrb;)V", line = 52)
    public static final void method503(class103 arg0, int arg1, class103 arg2) {
        class8.field223 = arg2;
        if (arg1 == -5088) {
            field1719++;
            class99.field2364 = arg0;
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(Z)V", line = 111)
    public static final void method504(boolean arg0) {
        field1730++;
        int var1 = class101.field2407;
        int var2 = class65.field1575;
        int var3 = class16.field431;
        int var4 = 6116423;
        int var5 = class65.field1578;
        class27.method164(var1, var2, var3, var5, var4);
        class27.method164(var1 + 1, var2 + 1, var3 - 2, 16, 0);
        class27.method168(var1 + 1, var2 - -18, var3 - 2, var5 - 19, 0);
        class1.field17.method353(class120.field2840, var1 + 3, var2 + 14, var4);
        int var6 = class135.field3282;
        if (!arg0) {
            field1713 = 97;
        }
        int var7 = class40.field1001;
        if (class113.field2742 == 0) {
            var7 -= 4;
            var6 -= 4;
        }
        if (class113.field2742 == 1) {
            var6 -= 205;
            var7 -= 553;
        }
        if (class113.field2742 == 2) {
            var6 -= 357;
            var7 -= 17;
        }
        for (int var8 = 0; var8 < class48.field1231; var8++) {
            int var9 = var2 + (class48.field1231 - var8 + -1) * 15 + 31;
            int var10 = 16777215;
            if (var1 < var7 && var1 + var3 > var7 && var9 - 13 < var6 && var6 < var9 + 3) {
                var10 = 16776960;
            }
            class1.field17.method358(class131.field3178[var8], var1 + 3, var9, var10, true);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V", line = 207)
    public static final void method505(byte arg0) {
        field1716++;
        if (class43.field1090 != 0 || class89.field2009 != null) {
            return;
        }
        int var1 = class80.field1841;
        if (arg0 != 38) {
            return;
        }
        if (class110.field2682 == 1 && class132.field3191 >= 516 && class90.field2041 >= 160 && class132.field3191 <= 765 && class90.field2041 <= 205) {
            var1 = 0;
        }
        if (!class90.field2040) {
            if (var1 == 1 && class48.field1231 > 0) {
                int var12 = class45.field1122[class48.field1231 - 1];
                if (var12 == 19 || var12 == 30 || var12 == 24 || var12 == 33 || var12 == 17 || var12 == 54 || var12 == 20 || var12 == 26 || var12 == 8 || var12 == 5 || var12 == 25 || var12 == 1006) {
                    int var13 = class107.field2612[class48.field1231 - 1];
                    int var14 = class22.field503[class48.field1231 - 1];
                    class30 var15 = class14.method86(var14, false);
                    if (var15.field690 || var15.field716) {
                        class114.field2752 = class90.field2041;
                        class54.field1363 = false;
                        class65.field1583 = var13;
                        class60.field1504 = var14;
                        class92.field2114 = class132.field3191;
                        class96.field2243 = 0;
                        class43.field1090 = 2;
                        if (var14 >> 16 == class131.field3169) {
                            class43.field1090 = 1;
                        }
                        if (var14 >> 16 == class108.field2624) {
                            class43.field1090 = 3;
                        }
                        return;
                    }
                }
            }
            if (var1 == 1 && (class125.field2970 == 1 || class135.method1057(-1, class48.field1231 - 1)) && class48.field1231 > 2) {
                var1 = 2;
            }
            if (var1 == 1 && class48.field1231 > 0) {
                class10.method57(0, class48.field1231 - 1);
            }
            if (var1 != 2 || class48.field1231 <= 0) {
                return;
            }
            class126.method998(-206);
            return;
        }
        if (var1 != 1) {
            int var2 = class135.field3282;
            int var3 = class40.field1001;
            if (class113.field2742 == 0) {
                var3 -= 4;
                var2 -= 4;
            }
            if (class113.field2742 == 1) {
                var3 -= 553;
                var2 -= 205;
            }
            if (class113.field2742 == 2) {
                var3 -= 17;
                var2 -= 357;
            }
            if (class101.field2407 - 10 > var3 || class101.field2407 + class16.field431 + 10 < var3 || class65.field1575 - 10 > var2 || var2 > class65.field1578 + class65.field1575 + 10) {
                if (class113.field2742 == 2) {
                    class122.field2880 = true;
                }
                if (class113.field2742 == 1) {
                    class45.field1124 = true;
                }
                class90.field2040 = false;
            }
        }
        if (var1 != 1) {
            return;
        }
        int var4 = class101.field2407;
        int var5 = class65.field1575;
        int var6 = class16.field431;
        int var7 = class132.field3191;
        int var8 = class90.field2041;
        if (class113.field2742 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (class113.field2742 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        int var9 = -1;
        if (class113.field2742 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var10 = 0; var10 < class48.field1231; var10++) {
            int var11 = var5 + (-var10 + class48.field1231 + -1) * 15 + 31;
            if (var4 < var7 && var4 + var6 > var7 && var11 - 13 < var8 && var8 < var11 + 3) {
                var9 = var10;
            }
        }
        if (var9 != -1) {
            class10.method57(arg0 - 38, var9);
        }
        class90.field2040 = false;
        if (class113.field2742 == 1) {
            class45.field1124 = true;
        }
        if (class113.field2742 == 2) {
            class122.field2880 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IJ)V", line = 392)
    public static final void method506(int arg0, long arg1) {
        field1718++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class7.field181; var3++) {
            if (class104.field2539[var3] == arg1) {
                class7.field181--;
                class134.field3256++;
                class45.field1124 = true;
                for (int var4 = var3; var4 < class7.field181; var4++) {
                    class7.field178[var4] = class7.field178[var4 + 1];
                    class77.field1771[var4] = class77.field1771[var4 + 1];
                    class104.field2539[var4] = class104.field2539[var4 + 1];
                }
                class92.field2094.method290((byte) 0, 230);
                class92.field2094.method793(arg1, false);
                break;
            }
        }
        if (arg0 > -35) {
            field1714 = null;
        }
    }
}
