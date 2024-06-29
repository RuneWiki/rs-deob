import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class73 {

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "[I")
    public static int[] field1602 = new int[1000];

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field1604 = 256;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Lrc;")
    public static class105 field1603 = class43.method374("@or2@", 0);

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "[Lec;")
    public static class28[] field1607 = new class28[50];

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "Lrc;")
    public static class105 field1613 = class43.method374("gelb:", 0);

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "Lrc;")
    public static class105 field1616 = class43.method374("welle2:", 0);

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public static int field1615 = 0;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "Lrc;")
    public static class105 field1620 = class43.method374(" )2> @whi@", 0);

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "Lrc;")
    public static class105 field1618 = class43.method374("leuchten3:", 0);

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "Lqa;")
    public static class97 field1609;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "[I")
    public static int[] field1606;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "[Leb;")
    public static class27[] field1610;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "[Z")
    public static boolean[] field1611;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V", line = 4)
    public static void method614(int arg0) {
        field1607 = null;
        field1618 = null;
        field1611 = null;
        field1602 = null;
        field1620 = null;
        field1613 = null;
        field1616 = null;
        if (arg0 != 2482) {
            field1620 = null;
        }
        field1610 = null;
        field1606 = null;
        field1603 = null;
        field1609 = null;
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V", line = 42)
    public static final void method615(int arg0) {
        class39 var1 = class76.field1706;
        synchronized (class76.field1706) {
            class22.field536 = class36.field829;
            if (class10.field207 >= 0) {
                while (class65.field1468 != class10.field207) {
                    int var3 = class87.field1983[class65.field1468];
                    class65.field1468 = class65.field1468 + 1 & 0x7F;
                    if (var3 < 0) {
                        class55.field1111[~var3] = false;
                    } else {
                        class55.field1111[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class55.field1111[var2] = false;
                }
                class10.field207 = class65.field1468;
            }
            class36.field829 = class134.field3264;
        }
        field1612++;
        if (arg0 != 3) {
            method616(1, -38, 25, 96);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)I", line = 96)
    public static final int method616(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 17479) {
            method618(-62, null);
        }
        field1617++;
        int var4 = 256 - arg2;
        return ((arg1 & 0xFF00FF) * arg2 + (arg3 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg1 & 0xFF00) * arg2 + (arg3 & 0xFF00) * var4 & 0xFF0000) >> 8;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V", line = 128)
    public static final void method617(byte arg0) {
        field1614++;
        if (class39.field893 == 0) {
            return;
        }
        if (arg0 != 102) {
            method615(-16);
        }
        int var1 = 0;
        if (class24.field580 != 0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < 100; var2++) {
            if (class37.field856[var2] != null) {
                int var3 = class120.field2896[var2];
                class105 var4 = class92.field2116[var2];
                if (var4 != null && var4.method848(class80.field1796, 0)) {
                    var4 = var4.method862(5, (byte) 81);
                }
                if (var4 != null && var4.method848(class43.field998, arg0 ^ 0x66)) {
                    var4 = var4.method862(5, (byte) 53);
                }
                if ((var3 == 3 || var3 == 7) && (var3 == 7 || class134.field3270 == 0 || class134.field3270 == 1 && class74.method627(var4, -128))) {
                    int var5 = 329 - var1 * 13;
                    var1++;
                    if (class75.field1664 > 4 && var5 - 10 < class35.field816 + -4 && class35.field816 - 4 <= var5 - -3) {
                        int var6 = class6.field79.method662(class108.method878(new class105[] { class10.field203, class119.field2866, var4, class37.field856[var2] }, 2867)) + 25;
                        if (var6 > 450) {
                            var6 = 450;
                        }
                        if (var6 + 4 > class75.field1664) {
                            class102.field2298++;
                            class18.field385++;
                            if (class110.field2560 >= 1) {
                                class105.method832(2017, 0, 0, (byte) 120, class108.method878(new class105[] { class90.field2060, var4 }, 2867), class3.field31, 0);
                                class28.field633++;
                            }
                            class105.method832(2041, 0, 0, (byte) 122, class108.method878(new class105[] { class90.field2060, var4 }, 2867), class64.field1435, 0);
                            class105.method832(2050, 0, 0, (byte) 122, class108.method878(new class105[] { class90.field2060, var4 }, 2867), class39.field889, 0);
                        }
                    }
                    if (var1 >= 5) {
                        return;
                    }
                }
                if ((var3 == 5 || var3 == 6) && class134.field3270 < 2) {
                    var1++;
                    if (var1 >= 5) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILte;)Lte;", line = 256)
    public static final class119 method618(int arg0, class119 arg1) {
        if (arg0 != 10449) {
            return null;
        }
        field1605++;
        int var2;
        if (arg1.field2867 < 0) {
            var2 = arg1.field2797 >> 16;
        } else {
            var2 = arg1.field2867 >> 16;
        }
        if (!class29.method273(var2, 105)) {
            return null;
        } else if (arg1.field2840 >= 0) {
            return class14.field282[var2][arg1.field2840 & 0xFFFF];
        } else {
            class119 var3 = class14.field282[var2][arg1.field2840 >> 15 & 0xFFFF];
            return var3.field2831[arg1.field2840 & 0x7FFF];
        }
    }
}
