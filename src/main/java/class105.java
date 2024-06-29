import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class105 extends class40 {

    @OriginalMember(owner = "client!s", name = "y", descriptor = "Lec;")
    public static class28 field2216 = class28.method210(-46, "purple:");

    @OriginalMember(owner = "client!s", name = "B", descriptor = "Lec;")
    public static class28 field2219 = class28.method210(-46, "headicons_hint");

    @OriginalMember(owner = "client!s", name = "D", descriptor = "[Lec;")
    public static class28[] field2221 = new class28[100];

    @OriginalMember(owner = "client!s", name = "I", descriptor = "Lec;")
    public static class28 field2225 = class28.method210(-46, "Prepared sound engine");

    @OriginalMember(owner = "client!s", name = "t", descriptor = "[Lea;")
    public static class26[] field2211 = new class26[1000];

    @OriginalMember(owner = "client!s", name = "A", descriptor = "Lec;")
    public static class28 field2218 = class28.method210(-46, "Please remove ");

    @OriginalMember(owner = "client!s", name = "C", descriptor = "Lec;")
    public static class28 field2220 = class28.method210(-46, ":duelreq:");

    @OriginalMember(owner = "client!s", name = "H", descriptor = "Lec;")
    public static class28 field2224 = class28.method210(-46, "b12_full");

    @OriginalMember(owner = "client!s", name = "v", descriptor = "Lpa;")
    public static class91 field2213 = new class91(30);

    @OriginalMember(owner = "client!s", name = "K", descriptor = "I")
    public static int field2227 = 0;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!s", name = "w", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!s", name = "z", descriptor = "I")
    public int field2217;

    @OriginalMember(owner = "client!s", name = "F", descriptor = "I")
    public int field2222;

    @OriginalMember(owner = "client!s", name = "G", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!s", name = "x", descriptor = "Lbb;")
    public class9 field2215;

    @OriginalMember(owner = "client!s", name = "J", descriptor = "[B")
    public byte[] field2226;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "[Z")
    public static boolean[] field2210;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IB)V")
    public static final void method727(int arg0, byte arg1) {
        field2223++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class49.field1148[arg0];
        int var3 = class46.field1017[arg0];
        int var4 = class74.field1636[arg0];
        int var5 = class76.field1713[arg0];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        if (class23.field515 != 0 && var4 != 1001) {
            class95.field2092 = true;
            class23.field515 = 0;
        }
        if (var4 == 42) {
            class43 var6 = class129.field2779[var5];
            if (var6 != null) {
                class30.field648++;
                class51.method416(false, 0, 0, -109, var6.field1466[0], 1, 2, class37.field848.field1487[0], 1, 0, class37.field848.field1466[0], var6.field1487[0]);
                class125.field2722 = 0;
                class76.field1695 = class96.field2143;
                field2227 = class32.field680;
                class119.field2584 = 2;
                class5.field85.method161((byte) 91, 58);
                class5.field85.method866(arg1 - 791766775, var5);
            }
        }
        if (var4 == 15) {
            boolean var7 = class51.method416(false, 0, 0, -63, var3, 0, 2, class37.field848.field1487[0], 0, 0, class37.field848.field1466[0], var2);
            class5.field78++;
            if (!var7) {
                class51.method416(false, 0, 0, arg1 - 39, var3, 1, 2, class37.field848.field1487[0], 1, 0, class37.field848.field1466[0], var2);
            }
            field2227 = class32.field680;
            class119.field2584 = 2;
            class76.field1695 = class96.field2143;
            class125.field2722 = 0;
            class5.field85.method161((byte) 87, 219);
            class5.field85.method892(class18.field366 + var2, 1815787688);
            class5.field85.method892(var5, arg1 ^ 0x93C54757);
            class5.field85.method892(class87.field1934 + var3, arg1 + 1815787689);
        }
        if (var4 == 3) {
            class127.field2742++;
            class5.field85.method161((byte) 98, 64);
            class5.field85.method898(var3, -1202576);
            class5.field85.method902(var2, false);
            class5.field85.method902(var5, false);
            class8.field145 = 0;
            class118.field2515 = var2;
            class53.field1226 = var3;
            class69.field1545 = 2;
            if (var3 >> 16 == class40.field860) {
                class69.field1545 = 1;
            }
            if (var3 >> 16 == class110.field2325) {
                class69.field1545 = 3;
            }
        }
        if (var4 == 44) {
            class94.field2062++;
            boolean var9 = class51.method416(false, 0, 0, arg1 - 118, var3, 0, 2, class37.field848.field1487[0], 0, 0, class37.field848.field1466[0], var2);
            if (!var9) {
                class51.method416(false, 0, 0, -124, var3, 1, 2, class37.field848.field1487[0], 1, 0, class37.field848.field1466[0], var2);
            }
            class76.field1695 = class96.field2143;
            class125.field2722 = 0;
            field2227 = class32.field680;
            class119.field2584 = 2;
            class5.field85.method161((byte) 96, 211);
            class5.field85.method866(arg1 ^ 0x2F3166F7, class79.field1825);
            class5.field85.method892(class9.field170, 1815787688);
            class5.field85.method892(class18.field366 + var2, 1815787688);
            class5.field85.method876((byte) -48, var3 + class87.field1934);
            class5.field85.method861((byte) 3, class51.field1198);
            class5.field85.method876((byte) -48, var5);
        }
        if (var4 == 21) {
            class43 var11 = class129.field2779[var5];
            if (var11 != null) {
                class51.method416(false, 0, 0, -103, var11.field1466[0], 1, 2, class37.field848.field1487[0], 1, 0, class37.field848.field1466[0], var11.field1487[0]);
                class119.field2584 = 2;
                class76.field1695 = class96.field2143;
                class79.field1823++;
                class125.field2722 = 0;
                field2227 = class32.field680;
                class5.field85.method161((byte) 92, 235);
                class5.field85.method866(-791766776, var5);
            }
        }
        if (var4 == 22) {
            class106.field2266++;
            boolean var12 = class51.method416(false, 0, 0, -12, var3, 0, 2, class37.field848.field1487[0], 0, 0, class37.field848.field1466[0], var2);
            if (!var12) {
                class51.method416(false, 0, 0, -35, var3, 1, 2, class37.field848.field1487[0], 1, 0, class37.field848.field1466[0], var2);
            }
            class119.field2584 = 2;
            class76.field1695 = class96.field2143;
            field2227 = class32.field680;
            class125.field2722 = 0;
            class5.field85.method161((byte) 79, 108);
            class5.field85.method902(class18.field366 + var2, false);
            class5.field85.method883(class48.field1100, (byte) -6);
            class5.field85.method876((byte) -48, var5);
            class5.field85.method892(var3 + class87.field1934, 1815787688);
        }
        if (var4 == 53) {
            class78 var14 = class5.method27(0, var3);
            boolean var15 = true;
            if (var14.field1796 > 0) {
                var15 = class88.method649((byte) -61, var14);
            }
            if (var15) {
                class49.field1136++;
                class5.field85.method161((byte) 96, 184);
                class5.field85.method898(var3, -1202576);
            }
        }
        if (var4 == 18) {
            class43 var16 = class129.field2779[var5];
            if (var16 != null) {
                class51.method416(false, 0, 0, -19, var16.field1466[0], 1, 2, class37.field848.field1487[0], 1, 0, class37.field848.field1466[0], var16.field1487[0]);
                class93.field2047++;
                class76.field1695 = class96.field2143;
                class125.field2722 = 0;
                field2227 = class32.field680;
                class119.field2584 = 2;
                class5.field85.method161((byte) 93, 147);
                class5.field85.method883(class48.field1100, (byte) -6);
                class5.field85.method876((byte) -48, var5);
            }
        }
        if (var4 == 1006) {
            class83.method635(var5, var3, true, var2);
            class5.field85.method161((byte) 113, 33);
            class112.field2404++;
            class5.field85.method902(var3 + class87.field1934, false);
            class5.field85.method866(arg1 ^ 0x2F3166F7, var2 + class18.field366);
            class5.field85.method866(-791766776, var5 >> 14 & 0x7FFF);
        }
        if (var4 == 8) {
            class76.field1691 = 1;
            class51.field1198 = var3;
            class79.field1825 = var2;
            class9.field170 = var5;
            class1.field6 = class129.method992(var5, -83).field2765;
            class95.field2097 = 0;
            if (class1.field6 == null) {
                class1.field6 = class122.field2641;
            }
            class30.field646 = true;
            return;
        }
        if (var4 == 12) {
            class90 var17 = class88.field1956[var5];
            if (var17 != null) {
                class122.field2608++;
                class51.method416(false, 0, 0, arg1 - 35, var17.field1466[0], 1, 2, class37.field848.field1487[0], 1, 0, class37.field848.field1466[0], var17.field1487[0]);
                class76.field1695 = class96.field2143;
                field2227 = class32.field680;
                class119.field2584 = 2;
                class125.field2722 = 0;
                class5.field85.method161((byte) 125, 212);
                class5.field85.method866(-791766776, var5);
            }
        }
        if (var4 == 34 || var4 == 27) {
            class28 var18 = class78.field1813[arg0];
            int var19 = var18.method203(class34.field771, (byte) -71);
            if (var19 != -1) {
                class28 var20 = var18.method218(var19 + 5, false).method213(97);
                class28 var21 = var20.method211((byte) 89).method212((byte) 124);
                boolean var22 = false;
                for (int var23 = 0; var23 < class74.field1641; var23++) {
                    class43 var24 = class129.field2779[class4.field66[var23]];
                    if (var24 != null && var24.field919 != null && var24.field919.method206(var21, true)) {
                        var22 = true;
                        class51.method416(false, 0, 0, -65, var24.field1466[0], 1, 2, class37.field848.field1487[0], 1, 0, class37.field848.field1466[0], var24.field1487[0]);
                        if (var4 == 34) {
                            class5.field85.method161((byte) 87, 235);
                            class79.field1823++;
                            class5.field85.method866(arg1 - 791766775, class4.field66[var23]);
                        }
                        if (var4 == 27) {
                            class32.field678++;
                            class5.field85.method161((byte) 81, 7);
                            class5.field85.method902(class4.field66[var23], false);
                        }
                        break;
                    }
                }
                if (!var22) {
                    class87.method645(121, class68.method537(1, new class28[] { class65.field1506, var21 }), class125.field2721, 0);
                }
            }
        }
        if (var4 == 29) {
            boolean var25 = class51.method416(false, 0, 0, arg1 ^ 0x11, var3, 0, 2, class37.field848.field1487[0], 0, 0, class37.field848.field1466[0], var2);
            class69.field1542++;
            if (!var25) {
                class51.method416(false, 0, 0, -57, var3, 1, 2, class37.field848.field1487[0], 1, 0, class37.field848.field1466[0], var2);
            }
            class119.field2584 = 2;
            class125.field2722 = 0;
            field2227 = class32.field680;
            class76.field1695 = class96.field2143;
            class5.field85.method161((byte) 97, 156);
            class5.field85.method866(-791766776, var5);
            class5.field85.method876((byte) -48, class18.field366 + var2);
            class5.field85.method866(-791766776, class87.field1934 + var3);
        }
        if (var4 == 36) {
            class28 var27 = class78.field1813[arg0];
            int var28 = var27.method203(class34.field771, (byte) -71);
            if (var28 != -1) {
                if (class40.field860 == -1) {
                    class117.method836(21);
                    if (class63.field1393 != -1) {
                        class125.field2719 = var27.method218(var28 + 5, false).method213(arg1 ^ 0xFFFFFF9E);
                        class57.field1311 = class40.field860 = class63.field1393;
                        class88.field1957 = false;
                    }
                } else {
                    class87.method645(-110, class90.field1977, class125.field2721, 0);
                }
            }
        }
        if (var4 == 1004) {
            int var29 = var5 >> 14 & 0x7FFF;
            class45 var30 = class72.method566(var29, -97);
            class28 var31;
            if (var30.field971 == null) {
                var31 = class68.method537(arg1 ^ 0xFFFFFFFE, new class28[] { class123.field2674, var30.field1008, class13.field231 });
            } else {
                var31 = var30.field971;
            }
            class87.method645(arg1 + 11, var31, class125.field2721, 0);
        }
        if (var4 == 51) {
            class28 var32 = class78.field1813[arg0];
            int var33 = var32.method203(class34.field771, (byte) -71);
            if (var33 != -1) {
                int var34 = -1;
                long var35 = var32.method218(var33 + 5, false).method213(97).method237(240);
                for (int var37 = 0; var37 < class36.field829; var37++) {
                    if (class1.field5[var37] == var35) {
                        var34 = var37;
                        break;
                    }
                }
                if (var34 != -1 && class61.field1348[var34] > 0) {
                    class114.field2439 = true;
                    class76.field1714 = 3;
                    class95.field2092 = true;
                    class23.field515 = 0;
                    class125.field2708 = class125.field2721;
                    class32.field686 = class1.field5[var34];
                    class125.field2718 = class68.method537(1, new class28[] { class4.field70, class93.field2048[var34] });
                }
            }
        }
        if (var4 == 23) {
            class5.field85.method161((byte) 127, 192);
            class80.field1846++;
            class5.field85.method861((byte) 121, var3);
            class5.field85.method866(arg1 ^ 0x2F3166F7, var2);
            class5.field85.method902(var5, false);
            class53.field1226 = var3;
            class69.field1545 = 2;
            class118.field2515 = var2;
            class8.field145 = 0;
            if (var3 >> 16 == class40.field860) {
                class69.field1545 = 1;
            }
            if (var3 >> 16 == class110.field2325) {
                class69.field1545 = 3;
            }
        }
        if (var4 == 37) {
            class90 var38 = class88.field1956[var5];
            if (var38 != null) {
                class3.field27++;
                class51.method416(false, 0, 0, -60, var38.field1466[0], 1, 2, class37.field848.field1487[0], 1, 0, class37.field848.field1466[0], var38.field1487[0]);
                class76.field1695 = class96.field2143;
                class125.field2722 = 0;
                field2227 = class32.field680;
                class119.field2584 = 2;
                class5.field85.method161((byte) 122, 164);
                class5.field85.method892(var5, 1815787688);
            }
        }
        if (var4 == 17) {
            class118.field2510++;
            boolean var39 = class51.method416(false, 0, 0, -121, var3, 0, 2, class37.field848.field1487[0], 0, 0, class37.field848.field1466[0], var2);
            if (!var39) {
                class51.method416(false, 0, 0, arg1 ^ 0x5C, var3, 1, 2, class37.field848.field1487[0], 1, 0, class37.field848.field1466[0], var2);
            }
            class125.field2722 = 0;
            class119.field2584 = 2;
            class76.field1695 = class96.field2143;
            field2227 = class32.field680;
            class5.field85.method161((byte) 119, 202);
            class5.field85.method876((byte) -48, var3 + class87.field1934);
            class5.field85.method866(arg1 - 791766775, var5);
            class5.field85.method902(class18.field366 + var2, false);
        }
        if (arg1 != -1) {
            method729(true);
        }
        if (var4 == 35) {
            class78 var41 = class5.method27(0, var3);
            class79.field1824 = var41.field1789;
            class76.field1691 = 0;
            class95.field2097 = 1;
            class28 var42 = var41.field1791;
            class30.field646 = true;
            class48.field1100 = var3;
            if (var42.method203(class62.field1380, (byte) -71) != -1) {
                var42 = var42.method228(var42.method203(class62.field1380, (byte) -71), true, 0);
            }
            class28 var43 = var41.field1791;
            if (var43.method203(class62.field1380, (byte) -71) != -1) {
                var43 = var43.method218(var43.method203(class62.field1380, (byte) -71) + 1, false);
            }
            class37.field843 = class68.method537(1, new class28[] { var42, class62.field1380, var41.field1758, class62.field1380, var43 });
            if (class79.field1824 == 16) {
                class30.field646 = true;
                class112.field2422 = true;
                class7.field120 = 3;
            }
            return;
        }
        if (var4 == 16) {
            class43 var44 = class129.field2779[var5];
            if (var44 != null) {
                class37.field831++;
                class51.method416(false, 0, 0, -44, var44.field1466[0], 1, 2, class37.field848.field1487[0], 1, 0, class37.field848.field1466[0], var44.field1487[0]);
                class76.field1695 = class96.field2143;
                class125.field2722 = 0;
                field2227 = class32.field680;
                class119.field2584 = 2;
                class5.field85.method161((byte) 78, 36);
                class5.field85.method902(var5, false);
            }
        }
        if (var4 == 2) {
            class49.field1136++;
            class5.field85.method161((byte) 98, 184);
            class5.field85.method898(var3, -1202576);
            class78 var45 = class5.method27(0, var3);
            if (var45.field1805 != null && var45.field1805[0][0] == 5) {
                int var46 = var45.field1805[0][1];
                class36.field818[var46] = 1 - class36.field818[var46];
                class3.method10(24166, var46);
                class30.field646 = true;
            }
        }
        if (var4 == 47) {
            class5.field85.method161((byte) 95, 194);
            class27.field576++;
            class5.field85.method876((byte) -48, var5);
            class5.field85.method883(var3, (byte) -6);
            class5.field85.method902(var2, false);
            class69.field1545 = 2;
            class53.field1226 = var3;
            class8.field145 = 0;
            class118.field2515 = var2;
            if (var3 >> 16 == class40.field860) {
                class69.field1545 = 1;
            }
            if (var3 >> 16 == class110.field2325) {
                class69.field1545 = 3;
            }
        }
        if (var4 == 5) {
            class5.field85.method161((byte) 118, 135);
            class112.field2411++;
            class5.field85.method902(var5, false);
            class5.field85.method883(var3, (byte) -6);
            class5.field85.method866(-791766776, var2);
            class8.field145 = 0;
            class69.field1545 = 2;
            class53.field1226 = var3;
            if (var3 >> 16 == class40.field860) {
                class69.field1545 = 1;
            }
            if (var3 >> 16 == class110.field2325) {
                class69.field1545 = 3;
            }
            class118.field2515 = var2;
        }
        if (var4 == 31) {
            if (class13.field243) {
                class11.field179.method789(var2 - 4, var3 + -4);
            } else {
                class11.field179.method789(class96.field2143 - 4, class32.field680 + -4);
            }
        }
        if (var4 == 25) {
            class49.field1136++;
            class5.field85.method161((byte) 92, 184);
            class5.field85.method898(var3, -1202576);
            class78 var47 = class5.method27(0, var3);
            if (var47.field1805 != null && var47.field1805[0][0] == 5) {
                int var48 = var47.field1805[0][1];
                if (class36.field818[var48] != var47.field1777[0]) {
                    class36.field818[var48] = var47.field1777[0];
                    class3.method10(arg1 + 24167, var48);
                    class30.field646 = true;
                }
            }
        }
        if (var4 == 1 && !class36.field794) {
            class65.field1461++;
            class5.field85.method161((byte) 91, 11);
            class36.field794 = true;
        }
        if (var4 == 39) {
            class5.field85.method161((byte) 103, 228);
            class5.field85.method852(127, var3);
            class5.field85.method902(var2, false);
            class5.field85.method876((byte) -48, var5);
            class47.field1068++;
            class53.field1226 = var3;
            class118.field2515 = var2;
            class8.field145 = 0;
            class69.field1545 = 2;
            if (var3 >> 16 == class40.field860) {
                class69.field1545 = 1;
            }
            if (var3 >> 16 == class110.field2325) {
                class69.field1545 = 3;
            }
        }
        if (var4 == 1005) {
            class90 var49 = class88.field1956[var5];
            if (var49 != null) {
                class106 var50 = var49.field1996;
                if (var50.field2245 != null) {
                    var50 = var50.method736(false);
                }
                if (var50 != null) {
                    class28 var51;
                    if (var50.field2251 == null) {
                        var51 = class68.method537(arg1 + 2, new class28[] { class123.field2674, var50.field2242, class13.field231 });
                    } else {
                        var51 = var50.field2251;
                    }
                    class87.method645(98, var51, class125.field2721, 0);
                }
            }
        }
        if (var4 == 41) {
            class5.field85.method161((byte) 86, 193);
            class93.field2052++;
            class5.field85.method852(arg1 ^ 0xFFFFFF81, var3);
            class5.field85.method892(var2, arg1 ^ 0x93C54757);
            class5.field85.method866(-791766776, var5);
            class118.field2515 = var2;
            class69.field1545 = 2;
            class8.field145 = 0;
            class53.field1226 = var3;
            if (var3 >> 16 == class40.field860) {
                class69.field1545 = 1;
            }
            if (var3 >> 16 == class110.field2325) {
                class69.field1545 = 3;
            }
        }
        if (var4 == 7 && class83.method635(var5, var3, true, var2)) {
            class5.field85.method161((byte) 97, 44);
            class5.field85.method902(class9.field170, false);
            class5.field85.method892(var5 >> 14 & 0x7FFF, 1815787688);
            class5.field85.method876((byte) -48, class79.field1825);
            class5.field85.method876((byte) -48, class87.field1934 + var3);
            class5.field85.method852(126, class51.field1198);
            class15.field277++;
            class5.field85.method902(class18.field366 + var2, false);
        }
        if (var4 == 56) {
            class5.field85.method161((byte) 98, 199);
            class16.field313++;
            class5.field85.method876((byte) -48, var2);
            class5.field85.method898(var3, -1202576);
            class5.field85.method876((byte) -48, var5);
            class8.field145 = 0;
            class69.field1545 = 2;
            if (var3 >> 16 == class40.field860) {
                class69.field1545 = 1;
            }
            class118.field2515 = var2;
            class53.field1226 = var3;
            if (var3 >> 16 == class110.field2325) {
                class69.field1545 = 3;
            }
        }
        if (var4 == 9) {
            class70.field1560++;
            boolean var52 = class51.method416(false, 0, 0, -72, var3, 0, 2, class37.field848.field1487[0], 0, 0, class37.field848.field1466[0], var2);
            if (!var52) {
                class51.method416(false, 0, 0, -50, var3, 1, 2, class37.field848.field1487[0], 1, 0, class37.field848.field1466[0], var2);
            }
            class125.field2722 = 0;
            class119.field2584 = 2;
            class76.field1695 = class96.field2143;
            field2227 = class32.field680;
            class5.field85.method161((byte) 84, 200);
            class5.field85.method876((byte) -48, class87.field1934 + var3);
            class5.field85.method876((byte) -48, class18.field366 + var2);
            class5.field85.method892(var5, 1815787688);
        }
        if (var4 == 14) {
            class90 var54 = class88.field1956[var5];
            if (var54 != null) {
                class51.method416(false, 0, 0, arg1 ^ 0x36, var54.field1466[0], 1, 2, class37.field848.field1487[0], 1, 0, class37.field848.field1466[0], var54.field1487[0]);
                class125.field2722 = 0;
                class119.field2584 = 2;
                field2214++;
                field2227 = class32.field680;
                class76.field1695 = class96.field2143;
                class5.field85.method161((byte) 81, 133);
                class5.field85.method866(-791766776, var5);
            }
        }
        if (var4 == 19) {
            class90 var55 = class88.field1956[var5];
            if (var55 != null) {
                class31.field657++;
                class51.method416(false, 0, 0, -82, var55.field1466[0], 1, 2, class37.field848.field1487[0], 1, 0, class37.field848.field1466[0], var55.field1487[0]);
                class76.field1695 = class96.field2143;
                class119.field2584 = 2;
                field2227 = class32.field680;
                class125.field2722 = 0;
                class5.field85.method161((byte) 80, 101);
                class5.field85.method898(class48.field1100, -1202576);
                class5.field85.method902(var5, false);
            }
        }
        if (var4 == 6) {
            class37.field832++;
            class83.method635(var5, var3, true, var2);
            class5.field85.method161((byte) 116, 3);
            class5.field85.method876((byte) -48, class18.field366 + var2);
            class5.field85.method902(class87.field1934 + var3, false);
            class5.field85.method892(var5 >> 14 & 0x7FFF, arg1 + 1815787689);
        }
        if (var4 == 1002) {
            class129 var56 = class129.method992(var5, arg1 ^ 0xC);
            class28 var57;
            if (var56.field2775 == null) {
                var57 = class68.method537(arg1 + 2, new class28[] { class123.field2674, var56.field2765, class13.field231 });
            } else {
                var57 = var56.field2775;
            }
            class87.method645(119, var57, class125.field2721, 0);
        }
        if (var4 == 48) {
            class43 var58 = class129.field2779[var5];
            if (var58 != null) {
                class51.method416(false, 0, 0, -18, var58.field1466[0], 1, 2, class37.field848.field1487[0], 1, 0, class37.field848.field1466[0], var58.field1487[0]);
                class125.field2722 = 0;
                class32.field678++;
                class119.field2584 = 2;
                class76.field1695 = class96.field2143;
                field2227 = class32.field680;
                class5.field85.method161((byte) 97, 7);
                class5.field85.method902(var5, false);
            }
        }
        if (var4 == 33) {
            class5.field85.method161((byte) 115, 142);
            class5.field85.method866(arg1 ^ 0x2F3166F7, var2);
            class112.field2415++;
            class5.field85.method866(-791766776, class9.field170);
            class5.field85.method866(-791766776, var5);
            class5.field85.method902(class79.field1825, false);
            class5.field85.method852(127, var3);
            class5.field85.method852(127, class51.field1198);
            class69.field1545 = 2;
            class118.field2515 = var2;
            class8.field145 = 0;
            class53.field1226 = var3;
            if (var3 >> 16 == class40.field860) {
                class69.field1545 = 1;
            }
            if (var3 >> 16 == class110.field2325) {
                class69.field1545 = 3;
            }
        }
        if (var4 == 52) {
            class8.field128++;
            class83.method635(var5, var3, true, var2);
            class5.field85.method161((byte) 88, 165);
            class5.field85.method902(var3 + class87.field1934, false);
            class5.field85.method866(-791766776, class18.field366 + var2);
            class5.field85.method892(var5 >> 14 & 0x7FFF, 1815787688);
        }
        if (var4 == 20) {
            class5.field85.method161((byte) 88, 220);
            class5.field85.method892(var5, arg1 + 1815787689);
            class5.field85.method876((byte) -48, var2);
            class5.field85.method883(var3, (byte) -6);
            class8.field145 = 0;
            class53.field1226 = var3;
            class118.field2515 = var2;
            class69.field1545 = 2;
            class63.field1413++;
            if (var3 >> 16 == class40.field860) {
                class69.field1545 = 1;
            }
            if (var3 >> 16 == class110.field2325) {
                class69.field1545 = 3;
            }
        }
        if (var4 == 26) {
            class74.field1627++;
            class83.method635(var5, var3, true, var2);
            class5.field85.method161((byte) 80, 139);
            class5.field85.method892(var3 + class87.field1934, arg1 ^ 0x93C54757);
            class5.field85.method902(class18.field366 + var2, false);
            class5.field85.method866(arg1 - 791766775, var5 >> 14 & 0x7FFF);
        }
        if (var4 == 54) {
            class43 var59 = class129.field2779[var5];
            if (var59 != null) {
                class77.field1728++;
                class51.method416(false, 0, 0, -33, var59.field1466[0], 1, 2, class37.field848.field1487[0], 1, 0, class37.field848.field1466[0], var59.field1487[0]);
                field2227 = class32.field680;
                class125.field2722 = 0;
                class119.field2584 = 2;
                class76.field1695 = class96.field2143;
                class5.field85.method161((byte) 89, 190);
                class5.field85.method902(var5, false);
            }
        }
        if (var4 == 55) {
            class90 var60 = class88.field1956[var5];
            if (var60 != null) {
                class51.method416(false, 0, 0, -96, var60.field1466[0], 1, 2, class37.field848.field1487[0], 1, 0, class37.field848.field1466[0], var60.field1487[0]);
                field2227 = class32.field680;
                class76.field1695 = class96.field2143;
                class119.field2584 = 2;
                class83.field1884++;
                class125.field2722 = 0;
                class5.field85.method161((byte) 82, 185);
                class5.field85.method902(var5, false);
            }
        }
        if (var4 == 43) {
            class22.field507++;
            class5.field85.method161((byte) 86, 29);
            class5.field85.method892(var2, arg1 + 1815787689);
            class5.field85.method876((byte) -48, var5);
            class5.field85.method861((byte) -34, var3);
            class69.field1545 = 2;
            if (var3 >> 16 == class40.field860) {
                class69.field1545 = 1;
            }
            class118.field2515 = var2;
            class53.field1226 = var3;
            if (var3 >> 16 == class110.field2325) {
                class69.field1545 = 3;
            }
            class8.field145 = 0;
        }
        if (var4 == 40) {
            class90 var61 = class88.field1956[var5];
            if (var61 != null) {
                class31.field672++;
                class51.method416(false, 0, 0, arg1 ^ 0x2E, var61.field1466[0], 1, 2, class37.field848.field1487[0], 1, 0, class37.field848.field1466[0], var61.field1487[0]);
                field2227 = class32.field680;
                class76.field1695 = class96.field2143;
                class125.field2722 = 0;
                class119.field2584 = 2;
                class5.field85.method161((byte) 124, 4);
                class5.field85.method876((byte) -48, var5);
                class5.field85.method876((byte) -48, class79.field1825);
                class5.field85.method898(class51.field1198, arg1 ^ 0x12598F);
                class5.field85.method892(class9.field170, 1815787688);
            }
        }
        if (var4 == 50 && class83.method635(var5, var3, true, var2)) {
            class5.field85.method161((byte) 106, 116);
            class5.field85.method876((byte) -48, class87.field1934 + var3);
            class5.field85.method892(class18.field366 + var2, 1815787688);
            class5.field85.method892(var5 >> 14 & 0x7FFF, 1815787688);
            class5.field85.method883(class48.field1100, (byte) -6);
            class79.field1841++;
        }
        if (var4 == 49) {
            class90 var62 = class88.field1956[var5];
            if (var62 != null) {
                class15.field290++;
                class51.method416(false, 0, 0, arg1 - 64, var62.field1466[0], 1, 2, class37.field848.field1487[0], 1, 0, class37.field848.field1466[0], var62.field1487[0]);
                class76.field1695 = class96.field2143;
                field2227 = class32.field680;
                class125.field2722 = 0;
                class119.field2584 = 2;
                class5.field85.method161((byte) 117, 110);
                class5.field85.method866(-791766776, var5);
            }
        }
        if (var4 == 38) {
            class53.field1218++;
            boolean var63 = class51.method416(false, 0, 0, -116, var3, 0, 2, class37.field848.field1487[0], 0, 0, class37.field848.field1466[0], var2);
            if (!var63) {
                class51.method416(false, 0, 0, -66, var3, 1, 2, class37.field848.field1487[0], 1, 0, class37.field848.field1466[0], var2);
            }
            field2227 = class32.field680;
            class76.field1695 = class96.field2143;
            class119.field2584 = 2;
            class125.field2722 = 0;
            class5.field85.method161((byte) 99, 131);
            class5.field85.method876((byte) -48, class87.field1934 + var3);
            class5.field85.method866(-791766776, var5);
            class5.field85.method876((byte) -48, class18.field366 + var2);
        }
        if (var4 == 1003) {
            class129 var65 = class129.method992(var5, arg1 ^ 0x71);
            class78 var66 = class5.method27(0, var3);
            class28 var67;
            if (var66 != null && var66.field1792[var2] >= 100000) {
                var67 = class68.method537(arg1 + 2, new class28[] { class5.method25(6366, var66.field1792[var2]), client.field400, var65.field2765 });
            } else if (var65.field2775 == null) {
                var67 = class68.method537(1, new class28[] { class123.field2674, var65.field2765, class13.field231 });
            } else {
                var67 = var65.field2775;
            }
            class87.method645(-101, var67, class125.field2721, 0);
        }
        if (var4 == 46) {
            class117.method836(114);
        }
        if (var4 == 11) {
            class119.field2566++;
            class83.method635(var5, var3, true, var2);
            class5.field85.method161((byte) 92, 222);
            class5.field85.method892(class87.field1934 + var3, 1815787688);
            class5.field85.method902(var5 >> 14 & 0x7FFF, false);
            class5.field85.method866(arg1 - 791766775, class18.field366 + var2);
        }
        if (var4 == 4) {
            class5.field85.method161((byte) 100, 66);
            class5.field85.method866(-791766776, var2);
            class45.field970++;
            class5.field85.method883(var3, (byte) -6);
            class5.field85.method876((byte) -48, var5);
            class5.field85.method898(class48.field1100, -1202576);
            class118.field2515 = var2;
            class8.field145 = 0;
            class53.field1226 = var3;
            class69.field1545 = 2;
            if (var3 >> 16 == class40.field860) {
                class69.field1545 = 1;
            }
            if (var3 >> 16 == class110.field2325) {
                class69.field1545 = 3;
            }
        }
        if (var4 == 10) {
            class14.method79(156, class1.field13);
            class95.field2092 = true;
            class1.field13 = -1;
        }
        if (var4 == 32) {
            class43 var68 = class129.field2779[var5];
            if (var68 != null) {
                class51.method416(false, 0, 0, -128, var68.field1466[0], 1, 2, class37.field848.field1487[0], 1, 0, class37.field848.field1466[0], var68.field1487[0]);
                class20.field448++;
                class119.field2584 = 2;
                class76.field1695 = class96.field2143;
                field2227 = class32.field680;
                class125.field2722 = 0;
                class5.field85.method161((byte) 91, 214);
                class5.field85.method902(class9.field170, false);
                class5.field85.method852(126, class51.field1198);
                class5.field85.method876((byte) -48, class79.field1825);
                class5.field85.method892(var5, 1815787688);
            }
        }
        if (var4 == 13 || var4 == 45 || var4 == 28 || var4 == 30) {
            class28 var69 = class78.field1813[arg0];
            int var70 = var69.method203(class34.field771, (byte) -71);
            if (var70 != -1) {
                long var71 = var69.method218(var70 + 5, false).method213(97).method237(arg1 ^ 0xFFFFFF0F);
                if (var4 == 13) {
                    class69.method540(arg1 ^ 0x328D, var71);
                }
                if (var4 == 45) {
                    class18.method105(127, var71);
                }
                if (var4 == 28) {
                    class88.method653(var71, (byte) -66);
                }
                if (var4 == 30) {
                    class27.method195((byte) -107, var71);
                }
            }
        }
        if (var4 == 24) {
            class127.field2745++;
            class5.field85.method161((byte) 84, 79);
            class5.field85.method883(var3, (byte) -6);
            class5.field85.method902(var5, false);
            class5.field85.method876((byte) -48, var2);
            class53.field1226 = var3;
            class69.field1545 = 2;
            class118.field2515 = var2;
            if (var3 >> 16 == class40.field860) {
                class69.field1545 = 1;
            }
            if (var3 >> 16 == class110.field2325) {
                class69.field1545 = 3;
            }
            class8.field145 = 0;
        }
        if (class76.field1691 != 0) {
            class30.field646 = true;
            class76.field1691 = 0;
        }
        if (class95.field2097 != 0) {
            class95.field2097 = 0;
            class30.field646 = true;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method728(int arg0) {
        field2220 = null;
        field2221 = null;
        field2219 = null;
        field2224 = null;
        field2216 = null;
        field2225 = null;
        field2211 = null;
        field2213 = null;
        if (arg0 != 0) {
            field2225 = null;
        }
        field2210 = null;
        field2218 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)V")
    public static final void method729(boolean arg0) {
        field2209++;
        int var1 = class61.field1345;
        int var2 = class68.field1536;
        int var3 = class31.field661;
        int var4 = class112.field2407;
        int var5 = 6116423;
        class120.method915(var1, var2, var3, var4, var5);
        class120.method915(var1 + 1, var2 + 1, var3 - 2, 16, 0);
        class120.method911(var1 + 1, var2 + 18, var3 - 2, var4 + -19, 0);
        class126.field2737.method449(class109.field2293, var1 + 3, var2 + 14, var5);
        int var6 = class88.field1960;
        int var7 = class23.field530;
        if (class75.field1671 == 0) {
            var6 -= 4;
            var7 -= 4;
        }
        if (class75.field1671 == 1) {
            var6 -= 205;
            var7 -= 553;
        }
        if (class75.field1671 == 2) {
            var7 -= 17;
            var6 -= 357;
        }
        if (arg0) {
            method729(true);
        }
        for (int var8 = 0; var8 < class114.field2435; var8++) {
            int var9 = (class114.field2435 - var8 - 1) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var7 > var1 && var1 + var3 > var7 && var9 - 13 < var6 && var6 < var9 + 3) {
                var10 = 16776960;
            }
            class126.field2737.method441(class78.field1813[var8], var1 + 3, var9, var10, true);
        }
    }
}
