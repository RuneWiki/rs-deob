import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class89 {

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "Lod;")
    private static class101 field1928 = class46.method335(110, "wishes to trade with you)3");

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "Lod;")
    public static class101 field1931 = class46.method335(-108, "(U0a )2 via: ");

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "Lod;")
    public static class101 field1932 = field1928;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "Lod;")
    public static class101 field1929 = class46.method335(-57, "<col=00ff00>");

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "[Lt;")
    public static class132[] field1940 = new class132[256];

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "Lod;")
    public static class101 field1937 = class46.method335(126, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "Lod;")
    private static class101 field1939 = class46.method335(-101, "Players");

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "Lod;")
    public static class101 field1934 = field1939;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "Ltf;")
    public static class138 field1930 = new class138(new byte[5000]);

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "Lod;")
    public static class101 field1943 = class46.method335(-101, "b12_full");

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "Llf;")
    public static class82 field1942 = new class82();

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "[Lqe;")
    public static class116[] field1926;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public static final void method628(int arg0) {
        field1935++;
        int var1 = 3 % ((80 - arg0) / 39);
        for (class85 var2 = (class85) class83.field1804.method523(false); var2 != null; var2 = (class85) class83.field1804.method527(true)) {
            if (class95.field2040 != var2.field1878 || var2.field1896) {
                var2.method959(11835);
            } else if (var2.field1895 <= class143.field3305) {
                var2.method615(0, class141.field3255);
                if (var2.field1896) {
                    var2.method959(11835);
                } else {
                    class33.field857.method587(var2.field1878, var2.field1890, var2.field1888, var2.field1870, 60, var2, 0, -1, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method629(int arg0, int arg1) {
        field1927++;
        if (arg1 == 100 && class43.field1027 > 0) {
            byte[] var2 = class96.field2081[--class43.field1027];
            class96.field2081[class43.field1027] = null;
            return var2;
        } else if (arg1 == 5000 && class35.field893 > 0) {
            byte[] var3 = class121.field2674[--class35.field893];
            class121.field2674[class35.field893] = null;
            return var3;
        } else {
            int var4 = 30 % ((87 - arg0) / 35);
            if (arg1 == 30000 && class87.field1919 > 0) {
                byte[] var5 = class25.field658[--class87.field1919];
                class25.field658[class87.field1919] = null;
                return var5;
            } else {
                return new byte[arg1];
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BLsa;)V")
    public static final void method630(byte arg0, class126 arg1) {
        field1936++;
        int var2 = arg1.field2856;
        if (var2 == 324) {
            if (class39.field938 == -1) {
                class75.field1604 = arg1.field2767;
                class39.field938 = arg1.field2805;
            }
            if (field1942.field1802) {
                arg1.field2805 = class39.field938;
            } else {
                arg1.field2805 = class75.field1604;
            }
        } else if (var2 == 325) {
            if (class39.field938 == -1) {
                class39.field938 = arg1.field2805;
                class75.field1604 = arg1.field2767;
            }
            if (field1942.field1802) {
                arg1.field2805 = class75.field1604;
            } else {
                arg1.field2805 = class39.field938;
            }
        } else if (arg0 > 67) {
            if (var2 == 327) {
                arg1.field2778 = 150;
                arg1.field2748 = (int) (Math.sin((double) class143.field3305 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field2735 = 0;
                arg1.field2741 = 5;
            } else if (var2 == 328) {
                arg1.field2778 = 150;
                arg1.field2748 = (int) (Math.sin((double) class143.field3305 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field2735 = 1;
                arg1.field2741 = 5;
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lod;ILsa;)Lod;")
    public static final class101 method631(class101 arg0, int arg1, class126 arg2) {
        if (arg1 != 1) {
            field1943 = null;
        }
        if (arg0.method708((byte) 110, class43.field1026) != -1) {
            label62: while (true) {
                int var3 = arg0.method708((byte) 125, class142.field3269);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg0.method708((byte) 76, class29.field770);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg0.method708((byte) 107, class115.field2563);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg0.method708((byte) 113, class155.field3566);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg0.method708((byte) 68, class20.field439);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg0.method708((byte) 87, class100.field2168);
                                                        if (var8 == -1) {
                                                            break label62;
                                                        }
                                                        class101 var9 = class26.field672;
                                                        if (class129.field2941 != null) {
                                                            var9 = class152.method1183(class129.field2941.field1593, arg1 ^ 0x1);
                                                            try {
                                                                if (class129.field2941.field1590 != null) {
                                                                    byte[] var10 = ((String) class129.field2941.field1590).getBytes("ISO-8859-1");
                                                                    var9 = class7.method36(0, var10.length, (byte) -43, var10);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg0 = class15.method101(86, new class101[] { arg0.method725(0, -115, var8), var9, arg0.method707((byte) 101, var8 + 4) });
                                                    }
                                                }
                                                arg0 = class15.method101(92, new class101[] { arg0.method725(0, -100, var7), class2.method10(999999999, class144.method1145(4, (byte) -111, arg2)), arg0.method707((byte) 101, var7 + 2) });
                                            }
                                        }
                                        arg0 = class15.method101(83, new class101[] { arg0.method725(0, -127, var6), class2.method10(999999999, class144.method1145(3, (byte) -97, arg2)), arg0.method707((byte) 101, var6 + 2) });
                                    }
                                }
                                arg0 = class15.method101(-28, new class101[] { arg0.method725(0, arg1 - 107, var5), class2.method10(999999999, class144.method1145(2, (byte) -111, arg2)), arg0.method707((byte) 101, var5 + 2) });
                            }
                        }
                        arg0 = class15.method101(-81, new class101[] { arg0.method725(0, -102, var4), class2.method10(999999999, class144.method1145(1, (byte) -114, arg2)), arg0.method707((byte) 101, var4 + 2) });
                    }
                }
                arg0 = class15.method101(122, new class101[] { arg0.method725(0, -118, var3), class2.method10(999999999, class144.method1145(0, (byte) -101, arg2)), arg0.method707((byte) 101, var3 + 2) });
            }
        }
        field1933++;
        return arg0;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
    public static void method632(byte arg0) {
        field1939 = null;
        field1929 = null;
        field1926 = null;
        field1932 = null;
        field1934 = null;
        if (arg0 != -119) {
            return;
        }
        field1928 = null;
        field1942 = null;
        field1930 = null;
        field1931 = null;
        field1937 = null;
        field1940 = null;
        field1943 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lsa;I)Lod;")
    public static final class101 method633(class126 arg0, int arg1) {
        field1941++;
        if (class48.method354(22782, class42.method313(arg0, (byte) -81)) == 0) {
            return null;
        } else if (arg0.field2852 == null || arg0.field2852.method726(false).method737(0) == 0) {
            return class79.field1659 ? class42.field1000 : null;
        } else if (arg1 == -22344) {
            return arg0.field2852;
        } else {
            return null;
        }
    }
}
