import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class129 extends class113 {

    @OriginalMember(owner = "client!od", name = "ab", descriptor = "Lcd;")
    public class23 field2695 = class166.field3307;

    @OriginalMember(owner = "client!od", name = "X", descriptor = "I")
    public int field2692 = 0;

    @OriginalMember(owner = "client!od", name = "H", descriptor = "[I")
    public static int[] field2677 = new int[128];

    @OriginalMember(owner = "client!od", name = "G", descriptor = "Lcd;")
    private static class23 field2676 = class54.method414("Service unavailable)3", -1);

    @OriginalMember(owner = "client!od", name = "T", descriptor = "Lcd;")
    public static class23 field2688 = class54.method414("mapdots", -1);

    @OriginalMember(owner = "client!od", name = "P", descriptor = "Lcd;")
    public static class23 field2684 = class54.method414("Ausw-=hlen", -1);

    @OriginalMember(owner = "client!od", name = "W", descriptor = "I")
    public static int field2691 = 0;

    @OriginalMember(owner = "client!od", name = "O", descriptor = "Lcd;")
    public static class23 field2683 = class54.method414("Der Server wird gerade aktualisiert)3", -1);

    @OriginalMember(owner = "client!od", name = "Z", descriptor = "Lcd;")
    public static class23 field2694 = class54.method414(")1j", -1);

    @OriginalMember(owner = "client!od", name = "cb", descriptor = "Lcd;")
    public static class23 field2697 = field2676;

    @OriginalMember(owner = "client!od", name = "S", descriptor = "Lcd;")
    public static class23 field2687 = class54.method414("welle:", -1);

    @OriginalMember(owner = "client!od", name = "D", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!od", name = "F", descriptor = "I")
    public int field2675;

    @OriginalMember(owner = "client!od", name = "M", descriptor = "I")
    public int field2681;

    @OriginalMember(owner = "client!od", name = "N", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!od", name = "Q", descriptor = "I")
    public int field2685;

    @OriginalMember(owner = "client!od", name = "R", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!od", name = "U", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!od", name = "V", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!od", name = "Y", descriptor = "Lsb;")
    public static class163 field2693;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "Lgd;")
    public static class58 field2673;

    @OriginalMember(owner = "client!od", name = "L", descriptor = "[I")
    public int[] field2680;

    @OriginalMember(owner = "client!od", name = "bb", descriptor = "[I")
    public int[] field2696;

    @OriginalMember(owner = "client!od", name = "K", descriptor = "[Lcd;")
    public class23[] field2679;

    @OriginalMember(owner = "client!od", name = "J", descriptor = "[Z")
    public static boolean[] field2678;

    @OriginalMember(owner = "client!od", name = "db", descriptor = "[[B")
    public static byte[][] field2698;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V")
    public static final void method831(byte arg0) {
        if (class86.field1844 > 1) {
            class86.field1844--;
        }
        field2682++;
        if (class80.field1749 > 0) {
            class80.field1749--;
        }
        if (class189.field3721) {
            class189.field3721 = false;
            class117.method737(-21734);
            return;
        }
        for (int var1 = 0; var1 < 100 && class135.method861(arg0 + 191); var1++) {
        }
        if (class52.field1239 != 30) {
            return;
        }
        class70.method505(-101, class159.field3190, 187);
        Object var2 = class15.field337.field3978;
        synchronized (class15.field337.field3978) {
            if (!class1.field1) {
                class15.field337.field3982 = 0;
            } else if (class43.field911 != 0 || class15.field337.field3982 >= 40) {
                class103.field2197++;
                class159.field3190.method631(201, -1);
                int var3 = 0;
                class159.field3190.method1180(0, (byte) 72);
                int var4 = class159.field3190.field3752;
                for (int var5 = 0; var5 < class15.field337.field3982 && class159.field3190.field3752 - var4 < 240; var5++) {
                    int var6 = class15.field337.field3980[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 502) {
                        var6 = 502;
                    }
                    var3++;
                    int var7 = class15.field337.field3981[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    int var8 = var6 * 765 + var7;
                    if (class15.field337.field3980[var5] == -1 && class15.field337.field3981[var5] == -1) {
                        var6 = -1;
                        var8 = 524287;
                        var7 = -1;
                    }
                    if (class151.field3019 != var7 || class204.field4022 != var6) {
                        int var9 = var7 - class151.field3019;
                        int var10 = var6 - class204.field4022;
                        class151.field3019 = var7;
                        class204.field4022 = var6;
                        if (class39.field795 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class159.field3190.method1220((byte) 77, (var9 << 6) + (class39.field795 << 12) + var10);
                            class39.field795 = 0;
                        } else if (class39.field795 < 8) {
                            class159.field3190.method1219((class39.field795 << 19) + var8 + 8388608, false);
                            class39.field795 = 0;
                        } else {
                            class159.field3190.method1186((class39.field795 << 19) + var8 - 1073741824, -12);
                            class39.field795 = 0;
                        }
                    } else if (class39.field795 < 2047) {
                        class39.field795++;
                    }
                }
                class159.field3190.method1206(class159.field3190.field3752 - var4, -4375);
                if (class15.field337.field3982 > var3) {
                    class15.field337.field3982 -= var3;
                    for (int var11 = 0; var11 < class15.field337.field3982; var11++) {
                        class15.field337.field3981[var11] = class15.field337.field3981[var3 + var11];
                        class15.field337.field3980[var11] = class15.field337.field3980[var3 + var11];
                    }
                } else {
                    class15.field337.field3982 = 0;
                }
            }
        }
        if (class43.field911 != 0) {
            long var12 = (class145.field2954 - class36.field736) / 50L;
            if (var12 > 4095L) {
                var12 = 4095L;
            }
            class36.field736 = class145.field2954;
            class169.field3371++;
            int var14 = class43.field912;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 502) {
                var14 = 502;
            }
            int var15 = class65.field1535;
            byte var16 = 0;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 764) {
                var15 = 764;
            }
            if (class43.field911 == 2) {
                var16 = 1;
            }
            int var17 = var14 * 765 + var15;
            class159.field3190.method631(148, arg0 ^ 0x42);
            int var18 = (int) var12;
            class159.field3190.method1211((var16 << 19) + ((var18 << 20) + var17), 127);
        }
        if (class25.field549 > 0) {
            class25.field549--;
        }
        if (class110.field2340[96] || class110.field2340[97] || class110.field2340[98] || class110.field2340[99]) {
            class47.field1083 = true;
        }
        if (class47.field1083 && class25.field549 <= 0) {
            class25.field549 = 20;
            client.field588++;
            class47.field1083 = false;
            class159.field3190.method631(199, -1);
            class159.field3190.method1220((byte) 99, class48.field1155);
            class159.field3190.method1221(true, class13.field297);
        }
        if (class65.field1540 && !class104.field2219) {
            class104.field2219 = true;
            class31.field675++;
            class159.field3190.method631(244, -1);
            class159.field3190.method1180(1, (byte) 114);
        }
        if (!class65.field1540 && class104.field2219) {
            class104.field2219 = false;
            class159.field3190.method631(244, -1);
            class159.field3190.method1180(0, (byte) 53);
            class31.field675++;
        }
        if (arg0 != -67) {
            return;
        }
        class40.method328((byte) -77);
        if (class52.field1239 != 30) {
            return;
        }
        class7.method40(55);
        class98.method663((byte) 54);
        class200.field3964++;
        if (class200.field3964 > 750) {
            class117.method737(-21734);
            return;
        }
        class73.method523((byte) 125);
        class95.method623(false);
        class86.method571((byte) 100);
        if (class57.field1330 != 0) {
            class100.field2112 += 20;
            if (class100.field2112 >= 400) {
                class57.field1330 = 0;
            }
        }
        class138.field2850++;
        if (class91.field1949 != null) {
            class172.field3421++;
            if (class172.field3421 >= 15) {
                class3.method12(class91.field1949, false);
                class91.field1949 = null;
            }
        }
        if (class191.field3795 != null) {
            class3.method12(class191.field3795, false);
            if (class78.field1724 > class13.field298 + 5 || class13.field298 - 5 > class78.field1724 || class91.field1947 + 5 < class64.field1518 || class64.field1518 < class91.field1947 - 5) {
                class116.field2418 = true;
            }
            class168.field3365++;
            if (class105.field2277 == 0) {
                if (class116.field2418 && class168.field3365 >= 5) {
                    if (class30.field647 == class191.field3795 && class62.field1434 != class20.field418) {
                        class47 var19 = class191.field3795;
                        class179.field3555++;
                        byte var20 = 0;
                        if (class190.field3783 == 1 && var19.field1124 == 206) {
                            var20 = 1;
                        }
                        if (var19.field1136[class62.field1434] <= 0) {
                            var20 = 0;
                        }
                        if (method832(class141.method909(var19, arg0 - 56), 834376925)) {
                            int var23 = class20.field418;
                            int var24 = class62.field1434;
                            var19.field1136[var24] = var19.field1136[var23];
                            var19.field1024[var24] = var19.field1024[var23];
                            var19.field1136[var23] = -1;
                            var19.field1024[var23] = 0;
                        } else if (var20 == 1) {
                            int var21 = class20.field418;
                            int var22 = class62.field1434;
                            while (var21 != var22) {
                                if (var21 > var22) {
                                    var19.method367(var21 - 1, var21, true);
                                    var21--;
                                } else if (var21 < var22) {
                                    var19.method367(var21 + 1, var21, true);
                                    var21++;
                                }
                            }
                        } else {
                            var19.method367(class62.field1434, class20.field418, true);
                        }
                        class159.field3190.method631(151, -1);
                        class159.field3190.method1215((byte) -122, class62.field1434);
                        class159.field3190.method1220((byte) 86, class20.field418);
                        class159.field3190.method1225(var20, false);
                        class159.field3190.method1194(class191.field3795.field1071, (byte) 127);
                    }
                } else if ((class146.field2988 == 1 || class157.method966((byte) 66, class49.field1171 - 1)) && class49.field1171 > 2) {
                    class8.method45(false);
                } else if (class49.field1171 > 0) {
                    class41.method334(59, class49.field1171 - 1);
                }
                class43.field911 = 0;
                class191.field3795 = null;
                class172.field3421 = 10;
            }
        }
        class63.field1481 = null;
        class146.field2975 = false;
        class160.field3218 = false;
        class47 var25 = class200.field3966;
        class200.field3966 = null;
        class73.field1664 = 0;
        class47 var26 = class62.field1442;
        class62.field1442 = null;
        while (class81.method552((byte) 53) && class73.field1664 < 128) {
            class61.field1407[class73.field1664] = class67.field1581;
            class194.field3842[class73.field1664] = class168.field3351;
            class73.field1664++;
        }
        class119.method744(765, 0, 0, class119.field2450, 0, false, 0, 503);
        class13.field296++;
        while (true) {
            class144 var27;
            class47 var28;
            class47 var29;
            do {
                var27 = (class144) class62.field1436.method189((byte) -99);
                if (var27 == null) {
                    while (true) {
                        class144 var30;
                        class47 var31;
                        class47 var32;
                        do {
                            var30 = (class144) class135.field2799.method189((byte) -99);
                            if (var30 == null) {
                                while (true) {
                                    class144 var33;
                                    class47 var34;
                                    class47 var35;
                                    do {
                                        var33 = (class144) class22.field452.method189((byte) -99);
                                        if (var33 == null) {
                                            if (class17.field361 != null) {
                                                class74.method529(true);
                                            }
                                            if (class127.field2600 != -1) {
                                                int var36 = class127.field2608;
                                                int var37 = class127.field2600;
                                                boolean var38 = class186.method1147(0, (byte) -51, true, 0, class134.field2790.field219[0], 0, var37, 0, 0, 0, var36, class134.field2790.field230[0]);
                                                if (var38) {
                                                    class100.field2112 = 0;
                                                    class180.field3569 = class65.field1535;
                                                    class154.field3088 = class43.field912;
                                                    class57.field1330 = 1;
                                                }
                                                class127.field2600 = -1;
                                            }
                                            class25.method191(64);
                                            if (class62.field1442 != var26) {
                                                if (var26 != null) {
                                                    class3.method12(var26, false);
                                                }
                                                if (class62.field1442 != null) {
                                                    class3.method12(class62.field1442, false);
                                                }
                                            }
                                            if (class200.field3966 != var25 && class179.field3557 == class128.field2658) {
                                                if (var25 != null) {
                                                    class3.method12(var25, false);
                                                }
                                                if (class200.field3966 != null) {
                                                    class3.method12(class200.field3966, false);
                                                }
                                            }
                                            if (class200.field3966 == null) {
                                                if (class179.field3557 > 0) {
                                                    class179.field3557--;
                                                }
                                            } else if (class179.field3557 < class128.field2658) {
                                                class179.field3557++;
                                                if (class179.field3557 == class128.field2658) {
                                                    class3.method12(class200.field3966, false);
                                                }
                                            }
                                            class176.method1106(arg0 - 44);
                                            if (class181.field3575) {
                                                class121.method751(2047);
                                            }
                                            for (int var39 = 0; var39 < 5; var39++) {
                                                int var10002 = class132.field2724[var39]++;
                                            }
                                            int var40 = class134.method859(-67);
                                            int var41 = class53.method412((byte) -37);
                                            if (var40 > 4500 && var41 > 4500) {
                                                class80.field1749 = 250;
                                                class30.field649++;
                                                class35.method251(4000, (byte) -45);
                                                class159.field3190.method631(177, arg0 ^ 0x42);
                                            }
                                            class104.field2242++;
                                            class80.field1737++;
                                            if (class80.field1737 > 500) {
                                                int var42 = (int) (Math.random() * 8.0D);
                                                class80.field1737 = 0;
                                                if ((var42 & 0x4) == 4) {
                                                    class69.field1619 += class51.field1227;
                                                }
                                                if ((var42 & 0x2) == 2) {
                                                    class180.field3561 += class57.field1329;
                                                }
                                                if ((var42 & 0x1) == 1) {
                                                    class27.field568 += class29.field627;
                                                }
                                            }
                                            if (class69.field1619 < -40) {
                                                class51.field1227 = 1;
                                            }
                                            if (class180.field3561 < -55) {
                                                class57.field1329 = 2;
                                            }
                                            if (class69.field1619 > 40) {
                                                class51.field1227 = -1;
                                            }
                                            if (class180.field3561 > 55) {
                                                class57.field1329 = -2;
                                            }
                                            if (class27.field568 < -50) {
                                                class29.field627 = 2;
                                            }
                                            if (class27.field568 > 50) {
                                                class29.field627 = -2;
                                            }
                                            client.field571++;
                                            if (client.field571 > 500) {
                                                client.field571 = 0;
                                                int var43 = (int) (Math.random() * 8.0D);
                                                if ((var43 & 0x2) == 2) {
                                                    class107.field2292 += class52.field1243;
                                                }
                                                if ((var43 & 0x1) == 1) {
                                                    class67.field1580 += class102.field2186;
                                                }
                                            }
                                            if (class67.field1580 < -60) {
                                                class102.field2186 = 2;
                                            }
                                            if (class67.field1580 > 60) {
                                                class102.field2186 = -2;
                                            }
                                            if (class107.field2292 < -20) {
                                                class52.field1243 = 1;
                                            }
                                            if (class107.field2292 > 10) {
                                                class52.field1243 = -1;
                                            }
                                            if (class104.field2242 > 50) {
                                                class159.field3190.method631(120, -1);
                                                class14.field322++;
                                            }
                                            try {
                                                if (class109.field2310 != null && class159.field3190.field3752 > 0) {
                                                    class109.field2310.method495(class159.field3190.field3752, class159.field3190.field3753, (byte) 58, 0);
                                                    class159.field3190.field3752 = 0;
                                                    class104.field2242 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var44) {
                                                class117.method737(-21734);
                                                return;
                                            }
                                        }
                                        var34 = var33.field2939;
                                        if (var34.field1070 < 0) {
                                            break;
                                        }
                                        var35 = class113.method725((byte) 121, var34.field1051);
                                    } while (var35 == null || var35.field1029 == null || var34.field1070 >= var35.field1029.length || var35.field1029[var34.field1070] != var34);
                                    class50.method391(-1142686098, var33);
                                }
                            }
                            var31 = var30.field2939;
                            if (var31.field1070 < 0) {
                                break;
                            }
                            var32 = class113.method725((byte) 99, var31.field1051);
                        } while (var32 == null || var32.field1029 == null || var32.field1029.length <= var31.field1070 || var32.field1029[var31.field1070] != var31);
                        class50.method391(-1142686098, var30);
                    }
                }
                var28 = var27.field2939;
                if (var28.field1070 < 0) {
                    break;
                }
                var29 = class113.method725((byte) 91, var28.field1051);
            } while (var29 == null || var29.field1029 == null || var28.field1070 >= var29.field1029.length || var29.field1029[var28.field1070] != var28);
            class50.method391(arg0 - 1142686031, var27);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Z")
    public static final boolean method832(int arg0, int arg1) {
        field2686++;
        if (arg1 == 834376925) {
            return (arg0 >> 29 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IILva;)V")
    private final void method833(int arg0, int arg1, class189 arg2) {
        if (arg1 == 1) {
            this.field2681 = arg2.method1202(-43);
        } else if (arg1 == 2) {
            this.field2685 = arg2.method1202(-116);
        } else if (arg1 == 3) {
            this.field2695 = arg2.method1193((byte) -70);
        } else if (arg1 == 4) {
            this.field2675 = arg2.method1190(-4);
        } else if (arg1 == 5) {
            this.field2692 = arg2.method1197(-1);
            this.field2679 = new class23[this.field2692];
            this.field2696 = new int[this.field2692];
            for (int var5 = 0; var5 < this.field2692; var5++) {
                this.field2696[var5] = arg2.method1190(-4);
                this.field2679[var5] = arg2.method1193((byte) -70);
            }
        } else if (arg1 == 6) {
            this.field2692 = arg2.method1197(-1);
            this.field2696 = new int[this.field2692];
            this.field2680 = new int[this.field2692];
            for (int var4 = 0; var4 < this.field2692; var4++) {
                this.field2696[var4] = arg2.method1190(-4);
                this.field2680[var4] = arg2.method1190(-4);
            }
        }
        if (arg0 >= -66) {
            method835((byte) 80);
        }
        field2689++;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lva;I)V")
    public final void method834(class189 arg0, int arg1) {
        field2690++;
        while (true) {
            int var3 = arg0.method1202(118);
            if (var3 == 0) {
                if (arg1 == 5715) {
                    return;
                } else {
                    method832(32, -64);
                    return;
                }
            }
            this.method833(-77, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(B)V")
    public static void method835(byte arg0) {
        field2693 = null;
        field2677 = null;
        field2678 = null;
        field2694 = null;
        field2676 = null;
        field2673 = null;
        field2697 = null;
        field2688 = null;
        field2683 = null;
        if (arg0 != 9) {
            method835((byte) 106);
        }
        field2687 = null;
        field2698 = null;
        field2684 = null;
    }
}
