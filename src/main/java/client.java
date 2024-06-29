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
public class client extends class286 {

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "Z")
    public static boolean field1636 = false;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field1638 = 0;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "B")
    public static byte field1632 = 0;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Z")
    public static boolean field1648;

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 5)
    private final void method886(int arg0) {
        field1642++;
        for (class362.field5699 = arg0; class272.method1852((byte) -66) && class362.field5699 < 128; class362.field5699++) {
            class48.field647[class362.field5699] = class143.field1995;
            class97.field1283[class362.field5699] = class362.field5679;
        }
        class186.field2551++;
        if (class233.field3340 != -1) {
            class122.method884(class233.field3340, class163.field2314, 0, 0, 0, 0, arg0 - 57, class192.field2660);
        }
        class64.field801++;
        if (class47.field623) {
            int var2 = 2359807;
            label194: for (int var3 = 0; var3 < 32768; var3++) {
                class169 var4 = class251.field3688[var3];
                if (var4 != null) {
                    byte var5 = var4.field2345.field2233;
                    if ((var5 & 0x2) > 0 && var4.field4845 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var6 != 0 || var7 != 0) {
                            var4.field4860[0] = 1;
                            var4.field4842[0] = (var4.field4855 >> 7) + var6;
                            var4.field4936[0] = (var4.field4893 >> 7) + var7;
                            class231.field3312[class56.field724].method45(0, var4.field4893 >> 7, var4.method1699(~arg0), 3, false, var4.field4855 >> 7, var4.method1699(-1), false);
                            if (var4.field4842[0] >= 0 && var4.field4842[0] <= (104 - var4.method1699(-1)) && var4.field4936[0] >= 0 && var4.field4936[0] <= (104 - var4.method1699(~arg0)) && class231.field3312[class56.field724].method52(65536, var4.field4936[0], var4.field4893 >> 7, var4.field4842[0], var4.field4855 >> 7)) {
                                if (var4.method1699(-1) > 1) {
                                    for (int var8 = var4.field4842[0]; var8 < var4.field4842[0] + var4.method1699(-1); var8++) {
                                        for (int var9 = var4.field4936[0]; (var4.field4936[0] + var4.method1699(arg0 - 1)) > var9; var9++) {
                                            if ((class231.field3312[class56.field724].field89[var8][var9] & var2) != 0) {
                                                continue label194;
                                            }
                                        }
                                    }
                                }
                                var4.field4845 = 1;
                            }
                        }
                    }
                    class131.method1004(var4, (byte) -49);
                    class45.method318(123, var4);
                    class24.method160(-25431, var4);
                    class231.field3312[class56.field724].method44(false, false, var4.method1699(-1), var4.method1699(-1), var4.field4893 >> 7, -32566, var4.field4855 >> 7);
                }
            }
        }
        if (!class47.field623 && class299.field4362 == 0) {
            class122.method883(-4760);
        } else if (class217.field3067 == 0 && class318.field4688 == 0) {
            if (field1631 == 2) {
                class237.method1691(24594);
            } else {
                class148.method1139((byte) -58);
            }
            if ((class112.field1453 >> 7) < 14 || class112.field1453 >> 7 >= 90 || class248.field3606 >> 7 < 14 || (class248.field3606 >> 7) >= 90) {
                class94.method677(0);
            }
        }
        while (true) {
            class135 var10;
            class333 var11;
            class333 var12;
            do {
                var10 = (class135) class263.field3817.method411(false);
                if (var10 == null) {
                    while (true) {
                        class135 var13;
                        class333 var17;
                        class333 var18;
                        do {
                            var13 = (class135) class179.field2447.method411(false);
                            if (var13 == null) {
                                while (true) {
                                    class135 var14;
                                    class333 var15;
                                    class333 var16;
                                    do {
                                        var14 = (class135) class276.field3956.method411(false);
                                        if (var14 == null) {
                                            if (class33.field410 != null) {
                                                class227.method1636(-2);
                                            }
                                            if (class289.field4188 != null && class289.field4188.field2608 == 1) {
                                                if (class289.field4188.field2606 != null) {
                                                    class232.method1654(arg0 + 92, class126.field1686, class55.field711);
                                                }
                                                class289.field4188 = null;
                                                class55.field711 = false;
                                                class126.field1686 = null;
                                            }
                                            if ((class313.field4603 % 1500) == 0) {
                                                class268.method1830(-73);
                                            }
                                            return;
                                        }
                                        var15 = var14.field1831;
                                        if (var15.field5199 < 0) {
                                            break;
                                        }
                                        var16 = class89.method644(-97, var15.field5142);
                                    } while (var16 == null || var16.field5187 == null || var16.field5187.length <= var15.field5199 || var16.field5187[var15.field5199] != var15);
                                    class276.method1869(true, var14);
                                }
                            }
                            var17 = var13.field1831;
                            if (var17.field5199 < 0) {
                                break;
                            }
                            var18 = class89.method644(37, var17.field5142);
                        } while (var18 == null || var18.field5187 == null || var17.field5199 >= var18.field5187.length || var18.field5187[var17.field5199] != var17);
                        class276.method1869(true, var13);
                    }
                }
                var11 = var10.field1831;
                if (var11.field5199 < 0) {
                    break;
                }
                var12 = class89.method644(109, var11.field5142);
            } while (var12 == null || var12.field5187 == null || var11.field5199 >= var12.field5187.length || var12.field5187[var11.field5199] != var11);
            class276.method1869(true, var10);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V", line = 215)
    private final void method887(boolean arg0, int arg1) {
        class85.field1092.field47 = arg1;
        class251.field3691 = null;
        class85.field1092.field46++;
        class185.field2540 = 0;
        if (!arg0) {
            field1636 = true;
        }
        class119.field1554 = null;
        field1647++;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 231)
    public static final void method888(int arg0) {
        if (arg0 >= -104) {
            method891((class333) null);
        }
        class209.field2966++;
        class251.field3681.method1309(23, 218);
        field1644++;
        class251.field3681.method2049(-19780, 0L);
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 245)
    private final void method889(int arg0) {
        if (!class142.field1963) {
            label249: while (true) {
                do {
                    if (!class272.method1852((byte) -66)) {
                        break label249;
                    }
                } while (class362.field5679 != 's' && class362.field5679 != 'S');
                class142.field1963 = true;
            }
        }
        field1643++;
        if (class58.field736 == 0) {
            Runtime var26 = Runtime.getRuntime();
            int var27 = (int) ((var26.totalMemory() - var26.freeMemory()) / 1024L);
            long var28 = class6.method37(10828);
            if (class42.field526 == 0L) {
                class42.field526 = var28;
            }
            if (var27 > 16384 && var28 - class42.field526 < 5000L) {
                if (var28 - class180.field2468 > 1000L) {
                    System.gc();
                    class180.field2468 = var28;
                }
                class74.field984 = 5;
                class48.field645 = class212.field2993;
            } else {
                class74.field984 = 5;
                class48.field645 = class125.field1664;
                class58.field736 = 10;
            }
        } else if (class58.field736 == 10) {
            for (int var2 = 0; var2 < 4; var2++) {
                class231.field3312[var2] = new class8(104, 104);
            }
            class58.field736 = 30;
            class48.field645 = class181.field2472;
            class74.field984 = 10;
        } else if (arg0 == 0) {
            if (class58.field736 == 30) {
                if (class249.field3631 == null) {
                    class249.field3631 = new class288(class85.field1092, class139.field1914);
                }
                if (class249.field3631.method1972((byte) 70)) {
                    class96.field1249 = class209.method1539(true, (byte) -93, false, 0, true);
                    class340.field5313 = class209.method1539(true, (byte) -112, false, 1, true);
                    class3.field24 = class209.method1539(false, (byte) -127, true, 2, true);
                    class293.field4264 = class209.method1539(true, (byte) -119, false, 3, true);
                    class17.field213 = class209.method1539(true, (byte) -106, false, 4, true);
                    class5.field61 = class209.method1539(true, (byte) -78, true, 5, true);
                    class305.field4459 = class209.method1539(true, (byte) -45, true, 6, false);
                    class262.field3790 = class209.method1539(true, (byte) -100, false, 7, true);
                    class1.field7 = class209.method1539(true, (byte) -99, false, 8, true);
                    class143.field1998 = class209.method1539(true, (byte) -115, false, 9, true);
                    class27.field317 = class209.method1539(true, (byte) -65, false, 10, true);
                    class135.field1844 = class209.method1539(true, (byte) -52, false, 11, true);
                    class52.field692 = class209.method1539(true, (byte) -118, false, 12, true);
                    class283.field4033 = class209.method1539(true, (byte) -55, false, 13, true);
                    class72.field959 = class209.method1539(true, (byte) -65, false, 14, false);
                    class275.field3949 = class209.method1539(true, (byte) -72, false, 15, true);
                    class9.field103 = class209.method1539(true, (byte) -93, false, 16, true);
                    class35.field431 = class209.method1539(true, (byte) -64, false, 17, true);
                    class328.field4802 = class209.method1539(true, (byte) -116, false, 18, true);
                    class144.field2007 = class209.method1539(true, (byte) -104, false, 19, true);
                    class208.field2954 = class209.method1539(true, (byte) -123, false, 20, true);
                    class323.field4733 = class209.method1539(true, (byte) -116, false, 21, true);
                    class336.field5245 = class209.method1539(true, (byte) -79, false, 22, true);
                    class114.field1473 = class209.method1539(true, (byte) -128, true, 23, true);
                    class346.field5381 = class209.method1539(true, (byte) -80, false, 24, true);
                    class315.field4642 = class209.method1539(true, (byte) -58, false, 25, true);
                    class297.field4306 = class209.method1539(true, (byte) -92, true, 26, true);
                    class102.field1324 = class209.method1539(true, (byte) -119, false, 27, true);
                    class169.field2355 = class209.method1539(true, (byte) -56, true, 28, true);
                    class74.field984 = 15;
                    class48.field645 = class62.field779;
                    class58.field736 = 40;
                } else {
                    class74.field984 = 12;
                    class48.field645 = class80.field1019;
                }
            } else if (class58.field736 == 40) {
                int var3 = 0;
                for (int var4 = 0; var4 < 29; var4++) {
                    var3 += class116.field1513[var4].method1679((byte) 86) * class91.field1159[var4] / 100;
                }
                if (var3 == 100) {
                    class48.field645 = class206.field2868;
                    class74.field984 = 20;
                    class86.method625(class1.field7, 108);
                    class205.method1491(-2232, class1.field7);
                    class288.method1976(class1.field7, 0);
                    class58.field736 = 41;
                } else {
                    class74.field984 = 20;
                    if (var3 != 0) {
                        class48.field645 = class30.field338 + var3 + "%";
                    }
                }
            } else if (class58.field736 == 41) {
                if (class169.field2355.method1077(true)) {
                    this.method893(class169.field2355.method1060(1, true), 67);
                    class58.field736 = 45;
                    class48.field645 = class90.field1145;
                    class74.field984 = 25;
                } else {
                    class48.field645 = class106.field1380 + class169.field2355.method1062(-116) + "%";
                    class74.field984 = 25;
                }
            } else if (class58.field736 == 45) {
                class254.method1772(2, class103.field1343, 22050, (byte) -122);
                class163.field2312 = new class207();
                class163.field2312.method1527(128, (byte) -84, 9);
                class335.field5234 = class330.method2284(class26.field307, (byte) -125, 22050, class157.field2216, 0);
                class335.field5234.method2465(class163.field2312, 8);
                class184.method1340(class163.field2312, class275.field3949, class72.field959, false, class17.field213);
                class328.field4801 = class330.method2284(class26.field307, (byte) -126, 2048, class157.field2216, 1);
                class186.field2548 = new class325();
                class328.field4801.method2465(class186.field2548, arg0 + 8);
                class183.field2497 = new class280(22050, class85.field1091);
                class158.field2254 = class305.field4459.method1079(false, "scape main");
                class48.field645 = class145.field2023;
                class58.field736 = 50;
                class74.field984 = 30;
            } else if (class58.field736 == 50) {
                int var24 = class138.method1046(class283.field4033, class1.field7, -23185);
                int var25 = class182.method1332(23421);
                if (var24 >= var25) {
                    class48.field645 = class28.field325;
                    class58.field736 = 60;
                    class74.field984 = 35;
                } else {
                    class74.field984 = 35;
                    class48.field645 = class142.field1972 + var24 * 100 / var25 + "%";
                }
            } else if (class58.field736 == 60) {
                int var22 = class227.method1635(class1.field7, 0);
                int var23 = class336.method2343(false);
                if (var23 <= var22) {
                    class58.field736 = 65;
                    class74.field984 = 40;
                    class48.field645 = class204.field2836;
                } else {
                    class74.field984 = 40;
                    class48.field645 = class91.field1179 + var22 * 100 / var23 + "%";
                }
            } else if (class58.field736 == 65) {
                class178.method1312(class1.field7, class283.field4033, (byte) 116);
                class48.field645 = class106.field1378;
                class74.field984 = 45;
                class59.method445(5, (byte) 101);
                class58.field736 = 70;
            } else if (class58.field736 == 70) {
                class3.field24.method1077(true);
                byte var5 = 0;
                int var6 = var5 + class3.field24.method1062(-111);
                class9.field103.method1077(true);
                int var7 = var6 + class9.field103.method1062(arg0 ^ 0xFFFFFF87);
                class35.field431.method1077(true);
                int var8 = var7 + class35.field431.method1062(-118);
                class328.field4802.method1077(true);
                int var9 = var8 + class328.field4802.method1062(-110);
                class144.field2007.method1077(true);
                int var10 = var9 + class144.field2007.method1062(-124);
                class208.field2954.method1077(true);
                int var11 = var10 + class208.field2954.method1062(-122);
                class323.field4733.method1077(true);
                int var12 = var11 + class323.field4733.method1062(-113);
                class336.field5245.method1077(true);
                int var13 = var12 + class336.field5245.method1062(-114);
                class346.field5381.method1077(true);
                int var14 = var13 + class346.field5381.method1062(-112);
                class315.field4642.method1077(true);
                int var15 = var14 + class315.field4642.method1062(-117);
                class102.field1324.method1077(true);
                int var16 = var15 + class102.field1324.method1062(-123);
                if (var16 < 1100) {
                    class74.field984 = 50;
                    class48.field645 = class132.field1800 + var16 / 11 + "%";
                } else {
                    class59.method443(class3.field24, 40);
                    class356.method2476(class3.field24, 76);
                    class260.method1794(class3.field24, 2);
                    class66.method480(-12879, class262.field3790, class3.field24);
                    class326.method2251(arg0 ^ 0x43, class9.field103, true, class262.field3790);
                    class64.method467(class262.field3790, true, -9746, class328.field4802);
                    class239.method1696(class144.field2007, class293.field4263, -8659, true, class262.field3790);
                    class303.method2123((byte) -69, class3.field24);
                    class80.method565(class208.field2954, class340.field5313, class96.field1249, 31779);
                    class346.method2403((byte) -46, class3.field24);
                    class272.method1853(-1, class323.field4733, class262.field3790);
                    class210.method1543(class336.field5245, (byte) -94);
                    class159.method1217(class3.field24, 1024);
                    class80.method567(class1.field7, 5, class283.field4033, class293.field4264, class262.field3790);
                    class217.method1578(-91, class3.field24);
                    class106.method752(-12014, class35.field431);
                    class42.method308((byte) -40, class315.field4642, new class356(), class346.field5381);
                    class343.method2387(class346.field5381, -26193, class315.field4642);
                    class221.method1611(class3.field24, (byte) -102);
                    class262.method1809(class3.field24, (byte) 117);
                    class224.method1626(2, class3.field24);
                    class327.method2261(class3.field24, arg0, class1.field7);
                    class289.method1980(-8, class1.field7, class3.field24);
                    class115.method845((byte) -11, class3.field24, class1.field7);
                    class74.field984 = 50;
                    class48.field645 = class213.field3010;
                    class352.method2451(-123);
                    class58.field736 = 80;
                }
            } else if (class58.field736 == 80) {
                int var17 = class33.method214(class1.field7, -89);
                int var18 = class3.method13(125);
                if (var17 >= var18) {
                    class286.method1951(class1.field7, (byte) 64);
                    class48.field645 = class146.field2040;
                    class74.field984 = 60;
                    class58.field736 = 90;
                } else {
                    class48.field645 = class121.field1592 + var17 * 100 / var18 + "%";
                    class74.field984 = 60;
                }
            } else if (class58.field736 == 90) {
                if (class297.field4306.method1077(true)) {
                    class138 var21 = new class138(class143.field1998, class297.field4306, class1.field7, 20, !class27.field313);
                    class350.method2434(var21);
                    if (class254.field3713 == 1) {
                        class350.method2422(0.9F);
                    }
                    if (class254.field3713 == 2) {
                        class350.method2422(0.8F);
                    }
                    if (class254.field3713 == 3) {
                        class350.method2422(0.7F);
                    }
                    if (class254.field3713 == 4) {
                        class350.method2422(0.6F);
                    }
                    class74.field984 = 70;
                    class48.field645 = class23.field252;
                    class58.field736 = 100;
                } else {
                    class48.field645 = class167.field2330 + class297.field4306.method1062(-112) + "%";
                    class74.field984 = 70;
                }
            } else if (class58.field736 == 100) {
                if (class336.method2348(0, class1.field7)) {
                    class58.field736 = 110;
                }
            } else if (class58.field736 == 110) {
                class195.field2699 = new class212();
                class157.field2216.method494(10, true, class195.field2699);
                class74.field984 = 75;
                class48.field645 = class316.field4654;
                class58.field736 = 120;
            } else if (class58.field736 == 120) {
                if (class27.field317.method1057("huffman", (byte) -99, "")) {
                    class209 var20 = new class209(class27.field317.method1075(95, "", "huffman"));
                    class109.method777(-96, var20);
                    class48.field645 = class133.field1814;
                    class74.field984 = 80;
                    class58.field736 = 130;
                } else {
                    class48.field645 = class3.field25 + "0%";
                    class74.field984 = 80;
                }
            } else if (class58.field736 == 130) {
                if (!class293.field4264.method1077(true)) {
                    class48.field645 = class7.field65 + class293.field4264.method1062(-107) * 3 / 4 + "%";
                    class74.field984 = 85;
                } else if (!class52.field692.method1077(true)) {
                    class48.field645 = class7.field65 + (class52.field692.method1062(-107) / 10 + 75) + "%";
                    class74.field984 = 85;
                } else if (!class283.field4033.method1077(true)) {
                    class48.field645 = class7.field65 + (class283.field4033.method1062(-110) / 20 + 85) + "%";
                    class74.field984 = 85;
                } else if (class114.field1473.method1082("details", 2)) {
                    class38.method258(class114.field1473);
                    class187.method1352(class102.field1324);
                    class324.method2242(class262.field3790);
                    class58.field736 = 135;
                    class74.field984 = 95;
                    class48.field645 = class109.field1419;
                } else {
                    class48.field645 = class7.field65 + ((class114.field1473.method1059("details", (byte) -11) / 10) + 90) + "%";
                    class74.field984 = 85;
                }
            } else if (class58.field736 == 135) {
                int var19 = class308.method2150(-44);
                if (var19 == -1) {
                    class48.field645 = class9.field104;
                    class74.field984 = 95;
                } else if (var19 == 7 || var19 == 9) {
                    this.method1954((byte) -21, "worldlistfull");
                    class59.method445(1000, (byte) 119);
                } else if (class17.field209) {
                    class74.field984 = 96;
                    class58.field736 = 140;
                    class48.field645 = class122.field1599;
                } else {
                    this.method1954((byte) -21, "worldlistio_" + var19);
                    class59.method445(1000, (byte) 79);
                }
            } else if (class58.field736 == 140) {
                class286.field4080 = class293.field4264.method1079(false, "loginscreen");
                class5.field61.method1073(false, true, (byte) -20);
                class305.field4459.method1073(true, true, (byte) -20);
                class1.field7.method1073(true, true, (byte) -20);
                class283.field4033.method1073(true, true, (byte) -20);
                class27.field317.method1073(true, true, (byte) -20);
                class293.field4264.method1073(true, true, (byte) -20);
                class13.field155 = true;
                class58.field736 = 150;
                class48.field645 = class3.field33;
                class74.field984 = 97;
            } else if (class58.field736 == 150) {
                class57.method433();
                if (class142.field1963) {
                    class118.field1543 = 0;
                    class315.field4647 = 0;
                    class24.field266 = 0;
                    class58.field745 = 0;
                }
                class142.field1963 = true;
                class122.method879(-25299, class157.field2216);
                class158.method1216(false, -102, class118.field1543, -1, -1);
                class74.field984 = 100;
                class48.field645 = class196.field2711;
                class58.field736 = 160;
            } else if (class58.field736 == 160) {
                class249.method1742(true, 2);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 774)
    public final void method890(byte arg0) {
        field1629++;
        if (class47.field623) {
            class47.method362();
        }
        if (class117.field1519 != null) {
            class274.method1860(class157.field2216, class117.field1519, true);
            class117.field1519 = null;
        }
        if (class195.field2699 != null) {
            class195.field2699.field3000 = false;
        }
        class195.field2699 = null;
        if (class265.field3848 != null) {
            class265.field3848.method526(arg0 ^ 0xFFFFB5B1);
            class265.field3848 = null;
        }
        class100.method717((byte) -110, class26.field307);
        class143.method1118(class26.field307, 66);
        if (class270.field3877 != null) {
            class270.field3877.method1826(class26.field307, (byte) 62);
        }
        class100.method718(false);
        class13.method93(-128);
        if (arg0 != 32) {
            method896((class333) null);
        }
        class270.field3877 = null;
        if (class335.field5234 != null) {
            class335.field5234.method2462(14680);
        }
        if (class328.field4801 != null) {
            class328.field4801.method2462(14680);
        }
        class85.field1092.method19(-105);
        class139.field1914.method796(true);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lwf;)Lon;", line = 824)
    public static final class142 method891(class333 arg0) {
        class142 var1 = (class142) class227.field3259.method2279(((long) arg0.field5109 << 32) + (long) arg0.field5199, -125);
        return var1 == null ? arg0.field5040 : var1;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 829)
    public final void method892(byte arg0) {
        class135.method1023(false);
        field1645++;
        class139.field1914 = new class112();
        class85.field1092 = new class3();
        if (class219.field3137 != 0) {
            class194.field2685 = new byte[50][];
        }
        class261.method1795(class157.field2216, -7134);
        if (class145.field2021 == 0) {
            class167.field2331 = this.getCodeBase().getHost();
            class329.field4822 = 43594;
            class183.field2496 = 443;
        } else if (class145.field2021 == 1) {
            class167.field2331 = this.getCodeBase().getHost();
            class183.field2496 = class193.field2669 + 50000;
            class329.field4822 = class193.field2669 + 40000;
        } else if (class145.field2021 == 2) {
            class183.field2496 = class193.field2669 + 50000;
            class329.field4822 = class193.field2669 + 40000;
            class167.field2331 = "127.0.0.1";
        }
        class310.field4557 = class144.field2011 = class322.field4732 = class213.field3009 = new short[256];
        if (class69.field871 == 3 && class145.field2021 != 2) {
            class84.field1085 = class193.field2669;
        }
        if (class299.field4362 == 1) {
            class40.field492 = class94.field1218;
            class225.field3240 = class106.field1382;
            class15.field173 = class201.field2816;
            class41.field514 = 16777215;
            class41.field516 = 0;
            class226.field3257 = true;
            class17.field211 = class311.field4575;
        } else {
            class17.field211 = class210.field2981;
            class225.field3240 = class183.field2492;
            class40.field492 = class61.field767;
            class15.field173 = class273.field3908;
        }
        class170.field2360 = class329.field4822;
        class331.field4941 = class183.field2496;
        class167.field2336 = class167.field2331;
        int var2 = 52 / ((arg0 + 31) / 55);
        class253.field3695 = class329.field4822;
        class238.field3441 = class253.field3695;
        class198.method1456(24739);
        class357.method2477(30, class26.field307);
        class143.method1110((byte) -87, class26.field307);
        class270.field3877 = class224.method1625(-1999250068);
        if (class270.field3877 != null) {
            class270.field3877.method1827(class26.field307, true);
        }
        class235.field3371 = class69.field871;
        try {
            if (class157.field2216.field879 != null) {
                class287.field4154 = new class13(class157.field2216.field879, 5200, 0);
                for (int var3 = 0; var3 < 29; var3++) {
                    class283.field4039[var3] = new class13(class157.field2216.field891[var3], 6000, 0);
                }
                class217.field3071 = new class13(class157.field2216.field872, 6000, 0);
                class192.field2658 = new class179(255, class287.field4154, class217.field3071, 500000);
                class134.field1825 = new class13(class157.field2216.field880, 24, 0);
                class157.field2216.field872 = null;
                class157.field2216.field891 = null;
                class157.field2216.field879 = null;
                class157.field2216.field880 = null;
            }
        } catch (IOException var5) {
            class134.field1825 = null;
            class217.field3071 = null;
            class192.field2658 = null;
            class287.field4154 = null;
        }
        if (class145.field2021 != 0) {
            class234.field3352 = true;
        }
        if (class299.field4362 == 0) {
            class137.field1876 = class330.field4829;
        } else if (class299.field4362 == 1) {
            class137.field1876 = class27.field312;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V", line = 956)
    private final void method893(byte[] arg0, int arg1) {
        if (arg1 < 31) {
            field1636 = true;
        }
        class299 var3 = new class299(arg0);
        while (true) {
            int var4 = var3.method2096((byte) -122);
            if (var4 == 0) {
                field1637++;
                return;
            }
            if (var4 == 1) {
                int[] var5 = class196.field2708 = new int[6];
                var5[0] = var3.method2083((byte) -35);
                var5[1] = var3.method2083((byte) -114);
                var5[2] = var3.method2083((byte) -20);
                var5[3] = var3.method2083((byte) -91);
                var5[4] = var3.method2083((byte) -23);
                var5[5] = var3.method2083((byte) -28);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 1006)
    private final void method894(byte arg0) {
        boolean var2 = class85.field1092.method26(-27018);
        if (!var2) {
            this.method895((byte) 55);
        }
        if (arg0 < -19) {
            field1635++;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 1021)
    private final void method895(byte arg0) {
        field1633++;
        if (class85.field1092.field46 > class253.field3693) {
            class299.field4363 = (class85.field1092.field46 * 50 - 50) * 5;
            if (class299.field4363 > 3000) {
                class299.field4363 = 3000;
            }
            if (class238.field3441 == class170.field2360) {
                class238.field3441 = class331.field4941;
            } else {
                class238.field3441 = class170.field2360;
            }
            if (class85.field1092.field46 >= 2 && class85.field1092.field47 == 6) {
                this.method1954((byte) -21, "js5connect_outofdate");
                class316.field4661 = 1000;
                return;
            }
            if (class85.field1092.field46 >= 4 && class85.field1092.field47 == -1) {
                this.method1954((byte) -21, "js5crc");
                class316.field4661 = 1000;
                return;
            }
            if (class85.field1092.field46 >= 4 && (class316.field4661 == 0 || class316.field4661 == 5)) {
                if (class85.field1092.field47 == 7 || class85.field1092.field47 == 9) {
                    this.method1954((byte) -21, "js5connect_full");
                } else if (class85.field1092.field47 <= 0) {
                    this.method1954((byte) -21, "js5io");
                } else {
                    this.method1954((byte) -21, "js5connect");
                }
                class316.field4661 = 1000;
                return;
            }
        }
        class253.field3693 = class85.field1092.field46;
        if (class299.field4363 > 0) {
            class299.field4363--;
            return;
        }
        try {
            if (class185.field2540 == 0) {
                class119.field1554 = class157.field2216.method505(19, class167.field2336, class238.field3441);
                class185.field2540++;
            }
            if (class185.field2540 == 1) {
                if (class119.field1554.field2608 == 2) {
                    this.method887(true, 1000);
                    return;
                }
                if (class119.field1554.field2608 == 1) {
                    class185.field2540++;
                }
            }
            if (arg0 != 55) {
                field1631 = -95;
            }
            if (class185.field2540 == 2) {
                class251.field3691 = new class71((Socket) class119.field1554.field2606, class157.field2216);
                class299 var2 = new class299(5);
                var2.method2048(15, 93);
                var2.method2084(true, 550);
                class251.field3691.method530(0, var2.field4350, 5, 30000);
                class185.field2540++;
                class33.field414 = class6.method37(arg0 + 10773);
            }
            if (class185.field2540 == 3) {
                if (class316.field4661 == 0 || class316.field4661 == 5 || class251.field3691.method524((byte) 96) > 0) {
                    int var3 = class251.field3691.method528(true);
                    if (var3 != 0) {
                        this.method887(true, var3);
                        return;
                    }
                    class185.field2540++;
                } else if ((class6.method37(10828) - class33.field414) > 30000L) {
                    this.method887(true, 1001);
                    return;
                }
            }
            if (class185.field2540 == 4) {
                boolean var4 = class316.field4661 == 5 || class316.field4661 == 10 || class316.field4661 == 28;
                class85.field1092.method16(101, class251.field3691, !var4);
                class119.field1554 = null;
                class185.field2540 = 0;
                class251.field3691 = null;
            }
        } catch (IOException var6) {
            this.method887(true, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lwf;)Lwf;", line = 1169)
    public static final class333 method896(class333 arg0) {
        int var1 = method891(arg0).method1098((byte) 45);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class89.method644(-128, arg0.field5142);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 1198)
    public final void method897(byte arg0) {
        field1641++;
        class187.method1358();
        class245.method1725(-20507);
        class149.method1143(-1);
        class38.method264();
        class310.method2161(false);
        class10.method65((byte) -97);
        class286.method1952(43);
        class47.method359();
        class265.method1823(-66);
        class160.method1225(84167136);
        class212.method1552((byte) -59);
        class234.method1666(255);
        class299.method2041((byte) 124);
        class71.method521(14420);
        class3.method14(-29587);
        class112.method792(31425);
        class288.method1974((byte) -58);
        class236.method1680((byte) -82);
        class13.method98((byte) 35);
        class179.method1318(255);
        class327.method2260(114);
        class169.method1252(2980);
        class177.method1307((byte) 95);
        class8.method48(4624);
        class333.method2331(-107);
        class181.method1329(true);
        class158.method1214(16);
        class315.method2180(11170);
        class283.method1928(-31470);
        class64.method466(1);
        class207.method1529(16990);
        class280.method1890(false);
        class125.method921(-22374);
        class314.method2179(1);
        class331.method2297(-70);
        class119.method871(14888);
        class146.method1134((byte) -76);
        class157.method1201(true);
        class74.method543(-11);
        class142.method1099(1023);
        class56.method427((byte) 59);
        class26.method175(71);
        class52.method402(2);
        class5.method35((byte) 77);
        class261.method1800((byte) -49);
        class274.method1859(-23191);
        class134.method1019((byte) 116);
        class165.method1237(-7103);
        class139.method1051(-1);
        class92.method665(0);
        class306.method2144(104);
        class238.method1694(-78);
        class35.method221(true);
        class101.method720(-16553);
        class170.method1256((byte) -103);
        class46.method334();
        class279.method1883(-66);
        class253.method1768((byte) 104);
        class254.method1769(-70);
        class172.method1266(-127);
        class171.method1261(1);
        class217.method1579(false);
        class219.method1595(20259);
        class215.method1568(-2366);
        class41.method299();
        class193.method1400(64);
        class197.method1428();
        class276.method1870(true);
        class128.method945();
        class362.method2530(2);
        class332.method2307();
        class312.method2166(-123);
        class257.method1786(1);
        class82.method604((byte) 54);
        class298.method2035();
        class349.method2420();
        class357.method2482((byte) -78);
        class240.method1703((byte) 25);
        class277.method1871(27440);
        class145.method1133(true);
        class281.method1912();
        class75.method546(212098599);
        class122.method882(false);
        class285.method1942();
        class40.method288(1970740129);
        class275.method1864(-104);
        class340.method2364(81);
        class352.method2449(-28811);
        class295.method2018();
        class144.method1127((byte) -128);
        class287.method1970((byte) -41);
        class175.method1286((byte) 126);
        class229.method1642(true);
        class88.method637(false);
        class89.method645(false);
        class37.method243();
        class85.method622((byte) -106);
        class109.method776((byte) 91);
        class321.method2218(-1);
        class213.method1557(88);
        class143.method1112(-51);
        class216.method1572((byte) 16);
        class221.method1609(126);
        class94.method679((byte) -110);
        class25.method163(0);
        class304.method2124(50);
        class319.method2199(26683);
        class318.method2198(-2322);
        class91.method662((byte) -63);
        class15.method110(0);
        class201.method1474(true);
        class324.method2240();
        class249.method1745(0);
        class117.method863(true);
        class356.method2475((byte) 124);
        class317.method2191(32768);
        class338.method2355(-5868);
        class108.method767();
        class346.method2399((byte) 56);
        class355.method2469(0);
        class339.method2361((byte) -93);
        class204.method1483(-23239);
        class23.method159(0);
        class138.method1049((byte) 65);
        class222.method1616((byte) -10);
        class9.method60((byte) -104);
        class255.method1776(51);
        class50.method397();
        class137.method1033(-104);
        class350.method2442();
        class208.method1536((byte) -54);
        class159.method1218(-128);
        class326.method2252((byte) 12);
        class196.method1413(-33);
        class282.method1920((byte) -118);
        class126.method936(false);
        class57.method428();
        class80.method563((byte) -64);
        class98.method703();
        class102.method723((byte) 80);
        class154.method1190(5);
        class61.method451((byte) -128);
        class271.method1845(-63361369);
        class135.method1024((byte) -111);
        class20.method131(37);
        class260.method1791((byte) -54);
        class70.method517();
        class294.method2012(8856);
        class231.method1647((byte) 20);
        class66.method482(10262);
        class24.method161(30900);
        class183.method1337((byte) -91);
        class104.method737(0);
        class244.method1723();
        class345.method2395(5);
        class341.method2373((byte) 93);
        class311.method2163(-80);
        class220.method1604();
        class22.method146();
        class151.method1163();
        class2.method8();
        class49.method387((byte) -123);
        class180.method1325((byte) 73);
        class353.method2453(0);
        class320.method2206();
        class129.method990();
        class358.method2492();
        class323.method2232(17616);
        class289.method1981(1);
        class99.method710((byte) 111);
        if (arg0 < 85) {
            return;
        }
        class132.method1011(1);
        class42.method304(120);
        class223.method1623((byte) 78);
        class96.method694(0);
        class195.method1409((byte) -97);
        class243.method1720();
        class62.method458(34);
        class124.method918(true);
        class14.method104((byte) 121);
        class359.method2493((byte) 108);
        class348.method2418(13);
        class347.method2413(-89);
        class258.method1789(-23477);
        class133.method1016(28072);
        class156.method1198(8);
        class291.method1992(-1);
        class58.method439((byte) 127);
        class121.method873(0);
        class27.method180(-61);
        class7.method39(0);
        class174.method1278();
        class263.method1814((byte) 43);
        class83.method616((byte) -124);
        class1.method1(128);
        class45.method321(-1);
        class100.method714((byte) 84);
        class17.method122(30000);
        class182.method1334(-124);
        class342.method2381();
        class308.method2152(12345678);
        class227.method1634(0);
        class44.method311(-18);
        class106.method750((byte) -58);
        class84.method619(118);
        class4.method30();
        class150.method1150();
        class29.method186(58);
        class28.method182(115);
        class303.method2122(100);
        class48.method384(-9077);
        class155.method1192();
        class228.method1639();
        class336.method2350((byte) -27);
        class273.method1858(-22938);
        class21.method133();
        class16.method119(false);
        class250.method1756();
        class36.method225();
        class115.method843(26213);
        class214.method1564((byte) -128);
        class72.method538(0);
        class199.method1458(-126);
        class316.method2186(126);
        class360.method2504(125);
        class55.method422(-3237);
        class114.method840((byte) -84);
        class302.method2119(1);
        class198.method1450(23086);
        class103.method732((byte) 122);
        class292.method2004(2061936524);
        class161.method1227((byte) -102);
        class241.method1707();
        class242.method1717(0);
        class178.method1315((byte) -64);
        class293.method2008(0);
        class251.method1763(-129);
        class296.method2026(-1);
        class95.method691(false);
        class185.method1343((byte) 89);
        class300.method2106(1);
        class33.method210(128);
        class131.method1007((byte) -26);
        class235.method1671(-108);
        class130.method1001(23665);
        class184.method1341(115);
        class335.method2337(0);
        class225.method1628(false);
        class167.method1246(108);
        class237.method1692(-6473);
        class30.method194(55);
        class194.method1402(0);
        class262.method1808(12288);
        class190.method1379((byte) 113);
        class186.method1347((byte) -98);
        class297.method2029(false);
        class343.method2386((byte) -14);
        class218.method1580(8);
        class305.method2134((byte) 27);
        class210.method1548((byte) -39);
        class224.method1627(18253);
        class330.method2287((byte) -98);
        class191.method1388(-4000);
        class90.method650(true);
        class268.method1835(1);
        class328.method2269(true);
        class67.method487(0);
        class192.method1395(-23112);
        class118.method865(true);
        class270.method1842(1);
        class116.method850(-9465);
        class272.method1854(-1);
        class93.method671((byte) 56);
        class233.method1660(0);
        class322.method2227(-95);
        class163.method1232((byte) -96);
        class173.method1272(-4112);
        class211.method1549(0);
        class248.method1735(7581);
        class59.method441(0);
        class226.method1631(55);
        class344.method2390(false);
        class247.method1734(-109);
        class65.method469(true);
        class206.method1495(-3909);
        class97.method699(6530);
        class351.method2448(19442);
        class313.method2168(-1739218740);
        class284.method1930((byte) -34);
        class176.method1293(-1);
        class264.method1816((byte) 116);
        if (class286.field4108) {
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 1500)
    public final void init() {
        field1628++;
        if (!this.method1955(-1)) {
            return;
        }
        class193.field2669 = Integer.parseInt(this.getParameter("worldid"));
        class145.field2021 = Integer.parseInt(this.getParameter("modewhere"));
        if (class145.field2021 < 0 || class145.field2021 > 1) {
            class145.field2021 = 0;
        }
        class219.field3137 = Integer.parseInt(this.getParameter("modewhat"));
        if (class219.field3137 < 0 || class219.field3137 > 2) {
            class219.field3137 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class16.field203 = true;
        } else {
            class16.field203 = false;
        }
        try {
            class306.field4473 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class306.field4473 = 0;
        }
        class251.method1764(class306.field4473, false);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class195.field2698 = true;
        } else {
            class195.field2698 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class49.field658 = true;
        } else {
            class49.field658 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class299.field4362 = 1;
        } else {
            class299.field4362 = 0;
        }
        try {
            class185.field2522 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class185.field2522 = 0;
        }
        class194.field2690 = this.getParameter("settings");
        if (class194.field2690 == null) {
            class194.field2690 = "";
        }
        String var7 = this.getParameter("country");
        if (var7 != null) {
            try {
                class26.field302 = Integer.parseInt(var7);
            } catch (Exception var10) {
                class26.field302 = 0;
            }
        }
        String var9 = this.getParameter("haveie6");
        if (var9 != null && var9.equals("1")) {
            class179.field2455 = true;
        } else {
            class179.field2455 = false;
        }
        class277.field3969 = this;
        this.method1959(1550, class219.field3137 + 32, -23093, 503, 765);
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 1583)
    public static final void main(String[] arg0) {
        field1639++;
        try {
            if (arg0.length != 4) {
                class341.method2374(50, "argument count");
            }
            class193.field2669 = Integer.parseInt(arg0[0]);
            class145.field2021 = 2;
            if (arg0[1].equals("live")) {
                class219.field3137 = 0;
            } else if (arg0[1].equals("rc")) {
                class219.field3137 = 1;
            } else if (arg0[1].equals("wip")) {
                class219.field3137 = 2;
            } else {
                class341.method2374(50, "modewhat");
            }
            class16.field203 = false;
            class306.field4473 = class344.method2388(arg0[2], false);
            if (class306.field4473 == -1) {
                if (arg0[2].equals("english")) {
                    class306.field4473 = 0;
                } else if (arg0[2].equals("german")) {
                    class306.field4473 = 1;
                } else {
                    class341.method2374(50, "language");
                }
            }
            class251.method1764(class306.field4473, false);
            class49.field658 = false;
            class195.field2698 = false;
            if (arg0[3].equals("game0")) {
                class299.field4362 = 0;
            } else if (arg0[3].equals("game1")) {
                class299.field4362 = 1;
            } else {
                class341.method2374(50, "game");
            }
            class194.field2690 = "";
            class179.field2455 = false;
            class26.field302 = 0;
            class185.field2522 = 0;
            client var1 = new client();
            class277.field3969 = var1;
            var1.method1960(class219.field3137 + 32, -9412, class299.field4362 == 1 ? "mechscape" : "runescape", 550, false, 29, 768, 1024);
            class288.field4173.setLocation(40, 40);
        } catch (Exception var3) {
            class347.method2409(var3, 3924, (String) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lwf;)Z", line = 1655)
    public static final boolean method898(class333 arg0) {
        if (class40.field503) {
            if (method891(arg0).field1981 != 0) {
                return false;
            }
            if (arg0.field5105 == 0) {
                return false;
            }
        }
        return arg0.field5158;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 1669)
    public final void method899(int arg0) {
        field1634++;
        if (class316.field4661 == 1000) {
            return;
        }
        int var2 = -70 % ((arg0 + 33) / 60);
        long var3 = class91.method661(30542) / 1000000L - class336.field5257;
        class336.field5257 = class91.method661(30542) / 1000000L;
        boolean var5 = class192.method1394((byte) 127);
        if (var5 && class297.field4314 && class335.field5234 != null) {
            class335.field5234.method2466((byte) -42);
        }
        if ((class316.field4661 == 30 || class316.field4661 == 10) && (class132.field1796 || class159.field2264 != 0L && class159.field2264 < class6.method37(10828))) {
            class158.method1216(class132.field1796, -87, class33.method213(-124), class330.field4838, class214.field3032);
        }
        if (class117.field1519 == null) {
            Container var6;
            if (class117.field1519 != null) {
                var6 = class117.field1519;
            } else if (class288.field4173 == null) {
                var6 = class157.field2216.field883;
            } else {
                var6 = class288.field4173;
            }
            int var7 = var6.getSize().width;
            int var8 = var6.getSize().height;
            if (class288.field4173 == var6) {
                Insets var9 = class288.field4173.getInsets();
                var7 -= var9.left + var9.right;
                var8 -= var9.top + var9.bottom;
            }
            if (class95.field1246 != var7 || class125.field1665 != var8) {
                if (class69.field882.startsWith("mac")) {
                    class95.field1246 = var7;
                    class125.field1665 = var8;
                } else {
                    class135.method1023(false);
                }
                class159.field2264 = class6.method37(10828) + 500L;
            }
        }
        if (class117.field1519 != null && !class344.field5344 && (class316.field4661 == 30 || class316.field4661 == 10)) {
            class158.method1216(false, -68, class118.field1543, -1, -1);
        }
        boolean var10 = false;
        if (class116.field1500) {
            var10 = true;
            class116.field1500 = false;
        }
        if (var10) {
            class186.method1349(-30965);
        }
        if (class47.field623) {
            for (int var11 = 0; var11 < 100; var11++) {
                class229.field3276[var11] = true;
            }
        }
        if (class316.field4661 == 0) {
            class62.method455((Color) null, var10, false, class74.field984, class48.field645);
        } else if (class316.field4661 == 5) {
            class94.method686(false, class186.field2554, false);
        } else if (class316.field4661 == 10) {
            class133.method1015(7878);
        } else if (class316.field4661 == 25 || class316.field4661 == 28) {
            if (class191.field2648 == 1) {
                if (class152.field2137 > class338.field5267) {
                    class338.field5267 = class152.field2137;
                }
                int var12 = (class338.field5267 - class152.field2137) * 50 / class338.field5267;
                class190.method1383((byte) -105, class207.field2885 + "<br>(" + var12 + "%)", false);
            } else if (class191.field2648 == 2) {
                if (class355.field5564 > class225.field3243) {
                    class225.field3243 = class355.field5564;
                }
                int var13 = (class225.field3243 - class355.field5564) * 50 / class225.field3243 + 50;
                class190.method1383((byte) -85, class207.field2885 + "<br>(" + var13 + "%)", false);
            } else {
                class190.method1383((byte) -98, class207.field2885, false);
            }
        } else if (class316.field4661 == 30) {
            class280.method1887(var3, (byte) 127);
        } else if (class316.field4661 == 40) {
            class190.method1383((byte) -101, class253.field3697 + "<br>" + class161.field2298, false);
        }
        if (class47.field623 && class316.field4661 != 0) {
            class47.method379();
            for (int var20 = 0; var20 < class345.field5370; var20++) {
                class185.field2520[var20] = false;
            }
        } else if ((class316.field4661 == 30 || class316.field4661 == 10) && class159.field2259 == 0 && !var10) {
            try {
                Graphics var17 = class26.field307.getGraphics();
                for (int var18 = 0; var18 < class345.field5370; var18++) {
                    if (class185.field2520[var18]) {
                        class283.field4035.method316(true, class65.field826[var18], class300.field4414[var18], class322.field4728[var18], var17, class64.field802[var18]);
                        class185.field2520[var18] = false;
                    }
                }
            } catch (Exception var21) {
                class26.field307.repaint();
            }
        } else if (class316.field4661 != 0) {
            try {
                Graphics var14 = class26.field307.getGraphics();
                class283.field4035.method320(0, var14, (byte) -124, 0);
                for (int var15 = 0; var15 < class345.field5370; var15++) {
                    class185.field2520[var15] = false;
                }
            } catch (Exception var22) {
                class26.field307.repaint();
            }
        }
        if (class13.field155) {
            class304.method2126((byte) 23);
        }
        if (class142.field1963 && class316.field4661 == 10 && class233.field3340 != -1) {
            class142.field1963 = false;
            class122.method879(-25299, class157.field2216);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V", line = 1890)
    public final void method900(boolean arg0) {
        field1646++;
        if (class316.field4661 == 1000) {
            return;
        }
        class313.field4603++;
        if (class313.field4603 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class229.field3289 = var2.get(11) * 600 + (var2.get(12) * 10) + var2.get(13) / 6;
            class193.field2670.setSeed((long) class229.field3289);
        }
        this.method894((byte) -107);
        if (class249.field3631 != null) {
            class249.field3631.method1971(true);
        }
        class23.method152(123);
        class323.method2235(arg0);
        class104.method736(-25078);
        class100.method716(-1);
        if (class47.field623) {
            class298.method2036();
        }
        if (class270.field3877 != null) {
            int var3 = class270.field3877.method1825((byte) 91);
            class152.field2136 = var3;
        }
        if (class316.field4661 == 0) {
            this.method889(0);
            class233.method1658((byte) 53);
        } else if (class316.field4661 == 5) {
            this.method889(0);
            class233.method1658((byte) 53);
        } else if (class316.field4661 == 25 || class316.field4661 == 28) {
            class354.method2461(-6);
        }
        if (class316.field4661 == 10) {
            this.method886(0);
            class322.method2229((byte) -126);
            class71.method523(22773);
            class194.method1407((byte) 57);
        } else if (class316.field4661 == 30) {
            class115.method847(-79);
        } else if (class316.field4661 == 40) {
            class194.method1407((byte) 57);
            if (class49.field654 != -3) {
                if (class49.field654 == 15) {
                    class65.method477(0);
                } else if (class49.field654 != 2) {
                    class344.method2389(true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lwf;IIIIIII)V", line = 1984)
    public static final void method901(class333[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class333 var9 = arg0[var8];
            if (var9 != null && var9.field5142 == arg1 && (!var9.field5154 || var9.field5105 == 0 || var9.field5048 || method891(var9).field1981 != 0 || class100.field1311 == var9 || var9.field5084 == 1338) && (!var9.field5154 || !method898(var9))) {
                int var10 = var9.field5188 + arg6;
                int var11 = var9.field5045 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field5105 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field5056 + var10;
                    int var17 = var9.field5172 + var11;
                    if (var9.field5105 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class33.field410 == var9) {
                    class126.field1683 = true;
                    class262.field3802 = var10;
                    class306.field4488 = var11;
                }
                if (!var9.field5154 || var12 < var14 && var13 < var15) {
                    if (var9.field5105 == 0) {
                        if (!var9.field5154 && method898(var9) && class204.field2845 != var9) {
                            continue;
                        }
                        if (var9.field5069 && class105.field1361 >= var12 && class80.field1028 >= var13 && class105.field1361 < var14 && class80.field1028 < var15) {
                            for (class135 var18 = (class135) class276.field3956.method413(1253231568); var18 != null; var18 = (class135) class276.field3956.method419(103)) {
                                if (var18.field1835) {
                                    var18.method179((byte) 51);
                                    var18.field1831.field5148 = false;
                                }
                            }
                            if (class133.field1809 == 0) {
                                class33.field410 = null;
                                class100.field1311 = null;
                            }
                            class249.field3614 = 0;
                            class149.field2083 = false;
                        }
                    }
                    if (var9.field5154) {
                        boolean var19;
                        if (class105.field1361 >= var12 && class80.field1028 >= var13 && class105.field1361 < var14 && class80.field1028 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class42.field521 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class215.field3039 == 1 && class140.field1950 >= var12 && class305.field4465 >= var13 && class140.field1950 < var14 && class305.field4465 < var15) {
                            var21 = true;
                        }
                        if (var9.field5161 != null) {
                            for (int var22 = 0; var22 < var9.field5161.length; var22++) {
                                if (class143.field1991[var9.field5161[var22]]) {
                                    if (var9.field5082 == null || class313.field4603 >= var9.field5082[var22]) {
                                        byte var23 = var9.field5064[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class143.field1991[86] && !class143.field1991[82] && !class143.field1991[81]) && ((var23 & 0x2) == 0 || class143.field1991[86]) && ((var23 & 0x1) == 0 || class143.field1991[82]) && ((var23 & 0x4) == 0 || class143.field1991[81])) {
                                            class310.method2153(var9.field5109, -1, var22 + 1, -97, "");
                                            int var24 = var9.field5095[var22];
                                            if (var9.field5082 == null) {
                                                var9.field5082 = new int[var9.field5161.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field5082[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field5082[var22] = class313.field4603 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field5082 != null) {
                                    var9.field5082[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class198.method1453(var9, class140.field1950 - var10, class305.field4465 - var11, (byte) 50);
                        }
                        if (class33.field410 != null && class33.field410 != var9 && var19 && method891(var9).method1092((byte) 84)) {
                            class219.field3083 = var9;
                        }
                        if (class100.field1311 == var9) {
                            class75.field988 = true;
                            class95.field1244 = var10;
                            class210.field2980 = var11;
                        }
                        if (var9.field5048 || var9.field5084 != 0) {
                            if (var19 && class152.field2136 != 0 && var9.field5137 != null) {
                                class135 var25 = new class135();
                                var25.field1835 = true;
                                var25.field1831 = var9;
                                var25.field1839 = class152.field2136;
                                var25.field1836 = var9.field5137;
                                class276.field3956.method415((byte) -106, var25);
                            }
                            if (class33.field410 != null || class348.field5455 != null || class159.field2263 || var9.field5084 != 1400 && class249.field3614 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field5084 != 0) {
                                if (var9.field5084 == 1337) {
                                    class344.field5351 = var9;
                                    continue;
                                }
                                if (var9.field5084 == 1338) {
                                    if (var21) {
                                        class179.field2448 = class140.field1950 - var10;
                                        class236.field3412 = class305.field4465 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field5084 == 1400) {
                                    class23.field260 = var9;
                                    if (var19) {
                                        class149.field2083 = true;
                                    }
                                    if (var21) {
                                        int var26 = (int) ((double) (class140.field1950 - var10 - var9.field5056 / 2) * 2.0D / (double) class38.field463);
                                        int var27 = (int) ((double) (class305.field4465 - var11 - var9.field5172 / 2) * 2.0D / (double) class38.field463);
                                        int var28 = class32.field393 + var26;
                                        int var29 = class35.field428 + var27;
                                        int var30 = class38.field462 + var28;
                                        int var31 = class38.field459 + class38.field461 - var29 - 1;
                                        class310 var32 = class32.method204(257238413);
                                        if (var32 == null) {
                                            continue;
                                        }
                                        int[] var33 = new int[3];
                                        var32.method2159(var30, var31, (byte) -127, var33);
                                        if (var33 != null) {
                                            if (class143.field1991[82] && class217.field3070 > 0) {
                                                class86.method624((byte) -120, var33[1], var33[2], var33[0]);
                                                class82.method612(0);
                                                continue;
                                            }
                                            class261.field3785++;
                                            class251.field3681.method1309(23, 251);
                                            class251.field3681.method2058(-98, var33[0] << 28 | var33[1] << 14 | var33[2]);
                                        }
                                        class249.field3614 = 1;
                                        class360.field5621 = false;
                                        class160.field2290 = class105.field1361;
                                        field1638 = class80.field1028;
                                        continue;
                                    }
                                    if (var20 && class249.field3614 > 0) {
                                        if (class249.field3614 == 1 && (class160.field2290 != class105.field1361 || field1638 != class80.field1028)) {
                                            class323.field4742 = class32.field393;
                                            class249.field3624 = class35.field428;
                                            class249.field3614 = 2;
                                        }
                                        if (class249.field3614 == 2) {
                                            class360.field5621 = true;
                                            class78.method555(false, (int) ((double) (class160.field2290 - class105.field1361) * 2.0D / (double) class38.field465) + class323.field4742);
                                            class277.method1872(false, (int) ((double) (field1638 - class80.field1028) * 2.0D / (double) class38.field465) + class249.field3624);
                                        }
                                        continue;
                                    }
                                    if (class249.field3614 > 0 && !class360.field5621) {
                                        if ((class233.field3342 == 1 || class226.method1633(0, class66.field853 - 1)) && class66.field853 > 2) {
                                            class191.method1389((byte) 68);
                                        } else if (class66.field853 > 0) {
                                            class80.method564((byte) 77);
                                        }
                                    }
                                    class249.field3614 = 0;
                                    continue;
                                }
                                if (var9.field5084 == 1401) {
                                    if (var20) {
                                        class169.method1253(class80.field1028 - var11, var9.field5056, var9.field5172, class105.field1361 - var10, (byte) -80);
                                    }
                                    continue;
                                }
                                if (var9.field5084 == 1402) {
                                    if (!class47.field623) {
                                        class142.method1097(-124, var9);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field5080 && var21) {
                                var9.field5080 = true;
                                if (var9.field5196 != null) {
                                    class135 var34 = new class135();
                                    var34.field1835 = true;
                                    var34.field1831 = var9;
                                    var34.field1843 = class140.field1950 - var10;
                                    var34.field1839 = class305.field4465 - var11;
                                    var34.field1836 = var9.field5196;
                                    class276.field3956.method415((byte) 109, var34);
                                }
                            }
                            if (var9.field5080 && var20 && var9.field5103 != null) {
                                class135 var35 = new class135();
                                var35.field1835 = true;
                                var35.field1831 = var9;
                                var35.field1843 = class105.field1361 - var10;
                                var35.field1839 = class80.field1028 - var11;
                                var35.field1836 = var9.field5103;
                                class276.field3956.method415((byte) -95, var35);
                            }
                            if (var9.field5080 && !var20) {
                                var9.field5080 = false;
                                if (var9.field5201 != null) {
                                    class135 var36 = new class135();
                                    var36.field1835 = true;
                                    var36.field1831 = var9;
                                    var36.field1843 = class105.field1361 - var10;
                                    var36.field1839 = class80.field1028 - var11;
                                    var36.field1836 = var9.field5201;
                                    class179.field2447.method415((byte) -124, var36);
                                }
                            }
                            if (var20 && var9.field5060 != null) {
                                class135 var37 = new class135();
                                var37.field1835 = true;
                                var37.field1831 = var9;
                                var37.field1843 = class105.field1361 - var10;
                                var37.field1839 = class80.field1028 - var11;
                                var37.field1836 = var9.field5060;
                                class276.field3956.method415((byte) 47, var37);
                            }
                            if (!var9.field5148 && var19) {
                                var9.field5148 = true;
                                if (var9.field5171 != null) {
                                    class135 var38 = new class135();
                                    var38.field1835 = true;
                                    var38.field1831 = var9;
                                    var38.field1843 = class105.field1361 - var10;
                                    var38.field1839 = class80.field1028 - var11;
                                    var38.field1836 = var9.field5171;
                                    class276.field3956.method415((byte) 40, var38);
                                }
                            }
                            if (var9.field5148 && var19 && var9.field5062 != null) {
                                class135 var39 = new class135();
                                var39.field1835 = true;
                                var39.field1831 = var9;
                                var39.field1843 = class105.field1361 - var10;
                                var39.field1839 = class80.field1028 - var11;
                                var39.field1836 = var9.field5062;
                                class276.field3956.method415((byte) 45, var39);
                            }
                            if (var9.field5148 && !var19) {
                                var9.field5148 = false;
                                if (var9.field5190 != null) {
                                    class135 var40 = new class135();
                                    var40.field1835 = true;
                                    var40.field1831 = var9;
                                    var40.field1843 = class105.field1361 - var10;
                                    var40.field1839 = class80.field1028 - var11;
                                    var40.field1836 = var9.field5190;
                                    class179.field2447.method415((byte) 47, var40);
                                }
                            }
                            if (var9.field5108 != null) {
                                class135 var41 = new class135();
                                var41.field1831 = var9;
                                var41.field1836 = var9.field5108;
                                class263.field3817.method415((byte) 30, var41);
                            }
                            if (var9.field5175 != null && class296.field4303 > var9.field5146) {
                                if (var9.field5215 == null || class296.field4303 - var9.field5146 > 32) {
                                    class135 var46 = new class135();
                                    var46.field1831 = var9;
                                    var46.field1836 = var9.field5175;
                                    class276.field3956.method415((byte) 43, var46);
                                } else {
                                    label603: for (int var42 = var9.field5146; var42 < class296.field4303; var42++) {
                                        int var43 = class284.field4045[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field5215.length; var44++) {
                                            if (var9.field5215[var44] == var43) {
                                                class135 var45 = new class135();
                                                var45.field1831 = var9;
                                                var45.field1836 = var9.field5175;
                                                class276.field3956.method415((byte) -104, var45);
                                                break label603;
                                            }
                                        }
                                    }
                                }
                                var9.field5146 = class296.field4303;
                            }
                            if (var9.field5145 != null && class288.field4174 > var9.field5177) {
                                if (var9.field5101 == null || class288.field4174 - var9.field5177 > 32) {
                                    class135 var51 = new class135();
                                    var51.field1831 = var9;
                                    var51.field1836 = var9.field5145;
                                    class276.field3956.method415((byte) -112, var51);
                                } else {
                                    label579: for (int var47 = var9.field5177; var47 < class288.field4174; var47++) {
                                        int var48 = class284.field4056[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field5101.length; var49++) {
                                            if (var9.field5101[var49] == var48) {
                                                class135 var50 = new class135();
                                                var50.field1831 = var9;
                                                var50.field1836 = var9.field5145;
                                                class276.field3956.method415((byte) 39, var50);
                                                break label579;
                                            }
                                        }
                                    }
                                }
                                var9.field5177 = class288.field4174;
                            }
                            if (var9.field5163 != null && class78.field1004 > var9.field5141) {
                                if (var9.field5152 == null || class78.field1004 - var9.field5141 > 32) {
                                    class135 var56 = new class135();
                                    var56.field1831 = var9;
                                    var56.field1836 = var9.field5163;
                                    class276.field3956.method415((byte) -120, var56);
                                } else {
                                    label555: for (int var52 = var9.field5141; var52 < class78.field1004; var52++) {
                                        int var53 = class276.field3961[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field5152.length; var54++) {
                                            if (var9.field5152[var54] == var53) {
                                                class135 var55 = new class135();
                                                var55.field1831 = var9;
                                                var55.field1836 = var9.field5163;
                                                class276.field3956.method415((byte) -90, var55);
                                                break label555;
                                            }
                                        }
                                    }
                                }
                                var9.field5141 = class78.field1004;
                            }
                            if (var9.field5036 != null && class293.field4267 > var9.field5150) {
                                if (var9.field5176 == null || class293.field4267 - var9.field5150 > 32) {
                                    class135 var61 = new class135();
                                    var61.field1831 = var9;
                                    var61.field1836 = var9.field5036;
                                    class276.field3956.method415((byte) 42, var61);
                                } else {
                                    label531: for (int var57 = var9.field5150; var57 < class293.field4267; var57++) {
                                        int var58 = class190.field2631[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field5176.length; var59++) {
                                            if (var9.field5176[var59] == var58) {
                                                class135 var60 = new class135();
                                                var60.field1831 = var9;
                                                var60.field1836 = var9.field5036;
                                                class276.field3956.method415((byte) -109, var60);
                                                break label531;
                                            }
                                        }
                                    }
                                }
                                var9.field5150 = class293.field4267;
                            }
                            if (var9.field5167 != null && class115.field1489 > var9.field5156) {
                                if (var9.field5135 == null || class115.field1489 - var9.field5156 > 32) {
                                    class135 var66 = new class135();
                                    var66.field1831 = var9;
                                    var66.field1836 = var9.field5167;
                                    class276.field3956.method415((byte) 83, var66);
                                } else {
                                    label507: for (int var62 = var9.field5156; var62 < class115.field1489; var62++) {
                                        int var63 = class330.field4835[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field5135.length; var64++) {
                                            if (var9.field5135[var64] == var63) {
                                                class135 var65 = new class135();
                                                var65.field1831 = var9;
                                                var65.field1836 = var9.field5167;
                                                class276.field3956.method415((byte) 50, var65);
                                                break label507;
                                            }
                                        }
                                    }
                                }
                                var9.field5156 = class115.field1489;
                            }
                            if (class326.field4765 > var9.field5162 && var9.field5052 != null) {
                                class135 var67 = new class135();
                                var67.field1831 = var9;
                                var67.field1836 = var9.field5052;
                                class276.field3956.method415((byte) -12, var67);
                            }
                            if (class180.field2464 > var9.field5162 && var9.field5086 != null) {
                                class135 var68 = new class135();
                                var68.field1831 = var9;
                                var68.field1836 = var9.field5086;
                                class276.field3956.method415((byte) -107, var68);
                            }
                            if (class214.field3015 > var9.field5162 && var9.field5149 != null) {
                                class135 var69 = new class135();
                                var69.field1831 = var9;
                                var69.field1836 = var9.field5149;
                                class276.field3956.method415((byte) 78, var69);
                            }
                            if (class156.field2158 > var9.field5162 && var9.field5094 != null) {
                                class135 var70 = new class135();
                                var70.field1831 = var9;
                                var70.field1836 = var9.field5094;
                                class276.field3956.method415((byte) -97, var70);
                            }
                            if (class323.field4739 > var9.field5162 && var9.field5203 != null) {
                                class135 var71 = new class135();
                                var71.field1831 = var9;
                                var71.field1836 = var9.field5203;
                                class276.field3956.method415((byte) -95, var71);
                            }
                            var9.field5162 = class64.field801;
                            if (var9.field5063 != null) {
                                for (int var72 = 0; var72 < class362.field5699; var72++) {
                                    class135 var73 = new class135();
                                    var73.field1831 = var9;
                                    var73.field1830 = class48.field647[var72];
                                    var73.field1833 = class97.field1283[var72];
                                    var73.field1836 = var9.field5063;
                                    class276.field3956.method415((byte) -115, var73);
                                }
                            }
                            if (class161.field2294 && var9.field5050 != null) {
                                class135 var74 = new class135();
                                var74.field1831 = var9;
                                var74.field1836 = var9.field5050;
                                class276.field3956.method415((byte) -96, var74);
                            }
                        }
                    }
                    if (!var9.field5154 && class33.field410 == null && class348.field5455 == null && !class159.field2263) {
                        if ((var9.field5122 >= 0 || var9.field5197 != 0) && class105.field1361 >= var12 && class80.field1028 >= var13 && class105.field1361 < var14 && class80.field1028 < var15) {
                            if (var9.field5122 >= 0) {
                                class204.field2845 = arg0[var9.field5122];
                            } else {
                                class204.field2845 = var9;
                            }
                        }
                        if (var9.field5105 == 8 && class105.field1361 >= var12 && class80.field1028 >= var13 && class105.field1361 < var14 && class80.field1028 < var15) {
                            class353.field5508 = var9;
                        }
                        if (var9.field5044 > var9.field5172) {
                            class201.method1472((byte) 19, var9, class80.field1028, var9.field5056 + var10, class105.field1361, var9.field5044, var11, var9.field5172);
                        }
                    }
                    if (var9.field5105 == 0) {
                        method901(arg0, var9.field5109, var12, var13, var14, var15, var10 - var9.field5136, var11 - var9.field5134);
                        if (var9.field5187 != null) {
                            method901(var9.field5187, var9.field5109, var12, var13, var14, var15, var10 - var9.field5136, var11 - var9.field5134);
                        }
                        class74 var75 = (class74) class272.field3900.method2279((long) var9.field5109, -124);
                        if (var75 != null) {
                            class122.method884(var75.field982, var14, var10, var13, var11, var12, -96, var15);
                        }
                    }
                }
            }
        }
    }
}
