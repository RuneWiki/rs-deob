import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class74 {

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "Lkd;")
    public static class73 field1905 = class126.method1070((byte) -66, "au");

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "Z")
    public static boolean field1913 = false;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "Lta;")
    public static class131 field1911 = new class131(4096);

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "Lkd;")
    public static class73 field1915 = class126.method1070((byte) -66, "Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3");

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "La;")
    public static class1 field1917 = null;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "Lkd;")
    public static class73 field1920 = class126.method1070((byte) -66, "Spieler");

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "Z")
    public static boolean field1916 = false;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "Lkd;")
    public static class73 field1922 = class126.method1070((byte) -66, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "[I")
    public static int[] field1921 = new int[500];

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field1918 = 0;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "Lkd;")
    public static class73 field1919 = class126.method1070((byte) -66, "::fpsoff");

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "Lkd;")
    private static class73 field1914 = class126.method1070((byte) -66, "Your profile will be transferred in:");

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "Lkd;")
    public static class73 field1923 = field1914;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public static void method645(byte arg0) {
        field1919 = null;
        field1917 = null;
        field1915 = null;
        field1911 = null;
        field1923 = null;
        field1905 = null;
        field1914 = null;
        field1921 = null;
        if (arg0 == -50) {
            field1922 = null;
            field1920 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIII)V")
    public static final void method646(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < 122) {
            method645((byte) -95);
        }
        for (int var5 = arg2; var5 <= arg2 + arg3; var5++) {
            for (int var6 = arg0; var6 <= arg0 + arg4; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class61.field1615[0][var6][var5] = 127;
                    if (arg0 == var6 && var6 > 0) {
                        class55.field1484[0][var6][var5] = class55.field1484[0][var6 - 1][var5];
                    }
                    if (arg0 + arg4 == var6 && var6 < 103) {
                        class55.field1484[0][var6][var5] = class55.field1484[0][var6 + 1][var5];
                    }
                    if (arg2 == var5 && var5 > 0) {
                        class55.field1484[0][var6][var5] = class55.field1484[0][var6][var5 - 1];
                    }
                    if (arg2 + arg3 == var5 && var5 < 103) {
                        class55.field1484[0][var6][var5] = class55.field1484[0][var6][var5 + 1];
                    }
                }
            }
        }
        field1907++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLkd;Lkd;I)V")
    public static final void method647(byte arg0, class73 arg1, class73 arg2, int arg3) {
        field1908++;
        if (class129.field3246 == -1) {
            class132.field3304 = true;
        }
        if (arg3 == 0 && class11.field364 != -1) {
            class105.field2615 = 0;
            class143.field3575 = arg2;
        }
        int var4 = 39 / ((arg0 - 73) / 51);
        for (int var5 = 99; var5 > 0; var5--) {
            class110.field2702[var5] = class110.field2702[var5 - 1];
            class18.field530[var5] = class18.field530[var5 - 1];
            class76.field1952[var5] = class76.field1952[var5 - 1];
        }
        class18.field530[0] = arg1;
        class76.field1952[0] = arg2;
        class110.field2702[0] = arg3;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V")
    public static final void method648(byte arg0) {
        if (arg0 != -20) {
            field1914 = null;
        }
        class129.field3265 = null;
        class39.field1065 = null;
        field1912++;
        class136.field3400 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII)V")
    public static final void method649(int arg0, int arg1, int arg2, int arg3) {
        field1910++;
        if (arg3 > -81 || (class37.field1024 == 0 || arg1 == 0 || class62.field1635 >= 50)) {
            return;
        }
        class20.field572[class62.field1635] = arg0;
        class150.field3708[class62.field1635] = arg1;
        class38.field1032[class62.field1635] = arg2;
        class2.field154[class62.field1635] = null;
        class42.field1123[class62.field1635] = 0;
        class62.field1635++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public static final void method650(int arg0) {
        field1909++;
        if (arg0 != 261) {
            method645((byte) 82);
        }
        class92.method771((byte) 50);
        client.field594 = true;
        class107.method868(true);
        if (class105.field2624 != -1) {
            boolean var1 = class103.method830(23578, 1, 0, 261, class105.field2624, 0, 190);
            if (!var1) {
                class38.field1028 = true;
            }
        } else if (class24.field683[class141.field3523] != -1) {
            boolean var2 = class103.method830(23578, 1, 0, 261, class24.field683[class141.field3523], 0, 190);
            if (!var2) {
                class38.field1028 = true;
            }
        }
        if (class15.field459 && class50.field1333 == 1) {
            if (class143.field3558 == 1) {
                class84.method712(false);
            } else {
                class146.method1169((byte) 110);
            }
        }
        class72.method601(205);
    }
}
