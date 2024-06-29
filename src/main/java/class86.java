import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class86 extends class129 {

    @OriginalMember(owner = "client!ob", name = "X", descriptor = "[I")
    private int[] field2118 = new int[6];

    @OriginalMember(owner = "client!ob", name = "db", descriptor = "I")
    public int field2124 = -1;

    @OriginalMember(owner = "client!ob", name = "W", descriptor = "I")
    private int field2117 = 0;

    @OriginalMember(owner = "client!ob", name = "nb", descriptor = "[I")
    private int[] field2134 = new int[6];

    @OriginalMember(owner = "client!ob", name = "ib", descriptor = "I")
    private int field2129 = 0;

    @OriginalMember(owner = "client!ob", name = "hb", descriptor = "I")
    private int field2128 = 0;

    @OriginalMember(owner = "client!ob", name = "qb", descriptor = "I")
    private int field2137 = 128;

    @OriginalMember(owner = "client!ob", name = "kb", descriptor = "I")
    private int field2131 = 128;

    @OriginalMember(owner = "client!ob", name = "ab", descriptor = "[I")
    public static int[] field2121 = new int[256];

    @OriginalMember(owner = "client!ob", name = "lb", descriptor = "Lmc;")
    public static class75 field2132 = class30.method234(true, "(WSpielkonto wiederherstellen(W Option auf der Hauptseite)3");

    @OriginalMember(owner = "client!ob", name = "fb", descriptor = "Lmc;")
    public static class75 field2126 = null;

    @OriginalMember(owner = "client!ob", name = "eb", descriptor = "[I")
    public static int[] field2125 = new int[500];

    @OriginalMember(owner = "client!ob", name = "mb", descriptor = "Lmc;")
    private static class75 field2133 = class30.method234(true, "Prepared sound engine");

    @OriginalMember(owner = "client!ob", name = "Y", descriptor = "Lmc;")
    public static class75 field2119 = field2133;

    @OriginalMember(owner = "client!ob", name = "U", descriptor = "I")
    public static int field2115 = 1;

    @OriginalMember(owner = "client!ob", name = "ub", descriptor = "Lmc;")
    public static class75 field2141;

    @OriginalMember(owner = "client!ob", name = "sb", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!ob", name = "vb", descriptor = "Lmc;")
    private static class75 field2142;

    @OriginalMember(owner = "client!ob", name = "rb", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!ob", name = "wb", descriptor = "Lmc;")
    public static class75 field2143;

    @OriginalMember(owner = "client!ob", name = "tb", descriptor = "Lmc;")
    public static class75 field2140;

    @OriginalMember(owner = "client!ob", name = "R", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!ob", name = "S", descriptor = "I")
    public int field2113;

    @OriginalMember(owner = "client!ob", name = "T", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!ob", name = "V", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!ob", name = "Z", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!ob", name = "bb", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!ob", name = "cb", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!ob", name = "gb", descriptor = "I")
    private int field2127;

    @OriginalMember(owner = "client!ob", name = "jb", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!ob", name = "ob", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!ob", name = "pb", descriptor = "I")
    public static int field2136;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2121[var0] = var1;
        }
        field2141 = class30.method234(true, "backvmid3");
        field2139 = 0;
        field2142 = class30.method234(true, "Enter object name");
        field2138 = -1;
        field2143 = class30.method234(true, "Keine Antwort vom Anmelde)2Server)3");
        field2140 = field2142;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(II)Lpc;", line = 6)
    public final class93 method715(int arg0, int arg1) {
        if (arg0 != 25187) {
            method720(23);
        }
        class93 var3 = (class93) class52.field1309.method559((long) this.field2113, arg0 - 25071);
        field2112++;
        if (var3 == null) {
            var3 = class93.method778(class64.field1686, this.field2127, 0);
            if (var3 == null) {
                return null;
            }
            for (int var4 = 0; var4 < 6; var4++) {
                if (this.field2134[0] != 0) {
                    var3.method789(this.field2134[var4], this.field2118[var4]);
                }
            }
            var3.method783();
            var3.method800(this.field2117 + 64, this.field2128 + 850, -30, -50, -30, true);
            class52.field1309.method558((long) this.field2113, var3, 304);
        }
        class93 var5;
        if (this.field2124 == -1 || arg1 == -1) {
            var5 = var3.method774(true);
        } else {
            var5 = class37.method289(this.field2124, (byte) -127).method885(arg1, -865798288, var3);
        }
        if (this.field2137 != 128 || this.field2131 != 128) {
            var5.method770(this.field2137, this.field2131, this.field2137);
        }
        if (this.field2129 != 0) {
            if (this.field2129 == 90) {
                var5.method796();
            }
            if (this.field2129 == 180) {
                var5.method796();
                var5.method796();
            }
            if (this.field2129 == 270) {
                var5.method796();
                var5.method796();
                var5.method796();
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V", line = 80)
    public static final void method716(byte arg0) {
        if (arg0 != -50) {
            field2142 = null;
        }
        field2130++;
        if (class97.field2435 != 1) {
            return;
        }
        if (class12.field245 >= 539 && class12.field245 <= 573 && class71.field1813 >= 169 && class71.field1813 < 205 && class15.field289[0] != -1) {
            class130.field3167 = 0;
            class30.field681 = true;
            class108.field2743 = true;
        }
        if (class12.field245 >= 569 && class12.field245 <= 599 && class71.field1813 >= 168 && class71.field1813 < 205 && class15.field289[1] != -1) {
            class130.field3167 = 1;
            class108.field2743 = true;
            class30.field681 = true;
        }
        if (class12.field245 >= 597 && class12.field245 <= 627 && class71.field1813 >= 168 && class71.field1813 < 205 && class15.field289[2] != -1) {
            class108.field2743 = true;
            class30.field681 = true;
            class130.field3167 = 2;
        }
        if (class12.field245 >= 625 && class12.field245 <= 669 && class71.field1813 >= 168 && class71.field1813 < 203 && class15.field289[3] != -1) {
            class30.field681 = true;
            class108.field2743 = true;
            class130.field3167 = 3;
        }
        if (class12.field245 >= 666 && class12.field245 <= 696 && class71.field1813 >= 168 && class71.field1813 < 205 && class15.field289[4] != -1) {
            class30.field681 = true;
            class130.field3167 = 4;
            class108.field2743 = true;
        }
        if (class12.field245 >= 694 && class12.field245 <= 724 && class71.field1813 >= 168 && class71.field1813 < 205 && class15.field289[5] != -1) {
            class130.field3167 = 5;
            class30.field681 = true;
            class108.field2743 = true;
        }
        if (class12.field245 >= 722 && class12.field245 <= 756 && class71.field1813 >= 169 && class71.field1813 < 205 && class15.field289[6] != -1) {
            class108.field2743 = true;
            class130.field3167 = 6;
            class30.field681 = true;
        }
        if (class12.field245 >= 540 && class12.field245 <= 574 && class71.field1813 >= 466 && class71.field1813 < 502 && class15.field289[7] != -1) {
            class30.field681 = true;
            class130.field3167 = 7;
            class108.field2743 = true;
        }
        if (class12.field245 >= 572 && class12.field245 <= 602 && class71.field1813 >= 466 && class71.field1813 < 503 && class15.field289[8] != -1) {
            class30.field681 = true;
            class108.field2743 = true;
            class130.field3167 = 8;
        }
        if (class12.field245 >= 599 && class12.field245 <= 629 && class71.field1813 >= 466 && class71.field1813 < 503 && class15.field289[9] != -1) {
            class130.field3167 = 9;
            class108.field2743 = true;
            class30.field681 = true;
        }
        if (class12.field245 >= 627 && class12.field245 <= 671 && class71.field1813 >= 467 && class71.field1813 < 502 && class15.field289[10] != -1) {
            class30.field681 = true;
            class130.field3167 = 10;
            class108.field2743 = true;
        }
        if (class12.field245 >= 669 && class12.field245 <= 699 && class71.field1813 >= 466 && class71.field1813 < 503 && class15.field289[11] != -1) {
            class130.field3167 = 11;
            class108.field2743 = true;
            class30.field681 = true;
        }
        if (class12.field245 >= 696 && class12.field245 <= 726 && class71.field1813 >= 466 && class71.field1813 < 503 && class15.field289[12] != -1) {
            class130.field3167 = 12;
            class108.field2743 = true;
            class30.field681 = true;
        }
        if (class12.field245 >= 724 && class12.field245 <= 758 && class71.field1813 >= 466 && class71.field1813 < 502 && class15.field289[13] != -1) {
            class130.field3167 = 13;
            class30.field681 = true;
            class108.field2743 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "([Lmc;B)[Lmc;", line = 203)
    public static final class75[] method717(class75[] arg0, byte arg1) {
        if (arg1 >= -69) {
            return null;
        }
        field2116++;
        class75[] var2 = new class75[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class69.method586(new class75[] { class45.method345(22978, var3), class65.field1704 }, (byte) 115);
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class69.method586(new class75[] { var2[var3], arg0[var3] }, (byte) 114);
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZZ)V", line = 229)
    public static final void method718(boolean arg0, boolean arg1) {
        if (class52.field1315.field1233 >> 7 == class74.field1853 && class52.field1315.field1242 >> 7 == class37.field892) {
            class74.field1853 = 0;
        }
        int var2 = class34.field783;
        if (arg1) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class122 var4;
            int var5;
            if (arg1) {
                var4 = class52.field1315;
                var5 = 33538048;
            } else {
                var5 = class84.field2081[var3] << 14;
                var4 = class40.field957[class84.field2081[var3]];
            }
            if (var4 != null && var4.method395(28619)) {
                int var6 = var4.field1242 >> 7;
                var4.field2985 = false;
                if ((class92.field2270 && class34.field783 > 50 || class34.field783 > 200) && !arg1 && var4.field1223 == var4.field1219) {
                    var4.field2985 = true;
                }
                int var7 = var4.field1233 >> 7;
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    if (var4.field2990 == null || class34.field781 < var4.field3002 || var4.field2998 <= class34.field781) {
                        if ((var4.field1233 & 0x7F) == 64 && (var4.field1242 & 0x7F) == 64) {
                            if (class91.field2258[var7][var6] == class112.field2842) {
                                continue;
                            }
                            class91.field2258[var7][var6] = class112.field2842;
                        }
                        var4.field2974 = class126.method1000(var4.field1242, class99.field2510, !arg0, var4.field1233);
                        class107.field2679.method189(class99.field2510, var4.field1233, var4.field1242, var4.field2974, 60, var4, var4.field1220, var5, var4.field1208);
                    } else {
                        var4.field2985 = false;
                        var4.field2974 = class126.method1000(var4.field1242, class99.field2510, false, var4.field1233);
                        class107.field2679.method185(class99.field2510, var4.field1233, var4.field1242, var4.field2974, 60, var4, var4.field1220, var5, var4.field2991, var4.field2968, var4.field3006, var4.field2987);
                    }
                }
            }
        }
        if (!arg0) {
            method717(null, (byte) -45);
        }
        field2120++;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lka;I)V", line = 315)
    public final void method719(class61 arg0, int arg1) {
        int var3 = -62 / ((37 - arg1) / 40);
        while (true) {
            int var4 = arg0.method494(20471);
            if (var4 == 0) {
                field2114++;
                return;
            }
            this.method721(var4, arg0, -73);
        }
    }

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "(I)V", line = 335)
    public static final void method720(int arg0) {
        int var1 = 62 % ((arg0 + 40) / 46);
        class24 var2 = (class24) class40.field949.method248(32);
        field2135++;
        while (var2 != null) {
            if (var2.field472 == -1) {
                var2.field456 = 0;
                class50.method386(0, var2);
            } else {
                var2.method589(true);
            }
            var2 = (class24) class40.field949.method252(108);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILka;I)V", line = 364)
    private final void method721(int arg0, class61 arg1, int arg2) {
        if (arg2 > -60) {
            return;
        }
        field2123++;
        if (arg0 == 1) {
            this.field2127 = arg1.method507((byte) -38);
        } else if (arg0 == 2) {
            this.field2124 = arg1.method507((byte) -86);
        } else if (arg0 == 4) {
            this.field2137 = arg1.method507((byte) -112);
        } else if (arg0 == 5) {
            this.field2131 = arg1.method507((byte) -99);
        } else if (arg0 == 6) {
            this.field2129 = arg1.method507((byte) -43);
        } else if (arg0 == 7) {
            this.field2117 = arg1.method494(20471);
        } else if (arg0 == 8) {
            this.field2128 = arg1.method494(20471);
        } else if (arg0 >= 40 && arg0 < 50) {
            this.field2134[arg0 - 40] = arg1.method507((byte) -103);
        } else if (arg0 >= 50 && arg0 < 60) {
            this.field2118[arg0 - 50] = arg1.method507((byte) -27);
        }
    }

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "(I)V", line = 422)
    public static void method722(int arg0) {
        field2132 = null;
        field2119 = null;
        if (arg0 <= 76) {
            field2133 = null;
        }
        field2126 = null;
        field2121 = null;
        field2125 = null;
        field2142 = null;
        field2140 = null;
        field2133 = null;
        field2143 = null;
        field2141 = null;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(Z)Lnc;", line = 464)
    public static final class81 method723(boolean arg0) {
        class81 var1 = new class81();
        var1.field2022 = class130.field3170;
        field2136++;
        var1.field2026 = class55.field1395;
        var1.field2024 = class47.field1154[0];
        var1.field2023 = class43.field1031[0];
        var1.field2027 = class100.field2592[0];
        if (arg0) {
            field2138 = 17;
        }
        var1.field2028 = class36.field880[0];
        var1.field2025 = class85.field2109;
        var1.field2029 = class118.field2924[0];
        class41.method317(7);
        return var1;
    }
}
