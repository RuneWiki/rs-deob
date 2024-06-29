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
public class client extends class44 {

    @OriginalMember(owner = "client!client", name = "V", descriptor = "[S")
    private static short[] field1626 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field1627 = -1;

    @OriginalMember(owner = "client!client", name = "A", descriptor = "I")
    public static volatile int field1617 = 0;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 4) {
                class306.method2074((byte) 75, "argument count");
            }
            class67.field1128 = Integer.parseInt(arg0[0]);
            class27.field470 = 2;
            if (arg0[1].equals("live")) {
                class310.field4990 = 0;
            } else if (arg0[1].equals("rc")) {
                class310.field4990 = 1;
            } else if (arg0[1].equals("wip")) {
                class310.field4990 = 2;
            } else {
                class306.method2074((byte) 114, "modewhat");
            }
            class159.field2606 = false;
            class49.field834 = class71.method500(2, arg0[2]);
            if (class49.field834 == -1) {
                if (arg0[2].equals("english")) {
                    class49.field834 = 0;
                } else if (arg0[2].equals("german")) {
                    class49.field834 = 1;
                } else {
                    class306.method2074((byte) -87, "language");
                }
            }
            class233.method1672(10, class49.field834);
            class77.field1310 = false;
            class147.field2425 = false;
            if (arg0[3].equals("game0")) {
                class43.field659 = 0;
            } else if (arg0[3].equals("game1")) {
                class43.field659 = 1;
            } else {
                class306.method2074((byte) -120, "game");
            }
            class49.field845 = false;
            class105.field1736 = 0;
            class103.field1649 = "";
            class66.field1111 = 0;
            client var1 = new client();
            class45.field702 = var1;
            var1.method270(29, 1024, 10, 768, class43.field659 == 1 ? "mechscape" : "runescape", false, class310.field4990 + 32, 554);
            class64.field1086.setLocation(40, 40);
        } catch (Exception var3) {
            class84.method595(14117, (String) null, var3);
        }
        field1636++;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method273(int arg0) {
        field1637++;
        if (arg0 != 0) {
            method728((class207[]) null, -81, 54, -19, -92, 110, -118, -34);
        }
        if (class26.field458 == 1000) {
            return;
        }
        class275.field4598++;
        if (class275.field4598 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class20.field374 = var2.get(11) * 600 + (var2.get(12) * 10) + var2.get(13) / 6;
            class260.field4371.setSeed((long) class20.field374);
        }
        this.method736(false);
        if (class187.field2995 != null) {
            class187.field2995.method1115(20010);
        }
        class22.method144(114);
        class159.method1187(-659813974);
        class177.method1301(112);
        class34.method215((byte) -127);
        if (class5.field128 != null) {
            int var3 = class5.field128.method1541(-1);
            class228.field3855 = var3;
        }
        if (class26.field458 == 0) {
            this.method724(arg0 ^ 0x1);
            class146.method1083(-16011);
        } else if (class26.field458 == 5) {
            this.method724(1);
            class146.method1083(-16011);
        } else if (class26.field458 == 25 || class26.field458 == 28) {
            class302.method2058(-1);
        }
        if (class26.field458 == 10) {
            this.method738(-24456);
            class120.method905(true);
            class58.method375(1);
            class34.method208(arg0 - 3);
        } else if (class26.field458 == 30) {
            class206.method1439(126);
            return;
        } else if (class26.field458 == 40) {
            class34.method208(arg0 ^ 0x29);
            if (class295.field4839 != -3) {
                if (class295.field4839 == 15) {
                    class85.method602(false);
                    return;
                }
                if (class295.field4839 != 2) {
                    class80.method556(104);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)I")
    public static final int method721(boolean arg0) {
        field1634++;
        if (class50.field857) {
            return 0;
        } else if (class136.method1011(arg0)) {
            return class79.field1325 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILaj;I)[Lek;")
    public static final class250[] method722(int arg0, int arg1, class151 arg2, int arg3) {
        int var4 = -68 / ((-arg1 - 43) / 36);
        field1622++;
        return class167.method1242(arg2, arg3, arg0, 64) ? class268.method1886(true) : null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public static final void method723() {
        for (int var0 = 0; var0 < 104; var0++) {
            int[] var1 = class95.field1541[var0];
            for (int var2 = 0; var2 < 104; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    private final void method724(int arg0) {
        field1629++;
        if (!class173.field2789) {
            label241: while (true) {
                do {
                    if (!class69.method476(arg0 ^ 0xFFFFBECE)) {
                        break label241;
                    }
                } while (class272.field4542 != 's' && class272.field4542 != 'S');
                class173.field2789 = true;
            }
        }
        if (class87.field1449 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class188.method1355(-85);
            if (class250.field4239 == 0L) {
                class250.field4239 = var4;
            }
            if (var3 > 16384 && (var4 - class250.field4239) < 5000L) {
                if (var4 - class280.field4646 > 1000L) {
                    System.gc();
                    class280.field4646 = var4;
                }
                class248.field4144 = class199.field3219;
                class162.field2632 = 5;
            } else {
                class162.field2632 = 5;
                class87.field1449 = 10;
                class248.field4144 = class93.field1532;
            }
        } else if (class87.field1449 == 10) {
            for (int var6 = 0; var6 < 4; var6++) {
                class225.field3790[var6] = new class311(104, 104);
            }
            class248.field4144 = class195.field3117;
            class87.field1449 = 30;
            class162.field2632 = 10;
        } else if (class87.field1449 == 30) {
            if (class187.field2995 == null) {
                class187.field2995 = new class149(class277.field4611, class113.field1935);
            }
            if (class187.field2995.method1112((byte) 105)) {
                class87.field1433 = class5.method38(0, arg0 ^ 0xFFFFFF83, true, true, false);
                class313.field5047 = class5.method38(1, -115, true, true, false);
                class274.field4580 = class5.method38(2, -125, false, true, true);
                class66.field1113 = class5.method38(3, arg0 ^ 0xFFFFFF8E, true, true, false);
                class13.field286 = class5.method38(4, -113, true, true, false);
                class270.field4488 = class5.method38(5, -121, true, true, true);
                class71.field1246 = class5.method38(6, arg0 ^ 0xFFFFFF8E, true, false, true);
                class26.field463 = class5.method38(7, -127, true, true, false);
                class25.field445 = class5.method38(8, -112, true, true, false);
                class113.field1926 = class5.method38(9, -120, true, true, false);
                class64.field1069 = class5.method38(10, -111, true, true, false);
                class123.field2090 = class5.method38(11, -122, true, true, false);
                class32.field528 = class5.method38(12, arg0 - 121, true, true, false);
                class67.field1120 = class5.method38(13, arg0 ^ 0xFFFFFF83, true, true, false);
                class22.field388 = class5.method38(14, arg0 ^ 0xFFFFFF90, true, false, false);
                class76.field1293 = class5.method38(15, -122, true, true, false);
                class136.field2246 = class5.method38(16, -123, true, true, false);
                class36.field582 = class5.method38(17, -120, true, true, false);
                class239.field4021 = class5.method38(18, arg0 - 120, true, true, false);
                class45.field707 = class5.method38(19, arg0 - 119, true, true, false);
                class41.field629 = class5.method38(20, -112, true, true, false);
                class249.field4196 = class5.method38(21, arg0 - 115, true, true, false);
                class58.field1011 = class5.method38(22, arg0 - 117, true, true, false);
                class13.field285 = class5.method38(23, arg0 ^ 0xFFFFFF81, true, true, true);
                class44.field681 = class5.method38(24, -125, true, true, false);
                class124.field2096 = class5.method38(25, -125, true, true, false);
                class141.field2331 = class5.method38(26, -127, true, true, true);
                class138.field2258 = class5.method38(27, -126, true, true, false);
                class187.field2997 = class5.method38(28, -116, true, true, true);
                class162.field2632 = 15;
                class87.field1449 = 40;
                class248.field4144 = class287.field4749;
            } else {
                class248.field4144 = class44.field689;
                class162.field2632 = 12;
            }
        } else if (class87.field1449 == 40) {
            int var7 = 0;
            for (int var8 = 0; var8 < 29; var8++) {
                var7 += class312.field5024[var8].method1360(11284) * class162.field2624[var8] / 100;
            }
            if (var7 == 100) {
                class248.field4144 = class95.field1550;
                class162.field2632 = 20;
                class123.method929(class25.field445, (byte) -107);
                class259.method1852(class25.field445, 2048);
                class79.method552((byte) 61, class25.field445);
                class87.field1449 = 41;
            } else {
                if (var7 != 0) {
                    class248.field4144 = class96.field1555 + var7 + "%";
                }
                class162.field2632 = 20;
            }
        } else if (class87.field1449 == 41) {
            if (class187.field2997.method1120(false)) {
                this.method735(class187.field2997.method1119(-2, 1), arg0 + 110);
                class248.field4144 = class207.field3351;
                class162.field2632 = 25;
                class87.field1449 = 45;
            } else {
                class248.field4144 = class49.field844 + class187.field2997.method1140((byte) 86) + "%";
                class162.field2632 = 25;
            }
        } else if (class87.field1449 == 45) {
            class144.method1063(2, class186.field2977, (byte) 108, 22050);
            class121.field2029 = new class104();
            class121.field2029.method782(128, false, 9);
            class95.field1543 = class30.method192(class5.field125, class142.field2344, 0, arg0 + 73, 22050);
            class95.field1543.method1712(92, class121.field2029);
            class95.method675(class121.field2029, class13.field286, arg0 ^ 0x7BF0, class76.field1293, class22.field388);
            class272.field4546 = class30.method192(class5.field125, class142.field2344, 1, 59, 2048);
            class278.field4627 = new class18();
            class272.field4546.method1712(85, class278.field4627);
            class248.field4147 = new class177(22050, class142.field2343);
            class58.field1023 = class71.field1246.method1121(arg0 + 1, "scape main");
            class162.field2632 = 30;
            class248.field4144 = class23.field416;
            class87.field1449 = 50;
        } else if (class87.field1449 == 50) {
            int var9 = class273.method1925((byte) 78, class67.field1120, class25.field445);
            int var10 = class287.method2003((byte) -103);
            if (var10 > var9) {
                class162.field2632 = 35;
                class248.field4144 = class293.field4822 + var9 * 100 / var10 + "%";
            } else {
                class248.field4144 = class263.field4391;
                class162.field2632 = 35;
                class87.field1449 = 60;
            }
        } else if (class87.field1449 == 60) {
            int var11 = class276.method1935(111, class25.field445);
            int var12 = class81.method562((byte) 82);
            if (var11 < var12) {
                class162.field2632 = 40;
                class248.field4144 = class115.field1956 + var11 * 100 / var12 + "%";
            } else {
                class248.field4144 = class246.field4128;
                class162.field2632 = 40;
                class87.field1449 = 65;
            }
        } else if (class87.field1449 == 65) {
            class49.method315((byte) 66, class25.field445, class67.field1120);
            class248.field4144 = class279.field4642;
            class162.field2632 = 45;
            class240.method1719(5, 31136);
            class87.field1449 = 70;
        } else if (class87.field1449 == 70) {
            byte var13 = 0;
            class274.field4580.method1120(false);
            int var14 = var13 + class274.field4580.method1140((byte) 48);
            class136.field2246.method1120(false);
            int var15 = var14 + class136.field2246.method1140((byte) 91);
            class36.field582.method1120(false);
            int var16 = var15 + class36.field582.method1140((byte) 90);
            class239.field4021.method1120(false);
            int var17 = var16 + class239.field4021.method1140((byte) 114);
            class45.field707.method1120(false);
            int var18 = var17 + class45.field707.method1140((byte) 107);
            class41.field629.method1120(false);
            int var19 = var18 + class41.field629.method1140((byte) 86);
            class249.field4196.method1120(false);
            int var20 = var19 + class249.field4196.method1140((byte) 51);
            class58.field1011.method1120(false);
            int var21 = var20 + class58.field1011.method1140((byte) 68);
            class44.field681.method1120(false);
            int var22 = var21 + class44.field681.method1140((byte) 95);
            class124.field2096.method1120(false);
            int var23 = var22 + class124.field2096.method1140((byte) 122);
            class138.field2258.method1120(false);
            int var24 = var23 + class138.field2258.method1140((byte) 72);
            if (var24 < 1100) {
                class162.field2632 = 50;
                class248.field4144 = class36.field570 + var24 / 11 + "%";
            } else {
                class208.method1463(arg0 ^ 0x1, class274.field4580);
                class116.method889(false, class274.field4580);
                class69.method473(class274.field4580, (byte) 81);
                class104.method769(class274.field4580, -161, class26.field463);
                class138.method1017(arg0 + 13458, class136.field2246, true, class26.field463);
                class84.method591(class239.field4021, -114, class26.field463, true);
                class272.method1921(class11.field195, class45.field707, true, -88, class26.field463);
                class143.method1059(class274.field4580, 2);
                class103.method744(arg0 ^ 0xFFFFFF95, class87.field1433, class313.field5047, class41.field629);
                class232.method1669(108, class274.field4580);
                class312.method2110(class26.field463, -11157, class249.field4196);
                class197.method1405(class58.field1011, 31167);
                class25.method161(class274.field4580, 16);
                class134.method997(class66.field1113, class25.field445, true, class67.field1120, class26.field463);
                class17.method96((byte) 84, class274.field4580);
                class268.method1889((byte) -121, class36.field582);
                class279.method1948((byte) -113, class44.field681, new class228(), class124.field2096);
                class200.method1414(64, class124.field2096, class44.field681);
                class130.method969((byte) -14, class274.field4580);
                class31.method201((byte) -125, class274.field4580);
                class286.method1994((byte) -38, class274.field4580);
                class64.method442(class25.field445, true, class274.field4580);
                class287.method1998(class274.field4580, (byte) -85, class25.field445);
                class258.method1849(36, class25.field445, class274.field4580);
                class162.field2632 = 50;
                class248.field4144 = class30.field501;
                class284.method1977(32513);
                class87.field1449 = 80;
            }
        } else if (class87.field1449 == 80) {
            int var25 = class171.method1275(class25.field445, (byte) 126);
            int var26 = class170.method1269(false);
            if (var25 < var26) {
                class162.field2632 = 60;
                class248.field4144 = class44.field675 + var25 * 100 / var26 + "%";
            } else {
                class282.method1962(arg0 - 28336, class25.field445);
                class162.field2632 = 60;
                class87.field1449 = 90;
                class248.field4144 = class136.field2242;
            }
        } else if (class87.field1449 == 90) {
            if (class141.field2331.method1120(false)) {
                class185 var27 = new class185(class113.field1926, class141.field2331, class25.field445, 20, !class145.field2388);
                class128.method954(var27);
                if (class15.field304 == 1) {
                    class128.method958(0.9F);
                }
                if (class15.field304 == 2) {
                    class128.method958(0.8F);
                }
                if (class15.field304 == 3) {
                    class128.method958(0.7F);
                }
                if (class15.field304 == 4) {
                    class128.method958(0.6F);
                }
                class162.field2632 = 70;
                class87.field1449 = 100;
                class248.field4144 = class282.field4670;
            } else {
                class248.field4144 = class120.field2019 + class141.field2331.method1140((byte) 110) + "%";
                class162.field2632 = 70;
            }
        } else if (class87.field1449 == 100) {
            if (class231.method1661(class25.field445, 256)) {
                class87.field1449 = 110;
            }
        } else if (class87.field1449 == 110) {
            class101.field1599 = new class173();
            class142.field2344.method583((byte) -28, class101.field1599, 10);
            class87.field1449 = 120;
            class248.field4144 = class16.field321;
            class162.field2632 = 75;
        } else if (class87.field1449 == 120) {
            if (class64.field1069.method1131(arg0 ^ 0x1, "", "huffman")) {
                class16 var28 = new class16(class64.field1069.method1130((byte) -94, "", "huffman"));
                class196.method1399(0, var28);
                class162.field2632 = 80;
                class248.field4144 = class253.field4286;
                class87.field1449 = 130;
            } else {
                class162.field2632 = 80;
                class248.field4144 = class194.field3113 + "0%";
            }
        } else if (arg0 == 1) {
            if (class87.field1449 == 130) {
                if (!class66.field1113.method1120(false)) {
                    class248.field4144 = class12.field261 + class66.field1113.method1140((byte) 81) * 3 / 4 + "%";
                    class162.field2632 = 85;
                } else if (!class32.field528.method1120(false)) {
                    class248.field4144 = class12.field261 + (class32.field528.method1140((byte) 120) / 10 + 75) + "%";
                    class162.field2632 = 85;
                } else if (!class67.field1120.method1120(false)) {
                    class248.field4144 = class12.field261 + ((class67.field1120.method1140((byte) 91) / 20) + 85) + "%";
                    class162.field2632 = 85;
                } else if (class13.field285.method1154("details", -29993)) {
                    class148.method1105(class13.field285);
                    class139.method1021(class138.field2258);
                    class14.method78(class26.field463);
                    class87.field1449 = 135;
                    class248.field4144 = class303.field4936;
                    class162.field2632 = 95;
                } else {
                    class248.field4144 = class12.field261 + (class13.field285.method1153("details", (byte) -34) / 10 + 90) + "%";
                    class162.field2632 = 85;
                }
            } else if (class87.field1449 == 135) {
                int var29 = class170.method1270(-18747);
                if (var29 == -1) {
                    class162.field2632 = 95;
                    class248.field4144 = class132.field2171;
                } else if (var29 == 7 || var29 == 9) {
                    this.method266(250, "worldlistfull");
                    class240.method1719(1000, 31136);
                } else if (class258.field4339) {
                    class248.field4144 = class206.field3331;
                    class87.field1449 = 140;
                    class162.field2632 = 96;
                } else {
                    this.method266(arg0 + 249, "worldlistio_" + var29);
                    class240.method1719(1000, 31136);
                }
            } else if (class87.field1449 == 140) {
                class258.field4336 = class66.field1113.method1121(2, "loginscreen");
                class270.field4488.method1123((byte) -42, true, false);
                class71.field1246.method1123((byte) -80, true, true);
                class25.field445.method1123((byte) -115, true, true);
                class67.field1120.method1123((byte) -92, true, true);
                class64.field1069.method1123((byte) -112, true, true);
                class66.field1113.method1123((byte) -106, true, true);
                class200.field3231 = true;
                class162.field2632 = 97;
                class87.field1449 = 150;
                class248.field4144 = class43.field651;
            } else if (class87.field1449 == 150) {
                if (class173.field2789) {
                    class297.field4862 = 0;
                    class265.field4440 = 0;
                    class97.field1560 = 0;
                    class16.field328 = 0;
                }
                class173.field2789 = true;
                class116.method893((byte) 7, class142.field2344);
                class151.method1142(false, -1, class297.field4862, true, -1);
                class87.field1449 = 160;
                class248.field4144 = class217.field3670;
                class162.field2632 = 100;
            } else if (class87.field1449 == 160) {
                class236.method1694(true, false);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public static void method725(byte arg0) {
        if (arg0 != -22) {
            method731();
        }
        field1626 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lhg;)Lhg;")
    public static final class207 method726(class207 arg0) {
        int var1 = method732(arg0).method130((byte) -115);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class222.method1574(120, arg0.field3465);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method727(int arg0) {
        field1630++;
        if (class277.field4611.field3648 > class193.field3105) {
            class108.field1771 = (class277.field4611.field3648 - 1) * 250;
            if (class264.field4408 == class146.field2411) {
                class264.field4408 = class223.field3741;
            } else {
                class264.field4408 = class146.field2411;
            }
            if (class108.field1771 > 3000) {
                class108.field1771 = 3000;
            }
            if (class277.field4611.field3648 >= 2 && class277.field4611.field3647 == 6) {
                this.method266(250, "js5connect_outofdate");
                class26.field458 = 1000;
                return;
            }
            if (class277.field4611.field3648 >= 4 && class277.field4611.field3647 == -1) {
                this.method266(250, "js5crc");
                class26.field458 = 1000;
                return;
            }
            if (class277.field4611.field3648 >= 4 && (class26.field458 == 0 || class26.field458 == 5)) {
                if (class277.field4611.field3647 == 7 || class277.field4611.field3647 == 9) {
                    this.method266(250, "js5connect_full");
                } else if (class277.field4611.field3647 > 0) {
                    this.method266(250, "js5connect");
                } else {
                    this.method266(250, "js5io");
                }
                class26.field458 = 1000;
                return;
            }
        }
        class193.field3105 = class277.field4611.field3648;
        if (class108.field1771 > 0) {
            class108.field1771--;
            return;
        }
        try {
            if (class5.field129 == 0) {
                class217.field3666 = class142.field2344.method572(class264.field4408, (byte) -111, class186.field2971);
                class5.field129++;
            }
            if (class5.field129 == 1) {
                if (class217.field3666.field3091 == 2) {
                    this.method741(false, 1000);
                    return;
                }
                if (class217.field3666.field3091 == 1) {
                    class5.field129++;
                }
            }
            if (arg0 != -12222) {
                method726((class207) null);
            }
            if (class5.field129 == 2) {
                class101.field1612 = new class144((Socket) class217.field3666.field3089, class142.field2344);
                class249 var2 = new class249(5);
                var2.method1780(15, 112);
                var2.method1811(554, (byte) 51);
                class101.field1612.method1066(var2.field4182, -77, 5, 0);
                class5.field129++;
                class201.field3240 = class188.method1355(54);
            }
            if (class5.field129 == 3) {
                if (class26.field458 == 0 || class26.field458 == 5 || class101.field1612.method1065(-106) > 0) {
                    int var3 = class101.field1612.method1064(false);
                    if (var3 != 0) {
                        this.method741(false, var3);
                        return;
                    }
                    class5.field129++;
                } else if ((class188.method1355(62) - class201.field3240) > 30000L) {
                    this.method741(false, 1001);
                    return;
                }
            }
            if (class5.field129 == 4) {
                boolean var4 = class26.field458 == 5 || class26.field458 == 10 || class26.field458 == 28;
                class277.field4611.method1525(!var4, class101.field1612, 2934);
                class5.field129 = 0;
                class101.field1612 = null;
                class217.field3666 = null;
            }
        } catch (IOException var5) {
            this.method741(false, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lhg;IIIIIII)V")
    public static final void method728(class207[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class207 var9 = arg0[var8];
            if (var9 != null && var9.field3465 == arg1 && (!var9.field3446 || var9.field3376 == 0 || var9.field3444 || method732(var9).field371 != 0 || class78.field1324 == var9 || var9.field3495 == 1338) && (!var9.field3446 || !method733(var9))) {
                int var10 = var9.field3368 + arg6;
                int var11 = var9.field3424 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field3376 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field3484 + var10;
                    int var17 = var9.field3481 + var11;
                    if (var9.field3376 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class162.field2635 == var9) {
                    class3.field102 = true;
                    class216.field3651 = var10;
                    class152.field2532 = var11;
                }
                if (!var9.field3446 || var12 < var14 && var13 < var15) {
                    if (var9.field3376 == 0) {
                        if (!var9.field3446 && method733(var9) && class70.field1169 != var9) {
                            continue;
                        }
                        if (var9.field3335 && class96.field1558 >= var12 && class87.field1448 >= var13 && class96.field1558 < var14 && class87.field1448 < var15) {
                            for (class303 var18 = (class303) class300.field4904.method309(0); var18 != null; var18 = (class303) class300.field4904.method312((byte) -83)) {
                                if (var18.field4930) {
                                    var18.method993(32);
                                    var18.field4931.field3367 = false;
                                }
                            }
                            if (class17.field337 == 0) {
                                class162.field2635 = null;
                                class78.field1324 = null;
                            }
                            class209.field3539 = 0;
                            class71.field1238 = false;
                        }
                    }
                    if (var9.field3446) {
                        boolean var19;
                        if (class96.field1558 >= var12 && class87.field1448 >= var13 && class96.field1558 < var14 && class87.field1448 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class171.field2763 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class29.field490 == 1 && class298.field4870 >= var12 && class32.field526 >= var13 && class298.field4870 < var14 && class32.field526 < var15) {
                            var21 = true;
                        }
                        if (var9.field3360 != null) {
                            for (int var22 = 0; var22 < var9.field3360.length; var22++) {
                                if (class157.field2581[var9.field3360[var22]]) {
                                    if (var9.field3513 == null || class275.field4598 >= var9.field3513[var22]) {
                                        byte var23 = var9.field3489[var22];
                                        if (var23 == 0 || ((var23 & 0x8) == 0 || !class157.field2581[86] && !class157.field2581[82] && !class157.field2581[81]) && ((var23 & 0x2) == 0 || class157.field2581[86]) && ((var23 & 0x1) == 0 || class157.field2581[82]) && ((var23 & 0x4) == 0 || class157.field2581[81])) {
                                            class4.method36(var22 + 1, var9.field3405, "", -1, 9);
                                            int var24 = var9.field3390[var22];
                                            if (var9.field3513 == null) {
                                                var9.field3513 = new int[var9.field3360.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field3513[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field3513[var22] = class275.field4598 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field3513 != null) {
                                    var9.field3513[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class31.method193(class32.field526 - var11, class298.field4870 - var10, (byte) -37, var9);
                        }
                        if (class162.field2635 != null && class162.field2635 != var9 && var19 && method732(var9).method129((byte) -86)) {
                            class312.field5023 = var9;
                        }
                        if (class78.field1324 == var9) {
                            class313.field5049 = true;
                            field1627 = var10;
                            class311.field5005 = var11;
                        }
                        if (var9.field3444 || var9.field3495 != 0) {
                            if (var19 && class228.field3855 != 0 && var9.field3414 != null) {
                                class303 var25 = new class303();
                                var25.field4930 = true;
                                var25.field4931 = var9;
                                var25.field4944 = class228.field3855;
                                var25.field4935 = var9.field3414;
                                class300.field4904.method311(103, var25);
                            }
                            if (class162.field2635 != null || class274.field4582 != null || class259.field4360 || var9.field3495 != 1400 && class209.field3539 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field3495 != 0) {
                                if (var9.field3495 == 1337) {
                                    class159.field2603 = var9;
                                    continue;
                                }
                                if (var9.field3495 == 1338) {
                                    if (var21) {
                                        class79.field1327 = class298.field4870 - var10;
                                        class119.field2003 = class32.field526 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field3495 == 1400) {
                                    class27.field471 = var9;
                                    if (var19) {
                                        class71.field1238 = true;
                                    }
                                    if (var21) {
                                        int var26 = (int) ((double) (class298.field4870 - var10 - var9.field3484 / 2) * 2.0D / (double) class148.field2442);
                                        int var27 = (int) ((double) (class32.field526 - var11 - var9.field3481 / 2) * 2.0D / (double) class148.field2442);
                                        int var28 = class122.field2044 + var26;
                                        int var29 = class219.field3701 + var27;
                                        int var30 = class148.field2438 + var28;
                                        int var31 = class148.field2434 + class148.field2437 - var29 - 1;
                                        class205 var32 = class61.method421((byte) 127);
                                        if (var32 == null) {
                                            continue;
                                        }
                                        int[] var33 = new int[3];
                                        var32.method1426(var30, var31, 81, var33);
                                        if (var33 != null) {
                                            if (class157.field2581[82] && class233.field3942 > 0) {
                                                class306.method2073(var33[0], var33[1], (byte) 9, var33[2]);
                                                class209.method1470((byte) -127);
                                                continue;
                                            }
                                            class202.field3246++;
                                            class236.field3980.method640((byte) 97, 111);
                                            class236.field3980.method1811(var33[0] << 28 | var33[1] << 14 | var33[2], (byte) 51);
                                        }
                                        class209.field3539 = 1;
                                        class155.field2571 = false;
                                        class73.field1280 = class96.field1558;
                                        class205.field3285 = class87.field1448;
                                        continue;
                                    }
                                    if (var20 && class209.field3539 > 0) {
                                        if (class209.field3539 == 1 && (class96.field1558 != class73.field1280 || class87.field1448 != class205.field3285)) {
                                            class63.field1061 = class122.field2044;
                                            class135.field2233 = class219.field3701;
                                            class209.field3539 = 2;
                                        }
                                        if (class209.field3539 == 2) {
                                            class155.field2571 = true;
                                            class228.method1613(-115, (int) ((double) (class73.field1280 - class96.field1558) * 2.0D / (double) class148.field2444) + class63.field1061);
                                            class231.method1662((int) ((double) (class205.field3285 - class87.field1448) * 2.0D / (double) class148.field2444) + class135.field2233, -1);
                                        }
                                        continue;
                                    }
                                    if (class209.field3539 > 0 && !class155.field2571) {
                                        if ((class20.field375 == 1 || class174.method1284(4001, class287.field4747 - 1)) && class287.field4747 > 2) {
                                            class1.method7(-13055);
                                        } else if (class287.field4747 > 0) {
                                            class6.method45(2);
                                        }
                                    }
                                    class209.field3539 = 0;
                                    continue;
                                }
                                if (var9.field3495 == 1401) {
                                    if (var20) {
                                        class69.method474(false, var9.field3481, var9.field3484, class87.field1448 - var11, class96.field1558 - var10);
                                    }
                                    continue;
                                }
                                if (var9.field3495 == 1402) {
                                    class206.method1441(0, var9);
                                    continue;
                                }
                            }
                            if (!var9.field3433 && var21) {
                                var9.field3433 = true;
                                if (var9.field3418 != null) {
                                    class303 var34 = new class303();
                                    var34.field4930 = true;
                                    var34.field4931 = var9;
                                    var34.field4940 = class298.field4870 - var10;
                                    var34.field4944 = class32.field526 - var11;
                                    var34.field4935 = var9.field3418;
                                    class300.field4904.method311(93, var34);
                                }
                            }
                            if (var9.field3433 && var20 && var9.field3485 != null) {
                                class303 var35 = new class303();
                                var35.field4930 = true;
                                var35.field4931 = var9;
                                var35.field4940 = class96.field1558 - var10;
                                var35.field4944 = class87.field1448 - var11;
                                var35.field4935 = var9.field3485;
                                class300.field4904.method311(113, var35);
                            }
                            if (var9.field3433 && !var20) {
                                var9.field3433 = false;
                                if (var9.field3380 != null) {
                                    class303 var36 = new class303();
                                    var36.field4930 = true;
                                    var36.field4931 = var9;
                                    var36.field4940 = class96.field1558 - var10;
                                    var36.field4944 = class87.field1448 - var11;
                                    var36.field4935 = var9.field3380;
                                    class215.field3619.method311(87, var36);
                                }
                            }
                            if (var20 && var9.field3419 != null) {
                                class303 var37 = new class303();
                                var37.field4930 = true;
                                var37.field4931 = var9;
                                var37.field4940 = class96.field1558 - var10;
                                var37.field4944 = class87.field1448 - var11;
                                var37.field4935 = var9.field3419;
                                class300.field4904.method311(88, var37);
                            }
                            if (!var9.field3367 && var19) {
                                var9.field3367 = true;
                                if (var9.field3486 != null) {
                                    class303 var38 = new class303();
                                    var38.field4930 = true;
                                    var38.field4931 = var9;
                                    var38.field4940 = class96.field1558 - var10;
                                    var38.field4944 = class87.field1448 - var11;
                                    var38.field4935 = var9.field3486;
                                    class300.field4904.method311(96, var38);
                                }
                            }
                            if (var9.field3367 && var19 && var9.field3470 != null) {
                                class303 var39 = new class303();
                                var39.field4930 = true;
                                var39.field4931 = var9;
                                var39.field4940 = class96.field1558 - var10;
                                var39.field4944 = class87.field1448 - var11;
                                var39.field4935 = var9.field3470;
                                class300.field4904.method311(124, var39);
                            }
                            if (var9.field3367 && !var19) {
                                var9.field3367 = false;
                                if (var9.field3333 != null) {
                                    class303 var40 = new class303();
                                    var40.field4930 = true;
                                    var40.field4931 = var9;
                                    var40.field4940 = class96.field1558 - var10;
                                    var40.field4944 = class87.field1448 - var11;
                                    var40.field4935 = var9.field3333;
                                    class215.field3619.method311(122, var40);
                                }
                            }
                            if (var9.field3379 != null) {
                                class303 var41 = new class303();
                                var41.field4931 = var9;
                                var41.field4935 = var9.field3379;
                                class190.field3085.method311(86, var41);
                            }
                            if (var9.field3375 != null && class20.field365 > var9.field3455) {
                                if (var9.field3423 == null || class20.field365 - var9.field3455 > 32) {
                                    class303 var46 = new class303();
                                    var46.field4931 = var9;
                                    var46.field4935 = var9.field3375;
                                    class300.field4904.method311(106, var46);
                                } else {
                                    label600: for (int var42 = var9.field3455; var42 < class20.field365; var42++) {
                                        int var43 = class216.field3654[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field3423.length; var44++) {
                                            if (var9.field3423[var44] == var43) {
                                                class303 var45 = new class303();
                                                var45.field4931 = var9;
                                                var45.field4935 = var9.field3375;
                                                class300.field4904.method311(101, var45);
                                                break label600;
                                            }
                                        }
                                    }
                                }
                                var9.field3455 = class20.field365;
                            }
                            if (var9.field3449 != null && class190.field3045 > var9.field3384) {
                                if (var9.field3364 == null || class190.field3045 - var9.field3384 > 32) {
                                    class303 var51 = new class303();
                                    var51.field4931 = var9;
                                    var51.field4935 = var9.field3449;
                                    class300.field4904.method311(117, var51);
                                } else {
                                    label576: for (int var47 = var9.field3384; var47 < class190.field3045; var47++) {
                                        int var48 = class265.field4433[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field3364.length; var49++) {
                                            if (var9.field3364[var49] == var48) {
                                                class303 var50 = new class303();
                                                var50.field4931 = var9;
                                                var50.field4935 = var9.field3449;
                                                class300.field4904.method311(89, var50);
                                                break label576;
                                            }
                                        }
                                    }
                                }
                                var9.field3384 = class190.field3045;
                            }
                            if (var9.field3382 != null && class236.field3986 > var9.field3464) {
                                if (var9.field3397 == null || class236.field3986 - var9.field3464 > 32) {
                                    class303 var56 = new class303();
                                    var56.field4931 = var9;
                                    var56.field4935 = var9.field3382;
                                    class300.field4904.method311(95, var56);
                                } else {
                                    label552: for (int var52 = var9.field3464; var52 < class236.field3986; var52++) {
                                        int var53 = class255.field4317[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field3397.length; var54++) {
                                            if (var9.field3397[var54] == var53) {
                                                class303 var55 = new class303();
                                                var55.field4931 = var9;
                                                var55.field4935 = var9.field3382;
                                                class300.field4904.method311(123, var55);
                                                break label552;
                                            }
                                        }
                                    }
                                }
                                var9.field3464 = class236.field3986;
                            }
                            if (var9.field3494 != null && class76.field1298 > var9.field3410) {
                                if (var9.field3435 == null || class76.field1298 - var9.field3410 > 32) {
                                    class303 var61 = new class303();
                                    var61.field4931 = var9;
                                    var61.field4935 = var9.field3494;
                                    class300.field4904.method311(125, var61);
                                } else {
                                    label528: for (int var57 = var9.field3410; var57 < class76.field1298; var57++) {
                                        int var58 = class134.field2207[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field3435.length; var59++) {
                                            if (var9.field3435[var59] == var58) {
                                                class303 var60 = new class303();
                                                var60.field4931 = var9;
                                                var60.field4935 = var9.field3494;
                                                class300.field4904.method311(116, var60);
                                                break label528;
                                            }
                                        }
                                    }
                                }
                                var9.field3410 = class76.field1298;
                            }
                            if (var9.field3339 != null && class145.field2386 > var9.field3389) {
                                if (var9.field3473 == null || class145.field2386 - var9.field3389 > 32) {
                                    class303 var66 = new class303();
                                    var66.field4931 = var9;
                                    var66.field4935 = var9.field3339;
                                    class300.field4904.method311(88, var66);
                                } else {
                                    label504: for (int var62 = var9.field3389; var62 < class145.field2386; var62++) {
                                        int var63 = class76.field1301[var62 & 0x1F];
                                        for (int var64 = 0; var64 < var9.field3473.length; var64++) {
                                            if (var9.field3473[var64] == var63) {
                                                class303 var65 = new class303();
                                                var65.field4931 = var9;
                                                var65.field4935 = var9.field3339;
                                                class300.field4904.method311(108, var65);
                                                break label504;
                                            }
                                        }
                                    }
                                }
                                var9.field3389 = class145.field2386;
                            }
                            if (class219.field3700 > var9.field3392 && var9.field3488 != null) {
                                class303 var67 = new class303();
                                var67.field4931 = var9;
                                var67.field4935 = var9.field3488;
                                class300.field4904.method311(125, var67);
                            }
                            if (class293.field4824 > var9.field3392 && var9.field3460 != null) {
                                class303 var68 = new class303();
                                var68.field4931 = var9;
                                var68.field4935 = var9.field3460;
                                class300.field4904.method311(87, var68);
                            }
                            if (class146.field2409 > var9.field3392 && var9.field3502 != null) {
                                class303 var69 = new class303();
                                var69.field4931 = var9;
                                var69.field4935 = var9.field3502;
                                class300.field4904.method311(83, var69);
                            }
                            if (class113.field1927 > var9.field3392 && var9.field3413 != null) {
                                class303 var70 = new class303();
                                var70.field4931 = var9;
                                var70.field4935 = var9.field3413;
                                class300.field4904.method311(75, var70);
                            }
                            if (class228.field3856 > var9.field3392 && var9.field3491 != null) {
                                class303 var71 = new class303();
                                var71.field4931 = var9;
                                var71.field4935 = var9.field3491;
                                class300.field4904.method311(88, var71);
                            }
                            var9.field3392 = class196.field3162;
                            if (var9.field3496 != null) {
                                for (int var72 = 0; var72 < class25.field444; var72++) {
                                    class303 var73 = new class303();
                                    var73.field4931 = var9;
                                    var73.field4928 = class94.field1539[var72];
                                    var73.field4938 = class4.field120[var72];
                                    var73.field4935 = var9.field3496;
                                    class300.field4904.method311(106, var73);
                                }
                            }
                            if (class196.field3158 && var9.field3492 != null) {
                                class303 var74 = new class303();
                                var74.field4931 = var9;
                                var74.field4935 = var9.field3492;
                                class300.field4904.method311(124, var74);
                            }
                        }
                    }
                    if (!var9.field3446 && class162.field2635 == null && class274.field4582 == null && !class259.field4360) {
                        if ((var9.field3340 >= 0 || var9.field3478 != 0) && class96.field1558 >= var12 && class87.field1448 >= var13 && class96.field1558 < var14 && class87.field1448 < var15) {
                            if (var9.field3340 >= 0) {
                                class70.field1169 = arg0[var9.field3340];
                            } else {
                                class70.field1169 = var9;
                            }
                        }
                        if (var9.field3376 == 8 && class96.field1558 >= var12 && class87.field1448 >= var13 && class96.field1558 < var14 && class87.field1448 < var15) {
                            class163.field2655 = var9;
                        }
                        if (var9.field3344 > var9.field3481) {
                            class187.method1351(var9.field3344, var9.field3481, class96.field1558, var9, (byte) -124, class87.field1448, var9.field3484 + var10, var11);
                        }
                    }
                    if (var9.field3376 == 0) {
                        method728(arg0, var9.field3405, var12, var13, var14, var15, var10 - var9.field3450, var11 - var9.field3374);
                        if (var9.field3462 != null) {
                            method728(var9.field3462, var9.field3405, var12, var13, var14, var15, var10 - var9.field3450, var11 - var9.field3374);
                        }
                        class278 var75 = (class278) class306.field4952.method987(-96, (long) var9.field3405);
                        if (var75 != null) {
                            class189.method1367(var11, (byte) 9, var12, var10, var15, var75.field4622, var13, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method268(byte arg0) {
        field1621++;
        if (class26.field458 == 1000 || arg0 > -118) {
            return;
        }
        long var2 = class215.method1531(-63) / 1000000L - class69.field1156;
        class69.field1156 = class215.method1531(-126) / 1000000L;
        boolean var4 = class283.method1968(true);
        if (var4 && class101.field1601 && class95.field1543 != null) {
            class95.field1543.method1713((byte) -30);
        }
        if ((class26.field458 == 30 || class26.field458 == 10) && (class217.field3669 || class231.field3917 != 0L && class231.field3917 < class188.method1355(-75))) {
            class151.method1142(class217.field3669, class222.field3731, class170.method1271((byte) 101), true, class175.field2827);
        }
        if (class218.field3682 == null) {
            Container var5;
            if (class218.field3682 != null) {
                var5 = class218.field3682;
            } else if (class64.field1086 == null) {
                var5 = class142.field2344.field1380;
            } else {
                var5 = class64.field1086;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class64.field1086 == var5) {
                Insets var8 = class64.field1086.getInsets();
                var7 -= var8.top + var8.bottom;
                var6 -= var8.right + var8.left;
            }
            if (class61.field1051 != var6 || class145.field2390 != var7) {
                if (class83.field1374.startsWith("mac")) {
                    class145.field2390 = var7;
                    class61.field1051 = var6;
                } else {
                    class70.method484((byte) 11);
                }
                class231.field3917 = class188.method1355(64) + 500L;
            }
        }
        boolean var9 = false;
        if (class101.field1603) {
            var9 = true;
            class101.field1603 = false;
        }
        if (var9) {
            class87.method611(true);
        }
        if (class26.field458 == 0) {
            class42.method254(-105, class162.field2632, (Color) null, var9, class248.field4144);
        } else if (class26.field458 == 5) {
            class151.method1122(false, class183.field2930, 32);
        } else if (class26.field458 == 10) {
            class216.method1540((byte) 95);
        } else if (class26.field458 == 25 || class26.field458 == 28) {
            if (class67.field1126 == 1) {
                if (class141.field2339 > class151.field2518) {
                    class151.field2518 = class141.field2339;
                }
                int var11 = (class151.field2518 - class141.field2339) * 50 / class151.field2518;
                class44.method260(false, class5.field127 + "<br>(" + var11 + "%)", (byte) 112);
            } else if (class67.field1126 == 2) {
                if (class292.field4790 > class5.field122) {
                    class5.field122 = class292.field4790;
                }
                int var10 = (class5.field122 - class292.field4790) * 50 / class5.field122 + 50;
                class44.method260(false, class5.field127 + "<br>(" + var10 + "%)", (byte) 66);
            } else {
                class44.method260(false, class5.field127, (byte) 25);
            }
        } else if (class26.field458 == 30) {
            class260.method1855(var2, (byte) 119);
        } else if (class26.field458 == 40) {
            class44.method260(false, class264.field4413 + "<br>" + class22.field409, (byte) 39);
        }
        if ((class26.field458 == 30 || class26.field458 == 10) && class227.field3842 == 0 && !var9) {
            try {
                Graphics var14 = class5.field125.getGraphics();
                for (int var15 = 0; var15 < class215.field3631; var15++) {
                    if (class236.field3988[var15]) {
                        class7.field152.method1005(class298.field4867[var15], var14, class180.field2877[var15], class159.field2607[var15], 16733373, class17.field348[var15]);
                        class236.field3988[var15] = false;
                    }
                }
            } catch (Exception var16) {
                class5.field125.repaint();
            }
        } else if (class26.field458 != 0) {
            try {
                Graphics var12 = class5.field125.getGraphics();
                class7.field152.method1004(-6187, 0, 0, var12);
                for (int var13 = 0; var13 < class215.field3631; var13++) {
                    class236.field3988[var13] = false;
                }
            } catch (Exception var17) {
                class5.field125.repaint();
            }
        }
        if (class200.field3231) {
            class226.method1604((byte) 72);
        }
        if (class173.field2789 && class26.field458 == 10 && class243.field4082 != -1) {
            class173.field2789 = false;
            class116.method893((byte) 7, class142.field2344);
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field1635++;
        if (!this.method262(-33)) {
            return;
        }
        class67.field1128 = Integer.parseInt(this.getParameter("worldid"));
        class27.field470 = Integer.parseInt(this.getParameter("modewhere"));
        if (class27.field470 < 0 || class27.field470 > 1) {
            class27.field470 = 0;
        }
        class310.field4990 = Integer.parseInt(this.getParameter("modewhat"));
        if (class310.field4990 < 0 || class310.field4990 > 2) {
            class310.field4990 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class159.field2606 = true;
        } else {
            class159.field2606 = false;
        }
        try {
            class49.field834 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class49.field834 = 0;
        }
        class233.method1672(10, class49.field834);
        String var2 = this.getParameter("objecttag");
        if (var2 != null && var2.equals("1")) {
            class77.field1310 = true;
        } else {
            class77.field1310 = false;
        }
        String var3 = this.getParameter("js");
        if (var3 != null && var3.equals("1")) {
            class147.field2425 = true;
        } else {
            class147.field2425 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class43.field659 = 1;
        } else {
            class43.field659 = 0;
        }
        try {
            class105.field1736 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class105.field1736 = 0;
        }
        class103.field1649 = this.getParameter("settings");
        if (class103.field1649 == null) {
            class103.field1649 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class66.field1111 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class66.field1111 = 0;
            }
        }
        String var6 = this.getParameter("haveie6");
        if (var6 != null && var6.equals("1")) {
            class49.field845 = true;
        } else {
            class49.field845 = false;
        }
        class45.field702 = this;
        this.method267(554, 503, class310.field4990 + 32, (byte) 17, 765);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILhg;II)V")
    public static final void method729(int arg0, class207 arg1, int arg2, int arg3) {
        if (arg1.field3417 == 0) {
            arg1.field3368 = arg1.field3338;
        } else if (arg1.field3417 == 1) {
            arg1.field3368 = (arg0 - arg1.field3484) / 2 + arg1.field3338;
        } else if (arg1.field3417 == 2) {
            arg1.field3368 = arg0 - arg1.field3484 - arg1.field3338;
        } else if (arg1.field3417 == 3) {
            arg1.field3368 = arg1.field3338 * arg0 >> 14;
        } else if (arg1.field3417 == 4) {
            arg1.field3368 = (arg1.field3338 * arg0 >> 14) + (arg0 - arg1.field3484) / 2;
        } else {
            arg1.field3368 = arg0 - (arg1.field3338 * arg0 >> 14) - arg1.field3484;
        }
        field1632++;
        int var4 = -61 % ((arg2 + 53) / 35);
        if (arg1.field3510 == 0) {
            arg1.field3424 = arg1.field3506;
        } else if (arg1.field3510 == 1) {
            arg1.field3424 = (arg3 - arg1.field3481) / 2 + arg1.field3506;
        } else if (arg1.field3510 == 2) {
            arg1.field3424 = arg3 - arg1.field3506 - arg1.field3481;
        } else if (arg1.field3510 == 3) {
            arg1.field3424 = arg1.field3506 * arg3 >> 14;
        } else if (arg1.field3510 == 4) {
            arg1.field3424 = (arg1.field3506 * arg3 >> 14) + (arg3 - arg1.field3481) / 2;
        } else {
            arg1.field3424 = arg3 - (arg1.field3506 * arg3 >> 14) - arg1.field3481;
        }
        if (!class45.field701 || method732(arg1).field371 == 0 && arg1.field3376 != 0) {
            return;
        }
        if (arg1.field3424 < 0) {
            arg1.field3424 = 0;
        } else if (arg1.field3481 + arg1.field3424 > arg3) {
            arg1.field3424 = arg3 - arg1.field3481;
        }
        if (arg1.field3368 < 0) {
            arg1.field3368 = 0;
        } else if (arg0 < (arg1.field3484 + arg1.field3368)) {
            arg1.field3368 = arg0 - arg1.field3484;
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
    public static final void method730() {
        for (int var0 = -1; var0 < class303.field4932 + class154.field2553; var0++) {
            class46 var1;
            long var2;
            if (var0 < 0) {
                var1 = class16.field314;
                var2 = 8791798054912L;
            } else if (var0 < class154.field2553) {
                int var4 = class162.field2627[var0];
                var1 = class15.field300[var4];
                var2 = (long) var4 << 32;
            } else {
                int var5 = class186.field2972[var0 - class154.field2553];
                class307 var6 = class57.field1002[var5];
                var1 = var6;
                var2 = (long) var5 << 32 | 0x20000000L;
                if (!var6.field4960.field943) {
                    var2 |= Long.MIN_VALUE;
                }
            }
            if (var1.field774 >= 0) {
                int var7 = var1.method294((byte) -122);
                if ((var7 & 0x1) == 0) {
                    if ((var1.field715 & 0x7F) == 0 && (var1.field771 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var1.field715 & 0x7F) == 64 && (var1.field771 & 0x7F) == 64) {
                    continue;
                }
                if (var1 instanceof class123 && var1.field810 != null && class275.field4598 >= var1.field744 && class275.field4598 < var1.field709) {
                    ((class123) var1).field2047 = false;
                    var1.field794 = class277.method1939(class182.field2898, var1.field715, var1.field771, (byte) -34);
                    class76.method541(class182.field2898, var1.field715, var1.field771, var1.field794, var1, var1.field753, var2, var1.field809, var1.field779, var1.field718, var1.field802);
                } else {
                    var1.field794 = class277.method1939(class182.field2898, var1.field715, var1.field771, (byte) -34);
                    class115.method885(class182.field2898, var1.field715, var1.field771, var1.field794, (var7 - 1) * 64 + 60, var1, var1.field753, var2, var1.field789);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
    public static final void method731() {
        class265.field4431 = 0;
        for (int var0 = 0; var0 < class303.field4932; var0++) {
            class307 var1 = class57.field1002[class186.field2972[var0]];
            if (var1.field795 && var1.method288(-10420) != -1) {
                int var2 = var1.field715 - (var1.method294((byte) -121) - 1) * 64;
                int var3 = var1.field771 - (var1.method294((byte) -118) - 1) * 64;
                class73 var4 = class64.method436(class182.field2898, var2 >> 7, var3 >> 7);
                if (var4 != null) {
                    long var5 = var4.field1278;
                    int var7 = (int) (var5 >>> 32) & Integer.MAX_VALUE;
                    class46 var8;
                    if ((var5 >>> 29 & 0x3L) == 0L) {
                        var8 = class15.field300[var7];
                    } else {
                        var8 = class57.field1002[var7];
                        var7 += 2048;
                    }
                    if (var8.field786 == -1) {
                        class303.field4934[class265.field4431] = var7;
                        class107.field1751[class265.field4431++] = var7;
                        var8.field786 = 0;
                    }
                    class303.field4934[class265.field4431] = var7;
                    class107.field1751[class265.field4431++] = class186.field2972[var0] + 2048;
                }
            }
        }
        class91.method629(class303.field4934, 83, class265.field4431 - 1, class107.field1751, 0);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lhg;)Ldm;")
    public static final class20 method732(class207 arg0) {
        class20 var1 = (class20) class121.field2021.method987(-121, ((long) arg0.field3405 << 32) + (long) arg0.field3369);
        return var1 == null ? arg0.field3407 : var1;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lhg;)Z")
    public static final boolean method733(class207 arg0) {
        if (class45.field701) {
            if (method732(arg0).field371 != 0) {
                return false;
            }
            if (arg0.field3376 == 0) {
                return false;
            }
        }
        return arg0.field3487;
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
    public static final void method734() {
        for (int var0 = -1; var0 < class303.field4932 + class154.field2553; var0++) {
            class46 var1;
            if (var0 < 0) {
                var1 = class16.field314;
            } else if (var0 < class154.field2553) {
                var1 = class15.field300[class162.field2627[var0]];
            } else {
                var1 = class57.field1002[class186.field2972[var0 - class154.field2553]];
            }
            if (var1.field774 >= 0) {
                int var2 = var1.method294((byte) -117);
                if ((var2 & 0x1) == 0) {
                    if ((var1.field715 & 0x7F) != 0 || (var1.field771 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var1.field715 & 0x7F) != 64 || (var1.field771 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var2 == 1) {
                    int var3 = var1.field715 >> 7;
                    int var4 = var1.field771 >> 7;
                    if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104 && var1.field774 >= class95.field1541[var3][var4]) {
                        if (var1.field774 > class95.field1541[var3][var4]) {
                            class95.field1541[var3][var4] = var1.field774;
                            class294.field4829[var3][var4] = 1;
                        } else {
                            var10002 = class294.field4829[var3][var4]++;
                        }
                    }
                } else {
                    int var5 = var1.field715 - var2 * 64 >> 7;
                    int var6 = var1.field771 - var2 * 64 >> 7;
                    int var7 = var5 + var1.method294((byte) -122);
                    int var8 = var6 + var1.method294((byte) -109);
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    if (var7 > 104) {
                        var7 = 104;
                    }
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    if (var8 > 104) {
                        var8 = 104;
                    }
                    for (int var9 = var5; var9 < var7; var9++) {
                        for (int var10 = var6; var10 < var8; var10++) {
                            if (var1.field774 > class95.field1541[var9][var10]) {
                                class95.field1541[var9][var10] = var1.field774;
                                class294.field4829[var9][var10] = 1;
                            } else if (class95.field1541[var9][var10] == var1.field774) {
                                var10002 = class294.field4829[var9][var10]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method274(byte arg0) {
        field1628++;
        class70.method484((byte) 11);
        class113.field1935 = new class292();
        class277.field4611 = new class215();
        if (class310.field4990 != 0) {
            class68.field1139 = new byte[50][];
        }
        class186.method1349(-128, class142.field2344);
        if (class27.field470 == 0) {
            class57.field998 = this.getCodeBase().getHost();
            class132.field2179 = 443;
            class142.field2346 = 43594;
        } else if (class27.field470 == 1) {
            class57.field998 = this.getCodeBase().getHost();
            class142.field2346 = class67.field1128 + 40000;
            class132.field2179 = class67.field1128 + 50000;
        } else if (class27.field470 == 2) {
            class132.field2179 = class67.field1128 + 50000;
            class57.field998 = "127.0.0.1";
            class142.field2346 = class67.field1128 + 40000;
        }
        class223.field3741 = class132.field2179;
        class146.field2411 = class142.field2346;
        if (class83.field1378 == 3 && class27.field470 != 2) {
            class251.field4250 = class67.field1128;
        }
        if (class43.field659 == 1) {
            class78.field1314 = true;
            class298.field4868 = class237.field3994;
            class293.field4823 = class67.field1115;
            class135.field2231 = class238.field4000;
            class121.field2027 = class310.field4986;
        } else {
            class135.field2231 = field1626;
            class121.field2027 = class200.field3228;
            class298.field4868 = class280.field4648;
            class293.field4823 = class103.field1650;
        }
        class186.field2971 = class57.field998;
        class205.field3286 = class142.field2346;
        class284.field4703 = class263.field4394 = class63.field1068 = class173.field2784 = new short[256];
        class264.field4408 = class205.field3286;
        class47.method298((byte) 118);
        int var2 = 105 / ((21 - arg0) / 61);
        class25.method162(92, class5.field125);
        class80.method558(class5.field125, (byte) 55);
        class5.field128 = class23.method148(true);
        if (class5.field128 != null) {
            class5.field128.method1545(class5.field125, 85);
        }
        class121.field2031 = class83.field1378;
        try {
            if (class142.field2344.field1377 != null) {
                class146.field2397 = new class141(class142.field2344.field1377, 5200, 0);
                for (int var3 = 0; var3 < 29; var3++) {
                    class293.field4805[var3] = new class141(class142.field2344.field1366[var3], 6000, 0);
                }
                class261.field4383 = new class141(class142.field2344.field1370, 6000, 0);
                class58.field1017 = new class27(255, class146.field2397, class261.field4383, 500000);
                class196.field3164 = new class141(class142.field2344.field1371, 24, 0);
                class142.field2344.field1370 = null;
                class142.field2344.field1377 = null;
                class142.field2344.field1371 = null;
                class142.field2344.field1366 = null;
            }
        } catch (IOException var4) {
            class58.field1017 = null;
            class261.field4383 = null;
            class146.field2397 = null;
            class196.field3164 = null;
        }
        if (class43.field659 == 0) {
            class194.field3111 = class84.field1394;
        } else if (class43.field659 == 1) {
            class194.field3111 = class12.field217;
        }
        if (class27.field470 != 0) {
            class121.field2032 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V")
    public final void method261(int arg0) {
        field1633++;
        method725((byte) -22);
        class139.method1026();
        class293.method2025(110);
        class12.method70((byte) 118);
        class148.method1108();
        class205.method1433(-94);
        class238.method1703(-14308);
        class44.method269(true);
        class183.method1333((byte) 85);
        class137.method1014(-36);
        class173.method1279(50);
        class245.method1752((byte) 61);
        class249.method1809((byte) -63);
        class144.method1068((byte) -108);
        class215.method1522(true);
        class292.method2018(25);
        class149.method1110(-20893);
        class151.method1156((byte) -119);
        class141.method1043(true);
        class27.method171(-1070086520);
        class17.method93(-28);
        class307.method2075(-105);
        class91.method637(2);
        class311.method2106(-13);
        class207.method1444(-1);
        class123.method921((byte) -80);
        class49.method314((byte) 48);
        class273.method1924(-11780);
        class132.method988(8241);
        class216.method1544(25);
        class80.method559(-1);
        class58.method371(-1);
        class104.method760((byte) -119);
        class239.method1714(false);
        class284.method1986(-13964);
        if (arg0 >= -101) {
            this.method274((byte) -97);
        }
        class163.method1206(-108);
        class46.method291(true);
        class174.method1282(true);
        class248.method1757(false);
        class54.method339(-1);
        class278.method1945(-108);
        class20.method132((byte) -70);
        class134.method992(-77);
        class65.method454((byte) -74);
        class159.method1188((byte) 93);
        class37.method229(true);
        class31.method195((byte) -88);
        class313.method2123(-119);
        class95.method680(-50);
        class150.method1117(-120);
        class286.method1993(-2);
        class231.method1665(-124);
        class169.method1268((byte) 67);
        class25.method165(true);
        class162.method1199((byte) -40);
        class33.method207((byte) -90);
        class194.method1387(0);
        class70.method481((byte) 97);
        class160.method1191(-1);
        class15.method85((byte) -30);
        class122.method914((byte) 54);
        class310.method2088(10);
        class28.method180(61);
        class1.method15(0);
        class94.method671((byte) -101);
        class111.method829(-88);
        class229.method1621();
        class221.method1569((byte) -111);
        class71.method488(112);
        class112.method862();
        class297.method2042(-92);
        class214.method1517(-1);
        class142.method1056((byte) 72);
        class181.method1315((byte) -127);
        class127.method942((byte) -49);
        class5.method39((byte) -37);
        class250.method1825(-109);
        class165.method1225();
        class233.method1677((byte) -7);
        class272.method1919(-29326);
        class98.method700();
        class200.method1411(-1);
        class206.method1440(110);
        class74.method527();
        class279.method1951((byte) 49);
        class195.method1391(0);
        class19.method117(true);
        class22.method142(195);
        class66.method457((byte) -75);
        class240.method1724((byte) -38);
        class211.method1500();
        class246.method1756((byte) -115);
        class241.method1728((byte) -115);
        class86.method606(-105);
        class42.method246(false);
        class294.method2034(8347);
        class100.method709(126);
        class199.method1407(71);
        class168.method1258(0);
        class11.method65(1);
        class180.method1314((byte) -38);
        class45.method278(120);
        class190.method1371((byte) -84);
        class84.method596(5536);
        class222.method1578(-123);
        class219.method1561(-3);
        class14.method79();
        class57.method365(-3);
        class146.method1076(false);
        class270.method1900((byte) 5);
        class228.method1610((byte) -9);
        class64.method434(-14878);
        class290.method2017(4);
        class56.method363();
        class120.method907((byte) 115);
        class96.method682(0);
        class217.method1550(79);
        class185.method1343(255);
        class107.method802(-16664);
        class176.method1295(21442);
        class101.method715((byte) 125);
        class8.method57();
        class128.method961();
        class16.method88(false);
        class276.method1936(-91);
        class103.method746((byte) -43);
        class140.method1039(16773818);
        class208.method1462((byte) 8);
        class29.method184((byte) 127);
        class301.method2057((byte) -106);
        class131.method978(227);
        class30.method189((byte) -12);
        class303.method2064((byte) -86);
        class87.method612(-2);
        class312.method2111((byte) 79);
        class223.method1583(true);
        class73.method516(true);
        class41.method245(96);
        class184.method1335(-9027);
        class251.method1830((byte) 89);
        class23.method150(-6225);
        class256.method1843((byte) 19);
        class52.method333();
        class196.method1397(-125);
        class26.method167(0);
        class252.method1832();
        class306.method2071((byte) 97);
        class201.method1415(1);
        class62.method426(102);
        class85.method599((byte) -114);
        class232.method1671(-112);
        class36.method222(false);
        class302.method2060(127);
        class253.method1834(false);
        class161.method1194((byte) -125);
        class204.method1422();
        class126.method939((byte) -78);
        class4.method34(11889);
        class51.method330((byte) 85);
        class167.method1251((byte) -118);
        class226.method1599(2047);
        class265.method1873(-42);
        class136.method1007(-782085064);
        class9.method59(-15711);
        class271.method1914((byte) 50);
        class220.method1567(85);
        class55.method351(true);
        class264.method1871(98);
        class187.method1353(-11873);
        class113.method870(0);
        class235.method1684();
        class108.method804((byte) -96);
        class289.method2010(103);
        class105.method790(-89);
        class135.method1003(-17421);
        class147.method1088(5);
        class78.method548(16776960);
        class32.method202(64);
        class268.method1887((byte) -124);
        class157.method1182((byte) -118);
        class48.method308();
        class197.method1402((byte) -11);
        class274.method1928(1);
        class21.method139((byte) -121);
        class237.method1698(0);
        class296.method2038(-46);
        class116.method890(16828);
        class262.method1861();
        class114.method872();
        class280.method1959(7975);
        class213.method1513(false);
        class263.method1866(true);
        class212.method1511();
        class192.method1379();
        class124.method935(1);
        class182.method1325((byte) -73);
        class7.method53(-94);
        class13.method72(59);
        class258.method1846(36);
        class67.method464(-29386);
        class282.method1964((byte) 70);
        class115.method884((byte) -119);
        class69.method475((byte) -79);
        class130.method970(true);
        class119.method897((byte) -120);
        class35.method219(2);
        class121.method913(0);
        class227.method1607(126);
        class234.method1680(-112);
        class287.method1999(65536);
        class158.method1184(-1560301173);
        class90.method628((byte) -105);
        class143.method1060((byte) 117);
        class277.method1940(false);
        class209.method1469(0);
        class203.method1420(false);
        class298.method2044(789221);
        class259.method1853((byte) -127);
        class300.method2052(2048);
        class224.method1590(-128);
        class93.method667(1);
        class166.method1239(true);
        class210.method1471((byte) 87);
        class79.method555(-109);
        class24.method152(93);
        class260.method1858((byte) -22);
        class50.method324(103);
        class179.method1308((byte) 83);
        class97.method683(false);
        class43.method258((byte) -120);
        class109.method814(-71);
        class283.method1972(100);
        class152.method1162(16218);
        class314.method2128((byte) 44);
        class186.method1344((byte) 63);
        class68.method470(-9123);
        class225.method1596(-119);
        class138.method1018(-120);
        class110.method820(-31687);
        class299.method2047(-125);
        class77.method547((byte) 21);
        class88.method617(true);
        class125.method937(-29488);
        class72.method509(-68);
        class3.method28(-16338);
        class171.method1278(26950);
        class61.method424(false);
        class76.method540(0);
        class202.method1419(25908);
        class6.method42(true);
        class261.method1860(127);
        class254.method1837((byte) 124);
        class236.method1695((byte) 0);
        class244.method1749(81);
        class255.method1839(-1);
        class63.method428(true);
        class218.method1555((byte) 112);
        class275.method1932((byte) 115);
        class154.method1173(0);
        class34.method212((byte) 81);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V")
    private final void method735(byte[] arg0, int arg1) {
        int var3 = 41 / ((15 - arg1) / 61);
        class249 var4 = new class249(arg0);
        field1625++;
        while (true) {
            while (true) {
                int var5 = var4.method1802((byte) -96);
                if (var5 == 0) {
                    return;
                }
                if (var5 == 1) {
                    var4.method1821((byte) 51);
                    var4.method1821((byte) 51);
                    var4.method1821((byte) 51);
                    var4.method1821((byte) 51);
                    var4.method1821((byte) 51);
                    var4.method1821((byte) 51);
                } else if (var5 == 4) {
                    int var6 = var4.method1802((byte) -120);
                    class233.field3938 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        class233.field3938[var7] = var4.method1821((byte) 51);
                        if (class233.field3938[var7] == 65535) {
                            class233.field3938[var7] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    private final void method736(boolean arg0) {
        if (arg0) {
            method723();
        }
        field1619++;
        boolean var2 = class277.field4611.method1526((byte) 16);
        if (!var2) {
            this.method727(-12222);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public static final void method737(byte arg0) {
        field1624++;
        for (int var1 = -1; var1 < class154.field2553; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class162.field2627[var1];
            }
            class123 var6 = class15.field300[var5];
            if (var6 != null && var6.field726 > 0) {
                var6.field726--;
                if (var6.field726 == 0) {
                    var6.field746 = null;
                }
            }
        }
        for (int var2 = 0; var2 < class303.field4932; var2++) {
            int var3 = class186.field2972[var2];
            class307 var4 = class57.field1002[var3];
            if (var4 != null && var4.field726 > 0) {
                var4.field726--;
                if (var4.field726 == 0) {
                    var4.field746 = null;
                }
            }
        }
        if (arg0 <= 90) {
            field1617 = -127;
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method738(int arg0) {
        class25.field444 = 0;
        field1623++;
        while (class69.method476(arg0 + 7767) && class25.field444 < 128) {
            class94.field1539[class25.field444] = class155.field2565;
            class4.field120[class25.field444] = class272.field4542;
            class25.field444++;
        }
        if (arg0 != -24456) {
            return;
        }
        class19.field356++;
        if (class243.field4082 != -1) {
            class189.method1367(0, (byte) 9, 0, 0, class182.field2901, class243.field4082, 0, class155.field2567);
        }
        class196.field3162++;
        if (class43.field659 == 0) {
            class313.method2126(8874);
        } else if (class189.field3017 == 0 && class70.field1165 == 0) {
            if (class169.field2739 == 2) {
                class237.method1696(106);
            } else {
                class171.method1276((byte) -112);
            }
            if (class107.field1758 >> 7 < 14 || class107.field1758 >> 7 >= 90 || class76.field1302 >> 7 < 14 || class76.field1302 >> 7 >= 90) {
                class279.method1957(false);
            }
        }
        while (true) {
            class303 var2;
            class207 var3;
            class207 var4;
            do {
                var2 = (class303) class190.field3085.method316(-17);
                if (var2 == null) {
                    while (true) {
                        class303 var5;
                        class207 var6;
                        class207 var7;
                        do {
                            var5 = (class303) class215.field3619.method316(93);
                            if (var5 == null) {
                                while (true) {
                                    class303 var8;
                                    class207 var9;
                                    class207 var10;
                                    do {
                                        var8 = (class303) class300.field4904.method316(104);
                                        if (var8 == null) {
                                            if (class162.field2635 != null) {
                                                class140.method1040(78);
                                            }
                                            if (class220.field3703 != null && class220.field3703.field3091 == 1) {
                                                if (class220.field3703.field3089 != null) {
                                                    class107.method801(class47.field818, (byte) 119, class100.field1595);
                                                }
                                                class220.field3703 = null;
                                                class100.field1595 = null;
                                                class47.field818 = false;
                                            }
                                            if ((class275.field4598 % 1500) == 0) {
                                                class4.method31(arg0 + 36144);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field4931;
                                        if (var9.field3369 < 0) {
                                            break;
                                        }
                                        var10 = class222.method1574(arg0 + 24581, var9.field3465);
                                    } while (var10 == null || var10.field3462 == null || var10.field3462.length <= var9.field3369 || var10.field3462[var9.field3369] != var9);
                                    class269.method1893(arg0 ^ 0x510B, var8);
                                }
                            }
                            var6 = var5.field4931;
                            if (var6.field3369 < 0) {
                                break;
                            }
                            var7 = class222.method1574(112, var6.field3465);
                        } while (var7 == null || var7.field3462 == null || var6.field3369 >= var7.field3462.length || var7.field3462[var6.field3369] != var6);
                        class269.method1893(-3725, var5);
                    }
                }
                var3 = var2.field4931;
                if (var3.field3369 < 0) {
                    break;
                }
                var4 = class222.method1574(104, var3.field3465);
            } while (var4 == null || var4.field3462 == null || var4.field3462.length <= var3.field3369 || var4.field3462[var3.field3369] != var3);
            class269.method1893(-3725, var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "()V")
    public static final void method739() {
        for (int var0 = -1; var0 < class303.field4932 + class154.field2553; var0++) {
            class46 var1;
            long var2;
            if (var0 < 0) {
                var1 = class16.field314;
                var2 = 8791798054912L;
            } else if (var0 < class154.field2553) {
                int var4 = class162.field2627[var0];
                var1 = class15.field300[var4];
                var2 = (long) var4 << 32;
            } else {
                int var5 = class186.field2972[var0 - class154.field2553];
                class307 var6 = class57.field1002[var5];
                var1 = var6;
                var2 = (long) var5 << 32 | 0x20000000L;
                if (!var6.field4960.field943) {
                    var2 |= Long.MIN_VALUE;
                }
            }
            if (var1.field774 < 0) {
                var1.field795 = false;
            } else {
                var1.field786 = -1;
                int var7 = var1.method294((byte) -109);
                if ((var7 & 0x1) == 0) {
                    if ((var1.field715 & 0x7F) != 0 || (var1.field771 & 0x7F) != 0) {
                        var1.field795 = false;
                        continue;
                    }
                } else if ((var1.field715 & 0x7F) != 64 || (var1.field771 & 0x7F) != 64) {
                    var1.field795 = false;
                    continue;
                }
                int var10002;
                if (var7 == 1) {
                    int var8 = var1.field715 >> 7;
                    int var9 = var1.field771 >> 7;
                    if (var8 < 0 || var8 >= 104 || var9 < 0 || var9 >= 104) {
                        var1.field795 = true;
                        continue;
                    }
                    if (class95.field1541[var8][var9] != var1.field774) {
                        var1.field795 = true;
                        continue;
                    }
                    if (class294.field4829[var8][var9] > 1) {
                        var10002 = class294.field4829[var8][var9]--;
                        var1.field795 = true;
                        continue;
                    }
                } else {
                    int var10 = var1.field715 - var7 * 64 >> 7;
                    int var11 = var1.field771 - var7 * 64 >> 7;
                    int var12 = var7 + var10;
                    int var13 = var7 + var11;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var12 > 104) {
                        var12 = 104;
                    }
                    if (var11 < 0) {
                        var11 = 0;
                    }
                    if (var13 > 104) {
                        var13 = 104;
                    }
                    if (!class127.method945(1, var10, var13, var12, var1.field774, var11)) {
                        for (int var14 = var10; var14 < var12; var14++) {
                            for (int var15 = var11; var15 < var13; var15++) {
                                if (class95.field1541[var14][var15] == var1.field774) {
                                    var10002 = class294.field4829[var14][var15]--;
                                }
                            }
                        }
                        var1.field795 = true;
                        continue;
                    }
                }
                if (var1 instanceof class123 && var1.field810 != null && class275.field4598 >= var1.field744 && class275.field4598 < var1.field709) {
                    ((class123) var1).field2047 = false;
                    var1.field795 = false;
                    var1.field794 = class277.method1939(class182.field2898, var1.field715, var1.field771, (byte) -34);
                    class76.method541(class182.field2898, var1.field715, var1.field771, var1.field794, var1, var1.field753, var2, var1.field809, var1.field779, var1.field718, var1.field802);
                } else {
                    var1.field795 = false;
                    var1.field794 = class277.method1939(class182.field2898, var1.field715, var1.field771, (byte) -34);
                    class115.method885(class182.field2898, var1.field715, var1.field771, var1.field794, (var7 - 1) * 64 + 60, var1, var1.field753, var2, var1.field789);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "()V")
    public static final void method740() {
        boolean var0 = class259.field4357 && class154.field2553 > 200 || class154.field2553 > 50;
        for (int var1 = 0; var1 < class154.field2553; var1++) {
            class123 var10 = class15.field300[class162.field2627[var1]];
            var10.field728 = false;
            if (var10.method287((byte) -86)) {
                var10.field2047 = var10.field782 == var10.method282(-1399).field3072 ? var0 : false;
                int var11 = 0;
                if (!var10.field795) {
                    var11++;
                }
                if (var10.field733 > class275.field4598) {
                    var11 += 2;
                }
                int var12 = var11 + (5 - var10.method294((byte) -125) << 2);
                if (class20.field364 == 0) {
                    var12 += 32;
                } else {
                    var12 += 128;
                }
                var12 += 256;
                var10.field774 = var12 + 1;
            } else {
                var10.field774 = -1;
            }
        }
        for (int var2 = 0; var2 < class303.field4932; var2++) {
            class307 var7 = class57.field1002[class186.field2972[var2]];
            var7.field728 = false;
            if (var7.method287((byte) -86) && var7.field4960.method338((byte) -120)) {
                int var8 = 0;
                if (!var7.field795) {
                    var8++;
                }
                if (var7.field733 > class275.field4598) {
                    var8 += 2;
                }
                int var9 = var8 + (5 - var7.method294((byte) -107) << 2);
                if (class20.field364 == 0) {
                    if (var7.field4960.field907) {
                        var9 += 64;
                    } else {
                        var9 += 128;
                    }
                } else if (class20.field364 == 1) {
                    if (var7.field4960.field907) {
                        var9 += 32;
                    } else {
                        var9 += 64;
                    }
                }
                if (var7.field4960.field945) {
                    var9 += 512;
                } else if (!var7.field4960.field957) {
                    var9 += 256;
                }
                var7.field774 = var9 + 1;
            } else {
                var7.field774 = -1;
            }
        }
        for (int var3 = 0; var3 < class250.field4234.length; var3++) {
            class245 var4 = class250.field4234[var3];
            if (var4 != null) {
                if (var4.field4110 == 1) {
                    class307 var5 = class57.field1002[var4.field4111];
                    if (var5 != null && var5.field774 != -1) {
                        var5.field774 += 1024;
                    }
                } else if (var4.field4110 == 10) {
                    class123 var6 = class15.field300[var4.field4111];
                    if (var6 != null && var6.field774 != -1) {
                        var6.field774 += 1024;
                    }
                }
            }
        }
        class16.field314.field774 = Integer.MAX_VALUE;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)V")
    private final void method741(boolean arg0, int arg1) {
        class277.field4611.field3647 = arg1;
        class101.field1612 = null;
        class277.field4611.field3648++;
        if (!arg0) {
            class5.field129 = 0;
            class217.field3666 = null;
            field1618++;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method275(int arg0) {
        if (class101.field1599 != null) {
            class101.field1599.field2779 = false;
        }
        field1620++;
        class101.field1599 = null;
        if (class159.field2609 != null) {
            class159.field2609.method1070(-119);
            class159.field2609 = null;
        }
        class55.method347(false, class5.field125);
        class87.method610(arg0 + 2, class5.field125);
        if (class5.field128 != null) {
            class5.field128.method1542(class5.field125, (byte) 31);
        }
        class179.method1307(-19735);
        class26.method170(0);
        class5.field128 = null;
        if (class95.field1543 != null) {
            class95.field1543.method1718(-1407);
        }
        if (arg0 != -2) {
            this.method741(false, 21);
        }
        if (class272.field4546 != null) {
            class272.field4546.method1718(-1407);
        }
        class277.field4611.method1537((byte) 32);
        class113.field1935.method2022(0);
    }
}
