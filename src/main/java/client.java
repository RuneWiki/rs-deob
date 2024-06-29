import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.GregorianCalendar;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class40 {

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static volatile int field1640 = 0;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field1644 = 0;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field1650 = 0;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Lle;")
    public static class104 field1647;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Lcj;")
    public static class28 field1648;

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method252(int arg0) {
        field1641++;
        if (browsercontrol.iscreated()) {
            browsercontrol.destroy();
        }
        if (class95.field1835 != null) {
            class95.field1835.method772(this.getClass(), 50);
        }
        if (class133.field2488 != null) {
            class133.field2488.field4133 = false;
        }
        class133.field2488 = null;
        if (class101.field1972 != null) {
            class101.field1972.method1277(-67);
            class101.field1972 = null;
        }
        class25.method110(-91, class131.field2452);
        class102.method706(class131.field2452, true);
        if (class66.field1276 != null) {
            class66.field1276.method46(100, class131.field2452);
        }
        class254.method1706(2);
        class260.method1777(255);
        class66.field1276 = null;
        if (class31.field461 != null) {
            class31.field461.method1591(7759444);
        }
        if (class20.field277 != null) {
            class20.field277.method1591(7759444);
        }
        class173.method1173(-111);
        class157.method1074(103);
        try {
            if (class256.field4503 != null) {
                class256.field4503.method963(-9715);
            }
            int var2 = 126 % ((arg0 + 5) / 62);
            if (class42.field691 != null) {
                for (int var3 = 0; var3 < class42.field691.length; var3++) {
                    if (class42.field691[var3] != null) {
                        class42.field691[var3].method963(-9715);
                    }
                }
            }
            if (class72.field1422 != null) {
                class72.field1422.method963(-9715);
            }
            if (class59.field991 != null) {
                class59.field991.method963(-9715);
            }
        } catch (IOException var4) {
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public static final void method585(byte arg0) {
        field1639++;
        int var1 = -36 % ((arg0 + 7) / 60);
        if (class244.field4258 == 30) {
            class112.method755(25, (byte) -81);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    private final void method586(byte arg0) {
        field1636++;
        if (class225.field3853 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class3.method13(arg0 ^ 0x434D);
            if (class119.field2263 == 0L) {
                class119.field2263 = var4;
            }
            if (var3 > 16384 && (var4 - class119.field2263) < 5000L) {
                if ((var4 - class37.field545) > 1000L) {
                    System.gc();
                    class37.field545 = var4;
                }
                class237.field4116 = class27.field355;
                class208.field3599 = 5;
            } else {
                class225.field3853 = 10;
                class237.field4116 = class166.field2987;
                class208.field3599 = 5;
            }
        } else if (class225.field3853 == 10) {
            class45.method321(4, 104, 104, 25);
            for (int var6 = 0; var6 < 4; var6++) {
                class193.field3346[var6] = new class165(104, 104);
            }
            class208.field3599 = 10;
            class237.field4116 = class135.field2498;
            class225.field3853 = 30;
        } else if (class225.field3853 == 30) {
            class43.field758 = class145.method1000((byte) 116, false, true, 0, true);
            class183.field3209 = class145.method1000((byte) 57, false, true, 1, true);
            class33.field497 = class145.method1000((byte) 66, true, false, 2, true);
            class176.field3106 = class145.method1000((byte) -73, false, true, 3, true);
            class146.field2662 = class145.method1000((byte) 105, false, true, 4, true);
            class29.field427 = class145.method1000((byte) 71, true, true, 5, true);
            class28.field405 = class145.method1000((byte) -111, true, true, 6, false);
            class115.field2173 = class145.method1000((byte) -117, false, true, 7, true);
            class242.field4238 = class145.method1000((byte) 102, false, true, 8, true);
            class161.field2892 = class145.method1000((byte) -93, false, true, 9, true);
            class238.field4132 = class145.method1000((byte) 50, false, true, 10, true);
            class28.field418 = class145.method1000((byte) -121, false, true, 11, true);
            class50.field894 = class145.method1000((byte) 107, false, true, 12, true);
            class251.field4420 = class145.method1000((byte) -99, false, true, 13, true);
            class159.field2862 = class145.method1000((byte) -89, false, true, 14, false);
            class88.field1713 = class145.method1000((byte) -75, false, true, 15, true);
            class162.field2913 = class145.method1000((byte) 94, false, true, 16, true);
            class9.field97 = class145.method1000((byte) -114, false, true, 17, true);
            class80.field1570 = class145.method1000((byte) 74, false, true, 18, true);
            class224.field3814 = class145.method1000((byte) -95, false, true, 19, true);
            class140.field2583 = class145.method1000((byte) 57, false, true, 20, true);
            class180.field3154 = class145.method1000((byte) -81, false, true, 21, true);
            class133.field2476 = class145.method1000((byte) 88, false, true, 22, true);
            class26.field327 = class145.method1000((byte) 70, true, true, 23, true);
            class166.field2992 = class145.method1000((byte) -109, false, true, 24, true);
            class165.field2954 = class145.method1000((byte) -90, false, true, 25, true);
            class83.field1622 = class145.method1000((byte) 65, true, true, 26, true);
            class208.field3599 = 15;
            class237.field4116 = class2.field21;
            class225.field3853 = 40;
        } else if (class225.field3853 == 40) {
            byte var7 = 0;
            int var8 = var7 + class43.field758.method1623(arg0 - 13) * 4 / 100;
            int var9 = var8 + class183.field3209.method1623(-88) * 4 / 100;
            int var10 = var9 + class33.field497.method1623(-76) / 100;
            int var11 = var10 + class176.field3106.method1623(65) * 2 / 100;
            int var12 = var11 + class146.field2662.method1623(arg0 - 195) * 6 / 100;
            int var13 = var12 + class29.field427.method1623(-115) * 4 / 100;
            int var14 = var13 + class28.field405.method1623(-94) * 2 / 100;
            int var15 = var14 + class115.field2173.method1623(arg0 + 45) * 50 / 100;
            int var16 = var15 + class242.field4238.method1623(arg0 - 155) * 2 / 100;
            int var17 = var16 + class161.field2892.method1623(87) * 2 / 100;
            int var18 = var17 + class238.field4132.method1623(arg0) * 2 / 100;
            int var19 = var18 + class28.field418.method1623(-74) * 2 / 100;
            int var20 = var19 + class50.field894.method1623(117) * 2 / 100;
            int var21 = var20 + class251.field4420.method1623(arg0 - 3) * 2 / 100;
            int var22 = var21 + class159.field2862.method1623(58) * 2 / 100;
            int var23 = var22 + class88.field1713.method1623(-89) * 2 / 100;
            int var24 = var23 + class162.field2913.method1623(112) / 100;
            int var25 = var24 + class9.field97.method1623(-101) / 100;
            int var26 = var25 + class80.field1570.method1623(106) / 100;
            int var27 = var26 + class224.field3814.method1623(52) / 100;
            int var28 = var27 + class140.field2583.method1623(arg0 - 184) / 100;
            int var29 = var28 + class180.field3154.method1623(84) / 100;
            int var30 = var29 + class133.field2476.method1623(48) / 100;
            int var31 = var30 + class26.field327.method1623(arg0 - 175) / 100;
            int var32 = var31 + class166.field2992.method1623(-96) / 100;
            int var33 = var32 + class165.field2954.method1623(-95) / 100;
            int var34 = var33 + class83.field1622.method1623(-79) / 100;
            if (var34 == 100) {
                class237.field4116 = class192.field3336;
                class208.field3599 = 20;
                class241.method1593((byte) 105, class242.field4238);
                class88.method622((byte) -128, class242.field4238);
                class151.method1025(class242.field4238, 1);
                class207.method1347(class242.field4238, -5545);
                class225.field3853 = 45;
            } else {
                if (var34 != 0) {
                    class237.field4116 = class212.method1372(2, new class66[] { class166.field2990, class144.method989(var34, 0), class184.field3227 });
                }
                class208.field3599 = 20;
            }
        } else if (class225.field3853 == 45) {
            class31.method181(22050, 2, class250.field4401, -126);
            class51.field897 = new class43();
            class51.field897.method287(9, 128, arg0 ^ 0x5E);
            class31.field461 = class224.method1420(class95.field1835, (byte) 104, class131.field2452, 22050, 0);
            class31.field461.method1586(false, class51.field897);
            class230.method1500(class51.field897, class146.field2662, false, class88.field1713, class159.field2862);
            class20.field277 = class224.method1420(class95.field1835, (byte) 104, class131.field2452, 2048, 1);
            class206.field3528 = new class152();
            class20.field277.method1586(false, class206.field3528);
            class102.field1984 = new class32(22050, class200.field3446);
            class187.field3234 = class28.field405.method132(class66.field1312, (byte) -84);
            class208.field3599 = 30;
            class237.field4116 = class207.field3596;
            class225.field3853 = 50;
        } else if (class225.field3853 == 50) {
            int var35 = class122.method831(class242.field4238, 53, class251.field4420);
            int var36 = class162.method1095(arg0 - 167);
            if (var36 > var35) {
                class237.field4116 = class212.method1372(2, new class66[] { class81.field1581, class144.method989(var35 * 100 / var36, 0), class184.field3227 });
                class208.field3599 = 35;
            } else {
                class208.field3599 = 35;
                class225.field3853 = 60;
                class237.field4116 = class223.field3804;
            }
        } else if (class225.field3853 == 60) {
            int var37 = class64.method431((byte) -126, class242.field4238);
            int var38 = class165.method1123(false);
            if (var37 < var38) {
                class237.field4116 = class212.method1372(2, new class66[] { class250.field4408, class144.method989(var37 * 100 / var38, 0), class184.field3227 });
                class208.field3599 = 40;
            } else {
                class237.field4116 = class31.field475;
                class208.field3599 = 40;
                class225.field3853 = 65;
            }
        } else if (class225.field3853 == 65) {
            class203.method1313(class242.field4238, (byte) 83, class251.field4420);
            class237.field4116 = class164.field2949;
            class208.field3599 = 45;
            class112.method755(5, (byte) -89);
            class225.field3853 = 70;
        } else if (class225.field3853 == 70) {
            class33.field497.method150((byte) -62);
            byte var39 = 0;
            int var40 = var39 + class33.field497.method149(0);
            class162.field2913.method150((byte) -62);
            int var41 = var40 + class162.field2913.method149(0);
            class9.field97.method150((byte) -62);
            int var42 = var41 + class9.field97.method149(0);
            class80.field1570.method150((byte) -62);
            int var43 = var42 + class80.field1570.method149(0);
            class224.field3814.method150((byte) -62);
            int var44 = var43 + class224.field3814.method149(0);
            class140.field2583.method150((byte) -62);
            int var45 = var44 + class140.field2583.method149(0);
            class180.field3154.method150((byte) -62);
            int var46 = var45 + class180.field3154.method149(0);
            class133.field2476.method150((byte) -62);
            int var47 = var46 + class133.field2476.method149(0);
            class166.field2992.method150((byte) -62);
            int var48 = var47 + class166.field2992.method149(0);
            class165.field2954.method150((byte) -62);
            int var49 = var48 + class165.field2954.method149(arg0 - 68);
            if (var49 < 1000) {
                class237.field4116 = class212.method1372(2, new class66[] { class43.field748, class144.method989(var49 / 10, 0), class184.field3227 });
                class208.field3599 = 50;
            } else {
                class82.method567(class33.field497, -7486);
                class243.method1603((byte) -88, class33.field497);
                class19.method74(class33.field497, 11053);
                class256.method1715(-124, class115.field2173, class33.field497);
                class240.method1581(12800, class115.field2173, class260.field4587, class162.field2913);
                class257.method1724(class80.field1570, (byte) 82, class115.field2173);
                class133.method926(class260.field4587, class115.field2173, class224.field3814, (byte) 112, class27.field354);
                class63.method423(class33.field497, 1);
                class199.method1302(class140.field2583, class183.field3209, class43.field758, -118);
                class246.method1620(class115.field2173, class180.field3154, arg0 - 27687);
                class110.method744((byte) 58, class133.field2476);
                class193.method1263((byte) -101, class33.field497);
                class139.method956(class115.field2173, class251.field4420, class176.field3106, true, class242.field4238);
                class159.method1082(class33.field497, 116);
                class249.method1661(-83, class9.field97);
                class233.method1524(class165.field2954, class166.field2992, new class222(), (byte) -117);
                class28.method145(class166.field2992, (byte) -72, class165.field2954);
                class208.field3599 = 50;
                class237.field4116 = class230.field3990;
                class103.method716(4);
                class225.field3853 = 80;
            }
        } else if (class225.field3853 == 80) {
            int var50 = class136.method937(0, class242.field4238);
            int var51 = class69.method501(0);
            if (var51 > var50) {
                class237.field4116 = class212.method1372(arg0 ^ 0x46, new class66[] { class173.field3047, class144.method989(var50 * 100 / var51, 0), class184.field3227 });
                class208.field3599 = 60;
            } else {
                class196.method1275(12339, class242.field4238);
                class225.field3853 = 90;
                class208.field3599 = 60;
                class237.field4116 = class11.field140;
            }
        } else if (class225.field3853 == 90) {
            if (class83.field1622.method150((byte) -62)) {
                class62 var52 = new class62(class161.field2892, class83.field1622, class242.field4238, 20, !class7.field61);
                class123.method844(var52);
                if (class63.field1242 == 1) {
                    class123.method847(0.9F);
                }
                if (class63.field1242 == 2) {
                    class123.method847(0.8F);
                }
                if (class63.field1242 == 3) {
                    class123.method847(0.7F);
                }
                if (class63.field1242 == 4) {
                    class123.method847(0.6F);
                }
                class208.field3599 = 70;
                class225.field3853 = 100;
                class237.field4116 = class78.field1547;
            } else {
                class237.field4116 = class212.method1372(arg0 ^ 0x46, new class66[] { class175.field3075, class144.method989(class83.field1622.method149(0), 0), class184.field3227 });
                class208.field3599 = 70;
            }
        } else if (class225.field3853 != 100) {
            if (arg0 != 68) {
                this.method252(-56);
            }
            if (class225.field3853 == 110) {
                class133.field2488 = new class238();
                class95.field1835.method770((byte) -61, 10, class133.field2488);
                class225.field3853 = 120;
                class237.field4116 = class248.field4324;
                class208.field3599 = 75;
            } else if (class225.field3853 == 120) {
                if (class238.field4132.method159((byte) 124, class134.field2496, class85.field1679)) {
                    class89 var53 = new class89(class238.field4132.method148(class134.field2496, class85.field1679, (byte) 81));
                    class124.method857(var53, 127);
                    class225.field3853 = 130;
                    class237.field4116 = class223.field3803;
                    class208.field3599 = 80;
                } else {
                    class237.field4116 = class212.method1372(2, new class66[] { class66.field1332, class32.field488 });
                    class208.field3599 = 80;
                }
            } else if (class225.field3853 == 130) {
                if (!class176.field3106.method150((byte) -62)) {
                    class237.field4116 = class212.method1372(2, new class66[] { class138.field2541, class144.method989(class176.field3106.method149(0) * 3 / 4, 0), class184.field3227 });
                    class208.field3599 = 85;
                } else if (!class50.field894.method150((byte) -62)) {
                    class237.field4116 = class212.method1372(2, new class66[] { class138.field2541, class144.method989((class50.field894.method149(arg0 - 68) / 10) + 75, 0), class184.field3227 });
                    class208.field3599 = 85;
                } else if (!class251.field4420.method150((byte) -62)) {
                    class237.field4116 = class212.method1372(2, new class66[] { class138.field2541, class144.method989(class251.field4420.method149(arg0 - 68) / 20 + 85, arg0 + -68), class184.field3227 });
                    class208.field3599 = 85;
                } else if (class26.field327.method151(0, class64.field1259)) {
                    class192.method1259(-10675, class249.field4396, class26.field327, class199.field3431, class263.field4613, class93.field1788, class154.field2741);
                    class208.field3599 = 100;
                    class225.field3853 = 140;
                    class237.field4116 = class199.field3426;
                } else {
                    class237.field4116 = class212.method1372(arg0 - 66, new class66[] { class138.field2541, class144.method989(class26.field327.method160(126, class64.field1259) / 10 + 90, 0), class184.field3227 });
                    class208.field3599 = 85;
                }
            } else if (class225.field3853 == 140) {
                class139.field2557 = class176.field3106.method132(class49.field872, (byte) -106);
                class29.field427.method139(false, (byte) 113, true);
                class28.field405.method139(true, (byte) 113, true);
                class242.field4238.method139(true, (byte) 113, true);
                class251.field4420.method139(true, (byte) 113, true);
                class238.field4132.method139(true, (byte) 113, true);
                class176.field3106.method139(true, (byte) 113, true);
                class248.field4327 = true;
                class45.method325(64);
            }
        } else if (class89.method630(class242.field4238, -1)) {
            class225.field3853 = 110;
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field1635++;
        if (!this.method249((byte) -106)) {
            return;
        }
        class61.field1028 = Integer.parseInt(this.getParameter("worldid"));
        class92.field1777 = Integer.parseInt(this.getParameter("modewhat"));
        class81.field1585 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("safemode");
        if (var1 != null && var1.equals("1")) {
            class72.field1425 = true;
        } else {
            class72.field1425 = false;
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class260.field4587 = true;
        } else {
            class260.field4587 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class27.method123(-54);
            class69.field1401 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class163.field2921 = 1;
        } else {
            class163.field2921 = 0;
        }
        try {
            class150.field2704 = Integer.parseInt(this.getParameter("js"));
            class203.field3477 = Integer.parseInt(this.getParameter("plug"));
            class182.field3194 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var10) {
        }
        class42.field692 = class175.field3085.method480(this, (byte) -31);
        if (class42.field692 == null) {
            class42.field692 = class85.field1679;
        }
        String var5 = this.getParameter("advert");
        if (var5 != null) {
            byte[] var6;
            try {
                var6 = var5.getBytes("ISO-8859-1");
            } catch (UnsupportedEncodingException var9) {
                var6 = var5.getBytes();
            }
            class66 var7 = class69.method507(var6.length, var6, 127, 0);
            boolean var8 = class135.method931((byte) -101, var7);
            if (var8) {
                class40.field653 = var7;
            }
        }
        class35.field518 = this.getCodeBase().getHost();
        this.method243(-9, class92.field1777 + 32, 503, 765, 508);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lha;)Lha;")
    public static final class63 method587(class63 arg0) {
        int var1 = class132.method917(method592(arg0), -528748559);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class54.method367(arg0.field1122, (byte) -80);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
    public static final void method588(int arg0, boolean arg1) {
        field1643++;
        if (!arg1) {
            method596((class63) null);
        }
        class31.field459 = 50;
        class2.field30 = arg0;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    private final void method589(int arg0) {
        field1638++;
        class199.method1300(this, (byte) 100);
        if (arg0 != 1) {
            this.method589(114);
        }
        for (class155.field2762 = 0; class147.method1010((byte) 111) && class155.field2762 < 128; class155.field2762++) {
            class94.field1819[class155.field2762] = class78.field1543;
            class91.field1753[class155.field2762] = class107.field2052;
        }
        class193.field3347++;
        if (class150.field2702 != -1) {
            class171.method1163(-59, class150.field2702, class19.field257, 0, 0, 0, 0, class12.field143);
        }
        class15.field199++;
        class98.method674((byte) 113);
        while (true) {
            class237 var2;
            class63 var3;
            class63 var4;
            do {
                var2 = (class237) class241.field4204.method874(-120);
                if (var2 == null) {
                    while (true) {
                        class237 var5;
                        class63 var6;
                        class63 var7;
                        do {
                            var5 = (class237) class138.field2535.method874(54);
                            if (var5 == null) {
                                while (true) {
                                    class237 var8;
                                    class63 var9;
                                    class63 var10;
                                    do {
                                        var8 = (class237) class111.field2145.method874(103);
                                        if (var8 == null) {
                                            if (class241.field4187 != null) {
                                                class100.method685((byte) -118);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field4120;
                                        if (var9.field1190 < 0) {
                                            break;
                                        }
                                        var10 = class54.method367(var9.field1122, (byte) -80);
                                    } while (var10 == null || var10.field1092 == null || var9.field1190 >= var10.field1092.length || var10.field1092[var9.field1190] != var9);
                                    class8.method34(var8, arg0 ^ 0x11);
                                }
                            }
                            var6 = var5.field4120;
                            if (var6.field1190 < 0) {
                                break;
                            }
                            var7 = class54.method367(var6.field1122, (byte) -80);
                        } while (var7 == null || var7.field1092 == null || var6.field1190 >= var7.field1092.length || var7.field1092[var6.field1190] != var6);
                        class8.method34(var5, arg0 + 15);
                    }
                }
                var3 = var2.field4120;
                if (var3.field1190 < 0) {
                    break;
                }
                var4 = class54.method367(var3.field1122, (byte) -80);
            } while (var4 == null || var4.field1092 == null || var4.field1092.length <= var3.field1190 || var4.field1092[var3.field1190] != var3);
            class8.method34(var2, 16);
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    private final void method590(byte arg0) {
        if (arg0 != -122) {
            return;
        }
        field1634++;
        boolean var2 = class103.method712(-127);
        if (!var2) {
            this.method593(0);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public static void method591(boolean arg0) {
        if (arg0) {
            field1648 = null;
            field1647 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method256(int arg0) {
        field1649++;
        if (arg0 != 2 || class244.field4258 == 1000) {
            return;
        }
        class75.field1501++;
        if ((class75.field1501 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class59.field1014 = var2.get(11) * 600 - (-(var2.get(12) * 10) - var2.get(13) / 6);
            class124.field2331.setSeed((long) class59.field1014);
        }
        this.method590((byte) -122);
        class85.method603((byte) -38);
        class12.method52(true);
        class129.method901(16322);
        class175.method1179(arg0 ^ 0x7C);
        class248.method1632(-1);
        if (class66.field1276 != null) {
            int var3 = class66.field1276.method45(false);
            class161.field2887 = var3;
        }
        if (class244.field4258 == 0) {
            this.method586((byte) 68);
            class203.method1319((byte) 104);
        } else if (class244.field4258 == 5) {
            this.method586((byte) 68);
            class203.method1319((byte) 50);
        } else if (class244.field4258 == 25 || class244.field4258 == 28) {
            class196.method1281(94);
        }
        if (class244.field4258 == 10) {
            this.method589(1);
            class129.method902((byte) 42);
            class230.method1495(false);
        } else if (class244.field4258 == 30) {
            class62.method404(true);
        } else if (class244.field4258 == 40) {
            class230.method1495(false);
            if (class184.field3217 != -3) {
                if (class184.field3217 == 15) {
                    class163.method1101(2);
                } else if (class184.field3217 != 2) {
                    class45.method325(arg0 + 62);
                    return;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lha;)I")
    public static final int method592(class63 arg0) {
        class49 var1 = (class49) class61.field1032.method1381(((long) arg0.field1115 << 32) + (long) arg0.field1190, 109);
        return var1 == null ? arg0.field1086 : var1.field873;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method593(int arg0) {
        field1651++;
        if (arg0 != 0) {
            return;
        }
        if (class95.field1831 >= 4) {
            this.method240(arg0 + 690, "js5crc");
            class244.field4258 = 1000;
            return;
        }
        if (class49.field880 >= 4) {
            if (class244.field4258 == 0 || class244.field4258 == 5) {
                this.method240(690, "js5io");
                class244.field4258 = 1000;
                return;
            }
            class160.field2876 = 3000;
            class49.field880 = 3;
        }
        if ((class160.field2876--) > 0) {
            return;
        }
        try {
            if (class238.field4140 == 0) {
                class12.field150 = class95.field1835.method771(class35.field518, (byte) 115, class89.field1732);
                class238.field4140++;
            }
            if (class238.field4140 == 1) {
                if (class12.field150.field4066 == 2) {
                    this.method595(-5, -1);
                    return;
                }
                if (class12.field150.field4066 == 1) {
                    class238.field4140++;
                }
            }
            if (class238.field4140 == 2) {
                class193.field3349 = new class196((Socket) class12.field150.field4069, class95.field1835);
                class249 var2 = new class249(5);
                var2.method1638(32, 15);
                var2.method1666(544537784, 508);
                class193.field3349.method1273(0, (byte) 82, 5, var2.field4350);
                class238.field4140++;
                class107.field2101 = class3.method13(17161);
            }
            if (class238.field4140 == 3) {
                if (class244.field4258 == 0 || class244.field4258 == 5 || class193.field3349.method1280((byte) 102) > 0) {
                    int var3 = class193.field3349.method1276(96);
                    if (var3 != 0) {
                        this.method595(-5, var3);
                        return;
                    }
                    class238.field4140++;
                } else if ((class3.method13(arg0 + 17161) - class107.field2101) > 30000L) {
                    this.method595(arg0 - 5, -2);
                    return;
                }
            }
            if (class238.field4140 == 4) {
                boolean var4 = class244.field4258 == 5 || class244.field4258 == 10 || class244.field4258 == 28;
                class215.method1388(class193.field3349, false, !var4);
                class100.field1959 = 0;
                class12.field150 = null;
                class238.field4140 = 0;
                class193.field3349 = null;
            }
        } catch (IOException var5) {
            this.method595(-5, -3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lha;IIIIIII)V")
    public static final void method594(class63[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class63 var9 = arg0[var8];
            if (var9 != null && var9.field1122 == arg1 && (!var9.field1186 || var9.field1219 == 0 || var9.field1174 || method592(var9) != 0 || class135.field2502 == var9 || var9.field1131 == 1338) && (!var9.field1186 || !method596(var9))) {
                int var10 = var9.field1138 + arg6;
                int var11 = var9.field1226 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field1219 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field1215 + var10;
                    int var17 = var9.field1196 + var11;
                    if (var9.field1219 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class241.field4187 == var9) {
                    class139.field2577 = true;
                    class85.field1668 = var10;
                    class110.field2121 = var11;
                }
                if (!var9.field1186 || var12 < var14 && var13 < var15) {
                    if (var9.field1219 == 0) {
                        if (!var9.field1186 && method596(var9) && class158.field2850 != var9) {
                            continue;
                        }
                        if (var9.field1239 && class170.field3021 >= var12 && class50.field896 >= var13 && class170.field3021 < var14 && class50.field896 < var15) {
                            for (class237 var18 = (class237) class111.field2145.method873((byte) 76); var18 != null; var18 = (class237) class111.field2145.method870((byte) -110)) {
                                if (var18.field4123) {
                                    var18.method560(-17554);
                                }
                            }
                            if (class254.field4466 == 0) {
                                class241.field4187 = null;
                                class135.field2502 = null;
                            }
                            class49.field874 = false;
                        }
                    }
                    if (var9.field1186) {
                        boolean var19;
                        if (class170.field3021 >= var12 && class50.field896 >= var13 && class170.field3021 < var14 && class50.field896 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class30.field452 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class264.field4627 == 1 && class188.field3274 >= var12 && class174.field3068 >= var13 && class188.field3274 < var14 && class174.field3068 < var15) {
                            var21 = true;
                        }
                        if (class155.field2762 > 0 && var9.field1230 != null) {
                            for (int var22 = 0; var22 < var9.field1230.length; var22++) {
                                for (int var23 = 0; var23 < class155.field2762; var23++) {
                                    int var24 = var9.field1230[var22] & 0xFF;
                                    if (class94.field1819[var23] == var24) {
                                        class112.method757(var9.field1115, (byte) 111, var22 + 1, class85.field1679, -1);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class114.method762(class188.field3274 - var10, class174.field3068 - var11, -4798, var9);
                        }
                        if (class241.field4187 != null && class241.field4187 != var9 && var19 && class199.method1299(32157, method592(var9))) {
                            class20.field272 = var9;
                        }
                        if (class135.field2502 == var9) {
                            class217.field3740 = true;
                            class188.field3270 = var10;
                            class215.field3691 = var11;
                        }
                        if (var9.field1174 || var9.field1131 != 0) {
                            if (var19 && class161.field2887 != 0 && var9.field1171 != null) {
                                class237 var25 = new class237();
                                var25.field4123 = true;
                                var25.field4120 = var9;
                                var25.field4113 = class161.field2887;
                                var25.field4118 = var9.field1171;
                                class111.field2145.method866(var25, true);
                            }
                            if (class241.field4187 != null || class51.field902 != null || class115.field2177 || var9.field1131 != 1400 && class49.field874) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field1131 != 0) {
                                if (var9.field1131 == 1337) {
                                    class154.field2751 = var9;
                                    class215.method1385(var9, -120);
                                    continue;
                                }
                                if (var9.field1131 == 1338) {
                                    if (var21) {
                                        class57.method386(99, var9, class174.field3068 - var11, class188.field3274 - var10);
                                    }
                                    continue;
                                }
                                if (var9.field1131 == 1400) {
                                    class80.field1573 = var9;
                                    if (var21) {
                                        if (class167.field3009[82] && class130.field2430 > 0) {
                                            int var26 = (int) ((double) (class188.field3274 - var10 - var9.field1215 / 2) * 2.0D / (double) class35.field527);
                                            int var27 = (int) ((double) (class174.field3068 - var11 - var9.field1196 / 2) * 2.0D / (double) class35.field527);
                                            int var28 = class144.field2635 + var26;
                                            int var29 = class192.field3323 + var27;
                                            int var30 = class73.field1439 + var28;
                                            int var31 = class89.field1727 + class16.field208 - var29 - 1;
                                            class222.method1416(var30, 0, var31, 24867);
                                            class203.method1312(636);
                                            continue;
                                        }
                                        class49.field874 = true;
                                        class164.field2934 = class170.field3021;
                                        class183.field3199 = class50.field896;
                                        class40.field624 = class144.field2635;
                                        class206.field3555 = class192.field3323;
                                        continue;
                                    }
                                    if (var20 && class49.field874) {
                                        class132.method918((int) ((double) (class164.field2934 - class170.field3021) * 2.0D / (double) class69.field1399) + class40.field624, -1);
                                        class2.method7((int) ((double) (class183.field3199 - class50.field896) * 2.0D / (double) class69.field1399) + class206.field3555, 112);
                                        continue;
                                    }
                                    class49.field874 = false;
                                    continue;
                                }
                                if (var9.field1131 == 1401) {
                                    if (var20) {
                                        class142.method985(var9.field1196, false, class50.field896 - var11, var9.field1215, class170.field3021 - var10);
                                    }
                                    continue;
                                }
                                if (var9.field1131 == 1402) {
                                    class215.method1385(var9, -121);
                                    continue;
                                }
                                if (var9.field1131 == 1404) {
                                    class215.method1385(var9, -119);
                                    continue;
                                }
                            }
                            if (!var9.field1173 && var21) {
                                var9.field1173 = true;
                                if (var9.field1111 != null) {
                                    class237 var32 = new class237();
                                    var32.field4123 = true;
                                    var32.field4120 = var9;
                                    var32.field4121 = class188.field3274 - var10;
                                    var32.field4113 = class174.field3068 - var11;
                                    var32.field4118 = var9.field1111;
                                    class111.field2145.method866(var32, true);
                                }
                            }
                            if (var9.field1173 && var20 && var9.field1234 != null) {
                                class237 var33 = new class237();
                                var33.field4123 = true;
                                var33.field4120 = var9;
                                var33.field4121 = class170.field3021 - var10;
                                var33.field4113 = class50.field896 - var11;
                                var33.field4118 = var9.field1234;
                                class111.field2145.method866(var33, true);
                            }
                            if (var9.field1173 && !var20) {
                                var9.field1173 = false;
                                if (var9.field1113 != null) {
                                    class237 var34 = new class237();
                                    var34.field4123 = true;
                                    var34.field4120 = var9;
                                    var34.field4121 = class170.field3021 - var10;
                                    var34.field4113 = class50.field896 - var11;
                                    var34.field4118 = var9.field1113;
                                    class138.field2535.method866(var34, true);
                                }
                            }
                            if (var20 && var9.field1144 != null) {
                                class237 var35 = new class237();
                                var35.field4123 = true;
                                var35.field4120 = var9;
                                var35.field4121 = class170.field3021 - var10;
                                var35.field4113 = class50.field896 - var11;
                                var35.field4118 = var9.field1144;
                                class111.field2145.method866(var35, true);
                            }
                            if (!var9.field1228 && var19) {
                                var9.field1228 = true;
                                if (var9.field1107 != null) {
                                    class237 var36 = new class237();
                                    var36.field4123 = true;
                                    var36.field4120 = var9;
                                    var36.field4121 = class170.field3021 - var10;
                                    var36.field4113 = class50.field896 - var11;
                                    var36.field4118 = var9.field1107;
                                    class111.field2145.method866(var36, true);
                                }
                            }
                            if (var9.field1228 && var19 && var9.field1161 != null) {
                                class237 var37 = new class237();
                                var37.field4123 = true;
                                var37.field4120 = var9;
                                var37.field4121 = class170.field3021 - var10;
                                var37.field4113 = class50.field896 - var11;
                                var37.field4118 = var9.field1161;
                                class111.field2145.method866(var37, true);
                            }
                            if (var9.field1228 && !var19) {
                                var9.field1228 = false;
                                if (var9.field1095 != null) {
                                    class237 var38 = new class237();
                                    var38.field4123 = true;
                                    var38.field4120 = var9;
                                    var38.field4121 = class170.field3021 - var10;
                                    var38.field4113 = class50.field896 - var11;
                                    var38.field4118 = var9.field1095;
                                    class138.field2535.method866(var38, true);
                                }
                            }
                            if (var9.field1201 != null) {
                                class237 var39 = new class237();
                                var39.field4120 = var9;
                                var39.field4118 = var9.field1201;
                                class241.field4204.method866(var39, true);
                            }
                            if (var9.field1198 != null && class138.field2547 > var9.field1202) {
                                if (var9.field1223 == null || class138.field2547 - var9.field1202 > 32) {
                                    class237 var44 = new class237();
                                    var44.field4120 = var9;
                                    var44.field4118 = var9.field1198;
                                    class111.field2145.method866(var44, true);
                                } else {
                                    label543: for (int var40 = var9.field1202; var40 < class138.field2547; var40++) {
                                        int var41 = class174.field3064[var40 & 0x1F];
                                        for (int var42 = 0; var42 < var9.field1223.length; var42++) {
                                            if (var9.field1223[var42] == var41) {
                                                class237 var43 = new class237();
                                                var43.field4120 = var9;
                                                var43.field4118 = var9.field1198;
                                                class111.field2145.method866(var43, true);
                                                break label543;
                                            }
                                        }
                                    }
                                }
                                var9.field1202 = class138.field2547;
                            }
                            if (var9.field1158 != null && class49.field879 > var9.field1200) {
                                if (var9.field1103 == null || class49.field879 - var9.field1200 > 32) {
                                    class237 var49 = new class237();
                                    var49.field4120 = var9;
                                    var49.field4118 = var9.field1158;
                                    class111.field2145.method866(var49, true);
                                } else {
                                    label519: for (int var45 = var9.field1200; var45 < class49.field879; var45++) {
                                        int var46 = class180.field3153[var45 & 0x1F];
                                        for (int var47 = 0; var47 < var9.field1103.length; var47++) {
                                            if (var9.field1103[var47] == var46) {
                                                class237 var48 = new class237();
                                                var48.field4120 = var9;
                                                var48.field4118 = var9.field1158;
                                                class111.field2145.method866(var48, true);
                                                break label519;
                                            }
                                        }
                                    }
                                }
                                var9.field1200 = class49.field879;
                            }
                            if (var9.field1109 != null && class17.field233 > var9.field1178) {
                                if (var9.field1110 == null || class17.field233 - var9.field1178 > 32) {
                                    class237 var54 = new class237();
                                    var54.field4120 = var9;
                                    var54.field4118 = var9.field1109;
                                    class111.field2145.method866(var54, true);
                                } else {
                                    label495: for (int var50 = var9.field1178; var50 < class17.field233; var50++) {
                                        int var51 = class163.field2925[var50 & 0x1F];
                                        for (int var52 = 0; var52 < var9.field1110.length; var52++) {
                                            if (var9.field1110[var52] == var51) {
                                                class237 var53 = new class237();
                                                var53.field4120 = var9;
                                                var53.field4118 = var9.field1109;
                                                class111.field2145.method866(var53, true);
                                                break label495;
                                            }
                                        }
                                    }
                                }
                                var9.field1178 = class17.field233;
                            }
                            if (var9.field1160 != null && class237.field4124 > var9.field1212) {
                                if (var9.field1210 == null || class237.field4124 - var9.field1212 > 32) {
                                    class237 var59 = new class237();
                                    var59.field4120 = var9;
                                    var59.field4118 = var9.field1160;
                                    class111.field2145.method866(var59, true);
                                } else {
                                    label471: for (int var55 = var9.field1212; var55 < class237.field4124; var55++) {
                                        int var56 = class21.field292[var55 & 0x1F];
                                        for (int var57 = 0; var57 < var9.field1210.length; var57++) {
                                            if (var9.field1210[var57] == var56) {
                                                class237 var58 = new class237();
                                                var58.field4120 = var9;
                                                var58.field4118 = var9.field1160;
                                                class111.field2145.method866(var58, true);
                                                break label471;
                                            }
                                        }
                                    }
                                }
                                var9.field1212 = class237.field4124;
                            }
                            if (var9.field1184 != null && class98.field1915 > var9.field1162) {
                                if (var9.field1214 == null || class98.field1915 - var9.field1162 > 32) {
                                    class237 var64 = new class237();
                                    var64.field4120 = var9;
                                    var64.field4118 = var9.field1184;
                                    class111.field2145.method866(var64, true);
                                } else {
                                    label447: for (int var60 = var9.field1162; var60 < class98.field1915; var60++) {
                                        int var61 = class31.field470[var60 & 0x1F];
                                        for (int var62 = 0; var62 < var9.field1214.length; var62++) {
                                            if (var9.field1214[var62] == var61) {
                                                class237 var63 = new class237();
                                                var63.field4120 = var9;
                                                var63.field4118 = var9.field1184;
                                                class111.field2145.method866(var63, true);
                                                break label447;
                                            }
                                        }
                                    }
                                }
                                var9.field1162 = class98.field1915;
                            }
                            if (class153.field2723 > var9.field1159 && var9.field1135 != null) {
                                class237 var65 = new class237();
                                var65.field4120 = var9;
                                var65.field4118 = var9.field1135;
                                class111.field2145.method866(var65, true);
                            }
                            if (class252.field4434 > var9.field1159 && var9.field1166 != null) {
                                class237 var66 = new class237();
                                var66.field4120 = var9;
                                var66.field4118 = var9.field1166;
                                class111.field2145.method866(var66, true);
                            }
                            if (class85.field1670 > var9.field1159 && var9.field1194 != null) {
                                class237 var67 = new class237();
                                var67.field4120 = var9;
                                var67.field4118 = var9.field1194;
                                class111.field2145.method866(var67, true);
                            }
                            if (class36.field538 > var9.field1159 && var9.field1195 != null) {
                                class237 var68 = new class237();
                                var68.field4120 = var9;
                                var68.field4118 = var9.field1195;
                                class111.field2145.method866(var68, true);
                            }
                            if (class26.field326 > var9.field1159 && var9.field1197 != null) {
                                class237 var69 = new class237();
                                var69.field4120 = var9;
                                var69.field4118 = var9.field1197;
                                class111.field2145.method866(var69, true);
                            }
                            var9.field1159 = class15.field199;
                            if (var9.field1191 != null) {
                                for (int var70 = 0; var70 < class155.field2762; var70++) {
                                    class237 var71 = new class237();
                                    var71.field4120 = var9;
                                    var71.field4111 = class94.field1819[var70];
                                    var71.field4122 = class91.field1753[var70];
                                    var71.field4118 = var9.field1191;
                                    class111.field2145.method866(var71, true);
                                }
                            }
                            if (class66.field1294 && var9.field1124 != null) {
                                class237 var72 = new class237();
                                var72.field4120 = var9;
                                var72.field4118 = var9.field1124;
                                class111.field2145.method866(var72, true);
                            }
                        }
                    }
                    if (!var9.field1186 && class241.field4187 == null && class51.field902 == null && !class115.field2177) {
                        if ((var9.field1167 >= 0 || var9.field1151 != 0) && class170.field3021 >= var12 && class50.field896 >= var13 && class170.field3021 < var14 && class50.field896 < var15) {
                            if (var9.field1167 >= 0) {
                                class158.field2850 = arg0[var9.field1167];
                            } else {
                                class158.field2850 = var9;
                            }
                        }
                        if (var9.field1219 == 8 && class170.field3021 >= var12 && class50.field896 >= var13 && class170.field3021 < var14 && class50.field896 < var15) {
                            class255.field4484 = var9;
                        }
                        if (var9.field1117 > var9.field1196) {
                            class57.method384(var11, var9, var9.field1196, var9.field1117, 25504, var9.field1215 + var10, class50.field896, class170.field3021);
                        }
                    }
                    if (var9.field1219 == 0) {
                        method594(arg0, var9.field1115, var12, var13, var14, var15, var10 - var9.field1170, var11 - var9.field1141);
                        if (var9.field1092 != null) {
                            method594(var9.field1092, var9.field1115, var12, var13, var14, var15, var10 - var9.field1170, var11 - var9.field1141);
                        }
                        class75 var73 = (class75) class230.field3981.method1381((long) var9.field1115, 84);
                        if (var73 != null) {
                            class171.method1163(-114, var73.field1492, var14, var13, var11, var10, var12, var15);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method247(int arg0) {
        method591(true);
        class66.method449((byte) -112);
        class181.method1208(true);
        field1645++;
        class240.method1579(25465);
        class114.method761((byte) -84);
        class40.method246((byte) -26);
        class91.method635(-116);
        class145.method996((byte) 116);
        class238.method1570((byte) -127);
        class76.method542(8);
        class249.method1689(false);
        class196.method1282((byte) -12);
        class247.method1628(-677379135);
        class139.method960(true);
        class86.method607((byte) 102);
        class245.method1612((byte) 127);
        class83.method579(false);
        class125.method861(0);
        class165.method1122((byte) -105);
        class63.method422(104);
        class45.method326((byte) 63);
        class215.method1390(0);
        class11.method47(1);
        class56.method371(true);
        class129.method898(true);
        class256.method1719((byte) -126);
        class43.method307((byte) 105);
        class241.method1587((byte) -90);
        class32.method182(-26412);
        class101.method695(63);
        class224.method1421(31891);
        class107.method729(2);
        class16.method65(0);
        class14.method61((byte) 68);
        class206.method1338(1);
        class75.method537(true);
        class80.method556(-120);
        class167.method1133(-74);
        class64.method436((byte) 117);
        class60.method392(-121);
        class158.method1080(29889);
        class172.method1170((byte) -52);
        class244.method1605(64);
        class251.method1697((byte) 126);
        class48.method338((byte) 102);
        class209.method1356(-5);
        class231.method1518(0);
        class171.method1164(0);
        class87.method615(true);
        class28.method153(71);
        class118.method790();
        class103.method718(8412);
        class157.method1072(-1);
        class229.method1469();
        class252.method1699(24205);
        class131.method910(-20033);
        class3.method14((byte) 127);
        class218.method1400(0);
        class211.method1366((byte) -126);
        class146.method1006(5756);
        class133.method924(false);
        class174.method1177(110);
        class264.method1789(112);
        class29.method165(-1);
        class39.method236();
        class88.method627(-1);
        class44.method320(24);
        class259.method1771((byte) -9);
        class20.method90(123);
        class47.method334(-1154);
        class127.method881(162);
        class90.method633((byte) -123);
        class140.method968(156);
        class162.method1094((byte) 29);
        class213.method1373();
        class102.method702((byte) -82);
        class230.method1499((byte) 69);
        class62.method415(6287);
        class123.method835();
        class235.method1539();
        class77.method549(-116);
        class154.method1049(499);
        class202.method1308(-99);
        class98.method673(0);
        class242.method1597((byte) -65);
        class25.method108(false);
        class228.method1458();
        class193.method1262(20);
        class243.method1599(true);
        class115.method765(0);
        class54.method365((byte) -63);
        class254.method1707(32125);
        class128.method887();
        class85.method600(-57);
        class219.method1407(-1);
        class250.method1691(-97);
        class178.method1189(32768);
        class30.method169(true);
        class1.method5(-46);
        class194.method1267(true);
        class190.method1252((byte) -28);
        class93.method643(133988164);
        class184.method1223(-23562);
        class170.method1159((byte) 71);
        class248.method1631(988656400);
        class73.method518((byte) 120);
        class234.method1529(113);
        class173.method1175((byte) -121);
        class198.method1293((byte) 23);
        class153.method1046(0);
        class41.method270(1);
        class222.method1417(10);
        class57.method383(0);
        class89.method632(-11);
        class61.method397(0);
        class112.method754(1);
        class155.method1055(-2);
        class183.method1222(-2);
        class237.method1567(-108);
        class36.method202(true);
        class257.method1725((byte) -119);
        class192.method1258(0);
        class151.method1027(1);
        class197.method1286(false);
        class15.method62(-1);
        class217.method1396(0);
        class149.method1016(-1);
        class94.method650(5285);
        class51.method355((byte) 116);
        class191.method1254();
        class78.method553(-1);
        class255.method1710(1);
        class143.method988(32767);
        class97.method672(true);
        class52.method356(2);
        class49.method346(0);
        class7.method26(31756);
        class260.method1775(-104);
        class100.method687(0);
        class134.method928(0);
        class9.method39((byte) 127);
        class17.method68(27392);
        class253.method1702((byte) 106);
        class42.method275(-123);
        class38.method209(25);
        class27.method122((byte) -98);
        class263.method1785(0);
        class225.method1437(125);
        class109.method739(0);
        class156.method1061(true);
        class212.method1370(-840517817);
        class246.method1619(190);
        class82.method566(false);
        class203.method1317((byte) 87);
        class5.method21();
        class13.method59();
        class179.method1195();
        int var2 = 9 / ((arg0 + 12) / 38);
        class227.method1446();
        class226.method1439(18002);
        class207.method1348(304);
        class147.method1011(121);
        class74.method534();
        class204.method1322();
        class214.method1378(96);
        class99.method677((byte) 50);
        class188.method1240((byte) -37);
        class201.method1304(-106);
        class110.method745(124);
        class121.method820((byte) 103);
        class111.method751(100);
        class175.method1180((byte) -69);
        class67.method494(-31601);
        class35.method198(-19267);
        class79.method555(1);
        class122.method827(0);
        class124.method856(false);
        class130.method905(1);
        class8.method31(-119);
        class195.method1270((byte) -57);
        class84.method584(9071);
        class59.method387(-108);
        class24.method105((byte) 25);
        class12.method51(-15578);
        class208.method1354(true);
        class164.method1103(-1);
        class199.method1301(1);
        class31.method180(0);
        class161.method1092(115);
        class261.method1781(-68);
        class205.method1329((byte) -47);
        class233.method1522((byte) -65);
        class21.method93(-1);
        class144.method990(0);
        class182.method1212(-22338);
        class135.method930((byte) -27);
        class120.method816(-123);
        class223.method1418(121);
        class163.method1100(-26774);
        class166.method1129(4096);
        class70.method509(0);
        class105.method724(208);
        class136.method936(0);
        class150.method1019((byte) -126);
        class180.method1202((byte) 120);
        class69.method502(128);
        class220.method1408(-85);
        class10.method43(9927);
        class34.method194((byte) -127);
        class187.method1236((byte) 9);
        class68.method498((byte) 126);
        class176.method1184(-80);
        class96.method663((byte) -66);
        class2.method8((byte) 24);
        class119.method814(32655);
        class189.method1245((byte) 45);
        class95.method656((byte) 15);
        class72.method515((byte) -63);
        class4.method16(1);
        class81.method562((byte) 26);
        class216.method1393((byte) 74);
        class159.method1081(1152);
        class26.method113(110);
        class132.method919(61);
        class200.method1303(92);
        class53.method364(26507);
        class33.method190((byte) -80);
        class142.method983(125);
        class50.method349(-28590);
        class160.method1087((byte) 15);
        class19.method73(0);
        class138.method952(112);
        if (class40.field664) {
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method250(int arg0) {
        class124.method859(class95.field1835, (byte) -104, class72.field1425);
        class151.field2707 = ~class81.field1585 == arg0 ? 443 : class61.field1028 + 50000;
        field1652++;
        if (class163.field2921 == 1) {
            class115.field2176 = class181.field3173;
            class29.field433 = class134.field2492;
            class34.field509 = class78.field1546;
            class87.field1705 = class19.field263;
        } else {
            class115.field2176 = class214.field3674;
            class29.field433 = class53.field932;
            class34.field509 = class182.field3193;
            class87.field1705 = class2.field15;
        }
        class111.field2136 = class81.field1585 == 0 ? 43594 : class61.field1028 + 40000;
        class246.field4291 = class9.field93 = class164.field2935 = class184.field3226 = new short[256];
        class89.field1732 = class111.field2136;
        class246.method1621((byte) -109);
        class190.method1247(class131.field2452, 1611550343);
        class27.method114(arg0 + 52, class131.field2452);
        class66.field1276 = class198.method1294((byte) 80);
        if (class66.field1276 != null) {
            class66.field1276.method50(class131.field2452, true);
        }
        class93.field1802 = class117.field2196;
        try {
            if (class95.field1835.field2187 != null) {
                class256.field4503 = new class139(class95.field1835.field2187, 5200, 0);
                for (int var2 = 0; var2 < 27; var2++) {
                    class42.field691[var2] = new class139(class95.field1835.field2181[var2], 6000, 0);
                }
                class72.field1422 = new class139(class95.field1835.field2199, 6000, 0);
                class155.field2757 = new class86(255, class256.field4503, class72.field1422, 500000);
                class59.field991 = new class139(class95.field1835.field2183, 24, 0);
                class95.field1835.field2183 = null;
                class95.field1835.field2199 = null;
                class95.field1835.field2187 = null;
                class95.field1835.field2181 = null;
            }
        } catch (IOException var3) {
            class256.field4503 = null;
            class59.field991 = null;
            class72.field1422 = null;
            class155.field2757 = null;
        }
        if (class81.field1585 != 0) {
            class15.field185 = true;
        }
        class17.field237 = class234.field4090;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    private final void method595(int arg0, int arg1) {
        field1637++;
        if (arg0 != -5) {
            this.method250(-31);
        }
        class12.field150 = null;
        class238.field4140 = 0;
        if (class89.field1732 == class111.field2136) {
            class89.field1732 = class151.field2707;
        } else {
            class89.field1732 = class111.field2136;
        }
        class100.field1959++;
        class193.field3349 = null;
        if (class100.field1959 >= 2 && (arg1 == 7 || arg1 == 9)) {
            if (class244.field4258 == 0 || class244.field4258 == 5) {
                this.method240(arg0 ^ 0xFFFFFD49, "js5connect_full");
                class244.field4258 = 1000;
            } else {
                class160.field2876 = 3000;
            }
        } else if (class100.field1959 >= 2 && arg1 == 6) {
            this.method240(690, "js5connect_outofdate");
            class244.field4258 = 1000;
        } else if (class100.field1959 >= 4) {
            if (class244.field4258 == 0 || class244.field4258 == 5) {
                this.method240(690, "js5connect");
                class244.field4258 = 1000;
            } else {
                class160.field2876 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lha;)Z")
    public static final boolean method596(class63 arg0) {
        if (class102.field1999) {
            if (method592(arg0) != 0) {
                return false;
            }
            if (arg0.field1219 == 0) {
                return false;
            }
        }
        return arg0.field1087;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method239(byte arg0) {
        field1642++;
        if (class244.field4258 == 1000) {
            return;
        }
        boolean var2 = class163.method1099(0);
        if (var2 && class252.field4431 && class31.field461 != null) {
            class31.field461.method1588((byte) -100);
        }
        if (arg0 >= -56) {
            this.init();
        }
        boolean var3 = false;
        if (class244.field4258 == 30 || class244.field4258 == 10) {
            if (class176.field3098) {
                class103.method709(-1);
            } else if (class3.field40 != 0L && class3.method13(17161) > class3.field40) {
                class103.method709(-1);
            }
        }
        if (class64.field1258 != 0L && class3.method13(17161) > class64.field1258 && class101.field1972 != null && (class244.field4258 == 30 || class244.field4258 == 25)) {
            class77.method551((byte) -118);
        }
        if (class89.field1721) {
            var3 = true;
            class89.field1721 = false;
        }
        if (var3) {
            class145.method994(0);
        }
        if (class244.field4258 == 0) {
            class8.method38(class208.field3599, (Color) null, class237.field4116, var3, 23189);
        } else if (class244.field4258 == 5) {
            class207.method1345(class59.field1016, -27931);
        } else if (class244.field4258 == 10) {
            class87.method617((byte) 46);
        } else if (class244.field4258 == 25 || class244.field4258 == 28) {
            if (class28.field426 == 1) {
                if (class38.field568 < class199.field3434) {
                    class38.field568 = class199.field3434;
                }
                int var5 = (class38.field568 - class199.field3434) * 50 / class38.field568;
                class250.method1693(false, class212.method1372(2, new class66[] { class199.field3428, class86.field1690, class144.method989(var5, 0), class79.field1552 }), -16678);
            } else if (class28.field426 == 2) {
                if (class63.field1248 > class96.field1842) {
                    class96.field1842 = class63.field1248;
                }
                int var4 = ((class96.field1842 - class63.field1248) * 50 / class96.field1842) + 50;
                class250.method1693(false, class212.method1372(2, new class66[] { class199.field3428, class86.field1690, class144.method989(var4, 0), class79.field1552 }), -16678);
            } else {
                class250.method1693(false, class199.field3428, -16678);
            }
        } else if (class244.field4258 == 30) {
            class164.method1104(true);
        } else if (class244.field4258 == 40) {
            class250.method1693(false, class212.method1372(2, new class66[] { class145.field2644, class143.field2616, class224.field3829 }), -16678);
        }
        if ((class244.field4258 == 30 || class244.field4258 == 10) && class26.field335 == 0 && !var3) {
            try {
                Graphics var6 = class131.field2452.getGraphics();
                for (int var7 = 0; var7 < class87.field1701; var7++) {
                    if (class142.field2607[var7]) {
                        class52.field908.method124(var6, true, class157.field2827[var7], class246.field4293[var7], class181.field3167[var7], class45.field831[var7]);
                        class142.field2607[var7] = false;
                    }
                }
            } catch (Exception var14) {
                class131.field2452.repaint();
            }
        } else if (class244.field4258 != 0) {
            try {
                Graphics var8 = class131.field2452.getGraphics();
                class52.field908.method121(73, 0, 0, var8);
                for (int var9 = 0; var9 < class87.field1701; var9++) {
                    class142.field2607[var9] = false;
                }
            } catch (Exception var13) {
                class131.field2452.repaint();
            }
        }
        if (class248.field4327) {
            class180.method1203((byte) -128);
        }
        if (!browsercontrol.iscreated() || class181.field3166 == 0) {
            return;
        }
        try {
            Point var10 = class131.field2452.getLocationOnScreen();
            Dimension var11 = class131.field2452.getSize();
            browsercontrol.set_position(var10.x, var10.y - class181.field3166, var11.width, class181.field3166);
        } catch (Exception var12) {
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length < 7 || arg0.length > 8) {
                class28.method126(28);
            }
            class61.field1028 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class81.field1585 = 0;
            } else if (arg0[1].equals("office")) {
                class81.field1585 = 1;
            } else if (arg0[1].equals("local")) {
                class81.field1585 = 2;
            } else {
                class28.method126(-5);
            }
            if (arg0[2].equals("live")) {
                class92.field1777 = 0;
            } else if (arg0[2].equals("rc")) {
                class92.field1777 = 1;
            } else if (arg0[2].equals("wip")) {
                class92.field1777 = 2;
            } else {
                class28.method126(126);
            }
            if (arg0[4].equals("free")) {
                class260.field4587 = false;
            } else if (arg0[4].equals("members")) {
                class260.field4587 = true;
            } else {
                class28.method126(116);
            }
            if (arg0[5].equals("english")) {
                class69.field1401 = 0;
            } else if (arg0[5].equals("german")) {
                class27.method123(-40);
                class69.field1401 = 1;
            } else {
                class28.method126(-44);
            }
            if (arg0[6].equals("game0")) {
                class163.field2921 = 0;
            } else if (arg0[6].equals("game1")) {
                class163.field2921 = 1;
            } else {
                class28.method126(114);
            }
            if (arg0.length != 8) {
                class72.field1425 = false;
            } else if (arg0[7].equals("safemode")) {
                class72.field1425 = true;
            } else {
                class28.method126(127);
            }
            class35.field518 = "127.0.0.1";
            class42.field692 = class85.field1679;
            class182.field3194 = 0;
            client var1 = new client();
            var1.method245(765, 503, 109, 27, "runescape", 508, class92.field1777 + 32);
            class158.field2857.setLocation(40, 40);
        } catch (Exception var3) {
            class181.method1205((String) null, var3, 38);
        }
        field1646++;
    }
}
