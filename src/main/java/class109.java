import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class109 extends class264 {

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    private int field1595 = -1;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
    private int field1604 = -32768;

    @OriginalMember(owner = "client!ke", name = "K", descriptor = "I")
    private int field1617 = -1;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "Z")
    private boolean field1609 = false;

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "Lbk;")
    private class46 field1611 = null;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    private int field1603;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    private int field1600;

    @OriginalMember(owner = "client!ke", name = "O", descriptor = "I")
    private int field1621;

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "I")
    private int field1624;

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "I")
    private int field1608;

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "I")
    private int field1613;

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "Lwg;")
    private class220 field1622;

    @OriginalMember(owner = "client!ke", name = "T", descriptor = "I")
    private int field1626;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    private int field1596;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    private int field1598;

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "I")
    private int field1615;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
    public static int field1605 = 0;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "I")
    public static int field1606 = 0;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    public static int field1601 = -1;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "I")
    public static int field1612 = 0;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    public static int field1592 = 0;

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "Ljava/lang/String;")
    public static String field1616 = "Checking for updates - ";

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "[[B")
    public static byte[][] field1623 = new byte[50][];

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "I")
    public static int field1625 = 500;

    @OriginalMember(owner = "client!ke", name = "V", descriptor = "Z")
    public static boolean field1628 = true;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "Lhl;")
    public static class139 field1599 = new class139(20);

    @OriginalMember(owner = "client!ke", name = "W", descriptor = "I")
    public static int field1629 = -1;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!ke", name = "L", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!ke", name = "N", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!ke", name = "U", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "Lpk;")
    public static class237 field1610;

    @OriginalMember(owner = "client!ke", name = "M", descriptor = "Laa;")
    private class31 field1619;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIII)V")
    public final void method32(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1620++;
        this.method793(arg3, arg4, 70);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIIIIJILaa;)V")
    public final void method22(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class31 arg10) {
        field1594++;
        class264 var13 = this.method788((byte) -42);
        if (var13 != null) {
            var13.method22(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field1619);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public static void method787(byte arg0) {
        field1623 = null;
        field1616 = null;
        field1599 = null;
        if (arg0 >= 123) {
            field1610 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)Lbg;")
    public final class264 method788(byte arg0) {
        field1593++;
        return arg0 == -42 ? this.method791((byte) 44, false) : null;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)Z")
    public static final boolean method789(int arg0) {
        field1597++;
        if (class150.field2183) {
            try {
                class238.method1634("showVideoAd", (byte) -83, class217.field3338.field505);
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != -20332) {
            field1612 = -53;
        }
        return false;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V")
    public static final void method790(String arg0, String arg1, int arg2, int arg3) {
        class201.field3038 = arg2;
        class43.field770 = arg0;
        field1614++;
        class184.field2667 = arg1;
        if (class184.field2667.equals("") || class43.field770.equals("")) {
            class147.field2132 = 3;
        } else if (class258.field3964 == -1) {
            class261.field4009 = 0;
            class147.field2132 = -3;
            class138.field1997 = 0;
            class234.field3605 = 1;
            class54 var4 = new class54(128);
            var4.method437(true, 10);
            var4.method453((byte) 113, (int) (Math.random() * 9.9999999E7D));
            var4.method440(class37.method286(25077, class184.field2667), arg3 - 79);
            var4.method453((byte) 89, (int) (Math.random() * 9.9999999E7D));
            var4.method396(class43.field770, false);
            var4.method453((byte) 93, (int) (Math.random() * 9.9999999E7D));
            var4.method415(71, class16.field292, class191.field2894);
            class59.field964.field887 = arg3;
            class59.field964.method437(true, 24);
            class59.field964.method437(true, var4.field887 + 2);
            class59.field964.method428(540, (byte) 46);
            class59.field964.method433(0, var4.field887, -121, var4.field848);
        } else {
            class131.method902(arg3 - 1);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BZ)Lbg;")
    private final class264 method791(byte arg0, boolean arg1) {
        field1627++;
        boolean var3 = class287.field4389 != class166.field2451;
        class188 var4 = class3.method42(-110, this.field1613);
        int var5 = var4.field2801;
        if (var4.field2804 != null) {
            var4 = var4.method1253(false);
        }
        if (var4 == null) {
            return null;
        }
        if (class246.field3836 != 0 && this.field1609 && (this.field1622 == null || this.field1622 != null && this.field1622.field3432 != var4.field2801)) {
            int var6 = var4.field2801;
            if (var4.field2801 == -1) {
                var6 = var5;
            }
            if (var6 == -1) {
                this.field1622 = null;
            } else {
                this.field1622 = class108.method781(var6, -1);
            }
            if (this.field1622 != null) {
                if (var4.field2784 && this.field1622.field3434 != -1) {
                    this.field1626 = (int) ((double) this.field1622.field3413.length * Math.random());
                    this.field1598 -= (int) (Math.random() * (double) this.field1622.field3422[this.field1626]);
                } else {
                    this.field1598 = class120.field1794 - 1;
                    this.field1626 = 0;
                }
            }
        }
        int var7 = this.field1621 & 0x3;
        int var8;
        int var9;
        if (var7 == 1 || var7 == 3) {
            var9 = var4.field2805;
            var8 = var4.field2757;
        } else {
            var8 = var4.field2805;
            var9 = var4.field2757;
        }
        int var10 = this.field1624 + (var9 >> 1);
        int var11 = (var8 >> 1) + this.field1603;
        int var12 = (var9 + 1 >> 1) + this.field1624;
        int var13 = this.field1603 + (var8 + 1 >> 1);
        this.method793(var10 * 128, var11 * 128, 60);
        boolean var14 = !var3 && var4.field2741 && (this.field1617 != var4.field2742 || (this.field1626 != this.field1595 || this.field1622 != null && (this.field1622.field3415 || class253.field3900) && this.field1626 != this.field1596) && class233.field3602 >= 2);
        if (arg1 && !var14) {
            return null;
        }
        int[][] var15 = class166.field2451[this.field1600];
        int var16 = var15[var10][var11] + var15[var10][var13] + var15[var12][var11] + var15[var12][var13] >> 2;
        int var17 = (this.field1624 << 7) + (var9 << 6);
        int var18 = (this.field1603 << 7) + (var8 << 6);
        boolean var19 = this.field1611 == null;
        if (arg0 < 29) {
            return null;
        }
        int[][] var20 = null;
        if (var3) {
            var20 = class287.field4389[0];
        } else if (this.field1600 < 3) {
            var20 = class166.field2451[this.field1600 + 1];
        }
        class122 var21;
        if (this.field1622 == null) {
            var21 = var4.method1243(var16, this.field1608, var15, var14, var20, this.field1621, false, 768, var17, var18, var19 ? class179.field2615 : this.field1611);
        } else {
            var21 = var4.method1254(var17, this.field1622, this.field1596, this.field1608, var15, var14, var19 ? class179.field2615 : this.field1611, 112, var18, this.field1615, var16, this.field1621, this.field1626, var20);
        }
        return var21 == null ? null : var21.field1811;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "()V")
    public static final void method792() {
        if (class123.field1826 != null) {
            for (int var0 = 0; var0 < class123.field1826.length; var0++) {
                for (int var1 = 0; var1 < class117.field1761; var1++) {
                    for (int var2 = 0; var2 < class137.field1992; var2++) {
                        class123.field1826[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class277.field4277 != null) {
            for (int var3 = 0; var3 < class277.field4277.length; var3++) {
                for (int var4 = 0; var4 < class117.field1761; var4++) {
                    for (int var5 = 0; var5 < class137.field1992; var5++) {
                        class277.field4277[var3][var4][var5] = null;
                    }
                }
            }
        }
        class259.field3971 = 0;
        if (class130.field1920 != null) {
            for (int var6 = 0; var6 < class259.field3971; var6++) {
                class130.field1920[var6] = null;
            }
        }
        if (class236.field3633 != null) {
            for (int var7 = 0; var7 < class239.field3689; var7++) {
                class236.field3633[var7] = null;
            }
            class239.field3689 = 0;
        }
        if (class45.field779 != null) {
            for (int var8 = 0; var8 < class45.field779.length; var8++) {
                class45.field779[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "()I")
    public final int method19() {
        field1618++;
        return this.field1604;
    }

    @OriginalMember(owner = "client!ke", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field1602++;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(III)V")
    private final void method793(int arg0, int arg1, int arg2) {
        field1607++;
        if (this.field1622 != null) {
            int var4 = class120.field1794 - this.field1598;
            if (var4 > 100 && this.field1622.field3434 > 0) {
                int var5 = this.field1622.field3413.length - this.field1622.field3434;
                while (this.field1626 < var5 && var4 > this.field1622.field3422[this.field1626]) {
                    var4 -= this.field1622.field3422[this.field1626];
                    this.field1626++;
                }
                if (var5 <= this.field1626) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field1622.field3413.length; var7++) {
                        var6 += this.field1622.field3422[var7];
                    }
                    var4 %= var6;
                }
                this.field1596 = this.field1626 + 1;
                if (this.field1596 >= this.field1622.field3413.length) {
                    this.field1596 -= this.field1622.field3434;
                    if (this.field1596 < 0 || this.field1596 >= this.field1622.field3413.length) {
                        this.field1596 = -1;
                    }
                }
            }
            while (var4 > this.field1622.field3422[this.field1626]) {
                class244.method1664(arg1, false, this.field1626, arg0, 8890, this.field1622);
                var4 -= this.field1622.field3422[this.field1626];
                this.field1626++;
                if (this.field1626 >= this.field1622.field3413.length) {
                    this.field1626 -= this.field1622.field3434;
                    if (this.field1626 < 0 || this.field1622.field3413.length <= this.field1626) {
                        this.field1622 = null;
                        break;
                    }
                }
                this.field1596 = this.field1626 + 1;
                if (this.field1596 >= this.field1622.field3413.length) {
                    this.field1596 -= this.field1622.field3434;
                    if (this.field1596 < 0 || this.field1622.field3413.length <= this.field1596) {
                        this.field1596 = -1;
                    }
                }
            }
            this.field1615 = var4;
            this.field1598 = class120.field1794 - var4;
        }
        if (arg2 < 49) {
            this.field1615 = -59;
        }
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(IIIIIIIZLbg;)V")
    public class109(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class264 arg8) {
        this.field1603 = arg5;
        this.field1600 = arg3;
        this.field1621 = arg2;
        this.field1624 = arg4;
        this.field1608 = arg1;
        this.field1613 = arg0;
        if (arg6 != -1) {
            this.field1622 = class108.method781(arg6, -1);
            this.field1626 = 0;
            if (this.field1622.field3413.length > 1) {
                this.field1596 = 1;
            } else {
                this.field1596 = 0;
            }
            this.field1598 = class120.field1794 - 1;
            this.field1615 = 1;
            if (this.field1622.field3406 == 0 && arg8 != null && arg8 instanceof class109) {
                class109 var10 = (class109) arg8;
                if (this.field1622 == var10.field1622) {
                    this.field1626 = var10.field1626;
                    this.field1598 = var10.field1598;
                    this.field1596 = var10.field1596;
                    this.field1615 = var10.field1615;
                    return;
                }
            }
            if (arg7 && this.field1622.field3434 != -1) {
                this.field1626 = (int) (Math.random() * (double) this.field1622.field3413.length);
                this.field1596 = this.field1626 + 1;
                if (this.field1622.field3413.length <= this.field1596) {
                    this.field1596 -= this.field1622.field3434;
                    if (this.field1596 < 0 || this.field1596 >= this.field1622.field3413.length) {
                        this.field1596 = -1;
                    }
                }
                this.field1615 = ((int) (Math.random() * (double) this.field1622.field3422[this.field1626])) + 1;
                this.field1598 = class120.field1794 - this.field1615;
            }
        }
        if (arg8 == null) {
            class188 var11 = class3.method42(-124, this.field1613);
            if (var11.field2804 != null) {
                this.field1609 = true;
                return;
            }
        }
    }
}
