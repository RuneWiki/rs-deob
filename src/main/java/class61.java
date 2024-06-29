import java.awt.Image;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public abstract class class61 {

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "Lfc;")
    public static class39 field1488 = class90.method774(")3", -95);

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "Lfc;")
    public static class39 field1489 = class90.method774("Ignorieren", -113);

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "Lfc;")
    public static class39 field1487 = class90.method774("blaugr-Un:", -93);

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "Lfc;")
    private static class39 field1495 = class90.method774("level)2", -86);

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "[I")
    public static int[] field1492 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "Lfc;")
    public static class39 field1496 = null;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "[[I")
    public static int[][] field1493 = new int[104][104];

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "Lfc;")
    public static class39 field1490 = class90.method774("Ihr Spielkonto wird bereits benutzt)3", -103);

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "Lfc;")
    public static class39 field1499 = field1495;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "Lfc;")
    private static class39 field1502 = class90.method774("Select", -91);

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "Lfc;")
    public static class39 field1501 = field1502;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    public static int field1506 = -1;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    public static int field1498;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "Loc;")
    public static class100 field1497;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "Loc;")
    public static class100 field1500;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "Ljava/awt/Image;")
    public static Image field1491;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "[I")
    public static int[] field1504;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)Z", line = 74)
    public static final boolean method606(int arg0) {
        field1498++;
        if (class115.field3015 == null) {
            return false;
        }
        try {
            int var1 = class115.field3015.method1138((byte) -47);
            if (var1 == 0) {
                return false;
            }
            if (class43.field1172 == -1) {
                var1--;
                class115.field3015.method1141(true, 0, class39.field1065.field711, 1);
                class39.field1065.field710 = 0;
                class43.field1172 = class39.field1065.method394((byte) -85);
                class128.field3275 = class75.field1728[class43.field1172];
            }
            if (class128.field3275 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                var1--;
                class115.field3015.method1141(true, 0, class39.field1065.field711, 1);
                class128.field3275 = class39.field1065.field711[0] & 0xFF;
            }
            if (class128.field3275 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                var1 -= 2;
                class115.field3015.method1141(true, 0, class39.field1065.field711, 2);
                class39.field1065.field710 = 0;
                class128.field3275 = class39.field1065.method301(-4853);
            }
            if (class128.field3275 > var1) {
                return false;
            }
            class39.field1065.field710 = 0;
            class115.field3015.method1141(true, 0, class39.field1065.field711, class128.field3275);
            class44.field1207 = 0;
            class88.field2057 = class37.field1001;
            class37.field1001 = client.field578;
            client.field578 = class43.field1172;
            if (class43.field1172 == 126) {
                long var2 = class39.field1065.method319((byte) 32);
                int var4 = class39.field1065.method301(-4853);
                class39.field1065.method293(-110);
                boolean var5 = false;
                if ((var2 & Long.MIN_VALUE) != 0L) {
                    var5 = true;
                }
                if (var5) {
                    if (class50.field1266 == 0) {
                        class43.field1172 = -1;
                        return true;
                    }
                    long var9 = var2 & Long.MAX_VALUE;
                    boolean var11 = false;
                    int var12;
                    for (var12 = 0; var12 < class50.field1266 && (class94.field2208[var12].field3619 != var9 || class94.field2208[var12].field1711 != var4); var12++) {
                    }
                    if (class50.field1266 > var12) {
                        while (var12 < class50.field1266 - 1) {
                            class94.field2208[var12] = class94.field2208[var12 + 1];
                            var12++;
                        }
                        class94.field2208[class50.field1266] = null;
                        class50.field1266--;
                    }
                } else if (class50.field1266 < 100) {
                    class74 var6 = new class74();
                    var6.field3619 = var2;
                    var6.field1714 = class27.method345((byte) -54, var6.field3619);
                    var6.field1711 = var4;
                    int var7;
                    for (var7 = class50.field1266 - 1; var7 >= 0; var7--) {
                        int var8 = class94.field2208[var7].field1714.method454(-1, var6.field1714);
                        System.out.println("co=" + var8);
                        if (var8 == 0) {
                            class43.field1172 = -1;
                            return true;
                        }
                        if (var8 < 0) {
                            break;
                        }
                        class94.field2208[var7 + 1] = class94.field2208[var7];
                    }
                    class94.field2208[var7 + 1] = var6;
                    class50.field1266++;
                } else {
                    class43.field1172 = -1;
                    return true;
                }
                class43.field1172 = -1;
                class72.field1687 = class70.field1654;
                return true;
            }
            if (class43.field1172 == 50) {
                class104.field2638 = true;
                int var13 = class39.field1065.method313((byte) 70);
                int var14 = class39.field1065.method301(-4853);
                if (var13 < -70000) {
                    var14 += 32768;
                }
                class99 var15;
                if (var13 >= 0) {
                    var15 = class54.method567(89, var13);
                } else {
                    var15 = null;
                }
                if (var15 != null) {
                    for (int var16 = 0; var16 < var15.field2340.length; var16++) {
                        var15.field2340[var16] = 0;
                        var15.field2422[var16] = 0;
                    }
                }
                class56.method580(11730, var14);
                int var17 = class39.field1065.method301(-4853);
                for (int var18 = 0; var18 < var17; var18++) {
                    int var19 = class39.field1065.method320(false);
                    int var20 = class39.field1065.method298(-15432);
                    if (var20 == 255) {
                        var20 = class39.field1065.method311(255);
                    }
                    if (var15 != null && var15.field2340.length > var18) {
                        var15.field2340[var18] = var19;
                        var15.field2422[var18] = var20;
                    }
                    class55.method577(var20, var14, -1403, var18, var19 - 1);
                }
                class30.field858 = class70.field1654;
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 0) {
                for (int var21 = 0; var21 < class75.field1725; var21++) {
                    class38 var22 = class89.method755((byte) 47, var21);
                    if (var22 != null && var22.field1021 == 0) {
                        class27.field776[var21] = 0;
                        class110.field2834[var21] = 0;
                    }
                }
                class104.field2638 = true;
                class43.field1172 = -1;
                if (class126.field3203 != -1) {
                    class128.field3242 = true;
                }
                class72.field1687 = class70.field1654;
                return true;
            }
            if (class43.field1172 == 14) {
                int var23 = class39.field1065.method321((byte) 123);
                int var24 = class39.field1065.method322((byte) -50);
                int var25 = class39.field1065.method322((byte) -50);
                class24.field661 = var25 >> 1;
                class94.field2197.method975(var24, (var25 & 0x1) == 1, 21, var23);
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 231) {
                class39.field1065.method301(-4853);
                class39.field1065.method298(-15432);
                class39.field1065.method332(15252);
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 111) {
                long var26 = class39.field1065.method319((byte) 91);
                long var28 = (long) class39.field1065.method301(-4853);
                long var30 = (long) class39.field1065.method310(true);
                boolean var32 = false;
                long var33 = (var28 << 32) + var30;
                int var35 = class39.field1065.method322((byte) -50);
                for (int var36 = 0; var36 < 100; var36++) {
                    if (class126.field3209[var36] == var33) {
                        var32 = true;
                        break;
                    }
                }
                if (var35 <= 1) {
                    for (int var37 = 0; var37 < class57.field1414; var37++) {
                        if (class79.field1795[var37] == var26) {
                            var32 = true;
                            break;
                        }
                    }
                }
                if (!var32 && class146.field3632 == 0) {
                    class126.field3209[class153.field3770] = var33;
                    class153.field3770 = (class153.field3770 + 1) % 100;
                    class39 var38 = class84.method708(class114.method997(class39.field1065, -48).method450(true));
                    if (var35 == 2 || var35 == 3) {
                        class28.method346(7, (byte) 105, var38, class137.method1111(new class39[] { class43.field1177, class27.method345((byte) -54, var26).method447(-98) }, (byte) 112));
                    } else if (var35 == 1) {
                        class28.method346(7, (byte) 72, var38, class137.method1111(new class39[] { class89.field2091, class27.method345((byte) -54, var26).method447(-98) }, (byte) 123));
                    } else {
                        class28.method346(3, (byte) 76, var38, class27.method345((byte) -54, var26).method447(-98));
                    }
                }
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 240) {
                class97.field2292 = true;
                class55.field1372 = class39.field1065.method322((byte) -50);
                class88.field2059 = class39.field1065.method322((byte) -50);
                class29.field832 = class39.field1065.method301(-4853);
                class86.field1923 = class39.field1065.method322((byte) -50);
                class6.field203 = class39.field1065.method322((byte) -50);
                if (class6.field203 >= 100) {
                    class78.field1778 = class88.field2059 * 128 + 64;
                    class87.field2022 = class55.field1372 * 128 + 64;
                    class104.field2631 = class153.method1225(128, class78.field1778, class24.field661, class87.field2022) - class29.field832;
                }
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 103) {
                int var39 = class39.field1065.method291(2);
                if (var39 >= 0) {
                    class89.method762((byte) 75, var39);
                }
                if (class2.field36 != var39) {
                    class116.method1012(class2.field36, (byte) 127);
                    class2.field36 = var39;
                }
                class82.method690((byte) -60, class2.field36);
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 65) {
                class94.field2203 = class39.field1065.method322((byte) -50);
                class92.field2164 = class39.field1065.method322((byte) -50);
                class13.field349 = class39.field1065.method322((byte) -50);
                client.field561 = true;
                class128.field3242 = true;
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 5) {
                class10.method136(-111, class128.field3275, class83.field1850, class39.field1065);
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 162) {
                int var40 = class39.field1065.method292(-128);
                int var41 = class39.field1065.method307(12);
                class27.field776[var40] = var41;
                if (class110.field2834[var40] != var41) {
                    class110.field2834[var40] = var41;
                    class78.method680(125, var40);
                    if (class126.field3203 != -1) {
                        class128.field3242 = true;
                    }
                    class104.field2638 = true;
                }
                class72.field1687 = class70.field1654;
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 254) {
                class56.field1410 = class39.field1065.method298(-15432);
                if (class56.field1410 == class104.field2633) {
                    if (class56.field1410 == 3) {
                        class104.field2633 = 1;
                    } else {
                        class104.field2633 = 3;
                    }
                    class104.field2638 = true;
                }
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 104) {
                int var42 = class39.field1065.method292(-128);
                int var43 = class39.field1065.method307(12);
                int var44 = class39.field1065.method320(false);
                class99 var45 = class54.method567(58, var43);
                var45.field2426 = (var44 << 16) + var42;
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 199) {
                for (int var46 = 0; var46 < class101.field2525.length; var46++) {
                    if (class101.field2525[var46] != null) {
                        class101.field2525[var46].field2888 = -1;
                    }
                }
                for (int var47 = 0; var47 < class118.field3092.length; var47++) {
                    if (class118.field3092[var47] != null) {
                        class118.field3092[var47].field2888 = -1;
                    }
                }
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 7) {
                class104.field2638 = true;
                int var48 = class39.field1065.method313((byte) -86);
                int var49 = class39.field1065.method301(-4853);
                class99 var50;
                if (var48 < 0) {
                    var50 = null;
                } else {
                    var50 = class54.method567(62, var48);
                }
                if (var48 < -70000) {
                    var49 += 32768;
                }
                while (class39.field1065.field710 < class128.field3275) {
                    int var51 = class39.field1065.method324(false);
                    int var52 = 0;
                    int var53 = class39.field1065.method301(-4853);
                    if (var53 != 0) {
                        var52 = class39.field1065.method322((byte) -50);
                        if (var52 == 255) {
                            var52 = class39.field1065.method313((byte) 84);
                        }
                    }
                    if (var50 != null && var51 >= 0 && var51 < var50.field2340.length) {
                        var50.field2340[var51] = var53;
                        var50.field2422[var51] = var52;
                    }
                    class55.method577(var52, var49, -1403, var51, var53 - 1);
                }
                class30.field858 = class70.field1654;
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 145) {
                int var54 = class39.field1065.method313((byte) 10);
                class39 var55 = class39.field1065.method304(-126);
                class99 var56 = class54.method567(83, var54);
                var56.field2427 = var55;
                if (var54 >> 16 == class25.field740[class104.field2633]) {
                    class104.field2638 = true;
                }
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 1) {
                class3.field84 = class39.field1065.method322((byte) -50);
                if (class3.field84 == 1) {
                    class134.field3378 = class39.field1065.method301(-4853);
                }
                if (class3.field84 >= 2 && class3.field84 <= 6) {
                    if (class3.field84 == 2) {
                        class12.field324 = 64;
                        class128.field3265 = 64;
                    }
                    if (class3.field84 == 3) {
                        class128.field3265 = 64;
                        class12.field324 = 0;
                    }
                    if (class3.field84 == 4) {
                        class128.field3265 = 64;
                        class12.field324 = 128;
                    }
                    if (class3.field84 == 5) {
                        class12.field324 = 64;
                        class128.field3265 = 0;
                    }
                    if (class3.field84 == 6) {
                        class12.field324 = 64;
                        class128.field3265 = 128;
                    }
                    class3.field84 = 2;
                    class107.field2676 = class39.field1065.method301(-4853);
                    class80.field1808 = class39.field1065.method301(-4853);
                    class142.field3558 = class39.field1065.method322((byte) -50);
                }
                if (class3.field84 == 10) {
                    class76.field1740 = class39.field1065.method301(-4853);
                }
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 117) {
                int var57 = class39.field1065.method318(106);
                if (class126.field3203 != var57) {
                    class116.method1012(class126.field3203, (byte) 70);
                    class126.field3203 = var57;
                }
                class128.field3242 = true;
                class82.method690((byte) -60, class126.field3203);
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 188) {
                class39 var58 = class39.field1065.method304(-127);
                if (var58.method451((byte) 104, class117.field3069)) {
                    class39 var70 = var58.method456(0, 0, var58.method471(class6.field190, (byte) -62));
                    long var71 = var70.method445((byte) 69);
                    boolean var73 = false;
                    for (int var74 = 0; var74 < class57.field1414; var74++) {
                        if (class79.field1795[var74] == var71) {
                            var73 = true;
                            break;
                        }
                    }
                    if (!var73 && class146.field3632 == 0) {
                        class28.method346(4, (byte) 98, class5.field163, var70);
                    }
                } else if (var58.method451((byte) 104, class140.field3541)) {
                    class39 var65 = var58.method456(0, 0, var58.method471(class6.field190, (byte) -62));
                    long var66 = var65.method445((byte) 69);
                    boolean var68 = false;
                    for (int var69 = 0; var69 < class57.field1414; var69++) {
                        if (class79.field1795[var69] == var66) {
                            var68 = true;
                            break;
                        }
                    }
                    if (!var68 && class146.field3632 == 0) {
                        class28.method346(8, (byte) 111, class115.field3019, var65);
                    }
                } else if (var58.method451((byte) 112, class111.field2899)) {
                    class39 var59 = var58.method456(0, 0, var58.method471(class6.field190, (byte) -62));
                    long var60 = var59.method445((byte) 69);
                    boolean var62 = false;
                    for (int var63 = 0; var63 < class57.field1414; var63++) {
                        if (class79.field1795[var63] == var60) {
                            var62 = true;
                            break;
                        }
                    }
                    if (!var62 && class146.field3632 == 0) {
                        class39 var64 = var58.method456(0, var58.method471(class6.field190, (byte) -62) + 1, var58.method437(-101) + -9);
                        class28.method346(8, (byte) 82, var64, var59);
                    }
                } else {
                    class28.method346(0, (byte) 95, var58, class107.field2693);
                }
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 62) {
                if (class37.field1008 != -1) {
                    class116.method1012(class37.field1008, (byte) 107);
                    class37.field1008 = -1;
                }
                class128.field3254 = false;
                class43.field1172 = -1;
                class107.field2702 = class107.field2693;
                class119.field3107 = 1;
                class128.field3242 = true;
                return true;
            }
            if (class43.field1172 == 224) {
                int var75 = class39.field1065.method332(15252);
                int var76 = class39.field1065.method320(false);
                class99 var77 = class54.method567(71, var75);
                class43.field1172 = -1;
                var77.field2395 = 2;
                var77.field2431 = var76;
                return true;
            }
            if (class43.field1172 == 138) {
                int var78 = class39.field1065.method311(255);
                class101.field2523 = class83.field1850.method1080(0, var78);
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 48) {
                int var79 = class39.field1065.method313((byte) 110);
                int var80 = class39.field1065.method320(false);
                class99 var81 = class54.method567(51, var79);
                if (var81 != null && var81.field2452 == 0) {
                    if (var80 > var81.field2361 - var81.field2381) {
                        var80 = var81.field2361 - var81.field2381;
                    }
                    if (var80 < 0) {
                        var80 = 0;
                    }
                    var81.field2447 = var80;
                }
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 135) {
                int var82 = class39.field1065.method292(-128);
                int var83 = class39.field1065.method321((byte) 86);
                if (var82 == 65535) {
                    var82 = -1;
                }
                if (class25.field740[var83] == var82) {
                    class53.method558(class25.field740[var83], (byte) -105);
                } else {
                    class116.method1012(class25.field740[var83], (byte) 79);
                    class25.field740[var83] = var82;
                }
                class142.field3564 = true;
                class104.field2638 = true;
                class82.method690((byte) -60, class25.field740[var83]);
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 129) {
                long var84 = class39.field1065.method319((byte) -117);
                class39 var86 = class84.method708(class114.method997(class39.field1065, -93).method450(true));
                class28.method346(6, (byte) 77, var86, class27.method345((byte) -54, var84).method447(-98));
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 149) {
                class43.field1172 = -1;
                class72.field1683 = 0;
                return true;
            }
            if (class43.field1172 == 161) {
                class57.field1414 = class128.field3275 / 8;
                for (int var87 = 0; var87 < class57.field1414; var87++) {
                    class79.field1795[var87] = class39.field1065.method319((byte) 49);
                }
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 253) {
                if (class37.field1018 != -1) {
                    class116.method1012(class37.field1018, (byte) 122);
                    class142.field3564 = true;
                    class37.field1018 = -1;
                    class104.field2638 = true;
                }
                if (class37.field1008 != -1) {
                    class116.method1012(class37.field1008, (byte) 67);
                    class37.field1008 = -1;
                    class128.field3242 = true;
                }
                if (class78.field1777 != -1) {
                    class116.method1012(class78.field1777, (byte) 86);
                    class78.field1777 = -1;
                    class114.method990((byte) -118, 30);
                }
                if (class108.field2708 != -1) {
                    class116.method1012(class108.field2708, (byte) 92);
                    class108.field2708 = -1;
                }
                if (class126.field3198 != -1) {
                    class116.method1012(class126.field3198, (byte) 120);
                    class126.field3198 = -1;
                }
                class43.field1172 = -1;
                if (class119.field3107 != 0) {
                    class119.field3107 = 0;
                    class128.field3242 = true;
                }
                class37.field1010 = -1;
                return true;
            }
            if (class43.field1172 == 197) {
                long var88 = class39.field1065.method319((byte) -112);
                byte var90 = class39.field1065.method293(-115);
                long var91 = class39.field1065.method319((byte) -114);
                long var93 = (long) class39.field1065.method301(-4853);
                long var95 = (long) class39.field1065.method310(true);
                int var97 = class39.field1065.method322((byte) -50);
                boolean var98 = false;
                long var99 = (var93 << 32) + var95;
                for (int var101 = 0; var101 < 100; var101++) {
                    if (class126.field3209[var101] == var99) {
                        var98 = true;
                        break;
                    }
                }
                if (var97 <= 1) {
                    for (int var102 = 0; var102 < class57.field1414; var102++) {
                        if (class79.field1795[var102] == var88) {
                            var98 = true;
                            break;
                        }
                    }
                }
                if (!var98 && class146.field3632 == 0) {
                    class126.field3209[class153.field3770] = var99;
                    class153.field3770 = (class153.field3770 + 1) % 100;
                    class39 var103 = class84.method708(class114.method997(class39.field1065, -42).method450(true));
                    class39 var104 = class137.method1111(new class39[] { class110.field2849, class27.method345((byte) -54, var91), class39.field1108, class86.method734(var90, 2218), class16.field472 }, (byte) -124);
                    if (var97 == 2 || var97 == 3) {
                        class28.method346(7, (byte) 112, var103, class137.method1111(new class39[] { var104, class43.field1177, class27.method345((byte) -54, var88).method447(-98) }, (byte) -83));
                    } else if (var97 == 1) {
                        class28.method346(7, (byte) 109, var103, class137.method1111(new class39[] { var104, class89.field2091, class27.method345((byte) -54, var88).method447(-98) }, (byte) -92));
                    } else {
                        class28.method346(3, (byte) 127, var103, class137.method1111(new class39[] { var104, class27.method345((byte) -54, var88).method447(-98) }, (byte) -82));
                    }
                }
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 248) {
                int var105 = class39.field1065.method327((byte) 67);
                int var106 = class39.field1065.method307(12);
                int var107 = var105 >> 10 & 0x1F;
                int var108 = var105 >> 5 & 0x1F;
                int var109 = var105 & 0x1F;
                class99 var110 = class54.method567(64, var106);
                var110.field2446 = (var109 << 3) + ((var107 << 19) + (var108 << 11));
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 225) {
                class97.field2292 = true;
                class116.field3045 = class39.field1065.method322((byte) -50);
                class42.field1146 = class39.field1065.method322((byte) -50);
                class121.field3170 = class39.field1065.method301(-4853);
                class55.field1373 = class39.field1065.method322((byte) -50);
                class75.field1726 = class39.field1065.method322((byte) -50);
                if (class75.field1726 >= 100) {
                    int var111 = class116.field3045 * 128 + 64;
                    int var112 = class42.field1146 * 128 + 64;
                    int var113 = class153.method1225(128, var112, class24.field661, var111) - class121.field3170;
                    int var114 = var112 - class78.field1778;
                    int var115 = var113 - class104.field2631;
                    int var116 = var111 - class87.field2022;
                    int var117 = (int) Math.sqrt((double) (var114 * var114 + var116 * var116));
                    class39.field1104 = (int) (Math.atan2((double) var115, (double) var117) * 325.949D) & 0x7FF;
                    class121.field3160 = (int) (-325.949D * Math.atan2((double) var116, (double) var114)) & 0x7FF;
                    if (class39.field1104 < 128) {
                        class39.field1104 = 128;
                    }
                    if (class39.field1104 > 383) {
                        class39.field1104 = 383;
                    }
                }
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 134) {
                class72.field1687 = class70.field1654;
                long var118 = class39.field1065.method319((byte) -124);
                if (var118 == 0L) {
                    class43.field1172 = -1;
                    class94.field2208 = null;
                    class25.field678 = null;
                    class50.field1266 = 0;
                    return true;
                }
                class25.field678 = class27.method345((byte) -54, var118);
                int var120 = class39.field1065.method322((byte) -50);
                if (var120 == 255) {
                    class43.field1172 = -1;
                    return true;
                }
                class50.field1266 = var120;
                class74[] var121 = new class74[100];
                for (int var122 = 0; var122 < class50.field1266; var122++) {
                    var121[var122] = new class74();
                    var121[var122].field3619 = class39.field1065.method319((byte) -102);
                    var121[var122].field1714 = class27.method345((byte) -54, var121[var122].field3619);
                    var121[var122].field1711 = class39.field1065.method301(-4853);
                }
                boolean var123 = false;
                int var124 = class50.field1266;
                while (var124 > 0) {
                    var124--;
                    boolean var125 = true;
                    for (int var126 = 0; var126 < var124; var126++) {
                        if (var121[var126].field1714.method454(-1, var121[var126 + 1].field1714) > 0) {
                            class74 var127 = var121[var126];
                            var125 = false;
                            var121[var126] = var121[var126 + 1];
                            var121[var126 + 1] = var127;
                        }
                    }
                    if (var125) {
                        break;
                    }
                }
                class43.field1172 = -1;
                class94.field2208 = var121;
                return true;
            }
            if (class43.field1172 == 118) {
                class104.field2638 = true;
                int var128 = class39.field1065.method313((byte) 71);
                int var129 = class39.field1065.method321((byte) 27);
                int var130 = class39.field1065.method321((byte) 61);
                class142.field3574[var130] = var128;
                class17.field494[var130] = var129;
                class58.field1443[var130] = 1;
                for (int var131 = 0; var131 < 98; var131++) {
                    if (var128 >= class117.field3075[var131]) {
                        class58.field1443[var130] = var131 + 2;
                    }
                }
                class42.field1141 = class70.field1654;
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 187) {
                int var132 = class39.field1065.method327((byte) 67);
                if (var132 == 65535) {
                    var132 = -1;
                }
                class86.method735(var132, 0);
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 99) {
                int var133 = class39.field1065.method327((byte) 67);
                int var134 = class39.field1065.method310(true);
                if (var133 == 65535) {
                    var133 = -1;
                }
                class5.method84(var134, -22466, var133);
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 46) {
                class39.field1065.method320(false);
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 109) {
                int var135 = class39.field1065.method301(-4853);
                if (var135 == 65535) {
                    var135 = -1;
                }
                int var136 = class39.field1065.method332(15252);
                int var137 = class39.field1065.method311(255);
                int var138 = class39.field1065.method320(false);
                if (var138 == 65535) {
                    var138 = -1;
                }
                for (int var139 = var138; var139 <= var135; var139++) {
                    long var140 = ((long) var137 << 32) + (long) var139;
                    class145 var142 = class149.field3705.method995(false, var140);
                    if (var142 != null) {
                        var142.method1170(47);
                    }
                    class149.field3705.method998(new class140(var136), var140, (byte) -118);
                }
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 84) {
                int var143 = class39.field1065.method301(-4853);
                int var144 = class39.field1065.method320(false);
                int var145 = class39.field1065.method292(-128);
                int var146 = class39.field1065.method311(255);
                class99 var147 = class54.method567(50, var146);
                var147.field2342 = var143;
                var147.field2454 = var145;
                class43.field1172 = -1;
                var147.field2384 = var144;
                return true;
            }
            if (class43.field1172 == 11) {
                class39 var148 = class39.field1065.method304(-126);
                Object[] var149 = new Object[var148.method437(68) + 1];
                for (int var150 = var148.method437(58) - 1; var150 >= 0; var150--) {
                    if (var148.method442((byte) 90, var150) == 115) {
                        var149[var150 + 1] = class39.field1065.method304(-127);
                    } else {
                        var149[var150 + 1] = Integer.valueOf(class39.field1065.method313((byte) 96));
                    }
                }
                var149[0] = Integer.valueOf(class39.field1065.method313((byte) 62));
                class30.method365(4, null, var149, null, 0, 0, 0);
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 136) {
                if (class104.field2633 == 12) {
                    class104.field2638 = true;
                }
                class55.field1377 = class39.field1065.method322((byte) -50);
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 60) {
                int var151 = class39.field1065.method320(false);
                class89.method762((byte) 97, var151);
                if (class37.field1018 != -1) {
                    class116.method1012(class37.field1018, (byte) 107);
                    class37.field1018 = -1;
                    class104.field2638 = true;
                    class142.field3564 = true;
                }
                if (class78.field1777 != -1) {
                    class116.method1012(class78.field1777, (byte) 64);
                    class78.field1777 = -1;
                    class114.method990((byte) -116, 30);
                }
                if (class108.field2708 != -1) {
                    class116.method1012(class108.field2708, (byte) 107);
                    class108.field2708 = -1;
                }
                if (class126.field3198 != -1) {
                    class116.method1012(class126.field3198, (byte) 89);
                    class126.field3198 = -1;
                }
                if (class37.field1008 == var151) {
                    class53.method558(class37.field1008, (byte) 116);
                } else {
                    class116.method1012(class37.field1008, (byte) 120);
                    class37.field1008 = var151;
                }
                class37.field1010 = -1;
                class82.method690((byte) -60, class37.field1008);
                class128.field3242 = true;
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 227) {
                class89.method760(true, -2);
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 42) {
                int var152 = class39.field1065.method322((byte) -50);
                int var153 = class39.field1065.method322((byte) -50);
                int var154 = class39.field1065.method322((byte) -50);
                int var155 = class39.field1065.method322((byte) -50);
                class90.field2134[var152] = true;
                class88.field2061[var152] = var153;
                class15.field394[var152] = var154;
                class71.field1665[var152] = var155;
                class13.field342[var152] = 0;
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 105) {
                int var156 = class39.field1065.method332(15252);
                int var157 = class39.field1065.method301(-4853);
                class99 var158 = class54.method567(126, var156);
                class43.field1172 = -1;
                var158.field2395 = 1;
                var158.field2431 = var157;
                return true;
            }
            if (class43.field1172 == 98) {
                if (class37.field1008 != -1) {
                    class116.method1012(class37.field1008, (byte) 116);
                    class37.field1008 = -1;
                }
                class119.field3107 = 2;
                class128.field3242 = true;
                class107.field2702 = class107.field2693;
                class43.field1172 = -1;
                class128.field3254 = false;
                return true;
            }
            if (class43.field1172 == 127) {
                int var159 = class39.field1065.method313((byte) 127);
                int var160 = class39.field1065.method291(2);
                int var161 = class39.field1065.method315((byte) 72);
                class99 var162 = class54.method567(48, var159);
                var162.field2368 = var162.field2369 + var160;
                class43.field1172 = -1;
                var162.field2450 = var162.field2405 + var161;
                return true;
            }
            if (class43.field1172 == 233) {
                class10.field278 = class39.field1065.method292(-128);
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 220) {
                int var163 = class39.field1065.method307(12);
                int var164 = class39.field1065.method307(12);
                int var165 = class39.field1065.method292(-128);
                if (var165 == 65535) {
                    var165 = -1;
                }
                class99 var166 = class54.method567(110, var164);
                if (var166.field2389) {
                    var166.field2343 = var163;
                    var166.field2345 = var165;
                    class109 var167 = class37.method421(true, var165);
                    var166.field2454 = var167.field2760;
                    var166.field2400 = var167.field2788;
                    var166.field2342 = var167.field2777;
                    var166.field2455 = var167.field2776;
                    if (var166.field2357 > 0) {
                        var166.field2454 = var166.field2454 * 32 / var166.field2357;
                    }
                    var166.field2384 = var167.field2734;
                    var166.field2418 = var167.field2749;
                    class36.method413(var166, false);
                } else if (var165 == -1) {
                    class43.field1172 = -1;
                    var166.field2395 = 0;
                    return true;
                } else {
                    class109 var168 = class37.method421(true, var165);
                    var166.field2342 = var168.field2777;
                    var166.field2454 = var168.field2760 * 100 / var163;
                    var166.field2384 = var168.field2734;
                    var166.field2431 = var165;
                    var166.field2395 = 4;
                }
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 3) {
                class89.method760(false, -2);
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 195) {
                class58.field1425 = class39.field1065.method322((byte) -50);
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 58) {
                class120.field3131 = class39.field1065.method327((byte) 67) * 30;
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 214) {
                if (class104.field2633 == 12) {
                    class104.field2638 = true;
                }
                class44.field1200 = class39.field1065.method318(116);
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 190) {
                class42.method500(0);
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 32) {
                class39 var169 = class39.field1065.method304(-128);
                int var170 = class39.field1065.method280(1630016912);
                int var171 = class39.field1065.method298(-15432);
                if (var171 >= 1 && var171 <= 5) {
                    if (var169.method461(class13.field340, (byte) 82)) {
                        var169 = null;
                    }
                    class58.field1424[var171 - 1] = var169;
                    class151.field3736[var171 - 1] = var170 == 0;
                }
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 219) {
                int var172 = class39.field1065.method301(-4853);
                byte var173 = class39.field1065.method330(128);
                class27.field776[var172] = var173;
                if (class110.field2834[var172] != var173) {
                    class110.field2834[var172] = var173;
                    class78.method680(126, var172);
                    if (class126.field3203 != -1) {
                        class128.field3242 = true;
                    }
                    class104.field2638 = true;
                }
                class72.field1687 = class70.field1654;
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 133) {
                class110.field2817 = class39.field1065.method322((byte) -50);
                class145.field3616 = class39.field1065.method280(1630016912);
                for (int var174 = class145.field3616; var174 < class145.field3616 + 8; var174++) {
                    for (int var175 = class110.field2817; var175 < class110.field2817 + 8; var175++) {
                        if (class7.field208[class24.field661][var174][var175] != null) {
                            class7.field208[class24.field661][var174][var175] = null;
                            class9.method134(var175, var174, -65);
                        }
                    }
                }
                for (class131 var176 = (class131) class43.field1162.method8(-1); var176 != null; var176 = (class131) class43.field1162.method9(1)) {
                    if (class145.field3616 <= var176.field3295 && class145.field3616 + 8 > var176.field3295 && class110.field2817 <= var176.field3288 && class110.field2817 + 8 > var176.field3288 && class24.field661 == var176.field3303) {
                        var176.field3298 = 0;
                    }
                }
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 93) {
                class79.method686(-42);
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 194) {
                class104.field2633 = class39.field1065.method321((byte) 107);
                class104.field2638 = true;
                class142.field3564 = true;
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 247) {
                class110.field2817 = class39.field1065.method280(1630016912);
                class145.field3616 = class39.field1065.method298(-15432);
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 210) {
                for (int var177 = 0; var177 < class110.field2834.length; var177++) {
                    if (class27.field776[var177] != class110.field2834[var177]) {
                        class110.field2834[var177] = class27.field776[var177];
                        class78.method680(120, var177);
                        class104.field2638 = true;
                    }
                }
                class43.field1172 = -1;
                class72.field1687 = class70.field1654;
                return true;
            }
            if (class43.field1172 == 123) {
                int var178 = class39.field1065.method307(12);
                class99 var179 = class54.method567(105, var178);
                for (int var180 = 0; var180 < var179.field2340.length; var180++) {
                    var179.field2340[var180] = -1;
                    var179.field2340[var180] = 0;
                }
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 216) {
                class39.field1065.method313((byte) 64);
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 79) {
                int var181 = class39.field1065.method313((byte) -88);
                boolean var182 = class39.field1065.method321((byte) 107) == 1;
                class99 var183 = class54.method567(64, var181);
                var183.field2385 = var182;
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 137) {
                int var184 = class39.field1065.method292(-128);
                int var185 = class39.field1065.method320(false);
                if (class37.field1008 != -1) {
                    class116.method1012(class37.field1008, (byte) 126);
                    class128.field3242 = true;
                    class37.field1008 = -1;
                }
                if (class78.field1777 != -1) {
                    class116.method1012(class78.field1777, (byte) 109);
                    class78.field1777 = -1;
                    class114.method990((byte) -112, 30);
                }
                if (class108.field2708 != -1) {
                    class116.method1012(class108.field2708, (byte) 118);
                    class108.field2708 = -1;
                }
                if (class126.field3198 == var184) {
                    class53.method558(class126.field3198, (byte) -120);
                } else {
                    class116.method1012(class126.field3198, (byte) 84);
                    class126.field3198 = var184;
                }
                if (class37.field1018 == var185) {
                    class53.method558(class37.field1018, (byte) 10);
                } else {
                    class116.method1012(class37.field1018, (byte) 125);
                    class37.field1018 = var185;
                }
                class142.field3564 = true;
                class104.field2638 = true;
                class37.field1010 = -1;
                if (class119.field3107 != 0) {
                    class119.field3107 = 0;
                    class128.field3242 = true;
                }
                class82.method690((byte) -60, class126.field3198);
                class82.method690((byte) -60, class37.field1018);
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 245) {
                class145.field3616 = class39.field1065.method321((byte) 89);
                class110.field2817 = class39.field1065.method280(1630016912);
                while (class39.field1065.field710 < class128.field3275) {
                    class43.field1172 = class39.field1065.method322((byte) -50);
                    class18.method216(7);
                }
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 218) {
                class97.field2292 = false;
                for (int var186 = 0; var186 < 5; var186++) {
                    class90.field2134[var186] = false;
                }
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 73) {
                class71.field1661 = class39.field1065.method322((byte) -50);
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 119) {
                long var187 = class39.field1065.method319((byte) 26);
                int var189 = class39.field1065.method301(-4853);
                int var190 = class39.field1065.method322((byte) -50);
                class39 var191 = class27.method345((byte) -54, var187).method447(-98);
                for (int var192 = 0; var192 < class92.field2165; var192++) {
                    if (class153.field3766[var192] == var187) {
                        if (class55.field1390[var192] != var189) {
                            class55.field1390[var192] = var189;
                            class104.field2638 = true;
                            if (var189 > 0) {
                                class28.method346(5, (byte) 125, class137.method1111(new class39[] { var191, class90.field2128 }, (byte) -99), class107.field2693);
                            }
                            if (var189 == 0) {
                                class28.method346(5, (byte) 115, class137.method1111(new class39[] { var191, class17.field489 }, (byte) 115), class107.field2693);
                            }
                        }
                        class3.field70[var192] = var190;
                        var191 = null;
                        break;
                    }
                }
                if (var191 != null && class92.field2165 < 200) {
                    class153.field3766[class92.field2165] = var187;
                    class139.field3482[class92.field2165] = var191;
                    class55.field1390[class92.field2165] = var189;
                    class3.field70[class92.field2165] = var190;
                    class104.field2638 = true;
                    class92.field2165++;
                    class72.field1687 = class70.field1654;
                }
                boolean var193 = false;
                int var194 = class92.field2165;
                while (var194 > 0) {
                    boolean var195 = true;
                    var194--;
                    for (int var196 = 0; var196 < var194; var196++) {
                        if (class55.field1390[var196] != class56.field1404 && class55.field1390[var196 + 1] == class56.field1404 || class55.field1390[var196] == 0 && class55.field1390[var196 + 1] != 0) {
                            var195 = false;
                            int var197 = class55.field1390[var196];
                            class55.field1390[var196] = class55.field1390[var196 + 1];
                            class55.field1390[var196 + 1] = var197;
                            class39 var198 = class139.field3482[var196];
                            class139.field3482[var196] = class139.field3482[var196 + 1];
                            class139.field3482[var196 + 1] = var198;
                            long var199 = class153.field3766[var196];
                            class153.field3766[var196] = class153.field3766[var196 + 1];
                            class153.field3766[var196 + 1] = var199;
                            int var201 = class3.field70[var196];
                            class3.field70[var196] = class3.field70[var196 + 1];
                            class3.field70[var196 + 1] = var201;
                            class104.field2638 = true;
                        }
                    }
                    if (var195) {
                        break;
                    }
                }
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 255 || class43.field1172 == 223 || class43.field1172 == 20 || class43.field1172 == 202 || class43.field1172 == 122 || class43.field1172 == 180 || class43.field1172 == 243 || class43.field1172 == 113 || class43.field1172 == 27 || class43.field1172 == 22 || class43.field1172 == 124) {
                class18.method216(7);
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 128) {
                int var202 = class39.field1065.method311(255);
                class99 var203 = class54.method567(122, var202);
                var203.field2395 = 3;
                var203.field2431 = class94.field2197.field3553.method1105((byte) -126);
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 159) {
                int var204 = class39.field1065.method320(false);
                int var205 = class39.field1065.method320(false);
                class89.method762((byte) 27, var204);
                if (var205 != -1) {
                    class89.method762((byte) 86, var205);
                }
                if (class126.field3198 != -1) {
                    class116.method1012(class126.field3198, (byte) 101);
                    class126.field3198 = -1;
                }
                if (class37.field1018 != -1) {
                    class116.method1012(class37.field1018, (byte) 126);
                    class37.field1018 = -1;
                }
                if (class37.field1008 != -1) {
                    class116.method1012(class37.field1008, (byte) 91);
                    class37.field1008 = -1;
                }
                if (class78.field1777 == var204) {
                    class53.method558(class78.field1777, (byte) -91);
                } else {
                    class116.method1012(class78.field1777, (byte) 96);
                    class78.field1777 = var204;
                    class114.method990((byte) -125, 35);
                }
                if (class108.field2708 == var204) {
                    class53.method558(class108.field2708, (byte) -48);
                } else {
                    class116.method1012(class108.field2708, (byte) 63);
                    class108.field2708 = var205;
                }
                class37.field1010 = -1;
                class119.field3107 = 0;
                class82.method690((byte) -60, class78.field1777);
                class82.method690((byte) -60, class108.field2708);
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 35) {
                class72.method664(true);
                class43.field1172 = -1;
                return false;
            }
            if (class43.field1172 == 152) {
                int var206 = class39.field1065.method327((byte) 67);
                class89.method762((byte) 117, var206);
                if (class37.field1018 != -1) {
                    class116.method1012(class37.field1018, (byte) 111);
                    class142.field3564 = true;
                    class37.field1018 = -1;
                    class104.field2638 = true;
                }
                if (class37.field1008 != -1) {
                    class116.method1012(class37.field1008, (byte) 70);
                    class37.field1008 = -1;
                    class128.field3242 = true;
                }
                if (class78.field1777 != -1) {
                    class116.method1012(class78.field1777, (byte) 100);
                    class78.field1777 = -1;
                    class114.method990((byte) -112, 30);
                }
                if (class108.field2708 != -1) {
                    class116.method1012(class108.field2708, (byte) 71);
                    class108.field2708 = -1;
                }
                if (class126.field3198 == var206) {
                    class53.method558(class126.field3198, (byte) 109);
                } else {
                    class116.method1012(class126.field3198, (byte) 80);
                    class126.field3198 = var206;
                }
                if (class119.field3107 != 0) {
                    class119.field3107 = 0;
                    class128.field3242 = true;
                }
                class37.field1010 = -1;
                class82.method690((byte) -60, class126.field3198);
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 178) {
                int var207 = class39.field1065.method327((byte) 67);
                class89.method762((byte) 32, var207);
                if (class37.field1008 != -1) {
                    class116.method1012(class37.field1008, (byte) 104);
                    class128.field3242 = true;
                    class37.field1008 = -1;
                }
                if (class78.field1777 != -1) {
                    class116.method1012(class78.field1777, (byte) 71);
                    class78.field1777 = -1;
                    class114.method990((byte) -110, 30);
                }
                if (class108.field2708 != -1) {
                    class116.method1012(class108.field2708, (byte) 86);
                    class108.field2708 = -1;
                }
                if (class126.field3198 != -1) {
                    class116.method1012(class126.field3198, (byte) 125);
                    class126.field3198 = -1;
                }
                if (class37.field1018 == var207) {
                    class53.method558(class37.field1018, (byte) 103);
                } else {
                    class116.method1012(class37.field1018, (byte) 83);
                    class37.field1018 = var207;
                }
                if (class119.field3107 != 0) {
                    class119.field3107 = 0;
                    class128.field3242 = true;
                }
                class104.field2638 = true;
                class37.field1010 = -1;
                class142.field3564 = true;
                class82.method690((byte) -60, class37.field1018);
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 182) {
                int var208 = class39.field1065.method329(-716653984);
                int var209 = class39.field1065.method311(255);
                class99 var210 = class54.method567(120, var209);
                if (var210.field2423 != var208 || var208 == -1) {
                    var210.field2410 = 0;
                    var210.field2394 = 0;
                    var210.field2423 = var208;
                }
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 15) {
                int var211 = class39.field1065.method301(-4853);
                int var212 = class39.field1065.method322((byte) -50);
                int var213 = class39.field1065.method301(-4853);
                class28.method355(var211, var213, (byte) 115, var212);
                class43.field1172 = -1;
                return true;
            }
            if (class43.field1172 == 25) {
                int var214 = class39.field1065.method292(-128);
                class56.method578(var214, 128);
                class43.field1172 = -1;
                class30.field858 = class70.field1654;
                return true;
            }
            if (arg0 < 12) {
                method607(-31, null, (byte) 39, -50, false, (byte) -36, -82);
            }
            if (class43.field1172 == 37) {
                class58.field1430 = class39.field1065.method322((byte) -50);
                class104.field2638 = true;
                class43.field1172 = -1;
                class72.field1687 = class70.field1654;
                return true;
            }
            if (class43.field1172 == 70) {
                class107.field2698 = class39.field1065.method304(-126);
                if (class37.field1008 != -1) {
                    class116.method1012(class37.field1008, (byte) 79);
                    class37.field1008 = -1;
                }
                class43.field1172 = -1;
                class128.field3254 = false;
                class107.field2702 = class107.field2693;
                class128.field3242 = true;
                class119.field3107 = 4;
                return true;
            }
            class142.method1158("T1 - " + class43.field1172 + "," + class37.field1001 + "," + class88.field2057 + " - " + class128.field3275, null, -107);
            class72.method664(true);
        } catch (IOException var218) {
            class60.method597((byte) -2);
        } catch (Exception var219) {
            String var216 = "T2 - " + class43.field1172 + "," + class37.field1001 + "," + class88.field2057 + " - " + class128.field3275 + "," + (class54.field1341 + class94.field2197.field2913[0]) + "," + (class94.field2197.field2926[0] + class55.field1382) + " - ";
            for (int var217 = 0; var217 < class128.field3275 && var217 < 50; var217++) {
                var216 = var216 + class39.field1065.field711[var217] + ",";
            }
            class142.method1158(var216, var219, -67);
            class72.method664(true);
        }
        return true;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILmf;BIZBI)V", line = 2307)
    public static final void method607(int arg0, class89 arg1, byte arg2, int arg3, boolean arg4, byte arg5, int arg6) {
        field1494++;
        long var7 = (long) ((arg3 << 16) + arg0);
        class92 var9 = (class92) class87.field1985.method995(false, var7);
        if (var9 != null) {
            return;
        }
        class92 var10 = (class92) class104.field2625.method995(false, var7);
        if (var10 != null) {
            return;
        }
        class92 var11 = (class92) class42.field1138.method995(false, var7);
        if (var11 == null) {
            if (!arg4) {
                class92 var12 = (class92) class82.field1830.method995(false, var7);
                if (var12 != null) {
                    return;
                }
            }
            class92 var13 = new class92();
            var13.field2159 = arg1;
            var13.field2154 = arg6;
            var13.field2147 = arg5;
            if (arg4) {
                class87.field1985.method998(var13, var7, (byte) -118);
                class34.field900++;
            } else {
                class151.field3748.method521(var13, (byte) -81);
                class42.field1138.method998(var13, var7, (byte) -118);
                class70.field1651++;
            }
            if (arg2 != 2) {
                method606(-73);
            }
        } else if (arg4) {
            var11.method1023((byte) -3);
            class87.field1985.method998(var11, var7, (byte) -118);
            class70.field1651--;
            class34.field900++;
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V", line = 2381)
    public static void method608(int arg0) {
        field1492 = null;
        field1490 = null;
        field1497 = null;
        int var1 = 41 / ((arg0 - 9) / 53);
        field1491 = null;
        field1500 = null;
        field1499 = null;
        field1495 = null;
        field1504 = null;
        field1496 = null;
        field1493 = null;
        field1501 = null;
        field1502 = null;
        field1487 = null;
        field1489 = null;
        field1488 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IJ)V", line = 2408)
    public static final void method609(int arg0, long arg1) {
        field1505++;
        if (arg0 > -66 || arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class128.method1064(arg1 - 1L, -4409);
            class128.method1064(1L, -4409);
        } else {
            class128.method1064(arg1, -4409);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I[B)V")
    public abstract void method604(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)[B")
    public abstract byte[] method605(int arg0);
}
