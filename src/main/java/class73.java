import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class73 {

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "Luf;")
    public static class168 field978 = class148.method1019(-1720, "sl_stars");

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "Luf;")
    public static class168 field972 = class148.method1019(-1720, "(Y<)4col>");

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "Luf;")
    public static class168 field980 = class148.method1019(-1720, "Angreifen");

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public int field981;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public int field982;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public int field983;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "[I")
    public static int[] field979;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "[Ljc;")
    public static class274[] field977;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V", line = 5)
    public static final void method407(int arg0) {
        field974++;
        if (arg0 != 1) {
            field978 = (class168) null;
        }
        class145.field2240.method1431((byte) 119);
        class285.field4821.method1431((byte) 123);
        class132.field2043.method1431((byte) 119);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V", line = 19)
    public static final void method408(byte arg0) {
        field970++;
        if (class24.field291 != null || class177.field2861 != null) {
            return;
        }
        int var1 = class106.field1634;
        if (class121.field1888) {
            if (var1 != 1) {
                int var6 = class262.field4442;
                int var7 = class155.field2457;
                if ((class20.field242 - 10) > var6 || var6 > (class79.field1124 + class20.field242 + 10) || var7 < (class131.field2031 - 10) || class131.field2031 + class110.field1727 + 10 < var7) {
                    class121.field1888 = false;
                    class127.method901(class20.field242, (byte) 122, class110.field1727, class131.field2031, class79.field1124);
                }
            }
            if (var1 == 1) {
                int var8 = class20.field242;
                int var9 = class131.field2031;
                int var10 = class79.field1124;
                int var11 = class206.field3384;
                int var12 = class83.field1244;
                int var13 = -1;
                for (int var14 = 0; var14 < class22.field275; var14++) {
                    int var15 = var9 + ((-var14 + class22.field275 + -1) * 15) + 31;
                    if (var11 > var8 && var8 + var10 > var11 && var12 > (var15 - 13) && var12 < var15 + 3) {
                        var13 = var14;
                    }
                }
                if (var13 != -1) {
                    class238.method1615((byte) 69, var13);
                }
                class121.field1888 = false;
                class127.method901(class20.field242, (byte) 103, class110.field1727, class131.field2031, class79.field1124);
            }
        } else {
            if (var1 == 1 && class22.field275 > 0) {
                short var2 = class61.field804[class22.field275 - 1];
                if (var2 == 12 || var2 == 38 || var2 == 14 || var2 == 51 || var2 == 30 || var2 == 33 || var2 == 40 || var2 == 18 || var2 == 2 || var2 == 32 || var2 == 48 || var2 == 1004) {
                    int var3 = class77.field1046[class22.field275 - 1];
                    int var4 = class241.field3946[class22.field275 - 1];
                    class242 var5 = class130.method910((byte) -125, var4);
                    if (class144.method984(client.method2015(var5), false) || class114.method832(client.method2015(var5), -1)) {
                        class61.field803 = 0;
                        client.field4941 = false;
                        if (class24.field291 != null) {
                            client.method2011((byte) -59, class24.field291);
                        }
                        class24.field291 = class130.method910((byte) -122, var4);
                        class270.field4542 = var3;
                        class116.field1803 = class83.field1244;
                        class237.field3786 = class206.field3384;
                        client.method2011((byte) -59, class24.field291);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class39.field487 == 1 && class22.field275 > 2 || class284.method1962(class22.field275 - 1, true))) {
                var1 = 2;
            }
            if (var1 == 2 && class22.field275 > 0 || class211.field3471 == 1) {
                class201.method1411((byte) -117);
            }
            if (var1 == 1 && class22.field275 > 0 || class211.field3471 == 2) {
                class56.method319(-31082);
            }
        }
        int var16 = 42 / ((-arg0 - 20) / 55);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lj;BI)V", line = 151)
    private final void method409(class153 arg0, byte arg1, int arg2) {
        field973++;
        if (arg1 > 75 && arg2 == 1) {
            this.field983 = arg0.method1069(115);
            this.field982 = arg0.method1042((byte) 115);
            this.field981 = arg0.method1042((byte) 109);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IJ)Luf;", line = 177)
    public static final class168 method410(int arg0, long arg1) {
        field969++;
        if (arg0 != 10) {
            field977 = (class274[]) null;
        }
        return class22.method113(arg1, false, -77, 10);
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V", line = 194)
    public static final void method411(int arg0) {
        class91.field1395.method1431((byte) 118);
        class143.field2204.method1431((byte) 122);
        field971++;
        if (arg0 != 12) {
            method408((byte) -106);
        }
        class79.field1126.method1431((byte) 122);
        class77.field1036.method1431((byte) 121);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)Z", line = 208)
    public static final boolean method412(int arg0, int arg1) {
        field975++;
        if (arg0 < 32) {
            return false;
        } else if (arg0 == 127) {
            return false;
        } else {
            return ~arg0 > arg1 || arg0 > 159;
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V", line = 235)
    public static void method413(int arg0) {
        field979 = null;
        field978 = null;
        field980 = null;
        if (arg0 < -74) {
            field972 = null;
            field977 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lj;I)V", line = 264)
    public final void method414(class153 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1042((byte) 104);
            if (var3 == 0) {
                field976++;
                if (arg1 != -1) {
                    this.field982 = 35;
                }
                return;
            }
            this.method409(arg0, (byte) 94, var3);
        }
    }
}
