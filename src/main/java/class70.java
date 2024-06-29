import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class70 {

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field1770 = 0;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "Lkd;")
    public static class73 field1777 = class126.method1070((byte) -66, ",Zffentlicher Chat");

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "Lta;")
    public static class131 field1768 = new class131(32);

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "J")
    public static long field1783 = 0L;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "Lkd;")
    public static class73 field1784 = class126.method1070((byte) -66, "leuchten3:");

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "[Lge;")
    public static class47[] field1780 = new class47[4];

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "[I")
    public static int[] field1779;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "[Z")
    public static boolean[] field1781;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "([BI)V")
    public abstract void method583(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)Z")
    public static final boolean method584(int arg0, int arg1, int arg2) {
        field1771++;
        if (arg0 != 9219) {
            field1777 = null;
        }
        return (arg2 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIB)I")
    public static final int method585(int arg0, int arg1, int arg2, byte arg3) {
        field1782++;
        int var4 = 65 / ((30 - arg3) / 39);
        int var5 = arg2 >> 7;
        int var6 = arg1 >> 7;
        if (var6 < 0 || var5 < 0 || var6 > 103 || var5 > 103) {
            return 0;
        }
        int var7 = arg1 & 0x7F;
        int var8 = arg2 & 0x7F;
        int var9 = arg0;
        if (arg0 < 3 && (class55.field1482[1][var6][var5] & 0x2) == 2) {
            var9 = arg0 + 1;
        }
        int var10 = (128 - var7) * class55.field1484[var9][var6][var5] + class55.field1484[var9][var6 + 1][var5] * var7 >> 7;
        int var11 = (128 - var7) * class55.field1484[var9][var6][var5 - -1] + class55.field1484[var9][var6 + 1][var5 + 1] * var7 >> 7;
        return (128 - var8) * var10 + var8 * var11 >> 7;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
    public static void method586(int arg0) {
        field1779 = null;
        field1781 = null;
        field1784 = null;
        field1777 = null;
        if (arg0 != 1) {
            method590((byte) 106);
        }
        field1768 = null;
        field1780 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V")
    public static final void method587(byte arg0) {
        class83 var1 = (class83) class92.field2371.method514((byte) -79);
        field1774++;
        int var2 = -31 % ((53 - arg0) / 53);
        while (var1 != null) {
            if (class11.field320 != var1.field2113 || class49.field1308 > var1.field2118) {
                var1.method1147((byte) -31);
            } else if (var1.field2085 <= class49.field1308) {
                if (var1.field2091 > 0) {
                    class9 var3 = class133.field3345[var1.field2091 - 1];
                    if (var3 != null && var3.field2277 >= 0 && var3.field2277 < 13312 && var3.field2264 >= 0 && var3.field2264 < 13312) {
                        var1.method702(class49.field1308, var3.field2264, var3.field2277, method585(var1.field2113, var3.field2277, var3.field2264, (byte) 74) - var1.field2116, 80);
                    }
                }
                if (var1.field2091 < 0) {
                    int var4 = -var1.field2091 - 1;
                    class118 var5;
                    if (class78.field1997 == var4) {
                        var5 = class73.field1901;
                    } else {
                        var5 = class42.field1141[var4];
                    }
                    if (var5 != null && var5.field2277 >= 0 && var5.field2277 < 13312 && var5.field2264 >= 0 && var5.field2264 < 13312) {
                        var1.method702(class49.field1308, var5.field2264, var5.field2277, method585(var1.field2113, var5.field2277, var5.field2264, (byte) -101) - var1.field2116, 68);
                    }
                }
                var1.method703(true, class125.field3166);
                class34.field923.method48(class11.field320, (int) var1.field2084, (int) var1.field2102, (int) var1.field2106, 60, var1, var1.field2101, -1, false);
            }
            var1 = (class83) class92.field2371.method517(-107);
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)[B")
    public abstract byte[] method588(int arg0);

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)V")
    public static final void method589(byte arg0) {
        field1778++;
        if (class140.field3479) {
            class92.method771((byte) 50);
            class140.field3479 = false;
            class132.method1105(69);
            class74.field1913 = true;
            class132.field3304 = true;
            class149.field3666 = true;
            class38.field1028 = true;
        }
        class32.method257(-84);
        if (class15.field459 && class50.field1333 == 1) {
            class38.field1028 = true;
        }
        if (class105.field2624 != -1) {
            boolean var1 = class109.method870(89, class105.field2624);
            if (var1) {
                class38.field1028 = true;
            }
        }
        if (class105.field2607 == 2) {
            class38.field1028 = true;
        }
        if (arg0 <= 82) {
            field1785 = 34;
        }
        if (class87.field2198 == 2) {
            class38.field1028 = true;
        }
        if (class38.field1028) {
            class38.field1028 = false;
            class74.method650(261);
        }
        if (class129.field3246 == -1) {
            class150.field3714.field86 = class100.field2521 - class62.field1622 - 77;
            if (class31.field869 > 17 && class31.field869 < 560 && class3.field161 > 332) {
                class125.method1058(0, 463, 77, class100.field2521, class3.field161 - 357, class31.field869 + -17, -1, class150.field3714, -1);
            }
            int var2 = class100.field2521 - class150.field3714.field86 - 77;
            if (var2 < 0) {
                var2 = 0;
            }
            if (class100.field2521 - 77 < var2) {
                var2 = class100.field2521 - 77;
            }
            if (class62.field1622 != var2) {
                class62.field1622 = var2;
                class132.field3304 = true;
            }
        }
        if (class129.field3246 == -1 && class2.field146 == 3) {
            class150.field3714.field86 = class18.field513;
            int var3 = class66.field1708 * 14 + 7;
            if (class31.field869 > 17 && class31.field869 < 560 && class3.field161 > 332) {
                class125.method1058(0, 463, 77, var3, class3.field161 - 357, class31.field869 + -17, -1, class150.field3714, -1);
            }
            int var4 = class150.field3714.field86;
            if (var4 < 0) {
                var4 = 0;
            }
            if (var3 - 77 < var4) {
                var4 = var3 - 77;
            }
            if (class18.field513 != var4) {
                class132.field3304 = true;
                class18.field513 = var4;
            }
        }
        if (class129.field3246 != -1) {
            boolean var5 = class109.method870(83, class129.field3246);
            if (var5) {
                class132.field3304 = true;
            }
        }
        if (class105.field2607 == 3) {
            class132.field3304 = true;
        }
        if (class87.field2198 == 3) {
            class132.field3304 = true;
        }
        if (class143.field3575 != null) {
            class132.field3304 = true;
        }
        if (class15.field459 && class50.field1333 == 2) {
            class132.field3304 = true;
        }
        if (class132.field3304) {
            class132.field3304 = false;
            class81.method691((byte) -46);
        }
        class143.method1159(4);
        if (class153.field3759 != -1) {
            class149.field3666 = true;
        }
        if (class149.field3666) {
            if (class153.field3759 != -1 && class153.field3759 == class141.field3523) {
                class153.field3759 = -1;
                class81.field2042++;
                class121.field3079.method1215(-104, 189);
                class121.field3079.method956((byte) 10, class141.field3523);
            }
            class98.field2456 = true;
            class149.field3666 = false;
            class60.method506(class24.field683, class105.field2624 == -1, class49.field1308 % 20 < 10 ? -1 : class153.field3759, (byte) 106, class141.field3523);
        }
        if (class74.field1913) {
            class98.field2456 = true;
            class74.field1913 = false;
            class51.method418(class13.field410, class109.field2688, (byte) -114, class133.field3342, class25.field711);
        }
        class45.method338(0, class73.field1901.field2264, class11.field320, class73.field1901.field2277, class125.field3166);
        class125.field3166 = 0;
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)V")
    public static final void method590(byte arg0) {
        if (arg0 >= -28) {
            field1770 = -51;
        }
        class9.field295.method534((byte) -105);
        field1772++;
        class11.field325.method534((byte) -119);
        class51.field1369.method534((byte) -123);
    }
}
