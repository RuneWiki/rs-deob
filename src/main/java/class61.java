import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class61 extends class13 {

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
    public int field1352 = 0;

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "Lec;")
    public static class32 field1349 = class73.method594("Passwort: ", true);

    @OriginalMember(owner = "client!ie", name = "S", descriptor = "I")
    public static int field1357 = 0;

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "I")
    public static int field1353 = 0;

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "I")
    public static int field1356 = 0;

    @OriginalMember(owner = "client!ie", name = "U", descriptor = "I")
    public static int field1359 = -1;

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "Ljd;")
    public static class66 field1355 = new class66(8);

    @OriginalMember(owner = "client!ie", name = "W", descriptor = "Leb;")
    public static class31 field1361 = new class31();

    @OriginalMember(owner = "client!ie", name = "Y", descriptor = "Lec;")
    private static class32 field1363 = class73.method594("Select", true);

    @OriginalMember(owner = "client!ie", name = "Z", descriptor = "Lec;")
    private static class32 field1364 = class73.method594("RuneScape has been updated(Q", true);

    @OriginalMember(owner = "client!ie", name = "ab", descriptor = "Lec;")
    public static class32 field1365 = field1364;

    @OriginalMember(owner = "client!ie", name = "bb", descriptor = "Lec;")
    public static class32 field1366 = field1363;

    @OriginalMember(owner = "client!ie", name = "H", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!ie", name = "I", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!ie", name = "T", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!ie", name = "V", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!ie", name = "X", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLf;)Lec;")
    public static final class32 method460(byte arg0, class36 arg1) {
        int var2 = 45 / ((55 - arg0) / 47);
        field1347++;
        if (class98.method770(true, class147.method1102(-94, arg1)) == 0) {
            return null;
        } else if (arg1.field826 == null || arg1.field826.method275(-91).method240((byte) 76) == 0) {
            return class146.field3320 ? class131.field3013 : null;
        } else {
            return arg1.field826;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Ljd;B)V")
    public final void method461(class66 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method533(arg1 + 271);
            if (var3 == 0) {
                field1350++;
                if (arg1 != -16) {
                    field1360 = -53;
                    return;
                }
                return;
            }
            this.method464(arg0, -6, var3);
        }
    }

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "(I)V")
    public static void method462(int arg0) {
        field1349 = null;
        field1363 = null;
        field1364 = null;
        field1365 = null;
        field1355 = null;
        field1366 = null;
        if (arg0 == 128) {
            field1361 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
    public static final void method463(byte arg0) {
        field1354++;
        if (!class26.field476) {
            class109.field2577[0] = class92.field2116;
            class56.field1296[0] = class77.field1787;
            class119.field2851 = 1;
            class44.field1035[0] = 1007;
        }
        if (class13.field220 != -1) {
            class109.method871(arg0 - 230, class13.field220);
        }
        for (int var1 = 0; var1 < class133.field3083; var1++) {
            if (class145.field3299[var1]) {
                class81.field1864[var1] = true;
            }
            class57.field1319[var1] = class145.field3299[var1];
            class145.field3299[var1] = false;
        }
        if (arg0 != 108) {
            field1362 = 50;
        }
        class48.field1124 = null;
        class154.field3515 = -1;
        class30.field563 = class140.field3219;
        class32.field677 = -1;
        if (class13.field220 != -1) {
            class133.field3083 = 0;
            class84.method657(0, -101, 0, class13.field220, 0, -1, 765, 503, 0);
        }
        class141.method1058();
        class152.method1189(7965);
        if (class26.field476) {
            class142.method1074(arg0 ^ 0x75);
        } else if (class32.field677 != -1) {
            class124.method976(class154.field3515, class32.field677, -2);
        }
        if (class92.field2118 == 3) {
            for (int var2 = 0; var2 < class133.field3083; var2++) {
                if (class57.field1319[var2]) {
                    class141.method1059(class144.field3289[var2], class124.field2894[var2], class28.field512[var2], class20.field366[var2], 16711935, 128);
                } else if (class81.field1864[var2]) {
                    class141.method1059(class144.field3289[var2], class124.field2894[var2], class28.field512[var2], class20.field366[var2], 16711680, 128);
                }
            }
        }
        class45.method346(class20.field373.field2700, class20.field373.field2749, class54.field1283, 0, class43.field990);
        class54.field1283 = 0;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ljd;II)V")
    private final void method464(class66 arg0, int arg1, int arg2) {
        if (~arg2 == arg1) {
            this.field1352 = arg0.method532(0);
        }
        field1358++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IILka;BI)V")
    public static final void method465(int arg0, int arg1, class70 arg2, byte arg3, int arg4) {
        field1351++;
        if (class20.field373 == arg2 || class119.field2851 >= 400) {
            return;
        }
        int var5 = 59 % ((-arg3 - 11) / 45);
        class32 var6;
        if (arg2.field1653 == 0) {
            var6 = class52.method403(new class32[] { arg2.field1660, class27.method187(arg2.field1636, -3156, class20.field373.field1636), class41.field955, class62.field1438, class159.method1230(arg2.field1636, 0), class23.field403 }, (byte) -20);
        } else {
            var6 = class52.method403(new class32[] { arg2.field1660, class41.field955, class117.field2815, class159.method1230(arg2.field1653, 0), class23.field403 }, (byte) -20);
        }
        if (class125.field2915 == 1) {
            class31.field598++;
            class56.method443(arg0, class41.field966, 3231, arg1, 5, class52.method403(new class32[] { class50.field1149, class134.field3129, var6 }, (byte) -20), arg4);
        } else if (!class151.field3470) {
            for (int var7 = 7; var7 >= 0; var7--) {
                if (class38.field915[var7] != null) {
                    class110.field2585++;
                    short var8 = 0;
                    if (class38.field915[var7].method271((byte) 124, class72.field1705)) {
                        if (class20.field373.field1636 < arg2.field1636) {
                            var8 = 2000;
                        }
                        if (class20.field373.field1638 != 0 && arg2.field1638 != 0) {
                            if (class20.field373.field1638 == arg2.field1638) {
                                var8 = 2000;
                            } else {
                                var8 = 0;
                            }
                        }
                    } else if (class44.field1043[var7]) {
                        var8 = 2000;
                    }
                    boolean var9 = false;
                    int var10 = class98.field2268[var7] + var8;
                    class56.method443(arg0, class38.field915[var7], 3231, arg1, var10, class52.method403(new class32[] { class130.field2999, var6 }, (byte) -20), arg4);
                }
            }
        } else if ((class88.field2047 & 0x8) == 8) {
            class37.field877++;
            class56.method443(arg0, class147.field3355, 3231, arg1, 22, class52.method403(new class32[] { class14.field234, class134.field3129, var6 }, (byte) -20), arg4);
        }
        for (int var11 = 0; var11 < class119.field2851; var11++) {
            if (class44.field1035[var11] == 3) {
                class56.field1296[var11] = class52.method403(new class32[] { class130.field2999, var6 }, (byte) -20);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V")
    public static final void method466(byte arg0) {
        if (arg0 != -68) {
            method467(39);
        }
        class5.field105.method491(-106);
        field1348++;
    }

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "(I)V")
    public static final void method467(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field1346++;
        while (true) {
            class157 var1 = class2.field18;
            class142 var2;
            synchronized (class2.field18) {
                var2 = (class142) class159.field3651.method1217((byte) 121);
            }
            if (var2 == null) {
                return;
            }
            var2.field3256.method341(false, false, var2.field3251, (int) var2.field3326, var2.field3247);
        }
    }
}
