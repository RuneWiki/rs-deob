import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class89 {

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public int field1908;

    @OriginalMember(owner = "client!k", name = "y", descriptor = "I")
    public int field1922;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public int field1898;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    public int field1907;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "[J")
    public static long[] field1909 = new long[32];

    @OriginalMember(owner = "client!k", name = "h", descriptor = "Lcd;")
    private static class23 field1905 = class54.method414("Apr", -1);

    @OriginalMember(owner = "client!k", name = "s", descriptor = "Lcd;")
    private static class23 field1916 = class54.method414(" from your friend list first)3", -1);

    @OriginalMember(owner = "client!k", name = "i", descriptor = "Lcd;")
    private static class23 field1906 = class54.method414("Mar", -1);

    @OriginalMember(owner = "client!k", name = "b", descriptor = "Lcd;")
    private static class23 field1899 = class54.method414("Feb", -1);

    @OriginalMember(owner = "client!k", name = "g", descriptor = "Lcd;")
    private static class23 field1904 = class54.method414("Aug", -1);

    @OriginalMember(owner = "client!k", name = "r", descriptor = "Lcd;")
    public static class23 field1915 = class54.method414("Freie Welt", -1);

    @OriginalMember(owner = "client!k", name = "o", descriptor = "Lcd;")
    private static class23 field1912 = class54.method414("Sep", -1);

    @OriginalMember(owner = "client!k", name = "n", descriptor = "Lcd;")
    private static class23 field1911 = class54.method414("May", -1);

    @OriginalMember(owner = "client!k", name = "w", descriptor = "Lcd;")
    private static class23 field1920 = class54.method414("Nov", -1);

    @OriginalMember(owner = "client!k", name = "D", descriptor = "Lcd;")
    public static class23 field1927 = field1916;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "Lcd;")
    private static class23 field1914 = class54.method414("Jul", -1);

    @OriginalMember(owner = "client!k", name = "t", descriptor = "Lcd;")
    private static class23 field1917 = class54.method414("Dec", -1);

    @OriginalMember(owner = "client!k", name = "c", descriptor = "Lcd;")
    private static class23 field1900 = class54.method414("Jun", -1);

    @OriginalMember(owner = "client!k", name = "x", descriptor = "Lcd;")
    private static class23 field1921 = class54.method414("Jan", -1);

    @OriginalMember(owner = "client!k", name = "e", descriptor = "[S")
    public static short[] field1902 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field1901 = 0;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "Lcd;")
    private static class23 field1910 = class54.method414("Oct", -1);

    @OriginalMember(owner = "client!k", name = "f", descriptor = "[Lcd;")
    public static class23[] field1903 = new class23[] { field1921, field1899, field1906, field1905, field1911, field1900, field1914, field1904, field1912, field1910, field1920, field1917 };

    @OriginalMember(owner = "client!k", name = "B", descriptor = "I")
    public static int field1925 = 0;

    @OriginalMember(owner = "client!k", name = "A", descriptor = "Lcf;")
    public static class25 field1924 = new class25();

    @OriginalMember(owner = "client!k", name = "u", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!k", name = "z", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!k", name = "C", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "Lkh;")
    public static class97 field1913;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public static final void method585(int arg0) {
        short var1 = 256;
        if (class160.field3212 > 0) {
            for (int var4 = 0; var4 < 256; var4++) {
                if (class160.field3212 > 768) {
                    class163.field3263[var4] = class28.method215(class156.field3125[var4], class124.field2545[var4], 1024 - class160.field3212, 16711680);
                } else if (class160.field3212 <= 256) {
                    class163.field3263[var4] = class28.method215(class124.field2545[var4], class156.field3125[var4], 256 - class160.field3212, 16711680);
                } else {
                    class163.field3263[var4] = class156.field3125[var4];
                }
            }
        } else if (class146.field2984 <= 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                class163.field3263[var2] = class124.field2545[var2];
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                if (class146.field2984 > 768) {
                    class163.field3263[var3] = class28.method215(class34.field702[var3], class124.field2545[var3], 1024 - class146.field2984, arg0 + 16646400);
                } else if (class146.field2984 > 256) {
                    class163.field3263[var3] = class34.field702[var3];
                } else {
                    class163.field3263[var3] = class28.method215(class124.field2545[var3], class34.field702[var3], 256 - class146.field2984, 16711680);
                }
            }
        }
        int var5 = 0;
        field1923++;
        int var6 = class183.field3606.field788 * 9;
        int var7 = 0;
        int var8 = 1;
        if (arg0 != 65280) {
            return;
        }
        while (var8 < var1 - 1) {
            int var21 = (var1 - var8) * class62.field1433[var8] / var1 + 22;
            if (var21 < 0) {
                var21 = 0;
            }
            var5 += var21;
            for (int var22 = var21; var22 < 128; var22++) {
                int var24 = class12.field241[var5++];
                int var25 = class183.field3606.field782[var6++];
                if (var24 == 0) {
                    class54.field1274.field782[var7++] = var25;
                } else {
                    int var26 = 256 - var24;
                    int var28 = class163.field3263[var24];
                    class54.field1274.field782[var7++] = class27.method198(var26 * class27.method198(var25, 65280) + var24 * class27.method198(var28, 65280), 16711680) + class27.method198(-16711936, class27.method198(var25, 16711935) * var26 + var24 * class27.method198(var28, 16711935)) >> 8;
                }
            }
            for (int var23 = 0; var23 < var21; var23++) {
                class54.field1274.field782[var7++] = class183.field3606.field782[var6++];
            }
            var6 += class183.field3606.field788 - 128;
            var8++;
        }
        class54.field1274.method293(0, 9);
        int var9 = class183.field3606.field788 * 9 + 128;
        int var10 = 0;
        int var11 = 0;
        for (int var12 = 1; var12 < var1 - 1; var12++) {
            int var13 = (var1 - var12) * class62.field1433[var12] / var1 + 22;
            if (var13 < 0) {
                var13 = 0;
            }
            for (int var14 = 0; var14 < var13; var14++) {
                int var10001 = var11++;
                var9--;
                class138.field2848.field782[var10001] = class183.field3606.field782[var9];
            }
            for (int var15 = var13; var15 < 128; var15++) {
                int var16 = class12.field241[var10++];
                var9--;
                int var17 = class183.field3606.field782[var9];
                if (var16 == 0) {
                    class138.field2848.field782[var11++] = var17;
                } else {
                    int var19 = 256 - var16;
                    int var20 = class163.field3263[var16];
                    class138.field2848.field782[var11++] = class27.method198(-16711936, class27.method198(var20, 16711935) * var16 + class27.method198(var17, 16711935) * var19) + class27.method198(16711680, var19 * class27.method198(65280, var17) + var16 * class27.method198(var20, 65280)) >> 8;
                }
            }
            var9 += class183.field3606.field788 + 128;
            var10 += var13;
        }
        class138.field2848.method293(637, 9);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lia;I)V")
    public static final void method586(class73 arg0, int arg1) {
        if (arg1 == 16711680) {
            class4.field48 = arg0;
            field1918++;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILva;)Lcd;")
    public static final class23 method587(int arg0, class189 arg1) {
        field1926++;
        if (arg0 < 60) {
            method587(-53, null);
        }
        return class200.method1322(-24994, 32767, arg1);
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V")
    public class89() {
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lk;)V")
    public class89(class89 arg0) {
        this.field1908 = arg0.field1908;
        this.field1922 = arg0.field1922;
        this.field1898 = arg0.field1898;
        this.field1907 = arg0.field1907;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
    public static void method588(byte arg0) {
        field1924 = null;
        field1914 = null;
        field1903 = null;
        field1921 = null;
        field1906 = null;
        field1910 = null;
        field1899 = null;
        field1917 = null;
        field1920 = null;
        field1905 = null;
        field1913 = null;
        field1911 = null;
        field1927 = null;
        field1915 = null;
        field1902 = null;
        field1912 = null;
        field1900 = null;
        if (arg0 <= 8) {
            field1899 = null;
        }
        field1904 = null;
        field1916 = null;
        field1909 = null;
    }
}
