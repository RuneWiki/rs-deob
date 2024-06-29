import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class128 extends class12 {

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "Lpe;")
    public static class109 field2838 = class141.method1120("lila:", 0);

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "I")
    public static int field2845 = 2301979;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "Lpe;")
    private static class109 field2846 = class141.method1120(" from your friend list first", 0);

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
    public static int field2835 = 0;

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "Lpe;")
    public static class109 field2844 = field2846;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "B")
    public byte field2834;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "I")
    public int field2836;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!sc", name = "B", descriptor = "Lpe;")
    public class109 field2843;

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "[Le;")
    public static class29[] field2847;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "[[S")
    public static short[][] field2839;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Lja;")
    public static final class63 method1035(int arg0, int arg1) {
        field2837++;
        class63 var2 = (class63) class53.field1085.method93((byte) 103, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class72.field1455.method742(arg0, 74, arg1);
        class63 var4 = new class63();
        if (var3 != null) {
            var4.method497(new class13(var3), 0);
        }
        class53.field1085.method97((long) arg0, (byte) -128, var4);
        return var4;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZIIIIILna;)V")
    public static final void method1036(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class91 arg6) {
        if (arg4 != -1) {
            method1038(-89);
        }
        class144.field3170 = arg0;
        class55.field1118 = 1;
        class95.field2036 = arg2;
        class94.field2023 = arg6;
        field2840 = arg5;
        class48.field998 = arg3;
        field2841++;
        class157.field3622 = arg1;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lwa;B)Lpe;")
    public static final class109 method1037(class154 arg0, byte arg1) {
        field2848++;
        if (class101.method817(21599, class136.method1084(0, arg0)) == 0) {
            return null;
        } else if (arg0.field3403 == null || arg0.field3403.method870(-64).method898((byte) 121) == 0) {
            return class14.field380 ? class109.field2301 : null;
        } else {
            int var2 = 122 % ((arg1 + 48) / 50);
            return arg0.field3403;
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
    public static final void method1038(int arg0) {
        if (!class3.field64) {
            class149.field3285[0] = 1005;
            class63.field1302 = 1;
            class101.field2116[0] = class125.field2773;
            class101.field2135[0] = class131.field2866;
        }
        field2849++;
        if (class19.field472 != -1) {
            class49.method420(class19.field472, (byte) 84);
        }
        for (int var1 = 0; var1 < class19.field490; var1++) {
            if (class120.field2663[var1]) {
                class11.field249[var1] = true;
            }
            class83.field1770[var1] = class120.field2663[var1];
            class120.field2663[var1] = false;
        }
        class44.field926 = -1;
        class49.field1009 = -1;
        int var2 = 24 / ((-arg0 - 25) / 43);
        class122.field2689 = null;
        class25.field614 = class12.field264;
        if (class19.field472 != -1) {
            class19.field490 = 0;
            class41.method381(126, 765, 0, 0, 503, -1, class19.field472, 0, 0);
        }
        class140.method1107();
        class126.method1024(false);
        if (class3.field64) {
            class101.method815(-2);
        } else if (class49.field1009 != -1) {
            class127.method1033(class44.field926, 16777215, class49.field1009);
        }
        if (class23.field562 == 3) {
            for (int var3 = 0; var3 < class19.field490; var3++) {
                if (class83.field1770[var3]) {
                    class140.method1100(class50.field1045[var3], class114.field2520[var3], class61.field1207[var3], class137.field2981[var3], 16711935, 128);
                } else if (class11.field249[var3]) {
                    class140.method1100(class50.field1045[var3], class114.field2520[var3], class61.field1207[var3], class137.field2981[var3], 16711680, 128);
                }
            }
        }
        class127.method1026(class136.field2975.field3094, class75.field1513, class136.field2975.field3106, -106, class139.field3042);
        class139.field3042 = 0;
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)V")
    public static final void method1039(byte arg0) {
        field2842++;
        if (class44.field943[96]) {
            class35.field780 += (-class35.field780 - 24) / 2;
        } else if (class44.field943[97]) {
            class35.field780 += (24 - class35.field780) / 2;
        } else {
            class35.field780 /= 2;
        }
        if (class44.field943[98]) {
            class50.field1032 += (12 - class50.field1032) / 2;
        } else if (class44.field943[99]) {
            class50.field1032 += (-class50.field1032 - 12) / 2;
        } else {
            class50.field1032 /= 2;
        }
        class100.field2104 = class100.field2104 + class35.field780 / 2 & 0x7FF;
        class55.field1120 += class50.field1032 / 2;
        if (class55.field1120 < 128) {
            class55.field1120 = 128;
        }
        int var1 = class136.field2975.field3094 + class102.field2140;
        if (class55.field1120 > 383) {
            class55.field1120 = 383;
        }
        if (arg0 != -62) {
            method1039((byte) -62);
        }
        int var2 = class136.field2975.field3106 + class4.field109;
        int var3 = 0;
        if (class50.field1027 - var1 < -500 || class50.field1027 - var1 > 500 || class157.field3636 - var2 < -500 || class157.field3636 - var2 > 500) {
            class157.field3636 = var2;
            class50.field1027 = var1;
        }
        if (class50.field1027 != var1) {
            class50.field1027 += (var1 - class50.field1027) / 16;
        }
        int var4 = class50.field1027 >> 7;
        if (class157.field3636 != var2) {
            class157.field3636 += (var2 - class157.field3636) / 16;
        }
        int var5 = class157.field3636 >> 7;
        int var6 = class126.method1019(class157.field3636, class50.field1027, 1, class75.field1513);
        if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
            for (int var7 = var4 - 4; var7 <= var4 + 4; var7++) {
                for (int var8 = var5 - 4; var8 <= var5 + 4; var8++) {
                    int var9 = class75.field1513;
                    if (var9 < 3 && (class107.field2249[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var6 - class83.field1775[var9][var7][var8];
                    if (var10 > var3) {
                        var3 = var10;
                    }
                }
            }
        }
        int var11 = var3 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (class46.field971 < var11) {
            class46.field971 += (var11 - class46.field971) / 24;
        } else if (var11 < class46.field971) {
            class46.field971 += (var11 - class46.field971) / 80;
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V")
    public static void method1040(int arg0) {
        field2839 = null;
        field2847 = null;
        field2838 = null;
        field2846 = null;
        if (arg0 == -500) {
            field2844 = null;
        }
    }
}
