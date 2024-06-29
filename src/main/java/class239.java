import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class239 {

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
    public int field4183;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field4175 = 0;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Loh;")
    public static class263 field4169 = class253.method1681(-121, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "Z")
    public static boolean field4172 = true;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "Loh;")
    public static class263 field4180 = class253.method1681(-121, " GMT");

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "Loh;")
    public static class263 field4182 = class253.method1681(-117, "p11_full");

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public int field4173;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public int field4178;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
    public int field4185;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "Lqi;")
    public class126 field4179;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "[I")
    public int[] field4167;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "[I")
    public int[] field4170;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "[I")
    public int[] field4171;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "[I")
    public int[] field4176;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "[I")
    public int[] field4184;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "[I")
    public int[] field4189;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "[Lqi;")
    public class126[] field4177;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "[[I")
    public int[][] field4181;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "[[I")
    public int[][] field4187;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)Z")
    public static final boolean method1596(byte arg0) throws IOException {
        if (arg0 <= 126) {
            field4172 = true;
        }
        field4168++;
        if (class166.field3023 == null) {
            return false;
        }
        int var1 = class166.field3023.method803(-128);
        if (var1 == 0) {
            return false;
        }
        if (class252.field4386 == -1) {
            var1--;
            class166.field3023.method810(0, -1, 1, class189.field3394.field3469);
            class189.field3394.field3497 = 0;
            class252.field4386 = class189.field3394.method1519((byte) -128);
            class36.field826 = class70.field1406[class252.field4386];
        }
        if (class36.field826 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class166.field3023.method810(0, -1, 1, class189.field3394.field3469);
            var1--;
            class36.field826 = class189.field3394.field3469[0] & 0xFF;
        }
        if (class36.field826 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class166.field3023.method810(0, -1, 2, class189.field3394.field3469);
            class189.field3394.field3497 = 0;
            class36.field826 = class189.field3394.method1294((byte) 3);
        }
        if (var1 < class36.field826) {
            return false;
        }
        class189.field3394.field3497 = 0;
        class166.field3023.method810(0, -1, class36.field826, class189.field3394.field3469);
        class272.field4790 = class131.field2403;
        class154.field2788 = 0;
        class131.field2403 = class196.field3566;
        class196.field3566 = class252.field4386;
        if (class252.field4386 == 106) {
            class263 var2 = class189.field3394.method1320(false);
            if (var2.method1773(class178.field3267, -6077)) {
                class263 var3 = var2.method1763(-116, var2.method1744(class72.field1481, (byte) -101), 0);
                long var4 = var3.method1755(1);
                boolean var6 = false;
                for (int var7 = 0; var7 < class31.field785; var7++) {
                    if (class41.field909[var7] == var4) {
                        var6 = true;
                        break;
                    }
                }
                if (!var6 && class4.field79 == 0) {
                    class120.method774(4, class256.field4457, -11292, var3);
                }
            } else if (var2.method1773(class28.field722, -6077)) {
                boolean var8 = false;
                class263 var9 = var2.method1763(-123, var2.method1744(class72.field1481, (byte) -101), 0);
                long var10 = var9.method1755(1);
                for (int var12 = 0; var12 < class31.field785; var12++) {
                    if (class41.field909[var12] == var10) {
                        var8 = true;
                        break;
                    }
                }
                if (!var8 && class4.field79 == 0) {
                    class263 var13 = var2.method1763(-120, var2.method1740(-124) - 9, var2.method1744(class72.field1481, (byte) -101) + 1);
                    class120.method774(8, var13, -11292, var9);
                }
            } else if (var2.method1773(class6.field113, -6077)) {
                class263 var14 = var2.method1763(-125, var2.method1744(class72.field1481, (byte) -101), 0);
                boolean var15 = false;
                long var16 = var14.method1755(1);
                for (int var18 = 0; var18 < class31.field785; var18++) {
                    if (class41.field909[var18] == var16) {
                        var15 = true;
                        break;
                    }
                }
                if (!var15 && class4.field79 == 0) {
                    class120.method774(10, class20.field459, -11292, var14);
                }
            } else if (var2.method1773(class35.field819, -6077)) {
                class263 var42 = var2.method1763(-120, var2.method1744(class35.field819, (byte) -101), 0);
                class120.method774(11, var42, -11292, class20.field459);
            } else if (var2.method1773(class244.field4312, -6077)) {
                class263 var41 = var2.method1763(-121, var2.method1744(class244.field4312, (byte) -101), 0);
                if (class4.field79 == 0) {
                    class120.method774(12, var41, -11292, class20.field459);
                }
            } else if (var2.method1773(class141.field2581, -6077)) {
                class263 var40 = var2.method1763(-121, var2.method1744(class141.field2581, (byte) -101), 0);
                if (class4.field79 == 0) {
                    class120.method774(13, var40, -11292, class20.field459);
                }
            } else if (var2.method1773(class37.field856, -6077)) {
                boolean var35 = false;
                class263 var36 = var2.method1763(-125, var2.method1744(class72.field1481, (byte) -101), 0);
                long var37 = var36.method1755(1);
                for (int var39 = 0; var39 < class31.field785; var39++) {
                    if (class41.field909[var39] == var37) {
                        var35 = true;
                        break;
                    }
                }
                if (!var35 && class4.field79 == 0) {
                    class120.method774(14, class20.field459, -11292, var36);
                }
            } else if (var2.method1773(class165.field3009, -6077)) {
                class263 var19 = var2.method1763(-120, var2.method1744(class72.field1481, (byte) -101), 0);
                long var20 = var19.method1755(1);
                boolean var22 = false;
                for (int var23 = 0; var23 < class31.field785; var23++) {
                    if (class41.field909[var23] == var20) {
                        var22 = true;
                        break;
                    }
                }
                if (!var22 && class4.field79 == 0) {
                    class120.method774(15, class20.field459, -11292, var19);
                }
            } else if (var2.method1773(class33.field801, -6077)) {
                class263 var24 = var2.method1763(-128, var2.method1744(class72.field1481, (byte) -101), 0);
                long var25 = var24.method1755(1);
                boolean var27 = false;
                for (int var28 = 0; var28 < class31.field785; var28++) {
                    if (class41.field909[var28] == var25) {
                        var27 = true;
                        break;
                    }
                }
                if (!var27 && class4.field79 == 0) {
                    class120.method774(16, class20.field459, -11292, var24);
                }
            } else if (var2.method1773(class261.field4538, -6077)) {
                class263 var29 = var2.method1763(-120, var2.method1744(class72.field1481, (byte) -101), 0);
                boolean var30 = false;
                long var31 = var29.method1755(1);
                for (int var33 = 0; var33 < class31.field785; var33++) {
                    if (class41.field909[var33] == var31) {
                        var30 = true;
                        break;
                    }
                }
                if (!var30 && class4.field79 == 0) {
                    class263 var34 = var2.method1763(-127, var2.method1740(-125) - 9, var2.method1744(class72.field1481, (byte) -101) - -1);
                    class120.method774(21, var34, -11292, var29);
                }
            } else {
                class120.method774(0, var2, -11292, class20.field459);
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 169) {
            int var43 = class189.field3394.method1301(-8317);
            int var44 = var43 >> 6;
            class50 var45 = new class50();
            var45.field1079 = var43 & 0x3F;
            var45.field1080 = class189.field3394.method1301(-8317);
            if (var45.field1080 >= 0 && var45.field1080 < class105.field1981.length) {
                if (var45.field1079 == 1 || var45.field1079 == 10) {
                    var45.field1072 = class189.field3394.method1294((byte) 3);
                    class189.field3394.field3497 += 3;
                } else if (var45.field1079 >= 2 && var45.field1079 <= 6) {
                    if (var45.field1079 == 2) {
                        var45.field1088 = 64;
                        var45.field1071 = 64;
                    }
                    if (var45.field1079 == 3) {
                        var45.field1088 = 64;
                        var45.field1071 = 0;
                    }
                    if (var45.field1079 == 4) {
                        var45.field1088 = 64;
                        var45.field1071 = 128;
                    }
                    if (var45.field1079 == 5) {
                        var45.field1071 = 64;
                        var45.field1088 = 0;
                    }
                    if (var45.field1079 == 6) {
                        var45.field1088 = 128;
                        var45.field1071 = 64;
                    }
                    var45.field1079 = 2;
                    var45.field1076 = class189.field3394.method1294((byte) 3);
                    var45.field1081 = class189.field3394.method1294((byte) 3);
                    var45.field1068 = class189.field3394.method1301(-8317);
                }
                var45.field1070 = class189.field3394.method1294((byte) 3);
                if (var45.field1070 == 65535) {
                    var45.field1070 = -1;
                }
                class1.field17[var44] = var45;
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 195) {
            int var46 = class189.field3394.method1283(119);
            class21 var47 = class8.method55(65535, var46);
            for (int var48 = 0; var48 < var47.field469.length; var48++) {
                var47.field469[var48] = -1;
                var47.field469[var48] = 0;
            }
            class220.method1508(var47, (byte) -106);
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 144) {
            int var49 = class189.field3394.method1266(4);
            int var50 = class189.field3394.method1294((byte) 3);
            if (var49 < -70000) {
                var50 += 32768;
            }
            class21 var51;
            if (var49 >= 0) {
                var51 = class8.method55(65535, var49);
            } else {
                var51 = null;
            }
            if (var51 != null) {
                for (int var52 = 0; var52 < var51.field469.length; var52++) {
                    var51.field469[var52] = 0;
                    var51.field618[var52] = 0;
                }
            }
            class105.method706(false, var50);
            int var53 = class189.field3394.method1294((byte) 3);
            for (int var54 = 0; var54 < var53; var54++) {
                int var55 = class189.field3394.method1301(-8317);
                if (var55 == 255) {
                    var55 = class189.field3394.method1296(1534255384);
                }
                int var56 = class189.field3394.method1326(-21737);
                if (var51 != null && var54 < var51.field469.length) {
                    var51.field469[var54] = var56;
                    var51.field618[var54] = var55;
                }
                class125.method804(var56 - 1, var50, -1, var55, var54);
            }
            if (var51 != null) {
                class220.method1508(var51, (byte) -46);
            }
            class216.method1466((byte) -77);
            class127.field2362[class263.method1777(31, class119.field2211++)] = class263.method1777(32767, var50);
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 100) {
            class11.field263 = class189.field3394.method1301(-8317);
            class82.field1627 = class189.field3394.method1301(-8317);
            class85.field1681 = class189.field3394.method1301(-8317);
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 22) {
            int var57 = class189.field3394.method1283(125);
            int var58 = class189.field3394.method1326(-21737);
            int var59 = class189.field3394.method1326(-21737);
            if (class72.method458(var58, (byte) 60)) {
                class220.method1504(var59, true, var57);
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 220) {
            long var60 = class189.field3394.method1274(-778468320);
            int var62 = class189.field3394.method1294((byte) 3);
            int var63 = class189.field3394.method1301(-8317);
            boolean var64 = true;
            class263 var65 = class20.field459;
            if (var60 < 0L) {
                var64 = false;
                var60 &= Long.MAX_VALUE;
            }
            if (var62 > 0) {
                var65 = class189.field3394.method1320(false);
            }
            class263 var66 = class233.method1565(37, var60).method1761(122);
            for (int var67 = 0; var67 < class100.field1908; var67++) {
                if (class38.field871[var67] == var60) {
                    if (class92.field1812[var67] != var62) {
                        class92.field1812[var67] = var62;
                        if (var62 > 0) {
                            class120.method774(5, class124.method797(-68, new class263[] { var66, class57.field1200 }), -11292, class20.field459);
                        }
                        if (var62 == 0) {
                            class120.method774(5, class124.method797(-47, new class263[] { var66, class103.field1957 }), -11292, class20.field459);
                        }
                    }
                    class2.field30[var67] = var65;
                    var66 = null;
                    class268.field4726[var67] = var63;
                    class82.field1633[var67] = var64;
                    break;
                }
            }
            if (var66 != null && class100.field1908 < 200) {
                class38.field871[class100.field1908] = var60;
                class238.field4159[class100.field1908] = var66;
                class92.field1812[class100.field1908] = var62;
                class2.field30[class100.field1908] = var65;
                class268.field4726[class100.field1908] = var63;
                class82.field1633[class100.field1908] = var64;
                class100.field1908++;
            }
            boolean var68 = false;
            class75.field1558 = class112.field2108;
            int var69 = class100.field1908;
            while (var69 > 0) {
                boolean var70 = true;
                var69--;
                for (int var71 = 0; var71 < var69; var71++) {
                    if (class92.field1812[var71] != class7.field127 && class92.field1812[var71 + 1] == class7.field127 || class92.field1812[var71] == 0 && class92.field1812[var71 + 1] != 0) {
                        var70 = false;
                        int var72 = class92.field1812[var71];
                        class92.field1812[var71] = class92.field1812[var71 + 1];
                        class92.field1812[var71 + 1] = var72;
                        class263 var73 = class2.field30[var71];
                        class2.field30[var71] = class2.field30[var71 + 1];
                        class2.field30[var71 + 1] = var73;
                        class263 var74 = class238.field4159[var71];
                        class238.field4159[var71] = class238.field4159[var71 + 1];
                        class238.field4159[var71 + 1] = var74;
                        long var75 = class38.field871[var71];
                        class38.field871[var71] = class38.field871[var71 + 1];
                        class38.field871[var71 + 1] = var75;
                        int var77 = class268.field4726[var71];
                        class268.field4726[var71] = class268.field4726[var71 + 1];
                        class268.field4726[var71 + 1] = var77;
                        boolean var78 = class82.field1633[var71];
                        class82.field1633[var71] = class82.field1633[var71 + 1];
                        class82.field1633[var71 + 1] = var78;
                    }
                }
                if (var70) {
                    break;
                }
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 192) {
            long var79 = class189.field3394.method1274(-778468320);
            class189.field3394.method1281((byte) 122);
            long var81 = class189.field3394.method1274(-778468320);
            long var83 = (long) class189.field3394.method1294((byte) 3);
            boolean var85 = false;
            long var86 = (long) class189.field3394.method1277((byte) -113);
            int var88 = class189.field3394.method1301(-8317);
            long var89 = (var83 << 32) + var86;
            int var91 = 0;
            label1219: while (true) {
                if (var91 >= 100) {
                    if (var88 <= 1) {
                        if ((!class156.field2806 || class85.field1670) && !class134.field2451) {
                            for (int var92 = 0; var92 < class31.field785; var92++) {
                                if (class41.field909[var92] == var79) {
                                    var85 = true;
                                    break label1219;
                                }
                            }
                        } else {
                            var85 = true;
                        }
                    }
                    break;
                }
                if (class41.field914[var91] == var89) {
                    var85 = true;
                    break;
                }
                var91++;
            }
            if (!var85 && class4.field79 == 0) {
                class41.field914[class122.field2271] = var89;
                class122.field2271 = (class122.field2271 + 1) % 100;
                class263 var93 = class65.method417(class109.method727(class189.field3394, 0).method1767((byte) -16));
                if (var88 == 2 || var88 == 3) {
                    class121.method785((byte) -97, 9, var93, class124.method797(-125, new class263[] { class195.field3532, class233.method1565(37, var79).method1761(122) }), class233.method1565(37, var81).method1761(122));
                } else if (var88 == 1) {
                    class121.method785((byte) -31, 9, var93, class124.method797(-71, new class263[] { class194.field3466, class233.method1565(37, var79).method1761(122) }), class233.method1565(37, var81).method1761(122));
                } else {
                    class121.method785((byte) -110, 9, var93, class233.method1565(37, var79).method1761(122), class233.method1565(37, var81).method1761(122));
                }
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 64) {
            long var94 = class189.field3394.method1274(-778468320);
            long var96 = (long) class189.field3394.method1294((byte) 3);
            long var98 = (long) class189.field3394.method1277((byte) -122);
            int var100 = class189.field3394.method1301(-8317);
            int var101 = class189.field3394.method1294((byte) 3);
            long var102 = (var96 << 32) + var98;
            boolean var104 = false;
            int var105 = 0;
            label1237: while (true) {
                if (var105 >= 100) {
                    if (var100 <= 1) {
                        for (int var106 = 0; var106 < class31.field785; var106++) {
                            if (class41.field909[var106] == var94) {
                                var104 = true;
                                break label1237;
                            }
                        }
                    }
                    break;
                }
                if (class41.field914[var105] == var102) {
                    var104 = true;
                    break;
                }
                var105++;
            }
            if (!var104 && class4.field79 == 0) {
                class41.field914[class122.field2271] = var102;
                class122.field2271 = (class122.field2271 + 1) % 100;
                class263 var107 = class173.method1139((byte) -90, var101).method639(-27737, class189.field3394);
                if (var100 == 2) {
                    class48.method309(var107, 18, (byte) 7, class124.method797(-120, new class263[] { class195.field3532, class233.method1565(37, var94).method1761(122) }), (class263) null, var101);
                } else if (var100 == 1) {
                    class48.method309(var107, 18, (byte) 7, class124.method797(-117, new class263[] { class194.field3466, class233.method1565(37, var94).method1761(122) }), (class263) null, var101);
                } else {
                    class48.method309(var107, 18, (byte) 7, class233.method1565(37, var94).method1761(122), (class263) null, var101);
                }
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 7) {
            int var108 = class189.field3394.method1283(117);
            int var109 = class189.field3394.method1282(false);
            int var110 = class189.field3394.method1295(-1);
            if (var109 == 65535) {
                var109 = -1;
            }
            if (class72.method458(var110, (byte) 60)) {
                class32.method212(var108, 674, 2, var109);
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 105 || class252.field4386 == 210 || class252.field4386 == 222 || class252.field4386 == 179 || class252.field4386 == 24 || class252.field4386 == 176 || class252.field4386 == 101 || class252.field4386 == 186 || class252.field4386 == 227 || class252.field4386 == 241 || class252.field4386 == 187 || class252.field4386 == 214) {
            class171.method1129(-35);
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 31) {
            class152.method998(14);
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 46) {
            class173.method1142(-1);
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 119) {
            class263 var111 = class189.field3394.method1320(false);
            int var112 = class189.field3394.method1326(-21737);
            int var113 = class189.field3394.method1282(false);
            if (class72.method458(var112, (byte) 60)) {
                class111.method729(var113, -14, var111);
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 127) {
            int var114 = class189.field3394.method1326(-21737);
            int var115 = class189.field3394.method1295(-1);
            int var116 = class189.field3394.method1266(4);
            int var117 = class189.field3394.method1294((byte) 3);
            if (class72.method458(var117, (byte) 60)) {
                class32.method212(var116, 674, 7, var114 << 16 | var115);
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 193) {
            int var118 = class189.field3394.method1301(-8317);
            int var119 = class189.field3394.method1279(false);
            int var120 = class189.field3394.method1279(false);
            class12.field321 = var118 >> 1;
            class229.field4018.method897((var118 & 0x1) == 1, var120, 127, var119);
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 11) {
            class216.method1466((byte) -116);
            class86.field1724 = class189.field3394.method1301(-8317);
            class257.field4474 = class112.field2108;
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 65) {
            int var121 = class189.field3394.method1294((byte) 3);
            int var122 = class189.field3394.method1266(4);
            if (class72.method458(var121, (byte) 60)) {
                class266 var123 = (class266) class212.field3797.method31(-32665, (long) var122);
                if (var123 != null) {
                    class218.method1488(var123, true, true);
                }
                if (class113.field2121 != null) {
                    class220.method1508(class113.field2121, (byte) -62);
                    class113.field2121 = null;
                }
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 185) {
            int var124 = class189.field3394.method1269(-13208);
            class263 var125 = class189.field3394.method1320(false);
            int var126 = class189.field3394.method1301(-8317);
            if (var124 >= 1 && var124 <= 8) {
                if (var125.method1766(-1, class226.field3990)) {
                    var125 = null;
                }
                class41.field922[var124 - 1] = var125;
                class205.field3732[var124 - 1] = var126 == 0;
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 229) {
            int var127 = class189.field3394.method1294((byte) 3);
            int var128 = class189.field3394.method1283(117);
            int var129 = class189.field3394.method1282(false);
            int var130 = class189.field3394.method1294((byte) 3);
            if ((var128 >> 30) != 0) {
                int var131 = (var128 & 0x3FFF) - class142.field2596;
                int var132 = (var128 >> 14 & 0x3FFF) - class93.field1844;
                int var133 = var128 >> 28 & 0x3;
                if (var132 >= 0 && var131 >= 0 && var132 < 104 && var131 < 104) {
                    int var134 = var132 * 128 + 64;
                    int var135 = var131 * 128 + 64;
                    class39 var136 = new class39(var130, var133, var134, var135, class120.method781(var133, var134, false, var135) - var127, var129, class228.field4012);
                    class20.field450.method1883(new class229(var136), (byte) -3);
                }
            } else if ((var128 >> 29) != 0) {
                int var137 = var128 & 0xFFFF;
                class90 var138 = class31.field774[var137];
                if (var138 != null) {
                    var138.field4699 = var127;
                    var138.field4709 = 0;
                    var138.field4689 = var130;
                    var138.field4685 = 0;
                    if (var138.field4689 == 65535) {
                        var138.field4689 = -1;
                    }
                    var138.field4653 = class228.field4012 + var129;
                    if (var138.field4653 > class228.field4012) {
                        var138.field4685 = -1;
                    }
                    if (var138.field4689 != -1 && class228.field4012 == var138.field4653) {
                        int var139 = class46.method296(-121, var138.field4689).field987;
                        if (var139 != -1) {
                            class240 var140 = class186.method1226(12828, var139);
                            if (var140 != null && var140.field4211 != null) {
                                class219.method1490(false, var138.field4705, 0, -64, var140, var138.field4688);
                            }
                        }
                    }
                }
            } else if (var128 >> 28 != 0) {
                int var141 = var128 & 0xFFFF;
                class137 var142;
                if (class196.field3574 == var141) {
                    var142 = class229.field4018;
                } else {
                    var142 = class151.field2725[var141];
                }
                if (var142 != null) {
                    var142.field4709 = 0;
                    var142.field4653 = class228.field4012 + var129;
                    var142.field4699 = var127;
                    var142.field4685 = 0;
                    if (var142.field4653 > class228.field4012) {
                        var142.field4685 = -1;
                    }
                    var142.field4689 = var130;
                    if (var142.field4689 == 65535) {
                        var142.field4689 = -1;
                    }
                    if (var142.field4689 != -1 && class228.field4012 == var142.field4653) {
                        int var143 = class46.method296(-62, var142.field4689).field987;
                        if (var143 != -1) {
                            class240 var144 = class186.method1226(12828, var143);
                            if (var144 != null && var144.field4211 != null) {
                                class219.method1490(class229.field4018 == var142, var142.field4705, 0, -64, var144, var142.field4688);
                            }
                        }
                    }
                }
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 91) {
            int var145 = class189.field3394.method1306(-1);
            int var146 = class189.field3394.method1294((byte) 3);
            int var147 = class189.field3394.method1326(-21737);
            int var148 = class189.field3394.method1326(-21737);
            if (class72.method458(var146, (byte) 60)) {
                class139.method907(-31912, var145, (var148 << 16) + var147);
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 10) {
            int var149 = class189.field3394.method1294((byte) 3);
            int var150 = class189.field3394.method1273(0);
            int var151 = class189.field3394.method1295(-1);
            if (class72.method458(var151, (byte) 60)) {
                if (var150 == 2) {
                    class224.method1525(false);
                }
                class186.field3353 = var149;
                class70.method446(-78, var149);
                class82.method553(-32768, false);
                class128.method834(class186.field3353, (byte) -109);
                for (int var152 = 0; var152 < 100; var152++) {
                    class21.field629[var152] = true;
                }
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 147) {
            for (int var153 = 0; var153 < class151.field2725.length; var153++) {
                if (class151.field2725[var153] != null) {
                    class151.field2725[var153].field4694 = -1;
                }
            }
            for (int var154 = 0; var154 < class31.field774.length; var154++) {
                if (class31.field774[var154] != null) {
                    class31.field774[var154].field4694 = -1;
                }
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 110) {
            long var155 = class189.field3394.method1274(-778468320);
            int var157 = class189.field3394.method1294((byte) 3);
            byte var158 = class189.field3394.method1281((byte) -110);
            boolean var159 = false;
            if ((var155 & Long.MIN_VALUE) != 0L) {
                var159 = true;
            }
            if (var159) {
                if (class196.field3545 == 0) {
                    class252.field4386 = -1;
                    return true;
                }
                long var165 = var155 & Long.MAX_VALUE;
                boolean var167 = false;
                int var168;
                for (var168 = 0; class196.field3545 > var168 && (class225.field3970[var168].field4226 != var165 || class225.field3970[var168].field407 != var157); var168++) {
                }
                if (class196.field3545 > var168) {
                    while (var168 < class196.field3545 - 1) {
                        class225.field3970[var168] = class225.field3970[var168 + 1];
                        var168++;
                    }
                    class196.field3545--;
                    class225.field3970[class196.field3545] = null;
                }
            } else {
                class263 var160 = class189.field3394.method1320(false);
                class18 var161 = new class18();
                var161.field4226 = var155;
                var161.field411 = class233.method1565(37, var161.field4226);
                var161.field409 = var160;
                var161.field414 = var158;
                var161.field407 = var157;
                int var162;
                for (var162 = class196.field3545 - 1; var162 >= 0; var162--) {
                    int var163 = class225.field3970[var162].field411.method1748((byte) -74, var161.field411);
                    if (var163 == 0) {
                        class225.field3970[var162].field407 = var157;
                        class225.field3970[var162].field414 = var158;
                        class225.field3970[var162].field409 = var160;
                        class252.field4386 = -1;
                        if (class60.field1234 == var155) {
                            class145.field2649 = var158;
                        }
                        class34.field811 = class112.field2108;
                        return true;
                    }
                    if (var163 < 0) {
                        break;
                    }
                }
                if (class225.field3970.length <= class196.field3545) {
                    class252.field4386 = -1;
                    return true;
                }
                for (int var164 = class196.field3545 - 1; var164 > var162; var164--) {
                    class225.field3970[var164 + 1] = class225.field3970[var164];
                }
                if (class196.field3545 == 0) {
                    class225.field3970 = new class18[100];
                }
                class225.field3970[var162 + 1] = var161;
                class196.field3545++;
                if (class60.field1234 == var155) {
                    class145.field2649 = var158;
                }
            }
            class34.field811 = class112.field2108;
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 156) {
            int var169 = class189.field3394.method1294((byte) 3);
            if (var169 == 65535) {
                var169 = -1;
            }
            int var170 = class189.field3394.method1294((byte) 3);
            if (var170 == 65535) {
                var170 = -1;
            }
            int var171 = class189.field3394.method1296(1534255384);
            int var172 = class189.field3394.method1266(4);
            int var173 = class189.field3394.method1295(-1);
            if (class72.method458(var173, (byte) 60)) {
                for (int var174 = var170; var174 <= var169; var174++) {
                    long var175 = ((long) var172 << 32) + (long) var174;
                    class241 var177 = class141.field2587.method31(-32665, var175);
                    if (var177 != null) {
                        var177.method1614(-1204826926);
                    }
                    class141.field2587.method33(new class182(var171), var175, -110);
                }
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 255) {
            int var178 = class189.field3394.method1306(-1);
            int var179 = class189.field3394.method1295(-1);
            int var180 = class189.field3394.method1283(123);
            if (class72.method458(var179, (byte) 60)) {
                class266 var181 = (class266) class212.field3797.method31(-32665, (long) var180);
                class266 var182 = (class266) class212.field3797.method31(-32665, (long) var178);
                if (var182 != null) {
                    class218.method1488(var182, var181 == null || var181.field4641 != var182.field4641, true);
                }
                if (var181 != null) {
                    var181.method1614(-1204826926);
                    class212.field3797.method33(var181, (long) var178, -123);
                }
                class21 var183 = class8.method55(65535, var180);
                if (var183 != null) {
                    class220.method1508(var183, (byte) -95);
                }
                class21 var184 = class8.method55(65535, var178);
                if (var184 != null) {
                    class220.method1508(var184, (byte) -106);
                    class225.method1532(true, var184, -1);
                }
                if (class186.field3353 != -1) {
                    class96.method670(class186.field3353, -5846, 1);
                }
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 121) {
            long var185 = class189.field3394.method1274(-778468320);
            class263 var187 = class65.method417(class109.method727(class189.field3394, 0).method1767((byte) -16));
            class120.method774(6, var187, -11292, class233.method1565(37, var185).method1761(122));
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 73) {
            int var188 = class189.field3394.method1301(-8317);
            int var189 = class189.field3394.method1301(-8317);
            int var190 = class189.field3394.method1294((byte) 3);
            int var191 = class189.field3394.method1301(-8317);
            int var192 = class189.field3394.method1301(-8317);
            class101.method683(128, var190, var191, var192, var188, var189);
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 52) {
            class77.method530(-84, class189.field3394.method1320(false));
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 62) {
            long var193 = class189.field3394.method1274(-778468320);
            int var195 = class189.field3394.method1294((byte) 3);
            class263 var196 = class173.method1139((byte) -90, var195).method639(-27737, class189.field3394);
            class48.method309(var196, 19, (byte) 7, class233.method1565(37, var193).method1761(122), (class263) null, var195);
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 230) {
            class216.method1466((byte) -72);
            class120.field2224 = class189.field3394.method1298((byte) -123);
            class252.field4386 = -1;
            class257.field4474 = class112.field2108;
            return true;
        } else if (class252.field4386 == 139) {
            int var197 = class189.field3394.method1283(117);
            class142.field2607 = class95.field1867.method1734(-23116, var197);
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 249) {
            byte[] var198 = new byte[class36.field826];
            class189.field3394.method1514(class36.field826, 0, var198, -4256);
            class263 var199 = class138.method903(-2378, class36.field826, var198, 0);
            if (class130.field2381 == null && class262.field4547 == 3 || !class262.field4551.startsWith("win") || class72.field1513) {
                class125.method802(var199, -112, true);
            } else {
                class29.field730 = true;
                class148.field2696 = var199;
                class68.field1380 = class95.field1867.method1725(new String(var199.method1753(-1), "ISO-8859-1"), true);
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 182) {
            int var200 = class189.field3394.method1301(-8317);
            int var201 = class189.field3394.method1301(-8317);
            int var202 = class189.field3394.method1301(-8317);
            int var203 = class189.field3394.method1301(-8317);
            int var204 = class189.field3394.method1294((byte) 3);
            class49.field1062[var200] = true;
            class50.field1064[var200] = var201;
            class165.field2998[var200] = var202;
            class208.field3770[var200] = var203;
            class161.field2944[var200] = var204;
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 235) {
            class205.method1420(class189.field3394, -26190, class95.field1867, class36.field826);
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 43) {
            int var205 = class189.field3394.method1269(-13208);
            int var206 = var205 >> 2;
            int var207 = var205 & 0x3;
            int var208 = class60.field1236[var206];
            int var209 = class189.field3394.method1294((byte) 3);
            int var210 = class189.field3394.method1306(-1);
            int var211 = var210 >> 14 & 0x3FFF;
            int var212 = var211 - class93.field1844;
            if (var209 == 65535) {
                var209 = -1;
            }
            int var213 = var210 & 0x3FFF;
            int var214 = var213 - class142.field2596;
            int var215 = (var210 & 0x36123415) >> 28;
            class44.method268(var206, var212, 96, var207, var214, var209, var215, var208);
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 34) {
            int var216 = class189.field3394.method1298((byte) -109);
            int var217 = class189.field3394.method1306(-1);
            int var218 = class189.field3394.method1294((byte) 3);
            if (class72.method458(var218, (byte) 60)) {
                class66.method429(var216, (byte) -127, var217);
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 40) {
            int var219 = class189.field3394.method1326(-21737);
            int var220 = class189.field3394.method1296(1534255384);
            int var221 = class189.field3394.method1326(-21737);
            if (class72.method458(var219, (byte) 60)) {
                class194.method1317(-103, var220, var221);
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 47) {
            class153.field2779 = class189.field3394.method1301(-8317);
            class268.field4722 = class189.field3394.method1301(-8317);
            for (int var222 = class153.field2779; var222 < class153.field2779 + 8; var222++) {
                for (int var224 = class268.field4722; var224 < class268.field4722 + 8; var224++) {
                    if (class107.field2020[class12.field321][var222][var224] != null) {
                        class107.field2020[class12.field321][var222][var224] = null;
                        class184.method1217(1610612736, var222, var224);
                    }
                }
            }
            for (class173 var223 = (class173) class189.field3408.method1878(true); var223 != null; var223 = (class173) class189.field3408.method1881(-101)) {
                if (var223.field3149 >= class153.field2779 && (class153.field2779 + 8) > var223.field3149 && class268.field4722 <= var223.field3140 && (class268.field4722 + 8) > var223.field3140 && class12.field321 == var223.field3151) {
                    var223.field3145 = 0;
                }
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 142) {
            class34.field811 = class112.field2108;
            long var225 = class189.field3394.method1274(-778468320);
            if (var225 == 0L) {
                class214.field3802 = null;
                class8.field146 = null;
                class252.field4386 = -1;
                class225.field3970 = null;
                class196.field3545 = 0;
                return true;
            }
            long var227 = class189.field3394.method1274(-778468320);
            class8.field146 = class233.method1565(37, var227);
            class214.field3802 = class233.method1565(37, var225);
            class240.field4225 = class189.field3394.method1281((byte) 123);
            int var229 = class189.field3394.method1301(-8317);
            if (var229 == 255) {
                class252.field4386 = -1;
                return true;
            }
            class196.field3545 = var229;
            class18[] var230 = new class18[100];
            for (int var231 = 0; var231 < class196.field3545; var231++) {
                var230[var231] = new class18();
                var230[var231].field4226 = class189.field3394.method1274(-778468320);
                var230[var231].field411 = class233.method1565(37, var230[var231].field4226);
                var230[var231].field407 = class189.field3394.method1294((byte) 3);
                var230[var231].field414 = class189.field3394.method1281((byte) -61);
                var230[var231].field409 = class189.field3394.method1320(false);
                if (class60.field1234 == var230[var231].field4226) {
                    class145.field2649 = var230[var231].field414;
                }
            }
            int var232 = class196.field3545;
            boolean var233 = false;
            while (var232 > 0) {
                boolean var234 = true;
                var232--;
                for (int var235 = 0; var235 < var232; var235++) {
                    if (var230[var235].field411.method1748((byte) -14, var230[var235 + 1].field411) > 0) {
                        var234 = false;
                        class18 var236 = var230[var235];
                        var230[var235] = var230[var235 + 1];
                        var230[var235 + 1] = var236;
                    }
                }
                if (var234) {
                    break;
                }
            }
            class252.field4386 = -1;
            class225.field3970 = var230;
            return true;
        } else if (class252.field4386 == 215) {
            int var237 = class189.field3394.method1282(false);
            int var238 = class189.field3394.method1294((byte) 3);
            int var239 = class189.field3394.method1266(4);
            int var240 = class189.field3394.method1279(false);
            if (class72.method458(var238, (byte) 60)) {
                class266 var241 = (class266) class212.field3797.method31(-32665, (long) var239);
                if (var241 != null) {
                    class218.method1488(var241, var241.field4641 != var237, true);
                }
                class127.method823(var240, var239, (byte) -57, var237);
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 136) {
            class144.method953(false, (byte) 121);
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 20) {
            class121.method786(class189.field3394, (byte) 108);
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 104) {
            int var242 = class189.field3394.method1326(-21737);
            byte var243 = class189.field3394.method1314(65536);
            class161.method1060(var243, -101, var242);
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 49) {
            for (int var244 = 0; var244 < class48.field1038.length; var244++) {
                if (class48.field1038[var244] != class154.field2787[var244]) {
                    class48.field1038[var244] = class154.field2787[var244];
                    class233.method1568(var244, -82);
                    class245.field4313[class263.method1777(class179.field3277++, 31)] = var244;
                }
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 88) {
            class252.field4386 = -1;
            class105.field1988 = 0;
            return true;
        } else if (class252.field4386 == 219) {
            int var245 = class189.field3394.method1306(-1);
            int var246 = class189.field3394.method1295(-1);
            class195.method1332(var246, true, var245);
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 103) {
            int var247 = class189.field3394.method1294((byte) 3);
            int var248 = class189.field3394.method1301(-8317);
            int var249 = class189.field3394.method1295(-1);
            class90 var250 = class31.field774[var249];
            if (var250 != null) {
                class168.method1114(var250, -106, var247, var248);
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 33) {
            class164.method1083((byte) -126);
            class252.field4386 = -1;
            return false;
        } else if (class252.field4386 == 150) {
            class216.method1466((byte) -95);
            int var251 = class189.field3394.method1266(4);
            int var252 = class189.field3394.method1301(-8317);
            int var253 = class189.field3394.method1279(false);
            class276.field4829[var252] = var251;
            class251.field4369[var252] = var253;
            class73.field1541[var252] = 1;
            for (int var254 = 0; var254 < 98; var254++) {
                if (var251 >= client.field2767[var254]) {
                    class73.field1541[var252] = var254 + 2;
                }
            }
            class83.field1648[class263.method1777(31, class212.field3796++)] = var252;
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 25) {
            class254.field4424 = class189.field3394.method1294((byte) 3) * 30;
            class257.field4474 = class112.field2108;
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 130) {
            int var255 = class189.field3394.method1294((byte) 3);
            int var256 = class189.field3394.method1294((byte) 3);
            class241.field4230 = var255;
            class256.field4464 = var256;
            class9.method69((byte) -116);
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 69) {
            int var257 = class189.field3394.method1306(-1);
            int var258 = class189.field3394.method1294((byte) 3);
            class161.method1060(var257, -101, var258);
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 143) {
            int var259 = class189.field3394.method1266(4);
            int var260 = class189.field3394.method1294((byte) 3);
            if (var259 < -70000) {
                var260 += 32768;
            }
            class21 var261;
            if (var259 >= 0) {
                var261 = class8.method55(65535, var259);
            } else {
                var261 = null;
            }
            while (class36.field826 > class189.field3394.field3497) {
                int var262 = 0;
                int var263 = class189.field3394.method1311(31);
                int var264 = class189.field3394.method1294((byte) 3);
                if (var264 != 0) {
                    var262 = class189.field3394.method1301(-8317);
                    if (var262 == 255) {
                        var262 = class189.field3394.method1266(4);
                    }
                }
                if (var261 != null && var263 >= 0 && var263 < var261.field469.length) {
                    var261.field469[var263] = var264;
                    var261.field618[var263] = var262;
                }
                class125.method804(var264 - 1, var260, -1, var262, var263);
            }
            if (var261 != null) {
                class220.method1508(var261, (byte) -123);
            }
            class216.method1466((byte) -73);
            class127.field2362[class263.method1777(31, class119.field2211++)] = class263.method1777(32767, var260);
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 183) {
            class159.field2900 = class189.field3394.method1301(-8317);
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 79) {
            class60.field1232 = class189.field3394.method1301(-8317);
            class252.field4386 = -1;
            class75.field1558 = class112.field2108;
            return true;
        } else if (class252.field4386 == 239) {
            long var265 = class189.field3394.method1274(-778468320);
            long var267 = (long) class189.field3394.method1294((byte) 3);
            long var269 = (long) class189.field3394.method1277((byte) 40);
            long var271 = (var267 << 32) + var269;
            int var273 = class189.field3394.method1301(-8317);
            boolean var274 = false;
            int var275 = 0;
            label1378: while (true) {
                if (var275 >= 100) {
                    if (var273 <= 1) {
                        if ((!class156.field2806 || class85.field1670) && !class134.field2451) {
                            for (int var276 = 0; var276 < class31.field785; var276++) {
                                if (class41.field909[var276] == var265) {
                                    var274 = true;
                                    break label1378;
                                }
                            }
                        } else {
                            var274 = true;
                        }
                    }
                    break;
                }
                if (class41.field914[var275] == var271) {
                    var274 = true;
                    break;
                }
                var275++;
            }
            if (!var274 && class4.field79 == 0) {
                class41.field914[class122.field2271] = var271;
                class122.field2271 = (class122.field2271 + 1) % 100;
                class263 var277 = class65.method417(class109.method727(class189.field3394, 0).method1767((byte) -16));
                if (var273 == 2 || var273 == 3) {
                    class120.method774(7, var277, -11292, class124.method797(-61, new class263[] { class195.field3532, class233.method1565(37, var265).method1761(122) }));
                } else if (var273 == 1) {
                    class120.method774(7, var277, -11292, class124.method797(-96, new class263[] { class194.field3466, class233.method1565(37, var265).method1761(122) }));
                } else {
                    class120.method774(3, var277, -11292, class233.method1565(37, var265).method1761(122));
                }
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 141) {
            if (class36.field826 == 0) {
                class66.field1346 = class186.field3361;
            } else {
                class66.field1346 = class189.field3394.method1320(false);
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 58) {
            int var278 = class189.field3394.method1294((byte) 3);
            class148.method966(18, var278);
            class127.field2362[class263.method1777(class119.field2211++, 31)] = class263.method1777(32767, var278);
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 146) {
            if (class186.field3353 != -1) {
                class96.method670(class186.field3353, -5846, 0);
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 77) {
            int var279 = class189.field3394.method1326(-21737);
            if (var279 == 65535) {
                var279 = -1;
            }
            class198.method1347(0, var279);
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 225) {
            int var280 = class189.field3394.method1294((byte) 3);
            if (var280 == 65535) {
                var280 = -1;
            }
            int var281 = class189.field3394.method1310(3);
            class2.method12(var281, var280, 126);
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 36) {
            class153.field2779 = class189.field3394.method1279(false);
            class268.field4722 = class189.field3394.method1273(0);
            while (class189.field3394.field3497 < class36.field826) {
                class252.field4386 = class189.field3394.method1301(-8317);
                class171.method1129(-105);
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 90) {
            int var282 = class189.field3394.method1295(-1);
            int var283 = class189.field3394.method1266(4);
            int var284 = class189.field3394.method1269(-13208);
            if (class72.method458(var282, (byte) 60)) {
                class122.method789(var283, var284, 7);
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 51) {
            class263 var285 = class189.field3394.method1320(false);
            int var286 = class189.field3394.method1296(1534255384);
            int var287 = class189.field3394.method1282(false);
            if (class72.method458(var287, (byte) 60)) {
                class114.method743((byte) -123, var286, var285);
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 206) {
            int var288 = class189.field3394.method1294((byte) 3);
            int var289 = class189.field3394.method1326(-21737);
            class263 var290 = class189.field3394.method1320(false);
            if (class72.method458(var289, (byte) 60)) {
                class111.method729(var288, -4, var290);
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 128) {
            int var291 = class189.field3394.method1301(-8317);
            if (class189.field3394.method1301(-8317) == 0) {
                class238.field4148[var291] = new class144();
            } else {
                class189.field3394.field3497--;
                class238.field4148[var291] = new class144(class189.field3394);
            }
            class54.field1143 = class112.field2108;
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 194) {
            long var292 = class189.field3394.method1274(-778468320);
            class189.field3394.method1281((byte) 124);
            long var294 = class189.field3394.method1274(-778468320);
            long var296 = (long) class189.field3394.method1294((byte) 3);
            long var298 = (long) class189.field3394.method1277((byte) -107);
            int var300 = class189.field3394.method1301(-8317);
            long var301 = (var296 << 32) + var298;
            int var303 = class189.field3394.method1294((byte) 3);
            boolean var304 = false;
            int var305 = 0;
            label1409: while (true) {
                if (var305 >= 100) {
                    if (var300 <= 1) {
                        for (int var306 = 0; var306 < class31.field785; var306++) {
                            if (class41.field909[var306] == var292) {
                                var304 = true;
                                break label1409;
                            }
                        }
                    }
                    break;
                }
                if (class41.field914[var305] == var301) {
                    var304 = true;
                    break;
                }
                var305++;
            }
            if (!var304 && class4.field79 == 0) {
                class41.field914[class122.field2271] = var301;
                class122.field2271 = (class122.field2271 + 1) % 100;
                class263 var307 = class173.method1139((byte) -90, var303).method639(-27737, class189.field3394);
                if (var300 == 2 || var300 == 3) {
                    class48.method309(var307, 20, (byte) 7, class124.method797(-61, new class263[] { class195.field3532, class233.method1565(37, var292).method1761(122) }), class233.method1565(37, var294).method1761(122), var303);
                } else if (var300 == 1) {
                    class48.method309(var307, 20, (byte) 7, class124.method797(-107, new class263[] { class194.field3466, class233.method1565(37, var292).method1761(122) }), class233.method1565(37, var294).method1761(122), var303);
                } else {
                    class48.method309(var307, 20, (byte) 7, class233.method1565(37, var292).method1761(122), class233.method1565(37, var294).method1761(122), var303);
                }
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 2) {
            class31.field785 = class36.field826 / 8;
            for (int var308 = 0; var308 < class31.field785; var308++) {
                class41.field909[var308] = class189.field3394.method1274(-778468320);
                class98.field1879[var308] = class233.method1565(37, class41.field909[var308]);
            }
            class252.field4386 = -1;
            class75.field1558 = class112.field2108;
            return true;
        } else if (class252.field4386 == 71) {
            int var309 = class189.field3394.method1269(-13208);
            int var310 = class189.field3394.method1295(-1);
            class195.method1332(var310, true, var309);
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 118) {
            class144.method953(true, (byte) 121);
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 221) {
            class153.field2779 = class189.field3394.method1273(0);
            class268.field4722 = class189.field3394.method1301(-8317);
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 84) {
            class269.method1816((byte) 100);
            class216.method1466((byte) -47);
            class179.field3277 += 32;
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 158) {
            int var311 = class189.field3394.method1296(1534255384);
            int var312 = class189.field3394.method1326(-21737);
            if (class72.method458(var312, (byte) 60)) {
                int var313 = 0;
                if (class229.field4018.field2525 != null) {
                    var313 = class229.field4018.field2525.method138(8);
                }
                class32.method212(var311, 674, 3, var313);
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 125) {
            int var314 = class189.field3394.method1294((byte) 3);
            int var315 = class189.field3394.method1301(-8317);
            if (var314 == 65535) {
                var314 = -1;
            }
            int var316 = class189.field3394.method1294((byte) 3);
            class95.method665(0, var314, var316, var315);
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 56) {
            int var317 = class189.field3394.method1296(1534255384);
            int var318 = class189.field3394.method1296(1534255384);
            int var319 = class189.field3394.method1294((byte) 3);
            int var320 = class189.field3394.method1295(-1);
            if (var320 == 65535) {
                var320 = -1;
            }
            if (class72.method458(var319, (byte) 60)) {
                class21 var321 = class8.method55(65535, var318);
                if (var321.field573) {
                    class142.method942(var317, var318, var320, 64);
                    class72 var322 = class92.method649(-32508, var320);
                    class190.method1246(var322.field1492, var322.field1459, var322.field1448, var318, -104);
                    class120.method773(var322.field1456, false, var322.field1440, var322.field1505, var318);
                } else if (var320 == -1) {
                    var321.field481 = 0;
                    class252.field4386 = -1;
                    return true;
                } else {
                    class72 var323 = class92.method649(-32508, var320);
                    var321.field594 = var320;
                    var321.field587 = var323.field1448 * 100 / var317;
                    var321.field588 = var323.field1492;
                    var321.field495 = var323.field1459;
                    var321.field481 = 4;
                    class220.method1508(var321, (byte) -59);
                }
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 159) {
            int var324 = class189.field3394.method1306(-1);
            int var325 = class189.field3394.method1294((byte) 3);
            int var326 = class189.field3394.method1282(false);
            if (class72.method458(var325, (byte) 60)) {
                class188.method1232(-28330, var324, var326);
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 135) {
            int var327 = class189.field3394.method1294((byte) 3);
            class263 var328 = class189.field3394.method1320(false);
            Object[] var329 = new Object[var328.method1740(-124) + 1];
            for (int var330 = var328.method1740(-124) - 1; var330 >= 0; var330--) {
                if (var328.method1784(var330, 121) == 115) {
                    var329[var330 + 1] = class189.field3394.method1320(false);
                } else {
                    var329[var330 + 1] = Integer.valueOf(class189.field3394.method1266(4));
                }
            }
            var329[0] = Integer.valueOf(class189.field3394.method1266(4));
            if (class72.method458(var327, (byte) 60)) {
                class116 var331 = new class116();
                var331.field2173 = var329;
                class182.method1211(var331, 105);
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 209) {
            int var332 = class189.field3394.method1301(-8317);
            int var333 = class189.field3394.method1301(-8317);
            int var334 = class189.field3394.method1294((byte) 3);
            int var335 = class189.field3394.method1301(-8317);
            int var336 = class189.field3394.method1301(-8317);
            class105.method708(var336, true, var334, var335, (byte) -84, var333, var332);
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 117) {
            int var337 = class189.field3394.method1282(false);
            int var338 = class189.field3394.method1296(1534255384);
            int var339 = class189.field3394.method1309(255);
            int var340 = class189.field3394.method1313(255);
            if (class72.method458(var337, (byte) 60)) {
                class162.method1067(var340, var338, 123, var339);
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 137) {
            class218.method1484(74);
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 21) {
            int var341 = class189.field3394.method1282(false);
            if (var341 == 65535) {
                var341 = -1;
            }
            int var342 = class189.field3394.method1294((byte) 3);
            int var343 = class189.field3394.method1296(1534255384);
            if (class72.method458(var342, (byte) 60)) {
                class32.method212(var343, 674, 1, var341);
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 94) {
            int var344 = class189.field3394.method1294((byte) 3);
            int var345 = class189.field3394.method1295(-1);
            int var346 = class189.field3394.method1279(false);
            if (class72.method458(var344, (byte) 60)) {
                class220.method1504(var345, true, var346);
            }
            class252.field4386 = -1;
            return true;
        } else if (class252.field4386 == 60) {
            int var347 = class189.field3394.method1295(-1);
            int var348 = class189.field3394.method1266(4);
            int var349 = class189.field3394.method1295(-1);
            int var350 = class189.field3394.method1326(-21737);
            int var351 = class189.field3394.method1294((byte) 3);
            if (class72.method458(var347, (byte) 60)) {
                class190.method1246(var350, var351, var349, var348, -105);
            }
            class252.field4386 = -1;
            return true;
        } else {
            class137.method899((Throwable) null, "T1 - " + class252.field4386 + "," + class131.field2403 + "," + class272.field4790 + " - " + class36.field826, 46);
            class164.method1083((byte) -124);
            return true;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static void method1597(int arg0) {
        if (arg0 < -61) {
            field4182 = null;
            field4169 = null;
            field4180 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)I")
    public static final int method1598(int arg0, boolean arg1) {
        field4174++;
        int var2 = 0;
        if (!arg1) {
            field4175 = -13;
        }
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= 256) {
            arg0 >>>= 0x8;
            var2 += 8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
    public static final void method1599(int arg0) {
        if (class30.field745 != null) {
            class30.field745.method1571((byte) 51);
        }
        field4191++;
        if (class93.field1843 != null) {
            class93.field1843.method1571((byte) 51);
        }
        class233.method1567(2, 22050, -116, class253.field4397);
        if (arg0 == -1) {
            class30.field745 = class24.method181(class202.field3648, arg0 + 257, 0, class95.field1867, 22050);
            class30.field745.method1572(class46.field1000, true);
            class93.field1843 = class24.method181(class202.field3648, 256, 1, class95.field1867, 2048);
            class93.field1843.method1572(class43.field933, true);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Loh;")
    public static final class263 method1600(int arg0, int arg1) {
        field4188++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException();
        }
        class263 var2 = new class263();
        var2.field4605 = new byte[1];
        if (arg0 < 103) {
            method1601((byte) -13, 112, -19, (Component) null);
        }
        var2.field4605[0] = (byte) arg1;
        var2.field4591 = 1;
        return var2;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BIILjava/awt/Component;)Lmg;")
    public static final class254 method1601(byte arg0, int arg1, int arg2, Component arg3) {
        field4190++;
        try {
            Class var4 = Class.forName("ka");
            class254 var5 = (class254) var4.getDeclaredConstructor().newInstance();
            var5.method608(arg3, arg1, true, arg2);
            int var6 = 119 % ((46 - arg0) / 49);
            return var5;
        } catch (Throwable var8) {
            class87 var7 = new class87();
            var7.method608(arg3, arg1, true, arg2);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([BB)V")
    private final void method1602(byte[] arg0, byte arg1) {
        field4186++;
        class194 var3 = new class194(class255.method1694(arg0, 323));
        int var4 = var3.method1301(-8317);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field4185 = 0;
        } else {
            this.field4185 = var3.method1266(4);
        }
        int var5 = 0;
        int var6 = -1;
        if (arg1 > -63) {
            return;
        }
        int var7 = var3.method1301(-8317);
        this.field4178 = var3.method1294((byte) 3);
        this.field4176 = new int[this.field4178];
        for (int var8 = 0; var8 < this.field4178; var8++) {
            this.field4176[var8] = var5 += var3.method1294((byte) 3);
            if (var6 < this.field4176[var8]) {
                var6 = this.field4176[var8];
            }
        }
        this.field4173 = var6 + 1;
        this.field4184 = new int[this.field4173];
        this.field4167 = new int[this.field4173];
        this.field4170 = new int[this.field4173];
        this.field4181 = new int[this.field4173][];
        this.field4171 = new int[this.field4173];
        if (var7 != 0) {
            this.field4189 = new int[this.field4173];
            for (int var9 = 0; var9 < this.field4173; var9++) {
                this.field4189[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field4178; var10++) {
                this.field4189[this.field4176[var10]] = var3.method1266(4);
            }
            this.field4179 = new class126(this.field4189);
        }
        for (int var11 = 0; var11 < this.field4178; var11++) {
            this.field4171[this.field4176[var11]] = var3.method1266(4);
        }
        for (int var12 = 0; var12 < this.field4178; var12++) {
            this.field4170[this.field4176[var12]] = var3.method1266(4);
        }
        for (int var13 = 0; var13 < this.field4178; var13++) {
            this.field4184[this.field4176[var13]] = var3.method1294((byte) 3);
        }
        for (int var14 = 0; var14 < this.field4178; var14++) {
            int var21 = 0;
            int var22 = this.field4176[var14];
            int var23 = -1;
            int var24 = this.field4184[var22];
            this.field4181[var22] = new int[var24];
            for (int var25 = 0; var25 < var24; var25++) {
                int var26 = this.field4181[var22][var25] = var21 += var3.method1294((byte) 3);
                if (var26 > var23) {
                    var23 = var26;
                }
            }
            this.field4167[var22] = var23 + 1;
            if ((var23 + 1) == var24) {
                this.field4181[var22] = null;
            }
        }
        if (var7 == 0) {
            return;
        }
        this.field4187 = new int[var6 + 1][];
        this.field4177 = new class126[var6 + 1];
        for (int var15 = 0; var15 < this.field4178; var15++) {
            int var16 = this.field4176[var15];
            int var17 = this.field4184[var16];
            this.field4187[var16] = new int[this.field4167[var16]];
            for (int var18 = 0; var18 < this.field4167[var16]; var18++) {
                this.field4187[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field4181[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field4181[var16][var19];
                }
                this.field4187[var16][var20] = var3.method1266(4);
            }
            this.field4177[var16] = new class126(this.field4187[var16]);
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "([BI)V")
    public class239(byte[] arg0, int arg1) {
        this.field4183 = class219.method1493(arg0, arg0.length, 0);
        if (this.field4183 != arg1) {
            throw new RuntimeException();
        }
        this.method1602(arg0, (byte) -102);
    }
}
