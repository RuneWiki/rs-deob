import jagex3.jagmisc.jagmisc;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class303 {

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "Lph;")
    public static class458 field2571;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "Z")
    public static boolean field2577;

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 4)
    public final void method1240(boolean arg0) {
        field2568++;
        try {
            if (!arg0) {
                this.method1260(-50);
            }
            this.method1247((byte) 127);
        } catch (OutOfMemoryError var3) {
            if (var3.getMessage() == null || !var3.getMessage().startsWith("native")) {
                throw var3;
            }
            class142.method874(0, (byte) -25);
            method1256(var3, -2020, var3.getMessage() + " (Recovered) " + this.method1262(-13));
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 29)
    private final void method1241(int arg0, int arg1) {
        class48.field503 = null;
        class162.field2108.field6534 = arg0;
        class162.field2108.field6532++;
        class447.field6525 = arg1;
        field2575++;
        class243.field3219 = null;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 42)
    private final void method1242(int arg0) {
        field2565++;
        if (class162.field2108.field6532 > class293.field3881) {
            class134.field1760 = (class162.field2108.field6532 - 1) * 50 * 5;
            class255.field3395.field3561 = !class255.field3395.field3561;
            if (class134.field1760 > 3000) {
                class134.field1760 = 3000;
            }
            if (class162.field2108.field6532 >= 2 && class162.field2108.field6534 == 6) {
                this.method1810(-124, "js5connect_outofdate");
                class527.field7734 = 13;
                return;
            }
            if (class162.field2108.field6532 >= 4 && class162.field2108.field6534 == -1) {
                this.method1810(-116, "js5crc");
                class527.field7734 = 13;
                return;
            }
            if (class162.field2108.field6532 >= 4 && class233.method1475(-72, class527.field7734)) {
                if (class162.field2108.field6534 == 7 || class162.field2108.field6534 == 9) {
                    this.method1810(-123, "js5connect_full");
                } else if (class162.field2108.field6534 <= 0) {
                    this.method1810(-107, "js5io");
                } else {
                    this.method1810(-102, "js5connect");
                }
                class527.field7734 = 13;
                return;
            }
        }
        class293.field3881 = class162.field2108.field6532;
        if (class134.field1760 > 0) {
            class134.field1760--;
            return;
        }
        try {
            if (class447.field6525 == 0) {
                class48.field503 = class381.field5518.method829(class255.field3395.method1628(62), class255.field3395.field3564, -12048);
                class447.field6525++;
            }
            if (class447.field6525 == 1) {
                if (class48.field503.field3149 == 2) {
                    this.method1241(1000, 0);
                    return;
                }
                if (class48.field503.field3149 == 1) {
                    class447.field6525++;
                }
            }
            if (class447.field6525 == 2) {
                class243.field3219 = new class426((Socket) class48.field503.field3151, class381.field5518);
                class396 var2 = new class396(5);
                var2.method2449((byte) 116, class459.field6849.field782);
                var2.method2398(-98, 596);
                class243.field3219.method2620(true, var2.field5761, 0, 5);
                class447.field6525++;
                class417.field6062 = class45.method252((byte) -8);
            }
            if (class447.field6525 == 3) {
                if (class233.method1475(110, class527.field7734) || class243.field3219.method2624(125) > 0) {
                    int var3 = class243.field3219.method2626((byte) -45);
                    if (var3 != 0) {
                        this.method1241(var3, 0);
                        return;
                    }
                    class447.field6525++;
                } else if ((class45.method252((byte) -8) - class417.field6062) > 30000L) {
                    this.method1241(1001, 0);
                    return;
                }
            }
            if (arg0 > -83) {
                field2571 = null;
            }
            if (class447.field6525 == 4) {
                boolean var4 = class527.field7734 == 1 || class458.method2817(125, class527.field7734) || class270.method1644((byte) 52, class527.field7734);
                class162.field2108.method2758(!var4, class243.field3219, (byte) -10);
                class243.field3219 = null;
                class447.field6525 = 0;
                class48.field503 = null;
            }
        } catch (IOException var5) {
            this.method1241(1002, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 183)
    public final void method1243(int arg0) {
        field2567++;
        try {
            this.method1244(-24492);
        } catch (OutOfMemoryError var4) {
            if (var4.getMessage() == null || !var4.getMessage().startsWith("native")) {
                throw var4;
            }
            class142.method874(0, (byte) -25);
            method1256(var4, -2020, var4.getMessage() + " (Recovered) " + this.method1262(-70));
        }
        int var3 = -59 / ((21 - arg0) / 56);
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 206)
    private final void method1244(int arg0) {
        field2562++;
        if (class527.field7734 == 13) {
            return;
        }
        long var2 = class421.method2602(-1) / 1000000L - class88.field1040;
        class88.field1040 = class421.method2602(-1) / 1000000L;
        boolean var4 = class80.method452(31192);
        if (arg0 != -24492) {
            field2571 = null;
        }
        if (var4 && class401.field5809 && class235.field3146 != null) {
            class235.field3146.method1047(arg0 + 26492);
        }
        if (class101.method622(class527.field7734, arg0 + 24583)) {
            if (class126.field1624 != 0L && class45.method252((byte) -8) > class126.field1624) {
                class163.method957(class319.field4256.field4656, class423.method2612(arg0 + 24494), false, class319.field4256.field4649, false);
            } else if (!class343.field4596.method1202() && class482.field7117) {
                class323.method1911((byte) -27);
            }
        }
        if (class119.field1559 == null) {
            Container var5;
            if (class173.field2224 == null) {
                var5 = class381.field5518.field1828;
            } else {
                var5 = class173.field2224;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class173.field2224 == var5) {
                Insets var8 = class173.field2224.getInsets();
                var6 -= var8.right + var8.left;
                var7 -= var8.top + var8.bottom;
            }
            if (class155.field2037 != var6 || class461.field6876 != var7) {
                if (class343.field4596 == null || class343.field4596.method1229()) {
                    class66.method389(-1025);
                } else {
                    class461.field6876 = var7;
                    class155.field2037 = var6;
                }
                class126.field1624 = class45.method252((byte) -8) + 500L;
            }
        }
        if (class119.field1559 != null && !class34.field346 && class101.method622(class527.field7734, -116)) {
            class163.method957(-1, class319.field4256.field4675, false, -1, false);
        }
        boolean var9 = false;
        if (class306.field4108) {
            var9 = true;
            class306.field4108 = false;
        }
        if (var9) {
            class21.method120((byte) -103);
        }
        if (class343.field4596 != null && class343.field4596.method1202() || class423.method2612(2) != 1) {
            class104.method628(-125);
        }
        if (class527.field7734 == 0) {
            class21.method117(class453.field6785[class419.field6083], false, class435.field6353[class419.field6083], var9, class266.field3568, class397.field5788, class273.field3638[class419.field6083]);
        } else if (class527.field7734 == 1) {
            class394.method2374(class343.field4596, class343.field4596.method1202() | var9, class453.field6785[class419.field6083].getRGB(), class79.field976, class273.field3638[class419.field6083].getRGB(), class435.field6353[class419.field6083].getRGB(), 2);
        } else if (class10.method66(class527.field7734, false)) {
            class104.method629((byte) 99);
        } else if (class520.method3105(arg0 ^ 0x3FF0, class527.field7734)) {
            class104.method629((byte) 119);
        } else if (class80.method454(-8, class527.field7734)) {
            if (class17.field164 == 1) {
                if (class267.field3575 > class462.field6894) {
                    class462.field6894 = class267.field3575;
                }
                int var11 = (class462.field6894 - class267.field3575) * 50 / class462.field6894;
                class31.method176(true, class225.field3028, class279.field3703.method1823(class374.field5072, (byte) -88) + "<br>(" + var11 + "%)", arg0 + 24605);
            } else if (class17.field164 == 2) {
                if (class321.field4274 > class347.field4627) {
                    class347.field4627 = class321.field4274;
                }
                int var10 = ((class347.field4627 - class321.field4274) * 50 / class347.field4627) + 50;
                class31.method176(true, class225.field3028, class279.field3703.method1823(class374.field5072, (byte) -88) + "<br>(" + var10 + "%)", arg0 + 24586);
            } else {
                class31.method176(true, class225.field3028, class279.field3703.method1823(class374.field5072, (byte) -88), 127);
            }
        } else if (class527.field7734 == 9) {
            class521.method3109(arg0 ^ 0xFFFFA02B, var2);
        } else if (class527.field7734 == 12) {
            class31.method176(true, class225.field3028, class100.field1374.method1823(class374.field5072, (byte) -88) + "<br>" + class143.field1902.method1823(class374.field5072, (byte) -88), arg0 + 24572);
        }
        if (class434.field6328 == 3) {
            for (int var12 = 0; var12 < class266.field3569; var12++) {
                Rectangle var13 = class331.field4393[var12];
                if (class207.field2728[var12]) {
                    class343.field4596.method1717(var13.width, var13.x, var13.height, -1996553985, arg0 ^ 0x6A2, var13.y);
                } else if (class114.field1496[var12]) {
                    class343.field4596.method1717(var13.width, var13.x, var13.height, -1996554240, -22794, var13.y);
                }
            }
        }
        if (class68.method397(109)) {
            class233.method1478(class343.field4596, -2);
        }
        if (class101.method622(class527.field7734, -126) && class434.field6328 == 0 && class423.method2612(2) == 1 && !var9 && class137.field1836.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class266.field3569; var15++) {
                if (class114.field1496[var15]) {
                    class114.field1496[var15] = false;
                    class362.field4951[var14++] = class331.field4393[var15];
                }
            }
            class343.field4596.method1152(class362.field4951, var14);
        } else if (class527.field7734 != 0) {
            class343.field4596.method1208();
            for (int var16 = 0; var16 < class266.field3569; var16++) {
                class114.field1496[var16] = false;
            }
        }
        if (class319.field4256.field4686 == 0) {
            class316.method1873(15L, false);
        } else if (class319.field4256.field4686 == 1) {
            class316.method1873(10L, false);
        } else if (class319.field4256.field4686 == 2) {
            class316.method1873(5L, false);
        } else if (class319.field4256.field4686 == 3) {
            class316.method1873(2L, false);
        }
        if (class127.field1649) {
            class339.method1975((byte) -103);
        }
        if (class319.field4256.field4658 && class527.field7734 == 2 && class168.field2174 != -1) {
            class319.field4256.field4658 = false;
            class319.field4256.method1743(class381.field5518, (byte) -26);
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 445)
    private final void method1245(int arg0) {
        field2573++;
        boolean var2 = class162.field2108.method2764((byte) 105);
        if (!var2) {
            this.method1242(-90);
        }
        if (arg0 <= 8) {
            field2571 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 462)
    private final void method1246(byte arg0) {
        if (class527.field7734 == 6 && class328.field4360 == 0) {
            if (class430.field6246 > 1) {
                class430.field6246--;
                class191.field2463 = class106.field1448;
            }
            if (class447.field6519 > 0) {
                class447.field6519--;
            }
            if (!class483.field7125) {
                class464.method2843(-1);
            }
            for (int var2 = 0; var2 < 100 && class227.method1452(50); var2++) {
            }
        }
        field2570++;
        class123.field1594++;
        class225.method1446(null, false, -1, -1);
        class193.method1106(null, -1, -1, (byte) -83);
        class214.method1369((byte) 7);
        class106.field1448++;
        if (arg0 >= -66) {
            this.method1266(-48);
        }
        for (int var3 = 0; var3 < 32768; var3++) {
            class22 var4 = class339.field4484[var3];
            if (var4 != null) {
                byte var5 = var4.field220.field2881;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method546(24273);
                    if ((var5 & 0x2) != 0 && var4.field1254 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field1249[0] + var7;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (class308.field4128 - var6 - 1 < var9) {
                                var9 = class308.field4128 - var6 - 1;
                            }
                            int var10 = var4.field1251[0] + var8;
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (var10 > (class426.field6200 - var6 - 1)) {
                                var10 = class426.field6200 - var6 - 1;
                            }
                            int var11 = class199.method1270(var10, true, var4.field1249[0], 0, class19.field169, var9, class471.field6998, var4.field1251[0], -112, var6, 0, var6, -1, class96.field1223[var4.field3695], var6);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field1249[var12] = class19.field169[var11 - var12 - 1];
                                    var4.field1251[var12] = class471.field6998[var11 - var12 - 1];
                                    var4.field1255[var12] = 1;
                                }
                                var4.field1254 = var11;
                            }
                        }
                    }
                    class280.method1693((byte) 21, true, var4);
                    int var13 = class379.method2316((byte) -26, var4);
                    class527.method3128(var4, class169.field2196, var13, class250.field3327, 0);
                    class163.method960(var4, 7);
                }
            }
        }
        if (class328.field4360 == 0 && class114.field1497 == 0) {
            if (class47.field491 == 2) {
                class333.method1943(true);
            } else {
                class154.method914(8);
            }
            if ((class238.field3171 >> 7) < 14 || (class238.field3171 >> 7) >= (class308.field4128 - 14) || (class139.field1857 >> 7) < 14 || class139.field1857 >> 7 >= class426.field6200 - 14) {
                class282.method1706(-110);
            }
        }
        while (true) {
            class293 var14;
            class450 var15;
            class450 var16;
            do {
                var14 = (class293) class380.field5509.method977((byte) 76);
                if (var14 == null) {
                    while (true) {
                        class293 var17;
                        class450 var18;
                        class450 var19;
                        do {
                            var17 = (class293) class533.field7849.method977((byte) -124);
                            if (var17 == null) {
                                while (true) {
                                    class293 var20;
                                    class450 var21;
                                    class450 var22;
                                    do {
                                        var20 = (class293) class354.field4735.method977((byte) 127);
                                        if (var20 == null) {
                                            if (class188.field2436 != null) {
                                                class385.method2342(-1821699996);
                                            }
                                            if ((class532.field7836 % 1500) == 0) {
                                                class38.method218(1);
                                            }
                                            if (class527.field7734 == 6 && class328.field4360 == 0) {
                                                class242.method1512(2);
                                            }
                                            class493.method2981(87);
                                            if (class323.field4297 && class45.method252((byte) -8) - 60000L > class340.field4495) {
                                                class365.method2173(45);
                                            }
                                            for (class304 var23 = (class304) class123.field1601.method290(-1); var23 != null; var23 = (class304) class123.field1601.method284(10748)) {
                                                if ((class45.method252((byte) -8) / 1000L - 5L) > ((long) var23.field4043)) {
                                                    if (var23.field4047 > 0) {
                                                        class119.method714(var23.field4041 + class337.field4459.method1823(class374.field5072, (byte) -88), "", 5, (byte) 102, "", 0);
                                                    }
                                                    if (var23.field4047 == 0) {
                                                        class119.method714(var23.field4041 + class42.field454.method1823(class374.field5072, (byte) -88), "", 5, (byte) 102, "", 0);
                                                    }
                                                    var23.method1239(88);
                                                }
                                            }
                                            if (class527.field7734 == 6 && class328.field4360 == 0) {
                                                if (class446.field6499 == null) {
                                                    class321.method1900(false, -20147);
                                                    return;
                                                }
                                                class378.field5471++;
                                                if (class378.field5471 > 50) {
                                                    class33.field336++;
                                                    class492.method2979(class406.field5840, 49);
                                                }
                                                try {
                                                    if (class446.field6499 != null && class106.field1443.field5729 > 0) {
                                                        class312.field4170 += class106.field1443.field5729;
                                                        class446.field6499.method2620(true, class106.field1443.field5761, 0, class106.field1443.field5729);
                                                        class106.field1443.field5729 = 0;
                                                        class378.field5471 = 0;
                                                        return;
                                                    }
                                                } catch (IOException var24) {
                                                    class321.method1900(false, -20147);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field3877;
                                        if (var21.field6703 < 0) {
                                            break;
                                        }
                                        var22 = class406.method2490((byte) -116, var21.field6550);
                                    } while (var22 == null || var22.field6643 == null || var22.field6643.length <= var21.field6703 || var22.field6643[var21.field6703] != var21);
                                    class432.method2657(var20);
                                }
                            }
                            var18 = var17.field3877;
                            if (var18.field6703 < 0) {
                                break;
                            }
                            var19 = class406.method2490((byte) -116, var18.field6550);
                        } while (var19 == null || var19.field6643 == null || var19.field6643.length <= var18.field6703 || var19.field6643[var18.field6703] != var18);
                        class432.method2657(var17);
                    }
                }
                var15 = var14.field3877;
                if (var15.field6703 < 0) {
                    break;
                }
                var16 = class406.method2490((byte) -116, var15.field6550);
            } while (var16 == null || var16.field6643 == null || var15.field6703 >= var16.field6643.length || var16.field6643[var15.field6703] != var15);
            class432.method2657(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 750)
    public final void init() {
        field2558++;
        if (!this.method1813(89)) {
            return;
        }
        class225.field3029 = new class266();
        class225.field3029.field3559 = Integer.parseInt(this.getParameter("worldid"));
        class211.field2823 = new class266();
        class211.field2823.field3559 = Integer.parseInt(this.getParameter("lobbyid"));
        class211.field2823.field3564 = this.getParameter("lobbyaddress");
        class422.field6149 = new class266();
        class422.field6149.field3559 = Integer.parseInt(this.getParameter("demoid"));
        class422.field6149.field3564 = this.getParameter("demoaddress");
        class401.field5807 = class94.method524(68, Integer.parseInt(this.getParameter("modewhere")));
        if (!class193.method1101(class401.field5807, true) && class401.field5807 != class287.field3779) {
            class401.field5807 = class287.field3779;
        }
        class512.field7464 = class175.method1025((byte) 46, Integer.parseInt(this.getParameter("modewhat")));
        if (class512.field7464 != class492.field7204 && class512.field7464 != class183.field2376 && class512.field7464 != class206.field2714) {
            class512.field7464 = class206.field2714;
        }
        try {
            class374.field5072 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class374.field5072 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class41.field446 = true;
        } else {
            class41.field446 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class14.field147 = true;
        } else {
            class14.field147 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class15.field157 = true;
        } else {
            class15.field157 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class381.field5520 = class111.field1480;
            } else if (var4.equals("1")) {
                class381.field5520 = class373.field5065;
            }
        }
        try {
            class385.field5601 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class385.field5601 = 0;
        }
        class373.field5060 = this.getParameter("quiturl");
        class339.field4485 = this.getParameter("settings");
        if (class339.field4485 == null) {
            class339.field4485 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class293.field3876 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class293.field3876 = 0;
            }
        }
        class419.field6083 = Integer.parseInt(this.getParameter("colourid"));
        if (class419.field6083 < 0 || class453.field6785.length <= class419.field6083) {
            class419.field6083 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class329.field4369 = true;
            class19.field166 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class310.field4151 = true;
        }
        if (class381.field5520 == class111.field1480) {
            class249.field3322 = 503;
            class393.field5678 = 765;
        } else if (class381.field5520 == class373.field5065) {
            class249.field3322 = 480;
            class393.field5678 = 640;
        }
        class216.field2949 = this;
        this.method1815(class512.field7464.method1888((byte) -17) + 32, 596, 0, class249.field3322, class393.field5678);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 867)
    private final void method1247(byte arg0) {
        field2572++;
        if (class527.field7734 == 13) {
            return;
        }
        class532.field7836++;
        if ((class532.field7836 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class60.field700 = var2.get(11) * 600 + (var2.get(12) * 10) + (var2.get(13) / 6);
            class241.field3194.setSeed((long) class60.field700);
        }
        if (class532.field7836 % 50 == 0) {
            class7.field98 = class312.field4170;
            class312.field4170 = 0;
            class375.field5086 = class228.field3072;
            class228.field3072 = 0;
        }
        this.method1245(13);
        if (class452.field6733 != null) {
            class452.field6733.method897(45);
        }
        class355.method2092((byte) 125);
        class413.field5893.method1479(-25961);
        class148.field1951.method356((byte) -81);
        if (class452.field6754 != null) {
            int var3 = class452.field6754.method608((byte) 111);
            class180.field2351 = var3;
        }
        if (class343.field4596 != null) {
            class343.field4596.method1143((int) class45.method252((byte) -8));
        }
        class202.method1299(2);
        int var4 = 14 % ((arg0 + 8) / 49);
        class329.field4364 = 0;
        for (class57 var5 = class413.field5893.method1473(350); var5 != null && class329.field4364 < 128; var5 = class413.field5893.method1473(350)) {
            if (var5.method341(false) != 1) {
                char var6 = var5.method342(true);
                if (!class334.method1948((byte) 86) || !(var6 == '`' || var6 == '§')) {
                    class152.field1991[class329.field4364] = var5;
                    class329.field4364++;
                } else if (class68.method397(109)) {
                    class309.method1848((byte) 107);
                } else {
                    class474.method2891(true);
                }
            }
        }
        for (class299 var7 = class148.field1951.method350(-26); var7 != null; var7 = class148.field1951.method350(100)) {
            int var8 = var7.method1758((byte) 77);
            if (var8 == -1) {
                class36.field359.method975(0, var7);
            } else if (class515.method3071(var8, (byte) 108)) {
                class333.field4405.method975(0, var7);
            }
            if (class333.field4405.method978(121) > 10) {
                class333.field4405.method977((byte) 66);
            }
        }
        if (class68.method397(109)) {
            class6.method32(19);
        }
        if (class527.field7734 == 0) {
            this.method1260(80);
            class167.method982(32);
        } else if (class527.field7734 == 1) {
            this.method1260(80);
            class167.method982(32);
        } else if (class80.method454(-8, class527.field7734)) {
            class162.method954(10);
        }
        if (class458.method2817(-18, class527.field7734) && !class80.method454(-8, class527.field7734)) {
            this.method1246((byte) -80);
            class199.method1275(115);
            class502.method3012(51);
        } else if (class270.method1644((byte) -118, class527.field7734) && !class80.method454(-8, class527.field7734)) {
            this.method1246((byte) -85);
            class502.method3012(-92);
        } else if (class527.field7734 == 11) {
            class502.method3012(-116);
        } else if (class102.method623(class527.field7734, 113) && !class80.method454(-8, class527.field7734)) {
            class386.method2344(31438);
        } else if (class527.field7734 == 12) {
            class502.method3012(81);
            if (class254.field3378 != -3 && class254.field3378 != 2 && class254.field3378 != 15) {
                class321.method1900(false, -20147);
            }
        }
        class124.method748(class343.field4596, (byte) 108);
        class333.field4405.method977((byte) 67);
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 1019)
    public static final void method1248(int arg0) {
        int var1 = class461.field6877;
        int[] var2 = class342.field4589;
        int var3 = class146.field1935 ? var1 : class401.field5813 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class96 var5;
            if (var4 < var1) {
                var5 = class29.field272[var2[var4]];
            } else {
                var5 = class339.field4484[class337.field4465[var4 - var1]];
            }
            if (var5.field3695 == arg0) {
                var5.field1188 = 0;
                if (var5.field1236 < 0) {
                    var5.field1235 = false;
                } else {
                    int var6 = var5.method546(24273);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field3704 & 0x7F) != 0 || (var5.field3694 & 0x7F) != 0) {
                            var5.field1235 = false;
                            continue;
                        }
                    } else if ((var5.field3704 & 0x7F) != 64 || (var5.field3694 & 0x7F) != 64) {
                        var5.field1235 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field3704 >> 7;
                        int var8 = var5.field3694 >> 7;
                        if (class74.field937[var7][var8] != var5.field1236) {
                            var5.field1235 = true;
                            continue;
                        }
                        if (class291.field3842[var7][var8] > 1) {
                            var10002 = class291.field3842[var7][var8]--;
                            var5.field1235 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field3704 - var9 >> 7;
                        int var11 = var5.field3694 - var9 >> 7;
                        int var12 = var5.field3704 + var9 >> 7;
                        int var13 = var5.field3694 + var9 >> 7;
                        if (!class533.method3164(var5.field1236, var13, (byte) 29, var10, var12, var11)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class74.field937[var14][var15] == var5.field1236) {
                                        var10002 = class291.field3842[var14][var15]--;
                                    }
                                }
                            }
                            var5.field1235 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class531 && var5.field1252 != null && class532.field7836 >= var5.field1252.field2822 && class532.field7836 < var5.field1252.field2817) {
                        ((class531) var5).field7827 = false;
                    }
                    var5.field1235 = false;
                    var5.field3700 = class470.method2868(114, var5.field3695, var5.field3704, var5.field3694);
                    class279.method1691(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 1142)
    public static final void main(String[] arg0) {
        field2564++;
        try {
            if (arg0.length != 6) {
                class233.method1474("Argument count", -113);
            }
            class225.field3029 = new class266();
            class225.field3029.field3559 = Integer.parseInt(arg0[0]);
            class211.field2823 = new class266();
            class211.field2823.field3559 = Integer.parseInt(arg0[1]);
            class422.field6149 = new class266();
            class422.field6149.field3559 = Integer.parseInt(arg0[2]);
            class401.field5807 = class264.field3547;
            if (arg0[3].equals("live")) {
                class512.field7464 = class206.field2714;
            } else if (arg0[3].equals("rc")) {
                class512.field7464 = class183.field2376;
            } else if (arg0[3].equals("wip")) {
                class512.field7464 = class492.field7204;
            } else {
                class233.method1474("modewhat", -101);
            }
            class374.field5072 = class237.method1490(arg0[4], 19822);
            if (class374.field5072 == -1) {
                if (arg0[4].equals("english")) {
                    class374.field5072 = 0;
                } else if (arg0[4].equals("german")) {
                    class374.field5072 = 1;
                } else {
                    class233.method1474("language", -101);
                }
            }
            class14.field147 = false;
            class41.field446 = false;
            if (arg0[5].equals("game0")) {
                class381.field5520 = class111.field1480;
            } else if (arg0[5].equals("game1")) {
                class381.field5520 = class373.field5065;
            } else {
                class233.method1474("game", -85);
            }
            class293.field3876 = 0;
            class385.field5601 = 0;
            class329.field4369 = true;
            class19.field166 = true;
            class310.field4151 = false;
            class419.field6083 = class381.field5520.field1407;
            class339.field4485 = "";
            client var1 = new client();
            class216.field2949 = var1;
            var1.method1814(1024, false, 768, 596, 5000, class512.field7464.method1888((byte) -122) + 32, 30, class381.field5520.field1399);
            class173.field2224.setLocation(40, 40);
        } catch (Exception var3) {
            method1256(var3, -2020, null);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljk;)Z", line = 1215)
    public static final boolean method1249(class450 arg0) {
        if (class94.field1134) {
            if (method1253(arg0).field2979 != 0) {
                return false;
            }
            if (arg0.field6686 == 0) {
                return false;
            }
        }
        return arg0.field6665;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 1228)
    public static final void method1250() {
        class230.field3096 = 0;
        for (int var0 = 0; var0 < class401.field5813; var0++) {
            class22 var1 = class339.field4484[class337.field4465[var0]];
            if (var1.field1235 && var1.method130(12150) != -1) {
                int var2 = (var1.method546(24273) - 1) * 64 + 60;
                int var3 = var1.field3704 - var2 >> 7;
                int var4 = var1.field3694 - var2 >> 7;
                class96 var5 = class43.method249(var1.field3695, var4, var3, 1);
                if (var5 != null) {
                    int var6 = var5.field1211;
                    if (var5 instanceof class22) {
                        var6 += 2048;
                    }
                    if (var5.field1188 == 0 && var5.method130(12150) != -1) {
                        class10.field118[class230.field3096] = var6;
                        class456.field6813[class230.field3096] = var6;
                        class230.field3096++;
                        var5.field1188++;
                    }
                    class10.field118[class230.field3096] = var6;
                    class456.field6813[class230.field3096] = var1.field1211 + 2048;
                    class230.field3096++;
                    var5.field1188++;
                }
            }
        }
        class264.method1622(0, class230.field3096 - 1, class10.field118, class456.field6813, (byte) 65);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 1279)
    public static final void method1251() {
        for (int var0 = 0; var0 < class308.field4128; var0++) {
            int[] var1 = class74.field937[var0];
            for (int var2 = 0; var2 < class426.field6200; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B[B)V", line = 1298)
    private final void method1252(byte arg0, byte[] arg1) {
        int var3 = 76 / ((arg0 + 30) / 44);
        field2561++;
        class396 var4 = new class396(arg1);
        while (true) {
            while (true) {
                int var5 = var4.method2388((byte) -118);
                if (var5 == 0) {
                    return;
                }
                if (var5 == 1) {
                    int[] var6 = class300.field3945 = new int[6];
                    var6[0] = var4.method2386(-23648);
                    var6[1] = var4.method2386(-23648);
                    var6[2] = var4.method2386(-23648);
                    var6[3] = var4.method2386(-23648);
                    var6[4] = var4.method2386(-23648);
                    var6[5] = var4.method2386(-23648);
                } else if (var5 == 4) {
                    int var9 = var4.method2388((byte) -122);
                    class215.field2942 = new int[var9];
                    for (int var10 = 0; var10 < var9; var10++) {
                        class215.field2942[var10] = var4.method2386(-23648);
                        if (class215.field2942[var10] == 65535) {
                            class215.field2942[var10] = -1;
                        }
                    }
                } else if (var5 == 5) {
                    int var7 = var4.method2388((byte) -111);
                    class299.field3927 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        class299.field3927[var8] = var4.method2386(-23648);
                        if (class299.field3927[var8] == 65535) {
                            class299.field3927[var8] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljk;)Ljo;", line = 1374)
    public static final class222 method1253(class450 arg0) {
        class222 var1 = (class222) class179.field2317.method295(((long) arg0.field6558 << 32) + (long) arg0.field6703, -127);
        return var1 == null ? arg0.field6694 : var1;
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 1379)
    public static final void method1254(int arg0) {
        int var1 = class461.field6877;
        int[] var2 = class342.field4589;
        for (int var3 = 0; var3 < class401.field5813 + var1; var3++) {
            class96 var4;
            if (var3 < var1) {
                var4 = class29.field272[var2[var3]];
            } else {
                var4 = class339.field4484[class337.field4465[var3 - var1]];
            }
            if (var4.field3695 == arg0 && var4.field1236 >= 0) {
                int var5 = var4.method546(24273);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field3704 & 0x7F) != 0 || (var4.field3694 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field3704 & 0x7F) != 64 || (var4.field3694 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field3704 >> 7;
                    int var7 = var4.field3694 >> 7;
                    if (var4.field1236 > class74.field937[var6][var7]) {
                        class74.field937[var6][var7] = var4.field1236;
                        class291.field3842[var6][var7] = 1;
                    } else if (class74.field937[var6][var7] == var4.field1236) {
                        var10002 = class291.field3842[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field3704 - var8 >> 7;
                    int var10 = var4.field3694 - var8 >> 7;
                    int var11 = var4.field3704 + var8 >> 7;
                    int var12 = var4.field3694 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field1236 > class74.field937[var13][var14]) {
                                class74.field937[var13][var14] = var4.field1236;
                                class291.field3842[var13][var14] = 1;
                            } else if (class74.field937[var13][var14] == var4.field1236) {
                                var10002 = class291.field3842[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 1478)
    public final void method1255(byte arg0) {
        if (class323.field4297) {
            class365.method2173(45);
        }
        field2559++;
        if (class343.field4596 != null) {
            class343.field4596.method1724(1);
        }
        if (class119.field1559 != null) {
            class116.method697((byte) 119, class119.field1559, class381.field5518);
            class119.field1559 = null;
        }
        if (class446.field6499 != null) {
            class446.field6499.method2625(true);
            class446.field6499 = null;
        }
        if (class452.field6754 != null) {
            class452.field6754.method604((byte) 77, class60.field701);
        }
        class452.field6754 = null;
        class119.method710((byte) 112);
        class162.field2108.method2763(-26346);
        class20.field178.method2084(5);
        if (class143.field1912 != null) {
            class143.field1912.method2348(23623);
            class143.field1912 = null;
        }
        int var2 = -107 / ((-arg0 - 4) / 47);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/lang/String;)V", line = 1521)
    public static final void method1256(Throwable arg0, int arg1, String arg2) {
        field2569++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class431.method2647(arg0, 0);
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class289.method1731(var3, 4);
            String var4 = class417.method2582("%3a", ":", var3, arg1 ^ 0x7E3);
            String var5 = class417.method2582("%40", "@", var4, -1);
            String var6 = class417.method2582("%26", "&", var5, -1);
            String var7 = class417.method2582("%23", "#", var6, -1);
            if (class437.field6377.field1828 == null) {
                return;
            }
            class236 var8 = class437.field6377.method832(-128, new URL(class437.field6377.field1828.getCodeBase(), "clienterror.ws?c=" + class255.field3397 + "&u=" + class484.field7129 + "&v1=" + class137.field1837 + "&v2=" + class137.field1836 + "&e=" + var7));
            while (var8.field3149 == 0) {
                class316.method1873(1L, false);
            }
            if (var8.field3149 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field3151;
                var9.read();
                var9.close();
            }
        } catch (Exception var10) {
        }
        if (arg1 != -2020) {
            method1253(null);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Ljk;IIIIIIIII)V", line = 1573)
    public static final void method1257(class450[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class450 var11 = arg0[var10];
            if (var11 != null && var11.field6550 == arg1) {
                int var12 = var11.field6601 + arg6;
                int var13 = var11.field6682 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field6686 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field6612 + var12;
                    int var19 = var11.field6573 + var13;
                    if (var11.field6686 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field6686 == 0 || var11.field6585 || method1253(var11).field2979 != 0 || class474.field7033 == var11 || class433.field6319 == var11.field6679) {
                    if (!method1249(var11)) {
                        if (class188.field2436 == var11) {
                            class95.field1137 = true;
                            class335.field4438 = var12;
                            class512.field7463 = var13;
                        }
                        if (var11.field6653 || var14 < var16 && var15 < var17) {
                            if (var11.field6545 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class293 var20 = (class293) class354.field4735.method970(12); var20 != null; var20 = (class293) class354.field4735.method976((byte) -127)) {
                                    if (var20.field3869) {
                                        var20.method2674(true);
                                        var20.field3877.field6673 = false;
                                    }
                                }
                                if (class297.field3917 == 0) {
                                    class188.field2436 = null;
                                    class474.field7033 = null;
                                }
                                class453.field6781 = 0;
                                class121.field1571 = false;
                                class430.field6255 = false;
                                if (!class483.field7125) {
                                    class464.method2843(-1);
                                }
                            }
                            boolean var21;
                            if (class148.field1951.method349((byte) 123) >= var14 && class148.field1951.method347(-117) >= var15 && class148.field1951.method349((byte) 126) < var16 && class148.field1951.method347(-107) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class323.field4302 && var21) {
                                if (var11.field6637 >= 0) {
                                    class256.field3403 = var11.field6637;
                                } else if (var11.field6545) {
                                    class256.field3403 = -1;
                                }
                            }
                            if (!class483.field7125 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class336.method1961(var11, (byte) 115, arg8 - var12, arg9 - var13);
                            }
                            boolean var22 = false;
                            if (class148.field1951.method352(true) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class299 var24 = (class299) class333.field4405.method970(12);
                            if (var24 != null && var24.method1758((byte) 109) == 0 && var24.method1760(1) >= var14 && var24.method1755(3) >= var15 && var24.method1760(1) < var16 && var24.method1755(3) < var17) {
                                var23 = true;
                            }
                            if (var11.field6581 != null) {
                                for (int var25 = 0; var25 < var11.field6581.length; var25++) {
                                    if (class413.field5893.method1472(28251, var11.field6581[var25])) {
                                        if (var11.field6697 == null || class532.field7836 >= var11.field6697[var25]) {
                                            byte var26 = var11.field6582[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class413.field5893.method1472(28251, 86) && !class413.field5893.method1472(28251, 82) && !class413.field5893.method1472(28251, 81)) && ((var26 & 0x2) == 0 || class413.field5893.method1472(28251, 86)) && ((var26 & 0x1) == 0 || class413.field5893.method1472(28251, 82)) && ((var26 & 0x4) == 0 || class413.field5893.method1472(28251, 81))) {
                                                if (var25 < 10) {
                                                    class531.method3147("", 27818, var25 + 1, var11.field6558, -1);
                                                } else if (var25 == 10) {
                                                    class227.method1451(4226);
                                                    class222 var27 = method1253(var11);
                                                    class226.method1448(var11, 77, var27.method1401(-124), var27.field2980);
                                                    class48.field531 = class360.method2125(var11, (byte) -7);
                                                    if (class48.field531 == null) {
                                                        class48.field531 = "Null";
                                                    }
                                                    class191.field2465 = var11.field6631 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field6596[var25];
                                                if (var11.field6697 == null) {
                                                    var11.field6697 = new int[var11.field6581.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field6697[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field6697[var25] = class532.field7836 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field6697 != null) {
                                        var11.field6697[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class307.method1833(-28373, var24.method1755(3) - var13, var11, var24.method1760(1) - var12);
                            }
                            if (class188.field2436 != null && class188.field2436 != var11 && var21 && method1253(var11).method1396(-1)) {
                                class304.field4048 = var11;
                            }
                            if (class474.field7033 == var11) {
                                class463.field6905 = true;
                                class13.field142 = var12;
                                class216.field2951 = var13;
                            }
                            if (var11.field6585 || var11.field6679 != 0) {
                                if (var21 && class180.field2351 != 0 && var11.field6648 != null) {
                                    class293 var29 = new class293();
                                    var29.field3869 = true;
                                    var29.field3877 = var11;
                                    var29.field3874 = class180.field2351;
                                    var29.field3866 = var11.field6648;
                                    class354.field4735.method975(0, var29);
                                }
                                if (class188.field2436 != null || class483.field7125 || class175.field2250 != var11.field6679 && class453.field6781 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field6679 != 0) {
                                    if (class294.field3897 == var11.field6679 || class32.field332 == var11.field6679) {
                                        class502.field7324 = var11;
                                        if (class155.field2027 != null) {
                                            class155.field2027.method1766(78, var11.field6573, class343.field4596);
                                        }
                                        if (class294.field3897 == var11.field6679) {
                                            if (!class483.field7125 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class376.method2223(-1, arg9, arg8, class343.field4596);
                                                for (class440 var30 = (class440) class317.field4240.method290(-1); var30 != null; var30 = (class440) class317.field4240.method284(10748)) {
                                                    if (arg8 >= var30.field6389 && arg8 < var30.field6383 && arg9 >= var30.field6381 && arg9 < var30.field6385) {
                                                        class464.method2843(-1);
                                                        class166.method969((byte) -120, var30.field6382);
                                                    }
                                                }
                                            }
                                            class225.method1446(var11, false, var13, var12);
                                            continue;
                                        }
                                    }
                                    if (class433.field6319 == var11.field6679) {
                                        if (var11.method2787(class343.field4596, (byte) 124) == null || class111.field1481 != 0 && class111.field1481 != 3 || class483.field7125 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field6583[var32];
                                        if (var31 < var33 || var31 > var11.field6704[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field6612 / 2;
                                        int var35 = var32 - var11.field6573 / 2;
                                        int var36;
                                        if (class47.field491 == 4) {
                                            var36 = (int) class143.field1907 & 0x3FFF;
                                        } else {
                                            var36 = (int) class143.field1907 + class299.field3928 & 0x3FFF;
                                        }
                                        int var37 = class456.field6812[var36];
                                        int var38 = class456.field6811[var36];
                                        if (class47.field491 != 4) {
                                            var37 = (class420.field6099 + 256) * var37 >> 8;
                                            var38 = (class420.field6099 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 15;
                                        int var40 = var35 * var38 - var34 * var37 >> 15;
                                        int var41;
                                        int var42;
                                        if (class47.field491 == 4) {
                                            var41 = (class200.field2665 >> 7) + (var39 >> 2);
                                            var42 = (class299.field3936 >> 7) - (var40 >> 2);
                                        } else {
                                            int var43 = (class96.field1170.method546(24273) - 1) * 64;
                                            var41 = (class96.field1170.field3704 - var43 >> 7) + (var39 >> 2);
                                            var42 = (class96.field1170.field3694 - var43 >> 7) - (var40 >> 2);
                                        }
                                        if (class323.field4302 && (class41.field448 & 0x40) != 0) {
                                            class450 var44 = class19.method108(true, class519.field7656, class235.field3143);
                                            if (var44 == null) {
                                                class227.method1451(4226);
                                            } else {
                                                class144.method878(var11.field6661, var41, 23, class48.field531, " ->", var42, class207.field2724, 1L, true, false, (byte) -62);
                                            }
                                            continue;
                                        }
                                        if (class381.field5520 == class373.field5065) {
                                            class144.method878(-1, var41, 15, class105.field1414.method1823(class374.field5072, (byte) -88), "", var42, -1, 1L, true, false, (byte) -61);
                                        }
                                        class144.method878(-1, var41, 5, class465.field6918, "", var42, class125.field1621, 1L, true, false, (byte) -61);
                                        continue;
                                    }
                                    if (class175.field2250 == var11.field6679) {
                                        class530.field7772 = var11;
                                        if (var21) {
                                            class121.field1571 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method1760(1) - var12 - var11.field6612 / 2) * 2.0D / (double) class416.field5998);
                                            int var46 = (int) (-((double) (var24.method1755(3) - var13 - var11.field6573 / 2) * 2.0D / (double) class416.field5998));
                                            int var47 = class49.field556 + var45 + class416.field6009;
                                            int var48 = class163.field2133 + var46 + class416.field6020;
                                            class395 var49 = class292.method1756((byte) -34);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method2378(var48, -30335, var50, var47);
                                            if (var50 != null) {
                                                if (class413.field5893.method1472(28251, 82) && class509.field7372 > 0) {
                                                    class21.method116(var50[1], var50[2], (byte) -16, var50[0]);
                                                    continue;
                                                }
                                                class430.field6255 = true;
                                                class520.field7663 = var50[0];
                                                class406.field5842 = var50[1];
                                                class333.field4410 = var50[2];
                                            }
                                            class453.field6781 = 1;
                                            class232.field3112 = false;
                                            class272.field3624 = class148.field1951.method349((byte) -12);
                                            class389.field5639 = class148.field1951.method347(-106);
                                            continue;
                                        }
                                        if (var22 && class453.field6781 > 0) {
                                            if (class453.field6781 == 1 && (class272.field3624 != class148.field1951.method349((byte) -5) || class389.field5639 != class148.field1951.method347(-123))) {
                                                class419.field6088 = class49.field556;
                                                class499.field7284 = class163.field2133;
                                                class453.field6781 = 2;
                                            }
                                            if (class453.field6781 == 2) {
                                                class232.field3112 = true;
                                                class161.method952(class419.field6088 + (int) ((double) (class272.field3624 - class148.field1951.method349((byte) -74)) * 2.0D / (double) class416.field5996), 27341);
                                                class19.method111(class499.field7284 - (int) ((double) (class389.field5639 - class148.field1951.method347(-127)) * 2.0D / (double) class416.field5996), (byte) -87);
                                            }
                                            continue;
                                        }
                                        if (class453.field6781 > 0 && !class232.field3112) {
                                            if ((class270.field3616 == 1 || class528.method3131((byte) 60)) && class391.field5656 > 2) {
                                                class144.method882((byte) -107, class272.field3624, class389.field5639);
                                            } else if (class259.method1594(1)) {
                                                class144.method882((byte) -91, class272.field3624, class389.field5639);
                                            }
                                        }
                                        class453.field6781 = 0;
                                        continue;
                                    }
                                    if (class163.field2129 == var11.field6679) {
                                        if (var22) {
                                            class376.method2224(class148.field1951.method349((byte) 109) - var12, var11.field6612, class148.field1951.method347(-109) - var13, 2, var11.field6573);
                                        }
                                        continue;
                                    }
                                    if (class76.field959 == var11.field6679) {
                                        class193.method1106(var11, var12, var13, (byte) -83);
                                        continue;
                                    }
                                }
                                if (!var11.field6610 && var23) {
                                    var11.field6610 = true;
                                    if (var11.field6706 != null) {
                                        class293 var51 = new class293();
                                        var51.field3869 = true;
                                        var51.field3877 = var11;
                                        var51.field3868 = var24.method1760(1) - var12;
                                        var51.field3874 = var24.method1755(3) - var13;
                                        var51.field3866 = var11.field6706;
                                        class354.field4735.method975(0, var51);
                                    }
                                }
                                if (var11.field6610 && var22 && var11.field6598 != null) {
                                    class293 var52 = new class293();
                                    var52.field3869 = true;
                                    var52.field3877 = var11;
                                    var52.field3868 = class148.field1951.method349((byte) -41) - var12;
                                    var52.field3874 = class148.field1951.method347(-115) - var13;
                                    var52.field3866 = var11.field6598;
                                    class354.field4735.method975(0, var52);
                                }
                                if (var11.field6610 && !var22) {
                                    var11.field6610 = false;
                                    if (var11.field6669 != null) {
                                        class293 var53 = new class293();
                                        var53.field3869 = true;
                                        var53.field3877 = var11;
                                        var53.field3868 = class148.field1951.method349((byte) 82) - var12;
                                        var53.field3874 = class148.field1951.method347(-105) - var13;
                                        var53.field3866 = var11.field6669;
                                        class533.field7849.method975(0, var53);
                                    }
                                }
                                if (var22 && var11.field6680 != null) {
                                    class293 var54 = new class293();
                                    var54.field3869 = true;
                                    var54.field3877 = var11;
                                    var54.field3868 = class148.field1951.method349((byte) -76) - var12;
                                    var54.field3874 = class148.field1951.method347(-124) - var13;
                                    var54.field3866 = var11.field6680;
                                    class354.field4735.method975(0, var54);
                                }
                                if (!var11.field6673 && var21) {
                                    var11.field6673 = true;
                                    if (var11.field6657 != null) {
                                        class293 var55 = new class293();
                                        var55.field3869 = true;
                                        var55.field3877 = var11;
                                        var55.field3868 = class148.field1951.method349((byte) 105) - var12;
                                        var55.field3874 = class148.field1951.method347(-112) - var13;
                                        var55.field3866 = var11.field6657;
                                        class354.field4735.method975(0, var55);
                                    }
                                }
                                if (var11.field6673 && var21 && var11.field6658 != null) {
                                    class293 var56 = new class293();
                                    var56.field3869 = true;
                                    var56.field3877 = var11;
                                    var56.field3868 = class148.field1951.method349((byte) -92) - var12;
                                    var56.field3874 = class148.field1951.method347(-127) - var13;
                                    var56.field3866 = var11.field6658;
                                    class354.field4735.method975(0, var56);
                                }
                                if (var11.field6673 && !var21) {
                                    var11.field6673 = false;
                                    if (var11.field6562 != null) {
                                        class293 var57 = new class293();
                                        var57.field3869 = true;
                                        var57.field3877 = var11;
                                        var57.field3868 = class148.field1951.method349((byte) 124) - var12;
                                        var57.field3874 = class148.field1951.method347(-113) - var13;
                                        var57.field3866 = var11.field6562;
                                        class533.field7849.method975(0, var57);
                                    }
                                }
                                if (var11.field6644 != null) {
                                    class293 var58 = new class293();
                                    var58.field3877 = var11;
                                    var58.field3866 = var11.field6644;
                                    class380.field5509.method975(0, var58);
                                }
                                if (var11.field6705 != null && class307.field4118 > var11.field6636) {
                                    if (var11.field6633 == null || class307.field4118 - var11.field6636 > 32) {
                                        class293 var63 = new class293();
                                        var63.field3877 = var11;
                                        var63.field3866 = var11.field6705;
                                        class354.field4735.method975(0, var63);
                                    } else {
                                        label691: for (int var59 = var11.field6636; var59 < class307.field4118; var59++) {
                                            int var60 = class319.field4252[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field6633.length; var61++) {
                                                if (var11.field6633[var61] == var60) {
                                                    class293 var62 = new class293();
                                                    var62.field3877 = var11;
                                                    var62.field3866 = var11.field6705;
                                                    class354.field4735.method975(0, var62);
                                                    break label691;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6636 = class307.field4118;
                                }
                                if (var11.field6638 != null && class267.field3576 > var11.field6641) {
                                    if (var11.field6565 == null || class267.field3576 - var11.field6641 > 32) {
                                        class293 var68 = new class293();
                                        var68.field3877 = var11;
                                        var68.field3866 = var11.field6638;
                                        class354.field4735.method975(0, var68);
                                    } else {
                                        label667: for (int var64 = var11.field6641; var64 < class267.field3576; var64++) {
                                            int var65 = class113.field1490[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field6565.length; var66++) {
                                                if (var11.field6565[var66] == var65) {
                                                    class293 var67 = new class293();
                                                    var67.field3877 = var11;
                                                    var67.field3866 = var11.field6638;
                                                    class354.field4735.method975(0, var67);
                                                    break label667;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6641 = class267.field3576;
                                }
                                if (var11.field6664 != null && class375.field5087 > var11.field6607) {
                                    if (var11.field6695 == null || class375.field5087 - var11.field6607 > 32) {
                                        class293 var73 = new class293();
                                        var73.field3877 = var11;
                                        var73.field3866 = var11.field6664;
                                        class354.field4735.method975(0, var73);
                                    } else {
                                        label643: for (int var69 = var11.field6607; var69 < class375.field5087; var69++) {
                                            int var70 = class483.field7126[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field6695.length; var71++) {
                                                if (var11.field6695[var71] == var70) {
                                                    class293 var72 = new class293();
                                                    var72.field3877 = var11;
                                                    var72.field3866 = var11.field6664;
                                                    class354.field4735.method975(0, var72);
                                                    break label643;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6607 = class375.field5087;
                                }
                                if (var11.field6542 != null && class139.field1853 > var11.field6559) {
                                    if (var11.field6620 == null || class139.field1853 - var11.field6559 > 32) {
                                        class293 var78 = new class293();
                                        var78.field3877 = var11;
                                        var78.field3866 = var11.field6542;
                                        class354.field4735.method975(0, var78);
                                    } else {
                                        label619: for (int var74 = var11.field6559; var74 < class139.field1853; var74++) {
                                            int var75 = class393.field5682[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field6620.length; var76++) {
                                                if (var11.field6620[var76] == var75) {
                                                    class293 var77 = new class293();
                                                    var77.field3877 = var11;
                                                    var77.field3866 = var11.field6542;
                                                    class354.field4735.method975(0, var77);
                                                    break label619;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6559 = class139.field1853;
                                }
                                if (var11.field6546 != null && class309.field4147 > var11.field6666) {
                                    if (var11.field6651 == null || class309.field4147 - var11.field6666 > 32) {
                                        class293 var83 = new class293();
                                        var83.field3877 = var11;
                                        var83.field3866 = var11.field6546;
                                        class354.field4735.method975(0, var83);
                                    } else {
                                        label595: for (int var79 = var11.field6666; var79 < class309.field4147; var79++) {
                                            int var80 = class293.field3884[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field6651.length; var81++) {
                                                if (var11.field6651[var81] == var80) {
                                                    class293 var82 = new class293();
                                                    var82.field3877 = var11;
                                                    var82.field3866 = var11.field6546;
                                                    class354.field4735.method975(0, var82);
                                                    break label595;
                                                }
                                            }
                                        }
                                    }
                                    var11.field6666 = class309.field4147;
                                }
                                if (class524.field7717 > var11.field6698 && var11.field6660 != null) {
                                    class293 var84 = new class293();
                                    var84.field3877 = var11;
                                    var84.field3866 = var11.field6660;
                                    class354.field4735.method975(0, var84);
                                }
                                if (class381.field5519 > var11.field6698 && var11.field6628 != null) {
                                    class293 var85 = new class293();
                                    var85.field3877 = var11;
                                    var85.field3866 = var11.field6628;
                                    class354.field4735.method975(0, var85);
                                }
                                if (class392.field5660 > var11.field6698 && var11.field6670 != null) {
                                    class293 var86 = new class293();
                                    var86.field3877 = var11;
                                    var86.field3866 = var11.field6670;
                                    class354.field4735.method975(0, var86);
                                }
                                if (class450.field6696 > var11.field6698 && var11.field6676 != null) {
                                    class293 var87 = new class293();
                                    var87.field3877 = var11;
                                    var87.field3866 = var11.field6676;
                                    class354.field4735.method975(0, var87);
                                }
                                if (class191.field2463 > var11.field6698 && var11.field6580 != null) {
                                    class293 var88 = new class293();
                                    var88.field3877 = var11;
                                    var88.field3866 = var11.field6580;
                                    class354.field4735.method975(0, var88);
                                }
                                var11.field6698 = class106.field1448;
                                if (var11.field6556 != null) {
                                    for (int var89 = 0; var89 < class329.field4364; var89++) {
                                        class293 var90 = new class293();
                                        var90.field3877 = var11;
                                        var90.field3871 = class152.field1991[var89].method340(90);
                                        var90.field3872 = class152.field1991[var89].method342(true);
                                        var90.field3866 = var11.field6556;
                                        class354.field4735.method975(0, var90);
                                    }
                                }
                                if (class260.field3492 && var11.field6608 != null) {
                                    class293 var91 = new class293();
                                    var91.field3877 = var11;
                                    var91.field3866 = var11.field6608;
                                    class354.field4735.method975(0, var91);
                                }
                            }
                            if (var11.field6686 == 5 && var11.field6584 != -1) {
                                var11.method2777(9, field2571, class333.field4407).method1766(89, var11.field6573, class343.field4596);
                            }
                            class521.method3106(var11, 107);
                            if (var11.field6686 == 0) {
                                method1257(arg0, var11.field6558, var14, var15, var16, var17, var12 - var11.field6634, var13 - var11.field6687, arg8, arg9);
                                if (var11.field6643 != null) {
                                    method1257(var11.field6643, var11.field6558, var14, var15, var16, var17, var12 - var11.field6634, var13 - var11.field6687, arg8, arg9);
                                }
                                class360 var92 = (class360) class152.field1989.method295((long) var11.field6558, -107);
                                if (var92 != null) {
                                    if (class381.field5520 == class111.field1480 && var92.field4888 == 0 && !class483.field7125 && var21 && !class94.field1134) {
                                        class464.method2843(-1);
                                    }
                                    class302.method1806(var16, var17, arg9, var14, var13, 20707, var12, var92.field4886, arg8, var15);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class521.method3106(var11, 107);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 2476)
    public static final void method1258() {
        int var0 = class461.field6877;
        int[] var1 = class342.field4589;
        boolean var2 = class319.field4256.field4666 == 1 && var0 > 200 || class319.field4256.field4666 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class531 var12 = class29.field272[var1[var3]];
            if (var12.method3153((byte) -65)) {
                var12.method537((byte) -70);
                if (var12.field3698 >= 0 && var12.field3688 >= 0 && var12.field3697 < class308.field4128 && var12.field3691 < class426.field6200) {
                    var12.field7827 = var12.field1176 ? var2 : false;
                    if (class96.field1170 == var12) {
                        var12.field1236 = Integer.MAX_VALUE;
                    } else {
                        int var13 = 0;
                        if (!var12.field1235) {
                            var13++;
                        }
                        if (var12.field1246 > class532.field7836) {
                            var13 += 2;
                        }
                        int var14 = var13 + (5 - var12.method546(24273) << 2);
                        if (var12.field7803) {
                            var14 += 512;
                        } else {
                            if (class98.field1303 == 0) {
                                var14 += 32;
                            } else {
                                var14 += 128;
                            }
                            var14 += 256;
                        }
                        var12.field1236 = var14 + 1;
                    }
                } else {
                    var12.field1236 = -1;
                }
            } else {
                var12.field1236 = -1;
            }
        }
        for (int var4 = 0; var4 < class401.field5813; var4++) {
            class22 var9 = class339.field4484[class337.field4465[var4]];
            if (var9.method128((byte) -65) && var9.field220.method1361(class52.field606, 162667843)) {
                var9.method537((byte) -91);
                if (var9.field3698 >= 0 && var9.field3688 >= 0 && var9.field3697 < class308.field4128 && var9.field3691 < class426.field6200) {
                    int var10 = 0;
                    if (!var9.field1235) {
                        var10++;
                    }
                    if (var9.field1246 > class532.field7836) {
                        var10 += 2;
                    }
                    int var11 = var10 + (5 - var9.method546(24273) << 2);
                    if (class98.field1303 == 0) {
                        if (var9.field220.field2846) {
                            var11 += 64;
                        } else {
                            var11 += 128;
                        }
                    } else if (class98.field1303 == 1) {
                        if (var9.field220.field2846) {
                            var11 += 32;
                        } else {
                            var11 += 64;
                        }
                    }
                    if (var9.field220.field2891) {
                        var11 += 1024;
                    } else if (!var9.field220.field2897) {
                        var11 += 256;
                    }
                    var9.field1236 = var11 + 1;
                } else {
                    var9.field1236 = -1;
                }
            } else {
                var9.field1236 = -1;
            }
        }
        for (int var5 = 0; var5 < class497.field7241.length; var5++) {
            class523 var6 = class497.field7241[var5];
            if (var6 != null) {
                if (var6.field7698 == 1) {
                    class22 var7 = class339.field4484[var6.field7691];
                    if (var7 != null && var7.field1236 >= 0) {
                        var7.field1236 += 2048;
                    }
                } else if (var6.field7698 == 10) {
                    class531 var8 = class29.field272[var6.field7691];
                    if (var8 != null && class96.field1170 != var8 && var8.field1236 >= 0) {
                        var8.field1236 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Object;Lfq;I)V", line = 2637)
    public static final void method1259(Object arg0, class137 arg1, int arg2) {
        field2574++;
        if (arg1.field1826 == null) {
            return;
        }
        int var3 = 0;
        if (arg2 != -25233) {
            method1259(null, null, -113);
        }
        while (var3 < 50 && arg1.field1826.peekEvent() != null) {
            class316.method1873(1L, false);
            var3++;
        }
        if (arg0 != null) {
            arg1.field1826.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V", line = 2662)
    private final void method1260(int arg0) {
        if (!class319.field4256.field4658) {
            for (int var2 = 0; var2 < class329.field4364; var2++) {
                if (class152.field1991[var2].method342(true) == 's' || class152.field1991[var2].method342(true) == 'S') {
                    class319.field4256.field4658 = true;
                    break;
                }
            }
        }
        field2563++;
        if (class283.field3744 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class45.method252((byte) -8);
            if (class144.field1921 == 0L) {
                class144.field1921 = var5;
            }
            if (var4 > 16384 && var5 - class144.field1921 < 5000L) {
                if (var5 - class297.field3915 > 1000L) {
                    System.gc();
                    class297.field3915 = var5;
                }
                class266.field3568 = class125.field1616.method1823(class374.field5072, (byte) -88);
                class397.field5788 = 5;
            } else {
                class266.field3568 = class109.field1461.method1823(class374.field5072, (byte) -88);
                class283.field3744 = 10;
                class397.field5788 = 5;
            }
        } else if (class283.field3744 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class96.field1223[var7] = class15.method88(class426.field6200, class308.field4128, class335.method1958(arg0, 81));
            }
            class266.field3568 = class214.field2929.method1823(class374.field5072, (byte) -88);
            class397.field5788 = 10;
            class283.field3744 = 20;
        } else if (class283.field3744 == 20) {
            if (class452.field6733 == null) {
                class452.field6733 = new class149(class162.field2108, class20.field178);
            }
            if (class452.field6733.method895(0)) {
                class461.field6872 = class42.method244(1, -81, 0, true, false);
                class434.field6336 = class42.method244(1, arg0 ^ 0xFFFFFFCE, 1, true, false);
                class517.field7627 = class42.method244(1, 79, 2, true, false);
                class258.field3450 = class42.method244(1, -57, 3, true, false);
                class273.field3641 = class42.method244(1, arg0 - 168, 4, true, false);
                class426.field6186 = class42.method244(1, 72, 5, true, true);
                class96.field1214 = class42.method244(1, 105, 6, false, true);
                class95.field1136 = class42.method244(1, 123, 7, true, false);
                class282.field3733 = class42.method244(1, arg0 ^ 0xFFFFFFC6, 8, true, false);
                class524.field7702 = class42.method244(1, 74, 9, true, false);
                class98.field1322 = class42.method244(1, 61, 10, true, false);
                class154.field2017 = class42.method244(1, arg0 + 4, 11, true, false);
                class230.field3101 = class42.method244(1, 61, 12, true, false);
                class98.field1309 = class42.method244(1, 96, 13, true, false);
                class75.field938 = class42.method244(1, arg0 ^ 0x36, 14, false, false);
                class287.field3782 = class42.method244(1, 67, 15, true, false);
                class316.field4207 = class42.method244(1, -64, 16, true, false);
                class306.field4088 = class42.method244(1, -76, 17, true, false);
                class232.field3114 = class42.method244(1, 115, 18, true, false);
                class533.field7851 = class42.method244(1, -89, 19, true, false);
                class117.field1533 = class42.method244(1, -112, 20, true, false);
                class49.field558 = class42.method244(1, 114, 21, true, false);
                class6.field76 = class42.method244(1, -95, 22, true, false);
                class413.field5904 = class42.method244(1, -119, 23, true, true);
                class479.field7093 = class42.method244(1, arg0 ^ 0x6C, 24, true, false);
                class374.field5075 = class42.method244(1, 109, 25, true, false);
                class346.field4613 = class42.method244(1, -61, 26, true, true);
                class48.field543 = class42.method244(1, -53, 27, true, false);
                class337.field4466 = class42.method244(1, -88, 28, true, true);
                class32.field333 = class42.method244(1, -69, 29, true, false);
                class266.field3568 = class388.field5631.method1823(class374.field5072, (byte) -88);
                class283.field3744 = 30;
                class397.field5788 = 15;
            } else {
                class266.field3568 = class13.field134.method1823(class374.field5072, (byte) -88);
                class397.field5788 = 12;
            }
        } else if (class283.field3744 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 30; var9++) {
                var8 += class291.field3850[var9].method15(0) * class306.field4073[var9] / 100;
            }
            if (var8 == 100) {
                class266.field3568 = class85.field1012.method1823(class374.field5072, (byte) -88);
                class397.field5788 = 20;
                class138.method857(class282.field3733, (byte) -106);
                class326.method1917(class282.field3733, (byte) 38);
                class283.field3744 = 40;
            } else {
                if (var8 != 0) {
                    class266.field3568 = class391.field5651.method1823(class374.field5072, (byte) -88) + var8 + "%";
                }
                class397.field5788 = 20;
            }
        } else if (class283.field3744 == 40) {
            if (class337.field4466.method2141(34)) {
                this.method1252((byte) 32, class337.field4466.method2128(-2, 1));
                class266.field3568 = class298.field3918.method1823(class374.field5072, (byte) -88);
                class397.field5788 = 25;
                class283.field3744 = 50;
            } else {
                class266.field3568 = class336.field4450.method1823(class374.field5072, (byte) -88) + class337.field4466.method2134(-9681) + "%";
                class397.field5788 = 25;
            }
        } else if (class283.field3744 == 50) {
            class442.method2715(32768);
            class266.field3568 = class32.field321.method1823(class374.field5072, (byte) -88);
            class283.field3744 = 60;
            class397.field5788 = 30;
        } else if (class283.field3744 == 60) {
            int var10 = class459.method2829(arg0 ^ 0xFFFFFFAE, class282.field3733, class98.field1309);
            int var11 = class209.method1328((byte) -82);
            if (var10 < var11) {
                class266.field3568 = class101.field1380.method1823(class374.field5072, (byte) -88) + var10 * 100 / var11 + "%";
                class397.field5788 = 35;
            } else {
                class266.field3568 = class293.field3870.method1823(class374.field5072, (byte) -88);
                class397.field5788 = 35;
                class283.field3744 = 70;
            }
        } else if (class283.field3744 == 70) {
            int var12 = class334.method1950((byte) 57, class282.field3733);
            int var13 = class52.method308((byte) -76);
            if (var13 > var12) {
                class266.field3568 = class259.field3459.method1823(class374.field5072, (byte) -88) + var12 * 100 / var13 + "%";
                class397.field5788 = 40;
            } else {
                class266.field3568 = class54.field625.method1823(class374.field5072, (byte) -88);
                class283.field3744 = 80;
                class397.field5788 = 40;
            }
        } else if (class283.field3744 == arg0) {
            if (class346.field4613.method2141(arg0 ^ 0x3D)) {
                class463.field6904 = new class461(class346.field4613, class524.field7702, class282.field3733);
                class266.field3568 = class306.field4106.method1823(class374.field5072, (byte) -88);
                class397.field5788 = 45;
                class283.field3744 = 90;
            } else {
                class266.field3568 = class289.field3806.method1823(class374.field5072, (byte) -88) + class346.field4613.method2134(-9681) + "%";
                class397.field5788 = 45;
            }
        } else if (class283.field3744 == 90) {
            class266.field3568 = class37.field378.method1823(class374.field5072, (byte) -88);
            class283.field3744 = 95;
            class397.field5788 = 50;
        } else if (class283.field3744 == 95) {
            if (class319.field4256.field4658) {
                class319.field4256.field4648 = 0;
                class319.field4256.field4674 = 0;
                class319.field4256.field4657 = 0;
                class319.field4256.field4675 = 1;
                class319.field4256.field4654 = 0;
            }
            class319.field4256.field4658 = true;
            class319.field4256.method1743(class381.field5518, (byte) 85);
            class141.method869(false, class319.field4256.field4648, 122);
            class266.field3568 = class484.field7130.method1823(class374.field5072, (byte) -88);
            class397.field5788 = 55;
            class283.field3744 = 100;
        } else if (class283.field3744 == 100) {
            class121.method727(class343.field4596, 0, class282.field3733, class98.field1309);
            class266.field3568 = class410.field5873.method1823(class374.field5072, (byte) -88);
            class397.field5788 = 60;
            class57.method345(arg0 ^ 0x51, 1);
            class283.field3744 = 110;
        } else if (class283.field3744 == 110) {
            class517.field7627.method2141(25);
            byte var14 = 0;
            int var15 = var14 + class517.field7627.method2134(-9681);
            class316.field4207.method2141(47);
            int var16 = var15 + class316.field4207.method2134(-9681);
            class306.field4088.method2141(104);
            int var17 = var16 + class306.field4088.method2134(arg0 ^ 0xFFFFDA7F);
            class232.field3114.method2141(16);
            int var18 = var17 + class232.field3114.method2134(arg0 ^ 0xFFFFDA7F);
            class533.field7851.method2141(71);
            int var19 = var18 + class533.field7851.method2134(-9681);
            class117.field1533.method2141(110);
            int var20 = var19 + class117.field1533.method2134(-9681);
            class49.field558.method2141(46);
            int var21 = var20 + class49.field558.method2134(-9681);
            class6.field76.method2141(68);
            int var22 = var21 + class6.field76.method2134(-9681);
            class479.field7093.method2141(arg0 - 44);
            int var23 = var22 + class479.field7093.method2134(arg0 ^ 0xFFFFDA7F);
            class374.field5075.method2141(17);
            int var24 = var23 + class374.field5075.method2134(-9681);
            class48.field543.method2141(112);
            int var25 = var24 + class48.field543.method2134(-9681);
            class32.field333.method2141(56);
            int var26 = var25 + class32.field333.method2134(-9681);
            if (var26 < 1200) {
                class266.field3568 = class113.field1489.method1823(class374.field5072, (byte) -88) + var26 / 12 + "%";
                class397.field5788 = 65;
            } else {
                class104.field1405 = new class79(class381.field5520, class374.field5072, class517.field7627);
                class254.field3381 = new class326(class381.field5520, class374.field5072, class517.field7627);
                class211.field2827 = new class210(class381.field5520, class374.field5072, class517.field7627, class282.field3733);
                class106.field1449 = new class514(class381.field5520, class374.field5072, class306.field4088);
                class279.field3702 = new class474(class381.field5520, class374.field5072, class517.field7627);
                class144.field1914 = new class366(class381.field5520, class374.field5072, class517.field7627);
                class453.field6782 = new class235(class381.field5520, class374.field5072, class517.field7627, class95.field1136);
                class263.field3536 = new class180(class381.field5520, class374.field5072, class517.field7627);
                class211.field2834 = new class264(class381.field5520, class374.field5072, class517.field7627);
                class123.field1593 = new class478(class381.field5520, class374.field5072, true, class316.field4207, class95.field1136);
                class60.field698 = new class169(class381.field5520, class374.field5072, class517.field7627, class282.field3733);
                class465.field6927 = new class90(class381.field5520, class374.field5072, class517.field7627, class282.field3733);
                class87.field1032 = new class275(class381.field5520, class374.field5072, true, class232.field3114, class95.field1136);
                class237.field3158 = new class40(class381.field5520, class374.field5072, true, class104.field1405, class533.field7851, class95.field1136);
                class468.field6947 = new class188(class381.field5520, class374.field5072, class517.field7627);
                class7.field97 = new class485(class381.field5520, class374.field5072, class117.field1533, class461.field6872, class434.field6336);
                field2571 = new class458(class381.field5520, class374.field5072, class517.field7627);
                class333.field4407 = new class409(class381.field5520, class374.field5072, class517.field7627);
                class71.field914 = new class261(class381.field5520, class374.field5072, class49.field558, class95.field1136);
                class505.field7341 = new class254(class381.field5520, class374.field5072, class517.field7627);
                class238.field3170 = new class186(class381.field5520, class374.field5072, class517.field7627);
                class323.field4296 = new class528(class381.field5520, class374.field5072, class517.field7627);
                class373.field5063 = new class110(class381.field5520, class374.field5072, class6.field76);
                class180.field2350 = new class132(class381.field5520, class374.field5072, class517.field7627);
                class256.method1581(arg0 ^ 0x5E, class258.field3450, class98.field1309, class95.field1136, class282.field3733);
                class511.method3052(-9952, class32.field333);
                class298.field3924 = new class277(class374.field5072, class479.field7093, class374.field5075);
                class253.field3371 = new class234(class374.field5072, class479.field7093, class374.field5075, new class525());
                class266.field3568 = class290.field3826.method1823(class374.field5072, (byte) -88);
                class397.field5788 = 65;
                class199.method1274(false);
                class123.field1593.method2916(arg0 ^ 0x50, !class319.field4256.method1738(0, class20.field183));
                class52.field606 = new class209();
                class245.method1521(arg0 - 64);
                class66.method390((byte) -45, class48.field543);
                class135.method811(class463.field6904, class95.field1136, true);
                class283.field3744 = 120;
            }
        } else if (class283.field3744 == 120) {
            int var27 = class115.method692(15938, class282.field3733);
            int var28 = class239.method1500((byte) -21);
            if (var28 > var27) {
                class266.field3568 = class243.field3218.method1823(class374.field5072, (byte) -88) + var27 * 100 / var28 + "%";
                class397.field5788 = 70;
            } else {
                class186.method1077((byte) 82, class343.field4596, class282.field3733);
                class250.method1548(-20170, class302.field3996);
                class266.field3568 = class15.field154.method1823(class374.field5072, (byte) -88);
                class283.field3744 = 130;
                class397.field5788 = 70;
            }
        } else if (class283.field3744 == 130) {
            if (class98.field1322.method2127("", arg0 + 17, "huffman")) {
                class375 var29 = new class375(class98.field1322.method2132("huffman", (byte) 77, ""));
                class475.method2902(-53, var29);
                class266.field3568 = class533.field7846.method1823(class374.field5072, (byte) -88);
                class283.field3744 = 140;
                class397.field5788 = 75;
            } else {
                class266.field3568 = class520.field7662.method1823(class374.field5072, (byte) -88) + "0%";
                class397.field5788 = 75;
            }
        } else if (class283.field3744 == 140) {
            if (class258.field3450.method2141(13)) {
                class266.field3568 = class33.field335.method1823(class374.field5072, (byte) -88);
                class397.field5788 = 80;
                class283.field3744 = 150;
            } else {
                class266.field3568 = class263.field3533.method1823(class374.field5072, (byte) -88) + class258.field3450.method2134(arg0 - 9761) + "%";
                class397.field5788 = 80;
            }
        } else if (class283.field3744 == 150) {
            if (class230.field3101.method2141(45)) {
                class266.field3568 = class424.field6168.method1823(class374.field5072, (byte) -88);
                class283.field3744 = 160;
                class397.field5788 = 82;
            } else {
                class266.field3568 = class207.field2734.method1823(class374.field5072, (byte) -88) + class230.field3101.method2134(arg0 - 9761) + "%";
                class397.field5788 = 82;
            }
        } else if (class283.field3744 == 160) {
            if (class98.field1309.method2141(arg0 ^ 0x2E)) {
                class266.field3568 = class510.field7399.method1823(class374.field5072, (byte) -88);
                class283.field3744 = 170;
                class397.field5788 = 85;
            } else {
                class266.field3568 = class510.field7399.method1823(class374.field5072, (byte) -88) + class98.field1309.method2134(-9681) + "%";
                class397.field5788 = 85;
            }
        } else if (class283.field3744 == 170) {
            if (class413.field5904.method2157("details", 0)) {
                class416.method2560(class413.field5904, class279.field3702, class144.field1914, class123.field1593, class60.field698, class465.field6927, class52.field606);
                class266.field3568 = class74.field933.method1823(class374.field5072, (byte) -88);
                class397.field5788 = 89;
                class283.field3744 = 190;
            } else {
                class266.field3568 = class110.field1473.method1823(class374.field5072, (byte) -88) + class413.field5904.method2154(0, "details") + "%";
                class397.field5788 = 87;
            }
        } else if (class283.field3744 == 190) {
            class302.field3999 = new int[class323.field4296.field7746];
            class272.field3636 = new boolean[class323.field4296.field7746];
            class234.field3131 = new String[class238.field3170.field2422];
            for (int var30 = 0; var30 < class323.field4296.field7746; var30++) {
                if (class323.field4296.method3133((byte) 68, var30).field6152 == 0) {
                    class272.field3636[var30] = true;
                    class267.field3573++;
                }
                class302.field3999[var30] = -1;
            }
            class23.method138(6965);
            class286.field3761 = class258.field3450.method2148("loginscreen", arg0 - 80);
            class281.field3723 = class258.field3450.method2148("lobbyscreen", 0);
            class426.field6186.method2144(false, 0, true);
            class96.field1214.method2144(true, 0, true);
            class282.field3733.method2144(true, 0, true);
            class98.field1309.method2144(true, 0, true);
            class98.field1322.method2144(true, 0, true);
            class258.field3450.method2144(true, 0, true);
            class517.field7627.field4921 = 2;
            class127.field1649 = true;
            class306.field4088.field4921 = 2;
            class316.field4207.field4921 = 2;
            class232.field3114.field4921 = 2;
            class533.field7851.field4921 = 2;
            class117.field1533.field4921 = 2;
            class49.field558.field4921 = 2;
            class163.method957(-1, class319.field4256.field4675, false, -1, false);
            class266.field3568 = class325.field4332.method1823(class374.field5072, (byte) -88);
            class397.field5788 = 95;
            class283.field3744 = 200;
        } else if (class283.field3744 == 200) {
            class57.method345(1, 2);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Ljk;)Ljk;", line = 3184)
    public static final class450 method1261(class450 arg0) {
        int var1 = method1253(arg0).method1397(-715238382);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class406.method2490((byte) -116, arg0.field6550);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)Ljava/lang/String;", line = 3209)
    public final String method1262(int arg0) {
        field2576++;
        String var2 = null;
        try {
            var2 = "[1)" + class357.field4867 + "," + class418.field6074 + "," + class308.field4128 + "," + class426.field6200 + "|";
            if (class96.field1170 != null) {
                var2 = var2 + "2)" + class210.field2808 + "," + (class96.field1170.field1249[0] + class357.field4867) + "," + (class96.field1170.field1251[0] + class418.field6074) + "|";
            }
            var2 = var2 + "3)" + class20.field183 + "|4)" + class319.field4256.field4654 + "|5)" + class423.method2612(2) + "|6)" + class372.field5051 + "," + class430.field6244 + "|";
            var2 = var2 + "7)" + class319.field4256.method2061((byte) 104, class20.field183) + "|";
            var2 = var2 + "8)" + class319.field4256.method2058(class20.field183, 1) + "|";
            var2 = var2 + "9)" + class319.field4256.field4665 + "|";
            var2 = var2 + "10)" + class319.field4256.field4671 + "|";
            var2 = var2 + "11)" + class319.field4256.field4685 + "|";
            var2 = var2 + "12)" + class319.field4256.method1738(0, class20.field183) + "|";
            var2 = var2 + "13)" + class164.field2144 + "|";
            var2 = var2 + "14)" + class527.field7734;
            try {
                if (arg0 >= -10) {
                    this.method1245(3);
                }
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var3) {
            }
            var2 = var2 + "]";
        } catch (Throwable var4) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V", line = 3244)
    public static void method1263(int arg0) {
        if (arg0 == 1) {
            field2571 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 3255)
    public final void method1264(int arg0) {
        field2560++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class66.method389(arg0 - 1025);
        class20.field178 = new class355(class381.field5518);
        class162.field2108 = new class447();
        if (class401.field5807 != class287.field3779) {
            class470.field6975 = new byte[50][];
        }
        class319.field4256 = new class290(class381.field5518);
        if (class401.field5807 == class287.field3779) {
            class225.field3029.field3564 = this.getCodeBase().getHost();
        } else if (class193.method1101(class401.field5807, true)) {
            class225.field3029.field3564 = this.getCodeBase().getHost();
            class225.field3029.field3570 = class225.field3029.field3559 + 40000;
            class211.field2823.field3570 = class211.field2823.field3559 + 40000;
            class225.field3029.field3566 = class225.field3029.field3559 + 50000;
            class422.field6149.field3570 = class422.field6149.field3559 + 40000;
            class211.field2823.field3566 = class211.field2823.field3559 + 50000;
            class422.field6149.field3566 = class422.field6149.field3559 + 50000;
        } else if (class401.field5807 == class264.field3547) {
            class225.field3029.field3564 = "127.0.0.1";
            class211.field2823.field3564 = "127.0.0.1";
            class225.field3029.field3570 = class225.field3029.field3559 + 40000;
            class422.field6149.field3564 = "127.0.0.1";
            class211.field2823.field3570 = class211.field2823.field3559 + 40000;
            class422.field6149.field3570 = class422.field6149.field3559 + 40000;
            class225.field3029.field3566 = class225.field3029.field3559 + 50000;
            class211.field2823.field3566 = class211.field2823.field3559 + 50000;
            class422.field6149.field3566 = class422.field6149.field3559 + 50000;
        }
        if (class381.field5520 == class373.field5065) {
            class485.field7142 = 0;
            class29.field280 = class334.field4430;
            class59.field690 = true;
            class115.field1509 = class153.field1997;
            class378.field5477 = 16777215;
            class109.field1463 = class372.field5046;
            class495.field7232 = class245.field3232;
        } else {
            class29.field280 = class339.field4490;
            class495.field7232 = class522.field7677;
            class115.field1509 = class511.field7435;
            class109.field1463 = class397.field5789;
        }
        if (class381.field5520 == class111.field1480) {
            class281.field3720 = false;
        }
        class255.field3395 = class225.field3029;
        class462.field6891 = class196.field2525 = class392.field5672 = class401.field5815 = new short[256];
        class413.field5893 = class47.method269(false, class60.field701);
        class148.field1951 = class354.method2074(class60.field701, (byte) 115, true);
        class452.field6754 = class142.method872((byte) 26);
        if (class452.field6754 != null) {
            class452.field6754.method610(256, class60.field701);
        }
        if (arg0 != 0) {
            this.method1244(-107);
        }
        class462.field6892 = class137.field1839;
        try {
            if (class381.field5518.field1825 != null) {
                class196.field2528 = new class193(class381.field5518.field1825, 5200, 0);
                for (int var3 = 0; var3 < 30; var3++) {
                    class493.field7217[var3] = new class193(class381.field5518.field1823[var3], 6000, 0);
                }
                class497.field7242 = new class193(class381.field5518.field1824, 6000, 0);
                class394.field5690 = new class420(255, class196.field2528, class497.field7242, 500000);
                class63.field735 = new class193(class381.field5518.field1821, 24, 0);
                class381.field5518.field1825 = null;
                class381.field5518.field1821 = null;
                class381.field5518.field1824 = null;
                class381.field5518.field1823 = null;
            }
        } catch (IOException var4) {
            class196.field2528 = null;
            class394.field5690 = null;
            class63.field735 = null;
            class497.field7242 = null;
        }
        if (class401.field5807 != class287.field3779) {
            class435.field6354 = true;
        }
        if (class381.field5520 == class111.field1480) {
            class95.field1147 = class7.field94.method1823(class374.field5072, (byte) -88);
        } else if (class381.field5520 == class373.field5065) {
            class95.field1147 = class302.field3997.method1823(class374.field5072, (byte) -88);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 3379)
    public static final void method1265() {
        int var0 = class461.field6877;
        int[] var1 = class342.field4589;
        int var2 = class146.field1935 ? var0 : class401.field5813 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class96 var4;
            if (var3 < var0) {
                var4 = class29.field272[var1[var3]];
            } else {
                var4 = class339.field4484[class337.field4465[var3 - var0]];
            }
            if (var4.field1236 >= 0) {
                int var5 = var4.method546(24273);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field3704 & 0x7F) == 0 && (var4.field3694 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field3704 & 0x7F) == 64 && (var4.field3694 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class531 && var4.field1252 != null && class532.field7836 >= var4.field1252.field2822 && class532.field7836 < var4.field1252.field2817) {
                    ((class531) var4).field7827 = false;
                }
                var4.field3700 = class470.method2868(-47, var4.field3695, var4.field3704, var4.field3694);
                class279.method1691(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 3423)
    public final void method1266(int arg0) {
        method1263(1);
        field2566++;
        class116.method700(-1911903764);
        class532.method3161(arg0 ^ 0xFFFFE841);
        class184.method1070((byte) 38);
        class65.method384((byte) 126);
        class58.method357(arg0 ^ 0x7C96);
        class52.method315(-1512707417);
        class507.method3023(18995);
        class435.method2675(16777215);
        class330.method1935(0);
        class50.method292(-31680);
        class303.method1808((byte) 91);
        class168.method989((byte) 34);
        class317.method1892(arg0 ^ 0x646D);
        class17.method95(arg0 ^ 0xFFFF9B81);
        class104.method634((byte) -13);
        class124.method740(0);
        class287.method1725((byte) 4);
        class290.method1737(-2);
        class523.method3113(false);
        class167.method973(2);
        class426.method2619(120);
        class447.method2771(-48);
        class355.method2088(-3);
        class149.method899(1);
        class4.method21((byte) 126);
        class193.method1097(arg0 ^ 0xFFFFAD13);
        class420.method2597(-87);
        class326.method1923(3);
        class514.method3069(arg0 ^ 0x64B2);
        class474.method2894(0);
        class366.method2177((byte) 102);
        class235.method1487((byte) 6);
        class180.method1050(5);
        class264.method1624(-1);
        class478.method2913(-2);
        class169.method996(-3);
        class90.method500(arg0 ^ 0x6410);
        class275.method1673(arg0 ^ 0x6472);
        class40.method233(-23086);
        class79.method450(arg0 - 25639);
        class188.method1082(arg0 - 52635);
        class458.method2821((byte) -31);
        class409.method2502(arg0 ^ 0x642C);
        class254.method1575(99);
        class186.method1078(arg0 - 25702);
        class528.method3135((byte) 98);
        class110.method679(true);
        class132.method803(16);
        class277.method1683(true);
        class234.method1480((byte) -88);
        class22.method126(0);
        class13.method77(-121);
        class191.method1089(arg0 ^ 0x6430);
        class386.method2347((byte) -120);
        class206.method1306((byte) 69);
        class106.method653(-13828);
        class472.method2883((byte) -59);
        class395.method2379(76);
        class49.method287(false);
        class450.method2786(0);
        class459.method2828(54);
        class531.method3160(2582);
        class331.method1940(255);
        class454.method2809(-91);
        class189.method1085(107);
        class396.method2448(false);
        class96.method545((byte) -119);
        class316.method1870(-98);
        class498.method2997(false);
        class115.method694(0);
        class263.method1617((byte) 113);
        class364.method2168((byte) 0);
        class360.method2126(arg0 ^ 0x6AF9);
        class222.method1402(arg0 ^ 0xFFFF9BCD);
        class371.method2197((byte) -20);
        class276.method1679(-105);
        class12.method71((byte) -105);
        class302.method1800((byte) -26);
        class64.method381((byte) 95);
        class198.method1238(2);
        class164.method962(28982);
        class380.method2324(78);
        class41.method240(-75);
        class239.method1501((byte) 125);
        class54.method320((byte) -75);
        class463.method2839(true);
        class266.method1631((byte) 67);
        class437.method2683(-10506);
        class237.method1493(0);
        class421.method2600((byte) -69);
        class406.method2488(101);
        class351.method2057(127);
        class136.method822(arg0 ^ 0x6BA2);
        class516.method3076(0);
        class260.method1600((byte) -22);
        class533.method3165(-7406);
        class373.method2210((byte) -37);
        class273.method1660(-1);
        class6.method35(-22876);
        class521.method3107((byte) 100);
        class102.method624((byte) -1);
        class70.method406(arg0 - 35224);
        class131.method796(102);
        class190.method1088(arg0 - 33544);
        class38.method213(6806);
        class212.method1353(false);
        class144.method881(-97);
        class15.method89(true);
        class183.method1060((byte) 68);
        class336.method1960(false);
        class309.method1843((byte) -105);
        class61.method368(95);
        class98.method571(arg0 ^ 0xFFFF9BFD);
        class179.method1042(-108);
        class126.method765(true);
        class282.method1704(arg0 - 35643);
        class245.method1523((byte) 35);
        class244.method1518(0);
        class288.method1726(0);
        class14.method84(arg0 ^ 0x5F00);
        class398.method2455(64);
        class92.method508((byte) 1);
        class343.method1997(-29);
        class418.method2585(false);
        class484.method2946(-123);
        class387.method2349(true);
        class279.method1690(arg0 ^ 0xFFFF9BA9);
        class419.method2591(arg0 ^ 0x6436);
        class101.method618((byte) -67);
        class46.method254();
        class211.method1347(-128);
        class306.method1827(30888);
        class391.method2364((byte) 57);
        class26.method160(16);
        class42.method243(255);
        class466.method2849((byte) -112);
        class432.method2656();
        class416.method2564();
        class253.method1566(-128);
        class519.method3103((byte) -126);
        class145.method888();
        class10.method63((byte) -23);
        class48.method273(arg0 ^ 0x3D4A);
        class68.method396((byte) 115);
        class140.method867(48000);
        class461.method2833(1);
        class55.method325(-128);
        class433.method2664(48);
        class467.method2850((byte) 86);
        class87.method475((byte) -6);
        class93.method518(arg0 ^ 0xFFFF9BCD);
        class200.method1288((byte) 93);
        class451.method2801((byte) 54);
        class502.method3011((byte) -121);
        class85.method468(arg0 - 25680);
        class280.method1695((byte) -116);
        class470.method2870((byte) 47);
        class155.method923(-3652);
        class29.method168(3);
        class512.method3060(-1);
        class518.method3098(arg0 ^ 0x6463);
        class88.method486((byte) 0);
        class300.method1790(16);
        class148.method893((byte) 84);
        class19.method106((byte) 112);
        class291.method1748(17104);
        class525.method3126(arg0 - 25649);
        class63.method376(60);
        class442.method2722(32679);
        class216.method1377(11);
        class33.method186(0);
        class363.method2164(true);
        class248.method1533();
        class47.method266((byte) -69);
        class375.method2217(-105);
        class35.method191(true);
        class283.method1710(arg0 ^ 0x6436);
        class495.method2984(arg0 - 25525);
        class293.method1761((byte) 125);
        class242.method1514(arg0 - 25681);
        class21.method118(false);
        class250.method1552(109);
        class215.method1372((byte) 69);
        class73.method427(127);
        class262.method1615(-546);
        class100.method611(-16777216);
        class192.method1093(arg0 - 25551);
        class390.method2362(-1);
        class31.method177(arg0 - 25650);
        class51.method302(arg0 ^ 0x6423);
        class89.method492((byte) 119);
        class325.method1916(false);
        class81.method455(28491);
        class333.method1944((byte) 5);
        class228.method1463(53);
        class342.method1993(false);
        class178.method1035(true);
        class111.method683(false);
        class483.method2945(-128);
        class256.method1580(true);
        class285.method1712((byte) -126);
        class449.method2775(-1);
        class381.method2328(true);
        class440.method2695((byte) 121);
        class417.method2577(157275976);
        class530.method3139(arg0 - 2070);
        class75.method439(arg0 ^ 0x6339);
        class475.method2900((byte) 32);
        class166.method968(true);
        class487.method2956(-1440);
        class471.method2872(123);
        class7.method43(arg0 - 612446443);
        class415.method2546(false);
        class226.method1449(false);
        class185.method1076(true);
        class515.method3070(1);
        class464.method2842(255);
        class337.method1966(-117);
        class123.method734((byte) 69);
        class39.method223();
        class142.method870(1);
        class127.method770((byte) 101);
        class74.method435(0);
        class436.method2676(126);
        class289.method1733((byte) 56);
        class91.method506((byte) -91);
        class407.method2495(27810);
        class121.method725(35);
        class496.method2987((byte) 127);
        class534.method3166((byte) -59);
        class388.method2354(100);
        class349.method2054((byte) -127);
        class520.method3104(-26274);
        class18.method97();
        class510.method3050(-22653);
        class34.method189(true);
        class232.method1470(true);
        class527.method3130(arg0 - 18937);
        class95.method535((byte) 0);
        class427.method2631((byte) 126);
        class362.method2162(arg0 ^ 0x9BCD);
        class422.method2608(0);
        class314.method1864(arg0 ^ 0x645E);
        class249.method1547(arg0 ^ 0xFFFF9B90);
        class378.method2310((byte) -48);
        class135.method814(-1);
        class462.method2836((byte) 51);
        class241.method1504((byte) -65);
        class488.method2958(104);
        class53.method318((byte) -123);
        class323.method1910(10656);
        class479.method2925(126);
        class151.method903(121);
        class412.method2519((byte) 76);
        class163.method959(arg0 ^ arg0);
        class171.method1009();
        class376.method2225(127);
        class379.method2315(-2);
        class56.method333();
        class30.method173();
        class157.method941();
        class324.method1912(arg0 ^ 0x6433);
        class8.method51();
        class255.method1578(false);
        class453.method2808((byte) -49);
        class120.method721();
        class297.method1778(true);
        class227.method1455(63);
        class59.method358(arg0 ^ 0xFFFF9BF1);
        class394.method2373((byte) -115);
        class5.method29(-117);
        class338.method1967((byte) 116);
        class443.method2741(14);
        class522.method3110((byte) 68);
        class213.method1364(4);
        class372.method2200(-21568);
        class196.method1121(arg0 ^ 0x47DE);
        class37.method198(true);
        class174.method1020(arg0 ^ 0x644C);
        class508.method3029(arg0 ^ 0x64CD);
        class117.method704(-11907);
        class281.method1702(arg0 ^ 0x4D84);
        class382.method2333(10000);
        class377.method2261(arg0 - 25524);
        class298.method1784(false);
        class62.method374(true);
        class414.method2527((byte) -13);
        class490.method2959(66);
        class524.method3117(-116);
        class257.method1587(16383);
        class321.method1901(true);
        class69.method398(arg0 - 25651);
        class354.method2070((byte) 123);
        class252.method1556(2);
        class238.method1494(32993);
        class43.method248((byte) 2);
        class67.method393(false);
        class517.method3082((byte) -128);
        class374.method2212(124);
        class408.method2500(118);
        class156.method933();
        class243.method1515(arg0 ^ 0x76D1);
        class444.method2746(true);
        class146.method890(0);
        class223.method1404(0);
        class134.method810(-4097);
        class385.method2340(arg0 - 27061);
        class259.method1595(0);
        class80.method453((byte) 89);
        class258.method1592(23792);
        class401.method2479(-12298);
        class9.method58(-7481);
        class434.method2672(72);
        class413.method2523(false);
        class153.method910(true);
        class456.method2812((byte) -113);
        class161.method950(597899500);
        class128.method774(false);
        class109.method673((byte) 113);
        class32.method181(-124);
        class20.method115(-7514);
        class76.method443(118);
        class384.method2338((byte) 5);
        class307.method1832((byte) -55);
        class424.method2614((byte) -55);
        class143.method876(-16318);
        class308.method1839((byte) 37);
        class431.method2646((byte) -87);
        class152.method908(true);
        class162.method953(-55);
        class410.method2507(-76);
        class173.method1014(arg0 - 25650);
        class353.method2065();
        class356.method2096();
        class207.method1308(arg0 ^ 0xFFFFC6DC);
        class122.method729((byte) 89);
        class347.method2005((byte) -123);
        class225.method1447((byte) 66);
        class500.method3001(-10430);
        class130.method782(30);
        class230.method1464(true);
        class452.method2804(100);
        class113.method685((byte) 124);
        class205.method1303(32879);
        class446.method2755((byte) 3);
        class272.method1650(-126);
        class125.method759(arg0 ^ 0xFFFF9B88);
        class482.method2943(arg0 ^ 0x7D38);
        class195.method1120(-13825);
        class204.method1302(-22255);
        class497.method2992(-2976);
        class429.method2635((byte) 119);
        class402.method2484(9771);
        class357.method2118(-86);
        class468.method2853((byte) 95);
        class511.method3059((byte) 68);
        class513.method3063(true);
        class476.method2905(arg0 ^ 0x6430);
        class481.method2941(65534);
        class392.method2369(false);
        class499.method2998((byte) 38);
        class118.method706((byte) -51);
        class492.method2978(86);
        class318.method1893(22911);
        class457.method2815(false);
        class445.method2751(arg0 - 25650);
        class430.method2644((byte) 91);
        class346.method2003(arg0 ^ 0x4AC8);
        class246.method1525((byte) 80);
        class119.method712(0);
        class60.method359((byte) 48);
        class286.method1715((byte) -43);
        class339.method1976(4190);
        class312.method1858(-6174);
        class114.method689((byte) 70);
        class358.method2124(-19427);
        class267.method1633((byte) -109);
        class270.method1641(false);
        class97.method558(-1);
        class493.method2983(false);
        class1.method3(255);
        class505.method3021(18321);
        class304.method1818(1000);
        class397.method2450(100);
        class428.method2632((byte) -105);
        class57.method339((byte) -97);
        class299.method1786(23757);
        class220.method1387(arg0 - 28622);
        class176.method1028(true);
        class393.method2371(arg0 - 13890);
        class320.method1897(Integer.MAX_VALUE);
        class36.method195(0);
        class465.method2846(98);
        class292.method1759(-126);
        class202.method1297(true);
        class214.method1367((byte) 79);
        class154.method915(arg0 ^ 0x6432);
        class71.method420((byte) -27);
        class138.method858((byte) -107);
        class319.method1895(arg0 - 25650);
        class105.method635((byte) 125);
        class334.method1946(false);
        class469.method2864(13470);
        class328.method1927((byte) -29);
        class219.method1382(-4571);
    }
}
