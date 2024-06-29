import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class96 {

    @OriginalMember(owner = "client!client", name = "S", descriptor = "Lub;")
    public static class227 field1428 = class257.method1749(")4a=", 17263);

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field1431 = 4;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "[I")
    public static int[] field1438 = new int[field1431];

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field1439 = 0;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "[[Lne;")
    public static class116[][] field1437 = new class116[field1431][500];

    @OriginalMember(owner = "client!client", name = "O", descriptor = "Lwg;")
    public static class98 field1424 = new class98(0, 0);

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "Lub;")
    private static class227 field1446 = class257.method1749("green:", 17263);

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Lub;")
    public static class227 field1448 = field1446;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "Lub;")
    public static class227 field1445 = field1446;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "Z")
    public static boolean field1450 = true;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field1451 = 0;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Ln;")
    public static class138 field1449;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "Z")
    public static boolean field1452;

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    private final void method487(int arg0) {
        field1443++;
        boolean var2 = class44.method236(0);
        if (!var2) {
            this.method492(0);
        }
        if (arg0 != -1) {
            this.method497(-122);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method488(boolean arg0) {
        field1441++;
        class97.method600(class61.field1123, class241.field4190, (byte) 26);
        class177.field2945 = class169.field2832 == 0 ? 43594 : class131.field2286 + 40000;
        if (arg0) {
            field1450 = false;
        }
        if (class106.field2001 == 1) {
            class205.field3487 = class226.field3908;
            class207.field3515 = class141.field2429;
            class222.field3761 = class221.field3750;
            class201.field3451 = class166.field2776;
        } else {
            class222.field3761 = class140.field2417;
            class207.field3515 = class146.field2510;
            class201.field3451 = class71.field1255;
            class205.field3487 = class194.field3306;
        }
        class166.field2775 = class67.field1211 = class211.field3572 = class201.field3457 = new short[256];
        class104.field1822 = class169.field2832 == 0 ? 443 : class131.field2286 + 50000;
        class9.field168 = class177.field2945;
        class102.method625(120);
        class116.method734((byte) 49, class172.field2875);
        class64.method406(class172.field2875, -117);
        class19.field323 = class197.method1265((byte) -15);
        if (class19.field323 != null) {
            class19.field323.method890((byte) -127, class172.field2875);
        }
        class19.field321 = class239.field4149;
        try {
            if (class61.field1123.field4157 != null) {
                class75.field1310 = new class32(class61.field1123.field4157, 5200, 0);
                for (int var2 = 0; var2 < 27; var2++) {
                    class7.field157[var2] = new class32(class61.field1123.field4165[var2], 6000, 0);
                }
                class58.field1079 = new class32(class61.field1123.field4168, 6000, 0);
                class152.field2641 = new class192(255, class75.field1310, class58.field1079, 500000);
                class16.field295 = new class32(class61.field1123.field4150, 24, 0);
                class61.field1123.field4150 = null;
                class61.field1123.field4165 = null;
                class61.field1123.field4157 = null;
                class61.field1123.field4168 = null;
            }
        } catch (IOException var3) {
            class58.field1079 = null;
            class16.field295 = null;
            class75.field1310 = null;
            class152.field2641 = null;
        }
        if (class169.field2832 != 0) {
            class99.field1731 = true;
        }
        class65.field1191 = class46.field819;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method489(boolean arg0) {
        field1427++;
        if (class184.field3139 == 1000) {
            return;
        }
        if (!arg0) {
            field1424 = null;
        }
        boolean var2 = class200.method1287(11);
        if (var2 && class171.field2869 && class77.field1360 != null) {
            class77.field1360.method1329(true);
        }
        if (class5.field114 && (class184.field3139 == 30 || class184.field3139 == 10)) {
            class114.method721(96);
        }
        boolean var3 = false;
        if (class174.field2903) {
            class174.field2903 = false;
            var3 = true;
        }
        if (class184.field3139 == 0) {
            class36.method190(class120.field2184, class7.field153, (Color) null, var3, 832);
        } else if (class184.field3139 == 5) {
            class54.method314(class260.field4532, -97);
        } else if (class184.field3139 == 10) {
            class174.method1114((byte) -54);
        } else if (class184.field3139 == 25 || class184.field3139 == 28) {
            if (class108.field2011 == 1) {
                if (class88.field1533 > class138.field2405) {
                    class138.field2405 = class88.field1533;
                }
                int var4 = (class138.field2405 - class88.field1533) * 50 / class138.field2405;
                class215.method1367(false, class76.method445((byte) 87, new class227[] { class245.field4271, class197.field3376, class204.method1303(var4, 1), class44.field725 }), (byte) -111);
            } else if (class108.field2011 == 2) {
                if (class211.field3569 > class65.field1186) {
                    class65.field1186 = class211.field3569;
                }
                int var5 = (class65.field1186 - class211.field3569) * 50 / class65.field1186 + 50;
                class215.method1367(false, class76.method445((byte) 82, new class227[] { class245.field4271, class197.field3376, class204.method1303(var5, 1), class44.field725 }), (byte) -110);
            } else {
                class215.method1367(false, class245.field4271, (byte) -124);
            }
        } else if (class184.field3139 == 30) {
            class27.method135(-56);
        } else if (class184.field3139 == 40) {
            class215.method1367(false, class76.method445((byte) -78, new class227[] { class173.field2888, class168.field2811, class232.field4048 }), (byte) -114);
        }
        if ((class184.field3139 == 30 || class184.field3139 == 10) && class22.field389 == 0 && !var3) {
            try {
                Graphics var6 = class172.field2875.getGraphics();
                for (int var7 = 0; var7 < class140.field2421; var7++) {
                    if (class79.field1379[var7]) {
                        class14.field263.method718(class36.field599[var7], var6, (byte) -52, class54.field940[var7], class18.field317[var7], class116.field2137[var7]);
                        class79.field1379[var7] = false;
                    }
                }
            } catch (Exception var13) {
                class172.field2875.repaint();
            }
        } else if (class184.field3139 != 0) {
            try {
                Graphics var8 = class172.field2875.getGraphics();
                class14.field263.method719(0, 0, var8, 3108);
                for (int var9 = 0; var9 < class140.field2421; var9++) {
                    class79.field1379[var9] = false;
                }
            } catch (Exception var12) {
                class172.field2875.repaint();
            }
        }
        if (class215.field3631) {
            class208.method1327(5);
        }
        if (class97.field1706 != null && class4.field91 != 0) {
            Point var10 = class172.field2875.getLocationOnScreen();
            Dimension var11 = class172.field2875.getSize();
            class97.field1706.set_position(var10.x, var10.y - class4.field91, var11.width, class4.field91);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field1430++;
        if (!this.method592((byte) -127)) {
            return;
        }
        class131.field2286 = Integer.parseInt(this.getParameter("worldid"));
        class132.field2300 = Integer.parseInt(this.getParameter("modewhat"));
        class169.field2832 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("safemode");
        if (var1 != null && var1.equals("1")) {
            class241.field4190 = true;
        } else {
            class241.field4190 = false;
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class58.field1072 = true;
        } else {
            class58.field1072 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class252.method1682((byte) 94);
            class214.field3612 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class106.field2001 = 1;
        } else {
            class106.field2001 = 0;
        }
        try {
            class171.field2856 = Integer.parseInt(this.getParameter("js"));
            class192.field3274 = Integer.parseInt(this.getParameter("plug"));
            class64.field1172 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var10) {
        }
        class9.field167 = class14.field261.method1513(this, -98);
        if (class9.field167 == null) {
            class9.field167 = class91.field1558;
        }
        String var5 = this.getParameter("advert");
        if (var5 != null) {
            byte[] var6;
            try {
                var6 = var5.getBytes("ISO-8859-1");
            } catch (UnsupportedEncodingException var9) {
                var6 = var5.getBytes();
            }
            class227 var7 = class102.method623(0, -1, var6, var6.length);
            boolean var8 = class185.method1178((byte) 28, var7);
            if (var8) {
                class213.field3603 = var7;
            }
        }
        class123.field2218 = this.getCodeBase().getHost();
        this.method593(503, class132.field2300 + 32, 504, -7101, 765);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    private final void method490(boolean arg0) {
        field1425++;
        class87.method523(this, (byte) 110);
        for (class181.field3097 = 0; class252.method1687(82) && class181.field3097 < 128; class181.field3097++) {
            class103.field1805[class181.field3097] = class99.field1721;
            class241.field4194[class181.field3097] = class143.field2457;
        }
        class85.field1481++;
        if (class116.field2131 != -1) {
            class238.method1585(0, 0, class49.field867, class208.field3538, 65, 0, 0, class116.field2131);
        }
        if (!arg0) {
            field1448 = null;
        }
        class77.field1356++;
        class67.method417(-113);
        while (true) {
            class34 var2;
            class105 var3;
            class105 var4;
            do {
                var2 = (class34) class101.field1779.method1269((byte) 125);
                if (var2 == null) {
                    while (true) {
                        class34 var5;
                        class105 var6;
                        class105 var7;
                        do {
                            var5 = (class34) class88.field1522.method1269((byte) 126);
                            if (var5 == null) {
                                while (true) {
                                    class34 var8;
                                    class105 var9;
                                    class105 var10;
                                    do {
                                        var8 = (class34) class15.field281.method1269((byte) -2);
                                        if (var8 == null) {
                                            if (class10.field194 != null) {
                                                class7.method30(true);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field583;
                                        if (var9.field1884 < 0) {
                                            break;
                                        }
                                        var10 = class27.method137(var9.field1968, -954490064);
                                    } while (var10 == null || var10.field1956 == null || var9.field1884 >= var10.field1956.length || var10.field1956[var9.field1884] != var9);
                                    class218.method1377(var8, false);
                                }
                            }
                            var6 = var5.field583;
                            if (var6.field1884 < 0) {
                                break;
                            }
                            var7 = class27.method137(var6.field1968, -954490064);
                        } while (var7 == null || var7.field1956 == null || var6.field1884 >= var7.field1956.length || var7.field1956[var6.field1884] != var6);
                        class218.method1377(var5, false);
                    }
                }
                var3 = var2.field583;
                if (var3.field1884 < 0) {
                    break;
                }
                var4 = class27.method137(var3.field1968, -954490064);
            } while (var4 == null || var4.field1956 == null || var4.field1956.length <= var3.field1884 || var4.field1956[var3.field1884] != var3);
            class218.method1377(var2, false);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lta;)Z")
    public static final boolean method491(class105 arg0) {
        if (class50.field882) {
            if (method494(arg0) != 0) {
                return false;
            }
            if (arg0.field1829 == 0) {
                return false;
            }
        }
        return arg0.field1860;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    private final void method492(int arg0) {
        field1436++;
        if (class57.field1044 >= 4) {
            this.method597("js5crc", true);
            class184.field3139 = 1000;
            return;
        }
        if (class29.field469 >= 4) {
            if (class184.field3139 == 0 || class184.field3139 == 5) {
                this.method597("js5io", true);
                class184.field3139 = 1000;
                return;
            }
            class16.field297 = 3000;
            class29.field469 = 3;
        }
        if ((class16.field297--) > 0) {
            return;
        }
        try {
            if (class98.field1716 == arg0) {
                class4.field89 = class61.field1123.method1602(class9.field168, false, class123.field2218);
                class98.field1716++;
            }
            if (class98.field1716 == 1) {
                if (class4.field89.field1302 == 2) {
                    this.method498(arg0 + 20, -1);
                    return;
                }
                if (class4.field89.field1302 == 1) {
                    class98.field1716++;
                }
            }
            if (class98.field1716 == 2) {
                class24.field402 = new class20((Socket) class4.field89.field1299, class61.field1123);
                class226 var2 = new class226(5);
                var2.method1443(15, 0);
                var2.method1427(504, (byte) -114);
                class24.field402.method94(5, (byte) -24, var2.field3901, 0);
                class98.field1716++;
                class116.field2117 = class12.method57(-107);
            }
            if (class98.field1716 == 3) {
                if (class184.field3139 == 0 || class184.field3139 == 5 || class24.field402.method93(arg0) > 0) {
                    int var3 = class24.field402.method98((byte) 82);
                    if (var3 != 0) {
                        this.method498(20, var3);
                        return;
                    }
                    class98.field1716++;
                } else if ((class12.method57(-84) - class116.field2117) > 30000L) {
                    this.method498(20, -2);
                    return;
                }
            }
            if (class98.field1716 == 4) {
                boolean var4 = class184.field3139 == 5 || class184.field3139 == 10 || class184.field3139 == 28;
                class21.method102(!var4, class24.field402, 0);
                class4.field89 = null;
                class43.field722 = 0;
                class24.field402 = null;
                class98.field1716 = 0;
            }
        } catch (IOException var5) {
            this.method498(20, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)I")
    public static final int method493(int arg0, boolean arg1) {
        field1444++;
        class152 var2 = class175.method1119(128, arg0);
        int var3 = var2.field2647;
        if (!arg1) {
            field1428 = null;
        }
        int var4 = var2.field2640;
        int var5 = var2.field2642;
        int var6 = class200.field3425[var5 - var4];
        return var6 & class139.field2416[var3] >> var4;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lta;)I")
    public static final int method494(class105 arg0) {
        class216 var1 = (class216) class184.field3133.method1298(-110, ((long) arg0.field1861 << 32) + (long) arg0.field1884);
        return var1 == null ? arg0.field1911 : var1.field3637;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lta;IIIIIII)V")
    public static final void method495(class105[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class105 var9 = arg0[var8];
            if (var9 != null && var9.field1968 == arg1 && (!var9.field1853 || var9.field1829 == 0 || var9.field1964 || method494(var9) != 0 || class232.field4044 == var9 || var9.field1975 == 1338) && (!var9.field1853 || !method491(var9))) {
                int var10 = var9.field1941 + arg6;
                int var11 = var9.field1950 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field1829 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field1977 + var10;
                    int var17 = var9.field1952 + var11;
                    if (var9.field1829 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class10.field194 == var9) {
                    class229.field4000 = true;
                    class38.field625 = var10;
                    class45.field781 = var11;
                }
                if (!var9.field1853 || var12 < var14 && var13 < var15) {
                    if (var9.field1829 == 0) {
                        if (!var9.field1853 && method491(var9) && class132.field2297 != var9) {
                            continue;
                        }
                        if (var9.field1895 && class100.field1752 >= var12 && field1451 >= var13 && class100.field1752 < var14 && field1451 < var15) {
                            for (class34 var18 = (class34) class15.field281.method1277(121); var18 != null; var18 = (class34) class15.field281.method1271(250)) {
                                if (var18.field573) {
                                    var18.method369(125);
                                }
                            }
                            if (class212.field3584 == 0) {
                                class10.field194 = null;
                                class232.field4044 = null;
                            }
                            class115.field2109 = false;
                        }
                    }
                    if (var9.field1853) {
                        boolean var19;
                        if (class100.field1752 >= var12 && field1451 >= var13 && class100.field1752 < var14 && field1451 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class122.field2197 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class50.field885 == 1 && class232.field4043 >= var12 && class81.field1403 >= var13 && class232.field4043 < var14 && class81.field1403 < var15) {
                            var21 = true;
                        }
                        if (class181.field3097 > 0 && var9.field1960 != null) {
                            for (int var22 = 0; var22 < var9.field1960.length; var22++) {
                                for (int var23 = 0; var23 < class181.field3097; var23++) {
                                    int var24 = var9.field1960[var22] & 0xFF;
                                    if (class103.field1805[var23] == var24) {
                                        class11.method51(-1, (byte) 40, class91.field1558, var22 + 1, var9.field1861);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class228.method1539(class81.field1403 - var11, var9, class232.field4043 - var10, (byte) -126);
                        }
                        if (class10.field194 != null && class10.field194 != var9 && var19 && class89.method530(method494(var9), false)) {
                            class255.field4475 = var9;
                        }
                        if (class232.field4044 == var9) {
                            class184.field3125 = true;
                            class69.field1223 = var10;
                            class119.field2176 = var11;
                        }
                        if (var9.field1964 || var9.field1975 != 0) {
                            if (var19 && class2.field33 != 0 && var9.field1916 != null) {
                                class34 var25 = new class34();
                                var25.field573 = true;
                                var25.field583 = var9;
                                var25.field555 = class2.field33;
                                var25.field568 = var9.field1916;
                                class15.field281.method1272(5664, var25);
                            }
                            if (class10.field194 != null || class212.field3588 != null || class81.field1409 || var9.field1975 != 1400 && class115.field2109) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field1975 != 0) {
                                if (var9.field1975 == 1337) {
                                    class79.field1384 = var9;
                                    class198.method1268(116, var9);
                                    continue;
                                }
                                if (var9.field1975 == 1338) {
                                    if (var21) {
                                        class28.method142(1762826763, class232.field4043 - var10, class81.field1403 - var11, var9);
                                    }
                                    continue;
                                }
                                if (var9.field1975 == 1400) {
                                    class178.field3029 = var9;
                                    if (var21) {
                                        if (class213.field3595[82] && class78.field1365 > 0) {
                                            int var26 = (int) ((double) (class232.field4043 - var10 - var9.field1977 / 2) * 2.0D / class4.field58) + class86.field1492 + class242.field4205;
                                            int var27 = class257.field4499 + class45.field753 - (int) ((double) (class81.field1403 - var11 - var9.field1952 / 2) * 2.0D / class4.field58) - class184.field3136;
                                            class227 var28 = class76.method445((byte) -84, new class227[] { class205.field3491, class204.method1303(var26 >> 6, 1), class20.field338, class204.method1303(var27 >> 6, 1), class20.field338, class204.method1303(var26 & 0x3F, 1), class20.field338, class204.method1303(var27 & 0x3F, 1) });
                                            var28.method1526(73);
                                            class70.method427((byte) -113, var28);
                                            class65.method411(22525);
                                            continue;
                                        }
                                        class115.field2109 = true;
                                        class94.field1632 = class100.field1752;
                                        class186.field3177 = field1451;
                                        class235.field4079 = class242.field4205;
                                        class231.field4034 = class184.field3136;
                                        continue;
                                    }
                                    if (var20 && class115.field2109) {
                                        class180.method1153((int) ((double) (class94.field1632 - class100.field1752) * 2.0D / class51.field904) + class235.field4079, true);
                                        class208.method1325(21726, (int) ((double) (class186.field3177 - field1451) * 2.0D / class51.field904) + class231.field4034);
                                        continue;
                                    }
                                    class115.field2109 = false;
                                    continue;
                                }
                                if (var9.field1975 == 1401) {
                                    if (var20) {
                                        class97.method602(var9.field1977, 127, var9.field1952, field1451 - var11, class100.field1752 - var10);
                                    }
                                    continue;
                                }
                                if (var9.field1975 == 1402) {
                                    class198.method1268(121, var9);
                                    continue;
                                }
                                if (var9.field1975 == 1404) {
                                    class198.method1268(114, var9);
                                    continue;
                                }
                            }
                            if (!var9.field1837 && var21) {
                                var9.field1837 = true;
                                if (var9.field1873 != null) {
                                    class34 var29 = new class34();
                                    var29.field573 = true;
                                    var29.field583 = var9;
                                    var29.field570 = class232.field4043 - var10;
                                    var29.field555 = class81.field1403 - var11;
                                    var29.field568 = var9.field1873;
                                    class15.field281.method1272(5664, var29);
                                }
                            }
                            if (var9.field1837 && var20 && var9.field1927 != null) {
                                class34 var30 = new class34();
                                var30.field573 = true;
                                var30.field583 = var9;
                                var30.field570 = class100.field1752 - var10;
                                var30.field555 = field1451 - var11;
                                var30.field568 = var9.field1927;
                                class15.field281.method1272(5664, var30);
                            }
                            if (var9.field1837 && !var20) {
                                var9.field1837 = false;
                                if (var9.field1839 != null) {
                                    class34 var31 = new class34();
                                    var31.field573 = true;
                                    var31.field583 = var9;
                                    var31.field570 = class100.field1752 - var10;
                                    var31.field555 = field1451 - var11;
                                    var31.field568 = var9.field1839;
                                    class88.field1522.method1272(5664, var31);
                                }
                            }
                            if (var20 && var9.field1973 != null) {
                                class34 var32 = new class34();
                                var32.field573 = true;
                                var32.field583 = var9;
                                var32.field570 = class100.field1752 - var10;
                                var32.field555 = field1451 - var11;
                                var32.field568 = var9.field1973;
                                class15.field281.method1272(5664, var32);
                            }
                            if (!var9.field1878 && var19) {
                                var9.field1878 = true;
                                if (var9.field1951 != null) {
                                    class34 var33 = new class34();
                                    var33.field573 = true;
                                    var33.field583 = var9;
                                    var33.field570 = class100.field1752 - var10;
                                    var33.field555 = field1451 - var11;
                                    var33.field568 = var9.field1951;
                                    class15.field281.method1272(5664, var33);
                                }
                            }
                            if (var9.field1878 && var19 && var9.field1920 != null) {
                                class34 var34 = new class34();
                                var34.field573 = true;
                                var34.field583 = var9;
                                var34.field570 = class100.field1752 - var10;
                                var34.field555 = field1451 - var11;
                                var34.field568 = var9.field1920;
                                class15.field281.method1272(5664, var34);
                            }
                            if (var9.field1878 && !var19) {
                                var9.field1878 = false;
                                if (var9.field1898 != null) {
                                    class34 var35 = new class34();
                                    var35.field573 = true;
                                    var35.field583 = var9;
                                    var35.field570 = class100.field1752 - var10;
                                    var35.field555 = field1451 - var11;
                                    var35.field568 = var9.field1898;
                                    class88.field1522.method1272(5664, var35);
                                }
                            }
                            if (var9.field1826 != null) {
                                class34 var36 = new class34();
                                var36.field583 = var9;
                                var36.field568 = var9.field1826;
                                class101.field1779.method1272(5664, var36);
                            }
                            if (var9.field1891 != null && class3.field39 > var9.field1969) {
                                if (var9.field1915 == null || class3.field39 - var9.field1969 > 32) {
                                    class34 var41 = new class34();
                                    var41.field583 = var9;
                                    var41.field568 = var9.field1891;
                                    class15.field281.method1272(5664, var41);
                                } else {
                                    label543: for (int var37 = var9.field1969; var37 < class3.field39; var37++) {
                                        int var38 = class52.field921[var37 & 0x1F];
                                        for (int var39 = 0; var39 < var9.field1915.length; var39++) {
                                            if (var9.field1915[var39] == var38) {
                                                class34 var40 = new class34();
                                                var40.field583 = var9;
                                                var40.field568 = var9.field1891;
                                                class15.field281.method1272(5664, var40);
                                                break label543;
                                            }
                                        }
                                    }
                                }
                                var9.field1969 = class3.field39;
                            }
                            if (var9.field1923 != null && class26.field432 > var9.field1989) {
                                if (var9.field1886 == null || class26.field432 - var9.field1989 > 32) {
                                    class34 var46 = new class34();
                                    var46.field583 = var9;
                                    var46.field568 = var9.field1923;
                                    class15.field281.method1272(5664, var46);
                                } else {
                                    label519: for (int var42 = var9.field1989; var42 < class26.field432; var42++) {
                                        int var43 = class168.field2825[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field1886.length; var44++) {
                                            if (var9.field1886[var44] == var43) {
                                                class34 var45 = new class34();
                                                var45.field583 = var9;
                                                var45.field568 = var9.field1923;
                                                class15.field281.method1272(5664, var45);
                                                break label519;
                                            }
                                        }
                                    }
                                }
                                var9.field1989 = class26.field432;
                            }
                            if (var9.field1940 != null && class99.field1725 > var9.field1857) {
                                if (var9.field1874 == null || class99.field1725 - var9.field1857 > 32) {
                                    class34 var51 = new class34();
                                    var51.field583 = var9;
                                    var51.field568 = var9.field1940;
                                    class15.field281.method1272(5664, var51);
                                } else {
                                    label495: for (int var47 = var9.field1857; var47 < class99.field1725; var47++) {
                                        int var48 = class76.field1326[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field1874.length; var49++) {
                                            if (var9.field1874[var49] == var48) {
                                                class34 var50 = new class34();
                                                var50.field583 = var9;
                                                var50.field568 = var9.field1940;
                                                class15.field281.method1272(5664, var50);
                                                break label495;
                                            }
                                        }
                                    }
                                }
                                var9.field1857 = class99.field1725;
                            }
                            if (var9.field1946 != null && class123.field2217 > var9.field1841) {
                                if (var9.field1942 == null || class123.field2217 - var9.field1841 > 32) {
                                    class34 var56 = new class34();
                                    var56.field583 = var9;
                                    var56.field568 = var9.field1946;
                                    class15.field281.method1272(5664, var56);
                                } else {
                                    label471: for (int var52 = var9.field1841; var52 < class123.field2217; var52++) {
                                        int var53 = class252.field4364[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field1942.length; var54++) {
                                            if (var9.field1942[var54] == var53) {
                                                class34 var55 = new class34();
                                                var55.field583 = var9;
                                                var55.field568 = var9.field1946;
                                                class15.field281.method1272(5664, var55);
                                                break label471;
                                            }
                                        }
                                    }
                                }
                                var9.field1841 = class123.field2217;
                            }
                            if (var9.field1978 != null && class73.field1275 > var9.field1892) {
                                if (var9.field1929 == null || class73.field1275 - var9.field1892 > 32) {
                                    class34 var61 = new class34();
                                    var61.field583 = var9;
                                    var61.field568 = var9.field1978;
                                    class15.field281.method1272(5664, var61);
                                } else {
                                    label447: for (int var57 = var9.field1892; var57 < class73.field1275; var57++) {
                                        int var58 = class205.field3489[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field1929.length; var59++) {
                                            if (var9.field1929[var59] == var58) {
                                                class34 var60 = new class34();
                                                var60.field583 = var9;
                                                var60.field568 = var9.field1978;
                                                class15.field281.method1272(5664, var60);
                                                break label447;
                                            }
                                        }
                                    }
                                }
                                var9.field1892 = class73.field1275;
                            }
                            if (class95.field1649 > var9.field1851 && var9.field1949 != null) {
                                class34 var62 = new class34();
                                var62.field583 = var9;
                                var62.field568 = var9.field1949;
                                class15.field281.method1272(5664, var62);
                            }
                            if (class152.field2645 > var9.field1851 && var9.field1880 != null) {
                                class34 var63 = new class34();
                                var63.field583 = var9;
                                var63.field568 = var9.field1880;
                                class15.field281.method1272(5664, var63);
                            }
                            if (class19.field325 > var9.field1851 && var9.field1825 != null) {
                                class34 var64 = new class34();
                                var64.field583 = var9;
                                var64.field568 = var9.field1825;
                                class15.field281.method1272(5664, var64);
                            }
                            if (class200.field3438 > var9.field1851 && var9.field1919 != null) {
                                class34 var65 = new class34();
                                var65.field583 = var9;
                                var65.field568 = var9.field1919;
                                class15.field281.method1272(5664, var65);
                            }
                            if (class216.field3649 > var9.field1851 && var9.field1985 != null) {
                                class34 var66 = new class34();
                                var66.field583 = var9;
                                var66.field568 = var9.field1985;
                                class15.field281.method1272(5664, var66);
                            }
                            var9.field1851 = class77.field1356;
                            if (var9.field1902 != null) {
                                for (int var67 = 0; var67 < class181.field3097; var67++) {
                                    class34 var68 = new class34();
                                    var68.field583 = var9;
                                    var68.field569 = class103.field1805[var67];
                                    var68.field578 = class241.field4194[var67];
                                    var68.field568 = var9.field1902;
                                    class15.field281.method1272(5664, var68);
                                }
                            }
                            if (class222.field3758 && var9.field1928 != null) {
                                class34 var69 = new class34();
                                var69.field583 = var9;
                                var69.field568 = var9.field1928;
                                class15.field281.method1272(5664, var69);
                            }
                        }
                    }
                    if (!var9.field1853 && class10.field194 == null && class212.field3588 == null && !class81.field1409) {
                        if ((var9.field1907 >= 0 || var9.field1926 != 0) && class100.field1752 >= var12 && field1451 >= var13 && class100.field1752 < var14 && field1451 < var15) {
                            if (var9.field1907 >= 0) {
                                class132.field2297 = arg0[var9.field1907];
                            } else {
                                class132.field2297 = var9;
                            }
                        }
                        if (var9.field1829 == 8 && class100.field1752 >= var12 && field1451 >= var13 && class100.field1752 < var14 && field1451 < var15) {
                            class141.field2427 = var9;
                        }
                        if (var9.field1935 > var9.field1952) {
                            class86.method519(var9.field1952, field1451, var9.field1935, var11, var9.field1977 + var10, class100.field1752, var9, 21357);
                        }
                    }
                    if (var9.field1829 == 0) {
                        method495(arg0, var9.field1861, var12, var13, var14, var15, var10 - var9.field1925, var11 - var9.field1986);
                        if (var9.field1956 != null) {
                            method495(var9.field1956, var9.field1861, var12, var13, var14, var15, var10 - var9.field1925, var11 - var9.field1986);
                        }
                        class182 var70 = (class182) class58.field1070.method1298(-103, (long) var9.field1861);
                        if (var70 != null) {
                            class238.method1585(var12, var10, var14, var15, 78, var11, var13, var70.field3106);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIIII)V")
    public static final void method496(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class138.field2399 = (short) arg1;
        if (arg5 >= -99) {
            field1431 = -115;
        }
        field1426++;
        class260.field4527 = (short) arg3;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method497(int arg0) {
        field1435++;
        method500((byte) -90);
        class227.method1503(-920974204);
        class96.method590((byte) -43);
        class122.method756(0);
        class188.method1199((byte) -111);
        class240.method1603((byte) -71);
        class190.method1205((byte) -87);
        class226.method1437(12854);
        class20.method95(false);
        class57.method341(-128);
        class32.method167(-118);
        class192.method1224((byte) -69);
        class195.method1236((byte) -102);
        class106.method659((byte) 123);
        class198.method1278(105);
        class134.method827((byte) 124);
        class105.method653(4194304);
        class225.method1415((byte) -111);
        class201.method1294(40);
        class140.method889((byte) 76);
        class65.method412((byte) -90);
        class38.method202((byte) -98);
        class213.method1357(-124);
        class253.method1702(false);
        class212.method1351(91);
        class56.method335((byte) -35);
        class51.method297(117);
        class4.method11(0);
        class108.method670(20);
        class49.method289(64);
        class147.method927(true);
        class182.method1163(arg0 ^ arg0);
        class60.method365(true);
        class144.method908(arg0 + 282);
        class19.method89(false);
        class254.method1729((byte) 31);
        class184.method1172(554);
        class79.method461(-105);
        class69.method426(true);
        class128.method780(7517);
        class205.method1314(true);
        class252.method1679((byte) 55);
        class45.method250((byte) -38);
        class87.method521((byte) 83);
        class13.method62((byte) 96);
        class138.method862(0);
        class93.method576();
        class85.method510(false);
        class178.method1144((byte) -12);
        class55.method321();
        class11.method52(15333);
        class251.method1678((byte) 82);
        class12.method58(-9);
        class249.method1668(-1);
        class142.method901(4271);
        class61.method374(false);
        class215.method1370((byte) 74);
        class66.method415(arg0 + 134);
        class71.method432(arg0 - 23620);
        class46.method255((byte) -107);
        class196.method1263();
        class255.method1739((byte) 115);
        class230.method1551(-8240);
        class116.method735((byte) -100);
        class180.method1154(true);
        class78.method459(arg0 ^ 0xFFFFE3DF);
        class133.method816(false);
        class260.method1757(25);
        class237.method1577((byte) -106);
        class1.method1();
        class115.method730(false);
        class168.method1040((byte) 23);
        class40.method210(true);
        class10.method38((byte) -120);
        class62.method380();
        class111.method707();
        class191.method1213((byte) -69);
        class241.method1608(arg0 ^ 0xFFFFD64A);
        class54.method311(true);
        class28.method139(-119);
        class77.method453((byte) -101);
        class139.method887(arg0 - 32);
        class31.method157((byte) 22);
        class135.method837();
        class173.method1110((byte) 3);
        class103.method632(arg0 + 25);
        class125.method773(-128);
        class214.method1362(15773);
        class101.method619(-116);
        class247.method1656();
        class167.method1031((byte) 101);
        class99.method610(-9090);
        class109.method680(arg0 - 78);
        class169.method1042(-1285);
        class123.method764((byte) 111);
        class119.method748(0);
        class27.method138(235);
        class187.method1189(-110);
        class64.method410((byte) 77);
        class228.method1537(-52);
        class118.method743(113);
        class8.method32(arg0 + 26);
        class145.method917(-2);
        class152.method957(109);
        class25.method125((byte) 47);
        class5.method20(0);
        class14.method66(true);
        class130.method802(false);
        class175.method1115(-94);
        class24.method115((byte) -123);
        class199.method1282(false);
        class88.method528(1);
        class174.method1111(1);
        class29.method152(true);
        class58.method354(-122);
        class34.method180(-34);
        class246.method1646(-28093);
        class132.method813(arg0 + 26);
        class3.method9(arg0 ^ 0xFFFFFF8D);
        class94.method581(arg0 ^ 0xFFFFB2CF);
        class171.method1092(arg0 + 65562);
        class151.method955(94);
        class238.method1584((byte) 105);
        class92.method540(false);
        class200.method1290(false);
        class2.method4((byte) -121);
        class6.method26();
        class258.method1750(1);
        class53.method308(25724);
        class242.method1611(64);
        class220.method1388(arg0 ^ 0xFFFFFF89);
        class18.method86(-104);
        class216.method1372((byte) 97);
        class203.method1301(50);
        class47.method263((byte) 67);
        class44.method234((byte) -112);
        class165.method1019(3);
        class83.method505(false);
        class120.method752((byte) 53);
        class231.method1556((byte) -116);
        class100.method615(true);
        class161.method990(111);
        class221.method1400((byte) 28);
        class73.method438(true);
        class23.method113(arg0 + 32422);
        class15.method73((byte) 22);
        class143.method903(112);
        class35.method188();
        class155.method973();
        class206.method1316();
        class248.method1664((byte) 99);
        class193.method1230((byte) 66);
        class131.method810(127);
        class154.method968();
        class177.method1126(arg0 + 26);
        class70.method428(false);
        class172.method1098(383);
        class41.method222((byte) -88);
        class244.method1624();
        class110.method682();
        class149.method943(24812);
        class243.method1617(arg0 ^ 0xFFFFFFE6);
        class81.method473((byte) 88);
        class186.method1180(0);
        class43.method233((byte) 24);
        class222.method1404(-1);
        class160.method987(arg0 - 24);
        class261.method1758(-1);
        class9.method36((byte) -26);
        class256.method1742(false);
        class76.method451(-17275);
        class42.method225(2006939652);
        class97.method601(-127);
        class197.method1266(-27769);
        class102.method624((byte) -101);
        class33.method171(false);
        class52.method305(4);
        class59.method359(-22075);
        class257.method1745(64);
        class245.method1638(false);
        class235.method1568(128);
        class179.method1148(arg0 + 281);
        class36.method189((byte) 67);
        class250.method1673(-96);
        class104.method640(78);
        class95.method586(arg0 + 7301);
        class112.method712((byte) 111);
        class30.method156(arg0 + 139);
        class223.method1411(126);
        class232.method1563((byte) -92);
        class72.method433((byte) -122);
        class229.method1542((byte) 111);
        class16.method78(arg0 ^ 0xFFFFFFE6);
        class114.method726(190);
        class204.method1306(arg0 + 28577);
        class22.method109((byte) -117);
        class185.method1177(29);
        class219.method1383((byte) 102);
        class218.method1376(arg0 - 99);
        class162.method997(-84);
        class80.method467(10818);
        class91.method536(14447);
        class236.method1571(-86);
        class141.method897((byte) 3);
        class156.method980(arg0 - 24911);
        class207.method1318(-1);
        class63.method401((byte) -78);
        class37.method195((byte) -51);
        class89.method531(8);
        class146.method920(55);
        class7.method28((byte) -96);
        class181.method1156((byte) 109);
        class117.method737(true);
        class211.method1344(0);
        class67.method418(false);
        class166.method1023(arg0 - 6075);
        class75.method440(true);
        class210.method1340(-116);
        class194.method1231((byte) 25);
        class148.method941((byte) 97);
        class98.method605(false);
        class124.method766(-1);
        class26.method130(92);
        class176.method1123(-80);
        class21.method104((byte) -126);
        class153.method961(-9185);
        class86.method518(16);
        if (class96.field1691) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
    private final void method498(int arg0, int arg1) {
        class4.field89 = null;
        class98.field1716 = 0;
        field1440++;
        class24.field402 = null;
        if (class9.field168 == class177.field2945) {
            class9.field168 = class104.field1822;
        } else {
            class9.field168 = class177.field2945;
        }
        class43.field722++;
        if (arg0 != 20) {
            return;
        }
        if (class43.field722 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class184.field3139 == 0 || class184.field3139 == 5) {
                this.method597("js5connect_full", true);
                class184.field3139 = 1000;
            } else {
                class16.field297 = 3000;
            }
        } else if (class43.field722 >= 2 && arg1 == 6) {
            this.method597("js5connect_outofdate", true);
            class184.field3139 = 1000;
        } else if (class43.field722 >= 4) {
            if (class184.field3139 == 0 || class184.field3139 == 5) {
                this.method597("js5connect", true);
                class184.field3139 = 1000;
            } else {
                class16.field297 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method499(byte arg0) {
        if (class97.field1706 != null) {
            class97.field1706.destroy();
            class97.field1706 = null;
        }
        field1442++;
        if (class61.field1123 != null) {
            class61.field1123.method1593(0, this.getClass());
        }
        if (class252.field4362 != null) {
            class252.field4362.field4176 = false;
        }
        class252.field4362 = null;
        if (class9.field172 != null) {
            class9.field172.method97(arg0 ^ 0xFFFFFFD4);
            class9.field172 = null;
        }
        class53.method309(class172.field2875, -122);
        class146.method923(class172.field2875, -8);
        if (class19.field323 != null) {
            class19.field323.method891(-23225, class172.field2875);
        }
        class243.method1613(arg0 ^ 0x2B);
        class106.method655(2301979);
        class19.field323 = null;
        if (class77.field1360 != null) {
            class77.field1360.method1322((byte) 112);
        }
        if (class124.field2229 != null) {
            class124.field2229.method1322((byte) 105);
        }
        class161.method992(29172);
        class109.method679(arg0 ^ 0xFFFFFFBB);
        try {
            if (class75.field1310 != null) {
                class75.field1310.method160((byte) 116);
            }
            if (class7.field157 != null) {
                for (int var2 = 0; var2 < class7.field157.length; var2++) {
                    if (class7.field157[var2] != null) {
                        class7.field157[var2].method160((byte) 123);
                    }
                }
            }
            if (class58.field1079 != null) {
                class58.field1079.method160((byte) 123);
            }
            if (class16.field295 != null) {
                class16.field295.method160((byte) 117);
            }
        } catch (IOException var3) {
        }
        if (arg0 != -44) {
            field1450 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length < 7 || arg0.length > 8) {
                class38.method197((byte) -64);
            }
            class131.field2286 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class169.field2832 = 0;
            } else if (arg0[1].equals("office")) {
                class169.field2832 = 1;
            } else if (arg0[1].equals("local")) {
                class169.field2832 = 2;
            } else {
                class38.method197((byte) -64);
            }
            if (arg0[2].equals("live")) {
                class132.field2300 = 0;
            } else if (arg0[2].equals("rc")) {
                class132.field2300 = 1;
            } else if (arg0[2].equals("wip")) {
                class132.field2300 = 2;
            } else {
                class38.method197((byte) -64);
            }
            if (arg0[4].equals("free")) {
                class58.field1072 = false;
            } else if (arg0[4].equals("members")) {
                class58.field1072 = true;
            } else {
                class38.method197((byte) -64);
            }
            if (arg0[5].equals("english")) {
                class214.field3612 = 0;
            } else if (arg0[5].equals("german")) {
                class252.method1682((byte) 94);
                class214.field3612 = 1;
            } else {
                class38.method197((byte) -64);
            }
            if (arg0[6].equals("game0")) {
                class106.field2001 = 0;
            } else if (arg0[6].equals("game1")) {
                class106.field2001 = 1;
            } else {
                class38.method197((byte) -64);
            }
            if (arg0.length != 8) {
                class241.field4190 = false;
            } else if (arg0[7].equals("safemode")) {
                class241.field4190 = true;
            } else {
                class38.method197((byte) -64);
            }
            class64.field1172 = 0;
            class123.field2218 = "127.0.0.1";
            class9.field167 = class91.field1558;
            client var1 = new client();
            var1.method598("runescape", 503, class132.field2300 + 32, 765, 504, 27, false);
            class130.field2272.setLocation(40, 40);
        } catch (Exception var3) {
            class149.method949((String) null, var3, -127);
        }
        field1429++;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public static void method500(byte arg0) {
        field1446 = null;
        field1437 = null;
        field1445 = null;
        field1428 = null;
        field1449 = null;
        if (arg0 != -90) {
            method493(-128, true);
        }
        field1438 = null;
        field1448 = null;
        field1424 = null;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lta;)Lta;")
    public static final class105 method501(class105 arg0) {
        int var1 = class204.method1310(method494(arg0), (byte) -113);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class27.method137(arg0.field1968, -954490064);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIIIZZI)Lnf;")
    public static final class213 method502(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6, int arg7) {
        if (arg1 != -29366) {
            return null;
        }
        field1434++;
        class178 var8 = class133.method815(arg2, (byte) -70);
        if (arg4 > 1 && var8.field3030 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg4 >= var8.field3041[var10] && var8.field3041[var10] != 0) {
                    var9 = var8.field3030[var10];
                }
            }
            if (var9 != -1) {
                var8 = class133.method815(var9, (byte) -70);
            }
        }
        class55 var11 = var8.method1138(126);
        if (var11 == null) {
            return null;
        }
        class163 var12 = null;
        if (var8.field3042 != -1) {
            var12 = (class163) method502(false, -29366, var8.field3055, 0, 10, true, true, 1);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field3005 != -1) {
            var12 = (class163) method502(false, arg1, var8.field2991, arg3, arg4, true, false, arg7);
            if (var12 == null) {
                return null;
            }
        }
        int var13 = class111.field2066;
        int[] var14 = class111.field2069;
        int var15 = class111.field2064;
        int[] var16 = new int[4];
        class111.method706(var16);
        class163 var17 = new class163(36, 32);
        class111.method699(var17.field2756, 36, 32);
        class62.method394();
        class62.method384(16, 16);
        int var18 = var8.field2987;
        class62.field1134 = false;
        if (arg6) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg7 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class62.field1143[var8.field2999] * var18 >> 16;
        int var20 = class62.field1136[var8.field2999] * var18 >> 16;
        var11.method281(0, var8.field3002, var8.field3061, var8.field2999, var8.field3007, var20 + var8.field2990 - (var11.method88() / 2), var8.field2990 + var19);
        if (arg7 >= 1) {
            var17.method1000(1);
            if (arg7 >= 2) {
                var17.method1000(16777215);
            }
            class111.method699(var17.field2756, 36, 32);
        }
        if (arg3 != 0) {
            var17.method1015(arg3);
        }
        if (var8.field3042 != -1) {
            var12.method787(0, 0);
        } else if (var8.field3005 != -1) {
            class111.method699(var12.field2756, 36, 32);
            var17.method787(0, 0);
            var17 = var12;
        }
        if (arg0 && (var8.field3049 == 1 || arg4 != 1) && arg4 != -1) {
            class98.field1714.method1262(class231.method1559(1000000, arg4), 0, 9, 16776960, 1);
        }
        class111.method699(var14, var13, var15);
        class111.method711(var16);
        class62.method394();
        class62.field1134 = true;
        return var17;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method503(int arg0) {
        field1433++;
        if (class226.field3910 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class12.method57(arg0 - 100);
            if (class118.field2155 == 0L) {
                class118.field2155 = var4;
            }
            if (var3 > 16384 && (var4 - class118.field2155) < 5000L) {
                if (var4 - class153.field2661 > 1000L) {
                    System.gc();
                    class153.field2661 = var4;
                }
                class7.field153 = class223.field3791;
                class120.field2184 = 5;
            } else {
                class226.field3910 = 10;
                class120.field2184 = 5;
                class7.field153 = class198.field3400;
            }
        } else if (class226.field3910 == 10) {
            class178.method1143(4, 104, 104, 25);
            for (int var6 = 0; var6 < 4; var6++) {
                class78.field1370[var6] = new class134(104, 104);
            }
            class226.field3910 = 30;
            class120.field2184 = 10;
            class7.field153 = class15.field287;
        } else if (class226.field3910 == 30) {
            class31.field495 = class249.method1671((byte) 42, true, false, true, 0);
            class33.field547 = class249.method1671((byte) 42, true, false, true, 1);
            class7.field154 = class249.method1671((byte) 42, false, true, true, 2);
            class188.field3198 = class249.method1671((byte) 42, true, false, true, 3);
            class95.field1648 = class249.method1671((byte) 42, true, false, true, 4);
            class232.field4042 = class249.method1671((byte) 42, true, true, true, 5);
            class14.field270 = class249.method1671((byte) 42, true, true, false, 6);
            class252.field4358 = class249.method1671((byte) 42, true, false, true, 7);
            class94.field1639 = class249.method1671((byte) 42, true, false, true, 8);
            class87.field1510 = class249.method1671((byte) 42, true, false, true, 9);
            class207.field3510 = class249.method1671((byte) 42, true, false, true, 10);
            class149.field2602 = class249.method1671((byte) 42, true, false, true, 11);
            class128.field2254 = class249.method1671((byte) 42, true, false, true, 12);
            class13.field247 = class249.method1671((byte) 42, true, false, true, 13);
            class226.field3862 = class249.method1671((byte) 42, true, false, false, 14);
            class13.field252 = class249.method1671((byte) 42, true, false, true, 15);
            class143.field2455 = class249.method1671((byte) 42, true, false, true, 16);
            class171.field2855 = class249.method1671((byte) 42, true, false, true, 17);
            class97.field1705 = class249.method1671((byte) 42, true, false, true, 18);
            class194.field3304 = class249.method1671((byte) 42, true, false, true, 19);
            class184.field3137 = class249.method1671((byte) 42, true, false, true, 20);
            class199.field3412 = class249.method1671((byte) 42, true, false, true, 21);
            class86.field1495 = class249.method1671((byte) 42, true, false, true, 22);
            class69.field1217 = class249.method1671((byte) 42, true, true, true, 23);
            class83.field1459 = class249.method1671((byte) 42, true, false, true, 24);
            class81.field1401 = class249.method1671((byte) 42, true, false, true, 25);
            class38.field639 = class249.method1671((byte) 42, true, true, true, 26);
            class120.field2184 = 15;
            class7.field153 = class23.field396;
            class226.field3910 = 40;
        } else if (class226.field3910 == 40) {
            byte var7 = 0;
            int var8 = var7 + class31.field495.method343(false) * 4 / 100;
            int var9 = var8 + class33.field547.method343(false) * 4 / 100;
            int var10 = var9 + class7.field154.method343(false) / 100;
            int var11 = var10 + class188.field3198.method343(false) * 2 / 100;
            int var12 = var11 + class95.field1648.method343(false) * 6 / 100;
            int var13 = var12 + class232.field4042.method343(false) * 4 / 100;
            int var14 = var13 + class14.field270.method343(false) * 2 / 100;
            int var15 = var14 + class252.field4358.method343(false) * 50 / 100;
            int var16 = var15 + class94.field1639.method343(false) * 2 / 100;
            int var17 = var16 + class87.field1510.method343(false) * 2 / 100;
            int var18 = var17 + class207.field3510.method343(false) * 2 / 100;
            int var19 = var18 + class149.field2602.method343(false) * 2 / 100;
            int var20 = var19 + class128.field2254.method343(false) * 2 / 100;
            int var21 = var20 + class13.field247.method343(false) * 2 / 100;
            int var22 = var21 + class226.field3862.method343(false) * 2 / 100;
            int var23 = var22 + class13.field252.method343(false) * 2 / 100;
            int var24 = var23 + class143.field2455.method343(false) / 100;
            int var25 = var24 + class171.field2855.method343(false) / 100;
            int var26 = var25 + class97.field1705.method343(false) / 100;
            int var27 = var26 + class194.field3304.method343(false) / 100;
            int var28 = var27 + class184.field3137.method343(false) / 100;
            int var29 = var28 + class199.field3412.method343(false) / 100;
            int var30 = var29 + class86.field1495.method343(false) / 100;
            int var31 = var30 + class69.field1217.method343(false) / 100;
            int var32 = var31 + class83.field1459.method343(false) / 100;
            int var33 = var32 + class81.field1401.method343(false) / 100;
            int var34 = var33 + class38.field639.method343(false) / 100;
            if (var34 == 100) {
                class7.field153 = class44.field738;
                class120.field2184 = 20;
                class149.method946(class94.field1639, 0);
                class236.method1574((byte) -114, class94.field1639);
                class220.method1392(class94.field1639, 4);
                class144.method905((byte) 25, class94.field1639);
                class226.field3910 = 45;
            } else {
                if (var34 != 0) {
                    class7.field153 = class76.method445((byte) 41, new class227[] { class216.field3640, class204.method1303(var34, arg0 + 1), class187.field3189 });
                }
                class120.field2184 = 20;
            }
        } else if (class226.field3910 == 45) {
            class54.method312(class71.field1256, 22050, 2, 8000);
            class38.field635 = new class253();
            class38.field635.method1708(9, -109, 128);
            class77.field1360 = class176.method1122(arg0 ^ 0x33, class172.field2875, 0, 22050, class61.field1123);
            class77.field1360.method1328(7673, class38.field635);
            class16.method76(class13.field252, class38.field635, class226.field3862, class95.field1648, (byte) -19);
            class124.field2229 = class176.method1122(32, class172.field2875, 1, 2048, class61.field1123);
            class94.field1627 = new class82();
            class124.field2229.method1328(7673, class94.field1627);
            class216.field3645 = new class212(22050, class195.field3316);
            class195.field3320 = class14.field270.method869(class128.field2258, 0);
            class120.field2184 = 30;
            class226.field3910 = 50;
            class7.field153 = class54.field941;
        } else if (class226.field3910 == 50) {
            int var35 = class205.method1315(class94.field1639, (byte) -82, class13.field247);
            int var36 = class238.method1588(false);
            if (var35 < var36) {
                class7.field153 = class76.method445((byte) 37, new class227[] { class125.field2248, class204.method1303(var35 * 100 / var36, 1), class187.field3189 });
                class120.field2184 = 35;
            } else {
                class120.field2184 = 35;
                class7.field153 = class69.field1228;
                class226.field3910 = 60;
            }
        } else if (class226.field3910 == 60) {
            int var37 = class151.method956(class94.field1639, 7);
            int var38 = class256.method1743((byte) -22);
            if (var38 > var37) {
                class7.field153 = class76.method445((byte) -97, new class227[] { class24.field403, class204.method1303(var37 * 100 / var38, 1), class187.field3189 });
                class120.field2184 = 40;
            } else {
                class120.field2184 = 40;
                class226.field3910 = 65;
                class7.field153 = class86.field1491;
            }
        } else if (class226.field3910 == 65) {
            class99.method609(class13.field247, class94.field1639, (byte) 3);
            class7.field153 = class172.field2881;
            class120.field2184 = 45;
            class12.method60(5, -25);
            class226.field3910 = 70;
        } else if (class226.field3910 == 70) {
            class7.field154.method871(true);
            byte var39 = 0;
            int var40 = var39 + class7.field154.method859(59);
            class143.field2455.method871(true);
            int var41 = var40 + class143.field2455.method859(arg0 ^ 0x47);
            class171.field2855.method871(true);
            int var42 = var41 + class171.field2855.method859(121);
            class97.field1705.method871(true);
            int var43 = var42 + class97.field1705.method859(98);
            class194.field3304.method871(true);
            int var44 = var43 + class194.field3304.method859(119);
            class184.field3137.method871(true);
            int var45 = var44 + class184.field3137.method859(arg0 + 93);
            class199.field3412.method871(true);
            int var46 = var45 + class199.field3412.method859(92);
            class86.field1495.method871(true);
            int var47 = var46 + class86.field1495.method859(arg0 ^ 0x3D);
            class83.field1459.method871(true);
            int var48 = var47 + class83.field1459.method859(73);
            class81.field1401.method871(true);
            int var49 = var48 + class81.field1401.method859(107);
            if (var49 < 1000) {
                class7.field153 = class76.method445((byte) -111, new class227[] { class261.field4544, class204.method1303(var49 / 10, arg0 ^ 0x1), class187.field3189 });
                class120.field2184 = 50;
            } else {
                class151.method951((byte) 111, class7.field154);
                class229.method1545(class7.field154, 15194);
                class124.method768(class7.field154, (byte) 63);
                class43.method229(class7.field154, class252.field4358, 2);
                class188.method1196(class143.field2455, (byte) 114, class252.field4358, class58.field1072);
                class191.method1217(class97.field1705, class252.field4358, (byte) 29);
                class14.method69(class58.field1072, class88.field1526, (byte) 100, class252.field4358, class194.field3304);
                class29.method150(-100, class7.field154);
                class188.method1204(class184.field3137, 16777215, class31.field495, class33.field547);
                class197.method1267(class252.field4358, class199.field3412, 119);
                class44.method235(class86.field1495, arg0 + 109);
                class38.method203(true, class7.field154);
                class50.method293(class252.field4358, class13.field247, class188.field3198, class94.field1639, arg0 ^ 0x4523);
                class175.method1116(arg0, class7.field154);
                class226.method1436(class171.field2855, 0);
                class50.method292(0, new class175(), class83.field1459, class81.field1401);
                class218.method1374(class83.field1459, (byte) 54, class81.field1401);
                class7.field153 = class120.field2178;
                class120.field2184 = 50;
                class192.method1218(-17632);
                class226.field3910 = 80;
            }
        } else if (arg0 == 0) {
            if (class226.field3910 == 80) {
                int var50 = class60.method368((byte) -116, class94.field1639);
                int var51 = class166.method1025(-56);
                if (var51 > var50) {
                    class7.field153 = class76.method445((byte) 34, new class227[] { class45.field764, class204.method1303(var50 * 100 / var51, 1), class187.field3189 });
                    class120.field2184 = 60;
                } else {
                    class25.method126(class94.field1639, (byte) -108);
                    class120.field2184 = 60;
                    class226.field3910 = 90;
                    class7.field153 = class188.field3196;
                }
            } else if (class226.field3910 == 90) {
                if (class38.field639.method871(true)) {
                    class10 var52 = new class10(class87.field1510, class38.field639, class94.field1639, 20, !class186.field3168);
                    class62.method390(var52);
                    if (class125.field2242 == 1) {
                        class62.method385(0.9F);
                    }
                    if (class125.field2242 == 2) {
                        class62.method385(0.8F);
                    }
                    if (class125.field2242 == 3) {
                        class62.method385(0.7F);
                    }
                    if (class125.field2242 == 4) {
                        class62.method385(0.6F);
                    }
                    class7.field153 = class179.field3075;
                    class226.field3910 = 100;
                    class120.field2184 = 70;
                } else {
                    class7.field153 = class76.method445((byte) 36, new class227[] { class193.field3289, class204.method1303(class38.field639.method859(118), 1), class187.field3189 });
                    class120.field2184 = 70;
                }
            } else if (class226.field3910 == 100) {
                if (class31.method158(true, class94.field1639)) {
                    class226.field3910 = 110;
                }
            } else if (class226.field3910 == 110) {
                class252.field4362 = new class240();
                class61.field1123.method1596(10, 0, class252.field4362);
                class226.field3910 = 120;
                class7.field153 = class225.field3813;
                class120.field2184 = 75;
            } else if (class226.field3910 == 120) {
                if (class207.field3510.method879(class46.field826, class91.field1558, arg0)) {
                    class199 var53 = new class199(class207.field3510.method883((byte) -125, class91.field1558, class46.field826));
                    class218.method1380(var53, (byte) 60);
                    class120.field2184 = 80;
                    class226.field3910 = 130;
                    class7.field153 = class59.field1091;
                } else {
                    class7.field153 = class76.method445((byte) 47, new class227[] { class87.field1512, class153.field2652 });
                    class120.field2184 = 80;
                }
            } else if (class226.field3910 == 130) {
                if (!class188.field3198.method871(true)) {
                    class7.field153 = class76.method445((byte) 110, new class227[] { class120.field2181, class204.method1303(class188.field3198.method859(81) * 4 / 5, 1), class187.field3189 });
                    class120.field2184 = 85;
                } else if (!class128.field2254.method871(true)) {
                    class7.field153 = class76.method445((byte) 109, new class227[] { class120.field2181, class204.method1303((class128.field2254.method859(74) / 6) + 80, 1), class187.field3189 });
                    class120.field2184 = 85;
                } else if (class13.field247.method871(true)) {
                    class7.field153 = class258.field4514;
                    class226.field3910 = 140;
                    class120.field2184 = 100;
                } else {
                    class7.field153 = class76.method445((byte) -82, new class227[] { class120.field2181, class204.method1303(class13.field247.method859(112) / 20 + 96, 1), class187.field3189 });
                    class120.field2184 = 85;
                }
            } else if (class226.field3910 == 140) {
                class230.field4028 = class188.field3198.method869(class229.field4006, 0);
                class232.field4042.method866(true, false, 1);
                class14.field270.method866(true, true, arg0 ^ 0x1);
                class94.field1639.method866(true, true, arg0 ^ 0x1);
                class13.field247.method866(true, true, 1);
                class207.field3510.method866(true, true, arg0 + 1);
                class188.field3198.method866(true, true, 1);
                class215.field3631 = true;
                class83.method506(100);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method504(int arg0) {
        field1432++;
        if (class184.field3139 == 1000) {
            return;
        }
        class253.field4393++;
        if (class253.field4393 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class92.field1572 = var2.get(11) * 600 + (var2.get(12) * 10 + (var2.get(13) / 6));
            class253.field4376.setSeed((long) class92.field1572);
        }
        this.method487(-1);
        class79.method464(-20923);
        class255.method1740(22328);
        class114.method725((byte) -113);
        class85.method515(-96);
        int var3 = -25 / ((60 - arg0) / 58);
        class260.method1756(0);
        if (class19.field323 != null) {
            int var4 = class19.field323.method893(-73);
            class2.field33 = var4;
        }
        if (class184.field3139 == 0) {
            this.method503(0);
            class41.method224(-69);
        } else if (class184.field3139 == 5) {
            this.method503(0);
            class41.method224(-40);
        } else if (class184.field3139 == 25 || class184.field3139 == 28) {
            class114.method724((byte) 114);
        }
        if (class184.field3139 == 10) {
            this.method490(true);
            class76.method448(2);
            class94.method577((byte) -110);
        } else if (class184.field3139 == 30) {
            class229.method1544(12052);
        } else if (class184.field3139 == 40) {
            class94.method577((byte) -114);
            if (class37.field623 != -3) {
                if (class37.field623 == 15) {
                    class29.method147(-246);
                    return;
                }
                if (class37.field623 != 2) {
                    class83.method506(119);
                    return;
                }
            }
        }
    }
}
