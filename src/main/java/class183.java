import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class183 extends class18 {

    @OriginalMember(owner = "client!k", name = "C", descriptor = "Lol;")
    public class214 field2838;

    @OriginalMember(owner = "client!k", name = "E", descriptor = "Ljava/lang/String;")
    public static String field2840 = "shake:";

    @OriginalMember(owner = "client!k", name = "G", descriptor = "Luc;")
    public static class39 field2842 = new class39(16);

    @OriginalMember(owner = "client!k", name = "H", descriptor = "I")
    public static int field2843 = 0;

    @OriginalMember(owner = "client!k", name = "B", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!k", name = "D", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!k", name = "F", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!k", name = "I", descriptor = "Lng;")
    public static class78 field2844;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "(I)V")
    public static final void method1240(int arg0) {
        if (class28.field383 > 0) {
            class28.field383--;
        }
        if (class133.field2086 > 1) {
            class162.field2539 = class275.field4392;
            class133.field2086--;
        }
        field2841++;
        if (client.field2438) {
            client.field2438 = false;
            class17.method164(0);
            return;
        }
        for (int var1 = 0; var1 < 100 && class258.method1748((byte) 124); var1++) {
        }
        if (class39.field551 != 30) {
            return;
        }
        class157.method1063(client.field2435, 0, 137);
        Object var2 = class180.field2808.field1583;
        synchronized (class180.field2808.field1583) {
            if (!class292.field4600) {
                class180.field2808.field1592 = 0;
            } else if (class164.field2581 != 0 || class180.field2808.field1592 >= 40) {
                client.field2435.method536((byte) -104, 202);
                class53.field805++;
                client.field2435.method654((byte) -95, 0);
                int var3 = 0;
                int var4 = client.field2435.field1535;
                for (int var5 = 0; class180.field2808.field1592 > var5 && client.field2435.field1535 - var4 < 240; var5++) {
                    var3++;
                    int var6 = class180.field2808.field1593[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    boolean var7 = false;
                    int var8 = class180.field2808.field1595[var5];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 65534) {
                        var8 = 65534;
                    }
                    if (class180.field2808.field1593[var5] == -1 && class180.field2808.field1595[var5] == -1) {
                        var8 = -1;
                        var6 = -1;
                        var7 = true;
                    }
                    if (class56.field930 != var8 || class216.field3348 != var6) {
                        int var9 = var8 - class56.field930;
                        int var10 = var6 - class216.field3348;
                        class56.field930 = var8;
                        class216.field3348 = var6;
                        if (class47.field662 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            client.field2435.method634((class47.field662 << 12) + (var9 << 6) + var10, arg0 + 100);
                            class47.field662 = 0;
                        } else if (class47.field662 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            client.field2435.method654((byte) -95, class47.field662 + 128);
                            var9 += 128;
                            var10 += 128;
                            client.field2435.method634((var9 << 8) + var10, 103);
                            class47.field662 = 0;
                        } else if (class47.field662 < 32) {
                            client.field2435.method654((byte) -105, class47.field662 + 192);
                            if (var7) {
                                client.field2435.method639(Integer.MIN_VALUE, (byte) -101);
                            } else {
                                client.field2435.method639(var8 | var6 << 16, (byte) -109);
                            }
                            class47.field662 = 0;
                        } else {
                            client.field2435.method634(class47.field662 + 57344, 64);
                            if (var7) {
                                client.field2435.method639(Integer.MIN_VALUE, (byte) -115);
                            } else {
                                client.field2435.method639(var6 << 16 | var8, (byte) -104);
                            }
                            class47.field662 = 0;
                        }
                    } else if (class47.field662 < 2047) {
                        class47.field662++;
                    }
                }
                client.field2435.method648(1210551352, client.field2435.field1535 - var4);
                if (class180.field2808.field1592 > var3) {
                    class180.field2808.field1592 -= var3;
                    for (int var11 = 0; var11 < class180.field2808.field1592; var11++) {
                        class180.field2808.field1595[var11] = class180.field2808.field1595[var3 + var11];
                        class180.field2808.field1593[var11] = class180.field2808.field1593[var3 + var11];
                    }
                } else {
                    class180.field2808.field1592 = 0;
                }
            }
        }
        if (class164.field2581 != 0) {
            class223.field3419++;
            int var12 = class112.field1838;
            int var13 = class291.field4584;
            long var14 = (class56.field933 - class20.field299) / 50L;
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 65535) {
                var13 = 65535;
            }
            if (var12 < 0) {
                var12 = 0;
            } else if (var12 > 65535) {
                var12 = 65535;
            }
            class20.field299 = class56.field933;
            byte var16 = 0;
            if (class164.field2581 == 2) {
                var16 = 1;
            }
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            client.field2435.method536((byte) -104, 168);
            int var17 = (int) var14;
            client.field2435.method681(arg0 - 2, var12 << 16 | var13);
            client.field2435.method634(var16 << 15 | var17, 52);
        }
        if (class199.field3127 > 0) {
            class199.field3127--;
        }
        if (class115.field1877 && class199.field3127 <= 0) {
            class264.field4189++;
            class199.field3127 = 20;
            class115.field1877 = false;
            client.field2435.method536((byte) -104, 75);
            client.field2435.method640(-123, (int) class16.field244);
            client.field2435.method634((int) class142.field2160, 50);
        }
        if (class287.field4537 && !class84.field1423) {
            class286.field4528++;
            class84.field1423 = true;
            client.field2435.method536((byte) -104, 236);
            client.field2435.method654((byte) -110, 1);
        }
        if (!class287.field4537 && class84.field1423) {
            class84.field1423 = false;
            client.field2435.method536((byte) -104, 236);
            client.field2435.method654((byte) -128, 0);
            class286.field4528++;
        }
        if (!class216.field3351) {
            class291.field4589++;
            client.field2435.method536((byte) -104, 108);
            client.field2435.method639(class163.method1108((byte) -120), (byte) -110);
            class216.field3351 = true;
        }
        if (class166.field2599) {
            class166.field2599 = false;
        } else {
            class157.field2445 /= 2.0F;
        }
        if (class80.field1340) {
            class80.field1340 = false;
        } else {
            class43.field613 /= 2.0F;
        }
        class235.method1596(arg0 - 5);
        if (class39.field551 != 30) {
            return;
        }
        class268.method1808(-4818);
        class260.method1765((byte) 22);
        class145.method985(-13238);
        class283.field4463++;
        if (class283.field4463 > 750) {
            class17.method164(arg0 ^ 0x5);
            return;
        }
        class228.method1526(-126);
        class36.method271(0);
        class268.method1807(0);
        if (class144.field2241 != null) {
            class202.method1364(arg0 + 89);
        }
        for (int var18 = class113.method802(true, 86); var18 != -1; var18 = class113.method802(false, -127)) {
            class295.method1972(30734, var18);
            class52.field797[class55.method420(31, class180.field2819++)] = var18;
        }
        for (class41 var19 = class180.method1229((byte) -116); var19 != null; var19 = class180.method1229((byte) -118)) {
            int var20 = var19.method306(28753);
            int var21 = var19.method302(-1);
            if (var20 == 1) {
                class167.field2621[var21] = var19.field584;
                class243.field3958[class55.method420(31, class143.field2177++)] = var21;
            } else if (var20 == 2) {
                class30.field451[var21] = var19.field599;
                class120.field1933[class55.method420(class187.field2906++, 31)] = var21;
            } else if (var20 == 3) {
                class228 var42 = class84.method596((byte) 35, var21);
                if (!var19.field599.equals(var42.field3643)) {
                    var42.field3643 = var19.field599;
                    class82.method591(var42, false);
                }
            } else if (var20 == 4) {
                class228 var22 = class84.method596((byte) 35, var21);
                int var23 = var19.field584;
                int var24 = var19.field583;
                int var25 = var19.field592;
                if (var22.field3515 != var23 || var22.field3496 != var24 || var22.field3627 != var25) {
                    var22.field3627 = var25;
                    var22.field3496 = var24;
                    var22.field3515 = var23;
                    class82.method591(var22, false);
                }
            } else if (var20 == 5) {
                class228 var26 = class84.method596((byte) 35, var21);
                if (var19.field584 != var26.field3504 || var19.field584 == -1) {
                    var26.field3598 = 0;
                    var26.field3504 = var19.field584;
                    var26.field3538 = 1;
                    var26.field3580 = 0;
                    class82.method591(var26, false);
                }
            } else if (var20 == 6) {
                int var36 = var19.field584;
                int var37 = (var36 & 0x7F10) >> 10;
                int var38 = (var36 & 0x3E4) >> 5;
                int var39 = var36 & 0x1F;
                class228 var40 = class84.method596((byte) 35, var21);
                int var41 = (var37 << 19) + (var38 << 11) + (var39 << 3);
                if (var40.field3493 != var41) {
                    var40.field3493 = var41;
                    class82.method591(var40, false);
                }
            } else if (var20 == 7) {
                class228 var34 = class84.method596((byte) 35, var21);
                boolean var35 = var19.field584 == 1;
                if (var34.field3622 != var35) {
                    var34.field3622 = var35;
                    class82.method591(var34, false);
                }
            } else if (var20 == 8) {
                class228 var33 = class84.method596((byte) 35, var21);
                if (var19.field584 != var33.field3614 || var19.field583 != var33.field3618 || var19.field592 != var33.field3500) {
                    var33.field3500 = var19.field592;
                    if (var33.field3481 != -1) {
                        if (var33.field3482 > 0) {
                            var33.field3500 = var33.field3500 * 32 / var33.field3482;
                        } else if (var33.field3464 > 0) {
                            var33.field3500 = var33.field3500 * 32 / var33.field3464;
                        }
                    }
                    var33.field3614 = var19.field584;
                    var33.field3618 = var19.field583;
                    class82.method591(var33, false);
                }
            } else if (var20 == 9) {
                class228 var32 = class84.method596((byte) 35, var21);
                if (var19.field584 != var32.field3481 || var19.field583 != var32.field3596) {
                    var32.field3481 = var19.field584;
                    var32.field3596 = var19.field583;
                    class82.method591(var32, false);
                }
            } else if (var20 == 10) {
                class228 var31 = class84.method596((byte) 35, var21);
                if (var19.field584 != var31.field3502 || var19.field583 != var31.field3509 || var19.field592 != var31.field3585) {
                    var31.field3502 = var19.field584;
                    var31.field3509 = var19.field583;
                    var31.field3585 = var19.field592;
                    class82.method591(var31, false);
                }
            } else if (var20 == 11) {
                class228 var30 = class84.method596((byte) 35, var21);
                var30.field3577 = var30.field3633 = var19.field584;
                var30.field3632 = 0;
                var30.field3532 = var30.field3616 = var19.field583;
                var30.field3579 = 0;
                class82.method591(var30, false);
            } else if (var20 == 12) {
                class228 var27 = class84.method596((byte) 35, var21);
                int var28 = var19.field584;
                if (var27 != null && var27.field3477 == 0) {
                    if (var27.field3513 - var27.field3625 < var28) {
                        var28 = var27.field3513 - var27.field3625;
                    }
                    if (var28 < 0) {
                        var28 = 0;
                    }
                    if (var27.field3523 != var28) {
                        var27.field3523 = var28;
                        class82.method591(var27, false);
                    }
                }
            } else if (var20 == 13) {
                class228 var29 = class84.method596((byte) 35, var21);
                var29.field3540 = var19.field584;
            }
        }
        class84.field1413++;
        if (class231.field3677 != 0) {
            class284.field4501 += 20;
            if (class284.field4501 >= 400) {
                class231.field3677 = 0;
            }
        }
        if (class81.field1348 != null) {
            class288.field4565++;
            if (class288.field4565 >= 15) {
                class82.method591(class81.field1348, false);
                class81.field1348 = null;
            }
        }
        if (class268.field4278 != null) {
            class82.method591(class268.field4278, false);
            class152.field2383++;
            if ((class248.field4010 + 5) < class79.field1323 || (class248.field4010 - 5) > class79.field1323 || class115.field1883 > class131.field2063 + 5 || class115.field1883 < (class131.field2063 - 5)) {
                class100.field1672 = true;
            }
            if (class160.field2485 == 0) {
                if (class100.field1672 && class152.field2383 >= 5) {
                    if (class268.field4278 == class146.field2321 && class288.field4568 != class113.field1843) {
                        class228 var43 = class268.field4278;
                        byte var44 = 0;
                        if (class274.field4376 == 1 && var43.field3549 == 206) {
                            var44 = 1;
                        }
                        if (var43.field3604[class113.field1843] <= 0) {
                            var44 = 0;
                        }
                        class61.field1044++;
                        if (client.method1059(var43).method1833(-32687)) {
                            int var47 = class288.field4568;
                            int var48 = class113.field1843;
                            var43.field3604[var48] = var43.field3604[var47];
                            var43.field3488[var48] = var43.field3488[var47];
                            var43.field3604[var47] = -1;
                            var43.field3488[var47] = 0;
                        } else if (var44 == 1) {
                            int var45 = class113.field1843;
                            int var46 = class288.field4568;
                            while (var45 != var46) {
                                if (var45 < var46) {
                                    var43.method1524(var46, (byte) 93, var46 - 1);
                                    var46--;
                                } else if (var45 > var46) {
                                    var43.method1524(var46, (byte) -102, var46 + 1);
                                    var46++;
                                }
                            }
                        } else {
                            var43.method1524(class288.field4568, (byte) -127, class113.field1843);
                        }
                        client.field2435.method536((byte) -104, 70);
                        client.field2435.method676(var44, (byte) 124);
                        client.field2435.method663(class113.field1843, 123);
                        client.field2435.method663(class288.field4568, 119);
                        client.field2435.method678(class268.field4278.field3480, true);
                    }
                } else if ((class37.field524 == 1 || class173.method1177(class128.field2018 - 1, (byte) -99)) && class128.field2018 > 2) {
                    class180.method1220((byte) -97);
                } else if (class128.field2018 > 0) {
                    class93.method704(0);
                }
                class268.field4278 = null;
                class164.field2581 = 0;
                class288.field4565 = 10;
            }
        }
        class278.field4421 = null;
        class71.field1148 = false;
        if (arg0 != 5) {
            method1240(32);
        }
        class228 var49 = class209.field3258;
        class209.field3258 = null;
        class163.field2567 = false;
        class256.field4105 = 0;
        class228 var50 = class295.field4653;
        class295.field4653 = null;
        while (class292.method1957(111) && class256.field4105 < 128) {
            class53.field807[class256.field4105] = class85.field1432;
            class162.field2543[class256.field4105] = class154.field2401;
            class256.field4105++;
        }
        class144.field2241 = null;
        if (class75.field1236 != -1) {
            class19.method185(0, (byte) 36, class29.field409, 0, 0, 0, class79.field1310, class75.field1236);
        }
        class275.field4392++;
        while (true) {
            class116 var51;
            class228 var52;
            class228 var53;
            do {
                var51 = (class116) class213.field3312.method1231(15);
                if (var51 == null) {
                    while (true) {
                        class116 var54;
                        class228 var55;
                        class228 var56;
                        do {
                            var54 = (class116) class78.field1282.method1231(arg0 + 10);
                            if (var54 == null) {
                                while (true) {
                                    class116 var57;
                                    class228 var58;
                                    class228 var59;
                                    do {
                                        var57 = (class116) class52.field790.method1231(arg0 ^ 0xA);
                                        if (var57 == null) {
                                            if (class144.field2241 == null) {
                                                class171.field2675 = 0;
                                            }
                                            if (class205.field3205 != null) {
                                                class115.method810(1);
                                            }
                                            if (class140.field2141 > 0 && class106.field1764[82] && class106.field1764[81] && class22.field317 != 0) {
                                                int var60 = class240.field3892 - class22.field317;
                                                if (var60 < 0) {
                                                    var60 = 0;
                                                } else if (var60 > 3) {
                                                    var60 = 3;
                                                }
                                                class139.method940(var60, class283.field4473.field2268[0] + class46.field656, (byte) -111, class260.field4162 + class283.field4473.field2271[0]);
                                            }
                                            if (class140.field2141 > 0 && class106.field1764[82] && class106.field1764[81]) {
                                                if (class283.field4480 != -1) {
                                                    class139.method940(class240.field3892, class46.field656 + class283.field4480, (byte) -120, class51.field749 + class260.field4162);
                                                }
                                                class79.field1330 = 0;
                                                class177.field2772 = 0;
                                            } else if (class177.field2772 == 2) {
                                                if (class283.field4480 != -1) {
                                                    client.field2435.method536((byte) -104, 4);
                                                    client.field2435.method639(class102.field1704, (byte) -122);
                                                    client.field2435.method659((byte) 122, class139.field2132);
                                                    client.field2435.method663(class46.field656 + class283.field4480, arg0 ^ 0x6B);
                                                    class166.field2598++;
                                                    client.field2435.method634(class51.field749 + class260.field4162, 89);
                                                    class231.field3677 = 1;
                                                    class157.field2448 = class291.field4584;
                                                    class284.field4501 = 0;
                                                    class177.field2768 = class112.field1838;
                                                }
                                                class177.field2772 = 0;
                                            } else if (class79.field1330 == 2) {
                                                if (class283.field4480 != -1) {
                                                    client.field2435.method536((byte) -104, 96);
                                                    client.field2435.method634(class51.field749 + class260.field4162, 76);
                                                    class157.field2449++;
                                                    client.field2435.method663(class46.field656 + class283.field4480, 119);
                                                    class157.field2448 = class291.field4584;
                                                    class177.field2768 = class112.field1838;
                                                    class284.field4501 = 0;
                                                    class231.field3677 = 1;
                                                }
                                                class79.field1330 = 0;
                                            } else if (class283.field4480 != -1 && class177.field2772 == 0 && class79.field1330 == 0) {
                                                class5.method38(0, (class283.field4480 << 1) + 1 - class283.field4473.method971(65535) >> 1, (byte) -6, (class51.field749 << 1) + 1 - class283.field4473.method971(arg0 ^ 0xFFFA) >> 1);
                                                class231.field3677 = 1;
                                                class284.field4501 = 0;
                                                class157.field2448 = class291.field4584;
                                                class177.field2768 = class112.field1838;
                                            }
                                            class283.field4480 = -1;
                                            class82.method585(-124);
                                            if (class209.field3258 != var49) {
                                                if (var49 != null) {
                                                    class82.method591(var49, false);
                                                }
                                                if (class209.field3258 != null) {
                                                    class82.method591(class209.field3258, false);
                                                }
                                            }
                                            if (class295.field4653 != var50 && class83.field1399 == class105.field1748) {
                                                if (var50 != null) {
                                                    class82.method591(var50, false);
                                                }
                                                if (class295.field4653 != null) {
                                                    class82.method591(class295.field4653, false);
                                                }
                                            }
                                            if (class295.field4653 == null) {
                                                if (class83.field1399 > 0) {
                                                    class83.field1399--;
                                                }
                                            } else if (class83.field1399 < class105.field1748) {
                                                class83.field1399++;
                                                if (class83.field1399 == class105.field1748) {
                                                    class82.method591(class295.field4653, false);
                                                }
                                            }
                                            for (int var61 = 0; var61 < 5; var61++) {
                                                int var10002 = class82.field1388[var61]++;
                                            }
                                            int var62 = class2.method6(127);
                                            int var63 = class191.method1285((byte) 30);
                                            if (var62 > 15000 && var63 > 15000) {
                                                class28.field383 = 250;
                                                class227.method1507(14500, 612510212);
                                                class97.field1630++;
                                                client.field2435.method536((byte) -104, 79);
                                            }
                                            if (class221.field3399 != null && class221.field3399.field1255 == 1) {
                                                if (class221.field3399.field1258 != null) {
                                                    class34.method268(0, class142.field2157, class106.field1774);
                                                }
                                                class142.field2157 = null;
                                                class106.field1774 = false;
                                                class221.field3399 = null;
                                            }
                                            class29.field403++;
                                            class267.field4265++;
                                            class45.field649++;
                                            if (class267.field4265 > 500) {
                                                class267.field4265 = 0;
                                                int var64 = (int) (Math.random() * 8.0D);
                                                if ((var64 & 0x2) == 2) {
                                                    class176.field2753 += class30.field453;
                                                }
                                                if ((var64 & 0x1) == 1) {
                                                    class213.field3316 += class259.field4153;
                                                }
                                                if ((var64 & 0x4) == 4) {
                                                    class86.field1448 += class75.field1246;
                                                }
                                            }
                                            if (class86.field1448 < -40) {
                                                class75.field1246 = 1;
                                            }
                                            if (class45.field649 > 500) {
                                                class45.field649 = 0;
                                                int var65 = (int) (Math.random() * 8.0D);
                                                if ((var65 & 0x1) == 1) {
                                                    class103.field1732 += class38.field539;
                                                }
                                                if ((var65 & 0x2) == 2) {
                                                    class77.field1265 += class18.field277;
                                                }
                                            }
                                            if (class176.field2753 < -55) {
                                                class30.field453 = 2;
                                            }
                                            if (class213.field3316 < -50) {
                                                class259.field4153 = 2;
                                            }
                                            if (class103.field1732 < -60) {
                                                class38.field539 = 2;
                                            }
                                            if (class213.field3316 > 50) {
                                                class259.field4153 = -2;
                                            }
                                            if (class176.field2753 > 55) {
                                                class30.field453 = -2;
                                            }
                                            if (class103.field1732 > 60) {
                                                class38.field539 = -2;
                                            }
                                            if (class86.field1448 > 40) {
                                                class75.field1246 = -1;
                                            }
                                            if (class77.field1265 < -20) {
                                                class18.field277 = 1;
                                            }
                                            if (class77.field1265 > 10) {
                                                class18.field277 = -1;
                                            }
                                            if (class29.field403 > 50) {
                                                class27.field373++;
                                                client.field2435.method536((byte) -104, 132);
                                            }
                                            if (class55.field911) {
                                                class110.method782(128);
                                                class55.field911 = false;
                                            }
                                            try {
                                                if (class249.field4022 != null && client.field2435.field1535 > 0) {
                                                    class249.field4022.method897(client.field2435.field1535, client.field2435.field1471, 0, 5000);
                                                    client.field2435.field1535 = 0;
                                                    class29.field403 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var66) {
                                                class17.method164(0);
                                                return;
                                            }
                                        }
                                        var58 = var57.field1892;
                                        if (var58.field3551 < 0) {
                                            break;
                                        }
                                        var59 = class84.method596((byte) 35, var58.field3467);
                                    } while (var59 == null || var59.field3498 == null || var59.field3498.length <= var58.field3551 || var59.field3498[var58.field3551] != var58);
                                    class44.method322(var57, 200000);
                                }
                            }
                            var55 = var54.field1892;
                            if (var55.field3551 < 0) {
                                break;
                            }
                            var56 = class84.method596((byte) 35, var55.field3467);
                        } while (var56 == null || var56.field3498 == null || var55.field3551 >= var56.field3498.length || var56.field3498[var55.field3551] != var55);
                        class44.method322(var54, 200000);
                    }
                }
                var52 = var51.field1892;
                if (var52.field3551 < 0) {
                    break;
                }
                var53 = class84.method596((byte) 35, var52.field3467);
            } while (var53 == null || var53.field3498 == null || var52.field3551 >= var53.field3498.length || var53.field3498[var52.field3551] != var52);
            class44.method322(var51, 200000);
        }
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(B)V")
    public static final void method1241(byte arg0) {
        class149.field2354.method1898((byte) 113);
        if (arg0 > -56) {
            method1240(124);
        }
        field2839++;
    }

    @OriginalMember(owner = "client!k", name = "g", descriptor = "(I)V")
    public static void method1242(int arg0) {
        int var1 = -24 % ((arg0 + 36) / 46);
        field2842 = null;
        field2840 = null;
        field2844 = null;
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(II)V")
    public static final void method1243(int arg0, int arg1) {
        field2837++;
        if (!class53.method394(false, arg1)) {
            return;
        }
        if (arg0 != -3786) {
            field2842 = null;
        }
        class228[] var2 = class193.field3052[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class228 var4 = var2[var3];
            if (var4 != null) {
                var4.field3538 = 1;
                var4.field3580 = 0;
                var4.field3598 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lol;)V")
    public class183(class214 arg0) {
        this.field2838 = arg0;
    }
}
