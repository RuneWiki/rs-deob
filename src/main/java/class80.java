import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class80 {

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "Lqf;")
    public static class117 field1825 = class72.method514(127, "backvmid1");

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "[I")
    public static int[] field1830 = new int[4000];

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "Lqf;")
    public static class117 field1824 = class72.method514(110, "<col=ff0000>");

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "[[S")
    public static short[][] field1822 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "Lqf;")
    public static class117 field1829 = class72.method514(99, "welle2:");

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "Lqf;")
    private static class117 field1832 = class72.method514(120, "Loading friend list");

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "Lqf;")
    public static class117 field1833 = class72.method514(115, "Freie Welt");

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "Lqf;")
    public static class117 field1834 = class72.method514(120, "blaugr-Un:");

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "Lqf;")
    public static class117 field1820 = field1832;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "Lha;")
    public static class50 field1827;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "Ljb;")
    public static class64 field1831;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "[I")
    public static int[] field1816;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lmd;I)V")
    public static final void method625(class87 arg0, int arg1) {
        field1819++;
        int var2 = arg0.field2013 - class43.field856;
        if (arg0.field2021 == 0) {
            arg0.field1969 = 1024;
        }
        int var3 = arg0.field2009 * 64 + arg0.field2000 * 128;
        arg0.field1964 = 0;
        arg0.field1960 += (var3 - arg0.field1960) / var2;
        if (arg1 >= -118) {
            method628((byte) 15);
        }
        int var4 = arg0.field2009 * 64 + arg0.field2003 * 128;
        if (arg0.field2021 == 1) {
            arg0.field1969 = 1536;
        }
        if (arg0.field2021 == 2) {
            arg0.field1969 = 0;
        }
        if (arg0.field2021 == 3) {
            arg0.field1969 = 512;
        }
        arg0.field1998 += (var4 - arg0.field1998) / var2;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)I")
    public static final int method626(int arg0, int arg1, int arg2, int arg3) {
        field1826++;
        int var4 = arg2 >> 7;
        int var5 = arg0 >> 7;
        if (var5 < 0 || var4 < 0 || var5 > 103 || var4 > 103) {
            return 0;
        }
        int var6 = 23 % ((arg3 + 90) / 34);
        int var7 = arg1;
        if (arg1 < 3 && (class73.field1606[1][var5][var4] & 0x2) == 2) {
            var7 = arg1 + 1;
        }
        int var8 = arg0 & 0x7F;
        int var9 = arg2 & 0x7F;
        int var10 = (128 - var8) * class64.field1306[var7][var5][var4] + class64.field1306[var7][var5 + 1][var4] * var8 >> 7;
        int var11 = (128 - var8) * class64.field1306[var7][var5][var4 + 1] + class64.field1306[var7][var5 + 1][var4 + 1] * var8 >> 7;
        return (128 - var9) * var10 + var9 * var11 >> 7;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IZ)I")
    public static final int method627(int arg0, boolean arg1) {
        int var7 = arg0 - 1;
        field1828++;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        if (arg1) {
            method626(-37, 104, -65, 30);
        }
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public static void method628(byte arg0) {
        field1832 = null;
        field1834 = null;
        field1825 = null;
        field1831 = null;
        field1833 = null;
        field1822 = null;
        field1824 = null;
        if (arg0 <= 55) {
            return;
        }
        field1829 = null;
        field1816 = null;
        field1830 = null;
        field1820 = null;
        field1827 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZLmf;)[I")
    public static final int[] method629(boolean arg0, class89 arg1) {
        int var2 = arg1.field2125 >> 16;
        field1823++;
        if (!class26.method201(var2, 314356016)) {
            return null;
        } else if (arg0) {
            int var3 = arg1.field2046;
            int var4 = arg1.field2133;
            int var5 = arg1.field2154;
            while (var5 != -1) {
                class89 var7 = class141.field3426[var2][var5 & 0xFFFF];
                var4 += var7.field2133 - var7.field2103;
                var5 = var7.field2154;
                var3 += var7.field2046 - var7.field2043;
            }
            return new int[] { var4, var3 };
        } else {
            return null;
        }
    }
}
