import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class115 {

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field1907 = 0;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field1900 = 50;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "[I")
    public static int[] field1908 = new int[field1900];

    @OriginalMember(owner = "client!s", name = "b", descriptor = "[I")
    public static int[] field1899 = new int[field1900];

    @OriginalMember(owner = "client!s", name = "f", descriptor = "[I")
    public static int[] field1903 = new int[field1900];

    @OriginalMember(owner = "client!s", name = "h", descriptor = "[I")
    public static int[] field1905 = new int[field1900];

    @OriginalMember(owner = "client!s", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field1910 = new String[field1900];

    @OriginalMember(owner = "client!s", name = "l", descriptor = "[I")
    public static int[] field1909 = new int[field1900];

    @OriginalMember(owner = "client!s", name = "g", descriptor = "[I")
    public static int[] field1904 = new int[field1900];

    @OriginalMember(owner = "client!s", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1912 = "yellow:";

    @OriginalMember(owner = "client!s", name = "n", descriptor = "[I")
    public static int[] field1911 = new int[field1900];

    @OriginalMember(owner = "client!s", name = "q", descriptor = "I")
    public static int field1914 = 0;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
    public static final void method860(byte arg0) {
        field1913++;
        int var1 = (class213.field3139.field3753 >> 7) + class149.field2390;
        class146.field2349 = 0;
        int var2 = (class213.field3139.field3660 >> 7) + class163.field2520;
        if (var2 >= 3053 && var2 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            class146.field2349 = 1;
        }
        if (arg0 >= -28) {
            field1911 = null;
        }
        if (var2 >= 3072 && var2 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            class146.field2349 = 1;
        }
        if (class146.field2349 == 1 && var2 >= 3139 && var2 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            class146.field2349 = 0;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static final void method861(int arg0) {
        if (class281.field4537 != null) {
            class281.field4537.method1440(-1);
            class281.field4537 = null;
        }
        field1901++;
        class309.method2096(arg0 ^ 0x7FA7);
        class66.method494();
        for (int var1 = 0; var1 < 4; var1++) {
            class235.field3431[var1].method1591(arg0 + 13610);
        }
        class166.method1189(79, false);
        System.gc();
        class172.method1217(11, 2);
        class101.field1710 = false;
        class48.field667 = -1;
        class11.method85(true, (byte) -18);
        class308.field4959 = false;
        class149.field2390 = 0;
        class180.field2713 = arg0;
        class304.field4925 = 0;
        class163.field2520 = 0;
        for (int var2 = 0; var2 < class142.field2301.length; var2++) {
            class142.field2301[var2] = null;
        }
        class12.field135 = 0;
        class103.field1791 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class92.field1475[var3] = null;
            class287.field4598[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class255.field3856[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class37.field475[var5][var6][var7] = null;
                }
            }
        }
        class63.method480(false);
        class182.field2727 = 0;
        class39.method244((byte) 111);
        class21.method153(true, true);
        try {
            class150.method1120(class273.field4426.field2020, false, "loggedout");
        } catch (Throwable var8) {
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
    public static void method862(int arg0) {
        field1908 = null;
        field1905 = null;
        field1899 = null;
        field1904 = null;
        field1911 = null;
        field1910 = null;
        field1903 = null;
        field1912 = null;
        if (arg0 < -56) {
            field1909 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(I)V")
    public static final void method863(int arg0) {
        field1898++;
        int var1 = 32 % ((arg0 - 20) / 32);
        class76.field1193++;
    }
}
