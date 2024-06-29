import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class60 extends class118 {

    @OriginalMember(owner = "client!id", name = "cb", descriptor = "[Lhc;")
    public class52[] field1471;

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "Lfc;")
    public static class39 field1459 = class90.method774("Bitte warten Sie)3)3)3", -102);

    @OriginalMember(owner = "client!id", name = "O", descriptor = "[[B")
    public static byte[][] field1457 = new byte[250][];

    @OriginalMember(owner = "client!id", name = "ab", descriptor = "I")
    public static int field1469 = 0;

    @OriginalMember(owner = "client!id", name = "ib", descriptor = "I")
    public static int field1477 = 0;

    @OriginalMember(owner = "client!id", name = "Z", descriptor = "Lfc;")
    public static class39 field1468 = class90.method774("null", -118);

    @OriginalMember(owner = "client!id", name = "fb", descriptor = "Lfc;")
    public static class39 field1474 = class90.method774("Freunde", -104);

    @OriginalMember(owner = "client!id", name = "P", descriptor = "I")
    public static int field1458 = 0;

    @OriginalMember(owner = "client!id", name = "V", descriptor = "Lfc;")
    public static class39 field1464 = class90.method774("Ung-Ultiges Anmelde)2Paket)3", -115);

    @OriginalMember(owner = "client!id", name = "lb", descriptor = "Lfc;")
    public static class39 field1480 = class90.method774("swe", -107);

    @OriginalMember(owner = "client!id", name = "mb", descriptor = "Lfc;")
    private static class39 field1481 = class90.method774("Login", -103);

    @OriginalMember(owner = "client!id", name = "X", descriptor = "I")
    public static int field1466 = -1;

    @OriginalMember(owner = "client!id", name = "S", descriptor = "Lfc;")
    public static class39 field1461 = field1481;

    @OriginalMember(owner = "client!id", name = "jb", descriptor = "Lfc;")
    private static class39 field1478 = class90.method774("Public chat", -91);

    @OriginalMember(owner = "client!id", name = "db", descriptor = "Lfc;")
    public static class39 field1472 = field1478;

    @OriginalMember(owner = "client!id", name = "nb", descriptor = "Lfc;")
    public static class39 field1482 = class90.method774("An", -87);

    @OriginalMember(owner = "client!id", name = "U", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!id", name = "W", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!id", name = "Y", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!id", name = "bb", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!id", name = "eb", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!id", name = "gb", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!id", name = "hb", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!id", name = "kb", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!id", name = "ob", descriptor = "I")
    public static int field1483;

    @OriginalMember(owner = "client!id", name = "qb", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!id", name = "rb", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!id", name = "pb", descriptor = "Luc;")
    public static class139 field1484;

    @OriginalMember(owner = "client!id", name = "T", descriptor = "Lue;")
    public static class141 field1462;

    @OriginalMember(owner = "client!id", name = "N", descriptor = "Ljava/lang/String;")
    public static String field1456;

    @OriginalMember(owner = "client!id", name = "M", descriptor = "[Lue;")
    public static class141[] field1455;

    @OriginalMember(owner = "client!id", name = "R", descriptor = "[Lue;")
    public static class141[] field1460;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V", line = 14)
    public static final void method594(int arg0) {
        if (class120.field3131 > 1) {
            class120.field3131--;
        }
        field1467++;
        if (class101.field2524 > 0) {
            class101.field2524--;
        }
        if (class28.field804) {
            class28.field804 = false;
            method597((byte) -2);
            return;
        }
        for (int var1 = 0; var1 < 100 && class61.method606(44); var1++) {
        }
        if (class56.field1409 != 30 && class56.field1409 != 35) {
            return;
        }
        if (class107.field2703 && class56.field1409 == 30) {
            class13.field343 = 0;
            class50.field1275 = 0;
            while (class28.method347(1)) {
            }
            for (int var2 = 0; var2 < class114.field2988.length; var2++) {
                class114.field2988[var2] = false;
            }
        }
        client.method241(107, class79.field1794, -20923);
        Object var3 = class150.field3716.field867;
        synchronized (class150.field3716.field867) {
            if (!class100.field2497) {
                class150.field3716.field874 = 0;
            } else if (class13.field343 != 0 || class150.field3716.field874 >= 40) {
                class79.field1794.method393((byte) -14, 181);
                class94.field2200++;
                class79.field1794.method326(0, (byte) -76);
                int var4 = class79.field1794.field710;
                int var5 = 0;
                for (int var6 = 0; var6 < class150.field3716.field874 && class79.field1794.field710 - var4 < 240; var6++) {
                    var5++;
                    int var7 = class150.field3716.field876[var6];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    int var8 = class150.field3716.field875[var6];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 502) {
                        var8 = 502;
                    }
                    int var9 = var8 * 765 + var7;
                    if (class150.field3716.field875[var6] == -1 && class150.field3716.field876[var6] == -1) {
                        var8 = -1;
                        var7 = -1;
                        var9 = 524287;
                    }
                    if (class1.field26 != var7 || class147.field3674 != var8) {
                        int var10 = var8 - class147.field3674;
                        class147.field3674 = var8;
                        int var11 = var7 - class1.field26;
                        class1.field26 = var7;
                        if (class111.field2914 < 8 && var11 >= -32 && var11 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var11 += 32;
                            class79.field1794.method325((class111.field2914 << 12) + (var11 << 6) + var10, -73);
                            class111.field2914 = 0;
                        } else if (class111.field2914 < 8) {
                            class79.field1794.method309(1870, (class111.field2914 << 19) + var9 + 8388608);
                            class111.field2914 = 0;
                        } else {
                            class79.field1794.method283(true, (class111.field2914 << 19) + var9 - 1073741824);
                            class111.field2914 = 0;
                        }
                    } else if (class111.field2914 < 2047) {
                        class111.field2914++;
                    }
                }
                class79.field1794.method288(-1, class79.field1794.field710 - var4);
                if (class150.field3716.field874 <= var5) {
                    class150.field3716.field874 = 0;
                } else {
                    class150.field3716.field874 -= var5;
                    for (int var12 = 0; var12 < class150.field3716.field874; var12++) {
                        class150.field3716.field876[var12] = class150.field3716.field876[var5 + var12];
                        class150.field3716.field875[var12] = class150.field3716.field875[var12 + var5];
                    }
                }
            }
        }
        if (class13.field343 != 0) {
            class83.field1839++;
            long var13 = (class45.field1226 - class145.field3613) / 50L;
            class145.field3613 = class45.field1226;
            if (var13 > 4095L) {
                var13 = 4095L;
            }
            int var15 = class34.field889;
            int var16 = class26.field758;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 502) {
                var16 = 502;
            }
            byte var17 = 0;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 764) {
                var15 = 764;
            }
            int var18 = var16 * 765 + var15;
            if (class13.field343 == 2) {
                var17 = 1;
            }
            class79.field1794.method393((byte) -14, 160);
            int var19 = (int) var13;
            class79.field1794.method283(true, (var19 << 20) + (var17 << 19) + var18);
        }
        if (class114.field2988[96] || class114.field2988[97] || class114.field2988[98] || class114.field2988[99]) {
            class39.field1102 = true;
        }
        if (client.field549 > 0) {
            client.field549--;
        }
        if (class39.field1102 && client.field549 <= 0) {
            class39.field1102 = false;
            class55.field1391++;
            client.field549 = 20;
            class79.field1794.method393((byte) -14, 204);
            class79.field1794.method300(class114.field2990, -4695);
            class79.field1794.method325(class62.field1532, -64);
        }
        if (class55.field1386 && !class67.field1598) {
            class67.field1598 = true;
            class79.field1794.method393((byte) -14, 76);
            class28.field808++;
            class79.field1794.method326(1, (byte) -63);
        }
        if (!class55.field1386 && class67.field1598) {
            class67.field1598 = false;
            class28.field808++;
            class79.field1794.method393((byte) -14, 76);
            class79.field1794.method326(0, (byte) -79);
        }
        class6.method89((byte) 118);
        if (class56.field1409 != 30 && class56.field1409 != 35) {
            return;
        }
        class120.method1025(false);
        class127.method1055(-100);
        class44.field1207++;
        if (class44.field1207 > 750) {
            method597((byte) -2);
            return;
        }
        class112.method984(105);
        class127.method1051(true);
        class111.method978((byte) -89);
        if (class126.field3195 != 0) {
            class10.field291 += 20;
            if (class10.field291 >= 400) {
                class126.field3195 = 0;
            }
        }
        if (class28.field810 != 0) {
            class153.field3763++;
            if (class153.field3763 >= 15) {
                if (class28.field810 == 3) {
                    class128.field3242 = true;
                }
                if (class28.field810 == 2) {
                    class104.field2638 = true;
                }
                class28.field810 = 0;
            }
        }
        client.field547++;
        if (field1477 != 0) {
            class3.field72++;
            if (class12.field326 + 5 < class12.field314 || class12.field326 - 5 > class12.field314 || class131.field3322 > class118.field3091 + 5 || class118.field3091 - 5 > class131.field3322) {
                class34.field892 = true;
            }
            if (class50.field1275 == 0) {
                if (field1477 == 2) {
                    class104.field2638 = true;
                }
                if (field1477 == 3) {
                    class128.field3242 = true;
                }
                field1477 = 0;
                if (class34.field892 && class3.field72 >= 5) {
                    class75.field1716 = -1;
                    class128.method1065(-117);
                    if (class75.field1716 == class107.field2672 && class39.field1053 != class136.field3417) {
                        class99 var20 = class54.method567(102, class107.field2672);
                        class42.field1136++;
                        byte var21 = 0;
                        if (class83.field1849 == 1 && var20.field2399 == 206) {
                            var21 = 1;
                        }
                        if (var20.field2340[class39.field1053] <= 0) {
                            var21 = 0;
                        }
                        if (class50.method551(class89.method768(var20, -59), -94)) {
                            int var22 = class136.field3417;
                            int var23 = class39.field1053;
                            var20.field2340[var23] = var20.field2340[var22];
                            var20.field2422[var23] = var20.field2422[var22];
                            var20.field2340[var22] = -1;
                            var20.field2422[var22] = 0;
                        } else if (var21 == 1) {
                            int var24 = class136.field3417;
                            int var25 = class39.field1053;
                            while (var24 != var25) {
                                if (var24 > var25) {
                                    var20.method831(false, var24 - 1, var24);
                                    var24--;
                                } else if (var25 > var24) {
                                    var20.method831(false, var24 + 1, var24);
                                    var24++;
                                }
                            }
                        } else {
                            var20.method831(false, class39.field1053, class136.field3417);
                        }
                        class79.field1794.method393((byte) -14, 172);
                        class79.field1794.method281(-1084673848, class136.field3417);
                        class79.field1794.method285(class107.field2672, (byte) 112);
                        class79.field1794.method326(var21, (byte) -45);
                        class79.field1794.method300(class39.field1053, -4695);
                    }
                } else if ((class90.field2137 == 1 || class101.method862(class126.field3207 - 1, 8192)) && class126.field3207 > 2) {
                    class70.method653(true);
                } else if (class126.field3207 > 0) {
                    class90.method777(class126.field3207 - 1, -57);
                }
                class13.field343 = 0;
                class153.field3763 = 10;
            }
        }
        byte var26 = 34;
        if (class78.field1777 == -1) {
            if (class126.field3198 != -1) {
                class147.method1179((byte) -109, 338, var26, 0, class126.field3198, 516, 4, 4);
            } else if (class2.field36 != -1) {
                class147.method1179((byte) -109, 338, var26, 0, class2.field36, 516, 4, 4);
            }
            if (class37.field1018 != -1) {
                class147.method1179((byte) -109, 466, var26, 1, class37.field1018, 743, 205, 553);
            } else if (class25.field740[class104.field2633] != -1) {
                class147.method1179((byte) -109, 466, var26, 1, class25.field740[class104.field2633], 743, 205, 553);
            }
            if (class37.field1008 != -1) {
                class147.method1179((byte) -109, 453, var26, 2, class37.field1008, 496, 357, 17);
            } else if (class126.field3203 != -1) {
                class147.method1179((byte) -109, 453, var26, 2, class126.field3203, 496, 357, 17);
            }
        } else {
            class147.method1179((byte) -109, 503, var26, 3, class78.field1777, 765, 0, 0);
            if (class108.field2708 != -1) {
                class147.method1179((byte) -109, 503, var26, 3, class108.field2708, 765, 0, 0);
            }
        }
        if (class78.field1777 == -1) {
            if (class126.field3198 != -1) {
                class147.method1179((byte) -109, 338, ~var26, 0, class126.field3198, 516, 4, 4);
            } else if (class2.field36 != -1) {
                class147.method1179((byte) -109, 338, ~var26, 0, class2.field36, 516, 4, 4);
            }
            if (class37.field1018 != -1) {
                class147.method1179((byte) -109, 466, ~var26, 1, class37.field1018, 743, 205, 553);
            } else if (class25.field740[class104.field2633] != -1) {
                class147.method1179((byte) -109, 466, ~var26, 1, class25.field740[class104.field2633], 743, 205, 553);
            }
            if (class37.field1008 != -1) {
                class147.method1179((byte) -109, 453, ~var26, 2, class37.field1008, 496, 357, 17);
            } else if (class126.field3203 != -1) {
                class147.method1179((byte) -109, 453, ~var26, 2, class126.field3203, 496, 357, 17);
            }
        } else {
            class147.method1179((byte) -109, 503, ~var26, 3, class78.field1777, 765, 0, 0);
            if (class108.field2708 != -1) {
                class147.method1179((byte) -109, 503, ~var26, 3, class108.field2708, 765, 0, 0);
            }
        }
        class62.method615((byte) -128);
        if (class4.field105 != -1) {
            int var27 = class4.field105;
            int var28 = class4.field103;
            boolean var29 = class93.method790(true, -1, 0, 0, 0, 0, var28, class94.field2197.field2926[0], 0, 0, class94.field2197.field2913[0], var27);
            class4.field105 = -1;
            if (var29) {
                class10.field291 = 0;
                class12.field327 = class34.field889;
                class76.field1738 = class26.field758;
                class126.field3195 = 1;
            }
        }
        if (class13.field343 == 1 && class61.field1496 != null) {
            class13.field343 = 0;
            class61.field1496 = null;
            class128.field3242 = true;
        }
        class150.method1194((byte) 71);
        if (class78.field1777 == -1) {
            class54.method569(-124);
            class146.method1174(-72);
            class68.method641((byte) 108);
        }
        if (class114.field2998 == -1 && class150.field3715 == -1 && class31.field872 == -1) {
            if (class27.field782 > 0) {
                class27.field782--;
            }
        } else if (class90.field2142 > class27.field782) {
            class27.field782++;
            if (class90.field2142 == class27.field782) {
                if (class150.field3715 != -1) {
                    class104.field2638 = true;
                }
                if (class114.field2998 != -1) {
                    class128.field3242 = true;
                }
            }
        }
        if (class50.field1275 == 1 || class13.field343 == 1) {
            class101.field2534++;
        }
        class114.method991((byte) -82);
        if (class97.field2292) {
            class18.method220((byte) 110);
        }
        for (int var30 = 0; var30 < 5; var30++) {
            int var10002 = class13.field342[var30]++;
        }
        class112.method985((byte) -1);
        int var31 = class2.method10(1);
        int var32 = class153.method1227(127);
        if (var31 > 4500 && var32 > 4500) {
            class101.field2524 = 250;
            class36.method417(4000, (byte) 113);
            class79.field1794.method393((byte) -14, 47);
            class67.field1600++;
        }
        class116.field3066++;
        class3.field81++;
        class24.field663++;
        if (class24.field663 > 500) {
            class24.field663 = 0;
            int var33 = (int) (Math.random() * 8.0D);
            if ((var33 & 0x2) == 2) {
                class126.field3202 += class13.field344;
            }
            if ((var33 & 0x4) == 4) {
                class116.field3063 += class9.field259;
            }
            if ((var33 & 0x1) == 1) {
                class75.field1718 += class96.field2273;
            }
        }
        if (class126.field3202 < -55) {
            class13.field344 = 2;
        }
        if (class75.field1718 < -50) {
            class96.field2273 = 2;
        }
        if (class116.field3063 < -40) {
            class9.field259 = 1;
        }
        if (class126.field3202 > 55) {
            class13.field344 = -2;
        }
        if (class116.field3063 > 40) {
            class9.field259 = -1;
        }
        if (class75.field1718 > 50) {
            class96.field2273 = -2;
        }
        if (class116.field3066 > 500) {
            class116.field3066 = 0;
            int var34 = (int) (Math.random() * 8.0D);
            if ((var34 & 0x1) == 1) {
                class26.field753 += class131.field3302;
            }
            if ((var34 & 0x2) == 2) {
                class153.field3759 += class9.field252;
            }
        }
        if (class26.field753 < -60) {
            class131.field3302 = 2;
        }
        if (class153.field3759 < -20) {
            class9.field252 = 1;
        }
        if (class26.field753 > 60) {
            class131.field3302 = -2;
        }
        if (class153.field3759 > 10) {
            class9.field252 = -1;
        }
        if (arg0 <= 17) {
            return;
        }
        if (class3.field81 > 50) {
            class79.field1794.method393((byte) -14, 10);
            class42.field1135++;
        }
        try {
            if (class115.field3015 != null && class79.field1794.field710 > 0) {
                class115.field3015.method1140(true, class79.field1794.field710, 0, class79.field1794.field711);
                class3.field81 = 0;
                class79.field1794.field710 = 0;
            }
        } catch (IOException var35) {
            method597((byte) -2);
        }
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(B)V", line = 661)
    public static void method595(byte arg0) {
        field1481 = null;
        field1480 = null;
        field1482 = null;
        field1464 = null;
        field1461 = null;
        field1484 = null;
        field1478 = null;
        field1468 = null;
        field1472 = null;
        field1462 = null;
        field1459 = null;
        field1460 = null;
        if (arg0 > 50) {
            field1457 = null;
            field1455 = null;
            field1474 = null;
            field1456 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIB)I", line = 687)
    public static final int method596(int arg0, int arg1, byte arg2) {
        long var3 = (long) ((arg1 << 16) + arg0);
        field1475++;
        int var5 = -4 % ((-arg2 - 75) / 46);
        return class16.field454 != null && class16.field454.field3619 == var3 ? class65.field1564.field710 * 99 / (class65.field1564.field711.length - class16.field454.field2147) + 1 : 0;
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(B)V", line = 703)
    public static final void method597(byte arg0) {
        if (arg0 != -2) {
            method600(9, 61, 61, null);
        }
        field1476++;
        if (class101.field2524 > 0) {
            class72.method664(true);
        } else {
            class114.method990((byte) -114, 40);
            class103.field2603 = class115.field3015;
            class115.field3015 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)Lpc;", line = 736)
    public static final class107 method598(int arg0, int arg1) {
        field1470++;
        class107 var2 = (class107) class137.field3426.method931(false, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class145.field3617.method839(5, 13, arg0);
        class107 var4 = new class107();
        if (arg1 != 32) {
            field1484 = null;
        }
        var4.field2675 = arg0;
        if (var3 != null) {
            var4.method947(new class25(var3), true);
        }
        class137.field3426.method934(0, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(II)Z", line = 774)
    public final boolean method599(int arg0, int arg1) {
        if (arg0 == 32) {
            field1485++;
            return this.field1471[arg1].field1297;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIILoc;)Lma;", line = 790)
    public static final class84 method600(int arg0, int arg1, int arg2, class100 arg3) {
        field1473++;
        if (arg2 == 1) {
            return class127.method1054(arg1, (byte) 0, arg0, arg3) ? class54.method568(103) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lc;Loc;ILoc;Loc;)Z", line = 804)
    public static final boolean method601(class15 arg0, class100 arg1, int arg2, class100 arg3, class100 arg4) {
        if (arg2 != 4) {
            return true;
        }
        class61.field1500 = arg4;
        field1479++;
        class30.field839 = arg3;
        class103.field2582 = arg0;
        class44.field1205 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(Z)V", line = 847)
    public static final void method602(boolean arg0) {
        field1465++;
        class121.method1036((byte) 61);
        class36.method414(84);
        if (class71.field1661 == 2 || class71.field1661 == 5) {
            byte[] var41 = class3.field88.field3544;
            int[] var42 = class152.field3754;
            int var43 = var41.length;
            for (int var44 = 0; var44 < var43; var44++) {
                if (var41[var44] == 0) {
                    var42[var44] = 0;
                }
            }
            if (class71.field1661 < 3) {
                class97.field2310.method127(0, 0, 33, 33, 25, 25, class62.field1532, 256, class140.field3524, class53.field1316);
            }
            class77.method677(127);
            return;
        }
        int var1 = class62.field1532 + class26.field753 & 0x7FF;
        int var2 = 464 - class94.field2197.field2909 / 32;
        int var3 = class94.field2197.field2916 / 32 + 48;
        class70.field1638.method127(25, 5, 146, 151, var3, var2, var1, class153.field3759 + 256, class92.field2151, class126.field3205);
        if (!arg0) {
            field1462 = null;
        }
        for (int var4 = 0; var4 < class27.field762; var4++) {
            int var39 = class120.field3150[var4] * 4 + 2 - class94.field2197.field2909 / 32;
            int var40 = class10.field289[var4] * 4 + 2 - class94.field2197.field2916 / 32;
            class121.method1035(var39, class10.field296[var4], var40, (byte) 65);
        }
        for (int var5 = 0; var5 < 104; var5++) {
            for (int var35 = 0; var35 < 104; var35++) {
                class2 var36 = class7.field208[class24.field661][var5][var35];
                if (var36 != null) {
                    int var37 = var35 * 4 + 2 - class94.field2197.field2909 / 32;
                    int var38 = var5 * 4 + 2 - class94.field2197.field2916 / 32;
                    class121.method1035(var37, class34.field891[0], var38, (byte) 78);
                }
            }
        }
        for (int var6 = 0; var6 < class15.field416; var6++) {
            class121 var31 = class118.field3092[class121.field3176[var6]];
            if (var31 != null && var31.method979(18)) {
                class96 var32 = var31.field3163;
                if (var32 != null && var32.field2243 != null) {
                    var32 = var32.method812(-127);
                }
                if (var32 != null && var32.field2264 && var32.field2239) {
                    int var33 = var31.field2916 / 32 - class94.field2197.field2916 / 32;
                    int var34 = var31.field2909 / 32 - class94.field2197.field2909 / 32;
                    class121.method1035(var34, class34.field891[1], var33, (byte) 100);
                }
            }
        }
        for (int var7 = 0; var7 < class111.field2871; var7++) {
            class142 var23 = class101.field2525[class31.field862[var7]];
            if (var23 != null && var23.method979(18)) {
                int var24 = var23.field2916 / 32 - class94.field2197.field2916 / 32;
                int var25 = var23.field2909 / 32 - class94.field2197.field2909 / 32;
                boolean var26 = false;
                long var27 = var23.field3575.method445((byte) 69);
                for (int var29 = 0; var29 < class92.field2165; var29++) {
                    if (class153.field3766[var29] == var27 && class55.field1390[var29] != 0) {
                        var26 = true;
                        break;
                    }
                }
                boolean var30 = false;
                if (class94.field2197.field3581 != 0 && var23.field3581 != 0 && class94.field2197.field3581 == var23.field3581) {
                    var30 = true;
                }
                if (var26) {
                    class121.method1035(var25, class34.field891[3], var24, (byte) 99);
                } else if (var30) {
                    class121.method1035(var25, class34.field891[4], var24, (byte) 120);
                } else {
                    class121.method1035(var25, class34.field891[2], var24, (byte) -85);
                }
            }
        }
        if (class3.field84 != 0 && class70.field1654 % 20 < 10) {
            if (class3.field84 == 1 && class134.field3378 >= 0 && class118.field3092.length > class134.field3378) {
                class121 var8 = class118.field3092[class134.field3378];
                if (var8 != null) {
                    int var9 = var8.field2909 / 32 - class94.field2197.field2909 / 32;
                    int var10 = var8.field2916 / 32 - class94.field2197.field2916 / 32;
                    class146.method1177(class146.field3643[1], (byte) 70, var10, var9);
                }
            }
            if (class3.field84 == 2) {
                int var11 = (class107.field2676 - class54.field1341) * 4 + 2 - class94.field2197.field2916 / 32;
                int var12 = (class80.field1808 - class55.field1382) * 4 + 2 - class94.field2197.field2909 / 32;
                class146.method1177(class146.field3643[1], (byte) 108, var11, var12);
            }
            if (class3.field84 == 10 && class76.field1740 >= 0 && class101.field2525.length > class76.field1740) {
                class142 var13 = class101.field2525[class76.field1740];
                if (var13 != null) {
                    int var14 = var13.field2909 / 32 - class94.field2197.field2909 / 32;
                    int var15 = var13.field2916 / 32 - class94.field2197.field2916 / 32;
                    class146.method1177(class146.field3643[1], (byte) 97, var15, var14);
                }
            }
        }
        if (class72.field1683 != 0) {
            int var16 = class128.field3253 * 4 + 2 - class94.field2197.field2909 / 32;
            int var17 = class72.field1683 * 4 + 2 - class94.field2197.field2916 / 32;
            class121.method1035(var16, class146.field3643[0], var17, (byte) -110);
        }
        class152.method1209(97, 78, 3, 3, 16777215);
        if (class71.field1661 < 3) {
            class97.field2310.method127(0, 0, 33, 33, 25, 25, class62.field1532, 256, class140.field3524, class53.field1316);
        } else {
            byte[] var18 = class3.field88.field3544;
            int[] var19 = class152.field3754;
            for (int var20 = 0; var20 <= 33; var20++) {
                int var21 = class3.field88.field3543 * var20;
                for (int var22 = 0; var22 <= 33; var22++) {
                    if (var18[var21 + var22] == 0) {
                        var19[var21 + var22] = 0;
                    }
                }
            }
        }
        class77.method677(126);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIZ)I", line = 1105)
    public static final int method603(int arg0, int arg1, boolean arg2) {
        field1486++;
        if (arg2) {
            field1457 = null;
        }
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg1 / 128;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Loc;Loc;IZ)V", line = 1131)
    public class60(class100 arg0, class100 arg1, int arg2, boolean arg3) {
        class2 var5 = new class2();
        int var6 = arg0.method849((byte) 74, arg2);
        this.field1471 = new class52[var6];
        int[] var7 = arg0.method844((byte) 103, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method839(5, arg2, var7[var8]);
            class42 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class42 var12 = (class42) var5.method8(-1); var12 != null; var12 = (class42) var5.method9(1)) {
                if (var12.field1130 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method840(var11, 0, false);
                } else {
                    var13 = arg1.method840(0, var11, false);
                }
                var10 = new class42(var11, var13);
                var5.method19(var10, 7);
            }
            this.field1471[var7[var8]] = new class52(var9, var10);
        }
    }
}
