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
public class client extends class388 {

    @OriginalMember(owner = "client!client", name = "T", descriptor = "Lqe;")
    public static class274 field2299 = new class274();

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Z")
    public static boolean field2314;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 4)
    public final void method1098(int arg0) {
        field2309++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class78.method432(503);
        class452.field6471 = new class448(class14.field185);
        class73.field879 = new class360();
        if (class411.field5900 != 0) {
            class50.field602 = new byte[50][];
        }
        class337.method2171((byte) 22, class14.field185);
        if (arg0 != 2268) {
            return;
        }
        if (class237.field3389 == 0) {
            class253.field3616 = this.getCodeBase().getHost();
            class419.field5989 = 43594;
            class250.field3569 = 443;
        } else if (class237.field3389 == 1) {
            class253.field3616 = this.getCodeBase().getHost();
            class419.field5989 = class118.field1444 + 40000;
            class250.field3569 = class118.field1444 + 50000;
        } else if (class237.field3389 == 2) {
            class253.field3616 = "127.0.0.1";
            class419.field5989 = class118.field1444 + 40000;
            class250.field3569 = class118.field1444 + 50000;
        }
        class154.field1904 = class419.field5989;
        class276.field3917 = class250.field3569;
        class310.field4384 = class253.field3616;
        class99.field1207 = class419.field5989;
        class297.field4149 = class99.field1207;
        if (class384.field5425 == 1) {
            class39.field446 = 16777215;
            class279.field3947 = class359.field5118;
            class247.field3530 = true;
            class202.field2904 = class410.field5897;
            class235.field3293 = class184.field2540;
            class50.field601 = class341.field4825;
            class32.field371 = 0;
        } else {
            class279.field3947 = class244.field3457;
            class235.field3293 = class55.field660;
            class50.field601 = class443.field6356;
            class202.field2904 = class442.field6338;
        }
        class25.field312 = class451.field6453 = class23.field283 = class369.field5215 = new short[256];
        if (class185.field2686 == 3) {
            class397.field5685 = class118.field1444;
        }
        class441.field6334 = class291.method1927(112, class402.field5767);
        class306.field4306 = class48.method279((byte) -114, true, class402.field5767);
        class24.field302 = class167.method1131(-9088);
        if (class24.field302 != null) {
            class24.field302.method1424(class402.field5767, (byte) -128);
        }
        class383.field5406 = class185.field2686;
        try {
            if (class14.field185.field2683 != null) {
                class11.field146 = new class392(class14.field185.field2683, 5200, 0);
                for (int var3 = 0; var3 < 29; var3++) {
                    class327.field4644[var3] = new class392(class14.field185.field2680[var3], 6000, 0);
                }
                class248.field3550 = new class392(class14.field185.field2690, 6000, 0);
                class365.field5184 = new class117(255, class11.field146, class248.field3550, 500000);
                class348.field4944 = new class392(class14.field185.field2689, 24, 0);
                class14.field185.field2680 = null;
                class14.field185.field2689 = null;
                class14.field185.field2683 = null;
                class14.field185.field2690 = null;
            }
        } catch (IOException var4) {
            class348.field4944 = null;
            class11.field146 = null;
            class248.field3550 = null;
            class365.field5184 = null;
        }
        if (class237.field3389 != 0) {
            class151.field1866 = true;
        }
        if (class384.field5425 == 0) {
            class200.field2856 = class384.field5421.method2331(25, class271.field3836);
        } else if (class384.field5425 == 1) {
            class200.field2856 = class352.field4975.method2331(25, class271.field3836);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 128)
    private final void method1099(int arg0, int arg1) {
        class109.field1341 = null;
        class125.field1534 = null;
        field2298++;
        class73.field879.field5157++;
        class346.field4899 = arg1;
        class73.field879.field5159 = arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 140)
    public final void method1100(boolean arg0) {
        field2312++;
        if (class40.field475 == 1000 || !arg0) {
            return;
        }
        long var2 = class89.method492(87) / 1000000L - class264.field3757;
        class264.field3757 = class89.method492(29) / 1000000L;
        boolean var4 = class79.method439(62);
        if (var4 && class215.field3045 && class81.field942 != null) {
            class81.field942.method139((byte) -127);
        }
        if (class40.field475 == 30 || class40.field475 == 10) {
            if (class389.field5493 != 0L && class175.method1195(110) > class389.field5493) {
                class432.method2714(class26.method180(-117), (byte) 118, false, class388.field5479, class374.field5256);
            } else if (class151.field1873.method678() && class406.field5859) {
                class346.method2213(2005892332);
            }
        }
        if (class255.field3680 == null) {
            Container var5;
            if (class272.field3857 == null) {
                var5 = class14.field185.field2685;
            } else {
                var5 = class272.field3857;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class272.field3857 == var5) {
                Insets var8 = class272.field3857.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class410.field5896 != var6 || class282.field3988 != var7) {
                if (class151.field1873 == null || class151.field1873.method606()) {
                    class78.method432(503);
                } else {
                    class282.field3988 = var7;
                    class410.field5896 = var6;
                }
                class389.field5493 = class175.method1195(28) + 500L;
            }
        }
        if (class255.field3680 != null && !class452.field6477 && (class40.field475 == 30 || class40.field475 == 10)) {
            class432.method2714(class249.field3558, (byte) -102, false, -1, -1);
        }
        boolean var9 = false;
        if (class146.field1799) {
            var9 = true;
            class146.field1799 = false;
        }
        if (var9) {
            class237.method1632((byte) 113);
        }
        if (class151.field1873 != null && class151.field1873.method641() || class26.method180(-116) != 1) {
            class406.method2593(false);
        }
        if (class40.field475 == 0) {
            class297.method1957(108, class366.field5201, class35.field401, class99.field1201[class176.field2397], class102.field1239[class176.field2397], var9, class203.field2914[class176.field2397]);
        } else if (class40.field475 == 5) {
            class20.method152((byte) 111, class174.field2391, class99.field1201[class176.field2397].getRGB(), class102.field1239[class176.field2397].getRGB(), var9 | class151.field1873.method641(), class203.field2914[class176.field2397].getRGB(), class151.field1873);
        } else if (class40.field475 == 10) {
            class399.method2545(false);
        } else if (class40.field475 == 25 || class40.field475 == 28) {
            if (class152.field1880 == 1) {
                if (class331.field4684 > class272.field3855) {
                    class272.field3855 = class331.field4684;
                }
                int var10 = (class272.field3855 - class331.field4684) * 50 / class272.field3855;
                class440.method2749((byte) -26, true, class248.field3544.method2331(25, class271.field3836) + "<br>(" + var10 + "%)", class73.field874);
            } else if (class152.field1880 == 2) {
                if (class54.field651 < class322.field4589) {
                    class54.field651 = class322.field4589;
                }
                int var11 = ((class54.field651 - class322.field4589) * 50 / class54.field651) + 50;
                class440.method2749((byte) -111, true, class248.field3544.method2331(25, class271.field3836) + "<br>(" + var11 + "%)", class73.field874);
            } else {
                class440.method2749((byte) 94, true, class248.field3544.method2331(25, class271.field3836), class73.field874);
            }
        } else if (class40.field475 == 30) {
            class288.method1878((byte) 87, var2);
        } else if (class40.field475 == 40) {
            class440.method2749((byte) -87, true, class392.field5539.method2331(25, class271.field3836) + "<br>" + class174.field2390.method2331(25, class271.field3836), class73.field874);
        }
        if (class159.field2068 == 3) {
            for (int var12 = 0; var12 < class421.field6017; var12++) {
                Rectangle var13 = class130.field1584[var12];
                if (class181.field2475[var12]) {
                    class151.field1873.method827(var13.y, var13.x, var13.height, -94, var13.width, -1996553985);
                } else if (class418.field5974[var12]) {
                    class151.field1873.method827(var13.y, var13.x, var13.height, -91, var13.width, -1996554240);
                }
            }
        }
        if (class199.method1316(16032)) {
            class236.method1581(class151.field1873, 8);
        }
        if ((class40.field475 == 30 || class40.field475 == 10) && class159.field2068 == 0 && class26.method180(-117) == 1 && !var9 && class185.field2677.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class421.field6017; var15++) {
                if (class418.field5974[var15]) {
                    class418.field5974[var15] = false;
                    class367.field5207[var14++] = class130.field1584[var15];
                }
            }
            class151.field1873.method671(class367.field5207, var14);
        } else if (class40.field475 != 0) {
            class151.field1873.method664();
            for (int var16 = 0; var16 < class421.field6017; var16++) {
                class418.field5974[var16] = false;
            }
        }
        if (class223.field3135 == 0) {
            class150.method907(15L, (byte) -32);
        } else if (class223.field3135 == 1) {
            class150.method907(10L, (byte) -32);
        } else if (class223.field3135 == 2) {
            class150.method907(5L, (byte) -32);
        } else if (class223.field3135 == 3) {
            class150.method907(2L, (byte) -32);
        }
        if (class181.field2479) {
            class121.method774((byte) 112);
        }
        if (class77.field906 && class40.field475 == 10 && class248.field3548 != -1) {
            class77.field906 = false;
            class278.method1834(class14.field185, (byte) 90);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 374)
    public static final void method1101() {
        boolean var0 = class347.field4921 == 1 && class305.field4287 > 200 || class347.field4921 == 0 && class305.field4287 > 50;
        for (int var1 = 0; var1 < class305.field4287; var1++) {
            class40 var10 = class26.field314[class94.field1135[var1]];
            if (var10.method244(-27076)) {
                var10.method1209(0);
                if (var10.field3268 >= 0 && var10.field3267 >= 0 && var10.field3275 < class176.field2403 && var10.field3271 < class383.field5395) {
                    var10.field448 = var10.field5613 ? var0 : false;
                    int var11 = 0;
                    if (!var10.field5581) {
                        var11++;
                    }
                    if (var10.field5586 > class189.field2726) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method242(-30129) << 2);
                    if (class200.field2851 == 0) {
                        var12 += 32;
                    } else {
                        var12 += 128;
                    }
                    var12 += 256;
                    var10.field5622 = var12 + 1;
                } else {
                    var10.field5622 = -1;
                }
            } else {
                var10.field5622 = -1;
            }
        }
        for (int var2 = 0; var2 < class102.field1250; var2++) {
            class77 var7 = class167.field2335[class86.field981[var2]];
            if (var7.method428(-27076) && var7.field912.method840(-28915)) {
                var7.method1209(0);
                if (var7.field3268 >= 0 && var7.field3267 >= 0 && var7.field3275 < class176.field2403 && var7.field3271 < class383.field5395) {
                    int var8 = 0;
                    if (!var7.field5581) {
                        var8++;
                    }
                    if (var7.field5586 > class189.field2726) {
                        var8 += 2;
                    }
                    int var9 = var8 + (5 - var7.method242(-30129) << 2);
                    if (class200.field2851 == 0) {
                        if (var7.field912.field1660) {
                            var9 += 64;
                        } else {
                            var9 += 128;
                        }
                    } else if (class200.field2851 == 1) {
                        if (var7.field912.field1660) {
                            var9 += 32;
                        } else {
                            var9 += 64;
                        }
                    }
                    if (var7.field912.field1691) {
                        var9 += 512;
                    } else if (!var7.field912.field1659) {
                        var9 += 256;
                    }
                    var7.field5622 = var9 + 1;
                } else {
                    var7.field5622 = -1;
                }
            } else {
                var7.field5622 = -1;
            }
        }
        for (int var3 = 0; var3 < class360.field5138.length; var3++) {
            class219 var4 = class360.field5138[var3];
            if (var4 != null) {
                if (var4.field3092 == 1) {
                    class77 var5 = class167.field2335[var4.field3085];
                    if (var5 != null && var5.field5622 >= 0) {
                        var5.field5622 += 1024;
                    }
                } else if (var4.field3092 == 10) {
                    class40 var6 = class26.field314[var4.field3085];
                    if (var6 != null && var6.field5622 >= 0) {
                        var6.field5622 += 1024;
                    }
                }
            }
        }
        class384.field5422.field5622 = Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 512)
    private final void method1102(int arg0) {
        field2301++;
        if (!class77.field906) {
            for (int var2 = 0; var2 < class82.field949; var2++) {
                if (class114.field1402[var2].method162(0) == 's' || class114.field1402[var2].method162(0) == 'S') {
                    class77.field906 = true;
                    break;
                }
            }
        }
        if (class102.field1252 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class175.method1195(55);
            if (class393.field5542 == 0L) {
                class393.field5542 = var5;
            }
            if (var4 > 16384 && (var5 - class393.field5542) < 5000L) {
                if ((var5 - class425.field6092) > 1000L) {
                    System.gc();
                    class425.field6092 = var5;
                }
                class366.field5201 = class97.field1163.method2331(25, class271.field3836);
                class35.field401 = 5;
            } else {
                class366.field5201 = class49.field586.method2331(25, class271.field3836);
                class102.field1252 = 10;
                class35.field401 = 5;
            }
        } else if (class102.field1252 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class102.field1247[var7] = class14.method102(-120, class176.field2403, class383.field5395);
            }
            class366.field5201 = class355.field4995.method2331(25, class271.field3836);
            class102.field1252 = 20;
            class35.field401 = 10;
        } else if (class102.field1252 == 20) {
            if (class141.field1740 == null) {
                class141.field1740 = new class402(class73.field879, class452.field6471);
            }
            if (class141.field1740.method2565((byte) -101)) {
                class341.field4839 = class247.method1688(false, -12017, 1, 0, true);
                class250.field3566 = class247.method1688(false, -12017, 1, 1, true);
                class158.field2060 = class247.method1688(false, -12017, 1, 2, true);
                class262.field3742 = class247.method1688(false, -12017, 1, 3, true);
                class263.field3751 = class247.method1688(false, -12017, 1, 4, true);
                class311.field4389 = class247.method1688(true, -12017, 1, 5, true);
                class393.field5553 = class247.method1688(true, -12017, 1, 6, false);
                class33.field384 = class247.method1688(false, -12017, 1, 7, true);
                class298.field4178 = class247.method1688(false, -12017, 1, 8, true);
                class212.field3017 = class247.method1688(false, -12017, 1, 9, true);
                class397.field5686 = class247.method1688(false, -12017, 1, 10, true);
                class105.field1253 = class247.method1688(false, -12017, 1, 11, true);
                class406.field5866 = class247.method1688(false, -12017, 1, 12, true);
                class335.field4752 = class247.method1688(false, -12017, 1, 13, true);
                class41.field501 = class247.method1688(false, -12017, 1, 14, false);
                class97.field1173 = class247.method1688(false, -12017, 1, 15, true);
                class309.field4378 = class247.method1688(false, -12017, 1, 16, true);
                class184.field2587 = class247.method1688(false, -12017, 1, 17, true);
                class310.field4385 = class247.method1688(false, -12017, 1, 18, true);
                class128.field1548 = class247.method1688(false, -12017, 1, 19, true);
                class153.field1886 = class247.method1688(false, -12017, 1, 20, true);
                class241.field3435 = class247.method1688(false, -12017, 1, 21, true);
                class296.field4120 = class247.method1688(false, -12017, 1, 22, true);
                class4.field32 = class247.method1688(true, -12017, 1, 23, true);
                class14.field178 = class247.method1688(false, -12017, 1, 24, true);
                class322.field4587 = class247.method1688(false, -12017, 1, 25, true);
                class432.field6221 = class247.method1688(true, -12017, 1, 26, true);
                class351.field4966 = class247.method1688(false, -12017, 1, 27, true);
                class346.field4898 = class247.method1688(true, -12017, 1, 28, true);
                class366.field5201 = class73.field875.method2331(25, class271.field3836);
                class35.field401 = 15;
                class102.field1252 = 30;
            } else {
                class366.field5201 = class54.field654.method2331(25, class271.field3836);
                class35.field401 = 12;
            }
        } else if (class102.field1252 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 29; var9++) {
                var8 += class448.field6437[var9].method2301((byte) 125) * class385.field5433[var9] / 100;
            }
            if (var8 == 100) {
                class366.field5201 = class448.field6430.method2331(25, class271.field3836);
                class35.field401 = 20;
                class415.method2644(-96, class298.field4178);
                class322.method2099(class298.field4178, (byte) -106);
                class102.field1252 = 40;
            } else {
                if (var8 != 0) {
                    class366.field5201 = class203.field2921.method2331(25, class271.field3836) + var8 + "%";
                }
                class35.field401 = 20;
            }
        } else if (class102.field1252 == 40) {
            if (class346.field4898.method2424((byte) -116)) {
                this.method1110((byte) -82, class346.field4898.method2420(1, -1));
                class366.field5201 = class114.field1409.method2331(25, class271.field3836);
                class35.field401 = 25;
                class102.field1252 = 50;
            } else {
                class366.field5201 = class154.field1906.method2331(25, class271.field3836) + class346.field4898.method2414((byte) 106) + "%";
                class35.field401 = 25;
            }
        } else if (class102.field1252 == 50) {
            class298.method1964(class94.field1134, -48001, 2, 22050);
            class439.field6282 = new class162();
            class439.field6282.method1047((byte) 66, 9, 128);
            class81.field942 = class261.method1744(0, false, 22050, class402.field5767, class14.field185);
            class81.field942.method136(class439.field6282, 4);
            class347.method2219(class263.field3751, class41.field501, class97.field1173, class439.field6282, (byte) -72);
            class230.field3255 = class261.method1744(1, false, 2048, class402.field5767, class14.field185);
            class399.field5694 = new class169();
            class230.field3255.method136(class399.field5694, 4);
            class233.field3279 = new class2(22050, class313.field4484);
            class150.field1852 = class393.field5553.method2418("scape main", (byte) -23);
            class366.field5201 = class335.field4739.method2331(25, class271.field3836);
            class35.field401 = 30;
            class102.field1252 = 60;
        } else if (class102.field1252 == 60) {
            int var10 = class313.method2064(class298.field4178, class335.field4752, true);
            int var11 = class153.method926((byte) -97);
            if (var10 < var11) {
                class366.field5201 = class210.field2985.method2331(25, class271.field3836) + var10 * 100 / var11 + "%";
                class35.field401 = 35;
            } else {
                class366.field5201 = class43.field538.method2331(25, class271.field3836);
                class102.field1252 = 70;
                class35.field401 = 35;
            }
        } else if (class102.field1252 == 70) {
            int var12 = class95.method528(class298.field4178, 39);
            int var13 = class101.method566((byte) -99);
            if (var12 < var13) {
                class366.field5201 = class237.field3384.method2331(25, class271.field3836) + var12 * 100 / var13 + "%";
                class35.field401 = 40;
            } else {
                class366.field5201 = class322.field4576.method2331(25, class271.field3836);
                class102.field1252 = 80;
                class35.field401 = 40;
            }
        } else if (class102.field1252 == 80) {
            if (class432.field6221.method2424((byte) -120)) {
                class1.field6 = new class200(class432.field6221, class212.field3017, class298.field4178);
                class366.field5201 = class305.field4282.method2331(25, class271.field3836);
                class102.field1252 = 90;
                class35.field401 = 45;
            } else {
                class366.field5201 = class261.field3732.method2331(25, class271.field3836) + class432.field6221.method2414((byte) 126) + "%";
                class35.field401 = 45;
            }
        } else if (class102.field1252 == 90) {
            class366.field5201 = class409.field5891.method2331(25, class271.field3836);
            class35.field401 = 50;
            class102.field1252 = 95;
        } else if (class102.field1252 == 95) {
            if (class77.field906) {
                class140.field1736 = 0;
                class148.field1815 = 0;
                class249.field3558 = 1;
                class433.field6227 = 0;
                class408.field5877 = 0;
            }
            class77.field906 = true;
            class278.method1834(class14.field185, (byte) 103);
            class229.method1527((byte) -25);
            class399.method2540(false, -27343, class140.field1736);
            class366.field5201 = class86.field980.method2331(25, class271.field3836);
            class35.field401 = 55;
            class102.field1252 = 100;
        } else if (class102.field1252 == 100) {
            class91.method501(0, class151.field1873, class298.field4178, class335.field4752);
            class366.field5201 = class421.field6011.method2331(25, class271.field3836);
            class35.field401 = 60;
            class178.method1210(5, 18);
            class102.field1252 = 110;
        } else if (class102.field1252 == 110) {
            class158.field2060.method2424((byte) -118);
            byte var14 = 0;
            int var15 = var14 + class158.field2060.method2414((byte) 98);
            class309.field4378.method2424((byte) -120);
            int var16 = var15 + class309.field4378.method2414((byte) 113);
            class184.field2587.method2424((byte) -119);
            int var17 = var16 + class184.field2587.method2414((byte) 117);
            class310.field4385.method2424((byte) -126);
            int var18 = var17 + class310.field4385.method2414((byte) 103);
            class128.field1548.method2424((byte) -115);
            int var19 = var18 + class128.field1548.method2414((byte) 109);
            class153.field1886.method2424((byte) -118);
            int var20 = var19 + class153.field1886.method2414((byte) 110);
            class241.field3435.method2424((byte) -124);
            int var21 = var20 + class241.field3435.method2414((byte) 117);
            class296.field4120.method2424((byte) -128);
            int var22 = var21 + class296.field4120.method2414((byte) 109);
            class14.field178.method2424((byte) -117);
            int var23 = var22 + class14.field178.method2414((byte) 116);
            class322.field4587.method2424((byte) -118);
            int var24 = var23 + class322.field4587.method2414((byte) 121);
            class351.field4966.method2424((byte) -117);
            int var25 = var24 + class351.field4966.method2414((byte) 113);
            if (var25 < 1100) {
                class366.field5201 = class423.field6037.method2331(25, class271.field3836) + var25 / 11 + "%";
                class35.field401 = 65;
            } else {
                class131.method813(class158.field2060, true);
                class403.method2567(class158.field2060, -24928);
                class241.method1650(50, class158.field2060);
                class400.method2550(-43, class158.field2060, class33.field384);
                class408.method2611(class33.field384, class309.field4378, class271.field3836, (byte) -14, true);
                class158.method1010(class271.field3836, true, class33.field384, class310.field4385, 556);
                class193.method1311(9330, class271.field3836, true, class33.field384, class128.field1548);
                class324.method2110(-101, class158.field2060);
                class312.method2059(class153.field1886, class250.field3566, true, class341.field4839);
                class451.method2796(class158.field2060, 121);
                class286.method1868(class241.field3435, class33.field384, true);
                class54.method311(class296.field4120, (byte) 87);
                class199.method1321(104, class158.field2060);
                class367.method2343(class33.field384, class262.field3742, -109, class335.field4752, class298.field4178);
                class360.method2317(class158.field2060, (byte) 106);
                class208.method1360(-1, class184.field2587);
                class4.method21(class322.field4587, class14.field178, 1, new class24());
                class254.method1713(class322.field4587, false, class14.field178);
                class370.method2356(class158.field2060, (byte) -12);
                class183.method1227(class158.field2060, 21012);
                class303.method1998(class158.field2060, -128);
                class359.method2298(class298.field4178, class158.field2060, 0);
                class362.method2334(class158.field2060, class298.field4178, (byte) 37);
                class359.method2307(0, class158.field2060);
                class2.method6((byte) -89, class298.field4178, class158.field2060);
                class151.method915(class158.field2060, 19);
                class109.method694(6, class158.field2060);
                class366.field5201 = class250.field3564.method2331(25, class271.field3836);
                class35.field401 = 65;
                class129.method798(-30495);
                class102.field1252 = 120;
            }
        } else if (class102.field1252 == 120) {
            int var26 = class399.method2544(class298.field4178, -16777216);
            int var27 = class294.method1941(-83);
            if (var27 > var26) {
                class366.field5201 = class193.field2791.method2331(25, class271.field3836) + var26 * 100 / var27 + "%";
                class35.field401 = 70;
            } else {
                class121.method768(class151.field1873, class298.field4178, (byte) -54);
                class233.method1541(class347.field4907, false);
                class366.field5201 = class54.field630.method2331(25, class271.field3836);
                class35.field401 = 70;
                class102.field1252 = 130;
            }
        } else if (class102.field1252 == 130) {
            class366.field5201 = class190.field2741.method2331(25, class271.field3836);
            class35.field401 = 75;
            class102.field1252 = 140;
        } else if (class102.field1252 == 140) {
            if (class397.field5686.method2410(-1, "huffman", "")) {
                class214 var28 = new class214(class397.field5686.method2408("huffman", "", -104));
                class241.method1647(var28, -65);
                class366.field5201 = class29.field355.method2331(25, class271.field3836);
                class35.field401 = 80;
                class102.field1252 = 150;
            } else {
                class366.field5201 = class452.field6466.method2331(25, class271.field3836) + "0%";
                class35.field401 = 80;
            }
        } else if (class102.field1252 == 150) {
            if (!class262.field3742.method2424((byte) -122)) {
                class366.field5201 = class348.field4933.method2331(25, class271.field3836) + class262.field3742.method2414((byte) 101) * 3 / 4 + "%";
                class35.field401 = 85;
            } else if (!class406.field5866.method2424((byte) -120)) {
                class366.field5201 = class348.field4933.method2331(25, class271.field3836) + (class406.field5866.method2414((byte) 105) / 10 + 75) + "%";
                class35.field401 = 85;
            } else if (!class335.field4752.method2424((byte) -126)) {
                class366.field5201 = class348.field4933.method2331(25, class271.field3836) + ((class335.field4752.method2414((byte) 101) / 20) + 85) + "%";
                class35.field401 = 85;
            } else if (class4.field32.method2427((byte) 127, "details")) {
                class308.method2022(class4.field32);
                class26.method183(class351.field4966, false);
                class409.method2614(0, class33.field384, class1.field6);
                class366.field5201 = class229.field3241.method2331(25, class271.field3836);
                class35.field401 = 85;
                class102.field1252 = 160;
            } else {
                class366.field5201 = class348.field4933.method2331(25, class271.field3836) + ((class4.field32.method2430((byte) -106, "details") / 10) + 90) + "%";
                class35.field401 = 85;
            }
        } else if (class102.field1252 == 160) {
            int var29 = class236.method1607(0);
            if (var29 == -1) {
                class366.field5201 = class68.field781.method2331(25, class271.field3836);
                class35.field401 = 90;
            } else if (var29 == 7 || var29 == 9) {
                this.method2476("worldlistfull", 9329);
                class178.method1210(1000, 125);
            } else if (class141.field1741) {
                class366.field5201 = class94.field1130.method2331(25, class271.field3836);
                class102.field1252 = 170;
                class35.field401 = 90;
            } else {
                this.method2476("worldlistio_" + var29, 9329);
                class178.method1210(1000, 35);
            }
        } else if (class102.field1252 == 170) {
            class134.field1621 = new boolean[class106.field1266];
            class158.field2064 = new int[class106.field1266];
            class150.field1855 = new String[class225.field3154];
            for (int var30 = 0; var30 < class106.field1266; var30++) {
                if (class204.method1352((byte) -2, var30).field6196 == 0) {
                    class134.field1621[var30] = true;
                    class46.field556++;
                }
                class158.field2064[var30] = -1;
            }
            class444.method2765((byte) -41);
            class204.field2929 = class262.field3742.method2418("loginscreen", (byte) -23);
            class311.field4389.method2413(false, true, 15965);
            class393.field5553.method2413(true, true, 15965);
            class298.field4178.method2413(true, true, 15965);
            class335.field4752.method2413(true, true, 15965);
            class397.field5686.method2413(true, true, 15965);
            class262.field3742.method2413(true, true, 15965);
            class158.field2060.field5303 = 2;
            class181.field2479 = true;
            class184.field2587.field5303 = 2;
            class309.field4378.field5303 = 2;
            class310.field4385.field5303 = 2;
            class128.field1548.field5303 = 2;
            class153.field1886.field5303 = 2;
            class241.field3435.field5303 = 2;
            class432.method2714(class249.field3558, (byte) 115, false, -1, -1);
            class366.field5201 = class409.field5893.method2331(25, class271.field3836);
            class102.field1252 = 180;
            class35.field401 = 95;
        } else if (class102.field1252 == 180) {
            class208.method1359(-1, true);
        } else {
            int var31 = 44 / ((arg0 - 12) / 49);
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 1055)
    private final void method1103(int arg0) {
        field2307++;
        if (class73.field879.field5157 > class127.field1544) {
            class112.field1378 = (class73.field879.field5157 - 1) * 5 * 50;
            if (class297.field4149 == class154.field1904) {
                class297.field4149 = class276.field3917;
            } else {
                class297.field4149 = class154.field1904;
            }
            if (class112.field1378 > 3000) {
                class112.field1378 = 3000;
            }
            if (class73.field879.field5157 >= 2 && class73.field879.field5159 == 6) {
                this.method2476("js5connect_outofdate", 9329);
                class40.field475 = 1000;
                return;
            }
            if (class73.field879.field5157 >= 4 && class73.field879.field5159 == -1) {
                this.method2476("js5crc", 9329);
                class40.field475 = 1000;
                return;
            }
            if (class73.field879.field5157 >= 4 && (class40.field475 == 0 || class40.field475 == 5)) {
                if (class73.field879.field5159 == 7 || class73.field879.field5159 == 9) {
                    this.method2476("js5connect_full", 9329);
                } else if (class73.field879.field5159 > 0) {
                    this.method2476("js5connect", 9329);
                } else {
                    this.method2476("js5io", 9329);
                }
                class40.field475 = 1000;
                return;
            }
        }
        class127.field1544 = class73.field879.field5157;
        if (class112.field1378 > 0) {
            class112.field1378--;
            return;
        }
        try {
            if (~class346.field4899 == arg0) {
                class125.field1534 = class14.field185.method1268(class310.field4384, (byte) -125, class297.field4149);
                class346.field4899++;
            }
            if (class346.field4899 == 1) {
                if (class125.field1534.field4498 == 2) {
                    this.method1099(1000, 0);
                    return;
                }
                if (class125.field1534.field4498 == 1) {
                    class346.field4899++;
                }
            }
            if (class346.field4899 == 2) {
                class109.field1341 = new class202((Socket) class125.field1534.field4497, class14.field185);
                class236 var2 = new class236(5);
                var2.method1583(15, (byte) -76);
                var2.method1603(569, 871);
                class109.field1341.method1337(5, (byte) 124, 0, var2.field3364);
                class346.field4899++;
                class399.field5712 = class175.method1195(96);
            }
            if (class346.field4899 == 3) {
                if (class40.field475 == 0 || class40.field475 == 5 || class109.field1341.method1340(0) > 0) {
                    int var3 = class109.field1341.method1344((byte) -103);
                    if (var3 != 0) {
                        this.method1099(var3, ~arg0);
                        return;
                    }
                    class346.field4899++;
                } else if (class175.method1195(62) - class399.field5712 > 30000L) {
                    this.method1099(1001, 0);
                    return;
                }
            }
            if (class346.field4899 == 4) {
                boolean var4 = class40.field475 == 5 || class40.field475 == 10 || class40.field475 == 28;
                class73.field879.method2316(arg0 ^ 0xFFFFBA1E, class109.field1341, !var4);
                class109.field1341 = null;
                class125.field1534 = null;
                class346.field4899 = 0;
            }
        } catch (IOException var5) {
            this.method1099(1002, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BIIII)V", line = 1200)
    public static final void method1104(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -51) {
            field2299 = null;
        }
        field2306++;
        if (class81.field946 <= arg4 - arg1 && arg1 + arg4 <= class235.field3295 && class388.field5464 <= (arg2 - arg1) && class219.field3080 >= (arg1 + arg2)) {
            class193.method1305(0, arg3, arg2, arg1, arg4);
        } else {
            class50.method286(arg3, arg4, arg2, -1, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 1219)
    public final void method1105(int arg0) {
        if (class266.field3794) {
            class88.method487(arg0 ^ 0x28ED);
        }
        field2311++;
        if (class151.field1873 != null) {
            class151.field1873.method824(-56);
        }
        if (class255.field3680 != null) {
            class5.method43(class255.field3680, arg0 - 1391, class14.field185);
            class255.field3680 = null;
        }
        if (class146.field1798 != null) {
            class146.field1798.method1343((byte) 81);
            class146.field1798 = null;
        }
        if (class24.field302 != null) {
            class24.field302.method1426(-29615, class402.field5767);
        }
        class24.field302 = null;
        if (class81.field942 != null) {
            class81.field942.method138(28291);
        }
        if (class230.field3255 != null) {
            class230.field3255.method138(28291);
        }
        class73.field879.method2320(arg0 ^ arg0);
        class452.field6471.method2777(arg0 - 1353);
        if (class399.field5692 != null) {
            class399.field5692.method704(-128);
            class399.field5692 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 1272)
    public static final void method1106() {
        for (int var0 = -1; var0 < class305.field4287 + class102.field1250; var0++) {
            class396 var1;
            if (var0 < 0) {
                var1 = class384.field5422;
            } else if (var0 < class305.field4287) {
                var1 = class26.field314[class94.field1135[var0]];
            } else {
                var1 = class167.field2335[class86.field981[var0 - class305.field4287]];
            }
            if (var1.field5622 >= 0) {
                int var2 = var1.method242(-30129);
                if ((var2 & 0x1) == 0) {
                    if ((var1.field3284 & 0x7F) != 0 || (var1.field3269 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var1.field3284 & 0x7F) != 64 || (var1.field3269 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var2 == 1) {
                    int var3 = var1.field3284 >> 7;
                    int var4 = var1.field3269 >> 7;
                    if (var1.field5622 > class193.field2775[var3][var4]) {
                        class193.field2775[var3][var4] = var1.field5622;
                        class123.field1507[var3][var4] = 1;
                    } else if (class193.field2775[var3][var4] == var1.field5622) {
                        var10002 = class123.field1507[var3][var4]++;
                    }
                } else {
                    int var5 = (var2 - 1) * 64 + 60;
                    int var6 = var1.field3284 - var5 >> 7;
                    int var7 = var1.field3269 - var5 >> 7;
                    int var8 = var1.field3284 + var5 >> 7;
                    int var9 = var1.field3269 + var5 >> 7;
                    for (int var10 = var6; var10 <= var8; var10++) {
                        for (int var11 = var7; var11 <= var9; var11++) {
                            if (var1.field5622 > class193.field2775[var10][var11]) {
                                class193.field2775[var10][var11] = var1.field5622;
                                class123.field1507[var10][var11] = 1;
                            } else if (class193.field2775[var10][var11] == var1.field5622) {
                                var10002 = class123.field1507[var10][var11]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 1365)
    public final void method1107(int arg0) {
        field2303++;
        if (class40.field475 == 1000) {
            return;
        }
        class189.field2726++;
        if ((class189.field2726 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class23.field300 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class379.field5338.setSeed((long) class23.field300);
        }
        this.method1108(-71);
        if (class141.field1740 != null) {
            class141.field1740.method2564((byte) -41);
        }
        class312.method2058((byte) -62);
        class356.method2270(false);
        if (arg0 != 11) {
            field2299 = null;
        }
        class441.field6334.method2209((byte) -67);
        class306.field4306.method19(-4);
        if (class24.field302 != null) {
            int var3 = class24.field302.method1425((byte) -91);
            class200.field2847 = var3;
        }
        if (class151.field1873 != null) {
            class151.field1873.method604((int) class175.method1195(93));
        }
        class402.method2561(1);
        class82.field949 = 0;
        for (class176 var4 = class441.field6334.method2199(99); var4 != null && class82.field949 < 128; var4 = class441.field6334.method2199(-116)) {
            if (var4.method167((byte) 96) != 1) {
                char var5 = var4.method162(0);
                if (!class249.method1694((byte) 125) || var5 != '`' && var5 != '§') {
                    class114.field1402[class82.field949] = var4;
                    class82.field949++;
                } else if (class199.method1316(16032)) {
                    class377.method2439(12883);
                } else {
                    class29.method195((byte) -89);
                }
            }
        }
        class203.field2927 = null;
        for (class276 var6 = class306.field4306.method28(arg0 - 116); var6 != null; var6 = class306.field4306.method28(-111)) {
            int var7 = var6.method1828(1);
            if (var7 == -1) {
                class262.field3741.method509((byte) 120, var6);
            } else if (class253.method1710(var7, -32769)) {
                class203.field2927 = var6;
            }
        }
        if (class199.method1316(16032)) {
            class418.method2653(arg0 - 16777227);
        }
        if (class40.field475 == 0) {
            this.method1102(arg0 - 52);
            class135.method845(256);
        } else if (class40.field475 == 5) {
            this.method1102(104);
            class135.method845(256);
        } else if (class40.field475 == 25 || class40.field475 == 28) {
            class123.method781((byte) 85);
        }
        if (class40.field475 == 10) {
            this.method1109(1);
            class452.method2797(arg0 + 105);
            class300.method1982(arg0 ^ 0xFFFFFFDA);
            class299.method1975(arg0 ^ 0xFFFF8B8B);
        } else if (class40.field475 == 30) {
            class313.method2068(0);
        } else if (class40.field475 == 40) {
            class299.method1975(arg0 ^ 0xFFFF8B8B);
            if (class346.field4890 != -3) {
                if (class346.field4890 == 15) {
                    class433.method2718(15581);
                } else if (class346.field4890 != 2) {
                    class71.method407(0);
                }
            }
        }
        class203.method1349(8180, class151.field1873);
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 1505)
    private final void method1108(int arg0) {
        int var2 = 107 / ((79 - arg0) / 45);
        field2305++;
        boolean var3 = class73.field879.method2314(5390);
        if (!var3) {
            this.method1103(-1);
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 1519)
    private final void method1109(int arg0) {
        class34.field392++;
        field2300++;
        class14.method103(-1, (class184) null, -1, true);
        class180.method1217((class184) null, (byte) 114, -1, -1);
        class134.method829((byte) -128);
        class146.field1792++;
        for (int var2 = 0; var2 < 32768; var2++) {
            class77 var12 = class167.field2335[var2];
            if (var12 != null) {
                byte var13 = var12.field912.field1642;
                if ((var13 & 0x1) != 0) {
                    int var14 = var12.method242(-30129);
                    if ((var13 & 0x2) != 0 && var12.field5674 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var15 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var16 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var15 != 0 || var16 != 0) {
                            int var17 = var12.field5677[0] + var15;
                            int var18 = var12.field5664[0] + var16;
                            if (var17 < 0) {
                                var17 = 0;
                            } else if ((class176.field2403 - var14 - 1) < var17) {
                                var17 = class176.field2403 - var14 - 1;
                            }
                            if (var18 < 0) {
                                var18 = 0;
                            } else if (var18 > (class383.field5395 - var14 - 1)) {
                                var18 = class383.field5395 - var14 - 1;
                            }
                            int var19 = class399.method2543(var14, var17, true, -129, var12.field5677[0], class241.field3427, class102.field1247[var12.field3285], var14, var14, 0, var18, 0, var12.field5664[0], -1, class113.field1384);
                            if (var19 > 0) {
                                if (var19 > 9) {
                                    var19 = 9;
                                }
                                for (int var20 = 0; var20 < var19; var20++) {
                                    var12.field5677[var20] = class241.field3427[var19 - var20 - 1];
                                    var12.field5664[var20] = class113.field1384[var19 - var20 - 1];
                                    var12.field5668[var20] = 1;
                                }
                                var12.field5674 = var19;
                            }
                        }
                    }
                    class127.method791(true, var12, true);
                    int var21 = class54.method309(var12, 0);
                    class102.method569(class39.field445, class295.field4114, var21, var12, false);
                    class318.method2083(true, var12);
                }
            }
        }
        if (class176.field2396 == 0 && class69.field803 == 0) {
            if (class129.field1568 == 2) {
                class189.method1287(arg0 ^ 0xFFFFFF83);
            } else {
                class382.method2457(-108);
            }
            if (class334.field4730 >> 7 < 14 || (class176.field2403 - 14) <= (class334.field4730 >> 7) || class265.field3774 >> 7 < 14 || (class265.field3774 >> 7) >= (class383.field5395 - 14)) {
                class418.method2654(arg0 + 13510);
            }
        }
        while (true) {
            class272 var3;
            class184 var4;
            class184 var5;
            do {
                var3 = (class272) class281.field3986.method513(-2);
                if (var3 == null) {
                    while (true) {
                        class272 var6;
                        class184 var7;
                        class184 var8;
                        do {
                            var6 = (class272) class412.field5908.method513(arg0 - 3);
                            if (var6 == null) {
                                while (true) {
                                    class272 var9;
                                    class184 var10;
                                    class184 var11;
                                    do {
                                        var9 = (class272) class92.field1120.method513(-2);
                                        if (var9 == null) {
                                            if (arg0 != 1) {
                                                return;
                                            }
                                            if (class225.field3144 != null) {
                                                class244.method1658(-95);
                                            }
                                            if (class189.field2726 % 1500 == 0) {
                                                class5.method35((byte) 118);
                                            }
                                            class235.method1554(-117);
                                            if (class266.field3794 && class415.field5951 < class175.method1195(arg0 + 92) - 60000L) {
                                                class88.method487(11668);
                                                return;
                                            }
                                            return;
                                        }
                                        var10 = var9.field3851;
                                        if (var10.field2668 < 0) {
                                            break;
                                        }
                                        var11 = class282.method1863(var10.field2599, arg0 ^ 0xFFFF9B14);
                                    } while (var11 == null || var11.field2603 == null || var11.field2603.length <= var10.field2668 || var11.field2603[var10.field2668] != var10);
                                    class201.method1332(var9);
                                }
                            }
                            var7 = var6.field3851;
                            if (var7.field2668 < 0) {
                                break;
                            }
                            var8 = class282.method1863(var7.field2599, -25835);
                        } while (var8 == null || var8.field2603 == null || var7.field2668 >= var8.field2603.length || var8.field2603[var7.field2668] != var7);
                        class201.method1332(var6);
                    }
                }
                var4 = var3.field3851;
                if (var4.field2668 < 0) {
                    break;
                }
                var5 = class282.method1863(var4.field2599, arg0 ^ 0xFFFF9B14);
            } while (var5 == null || var5.field2603 == null || var4.field2668 >= var5.field2603.length || var5.field2603[var4.field2668] != var4);
            class201.method1332(var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)V", line = 1726)
    private final void method1110(byte arg0, byte[] arg1) {
        field2310++;
        if (arg0 != -82) {
            method1111(-52);
        }
        class236 var3 = new class236(arg1);
        while (true) {
            while (true) {
                while (true) {
                    int var4 = var3.method1574(arg0 - 9);
                    if (var4 == 0) {
                        return;
                    }
                    if (var4 == 1) {
                        int[] var9 = class91.field1095 = new int[6];
                        var9[0] = var3.method1617((byte) 48);
                        var9[1] = var3.method1617((byte) 48);
                        var9[2] = var3.method1617((byte) 48);
                        var9[3] = var3.method1617((byte) 48);
                        var9[4] = var3.method1617((byte) 48);
                        var9[5] = var3.method1617((byte) 48);
                    } else if (var4 == 4) {
                        int var5 = var3.method1574(arg0 ^ 0x3B);
                        class249.field3560 = new int[var5];
                        for (int var6 = 0; var6 < var5; var6++) {
                            class249.field3560[var6] = var3.method1617((byte) 48);
                            if (class249.field3560[var6] == 65535) {
                                class249.field3560[var6] = -1;
                            }
                        }
                    } else if (var4 == 5) {
                        int var7 = var3.method1574(-111);
                        class10.field134 = new int[var7];
                        for (int var8 = 0; var8 < var7; var8++) {
                            class10.field134[var8] = var3.method1617((byte) 48);
                            if (class10.field134[var8] == 65535) {
                                class10.field134[var8] = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 1801)
    public static void method1111(int arg0) {
        field2299 = null;
        int var1 = 38 / ((arg0 + 22) / 40);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 1813)
    public static final void method1112() {
        int var0 = class158.field2058 ? class305.field4287 : class305.field4287 + class102.field1250;
        for (int var1 = -1; var1 < var0; var1++) {
            class396 var2;
            if (var1 < 0) {
                var2 = class384.field5422;
            } else if (var1 < class305.field4287) {
                var2 = class26.field314[class94.field1135[var1]];
            } else {
                var2 = class167.field2335[class86.field981[var1 - class305.field4287]];
            }
            var2.field5587 = 0;
            if (var2.field5622 < 0) {
                var2.field5581 = false;
            } else {
                int var3 = var2.method242(-30129);
                if ((var3 & 0x1) == 0) {
                    if ((var2.field3284 & 0x7F) != 0 || (var2.field3269 & 0x7F) != 0) {
                        var2.field5581 = false;
                        continue;
                    }
                } else if ((var2.field3284 & 0x7F) != 64 || (var2.field3269 & 0x7F) != 64) {
                    var2.field5581 = false;
                    continue;
                }
                int var10002;
                if (var3 == 1) {
                    int var4 = var2.field3284 >> 7;
                    int var5 = var2.field3269 >> 7;
                    if (class193.field2775[var4][var5] != var2.field5622) {
                        var2.field5581 = true;
                        continue;
                    }
                    if (class123.field1507[var4][var5] > 1) {
                        var10002 = class123.field1507[var4][var5]--;
                        var2.field5581 = true;
                        continue;
                    }
                } else {
                    int var6 = (var3 - 1) * 64 + 60;
                    int var7 = var2.field3284 - var6 >> 7;
                    int var8 = var2.field3269 - var6 >> 7;
                    int var9 = var2.field3284 + var6 >> 7;
                    int var10 = var2.field3269 + var6 >> 7;
                    if (!class152.method920(var2.field5622, var10, var7, 1, var9, var8)) {
                        for (int var11 = var7; var11 <= var9; var11++) {
                            for (int var12 = var8; var12 <= var10; var12++) {
                                if (class193.field2775[var11][var12] == var2.field5622) {
                                    var10002 = class123.field1507[var11][var12]--;
                                }
                            }
                        }
                        var2.field5581 = true;
                        continue;
                    }
                }
                if (var2 instanceof class40 && var2.field5658 != null && class189.field2726 >= var2.field5662 && class189.field2726 < var2.field5669) {
                    ((class40) var2).field448 = false;
                }
                var2.field5581 = false;
                var2.field3287 = class114.method709(class129.field1570, var2.field3284, 0, var2.field3269);
                class371.method2364(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 1931)
    public static final void method1113() {
        for (int var0 = 0; var0 < class176.field2403; var0++) {
            int[] var1 = class193.field2775[var0];
            for (int var2 = 0; var2 < class383.field5395; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 1948)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class337.method2170("argument count", 1);
            }
            class118.field1444 = Integer.parseInt(arg0[0]);
            class237.field3389 = 2;
            if (arg0[1].equals("live")) {
                class411.field5900 = 0;
            } else if (arg0[1].equals("rc")) {
                class411.field5900 = 1;
            } else if (arg0[1].equals("wip")) {
                class411.field5900 = 2;
            } else {
                class337.method2170("modewhat", 1);
            }
            class271.field3836 = class3.method16(arg0[2], -6607);
            if (class271.field3836 == -1) {
                if (arg0[2].equals("english")) {
                    class271.field3836 = 0;
                } else if (arg0[2].equals("german")) {
                    class271.field3836 = 1;
                } else {
                    class337.method2170("language", 1);
                }
            }
            class170.field2354 = false;
            class217.field3066 = false;
            if (arg0[3].equals("game0")) {
                class384.field5425 = 0;
            } else if (arg0[3].equals("game1")) {
                class384.field5425 = 1;
            } else {
                class337.method2170("game", 1);
            }
            class303.field4269 = 0;
            class176.field2397 = class384.field5425;
            class292.field4086 = "";
            class36.field423 = 0;
            client var1 = new client();
            class382.field5381 = var1;
            var1.method2481(29, 768, class384.field5425 == 1 ? "stellardawn" : "runescape", 1024, -11617, false, 569, class411.field5900 + 32);
            class272.field3857.setLocation(40, 40);
        } catch (Exception var3) {
            class422.method2663((String) null, var3, -107);
        }
        field2313++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lon;)Lon;", line = 2015)
    public static final class184 method1114(class184 arg0) {
        int var1 = method1121(arg0).method1861(-6813);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class282.method1863(arg0.field2599, -25835);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZIIIIII)V", line = 2040)
    public static final void method1115(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2308++;
        if (arg0 < 128 || arg1 < 128 || (class176.field2403 * 128 - 256) < arg0 || arg1 > class383.field5395 * 128 - 256) {
            class207.field2955[0] = class207.field2955[1] = -1;
            return;
        }
        int var9 = class114.method709(class129.field1570, arg0, 0, arg1) - arg7;
        class65.field743.method125(arg4, 0, 0);
        class151.field1873.method628(class65.field743);
        class151.field1873.method687(arg0, var9, arg1, class207.field2955);
        class65.field743.method125(-arg4, 0, 0);
        if (arg2) {
            class151.field1873.method628(class65.field743);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 2065)
    public final void init() {
        field2304++;
        if (!this.method2486((byte) 106)) {
            return;
        }
        class118.field1444 = Integer.parseInt(this.getParameter("worldid"));
        class237.field3389 = Integer.parseInt(this.getParameter("modewhere"));
        if (class237.field3389 < 0 || class237.field3389 > 1) {
            class237.field3389 = 0;
        }
        class411.field5900 = Integer.parseInt(this.getParameter("modewhat"));
        if (class411.field5900 < 0 || class411.field5900 > 2) {
            class411.field5900 = 0;
        }
        try {
            class271.field3836 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var7) {
            class271.field3836 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class170.field2354 = true;
        } else {
            class170.field2354 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class217.field3066 = true;
        } else {
            class217.field3066 = false;
        }
        String var3 = this.getParameter("game");
        if (var3 != null && var3.equals("1")) {
            class384.field5425 = 1;
        } else {
            class384.field5425 = 0;
        }
        try {
            class303.field4269 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var6) {
            class303.field4269 = 0;
        }
        class274.field3883 = this.getParameter("quiturl");
        class292.field4086 = this.getParameter("settings");
        if (class292.field4086 == null) {
            class292.field4086 = "";
        }
        String var4 = this.getParameter("country");
        if (var4 != null) {
            try {
                class36.field423 = Integer.parseInt(var4);
            } catch (Exception var5) {
                class36.field423 = 0;
            }
        }
        class176.field2397 = Integer.parseInt(this.getParameter("colourid"));
        if (class176.field2397 < 0 || class203.field2914.length <= class176.field2397) {
            class176.field2397 = 0;
        }
        class382.field5381 = this;
        this.method2484(569, 765, 503, class411.field5900 + 32, 0);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 2138)
    public final void method1116(int arg0) {
        field2302++;
        method1111(arg0 ^ 0x2BE4);
        class260.method1742((byte) 55);
        class20.method149((byte) -123);
        class362.method2332((byte) 74);
        class72.method409(-64);
        class365.method2337(5);
        class127.method789(true);
        class331.method2139(3);
        class406.method2597(3);
        class295.method1951(arg0 - 11257);
        class288.method1889((byte) 69);
        class75.method417(arg0 ^ 0x2BE9);
        class18.method117((byte) -89);
        class134.method828((byte) 30);
        class219.method1466(arg0 - 11048);
        class236.method1593(-124);
        class92.method507(-2);
        class211.method1429(false);
        class202.method1342((byte) 28);
        class360.method2325((byte) 82);
        class448.method2780(6422);
        class402.method2560(arg0 - 35314);
        class359.method2311(-55);
        class376.method2407(arg0 ^ arg0);
        class392.method2501(1);
        class117.method727(-86);
        class237.method1627(arg0 - 11048);
        class77.method425(true);
        class332.method2152(12126);
        class119.method749((byte) 62);
        class300.method1979((byte) -35);
        class230.method1530(arg0 + 9094);
        class271.method1792(-1);
        class393.method2513((byte) -50);
        class184.method1238(-125);
        class337.method2169(true);
        class17.method113(5040);
        class118.method729((byte) 100);
        class162.method1080(arg0 ^ 0xFFFFBDCF);
        class19.method141(21897);
        class274.method1814((byte) -118);
        class412.method2630((byte) 68);
        class396.method2525(arg0 - 11148);
        class266.method1774((byte) 75);
        class193.method1309(-58);
        class248.method1689(arg0 ^ 0x2BA3);
        class89.method494((byte) 127);
        class167.method1128(true);
        class281.method1862(arg0 - 10124);
        class355.method2256(-39);
        class160.method1028((byte) -86);
        class210.method1408(false);
        class327.method2115(-15551);
        class63.method361((byte) -104);
        class397.method2537(0);
        class59.method348(true);
        class199.method1315((byte) 116);
        class264.method1757(128);
        class299.method1974(14);
        class296.method1955(true);
        class215.method1446(arg0 ^ 0x6D4C);
        class432.method2712(-115);
        class229.method1529(-128);
        class7.method48(false);
        class88.method478(false);
        class232.method1533(-4887);
        class180.method1214(true);
        class410.method2620((byte) -112);
        class371.method2365((byte) -11);
        class135.method831((byte) -16);
        class163.method1082(-1);
        class101.method565(0);
        class340.method2183((byte) -126);
        class5.method37(-18414);
        class45.method266((byte) -120);
        class82.method459((byte) -10);
        class146.method888(true);
        class189.method1290(0);
        class177.method1200(-43);
        class294.method1942(19725);
        class310.method2048(-20319);
        class216.method1450(arg0 ^ 0x2BB4);
        class126.method788(arg0 + 12578);
        class130.method803(arg0 - 11082);
        class262.method1750((byte) -114);
        class113.method707(-1421);
        class21.method155((byte) 57);
        class425.method2676(-126);
        class373.method2372();
        class258.method1731((byte) -85);
        class10.method77(0);
        class439.method2742(-12352);
        class54.method312(113);
        class374.method2384(arg0 - 11151);
        class351.method2242(-6993);
        class55.method316(-121);
        class201.method1334();
        class308.method2026();
        class3.method14(true);
        class324.method2111((byte) -38);
        class60.method356();
        class322.method2101((byte) 45);
        class352.method2245(arg0 - 11139);
        class200.method1322((byte) -94);
        class138.method851(arg0 - 11147);
        class347.method2218(1);
        class182.method1224(-17938);
        class41.method251(107);
        class383.method2463(arg0 ^ 0xFFFFD42A);
        class170.method1143(14);
        class36.method220(0);
        class298.method1966(true);
        class247.method1680(1000000);
        class87.method471(4);
        class442.method2758(-237);
        class306.method2013((byte) 113);
        class97.method537((byte) 2);
        class244.method1656((byte) 112);
        class370.method2360(-1);
        class1.method2((byte) -92);
        class150.method913(false);
        class303.method1997((byte) -105);
        class24.method173((byte) -34);
        class225.method1504(-101);
        class56.method325((byte) -107);
        class50.method291(true);
        class334.method2159((byte) -86);
        class106.method582((byte) -113);
        class39.method236(false);
        class168.method1135((byte) -107);
        class214.method1438(false);
        class174.method1192(0);
        class204.method1351(25851);
        class99.method551((byte) -15);
        class280.method1844();
        class452.method2802((byte) 11);
        class153.method928(121);
        class272.method1796(101);
        class128.method795(-40);
        class233.method1540((byte) 76);
        class29.method197(arg0 ^ 0x2BC1);
        class186.method1279(12208);
        class209.method1370();
        class265.method1760(103);
        class12.method87((byte) -123);
        class46.method274(92);
        class212.method1435(-103);
        class394.method2518(arg0 - 11025);
        class48.method277((byte) -56);
        class250.method1699(arg0 ^ 0xFFFF873C);
        class152.method923(false);
        class66.method374(arg0 - 11147);
        class408.method2610((byte) -113);
        class22.method160(0);
        class411.method2623(-1253404072);
        class356.method2269(true);
        class358.method2295((byte) -44);
        class279.method1841((byte) 71);
        class164.method1125(255);
        class435.method2728((byte) -52);
        class313.method2060(0);
        class261.method1743(arg0 + 7144);
        class100.method554((byte) -100);
        class241.method1648((byte) 27);
        class301.method1986();
        class158.method1012(true);
        class178.method1211((byte) 118);
        class8.method55(-1);
        class203.method1346(0);
        class192.method1300((byte) 103);
        class105.method579(-126);
        class35.method215(arg0 ^ 0x2BDF);
        class254.method1714(8888);
        class404.method2571(true);
        class420.method2659((byte) -19);
        class403.method2570(59);
        class423.method2668(-25);
        class235.method1551(0);
        class33.method211(arg0 ^ 0xFFFFD415);
        class320.method2096();
        class190.method1291(108);
        class389.method2492(8);
        class345.method2200(0);
        class4.method22(arg0 - 11147);
        class286.method1871(17439);
        class268.method1781(arg0 - 11219);
        class255.method1724((byte) 116);
        class129.method800(0);
        class328.method2122((byte) -9);
        class95.method526((byte) -124);
        class142.method865();
        class382.method2455(2);
        class367.method2342((byte) 69);
        class218.method1460((byte) -27);
        class166.method1127(81);
        class68.method382((byte) 124);
        class421.method2661(-31235);
        class148.method898(false);
        class445.method2771();
        class251.method1704();
        class78.method437((byte) 19);
        class263.method1754(-1);
        class49.method284(114);
        class25.method177(arg0 ^ 0x2BE4);
        class311.method2053(-128);
        class76.method424(-6095);
        class109.method695((byte) 61);
        class319.method2095();
        class226.method1510();
        class441.method2756(true);
        class339.method2179(-1);
        class407.method2599();
        class14.method105(true);
        class98.method542((byte) -27);
        class208.method1358(124);
        class141.method862(false);
        class26.method182((byte) 89);
        class132.method818((byte) 73);
        class123.method779(-30516);
        class112.method701(arg0 + 21145);
        class309.method2045(0);
        class348.method2225((byte) 124);
        class161.method1034((byte) -17);
        class385.method2470(3);
        class183.method1231(-2);
        class447.method2775(false);
        class400.method2549(arg0 ^ 0x2BC4);
        class69.method397(-126);
        class318.method2080((byte) 20);
        class409.method2613(8685);
        class379.method2443((byte) -114);
        class253.method1711((byte) -57);
        class444.method2769(false);
        class335.method2167(arg0 - 10123);
        class297.method1961(arg0 - 11081);
        class292.method1935((byte) 97);
        class71.method405(2);
        class257.method1728(498);
        class144.method876(arg0 ^ 0xFFFFD41A);
        class93.method517((byte) -64);
        class73.method412((byte) -56);
        class401.method2554((byte) -91);
        class102.method570((byte) 114);
        class65.method369(arg0 - 11228);
        class91.method497(4985);
        class28.method187((byte) -124);
        class86.method468((byte) 0);
        class149.method901(121);
        class11.method80(4096);
        class143.method875(5);
        class293.method1938(-47);
        class273.method1803(13156);
        class369.method2353(15);
        class384.method2467(-7925);
        class305.method2009(65536);
        class291.method1932(4096);
        class399.method2539((byte) -33);
        class207.method1357((byte) -128);
        class114.method708(-88);
        class341.method2187(false);
        class312.method2057((byte) 56);
        class222.method1489(true);
        class125.method783(arg0 - 11022);
        class434.method2722(arg0 - 28879);
        class405.method2588(false);
        class366.method2341((byte) 79);
        class428.method2679();
        class15.method106();
        class154.method931((byte) -125);
        class240.method1643(79);
        class81.method455(false);
        class79.method442(-1);
        class285.method1866((byte) 112);
        class330.method2129(-1);
        class249.method1697((byte) 114);
        class62.method358(arg0 ^ 0xFFFFA1F9);
        class151.method918(false);
        class325.method2114((byte) -54);
        class450.method2791(-26279);
        class267.method1778((byte) -111);
        class176.method1198(-19188);
        class276.method1826(0);
        class181.method1223(110);
        class94.method522((byte) 127);
        class223.method1492((byte) -84);
        class418.method2656(0);
        class377.method2440(16929);
        class302.method1991(24352);
        class23.method165(2);
        class422.method2664((byte) -95);
        class131.method810(66);
        class419.method2657(arg0 ^ 0x2B8B);
        class451.method2792(103);
        class43.method262(-1749180404);
        class443.method2763(32058);
        class346.method2212(false);
        class323.method2107(-7216);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lon;IIIIIIIII)V", line = 2447)
    public static final void method1117(class184[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class184 var11 = arg0[var10];
            if (var11 != null && var11.field2599 == arg1) {
                int var12 = var11.field2567 + arg6;
                int var13 = var11.field2602 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field2524 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field2618 + var12;
                    int var19 = var11.field2516 + var13;
                    if (var11.field2524 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field2524 == 0 || var11.field2555 || method1121(var11).field3981 != 0 || class276.field3921 == var11 || var11.field2561 == 1338) {
                    if (!method1119(var11)) {
                        if (class225.field3144 == var11) {
                            class254.field3664 = true;
                            class425.field6085 = var12;
                            class334.field4732 = var13;
                        }
                        if (var11.field2641 || var14 < var16 && var15 < var17) {
                            if (var11.field2524 == 0 && var11.field2606 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class272 var20 = (class272) class92.field1120.method506((byte) -128); var20 != null; var20 = (class272) class92.field1120.method514(true)) {
                                    if (var20.field3852) {
                                        var20.method2594((byte) -22);
                                        var20.field3851.field2609 = false;
                                    }
                                }
                                if (class122.field1498 == 0) {
                                    class225.field3144 = null;
                                    class276.field3921 = null;
                                }
                                class2.field19 = 0;
                                class87.field990 = false;
                                class161.field2131 = false;
                                if (!class435.field6270) {
                                    class367.method2344(117);
                                }
                            }
                            boolean var21;
                            if (class306.field4306.method17(20417) >= var14 && class306.field4306.method18(1) >= var15 && class306.field4306.method17(20417) < var16 && class306.field4306.method18(1) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class435.field6270 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class22.method159(arg9 - var13, (byte) 27, var11, arg8 - var12);
                            }
                            boolean var22 = false;
                            if (class306.field4306.method32(false) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            if (class203.field2927 != null && class203.field2927.method1828(1) == 0 && class203.field2927.method1823((byte) 106) >= var14 && class203.field2927.method1830(32431) >= var15 && class203.field2927.method1823((byte) 122) < var16 && class203.field2927.method1830(32431) < var17) {
                                var23 = true;
                            }
                            if (var11.field2636 != null) {
                                for (int var24 = 0; var24 < var11.field2636.length; var24++) {
                                    if (class441.field6334.method2208(false, var11.field2636[var24])) {
                                        if (var11.field2590 == null || class189.field2726 >= var11.field2590[var24]) {
                                            byte var25 = var11.field2526[var24];
                                            if (var25 == 0 || ((var25 & 0x8) == 0 || !class441.field6334.method2208(false, 86) && !class441.field6334.method2208(false, 82) && !class441.field6334.method2208(false, 81)) && ((var25 & 0x2) == 0 || class441.field6334.method2208(false, 86)) && ((var25 & 0x1) == 0 || class441.field6334.method2208(false, 82)) && ((var25 & 0x4) == 0 || class441.field6334.method2208(false, 81))) {
                                                class222.method1487(var24 + 1, var11.field2584, (byte) 66, "", -1);
                                                int var26 = var11.field2647[var24];
                                                if (var11.field2590 == null) {
                                                    var11.field2590 = new int[var11.field2636.length];
                                                }
                                                if (var26 == 0) {
                                                    var11.field2590[var24] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field2590[var24] = class189.field2726 + var26;
                                                }
                                            }
                                        }
                                    } else if (var11.field2590 != null) {
                                        var11.field2590[var24] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class419.method2658(var11, 0, class203.field2927.method1823((byte) 122) - var12, class203.field2927.method1830(32431) - var13);
                            }
                            if (class225.field3144 != null && class225.field3144 != var11 && var21 && method1121(var11).method1855(-127)) {
                                class199.field2834 = var11;
                            }
                            if (class276.field3921 == var11) {
                                class191.field2751 = true;
                                class5.field71 = var12;
                                class36.field424 = var13;
                            }
                            if (var11.field2555 || var11.field2561 != 0) {
                                if (var21 && class200.field2847 != 0 && var11.field2614 != null) {
                                    class272 var27 = new class272();
                                    var27.field3852 = true;
                                    var27.field3851 = var11;
                                    var27.field3858 = class200.field2847;
                                    var27.field3848 = var11.field2614;
                                    class92.field1120.method509((byte) 115, var27);
                                }
                                if (class225.field3144 != null || class435.field6270 || var11.field2561 != 1400 && class2.field19 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field2561 != 0) {
                                    if (var11.field2561 == 1337 || var11.field2561 == 1403) {
                                        class113.field1390 = var11;
                                        if (class332.field4704 != null) {
                                            class332.field4704.method1790(var11.field2516, (byte) -79, class151.field1873);
                                        }
                                        if (var11.field2561 == 1337) {
                                            if (!class435.field6270 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class95.method531(arg9, class151.field1873, arg8, -1);
                                                for (class278 var28 = (class278) class272.field3856.method2509((byte) 51); var28 != null; var28 = (class278) class272.field3856.method2515(0)) {
                                                    if (arg8 >= var28.field3936 && arg8 < var28.field3934 && arg9 >= var28.field3933 && arg9 < var28.field3935) {
                                                        class367.method2344(117);
                                                        class17.method114(64, var28.field3937);
                                                    }
                                                }
                                            }
                                            class14.method103(var13, var11, var12, true);
                                            continue;
                                        }
                                    }
                                    if (var11.field2561 == 1338) {
                                        if (var11.method1240(class151.field1873, 47) == null || class39.field447 != 0 && class39.field447 != 3 || class435.field6270 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var29 = arg8 - var12;
                                        int var30 = arg9 - var13;
                                        int var31 = var11.field2608[var30];
                                        if (var29 < var31 || var29 > var11.field2538[var30] + var31) {
                                            continue;
                                        }
                                        int var32 = var29 - var11.field2618 / 2;
                                        int var33 = var30 - var11.field2516 / 2;
                                        int var34;
                                        if (class129.field1568 == 4) {
                                            var34 = (int) class441.field6333 & 0x3FFF;
                                        } else {
                                            var34 = (int) class441.field6333 + class297.field4137 & 0x3FFF;
                                        }
                                        int var35 = class158.field2055[var34];
                                        int var36 = class158.field2059[var34];
                                        if (class129.field1568 != 4) {
                                            var35 = (class292.field4089 + 256) * var35 >> 8;
                                            var36 = (class292.field4089 + 256) * var36 >> 8;
                                        }
                                        int var37 = var32 * var36 + var33 * var35 >> 15;
                                        int var38 = var33 * var36 - var32 * var35 >> 15;
                                        int var39;
                                        int var40;
                                        if (class129.field1568 == 4) {
                                            var39 = (class130.field1576 >> 7) + (var37 >> 2);
                                            var40 = (class79.field929 >> 7) - (var38 >> 2);
                                        } else {
                                            int var41 = (class384.field5422.method242(-30129) - 1) * 64;
                                            var39 = (class384.field5422.field3284 - var41 >> 7) + (var37 >> 2);
                                            var40 = (class384.field5422.field3269 - var41 >> 7) - (var38 >> 2);
                                        }
                                        if (class279.field3951 && (class347.field4901 & 0x40) != 0) {
                                            class184 var42 = class341.method2186(class408.field5883, (byte) 21, class188.field2714);
                                            if (var42 == null) {
                                                class3.method13(-11372);
                                            } else {
                                                class421.method2660(var39, " ->", class22.field279, class154.field1907, 1L, var40, 12, (byte) 95);
                                            }
                                            continue;
                                        }
                                        if (class384.field5425 == 1) {
                                            class421.method2660(var39, "", -1, class193.field2794.method2331(25, class271.field3836), 1L, var40, 45, (byte) 121);
                                        }
                                        class421.method2660(var39, "", -1, class408.field5878, 1L, var40, 21, (byte) 37);
                                        continue;
                                    }
                                    if (var11.field2561 == 1400) {
                                        class337.field4795 = var11;
                                        if (var21) {
                                            class87.field990 = true;
                                        }
                                        if (var23) {
                                            int var43 = (int) ((double) (class203.field2927.method1823((byte) 103) - var12 - var11.field2618 / 2) * 2.0D / (double) class308.field4355);
                                            int var44 = (int) (-((double) (class203.field2927.method1830(32431) - var13 - var11.field2516 / 2) * 2.0D / (double) class308.field4355));
                                            int var45 = class324.field4619 + var43 + class308.field4368;
                                            int var46 = class419.field5993 + var44 + class308.field4367;
                                            class300 var47 = class242.method1651((byte) -100);
                                            if (var47 == null) {
                                                continue;
                                            }
                                            int[] var48 = new int[3];
                                            var47.method1983((byte) -101, var46, var48, var45);
                                            if (var48 != null) {
                                                if (class441.field6334.method2208(false, 82) && class135.field1685 > 0) {
                                                    class125.method785(var48[1], var48[2], (byte) 93, var48[0]);
                                                    continue;
                                                }
                                                class161.field2131 = true;
                                                class254.field3665 = var48[0];
                                                class165.field2327 = var48[1];
                                                class412.field5936 = var48[2];
                                            }
                                            class2.field19 = 1;
                                            class339.field4813 = false;
                                            class3.field24 = class306.field4306.method17(20417);
                                            class261.field3723 = class306.field4306.method18(1);
                                            continue;
                                        }
                                        if (var22 && class2.field19 > 0) {
                                            if (class2.field19 == 1 && (class3.field24 != class306.field4306.method17(20417) || class261.field3723 != class306.field4306.method18(1))) {
                                                class43.field537 = class324.field4619;
                                                class297.field4158 = class419.field5993;
                                                class2.field19 = 2;
                                            }
                                            if (class2.field19 == 2) {
                                                class339.field4813 = true;
                                                class306.method2011(class43.field537 + (int) ((double) (class3.field24 - class306.field4306.method17(20417)) * 2.0D / (double) class308.field4351), false);
                                                class39.method234(class297.field4158 - (int) ((double) (class261.field3723 - class306.field4306.method18(1)) * 2.0D / (double) class308.field4351), -1);
                                            }
                                            continue;
                                        }
                                        if (class2.field19 > 0 && !class339.field4813) {
                                            if ((class392.field5516 == 1 || class129.method797(-2001)) && class208.field2958 > 2) {
                                                class415.method2645(2, 83, class261.field3723, class3.field24);
                                            } else if (class276.method1824(-64)) {
                                                class415.method2645(0, 119, class261.field3723, class3.field24);
                                            }
                                        }
                                        class2.field19 = 0;
                                        continue;
                                    }
                                    if (var11.field2561 == 1401) {
                                        if (var22) {
                                            class113.method706(var11.field2618, 4, var11.field2516, class306.field4306.method17(20417) - var12, class306.field4306.method18(1) - var13);
                                        }
                                        continue;
                                    }
                                    if (var11.field2561 == 1406) {
                                        class180.method1217(var11, (byte) 115, var13, var12);
                                        continue;
                                    }
                                }
                                if (!var11.field2530 && var23) {
                                    var11.field2530 = true;
                                    if (var11.field2579 != null) {
                                        class272 var49 = new class272();
                                        var49.field3852 = true;
                                        var49.field3851 = var11;
                                        var49.field3847 = class203.field2927.method1823((byte) 116) - var12;
                                        var49.field3858 = class203.field2927.method1830(32431) - var13;
                                        var49.field3848 = var11.field2579;
                                        class92.field1120.method509((byte) 109, var49);
                                    }
                                }
                                if (var11.field2530 && var22 && var11.field2610 != null) {
                                    class272 var50 = new class272();
                                    var50.field3852 = true;
                                    var50.field3851 = var11;
                                    var50.field3847 = class306.field4306.method17(20417) - var12;
                                    var50.field3858 = class306.field4306.method18(1) - var13;
                                    var50.field3848 = var11.field2610;
                                    class92.field1120.method509((byte) 99, var50);
                                }
                                if (var11.field2530 && !var22) {
                                    var11.field2530 = false;
                                    if (var11.field2551 != null) {
                                        class272 var51 = new class272();
                                        var51.field3852 = true;
                                        var51.field3851 = var11;
                                        var51.field3847 = class306.field4306.method17(20417) - var12;
                                        var51.field3858 = class306.field4306.method18(1) - var13;
                                        var51.field3848 = var11.field2551;
                                        class412.field5908.method509((byte) 117, var51);
                                    }
                                }
                                if (var22 && var11.field2661 != null) {
                                    class272 var52 = new class272();
                                    var52.field3852 = true;
                                    var52.field3851 = var11;
                                    var52.field3847 = class306.field4306.method17(20417) - var12;
                                    var52.field3858 = class306.field4306.method18(1) - var13;
                                    var52.field3848 = var11.field2661;
                                    class92.field1120.method509((byte) 116, var52);
                                }
                                if (!var11.field2609 && var21) {
                                    var11.field2609 = true;
                                    if (var11.field2596 != null) {
                                        class272 var53 = new class272();
                                        var53.field3852 = true;
                                        var53.field3851 = var11;
                                        var53.field3847 = class306.field4306.method17(20417) - var12;
                                        var53.field3858 = class306.field4306.method18(1) - var13;
                                        var53.field3848 = var11.field2596;
                                        class92.field1120.method509((byte) 124, var53);
                                    }
                                }
                                if (var11.field2609 && var21 && var11.field2620 != null) {
                                    class272 var54 = new class272();
                                    var54.field3852 = true;
                                    var54.field3851 = var11;
                                    var54.field3847 = class306.field4306.method17(20417) - var12;
                                    var54.field3858 = class306.field4306.method18(1) - var13;
                                    var54.field3848 = var11.field2620;
                                    class92.field1120.method509((byte) 118, var54);
                                }
                                if (var11.field2609 && !var21) {
                                    var11.field2609 = false;
                                    if (var11.field2543 != null) {
                                        class272 var55 = new class272();
                                        var55.field3852 = true;
                                        var55.field3851 = var11;
                                        var55.field3847 = class306.field4306.method17(20417) - var12;
                                        var55.field3858 = class306.field4306.method18(1) - var13;
                                        var55.field3848 = var11.field2543;
                                        class412.field5908.method509((byte) 104, var55);
                                    }
                                }
                                if (var11.field2631 != null) {
                                    class272 var56 = new class272();
                                    var56.field3851 = var11;
                                    var56.field3848 = var11.field2631;
                                    class281.field3986.method509((byte) 103, var56);
                                }
                                if (var11.field2669 != null && class140.field1731 > var11.field2531) {
                                    if (var11.field2572 == null || class140.field1731 - var11.field2531 > 32) {
                                        class272 var61 = new class272();
                                        var61.field3851 = var11;
                                        var61.field3848 = var11.field2669;
                                        class92.field1120.method509((byte) 125, var61);
                                    } else {
                                        label670: for (int var57 = var11.field2531; var57 < class140.field1731; var57++) {
                                            int var58 = class285.field4002[var57 & 0x1F];
                                            for (int var59 = 0; var59 < var11.field2572.length; var59++) {
                                                if (var11.field2572[var59] == var58) {
                                                    class272 var60 = new class272();
                                                    var60.field3851 = var11;
                                                    var60.field3848 = var11.field2669;
                                                    class92.field1120.method509((byte) 126, var60);
                                                    break label670;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2531 = class140.field1731;
                                }
                                if (var11.field2639 != null && class380.field5346 > var11.field2527) {
                                    if (var11.field2519 == null || class380.field5346 - var11.field2527 > 32) {
                                        class272 var66 = new class272();
                                        var66.field3851 = var11;
                                        var66.field3848 = var11.field2639;
                                        class92.field1120.method509((byte) 122, var66);
                                    } else {
                                        label646: for (int var62 = var11.field2527; var62 < class380.field5346; var62++) {
                                            int var63 = class14.field184[var62 & 0x1F];
                                            for (int var64 = 0; var64 < var11.field2519.length; var64++) {
                                                if (var11.field2519[var64] == var63) {
                                                    class272 var65 = new class272();
                                                    var65.field3851 = var11;
                                                    var65.field3848 = var11.field2639;
                                                    class92.field1120.method509((byte) 107, var65);
                                                    break label646;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2527 = class380.field5346;
                                }
                                if (var11.field2624 != null && class132.field1607 > var11.field2634) {
                                    if (var11.field2653 == null || class132.field1607 - var11.field2634 > 32) {
                                        class272 var71 = new class272();
                                        var71.field3851 = var11;
                                        var71.field3848 = var11.field2624;
                                        class92.field1120.method509((byte) 102, var71);
                                    } else {
                                        label622: for (int var67 = var11.field2634; var67 < class132.field1607; var67++) {
                                            int var68 = class230.field3254[var67 & 0x1F];
                                            for (int var69 = 0; var69 < var11.field2653.length; var69++) {
                                                if (var11.field2653[var69] == var68) {
                                                    class272 var70 = new class272();
                                                    var70.field3851 = var11;
                                                    var70.field3848 = var11.field2624;
                                                    class92.field1120.method509((byte) 112, var70);
                                                    break label622;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2634 = class132.field1607;
                                }
                                if (var11.field2658 != null && class291.field4072 > var11.field2654) {
                                    if (var11.field2626 == null || class291.field4072 - var11.field2654 > 32) {
                                        class272 var76 = new class272();
                                        var76.field3851 = var11;
                                        var76.field3848 = var11.field2658;
                                        class92.field1120.method509((byte) 105, var76);
                                    } else {
                                        label598: for (int var72 = var11.field2654; var72 < class291.field4072; var72++) {
                                            int var73 = class146.field1795[var72 & 0x1F];
                                            for (int var74 = 0; var74 < var11.field2626.length; var74++) {
                                                if (var11.field2626[var74] == var73) {
                                                    class272 var75 = new class272();
                                                    var75.field3851 = var11;
                                                    var75.field3848 = var11.field2658;
                                                    class92.field1120.method509((byte) 127, var75);
                                                    break label598;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2654 = class291.field4072;
                                }
                                if (var11.field2573 != null && class19.field234 > var11.field2591) {
                                    if (var11.field2549 == null || class19.field234 - var11.field2591 > 32) {
                                        class272 var81 = new class272();
                                        var81.field3851 = var11;
                                        var81.field3848 = var11.field2573;
                                        class92.field1120.method509((byte) 102, var81);
                                    } else {
                                        label574: for (int var77 = var11.field2591; var77 < class19.field234; var77++) {
                                            int var78 = class384.field5420[var77 & 0x1F];
                                            for (int var79 = 0; var79 < var11.field2549.length; var79++) {
                                                if (var11.field2549[var79] == var78) {
                                                    class272 var80 = new class272();
                                                    var80.field3851 = var11;
                                                    var80.field3848 = var11.field2573;
                                                    class92.field1120.method509((byte) 101, var80);
                                                    break label574;
                                                }
                                            }
                                        }
                                    }
                                    var11.field2591 = class19.field234;
                                }
                                if (class128.field1560 > var11.field2633 && var11.field2534 != null) {
                                    class272 var82 = new class272();
                                    var82.field3851 = var11;
                                    var82.field3848 = var11.field2534;
                                    class92.field1120.method509((byte) 102, var82);
                                }
                                if (class56.field676 > var11.field2633 && var11.field2580 != null) {
                                    class272 var83 = new class272();
                                    var83.field3851 = var11;
                                    var83.field3848 = var11.field2580;
                                    class92.field1120.method509((byte) 119, var83);
                                }
                                if (class305.field4285 > var11.field2633 && var11.field2578 != null) {
                                    class272 var84 = new class272();
                                    var84.field3851 = var11;
                                    var84.field3848 = var11.field2578;
                                    class92.field1120.method509((byte) 108, var84);
                                }
                                if (class162.field2217 > var11.field2633 && var11.field2594 != null) {
                                    class272 var85 = new class272();
                                    var85.field3851 = var11;
                                    var85.field3848 = var11.field2594;
                                    class92.field1120.method509((byte) 126, var85);
                                }
                                if (class412.field5928 > var11.field2633 && var11.field2537 != null) {
                                    class272 var86 = new class272();
                                    var86.field3851 = var11;
                                    var86.field3848 = var11.field2537;
                                    class92.field1120.method509((byte) 111, var86);
                                }
                                var11.field2633 = class146.field1792;
                                if (var11.field2586 != null) {
                                    for (int var87 = 0; var87 < class82.field949; var87++) {
                                        class272 var88 = new class272();
                                        var88.field3851 = var11;
                                        var88.field3844 = class114.field1402[var87].method161(-1);
                                        var88.field3850 = class114.field1402[var87].method162(0);
                                        var88.field3848 = var11.field2586;
                                        class92.field1120.method509((byte) 119, var88);
                                    }
                                }
                                if (class229.field3240 && var11.field2553 != null) {
                                    class272 var89 = new class272();
                                    var89.field3851 = var11;
                                    var89.field3848 = var11.field2553;
                                    class92.field1120.method509((byte) 102, var89);
                                }
                            }
                            if (var11.field2524 == 5 && var11.field2569 != -1) {
                                var11.method1246(86).method1790(var11.field2516, (byte) -79, class151.field1873);
                            }
                            class279.method1840(2, var11);
                            if (var11.field2524 == 0) {
                                method1117(arg0, var11.field2584, var14, var15, var16, var17, var12 - var11.field2655, var13 - var11.field2648, arg8, arg9);
                                if (var11.field2603 != null) {
                                    method1117(var11.field2603, var11.field2584, var14, var15, var16, var17, var12 - var11.field2655, var13 - var11.field2648, arg8, arg9);
                                }
                                class167 var90 = (class167) class22.field280.method1888((long) var11.field2584, (byte) -30);
                                if (var90 != null) {
                                    if (var90.field2338 == 0 && !class435.field6270 && var21 && !class367.field5204) {
                                        class367.method2344(125);
                                    }
                                    class148.method894(var90.field2332, var17, -31574, arg9, var16, var13, arg8, var15, var14, var12);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class279.method1840(2, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "()V", line = 3328)
    public static final void method1118() {
        class222.field3121 = 0;
        for (int var0 = 0; var0 < class102.field1250; var0++) {
            class77 var1 = class167.field2335[class86.field981[var0]];
            if (var1.field5581 && var1.method245(-1) != -1) {
                int var2 = (var1.method242(-30129) - 1) * 64 + 60;
                int var3 = var1.field3284 - var2 >> 7;
                int var4 = var1.field3269 - var2 >> 7;
                class396 var5 = class404.method2586(-1675668601, var4, class129.field1570, var3);
                if (var5 != null) {
                    int var6 = var5.field5620;
                    if (var5 instanceof class77) {
                        var6 += 2048;
                    }
                    if (var5.field5587 == 0 && var5.method245(-1) != -1) {
                        class180.field2464[class222.field3121] = var6;
                        class11.field145[class222.field3121] = var6;
                        class222.field3121++;
                        var5.field5587++;
                    }
                    class180.field2464[class222.field3121] = var6;
                    class11.field145[class222.field3121] = var1.field5620 + 2048;
                    class222.field3121++;
                    var5.field5587++;
                }
            }
        }
        class318.method2081(0, class11.field145, (byte) -96, class222.field3121 - 1, class180.field2464);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lon;)Z", line = 3377)
    public static final boolean method1119(class184 arg0) {
        if (class367.field5204) {
            if (method1121(arg0).field3981 != 0) {
                return false;
            }
            if (arg0.field2524 == 0) {
                return false;
            }
        }
        return arg0.field2601;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "()V", line = 3392)
    public static final void method1120() {
        int var0 = class158.field2058 ? class305.field4287 : class305.field4287 + class102.field1250;
        for (int var1 = -1; var1 < var0; var1++) {
            class396 var2;
            if (var1 < 0) {
                var2 = class384.field5422;
            } else if (var1 < class305.field4287) {
                var2 = class26.field314[class94.field1135[var1]];
            } else {
                var2 = class167.field2335[class86.field981[var1 - class305.field4287]];
            }
            if (var2.field5622 >= 0) {
                int var3 = var2.method242(-30129);
                if ((var3 & 0x1) == 0) {
                    if ((var2.field3284 & 0x7F) == 0 && (var2.field3269 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var2.field3284 & 0x7F) == 64 && (var2.field3269 & 0x7F) == 64) {
                    continue;
                }
                if (var2 instanceof class40 && var2.field5658 != null && class189.field2726 >= var2.field5662 && class189.field2726 < var2.field5669) {
                    ((class40) var2).field448 = false;
                }
                var2.field3287 = class114.method709(class129.field1570, var2.field3284, 0, var2.field3269);
                class371.method2364(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lon;)Lbi;", line = 3439)
    public static final class281 method1121(class184 arg0) {
        class281 var1 = (class281) class322.field4588.method1888(((long) arg0.field2584 << 32) + (long) arg0.field2668, (byte) -30);
        return var1 == null ? arg0.field2637 : var1;
    }
}
