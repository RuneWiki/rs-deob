import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class166 extends class212 {

    @OriginalMember(owner = "client!vc", name = "V", descriptor = "Lsc;")
    public static class181 field2817 = null;

    @OriginalMember(owner = "client!vc", name = "Y", descriptor = "Lsc;")
    public static class181 field2820 = class149.method967(255, "::clientdrop");

    @OriginalMember(owner = "client!vc", name = "Z", descriptor = "[I")
    public static int[] field2821 = new int[128];

    @OriginalMember(owner = "client!vc", name = "cb", descriptor = "[I")
    public static int[] field2824 = new int[4096];

    @OriginalMember(owner = "client!vc", name = "eb", descriptor = "Z")
    public static boolean field2826;

    @OriginalMember(owner = "client!vc", name = "U", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!vc", name = "W", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!vc", name = "X", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!vc", name = "ab", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!vc", name = "bb", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!vc", name = "db", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!vc", name = "fb", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)[I")
    public final int[] method24(int arg0, byte arg1) {
        if (arg1 <= 25) {
            this.method24(-4, (byte) 32);
        }
        field2822++;
        return class253.field4416;
    }

    @OriginalMember(owner = "client!vc", name = "f", descriptor = "(I)V")
    public static final void method1106(int arg0) {
        field2816++;
        if (class263.field4583 > 0) {
            class263.field4583--;
        }
        if (class102.field1701 > 1) {
            class55.field851 = class247.field4318;
            class102.field1701--;
        }
        if (class38.field588) {
            class38.field588 = false;
            class124.method804(arg0 + 16263);
            return;
        }
        if (arg0 != -16203) {
            field2827 = 72;
        }
        for (int var1 = 0; var1 < 100 && class13.method126(0); var1++) {
        }
        if (class5.field106 != 30) {
            return;
        }
        class1.method6(arg0 + 16205, class141.field2275, 255);
        Object var2 = class120.field1973.field1120;
        synchronized (class120.field1973.field1120) {
            if (!class235.field4090) {
                class120.field1973.field1122 = 0;
            } else if (class146.field2406 != 0 || class120.field1973.field1122 >= 40) {
                class141.field2275.method541(138, 65);
                class141.field2275.method1538(0, (byte) -116);
                int var3 = class141.field2275.field3933;
                class9.field174++;
                int var4 = 0;
                for (int var5 = 0; var5 < class120.field1973.field1122 && class141.field2275.field3933 - var3 < 240; var5++) {
                    int var6 = class120.field1973.field1123[var5];
                    var4++;
                    int var7 = class120.field1973.field1121[var5];
                    boolean var8 = false;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    if (class120.field1973.field1123[var5] == -1 && class120.field1973.field1121[var5] == -1) {
                        var6 = -1;
                        var8 = true;
                        var7 = -1;
                    }
                    if (class120.field1948 != var7 || class179.field3133 != var6) {
                        int var9 = var6 - class179.field3133;
                        class179.field3133 = var6;
                        int var10 = var7 - class120.field1948;
                        class120.field1948 = var7;
                        if (class145.field2351 < 8 && var10 >= -32 && var10 <= 31 && var9 >= -32 && var9 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class141.field2275.method1534(0, (class145.field2351 << 12) + (var10 << 6) + var9);
                            class145.field2351 = 0;
                        } else if (class145.field2351 < 32 && var10 >= -128 && var10 <= 127 && var9 >= -128 && var9 <= 127) {
                            var10 += 128;
                            var9 += 128;
                            class141.field2275.method1538(class145.field2351 + 128, (byte) -76);
                            class141.field2275.method1534(0, (var10 << 8) + var9);
                            class145.field2351 = 0;
                        } else if (class145.field2351 < 32) {
                            class141.field2275.method1538(class145.field2351 + 192, (byte) -113);
                            if (var8) {
                                class141.field2275.method1544(Integer.MIN_VALUE, -3165);
                            } else {
                                class141.field2275.method1544(var7 | var6 << 16, -3165);
                            }
                            class145.field2351 = 0;
                        } else {
                            class141.field2275.method1534(0, class145.field2351 + 57344);
                            if (var8) {
                                class141.field2275.method1544(Integer.MIN_VALUE, -3165);
                            } else {
                                class141.field2275.method1544(var7 | var6 << 16, -3165);
                            }
                            class145.field2351 = 0;
                        }
                    } else if (class145.field2351 < 2047) {
                        class145.field2351++;
                    }
                }
                class141.field2275.method1553(class141.field2275.field3933 - var3, false);
                if (var4 >= class120.field1973.field1122) {
                    class120.field1973.field1122 = 0;
                } else {
                    class120.field1973.field1122 -= var4;
                    for (int var11 = 0; var11 < class120.field1973.field1122; var11++) {
                        class120.field1973.field1121[var11] = class120.field1973.field1121[var4 + var11];
                        class120.field1973.field1123[var11] = class120.field1973.field1123[var4 + var11];
                    }
                }
            }
        }
        if (class146.field2406 != 0) {
            class129.field2137++;
            long var12 = (class200.field3456 - class250.field4366) / 50L;
            class250.field4366 = class200.field3456;
            int var14 = class235.field4093;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            int var15 = (int) var12;
            int var16 = class93.field1478;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 65535) {
                var16 = 65535;
            }
            byte var17 = 0;
            if (class146.field2406 == 2) {
                var17 = 1;
            }
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            class141.field2275.method541(169, arg0 + 16247);
            class141.field2275.method1520(false, var17 << 15 | var15);
            class141.field2275.method1522(var14 | var16 << 16, true);
        }
        if (class125.field2072 > 0) {
            class125.field2072--;
        }
        if (class68.field1095[96] || class68.field1095[97] || class68.field1095[98] || class68.field1095[99]) {
            class127.field2108 = true;
        }
        if (class127.field2108 && class125.field2072 <= 0) {
            class125.field2072 = 20;
            class144.field2343++;
            class127.field2108 = false;
            class141.field2275.method541(171, 114);
            class141.field2275.method1534(0, class113.field1845);
            class141.field2275.method1537(arg0 ^ 0xFFFFC0B4, class214.field3682);
        }
        if (class76.field1226 && !class194.field3397) {
            class214.field3686++;
            class194.field3397 = true;
            class141.field2275.method541(158, 41);
            class141.field2275.method1538(1, (byte) -85);
        }
        if (!class76.field1226 && class194.field3397) {
            class214.field3686++;
            class194.field3397 = false;
            class141.field2275.method541(158, -109);
            class141.field2275.method1538(0, (byte) -91);
        }
        if (!class132.field2179) {
            class4.field81++;
            class141.field2275.method541(232, -92);
            class141.field2275.method1565(class239.method1630((byte) -93), -726498136);
            class132.field2179 = true;
        }
        class184.method1256((byte) 4);
        if (class5.field106 != 30) {
            return;
        }
        class220.method1462((byte) -52);
        class260.method1763((byte) 8);
        class203.field3506++;
        if (class203.field3506 > 750) {
            class124.method804(59);
            return;
        }
        class109.method730(-1);
        class217.method1440((byte) -103);
        class99.method663((byte) -125);
        if (class160.field2736 != null) {
            class190.method1316(true);
        }
        for (int var18 = class86.method576(-74, true); var18 != -1; var18 = class86.method576(-107, false)) {
            class99.method659(var18, (byte) -93);
            class253.field4413[class5.method43(31, class111.field1821++)] = var18;
        }
        for (class91 var19 = class140.method895(124); var19 != null; var19 = class140.method895(124)) {
            int var20 = var19.method599(arg0 + 16205);
            int var21 = var19.method604(-3633);
            if (var20 == 1) {
                class192.field3374[var21] = var19.field1443;
                class256.field4486[class5.method43(31, class211.field3615++)] = var21;
            } else if (var20 == 2) {
                class18.field321[var21] = var19.field1444;
                class94.field1509[class5.method43(31, class82.field1311++)] = var21;
            }
        }
        class258.field4504++;
        if (class37.field573 != 0) {
            class163.field2780 += 20;
            if (class163.field2780 >= 400) {
                class37.field573 = 0;
            }
        }
        if (class2.field51 != null) {
            class94.field1491++;
            if (class94.field1491 >= 15) {
                class218.method1453((byte) -72, class2.field51);
                class2.field51 = null;
            }
        }
        if (class88.field1402 != null) {
            class218.method1453((byte) -114, class88.field1402);
            class232.field4055++;
            if ((class88.field1406 + 5) < class79.field1279 || (class88.field1406 - 5) > class79.field1279 || class183.field3215 > class220.field3795 + 5 || class183.field3215 < class220.field3795 - 5) {
                class244.field4237 = true;
            }
            if (class39.field599 == 0) {
                if (class244.field4237 && class232.field4055 >= 5) {
                    if (class88.field1402 == class185.field3291 && class7.field127 != class45.field694) {
                        class194.field3395++;
                        byte var22 = 0;
                        class175 var23 = class88.field1402;
                        if (class43.field667 == 1 && var23.field3067 == 206) {
                            var22 = 1;
                        }
                        if (var23.field3065[class7.field127] <= 0) {
                            var22 = 0;
                        }
                        if (class209.method1386(client.method1058(var23), -103)) {
                            int var26 = class45.field694;
                            int var27 = class7.field127;
                            var23.field3065[var27] = var23.field3065[var26];
                            var23.field2935[var27] = var23.field2935[var26];
                            var23.field3065[var26] = -1;
                            var23.field2935[var26] = 0;
                        } else if (var22 == 1) {
                            int var24 = class45.field694;
                            int var25 = class7.field127;
                            while (var24 != var25) {
                                if (var25 < var24) {
                                    var23.method1163(var24 - 1, var24, (byte) 72);
                                    var24--;
                                } else if (var25 > var24) {
                                    var23.method1163(var24 + 1, var24, (byte) 66);
                                    var24++;
                                }
                            }
                        } else {
                            var23.method1163(class7.field127, class45.field694, (byte) 87);
                        }
                        class141.field2275.method541(142, -98);
                        class141.field2275.method1534(0, class45.field694);
                        class141.field2275.method1544(class88.field1402.field2987, arg0 + 13038);
                        class141.field2275.method1525(var22, -19);
                        class141.field2275.method1559(class7.field127, arg0 + 16203);
                    }
                } else if (!(class238.field4133 != 1 && !class136.method876(2000, class131.field2177 - 1) || class131.field2177 <= 2) || class94.field1492 == 1) {
                    class169.method1122(arg0 ^ 0xFFFFC0C1);
                } else if (class131.field2177 > 0 || class94.field1492 == 2) {
                    class230.method1533(class131.field2177 - 1, 1);
                }
                class146.field2406 = 0;
                class88.field1402 = null;
                class94.field1491 = 10;
            }
        }
        class126.field2096 = 0;
        class190.field3356 = false;
        class175 var28 = class151.field2517;
        class85.field1361 = null;
        class170.field2863 = false;
        class175 var29 = class46.field731;
        class46.field731 = null;
        class151.field2517 = null;
        while (class55.method404((byte) 123) && class126.field2096 < 128) {
            class83.field1326[class126.field2096] = class13.field261;
            field2821[class126.field2096] = class196.field3419;
            class126.field2096++;
        }
        class160.field2736 = null;
        if (class243.field4227 != -1) {
            class255.method1739(0, 0, 0, (byte) 50, class143.field2321, 0, class243.field4227, class41.field620);
        }
        class247.field4318++;
        while (true) {
            class94 var30;
            class175 var31;
            class175 var32;
            do {
                var30 = (class94) class173.field2900.method1688((byte) 27);
                if (var30 == null) {
                    while (true) {
                        class94 var33;
                        class175 var34;
                        class175 var35;
                        do {
                            var33 = (class94) class236.field4095.method1688((byte) 27);
                            if (var33 == null) {
                                while (true) {
                                    class94 var36;
                                    class175 var37;
                                    class175 var38;
                                    do {
                                        var36 = (class94) class46.field724.method1688((byte) 27);
                                        if (var36 == null) {
                                            if (class196.field3415 && class160.field2736 == null) {
                                                class196.field3415 = false;
                                            }
                                            if (class244.field4229 != null) {
                                                class70.method488((byte) -112);
                                            }
                                            if (class264.field4594 > 0 && class68.field1095[82] && class68.field1095[81] && class5.field103 != 0) {
                                                int var39 = class38.field581 - class5.field103;
                                                if (var39 < 0) {
                                                    var39 = 0;
                                                } else if (var39 > 3) {
                                                    var39 = 3;
                                                }
                                                class68.method477(class258.field4507.field2623[0] + class222.field3844, var39, (byte) -65, class258.field4507.field2672[0] + class253.field4420);
                                            }
                                            if (class194.field3389 != -1) {
                                                int var40 = class123.field2024;
                                                int var41 = class194.field3389;
                                                if (class264.field4594 > 0 && class68.field1095[82] && class68.field1095[81]) {
                                                    class68.method477(class222.field3844 + var40, class38.field581, (byte) 73, class253.field4420 + var41);
                                                } else {
                                                    boolean var42 = class201.method1356(0, (byte) 119, var40, 0, var41, class258.field4507.field2623[0], 0, true, 0, 0, class258.field4507.field2672[0], 0);
                                                    if (var42) {
                                                        class163.field2780 = 0;
                                                        class37.field573 = 1;
                                                        class239.field4146 = class235.field4093;
                                                        class57.field871 = class93.field1478;
                                                    }
                                                }
                                                class194.field3389 = -1;
                                            }
                                            class25.method212(arg0 + 16257);
                                            if (class151.field2517 != var28) {
                                                if (var28 != null) {
                                                    class218.method1453((byte) -73, var28);
                                                }
                                                if (class151.field2517 != null) {
                                                    class218.method1453((byte) -93, class151.field2517);
                                                }
                                            }
                                            if (class46.field731 != var29 && class80.field1298 == class125.field2063) {
                                                if (var29 != null) {
                                                    class218.method1453((byte) -92, var29);
                                                }
                                                if (class46.field731 != null) {
                                                    class218.method1453((byte) -73, class46.field731);
                                                }
                                            }
                                            if (class46.field731 == null) {
                                                if (class80.field1298 > 0) {
                                                    class80.field1298--;
                                                }
                                            } else if (class125.field2063 > class80.field1298) {
                                                class80.field1298++;
                                                if (class80.field1298 == class125.field2063) {
                                                    class218.method1453((byte) -91, class46.field731);
                                                }
                                            }
                                            if (class110.field1792 == 1) {
                                                class60.method434((byte) 49);
                                            } else if (class110.field1792 == 2) {
                                                class178.method1189(arg0 ^ 0x3F7C);
                                            } else {
                                                class5.method41((byte) -128);
                                            }
                                            for (int var43 = 0; var43 < 5; var43++) {
                                                int var10002 = class257.field4502[var43]++;
                                            }
                                            int var44 = class51.method383((byte) 112);
                                            int var45 = class131.method844((byte) -63);
                                            if (var44 > 4500 && var45 > 4500) {
                                                class263.field4583 = 250;
                                                class177.method1178(4000, -1202771900);
                                                class141.field2275.method541(225, -89);
                                                class109.field1779++;
                                            }
                                            class149.field2484++;
                                            class170.field2858++;
                                            if (class149.field2484 > 500) {
                                                class149.field2484 = 0;
                                                int var46 = (int) (Math.random() * 8.0D);
                                                if ((var46 & 0x1) == 1) {
                                                    class222.field3832 += class177.field3108;
                                                }
                                                if ((var46 & 0x4) == 4) {
                                                    class234.field4069 += class177.field3106;
                                                }
                                                if ((var46 & 0x2) == 2) {
                                                    class171.field2872 += class138.field2255;
                                                }
                                            }
                                            if (class222.field3832 < -50) {
                                                class177.field3108 = 2;
                                            }
                                            if (class171.field2872 < -55) {
                                                class138.field2255 = 2;
                                            }
                                            class45.field695++;
                                            if (class222.field3832 > 50) {
                                                class177.field3108 = -2;
                                            }
                                            if (class45.field695 > 500) {
                                                class45.field695 = 0;
                                                int var47 = (int) (Math.random() * 8.0D);
                                                if ((var47 & 0x1) == 1) {
                                                    class144.field2348 += class238.field4137;
                                                }
                                                if ((var47 & 0x2) == 2) {
                                                    class221.field3821 += class43.field669;
                                                }
                                            }
                                            if (class234.field4069 < -40) {
                                                class177.field3106 = 1;
                                            }
                                            if (class221.field3821 < -20) {
                                                class43.field669 = 1;
                                            }
                                            if (class144.field2348 < -60) {
                                                class238.field4137 = 2;
                                            }
                                            if (class144.field2348 > 60) {
                                                class238.field4137 = -2;
                                            }
                                            if (class171.field2872 > 55) {
                                                class138.field2255 = -2;
                                            }
                                            if (class234.field4069 > 40) {
                                                class177.field3106 = -1;
                                            }
                                            if (class221.field3821 > 10) {
                                                class43.field669 = -1;
                                            }
                                            if (class170.field2858 > 50) {
                                                class187.field3302++;
                                                class141.field2275.method541(120, 57);
                                            }
                                            class177.method1181(-12061);
                                            try {
                                                if (class216.field3713 != null && class141.field2275.field3933 > 0) {
                                                    class216.field3713.method317(class141.field2275.field3933, -122, class141.field2275.field3977, 0);
                                                    class170.field2858 = 0;
                                                    class141.field2275.field3933 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var48) {
                                                class124.method804(87);
                                                return;
                                            }
                                        }
                                        var37 = var36.field1488;
                                        if (var37.field2934 < 0) {
                                            break;
                                        }
                                        var38 = class52.method394(var37.field2958, false);
                                    } while (var38 == null || var38.field3066 == null || var38.field3066.length <= var37.field2934 || var38.field3066[var37.field2934] != var37);
                                    class27.method225(var36, (byte) 120);
                                }
                            }
                            var34 = var33.field1488;
                            if (var34.field2934 < 0) {
                                break;
                            }
                            var35 = class52.method394(var34.field2958, false);
                        } while (var35 == null || var35.field3066 == null || var34.field2934 >= var35.field3066.length || var35.field3066[var34.field2934] != var34);
                        class27.method225(var33, (byte) 120);
                    }
                }
                var31 = var30.field1488;
                if (var31.field2934 < 0) {
                    break;
                }
                var32 = class52.method394(var31.field2958, false);
            } while (var32 == null || var32.field3066 == null || var31.field2934 >= var32.field3066.length || var32.field3066[var31.field2934] != var31);
            class27.method225(var30, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljb;IIZ)Lka;")
    public static final class134 method1107(class11 arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            field2820 = null;
        }
        field2823++;
        return class242.method1646(arg1, (byte) -64, arg0, arg2) ? class51.method387(-124) : null;
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(B)V")
    public static final void method1108(byte arg0) {
        field2825++;
        class69.field1103.method1798(-123);
        if (arg0 != -36) {
            method1108((byte) -122);
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(IB)I")
    public static final int method1109(int arg0, byte arg1) {
        field2818++;
        if (arg1 != 44) {
            method1109(58, (byte) -73);
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!vc", name = "g", descriptor = "(I)V")
    public static void method1110(int arg0) {
        field2817 = null;
        field2821 = null;
        if (arg0 != -2) {
            method1107((class11) null, -24, 18, true);
        }
        field2824 = null;
        field2820 = null;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
    public class166() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljb;ILsc;)Luf;")
    public static final class217 method1111(class11 arg0, int arg1, class181 arg2) {
        field2819++;
        int var3 = arg0.method107(arg2, arg1 - 12011);
        if (var3 == -1) {
            return new class217(0);
        }
        int[] var4 = arg0.method100(var3, true);
        class217 var5 = new class217(var4.length);
        if (arg1 != 11975) {
            field2824 = null;
        }
        for (int var6 = 0; var6 < var5.field3717; var6++) {
            class230 var7 = new class230(arg0.method89(var4[var6], var3, 112));
            var5.field3732[var6] = var7.method1549(class102.method690(arg1, 11963));
            var5.field3719[var6] = var7.method1563(-255688184);
            var5.field3734[var6] = (short) var7.method1535(arg1 - 11973);
            var5.field3716[var6] = (short) var7.method1535(2);
            var5.field3715[var6] = var7.method1529(-32494);
        }
        return var5;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field2824[var0] = class230.method1518(10675, var0);
        }
        field2826 = false;
    }
}
