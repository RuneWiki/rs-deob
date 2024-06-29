import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class14 {

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "Loa;")
    public static class98 field288 = class38.method349(255, "(U2");

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "Loa;")
    public static class98 field289 = class38.method349(255, "leuchten2:");

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "[Lrc;")
    public static class119[] field287 = new class119[16];

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "Loa;")
    public static class98 field296 = class38.method349(255, "title)3jpg");

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
    public static int field297 = 0;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "Loa;")
    public static class98 field294 = class38.method349(255, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "Loa;")
    public static class98 field300 = class38.method349(255, "mapfunction");

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "Loa;")
    public static class98 field291 = class38.method349(255, "backvmid3");

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "Loa;")
    public static class98 field299 = class38.method349(255, "Ein kostenloses Spielkonto erstellen)3");

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "Lkd;")
    public static class73 field298;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
    public static final void method147(int arg0, int arg1) {
        field295++;
        class131.method1073(104);
        int var2 = class141.method1129(-1, arg1).field1111;
        if (var2 == 0) {
            return;
        }
        int var3 = class137.field3362[arg1];
        if (var2 == 1) {
            if (var3 == 1) {
                class66.method535(0.9D);
                ((class32) class66.field1408).method310(24326, 0.9D);
            }
            if (var3 == 2) {
                class66.method535(0.8D);
                ((class32) class66.field1408).method310(arg0 ^ 0x5F66, 0.8D);
            }
            if (var3 == 3) {
                class66.method535(0.7D);
                ((class32) class66.field1408).method310(24326, 0.7D);
            }
            if (var3 == 4) {
                class66.method535(0.6D);
                ((class32) class66.field1408).method310(24326, 0.6D);
            }
            class35.method337((byte) 127);
            class97.field2220 = true;
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class27.field660 != var4) {
                if (class27.field660 == 0 && class83.field1917 != -1) {
                    class98.method794(10000, class83.field1917, 0, false, var4, class121.field2714);
                    class8.field193 = false;
                } else if (var4 == 0) {
                    class52.method432((byte) -23);
                    class8.field193 = false;
                } else {
                    class118.method943((byte) 75, var4);
                }
                class27.field660 = var4;
            }
        }
        if (var2 == 8) {
            class63.field1344 = var3;
            class15.field306 = true;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class149.field3671 = 127;
            }
            if (var3 == 1) {
                class149.field3671 = 96;
            }
            if (var3 == 2) {
                class149.field3671 = 64;
            }
            if (var3 == 3) {
                class149.field3671 = 32;
            }
            if (var3 == 4) {
                class149.field3671 = 0;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class32.field784 = 127;
            }
            if (var3 == 1) {
                class32.field784 = 96;
            }
            if (var3 == 2) {
                class32.field784 = 64;
            }
            if (var3 == 3) {
                class32.field784 = 32;
            }
            if (var3 == 4) {
                class32.field784 = 0;
            }
        }
        if (var2 == 9) {
            class126.field2804 = var3;
        }
        if (var2 == 6) {
            class96.field2209 = var3;
        }
        if (arg0 == 96 && var2 == 5) {
            class112.field2506 = var3;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILjava/awt/Component;II)Lmd;")
    public static final class87 method148(int arg0, Component arg1, int arg2, int arg3) {
        field293++;
        try {
            if (arg3 == -27261) {
                Class var4 = Class.forName("ge");
                class87 var5 = (class87) var4.getDeclaredConstructor().newInstance();
                var5.method407(arg1, 114, arg2, arg0);
                return var5;
            } else {
                return null;
            }
        } catch (Throwable var7) {
            class53 var6 = new class53();
            var6.method407(arg1, 124, arg2, arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
    public static void method149(boolean arg0) {
        field289 = null;
        field296 = null;
        field299 = null;
        field287 = null;
        field298 = null;
        field291 = null;
        field288 = null;
        field300 = null;
        if (arg0) {
            method147(-30, -62);
        }
        field294 = null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V")
    public static final void method150(int arg0) {
        field292++;
        if (arg0 != 18053) {
            return;
        }
        while (true) {
            label391: do {
                while (class56.method457(-115)) {
                    if (class71.field1460 != -1 && class71.field1460 == class51.field1122) {
                        if (class42.field985 == 85 && class145.field3499.method790(123) > 0) {
                            class145.field3499 = class145.field3499.method815(class145.field3499.method790(104) - 1, -112, 0);
                        }
                        continue label391;
                    }
                    if (class126.field2826) {
                        if (class42.field985 == 85 && class145.field3502.method790(86) > 0) {
                            class145.field3502 = class145.field3502.method815(class145.field3502.method790(115) - 1, -84, 0);
                            class15.field306 = true;
                        }
                        if (class35.method339(class4.field66, 159) && class145.field3502.method790(arg0 - 17957) < 80) {
                            class145.field3502 = class145.field3502.method810(arg0 ^ 0xFFFFB90E, class4.field66);
                            class15.field306 = true;
                        }
                        if (class42.field985 == 84) {
                            class126.field2826 = false;
                            class15.field306 = true;
                            if (class91.field2110 == 1) {
                                long var1 = class145.field3502.method809(arg0 - 18053);
                                class62.method503((byte) -74, var1);
                            }
                            if (class91.field2110 == 2 && class49.field1112 > 0) {
                                long var3 = class145.field3502.method809(0);
                                class118.method940(arg0 ^ 0x3B82, var3);
                            }
                            if (class91.field2110 == 3 && class145.field3502.method790(82) > 0) {
                                class88.field2014++;
                                class132.field3116.method177(6624, 113);
                                class132.field3116.method95(0, true);
                                int var5 = class132.field3116.field182;
                                class132.field3116.method92(true, class32.field776);
                                class36.method340(class132.field3116, class145.field3502, (byte) 107);
                                class132.field3116.method67((byte) -126, class132.field3116.field182 - var5);
                                if (class54.field1193 == 2) {
                                    class16.field324++;
                                    class54.field1193 = 1;
                                    class126.field2793 = true;
                                    class132.field3116.method177(6624, 214);
                                    class132.field3116.method95(class80.field1749, true);
                                    class132.field3116.method95(class54.field1193, true);
                                    class132.field3116.method95(class67.field1433, true);
                                }
                            }
                            if (class91.field2110 == 4 && class77.field1697 < 100) {
                                long var6 = class145.field3502.method809(0);
                                class54.method445((byte) -104, var6);
                            }
                            if (class91.field2110 == 5 && class77.field1697 > 0) {
                                long var8 = class145.field3502.method809(arg0 ^ 0x4685);
                                class20.method189(true, var8);
                            }
                        }
                    } else if (class149.field3691 == 1) {
                        if (class42.field985 == 85 && class145.field3530.method790(arg0 - 17965) > 0) {
                            class145.field3530 = class145.field3530.method815(class145.field3530.method790(arg0 ^ 0x46F5) - 1, arg0 + -18144, 0);
                            class15.field306 = true;
                        }
                        if (class123.method973(false, class4.field66) && class145.field3530.method790(arg0 ^ 0x46E4) < 10) {
                            class145.field3530 = class145.field3530.method810(-124, class4.field66);
                            class15.field306 = true;
                        }
                        if (class42.field985 == 84) {
                            if (class145.field3530.method790(105) > 0) {
                                class18.field388++;
                                int var18 = 0;
                                if (class145.field3530.method817(97)) {
                                    var18 = class145.field3530.method793(10);
                                }
                                class132.field3116.method177(6624, 148);
                                class132.field3116.method72((byte) -119, var18);
                            }
                            class15.field306 = true;
                            class149.field3691 = 0;
                        }
                    } else if (class149.field3691 == 2) {
                        if (class42.field985 == 85 && class145.field3530.method790(111) > 0) {
                            class145.field3530 = class145.field3530.method815(class145.field3530.method790(112) - 1, -94, 0);
                            class15.field306 = true;
                        }
                        if ((class51.method430(class4.field66, (byte) -69) || class4.field66 == 32) && class145.field3530.method790(123) < 12) {
                            class145.field3530 = class145.field3530.method810(-111, class4.field66);
                            class15.field306 = true;
                        }
                        if (class42.field985 == 84) {
                            if (class145.field3530.method790(109) > 0) {
                                class132.field3116.method177(6624, 236);
                                class97.field2234++;
                                class132.field3116.method92(true, class145.field3530.method809(0));
                            }
                            class15.field306 = true;
                            class149.field3691 = 0;
                        }
                    } else if (class149.field3691 == 3) {
                        if (class42.field985 == 85 && class145.field3530.method790(91) > 0) {
                            class145.field3530 = class145.field3530.method815(class145.field3530.method790(93) - 1, -95, 0);
                            class15.field306 = true;
                        }
                        if (class35.method339(class4.field66, arg0 ^ 0x461A) && class145.field3530.method790(arg0 ^ 0x46F7) < 40) {
                            class145.field3530 = class145.field3530.method810(-96, class4.field66);
                            class15.field306 = true;
                        }
                    } else if (class149.field3691 == 4) {
                        if (class42.field985 == 85 && class145.field3530.method790(117) > 0) {
                            class145.field3530 = class145.field3530.method815(class145.field3530.method790(120) - 1, 93, 0);
                            class15.field306 = true;
                        }
                        if ((class35.method339(class4.field66, arg0 ^ 0x461A) || class4.field66 == 32) && class145.field3530.method790(arg0 ^ 0x46D6) < 80) {
                            class145.field3530 = class145.field3530.method810(arg0 - 18181, class4.field66);
                            class15.field306 = true;
                        }
                        if (class42.field985 == 84) {
                            if (class145.field3530.method790(arg0 ^ 0x46F2) > 0) {
                                class150.field3701++;
                                class132.field3116.method177(6624, 76);
                                class132.field3116.method95(class145.field3530.method790(127) + 1, true);
                                class132.field3116.method85(class145.field3530, false);
                            }
                            class15.field306 = true;
                            class149.field3691 = 0;
                        }
                    } else if (class71.field1462 == -1 && class77.field1694 == -1) {
                        if (class115.field2592 != 0 || class33.field823 > 1) {
                            class147.method1179(112);
                        }
                        if (class42.field985 == 85 && class145.field3497.method790(arg0 - 17939) > 0) {
                            class145.field3497 = class145.field3497.method815(class145.field3497.method790(121) - 1, 77, 0);
                            class15.field306 = true;
                        }
                        if (class35.method339(class4.field66, 159) && class145.field3497.method790(106) < 80) {
                            class145.field3497 = class145.field3497.method810(arg0 - 18165, class4.field66);
                            class15.field306 = true;
                        }
                        if (class42.field985 == 84 && class145.field3497.method790(123) > 0) {
                            if (class115.field2592 != 0 || class33.field823 > 1) {
                                class25.field605[class94.field2140++] = class145.field3497;
                                if (class94.field2140 >= 20) {
                                    class94.field2140 = 0;
                                }
                                class41.field963 = -1;
                            }
                            if (class33.field823 == 2) {
                                if (class145.field3497.method801((byte) -88, class16.field322)) {
                                    System.gc();
                                }
                                if (class145.field3497.method801((byte) -93, class87.field2000)) {
                                    class118.method939(0);
                                }
                                if (class145.field3497.method801((byte) -77, class62.field1332)) {
                                    class58.field1304 = true;
                                }
                                if (class145.field3497.method801((byte) -93, class27.field666)) {
                                    class58.field1304 = false;
                                }
                                if (class145.field3497.method801((byte) -51, class32.field777)) {
                                    for (int var10 = 0; var10 < 4; var10++) {
                                        for (int var11 = 1; var11 < 103; var11++) {
                                            for (int var12 = 1; var12 < 103; var12++) {
                                                class137.field3323[var10].field3675[var11][var12] = 0;
                                            }
                                        }
                                    }
                                }
                                if (class145.field3497.method801((byte) -55, class25.field599) && class115.field2592 == 2) {
                                    throw new RuntimeException();
                                }
                                if (class145.field3497.method801((byte) -70, class148.field3662)) {
                                    class81.field1837 = true;
                                }
                            }
                            if (class145.field3497.method792((byte) -84, class11.field235)) {
                                class132.field3116.method177(6624, 78);
                                class132.field3116.method95(class145.field3497.method790(108) - 1, true);
                                class132.field3116.method85(class145.field3497.method781(0, 2), false);
                                class145.field3501++;
                            } else {
                                class83.field1920++;
                                class98 var13 = class145.field3497.method786(arg0 ^ 0xFFFFB279);
                                byte var14 = 0;
                                byte var15 = 0;
                                if (var13.method792((byte) -84, class26.field632)) {
                                    class145.field3497 = class145.field3497.method781(0, class26.field632.method790(116));
                                    var14 = 0;
                                } else if (var13.method792((byte) -84, class44.field1008)) {
                                    class145.field3497 = class145.field3497.method781(0, class44.field1008.method790(92));
                                    var14 = 1;
                                } else if (var13.method792((byte) -84, class113.field2535)) {
                                    var14 = 2;
                                    class145.field3497 = class145.field3497.method781(arg0 ^ 0x4685, class113.field2535.method790(100));
                                } else if (var13.method792((byte) -84, class145.field3511)) {
                                    class145.field3497 = class145.field3497.method781(0, class145.field3511.method790(arg0 - 17957));
                                    var14 = 3;
                                } else if (var13.method792((byte) -84, class77.field1687)) {
                                    class145.field3497 = class145.field3497.method781(0, class77.field1687.method790(arg0 ^ 0x46DB));
                                    var14 = 4;
                                } else if (var13.method792((byte) -84, class134.field3272)) {
                                    var14 = 5;
                                    class145.field3497 = class145.field3497.method781(0, class134.field3272.method790(arg0 - 17939));
                                } else if (var13.method792((byte) -84, class96.field2215)) {
                                    var14 = 6;
                                    class145.field3497 = class145.field3497.method781(0, class96.field2215.method790(arg0 - 17928));
                                } else if (var13.method792((byte) -84, class123.field2744)) {
                                    var14 = 7;
                                    class145.field3497 = class145.field3497.method781(0, class123.field2744.method790(94));
                                } else if (var13.method792((byte) -84, class80.field1795)) {
                                    class145.field3497 = class145.field3497.method781(0, class80.field1795.method790(104));
                                    var14 = 8;
                                } else if (var13.method792((byte) -84, class119.field2684)) {
                                    var14 = 9;
                                    class145.field3497 = class145.field3497.method781(0, class119.field2684.method790(116));
                                } else if (var13.method792((byte) -84, client.field485)) {
                                    class145.field3497 = class145.field3497.method781(0, client.field485.method790(arg0 - 17964));
                                    var14 = 10;
                                } else if (var13.method792((byte) -84, class3.field42)) {
                                    class145.field3497 = class145.field3497.method781(arg0 - 18053, class3.field42.method790(83));
                                    var14 = 11;
                                } else if (class139.field3391 != 0) {
                                    if (var13.method792((byte) -84, class26.field629)) {
                                        class145.field3497 = class145.field3497.method781(arg0 ^ 0x4685, class26.field629.method790(118));
                                        var14 = 0;
                                    } else if (var13.method792((byte) -84, class44.field1002)) {
                                        var14 = 1;
                                        class145.field3497 = class145.field3497.method781(0, class44.field1002.method790(arg0 - 17932));
                                    } else if (var13.method792((byte) -84, class113.field2533)) {
                                        var14 = 2;
                                        class145.field3497 = class145.field3497.method781(0, class113.field2533.method790(95));
                                    } else if (var13.method792((byte) -84, class145.field3513)) {
                                        class145.field3497 = class145.field3497.method781(0, class145.field3513.method790(arg0 ^ 0x46E2));
                                        var14 = 3;
                                    } else if (var13.method792((byte) -84, class77.field1689)) {
                                        class145.field3497 = class145.field3497.method781(0, class77.field1689.method790(92));
                                        var14 = 4;
                                    } else if (var13.method792((byte) -84, class134.field3268)) {
                                        class145.field3497 = class145.field3497.method781(0, class134.field3268.method790(arg0 ^ 0x46E1));
                                        var14 = 5;
                                    } else if (var13.method792((byte) -84, class96.field2210)) {
                                        var14 = 6;
                                        class145.field3497 = class145.field3497.method781(0, class96.field2210.method790(108));
                                    } else if (var13.method792((byte) -84, class123.field2742)) {
                                        var14 = 7;
                                        class145.field3497 = class145.field3497.method781(0, class123.field2742.method790(arg0 ^ 0x46D0));
                                    } else if (var13.method792((byte) -84, class80.field1773)) {
                                        var14 = 8;
                                        class145.field3497 = class145.field3497.method781(0, class80.field1773.method790(108));
                                    } else if (var13.method792((byte) -84, class119.field2679)) {
                                        class145.field3497 = class145.field3497.method781(0, class119.field2679.method790(arg0 - 17952));
                                        var14 = 9;
                                    } else if (var13.method792((byte) -84, client.field493)) {
                                        var14 = 10;
                                        class145.field3497 = class145.field3497.method781(0, client.field493.method790(109));
                                    } else if (var13.method792((byte) -84, class3.field28)) {
                                        var14 = 11;
                                        class145.field3497 = class145.field3497.method781(arg0 ^ 0x4685, class3.field28.method790(127));
                                    }
                                }
                                class98 var16 = class145.field3497.method786(arg0 - 20873);
                                if (var16.method792((byte) -84, class32.field761)) {
                                    var15 = 1;
                                    class145.field3497 = class145.field3497.method781(arg0 ^ 0x4685, class32.field761.method790(120));
                                } else if (var16.method792((byte) -84, class112.field2513)) {
                                    var15 = 2;
                                    class145.field3497 = class145.field3497.method781(arg0 ^ 0x4685, class112.field2513.method790(110));
                                } else if (var16.method792((byte) -84, class113.field2539)) {
                                    class145.field3497 = class145.field3497.method781(0, class113.field2539.method790(arg0 ^ 0x46E5));
                                    var15 = 3;
                                } else if (var16.method792((byte) -84, class96.field2216)) {
                                    class145.field3497 = class145.field3497.method781(0, class96.field2216.method790(110));
                                    var15 = 4;
                                } else if (var16.method792((byte) -84, class21.field475)) {
                                    var15 = 5;
                                    class145.field3497 = class145.field3497.method781(arg0 - 18053, class21.field475.method790(109));
                                } else if (class139.field3391 != 0) {
                                    if (var16.method792((byte) -84, class32.field757)) {
                                        var15 = 1;
                                        class145.field3497 = class145.field3497.method781(arg0 - 18053, class32.field757.method790(arg0 + -17963));
                                    } else if (var16.method792((byte) -84, class112.field2517)) {
                                        var15 = 2;
                                        class145.field3497 = class145.field3497.method781(0, class112.field2517.method790(arg0 ^ 0x46DF));
                                    } else if (var16.method792((byte) -84, class113.field2527)) {
                                        class145.field3497 = class145.field3497.method781(0, class113.field2527.method790(arg0 ^ 0x46E2));
                                        var15 = 3;
                                    } else if (var16.method792((byte) -84, class96.field2214)) {
                                        class145.field3497 = class145.field3497.method781(0, class96.field2214.method790(111));
                                        var15 = 4;
                                    } else if (var16.method792((byte) -84, class21.field473)) {
                                        var15 = 5;
                                        class145.field3497 = class145.field3497.method781(0, class21.field473.method790(125));
                                    }
                                }
                                class132.field3116.method177(arg0 ^ 0x5F65, 143);
                                class132.field3116.method95(0, true);
                                int var17 = class132.field3116.field182;
                                class132.field3116.method95(var14, true);
                                class132.field3116.method95(var15, true);
                                class36.method340(class132.field3116, class145.field3497, (byte) -78);
                                class132.field3116.method67((byte) -126, class132.field3116.field182 - var17);
                                if (class80.field1749 == 2) {
                                    class16.field324++;
                                    class80.field1749 = 3;
                                    class126.field2793 = true;
                                    class132.field3116.method177(arg0 ^ 0x5F65, 214);
                                    class132.field3116.method95(class80.field1749, true);
                                    class132.field3116.method95(class54.field1193, true);
                                    class132.field3116.method95(class67.field1433, true);
                                }
                            }
                            class145.field3497 = class145.field3503;
                            class15.field306 = true;
                        }
                    }
                }
                return;
            } while (!class51.method430(class4.field66, (byte) -65) && class4.field66 != 32);
            if (class145.field3499.method790(122) < 12) {
                class145.field3499 = class145.field3499.method810(-87, class4.field66);
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BIII)I")
    public static final int method151(byte arg0, int arg1, int arg2, int arg3) {
        field290++;
        if (arg0 != 85) {
            field288 = null;
        }
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return 7 - arg1;
        }
    }
}
