import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class81 extends class17 {

    @OriginalMember(owner = "client!n", name = "z", descriptor = "I")
    public static int field2144 = 0;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "Lke;")
    public static class65 field2143 = class1.method17("k", -118);

    @OriginalMember(owner = "client!n", name = "E", descriptor = "Lke;")
    public static class65 field2149 = class1.method17("Spieler kann nicht gefunden werden: ", -118);

    @OriginalMember(owner = "client!n", name = "J", descriptor = "[Lrb;")
    public static class103[] field2154 = new class103[50];

    @OriginalMember(owner = "client!n", name = "S", descriptor = "Lke;")
    private static class65 field2163 = class1.method17("To play on this world move to a free area first", -112);

    @OriginalMember(owner = "client!n", name = "P", descriptor = "Lke;")
    public static class65 field2160 = field2163;

    @OriginalMember(owner = "client!n", name = "R", descriptor = "Lke;")
    public static class65 field2162 = class1.method17("da dieser Computer gegen unsere ", -120);

    @OriginalMember(owner = "client!n", name = "x", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!n", name = "B", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!n", name = "D", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!n", name = "F", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!n", name = "H", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!n", name = "I", descriptor = "I")
    public int field2153;

    @OriginalMember(owner = "client!n", name = "K", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!n", name = "L", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!n", name = "M", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!n", name = "N", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!n", name = "O", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!n", name = "Q", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "Lta;")
    public class112 field2145;

    @OriginalMember(owner = "client!n", name = "G", descriptor = "Lld;")
    public class70 field2151;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "Z")
    public static boolean field2141;

    @OriginalMember(owner = "client!n", name = "T", descriptor = "[B")
    public byte[] field2164;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V", line = 8)
    public static final void method704(int arg0) {
        if (arg0 != 5) {
            field2160 = null;
        }
        class80.field2125 = null;
        class126.field3056 = null;
        field2152++;
        class88.field2346 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BLec;)Z", line = 23)
    public static final boolean method705(byte arg0, class27 arg1) {
        if (arg0 != -107) {
            method708((byte) -13, null, -96);
        }
        int var2 = arg1.field705;
        field2147++;
        if (class19.field413 == 2) {
            if (var2 == 201) {
                class100.field2603 = class93.field2447;
                class100.field2615 = class100.field2591;
                class56.field1455 = 1;
                class116.field2916 = 0;
                class39.field996 = true;
                class10.field218 = true;
            }
            if (var2 == 202) {
                class56.field1455 = 2;
                class10.field218 = true;
                class39.field996 = true;
                class100.field2615 = class100.field2591;
                class100.field2603 = class91.field2413;
                class116.field2916 = 0;
            }
        }
        if (var2 == 205) {
            class21.field512 = 250;
            return true;
        }
        if (var2 == 501) {
            class100.field2615 = class100.field2591;
            class100.field2603 = class98.field2526;
            class10.field218 = true;
            class56.field1455 = 4;
            class116.field2916 = 0;
            class39.field996 = true;
        }
        if (var2 == 502) {
            class10.field218 = true;
            class39.field996 = true;
            class56.field1455 = 5;
            class100.field2603 = class92.field2437;
            class100.field2615 = class100.field2591;
            class116.field2916 = 0;
        }
        if (var2 >= 300 && var2 <= 313) {
            int var3 = (var2 - 300) / 2;
            int var4 = var2 & 0x1;
            class32.field837.method442(var3, var4 == 1, false);
        }
        if (var2 >= 314 && var2 <= 323) {
            int var5 = (var2 - 314) / 2;
            int var6 = var2 & 0x1;
            class32.field837.method440(0, var5, var6 == 1);
        }
        if (var2 == 324) {
            class32.field837.method439(false, (byte) 95);
        }
        if (var2 == 325) {
            class32.field837.method439(true, (byte) 42);
        }
        if (var2 == 326) {
            class56.field1453.method642(173, false);
            class32.field837.method433(class56.field1453, false);
            class53.field1363++;
            return true;
        }
        if (var2 == 620) {
            class78.field2088 = !class78.field2088;
        }
        if (var2 >= 601 && var2 <= 613) {
            class13.method79((byte) -90);
            if (class100.field2599.method528(70) > 0) {
                class56.field1453.method642(168, false);
                class56.field1453.method323(class100.field2599.method530((byte) 106), -96);
                class123.field2989++;
                class56.field1453.method305(false, var2 - 601);
                class56.field1453.method305(false, class78.field2088 ? 1 : 0);
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BIILjd;)Luc;", line = 163)
    public static final class119 method706(byte arg0, int arg1, int arg2, class58 arg3) {
        field2150++;
        if (class97.method811(4, arg2, arg3, arg1)) {
            if (arg0 > -49) {
                field2160 = null;
            }
            return class23.method182((byte) -84);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(B)Z", line = 178)
    public static final boolean method707(byte arg0) {
        if (arg0 != 94) {
            field2160 = null;
        }
        field2161++;
        return class93.field2464 != null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BLec;I)I", line = 199)
    public static final int method708(byte arg0, class27 arg1, int arg2) {
        field2155++;
        if (arg0 != -122) {
            method704(-5);
        }
        if (arg1.field717 == null || arg2 >= arg1.field717.length) {
            return -2;
        }
        try {
            int[] var3 = arg1.field717[arg2];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var5++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 1) {
                    var8 = class53.field1346[var3[var5++]];
                }
                if (var7 == 2) {
                    var8 = class21.field514[var3[var5++]];
                }
                if (var7 == 3) {
                    var8 = class130.field3163[var3[var5++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class27 var12 = class110.method903(var11, arg0);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!method715(false, var13).field1506 || class26.field640)) {
                        for (int var14 = 0; var14 < var12.field676.length; var14++) {
                            if (var13 + 1 == var12.field676[var14]) {
                                var8 += var12.field700[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class32.field843[var3[var5++]];
                }
                if (var7 == 6) {
                    var8 = class101.field2630[class21.field514[var3[var5++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class32.field843[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class32.field833.field2856;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class130.field3162[var15]) {
                            var8 += class21.field514[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class27 var18 = class110.method903(var17, -89);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!method715(false, var19).field1506 || class26.field640)) {
                        for (int var20 = 0; var20 < var18.field676.length; var20++) {
                            if (var19 + 1 == var18.field676[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class57.field1540;
                }
                if (var7 == 12) {
                    var8 = class3.field59;
                }
                if (var7 == 13) {
                    int var21 = class32.field843[var3[var5++]];
                    int var22 = var3[var5++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var8 = class111.method906(var23, true);
                }
                if (var7 == 18) {
                    var8 = (class32.field833.field1067 >> 7) + class20.field494;
                }
                if (var7 == 19) {
                    var8 = (class32.field833.field1070 >> 7) + class86.field2295;
                }
                if (var7 == 20) {
                    var8 = var3[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var4 += var8;
                    }
                    if (var6 == 1) {
                        var4 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var4 /= var8;
                    }
                    if (var6 == 3) {
                        var4 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIILtc;)V", line = 401)
    public static final void method709(int arg0, int arg1, int arg2, int arg3, class114 arg4) {
        field2158++;
        if (class32.field833 == arg4 || class125.field3040 >= 400) {
            return;
        }
        class65 var5;
        if (arg4.field2879 == 0) {
            var5 = class21.method172(-102, new class65[] { arg4.field2866, class54.method432(class32.field833.field2856, arg4.field2856, -1), class20.field490, class51.field1306, class39.method320(arg4.field2856, (byte) -36), class44.field1170 });
        } else {
            var5 = class21.method172(-41, new class65[] { arg4.field2866, class20.field490, class121.field2970, class39.method320(arg4.field2879, (byte) -36), class44.field1170 });
        }
        if (client.field382 == 1) {
            class97.method812(arg1, class88.field2351, -124, class21.method172(-55, new class65[] { class101.field2634, class121.field2987, var5 }), 45, arg2, arg3);
            class89.field2370++;
        } else if (class101.field2635 != 1) {
            for (int var6 = 4; var6 >= 0; var6--) {
                if (class121.field2986[var6] != null) {
                    class4.field78++;
                    short var7 = 0;
                    int var8 = 0;
                    if (class121.field2986[var6].method546((byte) 103, class48.field1259)) {
                        if (arg4.field2856 > class32.field833.field2856) {
                            var7 = 2000;
                        }
                        if (class32.field833.field2870 != 0 && arg4.field2870 != 0) {
                            if (class32.field833.field2870 == arg4.field2870) {
                                var7 = 2000;
                            } else {
                                var7 = 0;
                            }
                        }
                    } else if (class70.field1816[var6]) {
                        var7 = 2000;
                    }
                    if (var6 == 0) {
                        var8 = var7 + 56;
                    }
                    if (var6 == 1) {
                        var8 = var7 + 16;
                    }
                    if (var6 == 2) {
                        var8 = var7 + 41;
                    }
                    if (var6 == 3) {
                        var8 = var7 + 26;
                    }
                    if (var6 == 4) {
                        var8 = var7 + 44;
                    }
                    class97.method812(arg1, class121.field2986[var6], -126, class21.method172(-93, new class65[] { class90.field2380, var5 }), var8, arg2, arg3);
                }
            }
        } else if ((class46.field1213 & 0x8) == 8) {
            class97.method812(arg1, class28.field749, -119, class21.method172(-39, new class65[] { class51.field1286, class121.field2987, var5 }), 5, arg2, arg3);
            class110.field2724++;
        }
        int var9 = -97 / ((29 - arg0) / 47);
        for (int var10 = 0; var10 < class125.field3040; var10++) {
            if (class23.field557[var10] == 20) {
                class29.field783[var10] = class21.method172(-64, new class65[] { class29.field766, class128.field3092, class90.field2380, var5 });
                return;
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V", line = 519)
    public static void method710(boolean arg0) {
        field2143 = null;
        field2154 = null;
        field2160 = null;
        field2163 = null;
        field2149 = null;
        field2162 = null;
        if (!arg0) {
            method707((byte) -56);
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(Z)V", line = 537)
    public static final void method711(boolean arg0) {
        field2146++;
        try {
            if (class129.field3127 == 0) {
                if (class98.field2541 != null) {
                    class98.field2541.method73(120);
                    class98.field2541 = null;
                }
                class47.field1238 = null;
                class129.field3127 = 1;
                class53.field1359 = false;
                class101.field2640 = 0;
            }
            if (class129.field3127 == 1) {
                if (class47.field1238 == null) {
                    class47.field1238 = class72.field1891.method93(0, class113.field2827);
                }
                if (class47.field1238.field875 == 2) {
                    throw new IOException();
                }
                if (class47.field1238.field875 == 1) {
                    class98.field2541 = new class13((Socket) class47.field1238.field878, class72.field1891);
                    class129.field3127 = 2;
                    class47.field1238 = null;
                }
            }
            if (class129.field3127 == 2) {
                long var1 = class74.field1997 = class24.field591.method530((byte) 28);
                class56.field1453.field998 = 0;
                class56.field1453.method305(false, 14);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class56.field1453.method305(arg0, var3);
                class98.field2541.method82(2, 72, 0, class56.field1453.field994);
                class129.field3127 = 3;
                class58.field1575.field998 = 0;
            }
            if (!arg0) {
                if (class129.field3127 == 3) {
                    int var4 = class98.field2541.method76(64);
                    if (var4 != 0) {
                        class86.method766((byte) 106, var4);
                        return;
                    }
                    class58.field1575.field998 = 0;
                    class129.field3127 = 4;
                }
                if (class129.field3127 == 4) {
                    if (class58.field1575.field998 < 8) {
                        int var5 = class98.field2541.method81(-22925);
                        if (8 - class58.field1575.field998 < var5) {
                            var5 = 8 - class58.field1575.field998;
                        }
                        if (var5 > 0) {
                            class98.field2541.method83(class58.field1575.field994, var5, -15520, class58.field1575.field998);
                            class58.field1575.field998 += var5;
                        }
                    }
                    if (class58.field1575.field998 == 8) {
                        class58.field1575.field998 = 0;
                        class72.field1897 = class58.field1575.method344(144752608);
                        class129.field3127 = 5;
                    }
                }
                if (class129.field3127 == 5) {
                    int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class72.field1897 >> 32), (int) class72.field1897 };
                    class56.field1453.field998 = 0;
                    class56.field1453.method305(false, 10);
                    class56.field1453.method351(var6[0], -73);
                    class56.field1453.method351(var6[1], 79);
                    class56.field1453.method351(var6[2], -62);
                    class56.field1453.method351(var6[3], 71);
                    class56.field1453.method351(class72.field1891.field307, 57);
                    class56.field1453.method323(class24.field591.method530((byte) -68), -98);
                    class56.field1453.method350((byte) -5, class24.field583);
                    class56.field1453.method312((byte) 118, class12.field234, class91.field2396);
                    class13.field288.field998 = 0;
                    if (class19.field456 == 40) {
                        class13.field288.method305(arg0, 18);
                    } else {
                        class13.field288.method305(false, 16);
                    }
                    class13.field288.method305(false, class56.field1453.field998 + 53);
                    class13.field288.method351(418, -127);
                    class13.field288.method305(false, class41.field1065 ? 1 : 0);
                    class13.field288.method351(class19.field467.field1551, 91);
                    class13.field288.method351(class6.field125.field1551, 74);
                    class13.field288.method351(class129.field3122.field1551, -71);
                    class13.field288.method351(class117.field2934.field1551, -69);
                    class13.field288.method351(class70.field1809.field1551, 63);
                    class13.field288.method351(class20.field491.field1551, 68);
                    class13.field288.method351(class56.field1468.field1551, -110);
                    class13.field288.method351(class26.field645.field1551, -115);
                    class13.field288.method351(class23.field569.field1551, -90);
                    class13.field288.method351(class57.field1529.field1551, 88);
                    class13.field288.method351(class100.field2604.field1551, 124);
                    class13.field288.method351(class55.field1409.field1551, -93);
                    class13.field288.method325(class56.field1453.field998, (byte) 110, class56.field1453.field994, 0);
                    class98.field2541.method82(class13.field288.field998, -109, 0, class13.field288.field994);
                    class56.field1453.method641(0, var6);
                    for (int var7 = 0; var7 < 4; var7++) {
                        var6[var7] += 50;
                    }
                    class58.field1575.method641(0, var6);
                    class129.field3127 = 6;
                }
                if (class129.field3127 == 6 && class98.field2541.method81(-22925) > 0) {
                    int var8 = class98.field2541.method76(64);
                    if (var8 == 21 && class19.field456 == 20) {
                        class129.field3127 = 7;
                    } else if (var8 == 2) {
                        class129.field3127 = 9;
                    } else if (var8 == 15 && class19.field456 == 40) {
                        class17.method129((byte) -98);
                        return;
                    } else if (var8 == 23 && class100.field2595 < 1) {
                        class129.field3127 = 0;
                        class100.field2595++;
                    } else {
                        class86.method766((byte) 113, var8);
                        return;
                    }
                }
                if (class129.field3127 == 7 && class98.field2541.method81(-22925) > 0) {
                    class104.field2677 = class98.field2541.method76(64) * 60 + 180;
                    class129.field3127 = 8;
                }
                if (class129.field3127 == 8) {
                    class101.field2640 = 0;
                    class78.method684((byte) 10, class57.field1530, class116.field2918, class21.method172(-71, new class65[] { class39.method320(class104.field2677 / 60, (byte) -36), class87.field2325 }));
                    if (--class104.field2677 <= 0) {
                        class129.field3127 = 0;
                    }
                } else {
                    if (class129.field3127 == 9 && class98.field2541.method81(-22925) >= 8) {
                        class89.field2374 = class98.field2541.method76(64);
                        class113.field2811 = class98.field2541.method76(64) == 1;
                        class94.field2492 = class98.field2541.method76(64);
                        class94.field2492 <<= 0x8;
                        class94.field2492 += class98.field2541.method76(64);
                        class35.field880 = class98.field2541.method76(64);
                        class98.field2541.method83(class58.field1575.field994, 1, -15520, 0);
                        class58.field1575.field998 = 0;
                        class113.field2823 = class58.field1575.method646(28084);
                        class98.field2541.method83(class58.field1575.field994, 2, -15520, 0);
                        class58.field1575.field998 = 0;
                        class54.field1392 = class58.field1575.method326(255);
                        class129.field3127 = 10;
                    }
                    if (class129.field3127 != 10) {
                        class101.field2640++;
                        if (class101.field2640 > 2000) {
                            if (class100.field2595 < 1) {
                                class100.field2595++;
                                class129.field3127 = 0;
                                if (class66.field1771 == class113.field2827) {
                                    class113.field2827 = class55.field1440;
                                } else {
                                    class113.field2827 = class66.field1771;
                                }
                            } else {
                                class86.method766((byte) 105, -3);
                            }
                        }
                    } else if (class98.field2541.method81(-22925) >= class54.field1392) {
                        class58.field1575.field998 = 0;
                        class98.field2541.method83(class58.field1575.field994, class54.field1392, -15520, 0);
                        class32.method250((byte) -128);
                        class1.field5 = -1;
                        class77.method678(16, false);
                        class113.field2823 = -1;
                    }
                }
            }
        } catch (IOException var9) {
            if (class100.field2595 < 1) {
                class100.field2595++;
                class129.field3127 = 0;
                if (class66.field1771 == class113.field2827) {
                    class113.field2827 = class55.field1440;
                } else {
                    class113.field2827 = class66.field1771;
                }
            } else {
                class86.method766((byte) 78, -2);
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILc;Lc;)V", line = 848)
    public static final void method712(int arg0, class16 arg1, class16 arg2) {
        class77.field2051.method793(-103);
        if (class19.field456 == 0 || class19.field456 == 5) {
            byte var3 = 20;
            int var4 = 82 - var3;
            arg2.method119(class80.field2136, 180, 74 - var3, 16777215);
            class108.method884(28, var4, 304, 34, 9179409);
            class108.method884(29, var4 + 1, 302, 32, 0);
            class108.method886(30, var4 + 2, class21.field505 * 3, 30, 9179409);
            class108.method886(class21.field505 * 3 + 30, var4 + 2, 300 - class21.field505 * 3, 30, 0);
            arg2.method119(class24.field608, 180, 105 - var3, 16777215);
        }
        if (class19.field456 == 20) {
            class46.field1192.method963(0, 0);
            byte var5 = 40;
            arg2.method113(class24.field593, 180, var5, 16776960, true);
            int var19 = var5 + 15;
            arg2.method113(class24.field577, 180, var19, 16776960, true);
            int var20 = var19 + 15;
            arg2.method113(class24.field588, 180, var20, 16776960, true);
            int var21 = var20 + 15;
            int var22 = var21 + 10;
            arg2.method110(class21.method172(-50, new class65[] { class26.field654, class24.field591 }), 90, var22, 16777215, true);
            int var24 = var22 + 15;
            arg2.method110(class21.method172(-110, new class65[] { class93.field2450, class24.field583.method545(120) }), 92, var24, 16777215, true);
            int var25 = var24 + 15;
        }
        if (class19.field456 == 10) {
            class46.field1192.method963(0, 0);
            if (class99.field2576 == 0) {
                byte var6 = 80;
                byte var7 = 100;
                arg2.method113(class3.field65, 180, var6, 16776960, true);
                byte var8 = 120;
                class22.field538.method963(var7 - 73, var8 + -20);
                arg2.method120(class114.field2859, var7 - 73, var8 + -20, 144, 40, 16777215, true, 1, 1, 0);
                int var23 = var6 + 30;
                short var9 = 260;
                class22.field538.method963(var9 - 73, var8 + -20);
                arg2.method120(class126.field3059, var9 - 73, var8 + -20, 144, 40, 16777215, true, 1, 1, 0);
            } else if (class99.field2576 == 2) {
                byte var10 = 40;
                byte var11 = 100;
                arg2.method113(class24.field593, 180, var10, 16776960, true);
                short var12 = 150;
                int var26 = var10 + 15;
                arg2.method113(class24.field577, 180, var26, 16776960, true);
                int var27 = var26 + 15;
                arg2.method113(class24.field588, 180, var27, 16776960, true);
                int var28 = var27 + 15;
                int var29 = var28 + 10;
                arg2.method110(class21.method172(-76, new class65[] { class26.field654, class24.field591, class64.field1660 == 0 & ~(class76.field2028 % 40) > -21 ? class62.field1631 : class24.field592 }), 90, var29, 16777215, true);
                int var30 = var29 + 15;
                arg2.method110(class21.method172(-90, new class65[] { class93.field2450, class24.field583.method545(119), ~class64.field1660 == -2 & ~(class76.field2028 % 40) > -21 ? class62.field1631 : class24.field592 }), 92, var30, 16777215, true);
                int var31 = var30 + 15;
                class22.field538.method963(var11 - 73, var12 + -20);
                arg2.method113(class115.field2895, var11, var12 + 5, 16777215, true);
                short var13 = 260;
                class22.field538.method963(var13 - 73, var12 + -20);
                arg2.method113(class112.field2792, var13, var12 + 5, 16777215, true);
            } else if (class99.field2576 == 3) {
                arg2.method113(class46.field1217, 180, 40, 16776960, true);
                byte var14 = 65;
                arg2.method113(class64.field1663, 180, var14, 16777215, true);
                int var32 = var14 + 15;
                arg2.method113(class66.field1759, 180, var32, 16777215, true);
                int var33 = var32 + 15;
                arg2.method113(class125.field3049, 180, var33, 16777215, true);
                int var34 = var33 + 15;
                arg2.method113(client.field383, 180, var34, 16777215, true);
                int var35 = var34 + 15;
                short var15 = 150;
                short var16 = 180;
                class22.field538.method963(var16 - 73, var15 + -20);
                arg2.method113(class112.field2792, var16, var15 + 5, 16777215, true);
            }
        }
        field2157++;
        class35.method265(-63);
        try {
            Graphics var17 = class10.field210.getGraphics();
            class77.field2051.method790(202, 171, var17, 109);
            class41.field1124.method790(0, 0, var17, 124);
            if (arg0 <= -84) {
                class54.field1372.method790(637, 0, var17, -57);
                if (class5.field90) {
                    class5.field90 = false;
                    class28.field745.method790(128, 0, var17, -104);
                    class114.field2864.method790(202, 371, var17, 104);
                    class104.field2691.method790(0, 265, var17, 126);
                    class116.field2909.method790(562, 265, var17, 103);
                    class46.field1206.method790(128, 171, var17, -85);
                    class97.field2519.method790(562, 171, var17, -50);
                }
            }
        } catch (Exception var18) {
            class10.field210.repaint();
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lg;II)Lke;", line = 987)
    public static final class65 method713(class39 arg0, int arg1, int arg2) {
        field2148++;
        if (arg1 != 16776960) {
            return null;
        }
        try {
            class65 var3 = new class65();
            var3.field1733 = arg0.method311((byte) -99);
            if (arg2 < var3.field1733) {
                var3.field1733 = arg2;
            }
            var3.field1702 = new byte[var3.field1733];
            arg0.field998 += class20.field492.method407((byte) -67, arg0.field994, var3.field1702, var3.field1733, 0, arg0.field998);
            return var3;
        } catch (Exception var4) {
            return class104.field2679;
        }
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V", line = 1017)
    public static final void method714(int arg0) {
        class112.field2775++;
        field2159++;
        class84.method751(true, 0);
        class12.method72(-50, true);
        class84.method751(false, 0);
        class12.method72(-108, false);
        class116.method946(-7966);
        class23.method186(-13255);
        if (!class101.field2625) {
            int var1 = class128.field3098;
            int var2 = class75.field2018 + class125.field3031 & 0x7FF;
            if (var1 < class99.field2560 / 256) {
                var1 = class99.field2560 / 256;
            }
            if (class129.field3111[4] && var1 < class1.field36[4] + 128) {
                var1 = class1.field36[4] + 128;
            }
            class131.method1022(var1 * 3 + 600, class12.field255, var1, var2, class52.field1323, class58.method495(class32.field833.field1070, class32.field833.field1067, true, class19.field462) - 50, 2048);
        }
        int var3;
        if (class101.field2625) {
            var3 = class28.method238(106);
        } else {
            var3 = class110.method905(0);
        }
        int var4 = class102.field2642;
        int var5 = class51.field1293;
        int var6 = class5.field102;
        int var7 = class76.field2038;
        int var8 = class51.field1295;
        int var9 = 0;
        int var10 = -14 % ((arg0 + 17) / 55);
        while (var9 < 5) {
            if (class129.field3111[var9]) {
                int var11 = (int) ((double) (class4.field75[var9] * 2 + 1) * Math.random() + Math.sin((double) class80.field2124[var9] / 100.0D * (double) class6.field110[var9]) * (double) class1.field36[var9] - (double) class4.field75[var9]);
                if (var9 == 0) {
                    class102.field2642 += var11;
                }
                if (var9 == 4) {
                    class76.field2038 += var11;
                    if (class76.field2038 < 128) {
                        class76.field2038 = 128;
                    }
                    if (class76.field2038 > 383) {
                        class76.field2038 = 383;
                    }
                }
                if (var9 == 2) {
                    class51.field1293 += var11;
                }
                if (var9 == 1) {
                    class5.field102 += var11;
                }
                if (var9 == 3) {
                    class51.field1295 = class51.field1295 + var11 & 0x7FF;
                }
            }
            var9++;
        }
        class44.method376((byte) -125);
        class37.field933 = 0;
        class37.field959 = class91.field2418 - 4;
        class37.field934 = class52.field1320 - 4;
        class37.field946 = true;
        class108.method885();
        class89.field2377.method597(class102.field2642, class5.field102, class51.field1293, class76.field2038, class51.field1295, var3);
        class89.field2377.method591();
        class26.method217((byte) 0);
        class72.method637((byte) -72);
        ((class111) class127.field3078).method912((byte) -127, class22.field524);
        class7.method52(-1);
        if (class117.field2928 && class129.method1017(true, false, -79) == 0) {
            class117.field2928 = false;
        }
        if (class117.field2928) {
            class44.method376((byte) -128);
            class108.method885();
            client.method141(null, class131.field3187, 7066, false);
        }
        class92.method800((byte) 120);
        class76.field2038 = var7;
        class51.field1295 = var8;
        class102.field2642 = var4;
        class5.field102 = var6;
        class51.field1293 = var5;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ZI)Lj;", line = 1146)
    public static final class57 method715(boolean arg0, int arg1) {
        field2142++;
        class57 var2 = (class57) class10.field209.method833((byte) -53, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class33.field852.method477(10, (byte) 127, arg1);
        class57 var4 = new class57();
        if (arg0) {
            return null;
        }
        var4.field1486 = arg1;
        if (var3 != null) {
            var4.method461(18056, new class39(var3));
        }
        var4.method468(-2);
        if (var4.field1527 != -1) {
            var4.method464(method715(false, var4.field1527), (byte) 119, method715(false, var4.field1499));
        }
        if (!class5.field93 && var4.field1506) {
            var4.field1493 = 0;
            var4.field1482 = class6.field126;
            var4.field1478 = null;
            var4.field1477 = null;
        }
        class10.field209.method836((long) arg1, var4, true);
        return var4;
    }
}
