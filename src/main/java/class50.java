import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class50 extends class28 {

    @OriginalMember(owner = "client!hb", name = "V", descriptor = "[I")
    public static int[] field1146 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!hb", name = "gb", descriptor = "Lja;")
    private static class62 field1157 = class30.method243(43, "skill)2");

    @OriginalMember(owner = "client!hb", name = "cb", descriptor = "Lja;")
    public static class62 field1153 = class30.method243(43, "Passwort: ");

    @OriginalMember(owner = "client!hb", name = "hb", descriptor = "Lja;")
    private static class62 field1158 = class30.method243(43, " is already on your friend list");

    @OriginalMember(owner = "client!hb", name = "fb", descriptor = "Lja;")
    public static class62 field1156 = class30.method243(43, "Benutzen");

    @OriginalMember(owner = "client!hb", name = "lb", descriptor = "I")
    public static int field1162 = 0;

    @OriginalMember(owner = "client!hb", name = "mb", descriptor = "Lja;")
    public static class62 field1163 = class30.method243(43, "<col=ff3000>");

    @OriginalMember(owner = "client!hb", name = "db", descriptor = "Lja;")
    private static class62 field1154 = class30.method243(43, "Drop");

    @OriginalMember(owner = "client!hb", name = "X", descriptor = "I")
    public static int field1148 = 0;

    @OriginalMember(owner = "client!hb", name = "eb", descriptor = "Lja;")
    public static class62 field1155 = field1158;

    @OriginalMember(owner = "client!hb", name = "ob", descriptor = "Lja;")
    private static class62 field1165 = class30.method243(43, "Loading sprites )2 ");

    @OriginalMember(owner = "client!hb", name = "ab", descriptor = "Lja;")
    public static class62 field1151 = field1165;

    @OriginalMember(owner = "client!hb", name = "bb", descriptor = "Lja;")
    public static class62 field1152 = field1157;

    @OriginalMember(owner = "client!hb", name = "jb", descriptor = "Lja;")
    public static class62 field1160 = field1154;

    @OriginalMember(owner = "client!hb", name = "pb", descriptor = "B")
    public byte field1166;

    @OriginalMember(owner = "client!hb", name = "Z", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!hb", name = "ib", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!hb", name = "kb", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!hb", name = "nb", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!hb", name = "qb", descriptor = "I")
    public int field1167;

    @OriginalMember(owner = "client!hb", name = "rb", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!hb", name = "W", descriptor = "Lrf;")
    public static class124 field1147;

    @OriginalMember(owner = "client!hb", name = "Y", descriptor = "Lea;")
    public class29 field1149;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lja;Lja;Lpd;I)[Lq;")
    public static final class114[] method348(class62 arg0, class62 arg1, class108 arg2, int arg3) {
        field1164++;
        if (arg3 != 2) {
            method351(113, null);
        }
        int var4 = arg2.method877(arg3 ^ 0x52, arg1);
        int var5 = arg2.method868(arg0, (byte) -110, var4);
        return class150.method1183(var5, arg2, (byte) 57, var4);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V")
    public static void method349(boolean arg0) {
        field1163 = null;
        field1157 = null;
        field1160 = null;
        field1152 = null;
        field1146 = null;
        field1156 = null;
        field1158 = null;
        field1151 = null;
        field1147 = null;
        field1154 = null;
        field1165 = null;
        field1155 = null;
        field1153 = null;
        if (!arg0) {
            field1148 = -85;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLhe;)Lhe;")
    public static final class54 method350(byte arg0, class54 arg1) {
        class54 var2 = class90.method703((byte) -37, arg1);
        if (arg0 < 120) {
            method350((byte) -74, null);
        }
        field1161++;
        if (var2 == null) {
            var2 = arg1.field1286;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILpd;)V")
    public static final void method351(int arg0, class108 arg1) {
        if (arg0 == 8) {
            class86.field2055 = arg1;
            field1150++;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZZ)V")
    public static final void method352(boolean arg0, boolean arg1) {
        if (class40.field936.field136 >> 7 == class146.field3444 && class40.field936.field134 >> 7 == class24.field597) {
            class146.field3444 = 0;
        }
        field1168++;
        if (!arg1) {
            return;
        }
        int var2 = class147.field3460;
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class115 var4;
            int var5;
            if (arg0) {
                var4 = class40.field936;
                var5 = 33538048;
            } else {
                var5 = class141.field3311[var3] << 14;
                var4 = class52.field1200[class141.field3311[var3]];
            }
            if (var4 != null && var4.method66((byte) -24)) {
                int var6 = var4.field136 >> 7;
                var4.field2663 = false;
                if ((class144.field3361 && class147.field3460 > 50 || class147.field3460 > 200) && !arg0 && var4.field191 == var4.field178) {
                    var4.field2663 = true;
                }
                int var7 = var4.field134 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field2658 == null || var4.field2657 > class86.field2060 || class86.field2060 >= var4.field2635) {
                        if ((var4.field136 & 0x7F) == 64 && (var4.field134 & 0x7F) == 64) {
                            if (class103.field2395[var6][var7] == class116.field2671) {
                                continue;
                            }
                            class103.field2395[var6][var7] = class116.field2671;
                        }
                        var4.field2638 = class111.method908(128, var4.field136, var4.field134, class155.field3598);
                        class119.field2703.method576(class155.field3598, var4.field136, var4.field134, var4.field2638, 60, var4, var4.field168, var5, var4.field145);
                    } else {
                        var4.field2663 = false;
                        var4.field2638 = class111.method908(128, var4.field136, var4.field134, class155.field3598);
                        class119.field2703.method555(class155.field3598, var4.field136, var4.field134, var4.field2638, 60, var4, var4.field168, var5, var4.field2636, var4.field2661, var4.field2664, var4.field2627);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "(B)V")
    public static final void method353(byte arg0) {
        field1159++;
        try {
            if (class20.field448 == 0) {
                if (class59.field1444 != null) {
                    class59.field1444.method978(arg0 - 25);
                    class59.field1444 = null;
                }
                class51.field1173 = false;
                class141.field3297 = null;
                class20.field448 = 1;
                class100.field2322 = 0;
            }
            if (class20.field448 == 1) {
                if (class141.field3297 == null) {
                    class141.field3297 = class148.field3481.method308(class38.field893, false, class144.field3359);
                }
                if (class141.field3297.field471 == 2) {
                    throw new IOException();
                }
                if (class141.field3297.field471 == 1) {
                    class59.field1444 = new class124((Socket) class141.field3297.field473, class148.field3481);
                    class20.field448 = 2;
                    class141.field3297 = null;
                }
            }
            if (class20.field448 == 2) {
                long var1 = class142.field3316 = class7.field210.method448(37);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class136.field3140.field2873 = 0;
                class136.field3140.method1010(14, 32768);
                class136.field3140.method1010(var3, 32768);
                class59.field1444.method979(2, 19770, class136.field3140.field2874, 0);
                class38.field879.field2873 = 0;
                class20.field448 = 3;
            }
            if (class20.field448 == 3) {
                if (class85.field2036 != null) {
                    class85.field2036.method389((byte) -72);
                }
                if (class82.field1980 != null) {
                    class82.field1980.method389((byte) -115);
                }
                int var4 = class59.field1444.method977((byte) 80);
                if (class85.field2036 != null) {
                    class85.field2036.method389((byte) -63);
                }
                if (class82.field1980 != null) {
                    class82.field1980.method389((byte) -60);
                }
                if (var4 != 0) {
                    class13.method95(var4, -77);
                    return;
                }
                class20.field448 = 4;
                class38.field879.field2873 = 0;
            }
            if (class20.field448 == 4) {
                if (class38.field879.field2873 < 8) {
                    int var5 = class59.field1444.method982(arg0 ^ 0xFFFFFFC0);
                    if (var5 > 8 - class38.field879.field2873) {
                        var5 = 8 - class38.field879.field2873;
                    }
                    if (var5 > 0) {
                        class59.field1444.method974(var5, class38.field879.field2873, -62, class38.field879.field2874);
                        class38.field879.field2873 += var5;
                    }
                }
                if (class38.field879.field2873 == 8) {
                    class38.field879.field2873 = 0;
                    client.field488 = class38.field879.method1030(121);
                    class20.field448 = 5;
                }
            }
            if (class20.field448 == 5) {
                class136.field3140.field2873 = 0;
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (client.field488 >> 32), (int) client.field488 };
                class136.field3140.method1010(10, 32768);
                class136.field3140.method1040(var6[0], arg0 ^ 0xB200512C);
                class136.field3140.method1040(var6[1], -1308601992);
                class136.field3140.method1040(var6[2], arg0 ^ 0xB200512C);
                class136.field3140.method1040(var6[3], -1308601992);
                class136.field3140.method1040(class148.field3481.field958, -1308601992);
                class136.field3140.method1008(class7.field210.method448(37), (byte) 38);
                class136.field3140.method1021(-112, class7.field215);
                class136.field3140.method1013(class15.field363, false, class72.field1819);
                class70.field1794.field2873 = 0;
                if (class103.field2405 == 40) {
                    class70.field1794.method1010(18, 32768);
                } else {
                    class70.field1794.method1010(16, 32768);
                }
                class70.field1794.method1010(class136.field3140.field2873 + 69, 32768);
                class70.field1794.method1040(460, arg0 ^ 0xB200512C);
                class70.field1794.method1010(class144.field3361 ? 1 : 0, arg0 + 32684);
                class70.field1794.method1040(class142.field3325.field2498, arg0 - 1308602076);
                class70.field1794.method1040(class46.field1056.field2498, -1308601992);
                class70.field1794.method1040(class111.field2552.field2498, -1308601992);
                class70.field1794.method1040(class63.field1546.field2498, -1308601992);
                class70.field1794.method1040(class88.field2086.field2498, -1308601992);
                class70.field1794.method1040(class17.field399.field2498, -1308601992);
                class70.field1794.method1040(class31.field761.field2498, -1308601992);
                class70.field1794.method1040(class79.field1923.field2498, arg0 ^ 0xB200512C);
                class70.field1794.method1040(class149.field3504.field2498, -1308601992);
                class70.field1794.method1040(class134.field3095.field2498, -1308601992);
                class70.field1794.method1040(class77.field1902.field2498, arg0 - 1308602076);
                class70.field1794.method1040(class53.field1218.field2498, arg0 - 1308602076);
                class70.field1794.method1040(class70.field1798.field2498, -1308601992);
                class70.field1794.method1040(class57.field1401.field2498, arg0 - 1308602076);
                class70.field1794.method1040(class146.field3449.field2498, -1308601992);
                class70.field1794.method1040(class5.field107.field2498, -1308601992);
                class70.field1794.method1009(class136.field3140.field2873, 0, class136.field3140.field2874, (byte) -63);
                class59.field1444.method979(class70.field1794.field2873, 19770, class70.field1794.field2874, 0);
                class136.field3140.method803((byte) -83, var6);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class38.field879.method803((byte) 113, var6);
                class20.field448 = 6;
            }
            if (class20.field448 == 6 && class59.field1444.method982(-112) > 0) {
                int var8 = class59.field1444.method977((byte) 80);
                if (var8 == 21 && class103.field2405 == 20) {
                    class20.field448 = 7;
                } else if (var8 == 2) {
                    class20.field448 = 9;
                } else if (var8 == 15 && class103.field2405 == 40) {
                    class5.method36((byte) 110);
                    return;
                } else if (var8 == 23 && class98.field2294 < 1) {
                    class98.field2294++;
                    class20.field448 = 0;
                } else {
                    class13.method95(var8, 36);
                    return;
                }
            }
            if (class20.field448 == 7 && class59.field1444.method982(arg0 - 175) > 0) {
                class88.field2093 = (class59.field1444.method977((byte) 80) + 3) * 60;
                class20.field448 = 8;
            }
            if (class20.field448 == 8) {
                class100.field2322 = 0;
                class1.method1(class110.field2511, class39.field914, class70.method594(new class62[] { class31.method249(true, class88.field2093 / 60), class42.field990 }, 1229), 0);
                if (--class88.field2093 <= 0) {
                    class20.field448 = 0;
                }
            } else {
                if (class20.field448 == 9 && class59.field1444.method982(-117) >= 8) {
                    class97.field2262 = class59.field1444.method977((byte) 80);
                    class100.field2326 = class59.field1444.method977((byte) 80) == 1;
                    class34.field812 = class59.field1444.method977((byte) 80);
                    class34.field812 <<= 0x8;
                    class34.field812 += class59.field1444.method977((byte) 80);
                    class43.field994 = class59.field1444.method977((byte) 80);
                    class59.field1444.method974(1, 0, arg0 - 182, class38.field879.field2874);
                    class38.field879.field2873 = 0;
                    class122.field2800 = class38.field879.method806((byte) -112);
                    class59.field1444.method974(2, 0, -89, class38.field879.field2874);
                    class38.field879.field2873 = 0;
                    class115.field2651 = class38.field879.method1041(212464720);
                    class20.field448 = 10;
                }
                if (arg0 != 84) {
                    method353((byte) 127);
                }
                if (class20.field448 != 10) {
                    class100.field2322++;
                    if (class100.field2322 > 2000) {
                        if (class98.field2294 < 1) {
                            if (class144.field3359 == class122.field2798) {
                                class144.field3359 = class149.field3509;
                            } else {
                                class144.field3359 = class122.field2798;
                            }
                            class98.field2294++;
                            class20.field448 = 0;
                        } else {
                            class13.method95(-3, arg0 ^ 0x16);
                        }
                    }
                } else if (class59.field1444.method982(-128) >= class115.field2651) {
                    class38.field879.field2873 = 0;
                    class59.field1444.method974(class115.field2651, 0, -87, class38.field879.field2874);
                    class65.method498(105);
                    class28.field694 = -1;
                    class1.method3(false, arg0 ^ 0x3B);
                    class122.field2800 = -1;
                }
            }
        } catch (IOException var9) {
            if (class98.field2294 < 1) {
                if (class144.field3359 == class122.field2798) {
                    class144.field3359 = class149.field3509;
                } else {
                    class144.field3359 = class122.field2798;
                }
                class20.field448 = 0;
                class98.field2294++;
            } else {
                class13.method95(-2, -80);
            }
        }
    }
}
