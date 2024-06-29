import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class90 extends class42 {

    @OriginalMember(owner = "client!p", name = "fb", descriptor = "[B")
    public byte[] field2115;

    @OriginalMember(owner = "client!p", name = "db", descriptor = "Lad;")
    public static class5 field2113 = class88.method674("leuchten1:", -89);

    @OriginalMember(owner = "client!p", name = "mb", descriptor = "Lad;")
    public static class5 field2122 = class88.method674("Fps:", 51);

    @OriginalMember(owner = "client!p", name = "nb", descriptor = "Lad;")
    private static class5 field2123 = class88.method674("red:", 122);

    @OriginalMember(owner = "client!p", name = "pb", descriptor = "Lad;")
    public static class5 field2125 = class88.method674("compass", -104);

    @OriginalMember(owner = "client!p", name = "kb", descriptor = "Lrc;")
    public static class105 field2120 = null;

    @OriginalMember(owner = "client!p", name = "qb", descriptor = "I")
    public static int field2126 = 0;

    @OriginalMember(owner = "client!p", name = "ob", descriptor = "I")
    public static int field2124 = -1;

    @OriginalMember(owner = "client!p", name = "jb", descriptor = "Lad;")
    public static class5 field2119 = field2123;

    @OriginalMember(owner = "client!p", name = "cb", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!p", name = "eb", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!p", name = "gb", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!p", name = "hb", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!p", name = "lb", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!p", name = "ib", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field2118;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(B)V", line = 5)
    public static final void method685(byte arg0) {
        class96.field2299 = 0;
        field2117++;
        for (int var1 = -1; var1 < class33.field790 + class12.field348; var1++) {
            class3 var18;
            if (var1 == -1) {
                var18 = class82.field1932;
            } else if (class12.field348 <= var1) {
                var18 = class103.field2504[class25.field611[var1 - class12.field348]];
            } else {
                var18 = class7.field251[class105.field2577[var1]];
            }
            if (var18 != null && var18.method23((byte) -90)) {
                if (var18 instanceof class61) {
                    class118 var19 = ((class61) var18).field1498;
                    if (var19.field2895 != null) {
                        var19 = var19.method933(11840);
                    }
                    if (var19 == null) {
                        continue;
                    }
                }
                if (var1 >= class12.field348) {
                    class118 var22 = ((class61) var18).field1498;
                    if (var22.field2889 >= 0 && var22.field2889 < class87.field2013.length) {
                        class36.method277(var18, true, var18.field56 + 15);
                        if (class91.field2178 > -1) {
                            class87.field2013[var22.field2889].method964(class91.field2178 - 12, class95.field2241 + -30);
                        }
                    }
                    if (class95.field2242 == 1 && class25.field611[var1 - class12.field348] == class23.field576 && class69.field1636 % 20 < 10) {
                        class36.method277(var18, true, var18.field56 + 15);
                        if (class91.field2178 > -1) {
                            class39.field959[0].method964(class91.field2178 - 12, class95.field2241 + -28);
                        }
                    }
                } else {
                    int var20 = 30;
                    class112 var21 = (class112) var18;
                    if (var21.field2805 != -1 || var21.field2811 != -1) {
                        class36.method277(var18, true, var18.field56 + 15);
                        if (class91.field2178 > -1) {
                            if (var21.field2805 != -1) {
                                class77.field1812[var21.field2805].method964(class91.field2178 - 12, class95.field2241 - var20);
                                var20 += 25;
                            }
                            if (var21.field2811 != -1) {
                                class87.field2013[var21.field2811].method964(class91.field2178 - 12, -var20 + class95.field2241);
                                var20 += 25;
                            }
                        }
                    }
                    if (var1 >= 0 && class95.field2242 == 10 && class105.field2577[var1] == class40.field1021) {
                        class36.method277(var18, true, var18.field56 + 15);
                        if (class91.field2178 > -1) {
                            class39.field959[1].method964(class91.field2178 - 12, -var20 + class95.field2241);
                        }
                    }
                }
                if (var18.field55 != null && (class12.field348 <= var1 || class65.field1567 == 0 || class65.field1567 == 3 || class65.field1567 == 1 && class133.method1028(((class112) var18).field2801, 0))) {
                    class36.method277(var18, true, var18.field56);
                    if (class91.field2178 > -1 && class100.field2440 > class96.field2299) {
                        class100.field2435[class96.field2299] = class135.field3263.method1007(var18.field55) / 2;
                        class100.field2436[class96.field2299] = class135.field3263.field3156;
                        class100.field2419[class96.field2299] = class91.field2178;
                        class100.field2426[class96.field2299] = class95.field2241;
                        class100.field2433[class96.field2299] = var18.field111;
                        class100.field2420[class96.field2299] = var18.field52;
                        class100.field2425[class96.field2299] = var18.field98;
                        class100.field2423[class96.field2299] = var18.field55;
                        class96.field2299++;
                    }
                }
                if (var18.field95 > class69.field1636) {
                    class36.method277(var18, true, var18.field56 + 15);
                    if (class91.field2178 > -1) {
                        int var23 = var18.field116 * 30 / var18.field50;
                        if (var23 > 30) {
                            var23 = 30;
                        }
                        class55.method443(class91.field2178 - 15, class95.field2241 + -3, var23, 5, 65280);
                        class55.method443(class91.field2178 + var23 - 15, class95.field2241 - 3, 30 - var23, 5, 16711680);
                    }
                }
                for (int var24 = 0; var24 < 4; var24++) {
                    if (class69.field1636 < var18.field104[var24]) {
                        class36.method277(var18, true, var18.field56 / 2);
                        if (class91.field2178 > -1) {
                            if (var24 == 1) {
                                class95.field2241 -= 20;
                            }
                            if (var24 == 2) {
                                class95.field2241 -= 10;
                                class91.field2178 -= 15;
                            }
                            if (var24 == 3) {
                                class91.field2178 += 15;
                                class95.field2241 -= 10;
                            }
                            class91.field2130[var18.field60[var24]].method964(class91.field2178 - 12, class95.field2241 + -12);
                            class49.field1263.method1017(class106.method864(18413, var18.field105[var24]), class91.field2178, class95.field2241 + 4, 0);
                            class49.field1263.method1017(class106.method864(18413, var18.field105[var24]), class91.field2178 - 1, class95.field2241 + 3, 16777215);
                        }
                    }
                }
            }
        }
        for (int var2 = 0; var2 < class96.field2299; var2++) {
            int var3 = class100.field2419[var2];
            int var4 = class100.field2426[var2];
            boolean var5 = true;
            int var6 = class100.field2436[var2];
            int var7 = class100.field2435[var2];
            while (var5) {
                var5 = false;
                for (int var17 = 0; var17 < var2; var17++) {
                    if (class100.field2426[var17] - class100.field2436[var17] < var4 - -2 && var4 - var6 < class100.field2426[var17] - -2 && var3 - var7 < class100.field2435[var17] + class100.field2419[var17] && var3 + var7 > class100.field2419[var17] + -class100.field2435[var17] && class100.field2426[var17] - class100.field2436[var17] < var4) {
                        var5 = true;
                        var4 = class100.field2426[var17] - class100.field2436[var17];
                    }
                }
            }
            class91.field2178 = class100.field2419[var2];
            class95.field2241 = class100.field2426[var2] = var4;
            class5 var8 = class100.field2423[var2];
            if (class112.field2816 == 0) {
                int var9 = 16776960;
                if (class100.field2433[var2] < 6) {
                    var9 = class86.field1988[class100.field2433[var2]];
                }
                if (class100.field2433[var2] == 6) {
                    var9 = class34.field860 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class100.field2433[var2] == 7) {
                    var9 = class34.field860 % 20 < 10 ? 255 : 65535;
                }
                if (class100.field2433[var2] == 8) {
                    var9 = class34.field860 % 20 < 10 ? 45056 : 8454016;
                }
                if (class100.field2433[var2] == 9) {
                    int var10 = 150 - class100.field2425[var2];
                    if (var10 < 50) {
                        var9 = var10 * 1280 + 16711680;
                    } else if (var10 < 100) {
                        var9 = 16776960 - (var10 - 50) * 327680;
                    } else if (var10 < 150) {
                        var9 = (var10 - 100) * 5 + 65280;
                    }
                }
                if (class100.field2433[var2] == 10) {
                    int var11 = 150 - class100.field2425[var2];
                    if (var11 < 50) {
                        var9 = var11 * 5 + 16711680;
                    } else if (var11 < 100) {
                        var9 = 16384000 + 16711935 - var11 * 327680;
                    } else if (var11 < 150) {
                        var9 = (var11 - 100) * 327680 + 255 - (var11 - 100) * 5;
                    }
                }
                if (class100.field2433[var2] == 11) {
                    int var12 = 150 - class100.field2425[var2];
                    if (var12 < 50) {
                        var9 = 16777215 - var12 * 327685;
                    } else if (var12 < 100) {
                        var9 = var12 * 327685 + 65280 - 16384250;
                    } else if (var12 < 150) {
                        var9 = 16777215 - (var12 - 100) * 327680;
                    }
                }
                if (class100.field2420[var2] == 0) {
                    class135.field3263.method1017(var8, class91.field2178, class95.field2241 + 1, 0);
                    class135.field3263.method1017(var8, class91.field2178, class95.field2241, var9);
                }
                if (class100.field2420[var2] == 1) {
                    class135.field3263.method1002(var8, class91.field2178, class95.field2241 + 1, 0, class34.field860);
                    class135.field3263.method1002(var8, class91.field2178, class95.field2241, var9, class34.field860);
                }
                if (class100.field2420[var2] == 2) {
                    class135.field3263.method1001(var8, class91.field2178, class95.field2241 + 1, 0, class34.field860);
                    class135.field3263.method1001(var8, class91.field2178, class95.field2241, var9, class34.field860);
                }
                if (class100.field2420[var2] == 3) {
                    class135.field3263.method1013(var8, class91.field2178, class95.field2241 + 1, 0, class34.field860, 150 - class100.field2425[var2]);
                    class135.field3263.method1013(var8, class91.field2178, class95.field2241, var9, class34.field860, 150 - class100.field2425[var2]);
                }
                if (class100.field2420[var2] == 4) {
                    int var13 = class135.field3263.method1007(var8);
                    int var14 = (var13 + 100) * (-class100.field2425[var2] + 150) / 150;
                    class55.method454(class91.field2178 - 50, 0, class91.field2178 + 50, 334);
                    class135.field3263.method1014(var8, class91.field2178 + 50 - var14, class95.field2241 + 1, 0);
                    class135.field3263.method1014(var8, class91.field2178 + 50 - var14, class95.field2241, var9);
                    class55.method450();
                }
                if (class100.field2420[var2] == 5) {
                    int var15 = 150 - class100.field2425[var2];
                    class55.method454(0, class95.field2241 - class135.field3263.field3156 - 1, 512, class95.field2241 + 5);
                    int var16 = 0;
                    if (var15 < 25) {
                        var16 = var15 - 25;
                    } else if (var15 > 125) {
                        var16 = var15 - 125;
                    }
                    class135.field3263.method1017(var8, class91.field2178, class95.field2241 + var16 + 1, 0);
                    class135.field3263.method1017(var8, class91.field2178, class95.field2241 + var16, var9);
                    class55.method450();
                }
            } else {
                class135.field3263.method1017(var8, class91.field2178, class95.field2241 + 1, 0);
                class135.field3263.method1017(var8, class91.field2178, class95.field2241, 16776960);
            }
        }
        if (arg0 > -20) {
            field2114 = 75;
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "([B)V", line = 409)
    public class90(byte[] arg0) {
        this.field2115 = arg0;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)V", line = 423)
    public static final void method686(int arg0, int arg1, int arg2, int arg3) {
        field2116++;
        if (arg3 < 128 || arg0 < 128 || arg3 > 13056 || arg0 > 13056) {
            class91.field2178 = -1;
            class95.field2241 = -1;
            return;
        }
        int var4 = class95.method730(arg1 ^ 0x5003C, arg3, class54.field1344, arg0) - arg2;
        int var5 = var4 - class70.field1686;
        int var6 = class45.field1176[class128.field3079];
        int var7 = arg3 - class135.field3255;
        int var8 = arg0 - class9.field308;
        int var9 = class45.field1166[class128.field3079];
        int var10 = class45.field1176[class52.field1318];
        if (arg1 != 327680) {
            method685((byte) 35);
        }
        int var11 = class45.field1166[class52.field1318];
        int var12 = var7 * var11 + var8 * var10 >> 16;
        int var13 = var8 * var11 - var7 * var10 >> 16;
        int var15 = var5 * var9 - var6 * var13 >> 16;
        int var16 = var5 * var6 + var9 * var13 >> 16;
        if (var16 >= 50) {
            class95.field2241 = (var15 << 9) / var16 + 167;
            class91.field2178 = (var12 << 9) / var16 + 256;
        } else {
            class91.field2178 = -1;
            class95.field2241 = -1;
        }
    }

    @OriginalMember(owner = "client!p", name = "f", descriptor = "(I)V", line = 472)
    public static void method687(int arg0) {
        field2120 = null;
        field2123 = null;
        field2125 = null;
        field2122 = null;
        if (arg0 == -8) {
            field2118 = null;
            field2119 = null;
            field2113 = null;
        }
    }
}
