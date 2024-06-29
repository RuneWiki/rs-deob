import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class113 {

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    private int field1937 = -1;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "I")
    private int field1953 = 0;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "Lsj;")
    private class48 field1949 = new class48();

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "Z")
    public boolean field1954 = false;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    private int field1935;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    private int field1934;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "[Lik;")
    private class232[] field1946;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "[[[I")
    private int[][][] field1942;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
    public static int field1944 = -1;

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "[Lhi;")
    public static class264[] field1952 = new class264[2048];

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "Leg;")
    public static class272 field1936 = new class272(5);

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "[Leb;")
    public static class103[] field1955;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)Z")
    public static final boolean method810(int arg0) throws IOException {
        field1950++;
        if (class149.field2395 == null) {
            return false;
        }
        int var1 = class149.field2395.method1274(29491);
        if (var1 == 0) {
            return false;
        }
        if (class51.field719 == -1) {
            var1--;
            class149.field2395.method1275(1, class166.field2709.field4198, 12267, 0);
            class166.field2709.field4195 = 0;
            class51.field719 = class166.field2709.method1232(-6);
            class73.field1001 = class195.field3160[class51.field719];
        }
        if (class73.field1001 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class149.field2395.method1275(1, class166.field2709.field4198, 12267, 0);
            class73.field1001 = class166.field2709.field4198[0] & 0xFF;
        }
        if (class73.field1001 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class149.field2395.method1275(2, class166.field2709.field4198, 12267, 0);
            class166.field2709.field4195 = 0;
            class73.field1001 = class166.field2709.method1777(-109);
            var1 -= 2;
        }
        if (class73.field1001 > var1) {
            return false;
        }
        class166.field2709.field4195 = 0;
        class149.field2395.method1275(class73.field1001, class166.field2709.field4198, 12267, 0);
        class220.field3519 = class121.field2038;
        class121.field2038 = class162.field2626;
        class189.field3025 = 0;
        class162.field2626 = class51.field719;
        if (class51.field719 == 139) {
            class129.field2159 = class166.field2709.method1774(125);
            class105.field1808 = class166.field2709.method1774(123);
            while (class166.field2709.field4195 < class73.field1001) {
                class51.field719 = class166.field2709.method1779(-87);
                class223.method1479(true);
            }
            class51.field719 = -1;
            return true;
        } else if (class51.field719 == 12) {
            int var2 = class166.field2709.method1777(-124);
            int var3 = class166.field2709.method1777(-57);
            if (var3 == 65535) {
                var3 = -1;
            }
            int var4 = class166.field2709.method1790((byte) -19);
            if (class274.method1846(var2, (byte) 94)) {
                class193.method1303(-1, 2, var4, -1, var3);
            }
            class51.field719 = -1;
            return true;
        } else if (class51.field719 == 58) {
            int var5 = class166.field2709.method1730((byte) -100);
            int var6 = class166.field2709.method1749((byte) -62);
            int var7 = class166.field2709.method1743((byte) 21);
            class275 var8 = class198.field3193[var6];
            if (var8 != null) {
                class199.method1344(var5, (byte) 29, var7, var8);
            }
            class51.field719 = -1;
            return true;
        } else if (class51.field719 == 154) {
            int var9 = class166.field2709.method1777(-76);
            int var10 = class166.field2709.method1779(-105);
            int var11 = class166.field2709.method1779(-53);
            int var12 = class166.field2709.method1779(-116);
            int var13 = class166.field2709.method1779(-104);
            int var14 = class166.field2709.method1777(-65);
            if (class274.method1846(var9, (byte) 109)) {
                class66.field944[var10] = true;
                class230.field3655[var10] = var11;
                class238.field3800[var10] = var12;
                class164.field2666[var10] = var13;
                class196.field3162[var10] = var14;
            }
            class51.field719 = -1;
            return true;
        } else if (class51.field719 == 99) {
            int var15 = class166.field2709.method1749((byte) -100);
            int var16 = class166.field2709.method1786(1233508208);
            String var17 = class166.field2709.method1750((byte) -81);
            if (class274.method1846(var16, (byte) 87)) {
                class241.method1589(true, var15, var17);
            }
            class51.field719 = -1;
            return true;
        } else if (class51.field719 == 153 || class51.field719 == 46 || class51.field719 == 142 || class51.field719 == 194 || class51.field719 == 117 || class51.field719 == 36 || class51.field719 == 47 || class51.field719 == 233 || class51.field719 == 207 || class51.field719 == 147 || class51.field719 == 64 || class51.field719 == 218 || class51.field719 == 250 || class51.field719 == 78) {
            class223.method1479(true);
            class51.field719 = -1;
            return true;
        } else if (class51.field719 == 71) {
            long var18 = class166.field2709.method1740((byte) 126);
            int var20 = class166.field2709.method1777(-123);
            int var21 = class166.field2709.method1779(-91);
            boolean var22 = true;
            if (var18 < 0L) {
                var18 &= Long.MAX_VALUE;
                var22 = false;
            }
            String var23 = "";
            if (var20 > 0) {
                var23 = class166.field2709.method1750((byte) 115);
            }
            String var24 = class94.method659(var18, (byte) -103);
            for (int var25 = 0; var25 < class264.field4224; var25++) {
                if (class266.field4313[var25] == var18) {
                    if (class151.field2430[var25] != var20) {
                        class151.field2430[var25] = var20;
                        if (var20 > 0) {
                            class297.method1986(5, "", true, var24 + class201.field3234);
                        }
                        if (var20 == 0) {
                            class297.method1986(5, "", true, var24 + class104.field1732);
                        }
                    }
                    var24 = null;
                    class160.field2598[var25] = var23;
                    class171.field2758[var25] = var21;
                    class127.field2133[var25] = var22;
                    break;
                }
            }
            if (var24 != null && class264.field4224 < 200) {
                class266.field4313[class264.field4224] = var18;
                class28.field338[class264.field4224] = var24;
                class151.field2430[class264.field4224] = var20;
                class160.field2598[class264.field4224] = var23;
                class171.field2758[class264.field4224] = var21;
                class127.field2133[class264.field4224] = var22;
                class264.field4224++;
            }
            class204.field3273 = class64.field906;
            boolean var26 = false;
            int var27 = class264.field4224;
            while (var27 > 0) {
                var27--;
                boolean var28 = true;
                for (int var29 = 0; var29 < var27; var29++) {
                    if (class151.field2430[var29] != class125.field2088 && class151.field2430[var29 + 1] == class125.field2088 || class151.field2430[var29] == 0 && class151.field2430[var29 + 1] != 0) {
                        var28 = false;
                        int var30 = class151.field2430[var29];
                        class151.field2430[var29] = class151.field2430[var29 + 1];
                        class151.field2430[var29 + 1] = var30;
                        String var31 = class160.field2598[var29];
                        class160.field2598[var29] = class160.field2598[var29 + 1];
                        class160.field2598[var29 + 1] = var31;
                        String var32 = class28.field338[var29];
                        class28.field338[var29] = class28.field338[var29 + 1];
                        class28.field338[var29 + 1] = var32;
                        long var33 = class266.field4313[var29];
                        class266.field4313[var29] = class266.field4313[var29 + 1];
                        class266.field4313[var29 + 1] = var33;
                        int var35 = class171.field2758[var29];
                        class171.field2758[var29] = class171.field2758[var29 + 1];
                        class171.field2758[var29 + 1] = var35;
                        boolean var36 = class127.field2133[var29];
                        class127.field2133[var29] = class127.field2133[var29 + 1];
                        class127.field2133[var29 + 1] = var36;
                    }
                }
                if (var28) {
                    break;
                }
            }
            class51.field719 = -1;
            return true;
        } else if (class51.field719 == 2) {
            int var37 = class166.field2709.method1766((byte) -59);
            int var38 = class166.field2709.method1777(-60);
            class273.method1841(var38, 4547, var37);
            class51.field719 = -1;
            return true;
        } else if (class51.field719 == 87) {
            long var39 = class166.field2709.method1740((byte) 126);
            class166.field2709.method1767(16711680);
            long var41 = class166.field2709.method1740((byte) 126);
            long var43 = (long) class166.field2709.method1777(-46);
            long var45 = (long) class166.field2709.method1732(114);
            long var47 = (var43 << 32) + var45;
            boolean var49 = false;
            int var50 = class166.field2709.method1779(-112);
            int var51 = class166.field2709.method1777(-110);
            int var52 = 0;
            label1233: while (true) {
                if (var52 >= 100) {
                    if (var50 <= 1) {
                        for (int var53 = 0; var53 < class33.field399; var53++) {
                            if (class140.field2301[var53] == var39) {
                                var49 = true;
                                break label1233;
                            }
                        }
                    }
                    break;
                }
                if (class283.field4520[var52] == var47) {
                    var49 = true;
                    break;
                }
                var52++;
            }
            if (!var49 && class251.field4025 == 0) {
                class283.field4520[class11.field152] = var47;
                class11.field152 = (class11.field152 + 1) % 100;
                String var54 = class266.method1805((byte) -41, var51).method1611(class166.field2709, (byte) 66);
                if (var50 == 2 || var50 == 3) {
                    class244.method1604(class94.method659(var41, (byte) -103), var54, (byte) -106, "<img=1>" + class94.method659(var39, (byte) -103), var51, 20);
                } else if (var50 == 1) {
                    class244.method1604(class94.method659(var41, (byte) -103), var54, (byte) -72, "<img=0>" + class94.method659(var39, (byte) -103), var51, 20);
                } else {
                    class244.method1604(class94.method659(var41, (byte) -103), var54, (byte) -119, class94.method659(var39, (byte) -103), var51, 20);
                }
            }
            class51.field719 = -1;
            return true;
        } else if (class51.field719 == 197) {
            int var55 = class166.field2709.method1749((byte) -17);
            int var56 = class166.field2709.method1784(79);
            int var57 = class166.field2709.method1777(-120);
            if (class274.method1846(var57, (byte) 126)) {
                class286.method1918(-126, var55, var56);
            }
            class51.field719 = -1;
            return true;
        } else if (class51.field719 == 160) {
            int var58 = class166.field2709.method1730((byte) -117);
            if (var58 == 65535) {
                var58 = -1;
            }
            int var59 = class166.field2709.method1784(110);
            int var60 = class166.field2709.method1730((byte) -122);
            if (class274.method1846(var60, (byte) 96)) {
                class193.method1303(-1, 1, var59, -1, var58);
            }
            class51.field719 = -1;
            return true;
        } else if (class51.field719 == 198) {
            class127.method883(class166.field2709.method1750((byte) -92), (byte) 97);
            class51.field719 = -1;
            return true;
        } else if (class51.field719 == 35) {
            int var61 = class166.field2709.method1786(1233508208);
            int var62 = class166.field2709.method1765((byte) 94);
            if (class274.method1846(var61, (byte) 47)) {
                int var63 = 0;
                if (class197.field3179.field3746 != null) {
                    var63 = class197.field3179.field3746.method683(-103);
                }
                class193.method1303(-1, 3, var62, -1, var63);
            }
            class51.field719 = -1;
            return true;
        } else if (class51.field719 == 155) {
            byte[] var64 = new byte[class73.field1001];
            class166.field2709.method1236(class73.field1001, 88, var64, 0);
            String var65 = class34.method235(var64, 0, false, class73.field1001);
            if (class284.field4537 == null && class255.field4071 == 3 || !class255.field4084.startsWith("win") || class274.field4421) {
                class263.method1726(var65, true, -17137);
            } else {
                class133.field2206 = var65;
                class70.field966 = true;
                class82.field1146 = class250.field4006.method1674(0, var65);
            }
            class51.field719 = -1;
            return true;
        } else if (class51.field719 == 56) {
            class127.method886(-117, true);
            class51.field719 = -1;
            return true;
        } else if (class51.field719 == 4) {
            int var66 = class166.field2709.method1777(-69);
            if (class274.method1846(var66, (byte) 46)) {
                class249.method1646(0);
            }
            class51.field719 = -1;
            return true;
        } else if (class51.field719 == 159) {
            class130.method902(98);
            class51.field719 = -1;
            return true;
        } else if (class51.field719 == 243) {
            int var67 = class166.field2709.method1765((byte) 119);
            int var68 = class166.field2709.method1777(-88);
            class103 var69;
            if (var67 < 0) {
                var69 = null;
            } else {
                var69 = class168.method1180(8931, var67);
            }
            if (var67 < -70000) {
                var68 += 32768;
            }
            while (class73.field1001 > class166.field2709.field4195) {
                int var70 = class166.field2709.method1729(false);
                int var71 = class166.field2709.method1777(-112);
                int var72 = 0;
                if (var71 != 0) {
                    var72 = class166.field2709.method1779(-77);
                    if (var72 == 255) {
                        var72 = class166.field2709.method1765((byte) 93);
                    }
                }
                if (var69 != null && var70 >= 0 && var70 < var69.field1547.length) {
                    var69.field1547[var70] = var71;
                    var69.field1592[var70] = var72;
                }
                class96.method686(var70, var68, var71 - 1, var72, (byte) 36);
            }
            if (var69 != null) {
                class45.method346((byte) 103, var69);
            }
            class185.method1267(119);
            class273.field4416[class204.method1369(class218.field3484++, 31)] = class204.method1369(var68, 32767);
            class51.field719 = -1;
            return true;
        } else if (class51.field719 == 196) {
            int var73 = class166.field2709.method1790((byte) -19);
            int var74 = class166.field2709.method1730((byte) -121);
            int var75 = class166.field2709.method1766((byte) -59);
            if (class274.method1846(var74, (byte) 81)) {
                class128 var76 = (class128) class294.field4656.method457((long) var75, (byte) -115);
                class128 var77 = (class128) class294.field4656.method457((long) var73, (byte) -115);
                if (var77 != null) {
                    class290.method1943(var77, var76 == null || var76.field2135 != var77.field2135, 91);
                }
                if (var76 != null) {
                    var76.method544(-98);
                    class294.field4656.method466((long) var73, var76, (byte) 93);
                }
                class103 var78 = class168.method1180(8931, var75);
                if (var78 != null) {
                    class45.method346((byte) 46, var78);
                }
                class103 var79 = class168.method1180(8931, var73);
                if (var79 != null) {
                    class45.method346((byte) 121, var79);
                    class88.method624(true, (byte) 114, var79);
                }
                if (field1944 != -1) {
                    class76.method577(field1944, 1, 21767);
                }
            }
            class51.field719 = -1;
            return true;
        } else if (class51.field719 == 209) {
            int var80 = class166.field2709.method1786(1233508208);
            int var81 = class166.field2709.method1777(-96);
            int var82 = class166.field2709.method1784(-103);
            int var83 = class166.field2709.method1777(-84);
            if ((var82 >> 30) != 0) {
                int var108 = var82 >> 28 & 0x3;
                int var109 = (var82 >> 14 & 0x3FFF) - class296.field4685;
                int var110 = (var82 & 0x3FFF) - class93.field1321;
                if (var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104) {
                    int var111 = var109 * 128 + 64;
                    int var112 = var110 * 128 + 64;
                    class241 var113 = new class241(var83, var108, var111, var112, class220.method1461(var111, var108, var112, 52) - var80, var81, class9.field141);
                    class228.field3626.method363(79, new class150(var113));
                }
            } else if (var82 >> 29 != 0) {
                int var84 = var82 & 0xFFFF;
                class275 var85 = class198.field3193[var84];
                if (var85 != null) {
                    if (var83 == 65535) {
                        var83 = -1;
                    }
                    boolean var86 = true;
                    if (var83 != -1 && var85.field634 != -1) {
                        if (var85.field634 == var83) {
                            class66 var91 = class271.method1826(var83, (byte) 125);
                            if (var91.field925 && var91.field929 != -1) {
                                class21 var92 = class267.method1812((byte) 89, var91.field929);
                                int var93 = var92.field239;
                                if (var93 == 1) {
                                    var86 = false;
                                    var85.field686 = 0;
                                    var85.field615 = 1;
                                    var85.field694 = 0;
                                    var85.field640 = class9.field141 + var81;
                                    var85.field702 = 0;
                                    class150.method1022(var92, (byte) 126, var85.field694, var85.field613, false, var85.field614);
                                } else if (var93 == 2) {
                                    var86 = false;
                                    var85.field607 = 0;
                                }
                            }
                        } else {
                            class66 var87 = class271.method1826(var83, (byte) 114);
                            class66 var88 = class271.method1826(var85.field634, (byte) 122);
                            if (var87.field929 != -1 && var88.field929 != -1) {
                                class21 var89 = class267.method1812((byte) 89, var87.field929);
                                class21 var90 = class267.method1812((byte) 89, var88.field929);
                                if (var89.field257 < var90.field257) {
                                    var86 = false;
                                }
                            }
                        }
                    }
                    if (var86) {
                        var85.field686 = 0;
                        var85.field634 = var83;
                        var85.field615 = 1;
                        var85.field694 = 0;
                        var85.field661 = var80;
                        var85.field640 = class9.field141 + var81;
                        if (var85.field640 > class9.field141) {
                            var85.field694 = -1;
                        }
                        if (var85.field634 != -1 && class9.field141 == var85.field640) {
                            int var94 = class271.method1826(var85.field634, (byte) 93).field929;
                            if (var94 != -1) {
                                class21 var95 = class267.method1812((byte) 89, var94);
                                if (var95 != null && var95.field237 != null) {
                                    class150.method1022(var95, (byte) -24, 0, var85.field613, false, var85.field614);
                                }
                            }
                        }
                    }
                }
            } else if ((var82 >> 28) != 0) {
                int var96 = var82 & 0xFFFF;
                class235 var97;
                if (class80.field1121 == var96) {
                    var97 = class197.field3179;
                } else {
                    var97 = class260.field4141[var96];
                }
                if (var97 != null) {
                    if (var83 == 65535) {
                        var83 = -1;
                    }
                    boolean var98 = true;
                    if (var83 != -1 && var97.field634 != -1) {
                        if (var97.field634 == var83) {
                            class66 var99 = class271.method1826(var83, (byte) 106);
                            if (var99.field925 && var99.field929 != -1) {
                                class21 var100 = class267.method1812((byte) 89, var99.field929);
                                int var101 = var100.field239;
                                if (var101 == 1) {
                                    var97.field694 = 0;
                                    var97.field686 = 0;
                                    var97.field702 = 0;
                                    var98 = false;
                                    var97.field640 = class9.field141 + var81;
                                    var97.field615 = 1;
                                    class150.method1022(var100, (byte) -51, var97.field694, var97.field613, false, var97.field614);
                                } else if (var101 == 2) {
                                    var98 = false;
                                    var97.field607 = 0;
                                }
                            }
                        } else {
                            class66 var102 = class271.method1826(var83, (byte) 108);
                            class66 var103 = class271.method1826(var97.field634, (byte) 97);
                            if (var102.field929 != -1 && var103.field929 != -1) {
                                class21 var104 = class267.method1812((byte) 89, var102.field929);
                                class21 var105 = class267.method1812((byte) 89, var103.field929);
                                if (var104.field257 < var105.field257) {
                                    var98 = false;
                                }
                            }
                        }
                    }
                    if (var98) {
                        var97.field661 = var80;
                        var97.field694 = 0;
                        var97.field640 = class9.field141 + var81;
                        if (var97.field640 > class9.field141) {
                            var97.field694 = -1;
                        }
                        var97.field615 = 1;
                        var97.field686 = 0;
                        var97.field634 = var83;
                        if (var97.field634 == 65535) {
                            var97.field634 = -1;
                        }
                        if (var97.field634 != -1 && class9.field141 == var97.field640) {
                            int var106 = class271.method1826(var97.field634, (byte) 94).field929;
                            if (var106 != -1) {
                                class21 var107 = class267.method1812((byte) 89, var106);
                                if (var107 != null && var107.field237 != null) {
                                    class150.method1022(var107, (byte) -128, 0, var97.field613, class197.field3179 == var97, var97.field614);
                                }
                            }
                        }
                    }
                }
            }
            class51.field719 = -1;
            return true;
        } else if (class51.field719 == 54) {
            int var114 = class166.field2709.method1749((byte) -43);
            int var115 = class166.field2709.method1786(1233508208);
            int var116 = class166.field2709.method1777(-122);
            int var117 = class166.field2709.method1765((byte) 115);
            if (class274.method1846(var114, (byte) 72)) {
                class23.method154(-76, var117, (var115 << 16) + var116);
            }
            class51.field719 = -1;
            return true;
        } else if (class51.field719 == 206) {
            int var118 = class166.field2709.method1777(-58);
            int var119 = class166.field2709.method1779(-121);
            int var120 = class166.field2709.method1779(-60);
            int var121 = class166.field2709.method1777(-83);
            int var122 = class166.field2709.method1779(-91);
            int var123 = class166.field2709.method1779(-92);
            if (class274.method1846(var118, (byte) 46)) {
                class209.method1421(var120, var123, var121, -22, var119, var122);
            }
            class51.field719 = -1;
            return true;
        } else if (class51.field719 == 45) {
            class166.field2709.field4195 += 28;
            if (class166.field2709.method1752((byte) -124)) {
                class88.method626(class166.field2709, class166.field2709.field4195 - 28, true);
            }
            class51.field719 = -1;
            return true;
        } else if (class51.field719 == 128) {
            class42.field504 = class166.field2709.method1749((byte) -77) * 30;
            class51.field719 = -1;
            class61.field844 = class64.field906;
            return true;
        } else if (class51.field719 == 105) {
            int var124 = class166.field2709.method1730((byte) -124);
            int var125 = class166.field2709.method1790((byte) -19);
            if (var124 == 65535) {
                var124 = -1;
            }
            int var126 = class166.field2709.method1784(69);
            int var127 = class166.field2709.method1749((byte) -114);
            if (class274.method1846(var127, (byte) 68)) {
                class103 var128 = class168.method1180(8931, var125);
                if (var128.field1603) {
                    class46.method357(4096, var126, var124, var125);
                    class208 var129 = class64.method514(var124, 0);
                    class88.method623(var129.field3397, 250, var129.field3389, var125, var129.field3380);
                    class62.method476((byte) 52, var129.field3408, var125, var129.field3403, var129.field3429);
                } else if (var124 == -1) {
                    class51.field719 = -1;
                    var128.field1631 = 0;
                    return true;
                } else {
                    class208 var130 = class64.method514(var124, 0);
                    var128.field1598 = var130.field3397 * 100 / var126;
                    var128.field1683 = var130.field3389;
                    var128.field1724 = var124;
                    var128.field1631 = 4;
                    var128.field1605 = var130.field3380;
                    class45.method346((byte) 71, var128);
                }
            }
            class51.field719 = -1;
            return true;
        } else if (class51.field719 == 215) {
            class297.method1985(-1);
            class51.field719 = -1;
            return false;
        } else if (class51.field719 == 108) {
            String var131 = class166.field2709.method1750((byte) -87);
            if (var131.endsWith(":tradereq:")) {
                String var132 = var131.substring(0, var131.indexOf(":"));
                boolean var133 = false;
                long var134 = class238.method1570(var132, (byte) 86);
                for (int var136 = 0; var136 < class33.field399; var136++) {
                    if (class140.field2301[var136] == var134) {
                        var133 = true;
                        break;
                    }
                }
                if (!var133 && class251.field4025 == 0) {
                    class297.method1986(4, var132, true, class290.field4630);
                }
            } else if (var131.endsWith(":chalreq:")) {
                String var166 = var131.substring(0, var131.indexOf(":"));
                long var167 = class238.method1570(var166, (byte) 104);
                boolean var169 = false;
                for (int var170 = 0; var170 < class33.field399; var170++) {
                    if (class140.field2301[var170] == var167) {
                        var169 = true;
                        break;
                    }
                }
                if (!var169 && class251.field4025 == 0) {
                    String var171 = var131.substring(var131.indexOf(":") + 1, var131.length() - 9);
                    class297.method1986(8, var166, true, var171);
                }
            } else if (var131.endsWith(":assistreq:")) {
                String var161 = var131.substring(0, var131.indexOf(":"));
                boolean var162 = false;
                long var163 = class238.method1570(var161, (byte) 100);
                for (int var165 = 0; var165 < class33.field399; var165++) {
                    if (class140.field2301[var165] == var163) {
                        var162 = true;
                        break;
                    }
                }
                if (!var162 && class251.field4025 == 0) {
                    class297.method1986(10, var161, true, "");
                }
            } else if (var131.endsWith(":clan:")) {
                String var160 = var131.substring(0, var131.indexOf(":clan:"));
                class297.method1986(11, "", true, var160);
            } else if (var131.endsWith(":trade:")) {
                String var137 = var131.substring(0, var131.indexOf(":trade:"));
                if (class251.field4025 == 0) {
                    class297.method1986(12, "", true, var137);
                }
            } else if (var131.endsWith(":assist:")) {
                String var159 = var131.substring(0, var131.indexOf(":assist:"));
                if (class251.field4025 == 0) {
                    class297.method1986(13, "", true, var159);
                }
            } else if (var131.endsWith(":duelstake:")) {
                String var138 = var131.substring(0, var131.indexOf(":"));
                long var139 = class238.method1570(var138, (byte) 111);
                boolean var141 = false;
                for (int var142 = 0; var142 < class33.field399; var142++) {
                    if (class140.field2301[var142] == var139) {
                        var141 = true;
                        break;
                    }
                }
                if (!var141 && class251.field4025 == 0) {
                    class297.method1986(14, var138, true, "");
                }
            } else if (var131.endsWith(":duelfriend:")) {
                boolean var154 = false;
                String var155 = var131.substring(0, var131.indexOf(":"));
                long var156 = class238.method1570(var155, (byte) 89);
                for (int var158 = 0; var158 < class33.field399; var158++) {
                    if (class140.field2301[var158] == var156) {
                        var154 = true;
                        break;
                    }
                }
                if (!var154 && class251.field4025 == 0) {
                    class297.method1986(15, var155, true, "");
                }
            } else if (var131.endsWith(":clanreq:")) {
                String var149 = var131.substring(0, var131.indexOf(":"));
                long var150 = class238.method1570(var149, (byte) 121);
                boolean var152 = false;
                for (int var153 = 0; var153 < class33.field399; var153++) {
                    if (class140.field2301[var153] == var150) {
                        var152 = true;
                        break;
                    }
                }
                if (!var152 && class251.field4025 == 0) {
                    class297.method1986(16, var149, true, "");
                }
            } else if (var131.endsWith(":allyreq:")) {
                String var143 = var131.substring(0, var131.indexOf(":"));
                long var144 = class238.method1570(var143, (byte) 119);
                boolean var146 = false;
                for (int var147 = 0; var147 < class33.field399; var147++) {
                    if (class140.field2301[var147] == var144) {
                        var146 = true;
                        break;
                    }
                }
                if (!var146 && class251.field4025 == 0) {
                    String var148 = var131.substring(var131.indexOf(":") + 1, var131.length() + -9);
                    class297.method1986(21, var143, true, var148);
                }
            } else {
                class297.method1986(0, "", true, var131);
            }
            class51.field719 = -1;
            return true;
        } else if (class51.field719 == 158) {
            int var172 = class166.field2709.method1777(-64);
            if (var172 == 65535) {
                var172 = -1;
            }
            int var173 = class166.field2709.method1779(-92);
            int var174 = class166.field2709.method1777(-85);
            int var175 = class166.field2709.method1779(-62);
            class222.method1473(0, var174, var173, var175, var172);
            class51.field719 = -1;
            return true;
        } else if (class51.field719 == 53) {
            int var176 = class166.field2709.method1784(119);
            int var177 = class166.field2709.method1766((byte) -59);
            int var178 = class166.field2709.method1777(-105);
            if (var178 == 65535) {
                var178 = -1;
            }
            int var179 = class166.field2709.method1749((byte) -64);
            if (var179 == 65535) {
                var179 = -1;
            }
            int var180 = class166.field2709.method1749((byte) -76);
            if (class274.method1846(var180, (byte) 61)) {
                for (int var181 = var178; var181 <= var179; var181++) {
                    long var182 = ((long) var177 << 32) + (long) var181;
                    class29 var184 = (class29) class28.field326.method457(var182, (byte) -115);
                    class29 var185;
                    if (var184 != null) {
                        var185 = new class29(var176, var184.field349);
                        var184.method544(122);
                    } else if (var181 == -1) {
                        var185 = new class29(var176, class168.method1180(8931, var177).field1552.field349);
                    } else {
                        var185 = new class29(var176, -1);
                    }
                    class28.field326.method466(var182, var185, (byte) 93);
                }
            }
            class51.field719 = -1;
            return true;
        } else if (class51.field719 == 80) {
            int var186 = class166.field2709.method1786(1233508208);
            byte var187 = class166.field2709.method1767(16711680);
            int var188 = class166.field2709.method1786(1233508208);
            if (class274.method1846(var188, (byte) 69)) {
                class286.method1918(-105, var186, var187);
            }
            class51.field719 = -1;
            return true;
        } else if (class51.field719 == 120) {
            int var189 = class166.field2709.method1774(125);
            int var190 = class166.field2709.method1749((byte) -115);
            class177.method1224(-124, var190, var189);
            class51.field719 = -1;
            return true;
        } else {
            if (arg0 >= -7) {
                method816((byte) -79, (class103) null);
            }
            if (class51.field719 == 44) {
                if (class73.field1001 == 0) {
                    class186.field2981 = class205.field3290;
                } else {
                    class186.field2981 = class166.field2709.method1750((byte) 83);
                }
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 210) {
                class49.method386(-83);
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 48) {
                int var191 = class166.field2709.method1777(-76);
                int var192 = class166.field2709.method1765((byte) 123);
                if (class274.method1846(var191, (byte) 61)) {
                    class128 var193 = (class128) class294.field4656.method457((long) var192, (byte) -115);
                    if (var193 != null) {
                        class290.method1943(var193, true, 120);
                    }
                    if (class247.field3969 != null) {
                        class45.method346((byte) 75, class247.field3969);
                        class247.field3969 = null;
                    }
                }
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 114) {
                int var194 = class166.field2709.method1790((byte) -19);
                class184.field2953 = class250.field4006.method1667(var194, -95);
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 83) {
                class264.field4242 = class64.field906;
                long var195 = class166.field2709.method1740((byte) 126);
                if (var195 == 0L) {
                    class51.field719 = -1;
                    class178.field2889 = 0;
                    class183.field2925 = null;
                    class69.field961 = null;
                    class166.field2706 = null;
                    return true;
                }
                long var197 = class166.field2709.method1740((byte) 126);
                class183.field2925 = class245.method1610(-110, var197);
                class166.field2706 = class245.method1610(62, var195);
                class188.field3009 = class166.field2709.method1767(16711680);
                int var199 = class166.field2709.method1779(-88);
                if (var199 == 255) {
                    class51.field719 = -1;
                    return true;
                }
                class178.field2889 = var199;
                class26[] var200 = new class26[100];
                for (int var201 = 0; var201 < class178.field2889; var201++) {
                    var200[var201] = new class26();
                    var200[var201].field962 = class166.field2709.method1740((byte) 126);
                    var200[var201].field317 = class245.method1610(-94, var200[var201].field962);
                    var200[var201].field321 = class166.field2709.method1777(-92);
                    var200[var201].field318 = class166.field2709.method1767(16711680);
                    var200[var201].field323 = class166.field2709.method1750((byte) 88);
                    if (class64.field905 == var200[var201].field962) {
                        class207.field3347 = var200[var201].field318;
                    }
                }
                boolean var202 = false;
                int var203 = class178.field2889;
                while (var203 > 0) {
                    boolean var204 = true;
                    var203--;
                    for (int var205 = 0; var205 < var203; var205++) {
                        if (var200[var205].field317.compareTo(var200[var205 + 1].field317) > 0) {
                            class26 var206 = var200[var205];
                            var200[var205] = var200[var205 + 1];
                            var200[var205 + 1] = var206;
                            var204 = false;
                        }
                    }
                    if (var204) {
                        break;
                    }
                }
                class51.field719 = -1;
                class69.field961 = var200;
                return true;
            } else if (class51.field719 == 84) {
                byte var207 = class166.field2709.method1773(false);
                int var208 = class166.field2709.method1730((byte) -127);
                class273.method1841(var208, 4547, var207);
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 150) {
                int var209 = class166.field2709.method1786(1233508208);
                int var210 = class166.field2709.method1790((byte) -19);
                int var211 = class166.field2709.method1746((byte) 49);
                if (class274.method1846(var209, (byte) 68)) {
                    class189.method1287(var211, (byte) -46, var210);
                }
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 127) {
                class105.field1808 = class166.field2709.method1743((byte) 21);
                class129.field2159 = class166.field2709.method1774(125);
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 57) {
                int var212 = class166.field2709.method1777(-60);
                String var213 = class166.field2709.method1750((byte) -88);
                Object[] var214 = new Object[var213.length() + 1];
                for (int var215 = var213.length() - 1; var215 >= 0; var215--) {
                    if (var213.charAt(var215) == 's') {
                        var214[var215 + 1] = class166.field2709.method1750((byte) -85);
                    } else {
                        var214[var215 + 1] = Integer.valueOf(class166.field2709.method1765((byte) 103));
                    }
                }
                var214[0] = Integer.valueOf(class166.field2709.method1765((byte) 123));
                if (class274.method1846(var212, (byte) 69)) {
                    class173 var216 = new class173();
                    var216.field2798 = var214;
                    class223.method1480(8170, var216);
                }
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 102) {
                int var217 = class166.field2709.method1777(-96);
                int var218 = class166.field2709.method1731(-127);
                if (var217 == 65535) {
                    var217 = -1;
                }
                class70.method549(var218, var217, (byte) 87);
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 106) {
                int var219 = class166.field2709.method1735(31719);
                int var220 = class166.field2709.method1774(118);
                int var221 = class166.field2709.method1786(1233508208);
                if (var221 == 65535) {
                    var221 = -1;
                }
                class80.method596(var220, 16491, var221, var219);
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 31) {
                int var222 = class166.field2709.method1790((byte) -19);
                int var223 = class166.field2709.method1779(-74);
                int var224 = class166.field2709.method1786(1233508208);
                int var225 = class166.field2709.method1777(-124);
                if (class274.method1846(var225, (byte) 48)) {
                    class128 var226 = (class128) class294.field4656.method457((long) var222, (byte) -115);
                    if (var226 != null) {
                        class290.method1943(var226, var226.field2135 != var224, 101);
                    }
                    class3.method22(var222, false, var223, var224);
                }
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 172) {
                int var227 = class166.field2709.method1777(-40);
                int var228 = class166.field2709.method1766((byte) -59);
                int var229 = class166.field2709.method1786(1233508208);
                if (class274.method1846(var227, (byte) 124)) {
                    class18.method128(var229, var228, false);
                }
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 77) {
                int var230 = class166.field2709.method1730((byte) -120);
                int var231 = class166.field2709.method1731(-127);
                if (class274.method1846(var230, (byte) 49)) {
                    class87.field1199 = var231;
                }
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 208) {
                for (int var232 = 0; var232 < class260.field4141.length; var232++) {
                    if (class260.field4141[var232] != null) {
                        class260.field4141[var232].field672 = -1;
                    }
                }
                for (int var233 = 0; var233 < class198.field3193.length; var233++) {
                    if (class198.field3193[var233] != null) {
                        class198.field3193[var233].field672 = -1;
                    }
                }
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 182) {
                long var234 = class166.field2709.method1740((byte) 126);
                int var236 = class166.field2709.method1777(-111);
                byte var237 = class166.field2709.method1767(16711680);
                boolean var238 = false;
                if ((var234 & Long.MIN_VALUE) != 0L) {
                    var238 = true;
                }
                if (var238) {
                    if (class178.field2889 == 0) {
                        class51.field719 = -1;
                        return true;
                    }
                    long var244 = var234 & Long.MAX_VALUE;
                    boolean var246 = false;
                    int var247;
                    for (var247 = 0; class178.field2889 > var247 && (class69.field961[var247].field962 != var244 || class69.field961[var247].field321 != var236); var247++) {
                    }
                    if (class178.field2889 > var247) {
                        while (var247 < class178.field2889 - 1) {
                            class69.field961[var247] = class69.field961[var247 + 1];
                            var247++;
                        }
                        class178.field2889--;
                        class69.field961[class178.field2889] = null;
                    }
                } else {
                    String var239 = class166.field2709.method1750((byte) 89);
                    class26 var240 = new class26();
                    var240.field962 = var234;
                    var240.field317 = class245.method1610(92, var240.field962);
                    var240.field321 = var236;
                    var240.field318 = var237;
                    var240.field323 = var239;
                    int var241;
                    for (var241 = class178.field2889 - 1; var241 >= 0; var241--) {
                        int var242 = class69.field961[var241].field317.compareTo(var240.field317);
                        if (var242 == 0) {
                            class69.field961[var241].field321 = var236;
                            class69.field961[var241].field318 = var237;
                            class69.field961[var241].field323 = var239;
                            if (class64.field905 == var234) {
                                class207.field3347 = var237;
                            }
                            class264.field4242 = class64.field906;
                            class51.field719 = -1;
                            return true;
                        }
                        if (var242 < 0) {
                            break;
                        }
                    }
                    if (class69.field961.length <= class178.field2889) {
                        class51.field719 = -1;
                        return true;
                    }
                    for (int var243 = class178.field2889 - 1; var243 > var241; var243--) {
                        class69.field961[var243 + 1] = class69.field961[var243];
                    }
                    if (class178.field2889 == 0) {
                        class69.field961 = new class26[100];
                    }
                    class69.field961[var241 + 1] = var240;
                    if (class64.field905 == var234) {
                        class207.field3347 = var237;
                    }
                    class178.field2889++;
                }
                class264.field4242 = class64.field906;
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 179) {
                int var248 = class166.field2709.method1777(-39);
                if (class274.method1846(var248, (byte) 76)) {
                    class240.method1583((byte) 120);
                }
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 86) {
                class232.method1534((byte) -119);
                class185.method1267(119);
                class51.field719 = -1;
                class217.field3479 += 32;
                return true;
            } else if (class51.field719 == 40) {
                int var249 = class166.field2709.method1765((byte) 100);
                int var250 = class166.field2709.method1756(-98);
                int var251 = class166.field2709.method1730((byte) -104);
                int var252 = class166.field2709.method1738(false);
                if (class274.method1846(var251, (byte) 70)) {
                    class270.method1824(var252, var249, var250, (byte) 24);
                }
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 24) {
                int var253 = class166.field2709.method1779(-111);
                int var254 = var253 >> 5;
                int var255 = var253 & 0x1F;
                if (var255 == 0) {
                    class293.field4649[var254] = null;
                    class51.field719 = -1;
                    return true;
                }
                class115 var256 = new class115();
                var256.field1967 = var255;
                var256.field1967 = var253 & 0x3F;
                var256.field1970 = class166.field2709.method1779(-96);
                if (var256.field1970 >= 0 && class1.field17.length > var256.field1970) {
                    if (var256.field1967 == 1 || var256.field1967 == 10) {
                        var256.field1960 = class166.field2709.method1777(-72);
                        class166.field2709.field4195 += 5;
                    } else if (var256.field1967 >= 2 && var256.field1967 <= 6) {
                        if (var256.field1967 == 2) {
                            var256.field1968 = 64;
                            var256.field1976 = 64;
                        }
                        if (var256.field1967 == 3) {
                            var256.field1976 = 64;
                            var256.field1968 = 0;
                        }
                        if (var256.field1967 == 4) {
                            var256.field1968 = 128;
                            var256.field1976 = 64;
                        }
                        if (var256.field1967 == 5) {
                            var256.field1968 = 64;
                            var256.field1976 = 0;
                        }
                        if (var256.field1967 == 6) {
                            var256.field1976 = 128;
                            var256.field1968 = 64;
                        }
                        var256.field1967 = 2;
                        var256.field1963 = class166.field2709.method1777(-91);
                        var256.field1973 = class166.field2709.method1777(-114);
                        var256.field1974 = class166.field2709.method1779(-103);
                        var256.field1975 = class166.field2709.method1777(-78);
                    }
                    var256.field1972 = class166.field2709.method1777(-124);
                    if (var256.field1972 == 65535) {
                        var256.field1972 = -1;
                    }
                    class293.field4649[var254] = var256;
                }
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 185) {
                class185.method1267(112);
                class297.field4708 = class166.field2709.method1779(-99);
                class51.field719 = -1;
                class61.field844 = class64.field906;
                return true;
            } else if (class51.field719 == 166) {
                int var257 = class166.field2709.method1766((byte) -59);
                int var258 = class166.field2709.method1777(-48);
                int var259 = class166.field2709.method1786(1233508208);
                if (var259 == 65535) {
                    var259 = -1;
                }
                int var260 = class166.field2709.method1786(1233508208);
                int var261 = class166.field2709.method1777(-76);
                if (var260 == 65535) {
                    var260 = -1;
                }
                if (class274.method1846(var258, (byte) 51)) {
                    for (int var262 = var259; var262 <= var260; var262++) {
                        long var263 = ((long) var257 << 32) + ((long) var262);
                        class29 var265 = (class29) class28.field326.method457(var263, (byte) -115);
                        class29 var266;
                        if (var265 != null) {
                            var266 = new class29(var265.field350, var261);
                            var265.method544(113);
                        } else if (var262 == -1) {
                            var266 = new class29(class168.method1180(8931, var257).field1552.field350, var261);
                        } else {
                            var266 = new class29(0, var261);
                        }
                        class28.field326.method466(var263, var266, (byte) 93);
                    }
                }
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 62) {
                int var267 = class166.field2709.method1777(-116);
                int var268 = class166.field2709.method1779(-96);
                int var269 = class166.field2709.method1779(-121);
                int var270 = class166.field2709.method1777(-48);
                int var271 = class166.field2709.method1779(-72);
                int var272 = class166.field2709.method1779(-75);
                if (class274.method1846(var267, (byte) 112)) {
                    class233.method1540(true, var268, var270, var269, (byte) 120, var271, var272);
                }
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 228) {
                long var273 = class166.field2709.method1740((byte) 126);
                int var275 = class166.field2709.method1777(-55);
                String var276 = class266.method1805((byte) -93, var275).method1611(class166.field2709, (byte) 66);
                class244.method1604((String) null, var276, (byte) -16, class94.method659(var273, (byte) -103), var275, 19);
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 121) {
                class127.method886(-116, false);
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 38) {
                int var277 = class166.field2709.method1731(-118);
                int var278 = class166.field2709.method1743((byte) 21);
                int var279 = class166.field2709.method1779(-50);
                class28.field336 = var277 >> 1;
                class197.field3179.method1551(var278, (var277 & 0x1) == 1, false, var279);
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 241) {
                int var280 = class166.field2709.method1749((byte) -47);
                int var281 = class166.field2709.method1765((byte) 102);
                int var282 = class166.field2709.method1730((byte) -111);
                int var283 = class166.field2709.method1786(1233508208);
                int var284 = class166.field2709.method1786(1233508208);
                if (class274.method1846(var283, (byte) 112)) {
                    class193.method1303(-1, 7, var281, var284, var282 << 16 | var280);
                }
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 98) {
                int var285 = class166.field2709.method1749((byte) -24);
                int var286 = class166.field2709.method1766((byte) -59);
                int var287 = class166.field2709.method1730((byte) -106);
                if (class274.method1846(var285, (byte) 41)) {
                    class220.method1460(var287, var286, 12);
                }
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 37) {
                class33.field399 = class73.field1001 / 8;
                for (int var288 = 0; var288 < class33.field399; var288++) {
                    class140.field2301[var288] = class166.field2709.method1740((byte) 127);
                    class242.field3883[var288] = class245.method1608(class140.field2301[var288], true);
                    class225.field3570[var288] = false;
                }
                class204.field3273 = class64.field906;
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 187) {
                int var289 = class166.field2709.method1790((byte) -19);
                class103 var290 = class168.method1180(8931, var289);
                for (int var291 = 0; var291 < var290.field1547.length; var291++) {
                    var290.field1547[var291] = -1;
                    var290.field1547[var291] = 0;
                }
                class45.method346((byte) 27, var290);
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 205) {
                class52.field742 = class166.field2709.method1779(-61);
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 92) {
                int var292 = class166.field2709.method1730((byte) -109);
                int var293 = class166.field2709.method1777(-63);
                int var294 = class166.field2709.method1777(-86);
                if (class274.method1846(var292, (byte) 122)) {
                    class133.method911(-125, var293, var294);
                }
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 27) {
                int var295 = class166.field2709.method1779(-122);
                if (class166.field2709.method1779(-86) == 0) {
                    class154.field2486[var295] = new class98();
                } else {
                    class166.field2709.field4195--;
                    class154.field2486[var295] = new class98(class166.field2709);
                }
                class51.field719 = -1;
                class264.field4182 = class64.field906;
                return true;
            } else if (class51.field719 == 49) {
                class185.method1267(114);
                int var296 = class166.field2709.method1766((byte) -59);
                int var297 = class166.field2709.method1731(-82);
                int var298 = class166.field2709.method1731(-98);
                class281.field4492[var297] = var296;
                class242.field3886[var297] = var298;
                class52.field735[var297] = 1;
                for (int var299 = 0; var299 < 98; var299++) {
                    if (class12.field165[var299] <= var296) {
                        class52.field735[var297] = var299 + 2;
                    }
                }
                class220.field3512[class204.method1369(31, class109.field1897++)] = var297;
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 245) {
                long var300 = class166.field2709.method1740((byte) 127);
                String var302 = class163.method1138(class143.method967(-106, class146.method999(class166.field2709, true)));
                class297.method1986(6, class94.method659(var300, (byte) -103), true, var302);
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 221) {
                int var303 = class166.field2709.method1786(1233508208);
                if (var303 == 65535) {
                    var303 = -1;
                }
                int var304 = class166.field2709.method1779(-91);
                int var305 = class166.field2709.method1779(-116);
                String var306 = class166.field2709.method1750((byte) 79);
                if (var304 >= 1 && var304 <= 8) {
                    if (var306.equalsIgnoreCase("null")) {
                        var306 = null;
                    }
                    class220.field3513[var304 - 1] = var306;
                    class230.field3649[var304 - 1] = var303;
                    class81.field1128[var304 - 1] = var305 == 0;
                }
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 14) {
                long var307 = class166.field2709.method1740((byte) 126);
                long var309 = (long) class166.field2709.method1777(-116);
                long var311 = (long) class166.field2709.method1732(-98);
                int var313 = class166.field2709.method1779(-125);
                int var314 = class166.field2709.method1777(-38);
                long var315 = (var309 << 32) + var311;
                boolean var317 = false;
                int var318 = 0;
                label1445: while (true) {
                    if (var318 >= 100) {
                        if (var313 <= 1) {
                            for (int var319 = 0; var319 < class33.field399; var319++) {
                                if (class140.field2301[var319] == var307) {
                                    var317 = true;
                                    break label1445;
                                }
                            }
                        }
                        break;
                    }
                    if (class283.field4520[var318] == var315) {
                        var317 = true;
                        break;
                    }
                    var318++;
                }
                if (!var317 && class251.field4025 == 0) {
                    class283.field4520[class11.field152] = var315;
                    class11.field152 = (class11.field152 + 1) % 100;
                    String var320 = class266.method1805((byte) -38, var314).method1611(class166.field2709, (byte) 66);
                    if (var313 == 2) {
                        class244.method1604((String) null, var320, (byte) -96, "<img=1>" + class94.method659(var307, (byte) -103), var314, 18);
                    } else if (var313 == 1) {
                        class244.method1604((String) null, var320, (byte) -72, "<img=0>" + class94.method659(var307, (byte) -103), var314, 18);
                    } else {
                        class244.method1604((String) null, var320, (byte) -88, class94.method659(var307, (byte) -103), var314, 18);
                    }
                }
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 82) {
                int var321 = class166.field2709.method1766((byte) -59);
                int var322 = class166.field2709.method1779(-113);
                int var323 = class166.field2709.method1749((byte) -112);
                if (class274.method1846(var323, (byte) 54)) {
                    class217.method1443(7, var321, var322);
                }
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 143) {
                class51.field719 = -1;
                class5.field60 = 0;
                return true;
            } else if (class51.field719 == 23) {
                int var324 = class166.field2709.method1730((byte) -116);
                int var325 = class166.field2709.method1790((byte) -19);
                class177.method1224(-122, var324, var325);
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 138) {
                int var326 = class166.field2709.method1786(1233508208);
                int var327 = class166.field2709.method1786(1233508208);
                int var328 = class166.field2709.method1790((byte) -19);
                int var329 = class166.field2709.method1730((byte) -102);
                int var330 = class166.field2709.method1730((byte) -120);
                if (class274.method1846(var329, (byte) 85)) {
                    class88.method623(var327, 250, var326, var328, var330);
                }
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 189) {
                int var331 = class166.field2709.method1786(1233508208);
                String var332 = class166.field2709.method1750((byte) 74);
                int var333 = class166.field2709.method1765((byte) 105);
                if (class274.method1846(var331, (byte) 61)) {
                    class104.method739((byte) -72, var333, var332);
                }
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 248) {
                class185.method1267(127);
                class72.field982 = class166.field2709.method1756(-101);
                class61.field844 = class64.field906;
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 91) {
                if (field1944 != -1) {
                    class76.method577(field1944, 0, 21767);
                }
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 178) {
                for (int var334 = 0; var334 < class214.field3454.length; var334++) {
                    if (class214.field3454[var334] != class108.field1876[var334]) {
                        class214.field3454[var334] = class108.field1876[var334];
                        class233.method1542(var334, (byte) 34);
                        class189.field3017[class204.method1369(31, class217.field3479++)] = var334;
                    }
                }
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 119) {
                long var335 = class166.field2709.method1740((byte) 126);
                long var337 = (long) class166.field2709.method1777(-60);
                long var339 = (long) class166.field2709.method1732(-117);
                int var341 = class166.field2709.method1779(-59);
                boolean var342 = false;
                long var343 = (var337 << 32) + var339;
                int var345 = 0;
                label1477: while (true) {
                    if (var345 >= 100) {
                        if (var341 <= 1) {
                            if ((!class25.field311 || class202.field3246) && !class124.field2063) {
                                for (int var346 = 0; var346 < class33.field399; var346++) {
                                    if (class140.field2301[var346] == var335) {
                                        var342 = true;
                                        break label1477;
                                    }
                                }
                            } else {
                                var342 = true;
                            }
                        }
                        break;
                    }
                    if (class283.field4520[var345] == var343) {
                        var342 = true;
                        break;
                    }
                    var345++;
                }
                if (!var342 && class251.field4025 == 0) {
                    class283.field4520[class11.field152] = var343;
                    class11.field152 = (class11.field152 + 1) % 100;
                    String var347 = class163.method1138(class143.method967(87, class146.method999(class166.field2709, true)));
                    if (var341 == 2 || var341 == 3) {
                        class297.method1986(7, "<img=1>" + class94.method659(var335, (byte) -103), true, var347);
                    } else if (var341 == 1) {
                        class297.method1986(7, "<img=0>" + class94.method659(var335, (byte) -103), true, var347);
                    } else {
                        class297.method1986(3, class94.method659(var335, (byte) -103), true, var347);
                    }
                }
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 70) {
                int var348 = class166.field2709.method1765((byte) 90);
                int var349 = class166.field2709.method1777(-65);
                if (var348 < -70000) {
                    var349 += 32768;
                }
                class103 var350;
                if (var348 < 0) {
                    var350 = null;
                } else {
                    var350 = class168.method1180(8931, var348);
                }
                if (var350 != null) {
                    for (int var351 = 0; var351 < var350.field1547.length; var351++) {
                        var350.field1547[var351] = 0;
                        var350.field1592[var351] = 0;
                    }
                }
                class12.method72((byte) 113, var349);
                int var352 = class166.field2709.method1777(-65);
                for (int var353 = 0; var353 < var352; var353++) {
                    int var354 = class166.field2709.method1731(-77);
                    if (var354 == 255) {
                        var354 = class166.field2709.method1790((byte) -19);
                    }
                    int var355 = class166.field2709.method1786(1233508208);
                    if (var350 != null && var353 < var350.field1547.length) {
                        var350.field1547[var353] = var355;
                        var350.field1592[var353] = var354;
                    }
                    class96.method686(var353, var349, var355 - 1, var354, (byte) 68);
                }
                if (var350 != null) {
                    class45.method346((byte) 95, var350);
                }
                class185.method1267(117);
                class273.field4416[class204.method1369(class218.field3484++, 31)] = class204.method1369(var349, 32767);
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 171) {
                class96.field1446 = class166.field2709.method1779(-59);
                class51.field719 = -1;
                class204.field3273 = class64.field906;
                return true;
            } else if (class51.field719 == 96) {
                int var356 = class166.field2709.method1730((byte) -102);
                int var357 = class166.field2709.method1731(-95);
                int var358 = class166.field2709.method1730((byte) -109);
                if (class274.method1846(var356, (byte) 82)) {
                    if (var357 == 2) {
                        class228.method1515(8156);
                    }
                    field1944 = var358;
                    class204.method1371(-92, var358);
                    class260.method1708(false, 79);
                    class183.method1257(1, field1944);
                    for (int var359 = 0; var359 < 100; var359++) {
                        class272.field4396[var359] = true;
                    }
                }
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 167) {
                long var360 = class166.field2709.method1740((byte) 127);
                class166.field2709.method1767(16711680);
                long var362 = class166.field2709.method1740((byte) 127);
                long var364 = (long) class166.field2709.method1777(-117);
                long var366 = (long) class166.field2709.method1732(-2);
                long var368 = (var364 << 32) + var366;
                boolean var370 = false;
                int var371 = class166.field2709.method1779(-64);
                int var372 = 0;
                label1528: while (true) {
                    if (var372 >= 100) {
                        if (var371 <= 1) {
                            if ((!class25.field311 || class202.field3246) && !class124.field2063) {
                                for (int var373 = 0; var373 < class33.field399; var373++) {
                                    if (class140.field2301[var373] == var360) {
                                        var370 = true;
                                        break label1528;
                                    }
                                }
                            } else {
                                var370 = true;
                            }
                        }
                        break;
                    }
                    if (class283.field4520[var372] == var368) {
                        var370 = true;
                        break;
                    }
                    var372++;
                }
                if (!var370 && class251.field4025 == 0) {
                    class283.field4520[class11.field152] = var368;
                    class11.field152 = (class11.field152 + 1) % 100;
                    String var374 = class163.method1138(class143.method967(-102, class146.method999(class166.field2709, true)));
                    if (var371 == 2 || var371 == 3) {
                        class62.method482((byte) 97, 9, "<img=1>" + class94.method659(var360, (byte) -103), class94.method659(var362, (byte) -103), var374);
                    } else if (var371 == 1) {
                        class62.method482((byte) -85, 9, "<img=0>" + class94.method659(var360, (byte) -103), class94.method659(var362, (byte) -103), var374);
                    } else {
                        class62.method482((byte) -95, 9, class94.method659(var360, (byte) -103), class94.method659(var362, (byte) -103), var374);
                    }
                }
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 61) {
                class71.field979 = class166.field2709.method1779(-90);
                class94.field1331 = class166.field2709.method1779(-113);
                class44.field531 = class166.field2709.method1779(-95);
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 173) {
                class129.field2159 = class166.field2709.method1779(-78);
                class105.field1808 = class166.field2709.method1774(115);
                for (int var375 = class105.field1808; var375 < (class105.field1808 + 8); var375++) {
                    for (int var377 = class129.field2159; var377 < (class129.field2159 + 8); var377++) {
                        if (class244.field3913[class28.field336][var375][var377] != null) {
                            class244.field3913[class28.field336][var375][var377] = null;
                            class294.method1966(var375, var377, (byte) -123);
                        }
                    }
                }
                for (class44 var376 = (class44) class144.field2328.method365(3); var376 != null; var376 = (class44) class144.field2328.method372((byte) 7)) {
                    if (var376.field512 >= class105.field1808 && var376.field512 < class105.field1808 + 8 && class129.field2159 <= var376.field511 && var376.field511 < (class129.field2159 + 8) && class28.field336 == var376.field520) {
                        var376.field523 = 0;
                    }
                }
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 66) {
                int var378 = class166.field2709.method1730((byte) -107);
                class297.method1981(var378, -28);
                class273.field4416[class204.method1369(class218.field3484++, 31)] = class204.method1369(var378, 32767);
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 63) {
                int var379 = class166.field2709.method1766((byte) -59);
                int var380 = var379 >> 28 & 0x3;
                int var381 = var379 & 0x3FFF;
                int var382 = var379 >> 14 & 0x3FFF;
                int var383 = class166.field2709.method1786(1233508208);
                if (var383 == 65535) {
                    var383 = -1;
                }
                int var384 = class166.field2709.method1774(119);
                int var385 = var384 & 0x3;
                int var386 = var384 >> 2;
                int var387 = var382 - class296.field4685;
                int var388 = var381 - class93.field1321;
                int var389 = class207.field3340[var386];
                class156.method1047(var387, var389, 22, var386, var388, var380, var383, var385);
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 41) {
                class107.method786(class73.field1001, class166.field2709, 119, class250.field4006);
                class51.field719 = -1;
                return true;
            } else if (class51.field719 == 229) {
                String var390 = class166.field2709.method1750((byte) 118);
                int var391 = class166.field2709.method1749((byte) -32);
                int var392 = class166.field2709.method1749((byte) -71);
                if (class274.method1846(var391, (byte) 43)) {
                    class241.method1589(true, var392, var390);
                }
                class51.field719 = -1;
                return true;
            } else {
                class272.method1837("T1 - " + class51.field719 + "," + class121.field2038 + "," + class220.field3519 + " - " + class73.field1001, 1, (Throwable) null);
                class297.method1985(-1);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)V")
    public static final void method811(int arg0) {
        class57.field802 = null;
        class226.field3578 = null;
        class153.field2470 = null;
        class162.field2630 = null;
        field1943++;
        if (arg0 > 89) {
            class159.field2593 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)[[I")
    public final int[][] method812(int arg0, int arg1) {
        field1941++;
        if (arg1 != 65535) {
            field1944 = -44;
        }
        if (this.field1935 == this.field1934) {
            this.field1954 = this.field1946[arg0] == null;
            this.field1946[arg0] = class250.field3997;
            return this.field1942[arg0];
        } else if (this.field1934 == 1) {
            this.field1954 = this.field1937 != arg0;
            this.field1937 = arg0;
            return this.field1942[0];
        } else {
            class232 var3 = this.field1946[arg0];
            if (var3 == null) {
                this.field1954 = true;
                if (this.field1934 <= this.field1953) {
                    class232 var4 = (class232) this.field1949.method369(127);
                    var3 = new class232(arg0, var4.field3689);
                    this.field1946[var4.field3691] = null;
                    var4.method544(-70);
                } else {
                    var3 = new class232(arg0, this.field1953);
                    this.field1953++;
                }
                this.field1946[arg0] = var3;
            } else {
                this.field1954 = false;
            }
            this.field1949.method368(var3, 76);
            return this.field1942[var3.field3689];
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IB)I")
    public static final int method813(int arg0, byte arg1) {
        field1947++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        if (arg1 == 55) {
            int var4 = (arg0 * var3 >> 12) + 40960;
            return var2 * var4 >> 12;
        } else {
            return -122;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V")
    public final void method814(byte arg0) {
        if (arg0 < 110) {
            return;
        }
        for (int var2 = 0; var2 < this.field1934; var2++) {
            this.field1942[var2][0] = null;
            this.field1942[var2][1] = null;
            this.field1942[var2][2] = null;
            this.field1942[var2] = null;
        }
        field1945++;
        this.field1946 = null;
        this.field1942 = null;
        this.field1949.method371(3);
        this.field1949 = null;
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)V")
    public static void method815(int arg0) {
        field1936 = null;
        field1955 = null;
        field1952 = null;
        if (arg0 != -30976) {
            method811(-86);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BLeb;)Leb;")
    public static final class103 method816(byte arg0, class103 arg1) {
        field1940++;
        if (arg1.field1602 != -1) {
            return class168.method1180(8931, arg1.field1602);
        }
        int var2 = arg1.field1659 >>> 16;
        class159 var3 = new class159(class294.field4656);
        if (arg0 != -26) {
            method816((byte) -116, (class103) null);
        }
        for (class128 var4 = (class128) var3.method1098((byte) 87); var4 != null; var4 = (class128) var3.method1095(-100)) {
            if (var4.field2135 == var2) {
                return class168.method1180(arg0 ^ 0xFFFFDD05, (int) var4.field962);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)[[[I")
    public final int[][][] method817(int arg0) {
        field1939++;
        if (this.field1935 != this.field1934) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        if (arg0 != -1) {
            return null;
        }
        while (var2 < this.field1934) {
            this.field1946[var2] = class250.field3997;
            var2++;
        }
        return this.field1942;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(III)V")
    public class113(int arg0, int arg1, int arg2) {
        this.field1935 = arg1;
        this.field1934 = arg0;
        this.field1946 = new class232[this.field1935];
        this.field1942 = new int[this.field1934][3][arg2];
    }
}
