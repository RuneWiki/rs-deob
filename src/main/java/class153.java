import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class153 {

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field2252 = 0;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "[Lfe;")
    public static class271[] field2266 = new class271[4];

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public int field2260;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public int field2264;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public int field2265;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public int field2268;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "J")
    public long field2267;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "Luh;")
    public static class104 field2262;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Lnh;")
    public class55 field2255;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "Lnh;")
    public class55 field2263;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "Lnh;")
    public class55 field2269;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "Lub;")
    public static class92 field2256;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "[Z")
    public static boolean[] field2257;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1103(String arg0, String arg1, String arg2, int arg3) {
        int var4 = arg1.indexOf(arg0);
        field2254++;
        while (var4 != -1) {
            arg1 = arg1.substring(0, var4) + arg2 + arg1.substring(arg0.length() + var4);
            var4 = arg1.indexOf(arg0, arg2.length() + var4);
        }
        return arg3 >= -13 ? null : arg1;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
    public static void method1104(byte arg0) {
        if (arg0 == -5) {
            field2266 = null;
            field2256 = null;
            field2262 = null;
            field2257 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static final void method1105(int arg0) {
        field2261++;
        if (class219.field3340 > 0) {
            class219.field3340--;
        }
        if (class304.field4892 > 1) {
            class255.field4082 = class216.field3305;
            class304.field4892--;
        }
        if (class7.field121) {
            class7.field121 = false;
            class28.method235(arg0 ^ 0xCB0);
            return;
        }
        for (int var1 = 0; var1 < 100 && class246.method1666((byte) -125); var1++) {
        }
        if (class23.field382 != 30) {
            return;
        }
        class44.method379(class240.field3826, 1, 165);
        Object var2 = class182.field2858.field4529;
        synchronized (class182.field2858.field4529) {
            if (!class295.field4602) {
                class182.field2858.field4538 = 0;
            } else if (class68.field1075 != 0 || class182.field2858.field4538 >= 40) {
                class184.field2904++;
                class240.field3826.method1762(31, true);
                class240.field3826.method305(0, true);
                int var3 = class240.field3826.field541;
                int var4 = 0;
                for (int var5 = 0; class182.field2858.field4538 > var5 && class240.field3826.field541 - var3 < 240; var5++) {
                    var4++;
                    int var6 = class182.field2858.field4535[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    boolean var7 = false;
                    int var8 = class182.field2858.field4533[var5];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 65534) {
                        var8 = 65534;
                    }
                    if (class182.field2858.field4535[var5] == -1 && class182.field2858.field4533[var5] == -1) {
                        var6 = -1;
                        var8 = -1;
                        var7 = true;
                    }
                    if (class210.field3243 != var8 || class202.field3123 != var6) {
                        int var9 = var6 - class202.field3123;
                        class202.field3123 = var6;
                        int var10 = var8 - class210.field3243;
                        class210.field3243 = var8;
                        if (class183.field2901 < 8 && var10 >= -32 && var10 <= 31 && var9 >= -32 && var9 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class240.field3826.method281((byte) -123, (var10 << 6) + ((class183.field2901 << 12) + var9));
                            class183.field2901 = 0;
                        } else if (class183.field2901 < 32 && var10 >= -128 && var10 <= 127 && var9 >= -128 && var9 <= 127) {
                            class240.field3826.method305(class183.field2901 + 128, true);
                            var9 += 128;
                            var10 += 128;
                            class240.field3826.method281((byte) -109, (var10 << 8) + var9);
                            class183.field2901 = 0;
                        } else if (class183.field2901 < 32) {
                            class240.field3826.method305(class183.field2901 + 192, true);
                            if (var7) {
                                class240.field3826.method258(Integer.MIN_VALUE, -1527329320);
                            } else {
                                class240.field3826.method258(var8 | var6 << 16, -1527329320);
                            }
                            class183.field2901 = 0;
                        } else {
                            class240.field3826.method281((byte) -112, class183.field2901 + 57344);
                            if (var7) {
                                class240.field3826.method258(Integer.MIN_VALUE, arg0 ^ 0xA4F6C168);
                            } else {
                                class240.field3826.method258(var6 << 16 | var8, -1527329320);
                            }
                            class183.field2901 = 0;
                        }
                    } else if (class183.field2901 < 2047) {
                        class183.field2901++;
                    }
                }
                class240.field3826.method309(class240.field3826.field541 - var3, true);
                if (var4 < class182.field2858.field4538) {
                    class182.field2858.field4538 -= var4;
                    for (int var11 = 0; var11 < class182.field2858.field4538; var11++) {
                        class182.field2858.field4533[var11] = class182.field2858.field4533[var4 + var11];
                        class182.field2858.field4535[var11] = class182.field2858.field4535[var4 + var11];
                    }
                } else {
                    class182.field2858.field4538 = 0;
                }
            }
        }
        if (class68.field1075 != 0) {
            class162.field2435++;
            long var12 = (class266.field4205 - class182.field2880) / 50L;
            int var14 = class240.field3829;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = (int) var12;
            class182.field2880 = class266.field4205;
            byte var16 = 0;
            int var17 = class73.field1126;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 65535) {
                var17 = 65535;
            }
            if (class68.field1075 == 2) {
                var16 = 1;
            }
            class240.field3826.method1762(185, true);
            class240.field3826.method303((byte) -121, var17 | var14 << 16);
            class240.field3826.method274(27071, var16 << 15 | var15);
        }
        if (class198.field3079 > 0) {
            class198.field3079--;
        }
        if (class130.field1929 && class198.field3079 <= 0) {
            class198.field3079 = 20;
            class43.field725++;
            class130.field1929 = false;
            class240.field3826.method1762(125, true);
            class240.field3826.method274(27071, (int) class248.field3941);
            class240.field3826.method264(arg0 ^ 0xFFFFF326, (int) class50.field818);
        }
        if (class216.field3308 && !class28.field469) {
            class163.field2455++;
            class28.field469 = true;
            class240.field3826.method1762(251, true);
            class240.field3826.method305(1, true);
        }
        if (!class216.field3308 && class28.field469) {
            class163.field2455++;
            class28.field469 = false;
            class240.field3826.method1762(251, true);
            class240.field3826.method305(0, true);
        }
        if (!class24.field426) {
            class240.field3826.method1762(166, true);
            class240.field3826.method303((byte) -119, class182.method1300(0));
            class24.field426 = true;
            class92.field1441++;
        }
        if (class220.field3359) {
            class220.field3359 = false;
        } else {
            class260.field4118 /= 2.0F;
        }
        if (class91.field1417) {
            class91.field1417 = false;
        } else {
            class226.field3621 /= 2.0F;
        }
        class294.method1947(-128);
        if (class23.field382 != 30) {
            return;
        }
        class232.method1595(1);
        class162.method1175(true);
        class238.method1627(arg0 ^ arg0);
        class50.field813++;
        if (class50.field813 > 750) {
            class28.method235(0);
            return;
        }
        class53.method455(false);
        class174.method1241(arg0 - 1143240036);
        class181.method1295(-26069);
        if (class131.field1949 != null) {
            class238.method1630((byte) -77);
        }
        for (int var18 = class136.method1015(true, -1); var18 != -1; var18 = class136.method1015(false, -1)) {
            class170.method1227(var18, -7);
            class260.field4113[class118.method863(class59.field939++, 31)] = var18;
        }
        for (class69 var19 = class239.method1633(0); var19 != null; var19 = class239.method1633(0)) {
            int var20 = var19.method557(arg0 - 2993);
            int var21 = var19.method553(false);
            if (var20 == 1) {
                class205.field3155[var21] = var19.field1091;
                class215.field3297[class118.method863(31, class98.field1576++)] = var21;
            } else if (var20 == 2) {
                class2.field30[var21] = var19.field1099;
                class195.field3065[class118.method863(31, class247.field3929++)] = var21;
            } else if (var20 == 3) {
                class222 var42 = class169.method1217(var21, arg0 + 8932);
                if (!var19.field1099.equals(var42.field3544)) {
                    var42.field3544 = var19.field1099;
                    class80.method628((byte) -66, var42);
                }
            } else if (var20 == 4) {
                class222 var22 = class169.method1217(var21, arg0 + 8932);
                int var23 = var19.field1088;
                int var24 = var19.field1091;
                int var25 = var19.field1086;
                if (var22.field3432 != var24 || var22.field3524 != var23 || var22.field3454 != var25) {
                    var22.field3432 = var24;
                    var22.field3454 = var25;
                    var22.field3524 = var23;
                    class80.method628((byte) -69, var22);
                }
            } else if (var20 == 5) {
                class222 var41 = class169.method1217(var21, 12180);
                if (var19.field1091 != var41.field3462 || var19.field1091 == -1) {
                    var41.field3442 = 0;
                    var41.field3470 = 1;
                    var41.field3498 = 0;
                    var41.field3462 = var19.field1091;
                    class80.method628((byte) -104, var41);
                }
            } else if (var20 == 6) {
                int var35 = var19.field1091;
                int var36 = var35 >> 5 & 0x1F;
                int var37 = var35 >> 10 & 0x1F;
                int var38 = var35 & 0x1F;
                int var39 = (var36 << 11) + ((var37 << 19) + (var38 << 3));
                class222 var40 = class169.method1217(var21, 12180);
                if (var40.field3522 != var39) {
                    var40.field3522 = var39;
                    class80.method628((byte) -81, var40);
                }
            } else if (var20 == 7) {
                class222 var26 = class169.method1217(var21, arg0 + 8932);
                boolean var27 = var19.field1091 == 1;
                if (var27 != var26.field3535) {
                    var26.field3535 = var27;
                    class80.method628((byte) -83, var26);
                }
            } else if (var20 == 8) {
                class222 var34 = class169.method1217(var21, 12180);
                if (var19.field1091 != var34.field3406 || var19.field1088 != var34.field3448 || var19.field1086 != var34.field3450) {
                    var34.field3448 = var19.field1088;
                    var34.field3450 = var19.field1086;
                    if (var34.field3391 != -1) {
                        if (var34.field3458 > 0) {
                            var34.field3450 = var34.field3450 * 32 / var34.field3458;
                        } else if (var34.field3487 > 0) {
                            var34.field3450 = var34.field3450 * 32 / var34.field3487;
                        }
                    }
                    var34.field3406 = var19.field1091;
                    class80.method628((byte) -79, var34);
                }
            } else if (var20 == 9) {
                class222 var33 = class169.method1217(var21, 12180);
                if (var19.field1091 != var33.field3391 || var19.field1088 != var33.field3551) {
                    var33.field3391 = var19.field1091;
                    var33.field3551 = var19.field1088;
                    class80.method628((byte) -125, var33);
                }
            } else if (var20 == 10) {
                class222 var32 = class169.method1217(var21, 12180);
                if (var19.field1091 != var32.field3414 || var19.field1088 != var32.field3386 || var19.field1086 != var32.field3456) {
                    var32.field3386 = var19.field1088;
                    var32.field3414 = var19.field1091;
                    var32.field3456 = var19.field1086;
                    class80.method628((byte) -92, var32);
                }
            } else if (var20 == 11) {
                class222 var31 = class169.method1217(var21, 12180);
                var31.field3387 = 0;
                var31.field3401 = var31.field3508 = var19.field1088;
                var31.field3515 = var31.field3564 = var19.field1091;
                var31.field3445 = 0;
                class80.method628((byte) -91, var31);
            } else if (var20 == 12) {
                class222 var29 = class169.method1217(var21, 12180);
                int var30 = var19.field1091;
                if (var29 != null && var29.field3552 == 0) {
                    if ((var29.field3460 - var29.field3561) < var30) {
                        var30 = var29.field3460 - var29.field3561;
                    }
                    if (var30 < 0) {
                        var30 = 0;
                    }
                    if (var29.field3569 != var30) {
                        var29.field3569 = var30;
                        class80.method628((byte) -89, var29);
                    }
                }
            } else if (var20 == 13) {
                class222 var28 = class169.method1217(var21, 12180);
                var28.field3482 = var19.field1091;
            }
        }
        class209.field3230++;
        if (class259.field4106 != 0) {
            class274.field4368 += 20;
            if (class274.field4368 >= 400) {
                class259.field4106 = 0;
            }
        }
        if (class149.field2217 != null) {
            class72.field1111++;
            if (class72.field1111 >= 15) {
                class80.method628((byte) -64, class149.field2217);
                class149.field2217 = null;
            }
        }
        if (class106.field1666 != null) {
            class80.method628((byte) -93, class106.field1666);
            class297.field4781++;
            if ((class127.field1909 + 5) < class171.field2587 || class171.field2587 < class127.field1909 - 5 || class163.field2451 + 5 < class157.field2340 || class163.field2451 - 5 > class157.field2340) {
                class117.field1783 = true;
            }
            if (class155.field2312 == 0) {
                if (class117.field1783 && class297.field4781 >= 5) {
                    if (class215.field3291 == class106.field1666 && class183.field2881 != class137.field2068) {
                        byte var43 = 0;
                        class2.field35++;
                        class222 var44 = class106.field1666;
                        if (class135.field2016 == 1 && var44.field3388 == 206) {
                            var43 = 1;
                        }
                        if (var44.field3407[class137.field2068] <= 0) {
                            var43 = 0;
                        }
                        if (client.method1159(var44).method237(arg0 - 3325)) {
                            int var45 = class183.field2881;
                            int var46 = class137.field2068;
                            var44.field3407[var46] = var44.field3407[var45];
                            var44.field3567[var46] = var44.field3567[var45];
                            var44.field3407[var45] = -1;
                            var44.field3567[var45] = 0;
                        } else if (var43 == 1) {
                            int var47 = class183.field2881;
                            int var48 = class137.field2068;
                            while (var47 != var48) {
                                if (var47 > var48) {
                                    var44.method1514(5, var47, var47 - 1);
                                    var47--;
                                } else if (var48 > var47) {
                                    var44.method1514(5, var47, var47 + 1);
                                    var47++;
                                }
                            }
                        } else {
                            var44.method1514(arg0 - 3243, class183.field2881, class137.field2068);
                        }
                        class240.field3826.method1762(81, true);
                        class240.field3826.method264(-120, class183.field2881);
                        class240.field3826.method264(-126, class137.field2068);
                        class240.field3826.method307(var43, -129);
                        class240.field3826.method258(class106.field1666.field3554, arg0 - 1527332568);
                    }
                } else if ((class291.field4524 == 1 || class27.method221((byte) 125, class14.field174 - 1)) && class14.field174 > 2) {
                    class160.method1161((byte) 1);
                } else if (class14.field174 > 0) {
                    class126.method946((byte) -95);
                }
                class68.field1075 = 0;
                class106.field1666 = null;
                class72.field1111 = 10;
            }
        }
        class222 var49 = class43.field729;
        class201.field3111 = false;
        class43.field729 = null;
        class244.field3896 = null;
        class98.field1573 = 0;
        class222 var50 = class101.field1581;
        class91.field1425 = false;
        class101.field1581 = null;
        while (class2.method7(-19877) && class98.field1573 < 128) {
            class9.field150[class98.field1573] = class172.field2628;
            class26.field445[class98.field1573] = class92.field1471;
            class98.field1573++;
        }
        class131.field1949 = null;
        if (class298.field4803 != -1) {
            class223.method1530((byte) -63, class163.field2449, 0, 0, class179.field2816, 0, 0, class298.field4803);
        }
        class216.field3305++;
        while (true) {
            class26 var51;
            class222 var52;
            class222 var53;
            do {
                var51 = (class26) class49.field802.method8(7);
                if (var51 == null) {
                    while (true) {
                        class26 var54;
                        class222 var55;
                        class222 var56;
                        do {
                            var54 = (class26) class154.field2306.method8(7);
                            if (var54 == null) {
                                while (true) {
                                    class26 var57;
                                    class222 var58;
                                    class222 var59;
                                    do {
                                        var57 = (class26) class49.field801.method8(arg0 - 3241);
                                        if (var57 == null) {
                                            if (class131.field1949 == null) {
                                                class299.field4814 = 0;
                                            }
                                            if (class113.field1747 != null) {
                                                class199.method1410(0);
                                            }
                                            if (class53.field835 > 0 && class292.field4537[82] && class292.field4537[81] && class8.field133 != 0) {
                                                int var60 = class130.field1941 - class8.field133;
                                                if (var60 < 0) {
                                                    var60 = 0;
                                                } else if (var60 > 3) {
                                                    var60 = 3;
                                                }
                                                class203.method1430(class159.field2379 + class263.field4168.field4673[0], (byte) -108, var60, class263.field4168.field4749[0] + class138.field2072);
                                            }
                                            if (class53.field835 > 0 && class292.field4537[82] && class292.field4537[81]) {
                                                if (class106.field1659 != -1) {
                                                    class203.method1430(class49.field810 + class159.field2379, (byte) 43, class130.field1941, class138.field2072 + class106.field1659);
                                                }
                                                class126.field1889 = 0;
                                                class55.field866 = 0;
                                            } else if (class55.field866 == 2) {
                                                if (class106.field1659 != -1) {
                                                    class240.field3826.method1762(118, true);
                                                    class240.field3826.method257(770601592, class84.field1258);
                                                    class240.field3826.method301(128, class305.field4894);
                                                    class30.field505++;
                                                    class240.field3826.method301(arg0 - 3120, class138.field2072 + class106.field1659);
                                                    class240.field3826.method301(128, class159.field2379 + class49.field810);
                                                    class26.field447 = class240.field3829;
                                                    class259.field4106 = 1;
                                                    class274.field4368 = 0;
                                                    class207.field3206 = class73.field1126;
                                                }
                                                class55.field866 = 0;
                                            } else if (class126.field1889 == 2) {
                                                if (class106.field1659 != -1) {
                                                    class236.field3726++;
                                                    class240.field3826.method1762(10, true);
                                                    class240.field3826.method264(-118, class159.field2379 + class49.field810);
                                                    class240.field3826.method301(128, class138.field2072 + class106.field1659);
                                                    class274.field4368 = 0;
                                                    class259.field4106 = 1;
                                                    class207.field3206 = class73.field1126;
                                                    class26.field447 = class240.field3829;
                                                }
                                                class126.field1889 = 0;
                                            } else if (class106.field1659 != -1 && class55.field866 == 0 && class126.field1889 == 0) {
                                                class33.method329(0, 0, (class49.field810 << 1) + 1 - class263.field4168.method1013(arg0 ^ 0xCB0) >> 1, (class106.field1659 << 1) + 1 - class263.field4168.method1013(0) >> 1);
                                                class26.field447 = class240.field3829;
                                                class207.field3206 = class73.field1126;
                                                class259.field4106 = 1;
                                                class274.field4368 = 0;
                                            }
                                            class106.field1659 = -1;
                                            class58.method484(120);
                                            if (class43.field729 != var49) {
                                                if (var49 != null) {
                                                    class80.method628((byte) -72, var49);
                                                }
                                                if (class43.field729 != null) {
                                                    class80.method628((byte) -107, class43.field729);
                                                }
                                            }
                                            if (class101.field1581 != var50 && class222.field3436 == class199.field3096) {
                                                if (var50 != null) {
                                                    class80.method628((byte) -109, var50);
                                                }
                                                if (class101.field1581 != null) {
                                                    class80.method628((byte) -91, class101.field1581);
                                                }
                                            }
                                            if (class101.field1581 == null) {
                                                if (class199.field3096 > 0) {
                                                    class199.field3096--;
                                                }
                                            } else if (class222.field3436 > class199.field3096) {
                                                class199.field3096++;
                                                if (class222.field3436 == class199.field3096) {
                                                    class80.method628((byte) -107, class101.field1581);
                                                }
                                            }
                                            for (int var61 = 0; var61 < 5; var61++) {
                                                int var10002 = class223.field3589[var61]++;
                                            }
                                            int var62 = class77.method606(0);
                                            int var63 = class239.method1635((byte) 70);
                                            if (var62 > 15000 && var63 > 15000) {
                                                class219.field3340 = 250;
                                                class150.field2225++;
                                                class203.method1432(14500, arg0 ^ 0xFFFFF340);
                                                class240.field3826.method1762(57, true);
                                            }
                                            if (class82.field1239 != null && class82.field1239.field2082 == 1) {
                                                if (class82.field1239.field2080 != null) {
                                                    class118.method865(arg0 - 3154, class58.field937, class290.field4514);
                                                }
                                                class290.field4514 = false;
                                                class82.field1239 = null;
                                                class58.field937 = null;
                                            }
                                            class63.field997++;
                                            class252.field4025++;
                                            class129.field1919++;
                                            if (class129.field1919 > 500) {
                                                class129.field1919 = 0;
                                                int var64 = (int) (Math.random() * 8.0D);
                                                if ((var64 & 0x4) == 4) {
                                                    class280.field4432 += class301.field4839;
                                                }
                                                if ((var64 & 0x1) == 1) {
                                                    class154.field2305 += class94.field1485;
                                                }
                                                if ((var64 & 0x2) == 2) {
                                                    class88.field1377 += class55.field867;
                                                }
                                            }
                                            if (class154.field2305 < -50) {
                                                class94.field1485 = 2;
                                            }
                                            if (class88.field1377 < -55) {
                                                class55.field867 = 2;
                                            }
                                            if (class154.field2305 > 50) {
                                                class94.field1485 = -2;
                                            }
                                            if (class252.field4025 > 500) {
                                                class252.field4025 = 0;
                                                int var65 = (int) (Math.random() * 8.0D);
                                                if ((var65 & 0x1) == 1) {
                                                    class67.field1057 += class300.field4822;
                                                }
                                                if ((var65 & 0x2) == 2) {
                                                    class285.field4487 += class134.field2011;
                                                }
                                            }
                                            if (class280.field4432 < -40) {
                                                class301.field4839 = 1;
                                            }
                                            if (class280.field4432 > 40) {
                                                class301.field4839 = -1;
                                            }
                                            if (class88.field1377 > 55) {
                                                class55.field867 = -2;
                                            }
                                            if (class285.field4487 < -20) {
                                                class134.field2011 = 1;
                                            }
                                            if (class285.field4487 > 10) {
                                                class134.field2011 = -1;
                                            }
                                            if (class67.field1057 < -60) {
                                                class300.field4822 = 2;
                                            }
                                            if (class67.field1057 > 60) {
                                                class300.field4822 = -2;
                                            }
                                            if (class63.field997 > 50) {
                                                class7.field109++;
                                                class240.field3826.method1762(188, true);
                                            }
                                            if (class69.field1097) {
                                                class6.method44((byte) 127);
                                                class69.field1097 = false;
                                            }
                                            try {
                                                if (class301.field4848 != null && class240.field3826.field541 > 0) {
                                                    class301.field4848.method1299(0, class240.field3826.field541, class240.field3826.field560, (byte) 127);
                                                    class63.field997 = 0;
                                                    class240.field3826.field541 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var66) {
                                                class28.method235(arg0 - 3248);
                                                return;
                                            }
                                        }
                                        var58 = var57.field453;
                                        if (var58.field3411 < 0) {
                                            break;
                                        }
                                        var59 = class169.method1217(var58.field3392, arg0 ^ 0x2324);
                                    } while (var59 == null || var59.field3526 == null || var58.field3411 >= var59.field3526.length || var59.field3526[var58.field3411] != var58);
                                    class15.method116(8, var57);
                                }
                            }
                            var55 = var54.field453;
                            if (var55.field3411 < 0) {
                                break;
                            }
                            var56 = class169.method1217(var55.field3392, 12180);
                        } while (var56 == null || var56.field3526 == null || var56.field3526.length <= var55.field3411 || var56.field3526[var55.field3411] != var55);
                        class15.method116(8, var54);
                    }
                }
                var52 = var51.field453;
                if (var52.field3411 < 0) {
                    break;
                }
                var53 = class169.method1217(var52.field3392, 12180);
            } while (var53 == null || var53.field3526 == null || var52.field3411 >= var53.field3526.length || var53.field3526[var52.field3411] != var52);
            class15.method116(arg0 - 3240, var51);
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
    public static final void method1106(int arg0) {
        field2253++;
        if (arg0 > -73) {
            method1105(-106);
        }
        class92.field1464.method1169(true);
        class84.field1257.method1169(true);
        class199.field3089.method1169(true);
        class156.field2326.method1169(true);
    }
}
