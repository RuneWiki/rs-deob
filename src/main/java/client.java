import jagex3.jagmisc.jagmisc;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class24 {

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Lsp;")
    public static class448 field2879 = new class448("WTRC", 1);

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Lpn;")
    public static class523 field2886 = new class523("", 11);

    @OriginalMember(owner = "client!client", name = "G", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "Z")
    public static boolean field2888;

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method1373(int arg0) {
        field2875++;
        if (arg0 != 3000) {
            return;
        }
        if (class405.field6029.field2976 > class393.field5786) {
            class371.field5522 = (class405.field6029.field2976 * 50 - 50) * 5;
            if (class310.field4422 == class291.field4193) {
                class291.field4193 = class69.field883;
            } else {
                class291.field4193 = class310.field4422;
            }
            if (class371.field5522 > 3000) {
                class371.field5522 = 3000;
            }
            if (class405.field6029.field2976 >= 2 && class405.field6029.field2978 == 6) {
                this.method194(126, "js5connect_outofdate");
                class113.field1589 = 1000;
                return;
            }
            if (class405.field6029.field2976 >= 4 && class405.field6029.field2978 == -1) {
                this.method194(127, "js5crc");
                class113.field1589 = 1000;
                return;
            }
            if (class405.field6029.field2976 >= 4 && (class113.field1589 == 0 || class113.field1589 == 5)) {
                if (class405.field6029.field2978 == 7 || class405.field6029.field2978 == 9) {
                    this.method194(arg0 - 2874, "js5connect_full");
                } else if (class405.field6029.field2978 <= 0) {
                    this.method194(126, "js5io");
                } else {
                    this.method194(arg0 - 2873, "js5connect");
                }
                class113.field1589 = 1000;
                return;
            }
        }
        class393.field5786 = class405.field6029.field2976;
        if (class371.field5522 > 0) {
            class371.field5522--;
            return;
        }
        try {
            if (class159.field2247 == 0) {
                class335.field4664 = class498.field7404.method2551(0, class521.field7650, class291.field4193);
                class159.field2247++;
            }
            if (class159.field2247 == 1) {
                if (class335.field4664.field6617 == 2) {
                    this.method1383(-70, 1000);
                    return;
                }
                if (class335.field4664.field6617 == 1) {
                    class159.field2247++;
                }
            }
            if (class159.field2247 == 2) {
                class379.field5602 = new class66((Socket) class335.field4664.field6613, class498.field7404);
                class65 var2 = new class65(5);
                var2.method638(arg0 ^ 0xB47, class215.field3084.field3575);
                var2.method618(592, (byte) 84);
                class379.field5602.method650(5, 0, var2.field783, arg0 - 2873);
                class159.field2247++;
                class351.field4865 = class437.method2644(-109);
            }
            if (class159.field2247 == 3) {
                if (class113.field1589 == 0 || class113.field1589 == 5 || class379.field5602.method641(arg0 - 2997) > 0) {
                    int var3 = class379.field5602.method647(arg0 - 2894);
                    if (var3 != 0) {
                        this.method1383(-121, var3);
                        return;
                    }
                    class159.field2247++;
                } else if (class437.method2644(-119) - class351.field4865 > 30000L) {
                    this.method1383(-59, 1001);
                    return;
                }
            }
            if (class159.field2247 == 4) {
                boolean var4 = class113.field1589 == 5 || class113.field1589 == 10 || class113.field1589 == 28;
                class405.field6029.method1418(arg0 ^ 0xBB8, class379.field5602, !var4);
                class335.field4664 = null;
                class159.field2247 = 0;
                class379.field5602 = null;
            }
        } catch (IOException var5) {
            this.method1383(-106, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method209(int arg0) {
        field2880++;
        if (class34.field396) {
            class393.method2406(-22125);
        }
        if (class225.field3300 != null) {
            class225.field3300.method333(true);
        }
        if (arg0 < 81) {
            return;
        }
        if (class149.field2112 != null) {
            class280.method1795(class498.field7404, (byte) -62, class149.field2112);
            class149.field2112 = null;
        }
        if (class383.field5635 != null) {
            class383.field5635.method646(false);
            class383.field5635 = null;
        }
        if (class364.field5094 != null) {
            class364.field5094.method760(class148.field2081, 0);
        }
        class364.field5094 = null;
        class495.method2965(527);
        class405.field6029.method1431(228742352);
        class436.field6392.method72(-1);
        if (class392.field5764 != null) {
            class392.field5764.method257(-21509);
            class392.field5764 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method1374(int arg0) {
        field2870++;
        if (class113.field1589 == 1000) {
            return;
        }
        long var2 = class215.method1468(-124) / 1000000L - class215.field3097;
        class215.field3097 = class215.method1468(-118) / 1000000L;
        boolean var4 = class513.method3051((byte) 124);
        int var5 = -60 / ((-arg0 - 53) / 63);
        if (var4 && class195.field2843 && class305.field4338 != null) {
            class305.field4338.method1650(2000);
        }
        if (class113.field1589 == 30 || class113.field1589 == 10) {
            if (class251.field3700 != 0L && class437.method2644(-68) > class251.field3700) {
                class76.method711(class114.method920((byte) -123), class478.field7044.field3351, class478.field7044.field3324, false, false);
            } else if (!class225.field3300.method318() && class157.field2233) {
                class2.method14(-71);
            }
        }
        if (class149.field2112 == null) {
            Container var6;
            if (class245.field3611 == null) {
                var6 = class498.field7404.field6180;
            } else {
                var6 = class245.field3611;
            }
            int var7 = var6.getSize().width;
            int var8 = var6.getSize().height;
            if (class245.field3611 == var6) {
                Insets var9 = class245.field3611.getInsets();
                var8 -= var9.top + var9.bottom;
                var7 -= var9.left + var9.right;
            }
            if (class248.field3674 != var7 || class333.field4630 != var8) {
                if (class225.field3300 == null || class225.field3300.method300()) {
                    class512.method3048(false);
                } else {
                    class333.field4630 = var8;
                    class248.field3674 = var7;
                }
                class251.field3700 = class437.method2644(-102) + 500L;
            }
        }
        if (class149.field2112 != null && !class162.field2279 && (class113.field1589 == 30 || class113.field1589 == 10)) {
            class76.method711(class478.field7044.field3347, -1, -1, false, false);
        }
        boolean var10 = false;
        if (class487.field7145) {
            class487.field7145 = false;
            var10 = true;
        }
        if (var10) {
            class175.method1228((byte) -125);
        }
        if (class225.field3300 != null && class225.field3300.method318() || class114.method920((byte) -123) != 1) {
            class448.method2716(-11712);
        }
        if (class113.field1589 == 0) {
            class185.method1297(class497.field7393[class25.field301], 115, class386.field5673[class25.field301], class495.field7266[class25.field301], class264.field3869, var10, class263.field3863);
        } else if (class113.field1589 == 5) {
            class208.method1447(class386.field5673[class25.field301].getRGB(), (byte) 91, var10 | class225.field3300.method318(), class495.field7266[class25.field301].getRGB(), class497.field7393[class25.field301].getRGB(), class466.field6840, class225.field3300);
        } else if (class113.field1589 == 10) {
            class464.method2782(false);
        } else if (class113.field1589 == 25 || class113.field1589 == 28) {
            if (class488.field7181 == 1) {
                if (class487.field7157 > class29.field352) {
                    class29.field352 = class487.field7157;
                }
                int var11 = (class29.field352 - class487.field7157) * 50 / class29.field352;
                class195.method1364(true, class179.field2529.method2031(true, class377.field5585) + "<br>(" + var11 + "%)", class396.field5802, 13);
            } else if (class488.field7181 == 2) {
                if (class270.field3997 < class287.field4145) {
                    class270.field3997 = class287.field4145;
                }
                int var12 = (class270.field3997 - class287.field4145) * 50 / class270.field3997 + 50;
                class195.method1364(true, class179.field2529.method2031(true, class377.field5585) + "<br>(" + var12 + "%)", class396.field5802, 13);
            } else {
                class195.method1364(true, class179.field2529.method2031(true, class377.field5585), class396.field5802, 13);
            }
        } else if (class113.field1589 == 30) {
            class359.method2159(var2, -38);
        } else if (class113.field1589 == 40) {
            class195.method1364(true, class270.field3979.method2031(true, class377.field5585) + "<br>" + class401.field5945.method2031(true, class377.field5585), class396.field5802, 13);
        }
        if (class240.field3548 == 3) {
            for (int var13 = 0; var13 < class267.field3933; var13++) {
                Rectangle var14 = class96.field1292[var13];
                if (class368.field5473[var13]) {
                    class225.field3300.method367(var14.x, var14.width, var14.y, (byte) 58, -1996553985, var14.height);
                } else if (class525.field7706[var13]) {
                    class225.field3300.method367(var14.x, var14.width, var14.y, (byte) 58, -1996554240, var14.height);
                }
            }
        }
        if (class11.method79(-64)) {
            class198.method1396(class225.field3300, 8);
        }
        if ((class113.field1589 == 30 || class113.field1589 == 10) && class240.field3548 == 0 && class114.method920((byte) -123) == 1 && !var10 && class419.field6187.equals("1.1")) {
            int var15 = 0;
            for (int var16 = 0; var16 < class267.field3933; var16++) {
                if (class525.field7706[var16]) {
                    class525.field7706[var16] = false;
                    class443.field6572[var15++] = class96.field1292[var16];
                }
            }
            class225.field3300.method363(class443.field6572, var15);
        } else if (class113.field1589 != 0) {
            class225.field3300.method302();
            for (int var17 = 0; var17 < class267.field3933; var17++) {
                class525.field7706[var17] = false;
            }
        }
        if (class478.field7044.field3331 == 0) {
            class213.method1462(15L, -5184);
        } else if (class478.field7044.field3331 == 1) {
            class213.method1462(10L, -5184);
        } else if (class478.field7044.field3331 == 2) {
            class213.method1462(5L, -5184);
        } else if (class478.field7044.field3331 == 3) {
            class213.method1462(2L, -5184);
        }
        if (class261.field3852) {
            class56.method525(-2);
        }
        if (class478.field7044.field3338 && class113.field1589 == 10 && class64.field761 != -1) {
            class478.field7044.field3338 = false;
            class478.field7044.method2067(class498.field7404, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Luu;)Z")
    public static final boolean method1375(class188 arg0) {
        if (class407.field6069) {
            if (method1380(arg0).field4072 != 0) {
                return false;
            }
            if (arg0.field2727 == 0) {
                return false;
            }
        }
        return arg0.field2714;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method195(byte arg0) {
        field2873++;
        try {
            if (arg0 == 57) {
                this.method1379(arg0 - 57);
            }
        } catch (OutOfMemoryError var3) {
            if (var3.getMessage() == null || !var3.getMessage().startsWith("native")) {
                throw var3;
            }
            class88.method780(0, (byte) 51);
            class194.method1362(var3, var3.getMessage() + " (Recovered) " + this.method210((byte) -76), -80);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public static final void method1376(int arg0) {
        int var1 = class75.field1027;
        int[] var2 = class334.field4634;
        int var3 = class275.field4056 ? var1 : class232.field3410 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class121 var5;
            if (var4 < var1) {
                var5 = class384.field5647[var2[var4]];
            } else {
                var5 = class250.field3690[class173.field2454[var4 - var1]];
            }
            if (var5.field6328 == arg0) {
                var5.field1756 = 0;
                if (var5.field1701 < 0) {
                    var5.field1711 = false;
                } else {
                    int var6 = var5.method963((byte) 127);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field6335 & 0x7F) != 0 || (var5.field6334 & 0x7F) != 0) {
                            var5.field1711 = false;
                            continue;
                        }
                    } else if ((var5.field6335 & 0x7F) != 64 || (var5.field6334 & 0x7F) != 64) {
                        var5.field1711 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field6335 >> 7;
                        int var8 = var5.field6334 >> 7;
                        if (class323.field4549[var7][var8] != var5.field1701) {
                            var5.field1711 = true;
                            continue;
                        }
                        if (class199.field2917[var7][var8] > 1) {
                            var10002 = class199.field2917[var7][var8]--;
                            var5.field1711 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field6335 - var9 >> 7;
                        int var11 = var5.field6334 - var9 >> 7;
                        int var12 = var5.field6335 + var9 >> 7;
                        int var13 = var5.field6334 + var9 >> 7;
                        if (!class464.method2780(var13, var11, var12, var5.field1701, -2, var10)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class323.field4549[var14][var15] == var5.field1701) {
                                        var10002 = class199.field2917[var14][var15]--;
                                    }
                                }
                            }
                            var5.field1711 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class364 && var5.field1780 != null && class263.field3867 >= var5.field1780.field2262 && class263.field3867 < var5.field1780.field2274) {
                        ((class364) var5).field5088 = false;
                    }
                    var5.field1711 = false;
                    var5.field6327 = class66.method643(var5.field6335, 107, var5.field6328, var5.field6334);
                    class322.method1989(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)Ljava/lang/String;")
    public final String method210(byte arg0) {
        field2882++;
        String var2 = null;
        try {
            var2 = "[1)" + class340.field4713 + "," + class476.field7013 + "," + class397.field5828 + "," + class457.field6713 + "|";
            if (class435.field6375 != null) {
                var2 = var2 + "2)" + class525.field7714 + "," + (class435.field6375.field1777[0] + class340.field4713) + "," + (class435.field6375.field1778[0] + class476.field7013) + "|";
            }
            var2 = var2 + "3)" + class65.field802 + "|4)" + class478.field7044.field3335 + "|5)" + class114.method920((byte) -123) + "|6)" + class94.field1278 + "," + class410.field6100 + "|";
            var2 = var2 + "7)" + class478.field7044.method1540(29083, class65.field802) + "|";
            var2 = var2 + "8)" + class478.field7044.method1536(class65.field802, (byte) -28) + "|";
            var2 = var2 + "9)" + class478.field7044.field3321 + "|";
            var2 = var2 + "10)" + class478.field7044.field3356 + "|";
            var2 = var2 + "11)" + class478.field7044.field3343 + "|";
            var2 = var2 + "12)" + class478.field7044.method2072(class65.field802, 108) + "|";
            var2 = var2 + "13)" + class352.field4882 + "|";
            if (arg0 != -76) {
                field2879 = null;
            }
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var3) {
            }
            var2 = var2 + "]";
        } catch (Throwable var4) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    private final void method1377(int arg0) {
        field2885++;
        class406.field6056++;
        class50.method502(-1, (byte) -82, null, -1);
        class17.method133(arg0 ^ 0x1248, null, -1, -1);
        class386.method2353(arg0 ^ 0xFFFFED5B);
        class49.field548++;
        for (int var2 = 0; var2 < 32768; var2++) {
            class461 var12 = class250.field3690[var2];
            if (var12 != null) {
                byte var13 = var12.field6790.field1379;
                if ((var13 & 0x1) != 0) {
                    int var14 = var12.method963((byte) 127);
                    if ((var13 & 0x2) != 0 && var12.field1779 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var15 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var16 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var15 != 0 || var16 != 0) {
                            int var17 = var12.field1777[0] + var15;
                            if (var17 < 0) {
                                var17 = 0;
                            } else if ((class397.field5828 - var14 - 1) < var17) {
                                var17 = class397.field5828 - var14 - 1;
                            }
                            int var18 = var12.field1778[0] + var16;
                            if (var18 < 0) {
                                var18 = 0;
                            } else if (var18 > class457.field6713 - var14 - 1) {
                                var18 = class457.field6713 - var14 - 1;
                            }
                            int var19 = class164.method1162((byte) -69, class455.field6684[var12.field6328], var12.field1777[0], var17, var14, var18, var14, 0, class75.field1023, 0, true, class371.field5513, var12.field1778[0], var14, -1);
                            if (var19 > 0) {
                                if (var19 > 9) {
                                    var19 = 9;
                                }
                                for (int var20 = 0; var20 < var19; var20++) {
                                    var12.field1777[var20] = class371.field5513[var19 - var20 - 1];
                                    var12.field1778[var20] = class75.field1023[var19 - (var20 + 1)];
                                    var12.field1782[var20] = 1;
                                }
                                var12.field1779 = var19;
                            }
                        }
                    }
                    class391.method2399(-47, true, var12);
                    int var21 = class94.method823((byte) -17, var12);
                    class394.method2414(var12, class247.field3665, class369.field5488, var21, arg0 + 4536);
                    class165.method1168(var12, arg0 + 4532);
                }
            }
        }
        if (arg0 != -4645) {
            method1389();
        }
        if (class172.field2444 == 0 && class72.field989 == 0) {
            if (class462.field6802 == 2) {
                class515.method3059(488012003);
            } else {
                class306.method1901(true);
            }
            if (class161.field2268 >> 7 < 14 || class397.field5828 - 14 <= class161.field2268 >> 7 || (class486.field7138 >> 7) < 14 || class486.field7138 >> 7 >= class457.field6713 - 14) {
                class120.method943(-12319);
            }
        }
        while (true) {
            class125 var3;
            class188 var4;
            class188 var5;
            do {
                var3 = (class125) class10.field116.method1014(arg0 ^ 0xFFFFE224);
                if (var3 == null) {
                    while (true) {
                        class125 var6;
                        class188 var7;
                        class188 var8;
                        do {
                            var6 = (class125) class33.field389.method1014(4095);
                            if (var6 == null) {
                                while (true) {
                                    class125 var9;
                                    class188 var10;
                                    class188 var11;
                                    do {
                                        var9 = (class125) class440.field6536.method1014(4095);
                                        if (var9 == null) {
                                            if (class134.field1943 != null) {
                                                class435.method2637(arg0 + 4536);
                                            }
                                            if (class263.field3867 % 1500 == 0) {
                                                class74.method699((byte) 105);
                                            }
                                            class468.method2827(0);
                                            if (class34.field396 && (class437.method2644(-77) - 60000L) > class345.field4780) {
                                                class393.method2406(-22125);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field1830;
                                        if (var10.field2773 < 0) {
                                            break;
                                        }
                                        var11 = class371.method2286(0, var10.field2745);
                                    } while (var11 == null || var11.field2758 == null || var10.field2773 >= var11.field2758.length || var11.field2758[var10.field2773] != var10);
                                    class41.method409(var9);
                                }
                            }
                            var7 = var6.field1830;
                            if (var7.field2773 < 0) {
                                break;
                            }
                            var8 = class371.method2286(0, var7.field2745);
                        } while (var8 == null || var8.field2758 == null || var8.field2758.length <= var7.field2773 || var8.field2758[var7.field2773] != var7);
                        class41.method409(var6);
                    }
                }
                var4 = var3.field1830;
                if (var4.field2773 < 0) {
                    break;
                }
                var5 = class371.method2286(0, var4.field2745);
            } while (var5 == null || var5.field2758 == null || var5.field2758.length <= var4.field2773 || var5.field2758[var4.field2773] != var4);
            class41.method409(var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IB)I")
    public static final int method1378(int arg0, byte arg1) {
        field2883++;
        if (arg0 < 96) {
            return 0;
        } else if (arg0 < 128) {
            return 2;
        } else {
            int var2 = -100 / ((arg1 - 26) / 63);
            return 3;
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    private final void method1379(int arg0) {
        field2878++;
        if (class113.field1589 == 1000) {
            return;
        }
        class263.field3867++;
        if ((class263.field3867 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class88.field1197 = var2.get(11) * 600 - (-(var2.get(12) * 10) - (var2.get(13) / 6));
            class49.field546.setSeed((long) class88.field1197);
        }
        if ((class263.field3867 % 50) == 0) {
            class522.field7673 = class98.field1320;
            class355.field4965 = class57.field668;
            class98.field1320 = 0;
            class57.field668 = 0;
        }
        this.method1392((byte) -64);
        if (class194.field2831 != null) {
            class194.field2831.method1142(93);
        }
        class413.method2520((byte) 76);
        class229.field3360.method794(28);
        class104.field1460.method1275(-126);
        if (class364.field5094 != null) {
            int var3 = class364.field5094.method759((byte) 124);
            class124.field1814 = var3;
        }
        if (class225.field3300 != null) {
            class225.field3300.method301((int) class437.method2644(arg0 ^ 0xFFFFFF91));
        }
        class185.method1298(true);
        class484.field7122 = arg0;
        for (class74 var4 = class229.field3360.method795(arg0 ^ 0x68C1); var4 != null && class484.field7122 < 128; var4 = class229.field3360.method795(26817)) {
            if (var4.method700(arg0 + 69) != 1) {
                char var5 = var4.method704(2);
                if (!class375.method2306(true) || var5 != '`' && var5 != '§') {
                    class386.field5678[class484.field7122] = var4;
                    class484.field7122++;
                } else if (class11.method79(-79)) {
                    class198.method1398(arg0 ^ 0x23);
                } else {
                    class525.method3113(arg0 - 86);
                }
            }
        }
        for (class306 var6 = class104.field1460.method1284((byte) -80); var6 != null; var6 = class104.field1460.method1284((byte) -87)) {
            int var7 = var6.method231((byte) 102);
            if (var7 == -1) {
                class175.field2475.method1015(false, var6);
            } else if (class400.method2464((byte) 126, var7)) {
                class188.field2670.method1015(false, var6);
            }
            if (class188.field2670.method1026(0) > 10) {
                class188.field2670.method1014(4095);
            }
        }
        if (class11.method79(-103)) {
            class338.method2056((byte) 122);
        }
        if (class113.field1589 == 0) {
            this.method1390(23396);
            class350.method2108((byte) 127);
        } else if (class113.field1589 == 5) {
            this.method1390(23396);
            class350.method2108((byte) 107);
        } else if (class113.field1589 == 25 || class113.field1589 == 28) {
            class176.method1230((byte) 125);
        }
        if (class113.field1589 == 10) {
            this.method1377(arg0 ^ 0xFFFFEDDB);
            class59.method538(true);
            class52.method511(arg0 - 5);
            class248.method1627(-50);
        } else if (class113.field1589 == 30) {
            class433.method2628(12362);
        } else if (class113.field1589 == 40) {
            class248.method1627(arg0 + 117);
            if (class428.field6307 != -3 && class428.field6307 != 2 && class428.field6307 != 15) {
                class531.method3135(2700);
            }
        }
        class238.method1588(class225.field3300, false);
        class188.field2670.method1014(4095);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Luu;)Lns;")
    public static final class278 method1380(class188 arg0) {
        class278 var1 = (class278) class519.field7638.method875(((long) arg0.field2678 << 32) + (long) arg0.field2773, 124);
        return var1 == null ? arg0.field2691 : var1;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field2876++;
        if (!this.method192(69)) {
            return;
        }
        class84.field1155 = Integer.parseInt(this.getParameter("worldid"));
        class365.field5281 = class393.method2412(Integer.parseInt(this.getParameter("modewhere")), true);
        if (!class237.method1576(class365.field5281, (byte) -112) && class365.field5281 != class297.field4260) {
            class365.field5281 = class297.field4260;
        }
        class239.field3506 = class187.method1304(0, Integer.parseInt(this.getParameter("modewhat")));
        if (class368.field5471 != class239.field3506 && class506.field7483 != class239.field3506 && class276.field4063 != class239.field3506) {
            class239.field3506 = class276.field4063;
        }
        try {
            class377.field5585 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var8) {
            class377.field5585 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class6.field81 = true;
        } else {
            class6.field81 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class436.field6386 = true;
        } else {
            class436.field6386 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class133.field1932 = true;
        } else {
            class133.field1932 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class61.field703 = class51.field564;
        } else {
            class61.field703 = class68.field872;
        }
        try {
            class401.field5950 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var7) {
            class401.field5950 = 0;
        }
        class386.field5680 = this.getParameter("quiturl");
        class307.field4365 = this.getParameter("settings");
        if (class307.field4365 == null) {
            class307.field4365 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class245.field3603 = Integer.parseInt(var5);
            } catch (Exception var6) {
                class245.field3603 = 0;
            }
        }
        class25.field301 = Integer.parseInt(this.getParameter("colourid"));
        if (class25.field301 < 0 || class495.field7266.length <= class25.field301) {
            class25.field301 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class471.field6952 = true;
            class40.field454 = true;
        }
        class164.field2319 = this;
        if (class68.field872 == class61.field703) {
            class128.field1862 = 765;
            class86.field1178 = 503;
        } else if (class61.field703 == class51.field564) {
            class86.field1178 = 480;
            class128.field1862 = 640;
        }
        this.method204(592, class239.field3506.method1894(false) + 32, class86.field1178, class128.field1862, (byte) -107);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Luu;IIIIIIIII)V")
    public static final void method1381(class188[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class188 var11 = arg0[var10];
            if (var11 != null && var11.field2745 == arg1) {
                int var12 = var11.field2718 + arg6;
                int var13 = var11.field2765 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field2727 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field2711 + var12;
                    int var19 = var11.field2672 + var13;
                    if (var11.field2727 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field2727 == 0 || var11.field2629 || method1380(var11).field4072 != 0 || class326.field4577 == var11 || class363.field5041 == var11.field2732) {
                    if (!method1375(var11)) {
                        if (class134.field1943 == var11) {
                            class50.field555 = true;
                            class264.field3897 = var12;
                            class140.field1988 = var13;
                        }
                        if (var11.field2759 || var14 < var16 && var15 < var17) {
                            if (var11.field2742 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class125 var20 = (class125) class440.field6536.method1018(124); var20 != null; var20 = (class125) class440.field6536.method1022((byte) -112)) {
                                    if (var20.field1820) {
                                        var20.method1525((byte) -85);
                                        var20.field1830.field2626 = false;
                                    }
                                }
                                if (class367.field5456 == 0) {
                                    class134.field1943 = null;
                                    class326.field4577 = null;
                                }
                                class495.field7267 = 0;
                                class375.field5556 = false;
                                class314.field4469 = false;
                                if (!class500.field7415) {
                                    class63.method567(-19);
                                }
                            }
                            boolean var21;
                            if (class104.field1460.method1268((byte) 58) >= var14 && class104.field1460.method1280(3045) >= var15 && class104.field1460.method1268((byte) 58) < var16 && class104.field1460.method1280(3045) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class453.field6671 && var21) {
                                if (var11.field2640 >= 0) {
                                    class86.field1177 = var11.field2640;
                                } else if (var11.field2742) {
                                    class86.field1177 = -1;
                                }
                            }
                            if (!class500.field7415 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class221.method1503((byte) 118, var11, arg8 - var12, arg9 - var13);
                            }
                            boolean var22 = false;
                            if (class104.field1460.method1269(2) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class306 var24 = (class306) class188.field2670.method1018(37);
                            if (var24 != null && var24.method231((byte) 102) == 0 && var24.method233(65) >= var14 && var24.method236((byte) -92) >= var15 && var24.method233(44) < var16 && var24.method236((byte) -81) < var17) {
                                var23 = true;
                            }
                            if (var11.field2621 != null) {
                                for (int var25 = 0; var25 < var11.field2621.length; var25++) {
                                    if (class229.field3360.method796(-86, var11.field2621[var25])) {
                                        if (var11.field2609 == null || class263.field3867 >= var11.field2609[var25]) {
                                            byte var26 = var11.field2743[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class229.field3360.method796(-94, 86) && !class229.field3360.method796(-128, 82) && !class229.field3360.method796(-90, 81)) && ((var26 & 0x2) == 0 || class229.field3360.method796(-73, 86)) && ((var26 & 0x1) == 0 || class229.field3360.method796(-85, 82)) && ((var26 & 0x4) == 0 || class229.field3360.method796(-110, 81))) {
                                                if (var25 < 10) {
                                                    class188.method1317(true, var25 + 1, "", var11.field2678, -1);
                                                } else if (var25 == 10) {
                                                    class235.method1568((byte) -97);
                                                    class278 var27 = method1380(var11);
                                                    class258.method1663(var27.field4077, var27.method1789(16693), var11, (byte) -38);
                                                    class8.field93 = class515.method3060(var11, (byte) 120);
                                                    if (class8.field93 == null) {
                                                        class8.field93 = "Null";
                                                    }
                                                    class91.field1252 = var11.field2663 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field2762[var25];
                                                if (var11.field2609 == null) {
                                                    var11.field2609 = new int[var11.field2621.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field2609[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field2609[var25] = class263.field3867 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field2609 != null) {
                                        var11.field2609[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class141.method1051(0, var24.method236((byte) -81) - var13, var11, var24.method233(92) - var12);
                            }
                            if (class134.field1943 != null && class134.field1943 != var11 && var21 && method1380(var11).method1782(109)) {
                                class93.field1273 = var11;
                            }
                            if (class326.field4577 == var11) {
                                class442.field6559 = true;
                                class38.field433 = var12;
                                class297.field4267 = var13;
                            }
                            if (var11.field2629 || var11.field2732 != 0) {
                                if (var21 && class124.field1814 != 0 && var11.field2676 != null) {
                                    class125 var29 = new class125();
                                    var29.field1820 = true;
                                    var29.field1830 = var11;
                                    var29.field1831 = class124.field1814;
                                    var29.field1833 = var11.field2676;
                                    class440.field6536.method1015(false, var29);
                                }
                                if (class134.field1943 != null || class500.field7415 || class515.field7585 != var11.field2732 && class495.field7267 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field2732 != 0) {
                                    if (class516.field7609 == var11.field2732 || class482.field7096 == var11.field2732) {
                                        class56.field658 = var11;
                                        if (class423.field6245 != null) {
                                            class423.field6245.method1835((byte) -10, var11.field2672, class225.field3300);
                                        }
                                        if (class516.field7609 == var11.field2732) {
                                            if (!class500.field7415 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class144.method1063(-1, class225.field3300, arg8, arg9);
                                                for (class255 var30 = (class255) class156.field2211.method2955(62); var30 != null; var30 = (class255) class156.field2211.method2952((byte) -115)) {
                                                    if (arg8 >= var30.field3740 && arg8 < var30.field3744 && arg9 >= var30.field3746 && arg9 < var30.field3742) {
                                                        class63.method567(-22);
                                                        class518.method3079(var30.field3747, true);
                                                    }
                                                }
                                            }
                                            class50.method502(var13, (byte) -82, var11, var12);
                                            continue;
                                        }
                                    }
                                    if (class363.field5041 == var11.field2732) {
                                        if (var11.method1320(0, class225.field3300) == null || class144.field2023 != 0 && class144.field2023 != 3 || class500.field7415 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field2769[var32];
                                        if (var31 < var33 || var31 > var11.field2713[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field2711 / 2;
                                        int var35 = var32 - var11.field2672 / 2;
                                        int var36;
                                        if (class462.field6802 == 4) {
                                            var36 = (int) class328.field4588 & 0x3FFF;
                                        } else {
                                            var36 = (int) class328.field4588 + class455.field6702 & 0x3FFF;
                                        }
                                        int var37 = class340.field4724[var36];
                                        int var38 = class340.field4715[var36];
                                        if (class462.field6802 != 4) {
                                            var37 = (class465.field6839 + 256) * var37 >> 8;
                                            var38 = (class465.field6839 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 15;
                                        int var40 = var35 * var38 - var34 * var37 >> 15;
                                        int var41;
                                        int var42;
                                        if (class462.field6802 == 4) {
                                            var41 = (class204.field2966 >> 7) + (var39 >> 2);
                                            var42 = (class203.field2949 >> 7) - (var40 >> 2);
                                        } else {
                                            int var43 = (class435.field6375.method963((byte) 127) - 1) * 64;
                                            var41 = (class435.field6375.field6335 - var43 >> 7) + (var39 >> 2);
                                            var42 = (class435.field6375.field6334 - var43 >> 7) - (var40 >> 2);
                                        }
                                        if (class453.field6671 && (class223.field3273 & 0x40) != 0) {
                                            class188 var44 = class274.method1766(class404.field5977, class219.field3149, (byte) 9);
                                            if (var44 == null) {
                                                class235.method1568((byte) -85);
                                            } else {
                                                class434.method2632(19, (byte) -55, false, 1L, var41, " ->", true, class8.field93, var42, var11.field2617, class148.field2074);
                                            }
                                            continue;
                                        }
                                        if (class61.field703 == class51.field564) {
                                            class434.method2632(59, (byte) -55, false, 1L, var41, "", true, class176.field2503.method2031(true, class377.field5585), var42, -1, -1);
                                        }
                                        class434.method2632(44, (byte) -55, false, 1L, var41, "", true, class7.field87, var42, -1, class456.field6706);
                                        continue;
                                    }
                                    if (class515.field7585 == var11.field2732) {
                                        class502.field7456 = var11;
                                        if (var21) {
                                            class375.field5556 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method233(93) - var12 - var11.field2711 / 2) * 2.0D / (double) class399.field5902);
                                            int var46 = (int) (-((double) (var24.method236((byte) -84) - var13 - var11.field2672 / 2) * 2.0D / (double) class399.field5902));
                                            int var47 = class63.field744 + var45 + class399.field5926;
                                            int var48 = class512.field7555 + var46 + class399.field5910;
                                            class355 var49 = class84.method753((byte) -83);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method2141(var47, var50, (byte) 111, var48);
                                            if (var50 != null) {
                                                if (class229.field3360.method796(-111, 82) && class365.field5273 > 0) {
                                                    class87.method771(var50[0], 63, var50[2], var50[1]);
                                                    continue;
                                                }
                                                class314.field4469 = true;
                                                class363.field5040 = var50[0];
                                                class525.field7708 = var50[1];
                                                class95.field1282 = var50[2];
                                            }
                                            class495.field7267 = 1;
                                            class400.field5933 = false;
                                            class432.field6353 = class104.field1460.method1268((byte) 58);
                                            class203.field2948 = class104.field1460.method1280(3045);
                                            continue;
                                        }
                                        if (var22 && class495.field7267 > 0) {
                                            if (class495.field7267 == 1 && (class432.field6353 != class104.field1460.method1268((byte) 58) || class203.field2948 != class104.field1460.method1280(3045))) {
                                                class114.field1607 = class63.field744;
                                                class141.field2000 = class512.field7555;
                                                class495.field7267 = 2;
                                            }
                                            if (class495.field7267 == 2) {
                                                class400.field5933 = true;
                                                class376.method2308(class114.field1607 + (int) ((double) (class432.field6353 - class104.field1460.method1268((byte) 58)) * 2.0D / (double) class399.field5905), 107);
                                                class251.method1632(-1, class141.field2000 - (int) ((double) (class203.field2948 - class104.field1460.method1280(3045)) * 2.0D / (double) class399.field5905));
                                            }
                                            continue;
                                        }
                                        if (class495.field7267 > 0 && !class400.field5933) {
                                            if ((class495.field7259 == 1 || class358.method2154((byte) -20)) && class291.field4175 > 2) {
                                                class474.method2865(84, class432.field6353, class203.field2948);
                                            } else if (class445.method2709(128)) {
                                                class474.method2865(108, class432.field6353, class203.field2948);
                                            }
                                        }
                                        class495.field7267 = 0;
                                        continue;
                                    }
                                    if (class110.field1552 == var11.field2732) {
                                        if (var22) {
                                            class238.method1583(var11.field2711, class104.field1460.method1268((byte) 58) - var12, var11.field2672, class104.field1460.method1280(3045) - var13, (byte) 76);
                                        }
                                        continue;
                                    }
                                    if (class501.field7424 == var11.field2732) {
                                        class17.method133(-122, var11, var13, var12);
                                        continue;
                                    }
                                }
                                if (!var11.field2723 && var23) {
                                    var11.field2723 = true;
                                    if (var11.field2634 != null) {
                                        class125 var51 = new class125();
                                        var51.field1820 = true;
                                        var51.field1830 = var11;
                                        var51.field1835 = var24.method233(110) - var12;
                                        var51.field1831 = var24.method236((byte) -114) - var13;
                                        var51.field1833 = var11.field2634;
                                        class440.field6536.method1015(false, var51);
                                    }
                                }
                                if (var11.field2723 && var22 && var11.field2667 != null) {
                                    class125 var52 = new class125();
                                    var52.field1820 = true;
                                    var52.field1830 = var11;
                                    var52.field1835 = class104.field1460.method1268((byte) 58) - var12;
                                    var52.field1831 = class104.field1460.method1280(3045) - var13;
                                    var52.field1833 = var11.field2667;
                                    class440.field6536.method1015(false, var52);
                                }
                                if (var11.field2723 && !var22) {
                                    var11.field2723 = false;
                                    if (var11.field2734 != null) {
                                        class125 var53 = new class125();
                                        var53.field1820 = true;
                                        var53.field1830 = var11;
                                        var53.field1835 = class104.field1460.method1268((byte) 58) - var12;
                                        var53.field1831 = class104.field1460.method1280(3045) - var13;
                                        var53.field1833 = var11.field2734;
                                        class33.field389.method1015(false, var53);
                                    }
                                }
                                if (var22 && var11.field2662 != null) {
                                    class125 var54 = new class125();
                                    var54.field1820 = true;
                                    var54.field1830 = var11;
                                    var54.field1835 = class104.field1460.method1268((byte) 58) - var12;
                                    var54.field1831 = class104.field1460.method1280(3045) - var13;
                                    var54.field1833 = var11.field2662;
                                    class440.field6536.method1015(false, var54);
                                }
                                if (!var11.field2626 && var21) {
                                    var11.field2626 = true;
                                    if (var11.field2730 != null) {
                                        class125 var55 = new class125();
                                        var55.field1820 = true;
                                        var55.field1830 = var11;
                                        var55.field1835 = class104.field1460.method1268((byte) 58) - var12;
                                        var55.field1831 = class104.field1460.method1280(3045) - var13;
                                        var55.field1833 = var11.field2730;
                                        class440.field6536.method1015(false, var55);
                                    }
                                }
                                if (var11.field2626 && var21 && var11.field2703 != null) {
                                    class125 var56 = new class125();
                                    var56.field1820 = true;
                                    var56.field1830 = var11;
                                    var56.field1835 = class104.field1460.method1268((byte) 58) - var12;
                                    var56.field1831 = class104.field1460.method1280(3045) - var13;
                                    var56.field1833 = var11.field2703;
                                    class440.field6536.method1015(false, var56);
                                }
                                if (var11.field2626 && !var21) {
                                    var11.field2626 = false;
                                    if (var11.field2619 != null) {
                                        class125 var57 = new class125();
                                        var57.field1820 = true;
                                        var57.field1830 = var11;
                                        var57.field1835 = class104.field1460.method1268((byte) 58) - var12;
                                        var57.field1831 = class104.field1460.method1280(3045) - var13;
                                        var57.field1833 = var11.field2619;
                                        class33.field389.method1015(false, var57);
                                    }
                                }
                                if (var11.field2618 != null) {
                                    class125 var58 = new class125();
                                    var58.field1830 = var11;
                                    var58.field1833 = var11.field2618;
                                    class10.field116.method1015(false, var58);
                                }
                                if (var11.field2724 != null && class63.field747 > var11.field2702) {
                                    if (var11.field2627 == null || class63.field747 - var11.field2702 > 32) {
                                        class125 var63 = new class125();
                                        var63.field1830 = var11;
                                        var63.field1833 = var11.field2724;
                                        class440.field6536.method1015(false, var63);
                                    } else {
                                        label691: for (int var59 = var11.field2702; var59 < class63.field747; var59++) {
                                            int var60 = class250.field3684[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field2627.length; var61++) {
                                                if (var11.field2627[var61] == var60) {
                                                    class125 var62 = new class125();
                                                    var62.field1830 = var11;
                                                    var62.field1833 = var11.field2724;
                                                    class440.field6536.method1015(false, var62);
                                                    break label691;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2702 = class63.field747;
                                }
                                if (var11.field2750 != null && class176.field2497 > var11.field2673) {
                                    if (var11.field2615 == null || class176.field2497 - var11.field2673 > 32) {
                                        class125 var68 = new class125();
                                        var68.field1830 = var11;
                                        var68.field1833 = var11.field2750;
                                        class440.field6536.method1015(false, var68);
                                    } else {
                                        label667: for (int var64 = var11.field2673; var64 < class176.field2497; var64++) {
                                            int var65 = class489.field7190[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field2615.length; var66++) {
                                                if (var11.field2615[var66] == var65) {
                                                    class125 var67 = new class125();
                                                    var67.field1830 = var11;
                                                    var67.field1833 = var11.field2750;
                                                    class440.field6536.method1015(false, var67);
                                                    break label667;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2673 = class176.field2497;
                                }
                                if (var11.field2650 != null && class125.field1837 > var11.field2740) {
                                    if (var11.field2602 == null || class125.field1837 - var11.field2740 > 32) {
                                        class125 var73 = new class125();
                                        var73.field1830 = var11;
                                        var73.field1833 = var11.field2650;
                                        class440.field6536.method1015(false, var73);
                                    } else {
                                        label643: for (int var69 = var11.field2740; var69 < class125.field1837; var69++) {
                                            int var70 = class480.field7057[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field2602.length; var71++) {
                                                if (var11.field2602[var71] == var70) {
                                                    class125 var72 = new class125();
                                                    var72.field1830 = var11;
                                                    var72.field1833 = var11.field2650;
                                                    class440.field6536.method1015(false, var72);
                                                    break label643;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2740 = class125.field1837;
                                }
                                if (var11.field2653 != null && class509.field7511 > var11.field2722) {
                                    if (var11.field2715 == null || class509.field7511 - var11.field2722 > 32) {
                                        class125 var78 = new class125();
                                        var78.field1830 = var11;
                                        var78.field1833 = var11.field2653;
                                        class440.field6536.method1015(false, var78);
                                    } else {
                                        label619: for (int var74 = var11.field2722; var74 < class509.field7511; var74++) {
                                            int var75 = class61.field708[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field2715.length; var76++) {
                                                if (var11.field2715[var76] == var75) {
                                                    class125 var77 = new class125();
                                                    var77.field1830 = var11;
                                                    var77.field1833 = var11.field2653;
                                                    class440.field6536.method1015(false, var77);
                                                    break label619;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2722 = class509.field7511;
                                }
                                if (var11.field2763 != null && class506.field7488 > var11.field2693) {
                                    if (var11.field2754 == null || class506.field7488 - var11.field2693 > 32) {
                                        class125 var83 = new class125();
                                        var83.field1830 = var11;
                                        var83.field1833 = var11.field2763;
                                        class440.field6536.method1015(false, var83);
                                    } else {
                                        label595: for (int var79 = var11.field2693; var79 < class506.field7488; var79++) {
                                            int var80 = class33.field387[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field2754.length; var81++) {
                                                if (var11.field2754[var81] == var80) {
                                                    class125 var82 = new class125();
                                                    var82.field1830 = var11;
                                                    var82.field1833 = var11.field2763;
                                                    class440.field6536.method1015(false, var82);
                                                    break label595;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2693 = class506.field7488;
                                }
                                if (class428.field6310 > var11.field2697 && var11.field2625 != null) {
                                    class125 var84 = new class125();
                                    var84.field1830 = var11;
                                    var84.field1833 = var11.field2625;
                                    class440.field6536.method1015(false, var84);
                                }
                                if (class444.field6577 > var11.field2697 && var11.field2751 != null) {
                                    class125 var85 = new class125();
                                    var85.field1830 = var11;
                                    var85.field1833 = var11.field2751;
                                    class440.field6536.method1015(false, var85);
                                }
                                if (class193.field2813 > var11.field2697 && var11.field2728 != null) {
                                    class125 var86 = new class125();
                                    var86.field1830 = var11;
                                    var86.field1833 = var11.field2728;
                                    class440.field6536.method1015(false, var86);
                                }
                                if (class40.field458 > var11.field2697 && var11.field2637 != null) {
                                    class125 var87 = new class125();
                                    var87.field1830 = var11;
                                    var87.field1833 = var11.field2637;
                                    class440.field6536.method1015(false, var87);
                                }
                                if (class411.field6111 > var11.field2697 && var11.field2638 != null) {
                                    class125 var88 = new class125();
                                    var88.field1830 = var11;
                                    var88.field1833 = var11.field2638;
                                    class440.field6536.method1015(false, var88);
                                }
                                var11.field2697 = class49.field548;
                                if (var11.field2654 != null) {
                                    for (int var89 = 0; var89 < class484.field7122; var89++) {
                                        class125 var90 = new class125();
                                        var90.field1830 = var11;
                                        var90.field1834 = class386.field5678[var89].method701((byte) 108);
                                        var90.field1829 = class386.field5678[var89].method704(2);
                                        var90.field1833 = var11.field2654;
                                        class440.field6536.method1015(false, var90);
                                    }
                                }
                                if (class420.field6219 && var11.field2605 != null) {
                                    class125 var91 = new class125();
                                    var91.field1830 = var11;
                                    var91.field1833 = var11.field2605;
                                    class440.field6536.method1015(false, var91);
                                }
                            }
                            if (var11.field2727 == 5 && var11.field2620 != -1) {
                                var11.method1319(-118, class172.field2451, class428.field6311).method1835((byte) -122, var11.field2672, class225.field3300);
                            }
                            class228.method1537(var11, 2);
                            if (var11.field2727 == 0) {
                                method1381(arg0, var11.field2678, var14, var15, var16, var17, var12 - var11.field2700, var13 - var11.field2744, arg8, arg9);
                                if (var11.field2758 != null) {
                                    method1381(var11.field2758, var11.field2678, var14, var15, var16, var17, var12 - var11.field2700, var13 - var11.field2744, arg8, arg9);
                                }
                                class305 var92 = (class305) class49.field545.method875((long) var11.field2678, 124);
                                if (var92 != null) {
                                    if (class68.field872 == class61.field703 && var92.field4335 == 0 && !class500.field7415 && var21 && !class407.field6069) {
                                        class63.method567(105);
                                    }
                                    class226.method1533(var14, var13, var16, var92.field4333, 29474, var15, var12, var17, arg9, arg8);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class228.method1537(var11, 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method213(int arg0) {
        field2869++;
        try {
            this.method1374(-122);
            if (arg0 != 6231) {
                field2886 = null;
            }
        } catch (OutOfMemoryError var3) {
            if (var3.getMessage() == null || !var3.getMessage().startsWith("native")) {
                throw var3;
            }
            class88.method780(0, (byte) 70);
            class194.method1362(var3, var3.getMessage() + " (Recovered) " + this.method210((byte) -76), -115);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method203(boolean arg0) {
        method1385(9);
        field2874++;
        class404.method2476((byte) -10);
        class215.method1473((byte) 2);
        class224.method1529(-2);
        class180.method1265(-5631);
        class503.method3011(-20);
        class270.method1743((byte) 119);
        class376.method2310(99);
        class223.method1523((byte) 70);
        class59.method533(-91);
        class106.method882(31);
        class24.method212(19197);
        class126.method989(false);
        class303.method1895(-15098);
        class448.method2717(127);
        class446.method2712(-7325);
        class122.method972(!arg0);
        class38.method337(-127);
        class340.method2075(1);
        class452.method2727(14958);
        class455.method2742(!arg0);
        class133.method1021((byte) -84);
        class85.method758((byte) 51);
        class66.method642(-1);
        class204.method1428(-15604);
        class11.method75(-128);
        class162.method1138(3);
        class308.method1912(0);
        class387.method2369(87);
        class385.method2345(22);
        class297.method1870(3);
        class156.method1108(24310);
        class407.method2500(-25819);
        class167.method1181(56);
        class227.method1534(1);
        class485.method2921(4);
        class60.method544((byte) 21);
        class212.method1459(32);
        class506.method3020((byte) -25);
        class89.method785(false);
        class99.method839((byte) -16);
        class325.method2007(false);
        class171.method1213(-128);
        class2.method11(1);
        class454.method2736(1);
        class233.method1561(89);
        class238.method1581(!arg0);
        class443.method2704((byte) 64);
        class193.method1351(-119);
        class351.method2114((byte) 109);
        class9.method65(false);
        class332.method2033(-94);
        class250.method1630((byte) 124);
        class262.method1685((byte) -123);
        class468.method2834(-84);
        class383.method2333(-7675);
        class461.method2766(0);
        class120.method947(false);
        class32.method262((byte) 117);
        class342.method2077((byte) -91);
        class62.method558(3);
        class355.method2147((byte) 110);
        class291.method1838(4096);
        class493.method2954((byte) -45);
        class188.method1321(-7975);
        class491.method2946((byte) 83);
        class364.method2170(false);
        class412.method2519((byte) -115);
        class256.method1646(3);
        class482.method2902(8);
        class65.method585(-271907000);
        class121.method970(-114);
        class314.method1950(1);
        class148.method1073(255);
        class372.method2297(-22964);
        class199.method1402((byte) 58);
        class203.method1415(1);
        class305.method1898(200);
        class278.method1787(0);
        class318.method1984((byte) -63);
        class135.method1031(2048);
        class354.method2140((byte) 116);
        class3.method16(1049069386);
        class391.method2402((byte) 121);
        class379.method2320(true);
        class55.method519(true);
        class112.method908((byte) 21);
        class22.method190(22);
        class158.method1125(0);
        class276.method1775(-119);
        class367.method2267((byte) 24);
        class267.method1721((byte) 93);
        class287.method1822(7559);
        class471.method2856((byte) 55);
        class23.method191((byte) -125);
        class196.method1370(false);
        class274.method1764(false);
        class310.method1933((byte) 121);
        class222.method1511((byte) 17);
        class353.method2132(0);
        class101.method863((byte) 93);
        class100.method851(0);
        class72.method684(0);
        class10.method67(-82);
        class53.method518(arg0);
        class316.method1977(-36);
        class88.method779(1);
        class124.method978(false);
        class445.method2710(0);
        class467.method2812(-34);
        class257.method1649((byte) -57);
        class179.method1254(false);
        class418.method2548((byte) -48);
        class490.method2945(0);
        class457.method2753(1);
        class258.method1659((byte) 116);
        class132.method1009(127);
        class411.method2518(false);
        class213.method1461((byte) 98);
        class134.method1029(-127);
        class388.method2388((byte) 54);
        class462.method2775(126);
        class323.method1993(2);
        class189.method1327();
        class161.method1135(28);
        class531.method3137((byte) 4);
        class400.method2462(arg0);
        class151.method1090(-14932);
        class268.method1723(false);
        class52.method512(89);
        class466.method2790(false);
        class41.method407();
        class399.method2443();
        class159.method1129(0);
        class111.method905(-128);
        class191.method1339();
        class150.method1086(17);
        class405.method2489((byte) 66);
        class242.method1598(10);
        class157.method1124(10);
        class475.method2870(-75);
        class104.method868(0);
        class176.method1239(26270);
        class474.method2864((byte) -122);
        class284.method1808(11);
        class92.method818(1);
        class165.method1166(113);
        class169.method1190(4);
        class20.method182(-14495);
        class393.method2409((byte) 107);
        class77.method716(-61);
        class118.method932(8192);
        class358.method2152((byte) -82);
        class279.method1793(13732);
        class439.method2687((byte) 34);
        class330.method2025((byte) -120);
        class25.method217(7);
        class113.method913((byte) -102);
        class498.method2991(1);
        class429.method2614(13815);
        class339.method2065(true);
        class102.method867(30068);
        class516.method3065(124);
        class336.method2054(0);
        class86.method765(-1);
        class292.method1849();
        class319.method1985(125);
        class432.method2623(0);
        class326.method2014(2);
        class369.method2280(63);
        class519.method3087((byte) -54);
        class166.method1175(23573);
        class192.method1349((byte) 74);
        class232.method1559(false);
        class321.method1986(3);
        class125.method986(-1);
        class523.method3107((byte) -43);
        class164.method1163((byte) 125);
        class422.method2588((byte) 123);
        class413.method2521(500);
        class521.method3099((byte) -29);
        class470.method2846((byte) 94);
        class235.method1569(true);
        class386.method2352(6);
        class480.method2897(-26007);
        class76.method712((byte) 123);
        class263.method1686(-107);
        class139.method1043(-16641);
        class522.method3105(7582);
        class110.method901(false);
        class186.method1302((byte) 92);
        class359.method2160(-114);
        class241.method1596(94);
        class464.method2781((byte) 104);
        class307.method1904(false);
        class56.method524(22404);
        class206.method1435(false);
        class322.method1990(-69);
        class93.method821(-58);
        class527.method3126(-1);
        class229.method1542(true);
        class255.method1642(-115);
        class495.method2966(-12582);
        class251.method1634(0);
        class384.method2336(!arg0);
        class84.method754(12);
        class200.method1405((byte) 81);
        class61.method549((byte) 75);
        class335.method2040(117);
        class463.method2777(6);
        class153.method1091(16299);
        class4.method33(30517);
        class281.method1799((byte) -116);
        class21.method187((byte) -66);
        class501.method3000(-25049);
        class298.method1875();
        class17.method129((byte) 7);
        class410.method2509((byte) -124);
        class511.method3046(-87);
        class181.method1270(128);
        class273.method1761(-29624);
        class373.method2298(12);
        class58.method531((byte) -46);
        class7.method48(20517);
        class334.method2038((byte) 1);
        class130.method999(1);
        class27.method224(20253);
        class109.method899(13);
        class469.method2835();
        class146.method1065((byte) 109);
        class208.method1448(arg0);
        class433.method2629((byte) -57);
        class435.method2638(-14407);
        class424.method2596((byte) 26);
        class237.method1578((byte) -114);
        class70.method665(95);
        class131.method1007(-86);
        class450.method2721(0);
        class420.method2579(65535);
        class220.method1502((byte) 85);
        class28.method230(0);
        class209.method1450(65);
        class402.method2472(76);
        class389.method2394(0);
        class75.method706(0);
        class489.method2942(false);
        class371.method2288(false);
        class472.method2859((byte) -32);
        class344.method2082((byte) -125);
        class415.method2541();
        class49.method493(32410);
        class83.method751();
        class459.method2758();
        class207.method1438();
        class282.method1801(-7799);
        class39.method398(8);
        class357.method2151();
        class290.method1830(true);
        class526.method3121(-1);
        class26.method221(-17);
        class198.method1397(-16777216);
        class271.method1747();
        class136.method1035(-256);
        class129.method997((byte) 116);
        class456.method2751((byte) -9);
        class530.method3129((byte) -58);
        class477.method2883(false);
        class382.method2329(-5669);
        class68.method658(-106);
        class428.method2609(127);
        class6.method45(1244216161);
        class436.method2640((byte) -91);
        class275.method1773(385672172);
        class123.method976((byte) 86);
        class185.method1296((byte) -58);
        class398.method2438(true);
        class365.method2230(1);
        class476.method2873(true);
        class244.method1605(9);
        class216.method1477(118);
        class460.method2763((byte) 22);
        class510.method3043((byte) 127);
        class231.method1548(-70);
        class368.method2275(60);
        class81.method730(-114);
        class264.method1688((byte) -102);
        class396.method2427(10241);
        class299.method1878(-90);
        class265.method1713(true);
        class497.method2975(124);
        class473.method2862((byte) -14);
        class401.method2465(-1);
        class44.method480();
        class160.method1131((byte) -50);
        class348.method2102(119);
        class141.method1053((byte) 108);
        class253.method1640(-1);
        class147.method1067(2);
        class82.method738(31444);
        class33.method264(0);
        class144.method1064(true);
        class496.method2973(10);
        class154.method1097((byte) 93);
        class484.method2913((byte) 90);
        class283.method1804(0);
        class370.method2285((byte) -104);
        class96.method830(1);
        class481.method2901((byte) -108);
        class226.method1532(true);
        class500.method2996(1675886592);
        class296.method1869((byte) 57);
        class173.method1224(-116);
        class525.method3112((byte) -32);
        class34.method271(28);
        class12.method80((byte) 95);
        class392.method2403(3);
        class57.method528((byte) -72);
        class195.method1368((byte) -48);
        class487.method2927(-1);
        class175.method1229(-1);
        class440.method2690(-89);
        class73.method691(false);
        class248.method1625((byte) -117);
        class375.method2304(-969029332);
        class108.method892((byte) 18);
        class478.method2888(255);
        class390.method2396();
        class438.method2654();
        class394.method2413((byte) -126);
        class236.method1573(-10933);
        class425.method2601(2);
        class67.method656(-8625);
        class182.method1287(0);
        class128.method992(-115);
        class427.method2606((byte) 76);
        class91.method802(0);
        class45.method482((byte) -15);
        class127.method991((byte) 100);
        class346.method2094(-261);
        class377.method2313((byte) -27);
        class441.method2693(123);
        class80.method725((byte) -77);
        class423.method2590(-42);
        class95.method825(19274);
        class98.method835(4864);
        class240.method1592(false);
        class502.method3005(-128);
        class311.method1940(31);
        class315.method1965((byte) -10);
        class94.method822((byte) 55);
        class524.method3111(-4);
        class409.method2505(33985);
        class350.method2109(-11836);
        class453.method2730(-5298);
        class194.method1356(true);
        class155.method1099((byte) 127);
        class252.method1635(11134);
        class51.method510(true);
        class37.method282(125);
        class479.method2893(-114);
        class230.method1544(-108);
        class47.method490(0);
        class205.method1432((byte) 121);
        class352.method2119((byte) 95);
        class280.method1794(0);
        class288.method1825(53);
        class328.method2019((byte) 32);
        class87.method774(-7247);
        class442.method2697((byte) -59);
        class239.method1589(true);
        class140.method1049((byte) 114);
        class486.method2922((byte) -44);
        class434.method2634(110);
        class221.method1505(99);
        class294.method1863((byte) -23);
        class149.method1080(-9160);
        class430.method2615((byte) -63);
        class50.method501(!arg0);
        class499.method2993(false);
        class289.method1827((byte) 122);
        class138.method1041(19293);
        class306.method1902(3);
        class183.method1290(8301);
        class272.method1756((byte) 101);
        class465.method2784(-105);
        class504.method3014(-120);
        class97.method831((byte) -3);
        class483.method2910(101);
        class29.method232((byte) -112);
        class172.method1219(92);
        class225.method1530(-1);
        class403.method2474(31469);
        class520.method3091((byte) -92);
        class515.method3057(true);
        class8.method57(1);
        class245.method1610(-7782);
        class512.method3047((byte) -74);
        class408.method2503((byte) -79);
        class269.method1727(255);
        class517.method3072(false);
        class380.method2325(-11878);
        class397.method2432(-20);
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
    public static final void method1382(int arg0) {
        int var1 = class75.field1027;
        int[] var2 = class334.field4634;
        for (int var3 = 0; var3 < class232.field3410 + var1; var3++) {
            class121 var4;
            if (var3 < var1) {
                var4 = class384.field5647[var2[var3]];
            } else {
                var4 = class250.field3690[class173.field2454[var3 - var1]];
            }
            if (var4.field6328 == arg0 && var4.field1701 >= 0) {
                int var5 = var4.method963((byte) 127);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field6335 & 0x7F) != 0 || (var4.field6334 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field6335 & 0x7F) != 64 || (var4.field6334 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field6335 >> 7;
                    int var7 = var4.field6334 >> 7;
                    if (var4.field1701 > class323.field4549[var6][var7]) {
                        class323.field4549[var6][var7] = var4.field1701;
                        class199.field2917[var6][var7] = 1;
                    } else if (class323.field4549[var6][var7] == var4.field1701) {
                        var10002 = class199.field2917[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field6335 - var8 >> 7;
                    int var10 = var4.field6334 - var8 >> 7;
                    int var11 = var4.field6335 + var8 >> 7;
                    int var12 = var4.field6334 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field1701 > class323.field4549[var13][var14]) {
                                class323.field4549[var13][var14] = var4.field1701;
                                class199.field2917[var13][var14] = 1;
                            } else if (class323.field4549[var13][var14] == var4.field1701) {
                                var10002 = class199.field2917[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field2887++;
        try {
            if (arg0.length != 4) {
                class523.method3108("argument count", (byte) 117);
            }
            class84.field1155 = Integer.parseInt(arg0[0]);
            class365.field5281 = class258.field3807;
            if (arg0[1].equals("live")) {
                class239.field3506 = class276.field4063;
            } else if (arg0[1].equals("rc")) {
                class239.field3506 = class506.field7483;
            } else if (arg0[1].equals("wip")) {
                class239.field3506 = class368.field5471;
            } else {
                class523.method3108("modewhat", (byte) 123);
            }
            class377.field5585 = class356.method2149(arg0[2], -35);
            if (class377.field5585 == -1) {
                if (arg0[2].equals("english")) {
                    class377.field5585 = 0;
                } else if (arg0[2].equals("german")) {
                    class377.field5585 = 1;
                } else {
                    class523.method3108("language", (byte) 117);
                }
            }
            class436.field6386 = false;
            class6.field81 = false;
            if (arg0[3].equals("game0")) {
                class61.field703 = class68.field872;
            } else if (arg0[3].equals("game1")) {
                class61.field703 = class51.field564;
            } else {
                class523.method3108("game", (byte) 127);
            }
            class471.field6952 = true;
            class40.field454 = true;
            class307.field4365 = "";
            class245.field3603 = 0;
            class401.field5950 = 0;
            class25.field301 = class61.field703.field6591;
            client var1 = new client();
            class164.field2319 = var1;
            var1.method208(592, false, 768, 30, 0, class61.field703.field6596, 1024, class239.field3506.method1894(false) + 32);
            class245.field3611.setLocation(40, 40);
        } catch (Exception var3) {
            class194.method1362(var3, null, 116);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method1383(int arg0, int arg1) {
        class379.field5602 = null;
        field2877++;
        class335.field4664 = null;
        if (arg0 >= -33) {
            this.method1379(-36);
        }
        class405.field6029.field2976++;
        class405.field6029.field2978 = arg1;
        class159.field2247 = 0;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method1384() {
        int var0 = class75.field1027;
        int[] var1 = class334.field4634;
        int var2 = class275.field4056 ? var0 : class232.field3410 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class121 var4;
            if (var3 < var0) {
                var4 = class384.field5647[var1[var3]];
            } else {
                var4 = class250.field3690[class173.field2454[var3 - var0]];
            }
            if (var4.field1701 >= 0) {
                int var5 = var4.method963((byte) 127);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field6335 & 0x7F) == 0 && (var4.field6334 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field6335 & 0x7F) == 64 && (var4.field6334 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class364 && var4.field1780 != null && class263.field3867 >= var4.field1780.field2262 && class263.field3867 < var4.field1780.field2274) {
                    ((class364) var4).field5088 = false;
                }
                var4.field6327 = class66.method643(var4.field6335, 51, var4.field6328, var4.field6334);
                class322.method1989(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method206(int arg0) {
        field2884++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class512.method3048(false);
        class436.field6392 = new class11(class498.field7404);
        class405.field6029 = new class204();
        if (class365.field5281 != class297.field4260) {
            class371.field5515 = new byte[50][];
        }
        class478.field7044 = new class340(class498.field7404);
        if (class365.field5281 == class297.field4260) {
            class66.field839 = this.getCodeBase().getHost();
            class354.field4947 = 43594;
            class205.field2981 = 443;
        } else if (class237.method1576(class365.field5281, (byte) -52)) {
            class66.field839 = this.getCodeBase().getHost();
            class354.field4947 = class84.field1155 + 40000;
            class205.field2981 = class84.field1155 + 50000;
        } else if (class365.field5281 == class258.field3807) {
            class354.field4947 = class84.field1155 + 40000;
            class66.field839 = "127.0.0.1";
            class205.field2981 = class84.field1155 + 50000;
        }
        class310.field4421 = class354.field4947;
        class521.field7650 = class66.field839;
        class69.field883 = class205.field2981;
        class310.field4422 = class354.field4947;
        if (class419.field6188 == 3) {
            class77.field1046 = class84.field1155;
        }
        class350.field4850 = class97.field1312 = class159.field2246 = class139.field1980 = new short[256];
        if (class61.field703 == class51.field564) {
            class20.field229 = class159.field2245;
            class473.field6981 = class379.field5598;
            class368.field5474 = 16777215;
            class51.field571 = 0;
            class223.field3272 = true;
            class223.field3270 = class352.field4872;
            class29.field363 = class157.field2235;
        } else {
            class29.field363 = class352.field4885;
            class20.field229 = class460.field6760;
            class223.field3270 = class240.field3510;
            class473.field6981 = class72.field910;
        }
        class291.field4193 = class310.field4421;
        class229.field3360 = class509.method3034((byte) 16, class148.field2081);
        class104.field1460 = class471.method2848(-54, true, class148.field2081);
        class364.field5094 = class14.method88(true);
        if (class364.field5094 != null) {
            class364.field5094.method756((byte) 93, class148.field2081);
        }
        class141.field1999 = class419.field6188;
        try {
            if (class498.field7404.field6192 != null) {
                class242.field3582 = new class385(class498.field7404.field6192, 5200, 0);
                for (int var3 = 0; var3 < 30; var3++) {
                    class476.field7014[var3] = new class385(class498.field7404.field6179[var3], 6000, 0);
                }
                class248.field3671 = new class385(class498.field7404.field6171, 6000, 0);
                class413.field6143 = new class297(255, class242.field3582, class248.field3671, 500000);
                class231.field3406 = new class385(class498.field7404.field6184, 24, 0);
                class498.field7404.field6171 = null;
                class498.field7404.field6184 = null;
                class498.field7404.field6192 = null;
                class498.field7404.field6179 = null;
            }
        } catch (IOException var4) {
            class231.field3406 = null;
            class242.field3582 = null;
            class413.field6143 = null;
            class248.field3671 = null;
        }
        if (class365.field5281 != class297.field4260) {
            class49.field547 = true;
        }
        if (arg0 != -22158) {
            this.method1388(null, (byte) 80);
        }
        class424.field6253 = (class68.field872 == class61.field703 ? class330.field4607 : class140.field1987).method2031(true, class377.field5585);
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
    public static void method1385(int arg0) {
        field2879 = null;
        if (arg0 == 9) {
            field2886 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Luu;)Luu;")
    public static final class188 method1386(class188 arg0) {
        int var1 = method1380(arg0).method1788(1861624);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class371.method2286(0, arg0.field2745);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method1387() {
        class454.field6677 = 0;
        for (int var0 = 0; var0 < class232.field3410; var0++) {
            class461 var1 = class250.field3690[class173.field2454[var0]];
            if (var1.field1711 && var1.method968((byte) 18) != -1) {
                int var2 = (var1.method963((byte) 127) - 1) * 64 + 60;
                int var3 = var1.field6335 - var2 >> 7;
                int var4 = var1.field6334 - var2 >> 7;
                class121 var5 = class52.method514(var4, var3, (byte) 119, var1.field6328);
                if (var5 != null) {
                    int var6 = var5.field1716;
                    if (var5 instanceof class461) {
                        var6 += 2048;
                    }
                    if (var5.field1756 == 0 && var5.method968((byte) 18) != -1) {
                        class413.field6128[class454.field6677] = var6;
                        class244.field3594[class454.field6677] = var6;
                        class454.field6677++;
                        var5.field1756++;
                    }
                    class413.field6128[class454.field6677] = var6;
                    class244.field3594[class454.field6677] = var1.field1716 + 2048;
                    class454.field6677++;
                    var5.field1756++;
                }
            }
        }
        class12.method81(class244.field3594, 0, class413.field6128, class454.field6677 - 1, 0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BB)V")
    private final void method1388(byte[] arg0, byte arg1) {
        field2871++;
        class65 var3 = new class65(arg0);
        if (arg1 != 40) {
            return;
        }
        while (true) {
            int var4;
            label47: do {
                while (true) {
                    while (true) {
                        var4 = var3.method577(255);
                        if (var4 == 0) {
                            return;
                        }
                        if (var4 == 1) {
                            int[] var9 = class154.field2184 = new int[6];
                            var9[0] = var3.method623((byte) -89);
                            var9[1] = var3.method623((byte) -117);
                            var9[2] = var3.method623((byte) 116);
                            var9[3] = var3.method623((byte) -84);
                            var9[4] = var3.method623((byte) 90);
                            var9[5] = var3.method623((byte) 106);
                        } else {
                            if (var4 != 4) {
                                continue label47;
                            }
                            int var7 = var3.method577(255);
                            class221.field3175 = new int[var7];
                            for (int var8 = 0; var8 < var7; var8++) {
                                class221.field3175[var8] = var3.method623((byte) -43);
                                if (class221.field3175[var8] == 65535) {
                                    class221.field3175[var8] = -1;
                                }
                            }
                        }
                    }
                }
            } while (var4 != 5);
            int var5 = var3.method577(255);
            class497.field7391 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                class497.field7391[var6] = var3.method623((byte) -44);
                if (class497.field7391[var6] == 65535) {
                    class497.field7391[var6] = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method1389() {
        for (int var0 = 0; var0 < class397.field5828; var0++) {
            int[] var1 = class323.field4549[var0];
            for (int var2 = 0; var2 < class457.field6713; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(I)V")
    private final void method1390(int arg0) {
        field2881++;
        if (!class478.field7044.field3338) {
            for (int var2 = 0; var2 < class484.field7122; var2++) {
                if (class386.field5678[var2].method704(arg0 ^ 0x5B66) == 's' || class386.field5678[var2].method704(2) == 'S') {
                    class478.field7044.field3338 = true;
                    break;
                }
            }
        }
        if (class435.field6374 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class437.method2644(-101);
            if (class450.field6639 == 0L) {
                class450.field6639 = var5;
            }
            if (var4 > 16384 && (var5 - class450.field6639) < 5000L) {
                if (var5 - class14.field162 > 1000L) {
                    System.gc();
                    class14.field162 = var5;
                }
                class263.field3863 = class84.field1154.method2031(true, class377.field5585);
                class264.field3869 = 5;
            } else {
                class263.field3863 = class263.field3868.method2031(true, class377.field5585);
                class435.field6374 = 10;
                class264.field3869 = 5;
            }
        } else if (class435.field6374 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class455.field6684[var7] = class280.method1797((byte) -118, class457.field6713, class397.field5828);
            }
            class263.field3863 = class215.field3096.method2031(true, class377.field5585);
            class264.field3869 = 10;
            class435.field6374 = 20;
        } else if (class435.field6374 == 20) {
            if (class194.field2831 == null) {
                class194.field2831 = new class162(class405.field6029, class436.field6392);
            }
            if (class194.field2831.method1137(true)) {
                class391.field5757 = class162.method1143(false, 0, true, 44, 1);
                class322.field4533 = class162.method1143(false, 1, true, arg0 - 23292, 1);
                class3.field44 = class162.method1143(false, 2, true, 93, 1);
                class196.field2868 = class162.method1143(false, 3, true, 58, 1);
                class283.field4117 = class162.method1143(false, 4, true, 60, 1);
                class91.field1256 = class162.method1143(true, 5, true, arg0 ^ 0x5B0D, 1);
                class512.field7556 = class162.method1143(true, 6, false, arg0 ^ 0x5B2F, 1);
                class62.field726 = class162.method1143(false, 7, true, 62, 1);
                class240.field3533 = class162.method1143(false, 8, true, arg0 - 23296, 1);
                class68.field879 = class162.method1143(false, 9, true, 89, 1);
                class242.field3579 = class162.method1143(false, 10, true, arg0 - 23321, 1);
                class279.field4087 = class162.method1143(false, 11, true, 56, 1);
                class82.field1116 = class162.method1143(false, 12, true, 71, 1);
                class55.field584 = class162.method1143(false, 13, true, 97, 1);
                class129.field1865 = class162.method1143(false, 14, false, arg0 - 23274, 1);
                class233.field3429 = class162.method1143(false, 15, true, 59, 1);
                class305.field4337 = class162.method1143(false, 16, true, 102, 1);
                class126.field1843 = class162.method1143(false, 17, true, arg0 - 23322, 1);
                class193.field2807 = class162.method1143(false, 18, true, 91, 1);
                class192.field2806 = class162.method1143(false, 19, true, 121, 1);
                class8.field94 = class162.method1143(false, 20, true, 99, 1);
                class355.field4952 = class162.method1143(false, 21, true, arg0 ^ 0x5B37, 1);
                class495.field7251 = class162.method1143(false, 22, true, 70, 1);
                class161.field2270 = class162.method1143(true, 23, true, arg0 - 23309, 1);
                class275.field4059 = class162.method1143(false, 24, true, arg0 - 23269, 1);
                class109.field1549 = class162.method1143(false, 25, true, arg0 ^ 0x5B4F, 1);
                class263.field3865 = class162.method1143(true, 26, true, 90, 1);
                class131.field1907 = class162.method1143(false, 27, true, arg0 ^ 0x5B4F, 1);
                class479.field7046 = class162.method1143(true, 28, true, 86, 1);
                class186.field2600 = class162.method1143(false, 29, true, 92, 1);
                class263.field3863 = class521.field7655.method2031(true, class377.field5585);
                class264.field3869 = 15;
                class435.field6374 = 30;
            } else {
                class263.field3863 = class75.field1022.method2031(true, class377.field5585);
                class264.field3869 = 12;
            }
        } else if (class435.field6374 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 30; var9++) {
                var8 += class4.field64[var9].method1913(-1398) * class531.field7823[var9] / 100;
            }
            if (var8 == 100) {
                class263.field3863 = class235.field3443.method2031(true, class377.field5585);
                class264.field3869 = 20;
                class57.method529((byte) 80, class240.field3533);
                class158.method1126(class240.field3533, 14564);
                class435.field6374 = 40;
            } else {
                if (var8 != 0) {
                    class263.field3863 = class141.field1995.method2031(true, class377.field5585) + var8 + "%";
                }
                class264.field3869 = 20;
            }
        } else if (class435.field6374 == 40) {
            if (class479.field7046.method2375(0)) {
                this.method1388(class479.field7046.method2381(1, -1), (byte) 40);
                class263.field3863 = class180.field2538.method2031(true, class377.field5585);
                class264.field3869 = 25;
                class435.field6374 = 50;
            } else {
                class263.field3863 = class323.field4543.method2031(true, class377.field5585) + class479.field7046.method2371(false) + "%";
                class264.field3869 = 25;
            }
        } else if (class435.field6374 == 50) {
            class37.method284((byte) 6);
            class263.field3863 = class523.field7686.method2031(true, class377.field5585);
            class264.field3869 = 30;
            class435.field6374 = 60;
        } else if (class435.field6374 == 60) {
            int var10 = class270.method1732((byte) -88, class55.field584, class240.field3533);
            int var11 = class26.method222(51);
            if (var10 < var11) {
                class263.field3863 = class106.field1471.method2031(true, class377.field5585) + var10 * 100 / var11 + "%";
                class264.field3869 = 35;
            } else {
                class263.field3863 = class122.field1786.method2031(true, class377.field5585);
                class435.field6374 = 70;
                class264.field3869 = 35;
            }
        } else if (class435.field6374 == 70) {
            int var12 = class69.method664(class240.field3533, -125);
            int var13 = class391.method2401(arg0 ^ 0xFFFFA4FD);
            if (var13 > var12) {
                class263.field3863 = class319.field4520.method2031(true, class377.field5585) + var12 * 100 / var13 + "%";
                class264.field3869 = 40;
            } else {
                class263.field3863 = class319.field4517.method2031(true, class377.field5585);
                class435.field6374 = 80;
                class264.field3869 = 40;
            }
        } else if (class435.field6374 == 80) {
            if (class263.field3865.method2375(arg0 ^ 0x5B64)) {
                class467.field6850 = new class509(class263.field3865, class68.field879, class240.field3533);
                class263.field3863 = class483.field7100.method2031(true, class377.field5585);
                class264.field3869 = 45;
                class435.field6374 = 90;
            } else {
                class263.field3863 = class497.field7381.method2031(true, class377.field5585) + class263.field3865.method2371(false) + "%";
                class264.field3869 = 45;
            }
        } else if (arg0 == 23396) {
            if (class435.field6374 == 90) {
                class263.field3863 = class101.field1422.method2031(true, class377.field5585);
                class264.field3869 = 50;
                class435.field6374 = 95;
            } else if (class435.field6374 == 95) {
                if (class478.field7044.field3338) {
                    class478.field7044.field3337 = 0;
                    class478.field7044.field3347 = 1;
                    class478.field7044.field3335 = 0;
                    class478.field7044.field3345 = 0;
                    class478.field7044.field3328 = 0;
                }
                class478.field7044.field3338 = true;
                class478.field7044.method2067(class498.field7404, (byte) -128);
                class89.method787(-27345, false, class478.field7044.field3345);
                class263.field3863 = class296.field4251.method2031(true, class377.field5585);
                class264.field3869 = 55;
                class435.field6374 = 100;
            } else if (class435.field6374 == 100) {
                class17.method132(class225.field3300, class240.field3533, 73, class55.field584);
                class263.field3863 = class428.field6305.method2031(true, class377.field5585);
                class264.field3869 = 60;
                class432.method2619((byte) 32, 5);
                class435.field6374 = 110;
            } else if (class435.field6374 == 110) {
                class3.field44.method2375(arg0 - 23396);
                byte var14 = 0;
                int var15 = var14 + class3.field44.method2371(false);
                class305.field4337.method2375(arg0 - 23396);
                int var16 = var15 + class305.field4337.method2371(false);
                class126.field1843.method2375(0);
                int var17 = var16 + class126.field1843.method2371(false);
                class193.field2807.method2375(0);
                int var18 = var17 + class193.field2807.method2371(false);
                class192.field2806.method2375(0);
                int var19 = var18 + class192.field2806.method2371(false);
                class8.field94.method2375(0);
                int var20 = var19 + class8.field94.method2371(false);
                class355.field4952.method2375(0);
                int var21 = var20 + class355.field4952.method2371(false);
                class495.field7251.method2375(0);
                int var22 = var21 + class495.field7251.method2371(false);
                class275.field4059.method2375(0);
                int var23 = var22 + class275.field4059.method2371(false);
                class109.field1549.method2375(arg0 - 23396);
                int var24 = var23 + class109.field1549.method2371(false);
                class131.field1907.method2375(0);
                int var25 = var24 + class131.field1907.method2371(false);
                class186.field2600.method2375(0);
                int var26 = var25 + class186.field2600.method2371(false);
                if (var26 < 1200) {
                    class263.field3863 = class450.field6624.method2031(true, class377.field5585) + var26 / 12 + "%";
                    class264.field3869 = 65;
                } else {
                    class215.field3100 = new class454(class61.field703, class377.field5585, class3.field44);
                    class284.field4134 = new class407(class61.field703, class377.field5585, class3.field44);
                    class387.field5733 = new class167(class61.field703, class377.field5585, class3.field44, class240.field3533);
                    class342.field4735 = new class227(class61.field703, class377.field5585, class126.field1843);
                    class109.field1547 = new class485(class61.field703, class377.field5585, class3.field44);
                    class500.field7422 = new class312(class61.field703, class377.field5585, class3.field44);
                    class104.field1458 = new class60(class61.field703, class377.field5585, class3.field44, class62.field726);
                    class156.field2223 = new class212(class61.field703, class377.field5585, class3.field44);
                    class171.field2434 = new class506(class61.field703, class377.field5585, class3.field44);
                    class384.field5645 = new class89(class61.field703, class377.field5585, true, class305.field4337, class62.field726);
                    class175.field2483 = new class99(class61.field703, class377.field5585, class3.field44, class240.field3533);
                    class504.field7479 = new class325(class61.field703, class377.field5585, class3.field44, class240.field3533);
                    class515.field7587 = new class171(class61.field703, class377.field5585, true, class193.field2807, class62.field726);
                    class270.field3995 = new class2(class61.field703, class377.field5585, true, class215.field3100, class192.field2806, class62.field726);
                    class11.field128 = new class233(class61.field703, class377.field5585, class3.field44);
                    class153.field2169 = new class238(class61.field703, class377.field5585, class8.field94, class391.field5757, class322.field4533);
                    class428.field6311 = new class443(class61.field703, class377.field5585, class3.field44);
                    class172.field2451 = new class193(class61.field703, class377.field5585, class3.field44);
                    class151.field2145 = new class351(class61.field703, class377.field5585, class355.field4952, class62.field726);
                    class348.field4829 = new class9(class61.field703, class377.field5585, class3.field44);
                    class110.field1554 = new class332(class61.field703, class377.field5585, class3.field44);
                    class122.field1790 = new class250(class61.field703, class377.field5585, class3.field44);
                    class29.field357 = new class262(class61.field703, class377.field5585, class495.field7251);
                    class276.field4060 = new class468(class61.field703, class377.field5585, class3.field44);
                    class100.method860(-1, class196.field2868, class55.field584, class62.field726, class240.field3533);
                    class290.method1831(class186.field2600, 23028);
                    class311.field4442 = new class349(class377.field5585, class275.field4059, class109.field1549);
                    class95.field1280 = new class383(class377.field5585, class275.field4059, class109.field1549, new class347());
                    class263.field3863 = class80.field1064.method2031(true, class377.field5585);
                    class264.field3869 = 65;
                    class482.method2909(arg0 ^ 0xFFFFA4E6);
                    class384.field5645.method788((byte) 114, !class478.field7044.method2072(class65.field802, 107));
                    class253.field3739 = new class455();
                    class4.method36(-7);
                    class274.method1763(-117, class131.field1907);
                    class148.method1072(class62.field726, class467.field6850, (byte) -62);
                    class435.field6374 = 120;
                }
            } else if (class435.field6374 == 120) {
                int var27 = class221.method1504(arg0 ^ 0x5B1D, class240.field3533);
                int var28 = class166.method1173(-41);
                if (var27 < var28) {
                    class263.field3863 = class379.field5599.method2031(true, class377.field5585) + var27 * 100 / var28 + "%";
                    class264.field3869 = 70;
                } else {
                    class69.method663(class240.field3533, false, class225.field3300);
                    class322.method1991(class32.field374, 10);
                    class263.field3863 = class192.field2803.method2031(true, class377.field5585);
                    class435.field6374 = 130;
                    class264.field3869 = 70;
                }
            } else if (class435.field6374 == 130) {
                if (class242.field3579.method2382(0, "", "huffman")) {
                    class432 var29 = new class432(class242.field3579.method2368("huffman", false, ""));
                    class73.method694((byte) -47, var29);
                    class263.field3863 = class472.field6969.method2031(true, class377.field5585);
                    class264.field3869 = 75;
                    class435.field6374 = 140;
                } else {
                    class263.field3863 = class98.field1316.method2031(true, class377.field5585) + "0%";
                    class264.field3869 = 75;
                }
            } else if (class435.field6374 == 140) {
                if (class196.field2868.method2375(0)) {
                    class263.field3863 = class315.field4481.method2031(true, class377.field5585);
                    class435.field6374 = 150;
                    class264.field3869 = 80;
                } else {
                    class263.field3863 = class297.field4266.method2031(true, class377.field5585) + class196.field2868.method2371(false) + "%";
                    class264.field3869 = 80;
                }
            } else if (class435.field6374 == 150) {
                if (class82.field1116.method2375(0)) {
                    class263.field3863 = class27.field323.method2031(true, class377.field5585);
                    class435.field6374 = 160;
                    class264.field3869 = 82;
                } else {
                    class263.field3863 = class194.field2827.method2031(true, class377.field5585) + class82.field1116.method2371(false) + "%";
                    class264.field3869 = 82;
                }
            } else if (class435.field6374 == 160) {
                if (class55.field584.method2375(arg0 ^ 0x5B64)) {
                    class263.field3863 = class371.field5523.method2031(true, class377.field5585);
                    class435.field6374 = 170;
                    class264.field3869 = 85;
                } else {
                    class263.field3863 = class371.field5523.method2031(true, class377.field5585) + class55.field584.method2371(false) + "%";
                    class264.field3869 = 85;
                }
            } else if (class435.field6374 == 170) {
                if (class161.field2270.method2362(-1, "details")) {
                    class399.method2461(class161.field2270, class109.field1547, class500.field7422, class384.field5645, class175.field2483, class504.field7479, class253.field3739);
                    class263.field3863 = class405.field6003.method2031(true, class377.field5585);
                    class435.field6374 = 180;
                    class264.field3869 = 89;
                } else {
                    class263.field3863 = class339.field4702.method2031(true, class377.field5585) + class161.field2270.method2372("details", (byte) 33) + "%";
                    class264.field3869 = 87;
                }
            } else if (class435.field6374 == 180) {
                int var30 = class518.method3082(3);
                if (var30 == -1) {
                    class263.field3863 = class348.field4830.method2031(true, class377.field5585);
                    class264.field3869 = 90;
                } else if (var30 == 7 || var30 == 9) {
                    this.method194(127, "worldlistfull");
                    class432.method2619((byte) 67, 1000);
                } else if (class194.field2830) {
                    class263.field3863 = class4.field65.method2031(true, class377.field5585);
                    class435.field6374 = 190;
                    class264.field3869 = 90;
                } else {
                    this.method194(127, "worldlistio_" + var30);
                    class432.method2619((byte) -117, 1000);
                }
            } else if (class435.field6374 == 190) {
                class162.field2292 = new String[class110.field1554.field4627];
                class450.field6635 = new boolean[class122.field1790.field3679];
                class290.field4169 = new int[class122.field1790.field3679];
                for (int var31 = 0; var31 < class122.field1790.field3679; var31++) {
                    if (class122.field1790.method1629(125, var31).field1591 == 0) {
                        class450.field6635[var31] = true;
                        class330.field4604++;
                    }
                    class290.field4169[var31] = -1;
                }
                class257.method1651((byte) 14);
                class530.field7769 = class196.field2868.method2358("loginscreen", (byte) -112);
                class91.field1256.method2387(false, 4, true);
                class512.field7556.method2387(true, 4, true);
                class240.field3533.method2387(true, 4, true);
                class55.field584.method2387(true, 4, true);
                class242.field3579.method2387(true, 4, true);
                class196.field2868.method2387(true, 4, true);
                class3.field44.field5709 = 2;
                class261.field3852 = true;
                class126.field1843.field5709 = 2;
                class305.field4337.field5709 = 2;
                class193.field2807.field5709 = 2;
                class192.field2806.field5709 = 2;
                class8.field94.field5709 = 2;
                class355.field4952.field5709 = 2;
                class76.method711(class478.field7044.field3347, -1, -1, false, false);
                class263.field3863 = class146.field2038.method2031(true, class377.field5585);
                class264.field3869 = 95;
                class435.field6374 = 200;
            } else if (class435.field6374 == 200) {
                class140.method1046(true, 68);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "()V")
    public static final void method1391() {
        int var0 = class75.field1027;
        int[] var1 = class334.field4634;
        boolean var2 = class478.field7044.field3327 == 1 && var0 > 200 || class478.field7044.field3327 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class364 var12 = class384.field5647[var1[var3]];
            if (var12.method2171(109)) {
                var12.method885(11264);
                if (var12.field6332 >= 0 && var12.field6339 >= 0 && var12.field6340 < class397.field5828 && var12.field6337 < class457.field6713) {
                    var12.field5088 = var12.field1743 ? var2 : false;
                    if (class435.field6375 == var12) {
                        var12.field1701 = Integer.MAX_VALUE;
                    } else {
                        int var13 = 0;
                        if (!var12.field1711) {
                            var13++;
                        }
                        if (var12.field1757 > class263.field3867) {
                            var13 += 2;
                        }
                        int var14 = var13 + (5 - var12.method963((byte) 127) << 2);
                        if (var12.field5063) {
                            var14 += 512;
                        } else {
                            if (class330.field4593 == 0) {
                                var14 += 32;
                            } else {
                                var14 += 128;
                            }
                            var14 += 256;
                        }
                        var12.field1701 = var14 + 1;
                    }
                } else {
                    var12.field1701 = -1;
                }
            } else {
                var12.field1701 = -1;
            }
        }
        for (int var4 = 0; var4 < class232.field3410; var4++) {
            class461 var9 = class250.field3690[class173.field2454[var4]];
            if (var9.method2767(113) && var9.field6790.method846(class253.field3739, -14095)) {
                var9.method885(11264);
                if (var9.field6332 >= 0 && var9.field6339 >= 0 && var9.field6340 < class397.field5828 && var9.field6337 < class457.field6713) {
                    int var10 = 0;
                    if (!var9.field1711) {
                        var10++;
                    }
                    if (var9.field1757 > class263.field3867) {
                        var10 += 2;
                    }
                    int var11 = var10 + (5 - var9.method963((byte) 127) << 2);
                    if (class330.field4593 == 0) {
                        if (var9.field6790.field1411) {
                            var11 += 64;
                        } else {
                            var11 += 128;
                        }
                    } else if (class330.field4593 == 1) {
                        if (var9.field6790.field1411) {
                            var11 += 32;
                        } else {
                            var11 += 64;
                        }
                    }
                    if (var9.field6790.field1351) {
                        var11 += 1024;
                    } else if (!var9.field6790.field1341) {
                        var11 += 256;
                    }
                    var9.field1701 = var11 + 1;
                } else {
                    var9.field1701 = -1;
                }
            } else {
                var9.field1701 = -1;
            }
        }
        for (int var5 = 0; var5 < class133.field1922.length; var5++) {
            class452 var6 = class133.field1922[var5];
            if (var6 != null) {
                if (var6.field6652 == 1) {
                    class461 var7 = class250.field3690[var6.field6645];
                    if (var7 != null && var7.field1701 >= 0) {
                        var7.field1701 += 2048;
                    }
                } else if (var6.field6652 == 10) {
                    class364 var8 = class384.field5647[var6.field6645];
                    if (var8 != null && class435.field6375 != var8 && var8.field1701 >= 0) {
                        var8.field1701 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    private final void method1392(byte arg0) {
        field2872++;
        boolean var2 = class405.field6029.method1425(-118);
        if (arg0 < -30 && !var2) {
            this.method1373(3000);
        }
    }
}
