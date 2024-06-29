import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class80 {

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "Lud;")
    public static class279 field4474 = class130.method1024("Shift)2click ENABLED(Q", 255);

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "Lud;")
    public static class279 field4476 = class130.method1024("lila:", 255);

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field4470 = 0;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "Lud;")
    public static class279 field4466 = class130.method1024("0", 255);

    @OriginalMember(owner = "client!client", name = "T", descriptor = "Lud;")
    public static class279 field4467 = class130.method1024("<col=ffffff>", 255);

    @OriginalMember(owner = "client!client", name = "B", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!client", name = "I", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Z")
    public static boolean field4479;

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V", line = 12)
    public static void method1791(boolean arg0) {
        if (!arg0) {
            field4467 = null;
            field4474 = null;
            field4466 = null;
            field4476 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 30)
    private final void method1792(int arg0) {
        if (!class39.field853) {
            label238: while (true) {
                do {
                    if (!class13.method90(33)) {
                        break label238;
                    }
                } while (class50.field1025 != 115 && class50.field1025 != 83);
                class39.field853 = true;
            }
        }
        field4463++;
        if (class287.field5131 == 0) {
            Runtime var26 = Runtime.getRuntime();
            int var27 = (int) ((var26.totalMemory() - var26.freeMemory()) / 1024L);
            long var28 = class127.method1015(21504);
            if (class244.field4341 == 0L) {
                class244.field4341 = var28;
            }
            if (var27 > 16384 && var28 - class244.field4341 < 5000L) {
                if ((var28 - class261.field4656) > 1000L) {
                    System.gc();
                    class261.field4656 = var28;
                }
                class119.field2147 = 5;
                class243.field4309 = class265.field4782;
            } else {
                class287.field5131 = 10;
                class243.field4309 = class140.field2551;
                class119.field2147 = 5;
            }
        } else if (class287.field5131 == 10) {
            class30.method270(4, 104, 104);
            for (int var2 = 0; var2 < 4; var2++) {
                class90.field1702[var2] = new class123(104, 104);
            }
            class243.field4309 = class323.field5637;
            class119.field2147 = 10;
            class287.field5131 = 30;
        } else if (class287.field5131 == 30) {
            if (class314.field5537 == null) {
                class314.field5537 = new class170(class255.field4552, class91.field1716);
            }
            if (class314.field5537.method1327(6446)) {
                class182.field3343 = class117.method938(true, false, Integer.MAX_VALUE, 0, true);
                class169.field3060 = class117.method938(true, false, Integer.MAX_VALUE, 1, true);
                class121.field2186 = class117.method938(false, true, Integer.MAX_VALUE, 2, true);
                class261.field4653 = class117.method938(true, false, Integer.MAX_VALUE, 3, true);
                class317.field5574 = class117.method938(true, false, Integer.MAX_VALUE, 4, true);
                class295.field5259 = class117.method938(true, true, Integer.MAX_VALUE, 5, true);
                class33.field742 = class117.method938(true, true, Integer.MAX_VALUE, 6, false);
                class44.field923 = class117.method938(true, false, Integer.MAX_VALUE, 7, true);
                class266.field4799 = class117.method938(true, false, Integer.MAX_VALUE, 8, true);
                class207.field3669 = class117.method938(true, false, Integer.MAX_VALUE, 9, true);
                class42.field887 = class117.method938(true, false, Integer.MAX_VALUE, 10, true);
                class78.field1497 = class117.method938(true, false, Integer.MAX_VALUE, 11, true);
                class103.field1947 = class117.method938(true, false, Integer.MAX_VALUE, 12, true);
                class257.field4572 = class117.method938(true, false, Integer.MAX_VALUE, 13, true);
                class13.field401 = class117.method938(true, false, Integer.MAX_VALUE, 14, false);
                class249.field4421 = class117.method938(true, false, Integer.MAX_VALUE, 15, true);
                class216.field3798 = class117.method938(true, false, Integer.MAX_VALUE, 16, true);
                class275.field4883 = class117.method938(true, false, Integer.MAX_VALUE, 17, true);
                class211.field3712 = class117.method938(true, false, Integer.MAX_VALUE, 18, true);
                class169.field3062 = class117.method938(true, false, Integer.MAX_VALUE, 19, true);
                class24.field617 = class117.method938(true, false, Integer.MAX_VALUE, 20, true);
                class322.field5631 = class117.method938(true, false, Integer.MAX_VALUE, 21, true);
                class183.field3355 = class117.method938(true, false, Integer.MAX_VALUE, 22, true);
                class326.field5674 = class117.method938(true, true, Integer.MAX_VALUE, 23, true);
                class214.field3765 = class117.method938(true, false, Integer.MAX_VALUE, 24, true);
                class253.field4509 = class117.method938(true, false, Integer.MAX_VALUE, 25, true);
                class276.field4895 = class117.method938(true, true, Integer.MAX_VALUE, 26, true);
                class39.field859 = class117.method938(true, false, Integer.MAX_VALUE, 27, true);
                class243.field4309 = class304.field5399;
                class287.field5131 = 40;
                class119.field2147 = 15;
            } else {
                class243.field4309 = class31.field716;
                class119.field2147 = 12;
            }
        } else if (class287.field5131 == 40) {
            int var24 = 0;
            for (int var25 = 0; var25 < 28; var25++) {
                var24 += class252.field4501[var25].method1661(false) * class153.field2785[var25] / 100;
            }
            if (var24 == 100) {
                class243.field4309 = class24.field616;
                class119.field2147 = 20;
                class320.method2253(class266.field4799, (byte) 82);
                class87.method759(26364, class266.field4799);
                class74.method640(true, class266.field4799);
                class287.field5131 = 45;
            } else {
                if (var24 != 0) {
                    class243.field4309 = class115.method929(new class279[] { class109.field2017, class191.method1447(5, var24), class50.field1043 }, (byte) 60);
                }
                class119.field2147 = 20;
            }
        } else {
            if (arg0 < 68) {
                this.method677((byte) 91);
            }
            if (class287.field5131 == 45) {
                class159.method1253(class80.field1525, 22050, 2, 8000);
                class141.field2558 = new class15();
                class141.field2558.method106(128, (byte) -54, 9);
                class80.field1537 = class94.method793(class110.field2022, class132.field2419, 22050, 0, (byte) -26);
                class80.field1537.method745(class141.field2558, 2000);
                class11.method80((byte) 87, class13.field401, class249.field4421, class141.field2558, class317.field5574);
                class120.field2163 = class94.method793(class110.field2022, class132.field2419, 2048, 1, (byte) -45);
                class322.field5630 = new class277();
                class120.field2163.method745(class322.field5630, 2000);
                class213.field3747 = new class166(22050, class312.field5524);
                class323.field5656 = class33.field742.method1167(class52.field1088, 127);
                class119.field2147 = 30;
                class243.field4309 = class324.field5659;
                class287.field5131 = 50;
            } else if (class287.field5131 == 50) {
                int var3 = class104.method881(class266.field4799, class257.field4572, 0);
                int var4 = class26.method228(0);
                if (var3 >= var4) {
                    class243.field4309 = class321.field5613;
                    class119.field2147 = 35;
                    class287.field5131 = 60;
                } else {
                    class243.field4309 = class115.method929(new class279[] { class71.field1388, class191.method1447(5, var3 * 100 / var4), class50.field1043 }, (byte) 60);
                    class119.field2147 = 35;
                }
            } else if (class287.field5131 == 60) {
                int var22 = class194.method1458(class266.field4799, (byte) -64);
                int var23 = class266.method1905(true);
                if (var22 < var23) {
                    class243.field4309 = class115.method929(new class279[] { class119.field2151, class191.method1447(5, var22 * 100 / var23), class50.field1043 }, (byte) 60);
                    class119.field2147 = 40;
                } else {
                    class243.field4309 = class301.field5364;
                    class119.field2147 = 40;
                    class287.field5131 = 65;
                }
            } else if (class287.field5131 == 65) {
                class108.method892(class266.field4799, 0, class257.field4572);
                class243.field4309 = class104.field1954;
                class119.field2147 = 45;
                class172.method1343(5, -29401);
                class287.field5131 = 70;
            } else if (class287.field5131 == 70) {
                class121.field2186.method1168(0);
                byte var10 = 0;
                int var11 = var10 + class121.field2186.method1184((byte) 116);
                class216.field3798.method1168(0);
                int var12 = var11 + class216.field3798.method1184((byte) 121);
                class275.field4883.method1168(0);
                int var13 = var12 + class275.field4883.method1184((byte) -70);
                class211.field3712.method1168(0);
                int var14 = var13 + class211.field3712.method1184((byte) 3);
                class169.field3062.method1168(0);
                int var15 = var14 + class169.field3062.method1184((byte) -52);
                class24.field617.method1168(0);
                int var16 = var15 + class24.field617.method1184((byte) -19);
                class322.field5631.method1168(0);
                int var17 = var16 + class322.field5631.method1184((byte) 8);
                class183.field3355.method1168(0);
                int var18 = var17 + class183.field3355.method1184((byte) 7);
                class214.field3765.method1168(0);
                int var19 = var18 + class214.field3765.method1184((byte) -115);
                class253.field4509.method1168(0);
                int var20 = var19 + class253.field4509.method1184((byte) -112);
                class39.field859.method1168(0);
                int var21 = var20 + class39.field859.method1184((byte) 6);
                if (var21 < 1100) {
                    class243.field4309 = class115.method929(new class279[] { class131.field2400, class191.method1447(5, var21 / 11), class50.field1043 }, (byte) 60);
                    class119.field2147 = 50;
                } else {
                    class123.method974((byte) 39, class121.field2186);
                    class251.method1804(-27505, class121.field2186);
                    class90.method772(class121.field2186, -17841);
                    class236.method1698(class44.field923, class121.field2186, true);
                    class101.method856(true, class216.field3798, class44.field923, false);
                    class249.method1785(class211.field3712, 58, class44.field923);
                    class13.method93(class169.field3062, true, true, class257.field4574, class44.field923);
                    class100.method855(class121.field2186, 26317);
                    class217.method1592(class182.field3343, class169.field3060, class24.field617, true);
                    class200.method1489(class121.field2186, 90);
                    class178.method1389((byte) 54, class44.field923, class322.field5631);
                    class69.method601(-1, class183.field3355);
                    class37.method338(class121.field2186, (byte) -18);
                    class150.method1195(class261.field4653, true, class266.field4799, class257.field4572, class44.field923);
                    class212.method1551(class121.field2186, false);
                    class314.method2222((byte) -106, class275.field4883);
                    class101.method860(class253.field4509, new class285(), class214.field3765, 12658);
                    class81.method678(class253.field4509, class214.field3765, (byte) 77);
                    class212.method1552(-96, class121.field2186);
                    class8.method55(class266.field4799, class121.field2186, 0);
                    class84.method729(class266.field4799, 18542, class121.field2186);
                    class119.field2147 = 50;
                    class243.field4309 = class102.field1913;
                    class274.method1943(3156);
                    class287.field5131 = 80;
                }
            } else if (class287.field5131 == 80) {
                int var8 = class8.method51(0, class266.field4799);
                int var9 = class246.method1760(-4235);
                if (var9 > var8) {
                    class243.field4309 = class115.method929(new class279[] { class105.field1979, class191.method1447(5, var8 * 100 / var9), class50.field1043 }, (byte) 60);
                    class119.field2147 = 60;
                } else {
                    class102.method865((byte) -116, class266.field4799);
                    class243.field4309 = class71.field1399;
                    class287.field5131 = 90;
                    class119.field2147 = 60;
                }
            } else if (class287.field5131 == 90) {
                if (class276.field4895.method1168(0)) {
                    class237 var7 = new class237(class207.field3669, class276.field4895, class266.field4799, 20, !class29.field685);
                    class27.method248(var7);
                    if (class253.field4519 == 1) {
                        class27.method250(0.9F);
                    }
                    if (class253.field4519 == 2) {
                        class27.method250(0.8F);
                    }
                    if (class253.field4519 == 3) {
                        class27.method250(0.7F);
                    }
                    if (class253.field4519 == 4) {
                        class27.method250(0.6F);
                    }
                    class119.field2147 = 70;
                    class287.field5131 = 100;
                    class243.field4309 = class284.field5068;
                } else {
                    class243.field4309 = class115.method929(new class279[] { class166.field3004, class191.method1447(5, class276.field4895.method1184((byte) 119)), class50.field1043 }, (byte) 60);
                    class119.field2147 = 70;
                }
            } else if (class287.field5131 == 100) {
                if (class119.method947(false, class266.field4799)) {
                    class287.field5131 = 110;
                }
            } else if (class287.field5131 == 110) {
                class207.field3661 = new class7();
                class110.field2022.method2163(class207.field3661, 10, 7159);
                class119.field2147 = 75;
                class287.field5131 = 120;
                class243.field4309 = class75.field1475;
            } else if (class287.field5131 == 120) {
                if (class42.field887.method1169(class190.field3426, class60.field1265, true)) {
                    class29 var6 = new class29(class42.field887.method1193(103, class190.field3426, class60.field1265));
                    class17.method147((byte) 80, var6);
                    class287.field5131 = 130;
                    class243.field4309 = class50.field1040;
                    class119.field2147 = 80;
                } else {
                    class243.field4309 = class115.method929(new class279[] { class162.field2926, class176.field3170 }, (byte) 60);
                    class119.field2147 = 80;
                }
            } else if (class287.field5131 == 130) {
                if (!class261.field4653.method1168(0)) {
                    class243.field4309 = class115.method929(new class279[] { class272.field4856, class191.method1447(5, class261.field4653.method1184((byte) 120) * 3 / 4), class50.field1043 }, (byte) 60);
                    class119.field2147 = 85;
                } else if (!class103.field1947.method1168(0)) {
                    class243.field4309 = class115.method929(new class279[] { class272.field4856, class191.method1447(5, class103.field1947.method1184((byte) 126) / 10 + 75), class50.field1043 }, (byte) 60);
                    class119.field2147 = 85;
                } else if (!class257.field4572.method1168(0)) {
                    class243.field4309 = class115.method929(new class279[] { class272.field4856, class191.method1447(5, class257.field4572.method1184((byte) 123) / 20 + 85), class50.field1043 }, (byte) 60);
                    class119.field2147 = 85;
                } else if (class326.field5674.method1163(class154.field2787, 97)) {
                    class100.method849((byte) 125, class326.field5674, class112.field2069);
                    class243.field4309 = class31.field719;
                    class119.field2147 = 95;
                    class287.field5131 = 135;
                } else {
                    class243.field4309 = class115.method929(new class279[] { class272.field4856, class191.method1447(5, (class326.field5674.method1194((byte) -116, class154.field2787) / 10) + 90), class50.field1043 }, (byte) 60);
                    class119.field2147 = 85;
                }
            } else if (class287.field5131 == 135) {
                int var5 = class269.method1917(-25169);
                if (var5 == -1) {
                    class119.field2147 = 95;
                    class243.field4309 = class83.field1588;
                } else if (var5 == 7 || var5 == 9) {
                    this.method672(10, "worldlistfull");
                    class172.method1343(1000, -29401);
                } else if (class143.field2584) {
                    class119.field2147 = 96;
                    class287.field5131 = 140;
                    class243.field4309 = class253.field4530;
                } else {
                    this.method672(10, "worldlistio_" + var5);
                    class172.method1343(1000, -29401);
                }
            } else if (class287.field5131 == 140) {
                class184.field3372 = class261.field4653.method1167(class130.field2386, 126);
                class295.field5259.method1171(true, false, 3);
                class33.field742.method1171(true, true, 3);
                class266.field4799.method1171(true, true, 3);
                class257.field4572.method1171(true, true, 3);
                class42.field887.method1171(true, true, 3);
                class261.field4653.method1171(true, true, 3);
                class287.field5131 = 150;
                class243.field4309 = class201.field3587;
                class119.field2147 = 97;
                class123.field2214 = true;
            } else if (class287.field5131 == 150) {
                class129.method1018();
                if (class39.field853) {
                    class141.field2566 = 0;
                    class232.field4062 = 0;
                    class283.field5062 = 0;
                    class50.field1029 = 0;
                }
                class39.field853 = true;
                class54.method507(class110.field2022, -6);
                class103.method867(-1, 2, false, -1, class283.field5062);
                class287.field5131 = 160;
                class119.field2147 = 100;
                class243.field4309 = class121.field2175;
            } else if (class287.field5131 == 160) {
                class133.method1043(true, false);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 538)
    private final void method1793(int arg0) {
        for (class155.field2804 = 0; class13.method90(33) && class155.field2804 < 128; class155.field2804++) {
            class207.field3663[class155.field2804] = class58.field1227;
            class35.field800[class155.field2804] = class50.field1025;
        }
        field4477++;
        class121.field2187++;
        if (class307.field5444 != -1) {
            class184.method1420(0, 0, 7177, 0, class307.field5444, class221.field3899, 0, class176.field3150);
        }
        if (arg0 != 85) {
            return;
        }
        class249.field4443++;
        if (class97.field1824) {
            int var2 = 19137023;
            label191: for (int var3 = 0; var3 < 32768; var3++) {
                class102 var4 = class122.field2196[var3];
                if (var4 != null) {
                    byte var5 = var4.field1921.field2274;
                    if ((var5 & 0x2) > 0 && var4.field82 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var6 != 0 || var7 != 0) {
                            var4.field11[0] = (var4.field86 >> 7) + var6;
                            var4.field55[0] = 1;
                            var4.field34[0] = (var4.field79 >> 7) + var7;
                            class90.field1702[class287.field5134].method980(var4.field79 >> 7, 0, false, true, var4.method3((byte) -110), var4.method3((byte) -91), var4.field86 >> 7);
                            if (var4.field11[0] >= 0 && var4.field11[0] <= 104 - var4.method3((byte) -103) && var4.field34[0] >= 0 && var4.field34[0] <= (104 - var4.method3((byte) -90)) && class90.field1702[class287.field5134].method970(var4.field86 >> 7, var4.field11[0], var4.field34[0], var4.field79 >> 7, (byte) 127)) {
                                if (var4.method3((byte) -95) > 1) {
                                    for (int var8 = var4.field11[0]; var8 < (var4.field11[0] + var4.method3((byte) -122)); var8++) {
                                        for (int var9 = var4.field34[0]; var4.field34[0] + var4.method3((byte) -115) > var9; var9++) {
                                            if ((var2 & class90.field1702[class287.field5134].field2215[var8][var9]) != 0) {
                                                continue label191;
                                            }
                                        }
                                    }
                                }
                                var4.field82 = 1;
                            }
                        }
                    }
                    class8.method56(47, var4);
                    class216.method1580(arg0 + 22, var4);
                    class41.method356(var4, -57);
                    class90.field1702[class287.field5134].method976(var4.method3((byte) -115), arg0 - 206, var4.method3((byte) -107), false, var4.field79 >> 7, var4.field86 >> 7);
                }
            }
        }
        if (!class97.field1824) {
            class165.method1291(false);
        } else if (class141.field2557 == 0 && class139.field2516 == 0) {
            if (class122.field2191 == 2) {
                class191.method1449((byte) 85);
            } else {
                class248.method1777(arg0 ^ 0x56);
            }
            if ((class21.field589 >> 7) < 14 || (class21.field589 >> 7) >= 90 || (class92.field1747 >> 7) < 14 || (class92.field1747 >> 7) >= 90) {
                class54.method508(arg0 - 4);
            }
        }
        while (true) {
            class23 var10;
            class8 var11;
            class8 var12;
            do {
                var10 = (class23) class119.field2149.method2247(arg0 ^ 0x4B);
                if (var10 == null) {
                    while (true) {
                        class23 var13;
                        class8 var17;
                        class8 var18;
                        do {
                            var13 = (class23) class312.field5523.method2247(arg0 ^ 0x1B);
                            if (var13 == null) {
                                while (true) {
                                    class23 var14;
                                    class8 var15;
                                    class8 var16;
                                    do {
                                        var14 = (class23) class268.field4804.method2247(arg0 ^ 0x2D);
                                        if (var14 == null) {
                                            if (class247.field4388 != null) {
                                                class284.method2036(-7194);
                                            }
                                            if (class249.field4444 != null && class249.field4444.field3655 == 1) {
                                                if (class249.field4444.field3657 != null) {
                                                    class112.method914((byte) -124, class324.field5662, class32.field733);
                                                }
                                                class32.field733 = null;
                                                class324.field5662 = false;
                                                class249.field4444 = null;
                                            }
                                            if ((class8.field279 % 1500) == 0) {
                                                class134.method1049(-3);
                                            }
                                            return;
                                        }
                                        var15 = var14.field596;
                                        if (var15.field261 < 0) {
                                            break;
                                        }
                                        var16 = class273.method1940(var15.field324, -45);
                                    } while (var16 == null || var16.field159 == null || var16.field159.length <= var15.field261 || var16.field159[var15.field261] != var15);
                                    class279.method2017(0, var14);
                                }
                            }
                            var17 = var13.field596;
                            if (var17.field261 < 0) {
                                break;
                            }
                            var18 = class273.method1940(var17.field324, arg0 - 157);
                        } while (var18 == null || var18.field159 == null || var18.field159.length <= var17.field261 || var18.field159[var17.field261] != var17);
                        class279.method2017(0, var13);
                    }
                }
                var11 = var10.field596;
                if (var11.field261 < 0) {
                    break;
                }
                var12 = class273.method1940(var11.field324, arg0 ^ 0xFFFFFFB5);
            } while (var12 == null || var12.field159 == null || var11.field261 >= var12.field159.length || var12.field159[var11.field261] != var11);
            class279.method2017(0, var10);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 754)
    public final void method677(byte arg0) {
        field4478++;
        if (class53.field1111 == 1000) {
            return;
        }
        class8.field279++;
        if (class8.field279 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class216.field3804 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class306.field5433.setSeed((long) class216.field3804);
        }
        this.method1795(-45);
        if (class314.field5537 != null) {
            class314.field5537.method1328(false);
        }
        class71.method620(-25813);
        class35.method309((byte) 121);
        class181.method1404(-81);
        class184.method1426(true);
        if (class97.field1824) {
            class308.method2193();
        }
        if (class163.field2931 != null) {
            int var3 = class163.field2931.method27(-9244);
            class216.field3818 = var3;
        }
        int var4 = 103 % ((-arg0) / 57);
        if (class53.field1111 == 0) {
            this.method1792(111);
            class142.method1092(-116);
        } else if (class53.field1111 == 5) {
            this.method1792(119);
            class142.method1092(-122);
        } else if (class53.field1111 == 25 || class53.field1111 == 28) {
            class152.method1209((byte) 107);
        }
        if (class53.field1111 == 10) {
            this.method1793(85);
            class165.method1288((byte) -86);
            class35.method310(76);
            class11.method82(-127);
        } else if (class53.field1111 == 30) {
            class233.method1680(false);
        } else if (class53.field1111 == 40) {
            class11.method82(-126);
            if (class279.field4943 != -3) {
                if (class279.field4943 == 15) {
                    class100.method851(true);
                } else if (class279.field4943 != 2) {
                    class63.method551(-119);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 856)
    public final void method669(int arg0) {
        class154.method1217(-17234);
        field4460++;
        class91.field1716 = new class90();
        class255.field4552 = new class177();
        if (class283.field5063 != 0) {
            class14.field424 = new byte[50][];
        }
        class307.method2188(class110.field2022, (byte) 91);
        if (class124.field2261 == arg0) {
            class301.field5361 = this.getCodeBase().getHost();
            class202.field3606 = 443;
            class247.field4386 = 43594;
        } else if (class124.field2261 == 1) {
            class301.field5361 = this.getCodeBase().getHost();
            class202.field3606 = class275.field4887 + 50000;
            class247.field4386 = class275.field4887 + 40000;
        } else if (class124.field2261 == 2) {
            class202.field3606 = class275.field4887 + 50000;
            class301.field5361 = "127.0.0.1";
            class247.field4386 = class275.field4887 + 40000;
        }
        class274.field4876 = class301.field5361;
        class33.field745 = class174.field3127 = class121.field2184 = class16.field520 = new short[256];
        if (class305.field5415 == 3 && class124.field2261 != 2) {
            class12.field386 = class275.field4887;
        }
        class86.field1616 = class202.field3606;
        class260.field4621 = class247.field4386;
        class117.field2134 = class247.field4386;
        if (class214.field3764 == 1) {
            class223.field3939 = class85.field1604;
            class243.field4321 = true;
            class78.field1500 = class38.field844;
            class140.field2550 = class297.field5270;
            class212.field3718 = class324.field5658;
            class219.field3878 = 16777215;
            class219.field3870 = 0;
        } else {
            class223.field3939 = class33.field741;
            class78.field1500 = class72.field1412;
            class212.field3718 = class217.field3845;
            class140.field2550 = class143.field2590;
        }
        class311.field5512 = class117.field2134;
        class174.method1354(-122);
        class131.method1032(class132.field2419, (byte) -90);
        class320.method2252(class132.field2419, (byte) -54);
        class163.field2931 = class17.method149((byte) 83);
        if (class163.field2931 != null) {
            class163.field2931.method33((byte) -125, class132.field2419);
        }
        class233.field4082 = class305.field5415;
        try {
            if (class110.field2022.field5410 != null) {
                class74.field1461 = new class262(class110.field2022.field5410, 5200, 0);
                for (int var2 = 0; var2 < 28; var2++) {
                    class37.field820[var2] = new class262(class110.field2022.field5421[var2], 6000, 0);
                }
                class122.field2202 = new class262(class110.field2022.field5420, 6000, 0);
                class180.field3255 = new class120(255, class74.field1461, class122.field2202, 500000);
                class287.field5126 = new class262(class110.field2022.field5411, 24, 0);
                class110.field2022.field5420 = null;
                class110.field2022.field5411 = null;
                class110.field2022.field5410 = null;
                class110.field2022.field5421 = null;
            }
        } catch (IOException var4) {
            class180.field3255 = null;
            class287.field5126 = null;
            class74.field1461 = null;
            class122.field2202 = null;
        }
        if (class124.field2261 != 0) {
            class140.field2549 = true;
        }
        class321.field5616 = class15.field501;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 975)
    public final void method665(boolean arg0) {
        if (class97.field1824) {
            class97.method810();
        }
        field4464++;
        if (class120.field2159 != null) {
            class125.method997(class110.field2022, (byte) 23, class120.field2159);
            class120.field2159 = null;
        }
        if (class110.field2022 != null) {
            class110.field2022.method2165(this.getClass(), (byte) 105);
        }
        if (class207.field3661 != null) {
            class207.field3661.field144 = false;
        }
        class207.field3661 = null;
        if (class202.field3603 != null) {
            class202.field3603.method2024(-1);
            class202.field3603 = null;
        }
        class236.method1697(class132.field2419, (byte) -29);
        class37.method328(class132.field2419, arg0);
        if (class163.field2931 != null) {
            class163.field2931.method28((byte) 32, class132.field2419);
        }
        class306.method2176((byte) -57);
        class16.method145(-25272);
        class163.field2931 = null;
        if (class80.field1537 != null) {
            class80.field1537.method748(-126);
        }
        if (class120.field2163 != null) {
            class120.field2163.method748(-128);
        }
        class255.field4552.method1386(-23);
        class91.field1716.method780(0);
        try {
            if (class74.field1461 != null) {
                class74.field1461.method1882(false);
            }
            if (class37.field820 != null) {
                for (int var2 = 0; var2 < class37.field820.length; var2++) {
                    if (class37.field820[var2] != null) {
                        class37.field820[var2].method1882(false);
                    }
                }
            }
            if (!arg0) {
                return;
            }
            if (class122.field2202 != null) {
                class122.field2202.method1882(!arg0);
            }
            if (class287.field5126 != null) {
                class287.field5126.method1882(!arg0);
            }
        } catch (IOException var4) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lgf;IIIIIII)V", line = 1061)
    public static final void method1794(class8[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class8 var9 = arg0[var8];
            if (var9 != null && var9.field324 == arg1 && (!var9.field223 || var9.field201 == 0 || var9.field164 || method1798(var9).field4372 != 0 || class307.field5460 == var9 || var9.field326 == 1338) && (!var9.field223 || !method1800(var9))) {
                int var10 = var9.field167 + arg6;
                int var11 = var9.field264 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field201 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field220 + var10;
                    int var17 = var9.field297 + var11;
                    if (var9.field201 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class247.field4388 == var9) {
                    class210.field3701 = true;
                    class252.field4493 = var10;
                    class217.field3833 = var11;
                }
                if (!var9.field223 || var12 < var14 && var13 < var15) {
                    if (var9.field201 == 0) {
                        if (!var9.field223 && method1800(var9) && class111.field2048 != var9) {
                            continue;
                        }
                        if (var9.field262 && class130.field2363 >= var12 && class51.field1056 >= var13 && class130.field2363 < var14 && class51.field1056 < var15) {
                            for (class23 var18 = (class23) class268.field4804.method2248(-92); var18 != null; var18 = (class23) class268.field4804.method2240(1138)) {
                                if (var18.field601) {
                                    var18.method2221(true);
                                    var18.field596.field308 = false;
                                }
                            }
                            if (class55.field1198 == 0) {
                                class247.field4388 = null;
                                class307.field5460 = null;
                            }
                            class135.field2466 = 0;
                        }
                    }
                    if (var9.field223) {
                        boolean var19;
                        if (class130.field2363 >= var12 && class51.field1056 >= var13 && class130.field2363 < var14 && class51.field1056 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class34.field778 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class101.field1894 == 1 && class232.field4074 >= var12 && class64.field1307 >= var13 && class232.field4074 < var14 && class64.field1307 < var15) {
                            var21 = true;
                        }
                        if (var9.field246 != null) {
                            for (int var22 = 0; var22 < var9.field246.length; var22++) {
                                if (class284.field5075[var9.field246[var22]]) {
                                    if (var9.field305 == null || class8.field279 >= var9.field305[var22]) {
                                        byte var23 = var9.field213[var22];
                                        if (var23 == 0 || ((var23 & 0x2) == 0 || class284.field5075[86]) && ((var23 & 0x1) == 0 || class284.field5075[82]) && ((var23 & 0x4) == 0 || class284.field5075[81])) {
                                            class55.method514(var9.field299, (byte) -123, class60.field1265, var22 + 1, -1);
                                            int var24 = var9.field314[var22];
                                            if (var9.field305 == null) {
                                                var9.field305 = new int[var9.field246.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field305[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field305[var22] = class8.field279 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field305 != null) {
                                    var9.field305[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class285.method2041(class232.field4074 - var10, (byte) 24, class64.field1307 - var11, var9);
                        }
                        if (class247.field4388 != null && class247.field4388 != var9 && var19 && method1798(var9).method1752(-1)) {
                            class245.field4347 = var9;
                        }
                        if (class307.field5460 == var9) {
                            class251.field4486 = true;
                            class155.field2806 = var10;
                            class264.field4710 = var11;
                        }
                        if (var9.field164 || var9.field326 != 0) {
                            if (var19 && class216.field3818 != 0 && var9.field211 != null) {
                                class23 var25 = new class23();
                                var25.field601 = true;
                                var25.field596 = var9;
                                var25.field600 = class216.field3818;
                                var25.field608 = var9.field211;
                                class268.field4804.method2246(true, var25);
                            }
                            if (class247.field4388 != null || class302.field5373 != null || class238.field4184 || var9.field326 != 1400 && class135.field2466 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field326 != 0) {
                                if (var9.field326 == 1337) {
                                    class23.field597 = var9;
                                    class50.method426(var9, false);
                                    continue;
                                }
                                if (var9.field326 == 1338) {
                                    if (var21) {
                                        class289.field5148 = class232.field4074 - var10;
                                        class287.field5133 = class64.field1307 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field326 == 1400) {
                                    class45.field947 = var9;
                                    if (var21) {
                                        if (class284.field5075[82] && class145.field2623 > 0) {
                                            int var26 = (int) ((double) (class232.field4074 - var10 - var9.field220 / 2) * 2.0D / (double) class52.field1071);
                                            int var27 = (int) ((double) (class64.field1307 - var11 - var9.field297 / 2) * 2.0D / (double) class52.field1071);
                                            int var28 = class265.field4776 + var26;
                                            int var29 = class298.field5282 + var27;
                                            int var30 = class245.field4356 + var28;
                                            int var31 = class166.field3007 + class34.field777 - var29 - 1;
                                            class157.method1222(var31, var30, 0, (byte) 28);
                                            class138.method1069(-71);
                                            continue;
                                        }
                                        class135.field2466 = 1;
                                        class28.field673 = class130.field2363;
                                        class209.field3678 = class51.field1056;
                                        continue;
                                    }
                                    if (var20 && class135.field2466 > 0) {
                                        if (class135.field2466 == 1 && (class28.field673 != class130.field2363 || class51.field1056 != class209.field3678)) {
                                            class105.field1977 = class265.field4776;
                                            class218.field3856 = class298.field5282;
                                            class135.field2466 = 2;
                                        }
                                        if (class135.field2466 == 2) {
                                            class7.method42(false, (int) ((double) (class28.field673 - class130.field2363) * 2.0D / (double) class183.field3356) + class105.field1977);
                                            class255.method1824((int) ((double) (class209.field3678 - class51.field1056) * 2.0D / (double) class183.field3356) + class218.field3856, -1656);
                                        }
                                        continue;
                                    }
                                    class135.field2466 = 0;
                                    continue;
                                }
                                if (var9.field326 == 1401) {
                                    if (var20) {
                                        class216.method1588(false, class51.field1056 - var11, var9.field220, var9.field297, class130.field2363 - var10);
                                    }
                                    continue;
                                }
                                if (var9.field326 == 1402) {
                                    if (!class97.field1824) {
                                        class50.method426(var9, false);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field260 && var21) {
                                var9.field260 = true;
                                if (var9.field288 != null) {
                                    class23 var32 = new class23();
                                    var32.field601 = true;
                                    var32.field596 = var9;
                                    var32.field604 = class232.field4074 - var10;
                                    var32.field600 = class64.field1307 - var11;
                                    var32.field608 = var9.field288;
                                    class268.field4804.method2246(true, var32);
                                }
                            }
                            if (var9.field260 && var20 && var9.field188 != null) {
                                class23 var33 = new class23();
                                var33.field601 = true;
                                var33.field596 = var9;
                                var33.field604 = class130.field2363 - var10;
                                var33.field600 = class51.field1056 - var11;
                                var33.field608 = var9.field188;
                                class268.field4804.method2246(true, var33);
                            }
                            if (var9.field260 && !var20) {
                                var9.field260 = false;
                                if (var9.field203 != null) {
                                    class23 var34 = new class23();
                                    var34.field601 = true;
                                    var34.field596 = var9;
                                    var34.field604 = class130.field2363 - var10;
                                    var34.field600 = class51.field1056 - var11;
                                    var34.field608 = var9.field203;
                                    class312.field5523.method2246(true, var34);
                                }
                            }
                            if (var20 && var9.field165 != null) {
                                class23 var35 = new class23();
                                var35.field601 = true;
                                var35.field596 = var9;
                                var35.field604 = class130.field2363 - var10;
                                var35.field600 = class51.field1056 - var11;
                                var35.field608 = var9.field165;
                                class268.field4804.method2246(true, var35);
                            }
                            if (!var9.field308 && var19) {
                                var9.field308 = true;
                                if (var9.field331 != null) {
                                    class23 var36 = new class23();
                                    var36.field601 = true;
                                    var36.field596 = var9;
                                    var36.field604 = class130.field2363 - var10;
                                    var36.field600 = class51.field1056 - var11;
                                    var36.field608 = var9.field331;
                                    class268.field4804.method2246(true, var36);
                                }
                            }
                            if (var9.field308 && var19 && var9.field307 != null) {
                                class23 var37 = new class23();
                                var37.field601 = true;
                                var37.field596 = var9;
                                var37.field604 = class130.field2363 - var10;
                                var37.field600 = class51.field1056 - var11;
                                var37.field608 = var9.field307;
                                class268.field4804.method2246(true, var37);
                            }
                            if (var9.field308 && !var19) {
                                var9.field308 = false;
                                if (var9.field271 != null) {
                                    class23 var38 = new class23();
                                    var38.field601 = true;
                                    var38.field596 = var9;
                                    var38.field604 = class130.field2363 - var10;
                                    var38.field600 = class51.field1056 - var11;
                                    var38.field608 = var9.field271;
                                    class312.field5523.method2246(true, var38);
                                }
                            }
                            if (var9.field328 != null) {
                                class23 var39 = new class23();
                                var39.field596 = var9;
                                var39.field608 = var9.field328;
                                class119.field2149.method2246(true, var39);
                            }
                            if (var9.field284 != null && class261.field4651 > var9.field208) {
                                if (var9.field199 == null || class261.field4651 - var9.field208 > 32) {
                                    class23 var44 = new class23();
                                    var44.field596 = var9;
                                    var44.field608 = var9.field284;
                                    class268.field4804.method2246(true, var44);
                                } else {
                                    label568: for (int var40 = var9.field208; var40 < class261.field4651; var40++) {
                                        int var41 = class268.field4811[var40 & 0x1F];
                                        for (int var42 = 0; var42 < var9.field199.length; var42++) {
                                            if (var9.field199[var42] == var41) {
                                                class23 var43 = new class23();
                                                var43.field596 = var9;
                                                var43.field608 = var9.field284;
                                                class268.field4804.method2246(true, var43);
                                                break label568;
                                            }
                                        }
                                    }
                                }
                                var9.field208 = class261.field4651;
                            }
                            if (var9.field172 != null && class265.field4779 > var9.field226) {
                                if (var9.field166 == null || class265.field4779 - var9.field226 > 32) {
                                    class23 var49 = new class23();
                                    var49.field596 = var9;
                                    var49.field608 = var9.field172;
                                    class268.field4804.method2246(true, var49);
                                } else {
                                    label544: for (int var45 = var9.field226; var45 < class265.field4779; var45++) {
                                        int var46 = class229.field3986[var45 & 0x1F];
                                        for (int var47 = 0; var47 < var9.field166.length; var47++) {
                                            if (var9.field166[var47] == var46) {
                                                class23 var48 = new class23();
                                                var48.field596 = var9;
                                                var48.field608 = var9.field172;
                                                class268.field4804.method2246(true, var48);
                                                break label544;
                                            }
                                        }
                                    }
                                }
                                var9.field226 = class265.field4779;
                            }
                            if (var9.field224 != null && class64.field1320 > var9.field193) {
                                if (var9.field250 == null || class64.field1320 - var9.field193 > 32) {
                                    class23 var54 = new class23();
                                    var54.field596 = var9;
                                    var54.field608 = var9.field224;
                                    class268.field4804.method2246(true, var54);
                                } else {
                                    label520: for (int var50 = var9.field193; var50 < class64.field1320; var50++) {
                                        int var51 = class35.field791[var50 & 0x1F];
                                        for (int var52 = 0; var52 < var9.field250.length; var52++) {
                                            if (var9.field250[var52] == var51) {
                                                class23 var53 = new class23();
                                                var53.field596 = var9;
                                                var53.field608 = var9.field224;
                                                class268.field4804.method2246(true, var53);
                                                break label520;
                                            }
                                        }
                                    }
                                }
                                var9.field193 = class64.field1320;
                            }
                            if (var9.field175 != null && class54.field1189 > var9.field302) {
                                if (var9.field316 == null || class54.field1189 - var9.field302 > 32) {
                                    class23 var59 = new class23();
                                    var59.field596 = var9;
                                    var59.field608 = var9.field175;
                                    class268.field4804.method2246(true, var59);
                                } else {
                                    label496: for (int var55 = var9.field302; var55 < class54.field1189; var55++) {
                                        int var56 = class213.field3740[var55 & 0x1F];
                                        for (int var57 = 0; var57 < var9.field316.length; var57++) {
                                            if (var9.field316[var57] == var56) {
                                                class23 var58 = new class23();
                                                var58.field596 = var9;
                                                var58.field608 = var9.field175;
                                                class268.field4804.method2246(true, var58);
                                                break label496;
                                            }
                                        }
                                    }
                                }
                                var9.field302 = class54.field1189;
                            }
                            if (var9.field256 != null && class252.field4500 > var9.field255) {
                                if (var9.field312 == null || class252.field4500 - var9.field255 > 32) {
                                    class23 var64 = new class23();
                                    var64.field596 = var9;
                                    var64.field608 = var9.field256;
                                    class268.field4804.method2246(true, var64);
                                } else {
                                    label472: for (int var60 = var9.field255; var60 < class252.field4500; var60++) {
                                        int var61 = class180.field3274[var60 & 0x1F];
                                        for (int var62 = 0; var62 < var9.field312.length; var62++) {
                                            if (var9.field312[var62] == var61) {
                                                class23 var63 = new class23();
                                                var63.field596 = var9;
                                                var63.field608 = var9.field256;
                                                class268.field4804.method2246(true, var63);
                                                break label472;
                                            }
                                        }
                                    }
                                }
                                var9.field255 = class252.field4500;
                            }
                            if (class239.field4195 > var9.field177 && var9.field268 != null) {
                                class23 var65 = new class23();
                                var65.field596 = var9;
                                var65.field608 = var9.field268;
                                class268.field4804.method2246(true, var65);
                            }
                            if (class162.field2923 > var9.field177 && var9.field245 != null) {
                                class23 var66 = new class23();
                                var66.field596 = var9;
                                var66.field608 = var9.field245;
                                class268.field4804.method2246(true, var66);
                            }
                            if (class323.field5646 > var9.field177 && var9.field287 != null) {
                                class23 var67 = new class23();
                                var67.field596 = var9;
                                var67.field608 = var9.field287;
                                class268.field4804.method2246(true, var67);
                            }
                            if (class100.field1860 > var9.field177 && var9.field185 != null) {
                                class23 var68 = new class23();
                                var68.field596 = var9;
                                var68.field608 = var9.field185;
                                class268.field4804.method2246(true, var68);
                            }
                            if (class18.field549 > var9.field177 && var9.field257 != null) {
                                class23 var69 = new class23();
                                var69.field596 = var9;
                                var69.field608 = var9.field257;
                                class268.field4804.method2246(true, var69);
                            }
                            var9.field177 = class249.field4443;
                            if (var9.field266 != null) {
                                for (int var70 = 0; var70 < class155.field2804; var70++) {
                                    class23 var71 = new class23();
                                    var71.field596 = var9;
                                    var71.field594 = class207.field3663[var70];
                                    var71.field606 = class35.field800[var70];
                                    var71.field608 = var9.field266;
                                    class268.field4804.method2246(true, var71);
                                }
                            }
                            if (class35.field788 && var9.field228 != null) {
                                class23 var72 = new class23();
                                var72.field596 = var9;
                                var72.field608 = var9.field228;
                                class268.field4804.method2246(true, var72);
                            }
                        }
                    }
                    if (!var9.field223 && class247.field4388 == null && class302.field5373 == null && !class238.field4184) {
                        if ((var9.field240 >= 0 || var9.field280 != 0) && class130.field2363 >= var12 && class51.field1056 >= var13 && class130.field2363 < var14 && class51.field1056 < var15) {
                            if (var9.field240 >= 0) {
                                class111.field2048 = arg0[var9.field240];
                            } else {
                                class111.field2048 = var9;
                            }
                        }
                        if (var9.field201 == 8 && class130.field2363 >= var12 && class51.field1056 >= var13 && class130.field2363 < var14 && class51.field1056 < var15) {
                            class141.field2563 = var9;
                        }
                        if (var9.field267 > var9.field297) {
                            class205.method1525(var11, var9.field220 + var10, var9.field297, var9.field267, class51.field1056, 2245, var9, class130.field2363);
                        }
                    }
                    if (var9.field201 == 0) {
                        method1794(arg0, var9.field299, var12, var13, var14, var15, var10 - var9.field212, var11 - var9.field243);
                        if (var9.field159 != null) {
                            method1794(var9.field159, var9.field299, var12, var13, var14, var15, var10 - var9.field212, var11 - var9.field243);
                        }
                        class176 var73 = (class176) class226.field3977.method610((long) var9.field299, -1);
                        if (var73 != null) {
                            class184.method1420(var11, var12, 7177, var10, var73.field3165, var14, var13, var15);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 1826)
    public final void method670(int arg0) {
        method1791(false);
        class279.method1982(1);
        class94.method794(-623057722);
        class43.method368(-113);
        field4461++;
        class133.method1046(-8);
        class80.method671((byte) 91);
        class97.method825();
        class251.method1802(-88);
        class64.method560(32);
        class7.method40(123);
        class130.method1026(arg0 + 102);
        class53.method476(0);
        class177.method1371((byte) -125);
        class90.method776(arg0 - 115);
        class170.method1322(-22352);
        class230.method1659(false);
        class149.method1161(arg0 - 11648);
        class262.method1877(arg0 ^ 0xFFFFFF92);
        class120.method956(arg0 ^ 0xFF);
        class171.method1333(true);
        class102.method866(arg0);
        class222.method1623(304);
        class123.method967(-1);
        class8.method50((byte) 100);
        class236.method1699((byte) -92);
        class239.method1721(-51);
        class317.method2242(0);
        class69.method607(0);
        class5.method26((byte) -29);
        class132.method1037(false);
        class152.method1205(false);
        class15.method101(-5976);
        class86.method744((byte) 117);
        class166.method1299(arg0 ^ 0xFFFF9C5E);
        class44.method377(arg0 ^ 0xB57A290);
        class182.method1408((byte) -16);
        class1.method13((byte) -125);
        class191.method1448((byte) -112);
        class264.method1897(true);
        class261.method1868((byte) -101);
        class125.method1006((byte) 47);
        class176.method1369(-300);
        class246.method1759(-22278);
        class314.method2225((byte) 22);
        class204.method1512(arg0 - 1);
        class45.method387(arg0 + 25228);
        class185.method1432(arg0 + 102);
        class211.method1544(arg0 + 23580);
        class266.method1904(116);
        class194.method1461(arg0 ^ 0x30DE);
        class306.method2175((byte) 68);
        class16.method144((byte) 105);
        class48.method394(255);
        class159.method1252((byte) -93);
        class268.method1912(arg0 + 26276);
        class140.method1082(-123);
        class78.method653(-103);
        class33.method301(true);
        class309.method2199(72);
        class164.method1284(-115);
        class103.method872((byte) -66);
        class126.method1009((byte) -6);
        class196.method1467(123);
        class219.method1605();
        class107.method889(arg0 ^ 0x7);
        class148.method1135();
        class192.method1451((byte) -71);
        class299.method2116();
        class157.method1226(-73);
        class242.method1731();
        class254.method1818((byte) 117);
        class12.method88(-119);
        class201.method1492(126);
        class131.method1030(-2);
        class308.method2192();
        class13.method95(true);
        class320.method2255((byte) -37);
        class321.method2261(-86);
        class50.method427(arg0 + 20454);
        class49.method421();
        class226.method1649((byte) 118);
        class165.method1289((byte) -90);
        class270.method1932();
        class315.method2229((byte) 110);
        class68.method599(arg0 ^ 0x64);
        class311.method2211((byte) 36);
        class175.method1361();
        class30.method281();
        class37.method335(false);
        class318.method2250(73);
        class51.method431((byte) -72);
        class278.method1964((byte) 117);
        class207.method1527((byte) 103);
        class146.method1120();
        class67.method592((byte) -121);
        class31.method290(0);
        class205.method1523((byte) -45);
        class115.method927((byte) -128);
        class247.method1773(-122);
        class231.method1672((byte) -113);
        class84.method728(true);
        class124.method991((byte) 40);
        class323.method2278(-60);
        class135.method1060(90);
        class20.method190(1);
        class38.method343(-12230);
        class34.method302(arg0 - 1593);
        class213.method1562(8);
        class212.method1550(arg0 ^ 0x0);
        class60.method537((byte) 5);
        class134.method1050(107);
        class199.method1483(128);
        class307.method2185(0);
        class285.method2039(true);
        class289.method2064(122);
        class113.method919((byte) 62);
        class58.method526((byte) -80);
        class142.method1090(117);
        class237.method1701(-2);
        class178.method1391(-3);
        class111.method910(122);
        class27.method244();
        class29.method269(-125);
        class284.method2038(true);
        class297.method2098(32052);
        class169.method1316((byte) -4);
        class42.method359(arg0);
        class265.method1901((byte) 26);
        class129.method1023();
        class101.method859(-120);
        class248.method1780(-44);
        class282.method2029((byte) -123);
        class23.method207(true);
        class108.method898(true);
        class144.method1101(arg0);
        class168.method1309();
        class18.method156(false);
        class195.method1462(127);
        class17.method154(-9918);
        class235.method1693((byte) 126);
        class243.method1743(25875);
        class153.method1212((byte) -98);
        class304.method2153((byte) -122);
        class281.method2028();
        class112.method916((byte) 118);
        class77.method650(-4643);
        class81.method679(arg0 - 72);
        class93.method790();
        class163.method1280(false);
        class136.method1062();
        class137.method1064(arg0 ^ 0x0);
        class160.method1257();
        class193.method1456();
        class200.method1486(22657);
        class273.method1941(false);
        class104.method882(true);
        class109.method902(113);
        class52.method439((byte) 48);
        class190.method1442((byte) -57);
        class35.method312(-77);
        class291.method2075();
        class75.method645(-121);
        class88.method764((byte) -8);
        class256.method1829();
        class98.method841((byte) 45);
        class139.method1077((byte) 106);
        class249.method1786(arg0 ^ 0x53);
        class295.method2093((byte) 54);
        class99.method847(-1);
        class283.method2033(arg0 + 1);
        class216.method1586((byte) 70);
        class238.method1715(0);
        class57.method521(1);
        class272.method1937((byte) 39);
        class224.method1647(2);
        class91.method782(arg0 + 128);
        class62.method544(-4566);
        class172.method1342(false);
        class39.method349((byte) 104);
        class28.method257(92);
        class122.method962(88);
        class220.method1611(arg0 ^ 0xFFFFFF81);
        class59.method534(arg0 + 103);
        class55.method517((byte) 75);
        class324.method2279(0);
        class234.method1686();
        class180.method1400(20525);
        class3.method19(0);
        class41.method351(arg0 ^ 0x4E);
        class85.method736(74);
        class217.method1591(arg0 + 16279);
        class244.method1745(true);
        class106.method888();
        class89.method765();
        class72.method634((byte) -122);
        class32.method295((byte) -122);
        class10.method74();
        class296.method2096();
        class145.method1105(111);
        class162.method1277(false);
        class258.method1849();
        class116.method930();
        class214.method1575(true);
        class274.method1946((byte) -62);
        class71.method626(-27576);
        class245.method1749((byte) -126);
        class63.method554(-1);
        class271.method1934(arg0 ^ 0x1F4);
        class96.method800(-1933341052);
        class143.method1095(arg0 ^ 0x0);
        class26.method231(4096);
        class181.method1401(0);
        class141.method1087(64);
        class221.method1622((byte) 72);
        class312.method2216(-1465077780);
        class119.method946(17);
        class302.method2143(arg0 - 1);
        class223.method1641(-83);
        class250.method1787(-89);
        class87.method763(-85);
        class287.method2050(53);
        class179.method1397((byte) 24);
        class174.method1355((byte) 121);
        class229.method1653((byte) 60);
        class138.method1071((byte) -124);
        class110.method903(arg0);
        class257.method1842((byte) -113);
        class14.method99(117);
        class155.method1219(33);
        class117.method939(-32702);
        class183.method1415(arg0 - 121);
        class100.method852(-127);
        class189.method1439(arg0 ^ 0x1000);
        class290.method2073(true);
        class294.method2092(117);
        class253.method1814(122);
        class73.method636(-2);
        class173.method1347((byte) 88);
        class301.method2141(-1);
        class209.method1541((byte) 16);
        class198.method1474((byte) -77);
        class286.method2046((byte) 66);
        class150.method1200((byte) -121);
        class21.method197(0);
        class74.method643((byte) -121);
        class92.method785((byte) 123);
        class161.method1273(0);
        class293.method2087(100);
        class54.method506((byte) -122);
        class218.method1596(false);
        class298.method2104(-60);
        class326.method2284((byte) 40);
        class11.method79((byte) -96);
        class105.method884(-3);
        class202.method1497((byte) 114);
        class252.method1807((byte) -103);
        class154.method1216((byte) -111);
        class233.method1681((byte) 49);
        class310.method2206(false);
        class210.method1542((byte) -128);
        class255.method1821(true);
        class292.method2080(-113);
        class275.method1948(124);
        class121.method960(false);
        class215.method1576(0);
        class83.method723(-18605);
        class260.method1859(false);
        class240.method1724(1);
        class269.method1915((byte) 84);
        class322.method2267(25);
        class24.method211(arg0 - 12477);
        class79.method657(false);
        class232.method1677(arg0 - 17026);
        class276.method1953(arg0 ^ 0x80);
        class184.method1421(arg0 ^ 0xFFFFFF);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 2113)
    private final void method1795(int arg0) {
        field4471++;
        if (arg0 > -14) {
            field4466 = (class279) null;
        }
        boolean var2 = class255.field4552.method1378(5);
        if (!var2) {
            this.method1797((byte) -118);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V", line = 2135)
    private final void method1796(int arg0, int arg1) {
        field4472++;
        class99.field1849 = arg1;
        class255.field4552.field3204 = arg0;
        class53.field1143 = null;
        class261.field4657 = null;
        class255.field4552.field3201++;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 2147)
    public final void method673(byte arg0) {
        field4462++;
        if (class53.field1111 == 1000) {
            return;
        }
        boolean var2 = class124.method992(-19320);
        if (var2 && class204.field3634 && class80.field1537 != null) {
            class80.field1537.method742(true);
        }
        if ((class53.field1111 == 30 || class53.field1111 == 10) && (class43.field897 || class253.field4510 != 0L && class253.field4510 < class127.method1015(21504))) {
            class103.method867(class239.field4218, 7, class43.field897, class236.field4121, class20.method196(3));
        }
        if (arg0 > -113) {
            method1798((class8) null);
        }
        if (class120.field2159 == null) {
            Container var3;
            if (class120.field2159 != null) {
                var3 = class120.field2159;
            } else if (class5.field115 == null) {
                var3 = class110.field2022.field5418;
            } else {
                var3 = class5.field115;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class5.field115 == var3) {
                Insets var6 = class5.field115.getInsets();
                var5 -= var6.top + var6.bottom;
                var4 -= var6.left + var6.right;
            }
            if (class113.field2082 != var4 || class105.field1985 != var5) {
                if (class305.field5416.startsWith("mac")) {
                    class113.field2082 = var4;
                    class105.field1985 = var5;
                } else {
                    class154.method1217(-17234);
                }
                class253.field4510 = class127.method1015(21504) + 500L;
            }
        }
        if (class120.field2159 != null && !class149.field2727 && (class53.field1111 == 30 || class53.field1111 == 10)) {
            class103.method867(-1, -114, false, -1, class283.field5062);
        }
        boolean var7 = false;
        if (class52.field1097) {
            var7 = true;
            class52.field1097 = false;
        }
        if (var7) {
            class100.method848((byte) -82);
        }
        if (class97.field1824) {
            for (int var8 = 0; var8 < 100; var8++) {
                class71.field1398[var8] = true;
            }
        }
        if (class53.field1111 == 0) {
            class264.method1892(var7, 0, class243.field4309, (Color) null, class119.field2147);
        } else if (class53.field1111 == 5) {
            class320.method2254(2, class292.field5210, false);
        } else if (class53.field1111 == 10) {
            class248.method1779((byte) 127);
        } else if (class53.field1111 == 25 || class53.field1111 == 28) {
            if (class311.field5509 == 1) {
                if (class202.field3593 > class103.field1948) {
                    class103.field1948 = class202.field3593;
                }
                int var9 = (class103.field1948 - class202.field3593) * 50 / class103.field1948;
                class321.method2258(class115.method929(new class279[] { class200.field3575, class298.field5287, class191.method1447(5, var9), class115.field2104 }, (byte) 60), false, (byte) -78);
            } else if (class311.field5509 == 2) {
                if (class29.field693 < class12.field394) {
                    class29.field693 = class12.field394;
                }
                int var10 = (class29.field693 - class12.field394) * 50 / class29.field693 + 50;
                class321.method2258(class115.method929(new class279[] { class200.field3575, class298.field5287, class191.method1447(5, var10), class115.field2104 }, (byte) 60), false, (byte) -115);
            } else {
                class321.method2258(class200.field3575, false, (byte) -105);
            }
        } else if (class53.field1111 == 30) {
            class212.method1553(-2);
        } else if (class53.field1111 == 40) {
            class321.method2258(class115.method929(new class279[] { class211.field3704, class195.field3516, class207.field3672 }, (byte) 60), false, (byte) -125);
        }
        if (class97.field1824 && class53.field1111 != 0) {
            class97.method823();
            for (int var17 = 0; var17 < class14.field434; var17++) {
                class249.field4446[var17] = false;
            }
        } else if ((class53.field1111 == 30 || class53.field1111 == 10) && class157.field2885 == 0 && !var7) {
            try {
                Graphics var14 = class132.field2419.getGraphics();
                for (int var15 = 0; var15 < class14.field434; var15++) {
                    if (class249.field4446[var15]) {
                        class250.field4455.method543(class102.field1900[var15], class249.field4436[var15], class115.field2100[var15], var14, class191.field3434[var15], 27588);
                        class249.field4446[var15] = false;
                    }
                }
            } catch (Exception var18) {
                class132.field2419.repaint();
            }
        } else if (class53.field1111 != 0) {
            try {
                Graphics var11 = class132.field2419.getGraphics();
                class250.field4455.method541(var11, -23, 0, 0);
                for (int var12 = 0; var12 < class14.field434; var12++) {
                    class249.field4446[var12] = false;
                }
            } catch (Exception var19) {
                class132.field2419.repaint();
            }
        }
        if (class123.field2214) {
            class216.method1584(-109);
        }
        if (class39.field853 && class53.field1111 == 10 && class307.field5444 != -1) {
            class39.field853 = false;
            class54.method507(class110.field2022, -6);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 2384)
    public static final void main(String[] arg0) {
        field4473++;
        try {
            if (arg0.length != 4) {
                class20.method195("argument count", true);
            }
            int var1 = -1;
            class275.field4887 = Integer.parseInt(arg0[0]);
            class124.field2261 = 2;
            if (arg0[1].equals("live")) {
                class283.field5063 = 0;
            } else if (arg0[1].equals("rc")) {
                class283.field5063 = 1;
            } else if (arg0[1].equals("wip")) {
                class283.field5063 = 2;
            } else {
                class20.method195("modewhat", true);
            }
            class199.field3560 = false;
            try {
                byte[] var2 = arg0[2].getBytes("ISO-8859-1");
                var1 = class307.method2181((byte) 91, class194.method1457(0, var2.length, var2, false));
            } catch (Exception var6) {
            }
            if (var1 != -1) {
                class265.field4778 = var1;
            } else if (arg0[2].equals("english")) {
                class265.field4778 = 0;
            } else if (arg0[2].equals("german")) {
                class265.field4778 = 1;
            } else {
                class20.method195("language", true);
            }
            class5.method30(class265.field4778, (byte) 105);
            class200.field3571 = false;
            class304.field5396 = false;
            if (arg0[3].equals("game0")) {
                class214.field3764 = 0;
            } else if (arg0[3].equals("game1")) {
                class214.field3764 = 1;
            } else {
                class20.method195("game", true);
            }
            class278.field4915 = false;
            class159.field2894 = class60.field1265;
            class52.field1077 = 0;
            class32.field734 = 0;
            client var4 = new client();
            class124.field2252 = var4;
            var4.method663(class283.field5063 + 32, 0, 768, 1024, false, 529, 28, "runescape");
            class5.field115.setLocation(40, 40);
        } catch (Exception var7) {
            class94.method792(var7, (byte) -115, (String) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 2474)
    public final void init() {
        field4465++;
        if (!this.method675((byte) 5)) {
            return;
        }
        class275.field4887 = Integer.parseInt(this.getParameter("worldid"));
        class124.field2261 = Integer.parseInt(this.getParameter("modewhere"));
        if (class124.field2261 < 0 || class124.field2261 > 1) {
            class124.field2261 = 0;
        }
        class283.field5063 = Integer.parseInt(this.getParameter("modewhat"));
        if (class283.field5063 < 0 || class283.field5063 > 2) {
            class283.field5063 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class199.field3560 = true;
        } else {
            class199.field3560 = false;
        }
        try {
            class265.field4778 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class265.field4778 = 0;
        }
        class5.method30(class265.field4778, (byte) 105);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class200.field3571 = true;
        } else {
            class200.field3571 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class304.field5396 = true;
        } else {
            class304.field5396 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class214.field3764 = 1;
        } else {
            class214.field3764 = 0;
        }
        try {
            class52.field1077 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class52.field1077 = 0;
        }
        class159.field2894 = class169.field3059.method1972((byte) -103, this);
        if (class159.field2894 == null) {
            class159.field2894 = class60.field1265;
        }
        String var7 = this.getParameter("country");
        if (var7 != null) {
            try {
                class32.field734 = Integer.parseInt(var7);
            } catch (Exception var10) {
                class32.field734 = 0;
            }
        }
        String var9 = this.getParameter("haveie6");
        if (var9 != null && var9.equals("1")) {
            class278.field4915 = true;
        } else {
            class278.field4915 = false;
        }
        class124.field2252 = this;
        this.method668(1529, class283.field5063 + 32, (byte) 58, 503, 765);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 2598)
    private final void method1797(byte arg0) {
        field4468++;
        if (class255.field4552.field3201 > class79.field1516) {
            class191.field3436 = (class255.field4552.field3201 - 1) * 5 * 50;
            if (class191.field3436 > 3000) {
                class191.field3436 = 3000;
            }
            if (class311.field5512 == class260.field4621) {
                class311.field5512 = class86.field1616;
            } else {
                class311.field5512 = class260.field4621;
            }
            if (class255.field4552.field3201 >= 2 && class255.field4552.field3204 == 6) {
                this.method672(10, "js5connect_outofdate");
                class53.field1111 = 1000;
                return;
            }
            if (class255.field4552.field3201 >= 4 && class255.field4552.field3204 == -1) {
                this.method672(10, "js5crc");
                class53.field1111 = 1000;
                return;
            }
            if (class255.field4552.field3201 >= 4 && (class53.field1111 == 0 || class53.field1111 == 5)) {
                if (class255.field4552.field3204 == 7 || class255.field4552.field3204 == 9) {
                    this.method672(10, "js5connect_full");
                } else if (class255.field4552.field3204 > 0) {
                    this.method672(10, "js5connect");
                } else {
                    this.method672(10, "js5io");
                }
                class53.field1111 = 1000;
                return;
            }
        }
        class79.field1516 = class255.field4552.field3201;
        if (class191.field3436 > 0) {
            class191.field3436--;
            return;
        }
        try {
            if (class99.field1849 == 0) {
                class53.field1143 = class110.field2022.method2164(0, class274.field4876, class311.field5512);
                class99.field1849++;
            }
            if (class99.field1849 == 1) {
                if (class53.field1143.field3655 == 2) {
                    this.method1796(1000, 0);
                    return;
                }
                if (class53.field1143.field3655 == 1) {
                    class99.field1849++;
                }
            }
            if (class99.field1849 == 2) {
                class261.field4657 = new class280((Socket) class53.field1143.field3657, class110.field2022);
                class53 var2 = new class53(5);
                var2.method464(15, false);
                var2.method444((byte) 46, 529);
                class261.field4657.method2021(5, var2.field1168, 0, 3);
                class99.field1849++;
                class180.field3290 = class127.method1015(21504);
            }
            if (class99.field1849 == 3) {
                if (class53.field1111 == 0 || class53.field1111 == 5 || class261.field4657.method2023(91) > 0) {
                    int var3 = class261.field4657.method2022((byte) -112);
                    if (var3 != 0) {
                        this.method1796(var3, 0);
                        return;
                    }
                    class99.field1849++;
                } else if (class127.method1015(21504) - class180.field3290 > 30000L) {
                    this.method1796(1001, 0);
                    return;
                }
            }
            if (class99.field1849 == 4) {
                boolean var4 = class53.field1111 == 5 || class53.field1111 == 10 || class53.field1111 == 28;
                class255.field4552.method1383(class261.field4657, !var4, 15565);
                class99.field1849 = 0;
                class261.field4657 = null;
                class53.field1143 = null;
            }
            int var5 = -128 % ((54 - arg0) / 54);
        } catch (IOException var7) {
            this.method1796(1002, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lgf;)Lcc;", line = 2746)
    public static final class246 method1798(class8 arg0) {
        class246 var1 = (class246) class262.field4668.method610(((long) arg0.field299 << 32) + (long) arg0.field261, -1);
        return var1 == null ? arg0.field300 : var1;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lgf;)Lgf;", line = 2751)
    public static final class8 method1799(class8 arg0) {
        int var1 = method1798(arg0).method1758(-96);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class273.method1940(arg0.field324, 107);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lgf;)Z", line = 2788)
    public static final boolean method1800(class8 arg0) {
        if (class205.field3641) {
            if (method1798(arg0).field4372 != 0) {
                return false;
            }
            if (arg0.field201 == 0) {
                return false;
            }
        }
        return arg0.field277;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIZIII)V", line = 2833)
    public static final void method1801(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        if (arg5) {
            method1794((class8[]) null, 1, -50, -7, 99, 11, 37, 53);
        }
        field4469++;
        int var9 = arg1 - arg0;
        int var10 = arg8 - arg6;
        int var11 = (arg7 - arg4 << 16) / var10;
        int var12 = (arg2 - arg3 << 16) / var9;
        class78.method656(arg1, arg0, arg6, 0, arg4, var11, (byte) 113, 0, arg3, var12, arg8);
    }
}
