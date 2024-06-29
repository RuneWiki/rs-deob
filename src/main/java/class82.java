import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class82 {

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "Lr;")
    public static class118 field1969 = class153.method1136(113, "Sie haben gerade eine andere Welt verlassen)3");

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "Lr;")
    private static class118 field1974 = class153.method1136(122, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "Lr;")
    private static class118 field1975 = class153.method1136(83, "The server is being updated)3");

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "Lr;")
    public static class118 field1980 = class153.method1136(119, "rot:");

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "Lr;")
    public static class118 field1979 = field1974;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field1972 = 0;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "Lr;")
    public static class118 field1983 = field1975;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "Lge;")
    public static class47 field1982 = new class47(64);

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "[Lvd;")
    public static class150[] field1976;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "[[[B")
    public static byte[][][] field1977;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILt;IIZ)V")
    public static final void method676(int arg0, class132 arg1, int arg2, int arg3, boolean arg4) {
        field1973++;
        if (class89.field2150 == arg1 || class39.field950 >= 400) {
            return;
        }
        if (!arg4) {
            field1976 = null;
        }
        class118 var5;
        if (arg1.field3005 == 0) {
            var5 = class144.method1066(true, new class118[] { arg1.field2996, class62.method556(-99, class89.field2150.field2995, arg1.field2995), class39.field943, class142.field3211, class43.method359(arg1.field2995, (byte) -122), class9.field210 });
        } else {
            var5 = class144.method1066(true, new class118[] { arg1.field2996, class39.field943, class128.field2930, class43.method359(arg1.field3005, (byte) -122), class9.field210 });
        }
        if (class144.field3245 == 1) {
            class105.method830(class33.field834, arg3, -31278, class144.method1066(true, new class118[] { class95.field2241, class144.field3231, var5 }), arg0, arg2, 33);
            class29.field698++;
        } else if (!class35.field884) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class84.field2023[var6] != null) {
                    class127.field2909++;
                    short var7 = 0;
                    if (class84.field2023[var6].method911(class103.field2388, 14934)) {
                        if (arg1.field2995 > class89.field2150.field2995) {
                            var7 = 2000;
                        }
                        if (class89.field2150.field3000 != 0 && arg1.field3000 != 0) {
                            if (class89.field2150.field3000 == arg1.field3000) {
                                var7 = 2000;
                            } else {
                                var7 = 0;
                            }
                        }
                    } else if (class103.field2383[var6]) {
                        var7 = 2000;
                    }
                    boolean var8 = false;
                    int var9 = class124.field2833[var6] + var7;
                    class105.method830(class84.field2023[var6], arg3, -31278, class144.method1066(true, new class118[] { class64.field1474, var5 }), arg0, arg2, var9);
                }
            }
        } else if ((class80.field1934 & 0x8) == 8) {
            class81.field1960++;
            class105.method830(class103.field2378, arg3, -31278, class144.method1066(true, new class118[] { class56.field1334, class144.field3231, var5 }), arg0, arg2, 14);
        }
        for (int var10 = 0; var10 < class39.field950; var10++) {
            if (class42.field1015[var10] == 41) {
                class126.field2876[var10] = class144.method1066(true, new class118[] { class64.field1474, var5 });
                return;
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
    public static void method677(int arg0) {
        field1980 = null;
        field1977 = null;
        field1975 = null;
        field1979 = null;
        field1982 = null;
        field1983 = null;
        field1976 = null;
        field1974 = null;
        field1969 = null;
        if (arg0 != 0) {
            method678(true);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
    public static final void method678(boolean arg0) {
        field1971++;
        class13 var1 = (class13) class112.field2607.method889(125);
        if (arg0) {
            return;
        }
        while (var1 != null) {
            if (var1.field273 == -1) {
                var1.field284 = 0;
                class84.method685(var1, -126);
            } else {
                var1.method768(-1);
            }
            var1 = (class13) class112.field2607.method884(true);
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)V")
    public static final void method679(int arg0) {
        field1970++;
        if (arg0 != 13076) {
            field1969 = null;
        }
        for (class87 var1 = (class87) class31.field797.method296(0); var1 != null; var1 = (class87) class31.field797.method290(arg0 ^ 0xFFFFCCEB)) {
            int var2 = var1.field2114;
            if (class23.method211(var2, 0)) {
                boolean var3 = true;
                class74[] var4 = class63.field1446[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field1805;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field2295;
                    class74 var7 = class99.method770(arg0 - 17970, var6);
                    if (var7 != null) {
                        class26.method232((byte) 118, var7);
                    }
                }
            }
        }
    }
}
